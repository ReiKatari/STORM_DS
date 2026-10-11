package me.magnum.melonds.translator.engine

import android.content.Context
import android.util.Log
import com.google.mlkit.common.model.DownloadConditions
import com.google.mlkit.common.model.RemoteModelManager
import com.google.mlkit.nl.translate.TranslateLanguage
import com.google.mlkit.nl.translate.TranslateRemoteModel
import com.google.mlkit.nl.translate.Translation
import com.google.mlkit.nl.translate.Translator
import com.google.mlkit.nl.translate.TranslatorOptions
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.async
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlinx.coroutines.withContext
import me.magnum.melonds.R
import java.util.concurrent.ConcurrentHashMap
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException

/**
 * High-Speed 100% Offline Google Neural Machine Translation (NMT) Engine.
 * Powered by Google ML Kit on-device neural models (30-40 MB per language pair).
 * Operates completely offline with sub-25ms inference on modern mobile hardware.
 *
 * Model downloads run in a process-wide background scope (see [prepare]) so they are never
 * aborted by a per-request timeout. With [downloadIfMissing] = false (used as the Google fallback)
 * the engine fails fast when the model is not on the device yet.
 */
class MlKitOnDeviceTranslateEngine(
    private val context: Context? = null,
    private val downloadIfMissing: Boolean = true,
) : ITranslationEngine {

    companion object {
        private const val TAG = "MlKitTranslateEngine"
        private val translatorsCache = ConcurrentHashMap<String, Translator>()
        private val downloads = ConcurrentHashMap<String, Deferred<Boolean>>()
        private val downloadScope = CoroutineScope(SupervisorJob() + Dispatchers.IO)
    }

    override suspend fun prepare(sourceLang: String, targetLang: String) {
        val target = resolveLanguageCode("", targetLang)
        val source = if (normalizeLangCode(sourceLang) == "auto") TranslateLanguage.ENGLISH else resolveLanguageCode("", sourceLang)
        if (source == target) return
        ensureDownloadStarted(source, target)
    }

    override suspend fun translate(text: String, sourceLang: String, targetLang: String): String = withContext(Dispatchers.IO) {
        val cleanText = text.trim()
        if (cleanText.isBlank()) return@withContext text

        val resolvedSource = resolveLanguageCode(cleanText, sourceLang)
        val resolvedTarget = resolveLanguageCode(cleanText, targetLang)

        if (resolvedSource == resolvedTarget) return@withContext cleanText

        val translator = translatorFor(resolvedSource, resolvedTarget)
        val ready = if (downloadIfMissing) {
            ensureDownloadStarted(resolvedSource, resolvedTarget).await()
        } else {
            isPairDownloaded(resolvedSource, resolvedTarget)
        }
        if (!ready) {
            throw TranslationException(
                context?.getString(R.string.translator_error_mlkit_model) ?: "Offline model is not downloaded"
            )
        }

        try {
            val translated = translator.translate(cleanText).await()
            translated.ifBlank { cleanText }
        } catch (t: Throwable) {
            Log.w(TAG, "ML Kit translation error for '$resolvedSource->$resolvedTarget': ${t.message}")
            throw TranslationException(
                context?.getString(R.string.translator_error_mlkit_model) ?: "Offline translation failed", t
            )
        }
    }

    override suspend fun translateBatch(
        texts: List<String>,
        sourceLang: String,
        targetLang: String,
        context: List<String>,
    ): List<String?> {
        // ML Kit translators are single-threaded internally; run sequentially.
        var firstError: TranslationException? = null
        val results = texts.map { text ->
            try {
                translate(text, sourceLang, targetLang)
            } catch (e: TranslationException) {
                if (firstError == null) firstError = e
                null
            }
        }
        val error = firstError
        if (error != null && results.all { it == null }) throw error
        return results
    }

    private fun translatorFor(source: String, target: String): Translator {
        val cacheKey = "$source->$target"
        return translatorsCache.getOrPut(cacheKey) {
            val options = TranslatorOptions.Builder()
                .setSourceLanguage(source)
                .setTargetLanguage(target)
                .build()
            Translation.getClient(options)
        }
    }

    private fun ensureDownloadStarted(source: String, target: String): Deferred<Boolean> {
        val key = "$source->$target"
        downloads[key]?.let { existing ->
            // Retry a failed download on the next request.
            if (!(existing.isCompleted && runCatching { existing.getCompleted() }.getOrDefault(false) == false)) {
                return existing
            }
        }
        val job = downloadScope.async {
            try {
                translatorFor(source, target).downloadModelIfNeeded(DownloadConditions.Builder().build()).await()
                true
            } catch (t: Throwable) {
                Log.w(TAG, "ML Kit model download failed for $key: ${t.message}")
                false
            }
        }
        downloads[key] = job
        return job
    }

    private suspend fun isPairDownloaded(source: String, target: String): Boolean {
        return try {
            val manager = RemoteModelManager.getInstance()
            val src = manager.isModelDownloaded(TranslateRemoteModel.Builder(source).build()).await()
            val dst = manager.isModelDownloaded(TranslateRemoteModel.Builder(target).build()).await()
            src && dst
        } catch (_: Throwable) {
            false
        }
    }

    private fun resolveLanguageCode(text: String, langTag: String): String {
        val tag = langTag.lowercase().trim()
        if (tag == "auto" || tag.isBlank()) {
            val hasKana = text.any { it in '\u3040'..'\u30ff' }
            if (hasKana) return TranslateLanguage.JAPANESE
            val hasHangul = text.any { it in '\uac00'..'\ud7af' || it in '\u1100'..'\u11ff' }
            if (hasHangul) return TranslateLanguage.KOREAN
            val hasHan = text.any { it in '\u4e00'..'\u9fff' }
            if (hasHan) return TranslateLanguage.CHINESE
            val hasCyrillic = text.any { it in '\u0400'..'\u04ff' }
            if (hasCyrillic) return TranslateLanguage.RUSSIAN
            return TranslateLanguage.ENGLISH
        }

        return when {
            tag.startsWith("ja") -> TranslateLanguage.JAPANESE
            tag.startsWith("ru") -> TranslateLanguage.RUSSIAN
            tag.startsWith("en") -> TranslateLanguage.ENGLISH
            tag.startsWith("zh") -> TranslateLanguage.CHINESE
            tag.startsWith("ko") -> TranslateLanguage.KOREAN
            tag.startsWith("de") -> TranslateLanguage.GERMAN
            tag.startsWith("fr") -> TranslateLanguage.FRENCH
            tag.startsWith("es") -> TranslateLanguage.SPANISH
            tag.startsWith("it") -> TranslateLanguage.ITALIAN
            else -> TranslateLanguage.fromLanguageTag(tag) ?: TranslateLanguage.ENGLISH
        }
    }

    private suspend fun <T> com.google.android.gms.tasks.Task<T>.await(): T =
        suspendCancellableCoroutine { continuation ->
            addOnSuccessListener { result ->
                if (continuation.isActive) continuation.resume(result)
            }
            addOnFailureListener { exception ->
                if (continuation.isActive) continuation.resumeWithException(exception)
            }
            addOnCanceledListener {
                if (continuation.isActive) continuation.cancel()
            }
        }
}

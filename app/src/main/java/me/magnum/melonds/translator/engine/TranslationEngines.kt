package me.magnum.melonds.translator.engine

import android.content.Context
import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.cancelChildren
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.joinAll
import kotlinx.coroutines.launch
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlinx.coroutines.withContext
import me.magnum.melonds.R
import okhttp3.Call
import okhttp3.Callback
import okhttp3.FormBody
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import okhttp3.Response
import org.json.JSONArray
import org.json.JSONObject
import org.json.JSONTokener
import java.io.IOException
import java.net.URLEncoder
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException

/**
 * Raised by engines instead of returning error strings as "translations".
 * [userMessage] is already localized and safe to show in a toast.
 */
class TranslationException(
    val userMessage: String,
    cause: Throwable? = null,
) : Exception(userMessage, cause)

interface ITranslationEngine {
    /** Translates a single text. Throws [TranslationException] on failure. */
    suspend fun translate(text: String, sourceLang: String, targetLang: String): String

    /**
     * Translates all texts of a frame at once. Returns one entry per input; `null` means that item failed.
     * Throws [TranslationException] when nothing could be translated.
     * [context] contains recent dialogue lines ("source => translation") for engines that can use it.
     */
    suspend fun translateBatch(
        texts: List<String>,
        sourceLang: String,
        targetLang: String,
        context: List<String> = emptyList(),
    ): List<String?> = coroutineScope {
        var firstError: TranslationException? = null
        val results = texts.map { text ->
            async {
                try {
                    translate(text, sourceLang, targetLang)
                } catch (e: TranslationException) {
                    if (firstError == null) firstError = e
                    null
                }
            }
        }.awaitAll()
        val error = firstError
        if (error != null && results.all { it == null }) throw error
        results
    }

    /** Optional warm-up (e.g. offline model download). Never called inside a per-request timeout. */
    suspend fun prepare(sourceLang: String, targetLang: String) {}
}

internal data class HttpResult(val code: Int, val body: String)

/** Cancellable OkHttp call: cancelling the coroutine cancels the socket (needed for endpoint races). */
internal suspend fun OkHttpClient.executeAsync(request: Request): HttpResult = suspendCancellableCoroutine { cont ->
    val call = newCall(request)
    cont.invokeOnCancellation { runCatching { call.cancel() } }
    call.enqueue(object : Callback {
        override fun onFailure(call: Call, e: IOException) {
            if (cont.isActive) cont.resumeWithException(e)
        }

        override fun onResponse(call: Call, response: Response) {
            val result = try {
                response.use { HttpResult(it.code, it.body?.string().orEmpty()) }
            } catch (t: Throwable) {
                if (cont.isActive) cont.resumeWithException(t)
                return
            }
            if (cont.isActive) cont.resume(result)
        }
    })
}

internal fun String.hasLetters(): Boolean = any { it.isLetter() }

internal fun String.hasCyrillic(): Boolean = any { it in '\u0400'..'\u04FF' }

internal fun normalizeLangCode(lang: String): String = when (val l = lang.lowercase().trim()) {
    "", "auto" -> "auto"
    "japanese" -> "ja"
    "english" -> "en"
    "chinese", "zh-cn", "zh_cn", "zh-hans" -> "zh"
    "korean" -> "ko"
    "german" -> "de"
    "french" -> "fr"
    "spanish" -> "es"
    "italian" -> "it"
    "russian" -> "ru"
    else -> l.take(5)
}

internal fun languageDisplayName(code: String): String = when (normalizeLangCode(code).take(2)) {
    "ru" -> "Russian"
    "en" -> "English"
    "ja" -> "Japanese"
    "zh" -> "Simplified Chinese"
    "ko" -> "Korean"
    "de" -> "German"
    "fr" -> "French"
    "es" -> "Spanish"
    "it" -> "Italian"
    "pt" -> "Portuguese"
    "au" -> "the detected source language"
    else -> code
}

/**
 * High-speed Google Translate engine.
 * All public Google endpoints are raced in parallel and the first non-empty answer wins.
 * A frame is translated in one request (paragraphs joined with "\n" and split back).
 */
class GoogleTranslateEngine(
    private val client: OkHttpClient,
    private val fallbackOffline: ITranslationEngine? = null,
    private val context: Context? = null,
) : ITranslationEngine {

    companion object {
        private const val UA_DESKTOP = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36"
        private const val UA_ANDROID = "AndroidTranslate/6.20.0.RC04.379010047"
        private const val ENDPOINT_COUNT = 3
        private const val MAX_GET_QUERY = 3500
    }

    override suspend fun translate(text: String, sourceLang: String, targetLang: String): String {
        return translateBatch(listOf(text), sourceLang, targetLang).firstOrNull()
            ?: throw TranslationException(networkError())
    }

    override suspend fun translateBatch(
        texts: List<String>,
        sourceLang: String,
        targetLang: String,
        context: List<String>,
    ): List<String?> = withContext(Dispatchers.IO) {
        val sl = normalizeLangCode(sourceLang)
        val tl = normalizeLangCode(targetLang).let { if (it == "auto") "ru" else it }
        val results = arrayOfNulls<String>(texts.size)
        val pending = mutableListOf<Int>()
        texts.forEachIndexed { i, raw ->
            val clean = raw.replace('\n', ' ').trim()
            when {
                clean.isBlank() || !clean.hasLetters() -> results[i] = clean
                clean.hasCyrillic() && tl == "ru" -> results[i] = clean
                else -> pending += i
            }
        }
        if (pending.isEmpty()) return@withContext results.toList()

        val cleanPending = pending.map { texts[it].replace('\n', ' ').trim() }
        val joined = cleanPending.joinToString("\n")
        val raced = race(joined, sl, tl)
        if (raced != null) {
            val parts = raced.split('\n').map { it.trim() }.let { list ->
                // Drop trailing empty segments produced by a trailing newline.
                list.dropLastWhile { it.isEmpty() }
            }
            if (parts.size == pending.size && parts.none { it.isEmpty() }) {
                pending.forEachIndexed { k, idx -> results[idx] = parts[k] }
                return@withContext results.toList()
            }
            // Line count mismatch: translate the paragraphs individually (still raced, in parallel).
            if (pending.size == 1) {
                results[pending[0]] = raced.replace('\n', ' ').trim()
                return@withContext results.toList()
            }
            val singles = coroutineScope {
                cleanPending.map { q -> async { race(q, sl, tl)?.replace('\n', ' ')?.trim() } }.awaitAll()
            }
            pending.forEachIndexed { k, idx -> results[idx] = singles[k] }
            if (singles.any { it != null }) return@withContext results.toList()
        }

        // Network failure: fall back to the on-device model if it is already available.
        if (fallbackOffline != null) {
            val offline = try {
                fallbackOffline.translateBatch(cleanPending, sourceLang, targetLang, context)
            } catch (_: TranslationException) {
                null
            }
            if (offline != null && offline.any { it != null }) {
                pending.forEachIndexed { k, idx -> results[idx] = offline[k] }
                return@withContext results.toList()
            }
        }
        throw TranslationException(networkError())
    }

    private fun networkError(): String =
        context?.getString(R.string.translator_error_network) ?: "Network error"

    /** Runs all endpoints at once; returns the first non-empty translation or null if all failed. */
    private suspend fun race(q: String, sl: String, tl: String): String? = coroutineScope {
        val winner = CompletableDeferred<String?>()
        val jobs = (0 until ENDPOINT_COUNT).map { index ->
            launch {
                val r = try {
                    requestEndpoint(index, q, sl, tl)
                } catch (_: Throwable) {
                    null
                }
                if (!r.isNullOrBlank()) winner.complete(r)
            }
        }
        launch {
            jobs.joinAll()
            winner.complete(null)
        }
        val result = winner.await()
        coroutineContext.cancelChildren()
        result
    }

    private suspend fun requestEndpoint(index: Int, q: String, sl: String, tl: String): String? {
        val encoded = URLEncoder.encode(q, "UTF-8").replace("+", "%20")
        val request = when (index) {
            0 -> {
                if (encoded.length > MAX_GET_QUERY) return null
                Request.Builder()
                    .url("https://clients5.google.com/translate_a/t?client=dict-chrome-ex&sl=$sl&tl=$tl&q=$encoded")
                    .header("User-Agent", UA_DESKTOP)
                    .header("Accept", "*/*")
                    .build()
            }
            1 -> {
                val base = "https://translate.googleapis.com/translate_a/single?client=gtx&sl=$sl&tl=$tl&dt=t"
                if (encoded.length > MAX_GET_QUERY) {
                    Request.Builder().url(base)
                        .header("User-Agent", UA_DESKTOP)
                        .post(FormBody.Builder().add("q", q).build())
                        .build()
                } else {
                    Request.Builder().url("$base&q=$encoded")
                        .header("User-Agent", UA_DESKTOP)
                        .header("Accept", "*/*")
                        .build()
                }
            }
            else -> {
                val base = "https://translate.google.com/translate_a/single?client=at&sl=$sl&tl=$tl&dt=t"
                if (encoded.length > MAX_GET_QUERY) {
                    Request.Builder().url(base)
                        .header("User-Agent", UA_ANDROID)
                        .post(FormBody.Builder().add("q", q).build())
                        .build()
                } else {
                    Request.Builder().url("$base&q=$encoded")
                        .header("User-Agent", UA_ANDROID)
                        .header("Accept", "*/*")
                        .build()
                }
            }
        }
        val response = client.executeAsync(request)
        if (response.code !in 200..299) return null
        return parseGoogleResponse(response.body).takeIf { it.isNotBlank() }
    }

    private fun parseGoogleResponse(body: String): String {
        val trimmed = body.trim()
        if (trimmed.isEmpty()) return ""
        return try {
            when (val root = JSONTokener(trimmed).nextValue()) {
                is String -> root.trim()
                is JSONArray -> extractFromArray(root).trim()
                else -> ""
            }
        } catch (_: Throwable) {
            ""
        }
    }

    private fun extractFromArray(arr: JSONArray): String {
        val sb = StringBuilder()
        for (i in 0 until arr.length()) {
            val item = arr.opt(i) ?: continue
            when (item) {
                is String -> {
                    // 1D format: ["translatedText", "en"]
                    if (i == 0) sb.append(item)
                    break
                }
                is JSONArray -> {
                    when (val first = item.opt(0)) {
                        is String -> {
                            // 2D format: [["translatedText", "en"]]
                            if (first.isNotBlank()) sb.append(first)
                        }
                        is JSONArray -> {
                            // 3D format: [[["sentence 1", "orig 1", ...], ["sentence 2", ...]], null, "en"]
                            for (s in 0 until item.length()) {
                                val sentence = item.optJSONArray(s)
                                val transPart = sentence?.opt(0) as? String
                                if (!transPart.isNullOrEmpty()) {
                                    sb.append(transPart)
                                }
                            }
                            break
                        }
                    }
                }
            }
        }
        return sb.toString()
    }
}

/**
 * DeepL Neural Translation Engine (Official DeepL API with free and pro support).
 * Sends every paragraph of a frame in one request using the `text[]` array.
 */
class DeepLEngine(
    private val client: OkHttpClient,
    private val context: Context? = null,
    private val apiKeyProvider: () -> String
) : ITranslationEngine {

    override suspend fun translate(text: String, sourceLang: String, targetLang: String): String {
        return translateBatch(listOf(text), sourceLang, targetLang).firstOrNull()
            ?: throw TranslationException(httpError(0))
    }

    override suspend fun translateBatch(
        texts: List<String>,
        sourceLang: String,
        targetLang: String,
        context: List<String>,
    ): List<String?> = withContext(Dispatchers.IO) {
        val apiKey = apiKeyProvider().trim()
        if (apiKey.isEmpty()) {
            throw TranslationException(
                this@DeepLEngine.context?.getString(R.string.translator_error_deepl_key_missing)
                    ?: "DeepL API key is missing"
            )
        }
        val clean = texts.map { it.replace('\n', ' ').trim() }
        val pending = clean.indices.filter { clean[it].hasLetters() }
        val results = arrayOfNulls<String>(texts.size)
        clean.indices.filter { it !in pending }.forEach { results[it] = clean[it] }
        if (pending.isEmpty()) return@withContext results.toList()

        val isFreeApi = apiKey.endsWith(":fx")
        val endpoint = if (isFreeApi) "https://api-free.deepl.com/v2/translate" else "https://api.deepl.com/v2/translate"
        val tl = normalizeLangCode(targetLang).uppercase().let {
            when (it) {
                "EN" -> "EN-US"
                "PT" -> "PT-BR"
                "AUTO" -> "RU"
                else -> it
            }
        }
        val sl = normalizeLangCode(sourceLang)

        val json = JSONObject().apply {
            put("text", JSONArray().apply { pending.forEach { put(clean[it]) } })
            put("target_lang", tl)
            if (sl != "auto") put("source_lang", sl.take(2).uppercase())
            if (context.isNotEmpty()) put("context", context.joinToString("\n"))
        }

        val request = Request.Builder()
            .url(endpoint)
            .header("Authorization", "DeepL-Auth-Key $apiKey")
            .post(json.toString().toRequestBody("application/json".toMediaType()))
            .build()

        val response = try {
            client.executeAsync(request)
        } catch (e: IOException) {
            throw TranslationException(
                this@DeepLEngine.context?.getString(R.string.translator_error_network) ?: "Network error", e
            )
        }
        if (response.code !in 200..299) throw TranslationException(httpError(response.code))
        val translations = try {
            JSONObject(response.body).optJSONArray("translations")
        } catch (t: Throwable) {
            null
        } ?: throw TranslationException(httpError(response.code))

        pending.forEachIndexed { k, idx ->
            results[idx] = translations.optJSONObject(k)?.optString("text")?.takeIf { it.isNotBlank() }
        }
        results.toList()
    }

    private fun httpError(code: Int): String =
        context?.getString(R.string.translator_error_http, "DeepL", code) ?: "DeepL: HTTP $code"
}

/**
 * Custom AI Translation Engine (OpenAI / Claude / DeepSeek via OpenAI-compatible endpoint).
 * A frame is sent as a JSON array together with the last dialogue lines as context.
 */
class CustomAiEngine(
    private val client: OkHttpClient,
    private val context: Context? = null,
    private val apiKeyProvider: () -> String,
    private val endpointProvider: () -> String = { "https://api.openai.com/v1/chat/completions" },
    private val modelProvider: () -> String = { "gpt-4o-mini" }
) : ITranslationEngine {

    override suspend fun translate(text: String, sourceLang: String, targetLang: String): String {
        return translateBatch(listOf(text), sourceLang, targetLang).firstOrNull()
            ?: throw TranslationException(httpError(0))
    }

    override suspend fun translateBatch(
        texts: List<String>,
        sourceLang: String,
        targetLang: String,
        context: List<String>,
    ): List<String?> = withContext(Dispatchers.IO) {
        val apiKey = apiKeyProvider().trim()
        if (apiKey.isEmpty()) {
            throw TranslationException(
                this@CustomAiEngine.context?.getString(R.string.translator_error_ai_key_missing)
                    ?: "AI API key is missing"
            )
        }
        val clean = texts.map { it.replace('\n', ' ').trim() }
        val pending = clean.indices.filter { clean[it].hasLetters() }
        val results = arrayOfNulls<String>(texts.size)
        clean.indices.filter { it !in pending }.forEach { results[it] = clean[it] }
        if (pending.isEmpty()) return@withContext results.toList()

        val target = languageDisplayName(targetLang)
        val source = languageDisplayName(sourceLang)
        val systemPrompt = buildString {
            append("You are a professional video game localizer for Nintendo DS games. ")
            append("Translate every string of the JSON array from $source into natural, immersive $target. ")
            append("Keep character names, item names and terminology consistent with the context. ")
            append("Keep it short enough to fit the original text box. ")
            append("Answer ONLY with a JSON array of ${pending.size} translated strings in the same order, without notes.")
        }
        val userContent = buildString {
            if (context.isNotEmpty()) {
                append("Previous dialogue (context/glossary, do not translate):\n")
                context.takeLast(6).forEach { append("- ").append(it).append('\n') }
                append('\n')
            }
            append("Strings:\n")
            append(JSONArray().apply { pending.forEach { put(clean[it]) } }.toString())
        }

        val content = chat(apiKey, systemPrompt, userContent)
        val parsed = parseJsonArray(content)
        if (parsed != null && parsed.size == pending.size) {
            pending.forEachIndexed { k, idx -> results[idx] = parsed[k].takeIf { it.isNotBlank() } }
            return@withContext results.toList()
        }
        if (pending.size == 1 && content.isNotBlank()) {
            results[pending[0]] = content.trim().removeSurrounding("\"")
            return@withContext results.toList()
        }
        // Model ignored the array format: translate one by one in parallel.
        val singlePrompt = "You are a professional video game localizer. Translate the in-game text into natural $target. Output ONLY the translation."
        val singles = coroutineScope {
            pending.map { idx ->
                async {
                    try {
                        chat(apiKey, singlePrompt, clean[idx]).trim().takeIf { it.isNotBlank() }
                    } catch (_: TranslationException) {
                        null
                    }
                }
            }.awaitAll()
        }
        pending.forEachIndexed { k, idx -> results[idx] = singles[k] }
        if (singles.all { it == null }) throw TranslationException(httpError(0))
        results.toList()
    }

    private suspend fun chat(apiKey: String, systemPrompt: String, userContent: String): String {
        val endpoint = endpointProvider().ifBlank { "https://api.openai.com/v1/chat/completions" }
        val model = modelProvider().ifBlank { "gpt-4o-mini" }
        val json = JSONObject().apply {
            put("model", model)
            put("messages", JSONArray().apply {
                put(JSONObject().apply {
                    put("role", "system")
                    put("content", systemPrompt)
                })
                put(JSONObject().apply {
                    put("role", "user")
                    put("content", userContent)
                })
            })
            put("temperature", 0.2)
        }
        val request = Request.Builder()
            .url(endpoint)
            .header("Authorization", "Bearer $apiKey")
            .post(json.toString().toRequestBody("application/json".toMediaType()))
            .build()
        val response = try {
            client.executeAsync(request)
        } catch (e: IOException) {
            throw TranslationException(context?.getString(R.string.translator_error_network) ?: "Network error", e)
        }
        if (response.code !in 200..299) throw TranslationException(httpError(response.code))
        return try {
            JSONObject(response.body).optJSONArray("choices")
                ?.optJSONObject(0)?.optJSONObject("message")?.optString("content")?.trim().orEmpty()
        } catch (_: Throwable) {
            ""
        }
    }

    private fun parseJsonArray(content: String): List<String>? {
        val start = content.indexOf('[')
        val end = content.lastIndexOf(']')
        if (start < 0 || end <= start) return null
        return try {
            val arr = JSONArray(content.substring(start, end + 1))
            (0 until arr.length()).map { arr.optString(it).trim() }
        } catch (_: Throwable) {
            null
        }
    }

    private fun httpError(code: Int): String =
        context?.getString(R.string.translator_error_http, "AI", code) ?: "AI: HTTP $code"
}

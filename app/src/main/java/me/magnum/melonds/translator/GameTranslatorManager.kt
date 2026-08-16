package me.magnum.melonds.translator

import android.app.Activity
import android.content.Context
import android.content.SharedPreferences
import android.graphics.Bitmap
import android.os.Handler
import android.os.Looper
import android.view.PixelCopy
import android.view.SurfaceView
import android.view.View
import android.widget.Toast
import androidx.preference.PreferenceManager
import kotlinx.coroutines.*
import me.magnum.melonds.R
import me.magnum.melonds.translator.engine.*
import me.magnum.melonds.translator.model.TranslatorEngineType
import me.magnum.melonds.translator.model.TranslatorOverlayStyle
import me.magnum.melonds.translator.model.TranslatorTriggerMode
import me.magnum.melonds.translator.ocr.GameTextRecognizer
import me.magnum.melonds.translator.ui.GameTranslationOverlayView
import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit

class GameTranslatorManager(
    private val activity: Activity,
    private val surfaceProvider: () -> SurfaceView?,
    private val screenshotProvider: (suspend () -> Bitmap?)? = null,
    private val onPauseEmulator: () -> Unit,
    private val onResumeEmulator: () -> Unit
) {
    companion object {
        const val PREF_TRANSLATOR_ENABLED = "translator_enabled"
        const val PREF_TRANSLATOR_ENGINE = "translator_engine"
        const val PREF_TRANSLATOR_SOURCE_LANG = "translator_source_lang"
        const val PREF_TRANSLATOR_TARGET_LANG = "translator_target_lang"
        const val PREF_TRANSLATOR_TRIGGER_MODE = "translator_trigger_mode"
        const val PREF_TRANSLATOR_PAUSE_ON_TRANSLATE = "translator_pause_on_translate"
        const val PREF_TRANSLATOR_OVERLAY_STYLE = "translator_overlay_style"
        const val PREF_TRANSLATOR_BUBBLE_OPACITY = "translator_bubble_opacity"
        const val PREF_TRANSLATOR_FONT_SIZE_SCALE = "translator_font_size_scale"
        const val PREF_TRANSLATOR_SHOW_FLOATING_BUTTON = "translator_show_floating_button"
        const val PREF_TRANSLATOR_SAVED_REGIONS = "translator_saved_regions"
        const val PREF_TRANSLATOR_DEEPL_KEY = "translator_deepl_key"
        const val PREF_TRANSLATOR_CUSTOM_AI_KEY = "translator_custom_ai_key"
        const val PREF_TRANSLATOR_CUSTOM_AI_ENDPOINT = "translator_custom_ai_endpoint"
        const val PREF_TRANSLATOR_CUSTOM_AI_MODEL = "translator_custom_ai_model"
    }

    private val preferences: SharedPreferences = PreferenceManager.getDefaultSharedPreferences(activity)
    private val okHttpClient = OkHttpClient.Builder()
        .connectTimeout(10, TimeUnit.SECONDS)
        .readTimeout(15, TimeUnit.SECONDS)
        .build()

    private val textRecognizer = GameTextRecognizer()
    private val mediaProjectionCapturer = me.magnum.melonds.translator.capture.MediaProjectionCapturer(activity)
    private val mainScope = CoroutineScope(Dispatchers.Main + SupervisorJob())
    private val mainHandler = Handler(Looper.getMainLooper())

    private var overlayView: GameTranslationOverlayView? = null
    private var autoTranslateJob: Job? = null
    private var isPausedByTranslator = false
    private var pendingTranslateAfterPermission = false

    var requestMediaProjectionPermission: ((android.content.Intent) -> Unit)? = null

    // Cache of recent translations to avoid redundant API hits
    private val translationCache = mutableMapOf<String, String>()

    val isEnabled: Boolean
        get() = preferences.getBoolean(PREF_TRANSLATOR_ENABLED, false)

    fun attachOverlay(overlay: GameTranslationOverlayView) {
        overlayView = overlay
        syncOverlaySettings()

        overlay.onTriggerTranslationRequested = {
            triggerTranslation()
        }
        overlay.onDismissRequested = {
            dismissTranslation()
        }
        overlay.onRegionsSaved = { newRegions ->
            val json = me.magnum.melonds.translator.model.TranslationRegion.listToJson(newRegions)
            preferences.edit().putString(PREF_TRANSLATOR_SAVED_REGIONS, json).apply()
            Toast.makeText(
                activity,
                activity.getString(R.string.translator_regions_saved_toast, newRegions.size),
                Toast.LENGTH_SHORT
            ).show()
        }

        if (isEnabled) {
            overlay.visibility = View.VISIBLE
            startAutoTranslateIfEnabled()
        } else {
            overlay.visibility = View.GONE
            stopAutoTranslate()
        }
    }

    fun openRegionEditor() {
        overlayView?.enterRegionEditMode()
    }

    fun syncOverlaySettings() {
        val overlay = overlayView ?: return
        val enabled = isEnabled
        overlay.visibility = if (enabled) View.VISIBLE else View.GONE
        overlay.showFloatingButton = enabled && preferences.getBoolean(PREF_TRANSLATOR_SHOW_FLOATING_BUTTON, true)
        overlay.overlayStyle = TranslatorOverlayStyle.fromPreference(preferences.getString(PREF_TRANSLATOR_OVERLAY_STYLE, "smart_background_match"))
        overlay.bubbleOpacity = preferences.getInt(PREF_TRANSLATOR_BUBBLE_OPACITY, 90) / 100f
        overlay.fontSizeScale = preferences.getInt(PREF_TRANSLATOR_FONT_SIZE_SCALE, 100) / 100f

        val savedRegionsJson = preferences.getString(PREF_TRANSLATOR_SAVED_REGIONS, null)
        val regions = me.magnum.melonds.translator.model.TranslationRegion.listFromJson(savedRegionsJson)
        overlay.setSavedRegions(regions)

        if (enabled) {
            startAutoTranslateIfEnabled()
        } else {
            stopAutoTranslate()
            overlay.clearTranslations()
        }
    }

    fun triggerTranslation() {
        if (!isEnabled) {
            Toast.makeText(activity, R.string.translator_disabled_hint, Toast.LENGTH_SHORT).show()
            return
        }

        // Toggle: if currently showing translations or in translation mode, dismiss and unpause!
        if (overlayView?.hasActiveTranslations() == true || overlayView?.isTranslating == true) {
            dismissTranslation()
            return
        }

        overlayView?.isTranslating = true

        mainScope.launch {
            val pauseOnTranslate = preferences.getBoolean(PREF_TRANSLATOR_PAUSE_ON_TRANSLATE, true)

            var capturedBitmap: Bitmap? = null

            // Priority 1: Direct native frame buffer
            try {
                withTimeoutOrNull(300) {
                    capturedBitmap = screenshotProvider?.invoke()
                }
            } catch (e: Throwable) {
                capturedBitmap = null
            }

            // Priority 2: MediaProjection (hardware-composited display output)
            if (capturedBitmap == null) {
                if (mediaProjectionCapturer.hasPermission) {
                    capturedBitmap = mediaProjectionCapturer.captureScreen()
                } else if (requestMediaProjectionPermission != null) {
                    pendingTranslateAfterPermission = true
                    overlayView?.isTranslating = false
                    try {
                        requestMediaProjectionPermission?.invoke(mediaProjectionCapturer.createCaptureIntent())
                    } catch (t: Throwable) {
                        t.printStackTrace()
                    }
                    return@launch
                }
            }

            // Priority 3: PixelCopy from SurfaceView or Window
            if (capturedBitmap == null) {
                capturedBitmap = captureViaPixelCopy()
            }

            // Step 2: Now that frame is captured, pause emulator if requested
            if (pauseOnTranslate) {
                isPausedByTranslator = true
                try {
                    onPauseEmulator()
                } catch (e: Throwable) {
                    // Ignore pause failure
                }
            }

            if (capturedBitmap != null) {
                processCapturedFrame(capturedBitmap!!)
            } else {
                overlayView?.isTranslating = false
                if (isPausedByTranslator) {
                    isPausedByTranslator = false
                    try {
                        onResumeEmulator()
                    } catch (e: Throwable) {
                    }
                }
                Toast.makeText(activity, R.string.translator_capture_failed, Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun onMediaProjectionResult(resultCode: Int, data: android.content.Intent?) {
        mediaProjectionCapturer.setPermissionResult(resultCode, data)
        if (resultCode == Activity.RESULT_OK && data != null && pendingTranslateAfterPermission) {
            pendingTranslateAfterPermission = false
            triggerTranslation()
        }
    }

    private suspend fun captureViaPixelCopy(): Bitmap? = withContext(Dispatchers.Main) {
        val surfaceView = surfaceProvider()
        val decorView = activity.window.decorView
        val decorW = decorView.width.coerceAtLeast(1)
        val decorH = decorView.height.coerceAtLeast(1)

        // Tier 1: Try PixelCopy from SurfaceView if valid
        if (surfaceView != null && surfaceView.holder.surface.isValid && surfaceView.width > 0 && surfaceView.height > 0) {
            val surfaceBitmap = Bitmap.createBitmap(surfaceView.width, surfaceView.height, Bitmap.Config.ARGB_8888)
            val result = withTimeoutOrNull(400) {
                suspendCancellableCoroutine<Bitmap?> { continuation ->
                    val onCopyFinished = PixelCopy.OnPixelCopyFinishedListener { copyResult ->
                        if (copyResult == PixelCopy.SUCCESS) {
                            if (continuation.isActive) continuation.resume(surfaceBitmap, onCancellation = null)
                        } else {
                            if (continuation.isActive) continuation.resume(null, onCancellation = null)
                        }
                    }
                    try {
                        PixelCopy.request(surfaceView, surfaceBitmap, onCopyFinished, mainHandler)
                    } catch (t: Throwable) {
                        if (continuation.isActive) continuation.resume(null, onCancellation = null)
                    }
                }
            }
            if (result != null) return@withContext result
        }

        // Tier 2: Try PixelCopy from full Window
        val windowBitmap = Bitmap.createBitmap(decorW, decorH, Bitmap.Config.ARGB_8888)
        val windowResult = withTimeoutOrNull(400) {
            suspendCancellableCoroutine<Bitmap?> { continuation ->
                val onCopyFinished = PixelCopy.OnPixelCopyFinishedListener { copyResult ->
                    if (copyResult == PixelCopy.SUCCESS) {
                        if (continuation.isActive) continuation.resume(windowBitmap, onCancellation = null)
                    } else {
                        if (continuation.isActive) continuation.resume(null, onCancellation = null)
                    }
                }
                try {
                    val rect = android.graphics.Rect(0, 0, decorW, decorH)
                    PixelCopy.request(activity.window, rect, windowBitmap, onCopyFinished, mainHandler)
                } catch (t: Throwable) {
                    if (continuation.isActive) continuation.resume(null, onCancellation = null)
                }
            }
        }
        if (windowResult != null) return@withContext windowResult

        null
    }

    fun dismissTranslation() {
        overlayView?.clearTranslations()
        overlayView?.isTranslating = false
        if (isPausedByTranslator) {
            isPausedByTranslator = false
            try {
                onResumeEmulator()
            } catch (e: Throwable) {
                // Ignore resume failure
            }
        }
    }

    private fun processCapturedFrame(bitmap: Bitmap) {
        mainScope.launch {
            try {
                val sourceLang = preferences.getString(PREF_TRANSLATOR_SOURCE_LANG, "auto") ?: "auto"
                val targetLang = preferences.getString(PREF_TRANSLATOR_TARGET_LANG, "ru") ?: "ru"

                val savedRegionsJson = preferences.getString(PREF_TRANSLATOR_SAVED_REGIONS, null)
                val customRegions = me.magnum.melonds.translator.model.TranslationRegion.listFromJson(savedRegionsJson)

                var blocks = withTimeoutOrNull(6000) {
                    textRecognizer.recognizeTextBlocks(bitmap, sourceLang, customRegions)
                } ?: emptyList()

                // Fallback to full screen if custom regions returned nothing
                if (blocks.isEmpty() && customRegions.isNotEmpty()) {
                    blocks = withTimeoutOrNull(6000) {
                        textRecognizer.recognizeTextBlocks(bitmap, sourceLang, emptyList())
                    } ?: emptyList()
                }

                if (blocks.isEmpty()) {
                    overlayView?.clearTranslations()
                    overlayView?.isTranslating = false
                    if (isPausedByTranslator) {
                        isPausedByTranslator = false
                        try {
                            onResumeEmulator()
                        } catch (e: Throwable) {
                        }
                    }
                    Toast.makeText(activity, R.string.translator_no_text_found, Toast.LENGTH_SHORT).show()
                    return@launch
                }

                val engine = getActiveTranslationEngine()

                // Translate blocks in parallel with timeout
                withTimeoutOrNull(8000) {
                    coroutineScope {
                        blocks.map { block ->
                            async(Dispatchers.IO) {
                                val cacheKey = "${block.originalText}|$sourceLang|$targetLang"
                                val cached = translationCache[cacheKey]
                                if (cached != null) {
                                    block.translatedText = cached
                                } else {
                                    val translated = try {
                                        withTimeoutOrNull(5000) {
                                            engine.translate(block.originalText, sourceLang, targetLang)
                                        } ?: block.originalText
                                    } catch (e: Exception) {
                                        block.originalText
                                    }
                                    translationCache[cacheKey] = translated
                                    block.translatedText = translated
                                }
                            }
                        }.awaitAll()
                    }
                }

                overlayView?.setTranslatedBlocks(blocks)
            } catch (t: Throwable) {
                t.printStackTrace()
                Toast.makeText(activity, R.string.translator_no_text_found, Toast.LENGTH_SHORT).show()
                if (isPausedByTranslator) {
                    isPausedByTranslator = false
                    try {
                        onResumeEmulator()
                    } catch (e: Throwable) {
                    }
                }
            } finally {
                overlayView?.isTranslating = false
            }
        }
    }

    private fun getActiveTranslationEngine(): ITranslationEngine {
        val type = TranslatorEngineType.fromPreference(preferences.getString(PREF_TRANSLATOR_ENGINE, "google"))
        return when (type) {
            TranslatorEngineType.GOOGLE -> GoogleTranslateEngine(okHttpClient)
            TranslatorEngineType.DEEPL -> DeepLEngine(okHttpClient) {
                preferences.getString(PREF_TRANSLATOR_DEEPL_KEY, "").orEmpty()
            }
            TranslatorEngineType.LIBRE -> LibreTranslateEngine(okHttpClient)
            TranslatorEngineType.MYMEMORY -> MyMemoryEngine(okHttpClient)
            TranslatorEngineType.CUSTOM_AI -> CustomAiEngine(
                okHttpClient,
                apiKeyProvider = { preferences.getString(PREF_TRANSLATOR_CUSTOM_AI_KEY, "").orEmpty() },
                endpointProvider = { preferences.getString(PREF_TRANSLATOR_CUSTOM_AI_ENDPOINT, "https://api.openai.com/v1/chat/completions").orEmpty() },
                modelProvider = { preferences.getString(PREF_TRANSLATOR_CUSTOM_AI_MODEL, "gpt-4o-mini").orEmpty() }
            )
        }
    }

    private fun startAutoTranslateIfEnabled() {
        val triggerMode = TranslatorTriggerMode.fromPreference(preferences.getString(PREF_TRANSLATOR_TRIGGER_MODE, "on_demand"))
        if (triggerMode == TranslatorTriggerMode.AUTO_SCREEN_CHANGE) {
            autoTranslateJob?.cancel()
            autoTranslateJob = mainScope.launch {
                while (isActive) {
                    delay(2500)
                    if (isEnabled && overlayView?.isTranslating == false) {
                        triggerTranslation()
                    }
                }
            }
        } else {
            stopAutoTranslate()
        }
    }

    private fun stopAutoTranslate() {
        autoTranslateJob?.cancel()
        autoTranslateJob = null
    }

    fun onDestroy() {
        stopAutoTranslate()
        mainScope.cancel()
        mediaProjectionCapturer.onDestroy()
    }
}

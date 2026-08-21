package me.magnum.melonds.translator

import android.app.Activity
import android.content.Context
import android.content.SharedPreferences
import android.graphics.Bitmap
import android.os.Handler
import android.os.Looper
import android.speech.tts.TextToSpeech
import android.util.Log
import android.view.PixelCopy
import android.view.SurfaceView
import android.view.View
import android.widget.Toast
import androidx.preference.PreferenceManager
import kotlinx.coroutines.*
import me.magnum.melonds.R
import me.magnum.melonds.translator.capture.*
import me.magnum.melonds.translator.engine.*
import me.magnum.melonds.translator.model.TranslationRegion
import me.magnum.melonds.translator.model.TranslatorEngineType
import me.magnum.melonds.translator.model.TranslatorOverlayStyle
import me.magnum.melonds.translator.model.TranslatorTriggerMode
import me.magnum.melonds.translator.ocr.GameTextRecognizer
import me.magnum.melonds.translator.tts.GameTtsManager
import me.magnum.melonds.translator.ui.GameTranslationOverlayView
import okhttp3.OkHttpClient
import java.util.Locale
import java.util.concurrent.TimeUnit

class GameTranslatorManager(
    private val activity: Activity,
    private val surfaceProvider: () -> SurfaceView?,
    private val screenshotProvider: (suspend () -> Bitmap?)? = null,
    private val onPauseEmulator: () -> Unit,
    private val onResumeEmulator: () -> Unit
) {
    companion object {
        private const val TAG = "GameTranslatorManager"
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
        const val PREF_TRANSLATOR_TTS_ENABLED = "translator_tts_enabled"
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
    private val mediaProjectionCapturer = MediaProjectionCapturer(activity)
    private val mainScope = CoroutineScope(Dispatchers.Main + SupervisorJob())
    private val mainHandler = Handler(Looper.getMainLooper())

    private var overlayView: GameTranslationOverlayView? = null
    private var autoTranslateJob: Job? = null
    private var isPausedByTranslator = false
    private var pendingTranslateAfterPermission = false
    private val ttsManager = GameTtsManager(activity)

    var requestMediaProjectionPermission: ((android.content.Intent) -> Unit)? = null

    // Per-Game Identification for custom OCR Region Persistence
    var currentGameTitle: String? = null
        private set
    var currentGameCode: String? = null
        private set
    var currentGameHash: String? = null
        private set

    // Cache of recent translations to avoid redundant network hits
    private val translationCache = mutableMapOf<String, String>()

    val isEnabled: Boolean
        get() = preferences.getBoolean(PREF_TRANSLATOR_ENABLED, false)

    /**
     * Updates active ROM context to enable per-game OCR regions and speaker context.
     */
    fun setCurrentGame(romTitle: String?, gameCode: String?, gameHash: String?) {
        currentGameTitle = romTitle
        currentGameCode = gameCode
        currentGameHash = gameHash
        Log.i(TAG, "Active ROM set: title='$romTitle', code='$gameCode', hash='$gameHash'")
        loadRegionsForCurrentGame()
    }

    fun getGameStorageKey(): String {
        val raw = currentGameCode?.takeIf { it.isNotBlank() }
            ?: currentGameHash?.takeIf { it.isNotBlank() }
            ?: currentGameTitle?.takeIf { it.isNotBlank() }
            ?: "global"
        return raw.replace(Regex("[^a-zA-Z0-9_]"), "_").take(32)
    }

    fun getPerGameRegionsPrefKey(): String {
        val gameKey = getGameStorageKey()
        return if (gameKey == "global") {
            PREF_TRANSLATOR_SAVED_REGIONS
        } else {
            "${PREF_TRANSLATOR_SAVED_REGIONS}_$gameKey"
        }
    }

    fun loadRegionsForCurrentGame(): List<TranslationRegion> {
        val perGameKey = getPerGameRegionsPrefKey()
        var json = preferences.getString(perGameKey, null)
        if (json.isNullOrBlank() && perGameKey != PREF_TRANSLATOR_SAVED_REGIONS) {
            // Fallback to default global regions if no game-specific regions yet
            json = preferences.getString(PREF_TRANSLATOR_SAVED_REGIONS, null)
        }
        val regions = TranslationRegion.listFromJson(json)
        overlayView?.setSavedRegions(regions)
        return regions
    }

    fun saveRegionsForCurrentGame(regions: List<TranslationRegion>) {
        val json = TranslationRegion.listToJson(regions)
        val perGameKey = getPerGameRegionsPrefKey()
        preferences.edit().putString(perGameKey, json).apply()

        // Also ensure global default is populated if empty
        if (preferences.getString(PREF_TRANSLATOR_SAVED_REGIONS, null).isNullOrBlank()) {
            preferences.edit().putString(PREF_TRANSLATOR_SAVED_REGIONS, json).apply()
        }
        overlayView?.setSavedRegions(regions)
        Log.i(TAG, "Saved ${regions.size} OCR regions under key [$perGameKey]")
    }

    fun speakTts(text: String, targetLang: String = "ru") {
        val ttsOn = preferences.getBoolean(PREF_TRANSLATOR_TTS_ENABLED, false) ||
                    preferences.getBoolean("translator_local_voice_actor_studio", false)
        if (!ttsOn) return
        ttsManager.speak(text, targetLang)
    }

    fun attachOverlay(overlay: GameTranslationOverlayView) {
        overlayView = overlay
        syncOverlaySettings()

        overlay.onTriggerTranslationRequested = {
            triggerTranslation()
        }
        overlay.onFloatingButtonLongClickListener = {
            showQuickEngineSelectorDialog()
        }
        overlay.onLassoRegionSelected = { lassoRegion ->
            translateSpecificRegion(lassoRegion)
        }
        overlay.onSpeakWordRequested = { queryWord ->
            speakTts(queryWord)
        }
        overlay.onDismissRequested = {
            dismissTranslation()
        }
        overlay.onRegionsSaved = { newRegions ->
            saveRegionsForCurrentGame(newRegions)
            val gameLabel = currentGameTitle ?: activity.getString(R.string.category_translator)
            Toast.makeText(
                activity,
                "${activity.getString(R.string.translator_regions_saved_toast, newRegions.size)} ($gameLabel)",
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

    fun showQuickEngineSelectorDialog() {
        val bottomSheetDialog = com.google.android.material.bottomsheet.BottomSheetDialog(activity)
        val composeView = androidx.compose.ui.platform.ComposeView(activity).apply {
            setContent {
                me.magnum.melonds.ui.theme.MelonTheme {
                    me.magnum.melonds.translator.ui.TranslatorSettingsContent(
                        preferences = preferences,
                        onClose = { bottomSheetDialog.dismiss() },
                        onSyncOverlay = { syncOverlaySettings() },
                        onStartAutoTranslate = { startAutoTranslateIfEnabled() },
                        onOpenRegionEditor = {
                            bottomSheetDialog.dismiss()
                            openRegionEditor()
                        },
                        onPreviewTts = {
                            ttsManager.speak("Бэтмен: Город под защитой. Лейтон: У каждой загадки есть разгадка!", "ru")
                        }
                    )
                }
            }
        }
        bottomSheetDialog.setContentView(composeView)
        bottomSheetDialog.show()
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

        val regions = loadRegionsForCurrentGame()
        overlay.setSavedRegions(regions)

        if (enabled) {
            startAutoTranslateIfEnabled()
        } else {
            stopAutoTranslate()
            overlay.clearTranslations()
        }
    }

    fun triggerTranslation(isAuto: Boolean = false) {
        if (!isEnabled) {
            Toast.makeText(activity, R.string.translator_disabled_hint, Toast.LENGTH_SHORT).show()
            return
        }

        // If currently displaying translations, dismiss and unpause
        if (overlayView?.hasActiveTranslations() == true || overlayView?.isTranslating == true) {
            dismissTranslation()
            return
        }

        if (!mediaProjectionCapturer.hasPermission) {
            pendingTranslateAfterPermission = true
            try {
                val intent = mediaProjectionCapturer.createCaptureIntent()
                requestMediaProjectionPermission?.invoke(intent)
            } catch (e: Throwable) {
                Log.e(TAG, "Failed to launch MediaProjection permission request", e)
                Toast.makeText(activity, R.string.translator_capture_failed, Toast.LENGTH_SHORT).show()
            }
            return
        }

        overlayView?.isTranslating = true
        val prevShowFloating = overlayView?.showFloatingButton ?: true
        overlayView?.showFloatingButton = false
        overlayView?.invalidate()

        mainScope.launch {
            val pauseOnTranslate = preferences.getBoolean(PREF_TRANSLATOR_PAUSE_ON_TRANSLATE, true)
            var capturedBitmap: Bitmap? = null

            // Tier 1: High-res MediaProjection Screen Capture
            try {
                capturedBitmap = withTimeoutOrNull(1500) {
                    mediaProjectionCapturer.captureScreen()
                }
                if (capturedBitmap != null && isBitmapBlank(capturedBitmap)) {
                    capturedBitmap?.recycle()
                    capturedBitmap = null
                }
            } catch (e: Throwable) {
                Log.e(TAG, "MediaProjection capture failed", e)
                capturedBitmap = null
            }

            // Tier 2: PixelCopy from SurfaceView
            if (capturedBitmap == null) {
                val pixelCopyResult = captureViaPixelCopy()
                capturedBitmap = if (pixelCopyResult != null && !isBitmapBlank(pixelCopyResult)) {
                    pixelCopyResult
                } else {
                    pixelCopyResult?.recycle()
                    null
                }
            }

            // Tier 3: Native DS Framebuffer (256x384)
            if (capturedBitmap == null && screenshotProvider != null) {
                try {
                    capturedBitmap = withTimeoutOrNull(500) {
                        screenshotProvider?.invoke()
                    }
                } catch (_: Throwable) {
                    capturedBitmap = null
                }
            }

            overlayView?.showFloatingButton = prevShowFloating
            overlayView?.invalidate()

            if (pauseOnTranslate) {
                isPausedByTranslator = true
                try {
                    onPauseEmulator()
                } catch (_: Throwable) {}
            }

            if (capturedBitmap != null) {
                val isNativeDsBitmap = (capturedBitmap!!.width == 256 && capturedBitmap!!.height == 384)
                processCapturedFrame(capturedBitmap!!, forceFullscreen = isNativeDsBitmap, isAuto = isAuto)
            } else {
                overlayView?.isTranslating = false
                if (isPausedByTranslator) {
                    isPausedByTranslator = false
                    try { onResumeEmulator() } catch (_: Throwable) {}
                }
                Toast.makeText(activity, R.string.translator_capture_failed, Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun onMediaProjectionResult(resultCode: Int, data: android.content.Intent?) {
        mediaProjectionCapturer.setPermissionResult(resultCode, data)
        if (resultCode == Activity.RESULT_OK && data != null && pendingTranslateAfterPermission) {
            pendingTranslateAfterPermission = false
            mainScope.launch {
                withTimeoutOrNull(2500) {
                    while (!ScreenCaptureService.isReady) {
                        delay(50)
                    }
                }
                delay(150)
                triggerTranslation()
            }
        }
    }

    private suspend fun captureViaPixelCopy(): Bitmap? = withContext(Dispatchers.Main) {
        val surfaceView = surfaceProvider()
        val decorView = activity.window.decorView
        val decorW = decorView.width.coerceAtLeast(1)
        val decorH = decorView.height.coerceAtLeast(1)

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

    private fun isBitmapBlank(bitmap: Bitmap?): Boolean {
        if (bitmap == null || bitmap.width < 4 || bitmap.height < 4) return true
        val stepX = (bitmap.width / 12).coerceAtLeast(1)
        val stepY = (bitmap.height / 12).coerceAtLeast(1)
        var nonBlackCount = 0
        for (row in 1..11) {
            for (col in 1..11) {
                val pixel = bitmap.getPixel(col * stepX, row * stepY)
                val r = (pixel shr 16) and 0xFF
                val g = (pixel shr 8) and 0xFF
                val b = pixel and 0xFF
                if (r > 10 || g > 10 || b > 10) {
                    nonBlackCount++
                    if (nonBlackCount >= 1) return false
                }
            }
        }
        return nonBlackCount == 0
    }

    fun dismissTranslation() {
        overlayView?.clearTranslations()
        overlayView?.isTranslating = false
        if (isPausedByTranslator) {
            isPausedByTranslator = false
            try {
                onResumeEmulator()
            } catch (_: Throwable) {}
        }
    }

    private var lastFrameDHash: Long = 0L

    private fun calculateDHash(bitmap: Bitmap): Long {
        val scaled = try {
            Bitmap.createScaledBitmap(bitmap, 9, 8, false)
        } catch (_: Throwable) {
            return 0L
        }
        var hash = 0L
        for (y in 0 until 8) {
            for (x in 0 until 8) {
                val left = scaled.getPixel(x, y)
                val right = scaled.getPixel(x + 1, y)
                val lumLeft = ((left shr 16 and 0xFF) * 299 + (left shr 8 and 0xFF) * 587 + (left and 0xFF) * 114) / 1000
                val lumRight = ((right shr 16 and 0xFF) * 299 + (right shr 8 and 0xFF) * 587 + (right and 0xFF) * 114) / 1000
                if (lumLeft > lumRight) {
                    hash = hash or (1L shl (y * 8 + x))
                }
            }
        }
        if (scaled !== bitmap) scaled.recycle()
        return hash
    }

    private fun hammingDistance(h1: Long, h2: Long): Int {
        return java.lang.Long.bitCount(h1 xor h2)
    }

    fun translateSpecificRegion(region: TranslationRegion) {
        if (!isEnabled) return
        overlayView?.isTranslating = true
        mainScope.launch {
            val pauseOnTranslate = preferences.getBoolean(PREF_TRANSLATOR_PAUSE_ON_TRANSLATE, true)
            var capturedBitmap: Bitmap? = null
            try {
                capturedBitmap = withTimeoutOrNull(1500) {
                    mediaProjectionCapturer.captureScreen()
                }
            } catch (_: Throwable) {}

            if (capturedBitmap == null) {
                capturedBitmap = captureViaPixelCopy()
            }

            if (capturedBitmap == null && screenshotProvider != null) {
                try {
                    capturedBitmap = withTimeoutOrNull(500) { screenshotProvider.invoke() }
                } catch (_: Throwable) {}
            }

            if (pauseOnTranslate) {
                isPausedByTranslator = true
                try { onPauseEmulator() } catch (_: Throwable) {}
            }

            if (capturedBitmap != null) {
                processCapturedFrame(capturedBitmap, customOverrideRegions = listOf(region))
            } else {
                overlayView?.isTranslating = false
            }
        }
    }

    private fun processCapturedFrame(
        bitmap: Bitmap,
        forceFullscreen: Boolean = false,
        isAuto: Boolean = false,
        customOverrideRegions: List<TranslationRegion>? = null
    ) {
        mainScope.launch {
            try {
                if (isAuto) {
                    val currentDHash = calculateDHash(bitmap)
                    val diff = hammingDistance(currentDHash, lastFrameDHash)
                    if (diff <= 2 && lastFrameDHash != 0L) {
                        // Screen Delta Diff: frame is identical -> skip OCR and translation!
                        overlayView?.isTranslating = false
                        return@launch
                    }
                    lastFrameDHash = currentDHash
                }

                val sourceLang = preferences.getString(PREF_TRANSLATOR_SOURCE_LANG, "auto") ?: "auto"
                val targetLang = preferences.getString(PREF_TRANSLATOR_TARGET_LANG, "ru") ?: "ru"

                val customRegions = when {
                    customOverrideRegions != null -> customOverrideRegions
                    forceFullscreen -> emptyList()
                    else -> loadRegionsForCurrentGame()
                }

                var blocks = withTimeoutOrNull(8000) {
                    textRecognizer.recognizeTextBlocks(bitmap, sourceLang, customRegions)
                } ?: emptyList()

                // Fallback to fullscreen if custom regions returned 0 blocks
                if (blocks.isEmpty() && customRegions.isNotEmpty()) {
                    Log.i(TAG, "Custom regions returned 0 blocks, executing fullscreen fallback...")
                    blocks = withTimeoutOrNull(8000) {
                        textRecognizer.recognizeTextBlocks(bitmap, sourceLang, emptyList())
                    } ?: emptyList()
                }

                if (blocks.isEmpty()) {
                    overlayView?.clearTranslations()
                    overlayView?.isTranslating = false
                    if (isPausedByTranslator) {
                        isPausedByTranslator = false
                        try { onResumeEmulator() } catch (_: Throwable) {}
                    }
                    if (!isAuto) {
                        val ocrError = textRecognizer.lastOcrError
                        val toastMsg = if (!ocrError.isNullOrBlank()) "OCR: $ocrError" else activity.getString(R.string.translator_no_text_found)
                        Toast.makeText(activity, toastMsg, Toast.LENGTH_SHORT).show()
                    }
                    return@launch
                }

                val currentMerged = blocks.joinToString(" ") { it.originalText.trim() }.replace(Regex("\\s+"), " ").trim()
                if (isAuto && (currentMerged.length < 3 || currentMerged == lastTranslatedRawText)) {
                    overlayView?.isTranslating = false
                    return@launch
                }
                lastTranslatedRawText = currentMerged

                val engine = getActiveTranslationEngine()
                Log.i(TAG, "Translating ${blocks.size} blocks with ${engine.javaClass.simpleName} ($sourceLang -> $targetLang)")

                withTimeoutOrNull(8000) {
                    coroutineScope {
                        blocks.map { block ->
                            async(Dispatchers.IO) {
                                val preparedText = me.magnum.melonds.translator.util.GameTextCleaner.prepareForTranslation(block.originalText)
                                val cacheKey = "$preparedText|$sourceLang|$targetLang"
                                val cached = translationCache[cacheKey]
                                if (cached != null) {
                                    block.translatedText = cached
                                } else {
                                    val translated = try {
                                        withTimeoutOrNull(5000) {
                                            val raw = engine.translate(preparedText, sourceLang, targetLang)
                                            me.magnum.melonds.translator.util.GameTextCleaner.polishTranslation(raw, targetLang)
                                        } ?: block.originalText
                                    } catch (e: Exception) {
                                        Log.w(TAG, "Translation error for block '${block.originalText}': ${e.message}", e)
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
                val ttsOn = preferences.getBoolean(PREF_TRANSLATOR_TTS_ENABLED, false) ||
                            preferences.getBoolean("translator_local_voice_actor_studio", false)
                if (ttsOn) {
                    val speechText = blocks.joinToString(". ") { it.translatedText }
                    speakTts(speechText, targetLang)
                }
            } catch (t: Throwable) {
                Log.e(TAG, "Process captured frame failed", t)
                val msg = t.message?.takeIf { it.isNotBlank() } ?: activity.getString(R.string.translator_no_text_found)
                Toast.makeText(activity, msg, Toast.LENGTH_SHORT).show()
                if (isPausedByTranslator) {
                    isPausedByTranslator = false
                    try { onResumeEmulator() } catch (_: Throwable) {}
                }
            } finally {
                overlayView?.isTranslating = false
            }
        }
    }

    private fun getActiveTranslationEngine(): ITranslationEngine {
        val type = TranslatorEngineType.fromPreference(preferences.getString(PREF_TRANSLATOR_ENGINE, "google"))
        val baseEngine = when (type) {
            TranslatorEngineType.OFFLINE -> OfflineSmartDictionaryEngine()
            TranslatorEngineType.YANDEX -> YandexTranslateEngine(okHttpClient)
            TranslatorEngineType.GOOGLE -> GoogleTranslateEngine(okHttpClient)
            TranslatorEngineType.LINGVA -> LingvaTranslateEngine(okHttpClient)
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
        return if (type == TranslatorEngineType.OFFLINE) baseEngine else ReliableHybridTranslateEngine(baseEngine)
    }

    private var lastTranslatedRawText: String = ""

    private fun startAutoTranslateIfEnabled() {
        val triggerMode = TranslatorTriggerMode.fromPreference(preferences.getString(PREF_TRANSLATOR_TRIGGER_MODE, "on_demand"))
        if (triggerMode == TranslatorTriggerMode.AUTO_SCREEN_CHANGE) {
            autoTranslateJob?.cancel()
            autoTranslateJob = mainScope.launch {
                while (isActive) {
                    delay(1500)
                    if (isEnabled && overlayView?.isTranslating == false) {
                        triggerTranslation(isAuto = true)
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
        ttsManager.destroy()
        mainScope.cancel()
        mediaProjectionCapturer.onDestroy()
    }
}

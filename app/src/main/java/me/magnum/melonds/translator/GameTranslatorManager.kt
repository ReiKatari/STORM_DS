package me.magnum.melonds.translator

import android.app.Activity
import android.content.Context
import android.content.SharedPreferences
import android.graphics.Bitmap
import android.graphics.RectF
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
import me.magnum.melonds.domain.model.layout.LayoutComponent
import me.magnum.melonds.translator.capture.*
import me.magnum.melonds.translator.engine.*
import me.magnum.melonds.translator.model.TranslationRegion
import me.magnum.melonds.translator.model.TranslatorDefaultZone
import me.magnum.melonds.translator.model.TranslatorEngineType
import me.magnum.melonds.translator.model.TranslatorOverlayStyle
import me.magnum.melonds.translator.model.TranslatorTriggerMode
import me.magnum.melonds.ui.common.LayoutView
import me.magnum.melonds.ui.emulator.RuntimeLayoutView
import me.magnum.melonds.translator.ocr.GameTextRecognizer
import me.magnum.melonds.translator.tts.GameTtsManager
import me.magnum.melonds.translator.ui.GameTranslationOverlayView
import me.magnum.melonds.translator.backlog.DialogueBacklogStore
import me.magnum.melonds.translator.glossary.UserGlossaryManager
import me.magnum.melonds.translator.ui.DialogueBacklogBottomSheet
import okhttp3.OkHttpClient
import java.util.Locale
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicBoolean

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
        const val PREF_TRANSLATOR_FLOATING_BUTTON_OPACITY = "translator_floating_button_opacity"
        const val PREF_TRANSLATOR_SAVED_REGIONS = "translator_saved_regions"
        const val PREF_TRANSLATOR_TTS_ENABLED = "translator_tts_enabled"
        const val PREF_TRANSLATOR_DEEPL_KEY = "translator_deepl_key"
        const val PREF_TRANSLATOR_CUSTOM_AI_KEY = "translator_custom_ai_key"
        const val PREF_TRANSLATOR_CUSTOM_AI_ENDPOINT = "translator_custom_ai_endpoint"
        const val PREF_TRANSLATOR_CUSTOM_AI_MODEL = "translator_custom_ai_model"
        const val PREF_TRANSLATOR_DEFAULT_ZONE = "translator_default_zone"

        private val sharedOkHttpClient: OkHttpClient by lazy {
            me.magnum.melonds.common.network.SharedOkHttpClient.instance.newBuilder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(15, TimeUnit.SECONDS)
                .build()
        }
    }

    private val preferences: SharedPreferences = PreferenceManager.getDefaultSharedPreferences(activity)
    private val okHttpClient: OkHttpClient = sharedOkHttpClient

    private val textRecognizer = GameTextRecognizer()
    private val mediaProjectionCapturer = MediaProjectionCapturer(activity)
    private val mainScope = CoroutineScope(Dispatchers.Main + SupervisorJob())
    private val mainHandler = Handler(Looper.getMainLooper())

    private var overlayView: GameTranslationOverlayView? = null
    private var autoTranslateJob: Job? = null
    private var translationJob: Job? = null
    @Volatile
    private var activeTranslationGen: Int = 0
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
    var currentGameSourceLangOverride: String? = null
        private set

    // Two-tier persistent translation cache (memory LRU + ROM disk JSON)
    private val translationCache = TranslationCache(activity)

    // User Glossary Manager (.stormdict.json)
    val characterGenderStore by lazy { me.magnum.melonds.translator.grammar.CharacterGenderStore(activity) }

    val glossaryManager by lazy {
        UserGlossaryManager(activity) { term ->
            invalidateGlossaryTerm(term)
        }
    }

    // Dialogue Backlog Circular Store (50 turns)
    val backlogStore by lazy { DialogueBacklogStore(50) }

    val isEnabled: Boolean
        get() = preferences.getBoolean(PREF_TRANSLATOR_ENABLED, false)

    private val prefChangeListener = SharedPreferences.OnSharedPreferenceChangeListener { _, key ->
        when {
            key == "translator_cache_clear_epoch" -> {
                mainHandler.post {
                    translationCache.clearAll()
                    textRecognizer.clearCache()
                    ocrContextGraph.clearDialogueHistory()
                    lastTranslatedRawText = ""
                    lastFrameDHash = 0L
                    overlayView?.clearTranslations()
                }
            }
            key == "pref_translator_float_btn_x_ratio" ||
            key == "pref_translator_float_btn_y_ratio" ||
            key == PREF_TRANSLATOR_SAVED_REGIONS ||
            (key != null && key.startsWith("${PREF_TRANSLATOR_SAVED_REGIONS}_")) ||
            key == PREF_TRANSLATOR_ENABLED ||
            key == PREF_TRANSLATOR_SHOW_FLOATING_BUTTON ||
            key == PREF_TRANSLATOR_FLOATING_BUTTON_OPACITY ||
            key == PREF_TRANSLATOR_OVERLAY_STYLE ||
            key == PREF_TRANSLATOR_BUBBLE_OPACITY ||
            key == PREF_TRANSLATOR_FONT_SIZE_SCALE ||
            key == PREF_TRANSLATOR_TRIGGER_MODE -> {
                mainHandler.post {
                    syncOverlaySettings()
                }
            }
            key == PREF_TRANSLATOR_ENGINE ||
            key == PREF_TRANSLATOR_DEEPL_KEY ||
            key == PREF_TRANSLATOR_CUSTOM_AI_KEY ||
            key == PREF_TRANSLATOR_CUSTOM_AI_ENDPOINT ||
            key == PREF_TRANSLATOR_CUSTOM_AI_MODEL ||
            key == PREF_TRANSLATOR_SOURCE_LANG ||
            key == PREF_TRANSLATOR_TARGET_LANG ||
            key == PREF_TRANSLATOR_DEFAULT_ZONE -> {
                mainHandler.post {
                    cachedEngine = null
                    cachedEngineType = null
                    textRecognizer.clearCache()
                    ocrContextGraph.clearDialogueHistory()
                    lastTranslatedRawText = ""
                    lastFrameDHash = 0L
                    translationCache.clearMemory()
                    overlayView?.clearTranslations()
                    syncOverlaySettings()
                }
            }
        }
    }

    private val ocrContextGraph = me.magnum.melonds.translator.context.OcrContextGraph
    private var lastErrorToastTimeMs: Long = 0L

    init {
        if (!preferences.getBoolean("pref_migrated_translator_floating_btn_v794", false)) {
            preferences.edit()
                .putBoolean(PREF_TRANSLATOR_SHOW_FLOATING_BUTTON, false)
                .putBoolean("pref_migrated_translator_floating_btn_v794", true)
                .apply()
        }
        preferences.registerOnSharedPreferenceChangeListener(prefChangeListener)
        ocrContextGraph.setActiveGame(activity, getGameStorageKey())
    }

    /**
     * Updates active ROM context to enable per-game OCR regions and speaker context.
     */
    fun setCurrentGame(romTitle: String?, gameCode: String?, gameHash: String?, sourceLangOverride: String? = null) {
        currentGameTitle = romTitle
        currentGameCode = gameCode
        currentGameHash = gameHash
        currentGameSourceLangOverride = sourceLangOverride?.takeIf { it.isNotBlank() }
        Log.i(TAG, "Active ROM set: title='$romTitle', code='$gameCode', hash='$gameHash', langOverride='$currentGameSourceLangOverride'")
        ocrContextGraph.clearDialogueHistory()
        val storageKey = getGameStorageKey()
        ocrContextGraph.setActiveGame(activity, storageKey)
        translationCache.setGameKey(storageKey)
        glossaryManager.setGameKey(storageKey)
        characterGenderStore.loadForGame(storageKey)
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

    @Volatile
    private var explicitTopScreenRect: me.magnum.melonds.domain.model.Rect? = null
    @Volatile
    private var explicitBottomScreenRect: me.magnum.melonds.domain.model.Rect? = null
    @Volatile
    private var explicitSurfaceWidth: Int = 0
    @Volatile
    private var explicitSurfaceHeight: Int = 0

    fun updateScreenRects(
        topScreenRect: me.magnum.melonds.domain.model.Rect?,
        bottomScreenRect: me.magnum.melonds.domain.model.Rect?,
        surfaceWidth: Int = 0,
        surfaceHeight: Int = 0,
    ) {
        explicitTopScreenRect = topScreenRect?.takeIf { it.width > 0 && it.height > 0 }
        explicitBottomScreenRect = bottomScreenRect?.takeIf { it.width > 0 && it.height > 0 }
        explicitSurfaceWidth = surfaceWidth
        explicitSurfaceHeight = surfaceHeight
    }

    private fun resolveDefaultZoneRegion(zone: TranslatorDefaultZone, bitmap: Bitmap): TranslationRegion? {
        if (zone == TranslatorDefaultZone.BOTH) return null

        val halfRect = if (zone == TranslatorDefaultZone.TOP) {
            RectF(0f, 0f, 1f, 0.5f)
        } else {
            RectF(0f, 0.5f, 1f, 1f)
        }

        // Native vertical-stacked DS framebuffer (256x384): top half = top screen, bottom half = bottom screen
        if (bitmap.width == 256 && bitmap.height == 384) {
            return TranslationRegion(
                id = "default_zone_${zone.preferenceValue}",
                rect = halfRect,
                name = zone.preferenceValue
            )
        }

        val bmpW = bitmap.width.toFloat().coerceAtLeast(1f)
        val bmpH = bitmap.height.toFloat().coerceAtLeast(1f)
        val bmpAspect = bmpW / bmpH

        // Explicit screen rects supplied by EmulatorActivity (if matching captured surface aspect)
        val expW = explicitSurfaceWidth.toFloat()
        val expH = explicitSurfaceHeight.toFloat()
        if (expW > 0f && expH > 0f && kotlin.math.abs(bmpAspect - (expW / expH)) < 0.08f) {
            val chosenExplicit = if (zone == TranslatorDefaultZone.TOP) explicitTopScreenRect else explicitBottomScreenRect
            if (chosenExplicit != null) {
                normalizeScreenRect(chosenExplicit, expW, expH)?.let { rectF ->
                    return TranslationRegion(
                        id = "default_zone_${zone.preferenceValue}",
                        rect = rectF,
                        name = zone.preferenceValue
                    )
                }
            }
        }

        // RuntimeLayoutView screen rects (covers PixelCopy captures matching the emulator surface)
        val layoutView = runCatching {
            activity.findViewById<LayoutView>(R.id.view_layout_controls)
        }.getOrNull()
        if (layoutView != null && layoutView.width > 0 && layoutView.height > 0) {
            val layoutW = layoutView.width.toFloat()
            val layoutH = layoutView.height.toFloat()
            if (kotlin.math.abs(bmpAspect - (layoutW / layoutH)) < 0.08f) {
                val swapped = (layoutView as? RuntimeLayoutView)?.areScreensSwapped() == true
                val rawTop = layoutView.getLayoutComponentView(LayoutComponent.TOP_SCREEN)
                    ?.getRect()?.takeIf { it.width > 0 && it.height > 0 }
                val rawBottom = layoutView.getLayoutComponentView(LayoutComponent.BOTTOM_SCREEN)
                    ?.getRect()?.takeIf { it.width > 0 && it.height > 0 }
                val topRect = if (swapped) rawBottom else rawTop
                val bottomRect = if (swapped) rawTop else rawBottom

                val chosen = if (zone == TranslatorDefaultZone.TOP) topRect else bottomRect
                if (chosen != null) {
                    normalizeScreenRect(chosen, layoutW, layoutH)?.let { rectF ->
                        return TranslationRegion(
                            id = "default_zone_${zone.preferenceValue}",
                            rect = rectF,
                            name = zone.preferenceValue
                        )
                    }
                }

                val hybridRect = layoutView.getLayoutComponentView(LayoutComponent.HYBRID_SCREEN)
                    ?.getRect()?.takeIf { it.width > 0 && it.height > 0 }
                if (hybridRect != null) {
                    val halfH = (hybridRect.height / 2).coerceAtLeast(1)
                    val splitRect = if (zone == TranslatorDefaultZone.TOP) {
                        me.magnum.melonds.domain.model.Rect(hybridRect.x, hybridRect.y, hybridRect.width, halfH)
                    } else {
                        me.magnum.melonds.domain.model.Rect(
                            hybridRect.x,
                            hybridRect.y + halfH,
                            hybridRect.width,
                            (hybridRect.height - halfH).coerceAtLeast(1)
                        )
                    }
                    normalizeScreenRect(splitRect, layoutW, layoutH)?.let { rectF ->
                        return TranslationRegion(
                            id = "default_zone_${zone.preferenceValue}",
                            rect = rectF,
                            name = zone.preferenceValue
                        )
                    }
                }
            }
        }

        // Fallback when screen rects are not split (e.g. MediaProjection or single unsplit surface)
        return TranslationRegion(
            id = "default_zone_${zone.preferenceValue}",
            rect = halfRect,
            name = zone.preferenceValue
        )
    }

    private fun normalizeScreenRect(
        rect: me.magnum.melonds.domain.model.Rect,
        containerW: Float,
        containerH: Float,
    ): RectF? {
        if (containerW <= 0f || containerH <= 0f || rect.width <= 0 || rect.height <= 0) return null
        val left = (rect.x / containerW).coerceIn(0f, 1f)
        val top = (rect.y / containerH).coerceIn(0f, 1f)
        val right = ((rect.x + rect.width) / containerW).coerceIn(0f, 1f)
        val bottom = ((rect.y + rect.height) / containerH).coerceIn(0f, 1f)
        if (right - left < 0.05f || bottom - top < 0.05f) return null
        return RectF(left, top, right, bottom)
    }

    fun getSourceLang(): String {
        return currentGameSourceLangOverride ?: preferences.getString(PREF_TRANSLATOR_SOURCE_LANG, "auto") ?: "auto"
    }

    private fun showThrottledErrorToast(message: String?, isAuto: Boolean) {
        val cleanMsg = message?.takeIf { it.isNotBlank() } ?: activity.getString(R.string.translator_error_network)
        val now = System.currentTimeMillis()
        if (isAuto && now - lastErrorToastTimeMs < 5000L) return
        lastErrorToastTimeMs = now
        mainHandler.post {
            Toast.makeText(activity, cleanMsg, Toast.LENGTH_SHORT).show()
        }
    }

    fun speakTts(text: String, targetLang: String = "ru") {
        val ttsOn = preferences.getBoolean(PREF_TRANSLATOR_TTS_ENABLED, false)
        if (!ttsOn) return
        ttsManager.speak(text, targetLang)
    }

    fun attachOverlay(overlay: GameTranslationOverlayView) {
        overlayView = overlay
        syncOverlaySettings()

        overlay.onTriggerTranslationRequested = {
            triggerTranslation()
        }
        overlay.onOpenBacklogRequested = {
            showDialogueBacklogAndGlossaryDialog(0)
        }
        overlay.onFloatingButtonLongClickListener = {
            showQuickEngineSelectorDialog()
        }
        overlay.onLassoRegionSelected = { lassoRegion ->
            translateSpecificRegion(lassoRegion)
        }
        overlay.onSpeakWordRequested = { queryWord ->
            val src = getSourceLang()
            speakTts(queryWord, if (src == "auto") "en" else src)
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
                        onSyncOverlay = {
                            textRecognizer.clearCache()
                            lastTranslatedRawText = ""
                            lastFrameDHash = 0L
                            translationCache.clear()
                            overlayView?.clearTranslations()
                            syncOverlaySettings()
                        },
                        onStartAutoTranslate = { startAutoTranslateIfEnabled() },
                        onOpenRegionEditor = {
                            bottomSheetDialog.dismiss()
                            openRegionEditor()
                        },
                        onPreviewTts = {
                            val targetLang = preferences.getString(PREF_TRANSLATOR_TARGET_LANG, "ru") ?: "ru"
                            val previewText = when {
                                targetLang.startsWith("ru", ignoreCase = true) ->
                                    "Бэтмен: Город под защитой! Джокер: Ха-ха-ха, попробуй поймай меня! Майя: Феникс, у нас появилась новая улика!"
                                targetLang.startsWith("ja", ignoreCase = true) ->
                                    "バットマン：街は守られている！ ジョーカー：ハハハ、捕まえてみな！ 真宵：なるほどくん、新しい証拠が見つかったよ！"
                                targetLang.startsWith("zh", ignoreCase = true) ->
                                    "蝙蝠侠：这座城市受到保护！ 小丑：哈哈哈，有本事来抓我啊！ 真宵：成步堂，我们找到了新证据！"
                                targetLang.startsWith("de", ignoreCase = true) ->
                                    "Batman: Die Stadt ist geschützt! Joker: Hahaha, versuch mich zu fangen! Maya: Phoenix, wir haben einen neuen Beweis!"
                                targetLang.startsWith("fr", ignoreCase = true) ->
                                    "Batman : La ville est protégée ! Joker : Hahaha, essaie de m'attraper ! Maya : Phoenix, nous avons une nouvelle preuve !"
                                targetLang.startsWith("es", ignoreCase = true) ->
                                    "Batman: ¡La ciudad está protegida! Joker: ¡Jajaja, intenta atraparme! Maya: ¡Phoenix, tenemos una nueva prueba!"
                                else ->
                                    "Batman: The city is protected! Joker: Hahaha, try and catch me! Maya: Phoenix, we have new evidence!"
                            }
                            ttsManager.speak(previewText, targetLang)
                        },
                        onOpenBacklogAndGlossary = {
                            bottomSheetDialog.dismiss()
                            showDialogueBacklogAndGlossaryDialog(0)
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

    fun setTemporarilySuppressedByModal(suppressed: Boolean) {
        overlayView?.setTemporarilySuppressedByModal(suppressed)
    }

    fun setFloatingButtonOpacity(opacity: Float) {
        overlayView?.setFloatingButtonOpacity(opacity)
    }

    fun syncOverlaySettings() {
        val overlay = overlayView ?: return
        val enabled = isEnabled
        val showBtn = enabled && preferences.getBoolean(PREF_TRANSLATOR_SHOW_FLOATING_BUTTON, false)
        overlay.visibility = if (enabled) View.VISIBLE else View.GONE
        overlay.showFloatingButton = showBtn
        val btnOpacity = preferences.getInt(PREF_TRANSLATOR_FLOATING_BUTTON_OPACITY, 35).coerceIn(5, 100) / 100f
        overlay.setFloatingButtonOpacity(btnOpacity)
        overlay.overlayStyle = TranslatorOverlayStyle.fromPreference(preferences.getString(PREF_TRANSLATOR_OVERLAY_STYLE, "smart_background_match"))
        overlay.bubbleOpacity = preferences.getInt(PREF_TRANSLATOR_BUBBLE_OPACITY, 90) / 100f
        overlay.fontSizeScale = preferences.getInt(PREF_TRANSLATOR_FONT_SIZE_SCALE, 100) / 100f

        overlay.reloadFloatingButtonPositionFromPrefs()
        val regions = loadRegionsForCurrentGame()
        overlay.setSavedRegions(regions)

        if (enabled) {
            overlay.elevation = 950f
            overlay.bringToFront()
            overlay.requestLayout()
            overlay.invalidate()
            (overlay.parent as? View)?.requestLayout()
            overlay.post {
                overlay.bringToFront()
                overlay.requestLayout()
                overlay.invalidate()
            }
            startAutoTranslateIfEnabled()
        } else {
            stopAutoTranslate()
            overlay.clearTranslations()
            overlay.invalidate()
        }
    }

    fun hasActiveTranslationOverlay(): Boolean {
        val ov = overlayView
        return ov?.hasActiveTranslations() == true ||
            ov?.isTranslating == true ||
            ov?.isLassoModeActive == true ||
            ov?.isEditRegionsMode == true ||
            translationJob?.isActive == true ||
            isPausedByTranslator
    }

    fun triggerTranslation(isAuto: Boolean = false) {
        if (!isAuto && hasActiveTranslationOverlay()) {
            dismissTranslation()
            return
        }

        if (!isEnabled) {
            if (!isAuto) {
                preferences.edit().putBoolean(PREF_TRANSLATOR_ENABLED, true).apply()
                syncOverlaySettings()
            } else {
                return
            }
        }

        if (isAuto && (overlayView?.isTranslating == true || translationJob?.isActive == true)) {
            return
        }

        if (!isAuto) {
            // Manual user button/hotkey tap: guarantee fresh OCR scan
            textRecognizer.clearCache()
            lastTranslatedRawText = ""
            lastFrameDHash = 0L
            overlayView?.clearTranslations()
        }

        overlayView?.visibility = View.VISIBLE
        overlayView?.isTranslating = true
        val prevShowFloating = isEnabled && preferences.getBoolean(PREF_TRANSLATOR_SHOW_FLOATING_BUTTON, false)
        overlayView?.showFloatingButton = false
        overlayView?.invalidate()

        val currentGen = ++activeTranslationGen
        translationJob?.cancel()
        translationJob = mainScope.launch {
            val pauseOnTranslate = preferences.getBoolean(PREF_TRANSLATOR_PAUSE_ON_TRANSLATE, true)
            val capturedBitmap = captureFrameBitmap()

            if (currentGen != activeTranslationGen || !isActive) {
                capturedBitmap?.recycle()
                return@launch
            }

            // Fallback: If still no capture and MediaProjection not yet granted, request it
            if (capturedBitmap == null && !mediaProjectionCapturer.hasPermission) {
                overlayView?.showFloatingButton = prevShowFloating
                overlayView?.isTranslating = false
                overlayView?.invalidate()
                pendingTranslateAfterPermission = true
                try {
                    val intent = mediaProjectionCapturer.createCaptureIntent()
                    requestMediaProjectionPermission?.invoke(intent)
                } catch (e: Throwable) {
                    Log.e(TAG, "Failed to launch MediaProjection permission request", e)
                    Toast.makeText(activity, R.string.translator_capture_failed, Toast.LENGTH_SHORT).show()
                }
                return@launch
            }

            overlayView?.showFloatingButton = prevShowFloating
            overlayView?.invalidate()

            if (capturedBitmap != null) {
                if (pauseOnTranslate && !isAuto) {
                    isPausedByTranslator = true
                    try {
                        onPauseEmulator()
                    } catch (_: Throwable) {}
                }
                val w = capturedBitmap.width.toFloat()
                val h = capturedBitmap.height.toFloat()
                val aspect = w / h
                val isDsAspect = kotlin.math.abs(aspect - (256f / 384f)) < 0.05f || kotlin.math.abs(aspect - (256f / 192f)) < 0.05f
                val isNativeDsBitmap = isDsAspect || (capturedBitmap.width == 256 && capturedBitmap.height == 384)
                processCapturedFrame(capturedBitmap, forceFullscreen = isNativeDsBitmap, isAuto = isAuto, expectedGen = currentGen)
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

    private suspend fun captureFrameBitmap(): Bitmap? {
        var capturedBitmap: Bitmap? = null

        // Tier 1: Fast in-process PixelCopy from SurfaceView (0 permissions, <20ms)
        val pixelCopyResult = captureViaPixelCopy()
        if (pixelCopyResult != null && !isBitmapBlank(pixelCopyResult)) {
            capturedBitmap = pixelCopyResult
        } else {
            pixelCopyResult?.recycle()
        }

        // Tier 2: Direct DS Framebuffer (native or scaled)
        if (capturedBitmap == null && screenshotProvider != null) {
            try {
                capturedBitmap = withTimeoutOrNull(500) {
                    screenshotProvider.invoke()
                }
            } catch (_: Throwable) {
                capturedBitmap = null
            }
        }

        // Tier 3: MediaProjection Screen Capture (if permission already granted)
        if (capturedBitmap == null && mediaProjectionCapturer.hasPermission) {
            try {
                capturedBitmap = withTimeoutOrNull(1500) {
                    mediaProjectionCapturer.captureScreen()
                }
                if (capturedBitmap != null && isBitmapBlank(capturedBitmap)) {
                    capturedBitmap.recycle()
                    capturedBitmap = null
                }
            } catch (e: Throwable) {
                Log.e(TAG, "MediaProjection capture failed", e)
                capturedBitmap = null
            }
        }

        return capturedBitmap
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
            val result = captureBitmapViaPixelCopy(surfaceView.width, surfaceView.height) { bitmap, listener ->
                PixelCopy.request(surfaceView, bitmap, listener, mainHandler)
            }
            if (result != null) return@withContext result
        }

        captureBitmapViaPixelCopy(decorW, decorH) { bitmap, listener ->
            val rect = android.graphics.Rect(0, 0, decorW, decorH)
            PixelCopy.request(activity.window, rect, bitmap, listener, mainHandler)
        }
    }

    private suspend fun captureBitmapViaPixelCopy(
        width: Int,
        height: Int,
        timeoutMs: Long = 400L,
        requestBlock: (Bitmap, PixelCopy.OnPixelCopyFinishedListener) -> Unit,
    ): Bitmap? {
        val bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
        val completed = AtomicBoolean(false)
        val cancelledOrTimedOut = AtomicBoolean(false)

        val result = withTimeoutOrNull(timeoutMs) {
            suspendCancellableCoroutine<Bitmap?> { continuation ->
                continuation.invokeOnCancellation {
                    cancelledOrTimedOut.set(true)
                }
                val onCopyFinished = PixelCopy.OnPixelCopyFinishedListener { copyResult ->
                    if (completed.compareAndSet(false, true)) {
                        if (cancelledOrTimedOut.get() || !continuation.isActive) {
                            bitmap.recycle()
                        } else if (copyResult == PixelCopy.SUCCESS) {
                            continuation.resume(bitmap, onCancellation = null)
                        } else {
                            bitmap.recycle()
                            continuation.resume(null, onCancellation = null)
                        }
                    }
                }
                try {
                    requestBlock(bitmap, onCopyFinished)
                } catch (_: Throwable) {
                    if (completed.compareAndSet(false, true)) {
                        bitmap.recycle()
                    }
                    if (continuation.isActive) continuation.resume(null, onCancellation = null)
                }
            }
        }
        if (result == null) {
            cancelledOrTimedOut.set(true)
        }
        return result
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
        activeTranslationGen++
        translationJob?.cancel()
        translationJob = null
        ttsManager.stop()
        overlayView?.isLassoModeActive = false
        overlayView?.isEditRegionsMode = false
        overlayView?.clearTranslations()
        overlayView?.isTranslating = false
        overlayView?.showFloatingButton = isEnabled && preferences.getBoolean(PREF_TRANSLATOR_SHOW_FLOATING_BUTTON, false)
        overlayView?.invalidate()
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
        val currentGen = ++activeTranslationGen
        translationJob?.cancel()
        translationJob = mainScope.launch {
            val pauseOnTranslate = preferences.getBoolean(PREF_TRANSLATOR_PAUSE_ON_TRANSLATE, true)
            val capturedBitmap = captureFrameBitmap()

            if (currentGen != activeTranslationGen || !isActive) {
                capturedBitmap?.recycle()
                return@launch
            }

            if (capturedBitmap != null) {
                if (pauseOnTranslate) {
                    isPausedByTranslator = true
                    try { onPauseEmulator() } catch (_: Throwable) {}
                }
                processCapturedFrame(capturedBitmap, customOverrideRegions = listOf(region), expectedGen = currentGen)
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

    private suspend fun processCapturedFrame(
        bitmap: Bitmap,
        forceFullscreen: Boolean = false,
        isAuto: Boolean = false,
        customOverrideRegions: List<TranslationRegion>? = null,
        expectedGen: Int = activeTranslationGen
    ) {
        coroutineScope {
            try {
                if (isAuto) {
                    val currentDHash = calculateDHash(bitmap)
                    val diff = hammingDistance(currentDHash, lastFrameDHash)
                    if (diff <= 2 && lastFrameDHash != 0L) {
                        // Screen Delta Diff: frame is identical -> skip OCR and translation!
                        overlayView?.isTranslating = false
                        return@coroutineScope
                    }
                    lastFrameDHash = currentDHash
                }

                val sourceLang = getSourceLang()
                val targetLang = preferences.getString(PREF_TRANSLATOR_TARGET_LANG, "ru") ?: "ru"

                val savedRegions = if (forceFullscreen) emptyList() else loadRegionsForCurrentGame()
                val defaultZone = TranslatorDefaultZone.fromPreference(
                    preferences.getString(PREF_TRANSLATOR_DEFAULT_ZONE, TranslatorDefaultZone.BOTH.preferenceValue)
                )
                val defaultZoneRegion = if (customOverrideRegions == null && savedRegions.isEmpty()) {
                    resolveDefaultZoneRegion(defaultZone, bitmap)
                } else {
                    null
                }
                val customRegions = when {
                    customOverrideRegions != null -> customOverrideRegions
                    savedRegions.isNotEmpty() -> savedRegions
                    defaultZoneRegion != null -> listOf(defaultZoneRegion)
                    else -> emptyList()
                }
                val allowFullscreenFallback = customOverrideRegions == null && savedRegions.isNotEmpty()

                var blocks = withTimeoutOrNull(8000) {
                    textRecognizer.recognizeTextBlocks(bitmap, sourceLang, customRegions)
                } ?: emptyList()

                // Fallback to fullscreen only for user-drawn ROI regions if they returned 0 blocks
                if (blocks.isEmpty() && allowFullscreenFallback) {
                    Log.i(TAG, "Custom regions returned 0 blocks, executing fullscreen fallback...")
                    blocks = withTimeoutOrNull(8000) {
                        textRecognizer.recognizeTextBlocks(bitmap, sourceLang, emptyList())
                    } ?: emptyList()
                }

                // Translate whole sentences: a line wrapped by the game ("...could join" + "me.")
                // must reach the engine as one sentence, otherwise the meaning is lost.
                blocks = me.magnum.melonds.translator.ocr.DialogueSentenceAssembler.mergeSentenceContinuations(blocks)

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
                    return@coroutineScope
                }

                val currentMerged = blocks.joinToString(" ") { it.originalText.trim() }.replace(Regex("\\s+"), " ").trim()
                if (isAuto && (currentMerged.length < 3 || currentMerged == lastTranslatedRawText)) {
                    overlayView?.isTranslating = false
                    return@coroutineScope
                }
                lastTranslatedRawText = currentMerged

                val (activeSpeakerName, activeSpeakerGender) = me.magnum.melonds.translator.grammar.SpeakerAndGenderResolver.resolveSpeakerAndGender(
                    blocks = blocks,
                    gameKey = getGameStorageKey(),
                    genderStore = characterGenderStore,
                    glossary = glossaryManager
                )
                ocrContextGraph.setExplicitActiveSpeaker(activeSpeakerName, activeSpeakerGender)

                val engine = resolveEngine()
                val engineType = preferences.getString(PREF_TRANSLATOR_ENGINE, "google") ?: "google"
                Log.i(TAG, "Translating ${blocks.size} blocks with ${engine.javaClass.simpleName} ($sourceLang -> $targetLang) [Speaker: $activeSpeakerName, Gender: $activeSpeakerGender]")

                val preparedTexts = blocks.map { block ->
                    val prepared = me.magnum.melonds.translator.util.GameTextCleaner.prepareForTranslation(block.originalText)
                    val textToTranslate = prepared.ifBlank { block.originalText.trim() }
                    glossaryManager.applyPreTranslation(textToTranslate)
                }

                val uncachedBlocks = mutableListOf<Int>()
                val uncachedTexts = mutableListOf<String>()
                for (i in blocks.indices) {
                    val textToTranslate = preparedTexts[i]
                    val cached = translationCache.get(engineType, sourceLang, targetLang, textToTranslate)
                    if (cached != null) {
                        val postCached = glossaryManager.applyPostTranslation(blocks[i].originalText, cached, targetLang)
                        val harmonizedCached = me.magnum.melonds.translator.grammar.RussianGrammarAndDeclensionEngine.harmonizeGenderAndStyle(
                            text = postCached,
                            speakerGender = activeSpeakerGender,
                            speakerName = activeSpeakerName,
                            targetLang = targetLang
                        )
                        blocks[i].translatedText = harmonizedCached
                        ocrContextGraph.recordDialogueTurn(textToTranslate, harmonizedCached)
                    } else {
                        uncachedBlocks.add(i)
                        uncachedTexts.add(textToTranslate)
                    }
                }

                if (uncachedBlocks.isNotEmpty()) {
                    try {
                        if (engine is MlKitOnDeviceTranslateEngine) {
                            val prepared = withTimeoutOrNull(30_000L) {
                                engine.prepare(sourceLang, targetLang)
                                true
                            }
                            if (prepared == null) {
                                throw TranslationException(activity.getString(R.string.translator_error_mlkit_model))
                            }
                        }

                        val contextPrompt = ocrContextGraph.buildTranslationContextPrompt()
                        val batchResults = withTimeoutOrNull(12_000L) {
                            engine.translateBatch(uncachedTexts, sourceLang, targetLang, contextPrompt)
                        } ?: throw TranslationException(activity.getString(R.string.translator_error_network))

                        for (k in uncachedBlocks.indices) {
                            val blockIdx = uncachedBlocks[k]
                            val block = blocks[blockIdx]
                            val textToTranslate = uncachedTexts[k]
                            val rawTranslated = batchResults.getOrNull(k)
                            val preGlossaryPolished = rawTranslated?.let { raw ->
                                val polished = me.magnum.melonds.translator.util.GameTextCleaner.polishTranslation(raw, targetLang)
                                ocrContextGraph.sanitizeTranslation(polished, targetLang)
                            }?.takeIf { it.isNotBlank() }

                            if (preGlossaryPolished != null &&
                                !preGlossaryPolished.equals(textToTranslate, ignoreCase = true) &&
                                !preGlossaryPolished.equals(block.originalText, ignoreCase = true)
                            ) {
                                translationCache.put(engineType, sourceLang, targetLang, textToTranslate, preGlossaryPolished)
                            }

                            val finalTranslation = preGlossaryPolished?.let { baseText ->
                                val postGlossary = glossaryManager.applyPostTranslation(block.originalText, baseText, targetLang)
                                me.magnum.melonds.translator.grammar.RussianGrammarAndDeclensionEngine.harmonizeGenderAndStyle(
                                    text = postGlossary,
                                    speakerGender = activeSpeakerGender,
                                    speakerName = activeSpeakerName,
                                    targetLang = targetLang
                                )
                            }?.takeIf { it.isNotBlank() } ?: block.originalText

                            block.translatedText = finalTranslation
                            ocrContextGraph.recordDialogueTurn(textToTranslate, finalTranslation)
                        }
                    } catch (e: TranslationException) {
                        Log.w(TAG, "Translation failed: ${e.message}", e)
                        showThrottledErrorToast(e.userMessage.ifBlank { e.message }, isAuto)
                        for (idx in uncachedBlocks) {
                            if (blocks[idx].translatedText.isBlank()) {
                                blocks[idx].translatedText = blocks[idx].originalText
                            }
                        }
                    }
                }

                if (expectedGen != activeTranslationGen || !isActive) {
                    return@coroutineScope
                }
                overlayView?.setTranslatedBlocks(blocks)

                // Record into 50-turn dialogue backlog store with smart deduplication
                if (blocks.isNotEmpty()) {
                    val fullSource = blocks.map { it.originalText.trim() }.filter { it.isNotBlank() }.joinToString("\n")
                    val fullTranslation = blocks.map { it.translatedText.trim() }.filter { it.isNotBlank() }.joinToString("\n")
                    if (fullSource.isNotBlank() && fullTranslation.isNotBlank()) {
                        backlogStore.addOrUpdate(
                            sourceText = fullSource,
                            translatedText = fullTranslation,
                            sourceLang = sourceLang,
                            targetLang = targetLang,
                            speakerName = activeSpeakerName,
                            speakerGender = activeSpeakerGender.name
                        )
                    }
                }

                val ttsOn = preferences.getBoolean(PREF_TRANSLATOR_TTS_ENABLED, false)
                if (ttsOn) {
                    ttsManager.speakBlocks(blocks, targetLang)
                }
            } catch (t: CancellationException) {
                throw t
            } catch (t: Throwable) {
                Log.e(TAG, "Process captured frame failed", t)
                val msg = t.message?.takeIf { it.isNotBlank() } ?: activity.getString(R.string.translator_no_text_found)
                showThrottledErrorToast(msg, isAuto)
                if (isPausedByTranslator) {
                    isPausedByTranslator = false
                    try { onResumeEmulator() } catch (_: Throwable) {}
                }
            } finally {
                overlayView?.isTranslating = false
                if (!bitmap.isRecycled) {
                    bitmap.recycle()
                }
            }
        }
    }

    @Volatile
    private var cachedEngineType: TranslatorEngineType? = null
    @Volatile
    private var cachedEngine: ITranslationEngine? = null

    private fun resolveEngine(): ITranslationEngine {
        val type = TranslatorEngineType.fromPreference(preferences.getString(PREF_TRANSLATOR_ENGINE, "google"))
        val existing = cachedEngine
        if (existing != null && cachedEngineType == type) {
            return existing
        }
        val created = when (type) {
            TranslatorEngineType.GOOGLE -> GoogleTranslateEngine(
                okHttpClient,
                MlKitOnDeviceTranslateEngine(activity, downloadIfMissing = false),
                activity
            )
            TranslatorEngineType.MLKIT_OFFLINE -> MlKitOnDeviceTranslateEngine(activity)
            TranslatorEngineType.DEEPL -> DeepLEngine(okHttpClient, context = activity) {
                preferences.getString(PREF_TRANSLATOR_DEEPL_KEY, "").orEmpty()
            }
            TranslatorEngineType.CUSTOM_AI -> CustomAiEngine(
                okHttpClient,
                context = activity,
                apiKeyProvider = { preferences.getString(PREF_TRANSLATOR_CUSTOM_AI_KEY, "").orEmpty() },
                endpointProvider = { preferences.getString(PREF_TRANSLATOR_CUSTOM_AI_ENDPOINT, "https://api.openai.com/v1/chat/completions").orEmpty() },
                modelProvider = { preferences.getString(PREF_TRANSLATOR_CUSTOM_AI_MODEL, "gpt-4o-mini").orEmpty() }
            )
        }
        cachedEngineType = type
        cachedEngine = created
        return created
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

    fun showDialogueBacklogAndGlossaryDialog(initialTab: Int = 0) {
        DialogueBacklogBottomSheet.show(
            activity = activity,
            backlogStore = backlogStore,
            glossaryManager = glossaryManager,
            onSpeakText = { text, lang ->
                speakTts(text, lang)
            },
            onInvalidateCache = { term ->
                invalidateGlossaryTerm(term)
            },
            initialTab = initialTab
        )
    }

    fun invalidateGlossaryTerm(term: String) {
        translationCache.evictContaining(term)
        lastTranslatedRawText = ""
        lastFrameDHash = 0L
        overlayView?.clearTranslations()
    }

    fun onDestroy() {
        preferences.unregisterOnSharedPreferenceChangeListener(prefChangeListener)
        stopAutoTranslate()
        ttsManager.destroy()
        translationCache.flush()
        cachedEngine = null
        cachedEngineType = null
        textRecognizer.close()
        MlKitOnDeviceTranslateEngine.closeAll()
        mainScope.cancel()
        mediaProjectionCapturer.onDestroy()
    }
}

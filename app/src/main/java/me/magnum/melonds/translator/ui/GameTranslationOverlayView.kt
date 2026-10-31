package me.magnum.melonds.translator.ui

import android.content.Context
import android.graphics.*
import android.os.Handler
import android.os.Looper
import android.text.Layout
import android.text.StaticLayout
import android.text.TextPaint
import android.util.AttributeSet
import android.view.HapticFeedbackConstants
import android.view.MotionEvent
import android.view.View
import me.magnum.melonds.R
import me.magnum.melonds.translator.dictionary.GameDictionaryService
import me.magnum.melonds.translator.model.TranslatedTextBlock
import me.magnum.melonds.translator.model.TranslationRegion
import me.magnum.melonds.translator.model.TranslatorOverlayStyle
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import kotlin.math.max
import kotlin.math.min

/**
 * Advanced In-Game Translation Overlay for Nintendo DS / DSi.
 * Features:
 * - Smart Comic/Manga Inpainting (Erases original pixel text with sampled background color & auto-fits translation)
 * - Quick Lasso / Box Drag Selection (Real-time finger drag box to translate any sign/menu on the fly)
 * - Tap-To-Dictionary & Furigana Lookup (Word breakdown, Romaji, definitions & TTS speech)
 * - Per-game Persistent OCR Region Editor & Custom Left Control Dock
 */
class GameTranslationOverlayView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private val viewScope = CoroutineScope(Dispatchers.Main + SupervisorJob())
    private val blocks = mutableListOf<TranslatedTextBlock>()
    val customRegions = mutableListOf<TranslationRegion>()

    var overlayStyle: TranslatorOverlayStyle = TranslatorOverlayStyle.SMART_BACKGROUND_MATCH
    var bubbleOpacity: Float = 0.92f
    var fontSizeScale: Float = 1.0f
    var isTranslating: Boolean = false
        set(value) {
            field = value
            invalidate()
        }

    var onTriggerTranslationRequested: (() -> Unit)? = null
    var onOpenBacklogRequested: (() -> Unit)? = null
    var onLassoRegionSelected: ((TranslationRegion) -> Unit)? = null
    var onDismissRequested: (() -> Unit)? = null
    var onRegionsSaved: ((List<TranslationRegion>) -> Unit)? = null
    var onSpeakWordRequested: ((String) -> Unit)? = null

    var showFloatingButton: Boolean = true
        set(value) {
            field = value
            invalidate()
        }

    var floatingButtonOpacity: Float = 0.35f
        private set

    var temporarilySuppressedByModal: Boolean = false
        private set

    fun setTemporarilySuppressedByModal(suppressed: Boolean) {
        if (temporarilySuppressedByModal != suppressed) {
            temporarilySuppressedByModal = suppressed
            postInvalidate()
        }
    }

    fun setFloatingButtonOpacity(opacity: Float) {
        val normalized = if (opacity > 1.0f) opacity / 100f else opacity
        floatingButtonOpacity = normalized.coerceIn(0.05f, 1.0f)
        applyFloatingButtonOpacity()
        postInvalidate()
    }

    private fun applyFloatingButtonOpacity() {
        val alpha = floatingButtonOpacity
        val accent = me.magnum.melonds.ui.theme.AppThemeManager.getAccentColor(context)
        val r = Color.red(accent)
        val g = Color.green(accent)
        val b = Color.blue(accent)
        // Ultra-airy translucent glass fill (#0F172A): scales smoothly across 5%..100%
        floatBtnPaint.alpha = (alpha * 230f).toInt().coerceIn(12, 230)
        floatBtnGlowPaint.color = Color.argb((alpha * 77f).toInt().coerceIn(8, 90), r, g, b)
        // Keep subtle touchable ghost outline even at low 5%-15% opacity
        floatBtnStrokePaint.color = Color.argb((alpha * 255f).toInt().coerceIn(40, 255), r, g, b)
        floatBtnDividerPaint.alpha = (alpha * 180f).toInt().coerceIn(30, 200)
        floatBtnTextPaint.color = Color.argb((alpha * 255f).toInt().coerceIn(55, 255), r, g, b)
        floatBtnBacklogTextPaint.alpha = (alpha * 255f).toInt().coerceIn(55, 255)
        shadowPaint.alpha = (alpha * 128f).toInt().coerceIn(10, 128)
    }

    var isEditRegionsMode: Boolean = false
        set(value) {
            field = value
            if (value) {
                blocks.clear()
                activeDictionaryResult = null
            }
            invalidate()
        }

    // Floating Translate Button State
    private val prefs by lazy { androidx.preference.PreferenceManager.getDefaultSharedPreferences(context) }
    private val density by lazy { context.resources.displayMetrics.density }
    private val floatBtnRadius: Float
        get() = max(60f, 26f * density)
    private var floatBtnX = -1f
    private var floatBtnY = -1f
    private var isDraggingFloatBtn = false
    private var dragStartX = 0f
    private var dragStartY = 0f
    private var hasMovedFloatBtn = false
    private val longPressHandler = Handler(Looper.getMainLooper())
    private var floatBtnDownX = 0f
    private val floatBtnPanelWidth: Float
        get() = floatBtnRadius * 3.4f
    private val floatBtnPanelHeight: Float
        get() = floatBtnRadius * 2f

    // Lasso / Box Drag Selection State
    var isLassoModeActive: Boolean = false
        set(value) {
            field = value
            invalidate()
        }
    private var isLassoDragging = false
    private var lassoStartX = 0f
    private var lassoStartY = 0f
    private val lassoRect = RectF()
    private var lastFloatBtnClickTime = 0L

    // Dictionary Card State
    private var activeDictionaryResult: GameDictionaryService.LookupResult? = null
    private val dictCardRect = RectF()
    private val dictCloseRect = RectF()
    private val dictSpeakRect = RectF()
    private val dictCopyRect = RectF()

    // Region Editor Touch State
    private enum class EditAction { NONE, DRAW_NEW, MOVE_REGION, RESIZE_REGION }
    private var currentEditAction = EditAction.NONE
    private var activeRegionIndex = -1
    private var touchDownX = 0f
    private var touchDownY = 0f
    private var regionInitialRect = RectF()
    private var drawingNewRect = RectF()

    // Base Paints
    private val bgPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply { style = Paint.Style.FILL }
    private val borderPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = 2.5f
        color = Color.parseColor("#4DFFFFFF")
    }
    private val shadowPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.FILL
        color = Color.parseColor("#80000000")
    }
    private val floatBtnPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.FILL
        color = Color.parseColor("#E60F172A")
    }
    private val floatBtnGlowPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.FILL
        color = Color.parseColor("#4D00E5FF")
    }
    private val floatBtnStrokePaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = 3.5f
        color = Color.parseColor("#FF00E5FF")
    }
    private val floatBtnTextPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.parseColor("#00E5FF")
        textAlign = Paint.Align.CENTER
        typeface = Typeface.create("sans-serif-medium", Typeface.BOLD)
        textSize = 28f
    }
    private val floatBtnDividerPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = 2f
        color = Color.parseColor("#475569")
    }
    private val floatBtnBacklogTextPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.parseColor("#10B981")
        textAlign = Paint.Align.CENTER
        typeface = Typeface.create("sans-serif-medium", Typeface.BOLD)
        textSize = 24f
    }

    init {
        applyFloatingButtonOpacity()
    }
    private val pixelFont12: Typeface? by lazy {
        try {
            androidx.core.content.res.ResourcesCompat.getFont(context, R.font.fusion_pixel_12px)
        } catch (_: Throwable) {
            null
        }
    }
    private val pixelFont10: Typeface? by lazy {
        try {
            androidx.core.content.res.ResourcesCompat.getFont(context, R.font.fusion_pixel_10px)
        } catch (_: Throwable) {
            null
        }
    }

    private val textPaint = TextPaint(Paint.ANTI_ALIAS_FLAG).apply {
        typeface = Typeface.create("sans-serif-medium", Typeface.BOLD)
    }
    private val progressPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = 6f
        color = Color.parseColor("#00E5FF")
        strokeCap = Paint.Cap.ROUND
    }

    // Lasso Paints
    private val lassoBgPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.FILL
        color = Color.argb(55, 0, 229, 255)
    }
    private val lassoBorderPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = 3.0f
        color = Color.parseColor("#00E5FF")
        pathEffect = DashPathEffect(floatArrayOf(15f, 10f), 0f)
    }
    private val lassoBadgePaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.FILL
        color = Color.parseColor("#E60F172A")
    }
    private val lassoBadgeTextPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.parseColor("#00E5FF")
        typeface = Typeface.DEFAULT_BOLD
        textSize = 22f
        textAlign = Paint.Align.CENTER
    }

    // Region Editor Paints
    private val regionBgPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.FILL
        color = Color.argb(45, 0, 229, 255)
    }
    private val regionBorderPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = 3.5f
        color = Color.parseColor("#00E5FF")
    }
    private val regionHandlePaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.FILL
        color = Color.parseColor("#00E5FF")
    }
    private val regionBadgeBgPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.FILL
        color = Color.parseColor("#E60F172A")
    }
    private val regionBadgeTextPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.parseColor("#00E5FF")
        typeface = Typeface.create("sans-serif-medium", Typeface.BOLD)
        textSize = 22f
    }
    private val closeBtnPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.FILL
        color = Color.parseColor("#CCEF4444")
    }
    private val closeBtnTextPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.WHITE
        textAlign = Paint.Align.CENTER
        typeface = Typeface.create("sans-serif-medium", Typeface.BOLD)
        textSize = 20f
    }
    private val topBarBtnPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.FILL
        color = Color.parseColor("#E60F172A")
    }
    private val topBarBtnBorderPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = 2f
        color = Color.parseColor("#8000E5FF")
    }
    private val topBarTextPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.WHITE
        textAlign = Paint.Align.CENTER
        typeface = Typeface.create("sans-serif-medium", Typeface.BOLD)
        textSize = 24f
    }

    private var progressAngle = 0f

    private data class LayoutCacheKey(
        val text: String,
        val maxW: Int,
        val maxH: Int,
        val color: Int,
        val isOutlineMode: Boolean,
        val usePixelFont: Boolean,
        val fontSizeScaleBits: Int
    )

    private class CachedBlockLayout(
        val fillLayout: StaticLayout,
        val strokeLayout: StaticLayout?
    )

    private val layoutCache = android.util.LruCache<LayoutCacheKey, CachedBlockLayout>(64)

    // Pre-allocated Dictionary Card Paints (avoids allocations in onDraw)
    private val dictHeaderPaint = TextPaint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.parseColor("#00E5FF")
        typeface = Typeface.DEFAULT_BOLD
        textSize = 24f
    }
    private val dictOrigPaint = TextPaint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.WHITE
        typeface = Typeface.DEFAULT_BOLD
        textSize = 28f
    }
    private val dictTransPaint = TextPaint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.parseColor("#94A3B8")
        typeface = Typeface.DEFAULT
        textSize = 22f
    }
    private val dictLinePaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.parseColor("#334155")
        strokeWidth = 1.5f
    }
    private val dictTokenPaint = TextPaint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.parseColor("#38BDF8")
        typeface = Typeface.DEFAULT_BOLD
        textSize = 22f
    }
    private val dictPosPaint = TextPaint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.parseColor("#F59E0B")
        typeface = Typeface.DEFAULT
        textSize = 18f
    }

    // Top action bar button bounding boxes
    private val btnAddRect = RectF()
    private val btnClearRect = RectF()
    private val btnSaveRect = RectF()
    private val btnCloseRect = RectF()

    fun setTranslatedBlocks(newBlocks: List<TranslatedTextBlock>) {
        blocks.clear()
        blocks.addAll(newBlocks)
        isTranslating = false
        activeDictionaryResult = null
        invalidate()
    }

    fun setSavedRegions(newRegions: List<TranslationRegion>) {
        customRegions.clear()
        customRegions.addAll(newRegions)
        invalidate()
    }

    fun clearTranslations() {
        blocks.clear()
        layoutCache.evictAll()
        activeDictionaryResult = null
        isTranslating = false
        invalidate()
    }

    fun hasActiveTranslations(): Boolean = blocks.isNotEmpty() || activeDictionaryResult != null

    fun enterRegionEditMode() {
        isEditRegionsMode = true
    }

    fun exitRegionEditMode(save: Boolean = true) {
        if (save) {
            onRegionsSaved?.invoke(customRegions.toList())
        }
        isEditRegionsMode = false
    }

    override fun onVisibilityChanged(changedView: View, visibility: Int) {
        super.onVisibilityChanged(changedView, visibility)
        if (visibility == VISIBLE) {
            if (width > 0 && height > 0) {
                initFloatBtnPosition(width, height)
            }
            requestLayout()
            invalidate()
        }
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        if (w <= 0 || h <= 0) return
        layoutCache.evictAll()
        initFloatBtnPosition(w, h)
        invalidate()
    }

    private fun initFloatBtnPosition(w: Int, h: Int) {
        val halfW = floatBtnPanelWidth / 2f
        val halfH = floatBtnPanelHeight / 2f
        val savedXRatio = prefs.getFloat("pref_translator_float_btn_x_ratio", -1f)
        val savedYRatio = prefs.getFloat("pref_translator_float_btn_y_ratio", -1f)
        if (savedXRatio in 0f..1f && savedYRatio in 0f..1f) {
            floatBtnX = (savedXRatio * w).coerceIn(halfW + 8f, w - halfW - 8f)
            floatBtnY = (savedYRatio * h).coerceIn(halfH + 8f, h - halfH - 8f)
        } else {
            floatBtnX = (w - halfW - 16f * density).coerceAtLeast(halfW)
            floatBtnY = (h * 0.40f).coerceIn(halfH + 8f, h - halfH - 8f)
        }
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        val w = width.toFloat()
        val h = height.toFloat()
        if (w <= 0 || h <= 0) return

        // 1. REGION EDIT MODE
        if (isEditRegionsMode) {
            canvas.drawColor(Color.argb(125, 0, 0, 0))

            for (i in customRegions.indices) {
                val region = customRegions[i]
                val l = region.rect.left * w
                val t = region.rect.top * h
                val r = region.rect.right * w
                val b = region.rect.bottom * h
                val rect = RectF(l, t, r, b)

                canvas.drawRoundRect(rect, 8f, 8f, regionBgPaint)
                canvas.drawRoundRect(rect, 8f, 8f, regionBorderPaint)

                val badgeText = context.getString(R.string.translator_region_badge, i + 1)
                val badgeW = regionBadgeTextPaint.measureText(badgeText) + 20f
                val badgeH = 34f
                val badgeRect = RectF(l, max(0f, t - badgeH - 4f), l + badgeW, max(badgeH, t - 4f))
                canvas.drawRoundRect(badgeRect, 6f, 6f, regionBadgeBgPaint)
                canvas.drawRoundRect(badgeRect, 6f, 6f, regionBorderPaint)
                canvas.drawText(badgeText, badgeRect.left + 10f, badgeRect.bottom - 9f, regionBadgeTextPaint)

                val closeRadius = 18f
                val closeCx = r - 4f
                val closeCy = t + 4f
                canvas.drawCircle(closeCx, closeCy, closeRadius, closeBtnPaint)
                val textY = closeCy - (closeBtnTextPaint.descent() + closeBtnTextPaint.ascent()) / 2f
                canvas.drawText("✕", closeCx, textY, closeBtnTextPaint)

                val handleSize = 22f
                val handleRect = RectF(r - handleSize, b - handleSize, r, b)
                canvas.drawRoundRect(handleRect, 4f, 4f, regionHandlePaint)
            }

            if (currentEditAction == EditAction.DRAW_NEW) {
                canvas.drawRoundRect(drawingNewRect, 8f, 8f, regionBgPaint)
                canvas.drawRoundRect(drawingNewRect, 8f, 8f, regionBorderPaint)
            }

            drawLeftControlDock(canvas, w, h)
            return
        }

        // 2. NORMAL TRANSLATION MODE (Modern Elevated Cyber Cards & In-place Text Replacement)
        val density = context.resources.displayMetrics.density
        val padH = 4f * density
        val padV = 2f * density

        for (block in blocks) {
            val left = block.boundingBox.left * w
            val top = block.boundingBox.top * h
            val right = block.boundingBox.right * w
            val bottom = block.boundingBox.bottom * h

            val displayText = if (block.isShowingOriginal) block.originalText else block.translatedText.ifBlank { block.originalText }

            val origW = right - left
            val origH = bottom - top

            // In-place replacement with graceful expansion for Russian/longer text
            val textLenRatio = if (block.originalText.isNotEmpty()) {
                (displayText.length.toFloat() / block.originalText.length.toFloat()).coerceIn(1.0f, 1.30f)
            } else 1.0f

            val targetW = max(origW * textLenRatio, origW) + padH * 2
            val targetH = origH + padV * 2

            val centerX = (left + right) / 2f
            val centerY = (top + bottom) / 2f

            val boxLeft = (centerX - targetW / 2f).coerceIn(2f, (w - targetW - 2f).coerceAtLeast(2f))
            val boxRight = (boxLeft + targetW).coerceAtMost(w - 2f)
            val boxTop = (centerY - targetH / 2f).coerceIn(2f, (h - targetH - 2f).coerceAtLeast(2f))
            val boxBottom = (boxTop + targetH).coerceAtMost(h - 2f)

            val rect = RectF(boxLeft, boxTop, boxRight, boxBottom)
            val rx = when (overlayStyle) {
                TranslatorOverlayStyle.TRANSLUCENT_BUBBLE -> rect.height() / 2f
                TranslatorOverlayStyle.SMART_BACKGROUND_MATCH -> 2f * density
                else -> 6f * density
            }

            val alpha = (bubbleOpacity.coerceIn(0.10f, 1.0f) * 255).toInt().coerceIn(25, 255)
            var cardTextColor = Color.WHITE

            when (overlayStyle) {
                TranslatorOverlayStyle.OUTLINE_ONLY -> {
                    // No card background, draw text with high-contrast subtitle outline
                    cardTextColor = Color.WHITE
                }
                TranslatorOverlayStyle.SEMI_TRANSPARENT -> {
                    // Modern dark slate card (#0F172A) with subtle cyan cyber border
                    shadowPaint.color = Color.argb((alpha * 0.4f).toInt(), 0, 0, 0)
                    canvas.drawRoundRect(RectF(rect.left + 2f, rect.top + 3f, rect.right + 2f, rect.bottom + 3f), rx, rx, shadowPaint)

                    bgPaint.color = Color.argb((alpha * 0.94f).toInt(), 15, 23, 42)
                    canvas.drawRoundRect(rect, rx, rx, bgPaint)

                    borderPaint.color = Color.argb((alpha * 0.65f).toInt(), 0, 229, 255)
                    borderPaint.strokeWidth = 2.0f
                    canvas.drawRoundRect(rect, rx, rx, borderPaint)
                    cardTextColor = Color.WHITE
                }
                TranslatorOverlayStyle.TRANSLUCENT_BUBBLE -> {
                    // Pill/bubble card with luminous cyan outline
                    shadowPaint.color = Color.argb((alpha * 0.4f).toInt(), 0, 0, 0)
                    canvas.drawRoundRect(RectF(rect.left + 2f, rect.top + 3f, rect.right + 2f, rect.bottom + 3f), rx, rx, shadowPaint)

                    bgPaint.color = Color.argb((alpha * 0.92f).toInt(), 15, 23, 42)
                    canvas.drawRoundRect(rect, rx, rx, bgPaint)

                    borderPaint.color = Color.argb((alpha * 0.85f).toInt(), 0, 229, 255)
                    borderPaint.strokeWidth = 2.2f
                    canvas.drawRoundRect(rect, rx, rx, borderPaint)
                    cardTextColor = Color.WHITE
                }
                TranslatorOverlayStyle.SMART_BACKGROUND_MATCH -> {
                    // Authentic Game Inpainting: seamless patch using sampled dialogue background color
                    val baseCol = block.backgroundColor
                    val r = Color.red(baseCol)
                    val g = Color.green(baseCol)
                    val b = Color.blue(baseCol)
                    val lum = 0.299f * r + 0.587f * g + 0.114f * b

                    // Draw inpaint background patch seamlessly over original game text
                    bgPaint.color = Color.argb(alpha, r, g, b)
                    canvas.drawRoundRect(rect, rx, rx, bgPaint)

                    // Optional subtle 1px border matching background tone with gentle contrast
                    val borderDelta = if (lum > 128) -25 else 25
                    borderPaint.color = Color.argb(
                        (alpha * 0.40f).toInt(),
                        (r + borderDelta).coerceIn(0, 255),
                        (g + borderDelta).coerceIn(0, 255),
                        (b + borderDelta).coerceIn(0, 255)
                    )
                    borderPaint.strokeWidth = 1.0f * density
                    canvas.drawRoundRect(rect, rx, rx, borderPaint)

                    // Dynamic high-contrast text color
                    cardTextColor = if (lum > 135) {
                        // Light background (parchment/beige/white) -> crisp dark charcoal
                        Color.parseColor("#111827")
                    } else {
                        // Dark background (navy/slate/black) -> clean white
                        Color.parseColor("#F9FAFB")
                    }
                }
            }

            drawFittedText(
                canvas,
                displayText,
                rect,
                cardTextColor,
                isOutlineMode = (overlayStyle == TranslatorOverlayStyle.OUTLINE_ONLY),
                usePixelFont = true
            )
        }

        // 3. LASSO / BOX DRAG SELECTION OVERLAY
        if (isLassoModeActive) {
            val bannerText = context.getString(R.string.translator_lasso_hint)
            val bannerW = min(w * 0.85f, 420f)
            val bannerH = 44f
            val bannerRect = RectF((w - bannerW) / 2f, 24f, (w + bannerW) / 2f, 24f + bannerH)
            canvas.drawRoundRect(bannerRect, 12f, 12f, lassoBadgePaint)
            canvas.drawRoundRect(bannerRect, 12f, 12f, regionBorderPaint)
            canvas.drawText(bannerText, bannerRect.centerX(), bannerRect.centerY() + 7f, lassoBadgeTextPaint)
        }

        if (isLassoDragging && !lassoRect.isEmpty) {
            canvas.drawRoundRect(lassoRect, 10f, 10f, lassoBgPaint)
            canvas.drawRoundRect(lassoRect, 10f, 10f, lassoBorderPaint)

            val badgeText = context.getString(R.string.translator_lasso_translate)
            val badgeW = 200f
            val badgeH = 36f
            val badgeRect = RectF(
                lassoRect.centerX() - badgeW / 2f,
                max(8f, lassoRect.top - badgeH - 6f),
                lassoRect.centerX() + badgeW / 2f,
                max(8f + badgeH, lassoRect.top - 6f)
            )
            canvas.drawRoundRect(badgeRect, 8f, 8f, lassoBadgePaint)
            canvas.drawRoundRect(badgeRect, 8f, 8f, regionBorderPaint)
            canvas.drawText(badgeText, badgeRect.centerX(), badgeRect.centerY() + 7f, lassoBadgeTextPaint)
        }

        // 4. DICTIONARY & LINGUISTIC LOOKUP CARD (Tap-To-Dictionary)
        activeDictionaryResult?.let { dict ->
            drawDictionaryCard(canvas, dict, w, h)
        }

        // 5. TRANSLATION SPINNER
        if (isTranslating) {
            val cx = w / 2f
            val cy = h * 0.40f
            val spinnerRadius = 45f

            bgPaint.color = Color.parseColor("#CC0F172A")
            canvas.drawCircle(cx, cy, spinnerRadius * 1.5f, bgPaint)

            progressAngle = (progressAngle + 12f) % 360f
            val spinnerRect = RectF(cx - spinnerRadius, cy - spinnerRadius, cx + spinnerRadius, cy + spinnerRadius)
            canvas.drawArc(spinnerRect, progressAngle, 260f, false, progressPaint)
            val dirtyR = (spinnerRadius * 1.6f).toInt()
            postInvalidateOnAnimation(
                (cx - dirtyR).toInt(),
                (cy - dirtyR).toInt(),
                (cx + dirtyR).toInt(),
                (cy + dirtyR).toInt()
            )
        }

        // 6. FLOATING DUAL-ACTION PANEL (TR + LOG)
        if (showFloatingButton && !temporarilySuppressedByModal) {
            applyFloatingButtonOpacity()
            val halfW = floatBtnPanelWidth / 2f
            val halfH = floatBtnPanelHeight / 2f
            val cornerR = floatBtnRadius

            if (floatBtnX < 0f || floatBtnY < 0f) {
                initFloatBtnPosition(w.toInt(), h.toInt())
            } else {
                floatBtnX = floatBtnX.coerceIn(halfW + 8f, w - halfW - 8f)
                floatBtnY = floatBtnY.coerceIn(halfH + 8f, h - halfH - 8f)
            }

            val panelRect = RectF(floatBtnX - halfW, floatBtnY - halfH, floatBtnX + halfW, floatBtnY + halfH)

            // Drop shadow & Cyber glow
            canvas.drawRoundRect(RectF(panelRect.left + 2f, panelRect.top + 3f, panelRect.right + 2f, panelRect.bottom + 3f), cornerR, cornerR, shadowPaint)
            canvas.drawRoundRect(RectF(panelRect.left - 2f, panelRect.top - 2f, panelRect.right + 2f, panelRect.bottom + 2f), cornerR + 2f, cornerR + 2f, floatBtnGlowPaint)

            // Elevated Slate Base & Neon Border
            canvas.drawRoundRect(panelRect, cornerR, cornerR, floatBtnPaint)
            canvas.drawRoundRect(panelRect, cornerR, cornerR, floatBtnStrokePaint)

            // Center vertical divider
            canvas.drawLine(floatBtnX, panelRect.top + 8f * density, floatBtnX, panelRect.bottom - 8f * density, floatBtnDividerPaint)

            // Left Action: TR (Translate / Lasso)
            val leftCx = floatBtnX - halfW / 2f
            val textY = floatBtnY - (floatBtnTextPaint.descent() + floatBtnTextPaint.ascent()) / 2f
            canvas.drawText("TR", leftCx, textY, floatBtnTextPaint)

            // Right Action: LOG (Dialogue Backlog)
            val rightCx = floatBtnX + halfW / 2f
            val logTextY = floatBtnY - (floatBtnBacklogTextPaint.descent() + floatBtnBacklogTextPaint.ascent()) / 2f
            canvas.drawText("LOG", rightCx, logTextY, floatBtnBacklogTextPaint)
        }
    }

    var onFloatingButtonLongClickListener: (() -> Unit)? = null

    private val longPressRunnable = Runnable {
        if (isDraggingFloatBtn && !hasMovedFloatBtn) {
            isDraggingFloatBtn = false
            performHapticFeedback(HapticFeedbackConstants.LONG_PRESS)
            if (floatBtnDownX < floatBtnX) {
                if (onFloatingButtonLongClickListener != null) {
                    onFloatingButtonLongClickListener?.invoke()
                } else {
                    enterRegionEditMode()
                }
            } else {
                onOpenBacklogRequested?.invoke()
            }
        }
    }

    private fun drawDictionaryCard(canvas: Canvas, dict: GameDictionaryService.LookupResult, w: Float, h: Float) {
        val cardW = min(w * 0.92f, 540f)
        val cardH = min(h * 0.70f, 380f)
        val cardL = (w - cardW) / 2f
        val cardT = (h - cardH) / 2f
        dictCardRect.set(cardL, cardT, cardL + cardW, cardT + cardH)

        // Backdrop
        canvas.drawColor(Color.argb(130, 0, 0, 0))

        // Card Shadow and Base
        canvas.drawRoundRect(RectF(dictCardRect.left + 4f, dictCardRect.top + 6f, dictCardRect.right + 4f, dictCardRect.bottom + 6f), 18f, 18f, shadowPaint)
        bgPaint.color = Color.parseColor("#F20F172A")
        canvas.drawRoundRect(dictCardRect, 18f, 18f, bgPaint)
        borderPaint.color = me.magnum.melonds.ui.theme.AppThemeManager.getAccentColor(context)
        borderPaint.strokeWidth = 3f
        canvas.drawRoundRect(dictCardRect, 18f, 18f, borderPaint)

        // Close Button (✕)
        dictCloseRect.set(dictCardRect.right - 44f, dictCardRect.top + 12f, dictCardRect.right - 12f, dictCardRect.top + 44f)
        canvas.drawRoundRect(dictCloseRect, 8f, 8f, closeBtnPaint)
        canvas.drawText("✕", dictCloseRect.centerX(), dictCloseRect.centerY() + 7f, closeBtnTextPaint)

        // Header Title
        canvas.drawText("📖 ${context.getString(R.string.translator_dict_title)}", dictCardRect.left + 20f, dictCardRect.top + 34f, dictHeaderPaint)

        var curY = dictCardRect.top + 64f

        // Original Text
        canvas.drawText(dict.query.take(45), dictCardRect.left + 20f, curY, dictOrigPaint)
        curY += 34f

        // Full Translation
        canvas.drawText(dict.fullTranslation.take(55), dictCardRect.left + 20f, curY, dictTransPaint)
        curY += 36f

        // Divider
        canvas.drawLine(dictCardRect.left + 20f, curY, dictCardRect.right - 20f, curY, dictLinePaint)
        curY += 24f

        // Word tokens breakdown
        for (word in dict.words.take(3)) {
            val romajiStr = if (word.romaji.isNotBlank()) " [${word.romaji}]" else ""
            val tokenStr = "• ${word.original}$romajiStr"
            canvas.drawText(tokenStr, dictCardRect.left + 20f, curY, dictTokenPaint)
            canvas.drawText(" (${word.partOfSpeech})", dictCardRect.left + 20f + dictTokenPaint.measureText(tokenStr), curY, dictPosPaint)
            curY += 28f
        }

        // Action Buttons: Speak + Copy
        dictSpeakRect.set(dictCardRect.left + 20f, dictCardRect.bottom - 52f, dictCardRect.left + 160f, dictCardRect.bottom - 14f)
        topBarBtnPaint.color = Color.parseColor("#10B981")
        canvas.drawRoundRect(dictSpeakRect, 10f, 10f, topBarBtnPaint)
        topBarTextPaint.color = Color.WHITE
        topBarTextPaint.textSize = 20f
        canvas.drawText(context.getString(R.string.translator_speak_action), dictSpeakRect.centerX(), dictSpeakRect.centerY() + 7f, topBarTextPaint)

        dictCopyRect.set(dictSpeakRect.right + 12f, dictCardRect.bottom - 52f, dictSpeakRect.right + 172f, dictCardRect.bottom - 14f)
        topBarBtnPaint.color = Color.parseColor("#3B82F6")
        canvas.drawRoundRect(dictCopyRect, 10f, 10f, topBarBtnPaint)
        canvas.drawText(context.getString(R.string.translator_copy_action), dictCopyRect.centerX(), dictCopyRect.centerY() + 7f, topBarTextPaint)
    }

    private fun drawLeftControlDock(canvas: Canvas, w: Float, h: Float) {
        val density = context.resources.displayMetrics.density
        val dockW = max(220f, 160f * density)
        val btnH = max(66f, 48f * density)
        val spacing = max(16f, 12f * density)
        val padV = max(18f, 14f * density)
        val totalH = btnH * 4 + spacing * 3 + padV * 2
        val startX = max(24f, 16f * density)
        val startY = max(24f, (h - totalH) / 2f)

        val dockRect = RectF(startX, startY, startX + dockW, startY + totalH)
        canvas.drawRoundRect(dockRect, 20f, 20f, shadowPaint)
        bgPaint.color = Color.parseColor("#E60F172A")
        canvas.drawRoundRect(dockRect, 20f, 20f, bgPaint)
        val dockAccent = me.magnum.melonds.ui.theme.AppThemeManager.getAccentColor(context)
        borderPaint.color = Color.argb(77, Color.red(dockAccent), Color.green(dockAccent), Color.blue(dockAccent))
        canvas.drawRoundRect(dockRect, 20f, 20f, borderPaint)

        var curY = startY + padV
        drawColorfulDockButton(canvas, btnAddRect, startX + 16f, curY, dockW - 32f, btnH, context.getString(R.string.translator_add_region), "#00E5FF")
        curY += btnH + spacing
        drawColorfulDockButton(canvas, btnClearRect, startX + 16f, curY, dockW - 32f, btnH, context.getString(R.string.translator_clear_regions), "#FFAA00")
        curY += btnH + spacing
        drawColorfulDockButton(canvas, btnSaveRect, startX + 16f, curY, dockW - 32f, btnH, context.getString(R.string.translator_save_regions), "#10B981")
        curY += btnH + spacing
        drawColorfulDockButton(canvas, btnCloseRect, startX + 16f, curY, dockW - 32f, btnH, context.getString(R.string.translator_close_regions), "#EF4444")
    }

    private fun drawColorfulDockButton(canvas: Canvas, targetRect: RectF, x: Float, y: Float, w: Float, h: Float, text: String, colorHex: String) {
        targetRect.set(x, y, x + w, y + h)
        val rx = 14f
        val color = Color.parseColor(colorHex)

        topBarBtnPaint.color = Color.argb(45, Color.red(color), Color.green(color), Color.blue(color))
        topBarBtnBorderPaint.color = color
        topBarBtnBorderPaint.strokeWidth = 2.5f
        topBarTextPaint.color = color

        canvas.drawRoundRect(targetRect, rx, rx, topBarBtnPaint)
        canvas.drawRoundRect(targetRect, rx, rx, topBarBtnBorderPaint)

        val density = context.resources.displayMetrics.density
        topBarTextPaint.textSize = max(25f, 14.5f * density)
        topBarTextPaint.typeface = Typeface.DEFAULT_BOLD
        val textY = targetRect.centerY() - (topBarTextPaint.descent() + topBarTextPaint.ascent()) / 2f
        canvas.drawText(text, targetRect.centerX(), textY, topBarTextPaint)
    }

    private fun drawFittedText(
        canvas: Canvas,
        text: String,
        bounds: RectF,
        color: Int,
        isOutlineMode: Boolean = false,
        usePixelFont: Boolean = true
    ) {
        val density = context.resources.displayMetrics.density
        val padH = 4f * density
        val padV = 2f * density
        val maxW = max(10, (bounds.width() - padH * 2).toInt())
        val maxH = max(10, (bounds.height() - padV * 2).toInt())

        val chosenTypeface = if (usePixelFont) {
            pixelFont12 ?: pixelFont10 ?: Typeface.create("sans-serif-medium", Typeface.BOLD)
        } else {
            Typeface.create("sans-serif-medium", Typeface.BOLD)
        }

        val r = Color.red(color)
        val g = Color.green(color)
        val b = Color.blue(color)
        val lum = 0.299f * r + 0.587f * g + 0.114f * b

        val cacheKey = LayoutCacheKey(
            text = text,
            maxW = maxW,
            maxH = maxH,
            color = color,
            isOutlineMode = isOutlineMode,
            usePixelFont = usePixelFont,
            fontSizeScaleBits = fontSizeScale.toBits()
        )

        val cached = layoutCache.get(cacheKey) ?: run {
            val fillPaint = TextPaint(textPaint).apply {
                typeface = chosenTypeface
                this.color = color
                if (!isOutlineMode && lum > 140) {
                    setShadowLayer(3f, 0f, 1.5f, Color.argb(160, 0, 0, 0))
                } else {
                    clearShadowLayer()
                }
            }

            val isSingleWordOrButton = !text.contains(' ') && text.length < 15
            val alignment = if (isSingleWordOrButton) Layout.Alignment.ALIGN_CENTER else Layout.Alignment.ALIGN_NORMAL
            val lineSpacingExtra = 1f * density
            val lineSpacingMult = 1.10f

            var low = 10f
            var high = (bounds.height() * 0.70f * fontSizeScale).coerceIn(12f, 44f)
            var bestSize = low
            var bestLayout: StaticLayout? = null

            for (iter in 0 until 6) {
                val mid = (low + high) / 2f
                fillPaint.textSize = mid
                val testLayout = StaticLayout.Builder.obtain(text, 0, text.length, fillPaint, maxW)
                    .setAlignment(alignment)
                    .setLineSpacing(lineSpacingExtra, lineSpacingMult)
                    .setIncludePad(false)
                    .build()

                if (testLayout.height <= maxH) {
                    bestSize = mid
                    bestLayout = testLayout
                    low = mid + 0.5f
                } else {
                    high = mid - 0.5f
                }
            }

            val finalLayout = bestLayout ?: run {
                fillPaint.textSize = bestSize
                StaticLayout.Builder.obtain(text, 0, text.length, fillPaint, maxW)
                    .setAlignment(alignment)
                    .setLineSpacing(lineSpacingExtra, lineSpacingMult)
                    .setIncludePad(false)
                    .build()
            }

            val strokeLayout = if (isOutlineMode) {
                val strokePaint = TextPaint(fillPaint).apply {
                    style = Paint.Style.STROKE
                    strokeWidth = (bestSize * 0.16f).coerceIn(2.5f, 5.0f)
                    strokeCap = Paint.Cap.ROUND
                    strokeJoin = Paint.Join.ROUND
                    this.color = Color.argb(240, 0, 0, 0)
                    clearShadowLayer()
                }
                StaticLayout.Builder.obtain(text, 0, text.length, strokePaint, maxW)
                    .setAlignment(alignment)
                    .setLineSpacing(lineSpacingExtra, lineSpacingMult)
                    .setIncludePad(false)
                    .build()
            } else {
                null
            }

            CachedBlockLayout(finalLayout, strokeLayout).also {
                layoutCache.put(cacheKey, it)
            }
        }

        val textX = bounds.left + padH
        val textY = bounds.top + max(padV, (bounds.height() - cached.fillLayout.height) / 2f)

        canvas.save()
        canvas.translate(textX, textY)
        cached.strokeLayout?.draw(canvas)
        cached.fillLayout.draw(canvas)
        canvas.restore()
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        val x = event.x
        val y = event.y
        val w = width.toFloat()
        val h = height.toFloat()

        // 1. DICTIONARY CARD TOUCH INTERACTION
        if (activeDictionaryResult != null) {
            if (event.actionMasked == MotionEvent.ACTION_DOWN) {
                if (dictCloseRect.contains(x, y)) {
                    activeDictionaryResult = null
                    invalidate()
                    return true
                }
                if (dictSpeakRect.contains(x, y)) {
                    onSpeakWordRequested?.invoke(activeDictionaryResult!!.query)
                    return true
                }
                if (dictCopyRect.contains(x, y)) {
                    val textToCopy = "${activeDictionaryResult!!.query}\n${activeDictionaryResult!!.fullTranslation}"
                    val clipboard = context.getSystemService(android.content.Context.CLIPBOARD_SERVICE) as? android.content.ClipboardManager
                    clipboard?.setPrimaryClip(android.content.ClipData.newPlainText("Game Dictionary", textToCopy))
                    android.widget.Toast.makeText(context, context.getString(R.string.translator_copied_to_clipboard), android.widget.Toast.LENGTH_SHORT).show()
                    return true
                }
                if (!dictCardRect.contains(x, y)) {
                    activeDictionaryResult = null
                    invalidate()
                    return true
                }
                return true
            }
            return true
        }

        // 2. REGION EDIT MODE TOUCH
        if (isEditRegionsMode) {
            when (event.actionMasked) {
                MotionEvent.ACTION_DOWN -> {
                    if (btnAddRect.contains(x, y)) {
                        val defaultW = 0.80f
                        val defaultH = 0.28f
                        val newRegion = TranslationRegion(
                            rect = RectF(0.10f, 0.55f, 0.10f + defaultW, 0.55f + defaultH)
                        )
                        customRegions.add(newRegion)
                        invalidate()
                        return true
                    }
                    if (btnClearRect.contains(x, y)) {
                        customRegions.clear()
                        invalidate()
                        return true
                    }
                    if (btnSaveRect.contains(x, y)) {
                        exitRegionEditMode(save = true)
                        return true
                    }
                    if (btnCloseRect.contains(x, y)) {
                        exitRegionEditMode(save = false)
                        return true
                    }

                    for (i in customRegions.indices.reversed()) {
                        val region = customRegions[i]
                        val r = region.rect.right * w
                        val t = region.rect.top * h
                        val closeDist = Math.hypot((x - r).toDouble(), (y - t).toDouble()).toFloat()
                        if (closeDist <= 32f) {
                            customRegions.removeAt(i)
                            invalidate()
                            return true
                        }

                        val b = region.rect.bottom * h
                        val handleDist = Math.hypot((x - r).toDouble(), (y - b).toDouble()).toFloat()
                        if (handleDist <= 36f) {
                            currentEditAction = EditAction.RESIZE_REGION
                            activeRegionIndex = i
                            touchDownX = x
                            touchDownY = y
                            regionInitialRect.set(region.rect)
                            return true
                        }

                        val l = region.rect.left * w
                        if (RectF(l, t, r, b).contains(x, y)) {
                            currentEditAction = EditAction.MOVE_REGION
                            activeRegionIndex = i
                            touchDownX = x
                            touchDownY = y
                            regionInitialRect.set(region.rect)
                            return true
                        }
                    }

                    currentEditAction = EditAction.DRAW_NEW
                    touchDownX = x
                    touchDownY = y
                    drawingNewRect.set(x, y, x, y)
                    invalidate()
                    return true
                }
                MotionEvent.ACTION_MOVE -> {
                    when (currentEditAction) {
                        EditAction.DRAW_NEW -> {
                            drawingNewRect.set(min(touchDownX, x), min(touchDownY, y), max(touchDownX, x), max(touchDownY, y))
                            invalidate()
                        }
                        EditAction.MOVE_REGION -> {
                            if (activeRegionIndex in customRegions.indices) {
                                val dx = (x - touchDownX) / w
                                val dy = (y - touchDownY) / h
                                val curW = regionInitialRect.width()
                                val curH = regionInitialRect.height()
                                val newL = (regionInitialRect.left + dx).coerceIn(0f, 1f - curW)
                                val newT = (regionInitialRect.top + dy).coerceIn(0f, 1f - curH)
                                customRegions[activeRegionIndex] = customRegions[activeRegionIndex].copy(
                                    rect = RectF(newL, newT, newL + curW, newT + curH)
                                )
                                invalidate()
                            }
                        }
                        EditAction.RESIZE_REGION -> {
                            if (activeRegionIndex in customRegions.indices) {
                                val dx = (x - touchDownX) / w
                                val dy = (y - touchDownY) / h
                                val newR = (regionInitialRect.right + dx).coerceIn(regionInitialRect.left + 0.05f, 1f)
                                val newB = (regionInitialRect.bottom + dy).coerceIn(regionInitialRect.top + 0.05f, 1f)
                                customRegions[activeRegionIndex] = customRegions[activeRegionIndex].copy(
                                    rect = RectF(regionInitialRect.left, regionInitialRect.top, newR, newB)
                                )
                                invalidate()
                            }
                        }
                        else -> {}
                    }
                    return true
                }
                MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                    if (currentEditAction == EditAction.DRAW_NEW) {
                        val minPx = 40f
                        if (drawingNewRect.width() >= minPx && drawingNewRect.height() >= minPx) {
                            val newRegion = TranslationRegion(
                                rect = RectF(
                                    drawingNewRect.left / w,
                                    drawingNewRect.top / h,
                                    drawingNewRect.right / w,
                                    drawingNewRect.bottom / h
                                )
                            )
                            customRegions.add(newRegion)
                        }
                    }
                    currentEditAction = EditAction.NONE
                    activeRegionIndex = -1
                    invalidate()
                    return true
                }
            }
        }

        // 3. LASSO MODE TOUCH (Active on double-tap)
        if (isLassoModeActive) {
            when (event.actionMasked) {
                MotionEvent.ACTION_DOWN -> {
                    isLassoDragging = true
                    lassoStartX = x
                    lassoStartY = y
                    lassoRect.set(x, y, x, y)
                    invalidate()
                    return true
                }
                MotionEvent.ACTION_MOVE -> {
                    lassoRect.set(min(lassoStartX, x), min(lassoStartY, y), max(lassoStartX, x), max(lassoStartY, y))
                    invalidate()
                    return true
                }
                MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                    isLassoModeActive = false
                    isLassoDragging = false
                    val minDrag = 35f
                    if (lassoRect.width() >= minDrag && lassoRect.height() >= minDrag) {
                        val relRect = RectF(
                            (lassoRect.left / w).coerceIn(0f, 1f),
                            (lassoRect.top / h).coerceIn(0f, 1f),
                            (lassoRect.right / w).coerceIn(0f, 1f),
                            (lassoRect.bottom / h).coerceIn(0f, 1f)
                        )
                        lassoRect.setEmpty()
                        invalidate()
                        onLassoRegionSelected?.invoke(TranslationRegion(rect = relRect))
                        return true
                    }
                    lassoRect.setEmpty()
                    invalidate()
                    return true
                }
            }
        }

        // 4. FLOATING BUTTON & ACTIVE TRANSLATION TOUCH
        when (event.actionMasked) {
            MotionEvent.ACTION_DOWN -> {
                val halfW = floatBtnPanelWidth / 2f
                val halfH = floatBtnPanelHeight / 2f
                val touchRect = RectF(
                    floatBtnX - halfW - 12f,
                    floatBtnY - halfH - 12f,
                    floatBtnX + halfW + 12f,
                    floatBtnY + halfH + 12f
                )
                if (showFloatingButton && !temporarilySuppressedByModal && touchRect.contains(x, y)) {
                    isDraggingFloatBtn = true
                    hasMovedFloatBtn = false
                    dragStartX = x
                    dragStartY = y
                    floatBtnDownX = x
                    longPressHandler.postDelayed(longPressRunnable, 500)
                    return true
                }

                // Check tap on active translated blocks -> Open Tap-To-Dictionary
                if (blocks.isNotEmpty()) {
                    for (block in blocks) {
                        val bl = block.boundingBox.left * w
                        val bt = block.boundingBox.top * h
                        val br = block.boundingBox.right * w
                        val bb = block.boundingBox.bottom * h
                        if (RectF(bl - 10f, bt - 10f, br + 10f, bb + 10f).contains(x, y)) {
                            viewScope.launch {
                                val lookupResult = GameDictionaryService.lookup(block.originalText, block.translatedText)
                                activeDictionaryResult = lookupResult
                                invalidate()
                            }
                            return true
                        }
                    }
                    // Tap on empty area dismisses translations
                    onDismissRequested?.invoke()
                    return true
                }

                // If not touching floating button and no active translation, do NOT block game controls!
                return false
            }
            MotionEvent.ACTION_MOVE -> {
                if (isDraggingFloatBtn) {
                    val moveDist = Math.hypot((x - dragStartX).toDouble(), (y - dragStartY).toDouble()).toFloat()
                    if (moveDist > 16f) {
                        hasMovedFloatBtn = true
                        longPressHandler.removeCallbacks(longPressRunnable)
                    }
                    floatBtnX = x
                    floatBtnY = y
                    invalidate()
                    return true
                }
            }
            MotionEvent.ACTION_UP -> {
                if (isDraggingFloatBtn) {
                    longPressHandler.removeCallbacks(longPressRunnable)
                    isDraggingFloatBtn = false
                    if (hasMovedFloatBtn && w > 0f && h > 0f) {
                        prefs.edit()
                            .putFloat("pref_translator_float_btn_x_ratio", (floatBtnX / w).coerceIn(0f, 1f))
                            .putFloat("pref_translator_float_btn_y_ratio", (floatBtnY / h).coerceIn(0f, 1f))
                            .apply()
                    } else if (!hasMovedFloatBtn) {
                        if (floatBtnDownX < floatBtnX) {
                            // Tapped left action: TR
                            val now = System.currentTimeMillis()
                            if (now - lastFloatBtnClickTime <= 350L) {
                                lastFloatBtnClickTime = 0L
                                isLassoModeActive = true
                                invalidate()
                            } else {
                                lastFloatBtnClickTime = now
                                onTriggerTranslationRequested?.invoke()
                            }
                        } else {
                            // Tapped right action: LOG (Dialogue Backlog)
                            performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY)
                            onOpenBacklogRequested?.invoke()
                        }
                    }
                    invalidate()
                    return true
                }
            }
            MotionEvent.ACTION_CANCEL -> {
                longPressHandler.removeCallbacks(longPressRunnable)
                isDraggingFloatBtn = false
                invalidate()
            }
        }

        return false
    }
}

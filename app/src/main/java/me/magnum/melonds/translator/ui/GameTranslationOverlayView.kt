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
    var onLassoRegionSelected: ((TranslationRegion) -> Unit)? = null
    var onDismissRequested: (() -> Unit)? = null
    var onRegionsSaved: ((List<TranslationRegion>) -> Unit)? = null
    var onSpeakWordRequested: ((String) -> Unit)? = null

    var showFloatingButton: Boolean = true
        set(value) {
            field = value
            invalidate()
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
    private var floatBtnX = 70f
    private var floatBtnY = 280f
    private val floatBtnRadius = 65f
    private var isDraggingFloatBtn = false
    private var dragStartX = 0f
    private var dragStartY = 0f
    private var hasMovedFloatBtn = false
    private val longPressHandler = Handler(Looper.getMainLooper())

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

        // 2. NORMAL TRANSLATION MODE (Smart Comic/Manga Inpainting & In-place Text Replacement)
        for (block in blocks) {
            val left = block.boundingBox.left * w
            val top = block.boundingBox.top * h
            val right = block.boundingBox.right * w
            val bottom = block.boundingBox.bottom * h

            val displayText = if (block.isShowingOriginal) block.originalText else block.translatedText.ifBlank { block.originalText }

            // Check if this text block is part of a dialogue box or wide banner
            val isWideDialogue = (right - left) > w * 0.20f || displayText.length > 18 || (top > h * 0.20f && (right - left) > w * 0.16f)
            val paddingH = if (isWideDialogue) 24f else 12f
            val paddingV = if (isWideDialogue) 12f else 6f

            val minBoxWidth = if (isWideDialogue) (w * 0.90f) else (right - left + paddingH * 2)
            val boxWidth = max(right - left + paddingH * 2, minBoxWidth).coerceAtMost(w - 16f)

            val boxLeft = if (isWideDialogue) {
                ((w - boxWidth) / 2f).coerceAtLeast(8f)
            } else {
                (left - paddingH).coerceIn(8f, (w - boxWidth - 8f).coerceAtLeast(8f))
            }
            val boxRight = (boxLeft + boxWidth).coerceAtMost(w - 8f)

            val minBoxHeight = if (isWideDialogue) 92f else (bottom - top + paddingV * 2)
            val boxHeight = max(bottom - top + paddingV * 2, minBoxHeight).coerceAtMost(h - 16f)
            val boxTop = if (isWideDialogue) {
                (top - 8f).coerceIn(8f, (h - boxHeight - 8f).coerceAtLeast(8f))
            } else {
                (top - paddingV).coerceIn(8f, (h - boxHeight - 8f).coerceAtLeast(8f))
            }
            val boxBottom = (boxTop + boxHeight).coerceAtMost(h - 8f)

            val rect = RectF(boxLeft, boxTop, boxRight, boxBottom)
            val rx = 14f

            // Smart Comic/Manga Inpainting
            canvas.drawRoundRect(RectF(rect.left + 2f, rect.top + 3f, rect.right + 2f, rect.bottom + 3f), rx, rx, shadowPaint)
            val baseCol = block.backgroundColor
            val alpha = (bubbleOpacity.coerceIn(0.2f, 1.0f) * 255).toInt().coerceIn(60, 255)
            val darkenFactor = 0.93f
            val blendR = (Color.red(baseCol) * darkenFactor).toInt().coerceIn(0, 255)
            val blendG = (Color.green(baseCol) * darkenFactor).toInt().coerceIn(0, 255)
            val blendB = (Color.blue(baseCol) * darkenFactor).toInt().coerceIn(0, 255)

            bgPaint.color = Color.argb(alpha, blendR, blendG, blendB)
            canvas.drawRoundRect(rect, rx, rx, bgPaint)

            val borderR = (Color.red(baseCol) * 1.15f).toInt().coerceIn(0, 255)
            val borderG = (Color.green(baseCol) * 1.15f).toInt().coerceIn(0, 255)
            val borderB = (Color.blue(baseCol) * 1.15f).toInt().coerceIn(0, 255)
            borderPaint.color = Color.argb((alpha * 0.65f).toInt().coerceIn(30, 200), borderR, borderG, borderB)
            borderPaint.strokeWidth = 2.0f
            canvas.drawRoundRect(rect, rx, rx, borderPaint)

            drawFittedText(canvas, displayText, rect, block.textColor)
        }

        // 3. LASSO / BOX DRAG SELECTION OVERLAY
        if (isLassoModeActive) {
            val bannerText = "👆 Выделите рамку пальцем на экране"
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

            val badgeText = "🔍 Перевести область"
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
            postInvalidateDelayed(16)
        }

        // 6. FLOATING BUTTON
        if (showFloatingButton) {
            floatBtnX = floatBtnX.coerceIn(floatBtnRadius + 8f, w - floatBtnRadius - 8f)
            floatBtnY = floatBtnY.coerceIn(floatBtnRadius + 8f, h - floatBtnRadius - 8f)

            canvas.drawCircle(floatBtnX + 2f, floatBtnY + 3f, floatBtnRadius, shadowPaint)
            canvas.drawCircle(floatBtnX, floatBtnY, floatBtnRadius * 1.15f, floatBtnGlowPaint)
            canvas.drawCircle(floatBtnX, floatBtnY, floatBtnRadius, floatBtnPaint)
            canvas.drawCircle(floatBtnX, floatBtnY, floatBtnRadius, floatBtnStrokePaint)

            val textY = floatBtnY - (floatBtnTextPaint.descent() + floatBtnTextPaint.ascent()) / 2f
            canvas.drawText("TR", floatBtnX, textY, floatBtnTextPaint)
        }
    }

    var onFloatingButtonLongClickListener: (() -> Unit)? = null

    private val longPressRunnable = Runnable {
        if (isDraggingFloatBtn && !hasMovedFloatBtn) {
            isDraggingFloatBtn = false
            performHapticFeedback(HapticFeedbackConstants.LONG_PRESS)
            if (onFloatingButtonLongClickListener != null) {
                onFloatingButtonLongClickListener?.invoke()
            } else {
                enterRegionEditMode()
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
        borderPaint.color = Color.parseColor("#FF00E5FF")
        borderPaint.strokeWidth = 3f
        canvas.drawRoundRect(dictCardRect, 18f, 18f, borderPaint)

        // Close Button (✕)
        dictCloseRect.set(dictCardRect.right - 44f, dictCardRect.top + 12f, dictCardRect.right - 12f, dictCardRect.top + 44f)
        canvas.drawRoundRect(dictCloseRect, 8f, 8f, closeBtnPaint)
        canvas.drawText("✕", dictCloseRect.centerX(), dictCloseRect.centerY() + 7f, closeBtnTextPaint)

        // Header Title
        val headerPaint = TextPaint(Paint.ANTI_ALIAS_FLAG).apply {
            color = Color.parseColor("#00E5FF")
            typeface = Typeface.DEFAULT_BOLD
            textSize = 24f
        }
        canvas.drawText("📖 Словарь & Разбор фразы", dictCardRect.left + 20f, dictCardRect.top + 34f, headerPaint)

        var curY = dictCardRect.top + 64f

        // Original Text
        val origPaint = TextPaint(Paint.ANTI_ALIAS_FLAG).apply {
            color = Color.WHITE
            typeface = Typeface.DEFAULT_BOLD
            textSize = 28f
        }
        canvas.drawText(dict.query.take(45), dictCardRect.left + 20f, curY, origPaint)
        curY += 34f

        // Full Translation
        val transPaint = TextPaint(Paint.ANTI_ALIAS_FLAG).apply {
            color = Color.parseColor("#94A3B8")
            typeface = Typeface.DEFAULT
            textSize = 22f
        }
        canvas.drawText(dict.fullTranslation.take(55), dictCardRect.left + 20f, curY, transPaint)
        curY += 36f

        // Divider
        val linePaint = Paint().apply { color = Color.parseColor("#334155"); strokeWidth = 1.5f }
        canvas.drawLine(dictCardRect.left + 20f, curY, dictCardRect.right - 20f, curY, linePaint)
        curY += 24f

        // Word tokens breakdown
        for (word in dict.words.take(3)) {
            val tokenPaint = TextPaint(Paint.ANTI_ALIAS_FLAG).apply {
                color = Color.parseColor("#38BDF8")
                typeface = Typeface.DEFAULT_BOLD
                textSize = 22f
            }
            val posPaint = TextPaint(Paint.ANTI_ALIAS_FLAG).apply {
                color = Color.parseColor("#F59E0B")
                typeface = Typeface.DEFAULT
                textSize = 18f
            }
            val romajiStr = if (word.romaji.isNotBlank()) " [${word.romaji}]" else ""
            canvas.drawText("• ${word.original}$romajiStr", dictCardRect.left + 20f, curY, tokenPaint)
            canvas.drawText(" (${word.partOfSpeech})", dictCardRect.left + 20f + tokenPaint.measureText("• ${word.original}$romajiStr"), curY, posPaint)
            curY += 28f
        }

        // "Озвучить ▶️" Action Button
        dictSpeakRect.set(dictCardRect.left + 20f, dictCardRect.bottom - 52f, dictCardRect.left + 220f, dictCardRect.bottom - 14f)
        topBarBtnPaint.color = Color.parseColor("#10B981")
        canvas.drawRoundRect(dictSpeakRect, 10f, 10f, topBarBtnPaint)
        topBarTextPaint.color = Color.WHITE
        topBarTextPaint.textSize = 20f
        canvas.drawText("Озвучить ▶️", dictSpeakRect.centerX(), dictSpeakRect.centerY() + 7f, topBarTextPaint)
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
        borderPaint.color = Color.parseColor("#4D00E5FF")
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

    private fun drawFittedText(canvas: Canvas, text: String, bounds: RectF, color: Int) {
        val padH = 16f
        val padV = 10f
        val maxW = max(20, (bounds.width() - padH * 2).toInt())
        val maxH = max(20, (bounds.height() - padV * 2).toInt())

        // Initial font size with comfortable scale for handheld reading
        var targetSize = (bounds.height() * 0.38f * fontSizeScale).coerceIn(22f, 48f)
        val isSingleWordOrButton = !text.contains(' ') && text.length < 15
        val alignment = if (isSingleWordOrButton) Layout.Alignment.ALIGN_CENTER else Layout.Alignment.ALIGN_NORMAL

        textPaint.textSize = targetSize
        textPaint.color = color
        textPaint.typeface = Typeface.create("sans-serif-medium", Typeface.BOLD)

        var layout = StaticLayout.Builder.obtain(text, 0, text.length, textPaint, maxW)
            .setAlignment(alignment)
            .setLineSpacing(3f, 1.18f)
            .setIncludePad(false)
            .build()

        while (layout.height > maxH && targetSize > 16f) {
            targetSize -= 1.0f
            textPaint.textSize = targetSize
            layout = StaticLayout.Builder.obtain(text, 0, text.length, textPaint, maxW)
                .setAlignment(alignment)
                .setLineSpacing(3f, 1.18f)
                .setIncludePad(false)
                .build()
        }

        val textX = bounds.left + padH
        val textY = bounds.top + max(padV, (bounds.height() - layout.height) / 2f)

        // Pass 1: Crisp contrast outline for native subtitle look
        val strokePaint = TextPaint(textPaint).apply {
            style = Paint.Style.STROKE
            strokeWidth = (targetSize * 0.16f).coerceIn(2.5f, 6.0f)
            strokeCap = Paint.Cap.ROUND
            strokeJoin = Paint.Join.ROUND
            this.color = if (Color.luminance(color) > 0.5f) Color.argb(235, 0, 0, 0) else Color.argb(235, 255, 255, 255)
        }
        val strokeLayout = StaticLayout.Builder.obtain(text, 0, text.length, strokePaint, maxW)
            .setAlignment(alignment)
            .setLineSpacing(3f, 1.18f)
            .setIncludePad(false)
            .build()

        canvas.save()
        canvas.translate(textX, textY)
        strokeLayout.draw(canvas)
        layout.draw(canvas)
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
                val distToFloatBtn = Math.hypot((x - floatBtnX).toDouble(), (y - floatBtnY).toDouble()).toFloat()
                if (showFloatingButton && distToFloatBtn <= floatBtnRadius + 15f) {
                    isDraggingFloatBtn = true
                    hasMovedFloatBtn = false
                    dragStartX = x
                    dragStartY = y
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
                    if (!hasMovedFloatBtn) {
                        val now = System.currentTimeMillis()
                        if (now - lastFloatBtnClickTime <= 350L) {
                            lastFloatBtnClickTime = 0L
                            // Double tap on floating button activates Lasso Box Selection!
                            isLassoModeActive = true
                            invalidate()
                        } else {
                            lastFloatBtnClickTime = now
                            onTriggerTranslationRequested?.invoke()
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

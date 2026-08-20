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
import me.magnum.melonds.translator.model.TranslatedTextBlock
import me.magnum.melonds.translator.model.TranslationRegion
import me.magnum.melonds.translator.model.TranslatorOverlayStyle
import kotlin.math.max
import kotlin.math.min

class GameTranslationOverlayView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

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
    var onDismissRequested: (() -> Unit)? = null
    var onRegionsSaved: ((List<TranslationRegion>) -> Unit)? = null

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

    // Region Editor Touch State
    private enum class EditAction { NONE, DRAW_NEW, MOVE_REGION, RESIZE_REGION }
    private var currentEditAction = EditAction.NONE
    private var activeRegionIndex = -1
    private var touchDownX = 0f
    private var touchDownY = 0f
    private var regionInitialRect = RectF()
    private var drawingNewRect = RectF()

    // Paints
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
        invalidate()
    }

    fun setSavedRegions(newRegions: List<TranslationRegion>) {
        customRegions.clear()
        customRegions.addAll(newRegions)
        invalidate()
    }

    fun clearTranslations() {
        blocks.clear()
        isTranslating = false
        invalidate()
    }

    fun hasActiveTranslations(): Boolean = blocks.isNotEmpty()

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

        // 2. NORMAL TRANSLATION MODE
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

            when (overlayStyle) {
                TranslatorOverlayStyle.SMART_BACKGROUND_MATCH -> {
                    canvas.drawRoundRect(RectF(rect.left + 2f, rect.top + 3f, rect.right + 2f, rect.bottom + 3f), rx, rx, shadowPaint)
                    val baseCol = block.backgroundColor
                    val alpha = (bubbleOpacity.coerceIn(0.2f, 1.0f) * 255).toInt().coerceIn(50, 255)
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
                }
                TranslatorOverlayStyle.SEMI_TRANSPARENT -> {
                    canvas.drawRoundRect(RectF(rect.left + 2f, rect.top + 3f, rect.right + 2f, rect.bottom + 3f), rx, rx, shadowPaint)
                    bgPaint.color = Color.argb(220, 15, 23, 42)
                    canvas.drawRoundRect(rect, rx, rx, bgPaint)
                    borderPaint.color = Color.argb(80, 255, 255, 255)
                    borderPaint.strokeWidth = 2.0f
                    canvas.drawRoundRect(rect, rx, rx, borderPaint)
                }
                TranslatorOverlayStyle.TRANSLUCENT_BUBBLE -> {
                    canvas.drawRoundRect(RectF(rect.left + 2f, rect.top + 3f, rect.right + 2f, rect.bottom + 3f), rx, rx, shadowPaint)
                    bgPaint.color = Color.argb(240, 10, 15, 26)
                    canvas.drawRoundRect(rect, rx, rx, bgPaint)
                    borderPaint.color = Color.parseColor("#9900E5FF")
                    borderPaint.strokeWidth = 2.0f
                    canvas.drawRoundRect(rect, rx, rx, borderPaint)
                }
                TranslatorOverlayStyle.OUTLINE_ONLY -> {
                    // No background box, only text outline
                }
            }

            drawFittedText(canvas, displayText, rect, block.textColor)
        }

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
                    }

                    for (i in customRegions.indices.reversed()) {
                        val region = customRegions[i]
                        val r = region.rect.right * w
                        val b = region.rect.bottom * h
                        val handleRect = RectF(r - 36f, b - 36f, r + 18f, b + 18f)
                        if (handleRect.contains(x, y)) {
                            currentEditAction = EditAction.RESIZE_REGION
                            activeRegionIndex = i
                            touchDownX = x
                            touchDownY = y
                            regionInitialRect.set(region.rect)
                            return true
                        }
                    }

                    for (i in customRegions.indices.reversed()) {
                        val region = customRegions[i]
                        val l = region.rect.left * w
                        val t = region.rect.top * h
                        val r = region.rect.right * w
                        val b = region.rect.bottom * h
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
                    return true
                }
                MotionEvent.ACTION_MOVE -> {
                    when (currentEditAction) {
                        EditAction.DRAW_NEW -> {
                            drawingNewRect.set(
                                min(touchDownX, x),
                                min(touchDownY, y),
                                max(touchDownX, x),
                                max(touchDownY, y)
                            )
                            invalidate()
                            return true
                        }
                        EditAction.MOVE_REGION -> {
                            if (activeRegionIndex in customRegions.indices) {
                                val dx = (x - touchDownX) / w
                                val dy = (y - touchDownY) / h
                                val regW = regionInitialRect.width()
                                val regH = regionInitialRect.height()

                                val newL = (regionInitialRect.left + dx).coerceIn(0f, 1f - regW)
                                val newT = (regionInitialRect.top + dy).coerceIn(0f, 1f - regH)
                                customRegions[activeRegionIndex].rect.set(newL, newT, newL + regW, newT + regH)
                                invalidate()
                                return true
                            }
                        }
                        EditAction.RESIZE_REGION -> {
                            if (activeRegionIndex in customRegions.indices) {
                                val reg = customRegions[activeRegionIndex]
                                val newR = (x / w).coerceIn(reg.rect.left + 0.05f, 1f)
                                val newB = (y / h).coerceIn(reg.rect.top + 0.05f, 1f)
                                reg.rect.right = newR
                                reg.rect.bottom = newB
                                invalidate()
                                return true
                            }
                        }
                        else -> {}
                    }
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
                        drawingNewRect.set(0f, 0f, 0f, 0f)
                    }
                    currentEditAction = EditAction.NONE
                    activeRegionIndex = -1
                    invalidate()
                    return true
                }
            }
            return true
        }

        when (event.actionMasked) {
            MotionEvent.ACTION_DOWN -> {
                if (showFloatingButton) {
                    val dist = Math.hypot((x - floatBtnX).toDouble(), (y - floatBtnY).toDouble()).toFloat()
                    if (dist <= floatBtnRadius * 1.3f) {
                        isDraggingFloatBtn = true
                        dragStartX = x
                        dragStartY = y
                        hasMovedFloatBtn = false
                        longPressHandler.postDelayed(longPressRunnable, 450)
                        return true
                    }
                }

                for (block in blocks) {
                    val left = block.boundingBox.left * w - 10f
                    val top = block.boundingBox.top * h - 10f
                    val right = block.boundingBox.right * w + 10f
                    val bottom = block.boundingBox.bottom * h + 10f
                    val rect = RectF(left, top, right, bottom)

                    if (rect.contains(x, y)) {
                        block.isShowingOriginal = !block.isShowingOriginal
                        invalidate()
                        return true
                    }
                }

                if (blocks.isNotEmpty()) {
                    clearTranslations()
                    onDismissRequested?.invoke()
                    return true
                }
            }
            MotionEvent.ACTION_MOVE -> {
                if (isDraggingFloatBtn) {
                    val dx = x - dragStartX
                    val dy = y - dragStartY
                    if (Math.hypot(dx.toDouble(), dy.toDouble()) > 10.0) {
                        hasMovedFloatBtn = true
                        longPressHandler.removeCallbacks(longPressRunnable)
                        floatBtnX = x
                        floatBtnY = y
                        invalidate()
                    }
                    return true
                }
            }
            MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                if (isDraggingFloatBtn) {
                    longPressHandler.removeCallbacks(longPressRunnable)
                    isDraggingFloatBtn = false
                    if (!hasMovedFloatBtn) {
                        onTriggerTranslationRequested?.invoke()
                    }
                    return true
                }
            }
        }

        return super.onTouchEvent(event)
    }
}

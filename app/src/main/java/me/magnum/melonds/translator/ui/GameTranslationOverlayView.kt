package me.magnum.melonds.translator.ui

import android.content.Context
import android.graphics.*
import android.text.Layout
import android.text.StaticLayout
import android.text.TextPaint
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import me.magnum.melonds.translator.model.TranslatedTextBlock
import me.magnum.melonds.translator.model.TranslatorOverlayStyle
import kotlin.math.max
import kotlin.math.min

class GameTranslationOverlayView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private val blocks = mutableListOf<TranslatedTextBlock>()
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
    var showFloatingButton: Boolean = true
        set(value) {
            field = value
            invalidate()
        }

    // Floating Translate Button State
    private var floatBtnX = 60f
    private var floatBtnY = 240f
    private val floatBtnRadius = 65f
    private var isDraggingFloatBtn = false
    private var dragStartX = 0f
    private var dragStartY = 0f
    private var hasMovedFloatBtn = false

    private val bgPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.FILL
    }

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

    private var progressAngle = 0f

    fun setTranslatedBlocks(newBlocks: List<TranslatedTextBlock>) {
        blocks.clear()
        blocks.addAll(newBlocks)
        isTranslating = false
        invalidate()
    }

    fun clearTranslations() {
        blocks.clear()
        isTranslating = false
        invalidate()
    }

    fun hasActiveTranslations(): Boolean = blocks.isNotEmpty()

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        val w = width.toFloat()
        val h = height.toFloat()
        if (w <= 0 || h <= 0) return

        // 1. Draw translated overlay bubbles
        for (block in blocks) {
            val left = block.boundingBox.left * w
            val top = block.boundingBox.top * h
            val right = block.boundingBox.right * w
            val bottom = block.boundingBox.bottom * h

            val padding = 8f
            val rect = RectF(left - padding, top - padding, right + padding, bottom + padding)
            val rx = 10f

            // Shadow
            canvas.drawRoundRect(RectF(rect.left + 2f, rect.top + 3f, rect.right + 2f, rect.bottom + 3f), rx, rx, shadowPaint)

            // Background inpainting
            when (overlayStyle) {
                TranslatorOverlayStyle.SMART_BACKGROUND_MATCH -> {
                    val baseCol = block.backgroundColor
                    val alpha = (bubbleOpacity.coerceIn(0.1f, 1.0f) * 255).toInt()
                    bgPaint.color = Color.argb(alpha, Color.red(baseCol), Color.green(baseCol), Color.blue(baseCol))
                    canvas.drawRoundRect(rect, rx, rx, bgPaint)
                    canvas.drawRoundRect(rect, rx, rx, borderPaint)
                }
                TranslatorOverlayStyle.SEMI_TRANSPARENT -> {
                    bgPaint.color = Color.argb(160, 15, 23, 42)
                    canvas.drawRoundRect(rect, rx, rx, bgPaint)
                    canvas.drawRoundRect(rect, rx, rx, borderPaint)
                }
                TranslatorOverlayStyle.TRANSLUCENT_BUBBLE -> {
                    bgPaint.color = Color.argb(235, 10, 15, 26)
                    canvas.drawRoundRect(rect, rx, rx, bgPaint)
                    borderPaint.color = Color.parseColor("#9900E5FF")
                    canvas.drawRoundRect(rect, rx, rx, borderPaint)
                }
                TranslatorOverlayStyle.OUTLINE_ONLY -> {
                    borderPaint.color = Color.parseColor("#FF00E5FF")
                    canvas.drawRoundRect(rect, rx, rx, borderPaint)
                }
            }

            // Text
            val displayText = if (block.isShowingOriginal) block.originalText else block.translatedText.ifBlank { block.originalText }
            textPaint.color = block.textColor
            drawFittedText(canvas, displayText, rect, block.textColor)
        }

        // 2. Loading Spinner while OCR/Translating
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

        // 3. Floating Translate Button (if enabled)
        if (showFloatingButton) {
            // Keep button in bounds
            floatBtnX = floatBtnX.coerceIn(floatBtnRadius + 8f, w - floatBtnRadius - 8f)
            floatBtnY = floatBtnY.coerceIn(floatBtnRadius + 8f, h - floatBtnRadius - 8f)

            // Ambient Shadow
            canvas.drawCircle(floatBtnX + 2f, floatBtnY + 3f, floatBtnRadius, shadowPaint)

            // Neon Glow
            canvas.drawCircle(floatBtnX, floatBtnY, floatBtnRadius * 1.15f, floatBtnGlowPaint)

            // Button Body
            canvas.drawCircle(floatBtnX, floatBtnY, floatBtnRadius, floatBtnPaint)
            canvas.drawCircle(floatBtnX, floatBtnY, floatBtnRadius, floatBtnStrokePaint)

            // "TR" Translate Text
            val textY = floatBtnY - (floatBtnTextPaint.descent() + floatBtnTextPaint.ascent()) / 2f
            canvas.drawText("TR", floatBtnX, textY, floatBtnTextPaint)
        }
    }

    private fun drawFittedText(canvas: Canvas, text: String, bounds: RectF, color: Int) {
        val maxW = max(10, (bounds.width() - 16f).toInt())
        val maxH = max(10, (bounds.height() - 12f).toInt())

        var targetSize = (bounds.height() * 0.35f * fontSizeScale).coerceIn(18f, 52f)
        textPaint.textSize = targetSize
        textPaint.color = color

        var layout = StaticLayout.Builder.obtain(text, 0, text.length, textPaint, maxW)
            .setAlignment(Layout.Alignment.ALIGN_NORMAL)
            .setLineSpacing(0f, 1.15f)
            .setIncludePad(false)
            .build()

        while (layout.height > maxH && targetSize > 14f) {
            targetSize -= 2f
            textPaint.textSize = targetSize
            layout = StaticLayout.Builder.obtain(text, 0, text.length, textPaint, maxW)
                .setAlignment(Layout.Alignment.ALIGN_NORMAL)
                .setLineSpacing(0f, 1.15f)
                .setIncludePad(false)
                .build()
        }

        canvas.save()
        val textX = bounds.left + 8f
        val textY = bounds.top + max(4f, (bounds.height() - layout.height) / 2f)
        canvas.translate(textX, textY)
        layout.draw(canvas)
        canvas.restore()
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        val x = event.x
        val y = event.y

        when (event.actionMasked) {
            MotionEvent.ACTION_DOWN -> {
                // Check if tapping on floating translate button
                if (showFloatingButton) {
                    val dist = Math.hypot((x - floatBtnX).toDouble(), (y - floatBtnY).toDouble()).toFloat()
                    if (dist <= floatBtnRadius * 1.3f) {
                        isDraggingFloatBtn = true
                        dragStartX = x
                        dragStartY = y
                        hasMovedFloatBtn = false
                        return true
                    }
                }

                // Check if tapping on any translated bubble to toggle original / translated
                for (block in blocks) {
                    val w = width.toFloat()
                    val h = height.toFloat()
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

                // If translation overlay is showing and user taps empty space, dismiss overlay
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
                    if (Math.hypot(dx.toDouble(), dy.toDouble()) > 8.0) {
                        hasMovedFloatBtn = true
                        floatBtnX = x
                        floatBtnY = y
                        invalidate()
                    }
                    return true
                }
            }
            MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                if (isDraggingFloatBtn) {
                    isDraggingFloatBtn = false
                    if (!hasMovedFloatBtn) {
                        // Clicked without dragging: trigger translation!
                        onTriggerTranslationRequested?.invoke()
                    }
                    return true
                }
            }
        }

        return super.onTouchEvent(event)
    }
}

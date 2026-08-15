package me.magnum.melonds.ui.common.views

import android.animation.ValueAnimator
import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View
import me.magnum.melonds.domain.model.Input
import kotlin.math.min

class ModernButtonsView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr), IAnimatedInputView {

    init {
        ButtonThemeManager.init(context)
    }

    // Background track plate
    private val platePaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.FILL
        color = Color.parseColor("#26111318")
    }

    private val plateStrokePaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = 3f
        color = Color.parseColor("#33FFFFFF")
    }

    // Button body
    private val buttonBodyPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.FILL
        color = Color.parseColor("#E6232730")
    }

    private val buttonBevelLightPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = 3.5f
        color = Color.parseColor("#80FFFFFF")
    }

    private val buttonBevelDarkPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = 3.5f
        color = Color.parseColor("#80000000")
    }

    // Active Pressed Glow
    private val activeGlowPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.FILL
        color = Color.parseColor("#6600E5FF")
    }

    private val activeStrokePaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = 5f
        color = Color.parseColor("#FF00E5FF")
    }

    // Text Lettering (DS Styled)
    private val textPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.parseColor("#F0F4F8")
        textAlign = Paint.Align.CENTER
        typeface = Typeface.create("sans-serif-medium", Typeface.BOLD)
    }

    private val textShadowPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.parseColor("#B3000000")
        textAlign = Paint.Align.CENTER
        typeface = Typeface.create("sans-serif-medium", Typeface.BOLD)
    }

    private val buttonScales = mutableMapOf<Input, Float>()
    private val buttonGlows = mutableMapOf<Input, Float>()
    private val buttonAnimators = mutableMapOf<Input, ValueAnimator>()

    override fun updatePressedInputs(pressedInputs: Set<Input>) {
        val allInputs = listOf(Input.X, Input.Y, Input.B, Input.A)
        allInputs.forEach { input ->
            val isPressed = input in pressedInputs
            val targetScale = if (isPressed) 0.88f else 1.0f
            val targetGlow = if (isPressed) 1.0f else 0.0f

            val currentScale = buttonScales[input] ?: 1.0f
            if (currentScale != targetScale) {
                animateButton(input, targetScale, targetGlow)
            }
        }
    }

    private fun animateButton(input: Input, targetScale: Float, targetGlow: Float) {
        buttonAnimators[input]?.cancel()

        val startScale = buttonScales[input] ?: 1.0f
        val startGlow = buttonGlows[input] ?: 0.0f

        val animator = ValueAnimator.ofFloat(0f, 1f).apply {
            duration = 90L
            addUpdateListener { anim ->
                val fraction = anim.animatedFraction
                buttonScales[input] = startScale + (targetScale - startScale) * fraction
                buttonGlows[input] = startGlow + (targetGlow - startGlow) * fraction
                invalidate()
            }
        }
        buttonAnimators[input] = animator
        animator.start()
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        val w = width.toFloat()
        val h = height.toFloat()
        if (w <= 0 || h <= 0) return

        val size = min(w, h)
        val cx = w / 2f
        val cy = h / 2f
        val buttonRadius = size * 0.17f
        val offset = size * 0.285f

        val style = ButtonThemeManager.currentStyle

        // Draw connecting diamond backing plate
        val platePath = Path().apply {
            moveTo(cx, cy - offset - buttonRadius * 0.7f)
            lineTo(cx + offset + buttonRadius * 0.7f, cy)
            lineTo(cx, cy + offset + buttonRadius * 0.7f)
            lineTo(cx - offset - buttonRadius * 0.7f, cy)
            close()
        }

        when (style) {
            ButtonColorStyle.CLASSIC_WHITE -> {
                platePaint.color = Color.parseColor("#33E2E8F0")
                plateStrokePaint.color = Color.parseColor("#4DE2E8F0")
            }
            ButtonColorStyle.CLASSIC_GREY -> {
                platePaint.color = Color.parseColor("#33475569")
                plateStrokePaint.color = Color.parseColor("#4D94A3B8")
            }
            else -> {
                platePaint.color = Color.parseColor("#26111318")
                plateStrokePaint.color = Color.parseColor("#33FFFFFF")
            }
        }

        canvas.drawPath(platePath, platePaint)
        canvas.drawPath(platePath, plateStrokePaint)
        canvas.drawCircle(cx, cy, offset, plateStrokePaint)

        val positions = mapOf(
            Input.X to Pair(cx, cy - offset),
            Input.Y to Pair(cx - offset, cy),
            Input.B to Pair(cx, cy + offset),
            Input.A to Pair(cx + offset, cy)
        )

        val labels = mapOf(
            Input.X to "X",
            Input.Y to "Y",
            Input.B to "B",
            Input.A to "A"
        )

        val textSize = buttonRadius * 0.95f
        textPaint.textSize = textSize
        textShadowPaint.textSize = textSize

        positions.forEach { (input, pos) ->
            val bx = pos.first
            val by = pos.second
            val scale = buttonScales[input] ?: 1.0f
            val glow = buttonGlows[input] ?: 0.0f

            canvas.save()
            canvas.scale(scale, scale, bx, by)

            // Button drop shadow
            canvas.drawCircle(bx, by + 3.5f, buttonRadius, platePaint)

            // Active press glow
            if (glow > 0f) {
                when (style) {
                    ButtonColorStyle.CLASSIC_WHITE -> activeGlowPaint.color = Color.parseColor("#6638BDF8")
                    ButtonColorStyle.CLASSIC_GREY -> activeGlowPaint.color = Color.parseColor("#6694A3B8")
                    ButtonColorStyle.SNES_SUPER -> {
                        val glowCol = when (input) {
                            Input.A -> Color.parseColor("#66FF7675")
                            Input.B -> Color.parseColor("#66FFEAA7")
                            Input.X -> Color.parseColor("#6674B9FF")
                            else -> Color.parseColor("#6655EFC4")
                        }
                        activeGlowPaint.color = glowCol
                    }
                    else -> activeGlowPaint.color = Color.parseColor("#6600E5FF")
                }
                activeGlowPaint.alpha = (glow * 180).toInt()
                canvas.drawCircle(bx, by, buttonRadius * 1.18f, activeGlowPaint)
            }

            // Button main body cap
            if (glow > 0f) {
                buttonBodyPaint.color = when (style) {
                    ButtonColorStyle.CLASSIC_WHITE -> Color.parseColor("#E6CBD5E1")
                    ButtonColorStyle.CLASSIC_GREY -> Color.parseColor("#E6334155")
                    ButtonColorStyle.SNES_SUPER -> when (input) {
                        Input.A -> Color.parseColor("#E6D63031")
                        Input.B -> Color.parseColor("#E6FDCB6E")
                        Input.X -> Color.parseColor("#E60984E3")
                        else -> Color.parseColor("#E600B894")
                    }
                    else -> Color.parseColor("#E61A3A4D")
                }
            } else {
                buttonBodyPaint.color = when (style) {
                    ButtonColorStyle.CLASSIC_WHITE -> Color.parseColor("#F2FFFFFF")
                    ButtonColorStyle.CLASSIC_GREY -> Color.parseColor("#E65A6577")
                    ButtonColorStyle.SNES_SUPER -> when (input) {
                        Input.A -> Color.parseColor("#E6D63031")
                        Input.B -> Color.parseColor("#E6FDCB6E")
                        Input.X -> Color.parseColor("#E60984E3")
                        else -> Color.parseColor("#E600B894")
                    }
                    else -> Color.parseColor("#E6252932")
                }
            }
            canvas.drawCircle(bx, by, buttonRadius, buttonBodyPaint)

            // Bevel highlights
            val rectF = RectF(bx - buttonRadius, by - buttonRadius, bx + buttonRadius, by + buttonRadius)
            canvas.drawArc(rectF, 135f, 180f, false, buttonBevelLightPaint)
            canvas.drawArc(rectF, -45f, 180f, false, buttonBevelDarkPaint)

            if (glow > 0f) {
                activeStrokePaint.color = when (style) {
                    ButtonColorStyle.CLASSIC_WHITE -> Color.parseColor("#0284C7")
                    ButtonColorStyle.CLASSIC_GREY -> Color.parseColor("#E2E8F0")
                    else -> Color.parseColor("#00E5FF")
                }
                canvas.drawCircle(bx, by, buttonRadius, activeStrokePaint)
            }

            // Nintendo DS Lettering
            val textY = by - (textPaint.descent() + textPaint.ascent()) / 2f
            canvas.drawText(labels[input] ?: "", bx, textY + 1.5f, textShadowPaint)
            if (glow > 0f) {
                textPaint.color = when (style) {
                    ButtonColorStyle.CLASSIC_WHITE -> Color.parseColor("#0369A1")
                    ButtonColorStyle.CLASSIC_GREY -> Color.WHITE
                    else -> Color.parseColor("#00E5FF")
                }
            } else {
                textPaint.color = when (style) {
                    ButtonColorStyle.CLASSIC_WHITE -> Color.parseColor("#0F172A")
                    else -> Color.WHITE
                }
            }
            canvas.drawText(labels[input] ?: "", bx, textY, textPaint)

            canvas.restore()
        }
    }
}

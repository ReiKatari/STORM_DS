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

    private val buttonAnimators = mutableMapOf<Input, ValueAnimator>()
    private val buttonScales = mutableMapOf<Input, Float>()
    private val buttonGlows = mutableMapOf<Input, Float>()

    private val targetInputs = listOf(Input.X, Input.Y, Input.B, Input.A)

    init {
        targetInputs.forEach { input ->
            buttonScales[input] = 1.0f
            buttonGlows[input] = 0.0f
        }
    }

    override fun updatePressedInputs(pressedInputs: Set<Input>) {
        targetInputs.forEach { input ->
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

        // Draw connecting diamond backing plate
        val platePath = Path().apply {
            moveTo(cx, cy - offset - buttonRadius * 0.7f)
            lineTo(cx + offset + buttonRadius * 0.7f, cy)
            lineTo(cx, cy + offset + buttonRadius * 0.7f)
            lineTo(cx - offset - buttonRadius * 0.7f, cy)
            close()
        }
        canvas.drawPath(platePath, platePaint)
        canvas.drawPath(platePath, plateStrokePaint)

        // Diamond center circular guide ring
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
                activeGlowPaint.alpha = (glow * 180).toInt()
                canvas.drawCircle(bx, by, buttonRadius * 1.18f, activeGlowPaint)
            }

            // Button main body cap
            if (glow > 0f) {
                buttonBodyPaint.color = Color.parseColor("#E61A3A4D")
            } else {
                buttonBodyPaint.color = Color.parseColor("#E6252932")
            }
            canvas.drawCircle(bx, by, buttonRadius, buttonBodyPaint)

            // Bevel highlights (Top-left light, Bottom-right dark)
            val rectF = RectF(bx - buttonRadius, by - buttonRadius, bx + buttonRadius, by + buttonRadius)
            canvas.drawArc(rectF, 135f, 180f, false, buttonBevelLightPaint)
            canvas.drawArc(rectF, -45f, 180f, false, buttonBevelDarkPaint)

            if (glow > 0f) {
                canvas.drawCircle(bx, by, buttonRadius, activeStrokePaint)
            }

            // Nintendo DS Lettering
            val textY = by - (textPaint.descent() + textPaint.ascent()) / 2f
            canvas.drawText(labels[input] ?: "", bx, textY + 1.5f, textShadowPaint)
            if (glow > 0f) {
                textPaint.color = Color.parseColor("#00E5FF")
            } else {
                textPaint.color = Color.WHITE
            }
            canvas.drawText(labels[input] ?: "", bx, textY, textPaint)

            canvas.restore()
        }
    }
}

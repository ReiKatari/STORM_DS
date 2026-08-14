package me.magnum.melonds.ui.common.views

import android.animation.ValueAnimator
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Typeface
import android.util.AttributeSet
import android.view.View
import me.magnum.melonds.domain.model.Input
import kotlin.math.min

class ModernButtonsView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr), IAnimatedInputView {

    private val baseRingPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = 4f
        color = Color.parseColor("#4DFFFFFF")
    }

    private val buttonBgPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.FILL
        color = Color.parseColor("#441A1C23")
    }

    private val buttonStrokePaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = 5f
        color = Color.parseColor("#B3FFFFFF")
    }

    private val activeGlowPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.FILL
        color = Color.parseColor("#9900E5FF")
    }

    private val activeStrokePaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = 7f
        color = Color.parseColor("#FF00E5FF")
    }

    private val textPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.WHITE
        textAlign = Paint.Align.CENTER
        typeface = Typeface.create(Typeface.DEFAULT, Typeface.BOLD)
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
            duration = 100L
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
        val buttonRadius = size * 0.16f
        val offset = size * 0.28f

        textPaint.textSize = buttonRadius * 0.9f

        // Center connecting ring / background
        canvas.drawCircle(cx, cy, offset, baseRingPaint)

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

        positions.forEach { (input, pos) ->
            val bx = pos.first
            val by = pos.second
            val scale = buttonScales[input] ?: 1.0f
            val glow = buttonGlows[input] ?: 0.0f

            canvas.save()
            canvas.scale(scale, scale, bx, by)

            // Draw base button background
            canvas.drawCircle(bx, by, buttonRadius, buttonBgPaint)

            // Draw active neon glow if pressed
            if (glow > 0f) {
                activeGlowPaint.alpha = (glow * 160).toInt()
                canvas.drawCircle(bx, by, buttonRadius * 1.1f, activeGlowPaint)
                canvas.drawCircle(bx, by, buttonRadius, activeStrokePaint)
            } else {
                canvas.drawCircle(bx, by, buttonRadius, buttonStrokePaint)
            }

            // Draw button label
            val textY = by - (textPaint.descent() + textPaint.ascent()) / 2f
            canvas.drawText(labels[input] ?: "", bx, textY, textPaint)

            canvas.restore()
        }
    }
}

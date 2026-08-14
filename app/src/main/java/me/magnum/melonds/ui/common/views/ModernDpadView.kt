package me.magnum.melonds.ui.common.views

import android.animation.ValueAnimator
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.View
import me.magnum.melonds.domain.model.Input
import kotlin.math.min

class ModernDpadView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr), IAnimatedInputView {

    private val basePaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.FILL
        color = Color.parseColor("#441A1C23")
    }

    private val strokePaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
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

    private val arrowPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.FILL
        color = Color.WHITE
    }

    private val dpadInputs = listOf(Input.UP, Input.LEFT, Input.DOWN, Input.RIGHT)
    private val directionScales = mutableMapOf<Input, Float>()
    private val directionGlows = mutableMapOf<Input, Float>()
    private val directionAnimators = mutableMapOf<Input, ValueAnimator>()

    init {
        dpadInputs.forEach { input ->
            directionScales[input] = 1.0f
            directionGlows[input] = 0.0f
        }
    }

    override fun updatePressedInputs(pressedInputs: Set<Input>) {
        dpadInputs.forEach { input ->
            val isPressed = input in pressedInputs
            val targetScale = if (isPressed) 0.90f else 1.0f
            val targetGlow = if (isPressed) 1.0f else 0.0f

            val currentScale = directionScales[input] ?: 1.0f
            if (currentScale != targetScale) {
                animateDirection(input, targetScale, targetGlow)
            }
        }
    }

    private fun animateDirection(input: Input, targetScale: Float, targetGlow: Float) {
        directionAnimators[input]?.cancel()

        val startScale = directionScales[input] ?: 1.0f
        val startGlow = directionGlows[input] ?: 0.0f

        val animator = ValueAnimator.ofFloat(0f, 1f).apply {
            duration = 100L
            addUpdateListener { anim ->
                val fraction = anim.animatedFraction
                directionScales[input] = startScale + (targetScale - startScale) * fraction
                directionGlows[input] = startGlow + (targetGlow - startGlow) * fraction
                invalidate()
            }
        }
        directionAnimators[input] = animator
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
        val armWidth = size * 0.28f
        val armLength = size * 0.45f
        val cornerRadius = size * 0.04f

        val dpadPath = Path().apply {
            // Draw cross path shape
            val hw = armWidth / 2f
            val hl = armLength

            moveTo(cx - hw, cy - hl)
            lineTo(cx + hw, cy - hl)
            lineTo(cx + hw, cy - hw)
            lineTo(cx + hl, cy - hw)
            lineTo(cx + hl, cy + hw)
            lineTo(cx + hw, cy + hw)
            lineTo(cx + hw, cy + hl)
            lineTo(cx - hw, cy + hl)
            lineTo(cx - hw, cy + hw)
            lineTo(cx - hl, cy + hw)
            lineTo(cx - hl, cy - hw)
            lineTo(cx - hw, cy - hw)
            close()
        }

        // Draw base D-pad background and stroke
        canvas.drawPath(dpadPath, basePaint)
        canvas.drawPath(dpadPath, strokePaint)

        // Draw directional arms with press animations
        val armOffsets = mapOf(
            Input.UP to Pair(0f, -size * 0.25f),
            Input.DOWN to Pair(0f, size * 0.25f),
            Input.LEFT to Pair(-size * 0.25f, 0f),
            Input.RIGHT to Pair(size * 0.25f, 0f)
        )

        val arrowAngles = mapOf(
            Input.UP to 0f,
            Input.RIGHT to 90f,
            Input.DOWN to 180f,
            Input.LEFT to 270f
        )

        dpadInputs.forEach { input ->
            val offset = armOffsets[input] ?: Pair(0f, 0f)
            val scale = directionScales[input] ?: 1.0f
            val glow = directionGlows[input] ?: 0.0f
            val angle = arrowAngles[input] ?: 0f

            val ax = cx + offset.first
            val ay = cy + offset.second

            canvas.save()
            canvas.scale(scale, scale, ax, ay)

            if (glow > 0f) {
                activeGlowPaint.alpha = (glow * 180).toInt()
                canvas.drawCircle(ax, ay, armWidth * 0.65f, activeGlowPaint)
                canvas.drawCircle(ax, ay, armWidth * 0.55f, activeStrokePaint)
            }

            // Draw directional arrow triangle
            canvas.save()
            canvas.rotate(angle, ax, ay)
            val arrowPath = Path().apply {
                val arrowSize = armWidth * 0.35f
                moveTo(ax, ay - arrowSize)
                lineTo(ax + arrowSize, ay + arrowSize * 0.6f)
                lineTo(ax - arrowSize, ay + arrowSize * 0.6f)
                close()
            }
            canvas.drawPath(arrowPath, arrowPaint)
            canvas.restore()

            canvas.restore()
        }

        // Center pivot circle
        canvas.drawCircle(cx, cy, armWidth * 0.35f, strokePaint)
    }
}

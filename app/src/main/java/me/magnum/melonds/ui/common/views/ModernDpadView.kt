package me.magnum.melonds.ui.common.views

import android.animation.ValueAnimator
import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View
import me.magnum.melonds.domain.model.Input
import kotlin.math.min

class ModernDpadView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr), IAnimatedInputView {

    // Background well / shadow
    private val wellPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.FILL
        color = Color.parseColor("#330F1117")
    }

    private val wellStrokePaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = 3f
        color = Color.parseColor("#33FFFFFF")
    }

    // Main D-Pad Body
    private val bodyPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.FILL
        color = Color.parseColor("#E6232730")
    }

    private val bevelLightPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = 3f
        color = Color.parseColor("#66FFFFFF")
    }

    private val bevelDarkPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = 3f
        color = Color.parseColor("#80000000")
    }

    // Center concave dish
    private val centerDishPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.FILL
        color = Color.parseColor("#CC1A1C22")
    }

    private val centerDishRimPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = 2.5f
        color = Color.parseColor("#4DFFFFFF")
    }

    // Active Arm Press Glow
    private val activeGlowPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.FILL
        color = Color.parseColor("#6600E5FF")
    }

    private val activeStrokePaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = 5f
        color = Color.parseColor("#FF00E5FF")
    }

    // Directional Arrow Indicators
    private val arrowPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.FILL
        color = Color.parseColor("#F0F4F8")
    }

    private val arrowShadowPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.FILL
        color = Color.parseColor("#80000000")
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
            duration = 90L
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
        val armWidth = size * 0.32f
        val armLength = size * 0.46f
        val cornerRadius = size * 0.06f

        // Draw circular well depression in background
        canvas.drawCircle(cx, cy, armLength * 1.05f, wellPaint)
        canvas.drawCircle(cx, cy, armLength * 1.05f, wellStrokePaint)

        // Build authentic cross path
        val hw = armWidth / 2f
        val hl = armLength

        val crossPath = Path().apply {
            moveTo(cx - hw + cornerRadius, cy - hl)
            lineTo(cx + hw - cornerRadius, cy - hl)
            quadTo(cx + hw, cy - hl, cx + hw, cy - hl + cornerRadius)
            lineTo(cx + hw, cy - hw)
            lineTo(cx + hl - cornerRadius, cy - hw)
            quadTo(cx + hl, cy - hw, cx + hl, cy - hw + cornerRadius)
            lineTo(cx + hl, cy + hw - cornerRadius)
            quadTo(cx + hl, cy + hw, cx + hl - cornerRadius, cy + hw)
            lineTo(cx + hw, cy + hw)
            lineTo(cx + hw, cy + hl - cornerRadius)
            quadTo(cx + hw, cy + hl, cx + hw - cornerRadius, cy + hl)
            lineTo(cx - hw + cornerRadius, cy + hl)
            quadTo(cx - hw, cy + hl, cx - hw, cy + hl - cornerRadius)
            lineTo(cx - hw, cy + hw)
            lineTo(cx - hl + cornerRadius, cy + hw)
            quadTo(cx - hl, cy + hw, cx - hl, cy + hw - cornerRadius)
            lineTo(cx - hl, cy - hw + cornerRadius)
            quadTo(cx - hl, cy - hw, cx - hl + cornerRadius, cy - hw)
            lineTo(cx - hw, cy - hw)
            lineTo(cx - hw, cy - hl + cornerRadius)
            quadTo(cx - hw, cy - hl, cx - hw + cornerRadius, cy - hl)
            close()
        }

        // Draw main body and bevels
        canvas.drawPath(crossPath, bodyPaint)
        canvas.drawPath(crossPath, bevelLightPaint)

        // Center concave pivot dish
        val dishRadius = armWidth * 0.42f
        canvas.drawCircle(cx, cy, dishRadius, centerDishPaint)
        canvas.drawCircle(cx, cy, dishRadius, centerDishRimPaint)

        val armOffsets = mapOf(
            Input.UP to Pair(0f, -size * 0.28f),
            Input.DOWN to Pair(0f, size * 0.28f),
            Input.LEFT to Pair(-size * 0.28f, 0f),
            Input.RIGHT to Pair(size * 0.28f, 0f)
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
                activeGlowPaint.alpha = (glow * 170).toInt()
                canvas.drawCircle(ax, ay, armWidth * 0.52f, activeGlowPaint)
                canvas.drawCircle(ax, ay, armWidth * 0.46f, activeStrokePaint)
            }

            // Draw crisp Nintendo DS Directional Triangle (Arrow)
            val arrowSize = armWidth * 0.24f
            val arrowPath = Path().apply {
                moveTo(0f, -arrowSize)
                lineTo(arrowSize * 0.86f, arrowSize * 0.7f)
                lineTo(-arrowSize * 0.86f, arrowSize * 0.7f)
                close()
            }

            canvas.save()
            canvas.translate(ax, ay)
            canvas.rotate(angle)

            // Arrow shadow
            canvas.save()
            canvas.translate(0f, 1.5f)
            canvas.drawPath(arrowPath, arrowShadowPaint)
            canvas.restore()

            if (glow > 0f) {
                arrowPaint.color = Color.parseColor("#00E5FF")
            } else {
                arrowPaint.color = Color.parseColor("#F0F4F8")
            }
            canvas.drawPath(arrowPath, arrowPaint)

            canvas.restore()
            canvas.restore()
        }
    }
}

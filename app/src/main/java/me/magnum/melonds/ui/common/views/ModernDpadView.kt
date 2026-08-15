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

    init {
        ButtonThemeManager.init(context)
    }

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
        strokeWidth = 3.5f
        color = Color.parseColor("#80FFFFFF")
    }

    private val bevelDarkPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = 3.5f
        color = Color.parseColor("#80000000")
    }

    private val shadowPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.FILL
        color = Color.parseColor("#59000000")
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

        val style = ButtonThemeManager.currentStyle
        when (style) {
            ButtonColorStyle.CLASSIC_WHITE -> {
                bodyPaint.color = Color.parseColor("#F2FFFFFF")
                bevelLightPaint.color = Color.parseColor("#80CBD5E1")
                centerDishPaint.color = Color.parseColor("#E2E8F0")
                wellPaint.color = Color.parseColor("#33E2E8F0")
                wellStrokePaint.color = Color.parseColor("#4DE2E8F0")
            }
            ButtonColorStyle.CLASSIC_GREY -> {
                bodyPaint.color = Color.parseColor("#E65A6577")
                bevelLightPaint.color = Color.parseColor("#80D1D5DB")
                centerDishPaint.color = Color.parseColor("#CC475569")
                wellPaint.color = Color.parseColor("#33475569")
                wellStrokePaint.color = Color.parseColor("#4D94A3B8")
            }
            ButtonColorStyle.CRIMSON_RUBY -> {
                bodyPaint.color = Color.parseColor("#E68F0E17")
                bevelLightPaint.color = Color.parseColor("#80FF2A37")
                centerDishPaint.color = Color.parseColor("#CC5C060D")
                wellPaint.color = Color.parseColor("#332D0608")
                wellStrokePaint.color = Color.parseColor("#4DE50914")
            }
            ButtonColorStyle.MIDNIGHT_PURPLE -> {
                bodyPaint.color = Color.parseColor("#E6491979")
                bevelLightPaint.color = Color.parseColor("#80C084FC")
                centerDishPaint.color = Color.parseColor("#CC2D0B4E")
                wellPaint.color = Color.parseColor("#331F1738")
                wellStrokePaint.color = Color.parseColor("#4DC084FC")
            }
            ButtonColorStyle.GOLD_LUXURY -> {
                bodyPaint.color = Color.parseColor("#E6B45309")
                bevelLightPaint.color = Color.parseColor("#80FBBF24")
                centerDishPaint.color = Color.parseColor("#CC78350F")
                wellPaint.color = Color.parseColor("#332A200B")
                wellStrokePaint.color = Color.parseColor("#4DD4A017")
            }
            ButtonColorStyle.EMERALD_MATRIX -> {
                bodyPaint.color = Color.parseColor("#E6047857")
                bevelLightPaint.color = Color.parseColor("#8034D399")
                centerDishPaint.color = Color.parseColor("#CC064E3B")
                wellPaint.color = Color.parseColor("#33052614")
                wellStrokePaint.color = Color.parseColor("#4D00E676")
            }
            else -> {
                bodyPaint.color = Color.parseColor("#E6232730")
                bevelLightPaint.color = Color.parseColor("#66FFFFFF")
                centerDishPaint.color = Color.parseColor("#CC1A1C22")
                wellPaint.color = Color.parseColor("#330F1117")
                wellStrokePaint.color = Color.parseColor("#33FFFFFF")
            }
        }

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

        // Drop shadow for cross
        canvas.drawPath(crossPath, shadowPaint)

        // Draw main body and bevels
        canvas.drawPath(crossPath, bodyPaint)
        canvas.drawPath(crossPath, bevelLightPaint)

        // Draw individual arm active states / glows
        dpadInputs.forEach { input ->
            val glow = directionGlows[input] ?: 0.0f
            if (glow > 0f) {
                val glowCol = when (style) {
                    ButtonColorStyle.CLASSIC_WHITE -> Color.parseColor("#6638BDF8")
                    ButtonColorStyle.CLASSIC_GREY -> Color.parseColor("#6694A3B8")
                    ButtonColorStyle.CRIMSON_RUBY -> Color.parseColor("#66FF1744")
                    ButtonColorStyle.MIDNIGHT_PURPLE -> Color.parseColor("#66C084FC")
                    ButtonColorStyle.GOLD_LUXURY -> Color.parseColor("#66FFD700")
                    ButtonColorStyle.EMERALD_MATRIX -> Color.parseColor("#6600E676")
                    else -> Color.parseColor("#6600E5FF")
                }
                activeGlowPaint.color = glowCol
                activeGlowPaint.alpha = (glow * 180).toInt()

                val armRect = when (input) {
                    Input.UP -> RectF(cx - hw, cy - hl, cx + hw, cy - hw)
                    Input.DOWN -> RectF(cx - hw, cy + hw, cx + hw, cy + hl)
                    Input.LEFT -> RectF(cx - hl, cy - hw, cx - hw, cy + hw)
                    Input.RIGHT -> RectF(cx + hw, cy - hw, cx + hl, cy + hw)
                    else -> null
                }
                if (armRect != null) {
                    canvas.drawRoundRect(armRect, cornerRadius, cornerRadius, activeGlowPaint)
                }
            }
        }

        // Center concave circular dish (Nintendo DS authentic)
        val dishRadius = size * 0.13f
        canvas.drawCircle(cx, cy, dishRadius, centerDishPaint)
        canvas.drawCircle(cx, cy, dishRadius, centerDishRimPaint)

        // Draw arrows on each arm
        val arrowDist = (hl + hw) / 2f * 0.95f
        val arrowSize = size * 0.055f

        arrowPaint.color = if (style == ButtonColorStyle.CLASSIC_WHITE) Color.parseColor("#0F172A") else Color.parseColor("#F0F4F8")

        drawArrow(canvas, cx, cy - arrowDist, arrowSize, 0f)
        drawArrow(canvas, cx + arrowDist, cy, arrowSize, 90f)
        drawArrow(canvas, cx, cy + arrowDist, arrowSize, 180f)
        drawArrow(canvas, cx - arrowDist, cy, arrowSize, 270f)
    }

    private fun drawArrow(canvas: Canvas, x: Float, y: Float, size: Float, angle: Float) {
        canvas.save()
        canvas.rotate(angle, x, y)

        val path = Path().apply {
            moveTo(x, y - size)
            lineTo(x + size * 0.85f, y + size * 0.6f)
            lineTo(x, y + size * 0.2f)
            lineTo(x - size * 0.85f, y + size * 0.6f)
            close()
        }

        canvas.drawPath(path, arrowShadowPaint)
        canvas.drawPath(path, arrowPaint)

        canvas.restore()
    }
}

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
        strokeWidth = 4f
        color = Color.parseColor("#99FFFFFF")
    }

    private val buttonBevelDarkPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = 4f
        color = Color.parseColor("#99000000")
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

    // Text Lettering (Nintendo DS Styled)
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

    private val shadowPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.FILL
        color = Color.parseColor("#59000000")
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
        val buttonRadius = size * 0.175f
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
            ButtonColorStyle.CRIMSON_RUBY -> {
                platePaint.color = Color.parseColor("#332D0608")
                plateStrokePaint.color = Color.parseColor("#4DE50914")
            }
            ButtonColorStyle.MIDNIGHT_PURPLE -> {
                platePaint.color = Color.parseColor("#331F1738")
                plateStrokePaint.color = Color.parseColor("#4DC084FC")
            }
            ButtonColorStyle.GOLD_LUXURY -> {
                platePaint.color = Color.parseColor("#332A200B")
                plateStrokePaint.color = Color.parseColor("#4DD4A017")
            }
            ButtonColorStyle.EMERALD_MATRIX -> {
                platePaint.color = Color.parseColor("#33052614")
                plateStrokePaint.color = Color.parseColor("#4D00E676")
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

            // Realistic 3D ambient drop shadow
            canvas.drawCircle(bx, by + buttonRadius * 0.16f, buttonRadius * 1.03f, shadowPaint)

            // Active press glow
            if (glow > 0f) {
                val glowCol = when (style) {
                    ButtonColorStyle.CLASSIC_WHITE -> Color.parseColor("#6638BDF8")
                    ButtonColorStyle.CLASSIC_GREY -> Color.parseColor("#6694A3B8")
                    ButtonColorStyle.CRIMSON_RUBY -> Color.parseColor("#66FF1744")
                    ButtonColorStyle.MIDNIGHT_PURPLE -> Color.parseColor("#66C084FC")
                    ButtonColorStyle.GOLD_LUXURY -> Color.parseColor("#66FFD700")
                    ButtonColorStyle.EMERALD_MATRIX -> Color.parseColor("#6600E676")
                    ButtonColorStyle.SNES_SUPER -> when (input) {
                        Input.A -> Color.parseColor("#66FF7675")
                        Input.B -> Color.parseColor("#66FFEAA7")
                        Input.X -> Color.parseColor("#6674B9FF")
                        else -> Color.parseColor("#6655EFC4")
                    }
                    else -> Color.parseColor("#6600E5FF")
                }
                activeGlowPaint.color = glowCol
                activeGlowPaint.alpha = (glow * 200).toInt()
                canvas.drawCircle(bx, by, buttonRadius * 1.20f, activeGlowPaint)
            }

            // Authentic 3D Nintendo DS Cap Gradient Shading
            val (cTop, cBottom) = when (style) {
                ButtonColorStyle.CLASSIC_WHITE -> Pair(Color.parseColor("#FFFFFF"), Color.parseColor("#D4D8E2"))
                ButtonColorStyle.CLASSIC_GREY -> Pair(Color.parseColor("#717E91"), Color.parseColor("#444E5E"))
                ButtonColorStyle.CRIMSON_RUBY -> Pair(Color.parseColor("#FF2A37"), Color.parseColor("#99060E"))
                ButtonColorStyle.MIDNIGHT_PURPLE -> Pair(Color.parseColor("#A855F7"), Color.parseColor("#581C87"))
                ButtonColorStyle.GOLD_LUXURY -> Pair(Color.parseColor("#FBBF24"), Color.parseColor("#92400E"))
                ButtonColorStyle.EMERALD_MATRIX -> Pair(Color.parseColor("#00E676"), Color.parseColor("#006932"))
                ButtonColorStyle.SNES_SUPER -> when (input) {
                    Input.A -> Pair(Color.parseColor("#FF5252"), Color.parseColor("#C62828"))
                    Input.B -> Pair(Color.parseColor("#FFD54F"), Color.parseColor("#F57F17"))
                    Input.X -> Pair(Color.parseColor("#42A5F5"), Color.parseColor("#1565C0"))
                    else -> Pair(Color.parseColor("#26A69A"), Color.parseColor("#00695C"))
                }
                else -> Pair(Color.parseColor("#2E3846"), Color.parseColor("#151A22"))
            }

            val capGradient = RadialGradient(
                bx - buttonRadius * 0.30f,
                by - buttonRadius * 0.35f,
                buttonRadius * 1.35f,
                if (glow > 0f) cBottom else cTop,
                cBottom,
                Shader.TileMode.CLAMP
            )
            buttonBodyPaint.shader = capGradient
            canvas.drawCircle(bx, by, buttonRadius, buttonBodyPaint)
            buttonBodyPaint.shader = null

            // 3D tactile bevel rim
            val rectF = RectF(bx - buttonRadius, by - buttonRadius, bx + buttonRadius, by + buttonRadius)
            canvas.drawArc(rectF, 135f, 180f, false, buttonBevelLightPaint)
            canvas.drawArc(rectF, -45f, 180f, false, buttonBevelDarkPaint)

            if (glow > 0f) {
                activeStrokePaint.color = when (style) {
                    ButtonColorStyle.CLASSIC_WHITE -> Color.parseColor("#0284C7")
                    ButtonColorStyle.CLASSIC_GREY -> Color.parseColor("#E2E8F0")
                    ButtonColorStyle.CRIMSON_RUBY -> Color.parseColor("#FF1744")
                    ButtonColorStyle.MIDNIGHT_PURPLE -> Color.parseColor("#C084FC")
                    ButtonColorStyle.GOLD_LUXURY -> Color.parseColor("#FFD700")
                    ButtonColorStyle.EMERALD_MATRIX -> Color.parseColor("#00E676")
                    else -> Color.parseColor("#00E5FF")
                }
                canvas.drawCircle(bx, by, buttonRadius, activeStrokePaint)
            }

            // Nintendo DS Crisp Lettering with High Contrast & Stylized Pressed Look
            val textY = by - (textPaint.descent() + textPaint.ascent()) / 2f
            canvas.drawText(labels[input] ?: "", bx, textY + 2.0f, textShadowPaint)
            if (glow > 0f) {
                textPaint.color = when (style) {
                    ButtonColorStyle.CLASSIC_WHITE -> Color.parseColor("#0284C7")
                    ButtonColorStyle.CLASSIC_GREY -> Color.WHITE
                    ButtonColorStyle.CRIMSON_RUBY -> Color.WHITE
                    ButtonColorStyle.MIDNIGHT_PURPLE -> Color.WHITE
                    ButtonColorStyle.GOLD_LUXURY -> Color.WHITE
                    ButtonColorStyle.EMERALD_MATRIX -> Color.WHITE
                    ButtonColorStyle.SNES_SUPER -> when (input) {
                        Input.B -> Color.parseColor("#1E293B")
                        else -> Color.WHITE
                    }
                    else -> Color.parseColor("#00E5FF")
                }
            } else {
                textPaint.color = when (style) {
                    ButtonColorStyle.CLASSIC_WHITE -> Color.parseColor("#0F172A")
                    ButtonColorStyle.SNES_SUPER -> Color.WHITE
                    ButtonColorStyle.CLASSIC_GREY -> Color.WHITE
                    ButtonColorStyle.GOLD_LUXURY -> Color.WHITE
                    ButtonColorStyle.EMERALD_MATRIX -> Color.WHITE
                    else -> Color.WHITE
                }
            }
            canvas.drawText(labels[input] ?: "", bx, textY, textPaint)

            canvas.restore()
        }
    }
}

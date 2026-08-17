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

    private val stickyLockedInputs = mutableSetOf<Input>()
    private val holdTimerRunnables = mutableMapOf<Input, Runnable>()
    private val mainHandler = android.os.Handler(android.os.Looper.getMainLooper())

    init {
        dpadInputs.forEach { input ->
            directionScales[input] = 1.0f
            directionGlows[input] = 0.0f
        }
    }

    override fun updatePressedInputs(pressedInputs: Set<Input>) {
        dpadInputs.forEach { input ->
            val isPressed = input in pressedInputs
            val isCurrentlyDown = (directionScales[input] ?: 1.0f) < 0.95f

            if (isPressed) {
                if (!isCurrentlyDown) {
                    directionScales[input] = 0.90f
                    directionGlows[input] = 1.0f

                    val holdRunnable = Runnable {
                        stickyLockedInputs.add(input)
                        invalidate()
                    }
                    holdTimerRunnables[input] = holdRunnable
                    mainHandler.postDelayed(holdRunnable, 3000L)
                }
            } else {
                if (isCurrentlyDown) {
                    holdTimerRunnables.remove(input)?.let { mainHandler.removeCallbacks(it) }

                    if (input in stickyLockedInputs) {
                        stickyLockedInputs.remove(input)
                        directionScales[input] = 1.0f
                        directionGlows[input] = 0.0f
                    } else {
                        directionScales[input] = 1.0f
                        directionGlows[input] = 0.0f
                    }
                } else if (input in stickyLockedInputs) {
                    directionScales[input] = 1.0f
                    directionGlows[input] = 1.0f
                } else {
                    directionScales[input] = 1.0f
                    directionGlows[input] = 0.0f
                }
            }
        }
        invalidate()
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
            ButtonColorStyle.WII_CRYSTAL -> {
                bodyPaint.color = Color.parseColor("#F2FFFFFF")
                bevelLightPaint.color = Color.parseColor("#80CBD5E1")
                centerDishPaint.color = Color.parseColor("#E2E8F0")
                wellPaint.color = Color.parseColor("#33FFFFFF")
                wellStrokePaint.color = Color.parseColor("#6600D2FF")
            }
            ButtonColorStyle.WII_U_DARK -> {
                bodyPaint.color = Color.parseColor("#E61E222B")
                bevelLightPaint.color = Color.parseColor("#80475569")
                centerDishPaint.color = Color.parseColor("#CC111318")
                wellPaint.color = Color.parseColor("#331E222B")
                wellStrokePaint.color = Color.parseColor("#4D38BDF8")
            }
            ButtonColorStyle.SWITCH_NEON, ButtonColorStyle.SWITCH_OLED -> {
                bodyPaint.color = Color.parseColor("#E61E293B")
                bevelLightPaint.color = Color.parseColor("#8064748B")
                centerDishPaint.color = Color.parseColor("#CC0F172A")
                wellPaint.color = Color.parseColor("#330F172A")
                wellStrokePaint.color = Color.parseColor("#4D38BDF8")
            }
            ButtonColorStyle.VIRTUAL_BOY -> {
                bodyPaint.color = Color.parseColor("#E61A0005")
                bevelLightPaint.color = Color.parseColor("#80FF0033")
                centerDishPaint.color = Color.parseColor("#CC0A0002")
                wellPaint.color = Color.parseColor("#40000000")
                wellStrokePaint.color = Color.parseColor("#66FF0033")
            }
            ButtonColorStyle.GAMECUBE_INDIGO -> {
                bodyPaint.color = Color.parseColor("#E63C3B6E")
                bevelLightPaint.color = Color.parseColor("#806C5CE7")
                centerDishPaint.color = Color.parseColor("#CC2A2952")
                wellPaint.color = Color.parseColor("#333C3B6E")
                wellStrokePaint.color = Color.parseColor("#4D6C5CE7")
            }
            ButtonColorStyle.GAMEBOY_DMG -> {
                bodyPaint.color = Color.parseColor("#E65A5A66")
                bevelLightPaint.color = Color.parseColor("#808E8E93")
                centerDishPaint.color = Color.parseColor("#CC3A3A44")
                wellPaint.color = Color.parseColor("#338E8E93")
                wellStrokePaint.color = Color.parseColor("#4D5856D6")
            }
            ButtonColorStyle.GBA_GLACIER -> {
                bodyPaint.color = Color.parseColor("#E64A69BD")
                bevelLightPaint.color = Color.parseColor("#80706FD3")
                centerDishPaint.color = Color.parseColor("#CC2C2C54")
                wellPaint.color = Color.parseColor("#334A69BD")
                wellStrokePaint.color = Color.parseColor("#4D6A89CC")
            }
            ButtonColorStyle.FAMICOM_RETRO -> {
                bodyPaint.color = Color.parseColor("#E68B0000")
                bevelLightPaint.color = Color.parseColor("#80FFD700")
                centerDishPaint.color = Color.parseColor("#CC4A0000")
                wellPaint.color = Color.parseColor("#33B8860B")
                wellStrokePaint.color = Color.parseColor("#4DDAA520")
            }
            ButtonColorStyle.NINTENDO_3DS_AQUA -> {
                bodyPaint.color = Color.parseColor("#E6004D40")
                bevelLightPaint.color = Color.parseColor("#8000D2D3")
                centerDishPaint.color = Color.parseColor("#CC002B24")
                wellPaint.color = Color.parseColor("#33004E64")
                wellStrokePaint.color = Color.parseColor("#4D00A896")
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

        // Drop shadow for tactile cross
        canvas.save()
        canvas.translate(2.5f, 4.5f)
        canvas.drawPath(crossPath, shadowPaint)
        canvas.restore()

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
                    ButtonColorStyle.WII_CRYSTAL -> Color.parseColor("#6600D2FF")
                    ButtonColorStyle.WII_U_DARK -> Color.parseColor("#6638BDF8")
                    ButtonColorStyle.SWITCH_NEON -> when (input) {
                        Input.RIGHT, Input.DOWN -> Color.parseColor("#66FF3E3E")
                        else -> Color.parseColor("#660AB9E6")
                    }
                    ButtonColorStyle.SWITCH_OLED -> Color.parseColor("#6694A3B8")
                    ButtonColorStyle.VIRTUAL_BOY -> Color.parseColor("#80FF0033")
                    ButtonColorStyle.GAMECUBE_INDIGO -> Color.parseColor("#666C5CE7")
                    ButtonColorStyle.GAMEBOY_DMG -> Color.parseColor("#66C70039")
                    ButtonColorStyle.GBA_GLACIER -> Color.parseColor("#66706FD3")
                    ButtonColorStyle.FAMICOM_RETRO -> Color.parseColor("#66FFD700")
                    ButtonColorStyle.NINTENDO_3DS_AQUA -> Color.parseColor("#6600D2D3")
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

        arrowPaint.color = when (style) {
            ButtonColorStyle.CLASSIC_WHITE, ButtonColorStyle.WII_CRYSTAL -> Color.parseColor("#0F172A")
            ButtonColorStyle.VIRTUAL_BOY -> Color.parseColor("#FF0033")
            ButtonColorStyle.FAMICOM_RETRO -> Color.parseColor("#FFD700")
            ButtonColorStyle.NINTENDO_3DS_AQUA -> Color.parseColor("#00FFFF")
            else -> Color.parseColor("#F0F4F8")
        }

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

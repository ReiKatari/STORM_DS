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

    var buttonSpread: Float = 1.0f
        set(value) {
            field = value.coerceIn(0.6f, 1.6f)
            invalidate()
        }

    var buttonInnerScale: Float = 1.0f
        set(value) {
            field = value.coerceIn(0.6f, 1.4f)
            invalidate()
        }

    private val buttonScales = mutableMapOf<Input, Float>()
    private val buttonGlows = mutableMapOf<Input, Float>()
    private val stickyLockedInputs = mutableSetOf<Input>()
    private val holdTimerRunnables = mutableMapOf<Input, Runnable>()
    private val mainHandler = android.os.Handler(android.os.Looper.getMainLooper())

    override fun updatePressedInputs(pressedInputs: Set<Input>) {
        val allInputs = listOf(Input.X, Input.Y, Input.B, Input.A)
        allInputs.forEach { input ->
            val isPressed = input in pressedInputs
            val isCurrentlyDown = (buttonScales[input] ?: 1.0f) < 0.95f

            if (isPressed) {
                if (!isCurrentlyDown) {
                    buttonScales[input] = 0.88f
                    buttonGlows[input] = 1.0f

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
                        buttonScales[input] = 1.0f
                        buttonGlows[input] = 0.0f
                    } else {
                        buttonScales[input] = 1.0f
                        buttonGlows[input] = 0.0f
                    }
                } else if (input in stickyLockedInputs) {
                    buttonScales[input] = 1.0f
                    buttonGlows[input] = 1.0f
                } else {
                    buttonScales[input] = 1.0f
                    buttonGlows[input] = 0.0f
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
        val buttonRadius = size * 0.175f * buttonInnerScale
        val offset = size * 0.285f * buttonSpread

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
            ButtonColorStyle.WII_CRYSTAL -> {
                platePaint.color = Color.parseColor("#33FFFFFF")
                plateStrokePaint.color = Color.parseColor("#6600D2FF")
            }
            ButtonColorStyle.WII_U_DARK -> {
                platePaint.color = Color.parseColor("#331E222B")
                plateStrokePaint.color = Color.parseColor("#4D38BDF8")
            }
            ButtonColorStyle.SWITCH_NEON -> {
                platePaint.color = Color.parseColor("#330F172A")
                plateStrokePaint.color = Color.parseColor("#4DFF3B30")
            }
            ButtonColorStyle.SWITCH_OLED -> {
                platePaint.color = Color.parseColor("#26000000")
                plateStrokePaint.color = Color.parseColor("#4DFFFFFF")
            }
            ButtonColorStyle.VIRTUAL_BOY -> {
                platePaint.color = Color.parseColor("#40000000")
                plateStrokePaint.color = Color.parseColor("#66FF0033")
            }
            ButtonColorStyle.GAMECUBE_INDIGO -> {
                platePaint.color = Color.parseColor("#333C3B6E")
                plateStrokePaint.color = Color.parseColor("#4D6C5CE7")
            }
            ButtonColorStyle.GAMEBOY_DMG -> {
                platePaint.color = Color.parseColor("#338E8E93")
                plateStrokePaint.color = Color.parseColor("#4D5856D6")
            }
            ButtonColorStyle.GBA_GLACIER -> {
                platePaint.color = Color.parseColor("#334A69BD")
                plateStrokePaint.color = Color.parseColor("#4D6A89CC")
            }
            ButtonColorStyle.FAMICOM_RETRO -> {
                platePaint.color = Color.parseColor("#33B8860B")
                plateStrokePaint.color = Color.parseColor("#4DDAA520")
            }
            ButtonColorStyle.NINTENDO_3DS_AQUA -> {
                platePaint.color = Color.parseColor("#33004E64")
                plateStrokePaint.color = Color.parseColor("#4D00A896")
            }
            else -> {
                platePaint.color = Color.parseColor("#26111318")
                plateStrokePaint.color = Color.parseColor("#33FFFFFF")
            }
        }

        // Plate 3D drop shadow
        canvas.save()
        canvas.translate(2f, 4f)
        canvas.drawPath(platePath, shadowPaint)
        canvas.restore()

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
            canvas.drawCircle(bx + 1.5f, by + buttonRadius * 0.16f + 2f, buttonRadius * 1.05f, shadowPaint)

            // Active press glow
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
                        Input.A, Input.B -> Color.parseColor("#66FF3E3E")
                        else -> Color.parseColor("#660AB9E6")
                    }
                    ButtonColorStyle.SWITCH_OLED -> Color.parseColor("#6694A3B8")
                    ButtonColorStyle.VIRTUAL_BOY -> Color.parseColor("#80FF0033")
                    ButtonColorStyle.GAMECUBE_INDIGO -> when (input) {
                        Input.A -> Color.parseColor("#6600B894")
                        Input.B -> Color.parseColor("#66D63031")
                        else -> Color.parseColor("#66A4B0BE")
                    }
                    ButtonColorStyle.GAMEBOY_DMG -> Color.parseColor("#66C70039")
                    ButtonColorStyle.GBA_GLACIER -> Color.parseColor("#66706FD3")
                    ButtonColorStyle.FAMICOM_RETRO -> Color.parseColor("#66FFD700")
                    ButtonColorStyle.NINTENDO_3DS_AQUA -> Color.parseColor("#6600D2D3")
                    ButtonColorStyle.SNES_SUPER -> when (input) {
                        Input.A -> Color.parseColor("#66FF7675")
                        Input.B -> Color.parseColor("#66FFEAA7")
                        Input.X -> Color.parseColor("#6674B9FF")
                        else -> Color.parseColor("#6655EFC4")
                    }
                    ButtonColorStyle.STORM_ARCADE_RETRO -> when (input) {
                        Input.A -> Color.parseColor("#663B82F6")
                        Input.B -> Color.parseColor("#66FBBF24")
                        Input.X -> Color.parseColor("#66EF4444")
                        else -> Color.parseColor("#6610B981")
                    }
                    ButtonColorStyle.STORM_AURORA_SPECTRUM -> when (input) {
                        Input.A -> Color.parseColor("#80FB7185")
                        Input.B -> Color.parseColor("#8034D399")
                        Input.X -> Color.parseColor("#8038BDF8")
                        else -> Color.parseColor("#80FCD34D")
                    }
                    ButtonColorStyle.STORM_CYBERPUNK_NEON -> when (input) {
                        Input.A -> Color.parseColor("#80FCEE0A")
                        Input.B -> Color.parseColor("#80FF003C")
                        Input.X -> Color.parseColor("#8000F0FF")
                        else -> Color.parseColor("#80B026FF")
                    }
                    ButtonColorStyle.STORM_FROST_GLACIER -> when (input) {
                        Input.A -> Color.parseColor("#800EA5E9")
                        Input.B -> Color.parseColor("#8014B8A6")
                        Input.X -> Color.parseColor("#8006B6D4")
                        else -> Color.parseColor("#8038BDF8")
                    }
                    ButtonColorStyle.STORM_SAKURA_BLOSSOM -> when (input) {
                        Input.A -> Color.parseColor("#80E11D48")
                        Input.B -> Color.parseColor("#80F472B6")
                        Input.X -> Color.parseColor("#80C084FC")
                        else -> Color.parseColor("#80FB7185")
                    }
                    ButtonColorStyle.STORM_SOLAR_FUSION -> when (input) {
                        Input.A -> Color.parseColor("#80D97706")
                        Input.B -> Color.parseColor("#80F59E0B")
                        Input.X -> Color.parseColor("#80EA580C")
                        else -> Color.parseColor("#80FB923C")
                    }
                    else -> Color.parseColor("#6600E5FF")
                }
                activeGlowPaint.color = glowCol
                activeGlowPaint.alpha = (glow * 200).toInt()
                canvas.drawCircle(bx, by, buttonRadius * 1.20f, activeGlowPaint)
            }

            // Authentic 3D Nintendo DS Cap Gradient Shading
            val (cTop, cBottom) = when (style) {
                ButtonColorStyle.CLASSIC_WHITE -> Pair(Color.parseColor("#FFFFFF"), Color.parseColor("#CBD5E1"))
                ButtonColorStyle.CLASSIC_GREY -> Pair(Color.parseColor("#64748B"), Color.parseColor("#334155"))
                ButtonColorStyle.CRIMSON_RUBY -> Pair(Color.parseColor("#DC2626"), Color.parseColor("#5B090E"))
                ButtonColorStyle.MIDNIGHT_PURPLE -> Pair(Color.parseColor("#9333EA"), Color.parseColor("#3B0764"))
                ButtonColorStyle.GOLD_LUXURY -> Pair(Color.parseColor("#D97706"), Color.parseColor("#5C2B05"))
                ButtonColorStyle.EMERALD_MATRIX -> Pair(Color.parseColor("#059669"), Color.parseColor("#022C22"))
                ButtonColorStyle.WII_CRYSTAL -> Pair(Color.parseColor("#FFFFFF"), Color.parseColor("#DDE3EA"))
                ButtonColorStyle.WII_U_DARK -> Pair(Color.parseColor("#2C3240"), Color.parseColor("#151922"))
                ButtonColorStyle.SWITCH_NEON -> when (input) {
                    Input.A, Input.B -> Pair(Color.parseColor("#FF3E3E"), Color.parseColor("#B91C1C"))
                    else -> Pair(Color.parseColor("#0AB9E6"), Color.parseColor("#0284C7"))
                }
                ButtonColorStyle.SWITCH_OLED -> Pair(Color.parseColor("#F8FAFC"), Color.parseColor("#CBD5E1"))
                ButtonColorStyle.VIRTUAL_BOY -> Pair(Color.parseColor("#2B0008"), Color.parseColor("#0A0002"))
                ButtonColorStyle.GAMECUBE_INDIGO -> when (input) {
                    Input.A -> Pair(Color.parseColor("#00B894"), Color.parseColor("#006266"))
                    Input.B -> Pair(Color.parseColor("#D63031"), Color.parseColor("#740E10"))
                    else -> Pair(Color.parseColor("#747D8C"), Color.parseColor("#2F3542"))
                }
                ButtonColorStyle.GAMEBOY_DMG -> Pair(Color.parseColor("#801336"), Color.parseColor("#4A0E17"))
                ButtonColorStyle.GBA_GLACIER -> Pair(Color.parseColor("#575FCF"), Color.parseColor("#2C2C54"))
                ButtonColorStyle.FAMICOM_RETRO -> Pair(Color.parseColor("#8B0000"), Color.parseColor("#4A0000"))
                ButtonColorStyle.NINTENDO_3DS_AQUA -> Pair(Color.parseColor("#00838F"), Color.parseColor("#004D40"))
                ButtonColorStyle.SNES_SUPER -> when (input) {
                    Input.A -> Pair(Color.parseColor("#DC2626"), Color.parseColor("#7F1D1D"))
                    Input.B -> Pair(Color.parseColor("#F59E0B"), Color.parseColor("#78350F"))
                    Input.X -> Pair(Color.parseColor("#2563EB"), Color.parseColor("#1E3A8A"))
                    else -> Pair(Color.parseColor("#059669"), Color.parseColor("#064E3B"))
                }
                ButtonColorStyle.STORM_ARCADE_RETRO -> when (input) {
                    Input.A -> Pair(Color.parseColor("#2563EB"), Color.parseColor("#1E3A8A"))
                    Input.B -> Pair(Color.parseColor("#D97706"), Color.parseColor("#78350F"))
                    Input.X -> Pair(Color.parseColor("#DC2626"), Color.parseColor("#7F1D1D"))
                    else -> Pair(Color.parseColor("#059669"), Color.parseColor("#064E3B"))
                }
                ButtonColorStyle.STORM_AURORA_SPECTRUM -> when (input) {
                    Input.A -> Pair(Color.parseColor("#FDA4AF"), Color.parseColor("#E11D48"))
                    Input.B -> Pair(Color.parseColor("#6EE7B7"), Color.parseColor("#059669"))
                    Input.X -> Pair(Color.parseColor("#7DD3FC"), Color.parseColor("#0284C7"))
                    else -> Pair(Color.parseColor("#FDE047"), Color.parseColor("#D97706"))
                }
                ButtonColorStyle.STORM_CYBERPUNK_NEON -> when (input) {
                    Input.A -> Pair(Color.parseColor("#FCEE0A"), Color.parseColor("#857E02"))
                    Input.B -> Pair(Color.parseColor("#FF003C"), Color.parseColor("#8A001F"))
                    Input.X -> Pair(Color.parseColor("#00F0FF"), Color.parseColor("#007D85"))
                    else -> Pair(Color.parseColor("#B026FF"), Color.parseColor("#5A008A"))
                }
                ButtonColorStyle.STORM_FROST_GLACIER -> when (input) {
                    Input.A -> Pair(Color.parseColor("#BAE6FD"), Color.parseColor("#0284C7"))
                    Input.B -> Pair(Color.parseColor("#99F6E4"), Color.parseColor("#0D9488"))
                    Input.X -> Pair(Color.parseColor("#A5F3FC"), Color.parseColor("#0891B2"))
                    else -> Pair(Color.parseColor("#E0F2FE"), Color.parseColor("#0369A1"))
                }
                ButtonColorStyle.STORM_SAKURA_BLOSSOM -> when (input) {
                    Input.A -> Pair(Color.parseColor("#FB7185"), Color.parseColor("#BE123C"))
                    Input.B -> Pair(Color.parseColor("#F472B6"), Color.parseColor("#DB2777"))
                    Input.X -> Pair(Color.parseColor("#E879F9"), Color.parseColor("#A21CAF"))
                    else -> Pair(Color.parseColor("#FBCFE8"), Color.parseColor("#E11D48"))
                }
                ButtonColorStyle.STORM_SOLAR_FUSION -> when (input) {
                    Input.A -> Pair(Color.parseColor("#FDE68A"), Color.parseColor("#D97706"))
                    Input.B -> Pair(Color.parseColor("#FCD34D"), Color.parseColor("#B45309"))
                    Input.X -> Pair(Color.parseColor("#FCA5A5"), Color.parseColor("#DC2626"))
                    else -> Pair(Color.parseColor("#FED7AA"), Color.parseColor("#EA580C"))
                }
                else -> Pair(Color.parseColor("#334155"), Color.parseColor("#0F172A"))
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
                    ButtonColorStyle.WII_CRYSTAL -> Color.parseColor("#00D2FF")
                    ButtonColorStyle.WII_U_DARK -> Color.parseColor("#38BDF8")
                    ButtonColorStyle.SWITCH_NEON -> when (input) {
                        Input.A, Input.B -> Color.parseColor("#FF3E3E")
                        else -> Color.parseColor("#0AB9E6")
                    }
                    ButtonColorStyle.SWITCH_OLED -> Color.parseColor("#FFFFFF")
                    ButtonColorStyle.VIRTUAL_BOY -> Color.parseColor("#FF0033")
                    ButtonColorStyle.GAMECUBE_INDIGO -> when (input) {
                        Input.A -> Color.parseColor("#00B894")
                        Input.B -> Color.parseColor("#D63031")
                        else -> Color.parseColor("#A4B0BE")
                    }
                    ButtonColorStyle.GAMEBOY_DMG -> Color.parseColor("#FF4081")
                    ButtonColorStyle.GBA_GLACIER -> Color.parseColor("#706FD3")
                    ButtonColorStyle.FAMICOM_RETRO -> Color.parseColor("#FFD700")
                    ButtonColorStyle.NINTENDO_3DS_AQUA -> Color.parseColor("#00D2D3")
                    ButtonColorStyle.SNES_SUPER -> when (input) {
                        Input.A -> Color.parseColor("#FF1744")
                        Input.B -> Color.parseColor("#FBBF24")
                        Input.X -> Color.parseColor("#60A5FA")
                        else -> Color.parseColor("#34D399")
                    }
                    ButtonColorStyle.STORM_ARCADE_RETRO -> when (input) {
                        Input.A -> Color.parseColor("#3B82F6")
                        Input.B -> Color.parseColor("#FBBF24")
                        Input.X -> Color.parseColor("#EF4444")
                        else -> Color.parseColor("#10B981")
                    }
                    ButtonColorStyle.STORM_AURORA_SPECTRUM, ButtonColorStyle.STORM_SAKURA_BLOSSOM -> Color.parseColor("#FB7185")
                    ButtonColorStyle.STORM_CYBERPUNK_NEON -> Color.parseColor("#FCEE0A")
                    ButtonColorStyle.STORM_FROST_GLACIER -> Color.parseColor("#38BDF8")
                    ButtonColorStyle.STORM_SOLAR_FUSION -> Color.parseColor("#F59E0B")
                    else -> Color.parseColor("#00E5FF")
                }
                canvas.drawCircle(bx, by, buttonRadius, activeStrokePaint)
            }

            // Nintendo DS Crisp Lettering with High Contrast & Stylized Pressed Look
            val textY = by - (textPaint.descent() + textPaint.ascent()) / 2f
            canvas.drawText(labels[input] ?: "", bx, textY + 2.0f, textShadowPaint)
            if (glow > 0f) {
                textPaint.color = when (style) {
                    ButtonColorStyle.CLASSIC_WHITE, ButtonColorStyle.WII_CRYSTAL -> Color.parseColor("#0284C7")
                    ButtonColorStyle.SWITCH_OLED -> Color.parseColor("#0F172A")
                    ButtonColorStyle.VIRTUAL_BOY -> Color.parseColor("#FF0033")
                    ButtonColorStyle.FAMICOM_RETRO -> Color.parseColor("#FFD700")
                    ButtonColorStyle.NINTENDO_3DS_AQUA -> Color.parseColor("#00FFFF")
                    ButtonColorStyle.SNES_SUPER, ButtonColorStyle.STORM_ARCADE_RETRO -> when (input) {
                        Input.B -> Color.parseColor("#0F172A")
                        else -> Color.WHITE
                    }
                    ButtonColorStyle.STORM_CYBERPUNK_NEON -> when (input) {
                        Input.A -> Color.parseColor("#0F172A")
                        else -> Color.WHITE
                    }
                    ButtonColorStyle.STORM_AURORA_SPECTRUM, ButtonColorStyle.STORM_FROST_GLACIER,
                    ButtonColorStyle.STORM_SAKURA_BLOSSOM, ButtonColorStyle.STORM_SOLAR_FUSION -> Color.parseColor("#0F172A")
                    else -> Color.WHITE
                }
            } else {
                textPaint.color = when (style) {
                    ButtonColorStyle.CLASSIC_WHITE, ButtonColorStyle.WII_CRYSTAL, ButtonColorStyle.SWITCH_OLED -> Color.parseColor("#0F172A")
                    ButtonColorStyle.VIRTUAL_BOY -> Color.parseColor("#FF0033")
                    ButtonColorStyle.FAMICOM_RETRO -> Color.parseColor("#FFD700")
                    ButtonColorStyle.NINTENDO_3DS_AQUA -> Color.parseColor("#00FFFF")
                    ButtonColorStyle.GAMEBOY_DMG -> Color.parseColor("#F2C9D8")
                    ButtonColorStyle.SNES_SUPER, ButtonColorStyle.STORM_ARCADE_RETRO -> when (input) {
                        Input.B -> Color.parseColor("#0F172A")
                        else -> Color.WHITE
                    }
                    ButtonColorStyle.STORM_CYBERPUNK_NEON -> when (input) {
                        Input.A -> Color.parseColor("#0F172A")
                        else -> Color.WHITE
                    }
                    ButtonColorStyle.STORM_AURORA_SPECTRUM, ButtonColorStyle.STORM_FROST_GLACIER,
                    ButtonColorStyle.STORM_SAKURA_BLOSSOM, ButtonColorStyle.STORM_SOLAR_FUSION -> Color.parseColor("#0F172A")
                    else -> Color.WHITE
                }
            }
            canvas.drawText(labels[input] ?: "", bx, textY, textPaint)

            canvas.restore()
        }
    }
}

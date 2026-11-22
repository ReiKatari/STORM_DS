package me.magnum.melonds.ui.common.views

import android.animation.ValueAnimator
import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View
import me.magnum.melonds.domain.model.Input
import me.magnum.melonds.domain.model.layout.LayoutComponent
import kotlin.math.min

class ModernSingleButtonView @JvmOverloads constructor(
    context: Context,
    private val component: LayoutComponent? = null,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr), IAnimatedInputView {

    init {
        ButtonThemeManager.init(context)
    }

    private val bgPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.FILL
        color = Color.parseColor("#E6232730")
    }

    private val strokePaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = 3f
        color = Color.parseColor("#66FFFFFF")
    }

    private val shadowPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.FILL
        color = Color.parseColor("#59000000")
    }

    private val activeGlowPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.FILL
        color = Color.parseColor("#6600E5FF")
    }

    private val activeStrokePaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = 4.5f
        color = Color.parseColor("#FF00E5FF")
    }

    private val iconPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.FILL_AND_STROKE
        strokeWidth = 3f
        strokeCap = Paint.Cap.ROUND
        strokeJoin = Paint.Join.ROUND
        color = Color.parseColor("#F0F4F8")
    }

    private val iconShadowPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.FILL_AND_STROKE
        strokeWidth = 3f
        strokeCap = Paint.Cap.ROUND
        strokeJoin = Paint.Join.ROUND
        color = Color.parseColor("#99000000")
    }

    private val textPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.parseColor("#F0F4F8")
        textAlign = Paint.Align.CENTER
        typeface = Typeface.create("sans-serif-medium", Typeface.BOLD)
    }

    private val textShadowPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.parseColor("#99000000")
        textAlign = Paint.Align.CENTER
        typeface = Typeface.create("sans-serif-medium", Typeface.BOLD)
    }

    private var buttonScale = 1.0f
    private var buttonGlow = 0.0f
    private var isToggledOn: Boolean = true
    private var animator: ValueAnimator? = null

    fun setToggleState(enabled: Boolean) {
        if (isToggledOn != enabled) {
            isToggledOn = enabled
            invalidate()
        }
    }

    private var isStickyLocked: Boolean = false
    private var holdTimerRunnable: Runnable? = null
    private val mainHandler = android.os.Handler(android.os.Looper.getMainLooper())

    override fun updatePressedInputs(pressedInputs: Set<Input>) {
        val isPressed = pressedInputs.isNotEmpty()
        val isCurrentlyDown = buttonScale < 0.95f

        if (isPressed) {
            if (!isCurrentlyDown) {
                buttonScale = 0.86f
                buttonGlow = 1.0f

                val holdRunnable = Runnable {
                    isStickyLocked = true
                    invalidate()
                }
                holdTimerRunnable = holdRunnable
                mainHandler.postDelayed(holdRunnable, 3000L)
            }
        } else {
            if (isCurrentlyDown) {
                holdTimerRunnable?.let { mainHandler.removeCallbacks(it) }
                holdTimerRunnable = null

                if (isStickyLocked) {
                    isStickyLocked = false
                    buttonScale = 1.0f
                    buttonGlow = 0.0f
                } else {
                    buttonScale = 1.0f
                    buttonGlow = 0.0f
                }
            } else if (isStickyLocked) {
                buttonScale = 1.0f
                buttonGlow = 1.0f
            } else {
                buttonScale = 1.0f
                buttonGlow = 0.0f
            }
        }
        invalidate()
    }

    private fun getLabel(): String {
        return when (component) {
            LayoutComponent.BUTTON_A -> "A"
            LayoutComponent.BUTTON_B -> "B"
            LayoutComponent.BUTTON_X -> "X"
            LayoutComponent.BUTTON_Y -> "Y"
            LayoutComponent.BUTTON_L -> "L"
            LayoutComponent.BUTTON_R -> "R"
            LayoutComponent.BUTTON_START -> "START"
            LayoutComponent.BUTTON_SELECT -> "SELECT"
            else -> ""
        }
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        val w = width.toFloat()
        val h = height.toFloat()
        if (w <= 0 || h <= 0) return

        val cx = w / 2f
        val cy = h / 2f

        canvas.save()
        canvas.scale(buttonScale, buttonScale, cx, cy)

        val padding = 4f
        val rect = RectF(padding, padding, w - padding, h - padding)

        val style = ButtonThemeManager.currentStyle
        val defaultBg = when (style) {
            ButtonColorStyle.CLASSIC_WHITE -> Color.parseColor("#F2FFFFFF")
            ButtonColorStyle.CLASSIC_GREY -> Color.parseColor("#E65A6577")
            ButtonColorStyle.CRIMSON_RUBY -> Color.parseColor("#E68F0E17")
            ButtonColorStyle.MIDNIGHT_PURPLE -> Color.parseColor("#E6491979")
            ButtonColorStyle.GOLD_LUXURY -> Color.parseColor("#E6B45309")
            ButtonColorStyle.EMERALD_MATRIX -> Color.parseColor("#E6047857")
            ButtonColorStyle.WII_CRYSTAL -> Color.parseColor("#F2FFFFFF")
            ButtonColorStyle.WII_U_DARK -> Color.parseColor("#E61E222B")
            ButtonColorStyle.SWITCH_NEON, ButtonColorStyle.SWITCH_OLED -> Color.parseColor("#E61E293B")
            ButtonColorStyle.VIRTUAL_BOY -> Color.parseColor("#E61A0005")
            ButtonColorStyle.GAMECUBE_INDIGO -> Color.parseColor("#E63C3B6E")
            ButtonColorStyle.GAMEBOY_DMG -> Color.parseColor("#E6801336")
            ButtonColorStyle.GBA_GLACIER -> Color.parseColor("#E6575FCF")
            ButtonColorStyle.FAMICOM_RETRO -> Color.parseColor("#E68B0000")
            ButtonColorStyle.NINTENDO_3DS_AQUA -> Color.parseColor("#E6006266")
            else -> Color.parseColor("#E6232730")
        }
        val pressedBg = when (style) {
            ButtonColorStyle.CLASSIC_WHITE -> Color.parseColor("#E6E2E8F0")
            ButtonColorStyle.CLASSIC_GREY -> Color.parseColor("#E6374151")
            ButtonColorStyle.CRIMSON_RUBY -> Color.parseColor("#E65C060D")
            ButtonColorStyle.MIDNIGHT_PURPLE -> Color.parseColor("#E62D0B4E")
            ButtonColorStyle.GOLD_LUXURY -> Color.parseColor("#E678350F")
            ButtonColorStyle.EMERALD_MATRIX -> Color.parseColor("#E6064E3B")
            ButtonColorStyle.WII_CRYSTAL -> Color.parseColor("#E6DDE3EA")
            ButtonColorStyle.WII_U_DARK -> Color.parseColor("#E6111318")
            ButtonColorStyle.SWITCH_NEON, ButtonColorStyle.SWITCH_OLED -> Color.parseColor("#E60F172A")
            ButtonColorStyle.VIRTUAL_BOY -> Color.parseColor("#E60A0002")
            ButtonColorStyle.GAMECUBE_INDIGO -> Color.parseColor("#E62A2952")
            ButtonColorStyle.GAMEBOY_DMG -> Color.parseColor("#E64A0E17")
            ButtonColorStyle.GBA_GLACIER -> Color.parseColor("#E62C2C54")
            ButtonColorStyle.FAMICOM_RETRO -> Color.parseColor("#E64A0000")
            ButtonColorStyle.NINTENDO_3DS_AQUA -> Color.parseColor("#E6002B36")
            else -> Color.parseColor("#E61A3A4D")
        }
        val normalStroke = when (style) {
            ButtonColorStyle.CLASSIC_WHITE -> Color.parseColor("#80CBD5E1")
            ButtonColorStyle.CLASSIC_GREY -> Color.parseColor("#80D1D5DB")
            ButtonColorStyle.CRIMSON_RUBY -> Color.parseColor("#80E50914")
            ButtonColorStyle.MIDNIGHT_PURPLE -> Color.parseColor("#80C084FC")
            ButtonColorStyle.GOLD_LUXURY -> Color.parseColor("#80F59E0B")
            ButtonColorStyle.EMERALD_MATRIX -> Color.parseColor("#8010B981")
            ButtonColorStyle.WII_CRYSTAL -> Color.parseColor("#80CBD5E1")
            ButtonColorStyle.WII_U_DARK -> Color.parseColor("#80475569")
            ButtonColorStyle.SWITCH_NEON -> Color.parseColor("#80FF3B30")
            ButtonColorStyle.SWITCH_OLED -> Color.parseColor("#80FFFFFF")
            ButtonColorStyle.VIRTUAL_BOY -> Color.parseColor("#80FF0033")
            ButtonColorStyle.GAMECUBE_INDIGO -> Color.parseColor("#806C5CE7")
            ButtonColorStyle.GAMEBOY_DMG -> Color.parseColor("#805856D6")
            ButtonColorStyle.GBA_GLACIER -> Color.parseColor("#80706FD3")
            ButtonColorStyle.FAMICOM_RETRO -> Color.parseColor("#80FFD700")
            ButtonColorStyle.NINTENDO_3DS_AQUA -> Color.parseColor("#8000D2D3")
            else -> Color.parseColor("#66FFFFFF")
        }
        val glowColor = when (style) {
            ButtonColorStyle.CLASSIC_WHITE -> Color.parseColor("#6638BDF8")
            ButtonColorStyle.CLASSIC_GREY -> Color.parseColor("#6694A3B8")
            ButtonColorStyle.CRIMSON_RUBY -> Color.parseColor("#66FF1744")
            ButtonColorStyle.MIDNIGHT_PURPLE -> Color.parseColor("#66C084FC")
            ButtonColorStyle.GOLD_LUXURY -> Color.parseColor("#66FFD700")
            ButtonColorStyle.EMERALD_MATRIX -> Color.parseColor("#6600E676")
            ButtonColorStyle.WII_CRYSTAL -> Color.parseColor("#6600D2FF")
            ButtonColorStyle.WII_U_DARK -> Color.parseColor("#6638BDF8")
            ButtonColorStyle.SWITCH_NEON -> Color.parseColor("#66FF3E3E")
            ButtonColorStyle.SWITCH_OLED -> Color.parseColor("#6694A3B8")
            ButtonColorStyle.VIRTUAL_BOY -> Color.parseColor("#80FF0033")
            ButtonColorStyle.GAMECUBE_INDIGO -> Color.parseColor("#666C5CE7")
            ButtonColorStyle.GAMEBOY_DMG -> Color.parseColor("#66C70039")
            ButtonColorStyle.GBA_GLACIER -> Color.parseColor("#66706FD3")
            ButtonColorStyle.FAMICOM_RETRO -> Color.parseColor("#66FFD700")
            ButtonColorStyle.NINTENDO_3DS_AQUA -> Color.parseColor("#6600D2D3")
            else -> Color.parseColor("#6600E5FF")
        }
        val activeStroke = when (style) {
            ButtonColorStyle.CLASSIC_WHITE -> Color.parseColor("#0284C7")
            ButtonColorStyle.CLASSIC_GREY -> Color.parseColor("#CBD5E1")
            ButtonColorStyle.CRIMSON_RUBY -> Color.parseColor("#FF1744")
            ButtonColorStyle.MIDNIGHT_PURPLE -> Color.parseColor("#C084FC")
            ButtonColorStyle.GOLD_LUXURY -> Color.parseColor("#FFD700")
            ButtonColorStyle.EMERALD_MATRIX -> Color.parseColor("#00E676")
            ButtonColorStyle.WII_CRYSTAL -> Color.parseColor("#00D2FF")
            ButtonColorStyle.WII_U_DARK -> Color.parseColor("#38BDF8")
            ButtonColorStyle.SWITCH_NEON -> Color.parseColor("#FF3E3E")
            ButtonColorStyle.SWITCH_OLED -> Color.parseColor("#FFFFFF")
            ButtonColorStyle.VIRTUAL_BOY -> Color.parseColor("#FF0033")
            ButtonColorStyle.GAMECUBE_INDIGO -> Color.parseColor("#6C5CE7")
            ButtonColorStyle.GAMEBOY_DMG -> Color.parseColor("#FF4081")
            ButtonColorStyle.GBA_GLACIER -> Color.parseColor("#706FD3")
            ButtonColorStyle.FAMICOM_RETRO -> Color.parseColor("#FFD700")
            ButtonColorStyle.NINTENDO_3DS_AQUA -> Color.parseColor("#00D2D3")
            else -> Color.parseColor("#FF00E5FF")
        }

        strokePaint.color = normalStroke
        activeGlowPaint.color = glowColor
        activeStrokePaint.color = activeStroke

        val isFaceButton = component == LayoutComponent.BUTTON_A ||
            component == LayoutComponent.BUTTON_B ||
            component == LayoutComponent.BUTTON_X ||
            component == LayoutComponent.BUTTON_Y
        val isShoulder = component == LayoutComponent.BUTTON_L || component == LayoutComponent.BUTTON_R
        val isStartSelect = component == LayoutComponent.BUTTON_START || component == LayoutComponent.BUTTON_SELECT

        if (isFaceButton) {
            drawFaceButtonCap(canvas, cx, cy, w, h, component!!, style)
        } else if (isShoulder) {
            val cornerRadius = min(w, h) * 0.45f
            val shoulderPath = Path()
            if (component == LayoutComponent.BUTTON_L) {
                val radii = floatArrayOf(
                    cornerRadius, cornerRadius,
                    cornerRadius * 0.25f, cornerRadius * 0.25f,
                    cornerRadius * 0.25f, cornerRadius * 0.25f,
                    cornerRadius * 0.75f, cornerRadius * 0.75f
                )
                shoulderPath.addRoundRect(rect, radii, Path.Direction.CW)
            } else {
                val radii = floatArrayOf(
                    cornerRadius * 0.25f, cornerRadius * 0.25f,
                    cornerRadius, cornerRadius,
                    cornerRadius * 0.75f, cornerRadius * 0.75f,
                    cornerRadius * 0.25f, cornerRadius * 0.25f
                )
                shoulderPath.addRoundRect(rect, radii, Path.Direction.CW)
            }

            // Drop shadow
            canvas.drawRoundRect(RectF(rect.left + 2f, rect.top + 4f, rect.right + 2f, rect.bottom + 4f), cornerRadius * 0.5f, cornerRadius * 0.5f, shadowPaint)

            if (buttonGlow > 0f) {
                bgPaint.color = pressedBg
                activeGlowPaint.alpha = (buttonGlow * 170).toInt()
                canvas.drawPath(shoulderPath, activeGlowPaint)
                canvas.drawPath(shoulderPath, bgPaint)
                canvas.drawPath(shoulderPath, activeStrokePaint)
            } else {
                bgPaint.color = defaultBg
                canvas.drawPath(shoulderPath, bgPaint)
                canvas.drawPath(shoulderPath, strokePaint)
            }

            drawTextLabel(canvas, cx, cy, getLabel(), min(w, h) * 0.52f, w - padding * 2, style)
        } else if (isStartSelect) {
            val rx = min(w, h) * 0.44f
            // Drop shadow
            canvas.drawRoundRect(RectF(rect.left + 2f, rect.top + 3.5f, rect.right + 2f, rect.bottom + 3.5f), rx, rx, shadowPaint)

            if (buttonGlow > 0f) {
                bgPaint.color = pressedBg
                activeGlowPaint.alpha = (buttonGlow * 170).toInt()
                val glowRect = RectF(rect.left - 3f, rect.top - 3f, rect.right + 3f, rect.bottom + 3f)
                canvas.drawRoundRect(glowRect, rx + 3f, rx + 3f, activeGlowPaint)
                canvas.drawRoundRect(rect, rx, rx, bgPaint)
                canvas.drawRoundRect(rect, rx, rx, activeStrokePaint)
            } else {
                bgPaint.color = defaultBg
                canvas.drawRoundRect(rect, rx, rx, bgPaint)
                canvas.drawRoundRect(rect, rx, rx, strokePaint)
            }

            drawTextLabel(canvas, cx, cy, getLabel(), min(w, h) * 0.31f, w - padding * 4, style)
        } else {
            val rx = min(w, h) * 0.38f
            // Drop shadow
            canvas.drawRoundRect(RectF(rect.left + 2f, rect.top + 3.5f, rect.right + 2f, rect.bottom + 3.5f), rx, rx, shadowPaint)

            if (buttonGlow > 0f) {
                bgPaint.color = pressedBg
                activeGlowPaint.alpha = (buttonGlow * 170).toInt()
                val glowRect = RectF(rect.left - 3f, rect.top - 3f, rect.right + 3f, rect.bottom + 3f)
                canvas.drawRoundRect(glowRect, rx + 3f, rx + 3f, activeGlowPaint)
                canvas.drawRoundRect(rect, rx, rx, bgPaint)
                canvas.drawRoundRect(rect, rx, rx, activeStrokePaint)
            } else {
                bgPaint.color = if (isToggledOn) defaultBg else Color.parseColor("#B3181B22")
                canvas.drawRoundRect(rect, rx, rx, bgPaint)
                canvas.drawRoundRect(rect, rx, rx, strokePaint)
            }

            if (buttonGlow > 0f) {
                val activeTint = when (style) {
                    ButtonColorStyle.CLASSIC_WHITE -> Color.parseColor("#0284C7")
                    ButtonColorStyle.CRIMSON_RUBY -> Color.parseColor("#FF1744")
                    ButtonColorStyle.MIDNIGHT_PURPLE -> Color.parseColor("#C084FC")
                    ButtonColorStyle.GOLD_LUXURY -> Color.parseColor("#FFD700")
                    ButtonColorStyle.EMERALD_MATRIX -> Color.parseColor("#00E676")
                    ButtonColorStyle.CLASSIC_GREY -> Color.WHITE
                    else -> Color.parseColor("#00E5FF")
                }
                iconPaint.color = activeTint
                textPaint.color = activeTint
            } else if (!isToggledOn) {
                iconPaint.color = Color.parseColor("#808A98")
                textPaint.color = Color.parseColor("#808A98")
            } else {
                val normalTint = if (style == ButtonColorStyle.CLASSIC_WHITE) Color.parseColor("#0F172A") else Color.parseColor("#F0F4F8")
                iconPaint.color = normalTint
                textPaint.color = normalTint
            }

            val iconSize = min(w, h) * 0.48f
            when (component) {
                LayoutComponent.BUTTON_FAST_FORWARD_TOGGLE -> drawFastForwardIcon(canvas, cx, cy, iconSize)
                LayoutComponent.BUTTON_REWIND -> drawRewindIcon(canvas, cx, cy, iconSize)
                LayoutComponent.BUTTON_MICROPHONE_TOGGLE -> drawMicrophoneIcon(canvas, cx, cy, iconSize)
                LayoutComponent.BUTTON_PAUSE -> drawPauseIcon(canvas, cx, cy, iconSize)
                LayoutComponent.BUTTON_RESET -> drawResetIcon(canvas, cx, cy, iconSize)
                LayoutComponent.BUTTON_SWAP_SCREENS -> drawSwapIcon(canvas, cx, cy, iconSize)
                LayoutComponent.BUTTON_TOGGLE_SOFT_INPUT -> drawTouchIcon(canvas, cx, cy, iconSize)
                LayoutComponent.BUTTON_QUICK_SAVE -> drawQuickSaveIcon(canvas, cx, cy, iconSize)
                LayoutComponent.BUTTON_QUICK_LOAD -> drawQuickLoadIcon(canvas, cx, cy, iconSize)
                LayoutComponent.BUTTON_HINGE -> drawHingeIcon(canvas, cx, cy, iconSize)
                LayoutComponent.BUTTON_TRANSLATE -> drawTranslateIcon(canvas, cx, cy, iconSize)
                LayoutComponent.BUTTON_TOGGLE_EXTRA_BUTTONS -> drawToggleExtraIcon(canvas, cx, cy, iconSize)
                LayoutComponent.BUTTON_LOCK_ROTATION -> drawLockRotationIcon(canvas, cx, cy, iconSize)
                LayoutComponent.BUTTON_TOGGLE_ANALOG_STICK -> drawStickIcon(canvas, cx, cy, iconSize)
                else -> {
                    val label = getLabel().ifBlank { "BTN" }
                    drawTextLabel(canvas, cx, cy, label, min(w, h) * 0.35f, w - padding * 2, style)
                }
            }
        }

        canvas.restore()
    }

    private fun drawTextLabel(canvas: Canvas, cx: Float, cy: Float, text: String, baseSize: Float, maxWidth: Float, style: ButtonColorStyle) {
        textPaint.textSize = baseSize
        val measured = textPaint.measureText(text)
        if (measured > maxWidth && maxWidth > 0f) {
            textPaint.textSize = baseSize * (maxWidth / measured)
        }
        textShadowPaint.textSize = textPaint.textSize

        val textY = cy - (textPaint.descent() + textPaint.ascent()) / 2f
        canvas.drawText(text, cx, textY + 1.5f, textShadowPaint)
        if (buttonGlow > 0f) {
            textPaint.color = when (style) {
                ButtonColorStyle.CLASSIC_WHITE, ButtonColorStyle.WII_CRYSTAL -> Color.parseColor("#0284C7")
                ButtonColorStyle.CRIMSON_RUBY -> Color.parseColor("#FF1744")
                ButtonColorStyle.MIDNIGHT_PURPLE -> Color.parseColor("#C084FC")
                ButtonColorStyle.GOLD_LUXURY -> Color.parseColor("#FFD700")
                ButtonColorStyle.EMERALD_MATRIX -> Color.parseColor("#00E676")
                ButtonColorStyle.VIRTUAL_BOY -> Color.parseColor("#FF0033")
                ButtonColorStyle.FAMICOM_RETRO -> Color.parseColor("#FFD700")
                ButtonColorStyle.NINTENDO_3DS_AQUA -> Color.parseColor("#00FFFF")
                ButtonColorStyle.SWITCH_OLED -> Color.parseColor("#0F172A")
                else -> Color.WHITE
            }
        } else {
            textPaint.color = when (style) {
                ButtonColorStyle.CLASSIC_WHITE, ButtonColorStyle.WII_CRYSTAL, ButtonColorStyle.SWITCH_OLED -> Color.parseColor("#0F172A")
                ButtonColorStyle.VIRTUAL_BOY -> Color.parseColor("#FF0033")
                ButtonColorStyle.FAMICOM_RETRO -> Color.parseColor("#FFD700")
                ButtonColorStyle.NINTENDO_3DS_AQUA -> Color.parseColor("#00FFFF")
                ButtonColorStyle.GAMEBOY_DMG -> Color.parseColor("#F2C9D8")
                else -> Color.WHITE
            }
        }
        canvas.drawText(text, cx, textY, textPaint)
    }

    private fun drawFaceButtonCap(
        canvas: Canvas,
        cx: Float,
        cy: Float,
        w: Float,
        h: Float,
        faceComponent: LayoutComponent,
        style: ButtonColorStyle,
    ) {
        val faceInput = when (faceComponent) {
            LayoutComponent.BUTTON_A -> Input.A
            LayoutComponent.BUTTON_B -> Input.B
            LayoutComponent.BUTTON_X -> Input.X
            else -> Input.Y
        }
        val radius = min(w, h) * 0.44f

        canvas.drawCircle(cx + 1.5f, cy + radius * 0.14f + 2f, radius * 1.03f, shadowPaint)

        if (buttonGlow > 0f) {
            val glowCol = when (style) {
                ButtonColorStyle.CLASSIC_WHITE -> Color.parseColor("#6638BDF8")
                ButtonColorStyle.CLASSIC_GREY -> Color.parseColor("#6694A3B8")
                ButtonColorStyle.CRIMSON_RUBY -> Color.parseColor("#66FF1744")
                ButtonColorStyle.MIDNIGHT_PURPLE -> Color.parseColor("#66C084FC")
                ButtonColorStyle.GOLD_LUXURY -> Color.parseColor("#66FFD700")
                ButtonColorStyle.EMERALD_MATRIX -> Color.parseColor("#6600E676")
                ButtonColorStyle.WII_CRYSTAL -> Color.parseColor("#6600D2FF")
                ButtonColorStyle.WII_U_DARK -> Color.parseColor("#6638BDF8")
                ButtonColorStyle.SWITCH_NEON -> when (faceInput) {
                    Input.A, Input.B -> Color.parseColor("#66FF3E3E")
                    else -> Color.parseColor("#660AB9E6")
                }
                ButtonColorStyle.SWITCH_OLED -> Color.parseColor("#6694A3B8")
                ButtonColorStyle.VIRTUAL_BOY -> Color.parseColor("#80FF0033")
                ButtonColorStyle.GAMECUBE_INDIGO -> when (faceInput) {
                    Input.A -> Color.parseColor("#6600B894")
                    Input.B -> Color.parseColor("#66D63031")
                    else -> Color.parseColor("#66A4B0BE")
                }
                ButtonColorStyle.GAMEBOY_DMG -> Color.parseColor("#66C70039")
                ButtonColorStyle.GBA_GLACIER -> Color.parseColor("#66706FD3")
                ButtonColorStyle.FAMICOM_RETRO -> Color.parseColor("#66FFD700")
                ButtonColorStyle.NINTENDO_3DS_AQUA -> Color.parseColor("#6600D2D3")
                ButtonColorStyle.SNES_SUPER -> when (faceInput) {
                    Input.A -> Color.parseColor("#66FF7675")
                    Input.B -> Color.parseColor("#66FFEAA7")
                    Input.X -> Color.parseColor("#6674B9FF")
                    else -> Color.parseColor("#6655EFC4")
                }
                ButtonColorStyle.STORM_ARCADE_RETRO -> when (faceInput) {
                    Input.A -> Color.parseColor("#663B82F6")
                    Input.B -> Color.parseColor("#66FBBF24")
                    Input.X -> Color.parseColor("#66EF4444")
                    else -> Color.parseColor("#6610B981")
                }
                ButtonColorStyle.STORM_AURORA_SPECTRUM -> when (faceInput) {
                    Input.A -> Color.parseColor("#80FB7185")
                    Input.B -> Color.parseColor("#8034D399")
                    Input.X -> Color.parseColor("#8038BDF8")
                    else -> Color.parseColor("#80FCD34D")
                }
                ButtonColorStyle.STORM_CYBERPUNK_NEON -> when (faceInput) {
                    Input.A -> Color.parseColor("#80FCEE0A")
                    Input.B -> Color.parseColor("#80FF003C")
                    Input.X -> Color.parseColor("#8000F0FF")
                    else -> Color.parseColor("#80B026FF")
                }
                ButtonColorStyle.STORM_FROST_GLACIER -> when (faceInput) {
                    Input.A -> Color.parseColor("#800EA5E9")
                    Input.B -> Color.parseColor("#8014B8A6")
                    Input.X -> Color.parseColor("#8006B6D4")
                    else -> Color.parseColor("#8038BDF8")
                }
                ButtonColorStyle.STORM_SAKURA_BLOSSOM -> when (faceInput) {
                    Input.A -> Color.parseColor("#80E11D48")
                    Input.B -> Color.parseColor("#80F472B6")
                    Input.X -> Color.parseColor("#80C084FC")
                    else -> Color.parseColor("#80FB7185")
                }
                ButtonColorStyle.STORM_SOLAR_FUSION -> when (faceInput) {
                    Input.A -> Color.parseColor("#80D97706")
                    Input.B -> Color.parseColor("#80F59E0B")
                    Input.X -> Color.parseColor("#80EA580C")
                    else -> Color.parseColor("#80FB923C")
                }
                else -> Color.parseColor("#6600E5FF")
            }
            activeGlowPaint.color = glowCol
            activeGlowPaint.alpha = (buttonGlow * 200).toInt()
            canvas.drawCircle(cx, cy, radius * 1.12f, activeGlowPaint)
        }

        val (cTop, cBottom) = when (style) {
            ButtonColorStyle.CLASSIC_WHITE -> Pair(Color.parseColor("#FFFFFF"), Color.parseColor("#CBD5E1"))
            ButtonColorStyle.CLASSIC_GREY -> Pair(Color.parseColor("#64748B"), Color.parseColor("#334155"))
            ButtonColorStyle.CRIMSON_RUBY -> Pair(Color.parseColor("#DC2626"), Color.parseColor("#5B090E"))
            ButtonColorStyle.MIDNIGHT_PURPLE -> Pair(Color.parseColor("#9333EA"), Color.parseColor("#3B0764"))
            ButtonColorStyle.GOLD_LUXURY -> Pair(Color.parseColor("#D97706"), Color.parseColor("#5C2B05"))
            ButtonColorStyle.EMERALD_MATRIX -> Pair(Color.parseColor("#059669"), Color.parseColor("#022C22"))
            ButtonColorStyle.WII_CRYSTAL -> Pair(Color.parseColor("#FFFFFF"), Color.parseColor("#DDE3EA"))
            ButtonColorStyle.WII_U_DARK -> Pair(Color.parseColor("#2C3240"), Color.parseColor("#151922"))
            ButtonColorStyle.SWITCH_NEON -> when (faceInput) {
                Input.A, Input.B -> Pair(Color.parseColor("#FF3E3E"), Color.parseColor("#B91C1C"))
                else -> Pair(Color.parseColor("#0AB9E6"), Color.parseColor("#0284C7"))
            }
            ButtonColorStyle.SWITCH_OLED -> Pair(Color.parseColor("#F8FAFC"), Color.parseColor("#CBD5E1"))
            ButtonColorStyle.VIRTUAL_BOY -> Pair(Color.parseColor("#2B0008"), Color.parseColor("#0A0002"))
            ButtonColorStyle.GAMECUBE_INDIGO -> when (faceInput) {
                Input.A -> Pair(Color.parseColor("#00B894"), Color.parseColor("#006266"))
                Input.B -> Pair(Color.parseColor("#D63031"), Color.parseColor("#740E10"))
                else -> Pair(Color.parseColor("#747D8C"), Color.parseColor("#2F3542"))
            }
            ButtonColorStyle.GAMEBOY_DMG -> Pair(Color.parseColor("#801336"), Color.parseColor("#4A0E17"))
            ButtonColorStyle.GBA_GLACIER -> Pair(Color.parseColor("#575FCF"), Color.parseColor("#2C2C54"))
            ButtonColorStyle.FAMICOM_RETRO -> Pair(Color.parseColor("#8B0000"), Color.parseColor("#4A0000"))
            ButtonColorStyle.NINTENDO_3DS_AQUA -> Pair(Color.parseColor("#00838F"), Color.parseColor("#004D40"))
            ButtonColorStyle.SNES_SUPER -> when (faceInput) {
                Input.A -> Pair(Color.parseColor("#DC2626"), Color.parseColor("#7F1D1D"))
                Input.B -> Pair(Color.parseColor("#F59E0B"), Color.parseColor("#78350F"))
                Input.X -> Pair(Color.parseColor("#2563EB"), Color.parseColor("#1E3A8A"))
                else -> Pair(Color.parseColor("#059669"), Color.parseColor("#064E3B"))
            }
            ButtonColorStyle.STORM_ARCADE_RETRO -> when (faceInput) {
                Input.A -> Pair(Color.parseColor("#2563EB"), Color.parseColor("#1E3A8A"))
                Input.B -> Pair(Color.parseColor("#D97706"), Color.parseColor("#78350F"))
                Input.X -> Pair(Color.parseColor("#DC2626"), Color.parseColor("#7F1D1D"))
                else -> Pair(Color.parseColor("#059669"), Color.parseColor("#064E3B"))
            }
            ButtonColorStyle.STORM_AURORA_SPECTRUM -> when (faceInput) {
                Input.A -> Pair(Color.parseColor("#FDA4AF"), Color.parseColor("#E11D48"))
                Input.B -> Pair(Color.parseColor("#6EE7B7"), Color.parseColor("#059669"))
                Input.X -> Pair(Color.parseColor("#7DD3FC"), Color.parseColor("#0284C7"))
                else -> Pair(Color.parseColor("#FDE047"), Color.parseColor("#D97706"))
            }
            ButtonColorStyle.STORM_CYBERPUNK_NEON -> when (faceInput) {
                Input.A -> Pair(Color.parseColor("#FCEE0A"), Color.parseColor("#857E02"))
                Input.B -> Pair(Color.parseColor("#FF003C"), Color.parseColor("#8A001F"))
                Input.X -> Pair(Color.parseColor("#00F0FF"), Color.parseColor("#007D85"))
                else -> Pair(Color.parseColor("#B026FF"), Color.parseColor("#5A008A"))
            }
            ButtonColorStyle.STORM_FROST_GLACIER -> when (faceInput) {
                Input.A -> Pair(Color.parseColor("#BAE6FD"), Color.parseColor("#0284C7"))
                Input.B -> Pair(Color.parseColor("#99F6E4"), Color.parseColor("#0D9488"))
                Input.X -> Pair(Color.parseColor("#A5F3FC"), Color.parseColor("#0891B2"))
                else -> Pair(Color.parseColor("#E0F2FE"), Color.parseColor("#0369A1"))
            }
            ButtonColorStyle.STORM_SAKURA_BLOSSOM -> when (faceInput) {
                Input.A -> Pair(Color.parseColor("#FB7185"), Color.parseColor("#BE123C"))
                Input.B -> Pair(Color.parseColor("#F472B6"), Color.parseColor("#DB2777"))
                Input.X -> Pair(Color.parseColor("#E879F9"), Color.parseColor("#A21CAF"))
                else -> Pair(Color.parseColor("#FBCFE8"), Color.parseColor("#E11D48"))
            }
            ButtonColorStyle.STORM_SOLAR_FUSION -> when (faceInput) {
                Input.A -> Pair(Color.parseColor("#FDE68A"), Color.parseColor("#D97706"))
                Input.B -> Pair(Color.parseColor("#FCD34D"), Color.parseColor("#B45309"))
                Input.X -> Pair(Color.parseColor("#FCA5A5"), Color.parseColor("#DC2626"))
                else -> Pair(Color.parseColor("#FED7AA"), Color.parseColor("#EA580C"))
            }
            else -> Pair(Color.parseColor("#334155"), Color.parseColor("#0F172A"))
        }

        val capPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            this.style = Paint.Style.FILL
            shader = RadialGradient(
                cx - radius * 0.30f,
                cy - radius * 0.35f,
                radius * 1.35f,
                if (buttonGlow > 0f) cBottom else cTop,
                cBottom,
                Shader.TileMode.CLAMP,
            )
        }
        canvas.drawCircle(cx, cy, radius, capPaint)

        val bevelRect = RectF(cx - radius, cy - radius, cx + radius, cy + radius)
        val bevelLight = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            this.style = Paint.Style.STROKE
            strokeWidth = 3.5f
            color = Color.parseColor("#99FFFFFF")
        }
        val bevelDark = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            this.style = Paint.Style.STROKE
            strokeWidth = 3.5f
            color = Color.parseColor("#99000000")
        }
        canvas.drawArc(bevelRect, 135f, 180f, false, bevelLight)
        canvas.drawArc(bevelRect, -45f, 180f, false, bevelDark)

        if (buttonGlow > 0f) {
            activeStrokePaint.color = when (style) {
                ButtonColorStyle.SWITCH_NEON -> when (faceInput) {
                    Input.A, Input.B -> Color.parseColor("#FF3E3E")
                    else -> Color.parseColor("#0AB9E6")
                }
                ButtonColorStyle.GAMECUBE_INDIGO -> when (faceInput) {
                    Input.A -> Color.parseColor("#00B894")
                    Input.B -> Color.parseColor("#D63031")
                    else -> Color.parseColor("#A4B0BE")
                }
                ButtonColorStyle.SNES_SUPER -> when (faceInput) {
                    Input.A -> Color.parseColor("#FF1744")
                    Input.B -> Color.parseColor("#FBBF24")
                    Input.X -> Color.parseColor("#60A5FA")
                    else -> Color.parseColor("#34D399")
                }
                ButtonColorStyle.STORM_ARCADE_RETRO -> when (faceInput) {
                    Input.A -> Color.parseColor("#3B82F6")
                    Input.B -> Color.parseColor("#FBBF24")
                    Input.X -> Color.parseColor("#EF4444")
                    else -> Color.parseColor("#10B981")
                }
                ButtonColorStyle.STORM_AURORA_SPECTRUM, ButtonColorStyle.STORM_SAKURA_BLOSSOM -> Color.parseColor("#FB7185")
                ButtonColorStyle.STORM_CYBERPUNK_NEON -> Color.parseColor("#FCEE0A")
                ButtonColorStyle.STORM_FROST_GLACIER -> Color.parseColor("#38BDF8")
                ButtonColorStyle.STORM_SOLAR_FUSION -> Color.parseColor("#F59E0B")
                else -> activeStrokePaint.color
            }
            canvas.drawCircle(cx, cy, radius, activeStrokePaint)
        }

        val label = getLabel()
        textPaint.textSize = radius * 0.95f
        textShadowPaint.textSize = textPaint.textSize
        val textY = cy - (textPaint.descent() + textPaint.ascent()) / 2f
        canvas.drawText(label, cx, textY + 2f, textShadowPaint)
        textPaint.color = when (style) {
            ButtonColorStyle.CLASSIC_WHITE, ButtonColorStyle.WII_CRYSTAL -> if (buttonGlow > 0f) Color.parseColor("#0284C7") else Color.parseColor("#0F172A")
            ButtonColorStyle.SWITCH_OLED -> Color.parseColor("#0F172A")
            ButtonColorStyle.VIRTUAL_BOY -> Color.parseColor("#FF0033")
            ButtonColorStyle.FAMICOM_RETRO -> Color.parseColor("#FFD700")
            ButtonColorStyle.NINTENDO_3DS_AQUA -> Color.parseColor("#00FFFF")
            ButtonColorStyle.GAMEBOY_DMG -> if (buttonGlow > 0f) Color.WHITE else Color.parseColor("#F2C9D8")
            ButtonColorStyle.SNES_SUPER, ButtonColorStyle.STORM_ARCADE_RETRO -> if (faceInput == Input.B) Color.parseColor("#0F172A") else Color.WHITE
            ButtonColorStyle.STORM_CYBERPUNK_NEON -> if (faceInput == Input.A) Color.parseColor("#0F172A") else Color.WHITE
            ButtonColorStyle.STORM_AURORA_SPECTRUM, ButtonColorStyle.STORM_FROST_GLACIER,
            ButtonColorStyle.STORM_SAKURA_BLOSSOM, ButtonColorStyle.STORM_SOLAR_FUSION -> Color.parseColor("#0F172A")
            else -> Color.WHITE
        }
        canvas.drawText(label, cx, textY, textPaint)
    }

    private fun drawFastForwardIcon(canvas: Canvas, cx: Float, cy: Float, size: Float) {
        val half = size / 2f
        val path = Path().apply {
            moveTo(cx - half * 0.85f, cy - half * 0.70f)
            lineTo(cx - half * 0.05f, cy)
            lineTo(cx - half * 0.85f, cy + half * 0.70f)
            close()
            moveTo(cx - half * 0.05f, cy - half * 0.70f)
            lineTo(cx + half * 0.75f, cy)
            lineTo(cx - half * 0.05f, cy + half * 0.70f)
            close()
        }
        canvas.drawPath(path, iconShadowPaint)
        canvas.drawPath(path, iconPaint)
    }

    private fun drawRewindIcon(canvas: Canvas, cx: Float, cy: Float, size: Float) {
        val half = size / 2f
        val path = Path().apply {
            moveTo(cx + half * 0.85f, cy - half * 0.70f)
            lineTo(cx + half * 0.05f, cy)
            lineTo(cx + half * 0.85f, cy + half * 0.70f)
            close()
            moveTo(cx + half * 0.05f, cy - half * 0.70f)
            lineTo(cx - half * 0.75f, cy)
            lineTo(cx + half * 0.05f, cy + half * 0.70f)
            close()
        }
        canvas.drawPath(path, iconShadowPaint)
        canvas.drawPath(path, iconPaint)
    }

    private fun drawMicrophoneIcon(canvas: Canvas, cx: Float, cy: Float, size: Float) {
        val r = size * 0.22f
        val bodyH = size * 0.48f

        val capsuleRect = RectF(cx - r, cy - bodyH * 0.65f, cx + r, cy + bodyH * 0.15f)
        canvas.drawRoundRect(capsuleRect, r, r, iconPaint)

        val cradlePaint = Paint(iconPaint).apply {
            style = Paint.Style.STROKE
            strokeWidth = 3f
        }
        val cradleRect = RectF(cx - r * 1.55f, cy - bodyH * 0.35f, cx + r * 1.55f, cy + bodyH * 0.35f)
        canvas.drawArc(cradleRect, 0f, 180f, false, cradlePaint)

        canvas.drawLine(cx, cy + bodyH * 0.35f, cx, cy + bodyH * 0.65f, cradlePaint)
        canvas.drawLine(cx - r * 1.2f, cy + bodyH * 0.65f, cx + r * 1.2f, cy + bodyH * 0.65f, cradlePaint)

        if (!isToggledOn) {
            val slashPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
                style = Paint.Style.STROKE
                strokeWidth = 3.5f
                color = Color.parseColor("#FF5252")
            }
            canvas.drawLine(cx - size * 0.35f, cy + size * 0.35f, cx + size * 0.35f, cy - size * 0.35f, slashPaint)
        }
    }

    private fun drawPauseIcon(canvas: Canvas, cx: Float, cy: Float, size: Float) {
        val barW = size * 0.22f
        val barH = size * 0.70f
        val gap = size * 0.18f

        val leftRect = RectF(cx - gap / 2f - barW, cy - barH / 2f, cx - gap / 2f, cy + barH / 2f)
        val rightRect = RectF(cx + gap / 2f, cy - barH / 2f, cx + gap / 2f + barW, cy + barH / 2f)

        canvas.drawRoundRect(leftRect, 3.5f, 3.5f, iconPaint)
        canvas.drawRoundRect(rightRect, 3.5f, 3.5f, iconPaint)
    }

    private fun drawResetIcon(canvas: Canvas, cx: Float, cy: Float, size: Float) {
        val r = size * 0.36f
        val arcPaint = Paint(iconPaint).apply {
            style = Paint.Style.STROKE
            strokeWidth = 3.5f
        }
        val arcRect = RectF(cx - r, cy - r, cx + r, cy + r)
        canvas.drawArc(arcRect, 45f, 275f, false, arcPaint)

        // Bold Arrowhead at end of arc (around top right)
        val arrowPath = Path().apply {
            moveTo(cx + r * 0.6f, cy - r * 1.1f)
            lineTo(cx + r * 1.05f, cy - r * 0.6f)
            lineTo(cx + r * 0.45f, cy - r * 0.45f)
            close()
        }
        canvas.drawPath(arrowPath, iconPaint)
    }

    private fun drawSwapIcon(canvas: Canvas, cx: Float, cy: Float, size: Float) {
        val h = size * 0.65f
        val off = size * 0.22f

        val arrowPaint = Paint(iconPaint).apply {
            style = Paint.Style.STROKE
            strokeWidth = 3f
        }
        // Left arrow points UP
        canvas.drawLine(cx - off, cy + h / 2f, cx - off, cy - h / 2f, arrowPaint)
        canvas.drawLine(cx - off, cy - h / 2f, cx - off - size * 0.15f, cy - h / 2f + size * 0.15f, arrowPaint)
        canvas.drawLine(cx - off, cy - h / 2f, cx - off + size * 0.15f, cy - h / 2f + size * 0.15f, arrowPaint)

        // Right arrow points DOWN
        canvas.drawLine(cx + off, cy - h / 2f, cx + off, cy + h / 2f, arrowPaint)
        canvas.drawLine(cx + off, cy + h / 2f, cx + off - size * 0.15f, cy + h / 2f - size * 0.15f, arrowPaint)
        canvas.drawLine(cx + off, cy + h / 2f, cx + off + size * 0.15f, cy + h / 2f - size * 0.15f, arrowPaint)
    }

    private fun drawQuickSaveIcon(canvas: Canvas, cx: Float, cy: Float, size: Float) {
        val w = size * 0.65f
        val h = size * 0.65f
        val diskRect = RectF(cx - w / 2f, cy - h / 2f, cx + w / 2f, cy + h / 2f)

        val stroke = Paint(iconPaint).apply {
            style = Paint.Style.STROKE
            strokeWidth = 2.8f
        }
        canvas.drawRoundRect(diskRect, 4f, 4f, stroke)

        // Arrow pointing UP inside disk
        val arrowPaint = Paint(iconPaint).apply {
            style = Paint.Style.STROKE
            strokeWidth = 3f
        }
        canvas.drawLine(cx, cy + h * 0.25f, cx, cy - h * 0.22f, arrowPaint)
        canvas.drawLine(cx, cy - h * 0.22f, cx - w * 0.22f, cy - h * 0.02f, arrowPaint)
        canvas.drawLine(cx, cy - h * 0.22f, cx + w * 0.22f, cy - h * 0.02f, arrowPaint)
    }

    private fun drawQuickLoadIcon(canvas: Canvas, cx: Float, cy: Float, size: Float) {
        val w = size * 0.65f
        val h = size * 0.65f
        val diskRect = RectF(cx - w / 2f, cy - h / 2f, cx + w / 2f, cy + h / 2f)

        val stroke = Paint(iconPaint).apply {
            style = Paint.Style.STROKE
            strokeWidth = 2.8f
        }
        canvas.drawRoundRect(diskRect, 4f, 4f, stroke)

        // Arrow pointing DOWN inside disk
        val arrowPaint = Paint(iconPaint).apply {
            style = Paint.Style.STROKE
            strokeWidth = 3f
        }
        canvas.drawLine(cx, cy - h * 0.25f, cx, cy + h * 0.22f, arrowPaint)
        canvas.drawLine(cx, cy + h * 0.22f, cx - w * 0.22f, cy + h * 0.02f, arrowPaint)
        canvas.drawLine(cx, cy + h * 0.22f, cx + w * 0.22f, cy + h * 0.02f, arrowPaint)
    }

    private fun drawHingeIcon(canvas: Canvas, cx: Float, cy: Float, size: Float) {
        val w = size * 0.75f
        val h = size * 0.32f
        val gap = size * 0.12f

        val topRect = RectF(cx - w / 2f, cy - h - gap / 2f, cx + w / 2f, cy - gap / 2f)
        val bottomRect = RectF(cx - w / 2f, cy + gap / 2f, cx + w / 2f, cy + h + gap / 2f)

        val stroke = Paint(iconPaint).apply {
            style = Paint.Style.STROKE
            strokeWidth = 2.8f
        }
        canvas.drawRoundRect(topRect, 4f, 4f, stroke)
        canvas.drawRoundRect(bottomRect, 4f, 4f, stroke)

        // Hinge center bar
        canvas.drawLine(cx - w * 0.35f, cy, cx + w * 0.35f, cy, stroke)
    }

    private fun drawTouchIcon(canvas: Canvas, cx: Float, cy: Float, size: Float) {
        val r = size * 0.18f
        canvas.drawCircle(cx, cy, r, iconPaint)

        val ringPaint = Paint(iconPaint).apply {
            style = Paint.Style.STROKE
            strokeWidth = 2.8f
        }
        canvas.drawCircle(cx, cy, size * 0.40f, ringPaint)

        if (!isToggledOn) {
            val slashPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
                style = Paint.Style.STROKE
                strokeWidth = 3.5f
                color = Color.parseColor("#FF5252")
            }
            canvas.drawLine(cx - size * 0.35f, cy + size * 0.35f, cx + size * 0.35f, cy - size * 0.35f, slashPaint)
        }
    }

    private fun drawTranslateIcon(canvas: Canvas, cx: Float, cy: Float, size: Float) {
        val trPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            color = iconPaint.color
            textAlign = Paint.Align.CENTER
            typeface = Typeface.create("sans-serif-medium", Typeface.BOLD)
            textSize = size * 0.48f
        }
        val y = cy - (trPaint.descent() + trPaint.ascent()) / 2f
        canvas.drawText("TR", cx, y, trPaint)
    }

    private fun drawToggleExtraIcon(canvas: Canvas, cx: Float, cy: Float, size: Float) {
        val dotRadius = size * 0.09f
        val gap = size * 0.28f

        // Draw 2x2 or 3 horizontal dots representing extra buttons toggle
        val paint = Paint(iconPaint).apply {
            style = Paint.Style.FILL
        }
        canvas.drawCircle(cx - gap, cy, dotRadius, paint)
        canvas.drawCircle(cx, cy, dotRadius, paint)
        canvas.drawCircle(cx + gap, cy, dotRadius, paint)

        val framePaint = Paint(iconPaint).apply {
            style = Paint.Style.STROKE
            strokeWidth = 2.4f
        }
        val rect = RectF(cx - gap * 1.5f, cy - gap * 0.65f, cx + gap * 1.5f, cy + gap * 0.65f)
        canvas.drawRoundRect(rect, 4f, 4f, framePaint)
    }

    private fun drawLockRotationIcon(canvas: Canvas, cx: Float, cy: Float, size: Float) {
        val w = size * 0.55f
        val h = size * 0.45f
        val bodyRect = RectF(cx - w / 2f, cy - h / 2f + size * 0.1f, cx + w / 2f, cy + h / 2f + size * 0.1f)

        val bodyPaint = Paint(iconPaint).apply {
            style = Paint.Style.STROKE
            strokeWidth = 2.8f
        }
        canvas.drawRoundRect(bodyRect, 3f, 3f, bodyPaint)

        // Shackle of padlock
        val shackleRadius = w * 0.28f
        val shackleRect = RectF(cx - shackleRadius, cy - h / 2f - size * 0.18f, cx + shackleRadius, cy - h / 2f + shackleRadius * 0.8f)
        val shacklePaint = Paint(iconPaint).apply {
            style = Paint.Style.STROKE
            strokeWidth = 2.8f
        }
        canvas.drawArc(shackleRect, 180f, 180f, false, shacklePaint)

        // Keyhole dot
        val dotPaint = Paint(iconPaint).apply {
            style = Paint.Style.FILL
        }
        canvas.drawCircle(cx, cy + size * 0.1f, size * 0.05f, dotPaint)
    }

    private fun drawStickIcon(canvas: Canvas, cx: Float, cy: Float, size: Float) {
        val r = size * 0.44f
        val ringPaint = Paint(iconPaint).apply {
            style = Paint.Style.STROKE
            strokeWidth = 2.4f
        }
        val capPaint = Paint(iconPaint).apply {
            style = Paint.Style.FILL
        }
        val capStroke = Paint(iconPaint).apply {
            style = Paint.Style.STROKE
            strokeWidth = 2.0f
        }

        canvas.drawCircle(cx, cy, r, ringPaint)
        canvas.drawCircle(cx, cy, r * 0.52f, capPaint)
        canvas.drawCircle(cx, cy, r * 0.52f, capStroke)
        canvas.drawCircle(cx, cy, r * 0.22f, ringPaint)
    }
}

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
            else -> Color.parseColor("#E6232730")
        }
        val pressedBg = when (style) {
            ButtonColorStyle.CLASSIC_WHITE -> Color.parseColor("#E6E2E8F0")
            ButtonColorStyle.CLASSIC_GREY -> Color.parseColor("#E6374151")
            ButtonColorStyle.CRIMSON_RUBY -> Color.parseColor("#E65C060D")
            ButtonColorStyle.MIDNIGHT_PURPLE -> Color.parseColor("#E62D0B4E")
            ButtonColorStyle.GOLD_LUXURY -> Color.parseColor("#E678350F")
            ButtonColorStyle.EMERALD_MATRIX -> Color.parseColor("#E6064E3B")
            else -> Color.parseColor("#E61A3A4D")
        }
        val normalStroke = when (style) {
            ButtonColorStyle.CLASSIC_WHITE -> Color.parseColor("#80CBD5E1")
            ButtonColorStyle.CLASSIC_GREY -> Color.parseColor("#80D1D5DB")
            ButtonColorStyle.CRIMSON_RUBY -> Color.parseColor("#80E50914")
            ButtonColorStyle.MIDNIGHT_PURPLE -> Color.parseColor("#80C084FC")
            ButtonColorStyle.GOLD_LUXURY -> Color.parseColor("#80F59E0B")
            ButtonColorStyle.EMERALD_MATRIX -> Color.parseColor("#8010B981")
            else -> Color.parseColor("#66FFFFFF")
        }
        val glowColor = when (style) {
            ButtonColorStyle.CLASSIC_WHITE -> Color.parseColor("#6638BDF8")
            ButtonColorStyle.CLASSIC_GREY -> Color.parseColor("#6694A3B8")
            ButtonColorStyle.CRIMSON_RUBY -> Color.parseColor("#66FF1744")
            ButtonColorStyle.MIDNIGHT_PURPLE -> Color.parseColor("#66C084FC")
            ButtonColorStyle.GOLD_LUXURY -> Color.parseColor("#66FFD700")
            ButtonColorStyle.EMERALD_MATRIX -> Color.parseColor("#6600E676")
            else -> Color.parseColor("#6600E5FF")
        }
        val activeStroke = when (style) {
            ButtonColorStyle.CLASSIC_WHITE -> Color.parseColor("#0284C7")
            ButtonColorStyle.CLASSIC_GREY -> Color.parseColor("#CBD5E1")
            ButtonColorStyle.CRIMSON_RUBY -> Color.parseColor("#FF1744")
            ButtonColorStyle.MIDNIGHT_PURPLE -> Color.parseColor("#C084FC")
            ButtonColorStyle.GOLD_LUXURY -> Color.parseColor("#FFD700")
            ButtonColorStyle.EMERALD_MATRIX -> Color.parseColor("#00E676")
            else -> Color.parseColor("#FF00E5FF")
        }

        strokePaint.color = normalStroke
        activeGlowPaint.color = glowColor
        activeStrokePaint.color = activeStroke

        val isShoulder = component == LayoutComponent.BUTTON_L || component == LayoutComponent.BUTTON_R
        val isStartSelect = component == LayoutComponent.BUTTON_START || component == LayoutComponent.BUTTON_SELECT

        if (isShoulder) {
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
                ButtonColorStyle.CLASSIC_WHITE -> Color.parseColor("#0284C7")
                ButtonColorStyle.CRIMSON_RUBY -> Color.parseColor("#FF1744")
                ButtonColorStyle.MIDNIGHT_PURPLE -> Color.parseColor("#C084FC")
                ButtonColorStyle.GOLD_LUXURY -> Color.parseColor("#FFD700")
                ButtonColorStyle.EMERALD_MATRIX -> Color.parseColor("#00E676")
                ButtonColorStyle.CLASSIC_GREY -> Color.WHITE
                else -> Color.parseColor("#00E5FF")
            }
        } else {
            textPaint.color = if (style == ButtonColorStyle.CLASSIC_WHITE) Color.parseColor("#0F172A") else Color.WHITE
        }
        canvas.drawText(text, cx, textY, textPaint)
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
}

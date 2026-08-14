package me.magnum.melonds.ui.common.views

import android.animation.ValueAnimator
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.graphics.Typeface
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

    private val bgPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.FILL
        color = Color.parseColor("#441A1C23")
    }

    private val strokePaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = 4f
        color = Color.parseColor("#B3FFFFFF")
    }

    private val activeGlowPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.FILL
        color = Color.parseColor("#9900E5FF")
    }

    private val activeStrokePaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = 6f
        color = Color.parseColor("#FF00E5FF")
    }

    private val textPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.WHITE
        textAlign = Paint.Align.CENTER
        typeface = Typeface.create(Typeface.DEFAULT, Typeface.BOLD)
    }

    private var buttonScale = 1.0f
    private var buttonGlow = 0.0f
    private var animator: ValueAnimator? = null

    override fun updatePressedInputs(pressedInputs: Set<Input>) {
        val isPressed = pressedInputs.isNotEmpty()
        val targetScale = if (isPressed) 0.90f else 1.0f
        val targetGlow = if (isPressed) 1.0f else 0.0f

        if (buttonScale != targetScale) {
            animator?.cancel()
            val startScale = buttonScale
            val startGlow = buttonGlow

            animator = ValueAnimator.ofFloat(0f, 1f).apply {
                duration = 100L
                addUpdateListener { anim ->
                    val fraction = anim.animatedFraction
                    buttonScale = startScale + (targetScale - startScale) * fraction
                    buttonGlow = startGlow + (targetGlow - startGlow) * fraction
                    invalidate()
                }
            }
            animator?.start()
        }
    }

    private fun getLabel(): String {
        return when (component) {
            LayoutComponent.BUTTON_L -> "L"
            LayoutComponent.BUTTON_R -> "R"
            LayoutComponent.BUTTON_START -> "START"
            LayoutComponent.BUTTON_SELECT -> "SELECT"
            LayoutComponent.BUTTON_PAUSE -> "PAUSE"
            LayoutComponent.BUTTON_FAST_FORWARD_TOGGLE -> "FF"
            LayoutComponent.BUTTON_MICROPHONE_TOGGLE -> "MIC"
            LayoutComponent.BUTTON_HINGE -> "LID"
            LayoutComponent.BUTTON_RESET -> "RESET"
            LayoutComponent.BUTTON_SWAP_SCREENS -> "SWAP"
            LayoutComponent.BUTTON_QUICK_SAVE -> "SAVE"
            LayoutComponent.BUTTON_QUICK_LOAD -> "LOAD"
            LayoutComponent.BUTTON_REWIND -> "REW"
            LayoutComponent.BUTTON_TOGGLE_SOFT_INPUT -> "TOUCH"
            else -> "BTN"
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

        val padding = 6f
        val rect = RectF(padding, padding, w - padding, h - padding)
        val rx = min(w, h) / 3f

        // Draw background pill/rounded rect
        canvas.drawRoundRect(rect, rx, rx, bgPaint)

        if (buttonGlow > 0f) {
            activeGlowPaint.alpha = (buttonGlow * 150).toInt()
            val glowRect = RectF(rect.left - 4f, rect.top - 4f, rect.right + 4f, rect.bottom + 4f)
            canvas.drawRoundRect(glowRect, rx + 4f, rx + 4f, activeGlowPaint)
            canvas.drawRoundRect(rect, rx, rx, activeStrokePaint)
        } else {
            canvas.drawRoundRect(rect, rx, rx, strokePaint)
        }

        // Draw text label
        textPaint.textSize = min(w, h) * 0.42f
        val textY = cy - (textPaint.descent() + textPaint.ascent()) / 2f
        canvas.drawText(getLabel(), cx, textY, textPaint)

        canvas.restore()
    }
}

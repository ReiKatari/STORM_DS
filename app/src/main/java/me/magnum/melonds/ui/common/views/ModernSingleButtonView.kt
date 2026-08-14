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

    private val bgPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.FILL
        color = Color.parseColor("#E6232730")
    }

    private val strokePaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = 3.5f
        color = Color.parseColor("#66FFFFFF")
    }

    private val activeGlowPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.FILL
        color = Color.parseColor("#6600E5FF")
    }

    private val activeStrokePaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = 5f
        color = Color.parseColor("#FF00E5FF")
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
    private var animator: ValueAnimator? = null

    override fun updatePressedInputs(pressedInputs: Set<Input>) {
        val isPressed = pressedInputs.isNotEmpty()
        val targetScale = if (isPressed) 0.88f else 1.0f
        val targetGlow = if (isPressed) 1.0f else 0.0f

        if (buttonScale != targetScale) {
            animator?.cancel()
            val startScale = buttonScale
            val startGlow = buttonGlow

            animator = ValueAnimator.ofFloat(0f, 1f).apply {
                duration = 90L
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

        val padding = 5f
        val rect = RectF(padding, padding, w - padding, h - padding)

        val isShoulder = component == LayoutComponent.BUTTON_L || component == LayoutComponent.BUTTON_R
        val isStartSelect = component == LayoutComponent.BUTTON_START || component == LayoutComponent.BUTTON_SELECT

        if (isShoulder) {
            // Authentic curved DS shoulder trigger
            val cornerRadius = min(w, h) * 0.45f
            val shoulderPath = Path()
            if (component == LayoutComponent.BUTTON_L) {
                // Curved on left, flat on right
                val radii = floatArrayOf(
                    cornerRadius, cornerRadius, // Top-left
                    cornerRadius * 0.3f, cornerRadius * 0.3f, // Top-right
                    cornerRadius * 0.3f, cornerRadius * 0.3f, // Bottom-right
                    cornerRadius * 0.7f, cornerRadius * 0.7f  // Bottom-left
                )
                shoulderPath.addRoundRect(rect, radii, Path.Direction.CW)
            } else {
                // Curved on right, flat on left
                val radii = floatArrayOf(
                    cornerRadius * 0.3f, cornerRadius * 0.3f, // Top-left
                    cornerRadius, cornerRadius, // Top-right
                    cornerRadius * 0.7f, cornerRadius * 0.7f, // Bottom-right
                    cornerRadius * 0.3f, cornerRadius * 0.3f  // Bottom-left
                )
                shoulderPath.addRoundRect(rect, radii, Path.Direction.CW)
            }

            if (buttonGlow > 0f) {
                bgPaint.color = Color.parseColor("#E61A3A4D")
                activeGlowPaint.alpha = (buttonGlow * 170).toInt()
                canvas.drawPath(shoulderPath, activeGlowPaint)
                canvas.drawPath(shoulderPath, bgPaint)
                canvas.drawPath(shoulderPath, activeStrokePaint)
            } else {
                bgPaint.color = Color.parseColor("#E6232730")
                canvas.drawPath(shoulderPath, bgPaint)
                canvas.drawPath(shoulderPath, strokePaint)
            }

            // Shoulder Label
            textPaint.textSize = min(w, h) * 0.48f
            textShadowPaint.textSize = min(w, h) * 0.48f
        } else if (isStartSelect) {
            // Authentic angled/capsule Nintendo DS Start / Select pill button
            val rx = min(w, h) * 0.42f
            if (buttonGlow > 0f) {
                bgPaint.color = Color.parseColor("#E61A3A4D")
                activeGlowPaint.alpha = (buttonGlow * 170).toInt()
                val glowRect = RectF(rect.left - 3f, rect.top - 3f, rect.right + 3f, rect.bottom + 3f)
                canvas.drawRoundRect(glowRect, rx + 3f, rx + 3f, activeGlowPaint)
                canvas.drawRoundRect(rect, rx, rx, bgPaint)
                canvas.drawRoundRect(rect, rx, rx, activeStrokePaint)
            } else {
                bgPaint.color = Color.parseColor("#E6252932")
                canvas.drawRoundRect(rect, rx, rx, bgPaint)
                canvas.drawRoundRect(rect, rx, rx, strokePaint)
            }

            textPaint.textSize = min(w, h) * 0.38f
            textShadowPaint.textSize = min(w, h) * 0.38f
        } else {
            // Compact circular/pill utility buttons (FF, MIC, REW, LID, etc.)
            val rx = min(w, h) * 0.35f
            if (buttonGlow > 0f) {
                bgPaint.color = Color.parseColor("#E61A3A4D")
                activeGlowPaint.alpha = (buttonGlow * 170).toInt()
                val glowRect = RectF(rect.left - 3f, rect.top - 3f, rect.right + 3f, rect.bottom + 3f)
                canvas.drawRoundRect(glowRect, rx + 3f, rx + 3f, activeGlowPaint)
                canvas.drawRoundRect(rect, rx, rx, bgPaint)
                canvas.drawRoundRect(rect, rx, rx, activeStrokePaint)
            } else {
                bgPaint.color = Color.parseColor("#E6232730")
                canvas.drawRoundRect(rect, rx, rx, bgPaint)
                canvas.drawRoundRect(rect, rx, rx, strokePaint)
            }

            textPaint.textSize = min(w, h) * 0.36f
            textShadowPaint.textSize = min(w, h) * 0.36f
        }

        // Draw centered text with subtle drop shadow
        val label = getLabel()
        val textY = cy - (textPaint.descent() + textPaint.ascent()) / 2f
        canvas.drawText(label, cx, textY + 1.5f, textShadowPaint)

        if (buttonGlow > 0f) {
            textPaint.color = Color.parseColor("#00E5FF")
        } else {
            textPaint.color = Color.WHITE
        }
        canvas.drawText(label, cx, textY, textPaint)

        canvas.restore()
    }
}

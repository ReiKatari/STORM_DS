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
            LayoutComponent.BUTTON_QUICK_SAVE -> "SAVE"
            LayoutComponent.BUTTON_QUICK_LOAD -> "LOAD"
            LayoutComponent.BUTTON_RESET -> "RESET"
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

        val isShoulder = component == LayoutComponent.BUTTON_L || component == LayoutComponent.BUTTON_R
        val isStartSelect = component == LayoutComponent.BUTTON_START || component == LayoutComponent.BUTTON_SELECT

        if (isShoulder) {
            // Authentic curved DS shoulder trigger
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

            drawTextLabel(canvas, cx, cy, getLabel(), min(w, h) * 0.52f, w - padding * 2)
        } else if (isStartSelect) {
            // Authentic oblong pill for Start & Select (never clipped)
            val rx = min(w, h) * 0.44f
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

            drawTextLabel(canvas, cx, cy, getLabel(), min(w, h) * 0.42f, w - padding * 3)
        } else {
            // Sleek circular / rounded utility buttons with vector icons
            val rx = min(w, h) * 0.38f
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

            if (buttonGlow > 0f) {
                iconPaint.color = Color.parseColor("#00E5FF")
                textPaint.color = Color.parseColor("#00E5FF")
            } else {
                iconPaint.color = Color.parseColor("#F0F4F8")
                textPaint.color = Color.WHITE
            }

            val iconSize = min(w, h) * 0.45f
            when (component) {
                LayoutComponent.BUTTON_FAST_FORWARD_TOGGLE -> drawFastForwardIcon(canvas, cx, cy, iconSize)
                LayoutComponent.BUTTON_REWIND -> drawRewindIcon(canvas, cx, cy, iconSize)
                LayoutComponent.BUTTON_MICROPHONE_TOGGLE -> drawMicrophoneIcon(canvas, cx, cy, iconSize)
                LayoutComponent.BUTTON_PAUSE -> drawPauseIcon(canvas, cx, cy, iconSize)
                LayoutComponent.BUTTON_HINGE -> drawHingeIcon(canvas, cx, cy, iconSize)
                LayoutComponent.BUTTON_SWAP_SCREENS -> drawSwapIcon(canvas, cx, cy, iconSize)
                LayoutComponent.BUTTON_TOGGLE_SOFT_INPUT -> drawTouchIcon(canvas, cx, cy, iconSize)
                else -> {
                    val label = getLabel().ifBlank { "BTN" }
                    drawTextLabel(canvas, cx, cy, label, min(w, h) * 0.38f, w - padding * 2)
                }
            }
        }

        canvas.restore()
    }

    private fun drawTextLabel(canvas: Canvas, cx: Float, cy: Float, text: String, baseSize: Float, maxWidth: Float) {
        textPaint.textSize = baseSize
        var measured = textPaint.measureText(text)
        if (measured > maxWidth && maxWidth > 0f) {
            textPaint.textSize = baseSize * (maxWidth / measured)
        }
        textShadowPaint.textSize = textPaint.textSize

        val textY = cy - (textPaint.descent() + textPaint.ascent()) / 2f
        canvas.drawText(text, cx, textY + 1.5f, textShadowPaint)
        if (buttonGlow > 0f) {
            textPaint.color = Color.parseColor("#00E5FF")
        } else {
            textPaint.color = Color.WHITE
        }
        canvas.drawText(text, cx, textY, textPaint)
    }

    private fun drawFastForwardIcon(canvas: Canvas, cx: Float, cy: Float, size: Float) {
        val half = size / 2f
        val path = Path().apply {
            // First triangle
            moveTo(cx - half * 0.8f, cy - half * 0.8f)
            lineTo(cx, cy)
            lineTo(cx - half * 0.8f, cy + half * 0.8f)
            close()
            // Second triangle
            moveTo(cx, cy - half * 0.8f)
            lineTo(cx + half * 0.8f, cy)
            lineTo(cx, cy + half * 0.8f)
            close()
        }
        canvas.drawPath(path, iconShadowPaint)
        canvas.drawPath(path, iconPaint)
    }

    private fun drawRewindIcon(canvas: Canvas, cx: Float, cy: Float, size: Float) {
        val half = size / 2f
        val path = Path().apply {
            // First triangle
            moveTo(cx, cy - half * 0.8f)
            lineTo(cx - half * 0.8f, cy)
            lineTo(cx, cy + half * 0.8f)
            close()
            // Second triangle
            moveTo(cx + half * 0.8f, cy - half * 0.8f)
            lineTo(cx, cy)
            lineTo(cx + half * 0.8f, cy + half * 0.8f)
            close()
        }
        canvas.drawPath(path, iconShadowPaint)
        canvas.drawPath(path, iconPaint)
    }

    private fun drawMicrophoneIcon(canvas: Canvas, cx: Float, cy: Float, size: Float) {
        val r = size * 0.22f
        val bodyH = size * 0.48f

        // Microphone capsule body
        val capsuleRect = RectF(cx - r, cy - bodyH * 0.65f, cx + r, cy + bodyH * 0.15f)
        canvas.drawRoundRect(capsuleRect, r, r, iconPaint)

        // Cradle arc
        val cradlePaint = Paint(iconPaint).apply {
            style = Paint.Style.STROKE
            strokeWidth = 3f
        }
        val cradleRect = RectF(cx - r * 1.55f, cy - bodyH * 0.35f, cx + r * 1.55f, cy + bodyH * 0.35f)
        canvas.drawArc(cradleRect, 0f, 180f, false, cradlePaint)

        // Stand stem
        canvas.drawLine(cx, cy + bodyH * 0.35f, cx, cy + bodyH * 0.65f, cradlePaint)
        // Stand base
        canvas.drawLine(cx - r * 1.2f, cy + bodyH * 0.65f, cx + r * 1.2f, cy + bodyH * 0.65f, cradlePaint)
    }

    private fun drawPauseIcon(canvas: Canvas, cx: Float, cy: Float, size: Float) {
        val barW = size * 0.22f
        val barH = size * 0.7f
        val gap = size * 0.16f

        val leftRect = RectF(cx - gap / 2f - barW, cy - barH / 2f, cx - gap / 2f, cy + barH / 2f)
        val rightRect = RectF(cx + gap / 2f, cy - barH / 2f, cx + gap / 2f + barW, cy + barH / 2f)

        canvas.drawRoundRect(leftRect, 3f, 3f, iconPaint)
        canvas.drawRoundRect(rightRect, 3f, 3f, iconPaint)
    }

    private fun drawHingeIcon(canvas: Canvas, cx: Float, cy: Float, size: Float) {
        // Clamshell DS fold icon
        val w = size * 0.75f
        val h = size * 0.35f
        val gap = size * 0.12f

        val topRect = RectF(cx - w / 2f, cy - h - gap / 2f, cx + w / 2f, cy - gap / 2f)
        val bottomRect = RectF(cx - w / 2f, cy + gap / 2f, cx + w / 2f, cy + h + gap / 2f)

        val stroke = Paint(iconPaint).apply {
            style = Paint.Style.STROKE
            strokeWidth = 3f
        }
        canvas.drawRoundRect(topRect, 4f, 4f, stroke)
        canvas.drawRoundRect(bottomRect, 4f, 4f, stroke)
    }

    private fun drawSwapIcon(canvas: Canvas, cx: Float, cy: Float, size: Float) {
        // Dual screen vertical swap arrows
        val h = size * 0.7f
        val off = size * 0.22f

        val arrowPaint = Paint(iconPaint).apply {
            style = Paint.Style.STROKE
            strokeWidth = 3.5f
        }
        // Up arrow on left
        canvas.drawLine(cx - off, cy + h / 2f, cx - off, cy - h / 2f, arrowPaint)
        canvas.drawLine(cx - off, cy - h / 2f, cx - off - size * 0.15f, cy - h / 2f + size * 0.15f, arrowPaint)
        canvas.drawLine(cx - off, cy - h / 2f, cx - off + size * 0.15f, cy - h / 2f + size * 0.15f, arrowPaint)

        // Down arrow on right
        canvas.drawLine(cx + off, cy - h / 2f, cx + off, cy + h / 2f, arrowPaint)
        canvas.drawLine(cx + off, cy + h / 2f, cx + off - size * 0.15f, cy + h / 2f - size * 0.15f, arrowPaint)
        canvas.drawLine(cx + off, cy + h / 2f, cx + off + size * 0.15f, cy + h / 2f - size * 0.15f, arrowPaint)
    }

    private fun drawTouchIcon(canvas: Canvas, cx: Float, cy: Float, size: Float) {
        // Touch target icon (stylus dot & pulse rings)
        val r = size * 0.18f
        canvas.drawCircle(cx, cy, r, iconPaint)

        val ringPaint = Paint(iconPaint).apply {
            style = Paint.Style.STROKE
            strokeWidth = 3f
        }
        canvas.drawCircle(cx, cy, size * 0.40f, ringPaint)
    }
}

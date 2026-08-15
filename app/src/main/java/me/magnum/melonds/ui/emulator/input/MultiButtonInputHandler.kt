package me.magnum.melonds.ui.emulator.input

import android.view.MotionEvent
import android.view.View
import me.magnum.melonds.common.vibration.TouchVibrator
import me.magnum.melonds.domain.model.Input
import me.magnum.melonds.domain.model.Point
import kotlin.math.atan2
import kotlin.math.pow
import kotlin.math.sqrt

abstract class MultiButtonInputHandler(
    inputListener: IInputListener,
    enableHapticFeedback: Boolean,
    touchVibrator: TouchVibrator
) : FeedbackInputHandler(inputListener, enableHapticFeedback, touchVibrator) {

    private var areDimensionsInitialized = false
    private var viewWidth = 0
    private var viewHeight = 0
    private val buttonCircles = mutableListOf<ButtonCircle>()
    private val pressedInputs = mutableListOf<Input>()
    private val newPressedInputs = mutableListOf<Input>()
    private val tempInputList = mutableListOf<Input>()

    open val isRadialDpad: Boolean = false

    override fun onTouch(v: View, event: MotionEvent): Boolean {
        if (!areDimensionsInitialized || viewWidth != v.width || viewHeight != v.height) {
            viewWidth = v.width
            viewHeight = v.height
            initDimensions(v.width, v.height)
            areDimensionsInitialized = true
        }

        newPressedInputs.clear()

        when (event.actionMasked) {
            MotionEvent.ACTION_DOWN, MotionEvent.ACTION_MOVE, MotionEvent.ACTION_POINTER_DOWN -> {
                val pointerCount = event.pointerCount
                for (i in 0 until pointerCount) {
                    val px = event.getX(i)
                    val py = event.getY(i)

                    if (isRadialDpad) {
                        processRadialDpad(px, py, newPressedInputs)
                    } else {
                        buttonCircles.forEach {
                            if (it.containsPoint(px, py)) {
                                if (it.input !in newPressedInputs) {
                                    newPressedInputs.add(it.input)
                                }
                            }
                        }
                    }
                }
            }
        }

        tempInputList.clear()
        pressedInputs.filterNotTo(tempInputList) {
            it in newPressedInputs
        }.forEach {
            inputListener.onKeyReleased(it)
        }

        if (tempInputList.isNotEmpty()) {
            performHapticFeedback(v, HapticFeedbackType.KEY_RELEASE)
        }

        tempInputList.clear()
        newPressedInputs.filterNotTo(tempInputList) {
            it in pressedInputs
        }.forEach {
            inputListener.onKeyPress(it)
        }

        if (tempInputList.isNotEmpty()) {
            performHapticFeedback(v, HapticFeedbackType.KEY_PRESS)
        }

        pressedInputs.clear()
        pressedInputs.addAll(newPressedInputs)

        (v as? me.magnum.melonds.ui.common.views.IAnimatedInputView)?.updatePressedInputs(newPressedInputs.toSet())

        return true
    }

    private fun processRadialDpad(px: Float, py: Float, outInputs: MutableList<Input>) {
        val cx = viewWidth / 2f
        val cy = viewHeight / 2f
        val dx = px - cx
        val dy = py - cy
        val dist = sqrt(dx * dx + dy * dy)
        val deadzone = viewWidth * 0.10f

        if (dist < deadzone) return

        // Angle in degrees from 0 to 360 (0 = Right, 90 = Down, 180 = Left, 270 = Up)
        var angle = Math.toDegrees(atan2(dy.toDouble(), dx.toDouble())).toFloat()
        if (angle < 0) angle += 360f

        // 8 sectors: 4 cardinal (45 deg) + 4 diagonal (45 deg)
        // Right: 337.5..360 or 0..22.5
        // Down-Right: 22.5..67.5
        // Down: 67.5..112.5
        // Down-Left: 112.5..157.5
        // Left: 157.5..202.5
        // Up-Left: 202.5..247.5
        // Up: 247.5..292.5
        // Up-Right: 292.5..337.5

        when {
            angle >= 337.5f || angle < 22.5f -> {
                outInputs.add(getRightInput())
            }
            angle in 22.5f..67.5f -> {
                outInputs.add(getRightInput())
                outInputs.add(getBottomInput())
            }
            angle in 67.5f..112.5f -> {
                outInputs.add(getBottomInput())
            }
            angle in 112.5f..157.5f -> {
                outInputs.add(getBottomInput())
                outInputs.add(getLeftInput())
            }
            angle in 157.5f..202.5f -> {
                outInputs.add(getLeftInput())
            }
            angle in 202.5f..247.5f -> {
                outInputs.add(getLeftInput())
                outInputs.add(getTopInput())
            }
            angle in 247.5f..292.5f -> {
                outInputs.add(getTopInput())
            }
            angle in 292.5f..337.5f -> {
                outInputs.add(getTopInput())
                outInputs.add(getRightInput())
            }
        }
    }

    private fun initDimensions(viewWidth: Int, viewHeight: Int) {
        buttonCircles.clear()
        val radiusSquared = (viewWidth * 230f / 512f).pow(2)
        val pointToLocal: (Float, Float) -> Point = { x, y ->
            Point().apply {
                this.x = (viewWidth * x / 512f).toInt()
                this.y = (viewHeight * y / 512f).toInt()
            }
        }

        buttonCircles.add(ButtonCircle(pointToLocal(512f - 110f, 256f), radiusSquared, getRightInput()))
        buttonCircles.add(ButtonCircle(pointToLocal(256f, 512f - 110f), radiusSquared, getBottomInput()))
        buttonCircles.add(ButtonCircle(pointToLocal(256f, 110f), radiusSquared, getTopInput()))
        buttonCircles.add(ButtonCircle(pointToLocal(110f, 256f), radiusSquared, getLeftInput()))
    }

    private data class ButtonCircle(val center: Point, val radiusSquared: Float, val input: Input) {
        fun containsPoint(pointX: Float, pointY: Float): Boolean {
            return (pointX - center.x).pow(2) + (pointY - center.y).pow(2) <= radiusSquared
        }
    }

    abstract fun getTopInput(): Input
    abstract fun getLeftInput(): Input
    abstract fun getBottomInput(): Input
    abstract fun getRightInput(): Input
}
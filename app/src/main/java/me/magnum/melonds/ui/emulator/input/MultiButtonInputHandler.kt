package me.magnum.melonds.ui.emulator.input

import android.os.Handler
import android.os.Looper
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
    private val rawCurrentInputs = mutableListOf<Input>()
    private val tempInputList = mutableListOf<Input>()

    private val stickyInputs = mutableSetOf<Input>()
    private val activeTouchStartTimes = mutableMapOf<Input, Long>()
    private val stickyTimers = mutableMapOf<Input, Runnable>()
    private val handler = Handler(Looper.getMainLooper())

    open val isRadialDpad: Boolean = false

    override fun onTouch(v: View, event: MotionEvent): Boolean {
        if (!areDimensionsInitialized || viewWidth != v.width || viewHeight != v.height) {
            viewWidth = v.width
            viewHeight = v.height
            initDimensions(v.width, v.height)
            areDimensionsInitialized = true
        }

        rawCurrentInputs.clear()

        when (event.actionMasked) {
            MotionEvent.ACTION_DOWN, MotionEvent.ACTION_MOVE, MotionEvent.ACTION_POINTER_DOWN -> {
                val pointerCount = event.pointerCount
                for (i in 0 until pointerCount) {
                    val px = event.getX(i)
                    val py = event.getY(i)

                    if (isRadialDpad) {
                        processRadialDpad(px, py, rawCurrentInputs)
                    } else {
                        processAccurateButtons(px, py, rawCurrentInputs)
                    }
                }
            }
            MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                rawCurrentInputs.clear()
            }
        }

        val now = System.currentTimeMillis()

        // Track newly pressed inputs to schedule 2-second sticky hold
        for (input in rawCurrentInputs) {
            if (!activeTouchStartTimes.containsKey(input)) {
                activeTouchStartTimes[input] = now
                val runnable = Runnable {
                    stickyInputs.add(input)
                    performHapticFeedback(v, HapticFeedbackType.KEY_PRESS)
                    (v as? me.magnum.melonds.ui.common.views.IAnimatedInputView)?.updatePressedInputs(resolveEffectiveInputs().toSet())
                }
                stickyTimers[input] = runnable
                handler.postDelayed(runnable, 2000L)
            }
        }

        // Handle released inputs (lifted finger)
        val releasedFromTouch = activeTouchStartTimes.keys.filter { it !in rawCurrentInputs }
        for (input in releasedFromTouch) {
            val startTime = activeTouchStartTimes.remove(input) ?: now
            stickyTimers.remove(input)?.let { handler.removeCallbacks(it) }

            val holdDuration = now - startTime
            // If button was already sticky and user quickly tapped it (< 600ms), toggle it off
            if (input in stickyInputs && holdDuration < 600L) {
                stickyInputs.remove(input)
            }
        }

        val effectiveInputs = resolveEffectiveInputs()

        tempInputList.clear()
        pressedInputs.filterNotTo(tempInputList) {
            it in effectiveInputs
        }.forEach {
            inputListener.onKeyReleased(it)
        }

        if (tempInputList.isNotEmpty()) {
            performHapticFeedback(v, HapticFeedbackType.KEY_RELEASE)
        }

        tempInputList.clear()
        effectiveInputs.filterNotTo(tempInputList) {
            it in pressedInputs
        }.forEach {
            inputListener.onKeyPress(it)
        }

        if (tempInputList.isNotEmpty()) {
            performHapticFeedback(v, HapticFeedbackType.KEY_PRESS)
        }

        pressedInputs.clear()
        pressedInputs.addAll(effectiveInputs)

        (v as? me.magnum.melonds.ui.common.views.IAnimatedInputView)?.updatePressedInputs(effectiveInputs.toSet())

        return true
    }

    private fun resolveEffectiveInputs(): List<Input> {
        val result = mutableListOf<Input>()
        result.addAll(rawCurrentInputs)
        for (sticky in stickyInputs) {
            if (sticky !in result) {
                result.add(sticky)
            }
        }
        return result
    }

    private fun processAccurateButtons(px: Float, py: Float, outInputs: MutableList<Input>) {
        if (buttonCircles.isEmpty()) return

        // Compute distance from touch to each button
        val distances = buttonCircles.map { circle ->
            val dist = sqrt((px - circle.center.x).pow(2) + (py - circle.center.y).pow(2))
            circle to dist
        }.sortedBy { it.second }

        val closest = distances[0]
        val singleRadius = sqrt(closest.first.radiusSquared)

        // If directly inside the closest button radius (strict single button zone)
        if (closest.second <= singleRadius) {
            val secondClosest = distances.getOrNull(1)
            // Check for intentional dual-button press (e.g. rolling thumb between A and B)
            if (secondClosest != null && secondClosest.second <= singleRadius * 1.18f && closest.second >= singleRadius * 0.45f) {
                if (closest.first.input !in outInputs) outInputs.add(closest.first.input)
                if (secondClosest.first.input !in outInputs) outInputs.add(secondClosest.first.input)
            } else {
                if (closest.first.input !in outInputs) outInputs.add(closest.first.input)
            }
        } else if (closest.second <= singleRadius * 1.35f) {
            // Generous boundary for the single closest button
            if (closest.first.input !in outInputs) outInputs.add(closest.first.input)
        }
    }

    private fun processRadialDpad(px: Float, py: Float, outInputs: MutableList<Input>) {
        val cx = viewWidth / 2f
        val cy = viewHeight / 2f
        val dx = px - cx
        val dy = py - cy
        val dist = sqrt(dx * dx + dy * dy)
        val deadzone = viewWidth * 0.10f

        if (dist < deadzone) return

        var angle = Math.toDegrees(atan2(dy.toDouble(), dx.toDouble())).toFloat()
        if (angle < 0) angle += 360f

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
        // Precise button radius (95 units out of 512) prevents accidental cross-triggering
        val radiusSquared = (viewWidth * 95f / 512f).pow(2)
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

    private data class ButtonCircle(val center: Point, val radiusSquared: Float, val input: Input)

    abstract fun getTopInput(): Input
    abstract fun getLeftInput(): Input
    abstract fun getBottomInput(): Input
    abstract fun getRightInput(): Input
}
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
            MotionEvent.ACTION_POINTER_UP -> {
                val actionIndex = event.actionIndex
                val pointerCount = event.pointerCount
                for (i in 0 until pointerCount) {
                    if (i == actionIndex) continue
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

        // When finger touches down on a button that was sticky, immediately turn sticky OFF!
        for (input in rawCurrentInputs) {
            if (input in stickyInputs) {
                stickyInputs.remove(input)
            }
        }

        // Track newly pressed inputs to schedule 2-second sticky hold
        for (input in rawCurrentInputs) {
            if (!activeTouchStartTimes.containsKey(input)) {
                activeTouchStartTimes[input] = now
                val runnable = Runnable {
                    // Double check if input is still actively touched before locking sticky
                    if (input in rawCurrentInputs) {
                        stickyInputs.add(input)
                        performHapticFeedback(v, HapticFeedbackType.KEY_PRESS)
                        (v as? me.magnum.melonds.ui.common.views.IAnimatedInputView)?.updatePressedInputs(resolveEffectiveInputs().toSet())
                    }
                }
                stickyTimers[input] = runnable
                handler.postDelayed(runnable, 2000L)
            }
        }

        // Handle released inputs (lifted finger or moved off button)
        val releasedFromTouch = activeTouchStartTimes.keys.filter { it !in rawCurrentInputs }
        for (input in releasedFromTouch) {
            activeTouchStartTimes.remove(input)
            stickyTimers.remove(input)?.let { handler.removeCallbacks(it) }
        }

        if (event.actionMasked == MotionEvent.ACTION_UP || event.actionMasked == MotionEvent.ACTION_CANCEL) {
            // Cancel all pending timers that didn't reach 2s
            for ((_, timer) in stickyTimers) {
                handler.removeCallbacks(timer)
            }
            stickyTimers.clear()
            activeTouchStartTimes.clear()
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
        val maxReach = singleRadius * 1.80f

        val candidateButtons = distances.filter { it.second <= maxReach }

        if (candidateButtons.isNotEmpty()) {
            val d0 = candidateButtons[0].second
            // Add closest button
            if (candidateButtons[0].first.input !in outInputs) {
                outInputs.add(candidateButtons[0].first.input)
            }
            // If touch is near the midpoint between buttons (e.g. between X and A, A and B, etc.), activate both!
            for (i in 1 until candidateButtons.size) {
                val candidate = candidateButtons[i]
                if (candidate.second <= singleRadius * 1.70f && (candidate.second - d0) <= singleRadius * 0.95f) {
                    if (candidate.first.input !in outInputs) {
                        outInputs.add(candidate.first.input)
                    }
                }
            }
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

    protected abstract fun getTopInput(): Input
    protected abstract fun getBottomInput(): Input
    protected abstract fun getLeftInput(): Input
    protected abstract fun getRightInput(): Input

    protected fun setButtonCircle(input: Input, center: Point, radiusSquared: Float) {
        buttonCircles.removeAll { it.input == input }
        buttonCircles.add(ButtonCircle(input, center, radiusSquared))
    }

    protected open fun initDimensions(width: Int, height: Int) {
        buttonCircles.clear()
    }

    private data class ButtonCircle(
        val input: Input,
        val center: Point,
        val radiusSquared: Float
    )
}
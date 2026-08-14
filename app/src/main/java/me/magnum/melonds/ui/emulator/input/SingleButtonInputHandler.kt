package me.magnum.melonds.ui.emulator.input

import android.view.MotionEvent
import android.view.View
import me.magnum.melonds.common.vibration.TouchVibrator
import me.magnum.melonds.domain.model.Input

class SingleButtonInputHandler(inputListener: IInputListener, private val input: Input, enableHapticFeedback: Boolean, touchVibrator: TouchVibrator) : FeedbackInputHandler(inputListener, enableHapticFeedback, touchVibrator) {
    override fun onTouch(v: View, event: MotionEvent): Boolean {
        when (event.action) {
            MotionEvent.ACTION_DOWN -> {
                inputListener.onKeyPress(input)
                performHapticFeedback(v, HapticFeedbackType.KEY_PRESS)
                (v as? me.magnum.melonds.ui.common.views.IAnimatedInputView)?.updatePressedInputs(setOf(input))
            }
            MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                inputListener.onKeyReleased(input)
                performHapticFeedback(v, HapticFeedbackType.KEY_RELEASE)
                (v as? me.magnum.melonds.ui.common.views.IAnimatedInputView)?.updatePressedInputs(emptySet())
            }
        }
        return true
    }
}
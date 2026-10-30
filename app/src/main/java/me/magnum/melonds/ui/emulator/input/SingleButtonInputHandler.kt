package me.magnum.melonds.ui.emulator.input

import android.os.Handler
import android.os.Looper
import android.view.MotionEvent
import android.view.View
import me.magnum.melonds.common.vibration.TouchVibrator
import me.magnum.melonds.domain.model.Input

class SingleButtonInputHandler(
    inputListener: IInputListener,
    private val input: Input,
    enableHapticFeedback: Boolean,
    touchVibrator: TouchVibrator,
    private val onLongPress: (() -> Unit)? = null
) : FeedbackInputHandler(inputListener, enableHapticFeedback, touchVibrator) {

    private var isPressed = false
    private var isLongPressed = false
    private val handler = Handler(Looper.getMainLooper())
    private var longPressRunnable: Runnable? = null

    override fun onTouch(v: View, event: MotionEvent): Boolean {
        when (event.actionMasked) {
            MotionEvent.ACTION_DOWN -> {
                if (!isPressed) {
                    isPressed = true
                    isLongPressed = false
                    if (onLongPress != null) {
                        val runnable = Runnable {
                            if (isPressed) {
                                isLongPressed = true
                                performHapticFeedback(v, HapticFeedbackType.KEY_PRESS)
                                onLongPress.invoke()
                            }
                        }
                        longPressRunnable = runnable
                        handler.postDelayed(runnable, 500L)
                    }
                    inputListener.onKeyPress(input)
                    performHapticFeedback(v, HapticFeedbackType.KEY_PRESS)
                    (v as? me.magnum.melonds.ui.common.views.IAnimatedInputView)?.updatePressedInputs(setOf(input))
                }
            }
            MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                longPressRunnable?.let { handler.removeCallbacks(it) }
                longPressRunnable = null
                if (isPressed) {
                    isPressed = false
                    inputListener.onKeyReleased(input)
                    performHapticFeedback(v, HapticFeedbackType.KEY_RELEASE)
                    (v as? me.magnum.melonds.ui.common.views.IAnimatedInputView)?.updatePressedInputs(emptySet())
                }
            }
        }
        return true
    }
}

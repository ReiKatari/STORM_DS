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
    touchVibrator: TouchVibrator
) : FeedbackInputHandler(inputListener, enableHapticFeedback, touchVibrator) {

    private var isStickyLocked = false
    private var touchStartTime = 0L
    private val handler = Handler(Looper.getMainLooper())
    private var stickyRunnable: Runnable? = null

    override fun onTouch(v: View, event: MotionEvent): Boolean {
        val now = System.currentTimeMillis()

        when (event.action) {
            MotionEvent.ACTION_DOWN -> {
                touchStartTime = now
                if (!isStickyLocked) {
                    inputListener.onKeyPress(input)
                    performHapticFeedback(v, HapticFeedbackType.KEY_PRESS)
                    (v as? me.magnum.melonds.ui.common.views.IAnimatedInputView)?.updatePressedInputs(setOf(input))
                }

                stickyRunnable?.let { handler.removeCallbacks(it) }
                val runnable = Runnable {
                    isStickyLocked = true
                    performHapticFeedback(v, HapticFeedbackType.KEY_PRESS)
                    (v as? me.magnum.melonds.ui.common.views.IAnimatedInputView)?.updatePressedInputs(setOf(input))
                }
                stickyRunnable = runnable
                handler.postDelayed(runnable, 2000L)
            }
            MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                stickyRunnable?.let { handler.removeCallbacks(it) }
                val holdDuration = now - touchStartTime

                if (isStickyLocked && holdDuration < 600L) {
                    // Quick tap while locked toggles it OFF
                    isStickyLocked = false
                    inputListener.onKeyReleased(input)
                    performHapticFeedback(v, HapticFeedbackType.KEY_RELEASE)
                    (v as? me.magnum.melonds.ui.common.views.IAnimatedInputView)?.updatePressedInputs(emptySet())
                } else if (!isStickyLocked) {
                    inputListener.onKeyReleased(input)
                    performHapticFeedback(v, HapticFeedbackType.KEY_RELEASE)
                    (v as? me.magnum.melonds.ui.common.views.IAnimatedInputView)?.updatePressedInputs(emptySet())
                }
            }
        }
        return true
    }
}
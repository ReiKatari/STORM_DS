package me.magnum.melonds.ui.emulator.input

import android.os.Handler
import android.os.Looper
import android.view.MotionEvent
import android.view.View
import me.magnum.melonds.common.vibration.TouchVibrator
import me.magnum.melonds.domain.model.Input
import me.magnum.melonds.domain.model.layout.VirtualButtonMode
import me.magnum.melonds.ui.common.views.IAnimatedInputView

class SingleButtonInputHandler(
    inputListener: IInputListener,
    private val input: Input,
    enableHapticFeedback: Boolean,
    touchVibrator: TouchVibrator,
    private val mode: VirtualButtonMode = VirtualButtonMode.NORMAL,
    private val onLongPress: (() -> Unit)? = null,
) : FeedbackInputHandler(inputListener, enableHapticFeedback, touchVibrator) {

    private var pressed = false
    private var touchDown = false
    private var isLongPressed = false
    private var activeView: View? = null
    private val handler = Handler(Looper.getMainLooper())
    private var longPressRunnable: Runnable? = null
    private val turboPulse = object : Runnable {
        override fun run() {
            val view = activeView ?: return
            if (!touchDown) return
            setPressed(view, !pressed)
            view.postDelayed(this, 50L)
        }
    }

    override fun onTouch(v: View, event: MotionEvent): Boolean {
        when (event.actionMasked) {
            MotionEvent.ACTION_DOWN -> {
                if (touchDown) return true
                touchDown = true
                activeView = v
                isLongPressed = false
                if (onLongPress != null) {
                    pressed = true
                    v.isPressed = true
                    (v as? IAnimatedInputView)?.updatePressedInputs(setOf(input))
                    val runnable = Runnable {
                        if (touchDown && pressed) {
                            isLongPressed = true
                            performHapticFeedback(v, HapticFeedbackType.KEY_PRESS)
                            onLongPress.invoke()
                        }
                    }
                    longPressRunnable = runnable
                    handler.postDelayed(runnable, 500L)
                } else {
                    setPressed(v, if (mode == VirtualButtonMode.TOGGLE) !pressed else true)
                    val turboAllowed = (inputListener as? MelonTouchHandler)?.isTurboAllowed() ?: true
                    if (mode == VirtualButtonMode.TURBO && turboAllowed) v.postDelayed(turboPulse, 50L)
                    performHapticFeedback(v, HapticFeedbackType.KEY_PRESS)
                }
            }
            MotionEvent.ACTION_UP -> {
                touchDown = false
                if (onLongPress != null) {
                    longPressRunnable?.let { handler.removeCallbacks(it) }
                    longPressRunnable = null
                    if (pressed) {
                        pressed = false
                        v.isPressed = false
                        if (!isLongPressed) {
                            inputListener.onKeyPress(input)
                            performHapticFeedback(v, HapticFeedbackType.KEY_PRESS)
                            inputListener.onKeyReleased(input)
                        }
                        (v as? IAnimatedInputView)?.updatePressedInputs(emptySet())
                    }
                    activeView = null
                } else {
                    if (mode != VirtualButtonMode.TOGGLE) release()
                    performHapticFeedback(v, HapticFeedbackType.KEY_RELEASE)
                }
            }
            MotionEvent.ACTION_CANCEL -> release()
        }
        return true
    }

    fun release() {
        touchDown = false
        longPressRunnable?.let { handler.removeCallbacks(it) }
        longPressRunnable = null
        activeView?.let {
            it.removeCallbacks(turboPulse)
            if (onLongPress != null) {
                pressed = false
                it.isPressed = false
                (it as? IAnimatedInputView)?.updatePressedInputs(emptySet())
            } else {
                setPressed(it, false)
            }
        }
        activeView = null
    }

    private fun setPressed(view: View, value: Boolean) {
        if (pressed == value) return
        pressed = value
        view.isPressed = value
        (view as? IAnimatedInputView)?.updatePressedInputs(if (value) setOf(input) else emptySet())
        if (value) inputListener.onKeyPress(input) else inputListener.onKeyReleased(input)
    }
}

package me.magnum.melonds.ui.emulator.input

import me.magnum.melonds.MelonEmulator
import me.magnum.melonds.domain.model.Input
import me.magnum.melonds.domain.model.Point

class MelonTouchHandler(
    var onLidStateChanged: ((Boolean) -> Unit)? = null,
    var onStartPressed: (() -> Unit)? = null,
) : IInputListener {
    var isLidClosed = false
        private set

    override fun onKeyPress(key: Input) {
        if (key == Input.HINGE) {
            handleHingePress()
        } else {
            if (key == Input.START) {
                onStartPressed?.invoke()
            }
            MelonEmulator.onInputDown(key)
        }
    }

    override fun onKeyReleased(key: Input) {
        if (key != Input.HINGE) {
            MelonEmulator.onInputUp(key)
        }
    }

    override fun onTouch(point: Point) {
        if (isLidClosed) {
            handleHingePress()
            return
        }
        MelonEmulator.onScreenTouch(point.x, point.y)
    }

    fun handleHingePress() {
        isLidClosed = !isLidClosed
        if (isLidClosed) {
            MelonEmulator.onInputDown(Input.HINGE)
        } else {
            MelonEmulator.onInputUp(Input.HINGE)
        }
        onLidStateChanged?.invoke(isLidClosed)
    }
}
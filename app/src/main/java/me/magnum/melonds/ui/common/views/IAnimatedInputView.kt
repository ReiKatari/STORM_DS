package me.magnum.melonds.ui.common.views

import me.magnum.melonds.domain.model.Input

interface IAnimatedInputView {
    fun updatePressedInputs(pressedInputs: Set<Input>)
}

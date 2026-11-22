package me.magnum.melonds.ui.emulator.input

import android.view.KeyEvent
import android.view.MotionEvent

interface INativeInputListener {
    fun releaseChordInputs() {}
    fun onKeyEvent(keyEvent: KeyEvent): Boolean
    fun onMotionEvent(motionEvent: MotionEvent): Boolean
    fun onMotionEventSlot2(motionEvent: MotionEvent): Boolean {
        return false
    }
}

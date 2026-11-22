package me.magnum.melonds.ui.emulator.input

import android.view.MotionEvent
import android.view.View
import me.magnum.melonds.ui.emulator.input.view.Slot2AnalogView
import kotlin.math.hypot

class Slot2AnalogInputHandler(private val input: Slot2AnalogInput) : View.OnTouchListener {
    private var pointerId = -1
    private var activeView: Slot2AnalogView? = null

    override fun onTouch(view: View, event: MotionEvent): Boolean {
        val stick = view as Slot2AnalogView
        when (event.actionMasked) {
            MotionEvent.ACTION_DOWN -> {
                if (pointerId != -1) return true
                pointerId = event.getPointerId(event.actionIndex)
                activeView = stick
                update(stick, event, event.actionIndex)
            }
            MotionEvent.ACTION_MOVE -> {
                val index = event.findPointerIndex(pointerId)
                if (index >= 0) update(stick, event, index)
            }
            MotionEvent.ACTION_POINTER_UP -> {
                if (event.getPointerId(event.actionIndex) == pointerId) release()
            }
            MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> release()
        }
        return true
    }

    private fun update(view: Slot2AnalogView, event: MotionEvent, index: Int) {
        val radius = view.travelRadius.coerceAtLeast(1f)
        val x = (event.getX(index) - view.width / 2f) / radius
        val y = (event.getY(index) - view.height / 2f) / radius
        val length = hypot(x, y).coerceAtLeast(1f)
        if (input.setTouch(this, x / length, y / length)) {
            view.setAxes(x / length, y / length)
        }
    }

    fun release() {
        input.releaseTouch(this)
        activeView?.setAxes(0f, 0f)
        activeView = null
        pointerId = -1
    }
}

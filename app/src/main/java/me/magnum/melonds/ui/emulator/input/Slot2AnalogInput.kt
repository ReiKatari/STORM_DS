package me.magnum.melonds.ui.emulator.input

class Slot2AnalogInput(private val publish: (Float, Float) -> Unit) {
    private var physicalX = 0f
    private var physicalY = 0f
    private var touchOwner: Any? = null

    fun setPhysical(x: Float, y: Float) {
        physicalX = x
        physicalY = y
        if (touchOwner == null) publish(x, y)
    }

    fun setTouch(owner: Any, x: Float, y: Float): Boolean {
        if (touchOwner != null && touchOwner !== owner) return false
        touchOwner = owner
        publish(x, y)
        return true
    }

    fun releaseTouch(owner: Any) {
        if (touchOwner !== owner) return
        touchOwner = null
        publish(physicalX, physicalY)
    }

    fun clearPhysical() {
        if (physicalX == 0f && physicalY == 0f) return
        setPhysical(0f, 0f)
    }

    fun clear() {
        val active = touchOwner != null || physicalX != 0f || physicalY != 0f
        touchOwner = null
        physicalX = 0f
        physicalY = 0f
        if (active) publish(0f, 0f)
    }
}

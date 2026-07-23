package me.magnum.melonds.ui.emulator.component

class RaPendingRuntimeDisableGate {
    private var deferred = false

    @Synchronized
    fun update(shouldDefer: Boolean) {
        deferred = shouldDefer
    }

    @Synchronized
    fun consumeWhenEmpty(pendingTotal: Int): Boolean {
        if (!deferred || pendingTotal != 0) {
            return false
        }
        deferred = false
        return true
    }

    @Synchronized
    fun reset() {
        deferred = false
    }
}

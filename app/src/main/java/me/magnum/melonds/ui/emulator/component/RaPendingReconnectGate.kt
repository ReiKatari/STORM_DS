package me.magnum.melonds.ui.emulator.component

class RaPendingReconnectGate {
    private var disconnected = false

    @Synchronized
    fun onDisconnected() {
        disconnected = true
    }

    @Synchronized
    fun consumeReconnect(): Boolean {
        if (!disconnected) {
            return false
        }
        disconnected = false
        return true
    }

    @Synchronized
    fun reset() {
        disconnected = false
    }
}

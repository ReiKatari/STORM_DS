package me.magnum.melonds.ui.emulator.component

import me.magnum.melonds.ui.emulator.model.EmulatorOverlay

class EmulatorOverlayTracker(
    private val onOverlaysCleared: () -> Unit,
    private val onOverlaysPresent: () -> Unit,
) {

    private val activeOverlays = mutableListOf<EmulatorOverlay>()

    fun addActiveOverlay(overlay: EmulatorOverlay) {
        if (overlay in activeOverlays) {
            return
        }
        val wasEmpty = activeOverlays.isEmpty()
        activeOverlays.add(overlay)
        if (wasEmpty) {
            onOverlaysPresent()
        }
    }

    fun removeActiveOverlay(overlay: EmulatorOverlay) {
        activeOverlays.remove(overlay)
        if (activeOverlays.isEmpty()) {
            onOverlaysCleared()
        }
    }

    fun hasActiveOverlays(): Boolean {
        return activeOverlays.isNotEmpty()
    }

    fun clear() {
        if (activeOverlays.isNotEmpty()) {
            activeOverlays.clear()
            onOverlaysCleared()
        }
    }
}
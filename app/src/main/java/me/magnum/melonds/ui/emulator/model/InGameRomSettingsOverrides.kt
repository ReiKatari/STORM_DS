package me.magnum.melonds.ui.emulator.model

data class InGameRomSettingsOverrides(
    val controllerMapping: Boolean = false,
    val controllerLayout: Boolean = false,
    val videoFiltering: Boolean = false,
) {
    val hasAnyOverride: Boolean
        get() = controllerMapping || controllerLayout || videoFiltering
}

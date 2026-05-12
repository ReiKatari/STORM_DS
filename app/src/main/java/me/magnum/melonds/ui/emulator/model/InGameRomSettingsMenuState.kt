package me.magnum.melonds.ui.emulator.model

data class InGameRomSettingsMenuState(
    val controllerMappingValue: String,
    val layoutValue: String,
    val videoFilteringValue: String,
    val showRetroArchSettings: Boolean,
    val retroArchPresetPathValue: String,
    val retroArchParametersValue: String,
    val hasValidRetroArchShaderRoot: Boolean,
    val micSourceValue: String,
)

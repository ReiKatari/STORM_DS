package me.magnum.melonds.domain.model.rom.config

import me.magnum.melonds.domain.model.ControllerConfiguration
import me.magnum.melonds.domain.model.VideoFiltering
import me.magnum.melonds.domain.model.VideoRenderer
import java.util.*

data class RomConfig(
    val runtimeConsoleType: RuntimeConsoleType = RuntimeConsoleType.DEFAULT,
    val runtimeMicSource: RuntimeMicSource = RuntimeMicSource.DEFAULT,
    val layoutId: UUID? = null,
    val gbaSlotConfig: RomGbaSlotConfig = RomGbaSlotConfig.None,
    val customName: String? = null,
    val useHgEngineFix: Boolean = false,
    val inputMode: RomInputMode = RomInputMode.GLOBAL,
    val customControllerConfiguration: ControllerConfiguration? = null,
    val videoRenderer: VideoRenderer? = null,
    val threadedRendering: Boolean? = null,
    val internalResolutionScaling: Int? = null,
    val videoFiltering: VideoFiltering? = null,
    val retroArchShaderPresetPath: String? = null,
    val retroArchShaderParameters: String? = null,
    val retroAchievementsEnabled: Boolean? = null,
    val dualScreenPreset: me.magnum.melonds.domain.model.DualScreenPreset? = null,
    val dualScreenKeepAspectRatio: Boolean? = null,
    val dualScreenIntegerScale: Boolean? = null,
) {

    fun getEffectiveControllerConfiguration(globalConfiguration: ControllerConfiguration): ControllerConfiguration {
        return if (inputMode == RomInputMode.CUSTOM) {
            customControllerConfiguration ?: globalConfiguration
        } else {
            globalConfiguration
        }
    }

    companion object {
        fun default() = RomConfig()

        fun forDsiWareTitle(): RomConfig {
            return RomConfig(
                runtimeConsoleType = RuntimeConsoleType.DEFAULT,
                runtimeMicSource = RuntimeMicSource.DEFAULT,
                layoutId = null,
                gbaSlotConfig = RomGbaSlotConfig.None,
                customName = null,
                useHgEngineFix = false,
                inputMode = RomInputMode.GLOBAL,
                customControllerConfiguration = null,
                videoRenderer = null,
                threadedRendering = null,
                internalResolutionScaling = null,
                videoFiltering = null,
                retroArchShaderPresetPath = null,
                retroArchShaderParameters = null,
                retroAchievementsEnabled = null,
                dualScreenPreset = null,
                dualScreenKeepAspectRatio = null,
                dualScreenIntegerScale = null,
            )
        }
    }
}

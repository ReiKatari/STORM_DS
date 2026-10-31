package me.magnum.melonds.impl.dtos.rom

import com.google.gson.annotations.SerializedName
import me.magnum.melonds.domain.model.VideoFiltering
import me.magnum.melonds.domain.model.VideoRenderer
import me.magnum.melonds.domain.model.rom.config.RomConfig
import me.magnum.melonds.domain.model.rom.config.RomInputMode
import me.magnum.melonds.domain.model.rom.config.RuntimeConsoleType
import me.magnum.melonds.domain.model.rom.config.RuntimeMicSource
import me.magnum.melonds.impl.dtos.input.ControllerConfigurationDto
import java.util.UUID

data class RomConfigDto(
    @SerializedName("runtimeConsoleType")
    val runtimeConsoleType: RuntimeConsoleType? = null,
    @SerializedName("runtimeMicSource")
    val runtimeMicSource: RuntimeMicSource? = null,
    @SerializedName("layoutId")
    val layoutId: String? = null,
    @SerializedName("gbaSlotConfig")
    val gbaSlotConfig: RomGbaSlotConfigDto? = null,
    @SerializedName("customName")
    val customName: String? = null,
    @SerializedName(value = "useHgEngineFix", alternate = ["useHgInputWorkaround"])
    val useHgEngineFix: Boolean? = null,
    @SerializedName("inputMode")
    val inputMode: RomInputMode? = null,
    @SerializedName("customControllerConfiguration")
    val customControllerConfiguration: ControllerConfigurationDto? = null,
    @SerializedName("videoRenderer")
    val videoRenderer: VideoRenderer? = null,
    @SerializedName("threadedRendering")
    val threadedRendering: Boolean? = null,
    @SerializedName("internalResolutionScaling")
    val internalResolutionScaling: Int? = null,
    @SerializedName("videoFiltering")
    val videoFiltering: VideoFiltering? = null,
    @SerializedName("retroArchShaderPresetPath")
    val retroArchShaderPresetPath: String? = null,
    @SerializedName("retroArchShaderParameters")
    val retroArchShaderParameters: String? = null,
    @SerializedName("retroAchievementsEnabled")
    val retroAchievementsEnabled: Boolean? = null,
    @SerializedName("dualScreenPreset")
    val dualScreenPreset: me.magnum.melonds.domain.model.DualScreenPreset? = null,
    @SerializedName("dualScreenKeepAspectRatio")
    val dualScreenKeepAspectRatio: Boolean? = null,
    @SerializedName("dualScreenIntegerScale")
    val dualScreenIntegerScale: Boolean? = null,
    @SerializedName("translatorSourceLang")
    val translatorSourceLang: String? = null,
    @SerializedName("arm9Overclock")
    val arm9Overclock: Int? = null,
    @SerializedName("fastForwardSpeedMultiplier")
    val fastForwardSpeedMultiplier: Float? = null,
    @SerializedName("customVulkanDriverName")
    val customVulkanDriverName: String? = null,
) {

    companion object {
        fun fromModel(romConfig: RomConfig): RomConfigDto {
            return RomConfigDto(
                runtimeConsoleType = romConfig.runtimeConsoleType,
                runtimeMicSource = romConfig.runtimeMicSource,
                layoutId = romConfig.layoutId?.toString(),
                gbaSlotConfig = RomGbaSlotConfigDto.fromModel(romConfig.gbaSlotConfig),
                customName = romConfig.customName,
                useHgEngineFix = romConfig.useHgEngineFix,
                inputMode = romConfig.inputMode,
                customControllerConfiguration = romConfig.customControllerConfiguration?.let { ControllerConfigurationDto.fromControllerConfiguration(it) },
                videoRenderer = romConfig.videoRenderer,
                threadedRendering = romConfig.threadedRendering,
                internalResolutionScaling = romConfig.internalResolutionScaling?.takeIf { it > 0 },
                videoFiltering = romConfig.videoFiltering,
                retroArchShaderPresetPath = romConfig.retroArchShaderPresetPath?.takeIf { it.isNotBlank() },
                retroArchShaderParameters = romConfig.retroArchShaderParameters?.takeIf { it.isNotBlank() },
                retroAchievementsEnabled = romConfig.retroAchievementsEnabled,
                dualScreenPreset = romConfig.dualScreenPreset,
                dualScreenKeepAspectRatio = romConfig.dualScreenKeepAspectRatio,
                dualScreenIntegerScale = romConfig.dualScreenIntegerScale,
                translatorSourceLang = romConfig.translatorSourceLang?.takeIf { it.isNotBlank() },
                arm9Overclock = romConfig.arm9Overclock?.takeIf { it > 0 },
                fastForwardSpeedMultiplier = romConfig.fastForwardSpeedMultiplier?.takeIf { it > 0f },
                customVulkanDriverName = romConfig.customVulkanDriverName?.takeIf { it.isNotBlank() },
            )
        }
    }

    fun toModel(): RomConfig {
        return RomConfig(
            runtimeConsoleType = runtimeConsoleType ?: RuntimeConsoleType.DEFAULT,
            runtimeMicSource = runtimeMicSource ?: RuntimeMicSource.DEFAULT,
            layoutId = layoutId?.let { runCatching { UUID.fromString(it) }.getOrNull() },
            gbaSlotConfig = gbaSlotConfig?.toModel() ?: me.magnum.melonds.domain.model.rom.config.RomGbaSlotConfig.None,
            customName = customName,
            useHgEngineFix = useHgEngineFix ?: false,
            inputMode = inputMode ?: RomInputMode.GLOBAL,
            customControllerConfiguration = customControllerConfiguration?.toControllerConfiguration(),
            videoRenderer = videoRenderer,
            threadedRendering = threadedRendering,
            internalResolutionScaling = internalResolutionScaling?.takeIf { it > 0 },
            videoFiltering = videoFiltering,
            retroArchShaderPresetPath = retroArchShaderPresetPath?.takeIf { it.isNotBlank() },
            retroArchShaderParameters = retroArchShaderParameters?.takeIf { it.isNotBlank() },
            retroAchievementsEnabled = retroAchievementsEnabled,
            dualScreenPreset = dualScreenPreset,
            dualScreenKeepAspectRatio = dualScreenKeepAspectRatio,
            dualScreenIntegerScale = dualScreenIntegerScale,
            translatorSourceLang = translatorSourceLang?.takeIf { it.isNotBlank() },
            arm9Overclock = arm9Overclock?.takeIf { it > 0 },
            fastForwardSpeedMultiplier = fastForwardSpeedMultiplier?.takeIf { it > 0f },
            customVulkanDriverName = customVulkanDriverName?.takeIf { it.isNotBlank() },
        )
    }
}

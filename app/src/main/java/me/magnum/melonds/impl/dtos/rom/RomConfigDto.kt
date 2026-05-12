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
    val runtimeConsoleType: RuntimeConsoleType,
    @SerializedName("runtimeMicSource")
    val runtimeMicSource: RuntimeMicSource,
    @SerializedName("layoutId")
    val layoutId: String?,
    @SerializedName("gbaSlotConfig")
    val gbaSlotConfig: RomGbaSlotConfigDto,
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
) {

    companion object {
        fun fromModel(romConfig: RomConfig): RomConfigDto {
            return RomConfigDto(
                romConfig.runtimeConsoleType,
                romConfig.runtimeMicSource,
                romConfig.layoutId?.toString(),
                RomGbaSlotConfigDto.fromModel(romConfig.gbaSlotConfig),
                romConfig.customName,
                romConfig.useHgEngineFix,
                romConfig.inputMode,
                romConfig.customControllerConfiguration?.let { ControllerConfigurationDto.fromControllerConfiguration(it) },
                romConfig.videoRenderer,
                romConfig.threadedRendering,
                romConfig.internalResolutionScaling,
                romConfig.videoFiltering,
                romConfig.retroArchShaderPresetPath,
                romConfig.retroArchShaderParameters,
            )
        }
    }

    fun toModel(): RomConfig {
        return RomConfig(
            runtimeConsoleType,
            runtimeMicSource,
            layoutId?.let { UUID.fromString(it) },
            gbaSlotConfig.toModel(),
            customName = customName,
            useHgEngineFix = useHgEngineFix ?: false,
            inputMode = inputMode ?: RomInputMode.GLOBAL,
            customControllerConfiguration = customControllerConfiguration?.toControllerConfiguration(),
            videoRenderer = videoRenderer,
            threadedRendering = threadedRendering,
            internalResolutionScaling = internalResolutionScaling,
            videoFiltering = videoFiltering,
            retroArchShaderPresetPath = retroArchShaderPresetPath,
            retroArchShaderParameters = retroArchShaderParameters,
        )
    }
}

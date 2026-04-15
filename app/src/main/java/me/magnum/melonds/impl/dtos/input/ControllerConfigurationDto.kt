package me.magnum.melonds.impl.dtos.input

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.magnum.melonds.domain.model.ControllerConfiguration
import me.magnum.melonds.domain.model.Slot2AnalogMapping

@Serializable
data class ControllerConfigurationDto(
    @SerialName("inputMapper") val inputMapper: List<InputConfigDto>,
    @SerialName("slot2AnalogMapping") val slot2AnalogMapping: Slot2AnalogMappingDto = Slot2AnalogMappingDto(),
) {

    companion object {
        fun fromControllerConfiguration(controllerConfiguration: ControllerConfiguration): ControllerConfigurationDto {
            val inputMapping = controllerConfiguration.inputMapper.map { InputConfigDto.fromInputConfig(it) }
            return ControllerConfigurationDto(
                inputMapper = inputMapping,
                slot2AnalogMapping = Slot2AnalogMappingDto.fromModel(controllerConfiguration.slot2AnalogMapping),
            )
        }
    }

    fun toControllerConfiguration(): ControllerConfiguration {
        return ControllerConfiguration(
            configList = inputMapper.map { it.toInputConfig() },
            slot2AnalogMapping = slot2AnalogMapping.toModel(),
        )
    }

    @Serializable
    data class Slot2AnalogMappingDto(
        @SerialName("deviceId") val deviceId: Int? = null,
        @SerialName("useDeviceFilter") val useDeviceFilter: Boolean? = null,
        @SerialName("axisXCode") val axisXCode: Int = Slot2AnalogMapping.DEFAULT_AXIS_X_CODE,
        @SerialName("axisYCode") val axisYCode: Int = Slot2AnalogMapping.DEFAULT_AXIS_Y_CODE,
        @SerialName("invertX") val invertX: Boolean = false,
        @SerialName("invertY") val invertY: Boolean = false,
        @SerialName("deadzone") val deadzone: Float = Slot2AnalogMapping.DEFAULT_DEADZONE,
    ) {
        fun toModel(): Slot2AnalogMapping {
            return Slot2AnalogMapping(
                deviceId = deviceId,
                useDeviceFilter = useDeviceFilter ?: (deviceId != null),
                axisXCode = axisXCode,
                axisYCode = axisYCode,
                invertX = invertX,
                invertY = invertY,
                deadzone = deadzone,
            )
        }

        companion object {
            fun fromModel(model: Slot2AnalogMapping): Slot2AnalogMappingDto {
                return Slot2AnalogMappingDto(
                    deviceId = model.deviceId,
                    useDeviceFilter = model.useDeviceFilter,
                    axisXCode = model.axisXCode,
                    axisYCode = model.axisYCode,
                    invertX = model.invertX,
                    invertY = model.invertY,
                    deadzone = model.deadzone,
                )
            }
        }
    }
}

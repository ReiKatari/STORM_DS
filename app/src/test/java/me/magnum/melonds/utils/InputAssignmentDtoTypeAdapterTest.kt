package me.magnum.melonds.utils

import com.google.gson.GsonBuilder
import me.magnum.melonds.domain.model.ControllerConfiguration
import me.magnum.melonds.domain.model.Input
import me.magnum.melonds.domain.model.InputConfig
import me.magnum.melonds.impl.dtos.input.ControllerConfigurationDto
import me.magnum.melonds.impl.dtos.input.InputConfigDto
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class InputAssignmentDtoTypeAdapterTest {
    private val gson = GsonBuilder()
        .registerTypeAdapter(ControllerConfigurationDto::class.java, ControllerConfigurationDtoTypeAdapter())
        .registerTypeAdapter(InputConfigDto.AssignmentDto::class.java, InputAssignmentDtoTypeAdapter())
        .create()

    @Test
    fun roundTripsKeyAssignment() {
        val original: InputConfigDto.AssignmentDto = InputConfigDto.AssignmentDto.Key(
            deviceId = 7,
            keyCode = 96,
        )

        val decoded = gson.fromJson(
            gson.toJson(original, InputConfigDto.AssignmentDto::class.java),
            InputConfigDto.AssignmentDto::class.java,
        )

        assertTrue(decoded is InputConfigDto.AssignmentDto.Key)
        decoded as InputConfigDto.AssignmentDto.Key
        assertEquals(7, decoded.deviceId)
        assertEquals(96, decoded.keyCode)
    }

    @Test
    fun readsLegacyKeyAssignmentWithoutType() {
        val decoded = gson.fromJson(
            """{"deviceId":3,"keyCode":97}""",
            InputConfigDto.AssignmentDto::class.java,
        )

        assertTrue(decoded is InputConfigDto.AssignmentDto.Key)
        decoded as InputConfigDto.AssignmentDto.Key
        assertEquals(3, decoded.deviceId)
        assertEquals(97, decoded.keyCode)
    }

    @Test
    fun roundTripsAxisAssignment() {
        val original: InputConfigDto.AssignmentDto = InputConfigDto.AssignmentDto.Axis(
            deviceId = null,
            axisCode = 15,
            direction = InputConfig.Assignment.Axis.Direction.NEGATIVE,
        )

        val decoded = gson.fromJson(
            gson.toJson(original, InputConfigDto.AssignmentDto::class.java),
            InputConfigDto.AssignmentDto::class.java,
        )

        assertTrue(decoded is InputConfigDto.AssignmentDto.Axis)
        decoded as InputConfigDto.AssignmentDto.Axis
        assertEquals(null, decoded.deviceId)
        assertEquals(15, decoded.axisCode)
        assertEquals(InputConfig.Assignment.Axis.Direction.NEGATIVE, decoded.direction)
    }

    @Test
    fun readsNoneAssignment() {
        val decoded = gson.fromJson(
            """{"type":"none"}""",
            InputConfigDto.AssignmentDto::class.java,
        )

        assertTrue(decoded is InputConfigDto.AssignmentDto.None)
    }

    @Test
    fun readsControllerConfigurationInputMapperAsTypedInputConfigs() {
        val decoded = gson.fromJson(
            """
            {
              "inputMapper": [
                {
                  "input": "A",
                  "assignment": {"type":"key","deviceId":7,"keyCode":96},
                  "altAssignment": {"type":"none"}
                }
              ]
            }
            """.trimIndent(),
            ControllerConfigurationDto::class.java,
        )

        val controllerConfiguration = decoded.toControllerConfiguration()
        val inputConfig = controllerConfiguration.inputMapper.first { it.input == Input.A }

        assertEquals(InputConfig.Assignment.Key(deviceId = 7, keyCode = 96), inputConfig.assignment)
        assertEquals(InputConfig.Assignment.None, inputConfig.altAssignment)
    }

    @Test
    fun roundTripsControllerConfigurationWithCustomInputMapping() {
        val original = ControllerConfigurationDto.fromControllerConfiguration(
            ControllerConfiguration(
                listOf(
                    InputConfig(
                        input = Input.B,
                        assignment = InputConfig.Assignment.Axis(
                            deviceId = null,
                            axisCode = 15,
                            direction = InputConfig.Assignment.Axis.Direction.NEGATIVE,
                        ),
                    ),
                ),
            ),
        )

        val decoded = gson.fromJson(
            gson.toJson(original, ControllerConfigurationDto::class.java),
            ControllerConfigurationDto::class.java,
        )
        val inputConfig = decoded.toControllerConfiguration().inputMapper.first { it.input == Input.B }

        assertEquals(
            InputConfig.Assignment.Axis(
                deviceId = null,
                axisCode = 15,
                direction = InputConfig.Assignment.Axis.Direction.NEGATIVE,
            ),
            inputConfig.assignment,
        )
    }
}

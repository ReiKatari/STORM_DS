package me.magnum.melonds.impl.dtos.input

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.buildClassSerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonDecoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonEncoder
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.contentOrNull
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import me.magnum.melonds.domain.model.Input
import me.magnum.melonds.domain.model.InputConfig

@Serializable
data class InputConfigDto(
    @SerialName("input") val input: Input,
    @SerialName("assignment") val assignment: AssignmentDto,
    @SerialName("altAssignment") val altAssignment: AssignmentDto = AssignmentDto.None,
) {

    @Serializable(with = AssignmentDtoSerializer::class)
    sealed class AssignmentDto {
        @SerialName("deviceId") abstract val deviceId: Int?

        @Serializable
        @SerialName("none")
        data object None : AssignmentDto() {
            override val deviceId: Int? = null
        }

        @Serializable
        @SerialName("key")
        class Key(
            override val deviceId: Int?,
            @SerialName("keyCode") val keyCode: Int,
        ) : AssignmentDto()

        @Serializable
        @SerialName("axis")
        class Axis(
            override val deviceId: Int?,
            @SerialName("axisCode") val axisCode: Int,
            @SerialName("direction") val direction: InputConfig.Assignment.Axis.Direction,
        ) : AssignmentDto()
    }

    object AssignmentDtoSerializer : KSerializer<AssignmentDto> {
        override val descriptor: SerialDescriptor = buildClassSerialDescriptor("InputAssignmentDto")

        override fun serialize(encoder: Encoder, value: AssignmentDto) {
            val jsonEncoder = encoder as? JsonEncoder
                ?: throw SerializationException("InputAssignmentDto only supports JSON")
            jsonEncoder.encodeJsonElement(
                buildJsonObject {
                    when (value) {
                        is AssignmentDto.None -> {
                            put(TYPE_FIELD, JsonPrimitive(TYPE_NONE))
                        }
                        is AssignmentDto.Key -> {
                            put(TYPE_FIELD, JsonPrimitive(TYPE_KEY))
                            putNullableInt(DEVICE_ID_FIELD, value.deviceId)
                            put(KEY_CODE_FIELD, JsonPrimitive(value.keyCode))
                        }
                        is AssignmentDto.Axis -> {
                            put(TYPE_FIELD, JsonPrimitive(TYPE_AXIS))
                            putNullableInt(DEVICE_ID_FIELD, value.deviceId)
                            put(AXIS_CODE_FIELD, JsonPrimitive(value.axisCode))
                            put(DIRECTION_FIELD, JsonPrimitive(value.direction.name))
                        }
                    }
                }
            )
        }

        override fun deserialize(decoder: Decoder): AssignmentDto {
            val jsonDecoder = decoder as? JsonDecoder
                ?: throw SerializationException("InputAssignmentDto only supports JSON")
            val obj = jsonDecoder.decodeJsonElement().jsonObject

            return when (obj.assignmentType()) {
                TYPE_NONE -> AssignmentDto.None
                TYPE_KEY -> AssignmentDto.Key(
                    deviceId = obj.optionalInt(DEVICE_ID_FIELD),
                    keyCode = obj.requiredInt(KEY_CODE_FIELD),
                )
                TYPE_AXIS -> AssignmentDto.Axis(
                    deviceId = obj.optionalInt(DEVICE_ID_FIELD),
                    axisCode = obj.requiredInt(AXIS_CODE_FIELD),
                    direction = obj.requiredEnum(DIRECTION_FIELD),
                )
                else -> throw SerializationException("Unknown input assignment type")
            }
        }

        private fun JsonObject.assignmentType(): String {
            val explicitType = get(TYPE_FIELD)?.jsonPrimitive?.contentOrNull
            if (!explicitType.isNullOrBlank()) {
                return explicitType
            }

            return when {
                containsKey(KEY_CODE_FIELD) -> TYPE_KEY
                containsKey(AXIS_CODE_FIELD) -> TYPE_AXIS
                else -> TYPE_NONE
            }
        }

        private fun JsonObject.required(name: String): JsonElement {
            return get(name) ?: throw SerializationException("Missing input assignment field '$name'")
        }

        private fun JsonObject.requiredInt(name: String): Int {
            return required(name).jsonPrimitive.content.toIntOrNull()
                ?: throw SerializationException("Field '$name' must be an int")
        }

        private fun JsonObject.optionalInt(name: String): Int? {
            val value = get(name)
            return if (value == null || value is JsonNull) {
                null
            } else {
                value.jsonPrimitive.content.toIntOrNull()
                    ?: throw SerializationException("Field '$name' must be an int")
            }
        }

        private fun JsonObject.requiredEnum(name: String): InputConfig.Assignment.Axis.Direction {
            val value = required(name).jsonPrimitive.content
            return runCatching {
                InputConfig.Assignment.Axis.Direction.valueOf(value)
            }.getOrElse {
                throw SerializationException("Field '$name' has invalid direction '$value'")
            }
        }

        private fun kotlinx.serialization.json.JsonObjectBuilder.putNullableInt(name: String, value: Int?) {
            if (value == null) {
                put(name, JsonNull)
            } else {
                put(name, JsonPrimitive(value))
            }
        }

        private const val TYPE_FIELD = "type"
        private const val TYPE_NONE = "none"
        private const val TYPE_KEY = "key"
        private const val TYPE_AXIS = "axis"
        private const val DEVICE_ID_FIELD = "deviceId"
        private const val KEY_CODE_FIELD = "keyCode"
        private const val AXIS_CODE_FIELD = "axisCode"
        private const val DIRECTION_FIELD = "direction"
    }

    companion object {
        fun fromInputConfig(inputConfig: InputConfig): InputConfigDto {
            return InputConfigDto(
                input = inputConfig.input,
                assignment = when (inputConfig.assignment) {
                    is InputConfig.Assignment.None -> AssignmentDto.None
                    is InputConfig.Assignment.Key -> AssignmentDto.Key(inputConfig.assignment.deviceId, inputConfig.assignment.keyCode)
                    is InputConfig.Assignment.Axis -> AssignmentDto.Axis(inputConfig.assignment.deviceId, inputConfig.assignment.axisCode, inputConfig.assignment.direction)
                },
                altAssignment = when (inputConfig.altAssignment) {
                    is InputConfig.Assignment.None -> AssignmentDto.None
                    is InputConfig.Assignment.Key -> AssignmentDto.Key(inputConfig.altAssignment.deviceId, inputConfig.altAssignment.keyCode)
                    is InputConfig.Assignment.Axis -> AssignmentDto.Axis(inputConfig.altAssignment.deviceId, inputConfig.altAssignment.axisCode, inputConfig.altAssignment.direction)
                }
            )
        }
    }

    fun toInputConfig(): InputConfig {
        return InputConfig(
            input = input,
            assignment = when (assignment) {
                is AssignmentDto.None -> InputConfig.Assignment.None
                is AssignmentDto.Key -> InputConfig.Assignment.Key(assignment.deviceId, assignment.keyCode)
                is AssignmentDto.Axis -> InputConfig.Assignment.Axis(assignment.deviceId, assignment.axisCode, assignment.direction)
            },
            altAssignment = when (altAssignment) {
                is AssignmentDto.None -> InputConfig.Assignment.None
                is AssignmentDto.Key -> InputConfig.Assignment.Key(altAssignment.deviceId, altAssignment.keyCode)
                is AssignmentDto.Axis -> InputConfig.Assignment.Axis(altAssignment.deviceId, altAssignment.axisCode, altAssignment.direction)
            }
        )
    }
}

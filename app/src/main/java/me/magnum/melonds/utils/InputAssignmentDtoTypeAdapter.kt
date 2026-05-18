package me.magnum.melonds.utils

import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import com.google.gson.JsonNull
import com.google.gson.JsonObject
import com.google.gson.JsonParseException
import com.google.gson.JsonPrimitive
import com.google.gson.JsonSerializationContext
import com.google.gson.JsonSerializer
import me.magnum.melonds.domain.model.InputConfig
import me.magnum.melonds.impl.dtos.input.InputConfigDto
import java.lang.reflect.Type

class InputAssignmentDtoTypeAdapter : JsonSerializer<InputConfigDto.AssignmentDto>, JsonDeserializer<InputConfigDto.AssignmentDto> {
    override fun serialize(
        src: InputConfigDto.AssignmentDto,
        typeOfSrc: Type,
        context: JsonSerializationContext,
    ): JsonElement {
        return JsonObject().apply {
            when (src) {
                is InputConfigDto.AssignmentDto.None -> {
                    add(TYPE_FIELD, JsonPrimitive(TYPE_NONE))
                }
                is InputConfigDto.AssignmentDto.Key -> {
                    add(TYPE_FIELD, JsonPrimitive(TYPE_KEY))
                    addNullableInt(DEVICE_ID_FIELD, src.deviceId)
                    add(KEY_CODE_FIELD, JsonPrimitive(src.keyCode))
                }
                is InputConfigDto.AssignmentDto.Axis -> {
                    add(TYPE_FIELD, JsonPrimitive(TYPE_AXIS))
                    addNullableInt(DEVICE_ID_FIELD, src.deviceId)
                    add(AXIS_CODE_FIELD, JsonPrimitive(src.axisCode))
                    add(DIRECTION_FIELD, context.serialize(src.direction))
                }
            }
        }
    }

    override fun deserialize(
        json: JsonElement,
        typeOfT: Type,
        context: JsonDeserializationContext,
    ): InputConfigDto.AssignmentDto {
        val obj = json.asJsonObjectOrNull()
            ?: throw JsonParseException("Input assignment must be an object")

        return when (obj.assignmentType()) {
            TYPE_NONE -> InputConfigDto.AssignmentDto.None
            TYPE_KEY -> InputConfigDto.AssignmentDto.Key(
                deviceId = obj.optionalInt(DEVICE_ID_FIELD),
                keyCode = obj.requiredInt(KEY_CODE_FIELD),
            )
            TYPE_AXIS -> InputConfigDto.AssignmentDto.Axis(
                deviceId = obj.optionalInt(DEVICE_ID_FIELD),
                axisCode = obj.requiredInt(AXIS_CODE_FIELD),
                direction = context.deserialize(obj.required(DIRECTION_FIELD), InputConfig.Assignment.Axis.Direction::class.java),
            )
            else -> throw JsonParseException("Unknown input assignment type")
        }
    }

    private fun JsonObject.assignmentType(): String {
        val explicitType = get(TYPE_FIELD)?.asString
        if (!explicitType.isNullOrBlank()) {
            return explicitType
        }

        return when {
            has(KEY_CODE_FIELD) -> TYPE_KEY
            has(AXIS_CODE_FIELD) -> TYPE_AXIS
            else -> TYPE_NONE
        }
    }

    private fun JsonElement.asJsonObjectOrNull(): JsonObject? {
        return if (isJsonObject) asJsonObject else null
    }

    private fun JsonObject.required(name: String): JsonElement {
        return get(name) ?: throw JsonParseException("Missing input assignment field '$name'")
    }

    private fun JsonObject.requiredInt(name: String): Int {
        return required(name).asInt
    }

    private fun JsonObject.optionalInt(name: String): Int? {
        val value = get(name)
        return if (value == null || value.isJsonNull) null else value.asInt
    }

    private fun JsonObject.addNullableInt(name: String, value: Int?) {
        if (value == null) {
            add(name, JsonNull.INSTANCE)
        } else {
            add(name, JsonPrimitive(value))
        }
    }

    private companion object {
        const val TYPE_FIELD = "type"
        const val TYPE_NONE = "none"
        const val TYPE_KEY = "key"
        const val TYPE_AXIS = "axis"
        const val DEVICE_ID_FIELD = "deviceId"
        const val KEY_CODE_FIELD = "keyCode"
        const val AXIS_CODE_FIELD = "axisCode"
        const val DIRECTION_FIELD = "direction"
    }
}

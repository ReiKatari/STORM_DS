package me.magnum.melonds.utils

import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import com.google.gson.JsonObject
import com.google.gson.JsonParseException
import com.google.gson.JsonSerializationContext
import com.google.gson.JsonSerializer
import com.google.gson.reflect.TypeToken
import me.magnum.melonds.impl.dtos.input.ControllerConfigurationDto
import me.magnum.melonds.impl.dtos.input.InputConfigDto
import java.lang.reflect.Type

class ControllerConfigurationDtoTypeAdapter : JsonSerializer<ControllerConfigurationDto>, JsonDeserializer<ControllerConfigurationDto> {
    private val inputConfigListType = object : TypeToken<List<InputConfigDto>>() {}.type

    override fun serialize(
        src: ControllerConfigurationDto,
        typeOfSrc: Type,
        context: JsonSerializationContext,
    ): JsonElement {
        return JsonObject().apply {
            add(INPUT_MAPPER_FIELD, context.serialize(src.inputMapper, inputConfigListType))
            add(SLOT2_ANALOG_MAPPING_FIELD, context.serialize(src.slot2AnalogMapping, ControllerConfigurationDto.Slot2AnalogMappingDto::class.java))
        }
    }

    override fun deserialize(
        json: JsonElement,
        typeOfT: Type,
        context: JsonDeserializationContext,
    ): ControllerConfigurationDto {
        val obj = json.asJsonObjectOrNull()
            ?: throw JsonParseException("Controller configuration must be an object")
        val inputMapper = context.deserialize<List<InputConfigDto>>(
            obj.required(INPUT_MAPPER_FIELD),
            inputConfigListType,
        )
        val slot2AnalogMapping = obj.get(SLOT2_ANALOG_MAPPING_FIELD)
            ?.takeUnless { it.isJsonNull }
            ?.let { context.deserialize(it, ControllerConfigurationDto.Slot2AnalogMappingDto::class.java) }
            ?: ControllerConfigurationDto.Slot2AnalogMappingDto()

        return ControllerConfigurationDto(
            inputMapper = inputMapper,
            slot2AnalogMapping = slot2AnalogMapping,
        )
    }

    private fun JsonElement.asJsonObjectOrNull(): JsonObject? {
        return if (isJsonObject) asJsonObject else null
    }

    private fun JsonObject.required(name: String): JsonElement {
        return get(name) ?: throw JsonParseException("Missing controller configuration field '$name'")
    }

    private companion object {
        const val INPUT_MAPPER_FIELD = "inputMapper"
        const val SLOT2_ANALOG_MAPPING_FIELD = "slot2AnalogMapping"
    }
}

package me.magnum.melonds.impl.dtos.layout

import com.google.gson.annotations.SerializedName
import me.magnum.melonds.domain.model.layout.LayoutConfiguration
import me.magnum.melonds.utils.enumValueOfIgnoreCase
import java.util.UUID

data class LayoutConfigurationDto(
    @SerializedName("id")
    val id: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("type")
    val type: String,
    @SerializedName("orientation")
    val orientation: String,
    @SerializedName("useCustomOpacity")
    val useCustomOpacity: Boolean,
    @SerializedName("opacity")
    val opacity: Int,
    @SerializedName("layoutVariants")
    val layoutVariants: List<LayoutEntryDto>,
    @SerializedName("buttonSpread")
    val buttonSpread: Float? = null,
    @SerializedName("buttonInnerScale")
    val buttonInnerScale: Float? = null,
) {

    companion object {
        fun fromModel(layoutConfiguration: LayoutConfiguration): LayoutConfigurationDto {
            return LayoutConfigurationDto(
                layoutConfiguration.id?.toString(),
                layoutConfiguration.name,
                layoutConfiguration.type.name,
                layoutConfiguration.orientation.name,
                layoutConfiguration.useCustomOpacity,
                layoutConfiguration.opacity,
                layoutConfiguration.layoutVariants.map {
                    LayoutEntryDto(UILayoutVariantDto.fromModel(it.key), UILayoutDto.fromModel(it.value))
                },
                layoutConfiguration.buttonSpread,
                layoutConfiguration.buttonInnerScale,
            )
        }
    }

    fun toModel(): LayoutConfiguration {
        return LayoutConfiguration(
            id?.let { UUID.fromString(it) },
            name,
            enumValueOfIgnoreCase(type),
            enumValueOfIgnoreCase(orientation),
            useCustomOpacity,
            opacity,
            layoutVariants.associate {
                it.variant.toModel() to it.layout.toModel()
            },
            (buttonSpread ?: 1.0f).coerceIn(0.6f, 1.6f),
            (buttonInnerScale ?: 1.0f).coerceIn(0.6f, 1.4f),
        )
    }

    data class LayoutEntryDto(
        @SerializedName("variant")
        val variant: UILayoutVariantDto,
        @SerializedName("layout")
        val layout: UILayoutDto,
    )
}
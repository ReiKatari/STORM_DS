package me.magnum.melonds.parcelables

import android.os.Parcel
import android.os.Parcelable
import me.magnum.melonds.domain.model.VideoFiltering
import me.magnum.melonds.domain.model.VideoRenderer
import me.magnum.melonds.domain.model.rom.config.RomConfig
import me.magnum.melonds.domain.model.rom.config.RomInputMode
import me.magnum.melonds.domain.model.rom.config.RuntimeConsoleType
import me.magnum.melonds.domain.model.rom.config.RuntimeMicSource
import me.magnum.melonds.extensions.parcelable
import java.util.UUID

class RomConfigParcelable : Parcelable {
    val romConfig: RomConfig

    constructor(romConfig: RomConfig) {
        this.romConfig = romConfig
    }

    private constructor(parcel: Parcel) {
        romConfig = RomConfig(
            runtimeConsoleType = RuntimeConsoleType.entries[parcel.readInt()],
            runtimeMicSource = RuntimeMicSource.entries[parcel.readInt()],
            layoutId = parcel.readString()?.let { UUID.fromString(it) },
            gbaSlotConfig = parcel.parcelable<RomGbaSlotConfigParcelable>()!!.gbaSlotConfig,
            customName = parcel.readString(),
            useHgEngineFix = parcel.readByte().toInt() != 0,
            inputMode = RomInputMode.entries[parcel.readInt()],
            customControllerConfiguration = parcel.parcelable<ControllerConfigurationParcelable>()?.controllerConfiguration,
            videoRenderer = parcel.readNullableEnum(VideoRenderer.entries),
            threadedRendering = parcel.readNullableBoolean(),
            internalResolutionScaling = parcel.readNullableInt(),
            videoFiltering = parcel.readNullableEnum(VideoFiltering.entries),
            retroArchShaderPresetPath = parcel.readString(),
            retroArchShaderParameters = parcel.readString(),
        )
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeInt(romConfig.runtimeConsoleType.ordinal)
        dest.writeInt(romConfig.runtimeMicSource.ordinal)
        dest.writeString(romConfig.layoutId?.toString())
        dest.writeParcelable(RomGbaSlotConfigParcelable(romConfig.gbaSlotConfig), 0)
        dest.writeString(romConfig.customName)
        dest.writeByte((if (romConfig.useHgEngineFix) 1 else 0).toByte())
        dest.writeInt(romConfig.inputMode.ordinal)
        dest.writeParcelable(romConfig.customControllerConfiguration?.let { ControllerConfigurationParcelable(it) }, 0)
        dest.writeNullableEnum(romConfig.videoRenderer)
        dest.writeNullableBoolean(romConfig.threadedRendering)
        dest.writeNullableInt(romConfig.internalResolutionScaling)
        dest.writeNullableEnum(romConfig.videoFiltering)
        dest.writeString(romConfig.retroArchShaderPresetPath)
        dest.writeString(romConfig.retroArchShaderParameters)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<RomConfigParcelable> {
        override fun createFromParcel(parcel: Parcel): RomConfigParcelable {
            return RomConfigParcelable(parcel)
        }

        override fun newArray(size: Int): Array<RomConfigParcelable?> {
            return arrayOfNulls(size)
        }
    }
}

private fun <T : Enum<T>> Parcel.readNullableEnum(values: List<T>): T? {
    val ordinal = readInt()
    return if (ordinal >= 0) values[ordinal] else null
}

private fun Parcel.writeNullableEnum(value: Enum<*>?) {
    writeInt(value?.ordinal ?: -1)
}

private fun Parcel.readNullableBoolean(): Boolean? {
    return when (readInt()) {
        0 -> false
        1 -> true
        else -> null
    }
}

private fun Parcel.writeNullableBoolean(value: Boolean?) {
    writeInt(
        when (value) {
            false -> 0
            true -> 1
            null -> -1
        }
    )
}

private fun Parcel.readNullableInt(): Int? {
    val value = readInt()
    return if (value >= 0) value else null
}

private fun Parcel.writeNullableInt(value: Int?) {
    writeInt(value ?: -1)
}

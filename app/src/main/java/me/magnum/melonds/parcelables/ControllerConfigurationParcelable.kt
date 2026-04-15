package me.magnum.melonds.parcelables

import android.os.Parcel
import android.os.Parcelable
import me.magnum.melonds.domain.model.ControllerConfiguration
import me.magnum.melonds.domain.model.Slot2AnalogMapping
import me.magnum.melonds.extensions.parcelable

class ControllerConfigurationParcelable : Parcelable {
    val controllerConfiguration: ControllerConfiguration

    constructor(controllerConfiguration: ControllerConfiguration) {
        this.controllerConfiguration = controllerConfiguration
    }

    private constructor(parcel: Parcel) {
        val count = parcel.readInt()
        val inputConfigs = buildList(count) {
            repeat(count) {
                add(requireNotNull(parcel.parcelable<InputConfigParcelable>()).inputConfig)
            }
        }
        val slot2AnalogMapping = if (parcel.dataAvail() > 0) {
            val rawDeviceId = parcel.readInt()
            val axisXCode = parcel.readInt()
            val axisYCode = parcel.readInt()
            val invertX = parcel.readByte().toInt() != 0
            val invertY = parcel.readByte().toInt() != 0
            val deadzone = parcel.readFloat()
            val useDeviceFilter = if (parcel.dataAvail() > 0) {
                parcel.readByte().toInt() != 0
            } else {
                rawDeviceId != NO_DEVICE_ID
            }
            Slot2AnalogMapping(
                deviceId = rawDeviceId.takeIf { it != NO_DEVICE_ID },
                useDeviceFilter = useDeviceFilter,
                axisXCode = axisXCode,
                axisYCode = axisYCode,
                invertX = invertX,
                invertY = invertY,
                deadzone = deadzone,
            )
        } else {
            Slot2AnalogMapping()
        }
        controllerConfiguration = ControllerConfiguration(inputConfigs, slot2AnalogMapping)
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        val inputMapper = controllerConfiguration.inputMapper
        dest.writeInt(inputMapper.size)
        inputMapper.forEach {
            dest.writeParcelable(InputConfigParcelable(it), flags)
        }
        val mapping = controllerConfiguration.slot2AnalogMapping
        dest.writeInt(mapping.deviceId ?: NO_DEVICE_ID)
        dest.writeInt(mapping.axisXCode)
        dest.writeInt(mapping.axisYCode)
        dest.writeByte((if (mapping.invertX) 1 else 0).toByte())
        dest.writeByte((if (mapping.invertY) 1 else 0).toByte())
        dest.writeFloat(mapping.deadzone)
        dest.writeByte((if (mapping.useDeviceFilter) 1 else 0).toByte())
    }

    override fun describeContents(): Int = 0

    companion object CREATOR : Parcelable.Creator<ControllerConfigurationParcelable> {
        private const val NO_DEVICE_ID = Int.MIN_VALUE

        override fun createFromParcel(parcel: Parcel): ControllerConfigurationParcelable {
            return ControllerConfigurationParcelable(parcel)
        }

        override fun newArray(size: Int): Array<ControllerConfigurationParcelable?> {
            return arrayOfNulls(size)
        }
    }
}

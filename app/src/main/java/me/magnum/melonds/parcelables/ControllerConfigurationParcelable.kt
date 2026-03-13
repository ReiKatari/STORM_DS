package me.magnum.melonds.parcelables

import android.os.Parcel
import android.os.Parcelable
import me.magnum.melonds.domain.model.ControllerConfiguration
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
        controllerConfiguration = ControllerConfiguration(inputConfigs)
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        val inputMapper = controllerConfiguration.inputMapper
        dest.writeInt(inputMapper.size)
        inputMapper.forEach {
            dest.writeParcelable(InputConfigParcelable(it), flags)
        }
    }

    override fun describeContents(): Int = 0

    companion object CREATOR : Parcelable.Creator<ControllerConfigurationParcelable> {
        override fun createFromParcel(parcel: Parcel): ControllerConfigurationParcelable {
            return ControllerConfigurationParcelable(parcel)
        }

        override fun newArray(size: Int): Array<ControllerConfigurationParcelable?> {
            return arrayOfNulls(size)
        }
    }
}

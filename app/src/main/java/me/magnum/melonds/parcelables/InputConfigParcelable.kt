package me.magnum.melonds.parcelables

import android.os.Parcel
import android.os.Parcelable
import me.magnum.melonds.domain.model.Input
import me.magnum.melonds.domain.model.InputConfig

class InputConfigParcelable : Parcelable {
    val inputConfig: InputConfig

    constructor(inputConfig: InputConfig) {
        this.inputConfig = inputConfig
    }

    private constructor(parcel: Parcel) {
        inputConfig = InputConfig(
            input = Input.entries[parcel.readInt()],
            assignment = readAssignment(parcel),
            altAssignment = readAssignment(parcel),
        )
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeInt(inputConfig.input.ordinal)
        writeAssignment(dest, inputConfig.assignment)
        writeAssignment(dest, inputConfig.altAssignment)
    }

    override fun describeContents(): Int = 0

    companion object CREATOR : Parcelable.Creator<InputConfigParcelable> {
        private const val ASSIGNMENT_NONE = 0
        private const val ASSIGNMENT_KEY = 1
        private const val ASSIGNMENT_AXIS = 2

        override fun createFromParcel(parcel: Parcel): InputConfigParcelable {
            return InputConfigParcelable(parcel)
        }

        override fun newArray(size: Int): Array<InputConfigParcelable?> {
            return arrayOfNulls(size)
        }

        private fun readAssignment(parcel: Parcel): InputConfig.Assignment {
            return when (parcel.readInt()) {
                ASSIGNMENT_KEY -> {
                    val hasDeviceId = parcel.readInt() != 0
                    val deviceId = if (hasDeviceId) parcel.readInt() else null
                    val keyCode = parcel.readInt()
                    InputConfig.Assignment.Key(deviceId, keyCode)
                }

                ASSIGNMENT_AXIS -> {
                    val hasDeviceId = parcel.readInt() != 0
                    val deviceId = if (hasDeviceId) parcel.readInt() else null
                    val axisCode = parcel.readInt()
                    val direction = InputConfig.Assignment.Axis.Direction.entries[parcel.readInt()]
                    InputConfig.Assignment.Axis(deviceId, axisCode, direction)
                }

                else -> InputConfig.Assignment.None
            }
        }

        private fun writeAssignment(parcel: Parcel, assignment: InputConfig.Assignment) {
            when (assignment) {
                InputConfig.Assignment.None -> parcel.writeInt(ASSIGNMENT_NONE)
                is InputConfig.Assignment.Key -> {
                    parcel.writeInt(ASSIGNMENT_KEY)
                    parcel.writeInt(if (assignment.deviceId != null) 1 else 0)
                    assignment.deviceId?.let(parcel::writeInt)
                    parcel.writeInt(assignment.keyCode)
                }

                is InputConfig.Assignment.Axis -> {
                    parcel.writeInt(ASSIGNMENT_AXIS)
                    parcel.writeInt(if (assignment.deviceId != null) 1 else 0)
                    assignment.deviceId?.let(parcel::writeInt)
                    parcel.writeInt(assignment.axisCode)
                    parcel.writeInt(assignment.direction.ordinal)
                }
            }
        }
    }
}

package me.magnum.melonds.domain.model

data class Slot2AnalogMapping(
    val deviceId: Int? = null,
    val useDeviceFilter: Boolean = false,
    val axisXCode: Int = DEFAULT_AXIS_X_CODE,
    val axisYCode: Int = DEFAULT_AXIS_Y_CODE,
    val invertX: Boolean = false,
    val invertY: Boolean = false,
    val deadzone: Float = DEFAULT_DEADZONE,
) {
    fun normalizedDeadzone(): Float {
        return deadzone.coerceIn(0f, 1f)
    }

    fun effectiveDeviceId(): Int? {
        return if (useDeviceFilter) deviceId else null
    }

    companion object {
        const val DEFAULT_AXIS_X_CODE = 0
        const val DEFAULT_AXIS_Y_CODE = 1
        const val DEFAULT_DEADZONE = 0.1f
    }
}

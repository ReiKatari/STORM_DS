package me.magnum.melonds.domain.model

enum class FrameskipMode(val preferenceValue: String, val nativeValue: Int) {
    OFF("off", 0),
    MANUAL("manual", 1),
    AUTO("auto", 2);

    companion object {
        fun fromPreferenceValue(value: String?): FrameskipMode {
            return entries.firstOrNull { it.preferenceValue == value } ?: AUTO
        }
    }
}

data class FrameskipConfiguration(
    val mode: FrameskipMode,
    val manualValue: Int,
) {
    companion object {
        const val MANUAL_VALUE_MIN = 0
        const val MANUAL_VALUE_MAX = 4
        val DEFAULT = FrameskipConfiguration(FrameskipMode.AUTO, 1)
    }
}

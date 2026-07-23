package me.magnum.melonds.domain.model

import androidx.annotation.Keep

@Keep
enum class RetroArchShaderSource {
    INTERNAL,
    FOLDER;

    val preferenceValue: String get() = name.lowercase()

    companion object {
        fun fromPreference(value: String?): RetroArchShaderSource? {
            return entries.firstOrNull { it.preferenceValue.equals(value, ignoreCase = true) }
        }
    }
}

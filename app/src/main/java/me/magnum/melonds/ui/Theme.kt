package me.magnum.melonds.ui

import androidx.appcompat.app.AppCompatDelegate

enum class Theme(val nightMode: Int, val preferenceValue: String) {
    DARK(AppCompatDelegate.MODE_NIGHT_YES, "dark"),
    LIGHT(AppCompatDelegate.MODE_NIGHT_NO, "light"),
    MIDNIGHT(AppCompatDelegate.MODE_NIGHT_YES, "midnight"),
    CYBERPUNK(AppCompatDelegate.MODE_NIGHT_YES, "cyberpunk"),
    GOTHIC(AppCompatDelegate.MODE_NIGHT_YES, "gothic"),
    SYSTEM(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM, "system");

    companion object {
        fun fromPreference(value: String?): Theme {
            return entries.firstOrNull { it.preferenceValue == value } ?: DARK
        }
    }
}
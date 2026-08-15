package me.magnum.melonds.ui

import androidx.appcompat.app.AppCompatDelegate

enum class Theme(val nightMode: Int, val preferenceValue: String) {
    DARK(AppCompatDelegate.MODE_NIGHT_YES, "dark"),
    LIGHT(AppCompatDelegate.MODE_NIGHT_NO, "light"),
    MIDNIGHT(AppCompatDelegate.MODE_NIGHT_YES, "midnight"),
    CYBERPUNK(AppCompatDelegate.MODE_NIGHT_YES, "cyberpunk"),
    GOTHIC(AppCompatDelegate.MODE_NIGHT_YES, "gothic"),
    SYSTEM(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM, "system");

    fun getThemeResId(): Int {
        return when (this) {
            DARK -> me.magnum.melonds.R.style.AppTheme_Dark
            LIGHT -> me.magnum.melonds.R.style.AppTheme_Light
            MIDNIGHT -> me.magnum.melonds.R.style.AppTheme_Midnight
            CYBERPUNK -> me.magnum.melonds.R.style.AppTheme_Cyberpunk
            GOTHIC -> me.magnum.melonds.R.style.AppTheme_Gothic
            SYSTEM -> me.magnum.melonds.R.style.AppTheme_Dark
        }
    }

    companion object {
        fun fromPreference(value: String?): Theme {
            return entries.firstOrNull { it.preferenceValue == value } ?: DARK
        }
    }
}
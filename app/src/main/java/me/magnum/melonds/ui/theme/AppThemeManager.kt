package me.magnum.melonds.ui.theme

import android.content.Context
import android.content.SharedPreferences
import androidx.compose.runtime.mutableStateOf
import androidx.preference.PreferenceManager
import me.magnum.melonds.ui.Theme

object AppThemeManager {
    val themeState = mutableStateOf(Theme.DARK)
    val accentColorState = mutableStateOf("electric_cyan")
    val cardStyleState = mutableStateOf("glassmorphism")

    val currentTheme: Theme
        get() = themeState.value

    fun init(context: Context) {
        val prefs = PreferenceManager.getDefaultSharedPreferences(context)
        val themeKey = prefs.getString("theme", "dark") ?: "dark"
        themeState.value = Theme.fromPreference(themeKey)
        accentColorState.value = prefs.getString("theme_accent_color", "electric_cyan") ?: "electric_cyan"
        cardStyleState.value = prefs.getString("rom_card_style", "glassmorphism") ?: "glassmorphism"

        prefs.registerOnSharedPreferenceChangeListener { sp: SharedPreferences, key: String? ->
            if (key == "theme") {
                val newKey = sp.getString("theme", "dark") ?: "dark"
                themeState.value = Theme.fromPreference(newKey)
            } else if (key == "theme_accent_color") {
                accentColorState.value = sp.getString("theme_accent_color", "electric_cyan") ?: "electric_cyan"
            } else if (key == "rom_card_style") {
                cardStyleState.value = sp.getString("rom_card_style", "glassmorphism") ?: "glassmorphism"
            }
        }
    }

    fun updateTheme(context: Context, themeKey: String) {
        val theme = Theme.fromPreference(themeKey)
        themeState.value = theme
        val prefs = PreferenceManager.getDefaultSharedPreferences(context)
        prefs.edit().putString("theme", themeKey).apply()
    }
}

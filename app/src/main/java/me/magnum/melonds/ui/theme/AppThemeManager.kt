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

    private var prefChangeListener: SharedPreferences.OnSharedPreferenceChangeListener? = null

    val currentTheme: Theme
        get() = themeState.value

    fun init(context: Context) {
        val prefs = PreferenceManager.getDefaultSharedPreferences(context)
        val themeKey = prefs.getString("theme", "dark") ?: "dark"
        themeState.value = Theme.fromPreference(themeKey)
        accentColorState.value = prefs.getString("theme_accent_color", "electric_cyan") ?: "electric_cyan"
        cardStyleState.value = prefs.getString("rom_card_style", "glassmorphism") ?: "glassmorphism"

        val listener = SharedPreferences.OnSharedPreferenceChangeListener { sp: SharedPreferences, key: String? ->
            if (key == "theme") {
                val newKey = sp.getString("theme", "dark") ?: "dark"
                themeState.value = Theme.fromPreference(newKey)
            } else if (key == "theme_accent_color") {
                val newAccent = sp.getString("theme_accent_color", "electric_cyan") ?: "electric_cyan"
                accentColorState.value = newAccent
                accentChangeListeners.forEach { it.invoke(newAccent) }
            } else if (key == "rom_card_style") {
                cardStyleState.value = sp.getString("rom_card_style", "glassmorphism") ?: "glassmorphism"
            }
        }
        prefChangeListener = listener
        prefs.registerOnSharedPreferenceChangeListener(listener)
    }

    private val accentChangeListeners = mutableListOf<(String) -> Unit>()

    fun addAccentChangeListener(listener: (String) -> Unit) {
        accentChangeListeners.add(listener)
    }

    fun removeAccentChangeListener(listener: (String) -> Unit) {
        accentChangeListeners.remove(listener)
    }

    fun getAccentColor(accentKey: String = accentColorState.value): Int {
        return when (accentKey) {
            "electric_cyan" -> 0xFF00E5FF.toInt()
            "amber_gold", "plasma_amber" -> 0xFFFFB300.toInt()
            "cyber_red", "neon_magenta", "solar_flare" -> 0xFFFF3366.toInt()
            "emerald_jade", "acid_green", "matrix_emerald" -> 0xFF00E676.toInt()
            "royal_violet", "cyber_purple" -> 0xFF9C27B0.toInt()
            "deep_sapphire" -> 0xFF2979FF.toInt()
            else -> 0xFF00E5FF.toInt()
        }
    }

    fun updateTheme(context: Context, themeKey: String) {
        val theme = Theme.fromPreference(themeKey)
        themeState.value = theme
        val prefs = PreferenceManager.getDefaultSharedPreferences(context)
        prefs.edit().putString("theme", themeKey).apply()
    }
}

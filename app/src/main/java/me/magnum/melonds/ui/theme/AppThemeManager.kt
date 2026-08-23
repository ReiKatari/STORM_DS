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
            "neon_magenta" -> 0xFFFF007F.toInt()
            "plasma_amber" -> 0xFFFFB300.toInt()
            "acid_green" -> 0xFF00E676.toInt()
            "matrix_emerald" -> 0xFF00FF66.toInt()
            "cyber_purple" -> 0xFF7C4DFF.toInt()
            "solar_flare" -> 0xFFFF5722.toInt()
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

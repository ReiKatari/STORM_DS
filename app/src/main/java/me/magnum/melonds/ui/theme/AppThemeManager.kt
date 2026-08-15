package me.magnum.melonds.ui.theme

import android.content.Context
import android.content.SharedPreferences
import androidx.preference.PreferenceManager
import me.magnum.melonds.ui.Theme

object AppThemeManager {
    var currentTheme: Theme = Theme.DARK
        private set

    fun init(context: Context) {
        val prefs = PreferenceManager.getDefaultSharedPreferences(context)
        val themeKey = prefs.getString("theme", "dark") ?: "dark"
        currentTheme = Theme.fromPreference(themeKey)

        prefs.registerOnSharedPreferenceChangeListener { sp: SharedPreferences, key: String? ->
            if (key == "theme") {
                val newKey = sp.getString("theme", "dark") ?: "dark"
                currentTheme = Theme.fromPreference(newKey)
            }
        }
    }
}

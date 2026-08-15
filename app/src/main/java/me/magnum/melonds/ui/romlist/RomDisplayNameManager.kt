package me.magnum.melonds.ui.romlist

import android.content.Context
import android.content.SharedPreferences
import androidx.preference.PreferenceManager

object RomDisplayNameManager {
    var currentMode: String = "file_name"
        private set

    fun init(context: Context) {
        val prefs = PreferenceManager.getDefaultSharedPreferences(context)
        currentMode = prefs.getString("rom_display_name_mode", "file_name") ?: "file_name"

        prefs.registerOnSharedPreferenceChangeListener { sp: SharedPreferences, key: String? ->
            if (key == "rom_display_name_mode") {
                currentMode = sp.getString("rom_display_name_mode", "file_name") ?: "file_name"
            }
        }
    }
}

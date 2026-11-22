package me.magnum.melonds.ui.romlist

import android.content.Context
import android.content.SharedPreferences
import androidx.preference.PreferenceManager
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

object RomDisplayNameManager {
    private val _modeFlow = MutableStateFlow("file_name")
    val modeFlow: StateFlow<String> = _modeFlow.asStateFlow()

    val currentMode: String
        get() = _modeFlow.value

    private var preferenceListener: SharedPreferences.OnSharedPreferenceChangeListener? = null

    fun init(context: Context) {
        val prefs = PreferenceManager.getDefaultSharedPreferences(context)
        _modeFlow.value = prefs.getString("rom_display_name_mode", "file_name") ?: "file_name"

        preferenceListener?.let { prefs.unregisterOnSharedPreferenceChangeListener(it) }
        val listener = SharedPreferences.OnSharedPreferenceChangeListener { sp, key ->
            if (key == "rom_display_name_mode") {
                _modeFlow.value = sp.getString("rom_display_name_mode", "file_name") ?: "file_name"
            }
        }
        preferenceListener = listener
        prefs.registerOnSharedPreferenceChangeListener(listener)
    }
}

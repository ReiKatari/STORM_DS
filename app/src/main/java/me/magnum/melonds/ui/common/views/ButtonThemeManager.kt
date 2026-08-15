package me.magnum.melonds.ui.common.views

import android.content.Context
import android.content.SharedPreferences
import android.graphics.Color
import androidx.preference.PreferenceManager

enum class ButtonColorStyle {
    CYBER_CYAN,
    CLASSIC_WHITE,
    CLASSIC_GREY,
    SNES_SUPER
}

object ButtonThemeManager {
    var currentStyle: ButtonColorStyle = ButtonColorStyle.CYBER_CYAN
        private set

    fun init(context: Context) {
        val prefs = PreferenceManager.getDefaultSharedPreferences(context)
        val styleKey = prefs.getString("button_color_theme", "cyber_cyan") ?: "cyber_cyan"
        currentStyle = parseStyle(styleKey)

        prefs.registerOnSharedPreferenceChangeListener { sp: SharedPreferences, key: String? ->
            if (key == "button_color_theme") {
                val newKey = sp.getString("button_color_theme", "cyber_cyan") ?: "cyber_cyan"
                currentStyle = parseStyle(newKey)
            }
        }
    }

    private fun parseStyle(key: String): ButtonColorStyle {
        return when (key) {
            "classic_white" -> ButtonColorStyle.CLASSIC_WHITE
            "classic_grey" -> ButtonColorStyle.CLASSIC_GREY
            "snes_super" -> ButtonColorStyle.SNES_SUPER
            else -> ButtonColorStyle.CYBER_CYAN
        }
    }
}

package me.magnum.melonds.ui.common.views

import android.content.Context
import android.content.SharedPreferences
import androidx.preference.PreferenceManager

enum class ButtonColorStyle {
    CYBER_CYAN,
    CLASSIC_WHITE,
    CLASSIC_GREY,
    SNES_SUPER,
    CRIMSON_RUBY,
    MIDNIGHT_PURPLE,
    GOLD_LUXURY,
    EMERALD_MATRIX,
    WII_CRYSTAL,
    WII_U_DARK,
    SWITCH_NEON,
    SWITCH_OLED,
    VIRTUAL_BOY,
    GAMECUBE_INDIGO,
    GAMEBOY_DMG,
    GBA_GLACIER,
    FAMICOM_RETRO,
    NINTENDO_3DS_AQUA,
    STORM_ARCADE_RETRO,
    STORM_AURORA_SPECTRUM,
    STORM_CYBERPUNK_NEON,
    STORM_FROST_GLACIER,
    STORM_SAKURA_BLOSSOM,
    STORM_SOLAR_FUSION
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
            "crimson_ruby" -> ButtonColorStyle.CRIMSON_RUBY
            "midnight_purple" -> ButtonColorStyle.MIDNIGHT_PURPLE
            "gold_luxury" -> ButtonColorStyle.GOLD_LUXURY
            "emerald_matrix" -> ButtonColorStyle.EMERALD_MATRIX
            "wii_crystal" -> ButtonColorStyle.WII_CRYSTAL
            "wii_u_dark" -> ButtonColorStyle.WII_U_DARK
            "switch_neon" -> ButtonColorStyle.SWITCH_NEON
            "switch_oled" -> ButtonColorStyle.SWITCH_OLED
            "virtual_boy" -> ButtonColorStyle.VIRTUAL_BOY
            "gamecube_indigo" -> ButtonColorStyle.GAMECUBE_INDIGO
            "gameboy_dmg" -> ButtonColorStyle.GAMEBOY_DMG
            "gba_glacier" -> ButtonColorStyle.GBA_GLACIER
            "famicom_retro" -> ButtonColorStyle.FAMICOM_RETRO
            "3ds_aqua" -> ButtonColorStyle.NINTENDO_3DS_AQUA
            "arcade_retro" -> ButtonColorStyle.STORM_ARCADE_RETRO
            "aurora_spectrum" -> ButtonColorStyle.STORM_AURORA_SPECTRUM
            "cyberpunk_neon" -> ButtonColorStyle.STORM_CYBERPUNK_NEON
            "frost_glacier" -> ButtonColorStyle.STORM_FROST_GLACIER
            "sakura_blossom" -> ButtonColorStyle.STORM_SAKURA_BLOSSOM
            "solar_fusion" -> ButtonColorStyle.STORM_SOLAR_FUSION
            else -> ButtonColorStyle.CYBER_CYAN
        }
    }
}

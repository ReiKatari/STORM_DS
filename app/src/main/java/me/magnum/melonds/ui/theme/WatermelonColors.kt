package me.magnum.melonds.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

@Immutable
data class WatermelonColors(
    val isDark: Boolean,
    val bg: Color,
    val surface: Color,
    val surface2: Color,
    val surface3: Color,
    val line: Color,
    val text: Color,
    val text2: Color,
    val text3: Color,
    val red: Color,
    val redGlow: Color,
    val green: Color,
    val greenDim: Color,
    val switchOff: Color,
    val shadow: Color,
) {
    companion object {
        val gold = Color(0xFFD4A017)
        val favoriteStar = Color(0xFFFFD23F)
        val emulationBg = Color(0xFF000000)
        val tvBg = Color(0xFF000000)
    }
}

val DarkWatermelonColors = WatermelonColors(
    isDark = true,
    bg = Color(0xFF000000),
    surface = Color(0xFF0D0D10),
    surface2 = Color(0xFF16161C),
    surface3 = Color(0xFF252530),
    line = Color(0x1A00E5FF),
    text = Color(0xFFFFFFFF),
    text2 = Color(0xFFA5A5B5),
    text3 = Color(0xFF757585),
    red = Color(0xFFFF1744),
    redGlow = Color(0x59FF1744),
    green = Color(0xFF00E5FF),
    greenDim = Color(0x3300E5FF),
    switchOff = Color(0x29FFFFFF),
    shadow = Color(0x99000000),
)

val LightWatermelonColors = WatermelonColors(
    isDark = false,
    bg = Color(0xFFF3F4F8),
    surface = Color(0xFFFFFFFF),
    surface2 = Color(0xFFEAEFF5),
    surface3 = Color(0xFFD1D5DB),
    line = Color(0x14000000),
    text = Color(0xFF111827),
    text2 = Color(0xFF4B5563),
    text3 = Color(0xFF6B7280),
    red = Color(0xFFEF4444),
    redGlow = Color(0x47EF4444),
    green = Color(0xFF0066FF),
    greenDim = Color(0x220066FF),
    switchOff = Color(0x29000000),
    shadow = Color(0x1F000000),
)

val LocalWatermelonColors = staticCompositionLocalOf { DarkWatermelonColors }

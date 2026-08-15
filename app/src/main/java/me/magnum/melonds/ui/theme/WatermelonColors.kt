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
    bg = Color(0xFFF1F3F8),
    surface = Color(0xFFFFFFFF),
    surface2 = Color(0xFFE2E8F0),
    surface3 = Color(0xFFCBD5E1),
    line = Color(0x24000000),
    text = Color(0xFF0F172A),
    text2 = Color(0xFF334155),
    text3 = Color(0xFF64748B),
    red = Color(0xFFDC2626),
    redGlow = Color(0x47DC2626),
    green = Color(0xFF0284C7),
    greenDim = Color(0x220284C7),
    switchOff = Color(0x29000000),
    shadow = Color(0x1F000000),
)

val MidnightWatermelonColors = WatermelonColors(
    isDark = true,
    bg = Color(0xFF0B0814),
    surface = Color(0xFF140F24),
    surface2 = Color(0xFF1F1738),
    surface3 = Color(0xFF312557),
    line = Color(0x33C084FC),
    text = Color(0xFFFAF5FF),
    text2 = Color(0xFFE9D5FF),
    text3 = Color(0xFFA855F7),
    red = Color(0xFFF43F5E),
    redGlow = Color(0x59F43F5E),
    green = Color(0xFFC084FC),
    greenDim = Color(0x33C084FC),
    switchOff = Color(0x29FFFFFF),
    shadow = Color(0x99000000),
)

val CyberpunkWatermelonColors = WatermelonColors(
    isDark = true,
    bg = Color(0xFF07080D),
    surface = Color(0xFF0F121C),
    surface2 = Color(0xFF191E2E),
    surface3 = Color(0xFF283049),
    line = Color(0x40FCEE0A),
    text = Color(0xFFFCEE0A),
    text2 = Color(0xFF00F0FF),
    text3 = Color(0xFF909BB6),
    red = Color(0xFFFF003C),
    redGlow = Color(0x66FF003C),
    green = Color(0xFF00F0FF),
    greenDim = Color(0x3300F0FF),
    switchOff = Color(0x29FFFFFF),
    shadow = Color(0x99000000),
)

val GothicWatermelonColors = WatermelonColors(
    isDark = true,
    bg = Color(0xFF070708),
    surface = Color(0xFF111113),
    surface2 = Color(0xFF1B1B1F),
    surface3 = Color(0xFF2B2B31),
    line = Color(0x33E50914),
    text = Color(0xFFF5F5F7),
    text2 = Color(0xFFFF3344),
    text3 = Color(0xFF8F8F9B),
    red = Color(0xFFE50914),
    redGlow = Color(0x66E50914),
    green = Color(0xFFFF2A37),
    greenDim = Color(0x33FF2A37),
    switchOff = Color(0x29FFFFFF),
    shadow = Color(0x99000000),
)

val LocalWatermelonColors = staticCompositionLocalOf { DarkWatermelonColors }

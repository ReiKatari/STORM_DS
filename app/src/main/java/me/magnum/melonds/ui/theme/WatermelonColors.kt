package me.magnum.melonds.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import me.magnum.melonds.ui.Theme

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

// 1. STORM NIGHT - Deep OLED Black + Neon Cyan
val DarkWatermelonColors = WatermelonColors(
    isDark = true,
    bg = Color(0xFF05060A),
    surface = Color(0xFF0D1017),
    surface2 = Color(0xFF151A25),
    surface3 = Color(0xFF22293A),
    line = Color(0x3300E5FF),
    text = Color(0xFFF8FAFC),
    text2 = Color(0xFFA8B3C7),
    text3 = Color(0xFF6B778D),
    red = Color(0xFFFF2E55),
    redGlow = Color(0x59FF2E55),
    green = Color(0xFF00E5FF),
    greenDim = Color(0x2E00E5FF),
    switchOff = Color(0x2EFFFFFF),
    shadow = Color(0xA6000000),
)

// 2. STORM DAY - Clean Alabaster + Vivid Cobalt Blue
val LightWatermelonColors = WatermelonColors(
    isDark = false,
    bg = Color(0xFFF1F5FA),
    surface = Color(0xFFFFFFFF),
    surface2 = Color(0xFFE6ECF5),
    surface3 = Color(0xFFD3DFEE),
    line = Color(0x2E0284C7),
    text = Color(0xFF0F172A),
    text2 = Color(0xFF334155),
    text3 = Color(0xFF64748B),
    red = Color(0xFFDC2626),
    redGlow = Color(0x40DC2626),
    green = Color(0xFF0284C7),
    greenDim = Color(0x1F0284C7),
    switchOff = Color(0x2E0F172A),
    shadow = Color(0x240F172A),
)

// 3. STORM MIDNIGHT - Deep Amethyst Night + Luminous Violet
val MidnightWatermelonColors = WatermelonColors(
    isDark = true,
    bg = Color(0xFF0C0818),
    surface = Color(0xFF16102B),
    surface2 = Color(0xFF221942),
    surface3 = Color(0xFF332661),
    line = Color(0x47A855F7),
    text = Color(0xFFFAF5FF),
    text2 = Color(0xFFD8B4FE),
    text3 = Color(0xFF9F7AEA),
    red = Color(0xFFF43F5E),
    redGlow = Color(0x59F43F5E),
    green = Color(0xFFA855F7),
    greenDim = Color(0x33A855F7),
    switchOff = Color(0x2EE9D5FF),
    shadow = Color(0xA604020A),
)

// 4. STORM CYBERPUNK - Night-City Ultraviolet Obsidian + Neon Pink & Cyan
val CyberpunkWatermelonColors = WatermelonColors(
    isDark = true,
    bg = Color(0xFF090612),
    surface = Color(0xFF130E24),
    surface2 = Color(0xFF1E1638),
    surface3 = Color(0xFF2E2252),
    line = Color(0x52FF007F),
    text = Color(0xFFF8FAFC),
    text2 = Color(0xFF67E8F9),
    text3 = Color(0xFF9E8CC0),
    red = Color(0xFFFF1E56),
    redGlow = Color(0x66FF1E56),
    green = Color(0xFFFF007F),
    greenDim = Color(0x36FF007F),
    switchOff = Color(0x2EFFFFFF),
    shadow = Color(0xB3000000),
)

// 5. STORM GOTHIC - Obsidian Titanium + Imperial Crimson
val GothicWatermelonColors = WatermelonColors(
    isDark = true,
    bg = Color(0xFF080709),
    surface = Color(0xFF131115),
    surface2 = Color(0xFF1E1A20),
    surface3 = Color(0xFF2F2832),
    line = Color(0x4DE50914),
    text = Color(0xFFF6F2F3),
    text2 = Color(0xFFD4B6BC),
    text3 = Color(0xFF947D83),
    red = Color(0xFFE50914),
    redGlow = Color(0x66E50914),
    green = Color(0xFFFF2A37),
    greenDim = Color(0x36FF2A37),
    switchOff = Color(0x2EFFFFFF),
    shadow = Color(0xB3000000),
)

// 6. STORM MATRIX - Deep Cyber Emerald + Phosphor Matrix Green
val MatrixWatermelonColors = WatermelonColors(
    isDark = true,
    bg = Color(0xFF030A06),
    surface = Color(0xFF08170F),
    surface2 = Color(0xFF10281B),
    surface3 = Color(0xFF1A3F2B),
    line = Color(0x4D00FF66),
    text = Color(0xFFE6FFF0),
    text2 = Color(0xFF4ADE80),
    text3 = Color(0xFF10B981),
    red = Color(0xFFFF2A55),
    redGlow = Color(0x59FF2A55),
    green = Color(0xFF00FF66),
    greenDim = Color(0x3000FF66),
    switchOff = Color(0x2EBBF7D0),
    shadow = Color(0xB3000000),
)

// 7. STORM SOLAR - Warm Royal Obsidian + Radiant Plasma Gold
val SolarWatermelonColors = WatermelonColors(
    isDark = true,
    bg = Color(0xFF0E0904),
    surface = Color(0xFF1B1308),
    surface2 = Color(0xFF2B1E0D),
    surface3 = Color(0xFF422E15),
    line = Color(0x4DF59E0B),
    text = Color(0xFFFFFBEB),
    text2 = Color(0xFFFCD34D),
    text3 = Color(0xFFB89252),
    red = Color(0xFFFF3D00),
    redGlow = Color(0x66FF3D00),
    green = Color(0xFFF59E0B),
    greenDim = Color(0x33F59E0B),
    switchOff = Color(0x2EFFF8E1),
    shadow = Color(0xB3000000),
)

// 8. STORM SAKURA - Soft Blossom Ivory + Vivid Cherry Rose
val SakuraWatermelonColors = WatermelonColors(
    isDark = false,
    bg = Color(0xFFFFF5F8),
    surface = Color(0xFFFFFFFF),
    surface2 = Color(0xFFFCE7F3),
    surface3 = Color(0xFFFBCFE8),
    line = Color(0x3BE11D48),
    text = Color(0xFF2D121C),
    text2 = Color(0xFF7B2445),
    text3 = Color(0xFFA25270),
    red = Color(0xFFBE123C),
    redGlow = Color(0x38BE123C),
    green = Color(0xFFE11D48),
    greenDim = Color(0x24E11D48),
    switchOff = Color(0x2E2D121C),
    shadow = Color(0x1F881337),
)

fun baseWatermelonColorsFor(theme: Theme, isSystemDark: Boolean): WatermelonColors {
    return when (theme) {
        Theme.LIGHT -> LightWatermelonColors
        Theme.MIDNIGHT -> MidnightWatermelonColors
        Theme.CYBERPUNK -> CyberpunkWatermelonColors
        Theme.GOTHIC -> GothicWatermelonColors
        Theme.MATRIX -> MatrixWatermelonColors
        Theme.SOLAR -> SolarWatermelonColors
        Theme.SAKURA -> SakuraWatermelonColors
        Theme.DARK -> DarkWatermelonColors
        Theme.SYSTEM -> if (isSystemDark) DarkWatermelonColors else LightWatermelonColors
    }
}

fun resolveCustomAccentColor(accentKey: String, isDark: Boolean): Color? {
    if (accentKey.isBlank() || accentKey == "theme_default" || accentKey == "auto") {
        return null
    }
    return if (isDark) {
        when (accentKey) {
            "electric_cyan" -> Color(0xFF00E5FF)
            "matrix_emerald", "emerald_jade", "acid_green" -> Color(0xFF00E676)
            "amber_gold", "plasma_amber", "cyber_gold" -> Color(0xFFFBBF24)
            "cyber_red", "crimson_red" -> Color(0xFFFF2A55)
            "neon_magenta" -> Color(0xFFF50057)
            "royal_violet", "cyber_purple" -> Color(0xFFA855F7)
            "deep_sapphire", "electric_blue" -> Color(0xFF3B82F6)
            "solar_orange", "solar_flare" -> Color(0xFFFF6D00)
            "mint_frost", "ice_cyan" -> Color(0xFF00BFA5)
            "toxic_lime" -> Color(0xFFAEEA00)
            "hot_pink" -> Color(0xFFFF4081)
            "oled_white", "pure_white" -> Color(0xFFE2E8F0)
            else -> null
        }
    } else {
        when (accentKey) {
            "electric_cyan" -> Color(0xFF0284C7)
            "matrix_emerald", "emerald_jade", "acid_green" -> Color(0xFF047857)
            "amber_gold", "plasma_amber", "cyber_gold" -> Color(0xFFB45309)
            "cyber_red", "crimson_red" -> Color(0xFFDC2626)
            "neon_magenta" -> Color(0xFFC026D3)
            "royal_violet", "cyber_purple" -> Color(0xFF7C3AED)
            "deep_sapphire", "electric_blue" -> Color(0xFF1D4ED8)
            "solar_orange", "solar_flare" -> Color(0xFFC2410C)
            "mint_frost", "ice_cyan" -> Color(0xFF0F766E)
            "toxic_lime" -> Color(0xFF4D7C0F)
            "hot_pink" -> Color(0xFFDB2777)
            "oled_white", "pure_white" -> Color(0xFF334155)
            else -> null
        }
    }
}

fun getCustomizedAccentColors(base: WatermelonColors, accentKey: String): WatermelonColors {
    val accent = resolveCustomAccentColor(accentKey, base.isDark) ?: return base
    val accentDim = accent.copy(alpha = if (base.isDark) 0.22f else 0.14f)
    val accentLine = accent.copy(alpha = if (base.isDark) 0.30f else 0.24f)

    return base.copy(
        green = accent,
        greenDim = accentDim,
        line = accentLine,
    )
}

val LocalWatermelonColors = staticCompositionLocalOf { DarkWatermelonColors }

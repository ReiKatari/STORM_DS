package me.magnum.melonds.ui.emulator.skin

import android.content.SharedPreferences
import android.graphics.Paint
import android.graphics.Typeface
import androidx.compose.animation.core.*
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.ClipOp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.clipPath
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import androidx.preference.PreferenceManager
import me.magnum.melonds.domain.model.Rect
import me.magnum.melonds.ui.Theme
import me.magnum.melonds.ui.theme.AppThemeManager

enum class ConsoleSkinTheme {
    // Flagship STORM AURORA FLUID Series
    AURORA_AUTO_THEME,
    AURORA_MIDNIGHT,
    AURORA_CYBERPUNK,
    AURORA_IMPERIAL_GOLD,

    // Flagship Nintendo Switch Series
    SWITCH_NEON,
    SWITCH_OLED_WHITE,
    SWITCH_PRO_GRAY,
    SWITCH_LITE_TURQUOISE,

    // Upgraded Nintendo DS Lite Series
    DS_LITE_BLACK,
    DS_LITE_WHITE,
    DS_LITE_ICE_BLUE,
    DS_LITE_CORAL_PINK,
    CRIMSON_RED,

    // Upgraded Nintendo DSi XL Series
    DSI_XL_BLACK,
    DSI_XL_BURGUNDY,
    DSI_XL_BLUE,

    // Upgraded New Nintendo 3DS XL Series
    N3DS_BLACK,
    N3DS_GALAXY,
    N3DS_SNES,
    N3DS_HYRULE,
    N3DS_AQUA;

    companion object {
        fun fromKey(key: String?): ConsoleSkinTheme {
            return when (key?.lowercase()?.trim()) {
                "aurora_auto_theme" -> AURORA_AUTO_THEME
                "aurora_midnight" -> AURORA_MIDNIGHT
                "aurora_cyberpunk" -> AURORA_CYBERPUNK
                "aurora_imperial_gold" -> AURORA_IMPERIAL_GOLD
                "switch_neon" -> SWITCH_NEON
                "switch_oled_white" -> SWITCH_OLED_WHITE
                "switch_pro_gray" -> SWITCH_PRO_GRAY
                "switch_lite_turquoise" -> SWITCH_LITE_TURQUOISE
                "ds_lite_white" -> DS_LITE_WHITE
                "ds_lite_ice_blue" -> DS_LITE_ICE_BLUE
                "ds_lite_coral_pink" -> DS_LITE_CORAL_PINK
                "crimson_red" -> CRIMSON_RED
                "dsi_xl_black" -> DSI_XL_BLACK
                "dsi_xl_burgundy" -> DSI_XL_BURGUNDY
                "dsi_xl_blue" -> DSI_XL_BLUE
                "n3ds_galaxy" -> N3DS_GALAXY
                "n3ds_snes" -> N3DS_SNES
                "n3ds_hyrule" -> N3DS_HYRULE
                "n3ds_aqua" -> N3DS_AQUA
                "n3ds_black" -> N3DS_BLACK
                "ds_lite_black" -> DS_LITE_BLACK
                else -> AURORA_AUTO_THEME
            }
        }
    }
}

private data class ConsoleSkinPalette(
    val primaryBody: Color,
    val secondaryBody: Color,
    val bezelAccent: Color,
    val innerBevelDark: Color,
    val innerBevelLight: Color,
    val brandTitle: String,
    val isLightSkin: Boolean = false,
    val isSwitch: Boolean = false,
    val isAurora: Boolean = false,
    val leftBody: Color = primaryBody,
    val leftBodyShade: Color = secondaryBody,
    val rightBody: Color = primaryBody,
    val rightBodyShade: Color = secondaryBody,
    val accentGlow: Color = bezelAccent,
    val controlsColor: Color = if (isLightSkin) Color(0xFFCBD5E1) else Color(0xFF27272A),
    val controlsAccent: Color = if (isLightSkin) Color(0xFF334155) else Color(0xFFF8FAFC)
)

private fun resolveSkinPalette(
    theme: ConsoleSkinTheme,
    isAppDark: Boolean,
    themeAccentColor: Color
): ConsoleSkinPalette {
    return when (theme) {
        ConsoleSkinTheme.AURORA_AUTO_THEME -> {
            if (isAppDark) {
                ConsoleSkinPalette(
                    primaryBody = Color(0xFF0B0D17),
                    secondaryBody = Color(0xFF16192E),
                    bezelAccent = themeAccentColor,
                    innerBevelDark = Color(0xCC000000),
                    innerBevelLight = themeAccentColor.copy(alpha = 0.70f),
                    brandTitle = "STORM AURORA FLUID",
                    isLightSkin = false,
                    isAurora = true,
                    leftBody = Color(0xFF0B0D17),
                    leftBodyShade = Color(0xFF16192E),
                    rightBody = Color(0xFF0B0D17),
                    rightBodyShade = Color(0xFF16192E),
                    accentGlow = themeAccentColor,
                    controlsColor = Color(0xFF1E2438),
                    controlsAccent = Color(0xFFF8FAFC)
                )
            } else {
                ConsoleSkinPalette(
                    primaryBody = Color(0xFFF1F5F9),
                    secondaryBody = Color(0xFFE2E8F0),
                    bezelAccent = themeAccentColor,
                    innerBevelDark = Color(0x3364748B),
                    innerBevelLight = Color(0xEEFFFFFF),
                    brandTitle = "STORM AURORA FLUID",
                    isLightSkin = true,
                    isAurora = true,
                    leftBody = Color(0xFFF1F5F9),
                    leftBodyShade = Color(0xFFE2E8F0),
                    rightBody = Color(0xFFF1F5F9),
                    rightBodyShade = Color(0xFFE2E8F0),
                    accentGlow = themeAccentColor,
                    controlsColor = Color(0xFFE2E8F0),
                    controlsAccent = Color(0xFF1E293B)
                )
            }
        }
        ConsoleSkinTheme.AURORA_MIDNIGHT -> ConsoleSkinPalette(
            primaryBody = Color(0xFF0B091A),
            secondaryBody = Color(0xFF161230),
            bezelAccent = Color(0xFF00F0FF),
            innerBevelDark = Color(0xDD000000),
            innerBevelLight = Color(0x8800F0FF),
            brandTitle = "STORM AURORA FLUID",
            isAurora = true,
            leftBody = Color(0xFF0B091A),
            leftBodyShade = Color(0xFF161230),
            rightBody = Color(0xFF0B091A),
            rightBodyShade = Color(0xFF161230),
            accentGlow = Color(0xFFA855F7),
            controlsColor = Color(0xFF1E1638),
            controlsAccent = Color(0xFF00F0FF)
        )
        ConsoleSkinTheme.AURORA_CYBERPUNK -> ConsoleSkinPalette(
            primaryBody = Color(0xFF140B29),
            secondaryBody = Color(0xFF241242),
            bezelAccent = Color(0xFFFF007F),
            innerBevelDark = Color(0xDD000000),
            innerBevelLight = Color(0x88FF007F),
            brandTitle = "STORM AURORA FLUID",
            isAurora = true,
            leftBody = Color(0xFF140B29),
            leftBodyShade = Color(0xFF241242),
            rightBody = Color(0xFF140B29),
            rightBodyShade = Color(0xFF241242),
            accentGlow = Color(0xFF00F0FF),
            controlsColor = Color(0xFF2E134D),
            controlsAccent = Color(0xFFFF007F)
        )
        ConsoleSkinTheme.AURORA_IMPERIAL_GOLD -> ConsoleSkinPalette(
            primaryBody = Color(0xFF121318),
            secondaryBody = Color(0xFF1C1D24),
            bezelAccent = Color(0xFFD4AF37),
            innerBevelDark = Color(0xDD000000),
            innerBevelLight = Color(0x88F59E0B),
            brandTitle = "STORM AURORA FLUID",
            isAurora = true,
            leftBody = Color(0xFF121318),
            leftBodyShade = Color(0xFF1C1D24),
            rightBody = Color(0xFF121318),
            rightBodyShade = Color(0xFF1C1D24),
            accentGlow = Color(0xFFF59E0B),
            controlsColor = Color(0xFF262730),
            controlsAccent = Color(0xFFF59E0B)
        )
        ConsoleSkinTheme.SWITCH_NEON -> ConsoleSkinPalette(
            primaryBody = Color(0xFF18181B),
            secondaryBody = Color(0xFF27272A),
            bezelAccent = Color(0xFF27272A),
            innerBevelDark = Color(0xCC000000),
            innerBevelLight = Color(0x44FFFFFF),
            brandTitle = "Nintendo Switch",
            isSwitch = true,
            leftBody = Color(0xFF00C3E3),
            leftBodyShade = Color(0xFF009BB5),
            rightBody = Color(0xFFFF4554),
            rightBodyShade = Color(0xFFD92E3D),
            accentGlow = Color(0xFF00C3E3),
            controlsColor = Color(0xFF18181B),
            controlsAccent = Color(0xFFF8FAFC)
        )
        ConsoleSkinTheme.SWITCH_OLED_WHITE -> ConsoleSkinPalette(
            primaryBody = Color(0xFF09090B),
            secondaryBody = Color(0xFF18181B),
            bezelAccent = Color(0xFF1E293B),
            innerBevelDark = Color(0xEE000000),
            innerBevelLight = Color(0x55FFFFFF),
            brandTitle = "Nintendo Switch OLED",
            isSwitch = true,
            leftBody = Color(0xFFF8FAFC),
            leftBodyShade = Color(0xFFE2E8F0),
            rightBody = Color(0xFFF8FAFC),
            rightBodyShade = Color(0xFFE2E8F0),
            accentGlow = Color(0xFF00F0FF),
            controlsColor = Color(0xFF1E293B),
            controlsAccent = Color(0xFFF8FAFC)
        )
        ConsoleSkinTheme.SWITCH_PRO_GRAY -> ConsoleSkinPalette(
            primaryBody = Color(0xFF1E293B),
            secondaryBody = Color(0xFF0F172A),
            bezelAccent = Color(0xFF475569),
            innerBevelDark = Color(0xDD000000),
            innerBevelLight = Color(0x4494A3B8),
            brandTitle = "Nintendo Switch Pro",
            isSwitch = true,
            leftBody = Color(0xFF334155),
            leftBodyShade = Color(0xFF1E293B),
            rightBody = Color(0xFF475569),
            rightBodyShade = Color(0xFF334155),
            accentGlow = Color(0xFF38BDF8),
            controlsColor = Color(0xFF0F172A),
            controlsAccent = Color(0xFFE2E8F0)
        )
        ConsoleSkinTheme.SWITCH_LITE_TURQUOISE -> ConsoleSkinPalette(
            primaryBody = Color(0xFF0891B2),
            secondaryBody = Color(0xFF0E7490),
            bezelAccent = Color(0xFF06B6D4),
            innerBevelDark = Color(0xAA083344),
            innerBevelLight = Color(0x6667E8F9),
            brandTitle = "Nintendo Switch Lite",
            isSwitch = true,
            leftBody = Color(0xFF0891B2),
            leftBodyShade = Color(0xFF0E7490),
            rightBody = Color(0xFF0891B2),
            rightBodyShade = Color(0xFF0E7490),
            accentGlow = Color(0xFF67E8F9),
            controlsColor = Color(0xFFF8FAFC),
            controlsAccent = Color(0xFF0891B2)
        )
        ConsoleSkinTheme.DS_LITE_BLACK -> ConsoleSkinPalette(
            primaryBody = Color(0xFF18181B),
            secondaryBody = Color(0xFF27272A),
            bezelAccent = Color(0xFF3F3F46),
            innerBevelDark = Color(0xCC000000),
            innerBevelLight = Color(0x4471717A),
            brandTitle = "Nintendo DS Lite"
        )
        ConsoleSkinTheme.DS_LITE_WHITE -> ConsoleSkinPalette(
            primaryBody = Color(0xFFF8FAFC),
            secondaryBody = Color(0xFFE2E8F0),
            bezelAccent = Color(0xFF94A3B8),
            innerBevelDark = Color(0x4464748B),
            innerBevelLight = Color(0xDDFFFFFF),
            brandTitle = "Nintendo DS Lite",
            isLightSkin = true,
            controlsColor = Color(0xFFE2E8F0),
            controlsAccent = Color(0xFF334155)
        )
        ConsoleSkinTheme.DS_LITE_ICE_BLUE -> ConsoleSkinPalette(
            primaryBody = Color(0xFFBAE6FD),
            secondaryBody = Color(0xFF7DD3FC),
            bezelAccent = Color(0xFF38BDF8),
            innerBevelDark = Color(0x440369A1),
            innerBevelLight = Color(0xDDFFFFFF),
            brandTitle = "Nintendo DS Lite",
            isLightSkin = true,
            controlsColor = Color(0xFFE0F2FE),
            controlsAccent = Color(0xFF0369A1)
        )
        ConsoleSkinTheme.DS_LITE_CORAL_PINK -> ConsoleSkinPalette(
            primaryBody = Color(0xFFFBCFE8),
            secondaryBody = Color(0xFFF472B6),
            bezelAccent = Color(0xFFFB7185),
            innerBevelDark = Color(0x449D174D),
            innerBevelLight = Color(0xDDFFFFFF),
            brandTitle = "Nintendo DS Lite",
            isLightSkin = true,
            controlsColor = Color(0xFFFCE7F3),
            controlsAccent = Color(0xFF9D174D)
        )
        ConsoleSkinTheme.CRIMSON_RED -> ConsoleSkinPalette(
            primaryBody = Color(0xFF7F1D1D),
            secondaryBody = Color(0xFF991B1B),
            bezelAccent = Color(0xFFDC2626),
            innerBevelDark = Color(0xAA450A0A),
            innerBevelLight = Color(0x55FCA5A5),
            brandTitle = "Nintendo DS Lite Crimson"
        )
        ConsoleSkinTheme.DSI_XL_BLACK -> ConsoleSkinPalette(
            primaryBody = Color(0xFF1A1A1E),
            secondaryBody = Color(0xFF28282F),
            bezelAccent = Color(0xFF454552),
            innerBevelDark = Color(0xCC000000),
            innerBevelLight = Color(0x4471717A),
            brandTitle = "Nintendo DSi XL"
        )
        ConsoleSkinTheme.DSI_XL_BURGUNDY -> ConsoleSkinPalette(
            primaryBody = Color(0xFF581C28),
            secondaryBody = Color(0xFF782032),
            bezelAccent = Color(0xFF9F1239),
            innerBevelDark = Color(0xAA2B0A11),
            innerBevelLight = Color(0x55FDA4AF),
            brandTitle = "Nintendo DSi XL"
        )
        ConsoleSkinTheme.DSI_XL_BLUE -> ConsoleSkinPalette(
            primaryBody = Color(0xFF172554),
            secondaryBody = Color(0xFF1E3A8A),
            bezelAccent = Color(0xFF2563EB),
            innerBevelDark = Color(0xAA020617),
            innerBevelLight = Color(0x5560A5FA),
            brandTitle = "Nintendo DSi XL"
        )
        ConsoleSkinTheme.N3DS_BLACK -> ConsoleSkinPalette(
            primaryBody = Color(0xFF18181B),
            secondaryBody = Color(0xFF27272A),
            bezelAccent = Color(0xFF52525E),
            innerBevelDark = Color(0xCC000000),
            innerBevelLight = Color(0x44A1A1AA),
            brandTitle = "New Nintendo 3DS XL"
        )
        ConsoleSkinTheme.N3DS_GALAXY -> ConsoleSkinPalette(
            primaryBody = Color(0xFF3B0764),
            secondaryBody = Color(0xFF581C87),
            bezelAccent = Color(0xFF9333EA),
            innerBevelDark = Color(0xAA1E0338),
            innerBevelLight = Color(0x66C084FC),
            brandTitle = "New Nintendo 3DS XL Galaxy"
        )
        ConsoleSkinTheme.N3DS_SNES -> ConsoleSkinPalette(
            primaryBody = Color(0xFFD1D5DB),
            secondaryBody = Color(0xFF9CA3AF),
            bezelAccent = Color(0xFF6B7280),
            innerBevelDark = Color(0x44374151),
            innerBevelLight = Color(0xDDFFFFFF),
            brandTitle = "New Nintendo 3DS XL SNES",
            isLightSkin = true,
            controlsColor = Color(0xFFE5E7EB),
            controlsAccent = Color(0xFF1F2937)
        )
        ConsoleSkinTheme.N3DS_HYRULE -> ConsoleSkinPalette(
            primaryBody = Color(0xFFB45309),
            secondaryBody = Color(0xFFD97706),
            bezelAccent = Color(0xFFF59E0B),
            innerBevelDark = Color(0xAA451A03),
            innerBevelLight = Color(0x66FDE68A),
            brandTitle = "New Nintendo 3DS XL Hyrule"
        )
        ConsoleSkinTheme.N3DS_AQUA -> ConsoleSkinPalette(
            primaryBody = Color(0xFF0369A1),
            secondaryBody = Color(0xFF0284C7),
            bezelAccent = Color(0xFF0EA5E9),
            innerBevelDark = Color(0xAA082F49),
            innerBevelLight = Color(0x667DD3FC),
            brandTitle = "Nintendo 3DS"
        )
    }
}

@Composable
fun ConsoleSkinFullFrame(
    skinTheme: ConsoleSkinTheme = ConsoleSkinTheme.DS_LITE_BLACK,
    topScreenRect: Rect? = null,
    bottomScreenRect: Rect? = null,
    modifier: Modifier = Modifier,
) {
    val context = LocalContext.current
    val prefs = remember(context) { PreferenceManager.getDefaultSharedPreferences(context) }
    var activeSkinKey by remember {
        mutableStateOf(prefs.getString("video_console_skin_type", null))
    }

    DisposableEffect(prefs) {
        val listener = SharedPreferences.OnSharedPreferenceChangeListener { sp, key ->
            if (key == "video_console_skin_type") {
                activeSkinKey = sp.getString(key, null)
            }
        }
        prefs.registerOnSharedPreferenceChangeListener(listener)
        onDispose {
            prefs.unregisterOnSharedPreferenceChangeListener(listener)
        }
    }

    val activeTheme = remember(skinTheme, activeSkinKey) {
        if (activeSkinKey != null) {
            ConsoleSkinTheme.fromKey(activeSkinKey)
        } else {
            skinTheme
        }
    }

    val infiniteTransition = rememberInfiniteTransition(label = "skinLeds")
    val ledAlpha by infiniteTransition.animateFloat(
        initialValue = 0.72f, targetValue = 1.0f,
        animationSpec = infiniteRepeatable(tween(1200, easing = LinearEasing), RepeatMode.Reverse),
        label = "ledAlpha"
    )
    val wifiAlpha by infiniteTransition.animateFloat(
        initialValue = 0.25f, targetValue = 0.95f,
        animationSpec = infiniteRepeatable(tween(420, easing = LinearEasing), RepeatMode.Reverse),
        label = "wifiAlpha"
    )

    val currentAppTheme = AppThemeManager.themeState.value
    val isSystemDark = isSystemInDarkTheme()
    val isAppDark = when (currentAppTheme) {
        Theme.LIGHT -> false
        Theme.SAKURA -> false
        Theme.SYSTEM -> isSystemDark
        else -> true
    }
    val accentKey = AppThemeManager.accentColorState.value
    val themeAccentColor = when (accentKey) {
        "matrix_emerald" -> Color(0xFF00FF66)
        "amber_gold" -> Color(0xFFF59E0B)
        "cyber_red" -> Color(0xFFFF0055)
        "neon_magenta" -> Color(0xFFFF007F)
        "royal_violet" -> Color(0xFFA855F7)
        "deep_sapphire" -> Color(0xFF2563EB)
        "solar_orange" -> Color(0xFFF97316)
        "mint_frost" -> Color(0xFF2DD4BF)
        "toxic_lime" -> Color(0xFF84CC16)
        "hot_pink" -> Color(0xFFEC4899)
        "oled_white" -> Color(0xFFF8FAFC)
        else -> Color(0xFF00F0FF)
    }

    val palette = remember(activeTheme, isAppDark, themeAccentColor) {
        resolveSkinPalette(activeTheme, isAppDark, themeAccentColor)
    }

    val density = LocalDensity.current

    Canvas(modifier = modifier.fillMaxSize()) {
        val w = size.width
        val h = size.height

        val s1 = topScreenRect?.takeIf { it.width > 0 && it.height > 0 }
        val s2 = bottomScreenRect?.takeIf { it.width > 0 && it.height > 0 }

        if (s1 == null && s2 == null) return@Canvas

        // 1. Construct Screen Cutout Path for 100% Zero Pixel Occlusion Guarantee
        val screenCutoutPath = Path().apply {
            if (s1 != null) {
                addRect(androidx.compose.ui.geometry.Rect(
                    s1.x.toFloat(), s1.y.toFloat(), s1.right.toFloat(), s1.bottom.toFloat()
                ))
            }
            if (s2 != null) {
                addRect(androidx.compose.ui.geometry.Rect(
                    s2.x.toFloat(), s2.y.toFloat(), s2.right.toFloat(), s2.bottom.toFloat()
                ))
            }
        }

        // 2. Classify Layout Mode: Stacked (Vertical) vs Side-by-Side (Horizontal / Hybrid) vs Single
        val isDualScreen = s1 != null && s2 != null
        val isVertical = if (isDualScreen) {
            minOf(s1!!.bottom, s2!!.bottom) <= maxOf(s1.y, s2.y) + 24
        } else {
            w <= h
        }

        // 3. Draw All Chassis Elements Wrapped Inside ClipOp.Difference
        // That guarantees the 3D skin NEVER draws on top of game pixels!
        clipPath(screenCutoutPath, clipOp = ClipOp.Difference) {
            if (isDualScreen && !isVertical) {
                // Horizontal / Landscape & Hybrid Layout
                drawLandscapeLayout(
                    s1 = s1!!,
                    s2 = s2!!,
                    w = w,
                    h = h,
                    palette = palette,
                    ledAlpha = ledAlpha,
                    wifiAlpha = wifiAlpha,
                    density = density.density
                )
            } else if (isDualScreen && isVertical) {
                // Vertical / Portrait & Stacked Layout
                drawPortraitLayout(
                    s1 = s1!!,
                    s2 = s2!!,
                    w = w,
                    h = h,
                    palette = palette,
                    ledAlpha = ledAlpha,
                    wifiAlpha = wifiAlpha,
                    density = density.density
                )
            } else {
                // Single-Screen Clean Adaptive Layout
                val single = s1 ?: s2!!
                drawSingleScreenLayout(
                    single = single,
                    w = w,
                    h = h,
                    palette = palette,
                    ledAlpha = ledAlpha,
                    density = density.density
                )
            }

            // 4. Draw Individual 3D Screen Wells around each active screen
            if (s1 != null) {
                drawScreenWellBezel(s1, palette, density.density)
            }
            if (s2 != null) {
                drawScreenWellBezel(s2, palette, density.density)
            }
        }
    }
}

private fun DrawScope.drawLandscapeLayout(
    s1: Rect,
    s2: Rect,
    w: Float,
    h: Float,
    palette: ConsoleSkinPalette,
    ledAlpha: Float,
    wifiAlpha: Float,
    density: Float
) {
    val leftScreen = if (s1.x <= s2.x) s1 else s2
    val rightScreen = if (s1.x <= s2.x) s2 else s1

    val minScreenLeft = leftScreen.x.toFloat()
    val maxScreenRight = rightScreen.right.toFloat()
    val minScreenTop = minOf(leftScreen.y, rightScreen.y).toFloat()
    val maxScreenBottom = maxOf(leftScreen.bottom, rightScreen.bottom).toFloat()

    val d42dp = 42f * density
    val d8dp = 8f * density

    // --- Tablet / Main Chassis Background Base ---
    drawRect(
        brush = Brush.verticalGradient(
            colors = listOf(palette.secondaryBody, palette.primaryBody, palette.secondaryBody),
            startY = 0f, endY = h
        )
    )

    // --- Top Tablet Band ---
    if (minScreenTop > 0f) {
        drawRect(
            brush = Brush.verticalGradient(
                colors = listOf(palette.secondaryBody, palette.primaryBody),
                startY = 0f, endY = minScreenTop
            ),
            topLeft = Offset(0f, 0f),
            size = Size(w, minScreenTop)
        )
        // Top Cooling Vents & Exhaust fins
        if (minScreenTop >= 12f * density) {
            val ventY = minScreenTop * 0.40f
            val ventH = (4f * density).coerceAtMost(minScreenTop * 0.4f)
            val ventW = 3f * density
            val ventSpacing = 2.5f * density
            val ventCount = 14
            val ventTotalW = ventCount * ventW + (ventCount - 1) * ventSpacing
            val ventStartX = (w - ventTotalW) / 2f
            for (i in 0 until ventCount) {
                val vx = ventStartX + i * (ventW + ventSpacing)
                drawRoundRect(
                    color = Color.Black.copy(alpha = 0.85f),
                    topLeft = Offset(vx, ventY),
                    size = Size(ventW, ventH),
                    cornerRadius = CornerRadius(1.5f * density, 1.5f * density)
                )
            }
        }
        // Laser-etched Brand Title
        if (minScreenTop >= 18f * density) {
            drawBrandText(
                text = palette.brandTitle,
                centerX = w / 2f,
                centerY = minScreenTop * 0.78f,
                palette = palette,
                density = density
            )
        }
    }

    // --- Bottom Tablet Band ---
    if (maxScreenBottom < h) {
        val bottomBandH = h - maxScreenBottom
        drawRect(
            brush = Brush.verticalGradient(
                colors = listOf(palette.primaryBody, palette.secondaryBody),
                startY = maxScreenBottom, endY = h
            ),
            topLeft = Offset(0f, maxScreenBottom),
            size = Size(w, bottomBandH)
        )
        // USB-C port cutout & speaker grills
        if (bottomBandH >= 10f * density) {
            val portW = 20f * density
            val portH = 4.5f * density
            drawRoundRect(
                color = Color.Black.copy(alpha = 0.90f),
                topLeft = Offset((w - portW) / 2f, maxScreenBottom + (bottomBandH - portH) / 2f),
                size = Size(portW, portH),
                cornerRadius = CornerRadius(2.2f * density, 2.2f * density)
            )
        }
    }

    // --- Left Controller Wing (0f .. minScreenLeft) ---
    val leftWingWidth = minScreenLeft
    if (leftWingWidth >= d42dp) {
        // Full 3D Left Joy-Con or Ergonomic Aurora Left Grip
        drawRoundRect(
            brush = Brush.horizontalGradient(
                colors = listOf(palette.leftBody, palette.leftBodyShade),
                startX = 0f, endX = leftWingWidth
            ),
            topLeft = Offset(0f, 0f),
            size = Size(leftWingWidth, h),
            cornerRadius = CornerRadius(20f * density, 20f * density)
        )
        // Metallic rail seam shadow at wing boundary
        drawRect(
            brush = Brush.horizontalGradient(
                colors = listOf(Color.Transparent, Color.Black.copy(alpha = 0.70f)),
                startX = leftWingWidth - 4f * density, endX = leftWingWidth
            ),
            topLeft = Offset(leftWingWidth - 4f * density, 0f),
            size = Size(4f * density, h)
        )
        val leftCenterX = leftWingWidth * 0.50f

        // Minus (-) Button at top
        val minusY = h * 0.20f
        drawRoundRect(
            color = palette.controlsColor,
            topLeft = Offset(leftCenterX - 6f * density, minusY - 2f * density),
            size = Size(12f * density, 4f * density),
            cornerRadius = CornerRadius(2f * density, 2f * density)
        )

        // Left Analog Thumbstick with 3D concave shading
        val stickY = h * 0.38f
        val stickR = (18f * density).coerceAtMost(leftWingWidth * 0.36f)
        drawCircle(
            brush = Brush.radialGradient(
                colors = listOf(palette.controlsColor.copy(alpha = 0.5f), Color.Black.copy(alpha = 0.85f)),
                center = Offset(leftCenterX, stickY),
                radius = stickR
            ),
            radius = stickR,
            center = Offset(leftCenterX, stickY)
        )
        drawCircle(
            color = palette.accentGlow.copy(alpha = 0.60f),
            radius = stickR,
            center = Offset(leftCenterX, stickY),
            style = Stroke(width = 1.5f * density)
        )
        drawCircle(
            color = palette.controlsColor,
            radius = stickR * 0.62f,
            center = Offset(leftCenterX, stickY)
        )
        // 4 Directional bumps on thumbstick
        val bumpOffset = stickR * 0.40f
        val bumpR = 1.5f * density
        drawCircle(palette.controlsAccent, bumpR, Offset(leftCenterX, stickY - bumpOffset))
        drawCircle(palette.controlsAccent, bumpR, Offset(leftCenterX, stickY + bumpOffset))
        drawCircle(palette.controlsAccent, bumpR, Offset(leftCenterX - bumpOffset, stickY))
        drawCircle(palette.controlsAccent, bumpR, Offset(leftCenterX + bumpOffset, stickY))

        // Directional Buttons (Switch 4-circle D-pad)
        val dpadY = h * 0.64f
        val dpadSpacing = (12f * density).coerceAtMost(leftWingWidth * 0.24f)
        val btnR = 5f * density
        drawCircle(palette.controlsColor, btnR, Offset(leftCenterX, dpadY - dpadSpacing))
        drawCircle(palette.controlsColor, btnR, Offset(leftCenterX, dpadY + dpadSpacing))
        drawCircle(palette.controlsColor, btnR, Offset(leftCenterX - dpadSpacing, dpadY))
        drawCircle(palette.controlsColor, btnR, Offset(leftCenterX + dpadSpacing, dpadY))

        // Square Capture Button near bottom
        val capY = h * 0.82f
        drawRoundRect(
            color = palette.controlsColor,
            topLeft = Offset(leftCenterX - 5f * density, capY - 5f * density),
            size = Size(10f * density, 10f * density),
            cornerRadius = CornerRadius(2.5f * density, 2.5f * density)
        )

        // Laser-perforated speaker dots
        drawSpeakerDotArray(
            centerX = leftCenterX,
            centerY = h * 0.92f,
            density = density,
            palette = palette
        )
    } else if (leftWingWidth >= d8dp) {
        // Sleek slim Joy-Con / Aurora side rail accent strip
        drawRect(
            brush = Brush.horizontalGradient(
                colors = listOf(palette.leftBody, palette.leftBodyShade),
                startX = 0f, endX = leftWingWidth
            ),
            topLeft = Offset(0f, 0f),
            size = Size(leftWingWidth, h)
        )
        // 4 miniature LED rail indicators
        val railLedR = 1.8f * density
        val ledSpacing = 8f * density
        val ledStartY = h * 0.50f - 1.5f * ledSpacing
        for (i in 0 until 4) {
            val ly = ledStartY + i * ledSpacing
            drawCircle(
                color = if (i == 0) palette.accentGlow.copy(alpha = ledAlpha) else palette.controlsColor,
                radius = railLedR,
                center = Offset(leftWingWidth * 0.5f, ly)
            )
        }
    }

    // --- Right Controller Wing (maxScreenRight .. w) ---
    val rightWingWidth = w - maxScreenRight
    if (rightWingWidth >= d42dp) {
        // Full 3D Right Joy-Con or Ergonomic Aurora Right Grip
        drawRoundRect(
            brush = Brush.horizontalGradient(
                colors = listOf(palette.rightBodyShade, palette.rightBody),
                startX = maxScreenRight, endX = w
            ),
            topLeft = Offset(maxScreenRight, 0f),
            size = Size(rightWingWidth, h),
            cornerRadius = CornerRadius(20f * density, 20f * density)
        )
        // Metallic rail seam shadow
        drawRect(
            brush = Brush.horizontalGradient(
                colors = listOf(Color.Black.copy(alpha = 0.70f), Color.Transparent),
                startX = maxScreenRight, endX = maxScreenRight + 4f * density
            ),
            topLeft = Offset(maxScreenRight, 0f),
            size = Size(4f * density, h)
        )
        val rightCenterX = maxScreenRight + rightWingWidth * 0.50f

        // Plus (+) Button at top
        val plusY = h * 0.20f
        drawRoundRect(
            color = palette.controlsColor,
            topLeft = Offset(rightCenterX - 6f * density, plusY - 2f * density),
            size = Size(12f * density, 4f * density),
            cornerRadius = CornerRadius(2f * density, 2f * density)
        )
        drawRoundRect(
            color = palette.controlsColor,
            topLeft = Offset(rightCenterX - 2f * density, plusY - 6f * density),
            size = Size(4f * density, 12f * density),
            cornerRadius = CornerRadius(2f * density, 2f * density)
        )

        // 4 ABXY Action Buttons in diamond layout
        val abxyY = h * 0.38f
        val abxySpacing = (12f * density).coerceAtMost(rightWingWidth * 0.24f)
        val btnR = 5f * density
        // X (top), B (bottom), Y (left), A (right)
        val snesColors = palette.brandTitle.contains("SNES", ignoreCase = true)
        val xColor = if (snesColors) Color(0xFF3B82F6) else palette.controlsColor
        val aColor = if (snesColors) Color(0xFFEF4444) else palette.controlsColor
        val bColor = if (snesColors) Color(0xFFF59E0B) else palette.controlsColor
        val yColor = if (snesColors) Color(0xFF10B981) else palette.controlsColor

        drawCircle(xColor, btnR, Offset(rightCenterX, abxyY - abxySpacing))
        drawCircle(bColor, btnR, Offset(rightCenterX, abxyY + abxySpacing))
        drawCircle(yColor, btnR, Offset(rightCenterX - abxySpacing, abxyY))
        drawCircle(aColor, btnR, Offset(rightCenterX + abxySpacing, abxyY))

        // Right Analog Thumbstick (lower placement in Switch ergonomics)
        val rightStickY = h * 0.64f
        val stickR = (18f * density).coerceAtMost(rightWingWidth * 0.36f)
        drawCircle(
            brush = Brush.radialGradient(
                colors = listOf(palette.controlsColor.copy(alpha = 0.5f), Color.Black.copy(alpha = 0.85f)),
                center = Offset(rightCenterX, rightStickY),
                radius = stickR
            ),
            radius = stickR,
            center = Offset(rightCenterX, rightStickY)
        )
        drawCircle(
            color = palette.accentGlow.copy(alpha = 0.60f),
            radius = stickR,
            center = Offset(rightCenterX, rightStickY),
            style = Stroke(width = 1.5f * density)
        )
        drawCircle(
            color = palette.controlsColor,
            radius = stickR * 0.62f,
            center = Offset(rightCenterX, rightStickY)
        )

        // Ringed Home Button near bottom
        val homeY = h * 0.82f
        drawCircle(
            color = palette.accentGlow.copy(alpha = ledAlpha),
            radius = 6.5f * density,
            center = Offset(rightCenterX, homeY),
            style = Stroke(width = 1.5f * density)
        )
        drawCircle(
            color = palette.controlsColor,
            radius = 5f * density,
            center = Offset(rightCenterX, homeY)
        )

        // Laser-perforated speaker dots
        drawSpeakerDotArray(
            centerX = rightCenterX,
            centerY = h * 0.92f,
            density = density,
            palette = palette
        )
    } else if (rightWingWidth >= d8dp) {
        // Sleek slim side rail accent strip
        drawRect(
            brush = Brush.horizontalGradient(
                colors = listOf(palette.rightBodyShade, palette.rightBody),
                startX = maxScreenRight, endX = w
            ),
            topLeft = Offset(maxScreenRight, 0f),
            size = Size(rightWingWidth, h)
        )
        val railLedR = 1.8f * density
        val ledSpacing = 8f * density
        val ledStartY = h * 0.50f - 1.5f * ledSpacing
        for (i in 0 until 4) {
            val ly = ledStartY + i * ledSpacing
            drawCircle(
                color = if (i == 0) palette.accentGlow.copy(alpha = ledAlpha) else palette.controlsColor,
                radius = railLedR,
                center = Offset(maxScreenRight + rightWingWidth * 0.5f, ly)
            )
        }
    }

    // --- Central Bridge / Divider Between Screens ---
    val horizontalGap = rightScreen.x - leftScreen.right
    if (horizontalGap >= 6f * density) {
        val bridgeX = leftScreen.right.toFloat()
        val bridgeW = horizontalGap.toFloat()
        drawRect(
            brush = Brush.horizontalGradient(
                colors = listOf(
                    palette.secondaryBody,
                    palette.primaryBody,
                    palette.secondaryBody
                ),
                startX = bridgeX, endX = bridgeX + bridgeW
            ),
            topLeft = Offset(bridgeX, minScreenTop),
            size = Size(bridgeW, maxScreenBottom - minScreenTop)
        )
        // Center dividing seam line
        drawLine(
            color = Color.Black.copy(alpha = 0.75f),
            start = Offset(bridgeX + bridgeW / 2f, minScreenTop),
            end = Offset(bridgeX + bridgeW / 2f, maxScreenBottom),
            strokeWidth = 1.5f * density
        )
    }

    // --- Hybrid & Uneven Screen Height Void Compensation ---
    // If Left and Right screens have different tops or bottoms, fill the surrounding deck
    if (leftScreen.y > 0) {
        drawChassisDeckPanel(
            left = leftScreen.x.toFloat(),
            top = 0f,
            width = leftScreen.width.toFloat(),
            height = leftScreen.y.toFloat(),
            palette = palette,
            density = density
        )
    }
    if (leftScreen.bottom < h) {
        drawChassisDeckPanel(
            left = leftScreen.x.toFloat(),
            top = leftScreen.bottom.toFloat(),
            width = leftScreen.width.toFloat(),
            height = h - leftScreen.bottom,
            palette = palette,
            density = density
        )
    }
    if (rightScreen.y > 0) {
        drawChassisDeckPanel(
            left = rightScreen.x.toFloat(),
            top = 0f,
            width = rightScreen.width.toFloat(),
            height = rightScreen.y.toFloat(),
            palette = palette,
            density = density
        )
    }
    if (rightScreen.bottom < h) {
        drawChassisDeckPanel(
            left = rightScreen.x.toFloat(),
            top = rightScreen.bottom.toFloat(),
            width = rightScreen.width.toFloat(),
            height = h - rightScreen.bottom,
            palette = palette,
            density = density
        )
    }
}

private fun DrawScope.drawPortraitLayout(
    s1: Rect,
    s2: Rect,
    w: Float,
    h: Float,
    palette: ConsoleSkinPalette,
    ledAlpha: Float,
    wifiAlpha: Float,
    density: Float
) {
    val upperScreen = if (s1.y <= s2.y) s1 else s2
    val lowerScreen = if (s1.y <= s2.y) s2 else s1

    val verticalGap = lowerScreen.y - upperScreen.bottom

    // 1. Overall Handheld Chassis Background
    drawRect(
        brush = Brush.verticalGradient(
            colors = listOf(palette.secondaryBody, palette.primaryBody, palette.secondaryBody),
            startY = 0f, endY = h
        )
    )

    // 2. Top Lid Accents (Above and around upperScreen)
    val upperTop = upperScreen.y.toFloat()
    if (upperTop >= 16f * density) {
        // Inner Camera Lens centered above upper screen
        val camY = upperTop * 0.45f
        drawCircle(
            color = Color.Black.copy(alpha = 0.90f),
            radius = 3.5f * density,
            center = Offset(w / 2f, camY)
        )
        drawCircle(
            color = Color(0xFF00D2FF).copy(alpha = 0.65f),
            radius = 1.5f * density,
            center = Offset(w / 2f - 0.8f * density, camY - 0.8f * density)
        )

        // Brand Title
        if (upperTop >= 22f * density) {
            drawBrandText(
                text = palette.brandTitle,
                centerX = w / 2f,
                centerY = upperTop * 0.80f,
                palette = palette,
                density = density
            )
        }
    }

    // Stereo Speaker Grilles beside upperScreen
    val upperH = upperScreen.height.toFloat()
    val speakerCenterY = upperScreen.y + upperH / 2f
    if (upperScreen.x >= 20f * density) {
        drawSpeakerDotArray(
            centerX = upperScreen.x / 2f,
            centerY = speakerCenterY,
            density = density,
            palette = palette
        )
    }
    val rightMargin = w - upperScreen.right
    if (rightMargin >= 20f * density) {
        drawSpeakerDotArray(
            centerX = upperScreen.right + rightMargin / 2f,
            centerY = speakerCenterY,
            density = density,
            palette = palette
        )
    }

    // 3. 3D Cylindrical Hinge Barrel spanning the gap between screens
    if (verticalGap >= 6f * density) {
        val hingeY = upperScreen.bottom.toFloat()
        val hingeH = verticalGap.toFloat()
        // Cylindrical 3D lighting gradient
        drawRect(
            brush = Brush.verticalGradient(
                colors = listOf(
                    Color.White.copy(alpha = 0.30f),
                    palette.primaryBody,
                    palette.secondaryBody,
                    Color.Black.copy(alpha = 0.65f)
                ),
                startY = hingeY, endY = hingeY + hingeH
            ),
            topLeft = Offset(0f, hingeY),
            size = Size(w, hingeH)
        )

        // Hinge End Pivot Rings / Knuckles
        val knuckleW = 14f * density
        drawRect(
            color = palette.bezelAccent.copy(alpha = 0.65f),
            topLeft = Offset(0f, hingeY),
            size = Size(knuckleW, hingeH)
        )
        drawRect(
            color = palette.bezelAccent.copy(alpha = 0.65f),
            topLeft = Offset(w - knuckleW, hingeY),
            size = Size(knuckleW, hingeH)
        )

        // Centered MIC Pinhole and lettering
        val micCenterX = w / 2f
        val micCenterY = hingeY + hingeH / 2f
        drawCircle(
            color = Color.Black.copy(alpha = 0.85f),
            radius = 2f * density,
            center = Offset(micCenterX, micCenterY)
        )
        if (hingeH >= 12f * density) {
            drawContext.canvas.nativeCanvas.drawText(
                "MIC",
                micCenterX,
                micCenterY + 5f * density,
                Paint().apply {
                    isAntiAlias = true
                    textSize = 6.5f * density
                    textAlign = Paint.Align.CENTER
                    typeface = Typeface.create(Typeface.DEFAULT, Typeface.BOLD)
                    color = if (palette.isLightSkin) Color(0xFF64748B).toArgb() else Color(0xFF94A3B8).toArgb()
                }
            )
        }

        // Status LEDs on the right side of hinge
        val ledY = micCenterY
        val ledSpacing = 8f * density
        val ledStartX = w - knuckleW - 24f * density
        // Power LED (Blue/Green pulsing)
        drawCircle(
            color = Color(0xFF00FF66).copy(alpha = ledAlpha),
            radius = 1.8f * density,
            center = Offset(ledStartX, ledY)
        )
        // Battery LED
        drawCircle(
            color = Color(0xFFF59E0B).copy(alpha = 0.85f),
            radius = 1.8f * density,
            center = Offset(ledStartX + ledSpacing, ledY)
        )
        // Wireless LED
        drawCircle(
            color = Color(0xFF38BDF8).copy(alpha = wifiAlpha),
            radius = 1.8f * density,
            center = Offset(ledStartX + 2 * ledSpacing, ledY)
        )
    }

    // 4. Bottom Deck Accents (Below and around lowerScreen)
    val lowerBottom = lowerScreen.bottom.toFloat()
    if (lowerBottom < h) {
        val deckH = h - lowerBottom
        val startSelectY = lowerBottom + (deckH * 0.40f)
        if (deckH >= 20f * density) {
            val btnW = 16f * density
            val btnH = 5.5f * density
            val spacing = 24f * density
            // SELECT Pill Button
            val selectX = w / 2f - spacing - btnW
            drawRoundRect(
                color = palette.controlsColor,
                topLeft = Offset(selectX, startSelectY),
                size = Size(btnW, btnH),
                cornerRadius = CornerRadius(2.75f * density, 2.75f * density)
            )
            drawContext.canvas.nativeCanvas.drawText(
                "SELECT",
                selectX + btnW / 2f,
                startSelectY + btnH + 6f * density,
                Paint().apply {
                    isAntiAlias = true
                    textSize = 6.5f * density
                    textAlign = Paint.Align.CENTER
                    typeface = Typeface.create(Typeface.DEFAULT, Typeface.BOLD)
                    color = if (palette.isLightSkin) Color(0xFF475569).toArgb() else Color(0xFFA1A1AA).toArgb()
                }
            )

            // START Pill Button
            val startX = w / 2f + spacing
            drawRoundRect(
                color = palette.controlsColor,
                topLeft = Offset(startX, startSelectY),
                size = Size(btnW, btnH),
                cornerRadius = CornerRadius(2.75f * density, 2.75f * density)
            )
            drawContext.canvas.nativeCanvas.drawText(
                "START",
                startX + btnW / 2f,
                startSelectY + btnH + 6f * density,
                Paint().apply {
                    isAntiAlias = true
                    textSize = 6.5f * density
                    textAlign = Paint.Align.CENTER
                    typeface = Typeface.create(Typeface.DEFAULT, Typeface.BOLD)
                    color = if (palette.isLightSkin) Color(0xFF475569).toArgb() else Color(0xFFA1A1AA).toArgb()
                }
            )
        }

        // Lower Lip Seam (Cartridge slot dust cover)
        drawLine(
            color = Color.Black.copy(alpha = 0.55f),
            start = Offset(w * 0.15f, h - 3f * density),
            end = Offset(w * 0.85f, h - 3f * density),
            strokeWidth = 1.5f * density
        )
    }
}

private fun DrawScope.drawSingleScreenLayout(
    single: Rect,
    w: Float,
    h: Float,
    palette: ConsoleSkinPalette,
    ledAlpha: Float,
    density: Float
) {
    drawRect(
        brush = Brush.verticalGradient(
            colors = listOf(palette.secondaryBody, palette.primaryBody, palette.secondaryBody),
            startY = 0f, endY = h
        )
    )

    if (single.y >= 20f * density) {
        drawBrandText(
            text = palette.brandTitle,
            centerX = w / 2f,
            centerY = single.y * 0.65f,
            palette = palette,
            density = density
        )
    }
}

private fun DrawScope.drawScreenWellBezel(
    screen: Rect,
    palette: ConsoleSkinPalette,
    density: Float
) {
    val x = screen.x.toFloat()
    val y = screen.y.toFloat()
    val sw = screen.width.toFloat()
    val sh = screen.height.toFloat()

    val bezelW = 4f * density
    val specularW = 1.5f * density

    // Outer beveled frame around screen boundary
    drawRect(
        color = palette.bezelAccent.copy(alpha = 0.85f),
        topLeft = Offset(x - bezelW, y - bezelW),
        size = Size(sw + 2 * bezelW, sh + 2 * bezelW),
        style = Stroke(width = bezelW)
    )

    // Top & Left recessed dark shadow
    drawRect(
        color = palette.innerBevelDark,
        topLeft = Offset(x - bezelW, y - bezelW),
        size = Size(sw + 2 * bezelW, bezelW)
    )
    drawRect(
        color = palette.innerBevelDark,
        topLeft = Offset(x - bezelW, y - bezelW),
        size = Size(bezelW, sh + 2 * bezelW)
    )

    // Bottom & Right specular light bevel
    drawRect(
        color = palette.innerBevelLight,
        topLeft = Offset(x - bezelW, y + sh),
        size = Size(sw + 2 * bezelW, bezelW)
    )
    drawRect(
        color = palette.innerBevelLight,
        topLeft = Offset(x + sw, y - bezelW),
        size = Size(bezelW, sh + 2 * bezelW)
    )

    // Inner Specular Aurora / Metallic Rim immediately meeting the cutout
    if (palette.isAurora) {
        drawRect(
            brush = Brush.linearGradient(
                colors = listOf(Color(0xFF00F0FF), Color(0xFFA855F7), Color(0xFFFF007F)),
                start = Offset(x - specularW, y - specularW),
                end = Offset(x + sw + specularW, y + sh + specularW)
            ),
            topLeft = Offset(x - specularW, y - specularW),
            size = Size(sw + 2 * specularW, sh + 2 * specularW),
            style = Stroke(width = specularW)
        )
    }
}

private fun DrawScope.drawChassisDeckPanel(
    left: Float,
    top: Float,
    width: Float,
    height: Float,
    palette: ConsoleSkinPalette,
    density: Float
) {
    if (width <= 0f || height <= 0f) return
    drawRect(
        brush = Brush.verticalGradient(
            colors = listOf(palette.secondaryBody, palette.primaryBody),
            startY = top, endY = top + height
        ),
        topLeft = Offset(left, top),
        size = Size(width, height)
    )
    if (height >= 18f * density && width >= 40f * density) {
        drawSpeakerDotArray(
            centerX = left + width / 2f,
            centerY = top + height / 2f,
            density = density,
            palette = palette
        )
    }
}

private fun DrawScope.drawSpeakerDotArray(
    centerX: Float,
    centerY: Float,
    density: Float,
    palette: ConsoleSkinPalette
) {
    val dotR = 1.6f * density
    val spacing = 4.5f * density
    val dotColor = Color.Black.copy(alpha = 0.85f)
    val rimColor = if (palette.isLightSkin) Color(0xFF94A3B8) else Color(0xFF52525B)

    for (row in -1..1) {
        for (col in -1..1) {
            val dx = centerX + col * spacing
            val dy = centerY + row * spacing
            drawCircle(dotColor, dotR, Offset(dx, dy))
            drawCircle(rimColor, dotR, Offset(dx, dy), style = Stroke(0.5f * density))
        }
    }
}

private fun DrawScope.drawBrandText(
    text: String,
    centerX: Float,
    centerY: Float,
    palette: ConsoleSkinPalette,
    density: Float
) {
    drawIntoCanvas { canvas ->
        val paint = Paint().apply {
            isAntiAlias = true
            textSize = 10.5f * density
            textAlign = Paint.Align.CENTER
            typeface = Typeface.create(Typeface.DEFAULT, Typeface.BOLD)
            letterSpacing = 0.08f
            color = if (palette.isLightSkin) {
                Color(0xFF334155).toArgb()
            } else {
                Color(0xFFE2E8F0).toArgb()
            }
        }
        canvas.nativeCanvas.drawText(text, centerX, centerY, paint)
    }
}

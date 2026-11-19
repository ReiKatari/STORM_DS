package me.magnum.melonds.ui.emulator.skin

import android.content.SharedPreferences
import android.graphics.Paint
import android.graphics.Typeface
import androidx.compose.animation.core.*
import androidx.compose.foundation.Canvas
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
import androidx.compose.ui.graphics.luminance
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.preference.PreferenceManager
import me.magnum.melonds.domain.model.Rect
import me.magnum.melonds.ui.theme.AppThemeManager
import me.magnum.melonds.ui.theme.WatermelonColors

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
    SWITCH_TOTK_OLED,

    // Upgraded Nintendo DS Lite Series
    DS_LITE_BLACK,
    DS_LITE_WHITE,
    DS_LITE_SILVER,
    DS_LITE_ICE_BLUE,
    DS_LITE_CORAL_PINK,
    CRIMSON_RED,

    // Upgraded Nintendo DSi XL Series
    DSI_XL_BLACK,
    DSI_WHITE,
    DSI_XL_BURGUNDY,
    DSI_XL_BLUE,

    // Upgraded New Nintendo 3DS XL Series
    N3DS_BLACK,
    N3DS_GALAXY,
    N3DS_SNES,
    N3DS_HYRULE,
    N3DS_MAJORAS_MASK,
    N3DS_PIKACHU,
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
                "switch_totk_oled" -> SWITCH_TOTK_OLED
                "ds_lite_white" -> DS_LITE_WHITE
                "ds_lite_silver" -> DS_LITE_SILVER
                "ds_lite_ice_blue" -> DS_LITE_ICE_BLUE
                "ds_lite_coral_pink" -> DS_LITE_CORAL_PINK
                "crimson_red" -> CRIMSON_RED
                "dsi_xl_black" -> DSI_XL_BLACK
                "dsi_white" -> DSI_WHITE
                "dsi_xl_burgundy" -> DSI_XL_BURGUNDY
                "dsi_xl_blue" -> DSI_XL_BLUE
                "n3ds_galaxy" -> N3DS_GALAXY
                "n3ds_snes" -> N3DS_SNES
                "n3ds_hyrule" -> N3DS_HYRULE
                "n3ds_majoras_mask" -> N3DS_MAJORAS_MASK
                "n3ds_pikachu" -> N3DS_PIKACHU
                "n3ds_aqua" -> N3DS_AQUA
                "n3ds_black" -> N3DS_BLACK
                "ds_lite_black" -> DS_LITE_BLACK
                else -> AURORA_AUTO_THEME
            }
        }
    }
}

private enum class ConsoleSkinFamily {
    AURORA,
    SWITCH,
    DS_LITE,
    DSI_XL,
    N3DS
}

private data class ConsoleSkinPalette(
    val primaryBody: Color,
    val secondaryBody: Color,
    val bezelAccent: Color,
    val innerBevelDark: Color,
    val innerBevelLight: Color,
    val brandTitle: String,
    val family: ConsoleSkinFamily,
    val isLightSkin: Boolean = false,
    val leftBody: Color = primaryBody,
    val leftBodyShade: Color = secondaryBody,
    val rightBody: Color = primaryBody,
    val rightBodyShade: Color = secondaryBody,
    val accentGlow: Color = bezelAccent,
    val brandTextColor: Color = if (isLightSkin) Color(0xFF334155) else Color(0xFFE2E8F0),
    val hingeShadow: Color = if (isLightSkin) Color(0x55475569) else Color(0xCC000000),
    val railAccentLeft: Color = leftBody,
    val railAccentRight: Color = rightBody,
    val hasPortraitSideRail: Boolean = false,
    val screenRimColor: Color = Color(0xFF0A0B0E),
    val controlsColor: Color = if (isLightSkin) Color(0xFFCBD5E1) else Color(0xFF27272A)
)

private fun resolveSkinPalette(
    theme: ConsoleSkinTheme,
    appColors: WatermelonColors
): ConsoleSkinPalette {
    return when (theme) {
        ConsoleSkinTheme.AURORA_AUTO_THEME -> {
            val isLight = appColors.bg.luminance() > 0.5f
            ConsoleSkinPalette(
                primaryBody = appColors.bg,
                secondaryBody = appColors.surface,
                bezelAccent = appColors.line,
                innerBevelDark = if (isLight) Color(0x3364748B) else Color(0xCC000000),
                innerBevelLight = if (isLight) Color(0xDDFFFFFF) else appColors.green.copy(alpha = 0.55f),
                brandTitle = "STORM AURORA FLUID",
                family = ConsoleSkinFamily.AURORA,
                isLightSkin = isLight,
                leftBody = appColors.surface,
                leftBodyShade = appColors.bg,
                rightBody = appColors.surface,
                rightBodyShade = appColors.bg,
                accentGlow = appColors.green,
                brandTextColor = if (isLight) appColors.text.copy(alpha = 0.82f) else appColors.text.copy(alpha = 0.90f),
                hingeShadow = if (isLight) Color(0x3364748B) else Color(0xCC000000),
                screenRimColor = if (isLight) appColors.line else Color(0xFF090B10),
                controlsColor = appColors.surface2
            )
        }
        ConsoleSkinTheme.AURORA_MIDNIGHT -> ConsoleSkinPalette(
            primaryBody = Color(0xFF0B091A),
            secondaryBody = Color(0xFF161230),
            bezelAccent = Color(0xFF5B3EA8),
            innerBevelDark = Color(0xDD000000),
            innerBevelLight = Color(0x7700F0FF),
            brandTitle = "STORM AURORA FLUID",
            family = ConsoleSkinFamily.AURORA,
            leftBody = Color(0xFF110D26),
            leftBodyShade = Color(0xFF1A1438),
            rightBody = Color(0xFF110D26),
            rightBodyShade = Color(0xFF1A1438),
            accentGlow = Color(0xFFA855F7),
            brandTextColor = Color(0xFFE0E7FF),
            controlsColor = Color(0xFF1E1638)
        )
        ConsoleSkinTheme.AURORA_CYBERPUNK -> ConsoleSkinPalette(
            primaryBody = Color(0xFF130A26),
            secondaryBody = Color(0xFF21113E),
            bezelAccent = Color(0xFFD90368),
            innerBevelDark = Color(0xDD000000),
            innerBevelLight = Color(0x77FF2A8A),
            brandTitle = "STORM AURORA FLUID",
            family = ConsoleSkinFamily.AURORA,
            leftBody = Color(0xFF1A0E33),
            leftBodyShade = Color(0xFF28154C),
            rightBody = Color(0xFF1A0E33),
            rightBodyShade = Color(0xFF28154C),
            accentGlow = Color(0xFFFF007F),
            brandTextColor = Color(0xFFFCE7F3),
            controlsColor = Color(0xFF2E134D)
        )
        ConsoleSkinTheme.AURORA_IMPERIAL_GOLD -> ConsoleSkinPalette(
            primaryBody = Color(0xFF111217),
            secondaryBody = Color(0xFF1B1C24),
            bezelAccent = Color(0xFFB8942E),
            innerBevelDark = Color(0xDD000000),
            innerBevelLight = Color(0x77F5C754),
            brandTitle = "STORM AURORA FLUID",
            family = ConsoleSkinFamily.AURORA,
            leftBody = Color(0xFF16171E),
            leftBodyShade = Color(0xFF22232D),
            rightBody = Color(0xFF16171E),
            rightBodyShade = Color(0xFF22232D),
            accentGlow = Color(0xFFD4AF37),
            brandTextColor = Color(0xFFFEF3C7),
            controlsColor = Color(0xFF262730)
        )
        ConsoleSkinTheme.SWITCH_NEON -> ConsoleSkinPalette(
            primaryBody = Color(0xFF1B1E26),
            secondaryBody = Color(0xFF282D38),
            bezelAccent = Color(0xFF424A5C),
            innerBevelDark = Color(0xCC000000),
            innerBevelLight = Color(0x66FFFFFF),
            brandTitle = "Nintendo Switch",
            family = ConsoleSkinFamily.SWITCH,
            leftBody = Color(0xFF00C2F3),
            leftBodyShade = Color(0xFF0092B8),
            rightBody = Color(0xFFFF4054),
            rightBodyShade = Color(0xFFD62839),
            accentGlow = Color(0xFF00C3E3),
            brandTextColor = Color(0xFFF1F5F9),
            railAccentLeft = Color(0xFF00D2FF),
            railAccentRight = Color(0xFFFF4D62),
            hasPortraitSideRail = true,
            screenRimColor = Color(0xFF090A0D),
            controlsColor = Color(0xFF1C1E24)
        )
        ConsoleSkinTheme.SWITCH_OLED_WHITE -> ConsoleSkinPalette(
            primaryBody = Color(0xFF181B22),
            secondaryBody = Color(0xFF252A34),
            bezelAccent = Color(0xFF475569),
            innerBevelDark = Color(0xDD000000),
            innerBevelLight = Color(0x88F8FAFC),
            brandTitle = "Nintendo Switch OLED",
            family = ConsoleSkinFamily.SWITCH,
            leftBody = Color(0xFFF4F7FA),
            leftBodyShade = Color(0xFFDCE3EC),
            rightBody = Color(0xFFF4F7FA),
            rightBodyShade = Color(0xFFDCE3EC),
            accentGlow = Color(0xFFE2E8F0),
            brandTextColor = Color(0xFFF8FAFC),
            railAccentLeft = Color(0xFFFFFFFF),
            railAccentRight = Color(0xFFFFFFFF),
            hasPortraitSideRail = true,
            screenRimColor = Color(0xFF050507),
            controlsColor = Color(0xFF1C1F26)
        )
        ConsoleSkinTheme.SWITCH_PRO_GRAY -> ConsoleSkinPalette(
            primaryBody = Color(0xFF232730),
            secondaryBody = Color(0xFF333946),
            bezelAccent = Color(0xFF566074),
            innerBevelDark = Color(0xDD000000),
            innerBevelLight = Color(0x66CBD5E1),
            brandTitle = "Nintendo Switch Pro",
            family = ConsoleSkinFamily.SWITCH,
            leftBody = Color(0xFF4B5262),
            leftBodyShade = Color(0xFF353B47),
            rightBody = Color(0xFF4B5262),
            rightBodyShade = Color(0xFF353B47),
            accentGlow = Color(0xFF94A3B8),
            brandTextColor = Color(0xFFF1F5F9),
            railAccentLeft = Color(0xFF94A3B8),
            railAccentRight = Color(0xFF94A3B8),
            hasPortraitSideRail = true,
            screenRimColor = Color(0xFF0B0C0F),
            controlsColor = Color(0xFF14161A)
        )
        ConsoleSkinTheme.SWITCH_LITE_TURQUOISE -> ConsoleSkinPalette(
            primaryBody = Color(0xFF0F9E99),
            secondaryBody = Color(0xFF0B7D79),
            bezelAccent = Color(0xFF14B8B2),
            innerBevelDark = Color(0x88063836),
            innerBevelLight = Color(0x66A7F3D0),
            brandTitle = "Nintendo Switch Lite",
            family = ConsoleSkinFamily.SWITCH,
            leftBody = Color(0xFF12B2AC),
            leftBodyShade = Color(0xFF0D8F8A),
            rightBody = Color(0xFF12B2AC),
            rightBodyShade = Color(0xFF0D8F8A),
            accentGlow = Color(0xFFF8FAFC),
            brandTextColor = Color(0xFFF8FAFC),
            railAccentLeft = Color(0xFF5EEAD4),
            railAccentRight = Color(0xFF5EEAD4),
            hasPortraitSideRail = false,
            screenRimColor = Color(0xFF111318),
            controlsColor = Color(0xFFF8FAFC)
        )
        ConsoleSkinTheme.DS_LITE_BLACK -> ConsoleSkinPalette(
            primaryBody = Color(0xFF1F222A),
            secondaryBody = Color(0xFF2E333E),
            bezelAccent = Color(0xFF4B5364),
            innerBevelDark = Color(0xCC000000),
            innerBevelLight = Color(0x669CA3AF),
            brandTitle = "Nintendo DS Lite",
            family = ConsoleSkinFamily.DS_LITE
        )
        ConsoleSkinTheme.DS_LITE_WHITE -> ConsoleSkinPalette(
            primaryBody = Color(0xFFF4F6F9),
            secondaryBody = Color(0xFFE5E9F0),
            bezelAccent = Color(0xFFCBD5E1),
            innerBevelDark = Color(0x4464748B),
            innerBevelLight = Color(0xEEFFFFFF),
            brandTitle = "Nintendo DS Lite",
            family = ConsoleSkinFamily.DS_LITE,
            isLightSkin = true,
            brandTextColor = Color(0xFF334155),
            hingeShadow = Color(0x4464748B),
            screenRimColor = Color(0xFF94A3B8),
            controlsColor = Color(0xFFE2E8F0)
        )
        ConsoleSkinTheme.DS_LITE_ICE_BLUE -> ConsoleSkinPalette(
            primaryBody = Color(0xFFC2E9FB),
            secondaryBody = Color(0xFF8FD3F4),
            bezelAccent = Color(0xFF38BDF8),
            innerBevelDark = Color(0x440369A1),
            innerBevelLight = Color(0xEEFFFFFF),
            brandTitle = "Nintendo DS Lite",
            family = ConsoleSkinFamily.DS_LITE,
            isLightSkin = true,
            brandTextColor = Color(0xFF0C4A6E),
            hingeShadow = Color(0x440369A1),
            screenRimColor = Color(0xFF0284C7),
            controlsColor = Color(0xFFE0F2FE)
        )
        ConsoleSkinTheme.DS_LITE_CORAL_PINK -> ConsoleSkinPalette(
            primaryBody = Color(0xFFFBD3E9),
            secondaryBody = Color(0xFFF5A3C7),
            bezelAccent = Color(0xFFEC4899),
            innerBevelDark = Color(0x449D174D),
            innerBevelLight = Color(0xEEFFFFFF),
            brandTitle = "Nintendo DS Lite",
            family = ConsoleSkinFamily.DS_LITE,
            isLightSkin = true,
            brandTextColor = Color(0xFF831843),
            hingeShadow = Color(0x449D174D),
            screenRimColor = Color(0xFFBE185D),
            controlsColor = Color(0xFFFCE7F3)
        )
        ConsoleSkinTheme.CRIMSON_RED -> ConsoleSkinPalette(
            primaryBody = Color(0xFF7F1D1D),
            secondaryBody = Color(0xFF991B1B),
            bezelAccent = Color(0xFFDC2626),
            innerBevelDark = Color(0xAA450A0A),
            innerBevelLight = Color(0x55FCA5A5),
            brandTitle = "Nintendo DS Lite",
            family = ConsoleSkinFamily.DS_LITE,
            brandTextColor = Color(0xFFFEE2E2)
        )
        ConsoleSkinTheme.DSI_XL_BLACK -> ConsoleSkinPalette(
            primaryBody = Color(0xFF21252E),
            secondaryBody = Color(0xFF333947),
            bezelAccent = Color(0xFF545D70),
            innerBevelDark = Color(0xCC000000),
            innerBevelLight = Color(0x66A1A8B8),
            brandTitle = "Nintendo DSi XL",
            family = ConsoleSkinFamily.DSI_XL
        )
        ConsoleSkinTheme.DSI_XL_BURGUNDY -> ConsoleSkinPalette(
            primaryBody = Color(0xFF561B27),
            secondaryBody = Color(0xFF732132),
            bezelAccent = Color(0xFF9F1239),
            innerBevelDark = Color(0xAA2B0A11),
            innerBevelLight = Color(0x55FDA4AF),
            brandTitle = "Nintendo DSi XL",
            family = ConsoleSkinFamily.DSI_XL,
            brandTextColor = Color(0xFFFFE4E6)
        )
        ConsoleSkinTheme.DSI_XL_BLUE -> ConsoleSkinPalette(
            primaryBody = Color(0xFF16244F),
            secondaryBody = Color(0xFF1E377D),
            bezelAccent = Color(0xFF2563EB),
            innerBevelDark = Color(0xAA020617),
            innerBevelLight = Color(0x5560A5FA),
            brandTitle = "Nintendo DSi XL",
            family = ConsoleSkinFamily.DSI_XL,
            brandTextColor = Color(0xFFDBEAFE)
        )
        ConsoleSkinTheme.N3DS_BLACK -> ConsoleSkinPalette(
            primaryBody = Color(0xFF20242E),
            secondaryBody = Color(0xFF313746),
            bezelAccent = Color(0xFF566076),
            innerBevelDark = Color(0xCC000000),
            innerBevelLight = Color(0x779EA7BA),
            brandTitle = "New Nintendo 3DS XL",
            family = ConsoleSkinFamily.N3DS
        )
        ConsoleSkinTheme.N3DS_GALAXY -> ConsoleSkinPalette(
            primaryBody = Color(0xFF2F0852),
            secondaryBody = Color(0xFF4B157A),
            bezelAccent = Color(0xFF9333EA),
            innerBevelDark = Color(0xAA190230),
            innerBevelLight = Color(0x66C084FC),
            brandTitle = "New Nintendo 3DS XL",
            family = ConsoleSkinFamily.N3DS,
            brandTextColor = Color(0xFFF3E8FF)
        )
        ConsoleSkinTheme.N3DS_SNES -> ConsoleSkinPalette(
            primaryBody = Color(0xFFD4D7DD),
            secondaryBody = Color(0xFFB5BAC4),
            bezelAccent = Color(0xFF6B7280),
            innerBevelDark = Color(0x44374151),
            innerBevelLight = Color(0xEEFFFFFF),
            brandTitle = "New Nintendo 3DS XL",
            family = ConsoleSkinFamily.N3DS,
            isLightSkin = true,
            brandTextColor = Color(0xFF1F2937),
            hingeShadow = Color(0x444B5563),
            screenRimColor = Color(0xFF4B5563),
            controlsColor = Color(0xFFE5E7EB)
        )
        ConsoleSkinTheme.N3DS_HYRULE -> ConsoleSkinPalette(
            primaryBody = Color(0xFF8C4A08),
            secondaryBody = Color(0xFFB4630B),
            bezelAccent = Color(0xFFEAB308),
            innerBevelDark = Color(0xAA451A03),
            innerBevelLight = Color(0x66FDE68A),
            brandTitle = "New Nintendo 3DS XL",
            family = ConsoleSkinFamily.N3DS,
            brandTextColor = Color(0xFFFEF3C7)
        )
        ConsoleSkinTheme.N3DS_AQUA -> ConsoleSkinPalette(
            primaryBody = Color(0xFF035F91),
            secondaryBody = Color(0xFF027AB8),
            bezelAccent = Color(0xFF0EA5E9),
            innerBevelDark = Color(0xAA082F49),
            innerBevelLight = Color(0x667DD3FC),
            brandTitle = "Nintendo 3DS",
            family = ConsoleSkinFamily.N3DS,
            brandTextColor = Color(0xFFE0F2FE)
        )
        ConsoleSkinTheme.DSI_WHITE -> ConsoleSkinPalette(
            primaryBody = Color(0xFFF3F5F8),
            secondaryBody = Color(0xFFE2E6EC),
            bezelAccent = Color(0xFFCBD5E1),
            innerBevelDark = Color(0x4464748B),
            innerBevelLight = Color(0xEEFFFFFF),
            brandTitle = "Nintendo DSi",
            family = ConsoleSkinFamily.DSI_XL,
            isLightSkin = true,
            brandTextColor = Color(0xFF334155),
            screenRimColor = Color(0xFF94A3B8),
            controlsColor = Color(0xFFCBD5E1)
        )
        ConsoleSkinTheme.DS_LITE_SILVER -> ConsoleSkinPalette(
            primaryBody = Color(0xFFC8CDD4),
            secondaryBody = Color(0xFF9DA5B1),
            bezelAccent = Color(0xFFE2E8F0),
            innerBevelDark = Color(0x77334155),
            innerBevelLight = Color(0xDDF8FAFC),
            brandTitle = "Nintendo DS Lite",
            family = ConsoleSkinFamily.DS_LITE,
            isLightSkin = true,
            accentGlow = Color(0xFF94A3B8),
            brandTextColor = Color(0xFF1E293B),
            screenRimColor = Color(0xFF475569),
            controlsColor = Color(0xFF94A3B8)
        )
        ConsoleSkinTheme.N3DS_MAJORAS_MASK -> ConsoleSkinPalette(
            primaryBody = Color(0xFF9A6B0E),
            secondaryBody = Color(0xFFC9931B),
            bezelAccent = Color(0xFF7C3AED),
            innerBevelDark = Color(0xBB3B1D05),
            innerBevelLight = Color(0x88FDE68A),
            brandTitle = "New 3DS XL Majora's Mask",
            family = ConsoleSkinFamily.N3DS,
            accentGlow = Color(0xFFA855F7),
            brandTextColor = Color(0xFFFEF3C7),
            screenRimColor = Color(0xFF140E1F),
            controlsColor = Color(0xFF2E1065)
        )
        ConsoleSkinTheme.N3DS_PIKACHU -> ConsoleSkinPalette(
            primaryBody = Color(0xFFFACC15),
            secondaryBody = Color(0xFFEAB308),
            bezelAccent = Color(0xFFEF4444),
            innerBevelDark = Color(0x88713F12),
            innerBevelLight = Color(0xCCFEF9C3),
            brandTitle = "New 3DS XL Pikachu",
            family = ConsoleSkinFamily.N3DS,
            isLightSkin = true,
            accentGlow = Color(0xFFEF4444),
            brandTextColor = Color(0xFF422006),
            screenRimColor = Color(0xFF1F2937),
            controlsColor = Color(0xFF3F3F46)
        )
        ConsoleSkinTheme.SWITCH_TOTK_OLED -> ConsoleSkinPalette(
            primaryBody = Color(0xFF1B2326),
            secondaryBody = Color(0xFF283539),
            bezelAccent = Color(0xFFD4AF37),
            innerBevelDark = Color(0xCC070B0D),
            innerBevelLight = Color(0xAAFDE68A),
            brandTitle = "Switch OLED · TotK",
            family = ConsoleSkinFamily.SWITCH,
            leftBody = Color(0xFFE5C14A),
            leftBodyShade = Color(0xFFB3891B),
            rightBody = Color(0xFFD9B23B),
            rightBodyShade = Color(0xFF9E7714),
            accentGlow = Color(0xFF2DD4BF),
            brandTextColor = Color(0xFFFEF3C7),
            railAccentLeft = Color(0xFF2DD4BF),
            railAccentRight = Color(0xFF2DD4BF),
            hasPortraitSideRail = true,
            screenRimColor = Color(0xFF0B1113),
            controlsColor = Color(0xFF1F2937)
        )
    }
}

@Composable
fun ConsoleSkinFullFrame(
    skinTheme: ConsoleSkinTheme = ConsoleSkinTheme.DS_LITE_BLACK,
    topScreenRect: Rect? = null,
    bottomScreenRect: Rect? = null,
    modifier: Modifier = Modifier,
    overrideTheme: Boolean = false,
    brightnessOverride: Int? = null,
    hybridTopScreenRect: Rect? = null,
    hybridBottomScreenRect: Rect? = null,
    surfaceWidth: Int = 0,
    surfaceHeight: Int = 0,
) {
    val context = LocalContext.current
    val prefs = remember(context) { PreferenceManager.getDefaultSharedPreferences(context) }
    var activeSkinKey by remember {
        mutableStateOf(prefs.getString("video_console_skin_type", null))
    }
    var savedBrightness by remember {
        mutableStateOf(prefs.getInt("video_console_skin_brightness", 100).coerceIn(30, 100))
    }

    if (!overrideTheme || brightnessOverride == null) {
        DisposableEffect(prefs) {
            val listener = SharedPreferences.OnSharedPreferenceChangeListener { sp, key ->
                when (key) {
                    "video_console_skin_type" -> activeSkinKey = sp.getString(key, null)
                    "video_console_skin_brightness" -> savedBrightness = sp.getInt(key, 100).coerceIn(30, 100)
                }
            }
            prefs.registerOnSharedPreferenceChangeListener(listener)
            onDispose {
                prefs.unregisterOnSharedPreferenceChangeListener(listener)
            }
        }
    }

    val activeTheme = remember(skinTheme, activeSkinKey, overrideTheme) {
        if (overrideTheme) {
            skinTheme
        } else if (activeSkinKey != null) {
            ConsoleSkinTheme.fromKey(activeSkinKey)
        } else {
            skinTheme
        }
    }

    val effectiveBrightness = (brightnessOverride ?: savedBrightness).coerceIn(30, 100)

    val ledAlpha: Float
    val wifiAlpha: Float
    val threeDAlpha: Float
    if (overrideTheme) {
        ledAlpha = 0.92f
        wifiAlpha = 0.72f
        threeDAlpha = 0.88f
    } else {
        val infiniteTransition = rememberInfiniteTransition(label = "skinLeds")
        ledAlpha = infiniteTransition.animateFloat(
            initialValue = 0.72f, targetValue = 1.0f,
            animationSpec = infiniteRepeatable(tween(1400, easing = LinearEasing), RepeatMode.Reverse),
            label = "ledAlpha"
        ).value
        wifiAlpha = infiniteTransition.animateFloat(
            initialValue = 0.30f, targetValue = 0.92f,
            animationSpec = infiniteRepeatable(tween(650, easing = LinearEasing), RepeatMode.Reverse),
            label = "wifiAlpha"
        ).value
        threeDAlpha = infiniteTransition.animateFloat(
            initialValue = 0.68f, targetValue = 1.0f,
            animationSpec = infiniteRepeatable(tween(1100, easing = LinearEasing), RepeatMode.Reverse),
            label = "threeDAlpha"
        ).value
    }

    // Observe theme and accent state so AURORA_AUTO_THEME follows all 8 app themes live
    val currentAppTheme = AppThemeManager.themeState.value
    val currentAccentKey = AppThemeManager.accentColorState.value
    val appColors = remember(currentAppTheme, currentAccentKey) {
        AppThemeManager.getCurrentWatermelonColors(context)
    }

    val palette = remember(activeTheme, appColors) {
        resolveSkinPalette(activeTheme, appColors)
    }

    val density = LocalDensity.current

    Canvas(modifier = modifier.fillMaxSize()) {
        val w = size.width
        val h = size.height

        if (w <= 1f || h <= 1f) return@Canvas

        val scaleX = if (surfaceWidth > 0 && kotlin.math.abs(surfaceWidth - w) > 2f) (w / surfaceWidth.toFloat()) else 1f
        val scaleY = if (surfaceHeight > 0 && kotlin.math.abs(surfaceHeight - h) > 2f) (h / surfaceHeight.toFloat()) else 1f

        fun mapRect(r: Rect?): Rect? {
            if (r == null || r.width <= 0 || r.height <= 0) return null
            if (scaleX == 1f && scaleY == 1f) return r
            return Rect(
                x = (r.x * scaleX).toInt(),
                y = (r.y * scaleY).toInt(),
                width = (r.width * scaleX).toInt().coerceAtLeast(1),
                height = (r.height * scaleY).toInt().coerceAtLeast(1),
            )
        }

        val s1 = mapRect(topScreenRect)
        val s2 = mapRect(bottomScreenRect)
        val h1 = mapRect(hybridTopScreenRect)
        val h2 = mapRect(hybridBottomScreenRect)

        val allScreens = listOfNotNull(s1, s2, h1, h2)
        if (allScreens.isEmpty()) return@Canvas

        // 1. Construct Screen Cutout Path for 100% Zero Pixel Occlusion Guarantee across ALL screens (incl. Hybrid!)
        val screenCutoutPath = Path().apply {
            for (scr in allScreens) {
                addRect(
                    androidx.compose.ui.geometry.Rect(
                        scr.x.toFloat(), scr.y.toFloat(), scr.right.toFloat(), scr.bottom.toFloat()
                    )
                )
            }
        }

        // 2. Classify Layout Mode: Stacked (Vertical) vs Side-by-Side (Horizontal / Hybrid) vs Single
        val primaryA = s1 ?: h1 ?: s2 ?: h2
        val primaryB = when {
            s1 != null && s2 != null -> s2
            h1 != null && h2 != null && primaryA == h1 -> h2
            primaryA != s2 && s2 != null -> s2
            primaryA != h1 && h1 != null -> h1
            primaryA != h2 && h2 != null -> h2
            else -> null
        }
        val isDualScreen = primaryA != null && primaryB != null
        val isVertical = if (isDualScreen) {
            val a = primaryA!!
            val b = primaryB!!
            val stackedVertically = minOf(a.bottom, b.bottom) <= maxOf(a.y, b.y) + 24
            val sideBySideHorizontally = minOf(a.right, b.right) <= maxOf(a.x, b.x) + 24
            when {
                sideBySideHorizontally && !stackedVertically -> false
                stackedVertically && !sideBySideHorizontally -> true
                else -> w <= h
            }
        } else {
            w <= h
        }

        val outerBezelPx = 3.0f * density.density

        // 3. Draw All Chassis Elements Wrapped Inside ClipOp.Difference
        // Guarantees the 3D skin NEVER draws on top of game pixels
        clipPath(screenCutoutPath, clipOp = ClipOp.Difference) {
            if (isDualScreen && !isVertical) {
                drawLandscapeLayout(
                    s1 = primaryA!!,
                    s2 = primaryB!!,
                    w = w,
                    h = h,
                    palette = palette,
                    ledAlpha = ledAlpha,
                    wifiAlpha = wifiAlpha,
                    outerBezelPx = outerBezelPx,
                    density = density.density
                )
            } else if (isDualScreen && isVertical) {
                drawPortraitLayout(
                    s1 = primaryA!!,
                    s2 = primaryB!!,
                    w = w,
                    h = h,
                    palette = palette,
                    ledAlpha = ledAlpha,
                    wifiAlpha = wifiAlpha,
                    threeDAlpha = threeDAlpha,
                    outerBezelPx = outerBezelPx,
                    density = density.density
                )
            } else {
                val single = primaryA!!
                drawSingleScreenLayout(
                    single = single,
                    w = w,
                    h = h,
                    palette = palette,
                    ledAlpha = ledAlpha,
                    wifiAlpha = wifiAlpha,
                    outerBezelPx = outerBezelPx,
                    density = density.density
                )
            }

            // 4. Draw crisp, non-overflowing 3D Screen Wells around EVERY active screen (including Hybrid!)
            for (scr in allScreens) {
                drawScreenWellBezel(scr, palette, outerBezelPx, density.density)
            }

            // 5. Night comfort shell dimming (strictly clipped outside game screens)
            val dimAlpha = (1f - (effectiveBrightness / 100f)).coerceIn(0f, 0.70f)
            if (dimAlpha > 0.005f) {
                drawRect(color = Color.Black.copy(alpha = dimAlpha))
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
    outerBezelPx: Float,
    density: Float
) {
    val leftScreen = if (s1.x <= s2.x) s1 else s2
    val rightScreen = if (s1.x <= s2.x) s2 else s1

    val minScreenLeft = leftScreen.x.toFloat()
    val maxScreenRight = rightScreen.right.toFloat()
    val minScreenTop = minOf(leftScreen.y, rightScreen.y).toFloat()
    val maxScreenBottom = maxOf(leftScreen.bottom, rightScreen.bottom).toFloat()

    val d36dp = 36f * density
    val d8dp = 8f * density

    // Main Chassis Base
    drawRect(
        brush = Brush.verticalGradient(
            colors = listOf(palette.secondaryBody, palette.primaryBody, palette.secondaryBody),
            startY = 0f, endY = h
        )
    )

    // Top Band
    val safeTopH = (minScreenTop - outerBezelPx - 1f * density).coerceAtLeast(0f)
    if (minScreenTop > 0f) {
        drawRect(
            brush = Brush.verticalGradient(
                colors = listOf(palette.secondaryBody, palette.primaryBody),
                startY = 0f, endY = minScreenTop
            ),
            topLeft = Offset(0f, 0f),
            size = Size(w, minScreenTop)
        )
        drawLine(
            color = palette.innerBevelLight.copy(alpha = 0.45f),
            start = Offset(0f, 0.5f * density),
            end = Offset(w, 0.5f * density),
            strokeWidth = 1f * density
        )

        if (safeTopH >= 13f * density) {
            val availW = (maxScreenRight - minScreenLeft).coerceAtLeast(w * 0.50f) - 24f * density
            if (palette.family == ConsoleSkinFamily.SWITCH && safeTopH >= 32f * density) {
                // Vents cleanly above title when there is generous vertical space
                val ventY = safeTopH * 0.22f
                val ventH = 3.2f * density
                val ventW = 2.6f * density
                val ventSpacing = 2.2f * density
                val ventCount = 12
                val ventTotalW = ventCount * ventW + (ventCount - 1) * ventSpacing
                val ventStartX = (w - ventTotalW) / 2f
                for (i in 0 until ventCount) {
                    val vx = ventStartX + i * (ventW + ventSpacing)
                    drawRoundRect(
                        color = Color.Black.copy(alpha = 0.78f),
                        topLeft = Offset(vx, ventY),
                        size = Size(ventW, ventH),
                        cornerRadius = CornerRadius(1.2f * density, 1.2f * density)
                    )
                }
                drawBrandText(
                    text = palette.brandTitle,
                    centerX = w / 2f,
                    centerY = safeTopH * 0.68f,
                    maxHeightPx = safeTopH * 0.42f,
                    maxWidthPx = availW,
                    palette = palette,
                    density = density
                )
            } else {
                drawBrandText(
                    text = palette.brandTitle,
                    centerX = w / 2f,
                    centerY = safeTopH * 0.50f,
                    maxHeightPx = safeTopH * 0.72f,
                    maxWidthPx = availW,
                    palette = palette,
                    density = density
                )
            }
        }
    }

    // Bottom Band
    val safeBottomH = (h - maxScreenBottom - outerBezelPx).coerceAtLeast(0f)
    if (maxScreenBottom < h) {
        drawRect(
            brush = Brush.verticalGradient(
                colors = listOf(palette.primaryBody, palette.secondaryBody),
                startY = maxScreenBottom, endY = h
            ),
            topLeft = Offset(0f, maxScreenBottom),
            size = Size(w, h - maxScreenBottom)
        )
        if (safeBottomH >= 12f * density) {
            val portW = 18f * density
            val portH = 3.6f * density
            val portCenterY = maxScreenBottom + outerBezelPx + safeBottomH / 2f
            drawRoundRect(
                color = palette.innerBevelDark.copy(alpha = 0.80f),
                topLeft = Offset((w - portW) / 2f, portCenterY - portH / 2f),
                size = Size(portW, portH),
                cornerRadius = CornerRadius(1.8f * density, 1.8f * density)
            )
        }
    }

    // Left Sculpted Side Grip / Wing (clean background so touch controls stay unobstructed)
    val leftWingWidth = minScreenLeft
    if (leftWingWidth >= d36dp) {
        drawLandscapeSideWing(
            isLeft = true,
            wingX = 0f,
            wingW = leftWingWidth,
            h = h,
            palette = palette,
            ledAlpha = ledAlpha,
            wifiAlpha = wifiAlpha,
            density = density
        )
    } else if (leftWingWidth >= d8dp) {
        drawLandscapeSlimRail(
            isLeft = true,
            railX = 0f,
            railW = leftWingWidth,
            h = h,
            palette = palette,
            ledAlpha = ledAlpha,
            density = density
        )
    }

    // Right Sculpted Side Grip / Wing
    val rightWingWidth = w - maxScreenRight
    if (rightWingWidth >= d36dp) {
        drawLandscapeSideWing(
            isLeft = false,
            wingX = maxScreenRight,
            wingW = rightWingWidth,
            h = h,
            palette = palette,
            ledAlpha = ledAlpha,
            wifiAlpha = wifiAlpha,
            density = density
        )
    } else if (rightWingWidth >= d8dp) {
        drawLandscapeSlimRail(
            isLeft = false,
            railX = maxScreenRight,
            railW = rightWingWidth,
            h = h,
            palette = palette,
            ledAlpha = ledAlpha,
            density = density
        )
    }

    // Central Bridge / Divider Between Screens
    val horizontalGap = rightScreen.x - leftScreen.right
    if (horizontalGap >= 4f * density) {
        val bridgeX = leftScreen.right.toFloat()
        val bridgeW = horizontalGap.toFloat()
        drawRect(
            brush = Brush.horizontalGradient(
                colors = listOf(palette.secondaryBody, palette.primaryBody, palette.secondaryBody),
                startX = bridgeX, endX = bridgeX + bridgeW
            ),
            topLeft = Offset(bridgeX, minScreenTop),
            size = Size(bridgeW, maxScreenBottom - minScreenTop)
        )
        drawLine(
            color = palette.hingeShadow.copy(alpha = 0.65f),
            start = Offset(bridgeX + bridgeW / 2f, minScreenTop),
            end = Offset(bridgeX + bridgeW / 2f, maxScreenBottom),
            strokeWidth = 1.2f * density
        )
    }

    // Clean Hybrid / Uneven Screen Void Compensation (no random dot grids)
    if (leftScreen.y > minScreenTop.toInt()) {
        drawChassisDeckPanel(
            left = leftScreen.x.toFloat(),
            top = minScreenTop,
            width = leftScreen.width.toFloat(),
            height = leftScreen.y - minScreenTop,
            palette = palette
        )
    }
    if (leftScreen.bottom < maxScreenBottom.toInt()) {
        drawChassisDeckPanel(
            left = leftScreen.x.toFloat(),
            top = leftScreen.bottom.toFloat(),
            width = leftScreen.width.toFloat(),
            height = maxScreenBottom - leftScreen.bottom,
            palette = palette
        )
    }
    if (rightScreen.y > minScreenTop.toInt()) {
        drawChassisDeckPanel(
            left = rightScreen.x.toFloat(),
            top = minScreenTop,
            width = rightScreen.width.toFloat(),
            height = rightScreen.y - minScreenTop,
            palette = palette
        )
    }
    if (rightScreen.bottom < maxScreenBottom.toInt()) {
        drawChassisDeckPanel(
            left = rightScreen.x.toFloat(),
            top = rightScreen.bottom.toFloat(),
            width = rightScreen.width.toFloat(),
            height = maxScreenBottom - rightScreen.bottom,
            palette = palette
        )
    }
}

private fun DrawScope.drawLandscapeSideWing(
    isLeft: Boolean,
    wingX: Float,
    wingW: Float,
    h: Float,
    palette: ConsoleSkinPalette,
    ledAlpha: Float,
    wifiAlpha: Float,
    density: Float
) {
    val startColor = if (isLeft) palette.leftBody else palette.rightBodyShade
    val endColor = if (isLeft) palette.leftBodyShade else palette.rightBody
    val radius = (16f * density).coerceAtMost(wingW * 0.38f)

    // Sculpted ergonomic grip body
    drawRoundRect(
        brush = Brush.horizontalGradient(
            colors = listOf(startColor, endColor),
            startX = wingX,
            endX = wingX + wingW
        ),
        topLeft = Offset(wingX, 0f),
        size = Size(wingW, h),
        cornerRadius = CornerRadius(radius, radius)
    )

    // Subtle rail seam shadow meeting the screen tablet body
    val seamW = 3.5f * density
    if (isLeft) {
        drawRect(
            brush = Brush.horizontalGradient(
                colors = listOf(Color.Transparent, palette.hingeShadow),
                startX = wingX + wingW - seamW,
                endX = wingX + wingW
            ),
            topLeft = Offset(wingX + wingW - seamW, 0f),
            size = Size(seamW, h)
        )
    } else {
        drawRect(
            brush = Brush.horizontalGradient(
                colors = listOf(palette.hingeShadow, Color.Transparent),
                startX = wingX,
                endX = wingX + seamW
            ),
            topLeft = Offset(wingX, 0f),
            size = Size(seamW, h)
        )
    }

    // Subtle console-appropriate accents placed near top/bottom edges so touch controls stay clean
    val centerX = wingX + wingW * 0.50f
    when (palette.family) {
        ConsoleSkinFamily.SWITCH -> {
            // Subtle inner Joy-Con rail accent line and compact player LEDs near top
            val railLineX = if (isLeft) wingX + wingW - 4.5f * density else wingX + 4.5f * density
            drawLine(
                color = palette.innerBevelLight.copy(alpha = 0.30f),
                start = Offset(railLineX, 16f * density),
                end = Offset(railLineX, h - 16f * density),
                strokeWidth = 1.0f * density
            )
            if (isLeft) {
                val ledX = wingX + wingW - 9f * density
                val ledSpacing = 7f * density
                val ledStartY = 24f * density
                for (i in 0 until 4) {
                    drawGlowingLed(
                        center = Offset(ledX, ledStartY + i * ledSpacing),
                        baseColor = Color(0xFF00E676),
                        alpha = if (i == 0) ledAlpha else 0.18f,
                        density = density,
                        radiusDp = 1.5f,
                        hasHalo = (i == 0)
                    )
                }
            }
        }
        ConsoleSkinFamily.AURORA -> {
            // Sleek glowing Aurora vertical contour near outer edge
            val trimX = if (isLeft) wingX + 3.5f * density else wingX + wingW - 3.5f * density
            drawLine(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color.Transparent,
                        palette.accentGlow.copy(alpha = 0.65f),
                        Color.Transparent
                    ),
                    startY = h * 0.12f,
                    endY = h * 0.88f
                ),
                start = Offset(trimX, h * 0.12f),
                end = Offset(trimX, h * 0.88f),
                strokeWidth = 1.6f * density
            )
        }
        ConsoleSkinFamily.DS_LITE, ConsoleSkinFamily.DSI_XL, ConsoleSkinFamily.N3DS -> {
            // Authentic stereo speaker grilles near top corners + power/wifi LEDs on right wing
            drawPerforatedSpeakerGrille(
                centerX = centerX,
                centerY = (24f * density).coerceAtMost(h * 0.12f),
                density = density,
                palette = palette,
                scale = 0.85f
            )
            if (!isLeft) {
                val ledY = h - (20f * density).coerceAtMost(h * 0.10f)
                drawGlowingLed(
                    center = Offset(centerX - 6f * density, ledY),
                    baseColor = Color(0xFFFFB300),
                    alpha = wifiAlpha,
                    density = density,
                    radiusDp = 1.9f,
                    hasHalo = true
                )
                drawGlowingLed(
                    center = Offset(centerX + 6f * density, ledY),
                    baseColor = if (palette.family == ConsoleSkinFamily.DS_LITE) Color(0xFF00E676) else Color(0xFF00B0FF),
                    alpha = ledAlpha,
                    density = density,
                    radiusDp = 1.9f,
                    hasHalo = true
                )
            }
        }
    }
}

private fun DrawScope.drawLandscapeSlimRail(
    isLeft: Boolean,
    railX: Float,
    railW: Float,
    h: Float,
    palette: ConsoleSkinPalette,
    ledAlpha: Float,
    density: Float
) {
    val startColor = if (isLeft) palette.leftBody else palette.rightBodyShade
    val endColor = if (isLeft) palette.leftBodyShade else palette.rightBody
    drawRect(
        brush = Brush.horizontalGradient(
            colors = listOf(startColor, endColor),
            startX = railX,
            endX = railX + railW
        ),
        topLeft = Offset(railX, 0f),
        size = Size(railW, h)
    )
    if (palette.family == ConsoleSkinFamily.AURORA) {
        val trimX = railX + railW * 0.5f
        drawLine(
            brush = Brush.verticalGradient(
                colors = listOf(Color.Transparent, palette.accentGlow.copy(alpha = 0.70f), Color.Transparent),
                startY = h * 0.2f,
                endY = h * 0.8f
            ),
            start = Offset(trimX, h * 0.2f),
            end = Offset(trimX, h * 0.8f),
            strokeWidth = 1.4f * density
        )
    } else if (palette.family == ConsoleSkinFamily.SWITCH && isLeft && railW >= 10f * density) {
        val ledR = (1.5f * density).coerceAtMost(railW * 0.22f)
        val ledSpacing = 7f * density
        val ledStartY = h * 0.50f - 1.5f * ledSpacing
        for (i in 0 until 4) {
            drawCircle(
                color = if (i == 0) Color(0xFF00E676).copy(alpha = ledAlpha) else Color.Black.copy(alpha = 0.45f),
                radius = ledR,
                center = Offset(railX + railW * 0.5f, ledStartY + i * ledSpacing)
            )
        }
    }
}

private fun DrawScope.drawGlowingLed(
    center: Offset,
    baseColor: Color,
    alpha: Float,
    density: Float,
    radiusDp: Float = 2.0f,
    hasHalo: Boolean = true
) {
    val r = (radiusDp * density).coerceAtLeast(1.0f)
    val effectiveColor = baseColor.copy(alpha = alpha.coerceIn(0f, 1f))

    if (hasHalo) {
        val haloRadius = r * 2.6f
        drawCircle(
            brush = Brush.radialGradient(
                colors = listOf(
                    baseColor.copy(alpha = (0.42f * alpha).coerceIn(0f, 1f)),
                    baseColor.copy(alpha = (0.10f * alpha).coerceIn(0f, 1f)),
                    Color.Transparent
                ),
                center = center,
                radius = haloRadius
            ),
            radius = haloRadius,
            center = center
        )
    }

    drawCircle(
        color = Color.Black.copy(alpha = 0.80f),
        radius = r + 0.65f * density,
        center = center
    )
    drawCircle(
        color = effectiveColor,
        radius = r,
        center = center
    )
    drawCircle(
        color = Color.White.copy(alpha = 0.88f * alpha),
        radius = r * 0.34f,
        center = Offset(center.x - r * 0.26f, center.y - r * 0.26f)
    )
}

private fun DrawScope.drawPerforatedSpeakerGrille(
    centerX: Float,
    centerY: Float,
    density: Float,
    palette: ConsoleSkinPalette,
    scale: Float = 1.0f
) {
    val s = scale.coerceIn(0.45f, 1.0f)
    val dotR = 1.35f * density * s
    val spacingX = 3.8f * density * s
    val spacingY = 3.8f * density * s
    val dotColor = Color.Black.copy(alpha = 0.85f)
    val rimColor = if (palette.isLightSkin) Color(0xFF94A3B8).copy(alpha = 0.70f) else palette.innerBevelLight.copy(alpha = 0.35f)

    // 6 perforated speaker holes (3 columns x 2 rows in compact horizontal bars)
    for (row in 0..1) {
        for (col in -1..1) {
            val dx = centerX + col * spacingX
            val dy = centerY + (row - 0.5f) * spacingY
            drawCircle(dotColor, dotR, Offset(dx, dy))
            drawCircle(rimColor, dotR, Offset(dx, dy), style = Stroke(width = 0.45f * density))
        }
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
    threeDAlpha: Float,
    outerBezelPx: Float,
    density: Float
) {
    val upperScreen = if (s1.y <= s2.y) s1 else s2
    val lowerScreen = if (s1.y <= s2.y) s2 else s1

    val upperTop = upperScreen.y.toFloat()
    val upperBottom = upperScreen.bottom.toFloat()
    val lowerTop = lowerScreen.y.toFloat()
    val lowerBottom = lowerScreen.bottom.toFloat()

    // 1. Overall Handheld Chassis Background (uniform sculpted finish - never clashes with touch buttons)
    drawRect(
        brush = Brush.verticalGradient(
            colors = listOf(palette.secondaryBody, palette.primaryBody, palette.secondaryBody),
            startY = 0f, endY = h
        )
    )

    // 2. Top Header / Lid Bar (strictly inside safeTopH = upperTop - outerBezelPx - 1dp -> ZERO clipping!)
    val safeTopH = (upperTop - outerBezelPx - 1f * density).coerceAtLeast(0f)
    if (upperTop > 0f) {
        drawRect(
            brush = Brush.verticalGradient(
                colors = listOf(
                    palette.innerBevelLight.copy(alpha = if (palette.isLightSkin) 0.55f else 0.28f),
                    palette.secondaryBody,
                    palette.primaryBody
                ),
                startY = 0f,
                endY = upperTop
            ),
            topLeft = Offset(0f, 0f),
            size = Size(w, upperTop)
        )
        drawLine(
            color = if (palette.family == ConsoleSkinFamily.AURORA || palette.family == ConsoleSkinFamily.SWITCH) {
                palette.accentGlow.copy(alpha = 0.72f)
            } else {
                palette.innerBevelLight.copy(alpha = 0.52f)
            },
            start = Offset(0f, 0.5f * density),
            end = Offset(w, 0.5f * density),
            strokeWidth = 1.2f * density
        )
    }

    // 2b. Authentic Switch Portrait Joy-Con Side Shells (visible on screen side margins + top shoulder tabs)
    if (palette.family == ConsoleSkinFamily.SWITCH && palette.hasPortraitSideRail) {
        val leftScreenMargin = (minOf(upperScreen.x, lowerScreen.x).toFloat() - outerBezelPx).coerceAtLeast(0f)
        val rightScreenMargin = (w - maxOf(upperScreen.right, lowerScreen.right).toFloat() - outerBezelPx).coerceAtLeast(0f)
        val sideShellBottom = (lowerBottom + outerBezelPx).coerceAtMost(h)
        if (leftScreenMargin >= 4f * density) {
            drawRect(
                brush = Brush.horizontalGradient(
                    colors = listOf(palette.leftBody, palette.leftBodyShade),
                    startX = 0f,
                    endX = leftScreenMargin
                ),
                topLeft = Offset(0f, 0f),
                size = Size(leftScreenMargin, sideShellBottom)
            )
            drawLine(
                color = palette.railAccentLeft.copy(alpha = 0.85f),
                start = Offset(leftScreenMargin - 0.8f * density, 0f),
                end = Offset(leftScreenMargin - 0.8f * density, sideShellBottom),
                strokeWidth = 1.4f * density
            )
        }
        if (rightScreenMargin >= 4f * density) {
            val rx = w - rightScreenMargin
            drawRect(
                brush = Brush.horizontalGradient(
                    colors = listOf(palette.rightBodyShade, palette.rightBody),
                    startX = rx,
                    endX = w
                ),
                topLeft = Offset(rx, 0f),
                size = Size(rightScreenMargin, sideShellBottom)
            )
            drawLine(
                color = palette.railAccentRight.copy(alpha = 0.85f),
                start = Offset(rx + 0.8f * density, 0f),
                end = Offset(rx + 0.8f * density, sideShellBottom),
                strokeWidth = 1.4f * density
            )
        }
        // Top Joy-Con shoulder color accents on left & right of top header (always visible even on full-width screens!)
        if (safeTopH >= 6f * density) {
            val tabW = (w * 0.14f).coerceIn(20f * density, 54f * density)
            val tabH = (safeTopH * 0.56f).coerceIn(4f * density, 14f * density)
            val tabY = (safeTopH - tabH) * 0.5f
            drawRoundRect(
                brush = Brush.horizontalGradient(listOf(palette.leftBody, palette.leftBodyShade)),
                topLeft = Offset(6f * density, tabY),
                size = Size(tabW, tabH),
                cornerRadius = CornerRadius(tabH * 0.45f, tabH * 0.45f)
            )
            drawRoundRect(
                color = palette.railAccentLeft.copy(alpha = 0.75f),
                topLeft = Offset(6f * density, tabY),
                size = Size(tabW, tabH),
                cornerRadius = CornerRadius(tabH * 0.45f, tabH * 0.45f),
                style = Stroke(width = 0.9f * density)
            )
            drawRoundRect(
                brush = Brush.horizontalGradient(listOf(palette.rightBodyShade, palette.rightBody)),
                topLeft = Offset(w - 6f * density - tabW, tabY),
                size = Size(tabW, tabH),
                cornerRadius = CornerRadius(tabH * 0.45f, tabH * 0.45f)
            )
            drawRoundRect(
                color = palette.railAccentRight.copy(alpha = 0.75f),
                topLeft = Offset(w - 6f * density - tabW, tabY),
                size = Size(tabW, tabH),
                cornerRadius = CornerRadius(tabH * 0.45f, tabH * 0.45f),
                style = Stroke(width = 0.9f * density)
            )
        }
    }

    if (safeTopH >= 8f * density) {
        val topCenterY = safeTopH * 0.50f
        when (palette.family) {
            ConsoleSkinFamily.SWITCH -> {
                val tabReserve = if (palette.hasPortraitSideRail) ((w * 0.14f).coerceIn(20f * density, 54f * density) + 12f * density) * 2f else 24f * density
                val titleMaxW = (w - tabReserve).coerceAtLeast(32f * density)
                drawBrandText(
                    text = palette.brandTitle,
                    centerX = w / 2f,
                    centerY = topCenterY,
                    maxHeightPx = safeTopH * 0.66f,
                    maxWidthPx = titleMaxW,
                    palette = palette,
                    density = density
                )
            }
            ConsoleSkinFamily.AURORA -> {
                // Sleek flagship Aurora header: subtle glowing accent bars flanking centered title
                val titleMaxW = w * 0.66f
                drawBrandText(
                    text = palette.brandTitle,
                    centerX = w / 2f,
                    centerY = topCenterY,
                    maxHeightPx = safeTopH * 0.64f,
                    maxWidthPx = titleMaxW,
                    palette = palette,
                    density = density
                )
                val barStartLeft = 14f * density
                val barEndLeft = (w * 0.16f).coerceAtLeast(barStartLeft + 12f * density)
                val barStartRight = w - barEndLeft
                val barEndRight = w - barStartLeft
                drawLine(
                    brush = Brush.horizontalGradient(
                        colors = listOf(Color.Transparent, palette.accentGlow.copy(alpha = 0.80f)),
                        startX = barStartLeft,
                        endX = barEndLeft
                    ),
                    start = Offset(barStartLeft, topCenterY),
                    end = Offset(barEndLeft, topCenterY),
                    strokeWidth = 1.4f * density
                )
                drawLine(
                    brush = Brush.horizontalGradient(
                        colors = listOf(palette.accentGlow.copy(alpha = 0.80f), Color.Transparent),
                        startX = barStartRight,
                        endX = barEndRight
                    ),
                    start = Offset(barStartRight, topCenterY),
                    end = Offset(barEndRight, topCenterY),
                    strokeWidth = 1.4f * density
                )
            }
            ConsoleSkinFamily.DS_LITE, ConsoleSkinFamily.DSI_XL, ConsoleSkinFamily.N3DS -> {
                val hasSideSpeakers = upperScreen.x >= 20f * density
                val speakerScale = (safeTopH / (16f * density)).coerceIn(0.55f, 0.90f)
                val titleMarginSide = if (hasSideSpeakers) {
                    if (palette.family == ConsoleSkinFamily.N3DS) 54f * density else 20f * density
                } else {
                    if (palette.family == ConsoleSkinFamily.N3DS) 74f * density else 52f * density
                }

                // If lid is tall enough (>= 36dp), place camera lens cleanly above brand title
                if (safeTopH >= 36f * density && palette.family != ConsoleSkinFamily.DS_LITE) {
                    drawCameraLens(
                        center = Offset(w / 2f, safeTopH * 0.28f),
                        radiusPx = 3.2f * density,
                        palette = palette,
                        density = density,
                        includeIrEmitter = (palette.family == ConsoleSkinFamily.N3DS)
                    )
                    drawBrandText(
                        text = palette.brandTitle,
                        centerX = w / 2f,
                        centerY = safeTopH * 0.72f,
                        maxHeightPx = safeTopH * 0.36f,
                        maxWidthPx = (w - 2f * titleMarginSide).coerceAtLeast(80f * density),
                        palette = palette,
                        density = density
                    )
                } else {
                    drawBrandText(
                        text = palette.brandTitle,
                        centerX = w / 2f,
                        centerY = topCenterY,
                        maxHeightPx = safeTopH * 0.62f,
                        maxWidthPx = (w - 2f * titleMarginSide).coerceAtLeast(80f * density),
                        palette = palette,
                        density = density
                    )
                }

                // Stereo Perforated Speaker Grilles (guaranteed non-overlapping with title & 3D LED)
                if (hasSideSpeakers) {
                    val speakerCenterY = upperScreen.y + upperScreen.height / 2f
                    drawPerforatedSpeakerGrille(upperScreen.x / 2f, speakerCenterY, density, palette, scale = 0.85f)
                    drawPerforatedSpeakerGrille(upperScreen.right + (w - upperScreen.right) / 2f, speakerCenterY, density, palette, scale = 0.85f)
                } else {
                    val leftSpeakerX = 24f * density
                    val rightSpeakerX = if (palette.family == ConsoleSkinFamily.N3DS) {
                        w - 50f * density
                    } else {
                        w - 24f * density
                    }
                    drawPerforatedSpeakerGrille(leftSpeakerX, topCenterY, density, palette, scale = speakerScale)
                    drawPerforatedSpeakerGrille(rightSpeakerX, topCenterY, density, palette, scale = speakerScale)
                }

                // New 3DS XL glowing "3D" indicator cleanly tucked on far right without overlapping speaker
                if (palette.family == ConsoleSkinFamily.N3DS) {
                    val ledX = w - 13f * density
                    val ledR = (1.9f * density).coerceAtMost(safeTopH * 0.16f)
                    drawGlowingLed(
                        center = Offset(ledX, topCenterY),
                        baseColor = Color(0xFF00E5FF),
                        alpha = threeDAlpha,
                        density = density,
                        radiusDp = ledR / density,
                        hasHalo = true
                    )
                    drawIntoCanvas { canvas ->
                        val p = Paint().apply {
                            isAntiAlias = true
                            textSize = (7.2f * density).coerceAtMost(safeTopH * 0.44f)
                            textAlign = Paint.Align.RIGHT
                            typeface = Typeface.create(Typeface.DEFAULT, Typeface.BOLD)
                            color = Color(0xFF00D2FF).toArgb()
                        }
                        val fm = p.fontMetrics
                        val baseY = topCenterY - (fm.ascent + fm.descent) / 2f
                        canvas.nativeCanvas.drawText("3D", ledX - 5.5f * density, baseY, p)
                    }
                }
            }
        }
    }

    // 4. Center Bridge / Hinge Zone (upperBottom .. lowerTop)
    val gapTop = upperBottom
    val gapBottom = lowerTop
    val totalGapH = (gapBottom - gapTop).coerceAtLeast(0f)
    val clearGapTop = gapTop + outerBezelPx
    val clearGapBottom = gapBottom - outerBezelPx
    val clearGapH = (clearGapBottom - clearGapTop).coerceAtLeast(0f)
    val hingeCenterY = (gapTop + gapBottom) / 2f

    if (totalGapH > 1f * density) {
        when (palette.family) {
            ConsoleSkinFamily.SWITCH -> {
                // Sleek Switch glass/metallic center divider (NO DS knuckles, NO clipped MIC, NO 4 DS LEDs!)
                drawRect(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            palette.primaryBody,
                            palette.secondaryBody,
                            palette.primaryBody
                        ),
                        startY = gapTop,
                        endY = gapBottom
                    ),
                    topLeft = Offset(0f, gapTop),
                    size = Size(w, totalGapH)
                )
                drawLine(
                    color = palette.innerBevelLight.copy(alpha = 0.18f),
                    start = Offset(12f * density, hingeCenterY),
                    end = Offset(w - 12f * density, hingeCenterY),
                    strokeWidth = 0.8f * density
                )
                // Single subtle Switch power indicator LED on right
                if (clearGapH >= 7f * density) {
                    val ledR = (1.7f * density).coerceAtMost(clearGapH * 0.18f)
                    drawGlowingLed(
                        center = Offset(w - 18f * density, hingeCenterY),
                        baseColor = Color(0xFF00E676),
                        alpha = ledAlpha,
                        density = density,
                        radiusDp = ledR / density,
                        hasHalo = true
                    )
                }
            }
            ConsoleSkinFamily.AURORA -> {
                // Sleek futuristic Aurora center seam with subtle accent light strip + 2 clean LEDs
                drawRect(
                    brush = Brush.verticalGradient(
                        colors = listOf(palette.primaryBody, palette.secondaryBody, palette.primaryBody),
                        startY = gapTop,
                        endY = gapBottom
                    ),
                    topLeft = Offset(0f, gapTop),
                    size = Size(w, totalGapH)
                )
                drawLine(
                    brush = Brush.horizontalGradient(
                        colors = listOf(
                            Color.Transparent,
                            palette.accentGlow.copy(alpha = 0.65f),
                            palette.accentGlow.copy(alpha = 0.65f),
                            Color.Transparent
                        ),
                        startX = 16f * density,
                        endX = w - 46f * density
                    ),
                    start = Offset(16f * density, hingeCenterY),
                    end = Offset(w - 46f * density, hingeCenterY),
                    strokeWidth = 1.2f * density
                )
                if (clearGapH >= 7f * density) {
                    val ledR = (1.8f * density).coerceAtMost(clearGapH * 0.18f)
                    drawGlowingLed(
                        center = Offset(w - 28f * density, hingeCenterY),
                        baseColor = palette.accentGlow,
                        alpha = wifiAlpha,
                        density = density,
                        radiusDp = ledR / density,
                        hasHalo = true
                    )
                    drawGlowingLed(
                        center = Offset(w - 16f * density, hingeCenterY),
                        baseColor = Color(0xFF00E676),
                        alpha = ledAlpha,
                        density = density,
                        radiusDp = ledR / density,
                        hasHalo = true
                    )
                }
            }
            ConsoleSkinFamily.DS_LITE, ConsoleSkinFamily.DSI_XL, ConsoleSkinFamily.N3DS -> {
                // Authentic 3D Cylindrical Clamshell Hinge
                val barrelTop = clearGapTop.coerceAtLeast(gapTop)
                val barrelH = (clearGapBottom - barrelTop).coerceAtLeast(totalGapH)
                drawRect(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            palette.hingeShadow.copy(alpha = 0.45f),
                            palette.innerBevelLight.copy(alpha = if (palette.isLightSkin) 0.75f else 0.42f),
                            palette.secondaryBody,
                            palette.primaryBody,
                            palette.hingeShadow
                        ),
                        startY = gapTop,
                        endY = gapBottom
                    ),
                    topLeft = Offset(0f, gapTop),
                    size = Size(w, totalGapH)
                )

                // Left & Right Mechanical Hinge Knuckles
                val knuckleW = 14f * density
                val knuckleTint = palette.bezelAccent.copy(alpha = if (palette.isLightSkin) 0.28f else 0.40f)
                drawRect(knuckleTint, Offset(0f, gapTop), Size(knuckleW, totalGapH))
                drawRect(knuckleTint, Offset(w - knuckleW, gapTop), Size(knuckleW, totalGapH))
                drawLine(
                    color = palette.hingeShadow,
                    start = Offset(knuckleW, gapTop),
                    end = Offset(knuckleW, gapBottom),
                    strokeWidth = 1.2f * density
                )
                drawLine(
                    color = palette.innerBevelLight.copy(alpha = 0.40f),
                    start = Offset(knuckleW + 1f * density, gapTop),
                    end = Offset(knuckleW + 1f * density, gapBottom),
                    strokeWidth = 0.7f * density
                )
                drawLine(
                    color = palette.hingeShadow,
                    start = Offset(w - knuckleW, gapTop),
                    end = Offset(w - knuckleW, gapBottom),
                    strokeWidth = 1.2f * density
                )
                drawLine(
                    color = palette.innerBevelLight.copy(alpha = 0.40f),
                    start = Offset(w - knuckleW - 1f * density, gapTop),
                    end = Offset(w - knuckleW - 1f * density, gapBottom),
                    strokeWidth = 0.7f * density
                )

                if (clearGapH >= 7f * density) {
                    val centerX = w / 2f
                    if (palette.family == ConsoleSkinFamily.DSI_XL && clearGapH >= 10f * density) {
                        // Authentic DSi XL hinge-mounted inner camera lens + side MIC hole
                        drawCameraLens(
                            center = Offset(centerX, hingeCenterY),
                            radiusPx = (3.0f * density).coerceAtMost(clearGapH * 0.30f),
                            palette = palette,
                            density = density,
                            includeIrEmitter = false
                        )
                        // Recessed MIC dot cleanly beside camera
                        val micDotX = centerX + 12f * density
                        drawCircle(Color.Black.copy(alpha = 0.90f), 1.3f * density, Offset(micDotX, hingeCenterY))
                    } else {
                        // Clean recessed MIC slot + horizontally aligned "MIC" label (NEVER clipped vertically!)
                        val slotW = 7f * density
                        val slotH = (2.2f * density).coerceAtMost(clearGapH * 0.25f)
                        val slotCenterX = centerX - 8f * density
                        drawRoundRect(
                            color = Color.Black.copy(alpha = 0.90f),
                            topLeft = Offset(slotCenterX - slotW / 2f, hingeCenterY - slotH / 2f),
                            size = Size(slotW, slotH),
                            cornerRadius = CornerRadius(slotH / 2f, slotH / 2f)
                        )
                        if (clearGapH >= 9f * density) {
                            drawIntoCanvas { canvas ->
                                val p = Paint().apply {
                                    isAntiAlias = true
                                    textSize = (5.8f * density).coerceAtMost(clearGapH * 0.46f)
                                    textAlign = Paint.Align.LEFT
                                    typeface = Typeface.create(Typeface.DEFAULT, Typeface.BOLD)
                                    color = palette.brandTextColor.copy(alpha = 0.72f).toArgb()
                                }
                                val fm = p.fontMetrics
                                val baseY = hingeCenterY - (fm.ascent + fm.descent) / 2f
                                canvas.nativeCanvas.drawText("MIC", slotCenterX + slotW / 2f + 3f * density, baseY, p)
                            }
                        }
                    }

                    // Authentic Right-Hinge Status LEDs sized safely inside clearGapH
                    val ledR = (1.9f * density).coerceAtMost(clearGapH * 0.19f)
                    val ledSpacing = 10.5f * density
                    val powerLedX = w - knuckleW - 11f * density
                    val wifiLedX = powerLedX - ledSpacing

                    // Wireless / Wi-Fi LED (Warm Amber)
                    drawGlowingLed(
                        center = Offset(wifiLedX, hingeCenterY),
                        baseColor = Color(0xFFFFB300),
                        alpha = wifiAlpha,
                        density = density,
                        radiusDp = ledR / density,
                        hasHalo = true
                    )

                    // Power LED (DS Lite: Emerald Green; DSi/3DS: Electric Blue)
                    val powerColor = if (palette.family == ConsoleSkinFamily.DS_LITE) Color(0xFF00E676) else Color(0xFF00B0FF)
                    drawGlowingLed(
                        center = Offset(powerLedX, hingeCenterY),
                        baseColor = powerColor,
                        alpha = ledAlpha,
                        density = density,
                        radiusDp = ledR / density,
                        hasHalo = true
                    )

                    // Optional subtle Charge LED dot for DSi XL
                    if (palette.family == ConsoleSkinFamily.DSI_XL) {
                        drawGlowingLed(
                            center = Offset(wifiLedX - ledSpacing, hingeCenterY),
                            baseColor = Color(0xFFFF6D00),
                            alpha = 0.80f,
                            density = density,
                            radiusDp = (ledR * 0.78f) / density,
                            hasHalo = false
                        )
                    }
                }
            }
        }
    }

    // 5. Sculpted Bottom Controller Deck (Joy-Con grips for Switch + guaranteed Status LEDs when hingeGap == 0)
    val centerLedsDrawn = totalGapH > 1f * density && clearGapH >= 7f * density
    if (lowerBottom < h) {
        val deckTop = lowerBottom + outerBezelPx
        val deckH = (h - deckTop).coerceAtLeast(0f)

        // Switch Portrait Joy-Con Sculpted Side Grips on the bottom deck (iconic colors visible even on full-width screens!)
        if (palette.family == ConsoleSkinFamily.SWITCH && palette.hasPortraitSideRail && deckH >= 16f * density) {
            val gripW = (w * 0.075f).coerceIn(10f * density, 28f * density)
            val gripRadius = 10f * density
            drawRoundRect(
                brush = Brush.verticalGradient(
                    colors = listOf(palette.leftBody, palette.leftBodyShade),
                    startY = deckTop,
                    endY = h
                ),
                topLeft = Offset(-gripRadius, deckTop + 2f * density),
                size = Size(gripW + gripRadius, (deckH - 4f * density).coerceAtLeast(8f * density)),
                cornerRadius = CornerRadius(gripRadius, gripRadius)
            )
            drawLine(
                color = palette.railAccentLeft.copy(alpha = 0.85f),
                start = Offset(gripW, deckTop + 4f * density),
                end = Offset(gripW, h - 4f * density),
                strokeWidth = 1.4f * density
            )
            drawRoundRect(
                brush = Brush.verticalGradient(
                    colors = listOf(palette.rightBody, palette.rightBodyShade),
                    startY = deckTop,
                    endY = h
                ),
                topLeft = Offset(w - gripW, deckTop + 2f * density),
                size = Size(gripW + gripRadius, (deckH - 4f * density).coerceAtLeast(8f * density)),
                cornerRadius = CornerRadius(gripRadius, gripRadius)
            )
            drawLine(
                color = palette.railAccentRight.copy(alpha = 0.85f),
                start = Offset(w - gripW, deckTop + 4f * density),
                end = Offset(w - gripW, h - 4f * density),
                strokeWidth = 1.4f * density
            )
            val barInset = gripW + 8f * density
            if (w - 2f * barInset > 40f * density) {
                drawLine(
                    brush = Brush.horizontalGradient(
                        colors = listOf(
                            palette.leftBody.copy(alpha = 0.85f),
                            palette.accentGlow.copy(alpha = 0.90f),
                            palette.rightBody.copy(alpha = 0.85f)
                        ),
                        startX = barInset,
                        endX = w - barInset
                    ),
                    start = Offset(barInset, deckTop + 3f * density),
                    end = Offset(w - barInset, deckTop + 3f * density),
                    strokeWidth = 1.6f * density
                )
            }
        } else if (deckH >= 14f * density) {
            drawLine(
                color = if (palette.family == ConsoleSkinFamily.AURORA) {
                    palette.accentGlow.copy(alpha = 0.55f)
                } else {
                    palette.innerBevelLight.copy(alpha = if (palette.isLightSkin) 0.55f else 0.32f)
                },
                start = Offset(w * 0.08f, deckTop + 2f * density),
                end = Offset(w * 0.92f, deckTop + 2f * density),
                strokeWidth = 1.0f * density
            )
        }

        // Status strip directly below bottom screen when center gap is 0 (guarantees Power & Wi-Fi LEDs are ALWAYS visible!)
        if (!centerLedsDrawn && deckH >= 18f * density) {
            val stripY = deckTop + 10.5f * density
            val ledR = 2.1f * density
            val rightInset = if (palette.family == ConsoleSkinFamily.SWITCH && palette.hasPortraitSideRail) {
                (w * 0.075f).coerceIn(10f * density, 28f * density) + 12f * density
            } else {
                16f * density
            }
            val powerColor = when (palette.family) {
                ConsoleSkinFamily.SWITCH -> if (palette.accentGlow == Color(0xFF2DD4BF)) Color(0xFF2DD4BF) else Color(0xFF00E676)
                ConsoleSkinFamily.DS_LITE -> Color(0xFF00E676)
                ConsoleSkinFamily.AURORA -> Color(0xFF00E676)
                else -> Color(0xFF00B0FF)
            }
            val secondaryLedColor = when (palette.family) {
                ConsoleSkinFamily.AURORA, ConsoleSkinFamily.SWITCH -> palette.accentGlow
                else -> Color(0xFFFFB300)
            }
            drawGlowingLed(
                center = Offset(w - rightInset, stripY),
                baseColor = powerColor,
                alpha = ledAlpha,
                density = density,
                radiusDp = ledR / density,
                hasHalo = true
            )
            drawGlowingLed(
                center = Offset(w - rightInset - 11f * density, stripY),
                baseColor = secondaryLedColor,
                alpha = wifiAlpha,
                density = density,
                radiusDp = (ledR * 0.9f) / density,
                hasHalo = true
            )
            val slotW = 14f * density
            val slotH = 2.4f * density
            drawRoundRect(
                color = Color.Black.copy(alpha = 0.78f),
                topLeft = Offset((w - slotW) / 2f, stripY - slotH / 2f),
                size = Size(slotW, slotH),
                cornerRadius = CornerRadius(slotH / 2f, slotH / 2f)
            )
        }

        if (deckH >= 28f * density) {
            val portW = 18f * density
            val portH = 3.2f * density
            drawRoundRect(
                color = palette.innerBevelDark.copy(alpha = 0.85f),
                topLeft = Offset((w - portW) / 2f, h - 6f * density),
                size = Size(portW, portH),
                cornerRadius = CornerRadius(portH / 2f, portH / 2f)
            )
            drawRoundRect(
                color = palette.innerBevelLight.copy(alpha = 0.35f),
                topLeft = Offset((w - portW) / 2f, h - 6f * density),
                size = Size(portW, portH),
                cornerRadius = CornerRadius(portH / 2f, portH / 2f),
                style = Stroke(width = 0.6f * density)
            )
        }

        drawLine(
            color = palette.hingeShadow.copy(alpha = 0.55f),
            start = Offset(w * 0.16f, h - 2.0f * density),
            end = Offset(w * 0.84f, h - 2.0f * density),
            strokeWidth = 1.2f * density
        )
    }
}

private fun DrawScope.drawCameraLens(
    center: Offset,
    radiusPx: Float,
    palette: ConsoleSkinPalette,
    density: Float,
    includeIrEmitter: Boolean
) {
    drawCircle(
        color = Color(0xFF09090B),
        radius = radiusPx,
        center = center
    )
    drawCircle(
        color = palette.bezelAccent.copy(alpha = 0.85f),
        radius = radiusPx,
        center = center,
        style = Stroke(width = 0.75f * density)
    )
    drawCircle(
        color = Color(0xFF020617),
        radius = radiusPx * 0.58f,
        center = center
    )
    drawCircle(
        color = Color(0xFF38BDF8).copy(alpha = 0.85f),
        radius = radiusPx * 0.26f,
        center = Offset(center.x - radiusPx * 0.18f, center.y - radiusPx * 0.18f)
    )
    if (includeIrEmitter) {
        drawCircle(
            color = Color(0xFF3B0764).copy(alpha = 0.85f),
            radius = radiusPx * 0.38f,
            center = Offset(center.x + radiusPx * 2.1f, center.y)
        )
    }
}

private fun DrawScope.drawSingleScreenLayout(
    single: Rect,
    w: Float,
    h: Float,
    palette: ConsoleSkinPalette,
    ledAlpha: Float,
    wifiAlpha: Float,
    outerBezelPx: Float,
    density: Float
) {
    drawRect(
        brush = Brush.verticalGradient(
            colors = listOf(palette.secondaryBody, palette.primaryBody, palette.secondaryBody),
            startY = 0f, endY = h
        )
    )

    val leftW = (single.x.toFloat() - outerBezelPx).coerceAtLeast(0f)
    val rightW = (w - single.right.toFloat() - outerBezelPx).coerceAtLeast(0f)
    if (palette.family == ConsoleSkinFamily.SWITCH && palette.hasPortraitSideRail) {
        if (leftW >= 8f * density) {
            drawRect(
                brush = Brush.verticalGradient(listOf(palette.leftBody, palette.leftBodyShade)),
                topLeft = Offset(0f, 0f),
                size = Size(leftW, h)
            )
            drawLine(palette.railAccentLeft.copy(alpha = 0.85f), Offset(leftW - 1f * density, 0f), Offset(leftW - 1f * density, h), 1.5f * density)
        }
        if (rightW >= 8f * density) {
            drawRect(
                brush = Brush.verticalGradient(listOf(palette.rightBody, palette.rightBodyShade)),
                topLeft = Offset(w - rightW, 0f),
                size = Size(rightW, h)
            )
            drawLine(palette.railAccentRight.copy(alpha = 0.85f), Offset(w - rightW + 1f * density, 0f), Offset(w - rightW + 1f * density, h), 1.5f * density)
        }
    }

    val safeTopH = (single.y.toFloat() - outerBezelPx - 1f * density).coerceAtLeast(0f)
    if (safeTopH >= 8f * density) {
        drawBrandText(
            text = palette.brandTitle,
            centerX = w / 2f,
            centerY = safeTopH * 0.50f,
            maxHeightPx = safeTopH * 0.64f,
            maxWidthPx = w * 0.72f,
            palette = palette,
            density = density
        )
        drawGlowingLed(
            center = Offset(w - 16f * density, safeTopH * 0.50f),
            baseColor = if (palette.family == ConsoleSkinFamily.SWITCH || palette.family == ConsoleSkinFamily.DS_LITE) Color(0xFF00E676) else Color(0xFF00B0FF),
            alpha = ledAlpha,
            density = density,
            radiusDp = 2.0f,
            hasHalo = true
        )
        drawGlowingLed(
            center = Offset(w - 27f * density, safeTopH * 0.50f),
            baseColor = palette.accentGlow,
            alpha = wifiAlpha,
            density = density,
            radiusDp = 1.8f,
            hasHalo = true
        )
    } else if (h - single.bottom.toFloat() - outerBezelPx >= 18f * density) {
        val stripY = single.bottom.toFloat() + outerBezelPx + 10f * density
        drawGlowingLed(
            center = Offset(w - 16f * density, stripY),
            baseColor = Color(0xFF00E676),
            alpha = ledAlpha,
            density = density,
            radiusDp = 2.0f,
            hasHalo = true
        )
        drawGlowingLed(
            center = Offset(w - 27f * density, stripY),
            baseColor = palette.accentGlow,
            alpha = wifiAlpha,
            density = density,
            radiusDp = 1.8f,
            hasHalo = true
        )
    }
}

private fun DrawScope.drawScreenWellBezel(
    screen: Rect,
    palette: ConsoleSkinPalette,
    outerBezelPx: Float,
    density: Float
) {
    val x = screen.x.toFloat()
    val y = screen.y.toFloat()
    val sw = screen.width.toFloat()
    val sh = screen.height.toFloat()

    // Crisp outer beveled frame strictly bounded within [x - outerBezelPx .. x + sw + outerBezelPx]
    val frameStroke = (outerBezelPx * 0.65f).coerceAtLeast(1.5f * density)
    val frameHalf = frameStroke / 2f
    val frameOffset = outerBezelPx - frameHalf

    drawRect(
        color = palette.bezelAccent.copy(alpha = 0.88f),
        topLeft = Offset(x - frameOffset, y - frameOffset),
        size = Size(sw + 2f * frameOffset, sh + 2f * frameOffset),
        style = Stroke(width = frameStroke)
    )

    // Subtle recessed top/left shadow and bottom/right specular catch along the outer rim
    val edgeInset = outerBezelPx
    drawLine(
        color = palette.innerBevelDark.copy(alpha = 0.75f),
        start = Offset(x - edgeInset, y - edgeInset),
        end = Offset(x + sw + edgeInset, y - edgeInset),
        strokeWidth = 1.0f * density
    )
    drawLine(
        color = palette.innerBevelDark.copy(alpha = 0.75f),
        start = Offset(x - edgeInset, y - edgeInset),
        end = Offset(x - edgeInset, y + sh + edgeInset),
        strokeWidth = 1.0f * density
    )
    drawLine(
        color = palette.innerBevelLight.copy(alpha = 0.55f),
        start = Offset(x - edgeInset, y + sh + edgeInset),
        end = Offset(x + sw + edgeInset, y + sh + edgeInset),
        strokeWidth = 0.9f * density
    )
    drawLine(
        color = palette.innerBevelLight.copy(alpha = 0.55f),
        start = Offset(x + sw + edgeInset, y - edgeInset),
        end = Offset(x + sw + edgeInset, y + sh + edgeInset),
        strokeWidth = 0.9f * density
    )

    // Inner glass/accent rim immediately framing the game screen cutout
    val innerRimStroke = 1.1f * density
    val innerHalf = innerRimStroke / 2f
    if (palette.family == ConsoleSkinFamily.AURORA) {
        drawRect(
            brush = Brush.linearGradient(
                colors = listOf(
                    palette.accentGlow.copy(alpha = 0.90f),
                    palette.bezelAccent.copy(alpha = 0.75f),
                    palette.accentGlow.copy(alpha = 0.90f)
                ),
                start = Offset(x - innerHalf, y - innerHalf),
                end = Offset(x + sw + innerHalf, y + sh + innerHalf)
            ),
            topLeft = Offset(x - innerHalf, y - innerHalf),
            size = Size(sw + 2f * innerHalf, sh + 2f * innerHalf),
            style = Stroke(width = innerRimStroke)
        )
    } else {
        drawRect(
            color = palette.screenRimColor,
            topLeft = Offset(x - innerHalf, y - innerHalf),
            size = Size(sw + 2f * innerHalf, sh + 2f * innerHalf),
            style = Stroke(width = innerRimStroke)
        )
    }
}

private fun DrawScope.drawChassisDeckPanel(
    left: Float,
    top: Float,
    width: Float,
    height: Float,
    palette: ConsoleSkinPalette
) {
    if (width <= 0f || height <= 0f) return
    drawRect(
        brush = Brush.verticalGradient(
            colors = listOf(palette.secondaryBody, palette.primaryBody),
            startY = top,
            endY = top + height
        ),
        topLeft = Offset(left, top),
        size = Size(width, height)
    )
}

private fun DrawScope.drawBrandText(
    text: String,
    centerX: Float,
    centerY: Float,
    maxHeightPx: Float,
    maxWidthPx: Float,
    palette: ConsoleSkinPalette,
    density: Float
) {
    if (text.isBlank() || maxHeightPx < 6f * density || maxWidthPx < 24f * density) return
    drawIntoCanvas { canvas ->
        val paint = Paint().apply {
            isAntiAlias = true
            textAlign = Paint.Align.CENTER
            typeface = Typeface.create(Typeface.DEFAULT, Typeface.BOLD)
            letterSpacing = 0.06f
            color = palette.brandTextColor.toArgb()
        }

        // Fit text height strictly within maxHeightPx and width strictly within maxWidthPx
        var sizePx = (10.0f * density).coerceAtMost(maxHeightPx * 0.85f).coerceAtLeast(6.5f * density)
        paint.textSize = sizePx
        val measuredW = paint.measureText(text)
        if (measuredW > maxWidthPx && measuredW > 0f) {
            sizePx = (sizePx * (maxWidthPx / measuredW)).coerceAtLeast(6.0f * density)
            paint.textSize = sizePx
        }
        val fm = paint.fontMetrics
        val textH = fm.descent - fm.ascent
        if (textH > maxHeightPx && textH > 0f) {
            sizePx = (sizePx * (maxHeightPx / textH)).coerceAtLeast(5.8f * density)
            paint.textSize = sizePx
        }

        val finalFm = paint.fontMetrics
        val baselineY = centerY - (finalFm.ascent + finalFm.descent) / 2f
        canvas.nativeCanvas.drawText(text, centerX, baselineY, paint)
    }
}

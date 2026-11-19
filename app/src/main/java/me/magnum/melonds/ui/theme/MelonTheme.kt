package me.magnum.melonds.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.Colors
import androidx.compose.material.LocalContentColor
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.luminance

val watermelon: WatermelonColors
    @Composable get() = LocalWatermelonColors.current

private fun watermelonMaterialColors(colors: WatermelonColors): Colors {
    val onAccent = if (colors.green.luminance() > 0.45f) Color(0xFF0A0A0F) else Color.White
    return if (colors.isDark) {
        darkColors(
            primary = colors.green,
            primaryVariant = colors.greenDim,
            secondary = colors.green,
            secondaryVariant = colors.greenDim,
            background = colors.bg,
            surface = colors.surface,
            error = colors.red,
            onPrimary = onAccent,
            onSecondary = onAccent,
            onBackground = colors.text,
            onSurface = colors.text,
            onError = Color.White,
        )
    } else {
        lightColors(
            primary = colors.green,
            primaryVariant = colors.greenDim,
            secondary = colors.green,
            secondaryVariant = colors.greenDim,
            background = colors.bg,
            surface = colors.surface,
            error = colors.red,
            onPrimary = onAccent,
            onSecondary = onAccent,
            onBackground = colors.text,
            onSurface = colors.text,
            onError = Color.White,
        )
    }
}

@Composable
fun MelonTheme(
    isDarkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val theme = AppThemeManager.themeState.value
    val baseColors = baseWatermelonColorsFor(theme, isDarkTheme)
    val accentKey = AppThemeManager.accentColorState.value
    val watermelonColors = getCustomizedAccentColors(baseColors, accentKey)

    CompositionLocalProvider(
        LocalWatermelonColors provides watermelonColors,
        LocalContentColor provides watermelonColors.text,
    ) {
        MaterialTheme(
            colors = watermelonMaterialColors(watermelonColors),
            typography = MelonTypography,
        ) {
            content()
        }
    }
}

package me.magnum.melonds.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color
import me.magnum.melonds.ui.Theme

val watermelon: WatermelonColors
    @Composable get() = LocalWatermelonColors.current

private fun watermelonMaterialColors(colors: WatermelonColors): Colors {
    return if (colors.isDark) {
        darkColors(
            primary = colors.red,
            primaryVariant = colors.red,
            secondary = colors.green,
            secondaryVariant = colors.green,
            background = colors.bg,
            surface = colors.surface,
            error = colors.red,
            onPrimary = Color.White,
            onSecondary = Color.White,
            onBackground = colors.text,
            onSurface = colors.text,
            onError = Color.White,
        )
    } else {
        lightColors(
            primary = colors.red,
            primaryVariant = colors.red,
            secondary = colors.green,
            secondaryVariant = colors.green,
            background = colors.bg,
            surface = colors.surface,
            error = colors.red,
            onPrimary = Color.White,
            onSecondary = Color.White,
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
    val watermelonColors = when (theme) {
        Theme.LIGHT -> LightWatermelonColors
        Theme.MIDNIGHT -> MidnightWatermelonColors
        Theme.CYBERPUNK -> CyberpunkWatermelonColors
        Theme.GOTHIC -> GothicWatermelonColors
        Theme.DARK -> DarkWatermelonColors
        Theme.SYSTEM -> if (isDarkTheme) DarkWatermelonColors else LightWatermelonColors
    }

    CompositionLocalProvider(LocalWatermelonColors provides watermelonColors) {
        MaterialTheme(
            colors = watermelonMaterialColors(watermelonColors),
            typography = MelonTypography,
        ) {
            content()
        }
    }
}

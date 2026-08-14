package me.magnum.melonds.ui.theme

import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import me.magnum.melonds.R

val uncheckedThumbColor: Color @Composable get() = colorResource(id = R.color.switchThumbUnselected)
val gameMasteryColor: Color get() = Color(0xFFFFD700)

val LightMelonColors @Composable get() = lightColors(
    primary = Color(0xFF0066FF),
    primaryVariant = Color(0xFFF3F4F8),
    secondary = Color(0xFF00B4D8),
    secondaryVariant = Color(0xFF0066FF),
    background = Color(0xFFF3F4F8),
    surface = Color(0xFFFFFFFF),
    onPrimary = Color(0xFFFFFFFF),
    onSecondary = Color(0xFFFFFFFF),
    onSurface = Color(0xFF111827),
    onBackground = Color(0xFF4B5563),
)

val DarkMelonColors @Composable get() = darkColors(
    primary = Color(0xFF00E5FF),
    primaryVariant = Color(0xFF000000),
    secondary = Color(0xFF7B2CBF),
    secondaryVariant = Color(0xFF00E5FF),
    background = Color(0xFF000000),
    surface = Color(0xFF0D0D10),
    onPrimary = Color(0xFF000000),
    onSecondary = Color(0xFFFFFFFF),
    onSurface = Color(0xFFFFFFFF),
    onBackground = Color(0xA5A5B5),
)
package me.magnum.melonds.ui.theme

import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

val MelonTypography @Composable get() = Typography(
    defaultFontFamily = Manrope,
    h4 = androidx.compose.material.MaterialTheme.typography.h4.copy(fontFamily = SpaceGrotesk, fontWeight = FontWeight.Bold),
    h5 = androidx.compose.material.MaterialTheme.typography.h5.copy(fontFamily = SpaceGrotesk, fontWeight = FontWeight.Bold),
    h6 = androidx.compose.material.MaterialTheme.typography.h6.copy(fontFamily = SpaceGrotesk, fontWeight = FontWeight.SemiBold),
    subtitle1 = androidx.compose.material.MaterialTheme.typography.subtitle1.copy(fontFamily = SpaceGrotesk, fontWeight = FontWeight.SemiBold),
    body1 = androidx.compose.material.MaterialTheme.typography.body1.copy(lineHeight = 20.sp),
    button = androidx.compose.material.MaterialTheme.typography.button.copy(fontFamily = SpaceGrotesk, fontWeight = FontWeight.Bold),
)

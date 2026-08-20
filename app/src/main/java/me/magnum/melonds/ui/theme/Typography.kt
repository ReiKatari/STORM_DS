package me.magnum.melonds.ui.theme

import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineBreak
import androidx.compose.ui.text.style.Hyphens
import androidx.compose.ui.unit.sp

val MelonTypography @Composable get() = Typography(
    defaultFontFamily = Manrope,
    h4 = androidx.compose.material.MaterialTheme.typography.h4.copy(
        fontFamily = SpaceGrotesk,
        fontWeight = FontWeight.Bold,
        letterSpacing = (-0.5).sp,
        lineHeight = 36.sp,
    ),
    h5 = androidx.compose.material.MaterialTheme.typography.h5.copy(
        fontFamily = SpaceGrotesk,
        fontWeight = FontWeight.Bold,
        letterSpacing = (-0.3).sp,
        lineHeight = 30.sp,
    ),
    h6 = androidx.compose.material.MaterialTheme.typography.h6.copy(
        fontFamily = SpaceGrotesk,
        fontWeight = FontWeight.SemiBold,
        letterSpacing = (-0.2).sp,
        lineHeight = 26.sp,
    ),
    subtitle1 = androidx.compose.material.MaterialTheme.typography.subtitle1.copy(
        fontFamily = SpaceGrotesk,
        fontWeight = FontWeight.SemiBold,
        lineHeight = 22.sp,
    ),
    subtitle2 = androidx.compose.material.MaterialTheme.typography.subtitle2.copy(
        fontFamily = Manrope,
        fontWeight = FontWeight.Medium,
        lineHeight = 20.sp,
        letterSpacing = 0.1.sp,
    ),
    body1 = androidx.compose.material.MaterialTheme.typography.body1.copy(
        lineHeight = 22.sp,
        letterSpacing = 0.15.sp,
    ),
    body2 = androidx.compose.material.MaterialTheme.typography.body2.copy(
        lineHeight = 20.sp,
        letterSpacing = 0.15.sp,
    ),
    button = androidx.compose.material.MaterialTheme.typography.button.copy(
        fontFamily = SpaceGrotesk,
        fontWeight = FontWeight.Bold,
        letterSpacing = 0.5.sp,
    ),
    caption = androidx.compose.material.MaterialTheme.typography.caption.copy(
        lineHeight = 16.sp,
        letterSpacing = 0.2.sp,
    ),
    overline = androidx.compose.material.MaterialTheme.typography.overline.copy(
        fontFamily = SpaceGrotesk,
        fontWeight = FontWeight.SemiBold,
        letterSpacing = 1.sp,
    ),
)

package me.magnum.melonds.ui.theme

import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontVariation
import androidx.compose.ui.text.font.FontWeight
import me.magnum.melonds.R

@OptIn(ExperimentalTextApi::class)
private fun variableFont(resId: Int, weight: FontWeight) = Font(
    resId = resId,
    weight = weight,
    variationSettings = FontVariation.Settings(FontVariation.weight(weight.weight)),
)

val SpaceGrotesk = FontFamily(
    variableFont(R.font.space_grotesk, FontWeight.Normal),
    variableFont(R.font.space_grotesk, FontWeight.Medium),
    variableFont(R.font.space_grotesk, FontWeight.SemiBold),
    variableFont(R.font.space_grotesk, FontWeight.Bold),
)

val Manrope = FontFamily(
    variableFont(R.font.manrope, FontWeight.Normal),
    variableFont(R.font.manrope, FontWeight.Medium),
    variableFont(R.font.manrope, FontWeight.SemiBold),
    variableFont(R.font.manrope, FontWeight.Bold),
    variableFont(R.font.manrope, FontWeight.ExtraBold),
)

val WatermelonMono = FontFamily.Monospace

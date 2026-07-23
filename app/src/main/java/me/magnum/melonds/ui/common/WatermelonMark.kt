package me.magnum.melonds.ui.common

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import me.magnum.melonds.ui.theme.watermelon

private val SeedColor = Color(0xFF2E0F0C)

private val Seeds = listOf(
    3.7f to 5.8f,
    7.0f to 7.2f,
    10.0f to 7.2f,
    13.3f to 5.8f,
)
private const val SeedRx = 0.8f
private const val SeedRy = 1.1f

@Composable
fun WatermelonMark(
    modifier: Modifier = Modifier,
    height: Dp = 24.dp,
) {
    val colors = watermelon
    Canvas(modifier.size(width = height * 17f / 24f, height = height)) {
        val u = size.height / 24f
        val barSize = Size(17f * u, 11f * u)
        val corner = CornerRadius(3f * u, 3f * u)

        drawRoundRect(color = colors.red, topLeft = Offset.Zero, size = barSize, cornerRadius = corner)
        drawRoundRect(color = colors.green, topLeft = Offset(0f, 13f * u), size = barSize, cornerRadius = corner)

        Seeds.forEach { (cx, cy) ->
            drawOval(
                color = SeedColor,
                topLeft = Offset((cx - SeedRx) * u, (cy - SeedRy) * u),
                size = Size(SeedRx * 2f * u, SeedRy * 2f * u),
            )
        }
    }
}

package me.magnum.melonds.ui.common

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun WatermelonMark(
    modifier: Modifier = Modifier,
    height: Dp = 24.dp,
) {
    Canvas(modifier = modifier.size(width = height * 18f / 24f, height = height)) {
        val u = size.height / 24f
        val screenWidth = 18f * u
        val screenHeight = 11f * u
        val corner = CornerRadius(2.8f * u, 2.8f * u)

        val topBrush = Brush.linearGradient(
            colors = listOf(Color(0xFF00E5FF), Color(0xFF0066FF)),
            start = Offset(0f, 0f),
            end = Offset(screenWidth, screenHeight),
        )
        val bottomBrush = Brush.linearGradient(
            colors = listOf(Color(0xFF0066FF), Color(0xFF7B2CBF)),
            start = Offset(0f, 13f * u),
            end = Offset(screenWidth, 24f * u),
        )

        // Top DS Screen
        drawRoundRect(
            brush = topBrush,
            topLeft = Offset.Zero,
            size = Size(screenWidth, screenHeight),
            cornerRadius = corner,
        )

        // Bottom DS Screen
        drawRoundRect(
            brush = bottomBrush,
            topLeft = Offset(0f, 13f * u),
            size = Size(screenWidth, screenHeight),
            cornerRadius = corner,
        )

        // STORM Lightning Bolt Path
        val lightningPath = Path().apply {
            moveTo(10.5f * u, 1.5f * u)
            lineTo(5.5f * u, 11.5f * u)
            lineTo(9.5f * u, 11.5f * u)
            lineTo(6.5f * u, 22.5f * u)
            lineTo(13.5f * u, 10.5f * u)
            lineTo(9.5f * u, 10.5f * u)
            close()
        }

        drawPath(path = lightningPath, color = Color.White)
    }
}

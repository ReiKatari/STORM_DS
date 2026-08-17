package me.magnum.melonds.ui.emulator.skin

import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

enum class ConsoleSkinTheme {
    DS_LITE_BLACK,
    DS_LITE_WHITE,
    DSI_XL_BLUE,
    CRIMSON_RED
}

@Composable
fun ConsoleSkinHingeAndLeds(
    skinTheme: ConsoleSkinTheme = ConsoleSkinTheme.DS_LITE_BLACK,
    modifier: Modifier = Modifier,
) {
    val infiniteTransition = rememberInfiniteTransition(label = "ledPulse")
    val ledAlpha by infiniteTransition.animateFloat(
        initialValue = 0.6f, targetValue = 1.0f,
        animationSpec = infiniteRepeatable(tween(1200, easing = LinearEasing), RepeatMode.Reverse),
        label = "ledAlpha"
    )
    val wifiAlpha by infiniteTransition.animateFloat(
        initialValue = 0.2f, targetValue = 0.9f,
        animationSpec = infiniteRepeatable(tween(400, easing = LinearEasing), RepeatMode.Reverse),
        label = "wifiAlpha"
    )

    val (bodyColor, bezelColor, accentColor) = when (skinTheme) {
        ConsoleSkinTheme.DS_LITE_WHITE -> Triple(Color(0xFFE2E8F0), Color(0xFFCBD5E1), Color(0xFF94A3B8))
        ConsoleSkinTheme.DSI_XL_BLUE -> Triple(Color(0xFF0F172A), Color(0xFF1E293B), Color(0xFF38BDF8))
        ConsoleSkinTheme.CRIMSON_RED -> Triple(Color(0xFF881337), Color(0xFF4C0519), Color(0xFFF43F5E))
        else -> Triple(Color(0xFF18181B), Color(0xFF27272A), Color(0xFF52525B))
    }

    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(18.dp)
            .background(
                Brush.verticalGradient(
                    listOf(
                        bezelColor.copy(alpha = 0.95f),
                        bodyColor,
                        bezelColor.copy(alpha = 0.95f)
                    )
                )
            )
            .border(1.dp, Color.Black.copy(alpha = 0.6f)),
        contentAlignment = Alignment.Center
    ) {
        // Metallic Hinge Cylinder
        Box(
            modifier = Modifier
                .fillMaxWidth(0.85f)
                .height(6.dp)
                .clip(RoundedCornerShape(3.dp))
                .background(
                    Brush.verticalGradient(
                        listOf(Color(0xFF71717A), Color(0xFF27272A), Color(0xFF71717A))
                    )
                )
        )

        // LED Indicators row (Power & Wi-Fi)
        Row(
            modifier = Modifier
                .align(Alignment.CenterEnd)
                .padding(end = 24.dp),
            horizontalArrangement = Arrangement.spacedBy(6.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Wi-Fi LED (Blinking Orange)
            Box(
                modifier = Modifier
                    .size(5.dp)
                    .clip(CircleShape)
                    .background(Color(0xFFF59E0B).copy(alpha = wifiAlpha))
                    .shadow(4.dp, CircleShape)
            )

            // Power LED (Glowing Solid Green)
            Box(
                modifier = Modifier
                    .size(5.dp)
                    .clip(CircleShape)
                    .background(Color(0xFF10B981).copy(alpha = ledAlpha))
                    .shadow(4.dp, CircleShape)
            )
        }
    }
}

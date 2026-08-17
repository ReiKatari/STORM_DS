package me.magnum.melonds.ui.emulator.skin

import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

enum class ConsoleSkinTheme {
    DS_LITE_BLACK,
    DS_LITE_WHITE,
    DSI_XL_BLUE,
    CRIMSON_RED,
    N3DS_AQUA,
    N3DS_BLACK
}

@Composable
fun ConsoleSkinFullFrame(
    skinTheme: ConsoleSkinTheme = ConsoleSkinTheme.DS_LITE_BLACK,
    modifier: Modifier = Modifier,
) {
    val infiniteTransition = rememberInfiniteTransition(label = "ledPulse")
    val ledAlpha by infiniteTransition.animateFloat(
        initialValue = 0.65f, targetValue = 1.0f,
        animationSpec = infiniteRepeatable(tween(1100, easing = LinearEasing), RepeatMode.Reverse),
        label = "ledAlpha"
    )
    val wifiAlpha by infiniteTransition.animateFloat(
        initialValue = 0.2f, targetValue = 0.95f,
        animationSpec = infiniteRepeatable(tween(350, easing = LinearEasing), RepeatMode.Reverse),
        label = "wifiAlpha"
    )

    val (bodyColor, bezelColor, brandName) = when (skinTheme) {
        ConsoleSkinTheme.DS_LITE_WHITE -> Triple(Color(0xFFE2E8F0), Color(0xFFCBD5E1), "Nintendo DS Lite")
        ConsoleSkinTheme.DSI_XL_BLUE -> Triple(Color(0xFF0F172A), Color(0xFF1E293B), "Nintendo DSi XL")
        ConsoleSkinTheme.CRIMSON_RED -> Triple(Color(0xFF881337), Color(0xFF4C0519), "Nintendo DS Lite Crimson")
        ConsoleSkinTheme.N3DS_AQUA -> Triple(Color(0xFF0284C7), Color(0xFF0369A1), "Nintendo 3DS Aqua")
        ConsoleSkinTheme.N3DS_BLACK -> Triple(Color(0xFF1E1E24), Color(0xFF2B2B36), "New Nintendo 3DS XL")
        else -> Triple(Color(0xFF18181B), Color(0xFF27272A), "Nintendo DS Lite")
    }

    Box(
        modifier = modifier
            .fillMaxSize()
    ) {
        // Top Bezel Header
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(28.dp)
                .align(Alignment.TopCenter)
                .background(
                    Brush.verticalGradient(
                        listOf(bodyColor, bezelColor)
                    )
                )
                .border(1.dp, Color.Black.copy(alpha = 0.7f)),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = brandName,
                color = Color.White.copy(alpha = 0.45f),
                fontSize = 10.sp,
                fontWeight = FontWeight.Bold
            )
        }

        // Central Metallic Hinge & Status LEDs
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(18.dp)
                .align(Alignment.Center)
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
            // Metallic Cylinder Hinge
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

            // LED Indicators (Power & Wi-Fi)
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
}

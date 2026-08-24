package me.magnum.melonds.ui.emulator.composables

import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.magnum.melonds.domain.model.ConsoleType

@Composable
fun Console3DBootScreen(
    consoleType: ConsoleType,
    statusText: String = "Launching System Firmware…",
    modifier: Modifier = Modifier,
) {
    val isDsi = consoleType == ConsoleType.DSi

    val infiniteTransition = rememberInfiniteTransition(label = "console_anim")
    val floatAnim by infiniteTransition.animateFloat(
        initialValue = -2.5f,
        targetValue = 2.5f,
        animationSpec = infiniteRepeatable(
            animation = tween(2400, easing = FastOutSlowInEasing),
            repeatMode = RepeatMode.Reverse,
        ),
        label = "float",
    )
    val ledGlow by infiniteTransition.animateFloat(
        initialValue = 0.45f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(900, easing = LinearEasing),
            repeatMode = RepeatMode.Reverse,
        ),
        label = "led_glow",
    )
    val wifiBlink by infiniteTransition.animateFloat(
        initialValue = 0.2f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(500, easing = LinearEasing),
            repeatMode = RepeatMode.Reverse,
        ),
        label = "wifi_blink",
    )

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(
                Brush.radialGradient(
                    colors = listOf(
                        if (isDsi) Color(0xFF1E2430) else Color(0xFF1C222C),
                        Color(0xFF090C10),
                        Color(0xFF030507),
                    ),
                    radius = 1200f,
                )
            ),
        contentAlignment = Alignment.Center,
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .padding(16.dp)
                .rotate(floatAnim * 0.4f),
        ) {
            // 3D Handheld Console Casing
            Box(
                modifier = Modifier
                    .width(320.dp)
                    .shadow(elevation = 28.dp, shape = RoundedCornerShape(22.dp), spotColor = Color(0x99000000))
                    .clip(RoundedCornerShape(22.dp))
                    .background(
                        Brush.linearGradient(
                            colors = if (isDsi) {
                                listOf(Color(0xFF2B323D), Color(0xFF1A1F26), Color(0xFF12161C))
                            } else {
                                listOf(Color(0xFF4A5260), Color(0xFF323842), Color(0xFF20242B))
                            },
                            start = Offset(0f, 0f),
                            end = Offset(320f, 600f),
                        )
                    )
                    .border(
                        width = 1.5.dp,
                        brush = Brush.linearGradient(
                            colors = listOf(
                                Color(0x66FFFFFF),
                                Color(0x22FFFFFF),
                                Color(0x11000000),
                            )
                        ),
                        shape = RoundedCornerShape(22.dp)
                    )
                    .padding(horizontal = 14.dp, vertical = 12.dp)
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    // Top Upper Bezel with Logo & Speaker Grilles
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 10.dp, vertical = 4.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        // Left Speaker Grille (3x2 dots)
                        SpeakerGrille()

                        // Console Logo Badge
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Box(
                                modifier = Modifier
                                    .size(10.dp)
                                    .border(1.5.dp, Color(0xFFE2E8F0), RoundedCornerShape(2.dp))
                            )
                            Spacer(Modifier.width(3.dp))
                            Box(
                                modifier = Modifier
                                    .size(10.dp)
                                    .border(1.5.dp, Color(0xFFE2E8F0), RoundedCornerShape(2.dp))
                            )
                            Spacer(Modifier.width(6.dp))
                            Text(
                                text = if (isDsi) "Nintendo DSi" else "Nintendo DS",
                                color = Color(0xFFF1F5F9),
                                fontSize = 13.sp,
                                fontWeight = FontWeight.ExtraBold,
                                fontFamily = FontFamily.Monospace,
                                letterSpacing = 1.sp,
                            )
                        }

                        // Right Speaker Grille (3x2 dots)
                        SpeakerGrille()
                    }

                    Spacer(Modifier.height(6.dp))

                    // TOP SCREEN
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(130.dp)
                            .shadow(8.dp, RoundedCornerShape(8.dp))
                            .clip(RoundedCornerShape(8.dp))
                            .background(Color(0xFF0F141C))
                            .border(1.dp, Color(0x33FFFFFF), RoundedCornerShape(8.dp)),
                        contentAlignment = Alignment.Center,
                    ) {
                        // LCD Screen Inner Gradient / Glow
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .background(
                                    Brush.verticalGradient(
                                        colors = listOf(
                                            Color(0xFF16202E),
                                            Color(0xFF0E151F),
                                            Color(0xFF080D14),
                                        )
                                    )
                                )
                        )

                        // Top Screen Content: Animated Console Logo
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center,
                        ) {
                            Text(
                                text = if (isDsi) "STORM DSi" else "STORM DS",
                                color = Color(0xFF38BDF8),
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Black,
                                letterSpacing = 2.sp,
                            )
                            Spacer(Modifier.height(4.dp))
                            Text(
                                text = if (isDsi) "SYSTEM FIRMWARE v1.4.5" else "SYSTEM FIRMWARE v5",
                                color = Color(0xFF94A3B8),
                                fontSize = 9.sp,
                                fontWeight = FontWeight.Medium,
                                fontFamily = FontFamily.Monospace,
                            )
                            Spacer(Modifier.height(8.dp))
                            LinearProgressIndicator(
                                modifier = Modifier
                                    .width(140.dp)
                                    .height(3.dp)
                                    .clip(RoundedCornerShape(2.dp)),
                                color = Color(0xFF38BDF8),
                                backgroundColor = Color(0xFF1E293B),
                            )
                        }

                        // Subtle Glass Specular Reflection Highlight
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .background(
                                    Brush.linearGradient(
                                        colors = listOf(
                                            Color(0x18FFFFFF),
                                            Color(0x00FFFFFF),
                                            Color(0x00000000),
                                        ),
                                        start = Offset(0f, 0f),
                                        end = Offset(200f, 130f),
                                    )
                                )
                        )
                    }

                    Spacer(Modifier.height(8.dp))

                    // CENTER HINGE & CAMERAS / LEDS
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(18.dp)
                            .clip(RoundedCornerShape(4.dp))
                            .background(
                                Brush.verticalGradient(
                                    colors = listOf(
                                        Color(0xFF1C222B),
                                        Color(0xFF3A4454),
                                        Color(0xFF1A1F26),
                                    )
                                )
                            )
                            .padding(horizontal = 12.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                    ) {
                        // Left Hinge Cylindrical End
                        Box(
                            modifier = Modifier
                                .size(10.dp, 10.dp)
                                .background(Color(0xFF475569), CircleShape)
                        )

                        // Center: Camera Lens (DSi) or Microphone Hole (DS)
                        if (isDsi) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Box(
                                    modifier = Modifier
                                        .size(9.dp)
                                        .background(Color(0xFF0F172A), CircleShape)
                                        .border(1.dp, Color(0xFF38BDF8), CircleShape),
                                    contentAlignment = Alignment.Center,
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .size(3.dp)
                                            .background(Color(0xFF60A5FA), CircleShape)
                                    )
                                }
                                Spacer(Modifier.width(5.dp))
                                Text(
                                    text = "CAM",
                                    color = Color(0xFF64748B),
                                    fontSize = 7.sp,
                                    fontWeight = FontWeight.Bold,
                                )
                            }
                        } else {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Box(
                                    modifier = Modifier
                                        .size(4.dp)
                                        .background(Color(0xFF0F172A), CircleShape)
                                )
                                Spacer(Modifier.width(4.dp))
                                Text(
                                    text = "MIC",
                                    color = Color(0xFF64748B),
                                    fontSize = 7.sp,
                                    fontWeight = FontWeight.Bold,
                                )
                            }
                        }

                        // Right: Status LED Indicators (Power 🟢, Battery 🟡, Wi-Fi 🔵)
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            // Wi-Fi LED
                            Box(
                                modifier = Modifier
                                    .size(5.dp)
                                    .background(Color(0xFF0284C7).copy(alpha = wifiBlink), CircleShape)
                            )
                            Spacer(Modifier.width(4.dp))
                            // Battery LED
                            Box(
                                modifier = Modifier
                                    .size(5.dp)
                                    .background(Color(0xFFF59E0B), CircleShape)
                            )
                            Spacer(Modifier.width(4.dp))
                            // Power LED
                            Box(
                                modifier = Modifier
                                    .size(6.dp)
                                    .background(Color(0xFF10B981).copy(alpha = ledGlow), CircleShape)
                                    .shadow(4.dp, CircleShape, spotColor = Color(0xFF10B981))
                            )
                        }
                    }

                    Spacer(Modifier.height(8.dp))

                    // BOTTOM TOUCH SCREEN & CONTROLS
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        // Left: 3D D-PAD
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center,
                            modifier = Modifier.padding(start = 2.dp),
                        ) {
                            Box(
                                modifier = Modifier.size(52.dp),
                                contentAlignment = Alignment.Center,
                            ) {
                                // Vertical Arm
                                Box(
                                    modifier = Modifier
                                        .size(16.dp, 48.dp)
                                        .background(
                                            Brush.verticalGradient(
                                                listOf(Color(0xFF334155), Color(0xFF1E293B), Color(0xFF0F172A))
                                            ),
                                            RoundedCornerShape(3.dp)
                                        )
                                        .border(0.8.dp, Color(0x33FFFFFF), RoundedCornerShape(3.dp))
                                )
                                // Horizontal Arm
                                Box(
                                    modifier = Modifier
                                        .size(48.dp, 16.dp)
                                        .background(
                                            Brush.horizontalGradient(
                                                listOf(Color(0xFF334155), Color(0xFF1E293B), Color(0xFF0F172A))
                                            ),
                                            RoundedCornerShape(3.dp)
                                        )
                                        .border(0.8.dp, Color(0x33FFFFFF), RoundedCornerShape(3.dp))
                                )
                                // Center Circular Well
                                Box(
                                    modifier = Modifier
                                        .size(10.dp)
                                        .background(Color(0xFF0F172A), CircleShape)
                                )
                            }
                        }

                        // Center: BOTTOM TOUCH SCREEN
                        Box(
                            modifier = Modifier
                                .width(170.dp)
                                .height(125.dp)
                                .shadow(6.dp, RoundedCornerShape(6.dp))
                                .clip(RoundedCornerShape(6.dp))
                                .background(Color(0xFF0F141C))
                                .border(1.dp, Color(0x33FFFFFF), RoundedCornerShape(6.dp)),
                            contentAlignment = Alignment.Center,
                        ) {
                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .background(
                                        Brush.verticalGradient(
                                            colors = listOf(
                                                Color(0xFF111827),
                                                Color(0xFF0B0F19),
                                                Color(0xFF05080E),
                                            )
                                        )
                                    )
                            )
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier.padding(8.dp),
                            ) {
                                Text(
                                    text = "TOUCH TO START",
                                    color = Color(0xFFE2E8F0).copy(alpha = ledGlow),
                                    fontSize = 11.sp,
                                    fontWeight = FontWeight.Bold,
                                    letterSpacing = 1.sp,
                                )
                                Spacer(Modifier.height(4.dp))
                                Text(
                                    text = if (isDsi) "DSi NAND / SD Flash Ready" else "Slot-1 DS Card Ready",
                                    color = Color(0xFF64748B),
                                    fontSize = 8.sp,
                                    fontFamily = FontFamily.Monospace,
                                )
                            }
                        }

                        // Right: 3D ACTION BUTTONS (X, Y, A, B)
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center,
                            modifier = Modifier.padding(end = 2.dp),
                        ) {
                            Box(
                                modifier = Modifier.size(52.dp),
                                contentAlignment = Alignment.Center,
                            ) {
                                // X (Top)
                                ConsoleButton(
                                    label = "X",
                                    color = Color(0xFF38BDF8),
                                    modifier = Modifier.align(Alignment.TopCenter)
                                )
                                // Y (Left)
                                ConsoleButton(
                                    label = "Y",
                                    color = Color(0xFF34D399),
                                    modifier = Modifier.align(Alignment.CenterStart)
                                )
                                // A (Right)
                                ConsoleButton(
                                    label = "A",
                                    color = Color(0xFFF87171),
                                    modifier = Modifier.align(Alignment.CenterEnd)
                                )
                                // B (Bottom)
                                ConsoleButton(
                                    label = "B",
                                    color = Color(0xFFFBBF24),
                                    modifier = Modifier.align(Alignment.BottomCenter)
                                )
                            }
                        }
                    }

                    Spacer(Modifier.height(8.dp))

                    // Bottom Bar: Start, Select, Power Buttons
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 14.dp, vertical = 2.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        // Power Button (Bottom Left on DSi, Top Right on DS)
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Box(
                                modifier = Modifier
                                    .size(10.dp)
                                    .background(Color(0xFF1E293B), CircleShape)
                                    .border(1.dp, Color(0xFF10B981), CircleShape)
                            )
                            Spacer(Modifier.width(4.dp))
                            Text(
                                text = "POWER",
                                color = Color(0xFF64748B),
                                fontSize = 7.sp,
                                fontWeight = FontWeight.Bold,
                            )
                        }

                        // Start & Select Pill Buttons
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Box(
                                    modifier = Modifier
                                        .size(14.dp, 5.dp)
                                        .background(Color(0xFF334155), RoundedCornerShape(2.dp))
                                )
                                Text(
                                    text = "SELECT",
                                    color = Color(0xFF64748B),
                                    fontSize = 6.sp,
                                    fontWeight = FontWeight.Bold,
                                )
                            }
                            Spacer(Modifier.width(10.dp))
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Box(
                                    modifier = Modifier
                                        .size(14.dp, 5.dp)
                                        .background(Color(0xFF334155), RoundedCornerShape(2.dp))
                                )
                                Text(
                                    text = "START",
                                    color = Color(0xFF64748B),
                                    fontSize = 6.sp,
                                    fontWeight = FontWeight.Bold,
                                )
                            }
                        }
                    }
                }
            }

            Spacer(Modifier.height(20.dp))

            // Subtitle & Status Details
            Text(
                text = statusText,
                color = Color(0xFFF1F5F9),
                fontSize = 13.sp,
                fontWeight = FontWeight.SemiBold,
            )
            Spacer(Modifier.height(4.dp))
            Text(
                text = if (isDsi) {
                    "Nintendo DSi Architecture • ARM946E-S @ 133MHz • 16MB RAM • NAND Synced"
                } else {
                    "Nintendo DS Architecture • ARM946E-S @ 67MHz • 4MB RAM • Direct Boot"
                },
                color = Color(0xFF64748B),
                fontSize = 9.sp,
                fontFamily = FontFamily.Monospace,
            )
        }
    }
}

@Composable
private fun SpeakerGrille() {
    Column(verticalArrangement = Arrangement.spacedBy(2.dp)) {
        Row(horizontalArrangement = Arrangement.spacedBy(2.dp)) {
            Box(Modifier.size(2.dp).background(Color(0xFF0F172A), CircleShape))
            Box(Modifier.size(2.dp).background(Color(0xFF0F172A), CircleShape))
            Box(Modifier.size(2.dp).background(Color(0xFF0F172A), CircleShape))
        }
        Row(horizontalArrangement = Arrangement.spacedBy(2.dp)) {
            Box(Modifier.size(2.dp).background(Color(0xFF0F172A), CircleShape))
            Box(Modifier.size(2.dp).background(Color(0xFF0F172A), CircleShape))
            Box(Modifier.size(2.dp).background(Color(0xFF0F172A), CircleShape))
        }
    }
}

@Composable
private fun ConsoleButton(
    label: String,
    color: Color,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .size(15.dp)
            .shadow(3.dp, CircleShape)
            .clip(CircleShape)
            .background(
                Brush.radialGradient(
                    colors = listOf(
                        Color(0xFF475569),
                        Color(0xFF1E293B),
                        Color(0xFF0F172A),
                    )
                )
            )
            .border(0.6.dp, color.copy(alpha = 0.6f), CircleShape),
        contentAlignment = Alignment.Center,
    ) {
        Text(
            text = label,
            color = color,
            fontSize = 8.sp,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.Monospace,
        )
    }
}

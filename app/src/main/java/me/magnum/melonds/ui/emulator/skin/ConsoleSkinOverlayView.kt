package me.magnum.melonds.ui.emulator.skin

import androidx.compose.animation.core.*
import androidx.compose.foundation.Canvas
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
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.magnum.melonds.domain.model.Rect

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
    topScreenRect: Rect? = null,
    bottomScreenRect: Rect? = null,
    modifier: Modifier = Modifier,
) {
    val infiniteTransition = rememberInfiniteTransition(label = "skinLeds")
    val ledAlpha by infiniteTransition.animateFloat(
        initialValue = 0.70f, targetValue = 1.0f,
        animationSpec = infiniteRepeatable(tween(1200, easing = LinearEasing), RepeatMode.Reverse),
        label = "ledAlpha"
    )
    val wifiAlpha by infiniteTransition.animateFloat(
        initialValue = 0.15f, targetValue = 0.95f,
        animationSpec = infiniteRepeatable(tween(320, easing = LinearEasing), RepeatMode.Reverse),
        label = "wifiAlpha"
    )
    val threeDAlpha by infiniteTransition.animateFloat(
        initialValue = 0.85f, targetValue = 1.0f,
        animationSpec = infiniteRepeatable(tween(900, easing = LinearEasing), RepeatMode.Reverse),
        label = "threeDAlpha"
    )

    val density = LocalDensity.current

    // Aesthetic color palettes for authentic Nintendo handhelds
    val (primaryBody, secondaryBody, bezelAccent, innerBevelDark, innerBevelLight, brandTitle) = when (skinTheme) {
        ConsoleSkinTheme.DS_LITE_WHITE -> SixTuple(
            Color(0xFFF1F5F9), Color(0xFFE2E8F0), Color(0xFFCBD5E1),
            Color(0x5594A3B8), Color(0xAAFFFFFF), "Nintendo DS Lite"
        )
        ConsoleSkinTheme.DSI_XL_BLUE -> SixTuple(
            Color(0xFF0F172A), Color(0xFF1E293B), Color(0xFF334155),
            Color(0x88020617), Color(0x3338BDF8), "Nintendo DSi XL"
        )
        ConsoleSkinTheme.CRIMSON_RED -> SixTuple(
            Color(0xFF881337), Color(0xFF4C0519), Color(0xFF9F1239),
            Color(0x88000000), Color(0x44FDA4AF), "Nintendo DS Lite Crimson"
        )
        ConsoleSkinTheme.N3DS_AQUA -> SixTuple(
            Color(0xFF0284C7), Color(0xFF0369A1), Color(0xFF075985),
            Color(0x88082F49), Color(0x557DD3FC), "Nintendo 3DS"
        )
        ConsoleSkinTheme.N3DS_BLACK -> SixTuple(
            Color(0xFF18181B), Color(0xFF27272A), Color(0xFF3F3F46),
            Color(0x99000000), Color(0x33A1A1AA), "New Nintendo 3DS XL"
        )
        else -> SixTuple(
            Color(0xFF141416), Color(0xFF202024), Color(0xFF2E2E34),
            Color(0x99000000), Color(0x3371717A), "Nintendo DS Lite"
        )
    }

    Box(
        modifier = modifier
            .fillMaxSize()
    ) {
        if (topScreenRect != null && bottomScreenRect != null) {
            val topScreenTopDp = with(density) { topScreenRect.y.toDp() }
            val topScreenBottomDp = with(density) { topScreenRect.bottom.toDp() }
            val topScreenLeftDp = with(density) { topScreenRect.x.toDp() }
            val topScreenRightDp = with(density) { topScreenRect.right.toDp() }
            val topScreenWidthDp = with(density) { topScreenRect.width.toDp() }
            val topScreenHeightDp = with(density) { topScreenRect.height.toDp() }

            val bottomScreenTopDp = with(density) { bottomScreenRect.y.toDp() }
            val bottomScreenBottomDp = with(density) { bottomScreenRect.bottom.toDp() }
            val bottomScreenLeftDp = with(density) { bottomScreenRect.x.toDp() }
            val bottomScreenWidthDp = with(density) { bottomScreenRect.width.toDp() }
            val bottomScreenHeightDp = with(density) { bottomScreenRect.height.toDp() }

            val gapPx = (bottomScreenRect.y - topScreenRect.bottom).coerceAtLeast(0)
            val gapDp = with(density) { gapPx.toDp() }

            // 1. TOP SCREEN 3D FRAME & BEZEL
            Box(
                modifier = Modifier
                    .offset(x = topScreenLeftDp, y = topScreenTopDp)
                    .size(width = topScreenWidthDp, height = topScreenHeightDp)
            ) {
                // Inset 3D Inner Bevel (recessed screen housing)
                Canvas(modifier = Modifier.fillMaxSize()) {
                    val w = size.width
                    val h = size.height
                    val borderWidth = 3.dp.toPx()

                    // Top & Left Bevel (Shadow from housing casing)
                    drawRect(
                        brush = Brush.verticalGradient(listOf(innerBevelDark, Color.Transparent), startY = 0f, endY = borderWidth * 2),
                        topLeft = Offset(0f, 0f),
                        size = Size(w, borderWidth * 2)
                    )
                    drawRect(
                        brush = Brush.horizontalGradient(listOf(innerBevelDark, Color.Transparent), startX = 0f, endX = borderWidth * 2),
                        topLeft = Offset(0f, 0f),
                        size = Size(borderWidth * 2, h)
                    )

                    // Bottom & Right Bevel (Specular plastic highlight)
                    drawRect(
                        brush = Brush.verticalGradient(listOf(Color.Transparent, innerBevelLight), startY = h - borderWidth * 2, endY = h),
                        topLeft = Offset(0f, h - borderWidth * 2),
                        size = Size(w, borderWidth * 2)
                    )
                    drawRect(
                        brush = Brush.horizontalGradient(listOf(Color.Transparent, innerBevelLight), startX = w - borderWidth * 2, endX = w),
                        topLeft = Offset(w - borderWidth * 2, 0f),
                        size = Size(borderWidth * 2, h)
                    )

                    // Outer Frame Rim Line
                    drawRect(
                        color = Color.Black.copy(alpha = 0.65f),
                        topLeft = Offset(0f, 0f),
                        size = size,
                        style = Stroke(width = 1.5f)
                    )
                }
            }

            // Top Housing Header (Brand Logo & Stereo Speaker Accents)
            if (topScreenTopDp > 12.dp) {
                val headerHeight = (topScreenTopDp - 2.dp).coerceAtLeast(14.dp)
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(headerHeight)
                        .align(Alignment.TopCenter)
                        .background(
                            Brush.verticalGradient(listOf(primaryBody, secondaryBody))
                        )
                        .border(width = 1.dp, color = Color.Black.copy(alpha = 0.7f)),
                    contentAlignment = Alignment.Center
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        // Left Speaker Grill
                        SpeakerGrillDots(skinTheme = skinTheme)

                        // Center Console Logo
                        Text(
                            text = brandTitle,
                            color = Color.White.copy(alpha = 0.55f),
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily.SansSerif,
                            letterSpacing = 1.5.sp
                        )

                        // Right Speaker Grill / 3D Slider indicator
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            if (skinTheme == ConsoleSkinTheme.N3DS_AQUA || skinTheme == ConsoleSkinTheme.N3DS_BLACK) {
                                // 3D LED on 3DS
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.spacedBy(3.dp)
                                ) {
                                    Text("3D", color = Color(0xFF38BDF8), fontSize = 9.sp, fontWeight = FontWeight.Black)
                                    Box(
                                        modifier = Modifier
                                            .size(4.dp)
                                            .clip(CircleShape)
                                            .background(Color(0xFF38BDF8).copy(alpha = threeDAlpha))
                                    )
                                }
                            }
                            SpeakerGrillDots(skinTheme = skinTheme)
                        }
                    }
                }
            }

            // 2. THE CENTRAL 3D CYLINDRICAL HINGE (Positioned EXACTLY between top & bottom screens!)
            val hingeY = topScreenBottomDp
            val hingeHeight = if (gapDp > 6.dp) gapDp else 20.dp
            val hingeTopOffset = if (gapDp > 6.dp) hingeY else (hingeY - 10.dp)

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(y = hingeTopOffset)
                    .height(hingeHeight)
                    .background(
                        Brush.verticalGradient(
                            listOf(
                                bezelAccent,
                                primaryBody,
                                secondaryBody,
                                Color.Black.copy(alpha = 0.85f)
                            )
                        )
                    )
                    .border(width = 1.dp, color = Color.Black.copy(alpha = 0.8f)),
                contentAlignment = Alignment.Center
            ) {
                // 3D Cylindrical Metallic Pivot Core
                Box(
                    modifier = Modifier
                        .fillMaxWidth(0.92f)
                        .height(8.dp)
                        .clip(RoundedCornerShape(4.dp))
                        .background(
                            Brush.verticalGradient(
                                listOf(
                                    Color(0xFF94A3B8),
                                    Color(0xFF334155),
                                    Color(0xFF1E293B),
                                    Color(0xFF64748B)
                                )
                            )
                        )
                        .border(0.5.dp, Color.Black.copy(alpha = 0.8f), RoundedCornerShape(4.dp))
                )

                // Center Microphone Sound Hole
                Box(
                    modifier = Modifier
                        .size(width = 10.dp, height = 3.dp)
                        .clip(RoundedCornerShape(1.5.dp))
                        .background(Color(0xFF09090B))
                        .border(0.5.dp, Color(0xFF475569), RoundedCornerShape(1.5.dp))
                )

                // LED Status Indicators (Right Side of Hinge)
                Row(
                    modifier = Modifier
                        .align(Alignment.CenterEnd)
                        .padding(end = 20.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Wi-Fi Activity LED (Orange Flashing)
                    Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(2.dp)) {
                        Box(
                            modifier = Modifier
                                .size(6.dp)
                                .clip(CircleShape)
                                .background(Color(0xFFF59E0B).copy(alpha = wifiAlpha))
                                .shadow(6.dp, CircleShape)
                        )
                    }

                    // Power LED (Glowing Solid Green)
                    Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(2.dp)) {
                        Box(
                            modifier = Modifier
                                .size(6.dp)
                                .clip(CircleShape)
                                .background(Color(0xFF10B981).copy(alpha = ledAlpha))
                                .shadow(6.dp, CircleShape)
                        )
                    }
                }
            }

            // 3. BOTTOM SCREEN 3D FRAME & DIGITIZER BEZEL
            Box(
                modifier = Modifier
                    .offset(x = bottomScreenLeftDp, y = bottomScreenTopDp)
                    .size(width = bottomScreenWidthDp, height = bottomScreenHeightDp)
            ) {
                // Inset 3D Touchscreen Digitizer Rim
                Canvas(modifier = Modifier.fillMaxSize()) {
                    val w = size.width
                    val h = size.height
                    val borderWidth = 2.5.dp.toPx()

                    // Top & Left Shadow from Hinge / Plastic Housing
                    drawRect(
                        brush = Brush.verticalGradient(listOf(innerBevelDark, Color.Transparent), startY = 0f, endY = borderWidth * 2),
                        topLeft = Offset(0f, 0f),
                        size = Size(w, borderWidth * 2)
                    )
                    drawRect(
                        brush = Brush.horizontalGradient(listOf(innerBevelDark, Color.Transparent), startX = 0f, endX = borderWidth * 2),
                        topLeft = Offset(0f, 0f),
                        size = Size(borderWidth * 2, h)
                    )

                    // Digitizer matte border
                    drawRect(
                        color = Color.Black.copy(alpha = 0.70f),
                        topLeft = Offset(0f, 0f),
                        size = size,
                        style = Stroke(width = 1.5f)
                    )
                }
            }

            // Bottom Footer (Microphone cue & Headphone jack icon)
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(20.dp)
                    .align(Alignment.BottomCenter)
                    .background(
                        Brush.verticalGradient(listOf(secondaryBody, primaryBody))
                    )
                    .border(width = 1.dp, color = Color.Black.copy(alpha = 0.7f)),
                contentAlignment = Alignment.Center
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 24.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("MIC ⦿", color = Color.White.copy(alpha = 0.35f), fontSize = 8.sp, fontWeight = FontWeight.Bold)
                    Text("☊ HEADPHONES", color = Color.White.copy(alpha = 0.35f), fontSize = 8.sp, fontWeight = FontWeight.Bold)
                }
            }
        } else {
            // Fallback if presentation areas are not yet laid out
            FallbackCenteredFrame(primaryBody, secondaryBody, bezelAccent, brandTitle, ledAlpha, wifiAlpha)
        }
    }
}

@Composable
private fun SpeakerGrillDots(skinTheme: ConsoleSkinTheme) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(3.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        repeat(3) {
            Box(
                modifier = Modifier
                    .size(3.dp)
                    .clip(CircleShape)
                    .background(Color(0xFF09090B))
                    .border(0.5.dp, Color(0xFF475569), CircleShape)
            )
        }
    }
}

@Composable
private fun FallbackCenteredFrame(
    primaryBody: Color,
    secondaryBody: Color,
    bezelAccent: Color,
    brandTitle: String,
    ledAlpha: Float,
    wifiAlpha: Float
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(24.dp)
            .background(Brush.verticalGradient(listOf(primaryBody, secondaryBody))),
        contentAlignment = Alignment.Center
    ) {
        Text(brandTitle, color = Color.White.copy(alpha = 0.45f), fontSize = 10.sp, fontWeight = FontWeight.Bold)
    }
}

private data class SixTuple<A, B, C, D, E, F>(
    val first: A,
    val second: B,
    val third: C,
    val fourth: D,
    val fifth: E,
    val sixth: F
)

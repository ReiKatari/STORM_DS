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
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
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
        initialValue = 0.72f, targetValue = 1.0f,
        animationSpec = infiniteRepeatable(tween(1200, easing = LinearEasing), RepeatMode.Reverse),
        label = "ledAlpha"
    )
    val wifiAlpha by infiniteTransition.animateFloat(
        initialValue = 0.25f, targetValue = 0.95f,
        animationSpec = infiniteRepeatable(tween(420, easing = LinearEasing), RepeatMode.Reverse),
        label = "wifiAlpha"
    )
    val threeDAlpha by infiniteTransition.animateFloat(
        initialValue = 0.85f, targetValue = 1.0f,
        animationSpec = infiniteRepeatable(tween(900, easing = LinearEasing), RepeatMode.Reverse),
        label = "threeDAlpha"
    )

    val density = LocalDensity.current

    // Aesthetic 3D color palettes for authentic Nintendo handheld shells
    val (primaryBody, secondaryBody, bezelAccent, innerBevelDark, innerBevelLight, brandTitle) = when (skinTheme) {
        ConsoleSkinTheme.DS_LITE_WHITE -> SixTuple(
            Color(0xFFE2E8F0), Color(0xFFCBD5E1), Color(0xFF94A3B8),
            Color(0x88475569), Color(0xDDFFFFFF), "Nintendo DS Lite"
        )
        ConsoleSkinTheme.DSI_XL_BLUE -> SixTuple(
            Color(0xFF172554), Color(0xFF1E3A8A), Color(0xFF2563EB),
            Color(0xAA020617), Color(0x6660A5FA), "Nintendo DSi XL"
        )
        ConsoleSkinTheme.CRIMSON_RED -> SixTuple(
            Color(0xFF7F1D1D), Color(0xFF991B1B), Color(0xFFDC2626),
            Color(0xAA090202), Color(0x66FCA5A5), "Nintendo DS Lite Crimson"
        )
        ConsoleSkinTheme.N3DS_AQUA -> SixTuple(
            Color(0xFF0369A1), Color(0xFF0284C7), Color(0xFF0EA5E9),
            Color(0xAA082F49), Color(0x777DD3FC), "Nintendo 3DS"
        )
        ConsoleSkinTheme.N3DS_BLACK -> SixTuple(
            Color(0xFF1C1C22), Color(0xFF2D2D35), Color(0xFF52525E),
            Color(0xBB000000), Color(0x66D4D4D8), "New Nintendo 3DS XL"
        )
        else -> SixTuple(
            Color(0xFF16161B), Color(0xFF26262E), Color(0xFF454552),
            Color(0xBB000000), Color(0x55A1A1AA), "Nintendo DS Lite"
        )
    }

    val isLightSkin = skinTheme == ConsoleSkinTheme.DS_LITE_WHITE
    val labelColor = if (isLightSkin) Color(0xFF1E293B).copy(alpha = 0.82f) else Color.White.copy(alpha = 0.80f)
    val subLabelColor = if (isLightSkin) Color(0xFF334155).copy(alpha = 0.68f) else Color.White.copy(alpha = 0.55f)

    BoxWithConstraints(modifier = modifier.fillMaxSize()) {
        val parentHeightDp = maxHeight

        if (topScreenRect != null && bottomScreenRect != null) {
            val topScreenTopDp = with(density) { topScreenRect.y.toDp() }
            val topScreenLeftDp = with(density) { topScreenRect.x.toDp() }
            val topScreenWidthDp = with(density) { topScreenRect.width.toDp() }
            val topScreenHeightDp = with(density) { topScreenRect.height.toDp() }
            val topScreenBottomDp = with(density) { topScreenRect.bottom.toDp() }

            val bottomScreenTopDp = with(density) { bottomScreenRect.y.toDp() }
            val bottomScreenLeftDp = with(density) { bottomScreenRect.x.toDp() }
            val bottomScreenWidthDp = with(density) { bottomScreenRect.width.toDp() }
            val bottomScreenHeightDp = with(density) { bottomScreenRect.height.toDp() }
            val bottomScreenBottomDp = with(density) { bottomScreenRect.bottom.toDp() }

            val isVertical = kotlin.math.abs(topScreenRect.x - bottomScreenRect.x) < 40 &&
                (bottomScreenRect.y >= topScreenRect.bottom - 24)
            val isHorizontal = kotlin.math.abs(topScreenRect.y - bottomScreenRect.y) < 40 &&
                (bottomScreenRect.x >= topScreenRect.right - 24)

            if (isVertical) {
                // ==================== VERTICAL (PORTRAIT) HANDHELD CASING ====================
                val gapPx = (bottomScreenRect.y - topScreenRect.bottom).coerceAtLeast(0)
                val gapDp = with(density) { gapPx.toDp() }

                // 1. TOP LID HEADER HOUSING (above Top Screen)
                val headerHeight = topScreenTopDp.coerceAtLeast(22.dp)
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(headerHeight)
                        .align(Alignment.TopCenter)
                        .background(
                            Brush.verticalGradient(
                                listOf(bezelAccent, secondaryBody, primaryBody)
                            )
                        )
                        .border(width = 1.dp, color = innerBevelLight),
                    contentAlignment = Alignment.Center
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 18.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        SpeakerGrillDots(isLightSkin)
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            // Inner Camera Lens
                            Box(
                                modifier = Modifier
                                    .size(8.dp)
                                    .clip(CircleShape)
                                    .background(Color(0xFF09090B))
                                    .border(1.dp, bezelAccent, CircleShape),
                                contentAlignment = Alignment.Center
                            ) {
                                Box(
                                    modifier = Modifier
                                        .size(3.dp)
                                        .clip(CircleShape)
                                        .background(Color(0xFF38BDF8).copy(alpha = 0.7f))
                                )
                            }
                            Text(
                                text = brandTitle,
                                color = labelColor,
                                fontSize = 11.sp,
                                fontWeight = FontWeight.ExtraBold,
                                fontFamily = FontFamily.SansSerif,
                                letterSpacing = 1.4.sp
                            )
                        }
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            if (skinTheme == ConsoleSkinTheme.N3DS_AQUA || skinTheme == ConsoleSkinTheme.N3DS_BLACK) {
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.spacedBy(3.dp)
                                ) {
                                    Text("3D", color = Color(0xFF38BDF8), fontSize = 9.sp, fontWeight = FontWeight.Black)
                                    Box(
                                        modifier = Modifier
                                            .size(5.dp)
                                            .clip(CircleShape)
                                            .background(Color(0xFF38BDF8).copy(alpha = threeDAlpha))
                                    )
                                }
                            }
                            SpeakerGrillDots(isLightSkin)
                        }
                    }
                }

                // 2. LOWER HANDHELD CONTROLLER DECK BODY (from bottomScreenBottomDp down to bottom of screen)
                val deckHeightDp = (parentHeightDp - bottomScreenBottomDp).coerceAtLeast(24.dp)
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .offset(y = bottomScreenBottomDp)
                        .height(deckHeightDp)
                        .background(
                            Brush.verticalGradient(
                                listOf(
                                    bezelAccent,
                                    secondaryBody,
                                    primaryBody,
                                    secondaryBody,
                                    primaryBody
                                )
                            )
                        )
                        .border(width = 1.5.dp, color = bezelAccent)
                ) {
                    // 3D Sculpted Controller Deck Details (Side Grips, Shoulder Bar, D-Pad & ABXY Wells, Cartridge Slot)
                    Canvas(modifier = Modifier.fillMaxSize()) {
                        val w = size.width
                        val h = size.height
                        val sideRailW = 10.dp.toPx()
                        val shoulderBarH = 54.dp.toPx().coerceAtMost(h * 0.30f)

                        // Top shoulder bumper bar under L / R / utility buttons
                        drawRect(
                            brush = Brush.verticalGradient(
                                listOf(
                                    innerBevelLight,
                                    bezelAccent.copy(alpha = 0.55f),
                                    innerBevelDark
                                ),
                                startY = 0f,
                                endY = shoulderBarH
                            ),
                            topLeft = Offset(0f, 0f),
                            size = Size(w, shoulderBarH)
                        )

                        // Left 3D sculpted grip bevel
                        drawRect(
                            brush = Brush.horizontalGradient(
                                listOf(innerBevelLight, Color.Transparent),
                                startX = 0f,
                                endX = sideRailW
                            ),
                            topLeft = Offset(0f, 0f),
                            size = Size(sideRailW, h)
                        )

                        // Right 3D sculpted grip bevel
                        drawRect(
                            brush = Brush.horizontalGradient(
                                listOf(Color.Transparent, innerBevelDark),
                                startX = w - sideRailW,
                                endX = w
                            ),
                            topLeft = Offset(w - sideRailW, 0f),
                            size = Size(sideRailW, h)
                        )

                        // Recessed circular wells concentrically aligned with D-Pad (left 140dp) and ABXY (right 140dp)
                        if (h > 100.dp.toPx()) {
                            val bottomLipH = 22.dp.toPx()
                            val padSizePx = 140.dp.toPx()
                            val mainPadLiftPx = 20.dp.toPx()
                            val wellRadius = 68.dp.toPx().coerceAtMost((h - shoulderBarH - bottomLipH) * 0.48f)
                            val wellCenterY = (h - mainPadLiftPx - padSizePx / 2f).coerceIn(
                                shoulderBarH + wellRadius + 2.dp.toPx(),
                                h - bottomLipH - wellRadius + 6.dp.toPx()
                            )
                            val leftWellCenter = Offset(padSizePx / 2f, wellCenterY)
                            val rightWellCenter = Offset(w - padSizePx / 2f, wellCenterY)

                            listOf(leftWellCenter, rightWellCenter).forEach { center ->
                                drawCircle(
                                    brush = Brush.radialGradient(
                                        colors = listOf(
                                            innerBevelDark,
                                            primaryBody.copy(alpha = 0.92f),
                                            bezelAccent.copy(alpha = 0.55f)
                                        ),
                                        center = center,
                                        radius = wellRadius
                                    ),
                                    radius = wellRadius,
                                    center = center
                                )
                                drawCircle(
                                    color = innerBevelLight,
                                    radius = wellRadius,
                                    center = center,
                                    style = Stroke(width = 1.8.dp.toPx())
                                )
                            }

                            // Center recessed plate aligned directly behind SELECT and START buttons
                            val plateW = 122.dp.toPx()
                            val plateH = 38.dp.toPx()
                            val selectStartLiftPx = 24.dp.toPx()
                            val selectStartHeightPx = 32.dp.toPx()
                            val plateTopY = (h - selectStartLiftPx - selectStartHeightPx - 3.dp.toPx()).coerceAtLeast(shoulderBarH + 8.dp.toPx())
                            val plateTopLeft = Offset((w - plateW) / 2f, plateTopY)
                            drawRoundRect(
                                color = innerBevelDark,
                                topLeft = plateTopLeft,
                                size = Size(plateW, plateH),
                                cornerRadius = CornerRadius(19.dp.toPx(), 19.dp.toPx())
                            )
                            drawRoundRect(
                                color = innerBevelLight,
                                topLeft = plateTopLeft,
                                size = Size(plateW, plateH),
                                cornerRadius = CornerRadius(19.dp.toPx(), 19.dp.toPx()),
                                style = Stroke(width = 1.2.dp.toPx())
                            )
                        }
                    }

                    // Bottom Lip Ports (MIC, GAME CARD SLOT, HEADPHONES)
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(22.dp)
                            .align(Alignment.BottomCenter)
                            .background(
                                Brush.verticalGradient(
                                    listOf(secondaryBody, primaryBody, Color.Black.copy(alpha = 0.65f))
                                )
                            )
                            .border(width = 1.dp, color = innerBevelDark),
                        contentAlignment = Alignment.Center
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 20.dp),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text("MIC ⦿", color = subLabelColor, fontSize = 9.sp, fontWeight = FontWeight.Bold)
                            Text("▬ SLOT-2 / GBA ▬", color = subLabelColor, fontSize = 8.sp, fontWeight = FontWeight.Bold, letterSpacing = 1.sp)
                            Text("☊ HEADPHONES", color = subLabelColor, fontSize = 9.sp, fontWeight = FontWeight.Bold)
                        }
                    }
                }

                // 3. TOP & BOTTOM SCREEN 3D RECESSED BEZELS
                Box(
                    modifier = Modifier
                        .offset(x = topScreenLeftDp, y = topScreenTopDp)
                        .size(width = topScreenWidthDp, height = topScreenHeightDp)
                ) {
                    ScreenBevelOverlay(bezelAccent, innerBevelDark, innerBevelLight)
                }

                Box(
                    modifier = Modifier
                        .offset(x = bottomScreenLeftDp, y = bottomScreenTopDp)
                        .size(width = bottomScreenWidthDp, height = bottomScreenHeightDp)
                ) {
                    ScreenBevelOverlay(bezelAccent, innerBevelDark, innerBevelLight)
                }

                // 4. CENTRAL 3D CYLINDRICAL HINGE (between Top & Bottom screens)
                val hingeY = topScreenBottomDp
                val hingeHeight = if (gapDp >= 16.dp) gapDp else 20.dp
                val hingeTopOffset = if (gapDp >= 16.dp) hingeY else (hingeY - (hingeHeight - gapDp) / 2)

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .offset(y = hingeTopOffset)
                        .height(hingeHeight)
                        .background(
                            Brush.verticalGradient(
                                listOf(
                                    innerBevelLight,
                                    bezelAccent,
                                    secondaryBody,
                                    primaryBody,
                                    Color.Black.copy(alpha = 0.88f)
                                )
                            )
                        )
                        .border(width = 1.dp, color = Color.Black.copy(alpha = 0.85f)),
                    contentAlignment = Alignment.Center
                ) {
                    // Cylindrical Metallic Barrel
                    Box(
                        modifier = Modifier
                            .fillMaxWidth(0.94f)
                            .height(10.dp)
                            .clip(RoundedCornerShape(5.dp))
                            .background(
                                Brush.verticalGradient(
                                    listOf(
                                        innerBevelLight,
                                        bezelAccent,
                                        primaryBody,
                                        secondaryBody,
                                        bezelAccent
                                    )
                                )
                            )
                            .border(0.8.dp, Color.Black.copy(alpha = 0.8f), RoundedCornerShape(5.dp))
                    )
                    // Left & Right Hinge Barrel Ring Seams
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(0.86f),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Box(modifier = Modifier.size(width = 2.dp, height = 12.dp).background(Color.Black.copy(alpha = 0.7f)))
                        Box(modifier = Modifier.size(width = 2.dp, height = 12.dp).background(Color.Black.copy(alpha = 0.7f)))
                    }
                    // Center Microphone Slot
                    Box(
                        modifier = Modifier
                            .size(width = 14.dp, height = 4.dp)
                            .clip(RoundedCornerShape(2.dp))
                            .background(Color(0xFF09090B))
                            .border(0.6.dp, bezelAccent, RoundedCornerShape(2.dp))
                    )
                    // Status LEDs (Wi-Fi Amber + Power Emerald)
                    Row(
                        modifier = Modifier
                            .align(Alignment.CenterEnd)
                            .padding(end = 22.dp),
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Box(
                            modifier = Modifier
                                .size(7.dp)
                                .clip(CircleShape)
                                .background(Color(0xFFF59E0B).copy(alpha = wifiAlpha))
                                .border(0.5.dp, Color.White.copy(alpha = 0.6f), CircleShape)
                                .shadow(6.dp, CircleShape)
                        )
                        Box(
                            modifier = Modifier
                                .size(7.dp)
                                .clip(CircleShape)
                                .background(Color(0xFF10B981).copy(alpha = ledAlpha))
                                .border(0.5.dp, Color.White.copy(alpha = 0.6f), CircleShape)
                                .shadow(6.dp, CircleShape)
                        )
                    }
                }
            } else if (isHorizontal) {
                // ==================== HORIZONTAL (LANDSCAPE) HANDHELD CASING ====================
                val topScreenRightDp = with(density) { topScreenRect.right.toDp() }
                val hGapPx = (bottomScreenRect.x - topScreenRect.right).coerceAtLeast(0)
                val hGapDp = with(density) { hGapPx.toDp() }

                // Top & Bottom bars in Landscape
                val topBarHeight = topScreenTopDp.coerceAtLeast(18.dp)
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(topBarHeight)
                        .align(Alignment.TopCenter)
                        .background(Brush.verticalGradient(listOf(bezelAccent, secondaryBody, primaryBody)))
                        .border(width = 1.dp, color = innerBevelLight),
                    contentAlignment = Alignment.Center
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 24.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        SpeakerGrillDots(isLightSkin)
                        Text(
                            text = brandTitle,
                            color = labelColor,
                            fontSize = 11.sp,
                            fontWeight = FontWeight.ExtraBold,
                            fontFamily = FontFamily.SansSerif,
                            letterSpacing = 1.5.sp
                        )
                        SpeakerGrillDots(isLightSkin)
                    }
                }

                val maxScreenBottomDp = if (topScreenBottomDp > bottomScreenBottomDp) topScreenBottomDp else bottomScreenBottomDp
                val bottomFooterHeight = (parentHeightDp - maxScreenBottomDp).coerceAtLeast(18.dp)
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(bottomFooterHeight)
                        .align(Alignment.BottomCenter)
                        .background(Brush.verticalGradient(listOf(bezelAccent, secondaryBody, primaryBody)))
                        .border(width = 1.dp, color = innerBevelDark),
                    contentAlignment = Alignment.Center
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 24.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text("MIC ⦿", color = subLabelColor, fontSize = 9.sp, fontWeight = FontWeight.Bold)
                        Row(horizontalArrangement = Arrangement.spacedBy(8.dp), verticalAlignment = Alignment.CenterVertically) {
                            Box(modifier = Modifier.size(6.dp).clip(CircleShape).background(Color(0xFFF59E0B).copy(alpha = wifiAlpha)))
                            Box(modifier = Modifier.size(6.dp).clip(CircleShape).background(Color(0xFF10B981).copy(alpha = ledAlpha)))
                        }
                        Text("☊ HEADPHONES", color = subLabelColor, fontSize = 9.sp, fontWeight = FontWeight.Bold)
                    }
                }

                // Screen Bezels
                Box(
                    modifier = Modifier
                        .offset(x = topScreenLeftDp, y = topScreenTopDp)
                        .size(width = topScreenWidthDp, height = topScreenHeightDp)
                ) {
                    ScreenBevelOverlay(bezelAccent, innerBevelDark, innerBevelLight)
                }

                Box(
                    modifier = Modifier
                        .offset(x = bottomScreenLeftDp, y = bottomScreenTopDp)
                        .size(width = bottomScreenWidthDp, height = bottomScreenHeightDp)
                ) {
                    ScreenBevelOverlay(bezelAccent, innerBevelDark, innerBevelLight)
                }

                // Central Vertical Hinge Pillar (between Left and Right screens)
                val pillarX = topScreenRightDp
                val pillarWidth = if (hGapDp >= 12.dp) hGapDp else 16.dp
                val pillarLeftOffset = if (hGapDp >= 12.dp) pillarX else (pillarX - (pillarWidth - hGapDp) / 2)

                Box(
                    modifier = Modifier
                        .offset(x = pillarLeftOffset, y = topScreenTopDp)
                        .size(width = pillarWidth, height = topScreenHeightDp)
                        .background(
                            Brush.horizontalGradient(
                                listOf(bezelAccent, primaryBody, secondaryBody, Color.Black.copy(alpha = 0.85f))
                            )
                        )
                        .border(width = 1.dp, color = Color.Black.copy(alpha = 0.8f)),
                    contentAlignment = Alignment.Center
                ) {
                    Box(
                        modifier = Modifier
                            .width(6.dp)
                            .fillMaxHeight(0.88f)
                            .clip(RoundedCornerShape(3.dp))
                            .background(
                                Brush.horizontalGradient(
                                    listOf(innerBevelLight, bezelAccent, primaryBody, secondaryBody)
                                )
                            )
                    )
                }
            } else {
                // Fallback for custom / uneven layouts: render 3D bezels around both screens
                Box(
                    modifier = Modifier
                        .offset(x = topScreenLeftDp, y = topScreenTopDp)
                        .size(width = topScreenWidthDp, height = topScreenHeightDp)
                ) {
                    ScreenBevelOverlay(bezelAccent, innerBevelDark, innerBevelLight)
                }
                Box(
                    modifier = Modifier
                        .offset(x = bottomScreenLeftDp, y = bottomScreenTopDp)
                        .size(width = bottomScreenWidthDp, height = bottomScreenHeightDp)
                ) {
                    ScreenBevelOverlay(bezelAccent, innerBevelDark, innerBevelLight)
                }
            }
        }
    }
}

@Composable
private fun ScreenBevelOverlay(bezelAccent: Color, innerBevelDark: Color, innerBevelLight: Color) {
    Canvas(modifier = Modifier.fillMaxSize()) {
        val w = size.width
        val h = size.height
        val outerFrame = 4.dp.toPx()
        val bevelDepth = 8.dp.toPx()

        // Top & Left recessed dark bevel shadow
        drawRect(
            brush = Brush.verticalGradient(listOf(innerBevelDark, Color.Transparent), startY = 0f, endY = bevelDepth),
            topLeft = Offset(0f, 0f),
            size = Size(w, bevelDepth)
        )
        drawRect(
            brush = Brush.horizontalGradient(listOf(innerBevelDark, Color.Transparent), startX = 0f, endX = bevelDepth),
            topLeft = Offset(0f, 0f),
            size = Size(bevelDepth, h)
        )

        // Bottom & Right specular highlight bevel
        drawRect(
            brush = Brush.verticalGradient(listOf(Color.Transparent, innerBevelLight), startY = h - bevelDepth, endY = h),
            topLeft = Offset(0f, h - bevelDepth),
            size = Size(w, bevelDepth)
        )
        drawRect(
            brush = Brush.horizontalGradient(listOf(Color.Transparent, innerBevelLight), startX = w - bevelDepth, endX = w),
            topLeft = Offset(w - bevelDepth, 0f),
            size = Size(bevelDepth, h)
        )

        // Metallic outer bezel frame
        drawRect(
            color = bezelAccent.copy(alpha = 0.85f),
            topLeft = Offset(outerFrame / 2f, outerFrame / 2f),
            size = Size(w - outerFrame, h - outerFrame),
            style = Stroke(width = outerFrame)
        )

        // Crisp inner LCD frame border
        drawRect(
            color = Color.Black.copy(alpha = 0.85f),
            topLeft = Offset(outerFrame, outerFrame),
            size = Size(w - outerFrame * 2f, h - outerFrame * 2f),
            style = Stroke(width = 1.5.dp.toPx())
        )
    }
}

@Composable
private fun SpeakerGrillDots(isLightSkin: Boolean = false) {
    val dotColor = if (isLightSkin) Color(0xFF1E293B) else Color(0xFF09090B)
    val rimColor = if (isLightSkin) Color(0xFF94A3B8) else Color(0xFF52525B)
    Row(
        horizontalArrangement = Arrangement.spacedBy(4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        repeat(4) {
            Box(
                modifier = Modifier
                    .size(4.dp)
                    .clip(CircleShape)
                    .background(dotColor)
                    .border(0.6.dp, rimColor, CircleShape)
            )
        }
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

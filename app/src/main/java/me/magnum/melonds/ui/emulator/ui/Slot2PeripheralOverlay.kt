package me.magnum.melonds.ui.emulator.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectHorizontalDragGestures
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
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Slot2PeripheralOverlay(
    addonType: Int,
    onGuitarFretStateChanged: (fretIndex: Int, pressed: Boolean) -> Unit,
    onPaddleAnalogDelta: (deltaX: Float) -> Unit,
    onDismissOverlay: () -> Unit,
) {
    when (addonType) {
        5 -> GuitarGripOverlay(
            onFretStateChanged = onGuitarFretStateChanged,
            onDismiss = onDismissOverlay,
        )
        6 -> PaddleControllerOverlay(
            onPaddleDelta = onPaddleAnalogDelta,
            onDismiss = onDismissOverlay,
        )
    }
}

@Composable
private fun GuitarGripOverlay(
    onFretStateChanged: (fretIndex: Int, pressed: Boolean) -> Unit,
    onDismiss: () -> Unit,
) {
    val pressedStates = remember { mutableStateListOf(false, false, false, false) }

    DisposableEffect(Unit) {
        onDispose {
            for (i in 0..3) {
                if (pressedStates[i]) {
                    onFretStateChanged(i, false)
                }
            }
        }
    }

    val fretColors = listOf(
        Color(0xFF22C55E), // Green
        Color(0xFFEF4444), // Red
        Color(0xFFEAB308), // Yellow
        Color(0xFF3B82F6), // Blue
    )
    val fretLabels = listOf("G", "R", "Y", "B")

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 14.dp, start = 12.dp, end = 12.dp),
        contentAlignment = Alignment.BottomCenter,
    ) {
        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(18.dp))
                .background(Color(0xCC0D111A))
                .border(1.dp, Color(0x5500D2FF), RoundedCornerShape(18.dp))
                .padding(horizontal = 12.dp, vertical = 8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(0.88f),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    text = "🎸 GUITAR GRIP (SLOT-2)",
                    color = Color(0xFF94A3B8),
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Bold,
                )
                Text(
                    text = "✕",
                    color = Color(0xFF94A3B8),
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .clip(CircleShape)
                        .clickable { onDismiss() }
                        .padding(horizontal = 6.dp, vertical = 2.dp),
                )
            }
            Spacer(modifier = Modifier.height(6.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth(0.92f)
                    .height(64.dp)
                    .pointerInput(Unit) {
                        awaitPointerEventScope {
                            while (true) {
                                val event = awaitPointerEvent()
                                val width = size.width.toFloat().coerceAtLeast(1f)
                                val activeFrets = BooleanArray(4)
                                for (change in event.changes) {
                                    if (change.pressed) {
                                        val x = change.position.x
                                        val y = change.position.y
                                        if (x in 0f..width && y in -24f..(size.height + 24f)) {
                                            val idx = ((x / width) * 4f).toInt().coerceIn(0, 3)
                                            activeFrets[idx] = true
                                        }
                                    }
                                }
                                for (i in 0..3) {
                                    if (pressedStates[i] != activeFrets[i]) {
                                        pressedStates[i] = activeFrets[i]
                                        onFretStateChanged(i, activeFrets[i])
                                    }
                                }
                            }
                        }
                    },
                horizontalArrangement = Arrangement.spacedBy(10.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                for (i in 0..3) {
                    val isPressed = pressedStates[i]
                    val baseColor = fretColors[i]
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .height(if (isPressed) 56.dp else 62.dp)
                            .clip(RoundedCornerShape(14.dp))
                            .background(
                                Brush.verticalGradient(
                                    colors = if (isPressed) {
                                        listOf(baseColor, baseColor.copy(alpha = 0.85f))
                                    } else {
                                        listOf(baseColor.copy(alpha = 0.42f), baseColor.copy(alpha = 0.22f))
                                    },
                                ),
                            )
                            .border(
                                width = if (isPressed) 2.5.dp else 1.5.dp,
                                color = if (isPressed) Color.White else baseColor.copy(alpha = 0.85f),
                                shape = RoundedCornerShape(14.dp),
                            ),
                        contentAlignment = Alignment.Center,
                    ) {
                        Text(
                            text = fretLabels[i],
                            color = Color.White,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.ExtraBold,
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun PaddleControllerOverlay(
    onPaddleDelta: (deltaX: Float) -> Unit,
    onDismiss: () -> Unit,
) {
    var knobPosition by remember { mutableFloatStateOf(0f) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 16.dp, start = 16.dp, end = 16.dp),
        contentAlignment = Alignment.BottomCenter,
    ) {
        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(18.dp))
                .background(Color(0xCC0D111A))
                .border(1.dp, Color(0x5500D2FF), RoundedCornerShape(18.dp))
                .padding(horizontal = 14.dp, vertical = 8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(0.86f),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    text = "🎛️ TAITO PADDLE CONTROLLER (SLOT-2)",
                    color = Color(0xFF38BDF8),
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Bold,
                )
                Text(
                    text = "✕",
                    color = Color(0xFF94A3B8),
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .clip(CircleShape)
                        .clickable { onDismiss() }
                        .padding(horizontal = 6.dp, vertical = 2.dp),
                )
            }
            Spacer(modifier = Modifier.height(6.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth(0.88f)
                    .height(48.dp)
                    .clip(RoundedCornerShape(24.dp))
                    .background(Color(0xFF1E293B))
                    .border(1.5.dp, Color(0xFF00D2FF), RoundedCornerShape(24.dp))
                    .pointerInput(Unit) {
                        detectHorizontalDragGestures(
                            onDragEnd = {
                                knobPosition = 0f
                                onPaddleDelta(0f)
                            },
                            onDragCancel = {
                                knobPosition = 0f
                                onPaddleDelta(0f)
                            },
                            onHorizontalDrag = { change, dragAmount ->
                                change.consume()
                                val normalized = (dragAmount / 18f).coerceIn(-1f, 1f)
                                knobPosition = (knobPosition + dragAmount).coerceIn(-120f, 120f)
                                onPaddleDelta(normalized)
                            },
                        )
                    },
                contentAlignment = Alignment.Center,
            ) {
                Text(
                    text = "◀  ПОВОРОТ КОЛЕСА PADDLE  ▶",
                    color = Color(0x99E2E8F0),
                    fontSize = 12.sp,
                    fontWeight = FontWeight.SemiBold,
                )
            }
        }
    }
}

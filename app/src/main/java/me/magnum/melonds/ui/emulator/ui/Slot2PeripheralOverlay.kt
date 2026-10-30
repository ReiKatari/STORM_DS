package me.magnum.melonds.ui.emulator.ui

import android.view.HapticFeedbackConstants
import androidx.activity.compose.BackHandler
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
import androidx.compose.material.Slider
import androidx.compose.material.SliderDefaults
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
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.KeyEventType
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.onPreviewKeyEvent
import androidx.compose.ui.input.key.type
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.magnum.melonds.R

@Composable
fun Slot2PeripheralOverlay(
    addonType: Int,
    solarLevel: Int = -1,
    onSolarLevelChanged: ((level: Int) -> Unit)? = null,
    onGuitarFretStateChanged: (fretIndex: Int, pressed: Boolean) -> Unit,
    onPaddleAnalogDelta: (deltaX: Float) -> Unit,
    onDismissOverlay: () -> Unit,
) {
    BackHandler(onBack = onDismissOverlay)

    Box(
        modifier = Modifier
            .fillMaxSize()
            .onPreviewKeyEvent { event ->
                if (event.type == KeyEventType.KeyDown &&
                    (event.key == Key.ButtonB || event.key == Key.Back || event.key == Key.Escape)
                ) {
                    onDismissOverlay()
                    true
                } else {
                    false
                }
            },
    ) {
        when (addonType) {
            3 -> SolarSensorOverlay(
                currentLevel = solarLevel,
                onLevelChanged = { onSolarLevelChanged?.invoke(it) },
                onDismiss = onDismissOverlay,
            )
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
}

@Composable
private fun SolarSensorOverlay(
    currentLevel: Int,
    onLevelChanged: (level: Int) -> Unit,
    onDismiss: () -> Unit,
) {
    var sliderValue by remember(currentLevel) {
        mutableFloatStateOf(if (currentLevel < 0) 5f else currentLevel.toFloat().coerceIn(0f, 10f))
    }

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
                .padding(horizontal = 14.dp, vertical = 10.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(0.92f),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    text = "☀️ " + stringResource(R.string.solar_sensor_slider_label).uppercase(),
                    color = Color(0xFFFFB74D),
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

            Spacer(modifier = Modifier.height(8.dp))

            // 4 Instant Light Preset Chips
            Row(
                modifier = Modifier.fillMaxWidth(0.95f),
                horizontalArrangement = Arrangement.spacedBy(6.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                val presets = listOf(
                    0 to stringResource(R.string.solar_preset_0),
                    4 to stringResource(R.string.solar_preset_35),
                    7 to stringResource(R.string.solar_preset_70),
                    10 to stringResource(R.string.solar_preset_100),
                )
                presets.forEach { (level, label) ->
                    val isSelected = sliderValue.toInt() == level
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .clip(RoundedCornerShape(8.dp))
                            .background(if (isSelected) Color(0xFFFFB74D).copy(alpha = 0.35f) else Color(0xFF1E293B))
                            .border(
                                1.dp,
                                if (isSelected) Color(0xFFFFB74D) else Color(0x3300D2FF),
                                RoundedCornerShape(8.dp),
                            )
                            .clickable {
                                sliderValue = level.toFloat()
                                onLevelChanged(level)
                            }
                            .padding(vertical = 6.dp),
                        contentAlignment = Alignment.Center,
                    ) {
                        Text(
                            text = label,
                            color = if (isSelected) Color(0xFFFFB74D) else Color.White,
                            fontSize = 9.5.sp,
                            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            // Slider from 0 to 10
            Row(
                modifier = Modifier.fillMaxWidth(0.92f),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    text = "${(sliderValue * 10).toInt()}%",
                    color = Color(0xFFFFB74D),
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.width(36.dp),
                )
                Slider(
                    value = sliderValue,
                    onValueChange = { newVal ->
                        sliderValue = newVal
                        onLevelChanged(newVal.toInt())
                    },
                    valueRange = 0f..10f,
                    steps = 9,
                    modifier = Modifier.weight(1f),
                    colors = SliderDefaults.colors(
                        thumbColor = Color(0xFFFFB74D),
                        activeTrackColor = Color(0xFFFFB74D),
                        inactiveTrackColor = Color(0xFF334155),
                    ),
                )
            }
        }
    }
}

@Composable
private fun GuitarGripOverlay(
    onFretStateChanged: (fretIndex: Int, pressed: Boolean) -> Unit,
    onDismiss: () -> Unit,
) {
    val pressedStates = remember { mutableStateListOf(false, false, false, false) }
    val view = LocalView.current

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
                                        val wasPressed = pressedStates[i]
                                        val isNowPressed = activeFrets[i]
                                        pressedStates[i] = isNowPressed
                                        if (!wasPressed && isNowPressed) {
                                            view.performHapticFeedback(HapticFeedbackConstants.KEYBOARD_TAP)
                                        }
                                        onFretStateChanged(i, isNowPressed)
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

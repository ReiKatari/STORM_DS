package me.magnum.melonds.ui.emulator.ui

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
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
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Slider
import androidx.compose.material.SliderDefaults
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.HourglassTop
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.KeyEventType
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.onPreviewKeyEvent
import androidx.compose.ui.input.key.type
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.magnum.melonds.R
import me.magnum.melonds.ui.common.bouncingClickable
import me.magnum.melonds.ui.theme.Manrope
import me.magnum.melonds.ui.theme.WatermelonMono
import me.magnum.melonds.ui.theme.watermelon
import kotlin.math.abs
import kotlin.math.roundToInt

@Composable
fun SlowMotionSpeedDialog(
    currentSpeed: Float,
    isSlowMotionActive: Boolean,
    onSelectSpeed: (Float) -> Unit,
    onDisableSlowMotion: () -> Unit,
    onDismiss: () -> Unit,
) {
    val colors = watermelon
    var sliderValue by remember(currentSpeed) { mutableFloatStateOf(currentSpeed.coerceIn(0.1f, 1.0f)) }

    val presets = remember {
        listOf(
            0.25f to R.string.slow_motion_preset_025,
            0.50f to R.string.slow_motion_preset_050,
            0.75f to R.string.slow_motion_preset_075,
            0.85f to R.string.slow_motion_preset_085,
            1.00f to R.string.slow_motion_preset_100,
        )
    }

    BackHandler(onBack = onDismiss)

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black.copy(alpha = if (colors.isDark) 0.82f else 0.65f))
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null,
            ) { onDismiss() }
            .onPreviewKeyEvent { event ->
                if (event.type == KeyEventType.KeyDown &&
                    (event.key == Key.ButtonB || event.key == Key.Back || event.key == Key.Escape)
                ) {
                    onDismiss()
                    true
                } else {
                    false
                }
            },
        contentAlignment = Alignment.Center,
    ) {
        val cardShape = RoundedCornerShape(20.dp)
        Column(
            modifier = Modifier
                .fillMaxWidth(0.92f)
                .widthIn(max = 420.dp)
                .clip(cardShape)
                .background(colors.surface)
                .border(1.dp, colors.line, cardShape)
                .clickable(
                    interactionSource = remember { MutableInteractionSource() },
                    indication = null,
                ) { /* Consume clicks inside */ }
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            // Header Row
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                ) {
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .background(colors.greenDim)
                            .padding(7.dp),
                        contentAlignment = Alignment.Center,
                    ) {
                        Icon(
                            imageVector = Icons.Filled.HourglassTop,
                            contentDescription = null,
                            tint = colors.green,
                            modifier = Modifier.size(18.dp),
                        )
                    }

                    Column {
                        Text(
                            text = stringResource(R.string.slow_motion_title),
                            color = colors.text,
                            fontFamily = Manrope,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                        )
                        Text(
                            text = stringResource(R.string.slow_motion_subtitle),
                            color = colors.text2,
                            fontFamily = Manrope,
                            fontSize = 11.5.sp,
                        )
                    }
                }

                Box(
                    modifier = Modifier
                        .size(32.dp)
                        .clip(CircleShape)
                        .background(colors.surface2)
                        .border(1.dp, colors.line, CircleShape)
                        .clickable { onDismiss() },
                    contentAlignment = Alignment.Center,
                ) {
                    Icon(
                        imageVector = Icons.Default.Close,
                        contentDescription = "Close",
                        tint = colors.text,
                        modifier = Modifier.size(17.dp),
                    )
                }
            }

            Spacer(modifier = Modifier.height(14.dp))

            // Presets List
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(6.dp),
            ) {
                presets.forEach { (presetSpeed, labelRes) ->
                    val isSelected = abs(sliderValue - presetSpeed) < 0.025f
                    val itemShape = RoundedCornerShape(10.dp)

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(itemShape)
                            .background(if (isSelected) colors.greenDim else colors.surface2)
                            .border(1.dp, if (isSelected) colors.green else colors.line, itemShape)
                            .bouncingClickable {
                                sliderValue = presetSpeed
                            }
                            .padding(horizontal = 12.dp, vertical = 9.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Text(
                            text = stringResource(labelRes),
                            color = if (isSelected) colors.green else colors.text,
                            fontFamily = Manrope,
                            fontSize = 12.5.sp,
                            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
                        )

                        if (isSelected) {
                            Icon(
                                imageVector = Icons.Filled.Check,
                                contentDescription = null,
                                tint = colors.green,
                                modifier = Modifier.size(16.dp),
                            )
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Smooth Slider Section (Manual Speed)
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(12.dp))
                    .background(colors.surface2)
                    .border(1.dp, colors.line, RoundedCornerShape(12.dp))
                    .padding(horizontal = 14.dp, vertical = 10.dp),
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        text = stringResource(R.string.slow_motion_custom_slider, sliderValue),
                        color = colors.text,
                        fontFamily = Manrope,
                        fontSize = 12.5.sp,
                        fontWeight = FontWeight.SemiBold,
                    )
                    Text(
                        text = "${(sliderValue * 100).roundToInt()}%",
                        color = colors.green,
                        fontFamily = WatermelonMono,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                    )
                }

                Slider(
                    value = sliderValue,
                    onValueChange = { newVal ->
                        // Step quantization to nearest 0.05
                        sliderValue = (newVal * 20f).roundToInt() / 20f
                    },
                    valueRange = 0.10f..1.00f,
                    steps = 17,
                    modifier = Modifier.fillMaxWidth(),
                    colors = SliderDefaults.colors(
                        thumbColor = colors.green,
                        activeTrackColor = colors.green,
                        inactiveTrackColor = colors.surface3,
                    ),
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Action Buttons Row
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                if (isSlowMotionActive) {
                    val disableShape = RoundedCornerShape(10.dp)
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .clip(disableShape)
                            .background(colors.surface2)
                            .border(1.dp, colors.red.copy(alpha = 0.5f), disableShape)
                            .bouncingClickable {
                                onDisableSlowMotion()
                                onDismiss()
                            }
                            .padding(vertical = 10.dp),
                        contentAlignment = Alignment.Center,
                    ) {
                        Text(
                            text = stringResource(R.string.slow_motion_turn_off),
                            color = colors.red,
                            fontFamily = Manrope,
                            fontSize = 12.5.sp,
                            fontWeight = FontWeight.SemiBold,
                        )
                    }
                }

                val applyShape = RoundedCornerShape(10.dp)
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .clip(applyShape)
                        .background(colors.green)
                        .border(1.dp, colors.green, applyShape)
                        .bouncingClickable {
                            onSelectSpeed(sliderValue)
                            onDismiss()
                        }
                        .padding(vertical = 10.dp),
                    contentAlignment = Alignment.Center,
                ) {
                    Text(
                        text = stringResource(R.string.slow_motion_apply),
                        color = Color.White,
                        fontFamily = Manrope,
                        fontSize = 12.5.sp,
                        fontWeight = FontWeight.Bold,
                    )
                }
            }
        }
    }
}

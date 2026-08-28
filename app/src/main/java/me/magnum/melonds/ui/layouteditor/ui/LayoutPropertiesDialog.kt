package me.magnum.melonds.ui.layouteditor.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.DisplaySettings
import androidx.compose.material.icons.filled.Edit
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import me.magnum.melonds.R
import me.magnum.melonds.domain.model.layout.LayoutConfiguration
import me.magnum.melonds.ui.common.component.dialog.TextInputDialog
import me.magnum.melonds.ui.common.component.dialog.rememberTextInputDialogState
import me.magnum.melonds.ui.theme.LocalWatermelonColors
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.ui.theme.WatermelonMono
import kotlin.math.roundToInt

@Composable
fun LayoutPropertiesDialog(
    layoutConfiguration: LayoutConfiguration,
    onDismiss: () -> Unit,
    onSave: (String?, LayoutConfiguration.LayoutOrientation, Boolean, Int) -> Unit,
) {
    val colors = LocalWatermelonColors.current
    val defaultName = stringResource(R.string.custom_layout_default_name)
    var name by rememberSaveable(layoutConfiguration.name) { mutableStateOf(layoutConfiguration.name) }
    var orientation by rememberSaveable(layoutConfiguration.orientation) { mutableStateOf(layoutConfiguration.orientation) }
    var useCustomOpacity by rememberSaveable(layoutConfiguration.useCustomOpacity) { mutableStateOf(layoutConfiguration.useCustomOpacity) }
    var opacity by rememberSaveable(layoutConfiguration.opacity) { mutableFloatStateOf(layoutConfiguration.opacity.toFloat()) }

    val textInputDialogState = rememberTextInputDialogState()
    val orientationOptions = stringArrayResource(R.array.layout_orientation_options)

    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(usePlatformDefaultWidth = false),
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(colors.surface.copy(alpha = 0.65f))
                .clickable(onClick = onDismiss),
            contentAlignment = Alignment.Center,
        ) {
            Box(
                modifier = Modifier
                    .widthIn(max = 460.dp)
                    .fillMaxWidth(0.92f)
                    .clip(RoundedCornerShape(20.dp))
                    .background(colors.surface)
                    .border(1.2.dp, colors.line, RoundedCornerShape(20.dp))
                    .clickable(enabled = false) {}
                    .padding(20.dp),
            ) {
                Column(modifier = Modifier.fillMaxWidth()) {
                    // Header
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth(),
                    ) {
                        Icon(
                            imageVector = Icons.Filled.DisplaySettings,
                            contentDescription = null,
                            tint = colors.green,
                            modifier = Modifier.size(24.dp),
                        )
                        Spacer(Modifier.width(12.dp))
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                text = stringResource(R.string.properties),
                                color = colors.text,
                                fontFamily = SpaceGrotesk,
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold,
                            )
                            Text(
                                text = "Параметры и ориентация макета",
                                color = colors.text3,
                                fontFamily = WatermelonMono,
                                fontSize = 11.sp,
                            )
                        }
                        Box(
                            modifier = Modifier
                                .size(32.dp)
                                .clip(RoundedCornerShape(8.dp))
                                .background(colors.surface2)
                                .clickable(onClick = onDismiss),
                            contentAlignment = Alignment.Center,
                        ) {
                            Icon(
                                imageVector = Icons.Filled.Close,
                                contentDescription = stringResource(R.string.cancel),
                                tint = colors.text2,
                                modifier = Modifier.size(18.dp),
                            )
                        }
                    }

                    Spacer(Modifier.height(14.dp))
                    Box(Modifier.fillMaxWidth().height(1.dp).background(colors.line))
                    Spacer(Modifier.height(12.dp))

                    // Layout Name card
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(12.dp))
                            .background(colors.surface2)
                            .border(1.dp, colors.line, RoundedCornerShape(12.dp))
                            .clickable {
                                textInputDialogState.show(
                                    initialText = name ?: defaultName,
                                    onConfirm = { newName ->
                                        if (newName.isNotBlank()) {
                                            name = newName
                                        }
                                    },
                                )
                            }
                            .padding(14.dp),
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.fillMaxWidth(),
                        ) {
                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = stringResource(R.string.layout_name),
                                    color = colors.text,
                                    fontFamily = SpaceGrotesk,
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.SemiBold,
                                )
                                Text(
                                    text = name ?: stringResource(R.string.not_set),
                                    color = colors.green,
                                    fontFamily = WatermelonMono,
                                    fontSize = 12.sp,
                                )
                            }
                            Icon(
                                imageVector = Icons.Filled.Edit,
                                contentDescription = null,
                                tint = colors.text3,
                                modifier = Modifier.size(18.dp),
                            )
                        }
                    }

                    Spacer(Modifier.height(12.dp))

                    // Orientation selection
                    Text(
                        text = stringResource(R.string.layout_orientation),
                        color = colors.text2,
                        fontFamily = SpaceGrotesk,
                        fontSize = 13.sp,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.padding(start = 4.dp, bottom = 6.dp),
                    )

                    Row(
                        horizontalArrangement = Arrangement.spacedBy(6.dp),
                        modifier = Modifier.fillMaxWidth(),
                    ) {
                        LayoutConfiguration.LayoutOrientation.entries.forEachIndexed { index, option ->
                            val isSelected = orientation == option
                            Box(
                                modifier = Modifier
                                    .weight(1f)
                                    .clip(RoundedCornerShape(10.dp))
                                    .background(if (isSelected) colors.green.copy(alpha = 0.15f) else colors.surface2)
                                    .border(
                                        1.dp,
                                        if (isSelected) colors.green.copy(alpha = 0.6f) else colors.line,
                                        RoundedCornerShape(10.dp)
                                    )
                                    .clickable { orientation = option }
                                    .padding(vertical = 10.dp),
                                contentAlignment = Alignment.Center,
                            ) {
                                Text(
                                    text = orientationOptions.getOrElse(index) { "" },
                                    color = if (isSelected) colors.green else colors.text2,
                                    fontFamily = SpaceGrotesk,
                                    fontSize = 12.5.sp,
                                    fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal,
                                )
                            }
                        }
                    }

                    Spacer(Modifier.height(12.dp))

                    // Custom Opacity Switch
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(12.dp))
                            .background(colors.surface2)
                            .border(1.dp, colors.line, RoundedCornerShape(12.dp))
                            .clickable { useCustomOpacity = !useCustomOpacity }
                            .padding(horizontal = 14.dp, vertical = 10.dp),
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.fillMaxWidth(),
                        ) {
                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = "Индивидуальная прозрачность",
                                    color = colors.text,
                                    fontFamily = SpaceGrotesk,
                                    fontSize = 13.5.sp,
                                    fontWeight = FontWeight.Medium,
                                )
                                Text(
                                    text = if (useCustomOpacity) "Настроить прозрачность кнопок для этого макета" else "Использовать общую прозрачность из настроек",
                                    color = colors.text3,
                                    fontFamily = WatermelonMono,
                                    fontSize = 11.sp,
                                )
                            }
                            Switch(
                                checked = useCustomOpacity,
                                onCheckedChange = { useCustomOpacity = it },
                                colors = SwitchDefaults.colors(
                                    checkedThumbColor = colors.green,
                                    checkedTrackColor = colors.green.copy(alpha = 0.5f),
                                    uncheckedThumbColor = colors.text3,
                                    uncheckedTrackColor = colors.surface,
                                ),
                            )
                        }
                    }

                    if (useCustomOpacity) {
                        Spacer(Modifier.height(8.dp))
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(12.dp))
                                .background(colors.surface2)
                                .border(1.dp, colors.line, RoundedCornerShape(12.dp))
                                .padding(horizontal = 14.dp, vertical = 10.dp),
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier.fillMaxWidth(),
                            ) {
                                Text(
                                    text = stringResource(R.string.layout_opacity),
                                    color = colors.text2,
                                    fontFamily = SpaceGrotesk,
                                    fontSize = 13.sp,
                                    modifier = Modifier.weight(1f),
                                )
                                Text(
                                    text = "${opacity.roundToInt()}%",
                                    color = colors.green,
                                    fontFamily = WatermelonMono,
                                    fontSize = 13.sp,
                                    fontWeight = FontWeight.Bold,
                                )
                            }
                            Slider(
                                value = opacity,
                                onValueChange = { opacity = it },
                                valueRange = 0f..100f,
                                colors = SliderDefaults.colors(
                                    thumbColor = colors.green,
                                    activeTrackColor = colors.green,
                                    inactiveTrackColor = colors.surface3,
                                ),
                            )
                        }
                    }

                    Spacer(Modifier.height(18.dp))

                    // Action buttons
                    Row(
                        horizontalArrangement = Arrangement.End,
                        modifier = Modifier.fillMaxWidth(),
                    ) {
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(10.dp))
                                .background(colors.surface2)
                                .border(1.dp, colors.line, RoundedCornerShape(10.dp))
                                .clickable(onClick = onDismiss)
                                .padding(horizontal = 16.dp, vertical = 10.dp),
                            contentAlignment = Alignment.Center,
                        ) {
                            Text(
                                text = stringResource(R.string.cancel),
                                color = colors.text2,
                                fontFamily = SpaceGrotesk,
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Medium,
                            )
                        }
                        Spacer(Modifier.width(10.dp))
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(10.dp))
                                .background(colors.green)
                                .clickable {
                                    onSave(name, orientation, useCustomOpacity, opacity.roundToInt())
                                }
                                .padding(horizontal = 20.dp, vertical = 10.dp),
                            contentAlignment = Alignment.Center,
                        ) {
                            Text(
                                text = stringResource(R.string.ok),
                                color = colors.bg,
                                fontFamily = SpaceGrotesk,
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Bold,
                            )
                        }
                    }
                }
            }
        }
    }

    TextInputDialog(
        title = stringResource(R.string.layout_name),
        dialogState = textInputDialogState,
        textValidator = { true },
    )
}

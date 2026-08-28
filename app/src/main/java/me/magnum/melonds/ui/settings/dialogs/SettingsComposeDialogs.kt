package me.magnum.melonds.ui.settings.dialogs

import android.app.Dialog
import android.content.Context
import android.graphics.Color as AndroidColor
import android.graphics.drawable.ColorDrawable
import android.view.ViewGroup
import android.view.Window
import androidx.activity.ComponentDialog
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Checkbox
import androidx.compose.material.CheckboxDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Slider
import androidx.compose.material.SliderDefaults
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.ViewCompositionStrategy
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.magnum.melonds.R
import me.magnum.melonds.extensions.applyImmersiveFullscreen
import me.magnum.melonds.ui.theme.LocalWatermelonColors
import me.magnum.melonds.ui.theme.MelonTheme
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.ui.theme.WatermelonMono

fun showSettingsComposeDialog(
    context: Context,
    content: @Composable (dismiss: () -> Unit) -> Unit
): Dialog {
    val dialog = ComponentDialog(context, android.R.style.Theme_Black_NoTitleBar_Fullscreen)
    dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
    dialog.window?.apply {
        setBackgroundDrawable(ColorDrawable(AndroidColor.TRANSPARENT))
        setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
        applyImmersiveFullscreen()
    }
    dialog.setOnShowListener {
        dialog.window?.applyImmersiveFullscreen()
    }

    val composeView = ComposeView(context).apply {
        setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool)
        setContent {
            MelonTheme {
                content { dialog.dismiss() }
            }
        }
    }

    dialog.setContentView(composeView)
    dialog.show()
    dialog.window?.applyImmersiveFullscreen()
    return dialog
}

@Composable
fun SettingsDialogScaffold(
    title: String,
    subtitle: String? = null,
    icon: ImageVector = Icons.Filled.Tune,
    onDismiss: () -> Unit,
    content: @Composable ColumnScope.() -> Unit,
) {
    val colors = LocalWatermelonColors.current

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black.copy(alpha = if (colors.isDark) 0.82f else 0.65f))
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null,
            ) { onDismiss() },
        contentAlignment = Alignment.BottomCenter,
    ) {
        Column(
            modifier = Modifier
                .widthIn(max = 760.dp)
                .fillMaxWidth()
                .navigationBarsPadding()
                .padding(bottom = 16.dp)
                .clickable(
                    interactionSource = remember { MutableInteractionSource() },
                    indication = null,
                ) { /* consume inner clicks */ },
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            // Main Panel Card (Header + Content)
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f, fill = false)
                    .fillMaxHeight(0.85f)
                    .padding(start = 14.dp, end = 14.dp, top = 20.dp, bottom = 12.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .background(colors.surface)
                    .border(1.2.dp, colors.line, RoundedCornerShape(20.dp)),
            ) {
                Column(modifier = Modifier.fillMaxWidth()) {
                    // Header Bar
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 16.dp, end = 16.dp, top = 14.dp, bottom = 12.dp),
                    ) {
                        Box(
                            modifier = Modifier
                                .size(36.dp)
                                .clip(RoundedCornerShape(10.dp))
                                .background(colors.surface2)
                                .border(1.dp, colors.line, RoundedCornerShape(10.dp)),
                            contentAlignment = Alignment.Center,
                        ) {
                            Icon(
                                imageVector = icon,
                                contentDescription = null,
                                tint = colors.green,
                                modifier = Modifier.size(20.dp),
                            )
                        }
                        Spacer(Modifier.width(12.dp))
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                text = title,
                                color = colors.text,
                                fontFamily = SpaceGrotesk,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                            )
                            if (subtitle != null) {
                                Text(
                                    text = subtitle,
                                    color = colors.text2,
                                    fontFamily = SpaceGrotesk,
                                    fontSize = 12.sp,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis,
                                )
                            }
                        }
                    }

                    // Divider
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(1.dp)
                            .background(colors.line)
                    )

                    // Body
                    content()
                }
            }

            // Unified Bottom Circular Back Arrow
            me.magnum.melonds.ui.common.UnifiedBackButton(
                onClick = onDismiss,
            )
        }
    }
}

@Composable
fun SettingsChoiceDialogContent(
    title: String,
    subtitle: String? = null,
    icon: ImageVector = Icons.Filled.Tune,
    options: List<CharSequence>,
    values: List<CharSequence>,
    selectedValue: String?,
    onSelect: (String) -> Unit,
    onDismiss: () -> Unit,
) {
    val colors = LocalWatermelonColors.current

    SettingsDialogScaffold(
        title = title,
        subtitle = subtitle,
        icon = icon,
        onDismiss = onDismiss,
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 14.dp, vertical = 12.dp),
        ) {
            options.forEachIndexed { index, option ->
                val optVal = values.getOrNull(index)?.toString() ?: option.toString()
                val isSelected = optVal == selectedValue
                val shape = RoundedCornerShape(12.dp)

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(min = 46.dp)
                        .clip(shape)
                        .background(if (isSelected) colors.greenDim else colors.surface2)
                        .border(
                            width = if (isSelected) 1.5.dp else 1.dp,
                            color = if (isSelected) colors.green.copy(alpha = 0.75f) else colors.line,
                            shape = shape,
                        )
                        .clickable {
                            onSelect(optVal)
                            onDismiss()
                        }
                        .padding(horizontal = 14.dp, vertical = 10.dp),
                ) {
                    Text(
                        text = option.toString(),
                        color = colors.text,
                        fontFamily = SpaceGrotesk,
                        fontSize = 14.sp,
                        fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier.weight(1f),
                    )

                    if (isSelected) {
                        Icon(
                            imageVector = Icons.Filled.Check,
                            contentDescription = null,
                            tint = colors.green,
                            modifier = Modifier.size(20.dp),
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun SettingsEditTextDialogContent(
    title: String,
    subtitle: String? = null,
    icon: ImageVector = Icons.Filled.Edit,
    currentText: String,
    onConfirm: (String) -> Unit,
    onDismiss: () -> Unit,
) {
    val colors = LocalWatermelonColors.current
    var textValue by remember { mutableStateOf(currentText) }

    SettingsDialogScaffold(
        title = title,
        subtitle = subtitle,
        icon = icon,
        onDismiss = onDismiss,
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 16.dp),
            verticalArrangement = Arrangement.spacedBy(14.dp),
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(12.dp))
                    .background(colors.surface2)
                    .border(1.2.dp, colors.line, RoundedCornerShape(12.dp))
                    .padding(horizontal = 16.dp, vertical = 14.dp),
            ) {
                BasicTextField(
                    value = textValue,
                    onValueChange = { textValue = it },
                    textStyle = TextStyle(
                        color = colors.text,
                        fontFamily = SpaceGrotesk,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Medium,
                    ),
                    cursorBrush = SolidColor(colors.green),
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth(),
                )
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(12.dp))
                    .background(colors.green)
                    .clickable {
                        onConfirm(textValue)
                        onDismiss()
                    }
                    .padding(vertical = 12.dp),
                contentAlignment = Alignment.Center,
            ) {
                Text(
                    text = stringResource(R.string.ok),
                    color = colors.bg,
                    fontFamily = SpaceGrotesk,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                )
            }
        }
    }
}

@Composable
fun SettingsMultiChoiceDialogContent(
    title: String,
    subtitle: String? = null,
    icon: ImageVector = Icons.Filled.Checklist,
    options: List<CharSequence>,
    values: List<CharSequence>,
    selectedValues: Set<String>,
    onConfirm: (Set<String>) -> Unit,
    onDismiss: () -> Unit,
) {
    val colors = LocalWatermelonColors.current
    val currentSelected = remember { mutableStateMapOf<String, Boolean>().apply {
        values.forEach { v -> this[v.toString()] = v.toString() in selectedValues }
    } }

    SettingsDialogScaffold(
        title = title,
        subtitle = subtitle,
        icon = icon,
        onDismiss = onDismiss,
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f, fill = false)
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 14.dp, vertical = 12.dp),
        ) {
            options.forEachIndexed { index, option ->
                val optVal = values.getOrNull(index)?.toString() ?: option.toString()
                val isChecked = currentSelected[optVal] == true
                val shape = RoundedCornerShape(12.dp)

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(min = 46.dp)
                        .clip(shape)
                        .background(if (isChecked) colors.greenDim else colors.surface2)
                        .border(
                            width = if (isChecked) 1.5.dp else 1.dp,
                            color = if (isChecked) colors.green.copy(alpha = 0.75f) else colors.line,
                            shape = shape,
                        )
                        .clickable {
                            currentSelected[optVal] = !isChecked
                        }
                        .padding(horizontal = 14.dp, vertical = 8.dp),
                ) {
                    Checkbox(
                        checked = isChecked,
                        onCheckedChange = { currentSelected[optVal] = it },
                        colors = CheckboxDefaults.colors(
                            checkedColor = colors.green,
                            uncheckedColor = colors.text3,
                            checkmarkColor = colors.bg,
                        ),
                    )
                    Spacer(Modifier.width(8.dp))
                    Text(
                        text = option.toString(),
                        color = colors.text,
                        fontFamily = SpaceGrotesk,
                        fontSize = 14.sp,
                        fontWeight = if (isChecked) FontWeight.Bold else FontWeight.Medium,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier.weight(1f),
                    )
                }
            }

            Spacer(Modifier.height(6.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(12.dp))
                    .background(colors.green)
                    .clickable {
                        val result = currentSelected.filter { it.value }.keys.toSet()
                        onConfirm(result)
                        onDismiss()
                    }
                    .padding(vertical = 12.dp),
                contentAlignment = Alignment.Center,
            ) {
                Text(
                    text = stringResource(R.string.ok),
                    color = colors.bg,
                    fontFamily = SpaceGrotesk,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                )
            }
        }
    }
}

@Composable
fun SettingsSeekBarDialogContent(
    title: String,
    subtitle: String? = null,
    icon: ImageVector = Icons.Filled.Tune,
    currentValue: Int,
    minValue: Int,
    maxValue: Int,
    onConfirm: (Int) -> Unit,
    onDismiss: () -> Unit,
) {
    val colors = LocalWatermelonColors.current
    var sliderValue by remember { mutableFloatStateOf(currentValue.toFloat()) }

    SettingsDialogScaffold(
        title = title,
        subtitle = subtitle,
        icon = icon,
        onDismiss = onDismiss,
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 18.dp, vertical = 16.dp),
            verticalArrangement = Arrangement.spacedBy(14.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = sliderValue.toInt().toString(),
                color = colors.green,
                fontFamily = SpaceGrotesk,
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
            )

            Slider(
                value = sliderValue,
                onValueChange = { sliderValue = it },
                valueRange = minValue.toFloat()..maxValue.toFloat(),
                colors = SliderDefaults.colors(
                    thumbColor = colors.green,
                    activeTrackColor = colors.green,
                    inactiveTrackColor = colors.line,
                ),
                modifier = Modifier.fillMaxWidth(),
            )

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(12.dp))
                    .background(colors.green)
                    .clickable {
                        onConfirm(sliderValue.toInt())
                        onDismiss()
                    }
                    .padding(vertical = 12.dp),
                contentAlignment = Alignment.Center,
            ) {
                Text(
                    text = stringResource(R.string.ok),
                    color = colors.bg,
                    fontFamily = SpaceGrotesk,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                )
            }
        }
    }
}

fun showSettingsRewindDialog(context: Context, onUpdated: (() -> Unit)? = null): Dialog {
    return showSettingsComposeDialog(context) { dismiss ->
        SettingsRewindDialogContent(
            context = context,
            onDismiss = {
                onUpdated?.invoke()
                dismiss()
            }
        )
    }
}

@Composable
fun SettingsRewindDialogContent(
    context: Context,
    onDismiss: () -> Unit,
) {
    val colors = LocalWatermelonColors.current
    val sharedPreferences = remember { androidx.preference.PreferenceManager.getDefaultSharedPreferences(context) }

    var isRewindEnabled by remember {
        mutableStateOf(sharedPreferences.getBoolean("enable_rewind", false))
    }
    var rewindPeriod by remember {
        mutableIntStateOf(sharedPreferences.getInt("rewind_period", 10).coerceIn(1, 60))
    }
    var rewindWindow by remember {
        mutableIntStateOf(sharedPreferences.getInt("rewind_window", 6).coerceIn(1, 30))
    }

    val maxStates = (rewindWindow * 10) / rewindPeriod
    val approxMemoryMb = maxStates * 20

    SettingsDialogScaffold(
        title = "Перемотка назад",
        subtitle = "Параметры и интервалы перемотки времени",
        icon = Icons.Filled.Schedule,
        onDismiss = onDismiss,
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 14.dp, vertical = 12.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp),
        ) {
            // Enable Rewind Card
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(12.dp))
                    .background(colors.surface2)
                    .border(1.dp, if (isRewindEnabled) colors.green else colors.line, RoundedCornerShape(12.dp))
                    .clickable {
                        isRewindEnabled = !isRewindEnabled
                        sharedPreferences.edit().putBoolean("enable_rewind", isRewindEnabled).apply()
                    }
                    .padding(horizontal = 14.dp, vertical = 12.dp),
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = "Включить перемотку назад",
                        color = colors.text,
                        fontFamily = SpaceGrotesk,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                    )
                    Text(
                        text = if (isRewindEnabled) "Перемотка активна во время игры" else "Функция перемотки отключена",
                        color = colors.text3,
                        fontFamily = WatermelonMono,
                        fontSize = 10.sp,
                    )
                }
                Checkbox(
                    checked = isRewindEnabled,
                    onCheckedChange = {
                        isRewindEnabled = it
                        sharedPreferences.edit().putBoolean("enable_rewind", isRewindEnabled).apply()
                    },
                    colors = CheckboxDefaults.colors(
                        checkedColor = colors.green,
                        uncheckedColor = colors.text3,
                        checkmarkColor = colors.bg,
                    ),
                )
            }

            if (isRewindEnabled) {
                // Rewind Period (Save Interval) Slider Card
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp))
                        .background(colors.surface2)
                        .border(1.dp, colors.line, RoundedCornerShape(12.dp))
                        .padding(horizontal = 14.dp, vertical = 12.dp),
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Text(
                            text = "Интервал сохранения",
                            color = colors.text,
                            fontFamily = SpaceGrotesk,
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Medium,
                        )
                        Text(
                            text = "$rewindPeriod сек.",
                            color = colors.green,
                            fontFamily = WatermelonMono,
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                        )
                    }
                    Slider(
                        value = rewindPeriod.toFloat(),
                        onValueChange = {
                            rewindPeriod = it.toInt()
                            sharedPreferences.edit().putInt("rewind_period", rewindPeriod).apply()
                        },
                        valueRange = 1f..60f,
                        colors = SliderDefaults.colors(
                            thumbColor = colors.green,
                            activeTrackColor = colors.green,
                            inactiveTrackColor = colors.line,
                        ),
                        modifier = Modifier.fillMaxWidth(),
                    )
                }

                // Rewind Window (Buffer Length) Slider Card
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp))
                        .background(colors.surface2)
                        .border(1.dp, colors.line, RoundedCornerShape(12.dp))
                        .padding(horizontal = 14.dp, vertical = 12.dp),
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Text(
                            text = "Глубина истории",
                            color = colors.text,
                            fontFamily = SpaceGrotesk,
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Medium,
                        )
                        Text(
                            text = "${rewindWindow * 10} сек.",
                            color = colors.green,
                            fontFamily = WatermelonMono,
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                        )
                    }
                    Slider(
                        value = rewindWindow.toFloat(),
                        onValueChange = {
                            rewindWindow = it.toInt()
                            sharedPreferences.edit().putInt("rewind_window", rewindWindow).apply()
                        },
                        valueRange = 1f..30f,
                        colors = SliderDefaults.colors(
                            thumbColor = colors.green,
                            activeTrackColor = colors.green,
                            inactiveTrackColor = colors.line,
                        ),
                        modifier = Modifier.fillMaxWidth(),
                    )
                }

                // Memory Info Card
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp))
                        .background(colors.surface2.copy(alpha = 0.6f))
                        .border(1.dp, colors.line, RoundedCornerShape(12.dp))
                        .padding(horizontal = 14.dp, vertical = 10.dp),
                ) {
                    Icon(
                        imageVector = Icons.Filled.Info,
                        contentDescription = null,
                        tint = colors.text3,
                        modifier = Modifier.size(18.dp),
                    )
                    Spacer(Modifier.width(10.dp))
                    Text(
                        text = "Оценочный расход RAM: ~$approxMemoryMb МБ (макс. $maxStates снимков)",
                        color = colors.text2,
                        fontFamily = SpaceGrotesk,
                        fontSize = 11.sp,
                    )
                }
            }
        }
    }
}
package me.magnum.melonds.ui.emulator.ui

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Check
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusProperties
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.KeyEventType
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.onPreviewKeyEvent
import androidx.compose.ui.input.key.type
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.magnum.melonds.R
import me.magnum.melonds.domain.model.DualScreenPreset
import me.magnum.melonds.domain.model.ScreenAlignment
import me.magnum.melonds.ui.common.WatermelonSwitch
import me.magnum.melonds.ui.theme.Manrope
import me.magnum.melonds.ui.theme.WatermelonColors
import me.magnum.melonds.ui.theme.watermelon
import androidx.compose.material.icons.filled.AspectRatio
import androidx.compose.material.icons.filled.Block
import androidx.compose.material.icons.filled.FitScreen
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Smartphone
import androidx.compose.material.icons.filled.Tv
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource

private enum class PresetsScreen { MAIN, FILL_AREA, VERTICAL_ALIGNMENT }

@Composable
fun ConsolePresetsOverlay(
    dualScreenPreset: DualScreenPreset,
    onDualScreenPresetSelected: (DualScreenPreset) -> Unit,
    keepAspectRatio: Boolean,
    onKeepAspectRatioChanged: (Boolean) -> Unit,
    integerScaleEnabled: Boolean,
    onIntegerScaleChanged: (Boolean) -> Unit,
    internalFillHeight: Boolean,
    onInternalFillHeightChanged: (Boolean) -> Unit,
    internalFillWidth: Boolean,
    onInternalFillWidthChanged: (Boolean) -> Unit,
    externalFillHeight: Boolean,
    onExternalFillHeightChanged: (Boolean) -> Unit,
    externalFillWidth: Boolean,
    onExternalFillWidthChanged: (Boolean) -> Unit,
    internalAlignment: ScreenAlignment?,
    onInternalAlignmentChanged: (ScreenAlignment?) -> Unit,
    externalAlignment: ScreenAlignment?,
    onExternalAlignmentChanged: (ScreenAlignment?) -> Unit,
    onBack: () -> Unit,
    onResumeGame: (() -> Unit)? = null,
) {
    val colors = watermelon
    var screen by remember { mutableStateOf(PresetsScreen.MAIN) }

    BackHandler {
        if (screen == PresetsScreen.MAIN) onBack() else screen = PresetsScreen.MAIN
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black.copy(alpha = if (colors.isDark) 0.82f else 0.65f))
            .focusProperties { canFocus = false }
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null,
            ) {
                if (screen == PresetsScreen.MAIN) onBack() else screen = PresetsScreen.MAIN
            }
            .onPreviewKeyEvent { event ->
                if (event.type == KeyEventType.KeyDown && (event.key == Key.ButtonB || event.key == Key.Back)) {
                    if (screen == PresetsScreen.MAIN) onBack() else screen = PresetsScreen.MAIN
                    true
                } else {
                    false
                }
            },
        contentAlignment = Alignment.BottomCenter,
    ) {
        Column(
            modifier = Modifier
                .widthIn(max = 760.dp)
                .fillMaxWidth()
                .navigationBarsPadding()
                .padding(bottom = 16.dp)
                .focusProperties { canFocus = false }
                .clickable(
                    interactionSource = remember { MutableInteractionSource() },
                    indication = null,
                ) { /* consume clicks inside panel */ },
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            // Main Panel Card
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f, fill = false)
                    .fillMaxHeight(0.85f)
                    .padding(horizontal = 14.dp, vertical = 6.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .background(colors.surface)
                    .border(1.dp, colors.line, RoundedCornerShape(20.dp)),
            ) {
                Column(modifier = Modifier.fillMaxWidth()) {
                    // Unified Header Bar
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 16.dp, end = 16.dp, top = 14.dp, bottom = 12.dp),
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.ic_view_grid),
                            contentDescription = null,
                            tint = colors.green,
                            modifier = Modifier.size(22.dp),
                        )
                        Spacer(Modifier.width(10.dp))
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                text = when (screen) {
                                    PresetsScreen.MAIN -> stringResource(R.string.dual_screen_presets)
                                    PresetsScreen.FILL_AREA -> stringResource(R.string.dual_screen_fill_area_title)
                                    PresetsScreen.VERTICAL_ALIGNMENT -> stringResource(R.string.dual_screen_vertical_alignment_title)
                                },
                                color = colors.text,
                                fontFamily = Manrope,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.SemiBold,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                            )
                            Text(
                                text = when (screen) {
                                    PresetsScreen.MAIN -> "Настройка вывода на 2 экрана"
                                    PresetsScreen.FILL_AREA -> "Растяжение по ширине и высоте"
                                    PresetsScreen.VERTICAL_ALIGNMENT -> "Позиционирование кадров"
                                },
                                color = colors.text3,
                                fontSize = 10.5.sp,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }
                        if (onResumeGame != null) {
                            Spacer(Modifier.width(8.dp))
                            Box(
                                modifier = Modifier
                                    .clip(RoundedCornerShape(8.dp))
                                    .background(colors.surface2)
                                    .border(1.dp, colors.green.copy(alpha = 0.5f), RoundedCornerShape(8.dp))
                                    .clickable(onClick = onResumeGame)
                                    .padding(horizontal = 10.dp, vertical = 5.dp),
                                contentAlignment = Alignment.Center,
                            ) {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Icon(
                                        imageVector = Icons.Filled.PlayArrow,
                                        contentDescription = stringResource(R.string.pause_resume),
                                        tint = colors.green,
                                        modifier = Modifier.size(15.dp),
                                    )
                                    Spacer(Modifier.width(4.dp))
                                    Text(
                                        text = "В игру",
                                        color = colors.green,
                                        fontFamily = Manrope,
                                        fontSize = 11.5.sp,
                                        fontWeight = FontWeight.Bold,
                                    )
                                }
                            }
                        }
                    }

                    Box(
                        Modifier
                            .fillMaxWidth()
                            .height(1.dp)
                            .background(colors.line)
                    )

                    // Card Body Content
                    Column(
                        verticalArrangement = Arrangement.spacedBy(6.dp),
                        modifier = Modifier
                            .fillMaxWidth()
                            .verticalScroll(rememberScrollState())
                            .padding(horizontal = 14.dp, vertical = 10.dp),
                    ) {
                        when (screen) {
                            PresetsScreen.MAIN -> {
                                val presetSelected = dualScreenPreset != DualScreenPreset.OFF

                                // Informative Card
                                Box(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .clip(RoundedCornerShape(12.dp))
                                        .background(colors.surface2)
                                        .border(1.dp, colors.line, RoundedCornerShape(12.dp))
                                        .padding(12.dp),
                                ) {
                                    Column {
                                        Row(verticalAlignment = Alignment.CenterVertically) {
                                            Icon(
                                                Icons.Filled.Info,
                                                null,
                                                tint = WatermelonColors.gold,
                                                modifier = Modifier.size(16.dp),
                                            )
                                            Spacer(Modifier.width(6.dp))
                                            Text(
                                                text = stringResource(R.string.dual_screen_info_title),
                                                color = WatermelonColors.gold,
                                                fontFamily = Manrope,
                                                fontSize = 12.5.sp,
                                                fontWeight = FontWeight.Bold,
                                            )
                                        }
                                        Spacer(Modifier.height(4.dp))
                                        Text(
                                            text = stringResource(R.string.dual_screen_info_desc),
                                            color = colors.text2,
                                            fontSize = 11.sp,
                                            lineHeight = 15.sp,
                                        )
                                    }
                                }

                                Spacer(Modifier.height(4.dp))
                                ConsoleSectionLabel("Режимы разделения")

                                val presets = listOf(
                                    Triple(
                                        DualScreenPreset.OFF,
                                        stringResource(R.string.dual_screen_preset_off),
                                        Icons.Filled.Block,
                                    ),
                                    Triple(
                                        DualScreenPreset.INTERNAL_TOP_EXTERNAL_BOTTOM,
                                        stringResource(R.string.dual_screen_preset_internal_top_external_bottom),
                                        Icons.Filled.Tv,
                                    ),
                                    Triple(
                                        DualScreenPreset.INTERNAL_BOTTOM_EXTERNAL_TOP,
                                        stringResource(R.string.dual_screen_preset_internal_bottom_external_top),
                                        Icons.Filled.Smartphone,
                                    ),
                                )
                                presets.forEach { (preset, label, icon) ->
                                    val subtitle = when (preset) {
                                        DualScreenPreset.OFF -> "Оба экрана Nintendo DS выводятся на основном дисплее устройства"
                                        DualScreenPreset.INTERNAL_TOP_EXTERNAL_BOTTOM -> "Основной экран смартфона — Верхний (игра), Внешний монитор — Нижний (тач)"
                                        DualScreenPreset.INTERNAL_BOTTOM_EXTERNAL_TOP -> "Основной экран смартфона — Нижний (тач в руках), Внешний монитор — Верхний (игра)"
                                    }
                                    ConsoleRow(
                                        label = label,
                                        subtitle = subtitle,
                                        icon = icon,
                                        selected = preset == dualScreenPreset,
                                        onClick = { onDualScreenPresetSelected(preset) },
                                    ) {
                                        if (preset == dualScreenPreset) {
                                            Icon(Icons.Filled.Check, null, tint = colors.green, modifier = Modifier.size(20.dp))
                                        }
                                    }
                                }

                                Spacer(Modifier.height(4.dp))
                                ConsoleSectionLabel("Масштабирование")

                                ConsoleToggleRow(
                                    label = stringResource(R.string.keep_ds_ratio),
                                    checked = keepAspectRatio,
                                    onToggle = onKeepAspectRatioChanged,
                                    enabled = presetSelected,
                                )
                                ConsoleToggleRow(
                                    label = stringResource(R.string.dual_screen_integer_scale),
                                    checked = integerScaleEnabled,
                                    onToggle = onIntegerScaleChanged,
                                    enabled = presetSelected,
                                )

                                Spacer(Modifier.height(4.dp))
                                val fillEnabled = presetSelected && (keepAspectRatio || integerScaleEnabled)
                                ConsoleRow(
                                    label = stringResource(R.string.dual_screen_fill_area_button),
                                    subtitle = "Настройка заполнения пространства для обоих экранов",
                                    icon = Icons.Filled.FitScreen,
                                    enabled = fillEnabled,
                                    onClick = { screen = PresetsScreen.FILL_AREA },
                                ) {
                                    Icon(Icons.AutoMirrored.Filled.KeyboardArrowRight, null, tint = colors.text3, modifier = Modifier.size(20.dp))
                                }
                                ConsoleRow(
                                    label = stringResource(R.string.dual_screen_vertical_alignment_button),
                                    subtitle = "Точное позиционирование кадров (сверху, по центру, снизу)",
                                    icon = Icons.Filled.AspectRatio,
                                    enabled = fillEnabled,
                                    onClick = { screen = PresetsScreen.VERTICAL_ALIGNMENT },
                                ) {
                                    Icon(Icons.AutoMirrored.Filled.KeyboardArrowRight, null, tint = colors.text3, modifier = Modifier.size(20.dp))
                                }
                            }
                            PresetsScreen.FILL_AREA -> {
                                if (!integerScaleEnabled && !keepAspectRatio) {
                                    ConsoleSectionLabel(stringResource(R.string.dual_screen_fill_area_requires_integer))
                                }
                                ConsoleSectionLabel(stringResource(R.string.dual_screen_fill_section_internal))
                                ConsoleToggleRow(stringResource(R.string.dual_screen_fill_height_label), internalFillHeight, onInternalFillHeightChanged)
                                ConsoleToggleRow(stringResource(R.string.dual_screen_fill_width_label), internalFillWidth, onInternalFillWidthChanged)
                                Spacer(Modifier.height(4.dp))
                                ConsoleSectionLabel(stringResource(R.string.dual_screen_fill_section_external))
                                ConsoleToggleRow(stringResource(R.string.dual_screen_fill_height_label), externalFillHeight, onExternalFillHeightChanged)
                                ConsoleToggleRow(stringResource(R.string.dual_screen_fill_width_label), externalFillWidth, onExternalFillWidthChanged)
                            }
                            PresetsScreen.VERTICAL_ALIGNMENT -> {
                                val alignments = listOf(
                                    null to stringResource(R.string.use_global_preference),
                                    ScreenAlignment.TOP to stringResource(R.string.dual_screen_vertical_alignment_option_top),
                                    ScreenAlignment.CENTER to stringResource(R.string.dual_screen_vertical_alignment_option_center),
                                    ScreenAlignment.BOTTOM to stringResource(R.string.dual_screen_vertical_alignment_option_bottom),
                                )
                                ConsoleSectionLabel(stringResource(R.string.dual_screen_vertical_alignment_internal_label))
                                alignments.forEach { (alignment, label) ->
                                    ConsoleRow(
                                        label = label,
                                        selected = alignment == internalAlignment,
                                        onClick = { onInternalAlignmentChanged(alignment) },
                                    ) {
                                        if (alignment == internalAlignment) Icon(Icons.Filled.Check, null, tint = colors.green, modifier = Modifier.size(20.dp))
                                    }
                                }
                                Spacer(Modifier.height(4.dp))
                                ConsoleSectionLabel(stringResource(R.string.dual_screen_vertical_alignment_external_label))
                                alignments.forEach { (alignment, label) ->
                                    ConsoleRow(
                                        label = label,
                                        selected = alignment == externalAlignment,
                                        onClick = { onExternalAlignmentChanged(alignment) },
                                    ) {
                                        if (alignment == externalAlignment) Icon(Icons.Filled.Check, null, tint = colors.green, modifier = Modifier.size(20.dp))
                                    }
                                }
                            }
                        }
                    }
                }
            }

            // Unified Bottom Center Back Arrow
            me.magnum.melonds.ui.common.UnifiedBackButton(
                onClick = {
                    if (screen == PresetsScreen.MAIN) onBack() else screen = PresetsScreen.MAIN
                },
                modifier = Modifier.align(Alignment.CenterHorizontally),
            )
        }
    }
}

@Composable
private fun ConsoleSectionLabel(text: String) {
    val colors = watermelon
    Text(
        text = text.uppercase(),
        color = colors.text3,
        fontFamily = me.magnum.melonds.ui.theme.WatermelonMono,
        fontSize = 10.sp,
        fontWeight = FontWeight.SemiBold,
        letterSpacing = 0.8.sp,
        modifier = Modifier.padding(start = 4.dp, top = 6.dp, bottom = 2.dp),
    )
}

@Composable
private fun ConsoleRow(
    label: String,
    subtitle: String? = null,
    icon: ImageVector? = null,
    selected: Boolean = false,
    focusRequester: FocusRequester? = null,
    enabled: Boolean = true,
    onClick: () -> Unit,
    trailing: @Composable () -> Unit = {},
) {
    val colors = watermelon
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    val shape = RoundedCornerShape(12.dp)

    val bg = when {
        isFocused -> colors.surface3
        selected -> colors.greenDim
        else -> colors.surface2
    }
    val border = when {
        isFocused -> colors.green
        selected -> colors.green.copy(alpha = 0.7f)
        else -> colors.line
    }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = 46.dp)
            .clip(shape)
            .alpha(if (enabled) 1f else 0.4f)
            .background(bg)
            .border(1.dp, border, shape)
            .let { if (focusRequester != null) it.focusRequester(focusRequester) else it }
            .clickable(interactionSource = interactionSource, indication = null, enabled = enabled, onClick = onClick)
            .padding(horizontal = 14.dp, vertical = 10.dp),
    ) {
        if (icon != null) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = if (selected) colors.green else colors.text2,
                modifier = Modifier.size(22.dp),
            )
            Spacer(Modifier.width(12.dp))
        }
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = label,
                color = colors.text,
                fontFamily = Manrope,
                fontSize = 13.5.sp,
                lineHeight = 17.sp,
                fontWeight = if (selected) FontWeight.Bold else FontWeight.SemiBold,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
            )
            if (subtitle != null) {
                Spacer(Modifier.height(2.dp))
                Text(
                    text = subtitle,
                    color = colors.text2,
                    fontSize = 11.sp,
                    lineHeight = 14.sp,
                )
            }
        }
        Spacer(Modifier.width(10.dp))
        trailing()
    }
}

@Composable
private fun ConsoleToggleRow(
    label: String,
    checked: Boolean,
    onToggle: (Boolean) -> Unit,
    enabled: Boolean = true,
) {
    ConsoleRow(label = label, enabled = enabled, onClick = { onToggle(!checked) }) {
        WatermelonSwitch(checked = checked, onCheckedChange = onToggle, enabled = enabled)
    }
}

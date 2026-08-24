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
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
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
import me.magnum.melonds.ui.common.GamepadHint
import me.magnum.melonds.ui.common.GamepadHintsFooter
import me.magnum.melonds.ui.common.WatermelonSwitch
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.ui.theme.watermelon

import androidx.compose.material.icons.filled.AspectRatio
import androidx.compose.material.icons.filled.Block
import androidx.compose.material.icons.filled.FitScreen
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Smartphone
import androidx.compose.material.icons.filled.Tv
import androidx.compose.ui.graphics.vector.ImageVector

private val PresetsScrim = Color(0xF3080709)

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
) {
    val colors = watermelon
    var screen by remember { mutableStateOf(PresetsScreen.MAIN) }

    BackHandler {
        if (screen == PresetsScreen.MAIN) onBack() else screen = PresetsScreen.MAIN
    }

    ConsoleScaffold(
        title = when (screen) {
            PresetsScreen.MAIN -> stringResource(R.string.dual_screen_presets)
            PresetsScreen.FILL_AREA -> stringResource(R.string.dual_screen_fill_area_title)
            PresetsScreen.VERTICAL_ALIGNMENT -> stringResource(R.string.dual_screen_vertical_alignment_title)
        },
        onBack = { if (screen == PresetsScreen.MAIN) onBack() else screen = PresetsScreen.MAIN },
    ) {
        when (screen) {
            PresetsScreen.MAIN -> {
                val presetSelected = dualScreenPreset != DualScreenPreset.OFF

                // Informative Card
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(14.dp))
                    .background(colors.surface2)
                    .border(1.dp, colors.line, RoundedCornerShape(14.dp))
                    .padding(14.dp),
            ) {
                Column {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(Icons.Filled.Info, null, tint = me.magnum.melonds.ui.theme.WatermelonColors.gold, modifier = Modifier.size(17.dp))
                        Spacer(Modifier.width(7.dp))
                        Text(
                            text = stringResource(R.string.dual_screen_info_title),
                            color = me.magnum.melonds.ui.theme.WatermelonColors.gold,
                            fontFamily = SpaceGrotesk,
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                        )
                    }
                    Spacer(Modifier.height(6.dp))
                    Text(
                        text = stringResource(R.string.dual_screen_info_desc),
                        color = colors.text2,
                        fontSize = 11.sp,
                        lineHeight = 15.sp,
                    )
                }
            }
                Spacer(Modifier.height(8.dp))

                if (!presetSelected) {
                    ConsoleSectionLabel(stringResource(R.string.dual_screen_presets_disabled_hint))
                }
                ConsoleSectionLabel(stringResource(R.string.dual_screen_presets))

                val presets = listOf(
                    Triple(
                        DualScreenPreset.OFF,
                        stringResource(R.string.dual_screen_preset_off),
                        Icons.Filled.Block
                    ),
                    Triple(
                        DualScreenPreset.INTERNAL_TOP_EXTERNAL_BOTTOM,
                        stringResource(R.string.dual_screen_preset_internal_top_external_bottom),
                        Icons.Filled.Tv
                    ),
                    Triple(
                        DualScreenPreset.INTERNAL_BOTTOM_EXTERNAL_TOP,
                        stringResource(R.string.dual_screen_preset_internal_bottom_external_top),
                        Icons.Filled.Smartphone
                    ),
                )
                presets.forEachIndexed { index, (preset, label, icon) ->
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
                        focusRequester = if (index == 0) rememberFirstFocus() else null,
                        onClick = { onDualScreenPresetSelected(preset) },
                    ) {
                        if (preset == dualScreenPreset) {
                            Icon(Icons.Filled.Check, null, tint = colors.green, modifier = Modifier.size(20.dp))
                        }
                    }
                }
                Spacer(Modifier.height(8.dp))
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
                Spacer(Modifier.height(8.dp))
                val fillEnabled = presetSelected && (keepAspectRatio || integerScaleEnabled)
                ConsoleRow(
                    label = stringResource(R.string.dual_screen_fill_area_button),
                    subtitle = "Настройка заполнения пространства по ширине и высоте для обоих экранов",
                    icon = Icons.Filled.FitScreen,
                    enabled = fillEnabled,
                    onClick = { screen = PresetsScreen.FILL_AREA },
                ) {
                    Icon(Icons.AutoMirrored.Filled.KeyboardArrowRight, null, tint = Color.White.copy(alpha = 0.5f), modifier = Modifier.size(20.dp))
                }
                ConsoleRow(
                    label = stringResource(R.string.dual_screen_vertical_alignment_button),
                    subtitle = "Точное позиционирование и выравнивание кадров (сверху, по центру, снизу)",
                    icon = Icons.Filled.AspectRatio,
                    enabled = fillEnabled,
                    onClick = { screen = PresetsScreen.VERTICAL_ALIGNMENT },
                ) {
                    Icon(Icons.AutoMirrored.Filled.KeyboardArrowRight, null, tint = Color.White.copy(alpha = 0.5f), modifier = Modifier.size(20.dp))
                }
            }
            PresetsScreen.FILL_AREA -> {
                if (!integerScaleEnabled && !keepAspectRatio) {
                    ConsoleSectionLabel(stringResource(R.string.dual_screen_fill_area_requires_integer))
                }
                ConsoleSectionLabel(stringResource(R.string.dual_screen_fill_section_internal))
                ConsoleToggleRow(stringResource(R.string.dual_screen_fill_height_label), internalFillHeight, onInternalFillHeightChanged, firstFocus = true)
                ConsoleToggleRow(stringResource(R.string.dual_screen_fill_width_label), internalFillWidth, onInternalFillWidthChanged)
                Spacer(Modifier.height(6.dp))
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
                alignments.forEachIndexed { index, (alignment, label) ->
                    ConsoleRow(
                        label = label,
                        selected = alignment == internalAlignment,
                        focusRequester = if (index == 0) rememberFirstFocus() else null,
                        onClick = { onInternalAlignmentChanged(alignment) },
                    ) {
                        if (alignment == internalAlignment) Icon(Icons.Filled.Check, null, tint = colors.green, modifier = Modifier.size(20.dp))
                    }
                }
                Spacer(Modifier.height(6.dp))
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

@Composable
private fun rememberFirstFocus(): FocusRequester {
    val fr = remember { FocusRequester() }
    me.magnum.melonds.ui.common.RequestInitialFocus(fr)
    return fr
}

@Composable
private fun ConsoleScaffold(
    title: String,
    onBack: () -> Unit,
    content: @Composable () -> Unit,
) {
    val colors = watermelon
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black.copy(alpha = if (colors.isDark) 0.82f else 0.65f))
            .focusProperties { canFocus = false }
            .clickable(interactionSource = remember { MutableInteractionSource() }, indication = null) { onBack() }
            .onPreviewKeyEvent { event ->
                if (event.type == KeyEventType.KeyDown && (event.key == Key.ButtonB || event.key == Key.Back)) {
                    onBack(); true
                } else false
            },
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .systemBarsPadding()
                .focusProperties { canFocus = false }
                .clickable(interactionSource = remember { MutableInteractionSource() }, indication = null) { },
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(52.dp)
                    .background(colors.surface)
                    .padding(horizontal = 14.dp),
                contentAlignment = Alignment.CenterStart,
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxSize(),
                ) {
                    Box(
                        modifier = Modifier
                            .size(36.dp)
                            .clip(CircleShape)
                            .background(colors.surface2)
                            .border(1.dp, colors.line, CircleShape)
                            .clickable(onClick = onBack),
                        contentAlignment = Alignment.Center,
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = stringResource(R.string.back),
                            tint = colors.text,
                            modifier = Modifier.size(18.dp),
                        )
                    }
                    Spacer(Modifier.width(12.dp))
                    Text(
                        text = title,
                        color = colors.text,
                        fontFamily = SpaceGrotesk,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
            }
            Box(Modifier.fillMaxWidth().height(1.dp).background(colors.line))
            Column(
                verticalArrangement = Arrangement.spacedBy(6.dp),
                modifier = Modifier
                    .weight(1f)
                    .widthIn(max = 720.dp)
                    .align(Alignment.CenterHorizontally)
                    .fillMaxWidth()
                    .verticalScroll(rememberScrollState())
                    .padding(horizontal = 20.dp, vertical = 12.dp),
            ) {
                content()
            }
            GamepadHintsFooter(
                hints = listOf(
                    GamepadHint(null, stringResource(R.string.pause_hint_navigate)),
                    GamepadHint("A", stringResource(R.string.pause_hint_accept)),
                    GamepadHint("B", stringResource(R.string.pause_hint_back)),
                ),
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
        modifier = Modifier.padding(start = 2.dp, top = 8.dp, bottom = 2.dp),
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
                fontFamily = SpaceGrotesk,
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
    firstFocus: Boolean = false,
    enabled: Boolean = true,
) {
    val fr = if (firstFocus) rememberFirstFocus() else null
    ConsoleRow(label = label, focusRequester = fr, enabled = enabled, onClick = { onToggle(!checked) }) {
        WatermelonSwitch(checked = checked, onCheckedChange = onToggle, enabled = enabled)
    }
}

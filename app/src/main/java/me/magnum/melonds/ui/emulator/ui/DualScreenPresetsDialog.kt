package me.magnum.melonds.ui.emulator.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Info
import androidx.compose.foundation.border
import me.magnum.melonds.ui.theme.Manrope
import me.magnum.melonds.ui.theme.WatermelonColors
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.foundation.selection.toggleable
import androidx.compose.material.Button
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.MaterialTheme
import androidx.compose.material.RadioButton
import androidx.compose.material.Switch
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogWindowProvider
import me.magnum.melonds.R
import me.magnum.melonds.domain.model.DualScreenPreset
import me.magnum.melonds.domain.model.ScreenAlignment
import me.magnum.melonds.domain.model.defaultExternalAlignment
import me.magnum.melonds.domain.model.defaultInternalAlignment
import me.magnum.melonds.ui.theme.MelonTheme

private val DualScreenDialogMinWidth = 360.dp

@Composable
fun DualScreenPresetsDialog(
    dualScreenPreset: DualScreenPreset,
    onDualScreenPresetSelected: (DualScreenPreset) -> Unit,
    keepAspectRatio: Boolean,
    onKeepAspectRatioChanged: (Boolean) -> Unit,
    isDualScreenIntegerScaleEnabled: Boolean,
    onDualScreenIntegerScaleChanged: (Boolean) -> Unit,
    internalFillHeight: Boolean,
    onInternalFillHeightChanged: (Boolean) -> Unit,
    internalFillWidth: Boolean,
    onInternalFillWidthChanged: (Boolean) -> Unit,
    externalFillHeight: Boolean,
    onExternalFillHeightChanged: (Boolean) -> Unit,
    externalFillWidth: Boolean,
    onExternalFillWidthChanged: (Boolean) -> Unit,
    internalVerticalAlignmentOverride: ScreenAlignment?,
    onInternalVerticalAlignmentOverrideChanged: (ScreenAlignment?) -> Unit,
    externalVerticalAlignmentOverride: ScreenAlignment?,
    onExternalVerticalAlignmentOverrideChanged: (ScreenAlignment?) -> Unit,
    onDismiss: () -> Unit,
) {
    var showFillAreaDialog by remember { mutableStateOf(false) }
    var fillAreaDialogEnabled by remember { mutableStateOf(false) }
    var internalFillHeightState by remember(internalFillHeight) { mutableStateOf(internalFillHeight) }
    var internalFillWidthState by remember(internalFillWidth) { mutableStateOf(internalFillWidth) }
    var externalFillHeightState by remember(externalFillHeight) { mutableStateOf(externalFillHeight) }
    var externalFillWidthState by remember(externalFillWidth) { mutableStateOf(externalFillWidth) }
    var showVerticalAlignmentDialog by remember { mutableStateOf(false) }
    var internalVerticalAlignmentState by remember(internalVerticalAlignmentOverride) { mutableStateOf(internalVerticalAlignmentOverride) }
    var externalVerticalAlignmentState by remember(externalVerticalAlignmentOverride) { mutableStateOf(externalVerticalAlignmentOverride) }

    val colors = me.magnum.melonds.ui.theme.watermelon

    androidx.activity.compose.BackHandler { onDismiss() }

    androidx.compose.foundation.layout.Box(
        modifier = Modifier
            .fillMaxSize()
            .background(androidx.compose.ui.graphics.Color.Black.copy(alpha = if (colors.isDark) 0.82f else 0.65f))
            .clickable(
                interactionSource = remember { androidx.compose.foundation.interaction.MutableInteractionSource() },
                indication = null,
            ) { onDismiss() },
        contentAlignment = Alignment.BottomCenter,
    ) {
        androidx.compose.foundation.layout.Column(
            modifier = Modifier
                .widthIn(max = 760.dp)
                .fillMaxWidth()
                .navigationBarsPadding()
                .padding(bottom = 16.dp)
                .clickable(
                    interactionSource = remember { androidx.compose.foundation.interaction.MutableInteractionSource() },
                    indication = null,
                ) { /* consume click */ },
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            // Main Panel Card
            androidx.compose.foundation.layout.Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .padding(horizontal = 14.dp, vertical = 6.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .background(colors.surface)
                    .border(1.dp, colors.line, RoundedCornerShape(20.dp)),
            ) {
                androidx.compose.foundation.layout.Column(modifier = Modifier.fillMaxSize()) {
                    androidx.compose.foundation.layout.Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth().padding(start = 16.dp, end = 16.dp, top = 14.dp, bottom = 12.dp),
                    ) {
                        androidx.compose.material.Icon(
                            painter = androidx.compose.ui.res.painterResource(R.drawable.ic_view_grid),
                            contentDescription = null,
                            tint = colors.green,
                            modifier = Modifier.size(22.dp),
                        )
                        Spacer(Modifier.width(10.dp))
                        Text(
                            text = stringResource(R.string.dual_screen_presets),
                            color = colors.text,
                            fontFamily = Manrope,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.SemiBold,
                            modifier = Modifier.weight(1f),
                        )
                    }
                    androidx.compose.foundation.layout.Box(Modifier.fillMaxWidth().height(1.dp).background(colors.line))
                    androidx.compose.foundation.layout.Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f)
                            .verticalScroll(rememberScrollState()),
                    ) {
                        DualScreenPresetsContent(
                            dualScreenPreset = dualScreenPreset,
                            onDualScreenPresetSelected = onDualScreenPresetSelected,
                            keepAspectRatio = keepAspectRatio,
                            onKeepAspectRatioChanged = onKeepAspectRatioChanged,
                            isDualScreenIntegerScaleEnabled = isDualScreenIntegerScaleEnabled,
                            onDualScreenIntegerScaleChanged = onDualScreenIntegerScaleChanged,
                            internalFillHeight = internalFillHeightState,
                            internalFillWidth = internalFillWidthState,
                            externalFillHeight = externalFillHeightState,
                            externalFillWidth = externalFillWidthState,
                            onFillAreaOptionsClick = { enabled ->
                                fillAreaDialogEnabled = enabled
                                showFillAreaDialog = true
                            },
                            internalVerticalAlignmentOverride = internalVerticalAlignmentState,
                            externalVerticalAlignmentOverride = externalVerticalAlignmentState,
                            onVerticalAlignmentOptionsClick = {
                                showVerticalAlignmentDialog = true
                            },
                        )
                    }
                }
            }

            // Unified Bottom Center Back Arrow
            me.magnum.melonds.ui.common.UnifiedBackButton(
                onClick = onDismiss,
                modifier = Modifier.align(Alignment.CenterHorizontally),
            )
        }
    }

    if (showFillAreaDialog) {
        DualScreenFillAreaDialog(
            internalFillHeight = internalFillHeightState,
            internalFillWidth = internalFillWidthState,
            externalFillHeight = externalFillHeightState,
            externalFillWidth = externalFillWidthState,
            fillOptionsEnabled = fillAreaDialogEnabled,
            onInternalFillHeightChanged = {
                internalFillHeightState = it
                onInternalFillHeightChanged(it)
            },
            onInternalFillWidthChanged = {
                internalFillWidthState = it
                onInternalFillWidthChanged(it)
            },
            onExternalFillHeightChanged = {
                externalFillHeightState = it
                onExternalFillHeightChanged(it)
            },
            onExternalFillWidthChanged = {
                externalFillWidthState = it
                onExternalFillWidthChanged(it)
            },
            onDismiss = { showFillAreaDialog = false },
        )
    }

    if (showVerticalAlignmentDialog) {
        DualScreenVerticalAlignmentDialog(
            preset = dualScreenPreset,
            internalAlignment = internalVerticalAlignmentState,
            externalAlignment = externalVerticalAlignmentState,
            onInternalAlignmentChanged = {
                internalVerticalAlignmentState = it
                onInternalVerticalAlignmentOverrideChanged(it)
            },
            onExternalAlignmentChanged = {
                externalVerticalAlignmentState = it
                onExternalVerticalAlignmentOverrideChanged(it)
            },
            onDismiss = { showVerticalAlignmentDialog = false },
        )
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun DualScreenPresetsContent(
    dualScreenPreset: DualScreenPreset,
    onDualScreenPresetSelected: (DualScreenPreset) -> Unit,
    keepAspectRatio: Boolean,
    onKeepAspectRatioChanged: (Boolean) -> Unit,
    isDualScreenIntegerScaleEnabled: Boolean,
    onDualScreenIntegerScaleChanged: (Boolean) -> Unit,
    internalFillHeight: Boolean,
    internalFillWidth: Boolean,
    externalFillHeight: Boolean,
    externalFillWidth: Boolean,
    onFillAreaOptionsClick: (Boolean) -> Unit,
    internalVerticalAlignmentOverride: ScreenAlignment?,
    externalVerticalAlignmentOverride: ScreenAlignment?,
    onVerticalAlignmentOptionsClick: () -> Unit,
) {
    val colors = me.magnum.melonds.ui.theme.watermelon
    androidx.compose.foundation.layout.Box {
        var selectedPreset by remember(dualScreenPreset) { mutableStateOf(dualScreenPreset) }
        var keepAspect by remember(keepAspectRatio) { mutableStateOf(keepAspectRatio) }
        var integerScale by remember(isDualScreenIntegerScaleEnabled) { mutableStateOf(isDualScreenIntegerScaleEnabled) }

        Column(modifier = Modifier.fillMaxWidth().padding(horizontal = 18.dp, vertical = 12.dp)) {
            val presetSelected = selectedPreset != DualScreenPreset.OFF

            // Informational Card
            androidx.compose.foundation.layout.Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(14.dp))
                    .background(Color.White.copy(alpha = 0.06f))
                    .border(1.dp, Color.White.copy(alpha = 0.12f), RoundedCornerShape(14.dp))
                    .padding(14.dp),
            ) {
                Column {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        androidx.compose.material.Icon(
                            imageVector = Icons.Filled.Info,
                            contentDescription = null,
                            tint = WatermelonColors.gold,
                            modifier = Modifier.size(17.dp),
                        )
                        Spacer(Modifier.width(7.dp))
                        Text(
                            text = stringResource(R.string.dual_screen_info_title),
                            color = WatermelonColors.gold,
                            fontFamily = Manrope,
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                        )
                    }
                    Spacer(Modifier.height(6.dp))
                    Text(
                        text = stringResource(R.string.dual_screen_info_desc),
                        color = Color.White.copy(alpha = 0.75f),
                        fontSize = 11.sp,
                        lineHeight = 15.sp,
                    )
                }
            }
            Spacer(Modifier.height(14.dp))

            if (!presetSelected) {
                Text(
                    text = stringResource(R.string.dual_screen_presets_disabled_hint),
                    color = colors.red,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.padding(bottom = 8.dp),
                )
            }

            Text(
                text = stringResource(R.string.dual_screen_presets).uppercase(),
                color = Color.White.copy(alpha = 0.5f),
                fontFamily = Manrope,
                fontSize = 11.sp,
                fontWeight = FontWeight.Bold,
                letterSpacing = 0.8.sp,
                modifier = Modifier.padding(start = 2.dp, bottom = 8.dp),
            )

            val presetOptions = listOf(
                Triple(
                    DualScreenPreset.OFF,
                    stringResource(R.string.dual_screen_preset_off),
                    "Оба экрана Nintendo DS выводятся на основном дисплее устройства",
                ),
                Triple(
                    DualScreenPreset.INTERNAL_TOP_EXTERNAL_BOTTOM,
                    stringResource(R.string.dual_screen_preset_internal_top_external_bottom),
                    "Основной экран смартфона — Верхний (игра), Внешний монитор — Нижний (тач)",
                ),
                Triple(
                    DualScreenPreset.INTERNAL_BOTTOM_EXTERNAL_TOP,
                    stringResource(R.string.dual_screen_preset_internal_bottom_external_top),
                    "Основной экран смартфона — Нижний (тач в руках), Внешний монитор — Верхний (игра)",
                ),
            )

            Column(
                modifier = Modifier.selectableGroup(),
                verticalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                presetOptions.forEach { (preset, title, desc) ->
                    val isSelected = preset == selectedPreset
                    val shape = RoundedCornerShape(12.dp)
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(shape)
                            .background(if (isSelected) Color.White.copy(alpha = 0.10f) else Color.White.copy(alpha = 0.04f))
                            .border(
                                width = if (isSelected) 1.5.dp else 1.dp,
                                color = if (isSelected) colors.red else Color.White.copy(alpha = 0.10f),
                                shape = shape,
                            )
                            .selectable(
                                selected = isSelected,
                                onClick = {
                                    selectedPreset = preset
                                    onDualScreenPresetSelected(preset)
                                },
                            )
                            .padding(horizontal = 14.dp, vertical = 12.dp),
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                text = title,
                                color = Color.White,
                                fontSize = 13.5.sp,
                                fontWeight = if (isSelected) FontWeight.Bold else FontWeight.SemiBold,
                                maxLines = 2,
                                overflow = TextOverflow.Ellipsis,
                            )
                            Spacer(Modifier.height(2.dp))
                            Text(
                                text = desc,
                                color = Color.White.copy(alpha = 0.55f),
                                fontSize = 11.sp,
                                lineHeight = 14.sp,
                            )
                        }
                        Spacer(Modifier.width(10.dp))
                        RadioButton(
                            selected = isSelected,
                            onClick = null,
                        )
                    }
                }
            }

            Spacer(Modifier.height(14.dp))

            // Keep DS aspect ratio
            val shape = RoundedCornerShape(12.dp)
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(shape)
                    .alpha(if (presetSelected) 1f else 0.45f)
                    .background(Color.White.copy(alpha = 0.04f))
                    .border(1.dp, Color.White.copy(alpha = 0.10f), shape)
                    .toggleable(
                        value = keepAspect,
                        enabled = presetSelected,
                        onValueChange = {
                            keepAspect = it
                            onKeepAspectRatioChanged(it)
                        },
                    )
                    .padding(horizontal = 14.dp, vertical = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = stringResource(R.string.keep_ds_ratio),
                        color = Color.White,
                        fontSize = 13.5.sp,
                        fontWeight = FontWeight.SemiBold,
                    )
                    Spacer(Modifier.height(2.dp))
                    Text(
                        text = "Сохранение исходных пропорций 4:3 без растягивания картинки",
                        color = Color.White.copy(alpha = 0.55f),
                        fontSize = 11.sp,
                    )
                }
                Spacer(Modifier.width(10.dp))
                Switch(checked = keepAspect, onCheckedChange = null, enabled = presetSelected)
            }

            Spacer(Modifier.height(8.dp))

            // Integer Scale
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(shape)
                    .alpha(if (presetSelected) 1f else 0.45f)
                    .background(Color.White.copy(alpha = 0.04f))
                    .border(1.dp, Color.White.copy(alpha = 0.10f), shape)
                    .toggleable(
                        value = integerScale,
                        enabled = presetSelected,
                        onValueChange = {
                            integerScale = it
                            onDualScreenIntegerScaleChanged(it)
                        },
                    )
                    .padding(horizontal = 14.dp, vertical = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = stringResource(R.string.dual_screen_integer_scale),
                        color = Color.White,
                        fontSize = 13.5.sp,
                        fontWeight = FontWeight.SemiBold,
                    )
                    Spacer(Modifier.height(2.dp))
                    Text(
                        text = "Кратное целочисленное масштабирование пикселей (1x, 2x, 3x)",
                        color = Color.White.copy(alpha = 0.55f),
                        fontSize = 11.sp,
                    )
                }
                Spacer(Modifier.width(10.dp))
                Switch(
                    checked = integerScale,
                    onCheckedChange = null,
                    enabled = presetSelected,
                )
            }

            Spacer(Modifier.height(14.dp))
            val fillAreaEnabled = presetSelected && (integerScale || keepAspect)

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(shape)
                    .alpha(if (fillAreaEnabled) 1f else 0.45f)
                    .background(Color.White.copy(alpha = 0.04f))
                    .border(1.dp, Color.White.copy(alpha = 0.10f), shape)
                    .clickable(enabled = fillAreaEnabled) { onFillAreaOptionsClick(fillAreaEnabled) }
                    .padding(horizontal = 14.dp, vertical = 12.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = stringResource(R.string.dual_screen_fill_area_button),
                        color = Color.White,
                        fontSize = 13.5.sp,
                        fontWeight = FontWeight.SemiBold,
                    )
                    Spacer(Modifier.height(2.dp))
                    Text(
                        text = "Заполнение пространства по высоте и ширине экрана",
                        color = Color.White.copy(alpha = 0.55f),
                        fontSize = 11.sp,
                    )
                }
                androidx.compose.material.Icon(
                    imageVector = androidx.compose.material.icons.Icons.AutoMirrored.Filled.KeyboardArrowRight,
                    contentDescription = null,
                    tint = Color.White.copy(alpha = 0.5f),
                    modifier = Modifier.size(20.dp),
                )
            }

            Spacer(Modifier.height(8.dp))
            val verticalAlignmentEnabled = fillAreaEnabled

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(shape)
                    .alpha(if (verticalAlignmentEnabled) 1f else 0.45f)
                    .background(Color.White.copy(alpha = 0.04f))
                    .border(1.dp, Color.White.copy(alpha = 0.10f), shape)
                    .clickable(enabled = verticalAlignmentEnabled) {
                        if (verticalAlignmentEnabled) {
                            onVerticalAlignmentOptionsClick()
                        }
                    }
                    .padding(horizontal = 14.dp, vertical = 12.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = stringResource(R.string.dual_screen_vertical_alignment_button),
                        color = Color.White,
                        fontSize = 13.5.sp,
                        fontWeight = FontWeight.SemiBold,
                    )
                    Spacer(Modifier.height(2.dp))
                    Text(
                        text = "Позиционирование кадров по вертикали (сверху / центр / снизу)",
                        color = Color.White.copy(alpha = 0.55f),
                        fontSize = 11.sp,
                    )
                }
                androidx.compose.material.Icon(
                    imageVector = androidx.compose.material.icons.Icons.AutoMirrored.Filled.KeyboardArrowRight,
                    contentDescription = null,
                    tint = Color.White.copy(alpha = 0.5f),
                    modifier = Modifier.size(20.dp),
                )
            }
            Spacer(Modifier.height(12.dp))
        }
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun DualScreenFillAreaDialog(
    internalFillHeight: Boolean,
    internalFillWidth: Boolean,
    externalFillHeight: Boolean,
    externalFillWidth: Boolean,
    fillOptionsEnabled: Boolean,
    onInternalFillHeightChanged: (Boolean) -> Unit,
    onInternalFillWidthChanged: (Boolean) -> Unit,
    onExternalFillHeightChanged: (Boolean) -> Unit,
    onExternalFillWidthChanged: (Boolean) -> Unit,
    onDismiss: () -> Unit,
) {
    Dialog(onDismissRequest = onDismiss) {
        (LocalView.current.parent as DialogWindowProvider).window.setDimAmount(0.8f)
        Surface(shape = RoundedCornerShape(17.dp), color = me.magnum.melonds.ui.theme.watermelon.surface, border = BorderStroke(1.dp, me.magnum.melonds.ui.theme.watermelon.line), modifier = Modifier.widthIn(min = DualScreenDialogMinWidth)) {
            var internalHeight by rememberSaveable { mutableStateOf(internalFillHeight) }
            var internalWidth by rememberSaveable { mutableStateOf(internalFillWidth) }
            var externalHeight by rememberSaveable { mutableStateOf(externalFillHeight) }
            var externalWidth by rememberSaveable { mutableStateOf(externalFillWidth) }
            var internalEnabled by rememberSaveable { mutableStateOf(internalFillHeight || internalFillWidth) }
            var externalEnabled by rememberSaveable { mutableStateOf(externalFillHeight || externalFillWidth) }

            LaunchedEffect(internalFillHeight) { internalHeight = internalFillHeight }
            LaunchedEffect(internalFillWidth) { internalWidth = internalFillWidth }
            LaunchedEffect(externalFillHeight) { externalHeight = externalFillHeight }
            LaunchedEffect(externalFillWidth) { externalWidth = externalFillWidth }

            fun setInternalEnabled(value: Boolean) {
                if (internalEnabled == value) return
                internalEnabled = value
                if (!value) {
                    onInternalFillHeightChanged(false)
                    onInternalFillWidthChanged(false)
                } else {
                    onInternalFillHeightChanged(internalHeight)
                    onInternalFillWidthChanged(internalWidth)
                }
            }

            fun setExternalEnabled(value: Boolean) {
                if (externalEnabled == value) return
                externalEnabled = value
                if (!value) {
                    onExternalFillHeightChanged(false)
                    onExternalFillWidthChanged(false)
                } else {
                    onExternalFillHeightChanged(externalHeight)
                    onExternalFillWidthChanged(externalWidth)
                }
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 24.dp),
            ) {
                Text(
                    modifier = Modifier.padding(horizontal = 24.dp),
                    text = stringResource(R.string.dual_screen_fill_area_title),
                    style = MaterialTheme.typography.h6,
                    fontWeight = FontWeight.Bold,
                )
                if (!fillOptionsEnabled) {
                    Spacer(Modifier.height(8.dp))
                    Text(
                        modifier = Modifier.padding(horizontal = 24.dp),
                        text = stringResource(R.string.dual_screen_fill_area_requires_integer),
                        style = MaterialTheme.typography.caption,
                        color = MaterialTheme.colors.onSurface.copy(alpha = 0.7f),
                    )
                }
                Spacer(Modifier.height(16.dp))
                FillAreaSection(
                    title = stringResource(R.string.dual_screen_fill_section_internal),
                    sectionEnabled = fillOptionsEnabled,
                    fillEnabled = internalEnabled,
                    fillHeight = internalHeight,
                    fillWidth = internalWidth,
                    onFillEnabledChanged = { setInternalEnabled(it) },
                    onFillHeightChanged = {
                        internalHeight = it
                        if (internalEnabled) {
                            onInternalFillHeightChanged(it)
                        }
                    },
                    onFillWidthChanged = {
                        internalWidth = it
                        if (internalEnabled) {
                            onInternalFillWidthChanged(it)
                        }
                    },
                )
                Spacer(Modifier.height(12.dp))
                FillAreaSection(
                    title = stringResource(R.string.dual_screen_fill_section_external),
                    sectionEnabled = fillOptionsEnabled,
                    fillEnabled = externalEnabled,
                    fillHeight = externalHeight,
                    fillWidth = externalWidth,
                    onFillEnabledChanged = { setExternalEnabled(it) },
                    onFillHeightChanged = {
                        externalHeight = it
                        if (externalEnabled) {
                            onExternalFillHeightChanged(it)
                        }
                    },
                    onFillWidthChanged = {
                        externalWidth = it
                        if (externalEnabled) {
                            onExternalFillWidthChanged(it)
                        }
                    },
                )
            }
        }
    }
}

@Composable
private fun FillAreaSection(
    title: String,
    sectionEnabled: Boolean,
    fillEnabled: Boolean,
    fillHeight: Boolean,
    fillWidth: Boolean,
    onFillEnabledChanged: (Boolean) -> Unit,
    onFillHeightChanged: (Boolean) -> Unit,
    onFillWidthChanged: (Boolean) -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp),
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Text(
                text = title,
                fontWeight = FontWeight.Bold,
            )
            Switch(
                checked = fillEnabled,
                onCheckedChange = { onFillEnabledChanged(it) },
                enabled = sectionEnabled,
            )
        }
        val childEnabled = sectionEnabled && fillEnabled
        val childAlpha = if (childEnabled) 1f else 0.5f
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 6.dp)
                .alpha(childAlpha),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Text(text = stringResource(R.string.dual_screen_fill_height_label))
            Switch(
                checked = fillHeight,
                onCheckedChange = { onFillHeightChanged(it) },
                enabled = childEnabled,
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 6.dp)
                .alpha(childAlpha),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Text(text = stringResource(R.string.dual_screen_fill_width_label))
            Switch(
                checked = fillWidth,
                onCheckedChange = { onFillWidthChanged(it) },
                enabled = childEnabled,
            )
        }
    }
}

@Composable
private fun DualScreenVerticalAlignmentDialog(
    preset: DualScreenPreset,
    internalAlignment: ScreenAlignment?,
    externalAlignment: ScreenAlignment?,
    onInternalAlignmentChanged: (ScreenAlignment?) -> Unit,
    onExternalAlignmentChanged: (ScreenAlignment?) -> Unit,
    onDismiss: () -> Unit,
) {
    Dialog(onDismissRequest = onDismiss) {
        (LocalView.current.parent as DialogWindowProvider).window.setDimAmount(0.8f)
        Surface(shape = RoundedCornerShape(17.dp), color = me.magnum.melonds.ui.theme.watermelon.surface, border = BorderStroke(1.dp, me.magnum.melonds.ui.theme.watermelon.line)) {
            var internalSelection by remember(preset, internalAlignment) {
                mutableStateOf(internalAlignment ?: preset.defaultInternalAlignment())
            }
            var externalSelection by remember(preset, externalAlignment) {
                mutableStateOf(externalAlignment ?: preset.defaultExternalAlignment())
            }
            var internalEnabled by remember(internalAlignment) { mutableStateOf(internalAlignment != null) }
            var externalEnabled by remember(externalAlignment) { mutableStateOf(externalAlignment != null) }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 24.dp),
            ) {
                Text(
                    modifier = Modifier.padding(horizontal = 24.dp),
                    text = stringResource(R.string.dual_screen_vertical_alignment_title),
                    style = MaterialTheme.typography.h6,
                    fontWeight = FontWeight.Bold,
                )
                Spacer(Modifier.height(16.dp))
                VerticalAlignmentSection(
                    title = stringResource(R.string.dual_screen_vertical_alignment_internal_label),
                    enabled = internalEnabled,
                    selection = internalSelection,
                    onEnabledChanged = { enabled ->
                        internalEnabled = enabled
                        if (enabled) {
                            onInternalAlignmentChanged(internalSelection)
                        } else {
                            onInternalAlignmentChanged(null)
                        }
                    },
                    onSelectionChanged = { alignment ->
                        internalSelection = alignment
                        if (internalEnabled) {
                            onInternalAlignmentChanged(alignment)
                        }
                    },
                )
                Spacer(Modifier.height(12.dp))
                VerticalAlignmentSection(
                    title = stringResource(R.string.dual_screen_vertical_alignment_external_label),
                    enabled = externalEnabled,
                    selection = externalSelection,
                    onEnabledChanged = { enabled ->
                        externalEnabled = enabled
                        if (enabled) {
                            onExternalAlignmentChanged(externalSelection)
                        } else {
                            onExternalAlignmentChanged(null)
                        }
                    },
                    onSelectionChanged = { alignment ->
                        externalSelection = alignment
                        if (externalEnabled) {
                            onExternalAlignmentChanged(alignment)
                        }
                    },
                )
                Spacer(Modifier.height(16.dp))
            }
        }
    }
}

@Composable
private fun VerticalAlignmentSection(
    title: String,
    enabled: Boolean,
    selection: ScreenAlignment,
    onEnabledChanged: (Boolean) -> Unit,
    onSelectionChanged: (ScreenAlignment) -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp),
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Text(
                text = title,
                fontWeight = FontWeight.Bold,
            )
            Switch(
                checked = enabled,
                onCheckedChange = onEnabledChanged,
            )
        }
        val options = listOf(ScreenAlignment.TOP, ScreenAlignment.CENTER, ScreenAlignment.BOTTOM)
        options.forEach { alignment ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .alpha(if (enabled) 1f else 0.5f)
                    .toggleable(
                        value = selection == alignment,
                        enabled = enabled,
                        role = Role.RadioButton,
                        onValueChange = {
                            onSelectionChanged(alignment)
                        },
                    )
                    .padding(vertical = 4.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                RadioButton(
                    selected = selection == alignment,
                    onClick = null,
                    enabled = enabled,
                )
                Text(
                    modifier = Modifier.padding(start = 8.dp),
                    text = alignmentName(alignment),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
            }
        }
    }
}

@Composable
private fun alignmentName(alignment: ScreenAlignment): String {
    return when (alignment) {
        ScreenAlignment.TOP -> stringResource(R.string.dual_screen_vertical_alignment_option_top)
        ScreenAlignment.CENTER -> stringResource(R.string.dual_screen_vertical_alignment_option_center)
        ScreenAlignment.BOTTOM -> stringResource(R.string.dual_screen_vertical_alignment_option_bottom)
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun FillAreaToggleRow(
    label: String,
    enabled: Boolean,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .alpha(if (enabled) 1f else 0.5f)
            .toggleable(
                value = checked,
                enabled = enabled,
                onValueChange = onCheckedChange,
            ),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = 24.dp)
                .padding(vertical = 8.dp),
            text = label,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis,
        )
        Switch(
            checked = checked,
            onCheckedChange = null,
            enabled = enabled,
        )
    }
}

@Preview
@Composable
private fun DualScreenPresetsContentPreview() {
    MelonTheme {
        DualScreenPresetsContent(
            dualScreenPreset = DualScreenPreset.INTERNAL_TOP_EXTERNAL_BOTTOM,
            onDualScreenPresetSelected = {},
            keepAspectRatio = true,
            onKeepAspectRatioChanged = {},
            isDualScreenIntegerScaleEnabled = true,
            onDualScreenIntegerScaleChanged = {},
            internalFillHeight = true,
            internalFillWidth = false,
            externalFillHeight = true,
            externalFillWidth = false,
            onFillAreaOptionsClick = {},
            internalVerticalAlignmentOverride = ScreenAlignment.TOP,
            externalVerticalAlignmentOverride = ScreenAlignment.BOTTOM,
            onVerticalAlignmentOptionsClick = {},
        )
    }
}

package me.magnum.melonds.ui.inputsetup.ui

import android.view.KeyEvent
import android.view.MotionEvent
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Switch
import androidx.compose.material.SwitchDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusProperties
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow
import me.magnum.melonds.R
import me.magnum.melonds.domain.model.Input
import me.magnum.melonds.domain.model.InputConfig
import me.magnum.melonds.domain.model.Slot2AnalogMapping
import me.magnum.melonds.ui.common.MelonPreviewSet
import me.magnum.melonds.ui.common.WatermelonScreenScaffold
import me.magnum.melonds.ui.inputsetup.InputSetupViewModel
import me.magnum.melonds.ui.theme.MelonTheme
import me.magnum.melonds.ui.theme.watermelon
import java.util.Locale

@Composable
fun InputSetupScreen(
    viewModel: InputSetupViewModel,
    onBackClick: () -> Unit,
) {
    val inputConfig by viewModel.inputConfiguration.collectAsStateWithLifecycle()
    val inputUnderConfiguration by viewModel.inputUnderAssignment.collectAsStateWithLifecycle()
    val slot2AnalogMapping by viewModel.slot2AnalogMapping.collectAsStateWithLifecycle()
    val slot2AxisUnderConfiguration by viewModel.slot2AxisUnderAssignment.collectAsStateWithLifecycle()
    val onInputAssignedEvent = viewModel.onInputAssignedEvent

    InputSetupScreenContent(
        inputConfig = inputConfig,
        inputUnderConfiguration = inputUnderConfiguration,
        slot2AnalogMapping = slot2AnalogMapping,
        slot2AxisUnderConfiguration = slot2AxisUnderConfiguration,
        onInputAssignedEvent = onInputAssignedEvent,
        onInputClick = viewModel::startInputAssignment,
        onClearInputClick = viewModel::clearInputAssignment,
        onSlot2AxisXClick = { viewModel.startSlot2AxisAssignment(InputSetupViewModel.Slot2AnalogAxisTarget.X) },
        onSlot2AxisYClick = { viewModel.startSlot2AxisAssignment(InputSetupViewModel.Slot2AnalogAxisTarget.Y) },
        onSlot2InvertXChanged = viewModel::setSlot2InvertX,
        onSlot2InvertYChanged = viewModel::setSlot2InvertY,
        onDeadzoneChanged = viewModel::setSlot2Deadzone,
        onUseDeviceFilterChanged = viewModel::setSlot2UseDeviceFilter,
        onCancelInputConfiguration = viewModel::stopAnyAssignment,
        onBackClick = onBackClick,
    )
}

private val CONSOLE_INPUTS = setOf(
    Input.UP,
    Input.DOWN,
    Input.LEFT,
    Input.RIGHT,
    Input.A,
    Input.B,
    Input.X,
    Input.Y,
    Input.L,
    Input.R,
    Input.START,
    Input.SELECT,
)

@Composable
private fun InputSetupScreenContent(
    inputConfig: List<InputConfig>,
    inputUnderConfiguration: Input?,
    slot2AnalogMapping: Slot2AnalogMapping,
    slot2AxisUnderConfiguration: InputSetupViewModel.Slot2AnalogAxisTarget?,
    onInputAssignedEvent: Flow<Input>,
    onInputClick: (Input) -> Unit,
    onClearInputClick: (Input) -> Unit,
    onSlot2AxisXClick: () -> Unit,
    onSlot2AxisYClick: () -> Unit,
    onSlot2InvertXChanged: (Boolean) -> Unit,
    onSlot2InvertYChanged: (Boolean) -> Unit,
    onDeadzoneChanged: (Float) -> Unit,
    onUseDeviceFilterChanged: (Boolean) -> Unit,
    onCancelInputConfiguration: () -> Unit,
    onBackClick: () -> Unit,
) {
    val focusManager = LocalFocusManager.current

    BackHandler(enabled = inputUnderConfiguration != null || slot2AxisUnderConfiguration != null) {
        onCancelInputConfiguration()
    }
    LaunchedEffect(Unit) {
        onInputAssignedEvent.collect {
            focusManager.moveFocus(focusDirection = FocusDirection.Down)
        }
    }

    val consoleConfig = remember(inputConfig) {
        inputConfig.filter { it.input in CONSOLE_INPUTS }
    }
    val hotkeyConfig = remember(inputConfig) {
        inputConfig.filter { it.input !in CONSOLE_INPUTS }
    }

    WatermelonScreenScaffold(
        title = stringResource(R.string.key_mapping),
        onBack = onBackClick,
    ) { padding ->
        Box(Modifier.fillMaxSize().consumeWindowInsets(padding)) {
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(
                    start = 16.dp,
                    end = 16.dp,
                    top = padding.calculateTopPadding() + 12.dp,
                    bottom = padding.calculateBottomPadding() + 24.dp,
                ),
                verticalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                item {
                    SectionHeader(title = stringResource(R.string.input_group_console))
                }
                items(
                    items = consoleConfig,
                    key = { it.input },
                ) {
                    Input(
                        config = it,
                        isBeingConfigured = it.input == inputUnderConfiguration,
                        onClick = { onInputClick(it.input) },
                        onClearClick = { onClearInputClick(it.input) },
                    )
                }

                item {
                    Spacer(Modifier.height(8.dp))
                    SectionHeader(title = stringResource(R.string.input_group_hotkeys))
                }
                items(
                    items = hotkeyConfig,
                    key = { it.input },
                ) {
                    Input(
                        config = it,
                        isBeingConfigured = it.input == inputUnderConfiguration,
                        onClick = { onInputClick(it.input) },
                        onClearClick = { onClearInputClick(it.input) },
                    )
                }

                item {
                    Spacer(Modifier.height(8.dp))
                    SectionHeader(title = stringResource(R.string.slot2_analog_mapping_title))
                }
                item {
                    Slot2AnalogMappingSection(
                        slot2AnalogMapping = slot2AnalogMapping,
                        slot2AxisUnderConfiguration = slot2AxisUnderConfiguration,
                        onAxisXClick = onSlot2AxisXClick,
                        onAxisYClick = onSlot2AxisYClick,
                        onInvertXChanged = onSlot2InvertXChanged,
                        onInvertYChanged = onSlot2InvertYChanged,
                        onDeadzoneChanged = onDeadzoneChanged,
                        onUseDeviceFilterChanged = onUseDeviceFilterChanged,
                    )
                }
            }

            val waitingLabel = when {
                inputUnderConfiguration != null -> stringResource(R.string.waiting_for_input)
                slot2AxisUnderConfiguration == InputSetupViewModel.Slot2AnalogAxisTarget.X -> stringResource(R.string.slot2_analog_waiting_axis_x)
                slot2AxisUnderConfiguration == InputSetupViewModel.Slot2AnalogAxisTarget.Y -> stringResource(R.string.slot2_analog_waiting_axis_y)
                else -> null
            }
            if (waitingLabel != null) {
                WaitingForInputOverlay(
                    message = waitingLabel,
                    onCancel = onCancelInputConfiguration,
                )
            }
        }
    }
}

@Composable
private fun SectionHeader(title: String) {
    val colors = watermelon
    Text(
        text = title,
        style = MaterialTheme.typography.subtitle2.copy(
            color = colors.green,
            fontWeight = FontWeight.Bold,
        ),
        modifier = Modifier.padding(start = 4.dp, top = 6.dp, bottom = 2.dp),
    )
}

@Composable
private fun Slot2AnalogMappingSection(
    slot2AnalogMapping: Slot2AnalogMapping,
    slot2AxisUnderConfiguration: InputSetupViewModel.Slot2AnalogAxisTarget?,
    onAxisXClick: () -> Unit,
    onAxisYClick: () -> Unit,
    onInvertXChanged: (Boolean) -> Unit,
    onInvertYChanged: (Boolean) -> Unit,
    onDeadzoneChanged: (Float) -> Unit,
    onUseDeviceFilterChanged: (Boolean) -> Unit,
) {
    val colors = watermelon
    val cardShape = RoundedCornerShape(14.dp)
    val innerShape = RoundedCornerShape(10.dp)

    val axisXLabel = if (slot2AxisUnderConfiguration == InputSetupViewModel.Slot2AnalogAxisTarget.X) {
        stringResource(R.string.press_any_button)
    } else {
        formatAxisName(slot2AnalogMapping.axisXCode)
    }
    val axisYLabel = if (slot2AxisUnderConfiguration == InputSetupViewModel.Slot2AnalogAxisTarget.Y) {
        stringResource(R.string.press_any_button)
    } else {
        formatAxisName(slot2AnalogMapping.axisYCode)
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(cardShape)
            .background(colors.surface2)
            .border(1.dp, colors.surface3, cardShape)
            .padding(14.dp),
    ) {
        Text(
            text = stringResource(R.string.slot2_analog_mapping_summary),
            style = MaterialTheme.typography.body2,
            color = colors.text2,
            modifier = Modifier.padding(bottom = 12.dp),
        )

        // Axis X Tile
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clip(innerShape)
                .background(if (slot2AxisUnderConfiguration == InputSetupViewModel.Slot2AnalogAxisTarget.X) colors.surface3 else colors.surface)
                .let {
                    if (slot2AxisUnderConfiguration == InputSetupViewModel.Slot2AnalogAxisTarget.X)
                        it.border(1.5.dp, colors.green, innerShape)
                    else
                        it.border(1.dp, colors.surface3, innerShape)
                }
                .clickable(onClick = onAxisXClick)
                .padding(horizontal = 12.dp, vertical = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = stringResource(R.string.slot2_analog_axis_x),
                    style = MaterialTheme.typography.body1.copy(color = colors.text, fontWeight = FontWeight.Medium),
                )
                Text(
                    text = stringResource(R.string.slot2_analog_axis_x_expected),
                    style = MaterialTheme.typography.caption,
                    color = colors.text2,
                )
            }
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(6.dp))
                    .background(colors.surface3)
                    .padding(horizontal = 8.dp, vertical = 4.dp),
            ) {
                Text(
                    text = axisXLabel,
                    style = MaterialTheme.typography.body2.copy(
                        color = if (slot2AxisUnderConfiguration == InputSetupViewModel.Slot2AnalogAxisTarget.X) colors.green else colors.text,
                        fontWeight = FontWeight.SemiBold,
                    ),
                )
            }
        }

        Spacer(Modifier.height(8.dp))

        // Axis Y Tile
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clip(innerShape)
                .background(if (slot2AxisUnderConfiguration == InputSetupViewModel.Slot2AnalogAxisTarget.Y) colors.surface3 else colors.surface)
                .let {
                    if (slot2AxisUnderConfiguration == InputSetupViewModel.Slot2AnalogAxisTarget.Y)
                        it.border(1.5.dp, colors.green, innerShape)
                    else
                        it.border(1.dp, colors.surface3, innerShape)
                }
                .clickable(onClick = onAxisYClick)
                .padding(horizontal = 12.dp, vertical = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = stringResource(R.string.slot2_analog_axis_y),
                    style = MaterialTheme.typography.body1.copy(color = colors.text, fontWeight = FontWeight.Medium),
                )
                Text(
                    text = stringResource(R.string.slot2_analog_axis_y_expected),
                    style = MaterialTheme.typography.caption,
                    color = colors.text2,
                )
            }
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(6.dp))
                    .background(colors.surface3)
                    .padding(horizontal = 8.dp, vertical = 4.dp),
            ) {
                Text(
                    text = axisYLabel,
                    style = MaterialTheme.typography.body2.copy(
                        color = if (slot2AxisUnderConfiguration == InputSetupViewModel.Slot2AnalogAxisTarget.Y) colors.green else colors.text,
                        fontWeight = FontWeight.SemiBold,
                    ),
                )
            }
        }

        Spacer(Modifier.height(10.dp))

        // Invert X
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 4.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = stringResource(R.string.slot2_analog_invert_x),
                style = MaterialTheme.typography.body1.copy(color = colors.text),
                modifier = Modifier.weight(1f),
            )
            Switch(
                checked = slot2AnalogMapping.invertX,
                onCheckedChange = onInvertXChanged,
                colors = SwitchDefaults.colors(
                    checkedThumbColor = colors.green,
                    checkedTrackColor = colors.greenDim,
                    uncheckedThumbColor = colors.text3,
                    uncheckedTrackColor = colors.switchOff,
                ),
            )
        }

        // Invert Y
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 4.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = stringResource(R.string.slot2_analog_invert_y),
                style = MaterialTheme.typography.body1.copy(color = colors.text),
                modifier = Modifier.weight(1f),
            )
            Switch(
                checked = slot2AnalogMapping.invertY,
                onCheckedChange = onInvertYChanged,
                colors = SwitchDefaults.colors(
                    checkedThumbColor = colors.green,
                    checkedTrackColor = colors.greenDim,
                    uncheckedThumbColor = colors.text3,
                    uncheckedTrackColor = colors.switchOff,
                ),
            )
        }

        // Deadzone Stepper
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 4.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = stringResource(R.string.slot2_analog_deadzone),
                style = MaterialTheme.typography.body1.copy(color = colors.text),
                modifier = Modifier.weight(1f),
            )
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(4.dp),
            ) {
                Box(
                    modifier = Modifier
                        .size(32.dp)
                        .clip(CircleShape)
                        .background(colors.surface3)
                        .clickable { onDeadzoneChanged((slot2AnalogMapping.deadzone - 0.01f).coerceAtLeast(0f)) },
                    contentAlignment = Alignment.Center,
                ) {
                    Text("-", style = MaterialTheme.typography.body1.copy(color = colors.text, fontWeight = FontWeight.Bold))
                }
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(6.dp))
                        .background(colors.surface)
                        .padding(horizontal = 10.dp, vertical = 4.dp),
                ) {
                    Text(
                        text = String.format(Locale.US, "%.2f", slot2AnalogMapping.normalizedDeadzone()),
                        style = MaterialTheme.typography.body2.copy(color = colors.green, fontWeight = FontWeight.Bold),
                    )
                }
                Box(
                    modifier = Modifier
                        .size(32.dp)
                        .clip(CircleShape)
                        .background(colors.surface3)
                        .clickable { onDeadzoneChanged((slot2AnalogMapping.deadzone + 0.01f).coerceAtMost(1f)) },
                    contentAlignment = Alignment.Center,
                ) {
                    Text("+", style = MaterialTheme.typography.body1.copy(color = colors.text, fontWeight = FontWeight.Bold))
                }
            }
        }

        // Device Filter
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 4.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = stringResource(R.string.slot2_analog_device),
                    style = MaterialTheme.typography.body1.copy(color = colors.text),
                )
                val deviceDescription = if (slot2AnalogMapping.useDeviceFilter) {
                    slot2AnalogMapping.deviceId?.toString() ?: stringResource(R.string.slot2_analog_map_axis_first)
                } else {
                    stringResource(R.string.slot2_analog_any_device)
                }
                Text(
                    text = deviceDescription,
                    style = MaterialTheme.typography.caption,
                    color = colors.text2,
                )
            }
            Switch(
                checked = slot2AnalogMapping.useDeviceFilter,
                onCheckedChange = onUseDeviceFilterChanged,
                enabled = slot2AnalogMapping.deviceId != null,
                colors = SwitchDefaults.colors(
                    checkedThumbColor = colors.green,
                    checkedTrackColor = colors.greenDim,
                    uncheckedThumbColor = colors.text3,
                    uncheckedTrackColor = colors.switchOff,
                ),
            )
        }
    }
}

@Composable
private fun Input(
    config: InputConfig,
    isBeingConfigured: Boolean,
    onClick: () -> Unit,
    onClearClick: () -> Unit,
) {
    val (main, clear) = remember { FocusRequester.createRefs() }
    val colors = watermelon
    val interactionSource = remember { androidx.compose.foundation.interaction.MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    val shape = RoundedCornerShape(13.dp)

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .clip(shape)
            .background(if (isFocused || isBeingConfigured) colors.surface3 else colors.surface2)
            .border(
                width = if (isFocused || isBeingConfigured) 2.dp else 1.dp,
                color = if (isFocused || isBeingConfigured) colors.green else colors.surface3,
                shape = shape,
            )
            .focusRequester(main)
            .focusProperties { end = if (config.hasKeyAssigned()) clear else FocusRequester.Default }
            .clickable(interactionSource = interactionSource, indication = null, onClick = onClick)
            .padding(start = 14.dp, top = 10.dp, end = 8.dp, bottom = 10.dp),
    ) {
        Column(Modifier.weight(1f)) {
            val assignments = listOf(config.assignment, config.altAssignment).filter { it != InputConfig.Assignment.None }
            val inputString = if (isBeingConfigured) {
                stringResource(R.string.press_any_button)
            } else {
                if (assignments.isEmpty()) {
                    stringResource(R.string.not_set)
                } else {
                    assignments.joinToString(" / ") { assignment ->
                        when (assignment) {
                            is InputConfig.Assignment.Key -> {
                                val keyCodeString = KeyEvent.keyCodeToString(assignment.keyCode)
                                keyCodeString.replace("KEYCODE", "").replace("_", " ").trim()
                            }
                            is InputConfig.Assignment.Axis -> {
                                val axisString = MotionEvent.axisToString(assignment.axisCode)
                                val axisPrettyName = axisString.replace("_", " ").trim()
                                val prefix = if (assignment.direction == InputConfig.Assignment.Axis.Direction.NEGATIVE) "-" else ""
                                "$prefix$axisPrettyName"
                            }
                            InputConfig.Assignment.None -> ""
                        }
                    }
                }
            }

            Text(
                text = getInputName(config.input) ?: "",
                style = MaterialTheme.typography.body1.copy(
                    color = colors.text,
                    fontWeight = FontWeight.Medium,
                ),
            )

            Text(
                text = inputString,
                style = MaterialTheme.typography.body2.copy(
                    color = if (isBeingConfigured) colors.green else if (assignments.isNotEmpty()) colors.text else colors.text2,
                    fontWeight = if (isBeingConfigured || assignments.isNotEmpty()) FontWeight.SemiBold else FontWeight.Normal,
                ),
            )
        }
        if (config.hasKeyAssigned()) {
            IconButton(
                modifier = Modifier.focusRequester(clear).focusProperties { start = main },
                onClick = onClearClick,
            ) {
                Icon(
                    imageVector = Icons.Default.Clear,
                    contentDescription = stringResource(R.string.clear),
                    tint = colors.text2,
                )
            }
        }
    }
}

@Composable
private fun WaitingForInputOverlay(message: String, onCancel: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background.copy(alpha = 0.8f))
            .clickable(enabled = true, onClick = { })
    ) {
        Column(
            modifier = Modifier.align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = message,
                style = MaterialTheme.typography.h6,
            )
            Spacer(Modifier.height(16.dp))
            TextButton(onClick = onCancel) {
                Text(stringResource(android.R.string.cancel))
            }
        }
    }
}

private fun formatAxisName(axisCode: Int): String {
    val normalizedName = MotionEvent.axisToString(axisCode)
        .replace("AXIS_", "")
        .replace("_", " ")
        .trim()
    return "$normalizedName (#$axisCode)"
}

@Composable
private fun getInputName(input: Input): String? {
    val resource = when (input) {
        Input.A -> R.string.input_a
        Input.B -> R.string.input_b
        Input.X -> R.string.input_x
        Input.Y -> R.string.input_y
        Input.LEFT -> R.string.input_left
        Input.RIGHT -> R.string.input_right
        Input.UP -> R.string.input_up
        Input.DOWN -> R.string.input_down
        Input.L -> R.string.input_l
        Input.R -> R.string.input_r
        Input.START -> R.string.input_start
        Input.SELECT -> R.string.input_select
        Input.HINGE -> R.string.input_lid
        Input.PAUSE -> R.string.input_pause
        Input.FAST_FORWARD -> R.string.input_fast_forward
        Input.HOLD_FAST_FORWARD -> R.string.input_hold_fast_forward
        Input.MICROPHONE -> R.string.input_microphone
        Input.RESET -> R.string.input_reset
        Input.SWAP_SCREENS -> R.string.input_swap_screens
        Input.QUICK_SAVE -> R.string.input_quick_save
        Input.QUICK_LOAD -> R.string.input_quick_load
        Input.REWIND -> R.string.rewind
        Input.TRANSLATE -> R.string.input_translate
        Input.LOCK_ROTATION -> R.string.input_lock_rotation
        else -> return null
    }

    return stringResource(resource)
}

@MelonPreviewSet
@Composable
private fun PreviewInputSetupScreen() {
    MelonTheme {
        InputSetupScreenContent(
            inputConfig = listOf(
                InputConfig(
                    input = Input.A,
                    assignment = InputConfig.Assignment.Key(null, KeyEvent.KEYCODE_A),
                ),
                InputConfig(
                    input = Input.B,
                    assignment = InputConfig.Assignment.Key(null, KeyEvent.KEYCODE_B),
                ),
                InputConfig(
                    input = Input.X,
                    assignment = InputConfig.Assignment.Key(null, KeyEvent.KEYCODE_X),
                ),
                InputConfig(
                    input = Input.Y,
                    assignment = InputConfig.Assignment.Key(null, KeyEvent.KEYCODE_Y),
                ),
                InputConfig(
                    input = Input.UP,
                    assignment = InputConfig.Assignment.Key(null, KeyEvent.KEYCODE_DPAD_UP),
                    altAssignment = InputConfig.Assignment.Axis(null, MotionEvent.AXIS_Y, InputConfig.Assignment.Axis.Direction.NEGATIVE),
                ),
                InputConfig(
                    input = Input.DOWN,
                    assignment = InputConfig.Assignment.Key(null, KeyEvent.KEYCODE_DPAD_DOWN),
                    altAssignment = InputConfig.Assignment.Axis(null, MotionEvent.AXIS_Y, InputConfig.Assignment.Axis.Direction.POSITIVE),
                ),
                InputConfig(
                    input = Input.LEFT,
                    assignment = InputConfig.Assignment.Key(null, KeyEvent.KEYCODE_DPAD_LEFT),
                    altAssignment = InputConfig.Assignment.Axis(null, MotionEvent.AXIS_X, InputConfig.Assignment.Axis.Direction.NEGATIVE),
                ),
                InputConfig(
                    input = Input.RIGHT,
                    assignment = InputConfig.Assignment.Key(null, KeyEvent.KEYCODE_DPAD_RIGHT),
                    altAssignment = InputConfig.Assignment.Axis(null, MotionEvent.AXIS_X, InputConfig.Assignment.Axis.Direction.POSITIVE),
                ),
            ),
            slot2AnalogMapping = Slot2AnalogMapping(),
            inputUnderConfiguration = Input.B,
            slot2AxisUnderConfiguration = null,
            onInputAssignedEvent = emptyFlow(),
            onInputClick = { },
            onClearInputClick = { },
            onSlot2AxisXClick = { },
            onSlot2AxisYClick = { },
            onSlot2InvertXChanged = { },
            onSlot2InvertYChanged = { },
            onDeadzoneChanged = { },
            onUseDeviceFilterChanged = { },
            onCancelInputConfiguration = { },
            onBackClick = { },
        )
    }
}

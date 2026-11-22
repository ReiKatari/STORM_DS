package me.magnum.melonds.ui.inputsetup.ui

import android.content.SharedPreferences
import android.view.KeyEvent
import android.view.MotionEvent
import androidx.activity.compose.BackHandler
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Switch
import androidx.compose.material.SwitchDefaults
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AutoFixHigh
import androidx.compose.material.icons.filled.Bolt
import androidx.compose.material.icons.filled.CameraAlt
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.ControlCamera
import androidx.compose.material.icons.filled.DeleteOutline
import androidx.compose.material.icons.filled.FastForward
import androidx.compose.material.icons.filled.FastRewind
import androidx.compose.material.icons.filled.FolderOpen
import androidx.compose.material.icons.filled.Gamepad
import androidx.compose.material.icons.filled.Keyboard
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.Link
import androidx.compose.material.icons.filled.Mic
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Pause
import androidx.compose.material.icons.filled.PhonelinkSetup
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Save
import androidx.compose.material.icons.filled.ScreenLockRotation
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.SkipNext
import androidx.compose.material.icons.filled.Speed
import androidx.compose.material.icons.filled.SportsEsports
import androidx.compose.material.icons.filled.SwapVert
import androidx.compose.material.icons.filled.Translate
import androidx.compose.material.icons.filled.Tune
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.scale
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusProperties
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.luminance
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.preference.PreferenceManager
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow
import me.magnum.melonds.R
import me.magnum.melonds.domain.model.Input
import me.magnum.melonds.domain.model.InputConfig
import me.magnum.melonds.domain.model.Slot2AnalogMapping
import me.magnum.melonds.ui.common.MelonPreviewSet
import me.magnum.melonds.ui.common.WatermelonScreenScaffold
import me.magnum.melonds.ui.inputsetup.InputSetupViewModel
import me.magnum.melonds.ui.settings.dialogs.ButtonSwatchColors
import me.magnum.melonds.ui.settings.dialogs.resolveButtonSwatches
import me.magnum.melonds.ui.theme.MelonTheme
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.ui.theme.watermelon
import java.util.Locale

private const val KEY_BUTTON_COLOR_THEME = "button_color_theme"
private const val DEFAULT_BUTTON_COLOR_THEME = "cyber_cyan"

@Composable
fun InputSetupScreen(
    viewModel: InputSetupViewModel,
    onBackClick: () -> Unit,
    onAutoMapClick: () -> Unit = {},
    onClearAllClick: () -> Unit = {},
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
        onAutoMapClick = onAutoMapClick,
        onClearAllClick = onClearAllClick,
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

private val SYSTEM_SPECIAL_INPUTS = setOf(
    Input.HINGE,
    Input.MICROPHONE,
    Input.PAUSE,
    Input.RESET,
    Input.SWAP_SCREENS,
    Input.LOCK_ROTATION,
    Input.TOGGLE_EXTRA_BUTTONS,
    Input.TOGGLE_ANALOG_STICK,
)

@Composable
private fun rememberActiveButtonColorThemeKey(): String {
    val context = LocalContext.current
    var themeKey by remember {
        mutableStateOf(
            runCatching {
                PreferenceManager.getDefaultSharedPreferences(context)
                    .getString(KEY_BUTTON_COLOR_THEME, DEFAULT_BUTTON_COLOR_THEME)
                    ?: DEFAULT_BUTTON_COLOR_THEME
            }.getOrDefault(DEFAULT_BUTTON_COLOR_THEME)
        )
    }

    DisposableEffect(context) {
        val prefs = runCatching { PreferenceManager.getDefaultSharedPreferences(context) }.getOrNull()
        val listener = SharedPreferences.OnSharedPreferenceChangeListener { sharedPrefs, key ->
            if (key == KEY_BUTTON_COLOR_THEME) {
                themeKey = sharedPrefs.getString(KEY_BUTTON_COLOR_THEME, DEFAULT_BUTTON_COLOR_THEME)
                    ?: DEFAULT_BUTTON_COLOR_THEME
            }
        }
        prefs?.registerOnSharedPreferenceChangeListener(listener)
        onDispose {
            prefs?.unregisterOnSharedPreferenceChangeListener(listener)
        }
    }
    return themeKey
}

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
    onAutoMapClick: () -> Unit = {},
    onClearAllClick: () -> Unit = {},
) {
    val focusManager = LocalFocusManager.current
    val buttonThemeKey = rememberActiveButtonColorThemeKey()
    val swatch = remember(buttonThemeKey) { resolveButtonSwatches(buttonThemeKey) }

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
    val systemSpecialConfig = remember(inputConfig) {
        inputConfig.filter { it.input in SYSTEM_SPECIAL_INPUTS }
    }
    val hotkeyConfig = remember(inputConfig) {
        inputConfig.filter { it.input !in CONSOLE_INPUTS && it.input !in SYSTEM_SPECIAL_INPUTS }
    }
    val mappedCount = remember(inputConfig) {
        inputConfig.count { it.hasKeyAssigned() }
    }

    WatermelonScreenScaffold(
        title = stringResource(R.string.key_mapping),
        onBack = onBackClick,
        actions = {
            var menuExpanded by remember { mutableStateOf(false) }
            Box {
                IconButton(onClick = { menuExpanded = true }) {
                    Icon(
                        Icons.Default.MoreVert,
                        contentDescription = stringResource(R.string.v780_input_auto_map_title),
                        tint = watermelon.text,
                    )
                }
                DropdownMenu(
                    expanded = menuExpanded,
                    onDismissRequest = { menuExpanded = false },
                ) {
                    DropdownMenuItem(onClick = {
                        menuExpanded = false
                        onAutoMapClick()
                    }) {
                        Text(stringResource(R.string.v780_input_auto_map_title))
                    }
                    DropdownMenuItem(onClick = {
                        menuExpanded = false
                        onClearAllClick()
                    }) {
                        Text(stringResource(R.string.v780_input_clear_all_title))
                    }
                }
            }
        },
    ) { padding ->
        Box(Modifier.fillMaxSize().consumeWindowInsets(padding)) {
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(
                    start = 16.dp,
                    end = 16.dp,
                    top = padding.calculateTopPadding() + 12.dp,
                    bottom = padding.calculateBottomPadding() + 28.dp,
                ),
                verticalArrangement = Arrangement.spacedBy(9.dp),
            ) {
                item(key = "summary_card") {
                    InputSummaryCard(
                        mappedCount = mappedCount,
                        totalCount = inputConfig.size,
                        swatch = swatch,
                        onAutoMapClick = onAutoMapClick,
                        onClearAllClick = onClearAllClick,
                    )
                }

                item(key = "header_console") {
                    Spacer(Modifier.height(4.dp))
                    SectionHeader(
                        title = stringResource(R.string.input_group_console),
                        icon = Icons.Filled.SportsEsports,
                        accent = swatch.glow,
                    )
                }
                items(
                    items = consoleConfig,
                    key = { it.input },
                ) {
                    InputRow3D(
                        config = it,
                        swatch = swatch,
                        isBeingConfigured = it.input == inputUnderConfiguration,
                        onClick = { onInputClick(it.input) },
                        onClearClick = { onClearInputClick(it.input) },
                    )
                }

                if (systemSpecialConfig.isNotEmpty()) {
                    item(key = "header_system_special") {
                        Spacer(Modifier.height(6.dp))
                        SectionHeader(
                            title = stringResource(R.string.input_group_system_special),
                            icon = Icons.Filled.Tune,
                            accent = watermelon.green,
                        )
                    }
                    items(
                        items = systemSpecialConfig,
                        key = { it.input },
                    ) {
                        InputRow3D(
                            config = it,
                            swatch = swatch,
                            isBeingConfigured = it.input == inputUnderConfiguration,
                            onClick = { onInputClick(it.input) },
                            onClearClick = { onClearInputClick(it.input) },
                        )
                    }
                }

                if (hotkeyConfig.isNotEmpty()) {
                    item(key = "header_hotkeys") {
                        Spacer(Modifier.height(6.dp))
                        SectionHeader(
                            title = stringResource(R.string.input_group_hotkeys),
                            icon = Icons.Filled.Bolt,
                            accent = watermelon.green,
                        )
                    }
                    items(
                        items = hotkeyConfig,
                        key = { it.input },
                    ) {
                        InputRow3D(
                            config = it,
                            swatch = swatch,
                            isBeingConfigured = it.input == inputUnderConfiguration,
                            onClick = { onInputClick(it.input) },
                            onClearClick = { onClearInputClick(it.input) },
                        )
                    }
                }

                item(key = "header_slot2") {
                    Spacer(Modifier.height(6.dp))
                    SectionHeader(
                        title = stringResource(R.string.slot2_analog_mapping_title),
                        icon = Icons.Filled.ControlCamera,
                        accent = watermelon.green,
                    )
                }
                item(key = "slot2_section") {
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
                    inputUnderConfiguration = inputUnderConfiguration,
                    slot2AxisUnderConfiguration = slot2AxisUnderConfiguration,
                    swatch = swatch,
                    onCancel = onCancelInputConfiguration,
                )
            }
        }
    }
}

@Composable
private fun InputSummaryCard(
    mappedCount: Int,
    totalCount: Int,
    swatch: ButtonSwatchColors,
    onAutoMapClick: () -> Unit,
    onClearAllClick: () -> Unit,
) {
    val colors = watermelon
    val cardShape = RoundedCornerShape(16.dp)
    val autoMapFocus = remember { FocusRequester() }
    val clearAllFocus = remember { FocusRequester() }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(cardShape)
            .background(colors.shadow.copy(alpha = if (colors.isDark) 0.55f else 0.16f))
            .padding(bottom = 3.dp),
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .clip(cardShape)
                .background(
                    Brush.verticalGradient(
                        listOf(colors.surface2, colors.surface)
                    )
                )
                .border(
                    width = 1.2.dp,
                    color = swatch.glow.copy(alpha = if (colors.isDark) 0.40f else 0.32f),
                    shape = cardShape,
                )
                .padding(14.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(12.dp),
            ) {
                Row(horizontalArrangement = Arrangement.spacedBy(5.dp)) {
                    Mini3DCap("A", swatch.capA, swatch.glow)
                    Mini3DCap("B", swatch.capB, swatch.glow)
                    Mini3DCap("X", swatch.capX, swatch.glow)
                    Mini3DCap("Y", swatch.capY, swatch.glow)
                }

                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = stringResource(R.string.key_mapping),
                        color = colors.text,
                        fontFamily = SpaceGrotesk,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                    )
                    Spacer(Modifier.height(3.dp))
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(6.dp))
                            .background(colors.greenDim)
                            .border(1.dp, colors.green.copy(alpha = 0.35f), RoundedCornerShape(6.dp))
                            .padding(horizontal = 8.dp, vertical = 2.dp),
                    ) {
                        Text(
                            text = stringResource(R.string.input_setup_mapped_count, mappedCount, totalCount),
                            color = colors.green,
                            fontFamily = SpaceGrotesk,
                            fontSize = 11.5.sp,
                            fontWeight = FontWeight.Bold,
                            maxLines = 1,
                        )
                    }
                }
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(10.dp),
            ) {
                Elevated3DActionButton(
                    label = stringResource(R.string.input_setup_auto_map_short),
                    icon = Icons.Filled.AutoFixHigh,
                    accent = colors.green,
                    onClick = onAutoMapClick,
                    modifier = Modifier
                        .weight(1f)
                        .focusRequester(autoMapFocus)
                        .focusProperties { end = clearAllFocus },
                )
                Elevated3DActionButton(
                    label = stringResource(R.string.input_setup_clear_all_short),
                    icon = Icons.Filled.DeleteOutline,
                    accent = colors.red,
                    onClick = onClearAllClick,
                    modifier = Modifier
                        .weight(1f)
                        .focusRequester(clearAllFocus)
                        .focusProperties { start = autoMapFocus },
                )
            }
        }
    }
}

@Composable
private fun Elevated3DActionButton(
    label: String,
    icon: ImageVector,
    accent: Color,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val colors = watermelon
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    val shape = RoundedCornerShape(11.dp)

    Box(
        modifier = modifier
            .clip(shape)
            .background(accent.copy(alpha = if (colors.isDark) 0.25f else 0.16f))
            .padding(bottom = 2.5.dp),
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clip(shape)
                .background(
                    Brush.verticalGradient(
                        listOf(
                            accent.copy(alpha = if (isFocused) 0.30f else 0.18f),
                            colors.surface2,
                        )
                    )
                )
                .border(
                    width = if (isFocused) 2.dp else 1.1.dp,
                    color = if (isFocused) colors.green else accent.copy(alpha = 0.55f),
                    shape = shape,
                )
                .clickable(interactionSource = interactionSource, indication = null, onClick = onClick)
                .padding(horizontal = 10.dp, vertical = 9.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = accent,
                modifier = Modifier.size(16.dp),
            )
            Spacer(Modifier.width(6.dp))
            Text(
                text = label,
                color = colors.text,
                fontFamily = SpaceGrotesk,
                fontSize = 12.5.sp,
                fontWeight = FontWeight.Bold,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
        }
    }
}

@Composable
private fun Mini3DCap(
    letter: String,
    capColors: Pair<Color, Color>,
    borderGlow: Color,
) {
    val labelColor = if (capColors.first.luminance() > 0.62f) Color(0xFF0F172A) else Color(0xFFF8FAFC)
    Box(
        modifier = Modifier
            .size(25.dp)
            .clip(CircleShape)
            .background(capColors.second.copy(alpha = 0.75f))
            .padding(bottom = 1.5.dp),
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .clip(CircleShape)
                .background(Brush.verticalGradient(listOf(capColors.first, capColors.second)))
                .border(1.2.dp, borderGlow.copy(alpha = 0.85f), CircleShape),
            contentAlignment = Alignment.Center,
        ) {
            Box(
                modifier = Modifier
                    .align(Alignment.TopCenter)
                    .fillMaxWidth(0.75f)
                    .fillMaxHeight(0.42f)
                    .padding(top = 1.5.dp)
                    .clip(CircleShape)
                    .background(
                        Brush.verticalGradient(
                            listOf(Color.White.copy(alpha = 0.42f), Color.Transparent)
                        )
                    ),
            )
            Text(
                text = letter,
                color = labelColor,
                fontFamily = SpaceGrotesk,
                fontSize = 10.5.sp,
                fontWeight = FontWeight.ExtraBold,
            )
        }
    }
}

@Composable
private fun SectionHeader(
    title: String,
    icon: ImageVector,
    accent: Color,
) {
    val colors = watermelon
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 2.dp, end = 2.dp, top = 4.dp, bottom = 2.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        Box(
            modifier = Modifier
                .size(24.dp)
                .clip(RoundedCornerShape(7.dp))
                .background(accent.copy(alpha = if (colors.isDark) 0.18f else 0.14f))
                .border(1.dp, accent.copy(alpha = 0.45f), RoundedCornerShape(7.dp)),
            contentAlignment = Alignment.Center,
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = accent,
                modifier = Modifier.size(14.dp),
            )
        }
        Text(
            text = title,
            color = colors.text,
            fontFamily = SpaceGrotesk,
            fontSize = 13.sp,
            fontWeight = FontWeight.Bold,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
        )
        Box(
            modifier = Modifier
                .weight(1f)
                .height(1.dp)
                .background(
                    Brush.horizontalGradient(
                        listOf(accent.copy(alpha = 0.45f), Color.Transparent)
                    )
                ),
        )
    }
}

@Composable
private fun ConsoleButtonCap3D(
    input: Input,
    swatch: ButtonSwatchColors,
    size: Dp,
    isHighlighted: Boolean = false,
) {
    val colors = watermelon
    val neutralTop = if (colors.isDark) Color(0xFF334155) else Color(0xFFE2E8F0)
    val neutralBot = if (colors.isDark) Color(0xFF1E293B) else Color(0xFFCBD5E1)
    val shoulderTop = if (colors.isDark) Color(0xFF3B475C) else Color(0xFFD8E1EC)
    val shoulderBot = if (colors.isDark) Color(0xFF1B2332) else Color(0xFFB4C3D4)

    val (capColors, shape, textLabel, icon) = when (input) {
        Input.A -> Quad(swatch.capA, CircleShape, "A", null)
        Input.B -> Quad(swatch.capB, CircleShape, "B", null)
        Input.X -> Quad(swatch.capX, CircleShape, "X", null)
        Input.Y -> Quad(swatch.capY, CircleShape, "Y", null)
        Input.UP -> Quad(neutralTop to neutralBot, RoundedCornerShape(10.dp), null, Icons.Filled.KeyboardArrowUp)
        Input.DOWN -> Quad(neutralTop to neutralBot, RoundedCornerShape(10.dp), null, Icons.Filled.KeyboardArrowDown)
        Input.LEFT -> Quad(neutralTop to neutralBot, RoundedCornerShape(10.dp), null, Icons.Filled.KeyboardArrowLeft)
        Input.RIGHT -> Quad(neutralTop to neutralBot, RoundedCornerShape(10.dp), null, Icons.Filled.KeyboardArrowRight)
        Input.L -> Quad(shoulderTop to shoulderBot, RoundedCornerShape(10.dp), "L", null)
        Input.R -> Quad(shoulderTop to shoulderBot, RoundedCornerShape(10.dp), "R", null)
        Input.START -> Quad(neutralTop to neutralBot, RoundedCornerShape(10.dp), "ST", null)
        Input.SELECT -> Quad(neutralTop to neutralBot, RoundedCornerShape(10.dp), "SE", null)
        Input.HINGE -> Quad(colors.surface3 to colors.surface2, RoundedCornerShape(11.dp), null, Icons.Filled.PhonelinkSetup)
        Input.PAUSE -> Quad(colors.surface3 to colors.surface2, RoundedCornerShape(11.dp), null, Icons.Filled.Pause)
        Input.FAST_FORWARD -> Quad(colors.surface3 to colors.surface2, RoundedCornerShape(11.dp), null, Icons.Filled.FastForward)
        Input.HOLD_FAST_FORWARD -> Quad(colors.surface3 to colors.surface2, RoundedCornerShape(11.dp), null, Icons.Filled.FastForward)
        Input.MICROPHONE -> Quad(colors.surface3 to colors.surface2, RoundedCornerShape(11.dp), null, Icons.Filled.Mic)
        Input.RESET -> Quad(colors.surface3 to colors.surface2, RoundedCornerShape(11.dp), null, Icons.Filled.Refresh)
        Input.SWAP_SCREENS -> Quad(colors.surface3 to colors.surface2, RoundedCornerShape(11.dp), null, Icons.Filled.SwapVert)
        Input.QUICK_SAVE -> Quad(colors.surface3 to colors.surface2, RoundedCornerShape(11.dp), null, Icons.Filled.Save)
        Input.QUICK_LOAD -> Quad(colors.surface3 to colors.surface2, RoundedCornerShape(11.dp), null, Icons.Filled.FolderOpen)
        Input.REWIND -> Quad(colors.surface3 to colors.surface2, RoundedCornerShape(11.dp), null, Icons.Filled.FastRewind)
        Input.TRANSLATE -> Quad(colors.surface3 to colors.surface2, RoundedCornerShape(11.dp), null, Icons.Filled.Translate)
        Input.LOCK_ROTATION -> Quad(colors.surface3 to colors.surface2, RoundedCornerShape(11.dp), null, Icons.Filled.ScreenLockRotation)
        Input.TOGGLE_EXTRA_BUTTONS -> Quad(colors.surface3 to colors.surface2, RoundedCornerShape(11.dp), null, Icons.Filled.Tune)
        Input.TOGGLE_ANALOG_STICK -> Quad(colors.surface3 to colors.surface2, RoundedCornerShape(11.dp), null, Icons.Filled.ControlCamera)
        Input.SLOW_MOTION -> Quad(colors.surface3 to colors.surface2, RoundedCornerShape(11.dp), null, Icons.Filled.Speed)
        Input.FRAME_ADVANCE -> Quad(colors.surface3 to colors.surface2, RoundedCornerShape(11.dp), null, Icons.Filled.SkipNext)
        Input.TAKE_SCREENSHOT -> Quad(colors.surface3 to colors.surface2, RoundedCornerShape(11.dp), null, Icons.Filled.CameraAlt)
        Input.TOGGLE_HARDWARE_TURBO -> Quad(colors.surface3 to colors.surface2, RoundedCornerShape(11.dp), null, Icons.Filled.Bolt)
        else -> Quad(colors.surface3 to colors.surface2, RoundedCornerShape(11.dp), null, Icons.Filled.Settings)
    }

    val isFaceButton = input == Input.A || input == Input.B || input == Input.X || input == Input.Y
    val rimColor = when {
        isHighlighted -> colors.green
        isFaceButton -> swatch.glow.copy(alpha = 0.88f)
        input in CONSOLE_INPUTS -> swatch.glow.copy(alpha = 0.50f)
        else -> colors.green.copy(alpha = 0.45f)
    }
    val fgColor = when {
        isFaceButton -> if (capColors.first.luminance() > 0.62f) Color(0xFF0F172A) else Color(0xFFF8FAFC)
        input in CONSOLE_INPUTS -> if (capColors.first.luminance() > 0.62f) Color(0xFF0F172A) else Color(0xFFF8FAFC)
        else -> colors.green
    }

    Box(
        modifier = Modifier.size(size),
        contentAlignment = Alignment.Center,
    ) {
        // Outer ambient glow for face buttons or highlighted caps
        if (isFaceButton || isHighlighted) {
            val glowColor = if (isHighlighted) colors.green else swatch.glow
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Brush.radialGradient(
                            listOf(glowColor.copy(alpha = 0.34f), Color.Transparent)
                        ),
                        shape,
                    ),
            )
        }

        // Bottom 3D bevel extrusion
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(2.dp)
                .clip(shape)
                .background(capColors.second.copy(alpha = 0.85f))
                .padding(bottom = 2.5.dp),
        ) {
            // Main vertical gradient cap body
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .clip(shape)
                    .background(Brush.verticalGradient(listOf(capColors.first, capColors.second)))
                    .border(width = if (isHighlighted) 1.8.dp else 1.2.dp, color = rimColor, shape = shape),
                contentAlignment = Alignment.Center,
            ) {
                // Top glossy specular highlight arc
                Box(
                    modifier = Modifier
                        .align(Alignment.TopCenter)
                        .fillMaxWidth(0.78f)
                        .fillMaxHeight(0.45f)
                        .padding(top = 2.dp)
                        .clip(shape)
                        .background(
                            Brush.verticalGradient(
                                listOf(Color.White.copy(alpha = 0.38f), Color.Transparent)
                            )
                        ),
                )

                if (textLabel != null) {
                    Text(
                        text = textLabel,
                        color = fgColor,
                        fontFamily = SpaceGrotesk,
                        fontSize = if (size >= 50.dp) 18.sp else if (textLabel.length > 1) 12.sp else 14.5.sp,
                        fontWeight = FontWeight.ExtraBold,
                    )
                } else if (icon != null) {
                    Icon(
                        imageVector = icon,
                        contentDescription = null,
                        tint = fgColor,
                        modifier = Modifier.size(if (size >= 50.dp) 26.dp else 20.dp),
                    )
                }
            }
        }
    }
}

private data class Quad(
    val capColors: Pair<Color, Color>,
    val shape: Shape,
    val textLabel: String?,
    val icon: ImageVector?,
)

@Composable
private fun InputRow3D(
    config: InputConfig,
    swatch: ButtonSwatchColors,
    isBeingConfigured: Boolean,
    onClick: () -> Unit,
    onClearClick: () -> Unit,
) {
    val (main, clear) = remember { FocusRequester.createRefs() }
    val colors = watermelon
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    val shape = RoundedCornerShape(14.dp)
    val assignments = remember(config.assignment, config.altAssignment) {
        listOf(config.assignment, config.altAssignment).filter { it != InputConfig.Assignment.None }
    }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(shape)
            .background(colors.shadow.copy(alpha = if (colors.isDark) 0.42f else 0.12f))
            .padding(bottom = 2.dp),
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier
                .fillMaxWidth()
                .clip(shape)
                .background(
                    Brush.verticalGradient(
                        if (isFocused || isBeingConfigured) {
                            listOf(colors.surface3, colors.surface2)
                        } else {
                            listOf(colors.surface2, colors.surface)
                        }
                    )
                )
                .border(
                    width = if (isFocused || isBeingConfigured) 2.dp else 1.dp,
                    color = when {
                        isFocused || isBeingConfigured -> colors.green
                        assignments.isNotEmpty() -> colors.line
                        else -> colors.surface3
                    },
                    shape = shape,
                )
                .focusRequester(main)
                .focusProperties { end = if (config.hasKeyAssigned()) clear else FocusRequester.Default }
                .clickable(interactionSource = interactionSource, indication = null, onClick = onClick)
                .padding(start = 12.dp, top = 10.dp, end = 8.dp, bottom = 10.dp),
        ) {
            ConsoleButtonCap3D(
                input = config.input,
                swatch = swatch,
                size = 42.dp,
                isHighlighted = isFocused || isBeingConfigured,
            )

            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.spacedBy(5.dp),
            ) {
                Text(
                    text = getInputName(config.input) ?: config.input.name,
                    color = colors.text,
                    fontFamily = SpaceGrotesk,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )

                if (isBeingConfigured) {
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(7.dp))
                            .background(colors.greenDim)
                            .border(1.dp, colors.green, RoundedCornerShape(7.dp))
                            .padding(horizontal = 8.dp, vertical = 3.dp),
                    ) {
                        Text(
                            text = stringResource(R.string.press_any_button),
                            color = colors.green,
                            fontFamily = SpaceGrotesk,
                            fontSize = 11.5.sp,
                            fontWeight = FontWeight.Bold,
                            maxLines = 1,
                        )
                    }
                } else if (assignments.isEmpty()) {
                    UnmappedDashedChip(text = stringResource(R.string.not_set))
                } else {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(6.dp),
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        assignments.forEach { assignment ->
                            PhysicalKeycapChip3D(
                                assignment = assignment,
                                modifier = Modifier.weight(1f, fill = false),
                            )
                        }
                    }
                }
            }

            if (config.hasKeyAssigned()) {
                Box(
                    modifier = Modifier
                        .size(34.dp)
                        .clip(CircleShape)
                        .background(colors.surface3.copy(alpha = 0.7f))
                        .border(1.dp, colors.line, CircleShape),
                    contentAlignment = Alignment.Center,
                ) {
                    IconButton(
                        modifier = Modifier
                            .fillMaxSize()
                            .focusRequester(clear)
                            .focusProperties { start = main },
                        onClick = onClearClick,
                    ) {
                        Icon(
                            imageVector = Icons.Default.Clear,
                            contentDescription = stringResource(R.string.clear),
                            tint = colors.text2,
                            modifier = Modifier.size(16.dp),
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun UnmappedDashedChip(text: String) {
    val colors = watermelon
    val dashColor = colors.text3.copy(alpha = 0.45f)
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(7.dp))
            .background(colors.surface.copy(alpha = 0.45f))
            .drawBehind {
                drawRoundRect(
                    color = dashColor,
                    cornerRadius = CornerRadius(7.dp.toPx(), 7.dp.toPx()),
                    style = Stroke(
                        width = 1.dp.toPx(),
                        pathEffect = PathEffect.dashPathEffect(floatArrayOf(8f, 6f), 0f),
                    ),
                )
            }
            .padding(horizontal = 9.dp, vertical = 3.5.dp),
    ) {
        Text(
            text = text,
            color = colors.text3,
            fontSize = 11.5.sp,
            fontWeight = FontWeight.Medium,
            maxLines = 1,
        )
    }
}

@Composable
private fun PhysicalKeycapChip3D(
    assignment: InputConfig.Assignment,
    modifier: Modifier = Modifier,
) {
    val colors = watermelon
    val chipShape = RoundedCornerShape(7.dp)
    val (icon, label) = remember(assignment) { formatAssignmentChip(assignment) }

    Box(
        modifier = modifier
            .clip(chipShape)
            .background(colors.shadow.copy(alpha = if (colors.isDark) 0.60f else 0.18f))
            .padding(bottom = 2.dp),
    ) {
        Row(
            modifier = Modifier
                .clip(chipShape)
                .background(
                    Brush.verticalGradient(
                        listOf(colors.surface3, colors.surface2)
                    )
                )
                .border(1.dp, colors.green.copy(alpha = 0.35f), chipShape)
                .padding(horizontal = 8.dp, vertical = 3.5.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(5.dp),
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = colors.green,
                modifier = Modifier.size(13.dp),
            )
            Text(
                text = label,
                color = colors.text,
                fontFamily = SpaceGrotesk,
                fontSize = 11.5.sp,
                fontWeight = FontWeight.SemiBold,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
        }
    }
}

private fun formatAssignmentChip(assignment: InputConfig.Assignment): Pair<ImageVector, String> {
    return when (assignment) {
        is InputConfig.Assignment.Key -> {
            val raw = KeyEvent.keyCodeToString(assignment.keyCode)
            val isGamepad = raw.contains("BUTTON_") || raw.contains("DPAD_")
            val clean = raw
                .replace("KEYCODE_", "")
                .replace("BUTTON_", "")
                .replace("_", " ")
                .trim()
            val icon = if (isGamepad) Icons.Filled.Gamepad else Icons.Filled.Keyboard
            icon to clean
        }
        is InputConfig.Assignment.Axis -> {
            val axisPretty = MotionEvent.axisToString(assignment.axisCode)
                .replace("AXIS_", "")
                .replace("_", " ")
                .trim()
            val prefix = if (assignment.direction == InputConfig.Assignment.Axis.Direction.NEGATIVE) "-" else "+"
            Icons.Filled.ControlCamera to "$prefix$axisPretty"
        }
        is InputConfig.Assignment.Chord -> {
            val modStr = KeyEvent.keyCodeToString(assignment.modifierKeyCode)
                .replace("KEYCODE_", "")
                .replace("BUTTON_", "")
                .replace("_", " ")
                .trim()
            val trigStr = KeyEvent.keyCodeToString(assignment.triggerKeyCode)
                .replace("KEYCODE_", "")
                .replace("BUTTON_", "")
                .replace("_", " ")
                .trim()
            Icons.Filled.Link to "$modStr + $trigStr"
        }
        InputConfig.Assignment.None -> Icons.Filled.Keyboard to ""
    }
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
    val cardShape = RoundedCornerShape(15.dp)
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

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(cardShape)
            .background(colors.shadow.copy(alpha = if (colors.isDark) 0.45f else 0.14f))
            .padding(bottom = 2.5.dp),
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .clip(cardShape)
                .background(Brush.verticalGradient(listOf(colors.surface2, colors.surface)))
                .border(1.dp, colors.line, cardShape)
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
                        if (slot2AxisUnderConfiguration == InputSetupViewModel.Slot2AnalogAxisTarget.X) {
                            it.border(1.5.dp, colors.green, innerShape)
                        } else {
                            it.border(1.dp, colors.surface3, innerShape)
                        }
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
                        .border(1.dp, colors.line, RoundedCornerShape(6.dp))
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
                        if (slot2AxisUnderConfiguration == InputSetupViewModel.Slot2AnalogAxisTarget.Y) {
                            it.border(1.5.dp, colors.green, innerShape)
                        } else {
                            it.border(1.dp, colors.surface3, innerShape)
                        }
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
                        .border(1.dp, colors.line, RoundedCornerShape(6.dp))
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
                            .border(1.dp, colors.line, CircleShape)
                            .clickable { onDeadzoneChanged((slot2AnalogMapping.deadzone - 0.01f).coerceAtLeast(0f)) },
                        contentAlignment = Alignment.Center,
                    ) {
                        Text("-", style = MaterialTheme.typography.body1.copy(color = colors.text, fontWeight = FontWeight.Bold))
                    }
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(6.dp))
                            .background(colors.surface)
                            .border(1.dp, colors.line, RoundedCornerShape(6.dp))
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
                            .border(1.dp, colors.line, CircleShape)
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
}

@Composable
private fun WaitingForInputOverlay(
    message: String,
    inputUnderConfiguration: Input?,
    slot2AxisUnderConfiguration: InputSetupViewModel.Slot2AnalogAxisTarget?,
    swatch: ButtonSwatchColors,
    onCancel: () -> Unit,
) {
    val colors = watermelon
    val modalShape = RoundedCornerShape(22.dp)
    val pulseTransition = rememberInfiniteTransition(label = "waitingInputPulse")
    val pulseScale by pulseTransition.animateFloat(
        initialValue = 1.0f,
        targetValue = 1.24f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 900),
            repeatMode = RepeatMode.Reverse,
        ),
        label = "pulseScale",
    )
    val pulseAlpha by pulseTransition.animateFloat(
        initialValue = 0.55f,
        targetValue = 0.14f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 900),
            repeatMode = RepeatMode.Reverse,
        ),
        label = "pulseAlpha",
    )

    val glowColor = when (inputUnderConfiguration) {
        Input.A, Input.B, Input.X, Input.Y -> swatch.glow
        else -> colors.green
    }
    val targetLabel = inputUnderConfiguration?.let { getInputName(it) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(colors.bg.copy(alpha = 0.80f))
            .clickable(enabled = true, onClick = { })
            .padding(24.dp),
        contentAlignment = Alignment.Center,
    ) {
        Box(
            modifier = Modifier
                .widthIn(max = 340.dp)
                .fillMaxWidth()
                .clip(modalShape)
                .background(colors.shadow.copy(alpha = if (colors.isDark) 0.70f else 0.24f))
                .padding(bottom = 4.dp),
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(modalShape)
                    .background(Brush.verticalGradient(listOf(colors.surface2, colors.surface)))
                    .border(1.5.dp, colors.green.copy(alpha = 0.65f), modalShape)
                    .padding(horizontal = 24.dp, vertical = 24.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Box(
                    modifier = Modifier.size(84.dp),
                    contentAlignment = Alignment.Center,
                ) {
                    Box(
                        modifier = Modifier
                            .size(72.dp)
                            .scale(pulseScale)
                            .clip(CircleShape)
                            .background(
                                Brush.radialGradient(
                                    listOf(
                                        glowColor.copy(alpha = pulseAlpha),
                                        Color.Transparent,
                                    )
                                )
                            ),
                    )
                    if (inputUnderConfiguration != null) {
                        ConsoleButtonCap3D(
                            input = inputUnderConfiguration,
                            swatch = swatch,
                            size = 56.dp,
                            isHighlighted = true,
                        )
                    } else {
                        val axisLetter = if (slot2AxisUnderConfiguration == InputSetupViewModel.Slot2AnalogAxisTarget.Y) "Y" else "X"
                        Box(
                            modifier = Modifier
                                .size(56.dp)
                                .clip(CircleShape)
                                .background(colors.surface3)
                                .border(1.8.dp, colors.green, CircleShape),
                            contentAlignment = Alignment.Center,
                        ) {
                            Text(
                                text = axisLetter,
                                color = colors.green,
                                fontFamily = SpaceGrotesk,
                                fontSize = 20.sp,
                                fontWeight = FontWeight.ExtraBold,
                            )
                        }
                    }
                }

                if (targetLabel != null) {
                    Spacer(Modifier.height(10.dp))
                    Text(
                        text = targetLabel,
                        color = colors.green,
                        fontFamily = SpaceGrotesk,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                    )
                }

                Spacer(Modifier.height(6.dp))
                Text(
                    text = message,
                    color = colors.text,
                    fontFamily = SpaceGrotesk,
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                )

                Spacer(Modifier.height(6.dp))
                Text(
                    text = stringResource(R.string.input_setup_waiting_hint),
                    color = colors.text2,
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center,
                    lineHeight = 16.sp,
                )

                Spacer(Modifier.height(18.dp))

                val cancelShape = RoundedCornerShape(10.dp)
                Box(
                    modifier = Modifier
                        .fillMaxWidth(0.65f)
                        .clip(cancelShape)
                        .background(colors.shadow.copy(alpha = if (colors.isDark) 0.50f else 0.16f))
                        .padding(bottom = 2.dp),
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(cancelShape)
                            .background(Brush.verticalGradient(listOf(colors.surface3, colors.surface2)))
                            .border(1.dp, colors.line, cancelShape)
                            .clickable(onClick = onCancel)
                            .padding(vertical = 10.dp),
                        contentAlignment = Alignment.Center,
                    ) {
                        Text(
                            text = stringResource(android.R.string.cancel),
                            color = colors.text,
                            fontFamily = SpaceGrotesk,
                            fontSize = 13.5.sp,
                            fontWeight = FontWeight.Bold,
                        )
                    }
                }
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
        Input.TOGGLE_EXTRA_BUTTONS -> R.string.input_toggle_extra_buttons
        Input.TOGGLE_ANALOG_STICK -> R.string.input_toggle_analog_stick
        Input.SLOW_MOTION -> R.string.input_slow_motion
        Input.FRAME_ADVANCE -> R.string.input_frame_advance
        Input.TAKE_SCREENSHOT -> R.string.input_take_screenshot
        Input.TOGGLE_HARDWARE_TURBO -> R.string.input_toggle_hardware_turbo
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
                    assignment = InputConfig.Assignment.Key(null, KeyEvent.KEYCODE_BUTTON_B),
                ),
                InputConfig(
                    input = Input.B,
                    assignment = InputConfig.Assignment.Key(null, KeyEvent.KEYCODE_BUTTON_A),
                ),
                InputConfig(
                    input = Input.X,
                    assignment = InputConfig.Assignment.Key(null, KeyEvent.KEYCODE_BUTTON_Y),
                ),
                InputConfig(
                    input = Input.Y,
                    assignment = InputConfig.Assignment.Key(null, KeyEvent.KEYCODE_BUTTON_X),
                ),
                InputConfig(
                    input = Input.UP,
                    assignment = InputConfig.Assignment.Key(null, KeyEvent.KEYCODE_DPAD_UP),
                    altAssignment = InputConfig.Assignment.Axis(null, MotionEvent.AXIS_HAT_Y, InputConfig.Assignment.Axis.Direction.NEGATIVE),
                ),
                InputConfig(
                    input = Input.DOWN,
                    assignment = InputConfig.Assignment.Key(null, KeyEvent.KEYCODE_DPAD_DOWN),
                    altAssignment = InputConfig.Assignment.Axis(null, MotionEvent.AXIS_HAT_Y, InputConfig.Assignment.Axis.Direction.POSITIVE),
                ),
                InputConfig(
                    input = Input.LEFT,
                    assignment = InputConfig.Assignment.Key(null, KeyEvent.KEYCODE_DPAD_LEFT),
                    altAssignment = InputConfig.Assignment.Axis(null, MotionEvent.AXIS_HAT_X, InputConfig.Assignment.Axis.Direction.NEGATIVE),
                ),
                InputConfig(
                    input = Input.RIGHT,
                    assignment = InputConfig.Assignment.Key(null, KeyEvent.KEYCODE_DPAD_RIGHT),
                    altAssignment = InputConfig.Assignment.Axis(null, MotionEvent.AXIS_HAT_X, InputConfig.Assignment.Axis.Direction.POSITIVE),
                ),
            ),
            slot2AnalogMapping = Slot2AnalogMapping(),
            inputUnderConfiguration = null,
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

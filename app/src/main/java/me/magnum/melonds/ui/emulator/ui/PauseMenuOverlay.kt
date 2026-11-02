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
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import me.magnum.melonds.ui.common.UnifiedBackButton
import me.magnum.melonds.ui.common.bouncingClickable
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Switch
import androidx.compose.material.SwitchDefaults
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.Logout
import androidx.compose.material.icons.filled.AccessTime
import androidx.compose.material.icons.filled.BatteryStd
import androidx.compose.material.icons.filled.Block
import androidx.compose.material.icons.filled.Bolt
import androidx.compose.material.icons.filled.CameraAlt
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.DashboardCustomize
import androidx.compose.material.icons.filled.Download
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.material.icons.filled.FastForward
import androidx.compose.material.icons.filled.Gamepad
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.HourglassTop
import androidx.compose.material.icons.filled.Layers
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.LockOpen
import androidx.compose.material.icons.filled.Mic
import androidx.compose.material.icons.filled.MicOff
import androidx.compose.material.icons.filled.Palette
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.RestartAlt
import androidx.compose.material.icons.filled.ScreenRotation
import androidx.compose.material.icons.filled.Screenshot
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.SwapVert
import androidx.compose.material.icons.filled.TouchApp
import androidx.compose.material.icons.filled.Tune
import androidx.compose.material.icons.filled.Upload
import androidx.compose.material.icons.filled.VideogameAsset
import androidx.compose.material.icons.filled.VolumeMute
import androidx.compose.material.icons.filled.VolumeUp
import androidx.compose.material.icons.filled.Wifi
import androidx.compose.material.icons.filled.WifiOff
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusProperties
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.FilterQuality
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.KeyEventType
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.onPreviewKeyEvent
import androidx.compose.ui.input.key.type
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import me.magnum.melonds.R
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.ui.common.GamepadHint
import me.magnum.melonds.ui.common.GamepadHintsFooter
import me.magnum.melonds.ui.emulator.PauseMenuOption
import me.magnum.melonds.ui.emulator.firmware.FirmwarePauseMenuOption
import me.magnum.melonds.ui.emulator.model.PauseMenu
import androidx.compose.runtime.mutableIntStateOf
import me.magnum.melonds.ui.emulator.rom.PauseMenuCustomizationStore
import me.magnum.melonds.ui.emulator.rom.RomPauseMenuOption
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalHapticFeedback
import me.magnum.melonds.ui.theme.Manrope
import me.magnum.melonds.ui.theme.WatermelonColors
import me.magnum.melonds.ui.theme.WatermelonMono
import me.magnum.melonds.ui.theme.watermelon
import kotlin.time.Duration

internal fun pauseOptionIcon(option: PauseMenuOption): ImageVector {
    return when (option) {
        RomPauseMenuOption.SAVE_STATE -> Icons.Filled.Download
        RomPauseMenuOption.LOAD_STATE -> Icons.Filled.Upload
        RomPauseMenuOption.QUICK_SLOT_CAROUSEL -> Icons.Filled.Layers
        RomPauseMenuOption.LOAD_PERIODIC_AUTOSAVE -> Icons.Filled.AccessTime
        RomPauseMenuOption.TAKE_SCREENSHOT -> Icons.Filled.CameraAlt
        RomPauseMenuOption.SLOW_MOTION -> Icons.Filled.HourglassTop
        RomPauseMenuOption.FRAME_ADVANCE -> Icons.Filled.PlayArrow
        RomPauseMenuOption.REWIND -> Icons.Filled.History
        RomPauseMenuOption.CHEATS -> Icons.Filled.Tune
        RomPauseMenuOption.VIEW_ACHIEVEMENTS -> Icons.Filled.EmojiEvents
        RomPauseMenuOption.SYNC_RETRO_ACHIEVEMENTS -> Icons.Filled.Refresh
        RomPauseMenuOption.CALIBRATE_GYRO -> Icons.Filled.TouchApp
        RomPauseMenuOption.PRESETS -> Icons.Filled.Gamepad
        RomPauseMenuOption.SCREEN_LAYOUT, FirmwarePauseMenuOption.SCREEN_LAYOUT -> Icons.Filled.ScreenRotation
        RomPauseMenuOption.ROM_SETTINGS -> Icons.Filled.Tune
        RomPauseMenuOption.SETTINGS, FirmwarePauseMenuOption.SETTINGS -> Icons.Filled.Settings
        RomPauseMenuOption.RENDERER_DEBUG -> Icons.Filled.DashboardCustomize
        RomPauseMenuOption.RESET_COMPATIBILITY -> Icons.Filled.Refresh
        RomPauseMenuOption.RESET, FirmwarePauseMenuOption.RESET -> Icons.Filled.RestartAlt
        RomPauseMenuOption.EXIT, FirmwarePauseMenuOption.EXIT -> Icons.AutoMirrored.Filled.Logout
        else -> Icons.Filled.Settings
    }
}

private fun isDestructive(option: PauseMenuOption): Boolean {
    return option == RomPauseMenuOption.RESET || option == RomPauseMenuOption.EXIT ||
        option == FirmwarePauseMenuOption.RESET || option == FirmwarePauseMenuOption.EXIT
}

private fun needsConfirmation(option: PauseMenuOption): Boolean = isDestructive(option)

private fun formatHoursLabel(duration: Duration): String {
    val totalMins = duration.inWholeMinutes
    val h = totalMins / 60
    val m = totalMins % 60
    return if (h > 0) "${h}ч ${m}м" else "${m}м"
}


private enum class PauseMenuCategory(val titleRu: String, val titleEn: String) {
    STATES_AND_TIME("СОСТОЯНИЯ И ВРЕМЯ", "STATES AND TIME"),
    SCREEN_AND_CONTROLS("ЭКРАН И УПРАВЛЕНИЕ", "SCREEN AND CONTROLS"),
    TOOLS_AND_PROFILE("ИНСТРУМЕНТЫ И ПРОФИЛЬ", "TOOLS AND PROFILE"),
    SYSTEM("СИСТЕМА", "SYSTEM");

    fun title(isRu: Boolean): String = if (isRu) titleRu else titleEn
}

private fun getOptionCategory(option: PauseMenuOption): PauseMenuCategory {
    return when (option) {
        RomPauseMenuOption.SAVE_STATE,
        RomPauseMenuOption.LOAD_STATE,
        RomPauseMenuOption.LOAD_PERIODIC_AUTOSAVE,
        RomPauseMenuOption.REWIND,
        RomPauseMenuOption.SLOW_MOTION,
        RomPauseMenuOption.FRAME_ADVANCE,
        RomPauseMenuOption.QUICK_SLOT_CAROUSEL -> PauseMenuCategory.STATES_AND_TIME

        RomPauseMenuOption.PRESETS,
        RomPauseMenuOption.SCREEN_LAYOUT,
        RomPauseMenuOption.CALIBRATE_GYRO,
        RomPauseMenuOption.TAKE_SCREENSHOT,
        RomPauseMenuOption.RENDERER_DEBUG,
        FirmwarePauseMenuOption.SCREEN_LAYOUT -> PauseMenuCategory.SCREEN_AND_CONTROLS

        RomPauseMenuOption.ROM_SETTINGS,
        RomPauseMenuOption.CHEATS,
        RomPauseMenuOption.VIEW_ACHIEVEMENTS,
        RomPauseMenuOption.SYNC_RETRO_ACHIEVEMENTS,
        RomPauseMenuOption.SETTINGS,
        FirmwarePauseMenuOption.SETTINGS -> PauseMenuCategory.TOOLS_AND_PROFILE

        RomPauseMenuOption.RESET_COMPATIBILITY,
        RomPauseMenuOption.RESET,
        RomPauseMenuOption.EXIT,
        FirmwarePauseMenuOption.RESET,
        FirmwarePauseMenuOption.EXIT -> PauseMenuCategory.SYSTEM

        else -> PauseMenuCategory.TOOLS_AND_PROFILE
    }
}

@Composable
private fun PauseMenuSectionHeader(title: String) {
    val colors = watermelon
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 10.dp, bottom = 4.dp, start = 4.dp, end = 4.dp),
    ) {
        Box(
            modifier = Modifier
                .width(3.dp)
                .height(11.dp)
                .clip(RoundedCornerShape(1.5.dp))
                .background(colors.green),
        )
        Spacer(Modifier.width(6.dp))
        Text(
            text = title,
            color = colors.text2,
            fontFamily = Manrope,
            fontSize = 10.5.sp,
            fontWeight = FontWeight.Bold,
            letterSpacing = 0.8.sp,
        )
        Spacer(Modifier.width(8.dp))
        Box(
            modifier = Modifier
                .weight(1f)
                .height(1.dp)
                .background(colors.line.copy(alpha = 0.6f)),
        )
    }
}

@Composable
fun PauseMenuOverlay(
    pauseMenu: PauseMenu,
    rom: Rom?,
    achievementsSummary: String?,
    sessionDurationMs: Long? = null,
    activeQuickSlot: Int = 0,
    isExtendedPauseMenuEnabled: Boolean = false,
    onToggleExtendedPauseMenu: ((Boolean) -> Unit)? = null,
    slowMotionSpeed: Float = 0.5f,
    onQuickSlotCarouselClick: (() -> Unit)? = null,
    onOptionSelected: (PauseMenuOption) -> Unit,
    onResume: () -> Unit,
) {
    val colors = watermelon
    var confirmingOption by remember { mutableStateOf<PauseMenuOption?>(null) }
    val resumeFocusRequester = remember { FocusRequester() }
    val configuration = LocalConfiguration.current
    val isLandscape = configuration.screenWidthDp > configuration.screenHeightDp
    val context = LocalContext.current
    val store = remember(context) { PauseMenuCustomizationStore(context) }
    var showCustomizer by remember { mutableStateOf(false) }
    var customizationVersion by remember { mutableIntStateOf(0) }

    val batteryManager = remember(context) {
        context.getSystemService(android.content.Context.BATTERY_SERVICE) as? android.os.BatteryManager
    }
    val batteryLevel = remember(batteryManager) {
        val level = batteryManager?.getIntProperty(android.os.BatteryManager.BATTERY_PROPERTY_CAPACITY) ?: -1
        if (level in 0..100) level else null
    }

    val currentTimeStr = remember {
        java.text.SimpleDateFormat("HH:mm", java.util.Locale.getDefault()).format(java.util.Date())
    }

    val formattedSession = remember(sessionDurationMs) {
        val durationSec = (sessionDurationMs ?: 0L) / 1000L
        val mins = durationSec / 60
        val hours = mins / 60
        val remMins = mins % 60
        when {
            mins < 1 -> context.getString(R.string.pause_session_less_than_minute)
            hours > 0 -> context.getString(R.string.pause_session_hours_minutes, hours.toInt(), remMins.toInt())
            else -> context.getString(R.string.pause_session_minutes, mins.toInt())
        }
    }

    BackHandler {
        if (confirmingOption != null) {
            confirmingOption = null
        } else {
            onResume()
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black.copy(alpha = if (colors.isDark) 0.82f else 0.65f))
            .focusProperties { canFocus = false }
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null,
            ) { onResume() }
            .onPreviewKeyEvent { event ->
                if (event.type == KeyEventType.KeyDown && (event.key == Key.ButtonB || event.key == Key.Back || event.key == Key.Escape)) {
                    if (confirmingOption != null) {
                        confirmingOption = null
                    } else {
                        onResume()
                    }
                    true
                } else {
                    false
                }
            },
        contentAlignment = Alignment.BottomCenter,
    ) {
        Column(
            modifier = Modifier
                .widthIn(max = if (isLandscape) 860.dp else 760.dp)
                .fillMaxWidth()
                .navigationBarsPadding()
                .padding(bottom = if (isLandscape) 6.dp else 12.dp)
                .focusProperties { canFocus = false }
                .clickable(
                    interactionSource = remember { MutableInteractionSource() },
                    indication = null,
                ) { /* consume clicks inside panel */ },
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            val horizontalEdge = if (isLandscape) 16.dp else 12.dp

            // Top Information Bar: Game Icon, Title, Paused, Session Telemetry & Resume Button
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = horizontalEdge, vertical = if (isLandscape) 3.dp else 4.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(colors.surface)
                    .border(1.dp, colors.line, RoundedCornerShape(16.dp))
                    .padding(horizontal = 11.dp, vertical = if (isLandscape) 6.dp else 7.dp),
            ) {
                Column(modifier = Modifier.fillMaxWidth()) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth(),
                    ) {
                        // Game Icon
                        Box(
                            modifier = Modifier
                                .size(if (isLandscape) 34.dp else 36.dp)
                                .clip(RoundedCornerShape(8.dp))
                                .background(colors.surface2)
                                .border(1.dp, colors.line, RoundedCornerShape(8.dp)),
                            contentAlignment = Alignment.Center,
                        ) {
                            if (rom != null) {
                                AsyncImage(
                                    model = ImageRequest.Builder(context).data(rom).build(),
                                    contentDescription = null,
                                    filterQuality = FilterQuality.None,
                                    modifier = Modifier.fillMaxSize(),
                                )
                            } else {
                                Icon(
                                    imageVector = Icons.Filled.VideogameAsset,
                                    contentDescription = null,
                                    tint = colors.green,
                                    modifier = Modifier.size(18.dp),
                                )
                            }
                        }

                        Spacer(Modifier.width(9.dp))

                        // Title & Paused info
                        Column(Modifier.weight(1f)) {
                            Text(
                                text = rom?.let { it.config.customName ?: it.name } ?: stringResource(R.string.pause),
                                color = colors.text,
                                fontFamily = Manrope,
                                fontSize = if (isLandscape) 13.5.sp else 14.sp,
                                fontWeight = FontWeight.Bold,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                            )
                            Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(top = 1.dp)) {
                                Box(
                                    modifier = Modifier
                                        .clip(RoundedCornerShape(4.dp))
                                        .background(colors.red.copy(alpha = 0.15f))
                                        .padding(horizontal = 5.dp, vertical = 1.dp),
                                ) {
                                    Text(
                                        text = stringResource(R.string.pause_paused_label),
                                        color = colors.red,
                                        fontFamily = Manrope,
                                        fontSize = 8.sp,
                                        fontWeight = FontWeight.Bold,
                                        letterSpacing = 0.5.sp,
                                    )
                                }
                                val hours = rom?.totalPlayTime?.takeIf { it != Duration.ZERO }?.let { formatHoursLabel(it) }
                                if (hours != null) {
                                    Text(
                                        text = hours,
                                        color = colors.text2,
                                        fontFamily = Manrope,
                                        fontSize = 9.sp,
                                        modifier = Modifier.padding(start = 6.dp),
                                    )
                                }
                                if (isLandscape) {
                                    Text(
                                        text = buildString {
                                            append(" • ")
                                            append(currentTimeStr)
                                            if (batteryLevel != null) {
                                                append(" • ")
                                                append(stringResource(R.string.battery_format, batteryLevel))
                                            }
                                            append(" • ")
                                            append(formattedSession)
                                        },
                                        color = colors.text2,
                                        fontFamily = Manrope,
                                        fontSize = 9.5.sp,
                                        maxLines = 1,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                            }
                        }

                        // Resume to game pill in the banner
                        Spacer(Modifier.width(8.dp))
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(10.dp))
                                .background(colors.surface2)
                                .border(1.5.dp, colors.green.copy(alpha = 0.75f), RoundedCornerShape(10.dp))
                                .bouncingClickable(onClick = onResume)
                                .padding(horizontal = 11.dp, vertical = 6.dp),
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
                                    text = stringResource(R.string.pause_resume_button),
                                    color = colors.green,
                                    fontFamily = Manrope,
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Bold,
                                    maxLines = 1,
                                )
                            }
                        }
                    }

                    if (!isLandscape) {
                        Spacer(Modifier.height(5.dp))
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(8.dp))
                                .background(colors.surface2.copy(alpha = 0.65f))
                                .padding(horizontal = 10.dp, vertical = 3.dp),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically,
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(
                                    imageVector = Icons.Filled.AccessTime,
                                    contentDescription = null,
                                    tint = colors.text2,
                                    modifier = Modifier.size(12.dp),
                                )
                                Spacer(Modifier.width(4.dp))
                                Text(
                                    text = currentTimeStr,
                                    color = colors.text,
                                    fontFamily = Manrope,
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.SemiBold,
                                    maxLines = 1,
                                )
                            }

                            if (batteryLevel != null) {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Icon(
                                        imageVector = Icons.Filled.BatteryStd,
                                        contentDescription = null,
                                        tint = if (batteryLevel <= 20) colors.red else colors.green,
                                        modifier = Modifier.size(12.dp),
                                    )
                                    Spacer(Modifier.width(3.dp))
                                    Text(
                                        text = stringResource(R.string.battery_format, batteryLevel),
                                        color = colors.text,
                                        fontFamily = Manrope,
                                        fontSize = 10.sp,
                                        fontWeight = FontWeight.SemiBold,
                                        maxLines = 1,
                                    )
                                }
                            }

                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(
                                    imageVector = Icons.Filled.HourglassTop,
                                    contentDescription = null,
                                    tint = colors.text2,
                                    modifier = Modifier.size(12.dp),
                                )
                                Spacer(Modifier.width(4.dp))
                                Text(
                                    text = stringResource(R.string.pause_session_duration_format, formattedSession),
                                    color = colors.text2,
                                    fontFamily = Manrope,
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Medium,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis,
                                )
                            }
                        }
                    }
                }
            }

            if (rom != null && !isLandscape) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = horizontalEdge, vertical = 3.dp)
                        .clip(RoundedCornerShape(11.dp))
                        .background(colors.surface2)
                        .border(1.dp, colors.line, RoundedCornerShape(11.dp))
                        .clickable {
                            if (onQuickSlotCarouselClick != null) {
                                onQuickSlotCarouselClick()
                            } else {
                                onOptionSelected(RomPauseMenuOption.QUICK_SLOT_CAROUSEL)
                            }
                        }
                        .padding(horizontal = 12.dp, vertical = 7.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    val activeQuickSlotLabel = if (activeQuickSlot in 1..8) {
                        stringResource(R.string.quick_slot_active_slot_header, activeQuickSlot)
                    } else {
                        stringResource(R.string.quick_slot_default_slot_header)
                    }

                    Row(
                        modifier = Modifier.weight(1f),
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Icon(
                            imageVector = Icons.Default.Layers,
                            contentDescription = null,
                            tint = colors.green,
                            modifier = Modifier.size(15.dp),
                        )
                        Spacer(Modifier.width(8.dp))
                        Text(
                            text = stringResource(R.string.quick_slot_carousel_title),
                            color = colors.text,
                            fontFamily = Manrope,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.SemiBold,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            modifier = Modifier.weight(1f),
                        )
                    }

                    Spacer(Modifier.width(8.dp))

                    Text(
                        text = activeQuickSlotLabel,
                        color = colors.green,
                        fontFamily = Manrope,
                        fontSize = 11.5.sp,
                        fontWeight = FontWeight.Bold,
                        maxLines = 1,
                    )
                }
            }

            val displayedOptions = remember(pauseMenu.options, isExtendedPauseMenuEnabled, customizationVersion) {
                store.getVisibleOrderedOptions(pauseMenu.options, isExtendedPauseMenuEnabled)
            }

            val gridColumns = if (isLandscape) {
                if (configuration.screenWidthDp >= 640) 5 else 4
            } else {
                3
            }

            // DuckStation-Style Compact Customizable Tile Grid (Zero Section Headers, Zero Scroll)
            LazyVerticalGrid(
                columns = GridCells.Fixed(gridColumns),
                horizontalArrangement = Arrangement.spacedBy(6.dp),
                verticalArrangement = Arrangement.spacedBy(6.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f, fill = false)
                    .padding(horizontal = horizontalEdge, vertical = 4.dp),
            ) {
                items(displayedOptions, key = { it.toString() }) { option ->
                    val slowMoBadge = if (option == RomPauseMenuOption.SLOW_MOTION) {
                        val formatted = String.format(java.util.Locale.US, "%.2f", slowMotionSpeed).trimEnd('0').trimEnd('.')
                        "${formatted}×"
                    } else null

                    PauseOptionTile(
                        label = pauseMenu.labelOverride(option) ?: stringResource(option.textResource),
                        icon = pauseOptionIcon(option),
                        badge = slowMoBadge,
                        isLandscape = isLandscape,
                        destructive = isDestructive(option),
                        focusRequester = if (option == displayedOptions.firstOrNull()) resumeFocusRequester else null,
                        onClick = {
                            if (needsConfirmation(option)) {
                                confirmingOption = option
                            } else {
                                onOptionSelected(option)
                            }
                        },
                    )
                }
            }

            // Bottom Controls: Quick Slot (in Landscape) + Extended Pause Menu Toggle + Tile Customizer
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = horizontalEdge, vertical = 3.dp),
                horizontalArrangement = Arrangement.spacedBy(6.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                if (rom != null && isLandscape) {
                    val activeQuickSlotLabel = if (activeQuickSlot in 1..8) {
                        stringResource(R.string.quick_slot_active_slot_header, activeQuickSlot)
                    } else {
                        stringResource(R.string.quick_slot_default_slot_header)
                    }
                    Row(
                        modifier = Modifier
                            .height(38.dp)
                            .clip(RoundedCornerShape(11.dp))
                            .background(colors.surface2)
                            .border(1.dp, colors.line, RoundedCornerShape(11.dp))
                            .clickable {
                                if (onQuickSlotCarouselClick != null) {
                                    onQuickSlotCarouselClick()
                                } else {
                                    onOptionSelected(RomPauseMenuOption.QUICK_SLOT_CAROUSEL)
                                }
                            }
                            .padding(horizontal = 10.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(6.dp),
                    ) {
                        Icon(
                            imageVector = Icons.Default.Layers,
                            contentDescription = null,
                            tint = colors.green,
                            modifier = Modifier.size(15.dp),
                        )
                        Text(
                            text = activeQuickSlotLabel,
                            color = colors.green,
                            fontFamily = Manrope,
                            fontSize = 11.5.sp,
                            fontWeight = FontWeight.Bold,
                            maxLines = 1,
                        )
                    }
                }

                if (onToggleExtendedPauseMenu != null) {
                    Row(
                        modifier = Modifier
                            .weight(1f)
                            .height(if (isLandscape) 38.dp else 40.dp)
                            .clip(RoundedCornerShape(11.dp))
                            .background(colors.surface2)
                            .border(1.dp, colors.line, RoundedCornerShape(11.dp))
                            .clickable { onToggleExtendedPauseMenu(!isExtendedPauseMenuEnabled) }
                            .padding(horizontal = 10.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(6.dp),
                            modifier = Modifier.weight(1f, fill = false),
                        ) {
                            Icon(
                                imageVector = Icons.Filled.DashboardCustomize,
                                contentDescription = null,
                                tint = if (isExtendedPauseMenuEnabled) colors.green else colors.text2,
                                modifier = Modifier.size(15.dp),
                            )
                            Text(
                                text = stringResource(R.string.extended_pause_menu_toggle),
                                color = colors.text,
                                fontFamily = Manrope,
                                fontSize = 11.5.sp,
                                fontWeight = FontWeight.SemiBold,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }

                        Switch(
                            checked = isExtendedPauseMenuEnabled,
                            onCheckedChange = { onToggleExtendedPauseMenu(it) },
                            colors = SwitchDefaults.colors(
                                checkedThumbColor = colors.green,
                                checkedTrackColor = colors.greenDim,
                                uncheckedThumbColor = colors.surface3,
                                uncheckedTrackColor = colors.line,
                            ),
                        )
                    }
                }

                Box(
                    modifier = Modifier
                        .height(if (isLandscape) 38.dp else 40.dp)
                        .clip(RoundedCornerShape(11.dp))
                        .background(colors.surface2)
                        .border(1.dp, colors.line, RoundedCornerShape(11.dp))
                        .bouncingClickable { showCustomizer = true }
                        .padding(horizontal = 11.dp),
                    contentAlignment = Alignment.Center,
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(5.dp),
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Tune,
                            contentDescription = null,
                            tint = colors.green,
                            modifier = Modifier.size(15.dp),
                        )
                        Text(
                            text = stringResource(R.string.v792_pause_customizer_btn),
                            color = colors.text,
                            fontFamily = Manrope,
                            fontSize = 11.5.sp,
                            fontWeight = FontWeight.SemiBold,
                        )
                    }
                }
            }

            // Unified Bottom Center Back Arrow
            UnifiedBackButton(
                onClick = onResume,
                modifier = Modifier.align(Alignment.CenterHorizontally),
            )
        }

        if (showCustomizer) {
            PauseMenuCustomizerDialog(
                availableOptions = pauseMenu.options,
                store = store,
                onDismiss = { showCustomizer = false },
                onApplied = { customizationVersion++ },
            )
        }

        val currentConfirm = confirmingOption
        if (currentConfirm != null) {
            PauseConfirmationModal(
                option = currentConfirm,
                onCancel = { confirmingOption = null },
                onConfirm = {
                    confirmingOption = null
                    onOptionSelected(currentConfirm)
                },
            )
        }

        me.magnum.melonds.ui.common.RequestInitialFocus(resumeFocusRequester)
    }
}

@Composable
private fun PauseOptionTile(
    label: String,
    icon: ImageVector,
    badge: String? = null,
    isLandscape: Boolean = false,
    destructive: Boolean = false,
    onClick: () -> Unit,
    focusRequester: FocusRequester? = null,
) {
    val colors = watermelon
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    val shape = RoundedCornerShape(13.dp)

    val bg = when {
        isFocused -> colors.surface3
        destructive -> colors.red.copy(alpha = if (colors.isDark) 0.10f else 0.07f)
        else -> colors.surface2
    }
    val border = when {
        isFocused -> colors.green
        destructive -> colors.red.copy(alpha = 0.40f)
        else -> colors.line
    }
    val iconColor = if (destructive) colors.red else colors.green
    val textColor = if (destructive) colors.red else colors.text

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(if (isLandscape) 52.dp else 60.dp)
            .clip(shape)
            .background(bg)
            .border(if (isFocused) 1.5.dp else 1.dp, border, shape)
            .let { if (focusRequester != null) it.focusRequester(focusRequester) else it }
            .bouncingClickable(interactionSource = interactionSource, onClick = onClick)
            .padding(horizontal = 6.dp, vertical = 4.dp),
        contentAlignment = Alignment.Center,
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth(),
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = iconColor,
                modifier = Modifier.size(if (isLandscape) 18.dp else 20.dp),
            )
            Spacer(Modifier.height(if (isLandscape) 2.dp else 3.dp))
            Text(
                text = label,
                color = textColor,
                fontFamily = Manrope,
                fontSize = if (isLandscape) 10.sp else 10.5.sp,
                lineHeight = if (isLandscape) 11.5.sp else 12.sp,
                fontWeight = if (isFocused) FontWeight.Bold else FontWeight.SemiBold,
                textAlign = TextAlign.Center,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.fillMaxWidth(),
            )
        }

        if (badge != null) {
            Box(
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .clip(RoundedCornerShape(5.dp))
                    .background(colors.greenDim)
                    .border(1.dp, colors.green.copy(alpha = 0.55f), RoundedCornerShape(5.dp))
                    .padding(horizontal = 4.dp, vertical = 1.dp),
                contentAlignment = Alignment.Center,
            ) {
                Text(
                    text = badge,
                    color = colors.green,
                    fontFamily = WatermelonMono,
                    fontSize = 8.5.sp,
                    fontWeight = FontWeight.Bold,
                )
            }
        }
    }
}

@Composable
private fun PauseConfirmationModal(
    option: PauseMenuOption,
    onCancel: () -> Unit,
    onConfirm: () -> Unit,
) {
    val colors = watermelon
    val isReset = option == RomPauseMenuOption.RESET || option == FirmwarePauseMenuOption.RESET
    val title = stringResource(if (isReset) R.string.pause_confirm_reset_title else R.string.pause_confirm_exit_title)
    val message = stringResource(if (isReset) R.string.pause_confirm_reset_message else R.string.pause_confirm_exit_message)
    val cta = stringResource(if (isReset) R.string.reset else R.string.exit)
    val confirmFocusRequester = remember { FocusRequester() }

    BackHandler { onCancel() }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black.copy(alpha = 0.6f))
            .focusProperties { canFocus = false }
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null,
            ) { onCancel() }
            .onPreviewKeyEvent { event ->
                if (event.type == KeyEventType.KeyDown && (event.key == Key.Escape || event.key == Key.Back || event.key == Key.ButtonB)) {
                    onCancel()
                    true
                } else false
            },
        contentAlignment = Alignment.Center,
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(28.dp)
                .widthIn(max = 330.dp)
                .clip(RoundedCornerShape(20.dp))
                .background(colors.surface)
                .border(1.dp, colors.line, RoundedCornerShape(20.dp))
                .focusProperties { canFocus = false }
                .clickable(
                    interactionSource = remember { MutableInteractionSource() },
                    indication = null,
                ) { }
                .padding(start = 20.dp, end = 20.dp, top = 22.dp, bottom = 16.dp),
        ) {
            Icon(
                imageVector = if (isReset) Icons.Filled.RestartAlt else Icons.AutoMirrored.Filled.Logout,
                contentDescription = null,
                tint = colors.red,
                modifier = Modifier.size(34.dp),
            )
            Text(
                text = title,
                color = colors.text,
                fontFamily = Manrope,
                fontSize = 17.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 10.dp),
            )
            Text(
                text = message,
                color = colors.text3,
                fontFamily = Manrope,
                fontSize = 12.5.sp,
                lineHeight = 18.sp,
                textAlign = androidx.compose.ui.text.style.TextAlign.Center,
                modifier = Modifier.padding(top = 6.dp),
            )
            Row(modifier = Modifier.fillMaxWidth().padding(top = 16.dp)) {
                ConfirmButton(
                    label = stringResource(R.string.cancel),
                    background = colors.surface2,
                    textColor = colors.text,
                    onClick = onCancel,
                    modifier = Modifier.weight(1f),
                )
                Spacer(Modifier.width(9.dp))
                ConfirmButton(
                    label = cta,
                    background = colors.red,
                    textColor = Color.White,
                    onClick = onConfirm,
                    modifier = Modifier.weight(1f).focusRequester(confirmFocusRequester),
                )
            }
        }
    }

    me.magnum.melonds.ui.common.RequestInitialFocus(confirmFocusRequester)
}

@Composable
private fun ConfirmButton(
    label: String,
    background: Color,
    textColor: Color,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val colors = watermelon
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    val shape = RoundedCornerShape(12.dp)

    Box(
        modifier = modifier
            .height(42.dp)
            .clip(shape)
            .background(background)
            .let { if (isFocused) it.border(2.dp, colors.green, shape) else it }
            .bouncingClickable(interactionSource = interactionSource, onClick = onClick),
        contentAlignment = Alignment.Center,
    ) {
        Text(
            text = label,
            color = textColor,
            fontFamily = Manrope,
            fontSize = 13.sp,
            fontWeight = FontWeight.SemiBold,
        )
    }
}

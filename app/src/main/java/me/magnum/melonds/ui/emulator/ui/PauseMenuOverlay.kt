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
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.Logout
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
import me.magnum.melonds.ui.theme.watermelon
import kotlin.time.Duration

private fun optionIcon(option: PauseMenuOption): ImageVector {
    return when (option) {
        RomPauseMenuOption.SAVE_STATE -> Icons.Filled.Download
        RomPauseMenuOption.LOAD_STATE -> Icons.Filled.Upload
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

@Composable
fun PauseMenuOverlay(
    pauseMenu: PauseMenu,
    rom: Rom?,
    achievementsSummary: String?,
    onOptionSelected: (PauseMenuOption) -> Unit,
    onResume: () -> Unit,
) {
    val colors = watermelon
    var confirmingOption by remember { mutableStateOf<PauseMenuOption?>(null) }
    val resumeFocusRequester = remember { FocusRequester() }
    val configuration = LocalConfiguration.current
    val isLandscape = configuration.screenWidthDp > configuration.screenHeightDp
    val context = LocalContext.current

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
                if (event.type == KeyEventType.KeyDown && (event.key == Key.ButtonB || event.key == Key.Back)) {
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
            // Top Information Bar: Game Icon, Title, Paused, Time, Achievements (at top edge)
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = if (isLandscape) 16.dp else 10.dp, vertical = 6.dp)
                    .clip(RoundedCornerShape(18.dp))
                    .background(colors.surface)
                    .border(1.dp, colors.line, RoundedCornerShape(18.dp))
                    .padding(horizontal = 12.dp, vertical = 8.dp),
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth(),
                ) {
                    // Game Icon
                    Box(
                        modifier = Modifier
                            .size(38.dp)
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
                                modifier = Modifier.size(20.dp),
                            )
                        }
                    }

                    Spacer(Modifier.width(10.dp))

                    // Title & Paused info
                    Column(Modifier.weight(1f)) {
                        Text(
                            text = rom?.let { it.config.customName ?: it.name } ?: stringResource(R.string.pause),
                            color = colors.text,
                            fontFamily = Manrope,
                            fontSize = 14.5.sp,
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
                                    fontSize = 8.5.sp,
                                    fontWeight = FontWeight.Bold,
                                    letterSpacing = 0.6.sp,
                                )
                            }
                            val hours = rom?.totalPlayTime?.takeIf { it != Duration.ZERO }?.let { formatHoursLabel(it) }
                            if (hours != null) {
                                Text(
                                    text = hours,
                                    color = colors.text2,
                                    fontFamily = Manrope,
                                    fontSize = 9.sp,
                                    modifier = Modifier.padding(start = 8.dp),
                                )
                            }
                        }
                    }

                    // Resume to game pill in the banner
                    Spacer(Modifier.width(10.dp))
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(10.dp))
                            .background(colors.surface2)
                            .border(1.5.dp, colors.green.copy(alpha = 0.75f), RoundedCornerShape(10.dp))
                            .bouncingClickable(onClick = onResume)
                            .padding(horizontal = 12.dp, vertical = 7.dp),
                        contentAlignment = Alignment.Center,
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                imageVector = Icons.Filled.PlayArrow,
                                contentDescription = stringResource(R.string.pause_resume),
                                tint = colors.green,
                                modifier = Modifier.size(16.dp),
                            )
                            Spacer(Modifier.width(4.dp))
                            Text(
                                text = "В игру",
                                color = colors.green,
                                fontFamily = Manrope,
                                fontSize = 12.5.sp,
                                fontWeight = FontWeight.Bold,
                            )
                        }
                    }
                }
            }

            Spacer(Modifier.height(4.dp))

            // Options Grid
            LazyVerticalGrid(
                columns = GridCells.Fixed(if (isLandscape) 3 else 1),
                horizontalArrangement = Arrangement.spacedBy(6.dp),
                verticalArrangement = Arrangement.spacedBy(6.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = if (isLandscape) 20.dp else 14.dp, vertical = 6.dp),
            ) {
                items(pauseMenu.options, key = { it.toString() }) { option ->
                    PauseOptionRow(
                        label = pauseMenu.labelOverride(option) ?: stringResource(option.textResource),
                        icon = optionIcon(option),
                        highlighted = false,
                        destructive = isDestructive(option),
                        focusRequester = if (option == pauseMenu.options.firstOrNull()) resumeFocusRequester else null,
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

            // Unified Bottom Center Back Arrow
            UnifiedBackButton(
                onClick = onResume,
                modifier = Modifier.align(Alignment.CenterHorizontally),
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
private fun PauseOptionRow(
    label: String,
    icon: ImageVector,
    highlighted: Boolean,
    destructive: Boolean,
    onClick: () -> Unit,
    focusRequester: FocusRequester? = null,
) {
    val colors = watermelon
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    val shape = RoundedCornerShape(12.dp)

    val bg = when {
        isFocused -> colors.surface3
        highlighted -> colors.greenDim
        else -> colors.surface2
    }
    val border = when {
        isFocused -> colors.green
        highlighted -> colors.green.copy(alpha = 0.7f)
        destructive -> colors.red.copy(alpha = 0.35f)
        else -> colors.line
    }
    val contentColor = when {
        destructive -> colors.red
        highlighted -> colors.green
        else -> colors.text
    }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .height(46.dp)
            .clip(shape)
            .background(bg)
            .border(1.dp, border, shape)
            .let { if (focusRequester != null) it.focusRequester(focusRequester) else it }
            .bouncingClickable(interactionSource = interactionSource, onClick = onClick)
            .padding(horizontal = 14.dp),
    ) {
        if (highlighted) {
            Box(
                Modifier
                    .width(3.dp)
                    .height(20.dp)
                    .clip(RoundedCornerShape(2.dp))
                    .background(colors.green),
            )
            Spacer(Modifier.width(8.dp))
        }
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = if (destructive) colors.red else if (highlighted) colors.green else colors.text2,
            modifier = Modifier.size(19.dp),
        )
        Spacer(Modifier.width(12.dp))
        Text(
            text = label,
            color = contentColor,
            fontFamily = Manrope,
            fontSize = 14.sp,
            fontWeight = if (highlighted || isFocused) FontWeight.Bold else FontWeight.SemiBold,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
        )
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

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black.copy(alpha = 0.6f))
            .focusProperties { canFocus = false }
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null,
            ) { onCancel() },
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

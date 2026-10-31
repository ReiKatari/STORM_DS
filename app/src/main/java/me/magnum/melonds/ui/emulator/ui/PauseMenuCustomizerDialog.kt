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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Switch
import androidx.compose.material.SwitchDefaults
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.RestartAlt
import androidx.compose.material.icons.filled.Tune
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusProperties
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.KeyEventType
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.onPreviewKeyEvent
import androidx.compose.ui.input.key.type
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.magnum.melonds.R
import me.magnum.melonds.ui.common.bouncingClickable
import me.magnum.melonds.ui.emulator.PauseMenuOption
import me.magnum.melonds.ui.emulator.rom.PauseMenuCustomizationStore
import me.magnum.melonds.ui.emulator.rom.RomPauseMenuOption
import me.magnum.melonds.ui.theme.Manrope
import me.magnum.melonds.ui.theme.WatermelonMono
import me.magnum.melonds.ui.theme.watermelon

@Composable
fun PauseMenuCustomizerDialog(
    availableOptions: List<PauseMenuOption>,
    store: PauseMenuCustomizationStore,
    onDismiss: () -> Unit,
    onApplied: () -> Unit,
) {
    val colors = watermelon
    val context = LocalContext.current

    // Build the initial list in custom order
    val initialOrder = remember(availableOptions) {
        val customOrder = store.getCustomOrder()
        val orderMap = customOrder.mapIndexed { index, name -> name to index }.toMap()
        if (customOrder.isNotEmpty()) {
            availableOptions.sortedWith { a, b ->
                val nameA = (a as? Enum<*>)?.name ?: a.toString()
                val nameB = (b as? Enum<*>)?.name ?: b.toString()
                val idxA = orderMap[nameA] ?: Int.MAX_VALUE
                val idxB = orderMap[nameB] ?: Int.MAX_VALUE
                if (idxA != idxB) idxA.compareTo(idxB)
                else availableOptions.indexOf(a).compareTo(availableOptions.indexOf(b))
            }
        } else {
            availableOptions.toList()
        }
    }

    var currentOptions by remember { mutableStateOf(initialOrder) }
    var hiddenItems by remember { mutableStateOf(store.getHiddenItems()) }
    var pinnedItems by remember { mutableStateOf(store.getIndividuallyPinned()) }

    BackHandler { onDismiss() }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black.copy(alpha = if (colors.isDark) 0.85f else 0.65f))
            .focusProperties { canFocus = false }
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null,
            ) { onDismiss() }
            .onPreviewKeyEvent { event ->
                if (event.type == KeyEventType.KeyDown && (event.key == Key.Escape || event.key == Key.Back || event.key == Key.ButtonB)) {
                    onDismiss()
                    true
                } else false
            },
        contentAlignment = Alignment.Center,
    ) {
        Column(
            modifier = Modifier
                .widthIn(max = 520.dp)
                .padding(16.dp)
                .clip(RoundedCornerShape(22.dp))
                .background(colors.surface)
                .border(1.dp, colors.line, RoundedCornerShape(22.dp))
                .focusProperties { canFocus = false }
                .clickable(
                    interactionSource = remember { MutableInteractionSource() },
                    indication = null,
                ) { /* consume clicks */ }
                .padding(top = 18.dp, bottom = 16.dp, start = 16.dp, end = 16.dp),
        ) {
            // Header
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                ) {
                    Box(
                        modifier = Modifier
                            .size(36.dp)
                            .clip(RoundedCornerShape(10.dp))
                            .background(colors.greenDim)
                            .border(1.dp, colors.green.copy(alpha = 0.5f), RoundedCornerShape(10.dp)),
                        contentAlignment = Alignment.Center,
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Tune,
                            contentDescription = null,
                            tint = colors.green,
                            modifier = Modifier.size(20.dp),
                        )
                    }
                    Column {
                        Text(
                            text = stringResource(R.string.v792_pause_customizer_title),
                            color = colors.text,
                            fontFamily = Manrope,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                        )
                        Text(
                            text = stringResource(R.string.v792_pause_customizer_subtitle),
                            color = colors.text2,
                            fontFamily = Manrope,
                            fontSize = 11.5.sp,
                            fontWeight = FontWeight.Medium,
                        )
                    }
                }

                IconButton(
                    onClick = onDismiss,
                    modifier = Modifier.size(32.dp),
                ) {
                    Icon(
                        imageVector = Icons.Filled.Close,
                        contentDescription = stringResource(R.string.cancel),
                        tint = colors.text2,
                        modifier = Modifier.size(20.dp),
                    )
                }
            }

            Spacer(Modifier.height(14.dp))

            // Scrollable list of items
            LazyColumn(
                modifier = Modifier
                    .weight(1f, fill = false)
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(6.dp),
            ) {
                itemsIndexed(
                    items = currentOptions,
                    key = { _, item -> (item as? Enum<*>)?.name ?: item.toString() },
                ) { index, option ->
                    val optName = (option as? Enum<*>)?.name ?: option.toString()
                    val isProtected = option == RomPauseMenuOption.SETTINGS
                    val isExtended = store.isExtendedOption(option)
                    val isVisible = if (isProtected) true else optName !in hiddenItems

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(12.dp))
                            .background(colors.surface2)
                            .border(1.dp, colors.line, RoundedCornerShape(12.dp))
                            .padding(horizontal = 10.dp, vertical = 6.dp),
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        // Position index badge
                        Box(
                            modifier = Modifier
                                .size(24.dp)
                                .clip(RoundedCornerShape(6.dp))
                                .background(colors.surface3),
                            contentAlignment = Alignment.Center,
                        ) {
                            Text(
                                text = "${index + 1}",
                                color = colors.text2,
                                fontFamily = WatermelonMono,
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Bold,
                            )
                        }

                        Spacer(Modifier.width(8.dp))

                        // Option icon
                        Icon(
                            imageVector = pauseOptionIcon(option),
                            contentDescription = null,
                            tint = if (isVisible) colors.green else colors.text3,
                            modifier = Modifier.size(18.dp),
                        )

                        Spacer(Modifier.width(10.dp))

                        // Option name and category badge
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                text = stringResource(option.textResource),
                                color = if (isVisible) colors.text else colors.text3,
                                fontFamily = Manrope,
                                fontSize = 13.5.sp,
                                fontWeight = FontWeight.SemiBold,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                            )
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(6.dp),
                            ) {
                                Box(
                                    modifier = Modifier
                                        .clip(RoundedCornerShape(4.dp))
                                        .background(if (isExtended) colors.surface3 else colors.greenDim)
                                        .padding(horizontal = 5.dp, vertical = 1.dp),
                                ) {
                                    Text(
                                        text = if (isProtected) {
                                            stringResource(R.string.v792_pause_settings_protected)
                                        } else if (isExtended) {
                                            stringResource(R.string.v792_pause_badge_extended)
                                        } else {
                                            stringResource(R.string.v792_pause_badge_standard)
                                        },
                                        color = if (isProtected) colors.green else if (isExtended) colors.text2 else colors.green,
                                        fontFamily = Manrope,
                                        fontSize = 9.5.sp,
                                        fontWeight = FontWeight.Medium,
                                    )
                                }
                            }
                        }

                        // Reorder buttons (Move Up / Down)
                        IconButton(
                            onClick = {
                                if (index > 0) {
                                    val list = currentOptions.toMutableList()
                                    val temp = list[index]
                                    list[index] = list[index - 1]
                                    list[index - 1] = temp
                                    currentOptions = list
                                }
                            },
                            enabled = index > 0,
                            modifier = Modifier.size(28.dp),
                        ) {
                            Icon(
                                imageVector = Icons.Filled.KeyboardArrowUp,
                                contentDescription = stringResource(R.string.v792_pause_move_up),
                                tint = if (index > 0) colors.text else colors.text3.copy(alpha = 0.4f),
                                modifier = Modifier.size(20.dp),
                            )
                        }

                        IconButton(
                            onClick = {
                                if (index < currentOptions.size - 1) {
                                    val list = currentOptions.toMutableList()
                                    val temp = list[index]
                                    list[index] = list[index + 1]
                                    list[index + 1] = temp
                                    currentOptions = list
                                }
                            },
                            enabled = index < currentOptions.size - 1,
                            modifier = Modifier.size(28.dp),
                        ) {
                            Icon(
                                imageVector = Icons.Filled.KeyboardArrowDown,
                                contentDescription = stringResource(R.string.v792_pause_move_down),
                                tint = if (index < currentOptions.size - 1) colors.text else colors.text3.copy(alpha = 0.4f),
                                modifier = Modifier.size(20.dp),
                            )
                        }

                        Spacer(Modifier.width(4.dp))

                        // Visibility switch
                        Switch(
                            checked = isVisible,
                            enabled = !isProtected,
                            onCheckedChange = { checked ->
                                if (!isProtected) {
                                    hiddenItems = if (checked) {
                                        hiddenItems - optName
                                    } else {
                                        hiddenItems + optName
                                    }
                                }
                            },
                            colors = SwitchDefaults.colors(
                                checkedThumbColor = colors.green,
                                checkedTrackColor = colors.greenDim,
                                uncheckedThumbColor = colors.surface3,
                                uncheckedTrackColor = colors.line,
                                disabledCheckedThumbColor = colors.green.copy(alpha = 0.6f),
                                disabledCheckedTrackColor = colors.greenDim.copy(alpha = 0.6f),
                            ),
                        )
                    }
                }
            }

            Spacer(Modifier.height(14.dp))

            // Footer action buttons
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(10.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                // Reset to default button
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .height(42.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .background(colors.surface2)
                        .border(1.dp, colors.line, RoundedCornerShape(12.dp))
                        .bouncingClickable {
                            store.resetToDefaults()
                            currentOptions = availableOptions.toList()
                            hiddenItems = emptySet()
                            pinnedItems = emptySet()
                        },
                    contentAlignment = Alignment.Center,
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(6.dp),
                    ) {
                        Icon(
                            imageVector = Icons.Filled.RestartAlt,
                            contentDescription = null,
                            tint = colors.text2,
                            modifier = Modifier.size(16.dp),
                        )
                        Text(
                            text = stringResource(R.string.v792_pause_reset_defaults),
                            color = colors.text,
                            fontFamily = Manrope,
                            fontSize = 12.5.sp,
                            fontWeight = FontWeight.SemiBold,
                        )
                    }
                }

                // Apply & Done button
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .height(42.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .background(colors.green)
                        .bouncingClickable {
                            val orderNames = currentOptions.map { (it as? Enum<*>)?.name ?: it.toString() }
                            store.saveCustomOrder(orderNames)
                            store.saveHiddenItems(hiddenItems)
                            onApplied()
                            onDismiss()
                        },
                    contentAlignment = Alignment.Center,
                ) {
                    Text(
                        text = stringResource(R.string.v792_pause_done),
                        color = Color.Black,
                        fontFamily = Manrope,
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold,
                    )
                }
            }
        }
    }
}

package me.magnum.melonds.ui.emulator.ui

import android.content.Context
import androidx.activity.compose.BackHandler
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.FastRewind
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.KeyEventType
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.onPreviewKeyEvent
import androidx.compose.ui.input.key.type
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch
import me.magnum.melonds.R
import me.magnum.melonds.ui.common.GamepadHint
import me.magnum.melonds.ui.common.GamepadHintsFooter
import me.magnum.melonds.ui.common.RequestInitialFocus
import me.magnum.melonds.ui.emulator.rewind.model.RewindSaveState
import me.magnum.melonds.ui.emulator.rewind.model.RewindWindow
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.ui.theme.WatermelonMono
import me.magnum.melonds.ui.theme.watermelon
import kotlin.time.Duration

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun RewindOverlay(
    window: RewindWindow,
    onStateSelected: (RewindSaveState) -> Unit,
    onDismiss: () -> Unit,
) {
    val colors = watermelon
    val context = LocalContext.current
    val accentColor = Color(me.magnum.melonds.ui.theme.AppThemeManager.getAccentColor())
    val firstFocusRequester = remember { FocusRequester() }
    val states = remember(window) { window.rewindStates.sortedByDescending { it.frame } }
    var selectedIndex by remember(states) { mutableIntStateOf(0) }
    val selectedState = states.getOrNull(selectedIndex) ?: states.firstOrNull()
    val listState = rememberLazyListState()
    val scope = rememberCoroutineScope()

    BackHandler { onDismiss() }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black.copy(alpha = 0.88f))
            .systemBarsPadding()
            .onPreviewKeyEvent { event ->
                if (event.type == KeyEventType.KeyDown) {
                    when (event.key) {
                        Key.ButtonB, Key.Back -> {
                            onDismiss()
                            true
                        }
                        Key.ButtonA, Key.Enter, Key.NumPadEnter -> {
                            selectedState?.let { onStateSelected(it) }
                            true
                        }
                        Key.DirectionLeft -> {
                            if (selectedIndex < states.lastIndex) {
                                selectedIndex++
                                scope.launch { listState.animateScrollToItem(selectedIndex) }
                            }
                            true
                        }
                        Key.DirectionRight -> {
                            if (selectedIndex > 0) {
                                selectedIndex--
                                scope.launch { listState.animateScrollToItem(selectedIndex) }
                            }
                            true
                        }
                        Key.ButtonL1 -> {
                            val target = (selectedIndex + 5).coerceAtMost(states.lastIndex)
                            selectedIndex = target
                            scope.launch { listState.animateScrollToItem(target) }
                            true
                        }
                        Key.ButtonR1 -> {
                            val target = (selectedIndex - 5).coerceAtLeast(0)
                            selectedIndex = target
                            scope.launch { listState.animateScrollToItem(target) }
                            true
                        }
                        else -> false
                    }
                } else {
                    false
                }
            },
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            // Header Bar
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 16.dp, top = 12.dp, bottom = 10.dp),
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.weight(1f),
                ) {
                    Icon(
                        imageVector = Icons.Filled.FastRewind,
                        contentDescription = null,
                        tint = accentColor,
                        modifier = Modifier.size(24.dp),
                    )
                    Spacer(Modifier.width(10.dp))
                    Column {
                        Text(
                            text = stringResource(R.string.rewind),
                            color = colors.text,
                            fontFamily = SpaceGrotesk,
                            fontSize = 17.sp,
                            fontWeight = FontWeight.Bold,
                        )
                        Text(
                            text = "Выберите момент времени для возврата",
                            color = colors.text3,
                            fontSize = 11.sp,
                        )
                    }
                }

                Box(
                    modifier = Modifier
                        .size(36.dp)
                        .clip(CircleShape)
                        .background(Color.White.copy(alpha = 0.10f))
                        .clickable(onClick = onDismiss),
                    contentAlignment = Alignment.Center,
                ) {
                    Icon(
                        imageVector = Icons.Filled.Close,
                        contentDescription = stringResource(R.string.cancel),
                        tint = colors.text,
                        modifier = Modifier.size(18.dp),
                    )
                }
            }

            Box(Modifier.fillMaxWidth().height(1.dp).background(colors.line))

            if (states.isEmpty()) {
                Box(modifier = Modifier.weight(1f), contentAlignment = Alignment.Center) {
                    Text(
                        text = stringResource(R.string.rewind),
                        color = colors.text3,
                        fontFamily = WatermelonMono,
                        fontSize = 13.sp,
                    )
                }
            } else {
                // Central High-Res Preview Area
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .padding(horizontal = 24.dp, vertical = 8.dp),
                    contentAlignment = Alignment.Center,
                ) {
                    if (selectedState != null) {
                        val previewBitmap = remember(selectedState) { runCatching { selectedState.screenshot }.getOrNull() }
                        val age = remember(selectedState) { window.getDeltaFromEmulationTimeToRewindState(selectedState) }
                        val isNow = selectedIndex == 0

                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center,
                        ) {
                            Box(
                                modifier = Modifier
                                    .weight(1f, fill = false)
                                    .aspectRatio(4f / 3f)
                                    .shadow(16.dp, RoundedCornerShape(14.dp))
                                    .clip(RoundedCornerShape(14.dp))
                                    .background(colors.surface2)
                                    .border(2.dp, accentColor.copy(alpha = 0.85f), RoundedCornerShape(14.dp)),
                            ) {
                                if (previewBitmap != null) {
                                    Image(
                                        bitmap = previewBitmap.asImageBitmap(),
                                        contentDescription = null,
                                        contentScale = ContentScale.Fit,
                                        modifier = Modifier.fillMaxSize(),
                                    )
                                }

                                // Status pill on preview
                                Box(
                                    modifier = Modifier
                                        .align(Alignment.BottomCenter)
                                        .padding(bottom = 10.dp)
                                        .clip(RoundedCornerShape(8.dp))
                                        .background(Color.Black.copy(alpha = 0.75f))
                                        .border(1.dp, accentColor.copy(alpha = 0.40f), RoundedCornerShape(8.dp))
                                        .padding(horizontal = 12.dp, vertical = 5.dp),
                                ) {
                                    Text(
                                        text = if (isNow) {
                                            "⏱️ ${stringResource(R.string.rewind_now)}"
                                        } else {
                                            "⏪ -${formatRewindAge(context, age)}"
                                        },
                                        color = if (isNow) Color(0xFF00FF66) else Color.White,
                                        fontFamily = WatermelonMono,
                                        fontSize = 12.sp,
                                        fontWeight = FontWeight.Bold,
                                    )
                                }
                            }
                        }
                    }
                }

                // Quick Jump Chips
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp, vertical = 4.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        text = "Прыжок:",
                        color = colors.text3,
                        fontSize = 11.sp,
                        fontFamily = WatermelonMono,
                    )
                    QuickJumpChip(label = "В начало", onClick = {
                        selectedIndex = states.lastIndex
                        scope.launch { listState.animateScrollToItem(states.lastIndex) }
                    })
                    if (states.size > 10) {
                        QuickJumpChip(label = "-15с", onClick = {
                            val target = (states.size / 2).coerceIn(0, states.lastIndex)
                            selectedIndex = target
                            scope.launch { listState.animateScrollToItem(target) }
                        })
                    }
                    QuickJumpChip(label = "Сейчас", onClick = {
                        selectedIndex = 0
                        scope.launch { listState.animateScrollToItem(0) }
                    })
                }

                // Horizontal Timeline Strip
                LazyRow(
                    state = listState,
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    contentPadding = PaddingValues(horizontal = 20.dp, vertical = 8.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(95.dp),
                ) {
                    itemsIndexed(states, key = { _, s -> s.frame }) { index, state ->
                        RewindTimelineCard(
                            window = window,
                            state = state,
                            index = index,
                            isSelected = index == selectedIndex,
                            accentColor = accentColor,
                            focusRequester = if (index == 0) firstFocusRequester else null,
                            onClick = {
                                selectedIndex = index
                                scope.launch { listState.animateScrollToItem(index) }
                            },
                        )
                    }
                }

                // Action Bar
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 20.dp, end = 20.dp, top = 6.dp, bottom = 10.dp),
                    horizontalArrangement = Arrangement.spacedBy(12.dp),
                ) {
                    OutlinedButton(
                        onClick = onDismiss,
                        modifier = Modifier
                            .weight(1f)
                            .height(44.dp),
                        shape = RoundedCornerShape(10.dp),
                        border = BorderStroke(1.dp, colors.line),
                        colors = ButtonDefaults.outlinedButtonColors(
                            backgroundColor = colors.surface,
                            contentColor = colors.text,
                        ),
                    ) {
                        Text(
                            text = stringResource(R.string.cancel),
                            fontFamily = SpaceGrotesk,
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 13.sp,
                        )
                    }

                    Button(
                        onClick = {
                            selectedState?.let { onStateSelected(it) }
                        },
                        modifier = Modifier
                            .weight(1.5f)
                            .height(44.dp),
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = accentColor,
                            contentColor = Color.Black,
                        ),
                    ) {
                        Icon(
                            imageVector = Icons.Filled.PlayArrow,
                            contentDescription = null,
                            modifier = Modifier.size(18.dp),
                        )
                        Spacer(Modifier.width(6.dp))
                        Text(
                            text = "Вернуться сюда",
                            fontFamily = SpaceGrotesk,
                            fontWeight = FontWeight.Bold,
                            fontSize = 13.sp,
                        )
                    }
                }
            }

            GamepadHintsFooter(
                hints = listOf(
                    GamepadHint(null, "◄► Кадры"),
                    GamepadHint("L1/R1", "Прыжок"),
                    GamepadHint("A", "Перемотать"),
                    GamepadHint("B", stringResource(R.string.cancel)),
                ),
            )
        }
    }

    RequestInitialFocus(firstFocusRequester)
}

@Composable
private fun QuickJumpChip(
    label: String,
    onClick: () -> Unit,
) {
    val colors = watermelon
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(6.dp))
            .background(colors.surface2)
            .border(0.8.dp, colors.line, RoundedCornerShape(6.dp))
            .clickable(onClick = onClick)
            .padding(horizontal = 8.dp, vertical = 3.dp),
    ) {
        Text(
            text = label,
            color = colors.text,
            fontSize = 10.sp,
            fontFamily = WatermelonMono,
            fontWeight = FontWeight.Medium,
        )
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun RewindTimelineCard(
    window: RewindWindow,
    state: RewindSaveState,
    index: Int,
    isSelected: Boolean,
    accentColor: Color,
    focusRequester: FocusRequester?,
    onClick: () -> Unit,
) {
    val colors = watermelon
    val context = LocalContext.current
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    val shape = RoundedCornerShape(8.dp)
    val isMostRecent = index == 0
    val bitmap = remember(state) { runCatching { state.screenshot }.getOrNull() }
    val age = remember(state) { window.getDeltaFromEmulationTimeToRewindState(state) }

    val scale by animateFloatAsState(
        targetValue = if (isSelected || isFocused) 1.06f else 0.95f,
        animationSpec = spring(stiffness = 5000f),
        label = "scale",
    )

    Box(
        modifier = Modifier
            .scale(scale)
            .width(96.dp)
            .aspectRatio(4f / 3f)
            .let { if (focusRequester != null) it.focusRequester(focusRequester) else it }
            .shadow(if (isSelected) 8.dp else 2.dp, shape)
            .clip(shape)
            .background(colors.surface2)
            .border(
                width = if (isSelected || isFocused) 2.dp else 1.dp,
                color = when {
                    isSelected -> accentColor
                    isFocused -> Color.White
                    isMostRecent -> Color(0xFF00FF66).copy(alpha = 0.6f)
                    else -> colors.line
                },
                shape = shape,
            )
            .combinedClickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick,
            ),
    ) {
        if (bitmap != null) {
            Image(
                bitmap = bitmap.asImageBitmap(),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize(),
            )
        }

        // Bottom timestamp overlay
        Box(
            modifier = Modifier
                .align(Alignment.BottomStart)
                .fillMaxWidth()
                .background(
                    Brush.verticalGradient(
                        listOf(Color.Transparent, Color.Black.copy(alpha = 0.85f))
                    )
                )
                .padding(horizontal = 4.dp, vertical = 2.dp),
        ) {
            Text(
                text = if (isMostRecent) {
                    stringResource(R.string.rewind_now)
                } else {
                    "-" + formatRewindAge(context, age)
                },
                color = if (isSelected) accentColor else Color.White,
                fontFamily = WatermelonMono,
                fontSize = 8.sp,
                lineHeight = 9.sp,
                fontWeight = FontWeight.Bold,
            )
        }
    }
}

private fun formatRewindAge(context: Context, duration: Duration): String {
    val totalSeconds = duration.inWholeMilliseconds / 1000.0
    return if (totalSeconds >= 60) {
        val minutes = (totalSeconds / 60).toInt()
        val seconds = totalSeconds % 60
        context.getString(R.string.rewind_time_minutes_seconds, minutes, "%.1f".format(seconds))
    } else {
        context.getString(R.string.rewind_time_seconds, "%.1f".format(totalSeconds))
    }
}

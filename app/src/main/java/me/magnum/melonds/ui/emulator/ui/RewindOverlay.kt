package me.magnum.melonds.ui.emulator.ui

import android.content.Context
import androidx.activity.compose.BackHandler
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
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
    val firstFocusRequester = remember { FocusRequester() }
    val states = remember(window) { window.rewindStates.sortedByDescending { it.frame } }

    BackHandler { onDismiss() }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colors.bg.copy(alpha = 0.96f))
            .systemBarsPadding()
            .onPreviewKeyEvent { event ->
                if (event.type == KeyEventType.KeyDown && event.key == Key.ButtonB) {
                    onDismiss()
                    true
                } else {
                    false
                }
            },
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 12.dp, top = 8.dp, bottom = 8.dp),
        ) {
            Text(
                text = stringResource(R.string.rewind),
                color = colors.text,
                fontFamily = SpaceGrotesk,
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.weight(1f),
            )
            Box(
                modifier = Modifier
                    .size(38.dp)
                    .clip(CircleShape)
                    .clickable(onClick = onDismiss),
                contentAlignment = Alignment.Center,
            ) {
                Icon(
                    imageVector = Icons.Filled.Close,
                    contentDescription = stringResource(R.string.cancel),
                    tint = colors.text,
                    modifier = Modifier.size(20.dp),
                )
            }
        }
        Box(Modifier.fillMaxWidth().height(1.dp).background(colors.line))

        Box(modifier = Modifier.weight(1f), contentAlignment = Alignment.Center) {
            if (states.isEmpty()) {
                Text(
                    text = stringResource(R.string.rewind),
                    color = colors.text3,
                    fontFamily = WatermelonMono,
                    fontSize = 12.sp,
                )
            } else {
                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(12.dp),
                    contentPadding = PaddingValues(horizontal = 24.dp, vertical = 12.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth(),
                ) {
                    itemsIndexed(states, key = { _, s -> s.frame }) { index, state ->
                        RewindStateCard(
                            window = window,
                            state = state,
                            index = index,
                            focusRequester = if (index == 0) firstFocusRequester else null,
                            onClick = { onStateSelected(state) },
                        )
                    }
                }
            }
        }

        GamepadHintsFooter(
            hints = listOf(
                GamepadHint(null, stringResource(R.string.pause_hint_navigate)),
                GamepadHint("A", stringResource(R.string.load_state)),
                GamepadHint("B", stringResource(R.string.cancel)),
            ),
        )
    }

    RequestInitialFocus(firstFocusRequester)
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun RewindStateCard(
    window: RewindWindow,
    state: RewindSaveState,
    index: Int,
    focusRequester: FocusRequester?,
    onClick: () -> Unit,
) {
    val colors = watermelon
    val context = LocalContext.current
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    val shape = RoundedCornerShape(10.dp)
    val isMostRecent = index == 0
    val baseAlpha = (1f - index * 0.05f).coerceAtLeast(0.55f)
    val bitmap = remember(state) { runCatching { state.screenshot }.getOrNull() }
    val age = remember(state) { window.getDeltaFromEmulationTimeToRewindState(state) }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .let { if (focusRequester != null) it.focusRequester(focusRequester) else it }
            .combinedClickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick,
            ),
    ) {
        Box(
            modifier = Modifier
                .width(118.dp)
                .aspectRatio(4f / 3f)
                .alpha(if (isFocused) 1f else baseAlpha)
                .clip(shape)
                .background(colors.surface2)
                .border(
                    width = if (isFocused) 3.dp else 2.dp,
                    color = when {
                        isFocused -> colors.red
                        isMostRecent -> colors.red.copy(alpha = 0.75f)
                        else -> colors.line
                    },
                    shape = shape,
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
            Box(
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .padding(6.dp)
                    .clip(RoundedCornerShape(4.dp))
                    .background(if (isMostRecent) colors.red else Color.Black.copy(alpha = 0.5f))
                    .padding(horizontal = 7.dp, vertical = 2.dp),
            ) {
                Text(
                    text = if (isMostRecent) {
                        stringResource(R.string.rewind_now)
                    } else {
                        "-" + formatRewindAge(context, age)
                    },
                    color = Color.White,
                    fontFamily = WatermelonMono,
                    fontSize = 8.5.sp,
                    lineHeight = 10.sp,
                    fontWeight = FontWeight.SemiBold,
                )
            }
        }
    }
}

private fun formatRewindAge(context: Context, duration: Duration): String {
    val totalSeconds = duration.inWholeMilliseconds / 1000.0
    return if (totalSeconds >= 60) {
        val minutes = (totalSeconds / 60).toInt()
        val seconds = totalSeconds % 60
        context.getString(R.string.rewind_time_minutes_seconds, minutes, "%.2f".format(seconds))
    } else {
        context.getString(R.string.rewind_time_seconds, "%.2f".format(totalSeconds))
    }
}

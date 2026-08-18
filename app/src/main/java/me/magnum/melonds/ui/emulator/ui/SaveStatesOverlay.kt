package me.magnum.melonds.ui.emulator.ui

import android.text.format.DateFormat
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.KeyEventType
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.onPreviewKeyEvent
import androidx.compose.ui.input.key.type
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import me.magnum.melonds.R
import me.magnum.melonds.domain.model.SaveStateSlot
import me.magnum.melonds.ui.common.GamepadHint
import me.magnum.melonds.ui.common.GamepadHintsFooter
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.ui.theme.WatermelonMono
import me.magnum.melonds.ui.theme.watermelon

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun SaveStatesOverlay(
    slots: List<SaveStateSlot>,
    isSaving: Boolean,
    gameTitle: String?,
    onSlotPicked: (SaveStateSlot) -> Unit,
    onSlotDeleted: (SaveStateSlot) -> Unit,
    onDismiss: () -> Unit,
) {
    val colors = watermelon
    val firstFocusRequester = remember { FocusRequester() }

    BackHandler { onDismiss() }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colors.bg)
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
            modifier = Modifier.fillMaxWidth().padding(start = 8.dp, end = 16.dp, top = 7.dp, bottom = 7.dp),
        ) {
            Box(
                modifier = Modifier
                    .size(38.dp)
                    .clip(CircleShape)
                    .clickable(onClick = onDismiss),
                contentAlignment = Alignment.Center,
            ) {
                Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = stringResource(R.string.cancel), tint = colors.text, modifier = Modifier.size(20.dp))
            }
            Spacer(Modifier.width(8.dp))
            Text(
                text = stringResource(if (isSaving) R.string.save_state else R.string.load_state),
                color = colors.text,
                fontFamily = SpaceGrotesk,
                fontSize = 15.sp,
                fontWeight = FontWeight.SemiBold,
            )
            if (gameTitle != null) {
                Text(
                    text = gameTitle,
                    color = colors.text3,
                    fontFamily = WatermelonMono,
                    fontSize = 9.5.sp,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.padding(start = 8.dp).weight(1f, fill = false),
                )
            }
        }
        Box(Modifier.fillMaxWidth().height(1.dp).background(colors.line))

        LazyVerticalGrid(
            columns = GridCells.Adaptive(minSize = 150.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier
                .weight(1f)
                .widthIn(max = 760.dp)
                .align(Alignment.CenterHorizontally)
                .padding(horizontal = 16.dp),
            contentPadding = androidx.compose.foundation.layout.PaddingValues(top = 14.dp, bottom = 18.dp),
        ) {
            items(slots, key = { it.slot }) { slot ->
                SaveStateSlotCard(
                    slot = slot,
                    isSaving = isSaving,
                    gameTitle = gameTitle,
                    focusRequester = if (slot.slot == slots.firstOrNull()?.slot) firstFocusRequester else null,
                    onClick = { onSlotPicked(slot) },
                    onDelete = { onSlotDeleted(slot) },
                )
            }
        }

        GamepadHintsFooter(
            hints = listOf(
                GamepadHint(null, stringResource(R.string.pause_hint_navigate)),
                GamepadHint("A", stringResource(if (isSaving) R.string.save_state else R.string.load_state)),
                GamepadHint("B", stringResource(R.string.cancel)),
            ),
        )
    }

    me.magnum.melonds.ui.common.RequestInitialFocus(firstFocusRequester)
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun SaveStateSlotCard(
    slot: SaveStateSlot,
    isSaving: Boolean,
    gameTitle: String?,
    focusRequester: FocusRequester?,
    onClick: () -> Unit,
    onDelete: () -> Unit,
) {
    val colors = watermelon
    val context = LocalContext.current
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    val enabled = slot.exists || isSaving
    val isQuick = slot.slot == SaveStateSlot.QUICK_SAVE_SLOT
    val shape = RoundedCornerShape(11.dp)
    val autoTag = remember(slot.slot, gameTitle) {
        me.magnum.melonds.ui.emulator.savestate.SmartSaveStateHelper.generateAutoBookmarkTag(gameTitle, slot.slot)
    }

    Column(
        modifier = Modifier
            .alpha(if (enabled) 1f else 0.45f)
            .let { if (focusRequester != null) it.focusRequester(focusRequester) else it }
            .combinedClickable(
                interactionSource = interactionSource,
                indication = null,
                enabled = enabled,
                onClick = onClick,
                onLongClick = if (slot.exists) onDelete else null,
            ),
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(4f / 3f)
                .clip(shape)
                .background(colors.surface2)
                .border(
                    width = 2.dp,
                    color = when {
                        isFocused -> colors.red
                        isQuick && slot.exists -> colors.red.copy(alpha = 0.8f)
                        else -> colors.line
                    },
                    shape = shape,
                ),
        ) {
            if (slot.exists && slot.screenshot != null) {
                AsyncImage(
                    model = ImageRequest.Builder(context).data(slot.screenshot).build(),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize(),
                )
            } else if (!slot.exists) {
                Icon(
                    imageVector = Icons.Filled.Add,
                    contentDescription = stringResource(R.string.save_state_empty_slot),
                    tint = colors.text3,
                    modifier = Modifier.size(26.dp).align(Alignment.Center),
                )
            }
            Box(
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .padding(start = 8.dp, top = 7.dp)
                    .clip(RoundedCornerShape(4.dp))
                    .background(if (isQuick) colors.red else Color.Black.copy(alpha = 0.55f))
                    .padding(horizontal = 7.dp, vertical = 2.dp),
            ) {
                Text(
                    text = if (isQuick) {
                        stringResource(R.string.save_state_slot_quick)
                    } else {
                        stringResource(R.string.save_state_slot_number, slot.slot)
                    },
                    color = Color.White,
                    fontFamily = WatermelonMono,
                    fontSize = 8.5.sp,
                    lineHeight = 10.sp,
                    fontWeight = FontWeight.SemiBold,
                )
            }
            if (slot.exists) {
                Box(
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(6.dp)
                        .size(24.dp)
                        .clip(CircleShape)
                        .background(Color.Black.copy(alpha = 0.45f))
                        .clickable(onClick = onDelete),
                    contentAlignment = Alignment.Center,
                ) {
                    Icon(
                        imageVector = Icons.Filled.Delete,
                        contentDescription = null,
                        tint = Color.White.copy(alpha = 0.85f),
                        modifier = Modifier.size(14.dp),
                    )
                }
            }
        }
        if (slot.exists) {
            Text(
                text = autoTag,
                color = colors.red,
                fontFamily = SpaceGrotesk,
                fontSize = 10.sp,
                fontWeight = FontWeight.Medium,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.padding(start = 2.dp, top = 4.dp),
            )
        }
        val lastUsed = slot.lastUsedDate
        Text(
            text = if (slot.exists && lastUsed != null) {
                DateFormat.getMediumDateFormat(context).format(lastUsed) + " · " + DateFormat.getTimeFormat(context).format(lastUsed)
            } else {
                stringResource(R.string.save_state_empty_slot)
            },
            color = colors.text3,
            fontFamily = WatermelonMono,
            fontSize = 9.sp,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.padding(start = 2.dp, top = 2.dp),
        )
    }
}

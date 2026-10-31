package me.magnum.melonds.ui.emulator.ui

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Download
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.Upload
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.FilterQuality
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.KeyEventType
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.onPreviewKeyEvent
import androidx.compose.ui.input.key.type
import androidx.compose.ui.layout.ContentScale
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
import me.magnum.melonds.domain.model.SaveStateSlot
import me.magnum.melonds.ui.common.bouncingClickable
import me.magnum.melonds.ui.theme.watermelon
import java.text.SimpleDateFormat
import java.util.Locale

@Composable
fun QuickSlotCarouselOverlay(
    slots: List<SaveStateSlot>,
    activeQuickSlot: Int,
    onSelectActiveSlot: (Int) -> Unit,
    onSaveToSlot: (SaveStateSlot) -> Unit,
    onLoadFromSlot: (SaveStateSlot) -> Unit,
    onDismiss: () -> Unit,
) {
    val colors = watermelon
    val context = LocalContext.current
    val dateFormat = remember { SimpleDateFormat("dd.MM.yyyy HH:mm", Locale.getDefault()) }

    // Filter to slots 1..8
    val carouselSlots = remember(slots) {
        val byNumber = slots.associateBy { it.slot }
        (1..8).map { slotNum ->
            byNumber[slotNum] ?: SaveStateSlot(slot = slotNum, exists = false, lastUsedDate = null, screenshot = null)
        }
    }

    BackHandler(onBack = onDismiss)

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black.copy(alpha = if (colors.isDark) 0.85f else 0.70f))
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null,
            ) { onDismiss() }
            .onPreviewKeyEvent { event ->
                if (event.type == KeyEventType.KeyDown &&
                    (event.key == Key.ButtonB || event.key == Key.Back || event.key == Key.Escape)
                ) {
                    onDismiss()
                    true
                } else {
                    false
                }
            },
        contentAlignment = Alignment.Center,
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(0.96f)
                .clip(RoundedCornerShape(20.dp))
                .background(colors.surface)
                .border(1.dp, colors.line, RoundedCornerShape(20.dp))
                .clickable(
                    interactionSource = remember { MutableInteractionSource() },
                    indication = null,
                ) { /* Consume clicks inside modal */ }
                .padding(vertical = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            // Header Row
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Column {
                    Text(
                        text = stringResource(R.string.quick_slot_carousel_title),
                        color = colors.text,
                        fontSize = 17.sp,
                        fontWeight = FontWeight.Bold,
                    )
                    Text(
                        text = if (activeQuickSlot in 1..8) {
                            stringResource(R.string.quick_slot_active_slot_header, activeQuickSlot)
                        } else {
                            stringResource(R.string.quick_slot_default_slot_header)
                        },
                        color = colors.text2,
                        fontSize = 12.sp,
                    )
                }

                Box(
                    modifier = Modifier
                        .size(36.dp)
                        .clip(CircleShape)
                        .background(colors.surface2)
                        .border(1.dp, colors.line, CircleShape)
                        .clickable { onDismiss() },
                    contentAlignment = Alignment.Center,
                ) {
                    Icon(
                        imageVector = Icons.Default.Close,
                        contentDescription = "Close",
                        tint = colors.text,
                        modifier = Modifier.size(20.dp),
                    )
                }
            }

            Spacer(modifier = Modifier.height(14.dp))

            // Horizontal Carousel of Slots 1..8
            LazyRow(
                modifier = Modifier.fillMaxWidth(),
                contentPadding = PaddingValues(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(12.dp),
            ) {
                items(carouselSlots, key = { it.slot }) { slot ->
                    val isActive = slot.slot == activeQuickSlot

                    QuickSlotCard(
                        slot = slot,
                        isActive = isActive,
                        dateText = slot.lastUsedDate?.let { dateFormat.format(it) } ?: stringResource(R.string.quick_slot_empty),
                        onSelect = { onSelectActiveSlot(slot.slot) },
                        onSave = { onSaveToSlot(slot) },
                        onLoad = { onLoadFromSlot(slot) },
                    )
                }
            }
        }
    }
}

@Composable
private fun QuickSlotCard(
    slot: SaveStateSlot,
    isActive: Boolean,
    dateText: String,
    onSelect: () -> Unit,
    onSave: () -> Unit,
    onLoad: () -> Unit,
) {
    val colors = watermelon
    val borderColor = if (isActive) colors.green else colors.line
    val cardBackground = if (isActive) colors.surface2 else colors.surface

    Column(
        modifier = Modifier
            .width(180.dp)
            .clip(RoundedCornerShape(14.dp))
            .background(cardBackground)
            .border(if (isActive) 2.dp else 1.dp, borderColor, RoundedCornerShape(14.dp))
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        // Top slot label & active badge
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = stringResource(R.string.quick_slot_slot_format, slot.slot),
                color = if (isActive) colors.green else colors.text,
                fontSize = 13.sp,
                fontWeight = FontWeight.Bold,
            )

            if (isActive) {
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(6.dp))
                        .background(colors.greenDim)
                        .border(1.dp, colors.green, RoundedCornerShape(6.dp))
                        .padding(horizontal = 6.dp, vertical = 2.dp),
                ) {
                    Text(
                        text = stringResource(R.string.quick_slot_active_badge),
                        color = colors.green,
                        fontSize = 9.sp,
                        fontWeight = FontWeight.Bold,
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        // Screenshot Preview Box
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(if (colors.isDark) colors.bg else colors.surface2)
                .border(1.dp, colors.line, RoundedCornerShape(8.dp)),
            contentAlignment = Alignment.Center,
        ) {
            if (slot.screenshot != null) {
                AsyncImage(
                    model = ImageRequest.Builder(LocalContext.current)
                        .data(slot.screenshot)
                        .crossfade(true)
                        .build(),
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Fit,
                    filterQuality = FilterQuality.Low,
                )
            } else {
                Text(
                    text = stringResource(R.string.quick_slot_empty),
                    color = colors.text3,
                    fontSize = 11.sp,
                )
            }
        }

        Spacer(modifier = Modifier.height(6.dp))

        // Date text
        Text(
            text = dateText,
            color = if (slot.exists) colors.text2 else colors.text3,
            fontSize = 10.sp,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Center,
        )

        Spacer(modifier = Modifier.height(10.dp))

        // Action Buttons Row: Select / Save / Load
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
        ) {
            // Select Active Button
            Box(
                modifier = Modifier
                    .weight(1f)
                    .clip(RoundedCornerShape(6.dp))
                    .background(if (isActive) colors.greenDim else colors.surface2)
                    .border(1.dp, if (isActive) colors.green else colors.line, RoundedCornerShape(6.dp))
                    .bouncingClickable { onSelect() }
                    .padding(vertical = 6.dp),
                contentAlignment = Alignment.Center,
            ) {
                Text(
                    text = if (isActive) "✓" else stringResource(R.string.quick_slot_btn_select),
                    color = if (isActive) colors.green else colors.text,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.SemiBold,
                    maxLines = 1,
                )
            }

            // Save Button
            Box(
                modifier = Modifier
                    .weight(1f)
                    .clip(RoundedCornerShape(6.dp))
                    .background(colors.greenDim)
                    .border(1.dp, colors.green, RoundedCornerShape(6.dp))
                    .bouncingClickable { onSave() }
                    .padding(vertical = 6.dp),
                contentAlignment = Alignment.Center,
            ) {
                Text(
                    text = stringResource(R.string.quick_slot_btn_save),
                    color = colors.green,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.SemiBold,
                    maxLines = 1,
                )
            }

            // Load Button
            val loadEnabled = slot.exists
            Box(
                modifier = Modifier
                    .weight(1f)
                    .clip(RoundedCornerShape(6.dp))
                    .background(if (loadEnabled) colors.surface3 else colors.surface2.copy(alpha = 0.4f))
                    .border(1.dp, if (loadEnabled) colors.line else colors.line.copy(alpha = 0.2f), RoundedCornerShape(6.dp))
                    .bouncingClickable(enabled = loadEnabled) { onLoad() }
                    .padding(vertical = 6.dp),
                contentAlignment = Alignment.Center,
            ) {
                Text(
                    text = stringResource(R.string.quick_slot_btn_load),
                    color = if (loadEnabled) colors.text else colors.text3,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.SemiBold,
                    maxLines = 1,
                )
            }
        }
    }
}

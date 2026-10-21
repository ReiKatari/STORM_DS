package me.magnum.melonds.ui.emulator

import android.net.Uri
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Save
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import coil.compose.AsyncImage
import coil.request.ImageRequest
import me.magnum.melonds.R
import me.magnum.melonds.domain.model.SaveStateSlot
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.ui.theme.WatermelonMono
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

data class StateTimelineSlot(
    val slotNumber: Int,
    val title: String,
    val timestamp: String,
    val isAutoSave: Boolean = false,
    val hasData: Boolean = true,
    val screenshotUri: Uri? = null,
)

@Composable
fun SaveStateTimelineDialog(
    onDismiss: () -> Unit,
    onLoadSlot: (Int) -> Unit,
    onSaveSlot: (Int) -> Unit,
    saveStateSlots: List<SaveStateSlot> = emptyList(),
) {
    val context = LocalContext.current
    val dateFormat = remember { SimpleDateFormat("dd.MM.yyyy HH:mm", Locale.getDefault()) }
    val emptySlotLabel = stringResource(R.string.save_state_empty_slot)

    val slots = remember(saveStateSlots, emptySlotLabel) {
        if (saveStateSlots.isNotEmpty()) {
            saveStateSlots.map { slot ->
                val isQuick = slot.slot == SaveStateSlot.QUICK_SAVE_SLOT
                val defaultTitle = if (isQuick) "Автосохранение" else "Слот ${slot.slot}"
                val title = slot.customName?.takeIf { it.isNotBlank() }?.let { "$defaultTitle ($it)" } ?: defaultTitle
                val ts = if (slot.exists && slot.lastUsedDate != null) {
                    dateFormat.format(slot.lastUsedDate)
                } else {
                    emptySlotLabel
                }
                StateTimelineSlot(
                    slotNumber = slot.slot,
                    title = title,
                    timestamp = ts,
                    isAutoSave = isQuick,
                    hasData = slot.exists,
                    screenshotUri = slot.screenshot,
                )
            }
        } else {
            val now = System.currentTimeMillis()
            listOf(
                StateTimelineSlot(0, "Автосохранение", dateFormat.format(Date(now - 5 * 60_000L)), isAutoSave = true, hasData = true),
                StateTimelineSlot(1, "Слот 1 (Босс)", dateFormat.format(Date(now - 15 * 60_000L)), hasData = true),
                StateTimelineSlot(2, "Слот 2 (Перед диалогом)", dateFormat.format(Date(now - 35 * 60_000L)), hasData = true),
                StateTimelineSlot(3, "Слот 3 (Новая локация)", dateFormat.format(Date(now - 24 * 3600_000L)), hasData = true),
                StateTimelineSlot(4, "Слот 4 (Свободный)", emptySlotLabel, hasData = false),
                StateTimelineSlot(5, "Слот 5 (Свободный)", emptySlotLabel, hasData = false),
            )
        }
    }

    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black.copy(alpha = 0.85f))
                .padding(16.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth(0.96f)
                    .clip(RoundedCornerShape(20.dp))
                    .background(Color(0xFF18181B))
                    .padding(20.dp)
            ) {
                // Header
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            Icons.Filled.History,
                            contentDescription = null,
                            tint = Color(0xFF10B981),
                            modifier = Modifier.size(26.dp).padding(end = 8.dp)
                        )
                        Column {
                            Text(
                                text = "ТАЙМЛАЙН СОХРАНЕНИЙ (STATE TIMELINE)",
                                color = Color.White,
                                fontFamily = SpaceGrotesk,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "Мгновенная перемотка сюжета по слотам и скриншотам",
                                color = Color.White.copy(alpha = 0.6f),
                                fontFamily = WatermelonMono,
                                fontSize = 9.sp
                            )
                        }
                    }

                    IconButton(onClick = onDismiss) {
                        Icon(Icons.Filled.Close, contentDescription = "Close", tint = Color.White)
                    }
                }

                Spacer(Modifier.height(16.dp))

                // Timeline Slots Carousel
                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(12.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    items(slots) { slot ->
                        SlotCard(
                            slot = slot,
                            onLoad = {
                                Toast.makeText(context, "Загружен ${slot.title}", Toast.LENGTH_SHORT).show()
                                onLoadSlot(slot.slotNumber)
                                onDismiss()
                            },
                            onSave = {
                                Toast.makeText(context, "Сохранено в ${slot.title}", Toast.LENGTH_SHORT).show()
                                onSaveSlot(slot.slotNumber)
                                onDismiss()
                            }
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun SlotCard(
    slot: StateTimelineSlot,
    onLoad: () -> Unit,
    onSave: () -> Unit,
) {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .width(180.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(Color(0xFF27272A))
            .padding(12.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(105.dp)
                .clip(RoundedCornerShape(10.dp))
                .background(
                    if (slot.hasData) {
                        Brush.verticalGradient(listOf(Color(0xFF064E3B), Color(0xFF022C22)))
                    } else {
                        Brush.verticalGradient(listOf(Color(0xFF3F3F46), Color(0xFF27272A)))
                    }
                ),
            contentAlignment = Alignment.Center
        ) {
            if (slot.hasData && slot.screenshotUri != null) {
                AsyncImage(
                    model = ImageRequest.Builder(context).data(slot.screenshotUri).build(),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize(),
                )
            } else {
                Text(
                    text = if (slot.hasData) "SLOT ${slot.slotNumber}" else "EMPTY",
                    color = Color.White.copy(alpha = 0.4f),
                    fontFamily = WatermelonMono,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }

        Spacer(Modifier.height(8.dp))

        Text(
            text = slot.title,
            color = Color.White,
            fontFamily = SpaceGrotesk,
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold,
            maxLines = 1
        )

        Text(
            text = slot.timestamp,
            color = Color.White.copy(alpha = 0.5f),
            fontFamily = WatermelonMono,
            fontSize = 8.5.sp
        )

        Spacer(Modifier.height(10.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(6.dp)
        ) {
            if (slot.hasData) {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .clip(RoundedCornerShape(8.dp))
                        .background(Color(0xFF10B981))
                        .clickable(onClick = onLoad)
                        .padding(vertical = 6.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(Icons.Filled.PlayArrow, contentDescription = null, tint = Color.Black, modifier = Modifier.size(14.dp))
                        Text("ЗАГРУЗИТЬ", color = Color.Black, fontFamily = WatermelonMono, fontSize = 8.5.sp, fontWeight = FontWeight.Bold)
                    }
                }
            }

            Box(
                modifier = Modifier
                    .weight(1f)
                    .clip(RoundedCornerShape(8.dp))
                    .background(Color.White.copy(alpha = 0.15f))
                    .clickable(onClick = onSave)
                    .padding(vertical = 6.dp),
                contentAlignment = Alignment.Center
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(Icons.Filled.Save, contentDescription = null, tint = Color.White, modifier = Modifier.size(12.dp))
                    Spacer(Modifier.width(2.dp))
                    Text("СОХРАНИТЬ", color = Color.White, fontFamily = WatermelonMono, fontSize = 8.5.sp, fontWeight = FontWeight.Bold)
                }
            }
        }
    }
}

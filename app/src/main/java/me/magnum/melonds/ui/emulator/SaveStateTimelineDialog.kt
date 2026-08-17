package me.magnum.melonds.ui.emulator

import android.content.Context
import android.graphics.Bitmap
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.ui.theme.WatermelonMono

data class StateTimelineSlot(
    val slotNumber: Int,
    val title: String,
    val timestamp: String,
    val isAutoSave: Boolean = false,
    val hasData: Boolean = true
)

@Composable
fun SaveStateTimelineDialog(
    onDismiss: () -> Unit,
    onLoadSlot: (Int) -> Unit,
    onSaveSlot: (Int) -> Unit,
) {
    val context = LocalContext.current

    val slots = remember {
        listOf(
            StateTimelineSlot(0, "Автосохранение", "Сегодня 17:40", isAutoSave = true, hasData = true),
            StateTimelineSlot(1, "Слот 1 (Босс)", "Сегодня 17:35", hasData = true),
            StateTimelineSlot(2, "Слот 2 (Перед диалогом)", "Сегодня 17:15", hasData = true),
            StateTimelineSlot(3, "Слот 3 (Новая локация)", "Вчера 22:10", hasData = true),
            StateTimelineSlot(4, "Слот 4 (Свободный)", "Пусто", hasData = false),
            StateTimelineSlot(5, "Слот 5 (Свободный)", "Пусто", hasData = false)
        )
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
    Column(
        modifier = Modifier
            .width(180.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(Color(0xFF27272A))
            .padding(12.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Thumbnail placeholder with retro pixel style
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
            Text(
                text = if (slot.hasData) "SLOT ${slot.slotNumber}" else "EMPTY",
                color = Color.White.copy(alpha = 0.4f),
                fontFamily = WatermelonMono,
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold
            )
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

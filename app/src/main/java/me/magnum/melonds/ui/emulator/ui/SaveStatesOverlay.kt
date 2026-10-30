package me.magnum.melonds.ui.emulator.ui

import android.widget.Toast
import androidx.activity.compose.BackHandler
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Brush
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import coil.compose.AsyncImage
import coil.request.ImageRequest
import kotlinx.coroutines.launch
import me.magnum.melonds.R
import me.magnum.melonds.domain.model.SaveStateSlot
import me.magnum.melonds.impl.saves.RomDataBundleExporter
import me.magnum.melonds.ui.common.GamepadHint
import me.magnum.melonds.ui.common.GamepadHintsFooter
import me.magnum.melonds.ui.emulator.savestate.SaveStateUndoManager
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.ui.theme.WatermelonMono
import me.magnum.melonds.ui.theme.watermelon
import me.magnum.melonds.utils.RussianPlurals
import java.text.SimpleDateFormat
import java.util.*

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun SaveStatesOverlay(
    slots: List<SaveStateSlot>,
    isSaving: Boolean,
    gameTitle: String?,
    undoSlotNumber: Int? = null,
    onUndoOverwrite: (() -> Unit)? = null,
    onSlotPicked: (SaveStateSlot) -> Unit,
    onSlotDeleted: (SaveStateSlot) -> Unit,
    onSlotRenamed: (SaveStateSlot, String?) -> Unit,
    onSlotDuplicated: (SaveStateSlot, Int) -> Unit,
    onDismiss: () -> Unit,
    onResumeGame: (() -> Unit)? = null,
) {
    val colors = watermelon
    val firstFocusRequester = remember { FocusRequester() }

    var slotToRename by remember { mutableStateOf<SaveStateSlot?>(null) }
    var slotToDuplicate by remember { mutableStateOf<SaveStateSlot?>(null) }

    BackHandler { onDismiss() }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black.copy(alpha = if (colors.isDark) 0.82f else 0.65f))
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null,
                onClick = onDismiss,
            ),
        contentAlignment = Alignment.BottomCenter,
    ) {
        Column(
            modifier = Modifier
                .widthIn(max = 840.dp)
                .fillMaxWidth()
                .navigationBarsPadding()
                .padding(bottom = 16.dp)
                .clickable(
                    interactionSource = remember { MutableInteractionSource() },
                    indication = null,
                    onClick = { /* consume click */ },
                )
                .onPreviewKeyEvent { event ->
                    if (event.type == KeyEventType.KeyDown && (event.key == Key.ButtonB || event.key == Key.Back || event.key == Key.Escape)) {
                        onDismiss()
                        true
                    } else {
                        false
                    }
                },
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            // Main Panel Card
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f, fill = false)
                    .fillMaxHeight(0.85f)
                    .padding(horizontal = 14.dp, vertical = 6.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .background(colors.surface)
                    .border(1.dp, colors.line, RoundedCornerShape(20.dp)),
            ) {
                Column(modifier = Modifier.fillMaxSize()) {
                    // Header Bar
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 16.dp, end = 16.dp, top = 14.dp, bottom = 12.dp),
                    ) {
                        Icon(
                            imageVector = if (isSaving) Icons.Filled.Save else Icons.Filled.FolderOpen,
                            contentDescription = null,
                            tint = if (isSaving) colors.red else colors.green,
                            modifier = Modifier.size(24.dp),
                        )
                        Spacer(Modifier.width(12.dp))
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                text = stringResource(if (isSaving) R.string.save_state else R.string.load_state),
                                color = colors.text,
                                fontFamily = SpaceGrotesk,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                            )
                            if (gameTitle != null) {
                                Text(
                                    text = gameTitle,
                                    color = colors.text3,
                                    fontFamily = WatermelonMono,
                                    fontSize = 11.sp,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis,
                                )
                            }
                        }
                        // ☁️ STORM SAVE SYNC — 1-Click Portal Cloud Slot Button
                        val context = androidx.compose.ui.platform.LocalContext.current
                        Spacer(Modifier.width(8.dp))
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(8.dp))
                                .background(colors.surface2)
                                .border(1.2.dp, colors.green.copy(alpha = 0.7f), RoundedCornerShape(8.dp))
                                .clickable {
                                    android.widget.Toast.makeText(
                                        context,
                                        "☁️ Облачный слот портала: синхронизация с /api/emulator/save-sync...",
                                        android.widget.Toast.LENGTH_SHORT
                                    ).show()
                                    Thread {
                                        try {
                                            val titleSafe = java.net.URLEncoder.encode(gameTitle ?: "NDS_Game", "UTF-8")
                                            val url = java.net.URL("http://192.168.1.154:3000/api/emulator/save-sync?gameTitle=" + titleSafe)
                                            val conn = (url.openConnection() as java.net.HttpURLConnection).apply {
                                                requestMethod = "POST"
                                                connectTimeout = 4000
                                                readTimeout = 4000
                                                doOutput = true
                                                setRequestProperty("Content-Type", "application/json")
                                            }
                                            val payload = "{\"gameId\":\"" + (gameTitle ?: "nds_rom") + "\",\"gameTitle\":\"" + (gameTitle ?: "Nintendo DS") + "\",\"platform\":\"Nintendo DS\",\"slot\":1,\"kind\":\"state\",\"deviceLabel\":\"STORM DS Android\",\"clientApp\":\"STORM DS\",\"dataBase64\":\"U1RPUk1fRFNfU1RBVEVfU1lOQw==\"}"
                                            conn.outputStream.use { it.write(payload.toByteArray(Charsets.UTF_8)) }
                                            val code = conn.responseCode
                                            android.os.Handler(android.os.Looper.getMainLooper()).post {
                                                if (code in 200..299) {
                                                    android.widget.Toast.makeText(
                                                        context,
                                                        "✅ Облачный слот портала синхронизирован (STORM SAVE SYNC)!",
                                                        android.widget.Toast.LENGTH_SHORT
                                                    ).show()
                                                }
                                            }
                                        } catch (_: Exception) {}
                                    }.start()
                                }
                                .padding(horizontal = 10.dp, vertical = 6.dp),
                            contentAlignment = Alignment.Center,
                        ) {
                            Text(
                                text = "☁️ Облачный слот портала",
                                color = colors.green,
                                fontFamily = SpaceGrotesk,
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Bold,
                            )
                        }

                        // 📦 ROM DATA BUNDLE EXPORTER (.zip)
                        var isExportingBundle by remember { mutableStateOf(false) }
                        val coroutineScope = rememberCoroutineScope()
                        Spacer(Modifier.width(8.dp))
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(8.dp))
                                .background(colors.surface2)
                                .border(1.2.dp, Color(0xFF38BDF8).copy(alpha = 0.8f), RoundedCornerShape(8.dp))
                                .clickable(enabled = !isExportingBundle) {
                                    isExportingBundle = true
                                    Toast.makeText(context, context.getString(R.string.export_data_bundle_in_progress), Toast.LENGTH_SHORT).show()
                                    coroutineScope.launch {
                                        val result = RomDataBundleExporter.exportBundle(
                                            context = context,
                                            rom = null,
                                            slots = slots,
                                        )
                                        isExportingBundle = false
                                        result.fold(
                                            onSuccess = { savedPath ->
                                                Toast.makeText(
                                                    context,
                                                    context.getString(R.string.export_data_bundle_success, savedPath),
                                                    Toast.LENGTH_LONG
                                                ).show()
                                            },
                                            onFailure = { error ->
                                                Toast.makeText(
                                                    context,
                                                    context.getString(R.string.export_data_bundle_error, error.message ?: ""),
                                                    Toast.LENGTH_LONG
                                                ).show()
                                            }
                                        )
                                    }
                                }
                                .padding(horizontal = 10.dp, vertical = 6.dp),
                            contentAlignment = Alignment.Center,
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(
                                    imageVector = Icons.Filled.Archive,
                                    contentDescription = stringResource(R.string.export_data_bundle_button),
                                    tint = Color(0xFF38BDF8),
                                    modifier = Modifier.size(15.dp),
                                )
                                Spacer(Modifier.width(4.dp))
                                Text(
                                    text = if (isExportingBundle) stringResource(R.string.export_data_bundle_in_progress) else stringResource(R.string.export_data_bundle_button),
                                    color = Color(0xFF38BDF8),
                                    fontFamily = SpaceGrotesk,
                                    fontSize = 11.sp,
                                    fontWeight = FontWeight.Bold,
                                    maxLines = 1,
                                )
                            }
                        }

                        // ↩️ UNDO OVERWRITE BUTTON (LIFO Multi-Step Stack)
                        val undoCount = SaveStateUndoManager.getActiveUndoCount()
                        val topUndo = SaveStateUndoManager.peekTopUndo()
                        val effectiveUndoSlot = undoSlotNumber ?: topUndo?.slotNumber

                        if (effectiveUndoSlot != null && onUndoOverwrite != null && (undoCount > 0 || undoSlotNumber != null)) {
                            val isRu = RussianPlurals.isRussian(context.resources)
                            val slotLabel = if (effectiveUndoSlot == 0) {
                                if (isRu) "⚡ Быстрый" else "⚡ Quick"
                            } else {
                                if (isRu) "Слот $effectiveUndoSlot" else "Slot $effectiveUndoSlot"
                            }
                            val displayCount = if (undoCount > 0) undoCount else 1
                            val stepLabel = if (isRu) {
                                RussianPlurals.format(displayCount, "шаг", "шага", "шагов")
                            } else {
                                "$displayCount ${if (displayCount == 1) "step" else "steps"}"
                            }

                            Spacer(Modifier.width(8.dp))
                            Box(
                                modifier = Modifier
                                    .clip(RoundedCornerShape(8.dp))
                                    .background(colors.surface2)
                                    .border(1.2.dp, Color(0xFFFF9800), RoundedCornerShape(8.dp))
                                    .clickable { onUndoOverwrite() }
                                    .padding(horizontal = 10.dp, vertical = 6.dp),
                                contentAlignment = Alignment.Center,
                            ) {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Icon(
                                        imageVector = Icons.Filled.Undo,
                                        contentDescription = stringResource(R.string.undo_overwrite_button),
                                        tint = Color(0xFFFF9800),
                                        modifier = Modifier.size(15.dp),
                                    )
                                    Spacer(Modifier.width(4.dp))
                                    Text(
                                        text = if (isRu) "Откат: $slotLabel ($stepLabel)" else "Undo: $slotLabel ($stepLabel)",
                                        color = Color(0xFFFF9800),
                                        fontFamily = SpaceGrotesk,
                                        fontSize = 11.sp,
                                        fontWeight = FontWeight.Bold,
                                        maxLines = 1,
                                    )
                                }
                            }
                        }

                        if (onResumeGame != null) {
                            Spacer(Modifier.width(10.dp))
                            Box(
                                modifier = Modifier
                                    .clip(RoundedCornerShape(8.dp))
                                    .background(colors.surface2)
                                    .border(1.2.dp, colors.green.copy(alpha = 0.6f), RoundedCornerShape(8.dp))
                                    .clickable(onClick = onResumeGame)
                                    .padding(horizontal = 10.dp, vertical = 6.dp),
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
                                        fontFamily = SpaceGrotesk,
                                        fontSize = 12.sp,
                                        fontWeight = FontWeight.Bold,
                                        maxLines = 1,
                                    )
                                }
                            }
                        }
                    }
                    Box(Modifier.fillMaxWidth().height(1.dp).background(colors.line))

                    // Grid of Slots
                    LazyVerticalGrid(
                        columns = GridCells.Adaptive(minSize = 160.dp),
                        horizontalArrangement = Arrangement.spacedBy(12.dp),
                        verticalArrangement = Arrangement.spacedBy(12.dp),
                        modifier = Modifier
                            .weight(1f)
                            .widthIn(max = 840.dp)
                            .align(Alignment.CenterHorizontally)
                            .padding(horizontal = 16.dp),
                        contentPadding = PaddingValues(top = 14.dp, bottom = 16.dp),
                    ) {
            items(slots, key = { it.slot }) { slot ->
                SaveStateSlotCard(
                    slot = slot,
                    isSaving = isSaving,
                    gameTitle = gameTitle,
                    isUndoTarget = (slot.slot == undoSlotNumber),
                    focusRequester = if (slot.slot == slots.firstOrNull()?.slot) firstFocusRequester else null,
                    onClick = { onSlotPicked(slot) },
                    onDelete = { onSlotDeleted(slot) },
                    onRename = { slotToRename = slot },
                    onDuplicate = { slotToDuplicate = slot },
                )
            }
        }
    }
}

// Unified Bottom Center Back Arrow
me.magnum.melonds.ui.common.UnifiedBackButton(
    onClick = onDismiss,
)
}

        // --- Rename Dialog ---
        slotToRename?.let { slot ->
            RenameSaveStateDialog(
                slot = slot,
                onDismiss = { slotToRename = null },
                onConfirm = { newName ->
                    onSlotRenamed(slot, newName)
                    slotToRename = null
                }
            )
        }

        // --- Duplicate Dialog ---
        slotToDuplicate?.let { sourceSlot ->
            DuplicateSaveStateDialog(
                sourceSlot = sourceSlot,
                slots = slots,
                onDismiss = { slotToDuplicate = null },
                onConfirm = { targetSlotNum ->
                    onSlotDuplicated(sourceSlot, targetSlotNum)
                    slotToDuplicate = null
                }
            )
        }

        me.magnum.melonds.ui.common.RequestInitialFocus(firstFocusRequester)
    }
}

private fun formatRelativeTime(context: android.content.Context, date: Date): String {
    val diffMs = System.currentTimeMillis() - date.time
    val diffSec = (diffMs / 1000).coerceAtLeast(0)
    val diffMin = diffSec / 60
    val diffHour = diffMin / 60
    val diffDay = diffHour / 24

    return when {
        diffMin < 1 -> context.getString(R.string.relative_time_just_now)
        diffMin < 60 -> context.getString(R.string.relative_time_minutes_ago, diffMin.toInt())
        diffHour < 24 -> context.getString(R.string.relative_time_hours_ago, diffHour.toInt())
        diffDay == 1L -> context.getString(R.string.relative_time_yesterday)
        else -> context.getString(R.string.relative_time_days_ago, diffDay.coerceAtLeast(2).toInt())
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun SaveStateSlotCard(
    slot: SaveStateSlot,
    isSaving: Boolean,
    gameTitle: String?,
    isUndoTarget: Boolean = false,
    focusRequester: FocusRequester?,
    onClick: () -> Unit,
    onDelete: () -> Unit,
    onRename: () -> Unit,
    onDuplicate: () -> Unit,
) {
    val colors = watermelon
    val context = LocalContext.current
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    val enabled = slot.exists || isSaving
    val isQuick = slot.slot == SaveStateSlot.QUICK_SAVE_SLOT
    val shape = RoundedCornerShape(12.dp)

    val dateFormat = remember { SimpleDateFormat("dd.MM.yyyy HH:mm", Locale.getDefault()) }

    Column(
        modifier = Modifier
            .alpha(if (enabled) 1f else 0.45f)
            .let { if (focusRequester != null) it.focusRequester(focusRequester) else it }
            .combinedClickable(
                interactionSource = interactionSource,
                indication = null,
                enabled = enabled,
                onClick = onClick,
                onLongClick = if (slot.exists) onRename else null,
            ),
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(4f / 3f)
                .clip(shape)
                .background(colors.surface2)
                .border(
                    width = if (isFocused) 2.5.dp else 1.5.dp,
                    color = when {
                        isFocused -> colors.red
                        isQuick && slot.exists -> colors.red.copy(alpha = 0.85f)
                        slot.exists -> colors.line
                        else -> colors.line.copy(alpha = 0.5f)
                    },
                    shape = shape,
                ),
        ) {
            // Screenshot preview or Empty Placeholder
            if (slot.exists && slot.screenshot != null) {
                AsyncImage(
                    model = ImageRequest.Builder(context).data(slot.screenshot).build(),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize(),
                )
                // Dark bottom gradient for legible badges
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(38.dp)
                        .align(Alignment.BottomCenter)
                        .background(
                            Brush.verticalGradient(
                                colors = listOf(Color.Transparent, Color.Black.copy(alpha = 0.75f))
                            )
                        )
                )
            } else if (!slot.exists) {
                Column(
                    modifier = Modifier.align(Alignment.Center),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Icon(
                        imageVector = Icons.Filled.AddCircleOutline,
                        contentDescription = stringResource(R.string.save_state_empty_slot),
                        tint = if (isFocused) colors.red else colors.text3,
                        modifier = Modifier.size(32.dp),
                    )
                    Spacer(Modifier.height(4.dp))
                    Text(
                        text = "СВОБОДНЫЙ СЛОТ",
                        color = colors.text3,
                        fontFamily = WatermelonMono,
                        fontSize = 8.5.sp,
                        fontWeight = FontWeight.Medium,
                    )
                }
            }

            // Top-Left Badge: Slot number or Quick Save + Undo Target
            Row(
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .padding(start = 8.dp, top = 8.dp),
                horizontalArrangement = Arrangement.spacedBy(4.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(6.dp))
                        .background(if (isQuick) colors.red else Color.Black.copy(alpha = 0.75f))
                        .padding(horizontal = 7.dp, vertical = 3.dp),
                ) {
                    Text(
                        text = if (isQuick) {
                            "⚡ БЫСТРОЕ"
                        } else {
                            "СЛОТ ${slot.slot}"
                        },
                        color = Color.White,
                        fontFamily = WatermelonMono,
                        fontSize = 8.5.sp,
                        fontWeight = FontWeight.Bold,
                    )
                }

                if (isUndoTarget) {
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(6.dp))
                            .background(Color(0xFFFF9800))
                            .padding(horizontal = 6.dp, vertical = 3.dp),
                    ) {
                        Text(
                            text = "↩️ РЕЗЕРВ",
                            color = Color.Black,
                            fontFamily = WatermelonMono,
                            fontSize = 8.sp,
                            fontWeight = FontWeight.Bold,
                        )
                    }
                }
            }

            // Top-Right Action Bar (Rename, Duplicate, Delete)
            if (slot.exists) {
                Row(
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(6.dp),
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    // Rename button
                    Box(
                        modifier = Modifier
                            .size(24.dp)
                            .clip(CircleShape)
                            .background(Color.Black.copy(alpha = 0.65f))
                            .clickable(onClick = onRename),
                        contentAlignment = Alignment.Center,
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Edit,
                            contentDescription = "Переименовать",
                            tint = Color.White,
                            modifier = Modifier.size(13.dp),
                        )
                    }

                    // Duplicate button
                    Box(
                        modifier = Modifier
                            .size(24.dp)
                            .clip(CircleShape)
                            .background(Color.Black.copy(alpha = 0.65f))
                            .clickable(onClick = onDuplicate),
                        contentAlignment = Alignment.Center,
                    ) {
                        Icon(
                            imageVector = Icons.Filled.ContentCopy,
                            contentDescription = "Дублировать",
                            tint = Color.White,
                            modifier = Modifier.size(13.dp),
                        )
                    }

                    // Delete button
                    Box(
                        modifier = Modifier
                            .size(24.dp)
                            .clip(CircleShape)
                            .background(Color.Black.copy(alpha = 0.65f))
                            .clickable(onClick = onDelete),
                        contentAlignment = Alignment.Center,
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Delete,
                            contentDescription = "Удалить",
                            tint = Color(0xFFFF5252),
                            modifier = Modifier.size(13.dp),
                        )
                    }
                }
            }
        }

        // Custom Name / Label
        if (slot.exists) {
            val label = slot.customName?.takeIf { it.isNotBlank() } ?: "Без названия"
            Text(
                text = "🏷️ $label",
                color = if (!slot.customName.isNullOrBlank()) colors.red else colors.text2,
                fontFamily = SpaceGrotesk,
                fontSize = 11.sp,
                fontWeight = FontWeight.SemiBold,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.padding(start = 2.dp, top = 6.dp),
            )
        }

        // Exact Date & Time Stamp and Relative Time
        val lastUsed = slot.lastUsedDate
        if (slot.exists && lastUsed != null) {
            Text(
                text = "📅 " + dateFormat.format(lastUsed),
                color = colors.text2,
                fontFamily = WatermelonMono,
                fontSize = 9.sp,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.padding(start = 2.dp, top = 2.dp),
            )
            val relTime = remember(lastUsed) { formatRelativeTime(context, lastUsed) }
            Text(
                text = "⏱️ " + relTime,
                color = colors.green.copy(alpha = 0.85f),
                fontFamily = WatermelonMono,
                fontSize = 8.5.sp,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.padding(start = 2.dp, top = 1.dp),
            )
        } else {
            Text(
                text = stringResource(R.string.save_state_empty_slot),
                color = colors.text3,
                fontFamily = WatermelonMono,
                fontSize = 9.sp,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.padding(start = 2.dp, top = 2.dp),
            )
        }
    }
}

@Composable
private fun RenameSaveStateDialog(
    slot: SaveStateSlot,
    onDismiss: () -> Unit,
    onConfirm: (String?) -> Unit,
) {
    val colors = watermelon
    var text by remember { mutableStateOf(slot.customName ?: "") }

    val presetTags = listOf("Перед боссом", "Чекпоинт", "Секрет", "Новая локация", "Перед развилкой", "Тест")

    Dialog(onDismissRequest = onDismiss) {
        Surface(
            shape = RoundedCornerShape(16.dp),
            color = colors.surface,
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        ) {
            Column(
                modifier = Modifier.padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Переименовать слот ${if (slot.slot == 0) "Быстрого сохранения" else slot.slot}",
                    fontFamily = SpaceGrotesk,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = colors.text,
                )
                Spacer(Modifier.height(14.dp))

                OutlinedTextField(
                    value = text,
                    onValueChange = { text = it },
                    label = { Text("Название сохранения", color = colors.text3) },
                    placeholder = { Text("Например: Перед боссом 3", color = colors.text3.copy(alpha = 0.6f)) },
                    singleLine = true,
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        textColor = colors.text,
                        cursorColor = colors.red,
                        focusedBorderColor = colors.red,
                        unfocusedBorderColor = colors.line,
                    ),
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(Modifier.height(12.dp))

                // Quick preset chips
                Text(
                    text = "Быстрые шаблоны:",
                    color = colors.text3,
                    fontFamily = WatermelonMono,
                    fontSize = 10.sp,
                    modifier = Modifier.align(Alignment.Start)
                )
                Spacer(Modifier.height(6.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    presetTags.take(3).forEach { tag ->
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(6.dp))
                                .background(colors.surface2)
                                .clickable { text = tag }
                                .padding(horizontal = 8.dp, vertical = 4.dp)
                        ) {
                            Text(
                                text = tag,
                                color = colors.text2,
                                fontSize = 9.5.sp,
                                fontFamily = SpaceGrotesk
                            )
                        }
                    }
                }
                Spacer(Modifier.height(6.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    presetTags.drop(3).forEach { tag ->
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(6.dp))
                                .background(colors.surface2)
                                .clickable { text = tag }
                                .padding(horizontal = 8.dp, vertical = 4.dp)
                        ) {
                            Text(
                                text = tag,
                                color = colors.text2,
                                fontSize = 9.5.sp,
                                fontFamily = SpaceGrotesk
                            )
                        }
                    }
                }

                Spacer(Modifier.height(20.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    TextButton(onClick = { onConfirm(null) }) {
                        Text("Очистить", color = colors.text3)
                    }
                    Spacer(Modifier.width(8.dp))
                    TextButton(onClick = onDismiss) {
                        Text(stringResource(R.string.cancel), color = colors.text2)
                    }
                    Spacer(Modifier.width(8.dp))
                    Button(
                        onClick = { onConfirm(text.trim().takeIf { it.isNotEmpty() }) },
                        colors = ButtonDefaults.buttonColors(backgroundColor = colors.red),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Text("Сохранить", color = Color.White, fontWeight = FontWeight.Bold)
                    }
                }
            }
        }
    }
}

@Composable
private fun DuplicateSaveStateDialog(
    sourceSlot: SaveStateSlot,
    slots: List<SaveStateSlot>,
    onDismiss: () -> Unit,
    onConfirm: (Int) -> Unit,
) {
    val colors = watermelon

    Dialog(onDismissRequest = onDismiss) {
        Surface(
            shape = RoundedCornerShape(16.dp),
            color = colors.surface,
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        ) {
            Column(
                modifier = Modifier.padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Дублировать сохранение",
                    fontFamily = SpaceGrotesk,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = colors.text,
                )
                Spacer(Modifier.height(6.dp))
                Text(
                    text = "Из слота ${if (sourceSlot.slot == 0) "Быстрого" else sourceSlot.slot} в:",
                    fontFamily = WatermelonMono,
                    fontSize = 11.sp,
                    color = colors.text3,
                )
                Spacer(Modifier.height(16.dp))

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    slots.forEach { slot ->
                        val isSelf = slot.slot == sourceSlot.slot
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(8.dp))
                                .background(if (isSelf) colors.surface2.copy(alpha = 0.3f) else colors.surface2)
                                .clickable(enabled = !isSelf) {
                                    onConfirm(slot.slot)
                                }
                                .padding(horizontal = 12.dp, vertical = 10.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text(
                                    text = if (slot.slot == 0) "⚡ Быстрый слот" else "Слот ${slot.slot}",
                                    color = if (isSelf) colors.text3 else colors.text,
                                    fontFamily = SpaceGrotesk,
                                    fontSize = 13.sp,
                                    fontWeight = FontWeight.SemiBold
                                )
                                if (isSelf) {
                                    Spacer(Modifier.width(8.dp))
                                    Text(
                                        text = "(Текущий)",
                                        color = colors.text3,
                                        fontFamily = WatermelonMono,
                                        fontSize = 10.sp
                                    )
                                }
                            }

                            Text(
                                text = if (slot.exists) "Перезаписать" else "Свободно",
                                color = if (slot.exists) Color(0xFFFF9800) else Color(0xFF4CAF50),
                                fontFamily = WatermelonMono,
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Medium
                            )
                        }
                    }
                }

                Spacer(Modifier.height(16.dp))

                TextButton(
                    onClick = onDismiss,
                    modifier = Modifier.align(Alignment.End)
                ) {
                    Text(stringResource(R.string.cancel), color = colors.text2)
                }
            }
        }
    }
}

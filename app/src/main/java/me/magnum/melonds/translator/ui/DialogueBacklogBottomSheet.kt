package me.magnum.melonds.translator.ui

import android.app.Activity
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.view.KeyEvent
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import me.magnum.melonds.R
import me.magnum.melonds.translator.backlog.DialogueBacklogStore
import me.magnum.melonds.translator.glossary.UserGlossaryManager
import me.magnum.melonds.ui.theme.MelonTheme
import me.magnum.melonds.ui.theme.watermelon

/**
 * Dialogue Backlog & User Glossary Bottom Sheet Dialog.
 *
 * Implements:
 * - 50-turn circular dialogue backlog history with TTS speak, copy, and add-to-glossary actions
 * - Interactive custom glossary editor (.stormdict.json) for character names and game terms
 * - Full dark theme styling, Back and ESC key dismissal support
 */
object DialogueBacklogBottomSheet {

    fun show(
        activity: Activity,
        backlogStore: DialogueBacklogStore,
        glossaryManager: UserGlossaryManager,
        onSpeakText: (String, String) -> Unit,
        onInvalidateCache: (String) -> Unit,
        initialTab: Int = 0
    ) {
        val bottomSheetDialog = BottomSheetDialog(activity)

        // Dismiss on ESC key
        bottomSheetDialog.setOnKeyListener { dialog, keyCode, event ->
            if (keyCode == KeyEvent.KEYCODE_ESCAPE && event.action == KeyEvent.ACTION_UP) {
                dialog.dismiss()
                true
            } else {
                false
            }
        }

        val composeView = ComposeView(activity).apply {
            setContent {
                MelonTheme {
                    DialogueBacklogContent(
                        backlogStore = backlogStore,
                        glossaryManager = glossaryManager,
                        onSpeakText = onSpeakText,
                        onInvalidateCache = onInvalidateCache,
                        onClose = { bottomSheetDialog.dismiss() },
                        initialTab = initialTab
                    )
                }
            }
        }

        bottomSheetDialog.setContentView(composeView)
        bottomSheetDialog.behavior.state = BottomSheetBehavior.STATE_EXPANDED
        bottomSheetDialog.behavior.skipCollapsed = true
        bottomSheetDialog.show()
    }
}

@Composable
fun DialogueBacklogContent(
    backlogStore: DialogueBacklogStore,
    glossaryManager: UserGlossaryManager,
    onSpeakText: (String, String) -> Unit,
    onInvalidateCache: (String) -> Unit,
    onClose: () -> Unit,
    initialTab: Int = 0
) {
    val context = LocalContext.current
    var selectedTab by remember { mutableStateOf(initialTab.coerceIn(0, 1)) }

    // Observe backlog store changes
    var backlogVersion by remember { mutableStateOf(0) }
    DisposableEffect(backlogStore) {
        val listener: () -> Unit = { backlogVersion += 1 }
        backlogStore.addListener(listener)
        onDispose { backlogStore.removeListener(listener) }
    }
    val backlogItems = remember(backlogVersion) { backlogStore.getAll() }

    // Observe glossary entries
    var glossaryVersion by remember { mutableStateOf(0) }
    val glossaryEntries = remember(glossaryVersion) { glossaryManager.getAllEntries() }

    // Dialog state for adding/editing glossary rule
    var showTermDialog by remember { mutableStateOf(false) }
    var termDialogInitialSource by remember { mutableStateOf("") }
    var termDialogInitialTarget by remember { mutableStateOf("") }
    var termDialogInitialCaseSensitive by remember { mutableStateOf(false) }
    var termDialogInitialGameSpecific by remember { mutableStateOf(false) }

    // Dialog state for confirming deletion
    var termToDelete by remember { mutableStateOf<UserGlossaryManager.GlossaryEntry?>(null) }

    val bgDark = Color(0xFF0F172A)
    val cardDark = Color(0xFF1E293B)
    val borderDark = Color(0xFF334155)
    val accentCyan = Color(0xFF00E5FF)
    val accentGreen = Color(0xFF10B981)
    val textPrimary = Color(0xFFF8FAFC)
    val textMuted = Color(0xFF94A3B8)

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.85f)
            .background(bgDark)
            .padding(horizontal = 16.dp, vertical = 12.dp)
    ) {
        // Drag Handle
        Box(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .width(42.dp)
                .height(4.dp)
                .clip(RoundedCornerShape(2.dp))
                .background(borderDark)
        )

        Spacer(modifier = Modifier.height(10.dp))

        // Header with Title and Close Button
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = context.getString(R.string.translator_backlog_and_glossary_title),
                color = textPrimary,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            IconButton(onClick = onClose, modifier = Modifier.size(32.dp)) {
                Icon(
                    imageVector = Icons.Filled.Close,
                    contentDescription = null,
                    tint = textMuted,
                    modifier = Modifier.size(20.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        // Tabs Selector
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(10.dp))
                .background(cardDark)
                .padding(4.dp)
        ) {
            val tabHistoryTitle = context.getString(R.string.translator_backlog_tab_history)
            val tabGlossaryTitle = context.getString(R.string.translator_backlog_tab_glossary)

            Box(
                modifier = Modifier
                    .weight(1f)
                    .clip(RoundedCornerShape(8.dp))
                    .background(if (selectedTab == 0) accentCyan.copy(alpha = 0.2f) else Color.Transparent)
                    .border(
                        width = if (selectedTab == 0) 1.dp else 0.dp,
                        color = if (selectedTab == 0) accentCyan else Color.Transparent,
                        shape = RoundedCornerShape(8.dp)
                    )
                    .clickable { selectedTab = 0 }
                    .padding(vertical = 10.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "$tabHistoryTitle (${backlogItems.size})",
                    color = if (selectedTab == 0) accentCyan else textMuted,
                    fontSize = 13.sp,
                    fontWeight = if (selectedTab == 0) FontWeight.Bold else FontWeight.Normal
                )
            }

            Spacer(modifier = Modifier.width(4.dp))

            Box(
                modifier = Modifier
                    .weight(1f)
                    .clip(RoundedCornerShape(8.dp))
                    .background(if (selectedTab == 1) accentGreen.copy(alpha = 0.2f) else Color.Transparent)
                    .border(
                        width = if (selectedTab == 1) 1.dp else 0.dp,
                        color = if (selectedTab == 1) accentGreen else Color.Transparent,
                        shape = RoundedCornerShape(8.dp)
                    )
                    .clickable { selectedTab = 1 }
                    .padding(vertical = 10.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "$tabGlossaryTitle (${glossaryEntries.size})",
                    color = if (selectedTab == 1) accentGreen else textMuted,
                    fontSize = 13.sp,
                    fontWeight = if (selectedTab == 1) FontWeight.Bold else FontWeight.Normal
                )
            }
        }

        Spacer(modifier = Modifier.height(12.dp))

        // Tab Content
        if (selectedTab == 0) {
            // === TAB 0: DIALOGUE BACKLOG HISTORY ===
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "${context.getString(R.string.translator_backlog_title)}: ${backlogItems.size} / 50",
                    color = textMuted,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Medium
                )
                if (backlogItems.isNotEmpty()) {
                    TextButton(
                        onClick = { backlogStore.clear() },
                        contentPadding = PaddingValues(horizontal = 8.dp, vertical = 2.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Filled.DeleteSweep,
                            contentDescription = null,
                            tint = Color(0xFFEF4444),
                            modifier = Modifier.size(16.dp)
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = context.getString(R.string.translator_backlog_clear_history),
                            color = Color(0xFFEF4444),
                            fontSize = 12.sp
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(6.dp))

            if (backlogItems.isEmpty()) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(24.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(
                            imageVector = Icons.Filled.History,
                            contentDescription = null,
                            tint = borderDark,
                            modifier = Modifier.size(56.dp)
                        )
                        Spacer(modifier = Modifier.height(12.dp))
                        Text(
                            text = context.getString(R.string.translator_backlog_empty_prompt),
                            color = textMuted,
                            fontSize = 14.sp,
                            textAlign = androidx.compose.ui.text.style.TextAlign.Center
                        )
                    }
                }
            } else {
                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    items(backlogItems, key = { it.id }) { item ->
                        BacklogItemCard(
                            item = item,
                            onSpeak = { onSpeakText(item.translatedText, item.targetLang) },
                            onCopy = {
                                val clipboard = context.getSystemService(Context.CLIPBOARD_SERVICE) as? ClipboardManager
                                val clip = ClipData.newPlainText("STORM DS Backlog", "${item.sourceText}\n\n${item.translatedText}")
                                clipboard?.setPrimaryClip(clip)
                                Toast.makeText(context, context.getString(R.string.translator_backlog_copied_toast), Toast.LENGTH_SHORT).show()
                            },
                            onAddToGlossary = {
                                termDialogInitialSource = item.sourceText
                                termDialogInitialTarget = item.translatedText
                                termDialogInitialCaseSensitive = false
                                termDialogInitialGameSpecific = glossaryManager.getActiveGameKey() != "global"
                                showTermDialog = true
                            }
                        )
                    }
                }
            }
        } else {
            // === TAB 1: USER GLOSSARY ===
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Button(
                    onClick = {
                        termDialogInitialSource = ""
                        termDialogInitialTarget = ""
                        termDialogInitialCaseSensitive = false
                        termDialogInitialGameSpecific = glossaryManager.getActiveGameKey() != "global"
                        showTermDialog = true
                    },
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = accentGreen,
                        contentColor = Color(0xFF0F172A)
                    ),
                    contentPadding = PaddingValues(horizontal = 12.dp, vertical = 6.dp)
                ) {
                    Icon(
                        imageVector = Icons.Filled.Add,
                        contentDescription = null,
                        modifier = Modifier.size(16.dp)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = context.getString(R.string.translator_glossary_add_term),
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                OutlinedButton(
                    onClick = {
                        val path = glossaryManager.getDictionaryFilePath(isGameSpecific = false)
                        val clipboard = context.getSystemService(Context.CLIPBOARD_SERVICE) as? ClipboardManager
                        clipboard?.setPrimaryClip(ClipData.newPlainText("STORM DS Glossary Path", path))
                        Toast.makeText(context, context.getString(R.string.translator_glossary_path_copied, path), Toast.LENGTH_LONG).show()
                    },
                    shape = RoundedCornerShape(8.dp),
                    border = androidx.compose.foundation.BorderStroke(1.dp, borderDark),
                    colors = ButtonDefaults.outlinedButtonColors(
                        backgroundColor = cardDark,
                        contentColor = textMuted
                    ),
                    contentPadding = PaddingValues(horizontal = 10.dp, vertical = 6.dp)
                ) {
                    Icon(
                        imageVector = Icons.Filled.FolderOpen,
                        contentDescription = null,
                        tint = accentCyan,
                        modifier = Modifier.size(16.dp)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = context.getString(R.string.translator_glossary_export_path),
                        fontSize = 12.sp,
                        color = textMuted
                    )
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            if (glossaryEntries.isEmpty()) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(24.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(
                            imageVector = Icons.Filled.Translate,
                            contentDescription = null,
                            tint = borderDark,
                            modifier = Modifier.size(56.dp)
                        )
                        Spacer(modifier = Modifier.height(12.dp))
                        Text(
                            text = context.getString(R.string.translator_glossary_empty_prompt),
                            color = textMuted,
                            fontSize = 14.sp,
                            textAlign = androidx.compose.ui.text.style.TextAlign.Center
                        )
                    }
                }
            } else {
                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    items(glossaryEntries, key = { "${it.sourceTerm}_${it.caseSensitive}" }) { entry ->
                        val isGame = glossaryManager.isGameSpecific(entry.sourceTerm)
                        GlossaryEntryCard(
                            entry = entry,
                            isGameSpecific = isGame,
                            onEdit = {
                                termDialogInitialSource = entry.sourceTerm
                                termDialogInitialTarget = entry.targetTerm
                                termDialogInitialCaseSensitive = entry.caseSensitive
                                termDialogInitialGameSpecific = isGame
                                showTermDialog = true
                            },
                            onDelete = {
                                termToDelete = entry
                            }
                        )
                    }
                }
            }
        }
    }

    // Modal: Add or Edit Term
    if (showTermDialog) {
        AddOrEditGlossaryTermDialog(
            initialSource = termDialogInitialSource,
            initialTarget = termDialogInitialTarget,
            initialCaseSensitive = termDialogInitialCaseSensitive,
            initialGameSpecific = termDialogInitialGameSpecific,
            activeGameKey = glossaryManager.getActiveGameKey(),
            onDismiss = { showTermDialog = false },
            onSave = { source, target, caseSens, gameSpec ->
                val entry = UserGlossaryManager.GlossaryEntry(source, target, caseSens)
                glossaryManager.addOrUpdateEntry(entry, isGameSpecific = gameSpec)
                onInvalidateCache(source)
                glossaryVersion++
                showTermDialog = false
                Toast.makeText(context, context.getString(R.string.translator_glossary_saved_toast, source), Toast.LENGTH_SHORT).show()
            }
        )
    }

    // Modal: Confirm Delete
    termToDelete?.let { entry ->
        val isGame = glossaryManager.isGameSpecific(entry.sourceTerm)
        AlertDialog(
            onDismissRequest = { termToDelete = null },
            backgroundColor = cardDark,
            title = {
                Text(
                    text = context.getString(R.string.translator_glossary_delete_term),
                    color = textPrimary,
                    fontWeight = FontWeight.Bold
                )
            },
            text = {
                Text(
                    text = "«${entry.sourceTerm}» → «${entry.targetTerm}»",
                    color = textMuted
                )
            },
            confirmButton = {
                TextButton(
                    onClick = {
                        glossaryManager.deleteEntry(entry.sourceTerm, isGameSpecific = isGame)
                        onInvalidateCache(entry.sourceTerm)
                        glossaryVersion++
                        termToDelete = null
                        Toast.makeText(context, context.getString(R.string.translator_glossary_deleted_toast), Toast.LENGTH_SHORT).show()
                    }
                ) {
                    Text(text = context.getString(R.string.translator_glossary_delete_term), color = Color(0xFFEF4444), fontWeight = FontWeight.Bold)
                }
            },
            dismissButton = {
                TextButton(onClick = { termToDelete = null }) {
                    Text(text = context.getString(android.R.string.cancel), color = textMuted)
                }
            }
        )
    }
}

@Composable
fun BacklogItemCard(
    item: DialogueBacklogStore.DialogueItem,
    onSpeak: () -> Unit,
    onCopy: () -> Unit,
    onAddToGlossary: () -> Unit
) {
    val context = LocalContext.current
    val cardDark = Color(0xFF1E293B)
    val borderDark = Color(0xFF334155)
    val accentCyan = Color(0xFF00E5FF)
    val accentGreen = Color(0xFF10B981)
    val textPrimary = Color(0xFFF8FAFC)
    val textMuted = Color(0xFF94A3B8)

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .border(1.dp, borderDark, RoundedCornerShape(12.dp)),
        backgroundColor = cardDark,
        elevation = 2.dp
    ) {
        Column(modifier = Modifier.padding(12.dp)) {
            // Top info row: time and language pair
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = item.formattedTimeShort,
                    color = accentCyan,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.SemiBold
                )
                Text(
                    text = "${item.sourceLang.uppercase()} → ${item.targetLang.uppercase()}",
                    color = textMuted,
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Medium
                )
            }

            Spacer(modifier = Modifier.height(4.dp))

            // Original Text (muted font)
            if (item.sourceText.isNotBlank()) {
                Text(
                    text = item.sourceText,
                    color = textMuted,
                    fontSize = 13.sp,
                    fontStyle = FontStyle.Italic,
                    lineHeight = 18.sp
                )
                Spacer(modifier = Modifier.height(6.dp))
            }

            // Translated Text (large prominent text)
            Text(
                text = item.translatedText,
                color = textPrimary,
                fontSize = 17.sp,
                fontWeight = FontWeight.SemiBold,
                lineHeight = 22.sp
            )

            Spacer(modifier = Modifier.height(10.dp))

            // 3 Compact Action Buttons: Speak, Copy, To Glossary
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                // 1. Speak
                OutlinedButton(
                    onClick = onSpeak,
                    modifier = Modifier.weight(1f),
                    shape = RoundedCornerShape(8.dp),
                    border = androidx.compose.foundation.BorderStroke(1.dp, accentGreen.copy(alpha = 0.5f)),
                    colors = ButtonDefaults.outlinedButtonColors(
                        backgroundColor = accentGreen.copy(alpha = 0.12f),
                        contentColor = accentGreen
                    ),
                    contentPadding = PaddingValues(vertical = 4.dp, horizontal = 6.dp)
                ) {
                    Icon(
                        imageVector = Icons.Filled.VolumeUp,
                        contentDescription = null,
                        tint = accentGreen,
                        modifier = Modifier.size(15.dp)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = context.getString(R.string.translator_backlog_action_speak),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                }

                // 2. Copy
                OutlinedButton(
                    onClick = onCopy,
                    modifier = Modifier.weight(1f),
                    shape = RoundedCornerShape(8.dp),
                    border = androidx.compose.foundation.BorderStroke(1.dp, accentCyan.copy(alpha = 0.5f)),
                    colors = ButtonDefaults.outlinedButtonColors(
                        backgroundColor = accentCyan.copy(alpha = 0.12f),
                        contentColor = accentCyan
                    ),
                    contentPadding = PaddingValues(vertical = 4.dp, horizontal = 6.dp)
                ) {
                    Icon(
                        imageVector = Icons.Filled.ContentCopy,
                        contentDescription = null,
                        tint = accentCyan,
                        modifier = Modifier.size(15.dp)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = context.getString(R.string.translator_backlog_action_copy),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                }

                // 3. To Glossary
                OutlinedButton(
                    onClick = onAddToGlossary,
                    modifier = Modifier.weight(1f),
                    shape = RoundedCornerShape(8.dp),
                    border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFFA855F7).copy(alpha = 0.5f)),
                    colors = ButtonDefaults.outlinedButtonColors(
                        backgroundColor = Color(0xFFA855F7).copy(alpha = 0.12f),
                        contentColor = Color(0xFFA855F7)
                    ),
                    contentPadding = PaddingValues(vertical = 4.dp, horizontal = 6.dp)
                ) {
                    Icon(
                        imageVector = Icons.Filled.Translate,
                        contentDescription = null,
                        tint = Color(0xFFA855F7),
                        modifier = Modifier.size(15.dp)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = context.getString(R.string.translator_backlog_action_add_to_glossary),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                }
            }
        }
    }
}

@Composable
fun GlossaryEntryCard(
    entry: UserGlossaryManager.GlossaryEntry,
    isGameSpecific: Boolean,
    onEdit: () -> Unit,
    onDelete: () -> Unit
) {
    val context = LocalContext.current
    val cardDark = Color(0xFF1E293B)
    val borderDark = Color(0xFF334155)
    val accentCyan = Color(0xFF00E5FF)
    val accentGreen = Color(0xFF10B981)
    val textPrimary = Color(0xFFF8FAFC)
    val textMuted = Color(0xFF94A3B8)

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(10.dp))
            .border(1.dp, borderDark, RoundedCornerShape(10.dp)),
        backgroundColor = cardDark,
        elevation = 1.dp
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp, vertical = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = entry.sourceTerm,
                        color = accentCyan,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = "→",
                        color = textMuted,
                        fontSize = 14.sp
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = entry.targetTerm,
                        color = accentGreen,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                Spacer(modifier = Modifier.height(4.dp))

                Row(verticalAlignment = Alignment.CenterVertically) {
                    val scopeBadge = if (isGameSpecific) context.getString(R.string.translator_glossary_scope_game) else context.getString(R.string.translator_glossary_scope_global)
                    Text(
                        text = "[$scopeBadge]",
                        color = if (isGameSpecific) Color(0xFFA855F7) else textMuted,
                        fontSize = 11.sp
                    )
                    if (entry.caseSensitive) {
                        Spacer(modifier = Modifier.width(6.dp))
                        Text(
                            text = "[Aa]",
                            color = Color(0xFFF59E0B),
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }

            Row(verticalAlignment = Alignment.CenterVertically) {
                IconButton(onClick = onEdit, modifier = Modifier.size(32.dp)) {
                    Icon(
                        imageVector = Icons.Filled.Edit,
                        contentDescription = null,
                        tint = textMuted,
                        modifier = Modifier.size(17.dp)
                    )
                }
                IconButton(onClick = onDelete, modifier = Modifier.size(32.dp)) {
                    Icon(
                        imageVector = Icons.Filled.Delete,
                        contentDescription = null,
                        tint = Color(0xFFEF4444),
                        modifier = Modifier.size(17.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun AddOrEditGlossaryTermDialog(
    initialSource: String,
    initialTarget: String,
    initialCaseSensitive: Boolean,
    initialGameSpecific: Boolean,
    activeGameKey: String,
    onDismiss: () -> Unit,
    onSave: (source: String, target: String, caseSensitive: Boolean, isGameSpecific: Boolean) -> Unit
) {
    val context = LocalContext.current
    var sourceText by remember { mutableStateOf(initialSource) }
    var targetText by remember { mutableStateOf(initialTarget) }
    var caseSensitive by remember { mutableStateOf(initialCaseSensitive) }
    var isGameSpecific by remember { mutableStateOf(initialGameSpecific && activeGameKey != "global") }

    val cardDark = Color(0xFF1E293B)
    val textPrimary = Color(0xFFF8FAFC)
    val textMuted = Color(0xFF94A3B8)
    val accentCyan = Color(0xFF00E5FF)
    val accentGreen = Color(0xFF10B981)

    Dialog(onDismissRequest = onDismiss) {
        Card(
            shape = RoundedCornerShape(16.dp),
            backgroundColor = cardDark,
            elevation = 8.dp,
            modifier = Modifier.fillMaxWidth().padding(8.dp)
        ) {
            Column(modifier = Modifier.padding(18.dp)) {
                Text(
                    text = if (initialSource.isBlank()) context.getString(R.string.translator_glossary_add_term) else context.getString(R.string.translator_glossary_edit_term),
                    color = textPrimary,
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(14.dp))

                // Source Term Input
                Text(
                    text = context.getString(R.string.translator_glossary_source_label),
                    color = textMuted,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Medium
                )
                Spacer(modifier = Modifier.height(4.dp))
                OutlinedTextField(
                    value = sourceText,
                    onValueChange = { sourceText = it },
                    modifier = Modifier.fillMaxWidth(),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        textColor = textPrimary,
                        cursorColor = accentCyan,
                        focusedBorderColor = accentCyan,
                        unfocusedBorderColor = Color(0xFF475569)
                    ),
                    singleLine = true
                )

                Spacer(modifier = Modifier.height(12.dp))

                // Target Translation Input
                Text(
                    text = context.getString(R.string.translator_glossary_target_label),
                    color = textMuted,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Medium
                )
                Spacer(modifier = Modifier.height(4.dp))
                OutlinedTextField(
                    value = targetText,
                    onValueChange = { targetText = it },
                    modifier = Modifier.fillMaxWidth(),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        textColor = textPrimary,
                        cursorColor = accentGreen,
                        focusedBorderColor = accentGreen,
                        unfocusedBorderColor = Color(0xFF475569)
                    ),
                    singleLine = true
                )

                Spacer(modifier = Modifier.height(14.dp))

                // Case Sensitive Switch
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable { caseSensitive = !caseSensitive }
                        .padding(vertical = 4.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = context.getString(R.string.translator_glossary_case_sensitive),
                        color = textPrimary,
                        fontSize = 14.sp
                    )
                    Switch(
                        checked = caseSensitive,
                        onCheckedChange = { caseSensitive = it },
                        colors = SwitchDefaults.colors(
                            checkedThumbColor = accentCyan,
                            checkedTrackColor = accentCyan.copy(alpha = 0.5f)
                        )
                    )
                }

                // Game Specific Switch (only if game is active)
                if (activeGameKey != "global") {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable { isGameSpecific = !isGameSpecific }
                            .padding(vertical = 4.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = context.getString(R.string.translator_glossary_game_specific),
                            color = textPrimary,
                            fontSize = 14.sp
                        )
                        Switch(
                            checked = isGameSpecific,
                            onCheckedChange = { isGameSpecific = it },
                            colors = SwitchDefaults.colors(
                                checkedThumbColor = Color(0xFFA855F7),
                                checkedTrackColor = Color(0xFFA855F7).copy(alpha = 0.5f)
                            )
                        )
                    }
                }

                Spacer(modifier = Modifier.height(18.dp))

                // Action Buttons
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    TextButton(onClick = onDismiss) {
                        Text(text = context.getString(android.R.string.cancel), color = textMuted)
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Button(
                        onClick = {
                            val cleanS = sourceText.trim()
                            val cleanT = targetText.trim()
                            if (cleanS.isNotBlank() && cleanT.isNotBlank()) {
                                onSave(cleanS, cleanT, caseSensitive, isGameSpecific)
                            }
                        },
                        enabled = sourceText.isNotBlank() && targetText.isNotBlank(),
                        shape = RoundedCornerShape(8.dp),
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = accentGreen,
                            contentColor = Color(0xFF0F172A)
                        )
                    ) {
                        Text(
                            text = context.getString(android.R.string.ok),
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
        }
    }
}

package me.magnum.melonds.ui.emulator.ui

import android.widget.Toast
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Switch
import androidx.compose.material.SwitchDefaults
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Bolt
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.ContentCopy
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material.icons.filled.Folder
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import me.magnum.melonds.R
import me.magnum.melonds.common.cheats.jusrcheat.JusrcheatCode
import me.magnum.melonds.common.cheats.jusrcheat.JusrcheatGame
import me.magnum.melonds.common.cheats.jusrcheat.JusrcheatGameMeta
import me.magnum.melonds.common.cheats.jusrcheat.JusrcheatRepository
import me.magnum.melonds.domain.model.RomInfo
import me.magnum.melonds.domain.repositories.CheatsRepository
import me.magnum.melonds.impl.RoomCheatsRepository
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.ui.theme.WatermelonMono
import me.magnum.melonds.ui.theme.watermelon

@Composable
fun JusrcheatAllGamesTab(
    romInfo: RomInfo?,
    cheatsRepository: CheatsRepository,
    onCheatAttached: () -> Unit,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    val clipboardManager = LocalClipboardManager.current
    val coroutineScope = rememberCoroutineScope()
    val colors = watermelon
    val onAccent = if (colors.isDark) Color.Black else Color.White

    val jusrcheatRepo = remember {
        cheatsRepository.getJusrcheatRepository()
            ?: (cheatsRepository as? RoomCheatsRepository)?.jusrcheatRepository
            ?: run {
                val db = me.magnum.melonds.di.entrypoint.CheatsEntryPoint.resolve(context).database()
                JusrcheatRepository.getInstance(context, db)
            }
    }

    var isLoading by remember { mutableStateOf(true) }
    var allGames by remember { mutableStateOf<List<JusrcheatGameMeta>>(emptyList()) }
    var searchQuery by remember { mutableStateOf("") }
    var selectedRegion by remember { mutableStateOf("ALL") }

    val expandedGames = remember { mutableStateMapOf<String, Boolean>() }
    val loadedGameDetails = remember { mutableStateMapOf<String, JusrcheatGame?>() }
    val attachedCheatsState = remember { mutableStateMapOf<String, Boolean>() }

    // Dialog state for Edit / Add cheat
    var showEditDialog by remember { mutableStateOf(false) }
    var editingGameId by remember { mutableStateOf("") }
    var editingCheatName by remember { mutableStateOf("") }
    var editingCheatNote by remember { mutableStateOf("") }
    var editingCheatCode by remember { mutableStateOf("") }
    var isNewCheatMode by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        isLoading = true
        withContext(Dispatchers.IO) {
            jusrcheatRepo.ensureInitialized()
            val games = jusrcheatRepo.getAllGames()
            allGames = games
        }
        isLoading = false
    }

    val familyMatches = remember(romInfo, allGames) {
        val code = romInfo?.gameCode?.trim().orEmpty()
        if (code.length >= 3) {
            jusrcheatRepo.findCrossRegionFamily(code)
        } else {
            emptyList()
        }
    }

    val filteredGames = remember(allGames, searchQuery, selectedRegion, familyMatches) {
        if (selectedRegion == "SIMILAR" && romInfo != null) {
            if (searchQuery.isBlank()) {
                familyMatches
            } else {
                familyMatches.filter {
                    it.title.contains(searchQuery, ignoreCase = true) ||
                            it.gameId.contains(searchQuery, ignoreCase = true) ||
                            it.crcHex.contains(searchQuery, ignoreCase = true)
                }
            }
        } else {
            jusrcheatRepo.searchGames(searchQuery, selectedRegion)
        }
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(colors.surface)
    ) {
        // Search and Region Filter Header
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 14.dp, vertical = 8.dp)
        ) {
            // Search Box
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(10.dp))
                    .background(colors.surface2)
                    .border(1.dp, colors.line, RoundedCornerShape(10.dp))
                    .padding(horizontal = 12.dp, vertical = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Filled.Search,
                    contentDescription = null,
                    tint = colors.green,
                    modifier = Modifier.size(18.dp)
                )
                Spacer(Modifier.width(8.dp))
                BasicTextField(
                    value = searchQuery,
                    onValueChange = { searchQuery = it },
                    singleLine = true,
                    textStyle = TextStyle(
                        color = colors.text,
                        fontFamily = SpaceGrotesk,
                        fontSize = 13.sp
                    ),
                    cursorBrush = SolidColor(colors.green),
                    modifier = Modifier.weight(1f),
                    decorationBox = { innerTextField ->
                        if (searchQuery.isEmpty()) {
                            Text(
                                text = stringResource(R.string.v791_jusrcheat_search_hint),
                                color = colors.text3,
                                fontFamily = SpaceGrotesk,
                                fontSize = 12.5.sp
                            )
                        }
                        innerTextField()
                    }
                )
                if (searchQuery.isNotEmpty()) {
                    Icon(
                        imageVector = Icons.Filled.Clear,
                        contentDescription = stringResource(R.string.v791_jusrcheat_btn_cancel),
                        tint = colors.text3,
                        modifier = Modifier
                            .size(18.dp)
                            .clickable { searchQuery = "" }
                    )
                }
            }

            Spacer(Modifier.height(8.dp))

            // Region Chips
            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(6.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                item {
                    RegionFilterChip(
                        text = stringResource(R.string.v791_jusrcheat_filter_all),
                        isSelected = selectedRegion == "ALL",
                        onClick = { selectedRegion = "ALL" },
                        colors = colors
                    )
                }
                if (romInfo != null && familyMatches.isNotEmpty()) {
                    item {
                        RegionFilterChip(
                            text = "${stringResource(R.string.v791_jusrcheat_filter_similar)} (${familyMatches.size})",
                            isSelected = selectedRegion == "SIMILAR",
                            onClick = { selectedRegion = "SIMILAR" },
                            colors = colors,
                            accentGlow = true
                        )
                    }
                }
                item {
                    RegionFilterChip(
                        text = stringResource(R.string.v791_jusrcheat_filter_usa),
                        isSelected = selectedRegion == "USA",
                        onClick = { selectedRegion = "USA" },
                        colors = colors
                    )
                }
                item {
                    RegionFilterChip(
                        text = stringResource(R.string.v791_jusrcheat_filter_europe),
                        isSelected = selectedRegion == "EUROPE",
                        onClick = { selectedRegion = "EUROPE" },
                        colors = colors
                    )
                }
                item {
                    RegionFilterChip(
                        text = stringResource(R.string.v791_jusrcheat_filter_japan),
                        isSelected = selectedRegion == "JAPAN",
                        onClick = { selectedRegion = "JAPAN" },
                        colors = colors
                    )
                }
            }

            Spacer(Modifier.height(4.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "${filteredGames.size} / ${allGames.size} игр",
                    color = colors.text3,
                    fontFamily = WatermelonMono,
                    fontSize = 10.sp
                )
                Text(
                    text = stringResource(R.string.v791_jusrcheat_db_stats),
                    color = colors.text3,
                    fontFamily = WatermelonMono,
                    fontSize = 9.sp
                )
            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(1.dp)
                .background(colors.line)
        )

        // Main List Content
        if (isLoading) {
            Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    CircularProgressIndicator(color = colors.green, modifier = Modifier.size(36.dp))
                    Spacer(Modifier.height(8.dp))
                    Text(
                        text = "Загрузка 4079 игр базы Jusrcheat...",
                        color = colors.text2,
                        fontFamily = SpaceGrotesk,
                        fontSize = 12.sp
                    )
                }
            }
        } else if (filteredGames.isEmpty()) {
            Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Text(
                    text = stringResource(R.string.v791_jusrcheat_no_games_found),
                    color = colors.text3,
                    fontFamily = SpaceGrotesk,
                    fontSize = 14.sp
                )
            }
        } else {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 14.dp),
                contentPadding = PaddingValues(vertical = 10.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                // Limit rendering to top 200 items for 120 FPS performance
                val displayList = filteredGames.take(200)

                items(displayList, key = { "${it.gameId}_${it.crcHex}_${it.index}" }) { gameMeta ->
                    val isExpanded = expandedGames[gameMeta.gameId] ?: false
                    val gameDetails = loadedGameDetails[gameMeta.gameId]

                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(10.dp))
                            .background(colors.surface2)
                            .border(1.dp, if (isExpanded) colors.green else colors.line, RoundedCornerShape(10.dp))
                            .padding(10.dp)
                    ) {
                        // Game Header Row
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable {
                                    val newExpanded = !isExpanded
                                    expandedGames[gameMeta.gameId] = newExpanded
                                    if (newExpanded && !loadedGameDetails.containsKey(gameMeta.gameId)) {
                                        coroutineScope.launch(Dispatchers.IO) {
                                            val details = jusrcheatRepo.loadGame(gameMeta)
                                            loadedGameDetails[gameMeta.gameId] = details
                                        }
                                    }
                                }
                        ) {
                            Icon(
                                imageVector = Icons.Filled.Bolt,
                                contentDescription = null,
                                tint = colors.green,
                                modifier = Modifier.size(20.dp)
                            )
                            Spacer(Modifier.width(8.dp))
                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = gameMeta.title,
                                    color = colors.text,
                                    fontFamily = SpaceGrotesk,
                                    fontSize = 13.5.sp,
                                    fontWeight = FontWeight.SemiBold,
                                    maxLines = 2,
                                    overflow = TextOverflow.Ellipsis
                                )
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Text(
                                        text = "[${gameMeta.gameId} - ${gameMeta.crcHex}]",
                                        color = colors.text3,
                                        fontFamily = WatermelonMono,
                                        fontSize = 10.sp
                                    )
                                    Spacer(Modifier.width(6.dp))
                                    Box(
                                        modifier = Modifier
                                            .clip(RoundedCornerShape(4.dp))
                                            .background(colors.green.copy(alpha = 0.15f))
                                            .padding(horizontal = 4.dp, vertical = 1.dp)
                                    ) {
                                        Text(
                                            text = gameMeta.region,
                                            color = colors.green,
                                            fontFamily = WatermelonMono,
                                            fontSize = 8.5.sp,
                                            fontWeight = FontWeight.Bold
                                        )
                                    }
                                }
                            }
                            Icon(
                                imageVector = if (isExpanded) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
                                contentDescription = null,
                                tint = colors.text2,
                                modifier = Modifier.size(22.dp)
                            )
                        }

                        // Expanded Game Cheats and Folders
                        AnimatedVisibility(visible = isExpanded) {
                            Column(modifier = Modifier.padding(top = 8.dp)) {
                                if (gameDetails == null) {
                                    Box(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(vertical = 12.dp),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        CircularProgressIndicator(
                                            color = colors.green,
                                            modifier = Modifier.size(24.dp)
                                        )
                                    }
                                } else {
                                    // Action bar for game: Add custom cheat or attach all
                                    Row(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(bottom = 6.dp),
                                        horizontalArrangement = Arrangement.SpaceBetween,
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Text(
                                            text = "${gameDetails.totalCheatsCount} кодов доступно",
                                            color = colors.text2,
                                            fontFamily = WatermelonMono,
                                            fontSize = 10.sp
                                        )

                                        Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                                            // Add cheat button
                                            Box(
                                                modifier = Modifier
                                                    .clip(RoundedCornerShape(6.dp))
                                                    .background(colors.surface3)
                                                    .clickable {
                                                        editingGameId = gameMeta.gameId
                                                        editingCheatName = ""
                                                        editingCheatNote = ""
                                                        editingCheatCode = ""
                                                        isNewCheatMode = true
                                                        showEditDialog = true
                                                    }
                                                    .padding(horizontal = 6.dp, vertical = 3.dp)
                                            ) {
                                                Row(verticalAlignment = Alignment.CenterVertically) {
                                                    Icon(
                                                        imageVector = Icons.Filled.Add,
                                                        contentDescription = null,
                                                        tint = colors.green,
                                                        modifier = Modifier.size(12.dp)
                                                    )
                                                    Spacer(Modifier.width(3.dp))
                                                    Text(
                                                        text = "Добавить код",
                                                        color = colors.green,
                                                        fontFamily = SpaceGrotesk,
                                                        fontSize = 10.sp,
                                                        fontWeight = FontWeight.Bold
                                                    )
                                                }
                                            }

                                            // Attach all button if romInfo is present
                                            if (romInfo != null && gameDetails.totalCheatsCount > 0) {
                                                Box(
                                                    modifier = Modifier
                                                        .clip(RoundedCornerShape(6.dp))
                                                        .background(colors.green.copy(alpha = 0.2f))
                                                        .clickable {
                                                            coroutineScope.launch {
                                                                jusrcheatRepo.attachEntireGameToActiveRom(
                                                                    romInfo = romInfo,
                                                                    jusrGame = gameDetails,
                                                                    enableAll = false
                                                                )
                                                                onCheatAttached()
                                                                Toast.makeText(
                                                                    context,
                                                                    context.getString(R.string.v791_jusrcheat_attached_success),
                                                                    Toast.LENGTH_SHORT
                                                                ).show()
                                                            }
                                                        }
                                                        .padding(horizontal = 6.dp, vertical = 3.dp)
                                                ) {
                                                    Text(
                                                        text = "Подключить всё",
                                                        color = colors.green,
                                                        fontFamily = SpaceGrotesk,
                                                        fontSize = 10.sp,
                                                        fontWeight = FontWeight.Bold
                                                    )
                                                }
                                            }
                                        }
                                    }

                                    // Direct cheats
                                    for (cheat in gameDetails.directCheats) {
                                        CheatItemRow(
                                            cheat = cheat,
                                            sourceGameId = gameMeta.gameId,
                                            romInfo = romInfo,
                                            jusrcheatRepo = jusrcheatRepo,
                                            colors = colors,
                                            onAccent = onAccent,
                                            attachedCheatsState = attachedCheatsState,
                                            onCheatAttached = onCheatAttached,
                                            onCopy = { code ->
                                                clipboardManager.setText(AnnotatedString(code))
                                                Toast.makeText(context, context.getString(R.string.v791_jusrcheat_code_copied), Toast.LENGTH_SHORT).show()
                                            },
                                            onEdit = { c ->
                                                editingGameId = gameMeta.gameId
                                                editingCheatName = c.name
                                                editingCheatNote = c.note
                                                editingCheatCode = c.getFormattedCode()
                                                isNewCheatMode = false
                                                showEditDialog = true
                                            }
                                        )
                                        Spacer(Modifier.height(6.dp))
                                    }

                                    // Folders
                                    for (folder in gameDetails.folders) {
                                        FolderCheatsGroup(
                                            folder = folder,
                                            sourceGameId = gameMeta.gameId,
                                            romInfo = romInfo,
                                            jusrcheatRepo = jusrcheatRepo,
                                            colors = colors,
                                            onAccent = onAccent,
                                            attachedCheatsState = attachedCheatsState,
                                            onCheatAttached = onCheatAttached,
                                            onCopy = { code ->
                                                clipboardManager.setText(AnnotatedString(code))
                                                Toast.makeText(context, context.getString(R.string.v791_jusrcheat_code_copied), Toast.LENGTH_SHORT).show()
                                            },
                                            onEdit = { c ->
                                                editingGameId = gameMeta.gameId
                                                editingCheatName = c.name
                                                editingCheatNote = c.note
                                                editingCheatCode = c.getFormattedCode()
                                                isNewCheatMode = false
                                                showEditDialog = true
                                            }
                                        )
                                        Spacer(Modifier.height(6.dp))
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    // Edit / Add Cheat Dialog
    if (showEditDialog) {
        AlertDialog(
            onDismissRequest = { showEditDialog = false },
            title = {
                Text(
                    text = stringResource(
                        if (isNewCheatMode) R.string.v791_jusrcheat_add_cheat_title
                        else R.string.v791_jusrcheat_edit_cheat_title
                    ),
                    color = colors.text,
                    fontFamily = SpaceGrotesk,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
            },
            text = {
                Column(modifier = Modifier.fillMaxWidth()) {
                    Text(
                        text = stringResource(R.string.v791_jusrcheat_cheat_name),
                        color = colors.text2,
                        fontFamily = SpaceGrotesk,
                        fontSize = 11.5.sp
                    )
                    BasicTextField(
                        value = editingCheatName,
                        onValueChange = { editingCheatName = it },
                        textStyle = TextStyle(color = colors.text, fontFamily = SpaceGrotesk, fontSize = 13.sp),
                        cursorBrush = SolidColor(colors.green),
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(6.dp))
                            .background(colors.surface2)
                            .border(1.dp, colors.line, RoundedCornerShape(6.dp))
                            .padding(8.dp)
                    )

                    Spacer(Modifier.height(8.dp))
                    Text(
                        text = stringResource(R.string.v791_jusrcheat_cheat_note),
                        color = colors.text2,
                        fontFamily = SpaceGrotesk,
                        fontSize = 11.5.sp
                    )
                    BasicTextField(
                        value = editingCheatNote,
                        onValueChange = { editingCheatNote = it },
                        textStyle = TextStyle(color = colors.text, fontFamily = SpaceGrotesk, fontSize = 12.sp),
                        cursorBrush = SolidColor(colors.green),
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(6.dp))
                            .background(colors.surface2)
                            .border(1.dp, colors.line, RoundedCornerShape(6.dp))
                            .padding(8.dp)
                    )

                    Spacer(Modifier.height(8.dp))
                    Text(
                        text = stringResource(R.string.v791_jusrcheat_cheat_code),
                        color = colors.text2,
                        fontFamily = SpaceGrotesk,
                        fontSize = 11.5.sp
                    )
                    BasicTextField(
                        value = editingCheatCode,
                        onValueChange = { editingCheatCode = it },
                        keyboardOptions = KeyboardOptions(capitalization = KeyboardCapitalization.Characters),
                        textStyle = TextStyle(color = colors.green, fontFamily = WatermelonMono, fontSize = 11.5.sp),
                        cursorBrush = SolidColor(colors.green),
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(100.dp)
                            .clip(RoundedCornerShape(6.dp))
                            .background(colors.surface2)
                            .border(1.dp, colors.line, RoundedCornerShape(6.dp))
                            .padding(8.dp)
                    )
                }
            },
            confirmButton = {
                Button(
                    onClick = {
                        val trimmedCode = editingCheatCode.trim()
                        if (editingCheatName.isNotBlank() && trimmedCode.isNotBlank()) {
                            val newCode = JusrcheatCode(
                                name = editingCheatName.trim(),
                                note = editingCheatNote.trim(),
                                codeHexLines = trimmedCode,
                                enabled = true
                            )
                            if (romInfo != null) {
                                coroutineScope.launch {
                                    jusrcheatRepo.attachCheatToActiveRom(
                                        romInfo = romInfo,
                                        sourceGameId = editingGameId.ifBlank { "CUSTOM" },
                                        cheat = newCode,
                                        enable = true
                                    )
                                    onCheatAttached()
                                    Toast.makeText(context, context.getString(R.string.v791_jusrcheat_attached_success), Toast.LENGTH_SHORT).show()
                                }
                            }
                        }
                        showEditDialog = false
                    },
                    colors = ButtonDefaults.buttonColors(backgroundColor = colors.green)
                ) {
                    Text(
                        text = stringResource(R.string.v791_jusrcheat_btn_save),
                        color = onAccent,
                        fontFamily = SpaceGrotesk,
                        fontWeight = FontWeight.Bold
                    )
                }
            },
            dismissButton = {
                OutlinedButton(onClick = { showEditDialog = false }) {
                    Text(
                        text = stringResource(R.string.v791_jusrcheat_btn_cancel),
                        color = colors.text2,
                        fontFamily = SpaceGrotesk
                    )
                }
            },
            backgroundColor = colors.surface
        )
    }
}

@Composable
private fun RegionFilterChip(
    text: String,
    isSelected: Boolean,
    onClick: () -> Unit,
    colors: me.magnum.melonds.ui.theme.WatermelonColors,
    accentGlow: Boolean = false
) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(8.dp))
            .background(
                if (isSelected) colors.green.copy(alpha = 0.25f)
                else if (accentGlow) colors.surface3
                else colors.surface2
            )
            .border(
                1.dp,
                if (isSelected) colors.green else if (accentGlow) colors.green.copy(alpha = 0.5f) else colors.line,
                RoundedCornerShape(8.dp)
            )
            .clickable(onClick = onClick)
            .padding(horizontal = 10.dp, vertical = 5.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text,
            color = if (isSelected || accentGlow) colors.green else colors.text2,
            fontFamily = SpaceGrotesk,
            fontSize = 11.5.sp,
            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium
        )
    }
}

@Composable
private fun FolderCheatsGroup(
    folder: me.magnum.melonds.common.cheats.jusrcheat.JusrcheatFolder,
    sourceGameId: String,
    romInfo: RomInfo?,
    jusrcheatRepo: JusrcheatRepository,
    colors: me.magnum.melonds.ui.theme.WatermelonColors,
    onAccent: Color,
    attachedCheatsState: MutableMap<String, Boolean>,
    onCheatAttached: () -> Unit,
    onCopy: (String) -> Unit,
    onEdit: (JusrcheatCode) -> Unit
) {
    var isFolderExpanded by remember { mutableStateOf(false) }
    val coroutineScope = rememberCoroutineScope()
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(8.dp))
            .background(colors.surface3)
            .border(1.dp, colors.line, RoundedCornerShape(8.dp))
            .padding(8.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .clickable { isFolderExpanded = !isFolderExpanded }
        ) {
            Icon(
                imageVector = Icons.Filled.Folder,
                contentDescription = null,
                tint = colors.green,
                modifier = Modifier.size(16.dp)
            )
            Spacer(Modifier.width(6.dp))
            Text(
                text = folder.name,
                color = colors.text,
                fontFamily = SpaceGrotesk,
                fontSize = 12.5.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.weight(1f)
            )
            if (folder.oneHot) {
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(4.dp))
                        .background(colors.green.copy(alpha = 0.15f))
                        .padding(horizontal = 4.dp, vertical = 1.dp)
                ) {
                    Text(
                        text = stringResource(R.string.v791_jusrcheat_one_hot_badge),
                        color = colors.green,
                        fontFamily = WatermelonMono,
                        fontSize = 8.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
                Spacer(Modifier.width(6.dp))
            }
            if (romInfo != null) {
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(4.dp))
                        .background(colors.surface2)
                        .clickable {
                            coroutineScope.launch {
                                jusrcheatRepo.attachFolderToActiveRom(
                                    romInfo = romInfo,
                                    sourceGameId = sourceGameId,
                                    folder = folder,
                                    enableAll = false
                                )
                                onCheatAttached()
                                Toast.makeText(
                                    context,
                                    context.getString(R.string.v791_jusrcheat_attached_success),
                                    Toast.LENGTH_SHORT
                                ).show()
                            }
                        }
                        .padding(horizontal = 6.dp, vertical = 2.dp)
                ) {
                    Text(
                        text = stringResource(R.string.v791_jusrcheat_btn_attach_folder),
                        color = colors.green,
                        fontFamily = SpaceGrotesk,
                        fontSize = 9.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            Spacer(Modifier.width(4.dp))
            Icon(
                imageVector = if (isFolderExpanded) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
                contentDescription = null,
                tint = colors.text3,
                modifier = Modifier.size(18.dp)
            )
        }

        AnimatedVisibility(visible = isFolderExpanded) {
            Column(modifier = Modifier.padding(top = 6.dp)) {
                for (cheat in folder.cheats) {
                    CheatItemRow(
                        cheat = cheat,
                        sourceGameId = sourceGameId,
                        romInfo = romInfo,
                        jusrcheatRepo = jusrcheatRepo,
                        colors = colors,
                        onAccent = onAccent,
                        attachedCheatsState = attachedCheatsState,
                        onCheatAttached = onCheatAttached,
                        onCopy = onCopy,
                        onEdit = onEdit
                    )
                    Spacer(Modifier.height(4.dp))
                }
            }
        }
    }
}

@Composable
private fun CheatItemRow(
    cheat: JusrcheatCode,
    sourceGameId: String,
    romInfo: RomInfo?,
    jusrcheatRepo: JusrcheatRepository,
    colors: me.magnum.melonds.ui.theme.WatermelonColors,
    onAccent: Color,
    attachedCheatsState: MutableMap<String, Boolean>,
    onCheatAttached: () -> Unit,
    onCopy: (String) -> Unit,
    onEdit: (JusrcheatCode) -> Unit
) {
    val coroutineScope = rememberCoroutineScope()
    val context = LocalContext.current
    var showCodeLines by remember { mutableStateOf(false) }

    val cheatKey = "${sourceGameId}_${cheat.name}"
    val isEnabled = attachedCheatsState[cheatKey] ?: cheat.enabled

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(8.dp))
            .background(colors.surface)
            .border(1.dp, if (isEnabled) colors.green.copy(alpha = 0.5f) else colors.line, RoundedCornerShape(8.dp))
            .padding(8.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .clickable { showCodeLines = !showCodeLines }
            ) {
                Text(
                    text = cheat.name,
                    color = colors.text,
                    fontFamily = SpaceGrotesk,
                    fontSize = 12.5.sp,
                    fontWeight = if (isEnabled) FontWeight.Bold else FontWeight.Medium
                )
                if (cheat.note.isNotBlank()) {
                    Text(
                        text = cheat.note,
                        color = colors.text3,
                        fontFamily = SpaceGrotesk,
                        fontSize = 10.5.sp,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            }

            Spacer(Modifier.width(6.dp))

            // Action Buttons: Copy, Edit, Enable Switch
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = Icons.Filled.ContentCopy,
                    contentDescription = stringResource(R.string.v791_jusrcheat_code_copied),
                    tint = colors.text3,
                    modifier = Modifier
                        .size(18.dp)
                        .clickable { onCopy(cheat.getFormattedCode()) }
                )
                Spacer(Modifier.width(6.dp))
                Icon(
                    imageVector = Icons.Filled.Edit,
                    contentDescription = stringResource(R.string.v791_jusrcheat_edit_cheat_title),
                    tint = colors.text3,
                    modifier = Modifier
                        .size(18.dp)
                        .clickable { onEdit(cheat) }
                )
                Spacer(Modifier.width(6.dp))

                if (romInfo != null) {
                    Switch(
                        checked = isEnabled,
                        onCheckedChange = { checked ->
                            attachedCheatsState[cheatKey] = checked
                            coroutineScope.launch {
                                jusrcheatRepo.attachCheatToActiveRom(
                                    romInfo = romInfo,
                                    sourceGameId = sourceGameId,
                                    cheat = cheat,
                                    enable = checked
                                )
                                onCheatAttached()
                                Toast.makeText(
                                    context,
                                    context.getString(R.string.v791_jusrcheat_attached_success),
                                    Toast.LENGTH_SHORT
                                ).show()
                            }
                        },
                        colors = SwitchDefaults.colors(
                            checkedThumbColor = colors.green,
                            checkedTrackColor = colors.green.copy(alpha = 0.5f),
                            uncheckedThumbColor = colors.text3,
                            uncheckedTrackColor = colors.line
                        ),
                        modifier = Modifier.size(36.dp)
                    )
                }
            }
        }

        // Expandable Raw Action Replay Code Display
        AnimatedVisibility(visible = showCodeLines) {
            Column(modifier = Modifier.padding(top = 6.dp)) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(6.dp))
                        .background(colors.surface2)
                        .padding(6.dp)
                ) {
                    Text(
                        text = cheat.getFormattedCode().ifBlank { "00000000 00000000" },
                        color = colors.green,
                        fontFamily = WatermelonMono,
                        fontSize = 10.sp
                    )
                }
            }
        }
    }
}

package me.magnum.melonds.ui.emulator.ui

import android.widget.Toast
import androidx.activity.compose.BackHandler
import androidx.compose.animation.AnimatedVisibility
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
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Icon
import androidx.compose.material.Switch
import androidx.compose.material.SwitchDefaults
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material.icons.filled.Folder
import androidx.compose.material.icons.filled.Language
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import me.magnum.melonds.R
import me.magnum.melonds.common.cheats.jusrcheat.JusrcheatCode
import me.magnum.melonds.common.cheats.jusrcheat.JusrcheatGame
import me.magnum.melonds.common.cheats.jusrcheat.JusrcheatRepository
import me.magnum.melonds.domain.model.Cheat
import me.magnum.melonds.domain.model.CheatFolder
import me.magnum.melonds.domain.model.Game
import me.magnum.melonds.domain.model.RomInfo
import me.magnum.melonds.domain.repositories.CheatsRepository
import me.magnum.melonds.impl.RoomCheatsRepository
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.ui.theme.WatermelonMono
import me.magnum.melonds.ui.theme.watermelon

@Composable
fun CheatsOverlay(
    romInfo: RomInfo,
    cheatsRepository: CheatsRepository,
    onCheatsUpdated: () -> Unit,
    onDismiss: () -> Unit,
    onResumeGame: (() -> Unit)? = null,
) {
    val context = LocalContext.current
    val colors = watermelon
    val onAccent = if (colors.isDark) Color.Black else Color.White
    val coroutineScope = rememberCoroutineScope()

    val jusrcheatRepo = remember {
        cheatsRepository.getJusrcheatRepository()
            ?: (cheatsRepository as? RoomCheatsRepository)?.jusrcheatRepository
            ?: run {
                val db = me.magnum.melonds.di.entrypoint.CheatsEntryPoint.resolve(context).database()
                JusrcheatRepository.getInstance(context, db)
            }
    }

    var game by remember { mutableStateOf<Game?>(null) }
    var folders by remember { mutableStateOf<List<CheatFolder>>(emptyList()) }
    val folderCheatsMap = remember { mutableStateMapOf<Long, List<Cheat>>() }
    val expandedFolders = remember { mutableStateMapOf<Long, Boolean>() }
    var isLoading by remember { mutableStateOf(true) }
    var activeOverlayTab by remember { mutableIntStateOf(0) }

    // Cross-region games (e.g. VACE for Russian VACV)
    var crossRegionGames by remember { mutableStateOf<List<JusrcheatGame>>(emptyList()) }
    val crossRegionExpanded = remember { mutableStateMapOf<String, Boolean>() }

    fun reloadCurrentCheats() {
        coroutineScope.launch {
            isLoading = true
            val resolvedGame = cheatsRepository.findGameForRom(romInfo)
            game = resolvedGame
            if (resolvedGame != null) {
                val loadedFolders = cheatsRepository.getAllGameCheats(resolvedGame).firstOrNull() ?: emptyList()
                folders = loadedFolders
                loadedFolders.forEach { folder ->
                    val folderId = folder.id ?: 0L
                    if (!expandedFolders.containsKey(folderId)) {
                        expandedFolders[folderId] = true
                    }
                    coroutineScope.launch {
                        val cheats = cheatsRepository.getFolderCheats(folder).firstOrNull() ?: emptyList()
                        folderCheatsMap[folderId] = cheats
                    }
                }
            }
            isLoading = false
        }
    }

    LaunchedEffect(romInfo) {
        reloadCurrentCheats()

        withContext(Dispatchers.IO) {
            jusrcheatRepo.ensureInitialized()
            val matches = jusrcheatRepo.findCrossRegionFamily(romInfo.gameCode)
                .filter { !it.gameId.equals(romInfo.gameCode, ignoreCase = true) }
            val loaded = matches.mapNotNull { jusrcheatRepo.loadGame(it) }
            crossRegionGames = loaded
            // Expand first cross-region game by default if current ROM has 0 cheats
            if (folders.isEmpty() && loaded.isNotEmpty()) {
                crossRegionExpanded[loaded.first().gameId] = true
            }
        }
    }

    val totalCheatsCount = folderCheatsMap.values.sumOf { it.size }
    val enabledCheatsCount = folderCheatsMap.values.sumOf { list -> list.count { it.enabled } }

    BackHandler { onDismiss() }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black.copy(alpha = if (colors.isDark) 0.82f else 0.65f))
            .focusProperties { canFocus = false }
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null,
            ) { onDismiss() }
            .onPreviewKeyEvent { event ->
                if (event.type == KeyEventType.KeyDown && (event.key == Key.ButtonB || event.key == Key.Back || event.key == Key.Escape)) {
                    onDismiss()
                    true
                } else {
                    false
                }
            },
        contentAlignment = Alignment.BottomCenter,
    ) {
        Column(
            modifier = Modifier
                .widthIn(max = 760.dp)
                .fillMaxWidth()
                .navigationBarsPadding()
                .padding(bottom = 16.dp)
                .focusProperties { canFocus = false }
                .clickable(
                    interactionSource = remember { MutableInteractionSource() },
                    indication = null,
                ) { /* consume clicks */ },
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
                            .padding(start = 16.dp, end = 16.dp, top = 14.dp, bottom = 10.dp),
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.ic_cheat),
                            contentDescription = null,
                            tint = colors.green,
                            modifier = Modifier.size(22.dp),
                        )
                        Spacer(Modifier.width(10.dp))
                        Column(modifier = Modifier.weight(1f)) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text(
                                    text = stringResource(R.string.cheats),
                                    color = colors.text,
                                    fontFamily = SpaceGrotesk,
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.SemiBold,
                                )
                                if (enabledCheatsCount > 0) {
                                    Spacer(Modifier.width(8.dp))
                                    Box(
                                        modifier = Modifier
                                            .clip(RoundedCornerShape(4.dp))
                                            .background(colors.green.copy(alpha = 0.2f))
                                            .padding(horizontal = 6.dp, vertical = 2.dp),
                                    ) {
                                        Text(
                                            text = "$enabledCheatsCount АКТИВНО",
                                            color = colors.green,
                                            fontFamily = WatermelonMono,
                                            fontSize = 9.sp,
                                            fontWeight = FontWeight.Bold,
                                        )
                                    }
                                }
                            }
                            Text(
                                text = "${romInfo.gameTitle.ifBlank { romInfo.gameName }} [${romInfo.gameCode}]",
                                color = colors.text3,
                                fontFamily = WatermelonMono,
                                fontSize = 10.5.sp,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }
                        if (onResumeGame != null) {
                            Spacer(Modifier.width(8.dp))
                            Box(
                                modifier = Modifier
                                    .clip(RoundedCornerShape(8.dp))
                                    .background(colors.surface2)
                                    .border(1.dp, colors.green.copy(alpha = 0.5f), RoundedCornerShape(8.dp))
                                    .clickable(onClick = onResumeGame)
                                    .padding(horizontal = 10.dp, vertical = 5.dp),
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
                                        fontSize = 11.5.sp,
                                        fontWeight = FontWeight.Bold,
                                    )
                                }
                            }
                        }
                    }

                    // 3-Tab Switcher: 1) Game Cheats, 2) Jusrcheat (all games), 3) RAM Scanner
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp, vertical = 4.dp),
                        horizontalArrangement = Arrangement.spacedBy(6.dp),
                    ) {
                        TabHeaderButton(
                            title = stringResource(R.string.v791_jusrcheat_tab_game_cheats),
                            isSelected = activeOverlayTab == 0,
                            onClick = { activeOverlayTab = 0 },
                            modifier = Modifier.weight(1f),
                            colors = colors
                        )
                        TabHeaderButton(
                            title = stringResource(R.string.v791_jusrcheat_tab_all_games),
                            isSelected = activeOverlayTab == 1,
                            onClick = { activeOverlayTab = 1 },
                            modifier = Modifier.weight(1.25f),
                            colors = colors
                        )
                        TabHeaderButton(
                            title = stringResource(R.string.v790_ram_cheat_finder_tab),
                            isSelected = activeOverlayTab == 2,
                            onClick = { activeOverlayTab = 2 },
                            modifier = Modifier.weight(1f),
                            colors = colors
                        )
                    }

                    Box(
                        Modifier
                            .fillMaxWidth()
                            .height(1.dp)
                            .background(colors.line)
                    )

                    // Content Area
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f),
                    ) {
                        when (activeOverlayTab) {
                            0 -> {
                                // Tab 0: Current ROM cheats + Automatic Cross-Region block
                                if (isLoading) {
                                    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                                        CircularProgressIndicator(color = colors.green, modifier = Modifier.size(36.dp))
                                    }
                                } else {
                                    LazyColumn(
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .padding(horizontal = 14.dp),
                                        contentPadding = PaddingValues(vertical = 10.dp),
                                        verticalArrangement = Arrangement.spacedBy(8.dp),
                                    ) {
                                        // 1. Cross-Region Family Banner and Cheats (e.g. VACE USA for Russian VACV)
                                        if (crossRegionGames.isNotEmpty()) {
                                            item(key = "cross_region_header_card") {
                                                Column(
                                                    modifier = Modifier
                                                        .fillMaxWidth()
                                                        .clip(RoundedCornerShape(12.dp))
                                                        .background(colors.green.copy(alpha = 0.12f))
                                                        .border(1.dp, colors.green.copy(alpha = 0.4f), RoundedCornerShape(12.dp))
                                                        .padding(12.dp)
                                                ) {
                                                    Row(verticalAlignment = Alignment.CenterVertically) {
                                                        Icon(
                                                            imageVector = Icons.Filled.Language,
                                                            contentDescription = null,
                                                            tint = colors.green,
                                                            modifier = Modifier.size(20.dp)
                                                        )
                                                        Spacer(Modifier.width(8.dp))
                                                        Text(
                                                            text = stringResource(R.string.v791_jusrcheat_cross_region_title),
                                                            color = colors.green,
                                                            fontFamily = SpaceGrotesk,
                                                            fontWeight = FontWeight.Bold,
                                                            fontSize = 13.5.sp
                                                        )
                                                    }
                                                    Spacer(Modifier.height(4.dp))
                                                    Text(
                                                        text = stringResource(
                                                            R.string.v791_jusrcheat_cross_region_desc,
                                                            crossRegionGames.joinToString(", ") { "${it.gameId} (${it.title.take(28)}...)" }
                                                        ),
                                                        color = colors.text2,
                                                        fontFamily = SpaceGrotesk,
                                                        fontSize = 11.5.sp
                                                    )
                                                }
                                            }

                                            // Render Cross-Region Games entries
                                            crossRegionGames.forEach { crGame ->
                                                val isCrExpanded = crossRegionExpanded[crGame.gameId] ?: false
                                                item(key = "cr_game_${crGame.gameId}") {
                                                    Column(
                                                        modifier = Modifier
                                                            .fillMaxWidth()
                                                            .clip(RoundedCornerShape(10.dp))
                                                            .background(colors.surface2)
                                                            .border(1.dp, colors.green.copy(alpha = 0.5f), RoundedCornerShape(10.dp))
                                                            .padding(10.dp)
                                                    ) {
                                                        Row(
                                                            verticalAlignment = Alignment.CenterVertically,
                                                            modifier = Modifier
                                                                .fillMaxWidth()
                                                                .clickable {
                                                                    crossRegionExpanded[crGame.gameId] = !isCrExpanded
                                                                }
                                                        ) {
                                                            Icon(
                                                                imageVector = Icons.Filled.Language,
                                                                contentDescription = null,
                                                                tint = colors.green,
                                                                modifier = Modifier.size(18.dp)
                                                            )
                                                            Spacer(Modifier.width(8.dp))
                                                            Column(modifier = Modifier.weight(1f)) {
                                                                Text(
                                                                    text = "${crGame.title} [${crGame.gameId}]",
                                                                    color = colors.text,
                                                                    fontFamily = SpaceGrotesk,
                                                                    fontWeight = FontWeight.SemiBold,
                                                                    fontSize = 13.sp
                                                                )
                                                                Text(
                                                                    text = "${crGame.totalCheatsCount} кодов доступно для подключения",
                                                                    color = colors.green,
                                                                    fontFamily = WatermelonMono,
                                                                    fontSize = 10.sp
                                                                )
                                                            }
                                                            Icon(
                                                                imageVector = if (isCrExpanded) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
                                                                contentDescription = null,
                                                                tint = colors.text2,
                                                                modifier = Modifier.size(20.dp)
                                                            )
                                                        }

                                                        AnimatedVisibility(visible = isCrExpanded) {
                                                            Column(modifier = Modifier.padding(top = 8.dp)) {
                                                                // Cross-region game items
                                                                crGame.directCheats.forEach { cheat ->
                                                                    CrossRegionCheatRow(
                                                                        cheat = cheat,
                                                                        sourceGameId = crGame.gameId,
                                                                        romInfo = romInfo,
                                                                        jusrcheatRepo = jusrcheatRepo,
                                                                        colors = colors,
                                                                        onCheatAttached = {
                                                                            reloadCurrentCheats()
                                                                            onCheatsUpdated()
                                                                        }
                                                                    )
                                                                    Spacer(Modifier.height(4.dp))
                                                                }

                                                                crGame.folders.forEach { folder ->
                                                                    Text(
                                                                        text = folder.name,
                                                                        color = colors.green,
                                                                        fontFamily = SpaceGrotesk,
                                                                        fontWeight = FontWeight.Bold,
                                                                        fontSize = 12.sp,
                                                                        modifier = Modifier.padding(vertical = 4.dp)
                                                                    )
                                                                    folder.cheats.forEach { cheat ->
                                                                        CrossRegionCheatRow(
                                                                            cheat = cheat,
                                                                            sourceGameId = crGame.gameId,
                                                                            romInfo = romInfo,
                                                                            jusrcheatRepo = jusrcheatRepo,
                                                                            colors = colors,
                                                                            onCheatAttached = {
                                                                                reloadCurrentCheats()
                                                                                onCheatsUpdated()
                                                                            }
                                                                        )
                                                                        Spacer(Modifier.height(4.dp))
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }

                                        // 2. Standard Current ROM Cheats
                                        if (folders.isEmpty() && crossRegionGames.isEmpty()) {
                                            item {
                                                Box(
                                                    Modifier
                                                        .fillMaxWidth()
                                                        .padding(32.dp),
                                                    contentAlignment = Alignment.Center
                                                ) {
                                                    Text(
                                                        text = "Чит-коды для этой игры не найдены в базе.\nОткройте вкладку «Jusrcheat (все игры)», чтобы выбрать коды из 4079 игр!",
                                                        color = colors.text3,
                                                        fontFamily = SpaceGrotesk,
                                                        fontSize = 13.sp,
                                                        textAlign = androidx.compose.ui.text.style.TextAlign.Center
                                                    )
                                                }
                                            }
                                        } else {
                                            folders.forEach { folder ->
                                                val folderId = folder.id ?: 0L
                                                val cheats = folderCheatsMap[folderId].orEmpty()
                                                val isExpanded = expandedFolders[folderId] ?: true

                                                item(key = "folder_$folderId") {
                                                    Row(
                                                        verticalAlignment = Alignment.CenterVertically,
                                                        modifier = Modifier
                                                            .fillMaxWidth()
                                                            .clip(RoundedCornerShape(10.dp))
                                                            .background(colors.surface2)
                                                            .border(1.dp, colors.line, RoundedCornerShape(10.dp))
                                                            .clickable {
                                                                expandedFolders[folderId] = !isExpanded
                                                            }
                                                            .padding(horizontal = 14.dp, vertical = 10.dp),
                                                    ) {
                                                        Icon(
                                                            imageVector = Icons.Filled.Folder,
                                                            contentDescription = null,
                                                            tint = colors.green,
                                                            modifier = Modifier.size(20.dp),
                                                        )
                                                        Spacer(Modifier.width(10.dp))
                                                        Text(
                                                            text = folder.name,
                                                            color = colors.text,
                                                            fontFamily = SpaceGrotesk,
                                                            fontSize = 14.sp,
                                                            fontWeight = FontWeight.SemiBold,
                                                            modifier = Modifier.weight(1f),
                                                        )
                                                        Text(
                                                            text = "${cheats.size}",
                                                            color = colors.text3,
                                                            fontFamily = WatermelonMono,
                                                            fontSize = 12.sp,
                                                        )
                                                        Spacer(Modifier.width(8.dp))
                                                        Icon(
                                                            imageVector = if (isExpanded) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
                                                            contentDescription = null,
                                                            tint = colors.text3,
                                                            modifier = Modifier.size(20.dp),
                                                        )
                                                    }
                                                }

                                                if (isExpanded) {
                                                    items(cheats, key = { "${folderId}_${it.id ?: it.hashCode()}" }) { cheat ->
                                                        Row(
                                                            verticalAlignment = Alignment.CenterVertically,
                                                            modifier = Modifier
                                                                .fillMaxWidth()
                                                                .padding(start = 12.dp)
                                                                .clip(RoundedCornerShape(8.dp))
                                                                .background(colors.surface2.copy(alpha = 0.6f))
                                                                .border(1.dp, colors.line.copy(alpha = 0.5f), RoundedCornerShape(8.dp))
                                                                .padding(horizontal = 12.dp, vertical = 8.dp),
                                                        ) {
                                                            Column(modifier = Modifier.weight(1f)) {
                                                                Text(
                                                                    text = cheat.name,
                                                                    color = colors.text,
                                                                    fontFamily = SpaceGrotesk,
                                                                    fontSize = 13.5.sp,
                                                                    fontWeight = if (cheat.enabled) FontWeight.SemiBold else FontWeight.Normal,
                                                                )
                                                                if (!cheat.description.isNullOrBlank()) {
                                                                    Text(
                                                                        text = cheat.description,
                                                                        color = colors.text3,
                                                                        fontSize = 11.sp,
                                                                        maxLines = 2,
                                                                        overflow = TextOverflow.Ellipsis,
                                                                    )
                                                                }
                                                            }
                                                            Spacer(Modifier.width(10.dp))
                                                            Switch(
                                                                checked = cheat.enabled,
                                                                onCheckedChange = { isChecked ->
                                                                    coroutineScope.launch {
                                                                        val updatedCheat = cheat.copy(enabled = isChecked)
                                                                        cheatsRepository.updateCheat(updatedCheat)
                                                                        val currentList = folderCheatsMap[folderId].orEmpty()
                                                                        folderCheatsMap[folderId] = currentList.map {
                                                                            if (it.id == cheat.id) updatedCheat else it
                                                                        }
                                                                        onCheatsUpdated()
                                                                    }
                                                                },
                                                                colors = SwitchDefaults.colors(
                                                                    checkedThumbColor = colors.green,
                                                                    checkedTrackColor = colors.green.copy(alpha = 0.5f),
                                                                    uncheckedThumbColor = colors.text3,
                                                                    uncheckedTrackColor = colors.line,
                                                                ),
                                                            )
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }

                            1 -> {
                                // Tab 1: Full Jusrcheat Browser (All 4079+ games)
                                JusrcheatAllGamesTab(
                                    romInfo = romInfo,
                                    cheatsRepository = cheatsRepository,
                                    onCheatAttached = {
                                        reloadCurrentCheats()
                                        onCheatsUpdated()
                                    }
                                )
                            }

                            2 -> {
                                // Tab 2: RAM Cheat Finder
                                RamCheatFinderTab(
                                    romInfo = romInfo,
                                    cheatsRepository = cheatsRepository,
                                    onCheatCreated = {
                                        reloadCurrentCheats()
                                        onCheatsUpdated()
                                    },
                                )
                            }
                        }
                    }
                }
            }

            // Unified Bottom Center Back Arrow
            me.magnum.melonds.ui.common.UnifiedBackButton(
                onClick = onDismiss,
                modifier = Modifier.align(Alignment.CenterHorizontally),
            )
        }
    }
}

@Composable
private fun TabHeaderButton(
    title: String,
    isSelected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    colors: me.magnum.melonds.ui.theme.WatermelonColors
) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(8.dp))
            .background(if (isSelected) colors.green.copy(alpha = 0.22f) else colors.surface2)
            .border(
                1.dp,
                if (isSelected) colors.green else colors.line,
                RoundedCornerShape(8.dp),
            )
            .clickable(onClick = onClick)
            .padding(vertical = 7.dp, horizontal = 4.dp),
        contentAlignment = Alignment.Center,
    ) {
        Text(
            text = title,
            color = if (isSelected) colors.green else colors.text2,
            fontFamily = SpaceGrotesk,
            fontSize = 11.5.sp,
            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
    }
}

@Composable
private fun CrossRegionCheatRow(
    cheat: JusrcheatCode,
    sourceGameId: String,
    romInfo: RomInfo,
    jusrcheatRepo: JusrcheatRepository,
    colors: me.magnum.melonds.ui.theme.WatermelonColors,
    onCheatAttached: () -> Unit
) {
    var isEnabled by remember { mutableStateOf(cheat.enabled) }
    val coroutineScope = rememberCoroutineScope()
    val context = LocalContext.current

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(6.dp))
            .background(colors.surface)
            .border(1.dp, if (isEnabled) colors.green.copy(alpha = 0.4f) else colors.line, RoundedCornerShape(6.dp))
            .padding(horizontal = 8.dp, vertical = 6.dp)
    ) {
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = cheat.name,
                color = colors.text,
                fontFamily = SpaceGrotesk,
                fontSize = 12.sp,
                fontWeight = if (isEnabled) FontWeight.SemiBold else FontWeight.Normal
            )
            if (cheat.note.isNotBlank()) {
                Text(
                    text = cheat.note,
                    color = colors.text3,
                    fontFamily = SpaceGrotesk,
                    fontSize = 10.sp,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
        Spacer(Modifier.width(6.dp))
        Switch(
            checked = isEnabled,
            onCheckedChange = { checked ->
                isEnabled = checked
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
            modifier = Modifier.size(32.dp)
        )
    }
}

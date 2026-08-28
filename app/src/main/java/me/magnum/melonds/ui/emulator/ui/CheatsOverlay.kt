package me.magnum.melonds.ui.emulator.ui

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material.icons.filled.Folder
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.*
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.launch
import me.magnum.melonds.R
import me.magnum.melonds.domain.model.Cheat
import me.magnum.melonds.domain.model.CheatFolder
import me.magnum.melonds.domain.model.Game
import me.magnum.melonds.domain.model.RomInfo
import me.magnum.melonds.domain.repositories.CheatsRepository
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
    val colors = watermelon
    val coroutineScope = rememberCoroutineScope()
    var game by remember { mutableStateOf<Game?>(null) }
    var folders by remember { mutableStateOf<List<CheatFolder>>(emptyList()) }
    val folderCheatsMap = remember { mutableStateMapOf<Long, List<Cheat>>() }
    val expandedFolders = remember { mutableStateMapOf<Long, Boolean>() }
    var isLoading by remember { mutableStateOf(true) }

    LaunchedEffect(romInfo) {
        isLoading = true
        val resolvedGame = cheatsRepository.findGameForRom(romInfo)
        game = resolvedGame
        if (resolvedGame != null) {
            val loadedFolders = cheatsRepository.getAllGameCheats(resolvedGame).firstOrNull() ?: emptyList()
            folders = loadedFolders
            loadedFolders.forEach { folder ->
                val folderId = folder.id ?: 0L
                expandedFolders[folderId] = true
                coroutineScope.launch {
                    val cheats = cheatsRepository.getFolderCheats(folder).firstOrNull() ?: emptyList()
                    folderCheatsMap[folderId] = cheats
                }
            }
        }
        isLoading = false
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
                if (event.type == KeyEventType.KeyDown && (event.key == Key.ButtonB || event.key == Key.Back)) {
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
                            .padding(start = 16.dp, end = 16.dp, top = 14.dp, bottom = 12.dp),
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
                                text = romInfo.gameTitle.ifBlank { romInfo.gameName },
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
                                        text = "В игру",
                                        color = colors.green,
                                        fontFamily = SpaceGrotesk,
                                        fontSize = 11.5.sp,
                                        fontWeight = FontWeight.Bold,
                                    )
                                }
                            }
                        }
                    }

                    Box(Modifier.fillMaxWidth().height(1.dp).background(colors.line))

                    // Content Area
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f)
                            .padding(horizontal = 14.dp),
                    ) {
                        if (isLoading) {
                            Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                                CircularProgressIndicator(color = colors.green, modifier = Modifier.size(36.dp))
                            }
                        } else if (folders.isEmpty() || totalCheatsCount == 0) {
                            Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                                Text(
                                    text = "Чит-коды для этой игры не найдены в базе",
                                    color = colors.text3,
                                    fontFamily = SpaceGrotesk,
                                    fontSize = 14.sp,
                                )
                            }
                        } else {
                            LazyColumn(
                                modifier = Modifier.fillMaxSize(),
                                contentPadding = PaddingValues(vertical = 12.dp),
                                verticalArrangement = Arrangement.spacedBy(8.dp),
                            ) {
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
                                                fontSize = 12.sp,
                                            )
                                            Spacer(Modifier.width(6.dp))
                                            Icon(
                                                imageVector = if (isExpanded) Icons.Filled.ExpandMore else Icons.Filled.ChevronRight,
                                                contentDescription = null,
                                                tint = colors.text3,
                                                modifier = Modifier.size(18.dp),
                                            )
                                        }
                                    }

                                    if (isExpanded) {
                                        items(cheats, key = { "cheat_${it.id ?: it.hashCode()}" }) { cheat ->
                                            val cheatId = cheat.id ?: 0L
                                            Row(
                                                verticalAlignment = Alignment.CenterVertically,
                                                modifier = Modifier
                                                    .fillMaxWidth()
                                                    .padding(start = 12.dp)
                                                    .clip(RoundedCornerShape(10.dp))
                                                    .background(colors.surface2.copy(alpha = 0.6f))
                                                    .border(1.dp, colors.line, RoundedCornerShape(10.dp))
                                                    .clickable {
                                                        coroutineScope.launch {
                                                            val updatedCheat = cheat.copy(enabled = !cheat.enabled)
                                                            cheatsRepository.updateCheat(updatedCheat)
                                                            val currentList = folderCheatsMap[folderId].orEmpty()
                                                            folderCheatsMap[folderId] = currentList.map {
                                                                if (it.id == cheat.id) updatedCheat else it
                                                            }
                                                            onCheatsUpdated()
                                                        }
                                                    }
                                                    .padding(horizontal = 14.dp, vertical = 10.dp),
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
            }

            // Unified Bottom Center Back Arrow
            me.magnum.melonds.ui.common.UnifiedBackButton(
                onClick = onDismiss,
                modifier = Modifier.align(Alignment.CenterHorizontally),
            )
        }
    }
}

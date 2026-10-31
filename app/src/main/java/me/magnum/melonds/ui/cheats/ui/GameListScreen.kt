package me.magnum.melonds.ui.cheats.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bolt
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.magnum.melonds.R
import me.magnum.melonds.domain.model.Game
import me.magnum.melonds.domain.model.RomInfo
import me.magnum.melonds.domain.repositories.CheatsRepository
import me.magnum.melonds.ui.cheats.model.CheatsScreenUiState
import me.magnum.melonds.ui.cheats.ui.item.GameItem
import me.magnum.melonds.ui.emulator.ui.JusrcheatAllGamesTab
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.ui.theme.watermelon

@Composable
fun GameListScreen(
    modifier: Modifier,
    contentPadding: PaddingValues,
    games: CheatsScreenUiState<List<Game>>,
    onGameClick: (Game) -> Unit,
    cheatsRepository: CheatsRepository? = null,
    romInfo: RomInfo? = null,
) {
    val colors = watermelon
    var activeTab by remember { mutableIntStateOf(0) } // 0: Library / Room, 1: Jusrcheat

    Column(modifier = modifier.consumeWindowInsets(contentPadding)) {
        if (cheatsRepository != null) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = contentPadding.calculateStartPadding(LocalLayoutDirection.current) + 16.dp,
                        top = contentPadding.calculateTopPadding() + 8.dp,
                        end = contentPadding.calculateEndPadding(LocalLayoutDirection.current) + 16.dp,
                        bottom = 8.dp
                    ),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .clip(RoundedCornerShape(8.dp))
                        .background(if (activeTab == 0) colors.green.copy(alpha = 0.22f) else colors.surface2)
                        .border(1.dp, if (activeTab == 0) colors.green else colors.line, RoundedCornerShape(8.dp))
                        .clickable { activeTab = 0 }
                        .padding(vertical = 8.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Сохранённые (${(games as? CheatsScreenUiState.Ready)?.data?.size ?: 0})",
                        color = if (activeTab == 0) colors.green else colors.text2,
                        fontFamily = SpaceGrotesk,
                        fontSize = 12.sp,
                        fontWeight = if (activeTab == 0) FontWeight.Bold else FontWeight.Medium
                    )
                }

                Box(
                    modifier = Modifier
                        .weight(1.3f)
                        .clip(RoundedCornerShape(8.dp))
                        .background(if (activeTab == 1) colors.green.copy(alpha = 0.22f) else colors.surface2)
                        .border(1.dp, if (activeTab == 1) colors.green else colors.line, RoundedCornerShape(8.dp))
                        .clickable { activeTab = 1 }
                        .padding(vertical = 8.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = stringResource(R.string.v791_jusrcheat_tab_all_games),
                        color = if (activeTab == 1) colors.green else colors.text2,
                        fontFamily = SpaceGrotesk,
                        fontSize = 12.sp,
                        fontWeight = if (activeTab == 1) FontWeight.Bold else FontWeight.Medium
                    )
                }
            }
        }

        if (activeTab == 1 && cheatsRepository != null) {
            JusrcheatAllGamesTab(
                romInfo = romInfo,
                cheatsRepository = cheatsRepository,
                onCheatAttached = {},
                modifier = Modifier.fillMaxSize()
            )
        } else {
            when (games) {
                is CheatsScreenUiState.Loading -> LoadingScreen(modifier = Modifier.fillMaxSize())
                is CheatsScreenUiState.Ready -> {
                    if (games.data.isEmpty()) {
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(24.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Text(
                                    text = stringResource(R.string.no_cheats_found),
                                    color = colors.text3,
                                    fontFamily = SpaceGrotesk,
                                    fontSize = 14.sp,
                                    textAlign = TextAlign.Center
                                )
                                if (cheatsRepository != null) {
                                    Spacer(Modifier.height(14.dp))
                                    Box(
                                        modifier = Modifier
                                            .clip(RoundedCornerShape(8.dp))
                                            .background(colors.green)
                                            .clickable { activeTab = 1 }
                                            .padding(horizontal = 16.dp, vertical = 9.dp),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Row(verticalAlignment = Alignment.CenterVertically) {
                                            Icon(
                                                Icons.Filled.Bolt,
                                                contentDescription = null,
                                                tint = if (colors.isDark) Color.Black else Color.White,
                                                modifier = Modifier.size(16.dp)
                                            )
                                            Spacer(Modifier.width(6.dp))
                                            Text(
                                                text = stringResource(R.string.v791_jusrcheat_open_browser_btn),
                                                color = if (colors.isDark) Color.Black else Color.White,
                                                fontFamily = SpaceGrotesk,
                                                fontWeight = FontWeight.Bold,
                                                fontSize = 12.sp
                                            )
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        LazyColumn(
                            modifier = Modifier.fillMaxSize(),
                            verticalArrangement = Arrangement.spacedBy(8.dp),
                            contentPadding = PaddingValues(
                                start = contentPadding.calculateStartPadding(LocalLayoutDirection.current) + 16.dp,
                                top = 4.dp,
                                end = contentPadding.calculateEndPadding(LocalLayoutDirection.current) + 16.dp,
                                bottom = contentPadding.calculateBottomPadding() + 16.dp,
                            ),
                        ) {
                            items(games.data) {
                                GameItem(
                                    modifier = Modifier.fillMaxWidth(),
                                    game = it,
                                    onClick = { onGameClick(it) },
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

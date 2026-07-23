package me.magnum.melonds.ui.cheats.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import me.magnum.melonds.R
import me.magnum.melonds.domain.model.Game
import me.magnum.melonds.ui.cheats.model.CheatsScreenUiState
import me.magnum.melonds.ui.cheats.ui.item.GameItem

@Composable
fun GameListScreen(
    modifier: Modifier,
    contentPadding: PaddingValues,
    games: CheatsScreenUiState<List<Game>>,
    onGameClick: (Game) -> Unit,
) {
    when (games) {
        is CheatsScreenUiState.Loading -> LoadingScreen(modifier.padding(contentPadding))
        is CheatsScreenUiState.Ready -> List(
            modifier = modifier,
            contentPadding = contentPadding,
            games = games.data,
            onGameClick = onGameClick,
        )
    }
}

@Composable
private fun List(
    modifier: Modifier,
    contentPadding: PaddingValues,
    games: List<Game>,
    onGameClick: (Game) -> Unit,
) {
    if (games.isEmpty()) {
        Box(modifier = modifier.padding(contentPadding)) {
            Text(
                modifier = Modifier.padding(24.dp).align(Alignment.Center),
                text = stringResource(R.string.no_cheats_found),
                textAlign = TextAlign.Center,
            )
        }
    } else {
        LazyColumn(
            modifier = modifier.consumeWindowInsets(contentPadding),
            verticalArrangement = androidx.compose.foundation.layout.Arrangement.spacedBy(8.dp),
            contentPadding = PaddingValues(
                start = contentPadding.calculateStartPadding(androidx.compose.ui.platform.LocalLayoutDirection.current) + 16.dp,
                top = contentPadding.calculateTopPadding() + 12.dp,
                end = contentPadding.calculateEndPadding(androidx.compose.ui.platform.LocalLayoutDirection.current) + 16.dp,
                bottom = contentPadding.calculateBottomPadding() + 16.dp,
            ),
        ) {
            items(games) {
                GameItem(
                    modifier = Modifier.fillMaxWidth(),
                    game = it,
                    onClick = { onGameClick(it) },
                )
            }
        }
    }
}
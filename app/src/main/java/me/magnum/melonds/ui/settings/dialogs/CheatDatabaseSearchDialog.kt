package me.magnum.melonds.ui.settings.dialogs

import android.app.Dialog
import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.SportsEsports
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay
import me.magnum.melonds.R
import me.magnum.melonds.domain.model.CheatGameSearchResult
import me.magnum.melonds.ui.theme.AppThemeManager
import me.magnum.melonds.ui.theme.LocalWatermelonColors
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.ui.theme.WatermelonMono

fun showCheatDatabaseSearchDialog(
    context: Context,
    totalGamesCount: Int,
    onSearch: suspend (String) -> List<CheatGameSearchResult>,
): Dialog {
    val colors = AppThemeManager.getCurrentWatermelonColors(context)
    return showSettingsComposeDialog(context) { dismiss ->
        CompositionLocalProvider(LocalWatermelonColors provides colors) {
            CheatDatabaseSearchDialogContent(
                totalGamesCount = totalGamesCount,
                onSearch = onSearch,
                onDismiss = dismiss,
            )
        }
    }
}

@Composable
fun CheatDatabaseSearchDialogContent(
    totalGamesCount: Int,
    onSearch: suspend (String) -> List<CheatGameSearchResult>,
    onDismiss: () -> Unit,
) {
    val colors = LocalWatermelonColors.current
    var query by remember { mutableStateOf("") }
    var results by remember { mutableStateOf<List<CheatGameSearchResult>>(emptyList()) }
    var isSearching by remember { mutableStateOf(totalGamesCount > 0) }

    LaunchedEffect(query, totalGamesCount) {
        if (totalGamesCount <= 0) {
            results = emptyList()
            isSearching = false
            return@LaunchedEffect
        }
        isSearching = true
        if (query.isNotEmpty()) {
            delay(150)
        }
        results = onSearch(query)
        isSearching = false
    }

    SettingsDialogScaffold(
        title = stringResource(R.string.cheats_search_database_title),
        subtitle = if (totalGamesCount > 0) {
            stringResource(R.string.cheats_search_games_available, totalGamesCount)
        } else {
            stringResource(R.string.cheats_search_database_summary)
        },
        icon = Icons.Filled.Search,
        onDismiss = onDismiss,
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 14.dp, vertical = 12.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp),
        ) {
            // Search Input Box
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(12.dp))
                    .background(colors.surface2)
                    .border(
                        width = 1.2.dp,
                        color = if (query.isNotEmpty()) colors.green.copy(alpha = 0.7f) else colors.line,
                        shape = RoundedCornerShape(12.dp),
                    )
                    .padding(horizontal = 12.dp, vertical = 11.dp),
            ) {
                Icon(
                    imageVector = Icons.Filled.Search,
                    contentDescription = null,
                    tint = colors.green,
                    modifier = Modifier.size(18.dp),
                )
                Spacer(Modifier.width(10.dp))
                Box(modifier = Modifier.weight(1f)) {
                    if (query.isEmpty()) {
                        Text(
                            text = stringResource(R.string.cheats_db_search_hint),
                            color = colors.text3,
                            fontFamily = SpaceGrotesk,
                            fontSize = 14.sp,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                    BasicTextField(
                        value = query,
                        onValueChange = { query = it },
                        textStyle = TextStyle(
                            color = colors.text,
                            fontFamily = SpaceGrotesk,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Medium,
                        ),
                        cursorBrush = SolidColor(colors.green),
                        singleLine = true,
                        modifier = Modifier.fillMaxWidth(),
                    )
                }
                if (query.isNotEmpty()) {
                    Spacer(Modifier.width(8.dp))
                    Icon(
                        imageVector = Icons.Filled.Close,
                        contentDescription = null,
                        tint = colors.text3,
                        modifier = Modifier
                            .size(18.dp)
                            .clickable { query = "" },
                    )
                }
            }

            // Results / Empty State Area
            when {
                totalGamesCount <= 0 -> {
                    CheatSearchEmptyState(
                        message = stringResource(R.string.cheats_search_db_empty),
                        isDatabaseEmpty = true,
                    )
                }
                isSearching && results.isEmpty() -> {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(160.dp),
                        contentAlignment = Alignment.Center,
                    ) {
                        CircularProgressIndicator(
                            color = colors.green,
                            strokeWidth = 2.5.dp,
                            modifier = Modifier.size(28.dp),
                        )
                    }
                }
                results.isEmpty() -> {
                    CheatSearchEmptyState(
                        message = stringResource(R.string.cheats_search_no_results),
                        isDatabaseEmpty = false,
                    )
                }
                else -> {
                    Text(
                        text = stringResource(R.string.cheats_search_results_count, results.size),
                        color = colors.text3,
                        fontFamily = WatermelonMono,
                        fontSize = 11.sp,
                        modifier = Modifier.padding(horizontal = 2.dp),
                    )
                    LazyColumn(
                        verticalArrangement = Arrangement.spacedBy(8.dp),
                        contentPadding = PaddingValues(bottom = 4.dp),
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f, fill = false)
                            .heightIn(min = 140.dp),
                    ) {
                        items(
                            items = results,
                            key = { "${it.gameId}_${it.gameCode}" },
                        ) { item ->
                            CheatSearchResultRow(item = item)
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun CheatSearchResultRow(
    item: CheatGameSearchResult,
) {
    val colors = LocalWatermelonColors.current
    val shape = RoundedCornerShape(12.dp)

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .clip(shape)
            .background(colors.surface2)
            .border(1.dp, colors.line, shape)
            .padding(horizontal = 12.dp, vertical = 10.dp),
    ) {
        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.spacedBy(4.dp),
        ) {
            Text(
                text = item.gameName,
                color = colors.text,
                fontFamily = SpaceGrotesk,
                fontSize = 13.5.sp,
                fontWeight = FontWeight.SemiBold,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
            )
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                if (item.gameCode.isNotBlank()) {
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(6.dp))
                            .background(colors.greenDim)
                            .border(0.8.dp, colors.green.copy(alpha = 0.5f), RoundedCornerShape(6.dp))
                            .padding(horizontal = 6.dp, vertical = 2.dp),
                    ) {
                        Text(
                            text = item.gameCode,
                            color = colors.green,
                            fontFamily = WatermelonMono,
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                        )
                    }
                }
                Text(
                    text = stringResource(R.string.cheats_search_cheats_count, item.cheatCount),
                    color = colors.text2,
                    fontFamily = SpaceGrotesk,
                    fontSize = 12.sp,
                )
            }
        }
    }
}

@Composable
private fun CheatSearchEmptyState(
    message: String,
    isDatabaseEmpty: Boolean,
) {
    val colors = LocalWatermelonColors.current

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(14.dp))
            .background(colors.surface2.copy(alpha = 0.7f))
            .border(1.dp, colors.line, RoundedCornerShape(14.dp))
            .padding(horizontal = 20.dp, vertical = 28.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(10.dp),
    ) {
        Icon(
            imageVector = if (isDatabaseEmpty) Icons.Filled.SportsEsports else Icons.Filled.Info,
            contentDescription = null,
            tint = colors.text3,
            modifier = Modifier.size(30.dp),
        )
        Text(
            text = message,
            color = colors.text2,
            fontFamily = SpaceGrotesk,
            fontSize = 13.5.sp,
            textAlign = TextAlign.Center,
            lineHeight = 19.sp,
        )
    }
}

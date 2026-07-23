package me.magnum.melonds.ui.cheats.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Divider
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.PlaylistAdd
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import me.magnum.melonds.R
import me.magnum.melonds.domain.model.Cheat
import me.magnum.melonds.ui.cheats.model.CheatFormDialogState
import me.magnum.melonds.ui.cheats.model.CheatSubmissionForm
import me.magnum.melonds.ui.cheats.model.CheatsScreenUiState
import me.magnum.melonds.ui.cheats.ui.cheatform.CheatFormDialog
import me.magnum.melonds.ui.cheats.ui.item.CheatItem

@Composable
fun CheatListScreen(
    modifier: Modifier,
    contentPadding: PaddingValues,
    cheats: CheatsScreenUiState<List<Cheat>>,
    onCheatClick: (Cheat) -> Unit,
    onAddNewCheat: (CheatSubmissionForm) -> Unit,
    onUpdateCheat: (Cheat, CheatSubmissionForm) -> Unit,
    onDeleteCheatClick: (Cheat) -> Unit,
) {
    when (cheats) {
        is CheatsScreenUiState.Loading -> LoadingScreen(modifier.padding(contentPadding))
        is CheatsScreenUiState.Ready -> List(
            modifier = modifier,
            contentPadding = contentPadding,
            cheats = cheats.data,
            onCheatClick = onCheatClick,
            onAddNewCheat = onAddNewCheat,
            onUpdateCheat = onUpdateCheat,
            onDeleteCheatClick = onDeleteCheatClick,
        )
    }
}

@Composable
private fun List(
    modifier: Modifier,
    contentPadding: PaddingValues,
    cheats: List<Cheat>,
    onCheatClick: (Cheat) -> Unit,
    onAddNewCheat: (CheatSubmissionForm) -> Unit,
    onUpdateCheat: (Cheat, CheatSubmissionForm) -> Unit,
    onDeleteCheatClick: (Cheat) -> Unit,
) {
    var cheatFormDialogState by rememberSaveable(stateSaver = CheatFormDialogState.Saver) { mutableStateOf(CheatFormDialogState.Hidden) }

    Box(modifier) {
        if (cheats.isEmpty()) {
            Text(
                modifier = Modifier.padding(contentPadding).padding(24.dp).align(Alignment.Center),
                text = stringResource(R.string.folder_is_empty),
                textAlign = TextAlign.Center,
            )
        } else {
            LazyColumn(
                modifier = modifier.consumeWindowInsets(contentPadding),
                verticalArrangement = androidx.compose.foundation.layout.Arrangement.spacedBy(8.dp),
                contentPadding = PaddingValues(
                    start = contentPadding.calculateStartPadding(LocalLayoutDirection.current) + 16.dp,
                    top = contentPadding.calculateTopPadding() + 12.dp,
                    end = contentPadding.calculateEndPadding(LocalLayoutDirection.current) + 16.dp,
                    bottom = contentPadding.calculateBottomPadding() + 16.dp + 56.dp + 16.dp, // Take FAB into consideration
                ),
            ) {
                itemsIndexed(
                    items = cheats,
                    key = { _, item -> item.id ?: item.code },
                ) { _, item ->
                    CheatItem(
                        modifier = Modifier.fillMaxWidth(),
                        cheat = item,
                        onClick = { onCheatClick(item) },
                        onEditClick = { cheatFormDialogState = CheatFormDialogState.EditCheat(item) },
                        onDeleteClick = { onDeleteCheatClick(item) },
                    )
                }

                item(key = "cheats_footer_note") {
                    Text(
                        text = stringResource(R.string.cheats_footer_note),
                        color = me.magnum.melonds.ui.theme.watermelon.text3,
                        fontFamily = me.magnum.melonds.ui.theme.WatermelonMono,
                        fontSize = androidx.compose.ui.unit.TextUnit(9f, androidx.compose.ui.unit.TextUnitType.Sp),
                        letterSpacing = androidx.compose.ui.unit.TextUnit(0.5f, androidx.compose.ui.unit.TextUnitType.Sp),
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth().padding(top = 16.dp, start = 16.dp, end = 16.dp),
                    )
                }
            }
        }

        FloatingActionButton(
            modifier = Modifier.align(Alignment.BottomEnd)
                .padding(
                    bottom = contentPadding.calculateBottomPadding() + 16.dp,
                    end = contentPadding.calculateEndPadding(LocalLayoutDirection.current) + 16.dp,
                ),
            onClick = { cheatFormDialogState = CheatFormDialogState.NewCheat },
        ) {
            Icon(
                painter = rememberVectorPainter(Icons.AutoMirrored.Filled.PlaylistAdd),
                contentDescription = stringResource(R.string.add_cheat_folder),
            )
        }
    }

    CheatFormDialog(
        state = cheatFormDialogState,
        onDismiss = { cheatFormDialogState = CheatFormDialogState.Hidden },
        onSaveCheat = {
            val dialogState = cheatFormDialogState
            if (dialogState == CheatFormDialogState.NewCheat) {
                onAddNewCheat(it)
            } else if (dialogState is CheatFormDialogState.EditCheat) {
                onUpdateCheat(dialogState.cheat, it)
            }
            cheatFormDialogState = CheatFormDialogState.Hidden
        },
    )
}
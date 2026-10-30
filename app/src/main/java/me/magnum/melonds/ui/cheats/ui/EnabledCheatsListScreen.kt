package me.magnum.melonds.ui.cheats.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.AlertDialog
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.magnum.melonds.R
import me.magnum.melonds.domain.model.CheatInFolder
import me.magnum.melonds.ui.cheats.model.CheatsScreenUiState
import me.magnum.melonds.ui.cheats.ui.item.CheatInFolderItem
import me.magnum.melonds.ui.theme.watermelon

@Composable
fun EnabledCheatsListScreen(
    modifier: Modifier,
    contentPadding: PaddingValues,
    cheats: CheatsScreenUiState<List<CheatInFolder>>,
    onCheatClick: (CheatInFolder) -> Unit,
    onDisableAllCheats: () -> Unit = {},
) {
    when (cheats) {
        is CheatsScreenUiState.Loading -> LoadingScreen(modifier.padding(contentPadding))
        is CheatsScreenUiState.Ready -> List(
            modifier = modifier,
            contentPadding = contentPadding,
            cheats = cheats.data,
            onCheatClick = onCheatClick,
            onDisableAllCheats = onDisableAllCheats,
        )
    }
}

@Composable
private fun List(
    modifier: Modifier,
    contentPadding: PaddingValues,
    cheats: List<CheatInFolder>,
    onCheatClick: (CheatInFolder) -> Unit,
    onDisableAllCheats: () -> Unit = {},
) {
    var showDisableAllConfirmDialog by remember { mutableStateOf(false) }

    if (cheats.isEmpty()) {
        Box(modifier = modifier.padding(contentPadding)) {
            Text(
                modifier = Modifier.padding(24.dp).align(Alignment.Center),
                text = stringResource(R.string.no_enabled_cheats_for_rom),
                textAlign = TextAlign.Center,
            )
        }
    } else {
        LazyColumn(
            modifier = modifier.consumeWindowInsets(contentPadding),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            contentPadding = PaddingValues(
                start = contentPadding.calculateStartPadding(androidx.compose.ui.platform.LocalLayoutDirection.current) + 16.dp,
                top = contentPadding.calculateTopPadding() + 12.dp,
                end = contentPadding.calculateEndPadding(androidx.compose.ui.platform.LocalLayoutDirection.current) + 16.dp,
                bottom = contentPadding.calculateBottomPadding() + 16.dp,
            ),
        ) {
            item(key = "disable_all_cheats_bar") {
                Row(
                    modifier = Modifier.fillMaxWidth().padding(bottom = 4.dp),
                    horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    OutlinedButton(
                        onClick = { showDisableAllConfirmDialog = true },
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.outlinedButtonColors(
                            backgroundColor = watermelon.surface,
                            contentColor = watermelon.red,
                        ),
                        border = BorderStroke(1.dp, watermelon.red.copy(alpha = 0.5f)),
                    ) {
                        Text(
                            text = stringResource(R.string.cheats_disable_all),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = watermelon.red,
                        )
                    }
                }
            }

            items(
                items = cheats,
                key = { it.cheat.id ?: it.cheat.code },
            ) {
                CheatInFolderItem(
                    modifier = Modifier.fillMaxWidth(),
                    cheatInFolder = it,
                    onClick = { onCheatClick(it) },
                )
            }
        }

        if (showDisableAllConfirmDialog) {
            AlertDialog(
                onDismissRequest = { showDisableAllConfirmDialog = false },
                backgroundColor = watermelon.surface,
                title = {
                    Text(
                        text = stringResource(R.string.cheats_disable_all_confirm_title),
                        color = watermelon.text,
                        fontWeight = FontWeight.Bold,
                    )
                },
                text = {
                    Text(
                        text = stringResource(R.string.cheats_disable_all_confirm_message),
                        color = watermelon.text2,
                        fontSize = 14.sp,
                    )
                },
                confirmButton = {
                    TextButton(
                        onClick = {
                            showDisableAllConfirmDialog = false
                            onDisableAllCheats()
                        }
                    ) {
                        Text(
                            text = stringResource(R.string.cheats_disable_all),
                            color = watermelon.red,
                            fontWeight = FontWeight.SemiBold,
                        )
                    }
                },
                dismissButton = {
                    TextButton(
                        onClick = { showDisableAllConfirmDialog = false }
                    ) {
                        Text(
                            text = stringResource(android.R.string.cancel),
                            color = watermelon.text3,
                        )
                    }
                }
            )
        }
    }
}

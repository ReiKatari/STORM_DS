package me.magnum.melonds.ui.romdetails.ui

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.dp
import me.magnum.melonds.ui.romdetails.model.OfflineAchievementsUiState

@Composable
fun RomOfflineAchievementsUi(
    modifier: Modifier,
    contentPadding: PaddingValues,
    offlineAchievementsUiState: OfflineAchievementsUiState,
    onSyncOfflineNow: () -> Unit,
) {
    Column(
        modifier = modifier
            .verticalScroll(rememberScrollState())
            .padding(
                start = contentPadding.calculateStartPadding(LocalLayoutDirection.current),
                end = contentPadding.calculateEndPadding(LocalLayoutDirection.current),
            ),
    ) {
        OfflineAchievementsStatusUi(
            modifier = Modifier.fillMaxWidth(),
            state = offlineAchievementsUiState,
            onSyncNow = onSyncOfflineNow,
        )
        Spacer(Modifier.height(contentPadding.calculateBottomPadding() + 16.dp))
    }
}

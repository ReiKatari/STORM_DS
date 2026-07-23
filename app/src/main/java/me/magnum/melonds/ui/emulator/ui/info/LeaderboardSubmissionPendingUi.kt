package me.magnum.melonds.ui.emulator.ui.info

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import me.magnum.melonds.R
import me.magnum.melonds.ui.emulator.ui.AchievementInfo

@Composable
internal fun LeaderboardSubmissionPendingUi(
    info: AchievementInfo.LeaderboardSubmissionPending,
) {
    AchievementInfoUi(
        modifier = Modifier.padding(8.dp),
        iconData = info.gameIcon,
        state = info.state,
    ) {
        Column(Modifier.padding(start = 4.dp)) {
            Text(
                text = stringResource(R.string.leaderboard_submission_pending),
                style = MaterialTheme.typography.caption.copy(fontWeight = FontWeight.Bold),
                maxLines = 1,
            )
            Text(
                text = info.title,
                style = MaterialTheme.typography.caption,
                maxLines = 1,
            )
            Text(
                text = info.trackerDisplay.ifBlank { "--" },
                style = MaterialTheme.typography.caption,
                maxLines = 1,
            )
        }
    }
}

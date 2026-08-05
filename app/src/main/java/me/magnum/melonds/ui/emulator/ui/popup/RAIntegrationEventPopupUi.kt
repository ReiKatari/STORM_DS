package me.magnum.melonds.ui.emulator.ui.popup

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.material.icons.filled.SportsEsports
import androidx.compose.material.icons.filled.Warning
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import me.magnum.melonds.R
import me.magnum.melonds.ui.emulator.model.RAIntegrationEvent
import me.magnum.melonds.ui.theme.DarkWatermelonColors

@Composable
fun RAIntegrationEventUi(modifier: Modifier, event: RAIntegrationEvent) {
    val icon = event.icon?.toString()
    when (event) {
        is RAIntegrationEvent.Welcome -> {
            WatermelonRaCard(
                modifier = modifier,
                iconUrl = icon,
                iconShape = RaAvatarShape,
                eyebrowIcon = Icons.Filled.EmojiEvents,
                eyebrow = stringResource(R.string.ra_welcome_eyebrow),
                title = stringResource(R.string.ra_welcome_title, event.username),
                subtitle = stringResource(
                    if (event.hardcore) R.string.ra_welcome_hardcore else R.string.ra_welcome_softcore,
                ),
            )
        }
        is RAIntegrationEvent.Loaded -> {
            WatermelonRaCard(
                modifier = modifier,
                iconUrl = icon,
                eyebrowIcon = Icons.Filled.SportsEsports,
                eyebrow = stringResource(R.string.ra_now_playing),
                title = stringResource(R.string.achievements_loaded),
                subtitle = stringResource(
                    R.string.ra_achievements_progress,
                    event.unlockedAchievements,
                    event.totalAchievements,
                ),
            )
        }
        is RAIntegrationEvent.LoadedNoAchievements -> {
            WatermelonRaCard(
                modifier = modifier,
                iconUrl = icon,
                eyebrowIcon = Icons.Filled.SportsEsports,
                eyebrow = stringResource(R.string.ra_now_playing),
                title = stringResource(R.string.game_has_no_achievements),
                subtitle = stringResource(R.string.ra_no_achievements),
            )
        }
        is RAIntegrationEvent.Failed -> {
            WatermelonRaCard(
                modifier = modifier,
                iconUrl = icon,
                eyebrowIcon = Icons.Filled.Warning,
                eyebrow = stringResource(R.string.ra_welcome_eyebrow),
                title = stringResource(R.string.achievements_failed_load),
                subtitle = stringResource(R.string.achievements_failed_load_tip),
                subtitleMaxLines = 2,
                accent = DarkWatermelonColors.red,
            )
        }
        is RAIntegrationEvent.LoginExpired -> {
            WatermelonRaCard(
                modifier = modifier,
                iconUrl = icon,
                eyebrowIcon = Icons.Filled.Warning,
                eyebrow = stringResource(R.string.ra_welcome_eyebrow),
                title = stringResource(R.string.achievements_login_expired),
                subtitle = stringResource(R.string.achievements_login_expired_tip),
                subtitleMaxLines = 2,
                accent = DarkWatermelonColors.red,
            )
        }
        is RAIntegrationEvent.OfflineDisabledNoCache -> {
            WatermelonRaCard(
                modifier = modifier,
                iconUrl = icon,
                eyebrowIcon = Icons.Filled.Warning,
                eyebrow = stringResource(R.string.ra_welcome_eyebrow),
                title = stringResource(R.string.offline_ra_disabled_no_cache_title),
                subtitle = stringResource(R.string.offline_ra_disabled_no_cache_message),
                subtitleMaxLines = 2,
                accent = DarkWatermelonColors.red,
            )
        }
    }
}

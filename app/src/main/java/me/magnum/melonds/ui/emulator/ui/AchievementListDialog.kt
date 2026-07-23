package me.magnum.melonds.ui.emulator.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.LocalContentColor
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.SportsEsports
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.compose.ui.window.DialogWindowProvider
import me.magnum.melonds.R
import me.magnum.melonds.ui.emulator.EmulatorRetroAchievementsViewModel
import me.magnum.melonds.ui.theme.MelonTheme
import me.magnum.melonds.ui.theme.WatermelonMono
import me.magnum.melonds.ui.theme.watermelon

@Composable
fun AchievementListDialog(
    viewModel: EmulatorRetroAchievementsViewModel,
    onDismiss: () -> Unit,
    onAchievementFocused: (me.magnum.melonds.ui.common.achievements.ui.model.AchievementUiModel) -> Unit = {},
) {
    Dialog(
        properties = DialogProperties(usePlatformDefaultWidth = false),
        onDismissRequest = onDismiss,
    ) {
        (LocalView.current.parent as DialogWindowProvider).window.setDimAmount(0.8f)

        val achievementListState by viewModel.uiState.collectAsState()

        var detailAchievement by remember {
            mutableStateOf<Pair<me.magnum.melonds.ui.common.achievements.ui.model.AchievementUiModel, Boolean>?>(null)
        }

        LaunchedEffect(Unit) {
            // Perform a load immediately so that the last achievement data is discarded. This is to ensure that the latest up-to-date data is displayed and
            // that if the user has loaded a new ROM, then the achievements of the new ROM are loaded
            viewModel.retryLoadAchievements()
        }

        // Force dark colors here because the background will be dark
        MelonTheme(isDarkTheme = true) {
            val colors = watermelon
            CompositionLocalProvider(LocalContentColor provides MaterialTheme.colors.onSurface) {
              Box(Modifier.fillMaxSize().background(colors.bg)) {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .systemBarsPadding(),
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .width(58.dp)
                            .fillMaxHeight()
                            .padding(top = 8.dp, bottom = 12.dp),
                    ) {
                        Box(
                            modifier = Modifier
                                .size(36.dp)
                                .clip(CircleShape)
                                .clickable(onClick = onDismiss),
                            contentAlignment = Alignment.Center,
                        ) {
                            Icon(
                                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                                contentDescription = stringResource(R.string.cancel),
                                tint = colors.text,
                                modifier = Modifier.size(19.dp),
                            )
                        }
                        Box(Modifier.weight(1f))
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.spacedBy(10.dp),
                        ) {
                            RailHint(icon = { Icon(Icons.Filled.SportsEsports, null, tint = colors.text3, modifier = Modifier.size(15.dp)) }, label = "NAV")
                            RailHint(button = "A", label = stringResource(R.string.pause_hint_accept).uppercase())
                            RailHint(button = "B", label = stringResource(R.string.pause_hint_back).uppercase())
                        }
                    }
                    Box(Modifier.width(1.dp).fillMaxHeight().background(colors.line))

                    Box(Modifier.weight(1f).fillMaxHeight(), contentAlignment = Alignment.TopCenter) {
                        AchievementList(
                            modifier = Modifier.fillMaxSize().widthIn(max = 760.dp),
                            state = achievementListState,
                            onAchievementSelected = { model, inLedger -> detailAchievement = model to inLedger },
                            onViewLeaderboard = viewModel::viewLeaderboard,
                            onLoadLeaderboardRanking = viewModel::getLeaderboardRanking,
                            onRetry = viewModel::retryLoadAchievements,
                            onDismiss = onDismiss,
                            onAchievementFocused = onAchievementFocused,
                        )
                    }
                }

                detailAchievement?.let { (model, inLedger) ->
                    AchievementDetailOverlay(
                        achievementModel = model,
                        isInOfflineLedger = inLedger,
                        onClose = { detailAchievement = null },
                    )
                }
              }
            }
        }
    }
}

@Composable
private fun RailHint(
    label: String,
    button: String? = null,
    icon: (@Composable () -> Unit)? = null,
) {
    val colors = watermelon
    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(2.dp)) {
        if (icon != null) {
            icon()
        } else if (button != null) {
            Box(
                modifier = Modifier
                    .size(16.dp)
                    .clip(CircleShape)
                    .background(colors.surface2),
                contentAlignment = Alignment.Center,
            ) {
                Text(
                    text = button,
                    color = colors.text3,
                    fontSize = 8.sp,
                    lineHeight = 8.sp,
                    textAlign = TextAlign.Center,
                )
            }
        }
        Text(
            text = label,
            color = colors.text3,
            fontFamily = WatermelonMono,
            fontSize = 7.5.sp,
            lineHeight = 9.sp,
            textAlign = TextAlign.Center,
        )
    }
}

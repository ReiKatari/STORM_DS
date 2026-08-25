package me.magnum.melonds.ui.emulator.ui

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.LocalContentColor
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.compose.ui.window.DialogWindowProvider
import me.magnum.melonds.R
import me.magnum.melonds.ui.common.GamepadHint
import me.magnum.melonds.ui.common.GamepadHintsFooter
import me.magnum.melonds.ui.emulator.EmulatorRetroAchievementsViewModel
import me.magnum.melonds.ui.theme.MelonTheme
import me.magnum.melonds.ui.theme.SpaceGrotesk
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

        BackHandler {
            if (detailAchievement != null) {
                detailAchievement = null
            } else {
                onDismiss()
            }
        }

        LaunchedEffect(Unit) {
            // Perform a load immediately so that the last achievement data is discarded.
            viewModel.retryLoadAchievements()
        }

        // Force dark colors here because the background will be dark
        MelonTheme(isDarkTheme = true) {
            val colors = watermelon
            CompositionLocalProvider(LocalContentColor provides MaterialTheme.colors.onSurface) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Black.copy(alpha = if (colors.isDark) 0.88f else 0.75f)),
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .systemBarsPadding(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        // Main Achievement List Content Area
                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxWidth(),
                            contentAlignment = Alignment.TopCenter,
                        ) {
                            AchievementList(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .widthIn(max = 840.dp),
                                state = achievementListState,
                                onAchievementSelected = { model, inLedger -> detailAchievement = model to inLedger },
                                onViewLeaderboard = viewModel::viewLeaderboard,
                                onLoadLeaderboardRanking = viewModel::getLeaderboardRanking,
                                onRetry = viewModel::retryLoadAchievements,
                                onDismiss = onDismiss,
                                onAchievementFocused = onAchievementFocused,
                            )
                        }

                        // Bottom Navigation and Controls Bar
                        Box(
                            modifier = Modifier
                                .widthIn(max = 840.dp)
                                .fillMaxWidth()
                                .padding(horizontal = 14.dp, vertical = 6.dp)
                                .clip(RoundedCornerShape(16.dp))
                                .background(colors.surface)
                                .border(1.dp, colors.line, RoundedCornerShape(16.dp))
                                .padding(horizontal = 12.dp, vertical = 6.dp),
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier.fillMaxWidth(),
                            ) {
                                Box(
                                    modifier = Modifier
                                        .size(34.dp)
                                        .clip(CircleShape)
                                        .background(colors.surface2)
                                        .border(1.dp, colors.line, CircleShape)
                                        .clickable(onClick = onDismiss),
                                    contentAlignment = Alignment.Center,
                                ) {
                                    Icon(
                                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                                        contentDescription = stringResource(R.string.back),
                                        tint = colors.text,
                                        modifier = Modifier.size(17.dp),
                                    )
                                }

                                Spacer(Modifier.width(10.dp))

                                Text(
                                    text = stringResource(R.string.back),
                                    fontFamily = SpaceGrotesk,
                                    fontWeight = FontWeight.SemiBold,
                                    fontSize = 13.sp,
                                    color = colors.text2,
                                    modifier = Modifier.clickable(onClick = onDismiss),
                                )

                                Spacer(Modifier.weight(1f))

                                GamepadHintsFooter(
                                    hints = listOf(
                                        GamepadHint(null, stringResource(R.string.pause_hint_navigate)),
                                        GamepadHint("A", stringResource(R.string.pause_hint_accept)),
                                        GamepadHint("B", stringResource(R.string.back)),
                                    ),
                                    modifier = Modifier.padding(0.dp),
                                )
                            }
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

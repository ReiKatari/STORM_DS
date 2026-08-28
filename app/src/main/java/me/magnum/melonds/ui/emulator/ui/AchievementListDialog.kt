package me.magnum.melonds.ui.emulator.ui

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusProperties
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.KeyEventType
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.onPreviewKeyEvent
import androidx.compose.ui.input.key.type
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.magnum.melonds.R
import me.magnum.melonds.ui.emulator.EmulatorRetroAchievementsViewModel
import me.magnum.melonds.ui.theme.watermelon

@Composable
fun AchievementListDialog(
    viewModel: EmulatorRetroAchievementsViewModel,
    onDismiss: () -> Unit,
    onAchievementFocused: (me.magnum.melonds.ui.common.achievements.ui.model.AchievementUiModel) -> Unit = {},
    onResumeGame: (() -> Unit)? = null,
) {
    val colors = watermelon
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
        viewModel.retryLoadAchievements()
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black.copy(alpha = if (colors.isDark) 0.82f else 0.65f))
            .focusProperties { canFocus = false }
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null,
            ) { onDismiss() }
            .onPreviewKeyEvent { event ->
                if (event.type == KeyEventType.KeyDown && (event.key == Key.ButtonB || event.key == Key.Back)) {
                    if (detailAchievement != null) {
                        detailAchievement = null
                    } else {
                        onDismiss()
                    }
                    true
                } else {
                    false
                }
            },
        contentAlignment = Alignment.BottomCenter,
    ) {
        Column(
            modifier = Modifier
                .widthIn(max = 840.dp)
                .fillMaxWidth()
                .navigationBarsPadding()
                .padding(bottom = 16.dp)
                .focusProperties { canFocus = false }
                .clickable(
                    interactionSource = remember { MutableInteractionSource() },
                    indication = null,
                    onClick = { /* consume click */ },
                ),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            // Main Panel Card (Achievements List)
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f, fill = false)
                    .fillMaxHeight(0.85f)
                    .padding(horizontal = 14.dp, vertical = 6.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .background(colors.surface)
                    .border(1.dp, colors.line, RoundedCornerShape(20.dp)),
            ) {
                Column(modifier = Modifier.fillMaxSize()) {
                    // Header Bar
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 16.dp, end = 16.dp, top = 14.dp, bottom = 12.dp),
                    ) {
                        Icon(
                            imageVector = Icons.Filled.EmojiEvents,
                            contentDescription = null,
                            tint = colors.green,
                            modifier = Modifier.size(22.dp),
                        )
                        Spacer(Modifier.width(10.dp))
                        Column(modifier = Modifier.weight(1f)) {
                            androidx.compose.material.Text(
                                text = "Достижения",
                                color = colors.text,
                                fontFamily = me.magnum.melonds.ui.theme.SpaceGrotesk,
                                fontSize = 16.sp,
                                fontWeight = androidx.compose.ui.text.font.FontWeight.SemiBold,
                            )
                            androidx.compose.material.Text(
                                text = "RetroAchievements",
                                color = colors.text3,
                                fontSize = 10.5.sp,
                            )
                        }
                        if (onResumeGame != null) {
                            Spacer(Modifier.width(8.dp))
                            Box(
                                modifier = Modifier
                                    .clip(RoundedCornerShape(8.dp))
                                    .background(colors.surface2)
                                    .border(1.dp, colors.green.copy(alpha = 0.5f), RoundedCornerShape(8.dp))
                                    .clickable(onClick = onResumeGame)
                                    .padding(horizontal = 10.dp, vertical = 5.dp),
                                contentAlignment = Alignment.Center,
                            ) {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Icon(
                                        imageVector = Icons.Filled.PlayArrow,
                                        contentDescription = stringResource(R.string.pause_resume),
                                        tint = colors.green,
                                        modifier = Modifier.size(15.dp),
                                    )
                                    Spacer(Modifier.width(4.dp))
                                    androidx.compose.material.Text(
                                        text = "В игру",
                                        color = colors.green,
                                        fontFamily = me.magnum.melonds.ui.theme.SpaceGrotesk,
                                        fontSize = 11.5.sp,
                                        fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                                    )
                                }
                            }
                        }
                    }
                    Box(Modifier.fillMaxWidth().height(1.dp).background(colors.line))

                    AchievementList(
                        modifier = Modifier.weight(1f).fillMaxWidth(),
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

            // Unified Bottom Center Back Arrow
            me.magnum.melonds.ui.common.UnifiedBackButton(
                onClick = onDismiss,
            )
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

package me.magnum.melonds.ui.emulator.ui.popup

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.expandHorizontally
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.unit.sp
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import kotlinx.coroutines.delay
import me.magnum.melonds.R
import me.magnum.melonds.ui.common.MelonPreviewSet
import me.magnum.melonds.ui.theme.MelonTheme
import me.magnum.rcheevosapi.model.RAAchievement
import me.magnum.rcheevosapi.model.RAGameId
import me.magnum.rcheevosapi.model.RASetId
import java.net.URL

private enum class PopupState {
    SHOW_ICON,
    SHOW_TITLE,
    SHOW_DESCRIPTION,
}

@Composable
fun AchievementPopupUi(
    modifier: Modifier,
    achievement: RAAchievement,
) {
    var popupState by remember(achievement) {
        mutableStateOf(PopupState.SHOW_ICON)
    }

    LaunchedEffect(achievement) {
        delay(500)
        popupState = PopupState.SHOW_TITLE
        delay(2000)
        popupState = PopupState.SHOW_DESCRIPTION
    }

    val colors = me.magnum.melonds.ui.theme.DarkWatermelonColors
    Box(
        modifier = modifier
            .padding(16.dp)
            .shadow(12.dp, RoundedCornerShape(13.dp))
            .widthIn(max = 400.dp)
            .clip(RoundedCornerShape(13.dp))
            .background(colors.surface2)
            .border(1.dp, me.magnum.melonds.ui.theme.WatermelonColors.gold.copy(alpha = 0.35f), RoundedCornerShape(13.dp)),
    ) {
        Row(
            modifier = Modifier.padding(8.dp).height(IntrinsicSize.Min),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Box(
                modifier = Modifier
                    .size(42.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(colors.greenDim)
                    .border(1.dp, colors.green, RoundedCornerShape(10.dp)),
            ) {
                AsyncImage(
                    modifier = Modifier.size(42.dp),
                    model = ImageRequest.Builder(LocalContext.current)
                        .data(achievement.badgeUrlUnlocked.toString())
                        .crossfade(false)
                        .build(),
                    placeholder = painterResource(id = R.drawable.ic_trophy),
                    error = painterResource(id = R.drawable.ic_trophy),
                    contentDescription = null,
                )
            }

            AnimatedContent(
                modifier = Modifier.fillMaxHeight(),
                targetState = popupState,
                transitionSpec = {
                    if (targetState == PopupState.SHOW_TITLE) {
                        expandHorizontally(expandFrom = Alignment.Start) togetherWith fadeOut()
                    } else {
                        slideInVertically { it } + fadeIn() togetherWith slideOutVertically { -it } + fadeOut()
                    }
                },
                label = "content-animation",
            ) {
                when (it) {
                    PopupState.SHOW_ICON -> {
                        Box(Modifier.fillMaxHeight())
                    }
                    PopupState.SHOW_TITLE -> {
                        Column(Modifier.padding(start = 10.dp, end = 6.dp), verticalArrangement = androidx.compose.foundation.layout.Arrangement.Center) {
                            Text(
                                text = stringResource(id = R.string.achievement_unlocked).uppercase(),
                                color = me.magnum.melonds.ui.theme.WatermelonColors.gold,
                                fontFamily = me.magnum.melonds.ui.theme.WatermelonMono,
                                fontSize = 9.sp,
                                fontWeight = FontWeight.SemiBold,
                                letterSpacing = 0.8.sp,
                                maxLines = 1,
                            )
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text(
                                    text = achievement.getCleanTitle(),
                                    color = colors.text,
                                    fontFamily = me.magnum.melonds.ui.theme.SpaceGrotesk,
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.SemiBold,
                                    maxLines = 1,
                                    modifier = Modifier.weight(1f, fill = false),
                                )
                                Text(
                                    text = "+${achievement.points}",
                                    color = me.magnum.melonds.ui.theme.WatermelonColors.gold,
                                    fontFamily = me.magnum.melonds.ui.theme.WatermelonMono,
                                    fontSize = 11.sp,
                                    fontWeight = FontWeight.SemiBold,
                                    modifier = Modifier.padding(start = 8.dp),
                                )
                            }
                        }
                    }
                    PopupState.SHOW_DESCRIPTION -> {
                        Text(
                            modifier = Modifier.padding(start = 10.dp, end = 6.dp),
                            text = achievement.description,
                            color = colors.text2,
                            fontSize = 12.sp,
                            lineHeight = 16.sp,
                        )
                    }
                }
            }
        }
    }
}

@Composable
@MelonPreviewSet
private fun PreviewAchievementPopupUi() {
    MelonTheme {
        AchievementPopupUi(
            modifier = Modifier,
            achievement = RAAchievement(
                id = 0,
                gameId = RAGameId(0),
                setId = RASetId(0),
                totalAwardsCasual = 0,
                totalAwardsHardcore = 0,
                title = "Super Achievement",
                description = "Make something amazing happen, IDK. But this a very long and useless description.",
                points = 5,
                displayOrder = 0,
                badgeUrlLocked = URL("http://localhost:80"),
                badgeUrlUnlocked = URL("http://localhost:80"),
                memoryAddress = "",
                type = RAAchievement.Type.CORE,
            )
        )
    }
}

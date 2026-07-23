package me.magnum.melonds.ui.emulator.ui

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.KeyEventType
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.onPreviewKeyEvent
import androidx.compose.ui.input.key.type
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalInspectionMode
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import me.magnum.melonds.R
import me.magnum.melonds.ui.common.GamepadHint
import me.magnum.melonds.ui.common.GamepadHintsFooter
import me.magnum.melonds.ui.common.achievements.ui.model.AchievementUiModel
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.ui.theme.WatermelonColors
import me.magnum.melonds.ui.theme.WatermelonMono
import me.magnum.melonds.ui.theme.watermelon

internal fun AchievementUiModel.isUnlocked(): Boolean = when (this) {
    is AchievementUiModel.RuntimeAchievementUiModel -> runtimeAchievement.userAchievement.isUnlocked
    is AchievementUiModel.UserAchievementUiModel -> userAchievement.isUnlocked
    is AchievementUiModel.PrimedAchievementUiModel -> true
}

private fun AchievementUiModel.progressPair(): Pair<Int, Int>? = when (this) {
    is AchievementUiModel.RuntimeAchievementUiModel ->
        if (runtimeAchievement.hasProgress()) runtimeAchievement.progress to runtimeAchievement.target else null
    else -> null
}

@Composable
fun WatermelonAchievementCard(
    modifier: Modifier,
    achievementModel: AchievementUiModel,
    isInOfflineLedger: Boolean,
    onClick: () -> Unit,
    onFocused: (AchievementUiModel) -> Unit = {},
) {
    val colors = watermelon
    val achievement = achievementModel.actualAchievement()
    val unlocked = achievementModel.isUnlocked()
    val progress = achievementModel.progressPair()
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    val shape = RoundedCornerShape(13.dp)
    androidx.compose.runtime.LaunchedEffect(isFocused) {
        if (isFocused) onFocused(achievementModel)
    }

    Row(
        modifier = modifier
            .clip(shape)
            .background(if (isFocused) colors.surface3 else colors.surface2)
            .let { if (isFocused) it.border(2.dp, colors.red, shape) else it }
            .clickable(interactionSource = interactionSource, indication = null, onClick = onClick)
            .padding(horizontal = 13.dp, vertical = 11.dp),
    ) {
        AchievementBadge(
            badgeUrl = if (unlocked) achievement.badgeUrlUnlocked.toString() else achievement.badgeUrlLocked.toString(),
            size = 42.dp,
        )
        Spacer(Modifier.width(12.dp))
        Column(modifier = Modifier.weight(1f)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = achievement.getCleanTitle(),
                    color = if (unlocked) colors.text else colors.text2,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.SemiBold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.weight(1f, fill = false),
                )
                if (achievement.type == me.magnum.rcheevosapi.model.RAAchievement.Type.UNOFFICIAL) {
                    Spacer(Modifier.width(8.dp))
                    UnofficialBadge()
                }
                if (achievement.isMissable()) {
                    Spacer(Modifier.width(6.dp))
                    Icon(
                        painter = painterResource(id = R.drawable.ic_status_warn),
                        contentDescription = stringResource(R.string.achievement_missable),
                        tint = WatermelonColors.gold,
                        modifier = Modifier.size(13.dp),
                    )
                }
            }
            Text(
                text = achievement.description,
                color = colors.text3,
                fontSize = 11.5.sp,
                lineHeight = 16.sp,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.padding(top = 2.dp),
            )
            if (isInOfflineLedger) {
                Text(
                    text = stringResource(id = R.string.offline_ra_in_ledger_badge),
                    color = colors.green,
                    fontFamily = WatermelonMono,
                    fontSize = 9.sp,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.padding(top = 3.dp),
                )
            }
            if (progress != null) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(top = 7.dp),
                ) {
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .height(4.dp)
                            .clip(RoundedCornerShape(2.dp))
                            .background(colors.surface3),
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth(if (progress.second == 0) 0f else (progress.first.toFloat() / progress.second).coerceIn(0f, 1f))
                                .height(4.dp)
                                .clip(RoundedCornerShape(2.dp))
                                .background(colors.green),
                        )
                    }
                    Spacer(Modifier.width(9.dp))
                    Text(
                        text = stringResource(R.string.achievement_progress, progress.first, progress.second),
                        color = colors.text3,
                        fontFamily = WatermelonMono,
                        fontSize = 9.sp,
                    )
                }
            }
        }
        Spacer(Modifier.width(10.dp))
        Text(
            text = achievement.points.toString(),
            color = WatermelonColors.gold,
            fontFamily = WatermelonMono,
            fontSize = 10.5.sp,
            fontWeight = FontWeight.SemiBold,
        )
    }
}

@Composable
private fun UnofficialBadge() {
    Text(
        text = stringResource(R.string.retro_achievements_unofficial).uppercase(),
        color = WatermelonColors.gold,
        fontFamily = WatermelonMono,
        fontSize = 7.5.sp,
        fontWeight = FontWeight.SemiBold,
        letterSpacing = 0.5.sp,
        modifier = Modifier
            .border(1.dp, WatermelonColors.gold, RoundedCornerShape(4.dp))
            .padding(horizontal = 5.dp, vertical = 1.dp),
    )
}

@Composable
private fun AchievementBadge(
    badgeUrl: String,
    size: androidx.compose.ui.unit.Dp,
) {
    val colors = watermelon
    val shape = RoundedCornerShape((size.value * 0.24f).dp)
    Box(
        modifier = Modifier
            .size(size)
            .clip(shape)
            .background(colors.surface3)
            .border(1.dp, colors.line, shape),
        contentAlignment = Alignment.Center,
    ) {
        if (LocalInspectionMode.current) {
            Icon(Icons.Filled.EmojiEvents, null, tint = colors.text3, modifier = Modifier.size(size * 0.5f))
        } else {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current).data(badgeUrl).crossfade(true).build(),
                contentDescription = null,
                placeholder = painterResource(id = R.drawable.ic_trophy),
                error = painterResource(id = R.drawable.ic_trophy),
                modifier = Modifier.fillMaxSize(),
            )
        }
    }
}

@Composable
fun AchievementDetailOverlay(
    achievementModel: AchievementUiModel,
    isInOfflineLedger: Boolean,
    onClose: () -> Unit,
) {
    val colors = watermelon
    val achievement = achievementModel.actualAchievement()
    val unlocked = achievementModel.isUnlocked()
    val progress = achievementModel.progressPair()

    BackHandler { onClose() }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xE6080709))
            .onPreviewKeyEvent { event ->
                if (event.type == KeyEventType.KeyDown && (event.key == Key.ButtonB || event.key == Key.Back)) {
                    onClose()
                    true
                } else {
                    false
                }
            }
            .clickable(interactionSource = remember { MutableInteractionSource() }, indication = null) { onClose() },
        contentAlignment = Alignment.Center,
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(24.dp)
                .widthIn(max = 400.dp)
                .clip(RoundedCornerShape(18.dp))
                .background(colors.surface)
                .border(1.dp, colors.line, RoundedCornerShape(18.dp))
                .clickable(interactionSource = remember { MutableInteractionSource() }, indication = null) { }
                .padding(horizontal = 22.dp, vertical = 22.dp),
        ) {
            AchievementBadge(
                badgeUrl = if (unlocked) achievement.badgeUrlUnlocked.toString() else achievement.badgeUrlLocked.toString(),
                size = 84.dp,
            )
            Spacer(Modifier.height(14.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = achievement.getCleanTitle(),
                    color = colors.text,
                    fontFamily = SpaceGrotesk,
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.weight(1f, fill = false),
                )
                if (achievement.type == me.magnum.rcheevosapi.model.RAAchievement.Type.UNOFFICIAL) {
                    Spacer(Modifier.width(8.dp))
                    UnofficialBadge()
                }
            }
            Spacer(Modifier.height(8.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                val statusText = if (unlocked) {
                    stringResource(R.string.retro_achievements_unlocked)
                } else {
                    stringResource(R.string.retro_achievements_locked)
                }
                Box(Modifier.size(7.dp).clip(RoundedCornerShape(50)).background(if (unlocked) colors.green else colors.text3))
                Spacer(Modifier.width(6.dp))
                Text(
                    text = statusText.uppercase(),
                    color = if (unlocked) colors.green else colors.text3,
                    fontFamily = WatermelonMono,
                    fontSize = 9.5.sp,
                    fontWeight = FontWeight.SemiBold,
                    letterSpacing = 0.6.sp,
                )
                Spacer(Modifier.width(10.dp))
                Text(
                    text = "· ${achievement.points}",
                    color = WatermelonColors.gold,
                    fontFamily = WatermelonMono,
                    fontSize = 9.5.sp,
                    fontWeight = FontWeight.SemiBold,
                )
                Spacer(Modifier.width(3.dp))
                Text(
                    text = stringResource(R.string.points).uppercase(),
                    color = WatermelonColors.gold,
                    fontFamily = WatermelonMono,
                    fontSize = 8.sp,
                )
            }
            Spacer(Modifier.height(14.dp))
            Text(
                text = achievement.description,
                color = colors.text2,
                fontSize = 13.sp,
                lineHeight = 19.sp,
                textAlign = TextAlign.Center,
            )
            if (progress != null) {
                Spacer(Modifier.height(16.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth(),
                ) {
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .height(6.dp)
                            .clip(RoundedCornerShape(3.dp))
                            .background(colors.surface2),
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth(if (progress.second == 0) 0f else (progress.first.toFloat() / progress.second).coerceIn(0f, 1f))
                                .height(6.dp)
                                .clip(RoundedCornerShape(3.dp))
                                .background(colors.green),
                        )
                    }
                    Spacer(Modifier.width(10.dp))
                    Text(
                        text = stringResource(R.string.achievement_progress, progress.first, progress.second),
                        color = colors.text3,
                        fontFamily = WatermelonMono,
                        fontSize = 10.sp,
                    )
                }
            }
            if (isInOfflineLedger) {
                Spacer(Modifier.height(12.dp))
                Text(
                    text = stringResource(id = R.string.offline_ra_in_ledger_badge),
                    color = colors.green,
                    fontFamily = WatermelonMono,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.SemiBold,
                )
            }
            if (achievement.isMissable()) {
                Spacer(Modifier.height(12.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_status_warn),
                        contentDescription = null,
                        tint = WatermelonColors.gold,
                        modifier = Modifier.size(15.dp),
                    )
                    Spacer(Modifier.width(6.dp))
                    Text(
                        text = stringResource(R.string.achievement_missable_description),
                        color = colors.text3,
                        fontSize = 11.sp,
                        lineHeight = 15.sp,
                    )
                }
            }
            Spacer(Modifier.height(18.dp))
            GamepadHintsFooter(
                hints = listOf(
                    GamepadHint("B", stringResource(R.string.pause_hint_back)),
                ),
                showTopBorder = false,
            )
        }
    }
}

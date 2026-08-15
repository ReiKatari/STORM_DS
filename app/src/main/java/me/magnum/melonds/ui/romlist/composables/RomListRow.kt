package me.magnum.melonds.ui.romlist.composables

import android.text.format.DateUtils
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.combinedClickable
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.ui.draw.scale
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.material.icons.filled.Folder
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.magnum.melonds.R
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.ui.theme.WatermelonColors
import me.magnum.melonds.ui.theme.WatermelonMono
import me.magnum.melonds.ui.theme.watermelon
import kotlin.time.Duration

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun RomListRow(
    rom: Rom,
    coverUrl: String?,
    boxArtUrl: String? = null,
    boxArtLoading: Boolean = false,
    allowConfiguration: Boolean,
    showAchievementBadge: Boolean,
    onClick: () -> Unit,
    onLongPress: () -> Unit,
    onConfigClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val colors = watermelon
    val context = LocalContext.current
    val shape = RoundedCornerShape(8.dp)
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    val isPressed by interactionSource.collectIsPressedAsState()
    val pressScale by animateFloatAsState(
        targetValue = if (isPressed) 0.96f else 1f,
        animationSpec = spring(dampingRatio = Spring.DampingRatioNoBouncy, stiffness = 4000f),
        label = "press",
    )

    Row(
        modifier = modifier
            .fillMaxWidth()
            .scale(pressScale)
            .padding(horizontal = 10.dp, vertical = 2.5.dp)
            .clip(shape)
            .background(colors.surface)
            .border(0.75.dp, colors.line, shape)
            .then(if (isFocused) Modifier.border(2.5.dp, colors.red, shape) else Modifier)
            .combinedClickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick,
                onLongClick = onLongPress,
            )
            .padding(horizontal = 10.dp, vertical = 7.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        // 1. Column 1: Box Art with fixed-position badges
        Box(
            modifier = Modifier
                .width(48.dp)
                .aspectRatio(DsBoxArtAspectRatio)
                .clip(RoundedCornerShape(6.dp)),
        ) {
            WatermelonRomArt(
                rom = rom,
                boxArtUrl = boxArtUrl,
                raCoverUrl = coverUrl,
                initialsFontSize = 18.sp,
                boxArtLoading = boxArtLoading,
                modifier = Modifier.fillMaxSize(),
            )
            if (rom.isFavorite) {
                Box(
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(2.dp)
                        .clip(CircleShape)
                        .background(Color.Black.copy(alpha = 0.65f))
                        .padding(2.dp),
                ) {
                    Icon(
                        imageVector = Icons.Filled.Star,
                        contentDescription = null,
                        tint = WatermelonColors.favoriteStar,
                        modifier = Modifier.size(10.dp),
                    )
                }
            }
            if (showAchievementBadge) {
                Box(
                    modifier = Modifier
                        .align(Alignment.BottomEnd)
                        .padding(2.dp)
                        .clip(RoundedCornerShape(3.dp))
                        .background(Color.Black.copy(alpha = 0.70f))
                        .padding(horizontal = 2.5.dp, vertical = 1.dp),
                ) {
                    Icon(
                        imageVector = Icons.Filled.EmojiEvents,
                        contentDescription = null,
                        tint = WatermelonColors.gold,
                        modifier = Modifier.size(9.5.dp),
                    )
                }
            }
        }

        Spacer(Modifier.width(12.dp))

        // 2. Column 2: Title (up to 3 lines) & Developer/Subtitle
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = romDisplayName(rom),
                color = colors.text,
                fontFamily = me.magnum.melonds.ui.theme.SpaceGrotesk,
                fontSize = 13.5.sp,
                lineHeight = 17.5.sp,
                fontWeight = FontWeight.Bold,
                maxLines = 3,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.fillMaxWidth(),
            )
            val subtitle = buildSubtitle(rom, context)
            if (subtitle.isNotEmpty()) {
                Text(
                    text = subtitle,
                    color = colors.text3,
                    fontFamily = me.magnum.melonds.ui.theme.Manrope,
                    fontSize = 11.5.sp,
                    lineHeight = 14.sp,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.padding(top = 2.5.dp),
                )
            }
        }

        Spacer(Modifier.width(10.dp))

        // 3. Column 3: Region Badge & Platform Tag
        val regionBadge = resolveRomRegionBadge(rom)
        Column(horizontalAlignment = Alignment.End) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                if (regionBadge != null) {
                    RegionBadge(
                        flag = regionBadge.first,
                        code = regionBadge.second,
                        modifier = Modifier.padding(end = 5.dp),
                    )
                }
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(4.dp))
                        .background(colors.surface2)
                        .padding(horizontal = 5.5.dp, vertical = 2.dp),
                ) {
                    Text(
                        text = if (rom.isDsiWareTitle) "DSi" else "DS",
                        color = colors.text2,
                        fontFamily = WatermelonMono,
                        fontSize = 8.5.sp,
                        lineHeight = 9.5.sp,
                        fontWeight = FontWeight.Bold,
                        letterSpacing = 0.5.sp,
                    )
                }
            }
            val hours = formatHoursLabel(rom.totalPlayTime)
            if (hours.isNotEmpty()) {
                Text(
                    text = hours,
                    color = colors.text3,
                    fontFamily = WatermelonMono,
                    fontSize = 10.sp,
                    lineHeight = 12.sp,
                    modifier = Modifier.padding(top = 4.dp),
                )
            }
        }

        // 4. Column 4: Config Action
        if (allowConfiguration) {
            IconButton(
                onClick = onConfigClick,
                modifier = Modifier.size(34.dp).padding(start = 2.dp),
            ) {
                Icon(
                    imageVector = Icons.Filled.MoreVert,
                    contentDescription = stringResource(R.string.rom_config),
                    tint = colors.text3,
                    modifier = Modifier.size(19.dp),
                )
            }
        }
    }
}

@Composable
fun FolderListRow(
    name: String,
    relativePath: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val colors = watermelon
    val shape = RoundedCornerShape(8.dp)
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()

    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp, vertical = 1.dp)
            .clip(shape)
            .then(if (isFocused) Modifier.border(3.dp, colors.red, shape) else Modifier)
            .clickable(interactionSource = interactionSource, indication = null, onClick = onClick)
            .padding(horizontal = 8.dp, vertical = 10.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Box(
            modifier = Modifier
                .size(46.dp)
                .clip(RoundedCornerShape(6.dp))
                .background(colors.greenDim),
            contentAlignment = Alignment.Center,
        ) {
            Icon(
                imageVector = Icons.Filled.Folder,
                contentDescription = null,
                tint = colors.green,
                modifier = Modifier.size(24.dp),
            )
        }
        Spacer(Modifier.width(13.dp))
        Column(modifier = Modifier.weight(1f), verticalArrangement = Arrangement.Center) {
            Text(
                text = name,
                color = colors.text,
                fontSize = 14.sp,
                lineHeight = 18.sp,
                fontWeight = FontWeight.SemiBold,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
            if (relativePath.isNotEmpty() && relativePath != name) {
                Text(
                    text = relativePath,
                    color = colors.text3,
                    fontSize = 12.sp,
                    lineHeight = 15.sp,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
            }
        }
    }
}

private fun buildSubtitle(rom: Rom, context: android.content.Context): String {
    if (rom.developerName.isNotBlank()) {
        return rom.developerName
    }
    val parts = mutableListOf<String>()
    rom.lastPlayed?.let { lastPlayed ->
        val rel = DateUtils.getRelativeTimeSpanString(
            lastPlayed.time,
            System.currentTimeMillis(),
            DateUtils.MINUTE_IN_MILLIS,
        ).toString()
        parts += context.getString(R.string.rom_last_played_format, rel)
    }
    if (rom.totalPlayTime != Duration.ZERO) {
        parts += context.getString(R.string.rom_total_play_time_format, formatPlayTime(rom.totalPlayTime))
    }
    if (parts.isEmpty()) {
        parts += rom.fileName
    }
    return parts.joinToString(" • ")
}

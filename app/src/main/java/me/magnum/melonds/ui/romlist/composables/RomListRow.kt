package me.magnum.melonds.ui.romlist.composables

import android.text.format.DateUtils
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.material.icons.filled.Folder
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import me.magnum.melonds.R
import me.magnum.melonds.domain.model.rom.Rom
import kotlin.time.Duration

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun RomListRow(
    rom: Rom,
    coverUrl: String?,
    allowConfiguration: Boolean,
    showAchievementBadge: Boolean,
    onClick: () -> Unit,
    onLongPress: () -> Unit,
    onConfigClick: () -> Unit,
) {
    val context = LocalContext.current
    Surface(color = MaterialTheme.colors.surface) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .combinedClickable(
                    onClick = onClick,
                    onLongClick = onLongPress,
                )
                .padding(horizontal = 12.dp, vertical = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Box(
                modifier = Modifier
                    .size(56.dp)
                    .clip(RoundedCornerShape(8.dp)),
            ) {
                RomCover(
                    rom = rom,
                    coverUrl = coverUrl,
                    modifier = Modifier.size(56.dp),
                )
            }
            Spacer(Modifier.width(12.dp))
            Column(modifier = Modifier.weight(1f)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = rom.config.customName ?: rom.name,
                        style = MaterialTheme.typography.body1,
                        fontWeight = FontWeight.Medium,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier.weight(1f),
                    )
                    if (rom.isFavorite) {
                        Icon(
                            imageVector = Icons.Filled.Star,
                            contentDescription = null,
                            tint = Color(0xFFFFD54F),
                            modifier = Modifier.size(16.dp),
                        )
                        Spacer(Modifier.width(4.dp))
                    }
                    if (showAchievementBadge) {
                        Icon(
                            imageVector = Icons.Filled.EmojiEvents,
                            contentDescription = null,
                            tint = Color(0xFFFFD700),
                            modifier = Modifier.size(16.dp),
                        )
                    }
                }
                Spacer(Modifier.size(2.dp))
                val subtitle = buildSubtitle(rom, context)
                if (subtitle.isNotEmpty()) {
                    Text(
                        text = subtitle,
                        style = MaterialTheme.typography.caption,
                        color = MaterialTheme.colors.onBackground,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
                if (rom.isDsiWareTitle) {
                    Spacer(Modifier.size(2.dp))
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(4.dp))
                            .background(MaterialTheme.colors.secondary)
                            .padding(horizontal = 6.dp, vertical = 1.dp),
                    ) {
                        Text(
                            text = "DSiWare",
                            color = MaterialTheme.colors.onSecondary,
                            style = MaterialTheme.typography.caption,
                            fontWeight = FontWeight.Bold,
                        )
                    }
                }
            }
            if (allowConfiguration) {
                IconButton(onClick = onConfigClick) {
                    Icon(
                        imageVector = Icons.Filled.Settings,
                        contentDescription = stringResource(R.string.rom_config),
                    )
                }
            }
        }
    }
}

@Composable
fun FolderListRow(
    name: String,
    relativePath: String,
    onClick: () -> Unit,
) {
    val accent = MaterialTheme.colors.secondary
    Surface(color = MaterialTheme.colors.surface) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clickable { onClick() }
                .padding(horizontal = 12.dp, vertical = 12.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Box(
                modifier = Modifier
                    .size(56.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(accent.copy(alpha = 0.18f)),
                contentAlignment = Alignment.Center,
            ) {
                Icon(
                    imageVector = Icons.Filled.Folder,
                    contentDescription = null,
                    tint = accent,
                    modifier = Modifier.size(28.dp),
                )
            }
            Spacer(Modifier.width(12.dp))
            Column(modifier = Modifier.weight(1f), verticalArrangement = Arrangement.Center) {
                Text(
                    text = name,
                    style = MaterialTheme.typography.body1,
                    fontWeight = FontWeight.Medium,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
                if (relativePath.isNotEmpty() && relativePath != name) {
                    Text(
                        text = relativePath,
                        style = MaterialTheme.typography.caption,
                        color = MaterialTheme.colors.onBackground,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
            }
        }
    }
}

private fun buildSubtitle(rom: Rom, context: android.content.Context): String {
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

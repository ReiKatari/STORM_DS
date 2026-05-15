package me.magnum.melonds.ui.romlist.composables

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.focusable
import androidx.compose.foundation.gestures.detectVerticalDragGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.focus.focusProperties
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.ArrowUpward
import androidx.compose.material.icons.filled.Folder
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch
import me.magnum.melonds.R
import me.magnum.melonds.domain.model.RomFilter
import me.magnum.melonds.domain.model.rom.Rom
import kotlin.time.Duration

@Composable
fun ContinuePlayingShelf(
    roms: List<Rom>,
    coverByHash: Map<String, String>,
    onRomClicked: (Rom) -> Unit,
    onRomLongPressed: (Rom) -> Unit,
    modifier: Modifier = Modifier,
) {
    if (roms.isEmpty()) return
    Column(modifier = modifier.padding(vertical = 8.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp)) {
            Icon(
                imageVector = Icons.Filled.PlayArrow,
                contentDescription = null,
                tint = MaterialTheme.colors.secondary,
                modifier = Modifier.size(20.dp),
            )
            Spacer(Modifier.width(8.dp))
            Text(
                text = stringResource(R.string.rom_continue_playing),
                style = MaterialTheme.typography.subtitle1,
                fontWeight = FontWeight.SemiBold,
            )
        }
        LazyRow(
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
        ) {
            items(roms, key = { it.uri.toString() }) { rom ->
                ContinuePlayingCard(
                    rom = rom,
                    coverUrl = coverByHash[rom.retroAchievementsHash],
                    onClick = { onRomClicked(rom) },
                    onLongPress = { onRomLongPressed(rom) },
                )
            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun ContinuePlayingCard(
    rom: Rom,
    coverUrl: String?,
    onClick: () -> Unit,
    onLongPress: () -> Unit,
) {
    Card(
        elevation = 4.dp,
        shape = RoundedCornerShape(12.dp),
        modifier = Modifier
            .width(132.dp)
            .combinedClickable(
                onClick = onClick,
                onLongClick = onLongPress,
            ),
    ) {
        Column {
            RomCover(
                rom = rom,
                coverUrl = coverUrl,
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(1f),
            )
            Text(
                text = rom.config.customName ?: rom.name,
                style = MaterialTheme.typography.body2,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 6.dp),
            )
            if (rom.totalPlayTime != Duration.ZERO) {
                Text(
                    text = formatPlayTime(rom.totalPlayTime),
                    style = MaterialTheme.typography.caption,
                    color = MaterialTheme.colors.onBackground,
                    modifier = Modifier.padding(start = 8.dp, end = 8.dp, bottom = 8.dp),
                )
            }
        }
    }
}

@Composable
fun FilterChipsRow(
    selected: RomFilter,
    onFilterSelected: (RomFilter) -> Unit,
    modifier: Modifier = Modifier,
) {
    val items = listOf(
        RomFilter.ALL to R.string.rom_filter_all,
        RomFilter.FAVORITES to R.string.rom_filter_favorites,
        RomFilter.DS_ONLY to R.string.rom_filter_ds,
        RomFilter.DSIWARE_ONLY to R.string.rom_filter_dsiware,
        RomFilter.WITH_RETRO_ACHIEVEMENTS to R.string.rom_filter_retro_achievements,
    )
    LazyRow(
        modifier = modifier.fillMaxWidth(),
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 4.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        items(items) { (filter, label) ->
            FilterChipM2(
                selected = filter == selected,
                onClick = { onFilterSelected(filter) },
                label = stringResource(label),
            )
        }
    }
}

@Composable
fun BreadcrumbBar(
    breadcrumbs: List<String>,
    canNavigateUp: Boolean,
    isAtVirtualRoot: Boolean,
    isSearchActive: Boolean,
    onNavigateUp: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        if (canNavigateUp) {
            IconButton(onClick = onNavigateUp, modifier = Modifier.size(36.dp)) {
                Icon(Icons.Filled.ArrowUpward, contentDescription = stringResource(R.string.rom_browser_navigate_up))
            }
            Spacer(Modifier.width(4.dp))
        }
        val text = when {
            isSearchActive -> stringResource(R.string.rom_browser_search_results)
            isAtVirtualRoot || breadcrumbs.isEmpty() -> stringResource(R.string.rom_browser_virtual_root)
            else -> breadcrumbs.joinToString(" / ")
        }
        Text(
            text = text,
            style = MaterialTheme.typography.subtitle1,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.weight(1f),
        )
    }
}

@Composable
fun AlphabetIndexBar(
    alphabetIndex: Map<Char, Int>,
    activeLetter: Char?,
    hasFolders: Boolean,
    isInFolderSection: Boolean,
    onFoldersClicked: () -> Unit,
    onLetterTouched: (entriesIdx: Int, letter: Char) -> Unit,
    modifier: Modifier = Modifier,
) {
    if (alphabetIndex.isEmpty() && !hasFolders) return
    val letters = remember(alphabetIndex) { alphabetIndex.keys.toList() }
    val totalItems = letters.size + (if (hasFolders) 1 else 0)

    var hoverChar by remember { mutableStateOf<Char?>(null) }
    var isHoverFolder by remember { mutableStateOf(false) }
    var isTouching by remember { mutableStateOf(false) }
    var barHeightPx by remember { mutableStateOf(0) }

    fun handleDrag(yPx: Float) {
        if (barHeightPx <= 0 || totalItems == 0) return
        val itemHeight = barHeightPx.toFloat() / totalItems
        val rawIndex = (yPx / itemHeight).toInt()
        val clamped = rawIndex.coerceIn(0, totalItems - 1)

        if (hasFolders && clamped == 0) {
            if (!isHoverFolder) {
                isHoverFolder = true
                hoverChar = null
                onFoldersClicked()
            }
        } else {
            if (isHoverFolder) isHoverFolder = false
            val letterIdx = clamped - (if (hasFolders) 1 else 0)
            val ch = letters.getOrNull(letterIdx) ?: return
            if (ch != hoverChar) {
                hoverChar = ch
                alphabetIndex[ch]?.let { idx -> onLetterTouched(idx, ch) }
            }
        }
    }

    Box(modifier = modifier) {
        Surface(
            color = MaterialTheme.colors.surface.copy(alpha = 0.92f),
            shape = RoundedCornerShape(12.dp),
            elevation = 2.dp,
            modifier = Modifier
                .align(Alignment.CenterEnd)
                .padding(end = 4.dp, top = 4.dp, bottom = 4.dp)
                .width(36.dp)
                .fillMaxHeight()
                .focusProperties { canFocus = false }
                .onSizeChanged { barHeightPx = it.height }
                .pointerInput(letters, hasFolders) {
                    detectVerticalDragGestures(
                        onDragStart = {
                            isTouching = true
                            handleDrag(it.y)
                        },
                        onDragEnd = {
                            isTouching = false
                            hoverChar = null
                            isHoverFolder = false
                        },
                        onDragCancel = {
                            isTouching = false
                            hoverChar = null
                            isHoverFolder = false
                        },
                    ) { change, _ ->
                        handleDrag(change.position.y)
                        change.consume()
                    }
                },
        ) {
            Column(
                modifier = Modifier.fillMaxHeight(),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                if (hasFolders) {
                    val highlighted = isHoverFolder || (hoverChar == null && !isTouching && isInFolderSection)
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxWidth()
                            .focusProperties { canFocus = false }
                            .clickable { onFoldersClicked() },
                        contentAlignment = Alignment.Center,
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Folder,
                            contentDescription = null,
                            tint = if (highlighted) MaterialTheme.colors.secondary else MaterialTheme.colors.onSurface,
                            modifier = Modifier.size(14.dp),
                        )
                    }
                }
                letters.forEach { ch ->
                    val highlighted = hoverChar == ch ||
                        (hoverChar == null && !isTouching && !isInFolderSection && activeLetter == ch)
                    val isHovered = hoverChar == ch
                    val scale by androidx.compose.animation.core.animateFloatAsState(
                        targetValue = if (isHovered) 1.7f else if (highlighted) 1.15f else 1f,
                        animationSpec = androidx.compose.animation.core.spring(
                            dampingRatio = androidx.compose.animation.core.Spring.DampingRatioMediumBouncy,
                            stiffness = androidx.compose.animation.core.Spring.StiffnessMedium,
                        ),
                        label = "letter_scale",
                    )
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxWidth()
                            .focusProperties { canFocus = false }
                            .clickable { alphabetIndex[ch]?.let { idx -> onLetterTouched(idx, ch) } },
                        contentAlignment = Alignment.Center,
                    ) {
                        Text(
                            text = ch.toString(),
                            modifier = Modifier.scale(scale),
                            fontSize = 13.sp,
                            lineHeight = 16.sp,
                            color = if (highlighted) MaterialTheme.colors.secondary else MaterialTheme.colors.onSurface,
                            fontWeight = if (highlighted) FontWeight.Bold else FontWeight.Normal,
                            textAlign = androidx.compose.ui.text.style.TextAlign.Center,
                        )
                    }
                }
            }
        }

        if (isTouching && (hoverChar != null || isHoverFolder)) {
            Surface(
                color = MaterialTheme.colors.primary,
                shape = RoundedCornerShape(50),
                elevation = 8.dp,
                modifier = Modifier
                    .align(Alignment.Center)
                    .size(96.dp),
            ) {
                Box(contentAlignment = Alignment.Center) {
                    if (isHoverFolder) {
                        Icon(
                            imageVector = Icons.Filled.Folder,
                            contentDescription = null,
                            tint = MaterialTheme.colors.onPrimary,
                            modifier = Modifier.size(48.dp),
                        )
                    } else {
                        hoverChar?.let { ch ->
                            Text(
                                text = ch.toString(),
                                color = MaterialTheme.colors.onPrimary,
                                style = MaterialTheme.typography.h3,
                                fontWeight = FontWeight.Bold,
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun FilterChipM2(
    selected: Boolean,
    onClick: () -> Unit,
    label: String,
) {
    val bg = if (selected) MaterialTheme.colors.secondary else MaterialTheme.colors.surface
    val fg = if (selected) MaterialTheme.colors.onSecondary else MaterialTheme.colors.onSurface
    Surface(
        color = bg,
        contentColor = fg,
        shape = RoundedCornerShape(50),
        elevation = if (selected) 2.dp else 0.dp,
        border = androidx.compose.foundation.BorderStroke(
            width = 1.dp,
            color = if (selected) MaterialTheme.colors.secondary else MaterialTheme.colors.onBackground.copy(alpha = 0.3f),
        ),
        modifier = Modifier
            .focusProperties { canFocus = false }
            .clickable(onClick = onClick),
    ) {
        Text(
            text = label,
            style = MaterialTheme.typography.body2,
            fontWeight = if (selected) FontWeight.SemiBold else FontWeight.Normal,
            modifier = Modifier.padding(horizontal = 14.dp, vertical = 8.dp),
        )
    }
}

internal fun formatPlayTime(duration: Duration): String {
    if (duration == Duration.ZERO) return ""
    val hours = duration.inWholeHours
    val minutes = (duration.inWholeMinutes % 60)
    return when {
        hours >= 1 -> "${hours}h ${minutes}m"
        minutes >= 1 -> "${minutes}m"
        else -> "<1m"
    }
}

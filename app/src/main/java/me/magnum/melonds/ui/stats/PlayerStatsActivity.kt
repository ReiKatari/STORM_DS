package me.magnum.melonds.ui.stats

import android.app.Application
import android.graphics.Color as AndroidColor
import android.os.Bundle
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.BarChart
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Schedule
import androidx.compose.material.icons.filled.SportsEsports
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.WindowCompat
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import me.magnum.melonds.R
import me.magnum.melonds.domain.repositories.RomsRepository
import me.magnum.melonds.ui.romlist.boxart.BoxArtRepository
import me.magnum.melonds.ui.romlist.composables.DsBoxArtAspectRatio
import me.magnum.melonds.ui.romlist.composables.WatermelonRomArt
import me.magnum.melonds.ui.romlist.composables.romGradient
import me.magnum.melonds.ui.romlist.composables.romInitials
import me.magnum.melonds.ui.theme.AppThemeManager
import me.magnum.melonds.ui.theme.MelonTheme
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.ui.theme.WatermelonMono
import me.magnum.melonds.ui.theme.watermelon
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import javax.inject.Inject

@AndroidEntryPoint
class PlayerStatsActivity : AppCompatActivity() {

    private val viewModel by viewModels<PlayerStatsViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(AppThemeManager.currentTheme.getThemeResId())
        window.clearFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        enableEdgeToEdge(statusBarStyle = SystemBarStyle.dark(AndroidColor.TRANSPARENT))
        super.onCreate(savedInstanceState)

        setContent {
            MelonTheme {
                val summary by viewModel.summary.collectAsState()
                val boxArtByUri by viewModel.boxArtByUri.collectAsState()
                PlayerStatsScreen(
                    summary = summary,
                    boxArtByUri = boxArtByUri,
                    onBackClick = { finish() },
                )
            }
        }
    }
}

@HiltViewModel
class PlayerStatsViewModel @Inject constructor(
    application: Application,
    private val romsRepository: RomsRepository,
    private val boxArtRepository: BoxArtRepository,
) : AndroidViewModel(application) {

    private val _summary = MutableStateFlow(
        PlayStatsStore.buildSummary(application, emptyList())
    )
    val summary: StateFlow<PlayStatsStore.PlayerStatsSummary> = _summary.asStateFlow()

    private val _boxArtByUri = MutableStateFlow<Map<String, String>>(emptyMap())
    val boxArtByUri: StateFlow<Map<String, String>> = _boxArtByUri.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            val cached = runCatching { boxArtRepository.getAllCachedMatches() }.getOrDefault(emptyMap())
            if (cached.isNotEmpty()) {
                _boxArtByUri.value = cached
            }
        }
        viewModelScope.launch(Dispatchers.IO) {
            romsRepository.getRoms().collectLatest { roms ->
                _summary.value = PlayStatsStore.buildSummary(getApplication(), roms)
            }
        }
    }
}

@Composable
private fun PlayerStatsScreen(
    summary: PlayStatsStore.PlayerStatsSummary,
    boxArtByUri: Map<String, String>,
    onBackClick: () -> Unit,
) {
    val colors = watermelon
    val accentColor = Color(AppThemeManager.getAccentColor())

    Surface(color = colors.bg, modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .systemBarsPadding(),
        ) {
            // Header
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)
                    .padding(horizontal = 12.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                IconButton(onClick = onBackClick, modifier = Modifier.size(40.dp)) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = null,
                        tint = colors.text,
                    )
                }
                Spacer(Modifier.width(6.dp))
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = stringResource(R.string.feature_stats_title),
                        color = colors.text,
                        fontFamily = SpaceGrotesk,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                    )
                    Text(
                        text = stringResource(R.string.feature_stats_subtitle),
                        color = colors.text3,
                        fontFamily = WatermelonMono,
                        fontSize = 10.5.sp,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
            }
            Box(Modifier.fillMaxWidth().height(1.dp).background(colors.line))

            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(16.dp),
                verticalArrangement = Arrangement.spacedBy(14.dp),
            ) {
                // Summary Cards Row
                item(key = "summary_row") {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(10.dp),
                    ) {
                        StatMetricCard(
                            icon = Icons.Filled.Schedule,
                            label = stringResource(R.string.feature_stats_total_play_time),
                            value = formatStatsDuration(summary.totalPlayTimeMs),
                            accentColor = accentColor,
                            modifier = Modifier.weight(1f),
                        )
                        StatMetricCard(
                            icon = Icons.Filled.SportsEsports,
                            label = stringResource(R.string.feature_stats_games_played),
                            value = summary.gamesPlayedCount.toString(),
                            accentColor = colors.green,
                            modifier = Modifier.weight(1f),
                        )
                        StatMetricCard(
                            icon = Icons.Filled.PlayArrow,
                            label = stringResource(R.string.feature_stats_total_launches),
                            value = summary.totalLaunches.toString(),
                            accentColor = colors.red,
                            modifier = Modifier.weight(1f),
                        )
                    }
                }

                // Daily Play-Time Chart (dd.MM)
                item(key = "daily_chart") {
                    DailyPlayTimeChartCard(
                        points = summary.dailyChart,
                        accentColor = accentColor,
                    )
                }

                if (summary.topByPlayTime.isEmpty() && summary.topByLaunches.isEmpty()) {
                    item(key = "empty_state") {
                        EmptyStatsCard()
                    }
                } else {
                    if (summary.topByPlayTime.isNotEmpty()) {
                        item(key = "header_top_time") {
                            SectionTitleRow(
                                icon = Icons.Filled.Schedule,
                                title = stringResource(R.string.feature_stats_top_by_time),
                                tint = accentColor,
                            )
                        }
                        val maxPlayTimeMs = summary.topByPlayTime.maxOfOrNull { it.playTimeMs }?.coerceAtLeast(1L) ?: 1L
                        itemsIndexed(
                            items = summary.topByPlayTime,
                            key = { _, item -> "time:${item.uriString}" },
                        ) { index, item ->
                            StatGameCard(
                                rank = index + 1,
                                item = item,
                                boxArtUrl = boxArtByUri[item.uriString]?.takeIf { it.isNotEmpty() },
                                progressFraction = (item.playTimeMs.toFloat() / maxPlayTimeMs.toFloat()).coerceIn(0.05f, 1f),
                                primaryBadge = formatStatsDuration(item.playTimeMs),
                                secondaryBadge = stringResource(R.string.feature_stats_launches_count, item.launchCount),
                                barColor = accentColor,
                            )
                        }
                    }

                    if (summary.topByLaunches.isNotEmpty()) {
                        item(key = "header_top_launches") {
                            Spacer(Modifier.height(4.dp))
                            SectionTitleRow(
                                icon = Icons.Filled.BarChart,
                                title = stringResource(R.string.feature_stats_top_by_launches),
                                tint = colors.green,
                            )
                        }
                        val maxLaunches = summary.topByLaunches.maxOfOrNull { it.launchCount }?.coerceAtLeast(1) ?: 1
                        itemsIndexed(
                            items = summary.topByLaunches,
                            key = { _, item -> "launch:${item.uriString}" },
                        ) { index, item ->
                            StatGameCard(
                                rank = index + 1,
                                item = item,
                                boxArtUrl = boxArtByUri[item.uriString]?.takeIf { it.isNotEmpty() },
                                progressFraction = (item.launchCount.toFloat() / maxLaunches.toFloat()).coerceIn(0.08f, 1f),
                                primaryBadge = stringResource(R.string.feature_stats_launches_count, item.launchCount),
                                secondaryBadge = formatStatsDuration(item.playTimeMs),
                                barColor = colors.green,
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun StatMetricCard(
    icon: ImageVector,
    label: String,
    value: String,
    accentColor: Color,
    modifier: Modifier = Modifier,
) {
    val colors = watermelon
    val shape = RoundedCornerShape(14.dp)
    Column(
        modifier = modifier
            .clip(shape)
            .background(colors.surface)
            .border(1.dp, colors.line, shape)
            .padding(horizontal = 12.dp, vertical = 12.dp),
    ) {
        Box(
            modifier = Modifier
                .size(28.dp)
                .clip(CircleShape)
                .background(accentColor.copy(alpha = 0.16f)),
            contentAlignment = Alignment.Center,
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = accentColor,
                modifier = Modifier.size(15.dp),
            )
        }
        Spacer(Modifier.height(10.dp))
        Text(
            text = value,
            color = colors.text,
            fontFamily = SpaceGrotesk,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
        )
        Spacer(Modifier.height(2.dp))
        Text(
            text = label,
            color = colors.text3,
            fontFamily = WatermelonMono,
            fontSize = 9.5.sp,
            lineHeight = 12.sp,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis,
        )
    }
}

@Composable
private fun DailyPlayTimeChartCard(
    points: List<PlayStatsStore.DailyPlayPoint>,
    accentColor: Color,
) {
    val colors = watermelon
    val shape = RoundedCornerShape(16.dp)
    val maxMs = (points.maxOfOrNull { it.playTimeMs } ?: 0L).coerceAtLeast(60_000L)

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(shape)
            .background(colors.surface)
            .border(1.dp, colors.line, shape)
            .padding(16.dp),
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth(),
        ) {
            Icon(
                imageVector = Icons.Filled.BarChart,
                contentDescription = null,
                tint = accentColor,
                modifier = Modifier.size(18.dp),
            )
            Spacer(Modifier.width(8.dp))
            Text(
                text = stringResource(R.string.feature_stats_daily_chart_title),
                color = colors.text,
                fontFamily = SpaceGrotesk,
                fontSize = 14.5.sp,
                fontWeight = FontWeight.Bold,
            )
        }

        Spacer(Modifier.height(16.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(128.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.Bottom,
        ) {
            points.forEach { point ->
                val ratio = if (point.playTimeMs <= 0L) {
                    0.06f
                } else {
                    (point.playTimeMs.toFloat() / maxMs.toFloat()).coerceIn(0.12f, 1f)
                }
                val barBrush = if (point.playTimeMs > 0L) {
                    Brush.verticalGradient(
                        listOf(
                            accentColor,
                            accentColor.copy(alpha = 0.55f),
                        )
                    )
                } else {
                    Brush.verticalGradient(
                        listOf(
                            colors.surface2,
                            colors.surface2,
                        )
                    )
                }

                Column(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Bottom,
                ) {
                    Text(
                        text = if (point.playTimeMs > 0L) formatShortBarDuration(point.playTimeMs) else "",
                        color = if (point.isToday) accentColor else colors.text2,
                        fontFamily = WatermelonMono,
                        fontSize = 8.5.sp,
                        maxLines = 1,
                    )
                    Spacer(Modifier.height(4.dp))
                    Box(
                        modifier = Modifier
                            .fillMaxWidth(0.62f)
                            .weight(1f),
                        contentAlignment = Alignment.BottomCenter,
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .fillMaxHeight(ratio)
                                .clip(RoundedCornerShape(topStart = 6.dp, topEnd = 6.dp, bottomStart = 3.dp, bottomEnd = 3.dp))
                                .background(barBrush),
                        )
                    }
                    Spacer(Modifier.height(6.dp))
                    Text(
                        text = point.dayLabel,
                        color = if (point.isToday) accentColor else colors.text3,
                        fontFamily = WatermelonMono,
                        fontSize = 9.5.sp,
                        fontWeight = if (point.isToday) FontWeight.Bold else FontWeight.Normal,
                        maxLines = 1,
                    )
                }
            }
        }
    }
}

@Composable
private fun SectionTitleRow(
    icon: ImageVector,
    title: String,
    tint: Color,
) {
    val colors = watermelon
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 4.dp, bottom = 2.dp),
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = tint,
            modifier = Modifier.size(18.dp),
        )
        Spacer(Modifier.width(8.dp))
        Text(
            text = title,
            color = colors.text,
            fontFamily = SpaceGrotesk,
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
        )
    }
}

@Composable
private fun StatGameCard(
    rank: Int,
    item: PlayStatsStore.GameStatItem,
    boxArtUrl: String?,
    progressFraction: Float,
    primaryBadge: String,
    secondaryBadge: String,
    barColor: Color,
) {
    val colors = watermelon
    val shape = RoundedCornerShape(14.dp)
    val dateFormat = remember { SimpleDateFormat("dd.MM.yyyy HH:mm", Locale.getDefault()) }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .clip(shape)
            .background(colors.surface)
            .border(1.dp, colors.line, shape)
            .padding(10.dp),
    ) {
        Box(
            modifier = Modifier
                .size(26.dp)
                .clip(CircleShape)
                .background(if (rank <= 3) barColor.copy(alpha = 0.2f) else colors.surface2),
            contentAlignment = Alignment.Center,
        ) {
            Text(
                text = "#$rank",
                color = if (rank <= 3) barColor else colors.text3,
                fontFamily = WatermelonMono,
                fontSize = 10.sp,
                fontWeight = FontWeight.Bold,
            )
        }

        Spacer(Modifier.width(10.dp))

        Box(
            modifier = Modifier
                .width(46.dp)
                .aspectRatio(DsBoxArtAspectRatio)
                .clip(RoundedCornerShape(8.dp)),
        ) {
            if (item.rom != null) {
                WatermelonRomArt(
                    rom = item.rom,
                    boxArtUrl = boxArtUrl,
                    raCoverUrl = null,
                    initialsFontSize = 13.sp,
                    modifier = Modifier.fillMaxSize(),
                )
            } else {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(romGradient(item.displayName)),
                    contentAlignment = Alignment.Center,
                ) {
                    Text(
                        text = romInitials(item.displayName),
                        color = Color.White,
                        fontFamily = SpaceGrotesk,
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold,
                    )
                }
            }
        }

        Spacer(Modifier.width(12.dp))

        Column(modifier = Modifier.weight(1f)) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth(),
            ) {
                Text(
                    text = item.displayName,
                    color = colors.text,
                    fontFamily = SpaceGrotesk,
                    fontSize = 13.5.sp,
                    fontWeight = FontWeight.Bold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.weight(1f),
                )
                Spacer(Modifier.width(8.dp))
                Text(
                    text = primaryBadge,
                    color = barColor,
                    fontFamily = WatermelonMono,
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Bold,
                )
            }

            Spacer(Modifier.height(5.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(5.dp)
                    .clip(RoundedCornerShape(3.dp))
                    .background(colors.surface2),
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth(progressFraction)
                        .fillMaxHeight()
                        .clip(RoundedCornerShape(3.dp))
                        .background(barColor),
                )
            }

            Spacer(Modifier.height(5.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth(),
            ) {
                Text(
                    text = secondaryBadge,
                    color = colors.text2,
                    fontFamily = WatermelonMono,
                    fontSize = 9.5.sp,
                )
                if (item.lastPlayedEpochMs > 0L) {
                    Text(
                        text = dateFormat.format(Date(item.lastPlayedEpochMs)),
                        color = colors.text3,
                        fontFamily = WatermelonMono,
                        fontSize = 9.sp,
                    )
                }
            }
        }
    }
}

@Composable
private fun EmptyStatsCard() {
    val colors = watermelon
    val shape = RoundedCornerShape(16.dp)
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(shape)
            .background(colors.surface)
            .border(1.dp, colors.line, shape)
            .padding(28.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Icon(
            imageVector = Icons.Filled.SportsEsports,
            contentDescription = null,
            tint = colors.text3,
            modifier = Modifier.size(36.dp),
        )
        Spacer(Modifier.height(10.dp))
        Text(
            text = stringResource(R.string.feature_stats_empty_title),
            color = colors.text,
            fontFamily = SpaceGrotesk,
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
        )
        Spacer(Modifier.height(4.dp))
        Text(
            text = stringResource(R.string.feature_stats_empty_desc),
            color = colors.text3,
            fontFamily = WatermelonMono,
            fontSize = 11.sp,
            textAlign = TextAlign.Center,
        )
    }
}

@Composable
private fun formatStatsDuration(durationMs: Long): String {
    if (durationMs <= 0L) return stringResource(R.string.feature_stats_time_m, 0)
    val totalMinutes = durationMs / 60_000L
    val hours = totalMinutes / 60L
    val minutes = totalMinutes % 60L
    return when {
        hours >= 1L -> stringResource(R.string.feature_stats_time_hm, hours, minutes)
        minutes >= 1L -> stringResource(R.string.feature_stats_time_m, minutes)
        else -> stringResource(R.string.feature_stats_time_less_than_min)
    }
}

private fun formatShortBarDuration(durationMs: Long): String {
    val totalMinutes = durationMs / 60_000L
    val hours = totalMinutes / 60L
    val minutes = totalMinutes % 60L
    return when {
        hours >= 1L -> "${hours}h${if (minutes > 0L) " ${minutes}m" else ""}"
        minutes >= 1L -> "${minutes}m"
        else -> "<1m"
    }
}

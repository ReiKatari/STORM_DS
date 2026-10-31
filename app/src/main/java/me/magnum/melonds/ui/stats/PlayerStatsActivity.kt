package me.magnum.melonds.ui.stats

import android.app.Application
import android.content.res.Configuration
import android.graphics.Color as AndroidColor
import android.os.Bundle
import android.view.KeyEvent
import android.widget.Toast
import androidx.activity.SystemBarStyle
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
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
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.BarChart
import androidx.compose.material.icons.filled.Brightness5
import androidx.compose.material.icons.filled.Brightness6
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Code
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.NightsStay
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Schedule
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShowChart
import androidx.compose.material.icons.filled.SportsEsports
import androidx.compose.material.icons.filled.TableChart
import androidx.compose.material.icons.filled.Timeline
import androidx.compose.material.icons.filled.WbSunny
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
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
import kotlinx.coroutines.withContext
import me.magnum.melonds.R
import me.magnum.melonds.domain.repositories.RomsRepository
import me.magnum.melonds.ui.Theme
import me.magnum.melonds.ui.romlist.boxart.BoxArtRepository
import me.magnum.melonds.ui.romlist.composables.DsBoxArtAspectRatio
import me.magnum.melonds.ui.romlist.composables.WatermelonRomArt
import me.magnum.melonds.ui.romlist.composables.romGradient
import me.magnum.melonds.ui.romlist.composables.romInitials
import me.magnum.melonds.ui.theme.AppThemeManager
import me.magnum.melonds.ui.theme.MelonTheme
import me.magnum.melonds.ui.theme.SpaceGrotesk
import me.magnum.melonds.ui.theme.WatermelonColors
import me.magnum.melonds.ui.theme.WatermelonMono
import me.magnum.melonds.ui.theme.watermelon
import java.io.File
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import javax.inject.Inject

enum class StatsTab {
    OVERVIEW,
    ANALYTICS,
    DAILY_LOG,
}

enum class StatsSortOption {
    BY_TIME,
    BY_LAUNCHES,
    RECENT,
    BY_AVG_SESSION,
}

enum class PlatformFilter {
    ALL,
    NDS,
    DSI,
}

enum class ChartPeriod {
    DAYS_7,
    DAYS_30,
}

enum class ChartStyle {
    BARS,
    LINE,
}

@AndroidEntryPoint
class PlayerStatsActivity : AppCompatActivity() {

    private val viewModel by viewModels<PlayerStatsViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(AppThemeManager.currentTheme.getThemeResId())
        window.clearFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN)
        WindowCompat.setDecorFitsSystemWindows(window, false)

        val isDark = when (AppThemeManager.currentTheme) {
            Theme.LIGHT, Theme.SAKURA -> false
            Theme.SYSTEM -> (resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK) == Configuration.UI_MODE_NIGHT_YES
            else -> true
        }

        enableEdgeToEdge(
            statusBarStyle = if (isDark) {
                SystemBarStyle.dark(AndroidColor.TRANSPARENT)
            } else {
                SystemBarStyle.light(AndroidColor.TRANSPARENT, AndroidColor.TRANSPARENT)
            },
            navigationBarStyle = if (isDark) {
                SystemBarStyle.dark(AndroidColor.TRANSPARENT)
            } else {
                SystemBarStyle.light(AndroidColor.TRANSPARENT, AndroidColor.TRANSPARENT)
            },
        )
        super.onCreate(savedInstanceState)

        setContent {
            MelonTheme {
                val summary by viewModel.summary.collectAsState()
                val boxArtByUri by viewModel.boxArtByUri.collectAsState()
                val dailySessions by viewModel.dailySessions.collectAsState()

                BackHandler { finish() }

                PlayerStatsScreen(
                    summary = summary,
                    dailySessions = dailySessions,
                    boxArtByUri = boxArtByUri,
                    onBackClick = { finish() },
                    onExportJson = {
                        viewModel.exportJson { file ->
                            val msg = if (file != null) {
                                getString(R.string.feature_stats_export_success, file.name)
                            } else {
                                getString(R.string.feature_stats_export_error)
                            }
                            Toast.makeText(this@PlayerStatsActivity, msg, Toast.LENGTH_LONG).show()
                        }
                    },
                    onExportCsv = {
                        viewModel.exportCsv { file ->
                            val msg = if (file != null) {
                                getString(R.string.feature_stats_export_success, file.name)
                            } else {
                                getString(R.string.feature_stats_export_error)
                            }
                            Toast.makeText(this@PlayerStatsActivity, msg, Toast.LENGTH_LONG).show()
                        }
                    },
                )
            }
        }
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if (keyCode == KeyEvent.KEYCODE_ESCAPE) {
            finish()
            return true
        }
        return super.onKeyDown(keyCode, event)
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

    private val _dailySessions = MutableStateFlow<List<PlayStatsStore.DailySessionLog>>(emptyList())
    val dailySessions: StateFlow<List<PlayStatsStore.DailySessionLog>> = _dailySessions.asStateFlow()

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
                _dailySessions.value = PlayStatsStore.getDailySessionLogs(getApplication())
            }
        }
    }

    fun exportJson(onResult: (File?) -> Unit) {
        viewModelScope.launch {
            val file = runCatching { PlayStatsStore.exportToJson(getApplication()) }.getOrNull()
            withContext(Dispatchers.Main) { onResult(file) }
        }
    }

    fun exportCsv(onResult: (File?) -> Unit) {
        viewModelScope.launch {
            val file = runCatching { PlayStatsStore.exportToCsv(getApplication()) }.getOrNull()
            withContext(Dispatchers.Main) { onResult(file) }
        }
    }
}

@Composable
private fun PlayerStatsScreen(
    summary: PlayStatsStore.PlayerStatsSummary,
    dailySessions: List<PlayStatsStore.DailySessionLog>,
    boxArtByUri: Map<String, String>,
    onBackClick: () -> Unit,
    onExportJson: () -> Unit,
    onExportCsv: () -> Unit,
) {
    val colors = watermelon
    val accentColor = Color(AppThemeManager.getAccentColor())
    var currentTab by remember { mutableStateOf(StatsTab.OVERVIEW) }

    Surface(color = colors.bg, modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .systemBarsPadding(),
        ) {
            // Header Bar
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
                IconButton(onClick = onExportJson, modifier = Modifier.size(40.dp)) {
                    Icon(
                        imageVector = Icons.Filled.Code,
                        contentDescription = stringResource(R.string.feature_stats_export_json),
                        tint = colors.text2,
                        modifier = Modifier.size(20.dp),
                    )
                }
                IconButton(onClick = onExportCsv, modifier = Modifier.size(40.dp)) {
                    Icon(
                        imageVector = Icons.Filled.TableChart,
                        contentDescription = stringResource(R.string.feature_stats_export_csv),
                        tint = colors.text2,
                        modifier = Modifier.size(20.dp),
                    )
                }
            }

            Box(Modifier.fillMaxWidth().height(1.dp).background(colors.line))

            // 3 Navigation Tabs
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 14.dp, vertical = 8.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                StatsTabChip(
                    label = stringResource(R.string.v792_stats_tab_overview),
                    isSelected = currentTab == StatsTab.OVERVIEW,
                    onClick = { currentTab = StatsTab.OVERVIEW },
                    accentColor = accentColor,
                    modifier = Modifier.weight(1f),
                )
                StatsTabChip(
                    label = stringResource(R.string.v792_stats_tab_analytics),
                    isSelected = currentTab == StatsTab.ANALYTICS,
                    onClick = { currentTab = StatsTab.ANALYTICS },
                    accentColor = accentColor,
                    modifier = Modifier.weight(1.15f),
                )
                StatsTabChip(
                    label = stringResource(R.string.v792_stats_tab_daily_log),
                    isSelected = currentTab == StatsTab.DAILY_LOG,
                    onClick = { currentTab = StatsTab.DAILY_LOG },
                    accentColor = accentColor,
                    modifier = Modifier.weight(1f),
                )
            }

            Box(Modifier.fillMaxWidth().height(1.dp).background(colors.line))

            when (currentTab) {
                StatsTab.OVERVIEW -> {
                    OverviewTabContent(
                        summary = summary,
                        boxArtByUri = boxArtByUri,
                        accentColor = accentColor,
                    )
                }
                StatsTab.ANALYTICS -> {
                    AnalyticsTabContent(
                        summary = summary,
                        accentColor = accentColor,
                    )
                }
                StatsTab.DAILY_LOG -> {
                    DailySessionsView(
                        dailySessions = dailySessions,
                        accentColor = accentColor,
                    )
                }
            }
        }
    }
}

@Composable
private fun OverviewTabContent(
    summary: PlayStatsStore.PlayerStatsSummary,
    boxArtByUri: Map<String, String>,
    accentColor: Color,
) {
    val colors = watermelon
    var selectedSortOption by remember { mutableStateOf(StatsSortOption.BY_TIME) }
    var selectedPlatform by remember { mutableStateOf(PlatformFilter.ALL) }
    var searchQuery by remember { mutableStateOf("") }
    var chartPeriod by remember { mutableStateOf(ChartPeriod.DAYS_7) }
    var chartStyle by remember { mutableStateOf(ChartStyle.BARS) }

    val filteredGames = remember(summary.allGames, searchQuery, selectedPlatform, selectedSortOption) {
        val q = searchQuery.trim()
        summary.allGames
            .filter { item ->
                val matchesSearch = q.isEmpty() ||
                    item.displayName.contains(q, ignoreCase = true) ||
                    item.gameCode.contains(q, ignoreCase = true)
                val matchesPlatform = when (selectedPlatform) {
                    PlatformFilter.ALL -> true
                    PlatformFilter.NDS -> !item.isDsi
                    PlatformFilter.DSI -> item.isDsi
                }
                matchesSearch && matchesPlatform
            }
            .let { list ->
                when (selectedSortOption) {
                    StatsSortOption.BY_TIME -> list.sortedWith(compareByDescending<PlayStatsStore.GameStatItem> { it.playTimeMs }.thenByDescending { it.launchCount })
                    StatsSortOption.BY_LAUNCHES -> list.sortedWith(compareByDescending<PlayStatsStore.GameStatItem> { it.launchCount }.thenByDescending { it.playTimeMs })
                    StatsSortOption.RECENT -> list.sortedWith(compareByDescending<PlayStatsStore.GameStatItem> { it.lastPlayedEpochMs }.thenByDescending { it.playTimeMs })
                    StatsSortOption.BY_AVG_SESSION -> list.sortedWith(compareByDescending<PlayStatsStore.GameStatItem> { it.avgSessionMs }.thenByDescending { it.playTimeMs })
                }
            }
    }

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp),
    ) {
        // Hero Player Rank Card with 4 KPI Tiles
        item(key = "hero_rank_card") {
            HeroPlayerRankCard(
                levelInfo = summary.levelInfo,
                totalPlayTimeMs = summary.totalPlayTimeMs,
                currentStreakDays = summary.currentStreakDays,
                bestStreakDays = summary.bestStreakDays,
                totalLaunches = summary.totalLaunches,
                averageSessionMs = summary.averageSessionMs,
                accentColor = accentColor,
            )
        }

        // Interactive 7/30 Days Activity Chart
        item(key = "daily_chart") {
            InteractiveDailyChartCard(
                points = if (chartPeriod == ChartPeriod.DAYS_7) summary.last7Days else summary.last30Days,
                period = chartPeriod,
                onPeriodChanged = { chartPeriod = it },
                style = chartStyle,
                onStyleChanged = { chartStyle = it },
                accentColor = accentColor,
            )
        }

        // Leaderboard Search & Filter Header
        item(key = "leaderboard_filters") {
            Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                // Search Input
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp))
                        .background(colors.surface)
                        .border(1.dp, colors.line, RoundedCornerShape(12.dp))
                        .padding(horizontal = 12.dp, vertical = 9.dp),
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth(),
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Search,
                            contentDescription = null,
                            tint = colors.text3,
                            modifier = Modifier.size(18.dp),
                        )
                        Spacer(Modifier.width(8.dp))
                        Box(modifier = Modifier.weight(1f)) {
                            if (searchQuery.isEmpty()) {
                                Text(
                                    text = stringResource(R.string.v792_stats_search_hint),
                                    color = colors.text3,
                                    fontFamily = SpaceGrotesk,
                                    fontSize = 13.sp,
                                )
                            }
                            BasicTextField(
                                value = searchQuery,
                                onValueChange = { searchQuery = it },
                                textStyle = TextStyle(
                                    color = colors.text,
                                    fontFamily = SpaceGrotesk,
                                    fontSize = 13.sp,
                                ),
                                cursorBrush = SolidColor(accentColor),
                                singleLine = true,
                                modifier = Modifier.fillMaxWidth(),
                            )
                        }
                        if (searchQuery.isNotEmpty()) {
                            Spacer(Modifier.width(6.dp))
                            Icon(
                                imageVector = Icons.Filled.Close,
                                contentDescription = null,
                                tint = colors.text2,
                                modifier = Modifier
                                    .size(18.dp)
                                    .clickable { searchQuery = "" },
                            )
                        }
                    }
                }

                // Platform Filters & Sort Chips
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(6.dp),
                ) {
                    StatsFilterPill(
                        label = stringResource(R.string.v792_stats_filter_platform_all),
                        isSelected = selectedPlatform == PlatformFilter.ALL,
                        onClick = { selectedPlatform = PlatformFilter.ALL },
                        accentColor = accentColor,
                    )
                    StatsFilterPill(
                        label = stringResource(R.string.v792_stats_filter_platform_nds),
                        isSelected = selectedPlatform == PlatformFilter.NDS,
                        onClick = { selectedPlatform = PlatformFilter.NDS },
                        accentColor = accentColor,
                    )
                    StatsFilterPill(
                        label = stringResource(R.string.v792_stats_filter_platform_dsi),
                        isSelected = selectedPlatform == PlatformFilter.DSI,
                        onClick = { selectedPlatform = PlatformFilter.DSI },
                        accentColor = colors.green,
                    )
                    Spacer(Modifier.weight(1f))
                    Text(
                        text = "${filteredGames.size}",
                        color = colors.text3,
                        fontFamily = WatermelonMono,
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.align(Alignment.CenterVertically),
                    )
                }

                // Sort Options
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(6.dp),
                ) {
                    StatsSortChip(
                        label = stringResource(R.string.v792_stats_sort_time),
                        isSelected = selectedSortOption == StatsSortOption.BY_TIME,
                        onClick = { selectedSortOption = StatsSortOption.BY_TIME },
                        accentColor = accentColor,
                        modifier = Modifier.weight(1f),
                    )
                    StatsSortChip(
                        label = stringResource(R.string.v792_stats_sort_launches),
                        isSelected = selectedSortOption == StatsSortOption.BY_LAUNCHES,
                        onClick = { selectedSortOption = StatsSortOption.BY_LAUNCHES },
                        accentColor = colors.red,
                        modifier = Modifier.weight(1f),
                    )
                    StatsSortChip(
                        label = stringResource(R.string.v792_stats_sort_recent),
                        isSelected = selectedSortOption == StatsSortOption.RECENT,
                        onClick = { selectedSortOption = StatsSortOption.RECENT },
                        accentColor = colors.green,
                        modifier = Modifier.weight(1f),
                    )
                    StatsSortChip(
                        label = stringResource(R.string.v792_stats_sort_avg_session),
                        isSelected = selectedSortOption == StatsSortOption.BY_AVG_SESSION,
                        onClick = { selectedSortOption = StatsSortOption.BY_AVG_SESSION },
                        accentColor = colors.green,
                        modifier = Modifier.weight(1.05f),
                    )
                }
            }
        }

        if (filteredGames.isEmpty()) {
            item(key = "empty_state") {
                EmptyStatsCard(
                    title = stringResource(R.string.v792_stats_no_games_match),
                    desc = stringResource(R.string.feature_stats_empty_desc),
                )
            }
        } else {
            val maxPlayTimeMs = filteredGames.maxOfOrNull { it.playTimeMs }?.coerceAtLeast(1L) ?: 1L
            itemsIndexed(
                items = filteredGames,
                key = { _, item -> item.uriString },
            ) { index, item ->
                StatGameCard(
                    rank = index + 1,
                    item = item,
                    boxArtUrl = boxArtByUri[item.uriString]?.takeIf { it.isNotEmpty() },
                    progressFraction = (item.playTimeMs.toFloat() / maxPlayTimeMs.toFloat()).coerceIn(0.04f, 1f),
                    barColor = if (item.isDsi) colors.green else accentColor,
                )
            }
        }
    }
}

@Composable
private fun HeroPlayerRankCard(
    levelInfo: PlayStatsStore.PlayerLevelInfo,
    totalPlayTimeMs: Long,
    currentStreakDays: Int,
    bestStreakDays: Int,
    totalLaunches: Int,
    averageSessionMs: Long,
    accentColor: Color,
) {
    val colors = watermelon
    val shape = RoundedCornerShape(16.dp)
    val animatedProgress by animateFloatAsState(
        targetValue = levelInfo.progressFraction,
        label = "xp_progress",
    )

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(shape)
            .background(colors.surface)
            .border(1.dp, colors.line, shape)
            .padding(16.dp),
    ) {
        // Rank & Level Row
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth(),
        ) {
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(8.dp))
                    .background(accentColor.copy(alpha = 0.16f))
                    .border(1.dp, accentColor.copy(alpha = 0.5f), RoundedCornerShape(8.dp))
                    .padding(horizontal = 8.dp, vertical = 4.dp),
                contentAlignment = Alignment.Center,
            ) {
                Text(
                    text = stringResource(R.string.v792_stats_level, levelInfo.level),
                    color = accentColor,
                    fontFamily = SpaceGrotesk,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                )
            }

            Spacer(Modifier.width(10.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = stringResource(levelInfo.rankTitleRes),
                    color = colors.text,
                    fontFamily = SpaceGrotesk,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
                Text(
                    text = stringResource(R.string.v792_stats_rank_prefix, stringResource(levelInfo.rankTitleRes)),
                    color = colors.text3,
                    fontFamily = WatermelonMono,
                    fontSize = 10.sp,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
            }

            Text(
                text = "${(levelInfo.progressFraction * 100).toInt()}%",
                color = accentColor,
                fontFamily = WatermelonMono,
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
            )
        }

        Spacer(Modifier.height(10.dp))

        // XP Progress Bar
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(7.dp)
                .clip(RoundedCornerShape(4.dp))
                .background(colors.surface2),
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth(animatedProgress)
                    .fillMaxHeight()
                    .clip(RoundedCornerShape(4.dp))
                    .background(
                        Brush.horizontalGradient(
                            listOf(accentColor, colors.green)
                        )
                    ),
            )
        }

        Spacer(Modifier.height(4.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Text(
                text = stringResource(R.string.v792_stats_xp_progress, levelInfo.currentLevelXp, levelInfo.nextLevelXp),
                color = colors.text3,
                fontFamily = WatermelonMono,
                fontSize = 9.5.sp,
            )
            Text(
                text = "${levelInfo.totalXp} XP",
                color = colors.text2,
                fontFamily = WatermelonMono,
                fontSize = 9.5.sp,
                fontWeight = FontWeight.SemiBold,
            )
        }

        Spacer(Modifier.height(14.dp))
        Box(Modifier.fillMaxWidth().height(1.dp).background(colors.line.copy(alpha = 0.6f)))
        Spacer(Modifier.height(12.dp))

        // 4 Compact KPI Tiles
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            StatMetricTile(
                icon = Icons.Filled.Schedule,
                label = stringResource(R.string.v792_stats_kpi_total_time),
                value = formatStatsDuration(totalPlayTimeMs),
                subtitle = null,
                accentColor = accentColor,
                modifier = Modifier.weight(1f),
            )
            StatMetricTile(
                icon = Icons.Filled.Timeline,
                label = stringResource(R.string.v792_stats_kpi_streak),
                value = stringResource(R.string.v792_stats_kpi_streak_days, currentStreakDays),
                subtitle = stringResource(R.string.v792_stats_kpi_streak_best, bestStreakDays),
                accentColor = colors.green,
                modifier = Modifier.weight(1f),
            )
            StatMetricTile(
                icon = Icons.Filled.PlayArrow,
                label = stringResource(R.string.v792_stats_kpi_total_launches),
                value = totalLaunches.toString(),
                subtitle = null,
                accentColor = colors.red,
                modifier = Modifier.weight(1f),
            )
            StatMetricTile(
                icon = Icons.Filled.SportsEsports,
                label = stringResource(R.string.v792_stats_kpi_avg_session),
                value = formatStatsDuration(averageSessionMs),
                subtitle = null,
                accentColor = colors.green,
                modifier = Modifier.weight(1f),
            )
        }
    }
}

@Composable
private fun StatMetricTile(
    icon: ImageVector,
    label: String,
    value: String,
    subtitle: String?,
    accentColor: Color,
    modifier: Modifier = Modifier,
) {
    val colors = watermelon
    val shape = RoundedCornerShape(12.dp)
    Column(
        modifier = modifier
            .clip(shape)
            .background(colors.surface2)
            .border(1.dp, colors.line.copy(alpha = 0.5f), shape)
            .padding(horizontal = 8.dp, vertical = 9.dp),
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = accentColor,
            modifier = Modifier.size(16.dp),
        )
        Spacer(Modifier.height(6.dp))
        Text(
            text = value,
            color = colors.text,
            fontFamily = SpaceGrotesk,
            fontSize = 13.sp,
            fontWeight = FontWeight.Bold,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
        )
        Text(
            text = label,
            color = colors.text3,
            fontFamily = WatermelonMono,
            fontSize = 9.sp,
            lineHeight = 11.sp,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
        )
        if (subtitle != null) {
            Spacer(Modifier.height(2.dp))
            Text(
                text = subtitle,
                color = accentColor,
                fontFamily = WatermelonMono,
                fontSize = 8.5.sp,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
        }
    }
}

@Composable
private fun InteractiveDailyChartCard(
    points: List<PlayStatsStore.DailyPlayPoint>,
    period: ChartPeriod,
    onPeriodChanged: (ChartPeriod) -> Unit,
    style: ChartStyle,
    onStyleChanged: (ChartStyle) -> Unit,
    accentColor: Color,
) {
    val colors = watermelon
    val shape = RoundedCornerShape(16.dp)
    var selectedPoint by remember { mutableStateOf<PlayStatsStore.DailyPlayPoint?>(null) }
    val maxMs = (points.maxOfOrNull { it.playTimeMs } ?: 0L).coerceAtLeast(60_000L)

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(shape)
            .background(colors.surface)
            .border(1.dp, colors.line, shape)
            .padding(14.dp),
    ) {
        // Chart Header Controls
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
            Spacer(Modifier.width(6.dp))
            Text(
                text = stringResource(R.string.v792_stats_chart_title),
                color = colors.text,
                fontFamily = SpaceGrotesk,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
            )
            Spacer(Modifier.weight(1f))

            // Period Selector
            ChartSmallToggleChip(
                label = stringResource(R.string.v792_stats_chart_period_7d),
                isSelected = period == ChartPeriod.DAYS_7,
                onClick = { onPeriodChanged(ChartPeriod.DAYS_7); selectedPoint = null },
                accentColor = accentColor,
            )
            Spacer(Modifier.width(4.dp))
            ChartSmallToggleChip(
                label = stringResource(R.string.v792_stats_chart_period_30d),
                isSelected = period == ChartPeriod.DAYS_30,
                onClick = { onPeriodChanged(ChartPeriod.DAYS_30); selectedPoint = null },
                accentColor = accentColor,
            )
            Spacer(Modifier.width(8.dp))

            // Style Selector (Bars / Line)
            IconButton(
                onClick = {
                    onStyleChanged(if (style == ChartStyle.BARS) ChartStyle.LINE else ChartStyle.BARS)
                },
                modifier = Modifier.size(28.dp),
            ) {
                Icon(
                    imageVector = if (style == ChartStyle.BARS) Icons.Filled.ShowChart else Icons.Filled.BarChart,
                    contentDescription = null,
                    tint = colors.text2,
                    modifier = Modifier.size(17.dp),
                )
            }
        }

        Spacer(Modifier.height(10.dp))

        // Selected Day Tooltip / Hint
        if (selectedPoint != null) {
            val point = selectedPoint!!
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(8.dp))
                    .background(accentColor.copy(alpha = 0.12f))
                    .border(1.dp, accentColor.copy(alpha = 0.35f), RoundedCornerShape(8.dp))
                    .padding(horizontal = 10.dp, vertical = 6.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                Text(
                    text = stringResource(
                        R.string.v792_stats_chart_tooltip,
                        point.dateKey,
                        formatStatsDuration(point.playTimeMs),
                        point.sessionCount,
                    ),
                    color = colors.text,
                    fontFamily = WatermelonMono,
                    fontSize = 11.sp,
                    fontWeight = FontWeight.SemiBold,
                )
                Icon(
                    imageVector = Icons.Filled.Close,
                    contentDescription = null,
                    tint = colors.text3,
                    modifier = Modifier
                        .size(16.dp)
                        .clickable { selectedPoint = null },
                )
            }
        } else {
            Text(
                text = stringResource(R.string.v792_stats_chart_hint),
                color = colors.text3,
                fontFamily = WatermelonMono,
                fontSize = 9.5.sp,
            )
        }

        Spacer(Modifier.height(12.dp))

        // Custom Canvas Chart
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp),
        ) {
            Canvas(
                modifier = Modifier
                    .fillMaxSize()
                    .pointerInput(points, style) {
                        detectTapGestures { offset ->
                            if (points.isNotEmpty()) {
                                val stepX = size.width.toFloat() / points.size.toFloat()
                                val idx = (offset.x / stepX).toInt().coerceIn(0, points.size - 1)
                                selectedPoint = if (selectedPoint == points[idx]) null else points[idx]
                            }
                        }
                    },
            ) {
                val canvasWidth = size.width
                val canvasHeight = size.height
                val topPadding = 10.dp.toPx()
                val bottomPadding = 12.dp.toPx()
                val chartHeight = canvasHeight - topPadding - bottomPadding

                // Horizontal Grid lines (0%, 33%, 66%, 100%)
                for (step in 0..3) {
                    val y = topPadding + (chartHeight * step / 3f)
                    drawLine(
                        color = colors.line.copy(alpha = 0.45f),
                        start = Offset(0f, y),
                        end = Offset(canvasWidth, y),
                        strokeWidth = 1.dp.toPx(),
                    )
                }

                if (points.isEmpty()) return@Canvas

                val stepX = canvasWidth / points.size.toFloat()

                if (style == ChartStyle.BARS) {
                    val barWidth = (stepX * 0.65f).coerceIn(4.dp.toPx(), 22.dp.toPx())
                    for (i in points.indices) {
                        val pt = points[i]
                        val cx = (i + 0.5f) * stepX
                        val ratio = if (maxMs > 0L) (pt.playTimeMs.toFloat() / maxMs.toFloat()).coerceIn(0.04f, 1f) else 0.04f
                        val barH = ratio * chartHeight
                        val top = canvasHeight - bottomPadding - barH
                        val isSelected = selectedPoint?.dateKey == pt.dateKey

                        val brush = if (pt.playTimeMs > 0L) {
                            Brush.verticalGradient(
                                listOf(
                                    accentColor,
                                    accentColor.copy(alpha = if (isSelected) 0.95f else 0.45f),
                                ),
                                startY = top,
                                endY = canvasHeight - bottomPadding,
                            )
                        } else {
                            Brush.verticalGradient(listOf(colors.surface2, colors.surface2))
                        }

                        drawRoundRect(
                            brush = brush,
                            topLeft = Offset(cx - barWidth / 2f, top),
                            size = Size(barWidth, barH),
                            cornerRadius = CornerRadius(4.dp.toPx(), 4.dp.toPx()),
                        )

                        if (isSelected) {
                            drawRoundRect(
                                color = accentColor,
                                topLeft = Offset(cx - barWidth / 2f - 1.dp.toPx(), top - 1.dp.toPx()),
                                size = Size(barWidth + 2.dp.toPx(), barH + 2.dp.toPx()),
                                cornerRadius = CornerRadius(5.dp.toPx(), 5.dp.toPx()),
                                style = Stroke(width = 1.5.dp.toPx()),
                            )
                        }
                    }
                } else {
                    // Line chart with cubic spline
                    val pointsCoords = mutableListOf<Offset>()
                    for (i in points.indices) {
                        val cx = (i + 0.5f) * stepX
                        val ratio = if (maxMs > 0L) (points[i].playTimeMs.toFloat() / maxMs.toFloat()).coerceIn(0f, 1f) else 0f
                        val cy = canvasHeight - bottomPadding - (ratio * chartHeight)
                        pointsCoords.add(Offset(cx, cy))
                    }

                    if (pointsCoords.size > 1) {
                        val path = Path()
                        val fillPath = Path()

                        path.moveTo(pointsCoords[0].x, pointsCoords[0].y)
                        fillPath.moveTo(pointsCoords[0].x, canvasHeight - bottomPadding)
                        fillPath.lineTo(pointsCoords[0].x, pointsCoords[0].y)

                        for (i in 0 until pointsCoords.size - 1) {
                            val p0 = pointsCoords[i]
                            val p1 = pointsCoords[i + 1]
                            val midX = (p0.x + p1.x) / 2f
                            path.cubicTo(midX, p0.y, midX, p1.y, p1.x, p1.y)
                            fillPath.cubicTo(midX, p0.y, midX, p1.y, p1.x, p1.y)
                        }

                        fillPath.lineTo(pointsCoords.last().x, canvasHeight - bottomPadding)
                        fillPath.close()

                        drawPath(
                            path = fillPath,
                            brush = Brush.verticalGradient(
                                listOf(
                                    accentColor.copy(alpha = 0.35f),
                                    accentColor.copy(alpha = 0.0f),
                                ),
                                startY = topPadding,
                                endY = canvasHeight - bottomPadding,
                            ),
                        )

                        drawPath(
                            path = path,
                            color = accentColor,
                            style = Stroke(width = 2.5.dp.toPx(), cap = StrokeCap.Round, join = StrokeJoin.Round),
                        )

                        for (i in pointsCoords.indices) {
                            val coord = pointsCoords[i]
                            val pt = points[i]
                            val isSelected = selectedPoint?.dateKey == pt.dateKey
                            val r = if (isSelected) 5.5.dp.toPx() else 3.2.dp.toPx()

                            if (isSelected) {
                                drawCircle(
                                    color = accentColor.copy(alpha = 0.35f),
                                    radius = r * 2.2f,
                                    center = coord,
                                )
                            }
                            drawCircle(
                                color = colors.surface,
                                radius = r + 1.dp.toPx(),
                                center = coord,
                            )
                            drawCircle(
                                color = if (pt.playTimeMs > 0L) accentColor else colors.text3,
                                radius = r,
                                center = coord,
                            )
                        }
                    }
                }
            }
        }

        Spacer(Modifier.height(6.dp))

        // X-Axis Date Labels
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            val stepInterval = if (points.size > 14) points.size / 6 else 1
            points.forEachIndexed { index, pt ->
                val showLabel = (index % stepInterval == 0) || (index == points.size - 1)
                if (showLabel) {
                    Text(
                        text = pt.dayLabel,
                        color = if (pt.isToday) accentColor else colors.text3,
                        fontFamily = WatermelonMono,
                        fontSize = 9.sp,
                        fontWeight = if (pt.isToday) FontWeight.Bold else FontWeight.Normal,
                    )
                }
            }
        }
    }
}

@Composable
private fun AnalyticsTabContent(
    summary: PlayStatsStore.PlayerStatsSummary,
    accentColor: Color,
) {
    val colors = watermelon

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp),
    ) {
        // Gaming Biorhythm Card
        item(key = "biorhythm_card") {
            GamingBiorhythmCard(
                timeOfDay = summary.timeOfDay,
                accentColor = accentColor,
            )
        }

        // Platform Breakdown Card
        item(key = "platform_card") {
            PlatformBreakdownCard(
                breakdown = summary.platformBreakdown,
                accentColor = accentColor,
            )
        }

        // Milestones & Records Grid
        item(key = "milestones_grid") {
            MilestonesGridCard(
                milestones = summary.milestones,
                accentColor = accentColor,
            )
        }
    }
}

@Composable
private fun GamingBiorhythmCard(
    timeOfDay: PlayStatsStore.TimeOfDayDistribution,
    accentColor: Color,
) {
    val colors = watermelon
    val shape = RoundedCornerShape(16.dp)
    val totalMs = (timeOfDay.morningMs + timeOfDay.afternoonMs + timeOfDay.eveningMs + timeOfDay.nightMs).coerceAtLeast(1L)

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
                imageVector = Icons.Filled.Schedule,
                contentDescription = null,
                tint = accentColor,
                modifier = Modifier.size(18.dp),
            )
            Spacer(Modifier.width(8.dp))
            Text(
                text = stringResource(R.string.v792_stats_biorhythm_title),
                color = colors.text,
                fontFamily = SpaceGrotesk,
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
            )
        }

        Spacer(Modifier.height(14.dp))

        BiorhythmSlotRow(
            icon = Icons.Filled.Brightness5,
            label = stringResource(R.string.v792_stats_biorhythm_morning),
            durationMs = timeOfDay.morningMs,
            totalMs = totalMs,
            isPeak = timeOfDay.peakPeriod == PlayStatsStore.TimePeriod.MORNING,
            accentColor = colors.green,
        )
        Spacer(Modifier.height(10.dp))
        BiorhythmSlotRow(
            icon = Icons.Filled.WbSunny,
            label = stringResource(R.string.v792_stats_biorhythm_afternoon),
            durationMs = timeOfDay.afternoonMs,
            totalMs = totalMs,
            isPeak = timeOfDay.peakPeriod == PlayStatsStore.TimePeriod.AFTERNOON,
            accentColor = accentColor,
        )
        Spacer(Modifier.height(10.dp))
        BiorhythmSlotRow(
            icon = Icons.Filled.Brightness6,
            label = stringResource(R.string.v792_stats_biorhythm_evening),
            durationMs = timeOfDay.eveningMs,
            totalMs = totalMs,
            isPeak = timeOfDay.peakPeriod == PlayStatsStore.TimePeriod.EVENING,
            accentColor = colors.green,
        )
        Spacer(Modifier.height(10.dp))
        BiorhythmSlotRow(
            icon = Icons.Filled.NightsStay,
            label = stringResource(R.string.v792_stats_biorhythm_night),
            durationMs = timeOfDay.nightMs,
            totalMs = totalMs,
            isPeak = timeOfDay.peakPeriod == PlayStatsStore.TimePeriod.NIGHT,
            accentColor = colors.red,
        )
    }
}

@Composable
private fun BiorhythmSlotRow(
    icon: ImageVector,
    label: String,
    durationMs: Long,
    totalMs: Long,
    isPeak: Boolean,
    accentColor: Color,
) {
    val colors = watermelon
    val pct = (durationMs.toFloat() / totalMs.toFloat() * 100f).coerceIn(0f, 100f)

    Column(modifier = Modifier.fillMaxWidth()) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth(),
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = if (isPeak) accentColor else colors.text3,
                modifier = Modifier.size(15.dp),
            )
            Spacer(Modifier.width(6.dp))
            Text(
                text = label,
                color = colors.text,
                fontFamily = SpaceGrotesk,
                fontSize = 12.sp,
                fontWeight = if (isPeak) FontWeight.Bold else FontWeight.Normal,
                modifier = Modifier.weight(1f),
            )
            Text(
                text = "${formatStatsDuration(durationMs)} (${String.format(Locale.US, "%.0f", pct)}%)",
                color = if (isPeak) accentColor else colors.text2,
                fontFamily = WatermelonMono,
                fontSize = 11.sp,
                fontWeight = if (isPeak) FontWeight.Bold else FontWeight.Normal,
            )
        }
        Spacer(Modifier.height(4.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(5.dp)
                .clip(RoundedCornerShape(3.dp))
                .background(colors.surface2),
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth((pct / 100f).coerceIn(0.02f, 1f))
                    .fillMaxHeight()
                    .clip(RoundedCornerShape(3.dp))
                    .background(if (durationMs > 0L) accentColor else colors.surface2),
            )
        }
    }
}

@Composable
private fun PlatformBreakdownCard(
    breakdown: PlayStatsStore.PlatformBreakdown,
    accentColor: Color,
) {
    val colors = watermelon
    val shape = RoundedCornerShape(16.dp)
    val totalTime = (breakdown.ndsPlayTimeMs + breakdown.dsiPlayTimeMs).coerceAtLeast(1L)
    val dsiPct = (breakdown.dsiPlayTimeMs.toFloat() / totalTime.toFloat()).coerceIn(0f, 1f)
    val ndsPct = (1f - dsiPct).coerceIn(0f, 1f)

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
                imageVector = Icons.Filled.SportsEsports,
                contentDescription = null,
                tint = accentColor,
                modifier = Modifier.size(18.dp),
            )
            Spacer(Modifier.width(8.dp))
            Text(
                text = stringResource(R.string.v792_stats_platform_title),
                color = colors.text,
                fontFamily = SpaceGrotesk,
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
            )
        }

        Spacer(Modifier.height(14.dp))

        // Segmented Dual Bar
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(10.dp)
                .clip(RoundedCornerShape(5.dp))
                .background(colors.surface2),
        ) {
            if (ndsPct > 0.01f) {
                Box(
                    modifier = Modifier
                        .weight(ndsPct.coerceAtLeast(0.01f))
                        .fillMaxHeight()
                        .background(accentColor),
                )
            }
            if (dsiPct > 0.01f) {
                Box(
                    modifier = Modifier
                        .weight(dsiPct.coerceAtLeast(0.01f))
                        .fillMaxHeight()
                        .background(colors.green),
                )
            }
        }

        Spacer(Modifier.height(14.dp))

        // Two Platform Summary Columns
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp),
        ) {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .clip(RoundedCornerShape(12.dp))
                    .background(colors.surface2)
                    .border(1.dp, accentColor.copy(alpha = 0.35f), RoundedCornerShape(12.dp))
                    .padding(10.dp),
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .size(10.dp)
                            .clip(CircleShape)
                            .background(accentColor),
                    )
                    Spacer(Modifier.width(6.dp))
                    Text(
                        text = stringResource(R.string.v792_stats_platform_nds_label),
                        color = colors.text,
                        fontFamily = SpaceGrotesk,
                        fontSize = 12.5.sp,
                        fontWeight = FontWeight.Bold,
                    )
                }
                Spacer(Modifier.height(4.dp))
                Text(
                    text = formatStatsDuration(breakdown.ndsPlayTimeMs),
                    color = accentColor,
                    fontFamily = WatermelonMono,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                )
                Text(
                    text = stringResource(R.string.v792_stats_platform_games_count, breakdown.ndsGamesCount),
                    color = colors.text3,
                    fontFamily = WatermelonMono,
                    fontSize = 9.5.sp,
                )
            }

            Column(
                modifier = Modifier
                    .weight(1f)
                    .clip(RoundedCornerShape(12.dp))
                    .background(colors.surface2)
                    .border(1.dp, colors.green.copy(alpha = 0.35f), RoundedCornerShape(12.dp))
                    .padding(10.dp),
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .size(10.dp)
                            .clip(CircleShape)
                            .background(colors.green),
                    )
                    Spacer(Modifier.width(6.dp))
                    Text(
                        text = stringResource(R.string.v792_stats_platform_dsi_label),
                        color = colors.text,
                        fontFamily = SpaceGrotesk,
                        fontSize = 12.5.sp,
                        fontWeight = FontWeight.Bold,
                    )
                }
                Spacer(Modifier.height(4.dp))
                Text(
                    text = formatStatsDuration(breakdown.dsiPlayTimeMs),
                    color = colors.green,
                    fontFamily = WatermelonMono,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                )
                Text(
                    text = stringResource(R.string.v792_stats_platform_games_count, breakdown.dsiGamesCount),
                    color = colors.text3,
                    fontFamily = WatermelonMono,
                    fontSize = 9.5.sp,
                )
            }
        }
    }
}

@Composable
private fun MilestonesGridCard(
    milestones: List<PlayStatsStore.MilestoneBadge>,
    accentColor: Color,
) {
    val colors = watermelon
    val shape = RoundedCornerShape(16.dp)
    val unlockedCount = milestones.count { it.isUnlocked }

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
                imageVector = Icons.Filled.EmojiEvents,
                contentDescription = null,
                tint = colors.green,
                modifier = Modifier.size(18.dp),
            )
            Spacer(Modifier.width(8.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = stringResource(R.string.v792_stats_milestones_title),
                    color = colors.text,
                    fontFamily = SpaceGrotesk,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                )
                Text(
                    text = stringResource(R.string.v792_stats_milestones_unlocked_count, unlockedCount, milestones.size),
                    color = colors.green,
                    fontFamily = WatermelonMono,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.SemiBold,
                )
            }
        }

        Spacer(Modifier.height(14.dp))

        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            milestones.forEach { ms ->
                MilestoneItemCard(
                    milestone = ms,
                    accentColor = accentColor,
                )
            }
        }
    }
}

@Composable
private fun MilestoneItemCard(
    milestone: PlayStatsStore.MilestoneBadge,
    accentColor: Color,
) {
    val colors = watermelon
    val shape = RoundedCornerShape(12.dp)
    val isUnlocked = milestone.isUnlocked
    val borderBrush = if (isUnlocked) accentColor.copy(alpha = 0.5f) else colors.line.copy(alpha = 0.4f)

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .clip(shape)
            .background(if (isUnlocked) colors.surface2 else colors.surface)
            .border(1.dp, borderBrush, shape)
            .padding(10.dp),
    ) {
        Box(
            modifier = Modifier
                .size(32.dp)
                .clip(CircleShape)
                .background(if (isUnlocked) accentColor.copy(alpha = 0.18f) else colors.surface2),
            contentAlignment = Alignment.Center,
        ) {
            Icon(
                imageVector = if (isUnlocked) Icons.Filled.CheckCircle else Icons.Filled.Lock,
                contentDescription = null,
                tint = if (isUnlocked) accentColor else colors.text3,
                modifier = Modifier.size(18.dp),
            )
        }

        Spacer(Modifier.width(10.dp))

        Column(modifier = Modifier.weight(1f)) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth(),
            ) {
                Text(
                    text = stringResource(milestone.titleRes),
                    color = colors.text,
                    fontFamily = SpaceGrotesk,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.weight(1f),
                )
                Text(
                    text = if (isUnlocked) {
                        stringResource(R.string.v792_stats_ms_unlocked)
                    } else {
                        "${milestone.currentFormatted} / ${milestone.targetFormatted}"
                    },
                    color = if (isUnlocked) colors.green else colors.text3,
                    fontFamily = WatermelonMono,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.SemiBold,
                )
            }

            Spacer(Modifier.height(2.dp))

            Text(
                text = stringResource(milestone.descRes),
                color = colors.text3,
                fontFamily = SpaceGrotesk,
                fontSize = 10.5.sp,
                maxLines = 2,
            )

            if (!isUnlocked) {
                Spacer(Modifier.height(5.dp))
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(4.dp)
                        .clip(RoundedCornerShape(2.dp))
                        .background(colors.surface2),
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth(milestone.progressFraction.coerceIn(0.02f, 1f))
                            .fillMaxHeight()
                            .clip(RoundedCornerShape(2.dp))
                            .background(accentColor),
                    )
                }
            }
        }
    }
}

@Composable
private fun StatGameCard(
    rank: Int,
    item: PlayStatsStore.GameStatItem,
    boxArtUrl: String?,
    progressFraction: Float,
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
                .background(
                    when (rank) {
                        1 -> WatermelonColors.gold.copy(alpha = 0.22f)
                        2 -> barColor.copy(alpha = 0.22f)
                        3 -> colors.green.copy(alpha = 0.22f)
                        else -> colors.surface2
                    }
                ),
            contentAlignment = Alignment.Center,
        ) {
            Text(
                text = "#$rank",
                color = when (rank) {
                    1 -> WatermelonColors.gold
                    2 -> barColor
                    3 -> colors.green
                    else -> colors.text3
                },
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
                Spacer(Modifier.width(6.dp))

                // Platform Badge (NDS / DSi)
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(4.dp))
                        .background(if (item.isDsi) colors.green.copy(alpha = 0.16f) else colors.surface2)
                        .border(
                            1.dp,
                            if (item.isDsi) colors.green.copy(alpha = 0.4f) else colors.line,
                            RoundedCornerShape(4.dp)
                        )
                        .padding(horizontal = 5.dp, vertical = 2.dp),
                ) {
                    Text(
                        text = item.platformLabel,
                        color = if (item.isDsi) colors.green else colors.text2,
                        fontFamily = WatermelonMono,
                        fontSize = 9.sp,
                        fontWeight = FontWeight.Bold,
                    )
                }
            }

            Spacer(Modifier.height(5.dp))

            // Share Progress Bar
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
                    text = "${formatStatsDuration(item.playTimeMs)} · ${stringResource(R.string.v792_stats_share_pct, item.sharePercent)}",
                    color = barColor,
                    fontFamily = WatermelonMono,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.SemiBold,
                )
                Text(
                    text = stringResource(R.string.feature_stats_launches_count, item.launchCount),
                    color = colors.text2,
                    fontFamily = WatermelonMono,
                    fontSize = 9.5.sp,
                )
            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth(),
            ) {
                Text(
                    text = stringResource(R.string.v792_stats_avg_time_val, formatStatsDuration(item.avgSessionMs)),
                    color = colors.text3,
                    fontFamily = WatermelonMono,
                    fontSize = 9.sp,
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
private fun DailySessionsView(
    dailySessions: List<PlayStatsStore.DailySessionLog>,
    accentColor: Color,
) {
    val colors = watermelon
    val context = LocalContext.current
    val timeFormat = remember { SimpleDateFormat("HH:mm", Locale.getDefault()) }

    if (dailySessions.isEmpty()) {
        Box(
            modifier = Modifier.fillMaxSize().padding(24.dp),
            contentAlignment = Alignment.Center,
        ) {
            EmptyStatsCard(
                title = stringResource(R.string.feature_stats_empty_title),
                desc = stringResource(R.string.feature_stats_empty_desc),
            )
        }
        return
    }

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp),
    ) {
        items(dailySessions, key = { it.dayKey }) { dayGroup ->
            val isRu = me.magnum.melonds.utils.RussianPlurals.isRussian(context.resources)
            val sessionCountText = if (isRu) {
                me.magnum.melonds.utils.RussianPlurals.format(dayGroup.sessionCount, "сессия", "сессии", "сессий")
            } else {
                context.getString(if (dayGroup.sessionCount == 1) R.string.feature_stats_session_single else R.string.feature_stats_sessions_count, dayGroup.sessionCount)
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(16.dp))
                    .background(colors.surface)
                    .border(1.dp, colors.line, RoundedCornerShape(16.dp))
                    .padding(14.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = Icons.Filled.DateRange,
                            contentDescription = null,
                            tint = accentColor,
                            modifier = Modifier.size(18.dp)
                        )
                        Spacer(Modifier.width(8.dp))
                        Text(
                            text = dayGroup.dayKey,
                            color = colors.text,
                            fontFamily = SpaceGrotesk,
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                        )
                    }
                    Text(
                        text = "${formatStatsDuration(dayGroup.totalDurationMs)} · $sessionCountText",
                        color = colors.text3,
                        fontFamily = WatermelonMono,
                        fontSize = 11.sp,
                        fontWeight = FontWeight.SemiBold,
                    )
                }

                Spacer(Modifier.height(10.dp))
                Box(Modifier.fillMaxWidth().height(1.dp).background(colors.line.copy(alpha = 0.5f)))
                Spacer(Modifier.height(8.dp))

                dayGroup.sessions.forEach { sess ->
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 6.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                    ) {
                        Column(modifier = Modifier.weight(1f).padding(end = 12.dp)) {
                            Text(
                                text = sess.romName,
                                color = colors.text,
                                fontSize = 13.5.sp,
                                fontWeight = FontWeight.Medium,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                            )
                            Text(
                                text = timeFormat.format(Date(sess.startedAtMs)),
                                color = colors.text3,
                                fontFamily = WatermelonMono,
                                fontSize = 10.sp,
                            )
                        }
                        Text(
                            text = formatStatsDuration(sess.durationMs),
                            color = accentColor,
                            fontFamily = WatermelonMono,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun EmptyStatsCard(
    title: String,
    desc: String,
) {
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
            text = title,
            color = colors.text,
            fontFamily = SpaceGrotesk,
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
        )
        Spacer(Modifier.height(4.dp))
        Text(
            text = desc,
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

@Composable
private fun StatsTabChip(
    label: String,
    isSelected: Boolean,
    onClick: () -> Unit,
    accentColor: Color,
    modifier: Modifier = Modifier,
) {
    val colors = watermelon
    val shape = RoundedCornerShape(20.dp)
    Box(
        modifier = modifier
            .clip(shape)
            .background(if (isSelected) accentColor.copy(alpha = 0.18f) else colors.surface)
            .border(
                width = if (isSelected) 1.5.dp else 1.dp,
                color = if (isSelected) accentColor else colors.line,
                shape = shape,
            )
            .clickable(onClick = onClick)
            .padding(vertical = 7.dp, horizontal = 4.dp),
        contentAlignment = Alignment.Center,
    ) {
        Text(
            text = label,
            color = if (isSelected) accentColor else colors.text2,
            fontSize = 11.5.sp,
            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Center,
        )
    }
}

@Composable
private fun StatsSortChip(
    label: String,
    isSelected: Boolean,
    onClick: () -> Unit,
    accentColor: Color,
    modifier: Modifier = Modifier,
) {
    val colors = watermelon
    val shape = RoundedCornerShape(14.dp)
    Box(
        modifier = modifier
            .clip(shape)
            .background(if (isSelected) accentColor.copy(alpha = 0.18f) else colors.surface)
            .border(
                width = if (isSelected) 1.5.dp else 1.dp,
                color = if (isSelected) accentColor else colors.line,
                shape = shape,
            )
            .clickable(onClick = onClick)
            .padding(vertical = 6.dp, horizontal = 2.dp),
        contentAlignment = Alignment.Center,
    ) {
        Text(
            text = label,
            color = if (isSelected) accentColor else colors.text2,
            fontSize = 10.5.sp,
            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Center,
        )
    }
}

@Composable
private fun StatsFilterPill(
    label: String,
    isSelected: Boolean,
    onClick: () -> Unit,
    accentColor: Color,
) {
    val colors = watermelon
    val shape = RoundedCornerShape(12.dp)
    Box(
        modifier = Modifier
            .clip(shape)
            .background(if (isSelected) accentColor.copy(alpha = 0.18f) else colors.surface2)
            .border(
                width = if (isSelected) 1.dp else 0.5.dp,
                color = if (isSelected) accentColor else colors.line,
                shape = shape,
            )
            .clickable(onClick = onClick)
            .padding(horizontal = 10.dp, vertical = 4.dp),
        contentAlignment = Alignment.Center,
    ) {
        Text(
            text = label,
            color = if (isSelected) accentColor else colors.text2,
            fontSize = 11.sp,
            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal,
        )
    }
}

@Composable
private fun ChartSmallToggleChip(
    label: String,
    isSelected: Boolean,
    onClick: () -> Unit,
    accentColor: Color,
) {
    val colors = watermelon
    val shape = RoundedCornerShape(8.dp)
    Box(
        modifier = Modifier
            .clip(shape)
            .background(if (isSelected) accentColor.copy(alpha = 0.18f) else colors.surface2)
            .border(
                width = 1.dp,
                color = if (isSelected) accentColor else colors.line,
                shape = shape,
            )
            .clickable(onClick = onClick)
            .padding(horizontal = 6.dp, vertical = 3.dp),
        contentAlignment = Alignment.Center,
    ) {
        Text(
            text = label,
            color = if (isSelected) accentColor else colors.text3,
            fontFamily = WatermelonMono,
            fontSize = 9.5.sp,
            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal,
        )
    }
}

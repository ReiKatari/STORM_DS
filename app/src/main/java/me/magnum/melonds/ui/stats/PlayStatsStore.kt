package me.magnum.melonds.ui.stats

import android.content.Context
import android.os.SystemClock
import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import me.magnum.melonds.database.daos.PlayStatsDao
import me.magnum.melonds.database.entities.PlaySessionEntity
import me.magnum.melonds.database.entities.PlayStatsEntity
import me.magnum.melonds.di.entrypoint.PlayStatsEntryPoint
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.ui.romlist.composables.romDisplayName
import org.json.JSONArray
import org.json.JSONObject
import java.io.File
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale
import java.util.concurrent.atomic.AtomicBoolean

object PlayStatsStore {
    private const val TAG = "PlayStatsStore"
    private const val PREFS_NAME = "storm_play_stats"
    private const val KEY_ROM_META_PREFIX = "rom_meta_"
    private const val KEY_DAILY_PLAY_MS_PREFIX = "daily_play_ms_"
    private const val KEY_DAILY_LAUNCHES_PREFIX = "daily_launches_"
    private const val LAUNCH_DEBOUNCE_MS = 3_500L

    private val statsIoScope = CoroutineScope(SupervisorJob() + Dispatchers.IO)
    private val isMigrated = AtomicBoolean(false)

    @Volatile
    private var lastRecordedUri: String? = null

    @Volatile
    private var lastRecordedElapsedMs: Long = 0L

    data class StoredRomStats(
        val uriString: String,
        val displayName: String,
        val gameCode: String,
        val launchCount: Int,
        val recordedPlayTimeMs: Long,
        val lastLaunchedEpochMs: Long,
    )

    data class DailyPlayPoint(
        val dateKey: String,
        val dayLabel: String,
        val playTimeMs: Long,
        val launches: Int,
        val sessionCount: Int,
        val isToday: Boolean,
    )

    data class GameStatItem(
        val uriString: String,
        val displayName: String,
        val gameCode: String,
        val playTimeMs: Long,
        val launchCount: Int,
        val lastPlayedEpochMs: Long,
        val rom: Rom?,
        val sharePercent: Float = 0f,
        val avgSessionMs: Long = 0L,
        val isDsi: Boolean = false,
        val platformLabel: String = "NDS",
    )

    data class DailySessionLog(
        val dayKey: String,
        val sessions: List<PlaySessionEntity>,
        val totalDurationMs: Long,
        val sessionCount: Int,
    )

    enum class TimePeriod {
        MORNING,
        AFTERNOON,
        EVENING,
        NIGHT,
    }

    data class TimeOfDayDistribution(
        val morningMs: Long,
        val afternoonMs: Long,
        val eveningMs: Long,
        val nightMs: Long,
        val peakPeriod: TimePeriod = TimePeriod.EVENING,
    )

    data class PlatformBreakdown(
        val ndsPlayTimeMs: Long,
        val dsiPlayTimeMs: Long,
        val ndsGamesCount: Int,
        val dsiGamesCount: Int,
        val dsiSharePercent: Float,
    )

    data class MilestoneBadge(
        val id: String,
        val titleRes: Int,
        val descRes: Int,
        val isUnlocked: Boolean,
        val progressFraction: Float,
        val currentFormatted: String,
        val targetFormatted: String,
    )

    data class PlayerLevelInfo(
        val level: Int,
        val totalXp: Long,
        val currentLevelXp: Long,
        val nextLevelXp: Long,
        val progressFraction: Float,
        val rankTierIndex: Int,
        val rankTitleRes: Int,
    )

    data class PlayerStatsSummary(
        val totalPlayTimeMs: Long,
        val gamesPlayedCount: Int,
        val totalLaunches: Int,
        val last7Days: List<DailyPlayPoint>,
        val last30Days: List<DailyPlayPoint>,
        val dailyChart: List<DailyPlayPoint>,
        val currentStreakDays: Int,
        val bestStreakDays: Int,
        val averageSessionMs: Long,
        val longestSessionMs: Long,
        val totalSessionsCount: Int,
        val levelInfo: PlayerLevelInfo,
        val timeOfDay: TimeOfDayDistribution,
        val platformBreakdown: PlatformBreakdown,
        val milestones: List<MilestoneBadge>,
        val allGames: List<GameStatItem>,
        val topByPlayTime: List<GameStatItem>,
        val topByLaunches: List<GameStatItem>,
        val topRecent: List<GameStatItem> = emptyList(),
    )

    private fun getDao(context: Context): PlayStatsDao {
        val entryPoint = PlayStatsEntryPoint.resolve(context)
        val dao = entryPoint.database().playStatsDao()
        checkAndPerformMigration(context, dao)
        return dao
    }

    private fun checkAndPerformMigration(context: Context, dao: PlayStatsDao) {
        if (isMigrated.get()) return
        val prefs = context.applicationContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        if (prefs.getBoolean("migrated_to_room_v10", false)) {
            isMigrated.set(true)
            return
        }
        statsIoScope.launch {
            try {
                val allEntries = prefs.all
                val entitiesToMigrate = mutableListOf<PlayStatsEntity>()
                for ((key, value) in allEntries) {
                    if (key.startsWith(KEY_ROM_META_PREFIX) && value is String) {
                        val uriStr = key.removePrefix(KEY_ROM_META_PREFIX)
                        parseStoredRomStats(uriStr, value)?.let { stored ->
                            entitiesToMigrate.add(
                                PlayStatsEntity(
                                    romUri = uriStr,
                                    romName = stored.displayName,
                                    gameCode = stored.gameCode,
                                    launchCount = stored.launchCount,
                                    totalPlayTimeMs = stored.recordedPlayTimeMs,
                                    lastPlayedEpochMs = stored.lastLaunchedEpochMs,
                                )
                            )
                        }
                    }
                }
                if (entitiesToMigrate.isNotEmpty()) {
                    dao.insertAllStats(entitiesToMigrate)
                }
                prefs.edit().putBoolean("migrated_to_room_v10", true).apply()
                isMigrated.set(true)
            } catch (e: Throwable) {
                Log.e(TAG, "Failed to migrate stats from SharedPreferences to Room", e)
            }
        }
    }

    fun recordLaunch(context: Context, rom: Rom) {
        recordLaunchByUri(
            context = context,
            uriString = rom.uri.toString(),
            displayName = romDisplayName(rom).ifBlank { rom.name },
            gameCode = rom.gameCode,
        )
    }

    fun recordLaunchByUri(
        context: Context,
        uriString: String,
        displayName: String? = null,
        gameCode: String? = null,
    ) {
        if (uriString.isBlank()) return
        val nowElapsed = SystemClock.elapsedRealtime()
        if (uriString == lastRecordedUri && (nowElapsed - lastRecordedElapsedMs) in 0..LAUNCH_DEBOUNCE_MS) {
            return
        }
        lastRecordedUri = uriString
        lastRecordedElapsedMs = nowElapsed

        val appContext = context.applicationContext
        val nowEpoch = System.currentTimeMillis()
        statsIoScope.launch {
            runCatching {
                val dao = getDao(appContext)
                val existing = dao.getPlayStatsForRom(uriString)
                val updated = PlayStatsEntity(
                    romUri = uriString,
                    romName = displayName?.takeIf { it.isNotBlank() } ?: existing?.romName ?: "ROM",
                    gameCode = gameCode?.takeIf { it.isNotBlank() } ?: existing?.gameCode.orEmpty(),
                    launchCount = (existing?.launchCount ?: 0) + 1,
                    totalPlayTimeMs = existing?.totalPlayTimeMs ?: 0L,
                    lastPlayedEpochMs = nowEpoch,
                )
                dao.upsertPlayStats(updated)

                val prefs = appContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
                val todayKey = isoDayFormat().format(Date(nowEpoch))
                val todayLaunchesKey = KEY_DAILY_LAUNCHES_PREFIX + todayKey
                prefs.edit().putInt(todayLaunchesKey, prefs.getInt(todayLaunchesKey, 0) + 1).apply()
            }.onFailure {
                Log.e(TAG, "Failed to record launch for $uriString", it)
            }
        }
    }

    fun recordPlayTime(
        context: Context,
        rom: Rom,
        deltaMs: Long,
    ) {
        if (deltaMs <= 0L) return
        val appContext = context.applicationContext
        val uriString = rom.uri.toString()
        val resolvedName = romDisplayName(rom).ifBlank { rom.name }
        val resolvedCode = rom.gameCode
        val nowEpoch = System.currentTimeMillis()
        statsIoScope.launch {
            runCatching {
                val dao = getDao(appContext)
                val existing = dao.getPlayStatsForRom(uriString)
                val updated = PlayStatsEntity(
                    romUri = uriString,
                    romName = resolvedName.ifBlank { existing?.romName ?: "ROM" },
                    gameCode = resolvedCode.ifBlank { existing?.gameCode.orEmpty() },
                    launchCount = maxOf(existing?.launchCount ?: 0, 1),
                    totalPlayTimeMs = (existing?.totalPlayTimeMs ?: 0L) + deltaMs,
                    lastPlayedEpochMs = maxOf(existing?.lastPlayedEpochMs ?: 0L, nowEpoch),
                )
                dao.upsertPlayStats(updated)

                val sessionDayKey = SimpleDateFormat("dd.MM.yyyy", Locale.US).format(Date(nowEpoch))
                val session = PlaySessionEntity(
                    dayKey = sessionDayKey,
                    romUri = uriString,
                    romName = updated.romName,
                    startedAtMs = nowEpoch - deltaMs,
                    durationMs = deltaMs,
                )
                dao.insertSession(session)

                val prefs = appContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
                val todayKey = isoDayFormat().format(Date(nowEpoch))
                val todayPlayKey = KEY_DAILY_PLAY_MS_PREFIX + todayKey
                val todayPlayMs = prefs.getLong(todayPlayKey, 0L) + deltaMs
                prefs.edit().putLong(todayPlayKey, todayPlayMs).apply()
            }.onFailure {
                Log.e(TAG, "Failed to record play time for $uriString", it)
            }
        }
    }

    suspend fun getDailySessionLogs(context: Context): List<DailySessionLog> = withContext(Dispatchers.IO) {
        runCatching {
            val dao = getDao(context)
            val allSessions = dao.getAllSessions()
            allSessions.groupBy { it.dayKey }
                .map { (day, sessions) ->
                    DailySessionLog(
                        dayKey = day,
                        sessions = sessions,
                        totalDurationMs = sessions.sumOf { it.durationMs },
                        sessionCount = sessions.size,
                    )
                }
        }.getOrDefault(emptyList())
    }

    fun isDsiGame(gameCode: String, displayName: String): Boolean {
        val upperCode = gameCode.trim().uppercase(Locale.US)
        val firstChar = upperCode.firstOrNull()
        val codeMatch = firstChar == 'T' || firstChar == 'H' || firstChar == 'K'
        val nameMatch = displayName.contains("DSi", ignoreCase = true)
        return codeMatch || nameMatch
    }

    private fun toDayNumber(epochMs: Long): Long {
        val cal = Calendar.getInstance()
        cal.timeInMillis = epochMs
        cal.set(Calendar.HOUR_OF_DAY, 0)
        cal.set(Calendar.MINUTE, 0)
        cal.set(Calendar.SECOND, 0)
        cal.set(Calendar.MILLISECOND, 0)
        return cal.timeInMillis / 86_400_000L
    }

    fun buildSummary(context: Context, roms: List<Rom>): PlayerStatsSummary {
        val appContext = context.applicationContext
        val prefs = appContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

        val storedByUri = mutableMapOf<String, StoredRomStats>()
        var allSessions: List<PlaySessionEntity> = emptyList()
        var unlockedAchievementsCount = 0

        runCatching {
            val db = PlayStatsEntryPoint.resolve(appContext).database()
            val dao = db.playStatsDao()
            val roomStats = kotlinx.coroutines.runBlocking(Dispatchers.IO) { dao.getAllPlayStats() }
            allSessions = kotlinx.coroutines.runBlocking(Dispatchers.IO) { dao.getAllSessions() }

            unlockedAchievementsCount = runCatching {
                val cursor = db.openHelper.readableDatabase.query("SELECT COUNT(*) FROM ra_user_achievement WHERE is_unlocked = 1")
                cursor.use { if (it.moveToFirst()) it.getInt(0) else 0 }
            }.getOrDefault(0)

            if (roomStats.isNotEmpty()) {
                for (stat in roomStats) {
                    storedByUri[stat.romUri] = StoredRomStats(
                        uriString = stat.romUri,
                        displayName = stat.romName,
                        gameCode = stat.gameCode,
                        launchCount = stat.launchCount,
                        recordedPlayTimeMs = stat.totalPlayTimeMs,
                        lastLaunchedEpochMs = stat.lastPlayedEpochMs,
                    )
                }
            }
        }

        if (storedByUri.isEmpty()) {
            val allEntries = prefs.all
            for ((key, value) in allEntries) {
                if (key.startsWith(KEY_ROM_META_PREFIX) && value is String) {
                    val uriStr = key.removePrefix(KEY_ROM_META_PREFIX)
                    parseStoredRomStats(uriStr, value)?.let { storedByUri[uriStr] = it }
                }
            }
        }

        val romByUri = roms.associateBy { it.uri.toString() }
        val allKnownUris = (romByUri.keys + storedByUri.keys).toSet()

        val rawItems = mutableListOf<GameStatItem>()
        for (uriStr in allKnownUris) {
            val rom = romByUri[uriStr]
            val stored = storedByUri[uriStr]
            val repoPlayMs = rom?.totalPlayTime?.inWholeMilliseconds ?: 0L
            val effectivePlayMs = maxOf(repoPlayMs, stored?.recordedPlayTimeMs ?: 0L)
            val repoLastPlayedMs = rom?.lastPlayed?.time ?: 0L
            val effectiveLastPlayedMs = maxOf(repoLastPlayedMs, stored?.lastLaunchedEpochMs ?: 0L)
            val hasBeenPlayed = effectivePlayMs > 0L || effectiveLastPlayedMs > 0L || (stored?.launchCount ?: 0) > 0
            if (!hasBeenPlayed) continue

            val effectiveLaunches = maxOf(stored?.launchCount ?: 0, 1)
            val name = when {
                rom != null -> romDisplayName(rom).ifBlank { rom.name }
                !stored?.displayName.isNullOrBlank() -> stored.displayName
                else -> "ROM"
            }
            val code = rom?.gameCode?.takeIf { it.isNotBlank() } ?: stored?.gameCode.orEmpty()
            rawItems.add(
                GameStatItem(
                    uriString = uriStr,
                    displayName = name,
                    gameCode = code,
                    playTimeMs = effectivePlayMs,
                    launchCount = effectiveLaunches,
                    lastPlayedEpochMs = effectiveLastPlayedMs,
                    rom = rom,
                )
            )
        }

        val totalPlayTimeMs = rawItems.sumOf { it.playTimeMs }
        val gamesPlayedCount = rawItems.size
        val totalLaunches = rawItems.sumOf { it.launchCount }

        // Enrich items with share, avgSession, isDsi
        val mergedItems = rawItems.map { item ->
            val share = if (totalPlayTimeMs > 0L) {
                (item.playTimeMs.toFloat() / totalPlayTimeMs.toFloat() * 100f).coerceIn(0f, 100f)
            } else {
                0f
            }
            val avg = item.playTimeMs / item.launchCount.coerceAtLeast(1)
            val dsi = isDsiGame(item.gameCode, item.displayName)
            item.copy(
                sharePercent = share,
                avgSessionMs = avg,
                isDsi = dsi,
                platformLabel = if (dsi) "DSi" else "NDS",
            )
        }

        // Streaks calculation
        val activeDaysSet = mutableSetOf<Long>()
        for (sess in allSessions) {
            if (sess.durationMs > 0L) {
                activeDaysSet.add(toDayNumber(sess.startedAtMs))
            }
        }
        for ((key, value) in prefs.all) {
            if (key.startsWith(KEY_DAILY_PLAY_MS_PREFIX) && (value as? Long ?: 0L) > 0L) {
                val datePart = key.removePrefix(KEY_DAILY_PLAY_MS_PREFIX)
                val epoch = runCatching {
                    if (datePart.contains("-")) {
                        SimpleDateFormat("yyyy-MM-dd", Locale.US).parse(datePart)?.time
                    } else {
                        SimpleDateFormat("dd.MM.yyyy", Locale.US).parse(datePart)?.time
                    }
                }.getOrNull()
                if (epoch != null) {
                    activeDaysSet.add(toDayNumber(epoch))
                }
            }
        }
        for (item in mergedItems) {
            if (item.lastPlayedEpochMs > 0L && item.playTimeMs > 0L) {
                activeDaysSet.add(toDayNumber(item.lastPlayedEpochMs))
            }
        }

        val todayNum = toDayNumber(System.currentTimeMillis())
        val yesterdayNum = todayNum - 1L

        var currentStreakDays = 0
        val streakStartDay = when {
            todayNum in activeDaysSet -> todayNum
            yesterdayNum in activeDaysSet -> yesterdayNum
            else -> null
        }
        if (streakStartDay != null) {
            var checkDay = streakStartDay
            while (checkDay in activeDaysSet) {
                currentStreakDays++
                checkDay--
            }
        }

        val sortedDays = activeDaysSet.sorted()
        var maxStreak = 0
        var currentRun = 0
        var lastDay: Long? = null
        for (d in sortedDays) {
            if (lastDay != null && d == lastDay + 1L) {
                currentRun++
            } else {
                currentRun = 1
            }
            if (currentRun > maxStreak) {
                maxStreak = currentRun
            }
            lastDay = d
        }
        val bestStreakDays = maxOf(maxStreak, currentStreakDays)

        // Session metrics
        val totalSessionsCount = maxOf(allSessions.size, totalLaunches)
        val longestSessionMs = if (allSessions.isNotEmpty()) {
            allSessions.maxOfOrNull { it.durationMs } ?: 0L
        } else {
            mergedItems.maxOfOrNull { it.playTimeMs } ?: 0L
        }
        val averageSessionMs = if (allSessions.isNotEmpty()) {
            allSessions.sumOf { it.durationMs } / allSessions.size.coerceAtLeast(1)
        } else if (totalLaunches > 0) {
            totalPlayTimeMs / totalLaunches
        } else {
            0L
        }

        // Daily points for 7 and 30 days
        fun computeDailyPoints(days: Int): List<DailyPlayPoint> {
            val list = mutableListOf<DailyPlayPoint>()
            for (daysAgo in (days - 1) downTo 0) {
                val c = Calendar.getInstance().apply {
                    add(Calendar.DAY_OF_YEAR, -daysAgo)
                    set(Calendar.HOUR_OF_DAY, 0)
                    set(Calendar.MINUTE, 0)
                    set(Calendar.SECOND, 0)
                    set(Calendar.MILLISECOND, 0)
                }
                val date = c.time
                val dotKey = SimpleDateFormat("dd.MM.yyyy", Locale.US).format(date)
                val isoKey = SimpleDateFormat("yyyy-MM-dd", Locale.US).format(date)
                val dayLabel = SimpleDateFormat("dd.MM", Locale.getDefault()).format(date)
                val dayNum = c.timeInMillis / 86_400_000L

                val matchingSessions = allSessions.filter { sess ->
                    sess.dayKey == dotKey || sess.dayKey == isoKey || toDayNumber(sess.startedAtMs) == dayNum
                }
                val sessionSumMs = matchingSessions.sumOf { it.durationMs }
                val sessionCount = matchingSessions.size

                val legacyPlayMs = maxOf(
                    prefs.getLong(KEY_DAILY_PLAY_MS_PREFIX + isoKey, 0L),
                    prefs.getLong(KEY_DAILY_PLAY_MS_PREFIX + dotKey, 0L),
                )
                val legacyLaunches = maxOf(
                    prefs.getInt(KEY_DAILY_LAUNCHES_PREFIX + isoKey, 0),
                    prefs.getInt(KEY_DAILY_LAUNCHES_PREFIX + dotKey, 0),
                )

                var dayPlayMs = maxOf(sessionSumMs, legacyPlayMs)
                if (dayPlayMs == 0L) {
                    val fallbackMs = mergedItems
                        .filter { it.lastPlayedEpochMs > 0L && toDayNumber(it.lastPlayedEpochMs) == dayNum }
                        .sumOf { it.playTimeMs }
                    if (fallbackMs > 0L) {
                        dayPlayMs = fallbackMs
                    }
                }
                val dayLaunches = maxOf(sessionCount, legacyLaunches)

                list.add(
                    DailyPlayPoint(
                        dateKey = dotKey,
                        dayLabel = dayLabel,
                        playTimeMs = dayPlayMs,
                        launches = dayLaunches,
                        sessionCount = maxOf(sessionCount, if (dayPlayMs > 0L) 1 else 0),
                        isToday = daysAgo == 0,
                    )
                )
            }
            return list
        }

        val last7Days = computeDailyPoints(7)
        val last30Days = computeDailyPoints(30)

        // Player Level, XP & Rank Tier
        val totalXp = (totalPlayTimeMs / 60_000L) * 12L +
            totalLaunches * 15L +
            currentStreakDays * 80L +
            bestStreakDays * 40L +
            gamesPlayedCount * 50L +
            unlockedAchievementsCount * 60L

        var level = 1
        var remainingXp = totalXp
        fun xpForLevel(lvl: Int): Long = 500L + (lvl - 1) * 200L

        while (remainingXp >= xpForLevel(level)) {
            remainingXp -= xpForLevel(level)
            level++
        }
        val currentLevelXp = remainingXp
        val nextLevelXp = xpForLevel(level)
        val progressFraction = (currentLevelXp.toFloat() / nextLevelXp.toFloat()).coerceIn(0f, 1f)

        val rankTierIndex = when {
            level >= 50 -> 7
            level >= 40 -> 6
            level >= 30 -> 5
            level >= 20 -> 4
            level >= 15 -> 3
            level >= 10 -> 2
            level >= 5  -> 1
            else        -> 0
        }

        val rankTitleRes = when (rankTierIndex) {
            0 -> me.magnum.melonds.R.string.v792_stats_rank_0
            1 -> me.magnum.melonds.R.string.v792_stats_rank_1
            2 -> me.magnum.melonds.R.string.v792_stats_rank_2
            3 -> me.magnum.melonds.R.string.v792_stats_rank_3
            4 -> me.magnum.melonds.R.string.v792_stats_rank_4
            5 -> me.magnum.melonds.R.string.v792_stats_rank_5
            6 -> me.magnum.melonds.R.string.v792_stats_rank_6
            else -> me.magnum.melonds.R.string.v792_stats_rank_7
        }

        val levelInfo = PlayerLevelInfo(
            level = level,
            totalXp = totalXp,
            currentLevelXp = currentLevelXp,
            nextLevelXp = nextLevelXp,
            progressFraction = progressFraction,
            rankTierIndex = rankTierIndex,
            rankTitleRes = rankTitleRes,
        )

        // Time-of-Day distribution
        var morningMs = 0L
        var afternoonMs = 0L
        var eveningMs = 0L
        var nightMs = 0L

        val hourCal = Calendar.getInstance()
        if (allSessions.isNotEmpty()) {
            for (s in allSessions) {
                hourCal.timeInMillis = s.startedAtMs
                when (hourCal.get(Calendar.HOUR_OF_DAY)) {
                    in 6..11 -> morningMs += s.durationMs
                    in 12..17 -> afternoonMs += s.durationMs
                    in 18..23 -> eveningMs += s.durationMs
                    else -> nightMs += s.durationMs
                }
            }
        } else {
            for (item in mergedItems) {
                if (item.lastPlayedEpochMs > 0L) {
                    hourCal.timeInMillis = item.lastPlayedEpochMs
                    when (hourCal.get(Calendar.HOUR_OF_DAY)) {
                        in 6..11 -> morningMs += item.playTimeMs
                        in 12..17 -> afternoonMs += item.playTimeMs
                        in 18..23 -> eveningMs += item.playTimeMs
                        else -> nightMs += item.playTimeMs
                    }
                }
            }
        }

        val peakPeriod = when (maxOf(morningMs, afternoonMs, eveningMs, nightMs)) {
            morningMs -> TimePeriod.MORNING
            afternoonMs -> TimePeriod.AFTERNOON
            eveningMs -> TimePeriod.EVENING
            else -> TimePeriod.NIGHT
        }
        val timeOfDay = TimeOfDayDistribution(
            morningMs = morningMs,
            afternoonMs = afternoonMs,
            eveningMs = eveningMs,
            nightMs = nightMs,
            peakPeriod = peakPeriod,
        )

        // Platform breakdown
        var ndsPlayTimeMs = 0L
        var dsiPlayTimeMs = 0L
        var ndsGamesCount = 0
        var dsiGamesCount = 0

        for (item in mergedItems) {
            if (item.isDsi) {
                dsiPlayTimeMs += item.playTimeMs
                dsiGamesCount++
            } else {
                ndsPlayTimeMs += item.playTimeMs
                ndsGamesCount++
            }
        }
        val totalPlatformTime = (ndsPlayTimeMs + dsiPlayTimeMs).coerceAtLeast(1L)
        val dsiSharePercent = (dsiPlayTimeMs.toFloat() / totalPlatformTime.toFloat() * 100f).coerceIn(0f, 100f)
        val platformBreakdown = PlatformBreakdown(
            ndsPlayTimeMs = ndsPlayTimeMs,
            dsiPlayTimeMs = dsiPlayTimeMs,
            ndsGamesCount = ndsGamesCount,
            dsiGamesCount = dsiGamesCount,
            dsiSharePercent = dsiSharePercent,
        )

        // Milestones
        val milestones = listOf(
            MilestoneBadge(
                id = "first_launch",
                titleRes = me.magnum.melonds.R.string.v792_stats_ms_first_launch_title,
                descRes = me.magnum.melonds.R.string.v792_stats_ms_first_launch_desc,
                isUnlocked = totalLaunches >= 1,
                progressFraction = (totalLaunches / 1f).coerceIn(0f, 1f),
                currentFormatted = totalLaunches.coerceAtMost(1).toString(),
                targetFormatted = "1",
            ),
            MilestoneBadge(
                id = "play_5h",
                titleRes = me.magnum.melonds.R.string.v792_stats_ms_5h_title,
                descRes = me.magnum.melonds.R.string.v792_stats_ms_5h_desc,
                isUnlocked = totalPlayTimeMs >= 5 * 3600_000L,
                progressFraction = (totalPlayTimeMs.toFloat() / (5 * 3600_000L).toFloat()).coerceIn(0f, 1f),
                currentFormatted = "${(totalPlayTimeMs / 3600_000L).coerceAtMost(5L)}h",
                targetFormatted = "5h",
            ),
            MilestoneBadge(
                id = "play_25h",
                titleRes = me.magnum.melonds.R.string.v792_stats_ms_25h_title,
                descRes = me.magnum.melonds.R.string.v792_stats_ms_25h_desc,
                isUnlocked = totalPlayTimeMs >= 25 * 3600_000L,
                progressFraction = (totalPlayTimeMs.toFloat() / (25 * 3600_000L).toFloat()).coerceIn(0f, 1f),
                currentFormatted = "${(totalPlayTimeMs / 3600_000L).coerceAtMost(25L)}h",
                targetFormatted = "25h",
            ),
            MilestoneBadge(
                id = "streak_3d",
                titleRes = me.magnum.melonds.R.string.v792_stats_ms_streak_3d_title,
                descRes = me.magnum.melonds.R.string.v792_stats_ms_streak_3d_desc,
                isUnlocked = bestStreakDays >= 3,
                progressFraction = (bestStreakDays / 3f).coerceIn(0f, 1f),
                currentFormatted = bestStreakDays.coerceAtMost(3).toString(),
                targetFormatted = "3",
            ),
            MilestoneBadge(
                id = "streak_7d",
                titleRes = me.magnum.melonds.R.string.v792_stats_ms_streak_7d_title,
                descRes = me.magnum.melonds.R.string.v792_stats_ms_streak_7d_desc,
                isUnlocked = bestStreakDays >= 7,
                progressFraction = (bestStreakDays / 7f).coerceIn(0f, 1f),
                currentFormatted = bestStreakDays.coerceAtMost(7).toString(),
                targetFormatted = "7",
            ),
            MilestoneBadge(
                id = "lib_10",
                titleRes = me.magnum.melonds.R.string.v792_stats_ms_lib_10_title,
                descRes = me.magnum.melonds.R.string.v792_stats_ms_lib_10_desc,
                isUnlocked = gamesPlayedCount >= 10,
                progressFraction = (gamesPlayedCount / 10f).coerceIn(0f, 1f),
                currentFormatted = gamesPlayedCount.coerceAtMost(10).toString(),
                targetFormatted = "10",
            ),
            MilestoneBadge(
                id = "marathon_2h",
                titleRes = me.magnum.melonds.R.string.v792_stats_ms_session_2h_title,
                descRes = me.magnum.melonds.R.string.v792_stats_ms_session_2h_desc,
                isUnlocked = longestSessionMs >= 2 * 3600_000L,
                progressFraction = (longestSessionMs.toFloat() / (2 * 3600_000L).toFloat()).coerceIn(0f, 1f),
                currentFormatted = "${(longestSessionMs / 60_000L).coerceAtMost(120L)}m",
                targetFormatted = "120m",
            ),
            MilestoneBadge(
                id = "sessions_50",
                titleRes = me.magnum.melonds.R.string.v792_stats_ms_sessions_50_title,
                descRes = me.magnum.melonds.R.string.v792_stats_ms_sessions_50_desc,
                isUnlocked = totalSessionsCount >= 50,
                progressFraction = (totalSessionsCount / 50f).coerceIn(0f, 1f),
                currentFormatted = totalSessionsCount.coerceAtMost(50).toString(),
                targetFormatted = "50",
            ),
        )

        val topByPlayTime = mergedItems
            .sortedWith(compareByDescending<GameStatItem> { it.playTimeMs }.thenByDescending { it.launchCount })

        val topByLaunches = mergedItems
            .sortedWith(compareByDescending<GameStatItem> { it.launchCount }.thenByDescending { it.playTimeMs })

        val topRecent = mergedItems
            .filter { it.lastPlayedEpochMs > 0L }
            .sortedWith(compareByDescending<GameStatItem> { it.lastPlayedEpochMs }.thenByDescending { it.playTimeMs })

        return PlayerStatsSummary(
            totalPlayTimeMs = totalPlayTimeMs,
            gamesPlayedCount = gamesPlayedCount,
            totalLaunches = totalLaunches,
            last7Days = last7Days,
            last30Days = last30Days,
            dailyChart = last7Days,
            currentStreakDays = currentStreakDays,
            bestStreakDays = bestStreakDays,
            averageSessionMs = averageSessionMs,
            longestSessionMs = longestSessionMs,
            totalSessionsCount = totalSessionsCount,
            levelInfo = levelInfo,
            timeOfDay = timeOfDay,
            platformBreakdown = platformBreakdown,
            milestones = milestones,
            allGames = mergedItems,
            topByPlayTime = topByPlayTime,
            topByLaunches = topByLaunches,
            topRecent = topRecent,
        )
    }

    suspend fun exportToJson(context: Context): File = withContext(Dispatchers.IO) {
        val summary = buildSummary(context, emptyList())
        val dao = getDao(context)
        val sessions = dao.getAllSessions()

        val rootObj = JSONObject().apply {
            put("app", "STORM DS")
            put("appVersion", "7.9.3")
            put("exportedAt", SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).format(Date()))
            put("playerLevel", summary.levelInfo.level)
            put("totalXp", summary.levelInfo.totalXp)
            put("rankTier", summary.levelInfo.rankTierIndex)
            put("currentStreakDays", summary.currentStreakDays)
            put("bestStreakDays", summary.bestStreakDays)
            put("totalPlayTimeMs", summary.totalPlayTimeMs)
            put("averageSessionMinutes", summary.averageSessionMs / 60_000L)
            put("longestSessionMinutes", summary.longestSessionMs / 60_000L)
            put("totalLaunches", summary.totalLaunches)
            put("totalSessionsCount", summary.totalSessionsCount)

            put(
                "timeOfDayBreakdown",
                JSONObject().apply {
                    put("morningMs", summary.timeOfDay.morningMs)
                    put("afternoonMs", summary.timeOfDay.afternoonMs)
                    put("eveningMs", summary.timeOfDay.eveningMs)
                    put("nightMs", summary.timeOfDay.nightMs)
                    put("peakPeriod", summary.timeOfDay.peakPeriod.name)
                }
            )

            put(
                "platformBreakdown",
                JSONObject().apply {
                    put("ndsPlayTimeMs", summary.platformBreakdown.ndsPlayTimeMs)
                    put("dsiPlayTimeMs", summary.platformBreakdown.dsiPlayTimeMs)
                    put("ndsGamesCount", summary.platformBreakdown.ndsGamesCount)
                    put("dsiGamesCount", summary.platformBreakdown.dsiGamesCount)
                    put("dsiSharePercent", summary.platformBreakdown.dsiSharePercent.toDouble())
                }
            )

            val statsArr = JSONArray()
            summary.allGames.forEach { s ->
                statsArr.put(
                    JSONObject().apply {
                        put("romUri", s.uriString)
                        put("romName", s.displayName)
                        put("gameCode", s.gameCode)
                        put("platform", s.platformLabel)
                        put("isDsi", s.isDsi)
                        put("launchCount", s.launchCount)
                        put("totalPlayTimeMs", s.playTimeMs)
                        put("sharePercent", s.sharePercent.toDouble())
                        put("avgSessionMinutes", s.avgSessionMs / 60_000L)
                        put("lastPlayedEpochMs", s.lastPlayedEpochMs)
                    }
                )
            }
            put("stats", statsArr)

            val sessArr = JSONArray()
            sessions.forEach { sess ->
                sessArr.put(
                    JSONObject().apply {
                        put("dayKey", sess.dayKey)
                        put("romUri", sess.romUri)
                        put("romName", sess.romName)
                        put("startedAtMs", sess.startedAtMs)
                        put("durationMs", sess.durationMs)
                    }
                )
            }
            put("sessions", sessArr)
        }

        val exportDir = File(android.os.Environment.getExternalStorageDirectory(), "STORM DS/exports").apply { mkdirs() }
        val targetDir = if (exportDir.exists() && exportDir.canWrite()) exportDir else File(context.filesDir, "exports").apply { mkdirs() }
        val dateTag = SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(Date())
        val file = File(targetDir, "storm_ds_stats_$dateTag.json")
        file.writeText(rootObj.toString(2))
        file
    }

    suspend fun exportToCsv(context: Context): File = withContext(Dispatchers.IO) {
        val summary = buildSummary(context, emptyList())
        val dao = getDao(context)
        val sessions = dao.getAllSessions()

        val exportDir = File(android.os.Environment.getExternalStorageDirectory(), "STORM DS/exports").apply { mkdirs() }
        val targetDir = if (exportDir.exists() && exportDir.canWrite()) exportDir else File(context.filesDir, "exports").apply { mkdirs() }
        val dateTag = SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(Date())
        val file = File(targetDir, "storm_ds_stats_$dateTag.csv")

        val sb = StringBuilder()
        val exportTime = SimpleDateFormat("dd.MM.yyyy HH:mm:ss", Locale.US).format(Date())
        sb.append("# STORM DS 7.9.3 - Extended Player Statistics Export\n")
        sb.append("Exported At,Player Level,Total XP,Rank Tier,Current Streak (days),Best Streak (days),Total Play Time (min),Average Session (min),Total Launches,Total Sessions\n")
        sb.append("\"$exportTime\",${summary.levelInfo.level},${summary.levelInfo.totalXp},${summary.levelInfo.rankTierIndex},${summary.currentStreakDays},${summary.bestStreakDays},${summary.totalPlayTimeMs / 60000L},${summary.averageSessionMs / 60000L},${summary.totalLaunches},${summary.totalSessionsCount}\n\n")

        sb.append("Biorhythm,Morning (min),Afternoon (min),Evening (min),Night (min),Peak Period\n")
        sb.append("Minutes,${summary.timeOfDay.morningMs / 60000L},${summary.timeOfDay.afternoonMs / 60000L},${summary.timeOfDay.eveningMs / 60000L},${summary.timeOfDay.nightMs / 60000L},\"${summary.timeOfDay.peakPeriod.name}\"\n\n")

        sb.append("Platform,Nintendo DS Time (min),Nintendo DS Games,Nintendo DSi Time (min),Nintendo DSi Games,DSi Share (%)\n")
        sb.append("Summary,${summary.platformBreakdown.ndsPlayTimeMs / 60000L},${summary.platformBreakdown.ndsGamesCount},${summary.platformBreakdown.dsiPlayTimeMs / 60000L},${summary.platformBreakdown.dsiGamesCount},${String.format(Locale.US, "%.1f", summary.platformBreakdown.dsiSharePercent)}\n\n")

        sb.append("Type,ROM Name,Game Code,Platform,Duration (ms),Duration (min),Share (%),Launches,Avg Session (min),Last Played Date,Started At\n")
        summary.allGames.forEach { s ->
            val mins = s.playTimeMs / 60000L
            val avgMins = s.avgSessionMs / 60000L
            val lastDate = if (s.lastPlayedEpochMs > 0) SimpleDateFormat("dd.MM.yyyy HH:mm", Locale.US).format(Date(s.lastPlayedEpochMs)) else ""
            val shareStr = String.format(Locale.US, "%.1f", s.sharePercent)
            sb.append("Game,\"${s.displayName.replace("\"", "\"\"")}\",\"${s.gameCode}\",\"${s.platformLabel}\",${s.playTimeMs},$mins,$shareStr,${s.launchCount},$avgMins,\"$lastDate\",\n")
        }
        sessions.forEach { sess ->
            val mins = sess.durationMs / 60000L
            val startTime = SimpleDateFormat("dd.MM.yyyy HH:mm:ss", Locale.US).format(Date(sess.startedAtMs))
            sb.append("Session,\"${sess.romName.replace("\"", "\"\"")}\",,,${sess.durationMs},$mins,,,,\"${sess.dayKey}\",\"$startTime\"\n")
        }
        file.writeText(sb.toString())
        file
    }

    private fun isoDayFormat(): SimpleDateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.US)

    private fun parseStoredRomStats(uriString: String, rawJson: String?): StoredRomStats? {
        if (rawJson.isNullOrBlank()) return null
        return runCatching {
            val obj = JSONObject(rawJson)
            StoredRomStats(
                uriString = uriString,
                displayName = obj.optString("name", "ROM"),
                gameCode = obj.optString("code", ""),
                launchCount = obj.optInt("launches", 0),
                recordedPlayTimeMs = obj.optLong("playMs", 0L),
                lastLaunchedEpochMs = obj.optLong("lastMs", 0L),
            )
        }.getOrNull()
    }
}

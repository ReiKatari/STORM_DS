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
    )

    data class DailySessionLog(
        val dayKey: String,
        val sessions: List<PlaySessionEntity>,
        val totalDurationMs: Long,
        val sessionCount: Int,
    )

    data class PlayerStatsSummary(
        val totalPlayTimeMs: Long,
        val gamesPlayedCount: Int,
        val totalLaunches: Int,
        val dailyChart: List<DailyPlayPoint>,
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

    suspend fun exportToJson(context: Context): File = withContext(Dispatchers.IO) {
        val dao = getDao(context)
        val stats = dao.getAllPlayStats()
        val sessions = dao.getAllSessions()

        val rootObj = JSONObject().apply {
            put("exportedAt", SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).format(Date()))
            put("app", "STORM DS")
            val statsArr = JSONArray()
            stats.forEach { s ->
                statsArr.put(
                    JSONObject().apply {
                        put("romUri", s.romUri)
                        put("romName", s.romName)
                        put("gameCode", s.gameCode)
                        put("launchCount", s.launchCount)
                        put("totalPlayTimeMs", s.totalPlayTimeMs)
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
        val dao = getDao(context)
        val stats = dao.getAllPlayStats()
        val sessions = dao.getAllSessions()

        val exportDir = File(android.os.Environment.getExternalStorageDirectory(), "STORM DS/exports").apply { mkdirs() }
        val targetDir = if (exportDir.exists() && exportDir.canWrite()) exportDir else File(context.filesDir, "exports").apply { mkdirs() }
        val dateTag = SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(Date())
        val file = File(targetDir, "storm_ds_stats_$dateTag.csv")

        val sb = StringBuilder()
        sb.append("Type,ROM Name,Game Code,Duration (ms),Duration (min),Launches,Date,Started At\n")
        stats.forEach { s ->
            val mins = s.totalPlayTimeMs / 60000L
            val lastDate = if (s.lastPlayedEpochMs > 0) SimpleDateFormat("dd.MM.yyyy HH:mm", Locale.US).format(Date(s.lastPlayedEpochMs)) else ""
            sb.append("Summary,\"${s.romName.replace("\"", "\"\"")}\",\"${s.gameCode}\",${s.totalPlayTimeMs},$mins,${s.launchCount},\"$lastDate\",\n")
        }
        sessions.forEach { sess ->
            val mins = sess.durationMs / 60000L
            val startTime = SimpleDateFormat("dd.MM.yyyy HH:mm:ss", Locale.US).format(Date(sess.startedAtMs))
            sb.append("Session,\"${sess.romName.replace("\"", "\"\"")}\",,${sess.durationMs},$mins,,\"${sess.dayKey}\",\"$startTime\"\n")
        }
        file.writeText(sb.toString())
        file
    }

    fun buildSummary(context: Context, roms: List<Rom>): PlayerStatsSummary {
        val appContext = context.applicationContext
        val prefs = appContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

        val storedByUri = mutableMapOf<String, StoredRomStats>()
        runCatching {
            val dao = getDao(appContext)
            val roomStats = kotlinx.coroutines.runBlocking(Dispatchers.IO) { dao.getAllPlayStats() }
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

        val mergedItems = mutableListOf<GameStatItem>()
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
            mergedItems.add(
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

        val totalPlayTimeMs = mergedItems.sumOf { it.playTimeMs }
        val gamesPlayedCount = mergedItems.size
        val totalLaunches = mergedItems.sumOf { it.launchCount }

        val isoFmt = isoDayFormat()
        val labelFmt = SimpleDateFormat("dd.MM", Locale.getDefault())
        val cal = Calendar.getInstance()
        val dailyPoints = mutableListOf<DailyPlayPoint>()

        for (daysAgo in 6 downTo 0) {
            val c = (cal.clone() as Calendar).apply {
                add(Calendar.DAY_OF_YEAR, -daysAgo)
            }
            val date = c.time
            val dateKey = isoFmt.format(date)
            val dayLabel = labelFmt.format(date)
            var dayPlayMs = prefs.getLong(KEY_DAILY_PLAY_MS_PREFIX + dateKey, 0L)
            val dayLaunches = prefs.getInt(KEY_DAILY_LAUNCHES_PREFIX + dateKey, 0)

            if (dayPlayMs == 0L) {
                val fallbackMs = mergedItems
                    .filter { it.lastPlayedEpochMs > 0L && isoFmt.format(Date(it.lastPlayedEpochMs)) == dateKey }
                    .sumOf { it.playTimeMs }
                if (fallbackMs > 0L) {
                    dayPlayMs = fallbackMs
                }
            }

            dailyPoints.add(
                DailyPlayPoint(
                    dateKey = dateKey,
                    dayLabel = dayLabel,
                    playTimeMs = dayPlayMs,
                    launches = dayLaunches,
                    isToday = daysAgo == 0,
                )
            )
        }

        val topByPlayTime = mergedItems
            .sortedWith(compareByDescending<GameStatItem> { it.playTimeMs }.thenByDescending { it.launchCount })
            .take(10)

        val topByLaunches = mergedItems
            .sortedWith(compareByDescending<GameStatItem> { it.launchCount }.thenByDescending { it.playTimeMs })
            .take(10)

        val topRecent = mergedItems
            .filter { it.lastPlayedEpochMs > 0L }
            .sortedWith(compareByDescending<GameStatItem> { it.lastPlayedEpochMs }.thenByDescending { it.playTimeMs })
            .take(10)

        return PlayerStatsSummary(
            totalPlayTimeMs = totalPlayTimeMs,
            gamesPlayedCount = gamesPlayedCount,
            totalLaunches = totalLaunches,
            dailyChart = dailyPoints,
            topByPlayTime = topByPlayTime,
            topByLaunches = topByLaunches,
            topRecent = topRecent,
        )
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

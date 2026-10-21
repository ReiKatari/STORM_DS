package me.magnum.melonds.ui.stats

import android.content.Context
import android.os.SystemClock
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.ui.romlist.composables.romDisplayName
import org.json.JSONObject
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale

object PlayStatsStore {
    private const val PREFS_NAME = "storm_play_stats"
    private const val KEY_ROM_META_PREFIX = "rom_meta_"
    private const val KEY_DAILY_PLAY_MS_PREFIX = "daily_play_ms_"
    private const val KEY_DAILY_LAUNCHES_PREFIX = "daily_launches_"
    private const val LAUNCH_DEBOUNCE_MS = 3_500L

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

    data class PlayerStatsSummary(
        val totalPlayTimeMs: Long,
        val gamesPlayedCount: Int,
        val totalLaunches: Int,
        val dailyChart: List<DailyPlayPoint>,
        val topByPlayTime: List<GameStatItem>,
        val topByLaunches: List<GameStatItem>,
    )

    fun recordLaunch(context: Context, rom: Rom) {
        recordLaunchByUri(
            context = context,
            uriString = rom.uri.toString(),
            displayName = romDisplayName(rom).ifBlank { rom.name },
            gameCode = rom.gameCode,
        )
    }

    @Synchronized
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
        val prefs = appContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val metaKey = KEY_ROM_META_PREFIX + uriString
        val existingJson = prefs.getString(metaKey, null)
        val existing = parseStoredRomStats(uriString, existingJson)
        val nowEpoch = System.currentTimeMillis()
        val todayKey = isoDayFormat().format(Date(nowEpoch))

        val updated = StoredRomStats(
            uriString = uriString,
            displayName = displayName?.takeIf { it.isNotBlank() } ?: existing?.displayName ?: "ROM",
            gameCode = gameCode?.takeIf { it.isNotBlank() } ?: existing?.gameCode.orEmpty(),
            launchCount = (existing?.launchCount ?: 0) + 1,
            recordedPlayTimeMs = existing?.recordedPlayTimeMs ?: 0L,
            lastLaunchedEpochMs = nowEpoch,
        )

        val todayLaunchesKey = KEY_DAILY_LAUNCHES_PREFIX + todayKey
        val todayLaunches = prefs.getInt(todayLaunchesKey, 0) + 1

        prefs.edit()
            .putString(metaKey, serializeStoredRomStats(updated))
            .putInt(todayLaunchesKey, todayLaunches)
            .apply()
    }

    @Synchronized
    fun recordPlayTime(
        context: Context,
        rom: Rom,
        deltaMs: Long,
    ) {
        if (deltaMs <= 0L) return
        val appContext = context.applicationContext
        val prefs = appContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val uriString = rom.uri.toString()
        val metaKey = KEY_ROM_META_PREFIX + uriString
        val existing = parseStoredRomStats(uriString, prefs.getString(metaKey, null))
        val nowEpoch = System.currentTimeMillis()
        val todayKey = isoDayFormat().format(Date(nowEpoch))
        val todayPlayKey = KEY_DAILY_PLAY_MS_PREFIX + todayKey

        val updated = StoredRomStats(
            uriString = uriString,
            displayName = romDisplayName(rom).ifBlank { existing?.displayName ?: rom.name },
            gameCode = rom.gameCode.ifBlank { existing?.gameCode.orEmpty() },
            launchCount = maxOf(existing?.launchCount ?: 0, 1),
            recordedPlayTimeMs = (existing?.recordedPlayTimeMs ?: 0L) + deltaMs,
            lastLaunchedEpochMs = maxOf(existing?.lastLaunchedEpochMs ?: 0L, nowEpoch),
        )

        val todayPlayMs = prefs.getLong(todayPlayKey, 0L) + deltaMs
        prefs.edit()
            .putString(metaKey, serializeStoredRomStats(updated))
            .putLong(todayPlayKey, todayPlayMs)
            .apply()
    }

    fun buildSummary(context: Context, roms: List<Rom>): PlayerStatsSummary {
        val appContext = context.applicationContext
        val prefs = appContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val allEntries = prefs.all

        val storedByUri = mutableMapOf<String, StoredRomStats>()
        for ((key, value) in allEntries) {
            if (key.startsWith(KEY_ROM_META_PREFIX) && value is String) {
                val uriStr = key.removePrefix(KEY_ROM_META_PREFIX)
                parseStoredRomStats(uriStr, value)?.let { storedByUri[uriStr] = it }
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
                !stored?.displayName.isNullOrBlank() -> stored!!.displayName
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

            // Fallback: if daily bucket wasn't recorded yet for games whose lastPlayed falls on this day
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

        return PlayerStatsSummary(
            totalPlayTimeMs = totalPlayTimeMs,
            gamesPlayedCount = gamesPlayedCount,
            totalLaunches = totalLaunches,
            dailyChart = dailyPoints,
            topByPlayTime = topByPlayTime,
            topByLaunches = topByLaunches,
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

    private fun serializeStoredRomStats(stats: StoredRomStats): String {
        return JSONObject().apply {
            put("name", stats.displayName)
            put("code", stats.gameCode)
            put("launches", stats.launchCount)
            put("playMs", stats.recordedPlayTimeMs)
            put("lastMs", stats.lastLaunchedEpochMs)
        }.toString()
    }
}

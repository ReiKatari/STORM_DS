package me.magnum.melonds.ui.quickresume

import android.content.Context
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.ui.romlist.composables.romDisplayName
import java.util.concurrent.ConcurrentHashMap

object QuickResumeStore {
    private const val PREFS_NAME = "storm_quick_resume"
    private const val KEY_URI = "last_rom_uri"
    private const val KEY_NAME = "last_rom_name"
    private const val KEY_GAME_CODE = "last_rom_game_code"
    private const val KEY_TIMESTAMP = "last_played_epoch_ms"
    private const val KEY_QUICK_SAVE_PREFIX = "quick_save_ts_"

    private val ioScope = CoroutineScope(SupervisorJob() + Dispatchers.IO)
    private val quickSaveTimestamps = ConcurrentHashMap<String, Long>()
    @Volatile
    private var cachedLastEntry: LastRomEntry? = null
    @Volatile
    private var entryLoaded: Boolean = false

    data class LastRomEntry(
        val uriString: String,
        val displayName: String,
        val gameCode: String,
        val lastPlayedEpochMs: Long,
    )

    fun rememberLastRom(context: Context, rom: Rom) {
        val appContext = context.applicationContext
        val uriString = rom.uri.toString()
        val displayName = romDisplayName(rom).ifBlank { rom.name }
        val gameCode = rom.gameCode
        val now = System.currentTimeMillis()
        val romUri = rom.uri

        cachedLastEntry = LastRomEntry(
            uriString = uriString,
            displayName = displayName,
            gameCode = gameCode,
            lastPlayedEpochMs = now,
        )
        entryLoaded = true

        ioScope.launch {
            runCatching {
                val prefs = appContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
                val savedQuickTs = prefs.getLong(KEY_QUICK_SAVE_PREFIX + uriString, 0L)
                if (savedQuickTs > 0L) {
                    quickSaveTimestamps[uriString] = savedQuickTs
                }
                prefs.edit()
                    .putString(KEY_URI, uriString)
                    .putString(KEY_NAME, displayName)
                    .putString(KEY_GAME_CODE, gameCode)
                    .putLong(KEY_TIMESTAMP, now)
                    .apply()
            }
            runCatching {
                QuickResumeShortcuts.publish(appContext, romUri, displayName)
            }
            runCatching {
                QuickResumeTileService.requestTileUpdate(appContext)
            }
        }
    }

    fun syncFromContinuePlaying(context: Context, topRom: Rom?) {
        if (topRom == null) return
        val appContext = context.applicationContext
        val topUriString = topRom.uri.toString()
        val topPlayedMs = topRom.lastPlayed?.time ?: 0L
        val existing = cachedLastEntry
        if (existing != null && existing.uriString == topUriString && topPlayedMs <= existing.lastPlayedEpochMs) {
            return
        }

        val displayName = romDisplayName(topRom).ifBlank { topRom.name }
        val gameCode = topRom.gameCode
        val topUri = topRom.uri
        val effectiveTs = if (topPlayedMs > 0L) topPlayedMs else System.currentTimeMillis()

        ioScope.launch {
            val current = getLastRomEntry(appContext)
            val prefs = appContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
            val savedQuickTs = prefs.getLong(KEY_QUICK_SAVE_PREFIX + topUriString, 0L)
            if (savedQuickTs > 0L) {
                quickSaveTimestamps[topUriString] = savedQuickTs
            }
            if (current == null || topPlayedMs > current.lastPlayedEpochMs) {
                val entry = LastRomEntry(
                    uriString = topUriString,
                    displayName = displayName,
                    gameCode = gameCode,
                    lastPlayedEpochMs = effectiveTs,
                )
                cachedLastEntry = entry
                entryLoaded = true

                runCatching {
                    prefs.edit()
                        .putString(KEY_URI, topUriString)
                        .putString(KEY_NAME, displayName)
                        .putString(KEY_GAME_CODE, gameCode)
                        .putLong(KEY_TIMESTAMP, effectiveTs)
                        .apply()
                }
                runCatching {
                    QuickResumeShortcuts.publish(appContext, topUri, displayName)
                }
                runCatching {
                    QuickResumeTileService.requestTileUpdate(appContext)
                }
            }
        }
    }

    fun markQuickSaveUpdated(context: Context, uriString: String, timestampMs: Long = System.currentTimeMillis()) {
        if (uriString.isBlank()) return
        quickSaveTimestamps[uriString] = timestampMs
        val appContext = context.applicationContext
        ioScope.launch {
            runCatching {
                appContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
                    .edit()
                    .putLong(KEY_QUICK_SAVE_PREFIX + uriString, timestampMs)
                    .apply()
            }
        }
    }

    fun clearQuickSave(context: Context, uriString: String) {
        if (uriString.isBlank()) return
        quickSaveTimestamps.remove(uriString)
        val appContext = context.applicationContext
        ioScope.launch {
            runCatching {
                appContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
                    .edit()
                    .remove(KEY_QUICK_SAVE_PREFIX + uriString)
                    .apply()
            }
        }
    }

    fun getQuickSaveTimestamp(uriString: String): Long? {
        return quickSaveTimestamps[uriString]?.takeIf { it > 0L }
    }

    fun getLastRomEntry(context: Context): LastRomEntry? {
        if (entryLoaded) {
            return cachedLastEntry
        }
        val prefs = context.applicationContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val uriString = prefs.getString(KEY_URI, null)?.takeIf { it.isNotBlank() }
        if (uriString == null) {
            entryLoaded = true
            cachedLastEntry = null
            return null
        }
        val displayName = prefs.getString(KEY_NAME, null)?.takeIf { it.isNotBlank() } ?: "ROM"
        val gameCode = prefs.getString(KEY_GAME_CODE, null).orEmpty()
        val lastPlayed = prefs.getLong(KEY_TIMESTAMP, 0L)
        val quickTs = prefs.getLong(KEY_QUICK_SAVE_PREFIX + uriString, 0L)
        if (quickTs > 0L) {
            quickSaveTimestamps[uriString] = quickTs
        }
        val entry = LastRomEntry(
            uriString = uriString,
            displayName = displayName,
            gameCode = gameCode,
            lastPlayedEpochMs = lastPlayed,
        )
        cachedLastEntry = entry
        entryLoaded = true
        return entry
    }
}

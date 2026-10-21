package me.magnum.melonds.ui.quickresume

import android.content.Context
import android.net.Uri
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.ui.romlist.composables.romDisplayName

object QuickResumeStore {
    private const val PREFS_NAME = "storm_quick_resume"
    private const val KEY_URI = "last_rom_uri"
    private const val KEY_NAME = "last_rom_name"
    private const val KEY_GAME_CODE = "last_rom_game_code"
    private const val KEY_TIMESTAMP = "last_played_epoch_ms"

    data class LastRomEntry(
        val uriString: String,
        val displayName: String,
        val gameCode: String,
        val lastPlayedEpochMs: Long,
    )

    fun rememberLastRom(context: Context, rom: Rom) {
        val appContext = context.applicationContext
        val displayName = romDisplayName(rom).ifBlank { rom.name }
        val now = System.currentTimeMillis()
        appContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
            .edit()
            .putString(KEY_URI, rom.uri.toString())
            .putString(KEY_NAME, displayName)
            .putString(KEY_GAME_CODE, rom.gameCode)
            .putLong(KEY_TIMESTAMP, now)
            .apply()

        runCatching {
            QuickResumeShortcuts.publish(appContext, rom.uri, displayName)
        }
        runCatching {
            QuickResumeTileService.requestTileUpdate(appContext)
        }
    }

    fun syncFromContinuePlaying(context: Context, topRom: Rom?) {
        if (topRom == null) return
        val existing = getLastRomEntry(context)
        val topPlayedMs = topRom.lastPlayed?.time ?: 0L
        if (existing == null || topPlayedMs > existing.lastPlayedEpochMs) {
            val appContext = context.applicationContext
            val displayName = romDisplayName(topRom).ifBlank { topRom.name }
            appContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
                .edit()
                .putString(KEY_URI, topRom.uri.toString())
                .putString(KEY_NAME, displayName)
                .putString(KEY_GAME_CODE, topRom.gameCode)
                .putLong(KEY_TIMESTAMP, if (topPlayedMs > 0L) topPlayedMs else System.currentTimeMillis())
                .apply()

            runCatching {
                QuickResumeShortcuts.publish(appContext, topRom.uri, displayName)
            }
            runCatching {
                QuickResumeTileService.requestTileUpdate(appContext)
            }
        }
    }

    fun getLastRomEntry(context: Context): LastRomEntry? {
        val prefs = context.applicationContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val uriString = prefs.getString(KEY_URI, null)?.takeIf { it.isNotBlank() } ?: return null
        val displayName = prefs.getString(KEY_NAME, null)?.takeIf { it.isNotBlank() } ?: "ROM"
        val gameCode = prefs.getString(KEY_GAME_CODE, null).orEmpty()
        val lastPlayed = prefs.getLong(KEY_TIMESTAMP, 0L)
        return LastRomEntry(
            uriString = uriString,
            displayName = displayName,
            gameCode = gameCode,
            lastPlayedEpochMs = lastPlayed,
        )
    }
}

package me.magnum.melonds.ui.quickresume

import android.app.PendingIntent
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.os.Build
import android.service.quicksettings.Tile
import android.service.quicksettings.TileService
import androidx.core.net.toUri
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlinx.coroutines.withTimeoutOrNull
import me.magnum.melonds.R
import me.magnum.melonds.domain.repositories.RomsRepository
import javax.inject.Inject

@AndroidEntryPoint
class QuickResumeTileService : TileService() {

    companion object {
        fun requestTileUpdate(context: Context) {
            runCatching {
                requestListeningState(
                    context.applicationContext,
                    ComponentName(context.applicationContext, QuickResumeTileService::class.java),
                )
            }
        }
    }

    @Inject
    lateinit var romsRepository: RomsRepository

    private var tileScope: CoroutineScope? = null

    override fun onStartListening() {
        super.onStartListening()
        refreshTileFromStore()

        val existing = QuickResumeStore.getLastRomEntry(this)
        if (existing == null && ::romsRepository.isInitialized) {
            val scope = CoroutineScope(SupervisorJob() + Dispatchers.IO).also { tileScope = it }
            scope.launch {
                val recentRom = runCatching {
                    withTimeoutOrNull(1500L) {
                        romsRepository.getRoms().first()
                    }?.filter { it.lastPlayed != null }
                        ?.maxByOrNull { it.lastPlayed?.time ?: 0L }
                }.getOrNull()
                if (recentRom != null) {
                    QuickResumeStore.syncFromContinuePlaying(this@QuickResumeTileService, recentRom)
                    withContext(Dispatchers.Main) {
                        refreshTileFromStore()
                    }
                }
            }
        }
    }

    override fun onStopListening() {
        tileScope?.cancel()
        tileScope = null
        super.onStopListening()
    }

    override fun onClick() {
        super.onClick()
        val launchAction = Runnable {
            val lastEntry = QuickResumeStore.getLastRomEntry(this)
            val intent = QuickResumeActivity.createIntent(this, lastEntry?.uriString?.toUri()).apply {
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP)
            }
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.UPSIDE_DOWN_CAKE) {
                val pendingIntent = PendingIntent.getActivity(
                    this,
                    0,
                    intent,
                    PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE,
                )
                startActivityAndCollapse(pendingIntent)
            } else {
                @Suppress("DEPRECATION")
                startActivityAndCollapse(intent)
            }
        }

        if (isLocked) {
            unlockAndRun(launchAction)
        } else {
            launchAction.run()
        }
    }

    private fun refreshTileFromStore() {
        val tile = qsTile ?: return
        val lastEntry = QuickResumeStore.getLastRomEntry(this)
        val baseLabel = getString(R.string.feature_quick_resume_tile_label)

        if (lastEntry != null) {
            tile.state = Tile.STATE_ACTIVE
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                tile.label = baseLabel
                tile.subtitle = lastEntry.displayName
            } else {
                tile.label = lastEntry.displayName
            }
        } else {
            tile.state = Tile.STATE_INACTIVE
            tile.label = baseLabel
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                tile.subtitle = getString(R.string.feature_quick_resume_no_recent_game)
            }
        }
        runCatching { tile.updateTile() }
    }
}

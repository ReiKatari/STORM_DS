package me.magnum.melonds.ui.quickresume

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.core.net.toUri
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.android.EntryPointAccessors
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlinx.coroutines.withTimeoutOrNull
import me.magnum.melonds.R
import me.magnum.melonds.domain.repositories.RomsRepository
import me.magnum.melonds.parcelables.RomParcelable
import me.magnum.melonds.ui.emulator.EmulatorActivity
import me.magnum.melonds.ui.romlist.RomListActivity
import me.magnum.melonds.ui.stats.PlayStatsStore

class QuickResumeActivity : Activity() {

    @EntryPoint
    @InstallIn(SingletonComponent::class)
    interface QuickResumeEntryPoint {
        fun romsRepository(): RomsRepository
    }

    private val activityScope = CoroutineScope(SupervisorJob() + Dispatchers.Main.immediate)
    private var requestedQuickResume = false
    private var launchStarted = false

    companion object {
        const val ACTION_QUICK_RESUME = "me.magnum.melonds.action.QUICK_RESUME"
        const val EXTRA_ROM_URI = "extra_quick_resume_rom_uri"

        fun createIntent(context: Context, romUri: Uri?): Intent {
            return Intent(context, QuickResumeActivity::class.java).apply {
                action = ACTION_QUICK_RESUME
                if (romUri != null) {
                    putExtra(EXTRA_ROM_URI, romUri.toString())
                    data = romUri
                }
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        QuickResumeStore.ensureQuickSavesLoaded(this)
        val lastEntry = QuickResumeStore.getLastRomEntry(this)
        val targetUriString = intent?.getStringExtra(EXTRA_ROM_URI)?.takeIf { it.isNotBlank() }
            ?: intent?.data?.toString()?.takeIf { it.isNotBlank() }
            ?: lastEntry?.uriString

        if (targetUriString.isNullOrBlank()) {
            Toast.makeText(this, R.string.feature_quick_resume_no_recent_game, Toast.LENGTH_SHORT).show()
            val fallbackIntent = Intent(this, RomListActivity::class.java).apply {
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP)
            }
            runCatching { startActivity(fallbackIntent) }
            finish()
            return
        }

        val targetUri = targetUriString.toUri()
        requestedQuickResume = true
        QuickResumeRequest.request(targetUri)
        QuickResumeShortcuts.reportUsed(this)
        val matchingEntry = lastEntry?.takeIf { it.uriString == targetUriString }
        PlayStatsStore.recordLaunchByUri(
            context = this,
            uriString = targetUriString,
            displayName = matchingEntry?.displayName,
            gameCode = matchingEntry?.gameCode,
        )

        activityScope.launch {
            val resolvedRom = withContext(Dispatchers.IO) {
                runCatching {
                    val romsRepository = EntryPointAccessors.fromApplication(
                        applicationContext,
                        QuickResumeEntryPoint::class.java,
                    ).romsRepository()
                    withTimeoutOrNull(1500L) {
                        romsRepository.getRomAtUri(targetUri)
                    }
                }.getOrNull()
            }

            val emulatorIntent = Intent(this@QuickResumeActivity, EmulatorActivity::class.java).apply {
                action = "${packageName}.LAUNCH_ROM"
                if (resolvedRom != null) {
                    putExtra(EmulatorActivity.KEY_ROM, RomParcelable(resolvedRom))
                }
                putExtra(EmulatorActivity.KEY_URI, targetUriString)
                data = targetUri
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP)
            }

            runCatching {
                startActivity(emulatorIntent)
                launchStarted = true
            }.onFailure {
                QuickResumeRequest.clear()
                Toast.makeText(this@QuickResumeActivity, R.string.feature_quick_resume_not_found, Toast.LENGTH_SHORT).show()
            }

            finish()
            @Suppress("DEPRECATION")
            overridePendingTransition(0, 0)
        }
    }

    override fun onDestroy() {
        if (requestedQuickResume && !launchStarted) {
            QuickResumeRequest.clear()
        }
        activityScope.cancel()
        super.onDestroy()
    }
}

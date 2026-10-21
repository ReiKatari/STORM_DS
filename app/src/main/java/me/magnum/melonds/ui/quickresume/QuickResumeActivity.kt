package me.magnum.melonds.ui.quickresume

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.core.net.toUri
import me.magnum.melonds.R
import me.magnum.melonds.ui.emulator.EmulatorActivity
import me.magnum.melonds.ui.romlist.RomListActivity
import me.magnum.melonds.ui.stats.PlayStatsStore

class QuickResumeActivity : Activity() {

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
        QuickResumeRequest.request(targetUri)
        QuickResumeShortcuts.reportUsed(this)
        PlayStatsStore.recordLaunchByUri(
            context = this,
            uriString = targetUriString,
            displayName = lastEntry?.displayName,
            gameCode = lastEntry?.gameCode,
        )

        val emulatorIntent = Intent(this, EmulatorActivity::class.java).apply {
            action = "${packageName}.LAUNCH_ROM"
            putExtra(EmulatorActivity.KEY_URI, targetUriString)
            data = targetUri
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP)
        }

        runCatching {
            startActivity(emulatorIntent)
        }.onFailure {
            QuickResumeRequest.clear()
            Toast.makeText(this, R.string.feature_quick_resume_not_found, Toast.LENGTH_SHORT).show()
        }

        finish()
        @Suppress("DEPRECATION")
        overridePendingTransition(0, 0)
    }
}

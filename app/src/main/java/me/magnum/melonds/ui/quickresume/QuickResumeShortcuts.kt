package me.magnum.melonds.ui.quickresume

import android.content.Context
import android.net.Uri
import androidx.core.content.pm.ShortcutInfoCompat
import androidx.core.content.pm.ShortcutManagerCompat
import androidx.core.graphics.drawable.IconCompat
import me.magnum.melonds.R

object QuickResumeShortcuts {
    const val SHORTCUT_ID = "storm_quick_resume_last_rom"

    fun publish(context: Context, romUri: Uri, displayName: String) {
        val appContext = context.applicationContext
        val shortLabel = appContext.getString(R.string.feature_quick_resume_shortcut_short)
        val longLabel = appContext.getString(R.string.feature_quick_resume_continue_game, displayName)
        val intent = QuickResumeActivity.createIntent(appContext, romUri)

        val shortcut = ShortcutInfoCompat.Builder(appContext, SHORTCUT_ID)
            .setShortLabel(shortLabel)
            .setLongLabel(longLabel)
            .setIcon(IconCompat.createWithResource(appContext, R.drawable.ic_quick_resume_tile))
            .setIntent(intent)
            .setRank(0)
            .build()

        ShortcutManagerCompat.pushDynamicShortcut(appContext, shortcut)
    }

    fun reportUsed(context: Context) {
        runCatching {
            ShortcutManagerCompat.reportShortcutUsed(context.applicationContext, SHORTCUT_ID)
        }
    }
}

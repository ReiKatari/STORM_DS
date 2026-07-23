package me.magnum.melondualds

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import androidx.preference.PreferenceManager
import me.magnum.melonds.common.retroachievements.RetroAchievementsEndpointStorage

class RetroAchievementsHostOverrideReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        val preferences = PreferenceManager.getDefaultSharedPreferences(context.applicationContext)
        when (intent.action) {
            ACTION_SET -> {
                val result = RetroAchievementsEndpointStorage.activateExternal(
                    preferences,
                    intent.getStringExtra(EXTRA_HOST),
                )
                result.onSuccess {
                    RetroAchievementsEndpointStorage.logSnapshot(it, "external_set")
                }.onFailure {
                    Log.w(TAG, "Rejected RAOfflineProxy host: ${it.message}")
                }
            }
            ACTION_CLEAR -> {
                val snapshot = RetroAchievementsEndpointStorage.clearExternal(preferences)
                RetroAchievementsEndpointStorage.logSnapshot(snapshot, "external_clear")
            }
            else -> Log.w(TAG, "Ignored unsupported action")
        }
    }

    companion object {
        const val ACTION_SET = "me.magnum.melondualds.action.SET_RETROACHIEVEMENTS_HOST_OVERRIDE"
        const val ACTION_CLEAR = "me.magnum.melondualds.action.CLEAR_RETROACHIEVEMENTS_HOST_OVERRIDE"
        const val EXTRA_HOST = "host"
        private const val TAG = "RAHostOverrideReceiver"
    }
}

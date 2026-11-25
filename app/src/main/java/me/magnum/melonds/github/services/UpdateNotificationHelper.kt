package me.magnum.melonds.github.services

import android.Manifest
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.os.SystemClock
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.content.ContextCompat
import me.magnum.melonds.MelonDSApplication
import me.magnum.melonds.R

class UpdateNotificationHelper(private val context: Context) {

    private var lastProgressNotifyMs = 0L

    private fun canPostNotifications(): Boolean {
        return Build.VERSION.SDK_INT < Build.VERSION_CODES.TIRAMISU ||
            ContextCompat.checkSelfPermission(
                context,
                Manifest.permission.POST_NOTIFICATIONS,
            ) == PackageManager.PERMISSION_GRANTED
    }

    fun showProgress(versionName: String, downloadedBytes: Long, totalBytes: Long) {
        if (!canPostNotifications()) return
        val now = SystemClock.elapsedRealtime()
        if (downloadedBytes in 1 until totalBytes && (now - lastProgressNotifyMs) < PROGRESS_THROTTLE_MS) {
            return
        }
        lastProgressNotifyMs = now

        val indeterminate = totalBytes <= 0L
        val maxProgress = 100
        val progress = if (totalBytes > 0L) {
            ((downloadedBytes * 100L) / totalBytes).toInt().coerceIn(0, 100)
        } else {
            0
        }

        val title = "${context.getString(R.string.app_name)} ${versionName.removePrefix("v").removePrefix("V")}"
        val contentText = if (totalBytes > 0L) {
            val dlMb = downloadedBytes / (1024f * 1024f)
            val totMb = totalBytes / (1024f * 1024f)
            String.format("%.1f / %.1f MB (%d%%)", dlMb, totMb, progress)
        } else {
            context.getString(R.string.update_dialog_preparing)
        }

        val notification = NotificationCompat.Builder(context, MelonDSApplication.NOTIFICATION_CHANNEL_ID_APP_UPDATES)
            .setSmallIcon(R.drawable.ic_melon_small)
            .setContentTitle(title)
            .setContentText(contentText)
            .setOnlyAlertOnce(true)
            .setSilent(true)
            .setOngoing(true)
            .setPriority(NotificationCompat.PRIORITY_LOW)
            .setProgress(maxProgress, progress, indeterminate)
            .build()

        postSafely(notification)
    }

    fun showReadyToInstall(versionName: String, installIntent: Intent) {
        if (!canPostNotifications()) return
        val pendingIntent = PendingIntent.getActivity(
            context,
            NOTIFICATION_ID_UPDATE,
            installIntent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE,
        )

        val cleanVersion = versionName.removePrefix("v").removePrefix("V")
        val notification = NotificationCompat.Builder(context, MelonDSApplication.NOTIFICATION_CHANNEL_ID_APP_UPDATES)
            .setSmallIcon(R.drawable.ic_melon_small)
            .setContentTitle(context.getString(R.string.update_available, cleanVersion))
            .setContentText(context.getString(R.string.update_dialog_update_now))
            .setContentIntent(pendingIntent)
            .setAutoCancel(true)
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .build()

        postSafely(notification)
    }

    fun showInstallPermissionRequired(versionName: String) {
        if (!canPostNotifications()) return
        val cleanVersion = versionName.removePrefix("v").removePrefix("V")
        val notification = NotificationCompat.Builder(context, MelonDSApplication.NOTIFICATION_CHANNEL_ID_APP_UPDATES)
            .setSmallIcon(R.drawable.ic_melon_small)
            .setContentTitle("${context.getString(R.string.app_name)} $cleanVersion")
            .setContentText(context.getString(R.string.update_install_permission_required))
            .setAutoCancel(true)
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .build()

        postSafely(notification)
    }

    fun showFailed(versionName: String) {
        if (!canPostNotifications()) return
        val cleanVersion = versionName.removePrefix("v").removePrefix("V")
        val notification = NotificationCompat.Builder(context, MelonDSApplication.NOTIFICATION_CHANNEL_ID_APP_UPDATES)
            .setSmallIcon(R.drawable.ic_melon_small)
            .setContentTitle("${context.getString(R.string.app_name)} $cleanVersion")
            .setContentText(context.getString(R.string.update_download_failed))
            .setAutoCancel(true)
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .build()

        postSafely(notification)
    }

    fun cancel() {
        runCatching {
            NotificationManagerCompat.from(context).cancel(NOTIFICATION_ID_UPDATE)
        }
    }

    private fun postSafely(notification: android.app.Notification) {
        try {
            NotificationManagerCompat.from(context).notify(NOTIFICATION_ID_UPDATE, notification)
        } catch (_: SecurityException) {
        }
    }

    companion object {
        const val NOTIFICATION_ID_UPDATE = 2003
        private const val PROGRESS_THROTTLE_MS = 400L
    }
}

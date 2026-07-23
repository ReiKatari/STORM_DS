package me.magnum.melonds.common.workers

import android.content.Context
import android.content.pm.ServiceInfo
import android.os.Build
import androidx.core.app.NotificationCompat
import androidx.core.content.ContextCompat
import androidx.hilt.work.HiltWorker
import androidx.work.CoroutineWorker
import androidx.work.ForegroundInfo
import androidx.work.WorkerParameters
import androidx.work.workDataOf
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import me.magnum.melonds.MelonDSApplication
import me.magnum.melonds.R
import me.magnum.melonds.impl.RetroArchShaderLibraryManager

@HiltWorker
class RetroArchShaderInstallWorker @AssistedInject constructor(
    @Assisted appContext: Context,
    @Assisted workerParams: WorkerParameters,
    private val libraryManager: RetroArchShaderLibraryManager,
) : CoroutineWorker(appContext, workerParams) {

    companion object {
        const val WORK_NAME = "retroarch-shader-install"

        const val KEY_PHASE = "phase"
        const val KEY_DOWNLOADED_BYTES = "downloaded_bytes"
        const val KEY_TOTAL_BYTES = "total_bytes"
        const val KEY_ENTRIES_DONE = "entries_done"
        const val KEY_ENTRIES_TOTAL = "entries_total"
        const val KEY_FAILURE_REASON = "failure_reason"
        const val KEY_REQUIRED_BYTES = "required_bytes"

        const val PHASE_DOWNLOADING = "downloading"
        const val PHASE_EXTRACTING = "extracting"
        const val PHASE_FINALIZING = "finalizing"

        private const val NOTIFICATION_ID_SHADER_INSTALL = 101

        private const val PROGRESS_INTERVAL_MS = 250L
    }

    private var lastProgressEmitMs = 0L

    override suspend fun doWork(): Result {
        setForeground(createForegroundInfo(applicationContext.getString(R.string.video_retroarch_shader_downloading), 0, true))

        return withContext(Dispatchers.IO) {
            try {
                libraryManager.install { progress -> publishProgress(progress) }
                Result.success()
            } catch (e: CancellationException) {
                throw e
            } catch (e: RetroArchShaderLibraryManager.ShaderInstallException) {
                Result.failure(
                    workDataOf(
                        KEY_FAILURE_REASON to e.reason.name,
                        KEY_REQUIRED_BYTES to e.requiredBytes,
                    ),
                )
            } catch (e: Exception) {
                Result.failure(
                    workDataOf(
                        KEY_FAILURE_REASON to RetroArchShaderLibraryManager.ShaderInstallException.Reason.HttpError.name,
                    ),
                )
            }
        }
    }

    private fun publishProgress(progress: RetroArchShaderLibraryManager.InstallProgress) {
        val now = System.currentTimeMillis()
        val isFinal = progress is RetroArchShaderLibraryManager.InstallProgress.Finalizing
        if (!isFinal && now - lastProgressEmitMs < PROGRESS_INTERVAL_MS) {
            return
        }
        lastProgressEmitMs = now

        when (progress) {
            is RetroArchShaderLibraryManager.InstallProgress.Downloading -> {
                val total = progress.update.totalSize
                val downloaded = progress.update.downloadedBytes
                setProgressAsync(
                    workDataOf(
                        KEY_PHASE to PHASE_DOWNLOADING,
                        KEY_DOWNLOADED_BYTES to downloaded,
                        KEY_TOTAL_BYTES to total,
                    ),
                )
                val percent = if (total > 0) ((downloaded * 100) / total).toInt() else 0
                setForegroundAsync(
                    createForegroundInfo(
                        applicationContext.getString(R.string.video_retroarch_shader_downloading),
                        percent,
                        total <= 0,
                    ),
                )
            }
            is RetroArchShaderLibraryManager.InstallProgress.Extracting -> {
                setProgressAsync(
                    workDataOf(
                        KEY_PHASE to PHASE_EXTRACTING,
                        KEY_ENTRIES_DONE to progress.entriesDone,
                        KEY_ENTRIES_TOTAL to progress.entriesTotal,
                    ),
                )
                val percent = if (progress.entriesTotal > 0) {
                    (progress.entriesDone * 100) / progress.entriesTotal
                } else {
                    0
                }
                setForegroundAsync(
                    createForegroundInfo(
                        applicationContext.getString(R.string.video_retroarch_shader_extracting),
                        percent,
                        progress.entriesTotal <= 0,
                    ),
                )
            }
            RetroArchShaderLibraryManager.InstallProgress.Finalizing -> {
                setProgressAsync(workDataOf(KEY_PHASE to PHASE_FINALIZING))
                setForegroundAsync(
                    createForegroundInfo(
                        applicationContext.getString(R.string.video_retroarch_shader_finalizing),
                        100,
                        true,
                    ),
                )
            }
        }
    }

    private fun createForegroundInfo(subText: String, progress: Int, indeterminate: Boolean): ForegroundInfo {
        val notification = NotificationCompat.Builder(applicationContext, MelonDSApplication.NOTIFICATION_CHANNEL_ID_BACKGROUND_TASKS)
            .setPriority(NotificationCompat.PRIORITY_LOW)
            .setSubText(subText)
            .setContentTitle(applicationContext.getString(R.string.video_retroarch_shader_install_notification_title))
            .setColor(ContextCompat.getColor(applicationContext, R.color.melonMain))
            .setSmallIcon(R.drawable.ic_melon_small)
            .setProgress(100, progress, indeterminate)
            .setOngoing(true)
            .build()

        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.UPSIDE_DOWN_CAKE) {
            ForegroundInfo(NOTIFICATION_ID_SHADER_INSTALL, notification, ServiceInfo.FOREGROUND_SERVICE_TYPE_DATA_SYNC)
        } else {
            ForegroundInfo(NOTIFICATION_ID_SHADER_INSTALL, notification)
        }
    }
}

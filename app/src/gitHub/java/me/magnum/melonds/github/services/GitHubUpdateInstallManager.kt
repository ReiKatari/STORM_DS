package me.magnum.melonds.github.services

import android.app.DownloadManager
import android.content.Context
import android.content.Intent
import android.content.pm.PackageInfo
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.util.Log
import androidx.core.content.getSystemService
import androidx.core.net.toUri
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.flow.flow
import me.magnum.melonds.common.providers.UpdateContentProvider
import me.magnum.melonds.domain.model.DownloadProgress
import me.magnum.melonds.domain.model.Version
import me.magnum.melonds.domain.model.appupdate.AppUpdate
import me.magnum.melonds.domain.services.UpdateInstallManager
import me.magnum.melonds.github.GITHUB_RELEASE_URL_PREFIX
import me.magnum.melonds.utils.PackageManagerCompat
import java.io.File
import java.security.MessageDigest

class GitHubUpdateInstallManager(private val context: Context) : UpdateInstallManager {
    override fun downloadAndInstallUpdate(update: AppUpdate): Flow<DownloadProgress> = flow {
        val updatesFolder = context.externalCacheDir?.let { File(it, "updates") }
            ?: return@flow
        if (!updatesFolder.isDirectory && !updatesFolder.mkdirs()) {
            emit(DownloadProgress.DownloadFailed)
            return@flow
        }

        val destinationFile = File(updatesFolder, "update.apk")
        if (destinationFile.isFile && !destinationFile.delete()) {
            emit(DownloadProgress.DownloadFailed)
            return@flow
        }

        if (!hasTrustedGitHubOrigin(update)) {
            Log.w(TAG, "Rejected update with an unexpected GitHub release origin")
            emit(DownloadProgress.DownloadFailed)
            return@flow
        }

        val destinationUri = UpdateContentProvider.getUpdateFileUri(context, destinationFile)
        val downloadManager = context.getSystemService<DownloadManager>()!!
        val request = DownloadManager.Request(update.downloadUri).apply {
            setDestinationUri(destinationUri)
            setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
            setMimeType(APK_MIME)
            setTitle("Downloading update ${update.newVersion}...")
        }
        val downloadId = downloadManager.enqueue(request)
        observeDownload(downloadManager, downloadId, update, destinationFile).collect(this)
    }

    private fun observeDownload(
        downloadManager: DownloadManager,
        downloadId: Long,
        update: AppUpdate,
        destinationFile: File,
    ): Flow<DownloadProgress> = callbackFlow {
        val observer = object : android.database.ContentObserver(null) {
            override fun onChange(selfChange: Boolean, uri: Uri?) {
                val cursor = downloadManager.query(
                    DownloadManager.Query().setFilterById(downloadId),
                )
                cursor.use {
                    if (!it.moveToNext()) return
                    val size = it.getLong(it.getColumnIndexOrThrow(DownloadManager.COLUMN_TOTAL_SIZE_BYTES))
                    val downloaded = it.getLong(it.getColumnIndexOrThrow(DownloadManager.COLUMN_BYTES_DOWNLOADED_SO_FAR))
                    val status = it.getInt(it.getColumnIndexOrThrow(DownloadManager.COLUMN_STATUS))

                    if (size >= 0) {
                        channel.trySend(DownloadProgress.DownloadUpdate(size, downloaded))
                    }
                    if (status == DownloadManager.STATUS_SUCCESSFUL) {
                        if (validateDownloadedApk(update, destinationFile)) {
                            openInstaller(downloadManager, downloadId)
                            channel.trySend(DownloadProgress.DownloadComplete)
                        } else {
                            channel.trySend(DownloadProgress.DownloadFailed)
                        }
                        channel.close()
                    } else if (status == DownloadManager.STATUS_FAILED) {
                        channel.trySend(DownloadProgress.DownloadFailed)
                        channel.close()
                    }
                }
            }
        }

        val downloadUri = "content://downloads/my_downloads/$downloadId".toUri()
        context.contentResolver.registerContentObserver(downloadUri, false, observer)
        observer.onChange(false, downloadUri)

        awaitClose {
            context.contentResolver.unregisterContentObserver(observer)
        }
    }

    internal fun validateDownloadedApk(update: AppUpdate, apkFile: File): Boolean {
        if (!apkFile.isFile || apkFile.length() <= 0L) return reject("missing_apk")
        val flags = PackageManager.GET_SIGNING_CERTIFICATES
        val archive = getArchivePackageInfo(apkFile, flags) ?: return reject("unreadable_apk")
        val installed = PackageManagerCompat.getPackageInfo(
            context.packageManager,
            context.packageName,
            flags,
        )

        val rejection = UpdateApkValidationPolicy.validate(
            candidate = archive.toValidationMetadata(),
            installed = installed.toValidationMetadata(),
            expectedVersion = update.newVersion,
            requireSemanticVersionMatch = update.type == AppUpdate.Type.PRODUCTION,
            expectedSize = update.binarySize,
            actualSize = apkFile.length(),
        )
        return rejection == null || reject(rejection.name.lowercase())
    }

    private fun hasTrustedGitHubOrigin(update: AppUpdate): Boolean {
        return update.sourceReleaseUrl.startsWith("${GITHUB_RELEASE_URL_PREFIX}tag/") &&
            update.downloadUri.toString().startsWith("${GITHUB_RELEASE_URL_PREFIX}download/")
    }

    private fun openInstaller(downloadManager: DownloadManager, downloadId: Long) {
        val fileUri = downloadManager.getUriForDownloadedFile(downloadId)
        val installIntent = Intent(Intent.ACTION_VIEW).apply {
            setDataAndType(fileUri, APK_MIME)
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_GRANT_READ_URI_PERMISSION
        }
        context.startActivity(installIntent)
    }

    @Suppress("DEPRECATION")
    private fun getArchivePackageInfo(file: File, flags: Int): PackageInfo? {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            context.packageManager.getPackageArchiveInfo(
                file.absolutePath,
                PackageManager.PackageInfoFlags.of(flags.toLong()),
            )
        } else {
            context.packageManager.getPackageArchiveInfo(file.absolutePath, flags)
        }
    }

    @Suppress("DEPRECATION")
    private fun signerDigests(packageInfo: PackageInfo): Set<String> {
        val signatures = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            packageInfo.signingInfo?.signingCertificateHistory.orEmpty()
        } else {
            packageInfo.signatures.orEmpty()
        }
        return signatures.mapTo(mutableSetOf()) {
            MessageDigest.getInstance("SHA-256").digest(it.toByteArray()).toHex()
        }
    }

    private fun PackageInfo.toValidationMetadata() = UpdateApkMetadata(
        packageName = packageName,
        versionCode = longVersionCodeCompat(),
        versionName = versionName,
        signerDigests = signerDigests(this),
    )

    @Suppress("DEPRECATION")
    private fun PackageInfo.longVersionCodeCompat(): Long {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) longVersionCode else versionCode.toLong()
    }

    private fun ByteArray.toHex(): String = joinToString("") { "%02x".format(it) }

    private fun reject(reason: String): Boolean {
        Log.w(TAG, "Downloaded update rejected reason=$reason")
        return false
    }

    private companion object {
        const val TAG = "GitHubUpdateInstall"
        const val APK_MIME = "application/vnd.android.package-archive"
    }
}

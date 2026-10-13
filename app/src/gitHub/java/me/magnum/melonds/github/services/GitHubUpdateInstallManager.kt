package me.magnum.melonds.github.services

import android.content.Context
import android.content.Intent
import android.content.pm.PackageInfo
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.os.Environment
import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import me.magnum.melonds.common.providers.UpdateContentProvider
import me.magnum.melonds.domain.model.DownloadProgress
import me.magnum.melonds.domain.model.appupdate.AppUpdate
import me.magnum.melonds.domain.services.UpdateInstallManager
import me.magnum.melonds.github.GITHUB_RELEASE_URL_PREFIX
import me.magnum.melonds.utils.PackageManagerCompat
import java.io.File
import java.net.HttpURLConnection
import java.net.URL
import java.security.MessageDigest

class GitHubUpdateInstallManager(private val context: Context) : UpdateInstallManager {
    private fun getUpdatesDirectory(): File {
        val extRoot = runCatching { Environment.getExternalStorageDirectory() }.getOrNull()
        if (extRoot != null) {
            val stormUpdates = File(extRoot, "STORM DS/updates")
            if (stormUpdates.isDirectory || stormUpdates.mkdirs()) {
                return stormUpdates
            }
        }
        return File(context.cacheDir, "updates").apply { mkdirs() }
    }

    override fun downloadAndInstallUpdate(update: AppUpdate): Flow<DownloadProgress> = flow {
        val updatesFolder = getUpdatesDirectory()
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

        try {
            var currentUrl = update.downloadUri.toString()
            var connection: HttpURLConnection? = null
            var redirects = 0
            while (redirects < 10) {
                val conn = (URL(currentUrl).openConnection() as HttpURLConnection).apply {
                    instanceFollowRedirects = false
                    connectTimeout = 20_000
                    readTimeout = 30_000
                    setRequestProperty("User-Agent", "STORM-DS-Updater")
                    setRequestProperty("Accept", "application/octet-stream, */*")
                }
                val code = conn.responseCode
                if (code in 300..399) {
                    val location = conn.getHeaderField("Location")
                    conn.disconnect()
                    if (location.isNullOrBlank()) {
                        emit(DownloadProgress.DownloadFailed)
                        return@flow
                    }
                    currentUrl = URL(URL(currentUrl), location).toString()
                    redirects++
                } else {
                    connection = conn
                    break
                }
            }

            val activeConnection = connection
            if (activeConnection == null || activeConnection.responseCode !in 200..299) {
                activeConnection?.disconnect()
                emit(DownloadProgress.DownloadFailed)
                return@flow
            }

            try {
                val totalSize = activeConnection.contentLengthLong.takeIf { it > 0L } ?: update.binarySize
                var downloaded = 0L
                emit(DownloadProgress.DownloadUpdate(totalSize, 0L))

                activeConnection.inputStream.use { input ->
                    destinationFile.outputStream().use { output ->
                        val buffer = ByteArray(64 * 1024)
                        while (true) {
                            val read = input.read(buffer)
                            if (read <= 0) break
                            output.write(buffer, 0, read)
                            downloaded += read
                            if (totalSize > 0L) {
                                emit(DownloadProgress.DownloadUpdate(totalSize, downloaded))
                            }
                        }
                        output.flush()
                    }
                }
            } finally {
                activeConnection.disconnect()
            }

            if (validateDownloadedApk(update, destinationFile)) {
                openInstaller(destinationFile)
                emit(DownloadProgress.DownloadComplete)
            } else {
                emit(DownloadProgress.DownloadFailed)
            }
        } catch (e: Throwable) {
            Log.e(TAG, "Failed to download update APK", e)
            emit(DownloadProgress.DownloadFailed)
        }
    }.flowOn(Dispatchers.IO)

    @Suppress("DEPRECATION")
    internal fun validateDownloadedApk(update: AppUpdate, apkFile: File): Boolean {
        if (!apkFile.isFile || apkFile.length() <= 0L) return reject("missing_apk")
        val flags = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            PackageManager.GET_SIGNING_CERTIFICATES
        } else {
            PackageManager.GET_SIGNATURES
        }
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

    private fun openInstaller(destinationFile: File) {
        val fileUri = runCatching {
            UpdateContentProvider.getUpdateFileUri(context, destinationFile)
        }.getOrNull() ?: Uri.fromFile(destinationFile)
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

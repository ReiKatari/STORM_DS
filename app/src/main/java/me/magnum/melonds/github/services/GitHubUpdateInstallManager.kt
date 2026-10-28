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
import me.magnum.melonds.github.STORM_GAMES_WORLD_ALT_DOWNLOAD_URL_PREFIX
import me.magnum.melonds.github.STORM_GAMES_WORLD_ALT_RELEASE_URL_PREFIX
import me.magnum.melonds.github.STORM_GAMES_WORLD_DOWNLOAD_URL_PREFIX
import me.magnum.melonds.github.STORM_GAMES_WORLD_RELEASE_URL_PREFIX
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

        if (!hasTrustedOrigin(update)) {
            Log.w(TAG, "Rejected update with an unexpected release origin: ${update.sourceReleaseUrl}")
            emit(DownloadProgress.DownloadFailed)
            return@flow
        }

        val candidateUrls = buildCandidateDownloadUrls(update)
        var downloadedSuccessfully = false

        for (candidateUrl in candidateUrls) {
            try {
                if (destinationFile.isFile) {
                    destinationFile.delete()
                }
                var currentUrl = candidateUrl
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
                            break
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
                    continue
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
                    downloadedSuccessfully = true
                } finally {
                    activeConnection.disconnect()
                }

                if (downloadedSuccessfully && destinationFile.length() > 0L) {
                    break
                } else {
                    downloadedSuccessfully = false
                }
            } catch (e: Throwable) {
                Log.w(TAG, "Download attempt failed from $candidateUrl, trying next mirror if available", e)
            }
        }

        if (!downloadedSuccessfully) {
            emit(DownloadProgress.DownloadFailed)
            return@flow
        }

        if (validateDownloadedApk(update, destinationFile)) {
            openInstaller(destinationFile)
            emit(DownloadProgress.DownloadComplete)
        } else {
            emit(DownloadProgress.DownloadFailed)
        }
    }.flowOn(Dispatchers.IO)

    private fun buildCandidateDownloadUrls(update: AppUpdate): List<String> {
        val primary = update.downloadUri.toString()
        val fileName = primary.substringAfterLast('/').substringBefore('?')
        val urls = linkedSetOf(primary)
        if (fileName.endsWith(".apk", ignoreCase = true)) {
            urls.add("$STORM_GAMES_WORLD_DOWNLOAD_URL_PREFIX$fileName")
            urls.add("$STORM_GAMES_WORLD_ALT_DOWNLOAD_URL_PREFIX$fileName")
            if (update.releaseTag.isNotBlank()) {
                urls.add("${GITHUB_RELEASE_URL_PREFIX}download/${update.releaseTag}/$fileName")
            }
        }
        return urls.toList()
    }

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

    private fun hasTrustedOrigin(update: AppUpdate): Boolean {
        val validReleaseOrigin = update.sourceReleaseUrl.startsWith("${GITHUB_RELEASE_URL_PREFIX}tag/") ||
            update.sourceReleaseUrl.startsWith(STORM_GAMES_WORLD_RELEASE_URL_PREFIX) ||
            update.sourceReleaseUrl.startsWith(STORM_GAMES_WORLD_ALT_RELEASE_URL_PREFIX)
        val downloadUrl = update.downloadUri.toString()
        val validDownloadOrigin = downloadUrl.startsWith("${GITHUB_RELEASE_URL_PREFIX}download/") ||
            downloadUrl.startsWith(STORM_GAMES_WORLD_DOWNLOAD_URL_PREFIX) ||
            downloadUrl.startsWith(STORM_GAMES_WORLD_ALT_DOWNLOAD_URL_PREFIX)
        return validReleaseOrigin && validDownloadOrigin
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

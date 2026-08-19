package me.magnum.melonds.impl

import android.content.Context
import android.net.Uri
import android.provider.OpenableColumns
import me.magnum.melonds.domain.model.VulkanDriverMode
import me.magnum.melonds.domain.repositories.SettingsRepository
import org.json.JSONObject
import java.io.File
import java.util.UUID
import java.util.zip.ZipInputStream

class AdrenoVulkanDriverManager(
    private val context: Context,
    private val settingsRepository: SettingsRepository,
) {
    data class ImportResult(val id: String, val displayName: String)

    private data class DriverMetadata(
        val name: String?,
        val libraryName: String?,
    )

    class ImportException(val reason: Reason) : Exception(reason.name) {
        enum class Reason {
            UnsupportedBuild,
            NotZip,
            InvalidZip,
            NoDriver,
            AmbiguousDriver,
        }
    }

    val isSupported: Boolean
        get() = AdrenoVulkanDriverSupport.isSupported(context)

    fun importDriver(uri: Uri): ImportResult {
        if (!isSupported) {
            throw ImportException(ImportException.Reason.UnsupportedBuild)
        }

        val displayName = queryDisplayName(uri)
            ?.takeIf { it.isNotBlank() }
            ?: "Custom Vulkan driver"
        if (!displayName.endsWith(".zip", ignoreCase = true)) {
            throw ImportException(ImportException.Reason.NotZip)
        }

        val driverId = UUID.randomUUID().toString()
        val importRoot = File(context.filesDir, "adreno-drivers")
        val pendingRoot = File(importRoot, "pending-$driverId")
        val installedRoot = File(importRoot, "driver-$driverId")

        try {
            pendingRoot.mkdirs()
            extractZip(uri, pendingRoot)
            val metadata = readDriverMetadata(pendingRoot)
            val driverFile = selectDriverFile(pendingRoot, metadata)
            val driverDir = driverFile.parentFile ?: throw ImportException(ImportException.Reason.NoDriver)
            val importedDisplayName = metadata.name
                ?.takeIf { it.isNotBlank() }
                ?: displayName.removeSuffix(".zip")

            installedRoot.deleteRecursively()
            if (!pendingRoot.renameTo(installedRoot)) {
                throw ImportException(ImportException.Reason.InvalidZip)
            }

            val driverDirRelativePath = driverDir.toRelativeString(pendingRoot)
            val currentDriverDir = if (driverDirRelativePath == ".") {
                installedRoot
            } else {
                File(installedRoot, driverDirRelativePath)
            }
            settingsRepository.setCustomVulkanDriver(
                id = driverId,
                driverDir = currentDriverDir.absolutePath,
                driverName = driverFile.name,
                displayName = importedDisplayName,
            )
            settingsRepository.setVulkanDriverMode(VulkanDriverMode.CUSTOM)
            return ImportResult(driverId, importedDisplayName)
        } catch (e: ImportException) {
            pendingRoot.deleteRecursively()
            throw e
        } catch (e: Exception) {
            pendingRoot.deleteRecursively()
            throw ImportException(ImportException.Reason.InvalidZip)
        }
    }

    fun removeDriver(id: String) {
        settingsRepository.getInstalledVulkanDrivers()
            .firstOrNull { it.id == id }
            ?.driverDir
            ?.let { File(it).parentFile }
            ?.deleteRecursively()
        settingsRepository.removeCustomVulkanDriver(id)
    }

    private fun queryDisplayName(uri: Uri): String? {
        return runCatching {
            context.contentResolver.query(uri, arrayOf(OpenableColumns.DISPLAY_NAME), null, null, null)?.use { cursor ->
                if (cursor.moveToFirst()) {
                    cursor.getString(0)
                } else {
                    null
                }
            }
        }.getOrNull()
    }

    fun importDriverFromFile(zipFile: File, fallbackDisplayName: String): ImportResult {
        if (!isSupported) {
            throw ImportException(ImportException.Reason.UnsupportedBuild)
        }
        val driverId = UUID.randomUUID().toString()
        val importRoot = File(context.filesDir, "adreno-drivers")
        val pendingRoot = File(importRoot, "pending-$driverId")
        val installedRoot = File(importRoot, "driver-$driverId")

        try {
            pendingRoot.mkdirs()
            zipFile.inputStream().use { input ->
                extractZipStream(input, pendingRoot)
            }
            val metadata = readDriverMetadata(pendingRoot)
            val driverFile = selectDriverFile(pendingRoot, metadata)
            val driverDir = driverFile.parentFile ?: throw ImportException(ImportException.Reason.NoDriver)
            val importedDisplayName = metadata.name
                ?.takeIf { it.isNotBlank() }
                ?: fallbackDisplayName

            installedRoot.deleteRecursively()
            if (!pendingRoot.renameTo(installedRoot)) {
                throw ImportException(ImportException.Reason.InvalidZip)
            }

            val driverDirRelativePath = driverDir.toRelativeString(pendingRoot)
            val currentDriverDir = if (driverDirRelativePath == ".") {
                installedRoot
            } else {
                File(installedRoot, driverDirRelativePath)
            }
            settingsRepository.setCustomVulkanDriver(
                id = driverId,
                driverDir = currentDriverDir.absolutePath,
                driverName = driverFile.name,
                displayName = importedDisplayName,
            )
            settingsRepository.setVulkanDriverMode(VulkanDriverMode.CUSTOM)
            return ImportResult(driverId, importedDisplayName)
        } catch (e: ImportException) {
            pendingRoot.deleteRecursively()
            throw e
        } catch (e: Exception) {
            pendingRoot.deleteRecursively()
            throw ImportException(ImportException.Reason.InvalidZip)
        }
    }

    suspend fun downloadAndInstallDriver(
        driver: me.magnum.melonds.impl.vulkandriver.OnlineVulkanDriver,
        onProgress: (Int) -> Unit = {}
    ): Result<ImportResult> = kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.IO) {
        runCatching {
            val tempFile = File(context.cacheDir, "driver_download_${System.currentTimeMillis()}.zip")
            try {
                val connection = openConnectionWithRedirects(driver.downloadUrl)
                val totalBytes = connection.contentLength
                var downloadedBytes = 0
                connection.inputStream.use { input ->
                    tempFile.outputStream().use { output ->
                        val buffer = ByteArray(16384)
                        var bytesRead: Int
                        while (input.read(buffer).also { bytesRead = it } != -1) {
                            output.write(buffer, 0, bytesRead)
                            downloadedBytes += bytesRead
                            if (totalBytes > 0) {
                                val progress = ((downloadedBytes.toDouble() / totalBytes.toDouble()) * 100).toInt()
                                onProgress(progress.coerceIn(0, 100))
                            }
                        }
                    }
                }
                importDriverFromFile(tempFile, driver.name)
            } finally {
                tempFile.delete()
            }
        }
    }

    private fun openConnectionWithRedirects(initialUrl: String, maxRedirects: Int = 10): java.net.HttpURLConnection {
        var currentUrl = initialUrl
        var redirects = 0
        while (redirects < maxRedirects) {
            val url = java.net.URL(currentUrl)
            val connection = url.openConnection() as java.net.HttpURLConnection
            connection.connectTimeout = 20000
            connection.readTimeout = 45000
            connection.instanceFollowRedirects = false
            connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Linux; Android 14; Mobile) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Mobile Safari/537.36")
            connection.setRequestProperty("Accept", "*/*")
            connection.connect()

            val responseCode = connection.responseCode
            if (responseCode in listOf(java.net.HttpURLConnection.HTTP_MOVED_PERM, java.net.HttpURLConnection.HTTP_MOVED_TEMP, java.net.HttpURLConnection.HTTP_SEE_OTHER, 307, 308)) {
                val location = connection.getHeaderField("Location")
                connection.disconnect()
                if (location.isNullOrBlank()) {
                    throw java.io.IOException("HTTP redirect $responseCode with missing Location header")
                }
                currentUrl = if (location.startsWith("http://") || location.startsWith("https://")) {
                    location
                } else {
                    java.net.URL(url, location).toString()
                }
                redirects++
            } else if (responseCode in 200..299) {
                return connection
            } else {
                connection.disconnect()
                throw java.io.IOException("HTTP error $responseCode")
            }
        }
        throw java.io.IOException("Too many redirects ($redirects)")
    }

    private fun extractZip(uri: Uri, destination: File) {
        context.contentResolver.openInputStream(uri)?.use { input ->
            extractZipStream(input, destination)
        } ?: throw ImportException(ImportException.Reason.InvalidZip)
    }

    private fun extractZipStream(input: java.io.InputStream, destination: File) {
        val destinationCanonical = destination.canonicalFile
        ZipInputStream(input.buffered()).use { zip ->
            while (true) {
                val entry = zip.nextEntry ?: break
                val outputFile = File(destinationCanonical, entry.name).canonicalFile
                if (!outputFile.path.startsWith(destinationCanonical.path + File.separator)) {
                    throw ImportException(ImportException.Reason.InvalidZip)
                }

                if (entry.isDirectory) {
                    outputFile.mkdirs()
                } else {
                    outputFile.parentFile?.mkdirs()
                    outputFile.outputStream().use { output ->
                        zip.copyTo(output)
                    }
                }
                zip.closeEntry()
            }
        }
    }

    private fun readDriverMetadata(root: File): DriverMetadata {
        val metadataFile = File(root, "meta.json")
        if (!metadataFile.isFile) {
            return DriverMetadata(name = null, libraryName = null)
        }

        return runCatching {
            val json = JSONObject(metadataFile.readText())
            DriverMetadata(
                name = json.optString("name").takeIf { it.isNotBlank() },
                libraryName = json.optString("libraryName").takeIf { it.isNotBlank() },
            )
        }.getOrDefault(DriverMetadata(name = null, libraryName = null))
    }

    private fun selectDriverFile(root: File, metadata: DriverMetadata): File {
        val soFiles = root.walkTopDown()
            .filter { it.isFile && it.extension.equals("so", ignoreCase = true) }
            .toList()

        metadata.libraryName?.let { libraryName ->
            val metadataDriver = File(root, libraryName).canonicalFile
            val rootCanonical = root.canonicalFile
            if (!metadataDriver.path.startsWith(rootCanonical.path + File.separator)) {
                throw ImportException(ImportException.Reason.InvalidZip)
            }
            if (metadataDriver.isFile && metadataDriver.extension.equals("so", ignoreCase = true)) {
                return metadataDriver
            }
        }

        listOf("libvulkan_freedreno.so", "vulkan.adreno.so").forEach { preferredName ->
            val matches = soFiles.filter { it.name.equals(preferredName, ignoreCase = true) }
            if (matches.size == 1) {
                return matches.first()
            }
            if (matches.size > 1) {
                throw ImportException(ImportException.Reason.AmbiguousDriver)
            }
        }

        val genericMatches = soFiles.filter { file ->
            file.name.startsWith("libvulkan", ignoreCase = true) ||
                (file.name.startsWith("vulkan.", ignoreCase = true) && file.name.endsWith(".so", ignoreCase = true))
        }
        return when (genericMatches.size) {
            1 -> genericMatches.first()
            0 -> throw ImportException(ImportException.Reason.NoDriver)
            else -> throw ImportException(ImportException.Reason.AmbiguousDriver)
        }
    }
}

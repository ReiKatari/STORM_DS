package me.magnum.melonds.impl

import android.content.Context
import android.content.res.AssetFileDescriptor
import android.net.Uri
import androidx.documentfile.provider.DocumentFile
import me.magnum.melonds.domain.model.ConfigurationDirResult
import me.magnum.melonds.domain.model.ConsoleType
import me.magnum.melonds.domain.repositories.SettingsRepository
import me.magnum.melonds.domain.services.ConfigurationDirectoryVerifier

class FileSystemConfigurationDirectoryVerifier(private val context: Context, settingsRepository: SettingsRepository) : ConfigurationDirectoryVerifier(settingsRepository) {
    override fun checkDsConfigurationDirectory(directory: Uri?): ConfigurationDirResult {
        return checkConfigurationDirectory(ConsoleType.DS, directory)
    }

    override fun checkDsiConfigurationDirectory(directory: Uri?): ConfigurationDirResult {
        return checkConfigurationDirectory(ConsoleType.DSi, directory)
    }

    private fun checkConfigurationDirectory(consoleType: ConsoleType, directory: Uri?): ConfigurationDirResult {
        val candidateUris = mutableListOf<Uri>()
        if (directory != null) {
            candidateUris.add(directory)
        }
        val subFolder = if (consoleType == ConsoleType.DSi) "bios/dsi" else "bios/ds"
        val extStorage = android.os.Environment.getExternalStorageDirectory()
        listOf(
            java.io.File(extStorage, "STORM DS/$subFolder"),
            java.io.File(extStorage, "STORM DS/bios"),
        ).forEach { dir ->
            if (dir != null && dir.exists() && dir.isDirectory) {
                candidateUris.add(Uri.fromFile(dir))
            }
        }

        val requiredFiles = getRequiredFilesVerifiers(consoleType)

        val validDocuments = candidateUris.distinct().mapNotNull { candidateUri ->
            runCatching {
                if (candidateUri.scheme == "file") {
                    val path = candidateUri.path ?: return@runCatching null
                    val file = java.io.File(path)
                    if (file.exists() && file.isDirectory) DocumentFile.fromFile(file) else null
                } else {
                    DocumentFile.fromTreeUri(context, candidateUri)
                }
            }.getOrNull()
        }.filter { it.isDirectory }

        if (validDocuments.isEmpty()) {
            val missingResults = requiredFiles.map { it.key to ConfigurationDirResult.FileStatus.MISSING }
            return ConfigurationDirResult(consoleType, ConfigurationDirResult.Status.UNSET, requiredFiles.keys.toTypedArray(), missingResults.toTypedArray())
        }

        val fileResults = requiredFiles.map { (key, verifier) ->
            val statuses = validDocuments.map { doc -> verifier.invoke(doc) }
            val status = when {
                statuses.contains(ConfigurationDirResult.FileStatus.PRESENT) -> ConfigurationDirResult.FileStatus.PRESENT
                statuses.contains(ConfigurationDirResult.FileStatus.INVALID) -> ConfigurationDirResult.FileStatus.INVALID
                else -> ConfigurationDirResult.FileStatus.MISSING
            }
            key to status
        }

        val isValid = fileResults.all { it.second == ConfigurationDirResult.FileStatus.PRESENT }
        val overallStatus = if (isValid) ConfigurationDirResult.Status.VALID else ConfigurationDirResult.Status.INVALID
        return ConfigurationDirResult(consoleType, overallStatus, requiredFiles.keys.toTypedArray(), fileResults.toTypedArray())
    }

    private fun getDSBios7Status(configurationDir: DocumentFile): ConfigurationDirResult.FileStatus {
        val doc = findBiosDocument(configurationDir, "bios7.bin", "ds_bios7.bin", "arm7.bin", "bios7_ds.bin") ?: return ConfigurationDirResult.FileStatus.MISSING
        return getDocumentSizeStatus(doc, 0x4000.toLong())
    }

    private fun getDSBios9Status(configurationDir: DocumentFile): ConfigurationDirResult.FileStatus {
        val doc = findBiosDocument(configurationDir, "bios9.bin", "ds_bios9.bin", "arm9.bin", "bios9_ds.bin") ?: return ConfigurationDirResult.FileStatus.MISSING
        return getDocumentSizeStatus(doc, 0x1000.toLong())
    }

    private fun getDSFirmwareStatus(configurationDir: DocumentFile): ConfigurationDirResult.FileStatus {
        val firmwareDocument = findBiosDocument(configurationDir, "firmware.bin", "ds_firmware.bin", "firmware_ds.bin") ?: return ConfigurationDirResult.FileStatus.MISSING
        return runCatching {
            val length = if (firmwareDocument.uri.scheme == "file") {
                val decodedPath = Uri.decode(firmwareDocument.uri.path ?: "")
                java.io.File(decodedPath).length()
            } else {
                context.contentResolver.openAssetFileDescriptor(firmwareDocument.uri, "r")?.use {
                    it.length
                } ?: AssetFileDescriptor.UNKNOWN_LENGTH
            }
            if (length >= 0x10000L) {
                ConfigurationDirResult.FileStatus.PRESENT
            } else if (length > 0) {
                ConfigurationDirResult.FileStatus.INVALID
            } else {
                ConfigurationDirResult.FileStatus.MISSING
            }
        }.getOrDefault(ConfigurationDirResult.FileStatus.MISSING)
    }

    private fun findBiosDocument(configurationDir: DocumentFile, vararg names: String): DocumentFile? {
        for (name in names) {
            val doc = configurationDir.findFile(name)
            if (doc != null && doc.exists() && doc.length() > 0) return doc
        }
        if (configurationDir.uri.scheme == "file") {
            val decodedDirPath = Uri.decode(configurationDir.uri.path ?: "")
            val dirFile = java.io.File(decodedDirPath)
            if (dirFile.exists() && dirFile.isDirectory) {
                for (name in names) {
                    val f = java.io.File(dirFile, name)
                    if (f.exists() && f.length() > 0) return DocumentFile.fromFile(f)
                }
                val matching = dirFile.listFiles()?.firstOrNull { f ->
                    names.any { name -> f.name.equals(name, ignoreCase = true) }
                }
                if (matching != null && matching.exists() && matching.length() > 0) {
                    return DocumentFile.fromFile(matching)
                }
            }
        }
        return runCatching {
            configurationDir.listFiles().firstOrNull { file ->
                val fileName = file.name ?: ""
                names.any { name -> fileName.equals(name, ignoreCase = true) }
            }
        }.getOrNull()
    }

    private fun getDSiBios7Status(configurationDir: DocumentFile): ConfigurationDirResult.FileStatus {
        val doc = findBiosDocument(configurationDir, "bios7i.bin", "dsi_bios7.bin", "bios7.bin", "arm7i.bin", "dsi_arm7.bin") ?: return ConfigurationDirResult.FileStatus.MISSING
        return runCatching {
            val length = if (doc.uri.scheme == "file") {
                val decodedPath = Uri.decode(doc.uri.path ?: "")
                java.io.File(decodedPath).length()
            } else {
                context.contentResolver.openAssetFileDescriptor(doc.uri, "r")?.use { it.length } ?: AssetFileDescriptor.UNKNOWN_LENGTH
            }
            if (length >= 0x1000L) ConfigurationDirResult.FileStatus.PRESENT else ConfigurationDirResult.FileStatus.INVALID
        }.getOrDefault(ConfigurationDirResult.FileStatus.MISSING)
    }

    private fun getDSiBios9Status(configurationDir: DocumentFile): ConfigurationDirResult.FileStatus {
        val doc = findBiosDocument(configurationDir, "bios9i.bin", "dsi_bios9.bin", "bios9.bin", "arm9i.bin", "dsi_arm9.bin") ?: return ConfigurationDirResult.FileStatus.MISSING
        return runCatching {
            val length = if (doc.uri.scheme == "file") {
                val decodedPath = Uri.decode(doc.uri.path ?: "")
                java.io.File(decodedPath).length()
            } else {
                context.contentResolver.openAssetFileDescriptor(doc.uri, "r")?.use { it.length } ?: AssetFileDescriptor.UNKNOWN_LENGTH
            }
            if (length >= 0x1000L) ConfigurationDirResult.FileStatus.PRESENT else ConfigurationDirResult.FileStatus.INVALID
        }.getOrDefault(ConfigurationDirResult.FileStatus.MISSING)
    }

    private fun getDSiFirmwareStatus(configurationDir: DocumentFile): ConfigurationDirResult.FileStatus {
        val firmwareDocument = findBiosDocument(configurationDir, "dsi_firmware.bin", "firmware.bin", "firmware_dsi.bin", "dsi_bios.bin") ?: return ConfigurationDirResult.FileStatus.MISSING
        return runCatching {
            val length = if (firmwareDocument.uri.scheme == "file") {
                val decodedPath = Uri.decode(firmwareDocument.uri.path ?: "")
                java.io.File(decodedPath).length()
            } else {
                context.contentResolver.openAssetFileDescriptor(firmwareDocument.uri, "r")?.use {
                    it.length
                } ?: AssetFileDescriptor.UNKNOWN_LENGTH
            }
            if (length >= 0x10000L) {
                ConfigurationDirResult.FileStatus.PRESENT
            } else if (length > 0) {
                ConfigurationDirResult.FileStatus.INVALID
            } else {
                ConfigurationDirResult.FileStatus.MISSING
            }
        }.getOrDefault(ConfigurationDirResult.FileStatus.MISSING)
    }

    private fun getDSiNandStatus(configurationDir: DocumentFile): ConfigurationDirResult.FileStatus {
        val nandDocument = findBiosDocument(configurationDir, "dsi_nand.bin", "nand.bin", "nand_dsi.bin") ?: return ConfigurationDirResult.FileStatus.MISSING
        return runCatching {
            if (nandDocument.uri.scheme == "file") {
                val decodedPath = Uri.decode(nandDocument.uri.path ?: "")
                val f = java.io.File(decodedPath)
                if (f.exists() && f.canRead() && f.length() >= 1024 * 1024L) {
                    ConfigurationDirResult.FileStatus.PRESENT
                } else if (f.exists() && f.length() < 1024 * 1024L) {
                    ConfigurationDirResult.FileStatus.INVALID
                } else {
                    ConfigurationDirResult.FileStatus.MISSING
                }
            } else {
                context.contentResolver.openFileDescriptor(nandDocument.uri, "r")?.use { pfd ->
                    val len = pfd.statSize
                    if (len >= 1024 * 1024L) ConfigurationDirResult.FileStatus.PRESENT else ConfigurationDirResult.FileStatus.INVALID
                } ?: ConfigurationDirResult.FileStatus.MISSING
            }
        }.getOrDefault(ConfigurationDirResult.FileStatus.MISSING)
    }

    private fun getDocumentSizeStatus(document: DocumentFile, requiredSize: Long): ConfigurationDirResult.FileStatus {
        return runCatching {
            val length = if (document.uri.scheme == "file") {
                val decodedPath = Uri.decode(document.uri.path ?: "")
                java.io.File(decodedPath).length()
            } else {
                context.contentResolver.openAssetFileDescriptor(document.uri, "r")?.use {
                    it.length
                } ?: AssetFileDescriptor.UNKNOWN_LENGTH
            }
            if (length >= 0x1000L && length <= 0x20000L) {
                ConfigurationDirResult.FileStatus.PRESENT
            } else if (length == requiredSize) {
                ConfigurationDirResult.FileStatus.PRESENT
            } else if (length > 0) {
                ConfigurationDirResult.FileStatus.INVALID
            } else {
                ConfigurationDirResult.FileStatus.MISSING
            }
        }.getOrDefault(ConfigurationDirResult.FileStatus.MISSING)
    }

    private fun getBiosFileStatus(configurationDir: DocumentFile, fileName: String, requiredSize: Long): ConfigurationDirResult.FileStatus {
        val biosDocument = configurationDir.findFile(fileName) ?: return ConfigurationDirResult.FileStatus.MISSING
        return getDocumentSizeStatus(biosDocument, requiredSize)
    }

    private fun getRequiredFilesVerifiers(consoleType: ConsoleType): Map<String, (DocumentFile) -> ConfigurationDirResult.FileStatus> {
        return when(consoleType) {
            ConsoleType.DS -> mapOf(
                    "bios7.bin" to this::getDSBios7Status,
                    "bios9.bin" to this::getDSBios9Status,
                    "firmware.bin" to this::getDSFirmwareStatus
            )
            ConsoleType.DSi -> mapOf(
                    "bios7.bin" to this::getDSiBios7Status,
                    "bios9.bin" to this::getDSiBios9Status,
                    "firmware.bin" to this::getDSiFirmwareStatus,
                    "nand.bin" to this::getDSiNandStatus
            )
        }
    }
}

package me.magnum.melonds.impl.emulator

import android.content.Context
import android.net.Uri
import android.util.Log
import androidx.documentfile.provider.DocumentFile
import me.magnum.melonds.domain.model.DldiSdCardConfiguration
import me.magnum.melonds.domain.repositories.SettingsRepository
import java.io.File

class DldiFolderSyncManager(
    private val context: Context,
    private val settingsRepository: SettingsRepository,
) {
    private companion object {
        private const val TAG = "DldiFolderSync"
        private const val DLDI_DIR = "dldi"
        private const val MIRROR_DIR = "sync"
        private const val IMAGE_NAME = "dldi_sd.img"
        private const val MIME_BINARY = "application/octet-stream"
    }

    private var activeDirectoryUri: Uri? = null
    private val rootDirectory = File(context.filesDir, DLDI_DIR)
    private val mirrorDirectory = File(rootDirectory, MIRROR_DIR)
    private val imageFile = File(rootDirectory, IMAGE_NAME)

    fun prepareConfiguration(baseConfiguration: DldiSdCardConfiguration): DldiSdCardConfiguration? {
        if (!baseConfiguration.enabled) {
            activeDirectoryUri = null
            return baseConfiguration.copy(
                imagePath = imageFile.absolutePath,
                folderPath = mirrorDirectory.absolutePath,
                folderSync = false,
            )
        }

        val sourceUri = settingsRepository.getDldiSdCardDirectory()
        val sourceRoot = sourceUri?.let { DocumentFile.fromTreeUri(context, it) }
        if (sourceUri == null || sourceRoot == null || !sourceRoot.exists() || !sourceRoot.isDirectory || !sourceRoot.canRead()) {
            Log.w(TAG, "DLDI SD card is enabled but the selected folder is not readable")
            activeDirectoryUri = null
            return null
        }

        if (!rootDirectory.isDirectory && !rootDirectory.mkdirs()) {
            Log.w(TAG, "Could not create DLDI root directory: ${rootDirectory.absolutePath}")
            activeDirectoryUri = null
            return null
        }

        runCatching {
            resetDirectory(mirrorDirectory)
            copyDocumentDirectoryToLocal(sourceRoot, mirrorDirectory)
        }.onFailure {
            Log.w(TAG, "Could not mirror DLDI folder before launch", it)
            activeDirectoryUri = null
            return null
        }

        activeDirectoryUri = sourceUri
        return baseConfiguration.copy(
            enabled = true,
            imagePath = imageFile.absolutePath,
            imageSize = settingsRepository.getDldiSdCardImageSize(),
            folderSync = true,
            folderPath = mirrorDirectory.absolutePath,
        )
    }

    fun syncBackIfNeeded() {
        val targetUri = activeDirectoryUri ?: return
        val targetRoot = DocumentFile.fromTreeUri(context, targetUri)
        if (targetRoot == null || !targetRoot.exists() || !targetRoot.isDirectory || !targetRoot.canWrite()) {
            Log.w(TAG, "Skipping DLDI sync-back because the selected folder is not writable")
            activeDirectoryUri = null
            return
        }

        runCatching {
            replaceDocumentDirectoryContents(targetRoot, mirrorDirectory)
        }.onFailure {
            Log.w(TAG, "Could not sync DLDI folder after emulation", it)
        }
        activeDirectoryUri = null
    }

    private fun resetDirectory(directory: File) {
        if (directory.exists()) {
            directory.deleteRecursively()
        }
        if (!directory.mkdirs() && !directory.isDirectory) {
            error("Could not create ${directory.absolutePath}")
        }
    }

    private fun copyDocumentDirectoryToLocal(source: DocumentFile, target: File) {
        if (!target.isDirectory && !target.mkdirs()) {
            error("Could not create ${target.absolutePath}")
        }

        source.listFiles().forEach { child ->
            val name = child.name ?: return@forEach
            if (child.isDirectory) {
                copyDocumentDirectoryToLocal(child, File(target, name))
            } else if (child.isFile) {
                context.contentResolver.openInputStream(child.uri)?.use { input ->
                    File(target, name).outputStream().use { output ->
                        input.copyTo(output)
                    }
                } ?: error("Could not open ${child.uri}")
            }
        }
    }

    private fun replaceDocumentDirectoryContents(target: DocumentFile, source: File) {
        target.listFiles().forEach { it.delete() }
        if (!source.isDirectory) {
            return
        }

        source.listFiles()?.forEach { child ->
            copyLocalToDocument(child, target)
        }
    }

    private fun copyLocalToDocument(source: File, targetParent: DocumentFile) {
        if (source.isDirectory) {
            val targetDirectory = targetParent.createDirectory(source.name)
                ?: error("Could not create DLDI directory ${source.name}")
            source.listFiles()?.forEach { copyLocalToDocument(it, targetDirectory) }
        } else if (source.isFile) {
            val targetFile = targetParent.createFile(MIME_BINARY, source.name)
                ?: error("Could not create DLDI file ${source.name}")
            context.contentResolver.openOutputStream(targetFile.uri, "wt")?.use { output ->
                source.inputStream().use { input ->
                    input.copyTo(output)
                }
            } ?: error("Could not open ${targetFile.uri} for write")
        }
    }
}

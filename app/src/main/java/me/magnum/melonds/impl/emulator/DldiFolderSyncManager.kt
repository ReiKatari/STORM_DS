package me.magnum.melonds.impl.emulator

import android.content.Context
import android.net.Uri
import android.util.Log
import androidx.documentfile.provider.DocumentFile
import me.magnum.melonds.domain.model.DldiSdCardConfiguration
import me.magnum.melonds.domain.repositories.SettingsRepository
import java.io.File
import org.json.JSONObject

class DldiFolderSyncManager(
    private val context: Context,
    private val settingsRepository: SettingsRepository,
) {
    private companion object {
        private const val TAG = "DldiFolderSync"
        private const val DLDI_DIR = "dldi"
        private const val MIRROR_DIR = "sync"
        private const val IMAGE_NAME = "dldi_sd.img"
        private const val SNAPSHOT_NAME = "dldi_sync_state.json"
        private const val MIME_BINARY = "application/octet-stream"
    }

    private enum class SyncSide {
        LOCAL,
        DOCUMENT,
    }

    private enum class EntryKind {
        FILE,
        DIRECTORY,
    }

    private data class SyncEntryState(
        val kind: EntryKind,
        val lastModified: Long,
        val length: Long,
    )

    private data class SnapshotEntry(
        val kind: EntryKind,
        val localLastModified: Long,
        val localLength: Long,
        val documentLastModified: Long,
        val documentLength: Long,
    )

    private data class SnapshotState(
        val documentTreeUri: String,
        val entries: Map<String, SnapshotEntry>,
    )

    private var activeDirectoryUri: Uri? = null
    private var activeIsDsi: Boolean = false

    private fun getTargetRootDirectory(isDsi: Boolean): File {
        return if (isDsi) File(context.filesDir, "dsi_sd") else File(context.filesDir, DLDI_DIR)
    }

    private fun getTargetMirrorDirectory(isDsi: Boolean): File {
        return if (isDsi) File(getTargetRootDirectory(true), "sync") else File(getTargetRootDirectory(false), MIRROR_DIR)
    }

    private fun getTargetImageFile(isDsi: Boolean): File {
        return if (isDsi) File(getTargetRootDirectory(true), "dsi_sd.img") else File(getTargetRootDirectory(false), IMAGE_NAME)
    }

    private fun getTargetSnapshotFile(isDsi: Boolean): File {
        return File(getTargetRootDirectory(isDsi), SNAPSHOT_NAME)
    }

    fun prepareConfiguration(baseConfiguration: DldiSdCardConfiguration): DldiSdCardConfiguration? {
        val isDsi = baseConfiguration.folderPath?.contains("dsi_sd") == true || baseConfiguration.imagePath?.contains("dsi") == true
        activeIsDsi = isDsi
        val rootDir = getTargetRootDirectory(isDsi)
        val mirrorDir = getTargetMirrorDirectory(isDsi)
        val defaultImage = getTargetImageFile(isDsi)

        if (!baseConfiguration.enabled) {
            activeDirectoryUri = null
            return baseConfiguration.copy(
                imagePath = defaultImage.absolutePath,
                folderPath = mirrorDir.absolutePath,
                folderSync = false,
            )
        }

        runCatching {
            rootDir.mkdirs()
            mirrorDir.mkdirs()
            baseConfiguration.imagePath?.let { File(it).parentFile?.mkdirs() }
        }

        val sourceUri = if (isDsi) settingsRepository.getDsiSdCardDirectory() else settingsRepository.getDldiSdCardDirectory()
        val sourceRoot = sourceUri?.let { DocumentFile.fromTreeUri(context, it) }
        val targetSize = if (isDsi) settingsRepository.getDsiSdCardImageSize() else settingsRepository.getDldiSdCardImageSize()

        if (sourceUri == null || sourceRoot == null || !sourceRoot.exists() || !sourceRoot.isDirectory || !sourceRoot.canRead()) {
            Log.i(TAG, "SD card (${if (isDsi) "DSi" else "DLDI"}) running in direct image mode")
            activeDirectoryUri = null
            val imgPath = baseConfiguration.imagePath?.takeIf { it.isNotBlank() } ?: defaultImage.absolutePath
            File(imgPath).parentFile?.mkdirs()
            return baseConfiguration.copy(
                enabled = true,
                imagePath = imgPath,
                imageSize = targetSize,
                folderSync = false,
                folderPath = mirrorDir.absolutePath,
            )
        }

        if (!rootDir.isDirectory && !rootDir.mkdirs()) {
            Log.w(TAG, "Could not create SD root directory: ${rootDir.absolutePath}")
            activeDirectoryUri = null
            return null
        }

        if (!mirrorDir.exists() && !mirrorDir.mkdirs()) {
            Log.w(TAG, "Could not create SD mirror directory: ${mirrorDir.absolutePath}")
            activeDirectoryUri = null
            return null
        }

        val snapshotState = readSnapshotState(sourceUri)
        val snapshotEntries = snapshotState.entries
        val currentLocalEntries = collectLocalEntries(mirrorDir)
        val currentDocumentEntries = collectDocumentEntries(sourceRoot)
        runCatching {
            syncDocumentAndLocalDirectories(
                documentRoot = sourceRoot,
                localRoot = mirrorDir,
                ambiguousPreference = SyncSide.DOCUMENT,
                relativePath = "",
                snapshotEntries = snapshotEntries,
                currentLocalEntries = currentLocalEntries,
                currentDocumentEntries = currentDocumentEntries,
            )
            writeSnapshotState(sourceUri, buildSnapshotEntries(sourceRoot, mirrorDir))
        }.onFailure {
            Log.w(TAG, "Could not reconcile SD folder before launch", it)
            activeDirectoryUri = null
            return null
        }

        activeDirectoryUri = sourceUri
        return baseConfiguration.copy(
            enabled = true,
            imagePath = defaultImage.absolutePath,
            imageSize = targetSize,
            folderSync = true,
            folderPath = mirrorDir.absolutePath,
        )
    }

    fun syncBackIfNeeded() {
        val targetUri = activeDirectoryUri ?: return
        val mirrorDir = getTargetMirrorDirectory(activeIsDsi)
        val targetRoot = DocumentFile.fromTreeUri(context, targetUri)
        if (targetRoot == null || !targetRoot.exists() || !targetRoot.isDirectory || !targetRoot.canWrite()) {
            Log.w(TAG, "Skipping SD sync-back because the selected folder is not writable")
            activeDirectoryUri = null
            return
        }

        val snapshotState = readSnapshotState(targetUri)
        val snapshotEntries = snapshotState.entries
        val currentLocalEntries = collectLocalEntries(mirrorDir)
        val currentDocumentEntries = collectDocumentEntries(targetRoot)
        runCatching {
            syncDocumentAndLocalDirectories(
                documentRoot = targetRoot,
                localRoot = mirrorDir,
                ambiguousPreference = SyncSide.LOCAL,
                relativePath = "",
                snapshotEntries = snapshotEntries,
                currentLocalEntries = currentLocalEntries,
                currentDocumentEntries = currentDocumentEntries,
            )
            writeSnapshotState(targetUri, buildSnapshotEntries(targetRoot, mirrorDir))
        }.onFailure {
            Log.w(TAG, "Could not sync SD folder after emulation", it)
        }
        activeDirectoryUri = null
    }

    private fun syncDocumentAndLocalDirectories(
        documentRoot: DocumentFile,
        localRoot: File,
        ambiguousPreference: SyncSide,
        relativePath: String,
        snapshotEntries: Map<String, SnapshotEntry>,
        currentLocalEntries: Map<String, SyncEntryState>,
        currentDocumentEntries: Map<String, SyncEntryState>,
    ) {
        ensureLocalDirectory(localRoot)

        val documentChildrenByName = documentRoot.listFiles()
            .mapNotNull { child -> child.name?.let { it to child } }
            .toMap()
        val localChildrenByName = localRoot.listFiles()
            ?.associateBy { it.name }
            .orEmpty()

        val childNames = (documentChildrenByName.keys + localChildrenByName.keys).sorted()
        childNames.forEach { childName ->
            val documentChild = documentChildrenByName[childName]
            val localChild = localChildrenByName[childName]
            val childRelativePath = relativePath.child(childName)

            when {
                documentChild == null && localChild == null -> Unit
                documentChild == null && localChild != null -> syncLocalOnlyEntry(
                    localChild = localChild,
                    documentParent = documentRoot,
                    ambiguousPreference = ambiguousPreference,
                    relativePath = childRelativePath,
                    snapshotEntries = snapshotEntries,
                    currentLocalEntries = currentLocalEntries,
                )
                documentChild != null && localChild == null -> syncDocumentOnlyEntry(
                    documentChild = documentChild,
                    localChild = File(localRoot, childName),
                    ambiguousPreference = ambiguousPreference,
                    relativePath = childRelativePath,
                    snapshotEntries = snapshotEntries,
                    currentDocumentEntries = currentDocumentEntries,
                )
                documentChild!!.isDirectory && localChild!!.isDirectory -> {
                    syncDocumentAndLocalDirectories(
                        documentRoot = documentChild,
                        localRoot = localChild,
                        ambiguousPreference = ambiguousPreference,
                        relativePath = childRelativePath,
                        snapshotEntries = snapshotEntries,
                        currentLocalEntries = currentLocalEntries,
                        currentDocumentEntries = currentDocumentEntries,
                    )
                }
                documentChild.isFile && localChild!!.isFile -> {
                    synchronizeFileContents(
                        documentFile = documentChild,
                        localFile = localChild,
                        ambiguousPreference = ambiguousPreference,
                        relativePath = childRelativePath,
                        snapshotEntries = snapshotEntries,
                    )
                }
                else -> {
                    resolveTypeConflict(
                        documentParent = documentRoot,
                        documentChild = documentChild,
                        localChild = localChild!!,
                        ambiguousPreference = ambiguousPreference,
                        relativePath = childRelativePath,
                        snapshotEntries = snapshotEntries,
                        currentLocalEntries = currentLocalEntries,
                        currentDocumentEntries = currentDocumentEntries,
                    )
                }
            }
        }
    }

    private fun syncLocalOnlyEntry(
        localChild: File,
        documentParent: DocumentFile,
        ambiguousPreference: SyncSide,
        relativePath: String,
        snapshotEntries: Map<String, SnapshotEntry>,
        currentLocalEntries: Map<String, SyncEntryState>,
    ) {
        val snapshotEntry = snapshotEntries[relativePath]
        val localChangedSinceSnapshot = hasSideChangedSinceSnapshot(relativePath, SyncSide.LOCAL, snapshotEntries, currentLocalEntries)
        if (snapshotEntry != null && !localChangedSinceSnapshot) {
            if (!localChild.deleteRecursively()) {
                error("Could not propagate DLDI delete for ${localChild.absolutePath}")
            }
            return
        }

        when {
            localChild.isDirectory -> {
                val documentDirectory = ensureDocumentDirectory(documentParent, localChild.name, ambiguousPreference)
                syncDocumentAndLocalDirectories(
                    documentRoot = documentDirectory,
                    localRoot = localChild,
                    ambiguousPreference = ambiguousPreference,
                    relativePath = relativePath,
                    snapshotEntries = snapshotEntries,
                    currentLocalEntries = currentLocalEntries,
                    currentDocumentEntries = emptyMap(),
                )
            }
            localChild.isFile -> {
                copyLocalFileToDocument(localChild, documentParent, ambiguousPreference)
            }
        }
    }

    private fun syncDocumentOnlyEntry(
        documentChild: DocumentFile,
        localChild: File,
        ambiguousPreference: SyncSide,
        relativePath: String,
        snapshotEntries: Map<String, SnapshotEntry>,
        currentDocumentEntries: Map<String, SyncEntryState>,
    ) {
        val snapshotEntry = snapshotEntries[relativePath]
        val documentChangedSinceSnapshot = hasSideChangedSinceSnapshot(relativePath, SyncSide.DOCUMENT, snapshotEntries, currentDocumentEntries)
        if (snapshotEntry != null && !documentChangedSinceSnapshot) {
            if (!deleteDocumentRecursively(documentChild)) {
                error("Could not propagate DLDI delete for ${documentChild.uri}")
            }
            return
        }

        when {
            documentChild.isDirectory -> {
                ensureLocalDirectory(localChild)
                syncDocumentAndLocalDirectories(
                    documentRoot = documentChild,
                    localRoot = localChild,
                    ambiguousPreference = ambiguousPreference,
                    relativePath = relativePath,
                    snapshotEntries = snapshotEntries,
                    currentLocalEntries = emptyMap(),
                    currentDocumentEntries = currentDocumentEntries,
                )
            }
            documentChild.isFile -> {
                copyDocumentFileToLocal(documentChild, localChild)
            }
        }
    }

    private fun resolveTypeConflict(
        documentParent: DocumentFile,
        documentChild: DocumentFile,
        localChild: File,
        ambiguousPreference: SyncSide,
        relativePath: String,
        snapshotEntries: Map<String, SnapshotEntry>,
        currentLocalEntries: Map<String, SyncEntryState>,
        currentDocumentEntries: Map<String, SyncEntryState>,
    ) {
        val localChanged = hasSideChangedSinceSnapshot(relativePath, SyncSide.LOCAL, snapshotEntries, currentLocalEntries)
        val documentChanged = hasSideChangedSinceSnapshot(relativePath, SyncSide.DOCUMENT, snapshotEntries, currentDocumentEntries)
        when (choosePreferredSide(
            localChanged = localChanged,
            documentChanged = documentChanged,
            localState = buildLocalEntryState(localChild),
            documentState = buildDocumentEntryState(documentChild),
            ambiguousPreference = ambiguousPreference,
        )) {
            SyncSide.LOCAL -> {
                if (!deleteDocumentRecursively(documentChild)) {
                    error("Could not replace DLDI document entry ${documentChild.uri}")
                }
                syncLocalOnlyEntry(
                    localChild = localChild,
                    documentParent = documentParent,
                    ambiguousPreference = ambiguousPreference,
                    relativePath = relativePath,
                    snapshotEntries = emptyMap(),
                    currentLocalEntries = emptyMap(),
                )
            }
            SyncSide.DOCUMENT -> {
                if (localChild.exists() && !localChild.deleteRecursively()) {
                    error("Could not replace local DLDI entry ${localChild.absolutePath}")
                }
                syncDocumentOnlyEntry(
                    documentChild = documentChild,
                    localChild = localChild,
                    ambiguousPreference = ambiguousPreference,
                    relativePath = relativePath,
                    snapshotEntries = emptyMap(),
                    currentDocumentEntries = emptyMap(),
                )
            }
        }
    }

    private fun synchronizeFileContents(
        documentFile: DocumentFile,
        localFile: File,
        ambiguousPreference: SyncSide,
        relativePath: String,
        snapshotEntries: Map<String, SnapshotEntry>,
    ) {
        val localState = buildLocalEntryState(localFile)
        val documentState = buildDocumentEntryState(documentFile)
        if (localState == documentState) {
            return
        }

        val localChanged = hasEntryChangedSinceSnapshot(relativePath, SyncSide.LOCAL, localState, snapshotEntries)
        val documentChanged = hasEntryChangedSinceSnapshot(relativePath, SyncSide.DOCUMENT, documentState, snapshotEntries)
        when (choosePreferredSide(
            localChanged = localChanged,
            documentChanged = documentChanged,
            localState = localState,
            documentState = documentState,
            ambiguousPreference = ambiguousPreference,
        )) {
            SyncSide.LOCAL -> copyLocalFileIntoExistingDocument(localFile, documentFile)
            SyncSide.DOCUMENT -> copyDocumentFileToLocal(documentFile, localFile)
        }
    }

    private fun copyDocumentFileToLocal(source: DocumentFile, target: File) {
        target.parentFile?.let { ensureLocalDirectory(it) }
        if (target.exists() && target.isDirectory && !target.deleteRecursively()) {
            error("Could not replace local DLDI directory ${target.absolutePath}")
        }

        context.contentResolver.openInputStream(source.uri)?.use { input ->
            target.outputStream().use { output ->
                input.copyTo(output)
            }
        } ?: error("Could not open ${source.uri}")

        val documentLastModified = source.lastModified()
        if (documentLastModified > 0L) {
            target.setLastModified(documentLastModified)
        }
    }

    private fun copyLocalFileToDocument(source: File, targetParent: DocumentFile, ambiguousPreference: SyncSide): DocumentFile {
        val targetFile = ensureDocumentFile(targetParent, source.name, ambiguousPreference)
        return copyLocalFileIntoExistingDocument(source, targetFile)
    }

    private fun copyLocalFileIntoExistingDocument(source: File, targetFile: DocumentFile): DocumentFile {
        context.contentResolver.openOutputStream(targetFile.uri, "wt")?.use { output ->
            source.inputStream().use { input ->
                input.copyTo(output)
            }
        } ?: error("Could not open ${targetFile.uri} for write")
        return targetFile
    }

    private fun ensureLocalDirectory(directory: File) {
        if (directory.exists()) {
            if (!directory.isDirectory) {
                if (!directory.deleteRecursively()) {
                    error("Could not replace local DLDI file ${directory.absolutePath}")
                }
            } else {
                return
            }
        }

        if (!directory.mkdirs() && !directory.isDirectory) {
            error("Could not create ${directory.absolutePath}")
        }
    }

    private fun ensureDocumentDirectory(parent: DocumentFile, name: String, ambiguousPreference: SyncSide): DocumentFile {
        val existing = parent.findFile(name)
        if (existing != null) {
            if (existing.isDirectory) {
                return existing
            }
            when (ambiguousPreference) {
                SyncSide.LOCAL -> {
                    if (!deleteDocumentRecursively(existing)) {
                        error("Could not replace DLDI file ${existing.uri}")
                    }
                }
                SyncSide.DOCUMENT -> error("Cannot replace DLDI file with directory at ${existing.uri}")
            }
        }

        return parent.createDirectory(name)
            ?: error("Could not create DLDI directory $name")
    }

    private fun ensureDocumentFile(parent: DocumentFile, name: String, ambiguousPreference: SyncSide): DocumentFile {
        val existing = parent.findFile(name)
        if (existing != null) {
            if (existing.isFile) {
                return existing
            }
            when (ambiguousPreference) {
                SyncSide.LOCAL -> {
                    if (!deleteDocumentRecursively(existing)) {
                        error("Could not replace DLDI directory ${existing.uri}")
                    }
                }
                SyncSide.DOCUMENT -> error("Cannot replace DLDI directory with file at ${existing.uri}")
            }
        }

        return parent.createFile(MIME_BINARY, name)
            ?: error("Could not create DLDI file $name")
    }

    private fun deleteDocumentRecursively(document: DocumentFile): Boolean {
        if (document.isDirectory) {
            document.listFiles().forEach { child ->
                if (!deleteDocumentRecursively(child)) {
                    return false
                }
            }
        }

        return document.delete()
    }

    private fun choosePreferredSide(
        localChanged: Boolean,
        documentChanged: Boolean,
        localState: SyncEntryState?,
        documentState: SyncEntryState?,
        ambiguousPreference: SyncSide,
    ): SyncSide {
        if (localChanged && !documentChanged) {
            return SyncSide.LOCAL
        }
        if (documentChanged && !localChanged) {
            return SyncSide.DOCUMENT
        }
        if (localState != null && documentState != null) {
            val localTimestamp = localState.lastModified.coerceAtLeast(0L)
            val documentTimestamp = documentState.lastModified.coerceAtLeast(0L)
            if (localTimestamp != documentTimestamp) {
                return if (localTimestamp > documentTimestamp) SyncSide.LOCAL else SyncSide.DOCUMENT
            }
            if (localState.length != documentState.length) {
                return ambiguousPreference
            }
        }
        if (localState != null && documentState == null) {
            return SyncSide.LOCAL
        }
        if (documentState != null && localState == null) {
            return SyncSide.DOCUMENT
        }
        if (localChanged && documentChanged) {
            return ambiguousPreference
        }

        return ambiguousPreference
    }

    private fun hasSideChangedSinceSnapshot(
        relativePath: String,
        side: SyncSide,
        snapshotEntries: Map<String, SnapshotEntry>,
        currentEntries: Map<String, SyncEntryState>,
    ): Boolean {
        if (currentEntries.isEmpty()) {
            return true
        }

        val prefix = if (relativePath.isEmpty()) "" else "$relativePath/"
        val paths = buildSet {
            currentEntries.keys.forEach { path ->
                if (path == relativePath || path.startsWith(prefix)) {
                    add(path)
                }
            }
            snapshotEntries.keys.forEach { path ->
                if (path == relativePath || path.startsWith(prefix)) {
                    add(path)
                }
            }
        }

        return paths.any { path ->
            hasEntryChangedSinceSnapshot(path, side, currentEntries[path], snapshotEntries)
        }
    }

    private fun hasEntryChangedSinceSnapshot(
        relativePath: String,
        side: SyncSide,
        currentState: SyncEntryState?,
        snapshotEntries: Map<String, SnapshotEntry>,
    ): Boolean {
        val snapshot = snapshotEntries[relativePath] ?: return currentState != null
        if (currentState == null) {
            return true
        }

        val snapshotState = when (side) {
            SyncSide.LOCAL -> SyncEntryState(snapshot.kind, snapshot.localLastModified, snapshot.localLength)
            SyncSide.DOCUMENT -> SyncEntryState(snapshot.kind, snapshot.documentLastModified, snapshot.documentLength)
        }
        return currentState != snapshotState
    }

    private fun collectLocalEntries(root: File): Map<String, SyncEntryState> {
        if (!root.exists()) {
            return emptyMap()
        }

        val entries = mutableMapOf<String, SyncEntryState>()
        collectLocalEntriesRecursive(root, "", entries)
        return entries
    }

    private fun collectLocalEntriesRecursive(current: File, relativePath: String, entries: MutableMap<String, SyncEntryState>) {
        current.listFiles()?.forEach { child ->
            val childRelativePath = relativePath.child(child.name)
            val state = buildLocalEntryState(child)
            entries[childRelativePath] = state
            if (child.isDirectory) {
                collectLocalEntriesRecursive(child, childRelativePath, entries)
            }
        }
    }

    private fun collectDocumentEntries(root: DocumentFile): Map<String, SyncEntryState> {
        val entries = mutableMapOf<String, SyncEntryState>()
        collectDocumentEntriesRecursive(root, "", entries)
        return entries
    }

    private fun collectDocumentEntriesRecursive(current: DocumentFile, relativePath: String, entries: MutableMap<String, SyncEntryState>) {
        current.listFiles().forEach { child ->
            val name = child.name ?: return@forEach
            val childRelativePath = relativePath.child(name)
            val state = buildDocumentEntryState(child)
            entries[childRelativePath] = state
            if (child.isDirectory) {
                collectDocumentEntriesRecursive(child, childRelativePath, entries)
            }
        }
    }

    private fun buildLocalEntryState(file: File): SyncEntryState {
        return SyncEntryState(
            kind = if (file.isDirectory) EntryKind.DIRECTORY else EntryKind.FILE,
            lastModified = file.lastModified().coerceAtLeast(0L),
            length = if (file.isFile) file.length() else -1L,
        )
    }

    private fun buildDocumentEntryState(document: DocumentFile): SyncEntryState {
        return SyncEntryState(
            kind = if (document.isDirectory) EntryKind.DIRECTORY else EntryKind.FILE,
            lastModified = document.lastModified().coerceAtLeast(0L),
            length = if (document.isFile) document.length() else -1L,
        )
    }

    private fun buildSnapshotEntries(documentRoot: DocumentFile, localRoot: File): Map<String, SnapshotEntry> {
        val localEntries = collectLocalEntries(localRoot)
        val documentEntries = collectDocumentEntries(documentRoot)
        return (localEntries.keys + documentEntries.keys).sorted().associateWith { path ->
            val localState = localEntries[path] ?: error("Missing local snapshot state for $path")
            val documentState = documentEntries[path] ?: error("Missing document snapshot state for $path")
            SnapshotEntry(
                kind = localState.kind,
                localLastModified = localState.lastModified,
                localLength = localState.length,
                documentLastModified = documentState.lastModified,
                documentLength = documentState.length,
            )
        }
    }

    private fun readSnapshotState(documentTreeUri: Uri): SnapshotState {
        val targetSnapshot = getTargetSnapshotFile(activeIsDsi)
        if (!targetSnapshot.isFile) {
            return SnapshotState(documentTreeUri = documentTreeUri.toString(), entries = emptyMap())
        }

        return runCatching {
            val root = JSONObject(targetSnapshot.readText())
            val storedTreeUri = root.optString("documentTreeUri")
            if (storedTreeUri != documentTreeUri.toString()) {
                return SnapshotState(documentTreeUri = documentTreeUri.toString(), entries = emptyMap())
            }

            val entriesObject = root.optJSONObject("entries") ?: return SnapshotState(
                documentTreeUri = documentTreeUri.toString(),
                entries = emptyMap(),
            )
            val entries = buildMap {
                entriesObject.keys().forEach { path ->
                    val entry = entriesObject.optJSONObject(path) ?: return@forEach
                    put(
                        path,
                        SnapshotEntry(
                            kind = EntryKind.valueOf(entry.getString("kind")),
                            localLastModified = entry.optLong("localLastModified", 0L),
                            localLength = entry.optLong("localLength", -1L),
                            documentLastModified = entry.optLong("documentLastModified", 0L),
                            documentLength = entry.optLong("documentLength", -1L),
                        ),
                    )
                }
            }
            SnapshotState(documentTreeUri = storedTreeUri, entries = entries)
        }.getOrElse {
            Log.w(TAG, "Could not read DLDI snapshot state", it)
            SnapshotState(documentTreeUri = documentTreeUri.toString(), entries = emptyMap())
        }
    }

    private fun writeSnapshotState(documentTreeUri: Uri, entries: Map<String, SnapshotEntry>) {
        val targetSnapshot = getTargetSnapshotFile(activeIsDsi)
        val entriesObject = JSONObject()
        entries.toSortedMap().forEach { (path, entry) ->
            entriesObject.put(
                path,
                JSONObject().apply {
                    put("kind", entry.kind.name)
                    put("localLastModified", entry.localLastModified)
                    put("localLength", entry.localLength)
                    put("documentLastModified", entry.documentLastModified)
                    put("documentLength", entry.documentLength)
                },
            )
        }

        targetSnapshot.writeText(
            JSONObject().apply {
                put("documentTreeUri", documentTreeUri.toString())
                put("entries", entriesObject)
            }.toString(),
        )
    }

    private fun String.child(name: String): String {
        return if (isEmpty()) name else "$this/$name"
    }
}

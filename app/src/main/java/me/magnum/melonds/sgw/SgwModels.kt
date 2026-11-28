package me.magnum.melonds.sgw

import android.net.Uri
import me.magnum.melonds.domain.model.rom.Rom

enum class SgwPlatform(val platformId: Int, val label: String) {
    NDS(184, "Nintendo DS"),
    DSI(185, "Nintendo DSi");

    companion object {
        fun fromPlatformId(id: Int): SgwPlatform = when (id) {
            185 -> DSI
            else -> NDS
        }
    }
}

enum class SgwSourceKind {
    MAIN_CATALOG,
    TRANSLATION,
}

data class SgwTranslationRelease(
    val id: Int,
    val gameId: Int,
    val version: String,
    val translatorTeam: String,
    val notes: String,
    val fileUrl: String,
    val fileSizeBytes: Long,
    val updatedAt: String,
)

data class SgwGameEntry(
    val id: Int,
    val title: String,
    val normalizedTitle: String,
    val platform: SgwPlatform,
    val version: String,
    val releaseYear: Int?,
    val fileSizeBytes: Long,
    val coverUrl: String?,
    val downloadUrl: String,
    val fallbackDownloadUrl: String?,
    val sourceKind: SgwSourceKind,
    val hasTranslation: Boolean = false,
    val translatorTeam: String? = null,
    val translationReleaseId: Int? = null,
    val isStormTeam: Boolean = false,
)

data class SgwUpdateCandidate(
    val localRom: Rom,
    val localVersion: String?,
    val remoteEntry: SgwGameEntry,
    val updateReason: SgwUpdateReason,
)

enum class SgwUpdateReason {
    NEWER_VERSION,
    RUSSIAN_TRANSLATION_AVAILABLE,
    TRANSLATION_UPDATE,
}

data class SgwCatalogSnapshot(
    val ndsGames: List<SgwGameEntry> = emptyList(),
    val dsiGames: List<SgwGameEntry> = emptyList(),
    val translations: List<SgwGameEntry> = emptyList(),
    val updates: List<SgwUpdateCandidate> = emptyList(),
    val fetchedAtEpochMs: Long = 0L,
    val errorMessage: String? = null,
)

data class SgwDownloadProgress(
    val entryId: Int,
    val title: String,
    val downloadedBytes: Long,
    val totalBytes: Long,
    val statusText: String,
    val isCompleted: Boolean = false,
    val isError: Boolean = false,
)

data class SgwReplaceResult(
    val success: Boolean,
    val newRomUri: Uri? = null,
    val newFileName: String? = null,
    val migratedSavesCount: Int = 0,
    val migratedStatesCount: Int = 0,
    val errorMessage: String? = null,
    val httpStatusCode: Int? = null,
)

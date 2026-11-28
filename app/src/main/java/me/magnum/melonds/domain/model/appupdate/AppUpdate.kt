package me.magnum.melonds.domain.model.appupdate

import android.net.Uri
import me.magnum.melonds.domain.model.Version
import me.magnum.melonds.github.UpdateDownloadSource
import kotlin.time.Instant

data class UpdateSourceOption(
    val source: UpdateDownloadSource,
    val id: Long,
    val downloadUri: Uri,
    val binarySize: Long,
    val sourceReleaseUrl: String,
    val releaseTag: String,
)

data class AppUpdate(
    val type: Type,
    val id: Long,
    val downloadUri: Uri,
    val newVersion: Version,
    val description: String,
    val binarySize: Long,
    val updateDate: Instant,
    val releaseTag: String,
    val sourceReleaseUrl: String,
    val mirrorSources: Map<UpdateDownloadSource, UpdateSourceOption> = emptyMap(),
) {
    fun withSelectedSource(source: UpdateDownloadSource): AppUpdate {
        val option = mirrorSources[source] ?: return this
        return copy(
            id = option.id,
            downloadUri = option.downloadUri,
            binarySize = option.binarySize,
            releaseTag = option.releaseTag,
            sourceReleaseUrl = option.sourceReleaseUrl,
        )
    }

    enum class Type {
        PRODUCTION,
        NIGHTLY,
    }
}

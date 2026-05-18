package me.magnum.melonds.domain.model

import androidx.annotation.Keep

@Keep
data class DldiSdCardConfiguration(
    val enabled: Boolean,
    val imagePath: String?,
    val imageSize: Int,
    val folderSync: Boolean,
    val folderPath: String?,
)

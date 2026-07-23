package me.magnum.melonds.common.retroarch

import me.magnum.melonds.domain.model.RetroArchShaderSource

object RetroArchShaderRootResolver {

    fun resolveSource(
        rawSourcePreference: String?,
        hasPickedFolder: Boolean,
        hasInternalInstall: Boolean,
    ): RetroArchShaderSource? {
        RetroArchShaderSource.fromPreference(rawSourcePreference)?.let { return it }

        if (hasPickedFolder) {
            return RetroArchShaderSource.FOLDER
        }

        if (hasInternalInstall) {
            return RetroArchShaderSource.INTERNAL
        }

        return null
    }
}

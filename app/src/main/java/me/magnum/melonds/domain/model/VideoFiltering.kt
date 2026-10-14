package me.magnum.melonds.domain.model

import androidx.annotation.Keep

@Keep
enum class VideoFiltering {
    NONE,
    LINEAR,
    XBR2,
    HQ2X,
    HQ4X,
    QUILEZ,
    LCD,
    SCANLINES,
    SCALE2X,
    AI_UPSCALE,
    RETROARCH;

    fun isSupportedByVulkan(): Boolean {
        return true
    }

    fun isSupportedByOpenGlSurface(): Boolean {
        return true
    }

    fun isSupportedByRenderer(renderer: VideoRenderer): Boolean {
        return when (renderer) {
            VideoRenderer.SOFTWARE -> this != RETROARCH
            VideoRenderer.VULKAN -> isSupportedByVulkan()
            else -> isSupportedByOpenGlSurface()
        }
    }
}

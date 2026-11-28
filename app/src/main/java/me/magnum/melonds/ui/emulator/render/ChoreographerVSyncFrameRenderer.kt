package me.magnum.melonds.ui.emulator.render

import android.os.Build
import android.view.Choreographer
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.TIRAMISU)
class ChoreographerVSyncFrameRenderer(
    private val frameRenderCoordinator: FrameRenderCoordinator,
) : ChoreographerFrameRenderer, Choreographer.VsyncCallback {

    private var isRendering = false
    private var nextRenderTimeNanos = 0L

    override fun startRendering() {
        if (isRendering) {
            return
        }

        isRendering = true
        nextRenderTimeNanos = 0L
        Choreographer.getInstance().postVsyncCallback(this)
    }

    override fun stopRendering() {
        isRendering = false
        nextRenderTimeNanos = 0L
        Choreographer.getInstance().removeVsyncCallback(this)
    }

    override fun onVsync(data: Choreographer.FrameData) {
        if (!isRendering) {
            return
        }

        val rawDeadline = data.preferredFrameTimeline.deadlineNanos
        val frameDelta = rawDeadline - data.frameTimeNanos
        val isHighRefresh = frameDelta <= ChoreographerFrameRenderer.DEADLINE_FRAME_TIME_THRESHOLD
        val frameDeadline = if (isHighRefresh) null else rawDeadline
        val shouldRender = if (isHighRefresh) {
            val frameTimeNanos = data.frameTimeNanos
            if (nextRenderTimeNanos == 0L || frameTimeNanos + TARGET_DS_FRAME_INTERVAL_NS < nextRenderTimeNanos) {
                nextRenderTimeNanos = frameTimeNanos + TARGET_DS_FRAME_INTERVAL_NS
                true
            } else if (frameTimeNanos + VSYNC_JITTER_TOLERANCE_NS >= nextRenderTimeNanos) {
                nextRenderTimeNanos += TARGET_DS_FRAME_INTERVAL_NS
                if (frameTimeNanos - nextRenderTimeNanos > TARGET_DS_FRAME_INTERVAL_NS) {
                    nextRenderTimeNanos = frameTimeNanos + TARGET_DS_FRAME_INTERVAL_NS
                }
                true
            } else {
                false
            }
        } else {
            nextRenderTimeNanos = 0L
            true
        }

        if (shouldRender) {
            frameRenderCoordinator.renderFrame(frameDeadline)
        } else if (isHighRefresh && me.magnum.melonds.MelonEmulator.isVulkanFrameGenEnabled()) {
            frameRenderCoordinator.renderInterpolatedFrame(rawDeadline)
        }
        if (isRendering) {
            Choreographer.getInstance().postVsyncCallback(this)
        }
    }

    private companion object {
        const val TARGET_DS_FRAME_INTERVAL_NS = 16_666_667L
        const val VSYNC_JITTER_TOLERANCE_NS = 500_000L
    }
}

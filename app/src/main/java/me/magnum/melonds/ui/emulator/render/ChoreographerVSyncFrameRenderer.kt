package me.magnum.melonds.ui.emulator.render

import android.os.Build
import android.view.Choreographer
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.TIRAMISU)
class ChoreographerVSyncFrameRenderer(
    private val frameRenderCoordinator: FrameRenderCoordinator,
    private val isEmulationPaused: () -> Boolean = { false },
) : ChoreographerFrameRenderer, Choreographer.VsyncCallback {

    @Volatile
    var emulationPaused: Boolean = false
    private var isRendering = false
    private var nextRenderTimeNanos = 0L
    private var lastRealFrameTimeNanos = 0L

    fun setPaused(paused: Boolean) {
        emulationPaused = paused
    }

    override fun startRendering() {
        if (isRendering) {
            return
        }

        isRendering = true
        nextRenderTimeNanos = 0L
        lastRealFrameTimeNanos = 0L
        Choreographer.getInstance().postVsyncCallback(this)
    }

    override fun stopRendering() {
        isRendering = false
        nextRenderTimeNanos = 0L
        lastRealFrameTimeNanos = 0L
        Choreographer.getInstance().removeVsyncCallback(this)
    }

    override fun onVsync(data: Choreographer.FrameData) {
        if (!isRendering) {
            return
        }

        val rawDeadline = data.preferredFrameTimeline.deadlineNanos
        val frameTimeNanos = data.frameTimeNanos
        val frameDelta = rawDeadline - frameTimeNanos
        val isHighRefresh = frameDelta <= ChoreographerFrameRenderer.DEADLINE_FRAME_TIME_THRESHOLD
        val shouldRender = if (isHighRefresh) {
            if (nextRenderTimeNanos == 0L || frameTimeNanos + DS_FRAME_INTERVAL_NANOS < nextRenderTimeNanos) {
                nextRenderTimeNanos = frameTimeNanos + DS_FRAME_INTERVAL_NANOS
                true
            } else if (frameTimeNanos + VSYNC_JITTER_TOLERANCE_NS >= nextRenderTimeNanos) {
                nextRenderTimeNanos += DS_FRAME_INTERVAL_NANOS
                if (frameTimeNanos - nextRenderTimeNanos > DS_FRAME_INTERVAL_NANOS) {
                    nextRenderTimeNanos = frameTimeNanos + DS_FRAME_INTERVAL_NANOS
                }
                true
            } else {
                false
            }
        } else {
            nextRenderTimeNanos = 0L
            true
        }

        val paused = emulationPaused || isEmulationPaused()
        if (shouldRender) {
            lastRealFrameTimeNanos = frameTimeNanos
            frameRenderCoordinator.renderFrame(rawDeadline)
        } else if (isHighRefresh && !paused && me.magnum.melonds.MelonEmulator.isVulkanFrameGenEnabled()) {
            val blendFactor = if (lastRealFrameTimeNanos > 0L) {
                ((frameTimeNanos - lastRealFrameTimeNanos).toDouble() / DS_FRAME_INTERVAL_NANOS)
                    .toFloat()
                    .coerceIn(0.15f, 0.85f)
            } else {
                0.5f
            }
            if (frameRenderCoordinator is VulkanFrameRenderCoordinator) {
                frameRenderCoordinator.renderInterpolatedFrame(rawDeadline, blendFactor)
            } else {
                frameRenderCoordinator.renderInterpolatedFrame(rawDeadline)
            }
        }
        if (isRendering) {
            Choreographer.getInstance().postVsyncCallback(this)
        }
    }

    private companion object {
        const val DS_FRAME_INTERVAL_NANOS = 16_666_667L
        const val VSYNC_JITTER_TOLERANCE_NS = 500_000L
    }
}

package me.magnum.melonds.ui.emulator.render

import android.os.Build
import android.view.Choreographer
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.TIRAMISU)
class ChoreographerVSyncFrameRenderer(
    private val frameRenderCoordinator: FrameRenderCoordinator,
) : ChoreographerFrameRenderer, Choreographer.VsyncCallback {

    private var isRendering = false
    private var lastRenderedFrameTimeNanos = 0L

    override fun startRendering() {
        if (isRendering) {
            return
        }

        isRendering = true
        lastRenderedFrameTimeNanos = 0L
        Choreographer.getInstance().postVsyncCallback(this)
    }

    override fun stopRendering() {
        isRendering = false
        lastRenderedFrameTimeNanos = 0L
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
            lastRenderedFrameTimeNanos == 0L ||
                data.frameTimeNanos < lastRenderedFrameTimeNanos ||
                (data.frameTimeNanos - lastRenderedFrameTimeNanos) >= HIGH_REFRESH_PACING_INTERVAL_NS
        } else {
            true
        }

        if (shouldRender) {
            lastRenderedFrameTimeNanos = data.frameTimeNanos
            frameRenderCoordinator.renderFrame(frameDeadline)
        }
        if (isRendering) {
            Choreographer.getInstance().postVsyncCallback(this)
        }
    }

    private companion object {
        const val HIGH_REFRESH_PACING_INTERVAL_NS = 14_500_000L
    }
}

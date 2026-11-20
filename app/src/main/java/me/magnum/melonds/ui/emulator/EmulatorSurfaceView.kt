package me.magnum.melonds.ui.emulator

import android.content.Context
import android.opengl.EGLSurface
import android.opengl.GLES30
import android.util.AttributeSet
import android.view.Surface
import android.view.SurfaceHolder
import android.view.SurfaceView
import me.magnum.melonds.domain.model.render.PresentFrameWrapper
import me.magnum.melonds.ui.emulator.model.RuntimeRendererConfiguration
import me.magnum.melonds.ui.emulator.render.EmulatorRenderer
import me.magnum.melonds.ui.emulator.render.GlContext

class EmulatorSurfaceView(context: Context, attrs: AttributeSet? = null) : SurfaceView(context, attrs), SurfaceHolder.Callback {

    interface SurfaceLifecycleListener {
        fun onSurfaceCreated(surfaceView: EmulatorSurfaceView, surface: Surface)
        fun onSurfaceChanged(surfaceView: EmulatorSurfaceView, surface: Surface, width: Int, height: Int)
        fun onSurfaceDestroyed(surfaceView: EmulatorSurfaceView)
    }

    private val surfaceLock = Object()
    private var surfaceWidth = 0
    private var surfaceHeight = 0
    private var surfaceState = SurfaceState.UNINITIALIZED
    private var surface: Surface? = null
    private var boundSurface: Surface? = null
    private var windowSurface: EGLSurface? = null
    private var renderer: EmulatorRenderer? = null
    private var surfaceLifecycleListener: SurfaceLifecycleListener? = null

    private enum class SurfaceState {
        UNINITIALIZED,
        DIRTY,
        READY;
    }

    init {
        holder.addCallback(this)
    }

    fun setRenderer(emulatorRenderer: EmulatorRenderer) {
        renderer = emulatorRenderer
    }

    fun updateRendererConfiguration(newRendererConfiguration: RuntimeRendererConfiguration?) {
        renderer?.updateRendererConfiguration(newRendererConfiguration)
    }

    fun setSurfaceLifecycleListener(listener: SurfaceLifecycleListener?) {
        synchronized(surfaceLock) {
            surfaceLifecycleListener = listener
        }
    }

    fun getCurrentSurface(): Surface? {
        synchronized(surfaceLock) {
            return surface
        }
    }

    fun getCurrentSurfaceSize(): Pair<Int, Int> {
        synchronized(surfaceLock) {
            return surfaceWidth to surfaceHeight
        }
    }

    override fun surfaceCreated(holder: SurfaceHolder) {
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.R) {
            try {
                val compatibility = if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.S) {
                    Surface.FRAME_RATE_COMPATIBILITY_FIXED_SOURCE
                } else {
                    Surface.FRAME_RATE_COMPATIBILITY_DEFAULT
                }
                holder.surface.setFrameRate(
                    60f,
                    compatibility,
                    Surface.CHANGE_FRAME_RATE_ALWAYS
                )
            } catch (_: Throwable) {
            }
        }
        val listener: SurfaceLifecycleListener?
        val currentSurface: Surface?
        synchronized(surfaceLock) {
            surface = holder.surface
            currentSurface = surface
            listener = surfaceLifecycleListener
        }
        currentSurface?.let {
            listener?.onSurfaceCreated(this, it)
        }
    }

    override fun surfaceChanged(holder: SurfaceHolder, format: Int, width: Int, height: Int) {
        val listener: SurfaceLifecycleListener?
        val currentSurface: Surface?
        synchronized(surfaceLock) {
            surfaceWidth = width
            surfaceHeight = height
            if (surfaceState == SurfaceState.READY) {
                surfaceState = SurfaceState.DIRTY
            }
            currentSurface = surface
            listener = surfaceLifecycleListener
        }
        currentSurface?.let {
            listener?.onSurfaceChanged(this, it, width, height)
        }
    }

    override fun surfaceDestroyed(holder: SurfaceHolder) {
        val listener: SurfaceLifecycleListener?
        synchronized(surfaceLock) {
            surface = null
            surfaceState = SurfaceState.UNINITIALIZED
            listener = surfaceLifecycleListener
        }
        listener?.onSurfaceDestroyed(this)
    }

    fun doFrame(glContext: GlContext, presentFrameWrapper: PresentFrameWrapper) {
        synchronized(surfaceLock) {
            val currentSurface = surface
            if (windowSurface != null && (currentSurface == null || boundSurface !== currentSurface)) {
                windowSurface?.let {
                    glContext.destroyWindowSurface(it)
                    windowSurface = null
                }
                boundSurface = null
                surfaceState = SurfaceState.UNINITIALIZED
                if (currentSurface == null) {
                    return
                }
            }
            if (windowSurface == null) {
                if (!setupWindowSurface(glContext)) {
                    return
                }
            }

            glContext.use(windowSurface!!)
            val viewportW = if (surfaceWidth > 0) surfaceWidth else width
            val viewportH = if (surfaceHeight > 0) surfaceHeight else height
            GLES30.glViewport(0, 0, viewportW, viewportH)

            if (surfaceState == SurfaceState.UNINITIALIZED && renderer != null) {
                renderer?.onSurfaceCreated()
                surfaceState = SurfaceState.DIRTY
            }

            if (surfaceState == SurfaceState.DIRTY && renderer != null) {
                renderer?.onSurfaceChanged(surfaceWidth, surfaceHeight)
                surfaceState = SurfaceState.READY
            }

            renderer?.drawFrame(presentFrameWrapper)
            glContext.swapBuffers(windowSurface!!)
        }
    }

    private fun setupWindowSurface(glContext: GlContext): Boolean {
        val currentSurface = surface ?: return false
        if (!currentSurface.isValid) return false
        windowSurface = glContext.createWindowSurface(currentSurface)
        boundSurface = currentSurface
        return true
    }

    fun stop(glContext: GlContext) {
        synchronized(surfaceLock) {
            windowSurface?.let {
                glContext.destroyWindowSurface(it)
                windowSurface = null
            }
            boundSurface = null
            surfaceState = SurfaceState.UNINITIALIZED
        }
    }
}

package me.magnum.melonds.ui.emulator

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.opengl.GLES30
import android.opengl.GLUtils
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import me.magnum.melonds.common.opengl.Shader
import me.magnum.melonds.common.opengl.ShaderFactory
import me.magnum.melonds.common.opengl.ShaderProgramSource
import me.magnum.melonds.common.opengl.VideoFilterShaderProvider
import me.magnum.melonds.domain.model.Rect
import me.magnum.melonds.domain.model.RuntimeBackground
import me.magnum.melonds.domain.model.SCREEN_HEIGHT
import me.magnum.melonds.domain.model.VideoFiltering
import me.magnum.melonds.domain.model.layout.BackgroundMode
import me.magnum.melonds.domain.model.render.PresentFrameWrapper
import me.magnum.melonds.ui.emulator.model.RuntimeRendererConfiguration
import me.magnum.melonds.ui.emulator.render.EmulatorRenderer
import me.magnum.melonds.utils.BitmapUtils
import java.nio.ByteBuffer
import java.nio.ByteOrder
import kotlin.math.roundToInt

class DSRenderer(private val context: Context) : EmulatorRenderer {

    private val backgroundDecodeScope = CoroutineScope(Dispatchers.IO + SupervisorJob())
    private var backgroundDecodeJob: Job? = null

    private val configurationLock = Any()
    private var rendererConfiguration: RuntimeRendererConfiguration? = null
    private var mustUpdateConfiguration = false
    private var isBackgroundPositionDirty = false
    private var isBackgroundLoaded = false

    private var backgroundTexture = 0
    private var lastBoundScreenTextureId = -1
    private var lastAppliedTextureFilter = -1

    private var screenShader: Shader? = null
    private lateinit var backgroundShader: Shader

    private var screensVbo = 0
    private var screensVao = 0
    private var screenIndices = 0

    private var backgroundVbo = 0
    private var backgroundVao = 0

    // Lock used when manipulating background properties
    private val backgroundLock = Any()
    private var background: RuntimeBackground? = null
    private var pendingDecodedBackground: Bitmap? = null
    private var mustLoadBackground = false
    private var topScreenRect: Rect? = null
    private var bottomScreenRect: Rect? = null
    private var topAlpha: Float = 1f
    private var bottomAlpha: Float = 1f
    private var topOnTop: Boolean = false
    private var bottomOnTop: Boolean = false
    private var hybridTopScreenRect: Rect? = null
    private var hybridBottomScreenRect: Rect? = null
    private var hybridAlpha: Float = 1f
    private var hybridOnTop: Boolean = false

    private var width = 0f
    private var height = 0f

    private var backgroundWidth = 0
    private var backgroundHeight = 0

    override fun updateRendererConfiguration(newRendererConfiguration: RuntimeRendererConfiguration?) {
        synchronized(configurationLock) {
            rendererConfiguration = newRendererConfiguration
            mustUpdateConfiguration = true
        }
    }

    override fun setLeftRotationEnabled(enabled: Boolean) {
    }

    fun updateScreenAreas(
        topScreenRect: Rect?,
        bottomScreenRect: Rect?,
        topAlpha: Float,
        bottomAlpha: Float,
        topOnTop: Boolean,
        bottomOnTop: Boolean,
        hybridTopScreenRect: Rect? = null,
        hybridBottomScreenRect: Rect? = null,
        hybridAlpha: Float = 1f,
        hybridOnTop: Boolean = false,
    ) {
        synchronized(configurationLock) {
            this.topScreenRect = topScreenRect
            this.bottomScreenRect = bottomScreenRect
            this.topAlpha = topAlpha
            this.bottomAlpha = bottomAlpha
            this.topOnTop = topOnTop
            this.bottomOnTop = bottomOnTop
            this.hybridTopScreenRect = hybridTopScreenRect
            this.hybridBottomScreenRect = hybridBottomScreenRect
            this.hybridAlpha = hybridAlpha
            this.hybridOnTop = hybridOnTop
            mustUpdateConfiguration = true
        }
    }

    fun setBackground(background: RuntimeBackground) {
        val targetWidth: Int
        val targetHeight: Int
        synchronized(configurationLock) {
            targetWidth = width.roundToInt()
            targetHeight = height.roundToInt()
        }
        synchronized(backgroundLock) {
            this.background = background
            pendingDecodedBackground?.recycle()
            pendingDecodedBackground = null
            mustLoadBackground = true
            isBackgroundPositionDirty = true
            isBackgroundLoaded = false
        }
        scheduleBackgroundDecode(background, targetWidth, targetHeight)
    }

    private fun scheduleBackgroundDecode(background: RuntimeBackground, targetWidth: Int, targetHeight: Int) {
        backgroundDecodeJob?.cancel()
        val uri = background.background?.uri ?: return
        val sampleWidth = if (targetWidth > 0) targetWidth else 1080
        val sampleHeight = if (targetHeight > 0) targetHeight else 1920
        backgroundDecodeJob = backgroundDecodeScope.launch {
            val backgroundSampleSize = BitmapUtils.calculateMinimumSampleSize(context, uri, sampleWidth, sampleHeight)
            val decoded = runCatching {
                context.contentResolver.openInputStream(uri)?.use { stream ->
                    val options = BitmapFactory.Options().apply {
                        inSampleSize = backgroundSampleSize
                    }
                    BitmapFactory.decodeStream(stream, null, options)
                }
            }.getOrNull() ?: return@launch

            synchronized(backgroundLock) {
                if (this@DSRenderer.background === background) {
                    pendingDecodedBackground?.recycle()
                    pendingDecodedBackground = decoded
                    mustLoadBackground = true
                } else {
                    decoded.recycle()
                }
            }
        }
    }

    private fun screenXToViewportX(x: Int): Float {
        if (width <= 0f) return 0f
        return (x / width) * 2f - 1f
    }

    private fun screenYToViewportY(y: Int): Float {
        if (height <= 0f) return 0f
        return 1f - y / height * 2f
    }

    override fun onSurfaceCreated() {
        GLES30.glClearColor(0f, 0f, 0f, 1f)
        GLES30.glClear(GLES30.GL_COLOR_BUFFER_BIT or GLES30.GL_DEPTH_BUFFER_BIT)
        GLES30.glDisable(GLES30.GL_CULL_FACE)

        lastBoundScreenTextureId = -1
        lastAppliedTextureFilter = -1

        // Setup textures
        val textures = IntArray(1)
        GLES30.glGenTextures(1, textures, 0)
        backgroundTexture = textures[0]

        GLES30.glBindTexture(GLES30.GL_TEXTURE_2D, backgroundTexture)
        GLES30.glTexParameteri(GLES30.GL_TEXTURE_2D, GLES30.GL_TEXTURE_WRAP_S, GLES30.GL_CLAMP_TO_EDGE)
        GLES30.glTexParameteri(GLES30.GL_TEXTURE_2D, GLES30.GL_TEXTURE_WRAP_T, GLES30.GL_CLAMP_TO_EDGE)
        GLES30.glTexParameteri(GLES30.GL_TEXTURE_2D, GLES30.GL_TEXTURE_MIN_FILTER, GLES30.GL_LINEAR)
        GLES30.glTexParameteri(GLES30.GL_TEXTURE_2D, GLES30.GL_TEXTURE_MAG_FILTER, GLES30.GL_LINEAR)

        // Setup vertex buffers
        val vbos = IntArray(2)
        val vaos = IntArray(2)
        GLES30.glGenBuffers(2, vbos, 0)
        GLES30.glGenVertexArrays(2, vaos, 0)
        screensVbo = vbos[0]
        screensVao = vaos[0]

        backgroundVbo = vbos[1]
        backgroundVao = vaos[1]

        // Create background shader
        backgroundShader = ShaderFactory.createShaderProgram(ShaderProgramSource.BackgroundShader)

        synchronized(configurationLock) {
            mustUpdateConfiguration = true
        }
        synchronized(backgroundLock) {
            background?.let { bg ->
                if (!isBackgroundLoaded && pendingDecodedBackground == null) {
                    scheduleBackgroundDecode(bg, width.roundToInt(), height.roundToInt())
                }
            }
        }
    }

    private fun applyRendererConfiguration() {
        updateScreenCoordinates()
        updateShader()
    }

    private fun updateScreenCoordinates() {
        // Indices:
        // 1                         2
        //   +-----------------------+ 4
        //   |                       |
        //   |                       |
        //   |                       |
        //   |                       |
        // 0 +-----------------------+
        //   3                         5
        // Texture is vertically flipped

        // The texture will have 2 empty lines between the screens. Take that into account when computing UVs
        val lineRelativeSize = 1f / (SCREEN_HEIGHT * 2 + 2).toFloat()

        val topUvs = floatArrayOf(
            0f, 0.5f - lineRelativeSize,
            0f, 0f,
            1f, 0f,
            0f, 0.5f - lineRelativeSize,
            1f, 0f,
            1f, 0.5f - lineRelativeSize,
        )

        val bottomUvs = floatArrayOf(
            0f, 1f,
            0f, 0.5f + lineRelativeSize,
            1f, 0.5f + lineRelativeSize,
            0f, 1f,
            1f, 0.5f + lineRelativeSize,
            1f, 1f,
        )

        data class ScreenDrawTarget(
            val rect: Rect,
            val uvs: FloatArray,
            val alpha: Float,
            val onTop: Boolean,
        )

        val underTargets = mutableListOf<ScreenDrawTarget>()
        val overTargets = mutableListOf<ScreenDrawTarget>()
        fun addTarget(target: ScreenDrawTarget) {
            if (target.onTop) {
                overTargets += target
            } else {
                underTargets += target
            }
        }

        if (bottomOnTop) {
            topScreenRect?.let { addTarget(ScreenDrawTarget(it, topUvs, topAlpha, false)) }
            bottomScreenRect?.let { addTarget(ScreenDrawTarget(it, bottomUvs, bottomAlpha, true)) }
        } else {
            bottomScreenRect?.let { addTarget(ScreenDrawTarget(it, bottomUvs, bottomAlpha, false)) }
            topScreenRect?.let { addTarget(ScreenDrawTarget(it, topUvs, topAlpha, true)) }
        }
        hybridTopScreenRect?.let { addTarget(ScreenDrawTarget(it, topUvs, hybridAlpha, hybridOnTop)) }
        hybridBottomScreenRect?.let { addTarget(ScreenDrawTarget(it, bottomUvs, hybridAlpha, hybridOnTop)) }

        val screenVertexData = (underTargets + overTargets).flatMap {
            buildScreenVertexData(it.rect, it.uvs, it.alpha).asIterable()
        }.toFloatArray()
        if (screenVertexData.isEmpty()) {
            screenIndices = 0
            return
        }
        val vertexBufferSize = screenVertexData.size * Float.SIZE_BYTES
        val vertexBuffer = ByteBuffer.allocateDirect(vertexBufferSize)
            .order(ByteOrder.nativeOrder())
            .asFloatBuffer()
            .apply {
                put(screenVertexData)
                position(0)
            }

        GLES30.glBindVertexArray(screensVao)
        GLES30.glBindBuffer(GLES30.GL_ARRAY_BUFFER, screensVbo)
        GLES30.glBufferData(GLES30.GL_ARRAY_BUFFER, vertexBufferSize, vertexBuffer, GLES30.GL_STATIC_DRAW)
        screenIndices = vertexBuffer.capacity() / 5 // Each vertex has 5 values
    }

    private fun buildScreenVertexData(rect: Rect, uvs: FloatArray, alpha: Float): FloatArray {
        val left = screenXToViewportX(rect.x)
        val right = screenXToViewportX(rect.x + rect.width)
        val top = screenYToViewportY(rect.y)
        val bottom = screenYToViewportY(rect.y + rect.height)

        // TODO: Apply rotation, like in ExternalScreenRender. Apply to background as well. Rename this class to something more generic
        return floatArrayOf(
            // Position    UVs               Alpha
            left, bottom,  uvs[0], uvs[1],   alpha,
            left, top,     uvs[2], uvs[3],   alpha,
            right, top,    uvs[4], uvs[5],   alpha,
            left, bottom,  uvs[6], uvs[7],   alpha,
            right, top,    uvs[8], uvs[9],   alpha,
            right, bottom, uvs[10], uvs[11], alpha,
        )
    }

    private fun updateShader() {
        // Delete previous shader
        screenShader?.delete()

        val filtering = rendererConfiguration?.videoFiltering ?: VideoFiltering.NONE
        val shaderSource = VideoFilterShaderProvider.getShaderSource(filtering)
        screenShader = ShaderFactory.createShaderProgram(shaderSource)
        lastAppliedTextureFilter = -1
    }

    override fun onSurfaceChanged(width: Int, height: Int) {
        synchronized(configurationLock) {
            this.width = width.toFloat()
            this.height = height.toFloat()
            mustUpdateConfiguration = true
        }

        synchronized(backgroundLock) {
            isBackgroundPositionDirty = true
            background?.let { bg ->
                if (!isBackgroundLoaded && pendingDecodedBackground == null && width > 0 && height > 0) {
                    scheduleBackgroundDecode(bg, width, height)
                }
            }
        }
    }

    override fun drawFrame(presentFrameWrapper: PresentFrameWrapper) {
        synchronized(configurationLock) {
            if (mustUpdateConfiguration) {
                applyRendererConfiguration()
                mustUpdateConfiguration = false
            }
        }

        if (width > 0 && height > 0) {
            GLES30.glViewport(0, 0, width.toInt(), height.toInt())
        }
        GLES30.glClear(GLES30.GL_COLOR_BUFFER_BIT or GLES30.GL_DEPTH_BUFFER_BIT)

        if (!presentFrameWrapper.isValidFrame) {
            return
        }

        synchronized(backgroundLock) {
            renderBackground()
        }

        screenShader?.let { shader ->
            GLES30.glDisable(GLES30.GL_DEPTH_TEST)
            GLES30.glEnable(GLES30.GL_BLEND)
            GLES30.glBlendFunc(GLES30.GL_SRC_ALPHA, GLES30.GL_ONE_MINUS_SRC_ALPHA)

            GLES30.glBindVertexArray(screensVao)
            GLES30.glBindBuffer(GLES30.GL_ARRAY_BUFFER, screensVbo)

            shader.use()

            GLES30.glActiveTexture(GLES30.GL_TEXTURE0)
            GLES30.glBindTexture(GLES30.GL_TEXTURE_2D, presentFrameWrapper.textureId)
            if (presentFrameWrapper.textureId != lastBoundScreenTextureId || shader.textureFiltering != lastAppliedTextureFilter) {
                GLES30.glTexParameteri(GLES30.GL_TEXTURE_2D, GLES30.GL_TEXTURE_MIN_FILTER, shader.textureFiltering)
                GLES30.glTexParameteri(GLES30.GL_TEXTURE_2D, GLES30.GL_TEXTURE_MAG_FILTER, shader.textureFiltering)
                lastBoundScreenTextureId = presentFrameWrapper.textureId
                lastAppliedTextureFilter = shader.textureFiltering
            }

            GLES30.glVertexAttribPointer(shader.attribPos, 2, GLES30.GL_FLOAT, false, 5 * Float.SIZE_BYTES, 0)
            GLES30.glVertexAttribPointer(shader.attribUv, 2, GLES30.GL_FLOAT, false, 5 * Float.SIZE_BYTES, 2 * Float.SIZE_BYTES)
            GLES30.glVertexAttribPointer(shader.attribAlpha, 1, GLES30.GL_FLOAT, false, 5 * Float.SIZE_BYTES, 4 * Float.SIZE_BYTES)
            GLES30.glUniform1i(shader.uniformTex, 0)
            GLES30.glDrawArrays(GLES30.GL_TRIANGLES, 0, screenIndices)

            GLES30.glBindVertexArray(0)
            GLES30.glBindBuffer(GLES30.GL_ARRAY_BUFFER, 0)
        }
    }

    private fun renderBackground() {
        if (mustLoadBackground && pendingDecodedBackground != null) {
            loadBackground()
            mustLoadBackground = false
        }

        if (!isBackgroundLoaded) {
            return
        }

        if (isBackgroundPositionDirty) {
            updateBackgroundPosition()
        }

        GLES30.glBindVertexArray(backgroundVao)
        GLES30.glBindBuffer(GLES30.GL_ARRAY_BUFFER, backgroundVbo)

        backgroundShader.use()

        GLES30.glActiveTexture(GLES30.GL_TEXTURE0)
        GLES30.glBindTexture(GLES30.GL_TEXTURE_2D, backgroundTexture)

        GLES30.glVertexAttribPointer(backgroundShader.attribPos, 2, GLES30.GL_FLOAT, false, 4 * Float.SIZE_BYTES, 0)
        GLES30.glVertexAttribPointer(backgroundShader.attribUv, 2, GLES30.GL_FLOAT, false, 4 * Float.SIZE_BYTES, 2 * Float.SIZE_BYTES)
        GLES30.glUniform1i(backgroundShader.uniformTex, 0)

        GLES30.glDrawArrays(GLES30.GL_TRIANGLES, 0, 6)
    }

    private fun loadBackground() {
        val bitmap = pendingDecodedBackground ?: return
        pendingDecodedBackground = null

        GLES30.glBindTexture(GLES30.GL_TEXTURE_2D, backgroundTexture)
        GLUtils.texImage2D(GLES30.GL_TEXTURE_2D, 0, bitmap, 0)

        backgroundWidth = bitmap.width
        backgroundHeight = bitmap.height
        bitmap.recycle()

        isBackgroundLoaded = true
        isBackgroundPositionDirty = true
    }

    private fun updateBackgroundPosition() {
        val background = background ?: return
        val coords = getBackgroundCoords(background.mode, backgroundWidth, backgroundHeight)

        val vertexData = floatArrayOf(
            // Position             UVs
            coords[0], coords[1],   0f, 1f,
            coords[2], coords[3],   0f, 0f,
            coords[4], coords[5],   1f, 0f,
            coords[6], coords[7],   0f, 1f,
            coords[8], coords[9],   1f, 0f,
            coords[10], coords[11], 1f, 1f,
        )

        val vertexBufferSize = vertexData.size * Float.SIZE_BYTES
        val vertexBuffer = ByteBuffer.allocateDirect(vertexBufferSize)
            .order(ByteOrder.nativeOrder())
            .asFloatBuffer()
            .put(vertexData)
            .position(0)

        GLES30.glBindVertexArray(backgroundVao)
        GLES30.glBindBuffer(GLES30.GL_ARRAY_BUFFER, backgroundVbo)
        GLES30.glBufferData(GLES30.GL_ARRAY_BUFFER, vertexBufferSize, vertexBuffer, GLES30.GL_STATIC_DRAW)

        isBackgroundPositionDirty = false
    }

    private fun getBackgroundCoords(backgroundMode: BackgroundMode, backgroundWidth: Int, backgroundHeight: Int): Array<Float> {
        val backgroundAspectRatio = backgroundWidth / backgroundHeight.toFloat()
        val screenAspectRatio = width / height

        return when (backgroundMode) {
            BackgroundMode.STRETCH -> {
                arrayOf(
                    -1f, -1f,
                    -1f, 1f,
                    1f, 1f,
                    -1f, -1f,
                    1f, 1f,
                    1f, -1f
                )
            }
            BackgroundMode.FIT_CENTER -> {
                if (screenAspectRatio > backgroundAspectRatio) {
                    val scaleFactor = width / backgroundWidth
                    val relativeBackgroundWidth = height / (backgroundHeight * scaleFactor) * 2f
                    arrayOf(
                        -(relativeBackgroundWidth / 2f), -1f,
                        -(relativeBackgroundWidth / 2f), 1f,
                        relativeBackgroundWidth / 2f, 1f,
                        -(relativeBackgroundWidth / 2f), -1f,
                        relativeBackgroundWidth / 2f, 1f,
                        relativeBackgroundWidth / 2f, -1f
                    )
                } else {
                    val scaleFactor = height / backgroundHeight
                    val relativeBackgroundHeight = width / (backgroundWidth * scaleFactor) * 2f
                    arrayOf(
                        -1f, -(relativeBackgroundHeight / 2f),
                        -1f, relativeBackgroundHeight / 2f,
                        1f, relativeBackgroundHeight / 2f,
                        -1f, -(relativeBackgroundHeight / 2f),
                        1f, relativeBackgroundHeight / 2f,
                        1f, -(relativeBackgroundHeight / 2f)
                    )
                }
            }
            BackgroundMode.FIT_LEFT -> {
                if (screenAspectRatio > backgroundAspectRatio) {
                    val scaleFactor = width / backgroundWidth
                    val relativeBackgroundWidth = height / (backgroundHeight * scaleFactor) * 2f
                    arrayOf(
                        -1f, -1f,
                        -1f, 1f,
                        -1 + relativeBackgroundWidth, 1f,
                        -1f, -1f,
                        -1 + relativeBackgroundWidth, 1f,
                        -1 + relativeBackgroundWidth, -1f
                    )
                } else {
                    val scaleFactor = height / backgroundHeight
                    val relativeBackgroundHeight = width / (backgroundWidth * scaleFactor) * 2f
                    arrayOf(
                        -1f, -(relativeBackgroundHeight / 2f),
                        -1f, relativeBackgroundHeight / 2f,
                        1f, relativeBackgroundHeight / 2f,
                        -1f, -(relativeBackgroundHeight / 2f),
                        1f, relativeBackgroundHeight / 2f,
                        1f, -(relativeBackgroundHeight / 2f)
                    )
                }
            }
            BackgroundMode.FIT_RIGHT -> {
                if (screenAspectRatio > backgroundAspectRatio) {
                    val scaleFactor = width / backgroundWidth
                    val relativeBackgroundWidth = height / (backgroundHeight * scaleFactor) * 2f
                    arrayOf(
                        1f - relativeBackgroundWidth, -1f,
                        1f - relativeBackgroundWidth, 1f,
                        1f, 1f,
                        1f - relativeBackgroundWidth, -1f,
                        1f, 1f,
                        1f, -1f
                    )
                } else {
                    val scaleFactor = height / backgroundHeight
                    val relativeBackgroundHeight = width / (backgroundWidth * scaleFactor) * 2f
                    arrayOf(
                        -1f, -(relativeBackgroundHeight / 2f),
                        -1f, relativeBackgroundHeight / 2f,
                        1f, relativeBackgroundHeight / 2f,
                        -1f, -(relativeBackgroundHeight / 2f),
                        1f, relativeBackgroundHeight / 2f,
                        1f, -(relativeBackgroundHeight / 2f)
                    )
                }
            }
            BackgroundMode.FIT_TOP -> {
                if (screenAspectRatio > backgroundAspectRatio) {
                    val scaleFactor = width / backgroundWidth
                    val relativeBackgroundWidth = height / (backgroundHeight * scaleFactor) * 2f
                    arrayOf(
                        -(relativeBackgroundWidth / 2f), -1f,
                        -(relativeBackgroundWidth / 2f), 1f,
                        relativeBackgroundWidth / 2f, 1f,
                        -(relativeBackgroundWidth / 2f), -1f,
                        relativeBackgroundWidth / 2f, 1f,
                        relativeBackgroundWidth / 2f, -1f
                    )
                } else {
                    val scaleFactor = height / backgroundHeight
                    val relativeBackgroundHeight = width / (backgroundWidth * scaleFactor) * 2f
                    arrayOf(
                        -1f, 1f - relativeBackgroundHeight,
                        -1f, 1f,
                        1f, 1f,
                        -1f, 1f - relativeBackgroundHeight,
                        1f, 1f,
                        1f, 1f - relativeBackgroundHeight
                    )
                }
            }
            BackgroundMode.FIT_BOTTOM -> {
                if (screenAspectRatio > backgroundAspectRatio) {
                    val scaleFactor = width / backgroundWidth
                    val relativeBackgroundWidth = height / (backgroundHeight * scaleFactor) * 2f
                    arrayOf(
                        -(relativeBackgroundWidth / 2f), -1f,
                        -(relativeBackgroundWidth / 2f), 1f,
                        relativeBackgroundWidth / 2f, 1f,
                        -(relativeBackgroundWidth / 2f), -1f,
                        relativeBackgroundWidth / 2f, 1f,
                        relativeBackgroundWidth / 2f, -1f
                    )
                } else {
                    val scaleFactor = height / backgroundHeight
                    val relativeBackgroundHeight = width / (backgroundWidth * scaleFactor) * 2f
                    arrayOf(
                        -1f, -1f,
                        -1f, -1f + relativeBackgroundHeight,
                        1f, -1f + relativeBackgroundHeight,
                        -1f, -1f,
                        1f, -1f + relativeBackgroundHeight,
                        1f, -1f
                    )
                }
            }
        }
    }
}

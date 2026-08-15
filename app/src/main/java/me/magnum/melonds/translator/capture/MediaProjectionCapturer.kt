package me.magnum.melonds.translator.capture

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.PixelFormat
import android.hardware.display.DisplayManager
import android.hardware.display.VirtualDisplay
import android.media.Image
import android.media.ImageReader
import android.media.projection.MediaProjection
import android.media.projection.MediaProjectionManager
import android.os.Build
import android.os.Handler
import android.os.Looper
import android.util.DisplayMetrics
import android.view.WindowManager
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlinx.coroutines.withContext
import kotlinx.coroutines.withTimeoutOrNull
import java.nio.ByteBuffer
import kotlin.coroutines.resume

class MediaProjectionCapturer(private val activity: Activity) {

    private val mediaProjectionManager = activity.getSystemService(Context.MEDIA_PROJECTION_SERVICE) as MediaProjectionManager
    private val handler = Handler(Looper.getMainLooper())

    private var mediaProjection: MediaProjection? = null
    private var virtualDisplay: VirtualDisplay? = null
    private var imageReader: ImageReader? = null
    private var currentResultData: Intent? = null
    private var currentResultCode: Int = Activity.RESULT_CANCELED

    val hasPermission: Boolean
        get() = currentResultCode == Activity.RESULT_OK && currentResultData != null

    fun createCaptureIntent(): Intent {
        return mediaProjectionManager.createScreenCaptureIntent()
    }

    fun setPermissionResult(resultCode: Int, data: Intent?) {
        currentResultCode = resultCode
        currentResultData = data
        if (resultCode == Activity.RESULT_OK && data != null) {
            setupMediaProjection(resultCode, data)
        }
    }

    @SuppressLint("WrongConstant")
    private fun setupMediaProjection(resultCode: Int, data: Intent) {
        release()
        try {
            ScreenCaptureService.start(activity)
            mediaProjection = mediaProjectionManager.getMediaProjection(resultCode, data)

            mediaProjection?.registerCallback(object : MediaProjection.Callback() {
                override fun onStop() {
                    release()
                }
            }, handler)

            val windowManager = activity.getSystemService(Context.WINDOW_SERVICE) as WindowManager
            val metrics = DisplayMetrics()
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                val bounds = windowManager.currentWindowMetrics.bounds
                metrics.widthPixels = bounds.width()
                metrics.heightPixels = bounds.height()
                metrics.densityDpi = activity.resources.configuration.densityDpi
            } else {
                @Suppress("DEPRECATION")
                windowManager.defaultDisplay.getRealMetrics(metrics)
            }

            val width = metrics.widthPixels.coerceAtLeast(1)
            val height = metrics.heightPixels.coerceAtLeast(1)
            val dpi = metrics.densityDpi.coerceAtLeast(1)

            imageReader = ImageReader.newInstance(width, height, PixelFormat.RGBA_8888, 2)
            virtualDisplay = mediaProjection?.createVirtualDisplay(
                "StormScreenCapture",
                width,
                height,
                dpi,
                DisplayManager.VIRTUAL_DISPLAY_FLAG_AUTO_MIRROR,
                imageReader?.surface,
                null,
                handler
            )
        } catch (e: Throwable) {
            e.printStackTrace()
            release()
        }
    }

    suspend fun captureScreen(): Bitmap? = withContext(Dispatchers.IO) {
        val reader = imageReader ?: run {
            if (hasPermission && currentResultData != null) {
                withContext(Dispatchers.Main) {
                    setupMediaProjection(currentResultCode, currentResultData!!)
                }
            }
            imageReader ?: return@withContext null
        }

        // Try reading latest image, or wait for next available frame
        var image: Image? = try {
            reader.acquireLatestImage()
        } catch (e: Throwable) {
            null
        }

        if (image == null) {
            // Wait up to 350ms for frame
            image = withTimeoutOrNull(350) {
                suspendCancellableCoroutine { continuation ->
                    reader.setOnImageAvailableListener({ ir ->
                        reader.setOnImageAvailableListener(null, null)
                        val img = try {
                            ir.acquireLatestImage()
                        } catch (t: Throwable) {
                            null
                        }
                        if (continuation.isActive) continuation.resume(img)
                    }, handler)
                }
            }
        }

        image ?: return@withContext null

        try {
            val planes = image.planes
            val buffer = planes[0].buffer
            val pixelStride = planes[0].pixelStride
            val rowStride = planes[0].rowStride
            val rowPadding = rowStride - pixelStride * image.width

            val bitmap = Bitmap.createBitmap(
                image.width + rowPadding / pixelStride,
                image.height,
                Bitmap.Config.ARGB_8888
            )
            bitmap.copyPixelsFromBuffer(buffer)

            // Crop padding if necessary
            if (bitmap.width != image.width) {
                val cropped = Bitmap.createBitmap(bitmap, 0, 0, image.width, image.height)
                bitmap.recycle()
                return@withContext cropped
            }
            return@withContext bitmap
        } catch (e: Throwable) {
            e.printStackTrace()
            return@withContext null
        } finally {
            image.close()
        }
    }

    fun release() {
        try {
            virtualDisplay?.release()
            virtualDisplay = null
            imageReader?.close()
            imageReader = null
            mediaProjection?.stop()
            mediaProjection = null
        } catch (e: Throwable) {
            // ignore
        }
    }

    fun onDestroy() {
        release()
        try {
            ScreenCaptureService.stop(activity)
        } catch (e: Throwable) {
            // ignore
        }
    }
}

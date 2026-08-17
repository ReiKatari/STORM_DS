package me.magnum.melonds.translator.capture

import android.annotation.SuppressLint
import android.app.Activity
import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.Service
import android.content.Context
import android.content.Intent
import android.content.pm.ServiceInfo
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
import android.os.IBinder
import android.os.Looper
import android.util.DisplayMetrics
import android.util.Log
import android.view.WindowManager
import androidx.core.app.NotificationCompat
import androidx.core.app.ServiceCompat
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext
import me.magnum.melonds.R

class ScreenCaptureService : Service() {

    companion object {
        private const val TAG = "ScreenCaptureService"
        private const val CHANNEL_ID = "storm_ds_screen_capture"
        private const val NOTIFICATION_ID = 8842
        const val ACTION_START = "me.magnum.melonds.translator.START_CAPTURE"
        const val ACTION_STOP = "me.magnum.melonds.translator.STOP_CAPTURE"
        const val EXTRA_RESULT_CODE = "extra_result_code"
        const val EXTRA_DATA_INTENT = "extra_data_intent"

        @Volatile
        var isReady: Boolean = false
            private set

        @Volatile
        var pendingResultCode: Int = Activity.RESULT_CANCELED
        @Volatile
        var pendingDataIntent: Intent? = null

        private var mediaProjection: MediaProjection? = null
        private var virtualDisplay: VirtualDisplay? = null
        private var imageReader: ImageReader? = null
        private val handler = Handler(Looper.getMainLooper())

        @Volatile
        private var latestFrameBitmap: Bitmap? = null

        fun startCapture(context: Context, resultCode: Int, data: Intent) {
            pendingResultCode = resultCode
            pendingDataIntent = data
            val intent = Intent(context, ScreenCaptureService::class.java).apply {
                action = ACTION_START
                putExtra(EXTRA_RESULT_CODE, resultCode)
                putExtra(EXTRA_DATA_INTENT, data)
            }
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                context.startForegroundService(intent)
            } else {
                context.startService(intent)
            }
        }

        fun stop(context: Context) {
            pendingResultCode = Activity.RESULT_CANCELED
            pendingDataIntent = null
            val intent = Intent(context, ScreenCaptureService::class.java).apply {
                action = ACTION_STOP
            }
            context.stopService(intent)
        }

        private fun convertImageToBitmap(image: Image): Bitmap? {
            return try {
                val planes = image.planes
                val buffer = planes[0].buffer
                val pixelStride = planes[0].pixelStride
                val rowStride = planes[0].rowStride
                val rowPadding = rowStride - pixelStride * image.width

                val rawBitmap = Bitmap.createBitmap(
                    image.width + rowPadding / pixelStride,
                    image.height,
                    Bitmap.Config.ARGB_8888
                )
                rawBitmap.copyPixelsFromBuffer(buffer)

                // Create clean target bitmap of exact image size
                val finalBitmap = Bitmap.createBitmap(image.width, image.height, Bitmap.Config.ARGB_8888)
                val canvas = android.graphics.Canvas(finalBitmap)
                // ColorMatrix: Alpha_out = 255f, keeping R, G, B channels 100% identical.
                // This guarantees that even if MediaProjection output had alpha=0 on GPU,
                // every pixel in memory has A=255 (0xFFRRGGBB), so ML Kit OCR sees all pixels.
                val colorMatrix = android.graphics.ColorMatrix(floatArrayOf(
                    1f, 0f, 0f, 0f, 0f,
                    0f, 1f, 0f, 0f, 0f,
                    0f, 0f, 1f, 0f, 0f,
                    0f, 0f, 0f, 0f, 255f
                ))
                val paint = android.graphics.Paint().apply {
                    colorFilter = android.graphics.ColorMatrixColorFilter(colorMatrix)
                }
                val srcRect = android.graphics.Rect(0, 0, image.width, image.height)
                val dstRect = android.graphics.Rect(0, 0, image.width, image.height)
                canvas.drawBitmap(rawBitmap, srcRect, dstRect, paint)
                rawBitmap.recycle()

                finalBitmap
            } catch (e: Throwable) {
                Log.e(TAG, "Failed to convert Image to Bitmap", e)
                null
            }
        }

        suspend fun captureFrame(): Bitmap? = withContext(Dispatchers.IO) {
            // Simply read the latest cached frame that the permanent listener maintains.
            // NEVER touch reader.setOnImageAvailableListener here — the permanent listener
            // set in setupMediaProjection() keeps latestFrameBitmap updated continuously.
            // Overwriting it would cause a race condition that stalls VirtualDisplay.
            var retries = 10 // Wait up to 500ms (10 × 50ms)
            while (retries > 0) {
                val bmp = latestFrameBitmap
                if (bmp != null && !bmp.isRecycled) {
                    return@withContext try {
                        bmp.copy(Bitmap.Config.ARGB_8888, false)
                    } catch (_: Exception) {
                        null
                    }
                }
                delay(50)
                retries--
            }
            null
        }

        fun cleanup() {
            isReady = false
            try {
                latestFrameBitmap?.recycle()
                latestFrameBitmap = null
                virtualDisplay?.release()
                virtualDisplay = null
                imageReader?.close()
                imageReader = null
                mediaProjection?.stop()
                mediaProjection = null
            } catch (e: Throwable) {
                Log.e(TAG, "Error cleaning up screen capture", e)
            }
        }
    }

    override fun onBind(intent: Intent?): IBinder? = null

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        if (intent?.action == ACTION_STOP) {
            cleanup()
            stopForeground(STOP_FOREGROUND_REMOVE)
            stopSelf()
            return START_NOT_STICKY
        }

        createNotificationChannel()
        val notification = createNotification()

        val fgsType = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            ServiceInfo.FOREGROUND_SERVICE_TYPE_MEDIA_PROJECTION
        } else {
            0
        }

        // 1. Android 14+ MANDATE: startForeground MUST complete with MEDIA_PROJECTION type
        // BEFORE getMediaProjection is called in the same process.
        ServiceCompat.startForeground(this, NOTIFICATION_ID, notification, fgsType)

        // 2. Initialize MediaProjection and VirtualDisplay inside the Foreground Service
        val resultCode = if (pendingResultCode != Activity.RESULT_CANCELED) pendingResultCode else (intent?.getIntExtra(EXTRA_RESULT_CODE, Activity.RESULT_CANCELED) ?: Activity.RESULT_CANCELED)
        val dataIntent = pendingDataIntent ?: (if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            intent?.getParcelableExtra(EXTRA_DATA_INTENT, Intent::class.java)
        } else {
            @Suppress("DEPRECATION")
            intent?.getParcelableExtra(EXTRA_DATA_INTENT)
        })

        if (resultCode == Activity.RESULT_OK && dataIntent != null && mediaProjection == null) {
            setupMediaProjection(resultCode, dataIntent)
        }

        return START_STICKY
    }

    @SuppressLint("WrongConstant")
    private fun setupMediaProjection(resultCode: Int, data: Intent) {
        try {
            val mpManager = getSystemService(Context.MEDIA_PROJECTION_SERVICE) as MediaProjectionManager
            val mp = mpManager.getMediaProjection(resultCode, data)
            if (mp == null) {
                Log.e(TAG, "MediaProjectionManager.getMediaProjection returned null")
                return
            }

            mediaProjection = mp
            mp.registerCallback(object : MediaProjection.Callback() {
                override fun onStop() {
                    cleanup()
                }
            }, handler)

            val windowManager = getSystemService(Context.WINDOW_SERVICE) as WindowManager
            val metrics = DisplayMetrics()
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                val bounds = windowManager.currentWindowMetrics.bounds
                metrics.widthPixels = bounds.width()
                metrics.heightPixels = bounds.height()
                metrics.densityDpi = resources.configuration.densityDpi
            } else {
                @Suppress("DEPRECATION")
                windowManager.defaultDisplay.getRealMetrics(metrics)
            }

            val width = metrics.widthPixels.coerceAtLeast(1)
            val height = metrics.heightPixels.coerceAtLeast(1)
            val dpi = metrics.densityDpi.coerceAtLeast(1)

            val reader = ImageReader.newInstance(width, height, PixelFormat.RGBA_8888, 2)
            reader.setOnImageAvailableListener({ ir ->
                var image: Image? = null
                try {
                    image = ir.acquireLatestImage()
                    if (image != null) {
                        val freshBmp = convertImageToBitmap(image)
                        if (freshBmp != null) {
                            val old = latestFrameBitmap
                            latestFrameBitmap = freshBmp
                            if (old !== freshBmp) {
                                old?.recycle()
                            }
                        }
                    }
                } catch (_: Throwable) {
                } finally {
                    image?.close()
                }
            }, handler)
            imageReader = reader

            virtualDisplay = mp.createVirtualDisplay(
                "StormScreenCapture",
                width,
                height,
                dpi,
                DisplayManager.VIRTUAL_DISPLAY_FLAG_AUTO_MIRROR,
                reader.surface,
                null,
                handler
            )

            isReady = true
            Log.i(TAG, "MediaProjection and VirtualDisplay successfully initialized (${width}x${height} @ ${dpi}dpi)")
        } catch (e: Throwable) {
            Log.e(TAG, "Failed to initialize MediaProjection in service", e)
            cleanup()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        cleanup()
    }

    private fun createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                CHANNEL_ID,
                "STORM DS Screen Translator",
                NotificationManager.IMPORTANCE_LOW
            ).apply {
                description = "Active screen translation service"
                setShowBadge(false)
            }
            val manager = getSystemService(NotificationManager::class.java)
            manager.createNotificationChannel(channel)
        }
    }

    private fun createNotification(): Notification {
        return NotificationCompat.Builder(this, CHANNEL_ID)
            .setContentTitle("STORM DS Screen Translator")
            .setContentText("Screen translation active")
            .setSmallIcon(R.drawable.ic_translate)
            .setPriority(NotificationCompat.PRIORITY_LOW)
            .setOngoing(true)
            .build()
    }
}

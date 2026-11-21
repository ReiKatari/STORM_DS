package me.magnum.melonds.translator.capture

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.media.projection.MediaProjectionManager

class MediaProjectionCapturer(private val activity: Activity) {

    companion object {
        @Volatile
        private var permissionGranted: Boolean = false

        fun resetPermissionFlag() {
            permissionGranted = false
        }
    }

    private val mediaProjectionManager = activity.getSystemService(Context.MEDIA_PROJECTION_SERVICE) as MediaProjectionManager

    val hasPermission: Boolean
        get() = permissionGranted && ScreenCaptureService.isReady

    fun createCaptureIntent(): Intent {
        return if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.UPSIDE_DOWN_CAKE) {
            val config = android.media.projection.MediaProjectionConfig.createConfigForDefaultDisplay()
            mediaProjectionManager.createScreenCaptureIntent(config)
        } else {
            mediaProjectionManager.createScreenCaptureIntent()
        }
    }

    fun setPermissionResult(resultCode: Int, data: Intent?) {
        if (resultCode == Activity.RESULT_OK && data != null) {
            permissionGranted = true
            ScreenCaptureService.startCapture(activity, resultCode, data)
        } else {
            permissionGranted = false
        }
    }

    suspend fun captureScreen(): Bitmap? {
        return ScreenCaptureService.captureFrame()
    }

    fun release() {
        permissionGranted = false
        ScreenCaptureService.cleanup()
    }

    fun onDestroy() {
        permissionGranted = false
        ScreenCaptureService.stop(activity)
    }
}


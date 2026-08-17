package me.magnum.melonds.translator.capture

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.media.projection.MediaProjectionManager

class MediaProjectionCapturer(private val activity: Activity) {

    private val mediaProjectionManager = activity.getSystemService(Context.MEDIA_PROJECTION_SERVICE) as MediaProjectionManager
    private var hasGrantedPermission: Boolean = false

    val hasPermission: Boolean
        get() = hasGrantedPermission || ScreenCaptureService.isReady

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
            hasGrantedPermission = true
            ScreenCaptureService.startCapture(activity, resultCode, data)
        } else {
            hasGrantedPermission = false
        }
    }

    suspend fun captureScreen(): Bitmap? {
        return ScreenCaptureService.captureFrame()
    }

    fun release() {
        hasGrantedPermission = false
        ScreenCaptureService.cleanup()
    }

    fun onDestroy() {
        hasGrantedPermission = false
        ScreenCaptureService.stop(activity)
    }
}


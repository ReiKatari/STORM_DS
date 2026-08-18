package me.magnum.melonds.ui.emulator.render

import android.graphics.Bitmap
import android.graphics.Color
import androidx.annotation.ColorInt

/**
 * Real-time dynamic Ambilight / Screen Glow color extractor.
 * Computes average edge ambient glow colors from current DS top and bottom frame buffers.
 */
object AmbientGlowManager {

    @ColorInt
    fun extractDominantGlowColor(bitmap: Bitmap?): Int {
        if (bitmap == null || bitmap.isRecycled) return Color.TRANSPARENT

        try {
            val width = bitmap.width
            val height = bitmap.height
            if (width <= 0 || height <= 0) return Color.TRANSPARENT

            var rSum = 0L
            var gSum = 0L
            var bSum = 0L
            var sampleCount = 0

            // Sample edge pixels (top, bottom, left, right margins)
            val stepX = (width / 8).coerceAtLeast(1)
            val stepY = (height / 8).coerceAtLeast(1)

            for (x in 0 until width step stepX) {
                val topPixel = bitmap.getPixel(x, 0)
                val bottomPixel = bitmap.getPixel(x, height - 1)
                rSum += Color.red(topPixel) + Color.red(bottomPixel)
                gSum += Color.green(topPixel) + Color.green(bottomPixel)
                bSum += Color.blue(topPixel) + Color.blue(bottomPixel)
                sampleCount += 2
            }

            for (y in 0 until height step stepY) {
                val leftPixel = bitmap.getPixel(0, y)
                val rightPixel = bitmap.getPixel(width - 1, y)
                rSum += Color.red(leftPixel) + Color.red(rightPixel)
                gSum += Color.green(leftPixel) + Color.green(rightPixel)
                bSum += Color.blue(leftPixel) + Color.blue(rightPixel)
                sampleCount += 2
            }

            if (sampleCount == 0) return Color.TRANSPARENT

            val avgR = (rSum / sampleCount).toInt().coerceIn(0, 255)
            val avgG = (gSum / sampleCount).toInt().coerceIn(0, 255)
            val avgB = (bSum / sampleCount).toInt().coerceIn(0, 255)

            // Return rich ambient tint with 40% alpha
            return Color.argb(100, avgR, avgG, avgB)
        } catch (_: Throwable) {
            return Color.TRANSPARENT
        }
    }
}

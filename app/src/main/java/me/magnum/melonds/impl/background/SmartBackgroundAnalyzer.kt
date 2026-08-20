package me.magnum.melonds.impl.background

import android.graphics.Bitmap
import android.graphics.Color
import me.magnum.melonds.domain.model.layout.BackgroundMode
import me.magnum.melonds.ui.Theme
import me.magnum.melonds.ui.theme.*
import androidx.compose.ui.graphics.toArgb
import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sqrt
import kotlin.math.min

data class BackgroundAnalysis(
    val recommendedTheme: Theme,
    val recommendedMode: BackgroundMode,
    val recommendedOverlayAlpha: Float,
    val dominantColor: Int,
    val isImageDark: Boolean,
    val matchConfidence: Float,
)

class SmartBackgroundAnalyzer {

    fun analyze(bitmap: Bitmap, screenAspectRatio: Float = 16f / 9f): BackgroundAnalysis {
        // Sample colors from a grid across the image
        val sampledColors = sampleImageColors(bitmap, gridSize = 8)
        val dominantColor = findDominantColor(sampledColors)
        val isImageDark = calculateLuminance(dominantColor) < 0.5

        // Compare against each theme
        val themeColors = mapOf(
            Theme.DARK to DarkWatermelonColors,
            Theme.LIGHT to LightWatermelonColors,
            Theme.MIDNIGHT to MidnightWatermelonColors,
            Theme.CYBERPUNK to CyberpunkWatermelonColors,
            Theme.GOTHIC to GothicWatermelonColors,
            Theme.MATRIX to MatrixWatermelonColors,
            Theme.SOLAR to SolarWatermelonColors,
            Theme.SAKURA to SakuraWatermelonColors,
        )

        var bestTheme = Theme.DARK
        var minDistance = Double.MAX_VALUE

        for ((theme, colors) in themeColors) {
            val themeBg = colors.bg.toArgb()
            val themeAccent = colors.green.toArgb()

            var totalDistance = 0.0
            for (color in sampledColors) {
                val distBg = colorDistanceDeltaE(color, themeBg)
                val distAccent = colorDistanceDeltaE(color, themeAccent)
                totalDistance += min(distBg, distAccent)
            }
            totalDistance /= sampledColors.size

            // Penalize light theme for dark images and vice versa
            if (colors.isDark != isImageDark) {
                totalDistance += 50.0
            }

            if (totalDistance < minDistance) {
                minDistance = totalDistance
                bestTheme = theme
            }
        }

        // Recommend background mode based on aspect ratio match
        val imageAspectRatio = bitmap.width.toFloat() / bitmap.height.toFloat()
        val recommendedMode = if (abs(imageAspectRatio - screenAspectRatio) < 0.15f) {
            BackgroundMode.STRETCH
        } else {
            BackgroundMode.FIT_CENTER
        }

        // Recommend overlay alpha for text readability
        val recommendedOverlayAlpha = if (isImageDark) 0.3f else 0.5f

        // Confidence: how close the best match is (0.0 = bad, 1.0 = perfect)
        val matchConfidence = ((100.0 - min(minDistance, 100.0)) / 100.0).toFloat()

        return BackgroundAnalysis(
            recommendedTheme = bestTheme,
            recommendedMode = recommendedMode,
            recommendedOverlayAlpha = recommendedOverlayAlpha,
            dominantColor = dominantColor,
            isImageDark = isImageDark,
            matchConfidence = matchConfidence,
        )
    }

    /** Sample colors from an evenly-spaced grid across the bitmap. */
    private fun sampleImageColors(bitmap: Bitmap, gridSize: Int): List<Int> {
        val colors = mutableListOf<Int>()
        val stepX = (bitmap.width / (gridSize + 1)).coerceAtLeast(1)
        val stepY = (bitmap.height / (gridSize + 1)).coerceAtLeast(1)

        for (row in 1..gridSize) {
            for (col in 1..gridSize) {
                val x = (col * stepX).coerceIn(0, bitmap.width - 1)
                val y = (row * stepY).coerceIn(0, bitmap.height - 1)
                colors.add(bitmap.getPixel(x, y))
            }
        }
        return colors
    }

    /** Find the most frequent color bucket from sampled colors. */
    private fun findDominantColor(colors: List<Int>): Int {
        if (colors.isEmpty()) return Color.BLACK
        // Bucket colors by reducing precision (top 4 bits of each channel)
        val buckets = mutableMapOf<Int, MutableList<Int>>()
        for (color in colors) {
            val key = ((Color.red(color) shr 4) shl 8) or
                      ((Color.green(color) shr 4) shl 4) or
                      (Color.blue(color) shr 4)
            buckets.getOrPut(key) { mutableListOf() }.add(color)
        }
        val largestBucket = buckets.maxByOrNull { it.value.size }?.value ?: return colors[0]
        // Average the colors in the largest bucket
        var r = 0L; var g = 0L; var b = 0L
        for (c in largestBucket) {
            r += Color.red(c); g += Color.green(c); b += Color.blue(c)
        }
        val n = largestBucket.size
        return Color.rgb((r / n).toInt(), (g / n).toInt(), (b / n).toInt())
    }

    private fun calculateLuminance(color: Int): Double {
        var r = Color.red(color) / 255.0
        var g = Color.green(color) / 255.0
        var b = Color.blue(color) / 255.0
        r = if (r <= 0.03928) r / 12.92 else ((r + 0.055) / 1.055).pow(2.4)
        g = if (g <= 0.03928) g / 12.92 else ((g + 0.055) / 1.055).pow(2.4)
        b = if (b <= 0.03928) b / 12.92 else ((b + 0.055) / 1.055).pow(2.4)
        return 0.2126 * r + 0.7152 * g + 0.0722 * b
    }

    private fun colorDistanceDeltaE(c1: Int, c2: Int): Double {
        val lab1 = rgbToLab(c1)
        val lab2 = rgbToLab(c2)
        val dl = lab1[0] - lab2[0]
        val da = lab1[1] - lab2[1]
        val db = lab1[2] - lab2[2]
        return sqrt(dl * dl + da * da + db * db)
    }

    private fun rgbToLab(color: Int): DoubleArray {
        var r = Color.red(color) / 255.0
        var g = Color.green(color) / 255.0
        var b = Color.blue(color) / 255.0

        r = if (r > 0.04045) ((r + 0.055) / 1.055).pow(2.4) else r / 12.92
        g = if (g > 0.04045) ((g + 0.055) / 1.055).pow(2.4) else g / 12.92
        b = if (b > 0.04045) ((b + 0.055) / 1.055).pow(2.4) else b / 12.92

        r *= 100.0; g *= 100.0; b *= 100.0

        val x = r * 0.4124 + g * 0.3576 + b * 0.1805
        val y = r * 0.2126 + g * 0.7152 + b * 0.0722
        val z = r * 0.0193 + g * 0.1192 + b * 0.9505

        var xn = x / 95.047
        var yn = y / 100.000
        var zn = z / 108.883

        xn = if (xn > 0.008856) xn.pow(1.0 / 3.0) else 7.787 * xn + 16.0 / 116.0
        yn = if (yn > 0.008856) yn.pow(1.0 / 3.0) else 7.787 * yn + 16.0 / 116.0
        zn = if (zn > 0.008856) zn.pow(1.0 / 3.0) else 7.787 * zn + 16.0 / 116.0

        return doubleArrayOf(116.0 * yn - 16.0, 500.0 * (xn - yn), 200.0 * (yn - zn))
    }
}

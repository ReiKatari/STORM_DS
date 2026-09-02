package me.magnum.melonds.translator.ocr

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.graphics.RectF
import android.util.Log
import com.google.mlkit.vision.common.InputImage
import com.google.mlkit.vision.text.Text
import com.google.mlkit.vision.text.TextRecognition
import com.google.mlkit.vision.text.TextRecognizer
import com.google.mlkit.vision.text.chinese.ChineseTextRecognizerOptions
import com.google.mlkit.vision.text.japanese.JapaneseTextRecognizerOptions
import com.google.mlkit.vision.text.latin.TextRecognizerOptions
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlinx.coroutines.withContext
import me.magnum.melonds.translator.model.TranslatedTextBlock
import me.magnum.melonds.translator.model.TranslationRegion
import kotlin.coroutines.resumeWithException
import kotlin.math.max
import kotlin.math.min
import kotlin.math.sqrt

/**
 * Advanced Nintendo DS Pixel Font OCR Engine.
 * Tailored for 256x192 / 256x384 retro bitmap fonts with:
 * - 3x-4x Point-Sampled Nearest-Neighbor Upscaling
 * - Min-Max Dynamic Contrast Stretching
 * - Sauvola Fast Integral Adaptive Thresholding (O(1) local window binarization)
 * - Otsu Inter-Class Optimal Binarization
 * - Chromatic Text Color Isolation (White / Yellow / Cyan / Green text extraction)
 */
class GameTextRecognizer {

    companion object {
        private const val TAG = "GameTextRecognizer"
    }

    var lastOcrError: String? = null
        private set

    private val latinRecognizer: TextRecognizer by lazy {
        TextRecognition.getClient(TextRecognizerOptions.DEFAULT_OPTIONS)
    }

    private val japaneseRecognizer: TextRecognizer by lazy {
        TextRecognition.getClient(JapaneseTextRecognizerOptions.Builder().build())
    }

    private val chineseRecognizer: TextRecognizer by lazy {
        TextRecognition.getClient(ChineseTextRecognizerOptions.Builder().build())
    }

    private val ocrLruCache = object : android.util.LruCache<Long, List<TranslatedTextBlock>>(32) {}

    private fun computeBitmapHash(bitmap: Bitmap): Long {
        val w = bitmap.width
        val h = bitmap.height
        var hash = 1125899906842597L
        val stepX = max(1, w / 8)
        val stepY = max(1, h / 8)
        for (y in 0 until h step stepY) {
            for (x in 0 until w step stepX) {
                hash = 31L * hash + bitmap.getPixel(x, y)
            }
        }
        return hash
    }

    suspend fun recognizeTextBlocks(
        bitmap: Bitmap,
        sourceLang: String,
        regions: List<TranslationRegion> = emptyList()
    ): List<TranslatedTextBlock> = withContext(Dispatchers.Default) {
        lastOcrError = null
        val safeBitmap = ensureSoftwareBitmap(bitmap)

        if (regions.isEmpty()) {
            val bmpHash = computeBitmapHash(safeBitmap)
            ocrLruCache.get(bmpHash)?.let { cached ->
                Log.i(TAG, "OCR Cache hit: returning ${cached.size} cached blocks instantly")
                if (safeBitmap !== bitmap) safeBitmap.recycle()
                return@withContext cached
            }
        }

        Log.i(TAG, "OCR start: bitmap=${safeBitmap.width}x${safeBitmap.height}, regions=${regions.size}, lang=$sourceLang")

        if (regions.isNotEmpty()) {
            val allRegionBlocks = mutableListOf<TranslatedTextBlock>()
            val imgW = safeBitmap.width
            val imgH = safeBitmap.height

            for ((idx, region) in regions.withIndex()) {
                val leftPx = (region.rect.left * imgW).toInt().coerceIn(0, imgW - 1)
                val topPx = (region.rect.top * imgH).toInt().coerceIn(0, imgH - 1)
                val rightPx = (region.rect.right * imgW).toInt().coerceIn(leftPx + 1, imgW)
                val bottomPx = (region.rect.bottom * imgH).toInt().coerceIn(topPx + 1, imgH)

                val cropW = rightPx - leftPx
                val cropH = bottomPx - topPx
                if (cropW < 6 || cropH < 6) {
                    Log.w(TAG, "Region #$idx too small ($cropW x $cropH), skipping")
                    continue
                }

                val cropBitmap = try {
                    Bitmap.createBitmap(safeBitmap, leftPx, topPx, cropW, cropH)
                } catch (t: Throwable) {
                    Log.e(TAG, "Failed to crop region #$idx", t)
                    null
                } ?: continue

                Log.i(TAG, "Region #$idx: crop=[$leftPx,$topPx,$rightPx,$bottomPx] size=${cropW}x${cropH}")
                val localBlocks = recognizeWithMultiPass(cropBitmap, sourceLang)
                cropBitmap.recycle()

                val regionWidthRel = region.rect.width()
                val regionHeightRel = region.rect.height()

                if (localBlocks.isNotEmpty()) {
                    Log.i(TAG, "Region #$idx found ${localBlocks.size} text blocks")
                    for (lb in localBlocks) {
                        val globalBox = RectF(
                            region.rect.left + lb.boundingBox.left * regionWidthRel,
                            region.rect.top + lb.boundingBox.top * regionHeightRel,
                            region.rect.left + lb.boundingBox.right * regionWidthRel,
                            region.rect.top + lb.boundingBox.bottom * regionHeightRel
                        )
                        allRegionBlocks.add(lb.copy(boundingBox = globalBox))
                    }
                }
            }

            if (safeBitmap !== bitmap) safeBitmap.recycle()
            val merged = mergeAdjacentBlocks(allRegionBlocks)
            Log.i(TAG, "OCR finished with ${merged.size} total blocks from ${regions.size} regions")
            return@withContext merged
        }

        // Full Screen OCR: Multi-pass pixel preprocessing pipeline
        val bmpHash = computeBitmapHash(safeBitmap)
        val blocks = recognizeWithMultiPass(safeBitmap, sourceLang)
        if (safeBitmap !== bitmap) safeBitmap.recycle()
        val merged = mergeAdjacentBlocks(blocks)
        ocrLruCache.put(bmpHash, merged)
        Log.i(TAG, "OCR finished fullscreen with ${merged.size} total blocks (cached)")
        merged
    }

    private suspend fun recognizeWithMultiPass(
        inputBitmap: Bitmap,
        sourceLang: String
    ): List<TranslatedTextBlock> {
        // Base: Point-sampled 4x nearest neighbor scaling for pixel fonts
        val pixelScaled = createPixelArtUpscaledBitmap(inputBitmap, scaleFactor = 4)

        // Pass 1: Crisp Nearest-Neighbor Upscaled (Captures clean standard pixel text)
        var blocks = recognizeOnBitmap(pixelScaled, sourceLang)
        if (blocks.isNotEmpty()) {
            Log.i(TAG, "OCR Pass 1 (4x Nearest-Neighbor) matched ${blocks.size} blocks")
            if (pixelScaled !== inputBitmap) pixelScaled.recycle()
            return blocks
        }

        // Pass 2: Contrast Stretching + Sauvola Local Adaptive Thresholding (For gradients / textured boxes)
        val sauvolaBitmap = createSauvolaBinarizedBitmap(pixelScaled)
        if (sauvolaBitmap != null) {
            blocks = recognizeOnBitmap(sauvolaBitmap, sourceLang)
            sauvolaBitmap.recycle()
            if (blocks.isNotEmpty()) {
                Log.i(TAG, "OCR Pass 2 (Sauvola Adaptive Thresholding) matched ${blocks.size} blocks")
                if (pixelScaled !== inputBitmap) pixelScaled.recycle()
                return blocks
            }
        }

        // Pass 3: Otsu Global Optimal Inverted Binarization (For white/light text on dark dialogue boxes)
        val otsuInverted = createOtsuBinarizedBitmap(pixelScaled, invert = true)
        if (otsuInverted != null) {
            blocks = recognizeOnBitmap(otsuInverted, sourceLang)
            otsuInverted.recycle()
            if (blocks.isNotEmpty()) {
                Log.i(TAG, "OCR Pass 3 (Otsu Inverted Binarization) matched ${blocks.size} blocks")
                if (pixelScaled !== inputBitmap) pixelScaled.recycle()
                return blocks
            }
        }

        // Pass 4: Chromatic Text Color Isolation (Extracts White, Yellow, Cyan, Lime dialogue text)
        val colorIsolated = createTextColorIsolatedBitmap(pixelScaled)
        if (colorIsolated != null) {
            blocks = recognizeOnBitmap(colorIsolated, sourceLang)
            colorIsolated.recycle()
            if (blocks.isNotEmpty()) {
                Log.i(TAG, "OCR Pass 4 (Chromatic Text Isolation) matched ${blocks.size} blocks")
                if (pixelScaled !== inputBitmap) pixelScaled.recycle()
                return blocks
            }
        }

        // Pass 5: Split Top / Bottom screen passes for Dual-Screen NDS layout
        if (pixelScaled.height > 120) {
            val halfH = pixelScaled.height / 2
            val topHalf = Bitmap.createBitmap(pixelScaled, 0, 0, pixelScaled.width, halfH)
            val topBlocks = recognizeOnBitmap(topHalf, sourceLang).map { b ->
                b.copy(
                    boundingBox = RectF(
                        b.boundingBox.left,
                        b.boundingBox.top * 0.5f,
                        b.boundingBox.right,
                        b.boundingBox.bottom * 0.5f
                    )
                )
            }
            topHalf.recycle()

            val bottomHalf = Bitmap.createBitmap(pixelScaled, 0, halfH, pixelScaled.width, halfH)
            val bottomBlocks = recognizeOnBitmap(bottomHalf, sourceLang).map { b ->
                b.copy(
                    boundingBox = RectF(
                        b.boundingBox.left,
                        0.5f + b.boundingBox.top * 0.5f,
                        b.boundingBox.right,
                        0.5f + b.boundingBox.bottom * 0.5f
                    )
                )
            }
            bottomHalf.recycle()

            blocks = topBlocks + bottomBlocks
            if (blocks.isNotEmpty()) {
                Log.i(TAG, "OCR Pass 5 (Split Screen Dual-Pass) matched ${blocks.size} blocks")
            }
        }

        if (pixelScaled !== inputBitmap) {
            pixelScaled.recycle()
        }

        return blocks
    }

    /**
     * Preserves sharp retro 1-pixel font contours via nearest-neighbor point sampling.
     */
    fun createPixelArtUpscaledBitmap(src: Bitmap, scaleFactor: Int = 4): Bitmap {
        val minDim = min(src.width, src.height)
        val scale = if (minDim >= 700) 1 else scaleFactor.coerceIn(2, 4)
        if (scale == 1) return src

        return try {
            val dstW = src.width * scale
            val dstH = src.height * scale
            val out = Bitmap.createBitmap(dstW, dstH, Bitmap.Config.ARGB_8888)
            val canvas = Canvas(out)
            val nnPaint = Paint().apply {
                isFilterBitmap = false
                isAntiAlias = false
                isDither = false
            }
            canvas.drawBitmap(src, null, Rect(0, 0, dstW, dstH), nnPaint)
            out
        } catch (t: Throwable) {
            src
        }
    }

    /**
     * Dynamic min-max percentile contrast stretching.
     */
    fun createContrastStretchedBitmap(src: Bitmap): Bitmap? {
        return try {
            val w = src.width
            val h = src.height
            val pixels = IntArray(w * h)
            src.getPixels(pixels, 0, w, 0, 0, w, h)

            val hist = IntArray(256)
            for (p in pixels) {
                val r = (p shr 16) and 0xFF
                val g = (p shr 8) and 0xFF
                val b = p and 0xFF
                val lum = (0.299f * r + 0.587f * g + 0.114f * b).toInt().coerceIn(0, 255)
                hist[lum]++
            }

            val totalPixels = w * h
            val p2 = (totalPixels * 0.03f).toInt()
            val p98 = (totalPixels * 0.97f).toInt()

            var count = 0
            var minLum = 0
            var maxLum = 255

            for (i in 0..255) {
                count += hist[i]
                if (count >= p2) { minLum = i; break }
            }
            count = 0
            for (i in 255 downTo 0) {
                count += hist[i]
                if (count >= totalPixels - p98) { maxLum = i; break }
            }

            val lumRange = max(1, maxLum - minLum).toFloat()
            for (i in pixels.indices) {
                val p = pixels[i]
                val r = (p shr 16) and 0xFF
                val g = (p shr 8) and 0xFF
                val b = p and 0xFF
                val lum = (0.299f * r + 0.587f * g + 0.114f * b)
                val stretched = ((lum - minLum) / lumRange * 255f).toInt().coerceIn(0, 255)
                pixels[i] = Color.rgb(stretched, stretched, stretched)
            }

            val out = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888)
            out.setPixels(pixels, 0, w, 0, 0, w, h)
            out
        } catch (_: Throwable) {
            null
        }
    }

    /**
     * Sauvola Local Adaptive Thresholding with fast O(1) Integral Image (Summed Area Table).
     * Formula: T(x,y) = mean * (1 + k * (std / 128.0 - 1.0))
     */
    fun createSauvolaBinarizedBitmap(src: Bitmap, windowRadius: Int = 12, k: Float = 0.18f): Bitmap? {
        return try {
            val w = src.width
            val h = src.height
            val pixels = IntArray(w * h)
            src.getPixels(pixels, 0, w, 0, 0, w, h)

            // Convert to grayscale
            val gray = IntArray(w * h)
            for (i in pixels.indices) {
                val p = pixels[i]
                val r = (p shr 16) and 0xFF
                val g = (p shr 8) and 0xFF
                val b = p and 0xFF
                gray[i] = (0.299f * r + 0.587f * g + 0.114f * b).toInt().coerceIn(0, 255)
            }

            // Build Integral Images for sum and squared sum: (w+1) x (h+1)
            val integralSum = LongArray((w + 1) * (h + 1))
            val integralSqSum = LongArray((w + 1) * (h + 1))

            val stride = w + 1
            for (y in 0 until h) {
                var rowSum = 0L
                var rowSqSum = 0L
                for (x in 0 until w) {
                    val gVal = gray[y * w + x].toLong()
                    rowSum += gVal
                    rowSqSum += (gVal * gVal)

                    val idx = (y + 1) * stride + (x + 1)
                    val prevIdx = y * stride + (x + 1)
                    integralSum[idx] = integralSum[prevIdx] + rowSum
                    integralSqSum[idx] = integralSqSum[prevIdx] + rowSqSum
                }
            }

            val outPixels = IntArray(w * h)
            val r = windowRadius

            for (y in 0 until h) {
                val y1 = max(0, y - r)
                val y2 = min(h - 1, y + r)
                val rowIdx = y * w

                for (x in 0 until w) {
                    val x1 = max(0, x - r)
                    val x2 = min(w - 1, x + r)
                    val count = (x2 - x1 + 1) * (y2 - y1 + 1)

                    // Compute local sum & squared sum using integral table in O(1)
                    val a = y1 * stride + x1
                    val b = y1 * stride + (x2 + 1)
                    val c = (y2 + 1) * stride + x1
                    val d = (y2 + 1) * stride + (x2 + 1)

                    val sum = integralSum[d] - integralSum[b] - integralSum[c] + integralSum[a]
                    val sqSum = integralSqSum[d] - integralSqSum[b] - integralSqSum[c] + integralSqSum[a]

                    val mean = sum.toDouble() / count
                    val variance = max(0.0, (sqSum.toDouble() / count) - (mean * mean))
                    val std = sqrt(variance)

                    val threshold = mean * (1.0 + k * ((std / 128.0) - 1.0))
                    val curVal = gray[rowIdx + x]

                    // Produce clean high-contrast black text on white background (standard for OCR)
                    val isForeground = curVal >= threshold
                    outPixels[rowIdx + x] = if (isForeground) 0xFF000000.toInt() else 0xFFFFFFFF.toInt()
                }
            }

            val out = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888)
            out.setPixels(outPixels, 0, w, 0, 0, w, h)
            out
        } catch (_: Throwable) {
            null
        }
    }

    /**
     * Otsu Global Optimal Binarization maximizing between-class variance.
     */
    fun createOtsuBinarizedBitmap(src: Bitmap, invert: Boolean = false): Bitmap? {
        return try {
            val w = src.width
            val h = src.height
            val pixels = IntArray(w * h)
            src.getPixels(pixels, 0, w, 0, 0, w, h)

            val hist = IntArray(256)
            for (p in pixels) {
                val r = (p shr 16) and 0xFF
                val g = (p shr 8) and 0xFF
                val b = p and 0xFF
                val lum = (0.299f * r + 0.587f * g + 0.114f * b).toInt().coerceIn(0, 255)
                hist[lum]++
            }

            val total = w * h
            var sum = 0.0
            for (i in 0..255) sum += i * hist[i]

            var sumB = 0.0
            var wB = 0
            var maxVar = 0.0
            var optimalThreshold = 128

            for (t in 0..255) {
                wB += hist[t]
                if (wB == 0) continue
                val wF = total - wB
                if (wF == 0) break

                sumB += t * hist[t]
                val mB = sumB / wB
                val mF = (sum - sumB) / wF

                val varBetween = wB.toDouble() * wF.toDouble() * (mB - mF) * (mB - mF)
                if (varBetween > maxVar) {
                    maxVar = varBetween
                    optimalThreshold = t
                }
            }

            val outPixels = IntArray(w * h)
            for (i in pixels.indices) {
                val p = pixels[i]
                val r = (p shr 16) and 0xFF
                val g = (p shr 8) and 0xFF
                val b = p and 0xFF
                val lum = (0.299f * r + 0.587f * g + 0.114f * b).toInt()

                val isText = if (invert) lum >= optimalThreshold else lum < optimalThreshold
                outPixels[i] = if (isText) 0xFF000000.toInt() else 0xFFFFFFFF.toInt()
            }

            val out = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888)
            out.setPixels(outPixels, 0, w, 0, 0, w, h)
            out
        } catch (_: Throwable) {
            null
        }
    }

    /**
     * Isolates dominant retro text color palettes (White, Yellow, Cyan, Lime) from noisy game art.
     */
    fun createTextColorIsolatedBitmap(src: Bitmap): Bitmap? {
        return try {
            val w = src.width
            val h = src.height
            val pixels = IntArray(w * h)
            src.getPixels(pixels, 0, w, 0, 0, w, h)

            val outPixels = IntArray(w * h)

            for (i in pixels.indices) {
                val p = pixels[i]
                val r = (p shr 16) and 0xFF
                val g = (p shr 8) and 0xFF
                val b = p and 0xFF

                // Text Color Palette Rules:
                // 1. Crisp White / Off-White
                val isWhite = (r > 180 && g > 180 && b > 180)
                // 2. Yellow / Gold dialogue text
                val isYellow = (r > 175 && g > 155 && b < 125 && (r - b) > 40)
                // 3. Cyan / Ice-blue dialogue text
                val isCyan = (r < 125 && g > 165 && b > 195)
                // 4. Lime / Green text
                val isLime = (r < 130 && g > 175 && b < 130)

                val isTextColor = isWhite || isYellow || isCyan || isLime
                outPixels[i] = if (isTextColor) 0xFF000000.toInt() else 0xFFFFFFFF.toInt()
            }

            val out = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888)
            out.setPixels(outPixels, 0, w, 0, 0, w, h)
            out
        } catch (_: Throwable) {
            null
        }
    }

    private fun ensureSoftwareBitmap(src: Bitmap): Bitmap {
        if (src.isRecycled) return src
        return try {
            val opaque = Bitmap.createBitmap(src.width, src.height, Bitmap.Config.ARGB_8888)
            val canvas = Canvas(opaque)
            val cm = android.graphics.ColorMatrix(floatArrayOf(
                1f, 0f, 0f, 0f, 0f,
                0f, 1f, 0f, 0f, 0f,
                0f, 0f, 1f, 0f, 0f,
                0f, 0f, 0f, 0f, 255f
            ))
            val paint = Paint().apply {
                colorFilter = android.graphics.ColorMatrixColorFilter(cm)
            }
            canvas.drawBitmap(src, 0f, 0f, paint)
            opaque
        } catch (_: Throwable) {
            if (src.config != Bitmap.Config.ARGB_8888) {
                src.copy(Bitmap.Config.ARGB_8888, false) ?: src
            } else {
                src
            }
        }
    }

    private suspend fun recognizeOnBitmap(
        bitmap: Bitmap,
        sourceLang: String
    ): List<TranslatedTextBlock> {
        val recognizersToTry = when (sourceLang.lowercase()) {
            "ja", "japanese" -> listOf(japaneseRecognizer, latinRecognizer, chineseRecognizer)
            "zh", "chinese" -> listOf(chineseRecognizer, latinRecognizer, japaneseRecognizer)
            else -> listOf(latinRecognizer, japaneseRecognizer, chineseRecognizer)
        }

        val inputImage = InputImage.fromBitmap(bitmap, 0)
        var visionText: Text? = null

        for (rec in recognizersToTry) {
            try {
                val result = rec.processAsync(inputImage)
                if (result.textBlocks.isNotEmpty()) {
                    visionText = result
                    Log.i(TAG, "ML Kit (${rec.javaClass.simpleName}) found ${result.textBlocks.size} blocks: \"${result.text.take(80).replace('\n', ' ')}\"")
                    break
                }
            } catch (t: Throwable) {
                lastOcrError = t.message ?: t.javaClass.simpleName
                Log.w(TAG, "ML Kit Recognizer failed: ${t.message}", t)
            }
        }

        visionText ?: return emptyList()

        val resultBlocks = mutableListOf<TranslatedTextBlock>()
        val imgWidth = bitmap.width.toFloat()
        val imgHeight = bitmap.height.toFloat()

        for (block in visionText.textBlocks) {
            val blockBox = block.boundingBox ?: continue
            val text = block.text.trim()
            if (text.isBlank()) continue

            val correctedText = SmartWordCorrector.correctText(text, sourceLang)
            if (correctedText.isBlank()) continue

            val relBox = RectF(
                (blockBox.left / imgWidth).coerceIn(0f, 1f),
                (blockBox.top / imgHeight).coerceIn(0f, 1f),
                (blockBox.right / imgWidth).coerceIn(0f, 1f),
                (blockBox.bottom / imgHeight).coerceIn(0f, 1f)
            )

            val sampledBgColor = sampleBackgroundColor(bitmap, blockBox)
            val textColor = determineBestTextColor(sampledBgColor)

            resultBlocks.add(
                TranslatedTextBlock(
                    originalText = correctedText,
                    translatedText = "",
                    boundingBox = relBox,
                    backgroundColor = sampledBgColor,
                    textColor = textColor
                )
            )
        }

        return resultBlocks
    }

    private suspend fun TextRecognizer.processAsync(image: InputImage): Text =
        suspendCancellableCoroutine { continuation ->
            process(image)
                .addOnSuccessListener { text ->
                    if (continuation.isActive) continuation.resume(text, onCancellation = null)
                }
                .addOnFailureListener { exception ->
                    if (continuation.isActive) continuation.resumeWithException(exception)
                }
        }

    private fun sampleBackgroundColor(bitmap: Bitmap, box: Rect): Int {
        val w = bitmap.width
        val h = bitmap.height

        val l = box.left.coerceIn(0, w - 1)
        val t = box.top.coerceIn(0, h - 1)
        val r = box.right.coerceIn(0, w - 1)
        val b = box.bottom.coerceIn(0, h - 1)

        val samples = mutableListOf<Int>()
        val step = max(1, (r - l) / 10)
        for (x in l..r step step) {
            samples.add(bitmap.getPixel(x, t))
            samples.add(bitmap.getPixel(x, b))
        }
        val stepY = max(1, (b - t) / 10)
        for (y in t..b step stepY) {
            samples.add(bitmap.getPixel(l, y))
            samples.add(bitmap.getPixel(r, y))
        }

        if (samples.isEmpty()) return Color.parseColor("#E60F172A")

        var totalR = 0L
        var totalG = 0L
        var totalB = 0L
        for (c in samples) {
            totalR += Color.red(c)
            totalG += Color.green(c)
            totalB += Color.blue(c)
        }
        val count = samples.size
        return Color.rgb((totalR / count).toInt(), (totalG / count).toInt(), (totalB / count).toInt())
    }

    private fun determineBestTextColor(bgColor: Int): Int {
        val r = Color.red(bgColor) / 255.0
        val g = Color.green(bgColor) / 255.0
        val b = Color.blue(bgColor) / 255.0
        val luminance = 0.299 * r + 0.587 * g + 0.114 * b
        return if (luminance > 0.55) Color.parseColor("#0F172A") else Color.parseColor("#FFFFFF")
    }

    private fun mergeAdjacentBlocks(blocks: List<TranslatedTextBlock>): List<TranslatedTextBlock> {
        if (blocks.size <= 1) return blocks

        val merged = mutableListOf<TranslatedTextBlock>()
        var current: TranslatedTextBlock? = null

        for (block in blocks.sortedBy { it.boundingBox.top }) {
            if (current == null) {
                current = block
                continue
            }

            val cBox = current.boundingBox
            val bBox = block.boundingBox

            val verticalGap = bBox.top - cBox.bottom
            val isHorizontalOverlap = min(cBox.right, bBox.right) - max(cBox.left, bBox.left) > 0

            if (verticalGap in -0.05f..0.08f && isHorizontalOverlap) {
                val combinedText = "${current.originalText} ${block.originalText}"
                val combinedBox = RectF(
                    min(cBox.left, bBox.left),
                    min(cBox.top, bBox.top),
                    max(cBox.right, bBox.right),
                    max(cBox.bottom, bBox.bottom)
                )
                current = current.copy(
                    originalText = combinedText,
                    boundingBox = combinedBox
                )
            } else {
                merged.add(current)
                current = block
            }
        }
        if (current != null) {
            merged.add(current)
        }
        return merged
    }
}

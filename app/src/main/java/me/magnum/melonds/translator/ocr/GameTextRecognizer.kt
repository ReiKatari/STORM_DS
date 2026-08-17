package me.magnum.melonds.translator.ocr

import android.graphics.Bitmap
import android.graphics.Color
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
import kotlin.coroutines.resumeWithException
import kotlin.math.max
import kotlin.math.min

class GameTextRecognizer {

    companion object {
        private const val TAG = "GameTranslator"
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

    suspend fun recognizeTextBlocks(
        bitmap: Bitmap,
        sourceLang: String,
        regions: List<me.magnum.melonds.translator.model.TranslationRegion> = emptyList()
    ): List<TranslatedTextBlock> = withContext(Dispatchers.Default) {
        lastOcrError = null
        val safeBitmap = ensureSoftwareBitmap(bitmap)
        Log.i(TAG, "OCR start: bitmap=${safeBitmap.width}x${safeBitmap.height} regions=${regions.size} lang=$sourceLang")

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

                Log.i(TAG, "Region #$idx rect=[$leftPx,$topPx,$rightPx,$bottomPx] size=${cropW}x${cropH}")
                // Process crop with multi-pass upscaled OCR
                val localBlocks = recognizeWithMultiPass(cropBitmap, sourceLang)
                cropBitmap.recycle()

                val regionWidthRel = region.rect.width()
                val regionHeightRel = region.rect.height()

                if (localBlocks.isNotEmpty()) {
                    Log.i(TAG, "Region #$idx found ${localBlocks.size} local text blocks")
                    for (lb in localBlocks) {
                        val globalBox = RectF(
                            region.rect.left + lb.boundingBox.left * regionWidthRel,
                            region.rect.top + lb.boundingBox.top * regionHeightRel,
                            region.rect.left + lb.boundingBox.right * regionWidthRel,
                            region.rect.top + lb.boundingBox.bottom * regionHeightRel
                        )
                        allRegionBlocks.add(lb.copy(boundingBox = globalBox))
                    }
                } else {
                    Log.w(TAG, "Region #$idx returned 0 text blocks")
                }
            }

            if (safeBitmap !== bitmap) safeBitmap.recycle()
            val merged = mergeAdjacentBlocks(allRegionBlocks)
            Log.i(TAG, "OCR finished with ${merged.size} total blocks from ${regions.size} regions")
            return@withContext merged
        }

        // Full Screen OCR: Multi-pass upscaled pipeline
        val blocks = recognizeWithMultiPass(safeBitmap, sourceLang)
        if (safeBitmap !== bitmap) safeBitmap.recycle()
        val merged = mergeAdjacentBlocks(blocks)
        Log.i(TAG, "OCR finished fullscreen with ${merged.size} total blocks")
        merged
    }

    private suspend fun recognizeWithMultiPass(
        inputBitmap: Bitmap,
        sourceLang: String
    ): List<TranslatedTextBlock> {
        // Pass 1: Scaled bitmap (or original if already high resolution)
        val scaledBitmap = createHighResBitmap(inputBitmap)
        var blocks = recognizeOnBitmap(scaledBitmap, sourceLang)
        if (blocks.isNotEmpty()) {
            Log.i(TAG, "OCR Pass 1 (Standard/Upscaled) matched ${blocks.size} blocks")
        }

        // Pass 2: Inverted luminance contrast (critical for white text on black/dark background)
        if (blocks.isEmpty()) {
            val inverted = createInvertedEnhancedBitmap(scaledBitmap)
            if (inverted != null) {
                blocks = recognizeOnBitmap(inverted, sourceLang)
                if (blocks.isNotEmpty()) {
                    Log.i(TAG, "OCR Pass 2 (Inverted Luminance) matched ${blocks.size} blocks")
                }
                inverted.recycle()
            }
        }

        // Pass 3: High contrast enhanced grayscale
        if (blocks.isEmpty()) {
            val enhanced = createEnhancedBitmap(scaledBitmap)
            if (enhanced != null) {
                blocks = recognizeOnBitmap(enhanced, sourceLang)
                if (blocks.isNotEmpty()) {
                    Log.i(TAG, "OCR Pass 3 (High Contrast Grayscale) matched ${blocks.size} blocks")
                }
                enhanced.recycle()
            }
        }

        // Pass 4: Extreme contrast binarization for pixel art fonts
        if (blocks.isEmpty()) {
            val binarized = createBinarizedBitmap(scaledBitmap)
            if (binarized != null) {
                blocks = recognizeOnBitmap(binarized, sourceLang)
                if (blocks.isNotEmpty()) {
                    Log.i(TAG, "OCR Pass 4 (Binarized) matched ${blocks.size} blocks")
                }
                binarized.recycle()
            }
        }

        // Pass 5: Split top/bottom half passes (detecting dialogue boxes on DS screens)
        if (blocks.isEmpty() && scaledBitmap.height > 100) {
            val halfH = scaledBitmap.height / 2
            val topHalf = Bitmap.createBitmap(scaledBitmap, 0, 0, scaledBitmap.width, halfH)
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

            val bottomHalf = Bitmap.createBitmap(scaledBitmap, 0, halfH, scaledBitmap.width, halfH)
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
                Log.i(TAG, "OCR Pass 5 (Split screen) matched ${blocks.size} blocks")
            }
        }

        if (scaledBitmap !== inputBitmap) {
            scaledBitmap.recycle()
        }

        return blocks
    }

    /**
     * Ensures the bitmap is in ARGB_8888 software config AND has 100% opaque pixels (Alpha=255).
     * Uses ColorMatrixColorFilter to guarantee that every single pixel has A=255 (0xFFRRGGBB),
     * preventing transparent pixels from causing ML Kit to miss text.
     */
    private fun ensureSoftwareBitmap(src: Bitmap): Bitmap {
        if (src.isRecycled) return src
        return try {
            val opaque = Bitmap.createBitmap(src.width, src.height, Bitmap.Config.ARGB_8888)
            val canvas = android.graphics.Canvas(opaque)
            val cm = android.graphics.ColorMatrix(floatArrayOf(
                1f, 0f, 0f, 0f, 0f,
                0f, 1f, 0f, 0f, 0f,
                0f, 0f, 1f, 0f, 0f,
                0f, 0f, 0f, 0f, 255f
            ))
            val paint = android.graphics.Paint().apply {
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

    private fun createHighResBitmap(src: Bitmap): Bitmap {
        val minDim = min(src.width, src.height)
        // If image is already phone-screen resolution (e.g. 1080p+), don't upscale further
        if (minDim >= 700) return src

        // For low-resolution retro DS native buffers (256x384), upscale 4x to ~1024x1536
        val targetScale = (1024f / minDim.toFloat()).coerceIn(2.0f, 4.5f)

        return try {
            val step1W = src.width * 3
            val step1H = src.height * 3
            val step1Bitmap = Bitmap.createBitmap(step1W, step1H, Bitmap.Config.ARGB_8888)
            val step1Canvas = android.graphics.Canvas(step1Bitmap)
            val nnPaint = android.graphics.Paint().apply {
                isFilterBitmap = false
                isAntiAlias = false
            }
            step1Canvas.drawBitmap(src, null, Rect(0, 0, step1W, step1H), nnPaint)

            val dstW = (src.width * targetScale).toInt().coerceAtLeast(1)
            val dstH = (src.height * targetScale).toInt().coerceAtLeast(1)
            val outBitmap = Bitmap.createBitmap(dstW, dstH, Bitmap.Config.ARGB_8888)
            val canvas = android.graphics.Canvas(outBitmap)
            val smoothPaint = android.graphics.Paint().apply {
                isFilterBitmap = true
                isAntiAlias = true
            }
            canvas.drawBitmap(step1Bitmap, null, Rect(0, 0, dstW, dstH), smoothPaint)
            step1Bitmap.recycle()
            outBitmap
        } catch (t: Throwable) {
            src
        }
    }

    private suspend fun recognizeOnBitmap(
        bitmap: Bitmap,
        sourceLang: String
    ): List<TranslatedTextBlock> {
        val recognizersToTry = when (sourceLang.lowercase()) {
            "ja", "japanese" -> listOf(japaneseRecognizer, latinRecognizer, chineseRecognizer)
            "zh", "chinese" -> listOf(chineseRecognizer, latinRecognizer, japaneseRecognizer)
            "en", "english", "es", "fr", "de", "it", "pt", "ru" -> listOf(latinRecognizer, japaneseRecognizer, chineseRecognizer)
            else -> listOf(latinRecognizer, japaneseRecognizer, chineseRecognizer) // auto
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
                Log.w(TAG, "ML Kit Recognizer (${rec.javaClass.simpleName}) failed: ${t.message}", t)
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
                    originalText = text,
                    translatedText = "",
                    boundingBox = relBox,
                    backgroundColor = sampledBgColor,
                    textColor = textColor
                )
            )
        }

        return resultBlocks
    }

    private fun createEnhancedBitmap(src: Bitmap): Bitmap? {
        return try {
            val outBitmap = Bitmap.createBitmap(src.width, src.height, Bitmap.Config.ARGB_8888)
            val canvas = android.graphics.Canvas(outBitmap)
            val paint = android.graphics.Paint(android.graphics.Paint.FILTER_BITMAP_FLAG)

            // High contrast grayscale
            val cm = android.graphics.ColorMatrix()
            cm.setSaturation(0f)
            val contrast = 1.6f
            val brightness = -15f
            val scaleMatrix = android.graphics.ColorMatrix(floatArrayOf(
                contrast, 0f, 0f, 0f, brightness,
                0f, contrast, 0f, 0f, brightness,
                0f, 0f, contrast, 0f, brightness,
                0f, 0f, 0f, 1f, 0f
            ))
            cm.postConcat(scaleMatrix)
            paint.colorFilter = android.graphics.ColorMatrixColorFilter(cm)

            val srcRect = Rect(0, 0, src.width, src.height)
            canvas.drawBitmap(src, srcRect, srcRect, paint)
            outBitmap
        } catch (t: Throwable) {
            null
        }
    }

    private fun createInvertedEnhancedBitmap(src: Bitmap): Bitmap? {
        return try {
            val outBitmap = Bitmap.createBitmap(src.width, src.height, Bitmap.Config.ARGB_8888)
            val canvas = android.graphics.Canvas(outBitmap)
            val paint = android.graphics.Paint(android.graphics.Paint.FILTER_BITMAP_FLAG)

            // Inverted luminance grayscale for light text on dark or vice versa
            val cm = android.graphics.ColorMatrix(floatArrayOf(
                -1.6f, 0f, 0f, 0f, 255f,
                0f, -1.6f, 0f, 0f, 255f,
                0f, 0f, -1.6f, 0f, 255f,
                0f, 0f, 0f, 1f, 0f
            ))
            paint.colorFilter = android.graphics.ColorMatrixColorFilter(cm)

            val srcRect = Rect(0, 0, src.width, src.height)
            canvas.drawBitmap(src, srcRect, srcRect, paint)
            outBitmap
        } catch (t: Throwable) {
            null
        }
    }

    private fun createBinarizedBitmap(src: Bitmap): Bitmap? {
        return try {
            val outBitmap = Bitmap.createBitmap(src.width, src.height, Bitmap.Config.ARGB_8888)
            val canvas = android.graphics.Canvas(outBitmap)
            val paint = android.graphics.Paint(android.graphics.Paint.FILTER_BITMAP_FLAG)

            val cm = android.graphics.ColorMatrix()
            cm.setSaturation(0f)
            val contrast = 2.2f
            val brightness = -30f
            val scaleMatrix = android.graphics.ColorMatrix(floatArrayOf(
                contrast, 0f, 0f, 0f, brightness,
                0f, contrast, 0f, 0f, brightness,
                0f, 0f, contrast, 0f, brightness,
                0f, 0f, 0f, 1f, 0f
            ))
            cm.postConcat(scaleMatrix)
            paint.colorFilter = android.graphics.ColorMatrixColorFilter(cm)

            val srcRect = Rect(0, 0, src.width, src.height)
            canvas.drawBitmap(src, srcRect, srcRect, paint)
            outBitmap
        } catch (t: Throwable) {
            null
        }
    }

    private suspend fun TextRecognizer.processAsync(image: InputImage): Text =
        suspendCancellableCoroutine { continuation ->
            process(image)
                .addOnSuccessListener { text ->
                    if (continuation.isActive) {
                        continuation.resume(text, onCancellation = null)
                    }
                }
                .addOnFailureListener { exception ->
                    if (continuation.isActive) {
                        continuation.resumeWithException(exception)
                    }
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

        // Sample along outer perimeter of bounding box
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

        if (samples.isEmpty()) return Color.parseColor("#E61E293B")

        var totalR = 0L
        var totalG = 0L
        var totalB = 0L
        for (c in samples) {
            totalR += Color.red(c)
            totalG += Color.green(c)
            totalB += Color.blue(c)
        }
        val count = samples.size
        val avgR = (totalR / count).toInt()
        val avgG = (totalG / count).toInt()
        val avgB = (totalB / count).toInt()

        return Color.rgb(avgR, avgG, avgB)
    }

    private fun determineBestTextColor(bgColor: Int): Int {
        val r = Color.red(bgColor) / 255.0
        val g = Color.green(bgColor) / 255.0
        val b = Color.blue(bgColor) / 255.0
        val luminance = 0.299 * r + 0.587 * g + 0.114 * b

        return if (luminance > 0.55) {
            Color.parseColor("#0F172A") // Dark text on light parchment/background
        } else {
            Color.parseColor("#FFFFFF") // Crisp white text on dark/blue dialogue boxes
        }
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

            // If blocks are vertically adjacent (same dialogue box)
            val verticalGap = bBox.top - cBox.bottom
            val isHorizontalOverlap = min(cBox.right, bBox.right) - max(cBox.left, bBox.left) > 0

            if (verticalGap in -0.05f..0.08f && isHorizontalOverlap) {
                // Merge together
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

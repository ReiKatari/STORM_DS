package me.magnum.melonds.translator.ocr

import android.graphics.Bitmap
import android.graphics.Color
import android.graphics.Rect
import android.graphics.RectF
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
        if (regions.isNotEmpty()) {
            val allRegionBlocks = mutableListOf<TranslatedTextBlock>()
            val imgW = bitmap.width
            val imgH = bitmap.height

            for (region in regions) {
                val leftPx = (region.rect.left * imgW).toInt().coerceIn(0, imgW - 1)
                val topPx = (region.rect.top * imgH).toInt().coerceIn(0, imgH - 1)
                val rightPx = (region.rect.right * imgW).toInt().coerceIn(leftPx + 1, imgW)
                val bottomPx = (region.rect.bottom * imgH).toInt().coerceIn(topPx + 1, imgH)

                val cropW = rightPx - leftPx
                val cropH = bottomPx - topPx
                if (cropW < 8 || cropH < 8) continue

                val cropBitmap = try {
                    Bitmap.createBitmap(bitmap, leftPx, topPx, cropW, cropH)
                } catch (t: Throwable) {
                    null
                } ?: continue

                // Recognize text within cropped region
                var localBlocks = recognizeOnBitmap(cropBitmap, sourceLang)
                if (localBlocks.isEmpty()) {
                    // Try 2x upscale + high-contrast filter for small pixel fonts
                    val enhancedCrop = createEnhancedBitmap(cropBitmap)
                    if (enhancedCrop != null) {
                        localBlocks = recognizeOnBitmap(enhancedCrop, sourceLang)
                        enhancedCrop.recycle()
                    }
                }

                val regionWidthRel = region.rect.width()
                val regionHeightRel = region.rect.height()

                if (localBlocks.isNotEmpty()) {
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

                cropBitmap.recycle()
            }

            return@withContext mergeAdjacentBlocks(allRegionBlocks)
        }

        // Full Screen OCR
        var blocks = recognizeOnBitmap(bitmap, sourceLang)
        if (blocks.isEmpty()) {
            val enhanced = createEnhancedBitmap(bitmap)
            if (enhanced != null) {
                blocks = recognizeOnBitmap(enhanced, sourceLang)
                enhanced.recycle()
            }
        }

        mergeAdjacentBlocks(blocks)
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
                    break
                }
            } catch (t: Throwable) {
                // Continue to next recognizer
            }
        }

        visionText ?: return emptyList()

        val resultBlocks = mutableListOf<TranslatedTextBlock>()
        val imgWidth = bitmap.width.toFloat()
        val imgHeight = bitmap.height.toFloat()

        for (block in visionText.textBlocks) {
            val blockBox = block.boundingBox ?: continue
            val text = block.text.trim()
            if (text.isBlank() || text.length < 2) continue

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
            val scale = if (src.width < 800) 2f else 1f
            val dstW = (src.width * scale).toInt().coerceAtLeast(1)
            val dstH = (src.height * scale).toInt().coerceAtLeast(1)

            val outBitmap = Bitmap.createBitmap(dstW, dstH, Bitmap.Config.ARGB_8888)
            val canvas = android.graphics.Canvas(outBitmap)
            val paint = android.graphics.Paint(android.graphics.Paint.FILTER_BITMAP_FLAG)

            // High contrast color matrix
            val cm = android.graphics.ColorMatrix()
            cm.setSaturation(0f) // Grayscale
            val contrast = 1.35f
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
            val dstRect = Rect(0, 0, dstW, dstH)
            canvas.drawBitmap(src, srcRect, dstRect, paint)

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

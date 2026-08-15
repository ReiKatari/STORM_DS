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
        sourceLang: String
    ): List<TranslatedTextBlock> = withContext(Dispatchers.Default) {
        val recognizer = when (sourceLang.lowercase()) {
            "ja", "japanese" -> japaneseRecognizer
            "zh", "chinese" -> chineseRecognizer
            else -> latinRecognizer
        }

        val inputImage = InputImage.fromBitmap(bitmap, 0)
        val visionText: Text = try {
            recognizer.processAsync(inputImage)
        } catch (e: Exception) {
            return@withContext emptyList()
        }

        val resultBlocks = mutableListOf<TranslatedTextBlock>()
        val imgWidth = bitmap.width.toFloat()
        val imgHeight = bitmap.height.toFloat()

        for (block in visionText.textBlocks) {
            val blockBox = block.boundingBox ?: continue
            val text = block.text.trim()
            if (text.isBlank() || text.length < 2) continue

            // Normalize bounding box coordinates relative to 0.0 .. 1.0
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

        // Smart merge overlapping or adjacent dialogue lines
        mergeAdjacentBlocks(resultBlocks)
    }

    private suspend fun TextRecognizer.processAsync(image: InputImage): Text =
        suspendCancellableCoroutine { continuation ->
            process(image)
                .addOnSuccessListener { text ->
                    continuation.resume(text, onCancellation = null)
                }
                .addOnFailureListener { exception ->
                    continuation.resumeWithException(exception)
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

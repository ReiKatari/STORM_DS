package me.magnum.melonds.common.runtime

import android.graphics.Bitmap
import java.nio.ByteBuffer
import java.nio.ByteOrder

class ScreenshotFrameBufferProvider {

    companion object {
        private const val SCREEN_WIDTH = 256
        private const val SCREEN_HEIGHT = 384
    }

    private var screenshotBuffer: ByteBuffer? = null

    fun frameBuffer(): ByteBuffer {
        return ensureBufferIsReady()
    }

    fun getScreenshot(): Bitmap {
        val frameBuffer = ensureBufferIsReady()

        val pixels = IntArray(SCREEN_WIDTH * SCREEN_HEIGHT)
        for (i in 0 until SCREEN_WIDTH * SCREEN_HEIGHT) {
            val raw = frameBuffer.getInt(i * 4)
            // Framebuffer format on Little Endian: byte0=B, byte1=G, byte2=R
            val b = (raw and 0xFF)
            val g = (raw shr 8) and 0xFF
            val r = (raw shr 16) and 0xFF
            // Android Bitmap ARGB_8888: 0xAA_RR_GG_BB
            pixels[i] = (0xFF shl 24) or (r shl 16) or (g shl 8) or b
        }
        return Bitmap.createBitmap(pixels, SCREEN_WIDTH, SCREEN_HEIGHT, Bitmap.Config.ARGB_8888)
    }

    fun clearBuffer() {
        screenshotBuffer?.let { buffer ->
            buffer.position(0)
            repeat(buffer.capacity() / 4) {
                buffer.putInt(0xFF000000.toInt())
            }
        }
    }

    private fun ensureBufferIsReady(): ByteBuffer {
        if (screenshotBuffer != null) {
            return screenshotBuffer!!
        }

        screenshotBuffer = ByteBuffer.allocateDirect(SCREEN_WIDTH * SCREEN_HEIGHT * 4).order(ByteOrder.nativeOrder())
        return screenshotBuffer!!
    }
}
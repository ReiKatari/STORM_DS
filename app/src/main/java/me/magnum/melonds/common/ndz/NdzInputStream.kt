package me.magnum.melonds.common.ndz

import java.io.IOException
import java.io.InputStream

class NdzInputStream(private val handle: Long, private val size: Long) : InputStream() {
    private var position = 0L
    private var closed = false

    override fun read(): Int {
        val one = ByteArray(1)
        val n = read(one, 0, 1)
        return if (n <= 0) -1 else one[0].toInt() and 0xFF
    }

    override fun read(b: ByteArray, off: Int, len: Int): Int {
        if (closed) throw IOException("NdzInputStream closed")
        if (len == 0) return 0
        if (position >= size) return -1
        val want = minOf(len.toLong(), size - position, MAX_CHUNK.toLong()).toInt()
        val chunk = NdzNative.ndzRead(handle, position, want)
        if (chunk.isEmpty()) return -1
        System.arraycopy(chunk, 0, b, off, chunk.size)
        position += chunk.size
        return chunk.size
    }

    override fun skip(n: Long): Long {
        if (n <= 0) return 0
        val moved = minOf(n, size - position)
        position += moved
        return moved
    }

    override fun available(): Int = (size - position).coerceIn(0, Int.MAX_VALUE.toLong()).toInt()

    override fun close() {
        if (!closed) {
            closed = true
            NdzNative.ndzClose(handle)
        }
    }

    private companion object {
        const val MAX_CHUNK = 256 * 1024
    }
}

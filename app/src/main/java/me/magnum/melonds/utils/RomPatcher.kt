package me.magnum.melonds.utils

import java.io.ByteArrayOutputStream
import java.io.InputStream

object RomPatcher {

    fun applyIps(romBytes: ByteArray, patchStream: InputStream): ByteArray {
        val patchBytes = patchStream.readBytes()
        if (patchBytes.size < 8) return romBytes
        if (String(patchBytes, 0, 5, Charsets.US_ASCII) != "PATCH") return romBytes

        val buffer = ByteArrayOutputStream(romBytes.size)
        buffer.write(romBytes)
        var patched = buffer.toByteArray()

        var offset = 5
        while (offset < patchBytes.size) {
            if (offset + 3 <= patchBytes.size && String(patchBytes, offset, 3, Charsets.US_ASCII) == "EOF") {
                offset += 3
                if (offset + 3 <= patchBytes.size) {
                    val truncateSize = ((patchBytes[offset].toInt() and 0xFF) shl 16) or
                        ((patchBytes[offset + 1].toInt() and 0xFF) shl 8) or
                        (patchBytes[offset + 2].toInt() and 0xFF)
                    if (truncateSize in 1 until patched.size) {
                        patched = patched.copyOf(truncateSize)
                    }
                }
                break
            }

            if (offset + 5 > patchBytes.size) break

            val targetOffset = ((patchBytes[offset].toInt() and 0xFF) shl 16) or
                ((patchBytes[offset + 1].toInt() and 0xFF) shl 8) or
                (patchBytes[offset + 2].toInt() and 0xFF)
            offset += 3

            val size = ((patchBytes[offset].toInt() and 0xFF) shl 8) or
                (patchBytes[offset + 1].toInt() and 0xFF)
            offset += 2

            if (size == 0) {
                // RLE record
                if (offset + 3 > patchBytes.size) break
                val rleSize = ((patchBytes[offset].toInt() and 0xFF) shl 8) or
                    (patchBytes[offset + 1].toInt() and 0xFF)
                offset += 2
                val rleByte = patchBytes[offset]
                offset += 1

                if (targetOffset + rleSize > patched.size) {
                    patched = patched.copyOf(targetOffset + rleSize)
                }
                for (i in 0 until rleSize) {
                    patched[targetOffset + i] = rleByte
                }
            } else {
                if (offset + size > patchBytes.size) break
                if (targetOffset + size > patched.size) {
                    patched = patched.copyOf(targetOffset + size)
                }
                System.arraycopy(patchBytes, offset, patched, targetOffset, size)
                offset += size
            }
        }
        return patched
    }

    fun applyBps(romBytes: ByteArray, patchStream: InputStream): ByteArray {
        val patchBytes = patchStream.readBytes()
        if (patchBytes.size < 16) return romBytes
        if (String(patchBytes, 0, 4, Charsets.US_ASCII) != "BPS1") return romBytes

        var offset = 4

        fun readVarInt(): Long {
            var result = 0L
            var shift = 0
            while (offset < patchBytes.size) {
                val b = patchBytes[offset++].toLong() and 0xFF
                result += (b and 0x7F) shl shift
                if ((b and 0x80) != 0L) return result
                shift += 7
                result += 1L shl shift
            }
            return result
        }

        val srcSize = readVarInt().toInt()
        val targetSize = readVarInt().toInt()
        val metadataSize = readVarInt().toInt()
        offset += metadataSize

        val target = ByteArray(targetSize)
        var outputOffset = 0
        var sourceRelativeOffset = 0
        var targetRelativeOffset = 0

        while (offset < patchBytes.size - 12) {
            val data = readVarInt()
            val action = (data and 3).toInt()
            val length = ((data ushr 2) + 1).toInt()

            when (action) {
                0 -> { // SourceRead
                    System.arraycopy(romBytes, outputOffset, target, outputOffset, length.coerceAtMost(targetSize - outputOffset))
                    outputOffset += length
                }
                1 -> { // TargetRead
                    System.arraycopy(patchBytes, offset, target, outputOffset, length.coerceAtMost(targetSize - outputOffset))
                    offset += length
                    outputOffset += length
                }
                2 -> { // SourceCopy
                    val shift = readVarInt()
                    val delta = (shift ushr 1).toInt()
                    sourceRelativeOffset += if ((shift and 1) != 0L) -delta else delta
                    for (i in 0 until length) {
                        if (outputOffset + i < targetSize && sourceRelativeOffset + i in romBytes.indices) {
                            target[outputOffset + i] = romBytes[sourceRelativeOffset + i]
                        }
                    }
                    sourceRelativeOffset += length
                    outputOffset += length
                }
                3 -> { // TargetCopy
                    val shift = readVarInt()
                    val delta = (shift ushr 1).toInt()
                    targetRelativeOffset += if ((shift and 1) != 0L) -delta else delta
                    for (i in 0 until length) {
                        if (outputOffset + i < targetSize && targetRelativeOffset + i in target.indices) {
                            target[outputOffset + i] = target[targetRelativeOffset + i]
                        }
                    }
                    targetRelativeOffset += length
                    outputOffset += length
                }
            }
        }
        return target
    }
}

package me.magnum.melonds.utils

import android.util.Log
import java.io.File
import java.io.RandomAccessFile
import java.nio.charset.StandardCharsets

object FatImageExtractor {
    private const val TAG = "FatImageExtractor"

    fun extractFatImage(imageFile: File, destDir: File): Boolean {
        if (!imageFile.isFile || imageFile.length() < 512) return false
        return runCatching {
            RandomAccessFile(imageFile, "r").use { raf ->
                val bootSector = ByteArray(512)
                raf.seek(0)
                raf.readFully(bootSector)

                var vbrOffset = 0L
                var bytesPerSector = readLE16(bootSector, 11)
                var sectorsPerCluster = bootSector[13].toInt() and 0xFF
                var reservedSectors = readLE16(bootSector, 14)

                // If bytesPerSector is not standard, check MBR partition table at 0x1BE
                if (bytesPerSector !in listOf(512, 1024, 2048, 4096) || sectorsPerCluster == 0) {
                    val partOffset = 0x1BE
                    val partType = bootSector[partOffset + 4].toInt() and 0xFF
                    val startSector = readLE32(bootSector, partOffset + 8)
                    if (startSector > 0 && partType in listOf(0x01, 0x04, 0x06, 0x0B, 0x0C, 0x0E)) {
                        vbrOffset = startSector * 512L
                        raf.seek(vbrOffset)
                        raf.readFully(bootSector)
                        bytesPerSector = readLE16(bootSector, 11)
                        sectorsPerCluster = bootSector[13].toInt() and 0xFF
                        reservedSectors = readLE16(bootSector, 14)
                    }
                }

                if (bytesPerSector !in listOf(512, 1024, 2048, 4096) || sectorsPerCluster == 0) {
                    Log.w(TAG, "Not a valid FAT filesystem in ${imageFile.name}")
                    return false
                }

                val numFats = bootSector[16].toInt() and 0xFF
                val rootEntries = readLE16(bootSector, 17)
                val fatSize16 = readLE16(bootSector, 22)
                val fatSize32 = if (fatSize16 == 0) readLE32(bootSector, 36) else 0L
                val isFat32 = fatSize16 == 0 && fatSize32 > 0

                val fatSize = if (isFat32) fatSize32 else fatSize16.toLong()
                val rootDirSectors = ((rootEntries * 32) + (bytesPerSector - 1)) / bytesPerSector
                val fatStartOffset = vbrOffset + (reservedSectors.toLong() * bytesPerSector)
                val rootDirStartOffset = fatStartOffset + (numFats * fatSize * bytesPerSector)
                val dataStartOffset = rootDirStartOffset + (rootDirSectors * bytesPerSector)
                val rootCluster = if (isFat32) readLE32(bootSector, 44) else 2L
                val bytesPerCluster = bytesPerSector * sectorsPerCluster

                fun getClusterOffset(cluster: Long): Long {
                    return dataStartOffset + ((cluster - 2) * bytesPerCluster)
                }

                fun getNextCluster(cluster: Long): Long {
                    val fatOffset = if (isFat32) {
                        fatStartOffset + (cluster * 4)
                    } else {
                        fatStartOffset + (cluster * 2)
                    }
                    raf.seek(fatOffset)
                    return if (isFat32) {
                        val b = ByteArray(4)
                        raf.readFully(b)
                        readLE32(b, 0) and 0x0FFFFFFF
                    } else {
                        val b = ByteArray(2)
                        raf.readFully(b)
                        readLE16(b, 0).toLong()
                    }
                }

                fun isValidCluster(cluster: Long): Boolean {
                    return if (isFat32) {
                        cluster in 2 until 0x0FFFFFF7L
                    } else {
                        cluster in 2 until 0xFFF7L
                    }
                }

                fun readClusterChain(startCluster: Long, length: Long): ByteArray {
                    val result = ByteArray(length.toInt().coerceAtLeast(0))
                    var currCluster = startCluster
                    var bytesRemaining = length
                    var destPos = 0

                    while (isValidCluster(currCluster) && bytesRemaining > 0) {
                        val clusterOff = getClusterOffset(currCluster)
                        if (clusterOff + minOf(bytesRemaining, bytesPerCluster.toLong()) > raf.length()) break
                        raf.seek(clusterOff)
                        val toRead = minOf(bytesRemaining, bytesPerCluster.toLong()).toInt()
                        raf.readFully(result, destPos, toRead)
                        destPos += toRead
                        bytesRemaining -= toRead
                        currCluster = getNextCluster(currCluster)
                    }
                    return result
                }

                fun extractDirectory(dirOffset: Long, isCluster: Boolean, currentCluster: Long, currentDestDir: File) {
                    currentDestDir.mkdirs()
                    val entries = mutableListOf<ByteArray>()

                    if (!isCluster) {
                        val rootDirBytes = ByteArray(rootDirSectors * bytesPerSector)
                        if (dirOffset + rootDirBytes.size <= raf.length()) {
                            raf.seek(dirOffset)
                            raf.readFully(rootDirBytes)
                            for (i in 0 until rootDirBytes.size step 32) {
                                if (i + 32 <= rootDirBytes.size) {
                                    entries.add(rootDirBytes.copyOfRange(i, i + 32))
                                }
                            }
                        }
                    } else {
                        var c = currentCluster
                        var visited = mutableSetOf<Long>()
                        while (isValidCluster(c) && visited.add(c)) {
                            val cBytes = ByteArray(bytesPerCluster)
                            val cOff = getClusterOffset(c)
                            if (cOff + bytesPerCluster > raf.length()) break
                            raf.seek(cOff)
                            raf.readFully(cBytes)
                            for (i in 0 until cBytes.size step 32) {
                                if (i + 32 <= cBytes.size) {
                                    entries.add(cBytes.copyOfRange(i, i + 32))
                                }
                            }
                            c = getNextCluster(c)
                        }
                    }

                    val lfnParts = mutableListOf<String>()
                    for (entry in entries) {
                        val firstByte = entry[0].toInt() and 0xFF
                        if (firstByte == 0x00) break
                        if (firstByte == 0xE5) {
                            lfnParts.clear()
                            continue
                        }

                        val attr = entry[11].toInt() and 0xFF
                        if (attr == 0x0F) {
                            val lfnChars = StringBuilder()
                            for (offset in intArrayOf(1, 3, 5, 7, 9, 14, 16, 18, 20, 22, 24, 28, 30)) {
                                val ch = (entry[offset].toInt() and 0xFF) or ((entry[offset + 1].toInt() and 0xFF) shl 8)
                                if (ch != 0 && ch != 0xFFFF) lfnChars.append(ch.toChar())
                            }
                            lfnParts.add(0, lfnChars.toString())
                            continue
                        }

                        if ((attr and 0x08) != 0) {
                            lfnParts.clear()
                            continue
                        }

                        val isDir = (attr and 0x10) != 0
                        val fileName = if (lfnParts.isNotEmpty()) {
                            lfnParts.joinToString("").trim()
                        } else {
                            val name = String(entry, 0, 8, StandardCharsets.US_ASCII).trim()
                            val ext = String(entry, 8, 3, StandardCharsets.US_ASCII).trim()
                            if (ext.isNotEmpty()) "$name.$ext" else name
                        }
                        lfnParts.clear()

                        if (fileName == "." || fileName == "..") continue

                        val highCluster = readLE16(entry, 20).toLong()
                        val lowCluster = readLE16(entry, 26).toLong()
                        val fileCluster = (highCluster shl 16) or lowCluster
                        val fileSize = readLE32(entry, 28)

                        val targetFile = File(currentDestDir, fileName)
                        if (isDir) {
                            if (fileCluster >= 2) {
                                extractDirectory(0, true, fileCluster, targetFile)
                            }
                        } else {
                            if (fileSize > 0 && fileCluster >= 2) {
                                val fileData = readClusterChain(fileCluster, fileSize)
                                targetFile.writeBytes(fileData)
                            } else {
                                targetFile.createNewFile()
                            }
                        }
                    }
                }

                if (isFat32) {
                    extractDirectory(0, true, rootCluster, destDir)
                } else {
                    extractDirectory(rootDirStartOffset, false, 0, destDir)
                }

                Log.i(TAG, "Successfully extracted FAT image ${imageFile.name} to ${destDir.absolutePath}")
                true
            }
        }.getOrElse {
            Log.w(TAG, "Failed to extract FAT image ${imageFile.name}", it)
            false
        }
    }

    private fun readLE16(b: ByteArray, offset: Int): Int {
        return (b[offset].toInt() and 0xFF) or ((b[offset + 1].toInt() and 0xFF) shl 8)
    }

    private fun readLE32(b: ByteArray, offset: Int): Long {
        return (b[offset].toLong() and 0xFF) or
            ((b[offset + 1].toLong() and 0xFF) shl 8) or
            ((b[offset + 2].toLong() and 0xFF) shl 16) or
            ((b[offset + 3].toLong() and 0xFF) shl 24)
    }
}

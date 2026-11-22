package me.magnum.melonds.common.ndz

import me.magnum.melonds.NativeCoreLoader

object NdzNative {
    init {
        NativeCoreLoader.load()
    }

    external fun ndzOpen(fd: Int): Long

    external fun ndzInfo(handle: Long): LongArray

    external fun ndzRead(handle: Long, offset: Long, length: Int): ByteArray

    external fun ndzClose(handle: Long)
}

object NdzUnsupported {
    const val CORRUPT = 1
    const val LEGACY_LAYOUT = 2
    const val TRAINED_DICT = 3
    const val BASE_PATCH = 4
    const val PAIR_MULTI = 5
    const val COMPRESSED_DICT = 6
    const val UNKNOWN_MODE = 7
    const val DICT_MISSING = 8
    const val TOO_LARGE = 9
}

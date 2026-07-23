package me.magnum.melonds.impl.emulator

import java.nio.ByteBuffer

internal object RetroAchievementsEventDecoder {
    const val DISPLAY_SLOT_BYTES = 32
    const val SERVER_MESSAGE_SLOT_BYTES = 64
    const val LEADERBOARD_ERROR_MESSAGE_SLOT_BYTES = 48

    fun readFixedSlotString(buffer: ByteBuffer, slotBytes: Int): String {
        require(slotBytes >= 0) { "slotBytes must not be negative" }

        val declaredLength = if (buffer.remaining() >= Int.SIZE_BYTES) buffer.int else 0
        val availableSlotBytes = slotBytes.coerceAtMost(buffer.remaining())
        val slot = ByteArray(availableSlotBytes)
        buffer.get(slot)

        val decodedLength = declaredLength
            .coerceAtLeast(0)
            .coerceAtMost(availableSlotBytes)
        return String(slot, 0, decodedLength, Charsets.UTF_8)
    }
}

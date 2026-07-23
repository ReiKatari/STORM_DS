package me.magnum.melonds.impl.emulator

import me.magnum.melonds.domain.model.retroachievements.RAEvent
import me.magnum.melonds.domain.model.retroachievements.RaNativePendingRetryResolution
import me.magnum.melonds.domain.model.retroachievements.RaNativePendingRetryResult
import me.magnum.melonds.domain.model.retroachievements.RaNativePendingSubmissionResolution
import me.magnum.melonds.domain.model.retroachievements.RaNativePendingSubmissionType
import java.nio.ByteBuffer

internal object RetroAchievementsEventDecoder {
    const val DISPLAY_SLOT_BYTES = 32
    const val SERVER_MESSAGE_SLOT_BYTES = 64
    const val LEADERBOARD_ERROR_MESSAGE_SLOT_BYTES = 48
    private const val PENDING_ADDED_FIXED_BYTES =
        Long.SIZE_BYTES * 7 + Int.SIZE_BYTES * 4 + DISPLAY_SLOT_BYTES
    private const val PENDING_RESOLVED_FIXED_BYTES =
        Long.SIZE_BYTES * 2 + Int.SIZE_BYTES * 3
    private const val PENDING_BARRIER_FIXED_BYTES = Long.SIZE_BYTES * 2

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

    fun readPendingSubmissionAdded(buffer: ByteBuffer): RAEvent.OnPendingSubmissionAdded? {
        if (buffer.remaining() < PENDING_ADDED_FIXED_BYTES) return null

        val submissionSessionId = buffer.long
        val nativeSubmissionId = buffer.long
        if (submissionSessionId <= 0 || nativeSubmissionId <= 0) return null
        val sequence = buffer.long
        val createdAtEpochMs = buffer.long
        val achievementId = buffer.long
        val leaderboardId = buffer.long
        val attemptId = buffer.long
        val submissionType = RaNativePendingSubmissionType.fromWireValue(buffer.int) ?: return null
        val rawScore = buffer.int
        val hardcore = buffer.int != 0
        val formattedScore = readFixedSlotString(buffer, DISPLAY_SLOT_BYTES)

        return RAEvent.OnPendingSubmissionAdded(
            submissionSessionId = submissionSessionId,
            nativeSubmissionId = nativeSubmissionId,
            sequence = sequence,
            createdAtEpochMs = createdAtEpochMs,
            submissionType = submissionType,
            achievementId = achievementId,
            leaderboardId = leaderboardId,
            attemptId = attemptId,
            rawScore = rawScore,
            hardcore = hardcore,
            formattedScore = formattedScore,
        )
    }

    fun readPendingSubmissionResolved(buffer: ByteBuffer): RAEvent.OnPendingSubmissionResolved? {
        if (buffer.remaining() < PENDING_RESOLVED_FIXED_BYTES) return null

        val submissionSessionId = buffer.long
        val nativeSubmissionId = buffer.long
        if (submissionSessionId <= 0 || nativeSubmissionId <= 0) return null
        val submissionType = RaNativePendingSubmissionType.fromWireValue(buffer.int) ?: return null
        val resolution = RaNativePendingSubmissionResolution.fromWireValue(buffer.int) ?: return null
        return RAEvent.OnPendingSubmissionResolved(
            submissionSessionId = submissionSessionId,
            nativeSubmissionId = nativeSubmissionId,
            submissionType = submissionType,
            resolution = resolution,
            resultCode = buffer.int,
        )
    }

    fun readPendingSubmissionBarrier(buffer: ByteBuffer): RAEvent.OnPendingSubmissionBarrier? {
        if (buffer.remaining() < PENDING_BARRIER_FIXED_BYTES) return null

        val submissionSessionId = buffer.long
        val barrierId = buffer.long
        if (submissionSessionId <= 0 || barrierId <= 0) return null
        return RAEvent.OnPendingSubmissionBarrier(
            submissionSessionId = submissionSessionId,
            barrierId = barrierId,
        )
    }

    fun readPendingRetryResult(encoded: LongArray?): RaNativePendingRetryResult {
        if (encoded == null || encoded.size < 4) return pendingRetryTransportFailure()

        val submissionSessionId = encoded[0]
        val forcedRetryCount = encoded[1]
        val resolutionCount = encoded[2]
        val transportFailure = encoded[3]
        if (
            submissionSessionId <= 0 ||
            forcedRetryCount !in 0..Int.MAX_VALUE.toLong() ||
            resolutionCount !in 0..Int.MAX_VALUE.toLong() ||
            transportFailure !in 0L..1L ||
            encoded.size.toLong() != 4L + resolutionCount * 4L
        ) {
            return pendingRetryTransportFailure()
        }

        if (transportFailure == 1L) {
            return pendingRetryTransportFailure(
                submissionSessionId = submissionSessionId,
                forcedRetryCount = forcedRetryCount.toInt(),
            )
        }

        val resolutions = ArrayList<RaNativePendingRetryResolution>(resolutionCount.toInt())
        var index = 4
        repeat(resolutionCount.toInt()) {
            val nativeSubmissionId = encoded[index++]
            val submissionTypeValue = encoded[index++]
            val resolutionValue = encoded[index++]
            val resultCode = encoded[index++]
            val submissionType = submissionTypeValue
                .takeIf { it in Int.MIN_VALUE.toLong()..Int.MAX_VALUE.toLong() }
                ?.toInt()
                ?.let(RaNativePendingSubmissionType::fromWireValue)
            val resolution = resolutionValue
                .takeIf { it in Int.MIN_VALUE.toLong()..Int.MAX_VALUE.toLong() }
                ?.toInt()
                ?.let(RaNativePendingSubmissionResolution::fromWireValue)
            if (
                nativeSubmissionId <= 0 ||
                submissionType == null ||
                resolution == null ||
                resultCode !in Int.MIN_VALUE.toLong()..Int.MAX_VALUE.toLong()
            ) {
                return pendingRetryTransportFailure(
                    submissionSessionId = submissionSessionId,
                    forcedRetryCount = forcedRetryCount.toInt(),
                )
            }
            resolutions += RaNativePendingRetryResolution(
                nativeSubmissionId = nativeSubmissionId,
                submissionType = submissionType,
                resolution = resolution,
                resultCode = resultCode.toInt(),
            )
        }

        return RaNativePendingRetryResult(
            submissionSessionId = submissionSessionId,
            forcedRetryCount = forcedRetryCount.toInt(),
            resolutions = resolutions,
        )
    }

    private fun pendingRetryTransportFailure(
        submissionSessionId: Long = 0,
        forcedRetryCount: Int = 0,
    ) = RaNativePendingRetryResult(
        submissionSessionId = submissionSessionId,
        forcedRetryCount = forcedRetryCount,
        resolutions = emptyList(),
        transportFailure = true,
    )
}

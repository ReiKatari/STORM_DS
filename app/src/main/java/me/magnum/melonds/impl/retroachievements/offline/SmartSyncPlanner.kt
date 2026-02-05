package me.magnum.melonds.impl.retroachievements.offline

import kotlin.math.max
import kotlin.math.roundToLong
import kotlin.random.Random

data class SmartSyncPlanItem(
    val unlock: OfflineUnlockEvent,
    val delayBeforeMs: Long,
)

data class SmartSyncConfig(
    val baseDelayRangeMs: LongRange = 2000L..5000L,
    val minDelayRangeMs: LongRange = 3000L..5000L,
    val maxDelayRangeMs: LongRange = 6000L..10000L,
    val jitterFractionRange: ClosedFloatingPointRange<Double> = 0.10..0.20,
    val burstEvery: Int = 5,
    val burstExtraDelayRangeMs: LongRange = 8000L..15000L,
)

object SmartSyncPlanner {
    fun plan(
        pendingUnlocks: List<OfflineUnlockEvent>,
        sessions: Map<String, OfflineSessionEvent>,
        config: SmartSyncConfig = SmartSyncConfig(),
        random: Random = Random.Default,
    ): List<SmartSyncPlanItem> {
        if (pendingUnlocks.isEmpty()) return emptyList()

        val baseDelayMs = random.nextLongInclusive(config.baseDelayRangeMs)
        val minDelayMs = random.nextLongInclusive(config.minDelayRangeMs)
        val maxDelayMsRaw = random.nextLongInclusive(config.maxDelayRangeMs)
        val maxDelayMs = max(maxDelayMsRaw, minDelayMs + 1L)
        val jitterFraction = random.nextDoubleRange(config.jitterFractionRange)

        val unlocksBySession = pendingUnlocks.groupBy { it.sessionId.ifBlank { "__unknown__" } }

        val orderedSessionIds = unlocksBySession.keys.sortedWith(
            compareBy<String> { sessions[it]?.startedAtEpochMs ?: Long.MAX_VALUE }
                .thenBy { sessions[it]?.seq ?: Long.MAX_VALUE }
                .thenBy { it },
        )

        val planItems = mutableListOf<SmartSyncPlanItem>()
        var globalUnlockIndex = 0

        orderedSessionIds.forEach { sessionId ->
            val sessionUnlocks = unlocksBySession[sessionId].orEmpty().sortedWith(
                compareBy<OfflineUnlockEvent> { it.offsetFromSessionStartMs }
                    .thenBy { it.orderIndex }
                    .thenBy { it.seq },
            )
            if (sessionUnlocks.isEmpty()) return@forEach

            val rawDeltas = buildList {
                var prevOffset = 0L
                sessionUnlocks.forEach { unlock ->
                    val delta = (unlock.offsetFromSessionStartMs - prevOffset).coerceAtLeast(0L)
                    add(delta)
                    prevOffset = unlock.offsetFromSessionStartMs
                }
            }
            val maxDelta = rawDeltas.maxOrNull() ?: 0L
            val compressionFactor = max(1.0, maxDelta.toDouble() / maxDelayMs.toDouble())

            rawDeltas.zip(sessionUnlocks).forEach { (rawDelta, unlock) ->
                val scaled = rawDelta.toDouble() / compressionFactor
                val clamped = scaled.coerceIn(minDelayMs.toDouble(), maxDelayMs.toDouble())

                val jitter = if (jitterFraction == 0.0) 0.0 else random.nextDouble(-jitterFraction, jitterFraction)
                val jittered = clamped * (1.0 + jitter)
                var delayMs = jittered.roundToLong().coerceIn(minDelayMs, maxDelayMs)

                if (globalUnlockIndex == 0) {
                    delayMs += baseDelayMs
                }

                if (config.burstEvery > 0 && globalUnlockIndex > 0 && globalUnlockIndex % config.burstEvery == 0) {
                    val burstDelay = random.nextLongInclusive(config.burstExtraDelayRangeMs)
                    delayMs += burstDelay
                }

                planItems += SmartSyncPlanItem(unlock = unlock, delayBeforeMs = delayMs)
                globalUnlockIndex++
            }
        }

        return planItems
    }

    private fun Random.nextLongInclusive(range: LongRange): Long {
        return if (range.first == range.last) {
            range.first
        } else {
            nextLong(range.first, range.last + 1L)
        }
    }

    private fun Random.nextDoubleRange(range: ClosedFloatingPointRange<Double>): Double {
        return if (range.start == range.endInclusive) {
            range.start
        } else {
            nextDouble(range.start, range.endInclusive)
        }
    }
}

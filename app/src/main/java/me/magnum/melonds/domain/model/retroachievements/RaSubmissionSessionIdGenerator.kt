package me.magnum.melonds.domain.model.retroachievements

import java.util.concurrent.atomic.AtomicLong

object RaSubmissionSessionIdGenerator {
    private val nextId = AtomicLong(1)

    fun next(): Long {
        val value = nextId.getAndIncrement()
        check(value > 0) { "RetroAchievements submission session ID space exhausted" }
        return value
    }
}

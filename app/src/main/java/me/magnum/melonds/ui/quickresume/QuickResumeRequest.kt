package me.magnum.melonds.ui.quickresume

import android.net.Uri
import android.os.SystemClock

object QuickResumeRequest {
    private const val EXPIRY_MS = 5 * 60_000L

    @Volatile
    private var pendingRomUri: String? = null

    @Volatile
    private var forceAnyRom: Boolean = false

    @Volatile
    private var requestedAtElapsedMs: Long = 0L

    @Synchronized
    fun request(romUri: Uri?) {
        pendingRomUri = romUri?.toString()
        forceAnyRom = romUri == null
        requestedAtElapsedMs = SystemClock.elapsedRealtime()
    }

    @Synchronized
    fun clear() {
        pendingRomUri = null
        forceAnyRom = false
        requestedAtElapsedMs = 0L
    }

    @Synchronized
    fun consumeFor(romUri: Uri): Boolean {
        val requestedAt = requestedAtElapsedMs
        val targetUri = pendingRomUri
        val matchAny = forceAnyRom
        clear()

        if (requestedAt <= 0L) return false
        val ageMs = SystemClock.elapsedRealtime() - requestedAt
        if (ageMs < 0L || ageMs > EXPIRY_MS) return false

        return matchAny || (targetUri != null && targetUri == romUri.toString())
    }
}

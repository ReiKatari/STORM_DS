package me.magnum.melonds.ui.romdetails.model

import me.magnum.melonds.impl.retroachievements.offline.OfflineLedgerIntegrity

data class OfflineAchievementsUiState(
    val availability: Availability = Availability.DISABLED_NOT_LOGGED_IN,
    val pendingSoftcoreUnlockCount: Int = 0,
    val pendingLedgerUnlockCount: Int = 0,
    val ledgerIntegrity: OfflineLedgerIntegrity = OfflineLedgerIntegrity.EMPTY,
    val ledgerExpiresInMs: Long? = null,
    val isOnline: Boolean = false,
    val isSyncing: Boolean = false,
) {
    enum class Availability {
        ENABLED,
        DISABLED_NOT_LOGGED_IN,
        DISABLED_NO_CACHE,
    }

    val isLedgerIntegrityOk: Boolean
        get() = ledgerIntegrity == OfflineLedgerIntegrity.OK || ledgerIntegrity == OfflineLedgerIntegrity.EMPTY

    val isLedgerExpired: Boolean
        get() = ledgerExpiresInMs?.let { it <= 0L } == true

    val canSyncNow: Boolean
        get() = availability == Availability.ENABLED &&
            isOnline &&
            isLedgerIntegrityOk &&
            pendingSoftcoreUnlockCount > 0 &&
            !isLedgerExpired &&
            !isSyncing
}

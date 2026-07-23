package me.magnum.melonds.common.retroachievements

import me.magnum.rcheevosapi.model.RAUserAuth

internal class RaAuthenticationMutationLeaseRegistry {
    private data class Lease(
        val id: String,
        val authentication: RAUserAuth.Authenticated,
    )

    private val monitor = Any()
    private var activeLease: Lease? = null
    private var mutationInProgress = false
    private var handedOffLeaseId: String? = null

    fun tryAcquire(
        leaseId: String,
        authentication: RAUserAuth.Authenticated,
    ): Boolean = synchronized(monitor) {
        if (mutationInProgress) {
            return@synchronized false
        }
        val current = activeLease
        if (current != null) {
            return@synchronized current.id == leaseId &&
                current.authentication == authentication
        }
        activeLease = Lease(leaseId, authentication)
        true
    }

    fun release(leaseId: String): Boolean = synchronized(monitor) {
        if (activeLease?.id != leaseId) {
            return@synchronized false
        }
        activeLease = null
        true
    }

    fun tryBeginMutation(): Boolean = synchronized(monitor) {
        if (mutationInProgress || activeLease != null) {
            return@synchronized false
        }
        mutationInProgress = true
        handedOffLeaseId = null
        true
    }

    fun tryHandoffLeaseToMutation(leaseId: String): Boolean = synchronized(monitor) {
        if (mutationInProgress || activeLease?.id != leaseId) {
            return@synchronized false
        }
        activeLease = null
        mutationInProgress = true
        handedOffLeaseId = leaseId
        true
    }

    fun ownsHandedOffMutation(leaseId: String): Boolean = synchronized(monitor) {
        mutationInProgress && handedOffLeaseId == leaseId
    }

    fun endMutation() {
        synchronized(monitor) {
            check(mutationInProgress)
            mutationInProgress = false
            handedOffLeaseId = null
        }
    }
}

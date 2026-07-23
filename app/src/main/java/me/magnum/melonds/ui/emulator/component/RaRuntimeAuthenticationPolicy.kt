package me.magnum.melonds.ui.emulator.component

object RaRuntimeAuthenticationPolicy {
    fun matches(
        runtimeUserId: String?,
        runtimeToken: String?,
        authenticatedUserId: String?,
        authenticatedToken: String?,
    ): Boolean {
        return !runtimeUserId.isNullOrBlank() &&
            !runtimeToken.isNullOrBlank() &&
            runtimeUserId == authenticatedUserId &&
            runtimeToken == authenticatedToken
    }
}

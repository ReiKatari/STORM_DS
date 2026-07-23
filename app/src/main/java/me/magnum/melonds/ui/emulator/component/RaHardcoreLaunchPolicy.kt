package me.magnum.melonds.ui.emulator.component

object RaHardcoreLaunchPolicy {
    fun mustUseOfflinePath(validatedNetworkAtStart: Boolean): Boolean {
        return !validatedNetworkAtStart
    }

    fun mustDowngradeHardcore(
        hardcoreRequested: Boolean,
        bootstrapLoadedFromNetwork: Boolean,
    ): Boolean {
        return hardcoreRequested && !bootstrapLoadedFromNetwork
    }
}

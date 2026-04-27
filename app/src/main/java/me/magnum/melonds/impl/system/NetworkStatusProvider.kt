package me.magnum.melonds.impl.system

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import androidx.core.content.getSystemService
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NetworkStatusProvider @Inject constructor(
    @ApplicationContext private val context: Context,
) {
    fun isOnline(): Boolean {
        val capabilities = currentCapabilities() ?: return false
        return capabilities.hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET) &&
            capabilities.hasCapability(NetworkCapabilities.NET_CAPABILITY_VALIDATED)
    }

    fun isLikelyOnline(): Boolean {
        val capabilities = currentCapabilities() ?: return false
        return capabilities.hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET)
    }

    private fun currentCapabilities(): NetworkCapabilities? {
        val connectivityManager = context.getSystemService<ConnectivityManager>() ?: return null
        val network = connectivityManager.activeNetwork ?: return null
        return connectivityManager.getNetworkCapabilities(network)
    }
}

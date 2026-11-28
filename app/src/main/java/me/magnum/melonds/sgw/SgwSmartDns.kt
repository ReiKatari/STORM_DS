package me.magnum.melonds.sgw

import okhttp3.Dns
import okhttp3.OkHttpClient
import okhttp3.Protocol
import java.net.InetAddress
import java.net.UnknownHostException
import java.util.concurrent.TimeUnit

object SgwSmartDns : Dns {
    private const val SGW_HOST = "stormgamesworld.ru"
    private const val SGW_FALLBACK_IP = "87.255.6.63"

    override fun lookup(hostname: String): List<InetAddress> {
        return try {
            val system = Dns.SYSTEM.lookup(hostname)
            if (system.isNotEmpty()) system else fallbackForHost(hostname)
        } catch (_: UnknownHostException) {
            fallbackForHost(hostname)
        }
    }

    private fun fallbackForHost(hostname: String): List<InetAddress> {
        if (hostname.equals(SGW_HOST, ignoreCase = true)
            || hostname.endsWith(".$SGW_HOST", ignoreCase = true)
        ) {
            return listOf(InetAddress.getByName(SGW_FALLBACK_IP))
        }
        throw UnknownHostException("Unable to resolve host: $hostname")
    }

    fun createHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .dns(this)
            .protocols(listOf(Protocol.HTTP_1_1))
            .connectTimeout(15, TimeUnit.SECONDS)
            .readTimeout(60, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .followRedirects(true)
            .followSslRedirects(true)
            .build()
    }
}

package me.magnum.melonds.sgw

import kotlinx.coroutines.CancellationException
import okhttp3.Dns
import okhttp3.OkHttpClient
import okhttp3.Protocol
import java.net.InetAddress
import java.net.UnknownHostException
import java.util.concurrent.ExecutionException
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

object SgwSmartDns : Dns {
    private const val SGW_HOST = "stormgamesworld.ru"
    private const val SGW_FALLBACK_IP = "87.255.6.63"
    private const val DNS_TIMEOUT_SECONDS = 4L

    private val dnsExecutor: ExecutorService = Executors.newCachedThreadPool { runnable ->
        Thread(runnable, "SgwDnsLookup").apply { isDaemon = true }
    }

    override fun lookup(hostname: String): List<InetAddress> {
        val future = dnsExecutor.submit<List<InetAddress>> {
            Dns.SYSTEM.lookup(hostname)
        }
        return try {
            val system = future.get(DNS_TIMEOUT_SECONDS, TimeUnit.SECONDS)
            val filtered = if (isSgwHost(hostname)) {
                system.filterNot { it.isLoopbackAddress || it.isAnyLocalAddress }
            } else {
                system
            }
            filtered.ifEmpty { fallbackForHost(hostname) }
        } catch (e: CancellationException) {
            future.cancel(true)
            throw e
        } catch (e: InterruptedException) {
            future.cancel(true)
            Thread.currentThread().interrupt()
            throw e
        } catch (e: ExecutionException) {
            val cause = e.cause
            if (cause is CancellationException) throw cause
            if (cause is InterruptedException) {
                Thread.currentThread().interrupt()
                throw cause
            }
            fallbackForHost(hostname)
        } catch (_: Throwable) {
            future.cancel(true)
            fallbackForHost(hostname)
        }
    }

    private fun isSgwHost(hostname: String): Boolean {
        return hostname.equals(SGW_HOST, ignoreCase = true) ||
            hostname.endsWith(".$SGW_HOST", ignoreCase = true)
    }

    private fun fallbackForHost(hostname: String): List<InetAddress> {
        if (isSgwHost(hostname)) {
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

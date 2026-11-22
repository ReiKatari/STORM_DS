package me.magnum.melonds.common.network

import java.io.IOException
import java.net.HttpURLConnection
import java.net.URL

object HttpRedirectHelper {
    const val DEFAULT_BROWSER_USER_AGENT =
        "Mozilla/5.0 (Linux; Android 14; Mobile) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Mobile Safari/537.36"

    fun openConnectionWithRedirects(
        initialUrl: String,
        maxRedirects: Int = 10,
        connectTimeoutMs: Int = 20_000,
        readTimeoutMs: Int = 45_000,
        userAgent: String = DEFAULT_BROWSER_USER_AGENT,
        accept: String = "*/*",
    ): HttpURLConnection {
        var currentUrl = initialUrl
        var redirects = 0
        while (redirects < maxRedirects) {
            val url = URL(currentUrl)
            val connection = url.openConnection() as HttpURLConnection
            try {
                connection.connectTimeout = connectTimeoutMs
                connection.readTimeout = readTimeoutMs
                connection.instanceFollowRedirects = false
                connection.setRequestProperty("User-Agent", userAgent)
                connection.setRequestProperty("Accept", accept)
                connection.connect()

                val responseCode = connection.responseCode
                if (responseCode in 300..399) {
                    val location = connection.getHeaderField("Location")
                    connection.disconnect()
                    if (location.isNullOrBlank()) {
                        throw IOException("HTTP redirect $responseCode with missing Location header")
                    }
                    currentUrl = resolveSafeRedirectUrl(url, location)
                    redirects++
                } else if (responseCode in 200..299) {
                    return connection
                } else {
                    connection.disconnect()
                    throw IOException("HTTP error $responseCode")
                }
            } catch (t: Throwable) {
                connection.disconnect()
                throw t
            }
        }
        throw IOException("Too many redirects ($redirects)")
    }

    fun resolveFinalRedirectUrl(
        initialUrl: String,
        maxRedirects: Int = 6,
        connectTimeoutMs: Int = 10_000,
        readTimeoutMs: Int = 10_000,
        userAgent: String = DEFAULT_BROWSER_USER_AGENT,
    ): String {
        var currentUrl = initialUrl
        var redirects = 0
        while (redirects < maxRedirects) {
            val url = URL(currentUrl)
            val conn = (url.openConnection() as HttpURLConnection).apply {
                instanceFollowRedirects = false
                connectTimeout = connectTimeoutMs
                readTimeout = readTimeoutMs
                setRequestProperty("User-Agent", userAgent)
            }
            try {
                val code = conn.responseCode
                val location = conn.getHeaderField("Location")
                if (code in 300..399 && !location.isNullOrBlank()) {
                    currentUrl = resolveSafeRedirectUrl(url, location)
                    redirects++
                } else {
                    break
                }
            } finally {
                conn.disconnect()
            }
        }
        return currentUrl
    }

    internal fun resolveSafeRedirectUrl(currentUrl: URL, location: String): String {
        val nextUrl = URL(currentUrl, location)
        val currentScheme = currentUrl.protocol.lowercase()
        val nextScheme = nextUrl.protocol.lowercase()
        if (nextScheme != "http" && nextScheme != "https") {
            throw IOException("Unsupported redirect protocol: $nextScheme")
        }
        if (currentScheme == "https" && nextScheme == "http") {
            throw IOException("Refusing HTTPS to HTTP downgrade redirect to $nextUrl")
        }
        return nextUrl.toString()
    }
}

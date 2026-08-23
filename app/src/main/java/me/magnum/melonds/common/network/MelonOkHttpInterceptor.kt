package me.magnum.melonds.common.network

import android.content.Context
import android.util.Log
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response
import okio.Buffer
import java.net.URLDecoder
import java.nio.charset.StandardCharsets

private const val MAX_LOGGED_RA_PARAMETER_VALUE_LENGTH = 200
private val REDACTED_RA_PARAMETER_KEYS = setOf("m", "p", "t", "u", "v", "x")
const val RETROACHIEVEMENTS_USER_AGENT = "STORM_DS-android/2.7.2"

internal fun sanitizeRaRequestParameterValue(key: String, value: String): String {
    if (key in REDACTED_RA_PARAMETER_KEYS) {
        return "<redacted>"
    }

    val normalizedValue = value
        .replace("\r", "\\r")
        .replace("\n", "\\n")
    return if (normalizedValue.length > MAX_LOGGED_RA_PARAMETER_VALUE_LENGTH) {
        "${normalizedValue.take(MAX_LOGGED_RA_PARAMETER_VALUE_LENGTH)}…(len=${normalizedValue.length})"
    } else {
        normalizedValue
    }
}

class MelonOkHttpInterceptor(
    context: Context,
) : Interceptor {
    private companion object {
        const val IDENTITY_TAG = "RAIdentity"
        const val REQUEST_TAG = "RARequest"
        const val USER_AGENT = "User-Agent"
        const val UNKNOWN_VERSION = "unknown"
        const val REQUEST_PARAM_ACTION = "r"
    }

    private val appPackageName = context.packageName
    private val appVersionName = runCatching {
        context.packageManager.getPackageInfo(context.packageName, 0).versionName
    }.getOrNull().orEmpty().ifBlank { UNKNOWN_VERSION }
    private val melonUserAgent = RETROACHIEVEMENTS_USER_AGENT

    private data class RequestParameter(
        val key: String,
        val value: String,
    )

    private fun decodeFormComponent(value: String): String {
        return runCatching {
            URLDecoder.decode(value, StandardCharsets.UTF_8.toString())
        }.getOrDefault(value)
    }

    private fun parseEncodedParameters(encodedParameters: String?): List<RequestParameter> {
        if (encodedParameters.isNullOrBlank()) {
            return emptyList()
        }

        return encodedParameters
            .split("&")
            .filter { it.isNotBlank() }
            .map { parameter ->
                val separatorIndex = parameter.indexOf('=')
                val encodedKey = if (separatorIndex >= 0) parameter.substring(0, separatorIndex) else parameter
                val encodedValue = if (separatorIndex >= 0) parameter.substring(separatorIndex + 1) else ""
                RequestParameter(
                    key = decodeFormComponent(encodedKey),
                    value = decodeFormComponent(encodedValue),
                )
            }
    }

    private fun readEncodedBody(request: Request): String? {
        val body = request.body ?: return null
        return runCatching {
            val buffer = Buffer()
            body.writeTo(buffer)
            buffer.readUtf8()
        }.getOrNull()
    }

    private fun extractRequestParameters(request: Request): List<RequestParameter> {
        return buildList {
            addAll(parseEncodedParameters(request.url.encodedQuery))
            addAll(parseEncodedParameters(readEncodedBody(request)))
        }
    }

    private fun formatParametersForLog(parameters: List<RequestParameter>): String {
        if (parameters.isEmpty()) {
            return "<none>"
        }

        return parameters.joinToString("&") { parameter ->
            "${parameter.key}=${sanitizeRaRequestParameterValue(parameter.key, parameter.value)}"
        }
    }

    private fun extractRequestAction(request: Request, parameters: List<RequestParameter>): String {
        return parameters.lastOrNull { it.key == REQUEST_PARAM_ACTION }?.value ?: request.url.encodedPath
    }

    override fun intercept(chain: Interceptor.Chain): Response {
        val originalRequest = chain.request()
        val parameters = extractRequestParameters(originalRequest)
        Log.i(
            IDENTITY_TAG,
            "source=kotlin_http action=${extractRequestAction(originalRequest, parameters)} " +
                "user_agent=$melonUserAgent package=$appPackageName version=$appVersionName",
        )
        Log.i(
            REQUEST_TAG,
            "source=kotlin_http action=${extractRequestAction(originalRequest, parameters)} " +
                "method=${originalRequest.method} params=${formatParametersForLog(parameters)}",
        )
        val newRequest = originalRequest
            .newBuilder()
            .addHeader(USER_AGENT, melonUserAgent)
            .build()

        return chain.proceed(newRequest)
    }
}

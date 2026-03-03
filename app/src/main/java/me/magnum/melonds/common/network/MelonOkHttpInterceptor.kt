package me.magnum.melonds.common.network

import android.content.Context
import okhttp3.Interceptor
import okhttp3.Response

class MelonOkHttpInterceptor(
    context: Context,
) : Interceptor {
    private companion object {
        const val USER_AGENT = "User-Agent"
        const val MELON_USER_AGENT_PREFIX = "melonDualDS-android/"
        const val UNKNOWN_VERSION = "unknown"
    }

    private val melonUserAgent: String = buildString {
        append(MELON_USER_AGENT_PREFIX)
        append(
            runCatching {
                context.packageManager.getPackageInfo(context.packageName, 0).versionName
            }.getOrNull().orEmpty().ifBlank { UNKNOWN_VERSION }
        )
    }

    override fun intercept(chain: Interceptor.Chain): Response {
        val newRequest = chain.request()
            .newBuilder()
            .addHeader(USER_AGENT, melonUserAgent)
            .build()

        return chain.proceed(newRequest)
    }
}

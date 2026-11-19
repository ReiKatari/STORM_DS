package me.magnum.melonds.common.network

import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit

object SharedOkHttpClient {
    val instance: OkHttpClient by lazy {
        OkHttpClient.Builder()
            .connectTimeout(15, TimeUnit.SECONDS)
            .readTimeout(20, TimeUnit.SECONDS)
            .callTimeout(30, TimeUnit.SECONDS)
            .build()
    }
}

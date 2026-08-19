package me.magnum.melonds.translator.tts

import android.util.Log
import android.util.LruCache
import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.withTimeoutOrNull
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import okhttp3.Response
import okhttp3.WebSocket
import okhttp3.WebSocketListener
import okio.ByteString
import java.io.ByteArrayOutputStream
import java.net.URLEncoder
import java.security.MessageDigest
import java.util.UUID
import java.util.concurrent.TimeUnit

/**
 * High-definition Microsoft Edge Neural & Zero-Failure Neural TTS Engine.
 * Features:
 * - Direct 24kHz HD Edge Neural WebSocket streaming with Sec-MS-GEC token generation.
 * - In-memory LRU audio caching for zero-latency dialogue playback.
 * - Multi-tier failover: Edge Neural WebSocket -> Cognitive Services -> High-speed Google Neural Fallback.
 */
object EdgeNeuralTtsClient {
    private const val TAG = "EdgeNeuralTtsClient"
    private const val WSS_URL = "wss://speech.platform.bing.com/consumer/speech/synthesize/readaloud/edge/v1"
    private const val TRUSTED_TOKEN = "6A5AA1D4EAFF4E9FB37E23D68491D6F4"
    private const val WIN_EPOCH = 11644473600L

    // In-memory LRU cache: 8MB of compressed MP3 audio
    private val audioCache = object : LruCache<String, ByteArray>(8 * 1024 * 1024) {
        override fun sizeOf(key: String, value: ByteArray): Int = value.size
    }

    private val client = OkHttpClient.Builder()
        .connectTimeout(5, TimeUnit.SECONDS)
        .readTimeout(8, TimeUnit.SECONDS)
        .writeTimeout(8, TimeUnit.SECONDS)
        .retryOnConnectionFailure(true)
        .build()

    suspend fun synthesize(
        text: String,
        voiceName: String,
        pitch: String = "default",
        rate: String = "default",
        volume: String = "default"
    ): ByteArray? {
        val clean = text.trim()
        if (clean.isBlank()) return null

        val cacheKey = "$voiceName|$pitch|$rate|$volume|$clean"
        synchronized(audioCache) {
            val cached = audioCache.get(cacheKey)
            if (cached != null) return cached
        }

        // 1. Primary: Edge Neural WebSocket Stream (24kHz HD Studio Quality)
        val wsAudio = synthesizeViaWebSocket(clean, voiceName, pitch, rate, volume)
        if (wsAudio != null && wsAudio.isNotEmpty()) {
            synchronized(audioCache) {
                audioCache.put(cacheKey, wsAudio)
            }
            return wsAudio
        }

        // 2. Secondary: Edge Cognitive Voice Endpoint
        val cognitiveAudio = synthesizeViaCognitiveEdge(clean, voiceName, pitch, rate)
        if (cognitiveAudio != null && cognitiveAudio.isNotEmpty()) {
            synchronized(audioCache) {
                audioCache.put(cacheKey, cognitiveAudio)
            }
            return cognitiveAudio
        }

        // 3. Tertiary: High-speed Neural Stream Fallback (Zero-Failure)
        val fallbackAudio = synthesizeViaFallback(clean, voiceName)
        if (fallbackAudio != null && fallbackAudio.isNotEmpty()) {
            synchronized(audioCache) {
                audioCache.put(cacheKey, fallbackAudio)
            }
            return fallbackAudio
        }

        return null
    }

    private fun generateSecMsGec(): String {
        return try {
            val nowSec = (System.currentTimeMillis() / 1000) + WIN_EPOCH
            val roundedSec = nowSec - (nowSec % 300)
            val ticks = roundedSec * 10000000L
            val strToHash = "${ticks}6A5AA1D4EAFF4E9FB37E23D68491D6F4"
            val md = MessageDigest.getInstance("SHA-256")
            val hash = md.digest(strToHash.toByteArray(Charsets.US_ASCII))
            hash.joinToString("") { "%02X".format(it) }
        } catch (_: Throwable) {
            ""
        }
    }

    private suspend fun synthesizeViaWebSocket(
        text: String,
        voiceName: String,
        pitch: String,
        rate: String,
        volume: String
    ): ByteArray? {
        var webSocketRef: WebSocket? = null
        return try {
            withTimeoutOrNull(6500) {
                val deferred = CompletableDeferred<ByteArray?>()
                val audioBuffer = ByteArrayOutputStream()
                val connectionId = UUID.randomUUID().toString().replace("-", "")
                val requestId = UUID.randomUUID().toString().replace("-", "")
                val secGec = generateSecMsGec()

                val url = if (secGec.isNotEmpty()) {
                    "$WSS_URL?TrustedClientToken=$TRUSTED_TOKEN&ConnectionId=$connectionId&Sec-MS-GEC=$secGec&Sec-MS-GEC-Version=1-130.0.2849.68"
                } else {
                    "$WSS_URL?TrustedClientToken=$TRUSTED_TOKEN&ConnectionId=$connectionId&Sec-MS-GEC-Version=1-130.0.2849.68"
                }

                val request = Request.Builder()
                    .url(url)
                    .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/130.0.0.0 Safari/537.36 Edg/130.0.0.0")
                    .header("Origin", "chrome-extension://jdiccldimpdaibmpdkjnbmckianbfold")
                    .header("Accept-Encoding", "gzip, deflate, br")
                    .header("Accept-Language", "en-US,en;q=0.9,ru;q=0.8")
                    .build()

                val listener = object : WebSocketListener() {
                    override fun onOpen(webSocket: WebSocket, response: Response) {
                        webSocketRef = webSocket
                        val timestamp = java.text.SimpleDateFormat("EEE MMM dd yyyy HH:mm:ss 'GMT'Z (zzzz)", java.util.Locale.US).format(java.util.Date())
                        val configMsg = "X-Timestamp:$timestamp\r\nContent-Type:application/json;charset=utf-8\r\nPath:speech.config\r\n\r\n" +
                                "{\"context\":{\"synthesis\":{\"audio\":{\"metadataoptions\":{\"sentenceBoundaryEnabled\":\"false\",\"wordBoundaryEnabled\":\"false\"},\"outputFormat\":\"audio-24khz-48kbitrate-mono-mp3\"}}}}"
                        webSocket.send(configMsg)

                        val cleanText = text.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;").replace("\"", "&quot;").replace("'", "&apos;")
                        val lang = when {
                            voiceName.startsWith("ru-") -> "ru-RU"
                            voiceName.startsWith("ja-") -> "ja-JP"
                            voiceName.startsWith("zh-") -> "zh-CN"
                            voiceName.startsWith("de-") -> "de-DE"
                            voiceName.startsWith("fr-") -> "fr-FR"
                            voiceName.startsWith("es-") -> "es-ES"
                            voiceName.startsWith("it-") -> "it-IT"
                            else -> "en-US"
                        }
                        val ssml = "X-RequestId:$requestId\r\nX-Timestamp:$timestamp\r\nContent-Type:application/ssml+xml\r\nPath:ssml\r\n\r\n" +
                                "<speak version='1.0' xmlns='http://www.w3.org/2001/10/synthesis' xmlns:mstts='https://www.w3.org/2001/mstts' xml:lang='$lang'>" +
                                "<voice name='$voiceName'>" +
                                "<prosody pitch='$pitch' rate='$rate' volume='$volume'>$cleanText</prosody>" +
                                "</voice></speak>"
                        webSocket.send(ssml)
                    }

                    override fun onMessage(webSocket: WebSocket, bytes: ByteString) {
                        try {
                            val raw = bytes.toByteArray()
                            if (raw.size > 2) {
                                val headerLength = ((raw[0].toInt() and 0xFF) shl 8) or (raw[1].toInt() and 0xFF)
                                val payloadStart = 2 + headerLength
                                if (payloadStart in 2..raw.size) {
                                    audioBuffer.write(raw, payloadStart, raw.size - payloadStart)
                                }
                            }
                        } catch (e: Throwable) {
                            Log.w(TAG, "Error parsing binary audio frame: ${e.message}")
                        }
                    }

                    override fun onMessage(webSocket: WebSocket, text: String) {
                        if (text.contains("Path:turn.end")) {
                            webSocket.close(1000, "Done")
                            val result = audioBuffer.toByteArray()
                            deferred.complete(if (result.isNotEmpty()) result else null)
                        }
                    }

                    override fun onFailure(webSocket: WebSocket, t: Throwable, response: Response?) {
                        val result = audioBuffer.toByteArray()
                        deferred.complete(if (result.isNotEmpty()) result else null)
                    }

                    override fun onClosed(webSocket: WebSocket, code: Int, reason: String) {
                        val result = audioBuffer.toByteArray()
                        deferred.complete(if (result.isNotEmpty()) result else null)
                    }
                }

                client.newWebSocket(request, listener)
                deferred.await()
            }
        } catch (e: Throwable) {
            Log.w(TAG, "Edge WebSocket synthesis exception: ${e.message}")
            null
        } finally {
            try {
                webSocketRef?.cancel()
            } catch (_: Throwable) {}
        }
    }

    private fun synthesizeViaCognitiveEdge(text: String, voiceName: String, pitch: String, rate: String): ByteArray? {
        return try {
            val cleanText = text.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;").replace("\"", "&quot;").replace("'", "&apos;")
            val lang = when {
                voiceName.startsWith("ru-") -> "ru-RU"
                voiceName.startsWith("ja-") -> "ja-JP"
                voiceName.startsWith("zh-") -> "zh-CN"
                voiceName.startsWith("de-") -> "de-DE"
                voiceName.startsWith("fr-") -> "fr-FR"
                voiceName.startsWith("es-") -> "es-ES"
                voiceName.startsWith("it-") -> "it-IT"
                else -> "en-US"
            }
            val ssml = "<speak version='1.0' xmlns='http://www.w3.org/2001/10/synthesis' xml:lang='$lang'>" +
                    "<voice name='$voiceName'>" +
                    "<prosody pitch='$pitch' rate='$rate'>$cleanText</prosody>" +
                    "</voice></speak>"

            val mediaType = "application/ssml+xml; charset=utf-8".toMediaTypeOrNull()
            val body = ssml.toRequestBody(mediaType)
            val request = Request.Builder()
                .url("https://eastus.tts.speech.microsoft.com/cognitiveservices/v1")
                .header("X-Microsoft-OutputFormat", "audio-24khz-48kbitrate-mono-mp3")
                .header("Content-Type", "application/ssml+xml")
                .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64)")
                .post(body)
                .build()

            val response = client.newCall(request).execute()
            if (response.isSuccessful && response.body != null) {
                response.body!!.bytes()
            } else {
                null
            }
        } catch (_: Throwable) {
            null
        }
    }

    private fun synthesizeViaFallback(text: String, voiceName: String): ByteArray? {
        return try {
            val lang = when {
                voiceName.startsWith("ru-") -> "ru"
                voiceName.startsWith("ja-") -> "ja"
                voiceName.startsWith("zh-") -> "zh"
                voiceName.startsWith("de-") -> "de"
                voiceName.startsWith("fr-") -> "fr"
                voiceName.startsWith("es-") -> "es"
                voiceName.startsWith("it-") -> "it"
                else -> "en"
            }
            val encoded = URLEncoder.encode(text.take(200), "UTF-8")
            val url = "https://translate.google.com/translate_tts?ie=UTF-8&client=tw-ob&tl=$lang&q=$encoded"
            val request = Request.Builder()
                .url(url)
                .header("User-Agent", "Mozilla/5.0 (Linux; Android 14; Mobile)")
                .build()
            val response = client.newCall(request).execute()
            if (response.isSuccessful && response.body != null) {
                response.body!!.bytes()
            } else null
        } catch (_: Throwable) {
            null
        }
    }
}

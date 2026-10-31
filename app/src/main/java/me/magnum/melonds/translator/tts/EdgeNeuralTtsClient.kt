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
import org.json.JSONObject
import java.io.ByteArrayOutputStream
import java.net.URLEncoder
import java.security.MessageDigest
import java.util.UUID
import java.util.concurrent.TimeUnit

/**
 * Studio-Grade Microsoft Edge Neural & Multilingual HD 24kHz TTS Engine.
 * Features:
 * - Direct 24kHz HD Edge Neural WebSocket streaming with Sec-MS-GEC token generation.
 * - Multi-Actor voice pool (native + multilingual neural voices) with automatic voice failover.
 * - Proper SSML <lang xml:lang='...'> tagging for multilingual voices.
 * - Dynamic SSML prosody contours (pitch, rate, volume, and emotional intonation contour).
 * - Optional OpenAI-compatible /v1/audio/speech neural endpoint fallback.
 * - High-speed chunked HTTPS audio fallback.
 * - 16 MB in-memory LRU audio cache for zero-latency studio dialogue playback.
 */
object EdgeNeuralTtsClient {
    private const val TAG = "EdgeNeuralTtsClient"
    private const val WSS_URL = "wss://speech.platform.bing.com/consumer/speech/synthesize/readaloud/edge/v1"
    private const val TRUSTED_TOKEN = "6A5AA1D4EAFF4E9FB37E23D68491D6F4"
    private const val WIN_EPOCH = 11644473600L

    // In-memory LRU cache: 16MB of compressed 24kHz MP3 studio audio
    private val audioCache = object : LruCache<String, ByteArray>(16 * 1024 * 1024) {
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
        volume: String = "default",
        contour: String = "",
        fallbackVoiceName: String? = null,
        targetLangHint: String = "ru",
        customAiKey: String = "",
        customAiEndpoint: String = ""
    ): ByteArray? {
        val clean = text.trim()
        if (clean.isBlank()) return null

        val cacheKey = "$voiceName|$pitch|$rate|$volume|$contour|$clean"
        synchronized(audioCache) {
            val cached = audioCache.get(cacheKey)
            if (cached != null) return cached
        }

        // 1. Primary: Edge Neural WebSocket Stream (24kHz HD Studio Quality) with requested actor
        var wsAudio = synthesizeViaWebSocket(clean, voiceName, pitch, rate, volume, contour, targetLangHint)
        // Retry once on reset / failure
        if (wsAudio == null || wsAudio.isEmpty()) {
            wsAudio = synthesizeViaWebSocket(clean, voiceName, pitch, rate, volume, contour, targetLangHint)
        }
        if (wsAudio != null && wsAudio.isNotEmpty()) {
            synchronized(audioCache) {
                audioCache.put(cacheKey, wsAudio)
            }
            return wsAudio
        }

        // 1b. Secondary Actor Failover: if a Multilingual voice was requested and failed, retry with native voice
        if (!fallbackVoiceName.isNullOrBlank() && fallbackVoiceName != voiceName) {
            val fallbackWsAudio = synthesizeViaWebSocket(clean, fallbackVoiceName, pitch, rate, volume, contour, targetLangHint)
            if (fallbackWsAudio != null && fallbackWsAudio.isNotEmpty()) {
                synchronized(audioCache) {
                    audioCache.put(cacheKey, fallbackWsAudio)
                }
                return fallbackWsAudio
            }
        }

        // 2. Secondary Endpoint: Optional OpenAI-compatible /v1/audio/speech if custom AI key is present
        if (customAiKey.isNotBlank()) {
            val openAiAudio = synthesizeViaOpenAiCompatible(clean, customAiKey, customAiEndpoint, voiceName)
            if (openAiAudio != null && openAiAudio.isNotEmpty()) {
                synchronized(audioCache) {
                    audioCache.put(cacheKey, openAiAudio)
                }
                return openAiAudio
            }
        }

        // 3. Tertiary: High-speed Chunked Neural Stream Fallback (Zero-Failure)
        val fallbackAudio = synthesizeViaFallback(clean, targetLangHint.ifBlank { voiceName })
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

    fun resolveVoiceLocale(voiceName: String): String {
        val parts = voiceName.split("-")
        if (parts.size >= 2 && parts[0].length == 2 && parts[1].length == 2) {
            return "${parts[0].lowercase()}-${parts[1].uppercase()}"
        }
        return when {
            voiceName.startsWith("ru-") -> "ru-RU"
            voiceName.startsWith("ja-") -> "ja-JP"
            voiceName.startsWith("zh-") -> "zh-CN"
            voiceName.startsWith("de-") -> "de-DE"
            voiceName.startsWith("fr-") -> "fr-FR"
            voiceName.startsWith("es-") -> "es-ES"
            voiceName.startsWith("it-") -> "it-IT"
            voiceName.startsWith("ko-") -> "ko-KR"
            voiceName.startsWith("uk-") -> "uk-UA"
            else -> "en-US"
        }
    }

    private fun resolveTargetLangTag(targetLangHint: String): String {
        val lower = targetLangHint.lowercase()
        return when {
            lower.startsWith("ru") -> "ru-RU"
            lower.startsWith("ja") -> "ja-JP"
            lower.startsWith("zh") -> "zh-CN"
            lower.startsWith("de") -> "de-DE"
            lower.startsWith("fr") -> "fr-FR"
            lower.startsWith("es") -> "es-ES"
            lower.startsWith("it") -> "it-IT"
            lower.startsWith("ko") -> "ko-KR"
            lower.startsWith("uk") -> "uk-UA"
            else -> "en-US"
        }
    }

    private fun escapeXml(text: String): String {
        return text
            .replace("&", "&amp;")
            .replace("<", "&lt;")
            .replace(">", "&gt;")
            .replace("\"", "&quot;")
            .replace("'", "&apos;")
    }

    private suspend fun synthesizeViaWebSocket(
        text: String,
        voiceName: String,
        pitch: String,
        rate: String,
        volume: String,
        contour: String,
        targetLangHint: String
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

                        val cleanText = escapeXml(text)
                        val voiceLocale = resolveVoiceLocale(voiceName)
                        val targetLangTag = resolveTargetLangTag(targetLangHint)
                        val isMultilingual = voiceName.contains("Multilingual", ignoreCase = true)

                        val speakLang = if (isMultilingual) voiceLocale else targetLangTag
                        val contourAttr = if (contour.isNotBlank()) " contour='$contour'" else ""

                        val innerContent = if (isMultilingual && targetLangTag != voiceLocale) {
                            "<lang xml:lang='$targetLangTag'>$cleanText</lang>"
                        } else {
                            cleanText
                        }

                        val ssml = "X-RequestId:$requestId\r\nX-Timestamp:$timestamp\r\nContent-Type:application/ssml+xml\r\nPath:ssml\r\n\r\n" +
                                "<speak version='1.0' xmlns='http://www.w3.org/2001/10/synthesis' xmlns:mstts='https://www.w3.org/2001/mstts' xml:lang='$speakLang'>" +
                                "<voice name='$voiceName'>" +
                                "<prosody pitch='$pitch' rate='$rate' volume='$volume'$contourAttr>$innerContent</prosody>" +
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

    private fun synthesizeViaOpenAiCompatible(
        text: String,
        apiKey: String,
        endpoint: String,
        voiceName: String
    ): ByteArray? {
        return try {
            val targetUrl = if (endpoint.contains("/v1/")) {
                endpoint.substringBefore("/v1/") + "/v1/audio/speech"
            } else {
                "https://api.openai.com/v1/audio/speech"
            }
            val openAiVoice = when {
                voiceName.contains("Svetlana", true) || voiceName.contains("Ava", true) -> "nova"
                voiceName.contains("Emma", true) || voiceName.contains("Vivienne", true) -> "shimmer"
                voiceName.contains("Brian", true) -> "fable"
                voiceName.contains("Florian", true) -> "onyx"
                else -> "alloy"
            }
            val json = JSONObject().apply {
                put("model", "tts-1")
                put("input", text)
                put("voice", openAiVoice)
                put("response_format", "mp3")
            }
            val mediaType = "application/json; charset=utf-8".toMediaTypeOrNull()
            val body = json.toString().toRequestBody(mediaType)
            val request = Request.Builder()
                .url(targetUrl)
                .header("Authorization", "Bearer $apiKey")
                .header("Content-Type", "application/json")
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

    private fun synthesizeViaFallback(text: String, langOrVoice: String): ByteArray? {
        return try {
            val lower = langOrVoice.lowercase()
            val lang = when {
                lower.startsWith("ru") -> "ru"
                lower.startsWith("ja") -> "ja"
                lower.startsWith("zh") -> "zh"
                lower.startsWith("de") -> "de"
                lower.startsWith("fr") -> "fr"
                lower.startsWith("es") -> "es"
                lower.startsWith("it") -> "it"
                lower.startsWith("ko") -> "ko"
                lower.startsWith("uk") -> "uk"
                else -> "en"
            }
            val clean = text.trim()
            if (clean.length <= 180) {
                val encoded = URLEncoder.encode(clean, "UTF-8")
                val url = "https://translate.google.com/translate_tts?ie=UTF-8&client=tw-ob&tl=$lang&q=$encoded"
                val request = Request.Builder()
                    .url(url)
                    .header("User-Agent", "Mozilla/5.0 (Linux; Android 14; Mobile; rv:130.0) Gecko/130.0 Firefox/130.0")
                    .build()
                val response = client.newCall(request).execute()
                if (response.isSuccessful && response.body != null) {
                    return response.body!!.bytes()
                }
            } else {
                val chunks = clean.chunked(150)
                val out = ByteArrayOutputStream()
                for (chunk in chunks) {
                    val encoded = URLEncoder.encode(chunk, "UTF-8")
                    val url = "https://translate.google.com/translate_tts?ie=UTF-8&client=tw-ob&tl=$lang&q=$encoded"
                    val request = Request.Builder()
                        .url(url)
                        .header("User-Agent", "Mozilla/5.0 (Linux; Android 14; Mobile; rv:130.0) Gecko/130.0 Firefox/130.0")
                        .build()
                    val response = client.newCall(request).execute()
                    if (response.isSuccessful && response.body != null) {
                        out.write(response.body!!.bytes())
                    }
                }
                if (out.size() > 0) return out.toByteArray()
            }
            null
        } catch (_: Throwable) {
            null
        }
    }
}

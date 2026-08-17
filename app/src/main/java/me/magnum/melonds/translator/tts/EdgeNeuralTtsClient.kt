package me.magnum.melonds.translator.tts

import android.util.Log
import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.withTimeoutOrNull
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import okhttp3.WebSocket
import okhttp3.WebSocketListener
import okio.ByteString
import java.io.ByteArrayOutputStream
import java.util.UUID
import java.util.concurrent.TimeUnit

/**
 * High-definition Microsoft Edge Neural TTS Client.
 * Connects directly via WebSocket to stream studio-quality 24kHz multi-voice neural speech.
 */
object EdgeNeuralTtsClient {
    private const val TAG = "EdgeNeuralTtsClient"
    private const val WSS_URL = "wss://speech.platform.bing.com/consumer/speech/synthesize/readaloud/edge/v1"
    private const val TRUSTED_TOKEN = "6A5AA1D4EAFF4E9FB37E23D68491D6F4"

    private val client = OkHttpClient.Builder()
        .connectTimeout(5, TimeUnit.SECONDS)
        .readTimeout(8, TimeUnit.SECONDS)
        .build()

    suspend fun synthesize(
        text: String,
        voiceName: String,
        pitch: String = "default",
        rate: String = "default",
        volume: String = "default"
    ): ByteArray? {
        return withTimeoutOrNull(6500) {
            val deferred = CompletableDeferred<ByteArray?>()
            val audioBuffer = ByteArrayOutputStream()
            val connectionId = UUID.randomUUID().toString().replace("-", "")
            val requestId = UUID.randomUUID().toString().replace("-", "")

            val request = Request.Builder()
                .url("$WSS_URL?TrustedClientToken=$TRUSTED_TOKEN&ConnectionId=$connectionId")
                .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36 Edg/128.0.0.0")
                .header("Origin", "chrome-extension://jdiccldimpdaibmpdkjnbmckianbfold")
                .build()

            val listener = object : WebSocketListener() {
                override fun onOpen(webSocket: WebSocket, response: Response) {
                    val configMsg = "Content-Type:application/json;charset=utf-8\r\nPath:speech.config\r\n\r\n" +
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
                        else -> "en-US"
                    }
                    val ssml = "X-RequestId:$requestId\r\nContent-Type:application/ssml+xml\r\nPath:ssml\r\n\r\n" +
                            "<speak version='1.0' xmlns='http://www.w3.org/2001/10/synthesis' xml:lang='$lang'>" +
                            "<voice name='$voiceName'>" +
                            "<prosody pitch='$pitch' rate='$rate' volume='$volume'>$cleanText</prosody>" +
                            "</voice></speak>"
                    webSocket.send(ssml)
                }

                override fun onMessage(webSocket: WebSocket, bytes: ByteString) {
                    try {
                        val buffer = bytes.asByteBuffer()
                        if (buffer.remaining() > 2) {
                            val headerLength = buffer.short.toInt()
                            if (headerLength in 0 until (bytes.size - 2)) {
                                val audioPayload = bytes.substring(2 + headerLength)
                                audioBuffer.write(audioPayload.toByteArray())
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
                        if (result.isNotEmpty()) {
                            deferred.complete(result)
                        } else {
                            deferred.complete(null)
                        }
                    }
                }

                override fun onFailure(webSocket: WebSocket, t: Throwable, response: Response?) {
                    Log.w(TAG, "Edge TTS WebSocket error: ${t.message}")
                    val result = audioBuffer.toByteArray()
                    if (result.isNotEmpty()) {
                        deferred.complete(result)
                    } else {
                        deferred.complete(null)
                    }
                }

                override fun onClosed(webSocket: WebSocket, code: Int, reason: String) {
                    val result = audioBuffer.toByteArray()
                    deferred.complete(if (result.isNotEmpty()) result else null)
                }
            }

            client.newWebSocket(request, listener)
            deferred.await()
        }
    }
}

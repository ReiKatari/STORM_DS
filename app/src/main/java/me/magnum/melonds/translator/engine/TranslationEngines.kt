package me.magnum.melonds.translator.engine

import android.content.Context
import android.widget.Toast
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import org.json.JSONArray
import org.json.JSONObject
import org.json.JSONTokener
import java.net.URLEncoder

interface ITranslationEngine {
    suspend fun translate(text: String, sourceLang: String, targetLang: String): String
}

/**
 * High-speed, robust Google Translate Engine.
 * Dual-tier Google infrastructure:
 * Tier 1: Google Clients5 Chrome-Extension API (Instant, unthrottled)
 * Tier 2: Google AndroidTranslate Client (client=at, dedicated mobile endpoint)
 */
class GoogleTranslateEngine(
    private val client: OkHttpClient,
    private val fallbackOffline: ITranslationEngine? = null
) : ITranslationEngine {

    override suspend fun translate(text: String, sourceLang: String, targetLang: String): String = withContext(Dispatchers.IO) {
        val clean = text.trim()
        if (clean.isBlank()) return@withContext text

        // If text contains only digits, punctuation, or symbols (e.g., "100/100", "???", "1P"), no translation needed
        if (clean.all { !it.isLetter() }) {
            return@withContext clean
        }

        val sl = when (sourceLang.lowercase().trim()) {
            "", "auto" -> "auto"
            "ja", "japanese" -> "ja"
            "en", "english" -> "en"
            "zh", "chinese" -> "zh"
            "ko", "korean" -> "ko"
            "de", "german" -> "de"
            "fr", "french" -> "fr"
            "es", "spanish" -> "es"
            "it", "italian" -> "it"
            else -> sourceLang.lowercase().take(5)
        }
        val tl = targetLang.lowercase().ifBlank { "ru" }

        // If text is already in Russian and target is Russian, avoid redundant translation
        val hasCyrillic = clean.any { it in '\u0400'..'\u04FF' }
        if (hasCyrillic && (sl == "ru" || tl == "ru")) {
            return@withContext clean
        }

        val encodedText = try {
            URLEncoder.encode(clean, "UTF-8").replace("+", "%20")
        } catch (_: Throwable) {
            clean
        }

        // Tier 1: Clients5 Chrome Extension API (instant, high speed)
        try {
            val url = "https://clients5.google.com/translate_a/t?client=dict-chrome-ex&sl=$sl&tl=$tl&q=$encodedText"
            val request = Request.Builder()
                .url(url)
                .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36")
                .header("Accept", "*/*")
                .build()

            client.newCall(request).execute().use { response ->
                if (response.isSuccessful) {
                    val body = response.body?.string().orEmpty()
                    val parsed = parseGoogleResponse(body)
                    if (parsed.isNotBlank() && !parsed.equals(clean, ignoreCase = true)) {
                        return@withContext parsed
                    }
                }
            }
        } catch (_: Throwable) {}

        // Tier 2: Google translate.googleapis.com (client=gtx - universally available web API)
        try {
            val url = "https://translate.googleapis.com/translate_a/single?client=gtx&sl=$sl&tl=$tl&dt=t&q=$encodedText"
            val request = Request.Builder()
                .url(url)
                .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36")
                .header("Accept", "*/*")
                .build()

            client.newCall(request).execute().use { response ->
                if (response.isSuccessful) {
                    val body = response.body?.string().orEmpty()
                    val parsed = parseGoogleResponse(body)
                    if (parsed.isNotBlank() && !parsed.equals(clean, ignoreCase = true)) {
                        return@withContext parsed
                    }
                }
            }
        } catch (_: Throwable) {}

        // Tier 3: Google AndroidTranslate Client (client=at)
        try {
            val url = "https://translate.google.com/translate_a/single?client=at&sl=$sl&tl=$tl&dt=t&q=$encodedText"
            val request = Request.Builder()
                .url(url)
                .header("User-Agent", "AndroidTranslate/6.20.0.RC04.379010047")
                .header("Accept", "*/*")
                .build()

            client.newCall(request).execute().use { response ->
                if (response.isSuccessful) {
                    val body = response.body?.string().orEmpty()
                    val parsed = parseGoogleResponse(body)
                    if (parsed.isNotBlank() && !parsed.equals(clean, ignoreCase = true)) {
                        return@withContext parsed
                    }
                }
            }
        } catch (_: Throwable) {}

        // Offline Fallback: If online calls fail or network drops, seamlessly fall back to on-device ML Kit
        if (fallbackOffline != null) {
            try {
                val offlineResult = fallbackOffline.translate(clean, sourceLang, targetLang)
                if (offlineResult.isNotBlank() && !offlineResult.equals(clean, ignoreCase = true)) {
                    return@withContext offlineResult
                }
            } catch (_: Throwable) {}
        }

        clean
    }

    private fun parseGoogleResponse(body: String): String {
        val trimmed = body.trim()
        if (trimmed.isEmpty()) return ""
        return try {
            val root = JSONTokener(trimmed).nextValue()
            when (root) {
                is String -> root.trim()
                is JSONArray -> extractFromArray(root).trim()
                else -> ""
            }
        } catch (_: Throwable) {
            ""
        }
    }

    private fun extractFromArray(arr: JSONArray): String {
        val sb = StringBuilder()
        for (i in 0 until arr.length()) {
            val item = arr.opt(i) ?: continue
            when (item) {
                is String -> {
                    // 1D format: ["translatedText", "en"]
                    if (i == 0) sb.append(item)
                    break
                }
                is JSONArray -> {
                    val first = item.opt(0)
                    when (first) {
                        is String -> {
                            // 2D format: [["translatedText", "en"]]
                            if (first.isNotBlank()) sb.append(first)
                        }
                        is JSONArray -> {
                            // 3D format: [[["sentence 1", "orig 1", ...], ["sentence 2", ...]], null, "en"]
                            for (s in 0 until item.length()) {
                                val sentence = item.optJSONArray(s)
                                val transPart = sentence?.optString(0)
                                if (!transPart.isNullOrBlank()) {
                                    sb.append(transPart)
                                }
                            }
                            break
                        }
                    }
                }
            }
        }
        return sb.toString()
    }
}

/**
 * DeepL Neural Translation Engine (Official DeepL API with free and pro support).
 * Requires API key in preferences; warns user if key is missing.
 */
class DeepLEngine(
    private val client: OkHttpClient,
    private val context: Context? = null,
    private val apiKeyProvider: () -> String
) : ITranslationEngine {

    override suspend fun translate(text: String, sourceLang: String, targetLang: String): String = withContext(Dispatchers.IO) {
        val clean = text.trim()
        if (clean.isBlank()) return@withContext text

        val apiKey = apiKeyProvider().trim()
        if (apiKey.isEmpty()) {
            withContext(Dispatchers.Main) {
                context?.let {
                    Toast.makeText(it, "DeepL: укажите ключ API в настройках", Toast.LENGTH_SHORT).show()
                }
            }
            return@withContext "DeepL: укажите ключ API в настройках"
        }

        val isFreeApi = apiKey.endsWith(":fx")
        val endpoint = if (isFreeApi) "https://api-free.deepl.com/v2/translate" else "https://api.deepl.com/v2/translate"

        val json = JSONObject().apply {
            put("text", JSONArray().put(clean))
            put("target_lang", targetLang.uppercase())
            if (sourceLang != "auto" && sourceLang.isNotBlank()) {
                put("source_lang", sourceLang.uppercase())
            }
        }

        val requestBody = json.toString().toRequestBody("application/json".toMediaType())
        val request = Request.Builder()
            .url(endpoint)
            .header("Authorization", "DeepL-Auth-Key $apiKey")
            .post(requestBody)
            .build()

        try {
            client.newCall(request).execute().use { response ->
                if (!response.isSuccessful) {
                    val code = response.code
                    return@withContext "DeepL: ошибка $code"
                }
                val responseBody = response.body?.string() ?: return@withContext clean
                val root = JSONObject(responseBody)
                val translations = root.optJSONArray("translations")
                val translated = translations?.optJSONObject(0)?.optString("text")
                if (!translated.isNullOrBlank()) translated else clean
            }
        } catch (t: Throwable) {
            "DeepL: ${t.message ?: "ошибка сети"}"
        }
    }
}

/**
 * Custom AI Translation Engine (OpenAI / Claude / DeepSeek via OpenAI-compatible endpoint).
 * Requires API key in preferences; warns user if key is missing.
 */
class CustomAiEngine(
    private val client: OkHttpClient,
    private val context: Context? = null,
    private val apiKeyProvider: () -> String,
    private val endpointProvider: () -> String = { "https://api.openai.com/v1/chat/completions" },
    private val modelProvider: () -> String = { "gpt-4o-mini" }
) : ITranslationEngine {

    override suspend fun translate(text: String, sourceLang: String, targetLang: String): String = withContext(Dispatchers.IO) {
        val clean = text.trim()
        if (clean.isBlank()) return@withContext text

        val apiKey = apiKeyProvider().trim()
        if (apiKey.isEmpty()) {
            withContext(Dispatchers.Main) {
                context?.let {
                    Toast.makeText(it, "Custom AI: укажите ключ API в настройках", Toast.LENGTH_SHORT).show()
                }
            }
            return@withContext "Custom AI: укажите ключ API в настройках"
        }

        val endpoint = endpointProvider().ifBlank { "https://api.openai.com/v1/chat/completions" }
        val model = modelProvider().ifBlank { "gpt-4o-mini" }

        val systemPrompt = "You are a professional video game localization expert. Translate the provided in-game dialogue/UI text accurately into natural, immersive $targetLang. Output ONLY the translated text without notes, explanations, or quotes."

        val json = JSONObject().apply {
            put("model", model)
            put("messages", JSONArray().apply {
                put(JSONObject().apply {
                    put("role", "system")
                    put("content", systemPrompt)
                })
                put(JSONObject().apply {
                    put("role", "user")
                    put("content", clean)
                })
            })
            put("temperature", 0.3)
        }

        val requestBody = json.toString().toRequestBody("application/json".toMediaType())
        val request = Request.Builder()
            .url(endpoint)
            .header("Authorization", "Bearer $apiKey")
            .post(requestBody)
            .build()

        try {
            client.newCall(request).execute().use { response ->
                if (!response.isSuccessful) {
                    val code = response.code
                    return@withContext "AI: ошибка $code"
                }
                val responseBody = response.body?.string() ?: return@withContext clean
                val root = JSONObject(responseBody)
                val choices = root.optJSONArray("choices")
                val message = choices?.optJSONObject(0)?.optJSONObject("message")
                val content = message?.optString("content")?.trim()
                if (!content.isNullOrBlank()) content else clean
            }
        } catch (t: Throwable) {
            "AI: ${t.message ?: "ошибка сети"}"
        }
    }
}

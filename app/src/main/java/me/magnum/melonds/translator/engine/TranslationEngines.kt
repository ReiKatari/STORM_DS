package me.magnum.melonds.translator.engine

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.FormBody
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import org.json.JSONArray
import org.json.JSONObject
import java.net.URLEncoder

interface ITranslationEngine {
    suspend fun translate(text: String, sourceLang: String, targetLang: String): String
}

/**
 * Ultra-fast, highly accurate Google Translate Engine.
 * Multi-tier pipeline:
 * Tier 1: Google Clients5 Chrome-Extension API (Instant, no rate-limits, returns direct translation)
 * Tier 2: Google Translate API (Single endpoint via HTTP POST to avoid length/query issues)
 * Tier 3: MyMemory fallback if Google is unreachable or blocked
 */
class GoogleTranslateEngine(private val client: OkHttpClient) : ITranslationEngine {

    override suspend fun translate(text: String, sourceLang: String, targetLang: String): String = withContext(Dispatchers.IO) {
        val clean = text.trim()
        if (clean.isBlank()) return@withContext text

        val sl = if (sourceLang.isBlank()) "auto" else sourceLang
        val tl = targetLang.ifBlank { "ru" }

        // Tier 1: Clients5 Chrome-Extension endpoint
        try {
            val encodedText = URLEncoder.encode(clean, "UTF-8").replace("+", "%20")
            val url = "https://clients5.google.com/translate_a/t?client=dict-chrome-ex&sl=$sl&tl=$tl&q=$encodedText"
            val request = Request.Builder()
                .url(url)
                .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Safari/537.36")
                .header("Accept", "*/*")
                .build()

            client.newCall(request).execute().use { response ->
                if (response.isSuccessful) {
                    val body = response.body?.string().orEmpty()
                    val parsed = parseClients5Response(body)
                    if (parsed.isNotBlank() && !parsed.equals(clean, ignoreCase = true)) {
                        return@withContext parsed
                    }
                }
            }
        } catch (_: Throwable) {}

        // Tier 2: translate.googleapis.com via HTTP POST (bypasses GET captchas)
        try {
            val formBody = FormBody.Builder()
                .add("client", "gtx")
                .add("sl", sl)
                .add("tl", tl)
                .add("dt", "t")
                .add("q", clean)
                .build()

            val request = Request.Builder()
                .url("https://translate.googleapis.com/translate_a/single")
                .header("User-Agent", "Mozilla/5.0 (Linux; Android 14; Mobile) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Mobile Safari/537.36")
                .post(formBody)
                .build()

            client.newCall(request).execute().use { response ->
                if (response.isSuccessful) {
                    val body = response.body?.string().orEmpty()
                    val parsed = parseGoogleSingleResponse(body)
                    if (parsed.isNotBlank() && !parsed.equals(clean, ignoreCase = true)) {
                        return@withContext parsed
                    }
                }
            }
        } catch (_: Throwable) {}

        // Tier 3: Seamless MyMemory fallback
        try {
            val myMemoryResult = MyMemoryEngine(client).translate(clean, sl, tl)
            if (myMemoryResult.isNotBlank() && !myMemoryResult.equals(clean, ignoreCase = true)) {
                return@withContext myMemoryResult
            }
        } catch (_: Throwable) {}

        clean
    }

    private fun parseClients5Response(body: String): String {
        val trimmed = body.trim()
        if (!trimmed.startsWith("[")) return ""
        return try {
            val jsonArray = JSONArray(trimmed)
            val sb = StringBuilder()
            for (i in 0 until jsonArray.length()) {
                val item = jsonArray.opt(i)
                when (item) {
                    is JSONArray -> {
                        val part = item.optString(0)
                        if (part.isNotBlank()) sb.append(part)
                    }
                    is String -> {
                        if (item.isNotBlank()) sb.append(item)
                    }
                }
            }
            sb.toString().trim()
        } catch (_: Throwable) {
            ""
        }
    }

    private fun parseGoogleSingleResponse(body: String): String {
        val trimmed = body.trim()
        if (!trimmed.startsWith("[")) return ""
        return try {
            val jsonArray = JSONArray(trimmed)
            val sentences = jsonArray.optJSONArray(0) ?: return ""
            val sb = StringBuilder()
            for (i in 0 until sentences.length()) {
                val sentence = sentences.optJSONArray(i)
                val part = sentence?.optString(0)
                if (!part.isNullOrEmpty()) {
                    sb.append(part)
                }
            }
            sb.toString().trim()
        } catch (_: Throwable) {
            ""
        }
    }
}

/**
 * MyMemory Translated Engine - International Translation Memory database.
 */
class MyMemoryEngine(private val client: OkHttpClient) : ITranslationEngine {

    override suspend fun translate(text: String, sourceLang: String, targetLang: String): String = withContext(Dispatchers.IO) {
        val clean = text.trim()
        if (clean.isBlank()) return@withContext text

        val sl = if (sourceLang == "auto" || sourceLang.isBlank()) {
            detectLanguage(clean)
        } else {
            sourceLang
        }
        val tl = targetLang.ifBlank { "ru" }
        val langPair = "$sl|$tl"
        val encodedText = URLEncoder.encode(clean, "UTF-8").replace("+", "%20")
        val url = "https://api.mymemory.translated.net/get?q=$encodedText&langpair=$langPair"

        val request = Request.Builder()
            .url(url)
            .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36")
            .build()

        try {
            client.newCall(request).execute().use { response ->
                if (!response.isSuccessful) return@withContext clean
                val responseBody = response.body?.string() ?: return@withContext clean
                val root = JSONObject(responseBody)
                val responseData = root.optJSONObject("responseData")
                val result = responseData?.optString("translatedText") ?: clean
                val unescaped = result.replace("+", " ").trim()
                if (unescaped.isNotBlank()) unescaped else clean
            }
        } catch (_: Throwable) {
            clean
        }
    }

    private fun detectLanguage(text: String): String {
        val hasJapanese = text.any { it in '\u3040'..'\u309F' || it in '\u30A0'..'\u30FF' || it in '\u4E00'..'\u9FAF' }
        if (hasJapanese) return "ja"
        val hasCyrillic = text.any { it in '\u0400'..'\u04FF' }
        if (hasCyrillic) return "ru"
        return "en"
    }
}

/**
 * DeepL Neural Translation Engine (Official DeepL API with free and pro support).
 * Falls back to GoogleTranslateEngine if key is missing or invalid.
 */
class DeepLEngine(
    private val client: OkHttpClient,
    private val apiKeyProvider: () -> String
) : ITranslationEngine {

    private val fallbackEngine by lazy { GoogleTranslateEngine(client) }

    override suspend fun translate(text: String, sourceLang: String, targetLang: String): String = withContext(Dispatchers.IO) {
        val clean = text.trim()
        if (clean.isBlank()) return@withContext text

        val apiKey = apiKeyProvider().trim()
        if (apiKey.isEmpty()) {
            return@withContext fallbackEngine.translate(clean, sourceLang, targetLang)
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
                    return@withContext fallbackEngine.translate(clean, sourceLang, targetLang)
                }
                val responseBody = response.body?.string() ?: return@withContext fallbackEngine.translate(clean, sourceLang, targetLang)
                val root = JSONObject(responseBody)
                val translations = root.optJSONArray("translations")
                val translated = translations?.optJSONObject(0)?.optString("text")
                if (!translated.isNullOrBlank()) translated else fallbackEngine.translate(clean, sourceLang, targetLang)
            }
        } catch (_: Throwable) {
            fallbackEngine.translate(clean, sourceLang, targetLang)
        }
    }
}

/**
 * Custom AI Translation Engine (OpenAI / Claude / DeepSeek / Local LLM via OpenAI-compatible endpoint).
 * Falls back to GoogleTranslateEngine if key is missing or request fails.
 */
class CustomAiEngine(
    private val client: OkHttpClient,
    private val apiKeyProvider: () -> String,
    private val endpointProvider: () -> String = { "https://api.openai.com/v1/chat/completions" },
    private val modelProvider: () -> String = { "gpt-4o-mini" }
) : ITranslationEngine {

    private val fallbackEngine by lazy { GoogleTranslateEngine(client) }

    override suspend fun translate(text: String, sourceLang: String, targetLang: String): String = withContext(Dispatchers.IO) {
        val clean = text.trim()
        if (clean.isBlank()) return@withContext text

        val apiKey = apiKeyProvider().trim()
        if (apiKey.isEmpty()) {
            return@withContext fallbackEngine.translate(clean, sourceLang, targetLang)
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
                    return@withContext fallbackEngine.translate(clean, sourceLang, targetLang)
                }
                val responseBody = response.body?.string() ?: return@withContext fallbackEngine.translate(clean, sourceLang, targetLang)
                val root = JSONObject(responseBody)
                val choices = root.optJSONArray("choices")
                val message = choices?.optJSONObject(0)?.optJSONObject("message")
                val content = message?.optString("content")?.trim()
                if (!content.isNullOrBlank()) content else fallbackEngine.translate(clean, sourceLang, targetLang)
            }
        } catch (_: Throwable) {
            fallbackEngine.translate(clean, sourceLang, targetLang)
        }
    }
}

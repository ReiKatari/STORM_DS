package me.magnum.melonds.translator.model

enum class TranslatorEngineType(val preferenceValue: String, val displayName: String) {
    GOOGLE("google", "Google Translate (Бесплатно / Не требует ключа)"),
    DEEPL("deepl", "DeepL Neural API"),
    LIBRE("libre", "LibreTranslate (Open-Source)"),
    MYMEMORY("mymemory", "MyMemory Translated"),
    CUSTOM_AI("custom_ai", "Custom AI (Gemini / OpenAI / Claude)");

    companion object {
        fun fromPreference(value: String?): TranslatorEngineType {
            return entries.firstOrNull { it.preferenceValue == value } ?: GOOGLE
        }
    }
}

enum class TranslatorTriggerMode(val preferenceValue: String) {
    ON_DEMAND("on_demand"),
    AUTO_SCREEN_CHANGE("auto_screen_change");

    companion object {
        fun fromPreference(value: String?): TranslatorTriggerMode {
            return entries.firstOrNull { it.preferenceValue == value } ?: ON_DEMAND
        }
    }
}

enum class TranslatorOverlayStyle(val preferenceValue: String) {
    SMART_BACKGROUND_MATCH("smart_background_match"),
    SEMI_TRANSPARENT("semi_transparent"),
    TRANSLUCENT_BUBBLE("translucent_bubble"),
    OUTLINE_ONLY("outline_only");

    companion object {
        fun fromPreference(value: String?): TranslatorOverlayStyle {
            return entries.firstOrNull { it.preferenceValue == value } ?: SMART_BACKGROUND_MATCH
        }
    }
}

data class TranslatedTextBlock(
    val originalText: String,
    var translatedText: String,
    val boundingBox: android.graphics.RectF,
    val backgroundColor: Int,
    val textColor: Int,
    var isShowingOriginal: Boolean = false,
)

data class TranslationRegion(
    val id: String = java.util.UUID.randomUUID().toString(),
    var rect: android.graphics.RectF, // Relative coordinates 0.0f..1.0f
    var name: String = "",
) {
    fun toJson(): org.json.JSONObject {
        return org.json.JSONObject().apply {
            put("id", id)
            put("left", rect.left.toDouble())
            put("top", rect.top.toDouble())
            put("right", rect.right.toDouble())
            put("bottom", rect.bottom.toDouble())
            put("name", name)
        }
    }

    companion object {
        fun fromJson(json: org.json.JSONObject): TranslationRegion? {
            return runCatching {
                val id = json.optString("id", java.util.UUID.randomUUID().toString())
                val left = json.getDouble("left").toFloat().coerceIn(0f, 1f)
                val top = json.getDouble("top").toFloat().coerceIn(0f, 1f)
                val right = json.getDouble("right").toFloat().coerceIn(0f, 1f)
                val bottom = json.getDouble("bottom").toFloat().coerceIn(0f, 1f)
                val name = json.optString("name", "")
                TranslationRegion(id, android.graphics.RectF(left, top, right, bottom), name)
            }.getOrNull()
        }

        fun listToJson(regions: List<TranslationRegion>): String {
            val arr = org.json.JSONArray()
            for (r in regions) {
                arr.put(r.toJson())
            }
            return arr.toString()
        }

        fun listFromJson(jsonStr: String?): List<TranslationRegion> {
            if (jsonStr.isNullOrBlank()) return emptyList()
            return runCatching {
                val arr = org.json.JSONArray(jsonStr)
                val list = mutableListOf<TranslationRegion>()
                for (i in 0 until arr.length()) {
                    val obj = arr.optJSONObject(i) ?: continue
                    fromJson(obj)?.let { list.add(it) }
                }
                list
            }.getOrDefault(emptyList())
        }
    }
}


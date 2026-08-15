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

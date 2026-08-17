package me.magnum.melonds.translator.tts

import android.content.Context
import android.content.SharedPreferences
import android.speech.tts.TextToSpeech
import android.speech.tts.Voice
import android.util.Log
import androidx.preference.PreferenceManager
import java.util.Locale

class GameTtsManager(private val context: Context) {

    companion object {
        private const val TAG = "GameTtsManager"
        const val PREF_TRANSLATOR_TTS_LANG = "translator_tts_lang"
        const val PREF_TRANSLATOR_TTS_MULTI_VOICE = "translator_tts_multi_voice"
        const val PREF_TRANSLATOR_TTS_SPEED = "translator_tts_speed"

        private val FEMALE_KEYWORDS = setOf(
            "майя", "мия", "перл", "зельда", "пич", "дэйзи", "розалина", "эмма", "люси", "айрис",
            "каллисто", "франциска", "девушка", "женщина", "девочка", "принцесса", "королева",
            "мать", "сестра", "maya", "mia", "pearl", "zelda", "peach", "daisy", "rosalina",
            "franziska", "kay", "iris", "trucy", "athena", "girl", "woman", "princess", "queen"
        )

        private val ELDER_OR_DEEP_KEYWORDS = setOf(
            "судья", "дед", "старик", "босс", "детектив", "гамшу", "вон карма", "король", "монстр",
            "дракон", "judge", "elder", "detective", "gumshoe", "von karma", "gant", "king", "boss"
        )

        private val YOUNG_OR_FAIRY_KEYWORDS = setOf(
            "фея", "малыш", "ребенок", "нави", "татл", "пикачу", "fairy", "navi", "child", "kid"
        )
    }

    enum class CharacterPersona {
        MALE,
        FEMALE,
        ELDER_DEEP,
        YOUNG_FAIRY,
        NARRATOR
    }

    private val preferences: SharedPreferences = PreferenceManager.getDefaultSharedPreferences(context)
    private var tts: TextToSpeech? = null
    private var isReady = false
    private var availableVoices: List<Voice> = emptyList()

    init {
        initTts()
    }

    private fun initTts() {
        if (tts != null) return
        tts = TextToSpeech(context.applicationContext) { status ->
            if (status == TextToSpeech.SUCCESS) {
                isReady = true
                applyLanguage(getSelectedLanguage())
                try {
                    availableVoices = tts?.voices?.toList() ?: emptyList()
                    Log.i(TAG, "TTS initialized successfully. Available voices count: ${availableVoices.size}")
                } catch (e: Throwable) {
                    Log.w(TAG, "Cannot query voices: ${e.message}")
                }
            } else {
                Log.w(TAG, "TextToSpeech init failed with code: $status")
            }
        }
    }

    private fun getSelectedLanguage(): Locale {
        val langCode = preferences.getString(PREF_TRANSLATOR_TTS_LANG, "ru") ?: "ru"
        return when (langCode) {
            "en" -> Locale.ENGLISH
            "ja" -> Locale.JAPANESE
            "zh" -> Locale.CHINESE
            "de" -> Locale.GERMAN
            "fr" -> Locale.FRENCH
            "es" -> Locale("es")
            "it" -> Locale.ITALIAN
            "ko" -> Locale.KOREAN
            "uk" -> Locale("uk")
            else -> Locale("ru")
        }
    }

    private fun applyLanguage(locale: Locale) {
        val result = tts?.setLanguage(locale)
        if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
            Log.w(TAG, "Language $locale not supported by engine, falling back to default")
            tts?.language = Locale.getDefault()
        }
    }

    fun speak(text: String, targetLang: String = "ru") {
        if (text.isBlank()) return
        if (tts == null || !isReady) {
            initTts()
            return
        }

        val langPref = preferences.getString(PREF_TRANSLATOR_TTS_LANG, "auto") ?: "auto"
        val locale = if (langPref == "auto") {
            when (targetLang.lowercase()) {
                "en" -> Locale.ENGLISH
                "ja" -> Locale.JAPANESE
                "zh" -> Locale.CHINESE
                "de" -> Locale.GERMAN
                "fr" -> Locale.FRENCH
                "es" -> Locale("es")
                "it" -> Locale.ITALIAN
                "ko" -> Locale.KOREAN
                "uk" -> Locale("uk")
                else -> Locale("ru")
            }
        } else {
            getSelectedLanguage()
        }
        applyLanguage(locale)

        val multiVoiceEnabled = preferences.getBoolean(PREF_TRANSLATOR_TTS_MULTI_VOICE, true)
        val baseSpeed = (preferences.getInt(PREF_TRANSLATOR_TTS_SPEED, 100) / 100f).coerceIn(0.6f, 1.8f)

        if (multiVoiceEnabled) {
            val lines = text.split("\n", ". ")
            for (line in lines) {
                val trimmed = line.trim()
                if (trimmed.isEmpty()) continue
                val persona = detectPersona(trimmed)
                applyPersonaVoice(persona, baseSpeed, locale)
                tts?.speak(trimmed, TextToSpeech.QUEUE_ADD, null, "game_tts_${System.currentTimeMillis()}")
            }
        } else {
            tts?.setPitch(1.0f)
            tts?.setSpeechRate(baseSpeed)
            tts?.speak(text, TextToSpeech.QUEUE_FLUSH, null, "game_tts_single")
        }
    }

    private fun detectPersona(text: String): CharacterPersona {
        val lower = text.lowercase()
        val speaker = if (lower.contains(":")) lower.substringBefore(":").trim() else ""

        // Check speaker name keywords
        if (speaker.isNotEmpty()) {
            if (FEMALE_KEYWORDS.any { speaker.contains(it) }) return CharacterPersona.FEMALE
            if (ELDER_OR_DEEP_KEYWORDS.any { speaker.contains(it) }) return CharacterPersona.ELDER_DEEP
            if (YOUNG_OR_FAIRY_KEYWORDS.any { speaker.contains(it) }) return CharacterPersona.YOUNG_FAIRY
            return CharacterPersona.MALE
        }

        // Check text content keywords and verb inflections in Russian
        if (FEMALE_KEYWORDS.any { lower.contains(it) }) return CharacterPersona.FEMALE
        if (ELDER_OR_DEEP_KEYWORDS.any { lower.contains(it) }) return CharacterPersona.ELDER_DEEP
        if (YOUNG_OR_FAIRY_KEYWORDS.any { lower.contains(it) }) return CharacterPersona.YOUNG_FAIRY

        // Check question/exclamation emotional cues
        if (text.contains("!")) {
            return CharacterPersona.MALE
        }

        return CharacterPersona.NARRATOR
    }

    private fun applyPersonaVoice(persona: CharacterPersona, baseSpeed: Float, locale: Locale) {
        val isLangMatching = { v: Voice -> v.locale.language == locale.language }

        when (persona) {
            CharacterPersona.FEMALE -> {
                tts?.setPitch(1.22f)
                tts?.setSpeechRate(baseSpeed * 1.04f)
                val femaleVoice = availableVoices.firstOrNull {
                    isLangMatching(it) && (it.name.contains("female", ignoreCase = true) ||
                            it.name.contains("-f-", ignoreCase = true) ||
                            it.name.contains("ruf", ignoreCase = true))
                }
                if (femaleVoice != null) {
                    try { tts?.voice = femaleVoice } catch (_: Throwable) {}
                }
            }
            CharacterPersona.MALE -> {
                tts?.setPitch(0.86f)
                tts?.setSpeechRate(baseSpeed * 0.98f)
                val maleVoice = availableVoices.firstOrNull {
                    isLangMatching(it) && (it.name.contains("male", ignoreCase = true) ||
                            it.name.contains("-m-", ignoreCase = true) ||
                            it.name.contains("dfc", ignoreCase = true) ||
                            it.name.contains("ruc", ignoreCase = true))
                }
                if (maleVoice != null) {
                    try { tts?.voice = maleVoice } catch (_: Throwable) {}
                }
            }
            CharacterPersona.ELDER_DEEP -> {
                tts?.setPitch(0.72f)
                tts?.setSpeechRate(baseSpeed * 0.88f)
            }
            CharacterPersona.YOUNG_FAIRY -> {
                tts?.setPitch(1.38f)
                tts?.setSpeechRate(baseSpeed * 1.12f)
            }
            CharacterPersona.NARRATOR -> {
                tts?.setPitch(1.0f)
                tts?.setSpeechRate(baseSpeed)
            }
        }
    }

    fun stop() {
        try {
            tts?.stop()
        } catch (_: Throwable) {}
    }

    fun destroy() {
        try {
            tts?.stop()
            tts?.shutdown()
            tts = null
        } catch (_: Throwable) {}
    }
}

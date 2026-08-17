package me.magnum.melonds.translator.tts

import android.content.Context
import android.content.SharedPreferences
import android.media.AudioAttributes
import android.media.MediaPlayer
import android.net.Uri
import android.speech.tts.TextToSpeech
import android.speech.tts.Voice
import android.util.Log
import androidx.preference.PreferenceManager
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.net.HttpURLConnection
import java.net.URL
import java.net.URLEncoder
import java.util.Locale

class GameTtsManager(private val context: Context) {

    companion object {
        private const val TAG = "GameTtsManager"
        const val PREF_TRANSLATOR_TTS_LANG = "translator_tts_lang"
        const val PREF_TRANSLATOR_TTS_MULTI_VOICE = "translator_tts_multi_voice"
        const val PREF_TRANSLATOR_TTS_SPEED = "translator_tts_speed"
        const val PREF_TRANSLATOR_TTS_NEURAL_ENABLED = "translator_tts_neural_enabled"
        const val PREF_TRANSLATOR_TTS_API_KEY = "translator_tts_api_key"

        // 1. Dark Heroes & Vigilantes (Batman, Kyle Hyde, Wesker, Kratos, Solid Snake)
        private val BATMAN_DARK_HERO_KEYWORDS = setOf(
            "бэтмен", "бэтмэн", "брюс", "уэйн", "темный рыцарь", "гордон", "комиссар", "хайден",
            "кайл хайд", "снейк", "кратос", "вескер", "вейдер", "дарт вейдер", "двуликий",
            "batman", "bruce wayne", "dark knight", "gordon", "kyle hyde", "wesker", "vader", "two-face"
        )

        // 2. Manic Villains (Joker, Fawful, Kefka, Dimentio, Riddler)
        private val JOKER_MANIC_KEYWORDS = setOf(
            "джокер", "фофул", "клоун", "безумец", "псих", "маньяк", "загадочник", "риддлер", "кефка",
            "joker", "fawful", "clown", "maniac", "riddler", "dimentio", "kefka"
        )

        // 3. Female Characters & Heroines (Zelda, Peach, Maya, Mia, Shanoa, Harley, Cynthia, Jill, Marle, Xion)
        private val FEMALE_KEYWORDS = setOf(
            "майя", "мия", "перл", "зельда", "пич", "дэйзи", "розалина", "эмма", "люси", "айрис",
            "каллисто", "франциска", "синтиа", "харли", "харли квинн", "джилл", "шаноа", "марл",
            "лукка", "шион", "афина", "труси", "флора", "линн", "шики", "девушка", "женщина",
            "девочка", "принцесса", "королева", "мать", "сестра", "подруга", "хозяйка",
            "maya", "mia", "pearl", "zelda", "peach", "daisy", "rosalina", "franziska", "cynthia",
            "harley", "harley quinn", "jill", "shanoa", "marle", "lucca", "xion", "athena", "trucy",
            "flora", "lynne", "shiki", "girl", "woman", "princess", "queen", "lady"
        )

        // 4. British Gentlemen & Sharp Sleuths (Layton, Edgeworth, Godot, Oak, Rowan, Phoenix)
        private val GENTLEMAN_SLEUTH_KEYWORDS = setOf(
            "лейтон", "профессор", "эджворт", "годо", "крэйвен", "оук", "роуэн", "джунипер",
            "феникс", "райт", "челми",
            "layton", "professor", "edgeworth", "godot", "klavier", "oak", "rowan", "juniper",
            "phoenix", "wright", "chelmey"
        )

        // 5. Elders, Heavy Bosses & Monsters (The Judge, Bowser, Dracula, Slime, King, Ghetsis, Saix)
        private val ELDER_OR_DEEP_KEYWORDS = setOf(
            "судья", "дед", "старик", "босс", "детектив", "гамшу", "вон карма", "король", "монстр",
            "дракон", "баузер", "боузер", "дракула", "гетсис", "ганон", "ганондорф", "пингвин", "сайкс",
            "judge", "elder", "detective", "gumshoe", "von karma", "gant", "king", "boss",
            "bowser", "dracula", "ghetsis", "ganon", "ganondorf", "penguin", "saix"
        )

        // 6. Young, Cute, Fairies & Kids (Luke, Tails, Pikachu, Navi, Starlow, Red, Toad)
        private val YOUNG_OR_FAIRY_KEYWORDS = setOf(
            "люк", "тейлз", "тейлс", "пикачу", "нави", "старлоу", "тоад", "фея", "малыш", "ребенок",
            "татл", "мальчик", "дитя", "соник",
            "luke", "tails", "pikachu", "navi", "starlow", "toad", "fairy", "child", "kid", "boy", "sonic"
        )

        // 7. Robots, AI & Tech (Robo, Omega-Xis, Pokedex)
        private val ROBOTIC_TECH_KEYWORDS = setOf(
            "робо", "омега", "покедекс", "компьютер", "робот", "дроид", "система",
            "robo", "omega", "pokedex", "computer", "robot", "droid", "system"
        )
    }

    enum class CharacterPersona {
        MALE,
        FEMALE,
        HERO_BATMAN,
        MANIC_JOKER,
        GENTLEMAN_LAYTON,
        ELDER_DEEP,
        YOUNG_FAIRY,
        ROBOTIC_TECH,
        NARRATOR
    }

    private val preferences: SharedPreferences = PreferenceManager.getDefaultSharedPreferences(context)
    private var tts: TextToSpeech? = null
    private var isReady = false
    private var availableVoices: List<Voice> = emptyList()
    private val scope = CoroutineScope(Dispatchers.IO)
    private var mediaPlayer: MediaPlayer? = null

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
                    Log.i(TAG, "TTS initialized successfully. Available voices: ${availableVoices.size}")
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
            Log.w(TAG, "Language $locale not supported, falling back to default")
            tts?.language = Locale.getDefault()
        }
    }

    fun speak(text: String, targetLang: String = "ru") {
        if (text.isBlank()) return

        val isNeural = preferences.getBoolean(PREF_TRANSLATOR_TTS_NEURAL_ENABLED, false)
        if (isNeural) {
            speakNeuralCloud(text, targetLang)
            return
        }

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

    private fun speakNeuralCloud(text: String, targetLang: String) {
        scope.launch {
            try {
                // Free streaming Google Neural / Lingva TTS endpoint with instant buffer
                val langCode = if (targetLang.isBlank()) "ru" else targetLang.lowercase()
                val encodedText = URLEncoder.encode(text.take(150), "UTF-8")
                val url = "https://translate.google.com/translate_tts?ie=UTF-8&tl=$langCode&client=tw-ob&q=$encodedText"

                mediaPlayer?.stop()
                mediaPlayer?.release()
                mediaPlayer = MediaPlayer().apply {
                    setAudioAttributes(
                        AudioAttributes.Builder()
                            .setContentType(AudioAttributes.CONTENT_TYPE_SPEECH)
                            .setUsage(AudioAttributes.USAGE_GAME)
                            .build()
                    )
                    setDataSource(context, Uri.parse(url))
                    prepareAsync()
                    setOnPreparedListener { start() }
                }
            } catch (e: Throwable) {
                Log.w(TAG, "Neural cloud TTS fallback to local: ${e.message}")
                // Fallback to local TTS
                val locale = getSelectedLanguage()
                applyPersonaVoice(detectPersona(text), 1.0f, locale)
                tts?.speak(text, TextToSpeech.QUEUE_ADD, null, "game_tts_fallback")
            }
        }
    }

    private fun detectPersona(text: String): CharacterPersona {
        val lower = text.lowercase()
        val speaker = if (lower.contains(":")) lower.substringBefore(":").trim() else ""

        // Check speaker prefix
        if (speaker.isNotEmpty()) {
            if (BATMAN_DARK_HERO_KEYWORDS.any { speaker.contains(it) }) return CharacterPersona.HERO_BATMAN
            if (JOKER_MANIC_KEYWORDS.any { speaker.contains(it) }) return CharacterPersona.MANIC_JOKER
            if (GENTLEMAN_SLEUTH_KEYWORDS.any { speaker.contains(it) }) return CharacterPersona.GENTLEMAN_LAYTON
            if (FEMALE_KEYWORDS.any { speaker.contains(it) }) return CharacterPersona.FEMALE
            if (ELDER_OR_DEEP_KEYWORDS.any { speaker.contains(it) }) return CharacterPersona.ELDER_DEEP
            if (YOUNG_OR_FAIRY_KEYWORDS.any { speaker.contains(it) }) return CharacterPersona.YOUNG_FAIRY
            if (ROBOTIC_TECH_KEYWORDS.any { speaker.contains(it) }) return CharacterPersona.ROBOTIC_TECH
            return CharacterPersona.MALE
        }

        // 1. Addressing Batman at start (e.g. "Бэтмен, я так рад...") -> Joker/Villain speaking!
        if (lower.startsWith("бэтмен,") || lower.startsWith("бэтмэн,") || lower.startsWith("batman,") ||
            lower.contains("рад, что ты") || lower.contains("ха-ха") || lower.contains("хи-хи") || lower.contains("моя ловушка")) {
            return CharacterPersona.MANIC_JOKER
        }

        // 2. Addressing Joker at end (e.g. "Что ты сейчас делаешь, Джокер?") -> Batman speaking!
        if (lower.contains("джокер?") || lower.contains("джокер!") || lower.contains("joker?") || lower.contains("joker!") ||
            lower.contains("сдавайся") || lower.contains("город под защитой") || lower.contains("где детонатор")) {
            return CharacterPersona.HERO_BATMAN
        }

        // Check dialogue text body keywords
        if (BATMAN_DARK_HERO_KEYWORDS.any { lower.contains(it) }) return CharacterPersona.HERO_BATMAN
        if (JOKER_MANIC_KEYWORDS.any { lower.contains(it) }) return CharacterPersona.MANIC_JOKER
        if (GENTLEMAN_SLEUTH_KEYWORDS.any { lower.contains(it) }) return CharacterPersona.GENTLEMAN_LAYTON
        if (FEMALE_KEYWORDS.any { lower.contains(it) }) return CharacterPersona.FEMALE
        if (ELDER_OR_DEEP_KEYWORDS.any { lower.contains(it) }) return CharacterPersona.ELDER_DEEP
        if (YOUNG_OR_FAIRY_KEYWORDS.any { lower.contains(it) }) return CharacterPersona.YOUNG_FAIRY
        if (ROBOTIC_TECH_KEYWORDS.any { lower.contains(it) }) return CharacterPersona.ROBOTIC_TECH

        // Exclamation / Action cue
        if (text.contains("!")) {
            return CharacterPersona.MALE
        }

        return CharacterPersona.NARRATOR
    }

    private fun applyPersonaVoice(persona: CharacterPersona, baseSpeed: Float, locale: Locale) {
        val isLangMatching = { v: Voice -> v.locale.language == locale.language }
        val langVoices = availableVoices.filter(isLangMatching)

        val maleVoice = langVoices.firstOrNull {
            val name = it.name.lowercase()
            (name.contains("male") || name.contains("-m-") || name.contains("dfc") || name.contains("ruc") || name.contains("man")) &&
                    !name.contains("female") && !name.contains("ruf") && !name.contains("-f-")
        } ?: langVoices.firstOrNull {
            val name = it.name.lowercase()
            !name.contains("female") && !name.contains("ruf") && !name.contains("-f-")
        }

        val femaleVoice = langVoices.firstOrNull {
            val name = it.name.lowercase()
            name.contains("female") || name.contains("-f-") || name.contains("ruf") || name.contains("woman") || name.contains("-f-")
        }

        val hasDistinctMaleVoice = maleVoice != null && maleVoice != femaleVoice

        when (persona) {
            CharacterPersona.HERO_BATMAN -> {
                if (maleVoice != null) {
                    try { tts?.voice = maleVoice } catch (_: Throwable) {}
                }
                // Gruff, heavy dark vigilante tone
                tts?.setPitch(if (hasDistinctMaleVoice) 0.68f else 0.52f)
                tts?.setSpeechRate(baseSpeed * 0.88f)
            }
            CharacterPersona.MANIC_JOKER -> {
                if (maleVoice != null) {
                    try { tts?.voice = maleVoice } catch (_: Throwable) {}
                }
                // Manic, fast, crazy male tone (not woman voice!)
                tts?.setPitch(if (hasDistinctMaleVoice) 1.10f else 0.78f)
                tts?.setSpeechRate(baseSpeed * 1.25f)
            }
            CharacterPersona.GENTLEMAN_LAYTON -> {
                if (maleVoice != null) {
                    try { tts?.voice = maleVoice } catch (_: Throwable) {}
                }
                // Refined, calm gentleman baritone
                tts?.setPitch(if (hasDistinctMaleVoice) 0.82f else 0.65f)
                tts?.setSpeechRate(baseSpeed * 0.94f)
            }
            CharacterPersona.FEMALE -> {
                if (femaleVoice != null) {
                    try { tts?.voice = femaleVoice } catch (_: Throwable) {}
                }
                tts?.setPitch(1.22f)
                tts?.setSpeechRate(baseSpeed * 1.04f)
            }
            CharacterPersona.MALE -> {
                if (maleVoice != null) {
                    try { tts?.voice = maleVoice } catch (_: Throwable) {}
                }
                tts?.setPitch(if (hasDistinctMaleVoice) 0.90f else 0.72f)
                tts?.setSpeechRate(baseSpeed * 1.00f)
            }
            CharacterPersona.ELDER_DEEP -> {
                if (maleVoice != null) {
                    try { tts?.voice = maleVoice } catch (_: Throwable) {}
                }
                tts?.setPitch(if (hasDistinctMaleVoice) 0.60f else 0.48f)
                tts?.setSpeechRate(baseSpeed * 0.82f)
            }
            CharacterPersona.YOUNG_FAIRY -> {
                if (femaleVoice != null) {
                    try { tts?.voice = femaleVoice } catch (_: Throwable) {}
                }
                tts?.setPitch(1.38f)
                tts?.setSpeechRate(baseSpeed * 1.12f)
            }
            CharacterPersona.ROBOTIC_TECH -> {
                if (maleVoice != null) {
                    try { tts?.voice = maleVoice } catch (_: Throwable) {}
                }
                tts?.setPitch(0.70f)
                tts?.setSpeechRate(baseSpeed * 0.92f)
            }
            CharacterPersona.NARRATOR -> {
                tts?.setPitch(1.0f)
                tts?.setSpeechRate(baseSpeed)
            }
        }
    }

    fun stop() {
        try {
            mediaPlayer?.stop()
            mediaPlayer?.release()
            mediaPlayer = null
            tts?.stop()
        } catch (_: Throwable) {}
    }

    fun destroy() {
        try {
            mediaPlayer?.stop()
            mediaPlayer?.release()
            mediaPlayer = null
            tts?.stop()
            tts?.shutdown()
            tts = null
        } catch (_: Throwable) {}
    }
}

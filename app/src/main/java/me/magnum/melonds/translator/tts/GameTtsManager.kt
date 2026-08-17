package me.magnum.melonds.translator.tts

import android.content.Context
import android.content.SharedPreferences
import android.media.AudioAttributes
import android.media.MediaPlayer
import android.media.PlaybackParams
import android.os.Build
import android.speech.tts.TextToSpeech
import android.speech.tts.Voice
import android.util.Log
import androidx.preference.PreferenceManager
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import okhttp3.Request
import java.io.File
import java.io.FileOutputStream
import java.net.URLEncoder
import java.util.Locale
import java.util.concurrent.TimeUnit

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
            "кайл хайд", "снейк", "кратос", "вескер", "вейдер", "дарт вейдер", "двуликий", "аркхэм",
            "batman", "bruce wayne", "dark knight", "gordon", "kyle hyde", "wesker", "vader", "two-face", "arkham"
        )

        // 2. Manic Villains (Joker, Fawful, Kefka, Dimentio, Riddler)
        private val JOKER_MANIC_KEYWORDS = setOf(
            "джокер", "фофул", "клоун", "безумец", "псих", "маньяк", "загадочник", "риддлер", "кефка", "диментио",
            "ха-ха", "хи-хи", "ахаха", "хе-хе", "ловушка", "веселье", "шутка", "карты",
            "joker", "fawful", "clown", "maniac", "riddler", "dimentio", "kefka", "haha", "hehe", "joke", "trap"
        )

        // 3. Female Characters & Heroines (Zelda, Peach, Maya, Mia, Shanoa, Harley, Cynthia, Jill, Marle, Xion)
        private val FEMALE_KEYWORDS = setOf(
            "майя", "мия", "перл", "зельда", "пич", "дэйзи", "розалина", "эмма", "люси", "айрис",
            "каллисто", "франциска", "синтиа", "харли", "харли квинн", "джилл", "шаноа", "марл",
            "лукка", "шион", "афина", "труси", "флора", "линн", "шики", "девушка", "женщина",
            "девочка", "принцесса", "королева", "мать", "сестра", "подруга", "хозяйка", "мисс", "леди", "госпожа",
            "maya", "mia", "pearl", "zelda", "peach", "daisy", "rosalina", "franziska", "cynthia",
            "harley", "harley quinn", "jill", "shanoa", "marle", "lucca", "xion", "athena", "trucy",
            "flora", "lynne", "shiki", "girl", "woman", "princess", "queen", "lady", "miss"
        )

        // 4. British Gentlemen & Sharp Sleuths (Layton, Edgeworth, Godot, Oak, Rowan, Phoenix)
        private val GENTLEMAN_SLEUTH_KEYWORDS = setOf(
            "лейтон", "профессор", "эджворт", "годо", "крэйвен", "оук", "роуэн", "джунипер",
            "феникс", "райт", "челми", "детектив", "загадка", "головоломка", "пазл", "джентльмен",
            "layton", "professor", "edgeworth", "godot", "klavier", "oak", "rowan", "juniper",
            "phoenix", "wright", "chelmey", "puzzle", "gentleman"
        )

        // 5. Elders, Heavy Bosses & Monsters (The Judge, Bowser, Dracula, Slime, King, Ghetsis, Saix)
        private val ELDER_OR_DEEP_KEYWORDS = setOf(
            "судья", "дед", "старик", "босс", "детектив", "гамшу", "вон карма", "король", "монстр",
            "дракон", "баузер", "боузер", "дракула", "гетсис", "ганон", "ганондорф", "пингвин", "сайкс",
            "виновен", "приговор", "сокрушу", "ничтожества",
            "judge", "elder", "gumshoe", "von karma", "gant", "king", "boss",
            "bowser", "dracula", "ghetsis", "ganon", "ganondorf", "penguin", "saix"
        )

        // 6. Young, Cute, Fairies & Kids (Luke, Tails, Pikachu, Navi, Starlow, Red, Toad)
        private val YOUNG_OR_FAIRY_KEYWORDS = setOf(
            "люк", "тейлз", "тейлс", "пикачу", "нави", "старлоу", "тоад", "фея", "малыш", "ребенок",
            "татл", "мальчик", "дитя", "соник", "пика-пика", "ура",
            "luke", "tails", "pikachu", "navi", "starlow", "toad", "fairy", "child", "kid", "boy", "sonic"
        )

        // 7. Robots, AI & Tech (Robo, Omega-Xis, Pokedex)
        private val ROBOTIC_TECH_KEYWORDS = setOf(
            "робо", "омега", "покедекс", "компьютер", "робот", "дроид", "система", "протокол", "директива",
            "robo", "omega", "pokedex", "computer", "robot", "droid", "system", "protocol"
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

    private val httpClient = OkHttpClient.Builder()
        .connectTimeout(8, TimeUnit.SECONDS)
        .readTimeout(10, TimeUnit.SECONDS)
        .build()

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

        // 1. Apply intelligent stress accents and phonetics normalization for gaming terms
        val normalizedText = RussianTtsNormalizer.normalize(text, targetLang)

        val isNeural = preferences.getBoolean(PREF_TRANSLATOR_TTS_NEURAL_ENABLED, false)
        val multiVoiceEnabled = preferences.getBoolean(PREF_TRANSLATOR_TTS_MULTI_VOICE, true)
        val baseSpeed = (preferences.getInt(PREF_TRANSLATOR_TTS_SPEED, 100) / 100f).coerceIn(0.6f, 1.8f)

        if (isNeural) {
            val lines = normalizedText.split("\n", ". ")
            for (line in lines) {
                val trimmed = line.trim()
                if (trimmed.isEmpty()) continue
                val persona = detectPersona(trimmed)
                speakNeuralCloud(trimmed, targetLang, persona, baseSpeed)
            }
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

        if (multiVoiceEnabled) {
            val lines = normalizedText.split("\n", ". ")
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
            tts?.speak(normalizedText, TextToSpeech.QUEUE_FLUSH, null, "game_tts_single")
        }
    }

    private fun speakNeuralCloud(text: String, targetLang: String, persona: CharacterPersona, baseSpeed: Float) {
        scope.launch {
            try {
                val langCode = if (targetLang.isBlank()) "ru" else targetLang.lowercase()
                val cleanText = text.take(200)
                val encodedText = URLEncoder.encode(cleanText, "UTF-8")
                
                // Construct high-quality Neural Web Speech request
                val url = "https://translate.google.com/translate_tts?ie=UTF-8&tl=$langCode&client=tw-ob&q=$encodedText"

                val request = Request.Builder()
                    .url(url)
                    .header("User-Agent", "Mozilla/5.0 (Linux; Android 14; Mobile) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Mobile Safari/537.36")
                    .header("Referer", "https://translate.google.com/")
                    .get()
                    .build()

                val response = httpClient.newCall(request).execute()
                if (!response.isSuccessful || response.body == null) {
                    throw IllegalStateException("Neural TTS HTTP response unsuccessful: ${response.code}")
                }

                val audioBytes = response.body!!.bytes()
                if (audioBytes.isEmpty()) {
                    throw IllegalStateException("Neural TTS audio bytes empty")
                }

                // Write to cache file for MediaPlayer
                val tempFile = File(context.cacheDir, "neural_tts_speech_${System.currentTimeMillis()}.mp3")
                FileOutputStream(tempFile).use { fos ->
                    fos.write(audioBytes)
                }

                withContext(Dispatchers.Main) {
                    mediaPlayer?.stop()
                    mediaPlayer?.release()
                    mediaPlayer = MediaPlayer().apply {
                        setAudioAttributes(
                            AudioAttributes.Builder()
                                .setContentType(AudioAttributes.CONTENT_TYPE_SPEECH)
                                .setUsage(AudioAttributes.USAGE_GAME)
                                .build()
                        )
                        setDataSource(tempFile.absolutePath)
                        prepare()

                        // Apply Persona pitch and speech rate hardware modulation to the Neural audio stream!
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                            try {
                                val params = PlaybackParams()
                                when (persona) {
                                    CharacterPersona.HERO_BATMAN -> {
                                        params.pitch = 0.65f // Deep dark baritone vigilante
                                        params.speed = baseSpeed * 0.86f
                                    }
                                    CharacterPersona.MANIC_JOKER -> {
                                        params.pitch = 1.30f // High-pitched, wild, manic villain
                                        params.speed = baseSpeed * 1.25f
                                    }
                                    CharacterPersona.GENTLEMAN_LAYTON -> {
                                        params.pitch = 0.85f // Cultured polite gentleman
                                        params.speed = baseSpeed * 0.92f
                                    }
                                    CharacterPersona.FEMALE -> {
                                        params.pitch = 1.20f // Melodious heroine
                                        params.speed = baseSpeed * 1.02f
                                    }
                                    CharacterPersona.ELDER_DEEP -> {
                                        params.pitch = 0.50f // Heavy ancient boss/judge bass
                                        params.speed = baseSpeed * 0.78f
                                    }
                                    CharacterPersona.YOUNG_FAIRY -> {
                                        params.pitch = 1.55f // Cheerful kid/fairy
                                        params.speed = baseSpeed * 1.15f
                                    }
                                    CharacterPersona.ROBOTIC_TECH -> {
                                        params.pitch = 0.40f // Deep monotone robotic
                                        params.speed = baseSpeed * 1.05f
                                    }
                                    CharacterPersona.MALE -> {
                                        params.pitch = 0.88f // Classic male protagonist
                                        params.speed = baseSpeed * 0.98f
                                    }
                                    CharacterPersona.NARRATOR -> {
                                        params.pitch = 1.0f
                                        params.speed = baseSpeed
                                    }
                                }
                                playbackParams = params
                            } catch (e: Throwable) {
                                Log.w(TAG, "Cannot apply PlaybackParams: ${e.message}")
                            }
                        }

                        start()
                        setOnCompletionListener {
                            tempFile.delete()
                        }
                    }
                }
                Log.i(TAG, "Neural Cloud TTS played for [$persona]: ${audioBytes.size} bytes")
            } catch (e: Throwable) {
                Log.w(TAG, "Neural cloud TTS fallback to local: ${e.message}")
                withContext(Dispatchers.Main) {
                    val locale = getSelectedLanguage()
                    applyPersonaVoice(persona, baseSpeed, locale)
                    tts?.speak(text, TextToSpeech.QUEUE_ADD, null, "game_tts_fallback")
                }
            }
        }
    }

    private fun detectPersona(text: String): CharacterPersona {
        val lower = text.lowercase()
        val speaker = if (lower.contains(":")) lower.substringBefore(":").trim() else ""

        // 1. Explicit Speaker Tags (e.g. "Бэтмен:", "Joker:", "[Layton]")
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

        // 2. Vocative Detection & Dialogue Roles
        // Addressing Batman -> Joker/Villain speaking!
        if (lower.startsWith("бэтмен,") || lower.startsWith("бэтмэн,") || lower.startsWith("batman,") ||
            lower.contains("рад, что ты") || lower.contains("ха-ха") || lower.contains("хи-хи") || lower.contains("ахаха") ||
            lower.contains("моя ловушка") || lower.contains("моя игра") || lower.contains("клоун")) {
            return CharacterPersona.MANIC_JOKER
        }

        // Addressing Joker -> Batman speaking!
        if (lower.contains("джокер?") || lower.contains("джокер!") || lower.contains("joker?") || lower.contains("joker!") ||
            lower.contains("сдавайся") || lower.contains("город под защитой") || lower.contains("где детонатор") ||
            lower.contains("аркхэм") || lower.contains("хватит, джокер")) {
            return CharacterPersona.HERO_BATMAN
        }

        // 3. Keyword Content Analysis
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

        // Multiple distinct male voices (e.g. rud vs rue in Google Speech Services)
        val maleVoices = langVoices.filter {
            val name = it.name.lowercase()
            (name.contains("rud") || name.contains("rue") || name.contains("male") ||
                    name.contains("guy") || name.contains("boy") || name.contains("man") ||
                    name.contains("dmitry") || name.contains("alexander") || name.contains("pavel") ||
                    name.contains("maxim") || name.contains("m-local") || name.contains("m-network") ||
                    it.features?.contains("male") == true) &&
                    !name.contains("female") && !name.contains("woman") && !name.contains("girl") &&
                    !name.contains("dfc") && !name.contains("ruf") && !name.contains("dfb")
        }

        val femaleVoices = langVoices.filter {
            val name = it.name.lowercase()
            name.contains("female") || name.contains("woman") || name.contains("girl") ||
                    name.contains("dfc") || name.contains("ruf") || name.contains("dfb") ||
                    name.contains("anna") || name.contains("elena") || name.contains("irina") ||
                    name.contains("tatyana") || name.contains("-f-")
        }

        val primaryMaleVoice = maleVoices.firstOrNull() ?: langVoices.firstOrNull { !femaleVoices.contains(it) }
        val secondaryMaleVoice = maleVoices.getOrNull(1) ?: primaryMaleVoice
        val primaryFemaleVoice = femaleVoices.firstOrNull()
        val secondaryFemaleVoice = femaleVoices.getOrNull(1) ?: primaryFemaleVoice

        when (persona) {
            CharacterPersona.HERO_BATMAN -> {
                if (primaryMaleVoice != null) {
                    try { tts?.voice = primaryMaleVoice } catch (_: Throwable) {}
                }
                // Super deep, authoritative gravelly baritone
                tts?.setPitch(0.48f)
                tts?.setSpeechRate(baseSpeed * 0.82f)
            }
            CharacterPersona.MANIC_JOKER -> {
                if (secondaryMaleVoice != null) {
                    try { tts?.voice = secondaryMaleVoice } catch (_: Throwable) {}
                }
                // High-pitched, wild, crazy manic tone
                tts?.setPitch(1.35f)
                tts?.setSpeechRate(baseSpeed * 1.28f)
            }
            CharacterPersona.GENTLEMAN_LAYTON -> {
                if (primaryMaleVoice != null) {
                    try { tts?.voice = primaryMaleVoice } catch (_: Throwable) {}
                }
                // Refined, calm gentleman tone
                tts?.setPitch(0.78f)
                tts?.setSpeechRate(baseSpeed * 0.90f)
            }
            CharacterPersona.FEMALE -> {
                if (primaryFemaleVoice != null) {
                    try { tts?.voice = primaryFemaleVoice } catch (_: Throwable) {}
                }
                tts?.setPitch(1.25f)
                tts?.setSpeechRate(baseSpeed * 1.02f)
            }
            CharacterPersona.MALE -> {
                if (primaryMaleVoice != null) {
                    try { tts?.voice = primaryMaleVoice } catch (_: Throwable) {}
                }
                tts?.setPitch(0.85f)
                tts?.setSpeechRate(baseSpeed * 0.98f)
            }
            CharacterPersona.ELDER_DEEP -> {
                if (primaryMaleVoice != null) {
                    try { tts?.voice = primaryMaleVoice } catch (_: Throwable) {}
                }
                // Very heavy ancient bass
                tts?.setPitch(0.38f)
                tts?.setSpeechRate(baseSpeed * 0.75f)
            }
            CharacterPersona.YOUNG_FAIRY -> {
                if (secondaryFemaleVoice != null) {
                    try { tts?.voice = secondaryFemaleVoice } catch (_: Throwable) {}
                }
                tts?.setPitch(1.70f)
                tts?.setSpeechRate(baseSpeed * 1.15f)
            }
            CharacterPersona.ROBOTIC_TECH -> {
                if (primaryMaleVoice != null) {
                    try { tts?.voice = primaryMaleVoice } catch (_: Throwable) {}
                }
                tts?.setPitch(0.42f)
                tts?.setSpeechRate(baseSpeed * 1.00f)
            }
            CharacterPersona.NARRATOR -> {
                if (primaryMaleVoice != null) {
                    try { tts?.voice = primaryMaleVoice } catch (_: Throwable) {}
                }
                tts?.setPitch(0.95f)
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

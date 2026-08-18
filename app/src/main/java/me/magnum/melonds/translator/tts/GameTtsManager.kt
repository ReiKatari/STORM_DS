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

/**
 * Ultimate NDS / NDSi Multi-Actor Neural and Multi-Voice TTS Engine.
 * Features live Edge Neural Multi-Voice streaming (Dmitry, Svetlana, Guy, Jenny, Keita, Nanami),
 * real-time DSP pitch modulation, and 11 distinct character archetypes.
 */
class GameTtsManager(private val context: Context) {

    companion object {
        private const val TAG = "GameTtsManager"
        const val PREF_TRANSLATOR_TTS_VOICE_ENGINE = "translator_tts_voice_engine"
        const val PREF_TRANSLATOR_TTS_LANG = "translator_tts_lang"
        const val PREF_TRANSLATOR_TTS_MULTI_VOICE = "translator_tts_multi_voice"
        const val PREF_TRANSLATOR_TTS_SPEED = "translator_tts_speed"
        const val PREF_TRANSLATOR_TTS_NEURAL_ENABLED = "translator_tts_neural_enabled"
        const val PREF_TRANSLATOR_TTS_API_KEY = "translator_tts_api_key"

        // 1. Dark Heroes & Vigilantes (Batman, Solid Snake, Kyle Hyde, Wesker, Kratos, Shadow, Punisher)
        private val HERO_DARK_VIGILANTE_KEYWORDS = setOf(
            "бэтмен", "бэтмэн", "брюс", "уэйн", "темный рыцарь", "гордон", "комиссар", "хайден",
            "кайл хайд", "снейк", "кратос", "вескер", "вейдер", "дарт вейдер", "каратель", "аркхэм",
            "шедоу", "солид снейк", "биг босс", "детектив хайд", "бэтпещера",
            "batman", "bruce wayne", "dark knight", "gordon", "kyle hyde", "wesker", "vader", "two-face",
            "arkham", "solid snake", "shadow", "kratos", "punisher"
        )

        // 2. Manic Villains & Tricksters (Joker, Fawful, Kefka, Dimentio, Riddler, Porky, Waluigi, Ghirahim)
        private val VILLAIN_MANIC_JOKER_KEYWORDS = setOf(
            "джокер", "фофул", "клоун", "безумец", "псих", "маньяк", "загадочник", "риддлер", "кефка", "диментио",
            "порки", "валуиджи", "гирахим", "двуликий", "пугало", "крейн", "джокер:", "[джокер]",
            "ха-ха", "хи-хи", "ахаха", "хе-хе", "хахаха", "муахаха", "ловушка", "веселье", "шутка", "карты",
            "безумие", "взорву", "убью", "цирк", "фокус", "смех", "смешно",
            "joker", "fawful", "clown", "maniac", "riddler", "dimentio", "kefka", "porky", "waluigi",
            "ghirahim", "scarecrow", "two-face", "haha", "hehe", "hahaha", "muahaha", "joke", "trap", "insanity"
        )

        // 3. Demonic, Devilish & Abyss Entities (Death, Dracula, Akuma, Giratina, Darkrai, Mewtwo, Ridley, Skull Kid)
        private val DEMONIC_DEVILISH_KEYWORDS = setOf(
            "смерть", "демон", "дьявол", "сатана", "даркрай", "гиратина", "мьюту", "ридли", "акума",
            "череп", "скулл кид", "бездна", "преисподняя", "тьма", "поглощу", "душа", "кровавый",
            "вампир", "нечисть", "проклятие", "вечные муки", "ад", "демонический", "некромант",
            "death", "dracula", "demon", "devil", "satan", "darkrai", "giratina", "mewtwo", "ridley",
            "akuma", "skull kid", "abyss", "curse", "damnation", "hell", "vampire", "necromancer"
        )

        // 4. Angelic, Divine & Celestial Spirits (Palutena, Goddess Hylia, Pit, Arceus, Celebi, Jirachi, Great Fairy, Goddess)
        private val ANGELIC_DIVINE_KEYWORDS = setOf(
            "палютена", "богиня", "хайлия", "аркеус", "селеби", "джирачи", "пит", "ангел", "великая фея",
            "священный", "благословение", "свет", "небеса", "храм", "чистота", "молитва", "божественный",
            "дух света", "серафим", "исцеление",
            "palutena", "goddess", "hylia", "arceus", "celebi", "jirachi", "pit", "angel", "great fairy",
            "holy", "blessing", "light", "heavens", "sanctuary", "purity", "prayer", "divine"
        )

        // 5. British Gentlemen, Sleuths & Scholars (Layton, Edgeworth, Phoenix Wright, Godot, Oak, Rowan, Birch, Chelmey)
        private val GENTLEMAN_SCHOLAR_KEYWORDS = setOf(
            "лейтон", "профессор", "эджворт", "годо", "крэйвен", "оук", "роуэн", "джунипер", "бирч", "элм", "сикамор",
            "феникс", "райт", "челми", "детектив", "загадка", "головоломка", "пазл", "джентльмен",
            "протестую", "судебное заседание", "улика", "показания", "перекрестный допрос", "дедукция",
            "layton", "professor", "edgeworth", "godot", "klavier", "oak", "rowan", "birch", "elm", "sycamore",
            "phoenix", "wright", "chelmey", "puzzle", "gentleman", "objection", "evidence", "testimony", "court"
        )

        // 6. Elders, Heavy Bosses & Judges (The Judge, King Bowser, Ganondorf, Ghetsis, Giovanni, Dedede, Eggman, Wario, K. Rool)
        private val ELDER_ANCIENT_BOSS_KEYWORDS = setOf(
            "судья", "дед", "старик", "босс", "детектив", "гамшу", "вон карма", "король", "монстр",
            "дракон", "баузер", "боузер", "гетсис", "ганон", "ганондорф", "пингвин", "сайкс", "ксемнас", "ансем",
            "дидиди", "дедеде", "эггман", "эгнот", "варио", "кинг к. рол", "джованни",
            "виновен", "приговор", "сокрушу", "ничтожества", "тысяча лет", "суд объявляет", "тишина в зале",
            "judge", "elder", "gumshoe", "von karma", "gant", "king", "boss", "bowser", "ghetsis", "ganon",
            "ganondorf", "penguin", "saix", "xemnas", "ansem", "dedede", "eggman", "wario", "k. rool", "giovanni"
        )

        // 7. Heroines & Female Protagonists (Zelda, Peach, Daisy, Rosalina, Maya, Mia, Franziska, Ema, Shanoa, Samus, Cynthia, Dawn, Harley, Jill)
        private val HEROINE_FEMALE_KEYWORDS = setOf(
            "майя", "мия", "перл", "зельда", "пич", "дэйзи", "розалина", "эмма", "люси", "айрис",
            "каллисто", "франциска", "синтиа", "харли", "харли квинн", "джилл", "шаноа", "самус", "марл",
            "лукка", "шион", "афина", "труси", "флора", "линн", "шики", "мидна", "доун", "хильда", "роза", "мисти",
            "аква", "каири", "девушка", "женщина", "девочка", "принцесса", "королева", "мать", "сестра", "подруга",
            "хозяйка", "мисс", "леди", "госпожа", "братец", "спасите", "помогите",
            "maya", "mia", "pearl", "zelda", "peach", "daisy", "rosalina", "franziska", "cynthia",
            "harley", "harley quinn", "jill", "shanoa", "samus", "marle", "lucca", "xion", "athena", "trucy",
            "flora", "lynne", "shiki", "midna", "dawn", "hilda", "rosa", "misty", "aqua", "kairi",
            "girl", "woman", "princess", "queen", "lady", "miss"
        )

        // 8. Children, Cute Fairies & Companions (Luke Triton, Tails, Pikachu, Navi, Tatl, Starlow, Toad, Kirby, Yoshi, Chocobo)
        private val CHILD_FAIRY_COMPANION_KEYWORDS = setOf(
            "люк", "тейлз", "тейлс", "пикачу", "нави", "старлоу", "тоад", "тоадетта", "фея", "малыш", "ребенок",
            "татл", "мальчик", "дитя", "соник", "пика-пика", "ура", "ура-а", "кирби", "йоши", "чокобо", "мугл",
            "малыш марио", "малыш луиджи", "слушай!", "хей!",
            "luke", "tails", "pikachu", "navi", "starlow", "toad", "toadette", "fairy", "child", "kid",
            "boy", "sonic", "kirby", "yoshi", "chocobo", "moogle", "listen", "hey"
        )

        // 9. Robots, AI & Futuristic Tech (Robo, Omega-Xis, Geo Stelar, Pokedex, Computer, Metal Sonic, E-123 Omega)
        private val ROBOTIC_AI_TECH_KEYWORDS = setOf(
            "робо", "омега", "покедекс", "компьютер", "робот", "дроид", "система", "протокол", "директива",
            "метал соник", "бортовой компьютер", "терминал", "инициализация", "сбой программы", "анализ данных",
            "robo", "omega", "pokedex", "computer", "robot", "droid", "system", "protocol", "directive"
        )

        // 10. Young Male Heroes & Protagonists (Mario, Luigi, Link, Sonic, Crono, Neku, Mega Man, Red, Ethan, Sora, Roxas)
        private val HERO_PROTAGONIST_MALE_KEYWORDS = setOf(
            "марио", "луиджи", "линк", "соник", "хроно", "кроно", "неку", "рокмен", "мегамен", "ред",
            "этан", "хильберт", "нейт", "сора", "роксас", "вентус", "юси", "джинг", "данте",
            "mario", "luigi", "link", "sonic", "crono", "neku", "megaman", "red", "ethan", "sora", "roxas"
        )
    }

    enum class CharacterPersona {
        HERO_DARK_VIGILANTE,   // Batman, Snake, Wesker, Kratos
        VILLAIN_MANIC_JOKER,   // Joker, Fawful, Kefka, Dimentio
        DEMONIC_DEVILISH,      // Death, Dracula, Akuma, Giratina, Mewtwo
        ANGELIC_DIVINE,        // Palutena, Hylia, Pit, Arceus, Great Fairy
        GENTLEMAN_SCHOLAR,     // Layton, Edgeworth, Phoenix, Oak
        ELDER_ANCIENT_BOSS,    // The Judge, Bowser, Ganon, Eggman, Dedede
        HEROINE_FEMALE,        // Zelda, Peach, Maya, Franziska, Shanoa
        CHILD_FAIRY_COMPANION, // Luke, Tails, Pikachu, Navi, Starlow
        ROBOTIC_AI_TECH,       // Robo, Omega-Xis, Pokedex, System AI
        HERO_PROTAGONIST_MALE, // Mario, Link, Sonic, Crono, Sora
        NARRATOR_CHRONICLE     // World chronicle & descriptions
    }

    private val preferences: SharedPreferences = PreferenceManager.getDefaultSharedPreferences(context)
    private var tts: TextToSpeech? = null
    private var isReady = false
    private var availableVoices: List<Voice> = emptyList()
    private val scope = CoroutineScope(Dispatchers.IO)
    private var mediaPlayer: MediaPlayer? = null

    private val httpClient = OkHttpClient.Builder()
        .connectTimeout(6, TimeUnit.SECONDS)
        .readTimeout(8, TimeUnit.SECONDS)
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
                    Log.i(TAG, "TTS initialized. Available voices count: ${availableVoices.size}")
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

    private var lastActivePersona: CharacterPersona = CharacterPersona.HERO_PROTAGONIST_MALE

    fun speak(text: String, targetLang: String = "ru") {
        if (text.isBlank()) return

        // 1. Normalization of accents, gaming terminology, and numbers
        val normalizedText = RussianTtsNormalizer.normalize(text, targetLang)

        val engine = preferences.getString(PREF_TRANSLATOR_TTS_VOICE_ENGINE, "neural_edge") ?: "neural_edge"
        val isNeural = engine == "neural_edge" || preferences.getBoolean(PREF_TRANSLATOR_TTS_NEURAL_ENABLED, false)
        val multiVoiceEnabled = engine != "single" && preferences.getBoolean(PREF_TRANSLATOR_TTS_MULTI_VOICE, true)
        val baseSpeed = (preferences.getInt(PREF_TRANSLATOR_TTS_SPEED, 100) / 100f).coerceIn(0.6f, 1.8f)

        // Detect speaker / persona across context graph and text
        val detected = detectPersona(normalizedText)
        val personaStr = me.magnum.melonds.translator.context.OcrContextGraph.getNextTurnPersona(normalizedText, detected.name)
        val activePersona = runCatching { CharacterPersona.valueOf(personaStr) }.getOrDefault(detected)
        lastActivePersona = activePersona

        if (isNeural) {
            // Synthesize coherent speech for the active persona with no sentence cutoff
            speakNeuralCloud(normalizedText, targetLang, activePersona, baseSpeed)
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
            applyPersonaVoice(activePersona, baseSpeed, locale)
            tts?.speak(normalizedText, TextToSpeech.QUEUE_FLUSH, null, "game_tts_${System.currentTimeMillis()}")
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

                // Resolve authentic Edge Neural Voice Actor based on Persona & Language
                val (voiceName, ssmlPitch, ssmlRate) = when (langCode) {
                    "ru" -> when (persona) {
                        CharacterPersona.HERO_DARK_VIGILANTE -> Triple("ru-RU-DmitryNeural", "-16%", "-10%")
                        CharacterPersona.VILLAIN_MANIC_JOKER -> Triple("ru-RU-DmitryNeural", "+26%", "+24%")
                        CharacterPersona.DEMONIC_DEVILISH -> Triple("ru-RU-DmitryNeural", "-36%", "-20%")
                        CharacterPersona.ANGELIC_DIVINE -> Triple("ru-RU-SvetlanaNeural", "+15%", "-5%")
                        CharacterPersona.GENTLEMAN_SCHOLAR -> Triple("ru-RU-DmitryNeural", "-4%", "-5%")
                        CharacterPersona.ELDER_ANCIENT_BOSS -> Triple("ru-RU-DmitryNeural", "-24%", "-15%")
                        CharacterPersona.HEROINE_FEMALE -> Triple("ru-RU-SvetlanaNeural", "+2%", "0%")
                        CharacterPersona.CHILD_FAIRY_COMPANION -> Triple("ru-RU-SvetlanaNeural", "+38%", "+16%")
                        CharacterPersona.ROBOTIC_AI_TECH -> Triple("ru-RU-DmitryNeural", "-18%", "+5%")
                        CharacterPersona.HERO_PROTAGONIST_MALE -> Triple("ru-RU-DmitryNeural", "+6%", "+2%")
                        CharacterPersona.NARRATOR_CHRONICLE -> Triple("ru-RU-DmitryNeural", "0%", "0%")
                    }
                    "ja" -> when (persona) {
                        CharacterPersona.HEROINE_FEMALE, CharacterPersona.ANGELIC_DIVINE, CharacterPersona.CHILD_FAIRY_COMPANION ->
                            Triple("ja-JP-NanamiNeural", "+2%", "0%")
                        else -> Triple("ja-JP-KeitaNeural", "0%", "0%")
                    }
                    else -> when (persona) {
                        CharacterPersona.HERO_DARK_VIGILANTE -> Triple("en-US-GuyNeural", "-15%", "-10%")
                        CharacterPersona.VILLAIN_MANIC_JOKER -> Triple("en-US-ChristopherNeural", "+25%", "+22%")
                        CharacterPersona.HEROINE_FEMALE -> Triple("en-US-JennyNeural", "+2%", "0%")
                        CharacterPersona.CHILD_FAIRY_COMPANION -> Triple("en-US-AnaNeural", "+15%", "+6%")
                        CharacterPersona.ELDER_ANCIENT_BOSS -> Triple("en-US-RogerNeural", "-15%", "-10%")
                        else -> Triple("en-US-GuyNeural", "0%", "0%")
                    }
                }

                // 1. Synthesize via High-Definition Live Edge Neural engine
                val audioBytes = EdgeNeuralTtsClient.synthesize(
                    text = text,
                    voiceName = voiceName,
                    pitch = ssmlPitch,
                    rate = ssmlRate
                )

                if (audioBytes == null || audioBytes.isEmpty()) {
                    throw IllegalStateException("Edge Neural TTS unavailable, routing to local multi-voice engine")
                }

                val tempFile = File(context.cacheDir, "storm_neural_speech_${System.currentTimeMillis()}.mp3")
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

                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                            try {
                                val params = PlaybackParams()
                                params.speed = baseSpeed
                                playbackParams = params
                            } catch (_: Throwable) {}
                        }

                        start()
                        setOnCompletionListener {
                            tempFile.delete()
                        }
                    }
                }
                Log.i(TAG, "Live Neural Voice synthesized [$voiceName] for [$persona]")
            } catch (e: Throwable) {
                Log.i(TAG, "Routing [$persona] to native Multi-Voice TTS: ${e.message}")
                withContext(Dispatchers.Main) {
                    val locale = getSelectedLanguage()
                    applyPersonaVoice(persona, baseSpeed, locale)
                    tts?.speak(text, TextToSpeech.QUEUE_ADD, null, "game_tts_fallback_${System.currentTimeMillis()}")
                }
            }
        }
    }

    private fun detectPersona(text: String): CharacterPersona {
        val lower = text.lowercase()
        val lines = text.lines().map { it.trim() }.filter { it.isNotEmpty() }
        val firstLine = lines.firstOrNull() ?: ""
        val firstLineLower = firstLine.lowercase()

        // 1. Explicit Speaker Tag Extraction (e.g. "Бэтмен:", "[Joker]", "【Layton】", "Зельда —", "(Phoenix)", "BATMAN\n...")
        val candidateSpeaker = when {
            firstLineLower.contains(":") -> firstLineLower.substringBefore(":").trim()
            firstLineLower.contains("—") -> firstLineLower.substringBefore("—").trim()
            firstLineLower.contains("-") && firstLineLower.length <= 25 -> firstLineLower.substringBefore("-").trim()
            firstLineLower.startsWith("[") && firstLineLower.contains("]") -> firstLineLower.substringAfter("[").substringBefore("]").trim()
            firstLineLower.startsWith("【") && firstLineLower.contains("】") -> firstLineLower.substringAfter("【").substringBefore("】").trim()
            firstLineLower.startsWith("«") && firstLineLower.contains("»") -> firstLineLower.substringAfter("«").substringBefore("»").trim()
            firstLineLower.startsWith("(") && firstLineLower.contains(")") && firstLineLower.length <= 25 -> firstLineLower.substringAfter("(").substringBefore(")").trim()
            lines.size >= 2 && firstLineLower.length <= 25 && !firstLineLower.endsWith(".") && !firstLineLower.endsWith(",") && !firstLineLower.endsWith("?") && !firstLineLower.endsWith("!") -> firstLineLower
            else -> ""
        }.trim()

        if (candidateSpeaker.isNotEmpty()) {
            if (HERO_DARK_VIGILANTE_KEYWORDS.any { candidateSpeaker.contains(it) || it.contains(candidateSpeaker) }) return CharacterPersona.HERO_DARK_VIGILANTE
            if (VILLAIN_MANIC_JOKER_KEYWORDS.any { candidateSpeaker.contains(it) || it.contains(candidateSpeaker) }) return CharacterPersona.VILLAIN_MANIC_JOKER
            if (DEMONIC_DEVILISH_KEYWORDS.any { candidateSpeaker.contains(it) || it.contains(candidateSpeaker) }) return CharacterPersona.DEMONIC_DEVILISH
            if (ANGELIC_DIVINE_KEYWORDS.any { candidateSpeaker.contains(it) || it.contains(candidateSpeaker) }) return CharacterPersona.ANGELIC_DIVINE
            if (GENTLEMAN_SCHOLAR_KEYWORDS.any { candidateSpeaker.contains(it) || it.contains(candidateSpeaker) }) return CharacterPersona.GENTLEMAN_SCHOLAR
            if (ELDER_ANCIENT_BOSS_KEYWORDS.any { candidateSpeaker.contains(it) || it.contains(candidateSpeaker) }) return CharacterPersona.ELDER_ANCIENT_BOSS
            if (HEROINE_FEMALE_KEYWORDS.any { candidateSpeaker.contains(it) || it.contains(candidateSpeaker) }) return CharacterPersona.HEROINE_FEMALE
            if (CHILD_FAIRY_COMPANION_KEYWORDS.any { candidateSpeaker.contains(it) || it.contains(candidateSpeaker) }) return CharacterPersona.CHILD_FAIRY_COMPANION
            if (ROBOTIC_AI_TECH_KEYWORDS.any { candidateSpeaker.contains(it) || it.contains(candidateSpeaker) }) return CharacterPersona.ROBOTIC_AI_TECH
            if (HERO_PROTAGONIST_MALE_KEYWORDS.any { candidateSpeaker.contains(it) || it.contains(candidateSpeaker) }) return CharacterPersona.HERO_PROTAGONIST_MALE
        }

        // 2. Behavioral & Dialogue Vocative Triggers
        if (lower.contains("ха-ха") || lower.contains("хи-хи") || lower.contains("ахаха") || lower.contains("хе-хе") ||
            lower.contains("hahaha") || lower.contains("hehe") || lower.contains("моя ловушка") || lower.contains("моя игра") ||
            lower.contains("глупый мышонок") || lower.contains("веселье") || lower.contains("шутка")) {
            return CharacterPersona.VILLAIN_MANIC_JOKER
        }

        if (lower.startsWith("бэтмен") || lower.startsWith("batman") || lower.contains("мышонок") || lower.contains("темный рыцарь")) {
            return CharacterPersona.VILLAIN_MANIC_JOKER
        }

        if (lower.contains("джокер") || lower.contains("joker") || lower.contains("сдавайся") || lower.contains("город под защитой") ||
            lower.contains("где детонатор") || lower.contains("аркхэм") || lower.contains("отвечай!")) {
            return CharacterPersona.HERO_DARK_VIGILANTE
        }

        if (lower.contains("протестую") || lower.contains("objection") || lower.contains("головоломка") || lower.contains("загадка") ||
            lower.contains("джентльмен") || lower.contains("улика") || lower.contains("перекрестный допрос")) {
            return CharacterPersona.GENTLEMAN_SCHOLAR
        }

        // 3. Keyword Content Analysis Across Entire Text
        if (DEMONIC_DEVILISH_KEYWORDS.any { lower.contains(it) }) return CharacterPersona.DEMONIC_DEVILISH
        if (ANGELIC_DIVINE_KEYWORDS.any { lower.contains(it) }) return CharacterPersona.ANGELIC_DIVINE
        if (HERO_DARK_VIGILANTE_KEYWORDS.any { lower.contains(it) }) return CharacterPersona.HERO_DARK_VIGILANTE
        if (VILLAIN_MANIC_JOKER_KEYWORDS.any { lower.contains(it) }) return CharacterPersona.VILLAIN_MANIC_JOKER
        if (GENTLEMAN_SCHOLAR_KEYWORDS.any { lower.contains(it) }) return CharacterPersona.GENTLEMAN_SCHOLAR
        if (ELDER_ANCIENT_BOSS_KEYWORDS.any { lower.contains(it) }) return CharacterPersona.ELDER_ANCIENT_BOSS
        if (HEROINE_FEMALE_KEYWORDS.any { lower.contains(it) }) return CharacterPersona.HEROINE_FEMALE
        if (CHILD_FAIRY_COMPANION_KEYWORDS.any { lower.contains(it) }) return CharacterPersona.CHILD_FAIRY_COMPANION
        if (ROBOTIC_AI_TECH_KEYWORDS.any { lower.contains(it) }) return CharacterPersona.ROBOTIC_AI_TECH
        if (HERO_PROTAGONIST_MALE_KEYWORDS.any { lower.contains(it) }) return CharacterPersona.HERO_PROTAGONIST_MALE

        return CharacterPersona.NARRATOR_CHRONICLE
    }

    private fun applyPersonaVoice(persona: CharacterPersona, baseSpeed: Float, locale: Locale) {
        val isLangMatching = { v: Voice -> v.locale.language == locale.language }
        val langVoices = availableVoices.filter(isLangMatching)

        // Classify distinct male and female voices installed on Android
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

        val isMalePersona = when (persona) {
            CharacterPersona.HERO_DARK_VIGILANTE,
            CharacterPersona.VILLAIN_MANIC_JOKER,
            CharacterPersona.DEMONIC_DEVILISH,
            CharacterPersona.GENTLEMAN_SCHOLAR,
            CharacterPersona.ELDER_ANCIENT_BOSS,
            CharacterPersona.ROBOTIC_AI_TECH,
            CharacterPersona.HERO_PROTAGONIST_MALE,
            CharacterPersona.NARRATOR_CHRONICLE -> true
            else -> false
        }

        try {
            if (isMalePersona) {
                if (primaryMaleVoice != null) {
                    tts?.voice = primaryMaleVoice
                } else if (primaryFemaleVoice != null && tts?.voice == primaryFemaleVoice) {
                    tts?.voice = tts?.defaultVoice
                }
            } else {
                if (primaryFemaleVoice != null) {
                    tts?.voice = primaryFemaleVoice
                }
            }
        } catch (_: Throwable) {}

        when (persona) {
            CharacterPersona.HERO_DARK_VIGILANTE -> {
                if (primaryMaleVoice != null) {
                    try { tts?.voice = primaryMaleVoice } catch (_: Throwable) {}
                }
                // Super deep, authoritative, gritty baritone
                tts?.setPitch(0.42f)
                tts?.setSpeechRate(baseSpeed * 0.82f)
            }
            CharacterPersona.VILLAIN_MANIC_JOKER -> {
                if (secondaryMaleVoice != null) {
                    try { tts?.voice = secondaryMaleVoice } catch (_: Throwable) {}
                }
                // High-pitched, wild, manic cadence
                tts?.setPitch(1.40f)
                tts?.setSpeechRate(baseSpeed * 1.32f)
            }
            CharacterPersona.DEMONIC_DEVILISH -> {
                if (primaryMaleVoice != null) {
                    try { tts?.voice = primaryMaleVoice } catch (_: Throwable) {}
                }
                // Subterranean demonic bass
                tts?.setPitch(0.30f)
                tts?.setSpeechRate(baseSpeed * 0.70f)
            }
            CharacterPersona.ANGELIC_DIVINE -> {
                if (secondaryFemaleVoice != null) {
                    try { tts?.voice = secondaryFemaleVoice } catch (_: Throwable) {}
                }
                // Serene celestial tone
                tts?.setPitch(1.45f)
                tts?.setSpeechRate(baseSpeed * 0.95f)
            }
            CharacterPersona.GENTLEMAN_SCHOLAR -> {
                if (primaryMaleVoice != null) {
                    try { tts?.voice = primaryMaleVoice } catch (_: Throwable) {}
                }
                // Calm, cultured gentleman baritone
                tts?.setPitch(0.78f)
                tts?.setSpeechRate(baseSpeed * 0.90f)
            }
            CharacterPersona.ELDER_ANCIENT_BOSS -> {
                if (primaryMaleVoice != null) {
                    try { tts?.voice = primaryMaleVoice } catch (_: Throwable) {}
                }
                // Heavy ancient judge/boss bass
                tts?.setPitch(0.36f)
                tts?.setSpeechRate(baseSpeed * 0.74f)
            }
            CharacterPersona.HEROINE_FEMALE -> {
                if (primaryFemaleVoice != null) {
                    try { tts?.voice = primaryFemaleVoice } catch (_: Throwable) {}
                }
                // Melodic expressive heroine voice
                tts?.setPitch(1.25f)
                tts?.setSpeechRate(baseSpeed * 1.02f)
            }
            CharacterPersona.CHILD_FAIRY_COMPANION -> {
                if (secondaryFemaleVoice != null) {
                    try { tts?.voice = secondaryFemaleVoice } catch (_: Throwable) {}
                }
                // Cheerful kid/fairy tone
                tts?.setPitch(1.75f)
                tts?.setSpeechRate(baseSpeed * 1.20f)
            }
            CharacterPersona.ROBOTIC_AI_TECH -> {
                if (primaryMaleVoice != null) {
                    try { tts?.voice = primaryMaleVoice } catch (_: Throwable) {}
                }
                // Robotic monotone cadence
                tts?.setPitch(0.40f)
                tts?.setSpeechRate(baseSpeed * 1.04f)
            }
            CharacterPersona.HERO_PROTAGONIST_MALE -> {
                if (primaryMaleVoice != null) {
                    try { tts?.voice = primaryMaleVoice } catch (_: Throwable) {}
                }
                // Energetic young hero
                tts?.setPitch(0.88f)
                tts?.setSpeechRate(baseSpeed * 1.00f)
            }
            CharacterPersona.NARRATOR_CHRONICLE -> {
                if (primaryMaleVoice != null) {
                    try { tts?.voice = primaryMaleVoice } catch (_: Throwable) {}
                }
                // Balanced storyteller voice
                tts?.setPitch(0.98f)
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

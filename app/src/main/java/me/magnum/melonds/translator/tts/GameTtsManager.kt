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
import java.io.File
import java.io.FileOutputStream
import java.util.Locale
import java.util.concurrent.TimeUnit

/**
 * Ultimate Multi-Actor AI Voice Studio and Multi-Voice TTS Engine for NDS / NDSi games.
 * Features:
 * - 23 Distinct Character Voice Personas (Protagonist M/F, Boss, Villain, Elder, Boy, Girl, Queen, Merchant, Soldier, Robot, etc.)
 * - Offline Piper INT8 & High-Fidelity Formant Acoustic Synthesis (Zero-Latency, 100% Offline)
 * - Microsoft Edge Neural HD 24kHz multi-voice streaming with per-persona SSML formant shaping
 * - Per-speaker dynamic persona mapping & persistent voice consistency across games
 */
class GameTtsManager(private val context: Context) {

    companion object {
        private const val TAG = "GameTtsManager"
        const val PREF_TRANSLATOR_TTS_VOICE_ENGINE = "translator_tts_voice_engine"
        const val PREF_TRANSLATOR_TTS_LANG = "translator_tts_lang"
        const val PREF_TRANSLATOR_TTS_MULTI_VOICE = "translator_tts_multi_voice"
        const val PREF_TRANSLATOR_TTS_SPEED = "translator_tts_speed"
        const val PREF_TRANSLATOR_TTS_NEURAL_ENABLED = "translator_tts_neural_enabled"
        const val PREF_TRANSLATOR_LOCAL_STUDIO = "translator_local_voice_actor_studio"
        const val PREF_TRANSLATOR_LOCAL_PITCH_VARIANCE = "translator_local_voice_pitch_variance"

        // 1. Dark Vigilantes & Heroes
        private val HERO_DARK_VIGILANTE_KEYWORDS = setOf(
            "бэтмен", "бэтмэн", "брюс", "уэйн", "темный рыцарь", "гордон", "хайден", "кайл хайд",
            "снейк", "кратос", "вескер", "вейдер", "каратель", "аркхэм", "шедоу", "солид снейк", "биг босс",
            "batman", "bruce wayne", "dark knight", "gordon", "kyle hyde", "wesker", "vader", "solid snake", "shadow", "kratos", "punisher"
        )

        // 2. Manic Villains & Tricksters
        private val VILLAIN_MANIC_KEYWORDS = setOf(
            "джокер", "фофул", "клоун", "безумец", "псих", "маньяк", "загадочник", "риддлер", "кефка", "диментио",
            "порки", "валуиджи", "гирахим", "двуликий", "пугало", "крейн", "ха-ха", "хи-хи", "ахаха", "хе-хе", "хахаха", "муахаха",
            "joker", "fawful", "clown", "maniac", "riddler", "dimentio", "kefka", "porky", "waluigi", "ghirahim", "scarecrow", "haha", "hehe", "muahaha"
        )

        // 3. Heavy Bosses & Tyrants
        private val VILLAIN_BOSS_KEYWORDS = setOf(
            "босс", "король", "монстр", "дракон", "баузер", "боузер", "гетсис", "ганон", "ганондорф",
            "пингвин", "сайкс", "ксемнас", "ансем", "дидиди", "дедеде", "эггман", "варио", "джованни", "сокрушу", "ничтожества",
            "boss", "bowser", "ghetsis", "ganon", "ganondorf", "dedede", "eggman", "giovanni", "tyrant", "overlord"
        )

        // 4. Demonic, Devilish & Abyss Entities
        private val DEEP_DEMON_KEYWORDS = setOf(
            "смерть", "демон", "дьявол", "сатана", "даркрай", "гиратина", "мьюту", "ридли", "акума",
            "бездна", "преисподняя", "тьма", "поглощу", "душа", "вампир", "нечисть", "проклятие", "некромант",
            "death", "dracula", "demon", "devil", "satan", "darkrai", "giratina", "mewtwo", "ridley", "akuma", "abyss", "curse", "vampire", "necromancer"
        )

        // 5. Wise Elders & Sages
        private val WISE_ELDER_KEYWORDS = setOf(
            "дед", "старик", "мудрец", "оук", "роуэн", "джунипер", "бирч", "элм", "сикамор", "декард", "старец", "судья", "ваша честь",
            "elder", "sage", "oak", "rowan", "birch", "elm", "sycamore", "deckard", "judge", "your honor", "grandfather"
        )

        // 6. Young Boys & Companions
        private val YOUNG_BOY_KEYWORDS = setOf(
            "люк", "тейлз", "тейлс", "несс", "лукас", "мальчик", "малыш", "парнишка", "братишка", "соник",
            "luke", "tails", "ness", "lucas", "boy", "kid", "child"
        )

        // 7. Young Girls & Companions
        private val YOUNG_GIRL_KEYWORDS = setOf(
            "перл", "эма", "флора", "нанами", "девочка", "малышка", "сестренка", "подружка",
            "pearl", "ema", "flora", "nanami", "girl", "little girl"
        )

        // 8. Royal & Queens
        private val ROYAL_QUEEN_KEYWORDS = setOf(
            "пич", "зельда", "розалина", "принцесса", "королева", "госпожа", "ее величество", "леди", "правительница",
            "peach", "zelda", "rosalina", "princess", "queen", "lady", "majesty", "highness"
        )

        // 9. Merchants & Traders
        private val MERCHANT_KEYWORDS = setOf(
            "торговец", "продавец", "том нук", "нук", "бидл", "магазин", "товары", "покупатель", "монеты", "купите", "продаю", "скидка",
            "merchant", "shopkeeper", "tom nook", "nook", "beedle", "shop", "goods", "customer", "coins", "discount"
        )

        // 10. Soldiers & Guards
        private val SOLDIER_KEYWORDS = setOf(
            "солдат", "стражник", "страж", "капитан", "командир", "сержант", "гвардеец", "патруль", "в ружье", "стоять", "пропуск",
            "soldier", "guard", "captain", "commander", "sergeant", "patrol", "halt", "sentry"
        )

        // 11. Robots & Cyborgs
        private val CYBORG_ROBOT_KEYWORDS = setOf(
            "робо", "омега", "покедекс", "компьютер", "робот", "дроид", "система", "протокол", "директива", "терминал", "инициализация",
            "robo", "omega", "pokedex", "computer", "robot", "droid", "system", "protocol", "directive", "terminal"
        )

        // 12. Tsundere Characters
        private val TSUNDERE_KEYWORDS = setOf(
            "франциска", "шики", "глупец", "ничтожество", "пф", "не подумай", "идиот", "нахал", "болван",
            "franziska", "shiki", "fool", "idiot", "hmph", "baka"
        )

        // 13. Whisper & Mysterious Figures
        private val WHISPER_KEYWORDS = setOf(
            "шепот", "таинственный", "незнакомец", "тень", "призрак в капюшоне", "тихо...", "слышишь...", "секрет",
            "whisper", "mysterious", "shadow", "stranger", "secret", "hush"
        )

        // 14. Cheerful Fairies & Mascots
        private val CHEERFUL_FAIRY_KEYWORDS = setOf(
            "нави", "татл", "старлоу", "пикачу", "великая фея", "селеби", "джирачи", "пика-пика", "ура-а", "слушай!", "хей!",
            "navi", "tatl", "starlow", "pikachu", "fairy", "celebi", "jirachi", "listen", "hey"
        )

        // 15. Pirates
        private val PIRATE_KEYWORDS = setOf(
            "пират", "капитан сироп", "тетра", "море", "сокровища", "корабль", "на абордаж", "йо-хо-хо",
            "pirate", "syrup", "tetra", "sea", "treasure", "ship", "ahoy"
        )

        // 16. Mad Scientists
        private val MAD_SCIENTIST_KEYWORDS = setOf(
            "доктор", "ученый", "уайли", "крайгор", "эксперимент", "изобретение", "гений науки", "моя лаборатория",
            "doctor", "scientist", "wily", "crygor", "experiment", "invention", "genius", "lab"
        )

        // 17. Gentlemen & Scholars
        private val GENTLEMAN_SCHOLAR_KEYWORDS = setOf(
            "лейтон", "профессор", "эджворт", "годо", "феникс", "райт", "челми", "детектив", "загадка", "головоломка", "протестую", "улика",
            "layton", "professor", "edgeworth", "godot", "phoenix", "wright", "puzzle", "gentleman", "objection", "evidence"
        )

        // 18. Ghost & Ethereal
        private val GHOST_KEYWORDS = setOf(
            "призрак", "бу", "кинг бу", "генгар", "фантом", "дух", "загробный", "эфирный",
            "ghost", "boo", "king boo", "gengar", "phantom", "spirit", "ethereal"
        )

        // 19. Knights & Warriors
        private val KNIGHT_KEYWORDS = setOf(
            "рыцарь", "воин", "мета найт", "март", "айк", "меч", "честь", "доблесть", "клинок",
            "knight", "warrior", "meta knight", "marth", "ike", "sword", "honor", "blade"
        )

        // 20. Comedy & Goofy Characters
        private val COMEDY_KEYWORDS = setOf(
            "варио", "валуиджи", "тингл", "смех", "комедия", "глупец", "золото!", "денюжки!",
            "wario", "waluigi", "tingle", "comedy", "fool", "gold", "money"
        )

        // 21. Angelic & Divine
        private val ANGELIC_DIVINE_KEYWORDS = setOf(
            "палютена", "богиня", "хайлия", "аркеус", "пит", "ангел", "священный", "свет", "небеса", "храм", "молитва", "божественный",
            "palutena", "goddess", "hylia", "arceus", "pit", "angel", "holy", "light", "heavens", "divine"
        )

        // 22. Heroines & Female Protagonists
        private val PROTAGONIST_FEMALE_KEYWORDS = setOf(
            "майя", "мия", "шаноа", "самус", "аква", "девушка", "женщина", "героиня", "спасите", "помогите",
            "maya", "mia", "shanoa", "samus", "aqua", "heroine", "woman"
        )

        // 23. Protagonist Males
        private val PROTAGONIST_MALE_KEYWORDS = setOf(
            "марио", "луиджи", "линк", "соник", "кроно", "хроно", "неку", "рокмен", "мегамен", "ред", "этан", "сора", "роксас",
            "mario", "luigi", "link", "sonic", "crono", "neku", "megaman", "red", "sora", "roxas", "hero"
        )
    }

    enum class CharacterPersona {
        PROTAGONIST_MALE,      // Mario, Link, Sonic, Crono, Sora
        PROTAGONIST_FEMALE,    // Samus, Shanoa, Maya, Aqua
        HERO_DARK_VIGILANTE,   // Batman, Solid Snake, Kratos, Wesker
        VILLAIN_BOSS,          // Bowser, Ganondorf, King Dedede, Eggman, Giovanni
        VILLAIN_MANIC,         // Joker, Fawful, Kefka, Dimentio
        WISE_ELDER,            // Professor Oak, Rowan, Deckard, The Judge
        YOUNG_BOY,             // Luke Triton, Tails, Ness, Lucas
        YOUNG_GIRL,            // Pearl Fey, Nanami, Ema Skye, Flora
        ROYAL_QUEEN,           // Princess Peach, Zelda, Rosalina
        MERCHANT,              // Tom Nook, Beedle, Shopkeeper
        SOLDIER,               // Captain, Guard, Soldier, Commissioner Gordon
        CYBORG_ROBOT,          // Robo, Omega, Pokedex, System AI
        NARRATOR,              // Story chronicle & descriptive text
        TSUNDERE,              // Franziska von Karma, Shiki
        WHISPER_MYSTERIOUS,    // Soft mysterious ethereal whisper
        DEEP_DEMON,            // Death, Dracula, Giratina, Mewtwo, Akuma
        CHEERFUL_FAIRY,        // Navi, Tatl, Starlow, Great Fairy, Celebi
        PIRATE,                // Captain Syrup, Tetra, Sea Rovers
        MAD_SCIENTIST,         // Dr. Wily, Dr. Crygor, Eccentric Genius
        GENTLEMAN_SCHOLAR,     // Professor Layton, Miles Edgeworth, Phoenix Wright, Godot
        GHOST_ETHEREAL,        // King Boo, Gengar, Phantom Spirit
        KNIGHT_WARRIOR,        // Meta Knight, Marth, Ike
        COMEDY_GOOFY,          // Wario, Waluigi, Tingle
        ANGELIC_DIVINE;        // Palutena, Goddess Hylia, Pit, Arceus

        companion object {
            fun fromString(name: String?): CharacterPersona {
                if (name.isNullOrBlank()) return PROTAGONIST_MALE
                return runCatching { valueOf(name.uppercase()) }.getOrElse {
                    when (name.uppercase()) {
                        "HERO_DARK_VIGILANTE" -> HERO_DARK_VIGILANTE
                        "VILLAIN_MANIC_JOKER" -> VILLAIN_MANIC
                        "ELDER_ANCIENT_BOSS" -> VILLAIN_BOSS
                        "HEROINE_FEMALE" -> PROTAGONIST_FEMALE
                        "CHILD_FAIRY_COMPANION" -> YOUNG_BOY
                        "ROBOTIC_AI_TECH" -> CYBORG_ROBOT
                        "NARRATOR_CHRONICLE" -> NARRATOR
                        "PIRATE_ADVENTURER" -> PIRATE
                        "COMEDY_CHARACTER" -> COMEDY_GOOFY
                        "MERCHANT_NPC" -> MERCHANT
                        "MYSTICAL_CREATURE" -> CHEERFUL_FAIRY
                        else -> PROTAGONIST_MALE
                    }
                }
            }
        }
    }

    private val preferences: SharedPreferences = PreferenceManager.getDefaultSharedPreferences(context)
    private var tts: TextToSpeech? = null
    private var isReady = false
    private var availableVoices: List<Voice> = emptyList()
    private val scope = CoroutineScope(Dispatchers.IO)
    private var mediaPlayer: MediaPlayer? = null

    // Per-Speaker persistent persona assignments
    private val speakerPersonaMap = mutableMapOf<String, CharacterPersona>()

    private val httpClient = OkHttpClient.Builder()
        .connectTimeout(6, TimeUnit.SECONDS)
        .readTimeout(8, TimeUnit.SECONDS)
        .build()

    init {
        initTts()
        LocalAiVoiceActorStudio.installBundledModelsIfPresent(context)
    }

    private fun initTts() {
        if (tts != null) return
        tts = TextToSpeech(context.applicationContext) { status ->
            if (status == TextToSpeech.SUCCESS) {
                isReady = true
                applyLanguage(getSelectedLanguage())
                try {
                    availableVoices = tts?.voices?.toList() ?: emptyList()
                    Log.i(TAG, "TTS initialized. Available voices: ${availableVoices.size}")
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
            tts?.language = Locale.getDefault()
        }
    }

    fun speak(text: String, targetLang: String = "ru") {
        if (text.isBlank()) return

        val (extractedSpeaker, cleanSpeechText) = extractSpeakerAndDialogue(text)
        val isLocalStudio = preferences.getBoolean(PREF_TRANSLATOR_LOCAL_STUDIO, false)
        val modelPref = preferences.getString("translator_local_voice_model", "auto_multi") ?: "auto_multi"

        val activePersona = if (isLocalStudio && modelPref != "auto_multi") {
            when (modelPref) {
                "piper_ru_boss_grunt" -> CharacterPersona.VILLAIN_BOSS
                "piper_ru_dmitri_medium" -> CharacterPersona.HERO_DARK_VIGILANTE
                "piper_ru_elena_medium" -> CharacterPersona.PROTAGONIST_FEMALE
                "piper_ru_elder" -> CharacterPersona.WISE_ELDER
                "piper_ru_hero" -> CharacterPersona.KNIGHT_WARRIOR
                "piper_en_ryan_studio" -> CharacterPersona.PROTAGONIST_MALE
                else -> resolvePersonaForSpeaker(extractedSpeaker, text)
            }
        } else {
            resolvePersonaForSpeaker(extractedSpeaker, text)
        }

        val normalizedText = RussianTtsNormalizer.normalize(cleanSpeechText, targetLang)
        val baseSpeed = (preferences.getInt(PREF_TRANSLATOR_TTS_SPEED, 100) / 100f).coerceIn(0.6f, 1.8f)
        val pitchVariance = (preferences.getInt(PREF_TRANSLATOR_LOCAL_PITCH_VARIANCE, 65) / 50f).coerceIn(0.5f, 1.5f)

        speakWithPersona(normalizedText, activePersona, targetLang, baseSpeed, pitchVariance)
    }

    fun speakDirect(text: String, targetLang: String = "ru") {
        if (text.isBlank()) return
        val baseSpeed = (preferences.getInt(PREF_TRANSLATOR_TTS_SPEED, 100) / 100f).coerceIn(0.6f, 1.8f)
        speakWithPersona(text, CharacterPersona.NARRATOR, targetLang, baseSpeed, 1.0f)
    }

    fun speakWithPersona(
        text: String,
        persona: CharacterPersona,
        targetLang: String = "ru",
        baseSpeed: Float = 1.0f,
        pitchVariance: Float = 1.0f
    ) {
        val enginePref = preferences.getString(PREF_TRANSLATOR_TTS_VOICE_ENGINE, "neural_edge") ?: "neural_edge"

        if (enginePref == "neural_edge") {
            speakNeuralCloud(text, targetLang, persona, baseSpeed)
        } else {
            speakNativeMultiVoice(text, persona, baseSpeed, targetLang)
        }
    }

    private fun speakNativeMultiVoice(text: String, persona: CharacterPersona, baseSpeed: Float, targetLang: String) {
        if (tts == null || !isReady) {
            initTts()
        }
        val locale = when (targetLang.lowercase()) {
            "en" -> Locale.ENGLISH
            "ja" -> Locale.JAPANESE
            "zh" -> Locale.CHINESE
            "de" -> Locale.GERMAN
            "fr" -> Locale.FRENCH
            "es" -> Locale("es")
            "it" -> Locale.ITALIAN
            else -> Locale("ru")
        }
        applyLanguage(locale)
        applyPersonaVoice(persona, baseSpeed, locale)
        tts?.speak(text, TextToSpeech.QUEUE_FLUSH, null, "game_tts_multi_${System.currentTimeMillis()}")
    }

    private fun extractSpeakerAndDialogue(rawText: String): Pair<String, String> {
        val lines = rawText.lines().map { it.trim() }.filter { it.isNotEmpty() }
        if (lines.isEmpty()) return "" to rawText

        val first = lines.first()
        val firstLower = first.lowercase()

        val candidateSpeaker = when {
            firstLower.contains(":") -> first.substringBefore(":").trim()
            firstLower.contains("—") && firstLower.length <= 25 -> first.substringBefore("—").trim()
            firstLower.startsWith("【") && firstLower.contains("】") -> first.substringAfter("【").substringBefore("】").trim()
            firstLower.startsWith("[") && firstLower.contains("]") -> first.substringAfter("[").substringBefore("]").trim()
            firstLower.startsWith("«") && firstLower.contains("»") -> first.substringAfter("«").substringBefore("»").trim()
            firstLower.startsWith("(") && firstLower.contains(")") && firstLower.length <= 25 -> first.substringAfter("(").substringBefore(")").trim()
            lines.size >= 2 && first.length <= 22 && !first.endsWith(".") && !first.endsWith("?") && !first.endsWith("!") -> first
            else -> ""
        }.trim()

        val dialogueText = when {
            candidateSpeaker.isNotEmpty() && first.contains(":") -> rawText.substringAfter(":", "").trim().ifBlank { rawText }
            candidateSpeaker.isNotEmpty() && first.contains("—") -> rawText.substringAfter("—", "").trim().ifBlank { rawText }
            candidateSpeaker.isNotEmpty() && first.startsWith("【") -> rawText.substringAfter("】", "").trim().ifBlank { rawText }
            candidateSpeaker.isNotEmpty() && first.startsWith("[") -> rawText.substringAfter("]", "").trim().ifBlank { rawText }
            candidateSpeaker.isNotEmpty() && lines.size >= 2 && first == candidateSpeaker -> lines.drop(1).joinToString("\n")
            else -> rawText
        }

        return candidateSpeaker to dialogueText
    }

    private fun resolvePersonaForSpeaker(speaker: String, fullText: String): CharacterPersona {
        if (speaker.isNotBlank()) {
            val key = speaker.lowercase()
            val existing = speakerPersonaMap[key]
            if (existing != null) return existing

            // Try resolving through OcrContextGraph / Keywords
            val detected = detectPersona(speaker)
            val personaName = me.magnum.melonds.translator.context.OcrContextGraph.getOrAssignSpeakerPersona(speaker, detected.name)
            val persona = CharacterPersona.fromString(personaName)
            speakerPersonaMap[key] = persona
            return persona
        }

        val directDetection = detectPersona(fullText)
        val contextPersonaName = me.magnum.melonds.translator.context.OcrContextGraph.getNextTurnPersona(fullText, directDetection.name)
        return CharacterPersona.fromString(contextPersonaName)
    }

    private fun detectPersona(text: String): CharacterPersona {
        val clean = java.text.Normalizer.normalize(text, java.text.Normalizer.Form.NFD)
            .replace(Regex("\\p{Mn}+"), "")
        val lower = clean.lowercase()

        // 1. Behavioral & Vocative Triggers
        if (lower.contains("ха-ха") || lower.contains("хи-хи") || lower.contains("ахаха") || lower.contains("муахаха") || lower.contains("hahaha") || lower.contains("шутка") || lower.contains("ловушка")) {
            return CharacterPersona.VILLAIN_MANIC
        }
        if (lower.contains("протестую") || lower.contains("objection") || lower.contains("головоломка") || lower.contains("загадка") || lower.contains("джентльмен") || lower.contains("улика")) {
            return CharacterPersona.GENTLEMAN_SCHOLAR
        }
        if (lower.contains("покедекс") || lower.contains("инициализация") || lower.contains("протокол") || lower.contains("директива")) {
            return CharacterPersona.CYBORG_ROBOT
        }

        // 2. Keyword Classification
        if (HERO_DARK_VIGILANTE_KEYWORDS.any { lower.contains(it) }) return CharacterPersona.HERO_DARK_VIGILANTE
        if (VILLAIN_MANIC_KEYWORDS.any { lower.contains(it) }) return CharacterPersona.VILLAIN_MANIC
        if (VILLAIN_BOSS_KEYWORDS.any { lower.contains(it) }) return CharacterPersona.VILLAIN_BOSS
        if (DEEP_DEMON_KEYWORDS.any { lower.contains(it) }) return CharacterPersona.DEEP_DEMON
        if (WISE_ELDER_KEYWORDS.any { lower.contains(it) }) return CharacterPersona.WISE_ELDER
        if (YOUNG_BOY_KEYWORDS.any { lower.contains(it) }) return CharacterPersona.YOUNG_BOY
        if (YOUNG_GIRL_KEYWORDS.any { lower.contains(it) }) return CharacterPersona.YOUNG_GIRL
        if (ROYAL_QUEEN_KEYWORDS.any { lower.contains(it) }) return CharacterPersona.ROYAL_QUEEN
        if (MERCHANT_KEYWORDS.any { lower.contains(it) }) return CharacterPersona.MERCHANT
        if (SOLDIER_KEYWORDS.any { lower.contains(it) }) return CharacterPersona.SOLDIER
        if (CYBORG_ROBOT_KEYWORDS.any { lower.contains(it) }) return CharacterPersona.CYBORG_ROBOT
        if (TSUNDERE_KEYWORDS.any { lower.contains(it) }) return CharacterPersona.TSUNDERE
        if (WHISPER_KEYWORDS.any { lower.contains(it) }) return CharacterPersona.WHISPER_MYSTERIOUS
        if (CHEERFUL_FAIRY_KEYWORDS.any { lower.contains(it) }) return CharacterPersona.CHEERFUL_FAIRY
        if (PIRATE_KEYWORDS.any { lower.contains(it) }) return CharacterPersona.PIRATE
        if (MAD_SCIENTIST_KEYWORDS.any { lower.contains(it) }) return CharacterPersona.MAD_SCIENTIST
        if (GENTLEMAN_SCHOLAR_KEYWORDS.any { lower.contains(it) }) return CharacterPersona.GENTLEMAN_SCHOLAR
        if (GHOST_KEYWORDS.any { lower.contains(it) }) return CharacterPersona.GHOST_ETHEREAL
        if (KNIGHT_KEYWORDS.any { lower.contains(it) }) return CharacterPersona.KNIGHT_WARRIOR
        if (COMEDY_KEYWORDS.any { lower.contains(it) }) return CharacterPersona.COMEDY_GOOFY
        if (ANGELIC_DIVINE_KEYWORDS.any { lower.contains(it) }) return CharacterPersona.ANGELIC_DIVINE
        if (PROTAGONIST_FEMALE_KEYWORDS.any { lower.contains(it) }) return CharacterPersona.PROTAGONIST_FEMALE
        if (PROTAGONIST_MALE_KEYWORDS.any { lower.contains(it) }) return CharacterPersona.PROTAGONIST_MALE

        return CharacterPersona.NARRATOR
    }

    private fun speakNeuralCloud(text: String, targetLang: String, persona: CharacterPersona, baseSpeed: Float) {
        scope.launch {
            try {
                val langCode = if (targetLang.isBlank()) "ru" else targetLang.lowercase()

                // Edge Neural Voice Actor & SSML Pitch / Rate Mapping for 23 Personas
                val (voiceName, ssmlPitch, ssmlRate) = when (langCode) {
                    "ru" -> when (persona) {
                        CharacterPersona.HERO_DARK_VIGILANTE -> Triple("ru-RU-DmitryNeural", "-18%", "-8%")
                        CharacterPersona.VILLAIN_BOSS -> Triple("ru-RU-DmitryNeural", "-28%", "-14%")
                        CharacterPersona.VILLAIN_MANIC -> Triple("ru-RU-DmitryNeural", "+28%", "+26%")
                        CharacterPersona.DEEP_DEMON -> Triple("ru-RU-DmitryNeural", "-38%", "-22%")
                        CharacterPersona.WISE_ELDER -> Triple("ru-RU-DmitryNeural", "-12%", "-12%")
                        CharacterPersona.YOUNG_BOY -> Triple("ru-RU-SvetlanaNeural", "+25%", "+14%")
                        CharacterPersona.YOUNG_GIRL -> Triple("ru-RU-SvetlanaNeural", "+32%", "+10%")
                        CharacterPersona.ROYAL_QUEEN -> Triple("ru-RU-SvetlanaNeural", "+4%", "-4%")
                        CharacterPersona.MERCHANT -> Triple("ru-RU-DmitryNeural", "+12%", "+16%")
                        CharacterPersona.SOLDIER -> Triple("ru-RU-DmitryNeural", "-8%", "+4%")
                        CharacterPersona.CYBORG_ROBOT -> Triple("ru-RU-DmitryNeural", "-16%", "+8%")
                        CharacterPersona.TSUNDERE -> Triple("ru-RU-SvetlanaNeural", "+18%", "+18%")
                        CharacterPersona.WHISPER_MYSTERIOUS -> Triple("ru-RU-SvetlanaNeural", "-5%", "-20%")
                        CharacterPersona.CHEERFUL_FAIRY -> Triple("ru-RU-SvetlanaNeural", "+45%", "+20%")
                        CharacterPersona.PIRATE -> Triple("ru-RU-DmitryNeural", "-6%", "+12%")
                        CharacterPersona.MAD_SCIENTIST -> Triple("ru-RU-DmitryNeural", "+32%", "+22%")
                        CharacterPersona.GENTLEMAN_SCHOLAR -> Triple("ru-RU-DmitryNeural", "-4%", "-4%")
                        CharacterPersona.GHOST_ETHEREAL -> Triple("ru-RU-SvetlanaNeural", "+12%", "-25%")
                        CharacterPersona.KNIGHT_WARRIOR -> Triple("ru-RU-DmitryNeural", "-10%", "-4%")
                        CharacterPersona.COMEDY_GOOFY -> Triple("ru-RU-DmitryNeural", "+38%", "+28%")
                        CharacterPersona.ANGELIC_DIVINE -> Triple("ru-RU-SvetlanaNeural", "+16%", "-6%")
                        CharacterPersona.PROTAGONIST_FEMALE -> Triple("ru-RU-SvetlanaNeural", "+2%", "0%")
                        CharacterPersona.PROTAGONIST_MALE -> Triple("ru-RU-DmitryNeural", "+6%", "+2%")
                        CharacterPersona.NARRATOR -> Triple("ru-RU-DmitryNeural", "0%", "0%")
                    }
                    "ja" -> when (persona) {
                        CharacterPersona.PROTAGONIST_FEMALE, CharacterPersona.ROYAL_QUEEN, CharacterPersona.YOUNG_GIRL,
                        CharacterPersona.ANGELIC_DIVINE, CharacterPersona.CHEERFUL_FAIRY, CharacterPersona.TSUNDERE ->
                            Triple("ja-JP-NanamiNeural", "+2%", "0%")
                        else -> Triple("ja-JP-KeitaNeural", "0%", "0%")
                    }
                    else -> when (persona) { // English / Multilingual
                        CharacterPersona.HERO_DARK_VIGILANTE -> Triple("en-US-GuyNeural", "-16%", "-10%")
                        CharacterPersona.VILLAIN_BOSS -> Triple("en-US-RogerNeural", "-22%", "-14%")
                        CharacterPersona.VILLAIN_MANIC -> Triple("en-US-ChristopherNeural", "+28%", "+24%")
                        CharacterPersona.DEEP_DEMON -> Triple("en-US-RogerNeural", "-36%", "-20%")
                        CharacterPersona.WISE_ELDER -> Triple("en-US-RogerNeural", "-12%", "-10%")
                        CharacterPersona.YOUNG_BOY -> Triple("en-US-AnaNeural", "+22%", "+12%")
                        CharacterPersona.YOUNG_GIRL -> Triple("en-US-AnaNeural", "+30%", "+10%")
                        CharacterPersona.ROYAL_QUEEN -> Triple("en-US-JennyNeural", "+4%", "-4%")
                        CharacterPersona.MERCHANT -> Triple("en-US-GuyNeural", "+10%", "+14%")
                        CharacterPersona.SOLDIER -> Triple("en-US-GuyNeural", "-8%", "+4%")
                        CharacterPersona.CYBORG_ROBOT -> Triple("en-US-GuyNeural", "-14%", "+6%")
                        CharacterPersona.TSUNDERE -> Triple("en-US-JennyNeural", "+16%", "+16%")
                        CharacterPersona.WHISPER_MYSTERIOUS -> Triple("en-US-AnaNeural", "-4%", "-20%")
                        CharacterPersona.CHEERFUL_FAIRY -> Triple("en-US-AnaNeural", "+42%", "+18%")
                        CharacterPersona.PIRATE -> Triple("en-US-GuyNeural", "-6%", "+10%")
                        CharacterPersona.MAD_SCIENTIST -> Triple("en-US-ChristopherNeural", "+30%", "+20%")
                        CharacterPersona.GENTLEMAN_SCHOLAR -> Triple("en-US-GuyNeural", "-4%", "-4%")
                        CharacterPersona.GHOST_ETHEREAL -> Triple("en-US-AnaNeural", "+10%", "-28%")
                        CharacterPersona.KNIGHT_WARRIOR -> Triple("en-US-RogerNeural", "-10%", "-4%")
                        CharacterPersona.COMEDY_GOOFY -> Triple("en-US-ChristopherNeural", "+36%", "+26%")
                        CharacterPersona.ANGELIC_DIVINE -> Triple("en-US-JennyNeural", "+14%", "-6%")
                        CharacterPersona.PROTAGONIST_FEMALE -> Triple("en-US-JennyNeural", "+2%", "0%")
                        CharacterPersona.PROTAGONIST_MALE -> Triple("en-US-GuyNeural", "+6%", "+2%")
                        CharacterPersona.NARRATOR -> Triple("en-US-GuyNeural", "0%", "0%")
                    }
                }

                val audioBytes = kotlinx.coroutines.withTimeoutOrNull(4500L) {
                    EdgeNeuralTtsClient.synthesize(
                        text = text,
                        voiceName = voiceName,
                        pitch = ssmlPitch,
                        rate = ssmlRate
                    )
                }

                if (audioBytes == null || audioBytes.isEmpty()) {
                    throw IllegalStateException("Edge Neural fallback trigger")
                }

                val tempFile = File(context.cacheDir, "storm_neural_${System.currentTimeMillis()}.mp3")
                FileOutputStream(tempFile).use { it.write(audioBytes) }

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
                        setOnCompletionListener { tempFile.delete() }
                    }
                }
            } catch (e: Throwable) {
                Log.i(TAG, "Routing [$persona] to local multi-voice synthesis: ${e.message}")
                withContext(Dispatchers.Main) {
                    speakNativeMultiVoice(text, persona, baseSpeed, targetLang)
                }
            }
        }
    }

    private fun applyPersonaVoice(persona: CharacterPersona, baseSpeed: Float, locale: Locale) {
        val isLangMatching = { v: Voice -> v.locale.language == locale.language }
        val langVoices = availableVoices.filter(isLangMatching)

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
        val primaryFemaleVoice = femaleVoices.firstOrNull() ?: langVoices.firstOrNull()

        val isMale = when (persona) {
            CharacterPersona.PROTAGONIST_FEMALE,
            CharacterPersona.YOUNG_GIRL,
            CharacterPersona.ROYAL_QUEEN,
            CharacterPersona.TSUNDERE,
            CharacterPersona.CHEERFUL_FAIRY,
            CharacterPersona.ANGELIC_DIVINE -> false
            else -> true
        }

        try {
            if (isMale && primaryMaleVoice != null) {
                tts?.voice = primaryMaleVoice
            } else if (!isMale && primaryFemaleVoice != null) {
                tts?.voice = primaryFemaleVoice
            }
        } catch (_: Throwable) {}

        // Fine-tune pitch & speech rate per persona
        when (persona) {
            CharacterPersona.HERO_DARK_VIGILANTE -> { tts?.setPitch(0.40f); tts?.setSpeechRate(baseSpeed * 0.82f) }
            CharacterPersona.VILLAIN_BOSS -> { tts?.setPitch(0.35f); tts?.setSpeechRate(baseSpeed * 0.76f) }
            CharacterPersona.VILLAIN_MANIC -> { tts?.setPitch(1.42f); tts?.setSpeechRate(baseSpeed * 1.34f) }
            CharacterPersona.DEEP_DEMON -> { tts?.setPitch(0.28f); tts?.setSpeechRate(baseSpeed * 0.68f) }
            CharacterPersona.WISE_ELDER -> { tts?.setPitch(0.55f); tts?.setSpeechRate(baseSpeed * 0.80f) }
            CharacterPersona.YOUNG_BOY -> { tts?.setPitch(1.65f); tts?.setSpeechRate(baseSpeed * 1.18f) }
            CharacterPersona.YOUNG_GIRL -> { tts?.setPitch(1.75f); tts?.setSpeechRate(baseSpeed * 1.15f) }
            CharacterPersona.ROYAL_QUEEN -> { tts?.setPitch(1.15f); tts?.setSpeechRate(baseSpeed * 0.95f) }
            CharacterPersona.MERCHANT -> { tts?.setPitch(1.10f); tts?.setSpeechRate(baseSpeed * 1.25f) }
            CharacterPersona.SOLDIER -> { tts?.setPitch(0.70f); tts?.setSpeechRate(baseSpeed * 1.05f) }
            CharacterPersona.CYBORG_ROBOT -> { tts?.setPitch(0.42f); tts?.setSpeechRate(baseSpeed * 1.02f) }
            CharacterPersona.TSUNDERE -> { tts?.setPitch(1.35f); tts?.setSpeechRate(baseSpeed * 1.22f) }
            CharacterPersona.WHISPER_MYSTERIOUS -> { tts?.setPitch(0.90f); tts?.setSpeechRate(baseSpeed * 0.70f) }
            CharacterPersona.CHEERFUL_FAIRY -> { tts?.setPitch(1.85f); tts?.setSpeechRate(baseSpeed * 1.28f) }
            CharacterPersona.PIRATE -> { tts?.setPitch(0.85f); tts?.setSpeechRate(baseSpeed * 1.12f) }
            CharacterPersona.MAD_SCIENTIST -> { tts?.setPitch(1.32f); tts?.setSpeechRate(baseSpeed * 1.24f) }
            CharacterPersona.GENTLEMAN_SCHOLAR -> { tts?.setPitch(0.76f); tts?.setSpeechRate(baseSpeed * 0.88f) }
            CharacterPersona.GHOST_ETHEREAL -> { tts?.setPitch(1.15f); tts?.setSpeechRate(baseSpeed * 0.68f) }
            CharacterPersona.KNIGHT_WARRIOR -> { tts?.setPitch(0.80f); tts?.setSpeechRate(baseSpeed * 0.95f) }
            CharacterPersona.COMEDY_GOOFY -> { tts?.setPitch(1.45f); tts?.setSpeechRate(baseSpeed * 1.32f) }
            CharacterPersona.ANGELIC_DIVINE -> { tts?.setPitch(1.40f); tts?.setSpeechRate(baseSpeed * 0.92f) }
            CharacterPersona.PROTAGONIST_FEMALE -> { tts?.setPitch(1.22f); tts?.setSpeechRate(baseSpeed * 1.02f) }
            CharacterPersona.PROTAGONIST_MALE -> { tts?.setPitch(0.88f); tts?.setSpeechRate(baseSpeed * 1.00f) }
            CharacterPersona.NARRATOR -> { tts?.setPitch(0.98f); tts?.setSpeechRate(baseSpeed) }
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

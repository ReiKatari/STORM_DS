package me.magnum.melonds.translator.tts

import android.content.Context
import android.content.SharedPreferences
import android.media.AudioAttributes
import android.media.MediaPlayer
import android.media.PlaybackParams
import android.media.audiofx.Equalizer
import android.media.audiofx.PresetReverb
import android.os.Build
import android.speech.tts.TextToSpeech
import android.speech.tts.Voice
import android.util.Log
import androidx.preference.PreferenceManager
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlinx.coroutines.withContext
import kotlinx.coroutines.withTimeoutOrNull
import me.magnum.melonds.translator.context.OcrContextGraph
import me.magnum.melonds.translator.context.OcrContextGraph.SpeakerVoiceProfile
import me.magnum.melonds.translator.context.OcrContextGraph.TimbreEqPreset
import me.magnum.melonds.translator.model.TranslatedTextBlock
import java.io.File
import java.io.FileOutputStream
import java.util.Locale
import kotlin.coroutines.resume
import kotlin.math.abs

/**
 * Studio-Grade Multi-Actor AI Voice Acting & Persistent Timbre Engine for Nintendo DS / DSi games.
 *
 * Key Capabilities:
 * - Spatial OCR Nameplate Pairing: Recognizes small character nameplates above/left of dialogue boxes
 *   and binds the character identity without reading the nameplate label out loud.
 * - Multi-Turn Dialogue Splitting & Sequential Studio Queue: Splits multi-character conversations into
 *   individual turns, pre-synthesizes all turns in parallel, and plays them sequentially with distinct voices.
 * - Persistent Per-Game Character Voice Registry: Every character (known or newly discovered NPC) receives
 *   a deterministic, persistent `SpeakerVoiceProfile` saved per game (`voice_cast_<gameKey>.json`).
 * - Acoustic Timbre & Formant DSP: Combines 6+ Multilingual & Native Neural Voices, SSML emotional prosody
 *   contours, hardware `PlaybackParams` formant pitch shifting, and 5-band parametric Studio EQ/Reverb.
 */
class GameTtsManager(private val context: Context) {

    companion object {
        private const val TAG = "GameTtsManager"
        const val PREF_TRANSLATOR_TTS_VOICE_ENGINE = "translator_tts_voice_engine"
        const val PREF_TRANSLATOR_TTS_LANG = "translator_tts_lang"
        const val PREF_TRANSLATOR_TTS_SPEED = "translator_tts_speed"
        const val PREF_TRANSLATOR_LOCAL_PITCH_VARIANCE = "translator_local_voice_pitch_variance"

        // 1. Dark Vigilantes & Heroes
        private val HERO_DARK_VIGILANTE_KEYWORDS = setOf(
            "бэтмен", "бэтмэн", "брюс", "уэйн", "темный рыцарь", "гордон", "хайден", "кайл хайд",
            "снейк", "кратос", "вескер", "вейдер", "каратель", "аркхэм", "шедоу", "солид снейк", "биг босс",
            "алукард", "арикадо", "годо", "каин", "сайрус",
            "batman", "bruce wayne", "dark knight", "gordon", "kyle hyde", "wesker", "vader", "solid snake",
            "shadow", "kratos", "punisher", "alucard", "arikado", "godot"
        )

        // 2. Manic Villains & Tricksters
        private val VILLAIN_MANIC_KEYWORDS = setOf(
            "джокер", "фофул", "клоун", "безумец", "псих", "маньяк", "загадочник", "риддлер", "кефка", "диментио",
            "порки", "валуиджи", "гирахим", "двуликий", "пугало", "крейн", "кабанела", "минамимото",
            "ха-ха", "хи-хи", "ахаха", "хе-хе", "хахаха", "муахаха",
            "joker", "fawful", "clown", "maniac", "riddler", "dimentio", "kefka", "porky", "waluigi",
            "ghirahim", "scarecrow", "cabanela", "minamimoto", "haha", "hehe", "muahaha"
        )

        // 3. Heavy Bosses & Tyrants
        private val VILLAIN_BOSS_KEYWORDS = setOf(
            "босс", "король", "монстр", "дракон", "баузер", "боузер", "гетсис", "ганон", "ганондорф",
            "пингвин", "сайкс", "ксемнас", "ансем", "дидиди", "дедеде", "эггман", "варио", "джованни",
            "бэйн", "бейн", "голбез", "манфред", "сокрушу", "ничтожества",
            "boss", "bowser", "ghetsis", "ganon", "ganondorf", "dedede", "eggman", "giovanni", "bane",
            "golbez", "manfred", "tyrant", "overlord"
        )

        // 4. Demonic, Devilish & Abyss Entities
        private val DEEP_DEMON_KEYWORDS = setOf(
            "смерть", "демон", "дьявол", "сатана", "даркрай", "гиратина", "мьюту", "ридли", "акума",
            "дракула", "лавос", "маллус", "малладус", "бездна", "преисподняя", "тьма", "поглощу", "душа",
            "вампир", "нечисть", "проклятие", "некромант",
            "death", "dracula", "demon", "devil", "satan", "darkrai", "giratina", "mewtwo", "ridley",
            "akuma", "abyss", "curse", "vampire", "necromancer"
        )

        // 5. Wise Elders & Sages
        private val WISE_ELDER_KEYWORDS = setOf(
            "дед", "старик", "мудрец", "оук", "роуэн", "бирч", "элм", "сикамор", "декард", "старец",
            "судья", "ваша честь", "альфред", "барлоу", "даннинг", "эйс",
            "elder", "sage", "oak", "rowan", "birch", "elm", "sycamore", "deckard", "judge",
            "your honor", "alfred", "barlowe", "grandfather"
        )

        // 6. Young Boys & Companions
        private val YOUNG_BOY_KEYWORDS = setOf(
            "люк", "тейлз", "тейлс", "несс", "лукас", "марко", "миссайл", "мальчик", "малыш", "парнишка", "братишка",
            "luke", "tails", "ness", "lucas", "marco", "missile", "boy", "kid", "child"
        )

        // 7. Young Girls & Companions
        private val YOUNG_GIRL_KEYWORDS = setOf(
            "перл", "эма", "флора", "нанами", "труси", "кей", "кловер", "райм", "камила", "мина", "ридия", "шион",
            "девочка", "малышка", "сестренка", "подружка",
            "pearl", "ema", "flora", "nanami", "trucy", "clover", "rhyme", "kamila", "rydia", "xion", "girl", "little girl"
        )

        // 8. Royal & Queens
        private val ROYAL_QUEEN_KEYWORDS = setOf(
            "пич", "зельда", "розалина", "синтия", "джунипер", "мия", "лотос", "роза", "фран", "эрука", "йоко",
            "принцесса", "королева", "госпожа", "ее величество", "леди", "правительница",
            "peach", "zelda", "rosalina", "cynthia", "juniper", "mia", "lotus", "rosa", "fran", "eruca",
            "princess", "queen", "lady", "majesty", "highness"
        )

        // 9. Merchants & Traders
        private val MERCHANT_KEYWORDS = setOf(
            "торговец", "продавец", "том нук", "нук", "бидл", "торнеко", "сид", "магазин", "товары",
            "покупатель", "монеты", "купите", "продаю", "скидка",
            "merchant", "shopkeeper", "tom nook", "nook", "beedle", "torneko", "cid", "shop", "goods", "customer", "coins", "discount"
        )

        // 10. Soldiers, Guards & Detectives
        private val SOLDIER_KEYWORDS = setOf(
            "солдат", "стражник", "страж", "капитан", "командир", "сержант", "гвардеец", "патруль",
            "гамшу", "челми", "севен", "рош", "хестон", "стоять", "пропуск",
            "soldier", "guard", "captain", "commander", "sergeant", "patrol", "gumshoe", "chelmey", "seven", "rosch", "halt", "sentry"
        )

        // 11. Robots & Cyborgs
        private val CYBORG_ROBOT_KEYWORDS = setOf(
            "робо", "омега", "покедекс", "красный торнадо", "зеро", "компьютер", "робот", "дроид",
            "система", "протокол", "директива", "терминал", "инициализация",
            "robo", "omega", "pokedex", "red tornado", "zero", "computer", "robot", "droid", "system", "protocol", "directive", "terminal"
        )

        // 12. Tsundere Characters
        private val TSUNDERE_KEYWORDS = setOf(
            "франциска", "шики", "шарлотта", "глупец", "ничтожество", "пф", "не подумай", "идиот", "нахал", "болван",
            "franziska", "shiki", "charlotte", "fool", "idiot", "hmph", "baka"
        )

        // 13. Whisper & Mysterious Figures
        private val WHISPER_KEYWORDS = setOf(
            "шепот", "таинственный", "незнакомец", "тень", "призрак в капюшоне", "мила", "тихо...", "слышишь...", "секрет",
            "whisper", "mysterious", "shadow", "stranger", "secret", "hush"
        )

        // 14. Cheerful Fairies & Mascots
        private val CHEERFUL_FAIRY_KEYWORDS = setOf(
            "нави", "татл", "старлоу", "сиела", "стелла", "харли", "бьянка", "пикачу", "великая фея", "селеби", "джирачи",
            "пика-пика", "ура-а", "слушай!", "хей!",
            "navi", "tatl", "starlow", "ciela", "stella", "harley", "bianca", "pikachu", "fairy", "celebi", "jirachi", "listen", "hey"
        )

        // 15. Pirates & Rebels
        private val PIRATE_KEYWORDS = setOf(
            "пират", "капитан сироп", "тетра", "лайнбек", "санта", "бит", "аксель", "эйла", "эдж", "хуанг",
            "море", "сокровища", "корабль", "на абордаж", "йо-хо-хо",
            "pirate", "syrup", "tetra", "linebeck", "santa", "beat", "axel", "ayla", "huang", "sea", "treasure", "ship", "ahoy"
        )

        // 16. Mad Scientists
        private val MAD_SCIENTIST_KEYWORDS = setOf(
            "доктор", "ученый", "уайли", "крайгор", "дон паоло", "эксперимент", "изобретение", "гений науки", "моя лаборатория",
            "doctor", "scientist", "wily", "crygor", "don paolo", "experiment", "invention", "genius", "lab"
        )

        // 17. Gentlemen & Scholars
        private val GENTLEMAN_SCHOLAR_KEYWORDS = setOf(
            "лейтон", "профессор", "эджворт", "феникс", "райт", "клавир", "кристоф", "джошуа", "ханекома",
            "альбус", "балтьер", "лукер", "загадка", "головоломка", "протестую", "улика",
            "layton", "professor", "edgeworth", "phoenix", "wright", "klavier", "joshua", "balthier",
            "puzzle", "gentleman", "objection", "evidence"
        )

        // 18. Ghost & Ethereal
        private val GHOST_KEYWORDS = setOf(
            "призрак", "бу", "кинг бу", "генгар", "фантом", "дух", "загробный", "эфирный",
            "ghost", "boo", "king boo", "gengar", "phantom", "spirit", "ethereal"
        )

        // 19. Knights & Warriors
        private val KNIGHT_KEYWORDS = setOf(
            "рыцарь", "воин", "мета найт", "март", "айк", "фрог", "гленн", "юлиус", "сесил", "сток", "рику",
            "гай гарднер", "аквамен", "ланг", "меч", "честь", "доблесть", "клинок",
            "knight", "warrior", "meta knight", "marth", "ike", "frog", "glenn", "julius", "cecil", "stocke", "riku", "aquaman", "sword", "honor", "blade"
        )

        // 20. Comedy & Goofy Characters
        private val COMEDY_KEYWORDS = setOf(
            "варио", "валуиджи", "тингл", "ларри", "бэт-майт", "чан", "смех", "комедия", "золото!", "денюжки!",
            "wario", "waluigi", "tingle", "larry", "bat-mite", "comedy", "gold", "money"
        )

        // 21. Angelic & Divine
        private val ANGELIC_DIVINE_KEYWORDS = setOf(
            "палютена", "богиня", "хайлия", "аркеус", "пит", "шала", "ангел", "священный", "свет", "небеса", "храм", "молитва", "божественный",
            "palutena", "goddess", "hylia", "arceus", "pit", "schala", "angel", "holy", "light", "heavens", "divine"
        )

        // 22. Heroines & Female Protagonists
        private val PROTAGONIST_FEMALE_KEYWORDS = setOf(
            "майя", "шаноа", "самус", "аква", "линн", "джун", "аканэ", "эмми", "марл", "лукка", "алена", "рейни",
            "девушка", "женщина", "героиня", "спасите", "помогите",
            "maya", "shanoa", "samus", "aqua", "lynne", "june", "akane", "emmy", "marle", "lucca", "alena", "raynie", "heroine", "woman"
        )

        // 23. Protagonist Males
        private val PROTAGONIST_MALE_KEYWORDS = setOf(
            "марио", "луиджи", "линк", "соник", "кроно", "хроно", "неку", "рокмен", "мегамен", "ред", "этан",
            "сора", "роксас", "сома", "джонатан", "джунпей", "сиссел", "аполло", "робин", "синий жук",
            "mario", "luigi", "link", "sonic", "crono", "neku", "megaman", "red", "sora", "roxas", "soma",
            "jonathan", "junpei", "sissel", "apollo", "robin", "hero"
        )
    }

    enum class CharacterPersona(
        val pitch: Float,
        val rateMultiplier: Float,
        val edgePitchHz: Int,
        val edgeRatePercent: Int
    ) {
        PROTAGONIST_MALE(0.88f, 1.00f, 6, 2),          // Mario, Link, Sonic, Crono, Sora, Phoenix
        PROTAGONIST_FEMALE(1.22f, 1.02f, 8, 2),        // Samus, Shanoa, Maya, Lynne, June
        HERO_DARK_VIGILANTE(0.40f, 0.82f, -18, -8),    // Batman, Solid Snake, Kyle Hyde, Alucard, Godot
        VILLAIN_BOSS(0.35f, 0.76f, -28, -14),          // Bowser, Ganondorf, Bane, Ghetsis, Golbez
        VILLAIN_MANIC(1.42f, 1.34f, 24, 22),           // Joker, Fawful, Kefka, Cabanela, Minamimoto
        WISE_ELDER(0.55f, 0.80f, -14, -10),            // Professor Oak, Rowan, Alfred, The Judge
        YOUNG_BOY(1.65f, 1.18f, 25, 14),               // Luke Triton, Tails, Ness, Lucas, Marco
        YOUNG_GIRL(1.75f, 1.15f, 30, 10),              // Pearl Fey, Trucy, Flora, Clover, Rhyme
        ROYAL_QUEEN(1.15f, 0.95f, 4, -4),              // Princess Peach, Zelda, Cynthia, Mia Fey
        MERCHANT(1.10f, 1.25f, 10, 14),                // Tom Nook, Beedle, Torneko, Cid
        SOLDIER(0.70f, 1.05f, -10, 4),                 // Gumshoe, Chelmey, Gordon, Rosch, Seven
        CYBORG_ROBOT(0.42f, 1.02f, -16, 8),            // Robo, Omega, Pokedex, Red Tornado, Zero
        NARRATOR(1.00f, 1.00f, 0, 0),                  // Story chronicle & descriptive text
        TSUNDERE(1.35f, 1.22f, 16, 14),                // Franziska von Karma, Shiki, Charlotte
        WHISPER_MYSTERIOUS(0.90f, 0.70f, -6, -18),     // Scarecrow, Mila, mysterious shadows
        DEEP_DEMON(0.28f, 0.68f, -36, -20),            // Death, Dracula, Giratina, Darkrai, Mewtwo
        CHEERFUL_FAIRY(1.85f, 1.28f, 38, 18),          // Navi, Starlow, Ciela, Stella, Harley Quinn
        PIRATE(0.85f, 1.12f, -4, 12),                  // Linebeck, Tetra, Santa, Axel, Beat
        MAD_SCIENTIST(1.32f, 1.24f, 22, 18),           // Dr. Wily, Don Paolo, Riddler
        GENTLEMAN_SCHOLAR(0.76f, 0.88f, -6, -4),       // Professor Layton, Miles Edgeworth, Klavier, Balthier
        GHOST_ETHEREAL(1.15f, 0.68f, 12, -22),         // King Boo, Gengar, Phantom Spirit
        KNIGHT_WARRIOR(0.80f, 0.95f, -10, -2),         // Meta Knight, Marth, Frog, Julius, Stocke, Aquaman
        COMEDY_GOOFY(1.45f, 1.32f, 32, 22),            // Wario, Waluigi, Tingle, Larry Butz, Bat-Mite
        ANGELIC_DIVINE(1.40f, 0.92f, 14, -6);          // Palutena, Goddess Hylia, Arceus, Schala

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

    /**
     * Studio Acting Emotion Styles dynamically modulating SSML prosody & intonation contour.
     */
    enum class EmotionStyle(
        val pitchDeltaHz: Int,
        val rateDeltaPercent: Int,
        val volumeAttr: String,
        val ssmlContour: String
    ) {
        NEUTRAL(0, 0, "default", ""),
        SHOUT_INTENSE(6, 10, "+15%", "(10%,+15%) (50%,+22%) (90%,-5%)"),
        JOY_EXCITED(8, 8, "+10%", "(15%,+12%) (55%,+18%) (90%,+8%)"),
        QUESTION_CURIOUS(4, 2, "default", "(10%,+0%) (65%,-4%) (95%,+20%)"),
        SAD_HESITANT(-5, -10, "-8%", "(10%,+0%) (85%,-14%)"),
        WHISPER_SECRET(-6, -15, "-20%", "(15%,-5%) (85%,-10%)")
    }

    /**
     * Represents one single spoken turn in a scene, bound to a specific character's persistent voice profile.
     */
    data class DialogueTurn(
        val speakerName: String,
        val speechText: String,
        val profile: SpeakerVoiceProfile,
        val persona: CharacterPersona,
        val emotion: EmotionStyle
    )

    private val preferences: SharedPreferences = PreferenceManager.getDefaultSharedPreferences(context)
    private var tts: TextToSpeech? = null
    private var isReady = false
    private var availableVoices: List<Voice> = emptyList()
    private val scope = CoroutineScope(Dispatchers.IO + SupervisorJob())
    private var studioQueueJob: Job? = null
    private var mediaPlayer: MediaPlayer? = null
    private var activeEqualizer: Equalizer? = null
    private var activeReverb: PresetReverb? = null
    private val audioManager = context.getSystemService(Context.AUDIO_SERVICE) as? android.media.AudioManager
    private var audioFocusRequest: android.media.AudioFocusRequest? = null

    init {
        initTts()
    }

    private fun requestAudioDucking() {
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                val req = android.media.AudioFocusRequest.Builder(android.media.AudioManager.AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK)
                    .setAudioAttributes(
                        AudioAttributes.Builder()
                            .setContentType(AudioAttributes.CONTENT_TYPE_SPEECH)
                            .setUsage(AudioAttributes.USAGE_ASSISTANCE_NAVIGATION_GUIDANCE)
                            .build()
                    )
                    .setAcceptsDelayedFocusGain(false)
                    .setWillPauseWhenDucked(false)
                    .build()
                audioFocusRequest = req
                audioManager?.requestAudioFocus(req)
            } else {
                @Suppress("DEPRECATION")
                audioManager?.requestAudioFocus(
                    null,
                    android.media.AudioManager.STREAM_MUSIC,
                    android.media.AudioManager.AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK
                )
            }
        } catch (_: Throwable) {}
    }

    private fun abandonAudioDucking() {
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                audioFocusRequest?.let { audioManager?.abandonAudioFocusRequest(it) }
            } else {
                @Suppress("DEPRECATION")
                audioManager?.abandonAudioFocus(null)
            }
        } catch (_: Throwable) {}
    }

    private fun releaseAudioEffects() {
        try {
            activeEqualizer?.enabled = false
            activeEqualizer?.release()
        } catch (_: Throwable) {}
        activeEqualizer = null

        try {
            activeReverb?.enabled = false
            activeReverb?.release()
        } catch (_: Throwable) {}
        activeReverb = null
    }

    private fun initTts() {
        if (tts != null) return
        tts = TextToSpeech(context.applicationContext) { status ->
            if (status == TextToSpeech.SUCCESS) {
                isReady = true
                applyLanguage(getSelectedLanguage())
                try {
                    availableVoices = tts?.voices?.toList() ?: emptyList()
                    Log.i(TAG, "TTS initialized. Available system voices: ${availableVoices.size}")
                } catch (e: Throwable) {
                    Log.w(TAG, "Cannot query voices: ${e.message}")
                }
                tts?.setOnUtteranceProgressListener(object : android.speech.tts.UtteranceProgressListener() {
                    override fun onStart(utteranceId: String?) {
                        requestAudioDucking()
                    }
                    override fun onDone(utteranceId: String?) {
                        abandonAudioDucking()
                    }
                    override fun onError(utteranceId: String?) {
                        abandonAudioDucking()
                    }
                })
            } else {
                Log.w(TAG, "TextToSpeech init failed with code: $status")
            }
        }
    }

    private fun getSelectedLanguage(): Locale {
        val ttsLangPref = preferences.getString(PREF_TRANSLATOR_TTS_LANG, "auto") ?: "auto"
        val langCode = if (ttsLangPref == "auto" || ttsLangPref.isBlank()) {
            preferences.getString("translator_target_lang", "ru") ?: "ru"
        } else {
            ttsLangPref
        }
        return localeForCode(langCode)
    }

    private fun localeForCode(langCode: String): Locale {
        return when (langCode.lowercase().take(2)) {
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

    /**
     * Studio entry point for spatial OCR blocks:
     * 1. Pairs character nameplate blocks (above/left of dialogue boxes) with their dialogue block.
     * 2. Splits multi-line or multi-character dialogues into individual `DialogueTurn` objects.
     * 3. Assigns and persists each character's `SpeakerVoiceProfile` on disk.
     * 4. Pre-synthesizes all turns in parallel and plays them sequentially with studio timbre DSP.
     */
    fun speakBlocks(blocks: List<TranslatedTextBlock>, targetLang: String = "ru") {
        if (blocks.isEmpty()) return

        val ttsLangPref = preferences.getString(PREF_TRANSLATOR_TTS_LANG, "auto") ?: "auto"
        val effectiveLang = if (ttsLangPref == "auto" || ttsLangPref.isBlank()) targetLang else ttsLangPref

        val sorted = blocks.sortedWith(
            compareBy<TranslatedTextBlock> { if (it.screenIndex < 0) 0 else it.screenIndex }
                .thenBy { it.boundingBox.top }
                .thenBy { it.boundingBox.left }
        )

        val turns = mutableListOf<DialogueTurn>()
        var i = 0
        while (i < sorted.size) {
            val current = sorted[i]
            val next = sorted.getOrNull(i + 1)

            // Check if `current` is a spatial speaker nameplate directly above `next`
            if (next != null && isSpatialSpeakerNameplate(current, next)) {
                val speakerCandidate = resolveBestSpeakerName(current.originalText, current.translatedText)
                val bodyTurns = buildDialogueTurnsFromText(
                    rawText = next.translatedText,
                    explicitSpeaker = speakerCandidate,
                    originalHint = "${current.originalText}: ${next.originalText}",
                    effectiveLang = effectiveLang
                )
                turns.addAll(bodyTurns)
                i += 2
                continue
            }

            // Skip isolated HUD counters ("100/100", "LV 15") if there are real sentences on screen
            if (sorted.size > 1 && isHudCounterNoise(current.originalText, current.translatedText)) {
                i++
                continue
            }

            val blockTurns = buildDialogueTurnsFromText(
                rawText = current.translatedText,
                explicitSpeaker = "",
                originalHint = current.originalText,
                effectiveLang = effectiveLang
            )
            turns.addAll(blockTurns)
            i++
        }

        if (turns.isEmpty()) return
        playDialogueQueue(turns, effectiveLang)
    }

    fun speak(text: String, targetLang: String = "ru") {
        if (text.isBlank()) return

        val ttsLangPref = preferences.getString(PREF_TRANSLATOR_TTS_LANG, "auto") ?: "auto"
        val effectiveLang = if (ttsLangPref == "auto" || ttsLangPref.isBlank()) targetLang else ttsLangPref

        val turns = buildDialogueTurnsFromText(
            rawText = text,
            explicitSpeaker = "",
            originalHint = text,
            effectiveLang = effectiveLang
        )
        if (turns.isEmpty()) return
        playDialogueQueue(turns, effectiveLang)
    }

    fun speakDirect(text: String, targetLang: String = "ru") {
        if (text.isBlank()) return
        val ttsLangPref = preferences.getString(PREF_TRANSLATOR_TTS_LANG, "auto") ?: "auto"
        val effectiveLang = if (ttsLangPref == "auto" || ttsLangPref.isBlank()) targetLang else ttsLangPref
        val baseSpeed = (preferences.getInt(PREF_TRANSLATOR_TTS_SPEED, 100) / 100f).coerceIn(0.5f, 2.0f)
        val profile = OcrContextGraph.resolveSpeakerVoiceProfile(context, "", text, CharacterPersona.NARRATOR.name)
        val turn = DialogueTurn(
            speakerName = "",
            speechText = RussianTtsNormalizer.normalize(text, effectiveLang),
            profile = profile,
            persona = CharacterPersona.NARRATOR,
            emotion = detectEmotion(text)
        )
        playDialogueQueue(listOf(turn), effectiveLang, overrideSpeed = baseSpeed)
    }

    fun speakWithPersona(
        text: String,
        persona: CharacterPersona,
        targetLang: String = "ru",
        baseSpeed: Float = 1.0f,
        pitchVariance: Float = 1.0f
    ) {
        val profile = OcrContextGraph.resolveSpeakerVoiceProfile(context, persona.name, text, persona.name)
        val turn = DialogueTurn(
            speakerName = persona.name,
            speechText = RussianTtsNormalizer.normalize(text, targetLang),
            profile = profile,
            persona = persona,
            emotion = detectEmotion(text)
        )
        playDialogueQueue(listOf(turn), targetLang, overrideSpeed = baseSpeed, overridePitchVariance = pitchVariance)
    }

    /**
     * Determines if [upper] is a character nameplate box sitting right above [lower] dialogue box.
     */
    private fun isSpatialSpeakerNameplate(upper: TranslatedTextBlock, lower: TranslatedTextBlock): Boolean {
        if (upper.screenIndex != lower.screenIndex) return false
        val orig = upper.originalText.trim()
        val trans = upper.translatedText.trim()
        if (orig.isEmpty() || trans.isEmpty()) return false
        if (orig.length > 26 || trans.length > 28) return false

        val words = trans.split(Regex("\\s+"))
        if (words.size > 3) return false

        // Nameplates don't end with sentence-ending punctuation (except Mr./Dr.)
        if ((orig.endsWith(".") && !orig.endsWith("Mr.", true) && !orig.endsWith("Dr.", true) && !orig.endsWith("St.", true)) ||
            orig.endsWith("!") || orig.endsWith("?") || trans.endsWith("!") || trans.endsWith("?")
        ) {
            return false
        }

        // Must not be pure digits/HUD counters
        if (orig.none { it.isLetter() }) return false

        // Lower block must be a longer dialogue box
        if (lower.translatedText.trim().length <= trans.length + 2) return false
        if (lower.boundingBox.width() < upper.boundingBox.width() * 1.15f && lower.translatedText.length < 18) return false

        // Vertical relationship: upper is directly above lower, or overlaps top border of lower
        val verticalGap = lower.boundingBox.top - upper.boundingBox.bottom
        if (verticalGap < -0.05f || verticalGap > 0.14f) return false

        // Horizontal relationship: nameplate is near the left/center of the dialogue box
        val horizValid = upper.boundingBox.left >= lower.boundingBox.left - 0.12f &&
                upper.boundingBox.left <= lower.boundingBox.right - 0.05f
        return horizValid
    }

    private fun resolveBestSpeakerName(originalName: String, translatedName: String): String {
        val origClean = originalName.trim().trim(':', '-', '—', '[', ']', '【', '】', '«', '»')
        val transClean = translatedName.trim().trim(':', '-', '—', '[', ']', '【', '】', '«', '»')
        val entity = OcrContextGraph.findEntity(origClean) ?: OcrContextGraph.findEntity(transClean)
        if (entity != null) return entity.name
        return transClean.ifBlank { origClean }
    }

    private fun isHudCounterNoise(originalText: String, translatedText: String): Boolean {
        val clean = originalText.trim()
        if (clean.length <= 2 && clean.none { it.isLetter() }) return true
        // Pure numbers, timers, HP/LV counters like "120/120", "00:45", "x99"
        if (clean.matches(Regex("^[0-9/:.,+\\-%xX×\\s]+$"))) return true
        if (clean.matches(Regex("(?i)^(hp|mp|sp|lv|lvl|exp|gp|G)\\s*[0-9/:+\\-]+$")) && translatedText.length <= 12) return true
        return false
    }

    /**
     * Parses a block of text into one or more sequential `DialogueTurn` items,
     * splitting multi-speaker exchanges (`"Бэтмен: ... Джокер: ..."` or `"— Реплика 1\n— Реплика 2"`).
     */
    private fun buildDialogueTurnsFromText(
        rawText: String,
        explicitSpeaker: String,
        originalHint: String,
        effectiveLang: String
    ): List<DialogueTurn> {
        val enginePref = preferences.getString(PREF_TRANSLATOR_TTS_VOICE_ENGINE, "neural_edge") ?: "neural_edge"
        val modelPref = preferences.getString("translator_local_voice_model", "auto_multi") ?: "auto_multi"
        val forcedPersona = getForcedManualPersona(enginePref, modelPref)

        // Split multi-speaker inline segments like "Бэтмен: Город под защитой. Лейтон: У каждой загадки есть разгадка!"
        val rawSegments = splitMultiSpeakerSegments(rawText, explicitSpeaker)
        val turns = mutableListOf<DialogueTurn>()

        for ((segSpeaker, segSpeech) in rawSegments) {
            val cleanSpeech = RussianTtsNormalizer.normalize(segSpeech, effectiveLang)
            if (cleanSpeech.isBlank()) continue

            val fallbackPersona = detectPersona("$segSpeaker $segSpeech $originalHint")
            val profile = OcrContextGraph.resolveSpeakerVoiceProfile(
                context = context,
                speakerName = segSpeaker,
                dialogueText = "$segSpeech $originalHint",
                fallbackPersona = (forcedPersona ?: fallbackPersona).name
            )
            val resolvedPersona = forcedPersona ?: CharacterPersona.fromString(profile.persona)
            val emotion = detectEmotion(segSpeech)

            turns.add(
                DialogueTurn(
                    speakerName = segSpeaker.ifBlank { profile.displayName },
                    speechText = cleanSpeech,
                    profile = profile,
                    persona = resolvedPersona,
                    emotion = emotion
                )
            )
        }
        return turns
    }

    /**
     * Splits text containing multiple speaker prefixes (`Speaker A: ... Speaker B: ...`)
     * or multi-line dialogue dashes (`— Line 1\n— Line 2`) into `(speakerName, dialogueText)` pairs.
     */
    private fun splitMultiSpeakerSegments(rawText: String, explicitSpeaker: String): List<Pair<String, String>> {
        val trimmed = rawText.trim()
        if (trimmed.isEmpty()) return emptyList()

        // 1. Check for inline "SpeakerName: speech" patterns (supports 1 or multiple speakers in one block)
        val inlineSpeakerRegex = Regex("(?m)(?:^|(?<=[.!?…»\"\\n])\\s+)([\\p{Lu}][\\p{L}\\d\\s.\\-]{1,20}):\\s+")
        val matches = inlineSpeakerRegex.findAll(trimmed).toList()
        if (matches.isNotEmpty() && matches.first().range.first <= 3) {
            val result = mutableListOf<Pair<String, String>>()
            for (idx in matches.indices) {
                val match = matches[idx]
                val speaker = match.groupValues[1].trim()
                val contentStart = match.range.last + 1
                val contentEnd = if (idx + 1 < matches.size) matches[idx + 1].range.first else trimmed.length
                if (contentStart < contentEnd) {
                    val speech = trimmed.substring(contentStart, contentEnd).trim()
                    if (speech.isNotEmpty()) {
                        result.add(speaker to speech)
                    }
                }
            }
            if (result.isNotEmpty()) return result
        }

        // 2. Check for multi-line dialogue turns starting with "—" or "-"
        val lines = trimmed.lines().map { it.trim() }.filter { it.isNotEmpty() }
        if (lines.size >= 2 && lines.count { it.startsWith("—") || it.startsWith("- ") || it.startsWith("–") } >= 2) {
            val result = mutableListOf<Pair<String, String>>()
            var currentTurn = StringBuilder()
            for (line in lines) {
                val isNewDashTurn = line.startsWith("—") || line.startsWith("- ") || line.startsWith("–")
                if (isNewDashTurn && currentTurn.isNotEmpty()) {
                    val (spk, txt) = extractSpeakerAndDialogue(currentTurn.toString())
                    result.add(spk to txt)
                    currentTurn = StringBuilder(line)
                } else {
                    if (currentTurn.isNotEmpty()) currentTurn.append(" ")
                    currentTurn.append(line)
                }
            }
            if (currentTurn.isNotEmpty()) {
                val (spk, txt) = extractSpeakerAndDialogue(currentTurn.toString())
                result.add(spk to txt)
            }
            if (result.isNotEmpty()) return result
        }

        // 3. Single turn (with optional explicit spatial nameplate speaker or header speaker)
        if (explicitSpeaker.isNotBlank()) {
            val (innerSpk, innerTxt) = extractSpeakerAndDialogue(trimmed)
            val finalSpk = if (innerSpk.isNotBlank()) innerSpk else explicitSpeaker
            return listOf(finalSpk to innerTxt)
        }

        val (extractedSpeaker, cleanSpeechText) = extractSpeakerAndDialogue(trimmed)
        return listOf(extractedSpeaker to cleanSpeechText)
    }

    private fun getForcedManualPersona(enginePref: String, modelPref: String): CharacterPersona? {
        if (enginePref == "single") return CharacterPersona.NARRATOR
        if (modelPref == "auto_multi") return null
        return when (modelPref) {
            "piper_ru_dmitri_medium" -> CharacterPersona.PROTAGONIST_MALE
            "piper_ru_elena_medium" -> CharacterPersona.PROTAGONIST_FEMALE
            "piper_ru_hero" -> CharacterPersona.PROTAGONIST_MALE
            "piper_ru_dark_knight" -> CharacterPersona.HERO_DARK_VIGILANTE
            "piper_ru_boss_grunt" -> CharacterPersona.VILLAIN_BOSS
            "piper_ru_joker_manic" -> CharacterPersona.VILLAIN_MANIC
            "piper_ru_deep_demon" -> CharacterPersona.DEEP_DEMON
            "piper_ru_elder" -> CharacterPersona.WISE_ELDER
            "piper_ru_young_boy" -> CharacterPersona.YOUNG_BOY
            "piper_ru_young_girl" -> CharacterPersona.YOUNG_GIRL
            "piper_ru_royal_queen" -> CharacterPersona.ROYAL_QUEEN
            "piper_ru_merchant" -> CharacterPersona.MERCHANT
            "piper_ru_soldier" -> CharacterPersona.SOLDIER
            "piper_ru_robot" -> CharacterPersona.CYBORG_ROBOT
            "piper_ru_narrator" -> CharacterPersona.NARRATOR
            "piper_ru_tsundere" -> CharacterPersona.TSUNDERE
            "piper_ru_whisper" -> CharacterPersona.WHISPER_MYSTERIOUS
            "piper_ru_fairy" -> CharacterPersona.CHEERFUL_FAIRY
            "piper_ru_pirate" -> CharacterPersona.PIRATE
            "piper_ru_mad_scientist" -> CharacterPersona.MAD_SCIENTIST
            "piper_ru_gentleman" -> CharacterPersona.GENTLEMAN_SCHOLAR
            "piper_ru_ghost" -> CharacterPersona.GHOST_ETHEREAL
            "piper_ru_knight" -> CharacterPersona.KNIGHT_WARRIOR
            "piper_ru_angelic" -> CharacterPersona.ANGELIC_DIVINE
            else -> null
        }
    }

    private fun detectEmotion(text: String): EmotionStyle {
        val trim = text.trim()
        val lower = trim.lowercase()

        if ((trim.startsWith("(") && trim.endsWith(")")) ||
            lower.startsWith("тс-с") || lower.startsWith("тише") || lower.contains("шёпотом") || lower.contains("шепотом")
        ) {
            return EmotionStyle.WHISPER_SECRET
        }

        if (lower.contains("ха-ха") || lower.contains("ахаха") || lower.contains("хи-хи") ||
            lower.contains("ура!") || lower.contains("отлично!") || lower.contains("великолепно!") ||
            lower.contains("победа!") || lower.contains("супер!") || lower.contains("здорово!")
        ) {
            return EmotionStyle.JOY_EXCITED
        }

        if (trim.endsWith("!") && (
                    lower.contains("протестую") || lower.contains("постойте") || lower.contains("получайте") ||
                            lower.contains("стой") || lower.contains("берегись") || lower.contains("в атаку") ||
                            lower.contains("чёрт") || lower.contains("черт") || lower.contains("невозможно") ||
                            lower.contains("замолчи") || lower.contains("довольно") || lower.contains("умри") ||
                            lower.contains("objection") || lower.contains("hold it") || lower.contains("take that") ||
                            trim.length <= 28
                    )
        ) {
            return EmotionStyle.SHOUT_INTENSE
        }

        if (trim.endsWith("?") || trim.endsWith("?!")) {
            return EmotionStyle.QUESTION_CURIOUS
        }

        if (trim.endsWith("...") || trim.endsWith("…") || trim.startsWith("...") ||
            lower.contains("увы") || lower.contains("прости...") || lower.contains("мне жаль") || lower.contains("боюсь,")
        ) {
            return EmotionStyle.SAD_HESITANT
        }

        return EmotionStyle.NEUTRAL
    }

    /**
     * Plays a queue of `DialogueTurn` objects sequentially.
     * Pre-synthesizes all neural audio streams in parallel so multi-actor turns transition seamlessly!
     */
    private fun playDialogueQueue(
        turns: List<DialogueTurn>,
        targetLang: String,
        overrideSpeed: Float? = null,
        overridePitchVariance: Float? = null
    ) {
        studioQueueJob?.cancel()
        stopMediaPlayerOnly()

        val enginePref = preferences.getString(PREF_TRANSLATOR_TTS_VOICE_ENGINE, "neural_edge") ?: "neural_edge"
        val baseSpeed = overrideSpeed ?: (preferences.getInt(PREF_TRANSLATOR_TTS_SPEED, 100) / 100f).coerceIn(0.5f, 2.0f)
        val pitchVariance = overridePitchVariance ?: (preferences.getInt(PREF_TRANSLATOR_LOCAL_PITCH_VARIANCE, 65) / 50f).coerceIn(0.0f, 2.0f)

        if (enginePref == "single") {
            val combined = turns.joinToString(" ") { it.speechText }
            speakNativeMultiVoice(combined, CharacterPersona.NARRATOR, null, baseSpeed, targetLang, pitchVariance = 0f, isSingleMode = true)
            return
        }

        if (enginePref != "neural_edge") {
            studioQueueJob = scope.launch {
                for ((idx, turn) in turns.withIndex()) {
                    if (!isActive) break
                    withContext(Dispatchers.Main) {
                        speakNativeMultiVoice(
                            text = turn.speechText,
                            persona = turn.persona,
                            profile = turn.profile,
                            baseSpeed = baseSpeed,
                            targetLang = targetLang,
                            pitchVariance = pitchVariance,
                            isSingleMode = false,
                            queueAdd = idx > 0
                        )
                    }
                }
            }
            return
        }

        // Studio Neural Multi-Actor Queue with Parallel Prefetching
        studioQueueJob = scope.launch {
            try {
                val langCode = if (targetLang.isBlank()) "ru" else targetLang.lowercase().take(2)

                // Launch parallel synthesis for all turns in the dialogue scene
                val deferredClips = turns.map { turn ->
                    async(Dispatchers.IO) {
                        synthesizeNeuralTurn(turn, langCode, pitchVariance)
                    }
                }

                for (idx in turns.indices) {
                    if (!isActive) break
                    val turn = turns[idx]
                    val audioBytes = deferredClips[idx].await()

                    if (!isActive) break

                    if (audioBytes != null && audioBytes.isNotEmpty()) {
                        playSynthesizedClipAndWait(audioBytes, turn, baseSpeed, pitchVariance)
                        if (idx + 1 < turns.size && isActive) {
                            delay(130L) // Natural studio breath pause between character turns
                        }
                    } else {
                        withContext(Dispatchers.Main) {
                            speakNativeMultiVoice(
                                text = turn.speechText,
                                persona = turn.persona,
                                profile = turn.profile,
                                baseSpeed = baseSpeed,
                                targetLang = targetLang,
                                pitchVariance = pitchVariance,
                                isSingleMode = false
                            )
                        }
                    }
                }
            } catch (_: CancellationException) {
                // Superseded by newer dialogue
            } catch (e: Throwable) {
                Log.w(TAG, "Studio queue fallback: ${e.message}")
            }
        }
    }

    private suspend fun synthesizeNeuralTurn(
        turn: DialogueTurn,
        langCode: String,
        pitchVariance: Float
    ): ByteArray? {
        val (primaryVoice, fallbackVoice) = selectNeuralVoiceActors(langCode, turn.profile, turn.persona)

        val basePitch = turn.profile.pitchHzOffset + turn.emotion.pitchDeltaHz
        val scaledPitchHz = (basePitch * pitchVariance.coerceIn(0.35f, 1.6f)).toInt().coerceIn(-48, 48)
        val effectiveRatePct = (turn.profile.ratePercentOffset + turn.emotion.rateDeltaPercent).coerceIn(-28, 35)

        val ssmlPitch = "${if (scaledPitchHz >= 0) "+" else ""}${scaledPitchHz}Hz"
        val ssmlRate = "${if (effectiveRatePct >= 0) "+" else ""}${effectiveRatePct}%"

        return withTimeoutOrNull(5500L) {
            EdgeNeuralTtsClient.synthesize(
                text = turn.speechText,
                voiceName = primaryVoice,
                pitch = ssmlPitch,
                rate = ssmlRate,
                volume = turn.emotion.volumeAttr,
                contour = turn.emotion.ssmlContour,
                fallbackVoiceName = fallbackVoice,
                targetLangHint = langCode
            )
        }
    }

    /**
     * Selects a distinct primary & fallback neural voice actor based on language, gender, persona,
     * and the character's persistent `voiceActorIndex` (0, 1, 2...).
     */
    private fun selectNeuralVoiceActors(
        langCode: String,
        profile: SpeakerVoiceProfile,
        persona: CharacterPersona
    ): Pair<String, String> {
        val isFemale = profile.gender == OcrContextGraph.Gender.FEMALE || when (persona) {
            CharacterPersona.PROTAGONIST_FEMALE,
            CharacterPersona.YOUNG_GIRL,
            CharacterPersona.ROYAL_QUEEN,
            CharacterPersona.TSUNDERE,
            CharacterPersona.CHEERFUL_FAIRY,
            CharacterPersona.ANGELIC_DIVINE -> true
            else -> false
        }

        val actorIdx = abs(profile.voiceActorIndex)

        return when (langCode) {
            "ru" -> {
                if (persona == CharacterPersona.YOUNG_BOY) {
                    val boyActors = listOf("ru-RU-SvetlanaNeural", "en-US-AvaMultilingualNeural", "en-US-BrianMultilingualNeural")
                    boyActors[actorIdx % boyActors.size] to "ru-RU-SvetlanaNeural"
                } else if (isFemale) {
                    val femaleActors = listOf(
                        "ru-RU-SvetlanaNeural",
                        "en-US-AvaMultilingualNeural",
                        "en-US-EmmaMultilingualNeural"
                    )
                    femaleActors[actorIdx % femaleActors.size] to "ru-RU-SvetlanaNeural"
                } else {
                    val maleActors = listOf(
                        "ru-RU-DmitryNeural",
                        "en-US-AndrewMultilingualNeural",
                        "en-US-BrianMultilingualNeural"
                    )
                    maleActors[actorIdx % maleActors.size] to "ru-RU-DmitryNeural"
                }
            }
            "ja" -> if (isFemale) "ja-JP-NanamiNeural" to "ja-JP-NanamiNeural" else "ja-JP-KeitaNeural" to "ja-JP-KeitaNeural"
            "zh" -> if (isFemale) "zh-CN-XiaoxiaoNeural" to "zh-CN-XiaoxiaoNeural" else "zh-CN-YunxiNeural" to "zh-CN-YunxiNeural"
            "de" -> {
                if (isFemale) {
                    val f = listOf("de-DE-KatjaNeural", "de-DE-AmalaNeural")
                    f[actorIdx % f.size] to "de-DE-KatjaNeural"
                } else {
                    val m = listOf("de-DE-ConradNeural", "de-DE-KillianNeural")
                    m[actorIdx % m.size] to "de-DE-ConradNeural"
                }
            }
            "fr" -> if (isFemale) "fr-FR-DeniseNeural" to "fr-FR-DeniseNeural" else "fr-FR-HenriNeural" to "fr-FR-HenriNeural"
            "es" -> if (isFemale) "es-ES-ElviraNeural" to "es-ES-ElviraNeural" else "es-ES-AlvaroNeural" to "es-ES-AlvaroNeural"
            "it" -> if (isFemale) "it-IT-ElsaNeural" to "it-IT-ElsaNeural" else "it-IT-DiegoNeural" to "it-IT-DiegoNeural"
            "ko" -> if (isFemale) "ko-KR-SunHiNeural" to "ko-KR-SunHiNeural" else "ko-KR-InJoonNeural" to "ko-KR-InJoonNeural"
            "uk" -> if (isFemale) "uk-UA-PolinaNeural" to "uk-UA-PolinaNeural" else "uk-UA-OstapNeural" to "uk-UA-OstapNeural"
            else -> {
                if (isFemale) {
                    val f = listOf("en-US-JennyNeural", "en-US-AriaNeural", "en-US-AvaMultilingualNeural", "en-GB-SoniaNeural", "en-US-AnaNeural")
                    f[actorIdx % f.size] to "en-US-JennyNeural"
                } else {
                    val m = when (persona) {
                        CharacterPersona.VILLAIN_BOSS, CharacterPersona.DEEP_DEMON, CharacterPersona.WISE_ELDER ->
                            listOf("en-US-RogerNeural", "en-US-AndrewMultilingualNeural", "en-US-GuyNeural")
                        CharacterPersona.GENTLEMAN_SCHOLAR ->
                            listOf("en-GB-RyanNeural", "en-US-RogerNeural", "en-US-AndrewMultilingualNeural")
                        else ->
                            listOf("en-US-GuyNeural", "en-US-AndrewMultilingualNeural", "en-US-ChristopherNeural", "en-US-BrianMultilingualNeural")
                    }
                    m[actorIdx % m.size] to "en-US-GuyNeural"
                }
            }
        }
    }

    /**
     * Plays a synthesized neural audio buffer on the Main thread with full Studio Timbre DSP
     * (decoupled formant pitch multiplier + 5-band Equalizer + Reverb) and suspends until playback finishes.
     */
    private suspend fun playSynthesizedClipAndWait(
        audioBytes: ByteArray,
        turn: DialogueTurn,
        baseSpeed: Float,
        pitchVariance: Float
    ) {
        val tempFile = File(context.cacheDir, "storm_neural_${System.nanoTime()}.mp3")
        try {
            FileOutputStream(tempFile).use { it.write(audioBytes) }
            withContext(Dispatchers.Main) {
                suspendCancellableCoroutine<Unit> { cont ->
                    try {
                        stopMediaPlayerOnly()
                        val player = MediaPlayer()
                        mediaPlayer = player
                        player.setAudioAttributes(
                            AudioAttributes.Builder()
                                .setContentType(AudioAttributes.CONTENT_TYPE_SPEECH)
                                .setUsage(AudioAttributes.USAGE_GAME)
                                .build()
                        )
                        player.setDataSource(tempFile.absolutePath)
                        player.prepare()

                        // Apply Studio Acoustic Timbre (Formant Pitch + Parametric EQ + Reverb)
                        applyStudioTimbreDsp(player, turn.profile, baseSpeed, pitchVariance)

                        requestAudioDucking()
                        player.setOnCompletionListener {
                            releaseAudioEffects()
                            abandonAudioDucking()
                            tempFile.delete()
                            if (cont.isActive) cont.resume(Unit)
                        }
                        player.setOnErrorListener { _, _, _ ->
                            releaseAudioEffects()
                            abandonAudioDucking()
                            tempFile.delete()
                            if (cont.isActive) cont.resume(Unit)
                            true
                        }
                        cont.invokeOnCancellation {
                            stopMediaPlayerOnly()
                            tempFile.delete()
                        }
                        player.start()
                    } catch (e: Throwable) {
                        tempFile.delete()
                        if (cont.isActive) cont.resume(Unit)
                    }
                }
            }
        } catch (_: Throwable) {
            tempFile.delete()
        }
    }

    /**
     * Applies per-character hardware formant pitch shifting (`PlaybackParams`) and 5-band studio EQ
     * so every character has a distinct vocal tract resonance and studio microphone warmth.
     */
    private fun applyStudioTimbreDsp(
        player: MediaPlayer,
        profile: SpeakerVoiceProfile,
        baseSpeed: Float,
        pitchVariance: Float
    ) {
        // 1. Decoupled Speed & Formant Pitch Multiplier (shifts vocal tract length F1/F2/F3)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            val formantScale = pitchVariance.coerceIn(0.35f, 1.4f)
            val targetFormantPitch = (1.0f + (profile.timbrePitchMultiplier - 1.0f) * formantScale * 0.65f)
                .coerceIn(0.84f, 1.18f)
            val targetSpeed = baseSpeed.coerceIn(0.5f, 2.0f)
            try {
                val params = PlaybackParams()
                params.speed = targetSpeed
                params.pitch = targetFormantPitch
                player.playbackParams = params
            } catch (_: Throwable) {
                try {
                    val fallbackParams = PlaybackParams()
                    fallbackParams.speed = targetSpeed
                    player.playbackParams = fallbackParams
                } catch (_: Throwable) {}
            }
        }

        // 2. Studio 5-Band Parametric Equalizer & Acoustic Space Shaping
        val sessionId = player.audioSessionId
        if (sessionId <= 0) return

        try {
            val eq = Equalizer(0, sessionId)
            val numBands = eq.numberOfBands.toInt()
            val range = eq.bandLevelRange
            val minMb = range.getOrElse(0) { -1500 }.toInt()
            val maxMb = range.getOrElse(1) { 1500 }.toInt()

            fun setBandGainDb(bandIdx: Int, gainDb: Int) {
                if (bandIdx in 0 until numBands) {
                    val targetMb = (gainDb * 100).coerceIn(minMb, maxMb).toShort()
                    eq.setBandLevel(bandIdx.toShort(), targetMb)
                }
            }

            // Typical 5-band centers: Band 0 (~60Hz), Band 1 (~230Hz), Band 2 (~910Hz), Band 3 (~3.6kHz), Band 4 (~14kHz)
            when (profile.eqPreset) {
                TimbreEqPreset.DARK_CHEST_BARITONE -> {
                    setBandGainDb(0, +4)
                    setBandGainDb(1, +6)
                    setBandGainDb(2, +1)
                    setBandGainDb(3, -2)
                    setBandGainDb(4, -2)
                }
                TimbreEqPreset.CRISP_LEAD_TENOR -> {
                    setBandGainDb(0, -2)
                    setBandGainDb(1, +1)
                    setBandGainDb(2, +2)
                    setBandGainDb(3, +5)
                    setBandGainDb(4, +3)
                }
                TimbreEqPreset.SUB_ABYSS_BOSS -> {
                    setBandGainDb(0, +8)
                    setBandGainDb(1, +7)
                    setBandGainDb(2, -1)
                    setBandGainDb(3, -3)
                    setBandGainDb(4, -4)
                }
                TimbreEqPreset.BRIGHT_YOUTH_CRYSTAL -> {
                    setBandGainDb(0, -5)
                    setBandGainDb(1, -2)
                    setBandGainDb(2, +2)
                    setBandGainDb(3, +6)
                    setBandGainDb(4, +5)
                }
                TimbreEqPreset.RADIO_CYBORG_COMMS -> {
                    setBandGainDb(0, -12)
                    setBandGainDb(1, -6)
                    setBandGainDb(2, +9)
                    setBandGainDb(3, +6)
                    setBandGainDb(4, -10)
                }
                TimbreEqPreset.ETHEREAL_HALL_SPIRIT -> {
                    setBandGainDb(0, -3)
                    setBandGainDb(1, +2)
                    setBandGainDb(2, +1)
                    setBandGainDb(3, +4)
                    setBandGainDb(4, +7)
                }
                TimbreEqPreset.VELVET_ROYAL_ALTO -> {
                    setBandGainDb(0, +2)
                    setBandGainDb(1, +5)
                    setBandGainDb(2, +2)
                    setBandGainDb(3, +3)
                    setBandGainDb(4, +1)
                }
                else -> { // STUDIO_CONDENSER
                    setBandGainDb(0, +1)
                    setBandGainDb(1, +3)
                    setBandGainDb(2, +0)
                    setBandGainDb(3, +3)
                    setBandGainDb(4, +2)
                }
            }
            eq.enabled = true
            activeEqualizer = eq
        } catch (_: Throwable) {}

        // Optional Subtle Studio Reverb for Ethereal Spirits / Bosses
        if (profile.eqPreset == TimbreEqPreset.ETHEREAL_HALL_SPIRIT || profile.eqPreset == TimbreEqPreset.SUB_ABYSS_BOSS) {
            try {
                val reverb = PresetReverb(0, sessionId)
                reverb.preset = if (profile.eqPreset == TimbreEqPreset.ETHEREAL_HALL_SPIRIT) {
                    PresetReverb.PRESET_LARGEHALL
                } else {
                    PresetReverb.PRESET_MEDIUMHALL
                }
                reverb.enabled = true
                activeReverb = reverb
            } catch (_: Throwable) {}
        }
    }

    private fun speakNativeMultiVoice(
        text: String,
        persona: CharacterPersona,
        profile: SpeakerVoiceProfile?,
        baseSpeed: Float,
        targetLang: String,
        pitchVariance: Float = 1.0f,
        isSingleMode: Boolean = false,
        queueAdd: Boolean = false
    ) {
        if (tts == null || !isReady) {
            initTts()
        }
        val locale = localeForCode(targetLang)
        applyLanguage(locale)
        if (isSingleMode) {
            tts?.setPitch(1.0f)
            tts?.setSpeechRate(baseSpeed)
        } else {
            applyPersonaVoice(persona, profile, baseSpeed, locale, pitchVariance)
        }
        val queueMode = if (queueAdd) TextToSpeech.QUEUE_ADD else TextToSpeech.QUEUE_FLUSH
        tts?.speak(text, queueMode, null, "game_tts_multi_${System.nanoTime()}")
    }

    private fun extractSpeakerAndDialogue(rawText: String): Pair<String, String> {
        val lines = rawText.lines().map { it.trim() }.filter { it.isNotEmpty() }
        if (lines.isEmpty()) return "" to rawText

        val first = lines.first()
        val firstLower = first.lowercase()

        val candidateSpeaker = when {
            firstLower.contains(":") && first.substringBefore(":").trim().length in 2..24 ->
                first.substringBefore(":").trim()
            firstLower.contains("—") && first.substringBefore("—").trim().length in 2..22 && !first.startsWith("—") ->
                first.substringBefore("—").trim()
            firstLower.startsWith("【") && firstLower.contains("】") ->
                first.substringAfter("【").substringBefore("】").trim()
            firstLower.startsWith("[") && firstLower.contains("]") ->
                first.substringAfter("[").substringBefore("]").trim()
            firstLower.startsWith("«") && firstLower.contains("»") && firstLower.indexOf("»") <= 22 && first.substringAfter("»").trim().startsWith("—") ->
                first.substringAfter("«").substringBefore("»").trim()
            lines.size >= 2 && first.length in 2..22 && first.split(Regex("\\s+")).size <= 3 &&
                    !first.endsWith(".") && !first.endsWith("?") && !first.endsWith("!") && !first.startsWith("—") ->
                first
            else -> ""
        }.trim()

        val dialogueText = when {
            candidateSpeaker.isNotEmpty() && first.contains(":") ->
                rawText.substringAfter(":", "").trim().ifBlank { rawText }
            candidateSpeaker.isNotEmpty() && first.contains("—") && !first.startsWith("—") ->
                rawText.substringAfter("—", "").trim().ifBlank { rawText }
            candidateSpeaker.isNotEmpty() && first.startsWith("【") ->
                rawText.substringAfter("】", "").trim().ifBlank { rawText }
            candidateSpeaker.isNotEmpty() && first.startsWith("[") ->
                rawText.substringAfter("]", "").trim().ifBlank { rawText }
            candidateSpeaker.isNotEmpty() && lines.size >= 2 && first == candidateSpeaker ->
                lines.drop(1).joinToString("\n")
            else -> rawText.removePrefix("—").removePrefix("- ").removePrefix("–").trim().ifBlank { rawText }
        }

        return candidateSpeaker to dialogueText
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

    private fun applyPersonaVoice(
        persona: CharacterPersona,
        profile: SpeakerVoiceProfile?,
        baseSpeed: Float,
        locale: Locale,
        pitchVariance: Float = 1.0f
    ) {
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

        val isMale = if (profile != null) {
            profile.gender != OcrContextGraph.Gender.FEMALE
        } else {
            when (persona) {
                CharacterPersona.PROTAGONIST_FEMALE,
                CharacterPersona.YOUNG_GIRL,
                CharacterPersona.ROYAL_QUEEN,
                CharacterPersona.TSUNDERE,
                CharacterPersona.CHEERFUL_FAIRY,
                CharacterPersona.ANGELIC_DIVINE -> false
                else -> true
            }
        }

        val actorIdx = abs(profile?.voiceActorIndex ?: 0)
        val selectedVoice = if (isMale) {
            if (maleVoices.isNotEmpty()) maleVoices[actorIdx % maleVoices.size]
            else langVoices.firstOrNull { !femaleVoices.contains(it) }
        } else {
            if (femaleVoices.isNotEmpty()) femaleVoices[actorIdx % femaleVoices.size]
            else langVoices.firstOrNull()
        }

        try {
            if (selectedVoice != null) {
                tts?.voice = selectedVoice
            }
        } catch (_: Throwable) {}

        val profilePitchFactor = profile?.timbrePitchMultiplier ?: persona.pitch
        val adjustedPitch = (1.0f + (profilePitchFactor - 1.0f) * pitchVariance).coerceIn(0.35f, 2.0f)
        val rateOffsetFactor = if (profile != null) (1.0f + profile.ratePercentOffset / 100f) else persona.rateMultiplier
        val adjustedRate = (baseSpeed * rateOffsetFactor).coerceIn(0.45f, 2.4f)
        tts?.setPitch(adjustedPitch)
        tts?.setSpeechRate(adjustedRate)
    }

    private fun stopMediaPlayerOnly() {
        releaseAudioEffects()
        try {
            mediaPlayer?.stop()
        } catch (_: Throwable) {}
        try {
            mediaPlayer?.release()
        } catch (_: Throwable) {}
        mediaPlayer = null
    }

    fun stop() {
        try {
            studioQueueJob?.cancel()
            studioQueueJob = null
            abandonAudioDucking()
            stopMediaPlayerOnly()
            tts?.stop()
        } catch (_: Throwable) {}
    }

    fun destroy() {
        try {
            studioQueueJob?.cancel()
            studioQueueJob = null
            abandonAudioDucking()
            stopMediaPlayerOnly()
            tts?.stop()
            tts?.shutdown()
            tts = null
        } catch (_: Throwable) {}
    }
}

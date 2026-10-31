package me.magnum.melonds.translator.context

import android.content.Context
import android.os.Environment
import android.util.Log
import org.json.JSONArray
import org.json.JSONObject
import java.io.File
import kotlin.math.abs

/**
 * Studio-Grade Story & Character Context Graph for Game OCR, Multi-Speaker Detection,
 * Gender Grammar Inference, and Persistent Per-Game Voice Timbre Registry.
 *
 * Ensures that every named or recurring character across any Nintendo DS / DSi game
 * is assigned a deterministic, unique vocal profile (base neural actor, persona archetype,
 * SSML pitch/rate offsets, hardware formant multiplier, and studio EQ/reverb preset)
 * and keeps that exact voice throughout the entire game and across app restarts.
 */
object OcrContextGraph {
    private const val TAG = "OcrContextGraph"

    data class CharacterEntity(
        val name: String,
        val aliases: List<String>,
        val gender: Gender,
        val role: String,
        val defaultPersona: String,
        val preferredActorIndex: Int = -1,
        val customPitchOffsetHz: Int? = null,
        val customRateOffsetPercent: Int? = null,
        val customTimbreMultiplier: Float? = null,
        val customEqPreset: Int? = null
    )

    enum class Gender {
        MALE, FEMALE, NEUTRAL
    }

    /**
     * Studio Acoustic EQ & Resonance Presets applied to MediaPlayer's audio session.
     */
    object TimbreEqPreset {
        const val STUDIO_CONDENSER = 0       // Balanced warm broadcast studio mic
        const val DARK_CHEST_BARITONE = 1    // Deep chest resonance (+180Hz boost, smooth highs)
        const val CRISP_LEAD_TENOR = 2       // Articulate presence (+3kHz clarity, tight lows)
        const val SUB_ABYSS_BOSS = 3         // Massive sub-bass + cavern resonance
        const val BRIGHT_YOUTH_CRYSTAL = 4   // Light vocal tract (-lows, +4kHz-8kHz sparkle)
        const val RADIO_CYBORG_COMMS = 5     // Band-pass metallic comms / droid / Pokedex
        const val ETHEREAL_HALL_SPIRIT = 6   // Spacious cathedral reverb + airy shimmer
        const val VELVET_ROYAL_ALTO = 7      // Rich mid-warmth for royalty, scholars & mentors
    }

    /**
     * Persistent acoustic signature assigned to an individual character in a game.
     */
    data class SpeakerVoiceProfile(
        val speakerKey: String,
        val displayName: String,
        val gender: Gender,
        val persona: String,
        val voiceActorIndex: Int,
        val pitchHzOffset: Int,
        val ratePercentOffset: Int,
        val timbrePitchMultiplier: Float,
        val eqPreset: Int
    ) {
        fun toJson(): JSONObject = JSONObject().apply {
            put("speakerKey", speakerKey)
            put("displayName", displayName)
            put("gender", gender.name)
            put("persona", persona)
            put("voiceActorIndex", voiceActorIndex)
            put("pitchHzOffset", pitchHzOffset)
            put("ratePercentOffset", ratePercentOffset)
            put("timbrePitchMultiplier", timbrePitchMultiplier.toDouble())
            put("eqPreset", eqPreset)
        }

        companion object {
            fun fromJson(obj: JSONObject): SpeakerVoiceProfile? {
                return runCatching {
                    SpeakerVoiceProfile(
                        speakerKey = obj.getString("speakerKey"),
                        displayName = obj.optString("displayName", obj.getString("speakerKey")),
                        gender = runCatching { Gender.valueOf(obj.optString("gender", "MALE")) }.getOrDefault(Gender.MALE),
                        persona = obj.optString("persona", "PROTAGONIST_MALE"),
                        voiceActorIndex = obj.optInt("voiceActorIndex", 0),
                        pitchHzOffset = obj.optInt("pitchHzOffset", 0).coerceIn(-48, 48),
                        ratePercentOffset = obj.optInt("ratePercentOffset", 0).coerceIn(-25, 30),
                        timbrePitchMultiplier = obj.optDouble("timbrePitchMultiplier", 1.0).toFloat().coerceIn(0.75f, 1.30f),
                        eqPreset = obj.optInt("eqPreset", TimbreEqPreset.STUDIO_CONDENSER).coerceIn(0, 7)
                    )
                }.getOrNull()
            }
        }
    }

    private val entities = mutableMapOf<String, CharacterEntity>()
    private val glossary = mutableMapOf<String, String>()

    // Persistent & in-memory speaker voice profiles (keyed by normalized speaker name)
    private val speakerProfileCache = mutableMapOf<String, SpeakerVoiceProfile>()
    private val speakerPersonaCache = mutableMapOf<String, String>()

    private var currentGameKey: String = "global"
    private var lastActiveSpeaker: CharacterEntity? = null
    private var lastActiveProfile: SpeakerVoiceProfile? = null
    private var previousSpeakerWasMale = true
    var activeSpeakerName: String = ""
    var activeSpeakerGender: me.magnum.melonds.translator.grammar.Gender = me.magnum.melonds.translator.grammar.Gender.NEUTRAL

    fun setExplicitActiveSpeaker(name: String, gender: me.magnum.melonds.translator.grammar.Gender) {
        activeSpeakerName = name
        activeSpeakerGender = gender
        val ocrGender = when (gender) {
            me.magnum.melonds.translator.grammar.Gender.MALE -> Gender.MALE
            me.magnum.melonds.translator.grammar.Gender.FEMALE -> Gender.FEMALE
            me.magnum.melonds.translator.grammar.Gender.NEUTRAL -> Gender.NEUTRAL
        }
        val existing = entities[name.trim().lowercase()]
            ?: entities.values.firstOrNull { e ->
                e.name.equals(name, ignoreCase = true) || e.aliases.any { it.equals(name, ignoreCase = true) }
            }
        if (existing != null) {
            lastActiveSpeaker = existing.copy(gender = ocrGender)
        } else if (name.isNotBlank()) {
            val entity = CharacterEntity(
                name = name,
                aliases = listOf(name),
                gender = ocrGender,
                role = "character",
                defaultPersona = if (ocrGender == Gender.FEMALE) "HEROINE" else "HERO"
            )
            lastActiveSpeaker = entity
        }
    }

    // Russian/English first-person past-tense verb & short-adjective markers for grammatical gender detection
    private val FEMALE_SELF_GRAMMAR = Regex(
        "(?i)\\bя\\s+(?:не\\s+|уже\\s+|так\\s+|очень\\s+|сама\\s+)*(?:пришла|ушла|видела|знала|думала|хотела|смогла|решила|сказала|слышала|нашла|поняла|забыла|сделала|была|стала|взяла|дала|ждала|жила|рада|готова|должна|уверена|согласна|виновата|устала|сама|одна)\\b"
    )
    private val MALE_SELF_GRAMMAR = Regex(
        "(?i)\\bя\\s+(?:не\\s+|уже\\s+|так\\s+|очень\\s+|сам\\s+)*(?:пришёл|пришел|ушёл|ушел|видел|знал|думал|хотел|смог|решил|сказал|слышал|нашёл|нашел|понял|забыл|сделал|был|стал|взял|дал|ждал|жил|рад|готов|должен|уверен|согласен|виноват|устал|сам|один)\\b"
    )

    private val FEMALE_TITLES_AND_ROLES = setOf(
        "мисс", "миссис", "леди", "госпожа", "мадам", "мадемуазель", "принцесса", "королева",
        "сестра", "медсестра", "тётя", "тетя", "бабушка", "мама", "мать", "девушка", "женщина",
        "девочка", "старуха", "старушка", "ведьма", "колдунья", "жрица", "богиня", "фея",
        "хозяйка", "горничная", "учительница", "графиня", "герцогиня", "императрица",
        "miss", "mrs", "ms", "lady", "madam", "princess", "queen", "sister", "nurse",
        "aunt", "grandma", "grandmother", "mother", "mom", "girl", "woman", "witch", "priestess", "goddess", "maid"
    )

    private val MALE_TITLES_AND_ROLES = setOf(
        "мистер", "м-р", "сэр", "лорд", "господин", "месье", "принц", "король", "император",
        "брат", "дядя", "дедушка", "дед", "отец", "папа", "парень", "мужчина", "мальчик",
        "старик", "старец", "капитан", "сержант", "лейтенант", "майор", "полковник", "генерал",
        "адмирал", "командир", "инспектор", "детектив", "комиссар", "шериф", "офицер",
        "профессор", "доктор", "мастер", "монах", "священник", "рыцарь", "стражник", "солдат",
        "трактирщик", "кузнец", "торговец", "пират", "судья", "барон", "граф", "герцог",
        "mr", "sir", "lord", "prince", "king", "emperor", "brother", "uncle", "grandpa",
        "grandfather", "father", "dad", "boy", "man", "old man", "captain", "sergeant",
        "lieutenant", "general", "commander", "inspector", "detective", "commissioner",
        "professor", "doctor", "dr", "master", "monk", "priest", "knight", "guard", "soldier", "judge"
    )

    init {
        preloadNintendoDsFranchiseRoster()
        preloadUniversalGlossary()
    }

    private fun preloadNintendoDsFranchiseRoster() {
        // === DC / BATMAN: THE BRAVE AND THE BOLD & LEGO BATMAN ===
        registerEntity("Batman", listOf("Бэтмен", "Бэтмэн", "Брюс", "Брюс Уэйн", "Bruce", "Wayne", "Dark Knight", "Темный рыцарь"), Gender.MALE, "Hero", "HERO_DARK_VIGILANTE", 0, -20, -8, 0.86f, TimbreEqPreset.DARK_CHEST_BARITONE)
        registerEntity("Robin", listOf("Робин", "Дик Грейсон", "Тим Дрейк"), Gender.MALE, "Hero", "PROTAGONIST_MALE", 1, 8, 8, 1.06f, TimbreEqPreset.CRISP_LEAD_TENOR)
        registerEntity("BlueBeetle", listOf("Синий Жук", "Blue Beetle", "Хайме", "Тед Корд"), Gender.MALE, "Hero", "PROTAGONIST_MALE", 2, 12, 10, 1.08f, TimbreEqPreset.CRISP_LEAD_TENOR)
        registerEntity("GuyGardner", listOf("Гай Гарднер", "Guy Gardner", "Зеленый Фонарь", "Green Lantern", "Хэл Джордан"), Gender.MALE, "Hero", "KNIGHT_WARRIOR", 1, -8, 6, 0.94f, TimbreEqPreset.DARK_CHEST_BARITONE)
        registerEntity("Aquaman", listOf("Аквамен", "Aquaman", "Артур Карри"), Gender.MALE, "Hero", "KNIGHT_WARRIOR", 0, -14, 4, 0.90f, TimbreEqPreset.VELVET_ROYAL_ALTO)
        registerEntity("GreenArrow", listOf("Зеленая Стрела", "Green Arrow", "Оливер Куин"), Gender.MALE, "Hero", "PROTAGONIST_MALE", 1, -2, 6, 0.97f, TimbreEqPreset.CRISP_LEAD_TENOR)
        registerEntity("RedTornado", listOf("Красный Торнадо", "Red Tornado"), Gender.MALE, "Robot", "CYBORG_ROBOT", 0, -16, 4, 0.88f, TimbreEqPreset.RADIO_CYBORG_COMMS)
        registerEntity("Catwoman", listOf("Женщина-кошка", "Женщина-Кошка", "Catwoman", "Селина", "Selina"), Gender.FEMALE, "Antihero", "ROYAL_QUEEN", 0, 2, 2, 0.98f, TimbreEqPreset.VELVET_ROYAL_ALTO)
        registerEntity("HarleyQuinn", listOf("Харли Квинн", "Харли", "Harley Quinn", "Harley"), Gender.FEMALE, "Villain", "CHEERFUL_FAIRY", 1, 28, 18, 1.15f, TimbreEqPreset.BRIGHT_YOUTH_CRYSTAL)
        registerEntity("Joker", listOf("Джокер", "Клоун", "Clown Prince", "Joker:"), Gender.MALE, "Villain", "VILLAIN_MANIC", 2, 24, 22, 1.12f, TimbreEqPreset.CRISP_LEAD_TENOR)
        registerEntity("TwoFace", listOf("Двуликий", "Two-Face", "Харви Дент", "Harvey Dent"), Gender.MALE, "Villain", "HERO_DARK_VIGILANTE", 1, -15, -4, 0.89f, TimbreEqPreset.DARK_CHEST_BARITONE)
        registerEntity("Riddler", listOf("Загадочник", "Риддлер", "Riddler", "Эдвард Нигма"), Gender.MALE, "Villain", "MAD_SCIENTIST", 2, 16, 16, 1.07f, TimbreEqPreset.CRISP_LEAD_TENOR)
        registerEntity("Penguin", listOf("Пингвин", "Penguin", "Освальд Кобблпот"), Gender.MALE, "Villain", "MERCHANT", 1, -6, 10, 0.93f, TimbreEqPreset.VELVET_ROYAL_ALTO)
        registerEntity("Bane", listOf("Бэйн", "Бейн", "Bane"), Gender.MALE, "Boss", "VILLAIN_BOSS", 0, -30, -12, 0.80f, TimbreEqPreset.SUB_ABYSS_BOSS)
        registerEntity("Scarecrow", listOf("Пугало", "Scarecrow", "Джонатан Крейн"), Gender.MALE, "Villain", "WHISPER_MYSTERIOUS", 2, -8, -14, 0.92f, TimbreEqPreset.ETHEREAL_HALL_SPIRIT)
        registerEntity("BatMite", listOf("Бэт-Майт", "Бэтмайт", "Bat-Mite"), Gender.MALE, "Imp", "COMEDY_GOOFY", 2, 36, 24, 1.20f, TimbreEqPreset.BRIGHT_YOUTH_CRYSTAL)
        registerEntity("Gordon", listOf("Гордон", "Комиссар Гордон", "Джим Гордон", "Commissioner Gordon"), Gender.MALE, "Commissioner", "SOLDIER", 0, -10, -2, 0.91f, TimbreEqPreset.DARK_CHEST_BARITONE)
        registerEntity("Alfred", listOf("Альфред", "Alfred", "Пенниуорт"), Gender.MALE, "Butler", "WISE_ELDER", 1, -12, -10, 0.90f, TimbreEqPreset.VELVET_ROYAL_ALTO)

        // === ACE ATTORNEY / APOLLO JUSTICE / MILES EDGEWORTH INVESTIGATIONS ===
        registerEntity("Phoenix", listOf("Феникс", "Райт", "Феникс Райт", "Phoenix Wright", "Phoenix", "Wright", "Naruhodo"), Gender.MALE, "Lawyer", "PROTAGONIST_MALE", 0, 2, 4, 1.01f, TimbreEqPreset.CRISP_LEAD_TENOR)
        registerEntity("Miles", listOf("Эджворт", "Майлз", "Майлз Эджворт", "Miles Edgeworth", "Edgeworth", "Mitsurugi"), Gender.MALE, "Prosecutor", "GENTLEMAN_SCHOLAR", 1, -6, -4, 0.94f, TimbreEqPreset.VELVET_ROYAL_ALTO)
        registerEntity("Maya", listOf("Майя", "Майя Фей", "Maya Fey", "Mayoi"), Gender.FEMALE, "Spirit Medium", "PROTAGONIST_FEMALE", 0, 10, 8, 1.05f, TimbreEqPreset.STUDIO_CONDENSER)
        registerEntity("Mia", listOf("Мия", "Мия Фей", "Mia Fey"), Gender.FEMALE, "Mentor", "ROYAL_QUEEN", 1, -2, -2, 0.96f, TimbreEqPreset.VELVET_ROYAL_ALTO)
        registerEntity("Pearl", listOf("Перл", "Перл Фей", "Pearl Fey", "Pearls"), Gender.FEMALE, "Companion", "YOUNG_GIRL", 2, 30, 10, 1.16f, TimbreEqPreset.BRIGHT_YOUTH_CRYSTAL)
        registerEntity("Gumshoe", listOf("Гамшу", "Детектив Гамшу", "Дик Гамшу", "Dick Gumshoe", "Itonoko"), Gender.MALE, "Detective", "SOLDIER", 2, -12, 6, 0.90f, TimbreEqPreset.DARK_CHEST_BARITONE)
        registerEntity("Franziska", listOf("Франциска", "Франциска фон Карма", "Franziska von Karma"), Gender.FEMALE, "Prosecutor", "TSUNDERE", 1, 14, 14, 1.07f, TimbreEqPreset.CRISP_LEAD_TENOR)
        registerEntity("Manfred", listOf("Манфред", "Манфред фон Карма", "Manfred von Karma", "Фон Карма"), Gender.MALE, "Prosecutor", "VILLAIN_BOSS", 0, -24, -10, 0.83f, TimbreEqPreset.SUB_ABYSS_BOSS)
        registerEntity("Godot", listOf("Годо", "Диего Армандо", "Godot", "Diego Armando"), Gender.MALE, "Prosecutor", "HERO_DARK_VIGILANTE", 1, -16, -8, 0.88f, TimbreEqPreset.DARK_CHEST_BARITONE)
        registerEntity("Apollo", listOf("Аполло", "Аполло Джастис", "Apollo Justice"), Gender.MALE, "Lawyer", "PROTAGONIST_MALE", 2, 8, 8, 1.05f, TimbreEqPreset.CRISP_LEAD_TENOR)
        registerEntity("Trucy", listOf("Труси", "Труси Райт", "Trucy Wright", "Trucy"), Gender.FEMALE, "Magician", "YOUNG_GIRL", 0, 22, 12, 1.11f, TimbreEqPreset.BRIGHT_YOUTH_CRYSTAL)
        registerEntity("Klavier", listOf("Клавир", "Клавир Гэвин", "Klavier Gavin", "Klavier"), Gender.MALE, "Prosecutor", "GENTLEMAN_SCHOLAR", 2, 4, 4, 1.02f, TimbreEqPreset.VELVET_ROYAL_ALTO)
        registerEntity("Kristoph", listOf("Кристоф", "Кристоф Гэвин", "Kristoph Gavin"), Gender.MALE, "Lawyer", "GENTLEMAN_SCHOLAR", 1, -10, -8, 0.92f, TimbreEqPreset.VELVET_ROYAL_ALTO)
        registerEntity("Ema", listOf("Эма", "Эмма", "Эма Скай", "Ema Skye"), Gender.FEMALE, "Detective", "PROTAGONIST_FEMALE", 2, 12, 6, 1.04f, TimbreEqPreset.STUDIO_CONDENSER)
        registerEntity("KayFaraday", listOf("Кей", "Кей Фарадей", "Kay Faraday"), Gender.FEMALE, "Thief", "YOUNG_GIRL", 1, 20, 12, 1.10f, TimbreEqPreset.BRIGHT_YOUTH_CRYSTAL)
        registerEntity("Lang", listOf("Ланг", "Ши-Лонг Ланг", "Shi-Long Lang", "Agent Lang"), Gender.MALE, "Agent", "KNIGHT_WARRIOR", 0, -14, 2, 0.89f, TimbreEqPreset.DARK_CHEST_BARITONE)
        registerEntity("Judge", listOf("Судья", "Ваша Честь", "Ваша честь", "Your Honor", "The Judge"), Gender.MALE, "Judge", "WISE_ELDER", 0, -14, -10, 0.88f, TimbreEqPreset.VELVET_ROYAL_ALTO)
        registerEntity("LarryButz", listOf("Ларри", "Ларри Батц", "Larry Butz"), Gender.MALE, "Friend", "COMEDY_GOOFY", 2, 18, 16, 1.09f, TimbreEqPreset.CRISP_LEAD_TENOR)

        // === PROFESSOR LAYTON SERIES ===
        registerEntity("Layton", listOf("Лейтон", "Профессор Лейтон", "Хершел Лейтон", "Professor Layton", "Hershel Layton"), Gender.MALE, "Scholar", "GENTLEMAN_SCHOLAR", 0, -4, -4, 0.95f, TimbreEqPreset.VELVET_ROYAL_ALTO)
        registerEntity("Luke", listOf("Люк", "Люк Тритон", "Luke Triton"), Gender.MALE, "Apprentice", "YOUNG_BOY", 1, 26, 12, 1.15f, TimbreEqPreset.BRIGHT_YOUTH_CRYSTAL)
        registerEntity("Flora", listOf("Флора", "Флора Рейнхольд", "Flora Reinhold"), Gender.FEMALE, "Heroine", "YOUNG_GIRL", 0, 24, 6, 1.12f, TimbreEqPreset.BRIGHT_YOUTH_CRYSTAL)
        registerEntity("DonPaolo", listOf("Дон Паоло", "Don Paolo", "Паоло"), Gender.MALE, "Villain", "MAD_SCIENTIST", 2, 20, 18, 1.08f, TimbreEqPreset.CRISP_LEAD_TENOR)
        registerEntity("Chelmey", listOf("Челми", "Инспектор Челми", "Inspector Chelmey"), Gender.MALE, "Inspector", "SOLDIER", 1, -10, 6, 0.91f, TimbreEqPreset.DARK_CHEST_BARITONE)
        registerEntity("Descole", listOf("Дескоул", "Жан Дескоул", "Jean Descole"), Gender.MALE, "Villain", "HERO_DARK_VIGILANTE", 0, -16, -4, 0.88f, TimbreEqPreset.DARK_CHEST_BARITONE)
        registerEntity("Emmy", listOf("Эмми", "Эмми Альтава", "Emmy Altava"), Gender.FEMALE, "Assistant", "PROTAGONIST_FEMALE", 1, 6, 6, 1.02f, TimbreEqPreset.CRISP_LEAD_TENOR)

        // === 999: NINE HOURS, NINE PERSONS, NINE DOORS ===
        registerEntity("Junpei", listOf("Джунпей", "Junpei"), Gender.MALE, "Hero", "PROTAGONIST_MALE", 0, 4, 4, 1.01f, TimbreEqPreset.CRISP_LEAD_TENOR)
        registerEntity("June", listOf("Джун", "Аканэ", "June", "Akane", "Курашики"), Gender.FEMALE, "Heroine", "PROTAGONIST_FEMALE", 0, 10, 4, 1.04f, TimbreEqPreset.STUDIO_CONDENSER)
        registerEntity("Santa", listOf("Санта", "Аой", "Santa"), Gender.MALE, "Rebel", "PIRATE", 1, 6, 12, 1.03f, TimbreEqPreset.CRISP_LEAD_TENOR)
        registerEntity("Seven", listOf("Севен", "Seven"), Gender.MALE, "Detective", "SOLDIER", 0, -18, -2, 0.86f, TimbreEqPreset.DARK_CHEST_BARITONE)
        registerEntity("Lotus", listOf("Лотос", "Lotus", "Хазуки"), Gender.FEMALE, "Hacker", "ROYAL_QUEEN", 1, -4, 4, 0.95f, TimbreEqPreset.VELVET_ROYAL_ALTO)
        registerEntity("Clover", listOf("Кловер", "Clover"), Gender.FEMALE, "Girl", "YOUNG_GIRL", 2, 26, 10, 1.13f, TimbreEqPreset.BRIGHT_YOUTH_CRYSTAL)
        registerEntity("Ace", listOf("Эйс", "Ace", "Хонго"), Gender.MALE, "Elder", "WISE_ELDER", 1, -12, -8, 0.90f, TimbreEqPreset.VELVET_ROYAL_ALTO)
        registerEntity("Snake999", listOf("Лайт", "Light", "Нильс"), Gender.MALE, "Scholar", "GENTLEMAN_SCHOLAR", 2, -2, -6, 0.97f, TimbreEqPreset.VELVET_ROYAL_ALTO)
        registerEntity("Zero", listOf("Зеро", "Zero"), Gender.NEUTRAL, "Mastermind", "CYBORG_ROBOT", 0, -22, -8, 0.84f, TimbreEqPreset.RADIO_CYBORG_COMMS)

        // === GHOST TRICK: PHANTOM DETECTIVE ===
        registerEntity("Sissel", listOf("Сиссел", "Sissel"), Gender.MALE, "Ghost", "PROTAGONIST_MALE", 0, 2, 4, 1.00f, TimbreEqPreset.CRISP_LEAD_TENOR)
        registerEntity("Lynne", listOf("Линн", "Lynne"), Gender.FEMALE, "Detective", "PROTAGONIST_FEMALE", 0, 8, 8, 1.04f, TimbreEqPreset.STUDIO_CONDENSER)
        registerEntity("Cabanela", listOf("Кабанела", "Инспектор Кабанела", "Cabanela"), Gender.MALE, "Inspector", "VILLAIN_MANIC", 2, 14, 12, 1.06f, TimbreEqPreset.VELVET_ROYAL_ALTO)
        registerEntity("Missile", listOf("Миссайл", "Missile"), Gender.MALE, "Pomeranian", "YOUNG_BOY", 1, 32, 20, 1.18f, TimbreEqPreset.BRIGHT_YOUTH_CRYSTAL)
        registerEntity("Jowd", listOf("Джоуд", "Jowd"), Gender.MALE, "Prisoner", "HERO_DARK_VIGILANTE", 0, -16, -6, 0.87f, TimbreEqPreset.DARK_CHEST_BARITONE)
        registerEntity("Kamila", listOf("Камила", "Kamila"), Gender.FEMALE, "Child", "YOUNG_GIRL", 2, 28, 8, 1.15f, TimbreEqPreset.BRIGHT_YOUTH_CRYSTAL)

        // === HOTEL DUSK: ROOM 215 & LAST WINDOW ===
        registerEntity("KyleHyde", listOf("Кайл", "Хайд", "Кайл Хайд", "Kyle Hyde"), Gender.MALE, "Detective", "HERO_DARK_VIGILANTE", 0, -16, -6, 0.88f, TimbreEqPreset.DARK_CHEST_BARITONE)
        registerEntity("Mila", listOf("Мила", "Мила Эванс", "Mila Evans"), Gender.FEMALE, "Girl", "WHISPER_MYSTERIOUS", 0, 12, -12, 1.05f, TimbreEqPreset.ETHEREAL_HALL_SPIRIT)
        registerEntity("RosaFox", listOf("Роза Фокс", "Rosa Fox"), Gender.FEMALE, "Maid", "ROYAL_QUEEN", 1, -4, 6, 0.95f, TimbreEqPreset.VELVET_ROYAL_ALTO)
        registerEntity("Dunning", listOf("Даннинг", "Даннинг Смит", "Dunning Smith"), Gender.MALE, "Owner", "WISE_ELDER", 1, -14, -6, 0.89f, TimbreEqPreset.DARK_CHEST_BARITONE)
        registerEntity("EdVincent", listOf("Эд", "Эд Винсент", "Ed Vincent"), Gender.MALE, "Boss", "WISE_ELDER", 2, -10, -4, 0.91f, TimbreEqPreset.VELVET_ROYAL_ALTO)
        registerEntity("Rachel", listOf("Рэйчел", "Рейчел", "Rachel"), Gender.FEMALE, "Secretary", "PROTAGONIST_FEMALE", 2, 6, 8, 1.03f, TimbreEqPreset.STUDIO_CONDENSER)
        registerEntity("Louis", listOf("Луи", "Луи ДеНонно", "Louis DeNonno", "Louie"), Gender.MALE, "Bellhop", "PIRATE", 2, 8, 10, 1.04f, TimbreEqPreset.CRISP_LEAD_TENOR)

        // === THE WORLD ENDS WITH YOU (TWEWY) ===
        registerEntity("Neku", listOf("Неку", "Неку Сакураба", "Neku Sakuraba"), Gender.MALE, "Hero", "PROTAGONIST_MALE", 0, 4, 6, 1.02f, TimbreEqPreset.CRISP_LEAD_TENOR)
        registerEntity("Shiki", listOf("Шики", "Шики Мисаки", "Shiki Misaki"), Gender.FEMALE, "Partner", "TSUNDERE", 0, 14, 10, 1.06f, TimbreEqPreset.STUDIO_CONDENSER)
        registerEntity("Joshua", listOf("Джошуа", "Йошия", "Joshua"), Gender.MALE, "Partner", "GENTLEMAN_SCHOLAR", 2, 12, 4, 1.07f, TimbreEqPreset.VELVET_ROYAL_ALTO)
        registerEntity("Beat", listOf("Бит", "Beat", "Дайсукеноджо"), Gender.MALE, "Partner", "PIRATE", 1, -4, 14, 0.95f, TimbreEqPreset.DARK_CHEST_BARITONE)
        registerEntity("Rhyme", listOf("Райм", "Rhyme"), Gender.FEMALE, "Partner", "YOUNG_GIRL", 2, 24, 8, 1.12f, TimbreEqPreset.BRIGHT_YOUTH_CRYSTAL)
        registerEntity("Minamimoto", listOf("Минамимото", "Шо", "Шо Минамимото", "Sho Minamimoto"), Gender.MALE, "Reaper", "VILLAIN_MANIC", 2, 16, 18, 1.05f, TimbreEqPreset.CRISP_LEAD_TENOR)
        registerEntity("Hanekoma", listOf("Ханекома", "Санаэ Ханекома", "Mr. Hanekoma", "Мистер Ханекома"), Gender.MALE, "Producer", "GENTLEMAN_SCHOLAR", 1, -8, -4, 0.93f, TimbreEqPreset.VELVET_ROYAL_ALTO)

        // === CHRONO TRIGGER DS ===
        registerEntity("Crono", listOf("Кроно", "Хроно", "Crono"), Gender.MALE, "Hero", "PROTAGONIST_MALE", 0, 6, 4, 1.02f, TimbreEqPreset.CRISP_LEAD_TENOR)
        registerEntity("Marle", listOf("Марл", "Принцесса Надия", "Marle", "Nadia"), Gender.FEMALE, "Princess", "PROTAGONIST_FEMALE", 0, 14, 10, 1.06f, TimbreEqPreset.BRIGHT_YOUTH_CRYSTAL)
        registerEntity("Lucca", listOf("Лукка", "Lucca"), Gender.FEMALE, "Inventor", "PROTAGONIST_FEMALE", 1, 6, 8, 1.02f, TimbreEqPreset.STUDIO_CONDENSER)
        registerEntity("Frog", listOf("Фрог", "Гленн", "Frog", "Glenn"), Gender.MALE, "Knight", "KNIGHT_WARRIOR", 0, -12, -4, 0.90f, TimbreEqPreset.DARK_CHEST_BARITONE)
        registerEntity("Robo", listOf("Робо", "Прометей", "Robo", "R-66Y"), Gender.NEUTRAL, "Robot", "CYBORG_ROBOT", 1, -16, 6, 0.88f, TimbreEqPreset.RADIO_CYBORG_COMMS)
        registerEntity("Ayla", listOf("Эйла", "Айла", "Ayla"), Gender.FEMALE, "Chief", "PIRATE", 2, 4, 14, 0.98f, TimbreEqPreset.STUDIO_CONDENSER)
        registerEntity("Magus", listOf("Магус", "Джанус", "Magus"), Gender.MALE, "Sorcerer", "HERO_DARK_VIGILANTE", 1, -18, -8, 0.86f, TimbreEqPreset.ETHEREAL_HALL_SPIRIT)
        registerEntity("Schala", listOf("Шала", "Schala"), Gender.FEMALE, "Princess", "ANGELIC_DIVINE", 1, 10, -6, 1.03f, TimbreEqPreset.ETHEREAL_HALL_SPIRIT)
        registerEntity("QueenZeal", listOf("Королева Зил", "Queen Zeal"), Gender.FEMALE, "Queen", "ROYAL_QUEEN", 2, -4, -4, 0.94f, TimbreEqPreset.ETHEREAL_HALL_SPIRIT)

        // === CASTLEVANIA DS TRILOGY ===
        registerEntity("Soma", listOf("Сома", "Сома Круз", "Soma Cruz"), Gender.MALE, "Hero", "PROTAGONIST_MALE", 0, 4, 4, 1.01f, TimbreEqPreset.CRISP_LEAD_TENOR)
        registerEntity("Alucard", listOf("Алукард", "Генъя Арикадо", "Арикадо", "Alucard", "Genya Arikado", "Arikado"), Gender.MALE, "Vampire", "HERO_DARK_VIGILANTE", 0, -18, -8, 0.87f, TimbreEqPreset.DARK_CHEST_BARITONE)
        registerEntity("Julius", listOf("Юлиус", "Юлиус Бельмонт", "Julius Belmont"), Gender.MALE, "Hunter", "KNIGHT_WARRIOR", 1, -14, -2, 0.89f, TimbreEqPreset.DARK_CHEST_BARITONE)
        registerEntity("Yoko", listOf("Йоко", "Йоко Бельнадес", "Yoko Belnades"), Gender.FEMALE, "Witch", "ROYAL_QUEEN", 0, 4, 2, 1.00f, TimbreEqPreset.VELVET_ROYAL_ALTO)
        registerEntity("Mina", listOf("Мина", "Мина Хакуба", "Mina Hakuba"), Gender.FEMALE, "Shrine Maiden", "YOUNG_GIRL", 1, 18, 4, 1.08f, TimbreEqPreset.BRIGHT_YOUTH_CRYSTAL)
        registerEntity("Jonathan", listOf("Джонатан", "Джонатан Моррис", "Jonathan Morris"), Gender.MALE, "Hero", "PROTAGONIST_MALE", 1, 8, 8, 1.04f, TimbreEqPreset.CRISP_LEAD_TENOR)
        registerEntity("Charlotte", listOf("Шарлотта", "Шарлотта Олин", "Charlotte Aulin"), Gender.FEMALE, "Mage", "TSUNDERE", 2, 18, 12, 1.09f, TimbreEqPreset.BRIGHT_YOUTH_CRYSTAL)
        registerEntity("Shanoa", listOf("Шаноа", "Shanoa"), Gender.FEMALE, "Heroine", "PROTAGONIST_FEMALE", 1, -2, -4, 0.97f, TimbreEqPreset.VELVET_ROYAL_ALTO)
        registerEntity("Albus", listOf("Альбус", "Albus"), Gender.MALE, "Rival", "GENTLEMAN_SCHOLAR", 2, -6, 4, 0.94f, TimbreEqPreset.CRISP_LEAD_TENOR)
        registerEntity("Barlowe", listOf("Барлоу", "Barlowe"), Gender.MALE, "Master", "WISE_ELDER", 0, -16, -8, 0.88f, TimbreEqPreset.VELVET_ROYAL_ALTO)
        registerEntity("Dracula", listOf("Дракула", "Граф Дракула", "Dracula", "Lord Dracula"), Gender.MALE, "Dark Lord", "DEEP_DEMON", 0, -34, -18, 0.79f, TimbreEqPreset.SUB_ABYSS_BOSS)
        registerEntity("Death", listOf("Смерть", "Жнец", "Grim Reaper", "Death"), Gender.MALE, "Demon", "DEEP_DEMON", 1, -38, -20, 0.78f, TimbreEqPreset.ETHEREAL_HALL_SPIRIT)

        // === POKÉMON PLATINUM / HGSS / BLACK & WHITE / BW2 ===
        registerEntity("Oak", listOf("Оук", "Профессор Оук", "Professor Oak"), Gender.MALE, "Professor", "WISE_ELDER", 0, -10, -8, 0.91f, TimbreEqPreset.VELVET_ROYAL_ALTO)
        registerEntity("Rowan", listOf("Роуэн", "Профессор Роуэн", "Professor Rowan"), Gender.MALE, "Professor", "WISE_ELDER", 1, -16, -10, 0.87f, TimbreEqPreset.DARK_CHEST_BARITONE)
        registerEntity("Elm", listOf("Элм", "Профессор Элм", "Professor Elm"), Gender.MALE, "Professor", "GENTLEMAN_SCHOLAR", 2, 6, 8, 1.03f, TimbreEqPreset.CRISP_LEAD_TENOR)
        registerEntity("Juniper", listOf("Джунипер", "Профессор Джунипер", "Professor Juniper"), Gender.FEMALE, "Professor", "ROYAL_QUEEN", 0, 4, 4, 1.01f, TimbreEqPreset.VELVET_ROYAL_ALTO)
        registerEntity("Cynthia", listOf("Синтия", "Cynthia"), Gender.FEMALE, "Champion", "ROYAL_QUEEN", 1, 2, -2, 0.98f, TimbreEqPreset.VELVET_ROYAL_ALTO)
        registerEntity("Cyrus", listOf("Сайрус", "Кир", "Cyrus"), Gender.MALE, "Villain", "HERO_DARK_VIGILANTE", 0, -18, -10, 0.87f, TimbreEqPreset.DARK_CHEST_BARITONE)
        registerEntity("NaturalN", listOf("Эн", "Натурал Хармония", "Natural Harmonia"), Gender.MALE, "King", "GENTLEMAN_SCHOLAR", 2, 10, 14, 1.05f, TimbreEqPreset.ETHEREAL_HALL_SPIRIT)
        registerEntity("Ghetsis", listOf("Гетсис", "Ghetsis"), Gender.MALE, "Villain", "VILLAIN_BOSS", 0, -26, -10, 0.82f, TimbreEqPreset.SUB_ABYSS_BOSS)
        registerEntity("Cheren", listOf("Черен", "Cheren"), Gender.MALE, "Rival", "GENTLEMAN_SCHOLAR", 1, 2, 2, 0.99f, TimbreEqPreset.CRISP_LEAD_TENOR)
        registerEntity("Bianca", listOf("Бьянка", "Bianca"), Gender.FEMALE, "Friend", "CHEERFUL_FAIRY", 2, 22, 12, 1.11f, TimbreEqPreset.BRIGHT_YOUTH_CRYSTAL)
        registerEntity("Giovanni", listOf("Джованни", "Giovanni"), Gender.MALE, "Boss", "VILLAIN_BOSS", 1, -24, -10, 0.84f, TimbreEqPreset.DARK_CHEST_BARITONE)
        registerEntity("Looker", listOf("Лукер", "Looker"), Gender.MALE, "Detective", "GENTLEMAN_SCHOLAR", 2, 6, 10, 1.02f, TimbreEqPreset.CRISP_LEAD_TENOR)
        registerEntity("Pokedex", listOf("Покедекс", "Pokédex", "Роттом", "Система", "Бортовой компьютер"), Gender.NEUTRAL, "AI", "CYBORG_ROBOT", 0, -14, 8, 0.90f, TimbreEqPreset.RADIO_CYBORG_COMMS)
        registerEntity("Giratina", listOf("Гиратина", "Giratina"), Gender.NEUTRAL, "Demon", "DEEP_DEMON", 0, -36, -20, 0.78f, TimbreEqPreset.SUB_ABYSS_BOSS)
        registerEntity("Darkrai", listOf("Даркрай", "Darkrai"), Gender.NEUTRAL, "Demon", "DEEP_DEMON", 1, -32, -18, 0.80f, TimbreEqPreset.ETHEREAL_HALL_SPIRIT)
        registerEntity("Mewtwo", listOf("Мьюту", "Mewtwo"), Gender.NEUTRAL, "Psychic", "DEEP_DEMON", 2, -24, -12, 0.84f, TimbreEqPreset.ETHEREAL_HALL_SPIRIT)
        registerEntity("Arceus", listOf("Аркеус", "Арцеус", "Arceus"), Gender.NEUTRAL, "God", "ANGELIC_DIVINE", 0, -14, -12, 0.90f, TimbreEqPreset.ETHEREAL_HALL_SPIRIT)

        // === FINAL FANTASY III / IV / XII RW / TACTICS A2 ===
        registerEntity("Cecil", listOf("Сесил", "Cecil"), Gender.MALE, "Paladin", "KNIGHT_WARRIOR", 0, -4, 0, 0.96f, TimbreEqPreset.VELVET_ROYAL_ALTO)
        registerEntity("Kain", listOf("Каин", "Кайн", "Kain"), Gender.MALE, "Dragoon", "HERO_DARK_VIGILANTE", 1, -16, -6, 0.88f, TimbreEqPreset.DARK_CHEST_BARITONE)
        registerEntity("Rosa", listOf("Роза", "Rosa"), Gender.FEMALE, "White Mage", "ROYAL_QUEEN", 0, 4, 0, 1.00f, TimbreEqPreset.VELVET_ROYAL_ALTO)
        registerEntity("Rydia", listOf("Ридия", "Rydia"), Gender.FEMALE, "Summoner", "YOUNG_GIRL", 1, 20, 6, 1.10f, TimbreEqPreset.BRIGHT_YOUTH_CRYSTAL)
        registerEntity("EdgeFF4", listOf("Эдж", "Принц Эдж", "Edge"), Gender.MALE, "Ninja", "PIRATE", 2, 6, 12, 1.03f, TimbreEqPreset.CRISP_LEAD_TENOR)
        registerEntity("Golbez", listOf("Голбез", "Golbez"), Gender.MALE, "Boss", "VILLAIN_BOSS", 0, -30, -14, 0.80f, TimbreEqPreset.SUB_ABYSS_BOSS)
        registerEntity("Cid", listOf("Сид", "Cid"), Gender.MALE, "Engineer", "MERCHANT", 1, -8, 12, 0.92f, TimbreEqPreset.DARK_CHEST_BARITONE)
        registerEntity("Balthier", listOf("Балтьер", "Балфир", "Balthier"), Gender.MALE, "Sky Pirate", "GENTLEMAN_SCHOLAR", 1, -6, 2, 0.94f, TimbreEqPreset.VELVET_ROYAL_ALTO)
        registerEntity("Fran", listOf("Фран", "Fran"), Gender.FEMALE, "Viera", "ROYAL_QUEEN", 2, -4, -6, 0.94f, TimbreEqPreset.VELVET_ROYAL_ALTO)

        // === DRAGON QUEST IV / V / VI / IX ===
        registerEntity("Alena", listOf("Алена", "Царевна Алена", "Alena"), Gender.FEMALE, "Princess", "PROTAGONIST_FEMALE", 0, 12, 10, 1.06f, TimbreEqPreset.CRISP_LEAD_TENOR)
        registerEntity("Torneko", listOf("Торнеко", "Torneko"), Gender.MALE, "Merchant", "MERCHANT", 2, 6, 12, 1.01f, TimbreEqPreset.STUDIO_CONDENSER)
        registerEntity("Psaro", listOf("Псаро", "Psaro"), Gender.MALE, "Villain", "HERO_DARK_VIGILANTE", 0, -18, -8, 0.87f, TimbreEqPreset.ETHEREAL_HALL_SPIRIT)
        registerEntity("StellaDQ", listOf("Стелла", "Фея Стелла", "Stella"), Gender.FEMALE, "Fairy", "CHEERFUL_FAIRY", 1, 34, 18, 1.18f, TimbreEqPreset.BRIGHT_YOUTH_CRYSTAL)

        // === KINGDOM HEARTS 358/2 DAYS & RE:CODED ===
        registerEntity("Roxas", listOf("Роксас", "Roxas"), Gender.MALE, "Hero", "PROTAGONIST_MALE", 0, 8, 4, 1.04f, TimbreEqPreset.CRISP_LEAD_TENOR)
        registerEntity("Axel", listOf("Аксель", "Axel"), Gender.MALE, "Friend", "PIRATE", 1, 2, 10, 0.99f, TimbreEqPreset.CRISP_LEAD_TENOR)
        registerEntity("Xion", listOf("Шион", "Ксион", "Xion"), Gender.FEMALE, "Heroine", "YOUNG_GIRL", 0, 16, 2, 1.08f, TimbreEqPreset.ETHEREAL_HALL_SPIRIT)
        registerEntity("Xemnas", listOf("Ксемнас", "Земнас", "Xemnas"), Gender.MALE, "Boss", "VILLAIN_BOSS", 0, -28, -16, 0.81f, TimbreEqPreset.ETHEREAL_HALL_SPIRIT)
        registerEntity("Saix", listOf("Сайкс", "Saïx", "Saix"), Gender.MALE, "Villain", "HERO_DARK_VIGILANTE", 1, -16, -8, 0.88f, TimbreEqPreset.DARK_CHEST_BARITONE)
        registerEntity("Riku", listOf("Рику", "Riku"), Gender.MALE, "Hero", "KNIGHT_WARRIOR", 2, -4, 0, 0.96f, TimbreEqPreset.DARK_CHEST_BARITONE)
        registerEntity("Sora", listOf("Сора", "Sora"), Gender.MALE, "Hero", "PROTAGONIST_MALE", 1, 10, 8, 1.06f, TimbreEqPreset.CRISP_LEAD_TENOR)

        // === RADIANT HISTORIA ===
        registerEntity("Stocke", listOf("Сток", "Stocke"), Gender.MALE, "Agent", "KNIGHT_WARRIOR", 0, -8, -2, 0.93f, TimbreEqPreset.DARK_CHEST_BARITONE)
        registerEntity("Raynie", listOf("Рейни", "Raynie"), Gender.FEMALE, "Mercenary", "PROTAGONIST_FEMALE", 0, 6, 6, 1.02f, TimbreEqPreset.STUDIO_CONDENSER)
        registerEntity("Marco", listOf("Марко", "Marco"), Gender.MALE, "Companion", "YOUNG_BOY", 2, 16, 8, 1.09f, TimbreEqPreset.BRIGHT_YOUTH_CRYSTAL)
        registerEntity("Rosch", listOf("Рош", "Rosch"), Gender.MALE, "Commander", "SOLDIER", 1, -16, -2, 0.87f, TimbreEqPreset.DARK_CHEST_BARITONE)
        registerEntity("Eruca", listOf("Эрука", "Принцесса Эрука", "Eruca"), Gender.FEMALE, "Princess", "ROYAL_QUEEN", 1, 8, -2, 1.03f, TimbreEqPreset.VELVET_ROYAL_ALTO)
        registerEntity("Heiss", listOf("Хейсс", "Heiss"), Gender.MALE, "Director", "WISE_ELDER", 2, -14, -8, 0.89f, TimbreEqPreset.VELVET_ROYAL_ALTO)

        // === MARIO, ZELDA, SONIC, METROID, KIRBY, STAR FOX ===
        registerEntity("Mario", listOf("Марио", "Mario"), Gender.MALE, "Hero", "PROTAGONIST_MALE", 0, 8, 6, 1.04f, TimbreEqPreset.CRISP_LEAD_TENOR)
        registerEntity("Luigi", listOf("Луиджи", "Luigi"), Gender.MALE, "Hero", "PROTAGONIST_MALE", 1, 14, 8, 1.07f, TimbreEqPreset.CRISP_LEAD_TENOR)
        registerEntity("Peach", listOf("Пич", "Принцесса Пич", "Princess Peach"), Gender.FEMALE, "Princess", "ROYAL_QUEEN", 0, 14, 2, 1.07f, TimbreEqPreset.BRIGHT_YOUTH_CRYSTAL)
        registerEntity("Bowser", listOf("Боузер", "Баузер", "Купа", "King Bowser"), Gender.MALE, "Boss", "VILLAIN_BOSS", 0, -28, -12, 0.80f, TimbreEqPreset.SUB_ABYSS_BOSS)
        registerEntity("Fawful", listOf("Фофул", "Fawful"), Gender.MALE, "Villain", "VILLAIN_MANIC", 2, 30, 24, 1.16f, TimbreEqPreset.BRIGHT_YOUTH_CRYSTAL)
        registerEntity("Starlow", listOf("Старлоу", "Starlow"), Gender.FEMALE, "Sprite", "CHEERFUL_FAIRY", 1, 36, 18, 1.18f, TimbreEqPreset.BRIGHT_YOUTH_CRYSTAL)
        registerEntity("Wario", listOf("Варио", "Wario"), Gender.MALE, "Comedy", "COMEDY_GOOFY", 1, -14, 14, 0.88f, TimbreEqPreset.DARK_CHEST_BARITONE)
        registerEntity("Waluigi", listOf("Валуиджи", "Waluigi"), Gender.MALE, "Comedy", "COMEDY_GOOFY", 2, 28, 22, 1.14f, TimbreEqPreset.CRISP_LEAD_TENOR)
        registerEntity("Link", listOf("Линк", "Link"), Gender.MALE, "Hero", "PROTAGONIST_MALE", 0, 6, 4, 1.03f, TimbreEqPreset.CRISP_LEAD_TENOR)
        registerEntity("Zelda", listOf("Зельда", "Принцесса Зельда", "Princess Zelda"), Gender.FEMALE, "Princess", "ROYAL_QUEEN", 1, 6, -2, 1.02f, TimbreEqPreset.VELVET_ROYAL_ALTO)
        registerEntity("Tetra", listOf("Тетра", "Tetra"), Gender.FEMALE, "Pirate", "PIRATE", 0, 12, 12, 1.06f, TimbreEqPreset.CRISP_LEAD_TENOR)
        registerEntity("Linebeck", listOf("Лайнбек", "Капитан Лайнбек", "Linebeck"), Gender.MALE, "Pirate", "PIRATE", 2, -4, 12, 0.96f, TimbreEqPreset.DARK_CHEST_BARITONE)
        registerEntity("Ciela", listOf("Сиела", "Ciela"), Gender.FEMALE, "Fairy", "CHEERFUL_FAIRY", 2, 34, 16, 1.17f, TimbreEqPreset.BRIGHT_YOUTH_CRYSTAL)
        registerEntity("Ganondorf", listOf("Ганондорф", "Ганон", "Ganon"), Gender.MALE, "Boss", "VILLAIN_BOSS", 0, -30, -14, 0.80f, TimbreEqPreset.SUB_ABYSS_BOSS)
        registerEntity("Sonic", listOf("Соник", "Sonic", "Sonic the Hedgehog"), Gender.MALE, "Hero", "PROTAGONIST_MALE", 2, 12, 16, 1.07f, TimbreEqPreset.CRISP_LEAD_TENOR)
        registerEntity("Tails", listOf("Тейлз", "Тейлс", "Miles Tails Prower"), Gender.MALE, "Companion", "YOUNG_BOY", 1, 28, 14, 1.16f, TimbreEqPreset.BRIGHT_YOUTH_CRYSTAL)
        registerEntity("Eggman", listOf("Эггман", "Роботник", "Доктор Эггман", "Dr. Eggman"), Gender.MALE, "Boss", "VILLAIN_BOSS", 1, -18, 6, 0.86f, TimbreEqPreset.DARK_CHEST_BARITONE)
        registerEntity("Samus", listOf("Самус", "Самус Аран", "Samus Aran"), Gender.FEMALE, "Heroine", "PROTAGONIST_FEMALE", 0, -2, 0, 0.97f, TimbreEqPreset.VELVET_ROYAL_ALTO)

        // === GTA: CHINATOWN WARS ===
        registerEntity("HuangLee", listOf("Хуанг", "Хуанг Ли", "Huang", "Huang Lee"), Gender.MALE, "Protagonist", "PIRATE", 0, 2, 8, 1.00f, TimbreEqPreset.CRISP_LEAD_TENOR)
        registerEntity("WadeHeston", listOf("Хестон", "Уэйд Хестон", "Heston", "Wade Heston"), Gender.MALE, "Detective", "SOLDIER", 1, -12, 4, 0.90f, TimbreEqPreset.DARK_CHEST_BARITONE)
        registerEntity("KennyLee", listOf("Дядя Кенни", "Ву Ли", "Кенни", "Uncle Kenny", "Kenny"), Gender.MALE, "Boss", "WISE_ELDER", 2, -14, -4, 0.89f, TimbreEqPreset.VELVET_ROYAL_ALTO)
        registerEntity("ChanJaoming", listOf("Чан", "Чан Джаомин", "Chan", "Chan Jaoming"), Gender.MALE, "Gangster", "COMEDY_GOOFY", 2, 14, 16, 1.07f, TimbreEqPreset.CRISP_LEAD_TENOR)
        registerEntity("ZhouMing", listOf("Чжоу", "Чжоу Мин", "Zhou", "Zhou Ming"), Gender.MALE, "Boss", "VILLAIN_BOSS", 0, -22, -6, 0.84f, TimbreEqPreset.DARK_CHEST_BARITONE)
        registerEntity("LingShan", listOf("Линг", "Линг Шань", "Ling", "Ling Shan"), Gender.FEMALE, "Enforcer", "PROTAGONIST_FEMALE", 1, 2, 6, 0.99f, TimbreEqPreset.STUDIO_CONDENSER)
    }

    private fun preloadUniversalGlossary() {
        glossary["batarang"] = "бэтаранг"
        glossary["batcave"] = "бэтпещера"
        glossary["batmobile"] = "бэтмобиль"
        glossary["pokeball"] = "покебол"
        glossary["pokédex"] = "покедекс"
        glossary["potion"] = "зелье"
        glossary["badge"] = "значок"
        glossary["gym leader"] = "лидер гима"
        glossary["court record"] = "материалы дела"
        glossary["attorney's badge"] = "значок адвоката"
        glossary["cross-examination"] = "перекрёстный допрос"
        glossary["evidence"] = "улика"
        glossary["autopsy report"] = "отчёт о вскрытии"
        glossary["objection"] = "протестую"
        glossary["hold it"] = "постойте"
        glossary["take that"] = "получайте"
        glossary["picarats"] = "пикараты"
        glossary["hint coin"] = "монета-подсказка"
    }

    fun registerEntity(
        name: String,
        aliases: List<String>,
        gender: Gender,
        role: String,
        defaultPersona: String,
        preferredActorIndex: Int = -1,
        customPitchOffsetHz: Int? = null,
        customRateOffsetPercent: Int? = null,
        customTimbreMultiplier: Float? = null,
        customEqPreset: Int? = null
    ) {
        val entity = CharacterEntity(
            name = name,
            aliases = aliases,
            gender = gender,
            role = role,
            defaultPersona = defaultPersona,
            preferredActorIndex = preferredActorIndex,
            customPitchOffsetHz = customPitchOffsetHz,
            customRateOffsetPercent = customRateOffsetPercent,
            customTimbreMultiplier = customTimbreMultiplier,
            customEqPreset = customEqPreset
        )
        entities[name.lowercase()] = entity
        aliases.forEach { alias ->
            entities[alias.lowercase()] = entity
        }
    }

    /**
     * Activates per-game voice cast storage and loads saved character voices from disk.
     */
    @Synchronized
    fun setActiveGame(context: Context, gameKey: String) {
        val normalizedKey = gameKey.ifBlank { "global" }.replace(Regex("[^a-zA-Z0-9_]"), "_").take(32)
        currentGameKey = normalizedKey
        speakerProfileCache.clear()
        speakerPersonaCache.clear()
        loadCastFile(getCastFiles(context, "global").firstOrNull { it.exists() })
        if (normalizedKey != "global") {
            loadCastFile(getCastFiles(context, normalizedKey).firstOrNull { it.exists() })
        }
        Log.i(TAG, "Loaded ${speakerProfileCache.size} persistent character voice profiles for game [$normalizedKey]")
    }

    private fun getCastFiles(context: Context, gameKey: String): List<File> {
        val fileName = "voice_cast_${gameKey}.json"
        val files = mutableListOf<File>()
        try {
            @Suppress("DEPRECATION")
            val stormSettingsDir = File(Environment.getExternalStorageDirectory(), "STORM DS/settings")
            files.add(File(stormSettingsDir, fileName))
        } catch (_: Throwable) {}
        files.add(File(File(context.filesDir, "voice_cast"), fileName))
        return files
    }

    private fun loadCastFile(file: File?) {
        if (file == null || !file.exists()) return
        try {
            val content = file.readText(Charsets.UTF_8)
            val arr = JSONArray(content)
            for (i in 0 until arr.length()) {
                val obj = arr.optJSONObject(i) ?: continue
                val profile = SpeakerVoiceProfile.fromJson(obj) ?: continue
                speakerProfileCache[profile.speakerKey] = profile
                speakerPersonaCache[profile.speakerKey] = profile.persona
            }
        } catch (e: Throwable) {
            Log.w(TAG, "Failed to read voice cast file ${file.absolutePath}: ${e.message}")
        }
    }

    @Synchronized
    private fun saveCurrentGameCast(context: Context) {
        val profiles = speakerProfileCache.values.toList()
        if (profiles.isEmpty()) return
        val arr = JSONArray()
        profiles.forEach { arr.put(it.toJson()) }
        val jsonStr = arr.toString(2)

        for (target in getCastFiles(context, currentGameKey)) {
            try {
                target.parentFile?.mkdirs()
                target.writeText(jsonStr, Charsets.UTF_8)
            } catch (_: Throwable) {}
        }
        if (currentGameKey != "global") {
            for (globalTarget in getCastFiles(context, "global")) {
                try {
                    globalTarget.parentFile?.mkdirs()
                    globalTarget.writeText(jsonStr, Charsets.UTF_8)
                } catch (_: Throwable) {}
            }
        }
    }

    fun findEntity(text: String): CharacterEntity? {
        val clean = text.trim().lowercase()
        if (clean.isBlank()) return null

        // 1. Exact match on speaker name or alias
        entities[clean]?.let { return it }

        // 2. Word-boundary match for longer strings
        var bestMatch: CharacterEntity? = null
        var bestKeyLen = 0
        for ((key, entity) in entities) {
            if (key.length < 3 || key.length <= bestKeyLen) continue
            if (clean == key || clean.contains(key)) {
                val idx = clean.indexOf(key)
                val validStart = idx == 0 || !clean[idx - 1].isLetterOrDigit()
                val endIdx = idx + key.length
                val validEnd = endIdx >= clean.length || !clean[endIdx].isLetterOrDigit()
                if (validStart && validEnd) {
                    bestMatch = entity
                    bestKeyLen = key.length
                }
            }
        }
        return bestMatch
    }

    fun recordSpeaker(entity: CharacterEntity) {
        lastActiveSpeaker = entity
        previousSpeakerWasMale = entity.gender != Gender.FEMALE
    }

    /**
     * Infers speaker gender from character database, honorifics/titles, Russian/English name morphology,
     * and first-person grammatical verb/adjective endings in the spoken dialogue.
     */
    fun inferGender(speakerName: String, dialogueText: String, fallbackPersona: String): Gender {
        val entity = findEntity(speakerName) ?: findEntity(dialogueText)
        if (entity != null && entity.gender != Gender.NEUTRAL) {
            return entity.gender
        }

        // Check self-referential grammar in the dialogue line ("я пришла" vs "я пришёл")
        if (FEMALE_SELF_GRAMMAR.containsMatchIn(dialogueText)) return Gender.FEMALE
        if (MALE_SELF_GRAMMAR.containsMatchIn(dialogueText)) return Gender.MALE

        val cleanName = speakerName.trim().lowercase()
            .replace(Regex("[^\\p{L}\\s-]"), "")
            .trim()

        if (cleanName.isNotEmpty()) {
            val words = cleanName.split(Regex("\\s+"))
            if (words.any { it in FEMALE_TITLES_AND_ROLES }) return Gender.FEMALE
            if (words.any { it in MALE_TITLES_AND_ROLES }) return Gender.MALE
            if (cleanName.endsWith("-тян") || cleanName.endsWith("chan")) return Gender.FEMALE
            if (cleanName.endsWith("-кун") || cleanName.endsWith("kun")) return Gender.MALE

            val firstWord = words.first()
            // Male exceptions ending in -а/-я in Russian/Japanese
            val maleAExceptions = setOf(
                "лука", "никита", "илья", "фома", "кузьма", "савва", "добрыня", "сома", "сора",
                "кота", "кента", "рёта", "акира", "казуя", "такуя", "джошуа", "миллига"
            )
            if (firstWord in maleAExceptions) return Gender.MALE

            if (firstWord.endsWith("а") || firstWord.endsWith("я") || firstWord.endsWith("ия") ||
                firstWord.endsWith("на") || firstWord.endsWith("ка") || firstWord.endsWith("ша") ||
                firstWord.endsWith("ла") || firstWord.endsWith("ра")
            ) {
                return Gender.FEMALE
            }
        }

        return when (fallbackPersona) {
            "PROTAGONIST_FEMALE", "YOUNG_GIRL", "ROYAL_QUEEN", "TSUNDERE", "CHEERFUL_FAIRY", "ANGELIC_DIVINE" -> Gender.FEMALE
            "CYBORG_ROBOT" -> Gender.NEUTRAL
            else -> Gender.MALE
        }
    }

    /**
     * Resolves or deterministically creates and persists a complete studio voice profile
     * (persona, neural voice actor, pitch offset, rate offset, formant timbre multiplier, and EQ preset)
     * for any speaker in the game.
     */
    @Synchronized
    fun resolveSpeakerVoiceProfile(
        context: Context?,
        speakerName: String,
        dialogueText: String,
        fallbackPersona: String
    ): SpeakerVoiceProfile {
        val rawSpeaker = speakerName.trim()
        val canonicalKey = normalizeSpeakerKey(rawSpeaker)

        // 1. Named speaker: check persistent cache first!
        if (canonicalKey.isNotBlank()) {
            speakerProfileCache[canonicalKey]?.let { existing ->
                lastActiveProfile = existing
                previousSpeakerWasMale = existing.gender != Gender.FEMALE
                return existing
            }

            // Create deterministic studio profile for this named character
            val entity = findEntity(rawSpeaker)
            val gender = inferGender(rawSpeaker, dialogueText, entity?.defaultPersona ?: fallbackPersona)
            val assignedPersona = entity?.defaultPersona ?: refinePersonaByGenderAndRole(rawSpeaker, gender, fallbackPersona)
            val profile = createDeterministicProfile(
                speakerKey = canonicalKey,
                displayName = rawSpeaker,
                gender = gender,
                persona = assignedPersona,
                entity = entity
            )
            speakerProfileCache[canonicalKey] = profile
            speakerPersonaCache[canonicalKey] = profile.persona
            lastActiveProfile = profile
            previousSpeakerWasMale = profile.gender != Gender.FEMALE
            if (context != null) {
                saveCurrentGameCast(context)
            }
            Log.i(
                TAG,
                "Registered persistent studio voice for [$rawSpeaker]: persona=${profile.persona}, actor=${profile.voiceActorIndex}, " +
                        "pitch=${profile.pitchHzOffset}Hz, rate=${profile.ratePercentOffset}%, formant=${profile.timbrePitchMultiplier}, eq=${profile.eqPreset}"
            )
            return profile
        }

        // 2. Unnamed line: check if a known character is mentioned or implied
        val entityInText = findEntity(dialogueText)
        if (entityInText != null) {
            val entityKey = normalizeSpeakerKey(entityInText.name)
            val existing = speakerProfileCache[entityKey] ?: createDeterministicProfile(
                speakerKey = entityKey,
                displayName = entityInText.name,
                gender = entityInText.gender,
                persona = entityInText.defaultPersona,
                entity = entityInText
            ).also {
                speakerProfileCache[entityKey] = it
                if (context != null) saveCurrentGameCast(context)
            }
            recordSpeaker(entityInText)
            lastActiveProfile = existing
            return existing
        }

        // 3. Check grammatical self-reference ("я пришла" vs "я пришёл") or alternating dialogue turn
        val grammarGender = when {
            FEMALE_SELF_GRAMMAR.containsMatchIn(dialogueText) -> Gender.FEMALE
            MALE_SELF_GRAMMAR.containsMatchIn(dialogueText) -> Gender.MALE
            else -> null
        }

        val effectivePersona = when {
            grammarGender == Gender.FEMALE -> if (fallbackPersona in setOf("YOUNG_GIRL", "ROYAL_QUEEN", "TSUNDERE", "CHEERFUL_FAIRY")) fallbackPersona else "PROTAGONIST_FEMALE"
            grammarGender == Gender.MALE -> if (fallbackPersona != "NARRATOR" && fallbackPersona != "PROTAGONIST_FEMALE") fallbackPersona else "PROTAGONIST_MALE"
            else -> getNextTurnPersona(dialogueText, fallbackPersona)
        }

        val effectiveGender = grammarGender ?: inferGender("", dialogueText, effectivePersona)
        val syntheticKey = "anon_${effectivePersona.lowercase()}_${if (effectiveGender == Gender.FEMALE) "f" else "m"}"
        return createDeterministicProfile(
            speakerKey = syntheticKey,
            displayName = effectivePersona,
            gender = effectiveGender,
            persona = effectivePersona,
            entity = null
        ).also {
            lastActiveProfile = it
        }
    }

    private fun normalizeSpeakerKey(name: String): String {
        return name.trim().lowercase()
            .replace(Regex("^[\\[(«\"'【]+|[\\])»\"'】:\\-—]+$"), "")
            .replace(Regex("\\s+"), " ")
            .trim()
    }

    private fun refinePersonaByGenderAndRole(speakerName: String, gender: Gender, fallbackPersona: String): String {
        val lower = speakerName.lowercase()
        if (fallbackPersona != "NARRATOR" && fallbackPersona != "PROTAGONIST_MALE" && fallbackPersona != "PROTAGONIST_FEMALE") {
            return fallbackPersona
        }
        return when {
            lower.contains("детектив") || lower.contains("инспектор") || lower.contains("профессор") || lower.contains("доктор") ->
                if (gender == Gender.FEMALE) "ROYAL_QUEEN" else "GENTLEMAN_SCHOLAR"
            lower.contains("капитан") || lower.contains("сержант") || lower.contains("офицер") || lower.contains("страж") || lower.contains("солдат") ->
                "SOLDIER"
            lower.contains("король") || lower.contains("босс") || lower.contains("генерал") || lower.contains("лорд") ->
                "VILLAIN_BOSS"
            lower.contains("королева") || lower.contains("принцесса") || lower.contains("леди") || lower.contains("госпожа") ->
                "ROYAL_QUEEN"
            lower.contains("дед") || lower.contains("старик") || lower.contains("старейшина") || lower.contains("мудрец") ->
                "WISE_ELDER"
            lower.contains("мальчик") || lower.contains("парен") || lower.contains("малыш") ->
                "YOUNG_BOY"
            lower.contains("девочка") || lower.contains("малышка") || lower.contains("сестр") ->
                "YOUNG_GIRL"
            lower.contains("торговец") || lower.contains("продавец") || lower.contains("трактирщик") ->
                "MERCHANT"
            lower.contains("робот") || lower.contains("система") || lower.contains("терминал") ->
                "CYBORG_ROBOT"
            gender == Gender.FEMALE -> "PROTAGONIST_FEMALE"
            else -> "PROTAGONIST_MALE"
        }
    }

    private fun createDeterministicProfile(
        speakerKey: String,
        displayName: String,
        gender: Gender,
        persona: String,
        entity: CharacterEntity?
    ): SpeakerVoiceProfile {
        val hash = stableHash(speakerKey)
        val actorIdx = if (entity != null && entity.preferredActorIndex >= 0) {
            entity.preferredActorIndex
        } else {
            abs(hash) % 3
        }

        // Base acoustic coordinates by persona
        val (basePitchHz, baseRatePct, baseFormant, defaultEq) = when (persona) {
            "HERO_DARK_VIGILANTE" -> Quad(-18, -8, 0.87f, TimbreEqPreset.DARK_CHEST_BARITONE)
            "VILLAIN_BOSS" -> Quad(-28, -12, 0.81f, TimbreEqPreset.SUB_ABYSS_BOSS)
            "VILLAIN_MANIC" -> Quad(22, 20, 1.12f, TimbreEqPreset.CRISP_LEAD_TENOR)
            "DEEP_DEMON" -> Quad(-36, -18, 0.78f, TimbreEqPreset.SUB_ABYSS_BOSS)
            "WISE_ELDER" -> Quad(-14, -10, 0.89f, TimbreEqPreset.VELVET_ROYAL_ALTO)
            "YOUNG_BOY" -> Quad(24, 12, 1.15f, TimbreEqPreset.BRIGHT_YOUTH_CRYSTAL)
            "YOUNG_GIRL" -> Quad(26, 10, 1.14f, TimbreEqPreset.BRIGHT_YOUTH_CRYSTAL)
            "ROYAL_QUEEN" -> Quad(2, -2, 0.97f, TimbreEqPreset.VELVET_ROYAL_ALTO)
            "MERCHANT" -> Quad(8, 14, 1.03f, TimbreEqPreset.STUDIO_CONDENSER)
            "SOLDIER" -> Quad(-10, 4, 0.91f, TimbreEqPreset.DARK_CHEST_BARITONE)
            "CYBORG_ROBOT" -> Quad(-16, 6, 0.89f, TimbreEqPreset.RADIO_CYBORG_COMMS)
            "TSUNDERE" -> Quad(16, 14, 1.07f, TimbreEqPreset.CRISP_LEAD_TENOR)
            "WHISPER_MYSTERIOUS" -> Quad(-6, -16, 0.94f, TimbreEqPreset.ETHEREAL_HALL_SPIRIT)
            "CHEERFUL_FAIRY" -> Quad(34, 18, 1.18f, TimbreEqPreset.BRIGHT_YOUTH_CRYSTAL)
            "PIRATE" -> Quad(-4, 12, 0.96f, TimbreEqPreset.DARK_CHEST_BARITONE)
            "MAD_SCIENTIST" -> Quad(20, 18, 1.09f, TimbreEqPreset.CRISP_LEAD_TENOR)
            "GENTLEMAN_SCHOLAR" -> Quad(-6, -4, 0.94f, TimbreEqPreset.VELVET_ROYAL_ALTO)
            "GHOST_ETHEREAL" -> Quad(10, -20, 1.05f, TimbreEqPreset.ETHEREAL_HALL_SPIRIT)
            "KNIGHT_WARRIOR" -> Quad(-12, -2, 0.91f, TimbreEqPreset.DARK_CHEST_BARITONE)
            "COMEDY_GOOFY" -> Quad(24, 20, 1.13f, TimbreEqPreset.BRIGHT_YOUTH_CRYSTAL)
            "ANGELIC_DIVINE" -> Quad(12, -6, 1.04f, TimbreEqPreset.ETHEREAL_HALL_SPIRIT)
            "PROTAGONIST_FEMALE" -> Quad(8, 4, 1.03f, TimbreEqPreset.STUDIO_CONDENSER)
            "NARRATOR" -> Quad(0, 0, 1.00f, TimbreEqPreset.STUDIO_CONDENSER)
            else -> Quad(4, 4, 1.01f, TimbreEqPreset.CRISP_LEAD_TENOR)
        }

        // Deterministic per-character micro-variation so no two NPCs sound identical
        val pitchDelta = ((abs(hash shr 3) % 19) - 9) // -9..+9 Hz
        val rateDelta = ((abs(hash shr 7) % 13) - 6)  // -6..+6 %
        val formantDelta = (((abs(hash shr 11) % 13) - 6) * 0.01f) // -0.06f..+0.06f

        var finalPitchHz = (entity?.customPitchOffsetHz ?: (basePitchHz + pitchDelta)).coerceIn(-44, 44)
        val finalRatePct = (entity?.customRateOffsetPercent ?: (baseRatePct + rateDelta)).coerceIn(-22, 28)
        var finalFormant = (entity?.customTimbreMultiplier ?: (baseFormant + formantDelta)).coerceIn(0.78f, 1.24f)
        val finalEq = entity?.customEqPreset ?: defaultEq

        // Anti-collision timbre separation against the previous speaker in the scene
        val prev = lastActiveProfile
        if (prev != null && prev.speakerKey != speakerKey && prev.gender == gender) {
            if (abs(finalPitchHz - prev.pitchHzOffset) < 7) {
                finalPitchHz = if (finalPitchHz >= prev.pitchHzOffset) {
                    (prev.pitchHzOffset + 10).coerceAtMost(42)
                } else {
                    (prev.pitchHzOffset - 10).coerceAtLeast(-42)
                }
            }
            if (abs(finalFormant - prev.timbrePitchMultiplier) < 0.04f) {
                finalFormant = if (finalFormant >= prev.timbrePitchMultiplier) {
                    (prev.timbrePitchMultiplier + 0.06f).coerceAtMost(1.22f)
                } else {
                    (prev.timbrePitchMultiplier - 0.06f).coerceAtLeast(0.80f)
                }
            }
        }

        return SpeakerVoiceProfile(
            speakerKey = speakerKey,
            displayName = displayName,
            gender = gender,
            persona = persona,
            voiceActorIndex = actorIdx,
            pitchHzOffset = finalPitchHz,
            ratePercentOffset = finalRatePct,
            timbrePitchMultiplier = finalFormant,
            eqPreset = finalEq
        )
    }

    private data class Quad(val a: Int, val b: Int, val c: Float, val d: Int)

    private fun stableHash(input: String): Int {
        var h = 0x811c9dc5.toInt()
        for (ch in input) {
            h = h xor ch.code
            h *= 0x01000193
        }
        return h
    }

    /**
     * Retrieves or assigns a consistent persona for a given speaker tag/name.
     */
    fun getOrAssignSpeakerPersona(speakerName: String, fallbackPersona: String): String {
        val profile = resolveSpeakerVoiceProfile(null, speakerName, "", fallbackPersona)
        return profile.persona
    }

    fun getNextTurnPersona(text: String, detectedDirectly: String?): String {
        val entity = findEntity(text)
        if (entity != null) {
            recordSpeaker(entity)
            return entity.defaultPersona
        }

        if (FEMALE_SELF_GRAMMAR.containsMatchIn(text)) {
            previousSpeakerWasMale = false
            return "PROTAGONIST_FEMALE"
        }
        if (MALE_SELF_GRAMMAR.containsMatchIn(text)) {
            previousSpeakerWasMale = true
            return "PROTAGONIST_MALE"
        }

        if (detectedDirectly != null && detectedDirectly != "NARRATOR" && detectedDirectly != "NARRATOR_CHRONICLE") {
            lastActiveSpeaker = null
            return detectedDirectly
        }

        // Alternating dialogue heuristic
        if (text.startsWith("—") || text.startsWith("-") || text.startsWith("\"") || text.startsWith("«")) {
            previousSpeakerWasMale = !previousSpeakerWasMale
            return if (previousSpeakerWasMale) "PROTAGONIST_MALE" else "PROTAGONIST_FEMALE"
        }

        val persona = lastActiveSpeaker?.defaultPersona ?: "NARRATOR"
        lastActiveSpeaker = null
        return persona
    }

    private const val MAX_DIALOGUE_HISTORY = 6
    private val dialogueHistory = ArrayDeque<String>()

    fun recordDialogueTurn(originalText: String, translatedText: String) {
        val cleanOrig = originalText.replace('\n', ' ').trim()
        val cleanTrans = translatedText.replace('\n', ' ').trim()
        if (cleanOrig.isBlank() || cleanTrans.isBlank()) return

        val entity = findEntity(cleanOrig) ?: findEntity(cleanTrans)
        if (entity != null) {
            recordSpeaker(entity)
        }

        val entry = "$cleanOrig => $cleanTrans"
        synchronized(dialogueHistory) {
            if (dialogueHistory.lastOrNull() != entry) {
                if (dialogueHistory.size >= MAX_DIALOGUE_HISTORY) {
                    dialogueHistory.removeFirst()
                }
                dialogueHistory.addLast(entry)
            }
        }
    }

    fun buildTranslationContextPrompt(): List<String> {
        val list = mutableListOf<String>()
        val spk = lastActiveSpeaker
        val speakerName = spk?.name?.ifBlank { null } ?: activeSpeakerName
        val gender = if (activeSpeakerGender != me.magnum.melonds.translator.grammar.Gender.NEUTRAL) {
            activeSpeakerGender.name
        } else {
            spk?.gender?.name ?: "NEUTRAL"
        }

        if (speakerName.isNotBlank()) {
            list.add("Active speaker: $speakerName (gender: $gender)")
            if (gender == "FEMALE") {
                list.add("Localization rule: Active speaker is FEMALE. Translate first-person past tense verbs in Russian with female endings (e.g., 'я сказала', 'я поняла', 'я готова'). Do not use bracketed forms like 'понял(а)'.")
            } else if (gender == "MALE") {
                list.add("Localization rule: Active speaker is MALE. Translate first-person past tense verbs in Russian with male endings (e.g., 'я сказал', 'я понял', 'я готов').")
            }
        }
        synchronized(dialogueHistory) {
            list.addAll(dialogueHistory.takeLast(4))
        }
        return list
    }

    fun clearDialogueHistory() {
        synchronized(dialogueHistory) {
            dialogueHistory.clear()
        }
        lastActiveSpeaker = null
        lastActiveProfile = null
    }

    fun sanitizeTranslation(translatedText: String, targetLang: String = "ru"): String {
        var result = translatedText
        if (targetLang.lowercase().startsWith("ru")) {
            glossary.forEach { (en, ru) ->
                result = result.replace(Regex("(?i)\\b${Regex.escape(en)}\\b"), ru)
            }
        }
        return result
    }
}

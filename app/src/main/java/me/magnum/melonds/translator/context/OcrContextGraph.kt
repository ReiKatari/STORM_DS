package me.magnum.melonds.translator.context

import android.util.Log

/**
 * Story & Character Context Graph for Game OCR, Dialogue Speaker Tracking and Voice Persona Assignment.
 * Preserves character entities, gender consistency, honorifics, and terminology across Nintendo DS RPGs,
 * adventures, visual novels, and action titles.
 */
object OcrContextGraph {
    private const val TAG = "OcrContextGraph"

    data class CharacterEntity(
        val name: String,
        val aliases: List<String>,
        val gender: Gender,
        val role: String,
        val defaultPersona: String
    )

    enum class Gender {
        MALE, FEMALE, NEUTRAL
    }

    private val entities = mutableMapOf<String, CharacterEntity>()
    private val glossary = mutableMapOf<String, String>()
    
    // Per-speaker persistent persona memory across dialogue turns
    private val speakerPersonaCache = mutableMapOf<String, String>()
    private var lastActiveSpeaker: CharacterEntity? = null
    private var previousSpeakerWasMale = true

    init {
        // Preload universal Nintendo DS iconic character entities mapped to 20+ Personas
        registerEntity("Batman", listOf("Бэтмен", "Бэтмэн", "Брюс", "Bruce", "Wayne", "Dark Knight"), Gender.MALE, "Hero", "HERO_DARK_VIGILANTE")
        registerEntity("Snake", listOf("Снейк", "Солид Снейк", "Solid Snake", "Big Boss"), Gender.MALE, "Hero", "HERO_DARK_VIGILANTE")
        registerEntity("Kratos", listOf("Кратос"), Gender.MALE, "Hero", "HERO_DARK_VIGILANTE")
        registerEntity("Wesker", listOf("Вескер"), Gender.MALE, "Villain", "HERO_DARK_VIGILANTE")

        registerEntity("Joker", listOf("Джокер", "Клоун", "Clown Prince", "Joker:"), Gender.MALE, "Villain", "VILLAIN_MANIC")
        registerEntity("Fawful", listOf("Фофул"), Gender.MALE, "Villain", "VILLAIN_MANIC")
        registerEntity("Kefka", listOf("Кефка"), Gender.MALE, "Villain", "VILLAIN_MANIC")
        registerEntity("Dimentio", listOf("Диментио"), Gender.MALE, "Villain", "VILLAIN_MANIC")

        registerEntity("Bowser", listOf("Боузер", "Баузер", "Купа", "King Bowser"), Gender.MALE, "Boss", "VILLAIN_BOSS")
        registerEntity("Ganondorf", listOf("Ганондорф", "Ганон", "Ganon"), Gender.MALE, "Boss", "VILLAIN_BOSS")
        registerEntity("Giovanni", listOf("Джованни"), Gender.MALE, "Boss", "VILLAIN_BOSS")
        registerEntity("Dedede", listOf("Дидиди", "Дедеде", "King Dedede"), Gender.MALE, "Boss", "VILLAIN_BOSS")
        registerEntity("Eggman", listOf("Эггман", "Роботник", "Dr. Eggman"), Gender.MALE, "Boss", "VILLAIN_BOSS")

        registerEntity("Death", listOf("Смерть", "Grim Reaper"), Gender.MALE, "Demon", "DEEP_DEMON")
        registerEntity("Dracula", listOf("Дракула"), Gender.MALE, "Demon", "DEEP_DEMON")
        registerEntity("Giratina", listOf("Гиратина"), Gender.NEUTRAL, "Demon", "DEEP_DEMON")
        registerEntity("Darkrai", listOf("Даркрай"), Gender.NEUTRAL, "Demon", "DEEP_DEMON")
        registerEntity("Mewtwo", listOf("Мьюту"), Gender.NEUTRAL, "Demon", "DEEP_DEMON")

        registerEntity("Oak", listOf("Оук", "Профессор Оук", "Professor Oak"), Gender.MALE, "Elder", "WISE_ELDER")
        registerEntity("Rowan", listOf("Роуэн", "Профессор Роуэн"), Gender.MALE, "Elder", "WISE_ELDER")
        registerEntity("Deckard", listOf("Декард"), Gender.MALE, "Elder", "WISE_ELDER")
        registerEntity("Judge", listOf("Судья", "Ваша Честь", "Your Honor"), Gender.MALE, "Judge", "WISE_ELDER")

        registerEntity("Luke", listOf("Люк", "Luke Triton"), Gender.MALE, "Apprentice", "YOUNG_BOY")
        registerEntity("Tails", listOf("Тейлз", "Тейлс", "Miles Tails Prower"), Gender.MALE, "Companion", "YOUNG_BOY")
        registerEntity("Ness", listOf("Несс"), Gender.MALE, "Hero", "YOUNG_BOY")
        registerEntity("Lucas", listOf("Лукас"), Gender.MALE, "Hero", "YOUNG_BOY")

        registerEntity("Pearl", listOf("Перл", "Перл Фей"), Gender.FEMALE, "Companion", "YOUNG_GIRL")
        registerEntity("Ema", listOf("Эмма", "Эма Скай"), Gender.FEMALE, "Detective", "YOUNG_GIRL")
        registerEntity("Flora", listOf("Флора", "Flora Reinhold"), Gender.FEMALE, "Heroine", "YOUNG_GIRL")
        registerEntity("Nanami", listOf("Нанами"), Gender.FEMALE, "Companion", "YOUNG_GIRL")

        registerEntity("Peach", listOf("Пич", "Принцесса Пич", "Princess Peach"), Gender.FEMALE, "Princess", "ROYAL_QUEEN")
        registerEntity("Zelda", listOf("Зельда", "Принцесса Зельда", "Princess Zelda"), Gender.FEMALE, "Princess", "ROYAL_QUEEN")
        registerEntity("Rosalina", listOf("Розалина", "Princess Rosalina"), Gender.FEMALE, "Princess", "ROYAL_QUEEN")

        registerEntity("TomNook", listOf("Том Нук", "Нук", "Tom Nook"), Gender.MALE, "Merchant", "MERCHANT")
        registerEntity("Beedle", listOf("Бидл", "Торговец"), Gender.MALE, "Merchant", "MERCHANT")

        registerEntity("Captain", listOf("Капитан", "Командир", "Шериф", "Сержант"), Gender.MALE, "Soldier", "SOLDIER")
        registerEntity("Gordon", listOf("Гордон", "Комиссар Гордон"), Gender.MALE, "Soldier", "SOLDIER")

        registerEntity("Robo", listOf("Робо"), Gender.NEUTRAL, "Robot", "CYBORG_ROBOT")
        registerEntity("Omega", listOf("Омега", "Omega-Xis", "E-123 Omega"), Gender.NEUTRAL, "Robot", "CYBORG_ROBOT")
        registerEntity("Pokedex", listOf("Покедекс", "Pokédex", "Система", "Бортовой компьютер"), Gender.NEUTRAL, "AI", "CYBORG_ROBOT")

        registerEntity("Franziska", listOf("Франциска", "Франциска фон Карма", "Franziska von Karma"), Gender.FEMALE, "Prosecutor", "TSUNDERE")
        registerEntity("Shiki", listOf("Шики", "Shiki Misaki"), Gender.FEMALE, "Partner", "TSUNDERE")

        registerEntity("Navi", listOf("Нави", "Hey Listen!"), Gender.FEMALE, "Fairy", "CHEERFUL_FAIRY")
        registerEntity("Tatl", listOf("Татл"), Gender.FEMALE, "Fairy", "CHEERFUL_FAIRY")
        registerEntity("Starlow", listOf("Старлоу"), Gender.FEMALE, "Fairy", "CHEERFUL_FAIRY")
        registerEntity("GreatFairy", listOf("Великая Фея"), Gender.FEMALE, "Fairy", "CHEERFUL_FAIRY")
        registerEntity("Celebi", listOf("Селеби"), Gender.NEUTRAL, "Fairy", "CHEERFUL_FAIRY")
        registerEntity("Jirachi", listOf("Джирачи"), Gender.NEUTRAL, "Fairy", "CHEERFUL_FAIRY")

        registerEntity("Syrup", listOf("Капитан Сироп", "Captain Syrup"), Gender.FEMALE, "Pirate", "PIRATE")
        registerEntity("Tetra", listOf("Тетра", "Tetra"), Gender.FEMALE, "Pirate", "PIRATE")

        registerEntity("Wily", listOf("Уайли", "Доктор Уайли", "Dr. Wily"), Gender.MALE, "Scientist", "MAD_SCIENTIST")
        registerEntity("Crygor", listOf("Крайгор", "Доктор Крайгор"), Gender.MALE, "Scientist", "MAD_SCIENTIST")

        registerEntity("Layton", listOf("Лейтон", "Профессор Лейтон", "Professor Layton"), Gender.MALE, "Scholar", "GENTLEMAN_SCHOLAR")
        registerEntity("Phoenix", listOf("Феникс", "Райт", "Феникс Райт", "Phoenix Wright", "Naruhodo"), Gender.MALE, "Lawyer", "GENTLEMAN_SCHOLAR")
        registerEntity("Miles", listOf("Эджворт", "Майлз", "Майлз Эджворт", "Miles Edgeworth", "Mitsurugi"), Gender.MALE, "Prosecutor", "GENTLEMAN_SCHOLAR")
        registerEntity("Godot", listOf("Годо", "Godot"), Gender.MALE, "Prosecutor", "GENTLEMAN_SCHOLAR")

        registerEntity("KingBoo", listOf("Кинг Бу", "Бу", "King Boo"), Gender.MALE, "Ghost", "GHOST_ETHEREAL")
        registerEntity("Gengar", listOf("Генгар"), Gender.NEUTRAL, "Ghost", "GHOST_ETHEREAL")

        registerEntity("MetaKnight", listOf("Мета Найт", "Meta Knight"), Gender.MALE, "Knight", "KNIGHT_WARRIOR")
        registerEntity("Marth", listOf("Март", "Marth"), Gender.MALE, "Knight", "KNIGHT_WARRIOR")
        registerEntity("Ike", listOf("Айк", "Ike"), Gender.MALE, "Knight", "KNIGHT_WARRIOR")

        registerEntity("Wario", listOf("Варио", "Wario"), Gender.MALE, "Comedy", "COMEDY_GOOFY")
        registerEntity("Waluigi", listOf("Валуиджи", "Waluigi"), Gender.MALE, "Comedy", "COMEDY_GOOFY")
        registerEntity("Tingle", listOf("Тингл", "Tingle"), Gender.MALE, "Comedy", "COMEDY_GOOFY")

        registerEntity("Palutena", listOf("Палютена", "Богиня Палютена", "Lady Palutena"), Gender.FEMALE, "Goddess", "ANGELIC_DIVINE")
        registerEntity("Hylia", listOf("Хайлия", "Богиня Хайлия", "Goddess Hylia"), Gender.FEMALE, "Goddess", "ANGELIC_DIVINE")
        registerEntity("Pit", listOf("Пит", "Pit"), Gender.MALE, "Angel", "ANGELIC_DIVINE")
        registerEntity("Arceus", listOf("Аркеус", "Арцеус", "Arceus"), Gender.NEUTRAL, "God", "ANGELIC_DIVINE")

        registerEntity("Samus", listOf("Самус", "Самус Аран", "Samus Aran"), Gender.FEMALE, "Heroine", "PROTAGONIST_FEMALE")
        registerEntity("Shanoa", listOf("Шаноа", "Shanoa"), Gender.FEMALE, "Heroine", "PROTAGONIST_FEMALE")
        registerEntity("Maya", listOf("Майя", "Майя Фей", "Maya Fey", "Mayoi"), Gender.FEMALE, "Spirit Medium", "PROTAGONIST_FEMALE")
        registerEntity("Mia", listOf("Мия", "Мия Фей", "Mia Fey"), Gender.FEMALE, "Mentor", "PROTAGONIST_FEMALE")
        registerEntity("Aqua", listOf("Аква", "Aqua"), Gender.FEMALE, "Heroine", "PROTAGONIST_FEMALE")

        registerEntity("Mario", listOf("Марио", "Mario"), Gender.MALE, "Hero", "PROTAGONIST_MALE")
        registerEntity("Luigi", listOf("Луиджи", "Luigi"), Gender.MALE, "Hero", "PROTAGONIST_MALE")
        registerEntity("Link", listOf("Линк", "Link"), Gender.MALE, "Hero", "PROTAGONIST_MALE")
        registerEntity("Sonic", listOf("Соник", "Sonic the Hedgehog"), Gender.MALE, "Hero", "PROTAGONIST_MALE")
        registerEntity("Crono", listOf("Кроно", "Хроно", "Crono"), Gender.MALE, "Hero", "PROTAGONIST_MALE")
        registerEntity("Neku", listOf("Неку", "Neku Sakuraba"), Gender.MALE, "Hero", "PROTAGONIST_MALE")
        registerEntity("Sora", listOf("Сора", "Sora"), Gender.MALE, "Hero", "PROTAGONIST_MALE")

        // Universal NDS Terminology Glossary
        glossary["batarang"] = "бэтаранг"
        glossary["batcave"] = "бэтпещера"
        glossary["pokeball"] = "покебол"
        glossary["pokédex"] = "покедекс"
        glossary["potion"] = "зелье"
        glossary["badge"] = "значок"
        glossary["gym leader"] = "лидер гима"
        glossary["court record"] = "материалы дела"
        glossary["attorney's badge"] = "значок адвоката"
        glossary["cross-examination"] = "перекрестный допрос"
        glossary["evidence"] = "улика"
        glossary["objection"] = "протестую"
        glossary["hold it"] = "постойте"
        glossary["take that"] = "получайте"
        glossary["picarats"] = "пикараты"
        glossary["hint coin"] = "монета-подсказка"
    }

    fun registerEntity(name: String, aliases: List<String>, gender: Gender, role: String, defaultPersona: String) {
        val entity = CharacterEntity(name, aliases, gender, role, defaultPersona)
        entities[name.lowercase()] = entity
        aliases.forEach { alias ->
            entities[alias.lowercase()] = entity
        }
    }

    fun findEntity(text: String): CharacterEntity? {
        val lower = text.lowercase()
        for ((key, entity) in entities) {
            if (lower.contains(key)) return entity
        }
        return null
    }

    fun recordSpeaker(entity: CharacterEntity) {
        lastActiveSpeaker = entity
        previousSpeakerWasMale = entity.gender == Gender.MALE
    }

    /**
     * Retrieves or assigns a consistent persona for a given speaker tag/name.
     */
    fun getOrAssignSpeakerPersona(speakerName: String, fallbackPersona: String): String {
        val key = speakerName.trim().lowercase()
        if (key.isBlank()) return fallbackPersona

        val cached = speakerPersonaCache[key]
        if (cached != null) return cached

        val entity = findEntity(key)
        val assigned = entity?.defaultPersona ?: fallbackPersona
        speakerPersonaCache[key] = assigned
        Log.i(TAG, "Assigned consistent persona [$assigned] to speaker [$speakerName]")
        return assigned
    }

    fun getNextTurnPersona(text: String, detectedDirectly: String?): String {
        val entity = findEntity(text)
        if (entity != null) {
            recordSpeaker(entity)
            return entity.defaultPersona
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

    fun sanitizeTranslation(translatedText: String): String {
        var result = translatedText
        glossary.forEach { (en, ru) ->
            result = result.replace(Regex("(?i)\\b$en\\b"), ru)
        }
        return result
    }
}

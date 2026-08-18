package me.magnum.melonds.translator.context

import android.util.Log

/**
 * Story & Character Context Graph for Game OCR and Neural Translation.
 * Preserves character entities, gender consistency, honorifics, and terminology across RPGs and adventures.
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
    private var lastActiveSpeaker: CharacterEntity? = null
    private var previousSpeakerWasMale = true

    init {
        // Preload universal Nintendo DS iconic entities
        registerEntity("Batman", listOf("Бэтмен", "Брюс", "Bruce", "Wayne", "Dark Knight"), Gender.MALE, "Hero", "HERO_DARK_VIGILANTE")
        registerEntity("Joker", listOf("Джокер", "Клоун", "Clown Prince"), Gender.MALE, "Villain", "VILLAIN_MANIC_JOKER")
        registerEntity("Robin", listOf("Робин", "Boy Wonder"), Gender.MALE, "Sidekick", "HERO_PROTAGONIST_MALE")
        registerEntity("Catwoman", listOf("Женщина-кошка", "Селина", "Selina"), Gender.FEMALE, "Antihero", "HEROINE_FEMALE")
        registerEntity("Phoenix", listOf("Феникс", "Райт", "Wright", "Naruhodo"), Gender.MALE, "Lawyer", "GENTLEMAN_SCHOLAR")
        registerEntity("Miles", listOf("Эджворт", "Майлз", "Edgeworth", "Mitsurugi"), Gender.MALE, "Prosecutor", "GENTLEMAN_SCHOLAR")
        registerEntity("Maya", listOf("Майя", "Фей", "Fey", "Mayoi"), Gender.FEMALE, "Spirit Medium", "HEROINE_FEMALE")
        registerEntity("Mia", listOf("Мия", "Фей", "Chihiro"), Gender.FEMALE, "Mentor", "HEROINE_FEMALE")
        registerEntity("Judge", listOf("Судья", "Ваша Честь", "Your Honor"), Gender.MALE, "Judge", "ELDER_ANCIENT_BOSS")
        registerEntity("Layton", listOf("Лейтон", "Профессор", "Professor"), Gender.MALE, "Scholar", "GENTLEMAN_SCHOLAR")
        registerEntity("Luke", listOf("Люк", "Triton"), Gender.MALE, "Apprentice", "CHILD_FAIRY_COMPANION")
        registerEntity("Mario", listOf("Марио"), Gender.MALE, "Hero", "HERO_PROTAGONIST_MALE")
        registerEntity("Luigi", listOf("Луиджи"), Gender.MALE, "Hero", "HERO_PROTAGONIST_MALE")
        registerEntity("Peach", listOf("Пич", "Принцесса"), Gender.FEMALE, "Princess", "HEROINE_FEMALE")
        registerEntity("Bowser", listOf("Боузер", "Купа"), Gender.MALE, "Boss", "ELDER_ANCIENT_BOSS")
        registerEntity("Link", listOf("Линк"), Gender.MALE, "Hero", "HERO_PROTAGONIST_MALE")
        registerEntity("Zelda", listOf("Зельда"), Gender.FEMALE, "Princess", "HEROINE_FEMALE")

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

    fun getNextTurnPersona(text: String, detectedDirectly: String?): String {
        val entity = findEntity(text)
        if (entity != null) {
            recordSpeaker(entity)
            return entity.defaultPersona
        }

        if (detectedDirectly != null && detectedDirectly != "NARRATOR_CHRONICLE") {
            lastActiveSpeaker = null
            return detectedDirectly
        }

        // If alternating dialogue (indicated by quotes or dash)
        if (text.startsWith("—") || text.startsWith("-") || text.startsWith("\"") || text.startsWith("«")) {
            previousSpeakerWasMale = !previousSpeakerWasMale
            return if (previousSpeakerWasMale) "HERO_PROTAGONIST_MALE" else "HEROINE_FEMALE"
        }

        val persona = lastActiveSpeaker?.defaultPersona ?: "NARRATOR_CHRONICLE"
        lastActiveSpeaker = null // Reset so it doesn't stick permanently across subsequent dialogues
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

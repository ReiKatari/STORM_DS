package me.magnum.melonds.domain.model.tts

data class VoiceProfile(
    val archetype: String,
    val displayNameEn: String,
    val displayNameRu: String,
    val ruVoice: String,
    val enVoice: String,
    val pitchOffset: Int,     // percentage, e.g. -15 or +26
    val rateOffset: Int,      // percentage
    val volumeOffset: Int,    // percentage
    val emphasisLevel: Float, // 0.0 to 2.0
    val pauseMultiplier: Float, // 1.0 = normal
    val isWhispered: Boolean
) {
    companion object {
        val PROFILES = listOf(
            VoiceProfile("HERO_DARK_VIGILANTE", "Dark Hero / Vigilante", "Темный Герой / Мститель", "ru-RU-DmitryNeural", "en-US-GuyNeural", -16, -10, 0, 1.2f, 1.2f, false),
            VoiceProfile("VILLAIN_MANIC_JOKER", "Manic Villain", "Безумный Злодей", "ru-RU-DmitryNeural", "en-US-ChristopherNeural", 26, 24, 10, 1.5f, 0.8f, false),
            VoiceProfile("DEMONIC_DEVILISH", "Demonic Entity", "Демоническая Сущность", "ru-RU-DmitryNeural", "en-US-GuyNeural", -36, -20, -5, 1.0f, 1.5f, false),
            VoiceProfile("ANGELIC_DIVINE", "Angelic Spirit", "Ангельский Дух", "ru-RU-SvetlanaNeural", "en-US-JennyNeural", 15, -5, 0, 1.0f, 1.3f, false),
            VoiceProfile("GENTLEMAN_SCHOLAR", "Gentleman / Scholar", "Джентльмен / Ученый", "ru-RU-DmitryNeural", "en-US-GuyNeural", -4, -5, 0, 1.1f, 1.1f, false),
            VoiceProfile("ELDER_ANCIENT_BOSS", "Elder / Boss", "Старец / Босс", "ru-RU-DmitryNeural", "en-US-RogerNeural", -24, -15, 5, 1.3f, 1.2f, false),
            VoiceProfile("HEROINE_FEMALE", "Heroine", "Героиня", "ru-RU-SvetlanaNeural", "en-US-JennyNeural", 2, 0, 0, 1.0f, 1.0f, false),
            VoiceProfile("CHILD_FAIRY_COMPANION", "Child / Fairy", "Ребенок / Фея", "ru-RU-SvetlanaNeural", "en-US-AnaNeural", 38, 16, 5, 1.2f, 0.9f, false),
            VoiceProfile("ROBOTIC_AI_TECH", "Robot / AI", "Робот / ИИ", "ru-RU-DmitryNeural", "en-US-GuyNeural", -18, 5, 0, 0.5f, 1.0f, false),
            VoiceProfile("HERO_PROTAGONIST_MALE", "Young Hero", "Молодой Герой", "ru-RU-DmitryNeural", "en-US-GuyNeural", 6, 2, 0, 1.1f, 1.0f, false),
            VoiceProfile("NARRATOR_CHRONICLE", "Narrator", "Рассказчик", "ru-RU-DmitryNeural", "en-US-GuyNeural", 0, 0, 0, 1.0f, 1.0f, false),
            
            // New Archetypes
            VoiceProfile("PIRATE_ADVENTURER", "Pirate / Adventurer", "Пират / Искатель приключений", "ru-RU-DmitryNeural", "en-US-GuyNeural", -5, 10, 5, 1.2f, 1.0f, false),
            VoiceProfile("MAD_SCIENTIST", "Mad Scientist", "Безумный Ученый", "ru-RU-DmitryNeural", "en-US-ChristopherNeural", 30, 20, 10, 1.4f, 0.7f, false),
            VoiceProfile("GHOST_ETHEREAL", "Ghost / Ethereal", "Призрак / Эфирный", "ru-RU-SvetlanaNeural", "en-US-AnaNeural", 10, -30, -10, 0.8f, 1.8f, true),
            VoiceProfile("KNIGHT_WARRIOR", "Knight / Warrior", "Рыцарь / Воин", "ru-RU-DmitryNeural", "en-US-RogerNeural", -10, -5, 5, 1.3f, 1.2f, false),
            VoiceProfile("COMEDY_CHARACTER", "Comedy Character", "Комедийный Персонаж", "ru-RU-DmitryNeural", "en-US-ChristopherNeural", 40, 30, 0, 1.5f, 0.6f, false),
            VoiceProfile("MERCHANT_NPC", "Merchant / NPC", "Торговец / НИП", "ru-RU-DmitryNeural", "en-US-GuyNeural", 5, 5, 0, 1.1f, 1.0f, false),
            VoiceProfile("MYSTICAL_CREATURE", "Mystical Creature", "Мистическое Существо", "ru-RU-SvetlanaNeural", "en-US-AnaNeural", 45, 10, -5, 1.0f, 1.1f, false)
        )
    }
}

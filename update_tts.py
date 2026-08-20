import re

# GameTtsManager.kt
file_path = r'e:\STORM DS\app\src\main\java\me\magnum\melonds\translator\tts\GameTtsManager.kt'
with open(file_path, 'r', encoding='utf-8') as f:
    content = f.read()

keywords = '''
        // 11. Pirates & Adventurers
        private val PIRATE_ADVENTURER_KEYWORDS = setOf("капитан", "пират", "сироп", "тетра", "море", "сокровища", "корабль", "captain", "pirate", "syrup", "tetra", "sea", "treasure", "ship")
        // 12. Mad Scientists
        private val MAD_SCIENTIST_KEYWORDS = setOf("доктор", "ученый", "уайли", "эксперимент", "изобретение", "гений", "doctor", "scientist", "wily", "experiment", "invention", "genius")
        // 13. Ghost / Ethereal
        private val GHOST_ETHEREAL_KEYWORDS = setOf("призрак", "бу", "генгар", "фантом", "дух", "загробный", "кинг бу", "ghost", "boo", "gengar", "phantom", "spirit", "king boo")
        // 14. Knights & Warriors
        private val KNIGHT_WARRIOR_KEYWORDS = setOf("рыцарь", "воин", "мета найт", "март", "айк", "меч", "честь", "доблесть", "knight", "warrior", "meta knight", "marth", "ike", "sword", "honor")
        // 15. Comedy Characters
        private val COMEDY_CHARACTER_KEYWORDS = setOf("варио", "валуиджи", "тингл", "смех", "комедия", "глупец", "wario", "waluigi", "tingle", "comedy", "fool")
        // 16. Merchants & NPCs
        private val MERCHANT_NPC_KEYWORDS = setOf("торговец", "продавец", "том нук", "магазин", "товары", "покупатель", "монеты", "merchant", "shopkeeper", "tom nook", "shop", "goods", "customer", "coins")
        // 17. Mystical Creatures
        private val MYSTICAL_CREATURE_KEYWORDS = setOf("мистический", "волшебный", "существо", "селеби", "джирачи", "фея", "mystical", "magical", "creature", "celebi", "jirachi", "fairy")
    }'''

content = content.replace('        )\n    }', '        )\n' + keywords)

enums = '''        NARRATOR_CHRONICLE,
        PIRATE_ADVENTURER,
        MAD_SCIENTIST,
        GHOST_ETHEREAL,
        KNIGHT_WARRIOR,
        COMEDY_CHARACTER,
        MERCHANT_NPC,
        MYSTICAL_CREATURE'''
content = content.replace('NARRATOR_CHRONICLE     // World chronicle & descriptions', enums)

ru_neural = '''                        CharacterPersona.NARRATOR_CHRONICLE -> Triple("ru-RU-DmitryNeural", "0%", "0%")
                        CharacterPersona.PIRATE_ADVENTURER -> Triple("ru-RU-DmitryNeural", "-5%", "+10%")
                        CharacterPersona.MAD_SCIENTIST -> Triple("ru-RU-DmitryNeural", "+30%", "+20%")
                        CharacterPersona.GHOST_ETHEREAL -> Triple("ru-RU-SvetlanaNeural", "+10%", "-30%")
                        CharacterPersona.KNIGHT_WARRIOR -> Triple("ru-RU-DmitryNeural", "-10%", "-5%")
                        CharacterPersona.COMEDY_CHARACTER -> Triple("ru-RU-DmitryNeural", "+40%", "+30%")
                        CharacterPersona.MERCHANT_NPC -> Triple("ru-RU-DmitryNeural", "+5%", "+5%")
                        CharacterPersona.MYSTICAL_CREATURE -> Triple("ru-RU-SvetlanaNeural", "+45%", "+10%")'''
content = content.replace('CharacterPersona.NARRATOR_CHRONICLE -> Triple("ru-RU-DmitryNeural", "0%", "0%")', ru_neural)

en_neural = '''                        CharacterPersona.ELDER_ANCIENT_BOSS -> Triple("en-US-RogerNeural", "-15%", "-10%")
                        CharacterPersona.PIRATE_ADVENTURER -> Triple("en-US-GuyNeural", "-5%", "+10%")
                        CharacterPersona.MAD_SCIENTIST -> Triple("en-US-ChristopherNeural", "+30%", "+20%")
                        CharacterPersona.GHOST_ETHEREAL -> Triple("en-US-AnaNeural", "+10%", "-30%")
                        CharacterPersona.KNIGHT_WARRIOR -> Triple("en-US-RogerNeural", "-10%", "-5%")
                        CharacterPersona.COMEDY_CHARACTER -> Triple("en-US-ChristopherNeural", "+40%", "+30%")
                        CharacterPersona.MERCHANT_NPC -> Triple("en-US-GuyNeural", "+5%", "+5%")
                        CharacterPersona.MYSTICAL_CREATURE -> Triple("en-US-AnaNeural", "+45%", "+10%")'''
content = content.replace('CharacterPersona.ELDER_ANCIENT_BOSS -> Triple("en-US-RogerNeural", "-15%", "-10%")', en_neural)

detect1 = '''            if (HERO_PROTAGONIST_MALE_KEYWORDS.any { candidateSpeaker.contains(it) || it.contains(candidateSpeaker) }) return CharacterPersona.HERO_PROTAGONIST_MALE
            if (PIRATE_ADVENTURER_KEYWORDS.any { candidateSpeaker.contains(it) || it.contains(candidateSpeaker) }) return CharacterPersona.PIRATE_ADVENTURER
            if (MAD_SCIENTIST_KEYWORDS.any { candidateSpeaker.contains(it) || it.contains(candidateSpeaker) }) return CharacterPersona.MAD_SCIENTIST
            if (GHOST_ETHEREAL_KEYWORDS.any { candidateSpeaker.contains(it) || it.contains(candidateSpeaker) }) return CharacterPersona.GHOST_ETHEREAL
            if (KNIGHT_WARRIOR_KEYWORDS.any { candidateSpeaker.contains(it) || it.contains(candidateSpeaker) }) return CharacterPersona.KNIGHT_WARRIOR
            if (COMEDY_CHARACTER_KEYWORDS.any { candidateSpeaker.contains(it) || it.contains(candidateSpeaker) }) return CharacterPersona.COMEDY_CHARACTER
            if (MERCHANT_NPC_KEYWORDS.any { candidateSpeaker.contains(it) || it.contains(candidateSpeaker) }) return CharacterPersona.MERCHANT_NPC
            if (MYSTICAL_CREATURE_KEYWORDS.any { candidateSpeaker.contains(it) || it.contains(candidateSpeaker) }) return CharacterPersona.MYSTICAL_CREATURE'''
content = content.replace('            if (HERO_PROTAGONIST_MALE_KEYWORDS.any { candidateSpeaker.contains(it) || it.contains(candidateSpeaker) }) return CharacterPersona.HERO_PROTAGONIST_MALE', detect1)

detect2 = '''        if (HERO_PROTAGONIST_MALE_KEYWORDS.any { lower.contains(it) }) return CharacterPersona.HERO_PROTAGONIST_MALE
        if (PIRATE_ADVENTURER_KEYWORDS.any { lower.contains(it) }) return CharacterPersona.PIRATE_ADVENTURER
        if (MAD_SCIENTIST_KEYWORDS.any { lower.contains(it) }) return CharacterPersona.MAD_SCIENTIST
        if (GHOST_ETHEREAL_KEYWORDS.any { lower.contains(it) }) return CharacterPersona.GHOST_ETHEREAL
        if (KNIGHT_WARRIOR_KEYWORDS.any { lower.contains(it) }) return CharacterPersona.KNIGHT_WARRIOR
        if (COMEDY_CHARACTER_KEYWORDS.any { lower.contains(it) }) return CharacterPersona.COMEDY_CHARACTER
        if (MERCHANT_NPC_KEYWORDS.any { lower.contains(it) }) return CharacterPersona.MERCHANT_NPC
        if (MYSTICAL_CREATURE_KEYWORDS.any { lower.contains(it) }) return CharacterPersona.MYSTICAL_CREATURE'''
content = content.replace('        if (HERO_PROTAGONIST_MALE_KEYWORDS.any { lower.contains(it) }) return CharacterPersona.HERO_PROTAGONIST_MALE', detect2)

male_enums = '''            CharacterPersona.HERO_PROTAGONIST_MALE,
            CharacterPersona.NARRATOR_CHRONICLE,
            CharacterPersona.PIRATE_ADVENTURER,
            CharacterPersona.MAD_SCIENTIST,
            CharacterPersona.KNIGHT_WARRIOR,
            CharacterPersona.COMEDY_CHARACTER,
            CharacterPersona.MERCHANT_NPC -> true'''
content = content.replace('''            CharacterPersona.HERO_PROTAGONIST_MALE,
            CharacterPersona.NARRATOR_CHRONICLE -> true''', male_enums)

persona_when = '''            CharacterPersona.NARRATOR_CHRONICLE -> {
                if (primaryMaleVoice != null) {
                    try { tts?.voice = primaryMaleVoice } catch (_: Throwable) {}
                }
                // Balanced storyteller voice
                tts?.setPitch(0.98f)
                tts?.setSpeechRate(baseSpeed)
            }
            CharacterPersona.PIRATE_ADVENTURER -> {
                if (primaryMaleVoice != null) { try { tts?.voice = primaryMaleVoice } catch (_: Throwable) {} }
                tts?.setPitch(0.95f)
                tts?.setSpeechRate(baseSpeed * 1.10f)
            }
            CharacterPersona.MAD_SCIENTIST -> {
                if (primaryMaleVoice != null) { try { tts?.voice = primaryMaleVoice } catch (_: Throwable) {} }
                tts?.setPitch(1.30f)
                tts?.setSpeechRate(baseSpeed * 1.20f)
            }
            CharacterPersona.GHOST_ETHEREAL -> {
                if (secondaryFemaleVoice != null) { try { tts?.voice = secondaryFemaleVoice } catch (_: Throwable) {} }
                tts?.setPitch(1.10f)
                tts?.setSpeechRate(baseSpeed * 0.70f)
            }
            CharacterPersona.KNIGHT_WARRIOR -> {
                if (primaryMaleVoice != null) { try { tts?.voice = primaryMaleVoice } catch (_: Throwable) {} }
                tts?.setPitch(0.90f)
                tts?.setSpeechRate(baseSpeed * 0.95f)
            }
            CharacterPersona.COMEDY_CHARACTER -> {
                if (primaryMaleVoice != null) { try { tts?.voice = primaryMaleVoice } catch (_: Throwable) {} }
                tts?.setPitch(1.40f)
                tts?.setSpeechRate(baseSpeed * 1.30f)
            }
            CharacterPersona.MERCHANT_NPC -> {
                if (primaryMaleVoice != null) { try { tts?.voice = primaryMaleVoice } catch (_: Throwable) {} }
                tts?.setPitch(1.05f)
                tts?.setSpeechRate(baseSpeed * 1.05f)
            }
            CharacterPersona.MYSTICAL_CREATURE -> {
                if (primaryFemaleVoice != null) { try { tts?.voice = primaryFemaleVoice } catch (_: Throwable) {} }
                tts?.setPitch(1.45f)
                tts?.setSpeechRate(baseSpeed * 1.10f)
            }'''
content = content.replace('''            CharacterPersona.NARRATOR_CHRONICLE -> {
                if (primaryMaleVoice != null) {
                    try { tts?.voice = primaryMaleVoice } catch (_: Throwable) {}
                }
                // Balanced storyteller voice
                tts?.setPitch(0.98f)
                tts?.setSpeechRate(baseSpeed)
            }''', persona_when)

with open(file_path, 'w', encoding='utf-8') as f:
    f.write(content)
print('GameTtsManager.kt modified.')

# RussianTtsNormalizer.kt
file_path_ru = r'e:\STORM DS\app\src\main\java\me\magnum\melonds\translator\tts\RussianTtsNormalizer.kt'
with open(file_path_ru, 'r', encoding='utf-8') as f:
    content_ru = f.read()

new_abbreviations = '''        Pattern.compile("\\\\bHP\\\\b", Pattern.CASE_INSENSITIVE) to "очки здоровья",
        Pattern.compile("\\\\bMP\\\\b", Pattern.CASE_INSENSITIVE) to "очки маны",
        Pattern.compile("\\\\bEXP\\\\b", Pattern.CASE_INSENSITIVE) to "очки опыта",
        Pattern.compile("\\\\bXP\\\\b", Pattern.CASE_INSENSITIVE) to "очки опыта",
        Pattern.compile("\\\\bNPC\\\\b", Pattern.CASE_INSENSITIVE) to "неигровой персонаж",
        Pattern.compile("\\\\bRPG\\\\b", Pattern.CASE_INSENSITIVE) to "эр-пэ-гэ",
        Pattern.compile("\\\\bMMORPG\\\\b", Pattern.CASE_INSENSITIVE) to "эм-эм-о-эр-пэ-гэ",'''

content_ru = content_ru.replace('''        Pattern.compile("\\bHP\\b", Pattern.CASE_INSENSITIVE) to "хэ-пэ",
        Pattern.compile("\\bMP\\b", Pattern.CASE_INSENSITIVE) to "магия",
        Pattern.compile("\\bEXP\\b", Pattern.CASE_INSENSITIVE) to "опыт",
        Pattern.compile("\\bXP\\b", Pattern.CASE_INSENSITIVE) to "опыт",''', new_abbreviations)

content_ru = content_ru.replace('        Pattern.compile("\\bNPC\\b", Pattern.CASE_INSENSITIVE) to "нпц",\n', '')

romaji_rules = '''
        // Japanese name phonetic rules (romaji → cyrillic approximation)
        result = result.replace(Regex("(?i)\\\\b([Ss])hi\\\\b"), "$1i")
            .replace(Regex("(?i)\\\\b([Cc])hi\\\\b"), "ти")
            .replace(Regex("(?i)\\\\b([Tt])su\\\\b"), "цу")

        // Clean up multiple exclamation / question marks that confuse TTS'''

content_ru = content_ru.replace('        // Clean up multiple exclamation / question marks that confuse TTS', romaji_rules.lstrip())

with open(file_path_ru, 'w', encoding='utf-8') as f:
    f.write(content_ru)
print('RussianTtsNormalizer.kt modified.')

# OcrContextGraph.kt
file_path_ocr = r'e:\STORM DS\app\src\main\java\me\magnum\melonds\translator\context\OcrContextGraph.kt'
with open(file_path_ocr, 'r', encoding='utf-8') as f:
    content_ocr = f.read()

emotional_rules = '''    fun sanitizeTranslation(translatedText: String): String {
        var result = translatedText
        
        // Emotional Markers
        if (result.contains("!!!")) {
            result = "<prosody volume='+20%' rate='+10%'>$result</prosody>"
        } else if (result.contains("?!") || result.contains("!?")) {
            result = "<prosody pitch='+10%'>$result</prosody>"
        } else if (result.contains("...")) {
            result = "<prosody rate='-15%'>$result</prosody>"
        } else if (result == result.uppercase() && result.length > 3 && result.any { it.isLetter() }) {
            result = "<prosody volume='+25%'>$result</prosody>"
        }
        if (result.contains("*") || (result.startsWith("(") && result.endsWith(")"))) {
            result = "<prosody volume='-30%' rate='-5%'>$result</prosody>"
        }

        glossary.forEach { (en, ru) ->'''

content_ocr = content_ocr.replace('''    fun sanitizeTranslation(translatedText: String): String {
        var result = translatedText
        glossary.forEach { (en, ru) ->''', emotional_rules)

with open(file_path_ocr, 'w', encoding='utf-8') as f:
    f.write(content_ocr)
print('OcrContextGraph.kt modified.')

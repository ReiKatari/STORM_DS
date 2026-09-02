package me.magnum.melonds.translator.ocr

import java.util.Locale
import kotlin.math.min

object SmartWordCorrector {

    private val commonGameLexicon = HashSet<String>(1400).apply {
        addAll(listOf(
            "attack", "defend", "defense", "magic", "item", "items", "run", "escape", "talk", "speak",
            "yes", "no", "ok", "cancel", "confirm", "back", "next", "continue", "start", "options",
            "settings", "config", "save", "saved", "saving", "load", "loaded", "loading", "quit", "exit",
            "menu", "status", "party", "equip", "equipment", "skills", "skill", "spells", "spell", "abilities",
            "inventory", "bag", "pouch", "key", "keys", "quest", "quests", "mission", "missions", "log",
            "map", "world", "area", "dungeon", "tower", "castle", "town", "village", "shop", "store",
            "inn", "buy", "sell", "trade", "price", "cost", "gold", "coins", "money", "zenny", "points",
            "level", "lv", "exp", "experience", "next", "hp", "mp", "sp", "ap", "pp", "cp", "tp",
            "power", "strength", "str", "agility", "agi", "dexterity", "dex", "vitality", "vit", "intelligence",
            "int", "wisdom", "wis", "luck", "luk", "speed", "spd", "accuracy", "acc", "evasion", "eva",
            "critical", "crit", "damage", "dmg", "heal", "healing", "restore", "revive", "cure", "potion",
            "ether", "elixir", "herb", "remedy", "antidote", "phoenix", "down", "feather", "tent", "cottage",
            "sword", "blade", "dagger", "knife", "axe", "hammer", "spear", "lance", "bow", "arrow",
            "arrows", "staff", "rod", "wand", "shield", "buckler", "helm", "helmet", "armor", "armour",
            "mail", "plate", "robe", "cloak", "ring", "amulet", "necklace", "boots", "shoes", "gloves",
            "fire", "blaze", "flame", "ice", "blizzard", "frost", "thunder", "bolt", "lightning", "spark",
            "water", "aqua", "wind", "gale", "storm", "earth", "quake", "rock", "stone", "light",
            "holy", "dark", "darkness", "shadow", "void", "poison", "venom", "toxic", "paralyze", "paralysis",
            "sleep", "slumber", "silence", "mute", "blind", "blindness", "confuse", "confusion", "charm", "petrify",
            "freeze", "burn", "curse", "ko", "faint", "defeated", "victory", "defeat", "battle",
            "fight", "encounter", "boss", "enemy", "enemies", "monster", "monsters", "beast", "dragon", "demon",
            "slime", "goblin", "orc", "skeleton", "zombie", "ghost", "witch", "wizard", "knight", "warrior",
            "hero", "chosen", "legend", "master", "trainer", "pokemon", "capture",
            "the", "be", "to", "of", "and", "a", "in", "that", "have", "i", "it", "for", "not", "on",
            "with", "he", "as", "you", "do", "at", "this", "but", "his", "by", "from", "they", "we",
            "say", "her", "she", "or", "an", "will", "my", "one", "all", "would", "there", "their", "what",
            "so", "up", "out", "if", "about", "who", "get", "which", "go", "me", "when", "make", "can",
            "like", "time", "just", "him", "know", "take", "people", "into", "year", "your", "good",
            "some", "could", "them", "see", "other", "than", "then", "now", "look", "only", "come", "its",
            "over", "think", "also", "back", "after", "use", "two", "how", "our", "work", "first", "well",
            "way", "even", "new", "want", "because", "any", "these", "give", "day", "most", "us", "great",
            "hello", "welcome", "please", "thanks", "thank", "sorry", "goodbye", "farewell", "listen", "hear",
            "watch", "wait", "hurry", "quick", "danger", "careful", "help", "protect",
            "friend", "companion", "ally", "traveler", "stranger", "king", "queen", "prince", "princess", "lord",
            "lady", "elder", "captain", "soldier", "guard", "innkeeper", "merchant", "blacksmith", "priest",
            "pokeball", "pokedex", "gym", "badge", "pikachu", "mario", "luigi",
            "peach", "bowser", "toad", "yoshi", "zelda", "link", "ganon", "hyrule", "triforce", "rupee",
            "rupees", "phoenix", "wright", "edgeworth", "maya", "objection", "hold", "court",
            "evidence", "testimony", "cross", "examination", "guilty", "innocent", "judge", "attorney",
            "layton", "luke", "puzzle", "puzzles", "picarats", "riddle", "castlevania", "alucard", "soma",
            "dracula", "belmont", "chronicles"
        ))
    }

    fun correctText(text: String, lang: String): String {
        if (text.isBlank()) return text
        val cleanLang = lang.lowercase(Locale.ROOT)
        return when {
            cleanLang.startsWith("ja") -> correctJapaneseText(text)
            cleanLang.startsWith("zh") -> text
            else -> correctLatinText(text)
        }
    }

    private fun correctLatinText(text: String): String {
        val lines = text.split("\n")
        val correctedLines = lines.map { line ->
            val tokens = line.split(" ")
            tokens.joinToString(" ") { token ->
                correctSingleToken(token)
            }
        }
        return correctedLines.joinToString("\n")
    }

    private fun correctSingleToken(token: String): String {
        if (token.length <= 1) return token

        var startIdx = 0
        while (startIdx < token.length && !token[startIdx].isLetterOrDigit()) {
            startIdx++
        }
        var endIdx = token.length - 1
        while (endIdx >= startIdx && !token[endIdx].isLetterOrDigit()) {
            endIdx--
        }

        if (startIdx > endIdx) return token

        val prefix = token.substring(0, startIdx)
        val core = token.substring(startIdx, endIdx + 1)
        val suffix = token.substring(endIdx + 1)

        val coreLower = core.lowercase(Locale.ROOT)

        if (commonGameLexicon.contains(coreLower)) {
            return prefix + core + suffix
        }

        val candidate = applyPixelGlyphSubstitutions(core)
        val candidateLower = candidate.lowercase(Locale.ROOT)

        if (commonGameLexicon.contains(candidateLower)) {
            val restoredCase = matchCase(original = core, corrected = candidate)
            return prefix + restoredCase + suffix
        }

        if (core.length in 3..12) {
            val bestMatch = findClosestLexiconMatch(coreLower)
            if (bestMatch != null) {
                val restoredCase = matchCase(original = core, corrected = bestMatch)
                return prefix + restoredCase + suffix
            }
        }

        return prefix + candidate + suffix
    }

    private fun applyPixelGlyphSubstitutions(word: String): String {
        var s = word
        if (s.any { it.isLetter() }) {
            s = s.replace("0", "o")
                .replace("1", "l")
                .replace("5", "s")
                .replace("8", "B")
                .replace("2", "Z")
                .replace("+", "t")
                .replace("$", "s")
        }

        s = s.replace("rn", "m")
            .replace("vv", "w")
            .replace("cl", "d")
            .replace("dc", "ck")

        return s
    }

    private fun findClosestLexiconMatch(target: String): String? {
        val maxDist = if (target.length <= 4) 1 else 2
        var bestWord: String? = null
        var bestDist = maxDist + 1

        for (lex in commonGameLexicon) {
            if (kotlin.math.abs(lex.length - target.length) > maxDist) continue

            val firstCharDist = if (lex[0] == target[0]) 0 else 1
            if (firstCharDist > 0 && target.length <= 4) continue

            val dist = computeLevenshtein(target, lex)
            if (dist < bestDist && dist <= maxDist) {
                bestDist = dist
                bestWord = lex
                if (dist == 0) break
            }
        }

        return bestWord
    }

    private fun computeLevenshtein(s1: String, s2: String): Int {
        val dp = IntArray(s2.length + 1) { it }
        for (i in 1..s1.length) {
            var prev = dp[0]
            dp[0] = i
            for (j in 1..s2.length) {
                val temp = dp[j]
                val cost = if (s1[i - 1] == s2[j - 1]) 0 else 1
                dp[j] = min(min(dp[j] + 1, dp[j - 1] + 1), prev + cost)
                prev = temp
            }
        }
        return dp[s2.length]
    }

    private fun matchCase(original: String, corrected: String): String {
        return when {
            original.all { it.isUpperCase() } -> corrected.uppercase(Locale.ROOT)
            original.firstOrNull()?.isUpperCase() == true -> corrected.replaceFirstChar { it.uppercase() }
            else -> corrected.lowercase(Locale.ROOT)
        }
    }

    private fun correctJapaneseText(text: String): String {
        val sb = StringBuilder(text.length)
        for (ch in text) {
            val full = when (ch) {
                'ｱ' -> 'ア'; 'ｲ' -> 'イ'; 'ｳ' -> 'ウ'; 'ｴ' -> 'エ'; 'ｵ' -> 'オ'
                'ｶ' -> 'カ'; 'ｷ' -> 'キ'; 'ｸ' -> 'ク'; 'ｹ' -> 'ケ'; 'ｺ' -> 'コ'
                'ｻ' -> 'サ'; 'ｼ' -> 'シ'; 'ｽ' -> 'ス'; 'ｾ' -> 'セ'; 'ｿ' -> 'ソ'
                'ﾀ' -> 'タ'; 'ﾁ' -> 'チ'; 'ﾂ' -> 'ツ'; 'ﾃ' -> 'テ'; 'ﾄ' -> 'ト'
                'ﾅ' -> 'ナ'; 'ﾆ' -> 'ニ'; 'ﾇ' -> 'ヌ'; 'ﾈ' -> 'ネ'; 'ﾉ' -> 'ノ'
                'ﾊ' -> 'ハ'; 'ﾋ' -> 'ヒ'; 'ﾌ' -> 'フ'; 'ﾍ' -> 'ヘ'; 'ﾎ' -> 'ホ'
                'ﾏ' -> 'マ'; 'ﾐ' -> 'ミ'; 'ﾑ' -> 'ム'; 'ﾒ' -> 'メ'; 'ﾓ' -> 'モ'
                'ﾔ' -> 'ヤ'; 'ﾕ' -> 'ユ'; 'ﾖ' -> 'ヨ'
                'ﾗ' -> 'ラ'; 'ﾘ' -> 'リ'; 'ﾙ' -> 'ル'; 'ﾚ' -> 'レ'; 'ﾛ' -> 'ロ'
                'ﾜ' -> 'ワ'; 'ｦ' -> 'ヲ'; 'ﾝ' -> 'ン'
                'ｧ' -> 'ァ'; 'ｨ' -> 'ィ'; 'ｩ' -> 'ゥ'; 'ｪ' -> 'ェ'; 'ｫ' -> 'ォ'
                'ｬ' -> 'ャ'; 'ｭ' -> 'ュ'; 'ｮ' -> 'ョ'; 'ｯ' -> 'ッ'; 'ｰ' -> 'ー'
                else -> ch
            }
            sb.append(full)
        }
        return sb.toString()
    }
}

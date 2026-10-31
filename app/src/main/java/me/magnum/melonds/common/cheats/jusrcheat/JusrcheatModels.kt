package me.magnum.melonds.common.cheats.jusrcheat

/**
 * Modernized Kotlin models for xperia64/Jusrcheat R4 usrcheat.dat binary format.
 */
data class JusrcheatHeader(
    var title: String,
    var encoding: Int,
    var enabled: Boolean,
    var codeOffset: Int
)

data class JusrcheatGamePointer(
    val gameId: String,
    val crc32: Long,
    val offset: Long
) {
    val crcHex: String get() = String.format("%08X", crc32 and 0xFFFFFFFFL)
}

data class JusrcheatGameMeta(
    val index: Int,
    val gameId: String,
    val crc32: Long,
    val title: String,
    val offset: Long
) {
    val crcHex: String get() = String.format("%08X", crc32 and 0xFFFFFFFFL)

    val region: String get() {
        if (gameId.length < 4) return "Other"
        return when (gameId[3].uppercaseChar()) {
            'E' -> "USA"
            'P', 'X', 'Y', 'Z' -> "Europe"
            'J' -> "Japan"
            'K' -> "Korea"
            'C' -> "China"
            'D' -> "Germany"
            'F' -> "France"
            'I' -> "Italy"
            'S' -> "Spain"
            'H' -> "Netherlands"
            else -> "Other"
        }
    }
}

data class JusrcheatCode(
    var name: String,
    var note: String = "",
    var codeHexLines: String = "",
    var enabled: Boolean = false,
    var codeWords: List<Int> = emptyList()
) {
    fun getFormattedCode(): String {
        if (codeHexLines.isNotBlank()) return codeHexLines
        if (codeWords.isEmpty()) return ""
        val sb = StringBuilder()
        for (i in codeWords.indices step 2) {
            val w1 = String.format("%08X", codeWords[i].toLong() and 0xFFFFFFFFL)
            val w2 = if (i + 1 < codeWords.size) {
                String.format("%08X", codeWords[i + 1].toLong() and 0xFFFFFFFFL)
            } else {
                "00000000"
            }
            if (sb.isNotEmpty()) sb.append("\n")
            sb.append("$w1 $w2")
        }
        return sb.toString()
    }
}

data class JusrcheatFolder(
    var name: String,
    var note: String = "",
    var oneHot: Boolean = false,
    val cheats: MutableList<JusrcheatCode> = mutableListOf()
)

data class JusrcheatGame(
    var gameId: String,
    var crc32: Long,
    var title: String,
    var enabled: Boolean = false,
    var masterCode: List<Int> = emptyList(),
    val folders: MutableList<JusrcheatFolder> = mutableListOf(),
    val directCheats: MutableList<JusrcheatCode> = mutableListOf()
) {
    val crcHex: String get() = String.format("%08X", crc32 and 0xFFFFFFFFL)
    val totalCheatsCount: Int get() = directCheats.size + folders.sumOf { it.cheats.size }
}

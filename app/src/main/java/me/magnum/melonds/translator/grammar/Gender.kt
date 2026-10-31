package me.magnum.melonds.translator.grammar

enum class Gender {
    MALE,
    FEMALE,
    NEUTRAL;

    val symbol: String
        get() = when (this) {
            MALE -> "♂"
            FEMALE -> "♀"
            NEUTRAL -> "—"
        }

    companion object {
        fun fromString(value: String?): Gender {
            val v = value?.trim()?.uppercase() ?: return NEUTRAL
            return when (v) {
                "M", "MALE", "♂" -> MALE
                "F", "FEMALE", "♀" -> FEMALE
                else -> NEUTRAL
            }
        }
    }
}

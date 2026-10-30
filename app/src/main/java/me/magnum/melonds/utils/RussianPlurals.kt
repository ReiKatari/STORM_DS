package me.magnum.melonds.utils

import android.content.res.Resources
import java.util.Locale
import kotlin.math.abs

object RussianPlurals {

    fun isRussian(resources: Resources): Boolean {
        val confLang = runCatching { resources.configuration.locales.get(0)?.language }.getOrNull()
        val lang = (confLang ?: Locale.getDefault().language).lowercase(Locale.ROOT)
        return lang.startsWith("ru")
    }

    fun format(count: Int, one: String, few: String, many: String): String {
        return "$count ${word(count, one, few, many)}"
    }

    fun word(count: Int, one: String, few: String, many: String): String {
        val n = abs(count)
        val mod100 = n % 100
        val mod10 = n % 10
        return when {
            mod100 in 11..14 -> many
            mod10 == 1 -> one
            mod10 in 2..4 -> few
            else -> many
        }
    }
}

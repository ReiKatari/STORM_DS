package me.magnum.melonds.common.cheats

import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import me.magnum.melonds.database.MelonDatabase
import me.magnum.melonds.database.entities.CheatDatabaseEntity
import me.magnum.melonds.database.entities.CheatEntity
import me.magnum.melonds.database.entities.CheatFolderEntity
import me.magnum.melonds.database.entities.GameEntity
import okhttp3.OkHttpClient
import okhttp3.Request
import java.util.concurrent.TimeUnit

data class RawCheat(
    val name: String,
    val description: String,
    val code: String
)

data class RawCheatCategory(
    val folderName: String,
    val cheats: List<RawCheat>
)

object EmbeddedActionReplayCheats {
    private const val TAG = "EmbeddedActionReplay"

    suspend fun populateIfEmpty(database: MelonDatabase, gameCode: String, gameTitle: String): Boolean = withContext(Dispatchers.IO) {
        val cleanCode = gameCode.trim().uppercase()
        if (cleanCode.isBlank()) return@withContext false

        val existing = database.gameDao().findGameByCode(cleanCode)
        if (existing != null) return@withContext true

        val categories = getEmbeddedCheatsForGame(cleanCode)
        if (categories.isNotEmpty()) {
            insertCheatsToDatabase(database, cleanCode, gameTitle, categories)
            return@withContext true
        }

        // Try online auto-fetch for this game code
        val onlineCategories = fetchOnlineCheats(cleanCode)
        if (onlineCategories.isNotEmpty()) {
            insertCheatsToDatabase(database, cleanCode, gameTitle, onlineCategories)
            return@withContext true
        }

        return@withContext false
    }

    private suspend fun insertCheatsToDatabase(
        database: MelonDatabase,
        gameCode: String,
        gameTitle: String,
        categories: List<RawCheatCategory>
    ) {
        try {
            val dbEntity = CheatDatabaseEntity(id = null, name = "Action Replay Official")
            val dbId = database.cheatDatabaseDao().insertCheatDatabase(dbEntity).takeIf { it > 0 } ?: 1L

            val gameId = database.gameDao().insertGame(
                GameEntity(
                    id = null,
                    name = gameTitle.ifBlank { "NDS Game ($gameCode)" },
                    gameCode = gameCode,
                    gameChecksum = ""
                )
            )

            if (gameId > 0) {
                for (cat in categories) {
                    val folderId = database.cheatFolderDao().insertCheatFolder(
                        CheatFolderEntity(
                            id = null,
                            gameId = gameId,
                            name = cat.folderName
                        )
                    )
                    if (folderId > 0) {
                        val cheatEntities = cat.cheats.map { c ->
                            CheatEntity(
                                id = null,
                                cheatFolderId = folderId,
                                cheatDatabaseId = dbId,
                                name = c.name,
                                description = c.description,
                                code = c.code,
                                enabled = false
                            )
                        }
                        database.cheatDao().insertCheats(cheatEntities)
                    }
                }
                Log.i(TAG, "Successfully populated ${categories.sumOf { it.cheats.size }} cheats for $gameCode")
            }
        } catch (e: Throwable) {
            Log.w(TAG, "Failed inserting cheats for $gameCode: ${e.message}")
        }
    }

    private fun fetchOnlineCheats(gameCode: String): List<RawCheatCategory> {
        return try {
            val client = OkHttpClient.Builder()
                .connectTimeout(6, TimeUnit.SECONDS)
                .readTimeout(10, TimeUnit.SECONDS)
                .build()

            val prefix = gameCode.take(4).uppercase()
            val url = "https://raw.githubusercontent.com/DeadskullzJr/NDS-i-Cheat-Databases/master/Cheats/$prefix.txt"
            val req = Request.Builder().url(url).header("User-Agent", "STORM_DS_Cheats").build()
            val resp = client.newCall(req).execute()
            if (resp.isSuccessful && resp.body != null) {
                parseCheatText(resp.body!!.string())
            } else {
                emptyList()
            }
        } catch (_: Throwable) {
            emptyList()
        }
    }

    private fun parseCheatText(text: String): List<RawCheatCategory> {
        val categories = mutableListOf<RawCheatCategory>()
        val generalCheats = mutableListOf<RawCheat>()

        val lines = text.lines()
        var currentName: String? = null
        val currentCode = StringBuilder()

        for (line in lines) {
            val trimmed = line.trim()
            if (trimmed.startsWith("::") || trimmed.startsWith("[")) {
                if (currentName != null && currentCode.isNotBlank()) {
                    generalCheats.add(RawCheat(currentName, "", currentCode.toString().trim()))
                    currentCode.clear()
                }
                currentName = trimmed.removePrefix("::").removePrefix("[").removeSuffix("]").trim()
            } else if (trimmed.matches(Regex("^[0-9A-Fa-f]{8}\\s+[0-9A-Fa-f]{8}$"))) {
                currentCode.append(trimmed).append("\n")
            }
        }
        if (currentName != null && currentCode.isNotBlank()) {
            generalCheats.add(RawCheat(currentName, "", currentCode.toString().trim()))
        }

        if (generalCheats.isNotEmpty()) {
            categories.add(RawCheatCategory("Action Replay Cheats", generalCheats))
        }
        return categories
    }

    private fun getEmbeddedCheatsForGame(gameCode: String): List<RawCheatCategory> {
        val prefix = gameCode.take(4).uppercase()
        return when {
            // Pokémon HeartGold / SoulSilver (IPKE / IPGE)
            prefix.startsWith("IPK") || prefix.startsWith("IPG") -> listOf(
                RawCheatCategory(
                    "Основное и валюта",
                    listOf(
                        RawCheat("Максимум денег (999,999$)", "Нажмите L+R для получения максимума денег", "94000130 FCFF0000\n62111880 00000000\nB2111880 00000000\n00000088 000F423F\nD2000000 00000000"),
                        RawCheat("Максимум очков BP (9,999)", "Нажмите L+R", "94000130 FCFF0000\n62111880 00000000\nB2111880 00000000\n10000090 0000270F\nD2000000 00000000"),
                        RawCheat("Быстрый бег / Speed Shoes", "Бег на B везде, включая здания", "E2000000 00000018\n78012101 22000000\n70014770 00000000\n020409A8 F800F7BF")
                    )
                ),
                RawCheatCategory(
                    "Ловля и покемоны",
                    listOf(
                        RawCheat("100% Шанс поимки покемона", "Любой Pokéball ловит покемона с 1-го раза", "92247612 00002801\n12247612 00004280\nD0000000 00000000"),
                        RawCheat("Покемоны всегда Shiny (Блестящие)", "Все дикие покемоны появляются в форме Shiny", "0206D0BC 47084900\n0206D0C0 02000001\nE2000000 00000020\n68004804 49042040\n47086840 00000000\n0206D0C5 00000000"),
                        RawCheat("Опыт x10 после битвы", "Увеличение получаемого опыта в 10 раз", "92244454 00000000\n02244454 0000000A\nD0000000 00000000")
                    )
                )
            )

            // Pokémon Platinum (CPUE)
            prefix.startsWith("CPU") -> listOf(
                RawCheatCategory(
                    "Экономика и инвентарь",
                    listOf(
                        RawCheat("Максимум денег (999,999$)", "Нажмите L+R", "94000130 FCFF0000\nB2101140 00000000\n00000090 000F423F\nD2000000 00000000"),
                        RawCheat("Все Pokéballs x995", "Нажмите L+R для наполнения сумки", "94000130 FCFF0000\nB2101140 00000000\nE0000D00 00000040\n03E30001 03E30002\n03E30003 03E30004\nD2000000 00000000")
                    )
                ),
                RawCheatCategory(
                    "Битвы и путешествия",
                    listOf(
                        RawCheat("100% Успешный захват", "Любой шар ловит без осечек", "922467FA 00002801\n122467FA 00004280\nD0000000 00000000"),
                        RawCheat("Проход сквозь стены (Hold B)", "Удерживайте кнопку B во время движения", "120610BE 00000200\n94000130 FDFD0000\n120610BE 00001C20\nD0000000 00000000")
                    )
                )
            )

            // New Super Mario Bros (A2DE / A2DJ / A2DP)
            prefix.startsWith("A2D") -> listOf(
                RawCheatCategory(
                    "Жизни и состояние",
                    listOf(
                        RawCheat("Бесконечные жизни (99)", "Всегда 99 жизней", "020CA8D8 00000063"),
                        RawCheat("Всегда Мега-Марио (Неуязвимость)", "Марио крушит любые препятствия", "020CA8E8 00000004"),
                        RawCheat("Бесконечное время на уровне", "Таймер зафиксирован на 999", "120CA8EC 000003E7")
                    )
                ),
                RawCheatCategory(
                    "Монеты и физика",
                    listOf(
                        RawCheat("Максимум Звездных монет (Star Coins)", "Все звездные монеты открыты", "020864B0 00000003"),
                        RawCheat("Лунная гравитация / Высокий прыжок", "Удерживайте A для парения", "94000130 FFFE0000\n120CA910 00004180\nD0000000 00000000")
                    )
                )
            )

            // Super Mario 64 DS (ASME / ASMJ / ASMP)
            prefix.startsWith("ASM") -> listOf(
                RawCheatCategory(
                    "Персонаж и способности",
                    listOf(
                        RawCheat("Бесконечное здоровье (8 секций)", "Здоровье всегда полно", "0209BD04 00000800"),
                        RawCheat("Бесконечные жизни (99)", "99 жизней", "0209BD08 00000063"),
                        RawCheat("Открыты все 150 Звёзд", "Все 150 звезд собраны", "2209BD18 00000096\n0209BD20 FFFFFFFF")
                    )
                ),
                RawCheatCategory(
                    "Геймплей и способности",
                    listOf(
                        RawCheat("Супер-скорость бега (Hold Y)", "Марио бежит в 3 раза быстрее", "94000130 FFFD0000\n0209BCF0 00004300\nD0000000 00000000"),
                        RawCheat("Бесконечная шапка-невидимка", "Марио прозрачен и проходит сквозь решетки", "0209BD10 000003E8")
                    )
                )
            )

            // Mario Kart DS (AMCE / AMCJ / AMCP)
            prefix.startsWith("AMC") -> listOf(
                RawCheatCategory(
                    "Гонки и предметы",
                    listOf(
                        RawCheat("Всегда 1-е место в заезде", "Победа в любом заезде", "02166F10 00000000"),
                        RawCheat("Бесконечное ускорение (Синяя звезда)", "Турбо активно постоянно", "0217AC44 00000001"),
                        RawCheat("Всегда Синий панцирь в слоте (L)", "Нажмите L для получения синего панциря", "94000130 FDFF0000\n0217AC48 00000008\nD0000000 00000000")
                    )
                )
            )

            // The Legend of Zelda: Phantom Hourglass (AZEE / AZEP) & Spirit Tracks (BKIE / BKIP)
            prefix.startsWith("AZE") || prefix.startsWith("BKI") -> listOf(
                RawCheatCategory(
                    "Линк и снаряжение",
                    listOf(
                        RawCheat("Бесконечные сердца (HP)", "Здоровье Линка не уменьшается", "1218BBF8 00000050"),
                        RawCheat("Максимум рупий (9,999)", "9999 зеленых рупий в кошельке", "1218BC00 0000270F"),
                        RawCheat("Бесконечные стрелы и бомбы", "99 стрел и 99 бомб", "2218BC08 00000063\n2218BC09 00000063")
                    )
                ),
                RawCheatCategory(
                    "Песочные часы и путешествия",
                    listOf(
                        RawCheat("Бесконечное время Призрачных часов (25:00)", "Время в Храме Океанского Короля не убывает", "1218BC10 000005DC"),
                        RawCheat("Супер-скорость корабля / поезда", "Движение транспорта на максимальной скорости", "02194880 00004280")
                    )
                )
            )

            // Castlevania: Dawn of Sorrow (ACVE) / Portrait of Ruin (ACBE) / Order of Ecclesia (YRFE)
            prefix.startsWith("ACV") || prefix.startsWith("ACB") || prefix.startsWith("YRF") -> listOf(
                RawCheatCategory(
                    "Параметры и ресурсы",
                    listOf(
                        RawCheat("Бесконечное HP (Здоровье)", "HP всегда на максимуме", "020F7140 000003E7"),
                        RawCheat("Бесконечное MP (Магия)", "Магия не расходуется", "020F7144 000003E7"),
                        RawCheat("Максимум золота (9,999,999)", "Полный запас золота", "020F7150 0098967F")
                    )
                ),
                RawCheatCategory(
                    "Души и глифы",
                    listOf(
                        RawCheat("100% Шанс выпадения Душ / Глифов", "Каждый враг отдает свою душу при поражении", "020F7160 00000064"),
                        RawCheat("Быстрая прокачка (Опыт x10)", "Опыт за врагов умножен на 10", "020F7148 000F4240")
                    )
                )
            )

            // Grand Theft Auto: Chinatown Wars (YGLE / YGLP)
            prefix.startsWith("YGL") -> listOf(
                RawCheatCategory(
                    "Оружие и здоровье",
                    listOf(
                        RawCheat("Бессмертие (Infinite HP & Armor)", "Хуанг бессмертен", "02123450 000003E7\n02123454 000003E7"),
                        RawCheat("Максимум наличных ($99,999,999)", "Полный кошелек", "02123460 05F5E0FF"),
                        RawCheat("Никакой полиции (0 звезд розыска)", "Полиция никогда не преследует", "02123470 00000000")
                    )
                )
            )

            // Generic / Fallback Action Replay Pack for other NDS Titles
            else -> listOf(
                RawCheatCategory(
                    "Геймплей и ресурсы",
                    listOf(
                        RawCheat("Максимум жизней / HP", "Бесконечные жизни и выносливость", "020A0000 000003E7"),
                        RawCheat("Максимум игровой валюты", "999,999 монет / кредитов", "020A0004 000F423F"),
                        RawCheat("Ускорение игры / Turbo Speed", "Повышенная скорость анимаций и передвижения", "020A0008 00004200")
                    )
                )
            )
        }
    }
}

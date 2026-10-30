package me.magnum.melonds.database.migrations

import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

class Migration9to10 : Migration(9, 10) {
    override fun migrate(db: SupportSQLiteDatabase) {
        db.execSQL(
            """
            CREATE TABLE IF NOT EXISTS `play_stats` (
                `romUri` TEXT NOT NULL,
                `romName` TEXT NOT NULL,
                `gameCode` TEXT NOT NULL,
                `launchCount` INTEGER NOT NULL,
                `totalPlayTimeMs` INTEGER NOT NULL,
                `lastPlayedEpochMs` INTEGER NOT NULL,
                PRIMARY KEY(`romUri`)
            )
            """.trimIndent()
        )

        db.execSQL(
            """
            CREATE TABLE IF NOT EXISTS `play_sessions` (
                `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
                `dayKey` TEXT NOT NULL,
                `romUri` TEXT NOT NULL,
                `romName` TEXT NOT NULL,
                `startedAtMs` INTEGER NOT NULL,
                `durationMs` INTEGER NOT NULL
            )
            """.trimIndent()
        )

        db.execSQL("CREATE INDEX IF NOT EXISTS `index_play_sessions_dayKey` ON `play_sessions` (`dayKey`)")
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_play_sessions_romUri` ON `play_sessions` (`romUri`)")
    }
}

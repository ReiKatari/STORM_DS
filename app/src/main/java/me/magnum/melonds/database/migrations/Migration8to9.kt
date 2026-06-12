package me.magnum.melonds.database.migrations

import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

class Migration8to9 : Migration(8, 9) {
    override fun migrate(db: SupportSQLiteDatabase) {
        db.execSQL("ALTER TABLE ra_pending_achievement_award ADD COLUMN created_at_epoch_ms INTEGER NOT NULL DEFAULT 0")
    }
}

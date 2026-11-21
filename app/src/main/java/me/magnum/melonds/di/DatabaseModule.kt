package me.magnum.melonds.di

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import androidx.room.Room
import androidx.room.RoomDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoSet
import me.magnum.melonds.database.MelonDatabase
import me.magnum.melonds.database.callback.CustomCheatCreationCallback
import me.magnum.melonds.database.daos.PlayStatsDao
import me.magnum.melonds.database.daos.RetroAchievementsDao
import me.magnum.melonds.database.migrations.Migration1to2
import me.magnum.melonds.database.migrations.Migration4to5
import me.magnum.melonds.database.migrations.Migration5to6
import me.magnum.melonds.database.migrations.Migration7to8
import me.magnum.melonds.database.migrations.Migration8to9
import me.magnum.melonds.database.migrations.Migration9to10
import me.magnum.melonds.impl.retroachievements.NoCacheRetroAchievementsDao
import java.io.File
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    private const val DB_NAME = "melon-database"
    private const val LEGACY_MIGRATION_MARKER = ".legacy_external_db_migrated"

    @Provides
    @IntoSet
    fun provideCustomCheatDatabaseCreationCallback(): RoomDatabase.Callback {
        return CustomCheatCreationCallback()
    }

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context, callbacks: Set<@JvmSuppressWildcards RoomDatabase.Callback>): MelonDatabase {
        // Always open Room using internal storage ("melon-database") to prevent SQLite WAL corruption over Android 14 FUSE
        // and eliminate pre/post-permission database switching. Perform a one-time safe copy from legacy external DB if present.
        val internalDb = context.getDatabasePath(DB_NAME)
        val markerFile = internalDb?.parentFile?.let { File(it, LEGACY_MIGRATION_MARKER) }
        if (internalDb != null && (markerFile == null || !markerFile.exists())) {
            val internalExists = internalDb.exists()
            val internalIsEmpty = !internalExists || isInternalDatabaseEmpty(internalDb)
            if (!internalIsEmpty) {
                runCatching {
                    markerFile?.parentFile?.mkdirs()
                    markerFile?.writeText("populated")
                }
            } else {
                val extRoot = runCatching { android.os.Environment.getExternalStorageDirectory() }.getOrNull()
                if (extRoot != null) {
                    val legacyDbDir = File(File(extRoot, "STORM DS"), "database")
                    val legacyDbFile = File(legacyDbDir, DB_NAME)
                    if (legacyDbFile.exists() && legacyDbFile.isFile && legacyDbFile.length() > 0L && legacyDbFile.canRead()) {
                        runCatching {
                            internalDb.parentFile?.mkdirs()
                            // Remove unpopulated internal DB files so external legacy DB + WAL/SHM copy cleanly
                            runCatching { internalDb.delete() }
                            runCatching { File(internalDb.parentFile, "$DB_NAME-shm").delete() }
                            runCatching { File(internalDb.parentFile, "$DB_NAME-wal").delete() }
                            legacyDbFile.copyTo(internalDb, overwrite = true)
                            val legacyShm = File(legacyDbDir, "$DB_NAME-shm")
                            if (legacyShm.exists() && legacyShm.isFile) {
                                legacyShm.copyTo(File(internalDb.parentFile, "$DB_NAME-shm"), overwrite = true)
                            }
                            val legacyWal = File(legacyDbDir, "$DB_NAME-wal")
                            if (legacyWal.exists() && legacyWal.isFile) {
                                legacyWal.copyTo(File(internalDb.parentFile, "$DB_NAME-wal"), overwrite = true)
                            }
                            markerFile?.writeText("migrated")
                        }.onFailure {
                            runCatching { internalDb.delete() }
                            runCatching { File(internalDb.parentFile, "$DB_NAME-shm").delete() }
                            runCatching { File(internalDb.parentFile, "$DB_NAME-wal").delete() }
                        }
                    }
                }
            }
        }

        return Room.databaseBuilder(context, MelonDatabase::class.java, DB_NAME)
            .apply {
                callbacks.forEach {
                    addCallback(it)
                }
            }
            .addMigrations(Migration1to2(), Migration4to5(), Migration5to6(), Migration7to8(), Migration8to9(), Migration9to10())
            .build()
    }

    private fun isInternalDatabaseEmpty(dbFile: File): Boolean {
        if (!dbFile.exists() || dbFile.length() == 0L) return true
        return runCatching {
            SQLiteDatabase.openDatabase(dbFile.absolutePath, null, SQLiteDatabase.OPEN_READONLY).use { db ->
                val tablesToCheck = listOf("game", "cheat_database", "cheat", "play_stats", "ra_game")
                for (table in tablesToCheck) {
                    val tableExists = db.rawQuery(
                        "SELECT 1 FROM sqlite_master WHERE type='table' AND name=?",
                        arrayOf(table),
                    ).use { cursor -> cursor.moveToFirst() }
                    if (tableExists) {
                        val count = db.rawQuery("SELECT COUNT(*) FROM $table", null).use { cursor ->
                            if (cursor.moveToFirst()) cursor.getLong(0) else 0L
                        }
                        if (count > 0L) return@use false
                    }
                }
                true
            }
        }.getOrDefault(true)
    }

    @Provides
    fun provideRAAchievementsDao(database: MelonDatabase): RetroAchievementsDao {
        return NoCacheRetroAchievementsDao(database.achievementsDao())
    }

    @Provides
    fun providePlayStatsDao(database: MelonDatabase): PlayStatsDao {
        return database.playStatsDao()
    }
}

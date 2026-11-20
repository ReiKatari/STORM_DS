package me.magnum.melonds.di

import android.content.Context
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
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

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
        val internalDb = context.getDatabasePath("melon-database")
        if (internalDb != null && !internalDb.exists()) {
            val extRoot = runCatching { android.os.Environment.getExternalStorageDirectory() }.getOrNull()
            if (extRoot != null) {
                val legacyDbDir = java.io.File(java.io.File(extRoot, "STORM DS"), "database")
                val legacyDbFile = java.io.File(legacyDbDir, "melon-database")
                if (legacyDbFile.exists() && legacyDbFile.isFile && legacyDbFile.length() > 0L) {
                    runCatching {
                        internalDb.parentFile?.mkdirs()
                        legacyDbFile.copyTo(internalDb, overwrite = false)
                        val legacyShm = java.io.File(legacyDbDir, "melon-database-shm")
                        if (legacyShm.exists() && legacyShm.isFile) {
                            legacyShm.copyTo(java.io.File(internalDb.parentFile, "melon-database-shm"), overwrite = false)
                        }
                        val legacyWal = java.io.File(legacyDbDir, "melon-database-wal")
                        if (legacyWal.exists() && legacyWal.isFile) {
                            legacyWal.copyTo(java.io.File(internalDb.parentFile, "melon-database-wal"), overwrite = false)
                        }
                    }.onFailure {
                        runCatching { internalDb.delete() }
                    }
                }
            }
        }

        return Room.databaseBuilder(context, MelonDatabase::class.java, "melon-database")
            .apply {
                callbacks.forEach {
                    addCallback(it)
                }
            }
            .addMigrations(Migration1to2(), Migration4to5(), Migration5to6(), Migration7to8(), Migration8to9(), Migration9to10())
            .build()
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

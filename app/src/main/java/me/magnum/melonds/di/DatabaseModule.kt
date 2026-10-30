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
        val rootBase = java.io.File(android.os.Environment.getExternalStorageDirectory(), "STORM DS")
        val dbDir = java.io.File(rootBase, "database").apply { mkdirs() }
        val dbFile = java.io.File(dbDir, "melon-database")

        // Migrate existing database from internal storage if it exists and external does not yet
        val internalDb = context.getDatabasePath("melon-database")
        if (internalDb != null && internalDb.exists() && !dbFile.exists()) {
            runCatching {
                internalDb.copyTo(dbFile, overwrite = false)
                val shm = java.io.File(internalDb.parentFile, "melon-database-shm")
                if (shm.exists()) shm.copyTo(java.io.File(dbDir, "melon-database-shm"), overwrite = false)
                val wal = java.io.File(internalDb.parentFile, "melon-database-wal")
                if (wal.exists()) wal.copyTo(java.io.File(dbDir, "melon-database-wal"), overwrite = false)
            }
        }

        val dbPath = if (dbDir.exists() && (dbDir.canWrite() || rootBase.canWrite())) {
            dbFile.absolutePath
        } else {
            "melon-database"
        }

        return Room.databaseBuilder(context, MelonDatabase::class.java, dbPath)
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

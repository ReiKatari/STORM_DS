package me.magnum.melonds.di

import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import me.magnum.melonds.domain.repositories.UpdatesRepository
import me.magnum.melonds.domain.services.UpdateInstallManager
import me.magnum.melonds.github.services.GitHubUpdateInstallManager
import me.magnum.melonds.playstore.PlayStoreUpdatesRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object PlayStoreModule {
    @Provides
    @Singleton
    fun provideUpdatesRepository(
        @ApplicationContext context: Context,
        sharedPreferences: SharedPreferences,
    ): UpdatesRepository {
        val statePreferences = context.getSharedPreferences("preferences-github", Context.MODE_PRIVATE)
        return PlayStoreUpdatesRepository(context, sharedPreferences, statePreferences)
    }

    @Provides
    @Singleton
    fun provideUpdateInstallManager(@ApplicationContext context: Context): UpdateInstallManager {
        return GitHubUpdateInstallManager(context)
    }
}

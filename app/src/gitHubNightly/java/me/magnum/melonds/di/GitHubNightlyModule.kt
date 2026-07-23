package me.magnum.melonds.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import me.magnum.melonds.domain.repositories.UpdatesRepository
import me.magnum.melonds.github.GitHubApi
import me.magnum.melonds.github.repositories.GitHubNightlyUpdatesRepository
import javax.inject.Singleton
import android.content.SharedPreferences

@Module
@InstallIn(SingletonComponent::class)
object GitHubNightlyModule {

    @Provides
    @Singleton
    fun provideUpdatesRepository(
        @ApplicationContext context: Context,
        gitHubApi: GitHubApi,
        sharedPreferences: SharedPreferences,
    ): UpdatesRepository {
        val statePreferences = context.getSharedPreferences("preferences-github", Context.MODE_PRIVATE)
        return GitHubNightlyUpdatesRepository(gitHubApi, sharedPreferences, statePreferences)
    }
}

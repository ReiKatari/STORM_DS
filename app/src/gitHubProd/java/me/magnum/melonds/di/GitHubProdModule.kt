package me.magnum.melonds.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import me.magnum.melonds.domain.repositories.UpdatesRepository
import me.magnum.melonds.github.GitHubApi
import me.magnum.melonds.github.repositories.GitHubProdUpdatesRepository
import javax.inject.Singleton
import android.content.SharedPreferences

@Module
@InstallIn(SingletonComponent::class)
object GitHubProdModule {

    @Provides
    @Singleton
    fun provideUpdatesRepository(
        @ApplicationContext context: Context,
        gitHubApi: GitHubApi,
        sharedPreferences: SharedPreferences,
    ): UpdatesRepository {
        val statePreferences = context.getSharedPreferences("preferences-github", Context.MODE_PRIVATE)
        return GitHubProdUpdatesRepository(context, gitHubApi, sharedPreferences, statePreferences)
    }
}

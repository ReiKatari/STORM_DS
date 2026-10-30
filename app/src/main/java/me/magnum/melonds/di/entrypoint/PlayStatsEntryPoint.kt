package me.magnum.melonds.di.entrypoint

import android.content.Context
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.android.EntryPointAccessors
import dagger.hilt.components.SingletonComponent
import me.magnum.melonds.database.MelonDatabase

@EntryPoint
@InstallIn(SingletonComponent::class)
interface PlayStatsEntryPoint {
    fun database(): MelonDatabase

    companion object {
        fun resolve(context: Context): PlayStatsEntryPoint {
            val applicationContext = context.applicationContext ?: throw IllegalStateException()
            return EntryPointAccessors.fromApplication(
                context = applicationContext,
                entryPoint = PlayStatsEntryPoint::class.java,
            )
        }
    }
}

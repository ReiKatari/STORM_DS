package me.magnum.melonds.di.entrypoint

import android.content.Context
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.android.EntryPointAccessors
import dagger.hilt.components.SingletonComponent
import me.magnum.melonds.domain.repositories.CheatsRepository

@EntryPoint
@InstallIn(SingletonComponent::class)
interface CheatsEntryPoint {
    fun cheatsRepository(): CheatsRepository

    companion object {
        fun resolve(context: Context): CheatsEntryPoint {
            val applicationContext = context.applicationContext ?: throw IllegalStateException()
            return EntryPointAccessors.fromApplication(
                context = applicationContext,
                entryPoint = CheatsEntryPoint::class.java
            )
        }
    }
}

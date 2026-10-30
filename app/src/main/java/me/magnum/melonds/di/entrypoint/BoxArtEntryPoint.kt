package me.magnum.melonds.di.entrypoint

import android.content.Context
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.android.EntryPointAccessors
import dagger.hilt.components.SingletonComponent
import me.magnum.melonds.ui.romlist.boxart.BoxArtRepository

@EntryPoint
@InstallIn(SingletonComponent::class)
interface BoxArtEntryPoint {
    fun boxArtRepository(): BoxArtRepository

    companion object {
        fun resolve(context: Context): BoxArtEntryPoint {
            val applicationContext = context.applicationContext ?: throw IllegalStateException()
            return EntryPointAccessors.fromApplication(
                context = applicationContext,
                entryPoint = BoxArtEntryPoint::class.java,
            )
        }
    }
}

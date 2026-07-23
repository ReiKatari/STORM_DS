package me.magnum.melonds.di

import android.content.Context
import coil.ImageLoader
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import me.magnum.melonds.impl.BackgroundThumbnailProvider
import me.magnum.melonds.impl.RomIconProvider
import me.magnum.melonds.impl.image.CoilBackgroundThumbnailFetcher
import me.magnum.melonds.impl.image.CoilRomIconFetcher
import me.magnum.melonds.impl.image.CoilURLMapper
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object CoilModule {

    @Provides
    fun provideBackgroundThumbnailFetcher(backgroundThumbnailProvider: BackgroundThumbnailProvider): CoilBackgroundThumbnailFetcher.Factory {
        return CoilBackgroundThumbnailFetcher.Factory(backgroundThumbnailProvider)
    }

    @Provides
    fun provideRomIconFetcher(romIconProvider: RomIconProvider): CoilRomIconFetcher.Factory {
        return CoilRomIconFetcher.Factory(romIconProvider)
    }

    @Provides
    @Singleton
    fun provideCoilImageLoader(
        @ApplicationContext context: Context,
        coilBackgroundThumbnailFetcherFactory: CoilBackgroundThumbnailFetcher.Factory,
        coilRomIconFetcherFactory: CoilRomIconFetcher.Factory,
    ): ImageLoader {
        return ImageLoader.Builder(context)
            .components {
                add(CoilURLMapper())
                add(coilBackgroundThumbnailFetcherFactory)
                add(coilRomIconFetcherFactory)
            }
            .memoryCache {
                coil.memory.MemoryCache.Builder(context)
                    .maxSizePercent(0.25)
                    .build()
            }
            .diskCache {
                coil.disk.DiskCache.Builder()
                    .directory(context.cacheDir.resolve("image_cache"))
                    .maxSizeBytes(96L * 1024 * 1024)
                    .build()
            }
            .crossfade(true)
            .build()
    }
}
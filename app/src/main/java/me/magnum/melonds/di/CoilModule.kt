package me.magnum.melonds.di

import android.content.Context
import android.os.Environment
import coil.ImageLoader
import coil.disk.DiskCache
import coil.memory.MemoryCache
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
import okhttp3.OkHttpClient
import java.io.File
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object CoilModule {

    @Volatile
    private var activeDiskCacheDir: File? = null

    fun isLiveDiskCacheAt(dir: File): Boolean {
        val active = activeDiskCacheDir ?: return false
        return runCatching { active.canonicalPath == dir.canonicalPath }
            .getOrDefault(active.absolutePath == dir.absolutePath)
    }

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
        okHttpClient: OkHttpClient,
        coilBackgroundThumbnailFetcherFactory: CoilBackgroundThumbnailFetcher.Factory,
        coilRomIconFetcherFactory: CoilRomIconFetcher.Factory,
    ): ImageLoader {
        return ImageLoader.Builder(context)
            .components {
                add(CoilURLMapper())
                add(coilBackgroundThumbnailFetcherFactory, me.magnum.melonds.domain.model.Background::class.java)
                add(coilRomIconFetcherFactory, me.magnum.melonds.domain.model.rom.Rom::class.java)
            }
            .memoryCache {
                MemoryCache.Builder(context)
                    .maxSizePercent(0.25)
                    .build()
            }
            .diskCache {
                val externalCoversCache = File(Environment.getExternalStorageDirectory(), "STORM DS/cache/covers_cache")
                val targetDir = if (isDirectoryWritable(externalCoversCache)) {
                    externalCoversCache
                } else {
                    File(context.cacheDir, "covers_cache").apply { mkdirs() }
                }
                activeDiskCacheDir = targetDir
                DiskCache.Builder()
                    .directory(targetDir)
                    .maxSizeBytes(256L * 1024 * 1024)
                    .build()
            }
            .okHttpClient {
                okHttpClient.newBuilder()
                    .connectTimeout(6, TimeUnit.SECONDS)
                    .readTimeout(10, TimeUnit.SECONDS)
                    .callTimeout(20, TimeUnit.SECONDS)
                    .retryOnConnectionFailure(false)
                    .build()
            }
            // Box art never changes: reuse the disk copy without revalidating it over the network.
            .respectCacheHeaders(false)
            .crossfade(true)
            .build()
    }

    private fun isDirectoryWritable(dir: File): Boolean {
        return runCatching {
            if (!dir.exists() && !dir.mkdirs()) return@runCatching false
            if (!dir.isDirectory || !dir.canWrite()) return@runCatching false
            val probe = File.createTempFile(".storm_write_probe_", null, dir)
            probe.delete()
            true
        }.getOrDefault(false)
    }
}
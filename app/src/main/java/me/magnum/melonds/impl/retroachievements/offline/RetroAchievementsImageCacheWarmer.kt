package me.magnum.melonds.impl.retroachievements.offline

import android.content.Context
import coil.imageLoader
import coil.request.CachePolicy
import coil.request.ImageRequest
import coil.size.Size
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RetroAchievementsImageCacheWarmer @Inject constructor(
    @ApplicationContext private val context: Context,
) {

    /**
     * Best-effort: prefetches images into Coil's disk cache so they can be shown while offline.
     *
     * This does not guarantee the images will be available forever (OS may clear cache), but it
     * improves the offline UX for achievement popups and lists.
     */
    suspend fun warm(urls: Collection<String>) = withContext(Dispatchers.IO) {
        val imageLoader = context.imageLoader
        urls.asSequence()
            .map { it.trim() }
            .filter { it.isNotEmpty() }
            .distinct()
            .forEach { url ->
                val request = ImageRequest.Builder(context)
                    .data(url)
                    .diskCachePolicy(CachePolicy.ENABLED)
                    .memoryCachePolicy(CachePolicy.DISABLED)
                    .size(Size.ORIGINAL)
                    .build()
                imageLoader.enqueue(request)
            }
    }
}


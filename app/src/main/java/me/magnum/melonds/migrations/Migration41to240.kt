package me.magnum.melonds.migrations

import android.content.Context
import android.content.SharedPreferences
import androidx.core.content.edit
import java.io.File

class Migration41to240(
    private val context: Context,
    private val sharedPreferences: SharedPreferences,
) : Migration {

    override val from = 41
    override val to = 240

    override fun migrate() {
        runCatching {
            File(context.cacheDir, "installed_dsiware").deleteRecursively()
        }

        sharedPreferences.edit {
            val currentRenderer = sharedPreferences.getString("video_renderer", null)
            if (currentRenderer == null || currentRenderer == "software") {
                putString("video_renderer", "opengl")
            }

            val currentRes = sharedPreferences.getString("video_internal_resolution", null)
            if (currentRes == null || currentRes == "1") {
                putString("video_internal_resolution", "2")
            }

            val currentFilter = sharedPreferences.getString("video_filtering", null)
            if (currentFilter == null || currentFilter == "none" || currentFilter == "linear") {
                putString("video_filtering", "quilez")
            }
        }
    }
}

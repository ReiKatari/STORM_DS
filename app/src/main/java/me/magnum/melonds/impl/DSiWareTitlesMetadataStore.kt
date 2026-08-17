package me.magnum.melonds.impl

import android.content.Context
import android.content.SharedPreferences
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DSiWareTitlesMetadataStore @Inject constructor(
    @ApplicationContext private val context: Context,
) {
    private val prefs: SharedPreferences by lazy {
        context.getSharedPreferences("dsiware_titles_meta", Context.MODE_PRIVATE)
    }

    fun getDisplayName(titleId: Long, defaultName: String): String {
        val titleIdHex = (titleId and 0xFFFFFFFFL).toString(16).padStart(8, '0').lowercase()
        val custom = getCustomName(titleIdHex)
        if (!custom.isNullOrBlank()) return custom
        val originalFile = getOriginalFileName(titleIdHex)
        if (!originalFile.isNullOrBlank()) return originalFile
        return defaultName
    }

    fun getCustomName(titleIdHex: String): String? {
        return prefs.getString("custom_name_${titleIdHex.lowercase()}", null)?.takeIf { it.isNotBlank() }
    }

    fun setCustomName(titleId: Long, customName: String?) {
        val titleIdHex = (titleId and 0xFFFFFFFFL).toString(16).padStart(8, '0').lowercase()
        prefs.edit().apply {
            if (customName.isNullOrBlank()) {
                remove("custom_name_$titleIdHex")
            } else {
                putString("custom_name_$titleIdHex", customName.trim())
            }
        }.apply()
    }

    fun getOriginalFileName(titleIdHex: String): String? {
        return prefs.getString("file_name_${titleIdHex.lowercase()}", null)?.takeIf { it.isNotBlank() }
    }

    fun setOriginalFileName(titleId: Long, fileName: String?) {
        val titleIdHex = (titleId and 0xFFFFFFFFL).toString(16).padStart(8, '0').lowercase()
        prefs.edit().apply {
            if (fileName.isNullOrBlank()) {
                remove("file_name_$titleIdHex")
            } else {
                putString("file_name_$titleIdHex", fileName.trim())
            }
        }.apply()
    }

    fun getRaHash(titleIdHex: String): String? {
        return prefs.getString("ra_hash_${titleIdHex.lowercase()}", null)?.takeIf { it.isNotBlank() }
    }

    fun setRaHash(titleId: Long, raHash: String?) {
        val titleIdHex = (titleId and 0xFFFFFFFFL).toString(16).padStart(8, '0').lowercase()
        prefs.edit().apply {
            if (raHash.isNullOrBlank()) {
                remove("ra_hash_$titleIdHex")
            } else {
                putString("ra_hash_$titleIdHex", raHash.trim())
            }
        }.apply()
    }
}

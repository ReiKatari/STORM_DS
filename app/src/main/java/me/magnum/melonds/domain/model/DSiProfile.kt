package me.magnum.melonds.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.Serializable

@Parcelize
@Serializable
data class DSiProfile(val id: String, val name: String, val directoryUri: String) : Parcelable

@Serializable
data class DSiProfileSettings(
    val profiles: List<DSiProfile> = emptyList(),
    val defaultProfileId: String? = null,
) {
    fun resolve(profileId: String? = null): DSiProfile? = profiles.find { it.id == (profileId ?: defaultProfileId) }

    fun without(profileId: String) = copy(
        profiles = profiles.filterNot { it.id == profileId },
        defaultProfileId = defaultProfileId.takeUnless { it == profileId },
    )
}

package me.magnum.melonds.common.retroachievements

import android.content.SharedPreferences
import androidx.core.content.edit
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withContext
import me.magnum.rcheevosapi.RAUserProfileStore
import me.magnum.rcheevosapi.model.RAUserProfile

class AndroidRAUserProfileStore(private val sharedPreferences: SharedPreferences) : RAUserProfileStore {

    private val profileMutex = Mutex()
    private val profileFlow = MutableStateFlow(readProfile())

    private companion object {
        const val USERNAME_KEY = "ra_profile_username"
        const val SCORE_KEY = "ra_profile_score"
        const val SOFTCORE_SCORE_KEY = "ra_profile_softcore_score"
    }

    override fun observeUserProfile() = profileFlow.asStateFlow()

    override suspend fun getUserProfile(): RAUserProfile? = withContext(Dispatchers.IO) {
        profileMutex.withLock { readProfile() }
    }

    override suspend fun storeUserProfile(profile: RAUserProfile) = withContext(Dispatchers.IO) {
        profileMutex.withLock {
            writeProfile(profile)
        }
    }

    override suspend fun updateUserScores(
        username: String,
        score: Long,
        softcoreScore: Long,
    ) = withContext(Dispatchers.IO) {
        profileMutex.withLock {
            val currentProfile = readProfile()
            if (currentProfile?.username != username) {
                return@withLock
            }

            writeProfile(currentProfile.copy(score = score, softcoreScore = softcoreScore))
        }
    }

    override suspend fun clearUserProfile() = withContext(Dispatchers.IO) {
        profileMutex.withLock {
            sharedPreferences.edit {
                remove(USERNAME_KEY)
                remove(SCORE_KEY)
                remove(SOFTCORE_SCORE_KEY)
            }
            profileFlow.value = null
        }
    }

    private fun writeProfile(profile: RAUserProfile) {
        sharedPreferences.edit {
            putString(USERNAME_KEY, profile.username)
            putLong(SCORE_KEY, profile.score)
            putLong(SOFTCORE_SCORE_KEY, profile.softcoreScore)
        }
        profileFlow.value = profile
    }

    private fun readProfile(): RAUserProfile? {
        val username = sharedPreferences.getString(USERNAME_KEY, null) ?: return null
        return RAUserProfile(
            username = username,
            score = sharedPreferences.getLong(SCORE_KEY, 0),
            softcoreScore = sharedPreferences.getLong(SOFTCORE_SCORE_KEY, 0),
        )
    }
}

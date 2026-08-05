package me.magnum.rcheevosapi

import kotlinx.coroutines.flow.Flow
import me.magnum.rcheevosapi.model.RAUserProfile

interface RAUserProfileStore {
    fun observeUserProfile(): Flow<RAUserProfile?>
    suspend fun getUserProfile(): RAUserProfile?
    suspend fun storeUserProfile(profile: RAUserProfile)

    suspend fun updateUserScores(username: String, score: Long, softcoreScore: Long)
    suspend fun clearUserProfile()
}

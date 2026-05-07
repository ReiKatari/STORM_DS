package me.magnum.rcheevosapi

import me.magnum.rcheevosapi.model.RAUserAuth

interface RAUserAuthStore {
    suspend fun storeUserAuth(userAuth: RAUserAuth.Authenticated)
    suspend fun getUserAuth(): RAUserAuth?
    suspend fun clearUserAuth()
    suspend fun clearUserToken()
}
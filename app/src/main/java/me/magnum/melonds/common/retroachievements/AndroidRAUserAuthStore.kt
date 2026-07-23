package me.magnum.melonds.common.retroachievements

import android.content.SharedPreferences
import androidx.core.content.edit
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withContext
import me.magnum.rcheevosapi.RAUserAuthStore
import me.magnum.rcheevosapi.model.RAUserAuth

class AndroidRAUserAuthStore(private val sharedPreferences: SharedPreferences) : RAUserAuthStore {

    private val authMutex = Mutex()

    private companion object {
        const val USERNAME_KEY = "ra_username"
        const val TOKEN_KEY = "ra_token"
    }

    override suspend fun storeUserAuth(userAuth: RAUserAuth.Authenticated) = withContext(Dispatchers.IO) {
        authMutex.withLock {
            sharedPreferences.edit {
                putString(USERNAME_KEY, userAuth.username)
                putString(TOKEN_KEY, userAuth.token)
            }
        }
    }

    override suspend fun getUserAuth(): RAUserAuth? = withContext(Dispatchers.IO) {
        authMutex.withLock {
            val username = sharedPreferences.getString(USERNAME_KEY, null) ?: return@withLock null
            val token = sharedPreferences.getString(TOKEN_KEY, null)
                ?: return@withLock RAUserAuth.AuthenticationExpired(username)

            RAUserAuth.Authenticated(username, token)
        }
    }

    override suspend fun clearUserAuth() = withContext(Dispatchers.IO) {
        authMutex.withLock {
            sharedPreferences.edit {
                remove(USERNAME_KEY)
                remove(TOKEN_KEY)
            }
        }
    }

    override suspend fun clearUserAuthIfMatches(
        expectedUsername: String,
        expectedToken: String,
    ): Boolean = withContext(Dispatchers.IO) {
        authMutex.withLock {
            val currentUsername = sharedPreferences.getString(USERNAME_KEY, null)
            val currentToken = sharedPreferences.getString(TOKEN_KEY, null)
            if (currentUsername != expectedUsername || currentToken != expectedToken) {
                return@withLock false
            }

            sharedPreferences.edit {
                remove(USERNAME_KEY)
                remove(TOKEN_KEY)
            }
            true
        }
    }

    override suspend fun clearUserTokenIfMatches(
        expectedUsername: String,
        expectedToken: String,
    ): Boolean = withContext(Dispatchers.IO) {
        authMutex.withLock {
            val currentUsername = sharedPreferences.getString(USERNAME_KEY, null)
            val currentToken = sharedPreferences.getString(TOKEN_KEY, null)
            if (currentUsername != expectedUsername || currentToken != expectedToken) {
                return@withLock false
            }

            sharedPreferences.edit {
                remove(TOKEN_KEY)
            }
            true
        }
    }
}

package me.magnum.rcheevosapi.model

sealed class RAUserAuth {
    data class Authenticated(
        val username: String,
        val token: String,
    ) : RAUserAuth()

    data class AuthenticationExpired(val username: String) : RAUserAuth()
}
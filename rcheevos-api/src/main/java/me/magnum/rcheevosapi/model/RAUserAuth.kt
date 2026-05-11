package me.magnum.rcheevosapi.model

sealed class RAUserAuth {
    abstract val username: String

    data class Authenticated(
        override val username: String,
        val token: String,
    ) : RAUserAuth()

    data class AuthenticationExpired(override val username: String) : RAUserAuth()
}

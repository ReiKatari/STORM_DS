package me.magnum.melonds.ui.emulator.component

import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.NonCancellable
import kotlinx.coroutines.withContext

data class RaInGameLogoutDiscardSummary(
    val expectedNativeSubmissions: Int,
    val confirmedNativeSubmissions: Int?,
    val confirmedKotlinAchievements: Int? = 0,
)

enum class RaInGameLogoutFailureStage {
    TRANSPORT_SUSPENSION,
    IDENTITY_VERIFICATION,
    PENDING_VERIFICATION,
    TERMINAL_COMMIT,
    NATIVE_DISCARD,
    KOTLIN_DISCARD,
    RUNTIME_TERMINATION,
    AUTHENTICATION_CLEAR,
    SESSION_CLOSE,
}

data class RaInGameLogoutCommitFailure(
    val stage: RaInGameLogoutFailureStage,
    val errorType: String? = null,
)

sealed interface RaInGameLogoutResult {
    data class PreflightFailed(
        val stage: RaInGameLogoutFailureStage,
        val errorType: String? = null,
    ) : RaInGameLogoutResult

    data class Committed(
        val discarded: RaInGameLogoutDiscardSummary,
        val authenticationCleared: Boolean,
        val failures: List<RaInGameLogoutCommitFailure>,
    ) : RaInGameLogoutResult
}

class RaInGameLogoutCoordinator(
    private val suspendSubmissionTransport: suspend () -> Unit,
    private val runtimeIdentityMatches: suspend () -> Boolean,
    private val preparePendingSubmissionIds: suspend () -> List<Long>?,
    private val beginTerminalCommit: () -> Unit,
    private val discardPendingSubmissions: suspend (List<Long>) -> Int,
    private val discardKotlinPendingAchievements: suspend () -> Int = { 0 },
    private val terminateRuntime: () -> Unit,
    private val clearAuthenticationIfMatches: suspend () -> Boolean,
    private val closeSession: () -> Unit,
) {
    suspend fun execute(): RaInGameLogoutResult {
        try {
            suspendSubmissionTransport()
        } catch (cancellation: CancellationException) {
            throw cancellation
        } catch (throwable: Throwable) {
            return RaInGameLogoutResult.PreflightFailed(
                stage = RaInGameLogoutFailureStage.TRANSPORT_SUSPENSION,
                errorType = throwable.javaClass.simpleName,
            )
        }

        val identityMatches = try {
            runtimeIdentityMatches()
        } catch (cancellation: CancellationException) {
            throw cancellation
        } catch (throwable: Throwable) {
            return RaInGameLogoutResult.PreflightFailed(
                stage = RaInGameLogoutFailureStage.IDENTITY_VERIFICATION,
                errorType = throwable.javaClass.simpleName,
            )
        }
        if (!identityMatches) {
            return RaInGameLogoutResult.PreflightFailed(
                stage = RaInGameLogoutFailureStage.IDENTITY_VERIFICATION,
            )
        }

        val expectedSubmissionIds = try {
            preparePendingSubmissionIds()
        } catch (cancellation: CancellationException) {
            throw cancellation
        } catch (throwable: Throwable) {
            return RaInGameLogoutResult.PreflightFailed(
                stage = RaInGameLogoutFailureStage.PENDING_VERIFICATION,
                errorType = throwable.javaClass.simpleName,
            )
        } ?: return RaInGameLogoutResult.PreflightFailed(
            stage = RaInGameLogoutFailureStage.PENDING_VERIFICATION,
        )

        return withContext(NonCancellable) {
            val failures = mutableListOf<RaInGameLogoutCommitFailure>()
            try {
                beginTerminalCommit()
            } catch (throwable: Throwable) {
                failures += RaInGameLogoutCommitFailure(
                    stage = RaInGameLogoutFailureStage.TERMINAL_COMMIT,
                    errorType = throwable.javaClass.simpleName,
                )
            }

            val confirmedNativeSubmissions = try {
                discardPendingSubmissions(expectedSubmissionIds)
            } catch (throwable: Throwable) {
                failures += RaInGameLogoutCommitFailure(
                    stage = RaInGameLogoutFailureStage.NATIVE_DISCARD,
                    errorType = throwable.javaClass.simpleName,
                )
                null
            }
            if (
                confirmedNativeSubmissions != null &&
                confirmedNativeSubmissions != expectedSubmissionIds.size
            ) {
                failures += RaInGameLogoutCommitFailure(
                    stage = RaInGameLogoutFailureStage.NATIVE_DISCARD,
                )
            }

            val confirmedKotlinAchievements = try {
                discardKotlinPendingAchievements()
            } catch (throwable: Throwable) {
                failures += RaInGameLogoutCommitFailure(
                    stage = RaInGameLogoutFailureStage.KOTLIN_DISCARD,
                    errorType = throwable.javaClass.simpleName,
                )
                null
            }

            try {
                terminateRuntime()
            } catch (throwable: Throwable) {
                failures += RaInGameLogoutCommitFailure(
                    stage = RaInGameLogoutFailureStage.RUNTIME_TERMINATION,
                    errorType = throwable.javaClass.simpleName,
                )
            }

            val authenticationCleared = try {
                clearAuthenticationIfMatches().also { cleared ->
                    if (!cleared) {
                        failures += RaInGameLogoutCommitFailure(
                            stage = RaInGameLogoutFailureStage.AUTHENTICATION_CLEAR,
                        )
                    }
                }
            } catch (throwable: Throwable) {
                failures += RaInGameLogoutCommitFailure(
                    stage = RaInGameLogoutFailureStage.AUTHENTICATION_CLEAR,
                    errorType = throwable.javaClass.simpleName,
                )
                false
            }

            try {
                closeSession()
            } catch (throwable: Throwable) {
                failures += RaInGameLogoutCommitFailure(
                    stage = RaInGameLogoutFailureStage.SESSION_CLOSE,
                    errorType = throwable.javaClass.simpleName,
                )
            }

            RaInGameLogoutResult.Committed(
                discarded = RaInGameLogoutDiscardSummary(
                    expectedNativeSubmissions = expectedSubmissionIds.size,
                    confirmedNativeSubmissions = confirmedNativeSubmissions,
                    confirmedKotlinAchievements = confirmedKotlinAchievements,
                ),
                authenticationCleared = authenticationCleared,
                failures = failures.distinctBy { it.stage },
            )
        }
    }
}

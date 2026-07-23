package me.magnum.melonds.ui.emulator.ui

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.animate
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.displayCutoutPadding
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.mapNotNull
import kotlinx.coroutines.flow.merge
import me.magnum.melonds.extensions.removeFirst
import me.magnum.melonds.ui.emulator.EmulatorViewModel
import me.magnum.melonds.ui.emulator.model.PopupEvent
import me.magnum.melonds.ui.emulator.model.RAEventUi
import me.magnum.melonds.ui.emulator.ui.AchievementInfo.AchievementPrimed
import me.magnum.melonds.ui.emulator.ui.AchievementInfo.AchievementProgress
import me.magnum.melonds.ui.emulator.ui.info.AchievementInfoState
import me.magnum.melonds.ui.emulator.ui.info.AchievementProgressUi
import me.magnum.melonds.ui.emulator.ui.info.ChallengeResultUi
import me.magnum.melonds.ui.emulator.ui.info.LeaderboardAttemptUi
import me.magnum.melonds.ui.emulator.ui.info.LeaderboardAttemptResultUi
import me.magnum.melonds.ui.emulator.ui.info.LeaderboardEntrySubmissionUi
import me.magnum.melonds.ui.emulator.ui.info.LeaderboardSubmissionPendingUi
import me.magnum.melonds.ui.emulator.component.LeaderboardAttemptKey
import me.magnum.melonds.ui.emulator.ui.info.PrimedAchievementUi
import me.magnum.melonds.ui.emulator.ui.info.ServerCommunicationFailedUi
import me.magnum.melonds.ui.emulator.ui.popup.AchievementPopupUi
import me.magnum.melonds.ui.emulator.ui.popup.GameMasteredPopupUi
import me.magnum.melonds.ui.emulator.ui.popup.RAIntegrationEventUi
import me.magnum.rcheevosapi.model.RAAchievement
import me.magnum.rcheevosapi.model.RALeaderboard
import java.net.URL

@Composable
fun AchievementUpdatesUi(
    viewModel: EmulatorViewModel,
) {
    val popupEventFlow = remember(viewModel) {
        val achievementsFlow = viewModel.achievementsEvent.mapNotNull {
            when (it) {
                is RAEventUi.AchievementTriggered -> PopupEvent.AchievementUnlockPopup(it.achievement)
                is RAEventUi.GameMastered -> PopupEvent.GameMasteredPopup(it)
                else -> null
            }
        }
        val integrationFlow = viewModel.integrationEvent.map { PopupEvent.RAIntegrationPopup(it) }
        merge(achievementsFlow, integrationFlow)
    }

    Box(Modifier.fillMaxWidth().displayCutoutPadding()) {
        AchievementUpdatesList(
            modifier = Modifier.align(Alignment.TopStart).wrapContentSize(),
            achievementEventFlow = viewModel.achievementsEvent,
        )

        MainAchievementPopup(
            modifier = Modifier.fillMaxWidth(),
            popupEventFlow = popupEventFlow,
        )
    }
}

@Composable
private fun MainAchievementPopup(
    modifier: Modifier = Modifier,
    popupEventFlow: Flow<PopupEvent>,
) {
    var popupEvent by remember {
        mutableStateOf<PopupEvent?>(null)
    }
    var popupOffset by remember {
        mutableFloatStateOf(-1f)
    }
    var popupHeight by remember {
        mutableStateOf<Int?>(null)
    }

    LaunchedEffect(popupEventFlow) {
        popupEventFlow.collect {
            popupEvent = it
            animate(
                initialValue = -1f,
                targetValue = 0f,
                animationSpec = tween(easing = LinearEasing),
            ) { value, _ ->
                popupOffset = value
            }
            delay(5500)
            animate(
                initialValue = 0f,
                targetValue = -1f,
                animationSpec = tween(easing = LinearEasing),
            ) { value, _ ->
                popupOffset = value
            }
            popupEvent = null
        }
    }

    Box(modifier) {
        val currentPopupEvent = popupEvent
        val modifier = Modifier
            .align(Alignment.TopCenter)
            .offset {
                val y = (popupOffset * (popupHeight ?: Int.MAX_VALUE)).dp
                IntOffset(0, y.roundToPx())
            }
            .onSizeChanged { popupHeight = it.height }

        when (currentPopupEvent) {
            is PopupEvent.AchievementUnlockPopup -> {
                AchievementPopupUi(
                    modifier = modifier,
                    achievement = currentPopupEvent.achievement,
                )
            }
            is PopupEvent.RAIntegrationPopup -> {
                RAIntegrationEventUi(
                    modifier = modifier,
                    event = currentPopupEvent.event,
                )
            }
            is PopupEvent.GameMasteredPopup ->{
                GameMasteredPopupUi(
                    modifier = modifier,
                    masteryEvent = currentPopupEvent.event,
                )
            }
            null -> {
                // Do nothing
            }
        }
    }
}

@Composable
private fun AchievementUpdatesList(
    modifier: Modifier = Modifier,
    achievementEventFlow: Flow<RAEventUi>,
) {
    val listState = remember { AchievementUpdatesListState() }

    LaunchedEffect(achievementEventFlow) {
        achievementEventFlow.collect { event ->
            listState.handleEvent(event)
        }
    }

    LazyColumn(modifier) {
        items(
            items = listState.visibleInfos,
            key = {
                when (it) {
                    is AchievementPrimed -> "primed-${it.uiInstanceId}"
                    is AchievementProgress -> "progress-${it.uiInstanceId}"
                    is AchievementInfo.LeaderboardAttempt -> "leaderboard-attempt-${it.uiInstanceId}"
                    is AchievementInfo.LeaderboardAttemptResult -> "leaderboard-result-${it.uiInstanceId}"
                    is AchievementInfo.LeaderboardSubmissionPending -> "leaderboard-pending-${it.uiInstanceId}"
                    is AchievementInfo.LeaderboardEntrySubmitted -> "leaderboard-${it.uiInstanceId}"
                    is AchievementInfo.ChallengeResult -> "challenge-result-${it.uiInstanceId}"
                    is AchievementInfo.ServerCommunicationFailed -> "server-error-${it.uiInstanceId}"
                }
            },
        ) { info ->
            when (info) {
                is AchievementPrimed -> PrimedAchievementUi(info)
                is AchievementProgress -> AchievementProgressUi(info)
                is AchievementInfo.LeaderboardAttempt -> LeaderboardAttemptUi(info)
                is AchievementInfo.LeaderboardAttemptResult -> LeaderboardAttemptResultUi(info)
                is AchievementInfo.LeaderboardSubmissionPending -> LeaderboardSubmissionPendingUi(info)
                is AchievementInfo.LeaderboardEntrySubmitted -> LeaderboardEntrySubmissionUi(info)
                is AchievementInfo.ChallengeResult -> ChallengeResultUi(info)
                is AchievementInfo.ServerCommunicationFailed -> ServerCommunicationFailedUi(info)
            }
        }
    }
}

internal class AchievementUpdatesListState {

    val visibleInfos = mutableStateListOf<AchievementInfo>()
    private val completedChallengeIds = mutableSetOf<Long>()
    private var nextInfoInstanceId = 0L

    fun handleEvent(event: RAEventUi) {
        when (event) {
            RAEventUi.Reset -> handleReset()
            is RAEventUi.AchievementPrimed -> handleAchievementPrimed(event)
            is RAEventUi.AchievementUnPrimed -> handleAchievementUnPrimed(event)
            is RAEventUi.AchievementTriggered -> handleAchievementTriggered(event)
            is RAEventUi.AchievementTriggerError -> handleAchievementTriggerError(event)
            is RAEventUi.AchievementProgressUpdated -> handleProgressUpdated(event)
            is RAEventUi.AchievementProgressHidden -> handleAchievementProgressHidden(event)
            is RAEventUi.LeaderboardAttemptStarted -> handleLeaderboardAttemptStarted(event)
            is RAEventUi.LeaderboardAttemptUpdated -> handleLeaderboardAttemptUpdated(event)
            is RAEventUi.LeaderboardSubmissionPending -> handleLeaderboardSubmissionPending(event)
            is RAEventUi.LeaderboardEntrySubmitted -> handleLeaderboardEntrySubmitted(event)
            is RAEventUi.LeaderboardEntrySubmitError -> handleLeaderboardEntrySubmitError(event)
            is RAEventUi.LeaderboardAttemptCancelled -> handleLeaderboardAttemptCancelled(event)
            is RAEventUi.LeaderboardTrackerHidden -> handleLeaderboardTrackerHidden(event)
            RAEventUi.PendingDataSubmitted -> handlePendingDataSubmitted()
            is RAEventUi.GameMastered -> { /* no-op */ }
        }
    }

    private fun handleReset() {
        completedChallengeIds.clear()
        visibleInfos.forEach {
            if (it !is AchievementInfo.ServerCommunicationFailed || !it.willRetryInBackground) {
                it.state.dismiss()
            }
        }
    }

    private fun handleAchievementPrimed(event: RAEventUi.AchievementPrimed) {
        val existingPrimedAchievementIndex = visibleInfos.indexOfFirst { (it as? AchievementPrimed)?.achievement?.id == event.achievement.id }

        if (existingPrimedAchievementIndex != -1) {
            // Primed achievement already being displayed. Ensure it's kept shown in case it's being dismissed
            visibleInfos[existingPrimedAchievementIndex].state.show()
        } else {
            val state = AchievementInfoState {
                visibleInfos.removeFirst { (it as? AchievementPrimed)?.achievement?.id == event.achievement.id }
            }
            visibleInfos.add(0, AchievementPrimed(event.achievement, state, nextUiInstanceId()))
        }
    }

    private fun handleAchievementUnPrimed(event: RAEventUi.AchievementUnPrimed) {
        val primedInfo = visibleInfos.firstOrNull { (it as? AchievementPrimed)?.achievement?.id == event.achievement.id }
        if (completedChallengeIds.remove(event.achievement.id)) {
            primedInfo?.state?.dismiss()
            return
        }

        primedInfo?.state?.dismiss()
        if (primedInfo != null) {
            addChallengeResult(event.achievement, AchievementInfo.IndicatorResult.FAILURE)
        }
    }

    private fun handleAchievementTriggered(event: RAEventUi.AchievementTriggered) {
        val primedInfo = visibleInfos.firstOrNull { (it as? AchievementPrimed)?.achievement?.id == event.achievement.id }
        if (primedInfo != null) {
            completedChallengeIds.add(event.achievement.id)
            primedInfo.state.dismiss()
            addChallengeResult(event.achievement, AchievementInfo.IndicatorResult.SUCCESS)
        }
    }

    private fun handleAchievementTriggerError(event: RAEventUi.AchievementTriggerError) {
        val errorInfoIndex = visibleInfos.indexOfFirst { it is AchievementInfo.ServerCommunicationFailed }
        val errorSource = AchievementInfo.ServerCommunicationFailed.ErrorSource.AwardAchievement(event.achievement.id)

        if (errorInfoIndex < 0) {
            val state = AchievementInfoState {
                visibleInfos.removeFirst { it is AchievementInfo.ServerCommunicationFailed }
            }
            val info = AchievementInfo.ServerCommunicationFailed(
                source = errorSource,
                willRetryInBackground = true,
                state = state,
                uiInstanceId = nextUiInstanceId(),
            )
            visibleInfos.add(0, info)
        } else {
            handleExistingError(errorInfoIndex, errorSource, willRetryInBackground = true)
        }
    }

    private fun handleProgressUpdated(event: RAEventUi.AchievementProgressUpdated) {
        // Start by checking if there is an existing progress update for this exact achievement
        val exactAchievementProgressIndex = visibleInfos.indexOfFirst { (it as? AchievementProgress)?.achievement?.id == event.achievement.id  }

        if (exactAchievementProgressIndex != -1) {
            handleExistingProgress(exactAchievementProgressIndex, event)
        } else {
            // Check if there is ANY existing progress update
            val existingProgressIndex = visibleInfos.indexOfFirst { it is AchievementProgress }
            if (existingProgressIndex != -1) {
                handleExistingProgress(existingProgressIndex, event)
            } else {
                addNewProgress(event)
            }
        }
    }

    private fun handleExistingError(
        errorInfoIndex: Int,
        newErrorSource: AchievementInfo.ServerCommunicationFailed.ErrorSource,
        willRetryInBackground: Boolean,
    ) {
        // Update error reason on existing error information to notify the user that there was another error
        val errorInfo = visibleInfos[errorInfoIndex] as AchievementInfo.ServerCommunicationFailed
        visibleInfos[errorInfoIndex] = errorInfo.copy(
            source = newErrorSource,
            willRetryInBackground = willRetryInBackground,
        ).also {
            it.state.show()
        }
    }

    private fun handleLeaderboardAttemptStarted(event: RAEventUi.LeaderboardAttemptStarted) {
        visibleInfos.removeAll {
            val shouldRemove = (it as? AchievementInfo.LeaderboardAttempt)?.leaderboard?.id == event.leaderboard.id
            if (shouldRemove) {
                it.state.dismiss()
            }
            shouldRemove
        }

        val state = AchievementInfoState {
            visibleInfos.removeFirst { (it as? AchievementInfo.LeaderboardAttempt)?.key == event.key }
        }
        visibleInfos.add(0, AchievementInfo.LeaderboardAttempt(event.key, event.leaderboard, event.gameIcon, "", state, nextUiInstanceId()))
    }

    private fun handleLeaderboardAttemptUpdated(event: RAEventUi.LeaderboardAttemptUpdated) {
        val attemptIndex = visibleInfos.indexOfFirst {
            (it as? AchievementInfo.LeaderboardAttempt)?.key == event.key
        }

        if (attemptIndex != -1) {
            val existingAttempt = visibleInfos[attemptIndex] as AchievementInfo.LeaderboardAttempt
            visibleInfos[attemptIndex] = existingAttempt.copy(currentValue = event.formattedValue)
        }
    }

    private fun handleLeaderboardSubmissionPending(event: RAEventUi.LeaderboardSubmissionPending) {
        visibleInfos.filterIsInstance<AchievementInfo.LeaderboardAttempt>()
            .firstOrNull { it.key == event.key }
            ?.state
            ?.dismiss()

        visibleInfos.removeAll {
            val pending = it as? AchievementInfo.LeaderboardSubmissionPending
            val shouldRemove = pending?.key == event.key
            if (shouldRemove) pending.state.dismiss()
            shouldRemove
        }

        val state = AchievementInfoState {
            visibleInfos.removeFirst { (it as? AchievementInfo.LeaderboardSubmissionPending)?.key == event.key }
        }
        visibleInfos.add(
            0,
            AchievementInfo.LeaderboardSubmissionPending(
                key = event.key,
                title = event.title,
                gameIcon = event.gameIcon,
                trackerDisplay = event.trackerDisplay,
                state = state,
                uiInstanceId = nextUiInstanceId(),
            )
        )
    }

    private fun handleLeaderboardEntrySubmitted(event: RAEventUi.LeaderboardEntrySubmitted) {
        // Dismiss any existing leaderboard attempt before showing completion UI
        visibleInfos.firstOrNull {
            val attempt = it as? AchievementInfo.LeaderboardAttempt
            attempt != null && event.matches(attempt.key)
        }?.state?.dismiss()
        visibleInfos.firstOrNull {
            val pending = it as? AchievementInfo.LeaderboardSubmissionPending
            pending != null && event.matches(pending.key)
        }?.state?.dismiss()

        val state = AchievementInfoState {
            visibleInfos.removeFirst {
                val submitted = it as? AchievementInfo.LeaderboardEntrySubmitted
                submitted != null && event.matches(submitted.attemptKey, submitted.leaderboardId)
            }
        }
        val info = AchievementInfo.LeaderboardEntrySubmitted(
            event.leaderboardId,
            event.attemptKey,
            event.title,
            event.gameIcon,
            event.submittedScore,
            event.bestScore,
            event.rank,
            event.numberOfEntries,
            state,
            nextUiInstanceId(),
        )
        visibleInfos.add(0, info)
    }

    private fun handleLeaderboardEntrySubmitError(event: RAEventUi.LeaderboardEntrySubmitError) {
        val attempt = visibleInfos.firstOrNull {
            val leaderboardAttempt = it as? AchievementInfo.LeaderboardAttempt
            leaderboardAttempt != null && event.matches(leaderboardAttempt.key)
        } as? AchievementInfo.LeaderboardAttempt
        attempt?.state?.dismiss()
        visibleInfos.firstOrNull {
            val pending = it as? AchievementInfo.LeaderboardSubmissionPending
            pending != null && event.matches(pending.key)
        }?.state?.dismiss()
        if (attempt != null) {
            addLeaderboardAttemptResult(attempt, AchievementInfo.IndicatorResult.FAILURE)
        }

        val errorInfoIndex = visibleInfos.indexOfFirst { it is AchievementInfo.ServerCommunicationFailed }
        val errorSource = AchievementInfo.ServerCommunicationFailed.ErrorSource.SubmitLeaderboard(event.leaderboardId)

        if (errorInfoIndex < 0) {
            val state = AchievementInfoState {
                visibleInfos.removeFirst { it is AchievementInfo.ServerCommunicationFailed }
            }
            val info = AchievementInfo.ServerCommunicationFailed(
                source = errorSource,
                willRetryInBackground = event.willRetryInBackground,
                state = state,
                uiInstanceId = nextUiInstanceId(),
            )
            visibleInfos.add(0, info)
        } else {
            handleExistingError(
                errorInfoIndex,
                errorSource,
                event.willRetryInBackground,
            )
        }
    }

    private fun handleLeaderboardAttemptCancelled(event: RAEventUi.LeaderboardAttemptCancelled) {
        val attempt = visibleInfos.firstOrNull {
            val leaderboardAttempt = it as? AchievementInfo.LeaderboardAttempt
            leaderboardAttempt != null && (
                event.attemptKey?.let { key -> leaderboardAttempt.key == key }
                    ?: (leaderboardAttempt.leaderboard.id == event.leaderboardId)
                )
        } as? AchievementInfo.LeaderboardAttempt
        attempt?.state?.dismiss()
        visibleInfos.firstOrNull {
            val pending = it as? AchievementInfo.LeaderboardSubmissionPending
            pending != null && (
                event.attemptKey?.let { key -> pending.key == key }
                    ?: (pending.key.leaderboardId == event.leaderboardId)
                )
        }?.state?.dismiss()
        if (attempt != null) {
            addLeaderboardAttemptResult(attempt, AchievementInfo.IndicatorResult.FAILURE)
        }
    }

    private fun handleLeaderboardTrackerHidden(event: RAEventUi.LeaderboardTrackerHidden) {
        val attempt = visibleInfos.firstOrNull {
            (it as? AchievementInfo.LeaderboardAttempt)?.key == event.key
        }
        attempt?.state?.dismiss()
    }

    private fun handleAchievementProgressHidden(event: RAEventUi.AchievementProgressHidden) {
        val progress = visibleInfos.firstOrNull {
            (it as? AchievementProgress)?.achievement?.id == event.achievementId
        }
        progress?.state?.dismiss()
    }

    private fun handlePendingDataSubmitted() {
        visibleInfos.firstOrNull { it is AchievementInfo.ServerCommunicationFailed }?.state?.dismiss()
    }

    private fun handleExistingProgress(
        existingIndex: Int,
        event: RAEventUi.AchievementProgressUpdated,
    ) {
        val existingProgress = visibleInfos[existingIndex] as AchievementProgress
        
        when {
            existingProgress.achievement.id == event.achievement.id -> {
                // Update existing progress for same achievement
                visibleInfos[existingIndex] = existingProgress.copy(
                    achievement = event.achievement,
                    current = event.current,
                    target = event.target,
                    progress = event.progress,
                )
            }
            shouldReplaceProgress(existingProgress, event) -> {
                // Replace with new achievement that's closer to completion
                existingProgress.state.dismiss()
                addNewProgress(event)
            }
        }
    }

    private fun shouldReplaceProgress(
        existing: AchievementProgress,
        newEvent: RAEventUi.AchievementProgressUpdated
    ): Boolean {
        val newRelativeProgress = newEvent.current.toFloat() / newEvent.target
        return newRelativeProgress > existing.relativeProgress()
    }

    private fun addNewProgress(event: RAEventUi.AchievementProgressUpdated) {
        val state = AchievementInfoState {
            visibleInfos.removeFirst { (it as? AchievementProgress)?.achievement?.id == event.achievement.id }
        }
        val progressInfo = AchievementProgress(
            achievement = event.achievement,
            current = event.current,
            target = event.target,
            progress = event.progress,
            state = state,
            uiInstanceId = nextUiInstanceId(),
        )
        visibleInfos.add(0, progressInfo)
    }

    private fun addChallengeResult(
        achievement: RAAchievement,
        result: AchievementInfo.IndicatorResult,
    ) {
        visibleInfos.removeAll {
            val resultInfo = it as? AchievementInfo.ChallengeResult
            val shouldRemove = resultInfo?.achievement?.id == achievement.id && resultInfo.result == result
            if (shouldRemove) {
                resultInfo.state.dismiss()
            }
            shouldRemove
        }

        val state = AchievementInfoState {
            visibleInfos.removeFirst {
                val resultInfo = it as? AchievementInfo.ChallengeResult
                resultInfo?.achievement?.id == achievement.id && resultInfo.result == result
            }
        }
        visibleInfos.add(0, AchievementInfo.ChallengeResult(achievement, result, state, nextUiInstanceId()))
    }

    private fun addLeaderboardAttemptResult(
        attempt: AchievementInfo.LeaderboardAttempt,
        result: AchievementInfo.IndicatorResult,
    ) {
        visibleInfos.removeAll {
            val resultInfo = it as? AchievementInfo.LeaderboardAttemptResult
            val shouldRemove = resultInfo?.key == attempt.key && resultInfo.result == result
            if (shouldRemove) {
                resultInfo.state.dismiss()
            }
            shouldRemove
        }

        val state = AchievementInfoState {
            visibleInfos.removeFirst {
                val resultInfo = it as? AchievementInfo.LeaderboardAttemptResult
                resultInfo?.key == attempt.key && resultInfo.result == result
            }
        }
        visibleInfos.add(
            0,
            AchievementInfo.LeaderboardAttemptResult(
                key = attempt.key,
                leaderboard = attempt.leaderboard,
                gameIcon = attempt.gameIcon,
                currentValue = attempt.currentValue,
                result = result,
                state = state,
                uiInstanceId = nextUiInstanceId(),
            )
        )
    }

    private fun nextUiInstanceId(): Long = nextInfoInstanceId++
}

private fun RAEventUi.LeaderboardEntrySubmitted.matches(key: LeaderboardAttemptKey): Boolean {
    return attemptKey?.let { it == key } ?: (leaderboardId == key.leaderboardId)
}

private fun RAEventUi.LeaderboardEntrySubmitted.matches(
    candidateAttemptKey: LeaderboardAttemptKey?,
    candidateLeaderboardId: Long,
): Boolean {
    return attemptKey?.let { it == candidateAttemptKey } ?: (leaderboardId == candidateLeaderboardId)
}

private fun RAEventUi.LeaderboardEntrySubmitError.matches(key: LeaderboardAttemptKey): Boolean {
    return attemptKey?.let { it == key } ?: (leaderboardId == key.leaderboardId)
}

internal sealed class AchievementInfo {

    abstract val state: AchievementInfoState
    abstract val uiInstanceId: Long
    
    data class AchievementPrimed(
        val achievement: RAAchievement,
        override val state: AchievementInfoState,
        override val uiInstanceId: Long,
    ) : AchievementInfo()

    data class AchievementProgress(
        val achievement: RAAchievement,
        val current: Int,
        val target: Int,
        val progress: String,
        override val state: AchievementInfoState,
        override val uiInstanceId: Long,
    ) : AchievementInfo() {
        fun relativeProgress() = current.toFloat() / target
    }

    data class LeaderboardAttempt(
        val key: LeaderboardAttemptKey,
        val leaderboard: RALeaderboard,
        val gameIcon: URL,
        val currentValue: String,
        override val state: AchievementInfoState,
        override val uiInstanceId: Long,
    ) : AchievementInfo()

    data class LeaderboardAttemptResult(
        val key: LeaderboardAttemptKey,
        val leaderboard: RALeaderboard,
        val gameIcon: URL,
        val currentValue: String,
        val result: IndicatorResult,
        override val state: AchievementInfoState,
        override val uiInstanceId: Long,
    ) : AchievementInfo()

    data class LeaderboardSubmissionPending(
        val key: LeaderboardAttemptKey,
        val title: String,
        val gameIcon: URL?,
        val trackerDisplay: String,
        override val state: AchievementInfoState,
        override val uiInstanceId: Long,
    ) : AchievementInfo()

    data class LeaderboardEntrySubmitted(
        val leaderboardId: Long,
        val attemptKey: LeaderboardAttemptKey?,
        val title: String,
        val gameIcon: URL?,
        val submittedScore: String,
        val bestScore: String?,
        val rank: Long,
        val numberOfEntries: Long,
        override val state: AchievementInfoState,
        override val uiInstanceId: Long,
    ) : AchievementInfo()

    data class ChallengeResult(
        val achievement: RAAchievement,
        val result: IndicatorResult,
        override val state: AchievementInfoState,
        override val uiInstanceId: Long,
    ) : AchievementInfo()

    data class ServerCommunicationFailed(
        val source: ErrorSource,
        val willRetryInBackground: Boolean,
        override val state: AchievementInfoState,
        override val uiInstanceId: Long,
    ) : AchievementInfo() {

        sealed class ErrorSource {
            data class AwardAchievement(val achievementId: Long) : ErrorSource()
            data class SubmitLeaderboard(val leaderboardId: Long) : ErrorSource()
        }
    }

    enum class IndicatorResult {
        SUCCESS,
        FAILURE,
    }
}

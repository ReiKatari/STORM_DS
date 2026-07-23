#include "AndroidMelonEventMessenger.h"
#include "EmulatorMessageQueueJNI.h"
#include <algorithm>
#include <cstring>

void AndroidMelonEventMessenger::onRumbleStart(int durationMs)
{
    MelonDSAndroid::fireEmulatorEvent(EVENT_RUMBLE_START, sizeof(durationMs), &durationMs);
}

void AndroidMelonEventMessenger::onRumbleStop()
{
    MelonDSAndroid::fireEmulatorEvent(EVENT_RUMBLE_STOP);
}

void AndroidMelonEventMessenger::onEmulatorStop(melonDS::Platform::StopReason reason)
{
    int32_t reasonInt = (int32_t) reason;
    MelonDSAndroid::fireEmulatorEvent(EVENT_EMULATOR_STOP, sizeof(reasonInt), &reasonInt);
}

void AndroidMelonEventMessenger::onRendererInitFailed(MelonDSAndroid::Renderer renderer)
{
    int32_t rendererInt = static_cast<int32_t>(renderer);
    MelonDSAndroid::fireEmulatorEvent(EVENT_RENDERER_INIT_FAILED, sizeof(rendererInt), &rendererInt);
}

void AndroidMelonEventMessenger::onVulkanCompileProgress(int stageId, int current, int total)
{
    struct
    {
        int32_t stageId;
        int32_t current;
        int32_t total;
    } data{
        .stageId = static_cast<int32_t>(stageId),
        .current = static_cast<int32_t>(current),
        .total = static_cast<int32_t>(total),
    };
    MelonDSAndroid::fireEmulatorEvent(EVENT_VULKAN_COMPILE_PROGRESS, sizeof(data), &data);
}

void AndroidMelonEventMessenger::onAchievementPrimed(long achievementId)
{
    int64_t achievementIdLong = (int64_t) achievementId;
    MelonDSAndroid::fireEmulatorEvent(EVENT_RA_ACHIEVEMENT_PRIMED, sizeof(achievementIdLong), &achievementIdLong);
}

void AndroidMelonEventMessenger::onAchievementTriggered(long achievementId)
{
    int64_t achievementIdLong = (int64_t) achievementId;
    MelonDSAndroid::fireEmulatorEvent(EVENT_RA_ACHIEVEMENT_TRIGGERED, sizeof(achievementIdLong), &achievementIdLong);
}

void AndroidMelonEventMessenger::onAchievementUnprimed(long achievementId)
{
    int64_t achievementIdLong = (int64_t) achievementId;
    MelonDSAndroid::fireEmulatorEvent(EVENT_RA_ACHIEVEMENT_UNPRIMED, sizeof(achievementIdLong), &achievementIdLong);
}

void AndroidMelonEventMessenger::onAchievementProgressUpdated(long achievementId, unsigned int current, unsigned int target, std::string progress)
{
    struct {
        int64_t achievementId;
        int32_t current;
        int32_t target;
        int32_t progressSize;
        char progress[32];
    } data = {
        .achievementId = (int64_t) achievementId,
        .current = (int32_t) current,
        .target = (int32_t) target,
        .progressSize = (int32_t) std::min(progress.size(), sizeof(data.progress)),
    };
    std::memset(data.progress, 0, sizeof(data.progress));
    std::memcpy(data.progress, progress.c_str(), (size_t) data.progressSize);

    MelonDSAndroid::fireEmulatorEvent(EVENT_RA_ACHIEVEMENT_PROGRESS_UPDATED, sizeof(data), &data);
}

void AndroidMelonEventMessenger::onLeaderboardAttemptStarted(long leaderboardId, uint64_t attemptId, uint64_t eventSequence)
{
    struct {
        int64_t leaderboardId;
        int64_t attemptId;
        int64_t eventSequence;
    } data = {
        .leaderboardId = (int64_t) leaderboardId,
        .attemptId = (int64_t) attemptId,
        .eventSequence = (int64_t) eventSequence,
    };
    MelonDSAndroid::fireEmulatorEvent(EVENT_RA_LBOARD_ATTEMPT_STARTED, sizeof(data), &data);
}

void AndroidMelonEventMessenger::onLeaderboardAttemptUpdated(
    long leaderboardId,
    uint64_t attemptId,
    uint64_t eventSequence,
    bool trackerShown,
    std::string formattedValue
)
{
    struct {
        int64_t leaderboardId;
        int64_t attemptId;
        int64_t eventSequence;
        int32_t trackerShown;
        int32_t formattedValueSize;
        char formattedValue[32];
    } data = {
        .leaderboardId = (int64_t) leaderboardId,
        .attemptId = (int64_t) attemptId,
        .eventSequence = (int64_t) eventSequence,
        .trackerShown = trackerShown ? 1 : 0,
        .formattedValueSize = (int32_t) std::min(formattedValue.size(), sizeof(data.formattedValue)),
    };
    static_assert(sizeof(data) <= 128, "Leaderboard tracker event exceeds message queue payload");
    std::memset(data.formattedValue, 0, sizeof(data.formattedValue));
    std::memcpy(data.formattedValue, formattedValue.c_str(), (size_t) data.formattedValueSize);

    MelonDSAndroid::fireEmulatorEvent(EVENT_RA_LBOARD_ATTEMPT_UPDATED, sizeof(data), &data);
}

void AndroidMelonEventMessenger::onLeaderboardAttemptCanceled(long leaderboardId, uint64_t attemptId, uint64_t eventSequence)
{
    struct {
        int64_t leaderboardId;
        int64_t attemptId;
        int64_t eventSequence;
    } data = {
        .leaderboardId = (int64_t) leaderboardId,
        .attemptId = (int64_t) attemptId,
        .eventSequence = (int64_t) eventSequence,
    };
    MelonDSAndroid::fireEmulatorEvent(EVENT_RA_LBOARD_ATTEMPT_CANCELED, sizeof(data), &data);
}

void AndroidMelonEventMessenger::onLeaderboardTrackerHidden(long leaderboardId, uint64_t attemptId, uint64_t eventSequence)
{
    struct {
        int64_t leaderboardId;
        int64_t attemptId;
        int64_t eventSequence;
    } data = {
        .leaderboardId = (int64_t) leaderboardId,
        .attemptId = (int64_t) attemptId,
        .eventSequence = (int64_t) eventSequence,
    };
    MelonDSAndroid::fireEmulatorEvent(EVENT_RA_LBOARD_TRACKER_HIDDEN, sizeof(data), &data);
}

void AndroidMelonEventMessenger::onLeaderboardAttemptSubmitted(
    long leaderboardId,
    uint64_t attemptId,
    uint64_t eventSequence,
    std::string trackerDisplay
)
{
    struct {
        int64_t leaderboardId;
        int64_t attemptId;
        int64_t eventSequence;
        int32_t trackerDisplaySize;
        char trackerDisplay[32];
    } data = {
        .leaderboardId = (int64_t) leaderboardId,
        .attemptId = (int64_t) attemptId,
        .eventSequence = (int64_t) eventSequence,
        .trackerDisplaySize = (int32_t) std::min(trackerDisplay.size(), sizeof(data.trackerDisplay)),
    };
    std::memset(data.trackerDisplay, 0, sizeof(data.trackerDisplay));
    std::memcpy(data.trackerDisplay, trackerDisplay.c_str(), (size_t) data.trackerDisplaySize);

    MelonDSAndroid::fireEmulatorEvent(EVENT_RA_LBOARD_ATTEMPT_SUBMITTED, sizeof(data), &data);
}

void AndroidMelonEventMessenger::onLeaderboardScoreboard(
    long leaderboardId,
    uint64_t attemptId,
    uint64_t eventSequence,
    std::string submittedScore,
    std::string bestScore,
    uint32_t newRank,
    uint32_t numEntries
)
{
    struct {
        int64_t leaderboardId;
        int64_t attemptId;
        int64_t eventSequence;
        uint32_t newRank;
        uint32_t numEntries;
        int32_t submittedScoreSize;
        char submittedScore[32];
        int32_t bestScoreSize;
        char bestScore[32];
    } data = {
        .leaderboardId = (int64_t) leaderboardId,
        .attemptId = (int64_t) attemptId,
        .eventSequence = (int64_t) eventSequence,
        .newRank = newRank,
        .numEntries = numEntries,
        .submittedScoreSize = (int32_t) std::min(submittedScore.size(), sizeof(data.submittedScore)),
        .bestScoreSize = (int32_t) std::min(bestScore.size(), sizeof(data.bestScore)),
    };
    static_assert(sizeof(data) <= 128, "Leaderboard scoreboard event exceeds message queue payload");
    std::memset(data.submittedScore, 0, sizeof(data.submittedScore));
    std::memcpy(data.submittedScore, submittedScore.c_str(), (size_t) data.submittedScoreSize);
    std::memset(data.bestScore, 0, sizeof(data.bestScore));
    std::memcpy(data.bestScore, bestScore.c_str(), (size_t) data.bestScoreSize);

    MelonDSAndroid::fireEmulatorEvent(EVENT_RA_LBOARD_SCOREBOARD, sizeof(data), &data);
}

void AndroidMelonEventMessenger::onLeaderboardSubmissionFailed(
    long leaderboardId,
    uint64_t attemptId,
    uint64_t eventSequence,
    int result,
    std::string message
)
{
    struct {
        int64_t leaderboardId;
        int64_t attemptId;
        int64_t eventSequence;
        int32_t result;
        int32_t messageSize;
        char message[48];
    } data = {
        .leaderboardId = (int64_t) leaderboardId,
        .attemptId = (int64_t) attemptId,
        .eventSequence = (int64_t) eventSequence,
        .result = (int32_t) result,
        .messageSize = (int32_t) std::min(message.size(), sizeof(data.message)),
    };
    static_assert(sizeof(data) <= 128, "Leaderboard failure event exceeds message queue payload");
    std::memset(data.message, 0, sizeof(data.message));
    std::memcpy(data.message, message.c_str(), (size_t) data.messageSize);

    MelonDSAndroid::fireEmulatorEvent(EVENT_RA_LBOARD_SUBMISSION_FAILED, sizeof(data), &data);
}

void AndroidMelonEventMessenger::onLeaderboardRuntimeReset(uint64_t attemptFloor)
{
    int64_t data = (int64_t) attemptFloor;
    MelonDSAndroid::fireEmulatorEvent(EVENT_RA_LBOARD_RUNTIME_RESET, sizeof(data), &data);
}

void AndroidMelonEventMessenger::onAchievementProgressHidden(long achievementId)
{
    int64_t achievementIdLong = (int64_t) achievementId;
    MelonDSAndroid::fireEmulatorEvent(EVENT_RA_ACHIEVEMENT_PROGRESS_HIDDEN, sizeof(achievementIdLong), &achievementIdLong);
}

void AndroidMelonEventMessenger::onLeaderboardAttemptCompleted(long leaderboardId, int value, std::string formattedValue)
{
    struct {
        int64_t leaderboardId;
        int32_t value;
        int32_t formattedValueSize;
        char formattedValue[32];
    } data = {
        .leaderboardId = (int64_t) leaderboardId,
        .value = (int32_t) value,
        .formattedValueSize = (int32_t) std::min(formattedValue.size(), sizeof(data.formattedValue)),
    };
    std::memset(data.formattedValue, 0, sizeof(data.formattedValue));
    std::memcpy(data.formattedValue, formattedValue.c_str(), (size_t) data.formattedValueSize);

    MelonDSAndroid::fireEmulatorEvent(EVENT_RA_LBOARD_ATTEMPT_COMPLETED, sizeof(data), &data);
}

void AndroidMelonEventMessenger::onAchievementGameCompleted(long subsetId)
{
    int64_t subsetIdLong = (int64_t) subsetId;
    MelonDSAndroid::fireEmulatorEvent(EVENT_RA_GAME_COMPLETED, sizeof(subsetIdLong), &subsetIdLong);
}

void AndroidMelonEventMessenger::onAchievementSubsetCompleted(long subsetId)
{
    int64_t subsetIdLong = (int64_t) subsetId;
    MelonDSAndroid::fireEmulatorEvent(EVENT_RA_SUBSET_COMPLETED, sizeof(subsetIdLong), &subsetIdLong);
}

void AndroidMelonEventMessenger::onRetroAchievementsServerError(std::string api, long relatedId, int result, std::string message)
{
    struct {
        int64_t relatedId;
        int32_t result;
        int32_t apiSize;
        char api[32];
        int32_t messageSize;
        char message[64];
    } data = {
        .relatedId = (int64_t) relatedId,
        .result = (int32_t) result,
        .apiSize = (int32_t) std::min(api.size(), sizeof(data.api)),
        .messageSize = (int32_t) std::min(message.size(), sizeof(data.message)),
    };
    std::memset(data.api, 0, sizeof(data.api));
    std::memcpy(data.api, api.c_str(), (size_t) data.apiSize);
    std::memset(data.message, 0, sizeof(data.message));
    std::memcpy(data.message, message.c_str(), (size_t) data.messageSize);

    MelonDSAndroid::fireEmulatorEvent(EVENT_RA_SERVER_ERROR, sizeof(data), &data);
}

void AndroidMelonEventMessenger::onRetroAchievementsDisconnected()
{
    MelonDSAndroid::fireEmulatorEvent(EVENT_RA_DISCONNECTED);
}

void AndroidMelonEventMessenger::onRetroAchievementsReconnected()
{
    MelonDSAndroid::fireEmulatorEvent(EVENT_RA_RECONNECTED);
}

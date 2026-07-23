#ifndef ANDROIDMELONEVENTMESSENGER_H
#define ANDROIDMELONEVENTMESSENGER_H

#include <MelonEventMessenger.h>

class AndroidMelonEventMessenger : public MelonDSAndroid::MelonEventMessenger
{
public:
    void onRumbleStart(int durationMs) override;
    void onRumbleStop() override;
    void onEmulatorStop(melonDS::Platform::StopReason reason) override;
    void onRendererInitFailed(MelonDSAndroid::Renderer renderer) override;
    void onVulkanCompileProgress(int stageId, int current, int total) override;

    void onAchievementPrimed(long achievementId) override;
    void onAchievementTriggered(long achievementId) override;
    void onAchievementUnprimed(long achievementId) override;
    void onAchievementProgressUpdated(long achievementId, unsigned int current, unsigned int target, std::string progress) override;
    void onAchievementProgressHidden(long achievementId) override;
    void onLeaderboardAttemptStarted(long leaderboardId, uint64_t attemptId, uint64_t eventSequence) override;
    void onLeaderboardAttemptUpdated(
        long leaderboardId,
        uint64_t attemptId,
        uint64_t eventSequence,
        bool trackerShown,
        std::string formattedValue
    ) override;
    void onLeaderboardAttemptCanceled(long leaderboardId, uint64_t attemptId, uint64_t eventSequence) override;
    void onLeaderboardTrackerHidden(long leaderboardId, uint64_t attemptId, uint64_t eventSequence) override;
    void onLeaderboardAttemptSubmitted(long leaderboardId, uint64_t attemptId, uint64_t eventSequence, std::string trackerDisplay) override;
    void onLeaderboardScoreboard(
        long leaderboardId,
        uint64_t attemptId,
        uint64_t eventSequence,
        std::string submittedScore,
        std::string bestScore,
        uint32_t newRank,
        uint32_t numEntries
    ) override;
    void onLeaderboardSubmissionFailed(
        long leaderboardId,
        uint64_t attemptId,
        uint64_t eventSequence,
        int result,
        std::string message
    ) override;
    void onLeaderboardRuntimeReset(uint64_t attemptFloor) override;
    void onLeaderboardAttemptCompleted(long leaderboardId, int value, std::string formattedValue) override;
    void onAchievementGameCompleted(long subsetId) override;
    void onAchievementSubsetCompleted(long subsetId) override;
    void onRetroAchievementsServerError(std::string api, long relatedId, int result, std::string message) override;
    void onRetroAchievementsDisconnected() override;
    void onRetroAchievementsReconnected() override;
    void onRetroAchievementsPendingSubmissionAdded(
        uint64_t submissionSessionId,
        uint64_t submissionId,
        uint64_t sequence,
        int64_t createdAtEpochMs,
        int submissionType,
        long achievementId,
        long leaderboardId,
        uint64_t attemptId,
        int32_t rawScore,
        bool hardcore,
        std::string formattedScore
    ) override;
    void onRetroAchievementsPendingSubmissionResolved(
        uint64_t submissionSessionId,
        uint64_t submissionId,
        int submissionType,
        int resolution,
        int result
    ) override;
    void onRetroAchievementsPendingSubmissionBarrier(
        uint64_t submissionSessionId,
        uint64_t barrierId
    ) override;

private:
    // Event type constants
    static constexpr int EVENT_RUMBLE_START = 100;
    static constexpr int EVENT_RUMBLE_STOP = 101;
    static constexpr int EVENT_EMULATOR_STOP = 102;
    static constexpr int EVENT_RENDERER_INIT_FAILED = 103;
    static constexpr int EVENT_VULKAN_COMPILE_PROGRESS = 104;

    static constexpr int EVENT_RA_ACHIEVEMENT_PRIMED = 200;
    static constexpr int EVENT_RA_ACHIEVEMENT_TRIGGERED = 201;
    static constexpr int EVENT_RA_ACHIEVEMENT_UNPRIMED = 202;
    static constexpr int EVENT_RA_ACHIEVEMENT_PROGRESS_UPDATED = 203;
    static constexpr int EVENT_RA_GAME_COMPLETED = 204;
    static constexpr int EVENT_RA_SUBSET_COMPLETED = 205;
    static constexpr int EVENT_RA_SERVER_ERROR = 206;
    static constexpr int EVENT_RA_DISCONNECTED = 207;
    static constexpr int EVENT_RA_RECONNECTED = 208;
    static constexpr int EVENT_RA_LBOARD_ATTEMPT_STARTED = 210;
    static constexpr int EVENT_RA_LBOARD_ATTEMPT_UPDATED = 211;
    static constexpr int EVENT_RA_LBOARD_ATTEMPT_CANCELED = 212;
    static constexpr int EVENT_RA_LBOARD_ATTEMPT_COMPLETED = 213;
    static constexpr int EVENT_RA_ACHIEVEMENT_PROGRESS_HIDDEN = 214;
    static constexpr int EVENT_RA_LBOARD_TRACKER_HIDDEN = 215;
    static constexpr int EVENT_RA_LBOARD_ATTEMPT_SUBMITTED = 216;
    static constexpr int EVENT_RA_LBOARD_SCOREBOARD = 217;
    static constexpr int EVENT_RA_LBOARD_SUBMISSION_FAILED = 218;
    static constexpr int EVENT_RA_LBOARD_RUNTIME_RESET = 219;
    static constexpr int EVENT_RA_PENDING_SUBMISSION_ADDED = 220;
    static constexpr int EVENT_RA_PENDING_SUBMISSION_RESOLVED = 221;
    static constexpr int EVENT_RA_PENDING_SUBMISSION_BARRIER = 222;
};

#endif // ANDROIDMELONEVENTMESSENGER_H

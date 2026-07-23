#ifndef MELONEVENTMESSENGER_H
#define MELONEVENTMESSENGER_H

#include <Platform.h>
#include <cstdint>
#include "renderer/Renderer.h"

namespace MelonDSAndroid
{

class MelonEventMessenger
{
public:
    virtual void onRumbleStart(int durationMs) = 0;
    virtual void onRumbleStop() = 0;
    virtual void onEmulatorStop(melonDS::Platform::StopReason reason) = 0;
    virtual void onRendererInitFailed(Renderer renderer) = 0;
    virtual void onVulkanCompileProgress(int stageId, int current, int total) {}

    virtual void onAchievementPrimed(long achievementId) = 0;
    virtual void onAchievementTriggered(long achievementId) = 0;
    virtual void onAchievementUnprimed(long achievementId) = 0;
    virtual void onAchievementProgressUpdated(long achievementId, unsigned int current, unsigned int target, std::string progress) = 0;
    virtual void onAchievementProgressHidden(long achievementId) {}
    virtual void onLeaderboardAttemptStarted(long leaderboardId, uint64_t attemptId, uint64_t eventSequence) = 0;
    virtual void onLeaderboardAttemptUpdated(
        long leaderboardId,
        uint64_t attemptId,
        uint64_t eventSequence,
        bool trackerShown,
        std::string formattedValue
    ) = 0;
    virtual void onLeaderboardAttemptCanceled(long leaderboardId, uint64_t attemptId, uint64_t eventSequence) = 0;
    virtual void onLeaderboardTrackerHidden(long leaderboardId, uint64_t attemptId, uint64_t eventSequence) {}
    virtual void onLeaderboardAttemptSubmitted(long leaderboardId, uint64_t attemptId, uint64_t eventSequence, std::string trackerDisplay) = 0;
    virtual void onLeaderboardScoreboard(
        long leaderboardId,
        uint64_t attemptId,
        uint64_t eventSequence,
        std::string submittedScore,
        std::string bestScore,
        uint32_t newRank,
        uint32_t numEntries
    ) = 0;
    virtual void onLeaderboardSubmissionFailed(
        long leaderboardId,
        uint64_t attemptId,
        uint64_t eventSequence,
        int result,
        std::string message
    ) = 0;
    virtual void onLeaderboardRuntimeReset(uint64_t attemptFloor) = 0;
    virtual void onLeaderboardAttemptCompleted(long leaderboardId, int value, std::string formattedValue) = 0;
    virtual void onAchievementGameCompleted(long subsetId) = 0;
    virtual void onAchievementSubsetCompleted(long subsetId) = 0;
    virtual void onRetroAchievementsServerError(std::string api, long relatedId, int result, std::string message) = 0;
    virtual void onRetroAchievementsDisconnected() = 0;
    virtual void onRetroAchievementsReconnected() = 0;
};

}

#endif // MELONEVENTMESSENGER_H

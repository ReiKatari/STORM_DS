#ifndef RETROACHIEVEMENTSMANAGER_H
#define RETROACHIEVEMENTSMANAGER_H

#include <list>
#include <cstdint>
#include <optional>
#include <string>
#include <unordered_map>
#include <vector>
#include <jni.h>
#include "MelonEventMessenger.h"
#include "LeaderboardTrackerUpdateLogLimiter.h"
#include "NDS.h"
#include "RAAchievement.h"
#include "RALeaderboard.h"
#include "RARuntimeBridgeConfig.h"
#include "rcheevos.h"
#include "rc_client.h"
#include "Savestate.h"

namespace MelonDSAndroid
{
namespace RetroAchievements
{

class RetroAchievementsManager
{
public:
    RetroAchievementsManager(melonDS::NDS* nds);
    ~RetroAchievementsManager();
    static void SetJavaVm(JavaVM* javaVm);
    void ConfigureRuntimeBridge(std::optional<RARuntimeBridgeConfig> runtimeBridgeConfig);
    bool LoadAchievements(std::list<RAAchievement> achievements);
    bool LoadLeaderboards(std::list<RALeaderboard> leaderboards);
    bool ActivatePreferredRuntime();
    void UnloadEverything();
    void SetupRichPresence(std::string richPresenceScript);
    std::string GetRichPresenceStatus();
    std::vector<RARuntimeAchievement> GetRuntimeAchievements();
    std::vector<RARuntimeAchievementBucketEntry> GetRuntimeAchievementBuckets();
    std::vector<long> GetRuntimeSubsetIds();
    bool AreSaveStatesAllowed();
    bool DoSavestate(melonDS::Savestate* savestate);
    void Reset();
    void FrameUpdate();

    static void RcClientEventHandler(const rc_client_event_t* event, rc_client_t* client);
    static void NoopRcClientEventHandler(const rc_client_event_t* event, rc_client_t* client);
    static uint32_t RcClientReadMemory(uint32_t address, uint8_t* buffer, uint32_t numBytes, rc_client_t* client);
    static void RcClientServerCall(const rc_api_request_t* request, rc_client_server_callback_t callback, void* callbackData, rc_client_t* client);
    static void RcClientLogCallback(const char* message, const rc_client_t* client);

    static std::weak_ptr<MelonEventMessenger> EventMessenger;

private:
    enum class RuntimeMode
    {
        Disabled,
        RcClientOnline,
        RcClientOffline,
    };

    bool TryActivateRcClientRuntimeLocked();
    void DeactivateRcClientRuntimeLocked();
    void ResetRcClientPerformanceWindowLocked();
    std::string BuildRcClientLoginResponse() const;
    std::string BuildRcClientResolveHashResponse() const;
    std::string BuildRcClientAchievementSetsResponse() const;
    std::string BuildRcClientOfflineResponse(const std::string& requestAction) const;
    static std::string BuildRcClientSuccessResponse();
    static std::string BuildRcClientStartSessionResponse();
    static std::string BuildRcClientErrorResponse(const std::string& message);
    bool IsRcClientConfiguredLocked() const;
    bool IsRcClientRuntimeActiveLocked() const;
    static std::string EscapeJson(const std::string& value);
    static void ParseMeasuredProgress(const char* measuredProgress, unsigned int* value, unsigned int* target);
    static int ParseIntegerOrDefault(const char* value, int fallbackValue);
    void PublishLeaderboardTrackerValuesLocked();

    struct LeaderboardAttemptState
    {
        uint32_t leaderboardId = 0;
        uint64_t attemptId = 0;
        uint64_t eventSequence = 0;
        uint32_t logicalSubmitCount = 0;
        uint32_t transportAttemptCount = 0;
        std::optional<int32_t> requestScore;
        bool submittedSeen = false;
        bool scoreboardSeen = false;
        bool terminal = false;
        LeaderboardTrackerUpdateLogLimiter trackerUpdateLogLimiter;
    };

    LeaderboardAttemptState& BeginLeaderboardAttempt(uint32_t leaderboardId);
    LeaderboardAttemptState& EnsureLeaderboardAttempt(uint32_t leaderboardId, bool startNewIfTerminal);
    LeaderboardAttemptState& ResolveLeaderboardRequestAttempt(
        uint32_t leaderboardId,
        const void* callbackData,
        bool isRetry
    );
    LeaderboardAttemptState& ResolveLeaderboardResponseAttempt(uint32_t leaderboardId);
    LeaderboardAttemptState* FindLeaderboardAttempt(uint64_t attemptId);
    void PublishLeaderboardScoreboard(
        LeaderboardAttemptState& attempt,
        uint32_t leaderboardId,
        const std::string& submittedScore,
        const std::string& bestScore,
        uint32_t newRank,
        uint32_t numEntries,
        const char* source
    );
    void ForgetLeaderboardSubmissionCallback(uint64_t attemptId);
    bool IsLeaderboardAttemptReferenced(uint64_t attemptId) const;
    void PruneUnreferencedLeaderboardAttempts();
    void PublishLeaderboardResetBarrierLocked();
    uint64_t NextLeaderboardEventSequence(LeaderboardAttemptState& attempt);
    const char* RuntimePathTraceValue() const;

    melonDS::NDS* nds;
    rc_client_t* rcClientRuntime;
    std::mutex runtimeLock;

    std::list<RAAchievement> loadedAchievements;
    std::list<RALeaderboard> loadedLeaderboards;
    bool isRichPresenceEnabled;
    bool isRcClientRuntimeActive;
    RuntimeMode runtimeMode;
    int rcClientSlowWindowCount;
    int rcClientWindowFrameCount;
    int rcClientWindowSlowFrameCount;
    long long rcClientWindowAccumulatedUs;
    long long rcClientWindowPeakUs;
    int rcClientWindowCpuFrameCount;
    int rcClientWindowCpuSlowFrameCount;
    long long rcClientWindowCpuAccumulatedUs;
    long long rcClientWindowCpuPeakUs;
    std::optional<RARuntimeBridgeConfig> runtimeBridgeConfig;
    std::string loadedRichPresenceScript;
    std::unordered_map<uint64_t, LeaderboardAttemptState> leaderboardAttemptsById;
    std::unordered_map<uint32_t, uint64_t> activeLeaderboardAttemptIds;
    std::unordered_map<const void*, uint64_t> leaderboardAttemptIdsByCallbackData;
    std::optional<uint64_t> activeLeaderboardResponseAttemptId;
    const void* activeLeaderboardResponseCallbackData = nullptr;
    std::unordered_map<uint32_t, std::string> lastPublishedLeaderboardTrackerValues;

    static JavaVM* javaVm;
};

}
}

#endif //RETROACHIEVEMENTSMANAGER_H

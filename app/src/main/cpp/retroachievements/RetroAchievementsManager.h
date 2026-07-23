#ifndef RETROACHIEVEMENTSMANAGER_H
#define RETROACHIEVEMENTSMANAGER_H

#include <atomic>
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

enum class RANativePendingSubmissionType : int32_t
{
    Achievement = 1,
    Leaderboard = 2,
};

enum class RANativePendingSubmissionResolution : int32_t
{
    Accepted = 1,
    AlreadyAccepted = 2,
    PermanentFailure = 3,
    RetryableFailure = 4,
};

struct RANativePendingSubmissionResolutionEntry
{
    uint64_t submissionId = 0;
    RANativePendingSubmissionType submissionType = RANativePendingSubmissionType::Achievement;
    RANativePendingSubmissionResolution resolution = RANativePendingSubmissionResolution::RetryableFailure;
    int32_t result = 0;
};

struct RANativePendingRetryResult
{
    uint64_t submissionSessionId = 0;
    uint32_t forcedRetryCount = 0;
    bool transportFailure = false;
    std::vector<RANativePendingSubmissionResolutionEntry> resolutions;
};

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
    RANativePendingRetryResult RetryPendingSubmissions(
        const std::vector<uint64_t>& expectedSubmissionIds);
    uint64_t RefreshPendingSubmissions();
    int32_t DiscardPendingSubmissions(
        const std::vector<uint64_t>& expectedSubmissionIds);
    void SetSubmissionTransportSuspended(bool suspended);

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

    enum class PendingSubmissionStatus
    {
        InFlight,
        RetryPending,
    };

    struct PendingSubmissionState
    {
        uint64_t submissionId = 0;
        uint64_t sequence = 0;
        uint64_t submissionSessionId = 0;
        uintptr_t callbackDataToken = 0;
        int64_t createdAtEpochMs = 0;
        RANativePendingSubmissionType type = RANativePendingSubmissionType::Achievement;
        uint32_t achievementId = 0;
        uint32_t leaderboardId = 0;
        uint64_t attemptId = 0;
        std::optional<int32_t> rawScore;
        bool hardcore = false;
        bool presentationReady = false;
        bool published = false;
        std::string formattedScore;
        PendingSubmissionStatus status = PendingSubmissionStatus::InFlight;
        std::optional<int32_t> permanentFailureResult;
        std::optional<RANativePendingSubmissionResolution> terminalResolution;
        std::optional<int32_t> terminalResult;
    };

    PendingSubmissionState* PreparePendingSubmission(
        const std::string& requestAction,
        const rc_api_request_t* request,
        uintptr_t callbackDataToken,
        std::optional<uint64_t> leaderboardAttemptId
    );
    void MarkPendingSubmissionPresentationReady(
        RANativePendingSubmissionType type,
        uint32_t relatedId,
        uint64_t attemptId,
        const std::string& formattedScore
    );
    void MarkActivePendingSubmissionPermanentFailure(int32_t result);
    void FinalizePendingSubmissionTransport(
        uintptr_t callbackDataToken,
        bool retryPending,
        bool alreadyAccepted
    );
    void MaybePublishPendingSubmission(PendingSubmissionState& submission);
    bool IsPendingSubmissionPublishable(const PendingSubmissionState& submission) const;
    void SendPendingSubmissionAdded(const PendingSubmissionState& submission);
    void SendPendingSubmissionResolution(const PendingSubmissionState& submission);
    void PublishPendingSubmissionResolution(
        const PendingSubmissionState& submission,
        RANativePendingSubmissionResolution resolution,
        int32_t result
    );
    static int64_t PendingSubmissionNowEpochMs();

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
        uintptr_t callbackDataToken,
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
    std::unordered_map<uintptr_t, uint64_t> leaderboardAttemptIdsByCallbackData;
    std::optional<uint64_t> activeLeaderboardResponseAttemptId;
    uintptr_t activeLeaderboardResponseCallbackData = 0;
    std::unordered_map<uint32_t, std::string> lastPublishedLeaderboardTrackerValues;
    std::unordered_map<uintptr_t, PendingSubmissionState> pendingSubmissionsByCallbackData;
    std::unordered_map<uint64_t, PendingSubmissionState> terminalPendingSubmissionsById;
    uintptr_t activeSubmissionResponseCallbackData = 0;
    uint64_t nextPendingSubmissionBarrierId = 1;
    std::atomic<bool> submissionTransportSuspended{false};

    static JavaVM* javaVm;
};

}
}

#endif //RETROACHIEVEMENTSMANAGER_H

#ifndef RETROACHIEVEMENTSMANAGER_H
#define RETROACHIEVEMENTSMANAGER_H

#include <list>
#include <optional>
#include <string>
#include <jni.h>
#include "MelonEventMessenger.h"
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

    static void CheevosEventHandler(const rc_runtime_event_t* runtime_event);
    static void RcClientEventHandler(const rc_client_event_t* event, rc_client_t* client);
    static uint32_t RcClientReadMemory(uint32_t address, uint8_t* buffer, uint32_t numBytes, rc_client_t* client);
    static void RcClientServerCall(const rc_api_request_t* request, rc_client_server_callback_t callback, void* callbackData, rc_client_t* client);
    static void RcClientLogCallback(const char* message, const rc_client_t* client);

    static std::weak_ptr<MelonEventMessenger> EventMessenger;

private:
    bool TryActivateRcClientRuntimeLocked();
    void DeactivateRcClientRuntimeLocked();
    void NotifyRcClientRuntimeFallbackLocked(RetroAchievementsRuntimeFallbackReason reason);
    void ResetRcClientPerformanceWindowLocked();
    std::string BuildRcClientLoginResponse() const;
    std::string BuildRcClientAchievementSetsResponse() const;
    static std::string BuildRcClientSuccessResponse();
    static std::string BuildRcClientStartSessionResponse();
    static std::string BuildRcClientErrorResponse(const std::string& message);
    bool IsRcClientConfiguredLocked() const;
    bool IsRcClientRuntimeActiveLocked() const;
    static std::string EscapeJson(const std::string& value);
    static void ParseMeasuredProgress(const char* measuredProgress, unsigned int* value, unsigned int* target);
    static int ParseIntegerOrDefault(const char* value, int fallbackValue);
    static int ParseLeaderboardScoreByFormat(int format, const char* formatted, int fallbackValue);

    static std::string GetLeaderboardFormattedValue(int leaderboardId, int value);

    melonDS::NDS* nds;
    rc_runtime_t rcheevosRuntime;
    rc_client_t* rcClientRuntime;
    std::mutex runtimeLock;

    std::list<RAAchievement> loadedAchievements;
    std::list<RALeaderboard> loadedLeaderboards;
    bool isRichPresenceEnabled;
    bool isRcClientRuntimeActive;
    bool hasRcClientPerformanceFallback;
    int rcClientSlowWindowCount;
    int rcClientWindowFrameCount;
    long long rcClientWindowAccumulatedUs;
    long long rcClientWindowPeakUs;
    std::optional<RARuntimeBridgeConfig> runtimeBridgeConfig;
    std::string loadedRichPresenceScript;

    static RetroAchievementsManager* activeInstance;
    static std::mutex activeInstanceLock;
    static JavaVM* javaVm;
};

}
}

#endif //RETROACHIEVEMENTSMANAGER_H

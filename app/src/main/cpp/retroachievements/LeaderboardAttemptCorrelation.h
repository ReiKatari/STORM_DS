#ifndef LEADERBOARDATTEMPTCORRELATION_H
#define LEADERBOARDATTEMPTCORRELATION_H

#include <atomic>
#include <cstdint>

namespace MelonDSAndroid
{
namespace RetroAchievements
{
namespace LeaderboardAttemptCorrelation
{

inline uint64_t AllocateAttemptId()
{
    static std::atomic<uint64_t> nextAttemptId{1};
    uint64_t attemptId = nextAttemptId.fetch_add(1, std::memory_order_relaxed);
    while (attemptId == 0)
        attemptId = nextAttemptId.fetch_add(1, std::memory_order_relaxed);
    return attemptId;
}

inline bool IsTransportRetry(
    const void* callbackData,
    const void* activeResponseCallbackData,
    bool hasElapsedParameter
)
{
    return hasElapsedParameter ||
        (callbackData && callbackData == activeResponseCallbackData);
}

}
}
}

#endif

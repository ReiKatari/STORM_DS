#ifndef LEADERBOARDTRACKERUPDATELOGLIMITER_H
#define LEADERBOARDTRACKERUPDATELOGLIMITER_H

#include <cstdint>

namespace MelonDSAndroid
{
namespace RetroAchievements
{

class LeaderboardTrackerUpdateLogLimiter
{
public:
    struct Decision
    {
        bool shouldLog = false;
        uint64_t updateIndex = 0;
        uint64_t suppressedUpdates = 0;
    };

    explicit LeaderboardTrackerUpdateLogLimiter(int64_t minimumIntervalMs = 1000)
        : minimumIntervalMs(minimumIntervalMs)
    {
    }

    Decision Observe(int64_t nowMs)
    {
        updateCount++;
        if (!hasLoggedUpdate || nowMs < lastLoggedAtMs || nowMs - lastLoggedAtMs >= minimumIntervalMs)
        {
            const Decision decision{true, updateCount, suppressedUpdates};
            hasLoggedUpdate = true;
            lastLoggedAtMs = nowMs;
            suppressedUpdates = 0;
            return decision;
        }

        suppressedUpdates++;
        return Decision{false, updateCount, suppressedUpdates};
    }

    void Reset()
    {
        hasLoggedUpdate = false;
        lastLoggedAtMs = 0;
        updateCount = 0;
        suppressedUpdates = 0;
    }

private:
    int64_t minimumIntervalMs;
    bool hasLoggedUpdate = false;
    int64_t lastLoggedAtMs = 0;
    uint64_t updateCount = 0;
    uint64_t suppressedUpdates = 0;
};

}
}

#endif

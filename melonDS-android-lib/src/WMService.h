#ifndef MELONDS_WMSERVICE_H
#define MELONDS_WMSERVICE_H

#include <memory>
#include "types.h"

namespace melonDS
{
class NDS;

class WMService
{
public:
    explicit WMService(NDS& nds);
    ~WMService();
    WMService(const WMService&) = delete;
    WMService& operator=(const WMService&) = delete;

    void Reset();
    void Poll();
    void PollHost();
    bool CanPollHost() const;
    bool DeferFrameWait(u64 delay);
    void FinishFrameWait();
    void SetFrameDeadline(u64 deadline);
    static u64 ThreadWaitTimeUS();
    void Capture(u32 word);
    void ClearFIFO();
    bool BlocksARM7() const;
    bool Active() const;

private:
    void StopIfTerminal();
    struct Impl;
    std::unique_ptr<Impl> State;
};
}

#endif

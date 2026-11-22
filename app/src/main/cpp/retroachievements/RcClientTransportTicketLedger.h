#ifndef RC_CLIENT_TRANSPORT_TICKET_LEDGER_H
#define RC_CLIENT_TRANSPORT_TICKET_LEDGER_H

#include <cstdint>
#include <deque>
#include <memory>
#include <mutex>
#include <unordered_map>
#include <utility>
#include <vector>

namespace MelonDSAndroid
{
namespace RetroAchievements
{

template <typename Metadata, typename Cancellation, typename Completion>
class RcClientTransportTicketLedger final
{
public:
    enum class State
    {
        Active,
        Closing,
        Closed,
    };

    struct Ticket
    {
        Metadata metadata;
        std::shared_ptr<Cancellation> cancellation;
        bool completionQueued = false;
    };

    bool IsActive() const
    {
        std::lock_guard lock(mutex);
        return state == State::Active;
    }

    bool Register(
        uint64_t requestId,
        const Metadata& metadata,
        const std::shared_ptr<Cancellation>& cancellation)
    {
        std::lock_guard lock(mutex);
        if (state != State::Active || requestId == 0)
            return false;
        tickets.insert_or_assign(requestId, Ticket{metadata, cancellation});
        return true;
    }

    template <typename CompletionBuilder>
    bool Finish(uint64_t requestId, CompletionBuilder&& buildCompletion)
    {
        std::lock_guard lock(mutex);
        const auto ticket = tickets.find(requestId);
        if (ticket == tickets.end() || state != State::Active)
            return false;
        if (ticket->second.completionQueued)
            return false;
        completions.push_back(buildCompletion(ticket->second.metadata));
        ticket->second.completionQueued = true;
        return true;
    }

    bool PopCompletion(Completion* completion)
    {
        if (!completion)
            return false;

        std::lock_guard lock(mutex);
        if (completions.empty())
            return false;
        *completion = std::move(completions.front());
        completions.pop_front();
        return true;
    }

    void MarkDelivered(uint64_t requestId)
    {
        std::lock_guard lock(mutex);
        tickets.erase(requestId);
    }

    void Forget(uint64_t requestId)
    {
        MarkDelivered(requestId);
    }

    std::vector<Ticket> BeginClosing()
    {
        std::lock_guard lock(mutex);
        if (state != State::Active)
            return {};

        state = State::Closing;
        std::vector<Ticket> terminalTickets;
        terminalTickets.reserve(tickets.size());
        for (auto& entry : tickets)
            terminalTickets.push_back(std::move(entry.second));
        tickets.clear();
        completions.clear();
        return terminalTickets;
    }

    void Close()
    {
        std::lock_guard lock(mutex);
        state = State::Closed;
        tickets.clear();
        completions.clear();
    }

private:
    mutable std::mutex mutex;
    State state = State::Active;
    std::unordered_map<uint64_t, Ticket> tickets;
    std::deque<Completion> completions;
};

}
}

#endif

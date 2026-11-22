#ifndef MELONDS_EXACTLIVEGUIDE_H
#define MELONDS_EXACTLIVEGUIDE_H

#include <array>
#include <cstdint>
#include <limits>

namespace MelonDSAndroid
{

class ExactLiveGuide
{
public:
    enum class State : std::uint32_t
    {
        Idle = 0,
        Armed = 1,
        Completed = 2,
        Aborted = 3,
        Missed = 4,
    };

    enum class Event : std::uint32_t
    {
        TouchDown = 0,
        TouchUp = 1,
        Window758 = 2,
        End818 = 3,
    };

    enum class PreAction : std::uint32_t
    {
        None = 0,
        TouchDown = 1,
        TouchUp = 2,
        MissedRelease = 3,
    };

    enum class AbortReason : std::uint32_t
    {
        ExplicitCommand = 1,
        Reset = 2,
        LoadState = 3,
        Stop = 4,
        ExternalTouch = 5,
    };

    struct Config
    {
        std::int64_t touchDownOffset = 600;
        std::int64_t touchUpOffset = 608;
        std::int64_t windowOffset = 758;
        std::int64_t endOffset = 818;
        std::uint16_t touchX = 128;
        std::uint16_t touchY = 96;
    };

    struct Telemetry
    {
        bool valid = false;
        std::uint64_t updateId = 0;
        std::uint64_t hostConsumed = 0;
        std::uint64_t ticksAtConsumption = 0;
        std::uint64_t framesAtConsumption = 0;
        std::uint64_t levelPostConsumption = 0;
        std::uint64_t levelPostWrite = 0;
        std::uint64_t ownerGeneration = 0;
    };

    struct Marker
    {
        bool valid = false;
        Event event = Event::TouchDown;
        std::uint64_t generation = 0;
        std::uint64_t steadyNs = 0;
        std::int64_t completedFrame = -1;
        Telemetry telemetry {};
    };

    struct Snapshot
    {
        State state = State::Idle;
        std::uint64_t generation = 0;
        std::int64_t anchorFrame = -1;
        std::int64_t lastCompletedFrame = -1;
        Config config {};
        bool touchHeld = false;
        std::uint32_t abortReason = 0;
        std::array<Marker, 4> markers {};
    };

    static constexpr std::int64_t kCurrentFrameAnchor = -1;

    bool Arm(
        std::int64_t currentCompletedFrame,
        std::int64_t requestedAnchorFrame,
        const Config& config) noexcept
    {
        if (snapshot_.state == State::Armed)
            return false;

        const std::int64_t anchor = requestedAnchorFrame == kCurrentFrameAnchor
            ? currentCompletedFrame
            : requestedAnchorFrame;
        if (!ValidConfig(config)
            || currentCompletedFrame < 0
            || anchor < 0
            || WouldOverflow(anchor, config.endOffset)
            || currentCompletedFrame > anchor + config.touchDownOffset)
        {
            return false;
        }

        AdvanceGeneration();
        snapshot_ = Snapshot {};
        snapshot_.state = State::Armed;
        snapshot_.generation = generation_;
        snapshot_.anchorFrame = anchor;
        snapshot_.lastCompletedFrame = currentCompletedFrame;
        snapshot_.config = config;
        return true;
    }

    PreAction BeforeRunFrame(
        std::int64_t currentCompletedFrame,
        std::uint64_t steadyNs,
        const Telemetry& telemetry) noexcept
    {
        if (snapshot_.state != State::Armed)
            return PreAction::None;

        snapshot_.lastCompletedFrame = currentCompletedFrame;
        const std::int64_t downFrame =
            snapshot_.anchorFrame + snapshot_.config.touchDownOffset;
        const std::int64_t upFrame =
            snapshot_.anchorFrame + snapshot_.config.touchUpOffset;

        if (!snapshot_.markers[MarkerIndex(Event::TouchDown)].valid)
        {
            if (currentCompletedFrame > downFrame)
                return MarkMissed(currentCompletedFrame);
            if (currentCompletedFrame == downFrame)
            {
                Record(Event::TouchDown, currentCompletedFrame, steadyNs, telemetry);
                snapshot_.touchHeld = true;
                return PreAction::TouchDown;
            }
        }

        if (snapshot_.markers[MarkerIndex(Event::TouchDown)].valid
            && !snapshot_.markers[MarkerIndex(Event::TouchUp)].valid)
        {
            if (currentCompletedFrame > upFrame)
                return MarkMissed(currentCompletedFrame);
            if (currentCompletedFrame == upFrame)
            {
                Record(Event::TouchUp, currentCompletedFrame, steadyNs, telemetry);
                snapshot_.touchHeld = false;
                return PreAction::TouchUp;
            }
        }

        return PreAction::None;
    }

    PreAction AfterRunFrame(
        std::int64_t completedFrame,
        std::uint64_t steadyNs,
        const Telemetry& telemetry) noexcept
    {
        if (snapshot_.state != State::Armed)
            return PreAction::None;

        snapshot_.lastCompletedFrame = completedFrame;
        const std::int64_t windowFrame =
            snapshot_.anchorFrame + snapshot_.config.windowOffset;
        const std::int64_t endFrame =
            snapshot_.anchorFrame + snapshot_.config.endOffset;

        auto& windowMarker = snapshot_.markers[MarkerIndex(Event::Window758)];
        if (!windowMarker.valid)
        {
            if (completedFrame > windowFrame)
                return MarkMissed(completedFrame);
            if (completedFrame == windowFrame)
                Record(Event::Window758, completedFrame, steadyNs, telemetry);
        }

        auto& endMarker = snapshot_.markers[MarkerIndex(Event::End818)];
        if (!endMarker.valid)
        {
            if (completedFrame > endFrame)
                return MarkMissed(completedFrame);
            if (completedFrame == endFrame)
            {
                Record(Event::End818, completedFrame, steadyNs, telemetry);
                snapshot_.state = State::Completed;
            }
        }

        return PreAction::None;
    }

    bool Abort(std::uint32_t reason, std::int64_t currentCompletedFrame) noexcept
    {
        const bool releaseNeeded = snapshot_.touchHeld;
        AdvanceGeneration();
        snapshot_.generation = generation_;
        snapshot_.lastCompletedFrame = currentCompletedFrame;
        snapshot_.touchHeld = false;
        snapshot_.abortReason = reason;
        snapshot_.state = State::Aborted;
        return releaseNeeded;
    }

    [[nodiscard]] const Snapshot& GetSnapshot() const noexcept
    {
        return snapshot_;
    }

    [[nodiscard]] bool IsArmed() const noexcept
    {
        return snapshot_.state == State::Armed;
    }

private:
    static constexpr std::size_t MarkerIndex(Event event) noexcept
    {
        return static_cast<std::size_t>(event);
    }

    static constexpr bool ValidConfig(const Config& config) noexcept
    {
        return config.touchDownOffset >= 0
            && config.touchDownOffset < config.touchUpOffset
            && config.touchUpOffset < config.windowOffset
            && config.windowOffset < config.endOffset;
    }

    static constexpr bool WouldOverflow(
        std::int64_t anchor,
        std::int64_t offset) noexcept
    {
        return offset > std::numeric_limits<std::int64_t>::max() - anchor;
    }

    void AdvanceGeneration() noexcept
    {
        generation_++;
        if (generation_ == 0)
            generation_ = 1;
    }

    void Record(
        Event event,
        std::int64_t completedFrame,
        std::uint64_t steadyNs,
        const Telemetry& telemetry) noexcept
    {
        auto& marker = snapshot_.markers[MarkerIndex(event)];
        marker.valid = true;
        marker.event = event;
        marker.generation = snapshot_.generation;
        marker.steadyNs = steadyNs;
        marker.completedFrame = completedFrame;
        marker.telemetry = telemetry;
    }

    PreAction MarkMissed(std::int64_t completedFrame) noexcept
    {
        const bool releaseNeeded = snapshot_.touchHeld;
        AdvanceGeneration();
        snapshot_.generation = generation_;
        snapshot_.touchHeld = false;
        snapshot_.lastCompletedFrame = completedFrame;
        snapshot_.state = State::Missed;
        return releaseNeeded ? PreAction::MissedRelease : PreAction::None;
    }

    std::uint64_t generation_ = 0;
    Snapshot snapshot_ {};
};

}

#endif

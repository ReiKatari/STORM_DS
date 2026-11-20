/*
    Copyright 2016-2025 Arisotura

    This file is part of melonDS.

    melonDS is free software: you can redistribute it and/or modify it under
    the terms of the GNU General Public License as published by the Free
    Software Foundation, either version 3 of the License, or (at your option)
    any later version.

    melonDS is distributed in the hope that it will be useful, but WITHOUT ANY
    WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
    FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.

    You should have received a copy of the GNU General Public License along
    with melonDS. If not, see http://www.gnu.org/licenses/.
*/

#include "RewindManager.h"
#include <algorithm>
#include <cstring>
#include <list>

namespace melonDS
{

const int FRAMES_PER_SECOND = 60;

RewindManager::RewindManager(bool enabled, int rewindLengthSeconds, int rewindCapturingIntervalSeconds, size_t rewindBufferSize, size_t screenshotBufferSize) :
    Enabled(enabled),
    RewindLengthSeconds(rewindLengthSeconds),
    RewindCapturingIntervalSeconds(rewindCapturingIntervalSeconds),
    SavestateBufferSize(static_cast<u32>(rewindBufferSize)),
    ScreenshotBufferSize(static_cast<u32>(screenshotBufferSize))
{
}

RewindManager::~RewindManager()
{
    Reset();
}

void RewindManager::UpdateRewindSettings(bool enabled, int rewindLengthSeconds, int rewindCapturingIntervalSeconds)
{
    std::lock_guard<std::mutex> lock(RewindMutex);
    RewindLengthSeconds = rewindLengthSeconds;
    RewindCapturingIntervalSeconds = rewindCapturingIntervalSeconds;

    if (Enabled)
    {
        if (!enabled || RewindWindowSize() <= 0)
        {
            for (const auto& state : RewindWindow)
                DeleteRewindSaveState(state);
            RewindWindow.clear();
        }
        else
        {
            TrimRewindWindowIfRequired();
        }
    }

    Enabled = enabled;
}

bool RewindManager::ShouldCaptureState(int currentFrame)
{
    std::lock_guard<std::mutex> lock(RewindMutex);
    if (!Enabled || RewindCapturingIntervalSeconds <= 0 || RewindWindowSize() <= 0)
    {
        return false;
    }

    return currentFrame % (RewindCapturingIntervalSeconds * FRAMES_PER_SECOND) == 0;
}

RewindSaveState* RewindManager::GetNextRewindSaveState(int currentFrame)
{
    std::lock_guard<std::mutex> lock(RewindMutex);
    const int windowSize = RewindWindowSize();
    if (windowSize <= 0)
        return nullptr;

    if (RewindWindow.size() < static_cast<size_t>(windowSize))
    {
        // Window is not yet full. Create new savestate
        RewindSaveState newRewindSaveState = CreateRewindSaveState(currentFrame);
        RewindWindow.push_front(newRewindSaveState);
    }
    else
    {
        // Window is already full. Reuse the oldest savestate and move it to the front
        auto oldestState = RewindWindow.back();
        oldestState.frame = currentFrame;
        oldestState.bufferContentSize = 0;
        RewindWindow.pop_back();
        RewindWindow.push_front(oldestState);
    }

    return &*RewindWindow.begin();
}

std::list<RewindSaveState> RewindManager::GetRewindWindow()
{
    std::lock_guard<std::mutex> lock(RewindMutex);
    std::list<RewindSaveState> snapshot;
    for (const auto& state : RewindWindow)
    {
        if (state.buffer == nullptr || state.bufferSize == 0 || state.bufferContentSize == 0 ||
            state.screenshot == nullptr || state.screenshotSize == 0)
        {
            continue;
        }

        const u32 copyBufferSize = std::min(state.bufferContentSize, state.bufferSize);
        std::shared_ptr<u8[]> copiedBuffer(new u8[copyBufferSize]);
        std::memcpy(copiedBuffer.get(), state.buffer, copyBufferSize);

        std::shared_ptr<u8[]> copiedScreenshot(new u8[state.screenshotSize]);
        std::memcpy(copiedScreenshot.get(), state.screenshot, state.screenshotSize);

        snapshot.push_back(RewindSaveState {
            .buffer = copiedBuffer.get(),
            .bufferSize = copyBufferSize,
            .bufferContentSize = copyBufferSize,
            .screenshot = copiedScreenshot.get(),
            .screenshotSize = state.screenshotSize,
            .frame = state.frame,
            .ownedBuffer = std::move(copiedBuffer),
            .ownedScreenshot = std::move(copiedScreenshot),
        });
    }
    return snapshot;
}

void RewindManager::OnRewindFromState(RewindSaveState state)
{
    std::lock_guard<std::mutex> lock(RewindMutex);
    auto iterator = RewindWindow.begin();
    while (iterator != RewindWindow.end() && (*iterator).frame > state.frame)
    {
        RewindSaveState lastState = *iterator;
        DeleteRewindSaveState(lastState);
        iterator = RewindWindow.erase(iterator);
    }
}

RewindSaveState RewindManager::CreateRewindSaveState(int frame)
{
    return RewindSaveState {
        .buffer = new u8[SavestateBufferSize],
        .bufferSize = SavestateBufferSize,
        .bufferContentSize = 0,
        .screenshot = new u8[ScreenshotBufferSize],
        .screenshotSize = ScreenshotBufferSize,
        .frame = frame
    };
}

void RewindManager::TrimRewindWindowIfRequired()
{
    const size_t windowSize = static_cast<size_t>(std::max(0, RewindWindowSize()));
    while (RewindWindow.size() > windowSize)
    {
        auto lastState = RewindWindow.back();
        DeleteRewindSaveState(lastState);
        RewindWindow.pop_back();
    }
}

void RewindManager::Reset()
{
    std::lock_guard<std::mutex> lock(RewindMutex);
    for (const auto& state : RewindWindow)
    {
        DeleteRewindSaveState(state);
    }

    RewindWindow.clear();
}

void RewindManager::DeleteRewindSaveState(RewindSaveState state)
{
    if (!state.ownedBuffer)
        delete[] state.buffer;
    if (!state.ownedScreenshot)
        delete[] state.screenshot;
}

}

/*
    Copyright 2016-2022 melonDS team

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

#include <stdio.h>
#include <string.h>

#include "SaveManager.h"
#include "Platform.h"

SaveManager::SaveManager(std::string path)
{
    SecondaryBuffer = nullptr;
    SecondaryBufferLength = 0;
    SecondaryBufferLock = Platform::Mutex_Create();

    Running = false;

    Path = std::move(path);

    Buffer = nullptr;
    Length = 0;
    FlushRequested = false;

    FlushVersion = 0;
    PreviousFlushVersion = 0;
    TimeAtLastFlushRequest = 0;
    Thread = nullptr;

    if (!Path.empty())
    {
        Running = true;
        Thread = Platform::Thread_Create(std::bind(&SaveManager::run, this));
        if (Thread == nullptr)
        {
            Running = false;
        }
    }
}

SaveManager::~SaveManager()
{
    const bool wasRunning = Running.exchange(false, std::memory_order_acq_rel);
    if (Thread != nullptr)
    {
        Platform::Thread_Wait(Thread);
        Platform::Thread_Free(Thread);
        Thread = nullptr;
    }

    if (wasRunning)
    {
        FlushSecondaryBuffer();
    }

    if (SecondaryBufferLock != nullptr)
    {
        Platform::Mutex_Lock(SecondaryBufferLock);
        SecondaryBuffer = nullptr;
        SecondaryBufferLength = 0;
        Platform::Mutex_Unlock(SecondaryBufferLock);
        Platform::Mutex_Free(SecondaryBufferLock);
        SecondaryBufferLock = nullptr;
    }
    else
    {
        SecondaryBuffer = nullptr;
        SecondaryBufferLength = 0;
    }

    Buffer = nullptr;
}

std::string SaveManager::GetPath()
{
    if (SecondaryBufferLock == nullptr)
        return Path;

    Platform::Mutex_Lock(SecondaryBufferLock);
    std::string pathCopy = Path;
    Platform::Mutex_Unlock(SecondaryBufferLock);
    return pathCopy;
}

void SaveManager::SetPath(std::string path, bool reload)
{
    std::string targetPath;
    if (SecondaryBufferLock != nullptr)
        Platform::Mutex_Lock(SecondaryBufferLock);
    Path = std::move(path);
    targetPath = Path;
    if (SecondaryBufferLock != nullptr)
        Platform::Mutex_Unlock(SecondaryBufferLock);

    if (reload)
    {
        FileHandle* f = Platform::OpenFile(targetPath, FileMode::Read);
        if (f)
        {
            if (u32 length = static_cast<u32>(Platform::FileLength(f)); length != Length)
            { // If the new file is a different size, we need to re-allocate the buffer.
                Length = length;
                Buffer = Length > 0 ? std::make_unique<u8[]>(Length) : nullptr;
            }

            if (Length > 0 && Buffer)
                FileRead(Buffer.get(), 1, Length, f);
            CloseFile(f);
        }
    }
    else
        FlushRequested.store(true, std::memory_order_release);
}

void SaveManager::RequestFlush(const u8* savedata, u32 savelen, u32 writeoffset, u32 writelen)
{
    if (savedata == nullptr || savelen == 0)
        return;

    if (Length != savelen || !Buffer)
    {
        Length = savelen;
        Buffer = std::make_unique<u8[]>(Length);

        memcpy(Buffer.get(), savedata, Length);
    }
    else
    {
        if (writeoffset >= savelen)
            writeoffset %= savelen;
        if (writelen > savelen)
            writelen = savelen;

        if ((writeoffset + writelen) > savelen)
        {
            u32 len = savelen - writeoffset;
            memcpy(&Buffer[writeoffset], &savedata[writeoffset], len);
            len = writelen - len;
            if (len > savelen) len = savelen;
            memcpy(&Buffer[0], &savedata[0], len);
        }
        else
        {
            memcpy(&Buffer[writeoffset], &savedata[writeoffset], writelen);
        }
    }

    FlushRequested.store(true, std::memory_order_release);
}

void SaveManager::CheckFlush()
{
    if (!FlushRequested.load(std::memory_order_acquire)) return;
    if (SecondaryBufferLock == nullptr) return;

    Platform::Mutex_Lock(SecondaryBufferLock);

    Log(LogLevel::Info, "SaveManager: Flush requested\n");

    if (SecondaryBufferLength != Length)
    {
        SecondaryBufferLength = Length;
        SecondaryBuffer = SecondaryBufferLength > 0 ? std::make_unique<u8[]>(SecondaryBufferLength) : nullptr;
    }

    if (Length > 0 && Buffer && SecondaryBuffer)
        memcpy(SecondaryBuffer.get(), Buffer.get(), Length);

    FlushRequested.store(false, std::memory_order_release);
    FlushVersion.fetch_add(1, std::memory_order_acq_rel);
    TimeAtLastFlushRequest.store(time(nullptr), std::memory_order_release);

    Platform::Mutex_Unlock(SecondaryBufferLock);
}

void SaveManager::run()
{
    for (;;)
    {
        Platform::Sleep(100000);

        if (!Running.load(std::memory_order_acquire)) return;

        const time_t lastRequest = TimeAtLastFlushRequest.load(std::memory_order_acquire);
        // We debounce for two seconds after last flush request to ensure that writing has finished.
        if (lastRequest == 0 || difftime(time(nullptr), lastRequest) < 2)
        {
            continue;
        }

        FlushSecondaryBuffer();
    }
}

void SaveManager::FlushSecondaryBuffer(u8* dst, u32 dstLength)
{
    if (SecondaryBufferLock == nullptr)
        return;

    Platform::Mutex_Lock(SecondaryBufferLock);

    if (!SecondaryBuffer || (!dst && !NeedsFlush()) || (dst && dstLength < SecondaryBufferLength))
    {
        Platform::Mutex_Unlock(SecondaryBufferLock);
        return;
    }

    if (dst)
    {
        if (SecondaryBufferLength > 0)
            memcpy(dst, SecondaryBuffer.get(), SecondaryBufferLength);
    }
    else if (!Path.empty())
    {
        FileHandle* f = Platform::OpenFile(Path, FileMode::Write);
        if (f)
        {
            if (SecondaryBufferLength > 0)
                FileWrite(SecondaryBuffer.get(), SecondaryBufferLength, 1, f);
            Log(LogLevel::Info, "SaveManager: Wrote %u bytes to %s\n", SecondaryBufferLength, Path.c_str());
            CloseFile(f);
        }
    }
    PreviousFlushVersion.store(FlushVersion.load(std::memory_order_acquire), std::memory_order_release);
    TimeAtLastFlushRequest.store(0, std::memory_order_release);
    Platform::Mutex_Unlock(SecondaryBufferLock);
}

bool SaveManager::NeedsFlush()
{
    return FlushVersion.load(std::memory_order_acquire) != PreviousFlushVersion.load(std::memory_order_acquire);
}

void SaveManager::FlushNow()
{
    CheckFlush();
    FlushSecondaryBuffer();
}

#include "Platform.h"
#include "net/MPInterface.h"

#include <cassert>
#include <cstdarg>
#include <cstdio>
#include <cstdlib>
#include <cstring>
#include <chrono>
#include <condition_variable>
#include <filesystem>
#include <functional>
#include <mutex>
#include <string>
#include <thread>
#include <vector>

#if defined(_WIN32) || defined(_MSC_VER)
  #ifndef WIN32_LEAN_AND_MEAN
  #define WIN32_LEAN_AND_MEAN
  #endif
  #ifndef NOMINMAX
  #define NOMINMAX
  #endif
  #include <windows.h>
  #include <io.h>
  #define fseek64 _fseeki64
  #define ftell64 _ftelli64
#else
  #include <dlfcn.h>
  #include <unistd.h>
  #define fseek64 fseeko
  #define ftell64 ftello
  #if defined(__ANDROID__)
    #include <android/log.h>
  #endif
#endif

namespace melonDS::Platform
{

#if defined(_WIN32) || defined(_MSC_VER)
static std::wstring Utf8ToWide(const std::string& str)
{
    if (str.empty()) return L"";
    int size_needed = MultiByteToWideChar(CP_UTF8, 0, str.c_str(), (int)str.size(), NULL, 0);
    std::wstring wstr(size_needed, 0);
    MultiByteToWideChar(CP_UTF8, 0, str.c_str(), (int)str.size(), &wstr[0], size_needed);
    return wstr;
}
#endif

struct FileHandle
{
    FILE* file = nullptr;
    std::string path;
};

struct Thread
{
    std::thread th;
};

struct Semaphore
{
    std::mutex mtx;
    std::condition_variable cv;
    int count = 0;
};

struct Mutex
{
    std::recursive_mutex mtx;
};

struct DynamicLibrary
{
    void* handle = nullptr;
};

struct AACDecoder
{
    bool valid = false;
};

static std::string gDiagnosticLog;
static std::mutex gDiagMutex;
static bool gDiagCapture = false;

void SignalStop(StopReason reason, void* userdata)
{
    (void)reason;
    (void)userdata;
}

std::string GetLocalFilePath(const std::string& filename)
{
    return filename;
}

static const char* GetFileModeString(FileMode mode, bool exists)
{
    if (mode & FileMode::Append) {
        if (mode & FileMode::Read) return "a+b";
        return "ab";
    }
    if ((mode & FileMode::Write) && (mode & FileMode::Read)) {
        if (mode & FileMode::Preserve) {
            return exists ? "r+b" : "w+b";
        }
        return "w+b";
    }
    if (mode & FileMode::Write) {
        return "wb";
    }
    return "rb";
}

FileHandle* OpenFile(const std::string& path, FileMode mode)
{
    bool exists = FileExists(path);
    if ((mode & FileMode::NoCreate) && !exists) {
        return nullptr;
    }

    const char* smode = GetFileModeString(mode, exists);
    FILE* f = nullptr;

#if defined(_WIN32) || defined(_MSC_VER)
    std::wstring wpath = Utf8ToWide(path);
    std::wstring wmode = Utf8ToWide(smode);
    f = _wfopen(wpath.c_str(), wmode.c_str());
#else
    f = std::fopen(path.c_str(), smode);
#endif

    if (!f) return nullptr;

    auto* handle = new FileHandle();
    handle->file = f;
    handle->path = path;
    return handle;
}

FileHandle* OpenLocalFile(const std::string& path, FileMode mode)
{
    return OpenFile(path, mode);
}

bool FileExists(const std::string& name)
{
    try {
#if defined(_WIN32) || defined(_MSC_VER)
        return std::filesystem::exists(std::filesystem::u8path(name));
#else
        return std::filesystem::exists(name);
#endif
    } catch (...) {
        return false;
    }
}

bool LocalFileExists(const std::string& name)
{
    return FileExists(name);
}

bool CheckFileWritable(const std::string& filepath)
{
    FileHandle* h = OpenFile(filepath, FileMode::ReadWriteExisting);
    if (h) {
        CloseFile(h);
        return true;
    }
    h = OpenFile(filepath, FileMode::Write);
    if (h) {
        CloseFile(h);
        return true;
    }
    return false;
}

bool CheckLocalFileWritable(const std::string& filepath)
{
    return CheckFileWritable(filepath);
}

bool CloseFile(FileHandle* file)
{
    if (!file) return false;
    if (file->file) {
        std::fclose(file->file);
        file->file = nullptr;
    }
    delete file;
    return true;
}

bool IsEndOfFile(FileHandle* file)
{
    if (!file || !file->file) return true;
    return std::feof(file->file) != 0;
}

bool FileReadLine(char* str, int count, FileHandle* file)
{
    if (!file || !file->file) return false;
    return std::fgets(str, count, file->file) != nullptr;
}

u64 FilePosition(FileHandle* file)
{
    if (!file || !file->file) return 0;
    auto pos = ftell64(file->file);
    return pos < 0 ? 0 : (u64)pos;
}

bool FileSeek(FileHandle* file, s64 offset, FileSeekOrigin origin)
{
    if (!file || !file->file) return false;
    int whence = SEEK_SET;
    if (origin == FileSeekOrigin::Current) whence = SEEK_CUR;
    else if (origin == FileSeekOrigin::End) whence = SEEK_END;
    return fseek64(file->file, offset, whence) == 0;
}

void FileRewind(FileHandle* file)
{
    if (file && file->file) {
        std::rewind(file->file);
    }
}

u64 FileRead(void* data, u64 size, u64 count, FileHandle* file)
{
    if (!file || !file->file || !data || size == 0 || count == 0) return 0;
    return (u64)std::fread(data, (size_t)size, (size_t)count, file->file);
}

bool FileFlush(FileHandle* file)
{
    if (!file || !file->file) return false;
    return std::fflush(file->file) == 0;
}

u64 FileWrite(const void* data, u64 size, u64 count, FileHandle* file)
{
    if (!file || !file->file || !data || size == 0 || count == 0) return 0;
    return (u64)std::fwrite(data, (size_t)size, (size_t)count, file->file);
}

u64 FileWriteFormatted(FileHandle* file, const char* fmt, ...)
{
    if (!file || !file->file) return 0;
    va_list args;
    va_start(args, fmt);
    int written = std::vfprintf(file->file, fmt, args);
    va_end(args);
    return written > 0 ? (u64)written : 0;
}

u64 FileLength(FileHandle* file)
{
    if (!file || !file->file) return 0;
    auto cur = ftell64(file->file);
    fseek64(file->file, 0, SEEK_END);
    auto len = ftell64(file->file);
    fseek64(file->file, cur, SEEK_SET);
    return len < 0 ? 0 : (u64)len;
}

void Log(LogLevel level, const char* fmt, ...)
{
    (void)level;
    char buffer[2048];
    va_list args;
    va_start(args, fmt);
    std::vsnprintf(buffer, sizeof(buffer), fmt, args);
    va_end(args);

    if (gDiagCapture) {
        std::lock_guard<std::mutex> lock(gDiagMutex);
        gDiagnosticLog += buffer;
        gDiagnosticLog += "\n";
    }

#if defined(_WIN32) || defined(_MSC_VER)
    OutputDebugStringA(buffer);
    OutputDebugStringA("\n");
#elif defined(__ANDROID__)
    __android_log_print(ANDROID_LOG_INFO, "melonDS", "%s", buffer);
#else
    std::fprintf(stderr, "%s\n", buffer);
#endif
}

void StartBootDiagnosticCapture()
{
    std::lock_guard<std::mutex> lock(gDiagMutex);
    gDiagnosticLog.clear();
    gDiagCapture = true;
}

std::string StopAndGetBootDiagnostic()
{
    std::lock_guard<std::mutex> lock(gDiagMutex);
    gDiagCapture = false;
    return gDiagnosticLog;
}

Thread* Thread_Create(std::function<void()> func)
{
    auto* t = new Thread();
    t->th = std::thread(func);
    return t;
}

void Thread_Free(Thread* thread)
{
    if (!thread) return;
    if (thread->th.joinable()) {
        thread->th.join();
    }
    delete thread;
}

void Thread_Wait(Thread* thread)
{
    if (!thread) return;
    if (thread->th.joinable()) {
        thread->th.join();
    }
}

Semaphore* Semaphore_Create()
{
    return new Semaphore();
}

void Semaphore_Free(Semaphore* sema)
{
    delete sema;
}

void Semaphore_Reset(Semaphore* sema)
{
    if (!sema) return;
    std::lock_guard<std::mutex> lock(sema->mtx);
    sema->count = 0;
}

void Semaphore_Wait(Semaphore* sema)
{
    if (!sema) return;
    std::unique_lock<std::mutex> lock(sema->mtx);
    sema->cv.wait(lock, [sema]() { return sema->count > 0; });
    --sema->count;
}

bool Semaphore_TryWait(Semaphore* sema, int timeout_ms)
{
    if (!sema) return false;
    std::unique_lock<std::mutex> lock(sema->mtx);
    if (timeout_ms <= 0) {
        if (sema->count > 0) {
            --sema->count;
            return true;
        }
        return false;
    }
    bool success = sema->cv.wait_for(lock, std::chrono::milliseconds(timeout_ms), [sema]() {
        return sema->count > 0;
    });
    if (success) {
        --sema->count;
        return true;
    }
    return false;
}

void Semaphore_Post(Semaphore* sema, int count)
{
    if (!sema || count <= 0) return;
    std::lock_guard<std::mutex> lock(sema->mtx);
    sema->count += count;
    if (count == 1) {
        sema->cv.notify_one();
    } else {
        sema->cv.notify_all();
    }
}

Mutex* Mutex_Create()
{
    return new Mutex();
}

void Mutex_Free(Mutex* mutex)
{
    delete mutex;
}

void Mutex_Lock(Mutex* mutex)
{
    if (mutex) mutex->mtx.lock();
}

void Mutex_Unlock(Mutex* mutex)
{
    if (mutex) mutex->mtx.unlock();
}

bool Mutex_TryLock(Mutex* mutex)
{
    return mutex ? mutex->mtx.try_lock() : false;
}

void Sleep(u64 usecs)
{
    std::this_thread::sleep_for(std::chrono::microseconds(usecs));
}

u64 GetMSCount()
{
    return (u64)std::chrono::duration_cast<std::chrono::milliseconds>(
        std::chrono::steady_clock::now().time_since_epoch()).count();
}

u64 GetUSCount()
{
    return (u64)std::chrono::duration_cast<std::chrono::microseconds>(
        std::chrono::steady_clock::now().time_since_epoch()).count();
}

void WriteNDSSave(const u8* savedata, u32 savelen, u32 writeoffset, u32 writelen, void* userdata)
{
    (void)savedata; (void)savelen; (void)writeoffset; (void)writelen; (void)userdata;
}

void WriteGBASave(const u8* savedata, u32 savelen, u32 writeoffset, u32 writelen, void* userdata)
{
    (void)savedata; (void)savelen; (void)writeoffset; (void)writelen; (void)userdata;
}

void WriteFirmware(const Firmware& firmware, u32 writeoffset, u32 writelen, void* userdata)
{
    (void)firmware; (void)writeoffset; (void)writelen; (void)userdata;
}

void WriteDateTime(int year, int month, int day, int hour, int minute, int second, void* userdata)
{
    (void)year; (void)month; (void)day; (void)hour; (void)minute; (void)second; (void)userdata;
}

void MP_Begin(void* userdata) { (void)userdata; }
void MP_End(void* userdata) { (void)userdata; }
int MP_SendPacket(u8* data, int len, u64 timestamp, void* userdata) { (void)data; (void)len; (void)timestamp; (void)userdata; return 0; }
int MP_RecvPacket(u8* data, u64* timestamp, void* userdata) { (void)data; (void)timestamp; (void)userdata; return 0; }
int MP_SendCmd(u8* data, int len, u64 timestamp, void* userdata) { (void)data; (void)len; (void)timestamp; (void)userdata; return 0; }
int MP_SendReply(u8* data, int len, u64 timestamp, u16 aid, void* userdata) { (void)data; (void)len; (void)timestamp; (void)aid; (void)userdata; return 0; }
int MP_SendAck(u8* data, int len, u64 timestamp, void* userdata) { (void)data; (void)len; (void)timestamp; (void)userdata; return 0; }
int MP_SendProgress(u64 timestamp, void* userdata) { (void)timestamp; (void)userdata; return 0; }
bool MP_ConservativeAck(void* userdata) { (void)userdata; return false; }
int MP_RecvHostPacket(u8* data, u64* timestamp, void* userdata) { (void)data; (void)timestamp; (void)userdata; return 0; }
u16 MP_RecvReplies(u8* data, u64 timestamp, u16 aidmask, void* userdata) { (void)data; (void)timestamp; (void)aidmask; (void)userdata; return 0; }
WMServiceInfo MP_WMInfo(void* userdata) { (void)userdata; return {}; }
void MP_WMAbort(void* userdata) { (void)userdata; }
u16 MP_WMSend(u16 peers, const u8* data, u16 length, void* userdata) { (void)peers; (void)data; (void)length; (void)userdata; return 0; }
int MP_WMReceive(WMServicePacket& packet, void* userdata) { (void)packet; (void)userdata; return 0; }
void MP_WMReset(void* userdata) { (void)userdata; }

int Net_SendPacket(u8* data, int len, void* userdata) { (void)data; (void)len; (void)userdata; return 0; }
int Net_RecvPacket(u8* data, void* userdata) { (void)data; (void)userdata; return 0; }

void Camera_Start(int num, void* userdata) { (void)num; (void)userdata; }
void Camera_Stop(int num, void* userdata) { (void)num; (void)userdata; }
void Camera_CaptureFrame(int num, u32* frame, int width, int height, bool yuv, void* userdata)
{
    (void)num; (void)frame; (void)width; (void)height; (void)yuv; (void)userdata;
}

void Mic_Start(void* userdata) { (void)userdata; }
void Mic_Stop(void* userdata) { (void)userdata; }
int Mic_ReadInput(s16* data, int maxlength, void* userdata)
{
    (void)data; (void)maxlength; (void)userdata;
    return 0;
}

AACDecoder* AAC_Init() { return new AACDecoder(); }
void AAC_DeInit(AACDecoder* dec) { delete dec; }
bool AAC_Configure(AACDecoder* dec, int frequency, int channels) { (void)dec; (void)frequency; (void)channels; return true; }
bool AAC_DecodeFrame(AACDecoder* dec, const void* input, int inputlen, void* output, int outputlen)
{
    (void)dec; (void)input; (void)inputlen; (void)output; (void)outputlen;
    return false;
}

bool Addon_KeyDown(KeyType type, void* userdata) { (void)type; (void)userdata; return false; }
void Addon_RumbleStart(u32 len, void* userdata) { (void)len; (void)userdata; }
void Addon_RumbleStop(void* userdata) { (void)userdata; }
float Addon_MotionQuery(MotionQueryType type, void* userdata) { (void)type; (void)userdata; return 0.0f; }

DynamicLibrary* DynamicLibrary_Load(const char* lib)
{
    if (!lib) return nullptr;
    void* handle = nullptr;
#if defined(_WIN32) || defined(_MSC_VER)
    handle = (void*)LoadLibraryA(lib);
#else
    handle = dlopen(lib, RTLD_NOW | RTLD_LOCAL);
#endif
    if (!handle) return nullptr;
    auto* dl = new DynamicLibrary();
    dl->handle = handle;
    return dl;
}

void DynamicLibrary_Unload(DynamicLibrary* lib)
{
    if (!lib) return;
#if defined(_WIN32) || defined(_MSC_VER)
    FreeLibrary((HMODULE)lib->handle);
#else
    dlclose(lib->handle);
#endif
    delete lib;
}

void* DynamicLibrary_LoadFunction(DynamicLibrary* lib, const char* name)
{
    if (!lib || !lib->handle || !name) return nullptr;
#if defined(_WIN32) || defined(_MSC_VER)
    return (void*)GetProcAddress((HMODULE)lib->handle, name);
#else
    return dlsym(lib->handle, name);
#endif
}

} // namespace melonDS::Platform

namespace MelonDSAndroid
{
bool areRendererDebugToolsEnabled() { return false; }
bool areRendererDebugBgObjLogsEnabled() { return false; }
int getRenderer2DDebugForcedMode(melonDS::u32 /*unit*/) { return -1; }
bool isRenderer2DDebugBgLayerEnabled(melonDS::u32 /*unit*/, melonDS::u32 /*bgnum*/) { return true; }
bool isRenderer2DDebugBgPriorityEnabled(melonDS::u32 /*unit*/, melonDS::u32 /*priority*/) { return true; }
bool isRenderer2DDebugBackgroundKindEnabled(melonDS::u32 /*featureFlag*/) { return true; }
bool areRenderer2DDebugObjectsEnabled(melonDS::u32 /*unit*/) { return true; }
bool isRenderer2DDebugObjectPriorityEnabled(melonDS::u32 /*unit*/, melonDS::u32 /*priority*/) { return true; }
bool isRenderer2DDebugObjectOrderEnabled(melonDS::u32 /*unit*/, melonDS::u32 /*orderBucket*/) { return true; }
bool isRenderer2DDebugObjectFeatureEnabled(melonDS::u32 /*featureFlag*/) { return true; }
bool areRenderer2DDebugControlsActive() { return false; }
bool isVulkanGpu2DPerfLoggingEnabled() { return false; }

bool isFastForwardActive() { return false; }
bool isRenderer3DDebugFeatureEnabled(melonDS::u32 /*featureFlag*/) { return true; }
bool areRenderer3DDebugControlsActive() { return false; }
melonDS::u32 getVulkanDiagnosticFlags() { return 0; }
}

#include "NDS.h"
#include "rcheevos.h"
#include "RetroAchievementsManager.h"
#include "LeaderboardAttemptCorrelation.h"
#include "LeaderboardScoreboardResponse.h"
#include "MelonDS.h"
#include "Platform.h"
#include "rc_consoles.h"
#include "types.h"
#include <algorithm>
#include <atomic>
#include <chrono>
#include <condition_variable>
#include <cstdlib>
#include <cstring>
#include <cctype>
#include <cerrno>
#include <limits>
#include <jni.h>
#include <sstream>
#include <thread>
#include <ctime>
#include <unordered_set>
#include <vector>

using namespace melonDS;

namespace MelonDSAndroid
{
namespace RetroAchievements
{

std::weak_ptr<MelonEventMessenger> RetroAchievementsManager::EventMessenger;
JavaVM* RetroAchievementsManager::javaVm = nullptr;

namespace {

constexpr u32 RA_DS_LOGICAL_MAIN_RAM_BASE = 0x00000000;
constexpr u32 RA_DS_LOGICAL_MAIN_RAM_END = 0x00FFFFFF;
constexpr u32 RA_DS_NATIVE_MAIN_RAM_BASE = 0x02000000;
constexpr u32 RA_DS_NATIVE_MAIN_RAM_END = 0x02FFFFFF;
constexpr u32 RA_DS_SHARED_WRAM_BASE = 0x03000000;
constexpr u32 RA_DS_SHARED_WRAM_END = 0x037FFFFF;
constexpr u32 RA_DS_ARM7_WRAM_BASE = 0x03800000;
constexpr u32 RA_DS_ARM7_WRAM_END = 0x03FFFFFF;
constexpr u32 RA_DS_LOGICAL_DTCM_BASE = 0x01000000;
constexpr u32 RA_DS_NATIVE_DTCM_PSEUDO_BASE = 0x0E000000;
constexpr u32 RA_DS_DTCM_PSEUDO_SIZE = 0x4000;
constexpr auto RC_CLIENT_LOGIN_TIMEOUT = std::chrono::milliseconds(10000);
constexpr auto RC_CLIENT_LOAD_TIMEOUT = std::chrono::milliseconds(35000);
constexpr int RC_CLIENT_BOOTSTRAP_MAX_ATTEMPTS = 2;
constexpr auto RC_CLIENT_BOOTSTRAP_RETRY_DELAY = std::chrono::milliseconds(500);
constexpr int RC_CLIENT_PERF_WINDOW_FRAMES = 180;
constexpr long long RC_CLIENT_PERF_WINDOW_AVG_US_LIMIT = 2000;
constexpr long long RC_CLIENT_PERF_WINDOW_PEAK_US_LIMIT = 7000;
constexpr long long RC_CLIENT_PERF_WINDOW_ISOLATED_SPIKE_LOG_US_LIMIT = 50000;
constexpr int RC_CLIENT_PERF_WINDOW_SLOW_FRAME_COUNT_LIMIT = 12;
constexpr int RC_CLIENT_PERF_CONSECUTIVE_SLOW_WINDOWS_FOR_WARNING = 2;
constexpr const char* RC_CLIENT_DEFAULT_IMAGE = "https://media.retroachievements.org/Images/000001.png";
constexpr const char* RC_CLIENT_DEFAULT_USER_AGENT = "melonDualDS-android/0.7.0";
constexpr int RC_CLIENT_HTTP_CONNECT_TIMEOUT_MS = 10000;
constexpr int RC_CLIENT_HTTP_READ_TIMEOUT_MS = 15000;
constexpr size_t RC_CLIENT_MAX_LOGGED_VALUE_LENGTH = 200;

uint64_t AllocatePendingSubmissionId()
{
    static std::atomic<uint64_t> nextId{1};
    uint64_t id = nextId.fetch_add(1, std::memory_order_relaxed);
    while (id == 0)
        id = nextId.fetch_add(1, std::memory_order_relaxed);
    return id;
}

uint64_t AllocatePendingSubmissionSequence()
{
    static std::atomic<uint64_t> nextSequence{1};
    uint64_t sequence = nextSequence.fetch_add(1, std::memory_order_relaxed);
    while (sequence == 0)
        sequence = nextSequence.fetch_add(1, std::memory_order_relaxed);
    return sequence;
}

bool AreLeaderboardDiagnosticsEnabled()
{
    return MelonDSAndroid::areRendererDebugToolsEnabled();
}

int64_t LeaderboardDiagnosticNowMs()
{
    return std::chrono::duration_cast<std::chrono::milliseconds>(
        std::chrono::steady_clock::now().time_since_epoch()
    ).count();
}

struct RcClientAsyncResult
{
    std::mutex lock;
    std::condition_variable condition;
    bool isCompleted = false;
    int result = RC_OK;
    std::string errorMessage;
};

struct RcClientWaitResult
{
    bool succeeded = false;
    bool timedOut = false;
    int result = RC_OK;
    std::string errorMessage;
};

long long GetCurrentThreadCpuTimeUs()
{
    timespec time{};
    if (clock_gettime(CLOCK_THREAD_CPUTIME_ID, &time) != 0)
        return -1;

    return static_cast<long long>(time.tv_sec) * 1000000LL + static_cast<long long>(time.tv_nsec / 1000LL);
}

const char* ExtractRcClientRequestAction(const char* postData)
{
    if (!postData)
        return nullptr;

    static thread_local char actionBuffer[64];
    const char* actionStart = strstr(postData, "r=");
    if (!actionStart)
        return nullptr;

    actionStart += 2;
    int index = 0;
    while (actionStart[index] != '\0' && actionStart[index] != '&' && index < (int) sizeof(actionBuffer) - 1)
    {
        actionBuffer[index] = actionStart[index];
        index++;
    }
    actionBuffer[index] = '\0';

    return actionBuffer;
}

int DecodeHexCharacter(char value)
{
    if (value >= '0' && value <= '9')
        return value - '0';
    if (value >= 'a' && value <= 'f')
        return 10 + (value - 'a');
    if (value >= 'A' && value <= 'F')
        return 10 + (value - 'A');

    return -1;
}

std::string DecodeRcClientFormComponent(const char* value, size_t length)
{
    if (!value || length == 0)
        return {};

    std::string decoded;
    decoded.reserve(length);

    for (size_t index = 0; index < length; index++)
    {
        const char character = value[index];
        if (character == '+' )
        {
            decoded.push_back(' ');
            continue;
        }

        if (character == '%' && index + 2 < length)
        {
            const int highNibble = DecodeHexCharacter(value[index + 1]);
            const int lowNibble = DecodeHexCharacter(value[index + 2]);
            if (highNibble >= 0 && lowNibble >= 0)
            {
                decoded.push_back(static_cast<char>((highNibble << 4) | lowNibble));
                index += 2;
                continue;
            }
        }

        decoded.push_back(character);
    }

    return decoded;
}

bool IsSensitiveRcClientParameter(const std::string& key)
{
    return key == "m" || key == "p" || key == "t" || key == "u" || key == "v" || key == "x";
}

std::string SanitizeRcClientParameterValue(const std::string& key, const std::string& value)
{
    if (IsSensitiveRcClientParameter(key))
        return "<redacted>";

    std::string normalizedValue;
    normalizedValue.reserve(value.size());
    for (char character : value)
    {
        switch (character)
        {
            case '\r': normalizedValue += "\\r"; break;
            case '\n': normalizedValue += "\\n"; break;
            default: normalizedValue.push_back(character); break;
        }
    }

    if (normalizedValue.size() <= RC_CLIENT_MAX_LOGGED_VALUE_LENGTH)
        return normalizedValue;

    std::ostringstream truncatedValue;
    truncatedValue
        << normalizedValue.substr(0, RC_CLIENT_MAX_LOGGED_VALUE_LENGTH)
        << "...(len=" << normalizedValue.size() << ")";
    return truncatedValue.str();
}

void AppendRcClientEncodedParameters(const char* encodedParameters, std::ostringstream* output, bool* hasAnyParameters)
{
    if (!encodedParameters || !output || !hasAnyParameters || encodedParameters[0] == '\0')
        return;

    const char* currentParameter = encodedParameters;
    while (*currentParameter != '\0')
    {
        const char* parameterEnd = strchr(currentParameter, '&');
        if (!parameterEnd)
            parameterEnd = currentParameter + strlen(currentParameter);

        const char* separator = static_cast<const char*>(memchr(currentParameter, '=', parameterEnd - currentParameter));
        const size_t keyLength = separator ? static_cast<size_t>(separator - currentParameter) : static_cast<size_t>(parameterEnd - currentParameter);
        const char* valueStart = separator ? separator + 1 : parameterEnd;
        const size_t valueLength = separator ? static_cast<size_t>(parameterEnd - valueStart) : 0;

        const std::string key = DecodeRcClientFormComponent(currentParameter, keyLength);
        const std::string value = DecodeRcClientFormComponent(valueStart, valueLength);

        if (*hasAnyParameters)
            (*output) << '&';

        (*output) << key << '=' << SanitizeRcClientParameterValue(key, value);
        *hasAnyParameters = true;

        if (*parameterEnd == '\0')
            break;

        currentParameter = parameterEnd + 1;
    }
}

std::string BuildRcClientSanitizedParameters(const rc_api_request_t* request)
{
    if (!request)
        return "<none>";

    std::ostringstream parameters;
    bool hasAnyParameters = false;

    if (request->url)
    {
        const char* queryStart = strchr(request->url, '?');
        if (queryStart && queryStart[1] != '\0')
            AppendRcClientEncodedParameters(queryStart + 1, &parameters, &hasAnyParameters);
    }

    if (request->post_data && request->post_data[0] != '\0')
        AppendRcClientEncodedParameters(request->post_data, &parameters, &hasAnyParameters);

    return hasAnyParameters ? parameters.str() : std::string("<none>");
}

std::string BuildRcClientLoggedResponseSample(const std::string& requestAction, const std::string& responseBody)
{
    (void) requestAction;
    if (responseBody.empty())
        return "<empty>";

    return "<redacted-response>";
}

std::string BuildRcClientSafeUrl(const char* url)
{
    if (!url)
        return "";

    const char* queryStart = strchr(url, '?');
    return queryStart ? std::string(url, static_cast<size_t>(queryStart - url)) : std::string(url);
}

bool TryExtractRcClientFormParameter(const char* encodedParameters, const char* expectedKey, std::string* output)
{
    if (!encodedParameters || !expectedKey || !output)
        return false;

    const char* currentParameter = encodedParameters;
    while (*currentParameter != '\0')
    {
        const char* parameterEnd = strchr(currentParameter, '&');
        if (!parameterEnd)
            parameterEnd = currentParameter + strlen(currentParameter);

        const char* separator = static_cast<const char*>(memchr(currentParameter, '=', parameterEnd - currentParameter));
        const size_t keyLength = separator ? static_cast<size_t>(separator - currentParameter) : static_cast<size_t>(parameterEnd - currentParameter);
        const std::string key = DecodeRcClientFormComponent(currentParameter, keyLength);
        if (key == expectedKey)
        {
            const char* valueStart = separator ? separator + 1 : parameterEnd;
            *output = DecodeRcClientFormComponent(valueStart, static_cast<size_t>(parameterEnd - valueStart));
            return true;
        }

        if (*parameterEnd == '\0')
            break;
        currentParameter = parameterEnd + 1;
    }

    return false;
}

std::optional<std::string> GetRcClientFormParameter(const rc_api_request_t* request, const char* key)
{
    if (!request || !key)
        return std::nullopt;

    std::string value;
    if (TryExtractRcClientFormParameter(request->post_data, key, &value))
        return value;

    if (request->url)
    {
        const char* queryStart = strchr(request->url, '?');
        if (queryStart && TryExtractRcClientFormParameter(queryStart + 1, key, &value))
            return value;
    }

    return std::nullopt;
}

std::optional<int64_t> ParseRcClientIntegerParameter(const rc_api_request_t* request, const char* key)
{
    const auto value = GetRcClientFormParameter(request, key);
    if (!value.has_value() || value->empty())
        return std::nullopt;

    char* end = nullptr;
    errno = 0;
    const long long parsed = std::strtoll(value->c_str(), &end, 10);
    if (errno == ERANGE || end == value->c_str() || !end || *end != '\0')
        return std::nullopt;

    return static_cast<int64_t>(parsed);
}

std::string ResolveRcClientRequestAction(const rc_api_request_t* request)
{
    if (!request)
        return "unknown";

    if (const char* action = ExtractRcClientRequestAction(request->post_data))
        return action;

    if (request->url)
    {
        const char* queryStart = strchr(request->url, '?');
        if (queryStart && queryStart[1] != '\0')
        {
            if (const char* action = ExtractRcClientRequestAction(queryStart + 1))
                return action;
        }
    }

    const std::string safeUrl = BuildRcClientSafeUrl(request->url);
    return safeUrl.empty() ? "unknown" : safeUrl;
}

const char* ResolveRcClientRequestMethod(const rc_api_request_t* request)
{
    return (request && request->post_data && request->post_data[0] != '\0') ? "POST" : "GET";
}

uint32_t ReadFromMirroredRegion(
    const uint8_t* memory,
    uint32_t memoryMask,
    uint32_t regionBase,
    uint32_t regionEnd,
    uint32_t address,
    uint8_t* buffer,
    uint32_t numBytes
)
{
    if (!memory || !buffer || numBytes == 0 || address < regionBase || address > regionEnd)
        return 0;

    uint32_t currentAddress = address;
    uint32_t readBytes = 0;
    while (readBytes < numBytes && currentAddress <= regionEnd)
    {
        const uint32_t regionOffset = currentAddress - regionBase;
        const uint32_t maskedOffset = regionOffset & memoryMask;
        const uint32_t bytesUntilRegionEnd = (regionEnd - currentAddress) + 1;
        uint32_t bytesUntilMirrorWrap = bytesUntilRegionEnd;
        if (memoryMask != 0xFFFFFFFFu)
            bytesUntilMirrorWrap = (memoryMask + 1u) - maskedOffset;

        const uint32_t chunkSize = std::min(
            std::min(numBytes - readBytes, bytesUntilRegionEnd),
            bytesUntilMirrorWrap
        );
        if (chunkSize == 0)
            break;

        std::memcpy(buffer + readBytes, memory + maskedOffset, chunkSize);
        readBytes += chunkSize;
        currentAddress += chunkSize;
    }

    return readBytes;
}

uint32_t ReadFromDtcmPseudoRegion(const NDS* nds, uint32_t address, uint8_t* buffer, uint32_t numBytes)
{
    if (!nds || !buffer || numBytes == 0)
        return 0;

    if (!nds->ARM9.DTCM || nds->ARM9.DTCMMask == 0 || nds->ARM9.DTCMBase == 0xFFFFFFFF)
        return 0;

    if (address < RA_DS_NATIVE_DTCM_PSEUDO_BASE || address >= (RA_DS_NATIVE_DTCM_PSEUDO_BASE + RA_DS_DTCM_PSEUDO_SIZE))
        return 0;

    u32 dtcmSize = ((~nds->ARM9.DTCMMask) & 0xFFFFF000) + 0x1000;
    if (dtcmSize == 0)
        return 0;

    u32 dtcmMask = dtcmSize - 1;
    return ReadFromMirroredRegion(
        nds->ARM9.DTCM,
        dtcmMask,
        RA_DS_NATIVE_DTCM_PSEUDO_BASE,
        (RA_DS_NATIVE_DTCM_PSEUDO_BASE + RA_DS_DTCM_PSEUDO_SIZE - 1),
        address,
        buffer,
        numBytes
    );
}

uint32_t ReadFromLogicalDtcmRegion(const NDS* nds, uint32_t address, uint8_t* buffer, uint32_t numBytes)
{
    if (!nds || !buffer || numBytes == 0)
        return 0;

    if (!nds->ARM9.DTCM || nds->ARM9.DTCMMask == 0 || nds->ARM9.DTCMBase == 0xFFFFFFFF)
        return 0;

    if (address < RA_DS_LOGICAL_DTCM_BASE || address >= (RA_DS_LOGICAL_DTCM_BASE + RA_DS_DTCM_PSEUDO_SIZE))
        return 0;

    u32 dtcmSize = ((~nds->ARM9.DTCMMask) & 0xFFFFF000) + 0x1000;
    if (dtcmSize == 0)
        return 0;

    u32 dtcmMask = dtcmSize - 1;
    return ReadFromMirroredRegion(
        nds->ARM9.DTCM,
        dtcmMask,
        RA_DS_LOGICAL_DTCM_BASE,
        (RA_DS_LOGICAL_DTCM_BASE + RA_DS_DTCM_PSEUDO_SIZE - 1),
        address,
        buffer,
        numBytes
    );
}

uint32_t ReadMemoryRange(const NDS* nds, uint32_t address, uint8_t* buffer, uint32_t numBytes)
{
    if (!nds || !buffer || numBytes == 0)
        return 0;

    if (address >= RA_DS_LOGICAL_MAIN_RAM_BASE && address <= RA_DS_LOGICAL_MAIN_RAM_END && nds->MainRAM)
    {
        return ReadFromMirroredRegion(
            nds->MainRAM,
            nds->MainRAMMask,
            RA_DS_LOGICAL_MAIN_RAM_BASE,
            RA_DS_LOGICAL_MAIN_RAM_END,
            address,
            buffer,
            numBytes
        );
    }

    if (address >= RA_DS_NATIVE_MAIN_RAM_BASE && address <= RA_DS_NATIVE_MAIN_RAM_END && nds->MainRAM)
    {
        return ReadFromMirroredRegion(
            nds->MainRAM,
            nds->MainRAMMask,
            RA_DS_NATIVE_MAIN_RAM_BASE,
            RA_DS_NATIVE_MAIN_RAM_END,
            address,
            buffer,
            numBytes
        );
    }

    if (address >= RA_DS_SHARED_WRAM_BASE && address <= RA_DS_SHARED_WRAM_END && nds->SWRAM_ARM9.Mem)
    {
        return ReadFromMirroredRegion(
            nds->SWRAM_ARM9.Mem,
            nds->SWRAM_ARM9.Mask,
            RA_DS_SHARED_WRAM_BASE,
            RA_DS_SHARED_WRAM_END,
            address,
            buffer,
            numBytes
        );
    }

    if (address >= RA_DS_ARM7_WRAM_BASE && address <= RA_DS_ARM7_WRAM_END && nds->ARM7WRAM)
    {
        return ReadFromMirroredRegion(
            nds->ARM7WRAM,
            nds->ARM7WRAMSize - 1,
            RA_DS_ARM7_WRAM_BASE,
            RA_DS_ARM7_WRAM_END,
            address,
            buffer,
            numBytes
        );
    }

    if (address >= RA_DS_LOGICAL_DTCM_BASE && address < (RA_DS_LOGICAL_DTCM_BASE + RA_DS_DTCM_PSEUDO_SIZE))
        return ReadFromLogicalDtcmRegion(nds, address, buffer, numBytes);

    return ReadFromDtcmPseudoRegion(nds, address, buffer, numBytes);
}

void RC_CCONV OnRcClientAsyncCompleted(int result, const char* errorMessage, rc_client_t* client, void* userdata)
{
    (void) client;
    if (!userdata)
        return;

    auto* asyncResult = static_cast<RcClientAsyncResult*>(userdata);
    std::lock_guard lock(asyncResult->lock);
    asyncResult->isCompleted = true;
    asyncResult->result = result;
    asyncResult->errorMessage = errorMessage ? errorMessage : "";
    asyncResult->condition.notify_all();
}

RcClientWaitResult WaitForRcClientResult(
    rc_client_t* client,
    rc_client_async_handle_t* asyncHandle,
    RcClientAsyncResult* asyncResult,
    std::chrono::milliseconds timeout
)
{
    if (!client || !asyncResult)
        return { false, false, RC_INVALID_STATE, "client or async result was not provided" };

    if (!asyncHandle)
    {
        std::lock_guard lock(asyncResult->lock);
        if (asyncResult->isCompleted)
        {
            return {
                asyncResult->result == RC_OK,
                false,
                asyncResult->result,
                asyncResult->errorMessage,
            };
        }

        return { false, false, RC_INVALID_STATE, "async handle was not created" };
    }

    std::unique_lock lock(asyncResult->lock);
    if (!asyncResult->condition.wait_for(lock, timeout, [=] { return asyncResult->isCompleted; }))
    {
        lock.unlock();
        rc_client_abort_async(client, asyncHandle);
        return { false, true, RC_API_SERVER_RESPONSE_RETRYABLE_CLIENT_ERROR, "timed out waiting for async rc_client result" };
    }

    return {
        asyncResult->result == RC_OK,
        false,
        asyncResult->result,
        asyncResult->errorMessage,
    };
}

void LogRcClientBootstrapFailure(const char* stage, int attempt, const RcClientWaitResult& waitResult)
{
    std::ostringstream builder;
    builder
        << "[RAClient] rc_client " << (stage ? stage : "bootstrap")
        << " attempt " << attempt << "/" << RC_CLIENT_BOOTSTRAP_MAX_ATTEMPTS
        << " failed";

    if (waitResult.timedOut)
        builder << " (timeout)";
    else
        builder << " (result=" << waitResult.result << ")";

    builder << "\n";
    melonDS::Platform::Log(melonDS::Platform::LogLevel::Warn, "%s", builder.str().c_str());
}

bool LogAndClearJavaException(JNIEnv* env, const char* context, int* httpStatusCode)
{
    if (!env || !env->ExceptionCheck())
        return false;

    env->ExceptionClear();
    melonDS::Platform::Log(
        melonDS::Platform::LogLevel::Error,
        "[RAClient] Java exception while handling %s\n",
        context ? context : "unknown context"
    );
    if (httpStatusCode)
        *httpStatusCode = RC_API_SERVER_RESPONSE_RETRYABLE_CLIENT_ERROR;
    return true;
}

bool ReadJavaInputStream(JNIEnv* env, jobject inputStream, std::string* responseBody, int* httpStatusCode)
{
    if (!env || !inputStream || !responseBody)
        return false;

    jclass inputStreamClass = env->FindClass("java/io/InputStream");
    if (LogAndClearJavaException(env, "FindClass(InputStream)", httpStatusCode) || !inputStreamClass)
        return false;

    jmethodID readMethod = env->GetMethodID(inputStreamClass, "read", "([B)I");
    if (LogAndClearJavaException(env, "GetMethodID(InputStream.read)", httpStatusCode) || !readMethod)
    {
        env->DeleteLocalRef(inputStreamClass);
        return false;
    }

    jbyteArray buffer = env->NewByteArray(8192);
    if (LogAndClearJavaException(env, "NewByteArray(InputStream)", httpStatusCode) || !buffer)
    {
        env->DeleteLocalRef(inputStreamClass);
        return false;
    }

    bool readOk = true;
    while (true)
    {
        jint bytesRead = env->CallIntMethod(inputStream, readMethod, buffer);
        if (LogAndClearJavaException(env, "InputStream.read", httpStatusCode))
        {
            readOk = false;
            break;
        }

        if (bytesRead <= 0)
            break;

        std::vector<jbyte> chunk((size_t) bytesRead);
        env->GetByteArrayRegion(buffer, 0, bytesRead, chunk.data());
        if (LogAndClearJavaException(env, "GetByteArrayRegion(InputStream)", httpStatusCode))
        {
            readOk = false;
            break;
        }

        responseBody->append(reinterpret_cast<const char*>(chunk.data()), (size_t) bytesRead);
    }

    env->DeleteLocalRef(buffer);
    env->DeleteLocalRef(inputStreamClass);
    return readOk;
}

bool ExecuteRcClientHttpRequest(
    JavaVM* bridgeVm,
    const rc_api_request_t* request,
    const char* userAgent,
    std::string* responseBody,
    int* httpStatusCode
)
{
    if (!request || !request->url || !responseBody || !httpStatusCode)
        return false;

    const auto requestStartedAt = std::chrono::steady_clock::now();
    const std::string requestAction = ResolveRcClientRequestAction(request);

    if (!bridgeVm)
    {
        *httpStatusCode = RC_API_SERVER_RESPONSE_RETRYABLE_CLIENT_ERROR;
        return false;
    }

    JNIEnv* env = nullptr;
    bool attachedCurrentThread = false;
    jint getEnvResult = bridgeVm->GetEnv((void**) &env, JNI_VERSION_1_6);
    if (getEnvResult == JNI_EDETACHED)
    {
        if (bridgeVm->AttachCurrentThread(&env, nullptr) != JNI_OK)
        {
            *httpStatusCode = RC_API_SERVER_RESPONSE_RETRYABLE_CLIENT_ERROR;
            return false;
        }
        attachedCurrentThread = true;
    }
    else if (getEnvResult != JNI_OK)
    {
        *httpStatusCode = RC_API_SERVER_RESPONSE_RETRYABLE_CLIENT_ERROR;
        return false;
    }

    if (!env)
    {
        *httpStatusCode = RC_API_SERVER_RESPONSE_RETRYABLE_CLIENT_ERROR;
        if (attachedCurrentThread)
            bridgeVm->DetachCurrentThread();
        return false;
    }

    jclass urlClass = nullptr;
    jclass urlConnectionClass = nullptr;
    jclass httpURLConnectionClass = nullptr;
    jclass outputStreamClass = nullptr;
    jclass closeableClass = nullptr;
    jmethodID urlConstructor = nullptr;
    jmethodID openConnectionMethod = nullptr;
    jmethodID setConnectTimeoutMethod = nullptr;
    jmethodID setReadTimeoutMethod = nullptr;
    jmethodID setRequestPropertyMethod = nullptr;
    jmethodID setDoOutputMethod = nullptr;
    jmethodID getInputStreamMethod = nullptr;
    jmethodID setRequestMethodMethod = nullptr;
    jmethodID setInstanceFollowRedirectsMethod = nullptr;
    jmethodID getOutputStreamMethod = nullptr;
    jmethodID getResponseCodeMethod = nullptr;
    jmethodID getErrorStreamMethod = nullptr;
    jmethodID disconnectMethod = nullptr;
    jmethodID outputStreamWriteMethod = nullptr;
    jmethodID outputStreamFlushMethod = nullptr;
    jmethodID outputStreamCloseMethod = nullptr;
    jmethodID closeableCloseMethod = nullptr;
    jstring urlString = nullptr;
    jobject urlObject = nullptr;
    jobject connection = nullptr;
    jobject inputStream = nullptr;
    jobject outputStream = nullptr;
    jbyteArray postDataBytes = nullptr;
    bool success = false;
    *httpStatusCode = RC_API_SERVER_RESPONSE_RETRYABLE_CLIENT_ERROR;

    urlClass = env->FindClass("java/net/URL");
    if (LogAndClearJavaException(env, "FindClass(URL)", httpStatusCode) || !urlClass)
        goto cleanup;

    urlConnectionClass = env->FindClass("java/net/URLConnection");
    if (LogAndClearJavaException(env, "FindClass(URLConnection)", httpStatusCode) || !urlConnectionClass)
        goto cleanup;

    httpURLConnectionClass = env->FindClass("java/net/HttpURLConnection");
    if (LogAndClearJavaException(env, "FindClass(HttpURLConnection)", httpStatusCode) || !httpURLConnectionClass)
        goto cleanup;

    outputStreamClass = env->FindClass("java/io/OutputStream");
    if (LogAndClearJavaException(env, "FindClass(OutputStream)", httpStatusCode) || !outputStreamClass)
        goto cleanup;

    closeableClass = env->FindClass("java/io/Closeable");
    if (LogAndClearJavaException(env, "FindClass(Closeable)", httpStatusCode) || !closeableClass)
        goto cleanup;

    urlConstructor = env->GetMethodID(urlClass, "<init>", "(Ljava/lang/String;)V");
    if (LogAndClearJavaException(env, "GetMethodID(URL.<init>)", httpStatusCode) || !urlConstructor)
        goto cleanup;

    openConnectionMethod = env->GetMethodID(urlClass, "openConnection", "()Ljava/net/URLConnection;");
    if (LogAndClearJavaException(env, "GetMethodID(URL.openConnection)", httpStatusCode) || !openConnectionMethod)
        goto cleanup;

    setConnectTimeoutMethod = env->GetMethodID(urlConnectionClass, "setConnectTimeout", "(I)V");
    if (LogAndClearJavaException(env, "GetMethodID(URLConnection.setConnectTimeout)", httpStatusCode) || !setConnectTimeoutMethod)
        goto cleanup;

    setReadTimeoutMethod = env->GetMethodID(urlConnectionClass, "setReadTimeout", "(I)V");
    if (LogAndClearJavaException(env, "GetMethodID(URLConnection.setReadTimeout)", httpStatusCode) || !setReadTimeoutMethod)
        goto cleanup;

    setRequestPropertyMethod = env->GetMethodID(urlConnectionClass, "setRequestProperty", "(Ljava/lang/String;Ljava/lang/String;)V");
    if (LogAndClearJavaException(env, "GetMethodID(URLConnection.setRequestProperty)", httpStatusCode) || !setRequestPropertyMethod)
        goto cleanup;

    setDoOutputMethod = env->GetMethodID(urlConnectionClass, "setDoOutput", "(Z)V");
    if (LogAndClearJavaException(env, "GetMethodID(URLConnection.setDoOutput)", httpStatusCode) || !setDoOutputMethod)
        goto cleanup;

    getInputStreamMethod = env->GetMethodID(urlConnectionClass, "getInputStream", "()Ljava/io/InputStream;");
    if (LogAndClearJavaException(env, "GetMethodID(URLConnection.getInputStream)", httpStatusCode) || !getInputStreamMethod)
        goto cleanup;

    setRequestMethodMethod = env->GetMethodID(httpURLConnectionClass, "setRequestMethod", "(Ljava/lang/String;)V");
    if (LogAndClearJavaException(env, "GetMethodID(HttpURLConnection.setRequestMethod)", httpStatusCode) || !setRequestMethodMethod)
        goto cleanup;

    setInstanceFollowRedirectsMethod = env->GetMethodID(httpURLConnectionClass, "setInstanceFollowRedirects", "(Z)V");
    if (LogAndClearJavaException(env, "GetMethodID(HttpURLConnection.setInstanceFollowRedirects)", httpStatusCode) || !setInstanceFollowRedirectsMethod)
        goto cleanup;

    getOutputStreamMethod = env->GetMethodID(urlConnectionClass, "getOutputStream", "()Ljava/io/OutputStream;");
    if (LogAndClearJavaException(env, "GetMethodID(URLConnection.getOutputStream)", httpStatusCode) || !getOutputStreamMethod)
        goto cleanup;

    getResponseCodeMethod = env->GetMethodID(httpURLConnectionClass, "getResponseCode", "()I");
    if (LogAndClearJavaException(env, "GetMethodID(HttpURLConnection.getResponseCode)", httpStatusCode) || !getResponseCodeMethod)
        goto cleanup;

    getErrorStreamMethod = env->GetMethodID(httpURLConnectionClass, "getErrorStream", "()Ljava/io/InputStream;");
    if (LogAndClearJavaException(env, "GetMethodID(HttpURLConnection.getErrorStream)", httpStatusCode) || !getErrorStreamMethod)
        goto cleanup;

    disconnectMethod = env->GetMethodID(httpURLConnectionClass, "disconnect", "()V");
    if (LogAndClearJavaException(env, "GetMethodID(HttpURLConnection.disconnect)", httpStatusCode) || !disconnectMethod)
        goto cleanup;

    outputStreamWriteMethod = env->GetMethodID(outputStreamClass, "write", "([B)V");
    if (LogAndClearJavaException(env, "GetMethodID(OutputStream.write)", httpStatusCode) || !outputStreamWriteMethod)
        goto cleanup;

    outputStreamFlushMethod = env->GetMethodID(outputStreamClass, "flush", "()V");
    if (LogAndClearJavaException(env, "GetMethodID(OutputStream.flush)", httpStatusCode) || !outputStreamFlushMethod)
        goto cleanup;

    outputStreamCloseMethod = env->GetMethodID(outputStreamClass, "close", "()V");
    if (LogAndClearJavaException(env, "GetMethodID(OutputStream.close)", httpStatusCode) || !outputStreamCloseMethod)
        goto cleanup;

    closeableCloseMethod = env->GetMethodID(closeableClass, "close", "()V");
    if (LogAndClearJavaException(env, "GetMethodID(Closeable.close)", httpStatusCode) || !closeableCloseMethod)
        goto cleanup;

    urlString = env->NewStringUTF(request->url);

    if (LogAndClearJavaException(env, "NewStringUTF(url)", httpStatusCode) || !urlString)
        goto cleanup;

    urlObject = env->NewObject(urlClass, urlConstructor, urlString);
    if (LogAndClearJavaException(env, "new URL()", httpStatusCode) || !urlObject)
        goto cleanup;

    connection = env->CallObjectMethod(urlObject, openConnectionMethod);
    if (LogAndClearJavaException(env, "URL.openConnection", httpStatusCode) || !connection)
        goto cleanup;

    env->CallVoidMethod(connection, setInstanceFollowRedirectsMethod, JNI_FALSE);
    if (LogAndClearJavaException(env, "HttpURLConnection.setInstanceFollowRedirects", httpStatusCode))
        goto cleanup;

    env->CallVoidMethod(connection, setConnectTimeoutMethod, RC_CLIENT_HTTP_CONNECT_TIMEOUT_MS);
    if (LogAndClearJavaException(env, "URLConnection.setConnectTimeout", httpStatusCode))
        goto cleanup;

    env->CallVoidMethod(connection, setReadTimeoutMethod, RC_CLIENT_HTTP_READ_TIMEOUT_MS);
    if (LogAndClearJavaException(env, "URLConnection.setReadTimeout", httpStatusCode))
        goto cleanup;

    {
        const char* resolvedUserAgent = (userAgent && userAgent[0] != '\0') ? userAgent : RC_CLIENT_DEFAULT_USER_AGENT;
        jstring userAgentHeaderName = env->NewStringUTF("User-Agent");
        if (LogAndClearJavaException(env, "NewStringUTF(User-Agent name)", httpStatusCode) || !userAgentHeaderName)
        {
            if (userAgentHeaderName) env->DeleteLocalRef(userAgentHeaderName);
            goto cleanup;
        }

        jstring userAgentHeaderValue = env->NewStringUTF(resolvedUserAgent);
        if (LogAndClearJavaException(env, "NewStringUTF(User-Agent value)", httpStatusCode) || !userAgentHeaderValue)
        {
            env->DeleteLocalRef(userAgentHeaderName);
            if (userAgentHeaderValue) env->DeleteLocalRef(userAgentHeaderValue);
            goto cleanup;
        }

        env->CallVoidMethod(connection, setRequestPropertyMethod, userAgentHeaderName, userAgentHeaderValue);
        const bool setUserAgentFailed = LogAndClearJavaException(
            env,
            "URLConnection.setRequestProperty(User-Agent)",
            httpStatusCode
        );
        env->DeleteLocalRef(userAgentHeaderName);
        env->DeleteLocalRef(userAgentHeaderValue);
        if (setUserAgentFailed)
            goto cleanup;
    }

    if (request->post_data && request->post_data[0] != '\0')
    {
        jstring postMethod = env->NewStringUTF("POST");
        if (LogAndClearJavaException(env, "NewStringUTF(POST)", httpStatusCode) || !postMethod)
            goto cleanup;

        env->CallVoidMethod(connection, setRequestMethodMethod, postMethod);
        const bool setPostMethodFailed = LogAndClearJavaException(
            env,
            "HttpURLConnection.setRequestMethod(POST)",
            httpStatusCode
        );
        env->DeleteLocalRef(postMethod);
        if (setPostMethodFailed)
            goto cleanup;

        env->CallVoidMethod(connection, setDoOutputMethod, JNI_TRUE);
        if (LogAndClearJavaException(env, "URLConnection.setDoOutput", httpStatusCode))
            goto cleanup;

        if (request->content_type && request->content_type[0] != '\0')
        {
            jstring contentTypeHeader = env->NewStringUTF("Content-Type");
            if (LogAndClearJavaException(env, "NewStringUTF(Content-Type name)", httpStatusCode) || !contentTypeHeader)
            {
                if (contentTypeHeader) env->DeleteLocalRef(contentTypeHeader);
                goto cleanup;
            }

            jstring contentTypeValue = env->NewStringUTF(request->content_type);
            if (LogAndClearJavaException(env, "NewStringUTF(Content-Type value)", httpStatusCode) || !contentTypeValue)
            {
                env->DeleteLocalRef(contentTypeHeader);
                if (contentTypeValue) env->DeleteLocalRef(contentTypeValue);
                goto cleanup;
            }
            env->CallVoidMethod(connection, setRequestPropertyMethod, contentTypeHeader, contentTypeValue);
            const bool setContentTypeFailed = LogAndClearJavaException(
                env,
                "URLConnection.setRequestProperty(Content-Type)",
                httpStatusCode
            );
            env->DeleteLocalRef(contentTypeHeader);
            env->DeleteLocalRef(contentTypeValue);
            if (setContentTypeFailed)
                goto cleanup;
        }

        outputStream = env->CallObjectMethod(connection, getOutputStreamMethod);
        if (LogAndClearJavaException(env, "getOutputStream", httpStatusCode) || !outputStream)
            goto cleanup;

        const size_t postDataLength = strlen(request->post_data);
        postDataBytes = env->NewByteArray((jsize) postDataLength);
        if (LogAndClearJavaException(env, "NewByteArray(postData)", httpStatusCode) || !postDataBytes)
            goto cleanup;

        env->SetByteArrayRegion(postDataBytes, 0, (jsize) postDataLength, reinterpret_cast<const jbyte*>(request->post_data));
        if (LogAndClearJavaException(env, "SetByteArrayRegion(postData)", httpStatusCode))
            goto cleanup;

        env->CallVoidMethod(outputStream, outputStreamWriteMethod, postDataBytes);
        if (LogAndClearJavaException(env, "OutputStream.write(POST body)", httpStatusCode))
            goto cleanup;

        env->CallVoidMethod(outputStream, outputStreamFlushMethod);
        if (LogAndClearJavaException(env, "OutputStream.flush(POST body)", httpStatusCode))
            goto cleanup;

        env->CallVoidMethod(outputStream, outputStreamCloseMethod);
        if (LogAndClearJavaException(env, "OutputStream.close(POST body)", httpStatusCode))
            goto cleanup;
    }
    else
    {
        jstring getMethod = env->NewStringUTF("GET");
        if (LogAndClearJavaException(env, "NewStringUTF(GET)", httpStatusCode) || !getMethod)
            goto cleanup;

        env->CallVoidMethod(connection, setRequestMethodMethod, getMethod);
        const bool setGetMethodFailed = LogAndClearJavaException(
            env,
            "HttpURLConnection.setRequestMethod(GET)",
            httpStatusCode
        );
        env->DeleteLocalRef(getMethod);
        if (setGetMethodFailed)
            goto cleanup;
    }

    *httpStatusCode = env->CallIntMethod(connection, getResponseCodeMethod);
    if (LogAndClearJavaException(env, "getResponseCode", httpStatusCode))
        goto cleanup;

    if (*httpStatusCode >= 200 && *httpStatusCode < 300)
    {
        inputStream = env->CallObjectMethod(connection, getInputStreamMethod);
        if (LogAndClearJavaException(env, "URLConnection.getInputStream", httpStatusCode))
            goto cleanup;
    }
    else
    {
        inputStream = env->CallObjectMethod(connection, getErrorStreamMethod);
        if (LogAndClearJavaException(env, "HttpURLConnection.getErrorStream", httpStatusCode))
            goto cleanup;
    }

    if (inputStream)
    {
        if (!ReadJavaInputStream(env, inputStream, responseBody, httpStatusCode))
            goto cleanup;
    }

    success = true;

cleanup:
    if (inputStream)
    {
        env->CallVoidMethod(inputStream, closeableCloseMethod);
        LogAndClearJavaException(env, "cleanup close inputStream", httpStatusCode);
    }

    if (outputStream)
    {
        env->CallVoidMethod(outputStream, outputStreamCloseMethod);
        LogAndClearJavaException(env, "cleanup close outputStream", httpStatusCode);
    }

    if (connection)
    {
        env->CallVoidMethod(connection, disconnectMethod);
        LogAndClearJavaException(env, "disconnect", httpStatusCode);
    }

    if (postDataBytes) env->DeleteLocalRef(postDataBytes);
    if (outputStream) env->DeleteLocalRef(outputStream);
    if (inputStream) env->DeleteLocalRef(inputStream);
    if (connection) env->DeleteLocalRef(connection);
    if (urlObject) env->DeleteLocalRef(urlObject);
    if (urlString) env->DeleteLocalRef(urlString);

    if (outputStreamClass) env->DeleteLocalRef(outputStreamClass);
    if (closeableClass) env->DeleteLocalRef(closeableClass);
    if (httpURLConnectionClass) env->DeleteLocalRef(httpURLConnectionClass);
    if (urlConnectionClass) env->DeleteLocalRef(urlConnectionClass);
    if (urlClass) env->DeleteLocalRef(urlClass);

    if (attachedCurrentThread)
        bridgeVm->DetachCurrentThread();

    const auto elapsedMs = std::chrono::duration_cast<std::chrono::milliseconds>(
        std::chrono::steady_clock::now() - requestStartedAt
    ).count();
    melonDS::Platform::Log(
        melonDS::Platform::LogLevel::Warn,
        "[RAClient] HTTP %s %s status=%d elapsed=%lldms bytes=%zu response_sample=%s\n",
        requestAction.c_str(),
        success ? "completed" : "failed",
        *httpStatusCode,
        elapsedMs,
        responseBody->size(),
        BuildRcClientLoggedResponseSample(requestAction, *responseBody).c_str()
    );

    return success;
}

}

RetroAchievementsManager::RetroAchievementsManager(melonDS::NDS* nds) : nds(nds)
{
    rcClientRuntime = nullptr;
    isRichPresenceEnabled = false;
    isRcClientRuntimeActive = false;
    runtimeMode = RuntimeMode::Disabled;
    rcClientSlowWindowCount = 0;
    rcClientWindowFrameCount = 0;
    rcClientWindowSlowFrameCount = 0;
    rcClientWindowAccumulatedUs = 0;
    rcClientWindowPeakUs = 0;
    rcClientWindowCpuFrameCount = 0;
    rcClientWindowCpuSlowFrameCount = 0;
    rcClientWindowCpuAccumulatedUs = 0;
    rcClientWindowCpuPeakUs = 0;
}

RetroAchievementsManager::~RetroAchievementsManager()
{
    std::unique_lock lock(runtimeLock);
    DeactivateRcClientRuntimeLocked();
}

void RetroAchievementsManager::SetJavaVm(JavaVM* javaVm)
{
    RetroAchievementsManager::javaVm = javaVm;
}

void RetroAchievementsManager::ConfigureRuntimeBridge(std::optional<RARuntimeBridgeConfig> runtimeBridgeConfig)
{
    std::unique_lock lock(runtimeLock);
    submissionTransportSuspended.store(false, std::memory_order_release);
    this->runtimeBridgeConfig = std::move(runtimeBridgeConfig);
}

bool RetroAchievementsManager::LoadAchievements(std::list<RAAchievement> achievements)
{
    std::unique_lock lock(runtimeLock);

    for (const auto &achievement : achievements) {
        loadedAchievements.push_back(achievement);
    }

    return true;
}

bool RetroAchievementsManager::LoadLeaderboards(std::list<RALeaderboard> leaderboards)
{
    std::unique_lock lock(runtimeLock);

    for (auto &leaderboard : leaderboards) {
        int rcheevosLeaderboardType = rc_parse_format(leaderboard.format.c_str());
        leaderboard.rcheevosFormat = rcheevosLeaderboardType;

        loadedLeaderboards.push_back(leaderboard);
    }

    return true;
}

bool RetroAchievementsManager::ActivatePreferredRuntime()
{
    std::unique_lock lock(runtimeLock);

    if (!runtimeBridgeConfig.has_value())
    {
        runtimeMode = RuntimeMode::Disabled;
        return false;
    }

    if (!IsRcClientConfiguredLocked())
    {
        runtimeMode = RuntimeMode::Disabled;
        return false;
    }

    const bool activated = TryActivateRcClientRuntimeLocked();
    if (!activated)
    {
        runtimeMode = RuntimeMode::Disabled;
        return false;
    }

    runtimeMode = runtimeBridgeConfig->runtimeMode == RARuntimeBridgeMode::RcClientOffline
        ? RuntimeMode::RcClientOffline
        : RuntimeMode::RcClientOnline;
    return true;
}

void RetroAchievementsManager::UnloadEverything()
{
    std::unique_lock lock(runtimeLock);

    DeactivateRcClientRuntimeLocked();

    loadedAchievements.clear();
    loadedLeaderboards.clear();
    loadedRichPresenceScript.clear();
    isRichPresenceEnabled = false;
    runtimeMode = RuntimeMode::Disabled;
    ResetRcClientPerformanceWindowLocked();
}

void RetroAchievementsManager::SetupRichPresence(std::string richPresenceScript)
{
    std::unique_lock lock(runtimeLock);

    loadedRichPresenceScript = richPresenceScript;
    isRichPresenceEnabled = true;
}

std::string RetroAchievementsManager::GetRichPresenceStatus()
{
    std::unique_lock lock(runtimeLock);

    if (IsRcClientRuntimeActiveLocked() && rc_client_has_rich_presence(rcClientRuntime))
    {
        char buffer[512];
        rc_client_get_rich_presence_message(rcClientRuntime, buffer, sizeof(buffer));
        return buffer;
    }

    return "";
}

std::vector<RARuntimeAchievement> RetroAchievementsManager::GetRuntimeAchievements()
{
    std::unique_lock lock(runtimeLock, std::try_to_lock);
    if (!lock.owns_lock())
        return {};

    std::vector<RARuntimeAchievement> achievements(loadedAchievements.size());
    int index = 0;
    for (const auto &item: loadedAchievements)
    {
        RARuntimeAchievement& runtimeAchievement = achievements[index++];
        runtimeAchievement.id = item.id;
        runtimeAchievement.value = 0;
        runtimeAchievement.target = 0;

        if (IsRcClientRuntimeActiveLocked())
        {
            const rc_client_achievement_t* achievementInfo = rc_client_get_achievement_info(rcClientRuntime, item.id);
            if (achievementInfo)
                ParseMeasuredProgress(achievementInfo->measured_progress, &runtimeAchievement.value, &runtimeAchievement.target);
        }
    }

    return achievements;
}

std::vector<RARuntimeAchievementBucketEntry> RetroAchievementsManager::GetRuntimeAchievementBuckets()
{
    std::unique_lock lock(runtimeLock, std::try_to_lock);
    if (!lock.owns_lock() || !IsRcClientRuntimeActiveLocked())
        return {};

    auto* achievementList = rc_client_create_achievement_list(
        rcClientRuntime,
        RC_CLIENT_ACHIEVEMENT_CATEGORY_CORE_AND_UNOFFICIAL,
        RC_CLIENT_ACHIEVEMENT_LIST_GROUPING_PROGRESS
    );
    if (!achievementList)
        return {};

    std::vector<RARuntimeAchievementBucketEntry> entries;
    for (uint32_t bucketIndex = 0; bucketIndex < achievementList->num_buckets; bucketIndex++)
    {
        const rc_client_achievement_bucket_t& bucket = achievementList->buckets[bucketIndex];
        for (uint32_t achievementIndex = 0; achievementIndex < bucket.num_achievements; achievementIndex++)
        {
            const rc_client_achievement_t* achievement = bucket.achievements[achievementIndex];
            if (!achievement)
                continue;

            RARuntimeAchievementBucketEntry entry;
            entry.achievementId = (long) achievement->id;
            entry.subsetId = (long) bucket.subset_id;
            entry.bucketType = bucket.bucket_type;
            entries.push_back(entry);
        }
    }

    rc_client_destroy_achievement_list(achievementList);
    return entries;
}

std::vector<long> RetroAchievementsManager::GetRuntimeSubsetIds()
{
    std::unique_lock lock(runtimeLock, std::try_to_lock);
    if (!lock.owns_lock() || !IsRcClientRuntimeActiveLocked())
        return {};

    auto* subsetList = rc_client_create_subset_list(rcClientRuntime);
    if (!subsetList)
        return {};

    std::vector<long> subsetIds;
    subsetIds.reserve(subsetList->num_subsets);
    for (uint32_t subsetIndex = 0; subsetIndex < subsetList->num_subsets; subsetIndex++)
    {
        const rc_client_subset_t* subset = subsetList->subsets[subsetIndex];
        if (subset)
            subsetIds.push_back((long) subset->id);
    }

    rc_client_destroy_subset_list(subsetList);
    return subsetIds;
}

bool RetroAchievementsManager::AreSaveStatesAllowed()
{
    std::unique_lock lock(runtimeLock);

    if (!runtimeBridgeConfig.has_value() || !runtimeBridgeConfig->hardcoreEnabled)
        return true;

    if (runtimeMode != RuntimeMode::RcClientOnline)
        return true;

    return !IsRcClientRuntimeActiveLocked();
}

bool RetroAchievementsManager::DoSavestate(Savestate* savestate)
{
    std::unique_lock lock(runtimeLock);

    if (savestate->Saving)
    {
        if (!IsRcClientRuntimeActiveLocked())
            return true;

        u32 rcheevosStateSize = (u32) rc_client_progress_size(rcClientRuntime);
        std::vector<u8> rcheevosStateBuffer(rcheevosStateSize);
        int result = rc_client_serialize_progress_sized(rcClientRuntime, rcheevosStateBuffer.data(), rcheevosStateSize);
        if (result != RC_OK)
        {
            Platform::Log(
                Platform::LogLevel::Warn,
                "savestate: skipping RetroAchievements progress save, serialize failed result=%d\n",
                result);
            return true;
        }

        savestate->Section("RCHV");
        savestate->Var32(&rcheevosStateSize);
        savestate->VarArray(rcheevosStateBuffer.data(), rcheevosStateSize);
    }
    else
    {
        if (!IsRcClientRuntimeActiveLocked())
            return true;

        if (!savestate->HasSection("RCHV"))
        {
            Platform::Log(
                Platform::LogLevel::Warn,
                "savestate: RetroAchievements progress section missing, loading emulator state without RA progress\n");
            return true;
        }

        savestate->Section("RCHV");

        u32 rcheevosStateSize;
        savestate->Var32(&rcheevosStateSize);
        std::vector<u8> rcheevosStateBuffer(rcheevosStateSize);
        savestate->VarArray(rcheevosStateBuffer.data(), rcheevosStateSize);

        int result = rc_client_deserialize_progress_sized(rcClientRuntime, rcheevosStateBuffer.data(), rcheevosStateSize);

        if (result != RC_OK)
        {
            Platform::Log(
                Platform::LogLevel::Warn,
                "savestate: skipping RetroAchievements progress restore, deserialize failed result=%d\n",
                result);
            return true;
        }
    }

    return true;
}

void RetroAchievementsManager::Reset()
{
    std::unique_lock lock(runtimeLock);
    if (IsRcClientRuntimeActiveLocked())
        rc_client_reset(rcClientRuntime);
    PublishLeaderboardResetBarrierLocked();
}

void RetroAchievementsManager::FrameUpdate()
{
    std::unique_lock lock(runtimeLock, std::try_to_lock);
    if (!lock.owns_lock())
        return;

    if ((runtimeMode == RuntimeMode::RcClientOnline || runtimeMode == RuntimeMode::RcClientOffline) && IsRcClientRuntimeActiveLocked())
    {
        const auto frameStart = std::chrono::steady_clock::now();
        const long long frameCpuStartUs = GetCurrentThreadCpuTimeUs();
        rc_client_do_frame(rcClientRuntime);
        PublishLeaderboardTrackerValuesLocked();
        const long long frameCpuEndUs = GetCurrentThreadCpuTimeUs();

        const auto frameElapsedUs = std::chrono::duration_cast<std::chrono::microseconds>(
            std::chrono::steady_clock::now() - frameStart
        ).count();
        const long long frameCpuElapsedUs =
            frameCpuStartUs >= 0 && frameCpuEndUs >= frameCpuStartUs
                ? frameCpuEndUs - frameCpuStartUs
                : -1;
        rcClientWindowFrameCount++;
        rcClientWindowAccumulatedUs += frameElapsedUs;
        rcClientWindowPeakUs = std::max(rcClientWindowPeakUs, frameElapsedUs);
        if (frameElapsedUs > RC_CLIENT_PERF_WINDOW_PEAK_US_LIMIT)
            rcClientWindowSlowFrameCount++;
        if (frameCpuElapsedUs >= 0)
        {
            rcClientWindowCpuFrameCount++;
            rcClientWindowCpuAccumulatedUs += frameCpuElapsedUs;
            rcClientWindowCpuPeakUs = std::max(rcClientWindowCpuPeakUs, frameCpuElapsedUs);
            if (frameCpuElapsedUs > RC_CLIENT_PERF_WINDOW_PEAK_US_LIMIT)
                rcClientWindowCpuSlowFrameCount++;
        }

        if (rcClientWindowFrameCount >= RC_CLIENT_PERF_WINDOW_FRAMES)
        {
            const long long avgWallUs = rcClientWindowAccumulatedUs / rcClientWindowFrameCount;
            const long long avgCpuUs = rcClientWindowCpuFrameCount > 0
                ? rcClientWindowCpuAccumulatedUs / rcClientWindowCpuFrameCount
                : -1;
            const bool isSlowWindow =
                avgCpuUs > RC_CLIENT_PERF_WINDOW_AVG_US_LIMIT ||
                rcClientWindowCpuSlowFrameCount >= RC_CLIENT_PERF_WINDOW_SLOW_FRAME_COUNT_LIMIT;

            if (isSlowWindow)
                rcClientSlowWindowCount++;
            else
                rcClientSlowWindowCount = 0;

            if (
                rcClientSlowWindowCount >= RC_CLIENT_PERF_CONSECUTIVE_SLOW_WINDOWS_FOR_WARNING &&
                (
                    rcClientSlowWindowCount == RC_CLIENT_PERF_CONSECUTIVE_SLOW_WINDOWS_FOR_WARNING ||
                    rcClientSlowWindowCount % 10 == 0
                )
            )
            {
                melonDS::Platform::Log(
                    melonDS::Platform::LogLevel::Warn,
                    "[RAClient] Sustained rc_client CPU cost detected; keeping rc_client active (cpuAvg=%lldus cpuPeak=%lldus cpuSlowFrames=%d/%d wallAvg=%lldus wallPeak=%lldus wallSlowFrames=%d/%d slowWindows=%d)\n",
                    avgCpuUs,
                    rcClientWindowCpuPeakUs,
                    rcClientWindowCpuSlowFrameCount,
                    rcClientWindowCpuFrameCount,
                    avgWallUs,
                    rcClientWindowPeakUs,
                    rcClientWindowSlowFrameCount,
                    rcClientWindowFrameCount,
                    rcClientSlowWindowCount
                );
            }
            else if (rcClientWindowPeakUs > RC_CLIENT_PERF_WINDOW_ISOLATED_SPIKE_LOG_US_LIMIT)
            {
                melonDS::Platform::Log(
                    melonDS::Platform::LogLevel::Info,
                    "[RAClient] Ignoring runtime wall-time spike without sustained CPU cost (cpuAvg=%lldus cpuPeak=%lldus cpuSlowFrames=%d/%d wallAvg=%lldus wallPeak=%lldus wallSlowFrames=%d/%d)\n",
                    avgCpuUs,
                    rcClientWindowCpuPeakUs,
                    rcClientWindowCpuSlowFrameCount,
                    rcClientWindowCpuFrameCount,
                    avgWallUs,
                    rcClientWindowPeakUs,
                    rcClientWindowSlowFrameCount,
                    rcClientWindowFrameCount
                );
            }

            ResetRcClientPerformanceWindowLocked();
        }
    }
}

RANativePendingRetryResult RetroAchievementsManager::RetryPendingSubmissions(
    const std::vector<uint64_t>& expectedSubmissionIds)
{
    std::unique_lock lock(runtimeLock);
    RANativePendingRetryResult result;
    if (
        runtimeMode != RuntimeMode::RcClientOnline ||
        !IsRcClientRuntimeActiveLocked() ||
        !runtimeBridgeConfig.has_value() ||
        runtimeBridgeConfig->submissionSessionId == 0
    )
    {
        result.transportFailure = true;
        return result;
    }

    result.submissionSessionId = runtimeBridgeConfig->submissionSessionId;

    struct RetryPlanEntry
    {
        uint64_t submissionId;
        RANativePendingSubmissionType submissionType;
        uintptr_t callbackDataToken;
        bool isTerminal;
    };

    std::vector<RetryPlanEntry> retryPlan;
    retryPlan.reserve(expectedSubmissionIds.size());
    std::unordered_set<uint64_t> seenSubmissionIds;

    for (const uint64_t submissionId : expectedSubmissionIds)
    {
        if (submissionId == 0 || !seenSubmissionIds.insert(submissionId).second)
        {
            result.transportFailure = true;
            break;
        }

        const auto terminal = terminalPendingSubmissionsById.find(submissionId);
        if (terminal != terminalPendingSubmissionsById.end())
        {
            const PendingSubmissionState& submission = terminal->second;
            if (
                !submission.published ||
                submission.submissionSessionId != result.submissionSessionId ||
                !submission.terminalResolution.has_value() ||
                !submission.terminalResult.has_value()
            )
            {
                result.transportFailure = true;
                break;
            }

            retryPlan.push_back({
                .submissionId = submission.submissionId,
                .submissionType = submission.type,
                .callbackDataToken = 0,
                .isTerminal = true,
            });
            continue;
        }

        const auto pending = std::find_if(
            pendingSubmissionsByCallbackData.begin(),
            pendingSubmissionsByCallbackData.end(),
            [submissionId](const auto& entry) {
                return entry.second.submissionId == submissionId;
            }
        );
        if (
            pending == pendingSubmissionsByCallbackData.end() ||
            !pending->second.published ||
            pending->second.status != PendingSubmissionStatus::RetryPending ||
            pending->second.submissionSessionId != result.submissionSessionId ||
            pending->second.callbackDataToken == 0 ||
            !rc_client_is_submission_retry_pending_token(
                rcClientRuntime,
                pending->second.callbackDataToken
            )
        )
        {
            result.transportFailure = true;
            break;
        }

        retryPlan.push_back({
            .submissionId = submissionId,
            .submissionType = pending->second.type,
            .callbackDataToken = pending->second.callbackDataToken,
            .isTerminal = false,
        });
    }

    if (result.transportFailure)
    {
        melonDS::Platform::Log(
            melonDS::Platform::LogLevel::Warn,
            "[RAPending] event_type=ra_native_retry_cycle submission_session_id=%llu forced=0 resolutions=0 transport_failure=1 runtime_path=%s\n",
            static_cast<unsigned long long>(result.submissionSessionId),
            RuntimePathTraceValue()
        );
        return result;
    }

    const auto appendTerminalResolution = [&](uint64_t submissionId) {
        const auto terminal = terminalPendingSubmissionsById.find(submissionId);
        if (terminal == terminalPendingSubmissionsById.end())
            return false;

        const PendingSubmissionState& submission = terminal->second;
        if (
            submission.submissionSessionId != result.submissionSessionId ||
            !submission.terminalResolution.has_value() ||
            !submission.terminalResult.has_value()
        )
        {
            return false;
        }

        result.resolutions.push_back({
            .submissionId = submission.submissionId,
            .submissionType = submission.type,
            .resolution = *submission.terminalResolution,
            .result = *submission.terminalResult,
        });
        return true;
    };

    for (const RetryPlanEntry& entry : retryPlan)
    {
        if (entry.isTerminal)
        {
            if (!appendTerminalResolution(entry.submissionId))
            {
                result.resolutions.push_back({
                    .submissionId = entry.submissionId,
                    .submissionType = entry.submissionType,
                    .resolution = RANativePendingSubmissionResolution::RetryableFailure,
                    .result = RC_API_SERVER_RESPONSE_RETRYABLE_CLIENT_ERROR,
                });
            }
            continue;
        }

        if (!rc_client_retry_pending_submission(rcClientRuntime, entry.callbackDataToken))
        {
            result.resolutions.push_back({
                .submissionId = entry.submissionId,
                .submissionType = entry.submissionType,
                .resolution = RANativePendingSubmissionResolution::RetryableFailure,
                .result = RC_API_SERVER_RESPONSE_RETRYABLE_CLIENT_ERROR,
            });
            continue;
        }
        result.forcedRetryCount++;

        if (appendTerminalResolution(entry.submissionId))
            continue;

        const auto pending = pendingSubmissionsByCallbackData.find(entry.callbackDataToken);
        if (
            pending != pendingSubmissionsByCallbackData.end() &&
            pending->second.submissionId == entry.submissionId &&
            pending->second.status == PendingSubmissionStatus::RetryPending &&
            pending->second.submissionSessionId == result.submissionSessionId
        )
        {
            result.resolutions.push_back({
                .submissionId = entry.submissionId,
                .submissionType = entry.submissionType,
                .resolution = RANativePendingSubmissionResolution::RetryableFailure,
                .result = RC_API_SERVER_RESPONSE_RETRYABLE_CLIENT_ERROR,
            });
        }
        else
        {
            result.resolutions.push_back({
                .submissionId = entry.submissionId,
                .submissionType = entry.submissionType,
                .resolution = RANativePendingSubmissionResolution::RetryableFailure,
                .result = RC_API_SERVER_RESPONSE_RETRYABLE_CLIENT_ERROR,
            });
        }
    }

    melonDS::Platform::Log(
        melonDS::Platform::LogLevel::Info,
        "[RAPending] event_type=ra_native_retry_cycle submission_session_id=%llu forced=%u resolutions=%zu transport_failure=%d runtime_path=%s\n",
        static_cast<unsigned long long>(result.submissionSessionId),
        result.forcedRetryCount,
        result.resolutions.size(),
        result.transportFailure ? 1 : 0,
        RuntimePathTraceValue()
    );
    return result;
}

uint64_t RetroAchievementsManager::RefreshPendingSubmissions()
{
    std::unique_lock lock(runtimeLock);
    if (
        runtimeMode != RuntimeMode::RcClientOnline ||
        !IsRcClientRuntimeActiveLocked() ||
        !runtimeBridgeConfig.has_value() ||
        runtimeBridgeConfig->submissionSessionId == 0
    )
    {
        return 0;
    }

    auto eventMessenger = EventMessenger.lock();
    if (!eventMessenger)
        return 0;

    const uint64_t submissionSessionId = runtimeBridgeConfig->submissionSessionId;
    std::vector<PendingSubmissionState*> activeSubmissions;
    std::vector<const PendingSubmissionState*> terminalSubmissions;
    activeSubmissions.reserve(pendingSubmissionsByCallbackData.size());
    terminalSubmissions.reserve(terminalPendingSubmissionsById.size());

    for (auto& entry : pendingSubmissionsByCallbackData)
    {
        auto& submission = entry.second;
        if (
            submission.submissionSessionId == submissionSessionId &&
            IsPendingSubmissionPublishable(submission)
        )
        {
            submission.published = true;
            activeSubmissions.push_back(&submission);
        }
    }

    for (const auto& entry : terminalPendingSubmissionsById)
    {
        const auto& submission = entry.second;
        if (
            submission.submissionSessionId == submissionSessionId &&
            submission.published &&
            submission.terminalResolution.has_value() &&
            submission.terminalResult.has_value()
        )
        {
            terminalSubmissions.push_back(&submission);
        }
    }

    struct ReplayEntry
    {
        const PendingSubmissionState* submission;
        bool terminal;
    };
    std::vector<ReplayEntry> replayEntries;
    replayEntries.reserve(activeSubmissions.size() + terminalSubmissions.size());
    for (const auto* submission : activeSubmissions)
        replayEntries.push_back({submission, false});
    for (const auto* submission : terminalSubmissions)
        replayEntries.push_back({submission, true});
    std::sort(
        replayEntries.begin(),
        replayEntries.end(),
        [](const ReplayEntry& left, const ReplayEntry& right) {
            if (left.submission->sequence != right.submission->sequence)
                return left.submission->sequence < right.submission->sequence;
            return left.submission->submissionId < right.submission->submissionId;
        }
    );

    for (const auto& entry : replayEntries)
    {
        SendPendingSubmissionAdded(*entry.submission);
        if (entry.terminal)
            SendPendingSubmissionResolution(*entry.submission);
    }

    const uint64_t maxWireBarrierId =
        static_cast<uint64_t>(std::numeric_limits<int64_t>::max());
    if (
        nextPendingSubmissionBarrierId == 0 ||
        nextPendingSubmissionBarrierId > maxWireBarrierId
    )
    {
        nextPendingSubmissionBarrierId = 1;
    }
    const uint64_t barrierId = nextPendingSubmissionBarrierId++;
    eventMessenger->onRetroAchievementsPendingSubmissionBarrier(
        submissionSessionId,
        barrierId
    );
    melonDS::Platform::Log(
        melonDS::Platform::LogLevel::Info,
        "[RAPending] event_type=ra_pending_refresh submission_session_id=%llu barrier_id=%llu replayed=%zu active=%zu terminal=%zu runtime_path=%s\n",
        static_cast<unsigned long long>(submissionSessionId),
        static_cast<unsigned long long>(barrierId),
        replayEntries.size(),
        activeSubmissions.size(),
        terminalSubmissions.size(),
        RuntimePathTraceValue()
    );
    return barrierId;
}

int32_t RetroAchievementsManager::DiscardPendingSubmissions(
    const std::vector<uint64_t>& expectedSubmissionIds)
{
    std::unique_lock lock(runtimeLock);
    if (
        runtimeMode != RuntimeMode::RcClientOnline ||
        !IsRcClientRuntimeActiveLocked() ||
        !runtimeBridgeConfig.has_value() ||
        runtimeBridgeConfig->submissionSessionId == 0 ||
        expectedSubmissionIds.size() >
            static_cast<size_t>(std::numeric_limits<int32_t>::max())
    )
    {
        return -1;
    }

    const uint64_t submissionSessionId = runtimeBridgeConfig->submissionSessionId;
    std::unordered_set<uint64_t> expectedIds;
    expectedIds.reserve(expectedSubmissionIds.size());
    for (const uint64_t submissionId : expectedSubmissionIds)
    {
        if (submissionId == 0 || !expectedIds.insert(submissionId).second)
            return -1;
    }

    std::unordered_set<uint64_t> discardableIds;
    std::vector<uintptr_t> activeCallbackDataTokens;
    discardableIds.reserve(
        pendingSubmissionsByCallbackData.size() +
        terminalPendingSubmissionsById.size()
    );
    activeCallbackDataTokens.reserve(pendingSubmissionsByCallbackData.size());

    for (const auto& entry : pendingSubmissionsByCallbackData)
    {
        const auto& submission = entry.second;
        if (
            submission.submissionSessionId != submissionSessionId ||
            !submission.published ||
            !IsPendingSubmissionPublishable(submission) ||
            submission.callbackDataToken == 0 ||
            !rc_client_is_submission_retry_pending_token(
                rcClientRuntime,
                submission.callbackDataToken
            )
        )
        {
            continue;
        }
        discardableIds.insert(submission.submissionId);
        activeCallbackDataTokens.push_back(submission.callbackDataToken);
    }

    for (const auto& entry : terminalPendingSubmissionsById)
    {
        const auto& submission = entry.second;
        if (
            submission.submissionSessionId == submissionSessionId &&
            submission.published &&
            submission.terminalResolution ==
                RANativePendingSubmissionResolution::PermanentFailure
        )
        {
            discardableIds.insert(submission.submissionId);
        }
    }

    if (discardableIds.size() != expectedIds.size())
        return -1;
    for (const uint64_t submissionId : expectedIds)
    {
        if (discardableIds.find(submissionId) == discardableIds.end())
            return -1;
    }

    uint32_t pendingAchievementCount = 0;
    uint32_t pendingLeaderboardCount = 0;
    rc_client_get_pending_submission_counts(
        rcClientRuntime,
        &pendingAchievementCount,
        &pendingLeaderboardCount
    );
    const uint64_t rcClientPendingCount =
        static_cast<uint64_t>(pendingAchievementCount) +
        static_cast<uint64_t>(pendingLeaderboardCount);
    if (rcClientPendingCount != activeCallbackDataTokens.size())
        return -1;

    const uint32_t discardedByRcClient =
        rc_client_discard_pending_submissions(rcClientRuntime);
    if (discardedByRcClient != activeCallbackDataTokens.size())
    {
        melonDS::Platform::Log(
            melonDS::Platform::LogLevel::Warn,
            "[RAPending] event_type=ra_pending_discard_failed submission_session_id=%llu expected_active=%zu discarded_active=%u runtime_path=%s\n",
            static_cast<unsigned long long>(submissionSessionId),
            activeCallbackDataTokens.size(),
            discardedByRcClient,
            RuntimePathTraceValue()
        );
        return -1;
    }

    for (const uintptr_t callbackDataToken : activeCallbackDataTokens)
    {
        const auto pending = pendingSubmissionsByCallbackData.find(callbackDataToken);
        if (pending == pendingSubmissionsByCallbackData.end())
            continue;
        if (pending->second.type == RANativePendingSubmissionType::Leaderboard)
        {
            auto* attempt = FindLeaderboardAttempt(pending->second.attemptId);
            if (attempt)
                attempt->terminal = true;
            ForgetLeaderboardSubmissionCallback(pending->second.attemptId);
        }
        if (activeSubmissionResponseCallbackData == callbackDataToken)
            activeSubmissionResponseCallbackData = 0;
        pendingSubmissionsByCallbackData.erase(pending);
    }

    for (auto iterator = terminalPendingSubmissionsById.begin();
         iterator != terminalPendingSubmissionsById.end();)
    {
        if (expectedIds.find(iterator->first) != expectedIds.end())
            iterator = terminalPendingSubmissionsById.erase(iterator);
        else
            ++iterator;
    }
    PruneUnreferencedLeaderboardAttempts();

    melonDS::Platform::Log(
        melonDS::Platform::LogLevel::Info,
        "[RAPending] event_type=ra_pending_discard_confirmed submission_session_id=%llu discarded_total=%zu discarded_active=%u runtime_path=%s\n",
        static_cast<unsigned long long>(submissionSessionId),
        expectedIds.size(),
        discardedByRcClient,
        RuntimePathTraceValue()
    );
    return static_cast<int32_t>(expectedIds.size());
}

void RetroAchievementsManager::SetSubmissionTransportSuspended(bool suspended)
{
    submissionTransportSuspended.store(suspended, std::memory_order_release);
}

void RetroAchievementsManager::RcClientEventHandler(const rc_client_event_t* event, rc_client_t* client)
{
    if (!event || !client)
    {
        melonDS::Platform::Log(
            melonDS::Platform::LogLevel::Warn,
            "[RAClient] runtime_event_dropped path=rc_client reason=null_event_or_client\n"
        );
        return;
    }

    auto* manager = static_cast<RetroAchievementsManager*>(rc_client_get_userdata(client));
    if (!manager)
    {
        melonDS::Platform::Log(
            melonDS::Platform::LogLevel::Warn,
            "[RAClient] runtime_event_dropped path=rc_client reason=no_manager type=%d\n",
            (int) event->type
        );
        return;
    }

    auto eventMessenger = RetroAchievementsManager::EventMessenger.lock();
    if (!eventMessenger)
    {
        melonDS::Platform::Log(
            melonDS::Platform::LogLevel::Warn,
            "[RAClient] runtime_event_dropped path=rc_client reason=no_messenger type=%d\n",
            (int) event->type
        );
        return;
    }

    if (
        AreLeaderboardDiagnosticsEnabled() &&
        event->type != RC_CLIENT_EVENT_LEADERBOARD_TRACKER_UPDATE
    )
    {
        uint32_t entityId = 0;
        switch (event->type)
        {
            case RC_CLIENT_EVENT_ACHIEVEMENT_TRIGGERED:
            case RC_CLIENT_EVENT_ACHIEVEMENT_CHALLENGE_INDICATOR_SHOW:
            case RC_CLIENT_EVENT_ACHIEVEMENT_CHALLENGE_INDICATOR_HIDE:
            case RC_CLIENT_EVENT_ACHIEVEMENT_PROGRESS_INDICATOR_SHOW:
            case RC_CLIENT_EVENT_ACHIEVEMENT_PROGRESS_INDICATOR_HIDE:
            case RC_CLIENT_EVENT_ACHIEVEMENT_PROGRESS_INDICATOR_UPDATE:
                if (event->achievement)
                    entityId = event->achievement->id;
                break;
            case RC_CLIENT_EVENT_LEADERBOARD_STARTED:
            case RC_CLIENT_EVENT_LEADERBOARD_FAILED:
            case RC_CLIENT_EVENT_LEADERBOARD_SUBMITTED:
                if (event->leaderboard)
                    entityId = event->leaderboard->id;
                break;
            case RC_CLIENT_EVENT_LEADERBOARD_TRACKER_SHOW:
            case RC_CLIENT_EVENT_LEADERBOARD_TRACKER_HIDE:
                if (event->leaderboard_tracker)
                    entityId = event->leaderboard_tracker->id;
                break;
            case RC_CLIENT_EVENT_LEADERBOARD_SCOREBOARD:
                if (event->leaderboard_scoreboard)
                    entityId = event->leaderboard_scoreboard->leaderboard_id;
                break;
            case RC_CLIENT_EVENT_GAME_COMPLETED:
            case RC_CLIENT_EVENT_SUBSET_COMPLETED:
                if (event->subset)
                    entityId = event->subset->id;
                break;
            case RC_CLIENT_EVENT_SERVER_ERROR:
                if (event->server_error)
                    entityId = event->server_error->related_id;
                break;
            default:
                break;
        }
        melonDS::Platform::Log(
            melonDS::Platform::LogLevel::Info,
            "[RAClient] runtime_event_received path=rc_client type=%d id=%u\n",
            (int) event->type,
            entityId
        );
    }

    switch (event->type)
    {
        case RC_CLIENT_EVENT_ACHIEVEMENT_TRIGGERED:
            if (event->achievement)
            {
                manager->MarkPendingSubmissionPresentationReady(
                    RANativePendingSubmissionType::Achievement,
                    event->achievement->id,
                    0,
                    ""
                );
                eventMessenger->onAchievementTriggered(event->achievement->id);
            }
            break;
        case RC_CLIENT_EVENT_ACHIEVEMENT_CHALLENGE_INDICATOR_SHOW:
            if (event->achievement)
                eventMessenger->onAchievementPrimed(event->achievement->id);
            break;
        case RC_CLIENT_EVENT_ACHIEVEMENT_CHALLENGE_INDICATOR_HIDE:
            if (event->achievement)
                eventMessenger->onAchievementUnprimed(event->achievement->id);
            break;
        case RC_CLIENT_EVENT_ACHIEVEMENT_PROGRESS_INDICATOR_SHOW:
        case RC_CLIENT_EVENT_ACHIEVEMENT_PROGRESS_INDICATOR_UPDATE:
            if (event->achievement)
            {
                unsigned int value = 0;
                unsigned int target = 0;
                ParseMeasuredProgress(event->achievement->measured_progress, &value, &target);
                eventMessenger->onAchievementProgressUpdated(event->achievement->id, value, target, event->achievement->measured_progress);
            }
            break;
        case RC_CLIENT_EVENT_ACHIEVEMENT_PROGRESS_INDICATOR_HIDE:
            if (event->achievement)
                eventMessenger->onAchievementProgressHidden(event->achievement->id);
            break;
        case RC_CLIENT_EVENT_LEADERBOARD_STARTED:
            if (event->leaderboard)
            {
                auto& attempt = manager->BeginLeaderboardAttempt(event->leaderboard->id);
                const uint64_t sequence = manager->NextLeaderboardEventSequence(attempt);
                if (AreLeaderboardDiagnosticsEnabled())
                {
                    melonDS::Platform::Log(
                        melonDS::Platform::LogLevel::Info,
                        "[RALeaderboard] attempt_id=%llu leaderboard_id=%u runtime_path=%s event_sequence=%llu event_type=STARTED tracker_display=%s\n",
                        (unsigned long long) attempt.attemptId,
                        event->leaderboard->id,
                        manager->RuntimePathTraceValue(),
                        (unsigned long long) sequence,
                        event->leaderboard->tracker_value ? event->leaderboard->tracker_value : ""
                    );
                }
                eventMessenger->onLeaderboardAttemptStarted(event->leaderboard->id, attempt.attemptId, sequence);
            }
            break;
        case RC_CLIENT_EVENT_LEADERBOARD_TRACKER_SHOW:
        case RC_CLIENT_EVENT_LEADERBOARD_TRACKER_UPDATE:
        case RC_CLIENT_EVENT_LEADERBOARD_TRACKER_HIDE:
            break;
        case RC_CLIENT_EVENT_LEADERBOARD_FAILED:
            if (event->leaderboard)
            {
                auto& attempt = manager->EnsureLeaderboardAttempt(event->leaderboard->id, false);
                if (!attempt.terminal)
                {
                    attempt.terminal = true;
                    const uint64_t sequence = manager->NextLeaderboardEventSequence(attempt);
                    if (AreLeaderboardDiagnosticsEnabled())
                    {
                        melonDS::Platform::Log(
                            melonDS::Platform::LogLevel::Info,
                            "[RALeaderboard] attempt_id=%llu leaderboard_id=%u runtime_path=%s event_sequence=%llu event_type=CANCELED tracker_display=%s\n",
                            (unsigned long long) attempt.attemptId,
                            event->leaderboard->id,
                            manager->RuntimePathTraceValue(),
                            (unsigned long long) sequence,
                            event->leaderboard->tracker_value ? event->leaderboard->tracker_value : ""
                        );
                    }
                    eventMessenger->onLeaderboardAttemptCanceled(event->leaderboard->id, attempt.attemptId, sequence);
                }
            }
            break;
        case RC_CLIENT_EVENT_LEADERBOARD_SUBMITTED:
            if (event->leaderboard)
            {
                auto& attempt = manager->EnsureLeaderboardAttempt(event->leaderboard->id, false);
                if (!attempt.submittedSeen)
                {
                    attempt.submittedSeen = true;
                    const uint64_t sequence = manager->NextLeaderboardEventSequence(attempt);
                    const std::string trackerDisplay = event->leaderboard->tracker_value ? event->leaderboard->tracker_value : "";
                    manager->MarkPendingSubmissionPresentationReady(
                        RANativePendingSubmissionType::Leaderboard,
                        event->leaderboard->id,
                        attempt.attemptId,
                        trackerDisplay
                    );
                    const std::string requestScore = attempt.requestScore.has_value()
                        ? std::to_string(*attempt.requestScore)
                        : "unknown";
                    if (AreLeaderboardDiagnosticsEnabled())
                    {
                        melonDS::Platform::Log(
                            melonDS::Platform::LogLevel::Info,
                            "[RALeaderboard] attempt_id=%llu leaderboard_id=%u runtime_path=%s event_sequence=%llu event_type=SUBMITTED tracker_display=%s request_score=%s logical_submit_count=%u transport_attempt_count=%u terminal_before_event=%d\n",
                            (unsigned long long) attempt.attemptId,
                            event->leaderboard->id,
                            manager->RuntimePathTraceValue(),
                            (unsigned long long) sequence,
                            trackerDisplay.c_str(),
                            requestScore.c_str(),
                            attempt.logicalSubmitCount,
                            attempt.transportAttemptCount,
                            attempt.terminal ? 1 : 0
                        );
                    }
                    if (attempt.transportAttemptCount == 0)
                    {
                        attempt.terminal = true;
                        eventMessenger->onLeaderboardAttemptCanceled(
                            event->leaderboard->id,
                            attempt.attemptId,
                            sequence
                        );
                    }
                    else
                    {
                        eventMessenger->onLeaderboardAttemptSubmitted(
                            event->leaderboard->id,
                            attempt.attemptId,
                            sequence,
                            trackerDisplay
                        );
                    }
                }
            }
            break;
        case RC_CLIENT_EVENT_LEADERBOARD_SCOREBOARD:
            if (event->leaderboard_scoreboard)
            {
                const auto* scoreboard = event->leaderboard_scoreboard;
                auto& attempt = manager->ResolveLeaderboardResponseAttempt(scoreboard->leaderboard_id);
                manager->PublishLeaderboardScoreboard(
                    attempt,
                    scoreboard->leaderboard_id,
                    scoreboard->submitted_score,
                    scoreboard->best_score,
                    scoreboard->new_rank,
                    scoreboard->num_entries,
                    "rc_client_event"
                );
            }
            break;
        case RC_CLIENT_EVENT_GAME_COMPLETED:
            if (event->subset)
                eventMessenger->onAchievementGameCompleted(event->subset->id);
            break;
        case RC_CLIENT_EVENT_SUBSET_COMPLETED:
            if (event->subset)
                eventMessenger->onAchievementSubsetCompleted(event->subset->id);
            break;
        case RC_CLIENT_EVENT_SERVER_ERROR:
            if (event->server_error)
            {
                const std::string api = event->server_error->api ? event->server_error->api : "";
                const std::string message = event->server_error->error_message ? event->server_error->error_message : "";
                manager->MarkActivePendingSubmissionPermanentFailure(event->server_error->result);
                if (api == "submit_lboard_entry" && event->server_error->related_id != 0)
                {
                    auto& attempt = manager->ResolveLeaderboardResponseAttempt(event->server_error->related_id);
                    if (!attempt.terminal)
                    {
                        attempt.terminal = true;
                        const uint64_t sequence = manager->NextLeaderboardEventSequence(attempt);
                        const std::string requestScore = attempt.requestScore.has_value()
                            ? std::to_string(*attempt.requestScore)
                            : "unknown";
                        if (AreLeaderboardDiagnosticsEnabled())
                        {
                            melonDS::Platform::Log(
                                melonDS::Platform::LogLevel::Warn,
                                "[RALeaderboard] attempt_id=%llu leaderboard_id=%u runtime_path=%s event_sequence=%llu event_type=SERVER_ERROR result=%d request_score=%s logical_submit_count=%u transport_attempt_count=%u\n",
                                (unsigned long long) attempt.attemptId,
                                event->server_error->related_id,
                                manager->RuntimePathTraceValue(),
                                (unsigned long long) sequence,
                                event->server_error->result,
                                requestScore.c_str(),
                                attempt.logicalSubmitCount,
                                attempt.transportAttemptCount
                            );
                        }
                        eventMessenger->onLeaderboardSubmissionFailed(
                            event->server_error->related_id,
                            attempt.attemptId,
                            sequence,
                            event->server_error->result,
                            message
                        );
                        manager->ForgetLeaderboardSubmissionCallback(attempt.attemptId);
                    }
                }
                eventMessenger->onRetroAchievementsServerError(
                    api,
                    event->server_error->related_id,
                    event->server_error->result,
                    message
                );
            }
            break;
        case RC_CLIENT_EVENT_DISCONNECTED:
            eventMessenger->onRetroAchievementsDisconnected();
            break;
        case RC_CLIENT_EVENT_RECONNECTED:
            eventMessenger->onRetroAchievementsReconnected();
            break;
        default:
            break;
    }
}

void RetroAchievementsManager::NoopRcClientEventHandler(const rc_client_event_t* event, rc_client_t* client)
{
    (void) event;
    (void) client;
}

uint32_t RetroAchievementsManager::RcClientReadMemory(uint32_t address, uint8_t* buffer, uint32_t numBytes, rc_client_t* client)
{
    if (!client || !buffer || numBytes == 0)
        return 0;

    auto* manager = static_cast<RetroAchievementsManager*>(rc_client_get_userdata(client));
    if (!manager || !manager->nds)
        return 0;

    if (address > std::numeric_limits<uint32_t>::max() - numBytes)
        return 0;

    return ReadMemoryRange(manager->nds, address, buffer, numBytes);
}

void RetroAchievementsManager::RcClientServerCall(const rc_api_request_t* request, rc_client_server_callback_t callback, void* callbackData, rc_client_t* client)
{
    if (!callback || !client)
        return;

    auto* manager = static_cast<RetroAchievementsManager*>(rc_client_get_userdata(client));
    if (!manager)
        return;

    std::string responseBody;
    int httpStatus = RC_API_SERVER_RESPONSE_RETRYABLE_CLIENT_ERROR;
    const std::string runtimeUserAgent = (manager->runtimeBridgeConfig.has_value() && !manager->runtimeBridgeConfig->userAgent.empty()) ?
        manager->runtimeBridgeConfig->userAgent :
        std::string();
    const std::string requestAction = ResolveRcClientRequestAction(request);
    const std::string requestParameters = BuildRcClientSanitizedParameters(request);
    const std::string safeRequestUrl = BuildRcClientSafeUrl(request ? request->url : nullptr);
    const uintptr_t callbackDataToken = reinterpret_cast<uintptr_t>(callbackData);
    std::optional<uint64_t> leaderboardAttemptId;
    std::optional<uint32_t> submittedLeaderboardId;

    if (requestAction == "submitlbentry")
    {
        const auto leaderboardIdParameter = ParseRcClientIntegerParameter(request, "i");
        const auto scoreParameter = ParseRcClientIntegerParameter(request, "s");
        if (
            leaderboardIdParameter.has_value() &&
            *leaderboardIdParameter > 0 &&
            *leaderboardIdParameter <= std::numeric_limits<uint32_t>::max() &&
            scoreParameter.has_value() &&
            *scoreParameter >= std::numeric_limits<int32_t>::min() &&
            *scoreParameter <= std::numeric_limits<int32_t>::max()
        )
        {
            const uint32_t leaderboardId = static_cast<uint32_t>(*leaderboardIdParameter);
            const bool hasRetryParameter = GetRcClientFormParameter(request, "o").has_value();
            const bool isImmediateRetry = callbackDataToken != 0 &&
                manager->activeLeaderboardResponseCallbackData == callbackDataToken;
            const bool isRetry = hasRetryParameter || isImmediateRetry;
            auto& attempt = manager->ResolveLeaderboardRequestAttempt(
                leaderboardId,
                callbackDataToken,
                isRetry
            );
            attempt.requestScore = static_cast<int32_t>(*scoreParameter);
            attempt.transportAttemptCount++;
            leaderboardAttemptId = attempt.attemptId;
            submittedLeaderboardId = leaderboardId;
            const uint64_t sequence = manager->NextLeaderboardEventSequence(attempt);
            if (AreLeaderboardDiagnosticsEnabled())
            {
                melonDS::Platform::Log(
                    melonDS::Platform::LogLevel::Info,
                    "[RALeaderboard] attempt_id=%llu leaderboard_id=%u runtime_path=%s event_sequence=%llu event_type=REQUEST request_score=%d logical_submit_count=%u transport_attempt_count=%u retry=%d retry_source=%s\n",
                    (unsigned long long) attempt.attemptId,
                    leaderboardId,
                    manager->RuntimePathTraceValue(),
                    (unsigned long long) sequence,
                    *attempt.requestScore,
                    attempt.logicalSubmitCount,
                    attempt.transportAttemptCount,
                    isRetry ? 1 : 0,
                    isImmediateRetry ? "response_callback" : (hasRetryParameter ? "elapsed_parameter" : "none")
                );
            }
        }
        else
        {
            if (AreLeaderboardDiagnosticsEnabled())
            {
                melonDS::Platform::Log(
                    melonDS::Platform::LogLevel::Warn,
                    "[RALeaderboard] runtime_path=%s event_type=REQUEST_INVALID reason=missing_or_out_of_range_id_or_score\n",
                    manager->RuntimePathTraceValue()
                );
            }
        }
    }

    manager->PreparePendingSubmission(
        requestAction,
        request,
        callbackDataToken,
        leaderboardAttemptId
    );

    const auto invokeServerCallback = [&](const rc_api_server_response_t* serverResponse) {
        const auto previousAttemptId = manager->activeLeaderboardResponseAttemptId;
        const uintptr_t previousCallbackData = manager->activeLeaderboardResponseCallbackData;
        const uintptr_t previousSubmissionCallbackData = manager->activeSubmissionResponseCallbackData;
        MelonDSAndroidLeaderboardScoreboardResponse transportScoreboard{};
        const bool hasTransportScoreboard =
            leaderboardAttemptId.has_value() &&
            submittedLeaderboardId.has_value() &&
            MelonDSAndroidParseLeaderboardScoreboardResponse(
                serverResponse,
                client,
                *submittedLeaderboardId,
                &transportScoreboard
            );
        bool alreadyAccepted = false;
        if (requestAction == "awardachievement")
        {
            rc_api_award_achievement_response_t awardResponse{};
            const int parseResult = rc_api_process_award_achievement_server_response(
                &awardResponse,
                serverResponse
            );
            alreadyAccepted =
                parseResult == RC_OK &&
                awardResponse.response.succeeded &&
                awardResponse.response.error_message != nullptr;
            rc_api_destroy_award_achievement_response(&awardResponse);
        }
        if (leaderboardAttemptId.has_value())
        {
            manager->activeLeaderboardResponseAttemptId = leaderboardAttemptId;
            manager->activeLeaderboardResponseCallbackData = callbackDataToken;
        }
        manager->activeSubmissionResponseCallbackData = callbackDataToken;

        callback(serverResponse, callbackData);

        if (hasTransportScoreboard)
        {
            auto* attempt = manager->FindLeaderboardAttempt(*leaderboardAttemptId);
            if (
                attempt &&
                attempt->leaderboardId == *submittedLeaderboardId &&
                MelonDSAndroidShouldPublishLeaderboardScoreboardFallback(
                    1,
                    attempt->scoreboardSeen ? 1 : 0,
                    attempt->terminal ? 1 : 0
                )
            )
            {
                manager->PublishLeaderboardScoreboard(
                    *attempt,
                    *submittedLeaderboardId,
                    transportScoreboard.submittedScore,
                    transportScoreboard.bestScore,
                    transportScoreboard.newRank,
                    transportScoreboard.numEntries,
                    "transport_callback"
                );
            }
        }

        const bool retryPending =
            rc_client_is_submission_retry_pending_token(client, callbackDataToken) != 0;
        manager->FinalizePendingSubmissionTransport(
            callbackDataToken,
            retryPending,
            alreadyAccepted
        );
        manager->activeLeaderboardResponseAttemptId = previousAttemptId;
        manager->activeLeaderboardResponseCallbackData = previousCallbackData;
        manager->activeSubmissionResponseCallbackData = previousSubmissionCallbackData;
        manager->PruneUnreferencedLeaderboardAttempts();
    };

    const bool isSubmissionRequest =
        requestAction == "awardachievement" ||
        requestAction == "submitlbentry";
    if (
        isSubmissionRequest &&
        manager->submissionTransportSuspended.load(std::memory_order_acquire)
    )
    {
        melonDS::Platform::Log(
            melonDS::Platform::LogLevel::Info,
            "[RAPending] event_type=ra_submission_transport_suspended action=%s submission_session_id=%llu runtime_path=%s\n",
            requestAction.c_str(),
            static_cast<unsigned long long>(
                manager->runtimeBridgeConfig.has_value()
                    ? manager->runtimeBridgeConfig->submissionSessionId
                    : 0
            ),
            manager->RuntimePathTraceValue()
        );
        const rc_api_server_response_t serverResponse = {
            .body = "",
            .body_length = 0,
            .http_status_code = 503,
        };
        invokeServerCallback(&serverResponse);
        return;
    }

    const bool useOfflineTransport =
        manager->runtimeBridgeConfig.has_value() &&
        manager->runtimeBridgeConfig->runtimeMode == RARuntimeBridgeMode::RcClientOffline;
    if (useOfflineTransport)
    {
        responseBody = manager->BuildRcClientOfflineResponse(requestAction);
        httpStatus = 200;
        melonDS::Platform::Log(
            melonDS::Platform::LogLevel::Warn,
            "[RARequest] source=rc_client_offline action=%s method=%s user_agent=%s url=%s params=%s response_bytes=%zu response_sample=%s\n",
            requestAction.c_str(),
            ResolveRcClientRequestMethod(request),
            runtimeUserAgent.empty() ? RC_CLIENT_DEFAULT_USER_AGENT : runtimeUserAgent.c_str(),
            safeRequestUrl.c_str(),
            requestParameters.c_str(),
            responseBody.size(),
            BuildRcClientLoggedResponseSample(requestAction, responseBody).c_str()
        );

        rc_api_server_response_t serverResponse = {
            .body = responseBody.c_str(),
            .body_length = responseBody.length(),
            .http_status_code = httpStatus,
        };
        invokeServerCallback(&serverResponse);
        return;
    }

    melonDS::Platform::Log(
        melonDS::Platform::LogLevel::Warn,
        "[RARequest] source=rc_client_http action=%s method=%s user_agent=%s url=%s params=%s\n",
        requestAction.c_str(),
        ResolveRcClientRequestMethod(request),
        runtimeUserAgent.empty() ? RC_CLIENT_DEFAULT_USER_AGENT : runtimeUserAgent.c_str(),
        safeRequestUrl.c_str(),
        requestParameters.c_str()
    );
    const bool requestSucceeded = ExecuteRcClientHttpRequest(
        javaVm,
        request,
        runtimeUserAgent.empty() ? nullptr : runtimeUserAgent.c_str(),
        &responseBody,
        &httpStatus
    );
    if (!requestSucceeded)
    {
        if (responseBody.empty())
            responseBody = BuildRcClientErrorResponse("Native rc_client transport failed");
    }

    rc_api_server_response_t serverResponse = {
        .body = responseBody.c_str(),
        .body_length = responseBody.length(),
        .http_status_code = httpStatus,
    };

    invokeServerCallback(&serverResponse);
}

void RetroAchievementsManager::RcClientLogCallback(const char* message, const rc_client_t* client)
{
    (void) client;
    if (!message)
        return;

    melonDS::Platform::Log(melonDS::Platform::LogLevel::Info, "[RAClient] %s\n", message);
}

bool RetroAchievementsManager::TryActivateRcClientRuntimeLocked()
{
    DeactivateRcClientRuntimeLocked();
    submissionTransportSuspended.store(false, std::memory_order_release);

    if (!IsRcClientConfiguredLocked())
        return false;

    rcClientRuntime = rc_client_create(&RcClientReadMemory, &RcClientServerCall);
    if (!rcClientRuntime)
        return false;

    rc_client_set_userdata(rcClientRuntime, this);
    rc_client_set_event_handler(rcClientRuntime, &RcClientEventHandler);
#ifdef NDEBUG
    rc_client_enable_logging(rcClientRuntime, RC_CLIENT_LOG_LEVEL_ERROR, &RcClientLogCallback);
#else
    rc_client_enable_logging(rcClientRuntime, RC_CLIENT_LOG_LEVEL_WARN, &RcClientLogCallback);
#endif
    rc_client_set_allow_background_memory_reads(rcClientRuntime, 1);

    const auto& config = *runtimeBridgeConfig;
    rc_client_set_host(rcClientRuntime, config.apiHost.c_str());
    melonDS::Platform::Log(
        melonDS::Platform::LogLevel::Info,
        "[RAIdentity] source=rc_client_bootstrap user_agent=%s game_id=%lld game_hash=redacted hardcore=%d unofficial=%d encore=%d host_source=%s native_client_host_configured=%d endpoint_generation=%llu\n",
        config.userAgent.empty() ? RC_CLIENT_DEFAULT_USER_AGENT : config.userAgent.c_str(),
        (long long) config.gameId,
        config.hardcoreEnabled ? 1 : 0,
        config.unofficialEnabled ? 1 : 0,
        config.encoreEnabled ? 1 : 0,
        config.usesProxyHost ? "raofflineproxy" : "official",
        config.apiHost.empty() ? 0 : 1,
        (unsigned long long) config.endpointGeneration
    );
    rc_client_set_hardcore_enabled(rcClientRuntime, config.hardcoreEnabled ? 1 : 0);
    rc_client_set_unofficial_enabled(rcClientRuntime, config.unofficialEnabled ? 1 : 0);
    rc_client_set_encore_mode_enabled(rcClientRuntime, config.encoreEnabled ? 1 : 0);
    const bool isOfflineRuntime = config.runtimeMode == RARuntimeBridgeMode::RcClientOffline;
    rc_client_set_spectator_mode_enabled(rcClientRuntime, isOfflineRuntime ? 1 : 0);
    melonDS::Platform::Log(
        melonDS::Platform::LogLevel::Info,
        "[RAClient] runtime_flags_applied hardcore=%d unofficial=%d encore=%d spectator=%d\n",
        config.hardcoreEnabled ? 1 : 0,
        config.unofficialEnabled ? 1 : 0,
        config.encoreEnabled ? 1 : 0,
        isOfflineRuntime ? 1 : 0
    );

    RcClientWaitResult loginWaitResult;
    bool loginSucceeded = false;
    for (int attempt = 1; attempt <= RC_CLIENT_BOOTSTRAP_MAX_ATTEMPTS; ++attempt)
    {
        RcClientAsyncResult loginResult;
        rc_client_async_handle_t* loginHandle = rc_client_begin_login_with_token(
            rcClientRuntime,
            config.username.c_str(),
            config.apiToken.c_str(),
            &OnRcClientAsyncCompleted,
            &loginResult
        );
        loginWaitResult = WaitForRcClientResult(rcClientRuntime, loginHandle, &loginResult, RC_CLIENT_LOGIN_TIMEOUT);
        if (loginWaitResult.succeeded)
        {
            loginSucceeded = true;
            break;
        }

        LogRcClientBootstrapFailure("login", attempt, loginWaitResult);
        if (attempt < RC_CLIENT_BOOTSTRAP_MAX_ATTEMPTS)
        {
            rc_client_logout(rcClientRuntime);
            std::this_thread::sleep_for(RC_CLIENT_BOOTSTRAP_RETRY_DELAY);
        }
    }

    if (!loginSucceeded)
    {
        melonDS::Platform::Log(
            melonDS::Platform::LogLevel::Warn,
            "[RAClient] rc_client activation failed stage=login timedOut=%d result=%d\n",
            loginWaitResult.timedOut ? 1 : 0,
            loginWaitResult.result
        );
        DeactivateRcClientRuntimeLocked();
        return false;
    }

    RcClientWaitResult loadWaitResult;
    bool loadSucceeded = false;
    for (int attempt = 1; attempt <= RC_CLIENT_BOOTSTRAP_MAX_ATTEMPTS; ++attempt)
    {
        RcClientAsyncResult loadResult;
        rc_client_async_handle_t* loadHandle = rc_client_begin_load_game(
            rcClientRuntime,
            config.gameHash.c_str(),
            &OnRcClientAsyncCompleted,
            &loadResult
        );
        loadWaitResult = WaitForRcClientResult(rcClientRuntime, loadHandle, &loadResult, RC_CLIENT_LOAD_TIMEOUT);
        if (loadWaitResult.succeeded)
        {
            loadSucceeded = true;
            break;
        }

        LogRcClientBootstrapFailure("load_game", attempt, loadWaitResult);
        if (attempt < RC_CLIENT_BOOTSTRAP_MAX_ATTEMPTS)
        {
            rc_client_unload_game(rcClientRuntime);
            std::this_thread::sleep_for(RC_CLIENT_BOOTSTRAP_RETRY_DELAY);
        }
    }

    if (!loadSucceeded)
    {
        melonDS::Platform::Log(
            melonDS::Platform::LogLevel::Warn,
            "[RAClient] rc_client activation failed stage=load_game timedOut=%d result=%d\n",
            loadWaitResult.timedOut ? 1 : 0,
            loadWaitResult.result
        );
        DeactivateRcClientRuntimeLocked();
        return false;
    }

    isRcClientRuntimeActive = rc_client_is_game_loaded(rcClientRuntime) != 0;
    if (isRcClientRuntimeActive)
    {
        rc_client_set_allow_background_memory_reads(rcClientRuntime, 0);
        PublishLeaderboardResetBarrierLocked();
    }
    if (!isRcClientRuntimeActive)
    {
        melonDS::Platform::Log(
            melonDS::Platform::LogLevel::Warn,
            "[RAClient] rc_client activation failed stage=load_game reason=game_not_loaded\n"
        );
        DeactivateRcClientRuntimeLocked();
    }
    return isRcClientRuntimeActive;
}

void RetroAchievementsManager::DeactivateRcClientRuntimeLocked()
{
    submissionTransportSuspended.store(false, std::memory_order_release);
    if (rcClientRuntime)
    {
        rc_client_set_event_handler(rcClientRuntime, &NoopRcClientEventHandler);
        const uint32_t discardedSubmissions =
            rc_client_discard_pending_submissions(rcClientRuntime);
        if (discardedSubmissions > 0)
        {
            melonDS::Platform::Log(
                melonDS::Platform::LogLevel::Info,
                "[RAPending] event_type=ra_pending_native_discarded submission_session_id=%llu count=%u runtime_path=%s\n",
                static_cast<unsigned long long>(
                    runtimeBridgeConfig.has_value()
                        ? runtimeBridgeConfig->submissionSessionId
                        : 0
                ),
                discardedSubmissions,
                RuntimePathTraceValue()
            );
        }
        rc_client_unload_game(rcClientRuntime);
        rc_client_logout(rcClientRuntime);
        rc_client_destroy(rcClientRuntime);
        rcClientRuntime = nullptr;
    }

    leaderboardAttemptsById.clear();
    activeLeaderboardAttemptIds.clear();
    leaderboardAttemptIdsByCallbackData.clear();
    activeLeaderboardResponseAttemptId.reset();
    activeLeaderboardResponseCallbackData = 0;
    lastPublishedLeaderboardTrackerValues.clear();
    pendingSubmissionsByCallbackData.clear();
    terminalPendingSubmissionsById.clear();
    activeSubmissionResponseCallbackData = 0;
    nextPendingSubmissionBarrierId = 1;
    isRcClientRuntimeActive = false;
    rcClientSlowWindowCount = 0;
    ResetRcClientPerformanceWindowLocked();
}

void RetroAchievementsManager::ResetRcClientPerformanceWindowLocked()
{
    rcClientWindowFrameCount = 0;
    rcClientWindowSlowFrameCount = 0;
    rcClientWindowAccumulatedUs = 0;
    rcClientWindowPeakUs = 0;
    rcClientWindowCpuFrameCount = 0;
    rcClientWindowCpuSlowFrameCount = 0;
    rcClientWindowCpuAccumulatedUs = 0;
    rcClientWindowCpuPeakUs = 0;
}

std::string RetroAchievementsManager::BuildRcClientLoginResponse() const
{
    const auto username = runtimeBridgeConfig ? runtimeBridgeConfig->username : "";
    const auto token = runtimeBridgeConfig ? runtimeBridgeConfig->apiToken : "";

    std::ostringstream response;
    response << "{\"Success\":true,"
             << "\"User\":\"" << EscapeJson(username) << "\","
             << "\"Token\":\"" << EscapeJson(token) << "\","
             << "\"Score\":0,"
             << "\"SoftcoreScore\":0,"
             << "\"Messages\":0,"
             << "\"AvatarUrl\":\"\"}";
    return response.str();
}

std::string RetroAchievementsManager::BuildRcClientResolveHashResponse() const
{
    const auto gameId = (runtimeBridgeConfig && runtimeBridgeConfig->gameId > 0) ? runtimeBridgeConfig->gameId : 1;

    std::ostringstream response;
    response << "{\"Success\":true,\"GameID\":" << gameId << "}";
    return response.str();
}

std::string RetroAchievementsManager::BuildRcClientAchievementSetsResponse() const
{
    const auto gameId = (runtimeBridgeConfig && runtimeBridgeConfig->gameId > 0) ? runtimeBridgeConfig->gameId : 1;
    const auto username = runtimeBridgeConfig ? runtimeBridgeConfig->username : "melonDualDS";

    std::ostringstream response;
    response << "{\"Success\":true,"
             << "\"GameId\":" << gameId << ","
             << "\"Title\":\"melonDualDS\","
             << "\"ConsoleId\":" << RC_CONSOLE_NINTENDO_DS << ","
             << "\"ImageIconUrl\":\"" << RC_CLIENT_DEFAULT_IMAGE << "\","
             << "\"RichPresenceGameId\":" << gameId << ","
             << "\"RichPresencePatch\":\"" << EscapeJson(loadedRichPresenceScript) << "\","
             << "\"Sets\":[{"
             << "\"AchievementSetId\":" << gameId << ","
             << "\"GameId\":" << gameId << ","
             << "\"Title\":\"Core\","
             << "\"Type\":\"core\","
             << "\"ImageIconUrl\":\"" << RC_CLIENT_DEFAULT_IMAGE << "\","
             << "\"Achievements\":[";

    bool firstAchievement = true;
    for (const auto& achievement : loadedAchievements)
    {
        if (!firstAchievement)
            response << ",";
        firstAchievement = false;

        response << "{"
                 << "\"ID\":" << achievement.id << ","
                 << "\"Title\":\"Achievement " << achievement.id << "\","
                 << "\"Description\":\"\","
                 << "\"Flags\":3,"
                 << "\"Points\":5,"
                 << "\"MemAddr\":\"" << EscapeJson(achievement.memoryAddress) << "\","
                 << "\"Author\":\"" << EscapeJson(username) << "\","
                 << "\"BadgeName\":\"000000\","
                 << "\"Created\":0,"
                 << "\"Modified\":0,"
                 << "\"Type\":\"\","
                 << "\"Rarity\":100.0,"
                 << "\"RarityHardcore\":100.0,"
                 << "\"BadgeURL\":\"\","
                 << "\"BadgeLockedURL\":\"\""
                 << "}";
    }

    response << "],\"Leaderboards\":[";

    bool firstLeaderboard = true;
    for (const auto& leaderboard : loadedLeaderboards)
    {
        if (!firstLeaderboard)
            response << ",";
        firstLeaderboard = false;

        response << "{"
                 << "\"ID\":" << leaderboard.id << ","
                 << "\"Title\":\"Leaderboard " << leaderboard.id << "\","
                 << "\"Description\":\"\","
                 << "\"Mem\":\"" << EscapeJson(leaderboard.memoryAddress) << "\","
                 << "\"Format\":\"" << EscapeJson(leaderboard.format) << "\","
                 << "\"LowerIsBetter\":false,"
                 << "\"Hidden\":false"
                 << "}";
    }

    response << "]}]}";
    return response.str();
}

std::string RetroAchievementsManager::BuildRcClientOfflineResponse(const std::string& requestAction) const
{
    if (requestAction == "login2" || requestAction == "login")
        return BuildRcClientLoginResponse();

    if (requestAction == "gameid")
        return BuildRcClientResolveHashResponse();

    if (requestAction == "achievementsets")
        return BuildRcClientAchievementSetsResponse();

    if (requestAction == "startsession")
        return BuildRcClientStartSessionResponse();

    if (requestAction == "ping")
        return BuildRcClientSuccessResponse();

    if (requestAction == "awardachievement")
        return BuildRcClientSuccessResponse();

    if (requestAction == "submitlbentry")
        return BuildRcClientErrorResponse("Offline leaderboard submission disabled");

    return BuildRcClientErrorResponse("Offline RetroAchievements request not available: " + requestAction);
}

std::string RetroAchievementsManager::BuildRcClientSuccessResponse()
{
    return "{\"Success\":true}";
}

std::string RetroAchievementsManager::BuildRcClientStartSessionResponse()
{
    return "{\"Success\":true,\"Unlocks\":[],\"HardcoreUnlocks\":[],\"ServerNow\":0}";
}

std::string RetroAchievementsManager::BuildRcClientErrorResponse(const std::string& message)
{
    return "{\"Success\":false,\"Error\":\"" + EscapeJson(message) + "\"}";
}

bool RetroAchievementsManager::IsRcClientConfiguredLocked() const
{
    return runtimeBridgeConfig.has_value() &&
        (
            runtimeBridgeConfig->runtimeMode == RARuntimeBridgeMode::RcClientOnline ||
            runtimeBridgeConfig->runtimeMode == RARuntimeBridgeMode::RcClientOffline
        ) &&
        (
            runtimeBridgeConfig->runtimeMode == RARuntimeBridgeMode::RcClientOffline ||
            (
                runtimeBridgeConfig->submissionSessionId != 0 &&
                runtimeBridgeConfig->submissionSessionId <=
                    static_cast<uint64_t>(std::numeric_limits<int64_t>::max())
            )
        ) &&
        !runtimeBridgeConfig->username.empty() &&
        !runtimeBridgeConfig->apiToken.empty() &&
        !runtimeBridgeConfig->gameHash.empty() &&
        !runtimeBridgeConfig->apiHost.empty();
}

bool RetroAchievementsManager::IsRcClientRuntimeActiveLocked() const
{
    return isRcClientRuntimeActive && rcClientRuntime && rc_client_is_game_loaded(rcClientRuntime);
}

std::string RetroAchievementsManager::EscapeJson(const std::string& value)
{
    std::string escaped;
    escaped.reserve(value.size() + 16);

    for (char character : value)
    {
        switch (character)
        {
            case '\"': escaped += "\\\""; break;
            case '\\': escaped += "\\\\"; break;
            case '\b': escaped += "\\b"; break;
            case '\f': escaped += "\\f"; break;
            case '\n': escaped += "\\n"; break;
            case '\r': escaped += "\\r"; break;
            case '\t': escaped += "\\t"; break;
            default:
                escaped += character;
                break;
        }
    }

    return escaped;
}

void RetroAchievementsManager::ParseMeasuredProgress(const char* measuredProgress, unsigned int* value, unsigned int* target)
{
    if (!value || !target)
        return;

    *value = 0;
    *target = 0;

    if (!measuredProgress || measuredProgress[0] == '\0')
        return;

    const char* separator = strchr(measuredProgress, '/');
    if (separator)
    {
        std::string currentString(measuredProgress, separator - measuredProgress);
        std::string targetString(separator + 1);

        *value = ParseIntegerOrDefault(currentString.c_str(), 0);
        *target = ParseIntegerOrDefault(targetString.c_str(), 0);
        return;
    }

    const size_t measuredLength = strlen(measuredProgress);
    if (measuredLength > 1 && measuredProgress[measuredLength - 1] == '%')
    {
        std::string percentString(measuredProgress, measuredLength - 1);
        *value = ParseIntegerOrDefault(percentString.c_str(), 0);
        *target = 100;
    }
}

int RetroAchievementsManager::ParseIntegerOrDefault(const char* value, int fallbackValue)
{
    if (!value || value[0] == '\0')
        return fallbackValue;

    const size_t valueLength = strlen(value);
    std::string normalizedValue;
    normalizedValue.reserve(valueLength);

    for (size_t index = 0; index < valueLength; ++index)
    {
        const char currentCharacter = value[index];
        if (std::isdigit(static_cast<unsigned char>(currentCharacter)))
            normalizedValue.push_back(currentCharacter);
        else if ((currentCharacter == '+' || currentCharacter == '-') && normalizedValue.empty())
            normalizedValue.push_back(currentCharacter);
        else if (currentCharacter == ',' || currentCharacter == '.' || currentCharacter == '_' || currentCharacter == '\'' || std::isspace(static_cast<unsigned char>(currentCharacter)))
            continue;
        else
            return fallbackValue;
    }

    if (normalizedValue.empty() || normalizedValue == "+" || normalizedValue == "-")
        return fallbackValue;

    char* end = nullptr;
    errno = 0;
    long long parsedValue = std::strtoll(normalizedValue.c_str(), &end, 10);
    if (end == normalizedValue.c_str() || (end && *end != '\0') || errno == ERANGE)
        return fallbackValue;

    if (parsedValue > std::numeric_limits<int>::max() || parsedValue < std::numeric_limits<int>::min())
        return fallbackValue;

    return (int) parsedValue;
}

RetroAchievementsManager::LeaderboardAttemptState& RetroAchievementsManager::BeginLeaderboardAttempt(uint32_t leaderboardId)
{
    LeaderboardAttemptState attempt;
    attempt.leaderboardId = leaderboardId;
    attempt.attemptId = LeaderboardAttemptCorrelation::AllocateAttemptId();

    const uint64_t attemptId = attempt.attemptId;
    auto iterator = leaderboardAttemptsById.insert_or_assign(attemptId, attempt).first;
    activeLeaderboardAttemptIds.insert_or_assign(leaderboardId, attemptId);
    lastPublishedLeaderboardTrackerValues.erase(leaderboardId);
    PruneUnreferencedLeaderboardAttempts();
    return iterator->second;
}

RetroAchievementsManager::LeaderboardAttemptState& RetroAchievementsManager::EnsureLeaderboardAttempt(
    uint32_t leaderboardId,
    bool startNewIfTerminal
)
{
    const auto activeIterator = activeLeaderboardAttemptIds.find(leaderboardId);
    if (activeIterator == activeLeaderboardAttemptIds.end())
        return BeginLeaderboardAttempt(leaderboardId);

    auto* attempt = FindLeaderboardAttempt(activeIterator->second);
    if (!attempt || (startNewIfTerminal && attempt->terminal))
        return BeginLeaderboardAttempt(leaderboardId);

    return *attempt;
}

RetroAchievementsManager::LeaderboardAttemptState& RetroAchievementsManager::ResolveLeaderboardRequestAttempt(
    uint32_t leaderboardId,
    uintptr_t callbackDataToken,
    bool isRetry
)
{
    if (isRetry && callbackDataToken != 0)
    {
        const auto callbackIterator = leaderboardAttemptIdsByCallbackData.find(callbackDataToken);
        if (callbackIterator != leaderboardAttemptIdsByCallbackData.end())
        {
            auto* mappedAttempt = FindLeaderboardAttempt(callbackIterator->second);
            if (mappedAttempt && mappedAttempt->leaderboardId == leaderboardId)
                return *mappedAttempt;
        }
    }

    auto& attempt = EnsureLeaderboardAttempt(leaderboardId, true);
    attempt.logicalSubmitCount++;
    if (callbackDataToken != 0)
        leaderboardAttemptIdsByCallbackData.insert_or_assign(callbackDataToken, attempt.attemptId);
    return attempt;
}

RetroAchievementsManager::LeaderboardAttemptState& RetroAchievementsManager::ResolveLeaderboardResponseAttempt(
    uint32_t leaderboardId
)
{
    if (activeLeaderboardResponseAttemptId.has_value())
    {
        auto* attempt = FindLeaderboardAttempt(*activeLeaderboardResponseAttemptId);
        if (attempt && attempt->leaderboardId == leaderboardId)
            return *attempt;
    }

    return EnsureLeaderboardAttempt(leaderboardId, false);
}

RetroAchievementsManager::LeaderboardAttemptState* RetroAchievementsManager::FindLeaderboardAttempt(uint64_t attemptId)
{
    const auto iterator = leaderboardAttemptsById.find(attemptId);
    return iterator != leaderboardAttemptsById.end() ? &iterator->second : nullptr;
}

void RetroAchievementsManager::PublishLeaderboardScoreboard(
    LeaderboardAttemptState& attempt,
    uint32_t leaderboardId,
    const std::string& submittedScore,
    const std::string& bestScore,
    uint32_t newRank,
    uint32_t numEntries,
    const char* source
)
{
    if (attempt.scoreboardSeen || attempt.terminal)
        return;

    auto eventMessenger = RetroAchievementsManager::EventMessenger.lock();
    if (!eventMessenger)
        return;

    const std::string ownedSubmittedScore(submittedScore);
    const std::string ownedBestScore(bestScore);
    attempt.scoreboardSeen = true;
    attempt.terminal = true;
    const uint64_t sequence = NextLeaderboardEventSequence(attempt);
    const std::string requestScore = attempt.requestScore.has_value()
        ? std::to_string(*attempt.requestScore)
        : "unknown";

    if (AreLeaderboardDiagnosticsEnabled())
    {
        melonDS::Platform::Log(
            melonDS::Platform::LogLevel::Info,
            "[RALeaderboard] attempt_id=%llu leaderboard_id=%u runtime_path=%s event_sequence=%llu event_type=SCOREBOARD scoreboard_source=%s response_submitted_score=%s best_score=%s rank=%u num_entries=%u request_score=%s logical_submit_count=%u transport_attempt_count=%u\n",
            (unsigned long long) attempt.attemptId,
            leaderboardId,
            RuntimePathTraceValue(),
            (unsigned long long) sequence,
            source ? source : "unknown",
            ownedSubmittedScore.c_str(),
            ownedBestScore.c_str(),
            newRank,
            numEntries,
            requestScore.c_str(),
            attempt.logicalSubmitCount,
            attempt.transportAttemptCount
        );
    }

    for (const auto& entry : pendingSubmissionsByCallbackData)
    {
        const auto& submission = entry.second;
        if (
            submission.published &&
            submission.type == RANativePendingSubmissionType::Leaderboard &&
            submission.leaderboardId == leaderboardId &&
            submission.attemptId == attempt.attemptId &&
            submission.rawScore.has_value()
        )
        {
            melonDS::Platform::Log(
                melonDS::Platform::LogLevel::Info,
                "[RAPending] event_type=leaderboard_retry_scoreboard leaderboard_id=%u attempt_id=%llu original_raw_score=%d submitted_score=%s best_score=%s rank=%u num_entries=%u submit_owner=rc_client\n",
                leaderboardId,
                static_cast<unsigned long long>(attempt.attemptId),
                *submission.rawScore,
                ownedSubmittedScore.c_str(),
                ownedBestScore.c_str(),
                newRank,
                numEntries
            );
            break;
        }
    }

    eventMessenger->onLeaderboardScoreboard(
        leaderboardId,
        attempt.attemptId,
        sequence,
        ownedSubmittedScore,
        ownedBestScore,
        newRank,
        numEntries
    );
    ForgetLeaderboardSubmissionCallback(attempt.attemptId);
}

void RetroAchievementsManager::ForgetLeaderboardSubmissionCallback(uint64_t attemptId)
{
    for (auto iterator = leaderboardAttemptIdsByCallbackData.begin(); iterator != leaderboardAttemptIdsByCallbackData.end();)
    {
        if (iterator->second == attemptId)
            iterator = leaderboardAttemptIdsByCallbackData.erase(iterator);
        else
            ++iterator;
    }
}

bool RetroAchievementsManager::IsLeaderboardAttemptReferenced(uint64_t attemptId) const
{
    if (activeLeaderboardResponseAttemptId == attemptId)
        return true;

    for (const auto& activeAttempt : activeLeaderboardAttemptIds)
    {
        if (activeAttempt.second == attemptId)
            return true;
    }

    for (const auto& callbackAttempt : leaderboardAttemptIdsByCallbackData)
    {
        if (callbackAttempt.second == attemptId)
            return true;
    }

    return false;
}

void RetroAchievementsManager::PruneUnreferencedLeaderboardAttempts()
{
    for (auto iterator = leaderboardAttemptsById.begin(); iterator != leaderboardAttemptsById.end();)
    {
        if (IsLeaderboardAttemptReferenced(iterator->first))
            ++iterator;
        else
            iterator = leaderboardAttemptsById.erase(iterator);
    }
}

void RetroAchievementsManager::PublishLeaderboardResetBarrierLocked()
{
    activeLeaderboardAttemptIds.clear();
    lastPublishedLeaderboardTrackerValues.clear();
    PruneUnreferencedLeaderboardAttempts();
    const uint64_t attemptFloor = LeaderboardAttemptCorrelation::AllocateAttemptId();

    if (AreLeaderboardDiagnosticsEnabled())
    {
        melonDS::Platform::Log(
            melonDS::Platform::LogLevel::Info,
            "[RALeaderboard] event_type=RUNTIME_RESET attempt_floor=%llu\n",
            (unsigned long long) attemptFloor
        );
    }

    if (auto eventMessenger = RetroAchievementsManager::EventMessenger.lock())
        eventMessenger->onLeaderboardRuntimeReset(attemptFloor);
}

uint64_t RetroAchievementsManager::NextLeaderboardEventSequence(LeaderboardAttemptState& attempt)
{
    return ++attempt.eventSequence;
}

const char* RetroAchievementsManager::RuntimePathTraceValue() const
{
    return runtimeBridgeConfig.has_value() && runtimeBridgeConfig->runtimeMode == RARuntimeBridgeMode::RcClientOffline
        ? "rc_client_offline"
        : "rc_client_online";
}

RetroAchievementsManager::PendingSubmissionState* RetroAchievementsManager::PreparePendingSubmission(
    const std::string& requestAction,
    const rc_api_request_t* request,
    uintptr_t callbackDataToken,
    std::optional<uint64_t> leaderboardAttemptId
)
{
    if (
        callbackDataToken == 0 ||
        runtimeMode != RuntimeMode::RcClientOnline ||
        !runtimeBridgeConfig.has_value() ||
        runtimeBridgeConfig->submissionSessionId == 0 ||
        !runtimeBridgeConfig->hardcoreEnabled
    )
    {
        return nullptr;
    }

    const auto existing = pendingSubmissionsByCallbackData.find(callbackDataToken);
    if (existing != pendingSubmissionsByCallbackData.end())
        return &existing->second;

    PendingSubmissionState submission;
    if (requestAction == "awardachievement")
    {
        const auto achievementId = ParseRcClientIntegerParameter(request, "a");
        const auto hardcore = ParseRcClientIntegerParameter(request, "h");
        if (
            !achievementId.has_value() ||
            *achievementId <= 0 ||
            *achievementId > std::numeric_limits<uint32_t>::max() ||
            !hardcore.has_value() ||
            *hardcore != 1
        )
        {
            return nullptr;
        }
        submission.type = RANativePendingSubmissionType::Achievement;
        submission.achievementId = static_cast<uint32_t>(*achievementId);
        submission.hardcore = true;
    }
    else if (requestAction == "submitlbentry")
    {
        const auto leaderboardId = ParseRcClientIntegerParameter(request, "i");
        const auto rawScore = ParseRcClientIntegerParameter(request, "s");
        if (
            !leaderboardId.has_value() ||
            *leaderboardId <= 0 ||
            *leaderboardId > std::numeric_limits<uint32_t>::max() ||
            !rawScore.has_value() ||
            *rawScore < std::numeric_limits<int32_t>::min() ||
            *rawScore > std::numeric_limits<int32_t>::max() ||
            !leaderboardAttemptId.has_value()
        )
        {
            return nullptr;
        }
        submission.type = RANativePendingSubmissionType::Leaderboard;
        submission.leaderboardId = static_cast<uint32_t>(*leaderboardId);
        submission.attemptId = *leaderboardAttemptId;
        submission.rawScore = static_cast<int32_t>(*rawScore);
        submission.hardcore = true;
    }
    else
    {
        return nullptr;
    }

    submission.submissionId = AllocatePendingSubmissionId();
    submission.sequence = AllocatePendingSubmissionSequence();
    submission.submissionSessionId = runtimeBridgeConfig->submissionSessionId;
    submission.callbackDataToken = callbackDataToken;
    submission.createdAtEpochMs = PendingSubmissionNowEpochMs();
    auto iterator = pendingSubmissionsByCallbackData.emplace(
        callbackDataToken,
        std::move(submission)
    ).first;
    return &iterator->second;
}

void RetroAchievementsManager::MarkPendingSubmissionPresentationReady(
    RANativePendingSubmissionType type,
    uint32_t relatedId,
    uint64_t attemptId,
    const std::string& formattedScore
)
{
    for (auto& entry : pendingSubmissionsByCallbackData)
    {
        auto& submission = entry.second;
        const bool matches =
            submission.type == type &&
            (
                (type == RANativePendingSubmissionType::Achievement &&
                    submission.achievementId == relatedId) ||
                (type == RANativePendingSubmissionType::Leaderboard &&
                    submission.leaderboardId == relatedId &&
                    submission.attemptId == attemptId)
            );
        if (!matches)
            continue;

        submission.presentationReady = true;
        if (type == RANativePendingSubmissionType::Leaderboard)
            submission.formattedScore = formattedScore;
        MaybePublishPendingSubmission(submission);
    }
}

void RetroAchievementsManager::MarkActivePendingSubmissionPermanentFailure(int32_t result)
{
    if (!activeSubmissionResponseCallbackData)
        return;

    const auto iterator = pendingSubmissionsByCallbackData.find(activeSubmissionResponseCallbackData);
    if (iterator == pendingSubmissionsByCallbackData.end())
        return;

    iterator->second.permanentFailureResult = result;
}

void RetroAchievementsManager::FinalizePendingSubmissionTransport(
    uintptr_t callbackDataToken,
    bool retryPending,
    bool alreadyAccepted
)
{
    const auto iterator = pendingSubmissionsByCallbackData.find(callbackDataToken);
    if (iterator == pendingSubmissionsByCallbackData.end())
        return;

    if (retryPending)
    {
        iterator->second.status = PendingSubmissionStatus::RetryPending;
        MaybePublishPendingSubmission(iterator->second);
        return;
    }

    PendingSubmissionState submission = iterator->second;
    pendingSubmissionsByCallbackData.erase(iterator);

    if (!submission.published)
        return;

    const RANativePendingSubmissionResolution resolution =
        submission.permanentFailureResult.has_value()
            ? RANativePendingSubmissionResolution::PermanentFailure
            : (
                alreadyAccepted
                    ? RANativePendingSubmissionResolution::AlreadyAccepted
                    : RANativePendingSubmissionResolution::Accepted
            );
    const int32_t result = submission.permanentFailureResult.value_or(RC_OK);
    submission.terminalResolution = resolution;
    submission.terminalResult = result;
    terminalPendingSubmissionsById.insert_or_assign(
        submission.submissionId,
        submission
    );
    PublishPendingSubmissionResolution(
        submission,
        resolution,
        result
    );
}

void RetroAchievementsManager::MaybePublishPendingSubmission(PendingSubmissionState& submission)
{
    if (submission.published || !IsPendingSubmissionPublishable(submission))
        return;

    submission.published = true;
    uint32_t pendingCount = 0;
    for (const auto& entry : pendingSubmissionsByCallbackData)
    {
        if (entry.second.published)
            pendingCount++;
    }
    const int32_t rawScore =
        submission.type == RANativePendingSubmissionType::Leaderboard &&
            submission.rawScore.has_value()
            ? *submission.rawScore
            : 0;
    melonDS::Platform::Log(
        melonDS::Platform::LogLevel::Info,
        "[RAPending] event_type=ra_pending_added submission_session_id=%llu submission_type=%s submission_id=%llu achievement_id=%u leaderboard_id=%u attempt_id=%llu raw_score=%d hardcore=%d submit_owner=rc_client pending_total=%u\n",
        static_cast<unsigned long long>(submission.submissionSessionId),
        submission.type == RANativePendingSubmissionType::Achievement ? "achievement" : "leaderboard",
        static_cast<unsigned long long>(submission.submissionId),
        submission.achievementId,
        submission.leaderboardId,
        static_cast<unsigned long long>(submission.attemptId),
        rawScore,
        submission.hardcore ? 1 : 0,
        pendingCount
    );
    SendPendingSubmissionAdded(submission);
}

bool RetroAchievementsManager::IsPendingSubmissionPublishable(
    const PendingSubmissionState& submission
) const
{
    return
        submission.presentationReady &&
        submission.status == PendingSubmissionStatus::RetryPending &&
        (
            submission.type != RANativePendingSubmissionType::Leaderboard ||
            submission.rawScore.has_value()
        );
}

void RetroAchievementsManager::SendPendingSubmissionAdded(
    const PendingSubmissionState& submission
)
{
    const int32_t rawScore =
        submission.type == RANativePendingSubmissionType::Leaderboard &&
            submission.rawScore.has_value()
            ? *submission.rawScore
            : 0;
    if (auto eventMessenger = EventMessenger.lock())
    {
        eventMessenger->onRetroAchievementsPendingSubmissionAdded(
            submission.submissionSessionId,
            submission.submissionId,
            submission.sequence,
            submission.createdAtEpochMs,
            static_cast<int>(submission.type),
            submission.achievementId,
            submission.leaderboardId,
            submission.attemptId,
            rawScore,
            submission.hardcore,
            submission.formattedScore
        );
    }
}

void RetroAchievementsManager::SendPendingSubmissionResolution(
    const PendingSubmissionState& submission
)
{
    if (
        !submission.terminalResolution.has_value() ||
        !submission.terminalResult.has_value()
    )
    {
        return;
    }

    if (auto eventMessenger = EventMessenger.lock())
    {
        eventMessenger->onRetroAchievementsPendingSubmissionResolved(
            submission.submissionSessionId,
            submission.submissionId,
            static_cast<int>(submission.type),
            static_cast<int>(*submission.terminalResolution),
            *submission.terminalResult
        );
    }
}

void RetroAchievementsManager::PublishPendingSubmissionResolution(
    const PendingSubmissionState& submission,
    RANativePendingSubmissionResolution resolution,
    int32_t result
)
{
    melonDS::Platform::Log(
        resolution == RANativePendingSubmissionResolution::PermanentFailure
            ? melonDS::Platform::LogLevel::Warn
            : melonDS::Platform::LogLevel::Info,
        "[RAPending] event_type=ra_pending_resolved submission_session_id=%llu submission_type=%s submission_id=%llu resolution=%d result=%d submit_owner=rc_client\n",
        static_cast<unsigned long long>(submission.submissionSessionId),
        submission.type == RANativePendingSubmissionType::Achievement ? "achievement" : "leaderboard",
        static_cast<unsigned long long>(submission.submissionId),
        static_cast<int>(resolution),
        result
    );
    SendPendingSubmissionResolution(submission);
}

int64_t RetroAchievementsManager::PendingSubmissionNowEpochMs()
{
    return std::chrono::duration_cast<std::chrono::milliseconds>(
        std::chrono::system_clock::now().time_since_epoch()
    ).count();
}

void RetroAchievementsManager::PublishLeaderboardTrackerValuesLocked()
{
    if (!rcClientRuntime)
        return;

    auto eventMessenger = RetroAchievementsManager::EventMessenger.lock();
    if (!eventMessenger)
        return;

    for (const auto& loadedLeaderboard : loadedLeaderboards)
    {
        const uint32_t leaderboardId = static_cast<uint32_t>(loadedLeaderboard.id);
        const rc_client_leaderboard_t* leaderboardInfo = rc_client_get_leaderboard_info(rcClientRuntime, leaderboardId);
        if (!leaderboardInfo || leaderboardInfo->state != RC_CLIENT_LEADERBOARD_STATE_TRACKING)
        {
            const auto publishedValue = lastPublishedLeaderboardTrackerValues.find(leaderboardId);
            if (publishedValue != lastPublishedLeaderboardTrackerValues.end())
            {
                auto& attempt = EnsureLeaderboardAttempt(leaderboardId, false);
                attempt.trackerUpdateLogLimiter.Reset();
                const uint64_t sequence = NextLeaderboardEventSequence(attempt);
                if (AreLeaderboardDiagnosticsEnabled())
                {
                    melonDS::Platform::Log(
                        melonDS::Platform::LogLevel::Info,
                        "[RALeaderboard] attempt_id=%llu leaderboard_id=%u runtime_path=%s event_sequence=%llu event_type=TRACKER_HIDE tracker_display=%s\n",
                        (unsigned long long) attempt.attemptId,
                        leaderboardId,
                        RuntimePathTraceValue(),
                        (unsigned long long) sequence,
                        publishedValue->second.c_str()
                    );
                }
                eventMessenger->onLeaderboardTrackerHidden(leaderboardId, attempt.attemptId, sequence);
                lastPublishedLeaderboardTrackerValues.erase(publishedValue);
            }
            continue;
        }

        const char* trackerValue = leaderboardInfo->tracker_value;
        if (!trackerValue || trackerValue[0] == '\0')
            continue;

        const auto lastPublishedIterator = lastPublishedLeaderboardTrackerValues.find(leaderboardId);
        const bool isFirstPublishedValue = lastPublishedIterator == lastPublishedLeaderboardTrackerValues.end();
        if (!isFirstPublishedValue && lastPublishedIterator->second == trackerValue)
            continue;

        lastPublishedLeaderboardTrackerValues.insert_or_assign(leaderboardId, trackerValue);
        auto& attempt = EnsureLeaderboardAttempt(leaderboardId, false);
        const uint64_t sequence = NextLeaderboardEventSequence(attempt);
        if (isFirstPublishedValue)
            attempt.trackerUpdateLogLimiter.Reset();
        const auto trackerLogDecision = isFirstPublishedValue
            ? LeaderboardTrackerUpdateLogLimiter::Decision{true, 0, 0}
            : attempt.trackerUpdateLogLimiter.Observe(LeaderboardDiagnosticNowMs());
        if (AreLeaderboardDiagnosticsEnabled() && trackerLogDecision.shouldLog)
        {
            melonDS::Platform::Log(
                melonDS::Platform::LogLevel::Info,
                "[RALeaderboard] attempt_id=%llu leaderboard_id=%u runtime_path=%s event_sequence=%llu event_type=%s tracker_display=%s tracker_update_index=%llu suppressed_updates=%llu\n",
                (unsigned long long) attempt.attemptId,
                leaderboardId,
                RuntimePathTraceValue(),
                (unsigned long long) sequence,
                isFirstPublishedValue ? "TRACKER_SHOW" : "TRACKER_UPDATE",
                trackerValue,
                (unsigned long long) trackerLogDecision.updateIndex,
                (unsigned long long) trackerLogDecision.suppressedUpdates
            );
        }
        eventMessenger->onLeaderboardAttemptUpdated(
            leaderboardId,
            attempt.attemptId,
            sequence,
            isFirstPublishedValue,
            trackerValue
        );
    }
}

}
}

#include "NDS.h"
#include "rcheevos.h"
#include "RetroAchievementsManager.h"
#include "Platform.h"
#include "rc_consoles.h"
#include "types.h"
#include <algorithm>
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
#include <vector>

using namespace melonDS;

namespace MelonDSAndroid
{
namespace RetroAchievements
{

std::weak_ptr<MelonEventMessenger> RetroAchievementsManager::EventMessenger;
RetroAchievementsManager* RetroAchievementsManager::activeInstance = nullptr;
std::mutex RetroAchievementsManager::activeInstanceLock;
JavaVM* RetroAchievementsManager::javaVm = nullptr;

unsigned PeekMemory(unsigned address, unsigned numBytes, void* ud);

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
constexpr int RC_CLIENT_PERF_CONSECUTIVE_SLOW_WINDOWS_FOR_FALLBACK = 2;
constexpr const char* RC_CLIENT_DEFAULT_IMAGE = "https://media.retroachievements.org/Images/000001.png";
constexpr const char* RC_CLIENT_DEFAULT_USER_AGENT = "melonDualDS-android/unknown";
constexpr int RC_CLIENT_HTTP_CONNECT_TIMEOUT_MS = 10000;
constexpr int RC_CLIENT_HTTP_READ_TIMEOUT_MS = 15000;
constexpr size_t RC_CLIENT_MAX_LOGGED_VALUE_LENGTH = 200;

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
    return key == "p" || key == "t" || key == "v";
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

    return request->url ? request->url : "unknown";
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

    if (!waitResult.errorMessage.empty())
        builder << ": " << waitResult.errorMessage;

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
    if (!inputStreamClass || LogAndClearJavaException(env, "FindClass(InputStream)", httpStatusCode))
        return false;

    jmethodID readMethod = env->GetMethodID(inputStreamClass, "read", "([B)I");
    jmethodID closeMethod = env->GetMethodID(inputStreamClass, "close", "()V");
    if (!readMethod || !closeMethod || LogAndClearJavaException(env, "GetMethodID(InputStream)", httpStatusCode))
    {
        env->DeleteLocalRef(inputStreamClass);
        return false;
    }

    jbyteArray buffer = env->NewByteArray(8192);
    if (!buffer || LogAndClearJavaException(env, "NewByteArray(InputStream)", httpStatusCode))
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

    env->CallVoidMethod(inputStream, closeMethod);
    LogAndClearJavaException(env, "InputStream.close", httpStatusCode);

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
    urlConnectionClass = env->FindClass("java/net/URLConnection");
    httpURLConnectionClass = env->FindClass("java/net/HttpURLConnection");
    outputStreamClass = env->FindClass("java/io/OutputStream");
    closeableClass = env->FindClass("java/io/Closeable");
    if (!urlClass || !urlConnectionClass || !httpURLConnectionClass || !outputStreamClass || !closeableClass ||
        LogAndClearJavaException(env, "FindClass(URL/URLConnection)", httpStatusCode))
        goto cleanup;

    urlConstructor = env->GetMethodID(urlClass, "<init>", "(Ljava/lang/String;)V");
    openConnectionMethod = env->GetMethodID(urlClass, "openConnection", "()Ljava/net/URLConnection;");
    setConnectTimeoutMethod = env->GetMethodID(urlConnectionClass, "setConnectTimeout", "(I)V");
    setReadTimeoutMethod = env->GetMethodID(urlConnectionClass, "setReadTimeout", "(I)V");
    setRequestPropertyMethod = env->GetMethodID(urlConnectionClass, "setRequestProperty", "(Ljava/lang/String;Ljava/lang/String;)V");
    setDoOutputMethod = env->GetMethodID(urlConnectionClass, "setDoOutput", "(Z)V");
    getInputStreamMethod = env->GetMethodID(urlConnectionClass, "getInputStream", "()Ljava/io/InputStream;");
    setRequestMethodMethod = env->GetMethodID(httpURLConnectionClass, "setRequestMethod", "(Ljava/lang/String;)V");
    getOutputStreamMethod = env->GetMethodID(urlConnectionClass, "getOutputStream", "()Ljava/io/OutputStream;");
    getResponseCodeMethod = env->GetMethodID(httpURLConnectionClass, "getResponseCode", "()I");
    getErrorStreamMethod = env->GetMethodID(httpURLConnectionClass, "getErrorStream", "()Ljava/io/InputStream;");
    disconnectMethod = env->GetMethodID(httpURLConnectionClass, "disconnect", "()V");
    outputStreamWriteMethod = env->GetMethodID(outputStreamClass, "write", "([B)V");
    outputStreamFlushMethod = env->GetMethodID(outputStreamClass, "flush", "()V");
    outputStreamCloseMethod = env->GetMethodID(outputStreamClass, "close", "()V");
    closeableCloseMethod = env->GetMethodID(closeableClass, "close", "()V");
    if (!urlConstructor || !openConnectionMethod || !setConnectTimeoutMethod || !setReadTimeoutMethod ||
        !setRequestPropertyMethod || !setDoOutputMethod || !getInputStreamMethod || !setRequestMethodMethod ||
        !getOutputStreamMethod || !getResponseCodeMethod || !getErrorStreamMethod || !disconnectMethod ||
        !outputStreamWriteMethod || !outputStreamFlushMethod || !outputStreamCloseMethod || !closeableCloseMethod ||
        LogAndClearJavaException(env, "GetMethodID(URLConnection)", httpStatusCode))
    {
        goto cleanup;
    }

    urlString = env->NewStringUTF(request->url);

    if (!urlString || LogAndClearJavaException(env, "NewStringUTF(url)", httpStatusCode))
        goto cleanup;

    urlObject = env->NewObject(urlClass, urlConstructor, urlString);
    if (!urlObject || LogAndClearJavaException(env, "new URL()", httpStatusCode))
        goto cleanup;

    connection = env->CallObjectMethod(urlObject, openConnectionMethod);
    if (!connection || LogAndClearJavaException(env, "URL.openConnection", httpStatusCode))
        goto cleanup;

    env->CallVoidMethod(connection, setConnectTimeoutMethod, RC_CLIENT_HTTP_CONNECT_TIMEOUT_MS);
    env->CallVoidMethod(connection, setReadTimeoutMethod, RC_CLIENT_HTTP_READ_TIMEOUT_MS);
    if (LogAndClearJavaException(env, "set timeouts", httpStatusCode))
        goto cleanup;

    {
        const char* resolvedUserAgent = (userAgent && userAgent[0] != '\0') ? userAgent : RC_CLIENT_DEFAULT_USER_AGENT;
        jstring userAgentHeaderName = env->NewStringUTF("User-Agent");
        jstring userAgentHeaderValue = env->NewStringUTF(resolvedUserAgent);
        if (!userAgentHeaderName || !userAgentHeaderValue)
        {
            LogAndClearJavaException(env, "NewStringUTF(User-Agent)", httpStatusCode);
            if (userAgentHeaderName) env->DeleteLocalRef(userAgentHeaderName);
            if (userAgentHeaderValue) env->DeleteLocalRef(userAgentHeaderValue);
            goto cleanup;
        }

        env->CallVoidMethod(connection, setRequestPropertyMethod, userAgentHeaderName, userAgentHeaderValue);
        env->DeleteLocalRef(userAgentHeaderName);
        env->DeleteLocalRef(userAgentHeaderValue);
        if (LogAndClearJavaException(env, "setRequestProperty(User-Agent)", httpStatusCode))
            goto cleanup;
    }

    if (request->post_data && request->post_data[0] != '\0')
    {
        jstring postMethod = env->NewStringUTF("POST");
        if (!postMethod || LogAndClearJavaException(env, "NewStringUTF(POST)", httpStatusCode))
            goto cleanup;

        env->CallVoidMethod(connection, setRequestMethodMethod, postMethod);
        env->DeleteLocalRef(postMethod);
        env->CallVoidMethod(connection, setDoOutputMethod, JNI_TRUE);
        if (LogAndClearJavaException(env, "setup POST", httpStatusCode))
            goto cleanup;

        if (request->content_type && request->content_type[0] != '\0')
        {
            jstring contentTypeHeader = env->NewStringUTF("Content-Type");
            jstring contentTypeValue = env->NewStringUTF(request->content_type);
            if (!contentTypeHeader || !contentTypeValue)
            {
                LogAndClearJavaException(env, "NewStringUTF(Content-Type)", httpStatusCode);
                if (contentTypeHeader) env->DeleteLocalRef(contentTypeHeader);
                if (contentTypeValue) env->DeleteLocalRef(contentTypeValue);
                goto cleanup;
            }
            env->CallVoidMethod(connection, setRequestPropertyMethod, contentTypeHeader, contentTypeValue);
            env->DeleteLocalRef(contentTypeHeader);
            env->DeleteLocalRef(contentTypeValue);
            if (LogAndClearJavaException(env, "setRequestProperty(Content-Type)", httpStatusCode))
                goto cleanup;
        }

        outputStream = env->CallObjectMethod(connection, getOutputStreamMethod);
        if (!outputStream || LogAndClearJavaException(env, "getOutputStream", httpStatusCode))
            goto cleanup;

        const size_t postDataLength = strlen(request->post_data);
        postDataBytes = env->NewByteArray((jsize) postDataLength);
        if (!postDataBytes || LogAndClearJavaException(env, "NewByteArray(postData)", httpStatusCode))
            goto cleanup;

        env->SetByteArrayRegion(postDataBytes, 0, (jsize) postDataLength, reinterpret_cast<const jbyte*>(request->post_data));
        if (LogAndClearJavaException(env, "SetByteArrayRegion(postData)", httpStatusCode))
            goto cleanup;

        env->CallVoidMethod(outputStream, outputStreamWriteMethod, postDataBytes);
        env->CallVoidMethod(outputStream, outputStreamFlushMethod);
        env->CallVoidMethod(outputStream, outputStreamCloseMethod);
        if (LogAndClearJavaException(env, "write/flush/close POST body", httpStatusCode))
            goto cleanup;
    }
    else
    {
        jstring getMethod = env->NewStringUTF("GET");
        if (!getMethod || LogAndClearJavaException(env, "NewStringUTF(GET)", httpStatusCode))
            goto cleanup;

        env->CallVoidMethod(connection, setRequestMethodMethod, getMethod);
        env->DeleteLocalRef(getMethod);
        if (LogAndClearJavaException(env, "setRequestMethod(GET)", httpStatusCode))
            goto cleanup;
    }

    *httpStatusCode = env->CallIntMethod(connection, getResponseCodeMethod);
    if (LogAndClearJavaException(env, "getResponseCode", httpStatusCode))
        goto cleanup;

    if (*httpStatusCode >= 200 && *httpStatusCode < 400)
    {
        inputStream = env->CallObjectMethod(connection, getInputStreamMethod);
    }
    else
    {
        inputStream = env->CallObjectMethod(connection, getErrorStreamMethod);
        if (inputStream == nullptr)
            inputStream = env->CallObjectMethod(connection, getInputStreamMethod);
    }
    if (LogAndClearJavaException(env, "getInputStream/getErrorStream", httpStatusCode))
        goto cleanup;

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
        success ? melonDS::Platform::LogLevel::Info : melonDS::Platform::LogLevel::Warn,
        "[RAClient] HTTP %s %s status=%d elapsed=%lldms bytes=%zu\n",
        requestAction.c_str(),
        success ? "completed" : "failed",
        *httpStatusCode,
        elapsedMs,
        responseBody->size()
    );

    return success;
}

}

RetroAchievementsManager::RetroAchievementsManager(melonDS::NDS* nds) : nds(nds)
{
    rc_runtime_init(&rcheevosRuntime);
    rcClientRuntime = nullptr;
    isRichPresenceEnabled = false;
    isRcClientRuntimeActive = false;
    hasRcClientPerformanceFallback = false;
    rcClientSlowWindowCount = 0;
    rcClientWindowFrameCount = 0;
    rcClientWindowAccumulatedUs = 0;
    rcClientWindowPeakUs = 0;
}

RetroAchievementsManager::~RetroAchievementsManager()
{
    std::unique_lock lock(runtimeLock);
    DeactivateRcClientRuntimeLocked();
    rc_runtime_destroy(&rcheevosRuntime);
}

void RetroAchievementsManager::SetJavaVm(JavaVM* javaVm)
{
    std::lock_guard lock(activeInstanceLock);
    RetroAchievementsManager::javaVm = javaVm;
}

void RetroAchievementsManager::ConfigureRuntimeBridge(std::optional<RARuntimeBridgeConfig> runtimeBridgeConfig)
{
    std::unique_lock lock(runtimeLock);
    this->runtimeBridgeConfig = std::move(runtimeBridgeConfig);
}

bool RetroAchievementsManager::LoadAchievements(std::list<RAAchievement> achievements)
{
    std::unique_lock lock(runtimeLock);

    for (const auto &achievement : achievements) {
        int result = rc_runtime_activate_achievement(&rcheevosRuntime, achievement.id, achievement.memoryAddress.c_str(), nullptr, 0);
        if (result != RC_OK)
            return false;

        loadedAchievements.push_back(achievement);
    }

    return true;
}

bool RetroAchievementsManager::LoadLeaderboards(std::list<RALeaderboard> leaderboards)
{
    std::unique_lock lock(runtimeLock);

    for (auto &leaderboard : leaderboards) {
        int result = rc_runtime_activate_lboard(&rcheevosRuntime, leaderboard.id, leaderboard.memoryAddress.c_str(), nullptr, 0);
        if (result != RC_OK)
            return false;

        int rcheevosLeaderboardType = rc_parse_format(leaderboard.format.c_str());
        leaderboard.rcheevosFormat = rcheevosLeaderboardType;

        loadedLeaderboards.push_back(leaderboard);
    }

    return true;
}

bool RetroAchievementsManager::ActivatePreferredRuntime()
{
    std::unique_lock lock(runtimeLock);
    return TryActivateRcClientRuntimeLocked();
}

void RetroAchievementsManager::UnloadEverything()
{
    std::unique_lock lock(runtimeLock);

    DeactivateRcClientRuntimeLocked();

    for (const auto &achievement : loadedAchievements) {
        rc_runtime_deactivate_achievement(&rcheevosRuntime, achievement.id);
    }
    for (const auto &leaderboard : loadedLeaderboards) {
        rc_runtime_deactivate_lboard(&rcheevosRuntime, leaderboard.id);
    }

    loadedAchievements.clear();
    loadedLeaderboards.clear();
    loadedRichPresenceScript.clear();
    isRichPresenceEnabled = false;
    hasRcClientPerformanceFallback = false;
    ResetRcClientPerformanceWindowLocked();
}

void RetroAchievementsManager::SetupRichPresence(std::string richPresenceScript)
{
    std::unique_lock lock(runtimeLock);

    loadedRichPresenceScript = richPresenceScript;
    rc_runtime_activate_richpresence(&rcheevosRuntime, richPresenceScript.c_str(), nullptr, 0);
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

    if (!isRichPresenceEnabled)
        return "";

    char buffer[512];
    rc_runtime_get_richpresence(&rcheevosRuntime, buffer, 512, PeekMemory, nds, nullptr);

    return buffer;
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
        else
        {
            rc_runtime_get_achievement_measured(&rcheevosRuntime, item.id, &runtimeAchievement.value, &runtimeAchievement.target);
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

    const bool hasActiveRuntimeData = IsRcClientRuntimeActiveLocked() || !loadedAchievements.empty() || !loadedLeaderboards.empty();
    return !hasActiveRuntimeData;
}

bool RetroAchievementsManager::DoSavestate(Savestate* savestate)
{
    std::unique_lock lock(runtimeLock);

    savestate->Section("RCHV");
    if (savestate->Saving)
    {
        u32 rcheevosStateSize = IsRcClientRuntimeActiveLocked() ?
            (u32) rc_client_progress_size(rcClientRuntime) :
            (u32) rc_runtime_progress_size(&rcheevosRuntime, nullptr);
        u8* rcheevosStateBuffer = new u8[rcheevosStateSize];
        int result = IsRcClientRuntimeActiveLocked() ?
            rc_client_serialize_progress_sized(rcClientRuntime, rcheevosStateBuffer, rcheevosStateSize) :
            rc_runtime_serialize_progress_sized(rcheevosStateBuffer, rcheevosStateSize, &rcheevosRuntime, nullptr);
        if (result != RC_OK)
        {
            delete[] rcheevosStateBuffer;
            return false;
        }

        savestate->Var32(&rcheevosStateSize);
        savestate->VarArray(rcheevosStateBuffer, rcheevosStateSize);
        delete[] rcheevosStateBuffer;
    }
    else if (savestate->Error)
    {
        // RCHV section was not found
        return false;
    }
    else
    {
        u32 rcheevosStateSize;
        savestate->Var32(&rcheevosStateSize);
        u8* rcheevosStateBuffer = new u8[rcheevosStateSize];
        savestate->VarArray(rcheevosStateBuffer, rcheevosStateSize);

        int result = IsRcClientRuntimeActiveLocked() ?
            rc_client_deserialize_progress_sized(rcClientRuntime, rcheevosStateBuffer, rcheevosStateSize) :
            rc_runtime_deserialize_progress(&rcheevosRuntime, rcheevosStateBuffer, nullptr);
        delete[] rcheevosStateBuffer;

        if (result != RC_OK)
            return false;
    }

    return true;
}

void RetroAchievementsManager::Reset()
{
    std::unique_lock lock(runtimeLock);
    if (IsRcClientRuntimeActiveLocked())
        rc_client_reset(rcClientRuntime);
    else
        rc_runtime_reset(&rcheevosRuntime);
}

void RetroAchievementsManager::FrameUpdate()
{
    std::unique_lock lock(runtimeLock, std::try_to_lock);
    if (!lock.owns_lock())
        return;

    if (IsRcClientRuntimeActiveLocked())
    {
        const auto frameStart = std::chrono::steady_clock::now();
        rc_client_do_frame(rcClientRuntime);

        const auto frameElapsedUs = std::chrono::duration_cast<std::chrono::microseconds>(
            std::chrono::steady_clock::now() - frameStart
        ).count();
        rcClientWindowFrameCount++;
        rcClientWindowAccumulatedUs += frameElapsedUs;
        rcClientWindowPeakUs = std::max(rcClientWindowPeakUs, frameElapsedUs);

        if (rcClientWindowFrameCount >= RC_CLIENT_PERF_WINDOW_FRAMES)
        {
            const long long avgUs = rcClientWindowAccumulatedUs / rcClientWindowFrameCount;
            const bool isSlowWindow =
                avgUs > RC_CLIENT_PERF_WINDOW_AVG_US_LIMIT ||
                rcClientWindowPeakUs > RC_CLIENT_PERF_WINDOW_PEAK_US_LIMIT;

            if (isSlowWindow)
                rcClientSlowWindowCount++;
            else
                rcClientSlowWindowCount = 0;

            if (rcClientSlowWindowCount >= RC_CLIENT_PERF_CONSECUTIVE_SLOW_WINDOWS_FOR_FALLBACK)
            {
                melonDS::Platform::Log(
                    melonDS::Platform::LogLevel::Warn,
                    "[RAClient] Falling back to legacy runtime due to frame cost (avg=%lldus peak=%lldus)\n",
                    avgUs,
                    rcClientWindowPeakUs
                );
                hasRcClientPerformanceFallback = true;
                NotifyRcClientRuntimeFallbackLocked(RetroAchievementsRuntimeFallbackReason::Performance);
                DeactivateRcClientRuntimeLocked();
            }

            ResetRcClientPerformanceWindowLocked();
        }
    }

    if (!IsRcClientRuntimeActiveLocked())
    {
        std::unique_lock instanceLock(activeInstanceLock);
        activeInstance = this;
        rc_runtime_do_frame(&rcheevosRuntime, &CheevosEventHandler, &PeekMemory, nds, nullptr);
        activeInstance = nullptr;
    }
}

void RetroAchievementsManager::CheevosEventHandler(const rc_runtime_event_t* runtime_event)
{
    auto eventMessenger = RetroAchievementsManager::EventMessenger.lock();
    if (!eventMessenger)
    {
        melonDS::Platform::Log(
            melonDS::Platform::LogLevel::Warn,
            "[RAClient] runtime_event_dropped path=legacy reason=no_messenger type=%d id=%u\n",
            runtime_event ? (int) runtime_event->type : -1,
            runtime_event ? runtime_event->id : 0u
        );
        return;
    }

    melonDS::Platform::Log(
        melonDS::Platform::LogLevel::Info,
        "[RAClient] runtime_event_received path=legacy type=%d id=%u\n",
        (int) runtime_event->type,
        runtime_event->id
    );

    switch (runtime_event->type)
    {
        case RC_RUNTIME_EVENT_ACHIEVEMENT_TRIGGERED:
            eventMessenger->onAchievementTriggered(runtime_event->id);
            break;
        case RC_RUNTIME_EVENT_ACHIEVEMENT_PRIMED:
            eventMessenger->onAchievementPrimed(runtime_event->id);
            break;
        case RC_RUNTIME_EVENT_ACHIEVEMENT_UNPRIMED:
            eventMessenger->onAchievementUnprimed(runtime_event->id);
            break;
        case RC_RUNTIME_EVENT_ACHIEVEMENT_PROGRESS_UPDATED:
            unsigned int value;
            unsigned int target;

            rc_runtime_get_achievement_measured(&activeInstance->rcheevosRuntime, runtime_event->id, &value, &target);
            // Do not notify of achievements with no progress. Weird, but it happens
            if (value > 0)
            {
                char buffer[32];
                rc_runtime_format_achievement_measured(&activeInstance->rcheevosRuntime, runtime_event->id, buffer, sizeof(buffer));
                eventMessenger->onAchievementProgressUpdated(runtime_event->id, value, target, buffer);
            }
            break;
        case RC_RUNTIME_EVENT_LBOARD_STARTED:
            eventMessenger->onLeaderboardAttemptStarted(runtime_event->id);
            break;
        case RC_RUNTIME_EVENT_LBOARD_CANCELED:
            eventMessenger->onLeaderboardAttemptCanceled(runtime_event->id);
            break;
        case RC_RUNTIME_EVENT_LBOARD_TRIGGERED:
        {
            std::string formattedValue = GetLeaderboardFormattedValue(runtime_event->id, runtime_event->value);
            eventMessenger->onLeaderboardAttemptCompleted(runtime_event->id, runtime_event->value, formattedValue);
            break;
        }
        case RC_RUNTIME_EVENT_LBOARD_UPDATED:
        {
            std::string formattedValue = GetLeaderboardFormattedValue(runtime_event->id, runtime_event->value);
            eventMessenger->onLeaderboardAttemptUpdated(runtime_event->id, formattedValue);
            break;
        }
    }
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

    {
        uint32_t entityId = 0;
        if (event->achievement) entityId = event->achievement->id;
        else if (event->leaderboard) entityId = event->leaderboard->id;
        else if (event->leaderboard_tracker) entityId = event->leaderboard_tracker->id;
        else if (event->leaderboard_scoreboard) entityId = event->leaderboard_scoreboard->leaderboard_id;
        else if (event->subset) entityId = event->subset->id;
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
                eventMessenger->onAchievementTriggered(event->achievement->id);
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
                eventMessenger->onAchievementProgressUpdated(event->achievement->id, value, target, event->achievement->measured_progress ? event->achievement->measured_progress : "");
            }
            break;
        case RC_CLIENT_EVENT_ACHIEVEMENT_PROGRESS_INDICATOR_HIDE:
            if (event->achievement)
                eventMessenger->onAchievementProgressHidden(event->achievement->id);
            break;
        case RC_CLIENT_EVENT_LEADERBOARD_STARTED:
            if (event->leaderboard)
                eventMessenger->onLeaderboardAttemptStarted(event->leaderboard->id);
            break;
        case RC_CLIENT_EVENT_LEADERBOARD_TRACKER_SHOW:
        case RC_CLIENT_EVENT_LEADERBOARD_TRACKER_UPDATE:
            if (event->leaderboard_tracker)
                eventMessenger->onLeaderboardAttemptUpdated(event->leaderboard_tracker->id, event->leaderboard_tracker->display);
            break;
        case RC_CLIENT_EVENT_LEADERBOARD_TRACKER_HIDE:
            if (event->leaderboard_tracker)
                eventMessenger->onLeaderboardTrackerHidden(event->leaderboard_tracker->id);
            break;
        case RC_CLIENT_EVENT_LEADERBOARD_FAILED:
            if (event->leaderboard)
                eventMessenger->onLeaderboardAttemptCanceled(event->leaderboard->id);
            break;
        case RC_CLIENT_EVENT_LEADERBOARD_SUBMITTED:
        {
            const int defaultInvalidScore = std::numeric_limits<int>::min();
            int leaderboardId = 0;
            int leaderboardFormat = RC_FORMAT_VALUE;
            bool hasLeaderboardFormat = false;
            const char* submittedScore = "";
            const char* bestScore = "";

            if (event->leaderboard)
            {
                leaderboardId = event->leaderboard->id;
                leaderboardFormat = event->leaderboard->format;
                hasLeaderboardFormat = true;
            }
            else if (event->leaderboard_scoreboard)
            {
                leaderboardId = event->leaderboard_scoreboard->leaderboard_id;
            }

            if (!hasLeaderboardFormat && leaderboardId != 0 && client)
            {
                const rc_client_leaderboard_t* leaderboardInfo = rc_client_get_leaderboard_info(client, leaderboardId);
                if (leaderboardInfo)
                {
                    leaderboardFormat = leaderboardInfo->format;
                    hasLeaderboardFormat = true;
                }
            }

            if (event->leaderboard_scoreboard)
            {
                if (event->leaderboard_scoreboard->submitted_score[0] != '\0')
                    submittedScore = event->leaderboard_scoreboard->submitted_score;
                else if (event->leaderboard_scoreboard->best_score[0] != '\0')
                    submittedScore = event->leaderboard_scoreboard->best_score;

                bestScore = event->leaderboard_scoreboard->best_score;
            }

            int submittedValue = ParseLeaderboardScoreByFormat(leaderboardFormat, submittedScore, defaultInvalidScore);
            if (submittedValue == defaultInvalidScore && bestScore[0] != '\0' && bestScore != submittedScore)
            {
                submittedValue = ParseLeaderboardScoreByFormat(leaderboardFormat, bestScore, defaultInvalidScore);
            }

            if (submittedValue == defaultInvalidScore)
            {
                melonDS::Platform::Log(
                    melonDS::Platform::LogLevel::Warn,
                    "[RAClient] leaderboard_score_parse_failed lb_id=%d format=%d submitted='%s' best='%s'\n",
                    leaderboardId,
                    hasLeaderboardFormat ? leaderboardFormat : -1,
                    submittedScore ? submittedScore : "",
                    bestScore ? bestScore : ""
                );
                submittedValue = 0;
            }

            const char* formattedValue = submittedScore[0] != '\0' ? submittedScore : "0";
            if (leaderboardId != 0)
                eventMessenger->onLeaderboardAttemptCompleted(leaderboardId, submittedValue, formattedValue);
            break;
        }
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
                eventMessenger->onRetroAchievementsServerError(
                    event->server_error->api ? event->server_error->api : "",
                    event->server_error->related_id,
                    event->server_error->result,
                    event->server_error->error_message ? event->server_error->error_message : ""
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
    melonDS::Platform::Log(
        melonDS::Platform::LogLevel::Info,
        "[RARequest] source=rc_client_http action=%s method=%s user_agent=%s url=%s params=%s\n",
        requestAction.c_str(),
        ResolveRcClientRequestMethod(request),
        runtimeUserAgent.empty() ? RC_CLIENT_DEFAULT_USER_AGENT : runtimeUserAgent.c_str(),
        request->url ? request->url : "",
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

    callback(&serverResponse, callbackData);
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

    if (hasRcClientPerformanceFallback)
        return false;

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
    melonDS::Platform::Log(
        melonDS::Platform::LogLevel::Info,
        "[RAIdentity] source=rc_client_bootstrap user_agent=%s game_id=%lld game_hash=%s hardcore=%d unofficial=%d encore=%d\n",
        config.userAgent.empty() ? RC_CLIENT_DEFAULT_USER_AGENT : config.userAgent.c_str(),
        (long long) config.gameId,
        config.gameHash.c_str(),
        config.hardcoreEnabled ? 1 : 0,
        config.unofficialEnabled ? 1 : 0,
        config.encoreEnabled ? 1 : 0
    );
    rc_client_set_hardcore_enabled(rcClientRuntime, config.hardcoreEnabled ? 1 : 0);
    rc_client_set_unofficial_enabled(rcClientRuntime, config.unofficialEnabled ? 1 : 0);
    rc_client_set_encore_mode_enabled(rcClientRuntime, config.encoreEnabled ? 1 : 0);
    melonDS::Platform::Log(
        melonDS::Platform::LogLevel::Info,
        "[RAClient] runtime_flags_applied hardcore=%d unofficial=%d encore=%d\n",
        config.hardcoreEnabled ? 1 : 0,
        config.unofficialEnabled ? 1 : 0,
        config.encoreEnabled ? 1 : 0
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
        NotifyRcClientRuntimeFallbackLocked(
            loginWaitResult.timedOut ?
                RetroAchievementsRuntimeFallbackReason::LoginTimeout :
                RetroAchievementsRuntimeFallbackReason::LoginFailed
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
        NotifyRcClientRuntimeFallbackLocked(
            loadWaitResult.timedOut ?
                RetroAchievementsRuntimeFallbackReason::LoadTimeout :
                RetroAchievementsRuntimeFallbackReason::LoadFailed
        );
        DeactivateRcClientRuntimeLocked();
        return false;
    }

    isRcClientRuntimeActive = rc_client_is_game_loaded(rcClientRuntime) != 0;
    if (isRcClientRuntimeActive)
        rc_client_set_allow_background_memory_reads(rcClientRuntime, 0);
    if (!isRcClientRuntimeActive)
        NotifyRcClientRuntimeFallbackLocked(RetroAchievementsRuntimeFallbackReason::LoadFailed);
    return isRcClientRuntimeActive;
}

void RetroAchievementsManager::DeactivateRcClientRuntimeLocked()
{
    if (rcClientRuntime)
    {
        rc_client_set_event_handler(rcClientRuntime, &NoopRcClientEventHandler);
        rc_client_unload_game(rcClientRuntime);
        rc_client_logout(rcClientRuntime);
        rc_client_destroy(rcClientRuntime);
        rcClientRuntime = nullptr;
    }

    isRcClientRuntimeActive = false;
    rcClientSlowWindowCount = 0;
    ResetRcClientPerformanceWindowLocked();
}

void RetroAchievementsManager::NotifyRcClientRuntimeFallbackLocked(RetroAchievementsRuntimeFallbackReason reason)
{
    auto eventMessenger = RetroAchievementsManager::EventMessenger.lock();
    if (!eventMessenger)
        return;

    eventMessenger->onRetroAchievementsRuntimeFallback(reason);
}

void RetroAchievementsManager::ResetRcClientPerformanceWindowLocked()
{
    rcClientWindowFrameCount = 0;
    rcClientWindowAccumulatedUs = 0;
    rcClientWindowPeakUs = 0;
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
        runtimeBridgeConfig->useRcClientRuntime &&
        !runtimeBridgeConfig->username.empty() &&
        !runtimeBridgeConfig->apiToken.empty() &&
        !runtimeBridgeConfig->gameHash.empty();
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

int RetroAchievementsManager::ParseLeaderboardScoreByFormat(int format, const char* formatted, int fallbackValue)
{
    if (!formatted || formatted[0] == '\0')
        return fallbackValue;

    switch (format)
    {
        case RC_FORMAT_VALUE:
        case RC_FORMAT_SCORE:
        case RC_FORMAT_UNSIGNED_VALUE:
        case RC_FORMAT_UNFORMATTED:
        case RC_FORMAT_TENS:
        case RC_FORMAT_HUNDREDS:
        case RC_FORMAT_THOUSANDS:
            return ParseIntegerOrDefault(formatted, fallbackValue);

        case RC_FORMAT_FRAMES:
        case RC_FORMAT_CENTISECS:
        {
            int hours = 0, minutes = 0, seconds = 0, centiseconds = 0;
            bool parsed = false;
            if (sscanf(formatted, "%dh%d:%d.%d", &hours, &minutes, &seconds, &centiseconds) == 4)
                parsed = true;
            else if (sscanf(formatted, "%d:%d:%d.%d", &hours, &minutes, &seconds, &centiseconds) == 4)
                parsed = true;
            else if (sscanf(formatted, "%d:%d.%d", &minutes, &seconds, &centiseconds) == 3)
            {
                hours = 0;
                parsed = true;
            }

            if (!parsed)
                return fallbackValue;

            long long totalCentiseconds = (long long) hours * 360000 + (long long) minutes * 6000 + (long long) seconds * 100 + centiseconds;
            long long resultValue = totalCentiseconds;
            if (format == RC_FORMAT_FRAMES)
                resultValue = totalCentiseconds * 6 / 10;

            if (resultValue > std::numeric_limits<int>::max() || resultValue < 0)
                return fallbackValue;
            return (int) resultValue;
        }

        case RC_FORMAT_SECONDS:
        {
            int hours = 0, minutes = 0, seconds = 0;
            if (sscanf(formatted, "%dh%d:%d", &hours, &minutes, &seconds) == 3 ||
                sscanf(formatted, "%d:%d:%d", &hours, &minutes, &seconds) == 3)
            {
                long long total = (long long) hours * 3600 + (long long) minutes * 60 + seconds;
                if (total > std::numeric_limits<int>::max() || total < 0)
                    return fallbackValue;
                return (int) total;
            }
            if (sscanf(formatted, "%d:%d", &minutes, &seconds) == 2)
            {
                long long total = (long long) minutes * 60 + seconds;
                if (total > std::numeric_limits<int>::max() || total < 0)
                    return fallbackValue;
                return (int) total;
            }
            return fallbackValue;
        }

        case RC_FORMAT_MINUTES:
        {
            int hours = 0, minutes = 0;
            if (sscanf(formatted, "%dh%d", &hours, &minutes) == 2 ||
                sscanf(formatted, "%d:%d", &hours, &minutes) == 2)
            {
                long long total = (long long) hours * 60 + minutes;
                if (total > std::numeric_limits<int>::max() || total < 0)
                    return fallbackValue;
                return (int) total;
            }
            return ParseIntegerOrDefault(formatted, fallbackValue);
        }

        case RC_FORMAT_SECONDS_AS_MINUTES:
        {
            int hours = 0, minutes = 0;
            if (sscanf(formatted, "%dh%d", &hours, &minutes) == 2 ||
                sscanf(formatted, "%d:%d", &hours, &minutes) == 2)
            {
                long long totalMinutes = (long long) hours * 60 + minutes;
                long long total = totalMinutes * 60;
                if (total > std::numeric_limits<int>::max() || total < 0)
                    return fallbackValue;
                return (int) total;
            }
            return fallbackValue;
        }

        case RC_FORMAT_FLOAT1:
        case RC_FORMAT_FIXED1:
        {
            double parsedDouble = 0.0;
            if (sscanf(formatted, "%lf", &parsedDouble) == 1)
                return (int) (parsedDouble * 10.0);
            return fallbackValue;
        }
        case RC_FORMAT_FLOAT2:
        case RC_FORMAT_FIXED2:
        {
            double parsedDouble = 0.0;
            if (sscanf(formatted, "%lf", &parsedDouble) == 1)
                return (int) (parsedDouble * 100.0);
            return fallbackValue;
        }
        case RC_FORMAT_FLOAT3:
        case RC_FORMAT_FIXED3:
        {
            double parsedDouble = 0.0;
            if (sscanf(formatted, "%lf", &parsedDouble) == 1)
                return (int) (parsedDouble * 1000.0);
            return fallbackValue;
        }
        case RC_FORMAT_FLOAT4:
        {
            double parsedDouble = 0.0;
            if (sscanf(formatted, "%lf", &parsedDouble) == 1)
                return (int) (parsedDouble * 10000.0);
            return fallbackValue;
        }
        case RC_FORMAT_FLOAT5:
        {
            double parsedDouble = 0.0;
            if (sscanf(formatted, "%lf", &parsedDouble) == 1)
                return (int) (parsedDouble * 100000.0);
            return fallbackValue;
        }
        case RC_FORMAT_FLOAT6:
        {
            double parsedDouble = 0.0;
            if (sscanf(formatted, "%lf", &parsedDouble) == 1)
                return (int) (parsedDouble * 1000000.0);
            return fallbackValue;
        }

        default:
            return ParseIntegerOrDefault(formatted, fallbackValue);
    }
}

std::string RetroAchievementsManager::GetLeaderboardFormattedValue(int leaderboardId, int value)
{
    if (!activeInstance)
        return {};

    auto leaderboard = std::find_if(
        activeInstance->loadedLeaderboards.begin(),
        activeInstance->loadedLeaderboards.end(),
        [=](const RALeaderboard& leaderboard) { return leaderboard.id == leaderboardId; }
    );
    char buffer[32];
    if (leaderboard != activeInstance->loadedLeaderboards.end())
        rc_runtime_format_lboard_value(buffer, sizeof(buffer), value, leaderboard->rcheevosFormat);
    else
        buffer[0] = '\0';

    return buffer;
}

unsigned PeekMemory(unsigned address, unsigned numBytes, void* ud)
{
    NDS* nds = (NDS*) ud;

    if (!nds)
        return 0;

    uint8_t bytes[4] = { 0 };
    unsigned bytesRead = ReadMemoryRange(nds, address, bytes, std::min(numBytes, 4u));

    unsigned value = 0;
    for (unsigned i = 0; i < bytesRead; i++)
        value |= (unsigned(bytes[i]) << (i * 8));

    return value;
}

}
}

#include "NdzReader.h"

#include <jni.h>
#include <sys/stat.h>
#include <unistd.h>

#include <memory>
#include <mutex>
#include <unordered_map>

namespace
{

class FdSource final : public MelonDSAndroid::Ndz::Source
{
public:
    explicit FdSource(int fd) : fd(fd)
    {
        struct stat st{};
        length = fstat(fd, &st) == 0 ? static_cast<uint64_t>(st.st_size) : 0;
    }
    ~FdSource() override { close(fd); }
    bool readAt(uint64_t off, void* dst, size_t len) override
    {
        auto* p = static_cast<uint8_t*>(dst);
        while (len > 0)
        {
            const ssize_t n = pread(fd, p, len, static_cast<off_t>(off));
            if (n <= 0)
                return false;
            p += n;
            off += static_cast<uint64_t>(n);
            len -= static_cast<size_t>(n);
        }
        return true;
    }
    uint64_t size() const override { return length; }
private:
    int fd;
    uint64_t length = 0;
};

struct Handle
{
    std::mutex mutex;
    MelonDSAndroid::Ndz::Reader reader;
};

std::mutex handlesMutex;
std::unordered_map<jlong, std::shared_ptr<Handle>> handles;
jlong nextHandle = 1;

std::shared_ptr<Handle> findHandle(jlong id)
{
    std::lock_guard<std::mutex> lock(handlesMutex);
    const auto it = handles.find(id);
    return it == handles.end() ? nullptr : it->second;
}

void throwIoException(JNIEnv* env, const char* message)
{
    jclass cls = env->FindClass("java/io/IOException");
    if (cls != nullptr)
    {
        env->ThrowNew(cls, message);
        env->DeleteLocalRef(cls);
    }
}

}

extern "C" {

JNIEXPORT jlong JNICALL
Java_me_magnum_melonds_common_ndz_NdzNative_ndzOpen(JNIEnv* env, jobject, jint fd)
{
    const int ownFd = dup(fd);
    if (ownFd < 0)
    {
        throwIoException(env, "ndzOpen: dup failed");
        return 0;
    }
    auto handle = std::make_shared<Handle>();
    const MelonDSAndroid::Ndz::Result result = handle->reader.open(std::make_unique<FdSource>(ownFd));
    if (result == MelonDSAndroid::Ndz::IoError)
    {
        throwIoException(env, "ndzOpen: read failed");
        return 0;
    }
    if (result != MelonDSAndroid::Ndz::Ok)
        return -static_cast<jlong>(result);
    std::lock_guard<std::mutex> lock(handlesMutex);
    const jlong id = nextHandle++;
    handles[id] = std::move(handle);
    return id;
}

JNIEXPORT jlongArray JNICALL
Java_me_magnum_melonds_common_ndz_NdzNative_ndzInfo(JNIEnv* env, jobject, jlong id)
{
    auto handle = findHandle(id);
    if (!handle)
    {
        throwIoException(env, "ndzInfo: invalid handle");
        return nullptr;
    }
    const MelonDSAndroid::Ndz::Info& info = handle->reader.info();
    const jlong values[6] = {
        static_cast<jlong>(info.originalSize),
        static_cast<jlong>(info.flags),
        static_cast<jlong>(info.gameCode),
        static_cast<jlong>(info.blockSize),
        static_cast<jlong>(info.dictSize),
        static_cast<jlong>(info.frameCount),
    };
    jlongArray out = env->NewLongArray(6);
    if (out != nullptr)
        env->SetLongArrayRegion(out, 0, 6, values);
    return out;
}

JNIEXPORT jbyteArray JNICALL
Java_me_magnum_melonds_common_ndz_NdzNative_ndzRead(JNIEnv* env, jobject, jlong id, jlong offset, jint length)
{
    auto handle = findHandle(id);
    if (!handle || offset < 0 || length < 0)
    {
        throwIoException(env, "ndzRead: invalid handle or range");
        return nullptr;
    }
    std::vector<uint8_t> buffer(static_cast<size_t>(length));
    size_t got = 0;
    {
        std::lock_guard<std::mutex> lock(handle->mutex);
        got = handle->reader.readAt(static_cast<uint64_t>(offset), buffer.data(), buffer.size());
        if (got < buffer.size() && handle->reader.lastError() != MelonDSAndroid::Ndz::Ok)
        {
            throwIoException(env, MelonDSAndroid::Ndz::resultName(handle->reader.lastError()));
            return nullptr;
        }
    }
    jbyteArray out = env->NewByteArray(static_cast<jsize>(got));
    if (out != nullptr && got > 0)
        env->SetByteArrayRegion(out, 0, static_cast<jsize>(got), reinterpret_cast<const jbyte*>(buffer.data()));
    return out;
}

JNIEXPORT void JNICALL
Java_me_magnum_melonds_common_ndz_NdzNative_ndzClose(JNIEnv*, jobject, jlong id)
{
    std::shared_ptr<Handle> handle;
    {
        std::lock_guard<std::mutex> lock(handlesMutex);
        const auto it = handles.find(id);
        if (it == handles.end())
            return;
        handle = std::move(it->second);
        handles.erase(it);
    }

    std::lock_guard<std::mutex> lock(handle->mutex);
}

}

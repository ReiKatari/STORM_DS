#include <jni.h>
#include <unistd.h>
#include <fcntl.h>
#include <cerrno>
#include <cstring>
#include <mutex>
#include <vector>
#include <Platform.h>

// messagePipes[0] -> read
// messagePipes[1] -> write
static int messagePipes[2] = { -1, -1 };

static std::mutex writeMutex;

extern "C"
{

JNIEXPORT jint JNICALL
Java_me_magnum_melonds_impl_emulator_EmulatorMessageQueue_initMessagePipe(JNIEnv* env, jobject thiz)
{
    if (messagePipes[0] != -1) {
        return messagePipes[0];
    }

    if (pipe(messagePipes) == -1) {
        melonDS::Platform::Log(melonDS::Platform::LogLevel::Error, "Failed to create message queue pipes");
        return -1;
    }

    // Make read end non-blocking
    int flags = fcntl(messagePipes[0], F_GETFL, 0);
    fcntl(messagePipes[0], F_SETFL, flags | O_NONBLOCK);

    return messagePipes[0];
}

JNIEXPORT void JNICALL
Java_me_magnum_melonds_impl_emulator_EmulatorMessageQueue_closeMessagePipe(JNIEnv* env, jobject thiz)
{
    std::lock_guard guard(writeMutex);
    if (messagePipes[0] != -1) {
        close(messagePipes[0]);
        messagePipes[0] = -1;
    }
    if (messagePipes[1] != -1) {
        close(messagePipes[1]);
        messagePipes[1] = -1;
    }
}

}

namespace MelonDSAndroid {
    void fireEmulatorEvent(int type, int dataLength, void* data) {
        std::lock_guard guard(writeMutex);
        if (messagePipes[1] == -1) {
            return;
        }

        const size_t headerSize = sizeof(int) * 2;
        const size_t payloadSize = (data != nullptr && dataLength > 0) ? (size_t) dataLength : 0;
        const size_t totalSize = headerSize + payloadSize;

        std::vector<char> buffer(totalSize);
        const int header[2] = { type, dataLength };
        std::memcpy(buffer.data(), header, headerSize);
        if (payloadSize > 0) {
            std::memcpy(buffer.data() + headerSize, data, payloadSize);
        }

        ssize_t written = 0;
        while (written < (ssize_t) totalSize) {
            ssize_t result = write(messagePipes[1], buffer.data() + written, totalSize - written);
            if (result < 0) {
                if (errno == EINTR) continue;
                melonDS::Platform::Log(
                    melonDS::Platform::LogLevel::Warn,
                    "[RAClient] runtime_event_dropped reason=pipe_write_failed errno=%d type=%d\n",
                    errno,
                    type
                );
                return;
            }
            written += result;
        }
    }
}

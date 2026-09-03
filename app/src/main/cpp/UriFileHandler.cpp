#include "UriFileHandler.h"
#include "Platform.h"

using namespace melonDS::Platform;

UriFileHandler::UriFileHandler(JniEnvHandler* jniEnvHandler, jobject uriFileHandler)
{
    this->jniEnvHandler = jniEnvHandler;
    this->uriFileHandler = uriFileHandler;
}

FILE* UriFileHandler::open(const char* path, FileMode mode)
{
    JNIEnv* env = this->jniEnvHandler->getCurrentThreadEnv();

    jstring pathString = env->NewStringUTF(path);
    jstring modeString = env->NewStringUTF(getAccessMode(mode, true).c_str());
    jclass handlerClass = env->GetObjectClass(this->uriFileHandler);
    jmethodID openMethod = env->GetMethodID(handlerClass, "open", "(Ljava/lang/String;Ljava/lang/String;)I");
    jint fileDescriptor = env->CallIntMethod(this->uriFileHandler, openMethod, pathString, modeString);
    if (env->ExceptionCheck()) {
        env->ExceptionClear();
        return nullptr;
    }

    if (fileDescriptor == -1) {
        return nullptr;
    } else {
        std::string nativeMode = getNativeAccessMode(mode, true);
        return fdopen(fileDescriptor, nativeMode.c_str());
    }
}

std::string UriFileHandler::getNativeAccessMode(FileMode mode, bool fileExists)
{
    std::string modeString;

    if (mode & FileMode::Append)
        modeString += 'a';
    else if (!(mode & FileMode::Write))
        // If we're only opening the file for reading...
        modeString += 'r';
    else if ((mode & FileMode::NoCreate) || (mode & FileMode::Preserve))
        // If we must not truncate or overwrite...
        modeString += 'r'; // "r+" mode never truncates existing files
    else
        modeString += 'w';

    if ((mode & FileMode::ReadWrite) == FileMode::ReadWrite)
        modeString += '+';

    if (!(mode & FileMode::Text))
        modeString += 'b';

    return modeString;
}

std::string UriFileHandler::getAccessMode(FileMode mode, bool fileExists)
{
    std::string modeString;

    if (mode & FileMode::Read)
        modeString += 'r';

    if (mode & FileMode::Write)
    {
        modeString += 'w';

        if (mode & FileMode::Append)
            modeString += 'a';
        else if (!(mode & FileMode::Preserve) && !(mode & FileMode::NoCreate))
            modeString += 't';
    }
    else if (mode & FileMode::Append)
        modeString += "wa";

    return modeString;
}

UriFileHandler::~UriFileHandler()
{
}
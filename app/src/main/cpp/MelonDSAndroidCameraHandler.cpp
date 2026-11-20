#include "MelonDSAndroidCameraHandler.h"

MelonDSAndroidCameraHandler::MelonDSAndroidCameraHandler(JniEnvHandler* jniEnvHandler, jobject cameraManager) : jniEnvHandler(jniEnvHandler), cameraManager(cameraManager)
{
}

void MelonDSAndroidCameraHandler::startCamera(int camera)
{
    if (!jniEnvHandler || !cameraManager) return;
    JNIEnv* env = jniEnvHandler->getCurrentThreadEnv();
    if (!env) return;

    jclass cameraManagerClass = env->GetObjectClass(cameraManager);
    if (!cameraManagerClass)
    {
        if (env->ExceptionCheck()) env->ExceptionClear();
        return;
    }
    jmethodID startCameraMethod = env->GetMethodID(cameraManagerClass, "startCamera", "(I)V");
    env->DeleteLocalRef(cameraManagerClass);
    if (!startCameraMethod)
    {
        if (env->ExceptionCheck()) env->ExceptionClear();
        return;
    }
    env->CallVoidMethod(cameraManager, startCameraMethod, camera);
    if (env->ExceptionCheck())
    {
        env->ExceptionClear();
    }
}

void MelonDSAndroidCameraHandler::stopCamera(int camera)
{
    if (!jniEnvHandler || !cameraManager) return;
    JNIEnv* env = jniEnvHandler->getCurrentThreadEnv();
    if (!env) return;

    jclass cameraManagerClass = env->GetObjectClass(cameraManager);
    if (!cameraManagerClass)
    {
        if (env->ExceptionCheck()) env->ExceptionClear();
        return;
    }
    jmethodID stopCameraMethod = env->GetMethodID(cameraManagerClass, "stopCamera", "(I)V");
    env->DeleteLocalRef(cameraManagerClass);
    if (!stopCameraMethod)
    {
        if (env->ExceptionCheck()) env->ExceptionClear();
        return;
    }
    env->CallVoidMethod(cameraManager, stopCameraMethod, camera);
    if (env->ExceptionCheck())
    {
        env->ExceptionClear();
    }
}

void MelonDSAndroidCameraHandler::captureFrame(int camera, u32* frameBuffer, int width, int height, bool isYuv)
{
    if (!jniEnvHandler || !cameraManager || !frameBuffer) return;
    JNIEnv* env = jniEnvHandler->getCurrentThreadEnv();
    if (!env) return;

    jbyteArray javaBuffer = env->NewByteArray(BUFFER_SIZE);
    if (!javaBuffer)
    {
        if (env->ExceptionCheck()) env->ExceptionClear();
        return;
    }

    jclass cameraManagerClass = env->GetObjectClass(cameraManager);
    if (!cameraManagerClass)
    {
        if (env->ExceptionCheck()) env->ExceptionClear();
        env->DeleteLocalRef(javaBuffer);
        return;
    }
    jmethodID captureFrameMethod = env->GetMethodID(cameraManagerClass, "captureFrame", "(I[BIIZ)V");
    env->DeleteLocalRef(cameraManagerClass);
    if (!captureFrameMethod)
    {
        if (env->ExceptionCheck()) env->ExceptionClear();
        env->DeleteLocalRef(javaBuffer);
        return;
    }

    env->CallVoidMethod(cameraManager, captureFrameMethod, camera, javaBuffer, width, height, isYuv);
    if (env->ExceptionCheck())
    {
        env->ExceptionClear();
        env->DeleteLocalRef(javaBuffer);
        return;
    }

    env->GetByteArrayRegion(javaBuffer, 0, BUFFER_SIZE, (jbyte*) frameBuffer);
    if (env->ExceptionCheck())
    {
        env->ExceptionClear();
    }

    env->DeleteLocalRef(javaBuffer);
}

MelonDSAndroidCameraHandler::~MelonDSAndroidCameraHandler()
{
}

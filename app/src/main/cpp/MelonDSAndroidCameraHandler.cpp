#include "MelonDSAndroidCameraHandler.h"

MelonDSAndroidCameraHandler::MelonDSAndroidCameraHandler(JniEnvHandler* jniEnvHandler, jobject cameraManager) : jniEnvHandler(jniEnvHandler), cameraManager(cameraManager)
{
}

void MelonDSAndroidCameraHandler::startCamera(int camera)
{
    JNIEnv* env = jniEnvHandler->getCurrentThreadEnv();
    if (!env) return;

    jclass cameraManagerClass = env->GetObjectClass(cameraManager);
    if (!cameraManagerClass) return;
    jmethodID startCameraMethod = env->GetMethodID(cameraManagerClass, "startCamera", "(I)V");
    if (!startCameraMethod) return;
    env->CallVoidMethod(cameraManager, startCameraMethod, camera);
    if (env->ExceptionCheck())
    {
        env->ExceptionClear();
    }
}

void MelonDSAndroidCameraHandler::stopCamera(int camera)
{
    JNIEnv* env = jniEnvHandler->getCurrentThreadEnv();
    if (!env) return;

    jclass cameraManagerClass = env->GetObjectClass(cameraManager);
    if (!cameraManagerClass) return;
    jmethodID stopCameraMethod = env->GetMethodID(cameraManagerClass, "stopCamera", "(I)V");
    if (!stopCameraMethod) return;
    env->CallVoidMethod(cameraManager, stopCameraMethod, camera);
    if (env->ExceptionCheck())
    {
        env->ExceptionClear();
    }
}

void MelonDSAndroidCameraHandler::captureFrame(int camera, u32* frameBuffer, int width, int height, bool isYuv)
{
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
        env->DeleteLocalRef(javaBuffer);
        return;
    }
    jmethodID captureFrameMethod = env->GetMethodID(cameraManagerClass, "captureFrame", "(I[BIIZ)V");
    if (!captureFrameMethod)
    {
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
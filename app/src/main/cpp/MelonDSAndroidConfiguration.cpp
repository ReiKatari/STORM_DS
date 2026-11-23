#include <jni.h>
#include <algorithm>
#include <cmath>
#include <cstdlib>
#include <cstring>
#include <string>
#include <sstream>
#include "MelonDSAndroidConfiguration.h"
#include "renderer/Renderer.h"

namespace {

char* duplicateCString(const char* value)
{
    if (value == nullptr)
        return nullptr;

    const size_t length = std::strlen(value);
    char* copy = static_cast<char*>(std::malloc(length + 1));
    if (copy == nullptr)
        return nullptr;

    std::memcpy(copy, value, length + 1);
    return copy;
}

char* duplicateJavaString(JNIEnv* env, jstring javaString)
{
    if (javaString == nullptr)
        return nullptr;

    const char* value = env->GetStringUTFChars(javaString, nullptr);
    if (value == nullptr)
        return nullptr;

    char* copy = duplicateCString(value);
    env->ReleaseStringUTFChars(javaString, value);
    return copy;
}

static char* duplicateAndDecodeJavaUriString(JNIEnv* env, jobject uriObj, jmethodID uriToStringMethod)
{
    if (uriObj == nullptr)
        return nullptr;

    jstring uriString = (jstring) env->CallObjectMethod(uriObj, uriToStringMethod);
    if (uriString == nullptr)
    {
        if (env->ExceptionCheck()) env->ExceptionClear();
        return nullptr;
    }

    const char* rawChars = env->GetStringUTFChars(uriString, nullptr);
    if (rawChars == nullptr)
    {
        env->DeleteLocalRef(uriString);
        return nullptr;
    }

    std::string path = rawChars;
    env->ReleaseStringUTFChars(uriString, rawChars);
    env->DeleteLocalRef(uriString);

    if (path.rfind("file://", 0) == 0)
    {
        path = path.substr(7);
        std::string decoded;
        decoded.reserve(path.length());
        for (size_t i = 0; i < path.length(); ++i)
        {
            if (path[i] == '%' && i + 2 < path.length())
            {
                int val = 0;
                std::istringstream is(path.substr(i + 1, 2));
                if (is >> std::hex >> val)
                {
                    decoded += static_cast<char>(val);
                    i += 2;
                    continue;
                }
            }
            decoded += path[i];
        }
        path = std::move(decoded);
    }

    char* copy = static_cast<char*>(std::malloc(path.length() + 1));
    if (copy != nullptr)
    {
        std::memcpy(copy, path.c_str(), path.length() + 1);
    }
    return copy;
}

bool getEnumOrdinal(JNIEnv* env, jobject enumObject, jint* ordinalOut)
{
    if (enumObject == nullptr || ordinalOut == nullptr)
        return false;

    jclass enumClass = env->GetObjectClass(enumObject);
    if (enumClass == nullptr || env->ExceptionCheck())
    {
        env->ExceptionClear();
        return false;
    }

    jmethodID ordinalMethod = env->GetMethodID(enumClass, "ordinal", "()I");
    if (ordinalMethod == nullptr)
    {
        if (env->ExceptionCheck())
            env->ExceptionClear();
        env->DeleteLocalRef(enumClass);
        return false;
    }

    *ordinalOut = env->CallIntMethod(enumObject, ordinalMethod);
    const bool success = !env->ExceptionCheck();
    if (!success)
        env->ExceptionClear();
    env->DeleteLocalRef(enumClass);
    return success;
}

jfieldID getFieldIdOrClear(JNIEnv* env, jclass objectClass, const char* name, const char* signature)
{
    if (objectClass == nullptr)
        return nullptr;

    jfieldID fieldId = env->GetFieldID(objectClass, name, signature);
    if (fieldId == nullptr || env->ExceptionCheck())
    {
        env->ExceptionClear();
        return nullptr;
    }

    return fieldId;
}

jmethodID getMethodIdOrClear(JNIEnv* env, jclass objectClass, const char* name, const char* signature)
{
    if (objectClass == nullptr)
        return nullptr;

    jmethodID methodId = env->GetMethodID(objectClass, name, signature);
    if (methodId == nullptr || env->ExceptionCheck())
    {
        env->ExceptionClear();
        return nullptr;
    }

    return methodId;
}

jobject getOptionalObjectField(JNIEnv* env, jobject object, jclass objectClass, const char* name, const char* signature)
{
    if (object == nullptr || objectClass == nullptr)
        return nullptr;

    jfieldID fieldId = getFieldIdOrClear(env, objectClass, name, signature);
    if (fieldId == nullptr)
        return nullptr;

    jobject value = env->GetObjectField(object, fieldId);
    if (env->ExceptionCheck())
    {
        env->ExceptionClear();
        return nullptr;
    }

    return value;
}

jboolean getBooleanFieldOrDefault(JNIEnv* env, jobject object, jclass objectClass, const char* name, jboolean defaultValue = JNI_FALSE)
{
    jfieldID fieldId = getFieldIdOrClear(env, objectClass, name, "Z");
    if (object == nullptr || fieldId == nullptr)
        return defaultValue;

    jboolean value = env->GetBooleanField(object, fieldId);
    if (env->ExceptionCheck())
    {
        env->ExceptionClear();
        return defaultValue;
    }
    return value;
}

jint getIntFieldOrDefault(JNIEnv* env, jobject object, jclass objectClass, const char* name, jint defaultValue = 0)
{
    jfieldID fieldId = getFieldIdOrClear(env, objectClass, name, "I");
    if (object == nullptr || fieldId == nullptr)
        return defaultValue;

    jint value = env->GetIntField(object, fieldId);
    if (env->ExceptionCheck())
    {
        env->ExceptionClear();
        return defaultValue;
    }
    return value;
}

jfloat getFloatFieldOrDefault(JNIEnv* env, jobject object, jclass objectClass, const char* name, jfloat defaultValue = 0.0f)
{
    jfieldID fieldId = getFieldIdOrClear(env, objectClass, name, "F");
    if (object == nullptr || fieldId == nullptr)
        return defaultValue;

    jfloat value = env->GetFloatField(object, fieldId);
    if (env->ExceptionCheck())
    {
        env->ExceptionClear();
        return defaultValue;
    }
    return value;
}

jclass findClassOrClear(JNIEnv* env, const char* name)
{
    jclass cls = env->FindClass(name);
    if (cls == nullptr || env->ExceptionCheck())
    {
        env->ExceptionClear();
        return nullptr;
    }
    return cls;
}

MelonDSAndroid::SdCardSettings disabledSdCardSettings()
{
    return MelonDSAndroid::SdCardSettings { .enabled = false };
}

MelonDSAndroid::SdCardSettings buildSdCardSettings(JNIEnv* env, jobject sdCardConfiguration)
{
    if (sdCardConfiguration == nullptr)
        return disabledSdCardSettings();

    jclass sdCardConfigurationClass = env->GetObjectClass(sdCardConfiguration);
    if (sdCardConfigurationClass == nullptr || env->ExceptionCheck())
    {
        env->ExceptionClear();
        return disabledSdCardSettings();
    }

    jfieldID enabledField = getFieldIdOrClear(env, sdCardConfigurationClass, "enabled", "Z");
    if (enabledField == nullptr)
    {
        env->DeleteLocalRef(sdCardConfigurationClass);
        return disabledSdCardSettings();
    }

    jboolean enabled = env->GetBooleanField(sdCardConfiguration, enabledField);
    if (env->ExceptionCheck() || enabled == 0)
    {
        env->ExceptionClear();
        env->DeleteLocalRef(sdCardConfigurationClass);
        return disabledSdCardSettings();
    }

    jfieldID imagePathField = getFieldIdOrClear(env, sdCardConfigurationClass, "imagePath", "Ljava/lang/String;");
    jfieldID imageSizeField = getFieldIdOrClear(env, sdCardConfigurationClass, "imageSize", "I");
    jfieldID folderSyncField = getFieldIdOrClear(env, sdCardConfigurationClass, "folderSync", "Z");
    jfieldID folderPathField = getFieldIdOrClear(env, sdCardConfigurationClass, "folderPath", "Ljava/lang/String;");
    if (imagePathField == nullptr || imageSizeField == nullptr || folderSyncField == nullptr || folderPathField == nullptr)
    {
        env->DeleteLocalRef(sdCardConfigurationClass);
        return disabledSdCardSettings();
    }

    jstring imagePathString = static_cast<jstring>(env->GetObjectField(sdCardConfiguration, imagePathField));
    jint imageSize = env->GetIntField(sdCardConfiguration, imageSizeField);
    jboolean folderSync = env->GetBooleanField(sdCardConfiguration, folderSyncField);
    jstring folderPathString = static_cast<jstring>(env->GetObjectField(sdCardConfiguration, folderPathField));
    if (env->ExceptionCheck())
    {
        env->ExceptionClear();
        if (imagePathString != nullptr) env->DeleteLocalRef(imagePathString);
        if (folderPathString != nullptr) env->DeleteLocalRef(folderPathString);
        env->DeleteLocalRef(sdCardConfigurationClass);
        return disabledSdCardSettings();
    }

    char* imagePath = duplicateJavaString(env, imagePathString);
    char* folderPath = duplicateJavaString(env, folderPathString);
    if (imagePathString != nullptr) env->DeleteLocalRef(imagePathString);
    if (folderPathString != nullptr) env->DeleteLocalRef(folderPathString);
    env->DeleteLocalRef(sdCardConfigurationClass);

    return MelonDSAndroid::SdCardSettings {
        .enabled = true,
        .imagePath = imagePath,
        .imageSize = imageSize,
        .readOnly = false,
        .folderSync = folderSync != 0,
        .folderPath = folderPath,
    };
}

MelonDSAndroid::VulkanFilterMode mapVulkanFilterMode(jint ordinal)
{
    switch (ordinal)
    {
        case 1: return MelonDSAndroid::VulkanFilterMode::Linear;
        case 2: return MelonDSAndroid::VulkanFilterMode::Xbr2;
        case 3: return MelonDSAndroid::VulkanFilterMode::Hq2x;
        case 4: return MelonDSAndroid::VulkanFilterMode::Hq4x;
        case 5: return MelonDSAndroid::VulkanFilterMode::Quilez;
        case 6: return MelonDSAndroid::VulkanFilterMode::Lcd;
        case 7: return MelonDSAndroid::VulkanFilterMode::Scanlines;
        case 8: return MelonDSAndroid::VulkanFilterMode::Scale2x;
        case 9: return MelonDSAndroid::VulkanFilterMode::AiUpscale;
        case 10: return MelonDSAndroid::VulkanFilterMode::RetroArch;
        case 0:
        default: return MelonDSAndroid::VulkanFilterMode::Nearest;
    }
}

uint32_t parseIpv4HostOrder(const char* ipStr)
{
    if (!ipStr || !ipStr[0]) return 0;
    unsigned int a = 0, b = 0, c = 0, d = 0;
    if (std::sscanf(ipStr, "%u.%u.%u.%u", &a, &b, &c, &d) == 4 &&
        a <= 255 && b <= 255 && c <= 255 && d <= 255)
    {
        return (a << 24) | (b << 16) | (c << 8) | d;
    }
    return 0;
}

}

MelonDSAndroid::EmulatorConfiguration MelonDSAndroidConfiguration::buildEmulatorConfiguration(JNIEnv* env, jobject emulatorConfiguration) {
    if (env == nullptr || emulatorConfiguration == nullptr)
        return MelonDSAndroid::EmulatorConfiguration{};

    jclass emulatorConfigurationClass = env->GetObjectClass(emulatorConfiguration);
    if (emulatorConfigurationClass == nullptr || env->ExceptionCheck())
    {
        env->ExceptionClear();
        return MelonDSAndroid::EmulatorConfiguration{};
    }

    jclass uriClass = findClassOrClear(env, "android/net/Uri");
    jclass consoleTypeEnumClass = findClassOrClear(env, "me/magnum/melonds/domain/model/ConsoleType");
    jclass audioBitrateEnumClass = findClassOrClear(env, "me/magnum/melonds/domain/model/AudioBitrate");
    jclass audioInterpolationEnumClass = findClassOrClear(env, "me/magnum/melonds/domain/model/AudioInterpolation");
    jclass audioLatencyEnumClass = findClassOrClear(env, "me/magnum/melonds/domain/model/AudioLatency");
    jclass micSourceEnumClass = findClassOrClear(env, "me/magnum/melonds/domain/model/MicSource");
    jclass videoRendererEnumClass = findClassOrClear(env, "me/magnum/melonds/domain/model/VideoRenderer");
    jclass renderConfigurationClass = findClassOrClear(env, "me/magnum/melonds/domain/model/RendererConfiguration");

    jmethodID uriToStringMethod = getMethodIdOrClear(env, uriClass, "toString", "()Ljava/lang/String;");

    jobject firmwareConfigurationObject = getOptionalObjectField(env, emulatorConfiguration, emulatorConfigurationClass, "firmwareConfiguration", "Lme/magnum/melonds/domain/model/FirmwareConfiguration;");
    jobject rendererConfigurationObject = getOptionalObjectField(env, emulatorConfiguration, emulatorConfigurationClass, "rendererConfiguration", "Lme/magnum/melonds/domain/model/RendererConfiguration;");
    jobject dldiSdCardConfigurationObject = getOptionalObjectField(env, emulatorConfiguration, emulatorConfigurationClass, "dldiSdCardConfiguration", "Lme/magnum/melonds/domain/model/DldiSdCardConfiguration;");
    jfieldID dsiWareAutoloadTitleIdField = getFieldIdOrClear(env, emulatorConfigurationClass, "dsiWareAutoloadTitleId", "J");
    jboolean useCustomBios = getBooleanFieldOrDefault(env, emulatorConfiguration, emulatorConfigurationClass, "useCustomBios", JNI_FALSE);
    jboolean showBootScreen = getBooleanFieldOrDefault(env, emulatorConfiguration, emulatorConfigurationClass, "showBootScreen", JNI_FALSE);
    jobject dsBios7Uri = uriToStringMethod ? getOptionalObjectField(env, emulatorConfiguration, emulatorConfigurationClass, "dsBios7Uri", "Landroid/net/Uri;") : nullptr;
    jobject dsBios9Uri = uriToStringMethod ? getOptionalObjectField(env, emulatorConfiguration, emulatorConfigurationClass, "dsBios9Uri", "Landroid/net/Uri;") : nullptr;
    jobject dsFirmwareUri = uriToStringMethod ? getOptionalObjectField(env, emulatorConfiguration, emulatorConfigurationClass, "dsFirmwareUri", "Landroid/net/Uri;") : nullptr;
    jobject dsiBios7Uri = uriToStringMethod ? getOptionalObjectField(env, emulatorConfiguration, emulatorConfigurationClass, "dsiBios7Uri", "Landroid/net/Uri;") : nullptr;
    jobject dsiBios9Uri = uriToStringMethod ? getOptionalObjectField(env, emulatorConfiguration, emulatorConfigurationClass, "dsiBios9Uri", "Landroid/net/Uri;") : nullptr;
    jobject dsiFirmwareUri = uriToStringMethod ? getOptionalObjectField(env, emulatorConfiguration, emulatorConfigurationClass, "dsiFirmwareUri", "Landroid/net/Uri;") : nullptr;
    jobject dsiNandUri = uriToStringMethod ? getOptionalObjectField(env, emulatorConfiguration, emulatorConfigurationClass, "dsiNandUri", "Landroid/net/Uri;") : nullptr;
    jstring internalFilesDir = static_cast<jstring>(getOptionalObjectField(env, emulatorConfiguration, emulatorConfigurationClass, "internalDirectory", "Ljava/lang/String;"));
    jfloat fastForwardMaxSpeed = getFloatFieldOrDefault(env, emulatorConfiguration, emulatorConfigurationClass, "fastForwardSpeedMultiplier", 1.0f);
    jfloat frameLimitSpeed = getFloatFieldOrDefault(env, emulatorConfiguration, emulatorConfigurationClass, "frameLimitSpeedMultiplier", 1.0f);
    jboolean enableRewind = getBooleanFieldOrDefault(env, emulatorConfiguration, emulatorConfigurationClass, "rewindEnabled", JNI_FALSE);
    jint rewindPeriodSeconds = getIntFieldOrDefault(env, emulatorConfiguration, emulatorConfigurationClass, "rewindPeriodSeconds", 0);
    jint rewindWindowSeconds = getIntFieldOrDefault(env, emulatorConfiguration, emulatorConfigurationClass, "rewindWindowSeconds", 0);
    jboolean useJit = getBooleanFieldOrDefault(env, emulatorConfiguration, emulatorConfigurationClass, "useJit", JNI_FALSE);
    jboolean hgEngineFixEnabled = getBooleanFieldOrDefault(env, emulatorConfiguration, emulatorConfigurationClass, "hgEngineFixEnabled", JNI_FALSE);
    jobject consoleTypeEnum = getOptionalObjectField(env, emulatorConfiguration, emulatorConfigurationClass, "consoleType", "Lme/magnum/melonds/domain/model/ConsoleType;");
    jint consoleType = getIntFieldOrDefault(env, consoleTypeEnum, consoleTypeEnumClass, "consoleType", 0);
    jboolean soundEnabled = getBooleanFieldOrDefault(env, emulatorConfiguration, emulatorConfigurationClass, "soundEnabled", JNI_FALSE);
    jint volume = std::clamp<jint>(getIntFieldOrDefault(env, emulatorConfiguration, emulatorConfigurationClass, "volume", 256), 0, 512);
    jobject audioInterpolationEnum = getOptionalObjectField(env, emulatorConfiguration, emulatorConfigurationClass, "audioInterpolation", "Lme/magnum/melonds/domain/model/AudioInterpolation;");
    jint audioInterpolation = getIntFieldOrDefault(env, audioInterpolationEnum, audioInterpolationEnumClass, "interpolationValue", 0);
    jobject audioBitrateEnum = getOptionalObjectField(env, emulatorConfiguration, emulatorConfigurationClass, "audioBitrate", "Lme/magnum/melonds/domain/model/AudioBitrate;");
    jint audioBitrate = getIntFieldOrDefault(env, audioBitrateEnum, audioBitrateEnumClass, "bitrateValue", 0);
    jobject audioLatencyEnum = getOptionalObjectField(env, emulatorConfiguration, emulatorConfigurationClass, "audioLatency", "Lme/magnum/melonds/domain/model/AudioLatency;");
    jint audioLatency = getIntFieldOrDefault(env, audioLatencyEnum, audioLatencyEnumClass, "latencyValue", 0);
    jobject micSourceEnum = getOptionalObjectField(env, emulatorConfiguration, emulatorConfigurationClass, "micSource", "Lme/magnum/melonds/domain/model/MicSource;");
    jint micSource = getIntFieldOrDefault(env, micSourceEnum, micSourceEnumClass, "sourceValue", 0);
    jobject videoRendererEnum = getOptionalObjectField(env, rendererConfigurationObject, renderConfigurationClass, "renderer", "Lme/magnum/melonds/domain/model/VideoRenderer;");
    MelonDSAndroid::Renderer videoRenderer = static_cast<MelonDSAndroid::Renderer>(getIntFieldOrDefault(env, videoRendererEnum, videoRendererEnumClass, "renderer", 0));
    char* dsBios7Path = duplicateAndDecodeJavaUriString(env, dsBios7Uri, uriToStringMethod);
    char* dsBios9Path = duplicateAndDecodeJavaUriString(env, dsBios9Uri, uriToStringMethod);
    char* dsFirmwarePath = duplicateAndDecodeJavaUriString(env, dsFirmwareUri, uriToStringMethod);
    char* dsiBios7Path = duplicateAndDecodeJavaUriString(env, dsiBios7Uri, uriToStringMethod);
    char* dsiBios9Path = duplicateAndDecodeJavaUriString(env, dsiBios9Uri, uriToStringMethod);
    char* dsiFirmwarePath = duplicateAndDecodeJavaUriString(env, dsiFirmwareUri, uriToStringMethod);
    char* dsiNandPath = duplicateAndDecodeJavaUriString(env, dsiNandUri, uriToStringMethod);
    char* internalDir = duplicateJavaString(env, internalFilesDir);

    MelonDSAndroid::EmulatorConfiguration finalEmulatorConfiguration;
    finalEmulatorConfiguration.userInternalFirmwareAndBios = !useCustomBios;
    finalEmulatorConfiguration.dsBios7Path = dsBios7Path;
    finalEmulatorConfiguration.dsBios9Path = dsBios9Path;
    finalEmulatorConfiguration.dsFirmwarePath = dsFirmwarePath;
    finalEmulatorConfiguration.dsiBios7Path = dsiBios7Path;
    finalEmulatorConfiguration.dsiBios9Path = dsiBios9Path;
    finalEmulatorConfiguration.dsiFirmwarePath = dsiFirmwarePath;
    finalEmulatorConfiguration.dsiNandPath = dsiNandPath;
    finalEmulatorConfiguration.internalFilesDir = internalDir;
    if (std::isnan(fastForwardMaxSpeed) || fastForwardMaxSpeed == 0.0f) {
        fastForwardMaxSpeed = 1.0f;
    } else if (fastForwardMaxSpeed < 0.0f) {
        fastForwardMaxSpeed = -1.0f;
    }
    if (std::isnan(frameLimitSpeed) || frameLimitSpeed <= 0.0f) frameLimitSpeed = 1.0f;
    finalEmulatorConfiguration.fastForwardSpeedMultiplier = fastForwardMaxSpeed;
    finalEmulatorConfiguration.frameLimitSpeedMultiplier = frameLimitSpeed;
    finalEmulatorConfiguration.showBootScreen = showBootScreen;
    finalEmulatorConfiguration.useJit = useJit;
    jfieldID audioSoftLimiterEnabledField = getFieldIdOrClear(env, emulatorConfigurationClass, "audioSoftLimiterEnabled", "Z");
    jfieldID audioBassBoostEnabledField = getFieldIdOrClear(env, emulatorConfigurationClass, "audioBassBoostEnabled", "Z");
    jfieldID audioBassBoostStrengthField = getFieldIdOrClear(env, emulatorConfigurationClass, "audioBassBoostStrength", "I");
    jfieldID audioSpatialAudioEnabledField = getFieldIdOrClear(env, emulatorConfigurationClass, "audioSpatialAudioEnabled", "Z");
    jfieldID audioReverbEnabledField = getFieldIdOrClear(env, emulatorConfigurationClass, "audioReverbEnabled", "Z");

    bool softLimiterEnabled = audioSoftLimiterEnabledField != nullptr ? (bool) env->GetBooleanField(emulatorConfiguration, audioSoftLimiterEnabledField) : true;
    bool bassBoostEnabled = audioBassBoostEnabledField != nullptr ? (bool) env->GetBooleanField(emulatorConfiguration, audioBassBoostEnabledField) : false;
    int bassBoostStrength = audioBassBoostStrengthField != nullptr ? env->GetIntField(emulatorConfiguration, audioBassBoostStrengthField) : 5;
    bool spatialAudioEnabled = audioSpatialAudioEnabledField != nullptr ? (bool) env->GetBooleanField(emulatorConfiguration, audioSpatialAudioEnabledField) : false;
    bool reverbEnabled = audioReverbEnabledField != nullptr ? (bool) env->GetBooleanField(emulatorConfiguration, audioReverbEnabledField) : false;

    finalEmulatorConfiguration.hgEngineFixEnabled = hgEngineFixEnabled;
    finalEmulatorConfiguration.consoleType = consoleType;
    finalEmulatorConfiguration.audioSettings = MelonDSAndroid::AudioSettings {
        .soundEnabled = (bool) soundEnabled,
        .volume = volume,
        .audioInterpolation = audioInterpolation,
        .audioBitrate = audioBitrate,
        .audioLatency = audioLatency,
        .micSource = micSource,
        .softLimiterEnabled = softLimiterEnabled,
        .bassBoostEnabled = bassBoostEnabled,
        .bassBoostStrength = bassBoostStrength,
        .spatialAudioEnabled = spatialAudioEnabled,
        .reverbEnabled = reverbEnabled
    };
    finalEmulatorConfiguration.firmwareConfiguration = buildFirmwareConfiguration(env, firmwareConfigurationObject);
    finalEmulatorConfiguration.rewindEnabled = enableRewind ? 1 : 0;
    finalEmulatorConfiguration.rewindCaptureSpacingSeconds = rewindPeriodSeconds;
    finalEmulatorConfiguration.rewindLengthSeconds = rewindWindowSeconds;
    finalEmulatorConfiguration.renderSettings = std::move(buildRenderSettings(env, videoRenderer, rendererConfigurationObject));
    auto sdSettings = buildSdCardSettings(env, dldiSdCardConfigurationObject);
    if (consoleType == 1) {
        finalEmulatorConfiguration.dsiSdCardSettings = sdSettings;
        finalEmulatorConfiguration.dldiSdCardSettings = MelonDSAndroid::SdCardSettings { .enabled = false };
    } else {
        finalEmulatorConfiguration.dsiSdCardSettings = MelonDSAndroid::SdCardSettings { .enabled = false };
        finalEmulatorConfiguration.dldiSdCardSettings = sdSettings;
    }
    jfieldID arm9OverclockMultiplierField = getFieldIdOrClear(env, emulatorConfigurationClass, "arm9OverclockMultiplier", "I");
    jfieldID enable3dWidescreenField = getFieldIdOrClear(env, emulatorConfigurationClass, "enable3dWidescreen", "Z");
    jfieldID enable60FpsPatchField = getFieldIdOrClear(env, emulatorConfigurationClass, "enable60FpsPatch", "Z");
    jfieldID wfcDnsServerIpField = getFieldIdOrClear(env, emulatorConfigurationClass, "wfcDnsServerIp", "Ljava/lang/String;");
    jfieldID wfcSettingsPathField = getFieldIdOrClear(env, emulatorConfigurationClass, "wfcSettingsPath", "Ljava/lang/String;");

    finalEmulatorConfiguration.renderer = videoRenderer;
    finalEmulatorConfiguration.dsiWareAutoloadTitleId = 0u;
    if (dsiWareAutoloadTitleIdField != nullptr)
    {
        finalEmulatorConfiguration.dsiWareAutoloadTitleId =
            static_cast<uint32_t>(env->GetLongField(emulatorConfiguration, dsiWareAutoloadTitleIdField));
        if (env->ExceptionCheck())
        {
            env->ExceptionClear();
            finalEmulatorConfiguration.dsiWareAutoloadTitleId = 0u;
        }
    }
    finalEmulatorConfiguration.audioSettings.muteOnFastForward = getBooleanFieldOrDefault(env, emulatorConfiguration, emulatorConfigurationClass, "muteOnFastForward", JNI_FALSE) != 0;
    finalEmulatorConfiguration.audioSettings.micGain = std::clamp<int>(getIntFieldOrDefault(env, emulatorConfiguration, emulatorConfigurationClass, "micGain", 1), 1, 10);
    finalEmulatorConfiguration.frameskipMode = getIntFieldOrDefault(env, emulatorConfiguration, emulatorConfigurationClass, "frameskipMode", 0);
    finalEmulatorConfiguration.frameskipManualValue = getIntFieldOrDefault(env, emulatorConfiguration, emulatorConfigurationClass, "frameskipManualValue", 0);
    finalEmulatorConfiguration.vulkanDrsEnabled = getBooleanFieldOrDefault(env, emulatorConfiguration, emulatorConfigurationClass, "vulkanDrsEnabled", JNI_FALSE) != 0;
    finalEmulatorConfiguration.lowLatencyEnabled = getBooleanFieldOrDefault(env, emulatorConfiguration, emulatorConfigurationClass, "lowLatencyEnabled", JNI_FALSE) != 0;
    finalEmulatorConfiguration.liteModeEnabled = getBooleanFieldOrDefault(env, emulatorConfiguration, emulatorConfigurationClass, "liteModeEnabled", JNI_FALSE) != 0;
    finalEmulatorConfiguration.rtcOffsetMinutes = getIntFieldOrDefault(env, emulatorConfiguration, emulatorConfigurationClass, "rtcOffsetMinutes", 0);
    if (wfcSettingsPathField != nullptr) {
        jstring wfcPathStr = static_cast<jstring>(env->GetObjectField(emulatorConfiguration, wfcSettingsPathField));
        if (env->ExceptionCheck()) {
            env->ExceptionClear();
        } else if (wfcPathStr != nullptr) {
            const char* wfcChars = env->GetStringUTFChars(wfcPathStr, nullptr);
            if (wfcChars != nullptr) {
                finalEmulatorConfiguration.wfcSettingsPath = wfcChars;
                env->ReleaseStringUTFChars(wfcPathStr, wfcChars);
            } else if (env->ExceptionCheck()) {
                env->ExceptionClear();
            }
            env->DeleteLocalRef(wfcPathStr);
        }
    }
    finalEmulatorConfiguration.arm9OverclockMultiplier = getIntFieldOrDefault(env, emulatorConfiguration, emulatorConfigurationClass, "arm9OverclockMultiplier", 1);
    if (finalEmulatorConfiguration.arm9OverclockMultiplier < 1) finalEmulatorConfiguration.arm9OverclockMultiplier = 1;
    finalEmulatorConfiguration.enable3dWidescreen = getBooleanFieldOrDefault(env, emulatorConfiguration, emulatorConfigurationClass, "enable3dWidescreen", JNI_FALSE) != 0;
    finalEmulatorConfiguration.enable60FpsPatch = getBooleanFieldOrDefault(env, emulatorConfiguration, emulatorConfigurationClass, "enable60FpsPatch", JNI_FALSE) != 0;
    finalEmulatorConfiguration.wfcDnsIp = 0;
    if (wfcDnsServerIpField != nullptr) {
        jstring dnsString = static_cast<jstring>(env->GetObjectField(emulatorConfiguration, wfcDnsServerIpField));
        if (env->ExceptionCheck())
        {
            env->ExceptionClear();
            dnsString = nullptr;
        }
        if (dnsString != nullptr) {
            const char* dnsChars = env->GetStringUTFChars(dnsString, nullptr);
            if (env->ExceptionCheck())
            {
                env->ExceptionClear();
                dnsChars = nullptr;
            }
            if (dnsChars != nullptr) {
                finalEmulatorConfiguration.wfcDnsIp = parseIpv4HostOrder(dnsChars);
                env->ReleaseStringUTFChars(dnsString, dnsChars);
            }
            env->DeleteLocalRef(dnsString);
        }
    }

    if (firmwareConfigurationObject) env->DeleteLocalRef(firmwareConfigurationObject);
    if (rendererConfigurationObject) env->DeleteLocalRef(rendererConfigurationObject);
    if (dldiSdCardConfigurationObject) env->DeleteLocalRef(dldiSdCardConfigurationObject);
    if (dsBios7Uri) env->DeleteLocalRef(dsBios7Uri);
    if (dsBios9Uri) env->DeleteLocalRef(dsBios9Uri);
    if (dsFirmwareUri) env->DeleteLocalRef(dsFirmwareUri);
    if (dsiBios7Uri) env->DeleteLocalRef(dsiBios7Uri);
    if (dsiBios9Uri) env->DeleteLocalRef(dsiBios9Uri);
    if (dsiFirmwareUri) env->DeleteLocalRef(dsiFirmwareUri);
    if (dsiNandUri) env->DeleteLocalRef(dsiNandUri);
    if (internalFilesDir) env->DeleteLocalRef(internalFilesDir);
    if (consoleTypeEnum) env->DeleteLocalRef(consoleTypeEnum);
    if (audioInterpolationEnum) env->DeleteLocalRef(audioInterpolationEnum);
    if (audioBitrateEnum) env->DeleteLocalRef(audioBitrateEnum);
    if (audioLatencyEnum) env->DeleteLocalRef(audioLatencyEnum);
    if (micSourceEnum) env->DeleteLocalRef(micSourceEnum);
    if (videoRendererEnum) env->DeleteLocalRef(videoRendererEnum);
    if (renderConfigurationClass) env->DeleteLocalRef(renderConfigurationClass);
    if (videoRendererEnumClass) env->DeleteLocalRef(videoRendererEnumClass);
    if (micSourceEnumClass) env->DeleteLocalRef(micSourceEnumClass);
    if (audioLatencyEnumClass) env->DeleteLocalRef(audioLatencyEnumClass);
    if (audioInterpolationEnumClass) env->DeleteLocalRef(audioInterpolationEnumClass);
    if (audioBitrateEnumClass) env->DeleteLocalRef(audioBitrateEnumClass);
    if (consoleTypeEnumClass) env->DeleteLocalRef(consoleTypeEnumClass);
    if (uriClass) env->DeleteLocalRef(uriClass);
    if (emulatorConfigurationClass) env->DeleteLocalRef(emulatorConfigurationClass);

    return finalEmulatorConfiguration;
}

MelonDSAndroid::FirmwareConfiguration MelonDSAndroidConfiguration::buildFirmwareConfiguration(JNIEnv* env, jobject firmwareConfiguration) {
    if (env == nullptr || firmwareConfiguration == nullptr)
        return MelonDSAndroid::FirmwareConfiguration{};

    jclass firmwareConfigurationClass = env->GetObjectClass(firmwareConfiguration);
    if (firmwareConfigurationClass == nullptr || env->ExceptionCheck())
    {
        env->ExceptionClear();
        return MelonDSAndroid::FirmwareConfiguration{};
    }

    jstring nicknameString = static_cast<jstring>(getOptionalObjectField(env, firmwareConfiguration, firmwareConfigurationClass, "nickname", "Ljava/lang/String;"));
    jstring messageString = static_cast<jstring>(getOptionalObjectField(env, firmwareConfiguration, firmwareConfigurationClass, "message", "Ljava/lang/String;"));
    int language = getIntFieldOrDefault(env, firmwareConfiguration, firmwareConfigurationClass, "language", 1);
    int colour = getIntFieldOrDefault(env, firmwareConfiguration, firmwareConfigurationClass, "favouriteColour", 0);
    int birthdayDay = getIntFieldOrDefault(env, firmwareConfiguration, firmwareConfigurationClass, "birthdayDay", 1);
    int birthdayMonth = getIntFieldOrDefault(env, firmwareConfiguration, firmwareConfigurationClass, "birthdayMonth", 1);
    bool randomizeMacAddress = getBooleanFieldOrDefault(env, firmwareConfiguration, firmwareConfigurationClass, "randomizeMacAddress", JNI_FALSE) != 0;
    jstring macAddressString = static_cast<jstring>(getOptionalObjectField(env, firmwareConfiguration, firmwareConfigurationClass, "internalMacAddress", "Ljava/lang/String;"));

    const char* nickname = nicknameString ? env->GetStringUTFChars(nicknameString, nullptr) : nullptr;
    const char* message = messageString ? env->GetStringUTFChars(messageString, nullptr) : nullptr;
    const char* macAddress = macAddressString ? env->GetStringUTFChars(macAddressString, nullptr) : nullptr;

    const char* safeNickname = nickname ? nickname : "";
    const char* safeMessage = message ? message : "";

    MelonDSAndroid::FirmwareConfiguration finalFirmwareConfiguration;
    strncpy(finalFirmwareConfiguration.username, safeNickname, sizeof(finalFirmwareConfiguration.username) - 1);
    strncpy(finalFirmwareConfiguration.message, safeMessage, sizeof(finalFirmwareConfiguration.message) - 1);
    finalFirmwareConfiguration.username[sizeof(finalFirmwareConfiguration.username) - 1] = '\0';
    finalFirmwareConfiguration.message[sizeof(finalFirmwareConfiguration.message) - 1] = '\0';
    finalFirmwareConfiguration.language = language;
    finalFirmwareConfiguration.favouriteColour = colour;
    finalFirmwareConfiguration.birthdayDay = birthdayDay;
    finalFirmwareConfiguration.birthdayMonth = birthdayMonth;
    finalFirmwareConfiguration.randomizeMacAddress = randomizeMacAddress;
    if (macAddress != nullptr)
    {
        strncpy(finalFirmwareConfiguration.macAddress, macAddress, sizeof(finalFirmwareConfiguration.macAddress) - 1);
        finalFirmwareConfiguration.macAddress[sizeof(finalFirmwareConfiguration.macAddress) - 1] = '\0';
    }
    else
    {
        finalFirmwareConfiguration.macAddress[0] = '\0';
    }

    if (nicknameString && nickname) env->ReleaseStringUTFChars(nicknameString, nickname);
    if (messageString && message) env->ReleaseStringUTFChars(messageString, message);
    if (macAddressString && macAddress) env->ReleaseStringUTFChars(macAddressString, macAddress);
    if (nicknameString) env->DeleteLocalRef(nicknameString);
    if (messageString) env->DeleteLocalRef(messageString);
    if (macAddressString) env->DeleteLocalRef(macAddressString);
    if (firmwareConfigurationClass) env->DeleteLocalRef(firmwareConfigurationClass);

    return finalFirmwareConfiguration;
}

std::unique_ptr<MelonDSAndroid::RenderSettings> MelonDSAndroidConfiguration::buildRenderSettings(JNIEnv* env, MelonDSAndroid::Renderer renderer, jobject renderSettings) {
    jclass renderSettingsClass = (env != nullptr && renderSettings != nullptr) ? env->GetObjectClass(renderSettings) : nullptr;
    if (env != nullptr && env->ExceptionCheck())
    {
        env->ExceptionClear();
        renderSettingsClass = nullptr;
    }

    jmethodID getResolutionScalingMethod = getMethodIdOrClear(env, renderSettingsClass, "getResolutionScaling", "()I");
    jboolean threadedRendering = getBooleanFieldOrDefault(env, renderSettings, renderSettingsClass, "threadedRendering", JNI_FALSE);
    jboolean rendererDebugToolsEnabled = getBooleanFieldOrDefault(env, renderSettings, renderSettingsClass, "rendererDebugToolsEnabled", JNI_FALSE);
    jboolean rendererDebugBgObjEnabled = getBooleanFieldOrDefault(env, renderSettings, renderSettingsClass, "rendererDebugBgObjEnabled", JNI_FALSE);
    jboolean rendererDebugLatchTraceEnabled = getBooleanFieldOrDefault(env, renderSettings, renderSettingsClass, "rendererDebugLatchTraceEnabled", JNI_FALSE);
    jboolean conservativeCoverageEnabled = getBooleanFieldOrDefault(env, renderSettings, renderSettingsClass, "conservativeCoverageEnabled", JNI_FALSE);
    jfloat conservativeCoveragePx = getFloatFieldOrDefault(env, renderSettings, renderSettingsClass, "conservativeCoveragePx", 0.0f);
    jfloat conservativeCoverageDepthBias = getFloatFieldOrDefault(env, renderSettings, renderSettingsClass, "conservativeCoverageDepthBias", 0.0f);
    jboolean conservativeCoverageApplyRepeat = getBooleanFieldOrDefault(env, renderSettings, renderSettingsClass, "conservativeCoverageApplyRepeat", JNI_FALSE);
    jboolean conservativeCoverageApplyClamp = getBooleanFieldOrDefault(env, renderSettings, renderSettingsClass, "conservativeCoverageApplyClamp", JNI_FALSE);
    jboolean debug3dClearMagenta = getBooleanFieldOrDefault(env, renderSettings, renderSettingsClass, "debug3dClearMagenta", JNI_FALSE);
    jobject videoFilteringObject = getOptionalObjectField(env, renderSettings, renderSettingsClass, "videoFiltering", "Lme/magnum/melonds/domain/model/VideoFiltering;");
    jint videoFilteringOrdinal = 0;
    (void)getEnumOrdinal(env, videoFilteringObject, &videoFilteringOrdinal);
    if (videoFilteringObject != nullptr)
        env->DeleteLocalRef(videoFilteringObject);
    jint internalResolutionScaling = 1;
    if (env != nullptr && renderSettings != nullptr && getResolutionScalingMethod != nullptr)
    {
        internalResolutionScaling = env->CallIntMethod(renderSettings, getResolutionScalingMethod);
        if (env->ExceptionCheck())
        {
            env->ExceptionClear();
            internalResolutionScaling = 1;
        }
    }
    if (renderSettingsClass) env->DeleteLocalRef(renderSettingsClass);

    std::unique_ptr<MelonDSAndroid::RenderSettings> settings;
    if (renderer == MelonDSAndroid::Renderer::OpenGl)
    {
        settings = std::make_unique<MelonDSAndroid::OpenGlRenderSettings>(
            MelonDSAndroid::OpenGlRenderSettings {
                .betterPolygons = false,
                .scale = internalResolutionScaling,
                .rendererDebugToolsEnabled = rendererDebugToolsEnabled != 0,
                .rendererDebugBgObjEnabled = rendererDebugBgObjEnabled != 0,
                .rendererDebugLatchTraceEnabled = rendererDebugLatchTraceEnabled != 0,
                .conservativeCoverageEnabled = conservativeCoverageEnabled != 0,
                .conservativeCoveragePx = (float)conservativeCoveragePx,
                .conservativeCoverageDepthBias = (float)conservativeCoverageDepthBias,
                .conservativeCoverageApplyRepeat = conservativeCoverageApplyRepeat != 0,
                .conservativeCoverageApplyClamp = conservativeCoverageApplyClamp != 0,
                .debug3dClearMagenta = debug3dClearMagenta != 0,
            }
        );
    }
    else if (renderer == MelonDSAndroid::Renderer::Vulkan)
    {
        settings = std::make_unique<MelonDSAndroid::VulkanRenderSettings>(
            MelonDSAndroid::VulkanRenderSettings {
                .threadedRendering = true,
                .betterPolygons = true,
                .scale = internalResolutionScaling,
                .rendererDebugToolsEnabled = rendererDebugToolsEnabled != 0,
                .rendererDebugBgObjEnabled = rendererDebugBgObjEnabled != 0,
                .rendererDebugLatchTraceEnabled = rendererDebugLatchTraceEnabled != 0,
                .conservativeCoverageEnabled = conservativeCoverageEnabled != 0,
                .conservativeCoveragePx = (float)conservativeCoveragePx,
                .conservativeCoverageDepthBias = (float)conservativeCoverageDepthBias,
                .conservativeCoverageApplyRepeat = conservativeCoverageApplyRepeat != 0,
                .conservativeCoverageApplyClamp = conservativeCoverageApplyClamp != 0,
                .debug3dClearMagenta = debug3dClearMagenta != 0,
                .videoFiltering = mapVulkanFilterMode(videoFilteringOrdinal),
            }
        );
    }
    else if (renderer == MelonDSAndroid::Renderer::Compute)
    {
        settings = std::make_unique<MelonDSAndroid::ComputeRenderSettings>(
            MelonDSAndroid::ComputeRenderSettings {
                .scale = internalResolutionScaling,
                .highResCoordinates = true,
            }
        );
    }
    else
    {
        settings = std::make_unique<MelonDSAndroid::SoftwareRenderSettings>(
            MelonDSAndroid::SoftwareRenderSettings {
                .threadedRendering = (bool) threadedRendering,
                .rendererDebugToolsEnabled = rendererDebugToolsEnabled != 0,
                .rendererDebugBgObjEnabled = rendererDebugBgObjEnabled != 0,
                .rendererDebugLatchTraceEnabled = rendererDebugLatchTraceEnabled != 0,
            }
        );
    }

    return settings;
}

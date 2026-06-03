#include "RetroAchievementsMapper.h"

namespace {

jfieldID getFieldIdOrNull(JNIEnv* env, jclass sourceClass, const char* fieldName, const char* fieldSignature)
{
    jfieldID fieldId = env->GetFieldID(sourceClass, fieldName, fieldSignature);
    if (fieldId == nullptr || env->ExceptionCheck())
    {
        if (env->ExceptionCheck())
            env->ExceptionClear();
        return nullptr;
    }

    return fieldId;
}

jmethodID getMethodIdOrNull(JNIEnv* env, jclass sourceClass, const char* methodName, const char* methodSignature)
{
    jmethodID methodId = env->GetMethodID(sourceClass, methodName, methodSignature);
    if (methodId == nullptr || env->ExceptionCheck())
    {
        if (env->ExceptionCheck())
            env->ExceptionClear();
        return nullptr;
    }

    return methodId;
}

std::optional<std::string> getOptionalStringField(JNIEnv* env, jobject sourceObject, jfieldID fieldId)
{
    if (fieldId == nullptr)
        return std::nullopt;

    auto value = (jstring) env->GetObjectField(sourceObject, fieldId);
    if (env->ExceptionCheck())
    {
        env->ExceptionClear();
        return std::nullopt;
    }

    if (value == nullptr)
        return std::nullopt;

    const char* valueChars = env->GetStringUTFChars(value, nullptr);
    if (valueChars == nullptr)
    {
        if (env->ExceptionCheck())
            env->ExceptionClear();
        env->DeleteLocalRef(value);
        return std::nullopt;
    }

    std::string result(valueChars);
    env->ReleaseStringUTFChars(value, valueChars);
    env->DeleteLocalRef(value);
    return result;
}

std::optional<long> getOptionalLongField(JNIEnv* env, jobject sourceObject, jfieldID fieldId)
{
    if (fieldId == nullptr)
        return std::nullopt;

    auto value = (jobject) env->GetObjectField(sourceObject, fieldId);
    if (env->ExceptionCheck())
    {
        env->ExceptionClear();
        return std::nullopt;
    }

    if (value == nullptr)
        return std::nullopt;

    jclass longClass = env->GetObjectClass(value);
    if (longClass == nullptr || env->ExceptionCheck())
    {
        if (env->ExceptionCheck())
            env->ExceptionClear();
        env->DeleteLocalRef(value);
        return std::nullopt;
    }

    jmethodID longValueMethod = getMethodIdOrNull(env, longClass, "longValue", "()J");
    if (longValueMethod == nullptr)
    {
        env->DeleteLocalRef(longClass);
        env->DeleteLocalRef(value);
        return std::nullopt;
    }

    long longValue = (long) env->CallLongMethod(value, longValueMethod);
    if (env->ExceptionCheck())
    {
        env->ExceptionClear();
        env->DeleteLocalRef(longClass);
        env->DeleteLocalRef(value);
        return std::nullopt;
    }

    env->DeleteLocalRef(longClass);
    env->DeleteLocalRef(value);
    return longValue;
}

std::optional<MelonDSAndroid::RetroAchievements::RARuntimeBridgeMode> getRuntimeBridgeModeField(JNIEnv* env, jobject sourceObject, jfieldID fieldId)
{
    if (fieldId == nullptr)
        return std::nullopt;

    auto value = (jobject) env->GetObjectField(sourceObject, fieldId);
    if (env->ExceptionCheck())
    {
        env->ExceptionClear();
        return std::nullopt;
    }

    if (value == nullptr)
        return std::nullopt;

    jclass modeClass = env->GetObjectClass(value);
    if (modeClass == nullptr || env->ExceptionCheck())
    {
        if (env->ExceptionCheck())
            env->ExceptionClear();
        env->DeleteLocalRef(value);
        return std::nullopt;
    }

    jfieldID nativeValueField = getFieldIdOrNull(env, modeClass, "nativeValue", "I");
    if (nativeValueField == nullptr)
    {
        env->DeleteLocalRef(modeClass);
        env->DeleteLocalRef(value);
        return std::nullopt;
    }

    const int nativeValue = env->GetIntField(value, nativeValueField);
    env->DeleteLocalRef(modeClass);
    env->DeleteLocalRef(value);

    switch (nativeValue)
    {
        case 1:
            return MelonDSAndroid::RetroAchievements::RARuntimeBridgeMode::RcClientOnline;
        case 2:
            return MelonDSAndroid::RetroAchievements::RARuntimeBridgeMode::RcClientOffline;
        default:
            return std::nullopt;
    }
}

}

void mapAchievementsFromJava(JNIEnv *env, jobjectArray javaAchievements, std::list<MelonDSAndroid::RetroAchievements::RAAchievement> &outputList)
{
    if (javaAchievements == nullptr)
        return;

    jsize achievementCount = env->GetArrayLength(javaAchievements);
    if (achievementCount < 1)
        return;

    jobject firstAchievement = env->GetObjectArrayElement(javaAchievements, 0);
    if (firstAchievement == nullptr || env->ExceptionCheck())
    {
        if (env->ExceptionCheck())
            env->ExceptionClear();
        return;
    }

    jclass achievementClass = env->GetObjectClass(firstAchievement);
    env->DeleteLocalRef(firstAchievement);
    if (achievementClass == nullptr || env->ExceptionCheck())
    {
        if (env->ExceptionCheck())
            env->ExceptionClear();
        return;
    }

    jfieldID idField = getFieldIdOrNull(env, achievementClass, "id", "J");
    jfieldID memoryAddressField = getFieldIdOrNull(env, achievementClass, "memoryAddress", "Ljava/lang/String;");
    if (idField == nullptr || memoryAddressField == nullptr)
    {
        env->DeleteLocalRef(achievementClass);
        return;
    }

    for (int i = 0; i < achievementCount; ++i)
    {
        jobject achievement = env->GetObjectArrayElement(javaAchievements, i);
        if (achievement == nullptr || env->ExceptionCheck())
        {
            if (env->ExceptionCheck())
                env->ExceptionClear();
            continue;
        }

        jlong id = env->GetLongField(achievement, idField);
        if (env->ExceptionCheck())
        {
            env->ExceptionClear();
            env->DeleteLocalRef(achievement);
            continue;
        }

        jstring memoryAddress = (jstring) env->GetObjectField(achievement, memoryAddressField);
        if (env->ExceptionCheck())
        {
            env->ExceptionClear();
            env->DeleteLocalRef(achievement);
            continue;
        }

        const char* codeString = memoryAddress ? env->GetStringUTFChars(memoryAddress, nullptr) : nullptr;
        if (codeString == nullptr)
        {
            if (env->ExceptionCheck())
                env->ExceptionClear();
            if (memoryAddress) env->DeleteLocalRef(memoryAddress);
            env->DeleteLocalRef(achievement);
            continue;
        }

        MelonDSAndroid::RetroAchievements::RAAchievement internalAchievement = {
            .id = (long) id,
            .memoryAddress = std::string(codeString),
        };

        env->ReleaseStringUTFChars(memoryAddress, codeString);

        outputList.push_back(internalAchievement);
        env->DeleteLocalRef(memoryAddress);
        env->DeleteLocalRef(achievement);
    }

    env->DeleteLocalRef(achievementClass);
}

std::optional<MelonDSAndroid::RetroAchievements::RARuntimeBridgeConfig> mapRuntimeBridgeConfigFromJava(JNIEnv* env, jobject javaRuntimeConfig)
{
    if (javaRuntimeConfig == nullptr)
        return std::nullopt;

    jclass runtimeConfigClass = env->GetObjectClass(javaRuntimeConfig);
    if (runtimeConfigClass == nullptr || env->ExceptionCheck())
    {
        if (env->ExceptionCheck())
            env->ExceptionClear();
        return std::nullopt;
    }
    jfieldID runtimeModeField = getFieldIdOrNull(env, runtimeConfigClass, "runtimeMode", "Lme/magnum/melonds/domain/model/retroachievements/RARuntimeBridgeMode;");
    jfieldID userAgentField = getFieldIdOrNull(env, runtimeConfigClass, "userAgent", "Ljava/lang/String;");
    jfieldID usernameField = getFieldIdOrNull(env, runtimeConfigClass, "username", "Ljava/lang/String;");
    jfieldID apiTokenField = getFieldIdOrNull(env, runtimeConfigClass, "apiToken", "Ljava/lang/String;");
    jfieldID gameHashField = getFieldIdOrNull(env, runtimeConfigClass, "gameHash", "Ljava/lang/String;");
    jfieldID gameIdField = getFieldIdOrNull(env, runtimeConfigClass, "gameId", "Ljava/lang/Long;");
    jfieldID hardcoreEnabledField = getFieldIdOrNull(env, runtimeConfigClass, "hardcoreEnabled", "Z");
    jfieldID unofficialEnabledField = getFieldIdOrNull(env, runtimeConfigClass, "unofficialEnabled", "Z");
    jfieldID encoreEnabledField = getFieldIdOrNull(env, runtimeConfigClass, "encoreEnabled", "Z");

    if (runtimeModeField == nullptr ||
        userAgentField == nullptr ||
        usernameField == nullptr ||
        apiTokenField == nullptr ||
        gameHashField == nullptr ||
        gameIdField == nullptr ||
        hardcoreEnabledField == nullptr ||
        unofficialEnabledField == nullptr ||
        encoreEnabledField == nullptr)
    {
        env->DeleteLocalRef(runtimeConfigClass);
        return std::nullopt;
    }

    auto runtimeMode = getRuntimeBridgeModeField(env, javaRuntimeConfig, runtimeModeField);
    if (!runtimeMode.has_value())
    {
        env->DeleteLocalRef(runtimeConfigClass);
        return std::nullopt;
    }

    MelonDSAndroid::RetroAchievements::RARuntimeBridgeConfig runtimeBridgeConfig = {
        .runtimeMode = runtimeMode.value(),
        .hardcoreEnabled = env->GetBooleanField(javaRuntimeConfig, hardcoreEnabledField) == JNI_TRUE,
        .unofficialEnabled = env->GetBooleanField(javaRuntimeConfig, unofficialEnabledField) == JNI_TRUE,
        .encoreEnabled = env->GetBooleanField(javaRuntimeConfig, encoreEnabledField) == JNI_TRUE,
        .gameId = getOptionalLongField(env, javaRuntimeConfig, gameIdField).value_or(0),
        .userAgent = getOptionalStringField(env, javaRuntimeConfig, userAgentField).value_or(""),
        .username = getOptionalStringField(env, javaRuntimeConfig, usernameField).value_or(""),
        .apiToken = getOptionalStringField(env, javaRuntimeConfig, apiTokenField).value_or(""),
        .gameHash = getOptionalStringField(env, javaRuntimeConfig, gameHashField).value_or(""),
    };

    env->DeleteLocalRef(runtimeConfigClass);
    return runtimeBridgeConfig;
}

void mapLeaderboardsFromJava(JNIEnv *env, jobjectArray javaLeaderboards, std::list<MelonDSAndroid::RetroAchievements::RALeaderboard> &outputList)
{
    if (javaLeaderboards == nullptr)
        return;

    jsize leaderboardsCount = env->GetArrayLength(javaLeaderboards);
    if (leaderboardsCount < 1)
        return;

    jobject firstLeaderboard = env->GetObjectArrayElement(javaLeaderboards, 0);
    if (firstLeaderboard == nullptr || env->ExceptionCheck())
    {
        if (env->ExceptionCheck())
            env->ExceptionClear();
        return;
    }

    jclass leaderboardClass = env->GetObjectClass(firstLeaderboard);
    env->DeleteLocalRef(firstLeaderboard);
    if (leaderboardClass == nullptr || env->ExceptionCheck())
    {
        if (env->ExceptionCheck())
            env->ExceptionClear();
        return;
    }

    jfieldID idField = getFieldIdOrNull(env, leaderboardClass, "id", "J");
    jfieldID memoryAddressField = getFieldIdOrNull(env, leaderboardClass, "memoryAddress", "Ljava/lang/String;");
    jfieldID formatField = getFieldIdOrNull(env, leaderboardClass, "format", "Ljava/lang/String;");
    if (idField == nullptr || memoryAddressField == nullptr || formatField == nullptr)
    {
        env->DeleteLocalRef(leaderboardClass);
        return;
    }

    for (int i = 0; i < leaderboardsCount; ++i)
    {
        jobject leaderboard = env->GetObjectArrayElement(javaLeaderboards, i);
        if (leaderboard == nullptr || env->ExceptionCheck())
        {
            if (env->ExceptionCheck())
                env->ExceptionClear();
            continue;
        }

        jlong id = env->GetLongField(leaderboard, idField);
        if (env->ExceptionCheck())
        {
            env->ExceptionClear();
            env->DeleteLocalRef(leaderboard);
            continue;
        }

        jstring memoryAddress = (jstring) env->GetObjectField(leaderboard, memoryAddressField);
        if (env->ExceptionCheck())
        {
            env->ExceptionClear();
            env->DeleteLocalRef(leaderboard);
            continue;
        }

        jstring format = (jstring) env->GetObjectField(leaderboard, formatField);
        if (env->ExceptionCheck())
        {
            env->ExceptionClear();
            if (memoryAddress) env->DeleteLocalRef(memoryAddress);
            env->DeleteLocalRef(leaderboard);
            continue;
        }

        const char* codeString = memoryAddress ? env->GetStringUTFChars(memoryAddress, nullptr) : nullptr;
        const char* formatString = format ? env->GetStringUTFChars(format, nullptr) : nullptr;
        if (codeString == nullptr || formatString == nullptr)
        {
            if (env->ExceptionCheck())
                env->ExceptionClear();
            if (codeString) env->ReleaseStringUTFChars(memoryAddress, codeString);
            if (formatString) env->ReleaseStringUTFChars(format, formatString);
            if (memoryAddress) env->DeleteLocalRef(memoryAddress);
            if (format) env->DeleteLocalRef(format);
            env->DeleteLocalRef(leaderboard);
            continue;
        }

        MelonDSAndroid::RetroAchievements::RALeaderboard internalLeaderboard = {
            .id = (long) id,
            .memoryAddress = codeString,
            .format = formatString,
        };

        env->ReleaseStringUTFChars(memoryAddress, codeString);
        env->ReleaseStringUTFChars(format, formatString);

        outputList.push_back(internalLeaderboard);
        env->DeleteLocalRef(memoryAddress);
        env->DeleteLocalRef(format);
        env->DeleteLocalRef(leaderboard);
    }

    env->DeleteLocalRef(leaderboardClass);
}

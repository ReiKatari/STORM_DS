#ifndef RETROACHIEVEMENTSMAPPER_H
#define RETROACHIEVEMENTSMAPPER_H

#include <jni.h>
#include <list>
#include <optional>
#include "retroachievements/RAAchievement.h"
#include "retroachievements/RALeaderboard.h"
#include "retroachievements/RARuntimeBridgeConfig.h"

void mapAchievementsFromJava(JNIEnv *env, jobjectArray javaAchievements, std::list<MelonDSAndroid::RetroAchievements::RAAchievement> &outputList);
void mapLeaderboardsFromJava(JNIEnv *env, jobjectArray javaLeaderboards, std::list<MelonDSAndroid::RetroAchievements::RALeaderboard> &outputList);
std::optional<MelonDSAndroid::RetroAchievements::RARuntimeBridgeConfig> mapRuntimeBridgeConfigFromJava(JNIEnv *env, jobject javaRuntimeConfig);

#endif //RETROACHIEVEMENTSMAPPER_H

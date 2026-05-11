#ifndef RARUNTIMEBRIDGECONFIG_H
#define RARUNTIMEBRIDGECONFIG_H

#include <string>

namespace MelonDSAndroid
{
namespace RetroAchievements
{

typedef struct RARuntimeBridgeConfig
{
    bool useRcClientRuntime;
    bool hardcoreEnabled;
    bool unofficialEnabled;
    bool encoreEnabled;
    long gameId;
    std::string userAgent;
    std::string username;
    std::string apiToken;
    std::string gameHash;
} RARuntimeBridgeConfig;

}
}

#endif //RARUNTIMEBRIDGECONFIG_H

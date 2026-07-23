#ifndef RARUNTIMEBRIDGECONFIG_H
#define RARUNTIMEBRIDGECONFIG_H

#include <cstdint>
#include <string>

namespace MelonDSAndroid
{
namespace RetroAchievements
{

enum class RARuntimeBridgeMode
{
    RcClientOnline = 1,
    RcClientOffline = 2,
};

typedef struct RARuntimeBridgeConfig
{
    RARuntimeBridgeMode runtimeMode;
    bool hardcoreEnabled;
    bool unofficialEnabled;
    bool encoreEnabled;
    bool usesProxyHost;
    long gameId;
    uint64_t submissionSessionId;
    uint64_t endpointGeneration;
    std::string userAgent;
    std::string username;
    std::string apiToken;
    std::string gameHash;
    std::string apiHost;
} RARuntimeBridgeConfig;

}
}

#endif //RARUNTIMEBRIDGECONFIG_H

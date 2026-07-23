#ifndef LEADERBOARDSCOREBOARDRESPONSE_H
#define LEADERBOARDSCOREBOARDRESPONSE_H

#include "rc_api_runtime.h"
#include "rc_client.h"
#include "rc_client_internal.h"
#include "rc_runtime_types.h"

#include <stdint.h>
#include <string.h>

typedef struct MelonDSAndroidLeaderboardScoreboardResponse
{
    char submittedScore[RC_CLIENT_LEADERBOARD_DISPLAY_SIZE];
    char bestScore[RC_CLIENT_LEADERBOARD_DISPLAY_SIZE];
    uint32_t newRank;
    uint32_t numEntries;
} MelonDSAndroidLeaderboardScoreboardResponse;

static inline int MelonDSAndroidGetRcClientLeaderboardFormat(
    const rc_client_t* client,
    uint32_t leaderboardId,
    int* outputFormat
)
{
    const rc_client_subset_info_t* subset;

    if (!client || !client->game || !outputFormat)
        return 0;

    for (subset = client->game->subsets; subset; subset = subset->next)
    {
        uint32_t index;
        for (index = 0; index < subset->public_.num_leaderboards; ++index)
        {
            const rc_client_leaderboard_info_t* leaderboard = &subset->leaderboards[index];
            if (leaderboard->public_.id == leaderboardId)
            {
                *outputFormat = leaderboard->format;
                return 1;
            }
        }
    }

    return 0;
}

static inline int MelonDSAndroidParseLeaderboardScoreboardResponse(
    const rc_api_server_response_t* serverResponse,
    const rc_client_t* client,
    uint32_t leaderboardId,
    MelonDSAndroidLeaderboardScoreboardResponse* output
)
{
    rc_api_submit_lboard_entry_response_t response;
    int rcheevosFormat;
    int result;
    int succeeded = 0;

    if (
        !serverResponse ||
        !output ||
        !MelonDSAndroidGetRcClientLeaderboardFormat(client, leaderboardId, &rcheevosFormat)
    )
        return 0;

    memset(output, 0, sizeof(*output));
    result = rc_api_process_submit_lboard_entry_server_response(&response, serverResponse);
    if (result == RC_OK && response.response.succeeded)
    {
        rc_format_value(
            output->submittedScore,
            sizeof(output->submittedScore),
            response.submitted_score,
            rcheevosFormat
        );
        rc_format_value(
            output->bestScore,
            sizeof(output->bestScore),
            response.best_score,
            rcheevosFormat
        );
        output->newRank = response.new_rank;
        output->numEntries = response.num_entries;
        succeeded = 1;
    }

    rc_api_destroy_submit_lboard_entry_response(&response);
    return succeeded;
}

static inline int MelonDSAndroidShouldPublishLeaderboardScoreboardFallback(
    int responseParsed,
    int scoreboardSeen,
    int terminal
)
{
    return responseParsed && !scoreboardSeen && !terminal;
}

#endif

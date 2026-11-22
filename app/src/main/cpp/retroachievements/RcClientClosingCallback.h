#ifndef RC_CLIENT_CLOSING_CALLBACK_H
#define RC_CLIENT_CLOSING_CALLBACK_H

#include "rc_client.h"

static inline void rc_client_deliver_terminal_callback(
    rc_client_server_callback_t callback,
    void* callback_data)
{
    if (!callback)
        return;

    static const char terminal_body[] = "RetroAchievements transport closed";
    rc_api_server_response_t terminal_response;
    terminal_response.body = terminal_body;
    terminal_response.body_length = sizeof(terminal_body) - 1;
    terminal_response.http_status_code = RC_API_SERVER_RESPONSE_CLIENT_ERROR;
    callback(&terminal_response, callback_data);
}

#endif

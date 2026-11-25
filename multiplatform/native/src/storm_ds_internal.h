#pragma once

#include <cstdint>

namespace StormDS::Internal
{

void OnWriteNDSSave(void* userdata, const uint8_t* savedata, uint32_t savelen, uint32_t writeoffset, uint32_t writelen);
void OnWriteGBASave(void* userdata, const uint8_t* savedata, uint32_t savelen, uint32_t writeoffset, uint32_t writelen);
int OnMicReadInput(void* userdata, int16_t* data, int maxlength);
bool OnAddonKeyDown(void* userdata, int keyType);
float OnAddonMotionQuery(void* userdata, int motionQueryType);

}

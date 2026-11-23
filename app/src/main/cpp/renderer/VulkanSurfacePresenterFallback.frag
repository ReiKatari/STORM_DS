#version 450

layout(set = 0, binding = 0) uniform sampler2D uTexture;

layout(push_constant) uniform PresenterPushConstants
{
    uint drawMode;
    uint scale;
    uint rendererWidth;
    uint rendererHeight;
    uint packedStride;
    uint screenSwap;
    uint filtering;
    uint previousTopSourceValid;
    uint previousBottomSourceValid;
    uint captureSourceValid;
    uint captureSourceScreenSwapValid;
    uint captureSourceScreenSwap;
    uint liveSourceScreenSwap;
    uint class4VramStructuredPair;
    uint class4NoAboveVramStructuredPair;
    uint class4PreservePackedVramValid;
    uint class4PreservePackedVramScreenSwap;
    uint topStructuredHandoffNoCurrent3d;
    uint bottomStructuredHandoffNoCurrent3d;
    uint topStructuredHandoffSuppress3d;
    uint bottomStructuredHandoffSuppress3d;
    float viewportWidth;
    float viewportHeight;
} pushConstants;

const uint kFilterQuilez = 5u;
const uint kFilterLcd = 6u;
const uint kFilterScanlines = 7u;

layout(location = 0) in vec2 inFragUv;
layout(location = 1) in float fragAlpha;

layout(location = 0) out vec4 outColor;

vec4 screenUvBounds(bool topScreen)
{
    float gapUv = 1.0 / 386.0;
    float minY = topScreen ? 0.0 : (0.5 + gapUv);
    float maxY = topScreen ? (0.5 - gapUv) : 1.0;
    return vec4(0.0, minY, 1.0, maxY);
}

vec2 clampCompositeUvToScreen(vec2 uv, bool topScreen)
{
    uint safeScale = max(pushConstants.scale, 1u);
    vec2 texel = vec2(1.0 / float(256u * safeScale), 1.0 / float(386u * safeScale));
    vec4 bounds = screenUvBounds(topScreen);
    return vec2(
        clamp(uv.x, texel.x * 0.5, 1.0 - texel.x * 0.5),
        clamp(uv.y, bounds.y + texel.y * 0.5, bounds.w - texel.y * 0.5)
    );
}

vec3 sampleCompositeRgb(vec2 uv, bool topScreen)
{
    return texture(uTexture, clampCompositeUvToScreen(uv, topScreen)).bgr;
}

vec2 screenLocalCoord(vec2 uv, bool topScreen)
{
    vec4 bounds = screenUvBounds(topScreen);
    vec2 clamped = clampCompositeUvToScreen(uv, topScreen);
    return vec2(clamped.x, clamp((clamped.y - bounds.y) / max(bounds.w - bounds.y, 0.0001), 0.0, 1.0));
}

vec2 uvFromScreenLocal(vec2 local, bool topScreen)
{
    vec4 bounds = screenUvBounds(topScreen);
    return vec2(clamp(local.x, 0.0, 1.0), mix(bounds.y, bounds.w, clamp(local.y, 0.0, 1.0)));
}

vec3 filterQuilez(vec2 uv, bool topScreen)
{
    vec2 size = vec2(256.0, 192.0);
    vec2 p = screenLocalCoord(uv, topScreen) * size + vec2(0.5);
    vec2 i = floor(p);
    vec2 f = p - i;
    f = f * f * f * (f * (f * 6.0 - vec2(15.0)) + vec2(10.0));
    return sampleCompositeRgb(uvFromScreenLocal((i + f - vec2(0.5)) / size, topScreen), topScreen);
}

vec3 filterScanlines(vec2 uv, bool topScreen)
{
    vec3 color = sampleCompositeRgb(uv, topScreen);
    vec2 local = screenLocalCoord(uv, topScreen);
    vec2 omega = vec2(3.1415 * 256.0, 2.0 * 3.1415 * 192.0);
    return clamp(color * (0.95 + dot(vec2(0.05, 0.15) * sin(local * omega), vec2(1.0))), 0.0, 1.0);
}

vec3 filterLcd(vec2 uv, bool topScreen)
{
    vec3 color = sampleCompositeRgb(uv, topScreen);
    vec2 angle = screenLocalCoord(uv, topScreen) * (3.141592654 * 2.0 * vec2(256.0, 192.0));
    const vec3 offsets = 3.141592654 * vec3(0.5, 0.5 - (2.0 / 3.0), 0.5 - (4.0 / 3.0));
    float yFactor = (16.0 + sin(angle.y)) / 17.0;
    vec3 xFactors = (4.0 + sin(angle.x + offsets)) / 5.0;
    return clamp(color * yFactor * xFactors, 0.0, 1.0);
}

vec3 applyConsoleColorProfile(vec3 rgb, uint profile)
{
    if (profile == 0u)
        return rgb;
    vec3 c6 = floor(clamp(rgb, 0.0, 1.0) * 63.0 + 0.5) * (1.0 / 63.0);
    float luma = dot(c6, vec3(0.299, 0.587, 0.114));
    if (profile == 1u)
    {
        vec3 warm = pow(max(mix(vec3(luma), c6, 0.80), vec3(0.0)), vec3(1.14)) * vec3(1.03, 1.00, 0.90);
        return clamp(warm, 0.0, 1.0);
    }
    if (profile == 2u)
    {
        vec3 vivid = mix(vec3(luma), c6, 1.18);
        return clamp(mix(vivid, smoothstep(0.0, 1.0, vivid), 0.22) * vec3(0.99, 1.01, 1.03), 0.0, 1.0);
    }
    if (profile == 3u)
    {
        vec3 ips = mix(vec3(luma), pow(max(c6, vec3(0.0)), vec3(0.96)), 1.12);
        return clamp(ips * vec3(1.03, 1.01, 0.96), 0.0, 1.0);
    }
    return rgb;
}

vec3 applyLcdGridEffect(vec3 rgb, vec2 uv, uint lcdGridMode)
{
    if (lcdGridMode == 0u)
        return rgb;
    bool topScreen = (pushConstants.drawMode == 4u || pushConstants.drawMode == 7u)
        ? true
        : ((pushConstants.drawMode == 5u || pushConstants.drawMode == 8u)
            ? false
            : (uv.y < 0.5));
    vec2 localUv = screenLocalCoord(uv, topScreen);
    vec2 cellCoord = localUv * vec2(256.0, 192.0);
    vec2 fw = max(fwidth(cellCoord), vec2(0.0001));
    float visibility = clamp(1.0 - max(fw.x, fw.y) * 1.45, 0.0, 1.0);
    if (visibility <= 0.01)
        return rgb;

    vec2 cell = fract(cellCoord);
    if (lcdGridMode == 1u)
    {
        float gx = smoothstep(0.0, 0.09, cell.x) * (1.0 - smoothstep(0.91, 1.0, cell.x));
        float gy = smoothstep(0.0, 0.10, cell.y) * (1.0 - smoothstep(0.90, 1.0, cell.y));
        float mask = mix(1.0, mix(0.76, 1.04, gx * gy), visibility);
        return clamp(rgb * mask, 0.0, 1.0);
    }
    if (lcdGridMode == 2u)
    {
        float scan = mix(0.82, 1.05, smoothstep(0.0, 0.12, cell.y) * (1.0 - smoothstep(0.88, 1.0, cell.y)));
        float sub = cell.x * 3.0;
        vec3 triad = vec3(
            0.90 + 0.18 * smoothstep(0.0, 0.35, sub) * (1.0 - smoothstep(0.65, 1.15, sub)),
            0.90 + 0.18 * smoothstep(0.85, 1.35, sub) * (1.0 - smoothstep(1.65, 2.15, sub)),
            0.90 + 0.18 * smoothstep(1.85, 2.35, sub) * (1.0 - smoothstep(2.65, 3.0, sub))
        );
        vec3 maskRgb = mix(vec3(1.0), triad * scan, visibility);
        return clamp(rgb * maskRgb, 0.0, 1.0);
    }
    return rgb;
}

void main()
{
    if (pushConstants.drawMode == 0u)
    {
        outColor = vec4(texture(uTexture, inFragUv).rgb, fragAlpha);
        return;
    }

    vec3 rgb;
    if (pushConstants.drawMode == 6u)
    {
        rgb = texture(uTexture, inFragUv).rgb;
    }
    else if (pushConstants.drawMode == 4u || pushConstants.drawMode == 5u)
    {
        bool topScreen = (pushConstants.drawMode == 4u);
        uint fMode = pushConstants.filtering & 0xFFu;
        if (fMode == kFilterQuilez)
            rgb = filterQuilez(inFragUv, topScreen);
        else if (fMode == kFilterLcd)
            rgb = filterLcd(inFragUv, topScreen);
        else if (fMode == kFilterScanlines)
            rgb = filterScanlines(inFragUv, topScreen);
        else
            rgb = sampleCompositeRgb(inFragUv, topScreen);
    }
    else if (pushConstants.drawMode == 7u || pushConstants.drawMode == 8u)
    {
        rgb = sampleCompositeRgb(inFragUv, pushConstants.drawMode == 7u);
    }
    else
    {
        rgb = texture(uTexture, inFragUv).bgr;
    }

    uint colorProfile = (pushConstants.filtering >> 11u) & 0x7u;
    uint lcdGridMode = (pushConstants.filtering >> 21u) & 0x3u;
    if (colorProfile == 0u && lcdGridMode == 0u)
    {
        outColor = vec4(rgb, fragAlpha);
        return;
    }
    rgb = applyConsoleColorProfile(rgb, colorProfile);
    rgb = applyLcdGridEffect(rgb, inFragUv, lcdGridMode);
    outColor = vec4(rgb, fragAlpha);
}

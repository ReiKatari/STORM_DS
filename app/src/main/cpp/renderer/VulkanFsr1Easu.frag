#version 450

// AMD FidelityFX Super Resolution 1.0 - EASU (Edge-Adaptive Spatial Upsampling)
// Adapted for Nintendo DS / DSi dual-screen vertical atlas with seam isolation.

layout(location = 0) in vec2 texcoord;
layout(location = 0) out vec4 out_color;

layout(set = 0, binding = 0) uniform sampler2D uInputTexture;

layout(push_constant) uniform PushConstants {
    vec4 inputSize;   // xy: input w, h; zw: 1/w, 1/h
    vec4 outputSize;  // xy: output w, h; zw: 1/w, 1/h
    vec4 params;      // x: sharpness, y: swapBgrToRgb (1.0 = swap), z: jitterX, w: jitterY
};

vec3 fetchRgbClamped(ivec2 coord, ivec2 texSize, int minY, int maxY, bool swapBgr)
{
    ivec2 c = ivec2(clamp(coord.x, 0, texSize.x - 1), clamp(coord.y, minY, maxY));
    vec3 s = texelFetch(uInputTexture, c, 0).rgb;
    return swapBgr ? s.bgr : s;
}

float lumaFast(vec3 c)
{
    return c.g + 0.5 * (c.r + c.b);
}

void easuTap(
    inout vec3 aC,
    inout float aW,
    vec2 off,
    vec2 dir,
    vec2 len,
    float lob,
    float clp,
    vec3 c
)
{
    vec2 v;
    v.x = (off.x * dir.x) + (off.y * dir.y);
    v.y = (off.x * (-dir.y)) + (off.y * dir.x);
    v *= len;
    float d2 = min(dot(v, v), clp);
    float wB = 0.4 * d2 - 1.0;
    float wA = lob * d2 - 1.0;
    wB *= wB;
    wA *= wA;
    wB = (25.0 / 16.0) * wB - (25.0 / 16.0 - 1.0);
    float w = wB * wA;
    aC += c * w;
    aW += w;
}

void easuSet(
    inout vec2 dir,
    inout float len,
    vec2 pp,
    bool biS, bool biT, bool biU, bool biV,
    float lA, float lB, float lC, float lD, float lE
)
{
    float w = 0.0;
    if (biS) w = (1.0 - pp.x) * (1.0 - pp.y);
    if (biT) w = pp.x * (1.0 - pp.y);
    if (biU) w = (1.0 - pp.x) * pp.y;
    if (biV) w = pp.x * pp.y;

    float dc = lD - lC;
    float cb = lC - lB;
    float lenX = max(abs(dc), abs(cb));
    lenX = (lenX > 1e-5) ? (1.0 / lenX) : 0.0;
    float dirX = lD - lB;
    dir.x += dirX * w;
    lenX = clamp(abs(dirX) * lenX, 0.0, 1.0);
    lenX *= lenX;
    len += lenX * w;

    float ec = lE - lC;
    float ca = lC - lA;
    float lenY = max(abs(ec), abs(ca));
    lenY = (lenY > 1e-5) ? (1.0 / lenY) : 0.0;
    float dirY = lE - lA;
    dir.y += dirY * w;
    lenY = clamp(abs(dirY) * lenY, 0.0, 1.0);
    lenY *= lenY;
    len += lenY * w;
}

void main()
{
    ivec2 texSize = max(ivec2(inputSize.xy + 0.5), ivec2(2, 2));
    int halfH = max(texSize.y / 2, 1);
    bool swapBgr = params.y > 0.5;

    vec2 ppExact = texcoord * inputSize.xy - vec2(0.5);
    bool isBottomScreen = (texcoord.y >= 0.5) && (texSize.y >= 4);
    int minY = isBottomScreen ? halfH : 0;
    int maxY = isBottomScreen ? (texSize.y - 1) : (halfH - 1);

    vec2 fp = floor(ppExact);
    vec2 pp = ppExact - fp;
    ivec2 base = ivec2(fp);

    // 12-tap cross pattern matching FidelityFX EASU footprint:
    //      b c
    //    e f g h
    //    i j k l
    //      n o
    vec3 rgbB = fetchRgbClamped(base + ivec2( 0, -1), texSize, minY, maxY, swapBgr);
    vec3 rgbC = fetchRgbClamped(base + ivec2( 1, -1), texSize, minY, maxY, swapBgr);
    vec3 rgbE = fetchRgbClamped(base + ivec2(-1,  0), texSize, minY, maxY, swapBgr);
    vec3 rgbF = fetchRgbClamped(base + ivec2( 0,  0), texSize, minY, maxY, swapBgr);
    vec3 rgbG = fetchRgbClamped(base + ivec2( 1,  0), texSize, minY, maxY, swapBgr);
    vec3 rgbH = fetchRgbClamped(base + ivec2( 2,  0), texSize, minY, maxY, swapBgr);
    vec3 rgbI = fetchRgbClamped(base + ivec2(-1,  1), texSize, minY, maxY, swapBgr);
    vec3 rgbJ = fetchRgbClamped(base + ivec2( 0,  1), texSize, minY, maxY, swapBgr);
    vec3 rgbK = fetchRgbClamped(base + ivec2( 1,  1), texSize, minY, maxY, swapBgr);
    vec3 rgbL = fetchRgbClamped(base + ivec2( 2,  1), texSize, minY, maxY, swapBgr);
    vec3 rgbN = fetchRgbClamped(base + ivec2( 0,  2), texSize, minY, maxY, swapBgr);
    vec3 rgbO = fetchRgbClamped(base + ivec2( 1,  2), texSize, minY, maxY, swapBgr);

    float lB = lumaFast(rgbB);
    float lC = lumaFast(rgbC);
    float lE = lumaFast(rgbE);
    float lF = lumaFast(rgbF);
    float lG = lumaFast(rgbG);
    float lH = lumaFast(rgbH);
    float lI = lumaFast(rgbI);
    float lJ = lumaFast(rgbJ);
    float lK = lumaFast(rgbK);
    float lL = lumaFast(rgbL);
    float lN = lumaFast(rgbN);
    float lO = lumaFast(rgbO);

    vec2 dir = vec2(0.0);
    float len = 0.0;
    easuSet(dir, len, pp, true,  false, false, false, lB, lE, lF, lG, lJ);
    easuSet(dir, len, pp, false, true,  false, false, lC, lF, lG, lH, lK);
    easuSet(dir, len, pp, false, false, true,  false, lF, lI, lJ, lK, lN);
    easuSet(dir, len, pp, false, false, false, true,  lG, lJ, lK, lL, lO);

    float dirSq = dot(dir, dir);
    if (dirSq < (1.0 / 32768.0)) {
        dir = vec2(1.0, 0.0);
    } else {
        dir *= inversesqrt(dirSq);
    }

    len = len * 0.5;
    len *= len;
    float stretch = 1.0 / (max(abs(dir.x), abs(dir.y)) + 1e-4);
    vec2 len2 = vec2(1.0 + (stretch - 1.0) * len, 1.0 - 0.5 * len);
    float lob = 0.5 - 0.29 * len;
    float clp = 1.0 / lob;

    vec3 min4 = min(min(rgbF, rgbG), min(rgbJ, rgbK));
    vec3 max4 = max(max(rgbF, rgbG), max(rgbJ, rgbK));

    vec3 aC = vec3(0.0);
    float aW = 0.0;
    easuTap(aC, aW, vec2( 0.0, -1.0) - pp, dir, len2, lob, clp, rgbB);
    easuTap(aC, aW, vec2( 1.0, -1.0) - pp, dir, len2, lob, clp, rgbC);
    easuTap(aC, aW, vec2(-1.0,  0.0) - pp, dir, len2, lob, clp, rgbE);
    easuTap(aC, aW, vec2( 0.0,  0.0) - pp, dir, len2, lob, clp, rgbF);
    easuTap(aC, aW, vec2( 1.0,  0.0) - pp, dir, len2, lob, clp, rgbG);
    easuTap(aC, aW, vec2( 2.0,  0.0) - pp, dir, len2, lob, clp, rgbH);
    easuTap(aC, aW, vec2(-1.0,  1.0) - pp, dir, len2, lob, clp, rgbI);
    easuTap(aC, aW, vec2( 0.0,  1.0) - pp, dir, len2, lob, clp, rgbJ);
    easuTap(aC, aW, vec2( 1.0,  1.0) - pp, dir, len2, lob, clp, rgbK);
    easuTap(aC, aW, vec2( 2.0,  1.0) - pp, dir, len2, lob, clp, rgbL);
    easuTap(aC, aW, vec2( 0.0,  2.0) - pp, dir, len2, lob, clp, rgbN);
    easuTap(aC, aW, vec2( 1.0,  2.0) - pp, dir, len2, lob, clp, rgbO);

    vec3 color = (aW > 1e-5) ? clamp(aC / aW, min4, max4) : rgbF;
    out_color = vec4(clamp(color, 0.0, 1.0), 1.0);
}

#version 450

#ifndef MELONDS_NO_FRAG_DEPTH
#define MELONDS_NO_FRAG_DEPTH 0
#endif

#ifndef MELONDS_DIRECT_TEXTURE_INDEXING
#define MELONDS_DIRECT_TEXTURE_INDEXING 0
#endif

#ifndef MELONDS_FAST_OPAQUE_MODULATE
#define MELONDS_FAST_OPAQUE_MODULATE 0
#endif

#ifndef MELONDS_FAST_TOON_MODE
#define MELONDS_FAST_TOON_MODE 0
#endif

#ifndef MELONDS_FAST_TEXTURE_PUSH_CONSTANTS
#define MELONDS_FAST_TEXTURE_PUSH_CONSTANTS 0
#endif

#ifndef MELONDS_FAST_OPAQUE_FULL_ALPHA
#define MELONDS_FAST_OPAQUE_FULL_ALPHA 0
#endif

const uint MAX_TEXTURE_DESCRIPTORS = 14u;

layout(constant_id = 0) const uint DEPTH_INTERPOLATION_MODE = 0u;
layout(constant_id = 1) const uint TRANSLUCENT_PASS = 0u;
layout(constant_id = 2) const uint EDGE_MARK_PASS = 0u;

layout(set = 0, binding = 1) uniform usampler2DArray texArrays[MAX_TEXTURE_DESCRIPTORS];

layout(set = 0, binding = 2, std430) readonly buffer ToonTableBuffer
{
    uint toonValues[];
};

layout(push_constant) uniform PushConsts
{
    uint width;
    uint height;
    uint clearColor;
    uint clearDepth;
    uint triangleCount;
    uint dispCnt;
    uint alphaRef;
    uint fogColor;
    uint fogOffset;
    uint fogShift;
    uint clearAttr;
    uint fogDensityPacked[9];
    uint edgeColorPacked[8];
    uint variantKey;
    uint passIndex;
    uint triangleBase;
    uint depthBlendMode;
} pc;

layout(location = 0) smooth in vec3 fColor;
layout(location = 1) smooth in vec2 fTexcoord;
layout(location = 2) noperspective in float fDepthLinear;
layout(location = 3) smooth in float fDepthPerspective;
layout(location = 4) flat in uvec4 fTriInfo0;
layout(location = 5) flat in uvec4 fTriInfo1;

layout(location = 0) out vec4 oColor;
layout(location = 1) out vec4 oAttr;
layout(location = 2) out float oDepthValue;

const uint TRI_FLAG_TEXTURED = 1u << 1u;
const uint TRI_FLAG_DECAL = 1u << 2u;
const uint TRI_FLAG_LINEAR = 1u << 6u;
const float LINEAR_TEXEL_COORD_BIAS = 1.0 / 8.0;

struct Color6A5
{
    int r;
    int g;
    int b;
    int a;
};

int clamp6(int value)
{
    return clamp(value, 0, 63);
}

int clamp5(int value)
{
    return clamp(value, 0, 31);
}

Color6A5 decodeTexelRgb6a5(uvec4 texel)
{
    Color6A5 color;
    color.r = int(texel.r & 0x3Fu);
    color.g = int(texel.g & 0x3Fu);
    color.b = int(texel.b & 0x3Fu);
    color.a = int(texel.a & 0x1Fu);
    return color;
}

Color6A5 decodeTexelRgb6Opaque(uvec4 texel)
{
    Color6A5 color;
    color.r = int(texel.r & 0x3Fu);
    color.g = int(texel.g & 0x3Fu);
    color.b = int(texel.b & 0x3Fu);
    color.a = 31;
    return color;
}

uvec4 fetchTextureArrayTexel(uint descriptorIndex, ivec3 coord)
{
#if MELONDS_DIRECT_TEXTURE_INDEXING != 0
    return texelFetch(texArrays[descriptorIndex], coord, 0);
#else
    switch (descriptorIndex)
    {
        case 0u: return texelFetch(texArrays[0], coord, 0);
        case 1u: return texelFetch(texArrays[1], coord, 0);
        case 2u: return texelFetch(texArrays[2], coord, 0);
        case 3u: return texelFetch(texArrays[3], coord, 0);
        case 4u: return texelFetch(texArrays[4], coord, 0);
        case 5u: return texelFetch(texArrays[5], coord, 0);
        case 6u: return texelFetch(texArrays[6], coord, 0);
        case 7u: return texelFetch(texArrays[7], coord, 0);
        case 8u: return texelFetch(texArrays[8], coord, 0);
        case 9u: return texelFetch(texArrays[9], coord, 0);
        case 10u: return texelFetch(texArrays[10], coord, 0);
        case 11u: return texelFetch(texArrays[11], coord, 0);
        case 12u: return texelFetch(texArrays[12], coord, 0);
        case 13u: return texelFetch(texArrays[13], coord, 0);
        default: return texelFetch(texArrays[13], coord, 0);
    }
#endif
}

int wrapTexelCoord(int coord, int size, bool repeat, bool mirror)
{
    if (size <= 0)
        return 0;

    if (repeat)
    {
        if (mirror)
        {
            if ((coord & size) != 0)
                coord = (size - 1) - (coord & (size - 1));
            else
                coord = coord & (size - 1);
        }
        else
        {
            coord = coord & (size - 1);
        }
    }
    else
    {
        coord = clamp(coord, 0, size - 1);
    }

    return coord;
}

Color6A5 unpackToonColor(uint shadeIndex)
{
    uint clampedIndex = min(shadeIndex, 31u);
    uint packedColor = toonValues[clampedIndex];

    Color6A5 color;
    color.r = int(packedColor & 0x3Fu);
    color.g = int((packedColor >> 8u) & 0x3Fu);
    color.b = int((packedColor >> 16u) & 0x3Fu);
    color.a = 31;
    return color;
}

Color6A5 sampleTexture(uint polyAttr)
{
    Color6A5 whiteTexel;
    whiteTexel.r = 63;
    whiteTexel.g = 63;
    whiteTexel.b = 63;
    whiteTexel.a = 31;

#if MELONDS_FAST_OPAQUE_MODULATE == 0
    uint flags = fTriInfo0.x;
#endif
#if MELONDS_FAST_OPAQUE_MODULATE != 0 && MELONDS_FAST_TEXTURE_PUSH_CONSTANTS != 0
    uint texLayer = pc.variantKey >> 16u;
    uint texArrayIndex = pc.variantKey & 0xFFFFu;
    uint texWidth = pc.passIndex & 0xFFFFu;
    uint texHeight = pc.passIndex >> 16u;
    uint texParam = pc.triangleBase;
#else
    uint texLayer = fTriInfo0.y;
    uint texArrayIndex = fTriInfo0.z;
    uint texWidth = fTriInfo0.w;
    uint texHeight = fTriInfo1.x;
    uint texParam = fTriInfo1.y;
#endif
    vec2 texcoord = fTexcoord;

#if MELONDS_FAST_OPAQUE_MODULATE == 0
    if ((flags & TRI_FLAG_TEXTURED) == 0u
        || texWidth == 0u
        || texHeight == 0u
        || texArrayIndex >= MAX_TEXTURE_DESCRIPTORS)
    {
        return whiteTexel;
    }

#endif

    bool repeatS = (texParam & (1u << 16u)) != 0u;
    bool repeatT = (texParam & (1u << 17u)) != 0u;
    bool mirrorS = (texParam & (1u << 18u)) != 0u;
    bool mirrorT = (texParam & (1u << 19u)) != 0u;

    int sampleS = int(floor(texcoord.x));
    int sampleT = int(floor(texcoord.y));

    sampleS = wrapTexelCoord(sampleS, int(texWidth), repeatS, mirrorS);
    sampleT = wrapTexelCoord(sampleT, int(texHeight), repeatT, mirrorT);

    uvec4 texel = fetchTextureArrayTexel(texArrayIndex, ivec3(sampleS, sampleT, int(texLayer)));
#if MELONDS_FAST_OPAQUE_FULL_ALPHA != 0
    return decodeTexelRgb6Opaque(texel);
#else
    return decodeTexelRgb6a5(texel);
#endif
}

vec4 encodeColor(Color6A5 color)
{
    return vec4(
        float(clamp6(color.r)) * (1.0 / 63.0),
        float(clamp6(color.g)) * (1.0 / 63.0),
        float(clamp6(color.b)) * (1.0 / 63.0),
        float(clamp5(color.a)) * (1.0 / 31.0));
}

vec4 encodeColorDsTranslucentBlendAlpha(Color6A5 color)
{
    return vec4(
        float(clamp6(color.r)) * (1.0 / 63.0),
        float(clamp6(color.g)) * (1.0 / 63.0),
        float(clamp6(color.b)) * (1.0 / 63.0),
        float(clamp(color.a + 1, 0, 32)) * (1.0 / 32.0));
}

void main()
{
#if MELONDS_FAST_OPAQUE_MODULATE == 0
    uint flags = fTriInfo0.x;
#endif
#if MELONDS_FAST_OPAQUE_MODULATE != 0 && MELONDS_FAST_TEXTURE_PUSH_CONSTANTS != 0
    uint polyAttr = pc.depthBlendMode;
#else
    uint polyAttr = fTriInfo1.z;
#endif
    uint polyAlpha = (polyAttr >> 16u) & 0x1Fu;
    uint blendMode = (polyAttr >> 4u) & 0x3u;
    bool highlightEnabled = (pc.dispCnt & (1u << 1u)) != 0u;
#if MELONDS_FAST_OPAQUE_MODULATE == 0
    bool textureMapsEnabled = (pc.dispCnt & (1u << 0u)) != 0u;
#endif

    Color6A5 sourceColor;
    sourceColor.r = clamp6(int(clamp(fColor.r * 63.0 + 0.5, 0.0, 63.0)));
    sourceColor.g = clamp6(int(clamp(fColor.g * 63.0 + 0.5, 0.0, 63.0)));
    sourceColor.b = clamp6(int(clamp(fColor.b * 63.0 + 0.5, 0.0, 63.0)));
#if MELONDS_FAST_OPAQUE_FULL_ALPHA != 0
    sourceColor.a = 31;
#else
    sourceColor.a = clamp5(int(polyAlpha));
#endif

    int highlightShade = sourceColor.r;
#if MELONDS_FAST_OPAQUE_MODULATE != 0 && MELONDS_FAST_TOON_MODE == 1
    Color6A5 toonColor = unpackToonColor(uint(clamp(sourceColor.r >> 1, 0, 31)));
    sourceColor.r = toonColor.r;
    sourceColor.g = toonColor.g;
    sourceColor.b = toonColor.b;
#elif MELONDS_FAST_OPAQUE_MODULATE != 0 && MELONDS_FAST_TOON_MODE == 2
#else
    if (blendMode == 2u)
    {
        if (highlightEnabled)
        {
            sourceColor.g = sourceColor.r;
            sourceColor.b = sourceColor.r;
            highlightShade = sourceColor.r;
        }
        else
        {
            Color6A5 toonColor = unpackToonColor(uint(clamp(sourceColor.r >> 1, 0, 31)));
            sourceColor.r = toonColor.r;
            sourceColor.g = toonColor.g;
            sourceColor.b = toonColor.b;
        }
    }
#endif

#if MELONDS_FAST_OPAQUE_MODULATE != 0
    Color6A5 texelColor = sampleTexture(polyAttr);
    sourceColor.r = clamp6((((texelColor.r + 1) * (sourceColor.r + 1)) - 1) >> 6);
    sourceColor.g = clamp6((((texelColor.g + 1) * (sourceColor.g + 1)) - 1) >> 6);
    sourceColor.b = clamp6((((texelColor.b + 1) * (sourceColor.b + 1)) - 1) >> 6);
#if MELONDS_FAST_OPAQUE_FULL_ALPHA == 0
    sourceColor.a = clamp5((((texelColor.a + 1) * (sourceColor.a + 1)) - 1) >> 5);
#endif
#else
    if (textureMapsEnabled && (flags & TRI_FLAG_TEXTURED) != 0u)
    {
        Color6A5 texelColor = sampleTexture(polyAttr);
        if ((flags & TRI_FLAG_DECAL) != 0u)
        {
            if (texelColor.a >= 31)
            {
                sourceColor.r = texelColor.r;
                sourceColor.g = texelColor.g;
                sourceColor.b = texelColor.b;
            }
            else if (texelColor.a > 0)
            {
                sourceColor.r = clamp6(((texelColor.r * texelColor.a) + (sourceColor.r * (31 - texelColor.a))) >> 5);
                sourceColor.g = clamp6(((texelColor.g * texelColor.a) + (sourceColor.g * (31 - texelColor.a))) >> 5);
                sourceColor.b = clamp6(((texelColor.b * texelColor.a) + (sourceColor.b * (31 - texelColor.a))) >> 5);
            }
        }
        else
        {
            sourceColor.r = clamp6((((texelColor.r + 1) * (sourceColor.r + 1)) - 1) >> 6);
            sourceColor.g = clamp6((((texelColor.g + 1) * (sourceColor.g + 1)) - 1) >> 6);
            sourceColor.b = clamp6((((texelColor.b + 1) * (sourceColor.b + 1)) - 1) >> 6);
            sourceColor.a = clamp5((((texelColor.a + 1) * (sourceColor.a + 1)) - 1) >> 5);
        }
    }
#endif

#if !(MELONDS_FAST_OPAQUE_MODULATE != 0 && MELONDS_FAST_TOON_MODE == 2)
    if (blendMode == 2u && highlightEnabled)
    {
        Color6A5 highlightColor = unpackToonColor(uint(clamp(highlightShade >> 1, 0, 31)));
        sourceColor.r = clamp6(sourceColor.r + highlightColor.r);
        sourceColor.g = clamp6(sourceColor.g + highlightColor.g);
        sourceColor.b = clamp6(sourceColor.b + highlightColor.b);
    }
#endif

#if MELONDS_FAST_OPAQUE_FULL_ALPHA == 0
    if (polyAlpha == 0u)
        sourceColor.a = 31;

    if (sourceColor.a <= int(pc.alphaRef))
        discard;
#endif

    if (EDGE_MARK_PASS != 0u)
    {
        if (sourceColor.a < 31)
            discard;

        oColor = vec4(0.0);
        oAttr = vec4(0.0, 1.0, 0.0, 1.0);

        float edgeDepth = DEPTH_INTERPOLATION_MODE != 0u ? fDepthPerspective : fDepthLinear;
        oDepthValue = edgeDepth;
#if MELONDS_NO_FRAG_DEPTH == 0
        gl_FragDepth = edgeDepth;
#endif
        return;
    }

    if (TRANSLUCENT_PASS != 0u)
    {
        if (sourceColor.a <= 0 || sourceColor.a >= 31)
            discard;

        oColor = encodeColorDsTranslucentBlendAlpha(sourceColor);
        oAttr = vec4(0.0, 0.0, 0.0, 1.0);
    }
    else
    {
#if MELONDS_FAST_OPAQUE_FULL_ALPHA == 0
        if (sourceColor.a < 31)
            discard;
#endif

        uint polyId = (polyAttr >> 24u) & 0x3Fu;
        float fogFlag = ((polyAttr & (1u << 15u)) != 0u) ? 1.0 : 0.0;
        oColor = encodeColor(sourceColor);
        oAttr = vec4(float(polyId) * (1.0 / 63.0), 0.0, fogFlag, 1.0);
    }

    float depth = DEPTH_INTERPOLATION_MODE != 0u ? fDepthPerspective : fDepthLinear;
    oDepthValue = depth;
#if MELONDS_NO_FRAG_DEPTH == 0
    gl_FragDepth = depth;
#endif
}

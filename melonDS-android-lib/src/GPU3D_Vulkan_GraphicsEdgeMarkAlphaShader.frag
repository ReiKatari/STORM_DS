#version 450

const uint MAX_TEXTURE_DESCRIPTORS = 2049u;

const uint TEXTURE_DESCRIPTOR_PAGE_SIZE = 7u;

layout(set = 0, binding = 1) uniform usampler2DArray texArrays[TEXTURE_DESCRIPTOR_PAGE_SIZE];

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

layout(location = 1) smooth in vec2 fTexcoord;
layout(location = 4) flat in uvec4 fTriInfo0;
layout(location = 5) flat in uvec4 fTriInfo1;
layout(location = 6) flat in vec4 fTexcoordBounds;

layout(location = 1) out vec4 oAttr;

const uint TRI_FLAG_TEXTURED = 1u << 1u;
const uint TRI_FLAG_DECAL = 1u << 2u;
const uint TRI_FLAG_LINEAR = 1u << 6u;
const uint TRI_FLAG_TEXTURE_OPAQUE = 1u << 14u;
const uint TRI_FLAG_TEXCOORD_BOUNDS = 1u << 15u;
const uint TRI_FLAG_INTEGRAL_TEXCOORD_S = 1u << 16u;
const uint TRI_FLAG_INTEGRAL_TEXCOORD_T = 1u << 18u;

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

bool usesCompactOpaqueDepthWritePaletteUi(uint flags, uint polyAttr, uint texParam)
{
    uint textureFormat = (texParam >> 26u) & 0x7u;
    uint polyAlpha = (polyAttr >> 16u) & 0x1Fu;
    uint blendMode = (polyAttr >> 4u) & 0x3u;
    bool color0Transparent = (texParam & (1u << 29u)) != 0u;
    bool depthWriteEnabled = (polyAttr & (1u << 11u)) != 0u;
    bool clearAlphaZero = ((pc.clearAttr >> 16u) & 0x1Fu) == 0u;
    bool repeatS = (texParam & (1u << 16u)) != 0u;
    bool repeatT = (texParam & (1u << 17u)) != 0u;
    bool mirrorS = (texParam & (1u << 18u)) != 0u;
    bool mirrorT = (texParam & (1u << 19u)) != 0u;
    bool statusGlyphTexturePage = (texParam & 0xFFFFu) == 0x05C0u;

    return (flags & TRI_FLAG_TEXTURED) != 0u
        && (flags & TRI_FLAG_LINEAR) != 0u
        && textureFormat == 3u
        && color0Transparent
        && statusGlyphTexturePage
        && depthWriteEnabled
        && clearAlphaZero
        && blendMode == 0u
        && polyAlpha == 31u
        && !repeatS
        && !repeatT
        && !mirrorS
        && !mirrorT;
}

vec2 dsPixelCenterDelta()
{
    vec2 renderScale = max(vec2(float(pc.width) * (1.0 / 256.0), float(pc.height) * (1.0 / 192.0)), vec2(1.0));
    vec2 subpixelOffset = mod(gl_FragCoord.xy - vec2(0.5), renderScale);
    vec2 dsPixelCenterOffset = max((renderScale - vec2(1.0)) * 0.5, vec2(0.0));
    return dsPixelCenterOffset - subpixelOffset;
}

uint sampleTextureAlpha()
{
    uint flags = fTriInfo0.x;
    uint texLayer = fTriInfo0.y;
    uint texArrayIndex = fTriInfo0.z;
    uint texWidth = fTriInfo0.w;
    uint texHeight = fTriInfo1.x;
    uint texParam = fTriInfo1.y;
    uint polyAttr = fTriInfo1.z;
    vec2 texcoord = fTexcoord;

    bool repeatS = (texParam & (1u << 16u)) != 0u;
    bool repeatT = (texParam & (1u << 17u)) != 0u;
    bool mirrorS = (texParam & (1u << 18u)) != 0u;
    bool mirrorT = (texParam & (1u << 19u)) != 0u;

    if (usesCompactOpaqueDepthWritePaletteUi(flags, polyAttr, texParam))
    {
        vec2 centerDelta = dsPixelCenterDelta();
        texcoord += dFdx(fTexcoord) * centerDelta.x + dFdy(fTexcoord) * centerDelta.y;
    }


    if ((flags & TRI_FLAG_TEXCOORD_BOUNDS) != 0u)
    {
        vec2 bounded = clamp(texcoord, fTexcoordBounds.xy, fTexcoordBounds.zw);
        uint integralAxes = flags & (TRI_FLAG_INTEGRAL_TEXCOORD_S | TRI_FLAG_INTEGRAL_TEXCOORD_T);
        if (integralAxes != 0u
            && any(notEqual(texcoord, bounded)))
        {
            float grid = float(pc.width) * (1.0 / 8.0);
            vec2 snapped = round(bounded * grid) / grid;
            bounded = mix(bounded, snapped, bvec2((integralAxes & TRI_FLAG_INTEGRAL_TEXCOORD_S) != 0u,
                                                  (integralAxes & TRI_FLAG_INTEGRAL_TEXCOORD_T) != 0u));
        }
        texcoord = bounded;
    }
    int sampleS = wrapTexelCoord(int(floor(texcoord.x)), int(texWidth), repeatS, mirrorS);
    int sampleT = wrapTexelCoord(int(floor(texcoord.y)), int(texHeight), repeatT, mirrorT);
    return texelFetch(texArrays[texArrayIndex % TEXTURE_DESCRIPTOR_PAGE_SIZE], ivec3(sampleS, sampleT, int(texLayer)), 0).a & 0x1Fu;
}

void main()
{
    uint flags = fTriInfo0.x;
    uint texArrayIndex = fTriInfo0.z;
    uint texWidth = fTriInfo0.w;
    uint texHeight = fTriInfo1.x;
    uint polyAttr = fTriInfo1.z;
    uint polyAlpha = (polyAttr >> 16u) & 0x1Fu;

    if (pc.alphaRef >= 31u || polyAlpha != 31u)
        discard;

    bool validTexture = (pc.dispCnt & 1u) != 0u
        && (flags & TRI_FLAG_TEXTURED) != 0u
        && texWidth != 0u
        && texHeight != 0u
        && texArrayIndex < MAX_TEXTURE_DESCRIPTORS;
    if (validTexture
        && (flags & (TRI_FLAG_DECAL | TRI_FLAG_TEXTURE_OPAQUE)) == 0u
        && sampleTextureAlpha() < 31u)
    {
        discard;
    }

    oAttr = vec4(0.0, 0.0, 1.0, 1.0);
}

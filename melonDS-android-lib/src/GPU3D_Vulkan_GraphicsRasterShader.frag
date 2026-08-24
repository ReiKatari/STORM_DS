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

#ifndef MELONDS_FAST_FLOAT_MODULATE
#define MELONDS_FAST_FLOAT_MODULATE 0
#endif

#ifndef MELONDS_COLOR_ONLY
#define MELONDS_COLOR_ONLY 0
#endif

const uint MAX_TEXTURE_DESCRIPTORS = 256u;

layout(constant_id = 0) const uint DEPTH_INTERPOLATION_MODE = 0u;
layout(constant_id = 1) const uint TRANSLUCENT_PASS = 0u;
layout(constant_id = 2) const uint EDGE_MARK_PASS = 0u;

layout(set = 0, binding = 1) uniform usampler2DArray texArrays[MAX_TEXTURE_DESCRIPTORS];
layout(set = 0, binding = 6) uniform sampler2DArray normTexArrays[MAX_TEXTURE_DESCRIPTORS];

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
#if MELONDS_COLOR_ONLY == 0
layout(location = 1) out vec4 oAttr;
#endif

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
        case 14u: return texelFetch(texArrays[14], coord, 0);
        case 15u: return texelFetch(texArrays[15], coord, 0);
        case 16u: return texelFetch(texArrays[16], coord, 0);
        case 17u: return texelFetch(texArrays[17], coord, 0);
        case 18u: return texelFetch(texArrays[18], coord, 0);
        case 19u: return texelFetch(texArrays[19], coord, 0);
        case 20u: return texelFetch(texArrays[20], coord, 0);
        case 21u: return texelFetch(texArrays[21], coord, 0);
        case 22u: return texelFetch(texArrays[22], coord, 0);
        case 23u: return texelFetch(texArrays[23], coord, 0);
        case 24u: return texelFetch(texArrays[24], coord, 0);
        case 25u: return texelFetch(texArrays[25], coord, 0);
        case 26u: return texelFetch(texArrays[26], coord, 0);
        case 27u: return texelFetch(texArrays[27], coord, 0);
        case 28u: return texelFetch(texArrays[28], coord, 0);
        case 29u: return texelFetch(texArrays[29], coord, 0);
        case 30u: return texelFetch(texArrays[30], coord, 0);
        case 31u: return texelFetch(texArrays[31], coord, 0);
        case 32u: return texelFetch(texArrays[32], coord, 0);
        case 33u: return texelFetch(texArrays[33], coord, 0);
        case 34u: return texelFetch(texArrays[34], coord, 0);
        case 35u: return texelFetch(texArrays[35], coord, 0);
        case 36u: return texelFetch(texArrays[36], coord, 0);
        case 37u: return texelFetch(texArrays[37], coord, 0);
        case 38u: return texelFetch(texArrays[38], coord, 0);
        case 39u: return texelFetch(texArrays[39], coord, 0);
        case 40u: return texelFetch(texArrays[40], coord, 0);
        case 41u: return texelFetch(texArrays[41], coord, 0);
        case 42u: return texelFetch(texArrays[42], coord, 0);
        case 43u: return texelFetch(texArrays[43], coord, 0);
        case 44u: return texelFetch(texArrays[44], coord, 0);
        case 45u: return texelFetch(texArrays[45], coord, 0);
        case 46u: return texelFetch(texArrays[46], coord, 0);
        case 47u: return texelFetch(texArrays[47], coord, 0);
        case 48u: return texelFetch(texArrays[48], coord, 0);
        case 49u: return texelFetch(texArrays[49], coord, 0);
        case 50u: return texelFetch(texArrays[50], coord, 0);
        case 51u: return texelFetch(texArrays[51], coord, 0);
        case 52u: return texelFetch(texArrays[52], coord, 0);
        case 53u: return texelFetch(texArrays[53], coord, 0);
        case 54u: return texelFetch(texArrays[54], coord, 0);
        case 55u: return texelFetch(texArrays[55], coord, 0);
        case 56u: return texelFetch(texArrays[56], coord, 0);
        case 57u: return texelFetch(texArrays[57], coord, 0);
        case 58u: return texelFetch(texArrays[58], coord, 0);
        case 59u: return texelFetch(texArrays[59], coord, 0);
        case 60u: return texelFetch(texArrays[60], coord, 0);
        case 61u: return texelFetch(texArrays[61], coord, 0);
        case 62u: return texelFetch(texArrays[62], coord, 0);
        case 63u: return texelFetch(texArrays[63], coord, 0);
        case 64u: return texelFetch(texArrays[64], coord, 0);
        case 65u: return texelFetch(texArrays[65], coord, 0);
        case 66u: return texelFetch(texArrays[66], coord, 0);
        case 67u: return texelFetch(texArrays[67], coord, 0);
        case 68u: return texelFetch(texArrays[68], coord, 0);
        case 69u: return texelFetch(texArrays[69], coord, 0);
        case 70u: return texelFetch(texArrays[70], coord, 0);
        case 71u: return texelFetch(texArrays[71], coord, 0);
        case 72u: return texelFetch(texArrays[72], coord, 0);
        case 73u: return texelFetch(texArrays[73], coord, 0);
        case 74u: return texelFetch(texArrays[74], coord, 0);
        case 75u: return texelFetch(texArrays[75], coord, 0);
        case 76u: return texelFetch(texArrays[76], coord, 0);
        case 77u: return texelFetch(texArrays[77], coord, 0);
        case 78u: return texelFetch(texArrays[78], coord, 0);
        case 79u: return texelFetch(texArrays[79], coord, 0);
        case 80u: return texelFetch(texArrays[80], coord, 0);
        case 81u: return texelFetch(texArrays[81], coord, 0);
        case 82u: return texelFetch(texArrays[82], coord, 0);
        case 83u: return texelFetch(texArrays[83], coord, 0);
        case 84u: return texelFetch(texArrays[84], coord, 0);
        case 85u: return texelFetch(texArrays[85], coord, 0);
        case 86u: return texelFetch(texArrays[86], coord, 0);
        case 87u: return texelFetch(texArrays[87], coord, 0);
        case 88u: return texelFetch(texArrays[88], coord, 0);
        case 89u: return texelFetch(texArrays[89], coord, 0);
        case 90u: return texelFetch(texArrays[90], coord, 0);
        case 91u: return texelFetch(texArrays[91], coord, 0);
        case 92u: return texelFetch(texArrays[92], coord, 0);
        case 93u: return texelFetch(texArrays[93], coord, 0);
        case 94u: return texelFetch(texArrays[94], coord, 0);
        case 95u: return texelFetch(texArrays[95], coord, 0);
        case 96u: return texelFetch(texArrays[96], coord, 0);
        case 97u: return texelFetch(texArrays[97], coord, 0);
        case 98u: return texelFetch(texArrays[98], coord, 0);
        case 99u: return texelFetch(texArrays[99], coord, 0);
        case 100u: return texelFetch(texArrays[100], coord, 0);
        case 101u: return texelFetch(texArrays[101], coord, 0);
        case 102u: return texelFetch(texArrays[102], coord, 0);
        case 103u: return texelFetch(texArrays[103], coord, 0);
        case 104u: return texelFetch(texArrays[104], coord, 0);
        case 105u: return texelFetch(texArrays[105], coord, 0);
        case 106u: return texelFetch(texArrays[106], coord, 0);
        case 107u: return texelFetch(texArrays[107], coord, 0);
        case 108u: return texelFetch(texArrays[108], coord, 0);
        case 109u: return texelFetch(texArrays[109], coord, 0);
        case 110u: return texelFetch(texArrays[110], coord, 0);
        case 111u: return texelFetch(texArrays[111], coord, 0);
        case 112u: return texelFetch(texArrays[112], coord, 0);
        case 113u: return texelFetch(texArrays[113], coord, 0);
        case 114u: return texelFetch(texArrays[114], coord, 0);
        case 115u: return texelFetch(texArrays[115], coord, 0);
        case 116u: return texelFetch(texArrays[116], coord, 0);
        case 117u: return texelFetch(texArrays[117], coord, 0);
        case 118u: return texelFetch(texArrays[118], coord, 0);
        case 119u: return texelFetch(texArrays[119], coord, 0);
        case 120u: return texelFetch(texArrays[120], coord, 0);
        case 121u: return texelFetch(texArrays[121], coord, 0);
        case 122u: return texelFetch(texArrays[122], coord, 0);
        case 123u: return texelFetch(texArrays[123], coord, 0);
        case 124u: return texelFetch(texArrays[124], coord, 0);
        case 125u: return texelFetch(texArrays[125], coord, 0);
        case 126u: return texelFetch(texArrays[126], coord, 0);
        case 127u: return texelFetch(texArrays[127], coord, 0);
        case 128u: return texelFetch(texArrays[128], coord, 0);
        case 129u: return texelFetch(texArrays[129], coord, 0);
        case 130u: return texelFetch(texArrays[130], coord, 0);
        case 131u: return texelFetch(texArrays[131], coord, 0);
        case 132u: return texelFetch(texArrays[132], coord, 0);
        case 133u: return texelFetch(texArrays[133], coord, 0);
        case 134u: return texelFetch(texArrays[134], coord, 0);
        case 135u: return texelFetch(texArrays[135], coord, 0);
        case 136u: return texelFetch(texArrays[136], coord, 0);
        case 137u: return texelFetch(texArrays[137], coord, 0);
        case 138u: return texelFetch(texArrays[138], coord, 0);
        case 139u: return texelFetch(texArrays[139], coord, 0);
        case 140u: return texelFetch(texArrays[140], coord, 0);
        case 141u: return texelFetch(texArrays[141], coord, 0);
        case 142u: return texelFetch(texArrays[142], coord, 0);
        case 143u: return texelFetch(texArrays[143], coord, 0);
        case 144u: return texelFetch(texArrays[144], coord, 0);
        case 145u: return texelFetch(texArrays[145], coord, 0);
        case 146u: return texelFetch(texArrays[146], coord, 0);
        case 147u: return texelFetch(texArrays[147], coord, 0);
        case 148u: return texelFetch(texArrays[148], coord, 0);
        case 149u: return texelFetch(texArrays[149], coord, 0);
        case 150u: return texelFetch(texArrays[150], coord, 0);
        case 151u: return texelFetch(texArrays[151], coord, 0);
        case 152u: return texelFetch(texArrays[152], coord, 0);
        case 153u: return texelFetch(texArrays[153], coord, 0);
        case 154u: return texelFetch(texArrays[154], coord, 0);
        case 155u: return texelFetch(texArrays[155], coord, 0);
        case 156u: return texelFetch(texArrays[156], coord, 0);
        case 157u: return texelFetch(texArrays[157], coord, 0);
        case 158u: return texelFetch(texArrays[158], coord, 0);
        case 159u: return texelFetch(texArrays[159], coord, 0);
        case 160u: return texelFetch(texArrays[160], coord, 0);
        case 161u: return texelFetch(texArrays[161], coord, 0);
        case 162u: return texelFetch(texArrays[162], coord, 0);
        case 163u: return texelFetch(texArrays[163], coord, 0);
        case 164u: return texelFetch(texArrays[164], coord, 0);
        case 165u: return texelFetch(texArrays[165], coord, 0);
        case 166u: return texelFetch(texArrays[166], coord, 0);
        case 167u: return texelFetch(texArrays[167], coord, 0);
        case 168u: return texelFetch(texArrays[168], coord, 0);
        case 169u: return texelFetch(texArrays[169], coord, 0);
        case 170u: return texelFetch(texArrays[170], coord, 0);
        case 171u: return texelFetch(texArrays[171], coord, 0);
        case 172u: return texelFetch(texArrays[172], coord, 0);
        case 173u: return texelFetch(texArrays[173], coord, 0);
        case 174u: return texelFetch(texArrays[174], coord, 0);
        case 175u: return texelFetch(texArrays[175], coord, 0);
        case 176u: return texelFetch(texArrays[176], coord, 0);
        case 177u: return texelFetch(texArrays[177], coord, 0);
        case 178u: return texelFetch(texArrays[178], coord, 0);
        case 179u: return texelFetch(texArrays[179], coord, 0);
        case 180u: return texelFetch(texArrays[180], coord, 0);
        case 181u: return texelFetch(texArrays[181], coord, 0);
        case 182u: return texelFetch(texArrays[182], coord, 0);
        case 183u: return texelFetch(texArrays[183], coord, 0);
        case 184u: return texelFetch(texArrays[184], coord, 0);
        case 185u: return texelFetch(texArrays[185], coord, 0);
        case 186u: return texelFetch(texArrays[186], coord, 0);
        case 187u: return texelFetch(texArrays[187], coord, 0);
        case 188u: return texelFetch(texArrays[188], coord, 0);
        case 189u: return texelFetch(texArrays[189], coord, 0);
        case 190u: return texelFetch(texArrays[190], coord, 0);
        case 191u: return texelFetch(texArrays[191], coord, 0);
        case 192u: return texelFetch(texArrays[192], coord, 0);
        case 193u: return texelFetch(texArrays[193], coord, 0);
        case 194u: return texelFetch(texArrays[194], coord, 0);
        case 195u: return texelFetch(texArrays[195], coord, 0);
        case 196u: return texelFetch(texArrays[196], coord, 0);
        case 197u: return texelFetch(texArrays[197], coord, 0);
        case 198u: return texelFetch(texArrays[198], coord, 0);
        case 199u: return texelFetch(texArrays[199], coord, 0);
        case 200u: return texelFetch(texArrays[200], coord, 0);
        case 201u: return texelFetch(texArrays[201], coord, 0);
        case 202u: return texelFetch(texArrays[202], coord, 0);
        case 203u: return texelFetch(texArrays[203], coord, 0);
        case 204u: return texelFetch(texArrays[204], coord, 0);
        case 205u: return texelFetch(texArrays[205], coord, 0);
        case 206u: return texelFetch(texArrays[206], coord, 0);
        case 207u: return texelFetch(texArrays[207], coord, 0);
        case 208u: return texelFetch(texArrays[208], coord, 0);
        case 209u: return texelFetch(texArrays[209], coord, 0);
        case 210u: return texelFetch(texArrays[210], coord, 0);
        case 211u: return texelFetch(texArrays[211], coord, 0);
        case 212u: return texelFetch(texArrays[212], coord, 0);
        case 213u: return texelFetch(texArrays[213], coord, 0);
        case 214u: return texelFetch(texArrays[214], coord, 0);
        case 215u: return texelFetch(texArrays[215], coord, 0);
        case 216u: return texelFetch(texArrays[216], coord, 0);
        case 217u: return texelFetch(texArrays[217], coord, 0);
        case 218u: return texelFetch(texArrays[218], coord, 0);
        case 219u: return texelFetch(texArrays[219], coord, 0);
        case 220u: return texelFetch(texArrays[220], coord, 0);
        case 221u: return texelFetch(texArrays[221], coord, 0);
        case 222u: return texelFetch(texArrays[222], coord, 0);
        case 223u: return texelFetch(texArrays[223], coord, 0);
        case 224u: return texelFetch(texArrays[224], coord, 0);
        case 225u: return texelFetch(texArrays[225], coord, 0);
        case 226u: return texelFetch(texArrays[226], coord, 0);
        case 227u: return texelFetch(texArrays[227], coord, 0);
        case 228u: return texelFetch(texArrays[228], coord, 0);
        case 229u: return texelFetch(texArrays[229], coord, 0);
        case 230u: return texelFetch(texArrays[230], coord, 0);
        case 231u: return texelFetch(texArrays[231], coord, 0);
        case 232u: return texelFetch(texArrays[232], coord, 0);
        case 233u: return texelFetch(texArrays[233], coord, 0);
        case 234u: return texelFetch(texArrays[234], coord, 0);
        case 235u: return texelFetch(texArrays[235], coord, 0);
        case 236u: return texelFetch(texArrays[236], coord, 0);
        case 237u: return texelFetch(texArrays[237], coord, 0);
        case 238u: return texelFetch(texArrays[238], coord, 0);
        case 239u: return texelFetch(texArrays[239], coord, 0);
        case 240u: return texelFetch(texArrays[240], coord, 0);
        case 241u: return texelFetch(texArrays[241], coord, 0);
        case 242u: return texelFetch(texArrays[242], coord, 0);
        case 243u: return texelFetch(texArrays[243], coord, 0);
        case 244u: return texelFetch(texArrays[244], coord, 0);
        case 245u: return texelFetch(texArrays[245], coord, 0);
        case 246u: return texelFetch(texArrays[246], coord, 0);
        case 247u: return texelFetch(texArrays[247], coord, 0);
        case 248u: return texelFetch(texArrays[248], coord, 0);
        case 249u: return texelFetch(texArrays[249], coord, 0);
        case 250u: return texelFetch(texArrays[250], coord, 0);
        case 251u: return texelFetch(texArrays[251], coord, 0);
        case 252u: return texelFetch(texArrays[252], coord, 0);
        case 253u: return texelFetch(texArrays[253], coord, 0);
        case 254u: return texelFetch(texArrays[254], coord, 0);
        case 255u: return texelFetch(texArrays[255], coord, 0);
        default: return texelFetch(texArrays[255], coord, 0);
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

#if MELONDS_FAST_OPAQUE_MODULATE == 0
bool usesDsPixelCenteredTranslucentPaletteUi(uint flags, uint polyAttr, uint texParam)
{
    uint textureFormat = (texParam >> 26u) & 0x7u;
    uint polyAlpha = (polyAttr >> 16u) & 0x1Fu;
    uint blendMode = (polyAttr >> 4u) & 0x3u;
    bool color0Transparent = (texParam & (1u << 29u)) != 0u;
    bool depthWriteDisabled = (polyAttr & (1u << 11u)) == 0u;
    bool clearAlphaZero = ((pc.clearAttr >> 16u) & 0x1Fu) == 0u;
    bool alphaBlendEnabled = (pc.dispCnt & (1u << 3u)) != 0u;
    bool repeatS = (texParam & (1u << 16u)) != 0u;
    bool repeatT = (texParam & (1u << 17u)) != 0u;
    bool mirrorS = (texParam & (1u << 18u)) != 0u;
    bool mirrorT = (texParam & (1u << 19u)) != 0u;
    bool menuTexturePage = (texParam & 0xFFFFu) == 0xA3A0u;
    return TRANSLUCENT_PASS != 0u
        && (flags & TRI_FLAG_LINEAR) != 0u
        && textureFormat == 3u
        && color0Transparent
        && menuTexturePage
        && depthWriteDisabled
        && clearAlphaZero
        && alphaBlendEnabled
        && blendMode == 0u
        && polyAlpha > 0u
        && polyAlpha < 31u
        && !repeatS
        && !repeatT
        && !mirrorS
        && !mirrorT;
}

bool usesPaletteUiAlphaHoleFill(uint flags, uint polyAttr, uint texParam)
{
    uint polyAlpha = (polyAttr >> 16u) & 0x1Fu;
    return usesDsPixelCenteredTranslucentPaletteUi(flags, polyAttr, texParam)
        && polyAlpha >= 21u;
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

    return TRANSLUCENT_PASS == 0u
        && (flags & TRI_FLAG_TEXTURED) != 0u
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

bool usesHighresOpaqueRepeatedModelTexture(uint flags, uint polyAttr, uint texParam)
{
    uint textureFormat = (texParam >> 26u) & 0x7u;
    uint polyAlpha = (polyAttr >> 16u) & 0x1Fu;
    uint blendMode = (polyAttr >> 4u) & 0x3u;
    bool color0Transparent = (texParam & (1u << 29u)) != 0u;
    bool repeatS = (texParam & (1u << 16u)) != 0u;
    bool repeatT = (texParam & (1u << 17u)) != 0u;
    bool mirrorS = (texParam & (1u << 18u)) != 0u;
    bool mirrorT = (texParam & (1u << 19u)) != 0u;

    return TRANSLUCENT_PASS == 0u
        && (flags & TRI_FLAG_TEXTURED) != 0u
        && (flags & TRI_FLAG_LINEAR) != 0u
        && (textureFormat == 4u || textureFormat == 5u)
        && !color0Transparent
        && polyAlpha == 31u
        && blendMode == 0u
        && (repeatS || repeatT || mirrorS || mirrorT);
}

bool usesHighresLinearTextBand(uint flags, uint polyAttr, uint texParam, uint texWidth, uint texHeight)
{
    uint textureFormat = (texParam >> 26u) & 0x7u;
    uint polyAlpha = (polyAttr >> 16u) & 0x1Fu;
    uint blendMode = (polyAttr >> 4u) & 0x3u;
    bool color0Transparent = (texParam & (1u << 29u)) != 0u;
    bool depthWriteEnabled = (polyAttr & (1u << 11u)) != 0u;
    bool depthWriteDisabled = (polyAttr & (1u << 11u)) == 0u;
    bool repeatS = (texParam & (1u << 16u)) != 0u;
    bool repeatT = (texParam & (1u << 17u)) != 0u;
    bool mirrorS = (texParam & (1u << 18u)) != 0u;
    bool mirrorT = (texParam & (1u << 19u)) != 0u;
    bool observedTranslucentTextPage =
        (texParam == 0x79df2000u && texWidth == 256u && texHeight == 64u)
        || (texParam == 0x7a5f3000u && texWidth == 256u && texHeight == 128u)
        || (texParam == 0x79df4800u && texWidth == 256u && texHeight == 64u);
    bool observedOpaqueTextPage =
        texParam == 0x71df2800u && texWidth == 256u && texHeight == 64u;

    bool commonTextBand =
        (flags & TRI_FLAG_TEXTURED) != 0u
        && (flags & TRI_FLAG_LINEAR) != 0u
        && color0Transparent
        && blendMode == 0u
        && repeatS
        && repeatT
        && mirrorS
        && mirrorT;

    return commonTextBand
        && ((TRANSLUCENT_PASS != 0u
                && textureFormat == 6u
                && depthWriteDisabled
                && polyAlpha == 30u
                && observedTranslucentTextPage)
            || (TRANSLUCENT_PASS == 0u
                && textureFormat == 4u
                && depthWriteEnabled
                && polyAlpha == 31u
                && observedOpaqueTextPage));
}

vec2 dsPixelCenterDelta()
{
    vec2 renderScale = max(vec2(float(pc.width) * (1.0 / 256.0), float(pc.height) * (1.0 / 192.0)), vec2(1.0));
    vec2 subpixelOffset = mod(gl_FragCoord.xy - vec2(0.5), renderScale);
    vec2 dsPixelCenterOffset = max((renderScale - vec2(1.0)) * 0.5, vec2(0.0));
    return dsPixelCenterOffset - subpixelOffset;
}
#endif

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

#if MELONDS_FAST_OPAQUE_MODULATE == 0
    if (usesDsPixelCenteredTranslucentPaletteUi(flags, polyAttr, texParam))
    {
        vec2 centerDelta = dsPixelCenterDelta();
        texcoord += dFdx(fTexcoord) * centerDelta.x + dFdy(fTexcoord) * centerDelta.y;
    }
    else if (usesCompactOpaqueDepthWritePaletteUi(flags, polyAttr, texParam))
    {
        vec2 centerDelta = dsPixelCenterDelta();
        texcoord += dFdx(fTexcoord) * centerDelta.x + dFdy(fTexcoord) * centerDelta.y;
    }
    else if ((flags & TRI_FLAG_LINEAR) != 0u
        && (repeatS || repeatT || mirrorS || mirrorT)
        && !usesHighresOpaqueRepeatedModelTexture(flags, polyAttr, texParam)
        && !usesHighresLinearTextBand(flags, polyAttr, texParam, texWidth, texHeight))
    {
        vec2 renderScale = max(vec2(float(pc.width) * (1.0 / 256.0), float(pc.height) * (1.0 / 192.0)), vec2(1.0));
        vec2 subpixelOffset = mod(gl_FragCoord.xy - vec2(0.5), renderScale);
        texcoord += dFdx(fTexcoord) * -subpixelOffset.x + dFdy(fTexcoord) * -subpixelOffset.y;
        texcoord -= vec2(LINEAR_TEXEL_COORD_BIAS);
    }
#endif

    int sampleS = int(floor(texcoord.x));
    int sampleT = int(floor(texcoord.y));

#if MELONDS_FAST_OPAQUE_MODULATE != 0 && MELONDS_FAST_TEXTURE_PUSH_CONSTANTS != 0
    vec2 sampledTexelCenter = vec2(float(sampleS) + 0.5, float(sampleT) + 0.5);
    vec2 sampledUv = sampledTexelCenter / vec2(float(texWidth), float(texHeight));
    vec4 normalizedTexel = texture(normTexArrays[texArrayIndex], vec3(sampledUv, float(texLayer)));
    uvec4 texel = uvec4(clamp(floor(normalizedTexel * 255.0 + vec4(0.5)), vec4(0.0), vec4(255.0)));
#else
    sampleS = wrapTexelCoord(sampleS, int(texWidth), repeatS, mirrorS);
    sampleT = wrapTexelCoord(sampleT, int(texHeight), repeatT, mirrorT);

    uvec4 texel = fetchTextureArrayTexel(texArrayIndex, ivec3(sampleS, sampleT, int(texLayer)));
#endif
#if MELONDS_FAST_OPAQUE_MODULATE == 0
    if (usesPaletteUiAlphaHoleFill(flags, polyAttr, texParam)
        && (texel.a & 0x1Fu) == 0u)
    {
        int leftS = wrapTexelCoord(sampleS - 1, int(texWidth), repeatS, mirrorS);
        int rightS = wrapTexelCoord(sampleS + 1, int(texWidth), repeatS, mirrorS);
        int upT = wrapTexelCoord(sampleT - 1, int(texHeight), repeatT, mirrorT);
        int downT = wrapTexelCoord(sampleT + 1, int(texHeight), repeatT, mirrorT);
        uvec4 leftTexel = fetchTextureArrayTexel(texArrayIndex, ivec3(leftS, sampleT, int(texLayer)));
        uvec4 rightTexel = fetchTextureArrayTexel(texArrayIndex, ivec3(rightS, sampleT, int(texLayer)));
        uvec4 upTexel = fetchTextureArrayTexel(texArrayIndex, ivec3(sampleS, upT, int(texLayer)));
        uvec4 downTexel = fetchTextureArrayTexel(texArrayIndex, ivec3(sampleS, downT, int(texLayer)));
        if ((leftTexel.a & 0x1Fu) != 0u)
            texel = leftTexel;
        else if ((rightTexel.a & 0x1Fu) != 0u)
            texel = rightTexel;
        else if ((upTexel.a & 0x1Fu) != 0u)
            texel = upTexel;
        else if ((downTexel.a & 0x1Fu) != 0u)
            texel = downTexel;
    }
#endif
#if MELONDS_FAST_OPAQUE_FULL_ALPHA != 0
    return decodeTexelRgb6Opaque(texel);
#else
    return decodeTexelRgb6a5(texel);
#endif
}

#if MELONDS_FAST_FLOAT_MODULATE != 0
vec3 sampleFastNormalizedTexel()
{
    uint texLayer = (pc.variantKey >> 16u) & 0xFFFFu;
    uint texArrayIndex = pc.variantKey & 0xFFFFu;
    uint texHeight = (pc.passIndex >> 16u) & 0xFFFFu;
    uint texWidth = pc.passIndex & 0xFFFFu;
    vec2 sampledTexelCenter = floor(fTexcoord) + vec2(0.5);
    vec2 sampledUv = sampledTexelCenter / vec2(float(texWidth), float(texHeight));
    vec4 normalizedTexel = texture(normTexArrays[texArrayIndex], vec3(sampledUv, float(texLayer)));
    return clamp(normalizedTexel.rgb * 255.0, vec3(0.0), vec3(63.0));
}
#endif

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
#if MELONDS_FAST_FLOAT_MODULATE != 0
    uint fastPolyAttr = pc.depthBlendMode;
    uint fastPolyId = (fastPolyAttr >> 24u) & 0x3Fu;
    float fastFogFlag = ((fastPolyAttr & (1u << 15u)) != 0u) ? 0.5 : 0.0;
    vec3 tex6 = sampleFastNormalizedTexel();
    vec3 color6 = clamp(fColor.rgb * 63.0, vec3(0.0), vec3(63.0));
    vec3 out6 = floor((((tex6 + vec3(1.0)) * (color6 + vec3(1.0))) - vec3(1.0)) * (1.0 / 64.0));
    oColor = vec4(clamp(out6 * (1.0 / 63.0), vec3(0.0), vec3(1.0)), 1.0);
#if MELONDS_COLOR_ONLY == 0
    oAttr = vec4(float(fastPolyId) * (1.0 / 63.0), fastFogFlag, 0.0, 1.0);
#endif
#if MELONDS_NO_FRAG_DEPTH == 0
    float fastDepth = DEPTH_INTERPOLATION_MODE != 0u ? fDepthPerspective : fDepthLinear;
    gl_FragDepth = fastDepth;
#endif
    return;
#endif

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
#if MELONDS_COLOR_ONLY == 0
        oAttr = vec4(0.0, 1.0, 0.0, 1.0);
#endif

        float edgeDepth = DEPTH_INTERPOLATION_MODE != 0u ? fDepthPerspective : fDepthLinear;
#if MELONDS_NO_FRAG_DEPTH == 0
        gl_FragDepth = edgeDepth;
#endif
        return;
    }

    if (TRANSLUCENT_PASS != 0u)
    {
        if (sourceColor.a <= 0 || sourceColor.a >= 31)
            discard;

#if MELONDS_FAST_OPAQUE_MODULATE == 0
        if (usesPaletteUiAlphaHoleFill(flags, polyAttr, fTriInfo1.y))
            oColor = encodeColorDsTranslucentBlendAlpha(sourceColor);
        else
            oColor = encodeColorDsTranslucentBlendAlpha(sourceColor);
#else
        oColor = encodeColorDsTranslucentBlendAlpha(sourceColor);
#endif
#if MELONDS_COLOR_ONLY == 0
        oAttr = vec4(0.0, 0.0, 0.0, 1.0);
#endif
    }
    else
    {
#if MELONDS_FAST_OPAQUE_FULL_ALPHA == 0
        if (sourceColor.a < 31)
            discard;
#endif

        uint polyId = (polyAttr >> 24u) & 0x3Fu;
        float fogFlag = ((polyAttr & (1u << 15u)) != 0u) ? 0.5 : 0.0;
        oColor = encodeColor(sourceColor);
#if MELONDS_COLOR_ONLY == 0
        oAttr = vec4(float(polyId) * (1.0 / 63.0), fogFlag, 0.0, 1.0);
#endif
    }

    float depth = DEPTH_INTERPOLATION_MODE != 0u ? fDepthPerspective : fDepthLinear;
#if MELONDS_NO_FRAG_DEPTH == 0
    gl_FragDepth = depth;
#endif
}

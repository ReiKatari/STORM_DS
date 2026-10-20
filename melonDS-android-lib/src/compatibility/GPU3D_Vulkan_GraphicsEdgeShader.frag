#version 450

layout(set = 0, binding = 3) uniform sampler2D AttrBuffer;
layout(set = 0, binding = 4) uniform sampler2D DepthBuffer;

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

layout(location = 0) out vec4 oColor;

bool isless(float a, float b)
{
    return a < b;
}

bool isgood(vec4 attr, float depth, int refPolyID, float refDepth)
{
    int polyid = int(attr.r * 63.0);
    if (polyid != refPolyID && isless(refDepth, depth))
        return true;
    return false;
}

vec3 unpackEdgeColor(uint packedColor)
{
    float r = float(packedColor & 0x3Fu) * (1.0 / 63.0);
    float g = float((packedColor >> 8u) & 0x3Fu) * (1.0 / 63.0);
    float b = float((packedColor >> 16u) & 0x3Fu) * (1.0 / 63.0);
    return vec3(r, g, b);
}

vec3 edgeColorForPolyId(int polyid)
{
    if ((pc.variantKey & 0x80000000u) != 0u && uint(polyid) == (pc.variantKey & 0x3Fu))
        return unpackEdgeColor(pc.triangleBase);
    return unpackEdgeColor(pc.edgeColorPacked[uint(polyid) >> 3u]);
}

float computeSsaoAlpha(ivec2 coord, float centerDepth)
{
    if ((pc.dispCnt & (1u << 17u)) == 0u)
        return 0.0;
    float clearDepthNorm = float(pc.clearDepth) * (1.0 / 16777216.0);
    if (centerDepth >= clearDepthNorm - 0.0002)
        return 0.0;

    int irScale = max(1, int(pc.width / 256u));
    int r1 = irScale * 2;
    int r2 = irScale * 4;
    float ao = 0.0;
    const ivec2 offsets[8] = ivec2[8](
        ivec2(0, -r1), ivec2(0, r1), ivec2(-r1, 0), ivec2(r1, 0),
        ivec2(-r2, -r2), ivec2(r2, -r2), ivec2(-r2, r2), ivec2(r2, r2)
    );
    for (int i = 0; i < 8; i++)
    {
        ivec2 sc = clamp(coord + offsets[i], ivec2(0), ivec2(int(pc.width) - 1, int(pc.height) - 1));
        float sampleDepth = texelFetch(DepthBuffer, sc, 0).r;
        float diff = centerDepth - sampleDepth;
        if (diff > 0.00015 && diff < 0.035)
        {
            ao += smoothstep(0.035, 0.00015, diff);
        }
    }
    return clamp(ao * 0.075, 0.0, 0.42);
}

void main()
{
    ivec2 coord = ivec2(gl_FragCoord.xy);
    int scale = ((pc.dispCnt & (1u << 16u)) != 0u)
        ? max(1, int(pc.width / 256u))
        : 1;

    vec4 ret = vec4(0.0);
    vec4 depth = texelFetch(DepthBuffer, coord, 0);
    vec4 attr = texelFetch(AttrBuffer, coord, 0);
    int polyid = int(attr.r * 63.0);

    if (((pc.dispCnt & (1u << 5u)) != 0u) && attr.g != 0.0)
    {
        vec4 depthU = texelFetch(DepthBuffer, coord + ivec2(0, -scale), 0);
        vec4 attrU = texelFetch(AttrBuffer, coord + ivec2(0, -scale), 0);
        vec4 depthD = texelFetch(DepthBuffer, coord + ivec2(0, scale), 0);
        vec4 attrD = texelFetch(AttrBuffer, coord + ivec2(0, scale), 0);
        vec4 depthL = texelFetch(DepthBuffer, coord + ivec2(-scale, 0), 0);
        vec4 attrL = texelFetch(AttrBuffer, coord + ivec2(-scale, 0), 0);
        vec4 depthR = texelFetch(DepthBuffer, coord + ivec2(scale, 0), 0);
        vec4 attrR = texelFetch(AttrBuffer, coord + ivec2(scale, 0), 0);

        if (isgood(attrU, depthU.r, polyid, depth.r)
            || isgood(attrD, depthD.r, polyid, depth.r)
            || isgood(attrL, depthL.r, polyid, depth.r)
            || isgood(attrR, depthR.r, polyid, depth.r))
        {
            ret.rgb = edgeColorForPolyId(polyid);
            ret.a = ((pc.dispCnt & (1u << 4u)) != 0u) ? 0.5 : 1.0;
        }
    }

    if (ret.a == 0.0)
    {
        float aoAlpha = computeSsaoAlpha(coord, depth.r);
        if (aoAlpha > 0.0)
        {
            ret = vec4(0.0, 0.0, 0.0, aoAlpha);
        }
    }

    oColor = ret;
}

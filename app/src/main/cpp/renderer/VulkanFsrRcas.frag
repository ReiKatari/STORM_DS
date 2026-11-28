#version 450

// AMD FidelityFX RCAS (Robust Contrast-Adaptive Sharpening)
// Seam-isolated for Nintendo DS / DSi dual-screen vertical atlas.

layout(location = 0) in vec2 texcoord;
layout(location = 0) out vec4 out_color;

layout(set = 0, binding = 0) uniform sampler2D uInputTexture;

layout(push_constant) uniform PushConstants {
    vec4 inputSize; // xy: width, height; zw: 1/w, 1/h
    vec4 params;    // x: sharpness [0.0..1.0], yzw: reserved
};

vec3 fetchRgbClamped(ivec2 coord, ivec2 texSize, int minY, int maxY)
{
    ivec2 c = ivec2(clamp(coord.x, 0, texSize.x - 1), clamp(coord.y, minY, maxY));
    return texelFetch(uInputTexture, c, 0).rgb;
}

float lumaFast(vec3 c)
{
    return c.g + 0.5 * (c.r + c.b);
}

void main()
{
    ivec2 texSize = max(ivec2(inputSize.xy + 0.5), ivec2(2, 2));
    int halfH = max(texSize.y / 2, 1);
    ivec2 pos = ivec2(clamp(texcoord * inputSize.xy, vec2(0.0), inputSize.xy - vec2(1.0)));

    bool isBottomScreen = (pos.y >= halfH) && (texSize.y >= 4);
    int minY = isBottomScreen ? halfH : 0;
    int maxY = isBottomScreen ? (texSize.y - 1) : (halfH - 1);

    vec3 e = fetchRgbClamped(pos, texSize, minY, maxY);
    float sharpness = clamp(params.x, 0.0, 1.0);
    if (sharpness <= 0.005) {
        out_color = vec4(e, 1.0);
        return;
    }

    vec3 b = fetchRgbClamped(pos + ivec2( 0, -1), texSize, minY, maxY);
    vec3 d = fetchRgbClamped(pos + ivec2(-1,  0), texSize, minY, maxY);
    vec3 f = fetchRgbClamped(pos + ivec2( 1,  0), texSize, minY, maxY);
    vec3 h = fetchRgbClamped(pos + ivec2( 0,  1), texSize, minY, maxY);

    float bL = lumaFast(b);
    float dL = lumaFast(d);
    float eL = lumaFast(e);
    float fL = lumaFast(f);
    float hL = lumaFast(h);

    float nz = 0.25 * (bL + dL + fL + hL) - eL;
    float nzRange = max(max(max(bL, dL), max(fL, hL)), eL) - min(min(min(bL, dL), min(fL, hL)), eL);
    nz = clamp(abs(nz) / max(nzRange, 1e-4), 0.0, 1.0);
    float antiNoise = clamp(-0.5 * nz + 1.0, 0.0, 1.0);

    vec3 min4 = min(min(b, d), min(f, h));
    vec3 max4 = max(max(b, d), max(f, h));
    vec3 minE = min(min4, e);
    vec3 maxE = max(max4, e);

    // Compute per-channel RCAS limit to prevent ringing while maximizing local contrast
    vec3 hitMin = minE / max(4.0 * max4, vec3(1e-5));
    vec3 hitMax = (maxE - vec3(1.0)) / max(vec3(4.0) - 4.0 * min4, vec3(1e-5));
    float peakC = -1.0 / mix(8.0, 5.0, sharpness);
    vec3 lobeRGB = max(-hitMin, hitMax);
    float lobe = max(-0.25 + (1.0 / 16.0), min(min(lobeRGB.r, lobeRGB.g), lobeRGB.b));
    lobe = max(peakC, lobe) * exp2(-(1.0 - sharpness) * 2.0) * antiNoise;
    lobe = clamp(lobe, -0.22, 0.0);

    vec3 color = (lobe * (b + d + f + h) + e) / (4.0 * lobe + 1.0);
    out_color = vec4(clamp(color, 0.0, 1.0), 1.0);
}

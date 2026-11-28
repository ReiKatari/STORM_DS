#version 450

// Optical-Flow Bidirectional Frame Interpolation (60 -> 120 FPS Frame Generation)
// Interpolates intermediate frame at phase t between prev_frame and curr_frame.

layout(location = 0) in vec2 texcoord;
layout(location = 0) out vec4 out_color;

layout(set = 0, binding = 0) uniform sampler2D prev_frame;
layout(set = 0, binding = 1) uniform sampler2D curr_frame;

layout(push_constant) uniform PushConstants {
    vec4 frameSize; // xy: width, height; zw: 1/w, 1/h
    vec4 params;    // x: blend phase t (default 0.5), y: swapPrevBgrToRgb, z: maxFlowPixels (e.g. 6.0), w: swapCurrBgrToRgb
};

vec2 clampHalfAtlasUv(vec2 uv, float minV, float maxV)
{
    return vec2(clamp(uv.x, 0.0005, 0.9995), clamp(uv.y, minV, maxV));
}

vec3 sampleTexRgb(sampler2D tex, vec2 uv, float minV, float maxV, bool swapBgr)
{
    vec3 s = texture(tex, clampHalfAtlasUv(uv, minV, maxV)).rgb;
    return swapBgr ? s.bgr : s;
}

float lumaFast(vec3 c)
{
    return 0.299 * c.r + 0.587 * c.g + 0.114 * c.b;
}

void main()
{
    vec2 invSize = max(frameSize.zw, vec2(1e-6));
    bool swapPrevBgr = params.y > 0.5;
    bool swapCurrBgr = params.w > 0.5;
    float t = clamp(params.x, 0.0, 1.0);
    float maxFlow = (params.z > 0.0) ? params.z : 6.0;

    bool isBottomScreen = texcoord.y >= 0.5;
    float halfTexelV = 0.5 * invSize.y;
    float minV = isBottomScreen ? (0.5 + halfTexelV) : halfTexelV;
    float maxV = isBottomScreen ? (1.0 - halfTexelV) : (0.5 - halfTexelV);

    vec3 prevC = sampleTexRgb(prev_frame, texcoord, minV, maxV, swapPrevBgr);
    vec3 currC = sampleTexRgb(curr_frame, texcoord, minV, maxV, swapCurrBgr);

    float prevL = lumaFast(prevC);
    float currL = lumaFast(currC);
    float it = currL - prevL;

    // 2x step helps capture coarser pixel motion cleanly at higher resolutions
    vec2 stepUv = invSize * 1.5;
    float prevW = lumaFast(sampleTexRgb(prev_frame, texcoord - vec2(stepUv.x, 0.0), minV, maxV, swapPrevBgr));
    float prevE = lumaFast(sampleTexRgb(prev_frame, texcoord + vec2(stepUv.x, 0.0), minV, maxV, swapPrevBgr));
    float prevN = lumaFast(sampleTexRgb(prev_frame, texcoord - vec2(0.0, stepUv.y), minV, maxV, swapPrevBgr));
    float prevS = lumaFast(sampleTexRgb(prev_frame, texcoord + vec2(0.0, stepUv.y), minV, maxV, swapPrevBgr));

    float currW = lumaFast(sampleTexRgb(curr_frame, texcoord - vec2(stepUv.x, 0.0), minV, maxV, swapCurrBgr));
    float currE = lumaFast(sampleTexRgb(curr_frame, texcoord + vec2(stepUv.x, 0.0), minV, maxV, swapCurrBgr));
    float currN = lumaFast(sampleTexRgb(curr_frame, texcoord - vec2(0.0, stepUv.y), minV, maxV, swapCurrBgr));
    float currS = lumaFast(sampleTexRgb(curr_frame, texcoord + vec2(0.0, stepUv.y), minV, maxV, swapCurrBgr));

    float ix = 0.25 * ((prevE - prevW) + (currE - currW));
    float iy = 0.25 * ((prevS - prevN) + (currS - currN));
    float gradSq = ix * ix + iy * iy;

    vec2 flowUv = vec2(0.0);
    if (gradSq > 1e-4) {
        vec2 flowPx = -vec2(ix, iy) * (it / (gradSq + 0.004));
        flowPx = clamp(flowPx, vec2(-maxFlow), vec2(maxFlow));
        flowUv = flowPx * invSize;
    }

    vec3 warpedPrev = sampleTexRgb(prev_frame, texcoord - flowUv * t, minV, maxV, swapPrevBgr);
    vec3 warpedCurr = sampleTexRgb(curr_frame, texcoord + flowUv * (1.0 - t), minV, maxV, swapCurrBgr);

    // Consistency check to prevent ghosting on scene cuts / fast disocclusions
    float warpDiff = abs(lumaFast(warpedPrev) - lumaFast(warpedCurr));
    float rawDiff = abs(prevL - currL);
    float confidence = 1.0 - smoothstep(0.08, 0.35, warpDiff);
    if (rawDiff > 0.55) {
        // Scene cut: snap cleanly instead of blending unrelated frames
        out_color = vec4(currC, 1.0);
        return;
    }

    vec3 flowInterp = mix(warpedPrev, warpedCurr, t);
    vec3 linearFallback = mix(prevC, currC, t);
    vec3 finalRgb = mix(linearFallback, flowInterp, confidence);
    out_color = vec4(clamp(finalRgb, 0.0, 1.0), 1.0);
}

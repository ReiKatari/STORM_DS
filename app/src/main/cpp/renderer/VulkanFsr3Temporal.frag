#version 450

// AMD FSR 3 Temporal Super Resolution (Catmull-Rom + YCoCg Variance Clipping + Luma Optical Flow)
// Adapted for Nintendo DS / DSi dual-screen vertical atlas with seam isolation.

layout(location = 0) in vec2 texcoord;
layout(location = 0) out vec4 out_color;

layout(set = 0, binding = 0) uniform sampler2D current_frame;
layout(set = 0, binding = 1) uniform sampler2D history_frame;

layout(push_constant) uniform PushConstants {
    vec4 render_size;   // xy: input w, h; zw: 1/w, 1/h
    vec4 display_size;  // xy: output w, h; zw: 1/w, 1/h
    vec4 jitter_params; // xy: subpixel jitter offset in UV, z: alpha (0 on first frame), w: gamma
    vec4 params;        // x: swapBgrToRgb (1.0 when reading raw frameImage BGR), yzw: reserved
};

vec3 RGBToYCoCg(vec3 rgb)
{
    float y  =  0.25 * rgb.r + 0.5 * rgb.g + 0.25 * rgb.b;
    float co =  0.5  * rgb.r                - 0.5  * rgb.b;
    float cg = -0.25 * rgb.r + 0.5 * rgb.g - 0.25 * rgb.b;
    return vec3(y, co, cg);
}

vec3 YCoCgToRGB(vec3 ycocg)
{
    float y  = ycocg.r;
    float co = ycocg.g;
    float cg = ycocg.b;
    return vec3(y + co - cg, y + cg, y - co - cg);
}

vec2 clampHalfAtlasUv(vec2 uv, float minV, float maxV)
{
    return vec2(clamp(uv.x, 0.0005, 0.9995), clamp(uv.y, minV, maxV));
}

vec3 sampleCurrentRgb(vec2 uv, float minV, float maxV, bool swapBgr)
{
    vec3 s = texture(current_frame, clampHalfAtlasUv(uv, minV, maxV)).rgb;
    return swapBgr ? s.bgr : s;
}

vec3 SampleCatmullRom(vec2 uv, vec2 inv_size, float minV, float maxV, bool swapBgr)
{
    vec2 pos = uv / inv_size - 0.5;
    vec2 f = fract(pos);
    vec2 base = (floor(pos) + 0.5) * inv_size;

    vec2 w0 = f * (-0.5 + f * (1.0 - 0.5 * f));
    vec2 w1 = 1.0 + f * f * (-2.5 + 1.5 * f);
    vec2 w2 = f * (0.5 + f * (2.0 - 1.5 * f));
    vec2 w3 = f * f * (-0.5 + 0.5 * f);

    vec2 w12 = w1 + w2;
    vec2 safeW12 = max(abs(w12), vec2(1e-5));
    vec2 tc12 = base + (w2 / safeW12) * inv_size;
    vec2 tc0 = base - inv_size;
    vec2 tc3 = base + 2.0 * inv_size;

    vec3 s = vec3(0.0);
    s += sampleCurrentRgb(vec2(tc12.x, tc12.y), minV, maxV, swapBgr) * (w12.x * w12.y);
    s += sampleCurrentRgb(vec2(tc0.x,  tc12.y), minV, maxV, swapBgr) * (w0.x  * w12.y);
    s += sampleCurrentRgb(vec2(tc3.x,  tc12.y), minV, maxV, swapBgr) * (w3.x  * w12.y);
    s += sampleCurrentRgb(vec2(tc12.x, tc0.y ), minV, maxV, swapBgr) * (w12.x * w0.y);
    s += sampleCurrentRgb(vec2(tc12.x, tc3.y ), minV, maxV, swapBgr) * (w12.x * w3.y);
    return clamp(s, 0.0, 1.0);
}

void main()
{
    vec2 inv_render_size = max(render_size.zw, vec2(1e-6));
    bool swapBgr = params.x > 0.5;

    bool isBottomScreen = texcoord.y >= 0.5;
    float halfTexelV = 0.5 * inv_render_size.y;
    float minV = isBottomScreen ? (0.5 + halfTexelV) : halfTexelV;
    float maxV = isBottomScreen ? (1.0 - halfTexelV) : (0.5 - halfTexelV);

    vec2 uv_curr = texcoord + jitter_params.xy;
    vec3 curr_rgb = SampleCatmullRom(uv_curr, inv_render_size, minV, maxV, swapBgr);
    vec3 curr_ycocg = RGBToYCoCg(curr_rgb);

    float base_alpha = clamp(jitter_params.z, 0.0, 0.94);
    if (base_alpha <= 0.001) {
        out_color = vec4(curr_rgb, 1.0);
        return;
    }

    vec3 m1 = vec3(0.0);
    vec3 m2 = vec3(0.0);
    vec3 box_min = vec3(1e6);
    vec3 box_max = vec3(-1e6);

    vec3 sample_N  = RGBToYCoCg(sampleCurrentRgb(uv_curr + vec2( 0.0,               -inv_render_size.y), minV, maxV, swapBgr));
    vec3 sample_S  = RGBToYCoCg(sampleCurrentRgb(uv_curr + vec2( 0.0,                inv_render_size.y), minV, maxV, swapBgr));
    vec3 sample_W  = RGBToYCoCg(sampleCurrentRgb(uv_curr + vec2(-inv_render_size.x,  0.0),               minV, maxV, swapBgr));
    vec3 sample_E  = RGBToYCoCg(sampleCurrentRgb(uv_curr + vec2( inv_render_size.x,  0.0),               minV, maxV, swapBgr));
    vec3 sample_NW = RGBToYCoCg(sampleCurrentRgb(uv_curr + vec2(-inv_render_size.x, -inv_render_size.y), minV, maxV, swapBgr));
    vec3 sample_NE = RGBToYCoCg(sampleCurrentRgb(uv_curr + vec2( inv_render_size.x, -inv_render_size.y), minV, maxV, swapBgr));
    vec3 sample_SW = RGBToYCoCg(sampleCurrentRgb(uv_curr + vec2(-inv_render_size.x,  inv_render_size.y), minV, maxV, swapBgr));
    vec3 sample_SE = RGBToYCoCg(sampleCurrentRgb(uv_curr + vec2( inv_render_size.x,  inv_render_size.y), minV, maxV, swapBgr));

    vec3 neighbors[9] = vec3[9](
        curr_ycocg, sample_N, sample_S, sample_W, sample_E,
        sample_NW, sample_NE, sample_SW, sample_SE
    );
    for (int i = 0; i < 9; ++i) {
        m1 += neighbors[i];
        m2 += neighbors[i] * neighbors[i];
        box_min = min(box_min, neighbors[i]);
        box_max = max(box_max, neighbors[i]);
    }

    vec3 mean = m1 / 9.0;
    vec3 variance = max(m2 / 9.0 - mean * mean, vec3(0.0));
    vec3 stddev = sqrt(variance);

    float gamma = (jitter_params.w > 0.0) ? jitter_params.w : 1.25;
    box_min = max(box_min, mean - gamma * stddev);
    box_max = min(box_max, mean + gamma * stddev);

    float grad_x = (sample_E.x - sample_W.x) * 0.5;
    float grad_y = (sample_S.x - sample_N.x) * 0.5;
    vec2 grad = vec2(grad_x, grad_y);

    float histHalfV = 0.5 * max(display_size.w, 1e-6);
    float histMinV = isBottomScreen ? (0.5 + histHalfV) : histHalfV;
    float histMaxV = isBottomScreen ? (1.0 - histHalfV) : (0.5 - histHalfV);

    vec3 hist_raw_rgb = texture(history_frame, clampHalfAtlasUv(texcoord, histMinV, histMaxV)).rgb;
    vec3 hist_raw_ycocg = RGBToYCoCg(hist_raw_rgb);
    float luma_diff = abs(curr_ycocg.x - hist_raw_ycocg.x);

    vec2 flow = vec2(0.0);
    float grad_sq = dot(grad, grad);
    if (grad_sq > 1e-5) {
        flow = grad * ((hist_raw_ycocg.x - curr_ycocg.x) / (grad_sq + 0.005));
        flow = clamp(flow * inv_render_size, -inv_render_size * 2.0, inv_render_size * 2.0);
    }

    vec3 reprojected_hist_rgb = texture(history_frame, clampHalfAtlasUv(texcoord + flow, histMinV, histMaxV)).rgb;
    vec3 reprojected_hist_ycocg = RGBToYCoCg(reprojected_hist_rgb);
    vec3 clamped_hist_ycocg = clamp(reprojected_hist_ycocg, box_min, box_max);

    float disocclusion = clamp(luma_diff * 8.0, 0.0, 1.0);
    float blend_weight = mix(base_alpha, 0.0, disocclusion);

    vec3 accumulated_ycocg = mix(curr_ycocg, clamped_hist_ycocg, blend_weight);
    vec3 result_rgb = clamp(YCoCgToRGB(accumulated_ycocg), 0.0, 1.0);
    out_color = vec4(result_rgb, 1.0);
}

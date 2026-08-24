package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fe6  reason: default package */
/* loaded from: classes.dex */
public final class fe6 {
    public static final defpackage.fe6 d = null;
    public static final defpackage.fe6 e = null;
    public static final defpackage.fe6 f = null;
    public static final defpackage.fe6 g = null;
    public static final defpackage.fe6 h = null;
    public static final defpackage.fe6 i = null;
    public static final defpackage.fe6 j = null;
    public static final defpackage.fe6 k = null;
    public static final defpackage.fe6 l = null;
    public static final defpackage.fe6 m = null;
    public static final defpackage.fe6 n = null;
    public final defpackage.ee6 a;
    public final java.lang.String b;
    public final java.lang.String c;

    static {
            fe6 r0 = new fe6
            ee6 r1 = defpackage.ee6.LINEAR
            java.lang.String r2 = "attribute vec2 vUV;\nattribute vec2 vPos;\nvarying vec2 uv;\nvoid main()\n{\n    gl_Position = vec4(vPos, 0.0, 1.0);\n    uv = vUV;\n}"
            java.lang.String r3 = "precision mediump float;\nuniform sampler2D tex;\nvarying vec2 uv;\nvoid main()\n{\n    vec4 color = texture2D(tex, uv);\n    gl_FragColor = vec4(color.rgb, 1);\n}"
            r0.<init>(r1, r2, r3)
            defpackage.fe6.d = r0
            fe6 r0 = new fe6
            ee6 r2 = defpackage.ee6.NEAREST
            java.lang.String r3 = "attribute vec2 vUV;\nattribute vec2 vPos;\nattribute float vAlpha;\nvarying vec2 uv;\nvarying float alpha;\nvoid main()\n{\n    gl_Position = vec4(vPos, 0.0, 1.0);\n    uv = vUV;\n    alpha = vAlpha;\n}"
            java.lang.String r4 = "precision mediump float;\nuniform sampler2D tex;\nvarying vec2 uv;\nvarying float alpha;\nvoid main()\n{\n    vec4 color = texture2D(tex, uv);\n    gl_FragColor = vec4(color.bgr, alpha);\n}"
            r0.<init>(r2, r3, r4)
            defpackage.fe6.e = r0
            fe6 r0 = new fe6
            r0.<init>(r1, r3, r4)
            defpackage.fe6.f = r0
            fe6 r0 = new fe6
            r0.<init>(r1, r3, r4)
            defpackage.fe6.g = r0
            fe6 r0 = new fe6
            java.lang.String r4 = "attribute vec2 vPos;\nattribute vec2 vUV;\nattribute float vAlpha;\nvarying vec2 uv;\nvarying float alpha;\nvarying vec2 omega;\nvoid main() {\n    gl_Position = vec4(vPos, 0.0, 1.0);\n    uv = vUV;\n    alpha = vAlpha;\n    omega = 3.141592654 * 2.0 * vec2(256, 386);\n}"
            java.lang.String r5 = "#ifdef GL_FRAGMENT_PRECISION_HIGH\nprecision highp float;\n#else\nprecision mediump float;\n#endif\nuniform sampler2D tex;\nvarying vec2 uv;\nvarying float alpha;\nvarying vec2 omega;\n/* configuration (higher values mean brighter image but reduced effect depth) */\nconst float brighten_scanlines = 16.0;\nconst float brighten_lcd = 4.0;\nconst vec3 offsets = 3.141592654 * vec3(1.0/2.0,1.0/2.0 - 2.0/3.0,1.0/2.0-4.0/3.0);\nvoid main() {\n    vec2 angle = uv * omega;\n    float yfactor = (brighten_scanlines + sin(angle.y)) / (brighten_scanlines + 1.0);\n    vec3 xfactors = (brighten_lcd + sin(angle.x + offsets)) / (brighten_lcd + 1.0);\n    gl_FragColor.rgb = yfactor * xfactors * texture2D(tex, uv).bgr;\n    gl_FragColor.a = alpha;\n}"
            r0.<init>(r2, r4, r5)
            defpackage.fe6.h = r0
            fe6 r0 = new fe6
            java.lang.String r4 = "attribute vec2 vPos;\nattribute vec2 vUV;\nattribute float vAlpha;\nvarying vec2 uv;\nvarying float alpha;\nvarying vec2 omega;\nvec2 inputSize = vec2(256, 386);\nvec2 outputSize = vec2(256, 386);\nvoid main()\n{\n    gl_Position = vec4(vPos, 0.0, 1.0);\n    uv = vUV;\n    vec2 textureSize = vec2(256, 386);\n    alpha = vAlpha;\n    omega = vec2(3.1415 * outputSize.x * textureSize.x / inputSize.x, 2.0 * 3.1415 * textureSize.y);\n}"
            java.lang.String r5 = "#ifdef GL_FRAGMENT_PRECISION_HIGH\nprecision highp float;\n#else\nprecision mediump float;\n#endif\nuniform sampler2D tex;\nvarying float alpha;\nvarying vec2 uv;\nvarying vec2 omega;\nconst float base_brightness = 0.95;\nconst vec2 sine_comp = vec2(0.05, 0.15);\nvoid main ()\n{\n    vec4 color = vec4(texture2D(tex, uv).bgr, alpha);\n    vec4 scanline = color * (base_brightness + dot(sine_comp * sin(uv * omega), vec2(1.0)));\n    gl_FragColor = clamp(scanline, 0.0, 1.0);\n}"
            r0.<init>(r2, r4, r5)
            defpackage.fe6.i = r0
            fe6 r0 = new fe6
            java.lang.String r4 = "attribute vec2 vPos;\nattribute vec2 vUV;\nattribute float vAlpha;\nvarying vec2 uv[3];\nvarying float alpha;\nvoid main() {\n    vec2 ps = 1.0 / vec2(256, 386);\n    uv[0] = vUV;\n    uv[1] = vec2(0.0, -ps.y);\n    uv[2] = vec2(-ps.x, 0.0);\n    alpha = vAlpha;\n    gl_Position = vec4(vPos, 0.0, 1.0);\n}"
            java.lang.String r5 = "#ifdef GL_FRAGMENT_PRECISION_HIGH\nprecision highp float;\n#else\nprecision mediump float;\n#endif\nuniform sampler2D tex;\nvarying vec2 uv[3];\nvarying float alpha;\nconst vec3 dtt = vec3(65536.0, 255.0, 1.0);\nfloat reduce(vec3 color) {\n    return dot(color, dtt);\n}\nvoid main() {\n    vec2 fp = fract(uv[0] * vec2(256, 386));\n    vec2 g1 = uv[1] * (step(0.5, fp.x) + step(0.5, fp.y) - 1.0) +\n            uv[2] * (step(0.5, fp.x) - step(0.5, fp.y));\n    vec2 g2 = uv[1] * (step(0.5, fp.y) - step(0.5, fp.x)) +\n            uv[2] * (step(0.5, fp.x) + step(0.5, fp.y) - 1.0);\n    vec3 B = texture2D(tex, uv[0] + g1     ).bgr;\n    vec3 C = texture2D(tex, uv[0] + g1 - g2).bgr;\n    vec3 D = texture2D(tex, uv[0]      + g2).bgr;\n    vec3 E = texture2D(tex, uv[0]          ).bgr;\n    vec3 F = texture2D(tex, uv[0]      - g2).bgr;\n    vec3 G = texture2D(tex, uv[0] - g1 + g2).bgr;\n    vec3 H = texture2D(tex, uv[0] - g1     ).bgr;\n    vec3 I = texture2D(tex, uv[0] - g1 - g2).bgr;\n    float b = reduce(B);\n    float c = reduce(C);\n    float d = reduce(D);\n    float e = reduce(E);\n    float f = reduce(F);\n    float g = reduce(G);\n    float h = reduce(H);\n    float i = reduce(I);\n    gl_FragColor.rgb = E;\n    if (h==f && h!=e && ( e==g && (h==i || e==d) || e==c && (h==i || e==b) ))\n    {\n        gl_FragColor.rgb = mix(E, F, 0.5);\n    }\n    gl_FragColor.a = alpha;\n}"
            r0.<init>(r2, r4, r5)
            defpackage.fe6.j = r0
            fe6 r0 = new fe6
            java.lang.String r4 = "attribute vec2 vPos;\nattribute vec2 vUV;\nattribute float vAlpha;\nvarying vec4 uv[5];\nvarying float alpha;\nvoid main() {\n    vec2 dg1 = 0.5 / vec2(256, 386);\n    vec2 dg2 = vec2(-dg1.x, dg1.y);\n    vec2 dx = vec2(dg1.x, 0.0);\n    vec2 dy = vec2(0.0, dg1.y);\n    uv[0].xy = vUV;\n    uv[1].xy = vUV - dg1;\n    uv[1].zw = vUV - dy;\n    uv[2].xy = vUV - dg2;\n    uv[2].zw = vUV + dx;\n    uv[3].xy = vUV + dg1;\n    uv[3].zw = vUV + dy;\n    uv[4].xy = vUV + dg2;\n    uv[4].zw = vUV - dx;\n    alpha = vAlpha;\n    gl_Position = vec4(vPos, 0.0, 1.0);\n}"
            java.lang.String r5 = "#ifdef GL_FRAGMENT_PRECISION_HIGH\nprecision highp float;\n#else\nprecision mediump float;\n#endif\nuniform sampler2D tex;\nvarying vec4 uv[5];\nvarying float alpha;\n    const float mx = 0.325;      // start smoothing wt.\n    const float k = -0.250;      // wt. decrease factor\n    const float max_w = 0.25;    // max filter weigth\n    const float min_w =-0.05;    // min filter weigth\n    const float lum_add = 0.25;  // effects smoothing\nvoid main() {\n    vec3 c00 = texture2D(tex, uv[1].xy).xyz; \n    vec3 c10 = texture2D(tex, uv[1].zw).xyz; \n    vec3 c20 = texture2D(tex, uv[2].xy).xyz; \n    vec3 c01 = texture2D(tex, uv[4].zw).xyz; \n    vec3 c11 = texture2D(tex, uv[0].xy).xyz; \n    vec3 c21 = texture2D(tex, uv[2].zw).xyz; \n    vec3 c02 = texture2D(tex, uv[4].xy).xyz; \n    vec3 c12 = texture2D(tex, uv[3].zw).xyz; \n    vec3 c22 = texture2D(tex, uv[3].xy).xyz; \n    vec3 dt = vec3(1.0, 1.0, 1.0);\n    float md1 = dot(abs(c00 - c22), dt);\n    float md2 = dot(abs(c02 - c20), dt);\n    float w1 = dot(abs(c22 - c11), dt) * md2;\n    float w2 = dot(abs(c02 - c11), dt) * md1;\n    float w3 = dot(abs(c00 - c11), dt) * md2;\n    float w4 = dot(abs(c20 - c11), dt) * md1;\n    float t1 = w1 + w3;\n    float t2 = w2 + w4;\n    float ww = max(t1, t2) + 0.001;\n    c11 = (w1 * c00 + w2 * c20 + w3 * c22 + w4 * c02 + ww * c11) / (t1 + t2 + ww);\n    float lc1 = k / (0.12 * dot(c10 + c12 + c11, dt) + lum_add);\n    float lc2 = k / (0.12 * dot(c01 + c21 + c11, dt) + lum_add);\n    w1 = clamp(lc1 * dot(abs(c11 - c10), dt) + mx, min_w, max_w);\n    w2 = clamp(lc2 * dot(abs(c11 - c21), dt) + mx, min_w, max_w);\n    w3 = clamp(lc1 * dot(abs(c11 - c12), dt) + mx, min_w, max_w);\n    w4 = clamp(lc2 * dot(abs(c11 - c01), dt) + mx, min_w, max_w);\n    gl_FragColor.bgr = w1 * c10 + w2 * c21 + w3 * c12 + w4 * c01 + (1.0 - w1 - w2 - w3 - w4) * c11;\n    gl_FragColor.a = alpha;\n}"
            r0.<init>(r2, r4, r5)
            defpackage.fe6.k = r0
            fe6 r0 = new fe6
            java.lang.String r4 = "attribute vec2 vPos;\nattribute vec2 vUV;\nattribute float vAlpha;\nvarying vec4 uv[7];\nvarying float alpha;\nvoid main()\n{\n    vec2 dg1 = 0.5 / vec2(256, 386);\n    vec2 dg2 = vec2(-dg1.x, dg1.y);\n    vec2 sd1 = dg1 * 0.5;\n    vec2 sd2 = dg2 * 0.5;\n    vec2 ddx = vec2(dg1.x, 0.0);\n    vec2 ddy = vec2(0.0, dg1.y);\n    gl_Position = vec4(vPos, 0.0, 1.0);\n    uv[0].xy = vUV;\n    uv[1].xy = vUV - sd1;\n    uv[2].xy = vUV - sd2;\n    uv[3].xy = vUV + sd1;\n    uv[4].xy = vUV + sd2;\n    uv[5].xy = vUV - dg1;\n    uv[6].xy = vUV + dg1;\n    uv[5].zw = vUV - dg2;\n    uv[6].zw = vUV + dg2;\n    uv[1].zw = vUV - ddy;\n    uv[2].zw = vUV + ddx;\n    uv[3].zw = vUV + ddy;\n    uv[4].zw = vUV - ddx;\n    alpha = vAlpha;\n}"
            java.lang.String r5 = "#ifdef GL_FRAGMENT_PRECISION_HIGH\nprecision highp float;\n#else\nprecision mediump float;\n#endif\nuniform sampler2D tex;\nvarying vec4 uv[7];\nvarying float alpha;\nconst float mx = 1.00;      // start smoothing wt.\nconst float k = -1.10;      // wt. decrease factor\nconst float max_w = 0.75;   // max filter weigth\nconst float min_w = 0.03;   // min filter weigth\nconst float lum_add = 0.33; // effects smoothing\nvoid main()\n{\n    vec3 c  = texture2D(tex, uv[0].xy).bgr;\n    vec3 i1 = texture2D(tex, uv[1].xy).bgr;\n    vec3 i2 = texture2D(tex, uv[2].xy).bgr;\n    vec3 i3 = texture2D(tex, uv[3].xy).bgr;\n    vec3 i4 = texture2D(tex, uv[4].xy).bgr;\n    vec3 o1 = texture2D(tex, uv[5].xy).bgr;\n    vec3 o3 = texture2D(tex, uv[6].xy).bgr;\n    vec3 o2 = texture2D(tex, uv[5].zw).bgr;\n    vec3 o4 = texture2D(tex, uv[6].zw).bgr;\n    vec3 s1 = texture2D(tex, uv[1].zw).bgr;\n    vec3 s2 = texture2D(tex, uv[2].zw).bgr;\n    vec3 s3 = texture2D(tex, uv[3].zw).bgr;\n    vec3 s4 = texture2D(tex, uv[4].zw).bgr;\n    vec3 dt = vec3(1.0,1.0,1.0);\n    float ko1=dot(abs(o1-c),dt);\n    float ko2=dot(abs(o2-c),dt);\n    float ko3=dot(abs(o3-c),dt);\n    float ko4=dot(abs(o4-c),dt);\n    float k1=min(dot(abs(i1-i3),dt),max(ko1,ko3));\n    float k2=min(dot(abs(i2-i4),dt),max(ko2,ko4));\n    float w1 = k2; if(ko3<ko1) w1*=ko3/ko1;\n    float w2 = k1; if(ko4<ko2) w2*=ko4/ko2;\n    float w3 = k2; if(ko1<ko3) w3*=ko1/ko3;\n    float w4 = k1; if(ko2<ko4) w4*=ko2/ko4;\n    c=(w1*o1+w2*o2+w3*o3+w4*o4+0.001*c)/(w1+w2+w3+w4+0.001);\n    w1 = k*dot(abs(i1-c)+abs(i3-c),dt)/(0.125*dot(i1+i3,dt)+lum_add);\n    w2 = k*dot(abs(i2-c)+abs(i4-c),dt)/(0.125*dot(i2+i4,dt)+lum_add);\n    w3 = k*dot(abs(s1-c)+abs(s3-c),dt)/(0.125*dot(s1+s3,dt)+lum_add);\n    w4 = k*dot(abs(s2-c)+abs(s4-c),dt)/(0.125*dot(s2+s4,dt)+lum_add);\n    w1 = clamp(w1+mx,min_w,max_w); \n    w2 = clamp(w2+mx,min_w,max_w);\n    w3 = clamp(w3+mx,min_w,max_w); \n    w4 = clamp(w4+mx,min_w,max_w);\n    gl_FragColor.rgb = (w1*(i1+i3)+w2*(i2+i4)+w3*(s1+s3)+w4*(s2+s4)+c)/(2.0*(w1+w2+w3+w4)+1.0);\n    gl_FragColor.a = alpha;\n}"
            r0.<init>(r2, r4, r5)
            defpackage.fe6.l = r0
            fe6 r0 = new fe6
            java.lang.String r2 = "#ifdef GL_FRAGMENT_PRECISION_HIGH\nprecision highp float;\n#else\nprecision mediump float;\n#endif\nuniform sampler2D tex;\nvarying float alpha;\nvarying vec2 uv;\nvec4 getTexel(vec2 p) {\n    vec2 textureSize = vec2(256, 386);\n    p = p * textureSize + vec2(0.5);\n    vec2 i = floor(p);\n    vec2 f = p - i;\n    f = f * f * f * (f * (f * 6.0 - vec2(15.0)) + vec2(10.0));\n    p = i + f;\n    p = (p - vec2(0.5)) / textureSize;\n    return texture2D(tex, p);\n}\nvoid main() {\n    gl_FragColor = vec4(getTexel(uv).bgr, alpha);\n}"
            r0.<init>(r1, r3, r2)
            defpackage.fe6.m = r0
            fe6 r0 = new fe6
            java.lang.String r2 = "#ifdef GL_FRAGMENT_PRECISION_HIGH\nprecision highp float;\n#else\nprecision mediump float;\n#endif\nuniform sampler2D tex;\nvarying float alpha;\nvarying vec2 uv;\nfloat getLuma(vec4 c) {\n    return dot(c.bgr, vec3(0.299, 0.587, 0.114));\n}\nvoid main() {\n    vec2 dx = vec2(1.0 / float(256), 0.0);\n    vec2 dy = vec2(0.0, 1.0 / float(386));\n    vec4 C  = texture2D(tex, uv);\n    vec4 L  = texture2D(tex, uv - dx);\n    vec4 R  = texture2D(tex, uv + dx);\n    vec4 T  = texture2D(tex, uv - dy);\n    vec4 B  = texture2D(tex, uv + dy);\n    vec4 TL = texture2D(tex, uv - dx - dy);\n    vec4 TR = texture2D(tex, uv + dx - dy);\n    vec4 BL = texture2D(tex, uv - dx + dy);\n    vec4 BR = texture2D(tex, uv + dx + dy);\n    float lC  = getLuma(C);\n    float lL  = getLuma(L);\n    float lR  = getLuma(R);\n    float lT  = getLuma(T);\n    float lB  = getLuma(B);\n    float lTL = getLuma(TL);\n    float lTR = getLuma(TR);\n    float lBL = getLuma(BL);\n    float lBR = getLuma(BR);\n    // Sobel gradient computation for edge direction\n    float gx = (lTR + 2.0 * lR + lBR) - (lTL + 2.0 * lL + lBL);\n    float gy = (lBL + 2.0 * lB + lBR) - (lTL + 2.0 * lT + lTR);\n    float edgeStrength = sqrt(gx * gx + gy * gy);\n    vec4 result;\n    if (edgeStrength > 0.035) {\n        vec2 normGrad = vec2(gx, gy) / (edgeStrength + 0.0001);\n        vec2 pushOffset = -normGrad * (dx + dy) * clamp(edgeStrength * 3.5, 0.0, 0.85);\n        vec4 pushed = texture2D(tex, uv + pushOffset);\n        vec4 minCol = min(C, min(min(L, R), min(T, B)));\n        vec4 maxCol = max(C, max(max(L, R), max(T, B)));\n        result = clamp(pushed, minCol, maxCol);\n    } else {\n        // Adaptive bilateral smoothing on flat surfaces\n        result = (C * 4.0 + L + R + T + B) / 8.0;\n    }\n    // High-fidelity vibrant color output (inverting BGR to RGB)\n    vec3 finalRgb = result.bgr;\n    float finalLuma = dot(finalRgb, vec3(0.299, 0.587, 0.114));\n    finalRgb = mix(vec3(finalLuma), finalRgb, 1.10);\n    gl_FragColor = vec4(clamp(finalRgb, 0.0, 1.0), alpha);\n}"
            r0.<init>(r1, r3, r2)
            defpackage.fe6.n = r0
            return
    }

    public fe6(defpackage.ee6 r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }
}

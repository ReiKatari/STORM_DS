package t0;

import android.opengl.GLES20;
import java.nio.Buffer;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h extends g {

    /* renamed from: e  reason: collision with root package name */
    public final int f13060e;

    /* renamed from: f  reason: collision with root package name */
    public final int f13061f;

    /* renamed from: g  reason: collision with root package name */
    public final int f13062g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h(d0.a0 r3, t0.d r4) {
        /*
            r2 = this;
            java.lang.String r0 = "sTexture"
            boolean r3 = r3.a()
            if (r3 == 0) goto Lb
            java.lang.String r3 = t0.i.f13066d
            goto Ld
        Lb:
            java.lang.String r3 = t0.i.f13065c
        Ld:
            java.lang.String r1 = "vTextureCoord"
            int r4 = r4.f13055a     // Catch: java.lang.Throwable -> L5d
            switch(r4) {
                case 0: goto L1e;
                case 1: goto L19;
                default: goto L14;
            }     // Catch: java.lang.Throwable -> L5d
        L14:
            java.util.Locale r4 = java.util.Locale.US     // Catch: java.lang.Throwable -> L5d
            java.lang.String r4 = "#version 300 es\n#extension GL_EXT_YUV_target : require\nprecision mediump float;\nuniform __samplerExternal2DY2YEXT sTexture;\nuniform float uAlphaScale;\nin vec2 vTextureCoord;\nout vec4 outColor;\n\nvec3 yuvToRgb(vec3 yuv) {\n  const vec3 yuvOffset = vec3(0.0625, 0.5, 0.5);\n  const mat3 yuvToRgbColorMat = mat3(\n    1.1689f, 1.1689f, 1.1689f,\n    0.0000f, -0.1881f, 2.1502f,\n    1.6853f, -0.6530f, 0.0000f\n  );\n  return clamp(yuvToRgbColorMat * (yuv - yuvOffset), 0.0, 1.0);\n}\n\nvoid main() {\n  vec3 srcYuv = texture(sTexture, vTextureCoord).xyz;\n  vec3 srcRgb = yuvToRgb(srcYuv);\n  outColor = vec4(srcRgb, uAlphaScale);\n}"
            goto L22
        L19:
            java.util.Locale r4 = java.util.Locale.US     // Catch: java.lang.Throwable -> L5d
            java.lang.String r4 = "#version 300 es\n#extension GL_OES_EGL_image_external_essl3 : require\nprecision mediump float;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaScale;\nin vec2 vTextureCoord;\nout vec4 outColor;\n\nvoid main() {\n  vec4 src = texture(sTexture, vTextureCoord);\n  outColor = vec4(src.rgb, src.a * uAlphaScale);\n}"
            goto L22
        L1e:
            java.util.Locale r4 = java.util.Locale.US     // Catch: java.lang.Throwable -> L5d
            java.lang.String r4 = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaScale;\nvoid main() {\n    vec4 src = texture2D(sTexture, vTextureCoord);\n    gl_FragColor = vec4(src.rgb, src.a * uAlphaScale);\n}\n"
        L22:
            boolean r1 = r4.contains(r1)     // Catch: java.lang.Throwable -> L5d
            if (r1 == 0) goto L5f
            boolean r1 = r4.contains(r0)     // Catch: java.lang.Throwable -> L5d
            if (r1 == 0) goto L5f
            r2.<init>(r3, r4)
            r3 = -1
            r2.f13060e = r3
            r2.f13061f = r3
            r2.f13062g = r3
            r2.a()
            int r3 = r2.f13056a
            int r4 = android.opengl.GLES20.glGetUniformLocation(r3, r0)
            r2.f13060e = r4
            t0.i.e(r4, r0)
            java.lang.String r4 = "aTextureCoord"
            int r0 = android.opengl.GLES20.glGetAttribLocation(r3, r4)
            r2.f13062g = r0
            t0.i.e(r0, r4)
            java.lang.String r4 = "uTexMatrix"
            int r3 = android.opengl.GLES20.glGetUniformLocation(r3, r4)
            r2.f13061f = r3
            t0.i.e(r3, r4)
            return
        L5d:
            r3 = move-exception
            goto L67
        L5f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L5d
            java.lang.String r4 = "Invalid fragment shader"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L5d
            throw r3     // Catch: java.lang.Throwable -> L5d
        L67:
            boolean r4 = r3 instanceof java.lang.IllegalArgumentException
            if (r4 == 0) goto L6c
            throw r3
        L6c:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unable retrieve fragment shader source"
            r4.<init>(r0, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.h.<init>(d0.a0, t0.d):void");
    }

    @Override // t0.g
    public final void b() {
        super.b();
        GLES20.glUniform1i(this.f13060e, 0);
        GLES20.glEnableVertexAttribArray(this.f13062g);
        i.b("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.f13062g, 2, 5126, false, 0, (Buffer) i.f13071i);
        i.b("glVertexAttribPointer");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h(d0.a0 r4, t0.f r5) {
        /*
            r3 = this;
            boolean r0 = r4.a()
            if (r0 == 0) goto L28
            t0.f r0 = t0.f.UNKNOWN
            if (r5 == r0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "No default sampler shader available for"
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            p7.m.g(r1, r0)
            t0.f r0 = t0.f.YUV
            if (r5 != r0) goto L25
            t0.d r5 = t0.i.f13069g
            goto L2a
        L25:
            t0.d r5 = t0.i.f13068f
            goto L2a
        L28:
            t0.d r5 = t0.i.f13067e
        L2a:
            r3.<init>(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.h.<init>(d0.a0, t0.f):void");
    }
}

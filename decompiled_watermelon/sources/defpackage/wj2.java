package defpackage;

import android.opengl.GLES20;
import java.nio.Buffer;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wj2  reason: default package */
/* loaded from: classes.dex */
public final class wj2 extends vj2 {
    public final int e;
    public final int f;
    public final int g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public wj2(defpackage.sm1 r3, defpackage.sj2 r4) {
        /*
            r2 = this;
            java.lang.String r0 = "sTexture"
            boolean r3 = r3.a()
            if (r3 == 0) goto Lb
            java.lang.String r3 = defpackage.xj2.d
            goto Ld
        Lb:
            java.lang.String r3 = defpackage.xj2.c
        Ld:
            java.lang.String r1 = "vTextureCoord"
            int r4 = r4.a     // Catch: java.lang.Throwable -> L65
            switch(r4) {
                case 0: goto L1e;
                case 1: goto L19;
                default: goto L14;
            }     // Catch: java.lang.Throwable -> L65
        L14:
            java.util.Locale r4 = java.util.Locale.US     // Catch: java.lang.Throwable -> L65
            java.lang.String r4 = "#version 300 es\n#extension GL_EXT_YUV_target : require\nprecision mediump float;\nuniform __samplerExternal2DY2YEXT sTexture;\nuniform float uAlphaScale;\nin vec2 vTextureCoord;\nout vec4 outColor;\n\nvec3 yuvToRgb(vec3 yuv) {\n  const vec3 yuvOffset = vec3(0.0625, 0.5, 0.5);\n  const mat3 yuvToRgbColorMat = mat3(\n    1.1689f, 1.1689f, 1.1689f,\n    0.0000f, -0.1881f, 2.1502f,\n    1.6853f, -0.6530f, 0.0000f\n  );\n  return clamp(yuvToRgbColorMat * (yuv - yuvOffset), 0.0, 1.0);\n}\n\nvoid main() {\n  vec3 srcYuv = texture(sTexture, vTextureCoord).xyz;\n  vec3 srcRgb = yuvToRgb(srcYuv);\n  outColor = vec4(srcRgb, uAlphaScale);\n}"
            goto L22
        L19:
            java.util.Locale r4 = java.util.Locale.US     // Catch: java.lang.Throwable -> L65
            java.lang.String r4 = "#version 300 es\n#extension GL_OES_EGL_image_external_essl3 : require\nprecision mediump float;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaScale;\nin vec2 vTextureCoord;\nout vec4 outColor;\n\nvoid main() {\n  vec4 src = texture(sTexture, vTextureCoord);\n  outColor = vec4(src.rgb, src.a * uAlphaScale);\n}"
            goto L22
        L1e:
            java.util.Locale r4 = java.util.Locale.US     // Catch: java.lang.Throwable -> L65
            java.lang.String r4 = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaScale;\nvoid main() {\n    vec4 src = texture2D(sTexture, vTextureCoord);\n    gl_FragColor = vec4(src.rgb, src.a * uAlphaScale);\n}\n"
        L22:
            boolean r1 = r4.contains(r1)     // Catch: java.lang.Throwable -> L65
            if (r1 == 0) goto L5d
            boolean r1 = r4.contains(r0)     // Catch: java.lang.Throwable -> L65
            if (r1 == 0) goto L5d
            r2.<init>(r3, r4)
            r3 = -1
            r2.e = r3
            r2.f = r3
            r2.g = r3
            r2.a()
            int r3 = r2.a
            int r4 = android.opengl.GLES20.glGetUniformLocation(r3, r0)
            r2.e = r4
            defpackage.xj2.e(r4, r0)
            java.lang.String r4 = "aTextureCoord"
            int r0 = android.opengl.GLES20.glGetAttribLocation(r3, r4)
            r2.g = r0
            defpackage.xj2.e(r0, r4)
            java.lang.String r4 = "uTexMatrix"
            int r3 = android.opengl.GLES20.glGetUniformLocation(r3, r4)
            r2.f = r3
            defpackage.xj2.e(r3, r4)
            return
        L5d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L65
            java.lang.String r3 = "Invalid fragment shader"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L65
            throw r2     // Catch: java.lang.Throwable -> L65
        L65:
            r2 = move-exception
            boolean r3 = r2 instanceof java.lang.IllegalArgumentException
            if (r3 == 0) goto L6b
            throw r2
        L6b:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Unable retrieve fragment shader source"
            r3.<init>(r4, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wj2.<init>(sm1, sj2):void");
    }

    @Override // defpackage.vj2
    public final void b() {
        super.b();
        GLES20.glUniform1i(this.e, 0);
        GLES20.glEnableVertexAttribArray(this.g);
        xj2.b("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.g, 2, 5126, false, 0, (Buffer) xj2.i);
        xj2.b("glVertexAttribPointer");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public wj2(defpackage.sm1 r4, defpackage.uj2 r5) {
        /*
            r3 = this;
            boolean r0 = r4.a()
            if (r0 == 0) goto L28
            uj2 r0 = defpackage.uj2.UNKNOWN
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
            defpackage.nl2.y(r1, r0)
            uj2 r0 = defpackage.uj2.YUV
            if (r5 != r0) goto L25
            sj2 r5 = defpackage.xj2.g
            goto L2a
        L25:
            sj2 r5 = defpackage.xj2.f
            goto L2a
        L28:
            sj2 r5 = defpackage.xj2.e
        L2a:
            r3.<init>(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wj2.<init>(sm1, uj2):void");
    }
}

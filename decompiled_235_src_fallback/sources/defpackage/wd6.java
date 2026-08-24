package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wd6  reason: default package */
/* loaded from: classes.dex */
public final class wd6 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public wd6(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            android.opengl.GLES20.glUseProgram(r3)
            java.lang.String r1 = "vUV"
            int r1 = android.opengl.GLES20.glGetAttribLocation(r3, r1)
            r0.e = r1
            java.lang.String r1 = "vPos"
            int r1 = android.opengl.GLES20.glGetAttribLocation(r3, r1)
            r0.f = r1
            java.lang.String r1 = "vAlpha"
            int r1 = android.opengl.GLES20.glGetAttribLocation(r3, r1)
            r0.g = r1
            java.lang.String r1 = "tex"
            int r1 = android.opengl.GLES20.glGetUniformLocation(r3, r1)
            r0.h = r1
            r0 = 0
            android.opengl.GLES20.glUseProgram(r0)
            return
    }
}

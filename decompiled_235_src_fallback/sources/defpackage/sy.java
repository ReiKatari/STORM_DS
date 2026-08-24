package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sy  reason: default package */
/* loaded from: classes.dex */
public final class sy {
    public final android.opengl.EGLSurface a;
    public final int b;
    public final int c;

    public sy(android.opengl.EGLSurface r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto Lc
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
        Lc:
            java.lang.String r0 = "Null eglSurface"
            defpackage.u34.x(r0)
            r0 = 0
            throw r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.sy
            r2 = 0
            if (r1 == 0) goto L22
            sy r5 = (defpackage.sy) r5
            android.opengl.EGLSurface r1 = r4.a
            android.opengl.EGLSurface r3 = r5.a
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L22
            int r1 = r4.b
            int r3 = r5.b
            if (r1 != r3) goto L22
            int r4 = r4.c
            int r5 = r5.c
            if (r4 != r5) goto L22
            return r0
        L22:
            return r2
    }

    public final int hashCode() {
            r3 = this;
            android.opengl.EGLSurface r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            int r2 = r3.b
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r3 = r3.c
            r3 = r3 ^ r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "OutputSurface{eglSurface="
            r0.<init>(r1)
            android.opengl.EGLSurface r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", width="
            r0.append(r1)
            int r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", height="
            r0.append(r1)
            int r2 = r2.c
            java.lang.String r1 = "}"
            java.lang.String r2 = defpackage.lb1.o(r0, r2, r1)
            return r2
    }
}

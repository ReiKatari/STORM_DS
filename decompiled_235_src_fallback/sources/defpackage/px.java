package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: px  reason: default package */
/* loaded from: classes.dex */
public final class px {
    public final defpackage.jv6 a;
    public final int b;
    public final android.util.Size c;
    public final defpackage.yq1 d;
    public final java.util.List e;
    public final defpackage.yy0 f;
    public final int g;
    public final android.util.Range h;
    public final boolean i;
    public final int j;

    public px(defpackage.jv6 r1, int r2, android.util.Size r3, defpackage.yq1 r4, java.util.List r5, defpackage.yy0 r6, int r7, android.util.Range r8, boolean r9, int r10) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r1 = 0
            if (r4 == 0) goto L23
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            if (r8 == 0) goto L1d
            r0.h = r8
            r0.i = r9
            r0.j = r10
            return
        L1d:
            java.lang.String r0 = "Null targetFrameRate"
            defpackage.u34.x(r0)
            throw r1
        L23:
            java.lang.String r0 = "Null dynamicRange"
            defpackage.u34.x(r0)
            throw r1
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 != r2) goto L3
            goto L62
        L3:
            boolean r0 = r3 instanceof defpackage.px
            if (r0 == 0) goto L64
            px r3 = (defpackage.px) r3
            jv6 r0 = r2.a
            jv6 r1 = r3.a
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L64
            int r0 = r2.b
            int r1 = r3.b
            if (r0 != r1) goto L64
            android.util.Size r0 = r2.c
            android.util.Size r1 = r3.c
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L64
            yq1 r0 = r2.d
            yq1 r1 = r3.d
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L64
            java.util.List r0 = r2.e
            java.util.List r1 = r3.e
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L64
            yy0 r0 = r3.f
            yy0 r1 = r2.f
            if (r1 != 0) goto L40
            if (r0 != 0) goto L64
            goto L46
        L40:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L64
        L46:
            int r0 = r2.g
            int r1 = r3.g
            if (r0 != r1) goto L64
            android.util.Range r0 = r2.h
            android.util.Range r1 = r3.h
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L64
            boolean r0 = r2.i
            boolean r1 = r3.i
            if (r0 != r1) goto L64
            int r2 = r2.j
            int r3 = r3.j
            if (r2 != r3) goto L64
        L62:
            r2 = 1
            return r2
        L64:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r3 = this;
            jv6 r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            int r2 = r3.b
            r0 = r0 ^ r2
            int r0 = r0 * r1
            android.util.Size r2 = r3.c
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            yq1 r2 = r3.d
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.util.List r2 = r3.e
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            yy0 r2 = r3.f
            if (r2 != 0) goto L2d
            r2 = 0
            goto L31
        L2d:
            int r2 = r2.hashCode()
        L31:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r3.g
            r0 = r0 ^ r2
            int r0 = r0 * r1
            android.util.Range r2 = r3.h
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            boolean r2 = r3.i
            if (r2 == 0) goto L46
            r2 = 1231(0x4cf, float:1.725E-42)
            goto L48
        L46:
            r2 = 1237(0x4d5, float:1.733E-42)
        L48:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r3 = r3.j
            r3 = r3 ^ r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AttachedSurfaceInfo{surfaceConfig="
            r0.<init>(r1)
            jv6 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", imageFormat="
            r0.append(r1)
            int r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", size="
            r0.append(r1)
            android.util.Size r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", dynamicRange="
            r0.append(r1)
            yq1 r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", captureTypes="
            r0.append(r1)
            java.util.List r1 = r2.e
            r0.append(r1)
            java.lang.String r1 = ", implementationOptions="
            r0.append(r1)
            yy0 r1 = r2.f
            r0.append(r1)
            java.lang.String r1 = ", sessionType="
            r0.append(r1)
            int r1 = r2.g
            r0.append(r1)
            java.lang.String r1 = ", targetFrameRate="
            r0.append(r1)
            android.util.Range r1 = r2.h
            r0.append(r1)
            java.lang.String r1 = ", strictFrameRateRequired="
            r0.append(r1)
            boolean r1 = r2.i
            r0.append(r1)
            java.lang.String r1 = ", customMaxFrameRate="
            r0.append(r1)
            int r2 = r2.j
            java.lang.String r1 = "}"
            java.lang.String r2 = defpackage.lb1.o(r0, r2, r1)
            return r2
    }
}

package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yy  reason: default package */
/* loaded from: classes.dex */
public final class yy {
    public static final android.util.Range h = null;
    public final android.util.Size a;
    public final android.util.Size b;
    public final defpackage.yq1 c;
    public final int d;
    public final android.util.Range e;
    public final defpackage.yy0 f;
    public final boolean g;

    static {
            android.util.Range r0 = new android.util.Range
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.<init>(r1, r1)
            defpackage.yy.h = r0
            return
    }

    public yy(android.util.Size r1, android.util.Size r2, defpackage.yq1 r3, int r4, android.util.Range r5, defpackage.yy0 r6, boolean r7) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            return
    }

    public static defpackage.p87 a(android.util.Size r2) {
            p87 r0 = new p87
            r0.<init>()
            r1 = 0
            if (r2 == 0) goto L28
            r0.a = r2
            r0.b = r2
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.d = r2
            android.util.Range r2 = defpackage.yy.h
            if (r2 == 0) goto L22
            r0.e = r2
            yq1 r2 = defpackage.yq1.d
            r0.c = r2
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.g = r2
            return r0
        L22:
            java.lang.String r2 = "Null expectedFrameRateRange"
            defpackage.u34.x(r2)
            return r1
        L28:
            java.lang.String r2 = "Null resolution"
            defpackage.u34.x(r2)
            return r1
    }

    public final defpackage.p87 b() {
            r2 = this;
            p87 r0 = new p87
            r0.<init>()
            android.util.Size r1 = r2.a
            r0.a = r1
            android.util.Size r1 = r2.b
            r0.b = r1
            yq1 r1 = r2.c
            r0.c = r1
            int r1 = r2.d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.d = r1
            android.util.Range r1 = r2.e
            r0.e = r1
            yy0 r1 = r2.f
            r0.f = r1
            boolean r2 = r2.g
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.g = r2
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.yy
            r2 = 0
            if (r1 == 0) goto L4f
            yy r5 = (defpackage.yy) r5
            android.util.Size r1 = r4.a
            android.util.Size r3 = r5.a
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L4f
            android.util.Size r1 = r4.b
            android.util.Size r3 = r5.b
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L4f
            yq1 r1 = r4.c
            yq1 r3 = r5.c
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L4f
            int r1 = r4.d
            int r3 = r5.d
            if (r1 != r3) goto L4f
            android.util.Range r1 = r4.e
            android.util.Range r3 = r5.e
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L4f
            yy0 r1 = r5.f
            yy0 r3 = r4.f
            if (r3 != 0) goto L42
            if (r1 != 0) goto L4f
            goto L48
        L42:
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L4f
        L48:
            boolean r4 = r4.g
            boolean r5 = r5.g
            if (r4 != r5) goto L4f
            return r0
        L4f:
            return r2
    }

    public final int hashCode() {
            r3 = this;
            android.util.Size r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            android.util.Size r2 = r3.b
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            yq1 r2 = r3.c
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r3.d
            r0 = r0 ^ r2
            int r0 = r0 * r1
            android.util.Range r2 = r3.e
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
            boolean r3 = r3.g
            if (r3 == 0) goto L3a
            r3 = 1231(0x4cf, float:1.725E-42)
            goto L3c
        L3a:
            r3 = 1237(0x4d5, float:1.733E-42)
        L3c:
            r3 = r3 ^ r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "StreamSpec{resolution="
            r0.<init>(r1)
            android.util.Size r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", originalConfiguredResolution="
            r0.append(r1)
            android.util.Size r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", dynamicRange="
            r0.append(r1)
            yq1 r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", sessionType="
            r0.append(r1)
            int r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", expectedFrameRateRange="
            r0.append(r1)
            android.util.Range r1 = r2.e
            r0.append(r1)
            java.lang.String r1 = ", implementationOptions="
            r0.append(r1)
            yy0 r1 = r2.f
            r0.append(r1)
            java.lang.String r1 = ", zslDisabled="
            r0.append(r1)
            boolean r2 = r2.g
            java.lang.String r1 = "}"
            java.lang.String r2 = defpackage.i61.o(r0, r2, r1)
            return r2
    }
}

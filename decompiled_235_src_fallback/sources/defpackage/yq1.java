package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yq1  reason: default package */
/* loaded from: classes.dex */
public final class yq1 {
    public static final defpackage.yq1 c = null;
    public static final defpackage.yq1 d = null;
    public static final defpackage.yq1 e = null;
    public static final defpackage.yq1 f = null;
    public static final defpackage.yq1 g = null;
    public static final defpackage.yq1 h = null;
    public static final defpackage.yq1 i = null;
    public final int a;
    public final int b;

    static {
            yq1 r0 = new yq1
            r1 = 0
            r0.<init>(r1, r1)
            defpackage.yq1.c = r0
            yq1 r0 = new yq1
            r1 = 1
            r2 = 8
            r0.<init>(r1, r2)
            defpackage.yq1.d = r0
            yq1 r0 = new yq1
            r1 = 3
            r3 = 10
            r0.<init>(r1, r3)
            defpackage.yq1.e = r0
            yq1 r0 = new yq1
            r1 = 4
            r0.<init>(r1, r3)
            defpackage.yq1.f = r0
            yq1 r0 = new yq1
            r1 = 5
            r0.<init>(r1, r3)
            defpackage.yq1.g = r0
            yq1 r0 = new yq1
            r1 = 6
            r0.<init>(r1, r3)
            defpackage.yq1.h = r0
            yq1 r0 = new yq1
            r0.<init>(r1, r2)
            defpackage.yq1.i = r0
            return
    }

    public yq1(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public final boolean a() {
            r2 = this;
            boolean r0 = r2.b()
            if (r0 == 0) goto L12
            int r0 = r2.a
            r1 = 1
            if (r0 == r1) goto L12
            int r2 = r2.b
            r0 = 10
            if (r2 != r0) goto L12
            return r1
        L12:
            r2 = 0
            return r2
    }

    public final boolean b() {
            r2 = this;
            int r0 = r2.a
            if (r0 == 0) goto Ld
            r1 = 2
            if (r0 == r1) goto Ld
            int r2 = r2.b
            if (r2 == 0) goto Ld
            r2 = 1
            return r2
        Ld:
            r2 = 0
            return r2
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.yq1
            r2 = 0
            if (r1 == 0) goto L18
            yq1 r5 = (defpackage.yq1) r5
            int r1 = r4.a
            int r3 = r5.a
            if (r1 != r3) goto L18
            int r4 = r4.b
            int r5 = r5.b
            if (r4 != r5) goto L18
            return r0
        L18:
            return r2
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.a
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            int r2 = r2.b
            r2 = r2 ^ r0
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DynamicRange@"
            r0.<init>(r1)
            int r1 = java.lang.System.identityHashCode(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "{encoding="
            r0.append(r1)
            int r1 = r2.a
            switch(r1) {
                case 0: goto L31;
                case 1: goto L2e;
                case 2: goto L2b;
                case 3: goto L28;
                case 4: goto L25;
                case 5: goto L22;
                case 6: goto L1f;
                default: goto L1c;
            }
        L1c:
            java.lang.String r1 = "<Unknown>"
            goto L33
        L1f:
            java.lang.String r1 = "DOLBY_VISION"
            goto L33
        L22:
            java.lang.String r1 = "HDR10_PLUS"
            goto L33
        L25:
            java.lang.String r1 = "HDR10"
            goto L33
        L28:
            java.lang.String r1 = "HLG"
            goto L33
        L2b:
            java.lang.String r1 = "HDR_UNSPECIFIED"
            goto L33
        L2e:
            java.lang.String r1 = "SDR"
            goto L33
        L31:
            java.lang.String r1 = "UNSPECIFIED"
        L33:
            r0.append(r1)
            java.lang.String r1 = ", bitDepth="
            r0.append(r1)
            int r2 = r2.b
            java.lang.String r1 = "}"
            java.lang.String r2 = defpackage.lb1.o(r0, r2, r1)
            return r2
    }
}

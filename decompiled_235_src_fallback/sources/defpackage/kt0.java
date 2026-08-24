package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kt0  reason: default package */
/* loaded from: classes.dex */
public final class kt0 {
    public static final long b = 0;
    public static final long c = 0;
    public static final long d = 0;
    public static final long e = 0;
    public static final long f = 0;
    public static final long g = 0;
    public static final long h = 0;
    public static final /* synthetic */ int i = 0;
    public final long a;

    static {
            r0 = 4278190080(0xff000000, double:2.113706745E-314)
            long r0 = defpackage.hv.c(r0)
            defpackage.kt0.b = r0
            r0 = 4282664004(0xff444444, double:2.115917157E-314)
            defpackage.hv.c(r0)
            r0 = 4287137928(0xff888888, double:2.118127569E-314)
            long r0 = defpackage.hv.c(r0)
            defpackage.kt0.c = r0
            r0 = 4291611852(0xffcccccc, double:2.1203379814E-314)
            defpackage.hv.c(r0)
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = defpackage.hv.c(r0)
            defpackage.kt0.d = r0
            r0 = 4294901760(0xffff0000, double:2.121963412E-314)
            long r0 = defpackage.hv.c(r0)
            defpackage.kt0.e = r0
            r0 = 4278255360(0xff00ff00, double:2.1137389975E-314)
            defpackage.hv.c(r0)
            r0 = 4278190335(0xff0000ff, double:2.113706871E-314)
            long r0 = defpackage.hv.c(r0)
            defpackage.kt0.f = r0
            r0 = 4294967040(0xffffff00, double:2.1219956645E-314)
            defpackage.hv.c(r0)
            r0 = 4278255615(0xff00ffff, double:2.1137391235E-314)
            defpackage.hv.c(r0)
            r0 = 4294902015(0xffff00ff, double:2.121963538E-314)
            defpackage.hv.c(r0)
            r0 = 0
            long r0 = defpackage.hv.b(r0)
            defpackage.kt0.g = r0
            float[] r0 = defpackage.qt0.a
            cq5 r0 = defpackage.qt0.u
            r1 = 0
            long r0 = defpackage.hv.a(r1, r1, r1, r1, r0)
            defpackage.kt0.h = r0
            return
    }

    public /* synthetic */ kt0(long r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static final /* synthetic */ defpackage.kt0 a(long r1) {
            kt0 r0 = new kt0
            r0.<init>(r1)
            return r0
    }

    public static final long b(long r4, defpackage.nt0 r6) {
            nt0 r0 = g(r4)
            int r1 = r0.c
            int r2 = r6.c
            r3 = r1 | r2
            if (r3 >= 0) goto L11
            e01 r6 = defpackage.nc1.K(r0, r6)
            goto L26
        L11:
            p94 r3 = defpackage.f01.a
            int r2 = r2 << 6
            r1 = r1 | r2
            java.lang.Object r2 = r3.b(r1)
            if (r2 != 0) goto L23
            e01 r2 = defpackage.nc1.K(r0, r6)
            r3.i(r1, r2)
        L23:
            r6 = r2
            e01 r6 = (defpackage.e01) r6
        L26:
            long r4 = r6.a(r4)
            return r4
    }

    public static long c(float r3, long r4) {
            float r0 = i(r4)
            float r1 = h(r4)
            float r2 = f(r4)
            nt0 r4 = g(r4)
            long r3 = defpackage.hv.a(r0, r1, r2, r3, r4)
            return r3
    }

    public static final boolean d(long r0, long r2) {
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public static final float e(long r4) {
            r0 = 63
            long r0 = r0 & r4
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L18
            r0 = 56
            long r4 = r4 >>> r0
            r0 = 255(0xff, double:1.26E-321)
            long r4 = r4 & r0
            double r4 = defpackage.jx2.Q(r4)
            float r4 = (float) r4
            r5 = 1132396544(0x437f0000, float:255.0)
        L16:
            float r4 = r4 / r5
            return r4
        L18:
            r0 = 6
            long r4 = r4 >>> r0
            r0 = 1023(0x3ff, double:5.054E-321)
            long r4 = r4 & r0
            double r4 = defpackage.jx2.Q(r4)
            float r4 = (float) r4
            r5 = 1149222912(0x447fc000, float:1023.0)
            goto L16
    }

    public static final float f(long r5) {
            r0 = 63
            long r0 = r0 & r5
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L18
            r0 = 32
            long r5 = r5 >>> r0
            r0 = 255(0xff, double:1.26E-321)
            long r5 = r5 & r0
            double r5 = defpackage.jx2.Q(r5)
            float r5 = (float) r5
            r6 = 1132396544(0x437f0000, float:255.0)
            float r5 = r5 / r6
            return r5
        L18:
            r0 = 16
            long r5 = r5 >>> r0
            r1 = 65535(0xffff, double:3.23786E-319)
            long r5 = r5 & r1
            int r5 = (int) r5
            short r5 = (short) r5
            r6 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r5
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r5
            int r6 = r6 >>> 10
            r2 = 31
            r6 = r6 & r2
            r5 = r5 & 1023(0x3ff, float:1.434E-42)
            if (r6 != 0) goto L46
            if (r5 == 0) goto L43
            r6 = 1056964608(0x3f000000, float:0.5)
            int r5 = r5 + r6
            float r5 = java.lang.Float.intBitsToFloat(r5)
            float r6 = defpackage.wd2.a
            float r5 = r5 - r6
            if (r1 != 0) goto L41
            return r5
        L41:
            float r5 = -r5
            return r5
        L43:
            r5 = 0
            r6 = r5
            goto L58
        L46:
            int r5 = r5 << 13
            if (r6 != r2) goto L55
            r6 = 255(0xff, float:3.57E-43)
            if (r5 == 0) goto L51
            r2 = 4194304(0x400000, float:5.877472E-39)
            r5 = r5 | r2
        L51:
            r4 = r6
            r6 = r5
            r5 = r4
            goto L58
        L55:
            int r6 = r6 + 112
            goto L51
        L58:
            int r0 = r1 << 16
            int r5 = r5 << 23
            r5 = r5 | r0
            r5 = r5 | r6
            float r5 = java.lang.Float.intBitsToFloat(r5)
            return r5
    }

    public static final defpackage.nt0 g(long r2) {
            float[] r0 = defpackage.qt0.a
            r0 = 63
            long r2 = r2 & r0
            int r2 = (int) r2
            nt0[] r3 = defpackage.qt0.y
            r2 = r3[r2]
            return r2
    }

    public static final float h(long r5) {
            r0 = 63
            long r0 = r0 & r5
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L18
            r0 = 40
            long r5 = r5 >>> r0
            r0 = 255(0xff, double:1.26E-321)
            long r5 = r5 & r0
            double r5 = defpackage.jx2.Q(r5)
            float r5 = (float) r5
            r6 = 1132396544(0x437f0000, float:255.0)
            float r5 = r5 / r6
            return r5
        L18:
            r0 = 32
            long r5 = r5 >>> r0
            r0 = 65535(0xffff, double:3.23786E-319)
            long r5 = r5 & r0
            int r5 = (int) r5
            short r5 = (short) r5
            r6 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r5
            r0 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r5
            int r6 = r6 >>> 10
            r1 = 31
            r6 = r6 & r1
            r5 = r5 & 1023(0x3ff, float:1.434E-42)
            if (r6 != 0) goto L46
            if (r5 == 0) goto L43
            r6 = 1056964608(0x3f000000, float:0.5)
            int r5 = r5 + r6
            float r5 = java.lang.Float.intBitsToFloat(r5)
            float r6 = defpackage.wd2.a
            float r5 = r5 - r6
            if (r0 != 0) goto L41
            return r5
        L41:
            float r5 = -r5
            return r5
        L43:
            r5 = 0
            r6 = r5
            goto L58
        L46:
            int r5 = r5 << 13
            if (r6 != r1) goto L55
            r6 = 255(0xff, float:3.57E-43)
            if (r5 == 0) goto L51
            r1 = 4194304(0x400000, float:5.877472E-39)
            r5 = r5 | r1
        L51:
            r4 = r6
            r6 = r5
            r5 = r4
            goto L58
        L55:
            int r6 = r6 + 112
            goto L51
        L58:
            int r0 = r0 << 16
            int r5 = r5 << 23
            r5 = r5 | r0
            r5 = r5 | r6
            float r5 = java.lang.Float.intBitsToFloat(r5)
            return r5
    }

    public static final float i(long r5) {
            r0 = 63
            long r0 = r0 & r5
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 48
            if (r0 != 0) goto L18
            long r5 = r5 >>> r1
            r0 = 255(0xff, double:1.26E-321)
            long r5 = r5 & r0
            double r5 = defpackage.jx2.Q(r5)
            float r5 = (float) r5
            r6 = 1132396544(0x437f0000, float:255.0)
            float r5 = r5 / r6
            return r5
        L18:
            long r5 = r5 >>> r1
            r0 = 65535(0xffff, double:3.23786E-319)
            long r5 = r5 & r0
            int r5 = (int) r5
            short r5 = (short) r5
            r6 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r5
            r0 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r5
            int r6 = r6 >>> 10
            r1 = 31
            r6 = r6 & r1
            r5 = r5 & 1023(0x3ff, float:1.434E-42)
            if (r6 != 0) goto L44
            if (r5 == 0) goto L41
            r6 = 1056964608(0x3f000000, float:0.5)
            int r5 = r5 + r6
            float r5 = java.lang.Float.intBitsToFloat(r5)
            float r6 = defpackage.wd2.a
            float r5 = r5 - r6
            if (r0 != 0) goto L3f
            return r5
        L3f:
            float r5 = -r5
            return r5
        L41:
            r5 = 0
            r6 = r5
            goto L56
        L44:
            int r5 = r5 << 13
            if (r6 != r1) goto L53
            r6 = 255(0xff, float:3.57E-43)
            if (r5 == 0) goto L4f
            r1 = 4194304(0x400000, float:5.877472E-39)
            r5 = r5 | r1
        L4f:
            r4 = r6
            r6 = r5
            r5 = r4
            goto L56
        L53:
            int r6 = r6 + 112
            goto L4f
        L56:
            int r0 = r0 << 16
            int r5 = r5 << 23
            r5 = r5 | r0
            r5 = r5 | r6
            float r5 = java.lang.Float.intBitsToFloat(r5)
            return r5
    }

    public static java.lang.String j(long r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Color("
            r0.<init>(r1)
            float r1 = i(r3)
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            float r2 = h(r3)
            r0.append(r2)
            r0.append(r1)
            float r2 = f(r3)
            r0.append(r2)
            r0.append(r1)
            float r2 = e(r3)
            r0.append(r2)
            r0.append(r1)
            nt0 r3 = g(r3)
            java.lang.String r3 = r3.a
            r4 = 41
            java.lang.String r3 = defpackage.lb1.q(r0, r3, r4)
            return r3
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.kt0
            if (r0 != 0) goto L5
            goto Lf
        L5:
            kt0 r3 = (defpackage.kt0) r3
            long r0 = r3.a
            long r2 = r2.a
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 == 0) goto L11
        Lf:
            r2 = 0
            return r2
        L11:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            long r0 = r2.a
            int r2 = java.lang.Long.hashCode(r0)
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            long r0 = r2.a
            java.lang.String r2 = j(r0)
            return r2
    }
}

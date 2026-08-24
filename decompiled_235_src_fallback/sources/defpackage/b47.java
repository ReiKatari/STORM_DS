package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b47  reason: default package */
/* loaded from: classes.dex */
public final class b47 {
    public final defpackage.a47 a;
    public defpackage.jk3 b;
    public defpackage.jk3 c;

    public b47(defpackage.a47 r1, defpackage.jk3 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r1 = 0
            r0.b = r1
            r0.c = r2
            return
    }

    public final long a(long r7) {
            r6 = this;
            jk3 r0 = r6.b
            of5 r1 = defpackage.of5.e
            if (r0 == 0) goto L1d
            boolean r2 = r0.t()
            if (r2 == 0) goto L18
            jk3 r6 = r6.c
            if (r6 == 0) goto L16
            r2 = 1
            of5 r6 = r6.O(r0, r2)
            goto L19
        L16:
            r6 = 0
            goto L19
        L18:
            r6 = r1
        L19:
            if (r6 != 0) goto L1c
            goto L1d
        L1c:
            r1 = r6
        L1d:
            r6 = 32
            long r2 = r7 >> r6
            int r0 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r0)
            float r3 = r1.a
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L2d
            goto L3c
        L2d:
            float r2 = java.lang.Float.intBitsToFloat(r0)
            float r3 = r1.c
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L38
            goto L3c
        L38:
            float r3 = java.lang.Float.intBitsToFloat(r0)
        L3c:
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r4
            int r7 = (int) r7
            float r8 = java.lang.Float.intBitsToFloat(r7)
            float r0 = r1.b
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 >= 0) goto L4e
            goto L5d
        L4e:
            float r8 = java.lang.Float.intBitsToFloat(r7)
            float r0 = r1.d
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 <= 0) goto L59
            goto L5d
        L59:
            float r0 = java.lang.Float.intBitsToFloat(r7)
        L5d:
            int r7 = java.lang.Float.floatToRawIntBits(r3)
            long r7 = (long) r7
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r0 = (long) r0
            long r6 = r7 << r6
            long r0 = r0 & r4
            long r6 = r6 | r0
            return r6
    }

    public final int b(long r1, boolean r3) {
            r0 = this;
            if (r3 == 0) goto L6
            long r1 = r0.a(r1)
        L6:
            long r1 = r0.d(r1)
            a47 r0 = r0.a
            v84 r0 = r0.b
            int r0 = r0.g(r1)
            return r0
    }

    public final boolean c(long r3) {
            r2 = this;
            long r3 = r2.a(r3)
            long r3 = r2.d(r3)
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r3
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            a47 r2 = r2.a
            v84 r1 = r2.b
            int r0 = r1.e(r0)
            r1 = 32
            long r3 = r3 >> r1
            int r3 = (int) r3
            float r4 = java.lang.Float.intBitsToFloat(r3)
            float r1 = r2.e(r0)
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 < 0) goto L39
            float r3 = java.lang.Float.intBitsToFloat(r3)
            float r2 = r2.f(r0)
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 > 0) goto L39
            r2 = 1
            return r2
        L39:
            r2 = 0
            return r2
    }

    public final long d(long r4) {
            r3 = this;
            jk3 r0 = r3.b
            if (r0 == 0) goto L23
            boolean r1 = r0.t()
            r2 = 0
            if (r1 == 0) goto Lc
            goto Ld
        Lc:
            r0 = r2
        Ld:
            if (r0 != 0) goto L10
            goto L23
        L10:
            jk3 r3 = r3.c
            if (r3 == 0) goto L23
            boolean r1 = r3.t()
            if (r1 == 0) goto L1b
            r2 = r3
        L1b:
            if (r2 != 0) goto L1e
            goto L23
        L1e:
            long r3 = r0.J(r2, r4)
            return r3
        L23:
            return r4
    }

    public final long e(long r4) {
            r3 = this;
            jk3 r0 = r3.b
            if (r0 == 0) goto L23
            boolean r1 = r0.t()
            r2 = 0
            if (r1 == 0) goto Lc
            goto Ld
        Lc:
            r0 = r2
        Ld:
            if (r0 != 0) goto L10
            goto L23
        L10:
            jk3 r3 = r3.c
            if (r3 == 0) goto L23
            boolean r1 = r3.t()
            if (r1 == 0) goto L1b
            r2 = r3
        L1b:
            if (r2 != 0) goto L1e
            goto L23
        L1e:
            long r3 = r2.J(r0, r4)
            return r3
        L23:
            return r4
    }
}

package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kv  reason: default package */
/* loaded from: classes.dex */
public final class kv extends defpackage.z64 implements defpackage.jm3 {
    public float k0;

    public final long R0(long r3, boolean r5) {
            r2 = this;
            int r0 = defpackage.q21.g(r3)
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L28
            float r1 = (float) r0
            float r2 = r2.k0
            float r1 = r1 * r2
            int r2 = java.lang.Math.round(r1)
            if (r2 <= 0) goto L28
            if (r5 == 0) goto L1b
            boolean r3 = defpackage.ak7.m0(r3, r2, r0)
            if (r3 == 0) goto L28
        L1b:
            long r2 = (long) r2
            r4 = 32
            long r2 = r2 << r4
            long r4 = (long) r0
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r0
            long r2 = r2 | r4
            return r2
        L28:
            r2 = 0
            return r2
    }

    public final long S0(long r5, boolean r7) {
            r4 = this;
            int r0 = defpackage.q21.h(r5)
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L29
            float r1 = (float) r0
            float r4 = r4.k0
            float r1 = r1 / r4
            int r4 = java.lang.Math.round(r1)
            if (r4 <= 0) goto L29
            if (r7 == 0) goto L1b
            boolean r5 = defpackage.ak7.m0(r5, r0, r4)
            if (r5 == 0) goto L29
        L1b:
            long r5 = (long) r0
            r7 = 32
            long r5 = r5 << r7
            long r0 = (long) r4
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r4 = r5 | r0
            return r4
        L29:
            r4 = 0
            return r4
    }

    public final long T0(long r3, boolean r5) {
            r2 = this;
            int r0 = defpackage.q21.i(r3)
            float r1 = (float) r0
            float r2 = r2.k0
            float r1 = r1 * r2
            int r2 = java.lang.Math.round(r1)
            if (r2 <= 0) goto L23
            if (r5 == 0) goto L16
            boolean r3 = defpackage.ak7.m0(r3, r2, r0)
            if (r3 == 0) goto L23
        L16:
            long r2 = (long) r2
            r4 = 32
            long r2 = r2 << r4
            long r4 = (long) r0
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r0
            long r2 = r2 | r4
            return r2
        L23:
            r2 = 0
            return r2
    }

    public final long U0(long r5, boolean r7) {
            r4 = this;
            int r0 = defpackage.q21.j(r5)
            float r1 = (float) r0
            float r4 = r4.k0
            float r1 = r1 / r4
            int r4 = java.lang.Math.round(r1)
            if (r4 <= 0) goto L24
            if (r7 == 0) goto L16
            boolean r5 = defpackage.ak7.m0(r5, r0, r4)
            if (r5 == 0) goto L24
        L16:
            long r5 = (long) r0
            r7 = 32
            long r5 = r5 << r7
            long r0 = (long) r4
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r4 = r5 | r0
            return r4
        L24:
            r4 = 0
            return r4
    }

    @Override // defpackage.jm3
    public final int Z(defpackage.kz3 r1, defpackage.x24 r2, int r3) {
            r0 = this;
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == r1) goto Le
            float r1 = (float) r3
            float r0 = r0.k0
            float r1 = r1 / r0
            int r0 = java.lang.Math.round(r1)
            return r0
        Le:
            int r0 = r2.c(r3)
            return r0
    }

    @Override // defpackage.jm3
    public final defpackage.f34 c(defpackage.g34 r8, defpackage.x24 r9, long r10) {
            r7 = this;
            r0 = 1
            long r1 = r7.S0(r10, r0)
            r3 = 0
            boolean r5 = defpackage.q93.b(r1, r3)
            r6 = 0
            if (r5 != 0) goto Lf
            goto L5d
        Lf:
            long r1 = r7.R0(r10, r0)
            boolean r5 = defpackage.q93.b(r1, r3)
            if (r5 != 0) goto L1a
            goto L5d
        L1a:
            long r1 = r7.U0(r10, r0)
            boolean r5 = defpackage.q93.b(r1, r3)
            if (r5 != 0) goto L25
            goto L5d
        L25:
            long r1 = r7.T0(r10, r0)
            boolean r5 = defpackage.q93.b(r1, r3)
            if (r5 != 0) goto L30
            goto L5d
        L30:
            long r1 = r7.S0(r10, r6)
            boolean r5 = defpackage.q93.b(r1, r3)
            if (r5 != 0) goto L3b
            goto L5d
        L3b:
            long r1 = r7.R0(r10, r6)
            boolean r5 = defpackage.q93.b(r1, r3)
            if (r5 != 0) goto L46
            goto L5d
        L46:
            long r1 = r7.U0(r10, r6)
            boolean r5 = defpackage.q93.b(r1, r3)
            if (r5 != 0) goto L51
            goto L5d
        L51:
            long r1 = r7.T0(r10, r6)
            boolean r7 = defpackage.q93.b(r1, r3)
            if (r7 != 0) goto L5c
            goto L5d
        L5c:
            r1 = r3
        L5d:
            boolean r7 = defpackage.q93.b(r1, r3)
            if (r7 != 0) goto L84
            r7 = 32
            long r10 = r1 >> r7
            int r7 = (int) r10
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r10 = r10 & r1
            int r10 = (int) r10
            if (r7 < 0) goto L73
            r11 = r0
            goto L74
        L73:
            r11 = r6
        L74:
            if (r10 < 0) goto L77
            goto L78
        L77:
            r0 = r6
        L78:
            r11 = r11 & r0
            if (r11 != 0) goto L80
            java.lang.String r11 = "width and height must be >= 0"
            defpackage.r53.a(r11)
        L80:
            long r10 = defpackage.s21.h(r7, r7, r10, r10)
        L84:
            dx4 r7 = r9.y(r10)
            int r9 = r7.A
            int r10 = r7.B
            jv r11 = new jv
            r11.<init>(r7, r6)
            zt1 r7 = defpackage.zt1.A
            f34 r7 = r8.K(r9, r10, r7, r11)
            return r7
    }

    @Override // defpackage.jm3
    public final int f(defpackage.kz3 r1, defpackage.x24 r2, int r3) {
            r0 = this;
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == r1) goto Le
            float r1 = (float) r3
            float r0 = r0.k0
            float r1 = r1 * r0
            int r0 = java.lang.Math.round(r1)
            return r0
        Le:
            int r0 = r2.u(r3)
            return r0
    }

    @Override // defpackage.jm3
    public final int h0(defpackage.kz3 r1, defpackage.x24 r2, int r3) {
            r0 = this;
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == r1) goto Le
            float r1 = (float) r3
            float r0 = r0.k0
            float r1 = r1 / r0
            int r0 = java.lang.Math.round(r1)
            return r0
        Le:
            int r0 = r2.V(r3)
            return r0
    }

    @Override // defpackage.jm3
    public final int s0(defpackage.kz3 r1, defpackage.x24 r2, int r3) {
            r0 = this;
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == r1) goto Le
            float r1 = (float) r3
            float r0 = r0.k0
            float r1 = r1 * r0
            int r0 = java.lang.Math.round(r1)
            return r0
        Le:
            int r0 = r2.n(r3)
            return r0
    }
}

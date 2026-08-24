package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y53  reason: default package */
/* loaded from: classes.dex */
public final class y53 extends defpackage.eg4 {
    public static final defpackage.aj R0 = null;
    public final defpackage.vy6 P0;
    public defpackage.x53 Q0;

    static {
            aj r0 = defpackage.nc1.t()
            int r1 = defpackage.kt0.i
            long r1 = defpackage.kt0.e
            r0.l(r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.s(r1)
            r1 = 1
            r0.t(r1)
            defpackage.y53.R0 = r0
            return
    }

    public y53(defpackage.sm3 r3) {
            r2 = this;
            r2.<init>(r3)
            vy6 r0 = new vy6
            r0.<init>()
            r1 = 0
            r0.R = r1
            r2.P0 = r0
            r0.d0 = r2
            sm3 r3 = r3.e0
            if (r3 == 0) goto L19
            x53 r3 = new x53
            r3.<init>(r2)
            goto L1a
        L19:
            r3 = 0
        L1a:
            r2.Q0 = r3
            return
    }

    @Override // defpackage.eg4
    public final void T0() {
            r1 = this;
            x53 r0 = r1.Q0
            if (r0 != 0) goto Lb
            x53 r0 = new x53
            r0.<init>(r1)
            r1.Q0 = r0
        Lb:
            return
    }

    @Override // defpackage.x24
    public final int V(int r3) {
            r2 = this;
            sm3 r2 = r2.k0
            yc1 r2 = r2.u()
            e34 r0 = r2.D()
            java.lang.Object r2 = r2.A
            sm3 r2 = (defpackage.sm3) r2
            if0 r1 = r2.B0
            java.lang.Object r1 = r1.e
            eg4 r1 = (defpackage.eg4) r1
            java.util.List r2 = r2.m()
            int r2 = r0.i(r1, r2, r3)
            return r2
    }

    @Override // defpackage.eg4
    public final defpackage.mz3 W0() {
            r0 = this;
            x53 r0 = r0.Q0
            return r0
    }

    @Override // defpackage.eg4
    public final defpackage.z64 Y0() {
            r0 = this;
            vy6 r0 = r0.P0
            return r0
    }

    @Override // defpackage.x24
    public final int c(int r3) {
            r2 = this;
            sm3 r2 = r2.k0
            yc1 r2 = r2.u()
            e34 r0 = r2.D()
            java.lang.Object r2 = r2.A
            sm3 r2 = (defpackage.sm3) r2
            if0 r1 = r2.B0
            java.lang.Object r1 = r1.e
            eg4 r1 = (defpackage.eg4) r1
            java.util.List r2 = r2.m()
            int r2 = r0.g(r1, r2, r3)
            return r2
    }

    @Override // defpackage.eg4
    public final void e1(defpackage.cg4 r12, long r13, defpackage.zx2 r15, int r16, boolean r17) {
            r11 = this;
            sm3 r0 = r11.k0
            boolean r1 = r12.i(r0)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L30
            boolean r1 = r11.z1(r13)
            if (r1 == 0) goto L16
            r9 = r16
            r10 = r17
        L14:
            r3 = r2
            goto L34
        L16:
            r9 = r16
            if (r9 != r2) goto L32
            long r4 = r11.X0()
            float r11 = r11.Q0(r13, r4)
            int r11 = java.lang.Float.floatToRawIntBits(r11)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r11 = r11 & r1
            r1 = 2139095040(0x7f800000, float:Infinity)
            if (r11 >= r1) goto L32
            r10 = r3
            goto L14
        L30:
            r9 = r16
        L32:
            r10 = r17
        L34:
            if (r3 == 0) goto L7a
            int r11 = r15.L
            ua4 r0 = r0.y()
            java.lang.Object[] r1 = r0.A
            int r0 = r0.L
            int r0 = r0 - r2
        L41:
            if (r0 < 0) goto L78
            r2 = r1[r0]
            r5 = r2
            sm3 r5 = (defpackage.sm3) r5
            boolean r2 = r5.I()
            if (r2 == 0) goto L73
            r4 = r12
            r6 = r13
            r8 = r15
            r4.e(r5, r6, r8, r9, r10)
            long r2 = r15.a()
            float r6 = defpackage.vy7.m0(r2)
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L73
            boolean r6 = defpackage.vy7.o0(r2)
            if (r6 == 0) goto L73
            boolean r2 = defpackage.vy7.n0(r2)
            if (r2 != 0) goto L73
            boolean r2 = r12.g(r15, r5)
            if (r2 == 0) goto L78
        L73:
            int r0 = r0 + (-1)
            r9 = r16
            goto L41
        L78:
            r15.L = r11
        L7a:
            return
    }

    @Override // defpackage.dx4
    public final void h0(long r2, float r4, defpackage.qn2 r5) {
            r1 = this;
            boolean r0 = r1.l0
            if (r0 == 0) goto L11
            mz3 r2 = r1.W0()
            r2.getClass()
            long r2 = r2.l0
            r1.o1(r2, r4, r5)
            goto L14
        L11:
            r1.o1(r2, r4, r5)
        L14:
            boolean r2 = r1.f0
            if (r2 == 0) goto L19
            return
        L19:
            sm3 r1 = r1.k0
            wm3 r1 = r1.C0
            d34 r1 = r1.p
            r1.z0()
            return
    }

    @Override // defpackage.x24
    public final int n(int r3) {
            r2 = this;
            sm3 r2 = r2.k0
            yc1 r2 = r2.u()
            e34 r0 = r2.D()
            java.lang.Object r2 = r2.A
            sm3 r2 = (defpackage.sm3) r2
            if0 r1 = r2.B0
            java.lang.Object r1 = r1.e
            eg4 r1 = (defpackage.eg4) r1
            java.util.List r2 = r2.m()
            int r2 = r0.e(r1, r2, r3)
            return r2
    }

    @Override // defpackage.eg4
    public final void n1(defpackage.xj0 r9, defpackage.ut2 r10) {
            r8 = this;
            sm3 r0 = r8.k0
            zp4 r1 = defpackage.vm3.a(r0)
            ua4 r0 = r0.y()
            java.lang.Object[] r2 = r0.A
            int r0 = r0.L
            r3 = 0
        Lf:
            if (r3 >= r0) goto L21
            r4 = r2[r3]
            sm3 r4 = (defpackage.sm3) r4
            boolean r5 = r4.I()
            if (r5 == 0) goto L1e
            r4.i(r9, r10)
        L1e:
            int r3 = r3 + 1
            goto Lf
        L21:
            te r1 = (defpackage.te) r1
            boolean r10 = r1.getShowLayoutBounds()
            if (r10 == 0) goto L49
            long r0 = r8.L
            r8 = 32
            long r2 = r0 >> r8
            int r8 = (int) r2
            float r8 = (float) r8
            r10 = 1056964608(0x3f000000, float:0.5)
            float r5 = r8 - r10
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            int r8 = (int) r0
            float r8 = (float) r8
            float r6 = r8 - r10
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1056964608(0x3f000000, float:0.5)
            aj r7 = defpackage.y53.R0
            r2 = r9
            r2.k(r3, r4, r5, r6, r7)
        L49:
            return
    }

    @Override // defpackage.x24
    public final int u(int r3) {
            r2 = this;
            sm3 r2 = r2.k0
            yc1 r2 = r2.u()
            e34 r0 = r2.D()
            java.lang.Object r2 = r2.A
            sm3 r2 = (defpackage.sm3) r2
            if0 r1 = r2.B0
            java.lang.Object r1 = r1.e
            eg4 r1 = (defpackage.eg4) r1
            java.util.List r2 = r2.m()
            int r2 = r0.a(r1, r2, r3)
            return r2
    }

    @Override // defpackage.kz3
    public final int u0(defpackage.ey2 r5) {
            r4 = this;
            x53 r0 = r4.Q0
            if (r0 == 0) goto L9
            int r4 = r0.u0(r5)
            return r4
        L9:
            sm3 r4 = r4.k0
            wm3 r4 = r4.C0
            d34 r4 = r4.p
            tm3 r0 = r4.t0
            boolean r1 = r4.i0
            r2 = 1
            if (r1 != 0) goto L2b
            wm3 r1 = r4.Y
            om3 r1 = r1.d
            om3 r3 = defpackage.om3.Measuring
            if (r1 != r3) goto L29
            r0.f = r2
            boolean r1 = r0.b
            if (r1 == 0) goto L2b
            r4.r0 = r2
            r4.s0 = r2
            goto L2b
        L29:
            r0.g = r2
        L2b:
            y53 r1 = r4.f()
            boolean r3 = r1.g0
            r1.g0 = r2
            r4.I()
            r1.g0 = r3
            java.util.HashMap r4 = r0.i
            java.lang.Object r4 = r4.get(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L47
            int r4 = r4.intValue()
            return r4
        L47:
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            return r4
    }

    @Override // defpackage.x24
    public final defpackage.dx4 y(long r7) {
            r6 = this;
            boolean r0 = r6.m0
            if (r0 == 0) goto Lb
            x53 r7 = r6.Q0
            r7.getClass()
            long r7 = r7.R
        Lb:
            r6.m0(r7)
            sm3 r0 = r6.k0
            ua4 r1 = r0.z()
            java.lang.Object[] r2 = r1.A
            int r1 = r1.L
            r3 = 0
        L19:
            if (r3 >= r1) goto L2a
            r4 = r2[r3]
            sm3 r4 = (defpackage.sm3) r4
            wm3 r4 = r4.C0
            d34 r4 = r4.p
            qm3 r5 = defpackage.qm3.NotUsed
            r4.h0 = r5
            int r3 = r3 + 1
            goto L19
        L2a:
            e34 r1 = r0.s0
            java.util.List r0 = r0.m()
            f34 r7 = r1.d(r6, r0, r7)
            r6.r1(r7)
            r6.i1()
            return r6
    }
}

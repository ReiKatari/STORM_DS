package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mm3  reason: default package */
/* loaded from: classes.dex */
public final class mm3 extends defpackage.eg4 {
    public static final defpackage.aj T0 = null;
    public defpackage.jm3 P0;
    public defpackage.q21 Q0;
    public defpackage.km3 R0;
    public defpackage.ut S0;

    static {
            aj r0 = defpackage.nc1.t()
            int r1 = defpackage.kt0.i
            long r1 = defpackage.kt0.f
            r0.l(r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.s(r1)
            r1 = 1
            r0.t(r1)
            defpackage.mm3.T0 = r0
            return
    }

    public mm3(defpackage.sm3 r2, defpackage.jm3 r3) {
            r1 = this;
            r1.<init>(r2)
            r1.P0 = r3
            sm3 r2 = r2.e0
            r0 = 0
            if (r2 == 0) goto L10
            km3 r2 = new km3
            r2.<init>(r1)
            goto L11
        L10:
            r2 = r0
        L11:
            r1.R0 = r2
            r2 = r3
            z64 r2 = (defpackage.z64) r2
            z64 r2 = r2.A
            int r2 = r2.L
            r2 = r2 & 512(0x200, float:7.17E-43)
            if (r2 == 0) goto L25
            ut r0 = new ut
            cf6 r3 = (defpackage.cf6) r3
            r0.<init>(r1, r3)
        L25:
            r1.S0 = r0
            return
    }

    public final void A1(defpackage.jm3 r3) {
            r2 = this;
            jm3 r0 = r2.P0
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L28
            r0 = r3
            z64 r0 = (defpackage.z64) r0
            z64 r0 = r0.A
            int r0 = r0.L
            r0 = r0 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L25
            r0 = r3
            cf6 r0 = (defpackage.cf6) r0
            ut r1 = r2.S0
            if (r1 == 0) goto L1d
            r1.B = r0
            goto L22
        L1d:
            ut r1 = new ut
            r1.<init>(r2, r0)
        L22:
            r2.S0 = r1
            goto L28
        L25:
            r0 = 0
            r2.S0 = r0
        L28:
            r2.P0 = r3
            return
    }

    @Override // defpackage.eg4
    public final void T0() {
            r1 = this;
            km3 r0 = r1.R0
            if (r0 != 0) goto Lb
            km3 r0 = new km3
            r0.<init>(r1)
            r1.R0 = r0
        Lb:
            return
    }

    @Override // defpackage.x24
    public final int V(int r7) {
            r6 = this;
            ut r0 = r6.S0
            if (r0 == 0) goto L47
            cf6 r1 = r0.B
            eg4 r6 = r6.n0
            r6.getClass()
            z64 r2 = r1.A
            eg4 r2 = r2.d0
            r2.getClass()
            mz3 r2 = r2.W0()
            r2.getClass()
            boolean r2 = r2.C0()
            if (r2 == 0) goto L42
            ce1 r2 = new ce1
            hg4 r3 = defpackage.hg4.Min
            ig4 r4 = defpackage.ig4.Height
            r5 = 2
            r2.<init>(r6, r3, r4, r5)
            r6 = 13
            r3 = 0
            long r6 = defpackage.s21.b(r3, r7, r3, r3, r6)
            rt r3 = new rt
            kk3 r4 = r0.getLayoutDirection()
            r3.<init>(r0, r4)
            f34 r6 = r1.R0(r3, r2, r6)
            int r6 = r6.getHeight()
            return r6
        L42:
            int r6 = r6.V(r7)
            return r6
        L47:
            jm3 r0 = r6.P0
            eg4 r1 = r6.n0
            r1.getClass()
            int r6 = r0.h0(r6, r1, r7)
            return r6
    }

    @Override // defpackage.eg4
    public final defpackage.mz3 W0() {
            r0 = this;
            km3 r0 = r0.R0
            return r0
    }

    @Override // defpackage.eg4
    public final defpackage.z64 Y0() {
            r0 = this;
            jm3 r0 = r0.P0
            z64 r0 = (defpackage.z64) r0
            z64 r0 = r0.A
            return r0
    }

    @Override // defpackage.x24
    public final int c(int r7) {
            r6 = this;
            ut r0 = r6.S0
            if (r0 == 0) goto L47
            cf6 r1 = r0.B
            eg4 r6 = r6.n0
            r6.getClass()
            z64 r2 = r1.A
            eg4 r2 = r2.d0
            r2.getClass()
            mz3 r2 = r2.W0()
            r2.getClass()
            boolean r2 = r2.C0()
            if (r2 == 0) goto L42
            ce1 r2 = new ce1
            hg4 r3 = defpackage.hg4.Max
            ig4 r4 = defpackage.ig4.Height
            r5 = 2
            r2.<init>(r6, r3, r4, r5)
            r6 = 13
            r3 = 0
            long r6 = defpackage.s21.b(r3, r7, r3, r3, r6)
            rt r3 = new rt
            kk3 r4 = r0.getLayoutDirection()
            r3.<init>(r0, r4)
            f34 r6 = r1.R0(r3, r2, r6)
            int r6 = r6.getHeight()
            return r6
        L42:
            int r6 = r6.c(r7)
            return r6
        L47:
            jm3 r0 = r6.P0
            eg4 r1 = r6.n0
            r1.getClass()
            int r6 = r0.Z(r6, r1, r7)
            return r6
    }

    @Override // defpackage.dx4
    public final void h0(long r5, float r7, defpackage.qn2 r8) {
            r4 = this;
            boolean r0 = r4.l0
            if (r0 == 0) goto L11
            mz3 r5 = r4.W0()
            r5.getClass()
            long r5 = r5.l0
            r4.o1(r5, r7, r8)
            goto L14
        L11:
            r4.o1(r5, r7, r8)
        L14:
            boolean r5 = r4.f0
            if (r5 == 0) goto L19
            goto L72
        L19:
            r4.j1()
            eg4 r5 = r4.n0
            r5.getClass()
            ut r6 = r4.S0
            r7 = 0
            if (r6 == 0) goto L63
            km3 r8 = r4.R0
            r8.getClass()
            boolean r6 = r6.L
            if (r6 != 0) goto L60
            long r0 = r4.L
            km3 r6 = r4.R0
            r8 = 0
            if (r6 == 0) goto L40
            long r2 = r6.O0()
            q93 r6 = new q93
            r6.<init>(r2)
            goto L41
        L40:
            r6 = r8
        L41:
            boolean r6 = defpackage.q93.a(r0, r6)
            if (r6 == 0) goto L60
            long r0 = r5.L
            mz3 r6 = r5.W0()
            if (r6 == 0) goto L58
            long r2 = r6.O0()
            q93 r8 = new q93
            r8.<init>(r2)
        L58:
            boolean r6 = defpackage.q93.a(r0, r8)
            if (r6 == 0) goto L60
            r6 = 1
            goto L61
        L60:
            r6 = r7
        L61:
            r5.l0 = r6
        L63:
            boolean r6 = r4.g0
            r5.g0 = r6
            f34 r4 = r4.G0()
            r4.a()
            r5.g0 = r7
            r5.l0 = r7
        L72:
            return
    }

    @Override // defpackage.x24
    public final int n(int r7) {
            r6 = this;
            ut r0 = r6.S0
            if (r0 == 0) goto L46
            cf6 r1 = r0.B
            eg4 r6 = r6.n0
            r6.getClass()
            z64 r2 = r1.A
            eg4 r2 = r2.d0
            r2.getClass()
            mz3 r2 = r2.W0()
            r2.getClass()
            boolean r2 = r2.C0()
            if (r2 == 0) goto L41
            ce1 r2 = new ce1
            hg4 r3 = defpackage.hg4.Min
            ig4 r4 = defpackage.ig4.Width
            r5 = 2
            r2.<init>(r6, r3, r4, r5)
            r6 = 7
            r3 = 0
            long r6 = defpackage.s21.b(r3, r3, r3, r7, r6)
            rt r3 = new rt
            kk3 r4 = r0.getLayoutDirection()
            r3.<init>(r0, r4)
            f34 r6 = r1.R0(r3, r2, r6)
            int r6 = r6.getWidth()
            return r6
        L41:
            int r6 = r6.n(r7)
            return r6
        L46:
            jm3 r0 = r6.P0
            eg4 r1 = r6.n0
            r1.getClass()
            int r6 = r0.s0(r6, r1, r7)
            return r6
    }

    @Override // defpackage.eg4
    public final void n1(defpackage.xj0 r9, defpackage.ut2 r10) {
            r8 = this;
            eg4 r0 = r8.n0
            r0.getClass()
            r0.R0(r9, r10)
            sm3 r10 = r8.k0
            zp4 r10 = defpackage.vm3.a(r10)
            te r10 = (defpackage.te) r10
            boolean r10 = r10.getShowLayoutBounds()
            if (r10 == 0) goto L4e
            eg4 r10 = r8.n0
            if (r10 == 0) goto L4e
            long r0 = r8.L
            long r2 = r10.L
            boolean r0 = defpackage.q93.b(r0, r2)
            if (r0 == 0) goto L2e
            long r0 = r10.x0
            r2 = 0
            boolean r10 = defpackage.i93.a(r0, r2)
            if (r10 != 0) goto L4e
        L2e:
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
            aj r7 = defpackage.mm3.T0
            r2 = r9
            r2.k(r3, r4, r5, r6, r7)
        L4e:
            return
    }

    @Override // defpackage.x24
    public final int u(int r7) {
            r6 = this;
            ut r0 = r6.S0
            if (r0 == 0) goto L46
            cf6 r1 = r0.B
            eg4 r6 = r6.n0
            r6.getClass()
            z64 r2 = r1.A
            eg4 r2 = r2.d0
            r2.getClass()
            mz3 r2 = r2.W0()
            r2.getClass()
            boolean r2 = r2.C0()
            if (r2 == 0) goto L41
            ce1 r2 = new ce1
            hg4 r3 = defpackage.hg4.Max
            ig4 r4 = defpackage.ig4.Width
            r5 = 2
            r2.<init>(r6, r3, r4, r5)
            r6 = 7
            r3 = 0
            long r6 = defpackage.s21.b(r3, r3, r3, r7, r6)
            rt r3 = new rt
            kk3 r4 = r0.getLayoutDirection()
            r3.<init>(r0, r4)
            f34 r6 = r1.R0(r3, r2, r6)
            int r6 = r6.getWidth()
            return r6
        L41:
            int r6 = r6.u(r7)
            return r6
        L46:
            jm3 r0 = r6.P0
            eg4 r1 = r6.n0
            r1.getClass()
            int r6 = r0.f(r6, r1, r7)
            return r6
    }

    @Override // defpackage.kz3
    public final int u0(defpackage.ey2 r2) {
            r1 = this;
            km3 r0 = r1.R0
            if (r0 == 0) goto L14
            y94 r1 = r0.p0
            int r2 = r1.d(r2)
            if (r2 < 0) goto L11
            int[] r1 = r1.c
            r1 = r1[r2]
            return r1
        L11:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            return r1
        L14:
            int r1 = defpackage.uj2.i(r1, r2)
            return r1
    }

    @Override // defpackage.x24
    public final defpackage.dx4 y(long r9) {
            r8 = this;
            boolean r0 = r8.m0
            r1 = 0
            if (r0 == 0) goto L12
            q21 r9 = r8.Q0
            if (r9 == 0) goto Lc
            long r9 = r9.a
            goto L12
        Lc:
            java.lang.String r8 = "Lookahead constraints cannot be null in approach pass."
            defpackage.i.h(r8)
            return r1
        L12:
            r8.m0(r9)
            ut r0 = r8.S0
            if (r0 == 0) goto Lc5
            cf6 r2 = r0.B
            mm3 r3 = r0.A
            km3 r3 = r3.R0
            r3.getClass()
            f34 r3 = r3.G0()
            r3.getWidth()
            r3.getHeight()
            if6 r3 = r2.m0
            boolean r3 = r3.h()
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L51
            if6 r3 = r2.m0
            gf6 r3 = r3.e()
            boolean r3 = r3.a()
            if (r3 == 0) goto L51
            if6 r3 = r2.m0
            gf6 r3 = r3.e()
            sg6 r3 = r3.b
            boolean r3 = r3.a()
            if (r3 == 0) goto L51
            goto L5c
        L51:
            q21 r3 = r8.Q0
            if (r3 != 0) goto L56
            goto L5c
        L56:
            long r6 = r3.a
            int r3 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r3 == 0) goto L5e
        L5c:
            r3 = r4
            goto L5f
        L5e:
            r3 = r5
        L5f:
            r0.L = r3
            if (r3 != 0) goto L6a
            eg4 r3 = r8.n0
            r3.getClass()
            r3.m0 = r4
        L6a:
            eg4 r3 = r8.n0
            r3.getClass()
            f34 r9 = r2.R0(r0, r3, r9)
            eg4 r10 = r8.n0
            r10.getClass()
            r10.m0 = r5
            int r10 = r9.getWidth()
            km3 r2 = r8.R0
            r2.getClass()
            int r2 = r2.A
            if (r10 != r2) goto L95
            int r10 = r9.getHeight()
            km3 r2 = r8.R0
            r2.getClass()
            int r2 = r2.B
            if (r10 != r2) goto L95
            goto L96
        L95:
            r4 = r5
        L96:
            boolean r10 = r0.L
            if (r10 != 0) goto Ld0
            eg4 r10 = r8.n0
            r10.getClass()
            long r2 = r10.L
            eg4 r10 = r8.n0
            r10.getClass()
            mz3 r10 = r10.W0()
            if (r10 == 0) goto Lb6
            long r0 = r10.O0()
            q93 r10 = new q93
            r10.<init>(r0)
            r1 = r10
        Lb6:
            boolean r10 = defpackage.q93.a(r2, r1)
            if (r10 == 0) goto Ld0
            if (r4 != 0) goto Ld0
            lm3 r10 = new lm3
            r10.<init>(r9, r8)
            r9 = r10
            goto Ld0
        Lc5:
            jm3 r0 = r8.P0
            eg4 r1 = r8.n0
            r1.getClass()
            f34 r9 = r0.c(r8, r1, r9)
        Ld0:
            r8.r1(r9)
            r8.i1()
            return r8
    }
}

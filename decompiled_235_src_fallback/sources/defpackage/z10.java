package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z10  reason: default package */
/* loaded from: classes.dex */
public final class z10 extends defpackage.z64 implements defpackage.jm3, defpackage.mo1, defpackage.va6, defpackage.yy4, defpackage.c74, defpackage.xs4, defpackage.kj3, defpackage.ks2, defpackage.rg2, defpackage.kh2, defpackage.ph2, defpackage.aq4, defpackage.c90 {
    public defpackage.y64 k0;

    @Override // defpackage.kh2
    public final void A(defpackage.fh2 r1) {
            r0 = this;
            y64 r0 = r0.k0
            java.lang.String r1 = "applyFocusProperties called on wrong node"
            defpackage.p53.c(r1)
            r0.getClass()
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>()
            throw r0
    }

    @Override // defpackage.va6
    public final void A0(defpackage.gb6 r17) {
            r16 = this;
            r0 = r16
            y64 r0 = r0.k0
            r0.getClass()
            lt r0 = (defpackage.lt) r0
            ta6 r1 = new ta6
            r1.<init>()
            boolean r2 = r0.a
            r1.L = r2
            qn2 r0 = r0.b
            r0.g(r1)
            r17.getClass()
            r0 = r17
            ta6 r0 = (defpackage.ta6) r0
            ja4 r2 = r0.A
            boolean r3 = r1.L
            r4 = 1
            if (r3 == 0) goto L27
            r0.L = r4
        L27:
            boolean r3 = r1.R
            if (r3 == 0) goto L2d
            r0.R = r4
        L2d:
            ja4 r0 = r1.A
            java.lang.Object[] r1 = r0.b
            java.lang.Object[] r3 = r0.c
            long[] r0 = r0.a
            int r4 = r0.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto La4
            r6 = 0
        L3b:
            r7 = r0[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L9f
            int r9 = r6 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = 0
        L55:
            if (r11 >= r9) goto L9d
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.3E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L99
            int r12 = r6 << 3
            int r12 = r12 + r11
            r13 = r1[r12]
            r12 = r3[r12]
            fb6 r13 = (defpackage.fb6) r13
            boolean r14 = r2.b(r13)
            if (r14 != 0) goto L73
            r2.m(r13, r12)
            goto L99
        L73:
            boolean r14 = r12 instanceof defpackage.y1
            if (r14 == 0) goto L99
            java.lang.Object r14 = r2.g(r13)
            r14.getClass()
            y1 r14 = (defpackage.y1) r14
            y1 r15 = new y1
            java.lang.String r5 = r14.a
            if (r5 != 0) goto L8b
            r5 = r12
            y1 r5 = (defpackage.y1) r5
            java.lang.String r5 = r5.a
        L8b:
            ao2 r14 = r14.b
            if (r14 != 0) goto L93
            y1 r12 = (defpackage.y1) r12
            ao2 r14 = r12.b
        L93:
            r15.<init>(r5, r14)
            r2.m(r13, r15)
        L99:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L55
        L9d:
            if (r9 != r10) goto La4
        L9f:
            if (r6 == r4) goto La4
            int r6 = r6 + 1
            goto L3b
        La4:
            return
    }

    @Override // defpackage.rg2
    public final void D(defpackage.sh2 r1) {
            r0 = this;
            y64 r0 = r0.k0
            java.lang.String r1 = "onFocusEvent called on wrong node"
            defpackage.p53.c(r1)
            r0.getClass()
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>()
            throw r0
    }

    @Override // defpackage.yy4
    public final void I() {
            r0 = this;
            y64 r0 = r0.k0
            r0.getClass()
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>()
            throw r0
    }

    @Override // defpackage.z64
    public final void J0() {
            r1 = this;
            r0 = 1
            r1.R0(r0)
            return
    }

    @Override // defpackage.z64
    public final void K0() {
            r1 = this;
            boolean r0 = r1.j0
            if (r0 != 0) goto L9
            java.lang.String r0 = "unInitializeModifier called on unattached node"
            defpackage.p53.c(r0)
        L9:
            int r0 = r1.L
            r0 = r0 & 8
            if (r0 == 0) goto L18
            zp4 r1 = defpackage.nc1.g0(r1)
            te r1 = (defpackage.te) r1
            r1.y()
        L18:
            return
    }

    @Override // defpackage.mo1
    public final void O() {
            r0 = this;
            defpackage.f04.I(r0)
            return
    }

    @Override // defpackage.yy4
    public final boolean P() {
            r0 = this;
            y64 r0 = r0.k0
            r0.getClass()
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>()
            throw r0
    }

    public final void R0(boolean r5) {
            r4 = this;
            boolean r0 = r4.j0
            if (r0 != 0) goto L9
            java.lang.String r0 = "initializeModifier called on unattached node"
            defpackage.p53.c(r0)
        L9:
            y64 r0 = r4.k0
            int r1 = r4.L
            r1 = r1 & 4
            r2 = 2
            if (r1 == 0) goto L1b
            if (r5 != 0) goto L1b
            eg4 r1 = defpackage.nc1.d0(r4, r2)
            r1.f1()
        L1b:
            int r1 = r4.L
            r1 = r1 & r2
            if (r1 == 0) goto L55
            sm3 r1 = defpackage.nc1.f0(r4)
            if0 r1 = r1.B0
            java.lang.Object r1 = r1.f
            vy6 r1 = (defpackage.vy6) r1
            r1.getClass()
            boolean r1 = r1.k0
            if (r1 == 0) goto L45
            eg4 r1 = r4.d0
            r1.getClass()
            r3 = r1
            mm3 r3 = (defpackage.mm3) r3
            r3.A1(r4)
            yp4 r1 = r1.J0
            if (r1 == 0) goto L45
            xt2 r1 = (defpackage.xt2) r1
            r1.c()
        L45:
            if (r5 != 0) goto L55
            eg4 r5 = defpackage.nc1.d0(r4, r2)
            r5.f1()
            sm3 r5 = defpackage.nc1.f0(r4)
            r5.E()
        L55:
            boolean r5 = r0 instanceof defpackage.gp3
            if (r5 == 0) goto L7b
            gp3 r0 = (defpackage.gp3) r0
            sm3 r5 = defpackage.nc1.f0(r4)
            int r1 = r0.a
            switch(r1) {
                case 0: goto L75;
                case 1: goto L6e;
                default: goto L64;
            }
        L64:
            f86 r0 = r0.b
            nr4 r0 = (defpackage.nr4) r0
            vs4 r0 = r0.w
            r0.setValue(r5)
            goto L7b
        L6e:
            f86 r0 = r0.b
            pr3 r0 = (defpackage.pr3) r0
            r0.l = r5
            goto L7b
        L75:
            f86 r0 = r0.b
            ip3 r0 = (defpackage.ip3) r0
            r0.j = r5
        L7b:
            int r5 = r4.L
            r5 = r5 & 8
            if (r5 == 0) goto L8a
            zp4 r4 = defpackage.nc1.g0(r4)
            te r4 = (defpackage.te) r4
            r4.y()
        L8a:
            return
    }

    @Override // defpackage.c74
    public final defpackage.gi2 X() {
            r0 = this;
            au1 r0 = defpackage.au1.e
            return r0
    }

    @Override // defpackage.jm3
    public final int Z(defpackage.kz3 r5, defpackage.x24 r6, int r7) {
            r4 = this;
            y64 r4 = r4.k0
            r4.getClass()
            hm3 r4 = (defpackage.hm3) r4
            ce1 r0 = new ce1
            k34 r1 = defpackage.k34.Max
            l34 r2 = defpackage.l34.Height
            r3 = 1
            r0.<init>(r6, r1, r2, r3)
            r6 = 0
            r1 = 13
            long r6 = defpackage.s21.b(r6, r7, r6, r6, r1)
            sb3 r1 = new sb3
            kk3 r2 = r5.getLayoutDirection()
            r1.<init>(r5, r2)
            f34 r4 = r4.c(r1, r0, r6)
            int r4 = r4.getHeight()
            return r4
    }

    @Override // defpackage.c90
    public final defpackage.qh1 a() {
            r0 = this;
            sm3 r0 = defpackage.nc1.f0(r0)
            qh1 r0 = r0.u0
            return r0
    }

    @Override // defpackage.kj3, defpackage.j34
    public final void b(long r1) {
            r0 = this;
            return
    }

    @Override // defpackage.jm3
    public final defpackage.f34 c(defpackage.g34 r1, defpackage.x24 r2, long r3) {
            r0 = this;
            y64 r0 = r0.k0
            r0.getClass()
            hm3 r0 = (defpackage.hm3) r0
            f34 r0 = r0.c(r1, r2, r3)
            return r0
    }

    @Override // defpackage.xg1, defpackage.yy4
    public final void d() {
            r0 = this;
            return
    }

    @Override // defpackage.ks2
    public final void d0(defpackage.eg4 r1) {
            r0 = this;
            y64 r0 = r0.k0
            r0.getClass()
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>()
            throw r0
    }

    @Override // defpackage.c90
    public final long e() {
            r2 = this;
            r0 = 128(0x80, float:1.8E-43)
            eg4 r2 = defpackage.nc1.d0(r2, r0)
            long r0 = r2.L
            long r0 = defpackage.qo2.S(r0)
            return r0
    }

    @Override // defpackage.jm3
    public final int f(defpackage.kz3 r5, defpackage.x24 r6, int r7) {
            r4 = this;
            y64 r4 = r4.k0
            r4.getClass()
            hm3 r4 = (defpackage.hm3) r4
            ce1 r0 = new ce1
            k34 r1 = defpackage.k34.Max
            l34 r2 = defpackage.l34.Width
            r3 = 1
            r0.<init>(r6, r1, r2, r3)
            r6 = 0
            r1 = 7
            long r6 = defpackage.s21.b(r6, r6, r6, r7, r1)
            sb3 r1 = new sb3
            kk3 r2 = r5.getLayoutDirection()
            r1.<init>(r5, r2)
            f34 r4 = r4.c(r1, r0, r6)
            int r4 = r4.getWidth()
            return r4
    }

    @Override // defpackage.c90
    public final defpackage.kk3 getLayoutDirection() {
            r0 = this;
            sm3 r0 = defpackage.nc1.f0(r0)
            kk3 r0 = r0.v0
            return r0
    }

    @Override // defpackage.jm3
    public final int h0(defpackage.kz3 r5, defpackage.x24 r6, int r7) {
            r4 = this;
            y64 r4 = r4.k0
            r4.getClass()
            hm3 r4 = (defpackage.hm3) r4
            ce1 r0 = new ce1
            k34 r1 = defpackage.k34.Min
            l34 r2 = defpackage.l34.Height
            r3 = 1
            r0.<init>(r6, r1, r2, r3)
            r6 = 0
            r1 = 13
            long r6 = defpackage.s21.b(r6, r7, r6, r6, r1)
            sb3 r1 = new sb3
            kk3 r2 = r5.getLayoutDirection()
            r1.<init>(r5, r2)
            f34 r4 = r4.c(r1, r0, r6)
            int r4 = r4.getHeight()
            return r4
    }

    @Override // defpackage.kj3
    public final void m(defpackage.jk3 r1) {
            r0 = this;
            return
    }

    @Override // defpackage.mo1
    public final void m0(defpackage.um3 r1) {
            r0 = this;
            y64 r0 = r0.k0
            r0.getClass()
            lo1 r0 = (defpackage.lo1) r0
            r1.b()
            return
    }

    @Override // defpackage.aq4
    public final boolean r() {
            r0 = this;
            boolean r0 = r0.j0
            return r0
    }

    @Override // defpackage.jm3
    public final int s0(defpackage.kz3 r5, defpackage.x24 r6, int r7) {
            r4 = this;
            y64 r4 = r4.k0
            r4.getClass()
            hm3 r4 = (defpackage.hm3) r4
            ce1 r0 = new ce1
            k34 r1 = defpackage.k34.Min
            l34 r2 = defpackage.l34.Width
            r3 = 1
            r0.<init>(r6, r1, r2, r3)
            r6 = 0
            r1 = 7
            long r6 = defpackage.s21.b(r6, r6, r6, r7, r1)
            sb3 r1 = new sb3
            kk3 r2 = r5.getLayoutDirection()
            r1.<init>(r5, r2)
            f34 r4 = r4.c(r1, r0, r6)
            int r4 = r4.getWidth()
            return r4
    }

    @Override // defpackage.xs4
    public final java.lang.Object t(defpackage.qh1 r1, java.lang.Object r2) {
            r0 = this;
            y64 r0 = r0.k0
            r0.getClass()
            ws4 r0 = (defpackage.ws4) r0
            java.lang.Object r0 = r0.f()
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            y64 r0 = r0.k0
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // defpackage.yy4
    public final boolean u0() {
            r0 = this;
            y64 r0 = r0.k0
            r0.getClass()
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>()
            throw r0
    }

    @Override // defpackage.yy4
    public final void w(defpackage.oy4 r1, defpackage.py4 r2, long r3) {
            r0 = this;
            y64 r0 = r0.k0
            r0.getClass()
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>()
            throw r0
    }
}

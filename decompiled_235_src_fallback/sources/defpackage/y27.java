package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y27  reason: default package */
/* loaded from: classes.dex */
public final class y27 extends defpackage.z64 implements defpackage.fy0, defpackage.jm3 {
    public final defpackage.s47 k0;
    public defpackage.we7 l0;
    public defpackage.w27 m0;

    public y27(defpackage.s47 r1) {
            r0 = this;
            r0.<init>()
            r0.k0 = r1
            return
    }

    @Override // defpackage.z64
    public final boolean G0() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.z64
    public final void J0() {
            r8 = this;
            sm3 r0 = defpackage.nc1.f0(r8)
            kk3 r0 = r0.v0
            s47 r1 = r8.k0
            s47 r6 = defpackage.gi2.N(r1, r0)
            nq6 r0 = defpackage.ky0.k
            java.lang.Object r0 = defpackage.hf.K(r8, r0)
            r5 = r0
            ki2 r5 = (defpackage.ki2) r5
            r8.R0(r6, r5)
            w27 r2 = new w27
            sm3 r0 = defpackage.nc1.f0(r8)
            kk3 r3 = r0.v0
            sm3 r0 = defpackage.nc1.f0(r8)
            qh1 r4 = r0.u0
            we7 r0 = r8.l0
            if (r0 == 0) goto L34
            java.lang.Object r7 = r0.getValue()
            r2.<init>(r3, r4, r5, r6, r7)
            r8.m0 = r2
            return
        L34:
            java.lang.String r8 = "Font resolution state is not set."
            ug r8 = defpackage.lb1.c(r8)
            throw r8
    }

    @Override // defpackage.z64
    public final void K0() {
            r1 = this;
            r0 = 0
            r1.l0 = r0
            r1.m0 = r0
            return
    }

    public final void R0(defpackage.s47 r4, defpackage.ki2 r5) {
            r3 = this;
            nn6 r4 = r4.a
            li2 r0 = r4.f
            oj2 r1 = r4.c
            if (r1 != 0) goto La
            oj2 r1 = defpackage.oj2.Y
        La:
            ij2 r2 = r4.d
            if (r2 == 0) goto L11
            int r2 = r2.a
            goto L12
        L11:
            r2 = 0
        L12:
            jj2 r4 = r4.e
            if (r4 == 0) goto L19
            int r4 = r4.a
            goto L1c
        L19:
            r4 = 65535(0xffff, float:9.1834E-41)
        L1c:
            mi2 r5 = (defpackage.mi2) r5
            we7 r4 = r5.b(r0, r1, r2, r4)
            r3.l0 = r4
            defpackage.xk2.w(r3)
            return
    }

    @Override // defpackage.xg1
    public final void S() {
            r4 = this;
            w27 r0 = r4.m0
            if (r0 == 0) goto L10
            sm3 r1 = defpackage.nc1.f0(r4)
            kk3 r1 = r1.v0
            r2 = 30
            r3 = 0
            defpackage.w27.a(r0, r1, r3, r3, r2)
        L10:
            defpackage.xk2.w(r4)
            return
    }

    @Override // defpackage.jm3
    public final defpackage.f34 c(defpackage.g34 r5, defpackage.x24 r6, long r7) {
            r4 = this;
            w27 r0 = r4.m0
            if (r0 == 0) goto L70
            vs4 r1 = r0.f
            we7 r4 = r4.l0
            if (r4 == 0) goto L69
            java.lang.Object r4 = r4.getValue()
            java.lang.Object r2 = r0.e
            boolean r2 = defpackage.nb3.k(r4, r2)
            if (r2 != 0) goto L1d
            r0.e = r4
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r1.setValue(r4)
        L1d:
            java.lang.Object r4 = r1.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L3a
            ki2 r4 = r0.c
            s47 r2 = r0.d
            qh1 r3 = r0.b
            long r2 = defpackage.l17.b(r2, r3, r4)
            r0.g = r2
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r1.setValue(r4)
        L3a:
            long r0 = r0.g
            r4 = 32
            long r2 = r0 >> r4
            int r4 = (int) r2
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            int r0 = (int) r0
            r1 = 10
            r2 = 0
            long r0 = defpackage.s21.b(r4, r2, r0, r2, r1)
            long r7 = defpackage.s21.e(r7, r0)
            dx4 r4 = r6.y(r7)
            int r6 = r4.A
            int r7 = r4.B
            jv r8 = new jv
            r0 = 9
            r8.<init>(r4, r0)
            zt1 r4 = defpackage.zt1.A
            f34 r4 = r5.K(r6, r7, r4, r8)
            return r4
        L69:
            java.lang.String r4 = "Font resolution state is not set."
            ug r4 = defpackage.lb1.c(r4)
            throw r4
        L70:
            java.lang.String r4 = "Min size state is not set."
            ug r4 = defpackage.lb1.c(r4)
            throw r4
    }

    @Override // defpackage.xg1, defpackage.yy4
    public final void d() {
            r4 = this;
            w27 r0 = r4.m0
            if (r0 == 0) goto L10
            sm3 r1 = defpackage.nc1.f0(r4)
            qh1 r1 = r1.u0
            r2 = 29
            r3 = 0
            defpackage.w27.a(r0, r3, r1, r3, r2)
        L10:
            defpackage.xk2.w(r4)
            return
    }
}

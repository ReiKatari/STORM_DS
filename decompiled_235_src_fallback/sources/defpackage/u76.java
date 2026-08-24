package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u76  reason: default package */
/* loaded from: classes.dex */
public final class u76 extends defpackage.zg1 implements defpackage.fy0, defpackage.gi4 {
    public defpackage.f86 m0;
    public defpackage.lo4 n0;
    public boolean o0;
    public defpackage.sd2 p0;
    public defpackage.r94 q0;
    public defpackage.z70 r0;
    public boolean s0;
    public defpackage.sg t0;
    public defpackage.e86 u0;
    public defpackage.xg1 v0;
    public defpackage.tg w0;
    public defpackage.sg x0;
    public boolean y0;

    @Override // defpackage.z64
    public final boolean G0() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.z64
    public final void J0() {
            r10 = this;
            boolean r0 = r10.V0()
            r10.y0 = r0
            r10.U0()
            e86 r0 = r10.u0
            if (r0 != 0) goto L30
            e86 r1 = new e86
            f86 r7 = r10.m0
            boolean r0 = r10.s0
            if (r0 == 0) goto L19
            sg r0 = r10.x0
        L17:
            r2 = r0
            goto L1c
        L19:
            sg r0 = r10.t0
            goto L17
        L1c:
            sd2 r4 = r10.p0
            lo4 r6 = r10.n0
            boolean r8 = r10.o0
            boolean r9 = r10.y0
            r94 r5 = r10.q0
            z70 r3 = r10.r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r10.R0(r1)
            r10.u0 = r1
        L30:
            return
    }

    @Override // defpackage.z64
    public final void K0() {
            r1 = this;
            xg1 r0 = r1.v0
            if (r0 == 0) goto L7
            r1.S0(r0)
        L7:
            return
    }

    @Override // defpackage.xg1
    public final void S() {
            r11 = this;
            boolean r0 = r11.V0()
            boolean r1 = r11.y0
            if (r1 == r0) goto L25
            r11.y0 = r0
            f86 r8 = r11.m0
            lo4 r7 = r11.n0
            boolean r9 = r11.s0
            if (r9 == 0) goto L16
            sg r0 = r11.x0
        L14:
            r3 = r0
            goto L19
        L16:
            sg r0 = r11.t0
            goto L14
        L19:
            boolean r10 = r11.o0
            sd2 r5 = r11.p0
            r94 r6 = r11.q0
            z70 r4 = r11.r0
            r2 = r11
            r2.W0(r3, r4, r5, r6, r7, r8, r9, r10)
        L25:
            return
    }

    public final void U0() {
            r2 = this;
            xg1 r0 = r2.v0
            if (r0 != 0) goto L2a
            boolean r0 = r2.s0
            if (r0 == 0) goto L11
            t46 r0 = new t46
            r1 = 3
            r0.<init>(r2, r1)
            defpackage.jx2.B(r2, r0)
        L11:
            boolean r0 = r2.s0
            if (r0 == 0) goto L18
            sg r0 = r2.x0
            goto L1a
        L18:
            sg r0 = r2.t0
        L1a:
            if (r0 == 0) goto L36
            zg1 r0 = r0.i
            z64 r1 = r0.A
            boolean r1 = r1.j0
            if (r1 != 0) goto L36
            r2.R0(r0)
            r2.v0 = r0
            return
        L2a:
            r1 = r0
            z64 r1 = (defpackage.z64) r1
            z64 r1 = r1.A
            boolean r1 = r1.j0
            if (r1 != 0) goto L36
            r2.R0(r0)
        L36:
            return
    }

    public final boolean V0() {
            r2 = this;
            kk3 r0 = defpackage.kk3.Ltr
            boolean r1 = r2.j0
            if (r1 == 0) goto Lc
            sm3 r0 = defpackage.nc1.f0(r2)
            kk3 r0 = r0.v0
        Lc:
            lo4 r2 = r2.n0
            kk3 r1 = defpackage.kk3.Rtl
            if (r0 != r1) goto L18
            lo4 r0 = defpackage.lo4.Vertical
            if (r2 == r0) goto L18
            r2 = 0
            return r2
        L18:
            r2 = 1
            return r2
    }

    public final void W0(defpackage.sg r10, defpackage.z70 r11, defpackage.sd2 r12, defpackage.r94 r13, defpackage.lo4 r14, defpackage.f86 r15, boolean r16, boolean r17) {
            r9 = this;
            r0 = r16
            r9.m0 = r15
            r9.n0 = r14
            boolean r1 = r9.s0
            r2 = 1
            r3 = 0
            if (r1 == r0) goto L10
            r9.s0 = r0
            r1 = r2
            goto L11
        L10:
            r1 = r3
        L11:
            sg r4 = r9.t0
            boolean r4 = defpackage.nb3.k(r4, r10)
            if (r4 != 0) goto L1c
            r9.t0 = r10
            goto L1d
        L1c:
            r2 = r3
        L1d:
            if (r1 != 0) goto L27
            if (r2 == 0) goto L24
            if (r0 != 0) goto L24
            goto L27
        L24:
            r7 = r17
            goto L35
        L27:
            xg1 r10 = r9.v0
            if (r10 == 0) goto L2e
            r9.S0(r10)
        L2e:
            r10 = 0
            r9.v0 = r10
            r9.U0()
            goto L24
        L35:
            r9.o0 = r7
            r9.p0 = r12
            r9.q0 = r13
            r9.r0 = r11
            boolean r8 = r9.V0()
            r9.y0 = r8
            e86 r0 = r9.u0
            if (r0 == 0) goto L5a
            boolean r10 = r9.s0
            if (r10 == 0) goto L54
            sg r9 = r9.x0
        L4d:
            r1 = r9
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            goto L57
        L54:
            sg r9 = r9.t0
            goto L4d
        L57:
            r0.m1(r1, r2, r3, r4, r5, r6, r7, r8)
        L5a:
            return
    }

    @Override // defpackage.gi4
    public final void l0() {
            r11 = this;
            py0 r0 = defpackage.xp4.a
            java.lang.Object r0 = defpackage.hf.K(r11, r0)
            tg r0 = (defpackage.tg) r0
            tg r1 = r11.w0
            boolean r1 = defpackage.nb3.k(r0, r1)
            if (r1 != 0) goto L41
            r11.w0 = r0
            r0 = 0
            r11.x0 = r0
            xg1 r1 = r11.v0
            if (r1 == 0) goto L1c
            r11.S0(r1)
        L1c:
            r11.v0 = r0
            r11.U0()
            e86 r2 = r11.u0
            if (r2 == 0) goto L41
            f86 r8 = r11.m0
            lo4 r7 = r11.n0
            boolean r0 = r11.s0
            if (r0 == 0) goto L31
            sg r0 = r11.x0
        L2f:
            r3 = r0
            goto L34
        L31:
            sg r0 = r11.t0
            goto L2f
        L34:
            boolean r9 = r11.o0
            boolean r10 = r11.y0
            sd2 r5 = r11.p0
            r94 r6 = r11.q0
            z70 r4 = r11.r0
            r2.m1(r3, r4, r5, r6, r7, r8, r9, r10)
        L41:
            return
    }
}

package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c04  reason: default package */
/* loaded from: classes.dex */
public final class c04 extends defpackage.z64 implements defpackage.ks2, defpackage.mo1, defpackage.va6, defpackage.gi4 {
    public defpackage.mn0 k0;
    public defpackage.t27 l0;
    public defpackage.px4 m0;
    public android.view.View n0;
    public defpackage.qh1 o0;
    public defpackage.ox4 p0;
    public final defpackage.vs4 q0;
    public defpackage.ii1 r0;
    public long s0;
    public defpackage.q93 t0;
    public defpackage.v80 u0;

    public c04(defpackage.mn0 r1, defpackage.t27 r2, defpackage.px4 r3) {
            r0 = this;
            r0.<init>()
            r0.k0 = r1
            r0.l0 = r2
            r0.m0 = r3
            vs0 r1 = defpackage.vs0.j0
            vs4 r2 = new vs4
            r3 = 0
            r2.<init>(r3, r1)
            r0.q0 = r2
            r1 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r0.s0 = r1
            return
    }

    @Override // defpackage.va6
    public final void A0(defpackage.gb6 r4) {
            r3 = this;
            fb6 r0 = defpackage.d04.a
            b04 r1 = new b04
            r2 = 1
            r1.<init>(r3, r2)
            r4.a(r0, r1)
            return
    }

    @Override // defpackage.z64
    public final void J0() {
            r5 = this;
            r5.l0()
            r0 = 7
            r1 = 0
            r2 = 0
            v80 r0 = defpackage.nb3.c(r1, r2, r2, r0)
            r5.u0 = r0
            w61 r0 = r5.F0()
            a71 r1 = defpackage.a71.UNDISPATCHED
            ns3 r3 = new ns3
            r4 = 1
            r3.<init>(r5, r2, r4)
            defpackage.hv.L(r0, r2, r1, r3, r4)
            return
    }

    @Override // defpackage.z64
    public final void K0() {
            r1 = this;
            ox4 r0 = r1.p0
            if (r0 == 0) goto L9
            qx4 r0 = (defpackage.qx4) r0
            r0.b()
        L9:
            r0 = 0
            r1.p0 = r0
            return
    }

    public final long R0() {
            r2 = this;
            ii1 r0 = r2.r0
            if (r0 != 0) goto L10
            b04 r0 = new b04
            r1 = 2
            r0.<init>(r2, r1)
            ii1 r0 = defpackage.np2.I(r0)
            r2.r0 = r0
        L10:
            ii1 r2 = r2.r0
            if (r2 == 0) goto L1d
            java.lang.Object r2 = r2.getValue()
            jk4 r2 = (defpackage.jk4) r2
            long r0 = r2.a
            return r0
        L1d:
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            return r0
    }

    public final void S0() {
            r3 = this;
            ox4 r0 = r3.p0
            if (r0 == 0) goto L9
            qx4 r0 = (defpackage.qx4) r0
            r0.b()
        L9:
            android.view.View r0 = r3.n0
            if (r0 != 0) goto L11
            android.view.View r0 = defpackage.jw2.z(r3)
        L11:
            r3.n0 = r0
            qh1 r1 = r3.o0
            if (r1 != 0) goto L1d
            sm3 r1 = defpackage.nc1.f0(r3)
            qh1 r1 = r1.u0
        L1d:
            r3.o0 = r1
            px4 r2 = r3.m0
            ox4 r0 = r2.b(r0, r1)
            r3.p0 = r0
            r3.U0()
            return
    }

    public final void T0() {
            r8 = this;
            qh1 r0 = r8.o0
            if (r0 != 0) goto Lc
            sm3 r0 = defpackage.nc1.f0(r8)
            qh1 r0 = r0.u0
            r8.o0 = r0
        Lc:
            mn0 r1 = r8.k0
            java.lang.Object r0 = r1.g(r0)
            jk4 r0 = (defpackage.jk4) r0
            long r0 = r0.a
            r2 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r4 = r0 & r2
            r6 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L4d
            long r4 = r8.R0()
            long r2 = r2 & r4
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 == 0) goto L4d
            long r2 = r8.R0()
            long r0 = defpackage.jk4.f(r2, r0)
            r8.s0 = r0
            ox4 r0 = r8.p0
            if (r0 != 0) goto L40
            r8.S0()
        L40:
            ox4 r0 = r8.p0
            if (r0 == 0) goto L49
            long r1 = r8.s0
            r0.a(r1, r6)
        L49:
            r8.U0()
            return
        L4d:
            r8.s0 = r6
            ox4 r8 = r8.p0
            if (r8 == 0) goto L58
            qx4 r8 = (defpackage.qx4) r8
            r8.b()
        L58:
            return
    }

    public final void U0() {
            r5 = this;
            ox4 r0 = r5.p0
            if (r0 != 0) goto L5
            goto L39
        L5:
            qh1 r1 = r5.o0
            if (r1 != 0) goto La
            goto L39
        La:
            qx4 r0 = (defpackage.qx4) r0
            long r2 = r0.c()
            q93 r4 = r5.t0
            boolean r2 = defpackage.q93.a(r2, r4)
            if (r2 != 0) goto L39
            t27 r2 = r5.l0
            long r3 = r0.c()
            long r3 = defpackage.qo2.S(r3)
            long r3 = r1.q(r3)
            sm1 r1 = new sm1
            r1.<init>(r3)
            r2.g(r1)
            long r0 = r0.c()
            q93 r2 = new q93
            r2.<init>(r0)
            r5.t0 = r2
        L39:
            return
    }

    @Override // defpackage.ks2
    public final void d0(defpackage.eg4 r1) {
            r0 = this;
            vs4 r0 = r0.q0
            r0.setValue(r1)
            return
    }

    @Override // defpackage.gi4
    public final void l0() {
            r2 = this;
            b04 r0 = new b04
            r1 = 0
            r0.<init>(r2, r1)
            defpackage.jx2.B(r2, r0)
            return
    }

    @Override // defpackage.mo1
    public final void m0(defpackage.um3 r1) {
            r0 = this;
            r1.b()
            v80 r0 = r0.u0
            if (r0 == 0) goto Lc
            jg7 r1 = defpackage.jg7.a
            r0.c(r1)
        Lc:
            return
    }
}

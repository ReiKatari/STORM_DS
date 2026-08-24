package defpackage;

import android.view.View;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c04  reason: default package */
/* loaded from: classes.dex */
public final class c04 extends z64 implements ks2, mo1, va6, gi4 {
    public mn0 k0;
    public t27 l0;
    public px4 m0;
    public View n0;
    public qh1 o0;
    public ox4 p0;
    public ii1 r0;
    public q93 t0;
    public v80 u0;
    public final vs4 q0 = new vs4(null, vs0.j0);
    public long s0 = 9205357640488583168L;

    public c04(mn0 mn0Var, t27 t27Var, px4 px4Var) {
        this.k0 = mn0Var;
        this.l0 = t27Var;
        this.m0 = px4Var;
    }

    @Override // defpackage.va6
    public final void A0(gb6 gb6Var) {
        gb6Var.a(d04.a, new b04(this, 1));
    }

    @Override // defpackage.z64
    public final void J0() {
        l0();
        this.u0 = nb3.c(0, null, null, 7);
        hv.L(F0(), null, a71.UNDISPATCHED, new ns3(this, null, 1), 1);
    }

    @Override // defpackage.z64
    public final void K0() {
        ox4 ox4Var = this.p0;
        if (ox4Var != null) {
            ((qx4) ox4Var).b();
        }
        this.p0 = null;
    }

    public final long R0() {
        if (this.r0 == null) {
            this.r0 = np2.I(new b04(this, 2));
        }
        ii1 ii1Var = this.r0;
        if (ii1Var != null) {
            return ((jk4) ii1Var.getValue()).a;
        }
        return 9205357640488583168L;
    }

    public final void S0() {
        ox4 ox4Var = this.p0;
        if (ox4Var != null) {
            ((qx4) ox4Var).b();
        }
        View view = this.n0;
        if (view == null) {
            view = jw2.z(this);
        }
        this.n0 = view;
        qh1 qh1Var = this.o0;
        if (qh1Var == null) {
            qh1Var = nc1.f0(this).u0;
        }
        this.o0 = qh1Var;
        this.p0 = this.m0.b(view, qh1Var);
        U0();
    }

    public final void T0() {
        qh1 qh1Var = this.o0;
        if (qh1Var == null) {
            qh1Var = nc1.f0(this).u0;
            this.o0 = qh1Var;
        }
        long j = ((jk4) this.k0.g(qh1Var)).a;
        if ((j & 9223372034707292159L) != 9205357640488583168L && (9223372034707292159L & R0()) != 9205357640488583168L) {
            this.s0 = jk4.f(R0(), j);
            if (this.p0 == null) {
                S0();
            }
            ox4 ox4Var = this.p0;
            if (ox4Var != null) {
                ox4Var.a(this.s0, 9205357640488583168L);
            }
            U0();
            return;
        }
        this.s0 = 9205357640488583168L;
        ox4 ox4Var2 = this.p0;
        if (ox4Var2 != null) {
            ((qx4) ox4Var2).b();
        }
    }

    public final void U0() {
        qh1 qh1Var;
        ox4 ox4Var = this.p0;
        if (ox4Var != null && (qh1Var = this.o0) != null) {
            qx4 qx4Var = (qx4) ox4Var;
            if (!q93.a(qx4Var.c(), this.t0)) {
                this.l0.g(new sm1(qh1Var.q(qo2.S(qx4Var.c()))));
                this.t0 = new q93(qx4Var.c());
            }
        }
    }

    @Override // defpackage.ks2
    public final void d0(eg4 eg4Var) {
        this.q0.setValue(eg4Var);
    }

    @Override // defpackage.gi4
    public final void l0() {
        jx2.B(this, new b04(this, 0));
    }

    @Override // defpackage.mo1
    public final void m0(um3 um3Var) {
        um3Var.b();
        v80 v80Var = this.u0;
        if (v80Var != null) {
            v80Var.c(jg7.a);
        }
    }
}

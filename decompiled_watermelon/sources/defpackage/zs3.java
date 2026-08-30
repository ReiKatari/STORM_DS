package defpackage;

import android.view.View;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zs3  reason: default package */
/* loaded from: classes.dex */
public final class zs3 extends yy3 implements fm2, gk1, gz5, m94 {
    public el0 j0;
    public fq6 k0;
    public lo4 l0;
    public View m0;
    public od1 n0;
    public ko4 o0;
    public ee1 q0;
    public i33 s0;
    public q60 t0;
    public final tj4 p0 = new tj4(null, k45.f0);
    public long r0 = 9205357640488583168L;

    public zs3(el0 el0Var, fq6 fq6Var, lo4 lo4Var) {
        this.j0 = el0Var;
        this.k0 = fq6Var;
        this.l0 = lo4Var;
    }

    @Override // defpackage.yy3
    public final void J0() {
        Q();
        this.t0 = n40.f(0, null, null, 7);
        tq5.w(F0(), null, s31.UNDISPATCHED, new ys3(this, null, 0), 1);
    }

    @Override // defpackage.yy3
    public final void K0() {
        ko4 ko4Var = this.o0;
        if (ko4Var != null) {
            ((mo4) ko4Var).b();
        }
        this.o0 = null;
    }

    @Override // defpackage.m94
    public final void Q() {
        nk2.Q(this, new xs3(this, 0));
    }

    public final long R0() {
        if (this.q0 == null) {
            this.q0 = me2.q(new xs3(this, 2));
        }
        ee1 ee1Var = this.q0;
        if (ee1Var != null) {
            return ((mb4) ee1Var.getValue()).a;
        }
        return 9205357640488583168L;
    }

    public final void S0() {
        ko4 ko4Var = this.o0;
        if (ko4Var != null) {
            ((mo4) ko4Var).b();
        }
        View view = this.m0;
        if (view == null) {
            view = se.S(this);
        }
        this.m0 = view;
        od1 od1Var = this.n0;
        if (od1Var == null) {
            od1Var = l.P(this).t0;
        }
        this.n0 = od1Var;
        this.o0 = this.l0.b(view, od1Var);
        U0();
    }

    @Override // defpackage.gk1
    public final void T(xf3 xf3Var) {
        xf3Var.a();
        q60 q60Var = this.t0;
        if (q60Var != null) {
            q60Var.c(o27.a);
        }
    }

    public final void T0() {
        od1 od1Var = this.n0;
        if (od1Var == null) {
            od1Var = l.P(this).t0;
            this.n0 = od1Var;
        }
        long j = ((mb4) this.j0.n(od1Var)).a;
        if ((j & 9223372034707292159L) != 9205357640488583168L && (9223372034707292159L & R0()) != 9205357640488583168L) {
            this.r0 = mb4.e(R0(), j);
            if (this.o0 == null) {
                S0();
            }
            ko4 ko4Var = this.o0;
            if (ko4Var != null) {
                ko4Var.a(this.r0, 9205357640488583168L);
            }
            U0();
            return;
        }
        this.r0 = 9205357640488583168L;
        ko4 ko4Var2 = this.o0;
        if (ko4Var2 != null) {
            ((mo4) ko4Var2).b();
        }
    }

    public final void U0() {
        od1 od1Var;
        ko4 ko4Var = this.o0;
        if (ko4Var != null && (od1Var = this.n0) != null) {
            mo4 mo4Var = (mo4) ko4Var;
            if (!i33.a(mo4Var.c(), this.s0)) {
                this.k0.n(new ni1(od1Var.B(hk2.U(mo4Var.c()))));
                this.s0 = new i33(mo4Var.c());
            }
        }
    }

    @Override // defpackage.gz5
    public final void p0(rz5 rz5Var) {
        rz5Var.b(at3.a, new xs3(this, 1));
    }

    @Override // defpackage.fm2
    public final void y(m74 m74Var) {
        this.p0.setValue(m74Var);
    }
}

package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xx6  reason: default package */
/* loaded from: classes.dex */
public final class xx6 extends ga6 {
    public final ga6 e;
    public final boolean f;
    public final boolean g;
    public mi2 h;
    public final long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xx6(ga6 ga6Var, mi2 mi2Var, boolean z, boolean z2) {
        super(0L, ka6.X);
        mi2 mi2Var2;
        d96 d96Var = ma6.a;
        this.e = ga6Var;
        this.f = z;
        this.g = z2;
        this.h = ma6.k(mi2Var, (ga6Var == null || (mi2Var2 = ga6Var.e()) == null) ? ma6.j.e : mi2Var2, z);
        this.i = jk2.s();
    }

    @Override // defpackage.ga6
    public final void c() {
        ga6 ga6Var;
        this.c = true;
        if (this.g && (ga6Var = this.e) != null) {
            ga6Var.c();
        }
    }

    @Override // defpackage.ga6
    public final ka6 d() {
        return v().d();
    }

    @Override // defpackage.ga6
    public final mi2 e() {
        return this.h;
    }

    @Override // defpackage.ga6
    public final boolean f() {
        return v().f();
    }

    @Override // defpackage.ga6
    public final long g() {
        return v().g();
    }

    @Override // defpackage.ga6
    public final mi2 i() {
        return null;
    }

    @Override // defpackage.ga6
    public final void k() {
        ct3.X0();
        throw null;
    }

    @Override // defpackage.ga6
    public final void l() {
        ct3.X0();
        throw null;
    }

    @Override // defpackage.ga6
    public final void m() {
        v().m();
    }

    @Override // defpackage.ga6
    public final void n(pe6 pe6Var) {
        v().n(pe6Var);
    }

    @Override // defpackage.ga6
    public final ga6 u(mi2 mi2Var) {
        mi2 k = ma6.k(mi2Var, this.h, true);
        if (!this.f) {
            return ma6.g(v().u(null), k, true);
        }
        return v().u(k);
    }

    public final ga6 v() {
        ga6 ga6Var = this.e;
        if (ga6Var == null) {
            return ma6.j;
        }
        return ga6Var;
    }
}

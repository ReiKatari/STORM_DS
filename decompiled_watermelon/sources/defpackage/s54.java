package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s54  reason: default package */
/* loaded from: classes.dex */
public final class s54 extends ga6 {
    public final mi2 e;
    public final ga6 f;

    public s54(long j, ka6 ka6Var, mi2 mi2Var, ga6 ga6Var) {
        super(j, ka6Var);
        this.e = mi2Var;
        this.f = ga6Var;
        ga6Var.k();
    }

    @Override // defpackage.ga6
    public final void c() {
        ga6 ga6Var = this.f;
        if (!this.c) {
            if (this.b != ga6Var.g()) {
                a();
            }
            ga6Var.l();
            this.c = true;
            synchronized (ma6.c) {
                o();
            }
        }
    }

    @Override // defpackage.ga6
    public final mi2 e() {
        return this.e;
    }

    @Override // defpackage.ga6
    public final boolean f() {
        return true;
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
    public final void n(pe6 pe6Var) {
        d96 d96Var = ma6.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // defpackage.ga6
    public final ga6 u(mi2 mi2Var) {
        return new s54(this.b, this.a, ma6.k(mi2Var, this.e, true), this.f);
    }

    @Override // defpackage.ga6
    public final void m() {
    }
}

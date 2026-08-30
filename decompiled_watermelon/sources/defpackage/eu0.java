package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: eu0  reason: default package */
/* loaded from: classes.dex */
public final class eu0 extends b2 {
    public final o31 c;
    public aj2 d;
    public q60 e;
    public kd6 f;
    public boolean g;

    public eu0(o31 o31Var, rr4 rr4Var) {
        super(rr4Var);
        this.c = o31Var;
        this.d = new jg(2, 4, null);
    }

    @Override // defpackage.b2
    public final void l() {
        q60 q60Var = this.e;
        if (q60Var != null) {
            q60Var.l(new CancellationException("onBack cancelled"), true);
        }
        kd6 kd6Var = this.f;
        if (kd6Var != null) {
            kd6Var.i(null);
        }
        this.e = null;
        this.f = null;
        this.g = false;
    }

    @Override // defpackage.b2
    public final void m() {
        if (this.e != null && !this.g) {
            l();
        }
        if (this.e == null) {
            this.g = false;
            this.e = n40.f(-2, h60.SUSPEND, null, 4);
            this.f = tq5.w(this.c, null, null, new y(this, (j11) null, 22), 3);
        }
        q60 q60Var = this.e;
        if (q60Var != null) {
            q60Var.h(null);
        }
        this.g = false;
    }

    @Override // defpackage.b2
    public final void n(ky kyVar) {
        q60 q60Var = this.e;
        if (q60Var != null) {
            q60Var.c(kyVar);
        }
    }

    @Override // defpackage.b2
    public final void o() {
        l();
        if (super.k()) {
            this.g = true;
            this.e = n40.f(-2, h60.SUSPEND, null, 4);
            this.f = tq5.w(this.c, null, null, new y(this, (j11) null, 22), 3);
        }
    }

    public final void s(boolean z) {
        kd6 kd6Var;
        if (!z && super.k() && (kd6Var = this.f) != null && !kd6Var.d()) {
            l();
        }
        ((my) this.a).f(z);
        ((ly) this.b).f(z);
    }
}

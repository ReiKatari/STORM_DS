package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ax0  reason: default package */
/* loaded from: classes.dex */
public final class ax0 extends d2 {
    public final w61 c;
    public eo2 d;
    public v80 e;
    public ap6 f;
    public boolean g;

    public ax0(w61 w61Var, u05 u05Var) {
        super(u05Var);
        this.c = w61Var;
        this.d = new wg(2, null, 5);
    }

    @Override // defpackage.d2
    public final void l() {
        v80 v80Var = this.e;
        if (v80Var != null) {
            v80Var.k(new CancellationException("onBack cancelled"), true);
        }
        ap6 ap6Var = this.f;
        if (ap6Var != null) {
            ap6Var.h(null);
        }
        this.e = null;
        this.f = null;
        this.g = false;
    }

    @Override // defpackage.d2
    public final void m() {
        if (this.e != null && !this.g) {
            l();
        }
        if (this.e == null) {
            this.g = false;
            this.e = nb3.c(-2, m80.SUSPEND, null, 4);
            this.f = hv.L(this.c, null, null, new z(this, (r41) null, 22), 3);
        }
        v80 v80Var = this.e;
        if (v80Var != null) {
            v80Var.i(null);
        }
        this.g = false;
    }

    @Override // defpackage.d2
    public final void n(b00 b00Var) {
        v80 v80Var = this.e;
        if (v80Var != null) {
            v80Var.c(b00Var);
        }
    }

    @Override // defpackage.d2
    public final void o() {
        l();
        if (super.k()) {
            this.g = true;
            this.e = nb3.c(-2, m80.SUSPEND, null, 4);
            this.f = hv.L(this.c, null, null, new z(this, (r41) null, 22), 3);
        }
    }

    public final void s(boolean z) {
        ap6 ap6Var;
        if (!z && super.k() && (ap6Var = this.f) != null && !ap6Var.e()) {
            l();
        }
        ((d00) this.a).f(z);
        ((c00) this.b).f(z);
    }
}

package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ij3  reason: default package */
/* loaded from: classes.dex */
public final class ij3 implements bj5, o61 {
    public final l61 A;
    public final eo2 B;
    public final o41 L;
    public ap6 R;

    public ij3(l61 l61Var, eo2 eo2Var) {
        this.A = l61Var;
        this.B = eo2Var;
        this.L = g04.i(l61Var.N(this));
    }

    @Override // defpackage.l61
    public final l61 D(k61 k61Var) {
        return jw2.w(this, k61Var);
    }

    @Override // defpackage.l61
    public final l61 N(l61 l61Var) {
        return jw2.y(this, l61Var);
    }

    @Override // defpackage.l61
    public final j61 Z(k61 k61Var) {
        return jw2.p(this, k61Var);
    }

    @Override // defpackage.bj5
    public final void a() {
        ap6 ap6Var = this.R;
        if (ap6Var != null) {
            ap6Var.z(new zj2(1));
        }
        this.R = null;
    }

    @Override // defpackage.bj5
    public final void b() {
        ap6 ap6Var = this.R;
        if (ap6Var != null) {
            ap6Var.z(new zj2(1));
        }
        this.R = null;
    }

    @Override // defpackage.bj5
    public final void c() {
        ap6 ap6Var = this.R;
        if (ap6Var != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            ap6Var.h(cancellationException);
        }
        this.R = hv.L(this.L, null, null, this.B, 3);
    }

    @Override // defpackage.j61
    public final k61 getKey() {
        return cs1.Z;
    }

    @Override // defpackage.o61
    public final void u(l61 l61Var, Throwable th) {
        cy0 cy0Var = (cy0) l61Var.Z(cy0.B);
        if (cy0Var != null) {
            nw7.s0(th, new q6(18, cy0Var, this));
        }
        o61 o61Var = (o61) this.A.Z(cs1.Z);
        if (o61Var != null) {
            o61Var.u(l61Var, th);
            return;
        }
        throw th;
    }

    @Override // defpackage.l61
    public final Object x(eo2 eo2Var, Object obj) {
        return eo2Var.o(obj, this);
    }
}

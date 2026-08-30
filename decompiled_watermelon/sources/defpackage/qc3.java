package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qc3  reason: default package */
/* loaded from: classes.dex */
public final class qc3 implements l95, h31 {
    public final e31 A;
    public final aj2 B;
    public final g11 L;
    public kd6 R;

    public qc3(e31 e31Var, aj2 aj2Var) {
        this.A = e31Var;
        this.B = aj2Var;
        this.L = iq2.c(e31Var.C(this));
    }

    @Override // defpackage.e31
    public final e31 C(e31 e31Var) {
        return se.O(this, e31Var);
    }

    @Override // defpackage.e31
    public final c31 I(d31 d31Var) {
        return se.z(this, d31Var);
    }

    @Override // defpackage.h31
    public final void J(e31 e31Var, Throwable th) {
        gv0 gv0Var = (gv0) e31Var.I(gv0.B);
        if (gv0Var != null) {
            f34.U(th, new p6(19, gv0Var, this));
        }
        h31 h31Var = (h31) this.A.I(iq0.d0);
        if (h31Var != null) {
            h31Var.J(e31Var, th);
            return;
        }
        throw th;
    }

    @Override // defpackage.e31
    public final Object N(aj2 aj2Var, Object obj) {
        return aj2Var.j(obj, this);
    }

    @Override // defpackage.e31
    public final e31 T(d31 d31Var) {
        return se.J(this, d31Var);
    }

    @Override // defpackage.l95
    public final void a() {
        kd6 kd6Var = this.R;
        if (kd6Var != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            kd6Var.i(cancellationException);
        }
        this.R = tq5.w(this.L, null, null, this.B, 3);
    }

    @Override // defpackage.l95
    public final void b() {
        kd6 kd6Var = this.R;
        if (kd6Var != null) {
            kd6Var.u(new af2(1));
        }
        this.R = null;
    }

    @Override // defpackage.l95
    public final void c() {
        kd6 kd6Var = this.R;
        if (kd6Var != null) {
            kd6Var.u(new af2(1));
        }
        this.R = null;
    }

    @Override // defpackage.c31
    public final d31 getKey() {
        return iq0.d0;
    }
}

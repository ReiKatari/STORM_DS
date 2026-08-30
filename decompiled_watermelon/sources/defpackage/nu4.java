package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nu4  reason: default package */
/* loaded from: classes.dex */
public final class nu4 extends p0 implements lj0, zz5 {
    public final q60 Y;

    public nu4(e31 e31Var, q60 q60Var) {
        super(e31Var, true);
        this.Y = q60Var;
    }

    @Override // defpackage.zz5
    public final Object b(j11 j11Var, Object obj) {
        return this.Y.b(j11Var, obj);
    }

    @Override // defpackage.zz5
    public final Object c(Object obj) {
        return this.Y.c(obj);
    }

    @Override // defpackage.p63, defpackage.c63, defpackage.lj0
    public final void i(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new d63(y(), null, this);
        }
        u(cancellationException);
    }

    @Override // defpackage.lj0
    public final i60 iterator() {
        q60 q60Var = this.Y;
        q60Var.getClass();
        return new i60(q60Var);
    }

    @Override // defpackage.lj0
    public final q9 j() {
        return this.Y.j();
    }

    @Override // defpackage.lj0
    public final Object n(nk6 nk6Var) {
        q60 q60Var = this.Y;
        q60Var.getClass();
        return q60.L(q60Var, nk6Var);
    }

    @Override // defpackage.lj0
    public final Object o() {
        return this.Y.o();
    }

    @Override // defpackage.lj0
    public final Object q(pr0 pr0Var) {
        q60 q60Var = this.Y;
        q60Var.getClass();
        Object M = q60.M(q60Var, pr0Var);
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        return M;
    }

    @Override // defpackage.p63
    public final void u(Throwable th) {
        CancellationException cancellationException = (CancellationException) th;
        this.Y.l(cancellationException, true);
        t(cancellationException);
    }

    @Override // defpackage.p0
    public final void u0(Throwable th, boolean z) {
        if (!this.Y.l(th, false) && !z) {
            w81.t(this.X, th);
        }
    }

    @Override // defpackage.p0
    public final void v0(Object obj) {
        o27 o27Var = (o27) obj;
        this.Y.h(null);
    }

    public final boolean w0(Throwable th) {
        return this.Y.l(th, false);
    }
}

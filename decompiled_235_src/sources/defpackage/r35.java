package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r35  reason: default package */
/* loaded from: classes.dex */
public final class r35 extends q0 implements ul0, ob6 {
    public final v80 Y;

    public r35(l61 l61Var, v80 v80Var) {
        super(l61Var, true);
        this.Y = v80Var;
    }

    @Override // defpackage.ob6
    public final Object a(r41 r41Var, Object obj) {
        return this.Y.a(r41Var, obj);
    }

    @Override // defpackage.ob6
    public final Object c(Object obj) {
        return this.Y.c(obj);
    }

    @Override // defpackage.ed3, defpackage.rc3
    public final void h(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new sc3(C(), null, this);
        }
        z(cancellationException);
    }

    @Override // defpackage.ul0
    public final n80 iterator() {
        v80 v80Var = this.Y;
        v80Var.getClass();
        return new n80(v80Var);
    }

    @Override // defpackage.ul0
    public final eb l() {
        return this.Y.l();
    }

    @Override // defpackage.ul0
    public final Object m() {
        return this.Y.m();
    }

    @Override // defpackage.ul0
    public final Object o(hw6 hw6Var) {
        v80 v80Var = this.Y;
        v80Var.getClass();
        return v80.L(v80Var, hw6Var);
    }

    @Override // defpackage.ul0
    public final Object p(cu0 cu0Var) {
        v80 v80Var = this.Y;
        v80Var.getClass();
        Object M = v80.M(v80Var, cu0Var);
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        return M;
    }

    @Override // defpackage.q0
    public final void u0(Throwable th, boolean z) {
        if (!this.Y.k(th, false) && !z) {
            f04.H(this.X, th);
        }
    }

    @Override // defpackage.q0
    public final void v0(Object obj) {
        jg7 jg7Var = (jg7) obj;
        this.Y.i(null);
    }

    public final boolean w0(Throwable th) {
        return this.Y.k(th, false);
    }

    @Override // defpackage.ed3
    public final void z(Throwable th) {
        CancellationException cancellationException = (CancellationException) th;
        this.Y.k(cancellationException, true);
        s(cancellationException);
    }
}

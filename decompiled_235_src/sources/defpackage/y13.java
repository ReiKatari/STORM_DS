package defpackage;

import java.util.concurrent.Executor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y13  reason: default package */
/* loaded from: classes.dex */
public final class y13 extends t13 {
    public final Executor r0;
    public final Object s0 = new Object();
    public s23 t0;
    public x13 u0;

    public y13(Executor executor) {
        this.r0 = executor;
    }

    @Override // defpackage.t13
    public final s23 a(v23 v23Var) {
        return v23Var.a();
    }

    @Override // defpackage.t13
    public final void d() {
        synchronized (this.s0) {
            try {
                s23 s23Var = this.t0;
                if (s23Var != null) {
                    s23Var.close();
                    this.t0 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.t13
    public final void f(s23 s23Var) {
        synchronized (this.s0) {
            try {
                if (!this.q0) {
                    s23Var.close();
                } else if (this.u0 != null) {
                    if (s23Var.S().c() <= this.u0.B.S().c()) {
                        s23Var.close();
                    } else {
                        s23 s23Var2 = this.t0;
                        if (s23Var2 != null) {
                            s23Var2.close();
                        }
                        this.t0 = s23Var;
                    }
                } else {
                    x13 x13Var = new x13(s23Var, this);
                    this.u0 = x13Var;
                    gx3 c = c(x13Var);
                    c.a(u24.j(), new uo2(0, c, new d51(x13Var, 29)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

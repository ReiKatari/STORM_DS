package defpackage;

import java.util.concurrent.Executor;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: uv2  reason: default package */
/* loaded from: classes.dex */
public final class uv2 extends pv2 {
    public final Executor q0;
    public final Object r0 = new Object();
    public ow2 s0;
    public tv2 t0;

    public uv2(Executor executor) {
        this.q0 = executor;
    }

    @Override // defpackage.pv2
    public final ow2 a(rw2 rw2Var) {
        return rw2Var.b();
    }

    @Override // defpackage.pv2
    public final void d() {
        synchronized (this.r0) {
            try {
                ow2 ow2Var = this.s0;
                if (ow2Var != null) {
                    ow2Var.close();
                    this.s0 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.pv2
    public final void f(ow2 ow2Var) {
        synchronized (this.r0) {
            try {
                if (!this.p0) {
                    ow2Var.close();
                } else if (this.t0 != null) {
                    if (ow2Var.s().c() <= this.t0.B.s().c()) {
                        ow2Var.close();
                    } else {
                        ow2 ow2Var2 = this.s0;
                        if (ow2Var2 != null) {
                            ow2Var2.close();
                        }
                        this.s0 = ow2Var;
                    }
                } else {
                    tv2 tv2Var = new tv2(ow2Var, this);
                    this.t0 = tv2Var;
                    fq3 c = c(tv2Var);
                    t71 t71Var = new t71(26, tv2Var);
                    c.a(new qj2(0, c, t71Var), iq2.l());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

package defpackage;

import android.window.OnBackInvokedDispatcher;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kc4  reason: default package */
/* loaded from: classes.dex */
public final class kc4 {
    public final Runnable a;
    public final il6 b = new il6(new bz2(7, this));

    public kc4(Runnable runnable) {
        this.a = runnable;
    }

    public final void a(fn3 fn3Var, fc4 fc4Var) {
        fc4Var.getClass();
        final rm3 lifecycle = fn3Var.getLifecycle();
        if (lifecycle.b() == qm3.DESTROYED) {
            return;
        }
        ec4 ec4Var = new ec4(fc4Var, new gc4(fn3Var, fc4Var));
        fc4Var.a.add(ec4Var);
        ec4Var.g(false);
        q9.e(c().c, ec4Var);
        final wa1 wa1Var = new wa1(ec4Var, this, lifecycle);
        lifecycle.a(wa1Var);
        fc4Var.c.add(new AutoCloseable() { // from class: hc4
            @Override // java.lang.AutoCloseable
            public final void close() {
                rm3.this.c(wa1Var);
            }
        });
    }

    public final void b(fc4 fc4Var) {
        fc4Var.getClass();
        ec4 ec4Var = new ec4(fc4Var, new gc4(null, fc4Var));
        fc4Var.a.add(ec4Var);
        q9.e(c().c, ec4Var);
    }

    public final ic4 c() {
        return (ic4) this.b.getValue();
    }

    public final void d(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        c().c.g(new cc4(onBackInvokedDispatcher, 0), 1);
        c().c.g(new cc4(onBackInvokedDispatcher, 1000000), 0);
    }
}

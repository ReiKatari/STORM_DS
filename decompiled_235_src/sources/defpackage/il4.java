package defpackage;

import android.window.OnBackInvokedDispatcher;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: il4  reason: default package */
/* loaded from: classes.dex */
public final class il4 {
    public final Runnable a;
    public final ex6 b = new ex6(new er2(this, 11));

    public il4(Runnable runnable) {
        this.a = runnable;
    }

    public final void a(hu3 hu3Var, dl4 dl4Var) {
        dl4Var.getClass();
        final ut3 lifecycle = hu3Var.getLifecycle();
        if (lifecycle.b() == tt3.DESTROYED) {
            return;
        }
        cl4 cl4Var = new cl4(dl4Var, new el4(hu3Var, dl4Var));
        dl4Var.a.add(cl4Var);
        cl4Var.g(false);
        eb.e(c().c, cl4Var);
        final se1 se1Var = new se1(cl4Var, this, lifecycle);
        lifecycle.a(se1Var);
        dl4Var.c.add(new AutoCloseable() { // from class: fl4
            @Override // java.lang.AutoCloseable
            public final void close() {
                ut3.this.c(se1Var);
            }
        });
    }

    public final void b(dl4 dl4Var) {
        dl4Var.getClass();
        cl4 cl4Var = new cl4(dl4Var, new el4(null, dl4Var));
        dl4Var.a.add(cl4Var);
        eb.e(c().c, cl4Var);
    }

    public final gl4 c() {
        return (gl4) this.b.getValue();
    }

    public final void d(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        c().c.g(new al4(onBackInvokedDispatcher, 0), 1);
        c().c.g(new al4(onBackInvokedDispatcher, 1000000), 0);
    }
}

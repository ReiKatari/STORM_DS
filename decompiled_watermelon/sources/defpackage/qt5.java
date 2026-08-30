package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qt5  reason: default package */
/* loaded from: classes.dex */
public final class qt5 implements dn3, AutoCloseable {
    public final String A;
    public final pt5 B;
    public boolean L;

    public qt5(String str, pt5 pt5Var) {
        this.A = str;
        this.B = pt5Var;
    }

    @Override // defpackage.dn3
    public final void d(fn3 fn3Var, pm3 pm3Var) {
        if (pm3Var == pm3.ON_DESTROY) {
            this.L = false;
            fn3Var.getLifecycle().c(this);
        }
    }

    public final void i(rm3 rm3Var, xt5 xt5Var) {
        xt5Var.getClass();
        rm3Var.getClass();
        if (!this.L) {
            this.L = true;
            rm3Var.a(this);
            xt5Var.c(this.A, (ss0) this.B.b.e);
            return;
        }
        i.n("Already attached to lifecycleOwner");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}

package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w46  reason: default package */
/* loaded from: classes.dex */
public final class w46 implements fu3, AutoCloseable {
    public final String A;
    public final v46 B;
    public boolean L;

    public w46(String str, v46 v46Var) {
        this.A = str;
        this.B = v46Var;
    }

    public final void e(ut3 ut3Var, d56 d56Var) {
        d56Var.getClass();
        ut3Var.getClass();
        if (!this.L) {
            this.L = true;
            ut3Var.a(this);
            d56Var.c(this.A, (gv0) this.B.b.e);
            return;
        }
        i.m("Already attached to lifecycleOwner");
    }

    @Override // defpackage.fu3
    public final void h(hu3 hu3Var, st3 st3Var) {
        if (st3Var == st3.ON_DESTROY) {
            this.L = false;
            hu3Var.getLifecycle().c(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}

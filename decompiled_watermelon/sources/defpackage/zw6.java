package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zw6  reason: default package */
/* loaded from: classes.dex */
public final class zw6 implements ae6 {
    public final gx6 A;
    public mi2 B;
    public mi2 L;
    public final /* synthetic */ ax6 R;

    public zw6(ax6 ax6Var, gx6 gx6Var, mi2 mi2Var, mi2 mi2Var2) {
        this.R = ax6Var;
        this.A = gx6Var;
        this.B = mi2Var;
        this.L = mi2Var2;
    }

    public final void b(ex6 ex6Var) {
        Object n = this.L.n(ex6Var.c());
        boolean g = this.R.c.g();
        gx6 gx6Var = this.A;
        if (g) {
            gx6Var.h(this.L.n(ex6Var.a()), n, (y72) this.B.n(ex6Var));
        } else {
            gx6Var.i(n, (y72) this.B.n(ex6Var));
        }
    }

    @Override // defpackage.ae6
    public final Object getValue() {
        b(this.R.c.f());
        return this.A.e0.getValue();
    }
}

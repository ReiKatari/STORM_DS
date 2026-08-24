package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v97  reason: default package */
/* loaded from: classes.dex */
public final class v97 implements pp6 {
    public final ca7 A;
    public qn2 B;
    public qn2 L;
    public final /* synthetic */ w97 R;

    public v97(w97 w97Var, ca7 ca7Var, qn2 qn2Var, qn2 qn2Var2) {
        this.R = w97Var;
        this.A = ca7Var;
        this.B = qn2Var;
        this.L = qn2Var2;
    }

    public final void a(aa7 aa7Var) {
        Object g = this.L.g(aa7Var.c());
        boolean g2 = this.R.c.g();
        ca7 ca7Var = this.A;
        if (g2) {
            ca7Var.h(this.L.g(aa7Var.a()), g, (rc2) this.B.g(aa7Var));
        } else {
            ca7Var.i(g, (rc2) this.B.g(aa7Var));
        }
    }

    @Override // defpackage.pp6
    public final Object getValue() {
        a(this.R.c.f());
        return this.A.f0.getValue();
    }
}

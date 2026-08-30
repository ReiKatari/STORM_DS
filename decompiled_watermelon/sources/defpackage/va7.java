package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: va7  reason: default package */
/* loaded from: classes.dex */
public final class va7 implements gh3 {
    public final qo0 A;
    public final ki2 B;
    public final ki2 L;
    public final ki2 R;
    public ra7 X;

    public va7(qo0 qo0Var, ki2 ki2Var, ki2 ki2Var2, ki2 ki2Var3) {
        this.A = qo0Var;
        this.B = ki2Var;
        this.L = ki2Var2;
        this.R = ki2Var3;
    }

    @Override // defpackage.gh3
    public final Object getValue() {
        ra7 ra7Var = this.X;
        if (ra7Var == null) {
            za7 za7Var = (za7) this.B.c();
            xa7 xa7Var = (xa7) this.L.c();
            z31 z31Var = (z31) this.R.c();
            za7Var.getClass();
            xa7Var.getClass();
            z31Var.getClass();
            q9 q9Var = new q9(za7Var, xa7Var, z31Var);
            qo0 qo0Var = this.A;
            String b = qo0Var.b();
            if (b != null) {
                ra7 F = q9Var.F(qo0Var, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
                this.X = F;
                return F;
            }
            i.i("Local and anonymous classes can not be ViewModels");
            return null;
        }
        return ra7Var;
    }
}

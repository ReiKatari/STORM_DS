package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: la5  reason: default package */
/* loaded from: classes.dex */
public final class la5 implements dn3 {
    public final /* synthetic */ pm3 A;
    public final /* synthetic */ n75 B;
    public final /* synthetic */ o31 L;
    public final /* synthetic */ pm3 R;
    public final /* synthetic */ ih0 X;
    public final /* synthetic */ b34 Y;
    public final /* synthetic */ aj2 Z;

    public la5(pm3 pm3Var, n75 n75Var, o31 o31Var, pm3 pm3Var2, ih0 ih0Var, b34 b34Var, aj2 aj2Var) {
        this.A = pm3Var;
        this.B = n75Var;
        this.L = o31Var;
        this.R = pm3Var2;
        this.X = ih0Var;
        this.Y = b34Var;
        this.Z = aj2Var;
    }

    @Override // defpackage.dn3
    public final void d(fn3 fn3Var, pm3 pm3Var) {
        pm3 pm3Var2 = this.A;
        n75 n75Var = this.B;
        if (pm3Var == pm3Var2) {
            n75Var.A = tq5.w(this.L, null, null, new m5((Object) this.Y, this.Z, (j11) null, 26), 3);
            return;
        }
        if (pm3Var == this.R) {
            c63 c63Var = (c63) n75Var.A;
            if (c63Var != null) {
                c63Var.i(null);
            }
            n75Var.A = null;
        }
        if (pm3Var == pm3.ON_DESTROY) {
            this.X.k(o27.a);
        }
    }
}

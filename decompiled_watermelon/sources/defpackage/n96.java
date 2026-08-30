package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: n96  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class n96 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ p96 B;

    public /* synthetic */ n96(p96 p96Var, int i) {
        this.A = i;
        this.B = p96Var;
    }

    @Override // defpackage.ki2
    public final Object c() {
        int i = this.A;
        p96 p96Var = this.B;
        switch (i) {
            case 0:
                ih0 ih0Var = p96Var.d;
                if (ih0Var.w() instanceof b84) {
                    ih0Var.k(w96.Dismissed);
                }
                return Boolean.TRUE;
            default:
                ih0 ih0Var2 = p96Var.d;
                if (ih0Var2.w() instanceof b84) {
                    ih0Var2.k(w96.ActionPerformed);
                }
                return o27.a;
        }
    }
}

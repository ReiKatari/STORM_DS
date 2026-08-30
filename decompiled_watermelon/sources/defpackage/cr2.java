package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cr2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cr2 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ dr2 B;

    public /* synthetic */ cr2(dr2 dr2Var, int i) {
        this.A = i;
        this.B = dr2Var;
    }

    @Override // defpackage.ki2
    public final Object c() {
        int i = this.A;
        o27 o27Var = o27.a;
        dr2 dr2Var = this.B;
        switch (i) {
            case 0:
                b17 b17Var = dr2Var.q0;
                if (b17Var != null) {
                    b17Var.getValue();
                    return o27Var;
                }
                throw wh1.c("Font resolution state is not set.");
            default:
                b17 b17Var2 = dr2Var.q0;
                if (b17Var2 != null) {
                    b17Var2.getValue();
                    return o27Var;
                }
                throw wh1.c("Font resolution state is not set.");
        }
    }
}

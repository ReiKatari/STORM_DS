package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gq5  reason: default package */
/* loaded from: classes.dex */
public final class gq5 implements u92 {
    public final /* synthetic */ int A;
    public final /* synthetic */ wb2 B;

    public /* synthetic */ gq5(wb2 wb2Var, int i) {
        this.A = i;
        this.B = wb2Var;
    }

    @Override // defpackage.u92
    public final Object a(w92 w92Var, j11 j11Var) {
        int i = this.A;
        o27 o27Var = o27.a;
        wb2 wb2Var = this.B;
        switch (i) {
            case 0:
                Object a = wb2Var.a(new z6(w92Var, 26), j11Var);
                if (a == p31.COROUTINE_SUSPENDED) {
                    return a;
                }
                return o27Var;
            default:
                Object a2 = wb2Var.a(new z6(w92Var, 29), j11Var);
                if (a2 == p31.COROUTINE_SUSPENDED) {
                    return a2;
                }
                return o27Var;
        }
    }
}

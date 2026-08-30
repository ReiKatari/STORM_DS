package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zy1  reason: default package */
/* loaded from: classes.dex */
public final class zy1 implements u92 {
    public final /* synthetic */ int A;
    public final /* synthetic */ u92[] B;

    public /* synthetic */ zy1(u92[] u92VarArr, int i) {
        this.A = i;
        this.B = u92VarArr;
    }

    @Override // defpackage.u92
    public final Object a(w92 w92Var, j11 j11Var) {
        int i = this.A;
        o27 o27Var = o27.a;
        u92[] u92VarArr = this.B;
        switch (i) {
            case 0:
                Object G = n40.G(j11Var, w92Var, new xy1(u92VarArr, 0), new yy1(3, 0, null), u92VarArr);
                if (G == p31.COROUTINE_SUSPENDED) {
                    return G;
                }
                return o27Var;
            default:
                Object G2 = n40.G(j11Var, w92Var, new xy1(u92VarArr, 2), new yy1(3, 1, null), u92VarArr);
                if (G2 == p31.COROUTINE_SUSPENDED) {
                    return G2;
                }
                return o27Var;
        }
    }
}

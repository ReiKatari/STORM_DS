package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nn0  reason: default package */
/* loaded from: classes.dex */
public final class nn0 implements u92 {
    public final /* synthetic */ int A;
    public final /* synthetic */ q45 B;

    public /* synthetic */ nn0(q45 q45Var, int i) {
        this.A = i;
        this.B = q45Var;
    }

    @Override // defpackage.u92
    public final Object a(w92 w92Var, j11 j11Var) {
        int i = this.A;
        o27 o27Var = o27.a;
        q45 q45Var = this.B;
        switch (i) {
            case 0:
                Object a = q45Var.A.a(new z6(w92Var, 6), j11Var);
                if (a == p31.COROUTINE_SUSPENDED) {
                    return a;
                }
                return o27Var;
            default:
                Object a2 = q45Var.A.a(new z6(w92Var, 7), j11Var);
                if (a2 == p31.COROUTINE_SUSPENDED) {
                    return a2;
                }
                return o27Var;
        }
    }
}

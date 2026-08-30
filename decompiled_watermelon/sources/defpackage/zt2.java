package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zt2  reason: default package */
/* loaded from: classes.dex */
public final class zt2 extends bu2 {
    public final /* synthetic */ int d;
    public final a90 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zt2(db5 db5Var, zb4 zb4Var, t11 t11Var, a90 a90Var, int i) {
        super(db5Var, zb4Var, t11Var);
        this.d = i;
        this.e = a90Var;
    }

    @Override // defpackage.bu2
    public final Object a(xb4 xb4Var, Object[] objArr) {
        int i = this.d;
        a90 a90Var = this.e;
        switch (i) {
            case 0:
                return a90Var.d(xb4Var);
            default:
                y80 y80Var = (y80) a90Var.d(xb4Var);
                j11 j11Var = (j11) objArr[objArr.length - 1];
                try {
                    ih0 ih0Var = new ih0(1, nk2.J(j11Var));
                    ih0Var.x();
                    ih0Var.z(new yb3(y80Var, 2));
                    y80Var.d(new zb3(ih0Var, 2));
                    Object v = ih0Var.v();
                    p31 p31Var = p31.COROUTINE_SUSPENDED;
                    return v;
                } catch (Exception e) {
                    return nl2.W(e, j11Var);
                }
        }
    }
}

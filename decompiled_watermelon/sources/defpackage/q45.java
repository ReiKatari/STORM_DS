package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: q45  reason: default package */
/* loaded from: classes.dex */
public final class q45 implements ce6, u92, nj2 {
    public final /* synthetic */ ce6 A;

    public q45(ee6 ee6Var) {
        this.A = ee6Var;
    }

    @Override // defpackage.u92
    public final Object a(w92 w92Var, j11 j11Var) {
        return this.A.a(w92Var, j11Var);
    }

    @Override // defpackage.nj2
    public final u92 c(e31 e31Var, int i, h60 h60Var) {
        if (((i < 0 || i >= 2) && i != -2) || h60Var != h60.DROP_OLDEST) {
            return d46.d(this, e31Var, i, h60Var);
        }
        return this;
    }

    @Override // defpackage.ce6
    public final Object getValue() {
        return this.A.getValue();
    }
}

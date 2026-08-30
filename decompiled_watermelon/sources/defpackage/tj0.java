package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tj0  reason: default package */
/* loaded from: classes.dex */
public final class tj0 extends oj0 {
    public final bj2 X;

    public tj0(bj2 bj2Var, u92 u92Var, e31 e31Var, int i, h60 h60Var) {
        super(i, h60Var, e31Var, u92Var);
        this.X = bj2Var;
    }

    @Override // defpackage.nj0
    public final nj0 g(e31 e31Var, int i, h60 h60Var) {
        return new tj0(this.X, this.R, e31Var, i, h60Var);
    }

    @Override // defpackage.oj0
    public final Object j(w92 w92Var, j11 j11Var) {
        Object k = iq2.k(new qj0(this, w92Var, null), j11Var);
        if (k == p31.COROUTINE_SUSPENDED) {
            return k;
        }
        return o27.a;
    }
}

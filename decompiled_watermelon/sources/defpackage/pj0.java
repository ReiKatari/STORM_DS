package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pj0  reason: default package */
/* loaded from: classes.dex */
public final class pj0 extends oj0 {
    public pj0(u92 u92Var, e31 e31Var, int i, h60 h60Var, int i2) {
        super((i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? h60.SUSPEND : h60Var, (i2 & 2) != 0 ? mp1.A : e31Var, u92Var);
    }

    @Override // defpackage.nj0
    public final nj0 g(e31 e31Var, int i, h60 h60Var) {
        return new oj0(i, h60Var, e31Var, this.R);
    }

    @Override // defpackage.nj0
    public final u92 h() {
        return this.R;
    }

    @Override // defpackage.oj0
    public final Object j(w92 w92Var, j11 j11Var) {
        Object a = this.R.a(w92Var, j11Var);
        if (a == p31.COROUTINE_SUSPENDED) {
            return a;
        }
        return o27.a;
    }
}

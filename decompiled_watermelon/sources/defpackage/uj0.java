package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: uj0  reason: default package */
/* loaded from: classes.dex */
public final class uj0 extends nj0 {
    public final Iterable R;

    public uj0(Iterable iterable, e31 e31Var, int i, h60 h60Var) {
        super(e31Var, i, h60Var);
        this.R = iterable;
    }

    @Override // defpackage.nj0
    public final Object f(nu4 nu4Var, j11 j11Var) {
        a06 a06Var = new a06(nu4Var);
        for (u92 u92Var : this.R) {
            tq5.w(nu4Var, null, null, new y(u92Var, a06Var, null, 15), 3);
        }
        return o27.a;
    }

    @Override // defpackage.nj0
    public final nj0 g(e31 e31Var, int i, h60 h60Var) {
        return new uj0(this.R, e31Var, i, h60Var);
    }

    @Override // defpackage.nj0
    public final lj0 i(o31 o31Var) {
        y yVar = new y(this, (j11) null, 13);
        h60 h60Var = h60.SUSPEND;
        s31 s31Var = s31.DEFAULT;
        nu4 nu4Var = new nu4(pu.y(o31Var, this.A), n40.f(this.B, h60Var, null, 4));
        s31Var.invoke(yVar, nu4Var, nu4Var);
        return nu4Var;
    }
}

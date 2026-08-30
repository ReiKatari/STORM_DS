package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ym3  reason: default package */
/* loaded from: classes.dex */
public final class ym3 implements dn3, o31 {
    public final rm3 A;
    public final e31 B;

    public ym3(rm3 rm3Var, e31 e31Var) {
        e31Var.getClass();
        this.A = rm3Var;
        this.B = e31Var;
        if (rm3Var.b() == qm3.DESTROYED) {
            ln2.t(e31Var, null);
        }
    }

    @Override // defpackage.dn3
    public final void d(fn3 fn3Var, pm3 pm3Var) {
        rm3 rm3Var = this.A;
        if (rm3Var.b().compareTo(qm3.DESTROYED) <= 0) {
            rm3Var.c(this);
            ln2.t(this.B, null);
        }
    }

    @Override // defpackage.o31
    public final e31 w() {
        return this.B;
    }
}

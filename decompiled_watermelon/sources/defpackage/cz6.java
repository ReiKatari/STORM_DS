package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cz6  reason: default package */
/* loaded from: classes.dex */
public final class cz6 extends dz6 {
    public final /* synthetic */ dz6 a;

    public cz6(dz6 dz6Var) {
        this.a = dz6Var;
    }

    @Override // defpackage.dz6
    public final Object b(o83 o83Var) {
        if (o83Var.n0() == q83.NULL) {
            o83Var.j0();
            return null;
        }
        return this.a.b(o83Var);
    }

    @Override // defpackage.dz6
    public final void c(b93 b93Var, Object obj) {
        if (obj == null) {
            b93Var.F();
        } else {
            this.a.c(b93Var, obj);
        }
    }

    public final String toString() {
        return "NullSafeTypeAdapter[" + this.a + "]";
    }
}

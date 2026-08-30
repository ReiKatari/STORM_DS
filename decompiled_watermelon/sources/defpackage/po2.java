package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: po2  reason: default package */
/* loaded from: classes.dex */
public class po2 extends p06 {
    public dz6 a = null;

    @Override // defpackage.dz6
    public final Object b(o83 o83Var) {
        dz6 dz6Var = this.a;
        if (dz6Var != null) {
            return dz6Var.b(o83Var);
        }
        i.n("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        return null;
    }

    @Override // defpackage.dz6
    public final void c(b93 b93Var, Object obj) {
        dz6 dz6Var = this.a;
        if (dz6Var != null) {
            dz6Var.c(b93Var, obj);
        } else {
            i.n("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
    }

    @Override // defpackage.p06
    public final dz6 d() {
        dz6 dz6Var = this.a;
        if (dz6Var != null) {
            return dz6Var;
        }
        i.n("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        return null;
    }
}

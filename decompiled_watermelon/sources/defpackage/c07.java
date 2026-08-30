package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: c07  reason: default package */
/* loaded from: classes.dex */
public class c07 extends dz6 {
    @Override // defpackage.dz6
    public final Object b(o83 o83Var) {
        q83 n0 = o83Var.n0();
        if (n0 == q83.NULL) {
            o83Var.j0();
            return null;
        } else if (n0 == q83.STRING) {
            return Boolean.valueOf(Boolean.parseBoolean(o83Var.l0()));
        } else {
            return Boolean.valueOf(o83Var.Q());
        }
    }

    @Override // defpackage.dz6
    public final void c(b93 b93Var, Object obj) {
        b93Var.T((Boolean) obj);
    }
}

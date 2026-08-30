package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: d07  reason: default package */
/* loaded from: classes.dex */
public class d07 extends dz6 {
    @Override // defpackage.dz6
    public final Object b(o83 o83Var) {
        if (o83Var.n0() == q83.NULL) {
            o83Var.j0();
            return null;
        }
        return Boolean.valueOf(o83Var.l0());
    }

    @Override // defpackage.dz6
    public final void c(b93 b93Var, Object obj) {
        String bool;
        Boolean bool2 = (Boolean) obj;
        if (bool2 == null) {
            bool = "null";
        } else {
            bool = bool2.toString();
        }
        b93Var.Z(bool);
    }
}

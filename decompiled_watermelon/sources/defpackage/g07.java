package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: g07  reason: default package */
/* loaded from: classes.dex */
public class g07 extends dz6 {
    @Override // defpackage.dz6
    public final Object b(o83 o83Var) {
        if (o83Var.n0() == q83.NULL) {
            o83Var.j0();
            return null;
        }
        try {
            return Integer.valueOf(o83Var.T());
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.dz6
    public final void c(b93 b93Var, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            b93Var.F();
        } else {
            b93Var.R(number.intValue());
        }
    }
}

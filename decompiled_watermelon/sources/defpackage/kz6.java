package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kz6  reason: default package */
/* loaded from: classes.dex */
public class kz6 extends dz6 {
    @Override // defpackage.dz6
    public final Object b(o83 o83Var) {
        if (o83Var.n0() == q83.NULL) {
            o83Var.j0();
            return null;
        }
        String l0 = o83Var.l0();
        if (l0.length() == 1) {
            return Character.valueOf(l0.charAt(0));
        }
        StringBuilder u = b31.u("Expecting character, got: ", l0, "; at ");
        u.append(o83Var.I());
        throw new RuntimeException(u.toString());
    }

    @Override // defpackage.dz6
    public final void c(b93 b93Var, Object obj) {
        String valueOf;
        Character ch = (Character) obj;
        if (ch == null) {
            valueOf = null;
        } else {
            valueOf = String.valueOf(ch);
        }
        b93Var.Z(valueOf);
    }
}

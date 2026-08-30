package defpackage;

import java.math.BigInteger;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nz6  reason: default package */
/* loaded from: classes.dex */
public class nz6 extends dz6 {
    @Override // defpackage.dz6
    public final Object b(o83 o83Var) {
        if (o83Var.n0() == q83.NULL) {
            o83Var.j0();
            return null;
        }
        String l0 = o83Var.l0();
        try {
            hk2.f(l0);
            return new BigInteger(l0);
        } catch (NumberFormatException e) {
            StringBuilder u = b31.u("Failed parsing '", l0, "' as BigInteger; at path ");
            u.append(o83Var.I());
            throw new RuntimeException(u.toString(), e);
        }
    }

    @Override // defpackage.dz6
    public final void c(b93 b93Var, Object obj) {
        b93Var.V((BigInteger) obj);
    }
}

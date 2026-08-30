package defpackage;

import java.util.Objects;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cw0  reason: default package */
/* loaded from: classes.dex */
public interface cw0 {
    static void C(x14 x14Var, cw0 cw0Var, cw0 cw0Var2, uw uwVar) {
        if (Objects.equals(uwVar, jw2.w)) {
            mb5 mb5Var = (mb5) cw0Var2.d(uwVar, null);
            mb5 mb5Var2 = (mb5) cw0Var.d(uwVar, null);
            bw0 c = cw0Var2.c(uwVar);
            if (mb5Var == null) {
                mb5Var = mb5Var2;
            } else if (mb5Var2 != null) {
                sn1 sn1Var = mb5Var2.a;
                nb5 nb5Var = mb5Var2.b;
                sn1 sn1Var2 = mb5Var.a;
                if (sn1Var2 != null) {
                    sn1Var = sn1Var2;
                }
                nb5 nb5Var2 = mb5Var.b;
                if (nb5Var2 != null) {
                    nb5Var = nb5Var2;
                }
                mb5Var = new mb5(sn1Var, nb5Var);
            }
            x14Var.m(uwVar, c, mb5Var);
            return;
        }
        x14Var.m(uwVar, cw0Var2.c(uwVar), cw0Var2.g(uwVar));
    }

    static ef4 J(cw0 cw0Var, cw0 cw0Var2) {
        x14 f;
        if (cw0Var == null && cw0Var2 == null) {
            return ef4.L;
        }
        if (cw0Var2 != null) {
            f = x14.j(cw0Var2);
        } else {
            f = x14.f();
        }
        if (cw0Var != null) {
            for (uw uwVar : cw0Var.e()) {
                C(f, cw0Var2, cw0Var, uwVar);
            }
        }
        return ef4.b(f);
    }

    boolean a(uw uwVar);

    bw0 c(uw uwVar);

    Object d(uw uwVar, Object obj);

    Set e();

    Object g(uw uwVar);

    Set h(uw uwVar);

    Object i(uw uwVar, bw0 bw0Var);

    void k(hi0 hi0Var);
}

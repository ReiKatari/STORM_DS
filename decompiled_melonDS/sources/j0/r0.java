package j0;

import java.util.Objects;
import java.util.Set;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public interface r0 {
    static i1 m(r0 r0Var, r0 r0Var2) {
        g1 b10;
        if (r0Var == null && r0Var2 == null) {
            return i1.L;
        }
        if (r0Var2 != null) {
            b10 = g1.c(r0Var2);
        } else {
            b10 = g1.b();
        }
        if (r0Var != null) {
            for (g gVar : r0Var.f()) {
                w(b10, r0Var2, r0Var, gVar);
            }
        }
        return i1.a(b10);
    }

    static void w(g1 g1Var, r0 r0Var, r0 r0Var2, g gVar) {
        if (Objects.equals(gVar, b1.f7161y)) {
            u0.b bVar = (u0.b) r0Var2.h(gVar, null);
            u0.b bVar2 = (u0.b) r0Var.h(gVar, null);
            q0 d4 = r0Var2.d(gVar);
            if (bVar == null) {
                bVar = bVar2;
            } else if (bVar2 != null) {
                u0.a aVar = bVar2.f13269a;
                u0.c cVar = bVar2.f13270b;
                u0.a aVar2 = bVar.f13269a;
                if (aVar2 != null) {
                    aVar = aVar2;
                }
                u0.c cVar2 = bVar.f13270b;
                if (cVar2 != null) {
                    cVar = cVar2;
                }
                bVar = new u0.b(aVar, cVar);
            }
            g1Var.j(gVar, d4, bVar);
            return;
        }
        g1Var.j(gVar, r0Var2.d(gVar), r0Var2.g(gVar));
    }

    q0 d(g gVar);

    boolean e(g gVar);

    Set f();

    Object g(g gVar);

    Object h(g gVar, Object obj);

    void i(bi.h hVar);

    Set k(g gVar);

    Object l(g gVar, q0 q0Var);
}

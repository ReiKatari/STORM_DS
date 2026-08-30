package j0;

import java.util.Set;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public interface p1 extends r0 {
    @Override // j0.r0
    default q0 d(g gVar) {
        return x().d(gVar);
    }

    @Override // j0.r0
    default boolean e(g gVar) {
        return x().e(gVar);
    }

    @Override // j0.r0
    default Set f() {
        return x().f();
    }

    @Override // j0.r0
    default Object g(g gVar) {
        return x().g(gVar);
    }

    @Override // j0.r0
    default Object h(g gVar, Object obj) {
        return x().h(gVar, obj);
    }

    @Override // j0.r0
    default void i(bi.h hVar) {
        x().i(hVar);
    }

    @Override // j0.r0
    default Set k(g gVar) {
        return x().k(gVar);
    }

    @Override // j0.r0
    default Object l(g gVar, q0 q0Var) {
        return x().l(gVar, q0Var);
    }

    r0 x();
}

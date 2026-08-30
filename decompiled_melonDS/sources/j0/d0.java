package j0;

import java.util.ArrayList;
import java.util.Collection;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public interface d0 extends d0.l, d0.u1 {
    ta.a a();

    @Override // d0.l
    default b0 b() {
        return k();
    }

    void e(Collection collection);

    default boolean f() {
        if (b().c() == 0) {
            return true;
        }
        return false;
    }

    void g(ArrayList arrayList);

    default boolean i() {
        return true;
    }

    b0 k();

    a0 o();

    default v p() {
        return y.f7326a;
    }

    default void h() {
    }

    default void c(boolean z10) {
    }

    default void j(boolean z10) {
    }

    default void m(v vVar) {
    }
}

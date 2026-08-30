package ij;

import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Stream;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final w f7140a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f7141b;

    public x(w wVar, final Object obj) {
        this.f7140a = wVar;
        this.f7141b = obj;
        if (obj != null && !Stream.of((Object[]) ((d) k.f7096a.get(wVar)).f7088a).anyMatch(new Predicate() { // from class: ij.c
            @Override // java.util.function.Predicate
            public final boolean test(Object obj2) {
                return ((Class) obj2).isInstance(obj);
            }
        })) {
            StringBuilder sb2 = new StringBuilder("The ");
            sb2.append(wVar);
            fj.j.k(sb2, " method doesn't support options of type ", obj.getClass());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x.class == obj.getClass()) {
            x xVar = (x) obj;
            if (Objects.equals(this.f7140a, xVar.f7140a) && Objects.equals(this.f7141b, xVar.f7141b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        w wVar = this.f7140a;
        if (wVar == null) {
            return 0;
        }
        return wVar.hashCode();
    }
}

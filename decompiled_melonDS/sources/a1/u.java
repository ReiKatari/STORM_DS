package a1;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u implements Map, oc.a {
    public final m0 A;
    public h B;
    public h L;
    public a1 R;

    public u(m0 m0Var) {
        m0Var.getClass();
        this.A = m0Var;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.A.c(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.A.d(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        h hVar = this.B;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this.A, 0);
        this.B = hVar2;
        return hVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u.class == obj.getClass()) {
            return nc.k.a(this.A, ((u) obj).A);
        }
        return false;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.A.g(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.A.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.A.i();
    }

    @Override // java.util.Map
    public final Set keySet() {
        h hVar = this.L;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this.A, 1);
        this.L = hVar2;
        return hVar2;
    }

    @Override // java.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.A.f71e;
    }

    public final String toString() {
        return this.A.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        a1 a1Var = this.R;
        if (a1Var != null) {
            return a1Var;
        }
        a1 a1Var2 = new a1(this.A);
        this.R = a1Var2;
        return a1Var2;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

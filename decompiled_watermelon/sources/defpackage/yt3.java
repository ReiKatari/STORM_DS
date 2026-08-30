package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yt3  reason: default package */
/* loaded from: classes.dex */
public final class yt3 implements Map, f93 {
    public final d24 A;
    public b12 B;
    public b12 L;
    public ai6 R;

    public yt3(d24 d24Var) {
        d24Var.getClass();
        this.A = d24Var;
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
        b12 b12Var = this.B;
        if (b12Var != null) {
            return b12Var;
        }
        b12 b12Var2 = new b12(this.A, 0);
        this.B = b12Var2;
        return b12Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yt3.class == obj.getClass()) {
            return b53.x(this.A, ((yt3) obj).A);
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
        b12 b12Var = this.L;
        if (b12Var != null) {
            return b12Var;
        }
        b12 b12Var2 = new b12(this.A, 1);
        this.L = b12Var2;
        return b12Var2;
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
        return this.A.e;
    }

    public final String toString() {
        return this.A.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        ai6 ai6Var = this.R;
        if (ai6Var != null) {
            return ai6Var;
        }
        ai6 ai6Var2 = new ai6(this.A);
        this.R = ai6Var2;
        return ai6Var2;
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

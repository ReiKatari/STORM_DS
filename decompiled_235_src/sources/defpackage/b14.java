package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b14  reason: default package */
/* loaded from: classes.dex */
public final class b14 implements Map, zf3 {
    public final ja4 A;
    public q52 B;
    public q52 L;
    public rt6 R;

    public b14(ja4 ja4Var) {
        ja4Var.getClass();
        this.A = ja4Var;
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
        q52 q52Var = this.B;
        if (q52Var != null) {
            return q52Var;
        }
        q52 q52Var2 = new q52(this.A, 0);
        this.B = q52Var2;
        return q52Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b14.class == obj.getClass()) {
            return nb3.k(this.A, ((b14) obj).A);
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
        q52 q52Var = this.L;
        if (q52Var != null) {
            return q52Var;
        }
        q52 q52Var2 = new q52(this.A, 1);
        this.L = q52Var2;
        return q52Var2;
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
        rt6 rt6Var = this.R;
        if (rt6Var != null) {
            return rt6Var;
        }
        rt6 rt6Var2 = new rt6(this.A);
        this.R = rt6Var2;
        return rt6Var2;
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

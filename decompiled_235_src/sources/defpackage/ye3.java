package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@cc6(with = bf3.class)
/* renamed from: ye3  reason: default package */
/* loaded from: classes.dex */
public final class ye3 extends de3 implements Map<String, de3>, zf3 {
    public static final xe3 Companion = new Object();
    public final Map A;

    public ye3(Map map) {
        map.getClass();
        this.A = map;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ de3 compute(String str, BiFunction<? super String, ? super de3, ? extends de3> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ de3 computeIfAbsent(String str, Function<? super String, ? extends de3> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ de3 computeIfPresent(String str, BiFunction<? super String, ? super de3, ? extends de3> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.A.containsKey((String) obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof de3)) {
            return false;
        }
        return this.A.containsValue((de3) obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, de3>> entrySet() {
        return this.A.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return nb3.k(this.A, obj);
    }

    @Override // java.util.Map
    public final de3 get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return (de3) this.A.get((String) obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.A.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.A.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.A.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ de3 merge(String str, de3 de3Var, BiFunction<? super de3, ? super de3, ? extends de3> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ de3 put(String str, de3 de3Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends de3> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ de3 putIfAbsent(String str, de3 de3Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final de3 remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ de3 replace(String str, de3 de3Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super de3, ? extends de3> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.A.size();
    }

    public final String toString() {
        return gt0.P0(this.A.entrySet(), ",", "{", "}", new v83(5), 24);
    }

    @Override // java.util.Map
    public final Collection<de3> values() {
        return this.A.values();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, de3 de3Var, de3 de3Var2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

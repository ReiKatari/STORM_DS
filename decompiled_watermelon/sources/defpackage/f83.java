package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@n06(with = i83.class)
/* renamed from: f83  reason: default package */
/* loaded from: classes.dex */
public final class f83 extends k73 implements Map<String, k73>, f93 {
    public static final e83 Companion = new Object();
    public final Map A;

    public f83(Map map) {
        map.getClass();
        this.A = map;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ k73 compute(String str, BiFunction<? super String, ? super k73, ? extends k73> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ k73 computeIfAbsent(String str, Function<? super String, ? extends k73> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ k73 computeIfPresent(String str, BiFunction<? super String, ? super k73, ? extends k73> biFunction) {
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
        if (!(obj instanceof k73)) {
            return false;
        }
        return this.A.containsValue((k73) obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, k73>> entrySet() {
        return this.A.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return b53.x(this.A, obj);
    }

    @Override // java.util.Map
    public final k73 get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return (k73) this.A.get((String) obj);
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
    public final /* bridge */ /* synthetic */ k73 merge(String str, k73 k73Var, BiFunction<? super k73, ? super k73, ? extends k73> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ k73 put(String str, k73 k73Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends k73> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ k73 putIfAbsent(String str, k73 k73Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final k73 remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ k73 replace(String str, k73 k73Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super k73, ? extends k73> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.A.size();
    }

    public final String toString() {
        return tq0.S0(this.A.entrySet(), ",", "{", "}", new qu1(23), 24);
    }

    @Override // java.util.Map
    public final Collection<k73> values() {
        return this.A.values();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, k73 k73Var, k73 k73Var2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

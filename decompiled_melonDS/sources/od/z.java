package od;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
@jd.g(with = b0.class)
/* loaded from: classes.dex */
public final class z extends l implements Map<String, l>, oc.a {
    public static final y Companion = new Object();
    public final Map A;

    public z(Map map) {
        map.getClass();
        this.A = map;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ l compute(String str, BiFunction<? super String, ? super l, ? extends l> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ l computeIfAbsent(String str, Function<? super String, ? extends l> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ l computeIfPresent(String str, BiFunction<? super String, ? super l, ? extends l> biFunction) {
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
        if (!(obj instanceof l)) {
            return false;
        }
        return this.A.containsValue((l) obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, l>> entrySet() {
        return this.A.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return nc.k.a(this.A, obj);
    }

    @Override // java.util.Map
    public final l get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return (l) this.A.get((String) obj);
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
    public final /* bridge */ /* synthetic */ l merge(String str, l lVar, BiFunction<? super l, ? super l, ? extends l> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ l put(String str, l lVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends l> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ l putIfAbsent(String str, l lVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final l remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ l replace(String str, l lVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super l, ? extends l> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.A.size();
    }

    public final String toString() {
        return zb.l.Y(this.A.entrySet(), ",", "{", "}", new x(0), 24);
    }

    @Override // java.util.Map
    public final Collection<l> values() {
        return this.A.values();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, l lVar, l lVar2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

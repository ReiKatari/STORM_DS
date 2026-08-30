package s2;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class b implements Map, oc.a {
    public static final b L = new b(k.f12817e, 0);
    public final k A;
    public final int B;

    public b(k kVar, int i2) {
        this.A = kVar;
        this.B = i2;
    }

    public d a() {
        return new d(this);
    }

    public /* bridge */ d b() {
        return a();
    }

    public final b c(Object obj, t2.a aVar) {
        int i2;
        if (obj != null) {
            i2 = obj.hashCode();
        } else {
            i2 = 0;
        }
        bk.a u4 = this.A.u(obj, i2, aVar, 0);
        if (u4 == null) {
            return this;
        }
        return new b((k) u4.L, this.B + u4.B);
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        int i2;
        if (obj != null) {
            i2 = obj.hashCode();
        } else {
            i2 = 0;
        }
        return this.A.d(i2, 0, obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set<Map.Entry> entrySet = entrySet();
        if (entrySet.isEmpty()) {
            return false;
        }
        for (Map.Entry entry : entrySet) {
            if (nc.k.a(entry.getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return new h(this, 0);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this.B != map.size()) {
            return false;
        }
        Set<Map.Entry> entrySet = map.entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : entrySet) {
            if (entry != null) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = get(key);
                if (nc.k.a(value, obj2) && (obj2 != null || containsKey(key))) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        int i2;
        if (obj != null) {
            i2 = obj.hashCode();
        } else {
            i2 = 0;
        }
        return this.A.g(i2, 0, obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (this.B == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return new h(this, 1);
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
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.B;
    }

    public final String toString() {
        return zb.l.Y(entrySet(), ", ", "{", "}", new zb.a(1, this), 24);
    }

    @Override // java.util.Map
    public final Collection values() {
        return new j(0, this);
    }
}

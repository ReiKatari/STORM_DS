package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tm4  reason: default package */
/* loaded from: classes.dex */
public class tm4 implements Map, f93 {
    public static final tm4 L = new tm4(fy6.e, 0);
    public final fy6 A;
    public final int B;

    public tm4(fy6 fy6Var, int i) {
        this.A = fy6Var;
        this.B = i;
    }

    public vm4 a() {
        return new vm4(this);
    }

    public /* bridge */ vm4 b() {
        return a();
    }

    public final tm4 c(Object obj, cp3 cp3Var) {
        int i;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        sb u = this.A.u(i, 0, obj, cp3Var);
        if (u == null) {
            return this;
        }
        return new tm4((fy6) u.L, this.B + u.B);
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        int i;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return this.A.d(i, 0, obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set<Map.Entry> entrySet = entrySet();
        if (entrySet.isEmpty()) {
            return false;
        }
        for (Map.Entry entry : entrySet) {
            if (b53.x(entry.getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return new an4(this, 0);
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
                if (b53.x(value, obj2) && (obj2 != null || containsKey(key))) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        int i;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return this.A.g(i, 0, obj);
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
        return new an4(this, 1);
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
        return tq0.S0(entrySet(), ", ", "{", "}", new j0(1, this), 24);
    }

    @Override // java.util.Map
    public final Collection values() {
        return new ju3(1, this);
    }
}

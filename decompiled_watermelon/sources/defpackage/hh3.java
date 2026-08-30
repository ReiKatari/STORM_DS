package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hh3  reason: default package */
/* loaded from: classes.dex */
public final class hh3 implements Map {
    public final Map A;

    public hh3(Map map) {
        this.A = map;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj instanceof Class) {
            return this.A.containsKey(((Class) obj).getName());
        }
        i.i("Key must be a class");
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.A.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of entrySet(). Consider @ClassKey instead.");
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj instanceof Class) {
            return this.A.get(((Class) obj).getName());
        }
        i.i("Key must be a class");
        return null;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.A.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of keySet(). Consider @ClassKey instead.");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        Class cls = (Class) obj;
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final int size() {
        return this.A.size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.A.values();
    }
}

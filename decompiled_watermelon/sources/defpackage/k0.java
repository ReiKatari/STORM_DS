package defpackage;

import java.util.Collection;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: k0  reason: default package */
/* loaded from: classes.dex */
public abstract class k0 implements Collection, f93 {
    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public abstract int b();

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        for (Object obj2 : this) {
            if (b53.x(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public boolean containsAll(Collection collection) {
        collection.getClass();
        Collection<Object> collection2 = collection;
        if (!collection2.isEmpty()) {
            for (Object obj : collection2) {
                if (!contains(obj)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        if (b() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return b();
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return b53.i0(this, objArr);
    }

    public final String toString() {
        return tq0.S0(this, ", ", "[", "]", new j0(0, this), 24);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return b53.h0(this);
    }
}

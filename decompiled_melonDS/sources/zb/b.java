package zb;

import java.util.Collection;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class b implements Collection, oc.a {
    public abstract int a();

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        for (Object obj2 : this) {
            if (nc.k.a(obj2, obj)) {
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
        if (a() == 0) {
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
        return a();
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return nc.j.b(this, objArr);
    }

    public final String toString() {
        return l.Y(this, ", ", "[", "]", new a(0, this), 24);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return nc.j.a(this);
    }
}

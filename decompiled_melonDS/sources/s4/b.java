package s4;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import nc.j;
import zb.q;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b implements Collection, oc.a {
    public static final b L = new b(q.A);
    public final Object A;
    public final int B;

    public b(List list) {
        this.A = list;
        this.B = list.size();
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
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

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return this.A.contains((a) obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.A.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                if (!this.A.equals(((b) obj).A)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.A.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.A.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.A.iterator();
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
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.B;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return j.a(this);
    }

    public final String toString() {
        return "LocaleList(localeList=" + this.A + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return j.b(this, objArr);
    }
}

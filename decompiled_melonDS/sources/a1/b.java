package a1;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b implements Set {
    public final /* synthetic */ e A;

    public b(e eVar) {
        this.A = eVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.A.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.A.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.A.j(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        e eVar = this.A;
        if (this != obj) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                try {
                    if (eVar.L == set.size()) {
                        if (eVar.j(set)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int hashCode;
        e eVar = this.A;
        int i2 = 0;
        for (int i10 = eVar.L - 1; i10 >= 0; i10--) {
            Object f8 = eVar.f(i10);
            if (f8 == null) {
                hashCode = 0;
            } else {
                hashCode = f8.hashCode();
            }
            i2 += hashCode;
        }
        return i2;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.A.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new a(this.A, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        e eVar = this.A;
        int d4 = eVar.d(obj);
        if (d4 >= 0) {
            eVar.g(d4);
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.A.k(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.A.l(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.A.L;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        e eVar = this.A;
        int i2 = eVar.L;
        if (objArr.length < i2) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i2);
        }
        for (int i10 = 0; i10 < i2; i10++) {
            objArr[i10] = eVar.f(i10);
        }
        if (objArr.length > i2) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        e eVar = this.A;
        int i2 = eVar.L;
        Object[] objArr = new Object[i2];
        for (int i10 = 0; i10 < i2; i10++) {
            objArr[i10] = eVar.f(i10);
        }
        return objArr;
    }
}

package a4;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s implements List, oc.a {
    public final int A;
    public final int B;
    public final /* synthetic */ t L;

    public s(t tVar, int i2, int i10) {
        this.L = tVar;
        this.A = i2;
        this.B = i10;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i2, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof b3.o) || indexOf((b3.o) obj) == -1) {
            return false;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((b3.o) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        Object f8 = this.L.A.f(i2 + this.A);
        f8.getClass();
        return (b3.o) f8;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof b3.o) {
            b3.o oVar = (b3.o) obj;
            int i2 = this.A;
            int i10 = this.B;
            if (i2 <= i10) {
                int i11 = i2;
                while (!nc.k.a(this.L.A.f(i11), oVar)) {
                    if (i11 != i10) {
                        i11++;
                    } else {
                        return -1;
                    }
                }
                return i11 - i2;
            }
            return -1;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i2 = this.A;
        return new r(this.L, i2, i2, this.B);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof b3.o) {
            b3.o oVar = (b3.o) obj;
            int i2 = this.B;
            int i10 = this.A;
            if (i10 <= i2) {
                while (!nc.k.a(this.L.A.f(i2), oVar)) {
                    if (i2 != i10) {
                        i2--;
                    } else {
                        return -1;
                    }
                }
                return i2 - i10;
            }
            return -1;
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i2) {
        int i10 = this.A;
        int i11 = this.B;
        return new r(this.L, i2 + i10, i10, i11);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.B - this.A;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i2, int i10) {
        int i11 = this.A;
        return new s(this.L, i2 + i11, i11 + i10);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return nc.j.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return nc.j.b(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        int i2 = this.A;
        return new r(this.L, i2, i2, this.B);
    }
}

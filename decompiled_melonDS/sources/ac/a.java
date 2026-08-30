package ac;

import a4.r;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import nc.k;
import p7.o;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends zb.f implements RandomAccess, Serializable {
    public Object[] A;
    public final int B;
    public int L;
    public final a R;
    public final b X;

    public a(Object[] objArr, int i2, int i10, a aVar, b bVar) {
        int i11;
        objArr.getClass();
        bVar.getClass();
        this.A = objArr;
        this.B = i2;
        this.L = i10;
        this.R = aVar;
        this.X = bVar;
        i11 = ((AbstractList) bVar).modCount;
        ((AbstractList) this).modCount = i11;
    }

    @Override // zb.f
    public final int a() {
        f();
        return this.L;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        g();
        f();
        int i10 = this.L;
        if (i2 >= 0 && i2 <= i10) {
            e(this.B + i2, obj);
        } else {
            wa.b.f(kc.a.d(i2, i10, "index: ", ", size: "));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection collection) {
        collection.getClass();
        g();
        f();
        int i10 = this.L;
        if (i2 >= 0 && i2 <= i10) {
            int size = collection.size();
            d(this.B + i2, collection, size);
            if (size > 0) {
                return true;
            }
            return false;
        }
        wa.b.f(kc.a.d(i2, i10, "index: ", ", size: "));
        return false;
    }

    @Override // zb.f
    public final Object b(int i2) {
        g();
        f();
        int i10 = this.L;
        if (i2 >= 0 && i2 < i10) {
            return h(this.B + i2);
        }
        wa.b.f(kc.a.d(i2, i10, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        f();
        i(this.B, this.L);
    }

    public final void d(int i2, Collection collection, int i10) {
        ((AbstractList) this).modCount++;
        b bVar = this.X;
        a aVar = this.R;
        if (aVar != null) {
            aVar.d(i2, collection, i10);
        } else {
            b bVar2 = b.R;
            bVar.d(i2, collection, i10);
        }
        this.A = bVar.A;
        this.L += i10;
    }

    public final void e(int i2, Object obj) {
        ((AbstractList) this).modCount++;
        b bVar = this.X;
        a aVar = this.R;
        if (aVar != null) {
            aVar.e(i2, obj);
        } else {
            b bVar2 = b.R;
            bVar.e(i2, obj);
        }
        this.A = bVar.A;
        this.L++;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        f();
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                Object[] objArr = this.A;
                int i2 = this.L;
                if (i2 == list.size()) {
                    for (int i10 = 0; i10 < i2; i10++) {
                        if (k.a(objArr[this.B + i10], list.get(i10))) {
                        }
                    }
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final void f() {
        int i2;
        i2 = ((AbstractList) this.X).modCount;
        if (i2 == ((AbstractList) this).modCount) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public final void g() {
        if (!this.X.L) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        f();
        int i10 = this.L;
        if (i2 >= 0 && i2 < i10) {
            return this.A[this.B + i2];
        }
        wa.b.f(kc.a.d(i2, i10, "index: ", ", size: "));
        return null;
    }

    public final Object h(int i2) {
        Object h2;
        ((AbstractList) this).modCount++;
        a aVar = this.R;
        if (aVar != null) {
            h2 = aVar.h(i2);
        } else {
            b bVar = b.R;
            h2 = this.X.h(i2);
        }
        this.L--;
        return h2;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2;
        f();
        Object[] objArr = this.A;
        int i10 = this.L;
        int i11 = 1;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[this.B + i12];
            int i13 = i11 * 31;
            if (obj != null) {
                i2 = obj.hashCode();
            } else {
                i2 = 0;
            }
            i11 = i13 + i2;
        }
        return i11;
    }

    public final void i(int i2, int i10) {
        if (i10 > 0) {
            ((AbstractList) this).modCount++;
        }
        a aVar = this.R;
        if (aVar != null) {
            aVar.i(i2, i10);
        } else {
            b bVar = b.R;
            this.X.i(i2, i10);
        }
        this.L -= i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        f();
        for (int i2 = 0; i2 < this.L; i2++) {
            if (k.a(this.A[this.B + i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        f();
        if (this.L == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final int j(int i2, int i10, Collection collection, boolean z10) {
        int j2;
        a aVar = this.R;
        if (aVar != null) {
            j2 = aVar.j(i2, i10, collection, z10);
        } else {
            b bVar = b.R;
            j2 = this.X.j(i2, i10, collection, z10);
        }
        if (j2 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.L -= j2;
        return j2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        f();
        for (int i2 = this.L - 1; i2 >= 0; i2--) {
            if (k.a(this.A[this.B + i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i2) {
        f();
        int i10 = this.L;
        if (i2 >= 0 && i2 <= i10) {
            return new r(this, i2);
        }
        wa.b.f(kc.a.d(i2, i10, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        g();
        f();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            b(indexOf);
        }
        if (indexOf >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        g();
        f();
        if (j(this.B, this.L, collection, false) <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        g();
        f();
        if (j(this.B, this.L, collection, true) > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        g();
        f();
        int i10 = this.L;
        if (i2 >= 0 && i2 < i10) {
            Object[] objArr = this.A;
            int i11 = this.B;
            Object obj2 = objArr[i11 + i2];
            objArr[i11 + i2] = obj;
            return obj2;
        }
        wa.b.f(kc.a.d(i2, i10, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i2, int i10) {
        o.d(i2, i10, this.L);
        return new a(this.A, this.B + i2, i10 - i2, this, this.X);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        f();
        int length = objArr.length;
        int i2 = this.L;
        Object[] objArr2 = this.A;
        int i10 = this.B;
        if (length < i2) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, i10, i2 + i10, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        zb.k.i(objArr2, objArr, 0, i10, i2 + i10);
        int i11 = this.L;
        if (i11 < objArr.length) {
            objArr[i11] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        f();
        return q8.r.f(this.A, this.B, this.L, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        f();
        e(this.B + this.L, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        f();
        Object[] objArr = this.A;
        int i2 = this.L;
        int i10 = this.B;
        return zb.k.n(objArr, i10, i2 + i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        g();
        f();
        int size = collection.size();
        d(this.B + this.L, collection, size);
        return size > 0;
    }
}

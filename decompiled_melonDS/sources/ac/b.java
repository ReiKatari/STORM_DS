package ac;

import a0.j;
import androidx.preference.Preference;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import nc.k;
import p7.o;
import q8.r;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends zb.f implements RandomAccess, Serializable {
    public static final b R;
    public Object[] A;
    public int B;
    public boolean L;

    static {
        b bVar = new b(0);
        bVar.L = true;
        R = bVar;
    }

    public b(int i2) {
        if (i2 >= 0) {
            this.A = new Object[i2];
        } else {
            j.h("capacity must be non-negative.");
            throw null;
        }
    }

    @Override // zb.f
    public final int a() {
        return this.B;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        f();
        int i10 = this.B;
        if (i2 >= 0 && i2 <= i10) {
            ((AbstractList) this).modCount++;
            g(i2, 1);
            this.A[i2] = obj;
            return;
        }
        wa.b.f(kc.a.d(i2, i10, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection collection) {
        collection.getClass();
        f();
        int i10 = this.B;
        if (i2 >= 0 && i2 <= i10) {
            int size = collection.size();
            d(i2, collection, size);
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
        f();
        int i10 = this.B;
        if (i2 >= 0 && i2 < i10) {
            return h(i2);
        }
        wa.b.f(kc.a.d(i2, i10, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        f();
        i(0, this.B);
    }

    public final void d(int i2, Collection collection, int i10) {
        ((AbstractList) this).modCount++;
        g(i2, i10);
        Iterator it = collection.iterator();
        for (int i11 = 0; i11 < i10; i11++) {
            this.A[i2 + i11] = it.next();
        }
    }

    public final void e(int i2, Object obj) {
        ((AbstractList) this).modCount++;
        g(i2, 1);
        this.A[i2] = obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                Object[] objArr = this.A;
                int i2 = this.B;
                if (i2 == list.size()) {
                    for (int i10 = 0; i10 < i2; i10++) {
                        if (k.a(objArr[i10], list.get(i10))) {
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
        if (!this.L) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void g(int i2, int i10) {
        int i11 = this.B + i10;
        if (i11 >= 0) {
            Object[] objArr = this.A;
            if (i11 > objArr.length) {
                int length = objArr.length;
                int i12 = length + (length >> 1);
                if (i12 - i11 < 0) {
                    i12 = i11;
                }
                if (i12 - 2147483639 > 0) {
                    if (i11 > 2147483639) {
                        i12 = Preference.DEFAULT_ORDER;
                    } else {
                        i12 = 2147483639;
                    }
                }
                this.A = Arrays.copyOf(objArr, i12);
            }
            Object[] objArr2 = this.A;
            zb.k.i(objArr2, objArr2, i2 + i10, i2, this.B);
            this.B += i10;
            return;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        int i10 = this.B;
        if (i2 >= 0 && i2 < i10) {
            return this.A[i2];
        }
        wa.b.f(kc.a.d(i2, i10, "index: ", ", size: "));
        return null;
    }

    public final Object h(int i2) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.A;
        Object obj = objArr[i2];
        zb.k.i(objArr, objArr, i2, i2 + 1, this.B);
        Object[] objArr2 = this.A;
        objArr2.getClass();
        objArr2[this.B - 1] = null;
        this.B--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2;
        Object[] objArr = this.A;
        int i10 = this.B;
        int i11 = 1;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
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
        Object[] objArr = this.A;
        zb.k.i(objArr, objArr, i2, i2 + i10, this.B);
        Object[] objArr2 = this.A;
        int i11 = this.B;
        r.R(objArr2, i11 - i10, i11);
        this.B -= i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i2 = 0; i2 < this.B; i2++) {
            if (k.a(this.A[i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (this.B == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final int j(int i2, int i10, Collection collection, boolean z10) {
        Object[] objArr;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            objArr = this.A;
            if (i11 >= i10) {
                break;
            }
            int i13 = i2 + i11;
            if (collection.contains(objArr[i13]) == z10) {
                Object[] objArr2 = this.A;
                i11++;
                objArr2[i12 + i2] = objArr2[i13];
                i12++;
            } else {
                i11++;
            }
        }
        int i14 = i10 - i12;
        zb.k.i(objArr, objArr, i2 + i12, i10 + i2, this.B);
        Object[] objArr3 = this.A;
        int i15 = this.B;
        r.R(objArr3, i15 - i14, i15);
        if (i14 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.B -= i14;
        return i14;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i2 = this.B - 1; i2 >= 0; i2--) {
            if (k.a(this.A[i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i2) {
        int i10 = this.B;
        if (i2 >= 0 && i2 <= i10) {
            return new a4.r(this, i2);
        }
        wa.b.f(kc.a.d(i2, i10, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
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
        f();
        if (j(0, this.B, collection, false) <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        f();
        if (j(0, this.B, collection, true) <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        f();
        int i10 = this.B;
        if (i2 >= 0 && i2 < i10) {
            Object[] objArr = this.A;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
            return obj2;
        }
        wa.b.f(kc.a.d(i2, i10, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i2, int i10) {
        o.d(i2, i10, this.B);
        return new a(this.A, i2, i10 - i2, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i2 = this.B;
        Object[] objArr2 = this.A;
        if (length < i2) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, 0, i2, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        zb.k.i(objArr2, objArr, 0, 0, i2);
        int i10 = this.B;
        if (i10 < objArr.length) {
            objArr[i10] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return r.f(this.A, 0, this.B, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        f();
        int i2 = this.B;
        ((AbstractList) this).modCount++;
        g(i2, 1);
        this.A[i2] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return zb.k.n(this.A, 0, this.B);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        f();
        int size = collection.size();
        d(this.B, collection, size);
        return size > 0;
    }
}

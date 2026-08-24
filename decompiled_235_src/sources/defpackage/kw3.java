package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kw3  reason: default package */
/* loaded from: classes.dex */
public final class kw3 extends d1 implements RandomAccess, Serializable {
    public static final kw3 R;
    public Object[] A;
    public int B;
    public boolean L;

    static {
        kw3 kw3Var = new kw3(0);
        kw3Var.L = true;
        R = kw3Var;
    }

    public kw3(int i) {
        if (i >= 0) {
            this.A = new Object[i];
        } else {
            i.h("capacity must be non-negative.");
            throw null;
        }
    }

    @Override // defpackage.d1
    public final int a() {
        return this.B;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        g();
        int i2 = this.B;
        if (i >= 0 && i <= i2) {
            ((AbstractList) this).modCount++;
            h(i, 1);
            this.A[i] = obj;
            return;
        }
        e41.q(lb1.j("index: ", i, i2, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        g();
        int i2 = this.B;
        if (i >= 0 && i <= i2) {
            int size = collection.size();
            d(i, collection, size);
            if (size <= 0) {
                return false;
            }
            return true;
        }
        e41.q(lb1.j("index: ", i, i2, ", size: "));
        return false;
    }

    @Override // defpackage.d1
    public final Object b(int i) {
        g();
        int i2 = this.B;
        if (i >= 0 && i < i2) {
            return i(i);
        }
        e41.q(lb1.j("index: ", i, i2, ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        j(0, this.B);
    }

    public final void d(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        h(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.A[i + i3] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                Object[] objArr = this.A;
                int i = this.B;
                if (i == list.size()) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (nb3.k(objArr[i2], list.get(i2))) {
                        }
                    }
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final void f(int i, Object obj) {
        ((AbstractList) this).modCount++;
        h(i, 1);
        this.A[i] = obj;
    }

    public final void g() {
        if (!this.L) {
            return;
        }
        e41.t();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.B;
        if (i >= 0 && i < i2) {
            return this.A[i];
        }
        e41.q(lb1.j("index: ", i, i2, ", size: "));
        return null;
    }

    public final void h(int i, int i2) {
        int i3 = this.B + i2;
        if (i3 >= 0) {
            Object[] objArr = this.A;
            if (i3 > objArr.length) {
                int length = objArr.length;
                int i4 = length + (length >> 1);
                if (i4 - i3 < 0) {
                    i4 = i3;
                }
                if (i4 - 2147483639 > 0) {
                    if (i3 > 2147483639) {
                        i4 = Integer.MAX_VALUE;
                    } else {
                        i4 = 2147483639;
                    }
                }
                this.A = Arrays.copyOf(objArr, i4);
            }
            Object[] objArr2 = this.A;
            fv.t0(objArr2, objArr2, i + i2, i, this.B);
            this.B += i2;
            return;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i;
        Object[] objArr = this.A;
        int i2 = this.B;
        int i3 = 1;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            int i5 = i3 * 31;
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i3 = i5 + i;
        }
        return i3;
    }

    public final Object i(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.A;
        Object obj = objArr[i];
        fv.t0(objArr, objArr, i, i + 1, this.B);
        Object[] objArr2 = this.A;
        objArr2.getClass();
        objArr2[this.B - 1] = null;
        this.B--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.B; i++) {
            if (nb3.k(this.A[i], obj)) {
                return i;
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

    public final void j(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.A;
        fv.t0(objArr, objArr, i, i + i2, this.B);
        Object[] objArr2 = this.A;
        int i3 = this.B;
        qo2.L(objArr2, i3 - i2, i3);
        this.B -= i2;
    }

    public final int l(int i, int i2, Collection collection, boolean z) {
        Object[] objArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            objArr = this.A;
            if (i3 >= i2) {
                break;
            }
            int i5 = i + i3;
            if (collection.contains(objArr[i5]) == z) {
                Object[] objArr2 = this.A;
                i3++;
                objArr2[i4 + i] = objArr2[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        fv.t0(objArr, objArr, i + i4, i2 + i, this.B);
        Object[] objArr3 = this.A;
        int i7 = this.B;
        qo2.L(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.B -= i6;
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.B - 1; i >= 0; i--) {
            if (nb3.k(this.A[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.B;
        if (i >= 0 && i <= i2) {
            return new xx2(this, i);
        }
        e41.q(lb1.j("index: ", i, i2, ", size: "));
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        g();
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
        if (l(0, this.B, collection, false) <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        g();
        if (l(0, this.B, collection, true) <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        g();
        int i2 = this.B;
        if (i >= 0 && i < i2) {
            Object[] objArr = this.A;
            Object obj2 = objArr[i];
            objArr[i] = obj;
            return obj2;
        }
        e41.q(lb1.j("index: ", i, i2, ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        hf.E(i, i2, this.B);
        return new jw3(this.A, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.B;
        Object[] objArr2 = this.A;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, 0, i, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        fv.t0(objArr2, objArr, 0, 0, i);
        int i2 = this.B;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return qo2.l(this.A, 0, this.B, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        int i = this.B;
        ((AbstractList) this).modCount++;
        h(i, 1);
        this.A[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return fv.y0(this.A, 0, this.B);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        g();
        int size = collection.size();
        d(this.B, collection, size);
        return size > 0;
    }
}

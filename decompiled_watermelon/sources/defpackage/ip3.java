package defpackage;

import androidx.preference.Preference;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ip3  reason: default package */
/* loaded from: classes.dex */
public final class ip3 extends c1 implements RandomAccess, Serializable {
    public static final ip3 R;
    public Object[] A;
    public int B;
    public boolean L;

    static {
        ip3 ip3Var = new ip3(0);
        ip3Var.L = true;
        R = ip3Var;
    }

    public ip3(int i) {
        if (i >= 0) {
            this.A = new Object[i];
        } else {
            i.i("capacity must be non-negative.");
            throw null;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        k();
        int i2 = this.B;
        if (i >= 0 && i <= i2) {
            ((AbstractList) this).modCount++;
            l(i, 1);
            this.A[i] = obj;
            return;
        }
        f81.q(wh1.f(i, i2, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        k();
        int i2 = this.B;
        if (i >= 0 && i <= i2) {
            int size = collection.size();
            i(i, collection, size);
            if (size <= 0) {
                return false;
            }
            return true;
        }
        f81.q(wh1.f(i, i2, "index: ", ", size: "));
        return false;
    }

    @Override // defpackage.c1
    public final int b() {
        return this.B;
    }

    @Override // defpackage.c1
    public final Object c(int i) {
        k();
        int i2 = this.B;
        if (i >= 0 && i < i2) {
            return m(i);
        }
        f81.q(wh1.f(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        k();
        n(0, this.B);
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
                        if (b53.x(objArr[i2], list.get(i2))) {
                        }
                    }
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.B;
        if (i >= 0 && i < i2) {
            return this.A[i];
        }
        f81.q(wh1.f(i, i2, "index: ", ", size: "));
        return null;
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

    public final void i(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        l(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.A[i + i3] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.B; i++) {
            if (b53.x(this.A[i], obj)) {
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

    public final void j(int i, Object obj) {
        ((AbstractList) this).modCount++;
        l(i, 1);
        this.A[i] = obj;
    }

    public final void k() {
        if (!this.L) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void l(int i, int i2) {
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
                        i4 = Preference.DEFAULT_ORDER;
                    } else {
                        i4 = 2147483639;
                    }
                }
                this.A = Arrays.copyOf(objArr, i4);
            }
            Object[] objArr2 = this.A;
            nu.f0(objArr2, objArr2, i + i2, i, this.B);
            this.B += i2;
            return;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.B - 1; i >= 0; i--) {
            if (b53.x(this.A[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.B;
        if (i >= 0 && i <= i2) {
            return new wr2(this, i);
        }
        f81.q(wh1.f(i, i2, "index: ", ", size: "));
        return null;
    }

    public final Object m(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.A;
        Object obj = objArr[i];
        nu.f0(objArr, objArr, i, i + 1, this.B);
        Object[] objArr2 = this.A;
        objArr2.getClass();
        objArr2[this.B - 1] = null;
        this.B--;
        return obj;
    }

    public final void n(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.A;
        nu.f0(objArr, objArr, i, i + i2, this.B);
        Object[] objArr2 = this.A;
        int i3 = this.B;
        nl2.S(objArr2, i3 - i2, i3);
        this.B -= i2;
    }

    public final int o(int i, int i2, Collection collection, boolean z) {
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
        nu.f0(objArr, objArr, i + i4, i2 + i, this.B);
        Object[] objArr3 = this.A;
        int i7 = this.B;
        nl2.S(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.B -= i6;
        return i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        k();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            c(indexOf);
        }
        if (indexOf >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        k();
        if (o(0, this.B, collection, false) <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        k();
        if (o(0, this.B, collection, true) <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        k();
        int i2 = this.B;
        if (i >= 0 && i < i2) {
            Object[] objArr = this.A;
            Object obj2 = objArr[i];
            objArr[i] = obj;
            return obj2;
        }
        f81.q(wh1.f(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        f34.w(i, i2, this.B);
        return new hp3(this.A, i, i2 - i, null, this);
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
        nu.f0(objArr2, objArr, 0, 0, i);
        int i2 = this.B;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return nl2.q(this.A, 0, this.B, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        k();
        int i = this.B;
        ((AbstractList) this).modCount++;
        l(i, 1);
        this.A[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return nu.k0(this.A, 0, this.B);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        k();
        int size = collection.size();
        i(this.B, collection, size);
        return size > 0;
    }
}

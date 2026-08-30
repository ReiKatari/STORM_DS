package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hp3 */
/* loaded from: classes.dex */
public final class hp3 extends c1 implements RandomAccess, Serializable {
    public Object[] A;
    public final int B;
    public int L;
    public final hp3 R;
    public final ip3 X;

    public hp3(Object[] objArr, int i, int i2, hp3 hp3Var, ip3 ip3Var) {
        int i3;
        objArr.getClass();
        ip3Var.getClass();
        this.A = objArr;
        this.B = i;
        this.L = i2;
        this.R = hp3Var;
        this.X = ip3Var;
        i3 = ((AbstractList) ip3Var).modCount;
        ((AbstractList) this).modCount = i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        l();
        k();
        int i2 = this.L;
        if (i >= 0 && i <= i2) {
            j(this.B + i, obj);
        } else {
            f81.q(wh1.f(i, i2, "index: ", ", size: "));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        l();
        k();
        int i2 = this.L;
        if (i >= 0 && i <= i2) {
            int size = collection.size();
            i(this.B + i, collection, size);
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
        k();
        return this.L;
    }

    @Override // defpackage.c1
    public final Object c(int i) {
        l();
        k();
        int i2 = this.L;
        if (i >= 0 && i < i2) {
            return m(this.B + i);
        }
        f81.q(wh1.f(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        l();
        k();
        n(this.B, this.L);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        k();
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                Object[] objArr = this.A;
                int i = this.L;
                if (i == list.size()) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (b53.x(objArr[this.B + i2], list.get(i2))) {
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
        k();
        int i2 = this.L;
        if (i >= 0 && i < i2) {
            return this.A[this.B + i];
        }
        f81.q(wh1.f(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i;
        k();
        Object[] objArr = this.A;
        int i2 = this.L;
        int i3 = 1;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[this.B + i4];
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
        ip3 ip3Var = this.X;
        hp3 hp3Var = this.R;
        if (hp3Var != null) {
            hp3Var.i(i, collection, i2);
        } else {
            ip3 ip3Var2 = ip3.R;
            ip3Var.i(i, collection, i2);
        }
        this.A = ip3Var.A;
        this.L += i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        k();
        for (int i = 0; i < this.L; i++) {
            if (b53.x(this.A[this.B + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        k();
        if (this.L == 0) {
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
        ip3 ip3Var = this.X;
        hp3 hp3Var = this.R;
        if (hp3Var != null) {
            hp3Var.j(i, obj);
        } else {
            ip3 ip3Var2 = ip3.R;
            ip3Var.j(i, obj);
        }
        this.A = ip3Var.A;
        this.L++;
    }

    public final void k() {
        int i;
        i = ((AbstractList) this.X).modCount;
        if (i == ((AbstractList) this).modCount) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public final void l() {
        if (!this.X.L) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        k();
        for (int i = this.L - 1; i >= 0; i--) {
            if (b53.x(this.A[this.B + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        k();
        int i2 = this.L;
        if (i >= 0 && i <= i2) {
            return new wr2(this, i);
        }
        f81.q(wh1.f(i, i2, "index: ", ", size: "));
        return null;
    }

    public final Object m(int i) {
        Object m;
        ((AbstractList) this).modCount++;
        hp3 hp3Var = this.R;
        if (hp3Var != null) {
            m = hp3Var.m(i);
        } else {
            ip3 ip3Var = ip3.R;
            m = this.X.m(i);
        }
        this.L--;
        return m;
    }

    public final void n(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        hp3 hp3Var = this.R;
        if (hp3Var != null) {
            hp3Var.n(i, i2);
        } else {
            ip3 ip3Var = ip3.R;
            this.X.n(i, i2);
        }
        this.L -= i2;
    }

    public final int o(int i, int i2, Collection collection, boolean z) {
        int o;
        hp3 hp3Var = this.R;
        if (hp3Var != null) {
            o = hp3Var.o(i, i2, collection, z);
        } else {
            ip3 ip3Var = ip3.R;
            o = this.X.o(i, i2, collection, z);
        }
        if (o > 0) {
            ((AbstractList) this).modCount++;
        }
        this.L -= o;
        return o;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        l();
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
        l();
        k();
        if (o(this.B, this.L, collection, false) <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        l();
        k();
        if (o(this.B, this.L, collection, true) > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        l();
        k();
        int i2 = this.L;
        if (i >= 0 && i < i2) {
            Object[] objArr = this.A;
            int i3 = this.B;
            Object obj2 = objArr[i3 + i];
            objArr[i3 + i] = obj;
            return obj2;
        }
        f81.q(wh1.f(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        f34.w(i, i2, this.L);
        return new hp3(this.A, this.B + i, i2 - i, this, this.X);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        k();
        int length = objArr.length;
        int i = this.L;
        Object[] objArr2 = this.A;
        int i2 = this.B;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        nu.f0(objArr2, objArr, 0, i2, i + i2);
        int i3 = this.L;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        k();
        return nl2.q(this.A, this.B, this.L, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        l();
        k();
        j(this.B + this.L, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        k();
        Object[] objArr = this.A;
        int i = this.L;
        int i2 = this.B;
        return nu.k0(objArr, i2, i + i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        l();
        k();
        int size = collection.size();
        i(this.B + this.L, collection, size);
        return size > 0;
    }
}

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
/* renamed from: jw3 */
/* loaded from: classes.dex */
public final class jw3 extends d1 implements RandomAccess, Serializable {
    public Object[] A;
    public final int B;
    public int L;
    public final jw3 R;
    public final kw3 X;

    public jw3(Object[] objArr, int i, int i2, jw3 jw3Var, kw3 kw3Var) {
        int i3;
        objArr.getClass();
        kw3Var.getClass();
        this.A = objArr;
        this.B = i;
        this.L = i2;
        this.R = jw3Var;
        this.X = kw3Var;
        i3 = ((AbstractList) kw3Var).modCount;
        ((AbstractList) this).modCount = i3;
    }

    @Override // defpackage.d1
    public final int a() {
        g();
        return this.L;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        h();
        g();
        int i2 = this.L;
        if (i >= 0 && i <= i2) {
            f(this.B + i, obj);
        } else {
            e41.q(lb1.j("index: ", i, i2, ", size: "));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        h();
        g();
        int i2 = this.L;
        if (i >= 0 && i <= i2) {
            int size = collection.size();
            d(this.B + i, collection, size);
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
        h();
        g();
        int i2 = this.L;
        if (i >= 0 && i < i2) {
            return i(this.B + i);
        }
        e41.q(lb1.j("index: ", i, i2, ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        h();
        g();
        j(this.B, this.L);
    }

    public final void d(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        kw3 kw3Var = this.X;
        jw3 jw3Var = this.R;
        if (jw3Var != null) {
            jw3Var.d(i, collection, i2);
        } else {
            kw3 kw3Var2 = kw3.R;
            kw3Var.d(i, collection, i2);
        }
        this.A = kw3Var.A;
        this.L += i2;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        g();
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                Object[] objArr = this.A;
                int i = this.L;
                if (i == list.size()) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (nb3.k(objArr[this.B + i2], list.get(i2))) {
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
        kw3 kw3Var = this.X;
        jw3 jw3Var = this.R;
        if (jw3Var != null) {
            jw3Var.f(i, obj);
        } else {
            kw3 kw3Var2 = kw3.R;
            kw3Var.f(i, obj);
        }
        this.A = kw3Var.A;
        this.L++;
    }

    public final void g() {
        int i;
        i = ((AbstractList) this.X).modCount;
        if (i == ((AbstractList) this).modCount) {
            return;
        }
        i.l();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        g();
        int i2 = this.L;
        if (i >= 0 && i < i2) {
            return this.A[this.B + i];
        }
        e41.q(lb1.j("index: ", i, i2, ", size: "));
        return null;
    }

    public final void h() {
        if (!this.X.L) {
            return;
        }
        e41.t();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i;
        g();
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

    public final Object i(int i) {
        Object i2;
        ((AbstractList) this).modCount++;
        jw3 jw3Var = this.R;
        if (jw3Var != null) {
            i2 = jw3Var.i(i);
        } else {
            kw3 kw3Var = kw3.R;
            i2 = this.X.i(i);
        }
        this.L--;
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        g();
        for (int i = 0; i < this.L; i++) {
            if (nb3.k(this.A[this.B + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        g();
        if (this.L == 0) {
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
        jw3 jw3Var = this.R;
        if (jw3Var != null) {
            jw3Var.j(i, i2);
        } else {
            kw3 kw3Var = kw3.R;
            this.X.j(i, i2);
        }
        this.L -= i2;
    }

    public final int l(int i, int i2, Collection collection, boolean z) {
        int l;
        jw3 jw3Var = this.R;
        if (jw3Var != null) {
            l = jw3Var.l(i, i2, collection, z);
        } else {
            kw3 kw3Var = kw3.R;
            l = this.X.l(i, i2, collection, z);
        }
        if (l > 0) {
            ((AbstractList) this).modCount++;
        }
        this.L -= l;
        return l;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        g();
        for (int i = this.L - 1; i >= 0; i--) {
            if (nb3.k(this.A[this.B + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        g();
        int i2 = this.L;
        if (i >= 0 && i <= i2) {
            return new xx2(this, i);
        }
        e41.q(lb1.j("index: ", i, i2, ", size: "));
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        h();
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
        h();
        g();
        if (l(this.B, this.L, collection, false) <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        h();
        g();
        if (l(this.B, this.L, collection, true) > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        h();
        g();
        int i2 = this.L;
        if (i >= 0 && i < i2) {
            Object[] objArr = this.A;
            int i3 = this.B;
            Object obj2 = objArr[i3 + i];
            objArr[i3 + i] = obj;
            return obj2;
        }
        e41.q(lb1.j("index: ", i, i2, ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        hf.E(i, i2, this.L);
        return new jw3(this.A, this.B + i, i2 - i, this, this.X);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        g();
        int length = objArr.length;
        int i = this.L;
        Object[] objArr2 = this.A;
        int i2 = this.B;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        fv.t0(objArr2, objArr, 0, i2, i + i2);
        int i3 = this.L;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        g();
        return qo2.l(this.A, this.B, this.L, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        h();
        g();
        f(this.B + this.L, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        g();
        Object[] objArr = this.A;
        int i = this.L;
        int i2 = this.B;
        return fv.y0(objArr, i2, i + i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        h();
        g();
        int size = collection.size();
        d(this.B + this.L, collection, size);
        return size > 0;
    }
}

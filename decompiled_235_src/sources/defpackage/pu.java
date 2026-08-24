package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pu  reason: default package */
/* loaded from: classes.dex */
public final class pu extends d1 {
    public static final Object[] R = new Object[0];
    public int A;
    public Object[] B;
    public int L;

    public pu(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = R;
        } else if (i > 0) {
            objArr = new Object[i];
        } else {
            i.h(lb1.g(i, "Illegal Capacity: "));
            throw null;
        }
        this.B = objArr;
    }

    @Override // defpackage.d1
    public final int a() {
        return this.L;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int i3 = this.L;
        if (i >= 0 && i <= i3) {
            if (i == i3) {
                addLast(obj);
                return;
            } else if (i == 0) {
                addFirst(obj);
                return;
            } else {
                m();
                d(this.L + 1);
                int l = l(this.A + i);
                int i4 = this.L;
                if (i < ((i4 + 1) >> 1)) {
                    if (l == 0) {
                        Object[] objArr = this.B;
                        objArr.getClass();
                        i2 = objArr.length - 1;
                    } else {
                        i2 = l - 1;
                    }
                    int i5 = this.A;
                    if (i5 == 0) {
                        Object[] objArr2 = this.B;
                        objArr2.getClass();
                        i5 = objArr2.length;
                    }
                    int i6 = i5 - 1;
                    int i7 = this.A;
                    Object[] objArr3 = this.B;
                    if (i2 >= i7) {
                        objArr3[i6] = objArr3[i7];
                        fv.t0(objArr3, objArr3, i7, i7 + 1, i2 + 1);
                    } else {
                        fv.t0(objArr3, objArr3, i7 - 1, i7, objArr3.length);
                        Object[] objArr4 = this.B;
                        objArr4[objArr4.length - 1] = objArr4[0];
                        fv.t0(objArr4, objArr4, 0, 1, i2 + 1);
                    }
                    this.B[i2] = obj;
                    this.A = i6;
                } else {
                    int l2 = l(i4 + this.A);
                    Object[] objArr5 = this.B;
                    if (l < l2) {
                        fv.t0(objArr5, objArr5, l + 1, l, l2);
                    } else {
                        fv.t0(objArr5, objArr5, 1, 0, l2);
                        Object[] objArr6 = this.B;
                        objArr6[0] = objArr6[objArr6.length - 1];
                        fv.t0(objArr6, objArr6, l + 1, l, objArr6.length - 1);
                    }
                    this.B[l] = obj;
                }
                this.L++;
                return;
            }
        }
        e41.q(lb1.j("index: ", i, i3, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        int i2 = this.L;
        if (i >= 0 && i <= i2) {
            if (collection.isEmpty()) {
                return false;
            }
            if (i == this.L) {
                return addAll(collection);
            }
            m();
            d(collection.size() + this.L);
            int l = l(this.L + this.A);
            int l2 = l(this.A + i);
            int size = collection.size();
            if (i < ((this.L + 1) >> 1)) {
                int i3 = this.A;
                int i4 = i3 - size;
                Object[] objArr = this.B;
                if (l2 >= i3) {
                    if (i4 >= 0) {
                        fv.t0(objArr, objArr, i4, i3, l2);
                    } else {
                        i4 += objArr.length;
                        int i5 = l2 - i3;
                        int length = objArr.length - i4;
                        if (length >= i5) {
                            fv.t0(objArr, objArr, i4, i3, l2);
                        } else {
                            fv.t0(objArr, objArr, i4, i3, i3 + length);
                            Object[] objArr2 = this.B;
                            fv.t0(objArr2, objArr2, 0, this.A + length, l2);
                        }
                    }
                } else {
                    fv.t0(objArr, objArr, i4, i3, objArr.length);
                    Object[] objArr3 = this.B;
                    if (size >= l2) {
                        fv.t0(objArr3, objArr3, objArr3.length - size, 0, l2);
                    } else {
                        fv.t0(objArr3, objArr3, objArr3.length - size, 0, size);
                        Object[] objArr4 = this.B;
                        fv.t0(objArr4, objArr4, 0, size, l2);
                    }
                }
                this.A = i4;
                c(i(l2 - size), collection);
                return true;
            }
            int i6 = l2 + size;
            Object[] objArr5 = this.B;
            if (l2 < l) {
                int i7 = size + l;
                if (i7 <= objArr5.length) {
                    fv.t0(objArr5, objArr5, i6, l2, l);
                } else if (i6 >= objArr5.length) {
                    fv.t0(objArr5, objArr5, i6 - objArr5.length, l2, l);
                } else {
                    int length2 = l - (i7 - objArr5.length);
                    fv.t0(objArr5, objArr5, 0, length2, l);
                    Object[] objArr6 = this.B;
                    fv.t0(objArr6, objArr6, i6, l2, length2);
                }
            } else {
                fv.t0(objArr5, objArr5, size, 0, l);
                Object[] objArr7 = this.B;
                if (i6 >= objArr7.length) {
                    fv.t0(objArr7, objArr7, i6 - objArr7.length, l2, objArr7.length);
                } else {
                    fv.t0(objArr7, objArr7, 0, objArr7.length - size, objArr7.length);
                    Object[] objArr8 = this.B;
                    fv.t0(objArr8, objArr8, i6, l2, objArr8.length - size);
                }
            }
            c(l2, collection);
            return true;
        }
        e41.q(lb1.j("index: ", i, i2, ", size: "));
        return false;
    }

    public final void addFirst(Object obj) {
        m();
        d(this.L + 1);
        int i = this.A;
        if (i == 0) {
            Object[] objArr = this.B;
            objArr.getClass();
            i = objArr.length;
        }
        int i2 = i - 1;
        this.A = i2;
        this.B[i2] = obj;
        this.L++;
    }

    public final void addLast(Object obj) {
        m();
        d(a() + 1);
        this.B[l(a() + this.A)] = obj;
        this.L = a() + 1;
    }

    @Override // defpackage.d1
    public final Object b(int i) {
        int i2 = this.L;
        if (i >= 0 && i < i2) {
            if (i == a() - 1) {
                return removeLast();
            }
            if (i == 0) {
                return removeFirst();
            }
            m();
            int l = l(this.A + i);
            Object[] objArr = this.B;
            Object obj = objArr[l];
            int i3 = this.L >> 1;
            int i4 = this.A;
            if (i < i3) {
                if (l >= i4) {
                    fv.t0(objArr, objArr, i4 + 1, i4, l);
                } else {
                    fv.t0(objArr, objArr, 1, 0, l);
                    Object[] objArr2 = this.B;
                    objArr2[0] = objArr2[objArr2.length - 1];
                    int i5 = this.A;
                    fv.t0(objArr2, objArr2, i5 + 1, i5, objArr2.length - 1);
                }
                Object[] objArr3 = this.B;
                int i6 = this.A;
                objArr3[i6] = null;
                this.A = g(i6);
            } else {
                int l2 = l((a() - 1) + i4);
                Object[] objArr4 = this.B;
                if (l <= l2) {
                    fv.t0(objArr4, objArr4, l, l + 1, l2 + 1);
                } else {
                    fv.t0(objArr4, objArr4, l, l + 1, objArr4.length);
                    Object[] objArr5 = this.B;
                    objArr5[objArr5.length - 1] = objArr5[0];
                    fv.t0(objArr5, objArr5, 0, 1, l2 + 1);
                }
                this.B[l2] = null;
            }
            this.L--;
            return obj;
        }
        e41.q(lb1.j("index: ", i, i2, ", size: "));
        return null;
    }

    public final void c(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.B.length;
        while (i < length && it.hasNext()) {
            this.B[i] = it.next();
            i++;
        }
        int i2 = this.A;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.B[i3] = it.next();
        }
        this.L = collection.size() + this.L;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            m();
            j(this.A, l(a() + this.A));
        }
        this.A = 0;
        this.L = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final void d(int i) {
        if (i >= 0) {
            Object[] objArr = this.B;
            if (i <= objArr.length) {
                return;
            }
            if (objArr == R) {
                if (i < 10) {
                    i = 10;
                }
                this.B = new Object[i];
                return;
            }
            int length = objArr.length;
            int i2 = length + (length >> 1);
            if (i2 - i < 0) {
                i2 = i;
            }
            if (i2 - 2147483639 > 0) {
                if (i > 2147483639) {
                    i2 = Integer.MAX_VALUE;
                } else {
                    i2 = 2147483639;
                }
            }
            Object[] objArr2 = new Object[i2];
            fv.t0(objArr, objArr2, 0, this.A, objArr.length);
            Object[] objArr3 = this.B;
            int length2 = objArr3.length;
            int i3 = this.A;
            fv.t0(objArr3, objArr2, length2 - i3, 0, i3);
            this.A = 0;
            this.B = objArr2;
            return;
        }
        i.m("Deque is too big.");
    }

    public final Object f() {
        if (isEmpty()) {
            return null;
        }
        return this.B[this.A];
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.B[this.A];
        }
        fa6.e("ArrayDeque is empty.");
        return null;
    }

    public final int g(int i) {
        Object[] objArr = this.B;
        objArr.getClass();
        if (i == objArr.length - 1) {
            return 0;
        }
        return i + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int a = a();
        if (i >= 0 && i < a) {
            return this.B[l(this.A + i)];
        }
        e41.q(lb1.j("index: ", i, a, ", size: "));
        return null;
    }

    public final Object h() {
        if (isEmpty()) {
            return null;
        }
        return this.B[l((size() - 1) + this.A)];
    }

    public final int i(int i) {
        if (i < 0) {
            return i + this.B.length;
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int l = l(a() + this.A);
        int i2 = this.A;
        if (i2 < l) {
            while (i2 < l) {
                if (nb3.k(obj, this.B[i2])) {
                    i = this.A;
                } else {
                    i2++;
                }
            }
            return -1;
        } else if (!isEmpty() && (i2 = this.A) >= l) {
            int length = this.B.length;
            while (true) {
                if (i2 < length) {
                    if (nb3.k(obj, this.B[i2])) {
                        i = this.A;
                        break;
                    }
                    i2++;
                } else {
                    for (int i3 = 0; i3 < l; i3++) {
                        if (nb3.k(obj, this.B[i3])) {
                            i2 = i3 + this.B.length;
                            i = this.A;
                        }
                    }
                    return -1;
                }
            }
        } else {
            return -1;
        }
        return i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (a() == 0) {
            return true;
        }
        return false;
    }

    public final void j(int i, int i2) {
        Object[] objArr = this.B;
        if (i < i2) {
            fv.z0(i, i2, null, objArr);
            return;
        }
        fv.z0(i, objArr.length, null, objArr);
        fv.z0(0, i2, null, this.B);
    }

    public final int l(int i) {
        Object[] objArr = this.B;
        if (i >= objArr.length) {
            return i - objArr.length;
        }
        return i;
    }

    public final Object last() {
        if (!isEmpty()) {
            return this.B[l((size() - 1) + this.A)];
        }
        fa6.e("ArrayDeque is empty.");
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int l = l(this.L + this.A);
        int i2 = this.A;
        if (i2 < l) {
            length = l - 1;
            if (i2 <= length) {
                while (!nb3.k(obj, this.B[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.A;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.A >= l) {
            while (true) {
                l--;
                Object[] objArr = this.B;
                if (-1 < l) {
                    if (nb3.k(obj, objArr[l])) {
                        length = l + this.B.length;
                        i = this.A;
                        break;
                    }
                } else {
                    objArr.getClass();
                    length = objArr.length - 1;
                    int i3 = this.A;
                    if (i3 <= length) {
                        while (!nb3.k(obj, this.B[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.A;
                    }
                }
            }
            return length - i;
        }
        return -1;
    }

    public final void m() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        b(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int l;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.B.length != 0) {
            int l2 = l(a() + this.A);
            int i = this.A;
            if (i < l2) {
                l = i;
                while (true) {
                    objArr = this.B;
                    if (i >= l2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (!collection.contains(obj)) {
                        this.B[l] = obj;
                        l++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                fv.z0(l, l2, null, objArr);
            } else {
                int length = this.B.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.B;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (!collection.contains(obj2)) {
                        this.B[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                l = l(i2);
                for (int i3 = 0; i3 < l2; i3++) {
                    Object[] objArr3 = this.B;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (!collection.contains(obj3)) {
                        this.B[l] = obj3;
                        l = g(l);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                m();
                this.L = i(l - this.A);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (!isEmpty()) {
            m();
            Object[] objArr = this.B;
            int i = this.A;
            Object obj = objArr[i];
            objArr[i] = null;
            this.A = g(i);
            this.L = a() - 1;
            return obj;
        }
        fa6.e("ArrayDeque is empty.");
        return null;
    }

    public final Object removeLast() {
        if (!isEmpty()) {
            m();
            int l = l((size() - 1) + this.A);
            Object[] objArr = this.B;
            Object obj = objArr[l];
            objArr[l] = null;
            this.L = a() - 1;
            return obj;
        }
        fa6.e("ArrayDeque is empty.");
        return null;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        hf.E(i, i2, this.L);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.L) {
            clear();
        } else if (i3 == 1) {
            b(i);
        } else {
            m();
            int i4 = this.L - i2;
            int i5 = this.A;
            if (i < i4) {
                int l = l((i - 1) + i5);
                int l2 = l(this.A + (i2 - 1));
                while (i > 0) {
                    int i6 = l + 1;
                    int min = Math.min(i, Math.min(i6, l2 + 1));
                    Object[] objArr = this.B;
                    int i7 = l2 - min;
                    int i8 = l - min;
                    fv.t0(objArr, objArr, i7 + 1, i8 + 1, i6);
                    l = i(i8);
                    l2 = i(i7);
                    i -= min;
                }
                int l3 = l(this.A + i3);
                j(this.A, l3);
                this.A = l3;
            } else {
                int l4 = l(i5 + i2);
                int l5 = l(this.A + i);
                int i9 = this.L;
                while (true) {
                    i9 -= i2;
                    if (i9 <= 0) {
                        break;
                    }
                    Object[] objArr2 = this.B;
                    i2 = Math.min(i9, Math.min(objArr2.length - l4, objArr2.length - l5));
                    Object[] objArr3 = this.B;
                    int i10 = l4 + i2;
                    fv.t0(objArr3, objArr3, l5, l4, i10);
                    l4 = l(i10);
                    l5 = l(l5 + i2);
                }
                int l6 = l(this.L + this.A);
                j(i(l6 - i3), l6);
            }
            this.L -= i3;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int l;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.B.length != 0) {
            int l2 = l(a() + this.A);
            int i = this.A;
            if (i < l2) {
                l = i;
                while (true) {
                    objArr = this.B;
                    if (i >= l2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.B[l] = obj;
                        l++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                fv.z0(l, l2, null, objArr);
            } else {
                int length = this.B.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.B;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.B[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                l = l(i2);
                for (int i3 = 0; i3 < l2; i3++) {
                    Object[] objArr3 = this.B;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.B[l] = obj3;
                        l = g(l);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                m();
                this.L = i(l - this.A);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int a = a();
        if (i >= 0 && i < a) {
            int l = l(this.A + i);
            Object[] objArr = this.B;
            Object obj2 = objArr[l];
            objArr[l] = obj;
            return obj2;
        }
        e41.q(lb1.j("index: ", i, a, ", size: "));
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.L;
        if (length < i) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            newInstance.getClass();
            objArr = (Object[]) newInstance;
        }
        int l = l(this.L + this.A);
        int i2 = this.A;
        if (i2 < l) {
            fv.w0(this.B, objArr, i2, l, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.B;
            fv.t0(objArr2, objArr, 0, this.A, objArr2.length);
            Object[] objArr3 = this.B;
            fv.t0(objArr3, objArr, objArr3.length - this.A, 0, l);
        }
        int i3 = this.L;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    public pu() {
        this.B = R;
    }

    public pu(List list) {
        Object[] array = list.toArray(new Object[0]);
        this.B = array;
        this.L = array.length;
        if (array.length == 0) {
            this.B = R;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        m();
        d(collection.size() + a());
        c(l(a() + this.A), collection);
        return true;
    }
}

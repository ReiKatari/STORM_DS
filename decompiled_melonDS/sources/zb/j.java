package zb;

import androidx.preference.Preference;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j extends f {
    public static final Object[] R = new Object[0];
    public int A;
    public Object[] B;
    public int L;

    public j(int i2) {
        Object[] objArr;
        if (i2 == 0) {
            objArr = R;
        } else if (i2 > 0) {
            objArr = new Object[i2];
        } else {
            a0.j.h(w.d.l(i2, "Illegal Capacity: "));
            throw null;
        }
        this.B = objArr;
    }

    @Override // zb.f
    public final int a() {
        return this.L;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i10;
        int i11 = this.L;
        if (i2 >= 0 && i2 <= i11) {
            if (i2 == i11) {
                addLast(obj);
                return;
            } else if (i2 == 0) {
                addFirst(obj);
                return;
            } else {
                k();
                d(this.L + 1);
                int j2 = j(this.A + i2);
                int i12 = this.L;
                if (i2 < ((i12 + 1) >> 1)) {
                    if (j2 == 0) {
                        Object[] objArr = this.B;
                        objArr.getClass();
                        i10 = objArr.length - 1;
                    } else {
                        i10 = j2 - 1;
                    }
                    int i13 = this.A;
                    if (i13 == 0) {
                        Object[] objArr2 = this.B;
                        objArr2.getClass();
                        i13 = objArr2.length;
                    }
                    int i14 = i13 - 1;
                    int i15 = this.A;
                    Object[] objArr3 = this.B;
                    if (i10 >= i15) {
                        objArr3[i14] = objArr3[i15];
                        k.i(objArr3, objArr3, i15, i15 + 1, i10 + 1);
                    } else {
                        k.i(objArr3, objArr3, i15 - 1, i15, objArr3.length);
                        Object[] objArr4 = this.B;
                        objArr4[objArr4.length - 1] = objArr4[0];
                        k.i(objArr4, objArr4, 0, 1, i10 + 1);
                    }
                    this.B[i10] = obj;
                    this.A = i14;
                } else {
                    int j10 = j(i12 + this.A);
                    Object[] objArr5 = this.B;
                    if (j2 < j10) {
                        k.i(objArr5, objArr5, j2 + 1, j2, j10);
                    } else {
                        k.i(objArr5, objArr5, 1, 0, j10);
                        Object[] objArr6 = this.B;
                        objArr6[0] = objArr6[objArr6.length - 1];
                        k.i(objArr6, objArr6, j2 + 1, j2, objArr6.length - 1);
                    }
                    this.B[j2] = obj;
                }
                this.L++;
                return;
            }
        }
        wa.b.f(kc.a.d(i2, i11, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection collection) {
        collection.getClass();
        int i10 = this.L;
        if (i2 >= 0 && i2 <= i10) {
            if (collection.isEmpty()) {
                return false;
            }
            if (i2 == this.L) {
                return addAll(collection);
            }
            k();
            d(collection.size() + this.L);
            int j2 = j(this.L + this.A);
            int j10 = j(this.A + i2);
            int size = collection.size();
            if (i2 < ((this.L + 1) >> 1)) {
                int i11 = this.A;
                int i12 = i11 - size;
                Object[] objArr = this.B;
                if (j10 >= i11) {
                    if (i12 >= 0) {
                        k.i(objArr, objArr, i12, i11, j10);
                    } else {
                        i12 += objArr.length;
                        int i13 = j10 - i11;
                        int length = objArr.length - i12;
                        if (length >= i13) {
                            k.i(objArr, objArr, i12, i11, j10);
                        } else {
                            k.i(objArr, objArr, i12, i11, i11 + length);
                            Object[] objArr2 = this.B;
                            k.i(objArr2, objArr2, 0, this.A + length, j10);
                        }
                    }
                } else {
                    k.i(objArr, objArr, i12, i11, objArr.length);
                    Object[] objArr3 = this.B;
                    if (size >= j10) {
                        k.i(objArr3, objArr3, objArr3.length - size, 0, j10);
                    } else {
                        k.i(objArr3, objArr3, objArr3.length - size, 0, size);
                        Object[] objArr4 = this.B;
                        k.i(objArr4, objArr4, 0, size, j10);
                    }
                }
                this.A = i12;
                c(h(j10 - size), collection);
                return true;
            }
            int i14 = j10 + size;
            Object[] objArr5 = this.B;
            if (j10 < j2) {
                int i15 = size + j2;
                if (i15 <= objArr5.length) {
                    k.i(objArr5, objArr5, i14, j10, j2);
                } else if (i14 >= objArr5.length) {
                    k.i(objArr5, objArr5, i14 - objArr5.length, j10, j2);
                } else {
                    int length2 = j2 - (i15 - objArr5.length);
                    k.i(objArr5, objArr5, 0, length2, j2);
                    Object[] objArr6 = this.B;
                    k.i(objArr6, objArr6, i14, j10, length2);
                }
            } else {
                k.i(objArr5, objArr5, size, 0, j2);
                Object[] objArr7 = this.B;
                if (i14 >= objArr7.length) {
                    k.i(objArr7, objArr7, i14 - objArr7.length, j10, objArr7.length);
                } else {
                    k.i(objArr7, objArr7, 0, objArr7.length - size, objArr7.length);
                    Object[] objArr8 = this.B;
                    k.i(objArr8, objArr8, i14, j10, objArr8.length - size);
                }
            }
            c(j10, collection);
            return true;
        }
        wa.b.f(kc.a.d(i2, i10, "index: ", ", size: "));
        return false;
    }

    public final void addFirst(Object obj) {
        k();
        d(this.L + 1);
        int i2 = this.A;
        if (i2 == 0) {
            Object[] objArr = this.B;
            objArr.getClass();
            i2 = objArr.length;
        }
        int i10 = i2 - 1;
        this.A = i10;
        this.B[i10] = obj;
        this.L++;
    }

    public final void addLast(Object obj) {
        k();
        d(a() + 1);
        this.B[j(a() + this.A)] = obj;
        this.L = a() + 1;
    }

    @Override // zb.f
    public final Object b(int i2) {
        int i10 = this.L;
        if (i2 >= 0 && i2 < i10) {
            if (i2 == a() - 1) {
                return removeLast();
            }
            if (i2 == 0) {
                return removeFirst();
            }
            k();
            int j2 = j(this.A + i2);
            Object[] objArr = this.B;
            Object obj = objArr[j2];
            int i11 = this.L >> 1;
            int i12 = this.A;
            if (i2 < i11) {
                if (j2 >= i12) {
                    k.i(objArr, objArr, i12 + 1, i12, j2);
                } else {
                    k.i(objArr, objArr, 1, 0, j2);
                    Object[] objArr2 = this.B;
                    objArr2[0] = objArr2[objArr2.length - 1];
                    int i13 = this.A;
                    k.i(objArr2, objArr2, i13 + 1, i13, objArr2.length - 1);
                }
                Object[] objArr3 = this.B;
                int i14 = this.A;
                objArr3[i14] = null;
                this.A = f(i14);
            } else {
                int j10 = j((a() - 1) + i12);
                Object[] objArr4 = this.B;
                if (j2 <= j10) {
                    k.i(objArr4, objArr4, j2, j2 + 1, j10 + 1);
                } else {
                    k.i(objArr4, objArr4, j2, j2 + 1, objArr4.length);
                    Object[] objArr5 = this.B;
                    objArr5[objArr5.length - 1] = objArr5[0];
                    k.i(objArr5, objArr5, 0, 1, j10 + 1);
                }
                this.B[j10] = null;
            }
            this.L--;
            return obj;
        }
        wa.b.f(kc.a.d(i2, i10, "index: ", ", size: "));
        return null;
    }

    public final void c(int i2, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.B.length;
        while (i2 < length && it.hasNext()) {
            this.B[i2] = it.next();
            i2++;
        }
        int i10 = this.A;
        for (int i11 = 0; i11 < i10 && it.hasNext(); i11++) {
            this.B[i11] = it.next();
        }
        this.L = collection.size() + this.L;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            k();
            i(this.A, j(a() + this.A));
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

    public final void d(int i2) {
        if (i2 >= 0) {
            Object[] objArr = this.B;
            if (i2 <= objArr.length) {
                return;
            }
            if (objArr == R) {
                if (i2 < 10) {
                    i2 = 10;
                }
                this.B = new Object[i2];
                return;
            }
            int length = objArr.length;
            int i10 = length + (length >> 1);
            if (i10 - i2 < 0) {
                i10 = i2;
            }
            if (i10 - 2147483639 > 0) {
                if (i2 > 2147483639) {
                    i10 = Preference.DEFAULT_ORDER;
                } else {
                    i10 = 2147483639;
                }
            }
            Object[] objArr2 = new Object[i10];
            k.i(objArr, objArr2, 0, this.A, objArr.length);
            Object[] objArr3 = this.B;
            int length2 = objArr3.length;
            int i11 = this.A;
            k.i(objArr3, objArr2, length2 - i11, 0, i11);
            this.A = 0;
            this.B = objArr2;
            return;
        }
        a0.j.p("Deque is too big.");
    }

    public final Object e() {
        if (isEmpty()) {
            return null;
        }
        return this.B[this.A];
    }

    public final int f(int i2) {
        Object[] objArr = this.B;
        objArr.getClass();
        if (i2 == objArr.length - 1) {
            return 0;
        }
        return i2 + 1;
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.B[this.A];
        }
        m9.o.x("ArrayDeque is empty.");
        return null;
    }

    public final Object g() {
        if (isEmpty()) {
            return null;
        }
        return this.B[j((size() - 1) + this.A)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        int a10 = a();
        if (i2 >= 0 && i2 < a10) {
            return this.B[j(this.A + i2)];
        }
        wa.b.f(kc.a.d(i2, a10, "index: ", ", size: "));
        return null;
    }

    public final int h(int i2) {
        if (i2 < 0) {
            return i2 + this.B.length;
        }
        return i2;
    }

    public final void i(int i2, int i10) {
        Object[] objArr = this.B;
        if (i2 < i10) {
            k.s(i2, i10, null, objArr);
            return;
        }
        k.s(i2, objArr.length, null, objArr);
        k.s(0, i10, null, this.B);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i2;
        int j2 = j(a() + this.A);
        int i10 = this.A;
        if (i10 < j2) {
            while (i10 < j2) {
                if (nc.k.a(obj, this.B[i10])) {
                    i2 = this.A;
                } else {
                    i10++;
                }
            }
            return -1;
        } else if (!isEmpty() && (i10 = this.A) >= j2) {
            int length = this.B.length;
            while (true) {
                if (i10 < length) {
                    if (nc.k.a(obj, this.B[i10])) {
                        i2 = this.A;
                        break;
                    }
                    i10++;
                } else {
                    for (int i11 = 0; i11 < j2; i11++) {
                        if (nc.k.a(obj, this.B[i11])) {
                            i10 = i11 + this.B.length;
                            i2 = this.A;
                        }
                    }
                    return -1;
                }
            }
        } else {
            return -1;
        }
        return i10 - i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (a() == 0) {
            return true;
        }
        return false;
    }

    public final int j(int i2) {
        Object[] objArr = this.B;
        if (i2 >= objArr.length) {
            return i2 - objArr.length;
        }
        return i2;
    }

    public final void k() {
        ((AbstractList) this).modCount++;
    }

    public final Object last() {
        if (!isEmpty()) {
            return this.B[j((size() - 1) + this.A)];
        }
        m9.o.x("ArrayDeque is empty.");
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i2;
        int j2 = j(this.L + this.A);
        int i10 = this.A;
        if (i10 < j2) {
            length = j2 - 1;
            if (i10 <= length) {
                while (!nc.k.a(obj, this.B[length])) {
                    if (length != i10) {
                        length--;
                    }
                }
                i2 = this.A;
                return length - i2;
            }
            return -1;
        }
        if (!isEmpty() && this.A >= j2) {
            while (true) {
                j2--;
                Object[] objArr = this.B;
                if (-1 < j2) {
                    if (nc.k.a(obj, objArr[j2])) {
                        length = j2 + this.B.length;
                        i2 = this.A;
                        break;
                    }
                } else {
                    objArr.getClass();
                    length = objArr.length - 1;
                    int i11 = this.A;
                    if (i11 <= length) {
                        while (!nc.k.a(obj, this.B[length])) {
                            if (length != i11) {
                                length--;
                            }
                        }
                        i2 = this.A;
                    }
                }
            }
            return length - i2;
        }
        return -1;
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
        int j2;
        Object[] objArr;
        collection.getClass();
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.B.length != 0) {
            int j10 = j(a() + this.A);
            int i2 = this.A;
            if (i2 < j10) {
                j2 = i2;
                while (true) {
                    objArr = this.B;
                    if (i2 >= j10) {
                        break;
                    }
                    Object obj = objArr[i2];
                    if (!collection.contains(obj)) {
                        this.B[j2] = obj;
                        j2++;
                    } else {
                        z10 = true;
                    }
                    i2++;
                }
                k.s(j2, j10, null, objArr);
            } else {
                int length = this.B.length;
                boolean z11 = false;
                int i10 = i2;
                while (i2 < length) {
                    Object[] objArr2 = this.B;
                    Object obj2 = objArr2[i2];
                    objArr2[i2] = null;
                    if (!collection.contains(obj2)) {
                        this.B[i10] = obj2;
                        i10++;
                    } else {
                        z11 = true;
                    }
                    i2++;
                }
                j2 = j(i10);
                for (int i11 = 0; i11 < j10; i11++) {
                    Object[] objArr3 = this.B;
                    Object obj3 = objArr3[i11];
                    objArr3[i11] = null;
                    if (!collection.contains(obj3)) {
                        this.B[j2] = obj3;
                        j2 = f(j2);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                k();
                this.L = h(j2 - this.A);
            }
        }
        return z10;
    }

    public final Object removeFirst() {
        if (!isEmpty()) {
            k();
            Object[] objArr = this.B;
            int i2 = this.A;
            Object obj = objArr[i2];
            objArr[i2] = null;
            this.A = f(i2);
            this.L = a() - 1;
            return obj;
        }
        m9.o.x("ArrayDeque is empty.");
        return null;
    }

    public final Object removeLast() {
        if (!isEmpty()) {
            k();
            int j2 = j((size() - 1) + this.A);
            Object[] objArr = this.B;
            Object obj = objArr[j2];
            objArr[j2] = null;
            this.L = a() - 1;
            return obj;
        }
        m9.o.x("ArrayDeque is empty.");
        return null;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i10) {
        p7.o.d(i2, i10, this.L);
        int i11 = i10 - i2;
        if (i11 == 0) {
            return;
        }
        if (i11 == this.L) {
            clear();
        } else if (i11 == 1) {
            b(i2);
        } else {
            k();
            int i12 = this.L - i10;
            int i13 = this.A;
            if (i2 < i12) {
                int j2 = j((i2 - 1) + i13);
                int j10 = j(this.A + (i10 - 1));
                while (i2 > 0) {
                    int i14 = j2 + 1;
                    int min = Math.min(i2, Math.min(i14, j10 + 1));
                    Object[] objArr = this.B;
                    int i15 = j10 - min;
                    int i16 = j2 - min;
                    k.i(objArr, objArr, i15 + 1, i16 + 1, i14);
                    j2 = h(i16);
                    j10 = h(i15);
                    i2 -= min;
                }
                int j11 = j(this.A + i11);
                i(this.A, j11);
                this.A = j11;
            } else {
                int j12 = j(i13 + i10);
                int j13 = j(this.A + i2);
                int i17 = this.L;
                while (true) {
                    i17 -= i10;
                    if (i17 <= 0) {
                        break;
                    }
                    Object[] objArr2 = this.B;
                    i10 = Math.min(i17, Math.min(objArr2.length - j12, objArr2.length - j13));
                    Object[] objArr3 = this.B;
                    int i18 = j12 + i10;
                    k.i(objArr3, objArr3, j13, j12, i18);
                    j12 = j(i18);
                    j13 = j(j13 + i10);
                }
                int j14 = j(this.L + this.A);
                i(h(j14 - i11), j14);
            }
            this.L -= i11;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int j2;
        Object[] objArr;
        collection.getClass();
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.B.length != 0) {
            int j10 = j(a() + this.A);
            int i2 = this.A;
            if (i2 < j10) {
                j2 = i2;
                while (true) {
                    objArr = this.B;
                    if (i2 >= j10) {
                        break;
                    }
                    Object obj = objArr[i2];
                    if (collection.contains(obj)) {
                        this.B[j2] = obj;
                        j2++;
                    } else {
                        z10 = true;
                    }
                    i2++;
                }
                k.s(j2, j10, null, objArr);
            } else {
                int length = this.B.length;
                boolean z11 = false;
                int i10 = i2;
                while (i2 < length) {
                    Object[] objArr2 = this.B;
                    Object obj2 = objArr2[i2];
                    objArr2[i2] = null;
                    if (collection.contains(obj2)) {
                        this.B[i10] = obj2;
                        i10++;
                    } else {
                        z11 = true;
                    }
                    i2++;
                }
                j2 = j(i10);
                for (int i11 = 0; i11 < j10; i11++) {
                    Object[] objArr3 = this.B;
                    Object obj3 = objArr3[i11];
                    objArr3[i11] = null;
                    if (collection.contains(obj3)) {
                        this.B[j2] = obj3;
                        j2 = f(j2);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                k();
                this.L = h(j2 - this.A);
            }
        }
        return z10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        int a10 = a();
        if (i2 >= 0 && i2 < a10) {
            int j2 = j(this.A + i2);
            Object[] objArr = this.B;
            Object obj2 = objArr[j2];
            objArr[j2] = obj;
            return obj2;
        }
        wa.b.f(kc.a.d(i2, a10, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i2 = this.L;
        if (length < i2) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i2);
            newInstance.getClass();
            objArr = (Object[]) newInstance;
        }
        int j2 = j(this.L + this.A);
        int i10 = this.A;
        if (i10 < j2) {
            k.l(this.B, objArr, i10, j2, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.B;
            k.i(objArr2, objArr, 0, this.A, objArr2.length);
            Object[] objArr3 = this.B;
            k.i(objArr3, objArr, objArr3.length - this.A, 0, j2);
        }
        int i11 = this.L;
        if (i11 < objArr.length) {
            objArr[i11] = null;
        }
        return objArr;
    }

    public j() {
        this.B = R;
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
        k();
        d(collection.size() + a());
        c(j(a() + this.A), collection);
        return true;
    }
}

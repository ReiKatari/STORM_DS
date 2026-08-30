package defpackage;

import androidx.preference.Preference;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xt  reason: default package */
/* loaded from: classes.dex */
public final class xt extends c1 {
    public static final Object[] R = new Object[0];
    public int A;
    public Object[] B;
    public int L;

    public xt(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = R;
        } else if (i > 0) {
            objArr = new Object[i];
        } else {
            i.i(wh1.g(i, "Illegal Capacity: "));
            throw null;
        }
        this.B = objArr;
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
                p();
                i(this.L + 1);
                int o = o(this.A + i);
                int i4 = this.L;
                if (i < ((i4 + 1) >> 1)) {
                    if (o == 0) {
                        Object[] objArr = this.B;
                        objArr.getClass();
                        i2 = objArr.length - 1;
                    } else {
                        i2 = o - 1;
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
                        nu.f0(objArr3, objArr3, i7, i7 + 1, i2 + 1);
                    } else {
                        nu.f0(objArr3, objArr3, i7 - 1, i7, objArr3.length);
                        Object[] objArr4 = this.B;
                        objArr4[objArr4.length - 1] = objArr4[0];
                        nu.f0(objArr4, objArr4, 0, 1, i2 + 1);
                    }
                    this.B[i2] = obj;
                    this.A = i6;
                } else {
                    int o2 = o(i4 + this.A);
                    Object[] objArr5 = this.B;
                    if (o < o2) {
                        nu.f0(objArr5, objArr5, o + 1, o, o2);
                    } else {
                        nu.f0(objArr5, objArr5, 1, 0, o2);
                        Object[] objArr6 = this.B;
                        objArr6[0] = objArr6[objArr6.length - 1];
                        nu.f0(objArr6, objArr6, o + 1, o, objArr6.length - 1);
                    }
                    this.B[o] = obj;
                }
                this.L++;
                return;
            }
        }
        f81.q(wh1.f(i, i3, "index: ", ", size: "));
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
            p();
            i(collection.size() + this.L);
            int o = o(this.L + this.A);
            int o2 = o(this.A + i);
            int size = collection.size();
            if (i < ((this.L + 1) >> 1)) {
                int i3 = this.A;
                int i4 = i3 - size;
                Object[] objArr = this.B;
                if (o2 >= i3) {
                    if (i4 >= 0) {
                        nu.f0(objArr, objArr, i4, i3, o2);
                    } else {
                        i4 += objArr.length;
                        int i5 = o2 - i3;
                        int length = objArr.length - i4;
                        if (length >= i5) {
                            nu.f0(objArr, objArr, i4, i3, o2);
                        } else {
                            nu.f0(objArr, objArr, i4, i3, i3 + length);
                            Object[] objArr2 = this.B;
                            nu.f0(objArr2, objArr2, 0, this.A + length, o2);
                        }
                    }
                } else {
                    nu.f0(objArr, objArr, i4, i3, objArr.length);
                    Object[] objArr3 = this.B;
                    if (size >= o2) {
                        nu.f0(objArr3, objArr3, objArr3.length - size, 0, o2);
                    } else {
                        nu.f0(objArr3, objArr3, objArr3.length - size, 0, size);
                        Object[] objArr4 = this.B;
                        nu.f0(objArr4, objArr4, 0, size, o2);
                    }
                }
                this.A = i4;
                d(m(o2 - size), collection);
                return true;
            }
            int i6 = o2 + size;
            Object[] objArr5 = this.B;
            if (o2 < o) {
                int i7 = size + o;
                if (i7 <= objArr5.length) {
                    nu.f0(objArr5, objArr5, i6, o2, o);
                } else if (i6 >= objArr5.length) {
                    nu.f0(objArr5, objArr5, i6 - objArr5.length, o2, o);
                } else {
                    int length2 = o - (i7 - objArr5.length);
                    nu.f0(objArr5, objArr5, 0, length2, o);
                    Object[] objArr6 = this.B;
                    nu.f0(objArr6, objArr6, i6, o2, length2);
                }
            } else {
                nu.f0(objArr5, objArr5, size, 0, o);
                Object[] objArr7 = this.B;
                if (i6 >= objArr7.length) {
                    nu.f0(objArr7, objArr7, i6 - objArr7.length, o2, objArr7.length);
                } else {
                    nu.f0(objArr7, objArr7, 0, objArr7.length - size, objArr7.length);
                    Object[] objArr8 = this.B;
                    nu.f0(objArr8, objArr8, i6, o2, objArr8.length - size);
                }
            }
            d(o2, collection);
            return true;
        }
        f81.q(wh1.f(i, i2, "index: ", ", size: "));
        return false;
    }

    public final void addFirst(Object obj) {
        p();
        i(this.L + 1);
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
        p();
        i(b() + 1);
        this.B[o(b() + this.A)] = obj;
        this.L = b() + 1;
    }

    @Override // defpackage.c1
    public final int b() {
        return this.L;
    }

    @Override // defpackage.c1
    public final Object c(int i) {
        int i2 = this.L;
        if (i >= 0 && i < i2) {
            if (i == b() - 1) {
                return removeLast();
            }
            if (i == 0) {
                return removeFirst();
            }
            p();
            int o = o(this.A + i);
            Object[] objArr = this.B;
            Object obj = objArr[o];
            int i3 = this.L >> 1;
            int i4 = this.A;
            if (i < i3) {
                if (o >= i4) {
                    nu.f0(objArr, objArr, i4 + 1, i4, o);
                } else {
                    nu.f0(objArr, objArr, 1, 0, o);
                    Object[] objArr2 = this.B;
                    objArr2[0] = objArr2[objArr2.length - 1];
                    int i5 = this.A;
                    nu.f0(objArr2, objArr2, i5 + 1, i5, objArr2.length - 1);
                }
                Object[] objArr3 = this.B;
                int i6 = this.A;
                objArr3[i6] = null;
                this.A = k(i6);
            } else {
                int o2 = o((b() - 1) + i4);
                Object[] objArr4 = this.B;
                if (o <= o2) {
                    nu.f0(objArr4, objArr4, o, o + 1, o2 + 1);
                } else {
                    nu.f0(objArr4, objArr4, o, o + 1, objArr4.length);
                    Object[] objArr5 = this.B;
                    objArr5[objArr5.length - 1] = objArr5[0];
                    nu.f0(objArr5, objArr5, 0, 1, o2 + 1);
                }
                this.B[o2] = null;
            }
            this.L--;
            return obj;
        }
        f81.q(wh1.f(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            p();
            n(this.A, o(b() + this.A));
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

    public final void d(int i, Collection collection) {
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

    public final Object first() {
        if (!isEmpty()) {
            return this.B[this.A];
        }
        vd6.e("ArrayDeque is empty.");
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int b = b();
        if (i >= 0 && i < b) {
            return this.B[o(this.A + i)];
        }
        f81.q(wh1.f(i, b, "index: ", ", size: "));
        return null;
    }

    public final void i(int i) {
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
                    i2 = Preference.DEFAULT_ORDER;
                } else {
                    i2 = 2147483639;
                }
            }
            Object[] objArr2 = new Object[i2];
            nu.f0(objArr, objArr2, 0, this.A, objArr.length);
            Object[] objArr3 = this.B;
            int length2 = objArr3.length;
            int i3 = this.A;
            nu.f0(objArr3, objArr2, length2 - i3, 0, i3);
            this.A = 0;
            this.B = objArr2;
            return;
        }
        i.n("Deque is too big.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int o = o(b() + this.A);
        int i2 = this.A;
        if (i2 < o) {
            while (i2 < o) {
                if (b53.x(obj, this.B[i2])) {
                    i = this.A;
                } else {
                    i2++;
                }
            }
            return -1;
        } else if (!isEmpty() && (i2 = this.A) >= o) {
            int length = this.B.length;
            while (true) {
                if (i2 < length) {
                    if (b53.x(obj, this.B[i2])) {
                        i = this.A;
                        break;
                    }
                    i2++;
                } else {
                    for (int i3 = 0; i3 < o; i3++) {
                        if (b53.x(obj, this.B[i3])) {
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
        if (b() == 0) {
            return true;
        }
        return false;
    }

    public final Object j() {
        if (isEmpty()) {
            return null;
        }
        return this.B[this.A];
    }

    public final int k(int i) {
        Object[] objArr = this.B;
        objArr.getClass();
        if (i == objArr.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final Object l() {
        if (isEmpty()) {
            return null;
        }
        return this.B[o((size() - 1) + this.A)];
    }

    public final Object last() {
        if (!isEmpty()) {
            return this.B[o((size() - 1) + this.A)];
        }
        vd6.e("ArrayDeque is empty.");
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int o = o(this.L + this.A);
        int i2 = this.A;
        if (i2 < o) {
            length = o - 1;
            if (i2 <= length) {
                while (!b53.x(obj, this.B[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.A;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.A >= o) {
            while (true) {
                o--;
                Object[] objArr = this.B;
                if (-1 < o) {
                    if (b53.x(obj, objArr[o])) {
                        length = o + this.B.length;
                        i = this.A;
                        break;
                    }
                } else {
                    objArr.getClass();
                    length = objArr.length - 1;
                    int i3 = this.A;
                    if (i3 <= length) {
                        while (!b53.x(obj, this.B[length])) {
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

    public final int m(int i) {
        if (i < 0) {
            return i + this.B.length;
        }
        return i;
    }

    public final void n(int i, int i2) {
        Object[] objArr = this.B;
        if (i < i2) {
            nu.l0(i, i2, null, objArr);
            return;
        }
        nu.l0(i, objArr.length, null, objArr);
        nu.l0(0, i2, null, this.B);
    }

    public final int o(int i) {
        Object[] objArr = this.B;
        if (i >= objArr.length) {
            return i - objArr.length;
        }
        return i;
    }

    public final void p() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        c(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int o;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.B.length != 0) {
            int o2 = o(b() + this.A);
            int i = this.A;
            if (i < o2) {
                o = i;
                while (true) {
                    objArr = this.B;
                    if (i >= o2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (!collection.contains(obj)) {
                        this.B[o] = obj;
                        o++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                nu.l0(o, o2, null, objArr);
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
                o = o(i2);
                for (int i3 = 0; i3 < o2; i3++) {
                    Object[] objArr3 = this.B;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (!collection.contains(obj3)) {
                        this.B[o] = obj3;
                        o = k(o);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                p();
                this.L = m(o - this.A);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (!isEmpty()) {
            p();
            Object[] objArr = this.B;
            int i = this.A;
            Object obj = objArr[i];
            objArr[i] = null;
            this.A = k(i);
            this.L = b() - 1;
            return obj;
        }
        vd6.e("ArrayDeque is empty.");
        return null;
    }

    public final Object removeLast() {
        if (!isEmpty()) {
            p();
            int o = o((size() - 1) + this.A);
            Object[] objArr = this.B;
            Object obj = objArr[o];
            objArr[o] = null;
            this.L = b() - 1;
            return obj;
        }
        vd6.e("ArrayDeque is empty.");
        return null;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        f34.w(i, i2, this.L);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.L) {
            clear();
        } else if (i3 == 1) {
            c(i);
        } else {
            p();
            int i4 = this.L - i2;
            int i5 = this.A;
            if (i < i4) {
                int o = o((i - 1) + i5);
                int o2 = o(this.A + (i2 - 1));
                while (i > 0) {
                    int i6 = o + 1;
                    int min = Math.min(i, Math.min(i6, o2 + 1));
                    Object[] objArr = this.B;
                    int i7 = o2 - min;
                    int i8 = o - min;
                    nu.f0(objArr, objArr, i7 + 1, i8 + 1, i6);
                    o = m(i8);
                    o2 = m(i7);
                    i -= min;
                }
                int o3 = o(this.A + i3);
                n(this.A, o3);
                this.A = o3;
            } else {
                int o4 = o(i5 + i2);
                int o5 = o(this.A + i);
                int i9 = this.L;
                while (true) {
                    i9 -= i2;
                    if (i9 <= 0) {
                        break;
                    }
                    Object[] objArr2 = this.B;
                    i2 = Math.min(i9, Math.min(objArr2.length - o4, objArr2.length - o5));
                    Object[] objArr3 = this.B;
                    int i10 = o4 + i2;
                    nu.f0(objArr3, objArr3, o5, o4, i10);
                    o4 = o(i10);
                    o5 = o(o5 + i2);
                }
                int o6 = o(this.L + this.A);
                n(m(o6 - i3), o6);
            }
            this.L -= i3;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int o;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.B.length != 0) {
            int o2 = o(b() + this.A);
            int i = this.A;
            if (i < o2) {
                o = i;
                while (true) {
                    objArr = this.B;
                    if (i >= o2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.B[o] = obj;
                        o++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                nu.l0(o, o2, null, objArr);
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
                o = o(i2);
                for (int i3 = 0; i3 < o2; i3++) {
                    Object[] objArr3 = this.B;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.B[o] = obj3;
                        o = k(o);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                p();
                this.L = m(o - this.A);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int b = b();
        if (i >= 0 && i < b) {
            int o = o(this.A + i);
            Object[] objArr = this.B;
            Object obj2 = objArr[o];
            objArr[o] = obj;
            return obj2;
        }
        f81.q(wh1.f(i, b, "index: ", ", size: "));
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
        int o = o(this.L + this.A);
        int i2 = this.A;
        if (i2 < o) {
            nu.i0(this.B, objArr, i2, o, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.B;
            nu.f0(objArr2, objArr, 0, this.A, objArr2.length);
            Object[] objArr3 = this.B;
            nu.f0(objArr3, objArr, objArr3.length - this.A, 0, o);
        }
        int i3 = this.L;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    public xt() {
        this.B = R;
    }

    public xt(List list) {
        Object[] array = list.toArray(new Object[0]);
        this.B = array;
        this.L = array.length;
        if (array.length == 0) {
            this.B = R;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[b()]);
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
        p();
        i(collection.size() + b());
        d(o(b() + this.A), collection);
        return true;
    }
}

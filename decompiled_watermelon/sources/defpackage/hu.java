package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hu  reason: default package */
/* loaded from: classes.dex */
public final class hu implements Collection, Set, g93, j93 {
    public int[] A;
    public Object[] B;
    public int L;

    public hu(int i) {
        this.A = pu.e;
        this.B = pu.g;
        if (i > 0) {
            this.A = new int[i];
            this.B = new Object[i];
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int A;
        int i2 = this.L;
        if (obj == null) {
            A = dk7.A(this, null, 0);
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            A = dk7.A(this, obj, hashCode);
        }
        if (A >= 0) {
            return false;
        }
        int i3 = ~A;
        int[] iArr = this.A;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.B;
            int[] iArr2 = new int[i4];
            this.A = iArr2;
            this.B = new Object[i4];
            if (i2 == this.L) {
                if (iArr2.length != 0) {
                    nu.h0(0, iArr.length, 6, iArr, iArr2);
                    nu.i0(objArr, this.B, 0, objArr.length, 6);
                }
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.A;
            int i5 = i3 + 1;
            nu.d0(i5, i3, i2, iArr3, iArr3);
            Object[] objArr2 = this.B;
            nu.f0(objArr2, objArr2, i5, i3, i2);
        }
        int i6 = this.L;
        if (i2 == i6) {
            int[] iArr4 = this.A;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.B[i3] = obj;
                this.L = i6 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        int size = collection.size() + this.L;
        int i = this.L;
        int[] iArr = this.A;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.B;
            int[] iArr2 = new int[size];
            this.A = iArr2;
            this.B = new Object[size];
            if (i > 0) {
                nu.h0(0, i, 6, iArr, iArr2);
                nu.i0(objArr, this.B, 0, this.L, 6);
            }
        }
        if (this.L == i) {
            for (Object obj : collection) {
                z |= add(obj);
            }
            return z;
        }
        throw new ConcurrentModificationException();
    }

    public final Object b(int i) {
        int i2 = this.L;
        Object[] objArr = this.B;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.A;
        int i4 = 8;
        if (iArr.length > 8 && i2 < iArr.length / 3) {
            if (i2 > 8) {
                i4 = i2 + (i2 >> 1);
            }
            int[] iArr2 = new int[i4];
            this.A = iArr2;
            this.B = new Object[i4];
            if (i > 0) {
                nu.h0(0, i, 6, iArr, iArr2);
                nu.i0(objArr, this.B, 0, i, 6);
            }
            if (i < i3) {
                int i5 = i + 1;
                nu.d0(i, i5, i2, iArr, this.A);
                nu.f0(objArr, this.B, i, i5, i2);
            }
        } else {
            if (i < i3) {
                int i6 = i + 1;
                nu.d0(i, i6, i2, iArr, iArr);
                Object[] objArr2 = this.B;
                nu.f0(objArr2, objArr2, i, i6, i2);
            }
            this.B[i3] = null;
        }
        if (i2 == this.L) {
            this.L = i3;
            return obj;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.L != 0) {
            this.A = pu.e;
            this.B = pu.g;
            this.L = 0;
        }
        if (this.L == 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int A;
        if (obj == null) {
            A = dk7.A(this, null, 0);
        } else {
            A = dk7.A(this, obj, obj.hashCode());
        }
        if (A < 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.L != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.L;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.B[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.A;
        int i = this.L;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        if (this.L <= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new au(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int A;
        if (obj == null) {
            A = dk7.A(this, null, 0);
        } else {
            A = dk7.A(this, obj, obj.hashCode());
        }
        if (A < 0) {
            return false;
        }
        b(A);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        boolean z = false;
        for (Object obj : collection) {
            z |= remove(obj);
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        boolean z = false;
        for (int i = this.L - 1; -1 < i; i--) {
            if (!tq0.F0(collection, this.B[i])) {
                b(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.L;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int i = this.L;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        nu.f0(this.B, objArr, 0, 0, this.L);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.L * 14);
        sb.append('{');
        int i = this.L;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.B[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return nu.k0(this.B, 0, this.L);
    }
}

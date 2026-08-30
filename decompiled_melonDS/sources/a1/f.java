package a1;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f implements Collection, Set, oc.b, oc.e {
    public int[] A;
    public Object[] B;
    public int L;

    public f(int i2) {
        this.A = b1.a.f1739a;
        this.B = b1.a.f1741c;
        if (i2 > 0) {
            this.A = new int[i2];
            this.B = new Object[i2];
        }
    }

    public final Object a(int i2) {
        int i10 = this.L;
        Object[] objArr = this.B;
        Object obj = objArr[i2];
        if (i10 <= 1) {
            clear();
            return obj;
        }
        int i11 = i10 - 1;
        int[] iArr = this.A;
        int i12 = 8;
        if (iArr.length > 8 && i10 < iArr.length / 3) {
            if (i10 > 8) {
                i12 = i10 + (i10 >> 1);
            }
            int[] iArr2 = new int[i12];
            this.A = iArr2;
            this.B = new Object[i12];
            if (i2 > 0) {
                zb.k.j(0, i2, 6, iArr, iArr2);
                zb.k.l(objArr, this.B, 0, i2, 6);
            }
            if (i2 < i11) {
                int i13 = i2 + 1;
                zb.k.g(i2, i13, i10, iArr, this.A);
                zb.k.i(objArr, this.B, i2, i13, i10);
            }
        } else {
            if (i2 < i11) {
                int i14 = i2 + 1;
                zb.k.g(i2, i14, i10, iArr, iArr);
                Object[] objArr2 = this.B;
                zb.k.i(objArr2, objArr2, i2, i14, i10);
            }
            this.B[i11] = null;
        }
        if (i10 == this.L) {
            this.L = i11;
            return obj;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i2;
        int b10;
        int i10 = this.L;
        if (obj == null) {
            b10 = r.b(this, null, 0);
            i2 = 0;
        } else {
            int hashCode = obj.hashCode();
            i2 = hashCode;
            b10 = r.b(this, obj, hashCode);
        }
        if (b10 >= 0) {
            return false;
        }
        int i11 = ~b10;
        int[] iArr = this.A;
        if (i10 >= iArr.length) {
            int i12 = 8;
            if (i10 >= 8) {
                i12 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i12 = 4;
            }
            Object[] objArr = this.B;
            int[] iArr2 = new int[i12];
            this.A = iArr2;
            this.B = new Object[i12];
            if (i10 == this.L) {
                if (iArr2.length != 0) {
                    zb.k.j(0, iArr.length, 6, iArr, iArr2);
                    zb.k.l(objArr, this.B, 0, objArr.length, 6);
                }
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i11 < i10) {
            int[] iArr3 = this.A;
            int i13 = i11 + 1;
            zb.k.g(i13, i11, i10, iArr3, iArr3);
            Object[] objArr2 = this.B;
            zb.k.i(objArr2, objArr2, i13, i11, i10);
        }
        int i14 = this.L;
        if (i10 == i14) {
            int[] iArr4 = this.A;
            if (i11 < iArr4.length) {
                iArr4[i11] = i2;
                this.B[i11] = obj;
                this.L = i14 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        int size = collection.size() + this.L;
        int i2 = this.L;
        int[] iArr = this.A;
        boolean z10 = false;
        if (iArr.length < size) {
            Object[] objArr = this.B;
            int[] iArr2 = new int[size];
            this.A = iArr2;
            this.B = new Object[size];
            if (i2 > 0) {
                zb.k.j(0, i2, 6, iArr, iArr2);
                zb.k.l(objArr, this.B, 0, this.L, 6);
            }
        }
        if (this.L == i2) {
            for (Object obj : collection) {
                z10 |= add(obj);
            }
            return z10;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.L != 0) {
            this.A = b1.a.f1739a;
            this.B = b1.a.f1741c;
            this.L = 0;
        }
        if (this.L == 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int b10;
        if (obj == null) {
            b10 = r.b(this, null, 0);
        } else {
            b10 = r.b(this, obj, obj.hashCode());
        }
        if (b10 < 0) {
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
            int i2 = this.L;
            for (int i10 = 0; i10 < i2; i10++) {
                if (!((Set) obj).contains(this.B[i10])) {
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
        int i2 = this.L;
        int i10 = 0;
        for (int i11 = 0; i11 < i2; i11++) {
            i10 += iArr[i11];
        }
        return i10;
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
        return new a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int b10;
        if (obj == null) {
            b10 = r.b(this, null, 0);
        } else {
            b10 = r.b(this, obj, obj.hashCode());
        }
        if (b10 < 0) {
            return false;
        }
        a(b10);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        boolean z10 = false;
        for (Object obj : collection) {
            z10 |= remove(obj);
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        boolean z10 = false;
        for (int i2 = this.L - 1; -1 < i2; i2--) {
            if (!zb.l.N(collection, this.B[i2])) {
                a(i2);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.L;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int i2 = this.L;
        if (objArr.length < i2) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i2);
        } else if (objArr.length > i2) {
            objArr[i2] = null;
        }
        zb.k.i(this.B, objArr, 0, 0, this.L);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.L * 14);
        sb2.append('{');
        int i2 = this.L;
        for (int i10 = 0; i10 < i2; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object obj = this.B[i10];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return zb.k.n(this.B, 0, this.L);
    }
}

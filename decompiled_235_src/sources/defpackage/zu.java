package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zu  reason: default package */
/* loaded from: classes.dex */
public final class zu implements Collection, Set, ag3, dg3 {
    public int[] A;
    public Object[] B;
    public int L;

    public zu(int i) {
        this.A = g04.g;
        this.B = g04.i;
        if (i > 0) {
            this.A = new int[i];
            this.B = new Object[i];
        }
    }

    public final Object a(int i) {
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
                fv.v0(0, i, 6, iArr, iArr2);
                fv.w0(objArr, this.B, 0, i, 6);
            }
            if (i < i3) {
                int i5 = i + 1;
                fv.r0(i, i5, i2, iArr, this.A);
                fv.t0(objArr, this.B, i, i5, i2);
            }
        } else {
            if (i < i3) {
                int i6 = i + 1;
                fv.r0(i, i6, i2, iArr, iArr);
                Object[] objArr2 = this.B;
                fv.t0(objArr2, objArr2, i, i6, i2);
            }
            this.B[i3] = null;
        }
        if (i2 == this.L) {
            this.L = i3;
            return obj;
        }
        i.l();
        return null;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int L;
        int i2 = this.L;
        if (obj == null) {
            L = q60.L(this, null, 0);
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            L = q60.L(this, obj, hashCode);
        }
        if (L >= 0) {
            return false;
        }
        int i3 = ~L;
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
                    fv.v0(0, iArr.length, 6, iArr, iArr2);
                    fv.w0(objArr, this.B, 0, objArr.length, 6);
                }
            } else {
                i.l();
                return false;
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.A;
            int i5 = i3 + 1;
            fv.r0(i5, i3, i2, iArr3, iArr3);
            Object[] objArr2 = this.B;
            fv.t0(objArr2, objArr2, i5, i3, i2);
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
        i.l();
        return false;
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
                fv.v0(0, i, 6, iArr, iArr2);
                fv.w0(objArr, this.B, 0, this.L, 6);
            }
        }
        if (this.L == i) {
            for (Object obj : collection) {
                z |= add(obj);
            }
            return z;
        }
        i.l();
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.L != 0) {
            this.A = g04.g;
            this.B = g04.i;
            this.L = 0;
        }
        if (this.L == 0) {
            return;
        }
        i.l();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int L;
        if (obj == null) {
            L = q60.L(this, null, 0);
        } else {
            L = q60.L(this, obj, obj.hashCode());
        }
        if (L < 0) {
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
        return new su(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int L;
        if (obj == null) {
            L = q60.L(this, null, 0);
        } else {
            L = q60.L(this, obj, obj.hashCode());
        }
        if (L < 0) {
            return false;
        }
        a(L);
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
            if (!gt0.C0(collection, this.B[i])) {
                a(i);
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
        fv.t0(this.B, objArr, 0, 0, this.L);
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
        return fv.y0(this.B, 0, this.L);
    }
}

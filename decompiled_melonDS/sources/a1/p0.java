package a1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p0 implements oc.e, Set, oc.a {
    public final n0 A;
    public final n0 B;

    public p0(n0 n0Var) {
        this.A = n0Var;
        this.B = n0Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.B.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        n0 n0Var = this.B;
        int i2 = n0Var.f77d;
        for (Object obj : collection) {
            n0Var.k(obj);
        }
        if (i2 != n0Var.f77d) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.B.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.A.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        for (Object obj : collection) {
            if (!this.A.c(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p0.class == obj.getClass()) {
            return this.A.equals(((p0) obj).A);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.A.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.A.g();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new k0(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.B.l(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        n0 n0Var = this.B;
        int i2 = n0Var.f77d;
        for (Object obj : collection) {
            n0Var.i(obj);
        }
        if (i2 != n0Var.f77d) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        n0 n0Var = this.B;
        Object[] objArr = n0Var.f75b;
        int i2 = n0Var.f77d;
        long[] jArr = n0Var.f74a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j2 = jArr[i10];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j2) < 128) {
                            int i13 = (i10 << 3) + i12;
                            if (!zb.l.N(collection, objArr[i13])) {
                                n0Var.m(i13);
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        if (i2 == n0Var.f77d) {
            return false;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.A.f77d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return nc.j.b(this, objArr);
    }

    public final String toString() {
        return this.A.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return nc.j.a(this);
    }
}

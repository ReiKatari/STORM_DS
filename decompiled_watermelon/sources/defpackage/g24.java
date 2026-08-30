package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: g24  reason: default package */
/* loaded from: classes.dex */
public final class g24 implements j93, Set, f93 {
    public final e24 A;
    public final e24 B;

    public g24(e24 e24Var) {
        this.A = e24Var;
        this.B = e24Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.B.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        e24 e24Var = this.B;
        int i = e24Var.d;
        for (Object obj : collection) {
            e24Var.k(obj);
        }
        if (i != e24Var.d) {
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
        if (obj != null && g24.class == obj.getClass()) {
            return this.A.equals(((g24) obj).A);
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
        return new ll2(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.B.l(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        e24 e24Var = this.B;
        int i = e24Var.d;
        for (Object obj : collection) {
            e24Var.i(obj);
        }
        if (i != e24Var.d) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        e24 e24Var = this.B;
        Object[] objArr = e24Var.b;
        int i = e24Var.d;
        long[] jArr = e24Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!tq0.F0(collection, objArr[i5])) {
                                e24Var.m(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        if (i == e24Var.d) {
            return false;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.A.d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return b53.i0(this, objArr);
    }

    public final String toString() {
        return this.A.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return b53.h0(this);
    }
}

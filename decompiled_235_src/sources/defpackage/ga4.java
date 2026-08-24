package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ga4  reason: default package */
/* loaded from: classes.dex */
public final class ga4 implements dg3, Set, zf3 {
    public final ea4 A;
    public final ea4 B;

    public ga4(ea4 ea4Var) {
        ea4Var.getClass();
        this.A = ea4Var;
        this.B = ea4Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.B.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        ea4 ea4Var = this.B;
        ea4Var.getClass();
        int i = ea4Var.g;
        for (Object obj : collection) {
            int d = ea4Var.d(obj);
            ea4Var.b[d] = obj;
            long[] jArr = ea4Var.c;
            int i2 = ea4Var.d;
            jArr[d] = (i2 & 2147483647L) | 4611686016279904256L;
            if (i2 != Integer.MAX_VALUE) {
                jArr[i2] = ((d & 2147483647L) << 31) | (jArr[i2] & (-4611686016279904257L));
            }
            ea4Var.d = d;
            if (ea4Var.e == Integer.MAX_VALUE) {
                ea4Var.e = d;
            }
        }
        if (i != ea4Var.g) {
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
        if (obj != null && ga4.class == obj.getClass()) {
            return nb3.k(this.A, ((ga4) obj).A);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.A.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        if (this.A.g == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new rr2(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.B.g(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0084, code lost:
        r18 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008d, code lost:
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008f, code lost:
        r15 = -1;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean removeAll(Collection collection) {
        int i;
        int i2;
        int i3;
        collection.getClass();
        ea4 ea4Var = this.B;
        ea4Var.getClass();
        int i4 = ea4Var.g;
        Iterator it = collection.iterator();
        while (true) {
            int i5 = 1;
            int i6 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next != null) {
                i = next.hashCode();
            } else {
                i = 0;
            }
            int i7 = i * (-862048943);
            int i8 = i7 ^ (i7 << 16);
            int i9 = i8 & 127;
            int i10 = ea4Var.f;
            int i11 = (i8 >>> 7) & i10;
            while (true) {
                long[] jArr = ea4Var.a;
                int i12 = i11 >> 3;
                int i13 = (i11 & 7) << 3;
                long j = ((jArr[i12 + i5] << (64 - i13)) & ((-i13) >> 63)) | (jArr[i12] >>> i13);
                long j2 = (i9 * 72340172838076673L) ^ j;
                long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j3 == 0) {
                        break;
                    }
                    i3 = ((Long.numberOfTrailingZeros(j3) >> 3) + i11) & i10;
                    int i14 = i5;
                    if (nb3.k(ea4Var.b[i3], next)) {
                        break;
                    }
                    j3 &= j3 - 1;
                    i5 = i14;
                }
                i6 += 8;
                i11 = (i11 + i6) & i10;
                i5 = i2;
            }
            if (i3 >= 0) {
                ea4Var.h(i3);
            }
        }
        if (i4 != ea4Var.g) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        return this.B.i(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.A.g;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return nb3.c0(this, objArr);
    }

    public final String toString() {
        return this.A.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return nb3.b0(this);
    }
}

package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: a24  reason: default package */
/* loaded from: classes.dex */
public final class a24 implements j93, Set, f93 {
    public final y14 A;
    public final y14 B;

    public a24(y14 y14Var) {
        y14Var.getClass();
        this.A = y14Var;
        this.B = y14Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.B.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        y14 y14Var = this.B;
        y14Var.getClass();
        int i = y14Var.g;
        for (Object obj : collection) {
            int d = y14Var.d(obj);
            y14Var.b[d] = obj;
            long[] jArr = y14Var.c;
            int i2 = y14Var.d;
            jArr[d] = (i2 & 2147483647L) | 4611686016279904256L;
            if (i2 != Integer.MAX_VALUE) {
                jArr[i2] = ((d & 2147483647L) << 31) | (jArr[i2] & (-4611686016279904257L));
            }
            y14Var.d = d;
            if (y14Var.e == Integer.MAX_VALUE) {
                y14Var.e = d;
            }
        }
        if (i != y14Var.g) {
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
        if (obj != null && a24.class == obj.getClass()) {
            return b53.x(this.A, ((a24) obj).A);
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
        return new ll2(this);
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean removeAll(java.util.Collection r19) {
        /*
            r18 = this;
            r19.getClass()
            r0 = r19
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = r18
            y14 r1 = r1.B
            r1.getClass()
            int r2 = r1.g
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r3 = r0.hasNext()
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L9e
            java.lang.Object r3 = r0.next()
            if (r3 == 0) goto L27
            int r6 = r3.hashCode()
            goto L28
        L27:
            r6 = r5
        L28:
            r7 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r6 = r6 * r7
            int r7 = r6 << 16
            r6 = r6 ^ r7
            r7 = r6 & 127(0x7f, float:1.78E-43)
            int r8 = r1.f
            int r6 = r6 >>> 7
            r6 = r6 & r8
        L36:
            long[] r9 = r1.a
            int r10 = r6 >> 3
            r11 = r6 & 7
            int r11 = r11 << 3
            r12 = r9[r10]
            long r12 = r12 >>> r11
            int r10 = r10 + r4
            r14 = r9[r10]
            int r9 = 64 - r11
            long r9 = r14 << r9
            long r14 = (long) r11
            long r14 = -r14
            r11 = 63
            long r14 = r14 >> r11
            long r9 = r9 & r14
            long r9 = r9 | r12
            long r11 = (long) r7
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r11 = r11 * r13
            long r11 = r11 ^ r9
            long r13 = r11 - r13
            long r11 = ~r11
            long r11 = r11 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
        L61:
            r15 = 0
            int r17 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r17 == 0) goto L84
            int r15 = java.lang.Long.numberOfTrailingZeros(r11)
            int r15 = r15 >> 3
            int r15 = r15 + r6
            r15 = r15 & r8
            r18 = r4
            java.lang.Object[] r4 = r1.b
            r4 = r4[r15]
            boolean r4 = defpackage.b53.x(r4, r3)
            if (r4 == 0) goto L7c
            goto L90
        L7c:
            r15 = 1
            long r15 = r11 - r15
            long r11 = r11 & r15
            r4 = r18
            goto L61
        L84:
            r18 = r4
            long r11 = ~r9
            r4 = 6
            long r11 = r11 << r4
            long r9 = r9 & r11
            long r9 = r9 & r13
            int r4 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r4 == 0) goto L97
            r15 = -1
        L90:
            if (r15 < 0) goto L14
            r1.h(r15)
            goto L14
        L97:
            int r5 = r5 + 8
            int r6 = r6 + r5
            r6 = r6 & r8
            r4 = r18
            goto L36
        L9e:
            r18 = r4
            int r0 = r1.g
            if (r2 == r0) goto La5
            return r18
        La5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a24.removeAll(java.util.Collection):boolean");
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

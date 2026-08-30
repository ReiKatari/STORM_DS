package a1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l0 implements oc.e, Set, oc.a {
    public final i0 A;
    public final i0 B;

    public l0(i0 i0Var) {
        i0Var.getClass();
        this.A = i0Var;
        this.B = i0Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.B.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        i0 i0Var = this.B;
        i0Var.getClass();
        int i2 = i0Var.f54g;
        for (Object obj : collection) {
            int d4 = i0Var.d(obj);
            i0Var.f49b[d4] = obj;
            long[] jArr = i0Var.f50c;
            int i10 = i0Var.f51d;
            jArr[d4] = (i10 & 2147483647L) | 4611686016279904256L;
            if (i10 != Integer.MAX_VALUE) {
                jArr[i10] = ((d4 & 2147483647L) << 31) | (jArr[i10] & (-4611686016279904257L));
            }
            i0Var.f51d = d4;
            if (i0Var.f52e == Integer.MAX_VALUE) {
                i0Var.f52e = d4;
            }
        }
        if (i2 != i0Var.f54g) {
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
        if (obj != null && l0.class == obj.getClass()) {
            return nc.k.a(this.A, ((l0) obj).A);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.A.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        if (this.A.f54g == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new k0(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.B.g(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0091, code lost:
        if (((r5 & ((~r5) << 6)) & r12) == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0093, code lost:
        r14 = -1;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean removeAll(java.util.Collection r21) {
        /*
            r20 = this;
            r21.getClass()
            r0 = r21
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = r20
            a1.i0 r2 = r1.B
            r2.getClass()
            int r3 = r2.f54g
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r4 = r0.hasNext()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto La2
            java.lang.Object r4 = r0.next()
            if (r4 == 0) goto L27
            int r7 = r4.hashCode()
            goto L28
        L27:
            r7 = r6
        L28:
            r8 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r7 = r7 * r8
            int r8 = r7 << 16
            r7 = r7 ^ r8
            r8 = r7 & 127(0x7f, float:1.78E-43)
            int r9 = r2.f53f
            int r7 = r7 >>> 7
            r7 = r7 & r9
        L36:
            long[] r10 = r2.f48a
            int r11 = r7 >> 3
            r12 = r7 & 7
            int r12 = r12 << 3
            r13 = r10[r11]
            long r13 = r13 >>> r12
            int r11 = r11 + r5
            r15 = r10[r11]
            int r10 = 64 - r12
            long r10 = r15 << r10
            r21 = r5
            r15 = r6
            long r5 = (long) r12
            long r5 = -r5
            r12 = 63
            long r5 = r5 >> r12
            long r5 = r5 & r10
            long r5 = r5 | r13
            long r10 = (long) r8
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r10 = r10 * r12
            long r10 = r10 ^ r5
            long r12 = r10 - r12
            long r10 = ~r10
            long r10 = r10 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
        L64:
            r16 = 0
            int r14 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r14 == 0) goto L87
            int r14 = java.lang.Long.numberOfTrailingZeros(r10)
            int r14 = r14 >> 3
            int r14 = r14 + r7
            r14 = r14 & r9
            r18 = r12
            java.lang.Object[] r12 = r2.f49b
            r12 = r12[r14]
            boolean r12 = nc.k.a(r12, r4)
            if (r12 == 0) goto L7f
            goto L94
        L7f:
            r12 = 1
            long r12 = r10 - r12
            long r10 = r10 & r12
            r12 = r18
            goto L64
        L87:
            r18 = r12
            long r10 = ~r5
            r12 = 6
            long r10 = r10 << r12
            long r5 = r5 & r10
            long r5 = r5 & r18
            int r5 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r5 == 0) goto L9b
            r14 = -1
        L94:
            if (r14 < 0) goto L14
            r2.h(r14)
            goto L14
        L9b:
            int r6 = r15 + 8
            int r7 = r7 + r6
            r7 = r7 & r9
            r5 = r21
            goto L36
        La2:
            r21 = r5
            int r0 = r2.f54g
            if (r3 == r0) goto La9
            return r21
        La9:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.l0.removeAll(java.util.Collection):boolean");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        return this.B.i(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.A.f54g;
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

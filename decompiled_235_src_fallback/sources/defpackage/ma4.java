package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ma4  reason: default package */
/* loaded from: classes.dex */
public final class ma4 implements defpackage.dg3, java.util.Set, defpackage.zf3 {
    public final defpackage.ka4 A;
    public final defpackage.ka4 B;

    public ma4(defpackage.ka4 r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r1
            return
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(java.lang.Object r1) {
            r0 = this;
            ka4 r0 = r0.B
            boolean r0 = r0.a(r1)
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(java.util.Collection r3) {
            r2 = this;
            r3.getClass()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Collection r3 = (java.util.Collection) r3
            ka4 r2 = r2.B
            int r0 = r2.d
            java.util.Iterator r3 = r3.iterator()
        Lf:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r3.next()
            r2.k(r1)
            goto Lf
        L1d:
            int r2 = r2.d
            if (r0 == r2) goto L23
            r2 = 1
            return r2
        L23:
            r2 = 0
            return r2
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
            r0 = this;
            ka4 r0 = r0.B
            r0.b()
            return
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(java.lang.Object r1) {
            r0 = this;
            ka4 r0 = r0.A
            boolean r0 = r0.c(r1)
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(java.util.Collection r3) {
            r2 = this;
            r3.getClass()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r3.next()
            ka4 r1 = r2.A
            boolean r0 = r1.c(r0)
            if (r0 != 0) goto L9
            r2 = 0
            return r2
        L1d:
            r2 = 1
            return r2
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r2 = 1
            return r2
        L4:
            if (r3 == 0) goto L1a
            java.lang.Class<ma4> r0 = defpackage.ma4.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Lf
            goto L1a
        Lf:
            ma4 r3 = (defpackage.ma4) r3
            ka4 r2 = r2.A
            ka4 r3 = r3.A
            boolean r2 = r2.equals(r3)
            return r2
        L1a:
            r2 = 0
            return r2
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
            r0 = this;
            ka4 r0 = r0.A
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
            r0 = this;
            ka4 r0 = r0.A
            boolean r0 = r0.g()
            return r0
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r1 = this;
            rr2 r0 = new rr2
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object r1) {
            r0 = this;
            ka4 r0 = r0.B
            boolean r0 = r0.l(r1)
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(java.util.Collection r3) {
            r2 = this;
            r3.getClass()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            ka4 r2 = r2.B
            int r0 = r2.d
            java.util.Iterator r3 = r3.iterator()
        Ld:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r3.next()
            r2.i(r1)
            goto Ld
        L1b:
            int r2 = r2.d
            if (r0 == r2) goto L21
            r2 = 1
            return r2
        L21:
            r2 = 0
            return r2
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(java.util.Collection r17) {
            r16 = this;
            r17.getClass()
            r0 = r16
            ka4 r0 = r0.B
            java.lang.Object[] r1 = r0.b
            int r2 = r0.d
            long[] r3 = r0.a
            int r4 = r3.length
            int r4 = r4 + (-2)
            r5 = 0
            if (r4 < 0) goto L56
            r6 = r5
        L14:
            r7 = r3[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L51
            int r9 = r6 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = r5
        L2e:
            if (r11 >= r9) goto L4f
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.3E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L4b
            int r12 = r6 << 3
            int r12 = r12 + r11
            r13 = r17
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            r14 = r1[r12]
            boolean r13 = defpackage.gt0.C0(r13, r14)
            if (r13 != 0) goto L4b
            r0.m(r12)
        L4b:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L2e
        L4f:
            if (r9 != r10) goto L56
        L51:
            if (r6 == r4) goto L56
            int r6 = r6 + 1
            goto L14
        L56:
            int r0 = r0.d
            if (r2 == r0) goto L5c
            r0 = 1
            return r0
        L5c:
            return r5
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
            r0 = this;
            ka4 r0 = r0.A
            int r0 = r0.d
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray() {
            r0 = this;
            java.lang.Object[] r0 = defpackage.nb3.b0(r0)
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] r1) {
            r0 = this;
            r1.getClass()
            java.lang.Object[] r0 = defpackage.nb3.c0(r0, r1)
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            ka4 r0 = r0.A
            java.lang.String r0 = r0.toString()
            return r0
    }
}

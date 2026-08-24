package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ga4  reason: default package */
/* loaded from: classes.dex */
public final class ga4 implements defpackage.dg3, java.util.Set, defpackage.zf3 {
    public final defpackage.ea4 A;
    public final defpackage.ea4 B;

    public ga4(defpackage.ea4 r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.A = r1
            r0.B = r1
            return
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(java.lang.Object r1) {
            r0 = this;
            ea4 r0 = r0.B
            boolean r0 = r0.a(r1)
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(java.util.Collection r13) {
            r12 = this;
            r13.getClass()
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            ea4 r12 = r12.B
            r12.getClass()
            int r0 = r12.g
            java.util.Iterator r13 = r13.iterator()
        L10:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L52
            java.lang.Object r1 = r13.next()
            int r2 = r12.d(r1)
            java.lang.Object[] r3 = r12.b
            r3[r2] = r1
            long[] r1 = r12.c
            int r3 = r12.d
            long r4 = (long) r3
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r4 = r4 & r6
            r8 = 4611686016279904256(0x3fffffff80000000, double:1.9999995231628418)
            long r4 = r4 | r8
            r1[r2] = r4
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == r4) goto L49
            r8 = r1[r3]
            r10 = -4611686016279904257(0xc00000007fffffff, double:-2.000000953674316)
            long r8 = r8 & r10
            long r10 = (long) r2
            long r5 = r10 & r6
            r7 = 31
            long r5 = r5 << r7
            long r5 = r5 | r8
            r1[r3] = r5
        L49:
            r12.d = r2
            int r1 = r12.e
            if (r1 != r4) goto L10
            r12.e = r2
            goto L10
        L52:
            int r12 = r12.g
            if (r0 == r12) goto L58
            r12 = 1
            return r12
        L58:
            r12 = 0
            return r12
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
            r0 = this;
            ea4 r0 = r0.B
            r0.b()
            return
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(java.lang.Object r1) {
            r0 = this;
            ea4 r0 = r0.A
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
            ea4 r1 = r2.A
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
            java.lang.Class<ga4> r0 = defpackage.ga4.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Lf
            goto L1a
        Lf:
            ga4 r3 = (defpackage.ga4) r3
            ea4 r2 = r2.A
            ea4 r3 = r3.A
            boolean r2 = defpackage.nb3.k(r2, r3)
            return r2
        L1a:
            r2 = 0
            return r2
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
            r0 = this;
            ea4 r0 = r0.A
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
            r0 = this;
            ea4 r0 = r0.A
            int r0 = r0.g
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
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
            ea4 r0 = r0.B
            boolean r0 = r0.g(r1)
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(java.util.Collection r19) {
            r18 = this;
            r19.getClass()
            r0 = r19
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = r18
            ea4 r1 = r1.B
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
            boolean r4 = defpackage.nb3.k(r4, r3)
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
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(java.util.Collection r1) {
            r0 = this;
            r1.getClass()
            ea4 r0 = r0.B
            boolean r0 = r0.i(r1)
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
            r0 = this;
            ea4 r0 = r0.A
            int r0 = r0.g
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
            ea4 r0 = r0.A
            java.lang.String r0 = r0.toString()
            return r0
    }
}

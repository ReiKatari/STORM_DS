package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zu  reason: default package */
/* loaded from: classes.dex */
public final class zu implements java.util.Collection, java.util.Set, defpackage.ag3, defpackage.dg3 {
    public int[] A;
    public java.lang.Object[] B;
    public int L;

    public zu(int r2) {
            r1 = this;
            r1.<init>()
            int[] r0 = defpackage.g04.g
            r1.A = r0
            java.lang.Object[] r0 = defpackage.g04.i
            r1.B = r0
            if (r2 <= 0) goto L15
            int[] r0 = new int[r2]
            r1.A = r0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r1.B = r2
        L15:
            return
    }

    public final java.lang.Object a(int r10) {
            r9 = this;
            int r0 = r9.L
            java.lang.Object[] r1 = r9.B
            r2 = r1[r10]
            r3 = 1
            if (r0 > r3) goto Ld
            r9.clear()
            return r2
        Ld:
            int r3 = r0 + (-1)
            int[] r4 = r9.A
            int r5 = r4.length
            r6 = 0
            r7 = 8
            if (r5 <= r7) goto L45
            int r5 = r4.length
            int r5 = r5 / 3
            if (r0 >= r5) goto L45
            if (r0 <= r7) goto L22
            int r5 = r0 >> 1
            int r7 = r0 + r5
        L22:
            int[] r5 = new int[r7]
            r9.A = r5
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r9.B = r7
            if (r10 <= 0) goto L36
            r7 = 0
            r8 = 6
            defpackage.fv.v0(r7, r10, r8, r4, r5)
            java.lang.Object[] r5 = r9.B
            defpackage.fv.w0(r1, r5, r7, r10, r8)
        L36:
            if (r10 >= r3) goto L55
            int[] r5 = r9.A
            int r7 = r10 + 1
            defpackage.fv.r0(r10, r7, r0, r4, r5)
            java.lang.Object[] r4 = r9.B
            defpackage.fv.t0(r1, r4, r10, r7, r0)
            goto L55
        L45:
            if (r10 >= r3) goto L51
            int r1 = r10 + 1
            defpackage.fv.r0(r10, r1, r0, r4, r4)
            java.lang.Object[] r4 = r9.B
            defpackage.fv.t0(r4, r4, r10, r1, r0)
        L51:
            java.lang.Object[] r10 = r9.B
            r10[r3] = r6
        L55:
            int r10 = r9.L
            if (r0 != r10) goto L5c
            r9.L = r3
            return r2
        L5c:
            defpackage.i.l()
            return r6
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(java.lang.Object r11) {
            r10 = this;
            int r0 = r10.L
            r1 = 0
            if (r11 != 0) goto Lc
            r2 = 0
            int r2 = defpackage.q60.L(r10, r2, r1)
            r3 = r1
            goto L17
        Lc:
            int r2 = r11.hashCode()
            int r3 = defpackage.q60.L(r10, r11, r2)
            r9 = r3
            r3 = r2
            r2 = r9
        L17:
            if (r2 < 0) goto L1a
            return r1
        L1a:
            int r2 = ~r2
            int[] r4 = r10.A
            int r5 = r4.length
            if (r0 < r5) goto L4f
            r5 = 8
            if (r0 < r5) goto L28
            int r5 = r0 >> 1
            int r5 = r5 + r0
            goto L2d
        L28:
            r6 = 4
            if (r0 < r6) goto L2c
            goto L2d
        L2c:
            r5 = r6
        L2d:
            java.lang.Object[] r6 = r10.B
            int[] r7 = new int[r5]
            r10.A = r7
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r10.B = r5
            int r5 = r10.L
            if (r0 != r5) goto L4b
            int r5 = r7.length
            if (r5 != 0) goto L3f
            goto L4f
        L3f:
            int r5 = r4.length
            r8 = 6
            defpackage.fv.v0(r1, r5, r8, r4, r7)
            java.lang.Object[] r4 = r10.B
            int r5 = r6.length
            defpackage.fv.w0(r6, r4, r1, r5, r8)
            goto L4f
        L4b:
            defpackage.i.l()
            return r1
        L4f:
            if (r2 >= r0) goto L5d
            int[] r4 = r10.A
            int r5 = r2 + 1
            defpackage.fv.r0(r5, r2, r0, r4, r4)
            java.lang.Object[] r4 = r10.B
            defpackage.fv.t0(r4, r4, r5, r2, r0)
        L5d:
            int r4 = r10.L
            if (r0 != r4) goto L71
            int[] r0 = r10.A
            int r5 = r0.length
            if (r2 >= r5) goto L71
            r0[r2] = r3
            java.lang.Object[] r0 = r10.B
            r0[r2] = r11
            r11 = 1
            int r4 = r4 + r11
            r10.L = r4
            return r11
        L71:
            defpackage.i.l()
            return r1
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(java.util.Collection r7) {
            r6 = this;
            r7.getClass()
            int r0 = r6.L
            int r1 = r7.size()
            int r1 = r1 + r0
            int r0 = r6.L
            int[] r2 = r6.A
            int r3 = r2.length
            r4 = 0
            if (r3 >= r1) goto L29
            java.lang.Object[] r3 = r6.B
            int[] r5 = new int[r1]
            r6.A = r5
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r6.B = r1
            if (r0 <= 0) goto L29
            r1 = 6
            defpackage.fv.v0(r4, r0, r1, r2, r5)
            java.lang.Object[] r2 = r6.B
            int r5 = r6.L
            defpackage.fv.w0(r3, r2, r4, r5, r1)
        L29:
            int r1 = r6.L
            if (r1 != r0) goto L42
            java.util.Iterator r7 = r7.iterator()
        L31:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L41
            java.lang.Object r0 = r7.next()
            boolean r0 = r6.add(r0)
            r4 = r4 | r0
            goto L31
        L41:
            return r4
        L42:
            defpackage.i.l()
            return r4
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
            r1 = this;
            int r0 = r1.L
            if (r0 == 0) goto Lf
            int[] r0 = defpackage.g04.g
            r1.A = r0
            java.lang.Object[] r0 = defpackage.g04.i
            r1.B = r0
            r0 = 0
            r1.L = r0
        Lf:
            int r1 = r1.L
            if (r1 != 0) goto L14
            return
        L14:
            defpackage.i.l()
            return
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L9
            r3 = 0
            int r2 = defpackage.q60.L(r2, r3, r0)
            goto L11
        L9:
            int r1 = r3.hashCode()
            int r2 = defpackage.q60.L(r2, r3, r1)
        L11:
            if (r2 < 0) goto L15
            r2 = 1
            return r2
        L15:
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(java.util.Collection r2) {
            r1 = this;
            r2.getClass()
            java.util.Iterator r2 = r2.iterator()
        L7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L19
            java.lang.Object r0 = r2.next()
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L7
            r1 = 0
            return r1
        L19:
            r1 = 1
            return r1
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof java.util.Set
            r2 = 0
            if (r1 == 0) goto L2c
            int r1 = r6.L
            r3 = r7
            java.util.Set r3 = (java.util.Set) r3
            int r3 = r3.size()
            if (r1 == r3) goto L15
            return r2
        L15:
            int r1 = r6.L     // Catch: java.lang.Throwable -> L2c
            r3 = r2
        L18:
            if (r3 >= r1) goto L2b
            java.lang.Object[] r4 = r6.B     // Catch: java.lang.Throwable -> L2c
            r4 = r4[r3]     // Catch: java.lang.Throwable -> L2c
            r5 = r7
            java.util.Set r5 = (java.util.Set) r5     // Catch: java.lang.Throwable -> L2c
            boolean r4 = r5.contains(r4)     // Catch: java.lang.Throwable -> L2c
            if (r4 != 0) goto L28
            return r2
        L28:
            int r3 = r3 + 1
            goto L18
        L2b:
            return r0
        L2c:
            return r2
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
            r4 = this;
            int[] r0 = r4.A
            int r4 = r4.L
            r1 = 0
            r2 = r1
        L6:
            if (r1 >= r4) goto Le
            r3 = r0[r1]
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L6
        Le:
            return r2
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
            r0 = this;
            int r0 = r0.L
            if (r0 > 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
            r1 = this;
            su r0 = new su
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L9
            r3 = 0
            int r3 = defpackage.q60.L(r2, r3, r0)
            goto L11
        L9:
            int r1 = r3.hashCode()
            int r3 = defpackage.q60.L(r2, r3, r1)
        L11:
            if (r3 < 0) goto L18
            r2.a(r3)
            r2 = 1
            return r2
        L18:
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(java.util.Collection r3) {
            r2 = this;
            r3.getClass()
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        L8:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r3.next()
            boolean r1 = r2.remove(r1)
            r0 = r0 | r1
            goto L8
        L18:
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(java.util.Collection r6) {
            r5 = this;
            r6.getClass()
            int r0 = r5.L
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
        L8:
            r3 = -1
            if (r3 >= r0) goto L1f
            r3 = r6
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.lang.Object[] r4 = r5.B
            r4 = r4[r0]
            boolean r3 = defpackage.gt0.C0(r3, r4)
            if (r3 != 0) goto L1c
            r5.a(r0)
            r2 = r1
        L1c:
            int r0 = r0 + (-1)
            goto L8
        L1f:
            return r2
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
            r0 = this;
            int r0 = r0.L
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public final java.lang.Object[] toArray() {
            r2 = this;
            java.lang.Object[] r0 = r2.B
            r1 = 0
            int r2 = r2.L
            java.lang.Object[] r2 = defpackage.fv.y0(r0, r1, r2)
            return r2
    }

    @Override // java.util.Collection, java.util.Set
    public final java.lang.Object[] toArray(java.lang.Object[] r3) {
            r2 = this;
            r3.getClass()
            int r0 = r2.L
            int r1 = r3.length
            if (r1 >= r0) goto L17
            java.lang.Class r3 = r3.getClass()
            java.lang.Class r3 = r3.getComponentType()
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r3, r0)
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            goto L1d
        L17:
            int r1 = r3.length
            if (r1 <= r0) goto L1d
            r1 = 0
            r3[r0] = r1
        L1d:
            java.lang.Object[] r0 = r2.B
            int r2 = r2.L
            r1 = 0
            defpackage.fv.t0(r0, r3, r1, r1, r2)
            return r3
    }

    public final java.lang.String toString() {
            r4 = this;
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L9
            java.lang.String r4 = "{}"
            return r4
        L9:
            int r0 = r4.L
            int r0 = r0 * 14
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r0 = 123(0x7b, float:1.72E-43)
            r1.append(r0)
            int r0 = r4.L
            r2 = 0
        L1a:
            if (r2 >= r0) goto L35
            if (r2 <= 0) goto L23
            java.lang.String r3 = ", "
            r1.append(r3)
        L23:
            java.lang.Object[] r3 = r4.B
            r3 = r3[r2]
            if (r3 == r4) goto L2d
            r1.append(r3)
            goto L32
        L2d:
            java.lang.String r3 = "(this Set)"
            r1.append(r3)
        L32:
            int r2 = r2 + 1
            goto L1a
        L35:
            r4 = 125(0x7d, float:1.75E-43)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            return r4
    }
}

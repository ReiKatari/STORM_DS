package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p04  reason: default package */
/* loaded from: classes.dex */
public final class p04 implements java.util.Map, java.io.Serializable, defpackage.cg3 {
    public static final defpackage.p04 j0 = null;
    public java.lang.Object[] A;
    public java.lang.Object[] B;
    public int[] L;
    public int[] R;
    public int X;
    public int Y;
    public int Z;
    public int d0;
    public int e0;
    public defpackage.q04 f0;
    public defpackage.r04 g0;
    public defpackage.q04 h0;
    public boolean i0;

    static {
            p04 r0 = new p04
            r1 = 0
            r0.<init>(r1)
            r1 = 1
            r0.i0 = r1
            defpackage.p04.j0 = r0
            return
    }

    public p04() {
            r1 = this;
            r0 = 8
            r1.<init>(r0)
            return
    }

    public p04(int r5) {
            r4 = this;
            if (r5 < 0) goto L2c
            java.lang.Object[] r0 = new java.lang.Object[r5]
            int[] r1 = new int[r5]
            r2 = 1
            if (r5 >= r2) goto La
            r5 = r2
        La:
            int r5 = r5 * 3
            int r5 = java.lang.Integer.highestOneBit(r5)
            int[] r3 = new int[r5]
            r4.<init>()
            r4.A = r0
            r0 = 0
            r4.B = r0
            r4.L = r1
            r4.R = r3
            r0 = 2
            r4.X = r0
            r0 = 0
            r4.Y = r0
            int r5 = java.lang.Integer.numberOfLeadingZeros(r5)
            int r5 = r5 + r2
            r4.Z = r5
            return
        L2c:
            java.lang.String r4 = "capacity must be non-negative."
            defpackage.i.h(r4)
            r4 = 0
            throw r4
    }

    public final int a(java.lang.Object r8) {
            r7 = this;
            r7.c()
        L3:
            int r0 = r7.i(r8)
            int r1 = r7.X
            int r1 = r1 * 2
            int[] r2 = r7.R
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L13
            r1 = r2
        L13:
            r2 = 0
        L14:
            int[] r3 = r7.R
            r4 = r3[r0]
            r5 = 1
            if (r4 != 0) goto L43
            int r1 = r7.Y
            java.lang.Object[] r4 = r7.A
            int r6 = r4.length
            if (r1 < r6) goto L26
            r7.f(r5)
            goto L3
        L26:
            int r6 = r1 + 1
            r7.Y = r6
            r4[r1] = r8
            int[] r8 = r7.L
            r8[r1] = r0
            r3[r0] = r6
            int r8 = r7.e0
            int r8 = r8 + r5
            r7.e0 = r8
            int r8 = r7.d0
            int r8 = r8 + r5
            r7.d0 = r8
            int r8 = r7.X
            if (r2 <= r8) goto L42
            r7.X = r2
        L42:
            return r1
        L43:
            java.lang.Object[] r3 = r7.A
            int r6 = r4 + (-1)
            r3 = r3[r6]
            boolean r3 = defpackage.nb3.k(r3, r8)
            if (r3 == 0) goto L51
            int r7 = -r4
            return r7
        L51:
            int r2 = r2 + 1
            if (r2 <= r1) goto L5e
            int[] r0 = r7.R
            int r0 = r0.length
            int r0 = r0 * 2
            r7.j(r0)
            goto L3
        L5e:
            int r3 = r0 + (-1)
            if (r0 != 0) goto L67
            int[] r0 = r7.R
            int r0 = r0.length
            int r0 = r0 - r5
            goto L14
        L67:
            r0 = r3
            goto L14
    }

    public final defpackage.p04 b() {
            r1 = this;
            r1.c()
            r0 = 1
            r1.i0 = r0
            int r0 = r1.e0
            if (r0 <= 0) goto Lb
            return r1
        Lb:
            p04 r1 = defpackage.p04.j0
            r1.getClass()
            return r1
    }

    public final void c() {
            r0 = this;
            boolean r0 = r0.i0
            if (r0 != 0) goto L5
            return
        L5:
            defpackage.e41.t()
            return
    }

    @Override // java.util.Map
    public final void clear() {
            r6 = this;
            r6.c()
            int r0 = r6.Y
            int r0 = r0 + (-1)
            r1 = 0
            if (r0 < 0) goto L1d
            r2 = r1
        Lb:
            int[] r3 = r6.L
            r4 = r3[r2]
            if (r4 < 0) goto L18
            int[] r5 = r6.R
            r5[r4] = r1
            r4 = -1
            r3[r2] = r4
        L18:
            if (r2 == r0) goto L1d
            int r2 = r2 + 1
            goto Lb
        L1d:
            java.lang.Object[] r0 = r6.A
            int r2 = r6.Y
            defpackage.qo2.L(r0, r1, r2)
            java.lang.Object[] r0 = r6.B
            if (r0 == 0) goto L2d
            int r2 = r6.Y
            defpackage.qo2.L(r0, r1, r2)
        L2d:
            r6.e0 = r1
            r6.Y = r1
            int r0 = r6.d0
            int r0 = r0 + 1
            r6.d0 = r0
            return
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object r1) {
            r0 = this;
            int r0 = r0.g(r1)
            if (r0 < 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object r1) {
            r0 = this;
            int r0 = r0.h(r1)
            if (r0 < 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public final void d(boolean r8) {
            r7 = this;
            java.lang.Object[] r0 = r7.B
            r1 = 0
            r2 = r1
        L4:
            int r3 = r7.Y
            if (r1 >= r3) goto L29
            int[] r3 = r7.L
            r4 = r3[r1]
            if (r4 < 0) goto L26
            java.lang.Object[] r5 = r7.A
            r6 = r5[r1]
            r5[r2] = r6
            if (r0 == 0) goto L1a
            r5 = r0[r1]
            r0[r2] = r5
        L1a:
            if (r8 == 0) goto L24
            r3[r2] = r4
            int[] r3 = r7.R
            int r5 = r2 + 1
            r3[r4] = r5
        L24:
            int r2 = r2 + 1
        L26:
            int r1 = r1 + 1
            goto L4
        L29:
            java.lang.Object[] r8 = r7.A
            defpackage.qo2.L(r8, r2, r3)
            if (r0 == 0) goto L35
            int r8 = r7.Y
            defpackage.qo2.L(r0, r2, r8)
        L35:
            r7.Y = r2
            return
    }

    public final boolean e(java.util.Collection r5) {
            r4 = this;
            r5.getClass()
            java.util.Iterator r5 = r5.iterator()
        L7:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r0 = r5.next()
            r1 = 0
            if (r0 == 0) goto L33
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.ClassCastException -> L33
            java.lang.Object r2 = r0.getKey()     // Catch: java.lang.ClassCastException -> L33
            int r2 = r4.g(r2)     // Catch: java.lang.ClassCastException -> L33
            if (r2 >= 0) goto L22
            r0 = r1
            goto L31
        L22:
            java.lang.Object[] r3 = r4.B     // Catch: java.lang.ClassCastException -> L33
            r3.getClass()     // Catch: java.lang.ClassCastException -> L33
            r2 = r3[r2]     // Catch: java.lang.ClassCastException -> L33
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.ClassCastException -> L33
            boolean r0 = defpackage.nb3.k(r2, r0)     // Catch: java.lang.ClassCastException -> L33
        L31:
            if (r0 != 0) goto L7
        L33:
            return r1
        L34:
            r4 = 1
            return r4
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
            r2 = this;
            q04 r0 = r2.h0
            if (r0 != 0) goto Lc
            q04 r0 = new q04
            r1 = 0
            r0.<init>(r2, r1)
            r2.h0 = r0
        Lc:
            return r0
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 == r2) goto L1f
            boolean r0 = r3 instanceof java.util.Map
            if (r0 == 0) goto L1d
            java.util.Map r3 = (java.util.Map) r3
            int r0 = r2.e0
            int r1 = r3.size()
            if (r0 != r1) goto L1d
            java.util.Set r3 = r3.entrySet()
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r2 = r2.e(r3)
            if (r2 == 0) goto L1d
            goto L1f
        L1d:
            r2 = 0
            return r2
        L1f:
            r2 = 1
            return r2
    }

    public final void f(int r6) {
            r5 = this;
            java.lang.Object[] r0 = r5.A
            int r1 = r0.length
            int r2 = r5.Y
            int r1 = r1 - r2
            int r3 = r5.e0
            int r3 = r2 - r3
            r4 = 1
            if (r1 >= r6) goto L19
            int r1 = r1 + r3
            if (r1 < r6) goto L19
            int r1 = r0.length
            int r1 = r1 / 4
            if (r3 < r1) goto L19
            r5.d(r4)
            return
        L19:
            int r2 = r2 + r6
            if (r2 < 0) goto L63
            int r6 = r0.length
            if (r2 <= r6) goto L62
            int r6 = r0.length
            int r1 = r6 >> 1
            int r6 = r6 + r1
            int r1 = r6 - r2
            if (r1 >= 0) goto L28
            r6 = r2
        L28:
            r1 = 2147483639(0x7ffffff7, float:NaN)
            int r3 = r6 - r1
            if (r3 <= 0) goto L36
            if (r2 <= r1) goto L35
            r6 = 2147483647(0x7fffffff, float:NaN)
            goto L36
        L35:
            r6 = r1
        L36:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r6)
            r5.A = r0
            java.lang.Object[] r0 = r5.B
            if (r0 == 0) goto L45
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r6)
            goto L46
        L45:
            r0 = 0
        L46:
            r5.B = r0
            int[] r0 = r5.L
            int[] r0 = java.util.Arrays.copyOf(r0, r6)
            r5.L = r0
            if (r6 >= r4) goto L53
            goto L54
        L53:
            r4 = r6
        L54:
            int r4 = r4 * 3
            int r6 = java.lang.Integer.highestOneBit(r4)
            int[] r0 = r5.R
            int r0 = r0.length
            if (r6 <= r0) goto L62
            r5.j(r6)
        L62:
            return
        L63:
            java.lang.OutOfMemoryError r5 = new java.lang.OutOfMemoryError
            r5.<init>()
            throw r5
    }

    public final int g(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.i(r6)
            int r1 = r5.X
        L6:
            int[] r2 = r5.R
            r2 = r2[r0]
            r3 = -1
            if (r2 != 0) goto Le
            return r3
        Le:
            java.lang.Object[] r4 = r5.A
            int r2 = r2 + (-1)
            r4 = r4[r2]
            boolean r4 = defpackage.nb3.k(r4, r6)
            if (r4 == 0) goto L1b
            return r2
        L1b:
            int r1 = r1 + r3
            if (r1 >= 0) goto L1f
            return r3
        L1f:
            int r2 = r0 + (-1)
            if (r0 != 0) goto L29
            int[] r0 = r5.R
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L6
        L29:
            r0 = r2
            goto L6
    }

    @Override // java.util.Map
    public final java.lang.Object get(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.g(r1)
            if (r1 >= 0) goto L8
            r0 = 0
            return r0
        L8:
            java.lang.Object[] r0 = r0.B
            r0.getClass()
            r0 = r0[r1]
            return r0
    }

    public final int h(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.Y
        L2:
            r1 = -1
            int r0 = r0 + r1
            if (r0 < 0) goto L1a
            int[] r1 = r2.L
            r1 = r1[r0]
            if (r1 < 0) goto L2
            java.lang.Object[] r1 = r2.B
            r1.getClass()
            r1 = r1[r0]
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 == 0) goto L2
            return r0
        L1a:
            return r1
    }

    @Override // java.util.Map
    public final int hashCode() {
            r5 = this;
            m04 r0 = new m04
            r1 = 0
            r0.<init>(r5, r1)
            r5 = r1
        L7:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L44
            int r2 = r0.A
            java.lang.Object r3 = r0.R
            p04 r3 = (defpackage.p04) r3
            int r4 = r3.Y
            if (r2 >= r4) goto L40
            int r4 = r2 + 1
            r0.A = r4
            r0.B = r2
            java.lang.Object[] r4 = r3.A
            r2 = r4[r2]
            if (r2 == 0) goto L28
            int r2 = r2.hashCode()
            goto L29
        L28:
            r2 = r1
        L29:
            java.lang.Object[] r3 = r3.B
            r3.getClass()
            int r4 = r0.B
            r3 = r3[r4]
            if (r3 == 0) goto L39
            int r3 = r3.hashCode()
            goto L3a
        L39:
            r3 = r1
        L3a:
            r2 = r2 ^ r3
            r0.e()
            int r5 = r5 + r2
            goto L7
        L40:
            defpackage.fa6.c()
            return r1
        L44:
            return r5
    }

    public final int i(java.lang.Object r2) {
            r1 = this;
            if (r2 == 0) goto L7
            int r2 = r2.hashCode()
            goto L8
        L7:
            r2 = 0
        L8:
            r0 = -1640531527(0xffffffff9e3779b9, float:-9.713111E-21)
            int r2 = r2 * r0
            int r1 = r1.Z
            int r1 = r2 >>> r1
            return r1
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
            r0 = this;
            int r0 = r0.e0
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final void j(int r6) {
            r5 = this;
            int r0 = r5.d0
            int r0 = r0 + 1
            r5.d0 = r0
            int r0 = r5.Y
            int r1 = r5.e0
            r2 = 0
            if (r0 <= r1) goto L10
            r5.d(r2)
        L10:
            int[] r0 = new int[r6]
            r5.R = r0
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.Z = r6
        L1c:
            int r6 = r5.Y
            if (r2 >= r6) goto L4d
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.A
            r0 = r0[r2]
            int r0 = r5.i(r0)
            int r1 = r5.X
        L2c:
            int[] r3 = r5.R
            r4 = r3[r0]
            if (r4 != 0) goto L3a
            r3[r0] = r6
            int[] r1 = r5.L
            r1[r2] = r0
            r2 = r6
            goto L1c
        L3a:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L48
            int r4 = r0 + (-1)
            if (r0 != 0) goto L46
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L2c
        L46:
            r0 = r4
            goto L2c
        L48:
            java.lang.String r5 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            defpackage.i.m(r5)
        L4d:
            return
    }

    public final void k(int r10) {
            r9 = this;
            java.lang.Object[] r0 = r9.A
            r0.getClass()
            r1 = 0
            r0[r10] = r1
            java.lang.Object[] r0 = r9.B
            if (r0 == 0) goto Le
            r0[r10] = r1
        Le:
            int[] r0 = r9.L
            r0 = r0[r10]
            r1 = 0
        L13:
            r2 = r0
            r3 = r1
        L15:
            int r4 = r0 + (-1)
            if (r0 != 0) goto L1f
            int[] r0 = r9.R
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L20
        L1f:
            r0 = r4
        L20:
            int[] r4 = r9.R
            r5 = r4[r0]
            int r3 = r3 + 1
            int r6 = r9.X
            if (r3 <= r6) goto L2d
            r4[r2] = r1
            goto L31
        L2d:
            if (r5 != 0) goto L42
            r4[r2] = r1
        L31:
            int[] r0 = r9.L
            r1 = -1
            r0[r10] = r1
            int r10 = r9.e0
            int r10 = r10 + r1
            r9.e0 = r10
            int r10 = r9.d0
            int r10 = r10 + 1
            r9.d0 = r10
            return
        L42:
            java.lang.Object[] r4 = r9.A
            int r6 = r5 + (-1)
            r4 = r4[r6]
            int r4 = r9.i(r4)
            int r4 = r4 - r0
            int[] r7 = r9.R
            int r8 = r7.length
            int r8 = r8 + (-1)
            r4 = r4 & r8
            if (r4 < r3) goto L15
            r7[r2] = r5
            int[] r3 = r9.L
            r3[r6] = r2
            goto L13
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
            r2 = this;
            q04 r0 = r2.f0
            if (r0 != 0) goto Lc
            q04 r0 = new q04
            r1 = 1
            r0.<init>(r2, r1)
            r2.f0 = r0
        Lc:
            return r0
    }

    @Override // java.util.Map
    public final java.lang.Object put(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            r2.c()
            int r3 = r2.a(r3)
            java.lang.Object[] r0 = r2.B
            r1 = 0
            if (r0 == 0) goto Ld
            goto L16
        Ld:
            java.lang.Object[] r0 = r2.A
            int r0 = r0.length
            if (r0 < 0) goto L23
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2.B = r0
        L16:
            if (r3 >= 0) goto L20
            int r2 = -r3
            int r2 = r2 + (-1)
            r3 = r0[r2]
            r0[r2] = r4
            return r3
        L20:
            r0[r3] = r4
            return r1
        L23:
            java.lang.String r2 = "capacity must be non-negative."
            defpackage.i.h(r2)
            return r1
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map r6) {
            r5 = this;
            r6.getClass()
            r5.c()
            java.util.Set r6 = r6.entrySet()
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L13
            goto L64
        L13:
            int r0 = r6.size()
            r5.f(r0)
            java.util.Iterator r6 = r6.iterator()
        L1e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L64
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            int r1 = r5.a(r1)
            java.lang.Object[] r2 = r5.B
            if (r2 == 0) goto L37
            goto L40
        L37:
            java.lang.Object[] r2 = r5.A
            int r2 = r2.length
            if (r2 < 0) goto L5f
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r5.B = r2
        L40:
            if (r1 < 0) goto L49
            java.lang.Object r0 = r0.getValue()
            r2[r1] = r0
            goto L1e
        L49:
            int r1 = -r1
            int r1 = r1 + (-1)
            r3 = r2[r1]
            java.lang.Object r4 = r0.getValue()
            boolean r3 = defpackage.nb3.k(r4, r3)
            if (r3 != 0) goto L1e
            java.lang.Object r0 = r0.getValue()
            r2[r1] = r0
            goto L1e
        L5f:
            java.lang.String r5 = "capacity must be non-negative."
            defpackage.i.h(r5)
        L64:
            return
    }

    @Override // java.util.Map
    public final java.lang.Object remove(java.lang.Object r2) {
            r1 = this;
            r1.c()
            int r2 = r1.g(r2)
            if (r2 >= 0) goto Lb
            r1 = 0
            return r1
        Lb:
            java.lang.Object[] r0 = r1.B
            r0.getClass()
            r0 = r0[r2]
            r1.k(r2)
            return r0
    }

    @Override // java.util.Map
    public final int size() {
            r0 = this;
            int r0 = r0.e0
            return r0
    }

    public final java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r6.e0
            int r1 = r1 * 3
            int r1 = r1 + 2
            r0.<init>(r1)
            java.lang.String r1 = "{"
            r0.append(r1)
            m04 r1 = new m04
            r2 = 0
            r1.<init>(r6, r2)
        L16:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L64
            if (r2 <= 0) goto L23
            java.lang.String r6 = ", "
            r0.append(r6)
        L23:
            int r6 = r1.A
            java.lang.Object r3 = r1.R
            p04 r3 = (defpackage.p04) r3
            int r4 = r3.Y
            if (r6 >= r4) goto L5f
            int r4 = r6 + 1
            r1.A = r4
            r1.B = r6
            java.lang.Object[] r4 = r3.A
            r6 = r4[r6]
            java.lang.String r4 = "(this Map)"
            if (r6 != r3) goto L3f
            r0.append(r4)
            goto L42
        L3f:
            r0.append(r6)
        L42:
            r6 = 61
            r0.append(r6)
            java.lang.Object[] r6 = r3.B
            r6.getClass()
            int r5 = r1.B
            r6 = r6[r5]
            if (r6 != r3) goto L56
            r0.append(r4)
            goto L59
        L56:
            r0.append(r6)
        L59:
            r1.e()
            int r2 = r2 + 1
            goto L16
        L5f:
            defpackage.fa6.c()
            r6 = 0
            return r6
        L64:
            java.lang.String r6 = "}"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            return r6
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
            r2 = this;
            r04 r0 = r2.g0
            if (r0 != 0) goto Lc
            r04 r0 = new r04
            r1 = 0
            r0.<init>(r2, r1)
            r2.g0 = r0
        Lc:
            return r0
    }
}

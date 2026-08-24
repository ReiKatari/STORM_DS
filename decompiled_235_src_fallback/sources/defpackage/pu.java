package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pu  reason: default package */
/* loaded from: classes.dex */
public final class pu extends defpackage.d1 {
    public static final java.lang.Object[] R = null;
    public int A;
    public java.lang.Object[] B;
    public int L;

    static {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            defpackage.pu.R = r0
            return
    }

    public pu() {
            r1 = this;
            r1.<init>()
            java.lang.Object[] r0 = defpackage.pu.R
            r1.B = r0
            return
    }

    public pu(int r1) {
            r0 = this;
            r0.<init>()
            if (r1 != 0) goto L8
            java.lang.Object[] r1 = defpackage.pu.R
            goto Lc
        L8:
            if (r1 <= 0) goto Lf
            java.lang.Object[] r1 = new java.lang.Object[r1]
        Lc:
            r0.B = r1
            return
        Lf:
            java.lang.String r0 = "Illegal Capacity: "
            java.lang.String r0 = defpackage.lb1.g(r1, r0)
            defpackage.i.h(r0)
            r0 = 0
            throw r0
    }

    public pu(java.util.List r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object[] r2 = r2.toArray(r0)
            r1.B = r2
            int r0 = r2.length
            r1.L = r0
            int r2 = r2.length
            if (r2 != 0) goto L16
            java.lang.Object[] r2 = defpackage.pu.R
            r1.B = r2
        L16:
            return
    }

    @Override // defpackage.d1
    public final int a() {
            r0 = this;
            int r0 = r0.L
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int r8, java.lang.Object r9) {
            r7 = this;
            int r0 = r7.L
            if (r8 < 0) goto L9b
            if (r8 > r0) goto L9b
            if (r8 != r0) goto Lc
            r7.addLast(r9)
            return
        Lc:
            if (r8 != 0) goto L12
            r7.addFirst(r9)
            return
        L12:
            r7.m()
            int r0 = r7.L
            r1 = 1
            int r0 = r0 + r1
            r7.d(r0)
            int r0 = r7.A
            int r0 = r0 + r8
            int r0 = r7.l(r0)
            int r2 = r7.L
            int r3 = r2 + 1
            int r3 = r3 >> r1
            r4 = 0
            if (r8 >= r3) goto L6e
            if (r0 != 0) goto L35
            java.lang.Object[] r8 = r7.B
            r8.getClass()
            int r8 = r8.length
            int r8 = r8 - r1
            goto L37
        L35:
            int r8 = r0 + (-1)
        L37:
            int r0 = r7.A
            if (r0 != 0) goto L41
            java.lang.Object[] r0 = r7.B
            r0.getClass()
            int r0 = r0.length
        L41:
            int r0 = r0 - r1
            int r2 = r7.A
            java.lang.Object[] r3 = r7.B
            if (r8 < r2) goto L54
            r4 = r3[r2]
            r3[r0] = r4
            int r4 = r2 + 1
            int r5 = r8 + 1
            defpackage.fv.t0(r3, r3, r2, r4, r5)
            goto L67
        L54:
            int r5 = r2 + (-1)
            int r6 = r3.length
            defpackage.fv.t0(r3, r3, r5, r2, r6)
            java.lang.Object[] r2 = r7.B
            int r3 = r2.length
            int r3 = r3 - r1
            r5 = r2[r4]
            r2[r3] = r5
            int r3 = r8 + 1
            defpackage.fv.t0(r2, r2, r4, r1, r3)
        L67:
            java.lang.Object[] r2 = r7.B
            r2[r8] = r9
            r7.A = r0
            goto L95
        L6e:
            int r8 = r7.A
            int r2 = r2 + r8
            int r8 = r7.l(r2)
            java.lang.Object[] r2 = r7.B
            if (r0 >= r8) goto L7f
            int r3 = r0 + 1
            defpackage.fv.t0(r2, r2, r3, r0, r8)
            goto L91
        L7f:
            defpackage.fv.t0(r2, r2, r1, r4, r8)
            java.lang.Object[] r8 = r7.B
            int r2 = r8.length
            int r2 = r2 - r1
            r2 = r8[r2]
            r8[r4] = r2
            int r2 = r0 + 1
            int r3 = r8.length
            int r3 = r3 - r1
            defpackage.fv.t0(r8, r8, r2, r0, r3)
        L91:
            java.lang.Object[] r8 = r7.B
            r8[r0] = r9
        L95:
            int r8 = r7.L
            int r8 = r8 + r1
            r7.L = r8
            return
        L9b:
            java.lang.String r7 = "index: "
            java.lang.String r9 = ", size: "
            java.lang.String r7 = defpackage.lb1.j(r7, r8, r0, r9)
            defpackage.e41.q(r7)
            return
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object r1) {
            r0 = this;
            r0.addLast(r1)
            r0 = 1
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int r9, java.util.Collection r10) {
            r8 = this;
            r10.getClass()
            int r0 = r8.L
            r1 = 0
            if (r9 < 0) goto Ld1
            if (r9 > r0) goto Ld1
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L11
            return r1
        L11:
            int r0 = r8.L
            if (r9 != r0) goto L1a
            boolean r8 = r8.addAll(r10)
            return r8
        L1a:
            r8.m()
            int r0 = r8.L
            int r2 = r10.size()
            int r2 = r2 + r0
            r8.d(r2)
            int r0 = r8.A
            int r2 = r8.L
            int r2 = r2 + r0
            int r0 = r8.l(r2)
            int r2 = r8.A
            int r2 = r2 + r9
            int r2 = r8.l(r2)
            int r3 = r10.size()
            int r4 = r8.L
            r5 = 1
            int r4 = r4 + r5
            int r4 = r4 >> r5
            if (r9 >= r4) goto L8d
            int r9 = r8.A
            int r0 = r9 - r3
            java.lang.Object[] r4 = r8.B
            if (r2 < r9) goto L6a
            if (r0 < 0) goto L50
            defpackage.fv.t0(r4, r4, r0, r9, r2)
            goto L82
        L50:
            int r6 = r4.length
            int r0 = r0 + r6
            int r6 = r2 - r9
            int r7 = r4.length
            int r7 = r7 - r0
            if (r7 < r6) goto L5c
            defpackage.fv.t0(r4, r4, r0, r9, r2)
            goto L82
        L5c:
            int r6 = r9 + r7
            defpackage.fv.t0(r4, r4, r0, r9, r6)
            java.lang.Object[] r9 = r8.B
            int r4 = r8.A
            int r4 = r4 + r7
            defpackage.fv.t0(r9, r9, r1, r4, r2)
            goto L82
        L6a:
            int r6 = r4.length
            defpackage.fv.t0(r4, r4, r0, r9, r6)
            java.lang.Object[] r9 = r8.B
            if (r3 < r2) goto L78
            int r4 = r9.length
            int r4 = r4 - r3
            defpackage.fv.t0(r9, r9, r4, r1, r2)
            goto L82
        L78:
            int r4 = r9.length
            int r4 = r4 - r3
            defpackage.fv.t0(r9, r9, r4, r1, r3)
            java.lang.Object[] r9 = r8.B
            defpackage.fv.t0(r9, r9, r1, r3, r2)
        L82:
            r8.A = r0
            int r2 = r2 - r3
            int r9 = r8.i(r2)
            r8.c(r9, r10)
            return r5
        L8d:
            int r9 = r2 + r3
            java.lang.Object[] r4 = r8.B
            if (r2 >= r0) goto Lb1
            int r3 = r3 + r0
            int r6 = r4.length
            if (r3 > r6) goto L9b
            defpackage.fv.t0(r4, r4, r9, r2, r0)
            goto Lcd
        L9b:
            int r6 = r4.length
            if (r9 < r6) goto La4
            int r1 = r4.length
            int r9 = r9 - r1
            defpackage.fv.t0(r4, r4, r9, r2, r0)
            goto Lcd
        La4:
            int r6 = r4.length
            int r3 = r3 - r6
            int r3 = r0 - r3
            defpackage.fv.t0(r4, r4, r1, r3, r0)
            java.lang.Object[] r0 = r8.B
            defpackage.fv.t0(r0, r0, r9, r2, r3)
            goto Lcd
        Lb1:
            defpackage.fv.t0(r4, r4, r3, r1, r0)
            java.lang.Object[] r0 = r8.B
            int r4 = r0.length
            if (r9 < r4) goto Lc0
            int r1 = r0.length
            int r9 = r9 - r1
            int r1 = r0.length
            defpackage.fv.t0(r0, r0, r9, r2, r1)
            goto Lcd
        Lc0:
            int r4 = r0.length
            int r4 = r4 - r3
            int r6 = r0.length
            defpackage.fv.t0(r0, r0, r1, r4, r6)
            java.lang.Object[] r0 = r8.B
            int r1 = r0.length
            int r1 = r1 - r3
            defpackage.fv.t0(r0, r0, r9, r2, r1)
        Lcd:
            r8.c(r2, r10)
            return r5
        Ld1:
            java.lang.String r8 = "index: "
            java.lang.String r10 = ", size: "
            java.lang.String r8 = defpackage.lb1.j(r8, r9, r0, r10)
            defpackage.e41.q(r8)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection r3) {
            r2 = this;
            r3.getClass()
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto Lb
            r2 = 0
            return r2
        Lb:
            r2.m()
            int r0 = r2.a()
            int r1 = r3.size()
            int r1 = r1 + r0
            r2.d(r1)
            int r0 = r2.A
            int r1 = r2.a()
            int r1 = r1 + r0
            int r0 = r2.l(r1)
            r2.c(r0, r3)
            r2 = 1
            return r2
    }

    public final void addFirst(java.lang.Object r3) {
            r2 = this;
            r2.m()
            int r0 = r2.L
            int r0 = r0 + 1
            r2.d(r0)
            int r0 = r2.A
            if (r0 != 0) goto L14
            java.lang.Object[] r0 = r2.B
            r0.getClass()
            int r0 = r0.length
        L14:
            int r0 = r0 + (-1)
            r2.A = r0
            java.lang.Object[] r1 = r2.B
            r1[r0] = r3
            int r3 = r2.L
            int r3 = r3 + 1
            r2.L = r3
            return
    }

    public final void addLast(java.lang.Object r4) {
            r3 = this;
            r3.m()
            int r0 = r3.a()
            int r0 = r0 + 1
            r3.d(r0)
            java.lang.Object[] r0 = r3.B
            int r1 = r3.A
            int r2 = r3.a()
            int r2 = r2 + r1
            int r1 = r3.l(r2)
            r0[r1] = r4
            int r4 = r3.a()
            int r4 = r4 + 1
            r3.L = r4
            return
    }

    @Override // defpackage.d1
    public final java.lang.Object b(int r9) {
            r8 = this;
            int r0 = r8.L
            r1 = 0
            if (r9 < 0) goto L8d
            if (r9 >= r0) goto L8d
            int r0 = r8.a()
            r2 = 1
            int r0 = r0 - r2
            if (r9 != r0) goto L14
            java.lang.Object r8 = r8.removeLast()
            return r8
        L14:
            if (r9 != 0) goto L1b
            java.lang.Object r8 = r8.removeFirst()
            return r8
        L1b:
            r8.m()
            int r0 = r8.A
            int r0 = r0 + r9
            int r0 = r8.l(r0)
            java.lang.Object[] r3 = r8.B
            r4 = r3[r0]
            int r5 = r8.L
            int r5 = r5 >> r2
            int r6 = r8.A
            r7 = 0
            if (r9 >= r5) goto L5a
            if (r0 < r6) goto L39
            int r9 = r6 + 1
            defpackage.fv.t0(r3, r3, r9, r6, r0)
            goto L4d
        L39:
            defpackage.fv.t0(r3, r3, r2, r7, r0)
            java.lang.Object[] r9 = r8.B
            int r0 = r9.length
            int r0 = r0 - r2
            r0 = r9[r0]
            r9[r7] = r0
            int r0 = r8.A
            int r3 = r0 + 1
            int r5 = r9.length
            int r5 = r5 - r2
            defpackage.fv.t0(r9, r9, r3, r0, r5)
        L4d:
            java.lang.Object[] r9 = r8.B
            int r0 = r8.A
            r9[r0] = r1
            int r9 = r8.g(r0)
            r8.A = r9
            goto L87
        L5a:
            int r9 = r8.a()
            int r9 = r9 - r2
            int r9 = r9 + r6
            int r9 = r8.l(r9)
            java.lang.Object[] r3 = r8.B
            if (r0 > r9) goto L70
            int r5 = r0 + 1
            int r6 = r9 + 1
            defpackage.fv.t0(r3, r3, r0, r5, r6)
            goto L83
        L70:
            int r5 = r0 + 1
            int r6 = r3.length
            defpackage.fv.t0(r3, r3, r0, r5, r6)
            java.lang.Object[] r0 = r8.B
            int r3 = r0.length
            int r3 = r3 - r2
            r5 = r0[r7]
            r0[r3] = r5
            int r3 = r9 + 1
            defpackage.fv.t0(r0, r0, r7, r2, r3)
        L83:
            java.lang.Object[] r0 = r8.B
            r0[r9] = r1
        L87:
            int r9 = r8.L
            int r9 = r9 - r2
            r8.L = r9
            return r4
        L8d:
            java.lang.String r8 = "index: "
            java.lang.String r2 = ", size: "
            java.lang.String r8 = defpackage.lb1.j(r8, r9, r0, r2)
            defpackage.e41.q(r8)
            return r1
    }

    public final void c(int r5, java.util.Collection r6) {
            r4 = this;
            java.util.Iterator r0 = r6.iterator()
            java.lang.Object[] r1 = r4.B
            int r1 = r1.length
        L7:
            if (r5 >= r1) goto L1a
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1a
            java.lang.Object[] r2 = r4.B
            java.lang.Object r3 = r0.next()
            r2[r5] = r3
            int r5 = r5 + 1
            goto L7
        L1a:
            int r5 = r4.A
            r1 = 0
        L1d:
            if (r1 >= r5) goto L30
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L30
            java.lang.Object[] r2 = r4.B
            java.lang.Object r3 = r0.next()
            r2[r1] = r3
            int r1 = r1 + 1
            goto L1d
        L30:
            int r5 = r4.L
            int r6 = r6.size()
            int r6 = r6 + r5
            r4.L = r6
            return
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L19
            r2.m()
            int r0 = r2.A
            int r1 = r2.a()
            int r1 = r1 + r0
            int r0 = r2.l(r1)
            int r1 = r2.A
            r2.j(r1, r0)
        L19:
            r0 = 0
            r2.A = r0
            r2.L = r0
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object r1) {
            r0 = this;
            int r0 = r0.indexOf(r1)
            r1 = -1
            if (r0 == r1) goto L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    public final void d(int r5) {
            r4 = this;
            if (r5 < 0) goto L44
            java.lang.Object[] r0 = r4.B
            int r1 = r0.length
            if (r5 > r1) goto L8
            return
        L8:
            java.lang.Object[] r1 = defpackage.pu.R
            if (r0 != r1) goto L16
            r0 = 10
            if (r5 >= r0) goto L11
            r5 = r0
        L11:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r4.B = r5
            return
        L16:
            int r1 = r0.length
            int r2 = r1 >> 1
            int r1 = r1 + r2
            int r2 = r1 - r5
            if (r2 >= 0) goto L1f
            r1 = r5
        L1f:
            r2 = 2147483639(0x7ffffff7, float:NaN)
            int r3 = r1 - r2
            if (r3 <= 0) goto L2d
            if (r5 <= r2) goto L2c
            r1 = 2147483647(0x7fffffff, float:NaN)
            goto L2d
        L2c:
            r1 = r2
        L2d:
            java.lang.Object[] r5 = new java.lang.Object[r1]
            int r1 = r4.A
            int r2 = r0.length
            r3 = 0
            defpackage.fv.t0(r0, r5, r3, r1, r2)
            java.lang.Object[] r0 = r4.B
            int r1 = r0.length
            int r2 = r4.A
            int r1 = r1 - r2
            defpackage.fv.t0(r0, r5, r1, r3, r2)
            r4.A = r3
            r4.B = r5
            return
        L44:
            java.lang.String r4 = "Deque is too big."
            defpackage.i.m(r4)
            return
    }

    public final java.lang.Object f() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.Object[] r0 = r1.B
            int r1 = r1.A
            r1 = r0[r1]
            return r1
    }

    public final java.lang.Object first() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto Ld
            java.lang.Object[] r0 = r1.B
            int r1 = r1.A
            r1 = r0[r1]
            return r1
        Ld:
            java.lang.String r1 = "ArrayDeque is empty."
            defpackage.fa6.e(r1)
            r1 = 0
            return r1
    }

    public final int g(int r1) {
            r0 = this;
            java.lang.Object[] r0 = r0.B
            r0.getClass()
            int r0 = r0.length
            int r0 = r0 + (-1)
            if (r1 != r0) goto Lc
            r0 = 0
            return r0
        Lc:
            int r1 = r1 + 1
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int r3) {
            r2 = this;
            int r0 = r2.a()
            if (r3 < 0) goto L14
            if (r3 >= r0) goto L14
            java.lang.Object[] r0 = r2.B
            int r1 = r2.A
            int r1 = r1 + r3
            int r2 = r2.l(r1)
            r2 = r0[r2]
            return r2
        L14:
            java.lang.String r2 = "index: "
            java.lang.String r1 = ", size: "
            java.lang.String r2 = defpackage.lb1.j(r2, r3, r0, r1)
            defpackage.e41.q(r2)
            r2 = 0
            return r2
    }

    public final java.lang.Object h() {
            r3 = this;
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L8
            r3 = 0
            return r3
        L8:
            java.lang.Object[] r0 = r3.B
            int r1 = r3.A
            int r2 = r3.size()
            int r2 = r2 + (-1)
            int r2 = r2 + r1
            int r3 = r3.l(r2)
            r3 = r0[r3]
            return r3
    }

    public final int i(int r1) {
            r0 = this;
            if (r1 >= 0) goto L6
            java.lang.Object[] r0 = r0.B
            int r0 = r0.length
            int r1 = r1 + r0
        L6:
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.A
            int r1 = r4.a()
            int r1 = r1 + r0
            int r0 = r4.l(r1)
            int r1 = r4.A
            if (r1 >= r0) goto L22
        Lf:
            if (r1 >= r0) goto L58
            java.lang.Object[] r2 = r4.B
            r2 = r2[r1]
            boolean r2 = defpackage.nb3.k(r5, r2)
            if (r2 == 0) goto L1f
            int r4 = r4.A
        L1d:
            int r1 = r1 - r4
            return r1
        L1f:
            int r1 = r1 + 1
            goto Lf
        L22:
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L58
            int r1 = r4.A
            if (r1 < r0) goto L58
            java.lang.Object[] r2 = r4.B
            int r2 = r2.length
        L2f:
            if (r1 >= r2) goto L41
            java.lang.Object[] r3 = r4.B
            r3 = r3[r1]
            boolean r3 = defpackage.nb3.k(r5, r3)
            if (r3 == 0) goto L3e
            int r4 = r4.A
            goto L1d
        L3e:
            int r1 = r1 + 1
            goto L2f
        L41:
            r1 = 0
        L42:
            if (r1 >= r0) goto L58
            java.lang.Object[] r2 = r4.B
            r2 = r2[r1]
            boolean r2 = defpackage.nb3.k(r5, r2)
            if (r2 == 0) goto L55
            java.lang.Object[] r5 = r4.B
            int r5 = r5.length
            int r1 = r1 + r5
            int r4 = r4.A
            goto L1d
        L55:
            int r1 = r1 + 1
            goto L42
        L58:
            r4 = -1
            return r4
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
            r0 = this;
            int r0 = r0.a()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public final void j(int r4, int r5) {
            r3 = this;
            java.lang.Object[] r0 = r3.B
            r1 = 0
            if (r4 >= r5) goto L9
            defpackage.fv.z0(r4, r5, r1, r0)
            return
        L9:
            int r2 = r0.length
            defpackage.fv.z0(r4, r2, r1, r0)
            java.lang.Object[] r3 = r3.B
            r4 = 0
            defpackage.fv.z0(r4, r5, r1, r3)
            return
    }

    public final int l(int r2) {
            r1 = this;
            java.lang.Object[] r1 = r1.B
            int r0 = r1.length
            if (r2 < r0) goto L7
            int r1 = r1.length
            int r2 = r2 - r1
        L7:
            return r2
    }

    public final java.lang.Object last() {
            r3 = this;
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L18
            java.lang.Object[] r0 = r3.B
            int r1 = r3.A
            int r2 = r3.size()
            int r2 = r2 + (-1)
            int r2 = r2 + r1
            int r3 = r3.l(r2)
            r3 = r0[r3]
            return r3
        L18:
            java.lang.String r3 = "ArrayDeque is empty."
            defpackage.fa6.e(r3)
            r3 = 0
            return r3
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.A
            int r1 = r4.L
            int r1 = r1 + r0
            int r0 = r4.l(r1)
            int r1 = r4.A
            r2 = -1
            if (r1 >= r0) goto L25
            int r0 = r0 + (-1)
            if (r1 > r0) goto L63
        L12:
            java.lang.Object[] r3 = r4.B
            r3 = r3[r0]
            boolean r3 = defpackage.nb3.k(r5, r3)
            if (r3 == 0) goto L20
            int r4 = r4.A
        L1e:
            int r0 = r0 - r4
            return r0
        L20:
            if (r0 == r1) goto L63
            int r0 = r0 + (-1)
            goto L12
        L25:
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L63
            int r1 = r4.A
            if (r1 < r0) goto L63
            int r0 = r0 + (-1)
        L31:
            java.lang.Object[] r1 = r4.B
            if (r2 >= r0) goto L47
            r1 = r1[r0]
            boolean r1 = defpackage.nb3.k(r5, r1)
            if (r1 == 0) goto L44
            java.lang.Object[] r5 = r4.B
            int r5 = r5.length
            int r0 = r0 + r5
            int r4 = r4.A
            goto L1e
        L44:
            int r0 = r0 + (-1)
            goto L31
        L47:
            r1.getClass()
            int r0 = r1.length
            int r0 = r0 + (-1)
            int r1 = r4.A
            if (r1 > r0) goto L63
        L51:
            java.lang.Object[] r3 = r4.B
            r3 = r3[r0]
            boolean r3 = defpackage.nb3.k(r5, r3)
            if (r3 == 0) goto L5e
            int r4 = r4.A
            goto L1e
        L5e:
            if (r0 == r1) goto L63
            int r0 = r0 + (-1)
            goto L51
        L63:
            return r2
    }

    public final void m() {
            r1 = this;
            int r0 = r1.modCount
            int r0 = r0 + 1
            r1.modCount = r0
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object r2) {
            r1 = this;
            int r2 = r1.indexOf(r2)
            r0 = -1
            if (r2 != r0) goto L9
            r1 = 0
            return r1
        L9:
            r1.b(r2)
            r1 = 1
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(java.util.Collection r12) {
            r11 = this;
            r12.getClass()
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L8d
            java.lang.Object[] r0 = r11.B
            int r0 = r0.length
            if (r0 != 0) goto L11
            goto L8d
        L11:
            int r0 = r11.A
            int r2 = r11.a()
            int r2 = r2 + r0
            int r0 = r11.l(r2)
            int r2 = r11.A
            r3 = 0
            r4 = 1
            if (r2 >= r0) goto L3f
            r5 = r2
        L23:
            java.lang.Object[] r6 = r11.B
            if (r2 >= r0) goto L3b
            r6 = r6[r2]
            boolean r7 = r12.contains(r6)
            if (r7 != 0) goto L37
            java.lang.Object[] r7 = r11.B
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L38
        L37:
            r1 = r4
        L38:
            int r2 = r2 + 1
            goto L23
        L3b:
            defpackage.fv.z0(r5, r0, r3, r6)
            goto L7f
        L3f:
            java.lang.Object[] r5 = r11.B
            int r5 = r5.length
            r7 = r1
            r6 = r2
        L44:
            if (r2 >= r5) goto L5e
            java.lang.Object[] r8 = r11.B
            r9 = r8[r2]
            r8[r2] = r3
            boolean r8 = r12.contains(r9)
            if (r8 != 0) goto L5a
            java.lang.Object[] r8 = r11.B
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L5b
        L5a:
            r7 = r4
        L5b:
            int r2 = r2 + 1
            goto L44
        L5e:
            int r2 = r11.l(r6)
            r5 = r2
        L63:
            if (r1 >= r0) goto L7e
            java.lang.Object[] r2 = r11.B
            r6 = r2[r1]
            r2[r1] = r3
            boolean r2 = r12.contains(r6)
            if (r2 != 0) goto L7a
            java.lang.Object[] r2 = r11.B
            r2[r5] = r6
            int r5 = r11.g(r5)
            goto L7b
        L7a:
            r7 = r4
        L7b:
            int r1 = r1 + 1
            goto L63
        L7e:
            r1 = r7
        L7f:
            if (r1 == 0) goto L8d
            r11.m()
            int r12 = r11.A
            int r5 = r5 - r12
            int r12 = r11.i(r5)
            r11.L = r12
        L8d:
            return r1
    }

    public final java.lang.Object removeFirst() {
            r4 = this;
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L21
            r4.m()
            java.lang.Object[] r0 = r4.B
            int r1 = r4.A
            r2 = r0[r1]
            r3 = 0
            r0[r1] = r3
            int r0 = r4.g(r1)
            r4.A = r0
            int r0 = r4.a()
            int r0 = r0 + (-1)
            r4.L = r0
            return r2
        L21:
            java.lang.String r4 = "ArrayDeque is empty."
            defpackage.fa6.e(r4)
            r4 = 0
            return r4
    }

    public final java.lang.Object removeLast() {
            r4 = this;
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L26
            r4.m()
            int r0 = r4.A
            int r1 = r4.size()
            int r1 = r1 + (-1)
            int r1 = r1 + r0
            int r0 = r4.l(r1)
            java.lang.Object[] r1 = r4.B
            r2 = r1[r0]
            r3 = 0
            r1[r0] = r3
            int r0 = r4.a()
            int r0 = r0 + (-1)
            r4.L = r0
            return r2
        L26:
            java.lang.String r4 = "ArrayDeque is empty."
            defpackage.fa6.e(r4)
            r4 = 0
            return r4
    }

    @Override // java.util.AbstractList
    public final void removeRange(int r8, int r9) {
            r7 = this;
            int r0 = r7.L
            defpackage.hf.E(r8, r9, r0)
            int r0 = r9 - r8
            if (r0 != 0) goto La
            return
        La:
            int r1 = r7.L
            if (r0 != r1) goto L12
            r7.clear()
            return
        L12:
            r1 = 1
            if (r0 != r1) goto L19
            r7.b(r8)
            return
        L19:
            r7.m()
            int r2 = r7.L
            int r2 = r2 - r9
            int r3 = r7.A
            if (r8 >= r2) goto L64
            int r2 = r8 + (-1)
            int r2 = r2 + r3
            int r2 = r7.l(r2)
            int r9 = r9 - r1
            int r1 = r7.A
            int r1 = r1 + r9
            int r9 = r7.l(r1)
        L32:
            if (r8 <= 0) goto L55
            int r1 = r2 + 1
            int r3 = r9 + 1
            int r3 = java.lang.Math.min(r1, r3)
            int r3 = java.lang.Math.min(r8, r3)
            java.lang.Object[] r4 = r7.B
            int r9 = r9 - r3
            int r5 = r9 + 1
            int r2 = r2 - r3
            int r6 = r2 + 1
            defpackage.fv.t0(r4, r4, r5, r6, r1)
            int r2 = r7.i(r2)
            int r9 = r7.i(r9)
            int r8 = r8 - r3
            goto L32
        L55:
            int r8 = r7.A
            int r8 = r8 + r0
            int r8 = r7.l(r8)
            int r9 = r7.A
            r7.j(r9, r8)
            r7.A = r8
            goto La6
        L64:
            int r3 = r3 + r9
            int r1 = r7.l(r3)
            int r2 = r7.A
            int r2 = r2 + r8
            int r8 = r7.l(r2)
            int r2 = r7.L
        L72:
            int r2 = r2 - r9
            if (r2 <= 0) goto L94
            java.lang.Object[] r9 = r7.B
            int r3 = r9.length
            int r3 = r3 - r1
            int r9 = r9.length
            int r9 = r9 - r8
            int r9 = java.lang.Math.min(r3, r9)
            int r9 = java.lang.Math.min(r2, r9)
            java.lang.Object[] r3 = r7.B
            int r4 = r1 + r9
            defpackage.fv.t0(r3, r3, r8, r1, r4)
            int r1 = r7.l(r4)
            int r8 = r8 + r9
            int r8 = r7.l(r8)
            goto L72
        L94:
            int r8 = r7.A
            int r9 = r7.L
            int r9 = r9 + r8
            int r8 = r7.l(r9)
            int r9 = r8 - r0
            int r9 = r7.i(r9)
            r7.j(r9, r8)
        La6:
            int r8 = r7.L
            int r8 = r8 - r0
            r7.L = r8
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(java.util.Collection r12) {
            r11 = this;
            r12.getClass()
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L8d
            java.lang.Object[] r0 = r11.B
            int r0 = r0.length
            if (r0 != 0) goto L11
            goto L8d
        L11:
            int r0 = r11.A
            int r2 = r11.a()
            int r2 = r2 + r0
            int r0 = r11.l(r2)
            int r2 = r11.A
            r3 = 0
            r4 = 1
            if (r2 >= r0) goto L3f
            r5 = r2
        L23:
            java.lang.Object[] r6 = r11.B
            if (r2 >= r0) goto L3b
            r6 = r6[r2]
            boolean r7 = r12.contains(r6)
            if (r7 == 0) goto L37
            java.lang.Object[] r7 = r11.B
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L38
        L37:
            r1 = r4
        L38:
            int r2 = r2 + 1
            goto L23
        L3b:
            defpackage.fv.z0(r5, r0, r3, r6)
            goto L7f
        L3f:
            java.lang.Object[] r5 = r11.B
            int r5 = r5.length
            r7 = r1
            r6 = r2
        L44:
            if (r2 >= r5) goto L5e
            java.lang.Object[] r8 = r11.B
            r9 = r8[r2]
            r8[r2] = r3
            boolean r8 = r12.contains(r9)
            if (r8 == 0) goto L5a
            java.lang.Object[] r8 = r11.B
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L5b
        L5a:
            r7 = r4
        L5b:
            int r2 = r2 + 1
            goto L44
        L5e:
            int r2 = r11.l(r6)
            r5 = r2
        L63:
            if (r1 >= r0) goto L7e
            java.lang.Object[] r2 = r11.B
            r6 = r2[r1]
            r2[r1] = r3
            boolean r2 = r12.contains(r6)
            if (r2 == 0) goto L7a
            java.lang.Object[] r2 = r11.B
            r2[r5] = r6
            int r5 = r11.g(r5)
            goto L7b
        L7a:
            r7 = r4
        L7b:
            int r1 = r1 + 1
            goto L63
        L7e:
            r1 = r7
        L7f:
            if (r1 == 0) goto L8d
            r11.m()
            int r12 = r11.A
            int r5 = r5 - r12
            int r12 = r11.i(r5)
            r11.L = r12
        L8d:
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.a()
            if (r2 < 0) goto L16
            if (r2 >= r0) goto L16
            int r0 = r1.A
            int r0 = r0 + r2
            int r2 = r1.l(r0)
            java.lang.Object[] r1 = r1.B
            r0 = r1[r2]
            r1[r2] = r3
            return r0
        L16:
            java.lang.String r1 = "index: "
            java.lang.String r3 = ", size: "
            java.lang.String r1 = defpackage.lb1.j(r1, r2, r0, r3)
            defpackage.e41.q(r1)
            r1 = 0
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray() {
            r1 = this;
            int r0 = r1.a()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object[] r1 = r1.toArray(r0)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray(java.lang.Object[] r6) {
            r5 = this;
            r6.getClass()
            int r0 = r6.length
            int r1 = r5.L
            if (r0 < r1) goto L9
            goto L1a
        L9:
            java.lang.Class r6 = r6.getClass()
            java.lang.Class r6 = r6.getComponentType()
            java.lang.Object r6 = java.lang.reflect.Array.newInstance(r6, r1)
            r6.getClass()
            java.lang.Object[] r6 = (java.lang.Object[]) r6
        L1a:
            int r0 = r5.A
            int r1 = r5.L
            int r1 = r1 + r0
            int r0 = r5.l(r1)
            int r1 = r5.A
            if (r1 >= r0) goto L2e
            java.lang.Object[] r2 = r5.B
            r3 = 2
            defpackage.fv.w0(r2, r6, r1, r0, r3)
            goto L46
        L2e:
            boolean r1 = r5.isEmpty()
            if (r1 != 0) goto L46
            java.lang.Object[] r1 = r5.B
            int r2 = r5.A
            int r3 = r1.length
            r4 = 0
            defpackage.fv.t0(r1, r6, r4, r2, r3)
            java.lang.Object[] r1 = r5.B
            int r2 = r1.length
            int r3 = r5.A
            int r2 = r2 - r3
            defpackage.fv.t0(r1, r6, r2, r4, r0)
        L46:
            int r5 = r5.L
            int r0 = r6.length
            if (r5 >= r0) goto L4e
            r0 = 0
            r6[r5] = r0
        L4e:
            return r6
    }
}

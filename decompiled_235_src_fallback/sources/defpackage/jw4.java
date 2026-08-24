package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jw4  reason: default package */
/* loaded from: classes.dex */
public final class jw4 extends defpackage.d1 implements java.util.Collection, defpackage.ag3 {
    public defpackage.h1 A;
    public java.lang.Object[] B;
    public java.lang.Object[] L;
    public int R;
    public defpackage.jd1 X;
    public java.lang.Object[] Y;
    public java.lang.Object[] Z;
    public int d0;

    public jw4(defpackage.h1 r2, java.lang.Object[] r3, java.lang.Object[] r4, int r5) {
            r1 = this;
            r1.<init>()
            r1.A = r2
            r1.B = r3
            r1.L = r4
            r1.R = r5
            jd1 r5 = new jd1
            r0 = 15
            r5.<init>(r0)
            r1.X = r5
            r1.Y = r3
            r1.Z = r4
            int r2 = r2.a()
            r1.d0 = r2
            return
    }

    public static void d(java.lang.Object[] r2, int r3, java.util.Iterator r4) {
        L0:
            r0 = 32
            if (r3 >= r0) goto L14
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L14
            int r0 = r3 + 1
            java.lang.Object r1 = r4.next()
            r2[r3] = r1
            r3 = r0
            goto L0
        L14:
            return
    }

    public final int A(defpackage.qn2 r7, java.lang.Object[] r8, int r9, int r10, defpackage.u2 r11, java.util.ArrayList r12, java.util.ArrayList r13) {
            r6 = this;
            boolean r0 = r6.j(r8)
            if (r0 == 0) goto L9
            r12.add(r8)
        L9:
            java.lang.Object r0 = r11.b
            r0.getClass()
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r1 = 0
            r3 = r0
            r2 = r1
        L13:
            if (r2 >= r9) goto L49
            r4 = r8[r2]
            java.lang.Object r5 = r7.g(r4)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L46
            r5 = 32
            if (r10 != r5) goto L41
            boolean r10 = r12.isEmpty()
            if (r10 != 0) goto L3b
            int r10 = r12.size()
            int r10 = r10 + (-1)
            java.lang.Object r10 = r12.remove(r10)
            java.lang.Object[] r10 = (java.lang.Object[]) r10
        L39:
            r3 = r10
            goto L40
        L3b:
            java.lang.Object[] r10 = r6.p()
            goto L39
        L40:
            r10 = r1
        L41:
            int r5 = r10 + 1
            r3[r10] = r4
            r10 = r5
        L46:
            int r2 = r2 + 1
            goto L13
        L49:
            r11.b = r3
            if (r0 == r3) goto L50
            r13.add(r0)
        L50:
            return r10
    }

    public final int B(defpackage.qn2 r7, java.lang.Object[] r8, int r9, defpackage.u2 r10) {
            r6 = this;
            r0 = 0
            r2 = r8
            r3 = r9
            r1 = r0
        L4:
            if (r0 >= r9) goto L27
            r4 = r8[r0]
            java.lang.Object r5 = r7.g(r4)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L1d
            if (r1 != 0) goto L24
            java.lang.Object[] r2 = r6.m(r8)
            r1 = 1
            r3 = r0
            goto L24
        L1d:
            if (r1 == 0) goto L24
            int r5 = r3 + 1
            r2[r3] = r4
            r3 = r5
        L24:
            int r0 = r0 + 1
            goto L4
        L27:
            r10.b = r2
            return r3
    }

    public final int C(defpackage.qn2 r2, int r3, defpackage.u2 r4) {
            r1 = this;
            java.lang.Object[] r0 = r1.Z
            int r2 = r1.B(r2, r0, r3, r4)
            java.lang.Object r4 = r4.b
            if (r2 != r3) goto Lb
            return r3
        Lb:
            r4.getClass()
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r0 = 0
            java.util.Arrays.fill(r4, r2, r3, r0)
            r1.Z = r4
            int r4 = r1.d0
            int r3 = r3 - r2
            int r4 = r4 - r3
            r1.d0 = r4
            return r2
    }

    public final boolean D(defpackage.qn2 r17) {
            r16 = this;
            r0 = r16
            r1 = r17
            int r8 = r0.J()
            u2 r5 = new u2
            r9 = 0
            r10 = 5
            r5.<init>(r9, r10)
            java.lang.Object[] r2 = r0.Y
            r11 = 0
            r12 = 1
            if (r2 != 0) goto L1e
            int r1 = r0.C(r1, r8, r5)
            if (r1 == r8) goto Ld0
        L1b:
            r11 = r12
            goto Ld0
        L1e:
            a1 r13 = r0.l(r11)
            r14 = 32
            r2 = r14
        L25:
            if (r2 != r14) goto L38
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto L38
            java.lang.Object r2 = r13.next()
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            int r2 = r0.B(r1, r2, r14, r5)
            goto L25
        L38:
            if (r2 != r14) goto L4c
            int r1 = r0.C(r1, r8, r5)
            if (r1 != 0) goto L49
            java.lang.Object[] r2 = r0.Y
            int r3 = r0.d0
            int r4 = r0.R
            r0.t(r2, r3, r4)
        L49:
            if (r1 == r8) goto Ld0
            goto L1b
        L4c:
            int r3 = r13.A
            int r3 = r3 - r12
            int r15 = r3 << 5
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r4 = r2
        L5c:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L71
            java.lang.Object r2 = r13.next()
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r3 = 32
            int r4 = r0.A(r1, r2, r3, r4, r5, r6, r7)
            r1 = r17
            goto L5c
        L71:
            java.lang.Object[] r2 = r0.Z
            r1 = r17
            r3 = r8
            int r1 = r0.A(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r2 = r5.b
            r2.getClass()
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            java.util.Arrays.fill(r2, r1, r14, r9)
            boolean r3 = r7.isEmpty()
            java.lang.Object[] r4 = r0.Y
            if (r3 == 0) goto L90
            r4.getClass()
            goto L9a
        L90:
            int r3 = r0.R
            java.util.Iterator r5 = r7.iterator()
            java.lang.Object[] r4 = r0.w(r4, r15, r3, r5)
        L9a:
            int r3 = r7.size()
            int r3 = r3 << r10
            int r15 = r15 + r3
            r3 = r15 & 31
            if (r3 != 0) goto La5
            goto Laa
        La5:
            java.lang.String r3 = "invalid size"
            defpackage.r05.a(r3)
        Laa:
            if (r15 != 0) goto Laf
            r0.R = r11
            goto Lc7
        Laf:
            int r3 = r15 + (-1)
        Lb1:
            int r5 = r0.R
            int r6 = r3 >> r5
            if (r6 != 0) goto Lc3
            int r5 = r5 + (-5)
            r0.R = r5
            r4 = r4[r11]
            r4.getClass()
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            goto Lb1
        Lc3:
            java.lang.Object[] r9 = r0.r(r4, r3, r5)
        Lc7:
            r0.Y = r9
            r0.Z = r2
            int r15 = r15 + r1
            r0.d0 = r15
            goto L1b
        Ld0:
            if (r11 == 0) goto Ld7
            int r1 = r0.modCount
            int r1 = r1 + r12
            r0.modCount = r1
        Ld7:
            return r11
    }

    public final java.lang.Object[] E(java.lang.Object[] r6, int r7, int r8, defpackage.u2 r9) {
            r5 = this;
            int r0 = defpackage.uj2.R(r8, r7)
            r1 = 31
            if (r7 != 0) goto L1c
            r7 = r6[r0]
            java.lang.Object[] r5 = r5.m(r6)
            int r8 = r0 + 1
            r2 = 32
            defpackage.fv.t0(r6, r5, r0, r8, r2)
            java.lang.Object r6 = r9.b
            r5[r1] = r6
            r9.b = r7
            return r5
        L1c:
            r2 = r6[r1]
            if (r2 != 0) goto L2a
            int r1 = r5.G()
            int r1 = r1 + (-1)
            int r1 = defpackage.uj2.R(r1, r7)
        L2a:
            java.lang.Object[] r6 = r5.m(r6)
            int r7 = r7 + (-5)
            int r2 = r0 + 1
            if (r2 > r1) goto L47
        L34:
            r3 = r6[r1]
            r3.getClass()
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r4 = 0
            java.lang.Object[] r3 = r5.E(r3, r7, r4, r9)
            r6[r1] = r3
            if (r1 == r2) goto L47
            int r1 = r1 + (-1)
            goto L34
        L47:
            r1 = r6[r0]
            r1.getClass()
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            java.lang.Object[] r5 = r5.E(r1, r7, r8, r9)
            r6[r0] = r5
            return r6
    }

    public final java.lang.Object F(java.lang.Object[] r7, int r8, int r9, int r10) {
            r6 = this;
            int r0 = r6.d0
            int r0 = r0 - r8
            java.lang.Object[] r1 = r6.Z
            r2 = 1
            if (r0 != r2) goto Lf
            r10 = 0
            r10 = r1[r10]
            r6.t(r7, r8, r9)
            return r10
        Lf:
            r3 = r1[r10]
            java.lang.Object[] r4 = r6.m(r1)
            int r5 = r10 + 1
            defpackage.fv.t0(r1, r4, r10, r5, r0)
            int r10 = r0 + (-1)
            r1 = 0
            r4[r10] = r1
            r6.Y = r7
            r6.Z = r4
            int r8 = r8 + r0
            int r8 = r8 - r2
            r6.d0 = r8
            r6.R = r9
            return r3
    }

    public final int G() {
            r1 = this;
            int r1 = r1.d0
            r0 = 32
            if (r1 > r0) goto L8
            r1 = 0
            return r1
        L8:
            int r1 = r1 + (-1)
            r1 = r1 & (-32)
            return r1
    }

    public final java.lang.Object[] H(java.lang.Object[] r9, int r10, int r11, java.lang.Object r12, defpackage.u2 r13) {
            r8 = this;
            int r0 = defpackage.uj2.R(r11, r10)
            java.lang.Object[] r1 = r8.m(r9)
            if (r10 != 0) goto L19
            if (r1 == r9) goto L12
            int r9 = r8.modCount
            int r9 = r9 + 1
            r8.modCount = r9
        L12:
            r8 = r1[r0]
            r13.b = r8
            r1[r0] = r12
            return r1
        L19:
            r9 = r1[r0]
            r9.getClass()
            r3 = r9
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            int r4 = r10 + (-5)
            r2 = r8
            r5 = r11
            r6 = r12
            r7 = r13
            java.lang.Object[] r8 = r2.H(r3, r4, r5, r6, r7)
            r1[r0] = r8
            return r1
    }

    public final void I(java.util.Collection r6, int r7, java.lang.Object[] r8, int r9, java.lang.Object[][] r10, int r11, java.lang.Object[] r12) {
            r5 = this;
            r0 = 1
            if (r11 < r0) goto L4
            goto L9
        L4:
            java.lang.String r1 = "requires at least one nullBuffer"
            defpackage.r05.a(r1)
        L9:
            java.lang.Object[] r8 = r5.m(r8)
            r1 = 0
            r10[r1] = r8
            r2 = r7 & 31
            int r3 = r6.size()
            int r3 = r3 + r7
            int r3 = r3 - r0
            r7 = r3 & 31
            int r3 = r9 - r2
            int r3 = r3 + r7
            r4 = 32
            if (r3 >= r4) goto L26
            int r7 = r7 + r0
            defpackage.fv.t0(r8, r12, r7, r2, r9)
            goto L3e
        L26:
            int r3 = r3 + (-31)
            if (r11 != r0) goto L2c
            r4 = r8
            goto L34
        L2c:
            java.lang.Object[] r4 = r5.p()
            int r11 = r11 + (-1)
            r10[r11] = r4
        L34:
            int r3 = r9 - r3
            defpackage.fv.t0(r8, r12, r1, r3, r9)
            int r7 = r7 + r0
            defpackage.fv.t0(r8, r4, r7, r2, r3)
            r12 = r4
        L3e:
            java.util.Iterator r6 = r6.iterator()
            d(r8, r2, r6)
        L45:
            if (r0 >= r11) goto L53
            java.lang.Object[] r7 = r5.p()
            d(r7, r1, r6)
            r10[r0] = r7
            int r0 = r0 + 1
            goto L45
        L53:
            d(r12, r1, r6)
            return
    }

    public final int J() {
            r1 = this;
            int r1 = r1.d0
            r0 = 32
            if (r1 > r0) goto L7
            return r1
        L7:
            int r0 = r1 + (-1)
            r0 = r0 & (-32)
            int r1 = r1 - r0
            return r1
    }

    @Override // defpackage.d1
    public final int a() {
            r0 = this;
            int r0 = r0.d0
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int r9, java.lang.Object r10) {
            r8 = this;
            int r0 = r8.a()
            defpackage.np2.y(r9, r0)
            int r0 = r8.a()
            if (r9 != r0) goto L11
            r8.add(r10)
            return
        L11:
            int r0 = r8.modCount
            int r0 = r0 + 1
            r8.modCount = r0
            int r0 = r8.G()
            if (r9 < r0) goto L24
            java.lang.Object[] r1 = r8.Y
            int r9 = r9 - r0
            r8.i(r10, r1, r9)
            return
        L24:
            u2 r7 = new u2
            r0 = 0
            r1 = 5
            r7.<init>(r0, r1)
            java.lang.Object[] r3 = r8.Y
            r3.getClass()
            int r4 = r8.R
            r2 = r8
            r5 = r9
            r6 = r10
            java.lang.Object[] r8 = r2.h(r3, r4, r5, r6, r7)
            r9 = 0
            java.lang.Object r10 = r7.b
            r2.i(r10, r8, r9)
            return
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.modCount
            r1 = 1
            int r0 = r0 + r1
            r3.modCount = r0
            int r0 = r3.J()
            r2 = 32
            if (r0 >= r2) goto L20
            java.lang.Object[] r2 = r3.Z
            java.lang.Object[] r2 = r3.m(r2)
            r2[r0] = r4
            r3.Z = r2
            int r4 = r3.a()
            int r4 = r4 + r1
            r3.d0 = r4
            goto L2b
        L20:
            java.lang.Object[] r4 = r3.q(r4)
            java.lang.Object[] r0 = r3.Y
            java.lang.Object[] r2 = r3.Z
            r3.y(r0, r2, r4)
        L2b:
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int r14, java.util.Collection r15) {
            r13 = this;
            int r0 = r13.d0
            defpackage.np2.y(r14, r0)
            int r0 = r13.d0
            if (r14 != r0) goto Le
            boolean r13 = r13.addAll(r15)
            return r13
        Le:
            boolean r0 = r15.isEmpty()
            r1 = 0
            if (r0 == 0) goto L16
            return r1
        L16:
            int r0 = r13.modCount
            r2 = 1
            int r0 = r0 + r2
            r13.modCount = r0
            int r0 = r14 >> 5
            int r0 = r0 << 5
            int r3 = r13.d0
            int r3 = r3 - r0
            int r4 = r15.size()
            int r4 = r4 + r3
            int r4 = r4 - r2
            r3 = 32
            int r10 = r4 / 32
            if (r10 != 0) goto L5a
            r0 = r14 & 31
            int r1 = r15.size()
            int r1 = r1 + r14
            int r1 = r1 - r2
            r14 = r1 & 31
            java.lang.Object[] r1 = r13.Z
            java.lang.Object[] r3 = r13.m(r1)
            int r14 = r14 + r2
            int r4 = r13.J()
            defpackage.fv.t0(r1, r3, r14, r0, r4)
            java.util.Iterator r14 = r15.iterator()
            d(r3, r0, r14)
            r13.Z = r3
            int r14 = r13.d0
            int r15 = r15.size()
            int r15 = r15 + r14
            r13.d0 = r15
            return r2
        L5a:
            java.lang.Object[][] r7 = new java.lang.Object[r10]
            int r9 = r13.J()
            int r4 = r13.d0
            int r5 = r15.size()
            int r5 = r5 + r4
            if (r5 > r3) goto L6a
            goto L6f
        L6a:
            int r4 = r5 + (-1)
            r4 = r4 & (-32)
            int r5 = r5 - r4
        L6f:
            int r4 = r13.G()
            if (r14 < r4) goto L85
            java.lang.Object[] r12 = r13.p()
            java.lang.Object[] r8 = r13.Z
            r5 = r13
            r6 = r15
            r11 = r10
            r10 = r7
            r7 = r14
            r5.I(r6, r7, r8, r9, r10, r11, r12)
            r7 = r10
            goto Lb5
        L85:
            r6 = r15
            java.lang.Object[] r15 = r13.Z
            if (r5 <= r9) goto L99
            int r8 = r5 - r9
            java.lang.Object[] r11 = r13.o(r8, r15)
            r5 = r13
            r9 = r7
            r7 = r14
            r5.g(r6, r7, r8, r9, r10, r11)
            r7 = r9
            r12 = r11
            goto Lb5
        L99:
            java.lang.Object[] r12 = r13.p()
            int r4 = r9 - r5
            defpackage.fv.t0(r15, r12, r1, r4, r9)
            int r3 = r3 - r4
            java.lang.Object[] r15 = r13.Z
            java.lang.Object[] r9 = r13.o(r3, r15)
            int r8 = r10 + (-1)
            r7[r8] = r9
            r5 = r14
            r4 = r6
            r6 = r3
            r3 = r13
            r3.g(r4, r5, r6, r7, r8, r9)
            r6 = r4
        Lb5:
            java.lang.Object[] r14 = r13.Y
            java.lang.Object[] r14 = r13.x(r14, r0, r7)
            r13.Y = r14
            r13.Z = r12
            int r14 = r13.d0
            int r15 = r6.size()
            int r15 = r15 + r14
            r13.d0 = r15
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection r8) {
            r7 = this;
            boolean r0 = r8.isEmpty()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            int r0 = r7.modCount
            r2 = 1
            int r0 = r0 + r2
            r7.modCount = r0
            int r0 = r7.J()
            java.util.Iterator r3 = r8.iterator()
            int r4 = 32 - r0
            int r5 = r8.size()
            if (r4 < r5) goto L33
            java.lang.Object[] r1 = r7.Z
            java.lang.Object[] r1 = r7.m(r1)
            d(r1, r0, r3)
            r7.Z = r1
            int r0 = r7.d0
            int r8 = r8.size()
            int r8 = r8 + r0
            r7.d0 = r8
            return r2
        L33:
            int r4 = r8.size()
            int r4 = r4 + r0
            int r4 = r4 - r2
            int r4 = r4 / 32
            java.lang.Object[][] r5 = new java.lang.Object[r4]
            java.lang.Object[] r6 = r7.Z
            java.lang.Object[] r6 = r7.m(r6)
            d(r6, r0, r3)
            r5[r1] = r6
            r0 = r2
        L49:
            if (r0 >= r4) goto L57
            java.lang.Object[] r6 = r7.p()
            d(r6, r1, r3)
            r5[r0] = r6
            int r0 = r0 + 1
            goto L49
        L57:
            java.lang.Object[] r0 = r7.Y
            int r4 = r7.G()
            java.lang.Object[] r0 = r7.x(r0, r4, r5)
            r7.Y = r0
            java.lang.Object[] r0 = r7.p()
            d(r0, r1, r3)
            r7.Z = r0
            int r0 = r7.d0
            int r8 = r8.size()
            int r8 = r8 + r0
            r7.d0 = r8
            return r2
    }

    @Override // defpackage.d1
    public final java.lang.Object b(int r6) {
            r5 = this;
            int r0 = r5.a()
            defpackage.np2.w(r6, r0)
            int r0 = r5.modCount
            int r0 = r0 + 1
            r5.modCount = r0
            int r0 = r5.G()
            if (r6 < r0) goto L1d
            java.lang.Object[] r1 = r5.Y
            int r2 = r5.R
            int r6 = r6 - r0
            java.lang.Object r5 = r5.F(r1, r0, r2, r6)
            return r5
        L1d:
            u2 r1 = new u2
            java.lang.Object[] r2 = r5.Z
            r3 = 0
            r2 = r2[r3]
            r4 = 5
            r1.<init>(r2, r4)
            java.lang.Object[] r2 = r5.Y
            r2.getClass()
            int r4 = r5.R
            java.lang.Object[] r6 = r5.E(r2, r4, r6, r1)
            int r2 = r5.R
            r5.F(r6, r0, r2, r3)
            java.lang.Object r5 = r1.b
            return r5
    }

    public final defpackage.h1 c() {
            r5 = this;
            java.lang.Object[] r0 = r5.Y
            java.lang.Object[] r1 = r5.B
            if (r0 != r1) goto Lf
            java.lang.Object[] r1 = r5.Z
            java.lang.Object[] r2 = r5.L
            if (r1 != r2) goto Lf
            h1 r0 = r5.A
            goto L3c
        Lf:
            jd1 r1 = new jd1
            r2 = 15
            r1.<init>(r2)
            r5.X = r1
            r5.B = r0
            java.lang.Object[] r1 = r5.Z
            r5.L = r1
            if (r0 != 0) goto L32
            int r0 = r1.length
            if (r0 != 0) goto L26
            qk6 r0 = defpackage.qk6.B
            goto L3c
        L26:
            qk6 r0 = new qk6
            int r2 = r5.d0
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            r0.<init>(r1)
            goto L3c
        L32:
            iw4 r2 = new iw4
            int r3 = r5.d0
            int r4 = r5.R
            r2.<init>(r0, r1, r3, r4)
            r0 = r2
        L3c:
            r5.A = r0
            return r0
    }

    public final int f() {
            r0 = this;
            int r0 = r0.modCount
            return r0
    }

    public final void g(java.util.Collection r10, int r11, int r12, java.lang.Object[][] r13, int r14, java.lang.Object[] r15) {
            r9 = this;
            java.lang.Object[] r0 = r9.Y
            if (r0 == 0) goto L53
            int r0 = r11 >> 5
            int r1 = r9.G()
            int r1 = r1 >> 5
            a1 r1 = r9.l(r1)
            r3 = r14
            r2 = r15
        L12:
            int r4 = r1.A
            int r4 = r4 + (-1)
            if (r4 == r0) goto L2f
            java.lang.Object r4 = r1.previous()
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            int r5 = 32 - r12
            r6 = 0
            r7 = 32
            defpackage.fv.t0(r4, r2, r6, r5, r7)
            java.lang.Object[] r2 = r9.o(r12, r4)
            int r3 = r3 + (-1)
            r13[r3] = r2
            goto L12
        L2f:
            java.lang.Object r12 = r1.previous()
            r4 = r12
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            int r12 = r9.G()
            int r12 = r12 >> 5
            int r12 = r12 + (-1)
            int r12 = r12 - r0
            int r7 = r14 - r12
            if (r7 >= r14) goto L48
            r15 = r13[r7]
            r15.getClass()
        L48:
            r8 = r15
            r5 = 32
            r1 = r9
            r2 = r10
            r3 = r11
            r6 = r13
            r1.I(r2, r3, r4, r5, r6, r7, r8)
            return
        L53:
            java.lang.String r9 = "root is null"
            defpackage.i.m(r9)
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int r3) {
            r2 = this;
            int r0 = r2.a()
            defpackage.np2.w(r3, r0)
            int r0 = r2.G()
            if (r0 > r3) goto L10
            java.lang.Object[] r2 = r2.Z
            goto L28
        L10:
            java.lang.Object[] r0 = r2.Y
            r0.getClass()
            int r2 = r2.R
        L17:
            if (r2 <= 0) goto L27
            int r1 = defpackage.uj2.R(r3, r2)
            r0 = r0[r1]
            r0.getClass()
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r2 = r2 + (-5)
            goto L17
        L27:
            r2 = r0
        L28:
            r3 = r3 & 31
            r2 = r2[r3]
            return r2
    }

    public final java.lang.Object[] h(java.lang.Object[] r8, int r9, int r10, java.lang.Object r11, defpackage.u2 r12) {
            r7 = this;
            int r0 = defpackage.uj2.R(r10, r9)
            if (r9 != 0) goto L18
            r9 = 31
            r10 = r8[r9]
            r12.b = r10
            java.lang.Object[] r7 = r7.m(r8)
            int r10 = r0 + 1
            defpackage.fv.t0(r8, r7, r10, r0, r9)
            r7[r0] = r11
            return r7
        L18:
            java.lang.Object[] r8 = r7.m(r8)
            int r3 = r9 + (-5)
            r9 = r8[r0]
            r9.getClass()
            r2 = r9
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r1 = r7
            r4 = r10
            r5 = r11
            r6 = r12
            java.lang.Object[] r7 = r1.h(r2, r3, r4, r5, r6)
            r8[r0] = r7
        L30:
            int r0 = r0 + 1
            r7 = 32
            if (r0 >= r7) goto L47
            r7 = r8[r0]
            if (r7 == 0) goto L47
            r2 = r7
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r4 = 0
            java.lang.Object r5 = r6.b
            java.lang.Object[] r7 = r1.h(r2, r3, r4, r5, r6)
            r8[r0] = r7
            goto L30
        L47:
            return r8
    }

    public final void i(java.lang.Object r6, java.lang.Object[] r7, int r8) {
            r5 = this;
            int r0 = r5.J()
            java.lang.Object[] r1 = r5.Z
            java.lang.Object[] r1 = r5.m(r1)
            java.lang.Object[] r2 = r5.Z
            r3 = 32
            if (r0 >= r3) goto L22
            int r3 = r8 + 1
            defpackage.fv.t0(r2, r1, r3, r8, r0)
            r1[r8] = r6
            r5.Y = r7
            r5.Z = r1
            int r6 = r5.d0
            int r6 = r6 + 1
            r5.d0 = r6
            return
        L22:
            r0 = 31
            r3 = r2[r0]
            int r4 = r8 + 1
            defpackage.fv.t0(r2, r1, r4, r8, r0)
            r1[r8] = r6
            java.lang.Object[] r6 = r5.q(r3)
            r5.y(r7, r1, r6)
            return
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
            r1 = this;
            r0 = 0
            java.util.ListIterator r1 = r1.listIterator(r0)
            return r1
    }

    public final boolean j(java.lang.Object[] r3) {
            r2 = this;
            int r0 = r3.length
            r1 = 33
            if (r0 != r1) goto Lf
            r0 = 32
            r3 = r3[r0]
            jd1 r2 = r2.X
            if (r3 != r2) goto Lf
            r2 = 1
            return r2
        Lf:
            r2 = 0
            return r2
    }

    public final defpackage.a1 l(int r4) {
            r3 = this;
            java.lang.Object[] r0 = r3.Y
            if (r0 == 0) goto L1f
            int r1 = r3.G()
            int r1 = r1 >> 5
            defpackage.np2.y(r4, r1)
            int r3 = r3.R
            if (r3 != 0) goto L17
            l80 r3 = new l80
            r3.<init>(r0, r4)
            return r3
        L17:
            int r3 = r3 / 5
            zb7 r2 = new zb7
            r2.<init>(r0, r4, r1, r3)
            return r2
        L1f:
            java.lang.String r3 = "Invalid root"
            defpackage.i.m(r3)
            r3 = 0
            return r3
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator() {
            r1 = this;
            r0 = 0
            java.util.ListIterator r1 = r1.listIterator(r0)
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator(int r2) {
            r1 = this;
            int r0 = r1.d0
            defpackage.np2.y(r2, r0)
            lw4 r0 = new lw4
            r0.<init>(r1, r2)
            return r0
    }

    public final java.lang.Object[] m(java.lang.Object[] r4) {
            r3 = this;
            if (r4 != 0) goto L7
            java.lang.Object[] r3 = r3.p()
            return r3
        L7:
            boolean r0 = r3.j(r4)
            if (r0 == 0) goto Le
            return r4
        Le:
            java.lang.Object[] r3 = r3.p()
            int r0 = r4.length
            r1 = 32
            if (r0 <= r1) goto L18
            r0 = r1
        L18:
            r1 = 6
            r2 = 0
            defpackage.fv.w0(r4, r3, r2, r0, r1)
            return r3
    }

    public final java.lang.Object[] o(int r3, java.lang.Object[] r4) {
            r2 = this;
            boolean r0 = r2.j(r4)
            r1 = 0
            if (r0 == 0) goto Ld
            int r2 = 32 - r3
            defpackage.fv.t0(r4, r4, r3, r1, r2)
            return r4
        Ld:
            java.lang.Object[] r2 = r2.p()
            int r0 = 32 - r3
            defpackage.fv.t0(r4, r2, r3, r1, r0)
            return r2
    }

    public final java.lang.Object[] p() {
            r2 = this;
            r0 = 33
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 32
            jd1 r2 = r2.X
            r0[r1] = r2
            return r0
    }

    public final java.lang.Object[] q(java.lang.Object r3) {
            r2 = this;
            r0 = 33
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 32
            jd1 r2 = r2.X
            r0[r3] = r2
            return r0
    }

    public final java.lang.Object[] r(java.lang.Object[] r4, int r5, int r6) {
            r3 = this;
            if (r6 < 0) goto L3
            goto L8
        L3:
            java.lang.String r0 = "shift should be positive"
            defpackage.r05.a(r0)
        L8:
            if (r6 != 0) goto Lb
            return r4
        Lb:
            int r0 = defpackage.uj2.R(r5, r6)
            r1 = r4[r0]
            r1.getClass()
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            int r6 = r6 + (-5)
            java.lang.Object[] r5 = r3.r(r1, r5, r6)
            r6 = 31
            if (r0 >= r6) goto L3b
            int r6 = r0 + 1
            r1 = r4[r6]
            if (r1 == 0) goto L3b
            boolean r1 = r3.j(r4)
            if (r1 == 0) goto L32
            r1 = 0
            r2 = 32
            java.util.Arrays.fill(r4, r6, r2, r1)
        L32:
            java.lang.Object[] r1 = r3.p()
            r2 = 0
            defpackage.fv.t0(r4, r1, r2, r2, r6)
            r4 = r1
        L3b:
            r6 = r4[r0]
            if (r5 == r6) goto L46
            java.lang.Object[] r3 = r3.m(r4)
            r3[r0] = r5
            return r3
        L46:
            return r4
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(java.util.Collection r3) {
            r2 = this;
            g1 r0 = new g1
            r1 = 1
            r0.<init>(r1, r3)
            boolean r2 = r2.D(r0)
            return r2
    }

    public final java.lang.Object[] s(java.lang.Object[] r5, int r6, int r7, defpackage.u2 r8) {
            r4 = this;
            int r0 = r7 + (-1)
            int r0 = defpackage.uj2.R(r0, r6)
            r1 = 0
            r2 = 5
            if (r6 != r2) goto L10
            r6 = r5[r0]
            r8.b = r6
            r6 = r1
            goto L1c
        L10:
            r3 = r5[r0]
            r3.getClass()
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            int r6 = r6 - r2
            java.lang.Object[] r6 = r4.s(r3, r6, r7, r8)
        L1c:
            if (r6 != 0) goto L21
            if (r0 != 0) goto L21
            return r1
        L21:
            java.lang.Object[] r4 = r4.m(r5)
            r4[r0] = r6
            return r4
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int r9, java.lang.Object r10) {
            r8 = this;
            int r0 = r8.a()
            defpackage.np2.w(r9, r0)
            int r0 = r8.G()
            if (r0 > r9) goto L26
            java.lang.Object[] r0 = r8.Z
            java.lang.Object[] r0 = r8.m(r0)
            java.lang.Object[] r1 = r8.Z
            if (r0 == r1) goto L1d
            int r1 = r8.modCount
            int r1 = r1 + 1
            r8.modCount = r1
        L1d:
            r9 = r9 & 31
            r1 = r0[r9]
            r0[r9] = r10
            r8.Z = r0
            return r1
        L26:
            u2 r7 = new u2
            r0 = 0
            r1 = 5
            r7.<init>(r0, r1)
            java.lang.Object[] r3 = r8.Y
            r3.getClass()
            int r4 = r8.R
            r2 = r8
            r5 = r9
            r6 = r10
            java.lang.Object[] r8 = r2.H(r3, r4, r5, r6, r7)
            r2.Y = r8
            java.lang.Object r8 = r7.b
            return r8
    }

    public final void t(java.lang.Object[] r5, int r6, int r7) {
            r4 = this;
            r0 = 0
            r1 = 0
            if (r7 != 0) goto L11
            r4.Y = r1
            if (r5 != 0) goto La
            java.lang.Object[] r5 = new java.lang.Object[r0]
        La:
            r4.Z = r5
            r4.d0 = r6
            r4.R = r7
            return
        L11:
            u2 r2 = new u2
            r3 = 5
            r2.<init>(r1, r3)
            r5.getClass()
            java.lang.Object[] r5 = r4.s(r5, r7, r6, r2)
            r5.getClass()
            java.lang.Object r1 = r2.b
            r1.getClass()
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r4.Z = r1
            r4.d0 = r6
            r6 = 1
            r6 = r5[r6]
            if (r6 != 0) goto L3b
            r5 = r5[r0]
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            r4.Y = r5
            int r7 = r7 - r3
            r4.R = r7
            return
        L3b:
            r4.Y = r5
            r4.R = r7
            return
    }

    public final java.lang.Object[] w(java.lang.Object[] r5, int r6, int r7, java.util.Iterator r8) {
            r4 = this;
            boolean r0 = r8.hasNext()
            if (r0 != 0) goto Lb
            java.lang.String r0 = "invalid buffersIterator"
            defpackage.r05.a(r0)
        Lb:
            r0 = 0
            r1 = 1
            if (r7 < 0) goto L11
            r2 = r1
            goto L12
        L11:
            r2 = r0
        L12:
            if (r2 != 0) goto L19
            java.lang.String r2 = "negative shift"
            defpackage.r05.a(r2)
        L19:
            if (r7 != 0) goto L22
            java.lang.Object r4 = r8.next()
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            return r4
        L22:
            java.lang.Object[] r5 = r4.m(r5)
            int r2 = defpackage.uj2.R(r6, r7)
            r3 = r5[r2]
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            int r7 = r7 + (-5)
            java.lang.Object[] r6 = r4.w(r3, r6, r7, r8)
            r5[r2] = r6
        L36:
            int r2 = r2 + r1
            r6 = 32
            if (r2 >= r6) goto L4c
            boolean r6 = r8.hasNext()
            if (r6 == 0) goto L4c
            r6 = r5[r2]
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            java.lang.Object[] r6 = r4.w(r6, r0, r7, r8)
            r5[r2] = r6
            goto L36
        L4c:
            return r5
    }

    public final java.lang.Object[] x(java.lang.Object[] r5, int r6, java.lang.Object[][] r7) {
            r4 = this;
            w0 r0 = new w0
            r0.<init>(r7)
            int r7 = r6 >> 5
            int r1 = r4.R
            r2 = 1
            int r3 = r2 << r1
            if (r7 >= r3) goto L13
            java.lang.Object[] r5 = r4.w(r5, r6, r1, r0)
            goto L17
        L13:
            java.lang.Object[] r5 = r4.m(r5)
        L17:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L2f
            int r6 = r4.R
            int r6 = r6 + 5
            r4.R = r6
            java.lang.Object[] r5 = r4.q(r5)
            int r6 = r4.R
            int r7 = r2 << r6
            r4.w(r5, r7, r6, r0)
            goto L17
        L2f:
            return r5
    }

    public final void y(java.lang.Object[] r6, java.lang.Object[] r7, java.lang.Object[] r8) {
            r5 = this;
            int r0 = r5.d0
            int r1 = r0 >> 5
            int r2 = r5.R
            r3 = 1
            int r4 = r3 << r2
            if (r1 <= r4) goto L27
            java.lang.Object[] r6 = r5.q(r6)
            int r0 = r5.R
            int r0 = r0 + 5
            java.lang.Object[] r6 = r5.z(r0, r6, r7)
            r5.Y = r6
            r5.Z = r8
            int r6 = r5.R
            int r6 = r6 + 5
            r5.R = r6
            int r6 = r5.d0
            int r6 = r6 + r3
            r5.d0 = r6
            return
        L27:
            if (r6 != 0) goto L31
            r5.Y = r7
            r5.Z = r8
            int r0 = r0 + r3
            r5.d0 = r0
            return
        L31:
            java.lang.Object[] r6 = r5.z(r2, r6, r7)
            r5.Y = r6
            r5.Z = r8
            int r6 = r5.d0
            int r6 = r6 + r3
            r5.d0 = r6
            return
    }

    public final java.lang.Object[] z(int r4, java.lang.Object[] r5, java.lang.Object[] r6) {
            r3 = this;
            int r0 = r3.a()
            int r0 = r0 + (-1)
            int r0 = defpackage.uj2.R(r0, r4)
            java.lang.Object[] r5 = r3.m(r5)
            r1 = 5
            if (r4 != r1) goto L14
            r5[r0] = r6
            return r5
        L14:
            r2 = r5[r0]
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            int r4 = r4 - r1
            java.lang.Object[] r3 = r3.z(r4, r2, r6)
            r5[r0] = r3
            return r5
    }
}

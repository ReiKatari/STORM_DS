package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iw4  reason: default package */
/* loaded from: classes.dex */
public final class iw4 extends defpackage.h1 {
    public final java.lang.Object[] A;
    public final java.lang.Object[] B;
    public final int L;
    public final int R;

    public iw4(java.lang.Object[] r1, java.lang.Object[] r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r4
            int r1 = r0.a()
            r3 = 32
            if (r1 <= r3) goto L15
            r1 = 1
            goto L16
        L15:
            r1 = 0
        L16:
            if (r1 != 0) goto L2d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Trie-based persistent vector should have at least 33 elements, got "
            r1.<init>(r3)
            int r0 = r0.a()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            defpackage.r05.a(r0)
        L2d:
            int r0 = r2.length
            return
    }

    public static java.lang.Object[] j(java.lang.Object[] r4, int r5, int r6, java.lang.Object r7, defpackage.u2 r8) {
            int r0 = defpackage.uj2.R(r6, r5)
            r1 = 32
            if (r5 != 0) goto L1f
            if (r0 != 0) goto Ld
            java.lang.Object[] r5 = new java.lang.Object[r1]
            goto L11
        Ld:
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r4, r1)
        L11:
            int r6 = r0 + 1
            r1 = 31
            defpackage.fv.t0(r4, r5, r6, r0, r1)
            r4 = r4[r1]
            r8.b = r4
            r5[r0] = r7
            return r5
        L1f:
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r4, r1)
            int r5 = r5 + (-5)
            r3 = r4[r0]
            r3.getClass()
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            java.lang.Object[] r6 = j(r3, r5, r6, r7, r8)
            r2[r0] = r6
        L32:
            int r0 = r0 + 1
            if (r0 >= r1) goto L4b
            r6 = r2[r0]
            if (r6 == 0) goto L4b
            r6 = r4[r0]
            r6.getClass()
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            r7 = 0
            java.lang.Object r3 = r8.b
            java.lang.Object[] r6 = j(r6, r5, r7, r3, r8)
            r2[r0] = r6
            goto L32
        L4b:
            return r2
    }

    public static java.lang.Object[] m(java.lang.Object[] r4, int r5, int r6, defpackage.u2 r7) {
            int r0 = defpackage.uj2.R(r6, r5)
            r1 = 0
            r2 = 5
            if (r5 != r2) goto Le
            r5 = r4[r0]
            r7.b = r5
            r5 = r1
            goto L1a
        Le:
            r3 = r4[r0]
            r3.getClass()
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            int r5 = r5 - r2
            java.lang.Object[] r5 = m(r3, r5, r6, r7)
        L1a:
            if (r5 != 0) goto L1f
            if (r0 != 0) goto L1f
            return r1
        L1f:
            r6 = 32
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r6)
            r4[r0] = r5
            return r4
    }

    public static java.lang.Object[] t(int r2, int r3, java.lang.Object r4, java.lang.Object[] r5) {
            int r0 = defpackage.uj2.R(r3, r2)
            r1 = 32
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r1)
            if (r2 != 0) goto Lf
            r5[r0] = r4
            return r5
        Lf:
            r1 = r5[r0]
            r1.getClass()
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            int r2 = r2 + (-5)
            java.lang.Object[] r2 = t(r2, r3, r4, r1)
            r5[r0] = r2
            return r5
    }

    @Override // defpackage.l0
    public final int a() {
            r0 = this;
            int r0 = r0.L
            return r0
    }

    @Override // defpackage.h1
    public final defpackage.h1 b(int r5, java.lang.Object r6) {
            r4 = this;
            int r0 = r4.L
            defpackage.np2.y(r5, r0)
            if (r5 != r0) goto Lc
            h1 r4 = r4.c(r6)
            return r4
        Lc:
            int r0 = r4.s()
            java.lang.Object[] r1 = r4.A
            if (r5 < r0) goto L1a
            int r5 = r5 - r0
            iw4 r4 = r4.l(r6, r1, r5)
            return r4
        L1a:
            u2 r0 = new u2
            r2 = 0
            r3 = 5
            r0.<init>(r2, r3)
            int r2 = r4.R
            java.lang.Object[] r5 = j(r1, r2, r5, r6, r0)
            r6 = 0
            java.lang.Object r0 = r0.b
            iw4 r4 = r4.l(r0, r5, r6)
            return r4
    }

    @Override // defpackage.h1
    public final defpackage.h1 c(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.s()
            int r1 = r5.L
            int r0 = r1 - r0
            java.lang.Object[] r2 = r5.A
            java.lang.Object[] r3 = r5.B
            r4 = 32
            if (r0 >= r4) goto L20
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)
            r3[r0] = r6
            iw4 r6 = new iw4
            int r1 = r1 + 1
            int r5 = r5.R
            r6.<init>(r2, r3, r1, r5)
            return r6
        L20:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r1 = 0
            r0[r1] = r6
            iw4 r5 = r5.o(r2, r3, r0)
            return r5
    }

    @Override // defpackage.h1
    public final defpackage.jw4 f() {
            r4 = this;
            jw4 r0 = new jw4
            java.lang.Object[] r1 = r4.B
            int r2 = r4.R
            java.lang.Object[] r3 = r4.A
            r0.<init>(r4, r3, r1, r2)
            return r0
    }

    @Override // defpackage.h1
    public final defpackage.h1 g(defpackage.g1 r5) {
            r4 = this;
            jw4 r0 = new jw4
            java.lang.Object[] r1 = r4.B
            int r2 = r4.R
            java.lang.Object[] r3 = r4.A
            r0.<init>(r4, r3, r1, r2)
            r0.D(r5)
            h1 r4 = r0.c()
            return r4
    }

    @Override // java.util.List
    public final java.lang.Object get(int r3) {
            r2 = this;
            int r0 = r2.a()
            defpackage.np2.w(r3, r0)
            int r0 = r2.s()
            if (r0 > r3) goto L10
            java.lang.Object[] r2 = r2.B
            goto L25
        L10:
            java.lang.Object[] r0 = r2.A
            int r2 = r2.R
        L14:
            if (r2 <= 0) goto L24
            int r1 = defpackage.uj2.R(r3, r2)
            r0 = r0[r1]
            r0.getClass()
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r2 = r2 + (-5)
            goto L14
        L24:
            r2 = r0
        L25:
            r3 = r3 & 31
            r2 = r2[r3]
            return r2
    }

    @Override // defpackage.h1
    public final defpackage.h1 h(int r8) {
            r7 = this;
            int r0 = r7.a()
            defpackage.np2.w(r8, r0)
            int r0 = r7.s()
            int r1 = r7.R
            java.lang.Object[] r2 = r7.A
            if (r8 < r0) goto L17
            int r8 = r8 - r0
            h1 r7 = r7.r(r2, r0, r1, r8)
            return r7
        L17:
            u2 r3 = new u2
            java.lang.Object[] r4 = r7.B
            r5 = 0
            r4 = r4[r5]
            r6 = 5
            r3.<init>(r4, r6)
            java.lang.Object[] r8 = r7.q(r2, r1, r8, r3)
            h1 r7 = r7.r(r8, r0, r1, r5)
            return r7
    }

    @Override // defpackage.h1
    public final defpackage.h1 i(int r5, java.lang.Object r6) {
            r4 = this;
            int r0 = r4.L
            defpackage.np2.w(r5, r0)
            int r1 = r4.s()
            java.lang.Object[] r2 = r4.A
            java.lang.Object[] r3 = r4.B
            int r4 = r4.R
            if (r1 > r5) goto L21
            r1 = 32
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r3, r1)
            r5 = r5 & 31
            r1[r5] = r6
            iw4 r5 = new iw4
            r5.<init>(r2, r1, r0, r4)
            return r5
        L21:
            java.lang.Object[] r5 = t(r4, r5, r6, r2)
            iw4 r6 = new iw4
            r6.<init>(r5, r3, r0, r4)
            return r6
    }

    public final defpackage.iw4 l(java.lang.Object r7, java.lang.Object[] r8, int r9) {
            r6 = this;
            int r0 = r6.s()
            int r1 = r6.L
            int r0 = r1 - r0
            java.lang.Object[] r2 = r6.B
            r3 = 32
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r2, r3)
            if (r0 >= r3) goto L23
            int r3 = r9 + 1
            defpackage.fv.t0(r2, r4, r3, r9, r0)
            r4[r9] = r7
            iw4 r7 = new iw4
            int r1 = r1 + 1
            int r6 = r6.R
            r7.<init>(r8, r4, r1, r6)
            return r7
        L23:
            r1 = 31
            r1 = r2[r1]
            int r5 = r9 + 1
            int r0 = r0 + (-1)
            defpackage.fv.t0(r2, r4, r5, r9, r0)
            r4[r9] = r7
            java.lang.Object[] r7 = new java.lang.Object[r3]
            r9 = 0
            r7[r9] = r1
            iw4 r6 = r6.o(r8, r4, r7)
            return r6
    }

    @Override // defpackage.z0, java.util.List
    public final java.util.ListIterator listIterator(int r8) {
            r7 = this;
            int r0 = r7.L
            defpackage.np2.y(r8, r0)
            kw4 r1 = new kw4
            int r0 = r7.R
            int r0 = r0 / 5
            int r6 = r0 + 1
            java.lang.Object[] r2 = r7.A
            java.lang.Object[] r3 = r7.B
            int r5 = r7.L
            r4 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
    }

    public final defpackage.iw4 o(java.lang.Object[] r6, java.lang.Object[] r7, java.lang.Object[] r8) {
            r5 = this;
            int r0 = r5.L
            int r1 = r0 >> 5
            r2 = 1
            int r3 = r5.R
            int r4 = r2 << r3
            if (r1 <= r4) goto L1f
            r1 = 32
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r4 = 0
            r1[r4] = r6
            int r3 = r3 + 5
            java.lang.Object[] r5 = r5.p(r3, r1, r7)
            iw4 r6 = new iw4
            int r0 = r0 + r2
            r6.<init>(r5, r8, r0, r3)
            return r6
        L1f:
            java.lang.Object[] r5 = r5.p(r3, r6, r7)
            iw4 r6 = new iw4
            int r0 = r0 + r2
            r6.<init>(r5, r8, r0, r3)
            return r6
    }

    public final java.lang.Object[] p(int r4, java.lang.Object[] r5, java.lang.Object[] r6) {
            r3 = this;
            int r0 = r3.a()
            int r0 = r0 + (-1)
            int r0 = defpackage.uj2.R(r0, r4)
            r1 = 32
            if (r5 == 0) goto L13
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r1)
            goto L15
        L13:
            java.lang.Object[] r5 = new java.lang.Object[r1]
        L15:
            r1 = 5
            if (r4 != r1) goto L1b
            r5[r0] = r6
            return r5
        L1b:
            r2 = r5[r0]
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            int r4 = r4 - r1
            java.lang.Object[] r3 = r3.p(r4, r2, r6)
            r5[r0] = r3
            return r5
    }

    public final java.lang.Object[] q(java.lang.Object[] r6, int r7, int r8, defpackage.u2 r9) {
            r5 = this;
            int r0 = defpackage.uj2.R(r8, r7)
            r1 = 31
            r2 = 32
            if (r7 != 0) goto L21
            if (r0 != 0) goto Lf
            java.lang.Object[] r5 = new java.lang.Object[r2]
            goto L13
        Lf:
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r6, r2)
        L13:
            int r7 = r0 + 1
            defpackage.fv.t0(r6, r5, r0, r7, r2)
            java.lang.Object r7 = r9.b
            r5[r1] = r7
            r6 = r6[r0]
            r9.b = r6
            return r5
        L21:
            r3 = r6[r1]
            if (r3 != 0) goto L2f
            int r1 = r5.s()
            int r1 = r1 + (-1)
            int r1 = defpackage.uj2.R(r1, r7)
        L2f:
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r2)
            int r7 = r7 + (-5)
            int r2 = r0 + 1
            if (r2 > r1) goto L4c
        L39:
            r3 = r6[r1]
            r3.getClass()
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r4 = 0
            java.lang.Object[] r3 = r5.q(r3, r7, r4, r9)
            r6[r1] = r3
            if (r1 == r2) goto L4c
            int r1 = r1 + (-1)
            goto L39
        L4c:
            r1 = r6[r0]
            r1.getClass()
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            java.lang.Object[] r5 = r5.q(r1, r7, r8, r9)
            r6[r0] = r5
            return r6
    }

    public final defpackage.h1 r(java.lang.Object[] r7, int r8, int r9, int r10) {
            r6 = this;
            int r0 = r6.L
            int r0 = r0 - r8
            r1 = 0
            r2 = 32
            r3 = 1
            if (r0 != r3) goto L49
            if (r9 != 0) goto L1a
            int r6 = r7.length
            r8 = 33
            if (r6 != r8) goto L14
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r2)
        L14:
            qk6 r6 = new qk6
            r6.<init>(r7)
            return r6
        L1a:
            u2 r6 = new u2
            r10 = 5
            r6.<init>(r1, r10)
            int r0 = r8 + (-1)
            java.lang.Object[] r7 = m(r7, r9, r0, r6)
            r7.getClass()
            java.lang.Object r6 = r6.b
            r6.getClass()
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            r0 = r7[r3]
            if (r0 != 0) goto L43
            r0 = 0
            r7 = r7[r0]
            r7.getClass()
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            iw4 r0 = new iw4
            int r9 = r9 - r10
            r0.<init>(r7, r6, r8, r9)
            return r0
        L43:
            iw4 r10 = new iw4
            r10.<init>(r7, r6, r8, r9)
            return r10
        L49:
            java.lang.Object[] r6 = r6.B
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r6, r2)
            int r4 = r0 + (-1)
            if (r10 >= r4) goto L58
            int r5 = r10 + 1
            defpackage.fv.t0(r6, r2, r10, r5, r0)
        L58:
            r2[r4] = r1
            iw4 r6 = new iw4
            int r8 = r8 + r0
            int r8 = r8 - r3
            r6.<init>(r7, r2, r8, r9)
            return r6
    }

    public final int s() {
            r0 = this;
            int r0 = r0.L
            int r0 = r0 + (-1)
            r0 = r0 & (-32)
            return r0
    }
}

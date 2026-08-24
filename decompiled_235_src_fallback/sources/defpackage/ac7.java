package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ac7  reason: default package */
/* loaded from: classes.dex */
public final class ac7 {
    public static final defpackage.ac7 e = null;
    public int a;
    public int b;
    public final defpackage.jd1 c;
    public java.lang.Object[] d;

    static {
            ac7 r0 = new ac7
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r0.<init>(r1, r1, r2, r3)
            defpackage.ac7.e = r0
            return
    }

    public ac7(int r1, int r2, java.lang.Object[] r3, defpackage.jd1 r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r4
            r0.d = r3
            return
    }

    public static defpackage.ac7 j(int r11, java.lang.Object r12, java.lang.Object r13, int r14, java.lang.Object r15, java.lang.Object r16, int r17, defpackage.jd1 r18) {
            r5 = r16
            r0 = r17
            r7 = r18
            r1 = 30
            r8 = 0
            if (r0 <= r1) goto L15
            ac7 r11 = new ac7
            java.lang.Object[] r12 = new java.lang.Object[]{r12, r13, r15, r5}
            r11.<init>(r8, r8, r12, r7)
            return r11
        L15:
            int r9 = defpackage.oi2.I(r11, r0)
            int r1 = defpackage.oi2.I(r14, r0)
            r10 = 1
            if (r9 == r1) goto L45
            r11 = 3
            r14 = 2
            r0 = 4
            if (r9 >= r1) goto L30
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r8] = r12
            r0[r10] = r13
            r0[r14] = r15
            r0[r11] = r5
            goto L3a
        L30:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r8] = r15
            r0[r10] = r5
            r0[r14] = r12
            r0[r11] = r13
        L3a:
            ac7 r11 = new ac7
            int r12 = r10 << r9
            int r13 = r10 << r1
            r12 = r12 | r13
            r11.<init>(r12, r8, r0, r7)
            return r11
        L45:
            int r6 = r0 + 5
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            ac7 r11 = j(r0, r1, r2, r3, r4, r5, r6, r7)
            ac7 r12 = new ac7
            int r13 = r10 << r9
            java.lang.Object[] r11 = new java.lang.Object[]{r11}
            r12.<init>(r8, r13, r11, r7)
            return r12
    }

    public final java.lang.Object[] a(int r10, int r11, int r12, java.lang.Object r13, java.lang.Object r14, int r15, defpackage.jd1 r16) {
            r9 = this;
            java.lang.Object[] r0 = r9.d
            r2 = r0[r10]
            r0 = 0
            if (r2 == 0) goto Lc
            int r1 = r2.hashCode()
            goto Ld
        Lc:
            r1 = r0
        Ld:
            java.lang.Object r3 = r9.x(r10)
            int r7 = r15 + 5
            r4 = r12
            r5 = r13
            r6 = r14
            r8 = r16
            ac7 r12 = j(r1, r2, r3, r4, r5, r6, r7, r8)
            int r11 = r9.t(r11)
            int r13 = r11 + 1
            java.lang.Object[] r9 = r9.d
            int r1 = r11 + (-1)
            int r2 = r9.length
            int r2 = r2 + (-1)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 6
            defpackage.fv.w0(r9, r2, r0, r10, r3)
            int r0 = r10 + 2
            defpackage.fv.t0(r9, r2, r10, r0, r13)
            r2[r1] = r12
            int r10 = r9.length
            defpackage.fv.t0(r9, r2, r11, r13, r10)
            return r2
    }

    public final int b() {
            r4 = this;
            int r0 = r4.b
            if (r0 != 0) goto La
            java.lang.Object[] r4 = r4.d
            int r4 = r4.length
            int r4 = r4 / 2
            return r4
        La:
            int r0 = r4.a
            int r0 = java.lang.Integer.bitCount(r0)
            int r1 = r0 * 2
            java.lang.Object[] r2 = r4.d
            int r2 = r2.length
        L15:
            if (r1 >= r2) goto L23
            ac7 r3 = r4.s(r1)
            int r3 = r3.b()
            int r0 = r0 + r3
            int r1 = r1 + 1
            goto L15
        L23:
            return r0
    }

    public final boolean c(java.lang.Object r6) {
            r5 = this;
            java.lang.Object[] r0 = r5.d
            int r0 = r0.length
            r1 = 0
            l93 r0 = defpackage.gi2.R(r1, r0)
            r2 = 2
            j93 r0 = defpackage.gi2.P(r2, r0)
            int r2 = r0.A
            int r3 = r0.B
            int r0 = r0.L
            if (r0 <= 0) goto L17
            if (r2 <= r3) goto L1b
        L17:
            if (r0 >= 0) goto L2b
            if (r3 > r2) goto L2b
        L1b:
            java.lang.Object[] r4 = r5.d
            r4 = r4[r2]
            boolean r4 = defpackage.nb3.k(r6, r4)
            if (r4 == 0) goto L27
            r5 = 1
            return r5
        L27:
            if (r2 == r3) goto L2b
            int r2 = r2 + r0
            goto L1b
        L2b:
            return r1
    }

    public final boolean d(java.lang.Object r3, int r4, int r5) {
            r2 = this;
            r0 = 1
            int r1 = defpackage.oi2.I(r4, r5)
            int r0 = r0 << r1
            boolean r1 = r2.h(r0)
            if (r1 == 0) goto L19
            int r4 = r2.f(r0)
            java.lang.Object[] r2 = r2.d
            r2 = r2[r4]
            boolean r2 = defpackage.nb3.k(r3, r2)
            return r2
        L19:
            boolean r1 = r2.i(r0)
            if (r1 == 0) goto L37
            int r0 = r2.t(r0)
            ac7 r2 = r2.s(r0)
            r0 = 30
            if (r5 != r0) goto L30
            boolean r2 = r2.c(r3)
            return r2
        L30:
            int r5 = r5 + 5
            boolean r2 = r2.d(r3, r4, r5)
            return r2
        L37:
            r2 = 0
            return r2
    }

    public final boolean e(defpackage.ac7 r6) {
            r5 = this;
            if (r5 != r6) goto L3
            goto L26
        L3:
            int r0 = r5.b
            int r1 = r6.b
            r2 = 0
            if (r0 == r1) goto Lb
            goto L22
        Lb:
            int r0 = r5.a
            int r1 = r6.a
            if (r0 == r1) goto L12
            goto L22
        L12:
            java.lang.Object[] r0 = r5.d
            int r0 = r0.length
            r1 = r2
        L16:
            if (r1 >= r0) goto L26
            java.lang.Object[] r3 = r5.d
            r3 = r3[r1]
            java.lang.Object[] r4 = r6.d
            r4 = r4[r1]
            if (r3 == r4) goto L23
        L22:
            return r2
        L23:
            int r1 = r1 + 1
            goto L16
        L26:
            r5 = 1
            return r5
    }

    public final int f(int r1) {
            r0 = this;
            int r0 = r0.a
            int r1 = r1 + (-1)
            r0 = r0 & r1
            int r0 = java.lang.Integer.bitCount(r0)
            int r0 = r0 * 2
            return r0
    }

    public final java.lang.Object g(java.lang.Object r3, int r4, int r5) {
            r2 = this;
            r0 = 1
            int r1 = defpackage.oi2.I(r4, r5)
            int r0 = r0 << r1
            boolean r1 = r2.h(r0)
            if (r1 == 0) goto L1f
            int r4 = r2.f(r0)
            java.lang.Object[] r5 = r2.d
            r5 = r5[r4]
            boolean r3 = defpackage.nb3.k(r3, r5)
            if (r3 == 0) goto L66
            java.lang.Object r2 = r2.x(r4)
            return r2
        L1f:
            boolean r1 = r2.i(r0)
            if (r1 == 0) goto L66
            int r0 = r2.t(r0)
            ac7 r2 = r2.s(r0)
            r0 = 30
            if (r5 != r0) goto L5f
            java.lang.Object[] r4 = r2.d
            int r4 = r4.length
            r5 = 0
            l93 r4 = defpackage.gi2.R(r5, r4)
            r5 = 2
            j93 r4 = defpackage.gi2.P(r5, r4)
            int r5 = r4.A
            int r0 = r4.B
            int r4 = r4.L
            if (r4 <= 0) goto L48
            if (r5 <= r0) goto L4c
        L48:
            if (r4 >= 0) goto L66
            if (r0 > r5) goto L66
        L4c:
            java.lang.Object[] r1 = r2.d
            r1 = r1[r5]
            boolean r1 = defpackage.nb3.k(r3, r1)
            if (r1 == 0) goto L5b
            java.lang.Object r2 = r2.x(r5)
            return r2
        L5b:
            if (r5 == r0) goto L66
            int r5 = r5 + r4
            goto L4c
        L5f:
            int r5 = r5 + 5
            java.lang.Object r2 = r2.g(r3, r4, r5)
            return r2
        L66:
            r2 = 0
            return r2
    }

    public final boolean h(int r1) {
            r0 = this;
            int r0 = r0.a
            r0 = r0 & r1
            if (r0 == 0) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public final boolean i(int r1) {
            r0 = this;
            int r0 = r0.b
            r0 = r0 & r1
            if (r0 == 0) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public final defpackage.ac7 k(int r4, defpackage.aw4 r5) {
            r3 = this;
            int r0 = r5.Y
            int r0 = r0 + (-1)
            r5.c(r0)
            java.lang.Object r0 = r3.x(r4)
            r5.R = r0
            java.lang.Object[] r0 = r3.d
            int r1 = r0.length
            r2 = 2
            if (r1 != r2) goto L15
            r3 = 0
            return r3
        L15:
            jd1 r1 = r3.c
            jd1 r2 = r5.B
            if (r1 != r2) goto L22
            java.lang.Object[] r4 = defpackage.oi2.e(r4, r0)
            r3.d = r4
            return r3
        L22:
            java.lang.Object[] r3 = defpackage.oi2.e(r4, r0)
            ac7 r4 = new ac7
            jd1 r5 = r5.B
            r0 = 0
            r4.<init>(r0, r0, r3, r5)
            return r4
    }

    public final defpackage.ac7 l(int r11, java.lang.Object r12, java.lang.Object r13, int r14, defpackage.aw4 r15) {
            r10 = this;
            int r0 = defpackage.oi2.I(r11, r14)
            r1 = 1
            int r4 = r1 << r0
            boolean r0 = r10.h(r4)
            jd1 r2 = r10.c
            if (r0 == 0) goto L87
            int r3 = r10.f(r4)
            java.lang.Object[] r0 = r10.d
            r0 = r0[r3]
            boolean r0 = defpackage.nb3.k(r12, r0)
            if (r0 == 0) goto L51
            java.lang.Object r11 = r10.x(r3)
            r15.R = r11
            java.lang.Object r11 = r10.x(r3)
            if (r11 != r13) goto L2c
            r11 = r10
            goto L112
        L2c:
            jd1 r11 = r15.B
            if (r2 != r11) goto L36
            java.lang.Object[] r11 = r10.d
            int r3 = r3 + r1
            r11[r3] = r13
            return r10
        L36:
            int r11 = r15.X
            int r11 = r11 + r1
            r15.X = r11
            java.lang.Object[] r11 = r10.d
            int r12 = r11.length
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r12)
            int r3 = r3 + r1
            r11[r3] = r13
            ac7 r12 = new ac7
            int r13 = r10.a
            int r10 = r10.b
            jd1 r14 = r15.B
            r12.<init>(r13, r10, r11, r14)
            return r12
        L51:
            int r0 = r15.Y
            int r0 = r0 + r1
            r15.c(r0)
            jd1 r9 = r15.B
            if (r2 != r9) goto L71
            r2 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r8 = r14
            java.lang.Object[] r10 = r2.a(r3, r4, r5, r6, r7, r8, r9)
            r2.d = r10
            int r10 = r2.a
            r10 = r10 ^ r4
            r2.a = r10
            int r10 = r2.b
            r10 = r10 | r4
            r2.b = r10
            return r2
        L71:
            r2 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r8 = r14
            java.lang.Object[] r10 = r2.a(r3, r4, r5, r6, r7, r8, r9)
            r11 = r2
            ac7 r12 = new ac7
            int r13 = r11.a
            r13 = r13 ^ r4
            int r11 = r11.b
            r11 = r11 | r4
            r12.<init>(r13, r11, r10, r9)
            return r12
        L87:
            r5 = r11
            r6 = r12
            r7 = r13
            r8 = r14
            r11 = r10
            boolean r10 = r11.i(r4)
            if (r10 == 0) goto L11a
            int r10 = r11.t(r4)
            ac7 r0 = r11.s(r10)
            r12 = 30
            if (r8 != r12) goto L106
            java.lang.Object[] r12 = r0.d
            int r12 = r12.length
            r13 = 0
            l93 r12 = defpackage.gi2.R(r13, r12)
            r14 = 2
            j93 r12 = defpackage.gi2.P(r14, r12)
            int r14 = r12.A
            int r2 = r12.B
            int r12 = r12.L
            if (r12 <= 0) goto Lb5
            if (r14 <= r2) goto Lb9
        Lb5:
            if (r12 >= 0) goto Lf1
            if (r2 > r14) goto Lf1
        Lb9:
            java.lang.Object[] r3 = r0.d
            r3 = r3[r14]
            boolean r3 = defpackage.nb3.k(r6, r3)
            if (r3 == 0) goto Led
            java.lang.Object r12 = r0.x(r14)
            r15.R = r12
            jd1 r12 = r0.c
            jd1 r2 = r15.B
            if (r12 != r2) goto Ld6
            java.lang.Object[] r12 = r0.d
            int r14 = r14 + r1
            r12[r14] = r7
            r14 = r0
            goto L104
        Ld6:
            int r12 = r15.X
            int r12 = r12 + r1
            r15.X = r12
            java.lang.Object[] r12 = r0.d
            int r2 = r12.length
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r12, r2)
            int r14 = r14 + r1
            r12[r14] = r7
            ac7 r14 = new ac7
            jd1 r1 = r15.B
            r14.<init>(r13, r13, r12, r1)
            goto L104
        Led:
            if (r14 == r2) goto Lf1
            int r14 = r14 + r12
            goto Lb9
        Lf1:
            int r12 = r15.Y
            int r12 = r12 + r1
            r15.c(r12)
            java.lang.Object[] r12 = r0.d
            java.lang.Object[] r12 = defpackage.oi2.d(r12, r13, r6, r7)
            ac7 r14 = new ac7
            jd1 r1 = r15.B
            r14.<init>(r13, r13, r12, r1)
        L104:
            r5 = r15
            goto L110
        L106:
            int r4 = r8 + 5
            r1 = r5
            r2 = r6
            r3 = r7
            r5 = r15
            ac7 r14 = r0.l(r1, r2, r3, r4, r5)
        L110:
            if (r0 != r14) goto L113
        L112:
            return r11
        L113:
            jd1 r12 = r5.B
            ac7 r10 = r11.r(r10, r14, r12)
            return r10
        L11a:
            r5 = r15
            int r10 = r5.Y
            int r10 = r10 + r1
            r5.c(r10)
            jd1 r10 = r5.B
            int r12 = r11.f(r4)
            java.lang.Object[] r13 = r11.d
            if (r2 != r10) goto L137
            java.lang.Object[] r10 = defpackage.oi2.d(r13, r12, r6, r7)
            r11.d = r10
            int r10 = r11.a
            r10 = r10 | r4
            r11.a = r10
            return r11
        L137:
            java.lang.Object[] r12 = defpackage.oi2.d(r13, r12, r6, r7)
            ac7 r13 = new ac7
            int r14 = r11.a
            r14 = r14 | r4
            int r11 = r11.b
            r13.<init>(r14, r11, r12, r10)
            return r13
    }

    public final defpackage.ac7 m(defpackage.ac7 r28, int r29, defpackage.oh1 r30, defpackage.aw4 r31) {
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r30
            r9 = r31
            if (r0 != r1) goto L16
            int r1 = r0.b()
            int r2 = r3.a
            int r2 = r2 + r1
            r3.a = r2
            return r0
        L16:
            r4 = 30
            r5 = 2
            r10 = 0
            if (r2 <= r4) goto L8c
            jd1 r2 = r9.B
            int r4 = r1.b
            java.lang.Object[] r4 = r0.d
            int r6 = r4.length
            java.lang.Object[] r7 = r1.d
            int r7 = r7.length
            int r6 = r6 + r7
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r6)
            java.lang.Object[] r6 = r0.d
            int r6 = r6.length
            java.lang.Object[] r7 = r1.d
            int r7 = r7.length
            l93 r7 = defpackage.gi2.R(r10, r7)
            j93 r5 = defpackage.gi2.P(r5, r7)
            int r7 = r5.A
            int r8 = r5.B
            int r5 = r5.L
            if (r5 <= 0) goto L43
            if (r7 <= r8) goto L47
        L43:
            if (r5 >= 0) goto L6c
            if (r8 > r7) goto L6c
        L47:
            java.lang.Object[] r9 = r1.d
            r9 = r9[r7]
            boolean r9 = r0.c(r9)
            if (r9 != 0) goto L62
            java.lang.Object[] r9 = r1.d
            r11 = r9[r7]
            r4[r6] = r11
            int r11 = r6 + 1
            int r12 = r7 + 1
            r9 = r9[r12]
            r4[r11] = r9
            int r6 = r6 + 2
            goto L68
        L62:
            int r9 = r3.a
            int r9 = r9 + 1
            r3.a = r9
        L68:
            if (r7 == r8) goto L6c
            int r7 = r7 + r5
            goto L47
        L6c:
            java.lang.Object[] r3 = r0.d
            int r3 = r3.length
            if (r6 != r3) goto L73
            goto L23a
        L73:
            java.lang.Object[] r0 = r1.d
            int r0 = r0.length
            if (r6 != r0) goto L79
            return r1
        L79:
            int r0 = r4.length
            if (r6 != r0) goto L82
            ac7 r0 = new ac7
            r0.<init>(r10, r10, r4, r2)
            return r0
        L82:
            ac7 r0 = new ac7
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r4, r6)
            r0.<init>(r10, r10, r1, r2)
            return r0
        L8c:
            int r4 = r0.b
            int r6 = r1.b
            r4 = r4 | r6
            int r6 = r0.a
            int r7 = r1.a
            r8 = r6 ^ r7
            int r11 = ~r4
            r8 = r8 & r11
            r6 = r6 & r7
            r11 = r8
        L9b:
            if (r6 == 0) goto Lbe
            int r7 = java.lang.Integer.lowestOneBit(r6)
            int r8 = r0.f(r7)
            java.lang.Object[] r12 = r0.d
            r8 = r12[r8]
            int r12 = r1.f(r7)
            java.lang.Object[] r13 = r1.d
            r12 = r13[r12]
            boolean r8 = defpackage.nb3.k(r8, r12)
            if (r8 == 0) goto Lbb
            r8 = r11 | r7
            r11 = r8
            goto Lbc
        Lbb:
            r4 = r4 | r7
        Lbc:
            r6 = r6 ^ r7
            goto L9b
        Lbe:
            r6 = r4 & r11
            if (r6 != 0) goto Lc3
            goto Lc8
        Lc3:
            java.lang.String r6 = "Check failed."
            defpackage.r05.b(r6)
        Lc8:
            jd1 r6 = r0.c
            jd1 r7 = r9.B
            boolean r6 = defpackage.nb3.k(r6, r7)
            if (r6 == 0) goto Ldc
            int r6 = r0.a
            if (r6 != r11) goto Ldc
            int r6 = r0.b
            if (r6 != r4) goto Ldc
            r12 = r0
            goto Lef
        Ldc:
            int r6 = java.lang.Integer.bitCount(r11)
            int r6 = r6 * r5
            int r5 = java.lang.Integer.bitCount(r4)
            int r5 = r5 + r6
            java.lang.Object[] r5 = new java.lang.Object[r5]
            ac7 r6 = new ac7
            r7 = 0
            r6.<init>(r11, r4, r5, r7)
            r12 = r6
        Lef:
            r13 = r4
            r14 = r10
        Lf1:
            if (r13 == 0) goto L1ec
            int r15 = java.lang.Integer.lowestOneBit(r13)
            java.lang.Object[] r4 = r12.d
            int r5 = r4.length
            int r5 = r5 + (-1)
            int r16 = r5 - r14
            boolean r5 = r0.i(r15)
            if (r5 == 0) goto L165
            int r5 = r0.t(r15)
            ac7 r5 = r0.s(r5)
            boolean r6 = r1.i(r15)
            if (r6 == 0) goto L124
            int r6 = r1.t(r15)
            ac7 r6 = r1.s(r6)
            int r7 = r2 + 5
            ac7 r5 = r5.m(r6, r7, r3, r9)
            r17 = r4
            goto L1e4
        L124:
            boolean r6 = r1.h(r15)
            if (r6 == 0) goto L160
            int r6 = r1.f(r15)
            java.lang.Object[] r7 = r1.d
            r7 = r7[r6]
            java.lang.Object r6 = r1.x(r6)
            int r8 = r9.Y
            if (r7 == 0) goto L13f
            int r17 = r7.hashCode()
            goto L141
        L13f:
            r17 = r10
        L141:
            r18 = r8
            int r8 = r2 + 5
            r10 = r17
            r17 = r4
            r4 = r5
            r5 = r10
            r10 = r7
            r7 = r6
            r6 = r10
            r10 = r18
            ac7 r5 = r4.l(r5, r6, r7, r8, r9)
            int r4 = r9.Y
            if (r4 != r10) goto L1e4
            int r4 = r3.a
            int r4 = r4 + 1
            r3.a = r4
            goto L1e4
        L160:
            r17 = r4
            r4 = r5
            goto L1e4
        L165:
            r17 = r4
            boolean r4 = r1.i(r15)
            if (r4 == 0) goto L1ac
            int r4 = r1.t(r15)
            ac7 r4 = r1.s(r4)
            boolean r5 = r0.h(r15)
            if (r5 == 0) goto L199
            int r5 = r0.f(r15)
            java.lang.Object[] r6 = r0.d
            r6 = r6[r5]
            if (r6 == 0) goto L18a
            int r7 = r6.hashCode()
            goto L18b
        L18a:
            r7 = 0
        L18b:
            int r8 = r2 + 5
            boolean r7 = r4.d(r6, r7, r8)
            if (r7 == 0) goto L19b
            int r5 = r3.a
            int r5 = r5 + 1
            r3.a = r5
        L199:
            r5 = r4
            goto L1e4
        L19b:
            java.lang.Object r7 = r0.x(r5)
            if (r6 == 0) goto L1a6
            int r5 = r6.hashCode()
            goto L1a7
        L1a6:
            r5 = 0
        L1a7:
            ac7 r5 = r4.l(r5, r6, r7, r8, r9)
            goto L1e4
        L1ac:
            int r4 = r0.f(r15)
            java.lang.Object[] r5 = r0.d
            r20 = r5[r4]
            java.lang.Object r21 = r0.x(r4)
            int r4 = r1.f(r15)
            java.lang.Object[] r5 = r1.d
            r23 = r5[r4]
            java.lang.Object r24 = r1.x(r4)
            if (r20 == 0) goto L1cd
            int r4 = r20.hashCode()
            r19 = r4
            goto L1cf
        L1cd:
            r19 = 0
        L1cf:
            if (r23 == 0) goto L1d8
            int r4 = r23.hashCode()
            r22 = r4
            goto L1da
        L1d8:
            r22 = 0
        L1da:
            int r25 = r2 + 5
            jd1 r4 = r9.B
            r26 = r4
            ac7 r5 = j(r19, r20, r21, r22, r23, r24, r25, r26)
        L1e4:
            r17[r16] = r5
            int r14 = r14 + 1
            r13 = r13 ^ r15
            r10 = 0
            goto Lf1
        L1ec:
            r10 = 0
        L1ed:
            if (r11 == 0) goto L234
            int r2 = java.lang.Integer.lowestOneBit(r11)
            int r4 = r10 * 2
            boolean r5 = r1.h(r2)
            if (r5 != 0) goto L210
            int r5 = r0.f(r2)
            java.lang.Object[] r6 = r12.d
            java.lang.Object[] r7 = r0.d
            r7 = r7[r5]
            r6[r4] = r7
            int r4 = r4 + 1
            java.lang.Object r5 = r0.x(r5)
            r6[r4] = r5
            goto L230
        L210:
            int r5 = r1.f(r2)
            java.lang.Object[] r6 = r12.d
            java.lang.Object[] r7 = r1.d
            r7 = r7[r5]
            r6[r4] = r7
            int r4 = r4 + 1
            java.lang.Object r5 = r1.x(r5)
            r6[r4] = r5
            boolean r4 = r0.h(r2)
            if (r4 == 0) goto L230
            int r4 = r3.a
            int r4 = r4 + 1
            r3.a = r4
        L230:
            int r10 = r10 + 1
            r11 = r11 ^ r2
            goto L1ed
        L234:
            boolean r2 = r0.e(r12)
            if (r2 == 0) goto L23b
        L23a:
            return r0
        L23b:
            boolean r0 = r1.e(r12)
            if (r0 == 0) goto L242
            return r1
        L242:
            return r12
    }

    public final defpackage.ac7 n(int r9, java.lang.Object r10, int r11, defpackage.aw4 r12) {
            r8 = this;
            r0 = 1
            int r1 = defpackage.oi2.I(r9, r11)
            int r6 = r0 << r1
            boolean r0 = r8.h(r6)
            if (r0 == 0) goto L22
            int r9 = r8.f(r6)
            java.lang.Object[] r11 = r8.d
            r11 = r11[r9]
            boolean r10 = defpackage.nb3.k(r10, r11)
            if (r10 == 0) goto L20
            ac7 r8 = r8.p(r9, r6, r12)
            return r8
        L20:
            r2 = r8
            goto L74
        L22:
            boolean r0 = r8.i(r6)
            if (r0 == 0) goto L20
            int r5 = r8.t(r6)
            ac7 r3 = r8.s(r5)
            r0 = 30
            if (r11 != r0) goto L65
            java.lang.Object[] r9 = r3.d
            int r9 = r9.length
            r11 = 0
            l93 r9 = defpackage.gi2.R(r11, r9)
            r11 = 2
            j93 r9 = defpackage.gi2.P(r11, r9)
            int r11 = r9.A
            int r0 = r9.B
            int r9 = r9.L
            if (r9 <= 0) goto L4b
            if (r11 <= r0) goto L4f
        L4b:
            if (r9 >= 0) goto L62
            if (r0 > r11) goto L62
        L4f:
            java.lang.Object[] r1 = r3.d
            r1 = r1[r11]
            boolean r1 = defpackage.nb3.k(r10, r1)
            if (r1 == 0) goto L5e
            ac7 r9 = r3.k(r11, r12)
            goto L63
        L5e:
            if (r11 == r0) goto L62
            int r11 = r11 + r9
            goto L4f
        L62:
            r9 = r3
        L63:
            r4 = r9
            goto L6c
        L65:
            int r11 = r11 + 5
            ac7 r9 = r3.n(r9, r10, r11, r12)
            goto L63
        L6c:
            jd1 r7 = r12.B
            r2 = r8
            ac7 r8 = r2.q(r3, r4, r5, r6, r7)
            return r8
        L74:
            return r2
    }

    public final defpackage.ac7 o(int r8, java.lang.Object r9, java.lang.Object r10, int r11, defpackage.aw4 r12) {
            r7 = this;
            r0 = 1
            int r1 = defpackage.oi2.I(r8, r11)
            int r0 = r0 << r1
            boolean r1 = r7.h(r0)
            if (r1 == 0) goto L29
            int r8 = r7.f(r0)
            java.lang.Object[] r11 = r7.d
            r11 = r11[r8]
            boolean r9 = defpackage.nb3.k(r9, r11)
            if (r9 == 0) goto L8a
            java.lang.Object r9 = r7.x(r8)
            boolean r9 = defpackage.nb3.k(r10, r9)
            if (r9 == 0) goto L8a
            ac7 r7 = r7.p(r8, r0, r12)
            return r7
        L29:
            boolean r1 = r7.i(r0)
            if (r1 == 0) goto L8a
            r4 = r10
            int r10 = r7.t(r0)
            ac7 r1 = r7.s(r10)
            r2 = 30
            if (r11 != r2) goto L78
            java.lang.Object[] r8 = r1.d
            int r8 = r8.length
            r11 = 0
            l93 r8 = defpackage.gi2.R(r11, r8)
            r11 = 2
            j93 r8 = defpackage.gi2.P(r11, r8)
            int r11 = r8.A
            int r2 = r8.B
            int r8 = r8.L
            if (r8 <= 0) goto L53
            if (r11 <= r2) goto L57
        L53:
            if (r8 >= 0) goto L74
            if (r2 > r11) goto L74
        L57:
            java.lang.Object[] r3 = r1.d
            r3 = r3[r11]
            boolean r3 = defpackage.nb3.k(r9, r3)
            if (r3 == 0) goto L70
            java.lang.Object r3 = r1.x(r11)
            boolean r3 = defpackage.nb3.k(r4, r3)
            if (r3 == 0) goto L70
            ac7 r8 = r1.k(r11, r12)
            goto L75
        L70:
            if (r11 == r2) goto L74
            int r11 = r11 + r8
            goto L57
        L74:
            r8 = r1
        L75:
            r6 = r12
        L76:
            r9 = r8
            goto L82
        L78:
            int r5 = r11 + 5
            r2 = r8
            r3 = r9
            r6 = r12
            ac7 r8 = r1.o(r2, r3, r4, r5, r6)
            goto L76
        L82:
            jd1 r12 = r6.B
            r11 = r0
            r8 = r1
            ac7 r7 = r7.q(r8, r9, r10, r11, r12)
        L8a:
            return r7
    }

    public final defpackage.ac7 p(int r4, int r5, defpackage.aw4 r6) {
            r3 = this;
            int r0 = r6.Y
            int r0 = r0 + (-1)
            r6.c(r0)
            java.lang.Object r0 = r3.x(r4)
            r6.R = r0
            java.lang.Object[] r0 = r3.d
            int r1 = r0.length
            r2 = 2
            if (r1 != r2) goto L15
            r3 = 0
            return r3
        L15:
            jd1 r1 = r3.c
            jd1 r2 = r6.B
            if (r1 != r2) goto L27
            java.lang.Object[] r4 = defpackage.oi2.e(r4, r0)
            r3.d = r4
            int r4 = r3.a
            r4 = r4 ^ r5
            r3.a = r4
            return r3
        L27:
            java.lang.Object[] r4 = defpackage.oi2.e(r4, r0)
            ac7 r0 = new ac7
            int r1 = r3.a
            r5 = r5 ^ r1
            int r3 = r3.b
            jd1 r6 = r6.B
            r0.<init>(r5, r3, r4, r6)
            return r0
    }

    public final defpackage.ac7 q(defpackage.ac7 r3, defpackage.ac7 r4, int r5, int r6, defpackage.jd1 r7) {
            r2 = this;
            jd1 r0 = r2.c
            if (r4 != 0) goto L29
            java.lang.Object[] r3 = r2.d
            int r4 = r3.length
            r1 = 1
            if (r4 != r1) goto Lc
            r2 = 0
            return r2
        Lc:
            if (r0 != r7) goto L1a
            java.lang.Object[] r3 = defpackage.oi2.f(r5, r3)
            r2.d = r3
            int r3 = r2.b
            r3 = r3 ^ r6
            r2.b = r3
            return r2
        L1a:
            java.lang.Object[] r3 = defpackage.oi2.f(r5, r3)
            ac7 r4 = new ac7
            int r5 = r2.a
            int r2 = r2.b
            r2 = r2 ^ r6
            r4.<init>(r5, r2, r3, r7)
            return r4
        L29:
            if (r0 == r7) goto L2f
            if (r3 == r4) goto L2e
            goto L2f
        L2e:
            return r2
        L2f:
            ac7 r2 = r2.r(r5, r4, r7)
            return r2
    }

    public final defpackage.ac7 r(int r4, defpackage.ac7 r5, defpackage.jd1 r6) {
            r3 = this;
            java.lang.Object[] r0 = r3.d
            int r1 = r0.length
            r2 = 1
            if (r1 != r2) goto L15
            java.lang.Object[] r1 = r5.d
            int r1 = r1.length
            r2 = 2
            if (r1 != r2) goto L15
            int r1 = r5.b
            if (r1 != 0) goto L15
            int r3 = r3.b
            r5.a = r3
            return r5
        L15:
            jd1 r1 = r3.c
            if (r1 != r6) goto L1c
            r0[r4] = r5
            return r3
        L1c:
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            r0[r4] = r5
            ac7 r4 = new ac7
            int r5 = r3.a
            int r3 = r3.b
            r4.<init>(r5, r3, r0, r6)
            return r4
    }

    public final defpackage.ac7 s(int r1) {
            r0 = this;
            java.lang.Object[] r0 = r0.d
            r0 = r0[r1]
            r0.getClass()
            ac7 r0 = (defpackage.ac7) r0
            return r0
    }

    public final int t(int r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.d
            int r0 = r0.length
            int r0 = r0 + (-1)
            int r1 = r1.b
            int r2 = r2 + (-1)
            r1 = r1 & r2
            int r1 = java.lang.Integer.bitCount(r1)
            int r0 = r0 - r1
            return r0
    }

    public final defpackage.zb u(java.lang.Object r15, int r16, int r17, java.lang.Object r18) {
            r14 = this;
            r5 = r18
            int r0 = defpackage.oi2.I(r16, r17)
            r8 = 1
            int r2 = r8 << r0
            boolean r0 = r14.h(r2)
            r9 = 16
            r1 = 0
            r10 = 0
            if (r0 == 0) goto L5f
            int r0 = r14.f(r2)
            java.lang.Object[] r3 = r14.d
            r3 = r3[r0]
            boolean r3 = defpackage.nb3.k(r15, r3)
            if (r3 == 0) goto L42
            java.lang.Object r15 = r14.x(r0)
            if (r15 != r5) goto L29
            goto Ld5
        L29:
            java.lang.Object[] r15 = r14.d
            int r2 = r15.length
            java.lang.Object[] r15 = java.util.Arrays.copyOf(r15, r2)
            int r0 = r0 + r8
            r15[r0] = r5
            ac7 r0 = new ac7
            int r2 = r14.a
            int r14 = r14.b
            r0.<init>(r2, r14, r15, r10)
            zb r14 = new zb
            r14.<init>(r0, r1, r9)
            return r14
        L42:
            r7 = 0
            r4 = r15
            r3 = r16
            r6 = r17
            r1 = r0
            r0 = r14
            java.lang.Object[] r15 = r0.a(r1, r2, r3, r4, r5, r6, r7)
            ac7 r1 = new ac7
            int r3 = r14.a
            r3 = r3 ^ r2
            int r14 = r14.b
            r14 = r14 | r2
            r1.<init>(r3, r14, r15, r10)
            zb r14 = new zb
            r14.<init>(r1, r8, r9)
            return r14
        L5f:
            r6 = r17
            boolean r3 = r14.i(r2)
            if (r3 == 0) goto Le1
            int r3 = r14.t(r2)
            ac7 r7 = r14.s(r3)
            r11 = 30
            if (r6 != r11) goto Lcb
            java.lang.Object[] r6 = r7.d
            int r6 = r6.length
            l93 r6 = defpackage.gi2.R(r1, r6)
            r11 = 2
            j93 r6 = defpackage.gi2.P(r11, r6)
            int r11 = r6.A
            int r12 = r6.B
            int r6 = r6.L
            if (r6 <= 0) goto L89
            if (r11 <= r12) goto L8d
        L89:
            if (r6 >= 0) goto Lb8
            if (r12 > r11) goto Lb8
        L8d:
            java.lang.Object[] r13 = r7.d
            r13 = r13[r11]
            boolean r13 = defpackage.nb3.k(r15, r13)
            if (r13 == 0) goto Lb4
            java.lang.Object r15 = r7.x(r11)
            if (r5 != r15) goto L9f
            r15 = r10
            goto Lc8
        L9f:
            java.lang.Object[] r15 = r7.d
            int r4 = r15.length
            java.lang.Object[] r15 = java.util.Arrays.copyOf(r15, r4)
            int r11 = r11 + r8
            r15[r11] = r5
            ac7 r4 = new ac7
            r4.<init>(r1, r1, r15, r10)
            zb r15 = new zb
            r15.<init>(r4, r1, r9)
            goto Lc8
        Lb4:
            if (r11 == r12) goto Lb8
            int r11 = r11 + r6
            goto L8d
        Lb8:
            java.lang.Object[] r6 = r7.d
            java.lang.Object[] r15 = defpackage.oi2.d(r6, r1, r15, r5)
            ac7 r4 = new ac7
            r4.<init>(r1, r1, r15, r10)
            zb r15 = new zb
            r15.<init>(r4, r8, r9)
        Lc8:
            if (r15 != 0) goto Ld6
            goto Ld5
        Lcb:
            int r1 = r6 + 5
            r6 = r16
            zb r15 = r7.u(r15, r6, r1, r5)
            if (r15 != 0) goto Ld6
        Ld5:
            return r10
        Ld6:
            java.lang.Object r1 = r15.L
            ac7 r1 = (defpackage.ac7) r1
            ac7 r14 = r14.w(r3, r2, r1)
            r15.L = r14
            return r15
        Le1:
            int r1 = r14.f(r2)
            java.lang.Object[] r3 = r14.d
            java.lang.Object[] r15 = defpackage.oi2.d(r3, r1, r15, r5)
            ac7 r1 = new ac7
            int r3 = r14.a
            r2 = r2 | r3
            int r14 = r14.b
            r1.<init>(r2, r14, r15, r10)
            zb r14 = new zb
            r14.<init>(r1, r8, r9)
            return r14
    }

    public final defpackage.ac7 v(java.lang.Object r10, int r11, int r12) {
            r9 = this;
            int r0 = defpackage.oi2.I(r11, r12)
            r1 = 1
            int r0 = r1 << r0
            boolean r2 = r9.h(r0)
            r3 = 2
            r4 = 0
            if (r2 == 0) goto L33
            int r11 = r9.f(r0)
            java.lang.Object[] r12 = r9.d
            r12 = r12[r11]
            boolean r10 = defpackage.nb3.k(r10, r12)
            if (r10 == 0) goto La3
            java.lang.Object[] r10 = r9.d
            int r12 = r10.length
            if (r12 != r3) goto L24
            goto L8d
        L24:
            java.lang.Object[] r10 = defpackage.oi2.e(r11, r10)
            ac7 r11 = new ac7
            int r12 = r9.a
            r12 = r12 ^ r0
            int r9 = r9.b
            r11.<init>(r12, r9, r10, r4)
            return r11
        L33:
            boolean r2 = r9.i(r0)
            if (r2 == 0) goto La3
            int r2 = r9.t(r0)
            ac7 r5 = r9.s(r2)
            r6 = 30
            if (r12 != r6) goto L80
            java.lang.Object[] r11 = r5.d
            int r11 = r11.length
            r12 = 0
            l93 r11 = defpackage.gi2.R(r12, r11)
            j93 r11 = defpackage.gi2.P(r3, r11)
            int r6 = r11.A
            int r7 = r11.B
            int r11 = r11.L
            if (r11 <= 0) goto L5b
            if (r6 <= r7) goto L5f
        L5b:
            if (r11 >= 0) goto L7e
            if (r7 > r6) goto L7e
        L5f:
            java.lang.Object[] r8 = r5.d
            r8 = r8[r6]
            boolean r8 = defpackage.nb3.k(r10, r8)
            if (r8 == 0) goto L7a
            java.lang.Object[] r10 = r5.d
            int r11 = r10.length
            if (r11 != r3) goto L70
            r11 = r4
            goto L86
        L70:
            java.lang.Object[] r10 = defpackage.oi2.e(r6, r10)
            ac7 r11 = new ac7
            r11.<init>(r12, r12, r10, r4)
            goto L86
        L7a:
            if (r6 == r7) goto L7e
            int r6 = r6 + r11
            goto L5f
        L7e:
            r11 = r5
            goto L86
        L80:
            int r12 = r12 + 5
            ac7 r11 = r5.v(r10, r11, r12)
        L86:
            if (r11 != 0) goto L9d
            java.lang.Object[] r10 = r9.d
            int r11 = r10.length
            if (r11 != r1) goto L8e
        L8d:
            return r4
        L8e:
            java.lang.Object[] r10 = defpackage.oi2.f(r2, r10)
            ac7 r11 = new ac7
            int r12 = r9.a
            int r9 = r9.b
            r9 = r9 ^ r0
            r11.<init>(r12, r9, r10, r4)
            return r11
        L9d:
            if (r5 == r11) goto La3
            ac7 r9 = r9.w(r2, r0, r11)
        La3:
            return r9
    }

    public final defpackage.ac7 w(int r9, int r10, defpackage.ac7 r11) {
            r8 = this;
            java.lang.Object[] r0 = r11.d
            int r1 = r0.length
            r2 = 2
            r3 = 0
            if (r1 != r2) goto L45
            int r1 = r11.b
            if (r1 != 0) goto L45
            java.lang.Object[] r1 = r8.d
            int r1 = r1.length
            r2 = 1
            if (r1 != r2) goto L16
            int r8 = r8.b
            r11.a = r8
            return r11
        L16:
            int r11 = r8.f(r10)
            java.lang.Object[] r1 = r8.d
            r4 = 0
            r4 = r0[r4]
            r0 = r0[r2]
            int r5 = r1.length
            int r5 = r5 + r2
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r1, r5)
            int r6 = r9 + 2
            int r7 = r9 + 1
            int r1 = r1.length
            defpackage.fv.t0(r5, r5, r6, r7, r1)
            int r1 = r11 + 2
            defpackage.fv.t0(r5, r5, r1, r11, r9)
            r5[r11] = r4
            int r11 = r11 + r2
            r5[r11] = r0
            ac7 r9 = new ac7
            int r11 = r8.a
            r11 = r11 ^ r10
            int r8 = r8.b
            r8 = r8 ^ r10
            r9.<init>(r11, r8, r5, r3)
            return r9
        L45:
            java.lang.Object[] r10 = r8.d
            int r0 = r10.length
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r0)
            r10[r9] = r11
            ac7 r9 = new ac7
            int r11 = r8.a
            int r8 = r8.b
            r9.<init>(r11, r8, r10, r3)
            return r9
    }

    public final java.lang.Object x(int r1) {
            r0 = this;
            java.lang.Object[] r0 = r0.d
            int r1 = r1 + 1
            r0 = r0[r1]
            return r0
    }
}

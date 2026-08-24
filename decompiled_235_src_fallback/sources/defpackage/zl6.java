package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zl6  reason: default package */
/* loaded from: classes.dex */
public final class zl6 implements java.lang.Iterable, defpackage.zf3 {
    public static final defpackage.zl6 X = null;
    public final long A;
    public final long B;
    public final long L;
    public final long[] R;

    static {
            zl6 r0 = new zl6
            r5 = 0
            r7 = 0
            r1 = 0
            r3 = 0
            r0.<init>(r1, r3, r5, r7)
            defpackage.zl6.X = r0
            return
    }

    public zl6(long r1, long r3, long r5, long[] r7) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r3
            r0.L = r5
            r0.R = r7
            return
    }

    public final defpackage.zl6 a(defpackage.zl6 r20) {
            r19 = this;
            r0 = r19
            r1 = r20
            zl6 r2 = defpackage.zl6.X
            if (r1 != r2) goto L9
            return r0
        L9:
            if (r0 != r2) goto Lc
            return r2
        Lc:
            long r2 = r1.L
            long r4 = r1.L
            long[] r6 = r1.R
            long r7 = r1.B
            long r9 = r1.A
            long r11 = r0.L
            int r1 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r1 != 0) goto L34
            long[] r1 = r0.R
            if (r6 != r1) goto L34
            r16 = r11
            zl6 r11 = new zl6
            long r2 = r0.A
            long r4 = ~r9
            long r12 = r2 & r4
            long r2 = r0.B
            long r4 = ~r7
            long r14 = r2 & r4
            r18 = r1
            r11.<init>(r12, r14, r16, r18)
            return r11
        L34:
            r1 = 0
            if (r6 == 0) goto L44
            int r2 = r6.length
            r3 = r1
        L39:
            if (r3 >= r2) goto L44
            r11 = r6[r3]
            zl6 r0 = r0.b(r11)
            int r3 = r3 + 1
            goto L39
        L44:
            r2 = 0
            int r6 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            r11 = 1
            r13 = 64
            if (r6 == 0) goto L61
            r6 = r1
        L4f:
            if (r6 >= r13) goto L61
            long r14 = r11 << r6
            long r14 = r14 & r7
            int r14 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r14 == 0) goto L5e
            long r14 = (long) r6
            long r14 = r14 + r4
            zl6 r0 = r0.b(r14)
        L5e:
            int r6 = r6 + 1
            goto L4f
        L61:
            int r6 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r6 == 0) goto L7a
        L65:
            if (r1 >= r13) goto L7a
            long r6 = r11 << r1
            long r6 = r6 & r9
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 == 0) goto L77
            long r6 = (long) r1
            long r6 = r6 + r4
            r14 = 64
            long r6 = r6 + r14
            zl6 r0 = r0.b(r6)
        L77:
            int r1 = r1 + 1
            goto L65
        L7a:
            return r0
    }

    public final defpackage.zl6 b(long r12) {
            r11 = this;
            long r0 = r11.L
            long r0 = r12 - r0
            r2 = 0
            int r4 = defpackage.nb3.q(r0, r2)
            r5 = 1
            r7 = 64
            if (r4 < 0) goto L30
            int r4 = defpackage.nb3.q(r0, r7)
            if (r4 >= 0) goto L30
            int r12 = (int) r0
            long r12 = r5 << r12
            long r0 = r11.B
            long r4 = r0 & r12
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 == 0) goto L8e
            zl6 r3 = new zl6
            long r12 = ~r12
            long r6 = r0 & r12
            long r8 = r11.L
            long[] r10 = r11.R
            long r4 = r11.A
            r3.<init>(r4, r6, r8, r10)
            return r3
        L30:
            int r4 = defpackage.nb3.q(r0, r7)
            if (r4 < 0) goto L5a
            r7 = 128(0x80, double:6.3E-322)
            int r4 = defpackage.nb3.q(r0, r7)
            if (r4 >= 0) goto L5a
            int r12 = (int) r0
            int r12 = r12 + (-64)
            long r12 = r5 << r12
            long r0 = r11.A
            long r4 = r0 & r12
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 == 0) goto L8e
            zl6 r3 = new zl6
            long r12 = ~r12
            long r4 = r0 & r12
            long r8 = r11.L
            long[] r10 = r11.R
            long r6 = r11.B
            r3.<init>(r4, r6, r8, r10)
            return r3
        L5a:
            int r0 = defpackage.nb3.q(r0, r2)
            if (r0 >= 0) goto L8e
            long[] r0 = r11.R
            if (r0 == 0) goto L8e
            int r12 = defpackage.mp2.k(r0, r12)
            if (r12 < 0) goto L8e
            zl6 r1 = new zl6
            int r13 = r0.length
            int r2 = r13 + (-1)
            if (r2 != 0) goto L74
            r12 = 0
            r8 = r12
            goto L84
        L74:
            long[] r3 = new long[r2]
            if (r12 <= 0) goto L7c
            r4 = 0
            defpackage.fv.s0(r0, r3, r4, r4, r12)
        L7c:
            if (r12 >= r2) goto L83
            int r2 = r12 + 1
            defpackage.fv.s0(r0, r3, r12, r2, r13)
        L83:
            r8 = r3
        L84:
            long r2 = r11.A
            long r4 = r11.B
            long r6 = r11.L
            r1.<init>(r2, r4, r6, r8)
            return r1
        L8e:
            return r11
    }

    public final boolean c(long r12) {
            r11 = this;
            long r0 = r11.L
            long r0 = r12 - r0
            r2 = 0
            int r4 = defpackage.nb3.q(r0, r2)
            r5 = 1
            r7 = 64
            r9 = 1
            r10 = 0
            if (r4 < 0) goto L25
            int r4 = defpackage.nb3.q(r0, r7)
            if (r4 >= 0) goto L25
            int r12 = (int) r0
            long r12 = r5 << r12
            long r0 = r11.B
            long r11 = r12 & r0
            int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r11 == 0) goto L24
            return r9
        L24:
            return r10
        L25:
            int r4 = defpackage.nb3.q(r0, r7)
            if (r4 < 0) goto L42
            r7 = 128(0x80, double:6.3E-322)
            int r4 = defpackage.nb3.q(r0, r7)
            if (r4 >= 0) goto L42
            int r12 = (int) r0
            int r12 = r12 + (-64)
            long r12 = r5 << r12
            long r0 = r11.A
            long r11 = r12 & r0
            int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r11 == 0) goto L41
            return r9
        L41:
            return r10
        L42:
            int r0 = defpackage.nb3.q(r0, r2)
            if (r0 <= 0) goto L49
            return r10
        L49:
            long[] r11 = r11.R
            if (r11 == 0) goto L54
            int r11 = defpackage.mp2.k(r11, r12)
            if (r11 < 0) goto L54
            return r9
        L54:
            return r10
    }

    public final defpackage.zl6 d(defpackage.zl6 r23) {
            r22 = this;
            r0 = r22
            r1 = r23
            zl6 r2 = defpackage.zl6.X
            if (r1 != r2) goto L9
            return r0
        L9:
            if (r0 != r2) goto Lc
            return r1
        Lc:
            long r2 = r1.L
            long r4 = r1.L
            long[] r6 = r1.R
            long r7 = r1.B
            long r9 = r1.A
            long r11 = r0.L
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            long r13 = r0.B
            r3 = r2
            long r1 = r0.A
            if (r3 != 0) goto L33
            long[] r3 = r0.R
            if (r6 != r3) goto L33
            r16 = r11
            zl6 r11 = new zl6
            r14 = r13
            long r12 = r1 | r9
            long r14 = r14 | r7
            r18 = r3
            r11.<init>(r12, r14, r16, r18)
            return r11
        L33:
            r14 = r13
            r16 = 1
            r3 = 64
            r13 = 0
            r18 = 0
            r20 = 64
            long[] r11 = r0.R
            if (r11 != 0) goto L88
            if (r11 == 0) goto L52
            int r4 = r11.length
            r5 = r23
            r6 = r13
        L47:
            if (r6 >= r4) goto L54
            r7 = r11[r6]
            zl6 r5 = r5.f(r7)
            int r6 = r6 + 1
            goto L47
        L52:
            r5 = r23
        L54:
            int r4 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            long r6 = r0.L
            if (r4 == 0) goto L6e
            r0 = r13
        L5b:
            if (r0 >= r3) goto L6e
            long r8 = r16 << r0
            long r8 = r8 & r14
            int r4 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r4 == 0) goto L6b
            long r8 = (long) r0
            long r8 = r8 + r6
            zl6 r4 = r5.f(r8)
            r5 = r4
        L6b:
            int r0 = r0 + 1
            goto L5b
        L6e:
            int r0 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r0 == 0) goto L87
        L72:
            if (r13 >= r3) goto L87
            long r8 = r16 << r13
            long r8 = r8 & r1
            int r0 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r0 == 0) goto L84
            long r8 = (long) r13
            long r8 = r8 + r6
            long r8 = r8 + r20
            zl6 r0 = r5.f(r8)
            r5 = r0
        L84:
            int r13 = r13 + 1
            goto L72
        L87:
            return r5
        L88:
            if (r6 == 0) goto L97
            int r1 = r6.length
            r2 = r13
        L8c:
            if (r2 >= r1) goto L97
            r11 = r6[r2]
            zl6 r0 = r0.f(r11)
            int r2 = r2 + 1
            goto L8c
        L97:
            int r1 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r1 == 0) goto Lae
            r1 = r13
        L9c:
            if (r1 >= r3) goto Lae
            long r11 = r16 << r1
            long r11 = r11 & r7
            int r2 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r2 == 0) goto Lab
            long r11 = (long) r1
            long r11 = r11 + r4
            zl6 r0 = r0.f(r11)
        Lab:
            int r1 = r1 + 1
            goto L9c
        Lae:
            int r1 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r1 == 0) goto Lc6
        Lb2:
            if (r13 >= r3) goto Lc6
            long r1 = r16 << r13
            long r1 = r1 & r9
            int r1 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r1 == 0) goto Lc3
            long r1 = (long) r13
            long r1 = r1 + r4
            long r1 = r1 + r20
            zl6 r0 = r0.f(r1)
        Lc3:
            int r13 = r13 + 1
            goto Lb2
        Lc6:
            return r0
    }

    public final defpackage.zl6 f(long r30) {
            r29 = this;
            r0 = r29
            r1 = r30
            long r3 = r0.L
            long r5 = r1 - r3
            r7 = 0
            int r9 = defpackage.nb3.q(r5, r7)
            long r10 = r0.B
            r12 = 64
            r14 = 1
            if (r9 < 0) goto L37
            int r9 = defpackage.nb3.q(r5, r12)
            if (r9 >= 0) goto L37
            int r1 = (int) r5
            long r1 = r14 << r1
            long r3 = r10 & r1
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 != 0) goto L19e
            zl6 r12 = new zl6
            long r15 = r10 | r1
            long r1 = r0.L
            long[] r3 = r0.R
            long r13 = r0.A
            r17 = r1
            r19 = r3
            r12.<init>(r13, r15, r17, r19)
            return r12
        L37:
            int r9 = defpackage.nb3.q(r5, r12)
            r16 = r12
            long r12 = r0.A
            r18 = r14
            r20 = 64
            r14 = 128(0x80, double:6.3E-322)
            if (r9 < 0) goto L66
            int r9 = defpackage.nb3.q(r5, r14)
            if (r9 >= 0) goto L66
            int r1 = (int) r5
            int r1 = r1 + (-64)
            long r1 = r18 << r1
            long r3 = r12 & r1
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 != 0) goto L19e
            zl6 r4 = new zl6
            long r5 = r12 | r1
            long r9 = r0.L
            long[] r11 = r0.R
            long r7 = r0.B
            r4.<init>(r5, r7, r9, r11)
            return r4
        L66:
            int r5 = defpackage.nb3.q(r5, r14)
            long[] r9 = r0.R
            if (r5 < 0) goto L15e
            boolean r5 = r29.c(r30)
            if (r5 != 0) goto L19e
            long r14 = r1 + r18
            long r14 = r14 / r16
            long r14 = r14 * r16
            int r0 = defpackage.nb3.q(r14, r7)
            if (r0 >= 0) goto L85
            r14 = 9223372036854775680(0x7fffffffffffff80, double:NaN)
        L85:
            r22 = r12
            r5 = 0
        L88:
            int r12 = defpackage.nb3.q(r3, r14)
            if (r12 >= 0) goto L127
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L10d
            if (r5 != 0) goto Lf1
            s35 r5 = new s35
            r5.<init>()
            if (r9 == 0) goto Le5
            int r12 = r9.length
            long[] r12 = java.util.Arrays.copyOf(r9, r12)
            t94 r13 = new t94
            r29 = 0
            int r0 = r12.length
            r13.<init>(r0)
            int r0 = r13.b
            if (r0 < 0) goto Ldf
            r24 = r7
            int r7 = r12.length
            if (r7 != 0) goto Lb2
            goto Lee
        Lb2:
            int r7 = r12.length
            int r7 = r7 + r0
            long[] r8 = r13.a
            int r6 = r8.length
            if (r6 >= r7) goto Lc8
            int r6 = r8.length
            int r6 = r6 * 3
            int r6 = r6 / 2
            int r6 = java.lang.Math.max(r7, r6)
            long[] r6 = java.util.Arrays.copyOf(r8, r6)
            r13.a = r6
        Lc8:
            long[] r6 = r13.a
            int r7 = r13.b
            if (r0 == r7) goto Ld3
            int r8 = r12.length
            int r8 = r8 + r0
            defpackage.fv.s0(r6, r6, r8, r0, r7)
        Ld3:
            int r7 = r12.length
            r8 = 0
            defpackage.fv.s0(r12, r6, r0, r8, r7)
            int r0 = r13.b
            int r6 = r12.length
            int r0 = r0 + r6
            r13.b = r0
            goto Lee
        Ldf:
            java.lang.String r0 = ""
            defpackage.e41.q(r0)
            throw r29
        Le5:
            r24 = r7
            r29 = 0
            t94 r13 = new t94
            r13.<init>()
        Lee:
            r5.A = r13
            goto Lf5
        Lf1:
            r24 = r7
            r29 = 0
        Lf5:
            r6 = r20
            r0 = 0
        Lf8:
            if (r0 >= r6) goto L113
            long r7 = r18 << r0
            long r7 = r7 & r10
            int r7 = (r7 > r24 ? 1 : (r7 == r24 ? 0 : -1))
            if (r7 == 0) goto L10a
            long r7 = (long) r0
            long r7 = r7 + r3
            java.lang.Object r12 = r5.A
            t94 r12 = (defpackage.t94) r12
            r12.a(r7)
        L10a:
            int r0 = r0 + 1
            goto Lf8
        L10d:
            r24 = r7
            r6 = r20
            r29 = 0
        L113:
            int r0 = (r22 > r24 ? 1 : (r22 == r24 ? 0 : -1))
            if (r0 != 0) goto L11b
            r26 = r14
        L119:
            r8 = 0
            goto L12e
        L11b:
            long r3 = r3 + r16
            r20 = r6
            r10 = r22
            r7 = r24
            r22 = r7
            goto L88
        L127:
            r29 = 0
            r26 = r3
            r24 = r10
            goto L119
        L12e:
            zl6 r21 = new zl6
            if (r5 == 0) goto L152
            java.lang.Object r0 = r5.A
            t94 r0 = (defpackage.t94) r0
            int r3 = r0.b
            if (r3 != 0) goto L13d
            r0 = r29
            goto L14c
        L13d:
            long[] r4 = new long[r3]
            long[] r0 = r0.a
            r6 = r8
        L142:
            if (r6 >= r3) goto L14b
            r7 = r0[r6]
            r4[r6] = r7
            int r6 = r6 + 1
            goto L142
        L14b:
            r0 = r4
        L14c:
            if (r0 != 0) goto L14f
            goto L152
        L14f:
            r28 = r0
            goto L154
        L152:
            r28 = r9
        L154:
            r21.<init>(r22, r24, r26, r28)
            r0 = r21
            zl6 r0 = r0.f(r1)
            return r0
        L15e:
            r8 = 0
            r3 = 1
            if (r9 != 0) goto L177
            zl6 r10 = new zl6
            long[] r3 = new long[r3]
            r21 = r8
            r3[r21] = r1
            long r11 = r0.A
            long r13 = r0.B
            long r0 = r0.L
            r15 = r0
            r17 = r3
            r10.<init>(r11, r13, r15, r17)
            return r10
        L177:
            int r4 = defpackage.mp2.k(r9, r1)
            if (r4 >= 0) goto L19e
            int r4 = r4 + r3
            int r3 = -r4
            int r4 = r9.length
            int r5 = r4 + 1
            long[] r5 = new long[r5]
            r8 = 0
            defpackage.fv.s0(r9, r5, r8, r8, r3)
            int r6 = r3 + 1
            defpackage.fv.s0(r9, r5, r6, r3, r4)
            r5[r3] = r1
            zl6 r10 = new zl6
            long r13 = r0.B
            long r1 = r0.L
            long r11 = r0.A
            r15 = r1
            r17 = r5
            r10.<init>(r11, r13, r15, r17)
            return r10
        L19e:
            return r0
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r2 = this;
            yl6 r0 = new yl6
            r1 = 0
            r0.<init>(r2, r1)
            rb6 r2 = defpackage.qo2.C(r0)
            return r2
    }

    public final java.lang.String toString() {
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = " ["
            r0.append(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.ht0.v0(r9, r2)
            r1.<init>(r2)
            java.util.Iterator r9 = r9.iterator()
        L20:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L38
            java.lang.Object r2 = r9.next()
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.add(r2)
            goto L20
        L38:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r2 = ""
            r9.append(r2)
            int r3 = r1.size()
            r4 = 0
            r5 = r4
        L48:
            if (r4 >= r3) goto L7c
            java.lang.Object r6 = r1.get(r4)
            r7 = 1
            int r5 = r5 + r7
            if (r5 <= r7) goto L57
            java.lang.String r8 = ", "
            r9.append(r8)
        L57:
            if (r6 != 0) goto L5a
            goto L5c
        L5a:
            boolean r7 = r6 instanceof java.lang.CharSequence
        L5c:
            if (r7 == 0) goto L64
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r9.append(r6)
            goto L79
        L64:
            boolean r7 = r6 instanceof java.lang.Character
            if (r7 == 0) goto L72
            java.lang.Character r6 = (java.lang.Character) r6
            char r6 = r6.charValue()
            r9.append(r6)
            goto L79
        L72:
            java.lang.String r6 = r6.toString()
            r9.append(r6)
        L79:
            int r4 = r4 + 1
            goto L48
        L7c:
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            r0.append(r9)
            r9 = 93
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            return r9
    }
}

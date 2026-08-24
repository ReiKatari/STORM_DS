package defpackage;
/* renamed from: qs6  reason: default package */
/* loaded from: classes.dex */
public abstract class qs6 extends defpackage.xs6 {
    public static java.lang.String A0(int r2, java.lang.String r3) {
            r3.getClass()
            if (r2 < 0) goto L35
            int r0 = r3.length()
            if (r2 > r0) goto L15
            r2 = 0
            int r0 = r3.length()
            java.lang.CharSequence r2 = r3.subSequence(r2, r0)
            goto L30
        L15:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r3)
            int r3 = r3.length()
            int r2 = r2 - r3
            r3 = 1
            if (r3 > r2) goto L2f
        L25:
            r1 = 32
            r0.append(r1)
            if (r3 == r2) goto L2f
            int r3 = r3 + 1
            goto L25
        L2f:
            r2 = r0
        L30:
            java.lang.String r2 = r2.toString()
            return r2
        L35:
            java.lang.String r3 = "Desired length "
            java.lang.String r0 = " is less than zero."
            java.lang.String r2 = defpackage.lb1.k(r3, r2, r0)
            defpackage.i.h(r2)
            r2 = 0
            return r2
    }

    public static java.lang.String B0(int r3, java.lang.String r4) {
            r4.getClass()
            if (r3 < 0) goto L35
            int r0 = r4.length()
            if (r3 > r0) goto L15
            r3 = 0
            int r0 = r4.length()
            java.lang.CharSequence r3 = r4.subSequence(r3, r0)
            goto L30
        L15:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            int r1 = r4.length()
            int r3 = r3 - r1
            r1 = 1
            if (r1 > r3) goto L2c
        L22:
            r2 = 48
            r0.append(r2)
            if (r1 == r3) goto L2c
            int r1 = r1 + 1
            goto L22
        L2c:
            r0.append(r4)
            r3 = r0
        L30:
            java.lang.String r3 = r3.toString()
            return r3
        L35:
            java.lang.String r4 = "Desired length "
            java.lang.String r0 = " is less than zero."
            java.lang.String r3 = defpackage.lb1.k(r4, r3, r0)
            defpackage.i.h(r3)
            r3 = 0
            return r3
    }

    public static final boolean C0(java.lang.CharSequence r4, int r5, java.lang.CharSequence r6, int r7, int r8, boolean r9) {
            r4.getClass()
            r6.getClass()
            r0 = 0
            if (r7 < 0) goto L35
            if (r5 < 0) goto L35
            int r1 = r4.length()
            int r1 = r1 - r8
            if (r5 > r1) goto L35
            int r1 = r6.length()
            int r1 = r1 - r8
            if (r7 <= r1) goto L1a
            goto L35
        L1a:
            r1 = r0
        L1b:
            if (r1 >= r8) goto L33
            int r2 = r5 + r1
            char r2 = r4.charAt(r2)
            int r3 = r7 + r1
            char r3 = r6.charAt(r3)
            boolean r2 = defpackage.g04.E(r2, r3, r9)
            if (r2 != 0) goto L30
            return r0
        L30:
            int r1 = r1 + 1
            goto L1b
        L33:
            r4 = 1
            return r4
        L35:
            return r0
    }

    public static java.lang.String D0(java.lang.String r1, java.lang.String r2) {
            r0 = 0
            boolean r0 = defpackage.xs6.g0(r1, r2, r0)
            if (r0 == 0) goto Lf
            int r2 = r2.length()
            java.lang.String r1 = r1.substring(r2)
        Lf:
            return r1
    }

    public static java.lang.String E0(java.lang.String r1, java.lang.String r2) {
            r1.getClass()
            boolean r0 = l0(r1, r2)
            if (r0 == 0) goto L17
            int r0 = r1.length()
            int r2 = r2.length()
            int r0 = r0 - r2
            r2 = 0
            java.lang.String r1 = r1.substring(r2, r0)
        L17:
            return r1
    }

    public static java.lang.String F0(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r3.getClass()
            r0 = 0
            r1 = 6
            r2 = 46
            int r0 = x0(r2, r0, r1, r3)
            r1 = -1
            if (r0 != r1) goto Lf
            return r5
        Lf:
            int r0 = r0 + 1
            int r5 = r3.length()
            java.lang.StringBuilder r3 = G0(r3, r0, r5, r4)
            java.lang.String r3 = r3.toString()
            return r3
    }

    public static java.lang.StringBuilder G0(java.lang.CharSequence r2, int r3, int r4, java.lang.CharSequence r5) {
            r2.getClass()
            r5.getClass()
            if (r4 < r3) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            r0.append(r2, r1, r3)
            r0.append(r5)
            int r3 = r2.length()
            r0.append(r2, r4, r3)
            return r0
        L1c:
            java.lang.String r2 = ") is less than start index ("
            java.lang.String r5 = ")."
            java.lang.String r0 = "End index ("
            java.lang.String r2 = defpackage.xg6.m(r4, r3, r0, r2, r5)
            defpackage.e41.q(r2)
            r2 = 0
            return r2
    }

    public static final void H0(int r1) {
            if (r1 < 0) goto L3
            return
        L3:
            java.lang.String r0 = "Limit must be non-negative, but was "
            java.lang.String r1 = defpackage.lb1.g(r1, r0)
            defpackage.i.f(r1)
            return
    }

    public static final java.util.List I0(int r8, java.lang.CharSequence r9, java.lang.String r10) {
            H0(r8)
            r0 = 0
            int r1 = q0(r9, r10, r0, r0)
            r2 = -1
            if (r1 == r2) goto L52
            r3 = 1
            if (r8 != r3) goto Lf
            goto L52
        Lf:
            if (r8 <= 0) goto L13
            r4 = r3
            goto L14
        L13:
            r4 = r0
        L14:
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            if (r4 == 0) goto L1e
            if (r8 <= r6) goto L1d
            goto L1e
        L1d:
            r6 = r8
        L1e:
            r5.<init>(r6)
            r6 = r0
        L22:
            java.lang.CharSequence r6 = r9.subSequence(r6, r1)
            java.lang.String r6 = r6.toString()
            r5.add(r6)
            int r6 = r10.length()
            int r6 = r6 + r1
            if (r4 == 0) goto L3c
            int r1 = r5.size()
            int r7 = r8 + (-1)
            if (r1 == r7) goto L42
        L3c:
            int r1 = q0(r9, r10, r6, r0)
            if (r1 != r2) goto L22
        L42:
            int r8 = r9.length()
            java.lang.CharSequence r8 = r9.subSequence(r6, r8)
            java.lang.String r8 = r8.toString()
            r5.add(r8)
            return r5
        L52:
            java.lang.String r8 = r9.toString()
            java.util.List r8 = defpackage.hf.b0(r8)
            return r8
    }

    public static java.util.List J0(java.lang.CharSequence r4, char[] r5, int r6) {
            r6 = r6 & 4
            r0 = 0
            if (r6 == 0) goto L7
            r6 = r0
            goto L8
        L7:
            r6 = 2
        L8:
            r4.getClass()
            int r1 = r5.length
            r2 = 1
            if (r1 != r2) goto L1a
            char r5 = r5[r0]
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.util.List r4 = I0(r6, r4, r5)
            return r4
        L1a:
            H0(r6)
            lh1 r0 = new lh1
            y36 r1 = new y36
            r3 = 8
            r1.<init>(r5, r3)
            r0.<init>(r4, r6, r1)
            dv r5 = new dv
            r6 = 3
            r5.<init>(r0, r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r0 = 10
            int r0 = defpackage.ht0.v0(r5, r0)
            r6.<init>(r0)
            java.util.Iterator r5 = r5.iterator()
        L3e:
            r0 = r5
            kh1 r0 = (defpackage.kh1) r0
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L61
            java.lang.Object r0 = r0.next()
            l93 r0 = (defpackage.l93) r0
            r0.getClass()
            int r1 = r0.A
            int r0 = r0.B
            int r0 = r0 + r2
            java.lang.CharSequence r0 = r4.subSequence(r1, r0)
            java.lang.String r0 = r0.toString()
            r6.add(r0)
            goto L3e
        L61:
            return r6
    }

    public static java.util.List K0(java.lang.CharSequence r4, java.lang.String[] r5, int r6) {
            r6 = r6 & 4
            r0 = 0
            if (r6 == 0) goto L7
            r6 = r0
            goto L8
        L7:
            r6 = 2
        L8:
            r4.getClass()
            int r1 = r5.length
            r2 = 1
            if (r1 != r2) goto L1d
            r0 = r5[r0]
            int r1 = r0.length()
            if (r1 != 0) goto L18
            goto L1d
        L18:
            java.util.List r4 = I0(r6, r4, r0)
            return r4
        L1d:
            H0(r6)
            java.util.List r5 = java.util.Arrays.asList(r5)
            r5.getClass()
            lh1 r0 = new lh1
            y36 r1 = new y36
            r3 = 7
            r1.<init>(r5, r3)
            r0.<init>(r4, r6, r1)
            dv r5 = new dv
            r6 = 3
            r5.<init>(r0, r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r0 = 10
            int r0 = defpackage.ht0.v0(r5, r0)
            r6.<init>(r0)
            java.util.Iterator r5 = r5.iterator()
        L47:
            r0 = r5
            kh1 r0 = (defpackage.kh1) r0
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6a
            java.lang.Object r0 = r0.next()
            l93 r0 = (defpackage.l93) r0
            r0.getClass()
            int r1 = r0.A
            int r0 = r0.B
            int r0 = r0 + r2
            java.lang.CharSequence r0 = r4.subSequence(r1, r0)
            java.lang.String r0 = r0.toString()
            r6.add(r0)
            goto L47
        L6a:
            return r6
    }

    public static boolean L0(java.lang.String r2, char r3) {
            r2.getClass()
            int r0 = r2.length()
            r1 = 0
            if (r0 <= 0) goto L16
            char r2 = r2.charAt(r1)
            boolean r2 = defpackage.g04.E(r2, r3, r1)
            if (r2 == 0) goto L16
            r2 = 1
            return r2
        L16:
            return r1
    }

    public static java.lang.String M0(char r2, java.lang.String r3, java.lang.String r4) {
            r3.getClass()
            r4.getClass()
            r0 = 0
            r1 = 6
            int r2 = s0(r2, r0, r1, r3)
            r0 = -1
            if (r2 != r0) goto L10
            return r4
        L10:
            int r2 = r2 + 1
            int r4 = r3.length()
            java.lang.String r2 = r3.substring(r2, r4)
            return r2
    }

    public static java.lang.String N0(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r2.getClass()
            r0 = 0
            r1 = 6
            int r0 = t0(r2, r3, r0, r0, r1)
            r1 = -1
            if (r0 != r1) goto Ld
            return r4
        Ld:
            int r3 = r3.length()
            int r3 = r3 + r0
            int r4 = r2.length()
            java.lang.String r2 = r2.substring(r3, r4)
            return r2
    }

    public static java.lang.String O0(char r2, java.lang.String r3, java.lang.String r4) {
            r3.getClass()
            r4.getClass()
            r0 = 0
            r1 = 6
            int r2 = x0(r2, r0, r1, r3)
            r0 = -1
            if (r2 != r0) goto L10
            return r4
        L10:
            int r2 = r2 + 1
            int r4 = r3.length()
            java.lang.String r2 = r3.substring(r2, r4)
            return r2
    }

    public static java.lang.String P0(java.lang.String r2, char r3) {
            r0 = 6
            r1 = 0
            int r3 = s0(r3, r1, r0, r2)
            r0 = -1
            if (r3 != r0) goto La
            return r2
        La:
            java.lang.String r2 = r2.substring(r1, r3)
            return r2
    }

    public static java.lang.String Q0(java.lang.String r2, java.lang.String r3) {
            r2.getClass()
            r2.getClass()
            r0 = 6
            r1 = 0
            int r3 = t0(r2, r3, r1, r1, r0)
            r0 = -1
            if (r3 != r0) goto L10
            return r2
        L10:
            java.lang.String r2 = r2.substring(r1, r3)
            return r2
    }

    public static java.lang.String R0(char r2, java.lang.String r3, java.lang.String r4) {
            r3.getClass()
            r4.getClass()
            r0 = 6
            r1 = 0
            int r2 = x0(r2, r1, r0, r3)
            r0 = -1
            if (r2 != r0) goto L10
            return r4
        L10:
            java.lang.String r2 = r3.substring(r1, r2)
            return r2
    }

    public static java.lang.String S0(int r1, java.lang.String r2) {
            r2.getClass()
            if (r1 < 0) goto L12
            int r0 = r2.length()
            if (r1 <= r0) goto Lc
            r1 = r0
        Lc:
            r0 = 0
            java.lang.String r1 = r2.substring(r0, r1)
            return r1
        L12:
            java.lang.String r2 = "Requested character count "
            java.lang.String r0 = " is less than zero."
            java.lang.String r1 = defpackage.lb1.k(r2, r1, r0)
            defpackage.i.f(r1)
            r1 = 0
            return r1
    }

    public static java.lang.CharSequence T0(java.lang.CharSequence r5) {
            r5.getClass()
            int r0 = r5.length()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = r2
        Lb:
            if (r2 > r0) goto L29
            if (r3 != 0) goto L11
            r4 = r2
            goto L12
        L11:
            r4 = r0
        L12:
            char r4 = r5.charAt(r4)
            boolean r4 = defpackage.g04.J(r4)
            if (r3 != 0) goto L23
            if (r4 != 0) goto L20
            r3 = r1
            goto Lb
        L20:
            int r2 = r2 + 1
            goto Lb
        L23:
            if (r4 != 0) goto L26
            goto L29
        L26:
            int r0 = r0 + (-1)
            goto Lb
        L29:
            int r0 = r0 + r1
            java.lang.CharSequence r5 = r5.subSequence(r2, r0)
            return r5
    }

    public static java.lang.String U0(java.lang.String r9, char... r10) {
            r9.getClass()
            int r0 = r9.length()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = r2
            r4 = r3
        Lc:
            if (r3 > r0) goto L38
            if (r4 != 0) goto L12
            r5 = r3
            goto L13
        L12:
            r5 = r0
        L13:
            char r5 = r9.charAt(r5)
            int r6 = r10.length
            r7 = r2
        L19:
            if (r7 >= r6) goto L23
            char r8 = r10[r7]
            if (r5 != r8) goto L20
            goto L24
        L20:
            int r7 = r7 + 1
            goto L19
        L23:
            r7 = -1
        L24:
            if (r7 < 0) goto L28
            r5 = r1
            goto L29
        L28:
            r5 = r2
        L29:
            if (r4 != 0) goto L32
            if (r5 != 0) goto L2f
            r4 = r1
            goto Lc
        L2f:
            int r3 = r3 + 1
            goto Lc
        L32:
            if (r5 != 0) goto L35
            goto L38
        L35:
            int r0 = r0 + (-1)
            goto Lc
        L38:
            int r0 = r0 + r1
            java.lang.CharSequence r9 = r9.subSequence(r3, r0)
            java.lang.String r9 = r9.toString()
            return r9
    }

    public static boolean j0(java.lang.CharSequence r8, java.lang.CharSequence r9, boolean r10) {
            r8.getClass()
            r9.getClass()
            boolean r0 = r9 instanceof java.lang.String
            r1 = 0
            if (r0 == 0) goto L15
            java.lang.String r9 = (java.lang.String) r9
            r0 = 2
            int r8 = t0(r8, r9, r1, r10, r0)
            if (r8 < 0) goto L26
            goto L24
        L15:
            int r5 = r8.length()
            r7 = 0
            r4 = 0
            r2 = r8
            r3 = r9
            r6 = r10
            int r8 = r0(r2, r3, r4, r5, r6, r7)
            if (r8 < 0) goto L26
        L24:
            r8 = 1
            return r8
        L26:
            return r1
    }

    public static boolean k0(java.lang.CharSequence r2, char r3) {
            r2.getClass()
            r0 = 2
            r1 = 0
            int r2 = s0(r3, r1, r0, r2)
            if (r2 < 0) goto Ld
            r2 = 1
            return r2
        Ld:
            return r1
    }

    public static boolean l0(java.lang.CharSequence r8, java.lang.String r9) {
            r8.getClass()
            boolean r0 = r8 instanceof java.lang.String
            if (r0 == 0) goto Lf
            java.lang.String r8 = (java.lang.String) r8
            r0 = 0
            boolean r8 = defpackage.xs6.Y(r8, r9, r0)
            return r8
        Lf:
            int r0 = r8.length()
            int r1 = r9.length()
            int r3 = r0 - r1
            r5 = 0
            int r6 = r9.length()
            r7 = 0
            r2 = r8
            r4 = r9
            boolean r8 = C0(r2, r3, r4, r5, r6, r7)
            return r8
    }

    public static boolean m0(java.lang.String r3, char r4) {
            int r0 = r3.length()
            r1 = 0
            if (r0 <= 0) goto L18
            int r0 = r3.length()
            r2 = 1
            int r0 = r0 - r2
            char r3 = r3.charAt(r0)
            boolean r3 = defpackage.g04.E(r3, r4, r1)
            if (r3 == 0) goto L18
            return r2
        L18:
            return r1
    }

    public static final defpackage.vr4 n0(java.lang.CharSequence r11, java.util.Collection r12, int r13) {
            int r0 = r12.size()
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 != r2) goto L4c
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            boolean r0 = r12 instanceof java.util.List
            if (r0 == 0) goto L16
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r12 = defpackage.gt0.b1(r12)
            goto L2b
        L16:
            java.util.Iterator r12 = r12.iterator()
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L46
            java.lang.Object r0 = r12.next()
            boolean r12 = r12.hasNext()
            if (r12 != 0) goto L40
            r12 = r0
        L2b:
            java.lang.String r12 = (java.lang.String) r12
            r0 = 4
            int r11 = t0(r11, r12, r13, r1, r0)
            if (r11 >= 0) goto L36
            goto Ldf
        L36:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            vr4 r13 = new vr4
            r13.<init>(r11, r12)
            return r13
        L40:
            java.lang.String r11 = "Collection has more than one element."
            defpackage.i.h(r11)
            return r3
        L46:
            java.lang.String r11 = "Collection is empty."
            defpackage.fa6.e(r11)
            return r3
        L4c:
            l93 r0 = new l93
            if (r13 >= 0) goto L51
            r13 = r1
        L51:
            int r4 = r11.length()
            r0.<init>(r13, r4, r2)
            boolean r2 = r11 instanceof java.lang.String
            int r4 = r0.L
            int r0 = r0.B
            if (r2 == 0) goto L9d
            if (r4 <= 0) goto L64
            if (r13 <= r0) goto L68
        L64:
            if (r4 >= 0) goto Ldf
            if (r0 > r13) goto Ldf
        L68:
            r2 = r12
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L6f:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L8a
            java.lang.Object r5 = r2.next()
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            r7 = r11
            java.lang.String r7 = (java.lang.String) r7
            int r8 = r6.length()
            boolean r6 = r6.regionMatches(r1, r7, r13, r8)
            if (r6 == 0) goto L6f
            goto L8b
        L8a:
            r5 = r3
        L8b:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L99
            java.lang.Integer r11 = java.lang.Integer.valueOf(r13)
            vr4 r12 = new vr4
            r12.<init>(r11, r5)
            return r12
        L99:
            if (r13 == r0) goto Ldf
            int r13 = r13 + r4
            goto L68
        L9d:
            if (r4 <= 0) goto La1
            if (r13 <= r0) goto La5
        La1:
            if (r4 >= 0) goto Ldf
            if (r0 > r13) goto Ldf
        La5:
            r8 = r13
        La6:
            r13 = r12
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.Iterator r13 = r13.iterator()
        Lad:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto Lca
            java.lang.Object r1 = r13.next()
            r5 = r1
            java.lang.String r5 = (java.lang.String) r5
            r6 = 0
            int r9 = r5.length()
            r10 = 0
            r7 = r11
            boolean r11 = C0(r5, r6, r7, r8, r9, r10)
            if (r11 == 0) goto Lc8
            goto Lcc
        Lc8:
            r11 = r7
            goto Lad
        Lca:
            r7 = r11
            r1 = r3
        Lcc:
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto Lda
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            vr4 r12 = new vr4
            r12.<init>(r11, r1)
            return r12
        Lda:
            if (r8 == r0) goto Ldf
            int r8 = r8 + r4
            r11 = r7
            goto La6
        Ldf:
            return r3
    }

    public static int o0(java.lang.CharSequence r0) {
            r0.getClass()
            int r0 = r0.length()
            int r0 = r0 + (-1)
            return r0
    }

    public static java.lang.Character p0(int r1, java.lang.String r2) {
            if (r1 < 0) goto L11
            int r0 = r2.length()
            if (r1 >= r0) goto L11
            char r1 = r2.charAt(r1)
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            return r1
        L11:
            r1 = 0
            return r1
    }

    public static final int q0(java.lang.CharSequence r6, java.lang.String r7, int r8, boolean r9) {
            r6.getClass()
            r7.getClass()
            if (r9 != 0) goto L14
            boolean r0 = r6 instanceof java.lang.String
            if (r0 != 0) goto Ld
            goto L14
        Ld:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = r6.indexOf(r7, r8)
            return r6
        L14:
            int r3 = r6.length()
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r9
            int r6 = r0(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static final int r0(java.lang.CharSequence r10, java.lang.CharSequence r11, int r12, int r13, boolean r14, boolean r15) {
            r0 = -1
            r1 = 0
            if (r15 != 0) goto L15
            l93 r15 = new l93
            if (r12 >= 0) goto L9
            r12 = r1
        L9:
            int r1 = r10.length()
            if (r13 <= r1) goto L10
            r13 = r1
        L10:
            r1 = 1
            r15.<init>(r12, r13, r1)
            goto L24
        L15:
            int r15 = o0(r10)
            if (r12 <= r15) goto L1c
            r12 = r15
        L1c:
            if (r13 >= 0) goto L1f
            r13 = r1
        L1f:
            j93 r15 = new j93
            r15.<init>(r12, r13, r0)
        L24:
            boolean r12 = r10 instanceof java.lang.String
            int r13 = r15.L
            int r1 = r15.B
            int r15 = r15.A
            if (r12 == 0) goto L53
            boolean r12 = r11 instanceof java.lang.String
            if (r12 == 0) goto L53
            if (r13 <= 0) goto L36
            if (r15 <= r1) goto L3a
        L36:
            if (r13 >= 0) goto L73
            if (r1 > r15) goto L73
        L3a:
            r3 = r15
        L3b:
            r5 = r11
            java.lang.String r5 = (java.lang.String) r5
            r6 = r10
            java.lang.String r6 = (java.lang.String) r6
            int r4 = r5.length()
            r2 = 0
            r7 = r14
            boolean r12 = defpackage.xs6.b0(r2, r3, r4, r5, r6, r7)
            if (r12 == 0) goto L4e
            return r3
        L4e:
            if (r3 == r1) goto L73
            int r3 = r3 + r13
            r14 = r7
            goto L3b
        L53:
            r7 = r14
            if (r13 <= 0) goto L58
            if (r15 <= r1) goto L5c
        L58:
            if (r13 >= 0) goto L73
            if (r1 > r15) goto L73
        L5c:
            r5 = 0
            int r8 = r11.length()
            r6 = r10
            r4 = r11
            r9 = r7
            r7 = r15
            boolean r10 = C0(r4, r5, r6, r7, r8, r9)
            r7 = r9
            if (r10 == 0) goto L6d
            return r15
        L6d:
            if (r15 == r1) goto L73
            int r15 = r15 + r13
            r11 = r4
            r10 = r6
            goto L5c
        L73:
            return r0
    }

    public static int s0(char r1, int r2, int r3, java.lang.CharSequence r4) {
            r3 = r3 & 2
            r0 = 0
            if (r3 == 0) goto L6
            r2 = r0
        L6:
            r4.getClass()
            boolean r3 = r4 instanceof java.lang.String
            if (r3 != 0) goto L17
            r3 = 1
            char[] r3 = new char[r3]
            r3[r0] = r1
            int r1 = u0(r4, r3, r2, r0)
            return r1
        L17:
            java.lang.String r4 = (java.lang.String) r4
            int r1 = r4.indexOf(r1, r2)
            return r1
    }

    public static /* synthetic */ int t0(java.lang.CharSequence r2, java.lang.String r3, int r4, boolean r5, int r6) {
            r0 = r6 & 2
            r1 = 0
            if (r0 == 0) goto L6
            r4 = r1
        L6:
            r6 = r6 & 4
            if (r6 == 0) goto Lb
            r5 = r1
        Lb:
            int r2 = q0(r2, r3, r4, r5)
            return r2
    }

    public static final int u0(java.lang.CharSequence r6, char[] r7, int r8, boolean r9) {
            r6.getClass()
            r0 = 1
            if (r9 != 0) goto L18
            int r1 = r7.length
            if (r1 != r0) goto L18
            boolean r1 = r6 instanceof java.lang.String
            if (r1 == 0) goto L18
            char r7 = defpackage.fv.O0(r7)
            java.lang.String r6 = (java.lang.String) r6
            int r6 = r6.indexOf(r7, r8)
            return r6
        L18:
            r1 = 0
            if (r8 >= 0) goto L1c
            r8 = r1
        L1c:
            int r2 = r6.length()
            int r2 = r2 - r0
            if (r8 > r2) goto L3c
        L23:
            char r0 = r6.charAt(r8)
            int r3 = r7.length
            r4 = r1
        L29:
            if (r4 >= r3) goto L37
            char r5 = r7[r4]
            boolean r5 = defpackage.g04.E(r5, r0, r9)
            if (r5 == 0) goto L34
            return r8
        L34:
            int r4 = r4 + 1
            goto L29
        L37:
            if (r8 == r2) goto L3c
            int r8 = r8 + 1
            goto L23
        L3c:
            r6 = -1
            return r6
    }

    public static boolean v0(java.lang.CharSequence r3) {
            r3.getClass()
            r0 = 0
            r1 = r0
        L5:
            int r2 = r3.length()
            if (r1 >= r2) goto L19
            char r2 = r3.charAt(r1)
            boolean r2 = defpackage.g04.J(r2)
            if (r2 != 0) goto L16
            return r0
        L16:
            int r1 = r1 + 1
            goto L5
        L19:
            r3 = 1
            return r3
    }

    public static char w0(java.lang.CharSequence r1) {
            r1.getClass()
            int r0 = r1.length()
            if (r0 == 0) goto L14
            int r0 = r1.length()
            int r0 = r0 + (-1)
            char r1 = r1.charAt(r0)
            return r1
        L14:
            java.lang.String r1 = "Char sequence is empty."
            defpackage.fa6.e(r1)
            r1 = 0
            return r1
    }

    public static int x0(char r2, int r3, int r4, java.lang.CharSequence r5) {
            r4 = r4 & 2
            if (r4 == 0) goto L8
            int r3 = o0(r5)
        L8:
            r5.getClass()
            boolean r4 = r5 instanceof java.lang.String
            if (r4 != 0) goto L40
            r4 = 1
            char[] r0 = new char[r4]
            r1 = 0
            r0[r1] = r2
            boolean r2 = r5 instanceof java.lang.String
            if (r2 == 0) goto L24
            char r2 = defpackage.fv.O0(r0)
            java.lang.String r5 = (java.lang.String) r5
            int r2 = r5.lastIndexOf(r2, r3)
            return r2
        L24:
            int r2 = r5.length()
            int r2 = r2 - r4
            if (r3 <= r2) goto L2c
            r3 = r2
        L2c:
            r2 = -1
            if (r2 >= r3) goto L3f
            char r2 = r5.charAt(r3)
            char r4 = r0[r1]
            boolean r2 = defpackage.g04.E(r4, r2, r1)
            if (r2 == 0) goto L3c
            return r3
        L3c:
            int r3 = r3 + (-1)
            goto L2c
        L3f:
            return r2
        L40:
            java.lang.String r5 = (java.lang.String) r5
            int r2 = r5.lastIndexOf(r2, r3)
            return r2
    }

    public static int y0(java.lang.CharSequence r6, java.lang.String r7, int r8, int r9) {
            r9 = r9 & 2
            if (r9 == 0) goto L8
            int r8 = o0(r6)
        L8:
            r2 = r8
            r6.getClass()
            r7.getClass()
            boolean r8 = r6 instanceof java.lang.String
            if (r8 != 0) goto L1d
            r3 = 0
            r5 = 1
            r4 = 0
            r0 = r6
            r1 = r7
            int r6 = r0(r0, r1, r2, r3, r4, r5)
            return r6
        L1d:
            r0 = r6
            r1 = r7
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            int r6 = r6.lastIndexOf(r1, r2)
            return r6
    }

    public static java.util.List z0(java.lang.CharSequence r2) {
            r2.getClass()
            kv3 r0 = new kv3
            r0.<init>(r2)
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L11
            yt1 r2 = defpackage.yt1.A
            goto L37
        L11:
            java.lang.Object r2 = r0.next()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L20
            java.util.List r2 = defpackage.hf.b0(r2)
            goto L37
        L20:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r2)
        L28:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L36
            java.lang.Object r2 = r0.next()
            r1.add(r2)
            goto L28
        L36:
            r2 = r1
        L37:
            return r2
    }
}

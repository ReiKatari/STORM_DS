package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xs6  reason: default package */
/* loaded from: classes.dex */
public abstract class xs6 extends defpackage.ws6 {
    public static java.lang.String V(char[] r1, int r2, int r3) {
            int r0 = r1.length
            defpackage.hf.C(r2, r3, r0)
            java.lang.String r0 = new java.lang.String
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static java.lang.String W(int r1, byte[] r2, int r3, int r4) {
            r4 = r4 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r2.getClass()
            int r4 = r2.length
            defpackage.hf.C(r1, r3, r4)
            java.lang.String r4 = new java.lang.String
            int r3 = r3 - r1
            java.nio.charset.Charset r0 = defpackage.qm0.a
            r4.<init>(r2, r1, r3, r0)
            return r4
    }

    public static byte[] X(java.lang.String r1) {
            r1.getClass()
            java.nio.charset.Charset r0 = defpackage.qm0.a
            byte[] r1 = r1.getBytes(r0)
            r1.getClass()
            return r1
    }

    public static boolean Y(java.lang.String r7, java.lang.String r8, boolean r9) {
            r7.getClass()
            r8.getClass()
            if (r9 != 0) goto Ld
            boolean r7 = r7.endsWith(r8)
            return r7
        Ld:
            int r9 = r7.length()
            int r0 = r8.length()
            int r3 = r9 - r0
            int r6 = r8.length()
            r2 = 1
            r5 = 0
            r1 = r7
            r4 = r8
            boolean r7 = r1.regionMatches(r2, r3, r4, r5, r6)
            return r7
    }

    public static boolean Z(java.lang.String r0, java.lang.String r1, boolean r2) {
            if (r0 != 0) goto L8
            if (r1 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
        L8:
            if (r2 != 0) goto Lf
            boolean r0 = r0.equals(r1)
            return r0
        Lf:
            boolean r0 = r0.equalsIgnoreCase(r1)
            return r0
    }

    public static final void a0(java.lang.String r3) {
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = "Invalid number format: '"
            r2 = 39
            java.lang.String r3 = defpackage.i61.k(r2, r1, r3)
            r0.<init>(r3)
            throw r0
    }

    public static boolean b0(int r6, int r7, int r8, java.lang.String r9, java.lang.String r10, boolean r11) {
            r9.getClass()
            r10.getClass()
            if (r11 != 0) goto Ld
            boolean r6 = r9.regionMatches(r6, r10, r7, r8)
            return r6
        Ld:
            r2 = r6
            r4 = r7
            r5 = r8
            r0 = r9
            r3 = r10
            r1 = r11
            boolean r6 = r0.regionMatches(r1, r2, r3, r4, r5)
            return r6
    }

    public static java.lang.String c0(int r3, java.lang.String r4) {
            r4.getClass()
            if (r3 < 0) goto L47
            if (r3 == 0) goto L44
            r0 = 1
            if (r3 == r0) goto L3f
            int r1 = r4.length()
            if (r1 == 0) goto L44
            if (r1 == r0) goto L2b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r2 = r4.length()
            int r2 = r2 * r3
            r1.<init>(r2)
            if (r0 > r3) goto L26
        L1e:
            r1.append(r4)
            if (r0 == r3) goto L26
            int r0 = r0 + 1
            goto L1e
        L26:
            java.lang.String r3 = r1.toString()
            return r3
        L2b:
            r0 = 0
            char r4 = r4.charAt(r0)
            char[] r1 = new char[r3]
        L32:
            if (r0 >= r3) goto L39
            r1[r0] = r4
            int r0 = r0 + 1
            goto L32
        L39:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r1)
            return r3
        L3f:
            java.lang.String r3 = r4.toString()
            return r3
        L44:
            java.lang.String r3 = ""
            return r3
        L47:
            java.lang.String r4 = "Count 'n' must be non-negative, but was "
            r0 = 46
            java.lang.String r3 = defpackage.xg6.o(r4, r3, r0)
            defpackage.i.f(r3)
            r3 = 0
            return r3
    }

    public static java.lang.String d0(java.lang.String r0, char r1, char r2) {
            r0.getClass()
            java.lang.String r0 = r0.replace(r1, r2)
            r0.getClass()
            return r0
    }

    public static java.lang.String e0(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            r7.getClass()
            r0 = 0
            int r1 = defpackage.qs6.q0(r7, r8, r0, r0)
            if (r1 >= 0) goto Lb
            return r7
        Lb:
            int r2 = r8.length()
            r3 = 1
            if (r2 >= r3) goto L13
            goto L14
        L13:
            r3 = r2
        L14:
            int r4 = r7.length()
            int r4 = r4 - r2
            int r5 = r9.length()
            int r5 = r5 + r4
            if (r5 < 0) goto L47
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r5)
            r5 = r0
        L26:
            r4.append(r7, r5, r1)
            r4.append(r9)
            int r5 = r1 + r2
            int r6 = r7.length()
            if (r1 >= r6) goto L3b
            int r1 = r1 + r3
            int r1 = defpackage.qs6.q0(r7, r8, r1, r0)
            if (r1 > 0) goto L26
        L3b:
            int r8 = r7.length()
            r4.append(r7, r5, r8)
            java.lang.String r7 = r4.toString()
            return r7
        L47:
            java.lang.OutOfMemoryError r7 = new java.lang.OutOfMemoryError
            r7.<init>()
            throw r7
    }

    public static boolean f0(java.lang.String r6, java.lang.String r7, int r8, boolean r9) {
            r6.getClass()
            if (r9 != 0) goto La
            boolean r6 = r6.startsWith(r7, r8)
            return r6
        La:
            r1 = 0
            int r2 = r7.length()
            r3 = r6
            r4 = r7
            r0 = r8
            r5 = r9
            boolean r6 = b0(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static boolean g0(java.lang.String r6, java.lang.String r7, boolean r8) {
            r6.getClass()
            r7.getClass()
            if (r8 != 0) goto Ld
            boolean r6 = r6.startsWith(r7)
            return r6
        Ld:
            r1 = 0
            int r2 = r7.length()
            r0 = 0
            r3 = r6
            r4 = r7
            r5 = r8
            boolean r6 = b0(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static java.lang.Integer h0(java.lang.String r10) {
            r10.getClass()
            r0 = 10
            defpackage.g04.y(r0)
            int r1 = r10.length()
            if (r1 != 0) goto Lf
            goto L54
        Lf:
            r2 = 0
            char r3 = r10.charAt(r2)
            r4 = 48
            int r4 = defpackage.nb3.p(r3, r4)
            r5 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            if (r4 >= 0) goto L32
            r4 = 1
            if (r1 != r4) goto L23
            goto L54
        L23:
            r6 = 43
            if (r3 == r6) goto L30
            r5 = 45
            if (r3 == r5) goto L2c
            goto L54
        L2c:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r4
            goto L34
        L30:
            r3 = r2
            goto L34
        L32:
            r3 = r2
            r4 = r3
        L34:
            r6 = -59652323(0xfffffffffc71c71d, float:-5.0215282E36)
            r7 = r6
        L38:
            if (r4 >= r1) goto L5a
            char r8 = r10.charAt(r4)
            int r8 = java.lang.Character.digit(r8, r0)
            if (r8 >= 0) goto L45
            goto L54
        L45:
            if (r2 >= r7) goto L4e
            if (r7 != r6) goto L54
            int r7 = r5 / 10
            if (r2 >= r7) goto L4e
            goto L54
        L4e:
            int r2 = r2 * 10
            int r9 = r5 + r8
            if (r2 >= r9) goto L56
        L54:
            r10 = 0
            return r10
        L56:
            int r2 = r2 - r8
            int r4 = r4 + 1
            goto L38
        L5a:
            if (r3 == 0) goto L61
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
            return r10
        L61:
            int r10 = -r2
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            return r10
    }

    public static java.lang.Long i0(java.lang.String r19) {
            r0 = r19
            r0.getClass()
            r1 = 10
            defpackage.g04.y(r1)
            int r2 = r0.length()
            if (r2 != 0) goto L11
            goto L69
        L11:
            r3 = 0
            char r4 = r0.charAt(r3)
            r5 = 48
            int r5 = defpackage.nb3.p(r4, r5)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r5 >= 0) goto L3a
            r5 = 1
            if (r2 != r5) goto L27
            goto L69
        L27:
            r8 = 43
            if (r4 == r8) goto L34
            r3 = 45
            if (r4 == r3) goto L30
            goto L69
        L30:
            r6 = -9223372036854775808
            r3 = r5
            goto L3b
        L34:
            r18 = r5
            r5 = r3
            r3 = r18
            goto L3b
        L3a:
            r5 = r3
        L3b:
            r8 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            r10 = 0
            r12 = r8
        L43:
            if (r3 >= r2) goto L6f
            char r4 = r0.charAt(r3)
            int r4 = java.lang.Character.digit(r4, r1)
            if (r4 >= 0) goto L50
            goto L69
        L50:
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            r15 = 10
            if (r14 >= 0) goto L61
            int r12 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r12 != 0) goto L69
            long r12 = r6 / r15
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 >= 0) goto L61
            goto L69
        L61:
            long r10 = r10 * r15
            long r14 = (long) r4
            long r16 = r6 + r14
            int r4 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r4 >= 0) goto L6b
        L69:
            r0 = 0
            return r0
        L6b:
            long r10 = r10 - r14
            int r3 = r3 + 1
            goto L43
        L6f:
            if (r5 == 0) goto L76
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            return r0
        L76:
            long r0 = -r10
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
    }
}

package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i54  reason: default package */
/* loaded from: classes.dex */
public final class i54 implements defpackage.j66 {
    public static final int[] o = null;
    public static final sun.misc.Unsafe p = null;
    public final int[] a;
    public final java.lang.Object[] b;
    public final int c;
    public final int d;
    public final defpackage.c1 e;
    public final boolean f;
    public final boolean g;
    public final int[] h;
    public final int i;
    public final int j;
    public final defpackage.mf4 k;
    public final defpackage.ow3 l;
    public final defpackage.ng7 m;
    public final defpackage.y04 n;

    static {
            r0 = 0
            int[] r0 = new int[r0]
            defpackage.i54.o = r0
            sun.misc.Unsafe r0 = defpackage.gh7.i()
            defpackage.i54.p = r0
            return
    }

    public i54(int[] r1, java.lang.Object[] r2, int r3, int r4, defpackage.c1 r5, boolean r6, int[] r7, int r8, int r9, defpackage.mf4 r10, defpackage.ow3 r11, defpackage.ng7 r12, defpackage.i82 r13, defpackage.y04 r14) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            boolean r1 = r5 instanceof defpackage.pr2
            r0.f = r1
            r0.g = r6
            r0.h = r7
            r0.i = r8
            r0.j = r9
            r0.k = r10
            r0.l = r11
            r0.m = r12
            r0.e = r5
            r0.n = r14
            return
    }

    public static long A(int r2) {
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r0
            long r0 = (long) r2
            return r0
    }

    public static int B(long r1, java.lang.Object r3) {
            fh7 r0 = defpackage.gh7.d
            java.lang.Object r1 = r0.i(r1, r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            return r1
    }

    public static long C(long r1, java.lang.Object r3) {
            fh7 r0 = defpackage.gh7.d
            java.lang.Object r1 = r0.i(r1, r3)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            return r1
    }

    public static java.lang.reflect.Field K(java.lang.Class r5, java.lang.String r6) {
            java.lang.reflect.Field r5 = r5.getDeclaredField(r6)     // Catch: java.lang.NoSuchFieldException -> L5
            return r5
        L5:
            java.lang.reflect.Field[] r0 = r5.getDeclaredFields()
            int r1 = r0.length
            r2 = 0
        Lb:
            if (r2 >= r1) goto L1d
            r3 = r0[r2]
            java.lang.String r4 = r3.getName()
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L1a
            return r3
        L1a:
            int r2 = r2 + 1
            goto Lb
        L1d:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Field "
            java.lang.String r3 = " for "
            java.lang.StringBuilder r6 = defpackage.i61.t(r2, r6, r3)
            java.lang.String r5 = r5.getName()
            r6.append(r5)
            java.lang.String r5 = " not found. Known fields are "
            r6.append(r5)
            java.lang.String r5 = java.util.Arrays.toString(r0)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r1.<init>(r5)
            throw r1
    }

    public static int O(int r1) {
            r0 = 267386880(0xff00000, float:2.3665827E-29)
            r1 = r1 & r0
            int r1 = r1 >>> 20
            return r1
    }

    public static void R(int r5, java.lang.Object r6, defpackage.os0 r7) {
            boolean r0 = r6 instanceof java.lang.String
            if (r0 == 0) goto L7e
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r7.B
            ms0 r7 = (defpackage.ms0) r7
            r0 = 2
            r7.r(r5, r0)
            int r5 = r7.c
            byte[] r0 = r7.b
            int r1 = r7.d
            int r2 = r6.length()     // Catch: defpackage.wj7 -> L3e java.lang.IndexOutOfBoundsException -> L53
            int r2 = r2 * 3
            int r2 = defpackage.ms0.i(r2)     // Catch: defpackage.wj7 -> L3e java.lang.IndexOutOfBoundsException -> L53
            int r3 = r6.length()     // Catch: defpackage.wj7 -> L3e java.lang.IndexOutOfBoundsException -> L53
            int r3 = defpackage.ms0.i(r3)     // Catch: defpackage.wj7 -> L3e java.lang.IndexOutOfBoundsException -> L53
            if (r3 != r2) goto L40
            int r2 = r1 + r3
            r7.d = r2     // Catch: defpackage.wj7 -> L3e java.lang.IndexOutOfBoundsException -> L53
            int r5 = r5 - r2
            nj2 r4 = defpackage.xj7.a     // Catch: defpackage.wj7 -> L3e java.lang.IndexOutOfBoundsException -> L53
            int r5 = r4.n(r6, r0, r2, r5)     // Catch: defpackage.wj7 -> L3e java.lang.IndexOutOfBoundsException -> L53
            r7.d = r1     // Catch: defpackage.wj7 -> L3e java.lang.IndexOutOfBoundsException -> L53
            int r0 = r5 - r1
            int r0 = r0 - r3
            r7.s(r0)     // Catch: defpackage.wj7 -> L3e java.lang.IndexOutOfBoundsException -> L53
            r7.d = r5     // Catch: defpackage.wj7 -> L3e java.lang.IndexOutOfBoundsException -> L53
            return
        L3e:
            r5 = move-exception
            goto L5a
        L40:
            int r2 = defpackage.xj7.b(r6)     // Catch: defpackage.wj7 -> L3e java.lang.IndexOutOfBoundsException -> L53
            r7.s(r2)     // Catch: defpackage.wj7 -> L3e java.lang.IndexOutOfBoundsException -> L53
            int r2 = r7.d     // Catch: defpackage.wj7 -> L3e java.lang.IndexOutOfBoundsException -> L53
            int r5 = r5 - r2
            nj2 r3 = defpackage.xj7.a     // Catch: defpackage.wj7 -> L3e java.lang.IndexOutOfBoundsException -> L53
            int r5 = r3.n(r6, r0, r2, r5)     // Catch: defpackage.wj7 -> L3e java.lang.IndexOutOfBoundsException -> L53
            r7.d = r5     // Catch: defpackage.wj7 -> L3e java.lang.IndexOutOfBoundsException -> L53
            return
        L53:
            r5 = move-exception
            ns0 r6 = new ns0
            r6.<init>(r5)
            throw r6
        L5a:
            r7.d = r1
            java.util.logging.Logger r0 = defpackage.ms0.e
            java.util.logging.Level r1 = java.util.logging.Level.WARNING
            java.lang.String r2 = "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!"
            r0.log(r1, r2, r5)
            java.nio.charset.Charset r5 = defpackage.aa3.a
            byte[] r5 = r6.getBytes(r5)
            int r6 = r5.length     // Catch: defpackage.ns0 -> L75 java.lang.IndexOutOfBoundsException -> L77
            r7.s(r6)     // Catch: defpackage.ns0 -> L75 java.lang.IndexOutOfBoundsException -> L77
            int r6 = r5.length     // Catch: defpackage.ns0 -> L75 java.lang.IndexOutOfBoundsException -> L77
            r0 = 0
            r7.l(r5, r0, r6)     // Catch: defpackage.ns0 -> L75 java.lang.IndexOutOfBoundsException -> L77
            return
        L75:
            r5 = move-exception
            throw r5
        L77:
            r5 = move-exception
            ns0 r6 = new ns0
            r6.<init>(r5)
            throw r6
        L7e:
            ea0 r6 = (defpackage.ea0) r6
            r7.i0(r5, r6)
            return
    }

    public static defpackage.mg7 p(java.lang.Object r2) {
            pr2 r2 = (defpackage.pr2) r2
            mg7 r0 = r2.unknownFields
            mg7 r1 = defpackage.mg7.f
            if (r0 != r1) goto Le
            mg7 r0 = defpackage.mg7.b()
            r2.unknownFields = r0
        Le:
            return r0
    }

    public static java.util.List u(long r1, java.lang.Object r3) {
            fh7 r0 = defpackage.gh7.d
            java.lang.Object r1 = r0.i(r1, r3)
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    public static defpackage.i54 y(defpackage.wd5 r1, defpackage.mf4 r2, defpackage.ow3 r3, defpackage.ng7 r4, defpackage.i82 r5, defpackage.y04 r6) {
            boolean r0 = r1 instanceof defpackage.wd5
            if (r0 == 0) goto L9
            i54 r1 = z(r1, r2, r3, r4, r5, r6)
            return r1
        L9:
            defpackage.u34.a()
            r1 = 0
            return r1
    }

    public static defpackage.i54 z(defpackage.wd5 r35, defpackage.mf4 r36, defpackage.ow3 r37, defpackage.ng7 r38, defpackage.i82 r39, defpackage.y04 r40) {
            r0 = r35
            int r1 = r0.d
            r2 = 1
            r1 = r1 & r2
            if (r1 != r2) goto Lb
            u45 r1 = defpackage.u45.PROTO2
            goto Ld
        Lb:
            u45 r1 = defpackage.u45.PROTO3
        Ld:
            u45 r3 = defpackage.u45.PROTO3
            r4 = 0
            if (r1 != r3) goto L14
            r11 = r2
            goto L15
        L14:
            r11 = r4
        L15:
            java.lang.String r1 = r0.b
            int r3 = r1.length()
            char r5 = r1.charAt(r4)
            r7 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r7) goto L3c
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r8 = r2
            r9 = 13
        L29:
            int r10 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L39
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r5 = r5 | r8
            int r9 = r9 + 13
            r8 = r10
            goto L29
        L39:
            int r8 = r8 << r9
            r5 = r5 | r8
            goto L3d
        L3c:
            r10 = r2
        L3d:
            int r8 = r10 + 1
            char r9 = r1.charAt(r10)
            if (r9 < r7) goto L5c
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L49:
            int r12 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L59
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r10
            r9 = r9 | r8
            int r10 = r10 + 13
            r8 = r12
            goto L49
        L59:
            int r8 = r8 << r10
            r9 = r9 | r8
            r8 = r12
        L5c:
            if (r9 != 0) goto L69
            int[] r9 = defpackage.i54.o
            r6 = r4
            r10 = r6
            r13 = r10
            r14 = r13
            r15 = r14
            r12 = r9
            r9 = r15
            goto L185
        L69:
            int r9 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L88
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L75:
            int r12 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r7) goto L85
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r10
            r8 = r8 | r9
            int r10 = r10 + 13
            r9 = r12
            goto L75
        L85:
            int r9 = r9 << r10
            r8 = r8 | r9
            r9 = r12
        L88:
            int r10 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r7) goto La7
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L94:
            int r13 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r7) goto La4
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r12
            r9 = r9 | r10
            int r12 = r12 + 13
            r10 = r13
            goto L94
        La4:
            int r10 = r10 << r12
            r9 = r9 | r10
            r10 = r13
        La7:
            int r12 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r7) goto Lc6
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        Lb3:
            int r14 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r7) goto Lc3
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r10 = r10 | r12
            int r13 = r13 + 13
            r12 = r14
            goto Lb3
        Lc3:
            int r12 = r12 << r13
            r10 = r10 | r12
            r12 = r14
        Lc6:
            int r13 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r7) goto Le5
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        Ld2:
            int r15 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r7) goto Le2
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto Ld2
        Le2:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        Le5:
            int r14 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r7) goto L106
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        Lf1:
            int r16 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r7) goto L102
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto Lf1
        L102:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L106:
            int r15 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r7) goto L129
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L112:
            int r17 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r7) goto L124
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L112
        L124:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L129:
            int r16 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r7) goto L14f
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r4 = r16
            r16 = 13
        L137:
            int r18 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r7) goto L149
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r16
            r15 = r15 | r4
            int r16 = r16 + 13
            r4 = r18
            goto L137
        L149:
            int r4 = r4 << r16
            r15 = r15 | r4
            r4 = r18
            goto L151
        L14f:
            r4 = r16
        L151:
            int r16 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r7) goto L176
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r6 = r16
            r16 = 13
        L15f:
            int r19 = r6 + 1
            char r6 = r1.charAt(r6)
            if (r6 < r7) goto L171
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r16
            r4 = r4 | r6
            int r16 = r16 + 13
            r6 = r19
            goto L15f
        L171:
            int r6 = r6 << r16
            r4 = r4 | r6
            r16 = r19
        L176:
            int r6 = r4 + r14
            int r6 = r6 + r15
            int[] r6 = new int[r6]
            int r15 = r8 * 2
            int r15 = r15 + r9
            r9 = r12
            r12 = r6
            r6 = r13
            r13 = r4
            r4 = r8
            r8 = r16
        L185:
            sun.misc.Unsafe r2 = defpackage.i54.p
            java.lang.Object[] r7 = r0.c
            r20 = r4
            c1 r4 = r0.a
            java.lang.Class r4 = r4.getClass()
            r21 = r5
            int r5 = r6 * 3
            int[] r5 = new int[r5]
            int r6 = r6 * 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            int r14 = r14 + r13
            r24 = r13
            r25 = r14
            r22 = 0
            r23 = 0
        L1a4:
            if (r8 >= r3) goto L3fa
            int r26 = r8 + 1
            char r8 = r1.charAt(r8)
            r27 = r3
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r8 < r3) goto L1d8
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r3 = r26
            r26 = 13
        L1b9:
            int r28 = r3 + 1
            char r3 = r1.charAt(r3)
            r29 = r5
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r5) goto L1d2
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r26
            r8 = r8 | r3
            int r26 = r26 + 13
            r3 = r28
            r5 = r29
            goto L1b9
        L1d2:
            int r3 = r3 << r26
            r8 = r8 | r3
            r3 = r28
            goto L1dc
        L1d8:
            r29 = r5
            r3 = r26
        L1dc:
            int r5 = r3 + 1
            char r3 = r1.charAt(r3)
            r26 = r5
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r5) goto L20e
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r5 = r26
            r26 = 13
        L1ef:
            int r28 = r5 + 1
            char r5 = r1.charAt(r5)
            r30 = r3
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r3) goto L207
            r3 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r26
            r3 = r30 | r3
            int r26 = r26 + 13
            r5 = r28
            goto L1ef
        L207:
            int r3 = r5 << r26
            r3 = r30 | r3
            r5 = r28
            goto L210
        L20e:
            r5 = r26
        L210:
            r26 = r6
            r6 = r3 & 255(0xff, float:3.57E-43)
            r28 = r7
            r7 = r3 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L220
            int r7 = r22 + 1
            r12[r22] = r23
            r22 = r7
        L220:
            r7 = 51
            r32 = r8
            if (r6 < r7) goto L2c6
            int r7 = r5 + 1
            char r5 = r1.charAt(r5)
            r8 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r8) goto L24f
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r33 = 13
        L235:
            int r34 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r8) goto L24a
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r33
            r5 = r5 | r7
            int r33 = r33 + 13
            r7 = r34
            r8 = 55296(0xd800, float:7.7486E-41)
            goto L235
        L24a:
            int r7 = r7 << r33
            r5 = r5 | r7
            r7 = r34
        L24f:
            int r8 = r6 + (-51)
            r33 = r5
            r5 = 9
            if (r8 == r5) goto L272
            r5 = 17
            if (r8 != r5) goto L25c
            goto L272
        L25c:
            r5 = 12
            if (r8 != r5) goto L281
            r5 = r21 & 1
            r8 = 1
            if (r5 != r8) goto L281
            int r5 = r23 / 3
            int r5 = r5 * 2
            int r5 = r5 + r8
            int r8 = r15 + 1
            r15 = r28[r15]
            r26[r5] = r15
        L270:
            r15 = r8
            goto L281
        L272:
            int r5 = r23 / 3
            int r5 = r5 * 2
            r16 = 1
            int r5 = r5 + 1
            int r8 = r15 + 1
            r15 = r28[r15]
            r26[r5] = r15
            goto L270
        L281:
            int r5 = r33 * 2
            r8 = r28[r5]
            r30 = r5
            boolean r5 = r8 instanceof java.lang.reflect.Field
            if (r5 == 0) goto L28f
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8
        L28d:
            r5 = r7
            goto L298
        L28f:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = K(r4, r8)
            r28[r30] = r8
            goto L28d
        L298:
            long r7 = r2.objectFieldOffset(r8)
            int r7 = (int) r7
            int r8 = r30 + 1
            r30 = r5
            r5 = r28[r8]
            r31 = r7
            boolean r7 = r5 instanceof java.lang.reflect.Field
            if (r7 == 0) goto L2ac
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            goto L2b4
        L2ac:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.reflect.Field r5 = K(r4, r5)
            r28[r8] = r5
        L2b4:
            long r7 = r2.objectFieldOffset(r5)
            int r5 = (int) r7
            r7 = r15
            r15 = r10
            r10 = r7
            r8 = r30
            r7 = r31
            r30 = r9
            r9 = r5
            r5 = 0
            goto L3c3
        L2c6:
            int r7 = r15 + 1
            r8 = r28[r15]
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = K(r4, r8)
            r33 = r7
            r7 = 9
            if (r6 == r7) goto L2da
            r7 = 17
            if (r6 != r7) goto L2df
        L2da:
            r30 = r9
            r9 = 1
            goto L34b
        L2df:
            r7 = 27
            if (r6 == r7) goto L2e7
            r7 = 49
            if (r6 != r7) goto L2eb
        L2e7:
            r30 = r9
            r9 = 1
            goto L33f
        L2eb:
            r7 = 12
            if (r6 == r7) goto L32a
            r7 = 30
            if (r6 == r7) goto L32a
            r7 = 44
            if (r6 != r7) goto L2f8
            goto L32a
        L2f8:
            r7 = 50
            if (r6 != r7) goto L326
            int r7 = r24 + 1
            r12[r24] = r23
            int r24 = r23 / 3
            int r24 = r24 * 2
            int r30 = r15 + 2
            r31 = r28[r33]
            r26[r24] = r31
            r31 = r7
            r7 = r3 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L31e
            int r24 = r24 + 1
            int r7 = r15 + 3
            r15 = r28[r30]
            r26[r24] = r15
            r30 = r9
            r15 = r10
            r24 = r31
            goto L359
        L31e:
            r15 = r10
            r7 = r30
            r24 = r31
            r30 = r9
            goto L359
        L326:
            r30 = r9
            r9 = 1
            goto L356
        L32a:
            r7 = r21 & 1
            r30 = r9
            r9 = 1
            if (r7 != r9) goto L356
            int r7 = r23 / 3
            int r7 = r7 * 2
            int r7 = r7 + r9
            int r15 = r15 + 2
            r16 = r28[r33]
            r26[r7] = r16
        L33c:
            r7 = r15
            r15 = r10
            goto L359
        L33f:
            int r7 = r23 / 3
            int r7 = r7 * 2
            int r7 = r7 + r9
            int r15 = r15 + 2
            r16 = r28[r33]
            r26[r7] = r16
            goto L33c
        L34b:
            int r7 = r23 / 3
            int r7 = r7 * 2
            int r7 = r7 + r9
            java.lang.Class r15 = r8.getType()
            r26[r7] = r15
        L356:
            r15 = r10
            r7 = r33
        L359:
            long r9 = r2.objectFieldOffset(r8)
            int r8 = (int) r9
            r9 = r21 & 1
            r10 = 1
            if (r9 != r10) goto L3ad
            r9 = 17
            if (r6 > r9) goto L3ad
            int r9 = r5 + 1
            char r5 = r1.charAt(r5)
            r10 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r10) goto L38c
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r19 = 13
        L376:
            int r31 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r10) goto L388
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r19
            r5 = r5 | r9
            int r19 = r19 + 13
            r9 = r31
            goto L376
        L388:
            int r9 = r9 << r19
            r5 = r5 | r9
            goto L38e
        L38c:
            r31 = r9
        L38e:
            int r9 = r20 * 2
            int r19 = r5 / 32
            int r19 = r19 + r9
            r9 = r28[r19]
            boolean r10 = r9 instanceof java.lang.reflect.Field
            if (r10 == 0) goto L39d
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            goto L3a5
        L39d:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = K(r4, r9)
            r28[r19] = r9
        L3a5:
            long r9 = r2.objectFieldOffset(r9)
            int r9 = (int) r9
            int r5 = r5 % 32
            goto L3b1
        L3ad:
            r31 = r5
            r5 = 0
            r9 = 0
        L3b1:
            r10 = 18
            if (r6 < r10) goto L3bf
            r10 = 49
            if (r6 > r10) goto L3bf
            int r10 = r25 + 1
            r12[r25] = r8
            r25 = r10
        L3bf:
            r10 = r7
            r7 = r8
            r8 = r31
        L3c3:
            int r19 = r23 + 1
            r29[r23] = r32
            int r31 = r23 + 2
            r32 = r1
            r1 = r3 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L3d2
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            goto L3d3
        L3d2:
            r1 = 0
        L3d3:
            r3 = r3 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L3da
            r3 = 268435456(0x10000000, float:2.524355E-29)
            goto L3db
        L3da:
            r3 = 0
        L3db:
            r1 = r1 | r3
            int r3 = r6 << 20
            r1 = r1 | r3
            r1 = r1 | r7
            r29[r19] = r1
            int r23 = r23 + 3
            int r1 = r5 << 20
            r1 = r1 | r9
            r29[r31] = r1
            r1 = r15
            r15 = r10
            r10 = r1
            r6 = r26
            r3 = r27
            r7 = r28
            r5 = r29
            r9 = r30
            r1 = r32
            goto L1a4
        L3fa:
            r29 = r5
            r26 = r6
            r30 = r9
            r15 = r10
            i54 r5 = new i54
            c1 r10 = r0.a
            r16 = r37
            r17 = r38
            r18 = r39
            r19 = r40
            r8 = r15
            r7 = r26
            r6 = r29
            r15 = r36
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r5
    }

    public final void D(java.lang.Object r3, long r4, int r6) {
            r2 = this;
            sun.misc.Unsafe r0 = defpackage.i54.p
            java.lang.Object r6 = r2.n(r6)
            java.lang.Object r1 = r0.getObject(r3, r4)
            y04 r2 = r2.n
            r2.getClass()
            r2 = r1
            x04 r2 = (defpackage.x04) r2
            boolean r2 = r2.A
            if (r2 != 0) goto L22
            x04 r2 = defpackage.x04.B
            x04 r2 = r2.c()
            defpackage.y04.b(r2, r1)
            r0.putObject(r3, r4, r2)
        L22:
            defpackage.xg6.A(r6)
            r2 = 0
            throw r2
    }

    public final int E(java.lang.Object r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, defpackage.ou r29) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r21
            r8 = r22
            r3 = r23
            r9 = r26
            r4 = r28
            sun.misc.Unsafe r11 = defpackage.i54.p
            int r5 = r4 + 2
            int[] r6 = r0.a
            r5 = r6[r5]
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r6
            long r12 = (long) r5
            r5 = 5
            r14 = 0
            r6 = 1
            r7 = 2
            switch(r25) {
                case 51: goto L1e3;
                case 52: goto L1c8;
                case 53: goto L1af;
                case 54: goto L1af;
                case 55: goto L196;
                case 56: goto L17f;
                case 57: goto L168;
                case 58: goto L147;
                case 59: goto L10c;
                case 60: goto Ldd;
                case 61: goto Lc8;
                case 62: goto L196;
                case 63: goto L95;
                case 64: goto L168;
                case 65: goto L17f;
                case 66: goto L78;
                case 67: goto L5b;
                case 68: goto L26;
                default: goto L22;
            }
        L22:
            r15 = r19
            goto L1fe
        L26:
            r5 = 3
            if (r3 != r5) goto L22
            r2 = r2 & (-8)
            r6 = r2 | 4
            j66 r2 = r0.o(r4)
            r3 = r18
            r4 = r19
            r5 = r20
            r7 = r29
            int r0 = defpackage.hv.p(r2, r3, r4, r5, r6, r7)
            r5 = r7
            int r2 = r11.getInt(r1, r12)
            if (r2 != r8) goto L48
            java.lang.Object r14 = r11.getObject(r1, r9)
        L48:
            java.lang.Object r2 = r5.c
            if (r14 != 0) goto L50
            r11.putObject(r1, r9, r2)
            goto L57
        L50:
            pr2 r2 = defpackage.aa3.c(r14, r2)
            r11.putObject(r1, r9, r2)
        L57:
            r11.putInt(r1, r12, r8)
            return r0
        L5b:
            r6 = r18
            r15 = r19
            r5 = r29
            if (r3 != 0) goto L1fe
            int r0 = defpackage.hv.y(r6, r15, r5)
            long r2 = r5.b
            long r2 = defpackage.ks0.b(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r11.putObject(r1, r9, r2)
            r11.putInt(r1, r12, r8)
            return r0
        L78:
            r6 = r18
            r15 = r19
            r5 = r29
            if (r3 != 0) goto L1fe
            int r0 = defpackage.hv.w(r6, r15, r5)
            int r2 = r5.a
            int r2 = defpackage.ks0.a(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r11.putObject(r1, r9, r2)
            r11.putInt(r1, r12, r8)
            return r0
        L95:
            r6 = r18
            r15 = r19
            r5 = r29
            if (r3 != 0) goto L1fe
            int r3 = defpackage.hv.w(r6, r15, r5)
            int r5 = r5.a
            y93 r0 = r0.m(r4)
            if (r0 == 0) goto Lbd
            boolean r0 = r0.a(r5)
            if (r0 == 0) goto Lb0
            goto Lbd
        Lb0:
            mg7 r0 = p(r1)
            long r4 = (long) r5
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r0.c(r2, r1)
            return r3
        Lbd:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r11.putObject(r1, r9, r0)
            r11.putInt(r1, r12, r8)
            return r3
        Lc8:
            r6 = r18
            r15 = r19
            r5 = r29
            if (r3 != r7) goto L1fe
            int r0 = defpackage.hv.m(r6, r15, r5)
            java.lang.Object r2 = r5.c
            r11.putObject(r1, r9, r2)
            r11.putInt(r1, r12, r8)
            return r0
        Ldd:
            r6 = r18
            r15 = r19
            r5 = r29
            if (r3 != r7) goto L1fe
            j66 r0 = r0.o(r4)
            r2 = r20
            int r0 = defpackage.hv.q(r0, r6, r15, r2, r5)
            int r2 = r11.getInt(r1, r12)
            if (r2 != r8) goto Lf9
            java.lang.Object r14 = r11.getObject(r1, r9)
        Lf9:
            java.lang.Object r2 = r5.c
            if (r14 != 0) goto L101
            r11.putObject(r1, r9, r2)
            goto L108
        L101:
            pr2 r2 = defpackage.aa3.c(r14, r2)
            r11.putObject(r1, r9, r2)
        L108:
            r11.putInt(r1, r12, r8)
            return r0
        L10c:
            r6 = r18
            r15 = r19
            r5 = r29
            if (r3 != r7) goto L1fe
            int r0 = defpackage.hv.w(r6, r15, r5)
            int r2 = r5.a
            if (r2 != 0) goto L122
            java.lang.String r2 = ""
            r11.putObject(r1, r9, r2)
            goto L143
        L122:
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            r3 = r24 & r3
            if (r3 == 0) goto L138
            int r3 = r0 + r2
            nj2 r4 = defpackage.xj7.a
            boolean r3 = r4.z(r6, r0, r3)
            if (r3 == 0) goto L133
            goto L138
        L133:
            ub3 r0 = defpackage.ub3.a()
            throw r0
        L138:
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = defpackage.aa3.a
            r3.<init>(r6, r0, r2, r4)
            r11.putObject(r1, r9, r3)
            int r0 = r0 + r2
        L143:
            r11.putInt(r1, r12, r8)
            return r0
        L147:
            r0 = r18
            r15 = r19
            r5 = r29
            if (r3 != 0) goto L1fe
            int r0 = defpackage.hv.y(r0, r15, r5)
            long r2 = r5.b
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L15c
            goto L15d
        L15c:
            r6 = 0
        L15d:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)
            r11.putObject(r1, r9, r2)
            r11.putInt(r1, r12, r8)
            return r0
        L168:
            r0 = r18
            r15 = r19
            if (r3 != r5) goto L1fe
            int r0 = defpackage.hv.n(r18, r19)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11.putObject(r1, r9, r0)
            int r0 = r15 + 4
            r11.putInt(r1, r12, r8)
            return r0
        L17f:
            r0 = r18
            r15 = r19
            if (r3 != r6) goto L1fe
            long r2 = defpackage.hv.o(r18, r19)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r11.putObject(r1, r9, r0)
            int r0 = r15 + 8
            r11.putInt(r1, r12, r8)
            return r0
        L196:
            r0 = r18
            r15 = r19
            r5 = r29
            if (r3 != 0) goto L1fe
            int r0 = defpackage.hv.w(r0, r15, r5)
            int r2 = r5.a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r11.putObject(r1, r9, r2)
            r11.putInt(r1, r12, r8)
            return r0
        L1af:
            r0 = r18
            r15 = r19
            r5 = r29
            if (r3 != 0) goto L1fe
            int r0 = defpackage.hv.y(r0, r15, r5)
            long r2 = r5.b
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r11.putObject(r1, r9, r2)
            r11.putInt(r1, r12, r8)
            return r0
        L1c8:
            r0 = r18
            r15 = r19
            if (r3 != r5) goto L1fe
            int r0 = defpackage.hv.n(r18, r19)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r11.putObject(r1, r9, r0)
            int r0 = r15 + 4
            r11.putInt(r1, r12, r8)
            return r0
        L1e3:
            r0 = r18
            r15 = r19
            if (r3 != r6) goto L1fe
            long r2 = defpackage.hv.o(r18, r19)
            double r2 = java.lang.Double.longBitsToDouble(r2)
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            r11.putObject(r1, r9, r0)
            int r0 = r15 + 8
            r11.putInt(r1, r12, r8)
            return r0
        L1fe:
            return r15
    }

    public final int F(java.lang.Object r28, byte[] r29, int r30, int r31, int r32, defpackage.ou r33) {
            r27 = this;
            r0 = r27
            r2 = r28
            r1 = r29
            r4 = r31
            r13 = r33
            sun.misc.Unsafe r9 = defpackage.i54.p
            r3 = r30
            r5 = -1
            r6 = 0
            r7 = 0
            r8 = -1
            r12 = 0
        L13:
            if (r3 >= r4) goto L45e
            int r7 = r3 + 1
            r3 = r1[r3]
            if (r3 >= 0) goto L21
            int r7 = defpackage.hv.v(r3, r1, r7, r13)
            int r3 = r13.a
        L21:
            r25 = r7
            r7 = r3
            r3 = r25
            int r14 = r7 >>> 3
            r16 = r7
            r7 = r16 & 7
            int r10 = r0.d
            r18 = 3
            int r11 = r0.c
            if (r14 <= r5) goto L44
            int r6 = r6 / 3
            if (r14 < r11) goto L3f
            if (r14 > r10) goto L3f
            int r5 = r0.N(r14, r6)
            goto L40
        L3f:
            r5 = -1
        L40:
            r10 = 0
        L41:
            r11 = r5
            r5 = -1
            goto L51
        L44:
            if (r14 < r11) goto L4e
            if (r14 > r10) goto L4e
            r10 = 0
            int r5 = r0.N(r14, r10)
            goto L41
        L4e:
            r10 = 0
            r5 = -1
            goto L41
        L51:
            if (r11 != r5) goto L67
            r11 = r32
            r15 = r5
            r24 = r9
            r17 = r10
            r6 = r14
            r30 = 0
            r9 = r0
            r10 = r2
            r2 = r16
            r16 = r8
            r8 = r17
            goto L436
        L67:
            int r5 = r11 + 1
            int[] r6 = r0.a
            r5 = r6[r5]
            int r10 = O(r5)
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r5 & r19
            r20 = r14
            long r13 = (long) r1
            r1 = 17
            r21 = r3
            if (r10 > r1) goto L33b
            int r1 = r11 + 2
            r1 = r6[r1]
            int r6 = r1 >>> 20
            r3 = 1
            int r23 = r3 << r6
            r1 = r1 & r19
            r6 = -1
            if (r1 == r8) goto L9c
            if (r8 == r6) goto L93
            long r3 = (long) r8
            r9.putInt(r2, r3, r12)
        L93:
            long r3 = (long) r1
            int r3 = r9.getInt(r2, r3)
            r12 = r1
            r19 = r3
            goto L9f
        L9c:
            r19 = r12
            r12 = r8
        L9f:
            r1 = 5
            switch(r10) {
                case 0: goto L2fd;
                case 1: goto L2d7;
                case 2: goto L2b1;
                case 3: goto L2b1;
                case 4: goto L289;
                case 5: goto L25e;
                case 6: goto L246;
                case 7: goto L223;
                case 8: goto L1ee;
                case 9: goto L1bb;
                case 10: goto L1a0;
                case 11: goto L289;
                case 12: goto L163;
                case 13: goto L246;
                case 14: goto L25e;
                case 15: goto L13c;
                case 16: goto L103;
                case 17: goto Lb1;
                default: goto La3;
            }
        La3:
            r8 = r29
            r13 = r33
            r1 = r2
            r10 = r9
            r14 = r16
            r9 = r21
            r16 = r6
            goto L324
        Lb1:
            r1 = r18
            if (r7 != r1) goto Lf4
            int r1 = r20 << 3
            r7 = r1 | 4
            j66 r3 = r0.o(r11)
            r4 = r29
            r8 = r33
            r10 = r16
            r5 = r21
            r16 = r6
            r6 = r31
            int r3 = defpackage.hv.p(r3, r4, r5, r6, r7, r8)
            r1 = r8
            r8 = r4
            r4 = r19 & r23
            if (r4 != 0) goto Ld9
            java.lang.Object r4 = r1.c
            r9.putObject(r2, r13, r4)
            goto Le6
        Ld9:
            java.lang.Object r4 = r9.getObject(r2, r13)
            java.lang.Object r5 = r1.c
            pr2 r4 = defpackage.aa3.c(r4, r5)
            r9.putObject(r2, r13, r4)
        Le6:
            r4 = r19 | r23
            r13 = r1
            r1 = r8
            r7 = r10
            r6 = r11
            r8 = r12
        Led:
            r5 = r20
            r12 = r4
        Lf0:
            r4 = r31
            goto L13
        Lf4:
            r8 = r29
            r10 = r16
            r16 = r6
            r13 = r33
            r1 = r2
            r14 = r10
            r10 = r9
            r9 = r21
            goto L324
        L103:
            r8 = r29
            r1 = r33
            r10 = r16
            r3 = r21
            r16 = r6
            if (r7 != 0) goto L132
            int r7 = defpackage.hv.y(r8, r3, r1)
            long r3 = r1.b
            long r5 = defpackage.ks0.b(r3)
            r3 = r13
            r13 = r1
            r1 = r9
            r9 = r31
            r1.putLong(r2, r3, r5)
            r4 = r1
            r1 = r19 | r23
            r3 = r12
            r12 = r1
            r1 = r8
            r8 = r3
            r3 = r9
            r9 = r4
            r4 = r3
            r3 = r7
        L12c:
            r7 = r10
            r6 = r11
        L12e:
            r5 = r20
            goto L13
        L132:
            r13 = r1
            r4 = r9
            r9 = r31
        L136:
            r1 = r2
            r9 = r3
            r14 = r10
        L139:
            r10 = r4
            goto L324
        L13c:
            r8 = r29
            r4 = r9
            r10 = r16
            r3 = r21
            r9 = r31
            r16 = r6
            r5 = r13
            r13 = r33
            if (r7 != 0) goto L136
            int r3 = defpackage.hv.w(r8, r3, r13)
            int r1 = r13.a
            int r1 = defpackage.ks0.a(r1)
            r4.putInt(r2, r5, r1)
        L159:
            r1 = r19 | r23
            r5 = r12
            r12 = r1
            r1 = r8
            r8 = r5
            r5 = r9
            r9 = r4
            r4 = r5
            goto L12c
        L163:
            r8 = r29
            r4 = r9
            r10 = r16
            r3 = r21
            r9 = r31
            r16 = r6
            r5 = r13
            r13 = r33
            if (r7 != 0) goto L136
            int r3 = defpackage.hv.w(r8, r3, r13)
            int r1 = r13.a
            y93 r7 = r0.m(r11)
            if (r7 == 0) goto L19c
            boolean r7 = r7.a(r1)
            if (r7 == 0) goto L186
            goto L19c
        L186:
            mg7 r5 = p(r2)
            long r6 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            r5.c(r10, r1)
            r1 = r9
            r9 = r4
            r4 = r1
            r1 = r8
            r7 = r10
            r6 = r11
            r8 = r12
            r12 = r19
            goto L12e
        L19c:
            r4.putInt(r2, r5, r1)
            goto L159
        L1a0:
            r8 = r29
            r4 = r9
            r10 = r16
            r3 = r21
            r1 = 2
            r9 = r31
            r16 = r6
            r5 = r13
            r13 = r33
            if (r7 != r1) goto L136
            int r3 = defpackage.hv.m(r8, r3, r13)
            java.lang.Object r1 = r13.c
            r4.putObject(r2, r5, r1)
            goto L159
        L1bb:
            r8 = r29
            r4 = r9
            r10 = r16
            r3 = r21
            r1 = 2
            r9 = r31
            r16 = r6
            r5 = r13
            r13 = r33
            if (r7 != r1) goto L136
            j66 r1 = r0.o(r11)
            int r3 = defpackage.hv.q(r1, r8, r3, r9, r13)
            r1 = r19 & r23
            if (r1 != 0) goto L1df
            java.lang.Object r1 = r13.c
            r4.putObject(r2, r5, r1)
            goto L159
        L1df:
            java.lang.Object r1 = r4.getObject(r2, r5)
            java.lang.Object r7 = r13.c
            pr2 r1 = defpackage.aa3.c(r1, r7)
            r4.putObject(r2, r5, r1)
            goto L159
        L1ee:
            r8 = r29
            r4 = r9
            r9 = r13
            r14 = r16
            r3 = r21
            r1 = 2
            r13 = r33
            r16 = r6
            if (r7 != r1) goto L21f
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r1 & r5
            if (r1 != 0) goto L208
            int r1 = defpackage.hv.s(r8, r3, r13)
        L206:
            r3 = r1
            goto L20d
        L208:
            int r1 = defpackage.hv.t(r8, r3, r13)
            goto L206
        L20d:
            java.lang.Object r1 = r13.c
            r4.putObject(r2, r9, r1)
        L212:
            r1 = r19 | r23
            r5 = r12
            r12 = r1
            r1 = r8
            r8 = r5
            r9 = r4
            r6 = r11
            r7 = r14
            r5 = r20
            goto Lf0
        L21f:
            r1 = r2
            r9 = r3
            goto L139
        L223:
            r8 = r29
            r4 = r9
            r9 = r13
            r14 = r16
            r3 = r21
            r13 = r33
            r16 = r6
            if (r7 != 0) goto L21f
            int r3 = defpackage.hv.y(r8, r3, r13)
            long r5 = r13.b
            r21 = 0
            int r1 = (r5 > r21 ? 1 : (r5 == r21 ? 0 : -1))
            if (r1 == 0) goto L23f
            r1 = 1
            goto L240
        L23f:
            r1 = 0
        L240:
            fh7 r5 = defpackage.gh7.d
            r5.k(r2, r9, r1)
            goto L212
        L246:
            r8 = r29
            r4 = r9
            r9 = r13
            r14 = r16
            r3 = r21
            r13 = r33
            r16 = r6
            if (r7 != r1) goto L21f
            int r1 = defpackage.hv.n(r8, r3)
            r4.putInt(r2, r9, r1)
            int r3 = r3 + 4
            goto L212
        L25e:
            r8 = r29
            r4 = r9
            r9 = r13
            r14 = r16
            r3 = r21
            r1 = 1
            r13 = r33
            r16 = r6
            if (r7 != r1) goto L285
            long r5 = defpackage.hv.o(r8, r3)
            r1 = r4
            r25 = r9
            r9 = r3
            r3 = r25
            r1.putLong(r2, r3, r5)
            int r3 = r9 + 8
            r4 = r19 | r23
            r9 = r1
            r1 = r8
            r6 = r11
            r8 = r12
            r7 = r14
            goto Led
        L285:
            r9 = r3
            r1 = r2
            goto L139
        L289:
            r8 = r29
            r1 = r9
            r3 = r13
            r14 = r16
            r9 = r21
            r13 = r33
            r16 = r6
            if (r7 != 0) goto L2ad
            int r5 = defpackage.hv.w(r8, r9, r13)
            int r6 = r13.a
            r1.putInt(r2, r3, r6)
            r3 = r19 | r23
            r4 = r31
            r9 = r1
            r1 = r8
            r6 = r11
            r8 = r12
            r7 = r14
            r12 = r3
            r3 = r5
            goto L12e
        L2ad:
            r10 = r1
        L2ae:
            r1 = r2
            goto L324
        L2b1:
            r8 = r29
            r1 = r9
            r3 = r13
            r14 = r16
            r9 = r21
            r13 = r33
            r16 = r6
            if (r7 != 0) goto L2ad
            int r7 = defpackage.hv.y(r8, r9, r13)
            long r5 = r13.b
            r1.putLong(r2, r3, r5)
            r10 = r1
            r1 = r19 | r23
            r3 = r12
            r12 = r1
            r1 = r8
            r8 = r3
            r4 = r31
            r3 = r7
        L2d2:
            r9 = r10
            r6 = r11
            r7 = r14
            goto L12e
        L2d7:
            r8 = r29
            r10 = r9
            r3 = r13
            r14 = r16
            r9 = r21
            r13 = r33
            r16 = r6
            if (r7 != r1) goto L2ae
            int r1 = defpackage.hv.n(r8, r9)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            fh7 r5 = defpackage.gh7.d
            r5.n(r2, r3, r1)
            int r3 = r9 + 4
            r1 = r19 | r23
            r4 = r12
            r12 = r1
            r1 = r8
            r8 = r4
        L2fa:
            r4 = r31
            goto L2d2
        L2fd:
            r8 = r29
            r10 = r9
            r3 = r13
            r14 = r16
            r9 = r21
            r1 = 1
            r13 = r33
            r16 = r6
            if (r7 != r1) goto L2ae
            long r5 = defpackage.hv.o(r8, r9)
            double r5 = java.lang.Double.longBitsToDouble(r5)
            fh7 r1 = defpackage.gh7.d
            r1.m(r2, r3, r5)
            r1 = r2
            int r3 = r9 + 8
            r2 = r19 | r23
            r4 = r2
            r2 = r1
            r1 = r8
            r8 = r12
            r12 = r4
            goto L2fa
        L324:
            r3 = r9
            r24 = r10
            r8 = r11
            r2 = r14
            r15 = r16
            r6 = r20
            r30 = 0
            r17 = 0
            r11 = r32
            r9 = r0
            r10 = r1
            r16 = r12
        L337:
            r12 = r19
            goto L436
        L33b:
            r1 = r2
            r3 = r13
            r2 = r16
            r16 = -1
            r13 = r33
            r14 = r9
            r9 = r21
            r6 = 27
            if (r10 != r6) goto L39f
            r6 = 2
            if (r7 != r6) goto L38b
            java.lang.Object r5 = r14.getObject(r1, r3)
            z93 r5 = (defpackage.z93) r5
            r6 = r5
            j1 r6 = (defpackage.j1) r6
            boolean r6 = r6.A
            if (r6 != 0) goto L36c
            int r6 = r5.size()
            if (r6 != 0) goto L363
            r6 = 10
            goto L365
        L363:
            int r6 = r6 * 2
        L365:
            z93 r5 = r5.k(r6)
            r14.putObject(r1, r3, r5)
        L36c:
            r6 = r5
            j66 r1 = r0.o(r11)
            r3 = r29
            r5 = r31
            r4 = r9
            r7 = r13
            int r1 = defpackage.hv.r(r1, r2, r3, r4, r5, r6, r7)
            r4 = r31
            r13 = r33
            r3 = r1
            r7 = r2
            r6 = r11
            r9 = r14
            r5 = r20
            r2 = r28
        L387:
            r1 = r29
            goto L13
        L38b:
            r1 = r28
            r3 = r9
            r19 = r12
            r24 = r14
            r15 = r16
            r6 = r20
            r30 = 0
            r17 = 0
            r16 = r8
            r8 = r11
            goto L3ff
        L39f:
            r1 = 49
            if (r10 > r1) goto L3e1
            r1 = r8
            r21 = r9
            r8 = r11
            r11 = r10
            long r9 = (long) r5
            r5 = r2
            r19 = r12
            r24 = r14
            r15 = r16
            r6 = r20
            r30 = 0
            r17 = 0
            r2 = r29
            r14 = r33
            r16 = r1
            r12 = r3
            r3 = r21
            r1 = r28
            r4 = r31
            int r7 = r0.H(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            r2 = r5
            if (r7 == r3) goto L3da
            r4 = r31
            r13 = r33
            r5 = r6
            r3 = r7
            r6 = r8
            r8 = r16
            r12 = r19
            r9 = r24
            r7 = r2
            r2 = r1
            goto L387
        L3da:
            r11 = r32
            r9 = r0
            r10 = r1
        L3de:
            r3 = r7
            goto L337
        L3e1:
            r1 = r28
            r19 = r12
            r24 = r14
            r15 = r16
            r6 = r20
            r30 = 0
            r17 = 0
            r16 = r8
            r8 = r11
            r11 = r10
            r25 = r3
            r3 = r9
            r9 = r25
            r4 = 50
            if (r11 != r4) goto L409
            r4 = 2
            if (r7 == r4) goto L405
        L3ff:
            r11 = r32
            r9 = r0
            r10 = r1
            goto L337
        L405:
            r0.D(r1, r9, r8)
            throw r30
        L409:
            r12 = r9
            r9 = r11
            r10 = r12
            r4 = r31
            r13 = r33
            r12 = r8
            r8 = r5
            r5 = r2
            r2 = r29
            int r7 = r0.E(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            r9 = r0
            r10 = r1
            r2 = r5
            r8 = r12
            if (r7 == r3) goto L433
            r1 = r29
            r4 = r31
            r13 = r33
            r5 = r6
            r3 = r7
            r6 = r8
            r0 = r9
            r8 = r16
            r12 = r19
            r9 = r24
            r7 = r2
        L430:
            r2 = r10
            goto L13
        L433:
            r11 = r32
            goto L3de
        L436:
            if (r2 != r11) goto L440
            if (r11 == 0) goto L440
            r4 = r31
            r7 = r2
            r8 = r16
            goto L46b
        L440:
            mg7 r4 = p(r10)
            r1 = r29
            r5 = r33
            r0 = r2
            r2 = r3
            r3 = r31
            int r2 = defpackage.hv.u(r0, r1, r2, r3, r4, r5)
            r5 = r0
            r13 = r33
            r4 = r3
            r7 = r5
            r5 = r6
            r6 = r8
            r0 = r9
            r8 = r16
            r9 = r24
            r3 = r2
            goto L430
        L45e:
            r11 = r32
            r10 = r2
            r16 = r8
            r24 = r9
            r19 = r12
            r30 = 0
            r15 = -1
            r9 = r0
        L46b:
            if (r8 == r15) goto L473
            long r0 = (long) r8
            r14 = r24
            r14.putInt(r10, r0, r12)
        L473:
            int r0 = r9.i
        L475:
            int r1 = r9.j
            if (r0 >= r1) goto L485
            int[] r1 = r9.h
            r1 = r1[r0]
            r2 = r30
            r9.l(r1, r10, r2)
            int r0 = r0 + 1
            goto L475
        L485:
            if (r11 != 0) goto L48f
            if (r3 != r4) goto L48a
            goto L493
        L48a:
            ub3 r0 = defpackage.ub3.d()
            throw r0
        L48f:
            if (r3 > r4) goto L494
            if (r7 != r11) goto L494
        L493:
            return r3
        L494:
            ub3 r0 = defpackage.ub3.d()
            throw r0
    }

    public final void G(java.lang.Object r24, byte[] r25, int r26, int r27, defpackage.ou r28) {
            r23 = this;
            r0 = r23
            r7 = r25
            r8 = r27
            r13 = r28
            sun.misc.Unsafe r1 = defpackage.i54.p
            r15 = -1
            r9 = 0
            r2 = r26
            r4 = r9
            r3 = r15
        L10:
            if (r2 >= r8) goto L291
            int r5 = r2 + 1
            r2 = r7[r2]
            if (r2 >= 0) goto L1e
            int r5 = defpackage.hv.v(r2, r7, r5, r13)
            int r2 = r13.a
        L1e:
            r10 = r5
            r5 = r2
            int r11 = r5 >>> 3
            r2 = r5 & 7
            int r6 = r0.d
            int r12 = r0.c
            if (r11 <= r3) goto L38
            int r4 = r4 / 3
            if (r11 < r12) goto L35
            if (r11 > r6) goto L35
            int r3 = r0.N(r11, r4)
            goto L36
        L35:
            r3 = r15
        L36:
            r12 = r3
            goto L41
        L38:
            if (r11 < r12) goto L35
            if (r11 > r6) goto L35
            int r3 = r0.N(r11, r9)
            goto L36
        L41:
            if (r12 != r15) goto L4b
            r15 = r1
            r12 = r9
            r16 = r12
            r2 = r10
            r14 = r11
            goto L274
        L4b:
            int r3 = r12 + 1
            int[] r4 = r0.a
            r3 = r4[r3]
            r14 = r11
            int r11 = O(r3)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            r26 = r10
            long r9 = (long) r4
            r4 = 17
            r6 = 2
            if (r11 > r4) goto L1c9
            r4 = 5
            r15 = 1
            switch(r11) {
                case 0: goto L1a9;
                case 1: goto L190;
                case 2: goto L176;
                case 3: goto L176;
                case 4: goto L161;
                case 5: goto L148;
                case 6: goto L132;
                case 7: goto L113;
                case 8: goto Lf2;
                case 9: goto Lce;
                case 10: goto Lbc;
                case 11: goto L161;
                case 12: goto Laa;
                case 13: goto L132;
                case 14: goto L148;
                case 15: goto L8d;
                case 16: goto L70;
                default: goto L67;
            }
        L67:
            r4 = r26
            r15 = r1
            r16 = 0
            r1 = r24
            goto L255
        L70:
            if (r2 != 0) goto L67
            r11 = r26
            int r11 = defpackage.hv.y(r7, r11, r13)
            long r2 = r13.b
            long r5 = defpackage.ks0.b(r2)
            r2 = r24
            r3 = r9
            r1.putLong(r2, r3, r5)
            r9 = r1
            r1 = r2
            r1 = r9
            r2 = r11
        L88:
            r4 = r12
            r3 = r14
            r9 = 0
        L8b:
            r15 = -1
            goto L10
        L8d:
            r11 = r26
            r3 = r9
            r9 = r1
            r1 = r24
            if (r2 != 0) goto La4
            int r2 = defpackage.hv.w(r7, r11, r13)
            int r5 = r13.a
            int r5 = defpackage.ks0.a(r5)
            r9.putInt(r1, r3, r5)
        La2:
            r1 = r9
            goto L88
        La4:
            r15 = r9
            r4 = r11
        La6:
            r16 = 0
            goto L255
        Laa:
            r11 = r26
            r3 = r9
            r9 = r1
            r1 = r24
            if (r2 != 0) goto La4
            int r2 = defpackage.hv.w(r7, r11, r13)
            int r5 = r13.a
            r9.putInt(r1, r3, r5)
            goto La2
        Lbc:
            r11 = r26
            r3 = r9
            r9 = r1
            r1 = r24
            if (r2 != r6) goto La4
            int r2 = defpackage.hv.m(r7, r11, r13)
            java.lang.Object r5 = r13.c
            r9.putObject(r1, r3, r5)
            goto La2
        Lce:
            r11 = r26
            r3 = r9
            r9 = r1
            r1 = r24
            if (r2 != r6) goto La4
            j66 r2 = r0.o(r12)
            int r2 = defpackage.hv.q(r2, r7, r11, r8, r13)
            java.lang.Object r5 = r9.getObject(r1, r3)
            java.lang.Object r6 = r13.c
            if (r5 != 0) goto Lea
            r9.putObject(r1, r3, r6)
            goto La2
        Lea:
            pr2 r5 = defpackage.aa3.c(r5, r6)
            r9.putObject(r1, r3, r5)
            goto La2
        Lf2:
            r11 = r26
            r26 = r5
            r4 = r9
            r9 = r1
            r1 = r24
            if (r2 != r6) goto L110
            r2 = 536870912(0x20000000, float:1.0842022E-19)
            r2 = r2 & r3
            if (r2 != 0) goto L106
            int r2 = defpackage.hv.s(r7, r11, r13)
            goto L10a
        L106:
            int r2 = defpackage.hv.t(r7, r11, r13)
        L10a:
            java.lang.Object r3 = r13.c
            r9.putObject(r1, r4, r3)
            goto La2
        L110:
            r5 = r26
            goto La4
        L113:
            r11 = r26
            r26 = r5
            r4 = r9
            r9 = r1
            r1 = r24
            if (r2 != 0) goto L110
            int r2 = defpackage.hv.y(r7, r11, r13)
            long r10 = r13.b
            r17 = 0
            int r3 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r3 == 0) goto L12a
            goto L12b
        L12a:
            r15 = 0
        L12b:
            fh7 r3 = defpackage.gh7.d
            r3.k(r1, r4, r15)
            goto La2
        L132:
            r11 = r26
            r3 = r4
            r26 = r5
            r4 = r9
            r9 = r1
            r1 = r24
            if (r2 != r3) goto L110
            int r2 = defpackage.hv.n(r7, r11)
            r9.putInt(r1, r4, r2)
        L144:
            int r2 = r11 + 4
            goto La2
        L148:
            r11 = r26
            r26 = r5
            r4 = r9
            r9 = r1
            r1 = r24
            if (r2 != r15) goto L110
            r3 = r4
            long r5 = defpackage.hv.o(r7, r11)
            r2 = r1
            r1 = r9
            r1.putLong(r2, r3, r5)
            r1 = r2
        L15d:
            int r2 = r11 + 8
            goto La2
        L161:
            r11 = r26
            r26 = r5
            r3 = r9
            r9 = r1
            r1 = r24
            if (r2 != 0) goto L110
            int r2 = defpackage.hv.w(r7, r11, r13)
            int r5 = r13.a
            r9.putInt(r1, r3, r5)
            goto La2
        L176:
            r11 = r26
            r26 = r5
            r3 = r9
            r9 = r1
            r1 = r24
            if (r2 != 0) goto L110
            int r10 = defpackage.hv.y(r7, r11, r13)
            long r5 = r13.b
            r2 = r1
            r1 = r9
            r1.putLong(r2, r3, r5)
            r1 = r2
            r1 = r9
            r2 = r10
            goto L88
        L190:
            r11 = r26
            r3 = r4
            r26 = r5
            r4 = r9
            r9 = r1
            r1 = r24
            if (r2 != r3) goto L110
            int r2 = defpackage.hv.n(r7, r11)
            float r2 = java.lang.Float.intBitsToFloat(r2)
            fh7 r3 = defpackage.gh7.d
            r3.n(r1, r4, r2)
            goto L144
        L1a9:
            r11 = r26
            r26 = r5
            r4 = r9
            r9 = r1
            r1 = r24
            if (r2 != r15) goto L110
            long r2 = defpackage.hv.o(r7, r11)
            double r2 = java.lang.Double.longBitsToDouble(r2)
            fh7 r1 = defpackage.gh7.d
            r21 = r4
            r5 = r2
            r3 = r21
            r2 = r24
            r1.m(r2, r3, r5)
            r10 = r2
            goto L15d
        L1c9:
            r4 = r26
            r26 = r5
            r19 = r9
            r10 = r24
            r9 = r1
            r1 = 27
            if (r11 != r1) goto L215
            if (r2 != r6) goto L20f
            r1 = r19
            java.lang.Object r3 = r9.getObject(r10, r1)
            z93 r3 = (defpackage.z93) r3
            r5 = r3
            j1 r5 = (defpackage.j1) r5
            boolean r5 = r5.A
            if (r5 != 0) goto L1f9
            int r5 = r3.size()
            if (r5 != 0) goto L1f0
            r5 = 10
            goto L1f2
        L1f0:
            int r5 = r5 * 2
        L1f2:
            z93 r3 = r3.k(r5)
            r9.putObject(r10, r1, r3)
        L1f9:
            r6 = r3
            j66 r1 = r0.o(r12)
            r2 = r26
            r3 = r7
            r5 = r8
            r7 = r13
            int r2 = defpackage.hv.r(r1, r2, r3, r4, r5, r6, r7)
            r7 = r25
            r8 = r27
            r13 = r28
            goto La2
        L20f:
            r5 = r26
            r15 = r9
            r1 = r10
            goto La6
        L215:
            r5 = r26
            r1 = 49
            if (r11 > r1) goto L248
            r1 = r9
            long r9 = (long) r3
            r15 = r1
            r7 = r2
            r3 = r4
            r8 = r12
            r6 = r14
            r12 = r19
            r16 = 0
            r1 = r24
            r2 = r25
            r4 = r27
            r14 = r28
            int r7 = r0.H(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            r4 = r3
            r14 = r6
            r12 = r8
            if (r7 == r4) goto L246
        L237:
            r8 = r27
            r13 = r28
            r2 = r7
            r4 = r12
            r3 = r14
            r1 = r15
            r9 = r16
            r15 = -1
            r7 = r25
            goto L10
        L246:
            r2 = r7
            goto L274
        L248:
            r7 = r2
            r15 = r9
            r1 = r10
            r8 = r19
            r16 = 0
            r2 = 50
            if (r11 != r2) goto L25c
            if (r7 == r6) goto L257
        L255:
            r2 = r4
            goto L274
        L257:
            r0.D(r1, r8, r12)
            r0 = 0
            throw r0
        L25c:
            r21 = r8
            r9 = r11
            r10 = r21
            r2 = r25
            r13 = r28
            r8 = r3
            r3 = r4
            r6 = r14
            r4 = r27
            int r7 = r0.E(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            r4 = r3
            if (r7 == r4) goto L246
            r0 = r23
            goto L237
        L274:
            mg7 r4 = p(r24)
            r1 = r25
            r3 = r27
            r0 = r5
            r5 = r28
            int r2 = defpackage.hv.u(r0, r1, r2, r3, r4, r5)
            r0 = r23
            r7 = r25
            r13 = r28
            r8 = r3
            r4 = r12
            r3 = r14
            r1 = r15
            r9 = r16
            goto L8b
        L291:
            r4 = r8
            if (r2 != r4) goto L295
            return
        L295:
            ub3 r0 = defpackage.ub3.d()
            throw r0
    }

    public final int H(java.lang.Object r12, byte[] r13, int r14, int r15, int r16, int r17, int r18, int r19, long r20, int r22, long r23, defpackage.ou r25) {
            r11 = this;
            r0 = r16
            r1 = r18
            r6 = r19
            r2 = r23
            sun.misc.Unsafe r4 = defpackage.i54.p
            java.lang.Object r5 = r4.getObject(r12, r2)
            z93 r5 = (defpackage.z93) r5
            r7 = r5
            j1 r7 = (defpackage.j1) r7
            boolean r7 = r7.A
            r8 = 2
            if (r7 != 0) goto L29
            int r7 = r5.size()
            if (r7 != 0) goto L21
            r7 = 10
            goto L22
        L21:
            int r7 = r7 * r8
        L22:
            z93 r5 = r5.k(r7)
            r4.putObject(r12, r2, r5)
        L29:
            r4 = r5
            r2 = 5
            r9 = 0
            r3 = 1
            switch(r22) {
                case 18: goto L450;
                case 19: goto L3ff;
                case 20: goto L3ba;
                case 21: goto L3ba;
                case 22: goto L385;
                case 23: goto L340;
                case 24: goto L2fb;
                case 25: goto L2a0;
                case 26: goto L1e2;
                case 27: goto L1c6;
                case 28: goto L169;
                case 29: goto L385;
                case 30: goto L122;
                case 31: goto L2fb;
                case 32: goto L340;
                case 33: goto Ld1;
                case 34: goto L80;
                case 35: goto L450;
                case 36: goto L3ff;
                case 37: goto L3ba;
                case 38: goto L3ba;
                case 39: goto L385;
                case 40: goto L340;
                case 41: goto L2fb;
                case 42: goto L2a0;
                case 43: goto L385;
                case 44: goto L122;
                case 45: goto L2fb;
                case 46: goto L340;
                case 47: goto Ld1;
                case 48: goto L80;
                case 49: goto L33;
                default: goto L31;
            }
        L31:
            goto L4a1
        L33:
            r12 = 3
            if (r1 != r12) goto L4a1
            j66 r11 = r11.o(r6)
            r12 = r0 & (-8)
            r12 = r12 | 4
            r17 = r11
            r21 = r12
            r18 = r13
            r19 = r14
            r20 = r15
            r22 = r25
            int r11 = defpackage.hv.p(r17, r18, r19, r20, r21, r22)
            r12 = r17
            r3 = r20
            r2 = r21
            r5 = r22
            java.lang.Object r6 = r5.c
            r4.add(r6)
        L5b:
            if (r11 >= r3) goto L7f
            int r6 = defpackage.hv.w(r13, r11, r5)
            int r7 = r5.a
            if (r0 == r7) goto L66
            goto L7f
        L66:
            r17 = r12
            r18 = r13
            r21 = r2
            r20 = r3
            r22 = r5
            r19 = r6
            int r11 = defpackage.hv.p(r17, r18, r19, r20, r21, r22)
            r1 = r21
            java.lang.Object r6 = r5.c
            r4.add(r6)
            r2 = r1
            goto L5b
        L7f:
            return r11
        L80:
            r3 = r15
            r5 = r25
            if (r1 != r8) goto La6
            uy3 r4 = (defpackage.uy3) r4
            int r11 = defpackage.hv.w(r13, r14, r5)
            int r12 = r5.a
            int r12 = r12 + r11
        L8e:
            if (r11 >= r12) goto L9e
            int r11 = defpackage.hv.y(r13, r11, r5)
            long r0 = r5.b
            long r0 = defpackage.ks0.b(r0)
            r4.b(r0)
            goto L8e
        L9e:
            if (r11 != r12) goto La1
            return r11
        La1:
            ub3 r11 = defpackage.ub3.e()
            throw r11
        La6:
            if (r1 != 0) goto L4a1
            uy3 r4 = (defpackage.uy3) r4
            int r11 = defpackage.hv.y(r13, r14, r5)
            long r6 = r5.b
            long r6 = defpackage.ks0.b(r6)
            r4.b(r6)
        Lb7:
            if (r11 >= r3) goto Ld0
            int r12 = defpackage.hv.w(r13, r11, r5)
            int r1 = r5.a
            if (r0 == r1) goto Lc2
            goto Ld0
        Lc2:
            int r11 = defpackage.hv.y(r13, r12, r5)
            long r6 = r5.b
            long r6 = defpackage.ks0.b(r6)
            r4.b(r6)
            goto Lb7
        Ld0:
            return r11
        Ld1:
            r3 = r15
            r5 = r25
            if (r1 != r8) goto Lf7
            a93 r4 = (defpackage.a93) r4
            int r11 = defpackage.hv.w(r13, r14, r5)
            int r12 = r5.a
            int r12 = r12 + r11
        Ldf:
            if (r11 >= r12) goto Lef
            int r11 = defpackage.hv.w(r13, r11, r5)
            int r0 = r5.a
            int r0 = defpackage.ks0.a(r0)
            r4.b(r0)
            goto Ldf
        Lef:
            if (r11 != r12) goto Lf2
            return r11
        Lf2:
            ub3 r11 = defpackage.ub3.e()
            throw r11
        Lf7:
            if (r1 != 0) goto L4a1
            a93 r4 = (defpackage.a93) r4
            int r11 = defpackage.hv.w(r13, r14, r5)
            int r12 = r5.a
            int r12 = defpackage.ks0.a(r12)
            r4.b(r12)
        L108:
            if (r11 >= r3) goto L121
            int r12 = defpackage.hv.w(r13, r11, r5)
            int r1 = r5.a
            if (r0 == r1) goto L113
            goto L121
        L113:
            int r11 = defpackage.hv.w(r13, r12, r5)
            int r12 = r5.a
            int r12 = defpackage.ks0.a(r12)
            r4.b(r12)
            goto L108
        L121:
            return r11
        L122:
            r3 = r15
            r5 = r25
            if (r1 != r8) goto L145
            r0 = r4
            a93 r0 = (defpackage.a93) r0
            int r1 = defpackage.hv.w(r13, r14, r5)
            int r3 = r5.a
            int r3 = r3 + r1
        L131:
            if (r1 >= r3) goto L13d
            int r1 = defpackage.hv.w(r13, r1, r5)
            int r7 = r5.a
            r0.b(r7)
            goto L131
        L13d:
            if (r1 != r3) goto L140
            goto L14d
        L140:
            ub3 r11 = defpackage.ub3.e()
            throw r11
        L145:
            if (r1 != 0) goto L4a1
            r1 = r13
            r2 = r14
            int r1 = defpackage.hv.x(r0, r1, r2, r3, r4, r5)
        L14d:
            pr2 r12 = (defpackage.pr2) r12
            mg7 r0 = r12.unknownFields
            mg7 r2 = defpackage.mg7.f
            if (r0 != r2) goto L156
            r0 = 0
        L156:
            y93 r2 = r11.m(r6)
            ng7 r11 = r11.m
            r3 = r17
            java.lang.Object r11 = defpackage.m66.v(r3, r4, r2, r0, r11)
            mg7 r11 = (defpackage.mg7) r11
            if (r11 == 0) goto L168
            r12.unknownFields = r11
        L168:
            return r1
        L169:
            r3 = r15
            r5 = r25
            if (r1 != r8) goto L4a1
            int r11 = defpackage.hv.w(r13, r14, r5)
            int r1 = r5.a
            if (r1 < 0) goto L1c1
            int r2 = r13.length
            int r2 = r2 - r11
            if (r1 > r2) goto L1bc
            if (r1 != 0) goto L182
            ca0 r1 = defpackage.ea0.B
            r4.add(r1)
            goto L18a
        L182:
            ca0 r2 = defpackage.ea0.c(r13, r11, r1)
            r4.add(r2)
        L189:
            int r11 = r11 + r1
        L18a:
            if (r11 >= r3) goto L1bb
            int r1 = defpackage.hv.w(r13, r11, r5)
            int r2 = r5.a
            if (r0 == r2) goto L195
            goto L1bb
        L195:
            int r11 = defpackage.hv.w(r13, r1, r5)
            int r1 = r5.a
            if (r1 < 0) goto L1b6
            int r2 = r13.length
            int r2 = r2 - r11
            if (r1 > r2) goto L1b1
            if (r1 != 0) goto L1a9
            ca0 r1 = defpackage.ea0.B
            r4.add(r1)
            goto L18a
        L1a9:
            ca0 r2 = defpackage.ea0.c(r13, r11, r1)
            r4.add(r2)
            goto L189
        L1b1:
            ub3 r11 = defpackage.ub3.e()
            throw r11
        L1b6:
            ub3 r11 = defpackage.ub3.c()
            throw r11
        L1bb:
            return r11
        L1bc:
            ub3 r11 = defpackage.ub3.e()
            throw r11
        L1c1:
            ub3 r11 = defpackage.ub3.c()
            throw r11
        L1c6:
            r3 = r15
            r5 = r25
            if (r1 != r8) goto L4a1
            j66 r11 = r11.o(r6)
            r17 = r11
            r19 = r13
            r20 = r14
            r18 = r0
            r21 = r3
            r22 = r4
            r23 = r5
            int r11 = defpackage.hv.r(r17, r18, r19, r20, r21, r22, r23)
            return r11
        L1e2:
            r11 = r15
            r5 = r25
            if (r1 != r8) goto L4a1
            r1 = 536870912(0x20000000, double:2.65249474E-315)
            long r1 = r20 & r1
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            java.lang.String r2 = ""
            if (r1 != 0) goto L23a
            int r1 = defpackage.hv.w(r13, r14, r5)
            int r3 = r5.a
            if (r3 < 0) goto L235
            if (r3 != 0) goto L200
            r4.add(r2)
            goto L20b
        L200:
            java.lang.String r6 = new java.lang.String
            java.nio.charset.Charset r7 = defpackage.aa3.a
            r6.<init>(r13, r1, r3, r7)
            r4.add(r6)
        L20a:
            int r1 = r1 + r3
        L20b:
            if (r1 >= r11) goto L234
            int r3 = defpackage.hv.w(r13, r1, r5)
            int r6 = r5.a
            if (r0 == r6) goto L216
            goto L234
        L216:
            int r1 = defpackage.hv.w(r13, r3, r5)
            int r3 = r5.a
            if (r3 < 0) goto L22f
            if (r3 != 0) goto L224
            r4.add(r2)
            goto L20b
        L224:
            java.lang.String r6 = new java.lang.String
            java.nio.charset.Charset r7 = defpackage.aa3.a
            r6.<init>(r13, r1, r3, r7)
            r4.add(r6)
            goto L20a
        L22f:
            ub3 r11 = defpackage.ub3.c()
            throw r11
        L234:
            return r1
        L235:
            ub3 r11 = defpackage.ub3.c()
            throw r11
        L23a:
            int r1 = defpackage.hv.w(r13, r14, r5)
            int r3 = r5.a
            if (r3 < 0) goto L29b
            if (r3 != 0) goto L248
            r4.add(r2)
            goto L25d
        L248:
            int r6 = r1 + r3
            nj2 r7 = defpackage.xj7.a
            boolean r7 = r7.z(r13, r1, r6)
            if (r7 == 0) goto L296
            java.lang.String r7 = new java.lang.String
            java.nio.charset.Charset r8 = defpackage.aa3.a
            r7.<init>(r13, r1, r3, r8)
            r4.add(r7)
        L25c:
            r1 = r6
        L25d:
            if (r1 >= r11) goto L295
            int r3 = defpackage.hv.w(r13, r1, r5)
            int r6 = r5.a
            if (r0 == r6) goto L268
            goto L295
        L268:
            int r1 = defpackage.hv.w(r13, r3, r5)
            int r3 = r5.a
            if (r3 < 0) goto L290
            if (r3 != 0) goto L276
            r4.add(r2)
            goto L25d
        L276:
            int r6 = r1 + r3
            nj2 r7 = defpackage.xj7.a
            boolean r7 = r7.z(r13, r1, r6)
            if (r7 == 0) goto L28b
            java.lang.String r7 = new java.lang.String
            java.nio.charset.Charset r8 = defpackage.aa3.a
            r7.<init>(r13, r1, r3, r8)
            r4.add(r7)
            goto L25c
        L28b:
            ub3 r11 = defpackage.ub3.a()
            throw r11
        L290:
            ub3 r11 = defpackage.ub3.c()
            throw r11
        L295:
            return r1
        L296:
            ub3 r11 = defpackage.ub3.a()
            throw r11
        L29b:
            ub3 r11 = defpackage.ub3.c()
            throw r11
        L2a0:
            r11 = r15
            r5 = r25
            r2 = 0
            if (r1 != r8) goto L2ca
            s50 r4 = (defpackage.s50) r4
            int r11 = defpackage.hv.w(r13, r14, r5)
            int r0 = r5.a
            int r0 = r0 + r11
        L2af:
            if (r11 >= r0) goto L2c2
            int r11 = defpackage.hv.y(r13, r11, r5)
            long r6 = r5.b
            int r1 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r1 == 0) goto L2bd
            r1 = r3
            goto L2be
        L2bd:
            r1 = r2
        L2be:
            r4.b(r1)
            goto L2af
        L2c2:
            if (r11 != r0) goto L2c5
            return r11
        L2c5:
            ub3 r11 = defpackage.ub3.e()
            throw r11
        L2ca:
            if (r1 != 0) goto L4a1
            s50 r4 = (defpackage.s50) r4
            int r1 = defpackage.hv.y(r13, r14, r5)
            long r6 = r5.b
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 == 0) goto L2da
            r6 = r3
            goto L2db
        L2da:
            r6 = r2
        L2db:
            r4.b(r6)
        L2de:
            if (r1 >= r11) goto L2fa
            int r6 = defpackage.hv.w(r13, r1, r5)
            int r7 = r5.a
            if (r0 == r7) goto L2e9
            goto L2fa
        L2e9:
            int r1 = defpackage.hv.y(r13, r6, r5)
            long r6 = r5.b
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 == 0) goto L2f5
            r6 = r3
            goto L2f6
        L2f5:
            r6 = r2
        L2f6:
            r4.b(r6)
            goto L2de
        L2fa:
            return r1
        L2fb:
            r11 = r15
            r5 = r25
            if (r1 != r8) goto L31d
            a93 r4 = (defpackage.a93) r4
            int r11 = defpackage.hv.w(r13, r14, r5)
            int r0 = r5.a
            int r0 = r0 + r11
        L309:
            if (r11 >= r0) goto L315
            int r1 = defpackage.hv.n(r13, r11)
            r4.b(r1)
            int r11 = r11 + 4
            goto L309
        L315:
            if (r11 != r0) goto L318
            return r11
        L318:
            ub3 r11 = defpackage.ub3.e()
            throw r11
        L31d:
            if (r1 != r2) goto L4a1
            a93 r4 = (defpackage.a93) r4
            int r1 = defpackage.hv.n(r13, r14)
            r4.b(r1)
            int r1 = r14 + 4
        L32a:
            if (r1 >= r11) goto L33f
            int r2 = defpackage.hv.w(r13, r1, r5)
            int r3 = r5.a
            if (r0 == r3) goto L335
            goto L33f
        L335:
            int r1 = defpackage.hv.n(r13, r2)
            r4.b(r1)
            int r1 = r2 + 4
            goto L32a
        L33f:
            return r1
        L340:
            r11 = r15
            r5 = r25
            if (r1 != r8) goto L362
            uy3 r4 = (defpackage.uy3) r4
            int r11 = defpackage.hv.w(r13, r14, r5)
            int r0 = r5.a
            int r0 = r0 + r11
        L34e:
            if (r11 >= r0) goto L35a
            long r1 = defpackage.hv.o(r13, r11)
            r4.b(r1)
            int r11 = r11 + 8
            goto L34e
        L35a:
            if (r11 != r0) goto L35d
            return r11
        L35d:
            ub3 r11 = defpackage.ub3.e()
            throw r11
        L362:
            if (r1 != r3) goto L4a1
            uy3 r4 = (defpackage.uy3) r4
            long r1 = defpackage.hv.o(r13, r14)
            r4.b(r1)
            int r1 = r14 + 8
        L36f:
            if (r1 >= r11) goto L384
            int r2 = defpackage.hv.w(r13, r1, r5)
            int r3 = r5.a
            if (r0 == r3) goto L37a
            goto L384
        L37a:
            long r6 = defpackage.hv.o(r13, r2)
            r4.b(r6)
            int r1 = r2 + 8
            goto L36f
        L384:
            return r1
        L385:
            r11 = r15
            r5 = r25
            if (r1 != r8) goto L3a7
            a93 r4 = (defpackage.a93) r4
            int r11 = defpackage.hv.w(r13, r14, r5)
            int r0 = r5.a
            int r0 = r0 + r11
        L393:
            if (r11 >= r0) goto L39f
            int r11 = defpackage.hv.w(r13, r11, r5)
            int r1 = r5.a
            r4.b(r1)
            goto L393
        L39f:
            if (r11 != r0) goto L3a2
            return r11
        L3a2:
            ub3 r11 = defpackage.ub3.e()
            throw r11
        L3a7:
            if (r1 != 0) goto L4a1
            r20 = r11
            r18 = r13
            r19 = r14
            r17 = r0
            r21 = r4
            r22 = r5
            int r11 = defpackage.hv.x(r17, r18, r19, r20, r21, r22)
            return r11
        L3ba:
            r11 = r15
            r5 = r25
            if (r1 != r8) goto L3dc
            uy3 r4 = (defpackage.uy3) r4
            int r11 = defpackage.hv.w(r13, r14, r5)
            int r0 = r5.a
            int r0 = r0 + r11
        L3c8:
            if (r11 >= r0) goto L3d4
            int r11 = defpackage.hv.y(r13, r11, r5)
            long r1 = r5.b
            r4.b(r1)
            goto L3c8
        L3d4:
            if (r11 != r0) goto L3d7
            return r11
        L3d7:
            ub3 r11 = defpackage.ub3.e()
            throw r11
        L3dc:
            if (r1 != 0) goto L4a1
            uy3 r4 = (defpackage.uy3) r4
            int r1 = defpackage.hv.y(r13, r14, r5)
            long r2 = r5.b
            r4.b(r2)
        L3e9:
            if (r1 >= r11) goto L3fe
            int r2 = defpackage.hv.w(r13, r1, r5)
            int r3 = r5.a
            if (r0 == r3) goto L3f4
            goto L3fe
        L3f4:
            int r1 = defpackage.hv.y(r13, r2, r5)
            long r2 = r5.b
            r4.b(r2)
            goto L3e9
        L3fe:
            return r1
        L3ff:
            r11 = r15
            r5 = r25
            if (r1 != r8) goto L425
            zd2 r4 = (defpackage.zd2) r4
            int r11 = defpackage.hv.w(r13, r14, r5)
            int r0 = r5.a
            int r0 = r0 + r11
        L40d:
            if (r11 >= r0) goto L41d
            int r1 = defpackage.hv.n(r13, r11)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r4.b(r1)
            int r11 = r11 + 4
            goto L40d
        L41d:
            if (r11 != r0) goto L420
            return r11
        L420:
            ub3 r11 = defpackage.ub3.e()
            throw r11
        L425:
            if (r1 != r2) goto L4a1
            zd2 r4 = (defpackage.zd2) r4
            int r1 = defpackage.hv.n(r13, r14)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r4.b(r1)
            int r1 = r14 + 4
        L436:
            if (r1 >= r11) goto L44f
            int r2 = defpackage.hv.w(r13, r1, r5)
            int r3 = r5.a
            if (r0 == r3) goto L441
            goto L44f
        L441:
            int r1 = defpackage.hv.n(r13, r2)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r4.b(r1)
            int r1 = r2 + 4
            goto L436
        L44f:
            return r1
        L450:
            r11 = r15
            r5 = r25
            if (r1 != r8) goto L476
            cm1 r4 = (defpackage.cm1) r4
            int r11 = defpackage.hv.w(r13, r14, r5)
            int r0 = r5.a
            int r0 = r0 + r11
        L45e:
            if (r11 >= r0) goto L46e
            long r1 = defpackage.hv.o(r13, r11)
            double r1 = java.lang.Double.longBitsToDouble(r1)
            r4.b(r1)
            int r11 = r11 + 8
            goto L45e
        L46e:
            if (r11 != r0) goto L471
            return r11
        L471:
            ub3 r11 = defpackage.ub3.e()
            throw r11
        L476:
            if (r1 != r3) goto L4a1
            cm1 r4 = (defpackage.cm1) r4
            long r1 = defpackage.hv.o(r13, r14)
            double r1 = java.lang.Double.longBitsToDouble(r1)
            r4.b(r1)
            int r1 = r14 + 8
        L487:
            if (r1 >= r11) goto L4a0
            int r2 = defpackage.hv.w(r13, r1, r5)
            int r3 = r5.a
            if (r0 == r3) goto L492
            goto L4a0
        L492:
            long r6 = defpackage.hv.o(r13, r2)
            double r6 = java.lang.Double.longBitsToDouble(r6)
            r4.b(r6)
            int r1 = r2 + 8
            goto L487
        L4a0:
            return r1
        L4a1:
            return r14
    }

    public final void I(java.lang.Object r3, int r4, defpackage.ls0 r5, defpackage.j66 r6, defpackage.g82 r7) {
            r2 = this;
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r0
            long r0 = (long) r4
            ow3 r2 = r2.l
            java.util.List r2 = r2.c(r0, r3)
            java.lang.Object r3 = r5.e
            ks0 r3 = (defpackage.ks0) r3
            int r4 = r5.b
            r0 = r4 & 7
            r1 = 2
            if (r0 != r1) goto L31
        L16:
            java.lang.Object r0 = r5.D(r6, r7)
            r2.add(r0)
            boolean r0 = r3.d()
            if (r0 != 0) goto L30
            int r0 = r5.d
            if (r0 == 0) goto L28
            goto L30
        L28:
            int r0 = r3.l()
            if (r0 == r4) goto L16
            r5.d = r0
        L30:
            return
        L31:
            tb3 r2 = defpackage.ub3.b()
            throw r2
    }

    public final void J(java.lang.Object r3, int r4, defpackage.ls0 r5) {
            r2 = this;
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r4
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 == 0) goto L13
            r2 = r4 & r1
            long r0 = (long) r2
            java.lang.String r2 = r5.P()
            defpackage.gh7.o(r3, r0, r2)
            return
        L13:
            boolean r2 = r2.f
            if (r2 == 0) goto L22
            r2 = r4 & r1
            long r0 = (long) r2
            java.lang.String r2 = r5.N()
            defpackage.gh7.o(r3, r0, r2)
            return
        L22:
            r2 = r4 & r1
            long r0 = (long) r2
            ca0 r2 = r5.k()
            defpackage.gh7.o(r3, r0, r2)
            return
    }

    public final void L(int r3, java.lang.Object r4) {
            r2 = this;
            boolean r0 = r2.g
            if (r0 == 0) goto L5
            return
        L5:
            int r3 = r3 + 2
            int[] r2 = r2.a
            r2 = r2[r3]
            int r3 = r2 >>> 20
            r0 = 1
            int r3 = r0 << r3
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r0
            long r0 = (long) r2
            fh7 r2 = defpackage.gh7.d
            int r2 = r2.g(r0, r4)
            r2 = r2 | r3
            defpackage.gh7.m(r4, r0, r2)
            return
    }

    public final void M(java.lang.Object r3, int r4, int r5) {
            r2 = this;
            int r5 = r5 + 2
            int[] r2 = r2.a
            r2 = r2[r5]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r5
            long r0 = (long) r2
            defpackage.gh7.m(r3, r0, r4)
            return
    }

    public final int N(int r5, int r6) {
            r4 = this;
            int[] r4 = r4.a
            int r0 = r4.length
            int r0 = r0 / 3
            int r0 = r0 + (-1)
        L7:
            if (r6 > r0) goto L1e
            int r1 = r0 + r6
            int r1 = r1 >>> 1
            int r2 = r1 * 3
            r3 = r4[r2]
            if (r5 != r3) goto L14
            return r2
        L14:
            if (r5 >= r3) goto L1a
            int r1 = r1 + (-1)
            r0 = r1
            goto L7
        L1a:
            int r1 = r1 + 1
            r6 = r1
            goto L7
        L1e:
            r4 = -1
            return r4
    }

    public final int P(int r1) {
            r0 = this;
            int r1 = r1 + 1
            int[] r0 = r0.a
            r0 = r0[r1]
            return r0
    }

    public final void Q(java.lang.Object r19, defpackage.os0 r20) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            int[] r3 = r0.a
            int r4 = r3.length
            sun.misc.Unsafe r5 = defpackage.i54.p
            r6 = -1
            r8 = 0
            r9 = 0
        Le:
            if (r8 >= r4) goto L4bd
            int r10 = r0.P(r8)
            r11 = r3[r8]
            int r12 = O(r10)
            boolean r13 = r0.g
            r15 = 1
            if (r13 != 0) goto L3b
            r13 = 17
            if (r12 > r13) goto L3b
            int r13 = r8 + 2
            r13 = r3[r13]
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r14 = r13 & r16
            r17 = r8
            if (r14 == r6) goto L36
            long r7 = (long) r14
            int r9 = r5.getInt(r1, r7)
            r6 = r14
        L36:
            int r7 = r13 >>> 20
            int r7 = r15 << r7
            goto L41
        L3b:
            r17 = r8
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r7 = 0
        L41:
            r8 = r10 & r16
            long r13 = (long) r8
            switch(r12) {
                case 0: goto L4aa;
                case 1: goto L49a;
                case 2: goto L48c;
                case 3: goto L47e;
                case 4: goto L470;
                case 5: goto L462;
                case 6: goto L454;
                case 7: goto L443;
                case 8: goto L434;
                case 9: goto L421;
                case 10: goto L410;
                case 11: goto L401;
                case 12: goto L3f2;
                case 13: goto L3e3;
                case 14: goto L3d4;
                case 15: goto L3c5;
                case 16: goto L3b6;
                case 17: goto L3a3;
                case 18: goto L393;
                case 19: goto L383;
                case 20: goto L373;
                case 21: goto L363;
                case 22: goto L353;
                case 23: goto L343;
                case 24: goto L333;
                case 25: goto L323;
                case 26: goto L314;
                case 27: goto L301;
                case 28: goto L2f2;
                case 29: goto L2e3;
                case 30: goto L2d4;
                case 31: goto L2c5;
                case 32: goto L2b6;
                case 33: goto L2a7;
                case 34: goto L296;
                case 35: goto L287;
                case 36: goto L278;
                case 37: goto L269;
                case 38: goto L25a;
                case 39: goto L24b;
                case 40: goto L23c;
                case 41: goto L22d;
                case 42: goto L21e;
                case 43: goto L20f;
                case 44: goto L200;
                case 45: goto L1f1;
                case 46: goto L1e2;
                case 47: goto L1d3;
                case 48: goto L1c4;
                case 49: goto L1b1;
                case 50: goto L199;
                case 51: goto L180;
                case 52: goto L167;
                case 53: goto L156;
                case 54: goto L145;
                case 55: goto L134;
                case 56: goto L123;
                case 57: goto L112;
                case 58: goto Lf9;
                case 59: goto Le8;
                case 60: goto Ld3;
                case 61: goto Lc0;
                case 62: goto Lb0;
                case 63: goto La0;
                case 64: goto L90;
                case 65: goto L80;
                case 66: goto L70;
                case 67: goto L60;
                case 68: goto L4c;
                default: goto L47;
            }
        L47:
            r8 = r17
        L49:
            r12 = 0
            goto L4b9
        L4c:
            r8 = r17
            boolean r7 = r0.t(r1, r11, r8)
            if (r7 == 0) goto L49
            java.lang.Object r7 = r5.getObject(r1, r13)
            j66 r10 = r0.o(r8)
            r2.o0(r11, r7, r10)
            goto L49
        L60:
            r8 = r17
            boolean r7 = r0.t(r1, r11, r8)
            if (r7 == 0) goto L49
            long r12 = C(r13, r1)
            r2.v0(r11, r12)
            goto L49
        L70:
            r8 = r17
            boolean r7 = r0.t(r1, r11, r8)
            if (r7 == 0) goto L49
            int r7 = B(r13, r1)
            r2.u0(r11, r7)
            goto L49
        L80:
            r8 = r17
            boolean r7 = r0.t(r1, r11, r8)
            if (r7 == 0) goto L49
            long r12 = C(r13, r1)
            r2.t0(r11, r12)
            goto L49
        L90:
            r8 = r17
            boolean r7 = r0.t(r1, r11, r8)
            if (r7 == 0) goto L49
            int r7 = B(r13, r1)
            r2.s0(r11, r7)
            goto L49
        La0:
            r8 = r17
            boolean r7 = r0.t(r1, r11, r8)
            if (r7 == 0) goto L49
            int r7 = B(r13, r1)
            r2.k0(r11, r7)
            goto L49
        Lb0:
            r8 = r17
            boolean r7 = r0.t(r1, r11, r8)
            if (r7 == 0) goto L49
            int r7 = B(r13, r1)
            r2.w0(r11, r7)
            goto L49
        Lc0:
            r8 = r17
            boolean r7 = r0.t(r1, r11, r8)
            if (r7 == 0) goto L49
            java.lang.Object r7 = r5.getObject(r1, r13)
            ea0 r7 = (defpackage.ea0) r7
            r2.i0(r11, r7)
            goto L49
        Ld3:
            r8 = r17
            boolean r7 = r0.t(r1, r11, r8)
            if (r7 == 0) goto L49
            java.lang.Object r7 = r5.getObject(r1, r13)
            j66 r10 = r0.o(r8)
            r2.r0(r11, r7, r10)
            goto L49
        Le8:
            r8 = r17
            boolean r7 = r0.t(r1, r11, r8)
            if (r7 == 0) goto L49
            java.lang.Object r7 = r5.getObject(r1, r13)
            R(r11, r7, r2)
            goto L49
        Lf9:
            r8 = r17
            boolean r7 = r0.t(r1, r11, r8)
            if (r7 == 0) goto L49
            fh7 r7 = defpackage.gh7.d
            java.lang.Object r7 = r7.i(r13, r1)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r2.h0(r11, r7)
            goto L49
        L112:
            r8 = r17
            boolean r7 = r0.t(r1, r11, r8)
            if (r7 == 0) goto L49
            int r7 = B(r13, r1)
            r2.l0(r11, r7)
            goto L49
        L123:
            r8 = r17
            boolean r7 = r0.t(r1, r11, r8)
            if (r7 == 0) goto L49
            long r12 = C(r13, r1)
            r2.m0(r11, r12)
            goto L49
        L134:
            r8 = r17
            boolean r7 = r0.t(r1, r11, r8)
            if (r7 == 0) goto L49
            int r7 = B(r13, r1)
            r2.p0(r11, r7)
            goto L49
        L145:
            r8 = r17
            boolean r7 = r0.t(r1, r11, r8)
            if (r7 == 0) goto L49
            long r12 = C(r13, r1)
            r2.x0(r11, r12)
            goto L49
        L156:
            r8 = r17
            boolean r7 = r0.t(r1, r11, r8)
            if (r7 == 0) goto L49
            long r12 = C(r13, r1)
            r2.q0(r11, r12)
            goto L49
        L167:
            r8 = r17
            boolean r7 = r0.t(r1, r11, r8)
            if (r7 == 0) goto L49
            fh7 r7 = defpackage.gh7.d
            java.lang.Object r7 = r7.i(r13, r1)
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            r2.n0(r11, r7)
            goto L49
        L180:
            r8 = r17
            boolean r7 = r0.t(r1, r11, r8)
            if (r7 == 0) goto L49
            fh7 r7 = defpackage.gh7.d
            java.lang.Object r7 = r7.i(r13, r1)
            java.lang.Double r7 = (java.lang.Double) r7
            double r12 = r7.doubleValue()
            r2.j0(r11, r12)
            goto L49
        L199:
            r8 = r17
            java.lang.Object r7 = r5.getObject(r1, r13)
            if (r7 != 0) goto L1a3
            goto L49
        L1a3:
            java.lang.Object r1 = r0.n(r8)
            y04 r0 = r0.n
            r0.getClass()
            defpackage.xg6.A(r1)
            r0 = 0
            throw r0
        L1b1:
            r8 = r17
            r7 = r3[r8]
            java.lang.Object r10 = r5.getObject(r1, r13)
            java.util.List r10 = (java.util.List) r10
            j66 r11 = r0.o(r8)
            defpackage.m66.H(r7, r10, r2, r11)
            goto L49
        L1c4:
            r8 = r17
            r7 = r3[r8]
            java.lang.Object r10 = r5.getObject(r1, r13)
            java.util.List r10 = (java.util.List) r10
            defpackage.m66.O(r7, r10, r2, r15)
            goto L49
        L1d3:
            r8 = r17
            r7 = r3[r8]
            java.lang.Object r10 = r5.getObject(r1, r13)
            java.util.List r10 = (java.util.List) r10
            defpackage.m66.N(r7, r10, r2, r15)
            goto L49
        L1e2:
            r8 = r17
            r7 = r3[r8]
            java.lang.Object r10 = r5.getObject(r1, r13)
            java.util.List r10 = (java.util.List) r10
            defpackage.m66.M(r7, r10, r2, r15)
            goto L49
        L1f1:
            r8 = r17
            r7 = r3[r8]
            java.lang.Object r10 = r5.getObject(r1, r13)
            java.util.List r10 = (java.util.List) r10
            defpackage.m66.L(r7, r10, r2, r15)
            goto L49
        L200:
            r8 = r17
            r7 = r3[r8]
            java.lang.Object r10 = r5.getObject(r1, r13)
            java.util.List r10 = (java.util.List) r10
            defpackage.m66.D(r7, r10, r2, r15)
            goto L49
        L20f:
            r8 = r17
            r7 = r3[r8]
            java.lang.Object r10 = r5.getObject(r1, r13)
            java.util.List r10 = (java.util.List) r10
            defpackage.m66.Q(r7, r10, r2, r15)
            goto L49
        L21e:
            r8 = r17
            r7 = r3[r8]
            java.lang.Object r10 = r5.getObject(r1, r13)
            java.util.List r10 = (java.util.List) r10
            defpackage.m66.A(r7, r10, r2, r15)
            goto L49
        L22d:
            r8 = r17
            r7 = r3[r8]
            java.lang.Object r10 = r5.getObject(r1, r13)
            java.util.List r10 = (java.util.List) r10
            defpackage.m66.E(r7, r10, r2, r15)
            goto L49
        L23c:
            r8 = r17
            r7 = r3[r8]
            java.lang.Object r10 = r5.getObject(r1, r13)
            java.util.List r10 = (java.util.List) r10
            defpackage.m66.F(r7, r10, r2, r15)
            goto L49
        L24b:
            r8 = r17
            r7 = r3[r8]
            java.lang.Object r10 = r5.getObject(r1, r13)
            java.util.List r10 = (java.util.List) r10
            defpackage.m66.I(r7, r10, r2, r15)
            goto L49
        L25a:
            r8 = r17
            r7 = r3[r8]
            java.lang.Object r10 = r5.getObject(r1, r13)
            java.util.List r10 = (java.util.List) r10
            defpackage.m66.R(r7, r10, r2, r15)
            goto L49
        L269:
            r8 = r17
            r7 = r3[r8]
            java.lang.Object r10 = r5.getObject(r1, r13)
            java.util.List r10 = (java.util.List) r10
            defpackage.m66.J(r7, r10, r2, r15)
            goto L49
        L278:
            r8 = r17
            r7 = r3[r8]
            java.lang.Object r10 = r5.getObject(r1, r13)
            java.util.List r10 = (java.util.List) r10
            defpackage.m66.G(r7, r10, r2, r15)
            goto L49
        L287:
            r8 = r17
            r7 = r3[r8]
            java.lang.Object r10 = r5.getObject(r1, r13)
            java.util.List r10 = (java.util.List) r10
            defpackage.m66.C(r7, r10, r2, r15)
            goto L49
        L296:
            r8 = r17
            r7 = r3[r8]
            java.lang.Object r10 = r5.getObject(r1, r13)
            java.util.List r10 = (java.util.List) r10
            r11 = 0
            defpackage.m66.O(r7, r10, r2, r11)
        L2a4:
            r12 = r11
            goto L4b9
        L2a7:
            r8 = r17
            r11 = 0
            r7 = r3[r8]
            java.lang.Object r10 = r5.getObject(r1, r13)
            java.util.List r10 = (java.util.List) r10
            defpackage.m66.N(r7, r10, r2, r11)
            goto L2a4
        L2b6:
            r8 = r17
            r11 = 0
            r7 = r3[r8]
            java.lang.Object r10 = r5.getObject(r1, r13)
            java.util.List r10 = (java.util.List) r10
            defpackage.m66.M(r7, r10, r2, r11)
            goto L2a4
        L2c5:
            r8 = r17
            r11 = 0
            r7 = r3[r8]
            java.lang.Object r10 = r5.getObject(r1, r13)
            java.util.List r10 = (java.util.List) r10
            defpackage.m66.L(r7, r10, r2, r11)
            goto L2a4
        L2d4:
            r8 = r17
            r11 = 0
            r7 = r3[r8]
            java.lang.Object r10 = r5.getObject(r1, r13)
            java.util.List r10 = (java.util.List) r10
            defpackage.m66.D(r7, r10, r2, r11)
            goto L2a4
        L2e3:
            r8 = r17
            r11 = 0
            r7 = r3[r8]
            java.lang.Object r10 = r5.getObject(r1, r13)
            java.util.List r10 = (java.util.List) r10
            defpackage.m66.Q(r7, r10, r2, r11)
            goto L2a4
        L2f2:
            r8 = r17
            r7 = r3[r8]
            java.lang.Object r10 = r5.getObject(r1, r13)
            java.util.List r10 = (java.util.List) r10
            defpackage.m66.B(r7, r10, r2)
            goto L49
        L301:
            r8 = r17
            r7 = r3[r8]
            java.lang.Object r10 = r5.getObject(r1, r13)
            java.util.List r10 = (java.util.List) r10
            j66 r11 = r0.o(r8)
            defpackage.m66.K(r7, r10, r2, r11)
            goto L49
        L314:
            r8 = r17
            r7 = r3[r8]
            java.lang.Object r10 = r5.getObject(r1, r13)
            java.util.List r10 = (java.util.List) r10
            defpackage.m66.P(r7, r10, r2)
            goto L49
        L323:
            r8 = r17
            r7 = r3[r8]
            java.lang.Object r10 = r5.getObject(r1, r13)
            java.util.List r10 = (java.util.List) r10
            r12 = 0
            defpackage.m66.A(r7, r10, r2, r12)
            goto L4b9
        L333:
            r8 = r17
            r12 = 0
            r7 = r3[r8]
            java.lang.Object r10 = r5.getObject(r1, r13)
            java.util.List r10 = (java.util.List) r10
            defpackage.m66.E(r7, r10, r2, r12)
            goto L4b9
        L343:
            r8 = r17
            r12 = 0
            r7 = r3[r8]
            java.lang.Object r10 = r5.getObject(r1, r13)
            java.util.List r10 = (java.util.List) r10
            defpackage.m66.F(r7, r10, r2, r12)
            goto L4b9
        L353:
            r8 = r17
            r12 = 0
            r7 = r3[r8]
            java.lang.Object r10 = r5.getObject(r1, r13)
            java.util.List r10 = (java.util.List) r10
            defpackage.m66.I(r7, r10, r2, r12)
            goto L4b9
        L363:
            r8 = r17
            r12 = 0
            r7 = r3[r8]
            java.lang.Object r10 = r5.getObject(r1, r13)
            java.util.List r10 = (java.util.List) r10
            defpackage.m66.R(r7, r10, r2, r12)
            goto L4b9
        L373:
            r8 = r17
            r12 = 0
            r7 = r3[r8]
            java.lang.Object r10 = r5.getObject(r1, r13)
            java.util.List r10 = (java.util.List) r10
            defpackage.m66.J(r7, r10, r2, r12)
            goto L4b9
        L383:
            r8 = r17
            r12 = 0
            r7 = r3[r8]
            java.lang.Object r10 = r5.getObject(r1, r13)
            java.util.List r10 = (java.util.List) r10
            defpackage.m66.G(r7, r10, r2, r12)
            goto L4b9
        L393:
            r8 = r17
            r12 = 0
            r7 = r3[r8]
            java.lang.Object r10 = r5.getObject(r1, r13)
            java.util.List r10 = (java.util.List) r10
            defpackage.m66.C(r7, r10, r2, r12)
            goto L4b9
        L3a3:
            r8 = r17
            r12 = 0
            r7 = r7 & r9
            if (r7 == 0) goto L4b9
            java.lang.Object r7 = r5.getObject(r1, r13)
            j66 r10 = r0.o(r8)
            r2.o0(r11, r7, r10)
            goto L4b9
        L3b6:
            r8 = r17
            r12 = 0
            r7 = r7 & r9
            if (r7 == 0) goto L4b9
            long r13 = r5.getLong(r1, r13)
            r2.v0(r11, r13)
            goto L4b9
        L3c5:
            r8 = r17
            r12 = 0
            r7 = r7 & r9
            if (r7 == 0) goto L4b9
            int r7 = r5.getInt(r1, r13)
            r2.u0(r11, r7)
            goto L4b9
        L3d4:
            r8 = r17
            r12 = 0
            r7 = r7 & r9
            if (r7 == 0) goto L4b9
            long r13 = r5.getLong(r1, r13)
            r2.t0(r11, r13)
            goto L4b9
        L3e3:
            r8 = r17
            r12 = 0
            r7 = r7 & r9
            if (r7 == 0) goto L4b9
            int r7 = r5.getInt(r1, r13)
            r2.s0(r11, r7)
            goto L4b9
        L3f2:
            r8 = r17
            r12 = 0
            r7 = r7 & r9
            if (r7 == 0) goto L4b9
            int r7 = r5.getInt(r1, r13)
            r2.k0(r11, r7)
            goto L4b9
        L401:
            r8 = r17
            r12 = 0
            r7 = r7 & r9
            if (r7 == 0) goto L4b9
            int r7 = r5.getInt(r1, r13)
            r2.w0(r11, r7)
            goto L4b9
        L410:
            r8 = r17
            r12 = 0
            r7 = r7 & r9
            if (r7 == 0) goto L4b9
            java.lang.Object r7 = r5.getObject(r1, r13)
            ea0 r7 = (defpackage.ea0) r7
            r2.i0(r11, r7)
            goto L4b9
        L421:
            r8 = r17
            r12 = 0
            r7 = r7 & r9
            if (r7 == 0) goto L4b9
            java.lang.Object r7 = r5.getObject(r1, r13)
            j66 r10 = r0.o(r8)
            r2.r0(r11, r7, r10)
            goto L4b9
        L434:
            r8 = r17
            r12 = 0
            r7 = r7 & r9
            if (r7 == 0) goto L4b9
            java.lang.Object r7 = r5.getObject(r1, r13)
            R(r11, r7, r2)
            goto L4b9
        L443:
            r8 = r17
            r12 = 0
            r7 = r7 & r9
            if (r7 == 0) goto L4b9
            fh7 r7 = defpackage.gh7.d
            boolean r7 = r7.c(r13, r1)
            r2.h0(r11, r7)
            goto L4b9
        L454:
            r8 = r17
            r12 = 0
            r7 = r7 & r9
            if (r7 == 0) goto L4b9
            int r7 = r5.getInt(r1, r13)
            r2.l0(r11, r7)
            goto L4b9
        L462:
            r8 = r17
            r12 = 0
            r7 = r7 & r9
            if (r7 == 0) goto L4b9
            long r13 = r5.getLong(r1, r13)
            r2.m0(r11, r13)
            goto L4b9
        L470:
            r8 = r17
            r12 = 0
            r7 = r7 & r9
            if (r7 == 0) goto L4b9
            int r7 = r5.getInt(r1, r13)
            r2.p0(r11, r7)
            goto L4b9
        L47e:
            r8 = r17
            r12 = 0
            r7 = r7 & r9
            if (r7 == 0) goto L4b9
            long r13 = r5.getLong(r1, r13)
            r2.x0(r11, r13)
            goto L4b9
        L48c:
            r8 = r17
            r12 = 0
            r7 = r7 & r9
            if (r7 == 0) goto L4b9
            long r13 = r5.getLong(r1, r13)
            r2.q0(r11, r13)
            goto L4b9
        L49a:
            r8 = r17
            r12 = 0
            r7 = r7 & r9
            if (r7 == 0) goto L4b9
            fh7 r7 = defpackage.gh7.d
            float r7 = r7.f(r13, r1)
            r2.n0(r11, r7)
            goto L4b9
        L4aa:
            r8 = r17
            r12 = 0
            r7 = r7 & r9
            if (r7 == 0) goto L4b9
            fh7 r7 = defpackage.gh7.d
            double r13 = r7.e(r13, r1)
            r2.j0(r11, r13)
        L4b9:
            int r8 = r8 + 3
            goto Le
        L4bd:
            ng7 r0 = r0.m
            r0.getClass()
            r0 = r1
            pr2 r0 = (defpackage.pr2) r0
            mg7 r0 = r0.unknownFields
            r0.d(r2)
            return
    }

    @Override // defpackage.j66
    public final void a(java.lang.Object r8) {
            r7 = this;
            int r0 = r7.i
        L2:
            r1 = 0
            int[] r2 = r7.h
            int r3 = r7.j
            if (r0 >= r3) goto L2d
            r2 = r2[r0]
            int r2 = r7.P(r2)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r3
            long r2 = (long) r2
            fh7 r4 = defpackage.gh7.d
            java.lang.Object r4 = r4.i(r2, r8)
            if (r4 != 0) goto L1d
            goto L2a
        L1d:
            y04 r5 = r7.n
            r5.getClass()
            r5 = r4
            x04 r5 = (defpackage.x04) r5
            r5.A = r1
            defpackage.gh7.o(r8, r2, r4)
        L2a:
            int r0 = r0 + 1
            goto L2
        L2d:
            int r0 = r2.length
        L2e:
            if (r3 >= r0) goto L3b
            r4 = r2[r3]
            long r4 = (long) r4
            ow3 r6 = r7.l
            r6.a(r4, r8)
            int r3 = r3 + 1
            goto L2e
        L3b:
            ng7 r7 = r7.m
            r7.getClass()
            pr2 r8 = (defpackage.pr2) r8
            mg7 r7 = r8.unknownFields
            r7.e = r1
            return
    }

    @Override // defpackage.j66
    public final boolean b(java.lang.Object r15) {
            r14 = this;
            r0 = -1
            r1 = 0
            r2 = r1
            r3 = r2
        L4:
            int r4 = r14.i
            r5 = 1
            if (r2 >= r4) goto Lf7
            int[] r4 = r14.h
            r4 = r4[r2]
            int[] r6 = r14.a
            r7 = r6[r4]
            int r8 = r14.P(r4)
            boolean r9 = r14.g
            r10 = 1048575(0xfffff, float:1.469367E-39)
            if (r9 != 0) goto L31
            int r11 = r4 + 2
            r6 = r6[r11]
            r11 = r6 & r10
            int r6 = r6 >>> 20
            int r6 = r5 << r6
            if (r11 == r0) goto L32
            sun.misc.Unsafe r0 = defpackage.i54.p
            long r12 = (long) r11
            int r3 = r0.getInt(r15, r12)
            r0 = r11
            goto L32
        L31:
            r6 = r1
        L32:
            r11 = 268435456(0x10000000, float:2.524355E-29)
            r11 = r11 & r8
            if (r11 == 0) goto L49
            if (r9 == 0) goto L3e
            boolean r11 = r14.s(r4, r15)
            goto L45
        L3e:
            r11 = r3 & r6
            if (r11 == 0) goto L44
            r11 = r5
            goto L45
        L44:
            r11 = r1
        L45:
            if (r11 != 0) goto L49
            goto Lf2
        L49:
            int r11 = O(r8)
            r12 = 9
            if (r11 == r12) goto Ld1
            r12 = 17
            if (r11 == r12) goto Ld1
            r5 = 27
            if (r11 == r5) goto La6
            r5 = 60
            if (r11 == r5) goto L8c
            r5 = 68
            if (r11 == r5) goto L8c
            r5 = 49
            if (r11 == r5) goto La6
            r5 = 50
            if (r11 == r5) goto L6b
            goto Lf3
        L6b:
            r5 = r8 & r10
            long r5 = (long) r5
            fh7 r7 = defpackage.gh7.d
            java.lang.Object r5 = r7.i(r5, r15)
            y04 r6 = r14.n
            r6.getClass()
            x04 r5 = (defpackage.x04) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L83
            goto Lf3
        L83:
            java.lang.Object r14 = r14.n(r4)
            defpackage.xg6.A(r14)
            r14 = 0
            throw r14
        L8c:
            boolean r5 = r14.t(r15, r7, r4)
            if (r5 == 0) goto Lf3
            j66 r4 = r14.o(r4)
            r5 = r8 & r10
            long r5 = (long) r5
            fh7 r7 = defpackage.gh7.d
            java.lang.Object r5 = r7.i(r5, r15)
            boolean r4 = r4.b(r5)
            if (r4 != 0) goto Lf3
            goto Lf2
        La6:
            r5 = r8 & r10
            long r5 = (long) r5
            fh7 r7 = defpackage.gh7.d
            java.lang.Object r5 = r7.i(r5, r15)
            java.util.List r5 = (java.util.List) r5
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto Lb8
            goto Lf3
        Lb8:
            j66 r4 = r14.o(r4)
            r6 = r1
        Lbd:
            int r7 = r5.size()
            if (r6 >= r7) goto Lf3
            java.lang.Object r7 = r5.get(r6)
            boolean r7 = r4.b(r7)
            if (r7 != 0) goto Lce
            goto Lf2
        Lce:
            int r6 = r6 + 1
            goto Lbd
        Ld1:
            if (r9 == 0) goto Ld8
            boolean r5 = r14.s(r4, r15)
            goto Ldd
        Ld8:
            r6 = r6 & r3
            if (r6 == 0) goto Ldc
            goto Ldd
        Ldc:
            r5 = r1
        Ldd:
            if (r5 == 0) goto Lf3
            j66 r4 = r14.o(r4)
            r5 = r8 & r10
            long r5 = (long) r5
            fh7 r7 = defpackage.gh7.d
            java.lang.Object r5 = r7.i(r5, r15)
            boolean r4 = r4.b(r5)
            if (r4 != 0) goto Lf3
        Lf2:
            return r1
        Lf3:
            int r2 = r2 + 1
            goto L4
        Lf7:
            return r5
    }

    @Override // defpackage.j66
    public final boolean c(defpackage.pr2 r12, defpackage.pr2 r13) {
            r11 = this;
            int[] r0 = r11.a
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L5:
            r4 = 1
            if (r3 >= r1) goto L1f5
            int r5 = r11.P(r3)
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r5 & r6
            long r7 = (long) r7
            int r5 = O(r5)
            switch(r5) {
                case 0: goto L1d2;
                case 1: goto L1b7;
                case 2: goto L1a2;
                case 3: goto L18d;
                case 4: goto L17a;
                case 5: goto L164;
                case 6: goto L150;
                case 7: goto L13c;
                case 8: goto L124;
                case 9: goto L10c;
                case 10: goto Lf4;
                case 11: goto Le0;
                case 12: goto Lcc;
                case 13: goto Lb8;
                case 14: goto La2;
                case 15: goto L8e;
                case 16: goto L78;
                case 17: goto L60;
                case 18: goto L50;
                case 19: goto L50;
                case 20: goto L50;
                case 21: goto L50;
                case 22: goto L50;
                case 23: goto L50;
                case 24: goto L50;
                case 25: goto L50;
                case 26: goto L50;
                case 27: goto L50;
                case 28: goto L50;
                case 29: goto L50;
                case 30: goto L50;
                case 31: goto L50;
                case 32: goto L50;
                case 33: goto L50;
                case 34: goto L50;
                case 35: goto L50;
                case 36: goto L50;
                case 37: goto L50;
                case 38: goto L50;
                case 39: goto L50;
                case 40: goto L50;
                case 41: goto L50;
                case 42: goto L50;
                case 43: goto L50;
                case 44: goto L50;
                case 45: goto L50;
                case 46: goto L50;
                case 47: goto L50;
                case 48: goto L50;
                case 49: goto L50;
                case 50: goto L40;
                case 51: goto L1b;
                case 52: goto L1b;
                case 53: goto L1b;
                case 54: goto L1b;
                case 55: goto L1b;
                case 56: goto L1b;
                case 57: goto L1b;
                case 58: goto L1b;
                case 59: goto L1b;
                case 60: goto L1b;
                case 61: goto L1b;
                case 62: goto L1b;
                case 63: goto L1b;
                case 64: goto L1b;
                case 65: goto L1b;
                case 66: goto L1b;
                case 67: goto L1b;
                case 68: goto L1b;
                default: goto L19;
            }
        L19:
            goto L1ee
        L1b:
            int r5 = r3 + 2
            r5 = r0[r5]
            r5 = r5 & r6
            long r5 = (long) r5
            fh7 r9 = defpackage.gh7.d
            int r10 = r9.g(r5, r12)
            int r5 = r9.g(r5, r13)
            if (r10 != r5) goto L3d
            java.lang.Object r5 = r9.i(r7, r12)
            java.lang.Object r6 = r9.i(r7, r13)
            boolean r5 = defpackage.m66.y(r5, r6)
            if (r5 == 0) goto L3d
            goto L1ee
        L3d:
            r4 = r2
            goto L1ee
        L40:
            fh7 r4 = defpackage.gh7.d
            java.lang.Object r5 = r4.i(r7, r12)
            java.lang.Object r4 = r4.i(r7, r13)
            boolean r4 = defpackage.m66.y(r5, r4)
            goto L1ee
        L50:
            fh7 r4 = defpackage.gh7.d
            java.lang.Object r5 = r4.i(r7, r12)
            java.lang.Object r4 = r4.i(r7, r13)
            boolean r4 = defpackage.m66.y(r5, r4)
            goto L1ee
        L60:
            boolean r5 = r11.k(r12, r13, r3)
            if (r5 == 0) goto L3d
            fh7 r5 = defpackage.gh7.d
            java.lang.Object r6 = r5.i(r7, r12)
            java.lang.Object r5 = r5.i(r7, r13)
            boolean r5 = defpackage.m66.y(r6, r5)
            if (r5 == 0) goto L3d
            goto L1ee
        L78:
            boolean r5 = r11.k(r12, r13, r3)
            if (r5 == 0) goto L3d
            fh7 r5 = defpackage.gh7.d
            long r9 = r5.h(r7, r12)
            long r5 = r5.h(r7, r13)
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 != 0) goto L3d
            goto L1ee
        L8e:
            boolean r5 = r11.k(r12, r13, r3)
            if (r5 == 0) goto L3d
            fh7 r5 = defpackage.gh7.d
            int r6 = r5.g(r7, r12)
            int r5 = r5.g(r7, r13)
            if (r6 != r5) goto L3d
            goto L1ee
        La2:
            boolean r5 = r11.k(r12, r13, r3)
            if (r5 == 0) goto L3d
            fh7 r5 = defpackage.gh7.d
            long r9 = r5.h(r7, r12)
            long r5 = r5.h(r7, r13)
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 != 0) goto L3d
            goto L1ee
        Lb8:
            boolean r5 = r11.k(r12, r13, r3)
            if (r5 == 0) goto L3d
            fh7 r5 = defpackage.gh7.d
            int r6 = r5.g(r7, r12)
            int r5 = r5.g(r7, r13)
            if (r6 != r5) goto L3d
            goto L1ee
        Lcc:
            boolean r5 = r11.k(r12, r13, r3)
            if (r5 == 0) goto L3d
            fh7 r5 = defpackage.gh7.d
            int r6 = r5.g(r7, r12)
            int r5 = r5.g(r7, r13)
            if (r6 != r5) goto L3d
            goto L1ee
        Le0:
            boolean r5 = r11.k(r12, r13, r3)
            if (r5 == 0) goto L3d
            fh7 r5 = defpackage.gh7.d
            int r6 = r5.g(r7, r12)
            int r5 = r5.g(r7, r13)
            if (r6 != r5) goto L3d
            goto L1ee
        Lf4:
            boolean r5 = r11.k(r12, r13, r3)
            if (r5 == 0) goto L3d
            fh7 r5 = defpackage.gh7.d
            java.lang.Object r6 = r5.i(r7, r12)
            java.lang.Object r5 = r5.i(r7, r13)
            boolean r5 = defpackage.m66.y(r6, r5)
            if (r5 == 0) goto L3d
            goto L1ee
        L10c:
            boolean r5 = r11.k(r12, r13, r3)
            if (r5 == 0) goto L3d
            fh7 r5 = defpackage.gh7.d
            java.lang.Object r6 = r5.i(r7, r12)
            java.lang.Object r5 = r5.i(r7, r13)
            boolean r5 = defpackage.m66.y(r6, r5)
            if (r5 == 0) goto L3d
            goto L1ee
        L124:
            boolean r5 = r11.k(r12, r13, r3)
            if (r5 == 0) goto L3d
            fh7 r5 = defpackage.gh7.d
            java.lang.Object r6 = r5.i(r7, r12)
            java.lang.Object r5 = r5.i(r7, r13)
            boolean r5 = defpackage.m66.y(r6, r5)
            if (r5 == 0) goto L3d
            goto L1ee
        L13c:
            boolean r5 = r11.k(r12, r13, r3)
            if (r5 == 0) goto L3d
            fh7 r5 = defpackage.gh7.d
            boolean r6 = r5.c(r7, r12)
            boolean r5 = r5.c(r7, r13)
            if (r6 != r5) goto L3d
            goto L1ee
        L150:
            boolean r5 = r11.k(r12, r13, r3)
            if (r5 == 0) goto L3d
            fh7 r5 = defpackage.gh7.d
            int r6 = r5.g(r7, r12)
            int r5 = r5.g(r7, r13)
            if (r6 != r5) goto L3d
            goto L1ee
        L164:
            boolean r5 = r11.k(r12, r13, r3)
            if (r5 == 0) goto L3d
            fh7 r5 = defpackage.gh7.d
            long r9 = r5.h(r7, r12)
            long r5 = r5.h(r7, r13)
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 != 0) goto L3d
            goto L1ee
        L17a:
            boolean r5 = r11.k(r12, r13, r3)
            if (r5 == 0) goto L3d
            fh7 r5 = defpackage.gh7.d
            int r6 = r5.g(r7, r12)
            int r5 = r5.g(r7, r13)
            if (r6 != r5) goto L3d
            goto L1ee
        L18d:
            boolean r5 = r11.k(r12, r13, r3)
            if (r5 == 0) goto L3d
            fh7 r5 = defpackage.gh7.d
            long r9 = r5.h(r7, r12)
            long r5 = r5.h(r7, r13)
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 != 0) goto L3d
            goto L1ee
        L1a2:
            boolean r5 = r11.k(r12, r13, r3)
            if (r5 == 0) goto L3d
            fh7 r5 = defpackage.gh7.d
            long r9 = r5.h(r7, r12)
            long r5 = r5.h(r7, r13)
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 != 0) goto L3d
            goto L1ee
        L1b7:
            boolean r5 = r11.k(r12, r13, r3)
            if (r5 == 0) goto L3d
            fh7 r5 = defpackage.gh7.d
            float r6 = r5.f(r7, r12)
            int r6 = java.lang.Float.floatToIntBits(r6)
            float r5 = r5.f(r7, r13)
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r6 != r5) goto L3d
            goto L1ee
        L1d2:
            boolean r5 = r11.k(r12, r13, r3)
            if (r5 == 0) goto L3d
            fh7 r5 = defpackage.gh7.d
            double r9 = r5.e(r7, r12)
            long r9 = java.lang.Double.doubleToLongBits(r9)
            double r5 = r5.e(r7, r13)
            long r5 = java.lang.Double.doubleToLongBits(r5)
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 != 0) goto L3d
        L1ee:
            if (r4 != 0) goto L1f1
            goto L204
        L1f1:
            int r3 = r3 + 3
            goto L5
        L1f5:
            ng7 r11 = r11.m
            r11.getClass()
            mg7 r11 = r12.unknownFields
            mg7 r12 = r13.unknownFields
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L205
        L204:
            return r2
        L205:
            return r4
    }

    @Override // defpackage.j66
    public final void d(java.lang.Object r21, defpackage.ls0 r22, defpackage.g82 r23) {
            r20 = this;
            r1 = r20
            r2 = r21
            r4 = r22
            r6 = r23
            r6.getClass()
            ng7 r7 = r1.m
            int[] r8 = r1.h
            int r9 = r1.j
            int r10 = r1.i
            r12 = 0
        L14:
            int r0 = r4.e()     // Catch: java.lang.Throwable -> L712
            int r3 = r1.c     // Catch: java.lang.Throwable -> L712
            r5 = 0
            if (r0 < r3) goto L2d
            int r3 = r1.d     // Catch: java.lang.Throwable -> L712
            if (r0 > r3) goto L2d
            int r3 = r1.N(r0, r5)     // Catch: java.lang.Throwable -> L712
        L25:
            r13 = r3
            goto L2f
        L27:
            r6 = r1
            r1 = r9
            r15 = r10
            r10 = r8
            goto L715
        L2d:
            r3 = -1
            goto L25
        L2f:
            mg7 r14 = defpackage.mg7.f
            if (r13 >= 0) goto L70
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != r3) goto L49
        L38:
            if (r10 >= r9) goto L42
            r0 = r8[r10]
            r1.l(r0, r2, r12)
            int r10 = r10 + 1
            goto L38
        L42:
            if (r12 == 0) goto L708
            r7.getClass()
            goto La9
        L49:
            r7.getClass()     // Catch: java.lang.Throwable -> L712
            if (r12 != 0) goto L5c
            r0 = r2
            pr2 r0 = (defpackage.pr2) r0     // Catch: java.lang.Throwable -> L712
            mg7 r3 = r0.unknownFields     // Catch: java.lang.Throwable -> L712
            if (r3 != r14) goto L5b
            mg7 r3 = defpackage.mg7.b()     // Catch: java.lang.Throwable -> L712
            r0.unknownFields = r3     // Catch: java.lang.Throwable -> L712
        L5b:
            r12 = r3
        L5c:
            boolean r0 = defpackage.ng7.a(r12, r4)     // Catch: java.lang.Throwable -> L712
            if (r0 == 0) goto L63
            goto L14
        L63:
            if (r10 >= r9) goto L6d
            r0 = r8[r10]
            r1.l(r0, r2, r12)
            int r10 = r10 + 1
            goto L63
        L6d:
            if (r12 == 0) goto L708
            goto La9
        L70:
            int r3 = r1.P(r13)     // Catch: java.lang.Throwable -> L712
            int r15 = O(r3)     // Catch: java.lang.Throwable -> L6d0 defpackage.tb3 -> L6d8
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r17 = 0
            ow3 r11 = r1.l
            switch(r15) {
                case 0: goto L6a4;
                case 1: goto L68c;
                case 2: goto L676;
                case 3: goto L660;
                case 4: goto L649;
                case 5: goto L632;
                case 6: goto L61b;
                case 7: goto L602;
                case 8: goto L5f3;
                case 9: goto L5b3;
                case 10: goto L59c;
                case 11: goto L585;
                case 12: goto L55b;
                case 13: goto L544;
                case 14: goto L52d;
                case 15: goto L516;
                case 16: goto L4ff;
                case 17: goto L4bf;
                case 18: goto L4ab;
                case 19: goto L497;
                case 20: goto L483;
                case 21: goto L46f;
                case 22: goto L45b;
                case 23: goto L447;
                case 24: goto L433;
                case 25: goto L41c;
                case 26: goto L3f2;
                case 27: goto L3e2;
                case 28: goto L3d1;
                case 29: goto L3c0;
                case 30: goto L3a7;
                case 31: goto L396;
                case 32: goto L385;
                case 33: goto L374;
                case 34: goto L363;
                case 35: goto L352;
                case 36: goto L341;
                case 37: goto L330;
                case 38: goto L320;
                case 39: goto L310;
                case 40: goto L300;
                case 41: goto L2f0;
                case 42: goto L2e0;
                case 43: goto L2d0;
                case 44: goto L2b8;
                case 45: goto L2a8;
                case 46: goto L298;
                case 47: goto L288;
                case 48: goto L278;
                case 49: goto L25d;
                case 50: goto L254;
                case 51: goto L240;
                case 52: goto L22c;
                case 53: goto L218;
                case 54: goto L204;
                case 55: goto L1f0;
                case 56: goto L1dc;
                case 57: goto L1c8;
                case 58: goto L1b4;
                case 59: goto L1ac;
                case 60: goto L177;
                case 61: goto L168;
                case 62: goto L155;
                case 63: goto L129;
                case 64: goto L116;
                case 65: goto L103;
                case 66: goto Lf0;
                case 67: goto Ldd;
                case 68: goto Lbb;
                default: goto L82;
            }
        L82:
            if (r12 != 0) goto L96
            r7.getClass()     // Catch: defpackage.tb3 -> L8d java.lang.Throwable -> L712
            mg7 r0 = defpackage.mg7.b()     // Catch: defpackage.tb3 -> L8d java.lang.Throwable -> L712
            r12 = r0
            goto L96
        L8d:
            r18 = r9
            r15 = r10
        L90:
            r9 = r6
            r10 = r8
            r6 = r1
            r8 = r4
            goto L6df
        L96:
            r7.getClass()     // Catch: defpackage.tb3 -> L8d java.lang.Throwable -> L712
            boolean r0 = defpackage.ng7.a(r12, r4)     // Catch: defpackage.tb3 -> L8d java.lang.Throwable -> L712
            if (r0 != 0) goto Lb2
        L9f:
            if (r10 >= r9) goto La9
            r0 = r8[r10]
            r1.l(r0, r2, r12)
            int r10 = r10 + 1
            goto L9f
        La9:
            mg7 r12 = (defpackage.mg7) r12
            r0 = r2
            pr2 r0 = (defpackage.pr2) r0
            r0.unknownFields = r12
            goto L708
        Lb2:
            r18 = r9
            r15 = r10
            r9 = r6
            r10 = r8
            r6 = r1
            r8 = r4
            goto L6bf
        Lbb:
            r3 = r3 & r16
            r15 = r10
            long r10 = (long) r3
            j66 r3 = r1.o(r13)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            java.lang.Object r3 = r4.x(r3, r6)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            defpackage.gh7.o(r2, r10, r3)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            r1.M(r2, r0, r13)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            goto L13f
        Lcf:
            r0 = move-exception
            r6 = r1
            r10 = r8
            r1 = r9
            goto L715
        Ld5:
            r10 = r8
            r18 = r9
        Ld8:
            r8 = r4
            r9 = r6
            r6 = r1
            goto L6df
        Ldd:
            r15 = r10
            r3 = r3 & r16
            long r10 = (long) r3     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            long r18 = r4.L()     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            java.lang.Long r3 = java.lang.Long.valueOf(r18)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            defpackage.gh7.o(r2, r10, r3)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            r1.M(r2, r0, r13)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            goto L13f
        Lf0:
            r15 = r10
            r3 = r3 & r16
            long r10 = (long) r3     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            int r3 = r4.J()     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            defpackage.gh7.o(r2, r10, r3)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            r1.M(r2, r0, r13)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            goto L13f
        L103:
            r15 = r10
            r3 = r3 & r16
            long r10 = (long) r3     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            long r18 = r4.H()     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            java.lang.Long r3 = java.lang.Long.valueOf(r18)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            defpackage.gh7.o(r2, r10, r3)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            r1.M(r2, r0, r13)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            goto L13f
        L116:
            r15 = r10
            r3 = r3 & r16
            long r10 = (long) r3     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            int r3 = r4.F()     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            defpackage.gh7.o(r2, r10, r3)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            r1.M(r2, r0, r13)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            goto L13f
        L129:
            r15 = r10
            int r5 = r4.o()     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            y93 r10 = r1.m(r13)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            if (r10 == 0) goto L147
            boolean r10 = r10.a(r5)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            if (r10 == 0) goto L13b
            goto L147
        L13b:
            java.lang.Object r12 = defpackage.m66.z(r0, r5, r12, r7)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
        L13f:
            r10 = r8
            r18 = r9
        L142:
            r8 = r4
            r9 = r6
            r6 = r1
            goto L6bf
        L147:
            r3 = r3 & r16
            long r10 = (long) r3     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            defpackage.gh7.o(r2, r10, r3)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            r1.M(r2, r0, r13)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            goto L13f
        L155:
            r15 = r10
            r3 = r3 & r16
            long r10 = (long) r3     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            int r3 = r4.Q()     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            defpackage.gh7.o(r2, r10, r3)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            r1.M(r2, r0, r13)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            goto L13f
        L168:
            r15 = r10
            r3 = r3 & r16
            long r10 = (long) r3     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            ca0 r3 = r4.k()     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            defpackage.gh7.o(r2, r10, r3)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            r1.M(r2, r0, r13)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            goto L13f
        L177:
            r15 = r10
            boolean r5 = r1.t(r2, r0, r13)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            if (r5 == 0) goto L197
            r3 = r3 & r16
            long r10 = (long) r3     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            fh7 r3 = defpackage.gh7.d     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            java.lang.Object r3 = r3.i(r10, r2)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            j66 r5 = r1.o(r13)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            java.lang.Object r5 = r4.E(r5, r6)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            pr2 r3 = defpackage.aa3.c(r3, r5)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            defpackage.gh7.o(r2, r10, r3)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            goto L1a8
        L197:
            r3 = r3 & r16
            long r10 = (long) r3     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            j66 r3 = r1.o(r13)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            java.lang.Object r3 = r4.E(r3, r6)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            defpackage.gh7.o(r2, r10, r3)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            r1.L(r13, r2)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
        L1a8:
            r1.M(r2, r0, r13)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            goto L13f
        L1ac:
            r15 = r10
            r1.J(r2, r3, r4)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            r1.M(r2, r0, r13)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            goto L13f
        L1b4:
            r15 = r10
            r3 = r3 & r16
            long r10 = (long) r3     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            boolean r3 = r4.i()     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            defpackage.gh7.o(r2, r10, r3)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            r1.M(r2, r0, r13)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            goto L13f
        L1c8:
            r15 = r10
            r3 = r3 & r16
            long r10 = (long) r3     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            int r3 = r4.q()     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            defpackage.gh7.o(r2, r10, r3)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            r1.M(r2, r0, r13)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            goto L13f
        L1dc:
            r15 = r10
            r3 = r3 & r16
            long r10 = (long) r3     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            long r18 = r4.s()     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            java.lang.Long r3 = java.lang.Long.valueOf(r18)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            defpackage.gh7.o(r2, r10, r3)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            r1.M(r2, r0, r13)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            goto L13f
        L1f0:
            r15 = r10
            r3 = r3 & r16
            long r10 = (long) r3     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            int r3 = r4.z()     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            defpackage.gh7.o(r2, r10, r3)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            r1.M(r2, r0, r13)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            goto L13f
        L204:
            r15 = r10
            r3 = r3 & r16
            long r10 = (long) r3     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            long r18 = r4.S()     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            java.lang.Long r3 = java.lang.Long.valueOf(r18)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            defpackage.gh7.o(r2, r10, r3)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            r1.M(r2, r0, r13)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            goto L13f
        L218:
            r15 = r10
            r3 = r3 & r16
            long r10 = (long) r3     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            long r18 = r4.B()     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            java.lang.Long r3 = java.lang.Long.valueOf(r18)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            defpackage.gh7.o(r2, r10, r3)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            r1.M(r2, r0, r13)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            goto L13f
        L22c:
            r15 = r10
            r3 = r3 & r16
            long r10 = (long) r3     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            float r3 = r4.u()     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            defpackage.gh7.o(r2, r10, r3)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            r1.M(r2, r0, r13)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            goto L13f
        L240:
            r15 = r10
            r3 = r3 & r16
            long r10 = (long) r3     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            double r18 = r4.m()     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            java.lang.Double r3 = java.lang.Double.valueOf(r18)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            defpackage.gh7.o(r2, r10, r3)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            r1.M(r2, r0, r13)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            goto L13f
        L254:
            r15 = r10
            java.lang.Object r0 = r1.n(r13)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            r1.v(r13, r2, r0)     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
            throw r17     // Catch: java.lang.Throwable -> Lcf defpackage.tb3 -> Ld5
        L25d:
            r15 = r10
            r0 = r3 & r16
            r10 = r8
            r18 = r9
            long r8 = (long) r0
            j66 r0 = r1.o(r13)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            java.util.List r3 = r11.c(r8, r2)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            r4.y(r3, r0, r6)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            goto L142
        L271:
            r6 = r1
        L272:
            r1 = r18
            goto L715
        L276:
            r0 = move-exception
            goto L271
        L278:
            r18 = r9
            r15 = r10
            r10 = r8
            r0 = r3 & r16
            long r8 = (long) r0     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            java.util.List r0 = r11.c(r8, r2)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            r4.M(r0)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            goto L142
        L288:
            r18 = r9
            r15 = r10
            r10 = r8
            r0 = r3 & r16
            long r8 = (long) r0     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            java.util.List r0 = r11.c(r8, r2)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            r4.K(r0)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            goto L142
        L298:
            r18 = r9
            r15 = r10
            r10 = r8
            r0 = r3 & r16
            long r8 = (long) r0     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            java.util.List r0 = r11.c(r8, r2)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            r4.I(r0)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            goto L142
        L2a8:
            r18 = r9
            r15 = r10
            r10 = r8
            r0 = r3 & r16
            long r8 = (long) r0     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            java.util.List r0 = r11.c(r8, r2)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            r4.G(r0)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            goto L142
        L2b8:
            r18 = r9
            r15 = r10
            r10 = r8
            r3 = r3 & r16
            long r8 = (long) r3     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            java.util.List r3 = r11.c(r8, r2)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            r4.p(r3)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            y93 r5 = r1.m(r13)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            java.lang.Object r12 = defpackage.m66.v(r0, r3, r5, r12, r7)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            goto L142
        L2d0:
            r18 = r9
            r15 = r10
            r10 = r8
            r0 = r3 & r16
            long r8 = (long) r0     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            java.util.List r0 = r11.c(r8, r2)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            r4.R(r0)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            goto L142
        L2e0:
            r18 = r9
            r15 = r10
            r10 = r8
            r0 = r3 & r16
            long r8 = (long) r0     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            java.util.List r0 = r11.c(r8, r2)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            r4.j(r0)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            goto L142
        L2f0:
            r18 = r9
            r15 = r10
            r10 = r8
            r0 = r3 & r16
            long r8 = (long) r0     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            java.util.List r0 = r11.c(r8, r2)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            r4.r(r0)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            goto L142
        L300:
            r18 = r9
            r15 = r10
            r10 = r8
            r0 = r3 & r16
            long r8 = (long) r0     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            java.util.List r0 = r11.c(r8, r2)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            r4.t(r0)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            goto L142
        L310:
            r18 = r9
            r15 = r10
            r10 = r8
            r0 = r3 & r16
            long r8 = (long) r0     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            java.util.List r0 = r11.c(r8, r2)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            r4.A(r0)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            goto L142
        L320:
            r18 = r9
            r15 = r10
            r10 = r8
            r0 = r3 & r16
            long r8 = (long) r0     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            java.util.List r0 = r11.c(r8, r2)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            r4.T(r0)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            goto L142
        L330:
            r18 = r9
            r15 = r10
            r10 = r8
            long r8 = A(r3)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            java.util.List r0 = r11.c(r8, r2)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            r4.C(r0)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            goto L142
        L341:
            r18 = r9
            r15 = r10
            r10 = r8
            long r8 = A(r3)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            java.util.List r0 = r11.c(r8, r2)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            r4.v(r0)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            goto L142
        L352:
            r18 = r9
            r15 = r10
            r10 = r8
            long r8 = A(r3)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            java.util.List r0 = r11.c(r8, r2)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            r4.n(r0)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            goto L142
        L363:
            r18 = r9
            r15 = r10
            r10 = r8
            long r8 = A(r3)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            java.util.List r0 = r11.c(r8, r2)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            r4.M(r0)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            goto L142
        L374:
            r18 = r9
            r15 = r10
            r10 = r8
            long r8 = A(r3)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            java.util.List r0 = r11.c(r8, r2)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            r4.K(r0)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            goto L142
        L385:
            r18 = r9
            r15 = r10
            r10 = r8
            long r8 = A(r3)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            java.util.List r0 = r11.c(r8, r2)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            r4.I(r0)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            goto L142
        L396:
            r18 = r9
            r15 = r10
            r10 = r8
            long r8 = A(r3)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            java.util.List r0 = r11.c(r8, r2)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            r4.G(r0)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            goto L142
        L3a7:
            r18 = r9
            r15 = r10
            r10 = r8
            long r8 = A(r3)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            java.util.List r3 = r11.c(r8, r2)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            r4.p(r3)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            y93 r5 = r1.m(r13)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            java.lang.Object r12 = defpackage.m66.v(r0, r3, r5, r12, r7)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            goto L142
        L3c0:
            r18 = r9
            r15 = r10
            r10 = r8
            long r8 = A(r3)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            java.util.List r0 = r11.c(r8, r2)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            r4.R(r0)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            goto L142
        L3d1:
            r18 = r9
            r15 = r10
            r10 = r8
            long r8 = A(r3)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            java.util.List r0 = r11.c(r8, r2)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            r4.l(r0)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            goto L142
        L3e2:
            r18 = r9
            r15 = r10
            r10 = r8
            j66 r5 = r1.o(r13)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            r1.I(r2, r3, r4, r5, r6)     // Catch: defpackage.tb3 -> Ld8 java.lang.Throwable -> L276
            r8 = r4
            r9 = r6
            r6 = r1
            goto L6bf
        L3f2:
            r18 = r9
            r15 = r10
            r9 = r6
            r10 = r8
            r6 = r1
            r8 = r4
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r3
            r1 = 1
            if (r0 == 0) goto L401
            r0 = r1
            goto L402
        L401:
            r0 = r5
        L402:
            if (r0 == 0) goto L410
            r0 = r3 & r16
            long r3 = (long) r0
            java.util.List r0 = r11.c(r3, r2)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            r8.O(r0, r1)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            goto L6bf
        L410:
            r0 = r3 & r16
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            java.util.List r0 = r11.c(r0, r2)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            r8.O(r0, r5)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            goto L6bf
        L41c:
            r18 = r9
            r15 = r10
            r9 = r6
            r10 = r8
            r6 = r1
            r8 = r4
            long r0 = A(r3)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            java.util.List r0 = r11.c(r0, r2)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            r8.j(r0)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            goto L6bf
        L430:
            r0 = move-exception
            goto L272
        L433:
            r18 = r9
            r15 = r10
            r9 = r6
            r10 = r8
            r6 = r1
            r8 = r4
            long r0 = A(r3)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            java.util.List r0 = r11.c(r0, r2)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            r8.r(r0)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            goto L6bf
        L447:
            r18 = r9
            r15 = r10
            r9 = r6
            r10 = r8
            r6 = r1
            r8 = r4
            long r0 = A(r3)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            java.util.List r0 = r11.c(r0, r2)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            r8.t(r0)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            goto L6bf
        L45b:
            r18 = r9
            r15 = r10
            r9 = r6
            r10 = r8
            r6 = r1
            r8 = r4
            long r0 = A(r3)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            java.util.List r0 = r11.c(r0, r2)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            r8.A(r0)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            goto L6bf
        L46f:
            r18 = r9
            r15 = r10
            r9 = r6
            r10 = r8
            r6 = r1
            r8 = r4
            long r0 = A(r3)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            java.util.List r0 = r11.c(r0, r2)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            r8.T(r0)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            goto L6bf
        L483:
            r18 = r9
            r15 = r10
            r9 = r6
            r10 = r8
            r6 = r1
            r8 = r4
            long r0 = A(r3)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            java.util.List r0 = r11.c(r0, r2)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            r8.C(r0)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            goto L6bf
        L497:
            r18 = r9
            r15 = r10
            r9 = r6
            r10 = r8
            r6 = r1
            r8 = r4
            long r0 = A(r3)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            java.util.List r0 = r11.c(r0, r2)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            r8.v(r0)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            goto L6bf
        L4ab:
            r18 = r9
            r15 = r10
            r9 = r6
            r10 = r8
            r6 = r1
            r8 = r4
            long r0 = A(r3)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            java.util.List r0 = r11.c(r0, r2)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            r8.n(r0)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            goto L6bf
        L4bf:
            r18 = r9
            r15 = r10
            r9 = r6
            r10 = r8
            r6 = r1
            r8 = r4
            boolean r0 = r6.s(r13, r2)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            if (r0 == 0) goto L4eb
            long r0 = A(r3)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            fh7 r4 = defpackage.gh7.d     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            java.lang.Object r0 = r4.i(r0, r2)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            j66 r1 = r6.o(r13)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            java.lang.Object r1 = r8.x(r1, r9)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            pr2 r0 = defpackage.aa3.c(r0, r1)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            long r3 = A(r3)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            defpackage.gh7.o(r2, r3, r0)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            goto L6bf
        L4eb:
            long r0 = A(r3)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            j66 r3 = r6.o(r13)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            java.lang.Object r3 = r8.x(r3, r9)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            defpackage.gh7.o(r2, r0, r3)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            r6.L(r13, r2)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            goto L6bf
        L4ff:
            r18 = r9
            r15 = r10
            r9 = r6
            r10 = r8
            r6 = r1
            r8 = r4
            long r0 = A(r3)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            long r3 = r8.L()     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            defpackage.gh7.n(r2, r0, r3)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            r6.L(r13, r2)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            goto L6bf
        L516:
            r18 = r9
            r15 = r10
            r9 = r6
            r10 = r8
            r6 = r1
            r8 = r4
            long r0 = A(r3)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            int r3 = r8.J()     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            defpackage.gh7.m(r2, r0, r3)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            r6.L(r13, r2)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            goto L6bf
        L52d:
            r18 = r9
            r15 = r10
            r9 = r6
            r10 = r8
            r6 = r1
            r8 = r4
            long r0 = A(r3)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            long r3 = r8.H()     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            defpackage.gh7.n(r2, r0, r3)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            r6.L(r13, r2)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            goto L6bf
        L544:
            r18 = r9
            r15 = r10
            r9 = r6
            r10 = r8
            r6 = r1
            r8 = r4
            long r0 = A(r3)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            int r3 = r8.F()     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            defpackage.gh7.m(r2, r0, r3)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            r6.L(r13, r2)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            goto L6bf
        L55b:
            r18 = r9
            r15 = r10
            r9 = r6
            r10 = r8
            r6 = r1
            r8 = r4
            int r1 = r8.o()     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            y93 r4 = r6.m(r13)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            if (r4 == 0) goto L579
            boolean r4 = r4.a(r1)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            if (r4 == 0) goto L573
            goto L579
        L573:
            java.lang.Object r12 = defpackage.m66.z(r0, r1, r12, r7)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            goto L6bf
        L579:
            long r3 = A(r3)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            defpackage.gh7.m(r2, r3, r1)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            r6.L(r13, r2)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            goto L6bf
        L585:
            r18 = r9
            r15 = r10
            r9 = r6
            r10 = r8
            r6 = r1
            r8 = r4
            long r0 = A(r3)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            int r3 = r8.Q()     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            defpackage.gh7.m(r2, r0, r3)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            r6.L(r13, r2)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            goto L6bf
        L59c:
            r18 = r9
            r15 = r10
            r9 = r6
            r10 = r8
            r6 = r1
            r8 = r4
            long r0 = A(r3)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            ca0 r3 = r8.k()     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            defpackage.gh7.o(r2, r0, r3)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            r6.L(r13, r2)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            goto L6bf
        L5b3:
            r18 = r9
            r15 = r10
            r9 = r6
            r10 = r8
            r6 = r1
            r8 = r4
            boolean r0 = r6.s(r13, r2)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            if (r0 == 0) goto L5df
            long r0 = A(r3)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            fh7 r4 = defpackage.gh7.d     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            java.lang.Object r0 = r4.i(r0, r2)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            j66 r1 = r6.o(r13)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            java.lang.Object r1 = r8.E(r1, r9)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            pr2 r0 = defpackage.aa3.c(r0, r1)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            long r3 = A(r3)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            defpackage.gh7.o(r2, r3, r0)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            goto L6bf
        L5df:
            long r0 = A(r3)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            j66 r3 = r6.o(r13)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            java.lang.Object r3 = r8.E(r3, r9)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            defpackage.gh7.o(r2, r0, r3)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            r6.L(r13, r2)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            goto L6bf
        L5f3:
            r18 = r9
            r15 = r10
            r9 = r6
            r10 = r8
            r6 = r1
            r8 = r4
            r6.J(r2, r3, r8)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            r6.L(r13, r2)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            goto L6bf
        L602:
            r18 = r9
            r15 = r10
            r9 = r6
            r10 = r8
            r6 = r1
            r8 = r4
            long r0 = A(r3)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            boolean r3 = r8.i()     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            fh7 r4 = defpackage.gh7.d     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            r4.k(r2, r0, r3)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            r6.L(r13, r2)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            goto L6bf
        L61b:
            r18 = r9
            r15 = r10
            r9 = r6
            r10 = r8
            r6 = r1
            r8 = r4
            long r0 = A(r3)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            int r3 = r8.q()     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            defpackage.gh7.m(r2, r0, r3)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            r6.L(r13, r2)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            goto L6bf
        L632:
            r18 = r9
            r15 = r10
            r9 = r6
            r10 = r8
            r6 = r1
            r8 = r4
            long r0 = A(r3)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            long r3 = r8.s()     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            defpackage.gh7.n(r2, r0, r3)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            r6.L(r13, r2)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            goto L6bf
        L649:
            r18 = r9
            r15 = r10
            r9 = r6
            r10 = r8
            r6 = r1
            r8 = r4
            long r0 = A(r3)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            int r3 = r8.z()     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            defpackage.gh7.m(r2, r0, r3)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            r6.L(r13, r2)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            goto L6bf
        L660:
            r18 = r9
            r15 = r10
            r9 = r6
            r10 = r8
            r6 = r1
            r8 = r4
            long r0 = A(r3)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            long r3 = r8.S()     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            defpackage.gh7.n(r2, r0, r3)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            r6.L(r13, r2)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            goto L6bf
        L676:
            r18 = r9
            r15 = r10
            r9 = r6
            r10 = r8
            r6 = r1
            r8 = r4
            long r0 = A(r3)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            long r3 = r8.B()     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            defpackage.gh7.n(r2, r0, r3)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            r6.L(r13, r2)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            goto L6bf
        L68c:
            r18 = r9
            r15 = r10
            r9 = r6
            r10 = r8
            r6 = r1
            r8 = r4
            long r0 = A(r3)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            float r3 = r8.u()     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            fh7 r4 = defpackage.gh7.d     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            r4.n(r2, r0, r3)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            r6.L(r13, r2)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            goto L6bf
        L6a4:
            r18 = r9
            r15 = r10
            r9 = r6
            r10 = r8
            r6 = r1
            r8 = r4
            long r0 = A(r3)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            double r4 = r8.m()     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
            r2 = r0
            fh7 r0 = defpackage.gh7.d     // Catch: java.lang.Throwable -> L6c8 defpackage.tb3 -> L6cd
            r1 = r21
            r0.m(r1, r2, r4)     // Catch: java.lang.Throwable -> L6c2 defpackage.tb3 -> L6c6
            r2 = r1
            r6.L(r13, r2)     // Catch: java.lang.Throwable -> L430 defpackage.tb3 -> L6df
        L6bf:
            r1 = r18
            goto L709
        L6c2:
            r0 = move-exception
            r2 = r1
            goto L272
        L6c6:
            r2 = r1
            goto L6df
        L6c8:
            r0 = move-exception
            r2 = r21
            goto L272
        L6cd:
            r2 = r21
            goto L6df
        L6d0:
            r0 = move-exception
            r6 = r1
            r18 = r9
            r15 = r10
            r10 = r8
            goto L272
        L6d8:
            r18 = r9
            r15 = r10
            r17 = 0
            goto L90
        L6df:
            r7.getClass()     // Catch: java.lang.Throwable -> L430
            if (r12 != 0) goto L6f2
            r0 = r2
            pr2 r0 = (defpackage.pr2) r0     // Catch: java.lang.Throwable -> L430
            mg7 r1 = r0.unknownFields     // Catch: java.lang.Throwable -> L430
            if (r1 != r14) goto L6f1
            mg7 r1 = defpackage.mg7.b()     // Catch: java.lang.Throwable -> L430
            r0.unknownFields = r1     // Catch: java.lang.Throwable -> L430
        L6f1:
            r12 = r1
        L6f2:
            boolean r0 = defpackage.ng7.a(r12, r8)     // Catch: java.lang.Throwable -> L430
            if (r0 != 0) goto L6bf
            r1 = r18
        L6fa:
            if (r15 >= r1) goto L704
            r0 = r10[r15]
            r6.l(r0, r2, r12)
            int r15 = r15 + 1
            goto L6fa
        L704:
            if (r12 == 0) goto L708
            goto La9
        L708:
            return
        L709:
            r4 = r9
            r9 = r1
            r1 = r6
            r6 = r4
            r4 = r8
            r8 = r10
            r10 = r15
            goto L14
        L712:
            r0 = move-exception
            goto L27
        L715:
            if (r15 >= r1) goto L71f
            r3 = r10[r15]
            r6.l(r3, r2, r12)
            int r15 = r15 + 1
            goto L715
        L71f:
            if (r12 == 0) goto L72b
            r7.getClass()
            mg7 r12 = (defpackage.mg7) r12
            r1 = r2
            pr2 r1 = (defpackage.pr2) r1
            r1.unknownFields = r12
        L72b:
            throw r0
    }

    @Override // defpackage.j66
    public final void e(java.lang.Object r14, defpackage.os0 r15) {
            r13 = this;
            r15.getClass()
            cy7 r0 = defpackage.cy7.ASCENDING
            cy7 r1 = defpackage.cy7.DESCENDING
            r2 = 0
            y04 r3 = r13.n
            int[] r4 = r13.a
            ng7 r5 = r13.m
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r7 = 1
            r8 = 0
            if (r0 != r1) goto L52c
            r5.getClass()
            r0 = r14
            pr2 r0 = (defpackage.pr2) r0
            mg7 r0 = r0.unknownFields
            r0.d(r15)
            int r0 = r4.length
            int r0 = r0 + (-3)
        L23:
            if (r0 < 0) goto L52b
            int r1 = r13.P(r0)
            r5 = r4[r0]
            int r9 = O(r1)
            switch(r9) {
                case 0: goto L516;
                case 1: goto L504;
                case 2: goto L4f2;
                case 3: goto L4e0;
                case 4: goto L4ce;
                case 5: goto L4bc;
                case 6: goto L4aa;
                case 7: goto L497;
                case 8: goto L484;
                case 9: goto L46d;
                case 10: goto L458;
                case 11: goto L445;
                case 12: goto L432;
                case 13: goto L41f;
                case 14: goto L40c;
                case 15: goto L3f9;
                case 16: goto L3e6;
                case 17: goto L3cf;
                case 18: goto L3be;
                case 19: goto L3ad;
                case 20: goto L39c;
                case 21: goto L38b;
                case 22: goto L37a;
                case 23: goto L369;
                case 24: goto L358;
                case 25: goto L347;
                case 26: goto L336;
                case 27: goto L321;
                case 28: goto L310;
                case 29: goto L2ff;
                case 30: goto L2ee;
                case 31: goto L2dd;
                case 32: goto L2cc;
                case 33: goto L2bb;
                case 34: goto L2aa;
                case 35: goto L299;
                case 36: goto L288;
                case 37: goto L277;
                case 38: goto L266;
                case 39: goto L255;
                case 40: goto L244;
                case 41: goto L233;
                case 42: goto L222;
                case 43: goto L211;
                case 44: goto L200;
                case 45: goto L1ef;
                case 46: goto L1de;
                case 47: goto L1cd;
                case 48: goto L1bc;
                case 49: goto L1a7;
                case 50: goto L190;
                case 51: goto L177;
                case 52: goto L15e;
                case 53: goto L14d;
                case 54: goto L13c;
                case 55: goto L12b;
                case 56: goto L11a;
                case 57: goto L109;
                case 58: goto Lf0;
                case 59: goto Ldd;
                case 60: goto Lc6;
                case 61: goto Lb1;
                case 62: goto La0;
                case 63: goto L8f;
                case 64: goto L7e;
                case 65: goto L6d;
                case 66: goto L5c;
                case 67: goto L4b;
                case 68: goto L34;
                default: goto L32;
            }
        L32:
            goto L527
        L34:
            boolean r9 = r13.t(r14, r5, r0)
            if (r9 == 0) goto L527
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            java.lang.Object r1 = r1.i(r9, r14)
            j66 r9 = r13.o(r0)
            r15.o0(r5, r1, r9)
            goto L527
        L4b:
            boolean r9 = r13.t(r14, r5, r0)
            if (r9 == 0) goto L527
            r1 = r1 & r6
            long r9 = (long) r1
            long r9 = C(r9, r14)
            r15.v0(r5, r9)
            goto L527
        L5c:
            boolean r9 = r13.t(r14, r5, r0)
            if (r9 == 0) goto L527
            r1 = r1 & r6
            long r9 = (long) r1
            int r1 = B(r9, r14)
            r15.u0(r5, r1)
            goto L527
        L6d:
            boolean r9 = r13.t(r14, r5, r0)
            if (r9 == 0) goto L527
            r1 = r1 & r6
            long r9 = (long) r1
            long r9 = C(r9, r14)
            r15.t0(r5, r9)
            goto L527
        L7e:
            boolean r9 = r13.t(r14, r5, r0)
            if (r9 == 0) goto L527
            r1 = r1 & r6
            long r9 = (long) r1
            int r1 = B(r9, r14)
            r15.s0(r5, r1)
            goto L527
        L8f:
            boolean r9 = r13.t(r14, r5, r0)
            if (r9 == 0) goto L527
            r1 = r1 & r6
            long r9 = (long) r1
            int r1 = B(r9, r14)
            r15.k0(r5, r1)
            goto L527
        La0:
            boolean r9 = r13.t(r14, r5, r0)
            if (r9 == 0) goto L527
            r1 = r1 & r6
            long r9 = (long) r1
            int r1 = B(r9, r14)
            r15.w0(r5, r1)
            goto L527
        Lb1:
            boolean r9 = r13.t(r14, r5, r0)
            if (r9 == 0) goto L527
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            java.lang.Object r1 = r1.i(r9, r14)
            ea0 r1 = (defpackage.ea0) r1
            r15.i0(r5, r1)
            goto L527
        Lc6:
            boolean r9 = r13.t(r14, r5, r0)
            if (r9 == 0) goto L527
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            java.lang.Object r1 = r1.i(r9, r14)
            j66 r9 = r13.o(r0)
            r15.r0(r5, r1, r9)
            goto L527
        Ldd:
            boolean r9 = r13.t(r14, r5, r0)
            if (r9 == 0) goto L527
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            java.lang.Object r1 = r1.i(r9, r14)
            R(r5, r1, r15)
            goto L527
        Lf0:
            boolean r9 = r13.t(r14, r5, r0)
            if (r9 == 0) goto L527
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            java.lang.Object r1 = r1.i(r9, r14)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r15.h0(r5, r1)
            goto L527
        L109:
            boolean r9 = r13.t(r14, r5, r0)
            if (r9 == 0) goto L527
            r1 = r1 & r6
            long r9 = (long) r1
            int r1 = B(r9, r14)
            r15.l0(r5, r1)
            goto L527
        L11a:
            boolean r9 = r13.t(r14, r5, r0)
            if (r9 == 0) goto L527
            r1 = r1 & r6
            long r9 = (long) r1
            long r9 = C(r9, r14)
            r15.m0(r5, r9)
            goto L527
        L12b:
            boolean r9 = r13.t(r14, r5, r0)
            if (r9 == 0) goto L527
            r1 = r1 & r6
            long r9 = (long) r1
            int r1 = B(r9, r14)
            r15.p0(r5, r1)
            goto L527
        L13c:
            boolean r9 = r13.t(r14, r5, r0)
            if (r9 == 0) goto L527
            r1 = r1 & r6
            long r9 = (long) r1
            long r9 = C(r9, r14)
            r15.x0(r5, r9)
            goto L527
        L14d:
            boolean r9 = r13.t(r14, r5, r0)
            if (r9 == 0) goto L527
            r1 = r1 & r6
            long r9 = (long) r1
            long r9 = C(r9, r14)
            r15.q0(r5, r9)
            goto L527
        L15e:
            boolean r9 = r13.t(r14, r5, r0)
            if (r9 == 0) goto L527
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            java.lang.Object r1 = r1.i(r9, r14)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            r15.n0(r5, r1)
            goto L527
        L177:
            boolean r9 = r13.t(r14, r5, r0)
            if (r9 == 0) goto L527
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            java.lang.Object r1 = r1.i(r9, r14)
            java.lang.Double r1 = (java.lang.Double) r1
            double r9 = r1.doubleValue()
            r15.j0(r5, r9)
            goto L527
        L190:
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            java.lang.Object r1 = r1.i(r9, r14)
            if (r1 != 0) goto L19c
            goto L527
        L19c:
            java.lang.Object r13 = r13.n(r0)
            r3.getClass()
            defpackage.xg6.A(r13)
            throw r2
        L1a7:
            r5 = r4[r0]
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            java.lang.Object r1 = r1.i(r9, r14)
            java.util.List r1 = (java.util.List) r1
            j66 r9 = r13.o(r0)
            defpackage.m66.H(r5, r1, r15, r9)
            goto L527
        L1bc:
            r5 = r4[r0]
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            java.lang.Object r1 = r1.i(r9, r14)
            java.util.List r1 = (java.util.List) r1
            defpackage.m66.O(r5, r1, r15, r7)
            goto L527
        L1cd:
            r5 = r4[r0]
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            java.lang.Object r1 = r1.i(r9, r14)
            java.util.List r1 = (java.util.List) r1
            defpackage.m66.N(r5, r1, r15, r7)
            goto L527
        L1de:
            r5 = r4[r0]
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            java.lang.Object r1 = r1.i(r9, r14)
            java.util.List r1 = (java.util.List) r1
            defpackage.m66.M(r5, r1, r15, r7)
            goto L527
        L1ef:
            r5 = r4[r0]
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            java.lang.Object r1 = r1.i(r9, r14)
            java.util.List r1 = (java.util.List) r1
            defpackage.m66.L(r5, r1, r15, r7)
            goto L527
        L200:
            r5 = r4[r0]
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            java.lang.Object r1 = r1.i(r9, r14)
            java.util.List r1 = (java.util.List) r1
            defpackage.m66.D(r5, r1, r15, r7)
            goto L527
        L211:
            r5 = r4[r0]
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            java.lang.Object r1 = r1.i(r9, r14)
            java.util.List r1 = (java.util.List) r1
            defpackage.m66.Q(r5, r1, r15, r7)
            goto L527
        L222:
            r5 = r4[r0]
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            java.lang.Object r1 = r1.i(r9, r14)
            java.util.List r1 = (java.util.List) r1
            defpackage.m66.A(r5, r1, r15, r7)
            goto L527
        L233:
            r5 = r4[r0]
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            java.lang.Object r1 = r1.i(r9, r14)
            java.util.List r1 = (java.util.List) r1
            defpackage.m66.E(r5, r1, r15, r7)
            goto L527
        L244:
            r5 = r4[r0]
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            java.lang.Object r1 = r1.i(r9, r14)
            java.util.List r1 = (java.util.List) r1
            defpackage.m66.F(r5, r1, r15, r7)
            goto L527
        L255:
            r5 = r4[r0]
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            java.lang.Object r1 = r1.i(r9, r14)
            java.util.List r1 = (java.util.List) r1
            defpackage.m66.I(r5, r1, r15, r7)
            goto L527
        L266:
            r5 = r4[r0]
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            java.lang.Object r1 = r1.i(r9, r14)
            java.util.List r1 = (java.util.List) r1
            defpackage.m66.R(r5, r1, r15, r7)
            goto L527
        L277:
            r5 = r4[r0]
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            java.lang.Object r1 = r1.i(r9, r14)
            java.util.List r1 = (java.util.List) r1
            defpackage.m66.J(r5, r1, r15, r7)
            goto L527
        L288:
            r5 = r4[r0]
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            java.lang.Object r1 = r1.i(r9, r14)
            java.util.List r1 = (java.util.List) r1
            defpackage.m66.G(r5, r1, r15, r7)
            goto L527
        L299:
            r5 = r4[r0]
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            java.lang.Object r1 = r1.i(r9, r14)
            java.util.List r1 = (java.util.List) r1
            defpackage.m66.C(r5, r1, r15, r7)
            goto L527
        L2aa:
            r5 = r4[r0]
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            java.lang.Object r1 = r1.i(r9, r14)
            java.util.List r1 = (java.util.List) r1
            defpackage.m66.O(r5, r1, r15, r8)
            goto L527
        L2bb:
            r5 = r4[r0]
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            java.lang.Object r1 = r1.i(r9, r14)
            java.util.List r1 = (java.util.List) r1
            defpackage.m66.N(r5, r1, r15, r8)
            goto L527
        L2cc:
            r5 = r4[r0]
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            java.lang.Object r1 = r1.i(r9, r14)
            java.util.List r1 = (java.util.List) r1
            defpackage.m66.M(r5, r1, r15, r8)
            goto L527
        L2dd:
            r5 = r4[r0]
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            java.lang.Object r1 = r1.i(r9, r14)
            java.util.List r1 = (java.util.List) r1
            defpackage.m66.L(r5, r1, r15, r8)
            goto L527
        L2ee:
            r5 = r4[r0]
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            java.lang.Object r1 = r1.i(r9, r14)
            java.util.List r1 = (java.util.List) r1
            defpackage.m66.D(r5, r1, r15, r8)
            goto L527
        L2ff:
            r5 = r4[r0]
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            java.lang.Object r1 = r1.i(r9, r14)
            java.util.List r1 = (java.util.List) r1
            defpackage.m66.Q(r5, r1, r15, r8)
            goto L527
        L310:
            r5 = r4[r0]
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            java.lang.Object r1 = r1.i(r9, r14)
            java.util.List r1 = (java.util.List) r1
            defpackage.m66.B(r5, r1, r15)
            goto L527
        L321:
            r5 = r4[r0]
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            java.lang.Object r1 = r1.i(r9, r14)
            java.util.List r1 = (java.util.List) r1
            j66 r9 = r13.o(r0)
            defpackage.m66.K(r5, r1, r15, r9)
            goto L527
        L336:
            r5 = r4[r0]
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            java.lang.Object r1 = r1.i(r9, r14)
            java.util.List r1 = (java.util.List) r1
            defpackage.m66.P(r5, r1, r15)
            goto L527
        L347:
            r5 = r4[r0]
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            java.lang.Object r1 = r1.i(r9, r14)
            java.util.List r1 = (java.util.List) r1
            defpackage.m66.A(r5, r1, r15, r8)
            goto L527
        L358:
            r5 = r4[r0]
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            java.lang.Object r1 = r1.i(r9, r14)
            java.util.List r1 = (java.util.List) r1
            defpackage.m66.E(r5, r1, r15, r8)
            goto L527
        L369:
            r5 = r4[r0]
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            java.lang.Object r1 = r1.i(r9, r14)
            java.util.List r1 = (java.util.List) r1
            defpackage.m66.F(r5, r1, r15, r8)
            goto L527
        L37a:
            r5 = r4[r0]
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            java.lang.Object r1 = r1.i(r9, r14)
            java.util.List r1 = (java.util.List) r1
            defpackage.m66.I(r5, r1, r15, r8)
            goto L527
        L38b:
            r5 = r4[r0]
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            java.lang.Object r1 = r1.i(r9, r14)
            java.util.List r1 = (java.util.List) r1
            defpackage.m66.R(r5, r1, r15, r8)
            goto L527
        L39c:
            r5 = r4[r0]
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            java.lang.Object r1 = r1.i(r9, r14)
            java.util.List r1 = (java.util.List) r1
            defpackage.m66.J(r5, r1, r15, r8)
            goto L527
        L3ad:
            r5 = r4[r0]
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            java.lang.Object r1 = r1.i(r9, r14)
            java.util.List r1 = (java.util.List) r1
            defpackage.m66.G(r5, r1, r15, r8)
            goto L527
        L3be:
            r5 = r4[r0]
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            java.lang.Object r1 = r1.i(r9, r14)
            java.util.List r1 = (java.util.List) r1
            defpackage.m66.C(r5, r1, r15, r8)
            goto L527
        L3cf:
            boolean r9 = r13.s(r0, r14)
            if (r9 == 0) goto L527
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            java.lang.Object r1 = r1.i(r9, r14)
            j66 r9 = r13.o(r0)
            r15.o0(r5, r1, r9)
            goto L527
        L3e6:
            boolean r9 = r13.s(r0, r14)
            if (r9 == 0) goto L527
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            long r9 = r1.h(r9, r14)
            r15.v0(r5, r9)
            goto L527
        L3f9:
            boolean r9 = r13.s(r0, r14)
            if (r9 == 0) goto L527
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            int r1 = r1.g(r9, r14)
            r15.u0(r5, r1)
            goto L527
        L40c:
            boolean r9 = r13.s(r0, r14)
            if (r9 == 0) goto L527
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            long r9 = r1.h(r9, r14)
            r15.t0(r5, r9)
            goto L527
        L41f:
            boolean r9 = r13.s(r0, r14)
            if (r9 == 0) goto L527
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            int r1 = r1.g(r9, r14)
            r15.s0(r5, r1)
            goto L527
        L432:
            boolean r9 = r13.s(r0, r14)
            if (r9 == 0) goto L527
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            int r1 = r1.g(r9, r14)
            r15.k0(r5, r1)
            goto L527
        L445:
            boolean r9 = r13.s(r0, r14)
            if (r9 == 0) goto L527
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            int r1 = r1.g(r9, r14)
            r15.w0(r5, r1)
            goto L527
        L458:
            boolean r9 = r13.s(r0, r14)
            if (r9 == 0) goto L527
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            java.lang.Object r1 = r1.i(r9, r14)
            ea0 r1 = (defpackage.ea0) r1
            r15.i0(r5, r1)
            goto L527
        L46d:
            boolean r9 = r13.s(r0, r14)
            if (r9 == 0) goto L527
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            java.lang.Object r1 = r1.i(r9, r14)
            j66 r9 = r13.o(r0)
            r15.r0(r5, r1, r9)
            goto L527
        L484:
            boolean r9 = r13.s(r0, r14)
            if (r9 == 0) goto L527
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            java.lang.Object r1 = r1.i(r9, r14)
            R(r5, r1, r15)
            goto L527
        L497:
            boolean r9 = r13.s(r0, r14)
            if (r9 == 0) goto L527
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            boolean r1 = r1.c(r9, r14)
            r15.h0(r5, r1)
            goto L527
        L4aa:
            boolean r9 = r13.s(r0, r14)
            if (r9 == 0) goto L527
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            int r1 = r1.g(r9, r14)
            r15.l0(r5, r1)
            goto L527
        L4bc:
            boolean r9 = r13.s(r0, r14)
            if (r9 == 0) goto L527
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            long r9 = r1.h(r9, r14)
            r15.m0(r5, r9)
            goto L527
        L4ce:
            boolean r9 = r13.s(r0, r14)
            if (r9 == 0) goto L527
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            int r1 = r1.g(r9, r14)
            r15.p0(r5, r1)
            goto L527
        L4e0:
            boolean r9 = r13.s(r0, r14)
            if (r9 == 0) goto L527
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            long r9 = r1.h(r9, r14)
            r15.x0(r5, r9)
            goto L527
        L4f2:
            boolean r9 = r13.s(r0, r14)
            if (r9 == 0) goto L527
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            long r9 = r1.h(r9, r14)
            r15.q0(r5, r9)
            goto L527
        L504:
            boolean r9 = r13.s(r0, r14)
            if (r9 == 0) goto L527
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            float r1 = r1.f(r9, r14)
            r15.n0(r5, r1)
            goto L527
        L516:
            boolean r9 = r13.s(r0, r14)
            if (r9 == 0) goto L527
            r1 = r1 & r6
            long r9 = (long) r1
            fh7 r1 = defpackage.gh7.d
            double r9 = r1.e(r9, r14)
            r15.j0(r5, r9)
        L527:
            int r0 = r0 + (-3)
            goto L23
        L52b:
            return
        L52c:
            boolean r0 = r13.g
            if (r0 == 0) goto La45
            int r0 = r4.length
            r1 = r8
        L532:
            if (r1 >= r0) goto La3a
            int r9 = r13.P(r1)
            r10 = r4[r1]
            int r11 = O(r9)
            switch(r11) {
                case 0: goto La25;
                case 1: goto La13;
                case 2: goto La01;
                case 3: goto L9ef;
                case 4: goto L9dd;
                case 5: goto L9cb;
                case 6: goto L9b9;
                case 7: goto L9a6;
                case 8: goto L993;
                case 9: goto L97c;
                case 10: goto L967;
                case 11: goto L954;
                case 12: goto L941;
                case 13: goto L92e;
                case 14: goto L91b;
                case 15: goto L908;
                case 16: goto L8f5;
                case 17: goto L8de;
                case 18: goto L8cd;
                case 19: goto L8bc;
                case 20: goto L8ab;
                case 21: goto L89a;
                case 22: goto L889;
                case 23: goto L878;
                case 24: goto L867;
                case 25: goto L856;
                case 26: goto L845;
                case 27: goto L830;
                case 28: goto L81f;
                case 29: goto L80e;
                case 30: goto L7fd;
                case 31: goto L7ec;
                case 32: goto L7db;
                case 33: goto L7ca;
                case 34: goto L7b9;
                case 35: goto L7a8;
                case 36: goto L797;
                case 37: goto L786;
                case 38: goto L775;
                case 39: goto L764;
                case 40: goto L753;
                case 41: goto L742;
                case 42: goto L731;
                case 43: goto L720;
                case 44: goto L70f;
                case 45: goto L6fe;
                case 46: goto L6ed;
                case 47: goto L6dc;
                case 48: goto L6cb;
                case 49: goto L6b6;
                case 50: goto L69f;
                case 51: goto L686;
                case 52: goto L66d;
                case 53: goto L65c;
                case 54: goto L64b;
                case 55: goto L63a;
                case 56: goto L629;
                case 57: goto L618;
                case 58: goto L5ff;
                case 59: goto L5ec;
                case 60: goto L5d5;
                case 61: goto L5c0;
                case 62: goto L5af;
                case 63: goto L59e;
                case 64: goto L58d;
                case 65: goto L57c;
                case 66: goto L56b;
                case 67: goto L55a;
                case 68: goto L543;
                default: goto L541;
            }
        L541:
            goto La36
        L543:
            boolean r11 = r13.t(r14, r10, r1)
            if (r11 == 0) goto La36
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            java.lang.Object r9 = r9.i(r11, r14)
            j66 r11 = r13.o(r1)
            r15.o0(r10, r9, r11)
            goto La36
        L55a:
            boolean r11 = r13.t(r14, r10, r1)
            if (r11 == 0) goto La36
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = C(r11, r14)
            r15.v0(r10, r11)
            goto La36
        L56b:
            boolean r11 = r13.t(r14, r10, r1)
            if (r11 == 0) goto La36
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = B(r11, r14)
            r15.u0(r10, r9)
            goto La36
        L57c:
            boolean r11 = r13.t(r14, r10, r1)
            if (r11 == 0) goto La36
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = C(r11, r14)
            r15.t0(r10, r11)
            goto La36
        L58d:
            boolean r11 = r13.t(r14, r10, r1)
            if (r11 == 0) goto La36
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = B(r11, r14)
            r15.s0(r10, r9)
            goto La36
        L59e:
            boolean r11 = r13.t(r14, r10, r1)
            if (r11 == 0) goto La36
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = B(r11, r14)
            r15.k0(r10, r9)
            goto La36
        L5af:
            boolean r11 = r13.t(r14, r10, r1)
            if (r11 == 0) goto La36
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = B(r11, r14)
            r15.w0(r10, r9)
            goto La36
        L5c0:
            boolean r11 = r13.t(r14, r10, r1)
            if (r11 == 0) goto La36
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            java.lang.Object r9 = r9.i(r11, r14)
            ea0 r9 = (defpackage.ea0) r9
            r15.i0(r10, r9)
            goto La36
        L5d5:
            boolean r11 = r13.t(r14, r10, r1)
            if (r11 == 0) goto La36
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            java.lang.Object r9 = r9.i(r11, r14)
            j66 r11 = r13.o(r1)
            r15.r0(r10, r9, r11)
            goto La36
        L5ec:
            boolean r11 = r13.t(r14, r10, r1)
            if (r11 == 0) goto La36
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            java.lang.Object r9 = r9.i(r11, r14)
            R(r10, r9, r15)
            goto La36
        L5ff:
            boolean r11 = r13.t(r14, r10, r1)
            if (r11 == 0) goto La36
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            java.lang.Object r9 = r9.i(r11, r14)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            r15.h0(r10, r9)
            goto La36
        L618:
            boolean r11 = r13.t(r14, r10, r1)
            if (r11 == 0) goto La36
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = B(r11, r14)
            r15.l0(r10, r9)
            goto La36
        L629:
            boolean r11 = r13.t(r14, r10, r1)
            if (r11 == 0) goto La36
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = C(r11, r14)
            r15.m0(r10, r11)
            goto La36
        L63a:
            boolean r11 = r13.t(r14, r10, r1)
            if (r11 == 0) goto La36
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = B(r11, r14)
            r15.p0(r10, r9)
            goto La36
        L64b:
            boolean r11 = r13.t(r14, r10, r1)
            if (r11 == 0) goto La36
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = C(r11, r14)
            r15.x0(r10, r11)
            goto La36
        L65c:
            boolean r11 = r13.t(r14, r10, r1)
            if (r11 == 0) goto La36
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = C(r11, r14)
            r15.q0(r10, r11)
            goto La36
        L66d:
            boolean r11 = r13.t(r14, r10, r1)
            if (r11 == 0) goto La36
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            java.lang.Object r9 = r9.i(r11, r14)
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            r15.n0(r10, r9)
            goto La36
        L686:
            boolean r11 = r13.t(r14, r10, r1)
            if (r11 == 0) goto La36
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            java.lang.Object r9 = r9.i(r11, r14)
            java.lang.Double r9 = (java.lang.Double) r9
            double r11 = r9.doubleValue()
            r15.j0(r10, r11)
            goto La36
        L69f:
            r9 = r9 & r6
            long r9 = (long) r9
            fh7 r11 = defpackage.gh7.d
            java.lang.Object r9 = r11.i(r9, r14)
            if (r9 != 0) goto L6ab
            goto La36
        L6ab:
            java.lang.Object r13 = r13.n(r1)
            r3.getClass()
            defpackage.xg6.A(r13)
            throw r2
        L6b6:
            r10 = r4[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            java.lang.Object r9 = r9.i(r11, r14)
            java.util.List r9 = (java.util.List) r9
            j66 r11 = r13.o(r1)
            defpackage.m66.H(r10, r9, r15, r11)
            goto La36
        L6cb:
            r10 = r4[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            java.lang.Object r9 = r9.i(r11, r14)
            java.util.List r9 = (java.util.List) r9
            defpackage.m66.O(r10, r9, r15, r7)
            goto La36
        L6dc:
            r10 = r4[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            java.lang.Object r9 = r9.i(r11, r14)
            java.util.List r9 = (java.util.List) r9
            defpackage.m66.N(r10, r9, r15, r7)
            goto La36
        L6ed:
            r10 = r4[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            java.lang.Object r9 = r9.i(r11, r14)
            java.util.List r9 = (java.util.List) r9
            defpackage.m66.M(r10, r9, r15, r7)
            goto La36
        L6fe:
            r10 = r4[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            java.lang.Object r9 = r9.i(r11, r14)
            java.util.List r9 = (java.util.List) r9
            defpackage.m66.L(r10, r9, r15, r7)
            goto La36
        L70f:
            r10 = r4[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            java.lang.Object r9 = r9.i(r11, r14)
            java.util.List r9 = (java.util.List) r9
            defpackage.m66.D(r10, r9, r15, r7)
            goto La36
        L720:
            r10 = r4[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            java.lang.Object r9 = r9.i(r11, r14)
            java.util.List r9 = (java.util.List) r9
            defpackage.m66.Q(r10, r9, r15, r7)
            goto La36
        L731:
            r10 = r4[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            java.lang.Object r9 = r9.i(r11, r14)
            java.util.List r9 = (java.util.List) r9
            defpackage.m66.A(r10, r9, r15, r7)
            goto La36
        L742:
            r10 = r4[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            java.lang.Object r9 = r9.i(r11, r14)
            java.util.List r9 = (java.util.List) r9
            defpackage.m66.E(r10, r9, r15, r7)
            goto La36
        L753:
            r10 = r4[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            java.lang.Object r9 = r9.i(r11, r14)
            java.util.List r9 = (java.util.List) r9
            defpackage.m66.F(r10, r9, r15, r7)
            goto La36
        L764:
            r10 = r4[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            java.lang.Object r9 = r9.i(r11, r14)
            java.util.List r9 = (java.util.List) r9
            defpackage.m66.I(r10, r9, r15, r7)
            goto La36
        L775:
            r10 = r4[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            java.lang.Object r9 = r9.i(r11, r14)
            java.util.List r9 = (java.util.List) r9
            defpackage.m66.R(r10, r9, r15, r7)
            goto La36
        L786:
            r10 = r4[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            java.lang.Object r9 = r9.i(r11, r14)
            java.util.List r9 = (java.util.List) r9
            defpackage.m66.J(r10, r9, r15, r7)
            goto La36
        L797:
            r10 = r4[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            java.lang.Object r9 = r9.i(r11, r14)
            java.util.List r9 = (java.util.List) r9
            defpackage.m66.G(r10, r9, r15, r7)
            goto La36
        L7a8:
            r10 = r4[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            java.lang.Object r9 = r9.i(r11, r14)
            java.util.List r9 = (java.util.List) r9
            defpackage.m66.C(r10, r9, r15, r7)
            goto La36
        L7b9:
            r10 = r4[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            java.lang.Object r9 = r9.i(r11, r14)
            java.util.List r9 = (java.util.List) r9
            defpackage.m66.O(r10, r9, r15, r8)
            goto La36
        L7ca:
            r10 = r4[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            java.lang.Object r9 = r9.i(r11, r14)
            java.util.List r9 = (java.util.List) r9
            defpackage.m66.N(r10, r9, r15, r8)
            goto La36
        L7db:
            r10 = r4[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            java.lang.Object r9 = r9.i(r11, r14)
            java.util.List r9 = (java.util.List) r9
            defpackage.m66.M(r10, r9, r15, r8)
            goto La36
        L7ec:
            r10 = r4[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            java.lang.Object r9 = r9.i(r11, r14)
            java.util.List r9 = (java.util.List) r9
            defpackage.m66.L(r10, r9, r15, r8)
            goto La36
        L7fd:
            r10 = r4[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            java.lang.Object r9 = r9.i(r11, r14)
            java.util.List r9 = (java.util.List) r9
            defpackage.m66.D(r10, r9, r15, r8)
            goto La36
        L80e:
            r10 = r4[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            java.lang.Object r9 = r9.i(r11, r14)
            java.util.List r9 = (java.util.List) r9
            defpackage.m66.Q(r10, r9, r15, r8)
            goto La36
        L81f:
            r10 = r4[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            java.lang.Object r9 = r9.i(r11, r14)
            java.util.List r9 = (java.util.List) r9
            defpackage.m66.B(r10, r9, r15)
            goto La36
        L830:
            r10 = r4[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            java.lang.Object r9 = r9.i(r11, r14)
            java.util.List r9 = (java.util.List) r9
            j66 r11 = r13.o(r1)
            defpackage.m66.K(r10, r9, r15, r11)
            goto La36
        L845:
            r10 = r4[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            java.lang.Object r9 = r9.i(r11, r14)
            java.util.List r9 = (java.util.List) r9
            defpackage.m66.P(r10, r9, r15)
            goto La36
        L856:
            r10 = r4[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            java.lang.Object r9 = r9.i(r11, r14)
            java.util.List r9 = (java.util.List) r9
            defpackage.m66.A(r10, r9, r15, r8)
            goto La36
        L867:
            r10 = r4[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            java.lang.Object r9 = r9.i(r11, r14)
            java.util.List r9 = (java.util.List) r9
            defpackage.m66.E(r10, r9, r15, r8)
            goto La36
        L878:
            r10 = r4[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            java.lang.Object r9 = r9.i(r11, r14)
            java.util.List r9 = (java.util.List) r9
            defpackage.m66.F(r10, r9, r15, r8)
            goto La36
        L889:
            r10 = r4[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            java.lang.Object r9 = r9.i(r11, r14)
            java.util.List r9 = (java.util.List) r9
            defpackage.m66.I(r10, r9, r15, r8)
            goto La36
        L89a:
            r10 = r4[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            java.lang.Object r9 = r9.i(r11, r14)
            java.util.List r9 = (java.util.List) r9
            defpackage.m66.R(r10, r9, r15, r8)
            goto La36
        L8ab:
            r10 = r4[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            java.lang.Object r9 = r9.i(r11, r14)
            java.util.List r9 = (java.util.List) r9
            defpackage.m66.J(r10, r9, r15, r8)
            goto La36
        L8bc:
            r10 = r4[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            java.lang.Object r9 = r9.i(r11, r14)
            java.util.List r9 = (java.util.List) r9
            defpackage.m66.G(r10, r9, r15, r8)
            goto La36
        L8cd:
            r10 = r4[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            java.lang.Object r9 = r9.i(r11, r14)
            java.util.List r9 = (java.util.List) r9
            defpackage.m66.C(r10, r9, r15, r8)
            goto La36
        L8de:
            boolean r11 = r13.s(r1, r14)
            if (r11 == 0) goto La36
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            java.lang.Object r9 = r9.i(r11, r14)
            j66 r11 = r13.o(r1)
            r15.o0(r10, r9, r11)
            goto La36
        L8f5:
            boolean r11 = r13.s(r1, r14)
            if (r11 == 0) goto La36
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            long r11 = r9.h(r11, r14)
            r15.v0(r10, r11)
            goto La36
        L908:
            boolean r11 = r13.s(r1, r14)
            if (r11 == 0) goto La36
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            int r9 = r9.g(r11, r14)
            r15.u0(r10, r9)
            goto La36
        L91b:
            boolean r11 = r13.s(r1, r14)
            if (r11 == 0) goto La36
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            long r11 = r9.h(r11, r14)
            r15.t0(r10, r11)
            goto La36
        L92e:
            boolean r11 = r13.s(r1, r14)
            if (r11 == 0) goto La36
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            int r9 = r9.g(r11, r14)
            r15.s0(r10, r9)
            goto La36
        L941:
            boolean r11 = r13.s(r1, r14)
            if (r11 == 0) goto La36
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            int r9 = r9.g(r11, r14)
            r15.k0(r10, r9)
            goto La36
        L954:
            boolean r11 = r13.s(r1, r14)
            if (r11 == 0) goto La36
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            int r9 = r9.g(r11, r14)
            r15.w0(r10, r9)
            goto La36
        L967:
            boolean r11 = r13.s(r1, r14)
            if (r11 == 0) goto La36
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            java.lang.Object r9 = r9.i(r11, r14)
            ea0 r9 = (defpackage.ea0) r9
            r15.i0(r10, r9)
            goto La36
        L97c:
            boolean r11 = r13.s(r1, r14)
            if (r11 == 0) goto La36
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            java.lang.Object r9 = r9.i(r11, r14)
            j66 r11 = r13.o(r1)
            r15.r0(r10, r9, r11)
            goto La36
        L993:
            boolean r11 = r13.s(r1, r14)
            if (r11 == 0) goto La36
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            java.lang.Object r9 = r9.i(r11, r14)
            R(r10, r9, r15)
            goto La36
        L9a6:
            boolean r11 = r13.s(r1, r14)
            if (r11 == 0) goto La36
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            boolean r9 = r9.c(r11, r14)
            r15.h0(r10, r9)
            goto La36
        L9b9:
            boolean r11 = r13.s(r1, r14)
            if (r11 == 0) goto La36
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            int r9 = r9.g(r11, r14)
            r15.l0(r10, r9)
            goto La36
        L9cb:
            boolean r11 = r13.s(r1, r14)
            if (r11 == 0) goto La36
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            long r11 = r9.h(r11, r14)
            r15.m0(r10, r11)
            goto La36
        L9dd:
            boolean r11 = r13.s(r1, r14)
            if (r11 == 0) goto La36
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            int r9 = r9.g(r11, r14)
            r15.p0(r10, r9)
            goto La36
        L9ef:
            boolean r11 = r13.s(r1, r14)
            if (r11 == 0) goto La36
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            long r11 = r9.h(r11, r14)
            r15.x0(r10, r11)
            goto La36
        La01:
            boolean r11 = r13.s(r1, r14)
            if (r11 == 0) goto La36
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            long r11 = r9.h(r11, r14)
            r15.q0(r10, r11)
            goto La36
        La13:
            boolean r11 = r13.s(r1, r14)
            if (r11 == 0) goto La36
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            float r9 = r9.f(r11, r14)
            r15.n0(r10, r9)
            goto La36
        La25:
            boolean r11 = r13.s(r1, r14)
            if (r11 == 0) goto La36
            r9 = r9 & r6
            long r11 = (long) r9
            fh7 r9 = defpackage.gh7.d
            double r11 = r9.e(r11, r14)
            r15.j0(r10, r11)
        La36:
            int r1 = r1 + 3
            goto L532
        La3a:
            r5.getClass()
            pr2 r14 = (defpackage.pr2) r14
            mg7 r13 = r14.unknownFields
            r13.d(r15)
            return
        La45:
            r13.Q(r14, r15)
            return
    }

    @Override // defpackage.j66
    public final int f(defpackage.pr2 r12) {
            r11 = this;
            int[] r0 = r11.a
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L5:
            if (r2 >= r1) goto L27c
            int r4 = r11.P(r2)
            r5 = r0[r2]
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r6 & r4
            long r6 = (long) r6
            int r4 = O(r4)
            r8 = 1237(0x4d5, float:1.733E-42)
            r9 = 1231(0x4cf, float:1.725E-42)
            r10 = 37
            switch(r4) {
                case 0: goto L266;
                case 1: goto L258;
                case 2: goto L24a;
                case 3: goto L23c;
                case 4: goto L232;
                case 5: goto L224;
                case 6: goto L21a;
                case 7: goto L20c;
                case 8: goto L1fc;
                case 9: goto L1ef;
                case 10: goto L1e1;
                case 11: goto L1d7;
                case 12: goto L1cd;
                case 13: goto L1c3;
                case 14: goto L1b5;
                case 15: goto L1ab;
                case 16: goto L19d;
                case 17: goto L18c;
                case 18: goto L17e;
                case 19: goto L17e;
                case 20: goto L17e;
                case 21: goto L17e;
                case 22: goto L17e;
                case 23: goto L17e;
                case 24: goto L17e;
                case 25: goto L17e;
                case 26: goto L17e;
                case 27: goto L17e;
                case 28: goto L17e;
                case 29: goto L17e;
                case 30: goto L17e;
                case 31: goto L17e;
                case 32: goto L17e;
                case 33: goto L17e;
                case 34: goto L17e;
                case 35: goto L17e;
                case 36: goto L17e;
                case 37: goto L17e;
                case 38: goto L17e;
                case 39: goto L17e;
                case 40: goto L17e;
                case 41: goto L17e;
                case 42: goto L17e;
                case 43: goto L17e;
                case 44: goto L17e;
                case 45: goto L17e;
                case 46: goto L17e;
                case 47: goto L17e;
                case 48: goto L17e;
                case 49: goto L17e;
                case 50: goto L170;
                case 51: goto L152;
                case 52: goto L138;
                case 53: goto L126;
                case 54: goto L114;
                case 55: goto L106;
                case 56: goto Lf4;
                case 57: goto Le6;
                case 58: goto Lc9;
                case 59: goto Lb3;
                case 60: goto La0;
                case 61: goto L8d;
                case 62: goto L80;
                case 63: goto L73;
                case 64: goto L66;
                case 65: goto L55;
                case 66: goto L48;
                case 67: goto L37;
                case 68: goto L21;
                default: goto L1f;
            }
        L1f:
            goto L278
        L21:
            boolean r4 = r11.t(r12, r5, r2)
            if (r4 == 0) goto L278
            fh7 r4 = defpackage.gh7.d
            java.lang.Object r4 = r4.i(r6, r12)
            int r3 = r3 * 53
            int r4 = r4.hashCode()
        L33:
            int r4 = r4 + r3
            r3 = r4
            goto L278
        L37:
            boolean r4 = r11.t(r12, r5, r2)
            if (r4 == 0) goto L278
            int r3 = r3 * 53
            long r4 = C(r6, r12)
            int r4 = defpackage.aa3.b(r4)
            goto L33
        L48:
            boolean r4 = r11.t(r12, r5, r2)
            if (r4 == 0) goto L278
            int r3 = r3 * 53
            int r4 = B(r6, r12)
            goto L33
        L55:
            boolean r4 = r11.t(r12, r5, r2)
            if (r4 == 0) goto L278
            int r3 = r3 * 53
            long r4 = C(r6, r12)
            int r4 = defpackage.aa3.b(r4)
            goto L33
        L66:
            boolean r4 = r11.t(r12, r5, r2)
            if (r4 == 0) goto L278
            int r3 = r3 * 53
            int r4 = B(r6, r12)
            goto L33
        L73:
            boolean r4 = r11.t(r12, r5, r2)
            if (r4 == 0) goto L278
            int r3 = r3 * 53
            int r4 = B(r6, r12)
            goto L33
        L80:
            boolean r4 = r11.t(r12, r5, r2)
            if (r4 == 0) goto L278
            int r3 = r3 * 53
            int r4 = B(r6, r12)
            goto L33
        L8d:
            boolean r4 = r11.t(r12, r5, r2)
            if (r4 == 0) goto L278
            int r3 = r3 * 53
            fh7 r4 = defpackage.gh7.d
            java.lang.Object r4 = r4.i(r6, r12)
            int r4 = r4.hashCode()
            goto L33
        La0:
            boolean r4 = r11.t(r12, r5, r2)
            if (r4 == 0) goto L278
            fh7 r4 = defpackage.gh7.d
            java.lang.Object r4 = r4.i(r6, r12)
            int r3 = r3 * 53
            int r4 = r4.hashCode()
            goto L33
        Lb3:
            boolean r4 = r11.t(r12, r5, r2)
            if (r4 == 0) goto L278
            int r3 = r3 * 53
            fh7 r4 = defpackage.gh7.d
            java.lang.Object r4 = r4.i(r6, r12)
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r4.hashCode()
            goto L33
        Lc9:
            boolean r4 = r11.t(r12, r5, r2)
            if (r4 == 0) goto L278
            int r3 = r3 * 53
            fh7 r4 = defpackage.gh7.d
            java.lang.Object r4 = r4.i(r6, r12)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            java.nio.charset.Charset r5 = defpackage.aa3.a
            if (r4 == 0) goto Le2
        Le1:
            r8 = r9
        Le2:
            int r8 = r8 + r3
            r3 = r8
            goto L278
        Le6:
            boolean r4 = r11.t(r12, r5, r2)
            if (r4 == 0) goto L278
            int r3 = r3 * 53
            int r4 = B(r6, r12)
            goto L33
        Lf4:
            boolean r4 = r11.t(r12, r5, r2)
            if (r4 == 0) goto L278
            int r3 = r3 * 53
            long r4 = C(r6, r12)
            int r4 = defpackage.aa3.b(r4)
            goto L33
        L106:
            boolean r4 = r11.t(r12, r5, r2)
            if (r4 == 0) goto L278
            int r3 = r3 * 53
            int r4 = B(r6, r12)
            goto L33
        L114:
            boolean r4 = r11.t(r12, r5, r2)
            if (r4 == 0) goto L278
            int r3 = r3 * 53
            long r4 = C(r6, r12)
            int r4 = defpackage.aa3.b(r4)
            goto L33
        L126:
            boolean r4 = r11.t(r12, r5, r2)
            if (r4 == 0) goto L278
            int r3 = r3 * 53
            long r4 = C(r6, r12)
            int r4 = defpackage.aa3.b(r4)
            goto L33
        L138:
            boolean r4 = r11.t(r12, r5, r2)
            if (r4 == 0) goto L278
            int r3 = r3 * 53
            fh7 r4 = defpackage.gh7.d
            java.lang.Object r4 = r4.i(r6, r12)
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            int r4 = java.lang.Float.floatToIntBits(r4)
            goto L33
        L152:
            boolean r4 = r11.t(r12, r5, r2)
            if (r4 == 0) goto L278
            int r3 = r3 * 53
            fh7 r4 = defpackage.gh7.d
            java.lang.Object r4 = r4.i(r6, r12)
            java.lang.Double r4 = (java.lang.Double) r4
            double r4 = r4.doubleValue()
            long r4 = java.lang.Double.doubleToLongBits(r4)
            int r4 = defpackage.aa3.b(r4)
            goto L33
        L170:
            int r3 = r3 * 53
            fh7 r4 = defpackage.gh7.d
            java.lang.Object r4 = r4.i(r6, r12)
            int r4 = r4.hashCode()
            goto L33
        L17e:
            int r3 = r3 * 53
            fh7 r4 = defpackage.gh7.d
            java.lang.Object r4 = r4.i(r6, r12)
            int r4 = r4.hashCode()
            goto L33
        L18c:
            fh7 r4 = defpackage.gh7.d
            java.lang.Object r4 = r4.i(r6, r12)
            if (r4 == 0) goto L198
            int r10 = r4.hashCode()
        L198:
            int r3 = r3 * 53
            int r3 = r3 + r10
            goto L278
        L19d:
            int r3 = r3 * 53
            fh7 r4 = defpackage.gh7.d
            long r4 = r4.h(r6, r12)
            int r4 = defpackage.aa3.b(r4)
            goto L33
        L1ab:
            int r3 = r3 * 53
            fh7 r4 = defpackage.gh7.d
            int r4 = r4.g(r6, r12)
            goto L33
        L1b5:
            int r3 = r3 * 53
            fh7 r4 = defpackage.gh7.d
            long r4 = r4.h(r6, r12)
            int r4 = defpackage.aa3.b(r4)
            goto L33
        L1c3:
            int r3 = r3 * 53
            fh7 r4 = defpackage.gh7.d
            int r4 = r4.g(r6, r12)
            goto L33
        L1cd:
            int r3 = r3 * 53
            fh7 r4 = defpackage.gh7.d
            int r4 = r4.g(r6, r12)
            goto L33
        L1d7:
            int r3 = r3 * 53
            fh7 r4 = defpackage.gh7.d
            int r4 = r4.g(r6, r12)
            goto L33
        L1e1:
            int r3 = r3 * 53
            fh7 r4 = defpackage.gh7.d
            java.lang.Object r4 = r4.i(r6, r12)
            int r4 = r4.hashCode()
            goto L33
        L1ef:
            fh7 r4 = defpackage.gh7.d
            java.lang.Object r4 = r4.i(r6, r12)
            if (r4 == 0) goto L198
            int r10 = r4.hashCode()
            goto L198
        L1fc:
            int r3 = r3 * 53
            fh7 r4 = defpackage.gh7.d
            java.lang.Object r4 = r4.i(r6, r12)
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r4.hashCode()
            goto L33
        L20c:
            int r3 = r3 * 53
            fh7 r4 = defpackage.gh7.d
            boolean r4 = r4.c(r6, r12)
            java.nio.charset.Charset r5 = defpackage.aa3.a
            if (r4 == 0) goto Le2
            goto Le1
        L21a:
            int r3 = r3 * 53
            fh7 r4 = defpackage.gh7.d
            int r4 = r4.g(r6, r12)
            goto L33
        L224:
            int r3 = r3 * 53
            fh7 r4 = defpackage.gh7.d
            long r4 = r4.h(r6, r12)
            int r4 = defpackage.aa3.b(r4)
            goto L33
        L232:
            int r3 = r3 * 53
            fh7 r4 = defpackage.gh7.d
            int r4 = r4.g(r6, r12)
            goto L33
        L23c:
            int r3 = r3 * 53
            fh7 r4 = defpackage.gh7.d
            long r4 = r4.h(r6, r12)
            int r4 = defpackage.aa3.b(r4)
            goto L33
        L24a:
            int r3 = r3 * 53
            fh7 r4 = defpackage.gh7.d
            long r4 = r4.h(r6, r12)
            int r4 = defpackage.aa3.b(r4)
            goto L33
        L258:
            int r3 = r3 * 53
            fh7 r4 = defpackage.gh7.d
            float r4 = r4.f(r6, r12)
            int r4 = java.lang.Float.floatToIntBits(r4)
            goto L33
        L266:
            int r3 = r3 * 53
            fh7 r4 = defpackage.gh7.d
            double r4 = r4.e(r6, r12)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            int r4 = defpackage.aa3.b(r4)
            goto L33
        L278:
            int r2 = r2 + 3
            goto L5
        L27c:
            int r3 = r3 * 53
            ng7 r11 = r11.m
            r11.getClass()
            mg7 r11 = r12.unknownFields
            int r11 = r11.hashCode()
            int r11 = r11 + r3
            return r11
    }

    @Override // defpackage.j66
    public final void g(defpackage.pr2 r11, defpackage.pr2 r12) {
            r10 = this;
            r12.getClass()
            r0 = 0
        L4:
            int[] r1 = r10.a
            int r2 = r1.length
            if (r0 >= r2) goto L1b6
            int r2 = r10.P(r0)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            long r6 = (long) r3
            r1 = r1[r0]
            int r2 = O(r2)
            switch(r2) {
                case 0: goto L19e;
                case 1: goto L18a;
                case 2: goto L176;
                case 3: goto L162;
                case 4: goto L14e;
                case 5: goto L13a;
                case 6: goto L126;
                case 7: goto L112;
                case 8: goto Lfe;
                case 9: goto Lf9;
                case 10: goto Le5;
                case 11: goto Ld1;
                case 12: goto Lbd;
                case 13: goto La9;
                case 14: goto L95;
                case 15: goto L82;
                case 16: goto L6f;
                case 17: goto L6b;
                case 18: goto L65;
                case 19: goto L65;
                case 20: goto L65;
                case 21: goto L65;
                case 22: goto L65;
                case 23: goto L65;
                case 24: goto L65;
                case 25: goto L65;
                case 26: goto L65;
                case 27: goto L65;
                case 28: goto L65;
                case 29: goto L65;
                case 30: goto L65;
                case 31: goto L65;
                case 32: goto L65;
                case 33: goto L65;
                case 34: goto L65;
                case 35: goto L65;
                case 36: goto L65;
                case 37: goto L65;
                case 38: goto L65;
                case 39: goto L65;
                case 40: goto L65;
                case 41: goto L65;
                case 42: goto L65;
                case 43: goto L65;
                case 44: goto L65;
                case 45: goto L65;
                case 46: goto L65;
                case 47: goto L65;
                case 48: goto L65;
                case 49: goto L65;
                case 50: goto L4c;
                case 51: goto L39;
                case 52: goto L39;
                case 53: goto L39;
                case 54: goto L39;
                case 55: goto L39;
                case 56: goto L39;
                case 57: goto L39;
                case 58: goto L39;
                case 59: goto L39;
                case 60: goto L35;
                case 61: goto L22;
                case 62: goto L22;
                case 63: goto L22;
                case 64: goto L22;
                case 65: goto L22;
                case 66: goto L22;
                case 67: goto L22;
                case 68: goto L1c;
                default: goto L1b;
            }
        L1b:
            goto L1f
        L1c:
            r10.x(r0, r11, r12)
        L1f:
            r5 = r11
            goto L1b1
        L22:
            boolean r2 = r10.t(r12, r1, r0)
            if (r2 == 0) goto L1f
            fh7 r2 = defpackage.gh7.d
            java.lang.Object r2 = r2.i(r6, r12)
            defpackage.gh7.o(r11, r6, r2)
            r10.M(r11, r1, r0)
            goto L1f
        L35:
            r10.x(r0, r11, r12)
            goto L1f
        L39:
            boolean r2 = r10.t(r12, r1, r0)
            if (r2 == 0) goto L1f
            fh7 r2 = defpackage.gh7.d
            java.lang.Object r2 = r2.i(r6, r12)
            defpackage.gh7.o(r11, r6, r2)
            r10.M(r11, r1, r0)
            goto L1f
        L4c:
            java.lang.Class r1 = defpackage.m66.a
            fh7 r1 = defpackage.gh7.d
            java.lang.Object r2 = r1.i(r6, r11)
            java.lang.Object r1 = r1.i(r6, r12)
            y04 r3 = r10.n
            r3.getClass()
            x04 r1 = defpackage.y04.b(r2, r1)
            defpackage.gh7.o(r11, r6, r1)
            goto L1f
        L65:
            ow3 r1 = r10.l
            r1.b(r11, r6, r12)
            goto L1f
        L6b:
            r10.w(r0, r11, r12)
            goto L1f
        L6f:
            boolean r1 = r10.s(r0, r12)
            if (r1 == 0) goto L1f
            fh7 r1 = defpackage.gh7.d
            long r1 = r1.h(r6, r12)
            defpackage.gh7.n(r11, r6, r1)
            r10.L(r0, r11)
            goto L1f
        L82:
            boolean r1 = r10.s(r0, r12)
            if (r1 == 0) goto L1f
            fh7 r1 = defpackage.gh7.d
            int r1 = r1.g(r6, r12)
            defpackage.gh7.m(r11, r6, r1)
            r10.L(r0, r11)
            goto L1f
        L95:
            boolean r1 = r10.s(r0, r12)
            if (r1 == 0) goto L1f
            fh7 r1 = defpackage.gh7.d
            long r1 = r1.h(r6, r12)
            defpackage.gh7.n(r11, r6, r1)
            r10.L(r0, r11)
            goto L1f
        La9:
            boolean r1 = r10.s(r0, r12)
            if (r1 == 0) goto L1f
            fh7 r1 = defpackage.gh7.d
            int r1 = r1.g(r6, r12)
            defpackage.gh7.m(r11, r6, r1)
            r10.L(r0, r11)
            goto L1f
        Lbd:
            boolean r1 = r10.s(r0, r12)
            if (r1 == 0) goto L1f
            fh7 r1 = defpackage.gh7.d
            int r1 = r1.g(r6, r12)
            defpackage.gh7.m(r11, r6, r1)
            r10.L(r0, r11)
            goto L1f
        Ld1:
            boolean r1 = r10.s(r0, r12)
            if (r1 == 0) goto L1f
            fh7 r1 = defpackage.gh7.d
            int r1 = r1.g(r6, r12)
            defpackage.gh7.m(r11, r6, r1)
            r10.L(r0, r11)
            goto L1f
        Le5:
            boolean r1 = r10.s(r0, r12)
            if (r1 == 0) goto L1f
            fh7 r1 = defpackage.gh7.d
            java.lang.Object r1 = r1.i(r6, r12)
            defpackage.gh7.o(r11, r6, r1)
            r10.L(r0, r11)
            goto L1f
        Lf9:
            r10.w(r0, r11, r12)
            goto L1f
        Lfe:
            boolean r1 = r10.s(r0, r12)
            if (r1 == 0) goto L1f
            fh7 r1 = defpackage.gh7.d
            java.lang.Object r1 = r1.i(r6, r12)
            defpackage.gh7.o(r11, r6, r1)
            r10.L(r0, r11)
            goto L1f
        L112:
            boolean r1 = r10.s(r0, r12)
            if (r1 == 0) goto L1f
            fh7 r1 = defpackage.gh7.d
            boolean r2 = r1.c(r6, r12)
            r1.k(r11, r6, r2)
            r10.L(r0, r11)
            goto L1f
        L126:
            boolean r1 = r10.s(r0, r12)
            if (r1 == 0) goto L1f
            fh7 r1 = defpackage.gh7.d
            int r1 = r1.g(r6, r12)
            defpackage.gh7.m(r11, r6, r1)
            r10.L(r0, r11)
            goto L1f
        L13a:
            boolean r1 = r10.s(r0, r12)
            if (r1 == 0) goto L1f
            fh7 r1 = defpackage.gh7.d
            long r1 = r1.h(r6, r12)
            defpackage.gh7.n(r11, r6, r1)
            r10.L(r0, r11)
            goto L1f
        L14e:
            boolean r1 = r10.s(r0, r12)
            if (r1 == 0) goto L1f
            fh7 r1 = defpackage.gh7.d
            int r1 = r1.g(r6, r12)
            defpackage.gh7.m(r11, r6, r1)
            r10.L(r0, r11)
            goto L1f
        L162:
            boolean r1 = r10.s(r0, r12)
            if (r1 == 0) goto L1f
            fh7 r1 = defpackage.gh7.d
            long r1 = r1.h(r6, r12)
            defpackage.gh7.n(r11, r6, r1)
            r10.L(r0, r11)
            goto L1f
        L176:
            boolean r1 = r10.s(r0, r12)
            if (r1 == 0) goto L1f
            fh7 r1 = defpackage.gh7.d
            long r1 = r1.h(r6, r12)
            defpackage.gh7.n(r11, r6, r1)
            r10.L(r0, r11)
            goto L1f
        L18a:
            boolean r1 = r10.s(r0, r12)
            if (r1 == 0) goto L1f
            fh7 r1 = defpackage.gh7.d
            float r2 = r1.f(r6, r12)
            r1.n(r11, r6, r2)
            r10.L(r0, r11)
            goto L1f
        L19e:
            boolean r1 = r10.s(r0, r12)
            if (r1 == 0) goto L1f
            fh7 r4 = defpackage.gh7.d
            double r8 = r4.e(r6, r12)
            r5 = r11
            r4.m(r5, r6, r8)
            r10.L(r0, r5)
        L1b1:
            int r0 = r0 + 3
            r11 = r5
            goto L4
        L1b6:
            r5 = r11
            ng7 r10 = r10.m
            defpackage.m66.x(r10, r5, r12)
            return
    }

    @Override // defpackage.j66
    public final void h(java.lang.Object r9, byte[] r10, int r11, int r12, defpackage.ou r13) {
            r8 = this;
            boolean r0 = r8.g
            if (r0 == 0) goto L8
            r8.G(r9, r10, r11, r12, r13)
            return
        L8:
            r6 = 0
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r7 = r13
            r1.F(r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // defpackage.j66
    public final int i(defpackage.c1 r2) {
            r1 = this;
            boolean r0 = r1.g
            if (r0 == 0) goto L9
            int r1 = r1.r(r2)
            return r1
        L9:
            int r1 = r1.q(r2)
            return r1
    }

    @Override // defpackage.j66
    public final java.lang.Object j() {
            r1 = this;
            mf4 r0 = r1.k
            r0.getClass()
            c1 r1 = r1.e
            pr2 r1 = (defpackage.pr2) r1
            or2 r0 = defpackage.or2.NEW_MUTABLE_INSTANCE
            java.lang.Object r1 = r1.f(r0)
            return r1
    }

    public final boolean k(defpackage.pr2 r1, java.lang.Object r2, int r3) {
            r0 = this;
            boolean r1 = r0.s(r3, r1)
            boolean r0 = r0.s(r3, r2)
            if (r1 != r0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public final void l(int r3, java.lang.Object r4, java.lang.Object r5) {
            r2 = this;
            int[] r5 = r2.a
            r5 = r5[r3]
            int r5 = r2.P(r3)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r0
            long r0 = (long) r5
            fh7 r5 = defpackage.gh7.d
            java.lang.Object r4 = r5.i(r0, r4)
            if (r4 != 0) goto L16
            goto L1c
        L16:
            y93 r5 = r2.m(r3)
            if (r5 != 0) goto L1d
        L1c:
            return
        L1d:
            y04 r5 = r2.n
            r5.getClass()
            x04 r4 = (defpackage.x04) r4
            java.lang.Object r2 = r2.n(r3)
            defpackage.xg6.A(r2)
            r2 = 0
            throw r2
    }

    public final defpackage.y93 m(int r1) {
            r0 = this;
            int r1 = r1 / 3
            int r1 = r1 * 2
            int r1 = r1 + 1
            java.lang.Object[] r0 = r0.b
            r0 = r0[r1]
            y93 r0 = (defpackage.y93) r0
            return r0
    }

    public final java.lang.Object n(int r1) {
            r0 = this;
            int r1 = r1 / 3
            int r1 = r1 * 2
            java.lang.Object[] r0 = r0.b
            r0 = r0[r1]
            return r0
    }

    public final defpackage.j66 o(int r3) {
            r2 = this;
            int r3 = r3 / 3
            int r3 = r3 * 2
            java.lang.Object[] r2 = r2.b
            r0 = r2[r3]
            j66 r0 = (defpackage.j66) r0
            if (r0 == 0) goto Ld
            return r0
        Ld:
            y45 r0 = defpackage.y45.c
            int r1 = r3 + 1
            r1 = r2[r1]
            java.lang.Class r1 = (java.lang.Class) r1
            j66 r0 = r0.a(r1)
            r2[r3] = r0
            return r0
    }

    public final int q(java.lang.Object r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            sun.misc.Unsafe r2 = defpackage.i54.p
            r4 = -1
            r7 = r4
            r5 = 0
            r6 = 0
            r8 = 0
        Lb:
            int[] r9 = r0.a
            int r10 = r9.length
            if (r5 >= r10) goto L53d
            int r10 = r0.P(r5)
            r11 = r9[r5]
            int r12 = O(r10)
            r13 = 17
            r14 = 1048575(0xfffff, float:1.469367E-39)
            r15 = 1
            if (r12 > r13) goto L35
            int r13 = r5 + 2
            r9 = r9[r13]
            r13 = r9 & r14
            int r9 = r9 >>> 20
            int r9 = r15 << r9
            if (r13 == r7) goto L36
            long r7 = (long) r13
            int r8 = r2.getInt(r1, r7)
            r7 = r13
            goto L36
        L35:
            r9 = 0
        L36:
            r10 = r10 & r14
            long r13 = (long) r10
            r3 = 4
            r16 = 63
            r10 = 8
            switch(r12) {
                case 0: goto L531;
                case 1: goto L529;
                case 2: goto L517;
                case 3: goto L505;
                case 4: goto L4f3;
                case 5: goto L4e9;
                case 6: goto L4df;
                case 7: goto L4d6;
                case 8: goto L4ae;
                case 9: goto L484;
                case 10: goto L474;
                case 11: goto L462;
                case 12: goto L450;
                case 13: goto L447;
                case 14: goto L43d;
                case 15: goto L426;
                case 16: goto L40f;
                case 17: goto L3fb;
                case 18: goto L3ef;
                case 19: goto L3e3;
                case 20: goto L3d7;
                case 21: goto L3cb;
                case 22: goto L3bf;
                case 23: goto L3b3;
                case 24: goto L3a7;
                case 25: goto L38e;
                case 26: goto L382;
                case 27: goto L372;
                case 28: goto L366;
                case 29: goto L35a;
                case 30: goto L34e;
                case 31: goto L342;
                case 32: goto L336;
                case 33: goto L32a;
                case 34: goto L31e;
                case 35: goto L308;
                case 36: goto L2f2;
                case 37: goto L2dc;
                case 38: goto L2c6;
                case 39: goto L2b0;
                case 40: goto L29a;
                case 41: goto L284;
                case 42: goto L26c;
                case 43: goto L256;
                case 44: goto L240;
                case 45: goto L22a;
                case 46: goto L214;
                case 47: goto L1fe;
                case 48: goto L1e8;
                case 49: goto L1bf;
                case 50: goto L1ad;
                case 51: goto L1a1;
                case 52: goto L195;
                case 53: goto L181;
                case 54: goto L16d;
                case 55: goto L159;
                case 56: goto L14d;
                case 57: goto L141;
                case 58: goto L135;
                case 59: goto L109;
                case 60: goto Ldd;
                case 61: goto Lcb;
                case 62: goto Lb8;
                case 63: goto La5;
                case 64: goto L99;
                case 65: goto L8d;
                case 66: goto L74;
                case 67: goto L59;
                case 68: goto L42;
                default: goto L40;
            }
        L40:
            goto L539
        L42:
            boolean r3 = r0.t(r1, r11, r5)
            if (r3 == 0) goto L539
            java.lang.Object r3 = r2.getObject(r1, r13)
            c1 r3 = (defpackage.c1) r3
            j66 r9 = r0.o(r5)
            int r3 = defpackage.ms0.e(r11, r3, r9)
        L56:
            int r6 = r6 + r3
            goto L539
        L59:
            boolean r3 = r0.t(r1, r11, r5)
            if (r3 == 0) goto L539
            long r9 = C(r13, r1)
            int r3 = defpackage.ms0.h(r11)
            long r11 = r9 << r15
            long r9 = r9 >> r16
            long r9 = r9 ^ r11
            int r9 = defpackage.ms0.j(r9)
        L70:
            int r9 = r9 + r3
        L71:
            int r6 = r6 + r9
            goto L539
        L74:
            boolean r3 = r0.t(r1, r11, r5)
            if (r3 == 0) goto L539
            int r3 = B(r13, r1)
            int r9 = defpackage.ms0.h(r11)
            int r10 = r3 << 1
            int r3 = r3 >> 31
            r3 = r3 ^ r10
            int r3 = defpackage.ms0.i(r3)
        L8b:
            int r3 = r3 + r9
            goto L56
        L8d:
            boolean r3 = r0.t(r1, r11, r5)
            if (r3 == 0) goto L539
            int r6 = defpackage.lb1.y(r11, r10, r6)
            goto L539
        L99:
            boolean r9 = r0.t(r1, r11, r5)
            if (r9 == 0) goto L539
            int r6 = defpackage.lb1.y(r11, r3, r6)
            goto L539
        La5:
            boolean r3 = r0.t(r1, r11, r5)
            if (r3 == 0) goto L539
            int r3 = B(r13, r1)
            int r9 = defpackage.ms0.h(r11)
            int r3 = defpackage.ms0.f(r3)
            goto L8b
        Lb8:
            boolean r3 = r0.t(r1, r11, r5)
            if (r3 == 0) goto L539
            int r3 = B(r13, r1)
            int r9 = defpackage.ms0.h(r11)
            int r3 = defpackage.ms0.i(r3)
            goto L8b
        Lcb:
            boolean r3 = r0.t(r1, r11, r5)
            if (r3 == 0) goto L539
            java.lang.Object r3 = r2.getObject(r1, r13)
            ea0 r3 = (defpackage.ea0) r3
            int r3 = defpackage.ms0.a(r11, r3)
            goto L56
        Ldd:
            boolean r3 = r0.t(r1, r11, r5)
            if (r3 == 0) goto L539
            java.lang.Object r3 = r2.getObject(r1, r13)
            j66 r9 = r0.o(r5)
            java.lang.Class r10 = defpackage.m66.a
            c1 r3 = (defpackage.c1) r3
            int r10 = defpackage.ms0.h(r11)
            r3.getClass()
            r11 = r3
            pr2 r11 = (defpackage.pr2) r11
            int r12 = r11.memoizedSerializedSize
            if (r12 != r4) goto L103
            int r12 = r9.i(r3)
            r11.memoizedSerializedSize = r12
        L103:
            int r6 = defpackage.lb1.b(r12, r12, r10, r6)
            goto L539
        L109:
            boolean r3 = r0.t(r1, r11, r5)
            if (r3 == 0) goto L539
            java.lang.Object r3 = r2.getObject(r1, r13)
            boolean r9 = r3 instanceof defpackage.ea0
            if (r9 == 0) goto L128
            ea0 r3 = (defpackage.ea0) r3
            int r9 = defpackage.ms0.h(r11)
            int r3 = r3.size()
            int r3 = defpackage.lb1.b(r3, r3, r9, r6)
        L125:
            r6 = r3
            goto L539
        L128:
            java.lang.String r3 = (java.lang.String) r3
            int r9 = defpackage.ms0.h(r11)
            int r3 = defpackage.ms0.g(r3)
        L132:
            int r3 = r3 + r9
            int r3 = r3 + r6
            goto L125
        L135:
            boolean r3 = r0.t(r1, r11, r5)
            if (r3 == 0) goto L539
            int r6 = defpackage.lb1.y(r11, r15, r6)
            goto L539
        L141:
            boolean r3 = r0.t(r1, r11, r5)
            if (r3 == 0) goto L539
            int r3 = defpackage.ms0.c(r11)
            goto L56
        L14d:
            boolean r3 = r0.t(r1, r11, r5)
            if (r3 == 0) goto L539
            int r3 = defpackage.ms0.d(r11)
            goto L56
        L159:
            boolean r3 = r0.t(r1, r11, r5)
            if (r3 == 0) goto L539
            int r3 = B(r13, r1)
            int r9 = defpackage.ms0.h(r11)
            int r3 = defpackage.ms0.f(r3)
            goto L8b
        L16d:
            boolean r3 = r0.t(r1, r11, r5)
            if (r3 == 0) goto L539
            long r9 = C(r13, r1)
            int r3 = defpackage.ms0.h(r11)
            int r9 = defpackage.ms0.j(r9)
            goto L70
        L181:
            boolean r3 = r0.t(r1, r11, r5)
            if (r3 == 0) goto L539
            long r9 = C(r13, r1)
            int r3 = defpackage.ms0.h(r11)
            int r9 = defpackage.ms0.j(r9)
            goto L70
        L195:
            boolean r9 = r0.t(r1, r11, r5)
            if (r9 == 0) goto L539
            int r6 = defpackage.lb1.y(r11, r3, r6)
            goto L539
        L1a1:
            boolean r3 = r0.t(r1, r11, r5)
            if (r3 == 0) goto L539
            int r6 = defpackage.lb1.y(r11, r10, r6)
            goto L539
        L1ad:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.lang.Object r9 = r0.n(r5)
            y04 r10 = r0.n
            r10.getClass()
            defpackage.y04.a(r3, r9)
            goto L539
        L1bf:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            j66 r9 = r0.o(r5)
            java.lang.Class r10 = defpackage.m66.a
            int r10 = r3.size()
            if (r10 != 0) goto L1d3
            r13 = 0
            goto L1e5
        L1d3:
            r12 = 0
            r13 = 0
        L1d5:
            if (r12 >= r10) goto L1e5
            java.lang.Object r14 = r3.get(r12)
            c1 r14 = (defpackage.c1) r14
            int r14 = defpackage.ms0.e(r11, r14, r9)
            int r13 = r13 + r14
            int r12 = r12 + 1
            goto L1d5
        L1e5:
            int r6 = r6 + r13
            goto L539
        L1e8:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = defpackage.m66.p(r3)
            if (r3 <= 0) goto L539
            int r9 = defpackage.ms0.h(r11)
            int r6 = defpackage.lb1.b(r3, r9, r3, r6)
            goto L539
        L1fe:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = defpackage.m66.n(r3)
            if (r3 <= 0) goto L539
            int r9 = defpackage.ms0.h(r11)
            int r6 = defpackage.lb1.b(r3, r9, r3, r6)
            goto L539
        L214:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = defpackage.m66.g(r3)
            if (r3 <= 0) goto L539
            int r9 = defpackage.ms0.h(r11)
            int r6 = defpackage.lb1.b(r3, r9, r3, r6)
            goto L539
        L22a:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = defpackage.m66.e(r3)
            if (r3 <= 0) goto L539
            int r9 = defpackage.ms0.h(r11)
            int r6 = defpackage.lb1.b(r3, r9, r3, r6)
            goto L539
        L240:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = defpackage.m66.c(r3)
            if (r3 <= 0) goto L539
            int r9 = defpackage.ms0.h(r11)
            int r6 = defpackage.lb1.b(r3, r9, r3, r6)
            goto L539
        L256:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = defpackage.m66.s(r3)
            if (r3 <= 0) goto L539
            int r9 = defpackage.ms0.h(r11)
            int r6 = defpackage.lb1.b(r3, r9, r3, r6)
            goto L539
        L26c:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            java.lang.Class r9 = defpackage.m66.a
            int r3 = r3.size()
            if (r3 <= 0) goto L539
            int r9 = defpackage.ms0.h(r11)
            int r6 = defpackage.lb1.b(r3, r9, r3, r6)
            goto L539
        L284:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = defpackage.m66.e(r3)
            if (r3 <= 0) goto L539
            int r9 = defpackage.ms0.h(r11)
            int r6 = defpackage.lb1.b(r3, r9, r3, r6)
            goto L539
        L29a:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = defpackage.m66.g(r3)
            if (r3 <= 0) goto L539
            int r9 = defpackage.ms0.h(r11)
            int r6 = defpackage.lb1.b(r3, r9, r3, r6)
            goto L539
        L2b0:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = defpackage.m66.i(r3)
            if (r3 <= 0) goto L539
            int r9 = defpackage.ms0.h(r11)
            int r6 = defpackage.lb1.b(r3, r9, r3, r6)
            goto L539
        L2c6:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = defpackage.m66.u(r3)
            if (r3 <= 0) goto L539
            int r9 = defpackage.ms0.h(r11)
            int r6 = defpackage.lb1.b(r3, r9, r3, r6)
            goto L539
        L2dc:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = defpackage.m66.k(r3)
            if (r3 <= 0) goto L539
            int r9 = defpackage.ms0.h(r11)
            int r6 = defpackage.lb1.b(r3, r9, r3, r6)
            goto L539
        L2f2:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = defpackage.m66.e(r3)
            if (r3 <= 0) goto L539
            int r9 = defpackage.ms0.h(r11)
            int r6 = defpackage.lb1.b(r3, r9, r3, r6)
            goto L539
        L308:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = defpackage.m66.g(r3)
            if (r3 <= 0) goto L539
            int r9 = defpackage.ms0.h(r11)
            int r6 = defpackage.lb1.b(r3, r9, r3, r6)
            goto L539
        L31e:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = defpackage.m66.o(r11, r3)
            goto L56
        L32a:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = defpackage.m66.m(r11, r3)
            goto L56
        L336:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = defpackage.m66.f(r11, r3)
            goto L56
        L342:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = defpackage.m66.d(r11, r3)
            goto L56
        L34e:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = defpackage.m66.b(r11, r3)
            goto L56
        L35a:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = defpackage.m66.r(r11, r3)
            goto L56
        L366:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = defpackage.m66.a(r11, r3)
            goto L56
        L372:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            j66 r9 = r0.o(r5)
            int r3 = defpackage.m66.l(r11, r3, r9)
            goto L56
        L382:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = defpackage.m66.q(r11, r3)
            goto L56
        L38e:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            java.lang.Class r9 = defpackage.m66.a
            int r3 = r3.size()
            if (r3 != 0) goto L39f
            r9 = 0
            goto L71
        L39f:
            int r9 = defpackage.ms0.h(r11)
            int r9 = r9 + r15
            int r9 = r9 * r3
            goto L71
        L3a7:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = defpackage.m66.d(r11, r3)
            goto L56
        L3b3:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = defpackage.m66.f(r11, r3)
            goto L56
        L3bf:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = defpackage.m66.h(r11, r3)
            goto L56
        L3cb:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = defpackage.m66.t(r11, r3)
            goto L56
        L3d7:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = defpackage.m66.j(r11, r3)
            goto L56
        L3e3:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = defpackage.m66.d(r11, r3)
            goto L56
        L3ef:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = defpackage.m66.f(r11, r3)
            goto L56
        L3fb:
            r3 = r8 & r9
            if (r3 == 0) goto L539
            java.lang.Object r3 = r2.getObject(r1, r13)
            c1 r3 = (defpackage.c1) r3
            j66 r9 = r0.o(r5)
            int r3 = defpackage.ms0.e(r11, r3, r9)
            goto L56
        L40f:
            r3 = r8 & r9
            if (r3 == 0) goto L539
            long r9 = r2.getLong(r1, r13)
            int r3 = defpackage.ms0.h(r11)
            long r11 = r9 << r15
            long r9 = r9 >> r16
            long r9 = r9 ^ r11
            int r9 = defpackage.ms0.j(r9)
            goto L70
        L426:
            r3 = r8 & r9
            if (r3 == 0) goto L539
            int r3 = r2.getInt(r1, r13)
            int r9 = defpackage.ms0.h(r11)
            int r10 = r3 << 1
            int r3 = r3 >> 31
            r3 = r3 ^ r10
            int r3 = defpackage.ms0.i(r3)
            goto L8b
        L43d:
            r3 = r8 & r9
            if (r3 == 0) goto L539
            int r6 = defpackage.lb1.y(r11, r10, r6)
            goto L539
        L447:
            r9 = r9 & r8
            if (r9 == 0) goto L539
            int r6 = defpackage.lb1.y(r11, r3, r6)
            goto L539
        L450:
            r3 = r8 & r9
            if (r3 == 0) goto L539
            int r3 = r2.getInt(r1, r13)
            int r9 = defpackage.ms0.h(r11)
            int r3 = defpackage.ms0.f(r3)
            goto L8b
        L462:
            r3 = r8 & r9
            if (r3 == 0) goto L539
            int r3 = r2.getInt(r1, r13)
            int r9 = defpackage.ms0.h(r11)
            int r3 = defpackage.ms0.i(r3)
            goto L8b
        L474:
            r3 = r8 & r9
            if (r3 == 0) goto L539
            java.lang.Object r3 = r2.getObject(r1, r13)
            ea0 r3 = (defpackage.ea0) r3
            int r3 = defpackage.ms0.a(r11, r3)
            goto L56
        L484:
            r3 = r8 & r9
            if (r3 == 0) goto L539
            java.lang.Object r3 = r2.getObject(r1, r13)
            j66 r9 = r0.o(r5)
            java.lang.Class r10 = defpackage.m66.a
            c1 r3 = (defpackage.c1) r3
            int r10 = defpackage.ms0.h(r11)
            r3.getClass()
            r11 = r3
            pr2 r11 = (defpackage.pr2) r11
            int r12 = r11.memoizedSerializedSize
            if (r12 != r4) goto L4a8
            int r12 = r9.i(r3)
            r11.memoizedSerializedSize = r12
        L4a8:
            int r6 = defpackage.lb1.b(r12, r12, r10, r6)
            goto L539
        L4ae:
            r3 = r8 & r9
            if (r3 == 0) goto L539
            java.lang.Object r3 = r2.getObject(r1, r13)
            boolean r9 = r3 instanceof defpackage.ea0
            if (r9 == 0) goto L4ca
            ea0 r3 = (defpackage.ea0) r3
            int r9 = defpackage.ms0.h(r11)
            int r3 = r3.size()
            int r3 = defpackage.lb1.b(r3, r3, r9, r6)
            goto L125
        L4ca:
            java.lang.String r3 = (java.lang.String) r3
            int r9 = defpackage.ms0.h(r11)
            int r3 = defpackage.ms0.g(r3)
            goto L132
        L4d6:
            r3 = r8 & r9
            if (r3 == 0) goto L539
            int r6 = defpackage.lb1.y(r11, r15, r6)
            goto L539
        L4df:
            r3 = r8 & r9
            if (r3 == 0) goto L539
            int r3 = defpackage.ms0.c(r11)
            goto L56
        L4e9:
            r3 = r8 & r9
            if (r3 == 0) goto L539
            int r3 = defpackage.ms0.d(r11)
            goto L56
        L4f3:
            r3 = r8 & r9
            if (r3 == 0) goto L539
            int r3 = r2.getInt(r1, r13)
            int r9 = defpackage.ms0.h(r11)
            int r3 = defpackage.ms0.f(r3)
            goto L8b
        L505:
            r3 = r8 & r9
            if (r3 == 0) goto L539
            long r9 = r2.getLong(r1, r13)
            int r3 = defpackage.ms0.h(r11)
            int r9 = defpackage.ms0.j(r9)
            goto L70
        L517:
            r3 = r8 & r9
            if (r3 == 0) goto L539
            long r9 = r2.getLong(r1, r13)
            int r3 = defpackage.ms0.h(r11)
            int r9 = defpackage.ms0.j(r9)
            goto L70
        L529:
            r9 = r9 & r8
            if (r9 == 0) goto L539
            int r6 = defpackage.lb1.y(r11, r3, r6)
            goto L539
        L531:
            r3 = r8 & r9
            if (r3 == 0) goto L539
            int r6 = defpackage.lb1.y(r11, r10, r6)
        L539:
            int r5 = r5 + 3
            goto Lb
        L53d:
            ng7 r0 = r0.m
            r0.getClass()
            r0 = r1
            pr2 r0 = (defpackage.pr2) r0
            mg7 r0 = r0.unknownFields
            int r0 = r0.a()
            int r0 = r0 + r6
            return r0
    }

    public final int r(java.lang.Object r14) {
            r13 = this;
            sun.misc.Unsafe r0 = defpackage.i54.p
            r1 = 0
            r2 = r1
            r3 = r2
        L5:
            int[] r4 = r13.a
            int r5 = r4.length
            if (r2 >= r5) goto L558
            int r5 = r13.P(r2)
            int r6 = O(r5)
            r7 = r4[r2]
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r8
            long r8 = (long) r5
            sa2 r5 = defpackage.sa2.DOUBLE_LIST_PACKED
            int r5 = r5.id()
            if (r6 < r5) goto L2d
            sa2 r5 = defpackage.sa2.SINT64_LIST_PACKED
            int r5 = r5.id()
            if (r6 > r5) goto L2d
            int r5 = r2 + 2
            r4 = r4[r5]
        L2d:
            r4 = -1
            r5 = 63
            r10 = 4
            r11 = 8
            r12 = 1
            switch(r6) {
                case 0: goto L54a;
                case 1: goto L53f;
                case 2: goto L529;
                case 3: goto L513;
                case 4: goto L4fd;
                case 5: goto L4f1;
                case 6: goto L4e5;
                case 7: goto L4d9;
                case 8: goto L4ad;
                case 9: goto L47f;
                case 10: goto L46b;
                case 11: goto L455;
                case 12: goto L43f;
                case 13: goto L433;
                case 14: goto L427;
                case 15: goto L40c;
                case 16: goto L3f1;
                case 17: goto L3d9;
                case 18: goto L3cf;
                case 19: goto L3c5;
                case 20: goto L3bb;
                case 21: goto L3b1;
                case 22: goto L3a7;
                case 23: goto L39d;
                case 24: goto L393;
                case 25: goto L37c;
                case 26: goto L372;
                case 27: goto L364;
                case 28: goto L35a;
                case 29: goto L350;
                case 30: goto L346;
                case 31: goto L33c;
                case 32: goto L332;
                case 33: goto L328;
                case 34: goto L31e;
                case 35: goto L308;
                case 36: goto L2f2;
                case 37: goto L2dc;
                case 38: goto L2c6;
                case 39: goto L2b0;
                case 40: goto L29a;
                case 41: goto L284;
                case 42: goto L26c;
                case 43: goto L256;
                case 44: goto L240;
                case 45: goto L22a;
                case 46: goto L214;
                case 47: goto L1fe;
                case 48: goto L1e8;
                case 49: goto L1c1;
                case 50: goto L1ad;
                case 51: goto L1a1;
                case 52: goto L195;
                case 53: goto L182;
                case 54: goto L16d;
                case 55: goto L159;
                case 56: goto L14d;
                case 57: goto L141;
                case 58: goto L135;
                case 59: goto L106;
                case 60: goto Ld8;
                case 61: goto Lc4;
                case 62: goto Lb1;
                case 63: goto L9e;
                case 64: goto L92;
                case 65: goto L86;
                case 66: goto L6d;
                case 67: goto L52;
                case 68: goto L39;
                default: goto L37;
            }
        L37:
            goto L554
        L39:
            boolean r4 = r13.t(r14, r7, r2)
            if (r4 == 0) goto L554
            fh7 r4 = defpackage.gh7.d
            java.lang.Object r4 = r4.i(r8, r14)
            c1 r4 = (defpackage.c1) r4
            j66 r5 = r13.o(r2)
            int r4 = defpackage.ms0.e(r7, r4, r5)
        L4f:
            int r3 = r3 + r4
            goto L554
        L52:
            boolean r4 = r13.t(r14, r7, r2)
            if (r4 == 0) goto L554
            long r8 = C(r8, r14)
            int r4 = defpackage.ms0.h(r7)
            long r6 = r8 << r12
            long r8 = r8 >> r5
            long r5 = r6 ^ r8
            int r5 = defpackage.ms0.j(r5)
        L69:
            int r5 = r5 + r4
        L6a:
            int r3 = r3 + r5
            goto L554
        L6d:
            boolean r4 = r13.t(r14, r7, r2)
            if (r4 == 0) goto L554
            int r4 = B(r8, r14)
            int r5 = defpackage.ms0.h(r7)
            int r6 = r4 << 1
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            int r4 = defpackage.ms0.i(r4)
        L84:
            int r4 = r4 + r5
            goto L4f
        L86:
            boolean r4 = r13.t(r14, r7, r2)
            if (r4 == 0) goto L554
            int r3 = defpackage.lb1.y(r7, r11, r3)
            goto L554
        L92:
            boolean r4 = r13.t(r14, r7, r2)
            if (r4 == 0) goto L554
            int r3 = defpackage.lb1.y(r7, r10, r3)
            goto L554
        L9e:
            boolean r4 = r13.t(r14, r7, r2)
            if (r4 == 0) goto L554
            int r4 = B(r8, r14)
            int r5 = defpackage.ms0.h(r7)
            int r4 = defpackage.ms0.f(r4)
            goto L84
        Lb1:
            boolean r4 = r13.t(r14, r7, r2)
            if (r4 == 0) goto L554
            int r4 = B(r8, r14)
            int r5 = defpackage.ms0.h(r7)
            int r4 = defpackage.ms0.i(r4)
            goto L84
        Lc4:
            boolean r4 = r13.t(r14, r7, r2)
            if (r4 == 0) goto L554
            fh7 r4 = defpackage.gh7.d
            java.lang.Object r4 = r4.i(r8, r14)
            ea0 r4 = (defpackage.ea0) r4
            int r4 = defpackage.ms0.a(r7, r4)
            goto L4f
        Ld8:
            boolean r5 = r13.t(r14, r7, r2)
            if (r5 == 0) goto L554
            fh7 r5 = defpackage.gh7.d
            java.lang.Object r5 = r5.i(r8, r14)
            j66 r6 = r13.o(r2)
            java.lang.Class r8 = defpackage.m66.a
            c1 r5 = (defpackage.c1) r5
            int r7 = defpackage.ms0.h(r7)
            r5.getClass()
            r8 = r5
            pr2 r8 = (defpackage.pr2) r8
            int r9 = r8.memoizedSerializedSize
            if (r9 != r4) goto L100
            int r9 = r6.i(r5)
            r8.memoizedSerializedSize = r9
        L100:
            int r3 = defpackage.lb1.b(r9, r9, r7, r3)
            goto L554
        L106:
            boolean r4 = r13.t(r14, r7, r2)
            if (r4 == 0) goto L554
            fh7 r4 = defpackage.gh7.d
            java.lang.Object r4 = r4.i(r8, r14)
            boolean r5 = r4 instanceof defpackage.ea0
            if (r5 == 0) goto L126
            ea0 r4 = (defpackage.ea0) r4
            int r5 = defpackage.ms0.h(r7)
            int r4 = r4.size()
            int r3 = defpackage.lb1.b(r4, r4, r5, r3)
            goto L554
        L126:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = defpackage.ms0.h(r7)
            int r4 = defpackage.ms0.g(r4)
        L130:
            int r4 = r4 + r5
            int r4 = r4 + r3
            r3 = r4
            goto L554
        L135:
            boolean r4 = r13.t(r14, r7, r2)
            if (r4 == 0) goto L554
            int r3 = defpackage.lb1.y(r7, r12, r3)
            goto L554
        L141:
            boolean r4 = r13.t(r14, r7, r2)
            if (r4 == 0) goto L554
            int r4 = defpackage.ms0.c(r7)
            goto L4f
        L14d:
            boolean r4 = r13.t(r14, r7, r2)
            if (r4 == 0) goto L554
            int r4 = defpackage.ms0.d(r7)
            goto L4f
        L159:
            boolean r4 = r13.t(r14, r7, r2)
            if (r4 == 0) goto L554
            int r4 = B(r8, r14)
            int r5 = defpackage.ms0.h(r7)
            int r4 = defpackage.ms0.f(r4)
            goto L84
        L16d:
            boolean r4 = r13.t(r14, r7, r2)
            if (r4 == 0) goto L554
            long r4 = C(r8, r14)
            int r6 = defpackage.ms0.h(r7)
            int r4 = defpackage.ms0.j(r4)
        L17f:
            int r4 = r4 + r6
            goto L4f
        L182:
            boolean r4 = r13.t(r14, r7, r2)
            if (r4 == 0) goto L554
            long r4 = C(r8, r14)
            int r6 = defpackage.ms0.h(r7)
            int r4 = defpackage.ms0.j(r4)
            goto L17f
        L195:
            boolean r4 = r13.t(r14, r7, r2)
            if (r4 == 0) goto L554
            int r3 = defpackage.lb1.y(r7, r10, r3)
            goto L554
        L1a1:
            boolean r4 = r13.t(r14, r7, r2)
            if (r4 == 0) goto L554
            int r3 = defpackage.lb1.y(r7, r11, r3)
            goto L554
        L1ad:
            fh7 r4 = defpackage.gh7.d
            java.lang.Object r4 = r4.i(r8, r14)
            java.lang.Object r5 = r13.n(r2)
            y04 r6 = r13.n
            r6.getClass()
            defpackage.y04.a(r4, r5)
            goto L554
        L1c1:
            java.util.List r4 = u(r8, r14)
            j66 r5 = r13.o(r2)
            java.lang.Class r6 = defpackage.m66.a
            int r6 = r4.size()
            if (r6 != 0) goto L1d3
            r9 = r1
            goto L1e5
        L1d3:
            r8 = r1
            r9 = r8
        L1d5:
            if (r8 >= r6) goto L1e5
            java.lang.Object r10 = r4.get(r8)
            c1 r10 = (defpackage.c1) r10
            int r10 = defpackage.ms0.e(r7, r10, r5)
            int r9 = r9 + r10
            int r8 = r8 + 1
            goto L1d5
        L1e5:
            int r3 = r3 + r9
            goto L554
        L1e8:
            java.lang.Object r4 = r0.getObject(r14, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = defpackage.m66.p(r4)
            if (r4 <= 0) goto L554
            int r5 = defpackage.ms0.h(r7)
            int r3 = defpackage.lb1.b(r4, r5, r4, r3)
            goto L554
        L1fe:
            java.lang.Object r4 = r0.getObject(r14, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = defpackage.m66.n(r4)
            if (r4 <= 0) goto L554
            int r5 = defpackage.ms0.h(r7)
            int r3 = defpackage.lb1.b(r4, r5, r4, r3)
            goto L554
        L214:
            java.lang.Object r4 = r0.getObject(r14, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = defpackage.m66.g(r4)
            if (r4 <= 0) goto L554
            int r5 = defpackage.ms0.h(r7)
            int r3 = defpackage.lb1.b(r4, r5, r4, r3)
            goto L554
        L22a:
            java.lang.Object r4 = r0.getObject(r14, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = defpackage.m66.e(r4)
            if (r4 <= 0) goto L554
            int r5 = defpackage.ms0.h(r7)
            int r3 = defpackage.lb1.b(r4, r5, r4, r3)
            goto L554
        L240:
            java.lang.Object r4 = r0.getObject(r14, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = defpackage.m66.c(r4)
            if (r4 <= 0) goto L554
            int r5 = defpackage.ms0.h(r7)
            int r3 = defpackage.lb1.b(r4, r5, r4, r3)
            goto L554
        L256:
            java.lang.Object r4 = r0.getObject(r14, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = defpackage.m66.s(r4)
            if (r4 <= 0) goto L554
            int r5 = defpackage.ms0.h(r7)
            int r3 = defpackage.lb1.b(r4, r5, r4, r3)
            goto L554
        L26c:
            java.lang.Object r4 = r0.getObject(r14, r8)
            java.util.List r4 = (java.util.List) r4
            java.lang.Class r5 = defpackage.m66.a
            int r4 = r4.size()
            if (r4 <= 0) goto L554
            int r5 = defpackage.ms0.h(r7)
            int r3 = defpackage.lb1.b(r4, r5, r4, r3)
            goto L554
        L284:
            java.lang.Object r4 = r0.getObject(r14, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = defpackage.m66.e(r4)
            if (r4 <= 0) goto L554
            int r5 = defpackage.ms0.h(r7)
            int r3 = defpackage.lb1.b(r4, r5, r4, r3)
            goto L554
        L29a:
            java.lang.Object r4 = r0.getObject(r14, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = defpackage.m66.g(r4)
            if (r4 <= 0) goto L554
            int r5 = defpackage.ms0.h(r7)
            int r3 = defpackage.lb1.b(r4, r5, r4, r3)
            goto L554
        L2b0:
            java.lang.Object r4 = r0.getObject(r14, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = defpackage.m66.i(r4)
            if (r4 <= 0) goto L554
            int r5 = defpackage.ms0.h(r7)
            int r3 = defpackage.lb1.b(r4, r5, r4, r3)
            goto L554
        L2c6:
            java.lang.Object r4 = r0.getObject(r14, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = defpackage.m66.u(r4)
            if (r4 <= 0) goto L554
            int r5 = defpackage.ms0.h(r7)
            int r3 = defpackage.lb1.b(r4, r5, r4, r3)
            goto L554
        L2dc:
            java.lang.Object r4 = r0.getObject(r14, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = defpackage.m66.k(r4)
            if (r4 <= 0) goto L554
            int r5 = defpackage.ms0.h(r7)
            int r3 = defpackage.lb1.b(r4, r5, r4, r3)
            goto L554
        L2f2:
            java.lang.Object r4 = r0.getObject(r14, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = defpackage.m66.e(r4)
            if (r4 <= 0) goto L554
            int r5 = defpackage.ms0.h(r7)
            int r3 = defpackage.lb1.b(r4, r5, r4, r3)
            goto L554
        L308:
            java.lang.Object r4 = r0.getObject(r14, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = defpackage.m66.g(r4)
            if (r4 <= 0) goto L554
            int r5 = defpackage.ms0.h(r7)
            int r3 = defpackage.lb1.b(r4, r5, r4, r3)
            goto L554
        L31e:
            java.util.List r4 = u(r8, r14)
            int r4 = defpackage.m66.o(r7, r4)
            goto L4f
        L328:
            java.util.List r4 = u(r8, r14)
            int r4 = defpackage.m66.m(r7, r4)
            goto L4f
        L332:
            java.util.List r4 = u(r8, r14)
            int r4 = defpackage.m66.f(r7, r4)
            goto L4f
        L33c:
            java.util.List r4 = u(r8, r14)
            int r4 = defpackage.m66.d(r7, r4)
            goto L4f
        L346:
            java.util.List r4 = u(r8, r14)
            int r4 = defpackage.m66.b(r7, r4)
            goto L4f
        L350:
            java.util.List r4 = u(r8, r14)
            int r4 = defpackage.m66.r(r7, r4)
            goto L4f
        L35a:
            java.util.List r4 = u(r8, r14)
            int r4 = defpackage.m66.a(r7, r4)
            goto L4f
        L364:
            java.util.List r4 = u(r8, r14)
            j66 r5 = r13.o(r2)
            int r4 = defpackage.m66.l(r7, r4, r5)
            goto L4f
        L372:
            java.util.List r4 = u(r8, r14)
            int r4 = defpackage.m66.q(r7, r4)
            goto L4f
        L37c:
            java.util.List r4 = u(r8, r14)
            java.lang.Class r5 = defpackage.m66.a
            int r4 = r4.size()
            if (r4 != 0) goto L38b
            r5 = r1
            goto L6a
        L38b:
            int r5 = defpackage.ms0.h(r7)
            int r5 = r5 + r12
            int r5 = r5 * r4
            goto L6a
        L393:
            java.util.List r4 = u(r8, r14)
            int r4 = defpackage.m66.d(r7, r4)
            goto L4f
        L39d:
            java.util.List r4 = u(r8, r14)
            int r4 = defpackage.m66.f(r7, r4)
            goto L4f
        L3a7:
            java.util.List r4 = u(r8, r14)
            int r4 = defpackage.m66.h(r7, r4)
            goto L4f
        L3b1:
            java.util.List r4 = u(r8, r14)
            int r4 = defpackage.m66.t(r7, r4)
            goto L4f
        L3bb:
            java.util.List r4 = u(r8, r14)
            int r4 = defpackage.m66.j(r7, r4)
            goto L4f
        L3c5:
            java.util.List r4 = u(r8, r14)
            int r4 = defpackage.m66.d(r7, r4)
            goto L4f
        L3cf:
            java.util.List r4 = u(r8, r14)
            int r4 = defpackage.m66.f(r7, r4)
            goto L4f
        L3d9:
            boolean r4 = r13.s(r2, r14)
            if (r4 == 0) goto L554
            fh7 r4 = defpackage.gh7.d
            java.lang.Object r4 = r4.i(r8, r14)
            c1 r4 = (defpackage.c1) r4
            j66 r5 = r13.o(r2)
            int r4 = defpackage.ms0.e(r7, r4, r5)
            goto L4f
        L3f1:
            boolean r4 = r13.s(r2, r14)
            if (r4 == 0) goto L554
            fh7 r4 = defpackage.gh7.d
            long r8 = r4.h(r8, r14)
            int r4 = defpackage.ms0.h(r7)
            long r6 = r8 << r12
            long r8 = r8 >> r5
            long r5 = r6 ^ r8
            int r5 = defpackage.ms0.j(r5)
            goto L69
        L40c:
            boolean r4 = r13.s(r2, r14)
            if (r4 == 0) goto L554
            fh7 r4 = defpackage.gh7.d
            int r4 = r4.g(r8, r14)
            int r5 = defpackage.ms0.h(r7)
            int r6 = r4 << 1
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            int r4 = defpackage.ms0.i(r4)
            goto L84
        L427:
            boolean r4 = r13.s(r2, r14)
            if (r4 == 0) goto L554
            int r3 = defpackage.lb1.y(r7, r11, r3)
            goto L554
        L433:
            boolean r4 = r13.s(r2, r14)
            if (r4 == 0) goto L554
            int r3 = defpackage.lb1.y(r7, r10, r3)
            goto L554
        L43f:
            boolean r4 = r13.s(r2, r14)
            if (r4 == 0) goto L554
            fh7 r4 = defpackage.gh7.d
            int r4 = r4.g(r8, r14)
            int r5 = defpackage.ms0.h(r7)
            int r4 = defpackage.ms0.f(r4)
            goto L84
        L455:
            boolean r4 = r13.s(r2, r14)
            if (r4 == 0) goto L554
            fh7 r4 = defpackage.gh7.d
            int r4 = r4.g(r8, r14)
            int r5 = defpackage.ms0.h(r7)
            int r4 = defpackage.ms0.i(r4)
            goto L84
        L46b:
            boolean r4 = r13.s(r2, r14)
            if (r4 == 0) goto L554
            fh7 r4 = defpackage.gh7.d
            java.lang.Object r4 = r4.i(r8, r14)
            ea0 r4 = (defpackage.ea0) r4
            int r4 = defpackage.ms0.a(r7, r4)
            goto L4f
        L47f:
            boolean r5 = r13.s(r2, r14)
            if (r5 == 0) goto L554
            fh7 r5 = defpackage.gh7.d
            java.lang.Object r5 = r5.i(r8, r14)
            j66 r6 = r13.o(r2)
            java.lang.Class r8 = defpackage.m66.a
            c1 r5 = (defpackage.c1) r5
            int r7 = defpackage.ms0.h(r7)
            r5.getClass()
            r8 = r5
            pr2 r8 = (defpackage.pr2) r8
            int r9 = r8.memoizedSerializedSize
            if (r9 != r4) goto L4a7
            int r9 = r6.i(r5)
            r8.memoizedSerializedSize = r9
        L4a7:
            int r3 = defpackage.lb1.b(r9, r9, r7, r3)
            goto L554
        L4ad:
            boolean r4 = r13.s(r2, r14)
            if (r4 == 0) goto L554
            fh7 r4 = defpackage.gh7.d
            java.lang.Object r4 = r4.i(r8, r14)
            boolean r5 = r4 instanceof defpackage.ea0
            if (r5 == 0) goto L4cd
            ea0 r4 = (defpackage.ea0) r4
            int r5 = defpackage.ms0.h(r7)
            int r4 = r4.size()
            int r3 = defpackage.lb1.b(r4, r4, r5, r3)
            goto L554
        L4cd:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = defpackage.ms0.h(r7)
            int r4 = defpackage.ms0.g(r4)
            goto L130
        L4d9:
            boolean r4 = r13.s(r2, r14)
            if (r4 == 0) goto L554
            int r3 = defpackage.lb1.y(r7, r12, r3)
            goto L554
        L4e5:
            boolean r4 = r13.s(r2, r14)
            if (r4 == 0) goto L554
            int r4 = defpackage.ms0.c(r7)
            goto L4f
        L4f1:
            boolean r4 = r13.s(r2, r14)
            if (r4 == 0) goto L554
            int r4 = defpackage.ms0.d(r7)
            goto L4f
        L4fd:
            boolean r4 = r13.s(r2, r14)
            if (r4 == 0) goto L554
            fh7 r4 = defpackage.gh7.d
            int r4 = r4.g(r8, r14)
            int r5 = defpackage.ms0.h(r7)
            int r4 = defpackage.ms0.f(r4)
            goto L84
        L513:
            boolean r4 = r13.s(r2, r14)
            if (r4 == 0) goto L554
            fh7 r4 = defpackage.gh7.d
            long r4 = r4.h(r8, r14)
            int r6 = defpackage.ms0.h(r7)
            int r4 = defpackage.ms0.j(r4)
            goto L17f
        L529:
            boolean r4 = r13.s(r2, r14)
            if (r4 == 0) goto L554
            fh7 r4 = defpackage.gh7.d
            long r4 = r4.h(r8, r14)
            int r6 = defpackage.ms0.h(r7)
            int r4 = defpackage.ms0.j(r4)
            goto L17f
        L53f:
            boolean r4 = r13.s(r2, r14)
            if (r4 == 0) goto L554
            int r3 = defpackage.lb1.y(r7, r10, r3)
            goto L554
        L54a:
            boolean r4 = r13.s(r2, r14)
            if (r4 == 0) goto L554
            int r3 = defpackage.lb1.y(r7, r11, r3)
        L554:
            int r2 = r2 + 3
            goto L5
        L558:
            ng7 r13 = r13.m
            r13.getClass()
            pr2 r14 = (defpackage.pr2) r14
            mg7 r13 = r14.unknownFields
            int r13 = r13.a()
            int r13 = r13 + r3
            return r13
    }

    public final boolean s(int r7, java.lang.Object r8) {
            r6 = this;
            boolean r0 = r6.g
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto Lf4
            int r6 = r6.P(r7)
            r7 = r6 & r1
            long r0 = (long) r7
            int r6 = O(r6)
            r4 = 0
            switch(r6) {
                case 0: goto Le7;
                case 1: goto Ldb;
                case 2: goto Ld0;
                case 3: goto Lc5;
                case 4: goto Lbc;
                case 5: goto Lb1;
                case 6: goto La8;
                case 7: goto La1;
                case 8: goto L7f;
                case 9: goto L75;
                case 10: goto L67;
                case 11: goto L5d;
                case 12: goto L53;
                case 13: goto L49;
                case 14: goto L3d;
                case 15: goto L33;
                case 16: goto L27;
                case 17: goto L1d;
                default: goto L19;
            }
        L19:
            defpackage.u34.t()
            return r2
        L1d:
            fh7 r6 = defpackage.gh7.d
            java.lang.Object r6 = r6.i(r0, r8)
            if (r6 == 0) goto L10a
            goto L109
        L27:
            fh7 r6 = defpackage.gh7.d
            long r6 = r6.h(r0, r8)
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 == 0) goto L10a
            goto L109
        L33:
            fh7 r6 = defpackage.gh7.d
            int r6 = r6.g(r0, r8)
            if (r6 == 0) goto L10a
            goto L109
        L3d:
            fh7 r6 = defpackage.gh7.d
            long r6 = r6.h(r0, r8)
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 == 0) goto L10a
            goto L109
        L49:
            fh7 r6 = defpackage.gh7.d
            int r6 = r6.g(r0, r8)
            if (r6 == 0) goto L10a
            goto L109
        L53:
            fh7 r6 = defpackage.gh7.d
            int r6 = r6.g(r0, r8)
            if (r6 == 0) goto L10a
            goto L109
        L5d:
            fh7 r6 = defpackage.gh7.d
            int r6 = r6.g(r0, r8)
            if (r6 == 0) goto L10a
            goto L109
        L67:
            ca0 r6 = defpackage.ea0.B
            fh7 r7 = defpackage.gh7.d
            java.lang.Object r7 = r7.i(r0, r8)
            boolean r6 = r6.equals(r7)
            r6 = r6 ^ r3
            return r6
        L75:
            fh7 r6 = defpackage.gh7.d
            java.lang.Object r6 = r6.i(r0, r8)
            if (r6 == 0) goto L10a
            goto L109
        L7f:
            fh7 r6 = defpackage.gh7.d
            java.lang.Object r6 = r6.i(r0, r8)
            boolean r7 = r6 instanceof java.lang.String
            if (r7 == 0) goto L91
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = r6.isEmpty()
            r6 = r6 ^ r3
            return r6
        L91:
            boolean r7 = r6 instanceof defpackage.ea0
            if (r7 == 0) goto L9d
            ca0 r7 = defpackage.ea0.B
            boolean r6 = r7.equals(r6)
            r6 = r6 ^ r3
            return r6
        L9d:
            defpackage.u34.t()
            return r2
        La1:
            fh7 r6 = defpackage.gh7.d
            boolean r6 = r6.c(r0, r8)
            return r6
        La8:
            fh7 r6 = defpackage.gh7.d
            int r6 = r6.g(r0, r8)
            if (r6 == 0) goto L10a
            goto L109
        Lb1:
            fh7 r6 = defpackage.gh7.d
            long r6 = r6.h(r0, r8)
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 == 0) goto L10a
            goto L109
        Lbc:
            fh7 r6 = defpackage.gh7.d
            int r6 = r6.g(r0, r8)
            if (r6 == 0) goto L10a
            goto L109
        Lc5:
            fh7 r6 = defpackage.gh7.d
            long r6 = r6.h(r0, r8)
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 == 0) goto L10a
            goto L109
        Ld0:
            fh7 r6 = defpackage.gh7.d
            long r6 = r6.h(r0, r8)
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 == 0) goto L10a
            goto L109
        Ldb:
            fh7 r6 = defpackage.gh7.d
            float r6 = r6.f(r0, r8)
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 == 0) goto L10a
            goto L109
        Le7:
            fh7 r6 = defpackage.gh7.d
            double r6 = r6.e(r0, r8)
            r0 = 0
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 == 0) goto L10a
            goto L109
        Lf4:
            int r7 = r7 + 2
            int[] r6 = r6.a
            r6 = r6[r7]
            int r7 = r6 >>> 20
            int r7 = r3 << r7
            r6 = r6 & r1
            long r0 = (long) r6
            fh7 r6 = defpackage.gh7.d
            int r6 = r6.g(r0, r8)
            r6 = r6 & r7
            if (r6 == 0) goto L10a
        L109:
            return r3
        L10a:
            return r2
    }

    public final boolean t(java.lang.Object r3, int r4, int r5) {
            r2 = this;
            int r5 = r5 + 2
            int[] r2 = r2.a
            r2 = r2[r5]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r5
            long r0 = (long) r2
            fh7 r2 = defpackage.gh7.d
            int r2 = r2.g(r0, r3)
            if (r2 != r4) goto L15
            r2 = 1
            return r2
        L15:
            r2 = 0
            return r2
    }

    public final void v(int r4, java.lang.Object r5, java.lang.Object r6) {
            r3 = this;
            int r4 = r3.P(r4)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r0
            long r0 = (long) r4
            fh7 r4 = defpackage.gh7.d
            java.lang.Object r4 = r4.i(r0, r5)
            y04 r3 = r3.n
            if (r4 == 0) goto L2b
            r3.getClass()
            r2 = r4
            x04 r2 = (defpackage.x04) r2
            boolean r2 = r2.A
            if (r2 != 0) goto L37
            x04 r2 = defpackage.x04.B
            x04 r2 = r2.c()
            defpackage.y04.b(r2, r4)
            defpackage.gh7.o(r5, r0, r2)
            r4 = r2
            goto L37
        L2b:
            r3.getClass()
            x04 r4 = defpackage.x04.B
            x04 r4 = r4.c()
            defpackage.gh7.o(r5, r0, r4)
        L37:
            r3.getClass()
            x04 r4 = (defpackage.x04) r4
            defpackage.xg6.A(r6)
            r3 = 0
            throw r3
    }

    public final void w(int r5, java.lang.Object r6, java.lang.Object r7) {
            r4 = this;
            int r0 = r4.P(r5)
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r1
            long r0 = (long) r0
            boolean r2 = r4.s(r5, r7)
            if (r2 != 0) goto L10
            goto L31
        L10:
            fh7 r2 = defpackage.gh7.d
            java.lang.Object r3 = r2.i(r0, r6)
            java.lang.Object r7 = r2.i(r0, r7)
            if (r3 == 0) goto L29
            if (r7 == 0) goto L29
            pr2 r7 = defpackage.aa3.c(r3, r7)
            defpackage.gh7.o(r6, r0, r7)
            r4.L(r5, r6)
            return
        L29:
            if (r7 == 0) goto L31
            defpackage.gh7.o(r6, r0, r7)
            r4.L(r5, r6)
        L31:
            return
    }

    public final void x(int r6, java.lang.Object r7, java.lang.Object r8) {
            r5 = this;
            int r0 = r5.P(r6)
            int[] r1 = r5.a
            r1 = r1[r6]
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r2
            long r2 = (long) r0
            boolean r0 = r5.t(r8, r1, r6)
            if (r0 != 0) goto L14
            goto L35
        L14:
            fh7 r0 = defpackage.gh7.d
            java.lang.Object r4 = r0.i(r2, r7)
            java.lang.Object r8 = r0.i(r2, r8)
            if (r4 == 0) goto L2d
            if (r8 == 0) goto L2d
            pr2 r8 = defpackage.aa3.c(r4, r8)
            defpackage.gh7.o(r7, r2, r8)
            r5.M(r7, r1, r6)
            return
        L2d:
            if (r8 == 0) goto L35
            defpackage.gh7.o(r7, r2, r8)
            r5.M(r7, r1, r6)
        L35:
            return
    }
}

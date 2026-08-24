package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b  reason: default package */
/* loaded from: classes.dex */
public abstract class b {
    public static final byte[] a = null;
    public static final long[] b = null;

    static {
            java.lang.String r0 = "0123456789abcdef"
            java.nio.charset.Charset r1 = defpackage.qm0.a
            byte[] r0 = r0.getBytes(r1)
            r0.getClass()
            defpackage.b.a = r0
            r0 = 20
            long[] r0 = new long[r0]
            r0 = {x0018: FILL_ARRAY_DATA  , data: [-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999, 99999999999, 999999999999, 9999999999999, 99999999999999, 999999999999999, 9999999999999999, 99999999999999999, 999999999999999999, 9223372036854775807} // fill-array
            defpackage.b.b = r0
            return
    }

    public static final long a(defpackage.k80 r20, defpackage.da0 r21, long r22, long r24, int r26) {
            r0 = r20
            r1 = r22
            r3 = r24
            r5 = r26
            r21.getClass()
            int r6 = r21.d()
            long r7 = (long) r6
            long r11 = (long) r5
            r9 = 0
            defpackage.hf.D(r7, r9, r11)
            r6 = 0
            if (r5 <= 0) goto L136
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 < 0) goto L12a
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 > 0) goto L111
            long r8 = r0.B
            int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r10 <= 0) goto L29
            r3 = r8
        L29:
            int r10 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r10 != 0) goto L2f
            goto L10e
        L2f:
            o96 r10 = r0.A
            if (r10 != 0) goto L35
            goto L10e
        L35:
            long r13 = r8 - r1
            int r13 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            r16 = r6
            r6 = 1
            if (r13 >= 0) goto La4
        L3e:
            int r7 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r7 <= 0) goto L53
            o96 r10 = r10.g
            r10.getClass()
            int r7 = r10.c
            int r13 = r10.b
            int r7 = r7 - r13
            r24 = 0
            r18 = 1
            long r14 = (long) r7
            long r8 = r8 - r14
            goto L3e
        L53:
            r24 = 0
            r18 = 1
            byte[] r7 = r21.h()
            r13 = r7[r24]
            long r14 = r0.B
            long r14 = r14 - r11
            long r14 = r14 + r18
            long r3 = java.lang.Math.min(r3, r14)
        L66:
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 >= 0) goto L10e
            byte[] r0 = r10.a
            int r11 = r10.c
            int r12 = r10.b
            long r14 = (long) r12
            long r14 = r14 + r3
            long r14 = r14 - r8
            long r11 = (long) r11
            long r11 = java.lang.Math.min(r11, r14)
            int r11 = (int) r11
            int r12 = r10.b
            long r14 = (long) r12
            long r14 = r14 + r1
            long r14 = r14 - r8
            int r1 = (int) r14
        L7f:
            if (r1 >= r11) goto L96
            r2 = r0[r1]
            if (r2 != r13) goto L93
            int r2 = r1 + 1
            boolean r2 = b(r10, r2, r7, r6, r5)
            if (r2 == 0) goto L93
            int r0 = r10.b
            int r1 = r1 - r0
            long r0 = (long) r1
            long r0 = r0 + r8
            return r0
        L93:
            int r1 = r1 + 1
            goto L7f
        L96:
            int r0 = r10.c
            int r1 = r10.b
            int r0 = r0 - r1
            long r0 = (long) r0
            long r8 = r8 + r0
            o96 r10 = r10.f
            r10.getClass()
            r1 = r8
            goto L66
        La4:
            r24 = 0
            r18 = 1
        La8:
            int r7 = r10.c
            int r8 = r10.b
            int r7 = r7 - r8
            long r7 = (long) r7
            long r7 = r16 + r7
            int r9 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r9 > 0) goto Lbc
            o96 r10 = r10.f
            r10.getClass()
            r16 = r7
            goto La8
        Lbc:
            byte[] r7 = r21.h()
            r8 = r7[r24]
            long r13 = r0.B
            long r13 = r13 - r11
            long r13 = r13 + r18
            long r3 = java.lang.Math.min(r3, r13)
        Lcb:
            int r0 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r0 >= 0) goto L10e
            byte[] r0 = r10.a
            int r9 = r10.c
            int r11 = r10.b
            long r11 = (long) r11
            long r11 = r11 + r3
            long r11 = r11 - r16
            long r13 = (long) r9
            long r11 = java.lang.Math.min(r13, r11)
            int r9 = (int) r11
            int r11 = r10.b
            long r11 = (long) r11
            long r11 = r11 + r1
            long r11 = r11 - r16
            int r1 = (int) r11
        Le6:
            if (r1 >= r9) goto Lfe
            r2 = r0[r1]
            if (r2 != r8) goto Lfb
            int r2 = r1 + 1
            boolean r2 = b(r10, r2, r7, r6, r5)
            if (r2 == 0) goto Lfb
            int r0 = r10.b
            int r1 = r1 - r0
            long r0 = (long) r1
            long r0 = r0 + r16
            return r0
        Lfb:
            int r1 = r1 + 1
            goto Le6
        Lfe:
            int r0 = r10.c
            int r1 = r10.b
            int r0 = r0 - r1
            long r0 = (long) r0
            long r16 = r16 + r0
            o96 r10 = r10.f
            r10.getClass()
            r1 = r16
            goto Lcb
        L10e:
            r0 = -1
            return r0
        L111:
            java.lang.String r0 = "fromIndex > toIndex: "
            java.lang.String r5 = " > "
            java.lang.StringBuilder r0 = defpackage.xg6.s(r1, r0, r5)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L12a:
            r16 = r6
            java.lang.String r0 = "fromIndex < 0: "
            java.lang.String r0 = defpackage.lb1.h(r1, r0)
            defpackage.i.f(r0)
            return r16
        L136:
            r16 = r6
            java.lang.String r0 = "byteCount == 0"
            defpackage.i.h(r0)
            return r16
    }

    public static final boolean b(defpackage.o96 r5, int r6, byte[] r7, int r8, int r9) {
            int r0 = r5.c
            byte[] r1 = r5.a
        L4:
            if (r8 >= r9) goto L24
            if (r6 != r0) goto L17
            o96 r5 = r5.f
            r5.getClass()
            byte[] r6 = r5.a
            int r0 = r5.b
            int r1 = r5.c
            r4 = r1
            r1 = r6
            r6 = r0
            r0 = r4
        L17:
            r2 = r1[r6]
            r3 = r7[r8]
            if (r2 == r3) goto L1f
            r5 = 0
            return r5
        L1f:
            int r6 = r6 + 1
            int r8 = r8 + 1
            goto L4
        L24:
            r5 = 1
            return r5
    }

    public static final java.lang.String c(defpackage.k80 r6, long r7) {
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L1e
            long r3 = r7 - r1
            byte r0 = r6.v(r3)
            r5 = 13
            if (r0 != r5) goto L1e
            java.nio.charset.Charset r7 = defpackage.qm0.a
            java.lang.String r7 = r6.a0(r3, r7)
            r0 = 2
            r6.skip(r0)
            return r7
        L1e:
            java.nio.charset.Charset r0 = defpackage.qm0.a
            java.lang.String r7 = r6.a0(r7, r0)
            r6.skip(r1)
            return r7
    }

    public static final int d(defpackage.k80 r16, defpackage.eo4 r17, boolean r18) {
            r17.getClass()
            r0 = r16
            o96 r0 = r0.A
            r1 = -1
            if (r0 != 0) goto Le
            if (r18 == 0) goto Ld
            goto L5c
        Ld:
            return r1
        Le:
            byte[] r2 = r0.a
            int r3 = r0.b
            int r4 = r0.c
            r5 = r17
            int[] r5 = r5.B
            r6 = 0
            r8 = r0
            r9 = r1
            r7 = r6
        L1c:
            int r10 = r7 + 1
            r11 = r5[r7]
            int r7 = r7 + 2
            r10 = r5[r10]
            if (r10 == r1) goto L27
            r9 = r10
        L27:
            if (r8 != 0) goto L2a
            goto L5a
        L2a:
            r10 = 0
            if (r11 >= 0) goto L72
            int r11 = r11 * (-1)
            int r12 = r11 + r7
        L31:
            int r11 = r3 + 1
            r3 = r2[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r13 = r7 + 1
            r7 = r5[r7]
            if (r3 == r7) goto L3e
            goto L7c
        L3e:
            if (r13 != r12) goto L42
            r3 = 1
            goto L43
        L42:
            r3 = r6
        L43:
            if (r11 != r4) goto L62
            r8.getClass()
            o96 r2 = r8.f
            r2.getClass()
            int r4 = r2.b
            byte[] r7 = r2.a
            int r8 = r2.c
            if (r2 != r0) goto L5e
            if (r3 == 0) goto L5a
            r2 = r7
            r7 = r10
            goto L65
        L5a:
            if (r18 == 0) goto L7c
        L5c:
            r0 = -2
            return r0
        L5e:
            r15 = r7
            r7 = r2
            r2 = r15
            goto L65
        L62:
            r7 = r8
            r8 = r4
            r4 = r11
        L65:
            if (r3 == 0) goto L6d
            r3 = r5[r13]
            r15 = r8
            r8 = r7
            r7 = r15
            goto L9e
        L6d:
            r3 = r4
            r4 = r8
            r8 = r7
            r7 = r13
            goto L31
        L72:
            int r12 = r3 + 1
            r3 = r2[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r13 = r7 + r11
        L7a:
            if (r7 != r13) goto L7d
        L7c:
            return r9
        L7d:
            r14 = r5[r7]
            if (r3 != r14) goto La8
            int r7 = r7 + r11
            r3 = r5[r7]
            if (r12 != r4) goto L9c
            o96 r8 = r8.f
            r8.getClass()
            int r2 = r8.b
            byte[] r4 = r8.a
            int r7 = r8.c
            if (r8 != r0) goto L98
            r8 = r4
            r4 = r2
            r2 = r8
            r8 = r10
            goto L9e
        L98:
            r15 = r4
            r4 = r2
            r2 = r15
            goto L9e
        L9c:
            r7 = r4
            r4 = r12
        L9e:
            if (r3 < 0) goto La1
            return r3
        La1:
            int r3 = -r3
            r15 = r7
            r7 = r3
            r3 = r4
            r4 = r15
            goto L1c
        La8:
            int r7 = r7 + 1
            goto L7a
    }
}

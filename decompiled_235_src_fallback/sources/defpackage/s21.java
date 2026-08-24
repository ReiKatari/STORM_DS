package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s21  reason: default package */
/* loaded from: classes.dex */
public abstract class s21 {
    public static final long a(int r4, int r5, int r6, int r7) {
            r0 = 0
            r1 = 1
            if (r5 < r4) goto L6
            r2 = r1
            goto L7
        L6:
            r2 = r0
        L7:
            if (r7 < r6) goto Lb
            r3 = r1
            goto Lc
        Lb:
            r3 = r0
        Lc:
            r2 = r2 & r3
            if (r4 < 0) goto L11
            r3 = r1
            goto L12
        L11:
            r3 = r0
        L12:
            r2 = r2 & r3
            if (r6 < 0) goto L16
            r0 = r1
        L16:
            r0 = r0 & r2
            if (r0 != 0) goto L1e
            java.lang.String r0 = "maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0"
            defpackage.r53.a(r0)
        L1e:
            long r4 = h(r4, r5, r6, r7)
            return r4
    }

    public static /* synthetic */ long b(int r3, int r4, int r5, int r6, int r7) {
            r0 = r7 & 1
            r1 = 0
            if (r0 == 0) goto L6
            r3 = r1
        L6:
            r0 = r7 & 2
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == 0) goto Le
            r4 = r2
        Le:
            r0 = r7 & 4
            if (r0 == 0) goto L13
            r5 = r1
        L13:
            r7 = r7 & 8
            if (r7 == 0) goto L18
            r6 = r2
        L18:
            long r3 = a(r3, r4, r5, r6)
            return r3
    }

    public static final int c(int r1) {
            r0 = 8191(0x1fff, float:1.1478E-41)
            if (r1 >= r0) goto L7
            r1 = 13
            return r1
        L7:
            r0 = 32767(0x7fff, float:4.5916E-41)
            if (r1 >= r0) goto Le
            r1 = 15
            return r1
        Le:
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r1 >= r0) goto L16
            r1 = 16
            return r1
        L16:
            r0 = 262143(0x3ffff, float:3.6734E-40)
            if (r1 >= r0) goto L1e
            r1 = 18
            return r1
        L1e:
            r1 = 255(0xff, float:3.57E-43)
            return r1
    }

    public static final long d(long r5, long r7) {
            r0 = 32
            long r1 = r7 >> r0
            int r1 = (int) r1
            int r2 = defpackage.q21.j(r5)
            int r3 = defpackage.q21.h(r5)
            if (r1 >= r2) goto L10
            r1 = r2
        L10:
            if (r1 <= r3) goto L13
            goto L14
        L13:
            r3 = r1
        L14:
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r1
            int r7 = (int) r7
            int r8 = defpackage.q21.i(r5)
            int r5 = defpackage.q21.g(r5)
            if (r7 >= r8) goto L26
            r7 = r8
        L26:
            if (r7 <= r5) goto L29
            goto L2a
        L29:
            r5 = r7
        L2a:
            long r6 = (long) r3
            long r6 = r6 << r0
            long r3 = (long) r5
            long r0 = r3 & r1
            long r5 = r6 | r0
            return r5
    }

    public static final long e(long r4, long r6) {
            int r0 = defpackage.q21.j(r4)
            int r1 = defpackage.q21.h(r4)
            int r2 = defpackage.q21.i(r4)
            int r4 = defpackage.q21.g(r4)
            int r5 = defpackage.q21.j(r6)
            if (r5 >= r0) goto L17
            r5 = r0
        L17:
            if (r5 <= r1) goto L1a
            r5 = r1
        L1a:
            int r3 = defpackage.q21.h(r6)
            if (r3 >= r0) goto L21
            goto L22
        L21:
            r0 = r3
        L22:
            if (r0 <= r1) goto L25
            goto L26
        L25:
            r1 = r0
        L26:
            int r0 = defpackage.q21.i(r6)
            if (r0 >= r2) goto L2d
            r0 = r2
        L2d:
            if (r0 <= r4) goto L30
            r0 = r4
        L30:
            int r6 = defpackage.q21.g(r6)
            if (r6 >= r2) goto L37
            goto L38
        L37:
            r2 = r6
        L38:
            if (r2 <= r4) goto L3b
            goto L3c
        L3b:
            r4 = r2
        L3c:
            long r4 = a(r5, r1, r0, r4)
            return r4
    }

    public static final int f(int r1, long r2) {
            int r0 = defpackage.q21.i(r2)
            int r2 = defpackage.q21.g(r2)
            if (r1 >= r0) goto Lb
            r1 = r0
        Lb:
            if (r1 <= r2) goto Le
            return r2
        Le:
            return r1
    }

    public static final int g(int r1, long r2) {
            int r0 = defpackage.q21.j(r2)
            int r2 = defpackage.q21.h(r2)
            if (r1 >= r0) goto Lb
            r1 = r0
        Lb:
            if (r1 <= r2) goto Le
            return r2
        Le:
            return r1
    }

    public static final long h(int r6, int r7, int r8, int r9) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r9 != r0) goto L7
            r1 = r8
            goto L8
        L7:
            r1 = r9
        L8:
            int r2 = c(r1)
            if (r7 != r0) goto L10
            r0 = r6
            goto L11
        L10:
            r0 = r7
        L11:
            int r3 = c(r0)
            int r2 = r2 + r3
            r4 = 31
            if (r2 <= r4) goto L1d
            j(r0, r1)
        L1d:
            int r7 = r7 + 1
            int r0 = r7 >> 31
            int r0 = ~r0
            r7 = r7 & r0
            int r9 = r9 + 1
            int r0 = r9 >> 31
            int r0 = ~r0
            r9 = r9 & r0
            int r0 = r3 + (-13)
            int r1 = r0 >> 1
            r0 = r0 & 1
            int r1 = r1 + r0
            int r0 = r3 + 2
            int r3 = r3 + 33
            long r1 = (long) r1
            long r4 = (long) r6
            r6 = 2
            long r4 = r4 << r6
            long r1 = r1 | r4
            long r6 = (long) r7
            r4 = 33
            long r6 = r6 << r4
            long r6 = r6 | r1
            long r1 = (long) r8
            long r0 = r1 << r0
            long r6 = r6 | r0
            long r8 = (long) r9
            long r8 = r8 << r3
            long r6 = r6 | r8
            return r6
    }

    public static final long i(long r4, int r6, int r7) {
            int r0 = defpackage.q21.j(r4)
            int r0 = r0 + r6
            r1 = 0
            if (r0 >= 0) goto L9
            r0 = r1
        L9:
            int r2 = defpackage.q21.h(r4)
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r3) goto L13
            goto L17
        L13:
            int r2 = r2 + r6
            if (r2 >= 0) goto L17
            r2 = r1
        L17:
            int r6 = defpackage.q21.i(r4)
            int r6 = r6 + r7
            if (r6 >= 0) goto L1f
            r6 = r1
        L1f:
            int r4 = defpackage.q21.g(r4)
            if (r4 != r3) goto L27
        L25:
            r1 = r4
            goto L2a
        L27:
            int r4 = r4 + r7
            if (r4 >= 0) goto L25
        L2a:
            long r4 = a(r0, r2, r6, r1)
            return r4
    }

    public static final void j(int r4, int r5) {
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = " and height of "
            java.lang.String r2 = " in Constraints"
            java.lang.String r3 = "Can't represent a width of "
            java.lang.String r4 = defpackage.xg6.m(r4, r5, r3, r1, r2)
            r0.<init>(r4)
            throw r0
    }

    public static final java.lang.Void k(int r3) {
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Can't represent a size of "
            java.lang.String r2 = " in Constraints"
            java.lang.String r3 = defpackage.lb1.k(r1, r3, r2)
            r0.<init>(r3)
            throw r0
    }
}

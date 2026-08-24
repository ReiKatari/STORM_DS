package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q21  reason: default package */
/* loaded from: classes.dex */
public final class q21 {
    public final long a;

    public /* synthetic */ q21(long r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static long a(long r1, int r3, int r4, int r5, int r6, int r7) {
            r0 = r7 & 1
            if (r0 == 0) goto L8
            int r3 = j(r1)
        L8:
            r0 = r7 & 2
            if (r0 == 0) goto L10
            int r4 = h(r1)
        L10:
            r0 = r7 & 4
            if (r0 == 0) goto L18
            int r5 = i(r1)
        L18:
            r7 = r7 & 8
            if (r7 == 0) goto L20
            int r6 = g(r1)
        L20:
            if (r4 < r3) goto L29
            if (r6 < r5) goto L29
            if (r3 < 0) goto L29
            if (r5 < 0) goto L29
            goto L2e
        L29:
            java.lang.String r1 = "maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0"
            defpackage.r53.a(r1)
        L2e:
            long r1 = defpackage.s21.h(r3, r4, r5, r6)
            return r1
    }

    public static final boolean b(long r0, long r2) {
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public static final boolean c(long r3) {
            r0 = 3
            long r0 = r0 & r3
            int r0 = (int) r0
            r1 = r0 & 1
            r2 = 1
            int r1 = r1 << r2
            r0 = r0 & 2
            int r0 = r0 >> r2
            int r0 = r0 * 3
            int r0 = r0 + r1
            int r1 = 18 - r0
            int r1 = r2 << r1
            int r1 = r1 - r2
            int r0 = r0 + 46
            long r3 = r3 >> r0
            int r3 = (int) r3
            r3 = r3 & r1
            if (r3 == 0) goto L1b
            return r2
        L1b:
            r3 = 0
            return r3
    }

    public static final boolean d(long r3) {
            r0 = 3
            long r0 = r0 & r3
            int r0 = (int) r0
            r1 = r0 & 1
            r2 = 1
            int r1 = r1 << r2
            r0 = r0 & 2
            int r0 = r0 >> r2
            int r0 = r0 * 3
            int r0 = r0 + r1
            int r0 = r0 + 13
            int r0 = r2 << r0
            int r0 = r0 - r2
            r1 = 33
            long r3 = r3 >> r1
            int r3 = (int) r3
            r3 = r3 & r0
            if (r3 == 0) goto L1b
            return r2
        L1b:
            r3 = 0
            return r3
    }

    public static final boolean e(long r5) {
            r0 = 3
            long r0 = r0 & r5
            int r0 = (int) r0
            r1 = r0 & 1
            r2 = 1
            int r1 = r1 << r2
            r0 = r0 & 2
            int r0 = r0 >> r2
            int r0 = r0 * 3
            int r0 = r0 + r1
            int r1 = 18 - r0
            int r1 = r2 << r1
            int r1 = r1 - r2
            int r3 = r0 + 15
            long r3 = r5 >> r3
            int r3 = (int) r3
            r3 = r3 & r1
            int r0 = r0 + 46
            long r5 = r5 >> r0
            int r5 = (int) r5
            r5 = r5 & r1
            if (r5 != 0) goto L24
            r5 = 2147483647(0x7fffffff, float:NaN)
            goto L25
        L24:
            int r5 = r5 - r2
        L25:
            if (r3 != r5) goto L28
            return r2
        L28:
            r5 = 0
            return r5
    }

    public static final boolean f(long r5) {
            r0 = 3
            long r0 = r0 & r5
            int r0 = (int) r0
            r1 = r0 & 1
            r2 = 1
            int r1 = r1 << r2
            r3 = 2
            r0 = r0 & r3
            int r0 = r0 >> r2
            int r0 = r0 * 3
            int r0 = r0 + r1
            int r0 = r0 + 13
            int r0 = r2 << r0
            int r0 = r0 - r2
            long r3 = r5 >> r3
            int r1 = (int) r3
            r1 = r1 & r0
            r3 = 33
            long r5 = r5 >> r3
            int r5 = (int) r5
            r5 = r5 & r0
            if (r5 != 0) goto L22
            r5 = 2147483647(0x7fffffff, float:NaN)
            goto L23
        L22:
            int r5 = r5 - r2
        L23:
            if (r1 != r5) goto L26
            return r2
        L26:
            r5 = 0
            return r5
    }

    public static final int g(long r3) {
            r0 = 3
            long r0 = r0 & r3
            int r0 = (int) r0
            r1 = r0 & 1
            r2 = 1
            int r1 = r1 << r2
            r0 = r0 & 2
            int r0 = r0 >> r2
            int r0 = r0 * 3
            int r0 = r0 + r1
            int r1 = 18 - r0
            int r1 = r2 << r1
            int r1 = r1 - r2
            int r0 = r0 + 46
            long r3 = r3 >> r0
            int r3 = (int) r3
            r3 = r3 & r1
            if (r3 != 0) goto L1e
            r3 = 2147483647(0x7fffffff, float:NaN)
            return r3
        L1e:
            int r3 = r3 - r2
            return r3
    }

    public static final int h(long r3) {
            r0 = 3
            long r0 = r0 & r3
            int r0 = (int) r0
            r1 = r0 & 1
            r2 = 1
            int r1 = r1 << r2
            r0 = r0 & 2
            int r0 = r0 >> r2
            int r0 = r0 * 3
            int r0 = r0 + r1
            int r0 = r0 + 13
            int r0 = r2 << r0
            int r0 = r0 - r2
            r1 = 33
            long r3 = r3 >> r1
            int r3 = (int) r3
            r3 = r3 & r0
            if (r3 != 0) goto L1e
            r3 = 2147483647(0x7fffffff, float:NaN)
            return r3
        L1e:
            int r3 = r3 - r2
            return r3
    }

    public static final int i(long r3) {
            r0 = 3
            long r0 = r0 & r3
            int r0 = (int) r0
            r1 = r0 & 1
            r2 = 1
            int r1 = r1 << r2
            r0 = r0 & 2
            int r0 = r0 >> r2
            int r0 = r0 * 3
            int r0 = r0 + r1
            int r1 = 18 - r0
            int r1 = r2 << r1
            int r1 = r1 - r2
            int r0 = r0 + 15
            long r3 = r3 >> r0
            int r3 = (int) r3
            r3 = r3 & r1
            return r3
    }

    public static final int j(long r4) {
            r0 = 3
            long r0 = r0 & r4
            int r0 = (int) r0
            r1 = r0 & 1
            r2 = 1
            int r1 = r1 << r2
            r3 = 2
            r0 = r0 & r3
            int r0 = r0 >> r2
            int r0 = r0 * 3
            int r0 = r0 + r1
            int r0 = r0 + 13
            int r0 = r2 << r0
            int r0 = r0 - r2
            long r4 = r4 >> r3
            int r4 = (int) r4
            r4 = r4 & r0
            return r4
    }

    public static java.lang.String k(long r4) {
            int r0 = h(r4)
            java.lang.String r1 = "Infinity"
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != r2) goto Ld
            r0 = r1
            goto L11
        Ld:
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L11:
            int r3 = g(r4)
            if (r3 != r2) goto L18
            goto L1c
        L18:
            java.lang.String r1 = java.lang.String.valueOf(r3)
        L1c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Constraints(minWidth = "
            r2.<init>(r3)
            int r3 = j(r4)
            r2.append(r3)
            java.lang.String r3 = ", maxWidth = "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ", minHeight = "
            r2.append(r0)
            int r4 = i(r4)
            r2.append(r4)
            java.lang.String r4 = ", maxHeight = "
            r2.append(r4)
            r4 = 41
            java.lang.String r4 = defpackage.lb1.q(r2, r1, r4)
            return r4
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.q21
            if (r0 != 0) goto L5
            goto Lf
        L5:
            q21 r3 = (defpackage.q21) r3
            long r0 = r3.a
            long r2 = r2.a
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 == 0) goto L11
        Lf:
            r2 = 0
            return r2
        L11:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            long r0 = r2.a
            int r2 = java.lang.Long.hashCode(r0)
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            long r0 = r2.a
            java.lang.String r2 = k(r0)
            return r2
    }
}

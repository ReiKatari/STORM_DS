package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ng7  reason: default package */
/* loaded from: classes.dex */
public final class ng7 {
    public static boolean a(java.lang.Object r8, defpackage.ls0 r9) {
            int r0 = r9.h()
            int r1 = r0 >>> 3
            r0 = r0 & 7
            r2 = 1
            r3 = 3
            if (r0 == 0) goto L7d
            if (r0 == r2) goto L6c
            r4 = 2
            if (r0 == r4) goto L5f
            r4 = 0
            if (r0 == r3) goto L31
            r5 = 4
            if (r0 == r5) goto L30
            r4 = 5
            if (r0 != r4) goto L2b
            int r9 = r9.q()
            mg7 r8 = (defpackage.mg7) r8
            int r0 = r1 << 3
            r0 = r0 | r4
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8.c(r0, r9)
            return r2
        L2b:
            tb3 r8 = defpackage.ub3.b()
            throw r8
        L30:
            return r4
        L31:
            mg7 r0 = defpackage.mg7.b()
            int r1 = r1 << r3
            r5 = r1 | 4
        L38:
            int r6 = r9.e()
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == r7) goto L47
            boolean r6 = a(r0, r9)
            if (r6 != 0) goto L38
        L47:
            int r9 = r9.h()
            if (r5 != r9) goto L57
            r0.e = r4
            mg7 r8 = (defpackage.mg7) r8
            r9 = r1 | 3
            r8.c(r9, r0)
            return r2
        L57:
            ub3 r8 = new ub3
            java.lang.String r9 = "Protocol message end-group tag did not match expected tag."
            r8.<init>(r9)
            throw r8
        L5f:
            ca0 r9 = r9.k()
            mg7 r8 = (defpackage.mg7) r8
            int r0 = r1 << 3
            r0 = r0 | r4
            r8.c(r0, r9)
            return r2
        L6c:
            long r4 = r9.s()
            mg7 r8 = (defpackage.mg7) r8
            int r9 = r1 << 3
            r9 = r9 | r2
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r8.c(r9, r0)
            return r2
        L7d:
            long r4 = r9.B()
            mg7 r8 = (defpackage.mg7) r8
            int r9 = r1 << 3
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r8.c(r9, r0)
            return r2
    }
}

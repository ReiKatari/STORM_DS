package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i93  reason: default package */
/* loaded from: classes.dex */
public final class i93 {
    public final long a;

    public /* synthetic */ i93(long r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static final boolean a(long r0, long r2) {
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public static final long b(long r4, long r6) {
            r0 = 32
            long r1 = r4 >> r0
            int r1 = (int) r1
            long r2 = r6 >> r0
            int r2 = (int) r2
            int r1 = r1 - r2
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r2
            int r4 = (int) r4
            long r5 = r6 & r2
            int r5 = (int) r5
            int r4 = r4 - r5
            long r5 = (long) r1
            long r5 = r5 << r0
            long r0 = (long) r4
            long r0 = r0 & r2
            long r4 = r5 | r0
            return r4
    }

    public static final long c(long r4, long r6) {
            r0 = 32
            long r1 = r4 >> r0
            int r1 = (int) r1
            long r2 = r6 >> r0
            int r2 = (int) r2
            int r1 = r1 + r2
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r2
            int r4 = (int) r4
            long r5 = r6 & r2
            int r5 = (int) r5
            int r4 = r4 + r5
            long r5 = (long) r1
            long r5 = r5 << r0
            long r0 = (long) r4
            long r0 = r0 & r2
            long r4 = r5 | r0
            return r4
    }

    public static java.lang.String d(long r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "("
            r0.<init>(r1)
            r1 = 32
            long r1 = r3 >> r1
            int r1 = (int) r1
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r1
            int r3 = (int) r3
            r4 = 41
            java.lang.String r3 = defpackage.xg6.q(r0, r3, r4)
            return r3
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.i93
            if (r0 != 0) goto L5
            goto Lf
        L5:
            i93 r3 = (defpackage.i93) r3
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
            java.lang.String r2 = d(r0)
            return r2
    }
}

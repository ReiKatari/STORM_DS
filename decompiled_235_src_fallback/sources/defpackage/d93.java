package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d93  reason: default package */
/* loaded from: classes.dex */
public final class d93 {
    public final long a;

    public /* synthetic */ d93(long r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static long a(int r4, int r5) {
            long r0 = (long) r4
            r4 = 32
            long r0 = r0 << r4
            long r4 = (long) r5
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r2
            long r4 = r4 | r0
            return r4
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.d93
            if (r0 != 0) goto L5
            goto Lf
        L5:
            d93 r3 = (defpackage.d93) r3
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
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "("
            r0.<init>(r1)
            r1 = 32
            long r2 = r6.a
            long r4 = r2 >> r1
            int r6 = (int) r4
            r0.append(r6)
            java.lang.String r6 = ", "
            r0.append(r6)
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r2 & r4
            int r6 = (int) r1
            r1 = 41
            java.lang.String r6 = defpackage.xg6.q(r0, r6, r1)
            return r6
    }
}

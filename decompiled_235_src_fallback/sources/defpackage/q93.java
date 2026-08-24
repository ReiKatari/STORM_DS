package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q93  reason: default package */
/* loaded from: classes.dex */
public final class q93 {
    public final long a;

    public /* synthetic */ q93(long r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static boolean a(long r4, java.lang.Object r6) {
            boolean r0 = r6 instanceof defpackage.q93
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            q93 r6 = (defpackage.q93) r6
            long r2 = r6.a
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto Lf
            return r1
        Lf:
            r4 = 1
            return r4
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

    public static java.lang.String c(long r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 32
            long r1 = r3 >> r1
            int r1 = (int) r1
            r0.append(r1)
            java.lang.String r1 = " x "
            r0.append(r1)
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r1
            int r3 = (int) r3
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            long r0 = r2.a
            boolean r2 = a(r0, r3)
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
            java.lang.String r2 = c(r0)
            return r2
    }
}

package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k47  reason: default package */
/* loaded from: classes.dex */
public final class k47 {
    public static final long b = 0;
    public static final /* synthetic */ int c = 0;
    public final long a;

    static {
            r0 = 0
            long r0 = defpackage.jx2.f(r0, r0)
            defpackage.k47.b = r0
            return
    }

    public /* synthetic */ k47(long r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static boolean a(long r4, java.lang.Object r6) {
            boolean r0 = r6 instanceof defpackage.k47
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            k47 r6 = (defpackage.k47) r6
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

    public static final boolean c(long r3) {
            r0 = 32
            long r0 = r3 >> r0
            int r0 = (int) r0
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r1
            int r3 = (int) r3
            if (r0 != r3) goto L10
            r3 = 1
            return r3
        L10:
            r3 = 0
            return r3
    }

    public static final int d(long r1) {
            int r0 = e(r1)
            int r1 = f(r1)
            int r0 = r0 - r1
            return r0
    }

    public static final int e(long r3) {
            r0 = 32
            long r0 = r3 >> r0
            int r0 = (int) r0
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r1
            int r3 = (int) r3
            int r3 = java.lang.Math.max(r0, r3)
            return r3
    }

    public static final int f(long r3) {
            r0 = 32
            long r0 = r3 >> r0
            int r0 = (int) r0
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r1
            int r3 = (int) r3
            int r3 = java.lang.Math.min(r0, r3)
            return r3
    }

    public static final boolean g(long r3) {
            r0 = 32
            long r0 = r3 >> r0
            int r0 = (int) r0
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r1
            int r3 = (int) r3
            if (r0 <= r3) goto L10
            r3 = 1
            return r3
        L10:
            r3 = 0
            return r3
    }

    public static java.lang.String h(long r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TextRange("
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
            java.lang.String r2 = h(r0)
            return r2
    }
}

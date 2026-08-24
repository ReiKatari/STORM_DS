package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x47  reason: default package */
/* loaded from: classes.dex */
public final class x47 {
    public static final defpackage.y47[] b = null;
    public static final long c = 0;
    public final long a;

    static {
            y47 r0 = new y47
            r1 = 0
            r0.<init>(r1)
            y47 r3 = new y47
            r4 = 4294967296(0x100000000, double:2.121995791E-314)
            r3.<init>(r4)
            y47 r4 = new y47
            r5 = 8589934592(0x200000000, double:4.243991582E-314)
            r4.<init>(r5)
            y47[] r0 = new defpackage.y47[]{r0, r3, r4}
            defpackage.x47.b = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            long r0 = defpackage.hi2.J(r0, r1)
            defpackage.x47.c = r0
            return
    }

    public /* synthetic */ x47(long r1) {
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

    public static final long b(long r2) {
            r0 = 1095216660480(0xff00000000, double:5.41108926696E-312)
            long r2 = r2 & r0
            r0 = 32
            long r2 = r2 >>> r0
            int r2 = (int) r2
            y47[] r3 = defpackage.x47.b
            r2 = r3[r2]
            long r2 = r2.a
            return r2
    }

    public static final float c(long r2) {
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            return r2
    }

    public static java.lang.String d(long r4) {
            long r0 = b(r4)
            r2 = 0
            boolean r2 = defpackage.y47.a(r0, r2)
            if (r2 == 0) goto Lf
            java.lang.String r4 = "Unspecified"
            return r4
        Lf:
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r2 = defpackage.y47.a(r0, r2)
            if (r2 == 0) goto L30
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            float r4 = c(r4)
            r0.append(r4)
            java.lang.String r4 = ".sp"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
        L30:
            r2 = 8589934592(0x200000000, double:4.243991582E-314)
            boolean r0 = defpackage.y47.a(r0, r2)
            if (r0 == 0) goto L51
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            float r4 = c(r4)
            r0.append(r4)
            java.lang.String r4 = ".em"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
        L51:
            java.lang.String r4 = "Invalid"
            return r4
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.x47
            if (r0 != 0) goto L5
            goto Lf
        L5:
            x47 r3 = (defpackage.x47) r3
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

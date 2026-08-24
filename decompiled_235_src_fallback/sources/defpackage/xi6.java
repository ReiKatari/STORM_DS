package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xi6  reason: default package */
/* loaded from: classes.dex */
public final class xi6 {
    public final long a;

    public /* synthetic */ xi6(long r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static long a(float r4, long r5) {
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r0
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            long r2 = (long) r4
            int r4 = java.lang.Float.floatToRawIntBits(r5)
            long r4 = (long) r4
            r6 = 32
            long r2 = r2 << r6
            long r4 = r4 & r0
            long r4 = r4 | r2
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

    public static final float c(long r2) {
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            return r2
    }

    public static final float d(long r4) {
            r0 = 32
            long r0 = r4 >> r0
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r0 = r0 & r2
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            long r4 = r4 & r2
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            float r4 = java.lang.Math.min(r0, r4)
            return r4
    }

    public static final float e(long r1) {
            r0 = 32
            long r1 = r1 >> r0
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            return r1
    }

    public static final boolean f(long r7) {
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 != 0) goto Ld
            r0 = r2
            goto Le
        Ld:
            r0 = r1
        Le:
            r3 = 32
            long r3 = r7 >> r3
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 > 0) goto L1e
            r3 = r2
            goto L1f
        L1e:
            r3 = r1
        L1f:
            r0 = r0 | r3
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r5
            int r7 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r7)
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 > 0) goto L30
            r1 = r2
        L30:
            r7 = r0 | r1
            return r7
    }

    public static java.lang.String g(long r3) {
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L41
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Size("
            r0.<init>(r1)
            r1 = 32
            long r1 = r3 >> r1
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            java.lang.String r1 = defpackage.gi2.Q(r1)
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r1
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            java.lang.String r3 = defpackage.gi2.Q(r3)
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
        L41:
            java.lang.String r3 = "Size.Unspecified"
            return r3
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.xi6
            if (r0 != 0) goto L5
            goto Lf
        L5:
            xi6 r3 = (defpackage.xi6) r3
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
            java.lang.String r2 = g(r0)
            return r2
    }
}

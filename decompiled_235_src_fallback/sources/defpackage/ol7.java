package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ol7  reason: default package */
/* loaded from: classes.dex */
public final class ol7 {
    public final long a;

    public /* synthetic */ ol7(long r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static long a(long r4, float r6, float r7, int r8) {
            r0 = r8 & 1
            r1 = 32
            if (r0 == 0) goto Ld
            long r2 = r4 >> r1
            int r6 = (int) r2
            float r6 = java.lang.Float.intBitsToFloat(r6)
        Ld:
            r8 = r8 & 2
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r8 == 0) goto L1c
            long r4 = r4 & r2
            int r4 = (int) r4
            float r7 = java.lang.Float.intBitsToFloat(r4)
        L1c:
            int r4 = java.lang.Float.floatToRawIntBits(r6)
            long r4 = (long) r4
            int r6 = java.lang.Float.floatToRawIntBits(r7)
            long r6 = (long) r6
            long r4 = r4 << r1
            long r6 = r6 & r2
            long r4 = r4 | r6
            return r4
    }

    public static final float b(long r1) {
            r0 = 32
            long r1 = r1 >> r0
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            return r1
    }

    public static final float c(long r2) {
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            return r2
    }

    public static final long d(long r6, long r8) {
            r0 = 32
            long r1 = r6 >> r0
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            long r2 = r8 >> r0
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            float r1 = r1 - r2
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r2
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            long r7 = r8 & r2
            int r7 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r7)
            float r6 = r6 - r7
            int r7 = java.lang.Float.floatToRawIntBits(r1)
            long r7 = (long) r7
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            long r4 = (long) r6
            long r6 = r7 << r0
            long r8 = r4 & r2
            long r6 = r6 | r8
            return r6
    }

    public static final long e(long r5, long r7) {
            r0 = 32
            long r1 = r5 >> r0
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            long r2 = r7 >> r0
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            float r2 = r2 + r1
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r3
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            long r6 = r7 & r3
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            float r6 = r6 + r5
            int r5 = java.lang.Float.floatToRawIntBits(r2)
            long r7 = (long) r5
            int r5 = java.lang.Float.floatToRawIntBits(r6)
            long r5 = (long) r5
            long r7 = r7 << r0
            long r5 = r5 & r3
            long r5 = r5 | r7
            return r5
    }

    public static final long f(float r6, long r7) {
            r0 = 32
            long r1 = r7 >> r0
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r1 = r1 * r6
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r2
            int r7 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r7)
            float r7 = r7 * r6
            int r6 = java.lang.Float.floatToRawIntBits(r1)
            long r4 = (long) r6
            int r6 = java.lang.Float.floatToRawIntBits(r7)
            long r6 = (long) r6
            long r0 = r4 << r0
            long r6 = r6 & r2
            long r6 = r6 | r0
            return r6
    }

    public static java.lang.String g(long r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "("
            r0.<init>(r1)
            float r1 = b(r2)
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            float r2 = c(r2)
            r0.append(r2)
            java.lang.String r2 = ") px/sec"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.ol7
            if (r0 != 0) goto L5
            goto Lf
        L5:
            ol7 r3 = (defpackage.ol7) r3
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

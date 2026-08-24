package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sm1  reason: default package */
/* loaded from: classes.dex */
public final class sm1 {
    public final long a;

    public /* synthetic */ sm1(long r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static final float a(long r2) {
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            return r2
    }

    public static final float b(long r1) {
            r0 = 32
            long r1 = r1 >> r0
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            return r1
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.sm1
            if (r0 != 0) goto L5
            goto Lf
        L5:
            sm1 r3 = (defpackage.sm1) r3
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
            r4 = this;
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            long r2 = r4.a
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L30
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            float r0 = b(r2)
            java.lang.String r0 = defpackage.om1.c(r0)
            r4.append(r0)
            java.lang.String r0 = " x "
            r4.append(r0)
            float r0 = a(r2)
            java.lang.String r0 = defpackage.om1.c(r0)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            return r4
        L30:
            java.lang.String r4 = "DpSize.Unspecified"
            return r4
    }
}

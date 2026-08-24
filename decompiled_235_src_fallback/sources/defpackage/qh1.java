package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qh1  reason: default package */
/* loaded from: classes.dex */
public interface qh1 {
    default long M(float r1) {
            r0 = this;
            float r1 = r0.T(r1)
            long r0 = r0.p(r1)
            return r0
    }

    default float Q(int r1) {
            r0 = this;
            float r1 = (float) r1
            float r0 = r0.a()
            float r1 = r1 / r0
            return r1
    }

    default float T(float r1) {
            r0 = this;
            float r0 = r0.a()
            float r1 = r1 / r0
            return r1
    }

    float Y();

    float a();

    default float e0(float r1) {
            r0 = this;
            float r0 = r0.a()
            float r0 = r0 * r1
            return r0
    }

    default int k0(long r1) {
            r0 = this;
            float r0 = r0.y0(r1)
            int r0 = java.lang.Math.round(r0)
            return r0
    }

    default long p(float r4) {
            r3 = this;
            float[] r0 = defpackage.gj2.a
            float r0 = r3.Y()
            r1 = 1065604874(0x3f83d70a, float:1.03)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r1 = 4294967296(0x100000000, double:2.121995791E-314)
            if (r0 < 0) goto L2c
            float r0 = r3.Y()
            fj2 r0 = defpackage.gj2.a(r0)
            if (r0 == 0) goto L21
            float r3 = r0.a(r4)
            goto L27
        L21:
            float r3 = r3.Y()
            float r3 = r4 / r3
        L27:
            long r3 = defpackage.hi2.J(r3, r1)
            return r3
        L2c:
            float r3 = r3.Y()
            float r4 = r4 / r3
            long r3 = defpackage.hi2.J(r4, r1)
            return r3
    }

    default long q(long r4) {
            r3 = this;
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 == 0) goto L2a
            r0 = 32
            long r0 = r4 >> r0
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            float r0 = r3.T(r0)
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r1
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            float r3 = r3.T(r4)
            long r3 = defpackage.nc1.f(r0, r3)
            return r3
        L2a:
            return r0
    }

    default int r0(float r1) {
            r0 = this;
            float r0 = r0.e0(r1)
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 == 0) goto Le
            r0 = 2147483647(0x7fffffff, float:NaN)
            return r0
        Le:
            int r0 = java.lang.Math.round(r0)
            return r0
    }

    default long v0(long r5) {
            r4 = this;
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 == 0) goto L2f
            float r0 = defpackage.sm1.b(r5)
            float r0 = r4.e0(r0)
            float r5 = defpackage.sm1.a(r5)
            float r4 = r4.e0(r5)
            int r5 = java.lang.Float.floatToRawIntBits(r0)
            long r5 = (long) r5
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            long r0 = (long) r4
            r4 = 32
            long r4 = r5 << r4
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r4 = r4 | r0
            return r4
        L2f:
            return r0
    }

    default float x(long r5) {
            r4 = this;
            long r0 = defpackage.x47.b(r5)
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r0 = defpackage.y47.a(r0, r2)
            if (r0 != 0) goto L14
            java.lang.String r0 = "Only Sp can convert to Px"
            defpackage.r53.b(r0)
        L14:
            float[] r0 = defpackage.gj2.a
            float r0 = r4.Y()
            r1 = 1065604874(0x3f83d70a, float:1.03)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L3e
            float r0 = r4.Y()
            fj2 r0 = defpackage.gj2.a(r0)
            if (r0 != 0) goto L35
            float r5 = defpackage.x47.c(r5)
            float r4 = r4.Y()
            float r4 = r4 * r5
            return r4
        L35:
            float r4 = defpackage.x47.c(r5)
            float r4 = r0.b(r4)
            return r4
        L3e:
            float r5 = defpackage.x47.c(r5)
            float r4 = r4.Y()
            float r4 = r4 * r5
            return r4
    }

    default float y0(long r5) {
            r4 = this;
            long r0 = defpackage.x47.b(r5)
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r0 = defpackage.y47.a(r0, r2)
            if (r0 != 0) goto L14
            java.lang.String r0 = "Only Sp can convert to Px"
            defpackage.r53.b(r0)
        L14:
            float r5 = r4.x(r5)
            float r4 = r4.e0(r5)
            return r4
    }
}

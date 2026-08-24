package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: te1  reason: default package */
/* loaded from: classes.dex */
public final class te1 implements defpackage.ae4 {
    public final defpackage.ue1 A;
    public final defpackage.lo4 B;

    public te1(defpackage.ue1 r1, defpackage.lo4 r2) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            return
    }

    @Override // defpackage.ae4
    public final long N(int r11, long r12) {
            r10 = this;
            r0 = 1
            if (r11 != r0) goto La0
            ue1 r11 = r10.A
            float r0 = r11.l()
            float r0 = java.lang.Math.abs(r0)
            double r0 = (double) r0
            r2 = 4517329193108106637(0x3eb0c6f7a0b5ed8d, double:1.0E-6)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto La0
            lo4 r0 = defpackage.lo4.Horizontal
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r3 = 32
            lo4 r10 = r10.B
            if (r10 != r0) goto L2c
            long r4 = r12 >> r3
        L26:
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            goto L2f
        L2c:
            long r4 = r12 & r1
            goto L26
        L2f:
            float r4 = java.lang.Math.abs(r4)
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto La0
            cr4 r4 = r11.m()
            float r6 = r11.l()
            int r7 = r11.o()
            float r7 = (float) r7
            float r6 = r6 * r7
            int r7 = r4.b
            int r4 = r4.c
            int r7 = r7 + r4
            float r4 = (float) r7
            float r7 = r11.l()
            float r7 = java.lang.Math.signum(r7)
            float r7 = -r7
            float r4 = r4 * r7
            float r4 = r4 + r6
            float r7 = r11.l()
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 <= 0) goto L62
            r9 = r6
            r6 = r4
            r4 = r9
        L62:
            if (r10 != r0) goto L6c
            long r7 = r12 >> r3
        L66:
            int r5 = (int) r7
            float r5 = java.lang.Float.intBitsToFloat(r5)
            goto L6f
        L6c:
            long r7 = r12 & r1
            goto L66
        L6f:
            float r4 = defpackage.gi2.p(r5, r6, r4)
            float r4 = -r4
            bf1 r11 = r11.k
            float r11 = r11.e(r4)
            float r11 = -r11
            if (r10 != r0) goto L7f
            r0 = r11
            goto L86
        L7f:
            long r4 = r12 >> r3
            int r0 = (int) r4
            float r0 = java.lang.Float.intBitsToFloat(r0)
        L86:
            lo4 r4 = defpackage.lo4.Vertical
            if (r10 != r4) goto L8b
            goto L92
        L8b:
            long r10 = r12 & r1
            int r10 = (int) r10
            float r11 = java.lang.Float.intBitsToFloat(r10)
        L92:
            int r10 = java.lang.Float.floatToRawIntBits(r0)
            long r12 = (long) r10
            int r10 = java.lang.Float.floatToRawIntBits(r11)
            long r10 = (long) r10
            long r12 = r12 << r3
            long r10 = r10 & r1
            long r10 = r10 | r12
            return r10
        La0:
            r10 = 0
            return r10
    }

    @Override // defpackage.ae4
    public final long w0(long r1, long r3, int r5) {
            r0 = this;
            r1 = 2
            if (r5 != r1) goto L28
            lo4 r0 = r0.B
            lo4 r1 = defpackage.lo4.Horizontal
            if (r0 != r1) goto L13
            r0 = 32
            long r0 = r3 >> r0
        Ld:
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            goto L1a
        L13:
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r3
            goto Ld
        L1a:
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L20
            goto L28
        L20:
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.String r1 = "Scroll cancelled"
            r0.<init>(r1)
            throw r0
        L28:
            r0 = 0
            return r0
    }

    @Override // defpackage.ae4
    public final java.lang.Object z0(long r1, long r3, defpackage.r41 r5) {
            r0 = this;
            lo4 r0 = r0.B
            lo4 r1 = defpackage.lo4.Vertical
            r2 = 0
            if (r0 != r1) goto Ld
            r0 = 2
            long r0 = defpackage.ol7.a(r3, r2, r2, r0)
            goto L12
        Ld:
            r0 = 1
            long r0 = defpackage.ol7.a(r3, r2, r2, r0)
        L12:
            ol7 r2 = new ol7
            r2.<init>(r0)
            return r2
    }
}

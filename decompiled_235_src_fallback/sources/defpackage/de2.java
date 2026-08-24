package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: de2  reason: default package */
/* loaded from: classes.dex */
public final class de2 implements defpackage.xd2 {
    public final float a;
    public final defpackage.ho6 b;

    public de2(float r4, float r5, float r6) {
            r3 = this;
            r3.<init>()
            r3.a = r6
            ho6 r6 = new ho6
            r6.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r6.a = r0
            r1 = 4632233691727265792(0x4049000000000000, double:50.0)
            double r1 = java.lang.Math.sqrt(r1)
            r6.b = r1
            r6.c = r0
            r0 = 0
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 >= 0) goto L22
            java.lang.String r1 = "Damping ratio must be non-negative"
            defpackage.t05.a(r1)
        L22:
            r6.c = r4
            double r1 = r6.b
            double r1 = r1 * r1
            float r4 = (float) r1
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 > 0) goto L31
            java.lang.String r4 = "Spring stiffness constant must be positive."
            defpackage.t05.a(r4)
        L31:
            double r4 = (double) r5
            double r4 = java.lang.Math.sqrt(r4)
            r6.b = r4
            r3.b = r6
            return
    }

    @Override // defpackage.xd2
    public final float b(long r3, float r5, float r6, float r7) {
            r2 = this;
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r0
            ho6 r2 = r2.b
            r2.a = r6
            long r2 = r2.a(r5, r7, r3)
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            return r2
    }

    @Override // defpackage.xd2
    public final long c(float r34, float r35, float r36) {
            r33 = this;
            r0 = r33
            ho6 r1 = r0.b
            double r2 = r1.b
            double r2 = r2 * r2
            float r2 = (float) r2
            float r1 = r1.c
            float r3 = r34 - r35
            float r0 = r0.a
            float r3 = r3 / r0
            float r0 = r36 / r0
            r4 = 0
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 != 0) goto L1d
            r0 = 9223372036854(0x8637bd05af6, double:4.5569512622224E-311)
            goto L240
        L1d:
            double r4 = (double) r2
            double r1 = (double) r1
            double r6 = (double) r0
            double r8 = (double) r3
            r10 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r12 = r1 * r10
            double r14 = java.lang.Math.sqrt(r4)
            double r14 = r14 * r12
            double r12 = r14 * r14
            r16 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r4 = r4 * r16
            double r12 = r12 - r4
            r3 = 0
            int r0 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r0 >= 0) goto L3a
            r16 = r3
            goto L3e
        L3a:
            double r16 = java.lang.Math.sqrt(r12)
        L3e:
            if (r0 >= 0) goto L49
            double r12 = java.lang.Math.abs(r12)
            double r12 = java.lang.Math.sqrt(r12)
            goto L4a
        L49:
            r12 = r3
        L4a:
            double r14 = -r14
            double r18 = r14 + r16
            r20 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r18 = r18 * r20
            double r12 = r12 * r20
            double r14 = r14 - r16
            double r14 = r14 * r20
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 != 0) goto L63
            int r5 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r5 != 0) goto L63
            r0 = 0
            goto L240
        L63:
            if (r0 >= 0) goto L66
            double r6 = -r6
        L66:
            double r8 = java.lang.Math.abs(r8)
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            r20 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r5 = 100
            r22 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            r24 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            r26 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            r28 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r30 = 0
            if (r0 <= 0) goto L168
            double r0 = r18 * r8
            double r0 = r0 - r6
            double r6 = r18 - r14
            double r0 = r0 / r6
            double r8 = r8 - r0
            double r10 = r16 / r8
            double r10 = java.lang.Math.abs(r10)
            double r10 = java.lang.Math.log(r10)
            double r10 = r10 / r18
            double r12 = r16 / r0
            double r12 = java.lang.Math.abs(r12)
            double r12 = java.lang.Math.log(r12)
            double r12 = r12 / r14
            long r31 = java.lang.Double.doubleToRawLongBits(r10)
            long r31 = r31 & r28
            int r2 = (r31 > r26 ? 1 : (r31 == r26 ? 0 : -1))
            if (r2 >= 0) goto Lbe
            long r31 = java.lang.Double.doubleToRawLongBits(r12)
            long r28 = r31 & r28
            int r2 = (r28 > r26 ? 1 : (r28 == r26 ? 0 : -1))
            if (r2 >= 0) goto Lbf
            double r10 = java.lang.Math.max(r10, r12)
            goto Lbf
        Lbe:
            r10 = r12
        Lbf:
            double r12 = r8 * r18
            r33 = r3
            double r3 = -r0
            double r3 = r3 * r14
            double r2 = r12 / r3
            double r2 = java.lang.Math.log(r2)
            double r26 = r14 - r18
            double r2 = r2 / r26
            boolean r4 = java.lang.Double.isNaN(r2)
            if (r4 != 0) goto L100
            int r4 = (r2 > r33 ? 1 : (r2 == r33 ? 0 : -1))
            if (r4 > 0) goto Lda
            goto L100
        Lda:
            int r4 = (r2 > r33 ? 1 : (r2 == r33 ? 0 : -1))
            if (r4 <= 0) goto L103
            double r26 = r18 * r2
            double r26 = java.lang.Math.exp(r26)
            double r26 = r26 * r8
            double r2 = r2 * r14
            double r2 = java.lang.Math.exp(r2)
            double r2 = r2 * r0
            double r2 = r2 + r26
            double r2 = -r2
            int r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r2 >= 0) goto L103
            int r2 = (r0 > r33 ? 1 : (r0 == r33 ? 0 : -1))
            if (r2 <= 0) goto Lfe
            int r2 = (r8 > r33 ? 1 : (r8 == r33 ? 0 : -1))
            if (r2 >= 0) goto Lfe
            r3 = r33
            goto Lff
        Lfe:
            r3 = r10
        Lff:
            r10 = r3
        L100:
            r16 = r20
            goto L110
        L103:
            double r2 = r0 * r14
            double r2 = r2 * r14
            double r2 = -r2
            double r10 = r12 * r18
            double r2 = r2 / r10
            double r2 = java.lang.Math.log(r2)
            double r10 = r2 / r6
        L110:
            double r2 = r18 * r10
            double r2 = java.lang.Math.exp(r2)
            double r2 = r2 * r12
            double r6 = r0 * r14
            double r20 = r14 * r10
            double r20 = java.lang.Math.exp(r20)
            double r20 = r20 * r6
            double r20 = r20 + r2
            double r2 = java.lang.Math.abs(r20)
            r20 = 4547007122018943789(0x3f1a36e2eb1c432d, double:1.0E-4)
            int r2 = (r2 > r20 ? 1 : (r2 == r20 ? 0 : -1))
            if (r2 >= 0) goto L132
            goto L239
        L132:
            r2 = r30
        L134:
            int r3 = (r24 > r22 ? 1 : (r24 == r22 ? 0 : -1))
            if (r3 <= 0) goto L239
            if (r2 >= r5) goto L239
            int r2 = r2 + 1
            double r3 = r18 * r10
            double r20 = java.lang.Math.exp(r3)
            double r20 = r20 * r8
            double r24 = r14 * r10
            double r26 = java.lang.Math.exp(r24)
            double r26 = r26 * r0
            double r26 = r26 + r20
            double r26 = r26 + r16
            double r3 = java.lang.Math.exp(r3)
            double r3 = r3 * r12
            double r20 = java.lang.Math.exp(r24)
            double r20 = r20 * r6
            double r20 = r20 + r3
            double r26 = r26 / r20
            double r3 = r10 - r26
            double r10 = r10 - r3
            double r24 = java.lang.Math.abs(r10)
            r10 = r3
            goto L134
        L168:
            r33 = r3
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 >= 0) goto L183
            double r0 = r18 * r8
            double r6 = r6 - r0
            double r6 = r6 / r12
            double r8 = r8 * r8
            double r6 = r6 * r6
            double r6 = r6 + r8
            double r0 = java.lang.Math.sqrt(r6)
            double r16 = r16 / r0
            double r0 = java.lang.Math.log(r16)
            double r10 = r0 / r18
            goto L239
        L183:
            double r0 = r18 * r8
            double r6 = r6 - r0
            double r2 = r16 / r8
            double r2 = java.lang.Math.abs(r2)
            double r2 = java.lang.Math.log(r2)
            double r2 = r2 / r18
            double r12 = r16 / r6
            double r12 = java.lang.Math.abs(r12)
            double r12 = java.lang.Math.log(r12)
            r35 = r10
            r14 = r12
            r4 = r30
        L1a1:
            r10 = 6
            if (r4 >= r10) goto L1b3
            double r14 = r14 / r18
            double r10 = java.lang.Math.abs(r14)
            double r10 = java.lang.Math.log(r10)
            double r14 = r12 - r10
            int r4 = r4 + 1
            goto L1a1
        L1b3:
            double r14 = r14 / r18
            long r10 = java.lang.Double.doubleToRawLongBits(r2)
            long r10 = r10 & r28
            int r4 = (r10 > r26 ? 1 : (r10 == r26 ? 0 : -1))
            if (r4 >= 0) goto L1ce
            long r10 = java.lang.Double.doubleToRawLongBits(r14)
            long r10 = r10 & r28
            int r4 = (r10 > r26 ? 1 : (r10 == r26 ? 0 : -1))
            if (r4 >= 0) goto L1cf
            double r2 = java.lang.Math.max(r2, r14)
            goto L1cf
        L1ce:
            r2 = r14
        L1cf:
            double r10 = r0 + r6
            double r10 = -r10
            double r12 = r18 * r6
            double r10 = r10 / r12
            double r12 = r18 * r10
            double r14 = java.lang.Math.exp(r12)
            double r14 = r14 * r8
            double r26 = r6 * r10
            double r12 = java.lang.Math.exp(r12)
            double r12 = r12 * r26
            double r12 = r12 + r14
            boolean r4 = java.lang.Double.isNaN(r10)
            if (r4 != 0) goto L20f
            int r4 = (r10 > r33 ? 1 : (r10 == r33 ? 0 : -1))
            if (r4 > 0) goto L1f0
            goto L20f
        L1f0:
            int r4 = (r10 > r33 ? 1 : (r10 == r33 ? 0 : -1))
            if (r4 <= 0) goto L207
            double r10 = -r12
            int r4 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r4 >= 0) goto L207
            int r4 = (r6 > r33 ? 1 : (r6 == r33 ? 0 : -1))
            if (r4 >= 0) goto L204
            int r4 = (r8 > r33 ? 1 : (r8 == r33 ? 0 : -1))
            if (r4 <= 0) goto L204
            r3 = r33
            goto L205
        L204:
            r3 = r2
        L205:
            r2 = r3
            goto L20f
        L207:
            double r10 = r35 / r18
            double r2 = -r10
            double r10 = r8 / r6
            double r2 = r2 - r10
            r20 = r16
        L20f:
            r10 = r2
            r2 = r30
        L212:
            int r3 = (r24 > r22 ? 1 : (r24 == r22 ? 0 : -1))
            if (r3 <= 0) goto L239
            if (r2 >= r5) goto L239
            int r2 = r2 + 1
            double r3 = r6 * r10
            double r3 = r3 + r8
            double r12 = r18 * r10
            double r14 = java.lang.Math.exp(r12)
            double r14 = r14 * r3
            double r14 = r14 + r20
            double r3 = r12 + r16
            double r3 = r3 * r6
            double r3 = r3 + r0
            double r12 = java.lang.Math.exp(r12)
            double r12 = r12 * r3
            double r14 = r14 / r12
            double r3 = r10 - r14
            double r10 = r10 - r3
            double r24 = java.lang.Math.abs(r10)
            r10 = r3
            goto L212
        L239:
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r10 = r10 * r0
            long r0 = (long) r10
        L240:
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 * r2
            return r0
    }

    @Override // defpackage.xd2
    public final float d(float r1, float r2, float r3) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.xd2
    public final float e(long r3, float r5, float r6, float r7) {
            r2 = this;
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r0
            ho6 r2 = r2.b
            r2.a = r6
            long r2 = r2.a(r5, r7, r3)
            r4 = 32
            long r2 = r2 >> r4
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            return r2
    }
}

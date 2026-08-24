package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v71  reason: default package */
/* loaded from: classes.dex */
public final class v71 implements defpackage.hr1 {
    public final float A;
    public final float B;
    public final float L;
    public final float R;

    public v71(float r12, float r13) {
            r11 = this;
            r11.<init>()
            r11.A = r12
            r11.B = r13
            boolean r0 = java.lang.Float.isNaN(r12)
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L23
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L23
            boolean r0 = java.lang.Float.isNaN(r13)
            if (r0 != 0) goto L23
            boolean r0 = java.lang.Float.isNaN(r2)
            if (r0 != 0) goto L23
            goto L41
        L23:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: "
            r0.<init>(r3)
            r0.append(r12)
            java.lang.String r12 = ", 0.0, "
            r0.append(r12)
            r0.append(r13)
            java.lang.String r12 = ", 1.0."
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            defpackage.t05.a(r12)
        L41:
            r12 = 5
            float[] r12 = new float[r12]
            r3 = 4621256167635550208(0x4022000000000000, double:9.0)
            double r3 = java.lang.Math.sqrt(r3)
            double r3 = -r3
            r5 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r7 = r3 + r5
            double r7 = -r7
            r9 = -4604930618986332160(0xc018000000000000, double:-6.0)
            double r7 = r7 / r9
            float r13 = (float) r7
            r0 = 0
            int r13 = defpackage.f04.X(r13, r12, r0)
            double r3 = r3 - r5
            double r3 = r3 / r9
            float r3 = (float) r3
            int r3 = defpackage.f04.X(r3, r12, r13)
            int r3 = r3 + r13
            r13 = 1
            if (r3 <= r13) goto L77
            r4 = r12[r0]
            r5 = r12[r13]
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 <= 0) goto L71
            r12[r0] = r5
            r12[r13] = r4
            goto L77
        L71:
            int r13 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r13 != 0) goto L77
            int r3 = r3 + (-1)
        L77:
            r13 = 1056964608(0x3f000000, float:0.5)
            int r13 = defpackage.f04.X(r13, r12, r3)
            int r13 = r13 + r3
            float r3 = java.lang.Math.min(r1, r2)
            float r2 = java.lang.Math.max(r1, r2)
        L86:
            if (r0 >= r13) goto L9f
            r4 = r12[r0]
            r5 = 1077936128(0x40400000, float:3.0)
            r6 = -1073741824(0xffffffffc0000000, float:-2.0)
            float r6 = r6 * r4
            float r6 = r6 + r5
            float r6 = r6 * r4
            float r6 = r6 + r1
            float r6 = r6 * r4
            float r6 = r6 + r1
            float r3 = java.lang.Math.min(r3, r6)
            float r2 = java.lang.Math.max(r2, r6)
            int r0 = r0 + 1
            goto L86
        L9f:
            int r12 = java.lang.Float.floatToRawIntBits(r3)
            long r12 = (long) r12
            int r0 = java.lang.Float.floatToRawIntBits(r2)
            long r0 = (long) r0
            r2 = 32
            long r12 = r12 << r2
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r3
            long r12 = r12 | r0
            long r0 = r12 >> r2
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r11.L = r0
            long r12 = r12 & r3
            int r12 = (int) r12
            float r12 = java.lang.Float.intBitsToFloat(r12)
            r11.R = r12
            return
    }

    @Override // defpackage.hr1
    public final float b(float r27) {
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = 0
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 <= 0) goto L273
            r3 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 >= 0) goto L273
            r4 = 872415232(0x34000000, float:1.1920929E-7)
            float r4 = java.lang.Math.max(r1, r4)
            float r5 = r2 - r4
            float r6 = r0.A
            float r7 = r6 - r4
            float r8 = r0.B
            float r9 = r8 - r4
            float r4 = r3 - r4
            double r10 = (double) r5
            double r12 = (double) r7
            r14 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r12 = r12 * r14
            double r12 = r10 - r12
            r16 = r2
            r17 = r3
            double r2 = (double) r9
            double r12 = r12 + r2
            r2 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r12 = r12 * r2
            r18 = r2
            float r2 = r7 - r5
            double r2 = (double) r2
            double r2 = r2 * r18
            float r5 = -r5
            r20 = r14
            double r14 = (double) r5
            float r7 = r7 - r9
            r22 = r12
            double r12 = (double) r7
            double r12 = r12 * r18
            double r12 = r12 + r14
            double r4 = (double) r4
            double r12 = r12 + r4
            r4 = 0
            double r14 = r12 - r4
            double r14 = java.lang.Math.abs(r14)
            r24 = 4502148214488346440(0x3e7ad7f29abcaf48, double:1.0E-7)
            int r7 = (r14 > r24 ? 1 : (r14 == r24 ? 0 : -1))
            r9 = 898428346(0x358cedba, float:1.05E-6)
            r14 = 2143289344(0x7fc00000, float:NaN)
            if (r7 >= 0) goto Le3
            double r12 = r22 - r4
            double r12 = java.lang.Math.abs(r12)
            int r7 = (r12 > r24 ? 1 : (r12 == r24 ? 0 : -1))
            if (r7 >= 0) goto L91
            double r4 = r2 - r4
            double r4 = java.lang.Math.abs(r4)
            int r4 = (r4 > r24 ? 1 : (r4 == r24 ? 0 : -1))
            if (r4 >= 0) goto L71
            goto L22d
        L71:
            double r4 = -r10
            double r4 = r4 / r2
            float r2 = (float) r4
            int r3 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r3 >= 0) goto L7b
            r3 = r16
            goto L7c
        L7b:
            r3 = r2
        L7c:
            int r4 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r4 <= 0) goto L82
            r3 = r17
        L82:
            float r2 = r3 - r2
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 <= 0) goto L8e
            goto L22d
        L8e:
            r14 = r3
            goto L22d
        L91:
            double r4 = r2 * r2
            r12 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r12 = r12 * r22
            double r12 = r12 * r10
            double r4 = r4 - r12
            double r4 = java.lang.Math.sqrt(r4)
            double r12 = r22 * r20
            double r10 = r4 - r2
            double r10 = r10 / r12
            float r7 = (float) r10
            int r10 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r10 >= 0) goto Laa
            r10 = r16
            goto Lab
        Laa:
            r10 = r7
        Lab:
            int r11 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r11 <= 0) goto Lb1
            r10 = r17
        Lb1:
            float r7 = r10 - r7
            float r7 = java.lang.Math.abs(r7)
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 <= 0) goto Lbc
            r10 = r14
        Lbc:
            boolean r7 = java.lang.Float.isNaN(r10)
            if (r7 != 0) goto Lc5
            r14 = r10
            goto L22d
        Lc5:
            double r2 = -r2
            double r2 = r2 - r4
            double r2 = r2 / r12
            float r2 = (float) r2
            int r3 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r3 >= 0) goto Ld0
            r3 = r16
            goto Ld1
        Ld0:
            r3 = r2
        Ld1:
            int r4 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r4 <= 0) goto Ld7
            r3 = r17
        Ld7:
            float r2 = r3 - r2
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 <= 0) goto L8e
            goto L22d
        Le3:
            double r22 = r22 / r12
            double r2 = r2 / r12
            double r10 = r10 / r12
            double r12 = r2 * r18
            double r24 = r22 * r22
            double r12 = r12 - r24
            r24 = 4621256167635550208(0x4022000000000000, double:9.0)
            double r12 = r12 / r24
            double r20 = r20 * r22
            double r20 = r20 * r22
            double r20 = r20 * r22
            double r24 = r24 * r22
            double r24 = r24 * r2
            double r20 = r20 - r24
            r2 = 4628293042053316608(0x403b000000000000, double:27.0)
            double r10 = r10 * r2
            double r10 = r10 + r20
            r2 = 4632796641680687104(0x404b000000000000, double:54.0)
            double r10 = r10 / r2
            double r2 = r10 * r10
            double r20 = r12 * r12
            double r12 = r12 * r20
            double r2 = r2 + r12
            r20 = r4
            double r4 = r22 / r18
            int r7 = (r2 > r20 ? 1 : (r2 == r20 ? 0 : -1))
            r15 = 1073741824(0x40000000, float:2.0)
            if (r7 >= 0) goto L1b9
            double r2 = -r12
            double r2 = java.lang.Math.sqrt(r2)
            double r10 = -r10
            double r10 = r10 / r2
            r12 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r7 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r7 >= 0) goto L124
            r10 = r12
        L124:
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r7 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r7 <= 0) goto L12b
            r10 = r12
        L12b:
            double r10 = java.lang.Math.acos(r10)
            float r2 = (float) r2
            float r2 = defpackage.oi2.w(r2)
            float r2 = r2 * r15
            double r2 = (double) r2
            double r12 = r10 / r18
            double r12 = java.lang.Math.cos(r12)
            double r12 = r12 * r2
            double r12 = r12 - r4
            float r7 = (float) r12
            int r12 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r12 >= 0) goto L146
            r12 = r16
            goto L147
        L146:
            r12 = r7
        L147:
            int r13 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r13 <= 0) goto L14d
            r12 = r17
        L14d:
            float r7 = r12 - r7
            float r7 = java.lang.Math.abs(r7)
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 <= 0) goto L158
            r12 = r14
        L158:
            boolean r7 = java.lang.Float.isNaN(r12)
            if (r7 != 0) goto L161
        L15e:
            r14 = r12
            goto L22d
        L161:
            r12 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            double r12 = r12 + r10
            double r12 = r12 / r18
            double r12 = java.lang.Math.cos(r12)
            double r12 = r12 * r2
            double r12 = r12 - r4
            float r7 = (float) r12
            int r12 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r12 >= 0) goto L177
            r12 = r16
            goto L178
        L177:
            r12 = r7
        L178:
            int r13 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r13 <= 0) goto L17e
            r12 = r17
        L17e:
            float r7 = r12 - r7
            float r7 = java.lang.Math.abs(r7)
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 <= 0) goto L189
            r12 = r14
        L189:
            boolean r7 = java.lang.Float.isNaN(r12)
            if (r7 != 0) goto L190
            goto L15e
        L190:
            r12 = 4623263855806786840(0x402921fb54442d18, double:12.566370614359172)
            double r10 = r10 + r12
            double r10 = r10 / r18
            double r10 = java.lang.Math.cos(r10)
            double r10 = r10 * r2
            double r10 = r10 - r4
            float r2 = (float) r10
            int r3 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r3 >= 0) goto L1a6
            r3 = r16
            goto L1a7
        L1a6:
            r3 = r2
        L1a7:
            int r4 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r4 <= 0) goto L1ad
            r3 = r17
        L1ad:
            float r2 = r3 - r2
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 <= 0) goto L8e
            goto L22d
        L1b9:
            if (r7 != 0) goto L200
            float r2 = (float) r10
            float r2 = defpackage.oi2.w(r2)
            float r2 = -r2
            float r15 = r15 * r2
            float r3 = (float) r4
            float r15 = r15 - r3
            int r4 = (r15 > r16 ? 1 : (r15 == r16 ? 0 : -1))
            if (r4 >= 0) goto L1cb
            r4 = r16
            goto L1cc
        L1cb:
            r4 = r15
        L1cc:
            int r5 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r5 <= 0) goto L1d2
            r4 = r17
        L1d2:
            float r5 = r4 - r15
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 <= 0) goto L1dd
            r4 = r14
        L1dd:
            boolean r5 = java.lang.Float.isNaN(r4)
            if (r5 != 0) goto L1e5
            r14 = r4
            goto L22d
        L1e5:
            float r2 = -r2
            float r2 = r2 - r3
            int r3 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r3 >= 0) goto L1ee
            r3 = r16
            goto L1ef
        L1ee:
            r3 = r2
        L1ef:
            int r4 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r4 <= 0) goto L1f5
            r3 = r17
        L1f5:
            float r2 = r3 - r2
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 <= 0) goto L8e
            goto L22d
        L200:
            double r2 = java.lang.Math.sqrt(r2)
            double r12 = -r10
            double r12 = r12 + r2
            float r7 = (float) r12
            float r7 = defpackage.oi2.w(r7)
            double r10 = r10 + r2
            float r2 = (float) r10
            float r2 = defpackage.oi2.w(r2)
            float r7 = r7 - r2
            double r2 = (double) r7
            double r2 = r2 - r4
            float r2 = (float) r2
            int r3 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r3 >= 0) goto L21c
            r3 = r16
            goto L21d
        L21c:
            r3 = r2
        L21d:
            int r4 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r4 <= 0) goto L223
            r3 = r17
        L223:
            float r2 = r3 - r2
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 <= 0) goto L8e
        L22d:
            boolean r2 = java.lang.Float.isNaN(r14)
            if (r2 != 0) goto L24f
            r1 = -1087722838(0xffffffffbf2aaaaa, float:-0.6666666)
            float r1 = r1 * r14
            float r1 = r1 + r17
            float r1 = r1 * r14
            float r1 = r1 + r16
            r2 = 1077936128(0x40400000, float:3.0)
            float r1 = r1 * r2
            float r1 = r1 * r14
            float r2 = r0.L
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 >= 0) goto L247
            r1 = r2
        L247:
            float r0 = r0.R
            int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r2 <= 0) goto L24e
            return r0
        L24e:
            return r1
        L24f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "The cubic curve with parameters ("
            r2.<init>(r3)
            r2.append(r6)
            java.lang.String r3 = ", 0.0, "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r3 = ", 1.0) has no solution at "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L273:
            return r1
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.v71
            if (r0 == 0) goto L18
            v71 r3 = (defpackage.v71) r3
            float r0 = r3.A
            float r1 = r2.A
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L18
            float r2 = r2.B
            float r3 = r3.B
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L18
            r2 = 1
            return r2
        L18:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r3 = this;
            float r0 = r3.A
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            r2 = 0
            int r0 = defpackage.xg6.a(r2, r0, r1)
            float r3 = r3.B
            int r3 = defpackage.xg6.a(r3, r0, r1)
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = java.lang.Float.hashCode(r0)
            int r0 = r0 + r3
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CubicBezierEasing(a="
            r0.<init>(r1)
            float r1 = r2.A
            r0.append(r1)
            java.lang.String r1 = ", b=0.0, c="
            r0.append(r1)
            float r2 = r2.B
            r0.append(r2)
            java.lang.String r2 = ", d=1.0)"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}

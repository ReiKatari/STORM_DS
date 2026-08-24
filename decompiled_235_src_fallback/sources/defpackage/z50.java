package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z50  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class z50 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ long B;
    public final /* synthetic */ java.lang.Object L;
    public final /* synthetic */ java.lang.Object R;
    public final /* synthetic */ java.lang.Object X;

    public /* synthetic */ z50(long r2, float[] r4, defpackage.bh5 r5, defpackage.ah5 r6) {
            r1 = this;
            r0 = 1
            r1.A = r0
            r1.<init>()
            r1.B = r2
            r1.L = r4
            r1.R = r5
            r1.X = r6
            return
    }

    public /* synthetic */ z50(java.lang.Object r1, java.lang.Object r2, long r3, java.lang.Object r5, int r6) {
            r0 = this;
            r0.A = r6
            r0.L = r1
            r0.R = r2
            r0.B = r3
            r0.X = r5
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r32) {
            r31 = this;
            r0 = r31
            int r1 = r0.A
            jg7 r2 = defpackage.jg7.a
            java.lang.Object r3 = r0.X
            java.lang.Object r4 = r0.R
            java.lang.Object r5 = r0.L
            switch(r1) {
                case 0: goto L289;
                case 1: goto L139;
                default: goto Lf;
            }
        Lf:
            n65 r5 = (defpackage.n65) r5
            pp6 r4 = (defpackage.pp6) r4
            long r7 = r0.B
            hj r3 = (defpackage.hj) r3
            r6 = r32
            no1 r6 = (defpackage.no1) r6
            float r0 = r5.a()
            rs4 r1 = r5.g
            float r1 = r1.h()
            float r0 = r0 / r1
            r1 = 1065353216(0x3f800000, float:1.0)
            float r5 = java.lang.Math.min(r1, r0)
            r9 = 1053609165(0x3ecccccd, float:0.4)
            float r5 = r5 - r9
            r10 = 0
            float r5 = java.lang.Math.max(r5, r10)
            r11 = 1084227584(0x40a00000, float:5.0)
            float r5 = r5 * r11
            r11 = 1077936128(0x40400000, float:3.0)
            float r5 = r5 / r11
            float r0 = java.lang.Math.abs(r0)
            float r0 = r0 - r1
            int r11 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r11 >= 0) goto L45
            goto L46
        L45:
            r10 = r0
        L46:
            r0 = 1073741824(0x40000000, float:2.0)
            int r11 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r11 <= 0) goto L4d
            r10 = r0
        L4d:
            double r11 = (double) r10
            r13 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r11 = java.lang.Math.pow(r11, r13)
            float r11 = (float) r11
            r12 = 1082130432(0x40800000, float:4.0)
            float r11 = r11 / r12
            float r10 = r10 - r11
            r11 = 1061997773(0x3f4ccccd, float:0.8)
            float r11 = r11 * r5
            r12 = -1098907648(0xffffffffbe800000, float:-0.25)
            float r9 = r9 * r5
            float r9 = r9 + r12
            float r9 = r9 + r10
            r10 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 * r10
            r10 = 1135869952(0x43b40000, float:360.0)
            float r12 = r9 * r10
            float r11 = r11 + r9
            float r11 = r11 * r10
            float r1 = java.lang.Math.min(r1, r5)
            gv r5 = new gv
            r5.<init>()
            r5.a = r11
            r5.b = r1
            java.lang.Object r1 = r4.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            float r15 = r1.floatValue()
            long r13 = r6.t0()
            bt r1 = r6.i0()
            r18 = r2
            r31 = r3
            long r2 = r1.L()
            xj0 r4 = r1.G()
            r4.h()
            java.lang.Object r4 = r1.B     // Catch: java.lang.Throwable -> L134
            os0 r4 = (defpackage.os0) r4     // Catch: java.lang.Throwable -> L134
            r4.e0(r9, r13)     // Catch: java.lang.Throwable -> L134
            float r4 = defpackage.k65.b     // Catch: java.lang.Throwable -> L134
            float r4 = r6.e0(r4)     // Catch: java.lang.Throwable -> L134
            float r9 = defpackage.k65.c     // Catch: java.lang.Throwable -> L134
            float r10 = r6.e0(r9)     // Catch: java.lang.Throwable -> L134
            float r10 = r10 / r0
            float r10 = r10 + r4
            of5 r0 = new of5     // Catch: java.lang.Throwable -> L134
            long r13 = r6.e()     // Catch: java.lang.Throwable -> L134
            long r13 = defpackage.ii2.v(r13)     // Catch: java.lang.Throwable -> L134
            r4 = 32
            long r13 = r13 >> r4
            int r13 = (int) r13     // Catch: java.lang.Throwable -> L134
            float r13 = java.lang.Float.intBitsToFloat(r13)     // Catch: java.lang.Throwable -> L134
            float r13 = r13 - r10
            long r16 = r6.e()     // Catch: java.lang.Throwable -> L134
            long r16 = defpackage.ii2.v(r16)     // Catch: java.lang.Throwable -> L134
            r19 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r14 = r4
            r32 = r5
            long r4 = r16 & r19
            int r4 = (int) r4     // Catch: java.lang.Throwable -> L134
            float r4 = java.lang.Float.intBitsToFloat(r4)     // Catch: java.lang.Throwable -> L134
            float r4 = r4 - r10
            long r16 = r6.e()     // Catch: java.lang.Throwable -> L134
            long r16 = defpackage.ii2.v(r16)     // Catch: java.lang.Throwable -> L134
            r21 = r7
            long r7 = r16 >> r14
            int r5 = (int) r7     // Catch: java.lang.Throwable -> L134
            float r5 = java.lang.Float.intBitsToFloat(r5)     // Catch: java.lang.Throwable -> L134
            float r5 = r5 + r10
            long r7 = r6.e()     // Catch: java.lang.Throwable -> L134
            long r7 = defpackage.ii2.v(r7)     // Catch: java.lang.Throwable -> L134
            long r7 = r7 & r19
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L134
            float r7 = java.lang.Float.intBitsToFloat(r7)     // Catch: java.lang.Throwable -> L134
            float r7 = r7 + r10
            r0.<init>(r13, r4, r5, r7)     // Catch: java.lang.Throwable -> L134
            float r10 = r11 - r12
            r4 = r12
            long r11 = r0.d()     // Catch: java.lang.Throwable -> L134
            long r13 = r0.c()     // Catch: java.lang.Throwable -> L134
            ys6 r16 = new ys6     // Catch: java.lang.Throwable -> L134
            float r24 = r6.e0(r9)     // Catch: java.lang.Throwable -> L134
            r28 = 0
            r29 = 26
            r25 = 0
            r26 = 2
            r27 = 0
            r23 = r16
            r23.<init>(r24, r25, r26, r27, r28, r29)     // Catch: java.lang.Throwable -> L134
            r17 = 768(0x300, float:1.076E-42)
            r9 = r4
            r7 = r21
            defpackage.no1.E(r6, r7, r9, r10, r11, r13, r15, r16, r17)     // Catch: java.lang.Throwable -> L134
            r12 = r32
            r9 = r7
            r11 = r15
            r7 = r31
            r8 = r0
            defpackage.k65.c(r6, r7, r8, r9, r11, r12)     // Catch: java.lang.Throwable -> L134
            defpackage.xg6.v(r1, r2)
            return r18
        L134:
            r0 = move-exception
            defpackage.xg6.v(r1, r2)
            throw r0
        L139:
            r18 = r2
            float[] r5 = (float[]) r5
            bh5 r4 = (defpackage.bh5) r4
            ah5 r3 = (defpackage.ah5) r3
            r1 = r32
            yr4 r1 = (defpackage.yr4) r1
            int r2 = r1.b
            cj r6 = r1.a
            int r7 = r1.c
            long r8 = r0.B
            int r0 = defpackage.k47.f(r8)
            if (r2 <= r0) goto L156
            int r0 = r1.b
            goto L15a
        L156:
            int r0 = defpackage.k47.f(r8)
        L15a:
            int r2 = defpackage.k47.e(r8)
            if (r7 >= r2) goto L161
            goto L165
        L161:
            int r7 = defpackage.k47.e(r8)
        L165:
            int r0 = r1.d(r0)
            int r1 = r1.d(r7)
            long r0 = defpackage.jx2.f(r0, r1)
            int r2 = r4.A
            y37 r7 = r6.d
            int r8 = defpackage.k47.f(r0)
            int r9 = defpackage.k47.e(r0)
            android.text.Layout r10 = r7.f
            java.lang.CharSequence r11 = r10.getText()
            int r11 = r11.length()
            if (r8 < 0) goto L18a
            goto L18f
        L18a:
            java.lang.String r12 = "startOffset must be > 0"
            defpackage.q53.a(r12)
        L18f:
            if (r8 >= r11) goto L192
            goto L197
        L192:
            java.lang.String r12 = "startOffset must be less than text length"
            defpackage.q53.a(r12)
        L197:
            if (r9 <= r8) goto L19a
            goto L19f
        L19a:
            java.lang.String r12 = "endOffset must be greater than startOffset"
            defpackage.q53.a(r12)
        L19f:
            if (r9 > r11) goto L1a2
            goto L1a7
        L1a2:
            java.lang.String r11 = "endOffset must be smaller or equal to text length"
            defpackage.q53.a(r11)
        L1a7:
            int r11 = r9 - r8
            int r11 = r11 * 4
            int r12 = r5.length
            int r12 = r12 - r2
            if (r12 < r11) goto L1b0
            goto L1b5
        L1b0:
            java.lang.String r11 = "array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4"
            defpackage.q53.a(r11)
        L1b5:
            int r11 = r10.getLineForOffset(r8)
            int r12 = r9 + (-1)
            int r12 = r10.getLineForOffset(r12)
            fy2 r13 = new fy2
            r13.<init>(r7)
            if (r11 > r12) goto L25b
        L1c6:
            int r14 = r10.getLineStart(r11)
            int r15 = r7.f(r11)
            int r14 = java.lang.Math.max(r8, r14)
            int r15 = java.lang.Math.min(r9, r15)
            float r16 = r7.g(r11)
            float r17 = r7.e(r11)
            r31 = r0
            int r0 = r10.getParagraphDirection(r11)
            r1 = 1
            r19 = r2
            r2 = 0
            if (r0 != r1) goto L1ec
            r0 = r1
            goto L1ed
        L1ec:
            r0 = r2
        L1ed:
            if (r14 >= r15) goto L251
            boolean r20 = r10.isRtlCharAt(r14)
            if (r0 == 0) goto L206
            if (r20 != 0) goto L206
            float r20 = r13.a(r14, r2, r2, r1)
            int r2 = r14 + 1
            float r2 = r13.a(r2, r1, r1, r1)
            r21 = r0
            r0 = r2
        L204:
            r2 = 0
            goto L23c
        L206:
            if (r0 == 0) goto L21e
            if (r20 == 0) goto L21e
            r2 = 0
            float r20 = r13.a(r14, r2, r2, r2)
            r21 = r0
            int r0 = r14 + 1
            float r0 = r13.a(r0, r1, r1, r2)
            r30 = r20
            r20 = r0
            r0 = r30
            goto L23c
        L21e:
            r21 = r0
            r2 = 0
            if (r21 != 0) goto L232
            if (r20 == 0) goto L232
            float r0 = r13.a(r14, r2, r2, r1)
            int r2 = r14 + 1
            float r2 = r13.a(r2, r1, r1, r1)
            r20 = r2
            goto L204
        L232:
            float r20 = r13.a(r14, r2, r2, r2)
            int r0 = r14 + 1
            float r0 = r13.a(r0, r1, r1, r2)
        L23c:
            r5[r19] = r20
            int r20 = r19 + 1
            r5[r20] = r16
            int r20 = r19 + 2
            r5[r20] = r0
            int r0 = r19 + 3
            r5[r0] = r17
            int r19 = r19 + 4
            int r14 = r14 + 1
            r0 = r21
            goto L1ed
        L251:
            if (r11 == r12) goto L25d
            int r11 = r11 + 1
            r0 = r31
            r2 = r19
            goto L1c6
        L25b:
            r31 = r0
        L25d:
            int r0 = r4.A
            int r1 = defpackage.k47.d(r31)
            int r1 = r1 * 4
            int r1 = r1 + r0
            int r0 = r4.A
        L268:
            if (r0 >= r1) goto L27d
            int r2 = r0 + 1
            r7 = r5[r2]
            float r8 = r3.A
            float r7 = r7 + r8
            r5[r2] = r7
            int r2 = r0 + 3
            r7 = r5[r2]
            float r7 = r7 + r8
            r5[r2] = r7
            int r0 = r0 + 4
            goto L268
        L27d:
            r4.A = r1
            float r0 = r3.A
            float r1 = r6.b()
            float r1 = r1 + r0
            r3.A = r1
            return r18
        L289:
            r18 = r2
            of5 r5 = (defpackage.of5) r5
            dh5 r4 = (defpackage.dh5) r4
            long r8 = r0.B
            r13 = r3
            z40 r13 = (defpackage.z40) r13
            r6 = r32
            um3 r6 = (defpackage.um3) r6
            r6.b()
            float r1 = r5.a
            float r2 = r5.b
            zj0 r3 = r6.A
            bt r0 = r3.B
            java.lang.Object r0 = r0.B
            os0 r0 = (defpackage.os0) r0
            r0.g0(r1, r2)
            java.lang.Object r0 = r4.A     // Catch: java.lang.Throwable -> L2c4
            r7 = r0
            zh r7 = (defpackage.zh) r7     // Catch: java.lang.Throwable -> L2c4
            r14 = 0
            r15 = 890(0x37a, float:1.247E-42)
            r10 = 0
            r12 = 0
            defpackage.no1.z(r6, r7, r8, r10, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L2c4
            bt r0 = r3.B
            java.lang.Object r0 = r0.B
            os0 r0 = (defpackage.os0) r0
            float r1 = -r1
            float r2 = -r2
            r0.g0(r1, r2)
            return r18
        L2c4:
            r0 = move-exception
            bt r3 = r3.B
            java.lang.Object r3 = r3.B
            os0 r3 = (defpackage.os0) r3
            float r1 = -r1
            float r2 = -r2
            r3.g0(r1, r2)
            throw r0
    }
}

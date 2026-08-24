package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: me2  reason: default package */
/* loaded from: classes.dex */
public final class me2 extends defpackage.rq7 {
    public int G0;
    public int H0;
    public int I0;
    public int J0;
    public int K0;
    public int L0;
    public float M0;
    public float N0;
    public float O0;
    public float P0;
    public float Q0;
    public float R0;
    public int S0;
    public int T0;
    public int U0;
    public int V0;
    public int W0;
    public int X0;
    public int Y0;
    public final java.util.ArrayList Z0;
    public defpackage.l21[] a1;
    public defpackage.l21[] b1;
    public int[] c1;
    public defpackage.l21[] d1;
    public int e1;

    public me2() {
            r3 = this;
            r3.<init>()
            r0 = -1
            r3.G0 = r0
            r3.H0 = r0
            r3.I0 = r0
            r3.J0 = r0
            r3.K0 = r0
            r3.L0 = r0
            r1 = 1056964608(0x3f000000, float:0.5)
            r3.M0 = r1
            r3.N0 = r1
            r3.O0 = r1
            r3.P0 = r1
            r3.Q0 = r1
            r3.R0 = r1
            r1 = 0
            r3.S0 = r1
            r3.T0 = r1
            r2 = 2
            r3.U0 = r2
            r3.V0 = r2
            r3.W0 = r1
            r3.X0 = r0
            r3.Y0 = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.Z0 = r0
            r0 = 0
            r3.a1 = r0
            r3.b1 = r0
            r3.c1 = r0
            r3.e1 = r1
            return
    }

    @Override // defpackage.rq7
    public final void V(int r37, int r38, int r39, int r40) {
            r36 = this;
            r1 = r36
            r8 = r37
            r9 = r38
            r10 = r39
            int r0 = r1.u0
            r12 = 1
            r13 = 0
            if (r0 <= 0) goto L78
            l21 r0 = r1.U
            if (r0 == 0) goto L17
            m21 r0 = (defpackage.m21) r0
            p11 r0 = r0.x0
            goto L18
        L17:
            r0 = 0
        L18:
            if (r0 != 0) goto L21
            r1.C0 = r13
            r1.D0 = r13
            r1.B0 = r13
            return
        L21:
            r3 = r13
        L22:
            int r4 = r1.u0
            if (r3 >= r4) goto L78
            l21[] r4 = r1.t0
            r4 = r4[r3]
            if (r4 != 0) goto L2d
            goto L75
        L2d:
            boolean r5 = r4 instanceof defpackage.av2
            if (r5 == 0) goto L32
            goto L75
        L32:
            k21 r5 = r4.k(r13)
            k21 r6 = r4.k(r12)
            k21 r7 = defpackage.k21.MATCH_CONSTRAINT
            if (r5 != r7) goto L49
            int r14 = r4.r
            if (r14 == r12) goto L49
            if (r6 != r7) goto L49
            int r14 = r4.s
            if (r14 == r12) goto L49
            goto L75
        L49:
            if (r5 != r7) goto L4d
            k21 r5 = defpackage.k21.WRAP_CONTENT
        L4d:
            if (r6 != r7) goto L51
            k21 r6 = defpackage.k21.WRAP_CONTENT
        L51:
            e30 r7 = r1.E0
            r7.a = r5
            r7.b = r6
            int r5 = r4.r()
            r7.c = r5
            int r5 = r4.l()
            r7.d = r5
            r0.b(r4, r7)
            int r5 = r7.e
            r4.P(r5)
            int r5 = r7.f
            r4.M(r5)
            int r5 = r7.g
            r4.J(r5)
        L75:
            int r3 = r3 + 1
            goto L22
        L78:
            int r14 = r1.z0
            int r15 = r1.A0
            int r0 = r1.v0
            int r3 = r1.w0
            r4 = 2
            int[] r5 = new int[r4]
            int r6 = r9 - r14
            int r6 = r6 - r15
            int r7 = r1.Y0
            if (r7 != r12) goto L8d
            int r6 = r40 - r0
            int r6 = r6 - r3
        L8d:
            r26 = r6
            int r6 = r1.G0
            r2 = -1
            if (r7 != 0) goto L9f
            if (r6 != r2) goto L98
            r1.G0 = r13
        L98:
            int r6 = r1.H0
            if (r6 != r2) goto La9
            r1.H0 = r13
            goto La9
        L9f:
            if (r6 != r2) goto La3
            r1.G0 = r13
        La3:
            int r6 = r1.H0
            if (r6 != r2) goto La9
            r1.H0 = r13
        La9:
            l21[] r2 = r1.t0
            r6 = r13
            r7 = r6
            r27 = r7
        Laf:
            int r13 = r1.u0
            r4 = 8
            if (r6 >= r13) goto Lc3
            l21[] r13 = r1.t0
            r13 = r13[r6]
            int r13 = r13.h0
            if (r13 != r4) goto Lbf
            int r7 = r7 + 1
        Lbf:
            int r6 = r6 + 1
            r4 = 2
            goto Laf
        Lc3:
            if (r7 <= 0) goto Le0
            int r13 = r13 - r7
            l21[] r2 = new defpackage.l21[r13]
            r6 = r27
            r7 = r6
        Lcb:
            int r13 = r1.u0
            if (r6 >= r13) goto Ldf
            l21[] r13 = r1.t0
            r13 = r13[r6]
            int r12 = r13.h0
            if (r12 == r4) goto Ldb
            r2[r7] = r13
            int r7 = r7 + 1
        Ldb:
            int r6 = r6 + 1
            r12 = 1
            goto Lcb
        Ldf:
            r13 = r7
        Le0:
            r12 = r2
            r1.d1 = r12
            r1.e1 = r13
            int r2 = r1.W0
            java.util.ArrayList r4 = r1.Z0
            if (r2 == 0) goto L62f
            h11 r6 = r1.J
            h11 r7 = r1.I
            r29 = r14
            h11 r14 = r1.K
            r30 = r14
            h11 r14 = r1.L
            r18 = r0
            r0 = 1
            if (r2 == r0) goto L458
            r0 = 2
            if (r2 == r0) goto L312
            r0 = 3
            if (r2 == r0) goto L10e
        L102:
            r32 = r3
            r33 = r5
            r35 = r15
            r31 = r18
        L10a:
            r28 = 1
            goto L6b6
        L10e:
            int r2 = r1.Y0
            if (r13 != 0) goto L113
            goto L102
        L113:
            r4.clear()
            ke2 r0 = new ke2
            r16 = r5
            h11 r5 = r1.K
            r17 = r6
            h11 r6 = r1.L
            r19 = r3
            h11 r3 = r1.I
            r20 = r4
            h11 r4 = r1.J
            r34 = r14
            r33 = r16
            r31 = r18
            r32 = r19
            r14 = r20
            r16 = r7
            r7 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r14.add(r0)
            if (r2 != 0) goto L1b6
            r3 = r27
            r4 = r3
            r5 = r4
            r6 = r5
        L143:
            if (r3 >= r13) goto L1b2
            r28 = 1
            int r4 = r4 + 1
            r35 = r15
            r15 = r12[r3]
            int r18 = r1.Y(r15, r7)
            r19 = r2
            k21[] r2 = r15.T
            r2 = r2[r27]
            r20 = r3
            k21 r3 = defpackage.k21.MATCH_CONSTRAINT
            if (r2 != r3) goto L15f
            int r5 = r5 + 1
        L15f:
            r21 = r5
            if (r6 == r7) goto L16a
            int r2 = r1.S0
            int r2 = r2 + r6
            int r2 = r2 + r18
            if (r2 <= r7) goto L170
        L16a:
            l21 r2 = r0.b
            if (r2 == 0) goto L170
            r2 = 1
            goto L172
        L170:
            r2 = r27
        L172:
            if (r2 != 0) goto L17d
            if (r20 <= 0) goto L17d
            int r3 = r1.X0
            if (r3 <= 0) goto L17d
            if (r4 <= r3) goto L17d
            r2 = 1
        L17d:
            if (r2 == 0) goto L199
            ke2 r0 = new ke2
            h11 r5 = r1.K
            h11 r6 = r1.L
            h11 r3 = r1.I
            h11 r4 = r1.J
            r2 = r19
            r11 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0.n = r11
            r14.add(r0)
            r6 = r18
            r4 = 1
            goto L1a8
        L199:
            r2 = r19
            r11 = r20
            if (r11 <= 0) goto L1a6
            int r3 = r1.S0
            int r3 = r3 + r18
            int r3 = r3 + r6
            r6 = r3
            goto L1a8
        L1a6:
            r6 = r18
        L1a8:
            r0.a(r15)
            int r3 = r11 + 1
            r5 = r21
            r15 = r35
            goto L143
        L1b2:
            r35 = r15
            goto L223
        L1b6:
            r35 = r15
            r3 = r27
            r4 = r3
            r5 = r4
            r11 = r5
        L1bd:
            if (r11 >= r13) goto L222
            r28 = 1
            int r3 = r3 + 1
            r15 = r12[r11]
            int r18 = r1.X(r15, r7)
            k21[] r6 = r15.T
            r6 = r6[r28]
            r19 = r2
            k21 r2 = defpackage.k21.MATCH_CONSTRAINT
            if (r6 != r2) goto L1d5
            int r4 = r4 + 1
        L1d5:
            r20 = r4
            if (r5 == r7) goto L1e0
            int r2 = r1.T0
            int r2 = r2 + r5
            int r2 = r2 + r18
            if (r2 <= r7) goto L1e6
        L1e0:
            l21 r2 = r0.b
            if (r2 == 0) goto L1e6
            r2 = 1
            goto L1e8
        L1e6:
            r2 = r27
        L1e8:
            if (r2 != 0) goto L1f3
            if (r11 <= 0) goto L1f3
            int r4 = r1.X0
            if (r4 <= 0) goto L1f3
            if (r3 <= r4) goto L1f3
            r2 = 1
        L1f3:
            if (r2 == 0) goto L20d
            ke2 r0 = new ke2
            h11 r5 = r1.K
            h11 r6 = r1.L
            h11 r3 = r1.I
            h11 r4 = r1.J
            r2 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0.n = r11
            r14.add(r0)
            r5 = r18
            r3 = 1
            goto L21a
        L20d:
            r2 = r19
            if (r11 <= 0) goto L218
            int r4 = r1.T0
            int r4 = r4 + r18
            int r4 = r4 + r5
            r5 = r4
            goto L21a
        L218:
            r5 = r18
        L21a:
            r0.a(r15)
            int r11 = r11 + 1
            r4 = r20
            goto L1bd
        L222:
            r5 = r4
        L223:
            int r0 = r14.size()
            int r3 = r1.z0
            int r4 = r1.v0
            int r6 = r1.A0
            int r11 = r1.w0
            k21[] r12 = r1.T
            r13 = r12[r27]
            k21 r15 = defpackage.k21.WRAP_CONTENT
            if (r13 == r15) goto L241
            r28 = 1
            r12 = r12[r28]
            if (r12 != r15) goto L23e
            goto L241
        L23e:
            r12 = r27
            goto L242
        L241:
            r12 = 1
        L242:
            if (r5 <= 0) goto L268
            if (r12 == 0) goto L268
            r5 = r27
        L248:
            if (r5 >= r0) goto L268
            java.lang.Object r12 = r14.get(r5)
            ke2 r12 = (defpackage.ke2) r12
            if (r2 != 0) goto L25c
            int r13 = r12.d()
            int r13 = r7 - r13
            r12.e(r13)
            goto L265
        L25c:
            int r13 = r12.c()
            int r13 = r7 - r13
            r12.e(r13)
        L265:
            int r5 = r5 + 1
            goto L248
        L268:
            r22 = r3
            r23 = r4
            r24 = r6
            r25 = r11
            r18 = r16
            r19 = r17
            r3 = r27
            r4 = r3
            r5 = r4
            r20 = r30
            r21 = r34
        L27c:
            if (r3 >= r0) goto L30a
            java.lang.Object r6 = r14.get(r3)
            ke2 r6 = (defpackage.ke2) r6
            if (r2 != 0) goto L2c6
            int r11 = r0 + (-1)
            if (r3 >= r11) goto L29b
            int r11 = r3 + 1
            java.lang.Object r11 = r14.get(r11)
            ke2 r11 = (defpackage.ke2) r11
            l21 r11 = r11.b
            h11 r11 = r11.J
            r21 = r11
            r25 = r27
            goto L2a1
        L29b:
            int r11 = r1.w0
            r25 = r11
            r21 = r34
        L2a1:
            l21 r11 = r6.b
            h11 r11 = r11.L
            r17 = r2
            r16 = r6
            r26 = r7
            r16.f(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            int r12 = r6.d()
            int r4 = java.lang.Math.max(r4, r12)
            int r6 = r6.c()
            int r6 = r6 + r5
            if (r3 <= 0) goto L2c0
            int r5 = r1.T0
            int r6 = r6 + r5
        L2c0:
            r5 = r6
            r19 = r11
            r23 = r27
            goto L306
        L2c6:
            int r11 = r0 + (-1)
            if (r3 >= r11) goto L2db
            int r11 = r3 + 1
            java.lang.Object r11 = r14.get(r11)
            ke2 r11 = (defpackage.ke2) r11
            l21 r11 = r11.b
            h11 r11 = r11.I
            r20 = r11
            r24 = r27
            goto L2e1
        L2db:
            int r11 = r1.A0
            r24 = r11
            r20 = r30
        L2e1:
            l21 r11 = r6.b
            h11 r11 = r11.K
            r17 = r2
            r16 = r6
            r26 = r7
            r16.f(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            int r6 = r16.d()
            int r6 = r6 + r4
            int r4 = r16.c()
            int r4 = java.lang.Math.max(r5, r4)
            if (r3 <= 0) goto L300
            int r5 = r1.S0
            int r6 = r6 + r5
        L300:
            r5 = r4
            r4 = r6
            r18 = r11
            r22 = r27
        L306:
            int r3 = r3 + 1
            goto L27c
        L30a:
            r33[r27] = r4
            r28 = 1
            r33[r28] = r5
            goto L10a
        L312:
            r32 = r3
            r33 = r5
            r35 = r15
            r31 = r18
            r7 = r26
            int r0 = r1.Y0
            int r2 = r1.X0
            if (r0 != 0) goto L347
            if (r2 > 0) goto L345
            r2 = r27
            r3 = r2
            r4 = r3
        L328:
            if (r2 >= r13) goto L342
            if (r2 <= 0) goto L32f
            int r5 = r1.S0
            int r3 = r3 + r5
        L32f:
            r5 = r12[r2]
            if (r5 != 0) goto L334
            goto L33f
        L334:
            int r5 = r1.Y(r5, r7)
            int r5 = r5 + r3
            if (r5 <= r7) goto L33c
            goto L342
        L33c:
            int r4 = r4 + 1
            r3 = r5
        L33f:
            int r2 = r2 + 1
            goto L328
        L342:
            r2 = r27
            goto L36a
        L345:
            r4 = r2
            goto L342
        L347:
            if (r2 > 0) goto L368
            r2 = r27
            r3 = r2
            r4 = r3
        L34d:
            if (r2 >= r13) goto L367
            if (r2 <= 0) goto L354
            int r5 = r1.T0
            int r3 = r3 + r5
        L354:
            r5 = r12[r2]
            if (r5 != 0) goto L359
            goto L364
        L359:
            int r5 = r1.X(r5, r7)
            int r5 = r5 + r3
            if (r5 <= r7) goto L361
            goto L367
        L361:
            int r4 = r4 + 1
            r3 = r5
        L364:
            int r2 = r2 + 1
            goto L34d
        L367:
            r2 = r4
        L368:
            r4 = r27
        L36a:
            int[] r3 = r1.c1
            if (r3 != 0) goto L373
            r3 = 2
            int[] r3 = new int[r3]
            r1.c1 = r3
        L373:
            if (r2 != 0) goto L378
            r3 = 1
            if (r0 == r3) goto L37c
        L378:
            if (r4 != 0) goto L37e
            if (r0 != 0) goto L37e
        L37c:
            r3 = 1
            goto L380
        L37e:
            r3 = r27
        L380:
            if (r3 != 0) goto L44d
            if (r0 != 0) goto L38e
            float r2 = (float) r13
            float r5 = (float) r4
            float r2 = r2 / r5
            double r5 = (double) r2
            double r5 = java.lang.Math.ceil(r5)
            int r2 = (int) r5
            goto L397
        L38e:
            float r4 = (float) r13
            float r5 = (float) r2
            float r4 = r4 / r5
            double r4 = (double) r4
            double r4 = java.lang.Math.ceil(r4)
            int r4 = (int) r4
        L397:
            l21[] r5 = r1.b1
            if (r5 == 0) goto L39e
            int r6 = r5.length
            if (r6 >= r4) goto L3a0
        L39e:
            r6 = 0
            goto L3a5
        L3a0:
            r6 = 0
            java.util.Arrays.fill(r5, r6)
            goto L3a9
        L3a5:
            l21[] r5 = new defpackage.l21[r4]
            r1.b1 = r5
        L3a9:
            l21[] r5 = r1.a1
            if (r5 == 0) goto L3b5
            int r11 = r5.length
            if (r11 >= r2) goto L3b1
            goto L3b5
        L3b1:
            java.util.Arrays.fill(r5, r6)
            goto L3b9
        L3b5:
            l21[] r5 = new defpackage.l21[r2]
            r1.a1 = r5
        L3b9:
            r5 = r27
        L3bb:
            if (r5 >= r4) goto L401
            r6 = r27
        L3bf:
            if (r6 >= r2) goto L3fe
            int r11 = r6 * r4
            int r11 = r11 + r5
            r14 = 1
            if (r0 != r14) goto L3ca
            int r11 = r5 * r2
            int r11 = r11 + r6
        L3ca:
            int r14 = r12.length
            if (r11 < r14) goto L3ce
            goto L3fb
        L3ce:
            r11 = r12[r11]
            if (r11 != 0) goto L3d3
            goto L3fb
        L3d3:
            int r14 = r1.Y(r11, r7)
            l21[] r15 = r1.b1
            r15 = r15[r5]
            if (r15 == 0) goto L3e3
            int r15 = r15.r()
            if (r15 >= r14) goto L3e7
        L3e3:
            l21[] r14 = r1.b1
            r14[r5] = r11
        L3e7:
            int r14 = r1.X(r11, r7)
            l21[] r15 = r1.a1
            r15 = r15[r6]
            if (r15 == 0) goto L3f7
            int r15 = r15.l()
            if (r15 >= r14) goto L3fb
        L3f7:
            l21[] r14 = r1.a1
            r14[r6] = r11
        L3fb:
            int r6 = r6 + 1
            goto L3bf
        L3fe:
            int r5 = r5 + 1
            goto L3bb
        L401:
            r5 = r27
            r6 = r5
        L404:
            if (r5 >= r4) goto L41a
            l21[] r11 = r1.b1
            r11 = r11[r5]
            if (r11 == 0) goto L417
            if (r5 <= 0) goto L411
            int r14 = r1.S0
            int r6 = r6 + r14
        L411:
            int r11 = r1.Y(r11, r7)
            int r11 = r11 + r6
            r6 = r11
        L417:
            int r5 = r5 + 1
            goto L404
        L41a:
            r5 = r27
            r11 = r5
        L41d:
            if (r5 >= r2) goto L433
            l21[] r14 = r1.a1
            r14 = r14[r5]
            if (r14 == 0) goto L430
            if (r5 <= 0) goto L42a
            int r15 = r1.T0
            int r11 = r11 + r15
        L42a:
            int r14 = r1.X(r14, r7)
            int r14 = r14 + r11
            r11 = r14
        L430:
            int r5 = r5 + 1
            goto L41d
        L433:
            r33[r27] = r6
            r14 = 1
            r33[r14] = r11
            if (r0 != 0) goto L445
            if (r6 <= r7) goto L442
            if (r4 <= r14) goto L442
            int r4 = r4 + (-1)
            goto L380
        L442:
            r3 = r14
            goto L380
        L445:
            if (r11 <= r7) goto L442
            if (r2 <= r14) goto L442
            int r2 = r2 + (-1)
            goto L380
        L44d:
            r14 = 1
            int[] r0 = r1.c1
            r0[r27] = r4
            r0[r14] = r2
            r28 = r14
            goto L6b6
        L458:
            r32 = r3
            r33 = r5
            r17 = r6
            r16 = r7
            r34 = r14
            r35 = r15
            r31 = r18
            r7 = r26
            r14 = r4
            int r2 = r1.Y0
            if (r13 != 0) goto L46f
            goto L10a
        L46f:
            r14.clear()
            ke2 r0 = new ke2
            h11 r5 = r1.K
            h11 r6 = r1.L
            h11 r3 = r1.I
            h11 r4 = r1.J
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r14.add(r0)
            if (r2 != 0) goto L4e1
            r3 = r27
            r4 = r3
            r11 = r4
        L488:
            if (r11 >= r13) goto L540
            r15 = r12[r11]
            int r18 = r1.Y(r15, r7)
            k21[] r5 = r15.T
            r5 = r5[r27]
            k21 r6 = defpackage.k21.MATCH_CONSTRAINT
            if (r5 != r6) goto L49a
            int r3 = r3 + 1
        L49a:
            r19 = r3
            if (r4 == r7) goto L4a5
            int r3 = r1.S0
            int r3 = r3 + r4
            int r3 = r3 + r18
            if (r3 <= r7) goto L4ab
        L4a5:
            l21 r3 = r0.b
            if (r3 == 0) goto L4ab
            r3 = 1
            goto L4ad
        L4ab:
            r3 = r27
        L4ad:
            if (r3 != 0) goto L4ba
            if (r11 <= 0) goto L4ba
            int r5 = r1.X0
            if (r5 <= 0) goto L4ba
            int r5 = r11 % r5
            if (r5 != 0) goto L4ba
            r3 = 1
        L4ba:
            if (r3 == 0) goto L4d1
            ke2 r0 = new ke2
            h11 r5 = r1.K
            h11 r6 = r1.L
            h11 r3 = r1.I
            h11 r4 = r1.J
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0.n = r11
            r14.add(r0)
        L4ce:
            r4 = r18
            goto L4d9
        L4d1:
            if (r11 <= 0) goto L4ce
            int r3 = r1.S0
            int r3 = r3 + r18
            int r3 = r3 + r4
            r4 = r3
        L4d9:
            r0.a(r15)
            int r11 = r11 + 1
            r3 = r19
            goto L488
        L4e1:
            r3 = r27
            r4 = r3
            r11 = r4
        L4e5:
            if (r11 >= r13) goto L540
            r15 = r12[r11]
            int r18 = r1.X(r15, r7)
            k21[] r5 = r15.T
            r28 = 1
            r5 = r5[r28]
            k21 r6 = defpackage.k21.MATCH_CONSTRAINT
            if (r5 != r6) goto L4f9
            int r3 = r3 + 1
        L4f9:
            r19 = r3
            if (r4 == r7) goto L504
            int r3 = r1.T0
            int r3 = r3 + r4
            int r3 = r3 + r18
            if (r3 <= r7) goto L50a
        L504:
            l21 r3 = r0.b
            if (r3 == 0) goto L50a
            r3 = 1
            goto L50c
        L50a:
            r3 = r27
        L50c:
            if (r3 != 0) goto L519
            if (r11 <= 0) goto L519
            int r5 = r1.X0
            if (r5 <= 0) goto L519
            int r5 = r11 % r5
            if (r5 != 0) goto L519
            r3 = 1
        L519:
            if (r3 == 0) goto L530
            ke2 r0 = new ke2
            h11 r5 = r1.K
            h11 r6 = r1.L
            h11 r3 = r1.I
            h11 r4 = r1.J
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0.n = r11
            r14.add(r0)
        L52d:
            r4 = r18
            goto L538
        L530:
            if (r11 <= 0) goto L52d
            int r3 = r1.T0
            int r3 = r3 + r18
            int r3 = r3 + r4
            r4 = r3
        L538:
            r0.a(r15)
            int r11 = r11 + 1
            r3 = r19
            goto L4e5
        L540:
            int r0 = r14.size()
            int r4 = r1.z0
            int r5 = r1.v0
            int r6 = r1.A0
            int r11 = r1.w0
            k21[] r12 = r1.T
            r13 = r12[r27]
            k21 r15 = defpackage.k21.WRAP_CONTENT
            if (r13 == r15) goto L55e
            r28 = 1
            r12 = r12[r28]
            if (r12 != r15) goto L55b
            goto L55e
        L55b:
            r12 = r27
            goto L55f
        L55e:
            r12 = 1
        L55f:
            if (r3 <= 0) goto L585
            if (r12 == 0) goto L585
            r3 = r27
        L565:
            if (r3 >= r0) goto L585
            java.lang.Object r12 = r14.get(r3)
            ke2 r12 = (defpackage.ke2) r12
            if (r2 != 0) goto L579
            int r13 = r12.d()
            int r13 = r7 - r13
            r12.e(r13)
            goto L582
        L579:
            int r13 = r12.c()
            int r13 = r7 - r13
            r12.e(r13)
        L582:
            int r3 = r3 + 1
            goto L565
        L585:
            r22 = r4
            r23 = r5
            r24 = r6
            r25 = r11
            r18 = r16
            r19 = r17
            r3 = r27
            r4 = r3
            r5 = r4
            r20 = r30
            r21 = r34
        L599:
            if (r3 >= r0) goto L627
            java.lang.Object r6 = r14.get(r3)
            ke2 r6 = (defpackage.ke2) r6
            if (r2 != 0) goto L5e3
            int r11 = r0 + (-1)
            if (r3 >= r11) goto L5b8
            int r11 = r3 + 1
            java.lang.Object r11 = r14.get(r11)
            ke2 r11 = (defpackage.ke2) r11
            l21 r11 = r11.b
            h11 r11 = r11.J
            r21 = r11
            r25 = r27
            goto L5be
        L5b8:
            int r11 = r1.w0
            r25 = r11
            r21 = r34
        L5be:
            l21 r11 = r6.b
            h11 r11 = r11.L
            r17 = r2
            r16 = r6
            r26 = r7
            r16.f(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            int r12 = r6.d()
            int r4 = java.lang.Math.max(r4, r12)
            int r6 = r6.c()
            int r6 = r6 + r5
            if (r3 <= 0) goto L5dd
            int r5 = r1.T0
            int r6 = r6 + r5
        L5dd:
            r5 = r6
            r19 = r11
            r23 = r27
            goto L623
        L5e3:
            int r11 = r0 + (-1)
            if (r3 >= r11) goto L5f8
            int r11 = r3 + 1
            java.lang.Object r11 = r14.get(r11)
            ke2 r11 = (defpackage.ke2) r11
            l21 r11 = r11.b
            h11 r11 = r11.I
            r20 = r11
            r24 = r27
            goto L5fe
        L5f8:
            int r11 = r1.A0
            r24 = r11
            r20 = r30
        L5fe:
            l21 r11 = r6.b
            h11 r11 = r11.K
            r17 = r2
            r16 = r6
            r26 = r7
            r16.f(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            int r6 = r16.d()
            int r6 = r6 + r4
            int r4 = r16.c()
            int r4 = java.lang.Math.max(r5, r4)
            if (r3 <= 0) goto L61d
            int r5 = r1.S0
            int r6 = r6 + r5
        L61d:
            r5 = r4
            r4 = r6
            r18 = r11
            r22 = r27
        L623:
            int r3 = r3 + 1
            goto L599
        L627:
            r33[r27] = r4
            r28 = 1
            r33[r28] = r5
            goto L10a
        L62f:
            r31 = r0
            r32 = r3
            r33 = r5
            r29 = r14
            r35 = r15
            r7 = r26
            r14 = r4
            int r2 = r1.Y0
            if (r13 != 0) goto L642
            goto L10a
        L642:
            int r0 = r14.size()
            if (r0 != 0) goto L659
            ke2 r0 = new ke2
            h11 r5 = r1.K
            h11 r6 = r1.L
            h11 r3 = r1.I
            h11 r4 = r1.J
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r14.add(r0)
            goto L69b
        L659:
            r17 = r2
            r0 = r27
            java.lang.Object r2 = r14.get(r0)
            ke2 r2 = (defpackage.ke2) r2
            r2.c = r0
            r6 = 0
            r2.b = r6
            r2.l = r0
            r2.m = r0
            r2.n = r0
            r2.o = r0
            r2.p = r0
            int r0 = r1.z0
            int r3 = r1.v0
            int r4 = r1.A0
            int r5 = r1.w0
            h11 r6 = r1.I
            h11 r11 = r1.J
            h11 r14 = r1.K
            h11 r15 = r1.L
            r22 = r0
            r16 = r2
            r23 = r3
            r24 = r4
            r25 = r5
            r18 = r6
            r26 = r7
            r19 = r11
            r20 = r14
            r21 = r15
            r16.f(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r0 = r16
        L69b:
            r2 = 0
        L69c:
            if (r2 >= r13) goto L6a6
            r3 = r12[r2]
            r0.a(r3)
            int r2 = r2 + 1
            goto L69c
        L6a6:
            int r2 = r0.d()
            r27 = 0
            r33[r27] = r2
            int r0 = r0.c()
            r28 = 1
            r33[r28] = r0
        L6b6:
            r0 = r33[r27]
            int r0 = r0 + r29
            int r0 = r0 + r35
            r2 = r33[r28]
            int r2 = r2 + r31
            int r2 = r2 + r32
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r8 != r4) goto L6ca
            r0 = r9
            goto L6d6
        L6ca:
            if (r8 != r3) goto L6d1
            int r0 = java.lang.Math.min(r0, r9)
            goto L6d6
        L6d1:
            if (r8 != 0) goto L6d4
            goto L6d6
        L6d4:
            r0 = r27
        L6d6:
            if (r10 != r4) goto L6db
            r2 = r40
            goto L6e9
        L6db:
            if (r10 != r3) goto L6e4
            r11 = r40
            int r2 = java.lang.Math.min(r2, r11)
            goto L6e9
        L6e4:
            if (r10 != 0) goto L6e7
            goto L6e9
        L6e7:
            r2 = r27
        L6e9:
            r1.C0 = r0
            r1.D0 = r2
            r1.P(r0)
            r1.M(r2)
            int r0 = r1.u0
            if (r0 <= 0) goto L6fa
            r12 = r28
            goto L6fc
        L6fa:
            r12 = r27
        L6fc:
            r1.B0 = r12
            return
    }

    public final int X(defpackage.l21 r10, int r11) {
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            k21[] r1 = r10.T
            r2 = 1
            r1 = r1[r2]
            k21 r3 = defpackage.k21.MATCH_CONSTRAINT
            if (r1 != r3) goto L4a
            int r1 = r10.s
            if (r1 != 0) goto L12
            return r0
        L12:
            r3 = 2
            if (r1 != r3) goto L32
            float r1 = r10.z
            float r11 = (float) r11
            float r1 = r1 * r11
            int r8 = (int) r1
            int r11 = r10.l()
            if (r8 == r11) goto L31
            r10.g = r2
            k21[] r11 = r10.T
            r5 = r11[r0]
            int r6 = r10.r()
            k21 r7 = defpackage.k21.FIXED
            r3 = r9
            r4 = r10
            r3.W(r4, r5, r6, r7, r8)
        L31:
            return r8
        L32:
            r4 = r10
            if (r1 != r2) goto L3a
            int r9 = r4.l()
            return r9
        L3a:
            r9 = 3
            if (r1 != r9) goto L4b
            int r9 = r4.r()
            float r9 = (float) r9
            float r10 = r4.X
            float r9 = r9 * r10
            r10 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 + r10
            int r9 = (int) r9
            return r9
        L4a:
            r4 = r10
        L4b:
            int r9 = r4.l()
            return r9
    }

    public final int Y(defpackage.l21 r10, int r11) {
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            k21[] r1 = r10.T
            r1 = r1[r0]
            k21 r2 = defpackage.k21.MATCH_CONSTRAINT
            if (r1 != r2) goto L4a
            int r1 = r10.r
            if (r1 != 0) goto L11
            return r0
        L11:
            r0 = 2
            r2 = 1
            if (r1 != r0) goto L32
            float r0 = r10.w
            float r11 = (float) r11
            float r0 = r0 * r11
            int r6 = (int) r0
            int r11 = r10.r()
            if (r6 == r11) goto L31
            r10.g = r2
            k21 r5 = defpackage.k21.FIXED
            k21[] r11 = r10.T
            r7 = r11[r2]
            int r8 = r10.l()
            r3 = r9
            r4 = r10
            r3.W(r4, r5, r6, r7, r8)
        L31:
            return r6
        L32:
            r4 = r10
            if (r1 != r2) goto L3a
            int r9 = r4.r()
            return r9
        L3a:
            r9 = 3
            if (r1 != r9) goto L4b
            int r9 = r4.l()
            float r9 = (float) r9
            float r10 = r4.X
            float r9 = r9 * r10
            r10 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 + r10
            int r9 = (int) r9
            return r9
        L4a:
            r4 = r10
        L4b:
            int r9 = r4.r()
            return r9
    }

    @Override // defpackage.l21
    public final void b(defpackage.jv3 r12, boolean r13) {
            r11 = this;
            super.b(r12, r13)
            l21 r12 = r11.U
            r13 = 0
            r0 = 1
            if (r12 == 0) goto L11
            m21 r12 = (defpackage.m21) r12
            boolean r12 = r12.y0
            if (r12 == 0) goto L11
            r12 = r0
            goto L12
        L11:
            r12 = r13
        L12:
            int r1 = r11.W0
            java.util.ArrayList r2 = r11.Z0
            if (r1 == 0) goto L157
            if (r1 == r0) goto L13d
            r3 = 2
            if (r1 == r3) goto L3c
            r3 = 3
            if (r1 == r3) goto L22
            goto L166
        L22:
            int r1 = r2.size()
            r3 = r13
        L27:
            if (r3 >= r1) goto L166
            java.lang.Object r4 = r2.get(r3)
            ke2 r4 = (defpackage.ke2) r4
            int r5 = r1 + (-1)
            if (r3 != r5) goto L35
            r5 = r0
            goto L36
        L35:
            r5 = r13
        L36:
            r4.b(r3, r12, r5)
            int r3 = r3 + 1
            goto L27
        L3c:
            int[] r1 = r11.c1
            if (r1 == 0) goto L166
            l21[] r1 = r11.b1
            if (r1 == 0) goto L166
            l21[] r1 = r11.a1
            if (r1 != 0) goto L4a
            goto L166
        L4a:
            r1 = r13
        L4b:
            int r2 = r11.e1
            if (r1 >= r2) goto L59
            l21[] r2 = r11.d1
            r2 = r2[r1]
            r2.E()
            int r1 = r1 + 1
            goto L4b
        L59:
            int[] r1 = r11.c1
            r2 = r1[r13]
            r1 = r1[r0]
            float r3 = r11.M0
            r4 = 0
            r5 = r13
        L63:
            r6 = 8
            if (r5 >= r2) goto Lb0
            if (r12 == 0) goto L72
            int r3 = r2 - r5
            int r3 = r3 - r0
            r7 = 1065353216(0x3f800000, float:1.0)
            float r8 = r11.M0
            float r7 = r7 - r8
            goto L74
        L72:
            r7 = r3
            r3 = r5
        L74:
            l21[] r8 = r11.b1
            r3 = r8[r3]
            if (r3 == 0) goto Lac
            h11 r8 = r3.I
            int r9 = r3.h0
            if (r9 != r6) goto L81
            goto Lac
        L81:
            if (r5 != 0) goto L90
            h11 r6 = r11.I
            int r9 = r11.z0
            r3.f(r8, r6, r9)
            int r6 = r11.G0
            r3.k0 = r6
            r3.e0 = r7
        L90:
            int r6 = r2 + (-1)
            if (r5 != r6) goto L9d
            h11 r6 = r3.K
            h11 r9 = r11.K
            int r10 = r11.A0
            r3.f(r6, r9, r10)
        L9d:
            if (r5 <= 0) goto Lab
            if (r4 == 0) goto Lab
            h11 r6 = r4.K
            int r9 = r11.S0
            r3.f(r8, r6, r9)
            r4.f(r6, r8, r13)
        Lab:
            r4 = r3
        Lac:
            int r5 = r5 + 1
            r3 = r7
            goto L63
        Lb0:
            r12 = r13
        Lb1:
            if (r12 >= r1) goto Lf0
            l21[] r3 = r11.a1
            r3 = r3[r12]
            if (r3 == 0) goto Led
            h11 r5 = r3.J
            int r7 = r3.h0
            if (r7 != r6) goto Lc0
            goto Led
        Lc0:
            if (r12 != 0) goto Ld1
            h11 r7 = r11.J
            int r8 = r11.v0
            r3.f(r5, r7, r8)
            int r7 = r11.H0
            r3.l0 = r7
            float r7 = r11.N0
            r3.f0 = r7
        Ld1:
            int r7 = r1 + (-1)
            if (r12 != r7) goto Lde
            h11 r7 = r3.L
            h11 r8 = r11.L
            int r9 = r11.w0
            r3.f(r7, r8, r9)
        Lde:
            if (r12 <= 0) goto Lec
            if (r4 == 0) goto Lec
            h11 r7 = r4.L
            int r8 = r11.T0
            r3.f(r5, r7, r8)
            r4.f(r7, r5, r13)
        Lec:
            r4 = r3
        Led:
            int r12 = r12 + 1
            goto Lb1
        Lf0:
            r12 = r13
        Lf1:
            if (r12 >= r2) goto L166
            r3 = r13
        Lf4:
            if (r3 >= r1) goto L13a
            int r4 = r3 * r2
            int r4 = r4 + r12
            int r5 = r11.Y0
            if (r5 != r0) goto L100
            int r4 = r12 * r1
            int r4 = r4 + r3
        L100:
            l21[] r5 = r11.d1
            int r7 = r5.length
            if (r4 < r7) goto L106
            goto L137
        L106:
            r4 = r5[r4]
            if (r4 == 0) goto L137
            int r5 = r4.h0
            if (r5 != r6) goto L10f
            goto L137
        L10f:
            l21[] r5 = r11.b1
            r5 = r5[r12]
            l21[] r7 = r11.a1
            r7 = r7[r3]
            if (r4 == r5) goto L127
            h11 r8 = r4.I
            h11 r9 = r5.I
            r4.f(r8, r9, r13)
            h11 r8 = r4.K
            h11 r5 = r5.K
            r4.f(r8, r5, r13)
        L127:
            if (r4 == r7) goto L137
            h11 r5 = r4.J
            h11 r8 = r7.J
            r4.f(r5, r8, r13)
            h11 r5 = r4.L
            h11 r7 = r7.L
            r4.f(r5, r7, r13)
        L137:
            int r3 = r3 + 1
            goto Lf4
        L13a:
            int r12 = r12 + 1
            goto Lf1
        L13d:
            int r1 = r2.size()
            r3 = r13
        L142:
            if (r3 >= r1) goto L166
            java.lang.Object r4 = r2.get(r3)
            ke2 r4 = (defpackage.ke2) r4
            int r5 = r1 + (-1)
            if (r3 != r5) goto L150
            r5 = r0
            goto L151
        L150:
            r5 = r13
        L151:
            r4.b(r3, r12, r5)
            int r3 = r3 + 1
            goto L142
        L157:
            int r1 = r2.size()
            if (r1 <= 0) goto L166
            java.lang.Object r1 = r2.get(r13)
            ke2 r1 = (defpackage.ke2) r1
            r1.b(r13, r12, r0)
        L166:
            r11.B0 = r13
            return
    }

    @Override // defpackage.gx2, defpackage.l21
    public final void g(defpackage.l21 r1, java.util.HashMap r2) {
            r0 = this;
            super.g(r1, r2)
            me2 r1 = (defpackage.me2) r1
            int r2 = r1.G0
            r0.G0 = r2
            int r2 = r1.H0
            r0.H0 = r2
            int r2 = r1.I0
            r0.I0 = r2
            int r2 = r1.J0
            r0.J0 = r2
            int r2 = r1.K0
            r0.K0 = r2
            int r2 = r1.L0
            r0.L0 = r2
            float r2 = r1.M0
            r0.M0 = r2
            float r2 = r1.N0
            r0.N0 = r2
            float r2 = r1.O0
            r0.O0 = r2
            float r2 = r1.P0
            r0.P0 = r2
            float r2 = r1.Q0
            r0.Q0 = r2
            float r2 = r1.R0
            r0.R0 = r2
            int r2 = r1.S0
            r0.S0 = r2
            int r2 = r1.T0
            r0.T0 = r2
            int r2 = r1.U0
            r0.U0 = r2
            int r2 = r1.V0
            r0.V0 = r2
            int r2 = r1.W0
            r0.W0 = r2
            int r2 = r1.X0
            r0.X0 = r2
            int r1 = r1.Y0
            r0.Y0 = r1
            return
    }
}

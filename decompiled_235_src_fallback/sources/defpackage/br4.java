package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: br4  reason: default package */
/* loaded from: classes.dex */
public final class br4 implements defpackage.eq3 {
    public final /* synthetic */ defpackage.ue1 a;
    public final /* synthetic */ defpackage.lo4 b;
    public final /* synthetic */ defpackage.lq4 c;
    public final /* synthetic */ defpackage.cs1 d;
    public final /* synthetic */ defpackage.on2 e;
    public final /* synthetic */ defpackage.on2 f;
    public final /* synthetic */ defpackage.d40 g;
    public final /* synthetic */ defpackage.cs1 h;
    public final /* synthetic */ defpackage.w61 i;

    public br4(defpackage.ue1 r1, defpackage.lo4 r2, defpackage.lq4 r3, defpackage.cs1 r4, defpackage.qo3 r5, defpackage.on2 r6, defpackage.d40 r7, defpackage.cs1 r8, defpackage.w61 r9) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            r0.h = r8
            r0.i = r9
            return
    }

    @Override // defpackage.eq3
    public final defpackage.f34 a(defpackage.fq3 r53, long r54) {
            r52 = this;
            r0 = r52
            r1 = r53
            r13 = r54
            qt6 r15 = r1.B
            ue1 r2 = r0.a
            qa4 r3 = r2.A
            r3.getValue()
            lo4 r3 = defpackage.lo4.Vertical
            lo4 r6 = r0.b
            if (r6 != r3) goto L17
            r7 = 1
            goto L18
        L17:
            r7 = 0
        L18:
            if (r7 == 0) goto L1c
            r8 = r3
            goto L1e
        L1c:
            lo4 r8 = defpackage.lo4.Horizontal
        L1e:
            defpackage.mb3.s(r13, r8)
            lq4 r8 = r0.c
            if (r7 == 0) goto L32
            kk3 r9 = r15.getLayoutDirection()
            float r9 = r8.b(r9)
            int r9 = r15.r0(r9)
            goto L3e
        L32:
            kk3 r9 = r15.getLayoutDirection()
            float r9 = defpackage.ge7.r(r8, r9)
            int r9 = r15.r0(r9)
        L3e:
            if (r7 == 0) goto L4d
            kk3 r10 = r15.getLayoutDirection()
            float r10 = r8.c(r10)
            int r10 = r15.r0(r10)
            goto L59
        L4d:
            kk3 r10 = r15.getLayoutDirection()
            float r10 = defpackage.ge7.q(r8, r10)
            int r10 = r15.r0(r10)
        L59:
            float r11 = r8.d()
            int r11 = r15.r0(r11)
            float r8 = r8.a()
            int r8 = r15.r0(r8)
            int r8 = r8 + r11
            int r12 = r9 + r10
            if (r7 == 0) goto L71
            r16 = r8
            goto L73
        L71:
            r16 = r12
        L73:
            if (r7 == 0) goto L77
            r10 = r11
            goto L7a
        L77:
            if (r7 != 0) goto L7a
            r10 = r9
        L7a:
            int r16 = r16 - r10
            int r4 = -r12
            int r5 = -r8
            long r4 = defpackage.s21.i(r13, r4, r5)
            r2.n = r1
            r1 = 0
            int r19 = r15.r0(r1)
            if (r7 == 0) goto L95
            int r7 = defpackage.q21.g(r13)
            int r7 = r7 - r8
        L90:
            r21 = r1
            r20 = r2
            goto L9b
        L95:
            int r7 = defpackage.q21.h(r13)
            int r7 = r7 - r12
            goto L90
        L9b:
            long r1 = (long) r9
            r9 = 32
            long r1 = r1 << r9
            r22 = r1
            long r1 = (long) r11
            r24 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r24
            long r1 = r22 | r1
            cs1 r9 = r0.d
            r9.getClass()
            if (r7 >= 0) goto Lb4
            r11 = 0
            goto Lb5
        Lb4:
            r11 = r7
        Lb5:
            if (r6 != r3) goto Lbc
            int r9 = defpackage.q21.h(r4)
            goto Lbd
        Lbc:
            r9 = r11
        Lbd:
            if (r6 == r3) goto Lc6
            int r6 = defpackage.q21.g(r4)
        Lc3:
            r22 = r1
            goto Lc8
        Lc6:
            r6 = r11
            goto Lc3
        Lc8:
            r1 = 5
            r2 = 0
            defpackage.s21.b(r2, r9, r2, r6, r1)
            on2 r2 = r0.e
            java.lang.Object r2 = r2.c()
            ar4 r2 = (defpackage.ar4) r2
            cs1 r6 = r0.h
            vl6 r9 = defpackage.ln2.t()
            if (r9 == 0) goto Le6
            qn2 r25 = r9.e()
            r1 = r25
        Le3:
            r26 = r4
            goto Le8
        Le6:
            r1 = 0
            goto Le3
        Le8:
            vl6 r4 = defpackage.ln2.N(r9)
            int r5 = r20.k()     // Catch: java.lang.Throwable -> L8ec
            r28 = r6
            r6 = r20
            r20 = r7
            er4 r7 = r6.d     // Catch: java.lang.Throwable -> L8ec
            r29 = r8
            java.lang.Object r8 = r7.e     // Catch: java.lang.Throwable -> L8ec
            int r8 = defpackage.bl2.y(r5, r2, r8)     // Catch: java.lang.Throwable -> L8ec
            if (r5 == r8) goto L10f
            r30 = r11
            ss4 r11 = r7.b     // Catch: java.lang.Throwable -> L8ec
            r11.i(r8)     // Catch: java.lang.Throwable -> L8ec
            hq3 r7 = r7.f     // Catch: java.lang.Throwable -> L8ec
            r7.a(r5)     // Catch: java.lang.Throwable -> L8ec
            goto L111
        L10f:
            r30 = r11
        L111:
            r6.k()     // Catch: java.lang.Throwable -> L8ec
            float r5 = r6.l()     // Catch: java.lang.Throwable -> L8ec
            r6.n()     // Catch: java.lang.Throwable -> L8ec
            r28.getClass()     // Catch: java.lang.Throwable -> L8ec
            int r7 = r30 + r19
            float r11 = (float) r7     // Catch: java.lang.Throwable -> L8ec
            float r5 = r5 * r11
            float r5 = r21 - r5
            int r5 = defpackage.u24.E(r5)     // Catch: java.lang.Throwable -> L8ec
            defpackage.ln2.V(r9, r4, r1)
            mq3 r1 = r6.y
            p70 r4 = r6.u
            java.util.List r1 = defpackage.nj2.g(r2, r1, r4)
            p94 r4 = defpackage.h93.a
            p94 r11 = new p94
            r11.<init>()
            on2 r4 = r0.f
            java.lang.Object r4 = r4.c()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            qa4 r9 = r6.z
            if (r10 < 0) goto L14b
            goto L150
        L14b:
            java.lang.String r28 = "negative beforeContentPadding"
            defpackage.s53.a(r28)
        L150:
            if (r16 < 0) goto L153
            goto L158
        L153:
            java.lang.String r28 = "negative afterContentPadding"
            defpackage.s53.a(r28)
        L158:
            r28 = r1
            if (r7 >= 0) goto L15e
            r1 = 0
            goto L15f
        L15e:
            r1 = r7
        L15f:
            r32 = r1
            r1 = r4
            r31 = r7
            if (r4 >= 0) goto L168
            r7 = r1
            goto L169
        L168:
            r7 = 0
        L169:
            lo4 r4 = r0.b
            if (r4 != r3) goto L178
            int r33 = defpackage.q21.h(r26)
            r50 = r33
            r33 = r2
            r2 = r50
            goto L17c
        L178:
            r33 = r2
            r2 = r30
        L17c:
            if (r4 == r3) goto L189
            int r3 = defpackage.q21.g(r26)
        L182:
            r18 = r4
            r24 = r5
            r4 = 5
            r5 = 0
            goto L18c
        L189:
            r3 = r30
            goto L182
        L18c:
            long r2 = defpackage.s21.b(r5, r2, r5, r3, r4)
            zt1 r4 = defpackage.zt1.A
            r34 = r8
            cs1 r8 = r0.h
            w61 r5 = r0.i
            if (r1 > 0) goto L1e0
            r36 = r5
            int r5 = -r10
            r0 = r6
            int r6 = r20 + r16
            int r1 = defpackage.q21.j(r26)
            int r9 = defpackage.q21.i(r26)
            bz1 r10 = new bz1
            r11 = 22
            r10.<init>(r11)
            int r1 = r1 + r12
            int r1 = defpackage.s21.g(r1, r13)
            int r9 = r9 + r29
            int r9 = defpackage.s21.f(r9, r13)
            f34 r9 = r15.K(r1, r9, r4, r10)
            r20 = r0
            cr4 r0 = new cr4
            r11 = r53
            r12 = r2
            r3 = r16
            r4 = r18
            r2 = r19
            r1 = r30
            r10 = r36
            r17 = 1
            r18 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = r53
            r24 = r15
            r47 = r17
            r48 = r20
            goto L89c
        L1e0:
            r36 = r5
            r17 = 1
            r5 = r4
            r3 = r2
            r2 = r19
            r19 = r8
            r8 = r18
            r18 = 0
            r50 = r34
            r34 = r2
            r2 = r50
        L1f4:
            if (r2 <= 0) goto L1fd
            if (r24 <= 0) goto L1fd
            int r2 = r2 + (-1)
            int r24 = r24 - r32
            goto L1f4
        L1fd:
            int r24 = r24 * (-1)
            if (r2 < r1) goto L205
            int r2 = r1 + (-1)
            r24 = r18
        L205:
            pu r13 = new pu
            r13.<init>()
            int r14 = -r10
            if (r34 >= 0) goto L212
            r35 = r34
        L20f:
            r37 = r14
            goto L215
        L212:
            r35 = r18
            goto L20f
        L215:
            int r14 = r37 + r35
            int r24 = r24 + r14
            r38 = r9
            r35 = r14
            r14 = r24
            r24 = r15
            r15 = r18
        L223:
            d40 r9 = r0.g
            if (r14 >= 0) goto L281
            if (r2 <= 0) goto L281
            int r2 = r2 + (-1)
            r39 = r10
            kk3 r10 = r24.getLayoutDirection()
            r46 = r5
            r48 = r6
            r45 = r7
            r17 = r12
            r0 = r18
            r6 = r22
            r41 = r26
            r5 = r33
            r43 = r34
            r44 = r38
            r40 = r39
            r18 = r1
            r12 = r11
            r11 = r30
            r1 = r53
            i34 r9 = defpackage.hi2.y(r1, r2, r3, r5, r6, r8, r9, r10, r11, r12)
            r1 = r8
            r10 = r11
            r11 = r12
            r50 = r3
            r4 = r5
            r5 = r6
            r7 = r50
            r13.add(r0, r9)
            int r3 = r9.h
            int r15 = java.lang.Math.max(r15, r3)
            int r14 = r14 + r32
            r33 = r4
            r22 = r5
            r3 = r7
            r30 = r10
            r12 = r17
            r10 = r40
            r7 = r45
            r5 = r46
            r6 = r48
            r17 = 1
            r8 = r1
            r1 = r18
            r18 = r0
            r0 = r52
            goto L223
        L281:
            r46 = r5
            r48 = r6
            r45 = r7
            r40 = r10
            r17 = r12
            r0 = r18
            r5 = r22
            r41 = r26
            r10 = r30
            r43 = r34
            r44 = r38
            r18 = r1
            r1 = r8
            r7 = r3
            r4 = r33
            r12 = r35
            if (r14 >= r12) goto L2a2
            r14 = r12
        L2a2:
            int r14 = r14 - r12
            int r22 = r20 + r16
            if (r22 >= 0) goto L2a9
            r3 = r0
            goto L2ab
        L2a9:
            r3 = r22
        L2ab:
            int r0 = -r14
            r25 = r1
            r26 = r2
            r27 = r26
            r1 = 0
            r23 = 0
        L2b5:
            int r2 = r13.L
            if (r1 >= r2) goto L2c8
            if (r0 < r3) goto L2c1
            r13.b(r1)
            r23 = 1
            goto L2b5
        L2c1:
            int r26 = r26 + 1
            int r0 = r0 + r32
            int r1 = r1 + 1
            goto L2b5
        L2c8:
            r1 = r14
            r14 = r0
            r0 = r15
            r15 = r1
            r2 = r18
            r1 = r26
            r18 = r16
            r16 = r23
        L2d4:
            if (r1 >= r2) goto L347
            if (r14 < r3) goto L2e0
            if (r14 <= 0) goto L2e0
            boolean r23 = r13.isEmpty()
            if (r23 == 0) goto L2e9
        L2e0:
            r23 = r3
            r50 = r7
            r7 = r2
            r2 = r50
            r8 = r9
            goto L2f7
        L2e9:
            r12 = r20
        L2eb:
            r23 = r2
            r2 = r7
            r8 = r9
            r52 = r15
            r7 = r25
            r15 = r0
            r0 = r1
            goto L34c
        L2f7:
            kk3 r9 = r24.getLayoutDirection()
            r52 = r23
            r23 = r7
            r7 = r25
            r25 = r52
            r52 = r15
            r49 = r20
            r15 = r0
            r20 = r14
            r14 = 0
            r0 = r53
            i34 r9 = defpackage.hi2.y(r0, r1, r2, r4, r5, r7, r8, r9, r10, r11)
            r0 = r1
            int r1 = r23 + (-1)
            if (r0 != r1) goto L319
            r26 = r10
            goto L31b
        L319:
            r26 = r32
        L31b:
            int r14 = r20 + r26
            if (r14 > r12) goto L32a
            if (r0 == r1) goto L32a
            int r1 = r0 + 1
            int r9 = r52 - r32
            r27 = r1
            r16 = 1
            goto L336
        L32a:
            int r1 = r9.h
            int r1 = java.lang.Math.max(r15, r1)
            r13.addLast(r9)
            r9 = r52
            r15 = r1
        L336:
            int r1 = r0 + 1
            r0 = r15
            r20 = r49
            r15 = r9
            r9 = r8
            r50 = r25
            r25 = r7
            r7 = r2
            r2 = r23
            r3 = r50
            goto L2d4
        L347:
            r49 = r20
            r12 = r49
            goto L2eb
        L34c:
            if (r14 >= r12) goto L396
            int r1 = r12 - r14
            int r9 = r52 - r1
            int r14 = r14 + r1
            r1 = r9
            r9 = r40
        L356:
            if (r1 >= r9) goto L382
            if (r27 <= 0) goto L382
            int r27 = r27 + (-1)
            r39 = r9
            kk3 r9 = r24.getLayoutDirection()
            r20 = r1
            r52 = r14
            r1 = r27
            r14 = r0
            r0 = r53
            i34 r9 = defpackage.hi2.y(r0, r1, r2, r4, r5, r7, r8, r9, r10, r11)
            r0 = 0
            r13.add(r0, r9)
            int r0 = r9.h
            int r15 = java.lang.Math.max(r15, r0)
            int r0 = r20 + r32
            r9 = r39
            r1 = r0
            r0 = r14
            r14 = r52
            goto L356
        L382:
            r20 = r1
            r39 = r9
            r52 = r14
            r14 = r0
            if (r20 >= 0) goto L391
            int r0 = r52 + r20
            r20 = r0
            r0 = 0
            goto L39d
        L391:
            r0 = r20
            r20 = r52
            goto L39d
        L396:
            r20 = r14
            r39 = r40
            r14 = r0
            r0 = r52
        L39d:
            if (r0 < 0) goto L3a0
            goto L3a5
        L3a0:
            java.lang.String r1 = "invalid currentFirstPageScrollOffset"
            defpackage.s53.a(r1)
        L3a5:
            int r1 = -r0
            java.lang.Object r9 = r13.first()
            i34 r9 = (defpackage.i34) r9
            r52 = r15
            r15 = r43
            if (r39 > 0) goto L3b4
            if (r15 >= 0) goto L3b7
        L3b4:
            r25 = r0
            goto L3c1
        L3b7:
            r25 = r1
            r30 = r14
            r33 = r32
            r47 = 1
            r14 = r0
            goto L3ff
        L3c1:
            int r0 = r13.a()
            r26 = r9
            r9 = r25
            r25 = r1
            r1 = 0
        L3cc:
            if (r1 >= r0) goto L3f6
            if (r9 == 0) goto L3f6
            r30 = r14
            r14 = r32
            if (r14 > r9) goto L3f3
            int r32 = r13.a()
            r33 = r14
            r47 = 1
            int r14 = r32 + (-1)
            if (r1 == r14) goto L3fc
            int r9 = r9 - r33
            int r1 = r1 + 1
            java.lang.Object r14 = r13.get(r1)
            r26 = r14
            i34 r26 = (defpackage.i34) r26
            r14 = r30
            r32 = r33
            goto L3cc
        L3f3:
            r33 = r14
            goto L3fa
        L3f6:
            r30 = r14
            r33 = r32
        L3fa:
            r47 = 1
        L3fc:
            r14 = r9
            r9 = r26
        L3ff:
            int r0 = r27 - r45
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            int r1 = r27 + (-1)
            if (r0 > r1) goto L44f
            r26 = r1
            r1 = 0
        L40d:
            if (r1 != 0) goto L414
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L414:
            r27 = r9
            kk3 r9 = r24.getLayoutDirection()
            r49 = r12
            r32 = r14
            r34 = r15
            r14 = r27
            r15 = r45
            r12 = r1
            r1 = r26
            r26 = r20
            r20 = r13
            r13 = r0
            r0 = r53
            i34 r9 = defpackage.hi2.y(r0, r1, r2, r4, r5, r7, r8, r9, r10, r11)
            r12.add(r9)
            if (r1 == r13) goto L44d
            int r0 = r1 + (-1)
            r1 = r26
            r26 = r0
            r0 = r13
            r13 = r20
            r20 = r1
            r1 = r12
            r9 = r14
            r45 = r15
            r14 = r32
            r15 = r34
            r12 = r49
            goto L40d
        L44d:
            r1 = r12
            goto L45e
        L44f:
            r49 = r12
            r32 = r14
            r34 = r15
            r26 = r20
            r15 = r45
            r14 = r9
            r20 = r13
            r13 = r0
            r1 = 0
        L45e:
            int r12 = r28.size()
            r0 = 0
        L463:
            if (r0 >= r12) goto L49e
            r9 = r28
            java.lang.Object r27 = r9.get(r0)
            java.lang.Number r27 = (java.lang.Number) r27
            r28 = r0
            int r0 = r27.intValue()
            if (r0 >= r13) goto L493
            if (r1 != 0) goto L47c
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L47c:
            r27 = r9
            kk3 r9 = r24.getLayoutDirection()
            r38 = r27
            r27 = r12
            r12 = r1
            r1 = r0
            r0 = r53
            i34 r1 = defpackage.hi2.y(r0, r1, r2, r4, r5, r7, r8, r9, r10, r11)
            r12.add(r1)
            r1 = r12
            goto L497
        L493:
            r38 = r9
            r27 = r12
        L497:
            int r0 = r28 + 1
            r12 = r27
            r28 = r38
            goto L463
        L49e:
            r38 = r28
            yt1 r12 = defpackage.yt1.A
            if (r1 != 0) goto L4a6
            r13 = r12
            goto L4a7
        L4a6:
            r13 = r1
        L4a7:
            int r0 = r13.size()
            r9 = r52
            r1 = 0
        L4ae:
            if (r1 >= r0) goto L4c5
            java.lang.Object r27 = r13.get(r1)
            r52 = r0
            r0 = r27
            i34 r0 = (defpackage.i34) r0
            int r0 = r0.h
            int r9 = java.lang.Math.max(r9, r0)
            int r1 = r1 + 1
            r0 = r52
            goto L4ae
        L4c5:
            java.lang.Object r0 = r20.last()
            i34 r0 = (defpackage.i34) r0
            int r0 = r0.a
            int r1 = r23 - r0
            int r1 = r1 + (-1)
            int r1 = java.lang.Math.min(r15, r1)
            int r1 = r1 + r0
            int r0 = r0 + 1
            if (r0 > r1) goto L50a
            r27 = 0
        L4dc:
            if (r27 != 0) goto L4e3
            java.util.ArrayList r27 = new java.util.ArrayList
            r27.<init>()
        L4e3:
            r52 = r12
            r12 = r27
            r27 = r9
            kk3 r9 = r24.getLayoutDirection()
            r45 = r15
            r15 = r1
            r1 = r0
            r0 = r53
            i34 r9 = defpackage.hi2.y(r0, r1, r2, r4, r5, r7, r8, r9, r10, r11)
            r12.add(r9)
            if (r1 == r15) goto L508
            int r0 = r1 + 1
            r1 = r15
            r9 = r27
            r15 = r45
            r27 = r12
            r12 = r52
            goto L4dc
        L508:
            r1 = r12
            goto L512
        L50a:
            r27 = r9
            r52 = r12
            r45 = r15
            r15 = r1
            r1 = 0
        L512:
            int r12 = r38.size()
            r0 = 0
        L517:
            if (r0 >= r12) goto L58e
            r9 = r38
            java.lang.Object r28 = r9.get(r0)
            java.lang.Number r28 = (java.lang.Number) r28
            r38 = r0
            int r0 = r28.intValue()
            r28 = r1
            int r1 = r15 + 1
            if (r1 > r0) goto L56f
            r1 = r23
            if (r0 >= r1) goto L55d
            if (r28 != 0) goto L53a
            java.util.ArrayList r23 = new java.util.ArrayList
            r23.<init>()
            r28 = r23
        L53a:
            r23 = r12
            r12 = r28
            r28 = r9
            kk3 r9 = r24.getLayoutDirection()
            r39 = r15
            r40 = r38
            r15 = r1
            r38 = r28
            r1 = r0
            r0 = r53
            i34 r1 = defpackage.hi2.y(r0, r1, r2, r4, r5, r7, r8, r9, r10, r11)
            r9 = r7
            r50 = r2
            r2 = r8
            r7 = r50
            r12.add(r1)
            r1 = r12
            goto L57e
        L55d:
            r39 = r15
            r15 = r1
            r0 = r53
            r23 = r12
            r40 = r38
            r38 = r9
        L568:
            r9 = r7
            r50 = r2
            r2 = r8
            r7 = r50
            goto L57c
        L56f:
            r39 = r15
            r15 = r23
            r0 = r53
            r40 = r38
            r38 = r9
            r23 = r12
            goto L568
        L57c:
            r1 = r28
        L57e:
            int r3 = r40 + 1
            r0 = r3
            r12 = r23
            r23 = r15
            r15 = r39
            r50 = r7
            r8 = r2
            r2 = r50
            r7 = r9
            goto L517
        L58e:
            r0 = r53
            r28 = r1
            r9 = r7
            r15 = r23
            r7 = r2
            if (r28 != 0) goto L59b
            r6 = r52
            goto L59d
        L59b:
            r6 = r28
        L59d:
            int r1 = r6.size()
            r2 = r27
            r5 = 0
        L5a4:
            if (r5 >= r1) goto L5b5
            java.lang.Object r3 = r6.get(r5)
            i34 r3 = (defpackage.i34) r3
            int r3 = r3.h
            int r2 = java.lang.Math.max(r2, r3)
            int r5 = r5 + 1
            goto L5a4
        L5b5:
            java.lang.Object r1 = r20.first()
            boolean r1 = defpackage.nb3.k(r14, r1)
            if (r1 == 0) goto L5ce
            boolean r1 = r13.isEmpty()
            if (r1 == 0) goto L5ce
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L5ce
            r11 = r47
            goto L5cf
        L5ce:
            r11 = 0
        L5cf:
            lo4 r1 = defpackage.lo4.Vertical
            if (r9 != r1) goto L5d7
            r3 = r2
        L5d4:
            r4 = r41
            goto L5da
        L5d7:
            r3 = r26
            goto L5d4
        L5da:
            int r12 = defpackage.s21.g(r3, r4)
            if (r9 != r1) goto L5e2
            r2 = r26
        L5e2:
            int r2 = defpackage.s21.f(r2, r4)
            r3 = r2
            if (r9 != r1) goto L5ec
        L5e9:
            r1 = r49
            goto L5ee
        L5ec:
            r2 = r12
            goto L5e9
        L5ee:
            int r4 = java.lang.Math.min(r2, r1)
            r5 = r26
            if (r5 >= r4) goto L5f9
            r4 = r47
            goto L5fa
        L5f9:
            r4 = 0
        L5fa:
            if (r4 == 0) goto L617
            if (r25 != 0) goto L5ff
            goto L617
        L5ff:
            r49 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r23 = r3
            java.lang.String r3 = "non-zero pagesScrollOffset="
            r1.<init>(r3)
            r3 = r25
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            defpackage.s53.c(r1)
            goto L61d
        L617:
            r49 = r1
            r23 = r3
            r3 = r25
        L61d:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r25 = r20.a()
            int r26 = r13.size()
            int r26 = r26 + r25
            int r25 = r6.size()
            r27 = r3
            int r3 = r25 + r26
            r1.<init>(r3)
            if (r4 == 0) goto L6d1
            boolean r3 = r13.isEmpty()
            if (r3 == 0) goto L643
            boolean r3 = r6.isEmpty()
            if (r3 == 0) goto L643
            goto L648
        L643:
            java.lang.String r3 = "No extra pages"
            defpackage.s53.a(r3)
        L648:
            int r3 = r20.a()
            int[] r4 = new int[r3]
            r25 = r1
            r1 = 0
        L651:
            if (r1 >= r3) goto L658
            r4[r1] = r10
            int r1 = r1 + 1
            goto L651
        L658:
            int[] r1 = new int[r3]
            r38 = r7
            r3 = r24
            r7 = r34
            float r8 = r3.Q(r7)
            gu r3 = new gu
            r26 = r5
            r5 = 0
            r7 = 0
            r3.<init>(r8, r5, r7)
            lo4 r5 = defpackage.lo4.Vertical
            if (r9 != r5) goto L686
            r3.g(r0, r2, r4, r1)
            r5 = r1
            r7 = r24
            r8 = r25
            r24 = r10
            r10 = r26
            r26 = r11
            r11 = r23
            r23 = r9
            r9 = r49
            goto L6a0
        L686:
            r0 = r3
            r3 = r4
            kk3 r4 = defpackage.kk3.Ltr
            r5 = r1
            r7 = r24
            r8 = r25
            r1 = r53
            r24 = r10
            r10 = r26
            r26 = r11
            r11 = r23
            r23 = r9
            r9 = r49
            r0.d(r1, r2, r3, r4, r5)
        L6a0:
            l93 r0 = defpackage.fv.F0(r5)
            int r1 = r0.B
            int r0 = r0.L
            if (r0 <= 0) goto L6ac
            if (r1 >= 0) goto L6b0
        L6ac:
            if (r0 >= 0) goto L6ce
            if (r1 > 0) goto L6ce
        L6b0:
            r2 = 0
        L6b1:
            r3 = r5[r2]
            r4 = r20
            java.lang.Object r20 = r4.get(r2)
            r27 = r0
            r0 = r20
            i34 r0 = (defpackage.i34) r0
            r0.b(r3, r12, r11)
            r8.add(r0)
            if (r2 == r1) goto L72f
            int r2 = r2 + r27
            r20 = r4
            r0 = r27
            goto L6b1
        L6ce:
            r4 = r20
            goto L72f
        L6d1:
            r38 = r7
            r26 = r11
            r4 = r20
            r11 = r23
            r7 = r24
            r8 = r1
            r23 = r9
            r24 = r10
            r9 = r49
            r10 = r5
            int r0 = r13.size()
            r1 = r27
            r5 = 0
        L6ea:
            if (r5 >= r0) goto L6fd
            java.lang.Object r2 = r13.get(r5)
            i34 r2 = (defpackage.i34) r2
            int r1 = r1 - r31
            r2.b(r1, r12, r11)
            r8.add(r2)
            int r5 = r5 + 1
            goto L6ea
        L6fd:
            int r0 = r4.a()
            r1 = r27
            r5 = 0
        L704:
            if (r5 >= r0) goto L717
            java.lang.Object r2 = r4.get(r5)
            i34 r2 = (defpackage.i34) r2
            r2.b(r1, r12, r11)
            r8.add(r2)
            int r1 = r1 + r31
            int r5 = r5 + 1
            goto L704
        L717:
            int r0 = r6.size()
            r5 = 0
        L71c:
            if (r5 >= r0) goto L72f
            java.lang.Object r2 = r6.get(r5)
            i34 r2 = (defpackage.i34) r2
            r2.b(r1, r12, r11)
            r8.add(r2)
            int r1 = r1 + r31
            int r5 = r5 + 1
            goto L71c
        L72f:
            if (r26 == 0) goto L735
            r1 = r8
        L732:
            r27 = r4
            goto L774
        L735:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r0 = r8.size()
            r1.<init>(r0)
            int r0 = r8.size()
            r5 = 0
        L743:
            if (r5 >= r0) goto L732
            java.lang.Object r2 = r8.get(r5)
            r3 = r2
            i34 r3 = (defpackage.i34) r3
            r20 = r0
            int r0 = r3.a
            java.lang.Object r26 = r4.first()
            r27 = r4
            r4 = r26
            i34 r4 = (defpackage.i34) r4
            int r4 = r4.a
            if (r0 < r4) goto L76d
            int r0 = r3.a
            java.lang.Object r3 = r27.last()
            i34 r3 = (defpackage.i34) r3
            int r3 = r3.a
            if (r0 > r3) goto L76d
            r1.add(r2)
        L76d:
            int r5 = r5 + 1
            r0 = r20
            r4 = r27
            goto L743
        L774:
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L77d
            r0 = r52
            goto L7a6
        L77d:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r2 = r8.size()
            r0.<init>(r2)
            int r2 = r8.size()
            r5 = 0
        L78b:
            if (r5 >= r2) goto L7a6
            java.lang.Object r3 = r8.get(r5)
            r4 = r3
            i34 r4 = (defpackage.i34) r4
            int r4 = r4.a
            java.lang.Object r13 = r27.first()
            i34 r13 = (defpackage.i34) r13
            int r13 = r13.a
            if (r4 >= r13) goto L7a3
            r0.add(r3)
        L7a3:
            int r5 = r5 + 1
            goto L78b
        L7a6:
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L7af
            r2 = r52
            goto L7d8
        L7af:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r8.size()
            r2.<init>(r3)
            int r3 = r8.size()
            r5 = 0
        L7bd:
            if (r5 >= r3) goto L7d8
            java.lang.Object r4 = r8.get(r5)
            r6 = r4
            i34 r6 = (defpackage.i34) r6
            int r6 = r6.a
            java.lang.Object r13 = r27.last()
            i34 r13 = (defpackage.i34) r13
            int r13 = r13.a
            if (r6 <= r13) goto L7d5
            r2.add(r4)
        L7d5:
            int r5 = r5 + 1
            goto L7bd
        L7d8:
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L7e0
            r3 = 0
            goto L822
        L7e0:
            r5 = 0
            java.lang.Object r3 = r1.get(r5)
            r4 = r3
            i34 r4 = (defpackage.i34) r4
            int r4 = r4.j
            r19.getClass()
            float r4 = (float) r4
            float r4 = r4 - r21
            float r4 = java.lang.Math.abs(r4)
            float r4 = -r4
            int r5 = r1.size()
            int r5 = r5 + (-1)
            r6 = r47
            if (r6 > r5) goto L822
            r13 = r4
            r4 = r6
        L801:
            java.lang.Object r20 = r1.get(r4)
            r6 = r20
            i34 r6 = (defpackage.i34) r6
            int r6 = r6.j
            float r6 = (float) r6
            float r6 = r6 - r21
            float r6 = java.lang.Math.abs(r6)
            float r6 = -r6
            int r25 = java.lang.Float.compare(r13, r6)
            if (r25 >= 0) goto L81c
            r13 = r6
            r3 = r20
        L81c:
            if (r4 == r5) goto L822
            int r4 = r4 + 1
            r6 = 1
            goto L801
        L822:
            i34 r3 = (defpackage.i34) r3
            r19.getClass()
            if (r3 == 0) goto L82c
            int r5 = r3.j
            goto L82d
        L82c:
            r5 = 0
        L82d:
            if (r33 != 0) goto L834
            r4 = r21
            r35 = 0
            goto L845
        L834:
            r35 = 0
            int r5 = 0 - r5
            float r4 = (float) r5
            r5 = r33
            float r5 = (float) r5
            float r4 = r4 / r5
            r5 = -1090519040(0xffffffffbf000000, float:-0.5)
            r6 = 1056964608(0x3f000000, float:0.5)
            float r4 = defpackage.gi2.p(r4, r5, r6)
        L845:
            qk4 r5 = new qk4
            r6 = 3
            r13 = r44
            r5.<init>(r6, r13, r8)
            int r12 = r12 + r17
            r17 = r0
            r52 = r1
            r0 = r54
            int r6 = defpackage.s21.g(r12, r0)
            int r8 = r11 + r29
            int r0 = defpackage.s21.f(r8, r0)
            r1 = r46
            f34 r0 = r7.K(r6, r0, r1, r5)
            r1 = r30
            if (r1 < r15) goto L870
            if (r10 <= r9) goto L86c
            goto L870
        L86c:
            r13 = r35
        L86e:
            r15 = r0
            goto L872
        L870:
            r13 = 1
            goto L86e
        L872:
            cr4 r0 = new cr4
            r1 = r52
            r20 = r53
            r10 = r3
            r11 = r4
            r9 = r14
            r4 = r18
            r14 = r19
            r5 = r23
            r12 = r32
            r3 = r34
            r19 = r36
            r6 = r37
            r8 = r45
            r47 = 1
            r18 = r2
            r2 = r24
            r24 = r7
            r7 = r22
            r21 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r1 = r20
        L89c:
            boolean r2 = r24.a0()
            r6 = r48
            r5 = 0
            r6.h(r0, r2, r5)
            uq4 r2 = r6.t
            java.util.List r3 = r0.a
            java.lang.String r4 = "compose:pager:cache_window:keepAroundItems"
            android.os.Trace.beginSection(r4)
            boolean r4 = r2.b()     // Catch: java.lang.Throwable -> L8e7
            if (r4 == 0) goto L8e3
            boolean r4 = r3.isEmpty()     // Catch: java.lang.Throwable -> L8e7
            if (r4 != 0) goto L8e3
            java.lang.Object r4 = defpackage.gt0.H0(r3)     // Catch: java.lang.Throwable -> L8e7
            i34 r4 = (defpackage.i34) r4     // Catch: java.lang.Throwable -> L8e7
            int r4 = r4.a     // Catch: java.lang.Throwable -> L8e7
            java.lang.Object r3 = defpackage.gt0.Q0(r3)     // Catch: java.lang.Throwable -> L8e7
            i34 r3 = (defpackage.i34) r3     // Catch: java.lang.Throwable -> L8e7
            int r3 = r3.a     // Catch: java.lang.Throwable -> L8e7
            int r5 = r2.h     // Catch: java.lang.Throwable -> L8e7
        L8cd:
            if (r5 >= r4) goto L8d5
            r1.b(r5)     // Catch: java.lang.Throwable -> L8e7
            int r5 = r5 + 1
            goto L8cd
        L8d5:
            int r3 = r3 + 1
            int r2 = r2.i     // Catch: java.lang.Throwable -> L8e7
            if (r3 > r2) goto L8e3
        L8db:
            r1.b(r3)     // Catch: java.lang.Throwable -> L8e7
            if (r3 == r2) goto L8e3
            int r3 = r3 + 1
            goto L8db
        L8e3:
            android.os.Trace.endSection()
            return r0
        L8e7:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        L8ec:
            r0 = move-exception
            defpackage.ln2.V(r9, r4, r1)
            throw r0
    }
}

package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uo3  reason: default package */
/* loaded from: classes.dex */
public final class uo3 implements defpackage.eq3 {
    public final /* synthetic */ defpackage.ip3 a;
    public final /* synthetic */ defpackage.lq4 b;
    public final /* synthetic */ defpackage.on2 c;
    public final /* synthetic */ defpackage.lu2 d;
    public final /* synthetic */ defpackage.iu e;
    public final /* synthetic */ defpackage.w61 f;
    public final /* synthetic */ defpackage.q61 g;

    public uo3(defpackage.ip3 r1, defpackage.lq4 r2, defpackage.qo3 r3, defpackage.lu2 r4, defpackage.iu r5, defpackage.fu r6, defpackage.w61 r7, defpackage.tt2 r8, defpackage.q61 r9) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r7
            r0.g = r9
            return
    }

    @Override // defpackage.eq3
    public final defpackage.f34 a(defpackage.fq3 r62, long r63) {
            r61 = this;
            r0 = r61
            r9 = r62
            r10 = r63
            r1 = 0
            boolean r12 = defpackage.q93.b(r1, r1)
            qt6 r13 = r9.B
            ip3 r14 = r0.a
            qa4 r1 = r14.s
            zo3 r15 = r14.d
            r1.getValue()
            boolean r1 = r14.b
            r16 = 1
            if (r1 != 0) goto L27
            boolean r1 = r13.a0()
            if (r1 == 0) goto L24
            goto L27
        L24:
            r25 = 0
            goto L29
        L27:
            r25 = r16
        L29:
            lo4 r8 = defpackage.lo4.Vertical
            defpackage.mb3.s(r10, r8)
            kk3 r1 = r13.getLayoutDirection()
            lq4 r2 = r0.b
            float r1 = r2.b(r1)
            int r1 = r13.r0(r1)
            kk3 r3 = r13.getLayoutDirection()
            float r3 = r2.c(r3)
            int r3 = r13.r0(r3)
            float r4 = r2.d()
            int r31 = r13.r0(r4)
            float r2 = r2.a()
            int r2 = r13.r0(r2)
            int r2 = r2 + r31
            int r3 = r3 + r1
            int r18 = r2 - r31
            int r4 = -r3
            int r5 = -r2
            long r4 = defpackage.s21.i(r10, r4, r5)
            on2 r6 = r0.c
            java.lang.Object r6 = r6.c()
            po3 r6 = (defpackage.po3) r6
            oo3 r7 = r6.b
            dp3 r7 = r7.h
            r19 = r8
            lu2 r8 = r0.d
            r20 = r1
            ap3 r1 = r8.d
            r21 = r2
            if (r1 == 0) goto La1
            long r1 = r8.b
            boolean r1 = defpackage.q21.b(r1, r4)
            if (r1 == 0) goto La1
            float r1 = r8.c
            float r2 = r13.a()
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto La1
            ap3 r1 = r8.d
            r1.getClass()
            r36 = r3
            r29 = r4
            r28 = r12
            r9 = r20
            r35 = r21
            r12 = r31
            r20 = r6
            goto L100
        La1:
            r8.b = r4
            float r1 = r13.a()
            r8.c = r1
            ql1 r1 = r8.a
            java.lang.Object r2 = r1.B
            iu2 r2 = (defpackage.iu2) r2
            java.lang.Object r1 = r1.L
            fu r1 = (defpackage.fu) r1
            r22 = r1
            int r1 = defpackage.q21.h(r4)
            r23 = r3
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r3) goto Lc1
            goto Lc6
        Lc1:
            java.lang.String r1 = "LazyVerticalGrid's width should be bound by parent."
            defpackage.s53.a(r1)
        Lc6:
            int r3 = defpackage.q21.h(r4)
            float r1 = r22.a()
            int r1 = r9.r0(r1)
            java.util.ArrayList r1 = r2.a(r9, r3, r1)
            int[] r1 = defpackage.gt0.j1(r1)
            int r2 = r1.length
            int[] r2 = new int[r2]
            r26 = r4
            kk3 r5 = defpackage.kk3.Ltr
            r4 = r6
            r6 = r2
            r2 = r9
            r9 = r20
            r20 = r4
            r4 = r1
            r28 = r12
            r35 = r21
            r1 = r22
            r36 = r23
            r29 = r26
            r12 = r31
            r1.d(r2, r3, r4, r5, r6)
            ap3 r1 = new ap3
            r2 = 0
            r1.<init>(r2, r4, r6)
            r8.d = r1
        L100:
            java.lang.Object r2 = r1.B
            int[] r2 = (int[]) r2
            int r2 = r2.length
            int r3 = r7.f
            r4 = -1
            if (r2 == r3) goto L12a
            r7.f = r2
            java.util.ArrayList r3 = r7.a
            r3.clear()
            bp3 r5 = new bp3
            r6 = 0
            r5.<init>(r6, r6)
            r3.add(r5)
            r7.b = r6
            r7.c = r6
            r7.d = r6
            r7.e = r4
            java.lang.Object r3 = r7.h
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.clear()
            goto L12b
        L12a:
            r6 = 0
        L12b:
            iu r3 = r0.e
            float r5 = r3.a()
            int r22 = r13.r0(r5)
            int r21 = r20.a()
            int r5 = defpackage.q21.g(r10)
            int r5 = r5 - r35
            long r8 = (long) r9
            r17 = 32
            long r8 = r8 << r17
            r23 = r5
            long r4 = (long) r12
            r26 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r26
            long r8 = r8 | r4
            so3 r37 = new so3
            ip3 r5 = r0.a
            r4 = r12
            r12 = r6
            r6 = r4
            r17 = r2
            r45 = r3
            r24 = r7
            r7 = r18
            r31 = r19
            r2 = r20
            r4 = r22
            r44 = r23
            r3 = r62
            r20 = r1
            r1 = r37
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r19 = r4
            to3 r1 = new to3
            r22 = r19
            r23 = r37
            r19 = r1
            r19.<init>(r20, r21, r22, r23, r24)
            r8 = r19
            r3 = r21
            r4 = r22
            r5 = r23
            r1 = r24
            bi2 r9 = new bi2
            r12 = 15
            r9.<init>(r12, r1, r8)
            bg2 r12 = new bg2
            r33 = r4
            r4 = 3
            r12.<init>(r1, r4)
            vl6 r4 = defpackage.ln2.t()
            r18 = 0
            if (r4 == 0) goto L1a8
            qn2 r19 = r4.e()
            r34 = r7
            r7 = r19
        L1a5:
            r37 = r9
            goto L1ad
        L1a8:
            r34 = r7
            r7 = r18
            goto L1a5
        L1ad:
            vl6 r9 = defpackage.ln2.N(r4)
            r38 = r12
            int r12 = r14.g()     // Catch: java.lang.Throwable -> L1dd
            r47 = r8
            java.lang.Object r8 = r15.e     // Catch: java.lang.Throwable -> L1dd
            int r8 = defpackage.bl2.y(r12, r2, r8)     // Catch: java.lang.Throwable -> L1dd
            if (r12 == r8) goto L1ce
            r48 = r6
            ss4 r6 = r15.b     // Catch: java.lang.Throwable -> L1dd
            r6.i(r8)     // Catch: java.lang.Throwable -> L1dd
            hq3 r6 = r15.f     // Catch: java.lang.Throwable -> L1dd
            r6.a(r12)     // Catch: java.lang.Throwable -> L1dd
            goto L1d0
        L1ce:
            r48 = r6
        L1d0:
            if (r8 < r3) goto L1e0
            if (r3 > 0) goto L1d5
            goto L1e0
        L1d5:
            int r6 = r3 + (-1)
            int r1 = r1.d(r6)     // Catch: java.lang.Throwable -> L1dd
            r6 = 0
            goto L1ea
        L1dd:
            r0 = move-exception
            goto L846
        L1e0:
            int r1 = r1.d(r8)     // Catch: java.lang.Throwable -> L1dd
            ss4 r6 = r15.c     // Catch: java.lang.Throwable -> L1dd
            int r6 = r6.h()     // Catch: java.lang.Throwable -> L1dd
        L1ea:
            defpackage.ln2.V(r4, r9, r7)
            mq3 r4 = r14.q
            p70 r7 = r14.n
            java.util.List r2 = defpackage.nj2.g(r2, r4, r7)
            boolean r4 = r13.a0()
            if (r4 != 0) goto L211
            if (r25 != 0) goto L1fe
            goto L211
        L1fe:
            ap3 r4 = r14.v
            java.lang.Object r4 = r4.L
            uo r4 = (defpackage.uo) r4
            vs4 r4 = r4.B
            java.lang.Object r4 = r4.getValue()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            goto L213
        L211:
            float r4 = r14.g
        L213:
            zp3 r7 = r14.m
            boolean r23 = r13.a0()
            wo3 r8 = r14.c
            qa4 r9 = r14.r
            if (r48 < 0) goto L220
            goto L225
        L220:
            java.lang.String r12 = "negative beforeContentPadding"
            defpackage.s53.a(r12)
        L225:
            if (r34 < 0) goto L228
            goto L22d
        L228:
            java.lang.String r12 = "negative afterContentPadding"
            defpackage.s53.a(r12)
        L22d:
            zt1 r12 = defpackage.zt1.A
            po3 r15 = r5.b
            r19 = r1
            r1 = r8
            w61 r8 = r0.f
            yt1 r39 = defpackage.yt1.A
            if (r3 > 0) goto L2b3
            int r18 = defpackage.q21.j(r29)
            int r19 = defpackage.q21.i(r29)
            java.util.ArrayList r20 = new java.util.ArrayList
            r20.<init>()
            ei r0 = r15.c
            r26 = 0
            r27 = 0
            r21 = r0
            r22 = r5
            r24 = r17
            r17 = r7
            r17.e(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            if (r23 != 0) goto L26b
            r17.c()
            if (r28 != 0) goto L26b
            r0 = r29
            r2 = 0
            int r18 = defpackage.s21.g(r2, r0)
            int r19 = defpackage.s21.f(r2, r0)
            goto L26c
        L26b:
            r2 = 0
        L26c:
            bz1 r0 = new bz1
            r1 = 22
            r0.<init>(r1)
            int r1 = r18 + r36
            int r1 = defpackage.s21.g(r1, r10)
            int r3 = r19 + r35
            int r3 = defpackage.s21.f(r3, r10)
            f34 r5 = r13.K(r1, r3, r12, r0)
            r0 = r14
            r7 = r48
            int r14 = -r7
            int r15 = r44 + r34
            r1 = r0
            wo3 r0 = new wo3
            r7 = 0
            r16 = 0
            r3 = r1
            r1 = 0
            r17 = r2
            r2 = 0
            r4 = r3
            r3 = 0
            r6 = r4
            r4 = 0
            r9 = r6
            r6 = 0
            r50 = r9
            r49 = r13
            r10 = r24
            r17 = r31
            r19 = r33
            r18 = r34
            r11 = r37
            r12 = r38
            r13 = r39
            r9 = r62
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L839
        L2b3:
            r20 = r4
            r4 = r5
            r52 = r8
            r51 = r9
            r49 = r13
            r50 = r14
            r24 = r17
            r5 = r33
            r8 = r34
            r13 = r39
            r14 = r44
            r9 = r62
            r17 = r7
            r44 = r37
            r7 = r48
            r48 = r38
            int r21 = java.lang.Math.round(r20)
            int r6 = r6 - r21
            if (r19 != 0) goto L2df
            if (r6 >= 0) goto L2df
            int r21 = r21 + r6
            r6 = 0
        L2df:
            r53 = r5
            pu r5 = new pu
            r5.<init>()
            r22 = r6
            int r6 = -r7
            if (r53 >= 0) goto L2f0
            r26 = r53
        L2ed:
            r54 = r6
            goto L2f3
        L2f0:
            r26 = 0
            goto L2ed
        L2f3:
            int r6 = r54 + r26
            int r22 = r22 + r6
            r55 = r8
            r8 = r22
        L2fb:
            if (r8 >= 0) goto L31b
            if (r19 <= 0) goto L31b
            r22 = r13
            int r13 = r19 + (-1)
            r56 = r12
            r12 = r47
            yo3 r10 = r12.b(r13)
            r11 = 0
            r5.add(r11, r10)
            int r10 = r10.g
            int r8 = r8 + r10
            r10 = r63
            r19 = r13
            r13 = r22
            r12 = r56
            goto L2fb
        L31b:
            r56 = r12
            r22 = r13
            r12 = r47
            r11 = 0
            if (r8 >= r6) goto L329
            int r8 = r6 - r8
            int r21 = r21 - r8
            r8 = r6
        L329:
            r10 = r21
            int r8 = r8 - r6
            int r13 = r14 + r55
            if (r13 >= 0) goto L333
            r47 = r13
            goto L336
        L333:
            r11 = r13
            r47 = r11
        L336:
            int r13 = -r8
            r26 = r8
            r8 = r13
            r27 = r19
            r13 = 0
            r21 = 0
        L33f:
            int r0 = r5.L
            if (r13 >= r0) goto L359
            if (r8 < r11) goto L34b
            r5.b(r13)
            r21 = r16
            goto L33f
        L34b:
            int r27 = r27 + 1
            java.lang.Object r0 = r5.get(r13)
            yo3 r0 = (defpackage.yo3) r0
            int r0 = r0.g
            int r8 = r8 + r0
            int r13 = r13 + 1
            goto L33f
        L359:
            r0 = r21
            r13 = r27
        L35d:
            if (r13 >= r3) goto L36c
            if (r8 < r11) goto L369
            if (r8 <= 0) goto L369
            boolean r21 = r5.isEmpty()
            if (r21 == 0) goto L36c
        L369:
            r57 = r0
            goto L36f
        L36c:
            r57 = r0
            goto L3ac
        L36f:
            yo3 r0 = r12.b(r13)
            r21 = r11
            int r11 = r0.g
            r27 = r11
            xo3[] r11 = r0.b
            r31 = r13
            int r13 = r11.length
            if (r13 != 0) goto L381
            goto L3ac
        L381:
            int r8 = r8 + r27
            if (r8 > r6) goto L3a2
            int r13 = r11.length
            if (r13 == 0) goto L39c
            int r13 = r11.length
            int r13 = r13 + (-1)
            r11 = r11[r13]
            int r11 = r11.a
            int r13 = r3 + (-1)
            if (r11 == r13) goto L3a2
            int r13 = r31 + 1
            int r26 = r26 - r27
            r19 = r13
            r0 = r16
            goto L3a7
        L39c:
            java.lang.String r0 = "Array is empty."
            defpackage.fa6.e(r0)
            return r18
        L3a2:
            r5.addLast(r0)
            r0 = r57
        L3a7:
            int r13 = r31 + 1
            r11 = r21
            goto L35d
        L3ac:
            if (r8 >= r14) goto L3d7
            int r0 = r14 - r8
            int r26 = r26 - r0
            int r8 = r8 + r0
            r6 = r26
        L3b5:
            if (r6 >= r7) goto L3cd
            if (r19 <= 0) goto L3cd
            int r11 = r19 + (-1)
            yo3 r13 = r12.b(r11)
            r19 = r0
            r0 = 0
            r5.add(r0, r13)
            int r0 = r13.g
            int r6 = r6 + r0
            r0 = r19
            r19 = r11
            goto L3b5
        L3cd:
            r19 = r0
            int r0 = r10 + r19
            if (r6 >= 0) goto L3da
            int r0 = r0 + r6
            int r8 = r8 + r6
            r6 = 0
            goto L3da
        L3d7:
            r0 = r10
            r6 = r26
        L3da:
            int r11 = java.lang.Math.round(r20)
            int r11 = java.lang.Integer.signum(r11)
            int r13 = java.lang.Integer.signum(r0)
            if (r11 != r13) goto L3f8
            int r11 = java.lang.Math.round(r20)
            int r11 = java.lang.Math.abs(r11)
            int r13 = java.lang.Math.abs(r0)
            if (r11 < r13) goto L3f8
            float r11 = (float) r0
            goto L3fa
        L3f8:
            r11 = r20
        L3fa:
            float r13 = r20 - r11
            r19 = 0
            if (r23 == 0) goto L40a
            if (r0 <= r10) goto L40a
            int r20 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1))
            if (r20 > 0) goto L40a
            int r0 = r0 - r10
            float r0 = (float) r0
            float r19 = r0 + r13
        L40a:
            r0 = r19
            if (r6 < 0) goto L40f
            goto L414
        L40f:
            java.lang.String r10 = "negative initial offset"
            defpackage.s53.a(r10)
        L414:
            int r10 = -r6
            java.lang.Object r13 = r5.f()
            yo3 r13 = (defpackage.yo3) r13
            r58 = r0
            if (r13 == 0) goto L42c
            xo3[] r0 = r13.b
            java.lang.Object r0 = defpackage.fv.E0(r0)
            xo3 r0 = (defpackage.xo3) r0
            if (r0 == 0) goto L42c
            int r0 = r0.a
            goto L42d
        L42c:
            r0 = 0
        L42d:
            java.lang.Object r19 = r5.h()
            r20 = r6
            r6 = r19
            yo3 r6 = (defpackage.yo3) r6
            if (r6 == 0) goto L44d
            xo3[] r6 = r6.b
            r31 = r7
            int r7 = r6.length
            if (r7 != 0) goto L443
            r6 = r18
            goto L448
        L443:
            int r7 = r6.length
            int r7 = r7 + (-1)
            r6 = r6[r7]
        L448:
            if (r6 == 0) goto L44f
            int r7 = r6.a
            goto L450
        L44d:
            r31 = r7
        L44f:
            r7 = 0
        L450:
            int r6 = r2.size()
            r19 = r10
            r59 = r11
            r21 = r18
            r10 = 0
        L45b:
            dp3 r11 = r12.e
            if (r10 >= r6) goto L4a5
            java.lang.Object r26 = r2.get(r10)
            java.lang.Number r26 = (java.lang.Number) r26
            r27 = r6
            int r6 = r26.intValue()
            if (r6 < 0) goto L49c
            if (r6 >= r0) goto L49c
            r32 = r0
            int r0 = r11.f
            int r0 = r11.g(r6)
            r11 = 0
            long r42 = r12.a(r11, r0)
            r39 = 0
            int r11 = r4.d
            r40 = r0
            r37 = r4
            r38 = r6
            r41 = r11
            xo3 r0 = r37.o(r38, r39, r40, r41, r42)
            if (r21 != 0) goto L494
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            goto L496
        L494:
            r6 = r21
        L496:
            r6.add(r0)
            r21 = r6
            goto L49e
        L49c:
            r32 = r0
        L49e:
            int r10 = r10 + 1
            r6 = r27
            r0 = r32
            goto L45b
        L4a5:
            r32 = r0
            if (r21 != 0) goto L4ac
            r0 = r22
            goto L4ae
        L4ac:
            r0 = r21
        L4ae:
            if (r23 == 0) goto L578
            if (r1 == 0) goto L578
            java.util.List r1 = r1.m
            boolean r6 = r1.isEmpty()
            if (r6 != 0) goto L578
            int r6 = r1.size()
            int r6 = r6 + (-1)
            r10 = -1
        L4c1:
            if (r10 >= r6) goto L4eb
            java.lang.Object r21 = r1.get(r6)
            r46 = r10
            r10 = r21
            xo3 r10 = (defpackage.xo3) r10
            int r10 = r10.a
            if (r10 <= r7) goto L4e6
            if (r6 == 0) goto L4df
            int r10 = r6 + (-1)
            java.lang.Object r10 = r1.get(r10)
            xo3 r10 = (defpackage.xo3) r10
            int r10 = r10.a
            if (r10 > r7) goto L4e6
        L4df:
            java.lang.Object r6 = r1.get(r6)
            xo3 r6 = (defpackage.xo3) r6
            goto L4ef
        L4e6:
            int r6 = r6 + (-1)
            r10 = r46
            goto L4c1
        L4eb:
            r46 = r10
            r6 = r18
        L4ef:
            java.lang.Object r1 = defpackage.gt0.Q0(r1)
            xo3 r1 = (defpackage.xo3) r1
            java.lang.Object r10 = defpackage.gt0.R0(r5)
            yo3 r10 = (defpackage.yo3) r10
            if (r10 == 0) goto L502
            int r10 = r10.a
            int r10 = r10 + 1
            goto L503
        L502:
            r10 = 0
        L503:
            if (r6 == 0) goto L575
            int r6 = r6.a
            int r1 = r1.a
            r33 = r7
            int r7 = r3 + (-1)
            int r1 = java.lang.Math.min(r1, r7)
            if (r6 > r1) goto L570
            r7 = r18
        L515:
            r21 = r13
            if (r7 == 0) goto L54e
            int r13 = r7.size()
            r34 = r15
            r15 = 0
        L520:
            if (r15 >= r13) goto L54b
            java.lang.Object r26 = r7.get(r15)
            r27 = r7
            r7 = r26
            yo3 r7 = (defpackage.yo3) r7
            xo3[] r7 = r7.b
            r26 = r13
            int r13 = r7.length
            r37 = r7
            r7 = 0
        L534:
            if (r7 >= r13) goto L544
            r38 = r7
            r7 = r37[r38]
            int r7 = r7.a
            if (r7 != r6) goto L541
            r7 = r27
            goto L564
        L541:
            int r7 = r38 + 1
            goto L534
        L544:
            int r15 = r15 + 1
            r13 = r26
            r7 = r27
            goto L520
        L54b:
            r27 = r7
            goto L551
        L54e:
            r34 = r15
            goto L54b
        L551:
            if (r27 != 0) goto L559
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            goto L55b
        L559:
            r7 = r27
        L55b:
            yo3 r13 = r12.b(r10)
            int r10 = r10 + 1
            r7.add(r13)
        L564:
            if (r6 == r1) goto L56d
            int r6 = r6 + 1
            r13 = r21
            r15 = r34
            goto L515
        L56d:
            r39 = r7
            goto L582
        L570:
            r21 = r13
            r34 = r15
            goto L580
        L575:
            r33 = r7
            goto L570
        L578:
            r33 = r7
            r21 = r13
            r34 = r15
            r46 = -1
        L580:
            r39 = r18
        L582:
            if (r39 != 0) goto L587
            r1 = r22
            goto L589
        L587:
            r1 = r39
        L589:
            int r6 = r2.size()
            r7 = 0
        L58e:
            if (r7 >= r6) goto L60d
            java.lang.Object r10 = r2.get(r7)
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            int r13 = r33 + 1
            if (r13 > r10) goto L5fe
            if (r10 >= r3) goto L5fe
            if (r23 == 0) goto L5d0
            int r13 = r1.size()
            r15 = 0
        L5a7:
            if (r15 >= r13) goto L5d0
            java.lang.Object r26 = r1.get(r15)
            r27 = r2
            r2 = r26
            yo3 r2 = (defpackage.yo3) r2
            xo3[] r2 = r2.b
            r60 = r3
            int r3 = r2.length
            r26 = r2
            r2 = 0
        L5bb:
            if (r2 >= r3) goto L5c9
            r37 = r2
            r2 = r26[r37]
            int r2 = r2.a
            if (r2 != r10) goto L5c6
            goto L602
        L5c6:
            int r2 = r37 + 1
            goto L5bb
        L5c9:
            int r15 = r15 + 1
            r2 = r27
            r3 = r60
            goto L5a7
        L5d0:
            r27 = r2
            r60 = r3
            int r2 = r11.f
            int r2 = r11.g(r10)
            r3 = 0
            long r42 = r12.a(r3, r2)
            r39 = 0
            int r3 = r4.d
            r40 = r2
            r41 = r3
            r37 = r4
            r38 = r10
            xo3 r2 = r37.o(r38, r39, r40, r41, r42)
            if (r18 != 0) goto L5f6
            java.util.ArrayList r18 = new java.util.ArrayList
            r18.<init>()
        L5f6:
            r3 = r18
            r3.add(r2)
            r18 = r3
            goto L604
        L5fe:
            r27 = r2
            r60 = r3
        L602:
            r37 = r4
        L604:
            int r7 = r7 + 1
            r2 = r27
            r4 = r37
            r3 = r60
            goto L58e
        L60d:
            r60 = r3
            r37 = r4
            if (r18 != 0) goto L616
            r2 = r22
            goto L618
        L616:
            r2 = r18
        L618:
            if (r31 > 0) goto L622
            if (r53 >= 0) goto L61d
            goto L622
        L61d:
            r26 = r20
            r13 = r21
            goto L64e
        L622:
            int r3 = r5.a()
            r6 = r20
            r13 = r21
            r7 = 0
        L62b:
            if (r7 >= r3) goto L64c
            java.lang.Object r4 = r5.get(r7)
            yo3 r4 = (defpackage.yo3) r4
            int r4 = r4.g
            if (r6 == 0) goto L64c
            if (r4 > r6) goto L64c
            int r10 = r5.a()
            int r10 = r10 + (-1)
            if (r7 == r10) goto L64c
            int r6 = r6 - r4
            int r7 = r7 + 1
            java.lang.Object r4 = r5.get(r7)
            r13 = r4
            yo3 r13 = (defpackage.yo3) r13
            goto L62b
        L64c:
            r26 = r6
        L64e:
            int r3 = defpackage.q21.h(r29)
            r6 = r29
            int r4 = defpackage.s21.f(r8, r6)
            boolean r10 = r1.isEmpty()
            if (r10 == 0) goto L65f
            goto L663
        L65f:
            java.util.ArrayList r5 = defpackage.gt0.V0(r5, r1)
        L663:
            int r1 = java.lang.Math.min(r4, r14)
            if (r8 >= r1) goto L66c
            r1 = r16
            goto L66d
        L66c:
            r1 = 0
        L66d:
            if (r1 == 0) goto L677
            if (r19 != 0) goto L672
            goto L677
        L672:
            java.lang.String r10 = "non-zero firstLineScrollOffset"
            defpackage.s53.c(r10)
        L677:
            int r10 = r5.size()
            r11 = 0
            r15 = 0
        L67d:
            if (r11 >= r10) goto L692
            java.lang.Object r18 = r5.get(r11)
            r20 = r1
            r1 = r18
            yo3 r1 = (defpackage.yo3) r1
            xo3[] r1 = r1.b
            int r1 = r1.length
            int r15 = r15 + r1
            int r11 = r11 + 1
            r1 = r20
            goto L67d
        L692:
            r20 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r15)
            if (r20 == 0) goto L705
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L6a8
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L6a8
            goto L6ad
        L6a8:
            java.lang.String r0 = "no items"
            defpackage.s53.a(r0)
        L6ad:
            int r0 = r5.size()
            int[] r2 = new int[r0]
            r10 = 0
        L6b4:
            if (r10 >= r0) goto L6c3
            java.lang.Object r11 = r5.get(r10)
            yo3 r11 = (defpackage.yo3) r11
            int r11 = r11.f
            r2[r10] = r11
            int r10 = r10 + 1
            goto L6b4
        L6c3:
            int[] r0 = new int[r0]
            r10 = r45
            r10.g(r9, r4, r2, r0)
            l93 r2 = defpackage.fv.F0(r0)
            int r10 = r2.B
            int r2 = r2.L
            if (r2 <= 0) goto L6d6
            if (r10 >= 0) goto L6da
        L6d6:
            if (r2 >= 0) goto L701
            if (r10 > 0) goto L701
        L6da:
            r11 = 0
        L6db:
            r15 = r0[r11]
            java.lang.Object r18 = r5.get(r11)
            r19 = r0
            r0 = r18
            yo3 r0 = (defpackage.yo3) r0
            xo3[] r0 = r0.a(r15, r3, r4)
            int r15 = r0.length
            r18 = r0
            r0 = 0
        L6ef:
            if (r0 >= r15) goto L6fb
            r20 = r0
            r0 = r18[r20]
            r1.add(r0)
            int r0 = r20 + 1
            goto L6ef
        L6fb:
            if (r11 == r10) goto L701
            int r11 = r11 + r2
            r0 = r19
            goto L6db
        L701:
            r0 = r34
            goto L773
        L705:
            int r10 = r0.size()
            int r10 = r10 + (-1)
            if (r10 < 0) goto L729
            r11 = r19
        L70f:
            int r15 = r10 + (-1)
            java.lang.Object r10 = r0.get(r10)
            xo3 r10 = (defpackage.xo3) r10
            r18 = r0
            int r0 = r10.l
            int r11 = r11 - r0
            r10.g(r11, r3, r4)
            r1.add(r10)
            if (r15 >= 0) goto L725
            goto L729
        L725:
            r10 = r15
            r0 = r18
            goto L70f
        L729:
            int r0 = r5.size()
            r11 = r19
            r10 = 0
        L730:
            if (r10 >= r0) goto L75a
            java.lang.Object r15 = r5.get(r10)
            yo3 r15 = (defpackage.yo3) r15
            r18 = r0
            xo3[] r0 = r15.a(r11, r3, r4)
            r19 = r5
            int r5 = r0.length
            r20 = r0
            r0 = 0
        L744:
            if (r0 >= r5) goto L750
            r21 = r0
            r0 = r20[r21]
            r1.add(r0)
            int r0 = r21 + 1
            goto L744
        L750:
            int r0 = r15.g
            int r11 = r11 + r0
            int r10 = r10 + 1
            r0 = r18
            r5 = r19
            goto L730
        L75a:
            int r0 = r2.size()
            r5 = 0
        L75f:
            if (r5 >= r0) goto L701
            java.lang.Object r10 = r2.get(r5)
            xo3 r10 = (defpackage.xo3) r10
            r10.g(r11, r3, r4)
            r1.add(r10)
            int r10 = r10.l
            int r11 = r11 + r10
            int r5 = r5 + 1
            goto L75f
        L773:
            ei r2 = r0.c
            r20 = r1
            r21 = r2
            r18 = r3
            r19 = r4
            r27 = r8
            r22 = r37
            r17.e(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r5 = r20
            r1 = r22
            r10 = r24
            r2 = r26
            if (r23 != 0) goto L7ba
            r17.c()
            if (r28 != 0) goto L7ba
            r11 = 0
            int r3 = java.lang.Math.max(r3, r11)
            int r3 = defpackage.s21.g(r3, r6)
            int r15 = java.lang.Math.max(r4, r11)
            int r6 = defpackage.s21.f(r15, r6)
            if (r6 == r4) goto L7b8
            int r4 = r5.size()
            r7 = r11
        L7ab:
            if (r7 >= r4) goto L7b8
            java.lang.Object r15 = r5.get(r7)
            xo3 r15 = (defpackage.xo3) r15
            r15.m = r6
            int r7 = r7 + 1
            goto L7ab
        L7b8:
            r4 = r6
            goto L7bb
        L7ba:
            r11 = 0
        L7bb:
            oo3 r0 = r0.b
            r0.getClass()
            o94 r30 = defpackage.f93.a
            bi2 r0 = new bi2
            r6 = 16
            r0.<init>(r6, r12, r1)
            r1 = r61
            q61 r1 = r1.g
            r34 = r0
            r26 = r1
            r29 = r5
            r27 = r32
            r28 = r33
            r32 = r3
            r33 = r4
            java.util.List r22 = defpackage.np2.m(r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r0 = r27
            r7 = r28
            int r1 = r60 + (-1)
            if (r7 != r1) goto L7ec
            if (r8 <= r14) goto L7ea
            goto L7ec
        L7ea:
            r3 = r11
            goto L7ee
        L7ec:
            r3 = r16
        L7ee:
            vo3 r19 = new vo3
            r24 = 0
            r21 = r29
            r20 = r51
            r19.<init>(r20, r21, r22, r23, r24)
            r4 = r19
            r5 = r21
            r1 = r22
            int r6 = r32 + r36
            r14 = r63
            int r6 = defpackage.s21.g(r6, r14)
            int r8 = r33 + r35
            int r8 = defpackage.s21.f(r8, r14)
            r12 = r49
            r14 = r56
            f34 r4 = r12.K(r6, r8, r14, r4)
            java.util.List r0 = defpackage.nw7.u0(r0, r7, r5, r1)
            lo4 r17 = defpackage.lo4.Vertical
            r1 = r13
            r13 = r0
            wo3 r0 = new wo3
            r5 = r4
            r11 = r44
            r15 = r47
            r12 = r48
            r8 = r52
            r19 = r53
            r14 = r54
            r18 = r55
            r7 = r57
            r6 = r58
            r4 = r59
            r16 = r60
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L839:
            boolean r1 = r49.a0()
            r3 = r50
            r11 = 0
            r3.f(r0, r1, r11)
            oe1 r1 = r3.a
            return r0
        L846:
            defpackage.ln2.V(r4, r9, r7)
            throw r0
    }
}

package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ir3  reason: default package */
/* loaded from: classes.dex */
public final class ir3 implements defpackage.eq3 {
    public final /* synthetic */ defpackage.pr3 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ defpackage.lq4 c;
    public final /* synthetic */ defpackage.on2 d;
    public final /* synthetic */ defpackage.iu e;
    public final /* synthetic */ defpackage.fu f;
    public final /* synthetic */ defpackage.w61 g;
    public final /* synthetic */ defpackage.q61 h;
    public final /* synthetic */ defpackage.c40 i;
    public final /* synthetic */ defpackage.d40 j;

    public ir3(defpackage.pr3 r1, boolean r2, defpackage.lq4 r3, defpackage.qo3 r4, defpackage.iu r5, defpackage.fu r6, defpackage.w61 r7, defpackage.tt2 r8, defpackage.q61 r9, defpackage.c40 r10, defpackage.d40 r11) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            r0.h = r9
            r0.i = r10
            r0.j = r11
            return
    }

    @Override // defpackage.eq3
    public final defpackage.f34 a(defpackage.fq3 r56, long r57) {
            r55 = this;
            r0 = r55
            r9 = r56
            r1 = r57
            r3 = 0
            boolean r16 = defpackage.q93.b(r3, r3)
            qt6 r3 = r9.B
            pr3 r4 = r0.a
            qa4 r5 = r4.t
            r5.getValue()
            boolean r5 = r4.b
            r17 = 1
            if (r5 != 0) goto L25
            boolean r5 = r3.a0()
            if (r5 == 0) goto L22
            goto L25
        L22:
            r26 = 0
            goto L27
        L25:
            r26 = r17
        L27:
            boolean r5 = r0.b
            if (r5 == 0) goto L2e
            lo4 r7 = defpackage.lo4.Vertical
            goto L30
        L2e:
            lo4 r7 = defpackage.lo4.Horizontal
        L30:
            defpackage.mb3.s(r1, r7)
            lq4 r7 = r0.c
            if (r5 == 0) goto L44
            kk3 r8 = r3.getLayoutDirection()
            float r8 = r7.b(r8)
            int r8 = r3.r0(r8)
            goto L50
        L44:
            kk3 r8 = r3.getLayoutDirection()
            float r8 = defpackage.ge7.r(r7, r8)
            int r8 = r3.r0(r8)
        L50:
            if (r5 == 0) goto L5f
            kk3 r10 = r3.getLayoutDirection()
            float r10 = r7.c(r10)
            int r10 = r3.r0(r10)
            goto L6b
        L5f:
            kk3 r10 = r3.getLayoutDirection()
            float r10 = defpackage.ge7.q(r7, r10)
            int r10 = r3.r0(r10)
        L6b:
            float r11 = r7.d()
            int r11 = r3.r0(r11)
            float r7 = r7.a()
            int r7 = r3.r0(r7)
            int r7 = r7 + r11
            int r12 = r8 + r10
            if (r5 == 0) goto L82
            r13 = r7
            goto L83
        L82:
            r13 = r12
        L83:
            if (r5 == 0) goto L88
            r32 = r11
            goto L8f
        L88:
            if (r5 != 0) goto L8d
            r32 = r8
            goto L8f
        L8d:
            r32 = r10
        L8f:
            int r13 = r13 - r32
            int r10 = -r12
            int r14 = -r7
            long r14 = defpackage.s21.i(r1, r10, r14)
            on2 r10 = r0.d
            java.lang.Object r10 = r10.c()
            fr3 r10 = (defpackage.fr3) r10
            lp3 r6 = r10.c
            int r1 = defpackage.q21.h(r14)
            int r2 = defpackage.q21.g(r14)
            r19 = r4
            ss4 r4 = r6.a
            r4.i(r1)
            ss4 r1 = r6.b
            r1.i(r2)
            fu r1 = r0.f
            java.lang.String r20 = "null verticalArrangement when isVertical == true"
            iu r2 = r0.e
            if (r5 == 0) goto Lc9
            if (r2 == 0) goto Lc4
            float r4 = r2.a()
            goto Lcf
        Lc4:
            ug r0 = defpackage.lb1.c(r20)
            throw r0
        Lc9:
            if (r1 == 0) goto L7c0
            float r4 = r1.a()
        Lcf:
            int r4 = r3.r0(r4)
            r6 = r7
            int r7 = r10.a()
            if (r5 == 0) goto Le7
            int r21 = defpackage.q21.g(r57)
            int r21 = r21 - r6
        Le0:
            r22 = r2
            r36 = r21
            r21 = r1
            goto Lee
        Le7:
            int r21 = defpackage.q21.h(r57)
            int r21 = r21 - r12
            goto Le0
        Lee:
            long r1 = (long) r8
            r8 = 32
            long r1 = r1 << r8
            r23 = r1
            long r1 = (long) r11
            r27 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r27
            long r1 = r23 | r1
            hr3 r23 = new hr3
            r8 = r5
            r5 = r10
            d40 r10 = r0.j
            r11 = r12
            r12 = r13
            r53 = r1
            r1 = r3
            r2 = r14
            r13 = r53
            pr3 r15 = r0.a
            r24 = r8
            r8 = r4
            boolean r4 = r0.b
            c40 r9 = r0.i
            r38 = r1
            r39 = r6
            r40 = r11
            r43 = r19
            r41 = r22
            r1 = r23
            r42 = r24
            r11 = r32
            r6 = r56
            r1.<init>(r2, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15)
            r15 = r7
            r53 = r2
            r2 = r1
            r1 = r8
            r7 = r53
            vl6 r3 = defpackage.ln2.t()
            if (r3 == 0) goto L13c
            qn2 r4 = r3.e()
            goto L13d
        L13c:
            r4 = 0
        L13d:
            vl6 r6 = defpackage.ln2.N(r3)
            int r10 = r43.h()     // Catch: java.lang.Throwable -> L7bb
            r13 = r43
            zo3 r14 = r13.e     // Catch: java.lang.Throwable -> L7bb
            java.lang.Object r9 = r14.e     // Catch: java.lang.Throwable -> L7bb
            int r9 = defpackage.bl2.y(r10, r5, r9)     // Catch: java.lang.Throwable -> L7bb
            if (r10 == r9) goto L15e
            r29 = r1
            ss4 r1 = r14.b     // Catch: java.lang.Throwable -> L7bb
            r1.i(r9)     // Catch: java.lang.Throwable -> L7bb
            hq3 r1 = r14.f     // Catch: java.lang.Throwable -> L7bb
            r1.a(r10)     // Catch: java.lang.Throwable -> L7bb
            goto L160
        L15e:
            r29 = r1
        L160:
            int r1 = r13.i()     // Catch: java.lang.Throwable -> L7bb
            defpackage.ln2.V(r3, r6, r4)
            mq3 r3 = r13.s
            p70 r4 = r13.p
            java.util.List r3 = defpackage.nj2.g(r5, r3, r4)
            boolean r4 = r38.a0()
            if (r4 != 0) goto L18b
            if (r26 != 0) goto L178
            goto L18b
        L178:
            ap3 r4 = r13.x
            java.lang.Object r4 = r4.L
            uo r4 = (defpackage.uo) r4
            vs4 r4 = r4.B
            java.lang.Object r4 = r4.getValue()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            goto L18d
        L18b:
            float r4 = r13.h
        L18d:
            zp3 r5 = r13.o
            boolean r24 = r38.a0()
            qa4 r10 = r13.w
            boolean r14 = r13.i
            if (r11 < 0) goto L19a
            goto L19f
        L19a:
            java.lang.String r6 = "invalid beforeContentPadding"
            defpackage.s53.a(r6)
        L19f:
            if (r12 < 0) goto L1a2
            goto L1a7
        L1a2:
            java.lang.String r6 = "invalid afterContentPadding"
            defpackage.s53.a(r6)
        L1a7:
            zt1 r6 = defpackage.zt1.A
            r44 = r10
            fr3 r10 = r2.b
            r18 = r1
            w61 r1 = r0.g
            r45 = r17
            r17 = r12
            yt1 r12 = defpackage.yt1.A
            if (r15 > 0) goto L237
            int r19 = defpackage.q21.j(r7)
            int r20 = defpackage.q21.i(r7)
            java.util.ArrayList r21 = new java.util.ArrayList
            r21.<init>()
            ei r0 = r10.d
            r27 = 0
            r28 = 0
            r25 = 1
            r22 = r0
            r23 = r2
            r18 = r5
            r18.e(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r22 = r18
            if (r24 != 0) goto L1ea
            r22.c()
            if (r16 != 0) goto L1ea
            r0 = 0
            int r19 = defpackage.s21.g(r0, r7)
            int r20 = defpackage.s21.f(r0, r7)
            goto L1eb
        L1ea:
            r0 = 0
        L1eb:
            bz1 r3 = new bz1
            r4 = 22
            r3.<init>(r4)
            int r4 = r19 + r40
            r7 = r57
            int r4 = defpackage.s21.g(r4, r7)
            int r5 = r20 + r39
            int r5 = defpackage.s21.f(r5, r7)
            r7 = r38
            f34 r5 = r7.K(r4, r5, r6, r3)
            r19 = r13
            int r13 = -r11
            r21 = r36
            int r14 = r21 + r17
            if (r42 == 0) goto L216
            lo4 r3 = defpackage.lo4.Vertical
        L211:
            r18 = r0
            r16 = r3
            goto L219
        L216:
            lo4 r3 = defpackage.lo4.Horizontal
            goto L211
        L219:
            jr3 r0 = new jr3
            r38 = r7
            r7 = 0
            r15 = 0
            r8 = r1
            r1 = 0
            r3 = 0
            r4 = r3
            r6 = r4
            r4 = 0
            r9 = r6
            r6 = 0
            long r10 = r2.d
            r2 = r9
            r48 = r19
            r18 = r29
            r46 = r38
            r9 = r56
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18)
            goto L7ae
        L237:
            r37 = r1
            r22 = r5
            r1 = r12
            r48 = r13
            r19 = r14
            r14 = r36
            r46 = r38
            r36 = r17
            r17 = r29
            if (r9 < r15) goto L24e
            int r9 = r15 + (-1)
            r18 = 0
        L24e:
            int r23 = java.lang.Math.round(r4)
            int r18 = r18 - r23
            if (r9 != 0) goto L25c
            if (r18 >= 0) goto L25c
            int r23 = r23 + r18
            r18 = 0
        L25c:
            r25 = r9
            pu r9 = new pu
            r9.<init>()
            int r12 = -r11
            if (r17 >= 0) goto L269
            r13 = r17
            goto L26a
        L269:
            r13 = 0
        L26a:
            int r13 = r13 + r12
            int r18 = r18 + r13
            r27 = r18
            r18 = r4
            r4 = r27
            r27 = r1
            r28 = r6
            r1 = 0
        L278:
            long r5 = r2.d
            if (r4 >= 0) goto L298
            if (r25 <= 0) goto L298
            r38 = r12
            int r12 = r25 + (-1)
            kr3 r5 = r2.o(r12, r5)
            r6 = 0
            r9.add(r6, r5)
            int r6 = r5.o
            int r1 = java.lang.Math.max(r1, r6)
            int r5 = r5.n
            int r4 = r4 + r5
            r25 = r12
            r12 = r38
            goto L278
        L298:
            r38 = r12
            r12 = 0
            if (r4 >= r13) goto L2a2
            int r4 = r13 - r4
            int r23 = r23 - r4
            r4 = r13
        L2a2:
            r49 = r23
            int r4 = r4 - r13
            int r47 = r14 + r36
            if (r47 >= 0) goto L2ac
        L2a9:
            r23 = r1
            goto L2af
        L2ac:
            r12 = r47
            goto L2a9
        L2af:
            int r1 = -r4
            r29 = r4
            r31 = r25
            r4 = 0
            r30 = 0
        L2b7:
            int r0 = r9.L
            if (r4 >= r0) goto L2d1
            if (r1 < r12) goto L2c3
            r9.b(r4)
            r30 = r45
            goto L2b7
        L2c3:
            int r31 = r31 + 1
            java.lang.Object r0 = r9.get(r4)
            kr3 r0 = (defpackage.kr3) r0
            int r0 = r0.n
            int r1 = r1 + r0
            int r4 = r4 + 1
            goto L2b7
        L2d1:
            r0 = r23
            r50 = r30
            r4 = r31
        L2d7:
            if (r4 >= r15) goto L2e6
            if (r1 < r12) goto L2e3
            if (r1 <= 0) goto L2e3
            boolean r23 = r9.isEmpty()
            if (r23 == 0) goto L2e6
        L2e3:
            r23 = r12
            goto L2e9
        L2e6:
            r51 = r15
            goto L317
        L2e9:
            kr3 r12 = r2.o(r4, r5)
            r51 = r15
            int r15 = r12.n
            int r1 = r1 + r15
            if (r1 > r13) goto L303
            r30 = r1
            int r1 = r51 + (-1)
            if (r4 == r1) goto L305
            int r1 = r4 + 1
            int r29 = r29 - r15
            r25 = r1
            r50 = r45
            goto L30e
        L303:
            r30 = r1
        L305:
            int r1 = r12.o
            int r0 = java.lang.Math.max(r0, r1)
            r9.addLast(r12)
        L30e:
            int r4 = r4 + 1
            r12 = r23
            r1 = r30
            r15 = r51
            goto L2d7
        L317:
            if (r1 >= r14) goto L35e
            int r12 = r14 - r1
            int r29 = r29 - r12
            int r1 = r1 + r12
            r13 = r29
        L320:
            if (r13 >= r11) goto L342
            if (r25 <= 0) goto L342
            int r15 = r25 + (-1)
            r23 = r1
            kr3 r1 = r2.o(r15, r5)
            r30 = r4
            r4 = 0
            r9.add(r4, r1)
            int r4 = r1.o
            int r0 = java.lang.Math.max(r0, r4)
            int r1 = r1.n
            int r13 = r13 + r1
            r25 = r15
            r1 = r23
            r4 = r30
            goto L320
        L342:
            r23 = r1
            r30 = r4
            r4 = r49
            int r49 = r4 + r12
            if (r13 >= 0) goto L357
            int r49 = r49 + r13
            int r1 = r23 + r13
            r12 = r1
            r1 = r25
            r15 = r49
            r13 = 0
            goto L368
        L357:
            r12 = r23
            r1 = r25
            r15 = r49
            goto L368
        L35e:
            r30 = r4
            r4 = r49
            r12 = r1
            r15 = r4
            r1 = r25
            r13 = r29
        L368:
            int r23 = java.lang.Math.round(r18)
            r25 = r0
            int r0 = java.lang.Integer.signum(r23)
            r32 = r11
            int r11 = java.lang.Integer.signum(r15)
            if (r0 != r11) goto L38a
            int r0 = java.lang.Math.round(r18)
            int r0 = java.lang.Math.abs(r0)
            int r11 = java.lang.Math.abs(r15)
            if (r0 < r11) goto L38a
            float r0 = (float) r15
            goto L38c
        L38a:
            r0 = r18
        L38c:
            float r11 = r18 - r0
            r18 = 0
            if (r24 == 0) goto L39c
            if (r15 <= r4) goto L39c
            int r23 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r23 > 0) goto L39c
            int r15 = r15 - r4
            float r4 = (float) r15
            float r18 = r4 + r11
        L39c:
            r11 = r18
            if (r13 < 0) goto L3a1
            goto L3a6
        L3a1:
            java.lang.String r4 = "negative currentFirstItemScrollOffset"
            defpackage.s53.a(r4)
        L3a6:
            int r4 = -r13
            java.lang.Object r15 = r9.first()
            kr3 r15 = (defpackage.kr3) r15
            if (r32 > 0) goto L3b1
            if (r17 >= 0) goto L3b4
        L3b1:
            r49 = r0
            goto L3ba
        L3b4:
            r49 = r0
            r18 = r4
            r0 = 0
            goto L3f3
        L3ba:
            int r0 = r9.a()
            r18 = r15
            r15 = r13
            r13 = 0
        L3c2:
            if (r13 >= r0) goto L3ed
            java.lang.Object r23 = r9.get(r13)
            r29 = r0
            r0 = r23
            kr3 r0 = (defpackage.kr3) r0
            int r0 = r0.n
            if (r15 == 0) goto L3ed
            if (r0 > r15) goto L3ed
            int r23 = r9.a()
            r31 = r0
            int r0 = r23 + (-1)
            if (r13 == r0) goto L3ed
            int r15 = r15 - r31
            int r13 = r13 + 1
            java.lang.Object r0 = r9.get(r13)
            r18 = r0
            kr3 r18 = (defpackage.kr3) r18
            r0 = r29
            goto L3c2
        L3ed:
            r13 = r15
            r15 = r18
            r0 = 0
            r18 = r4
        L3f3:
            int r4 = java.lang.Math.max(r0, r1)
            int r1 = r1 + (-1)
            if (r4 > r1) goto L413
            r0 = 0
        L3fc:
            if (r0 != 0) goto L403
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L403:
            r52 = r11
            kr3 r11 = r2.o(r1, r5)
            r0.add(r11)
            if (r1 == r4) goto L416
            int r1 = r1 + (-1)
            r11 = r52
            goto L3fc
        L413:
            r52 = r11
            r0 = 0
        L416:
            int r1 = r3.size()
            int r1 = r1 + (-1)
            if (r1 < 0) goto L43f
        L41e:
            int r11 = r1 + (-1)
            java.lang.Object r1 = r3.get(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r1 >= r4) goto L43a
            if (r0 != 0) goto L433
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L433:
            kr3 r1 = r2.o(r1, r5)
            r0.add(r1)
        L43a:
            if (r11 >= 0) goto L43d
            goto L43f
        L43d:
            r1 = r11
            goto L41e
        L43f:
            if (r0 != 0) goto L443
            r0 = r27
        L443:
            int r1 = r0.size()
            r4 = r25
            r11 = 0
        L44a:
            if (r11 >= r1) goto L461
            java.lang.Object r23 = r0.get(r11)
            r25 = r1
            r1 = r23
            kr3 r1 = (defpackage.kr3) r1
            int r1 = r1.o
            int r4 = java.lang.Math.max(r4, r1)
            int r11 = r11 + 1
            r1 = r25
            goto L44a
        L461:
            java.lang.Object r1 = defpackage.gt0.Q0(r9)
            kr3 r1 = (defpackage.kr3) r1
            int r1 = r1.a
            int r11 = r51 + (-1)
            int r1 = java.lang.Math.min(r1, r11)
            java.lang.Object r11 = defpackage.gt0.Q0(r9)
            kr3 r11 = (defpackage.kr3) r11
            int r11 = r11.a
            int r11 = r11 + 1
            if (r11 > r1) goto L49c
            r23 = 0
        L47d:
            if (r23 != 0) goto L484
            java.util.ArrayList r23 = new java.util.ArrayList
            r23.<init>()
        L484:
            r25 = r4
            r4 = r23
            r23 = r13
            kr3 r13 = r2.o(r11, r5)
            r4.add(r13)
            if (r11 == r1) goto L4a1
            int r11 = r11 + 1
            r13 = r23
            r23 = r4
            r4 = r25
            goto L47d
        L49c:
            r25 = r4
            r23 = r13
            r4 = 0
        L4a1:
            if (r4 == 0) goto L4b5
            java.lang.Object r11 = defpackage.gt0.Q0(r4)
            kr3 r11 = (defpackage.kr3) r11
            int r11 = r11.a
            if (r11 <= r1) goto L4b5
            java.lang.Object r1 = defpackage.gt0.Q0(r4)
            kr3 r1 = (defpackage.kr3) r1
            int r1 = r1.a
        L4b5:
            int r11 = r3.size()
            r13 = r4
            r4 = 0
        L4bb:
            if (r4 >= r11) goto L4de
            java.lang.Object r29 = r3.get(r4)
            java.lang.Number r29 = (java.lang.Number) r29
            r31 = r3
            int r3 = r29.intValue()
            if (r3 <= r1) goto L4d9
            if (r13 != 0) goto L4d2
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
        L4d2:
            kr3 r3 = r2.o(r3, r5)
            r13.add(r3)
        L4d9:
            int r4 = r4 + 1
            r3 = r31
            goto L4bb
        L4de:
            if (r13 != 0) goto L4e2
            r13 = r27
        L4e2:
            int r1 = r13.size()
            r4 = r25
            r6 = 0
        L4e9:
            if (r6 >= r1) goto L4fa
            java.lang.Object r3 = r13.get(r6)
            kr3 r3 = (defpackage.kr3) r3
            int r3 = r3.o
            int r4 = java.lang.Math.max(r4, r3)
            int r6 = r6 + 1
            goto L4e9
        L4fa:
            java.lang.Object r1 = r9.first()
            boolean r1 = defpackage.nb3.k(r15, r1)
            if (r1 == 0) goto L513
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L513
            boolean r1 = r13.isEmpty()
            if (r1 == 0) goto L513
            r11 = r45
            goto L514
        L513:
            r11 = 0
        L514:
            if (r42 == 0) goto L518
            r1 = r4
            goto L519
        L518:
            r1 = r12
        L519:
            int r1 = defpackage.s21.g(r1, r7)
            if (r42 == 0) goto L520
            r4 = r12
        L520:
            int r3 = defpackage.s21.f(r4, r7)
            r4 = r3
            if (r42 == 0) goto L528
            goto L529
        L528:
            r3 = r1
        L529:
            int r5 = java.lang.Math.min(r3, r14)
            if (r12 >= r5) goto L532
            r6 = r45
            goto L533
        L532:
            r6 = 0
        L533:
            if (r6 == 0) goto L53d
            if (r18 != 0) goto L538
            goto L53d
        L538:
            java.lang.String r5 = "non-zero itemsScrollOffset"
            defpackage.s53.c(r5)
        L53d:
            java.util.ArrayList r5 = new java.util.ArrayList
            int r25 = r9.a()
            int r27 = r0.size()
            int r27 = r27 + r25
            int r25 = r13.size()
            r29 = r1
            int r1 = r25 + r27
            r5.<init>(r1)
            if (r6 == 0) goto L5ea
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L563
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L563
            goto L568
        L563:
            java.lang.String r0 = "no extra items"
            defpackage.s53.a(r0)
        L568:
            int r0 = r9.a()
            r1 = r4
            int[] r4 = new int[r0]
            r6 = 0
        L570:
            if (r6 >= r0) goto L57f
            java.lang.Object r13 = r9.get(r6)
            kr3 r13 = (defpackage.kr3) r13
            int r13 = r13.m
            r4[r6] = r13
            int r6 = r6 + 1
            goto L570
        L57f:
            int[] r6 = new int[r0]
            if (r42 == 0) goto L59f
            r0 = r41
            if (r0 == 0) goto L59a
            r13 = r56
            r0.g(r13, r3, r4, r6)
            r0 = r28
            r28 = r12
            r12 = r0
            r13 = r1
            r20 = r2
            r41 = r11
            r0 = r29
            r11 = r5
            goto L5ba
        L59a:
            ug r0 = defpackage.lb1.c(r20)
            throw r0
        L59f:
            r13 = r56
            if (r21 == 0) goto L5e3
            r0 = r5
            kk3 r5 = defpackage.kk3.Ltr
            r20 = r28
            r28 = r12
            r12 = r20
            r20 = r2
            r41 = r11
            r2 = r13
            r11 = r0
            r13 = r1
            r1 = r21
            r0 = r29
            r1.d(r2, r3, r4, r5, r6)
        L5ba:
            l93 r1 = defpackage.fv.F0(r6)
            int r2 = r1.B
            int r1 = r1.L
            if (r1 <= 0) goto L5c6
            if (r2 >= 0) goto L5ca
        L5c6:
            if (r1 >= 0) goto L5dd
            if (r2 > 0) goto L5dd
        L5ca:
            r3 = 0
        L5cb:
            r4 = r6[r3]
            java.lang.Object r5 = r9.get(r3)
            kr3 r5 = (defpackage.kr3) r5
            r5.k(r4, r0, r13)
            r11.add(r5)
            if (r3 == r2) goto L5dd
            int r3 = r3 + r1
            goto L5cb
        L5dd:
            r1 = r0
            r2 = r13
            r4 = r30
            goto L652
        L5e3:
            java.lang.String r0 = "null horizontalArrangement when isVertical == false"
            ug r0 = defpackage.lb1.c(r0)
            throw r0
        L5ea:
            r1 = r28
            r28 = r12
            r12 = r1
            r20 = r2
            r2 = r4
            r41 = r11
            r1 = r29
            r4 = r30
            r11 = r5
            int r3 = r0.size()
            r5 = r18
            r6 = 0
        L600:
            if (r6 >= r3) goto L61e
            java.lang.Object r21 = r0.get(r6)
            r25 = r0
            r0 = r21
            kr3 r0 = (defpackage.kr3) r0
            r21 = r3
            int r3 = r0.n
            int r5 = r5 - r3
            r0.k(r5, r1, r2)
            r11.add(r0)
            int r6 = r6 + 1
            r3 = r21
            r0 = r25
            goto L600
        L61e:
            int r0 = r9.a()
            r3 = r18
            r6 = 0
        L625:
            if (r6 >= r0) goto L639
            java.lang.Object r5 = r9.get(r6)
            kr3 r5 = (defpackage.kr3) r5
            r5.k(r3, r1, r2)
            r11.add(r5)
            int r5 = r5.n
            int r3 = r3 + r5
            int r6 = r6 + 1
            goto L625
        L639:
            int r0 = r13.size()
            r6 = 0
        L63e:
            if (r6 >= r0) goto L652
            java.lang.Object r5 = r13.get(r6)
            kr3 r5 = (defpackage.kr3) r5
            r5.k(r3, r1, r2)
            r11.add(r5)
            int r5 = r5.n
            int r3 = r3 + r5
            int r6 = r6 + 1
            goto L63e
        L652:
            if (r19 != 0) goto L674
            ei r0 = r10.d
            r25 = 1
            r19 = r1
            r21 = r11
            r18 = r22
            r27 = r23
            r22 = r0
            r23 = r20
            r20 = r2
            r18.e(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r0 = r19
            r13 = r20
            r2 = r23
            r23 = r27
        L671:
            r1 = r28
            goto L67b
        L674:
            r0 = r1
            r13 = r2
            r2 = r20
            r18 = r22
            goto L671
        L67b:
            if (r24 != 0) goto L6b7
            r18.c()
            if (r16 != 0) goto L6b7
            if (r42 == 0) goto L687
            r3 = r13
        L685:
            r6 = 0
            goto L689
        L687:
            r3 = r0
            goto L685
        L689:
            int r0 = java.lang.Math.max(r0, r6)
            int r0 = defpackage.s21.g(r0, r7)
            int r5 = java.lang.Math.max(r13, r6)
            int r5 = defpackage.s21.f(r5, r7)
            if (r42 == 0) goto L69d
            r7 = r5
            goto L69e
        L69d:
            r7 = r0
        L69e:
            if (r7 == r3) goto L6b2
            int r3 = r11.size()
            r8 = r6
        L6a5:
            if (r8 >= r3) goto L6b2
            java.lang.Object r13 = r11.get(r8)
            kr3 r13 = (defpackage.kr3) r13
            r13.q = r7
            int r8 = r8 + 1
            goto L6a5
        L6b2:
            r34 = r5
        L6b4:
            r33 = r0
            goto L6bb
        L6b7:
            r6 = 0
            r34 = r13
            goto L6b4
        L6bb:
            java.lang.Object r0 = r9.f()
            kr3 r0 = (defpackage.kr3) r0
            if (r0 == 0) goto L6c8
            int r0 = r0.a
            r28 = r0
            goto L6ca
        L6c8:
            r28 = r6
        L6ca:
            java.lang.Object r0 = r9.h()
            kr3 r0 = (defpackage.kr3) r0
            if (r0 == 0) goto L6d7
            int r0 = r0.a
            r29 = r0
            goto L6d9
        L6d7:
            r29 = r6
        L6d9:
            er3 r0 = r10.b
            r0.getClass()
            o94 r31 = defpackage.f93.a
            bg2 r0 = new bg2
            r3 = 7
            r0.<init>(r2, r3)
            r3 = r55
            q61 r3 = r3.h
            r35 = r0
            r27 = r3
            r30 = r11
            java.util.List r0 = defpackage.np2.m(r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r3 = r33
            r13 = r34
            if (r41 == 0) goto L70b
            java.lang.Object r5 = defpackage.gt0.J0(r11)
            kr3 r5 = (defpackage.kr3) r5
            if (r5 == 0) goto L709
            int r5 = r5.a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L719
        L709:
            r5 = 0
            goto L719
        L70b:
            java.lang.Object r5 = r9.f()
            kr3 r5 = (defpackage.kr3) r5
            if (r5 == 0) goto L709
            int r5 = r5.a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
        L719:
            if (r41 == 0) goto L730
            java.lang.Object r7 = defpackage.gt0.R0(r11)
            kr3 r7 = (defpackage.kr3) r7
            if (r7 == 0) goto L72c
            int r7 = r7.a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
        L729:
            r7 = r51
            goto L73f
        L72c:
            r7 = r51
            r9 = 0
            goto L73f
        L730:
            java.lang.Object r7 = r9.h()
            kr3 r7 = (defpackage.kr3) r7
            if (r7 == 0) goto L72c
            int r7 = r7.a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            goto L729
        L73f:
            if (r4 < r7) goto L746
            if (r1 <= r14) goto L744
            goto L746
        L744:
            r45 = r6
        L746:
            vo3 r30 = new vo3
            r35 = 1
            r33 = r0
            r32 = r11
            r34 = r24
            r31 = r44
            r30.<init>(r31, r32, r33, r34, r35)
            r1 = r30
            int r3 = r3 + r40
            r51 = r7
            r6 = r57
            int r3 = defpackage.s21.g(r3, r6)
            int r4 = r13 + r39
            int r4 = defpackage.s21.f(r4, r6)
            r6 = r46
            f34 r1 = r6.K(r3, r4, r12, r1)
            if (r5 == 0) goto L774
            int r3 = r5.intValue()
            goto L775
        L774:
            r3 = 0
        L775:
            if (r9 == 0) goto L77c
            int r4 = r9.intValue()
            goto L77d
        L77c:
            r4 = 0
        L77d:
            java.util.List r12 = defpackage.nw7.u0(r3, r4, r11, r0)
            if (r42 == 0) goto L788
            lo4 r0 = defpackage.lo4.Vertical
        L785:
            r16 = r0
            goto L78b
        L788:
            lo4 r0 = defpackage.lo4.Horizontal
            goto L785
        L78b:
            jr3 r0 = new jr3
            long r10 = r2.d
            r9 = r56
            r5 = r1
            r1 = r15
            r18 = r17
            r2 = r23
            r17 = r36
            r8 = r37
            r13 = r38
            r3 = r45
            r14 = r47
            r4 = r49
            r7 = r50
            r15 = r51
            r38 = r6
            r6 = r52
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18)
        L7ae:
            boolean r1 = r38.a0()
            r13 = r48
            r6 = 0
            r13.g(r0, r1, r6)
            oe1 r1 = r13.a
            return r0
        L7bb:
            r0 = move-exception
            defpackage.ln2.V(r3, r6, r4)
            throw r0
        L7c0:
            java.lang.String r0 = "null horizontalAlignment when isVertical == false"
            ug r0 = defpackage.lb1.c(r0)
            throw r0
    }
}

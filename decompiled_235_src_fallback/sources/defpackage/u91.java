package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u91  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class u91 implements defpackage.fo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;
    public final /* synthetic */ java.lang.Object L;
    public final /* synthetic */ java.lang.Object R;
    public final /* synthetic */ java.lang.Object X;
    public final /* synthetic */ java.lang.Object Y;

    public /* synthetic */ u91(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, int r6) {
            r0 = this;
            r0.A = r6
            r0.B = r1
            r0.L = r2
            r0.R = r3
            r0.X = r4
            r0.Y = r5
            r0.<init>()
            return
    }

    @Override // defpackage.fo2
    public final java.lang.Object e(java.lang.Object r40, java.lang.Object r41, java.lang.Object r42) {
            r39 = this;
            r0 = r39
            int r1 = r0.A
            r3 = 18
            r5 = 1
            jg7 r7 = defpackage.jg7.a
            vs0 r9 = defpackage.ox0.a
            java.lang.Object r10 = r0.Y
            java.lang.Object r11 = r0.X
            java.lang.Object r12 = r0.R
            java.lang.Object r13 = r0.L
            java.lang.Object r0 = r0.B
            switch(r1) {
                case 0: goto L4ca;
                case 1: goto L464;
                case 2: goto L39b;
                case 3: goto L2c6;
                case 4: goto L210;
                default: goto L18;
            }
        L18:
            el6 r0 = (defpackage.el6) r0
            el6 r13 = (defpackage.el6) r13
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            k92 r11 = (defpackage.k92) r11
            java.lang.String r10 = (java.lang.String) r10
            r1 = r40
            eo2 r1 = (defpackage.eo2) r1
            r14 = r41
            px0 r14 = (defpackage.px0) r14
            r15 = r42
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            r16 = r15 & 6
            if (r16 != 0) goto L43
            r4 = r14
            xq2 r4 = (defpackage.xq2) r4
            boolean r4 = r4.h(r1)
            if (r4 == 0) goto L41
            r4 = 4
            goto L42
        L41:
            r4 = 2
        L42:
            r15 = r15 | r4
        L43:
            r4 = r15 & 19
            if (r4 == r3) goto L49
            r3 = r5
            goto L4a
        L49:
            r3 = 0
        L4a:
            r4 = r15 & 1
            xq2 r14 = (defpackage.xq2) r14
            boolean r3 = r14.S(r4, r3)
            if (r3 == 0) goto L20c
            boolean r3 = defpackage.nb3.k(r0, r13)
            if (r3 == 0) goto L5d
            r13 = 150(0x96, float:2.1E-43)
            goto L5f
        L5d:
            r13 = 75
        L5f:
            if (r3 == 0) goto L88
            java.util.ArrayList r4 = new java.util.ArrayList
            r22 = 14
            int r2 = r12.size()
            r4.<init>(r2)
            int r2 = r12.size()
            r8 = 0
        L71:
            if (r8 >= r2) goto L7f
            java.lang.Object r6 = r12.get(r8)
            if (r6 == 0) goto L7c
            r4.add(r6)
        L7c:
            int r8 = r8 + 1
            goto L71
        L7f:
            int r2 = r4.size()
            if (r2 == r5) goto L8a
            r4 = 75
            goto L8b
        L88:
            r22 = 14
        L8a:
            r4 = 0
        L8b:
            e41 r2 = defpackage.ir1.c
            sc7 r6 = new sc7
            r6.<init>(r13, r4, r2)
            boolean r2 = r14.h(r0)
            boolean r8 = r14.h(r11)
            r2 = r2 | r8
            java.lang.Object r8 = r14.P()
            if (r2 != 0) goto La3
            if (r8 != r9) goto Lad
        La3:
            ci2 r8 = new ci2
            r2 = 28
            r8.<init>(r2, r0, r11)
            r14.l0(r8)
        Lad:
            on2 r8 = (defpackage.on2) r8
            java.lang.Object r2 = r14.P()
            if (r2 != r9) goto Lc2
            if (r3 != 0) goto Lba
            r2 = 1065353216(0x3f800000, float:1.0)
            goto Lbb
        Lba:
            r2 = 0
        Lbb:
            gn r2 = defpackage.nb3.b(r2)
            r14.l0(r2)
        Lc2:
            gn r2 = (defpackage.gn) r2
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r3)
            boolean r16 = r14.h(r2)
            boolean r17 = r14.g(r3)
            r16 = r16 | r17
            boolean r17 = r14.h(r6)
            r16 = r16 | r17
            boolean r17 = r14.f(r8)
            r16 = r16 | r17
            java.lang.Object r11 = r14.P()
            if (r16 != 0) goto Led
            if (r11 != r9) goto Le7
            goto Led
        Le7:
            r38 = r3
            r3 = r2
            r2 = r38
            goto L105
        Led:
            f12 r16 = new f12
            r21 = 0
            r17 = r2
            r18 = r3
            r19 = r6
            r20 = r8
            r16.<init>(r17, r18, r19, r20, r21)
            r11 = r16
            r3 = r17
            r2 = r18
            r14.l0(r11)
        L105:
            eo2 r11 = (defpackage.eo2) r11
            defpackage.mb3.i(r14, r11, r12)
            uo r3 = r3.c
            v71 r6 = defpackage.ir1.a
            sc7 r8 = new sc7
            r8.<init>(r13, r4, r6)
            java.lang.Object r4 = r14.P()
            if (r4 != r9) goto L128
            if (r2 != 0) goto L11e
            r11 = 1065353216(0x3f800000, float:1.0)
            goto L121
        L11e:
            r11 = 1061997773(0x3f4ccccd, float:0.8)
        L121:
            gn r4 = defpackage.nb3.b(r11)
            r14.l0(r4)
        L128:
            gn r4 = (defpackage.gn) r4
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            boolean r11 = r14.h(r4)
            boolean r12 = r14.g(r2)
            r11 = r11 | r12
            boolean r12 = r14.h(r8)
            r11 = r11 | r12
            java.lang.Object r12 = r14.P()
            if (r11 != 0) goto L144
            if (r12 != r9) goto L14d
        L144:
            pg1 r12 = new pg1
            r11 = 0
            r12.<init>(r4, r2, r8, r11)
            r14.l0(r12)
        L14d:
            eo2 r12 = (defpackage.eo2) r12
            defpackage.mb3.i(r14, r12, r6)
            uo r4 = r4.c
            vs4 r6 = r4.B
            java.lang.Object r6 = r6.getValue()
            java.lang.Number r6 = (java.lang.Number) r6
            float r25 = r6.floatValue()
            vs4 r4 = r4.B
            java.lang.Object r4 = r4.getValue()
            java.lang.Number r4 = (java.lang.Number) r4
            float r26 = r4.floatValue()
            vs4 r3 = r3.B
            java.lang.Object r3 = r3.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            float r27 = r3.floatValue()
            long r30 = defpackage.i97.b
            jy2 r32 = defpackage.u24.m
            r33 = 0
            long r34 = defpackage.yt2.a
            x64 r24 = defpackage.x64.a
            r28 = 0
            r29 = 0
            r36 = r34
            a74 r3 = defpackage.hv.H(r24, r25, r26, r27, r28, r29, r30, r32, r33, r34, r36)
            boolean r4 = r14.g(r2)
            boolean r6 = r14.f(r10)
            r4 = r4 | r6
            boolean r6 = r14.h(r0)
            r4 = r4 | r6
            java.lang.Object r6 = r14.P()
            if (r4 != 0) goto L1a2
            if (r6 != r9) goto L1ab
        L1a2:
            bj1 r6 = new bj1
            r4 = 2
            r6.<init>(r4, r10, r0, r2)
            r14.l0(r6)
        L1ab:
            qn2 r6 = (defpackage.qn2) r6
            r0 = 0
            a74 r2 = defpackage.ua6.a(r3, r0, r6)
            e40 r3 = defpackage.d90.L
            e34 r0 = defpackage.h70.d(r3, r0)
            int r3 = defpackage.ge7.B(r14)
            xv4 r4 = r14.l()
            a74 r2 = defpackage.l.E(r14, r2)
            ix0 r6 = defpackage.jx0.i
            r6.getClass()
            iy0 r6 = defpackage.ix0.b
            r14.f0()
            boolean r8 = r14.S
            if (r8 == 0) goto L1d6
            r14.k(r6)
            goto L1d9
        L1d6:
            r14.o0()
        L1d9:
            pn r6 = defpackage.ix0.f
            defpackage.yh2.K(r14, r6, r0)
            pn r0 = defpackage.ix0.e
            defpackage.yh2.K(r14, r0, r4)
            pn r0 = defpackage.ix0.g
            boolean r4 = r14.S
            if (r4 != 0) goto L1f7
            java.lang.Object r4 = r14.P()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            boolean r4 = defpackage.nb3.k(r4, r6)
            if (r4 != 0) goto L1fa
        L1f7:
            defpackage.i61.v(r3, r14, r3, r0)
        L1fa:
            pn r0 = defpackage.ix0.d
            defpackage.yh2.K(r14, r0, r2)
            r0 = r15 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.o(r14, r0)
            r14.p(r5)
            goto L20f
        L20c:
            r14.V()
        L20f:
            return r7
        L210:
            zt5 r0 = (defpackage.zt5) r0
            java.lang.String r13 = (java.lang.String) r13
            mi6 r12 = (defpackage.mi6) r12
            android.content.Context r11 = (android.content.Context) r11
            qn2 r10 = (defpackage.qn2) r10
            r1 = r40
            jo r1 = (defpackage.jo) r1
            r2 = r41
            px0 r2 = (defpackage.px0) r2
            r3 = r42
            java.lang.Integer r3 = (java.lang.Integer) r3
            r3.getClass()
            r1.getClass()
            r1 = 2131952719(0x7f13044f, float:1.9541889E38)
            java.lang.String r14 = defpackage.yh2.O(r2, r1)
            java.lang.Boolean r1 = r0.n
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r3 = defpackage.nb3.k(r1, r3)
            if (r3 == 0) goto L24c
            r1 = r2
            xq2 r1 = (defpackage.xq2) r1
            r3 = 2131952358(0x7f1302e6, float:1.9541156E38)
            r4 = -284385635(0xffffffffef0c9e9d, float:-4.3519653E28)
            r5 = 0
        L247:
            java.lang.String r1 = defpackage.i61.l(r1, r4, r3, r1, r5)
            goto L271
        L24c:
            r5 = 0
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            boolean r3 = defpackage.nb3.k(r1, r3)
            if (r3 == 0) goto L25f
            r1 = r2
            xq2 r1 = (defpackage.xq2) r1
            r3 = 2131952304(0x7f1302b0, float:1.9541047E38)
            r4 = -284383682(0xffffffffef0ca63e, float:-4.3528876E28)
            goto L247
        L25f:
            if (r1 != 0) goto L2bb
            r1 = r2
            xq2 r1 = (defpackage.xq2) r1
            r3 = -284381710(0xffffffffef0cadf2, float:-4.353819E28)
            r1.b0(r3)
            r1.p(r5)
            java.lang.String r1 = defpackage.qo2.c(r11, r13)
        L271:
            xq2 r2 = (defpackage.xq2) r2
            boolean r3 = r2.f(r12)
            boolean r4 = r2.h(r11)
            r3 = r3 | r4
            boolean r4 = r2.f(r13)
            r3 = r3 | r4
            boolean r4 = r2.h(r0)
            r3 = r3 | r4
            boolean r4 = r2.f(r10)
            r3 = r3 | r4
            java.lang.Object r4 = r2.P()
            if (r3 != 0) goto L293
            if (r4 != r9) goto L2a8
        L293:
            jn3 r15 = new jn3
            r21 = 2
            r18 = r0
            r20 = r10
            r17 = r11
            r16 = r12
            r19 = r13
            r15.<init>(r16, r17, r18, r19, r20, r21)
            r2.l0(r15)
            r4 = r15
        L2a8:
            r18 = r4
            on2 r18 = (defpackage.on2) r18
            r20 = 3072(0xc00, float:4.305E-42)
            r21 = 4
            r16 = 0
            r17 = 1
            r15 = r1
            r19 = r2
            defpackage.lt5.a(r14, r15, r16, r17, r18, r19, r20, r21)
            return r7
        L2bb:
            r0 = -284387609(0xffffffffef0c96e7, float:-4.351033E28)
            xq2 r2 = (defpackage.xq2) r2
            r5 = 0
            ug r0 = defpackage.xg6.f(r2, r0, r5)
            throw r0
        L2c6:
            r22 = 14
            on2 r0 = (defpackage.on2) r0
            on2 r13 = (defpackage.on2) r13
            on2 r12 = (defpackage.on2) r12
            on2 r11 = (defpackage.on2) r11
            qa4 r10 = (defpackage.qa4) r10
            r1 = r40
            zt0 r1 = (defpackage.zt0) r1
            r2 = r41
            px0 r2 = (defpackage.px0) r2
            r3 = r42
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.getClass()
            r1 = r3 & 17
            r4 = 16
            if (r1 == r4) goto L2ed
            r8 = r5
            goto L2ee
        L2ed:
            r8 = 0
        L2ee:
            r1 = r3 & 1
            xq2 r2 = (defpackage.xq2) r2
            boolean r1 = r2.S(r1, r8)
            if (r1 == 0) goto L395
            boolean r1 = r2.f(r0)
            java.lang.Object r3 = r2.P()
            if (r1 != 0) goto L304
            if (r3 != r9) goto L30e
        L304:
            s00 r3 = new s00
            r1 = 12
            r3.<init>(r0, r10, r1)
            r2.l0(r3)
        L30e:
            r14 = r3
            on2 r14 = (defpackage.on2) r14
            zv0 r18 = defpackage.ge7.e
            r20 = 196608(0x30000, float:2.75506E-40)
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = r2
            defpackage.ti.b(r14, r15, r16, r17, r18, r19, r20)
            boolean r0 = r2.f(r13)
            java.lang.Object r1 = r2.P()
            if (r0 != 0) goto L32b
            if (r1 != r9) goto L335
        L32b:
            s00 r1 = new s00
            r0 = 13
            r1.<init>(r13, r10, r0)
            r2.l0(r1)
        L335:
            r14 = r1
            on2 r14 = (defpackage.on2) r14
            zv0 r18 = defpackage.ge7.f
            r20 = 196608(0x30000, float:2.75506E-40)
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = r2
            defpackage.ti.b(r14, r15, r16, r17, r18, r19, r20)
            boolean r0 = r2.f(r12)
            java.lang.Object r1 = r2.P()
            if (r0 != 0) goto L352
            if (r1 != r9) goto L35c
        L352:
            s00 r1 = new s00
            r0 = r22
            r1.<init>(r12, r10, r0)
            r2.l0(r1)
        L35c:
            r14 = r1
            on2 r14 = (defpackage.on2) r14
            zv0 r18 = defpackage.ge7.g
            r20 = 196608(0x30000, float:2.75506E-40)
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = r2
            defpackage.ti.b(r14, r15, r16, r17, r18, r19, r20)
            boolean r0 = r2.f(r11)
            java.lang.Object r1 = r2.P()
            if (r0 != 0) goto L379
            if (r1 != r9) goto L383
        L379:
            s00 r1 = new s00
            r0 = 15
            r1.<init>(r11, r10, r0)
            r2.l0(r1)
        L383:
            r14 = r1
            on2 r14 = (defpackage.on2) r14
            zv0 r18 = defpackage.ge7.h
            r20 = 196608(0x30000, float:2.75506E-40)
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = r2
            defpackage.ti.b(r14, r15, r16, r17, r18, r19, r20)
            goto L39a
        L395:
            r19 = r2
            r19.V()
        L39a:
            return r7
        L39b:
            on2 r0 = (defpackage.on2) r0
            java.lang.String[] r13 = (java.lang.String[]) r13
            me.magnum.melonds.domain.model.layout.BackgroundMode r12 = (me.magnum.melonds.domain.model.layout.BackgroundMode) r12
            qn2 r11 = (defpackage.qn2) r11
            qa4 r10 = (defpackage.qa4) r10
            r8 = r40
            lq4 r8 = (defpackage.lq4) r8
            r1 = r41
            px0 r1 = (defpackage.px0) r1
            r2 = r42
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r8.getClass()
            r4 = r2 & 6
            if (r4 != 0) goto L3c9
            r4 = r1
            xq2 r4 = (defpackage.xq2) r4
            boolean r4 = r4.f(r8)
            if (r4 == 0) goto L3c7
            r6 = 4
            goto L3c8
        L3c7:
            r6 = 2
        L3c8:
            r2 = r2 | r6
        L3c9:
            r4 = r2 & 19
            if (r4 == r3) goto L3cf
            r3 = r5
            goto L3d0
        L3cf:
            r3 = 0
        L3d0:
            r2 = r2 & r5
            r5 = r1
            xq2 r5 = (defpackage.xq2) r5
            boolean r1 = r5.S(r2, r3)
            if (r1 == 0) goto L460
            r1 = 2131951726(0x7f13006e, float:1.9539875E38)
            java.lang.String r1 = defpackage.yh2.O(r5, r1)
            java.lang.Object r2 = r10.getValue()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L3f5
            r2 = -235878224(0xfffffffff1f0c8b0, float:-2.3846086E30)
            r3 = 2131952300(0x7f1302ac, float:1.9541039E38)
            r4 = 0
            java.lang.String r2 = defpackage.i61.l(r5, r2, r3, r5, r4)
            goto L3ff
        L3f5:
            r4 = 0
            r3 = -235878782(0xfffffffff1f0c682, float:-2.3845243E30)
            r5.b0(r3)
            r5.p(r4)
        L3ff:
            nq6 r10 = defpackage.ky0.n
            java.lang.Object r3 = r5.j(r10)
            kk3 r3 = (defpackage.kk3) r3
            float r4 = defpackage.ge7.r(r8, r3)
            r6 = 0
            r3 = r0
            r0 = r1
            r1 = r2
            r2 = 0
            defpackage.nw7.d(r0, r1, r2, r3, r4, r5, r6)
            r0 = 2131951725(0x7f13006d, float:1.9539873E38)
            java.lang.String r23 = defpackage.yh2.O(r5, r0)
            int r0 = r12.ordinal()
            if (r0 < 0) goto L428
            int r1 = r13.length
            if (r0 >= r1) goto L428
            r0 = r13[r0]
        L425:
            r24 = r0
            goto L42b
        L428:
            java.lang.String r0 = ""
            goto L425
        L42b:
            java.util.List r25 = defpackage.fv.T0(r13)
            int r26 = r12.ordinal()
            boolean r0 = r5.f(r11)
            java.lang.Object r1 = r5.P()
            if (r0 != 0) goto L43f
            if (r1 != r9) goto L448
        L43f:
            y00 r1 = new y00
            r2 = 4
            r1.<init>(r2, r11)
            r5.l0(r1)
        L448:
            r27 = r1
            qn2 r27 = (defpackage.qn2) r27
            java.lang.Object r0 = r5.j(r10)
            kk3 r0 = (defpackage.kk3) r0
            float r29 = defpackage.ge7.r(r8, r0)
            r31 = 0
            r28 = 0
            r30 = r5
            defpackage.yh2.f(r23, r24, r25, r26, r27, r28, r29, r30, r31)
            goto L463
        L460:
            r5.V()
        L463:
            return r7
        L464:
            bt r0 = (defpackage.bt) r0
            r14 = r13
            a74 r14 = (defpackage.a74) r14
            kt0 r12 = (defpackage.kt0) r12
            fo2 r10 = (defpackage.fo2) r10
            r1 = r40
            jo r1 = (defpackage.jo) r1
            r2 = r41
            px0 r2 = (defpackage.px0) r2
            r3 = r42
            java.lang.Integer r3 = (java.lang.Integer) r3
            r3.getClass()
            r1.getClass()
            xq2 r2 = (defpackage.xq2) r2
            boolean r1 = r2.h(r0)
            java.lang.Object r3 = r2.P()
            if (r1 != 0) goto L48d
            if (r3 != r9) goto L496
        L48d:
            k0 r3 = new k0
            r4 = 2
            r3.<init>(r0, r4)
            r2.l0(r3)
        L496:
            qn2 r3 = (defpackage.qn2) r3
            defpackage.mb3.d(r0, r3, r2)
            r15 = 1082130432(0x40800000, float:4.0)
            y16 r16 = defpackage.z16.b(r15)
            r18 = 0
            r20 = 28
            r17 = 0
            a74 r24 = defpackage.nj2.E(r14, r15, r16, r17, r18, r20)
            y16 r25 = defpackage.z16.b(r15)
            x3 r0 = new x3
            r5 = 0
            r0.<init>(r12, r11, r10, r5)
            r1 = 220644999(0xd26c687, float:5.139167E-31)
            zv0 r29 = defpackage.n16.I(r1, r0, r2)
            r31 = 1572864(0x180000, float:2.204052E-39)
            r32 = 60
            r26 = 0
            r28 = 0
            r30 = r2
            defpackage.hf.b(r24, r25, r26, r28, r29, r30, r31, r32)
            return r7
        L4ca:
            r2 = 4
            r4 = 2
            fa1 r0 = (defpackage.fa1) r0
            la1 r13 = (defpackage.la1) r13
            j37 r12 = (defpackage.j37) r12
            za1 r11 = (defpackage.za1) r11
            cb1 r10 = (defpackage.cb1) r10
            r1 = r40
            lq4 r1 = (defpackage.lq4) r1
            r6 = r41
            px0 r6 = (defpackage.px0) r6
            r8 = r42
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r1.getClass()
            r14 = r8 & 6
            if (r14 != 0) goto L4f8
            r14 = r6
            xq2 r14 = (defpackage.xq2) r14
            boolean r14 = r14.f(r1)
            if (r14 == 0) goto L4f7
            r4 = r2
        L4f7:
            r8 = r8 | r4
        L4f8:
            r2 = r8 & 19
            if (r2 == r3) goto L4fd
            goto L4fe
        L4fd:
            r5 = 0
        L4fe:
            r2 = r8 & 1
            xq2 r6 = (defpackage.xq2) r6
            boolean r2 = r6.S(r2, r5)
            if (r2 == 0) goto L68b
            boolean r2 = r0 instanceof defpackage.ba1
            x64 r3 = defpackage.x64.a
            if (r2 == 0) goto L557
            r2 = 1349130694(0x506a19c6, float:1.5710231E10)
            r6.b0(r2)
            a74 r2 = defpackage.ge7.N(r3, r1)
            a74 r1 = defpackage.q60.s(r2, r1)
            lc2 r2 = defpackage.dj6.c
            a74 r1 = r1.d(r2)
            ba1 r0 = (defpackage.ba1) r0
            cz0 r0 = r0.a
            boolean r2 = r6.h(r13)
            java.lang.Object r3 = r6.P()
            if (r2 != 0) goto L532
            if (r3 != r9) goto L54a
        L532:
            i4 r14 = new i4
            r21 = 0
            r22 = 2
            r15 = 0
            java.lang.Class<la1> r17 = defpackage.la1.class
            java.lang.String r18 = "revalidateBiosConfiguration"
            java.lang.String r19 = "revalidateBiosConfiguration()V"
            r20 = 0
            r16 = r13
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            r6.l0(r14)
            r3 = r14
        L54a:
            po2 r3 = (defpackage.po2) r3
            on2 r3 = (defpackage.on2) r3
            r5 = 0
            defpackage.ak7.w(r1, r0, r3, r6, r5)
            r6.p(r5)
            goto L68e
        L557:
            r5 = 0
            boolean r2 = r0 instanceof defpackage.da1
            if (r2 == 0) goto L578
            r0 = -926299508(0xffffffffc8c9ca8c, float:-413268.38)
            r6.b0(r0)
            a74 r0 = defpackage.ge7.N(r3, r1)
            a74 r0 = defpackage.q60.s(r0, r1)
            lc2 r1 = defpackage.dj6.c
            a74 r0 = r0.d(r1)
            defpackage.ak7.z(r0, r6, r5)
            r6.p(r5)
            goto L68e
        L578:
            boolean r2 = r0 instanceof defpackage.ea1
            if (r2 == 0) goto L663
            r2 = 1349632925(0x5071c39d, float:1.6224515E10)
            r6.b0(r2)
            lc2 r23 = defpackage.dj6.c
            ea1 r0 = (defpackage.ea1) r0
            java.util.List r0 = r0.a
            boolean r2 = r6.f(r12)
            boolean r3 = r6.h(r13)
            r2 = r2 | r3
            java.lang.Object r3 = r6.P()
            if (r2 != 0) goto L599
            if (r3 != r9) goto L5a3
        L599:
            y r3 = new y
            r2 = 21
            r3.<init>(r2, r12, r13)
            r6.l0(r3)
        L5a3:
            r26 = r3
            qn2 r26 = (defpackage.qn2) r26
            boolean r2 = r6.h(r13)
            java.lang.Object r3 = r6.P()
            if (r2 != 0) goto L5b3
            if (r3 != r9) goto L5cb
        L5b3:
            a0 r14 = new a0
            r21 = 0
            r22 = 4
            r15 = 1
            java.lang.Class<la1> r17 = defpackage.la1.class
            java.lang.String r18 = "deleteTitle"
            java.lang.String r19 = "deleteTitle(Lme/magnum/melonds/domain/model/DSiWareTitle;)V"
            r20 = 0
            r16 = r13
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            r6.l0(r14)
            r3 = r14
        L5cb:
            po2 r3 = (defpackage.po2) r3
            r27 = r3
            qn2 r27 = (defpackage.qn2) r27
            boolean r2 = r6.h(r11)
            java.lang.Object r3 = r6.P()
            if (r2 != 0) goto L5dd
            if (r3 != r9) goto L5f5
        L5dd:
            h4 r14 = new h4
            r21 = 0
            r22 = 2
            r15 = 2
            java.lang.Class<za1> r17 = defpackage.za1.class
            java.lang.String r18 = "launch"
            java.lang.String r19 = "launch(Lme/magnum/melonds/domain/model/DSiWareTitle;Lme/magnum/melonds/domain/model/dsinand/DSiWareTitleFileType;)V"
            r20 = 0
            r16 = r11
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            r6.l0(r14)
            r3 = r14
        L5f5:
            po2 r3 = (defpackage.po2) r3
            r28 = r3
            eo2 r28 = (defpackage.eo2) r28
            boolean r2 = r6.h(r10)
            java.lang.Object r3 = r6.P()
            if (r2 != 0) goto L607
            if (r3 != r9) goto L61f
        L607:
            h4 r14 = new h4
            r21 = 0
            r22 = 3
            r15 = 2
            java.lang.Class<cb1> r17 = defpackage.cb1.class
            java.lang.String r18 = "launch"
            java.lang.String r19 = "launch(Lme/magnum/melonds/domain/model/DSiWareTitle;Lme/magnum/melonds/domain/model/dsinand/DSiWareTitleFileType;)V"
            r20 = 0
            r16 = r10
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            r6.l0(r14)
            r3 = r14
        L61f:
            po2 r3 = (defpackage.po2) r3
            r29 = r3
            eo2 r29 = (defpackage.eo2) r29
            boolean r2 = r6.h(r13)
            java.lang.Object r3 = r6.P()
            if (r2 != 0) goto L631
            if (r3 != r9) goto L649
        L631:
            a0 r14 = new a0
            r21 = 0
            r22 = 5
            r15 = 1
            java.lang.Class<la1> r17 = defpackage.la1.class
            java.lang.String r18 = "getTitleIcon"
            java.lang.String r19 = "getTitleIcon(Lme/magnum/melonds/domain/model/DSiWareTitle;)Lme/magnum/melonds/ui/romlist/RomIcon;"
            r20 = 0
            r16 = r13
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            r6.l0(r14)
            r3 = r14
        L649:
            po2 r3 = (defpackage.po2) r3
            r30 = r3
            qn2 r30 = (defpackage.qn2) r30
            int r2 = r8 << 3
            r2 = r2 & 112(0x70, float:1.57E-43)
            r32 = r2 | 6
            r25 = r0
            r24 = r1
            r31 = r6
            defpackage.ak7.B(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r5 = 0
            r6.p(r5)
            goto L68e
        L663:
            r5 = 0
            boolean r0 = r0 instanceof defpackage.ca1
            if (r0 == 0) goto L683
            r0 = -926267222(0xffffffffc8ca48aa, float:-414277.3)
            r6.b0(r0)
            a74 r0 = defpackage.ge7.N(r3, r1)
            a74 r0 = defpackage.q60.s(r0, r1)
            lc2 r1 = defpackage.dj6.c
            a74 r0 = r0.d(r1)
            defpackage.ak7.u(r0, r6, r5)
            r6.p(r5)
            goto L68e
        L683:
            r0 = -926312255(0xffffffffc8c998c1, float:-412870.03)
            ug r0 = defpackage.xg6.f(r6, r0, r5)
            throw r0
        L68b:
            r6.V()
        L68e:
            return r7
    }
}

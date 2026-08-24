package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: py5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class py5 implements defpackage.eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ me.magnum.melonds.ui.romlist.a B;
    public final /* synthetic */ boolean L;

    public /* synthetic */ py5(me.magnum.melonds.ui.romlist.a r1, boolean r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.B = r1
            r0.L = r2
            r0.<init>()
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r38, java.lang.Object r39) {
            r37 = this;
            r0 = r37
            int r1 = r0.A
            jg7 r2 = defpackage.jg7.a
            r3 = 2
            r5 = 1
            switch(r1) {
                case 0: goto L519;
                default: goto Lb;
            }
        Lb:
            r1 = r38
            px0 r1 = (defpackage.px0) r1
            r6 = r39
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r7 = r6 & 3
            if (r7 == r3) goto L1d
            r7 = r5
            goto L1e
        L1d:
            r7 = 0
        L1e:
            r6 = r6 & r5
            r11 = r1
            xq2 r11 = (defpackage.xq2) r11
            boolean r1 = r11.S(r6, r7)
            if (r1 == 0) goto L513
            me.magnum.melonds.ui.romlist.a r1 = r0.B
            tz5 r6 = r1.j()
            de5 r6 = r6.I
            qa4 r6 = defpackage.np2.C(r6, r11)
            tz5 r7 = r1.j()
            de5 r8 = r7.C
            m06 r9 = defpackage.m06.NOT_SCANNING
            r12 = 48
            r13 = 2
            r10 = 0
            qa4 r7 = defpackage.np2.B(r8, r9, r10, r11, r12, r13)
            tz5 r8 = r1.j()
            de5 r8 = r8.t
            qa4 r8 = defpackage.np2.C(r8, r11)
            tz5 r9 = r1.j()
            de5 r9 = r9.v
            qa4 r9 = defpackage.np2.C(r9, r11)
            tz5 r10 = r1.j()
            de5 r10 = r10.w
            qa4 r10 = defpackage.np2.C(r10, r11)
            tz5 r12 = r1.j()
            de5 r12 = r12.m
            qa4 r12 = defpackage.np2.C(r12, r11)
            java.lang.Object r13 = r11.P()
            vs0 r14 = defpackage.ox0.a
            r15 = 0
            if (r13 != r14) goto L7c
            vs4 r13 = defpackage.np2.Y(r15)
            r11.l0(r13)
        L7c:
            qa4 r13 = (defpackage.qa4) r13
            r38 = r15
            java.lang.Object r15 = r11.P()
            if (r15 != r14) goto L8f
            java.lang.String r15 = ""
            vs4 r15 = defpackage.np2.Y(r15)
            r11.l0(r15)
        L8f:
            qa4 r15 = (defpackage.qa4) r15
            java.lang.Object r3 = r11.P()
            if (r3 != r14) goto L9e
            vs4 r3 = defpackage.np2.Y(r38)
            r11.l0(r3)
        L9e:
            qa4 r3 = (defpackage.qa4) r3
            java.lang.Object r5 = r11.P()
            if (r5 != r14) goto Laf
            xc1 r5 = defpackage.xc1.CONFIRM
            vs4 r5 = defpackage.np2.Y(r5)
            r11.l0(r5)
        Laf:
            qa4 r5 = (defpackage.qa4) r5
            java.lang.Object r4 = r11.P()
            if (r4 != r14) goto Lc3
            r4 = 0
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            vs4 r4 = defpackage.np2.Y(r4)
            r11.l0(r4)
        Lc3:
            qa4 r4 = (defpackage.qa4) r4
            r35 = r2
            java.lang.Object r2 = r11.P()
            if (r2 != r14) goto Ld4
            w61 r2 = defpackage.mb3.w(r11)
            r11.l0(r2)
        Ld4:
            w61 r2 = (defpackage.w61) r2
            r39 = r4
            d00 r4 = r1.d0
            if (r4 == 0) goto L50d
            java.lang.Object r16 = r6.getValue()
            r17 = r6
            r6 = r16
            ss5 r6 = (defpackage.ss5) r6
            boolean r6 = r6.c
            if (r6 == 0) goto Lf6
            java.lang.Object r6 = r17.getValue()
            ss5 r6 = (defpackage.ss5) r6
            boolean r6 = r6.d
            if (r6 != 0) goto Lf6
            r6 = 1
            goto Lf7
        Lf6:
            r6 = 0
        Lf7:
            r4.f(r6)
            java.lang.Object r4 = r13.getValue()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r6 = r17.getValue()
            ss5 r6 = (defpackage.ss5) r6
            java.util.List r6 = r6.a
            java.lang.Object r16 = r17.getValue()
            r18 = r7
            r7 = r16
            ss5 r7 = (defpackage.ss5) r7
            java.util.List r7 = r7.j
            boolean r4 = r11.f(r4)
            boolean r6 = r11.f(r6)
            r4 = r4 | r6
            boolean r6 = r11.f(r7)
            r4 = r4 | r6
            java.lang.Object r6 = r11.P()
            if (r4 != 0) goto L12a
            if (r6 != r14) goto L1a9
        L12a:
            java.lang.Object r4 = r13.getValue()
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L136
            r6 = r38
            goto L1a6
        L136:
            java.lang.Object r6 = r17.getValue()
            ss5 r6 = (defpackage.ss5) r6
            java.util.List r6 = r6.a
            java.util.Iterator r6 = r6.iterator()
        L142:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L172
            java.lang.Object r7 = r6.next()
            nr5 r7 = (defpackage.nr5) r7
            r16 = r6
            boolean r6 = r7 instanceof defpackage.mr5
            if (r6 == 0) goto L157
            mr5 r7 = (defpackage.mr5) r7
            goto L159
        L157:
            r7 = r38
        L159:
            if (r7 == 0) goto L16a
            pq5 r6 = r7.a
            android.net.Uri r7 = r6.d
            java.lang.String r7 = r7.toString()
            boolean r7 = defpackage.nb3.k(r7, r4)
            if (r7 == 0) goto L16a
            goto L16c
        L16a:
            r6 = r38
        L16c:
            if (r6 == 0) goto L16f
            goto L174
        L16f:
            r6 = r16
            goto L142
        L172:
            r6 = r38
        L174:
            if (r6 != 0) goto L1a6
            java.lang.Object r6 = r17.getValue()
            ss5 r6 = (defpackage.ss5) r6
            java.util.List r6 = r6.j
            java.util.Iterator r6 = r6.iterator()
        L182:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L1a1
            java.lang.Object r7 = r6.next()
            r16 = r6
            r6 = r7
            pq5 r6 = (defpackage.pq5) r6
            android.net.Uri r6 = r6.d
            java.lang.String r6 = r6.toString()
            boolean r6 = defpackage.nb3.k(r6, r4)
            if (r6 == 0) goto L19e
            goto L1a3
        L19e:
            r6 = r16
            goto L182
        L1a1:
            r7 = r38
        L1a3:
            pq5 r7 = (defpackage.pq5) r7
            r6 = r7
        L1a6:
            r11.l0(r6)
        L1a9:
            pq5 r6 = (defpackage.pq5) r6
            boolean r4 = r11.h(r1)
            java.lang.Object r7 = r11.P()
            r38 = r4
            r4 = 22
            if (r38 != 0) goto L1bb
            if (r7 != r14) goto L1c3
        L1bb:
            t00 r7 = new t00
            r7.<init>(r1, r3, r5, r4)
            r11.l0(r7)
        L1c3:
            qn2 r7 = (defpackage.qn2) r7
            java.lang.Object r16 = r17.getValue()
            ss5 r16 = (defpackage.ss5) r16
            java.lang.Object r10 = r10.getValue()
            java.util.Map r10 = (java.util.Map) r10
            java.lang.Object r12 = r12.getValue()
            java.util.Map r12 = (java.util.Map) r12
            java.lang.Object r17 = r15.getValue()
            java.lang.String r17 = (java.lang.String) r17
            java.lang.Object r18 = r18.getValue()
            m06 r18 = (defpackage.m06) r18
            java.lang.Object r8 = r8.getValue()
            java.util.Set r8 = (java.util.Set) r8
            java.lang.Object r9 = r9.getValue()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            boolean r19 = r11.h(r1)
            java.lang.Object r4 = r11.P()
            r36 = r6
            r6 = 3
            if (r19 != 0) goto L202
            if (r4 != r14) goto L20a
        L202:
            qy5 r4 = new qy5
            r4.<init>(r1, r6)
            r11.l0(r4)
        L20a:
            qn2 r4 = (defpackage.qn2) r4
            boolean r19 = r11.h(r1)
            boolean r20 = r11.f(r7)
            r19 = r19 | r20
            java.lang.Object r6 = r11.P()
            if (r19 != 0) goto L222
            if (r6 != r14) goto L21f
            goto L222
        L21f:
            r19 = r4
            goto L22e
        L222:
            qk4 r6 = new qk4
            r19 = r4
            r4 = 14
            r6.<init>(r4, r1, r7)
            r11.l0(r6)
        L22e:
            qn2 r6 = (defpackage.qn2) r6
            java.lang.Object r4 = r11.P()
            if (r4 != r14) goto L243
            j4 r4 = new j4
            r21 = r6
            r6 = 21
            r4.<init>(r13, r6)
            r11.l0(r4)
            goto L245
        L243:
            r21 = r6
        L245:
            qn2 r4 = (defpackage.qn2) r4
            java.lang.Object r6 = r11.P()
            if (r6 != r14) goto L25a
            j4 r6 = new j4
            r22 = r4
            r4 = 22
            r6.<init>(r13, r4)
            r11.l0(r6)
            goto L25c
        L25a:
            r22 = r4
        L25c:
            qn2 r6 = (defpackage.qn2) r6
            boolean r4 = r11.h(r1)
            r38 = r4
            java.lang.Object r4 = r11.P()
            if (r38 != 0) goto L270
            if (r4 != r14) goto L26d
            goto L270
        L26d:
            r38 = r6
            goto L27b
        L270:
            qy5 r4 = new qy5
            r38 = r6
            r6 = 7
            r4.<init>(r1, r6)
            r11.l0(r4)
        L27b:
            qn2 r4 = (defpackage.qn2) r4
            boolean r6 = r11.h(r1)
            r23 = r4
            java.lang.Object r4 = r11.P()
            if (r6 != 0) goto L28b
            if (r4 != r14) goto L295
        L28b:
            qy5 r4 = new qy5
            r6 = 8
            r4.<init>(r1, r6)
            r11.l0(r4)
        L295:
            qn2 r4 = (defpackage.qn2) r4
            boolean r6 = r11.h(r1)
            r24 = r4
            java.lang.Object r4 = r11.P()
            if (r6 != 0) goto L2a5
            if (r4 != r14) goto L2ae
        L2a5:
            ry5 r4 = new ry5
            r6 = 0
            r4.<init>(r1, r6)
            r11.l0(r4)
        L2ae:
            on2 r4 = (defpackage.on2) r4
            boolean r6 = r11.h(r1)
            r25 = r4
            java.lang.Object r4 = r11.P()
            if (r6 != 0) goto L2be
            if (r4 != r14) goto L2c7
        L2be:
            ry5 r4 = new ry5
            r6 = 1
            r4.<init>(r1, r6)
            r11.l0(r4)
        L2c7:
            on2 r4 = (defpackage.on2) r4
            boolean r6 = r11.h(r1)
            r26 = r4
            java.lang.Object r4 = r11.P()
            r27 = r6
            r6 = 15
            if (r27 != 0) goto L2db
            if (r4 != r14) goto L2e3
        L2db:
            qk4 r4 = new qk4
            r4.<init>(r6, r1, r15)
            r11.l0(r4)
        L2e3:
            qn2 r4 = (defpackage.qn2) r4
            boolean r15 = r11.h(r1)
            java.lang.Object r6 = r11.P()
            if (r15 != 0) goto L2f1
            if (r6 != r14) goto L2fa
        L2f1:
            ry5 r6 = new ry5
            r15 = 2
            r6.<init>(r1, r15)
            r11.l0(r6)
        L2fa:
            on2 r6 = (defpackage.on2) r6
            boolean r15 = r11.h(r1)
            r27 = r4
            java.lang.Object r4 = r11.P()
            if (r15 != 0) goto L30a
            if (r4 != r14) goto L313
        L30a:
            ry5 r4 = new ry5
            r15 = 3
            r4.<init>(r1, r15)
            r11.l0(r4)
        L313:
            on2 r4 = (defpackage.on2) r4
            boolean r15 = r11.h(r1)
            r20 = r4
            java.lang.Object r4 = r11.P()
            r28 = r6
            r6 = 4
            if (r15 != 0) goto L326
            if (r4 != r14) goto L32e
        L326:
            ry5 r4 = new ry5
            r4.<init>(r1, r6)
            r11.l0(r4)
        L32e:
            on2 r4 = (defpackage.on2) r4
            boolean r15 = r11.h(r1)
            java.lang.Object r6 = r11.P()
            r29 = r4
            r4 = 5
            if (r15 != 0) goto L33f
            if (r6 != r14) goto L347
        L33f:
            ry5 r6 = new ry5
            r6.<init>(r1, r4)
            r11.l0(r6)
        L347:
            on2 r6 = (defpackage.on2) r6
            boolean r15 = r11.h(r1)
            java.lang.Object r4 = r11.P()
            r30 = r6
            r6 = 6
            if (r15 != 0) goto L358
            if (r4 != r14) goto L360
        L358:
            ry5 r4 = new ry5
            r4.<init>(r1, r6)
            r11.l0(r4)
        L360:
            on2 r4 = (defpackage.on2) r4
            boolean r15 = r11.h(r1)
            java.lang.Object r6 = r11.P()
            if (r15 != 0) goto L36e
            if (r6 != r14) goto L378
        L36e:
            qy5 r6 = new qy5
            r15 = 9
            r6.<init>(r1, r15)
            r11.l0(r6)
        L378:
            qn2 r6 = (defpackage.qn2) r6
            boolean r15 = r11.h(r1)
            r31 = r4
            java.lang.Object r4 = r11.P()
            if (r15 != 0) goto L388
            if (r4 != r14) goto L391
        L388:
            qy5 r4 = new qy5
            r15 = 0
            r4.<init>(r1, r15)
            r11.l0(r4)
        L391:
            qn2 r4 = (defpackage.qn2) r4
            boolean r15 = r11.h(r1)
            r32 = r4
            java.lang.Object r4 = r11.P()
            if (r15 != 0) goto L3a1
            if (r4 != r14) goto L3aa
        L3a1:
            qy5 r4 = new qy5
            r15 = 1
            r4.<init>(r1, r15)
            r11.l0(r4)
        L3aa:
            qn2 r4 = (defpackage.qn2) r4
            r34 = 0
            r15 = r9
            r9 = r10
            r10 = r12
            boolean r12 = r0.L
            r0 = r26
            r26 = r20
            r20 = r23
            r23 = r0
            r33 = r11
            r0 = r13
            r11 = r17
            r13 = r18
            r17 = r21
            r18 = r22
            r21 = r24
            r22 = r25
            r24 = r27
            r25 = r28
            r27 = r29
            r28 = r30
            r29 = r31
            r31 = r32
            r32 = r4
            r30 = r6
            r4 = r14
            r14 = r8
            r8 = r16
            r16 = r19
            r19 = r38
            defpackage.nw7.D(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r11 = r33
            java.lang.Object r6 = r11.P()
            if (r6 != r4) goto L3f7
            oe4 r6 = new oe4
            r8 = 15
            r6.<init>(r0, r8)
            r11.l0(r6)
        L3f7:
            r9 = r6
            on2 r9 = (defpackage.on2) r9
            boolean r0 = r11.h(r1)
            java.lang.Object r6 = r11.P()
            if (r0 != 0) goto L406
            if (r6 != r4) goto L40f
        L406:
            qy5 r6 = new qy5
            r15 = 2
            r6.<init>(r1, r15)
            r11.l0(r6)
        L40f:
            r10 = r6
            qn2 r10 = (defpackage.qn2) r10
            boolean r0 = r11.h(r1)
            java.lang.Object r6 = r11.P()
            if (r0 != 0) goto L41e
            if (r6 != r4) goto L427
        L41e:
            qy5 r6 = new qy5
            r0 = 4
            r6.<init>(r1, r0)
            r11.l0(r6)
        L427:
            qn2 r6 = (defpackage.qn2) r6
            boolean r0 = r11.h(r1)
            java.lang.Object r8 = r11.P()
            if (r0 != 0) goto L435
            if (r8 != r4) goto L43e
        L435:
            qy5 r8 = new qy5
            r0 = 5
            r8.<init>(r1, r0)
            r11.l0(r8)
        L43e:
            r12 = r8
            qn2 r12 = (defpackage.qn2) r12
            boolean r0 = r11.h(r1)
            java.lang.Object r8 = r11.P()
            if (r0 != 0) goto L44d
            if (r8 != r4) goto L456
        L44d:
            qy5 r8 = new qy5
            r0 = 6
            r8.<init>(r1, r0)
            r11.l0(r8)
        L456:
            r13 = r8
            qn2 r13 = (defpackage.qn2) r13
            boolean r0 = r11.f(r7)
            java.lang.Object r8 = r11.P()
            if (r0 != 0) goto L465
            if (r8 != r4) goto L46f
        L465:
            y00 r8 = new y00
            r0 = 24
            r8.<init>(r0, r7)
            r11.l0(r8)
        L46f:
            r14 = r8
            qn2 r14 = (defpackage.qn2) r14
            java.lang.Object r0 = r11.P()
            if (r0 != r4) goto L481
            w4 r0 = new w4
            r15 = 1
            r0.<init>(r3, r5, r15)
            r11.l0(r0)
        L481:
            r15 = r0
            qn2 r15 = (defpackage.qn2) r15
            r17 = 12582960(0xc00030, float:1.7632483E-38)
            r16 = r11
            r8 = r36
            r11 = r6
            defpackage.zu5.b(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r11 = r16
            java.lang.Object r0 = r3.getValue()
            pq5 r0 = (defpackage.pq5) r0
            if (r0 != 0) goto L4a5
            r0 = 1976964136(0x75d61428, float:5.4275407E32)
            r11.b0(r0)
            r15 = 0
            r11.p(r15)
            goto L518
        L4a5:
            r6 = 1976964137(0x75d61429, float:5.427541E32)
            r11.b0(r6)
            java.lang.Object r6 = r11.P()
            if (r6 != r4) goto L4bb
            oe4 r6 = new oe4
            r7 = 16
            r6.<init>(r3, r7)
            r11.l0(r6)
        L4bb:
            r8 = r6
            on2 r8 = (defpackage.on2) r8
            boolean r3 = r11.h(r2)
            boolean r6 = r11.h(r1)
            r3 = r3 | r6
            boolean r6 = r11.h(r0)
            r3 = r3 | r6
            java.lang.Object r6 = r11.P()
            if (r3 != 0) goto L4d9
            if (r6 != r4) goto L4d5
            goto L4d9
        L4d5:
            r15 = r39
            r14 = r5
            goto L4ec
        L4d9:
            jn3 r12 = new jn3
            r18 = 4
            r15 = r39
            r17 = r0
            r16 = r1
            r13 = r2
            r14 = r5
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r11.l0(r12)
            r6 = r12
        L4ec:
            r9 = r6
            on2 r9 = (defpackage.on2) r9
            java.lang.Object r0 = r14.getValue()
            r10 = r0
            xc1 r10 = (defpackage.xc1) r10
            java.lang.Object r0 = r15.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            r13 = 54
            r12 = r11
            r11 = r0
            defpackage.nw7.n(r8, r9, r10, r11, r12, r13)
            r11 = r12
            r15 = 0
            r11.p(r15)
            goto L518
        L50d:
            java.lang.String r0 = "backPressedCallback"
            defpackage.nb3.a0(r0)
            throw r38
        L513:
            r35 = r2
            r11.V()
        L518:
            return r35
        L519:
            r35 = r2
            r1 = r38
            px0 r1 = (defpackage.px0) r1
            r2 = r39
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = r2 & 3
            r15 = 2
            if (r3 == r15) goto L52f
            r6 = 1
        L52d:
            r15 = 1
            goto L531
        L52f:
            r6 = 0
            goto L52d
        L531:
            r2 = r2 & r15
            xq2 r1 = (defpackage.xq2) r1
            boolean r2 = r1.S(r2, r6)
            if (r2 == 0) goto L551
            py5 r2 = new py5
            me.magnum.melonds.ui.romlist.a r3 = r0.B
            boolean r0 = r0.L
            r2.<init>(r3, r0, r15)
            r0 = 4967943(0x4bce07, float:6.961571E-39)
            zv0 r0 = defpackage.n16.I(r0, r2, r1)
            r2 = 48
            r6 = 0
            defpackage.bl2.e(r6, r0, r1, r2, r15)
            goto L554
        L551:
            r1.V()
        L554:
            return r35
    }
}

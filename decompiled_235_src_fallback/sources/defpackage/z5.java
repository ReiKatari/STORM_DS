package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class z5 implements defpackage.eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;

    public /* synthetic */ z5(java.lang.Object r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    public /* synthetic */ z5(java.lang.Object r1, int r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r25, java.lang.Object r26) {
            r24 = this;
            r0 = r24
            r1 = r26
            int r2 = r0.A
            r7 = 7
            r8 = 8
            r11 = 2
            r12 = 0
            r13 = 0
            r14 = 1
            switch(r2) {
                case 0: goto L610;
                case 1: goto L5f7;
                case 2: goto L5ce;
                case 3: goto L513;
                case 4: goto L4fc;
                case 5: goto L4ba;
                case 6: goto L4a3;
                case 7: goto L488;
                case 8: goto L471;
                case 9: goto L45a;
                case 10: goto L444;
                case 11: goto L42d;
                case 12: goto L40e;
                case 13: goto L3f7;
                case 14: goto L3e0;
                case 15: goto L3c9;
                case 16: goto L3b2;
                case 17: goto L39b;
                case 18: goto L389;
                case 19: goto L2e1;
                case 20: goto L2ca;
                case 21: goto L2b1;
                case 22: goto L1f7;
                case 23: goto L1ca;
                case 24: goto L1b3;
                case 25: goto L19c;
                case 26: goto L10a;
                case 27: goto Lf1;
                case 28: goto L82;
                default: goto L10;
            }
        L10:
            java.lang.Object r0 = r0.B
            k36 r0 = (defpackage.k36) r0
            r2 = r25
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            j61 r1 = (defpackage.j61) r1
            k61 r3 = r1.getKey()
            l61 r0 = r0.X
            j61 r0 = r0.Z(r3)
            vs0 r4 = defpackage.vs0.h0
            if (r3 == r4) goto L34
            if (r1 == r0) goto L31
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L48
        L31:
            int r2 = r2 + 1
            goto L48
        L34:
            r3 = r0
            rc3 r3 = (defpackage.rc3) r3
            rc3 r1 = (defpackage.rc3) r1
        L39:
            if (r1 != 0) goto L3c
            goto L44
        L3c:
            if (r1 != r3) goto L3f
            goto L43
        L3f:
            boolean r0 = r1 instanceof defpackage.o66
            if (r0 != 0) goto L72
        L43:
            r12 = r1
        L44:
            if (r12 != r3) goto L4d
            if (r3 != 0) goto L31
        L48:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            return r0
        L4d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of "
            r1.<init>(r2)
            r1.append(r12)
            java.lang.String r2 = ", expected child of "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L72:
            o66 r1 = (defpackage.o66) r1
            hq0 r0 = r1.P()
            if (r0 == 0) goto L80
            rc3 r0 = r0.getParent()
            r1 = r0
            goto L39
        L80:
            r1 = r12
            goto L39
        L82:
            java.lang.Object r0 = r0.B
            me.magnum.melonds.ui.settings.fragments.RomsPreferencesFragment r0 = (me.magnum.melonds.ui.settings.fragments.RomsPreferencesFragment) r0
            r2 = r25
            android.net.Uri r2 = (android.net.Uri) r2
            on2 r1 = (defpackage.on2) r1
            r2.getClass()
            r1.getClass()
            jd6 r3 = r0.k()
            android.content.SharedPreferences r3 = r3.b
            java.lang.String r4 = "save_internal_config_as_file"
            boolean r3 = r3.getBoolean(r4, r13)
            if (r3 != 0) goto La4
            r1.c()
            goto Lee
        La4:
            jd6 r3 = r0.k()
            boolean r3 = r3.f(r2)
            if (r3 != 0) goto Lc0
            jd6 r3 = r0.k()
            r3.h(r2)
            r1.c()
            jd6 r0 = r0.k()
            r0.i()
            goto Lee
        Lc0:
            zb r3 = new zb
            android.content.Context r4 = r0.requireContext()
            r3.<init>(r4)
            r4 = 2131952626(0x7f1303f2, float:1.95417E38)
            r3.z(r4)
            r4 = 2131952625(0x7f1303f1, float:1.9541698E38)
            r3.w(r4)
            o06 r4 = new o06
            r4.<init>(r0, r2, r1, r13)
            r5 = 2131952628(0x7f1303f4, float:1.9541704E38)
            r3.y(r5, r4)
            o06 r4 = new o06
            r4.<init>(r0, r2, r1, r14)
            r0 = 2131952627(0x7f1303f3, float:1.9541702E38)
            r3.x(r0, r4)
            r3.B()
        Lee:
            jg7 r0 = defpackage.jg7.a
            return r0
        Lf1:
            java.lang.Object r0 = r0.B
            java.util.Comparator r0 = (java.util.Comparator) r0
            r2 = r25
            kz5 r2 = (defpackage.kz5) r2
            kz5 r1 = (defpackage.kz5) r1
            xh5 r3 = defpackage.tz5.L
            pq5 r2 = r2.a
            pq5 r1 = r1.a
            int r0 = r0.compare(r2, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L10a:
            java.lang.Object r0 = r0.B
            me.magnum.melonds.ui.romlist.RomListActivity r0 = (me.magnum.melonds.ui.romlist.RomListActivity) r0
            r2 = r25
            px0 r2 = (defpackage.px0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r3 = me.magnum.melonds.ui.romlist.RomListActivity.K0
            r3 = r1 & 3
            if (r3 == r11) goto L120
            r3 = r14
            goto L121
        L120:
            r3 = r13
        L121:
            r1 = r1 & r14
            r7 = r2
            xq2 r7 = (defpackage.xq2) r7
            boolean r1 = r7.S(r1, r3)
            if (r1 == 0) goto L196
            tp6 r1 = r0.I0
            qa4 r1 = defpackage.np2.C(r1, r7)
            java.lang.Object r1 = r1.getValue()
            r4 = r1
            pq5 r4 = (defpackage.pq5) r4
            if (r4 == 0) goto L189
            r1 = -2090481127(0xffffffff8365ca19, float:-6.752905E-37)
            r7.b0(r1)
            tz5 r1 = r0.C()
            de5 r1 = r1.m
            qa4 r1 = defpackage.np2.C(r1, r7)
            java.lang.Object r1 = r1.getValue()
            java.util.Map r1 = (java.util.Map) r1
            tz5 r0 = r0.C()
            de5 r0 = r0.w
            qa4 r0 = defpackage.np2.C(r0, r7)
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            android.net.Uri r2 = r4.d
            java.lang.String r2 = r2.toString()
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L176
            int r2 = r1.length()
            if (r2 <= 0) goto L176
            r5 = r1
            goto L177
        L176:
            r5 = r12
        L177:
            java.lang.String r1 = r4.i
            java.lang.Object r0 = r0.get(r1)
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            r8 = 0
            r9 = 0
            defpackage.g04.n(r4, r5, r6, r7, r8, r9)
            r7.p(r13)
            goto L199
        L189:
            r0 = -2090027814(0xffffffff836cb4da, float:-6.9561774E-37)
            r7.b0(r0)
            defpackage.g04.m(r7, r13)
            r7.p(r13)
            goto L199
        L196:
            r7.V()
        L199:
            jg7 r0 = defpackage.jg7.a
            return r0
        L19c:
            java.lang.Object r0 = r0.B
            qw5 r0 = (defpackage.qw5) r0
            r2 = r25
            px0 r2 = (defpackage.px0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            int r1 = defpackage.ii2.a0(r14)
            defpackage.nw7.r(r0, r2, r1)
            jg7 r0 = defpackage.jg7.a
            return r0
        L1b3:
            java.lang.Object r0 = r0.B
            lb5 r0 = (defpackage.lb5) r0
            r2 = r25
            px0 r2 = (defpackage.px0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            int r1 = defpackage.ii2.a0(r14)
            defpackage.nj2.d(r0, r2, r1)
            jg7 r0 = defpackage.jg7.a
            return r0
        L1ca:
            java.lang.Object r0 = r0.B
            j56 r0 = (defpackage.j56) r0
            r2 = r25
            n46 r2 = (defpackage.n46) r2
            qa4 r1 = (defpackage.qa4) r1
            boolean r3 = r1 instanceof defpackage.gm6
            if (r3 == 0) goto L1f1
            gm6 r1 = (defpackage.gm6) r1
            java.lang.Object r3 = r1.getValue()
            java.lang.Object r0 = r0.e(r2, r3)
            if (r0 == 0) goto L1f6
            im6 r1 = r1.d()
            r1.getClass()
            vs4 r12 = new vs4
            r12.<init>(r0, r1)
            goto L1f6
        L1f1:
            java.lang.String r0 = "If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()"
            defpackage.i.h(r0)
        L1f6:
            return r12
        L1f7:
            java.lang.Object r0 = r0.B
            if5 r0 = (defpackage.if5) r0
            r2 = r25
            java.util.Set r2 = (java.util.Set) r2
            vl6 r1 = (defpackage.vl6) r1
            java.lang.Object r1 = r0.c
            monitor-enter(r1)
            tp6 r15 = r0.u     // Catch: java.lang.Throwable -> L260
            java.lang.Object r15 = r15.getValue()     // Catch: java.lang.Throwable -> L260
            ff5 r15 = (defpackage.ff5) r15     // Catch: java.lang.Throwable -> L260
            r16 = 128(0x80, double:6.3E-322)
            ff5 r3 = defpackage.ff5.Idle     // Catch: java.lang.Throwable -> L260
            int r3 = r15.compareTo(r3)     // Catch: java.lang.Throwable -> L260
            if (r3 < 0) goto L2a2
            ka4 r3 = r0.h     // Catch: java.lang.Throwable -> L260
            boolean r4 = r2 instanceof defpackage.d66     // Catch: java.lang.Throwable -> L260
            if (r4 == 0) goto L27c
            d66 r2 = (defpackage.d66) r2     // Catch: java.lang.Throwable -> L260
            ka4 r2 = r2.A     // Catch: java.lang.Throwable -> L260
            java.lang.Object[] r4 = r2.b     // Catch: java.lang.Throwable -> L260
            long[] r2 = r2.a     // Catch: java.lang.Throwable -> L260
            int r12 = r2.length     // Catch: java.lang.Throwable -> L260
            int r12 = r12 - r11
            if (r12 < 0) goto L29e
            r11 = r13
            r18 = 255(0xff, double:1.26E-321)
        L22b:
            r5 = r2[r11]     // Catch: java.lang.Throwable -> L260
            r20 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = ~r5     // Catch: java.lang.Throwable -> L260
            long r9 = r9 << r7
            long r9 = r9 & r5
            long r9 = r9 & r20
            int r9 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r9 == 0) goto L273
            int r9 = r11 - r12
            int r9 = ~r9     // Catch: java.lang.Throwable -> L260
            int r9 = r9 >>> 31
            int r9 = 8 - r9
            r10 = r13
        L243:
            if (r10 >= r9) goto L26e
            long r22 = r5 & r18
            int r15 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r15 >= 0) goto L266
            int r15 = r11 << 3
            int r15 = r15 + r10
            r15 = r4[r15]     // Catch: java.lang.Throwable -> L260
            r22 = r7
            boolean r7 = r15 instanceof defpackage.fq6     // Catch: java.lang.Throwable -> L260
            if (r7 == 0) goto L262
            r7 = r15
            fq6 r7 = (defpackage.fq6) r7     // Catch: java.lang.Throwable -> L260
            boolean r7 = r7.e(r14)     // Catch: java.lang.Throwable -> L260
            if (r7 != 0) goto L262
            goto L268
        L260:
            r0 = move-exception
            goto L2af
        L262:
            r3.a(r15)     // Catch: java.lang.Throwable -> L260
            goto L268
        L266:
            r22 = r7
        L268:
            long r5 = r5 >> r8
            int r10 = r10 + 1
            r7 = r22
            goto L243
        L26e:
            r22 = r7
            if (r9 != r8) goto L29e
            goto L275
        L273:
            r22 = r7
        L275:
            if (r11 == r12) goto L29e
            int r11 = r11 + 1
            r7 = r22
            goto L22b
        L27c:
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch: java.lang.Throwable -> L260
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L260
        L282:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L260
            if (r4 == 0) goto L29e
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L260
            boolean r5 = r4 instanceof defpackage.fq6     // Catch: java.lang.Throwable -> L260
            if (r5 == 0) goto L29a
            r5 = r4
            fq6 r5 = (defpackage.fq6) r5     // Catch: java.lang.Throwable -> L260
            boolean r5 = r5.e(r14)     // Catch: java.lang.Throwable -> L260
            if (r5 != 0) goto L29a
            goto L282
        L29a:
            r3.a(r4)     // Catch: java.lang.Throwable -> L260
            goto L282
        L29e:
            qj0 r12 = r0.y()     // Catch: java.lang.Throwable -> L260
        L2a2:
            monitor-exit(r1)
            if (r12 == 0) goto L2ac
            jg7 r0 = defpackage.jg7.a
            rj0 r12 = (defpackage.rj0) r12
            r12.i(r0)
        L2ac:
            jg7 r0 = defpackage.jg7.a
            return r0
        L2af:
            monitor-exit(r1)
            throw r0
        L2b1:
            java.lang.Object r0 = r0.B
            n65 r0 = (defpackage.n65) r0
            r2 = r25
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            java.lang.Float r1 = (java.lang.Float) r1
            r1.getClass()
            rs4 r0 = r0.e
            r0.i(r2)
            jg7 r0 = defpackage.jg7.a
            return r0
        L2ca:
            java.lang.Object r0 = r0.B
            k3 r0 = (defpackage.k3) r0
            r2 = r25
            px0 r2 = (defpackage.px0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            int r1 = defpackage.ii2.a0(r14)
            defpackage.hi2.i(r0, r2, r1)
            jg7 r0 = defpackage.jg7.a
            return r0
        L2e1:
            r22 = r7
            r16 = 128(0x80, double:6.3E-322)
            r18 = 255(0xff, double:1.26E-321)
            r20 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            java.lang.Object r0 = r0.B
            f94 r0 = (defpackage.f94) r0
            r2 = r25
            java.util.Set r2 = (java.util.Set) r2
            vl6 r1 = (defpackage.vl6) r1
            java.lang.Object r1 = r0.a
            monitor-enter(r1)
            ja4 r3 = r0.b     // Catch: java.lang.Throwable -> L371
            bi2 r4 = new bi2     // Catch: java.lang.Throwable -> L371
            r5 = 24
            r4.<init>(r5, r2, r0)     // Catch: java.lang.Throwable -> L371
            defpackage.ge7.p(r14, r4)     // Catch: java.lang.Throwable -> L371
            java.lang.Object[] r2 = r3.b     // Catch: java.lang.Throwable -> L371
            long[] r3 = r3.a     // Catch: java.lang.Throwable -> L371
            int r5 = r3.length     // Catch: java.lang.Throwable -> L371
            int r5 = r5 - r11
            if (r5 < 0) goto L33d
            r6 = r13
        L30e:
            r9 = r3[r6]     // Catch: java.lang.Throwable -> L371
            long r14 = ~r9     // Catch: java.lang.Throwable -> L371
            long r14 = r14 << r22
            long r14 = r14 & r9
            long r14 = r14 & r20
            int r7 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            if (r7 == 0) goto L338
            int r7 = r6 - r5
            int r7 = ~r7     // Catch: java.lang.Throwable -> L371
            int r7 = r7 >>> 31
            int r7 = 8 - r7
            r12 = r13
        L322:
            if (r12 >= r7) goto L336
            long r14 = r9 & r18
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L332
            int r14 = r6 << 3
            int r14 = r14 + r12
            r14 = r2[r14]     // Catch: java.lang.Throwable -> L371
            r4.g(r14)     // Catch: java.lang.Throwable -> L371
        L332:
            long r9 = r9 >> r8
            int r12 = r12 + 1
            goto L322
        L336:
            if (r7 != r8) goto L33d
        L338:
            if (r6 == r5) goto L33d
            int r6 = r6 + 1
            goto L30e
        L33d:
            ka4 r2 = r0.d     // Catch: java.lang.Throwable -> L371
            java.lang.Object[] r3 = r2.b     // Catch: java.lang.Throwable -> L371
            long[] r2 = r2.a     // Catch: java.lang.Throwable -> L371
            int r4 = r2.length     // Catch: java.lang.Throwable -> L371
            int r4 = r4 - r11
            if (r4 < 0) goto L37e
            r5 = r13
        L348:
            r6 = r2[r5]     // Catch: java.lang.Throwable -> L371
            long r9 = ~r6     // Catch: java.lang.Throwable -> L371
            long r9 = r9 << r22
            long r9 = r9 & r6
            long r9 = r9 & r20
            int r9 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r9 == 0) goto L379
            int r9 = r5 - r4
            int r9 = ~r9     // Catch: java.lang.Throwable -> L371
            int r9 = r9 >>> 31
            int r9 = 8 - r9
            r10 = r13
        L35c:
            if (r10 >= r9) goto L377
            long r11 = r6 & r18
            int r11 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r11 >= 0) goto L373
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r3[r11]     // Catch: java.lang.Throwable -> L371
            ob6 r11 = (defpackage.ob6) r11     // Catch: java.lang.Throwable -> L371
            jg7 r12 = defpackage.jg7.a     // Catch: java.lang.Throwable -> L371
            r11.c(r12)     // Catch: java.lang.Throwable -> L371
            goto L373
        L371:
            r0 = move-exception
            goto L387
        L373:
            long r6 = r6 >> r8
            int r10 = r10 + 1
            goto L35c
        L377:
            if (r9 != r8) goto L37e
        L379:
            if (r5 == r4) goto L37e
            int r5 = r5 + 1
            goto L348
        L37e:
            ka4 r0 = r0.d     // Catch: java.lang.Throwable -> L371
            r0.b()     // Catch: java.lang.Throwable -> L371
            monitor-exit(r1)
            jg7 r0 = defpackage.jg7.a
            return r0
        L387:
            monitor-exit(r1)
            throw r0
        L389:
            java.lang.Object r0 = r0.B
            g17 r0 = (defpackage.g17) r0
            r2 = r25
            vy4 r2 = (defpackage.vy4) r2
            jk4 r1 = (defpackage.jk4) r1
            long r1 = r1.a
            r0.e(r1)
            jg7 r0 = defpackage.jg7.a
            return r0
        L39b:
            java.lang.Object r0 = r0.B
            r3 r0 = (defpackage.r3) r0
            r2 = r25
            px0 r2 = (defpackage.px0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            int r1 = defpackage.ii2.a0(r14)
            defpackage.kj2.a(r0, r2, r1)
            jg7 r0 = defpackage.jg7.a
            return r0
        L3b2:
            java.lang.Object r0 = r0.B
            q3 r0 = (defpackage.q3) r0
            r2 = r25
            px0 r2 = (defpackage.px0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            int r1 = defpackage.ii2.a0(r14)
            defpackage.oi2.b(r0, r2, r1)
            jg7 r0 = defpackage.jg7.a
            return r0
        L3c9:
            java.lang.Object r0 = r0.B
            o3 r0 = (defpackage.o3) r0
            r2 = r25
            px0 r2 = (defpackage.px0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            int r1 = defpackage.ii2.a0(r14)
            defpackage.ii2.j(r0, r2, r1)
            jg7 r0 = defpackage.jg7.a
            return r0
        L3e0:
            java.lang.Object r0 = r0.B
            p3 r0 = (defpackage.p3) r0
            r2 = r25
            px0 r2 = (defpackage.px0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            int r1 = defpackage.ii2.a0(r14)
            defpackage.hi2.d(r0, r2, r1)
            jg7 r0 = defpackage.jg7.a
            return r0
        L3f7:
            java.lang.Object r0 = r0.B
            g53 r0 = (defpackage.g53) r0
            r2 = r25
            px0 r2 = (defpackage.px0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            int r1 = defpackage.ii2.a0(r14)
            r0.a(r2, r1)
            jg7 r0 = defpackage.jg7.a
            return r0
        L40e:
            r0 = r25
            px0 r0 = (defpackage.px0) r0
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = r1 & 3
            if (r2 == r11) goto L41d
            r13 = r14
        L41d:
            r1 = r1 & r14
            xq2 r0 = (defpackage.xq2) r0
            boolean r1 = r0.S(r1, r13)
            if (r1 != 0) goto L42c
            r0.V()
            jg7 r0 = defpackage.jg7.a
            return r0
        L42c:
            throw r12
        L42d:
            java.lang.Object r0 = r0.B
            mn2 r0 = (defpackage.mn2) r0
            r2 = r25
            px0 r2 = (defpackage.px0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            int r1 = defpackage.ii2.a0(r14)
            r0.a(r2, r1)
            jg7 r0 = defpackage.jg7.a
            return r0
        L444:
            java.lang.Object r0 = r0.B
            ah5 r0 = (defpackage.ah5) r0
            r2 = r25
            vy4 r2 = (defpackage.vy4) r2
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            r2.a()
            r0.A = r1
            jg7 r0 = defpackage.jg7.a
            return r0
        L45a:
            java.lang.Object r0 = r0.B
            ij1 r0 = (defpackage.ij1) r0
            r2 = r25
            px0 r2 = (defpackage.px0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            int r1 = defpackage.ii2.a0(r14)
            defpackage.n16.e(r0, r2, r1)
            jg7 r0 = defpackage.jg7.a
            return r0
        L471:
            java.lang.Object r0 = r0.B
            oi1 r0 = (defpackage.oi1) r0
            r2 = r25
            px0 r2 = (defpackage.px0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            int r1 = defpackage.ii2.a0(r14)
            r0.a(r2, r1)
            jg7 r0 = defpackage.jg7.a
            return r0
        L488:
            java.lang.Object r0 = r0.B
            s07 r0 = (defpackage.s07) r0
            r2 = r25
            px0 r2 = (defpackage.px0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            xq2 r2 = (defpackage.xq2) r2
            r1 = 666084174(0x27b3a34e, float:4.9859536E-15)
            r2.b0(r1)
            java.lang.String r0 = r0.b
            r2.p(r13)
            return r0
        L4a3:
            java.lang.Object r0 = r0.B
            p27 r0 = (defpackage.p27) r0
            r2 = r25
            px0 r2 = (defpackage.px0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            int r1 = defpackage.ii2.a0(r14)
            defpackage.hf.t(r0, r2, r1)
            jg7 r0 = defpackage.jg7.a
            return r0
        L4ba:
            java.lang.Object r0 = r0.B
            jb1 r0 = (defpackage.jb1) r0
            r2 = r25
            java.lang.Integer r2 = (java.lang.Integer) r2
            r2.getClass()
            boolean r2 = r1 instanceof defpackage.ww0
            if (r2 == 0) goto L4e5
            r2 = r1
            ww0 r2 = (defpackage.ww0) r2
            java.lang.Object r3 = r0.h
            ka4 r3 = (defpackage.ka4) r3
            if (r3 != 0) goto L4db
            ka4 r3 = defpackage.c66.a
            ka4 r3 = new ka4
            r3.<init>()
            r0.h = r3
        L4db:
            r3.k(r2)
            java.lang.Object r3 = r0.f
            ua4 r3 = (defpackage.ua4) r3
            r3.b(r2)
        L4e5:
            boolean r2 = r1 instanceof defpackage.br2
            if (r2 == 0) goto L4ef
            r2 = r1
            br2 r2 = (defpackage.br2) r2
            r0.e(r2)
        L4ef:
            boolean r0 = r1 instanceof defpackage.cf5
            if (r0 == 0) goto L4f9
            r0 = r1
            cf5 r0 = (defpackage.cf5) r0
            r0.c()
        L4f9:
            jg7 r0 = defpackage.jg7.a
            return r0
        L4fc:
            java.lang.Object r0 = r0.B
            m3 r0 = (defpackage.m3) r0
            r2 = r25
            px0 r2 = (defpackage.px0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            int r1 = defpackage.ii2.a0(r14)
            defpackage.jw2.c(r0, r2, r1)
            jg7 r0 = defpackage.jg7.a
            return r0
        L513:
            java.lang.Object r0 = r0.B
            j04 r0 = (defpackage.j04) r0
            r2 = r25
            px0 r2 = (defpackage.px0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r3 = r1 & 3
            if (r3 == r11) goto L527
            r3 = r14
            goto L528
        L527:
            r3 = r13
        L528:
            r1 = r1 & r14
            r9 = r2
            xq2 r9 = (defpackage.xq2) r9
            boolean r1 = r9.S(r1, r3)
            if (r1 == 0) goto L5c8
            x64 r1 = defpackage.x64.a
            r2 = 1108869120(0x42180000, float:38.0)
            a74 r2 = defpackage.dj6.i(r1, r2)
            y16 r3 = defpackage.z16.a
            a74 r2 = defpackage.u24.g(r2, r3)
            boolean r3 = r9.h(r0)
            java.lang.Object r4 = r9.P()
            if (r3 != 0) goto L54e
            vs0 r3 = defpackage.ox0.a
            if (r4 != r3) goto L556
        L54e:
            x00 r4 = new x00
            r4.<init>(r0, r13)
            r9.l0(r4)
        L556:
            on2 r4 = (defpackage.on2) r4
            r0 = 15
            a74 r0 = defpackage.mb3.u(r2, r13, r12, r4, r0)
            e40 r2 = defpackage.d90.Z
            e34 r2 = defpackage.h70.d(r2, r13)
            long r3 = r9.T
            int r3 = java.lang.Long.hashCode(r3)
            xv4 r4 = r9.l()
            a74 r0 = defpackage.l.E(r9, r0)
            ix0 r5 = defpackage.jx0.i
            r5.getClass()
            iy0 r5 = defpackage.ix0.b
            r9.f0()
            boolean r6 = r9.S
            if (r6 == 0) goto L584
            r9.k(r5)
            goto L587
        L584:
            r9.o0()
        L587:
            pn r5 = defpackage.ix0.f
            defpackage.yh2.K(r9, r5, r2)
            pn r2 = defpackage.ix0.e
            defpackage.yh2.K(r9, r2, r4)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            pn r3 = defpackage.ix0.g
            defpackage.yh2.K(r9, r3, r2)
            ne r2 = defpackage.ix0.h
            defpackage.yh2.F(r9, r2)
            pn r2 = defpackage.ix0.d
            defpackage.yh2.K(r9, r2, r0)
            r0 = 2131230926(0x7f0800ce, float:1.8077919E38)
            sr4 r4 = defpackage.kj2.R(r9, r0)
            r0 = 2131951672(0x7f130038, float:1.9539765E38)
            java.lang.String r5 = defpackage.yh2.O(r9, r0)
            es7 r0 = defpackage.bl2.F(r9)
            long r7 = r0.g
            r0 = 1103101952(0x41c00000, float:24.0)
            a74 r6 = defpackage.dj6.i(r1, r0)
            r10 = 392(0x188, float:5.5E-43)
            r11 = 0
            defpackage.i13.b(r4, r5, r6, r7, r9, r10, r11)
            r9.p(r14)
            goto L5cb
        L5c8:
            r9.V()
        L5cb:
            jg7 r0 = defpackage.jg7.a
            return r0
        L5ce:
            java.lang.Object r0 = r0.B
            fa6 r0 = (defpackage.fa6) r0
            r2 = r25
            android.graphics.RectF r2 = (android.graphics.RectF) r2
            android.graphics.RectF r1 = (android.graphics.RectF) r1
            of5 r2 = defpackage.ej2.b0(r2)
            of5 r1 = defpackage.ej2.b0(r1)
            int r0 = r0.A
            switch(r0) {
                case 5: goto L5ee;
                default: goto L5e5;
            }
        L5e5:
            long r2 = r2.b()
            boolean r0 = r1.a(r2)
            goto L5f2
        L5ee:
            boolean r0 = r2.g(r1)
        L5f2:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L5f7:
            java.lang.Object r0 = r0.B
            sz1 r0 = (defpackage.sz1) r0
            r2 = r25
            px0 r2 = (defpackage.px0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            r1 = 9
            int r1 = defpackage.ii2.a0(r1)
            defpackage.n16.b(r0, r2, r1)
            jg7 r0 = defpackage.jg7.a
            return r0
        L610:
            java.lang.Object r0 = r0.B
            l3 r0 = (defpackage.l3) r0
            r2 = r25
            px0 r2 = (defpackage.px0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            int r1 = defpackage.ii2.a0(r14)
            defpackage.lb4.a(r0, r2, r1)
            jg7 r0 = defpackage.jg7.a
            return r0
    }
}

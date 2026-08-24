package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class u6 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;
    public final /* synthetic */ java.lang.Object L;
    public final /* synthetic */ java.lang.Object R;

    public /* synthetic */ u6(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.A = r4
            r0.B = r1
            r0.R = r2
            r0.L = r3
            r0.<init>()
            return
    }

    public /* synthetic */ u6(defpackage.xq2 r1, defpackage.rl0 r2, defpackage.lk6 r3, defpackage.o84 r4) {
            r0 = this;
            r4 = 9
            r0.A = r4
            r0.<init>()
            r0.B = r1
            r0.R = r2
            r0.L = r3
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r13 = this;
            int r0 = r13.A
            r1 = 0
            r2 = 1
            r3 = 0
            switch(r0) {
                case 0: goto L52c;
                case 1: goto L513;
                case 2: goto L4e7;
                case 3: goto L4af;
                case 4: goto L491;
                case 5: goto L41c;
                case 6: goto L3e5;
                case 7: goto L31a;
                case 8: goto L2f8;
                case 9: goto L2c2;
                case 10: goto L2a1;
                case 11: goto L28a;
                case 12: goto L267;
                case 13: goto L23f;
                case 14: goto L218;
                case 15: goto L1ba;
                case 16: goto L1a5;
                case 17: goto L187;
                case 18: goto L161;
                case 19: goto L137;
                case 20: goto L119;
                case 21: goto La9;
                default: goto L8;
            }
        L8:
            java.lang.Object r0 = r13.B
            tw7 r0 = (defpackage.tw7) r0
            java.lang.Object r4 = r13.R
            java.util.UUID r4 = (java.util.UUID) r4
            java.lang.Object r13 = r13.L
            xb1 r13 = (defpackage.xb1) r13
            r0.getClass()
            java.lang.String r5 = "Ignoring setProgressAsync(...). WorkSpec ("
            java.lang.String r6 = r4.toString()
            ga0 r7 = defpackage.ga0.f()
            java.lang.String r8 = defpackage.tw7.c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Updating progress for "
            r9.<init>(r10)
            r9.append(r4)
            java.lang.String r4 = " ("
            r9.append(r4)
            r9.append(r13)
            java.lang.String r4 = ")"
            r9.append(r4)
            java.lang.String r4 = r9.toString()
            r7.b(r8, r4)
            androidx.work.impl.WorkDatabase r4 = r0.a
            r4.b()
            dx7 r0 = r4.w()     // Catch: java.lang.Throwable -> L6f
            yw7 r0 = r0.d(r6)     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L91
            iw7 r0 = r0.b     // Catch: java.lang.Throwable -> L6f
            iw7 r7 = defpackage.iw7.RUNNING     // Catch: java.lang.Throwable -> L6f
            if (r0 != r7) goto L72
            rw7 r0 = new rw7     // Catch: java.lang.Throwable -> L6f
            r0.<init>(r6, r13)     // Catch: java.lang.Throwable -> L6f
            sw7 r13 = r4.v()     // Catch: java.lang.Throwable -> L6f
            r13.getClass()     // Catch: java.lang.Throwable -> L6f
            m16 r5 = r13.a     // Catch: java.lang.Throwable -> L6f
            ja7 r6 = new ja7     // Catch: java.lang.Throwable -> L6f
            r7 = 10
            r6.<init>(r7, r13, r0)     // Catch: java.lang.Throwable -> L6f
            defpackage.hv.Q(r5, r1, r2, r6)     // Catch: java.lang.Throwable -> L6f
            goto L8a
        L6f:
            r0 = move-exception
            r13 = r0
            goto L99
        L72:
            ga0 r13 = defpackage.ga0.f()     // Catch: java.lang.Throwable -> L6f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L6f
            r0.append(r6)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r1 = ") is not in a RUNNING state."
            r0.append(r1)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L6f
            r13.j(r8, r0)     // Catch: java.lang.Throwable -> L6f
        L8a:
            r4.p()     // Catch: java.lang.Throwable -> L6f
            r4.f()
            return r3
        L91:
            java.lang.String r13 = "Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6f
            r0.<init>(r13)     // Catch: java.lang.Throwable -> L6f
            throw r0     // Catch: java.lang.Throwable -> L6f
        L99:
            ga0 r0 = defpackage.ga0.f()     // Catch: java.lang.Throwable -> La3
            java.lang.String r1 = "Error updating Worker progress"
            r0.e(r8, r1, r13)     // Catch: java.lang.Throwable -> La3
            throw r13     // Catch: java.lang.Throwable -> La3
        La3:
            r0 = move-exception
            r13 = r0
            r4.f()
            throw r13
        La9:
            java.lang.Object r0 = r13.B
            tc6 r0 = (defpackage.tc6) r0
            java.lang.Object r4 = r13.R
            r5 = r4
            pf0 r5 = (defpackage.pf0) r5
            java.lang.Object r13 = r13.L
            r9 = r13
            qt2 r9 = (defpackage.qt2) r9
            ex6 r13 = r0.e
            java.lang.Object r13 = r13.getValue()
            pc6 r13 = (defpackage.pc6) r13
            boolean r13 = r13.c()
            if (r13 == 0) goto Lcf
            ex6 r13 = r0.f
            java.lang.Object r13 = r13.getValue()
            rc6 r13 = (defpackage.rc6) r13
            r7 = r13
            goto Ld0
        Lcf:
            r7 = r3
        Ld0:
            if (r7 != 0) goto Ld4
        Ld2:
            r6 = r1
            goto Le2
        Ld4:
            int r13 = r7.h
            if (r13 != r2) goto Lda
            r6 = r2
            goto Le2
        Lda:
            if (r13 != 0) goto Ldd
            goto Ld2
        Ldd:
            if (r13 == 0) goto Lfb
            if (r13 == r2) goto Lfb
            r6 = r13
        Le2:
            ex6 r13 = r0.c
            java.lang.Object r13 = r13.getValue()
            r11 = r13
            java.util.Map r11 = (java.util.Map) r11
            ex6 r13 = r0.d
            java.lang.Object r13 = r13.getValue()
            r12 = r13
            java.util.Map r12 = (java.util.Map) r12
            r8 = 0
            r10 = 0
            of0 r3 = r5.a(r6, r7, r8, r9, r10, r11, r12)
            goto L118
        Lfb:
            java.lang.String r0 = "CXCP"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Custom operating mode "
            r1.<init>(r2)
            r1.append(r13)
            java.lang.String r13 = " conflicts with standard modes"
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            android.util.Log.e(r0, r13)
            java.lang.String r13 = "kotlin.Unit"
            defpackage.i.h(r13)
        L118:
            return r3
        L119:
            java.lang.Object r0 = r13.B
            li6 r0 = (defpackage.li6) r0
            java.lang.Object r1 = r13.R
            java.lang.Object r13 = r13.L
            mi6 r13 = (defpackage.mi6) r13
            qn2 r0 = r0.e
            r0.g(r1)
            vs4 r0 = r13.a
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.setValue(r1)
            vs4 r13 = r13.b
            r13.setValue(r3)
            jg7 r13 = defpackage.jg7.a
            return r13
        L137:
            java.lang.Object r0 = r13.B
            j04 r0 = (defpackage.j04) r0
            java.lang.Object r1 = r13.R
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r13 = r13.L
            pq5 r13 = (defpackage.pq5) r13
            int r2 = me.magnum.melonds.ui.inputsetup.InputSetupActivity.D0
            r13.getClass()
            android.content.Intent r2 = new android.content.Intent
            java.lang.Class<me.magnum.melonds.ui.inputsetup.InputSetupActivity> r3 = me.magnum.melonds.ui.inputsetup.InputSetupActivity.class
            r2.<init>(r1, r3)
            java.lang.String r1 = "rom"
            wz5 r3 = new wz5
            r3.<init>()
            r3.A = r13
            r2.putExtra(r1, r3)
            r0.a(r2)
            jg7 r13 = defpackage.jg7.a
            return r13
        L161:
            java.lang.Object r0 = r13.B
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r1 = r13.R
            j04 r1 = (defpackage.j04) r1
            java.lang.Object r13 = r13.L
            zt5 r13 = (defpackage.zt5) r13
            android.content.Intent r2 = new android.content.Intent
            java.lang.Class<me.magnum.melonds.ui.layouts.LayoutSelectorActivity> r4 = me.magnum.melonds.ui.layouts.LayoutSelectorActivity.class
            r2.<init>(r0, r4)
            java.lang.String r0 = "selected_layout_id"
            java.util.UUID r13 = r13.e
            if (r13 == 0) goto L17e
            java.lang.String r3 = r13.toString()
        L17e:
            r2.putExtra(r0, r3)
            r1.a(r2)
            jg7 r13 = defpackage.jg7.a
            return r13
        L187:
            java.lang.Object r0 = r13.B
            eo2 r0 = (defpackage.eo2) r0
            java.lang.Object r1 = r13.R
            qa4 r1 = (defpackage.qa4) r1
            java.lang.Object r13 = r13.L
            qa4 r13 = (defpackage.qa4) r13
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r13 = r13.getValue()
            java.lang.String r13 = (java.lang.String) r13
            r0.o(r1, r13)
            jg7 r13 = defpackage.jg7.a
            return r13
        L1a5:
            java.lang.Object r0 = r13.B
            qn2 r0 = (defpackage.qn2) r0
            java.lang.Object r1 = r13.R
            nu4 r1 = (defpackage.nu4) r1
            java.lang.Object r13 = r13.L
            qa4 r13 = (defpackage.qa4) r13
            r13.setValue(r3)
            r0.g(r1)
            jg7 r13 = defpackage.jg7.a
            return r13
        L1ba:
            java.lang.Object r0 = r13.B
            sq2 r0 = (defpackage.sq2) r0
            java.lang.Object r1 = r13.R
            pk6 r1 = (defpackage.pk6) r1
            java.lang.Object r13 = r13.L
            bo4 r13 = (defpackage.bo4) r13
            if (r0 == 0) goto L1d2
            int r0 = r1.c(r0)
            int r4 = r1.t
            int r0 = r0 - r4
            r1.a(r0)
        L1d2:
            int r0 = r1.t
            java.util.List r0 = defpackage.ak7.J(r1, r3, r0, r3)
            java.lang.Object r1 = defpackage.gt0.R0(r0)
            hx0 r1 = (defpackage.hx0) r1
            if (r1 == 0) goto L1e3
            java.lang.Integer r1 = r1.b
            goto L1e4
        L1e3:
            r1 = r3
        L1e4:
            java.util.List r4 = r13.l(r1)
            if (r1 == 0) goto L20a
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L1f1
            goto L20a
        L1f1:
            java.lang.Object r5 = defpackage.gt0.H0(r4)
            hx0 r5 = (defpackage.hx0) r5
            java.util.List r2 = defpackage.gt0.D0(r4, r2)
            int r4 = r5.a
            hx0 r5 = new hx0
            r5.<init>(r4, r3, r1)
            java.util.List r1 = defpackage.hf.b0(r5)
            java.util.ArrayList r4 = defpackage.gt0.V0(r1, r2)
        L20a:
            fx0 r1 = new fx0
            java.util.ArrayList r0 = defpackage.gt0.V0(r0, r4)
            boolean r13 = r13.m()
            r1.<init>(r0, r13)
            return r1
        L218:
            java.lang.Object r0 = r13.B
            ii1 r0 = (defpackage.ii1) r0
            java.lang.Object r1 = r13.R
            pr3 r1 = (defpackage.pr3) r1
            java.lang.Object r13 = r13.L
            lp3 r13 = (defpackage.lp3) r13
            java.lang.Object r0 = r0.getValue()
            er3 r0 = (defpackage.er3) r0
            ei r2 = new ei
            zo3 r3 = r1.e
            hq3 r3 = r3.f
            java.lang.Object r3 = r3.getValue()
            l93 r3 = (defpackage.l93) r3
            r2.<init>(r3, r0)
            fr3 r3 = new fr3
            r3.<init>(r1, r0, r13, r2)
            return r3
        L23f:
            java.lang.Object r0 = r13.B
            qa4 r0 = (defpackage.qa4) r0
            java.lang.Object r1 = r13.R
            qa4 r1 = (defpackage.qa4) r1
            java.lang.Object r13 = r13.L
            on2 r13 = (defpackage.on2) r13
            zq4 r2 = new zq4
            java.lang.Object r0 = r0.getValue()
            go2 r0 = (defpackage.go2) r0
            java.lang.Object r1 = r1.getValue()
            qn2 r1 = (defpackage.qn2) r1
            java.lang.Object r13 = r13.c()
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            r2.<init>(r0, r1, r13)
            return r2
        L267:
            java.lang.Object r0 = r13.B
            j37 r0 = (defpackage.j37) r0
            java.lang.Object r1 = r13.R
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r13 = r13.L
            qa4 r13 = (defpackage.qa4) r13
            java.lang.Object r2 = r13.getValue()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L27c
            goto L27d
        L27c:
            r1 = r2
        L27d:
            j4 r2 = new j4
            r3 = 14
            r2.<init>(r13, r3)
            defpackage.j37.c(r0, r1, r2)
            jg7 r13 = defpackage.jg7.a
            return r13
        L28a:
            java.lang.Object r0 = r13.B
            ck3 r0 = (defpackage.ck3) r0
            java.lang.Object r1 = r13.R
            qa4 r1 = (defpackage.qa4) r1
            java.lang.Object r13 = r13.L
            qa4 r13 = (defpackage.qa4) r13
            r1.setValue(r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r13.setValue(r0)
            jg7 r13 = defpackage.jg7.a
            return r13
        L2a1:
            java.lang.Object r0 = r13.B
            zg5 r0 = (defpackage.zg5) r0
            java.lang.Object r1 = r13.R
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            java.lang.Object r13 = r13.L
            c53 r13 = (defpackage.c53) r13
            boolean r0 = r0.A
            if (r0 == 0) goto L2bf
            ga0 r0 = defpackage.ga0.f()
            java.lang.String r2 = defpackage.zv7.a
            java.lang.String r3 = "NetworkRequestConstraintController unregister callback"
            r0.b(r2, r3)
            r1.unregisterNetworkCallback(r13)
        L2bf:
            jg7 r13 = defpackage.jg7.a
            return r13
        L2c2:
            java.lang.Object r0 = r13.B
            r2 = r0
            xq2 r2 = (defpackage.xq2) r2
            java.lang.Object r0 = r13.R
            rl0 r0 = (defpackage.rl0) r0
            java.lang.Object r13 = r13.L
            lk6 r13 = (defpackage.lk6) r13
            qx0 r4 = r2.M
            rl0 r5 = r4.b
            r4.b = r0     // Catch: java.lang.Throwable -> L2f3
            lk6 r6 = r2.G     // Catch: java.lang.Throwable -> L2f3
            int[] r7 = r2.o     // Catch: java.lang.Throwable -> L2f3
            p94 r8 = r2.v     // Catch: java.lang.Throwable -> L2f3
            r2.o = r3     // Catch: java.lang.Throwable -> L2f3
            r2.v = r3     // Catch: java.lang.Throwable -> L2f3
            r2.G = r13     // Catch: java.lang.Throwable -> L2ea
            boolean r13 = r4.e     // Catch: java.lang.Throwable -> L2ea
            r4.e = r1     // Catch: java.lang.Throwable -> L2e6
            throw r3     // Catch: java.lang.Throwable -> L2e6
        L2e6:
            r0 = move-exception
            r4.e = r13     // Catch: java.lang.Throwable -> L2ea
            throw r0     // Catch: java.lang.Throwable -> L2ea
        L2ea:
            r0 = move-exception
            r13 = r0
            r2.G = r6     // Catch: java.lang.Throwable -> L2f3
            r2.o = r7     // Catch: java.lang.Throwable -> L2f3
            r2.v = r8     // Catch: java.lang.Throwable -> L2f3
            throw r13     // Catch: java.lang.Throwable -> L2f3
        L2f3:
            r0 = move-exception
            r13 = r0
            r4.b = r5
            throw r13
        L2f8:
            java.lang.Object r0 = r13.B
            j37 r0 = (defpackage.j37) r0
            java.lang.Object r1 = r13.R
            android.content.res.Resources r1 = (android.content.res.Resources) r1
            java.lang.Object r13 = r13.L
            qn2 r13 = (defpackage.qn2) r13
            r2 = 2131951778(0x7f1300a2, float:1.953998E38)
            java.lang.String r1 = r1.getString(r2)
            r1.getClass()
            y00 r2 = new y00
            r3 = 2
            r2.<init>(r3, r13)
            defpackage.j37.c(r0, r1, r2)
            jg7 r13 = defpackage.jg7.a
            return r13
        L31a:
            java.lang.Object r0 = r13.B
            r4 = r0
            sz1 r4 = (defpackage.sz1) r4
            java.lang.Object r0 = r13.R
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r13 = r13.L
            zg5 r13 = (defpackage.zg5) r13
            java.lang.Object r5 = r4.P
            monitor-enter(r5)
            java.lang.String r6 = r4.Q     // Catch: java.lang.Throwable -> L378
            boolean r6 = defpackage.nb3.k(r6, r0)     // Catch: java.lang.Throwable -> L378
            if (r6 != 0) goto L336
            r2 = r1
        L333:
            r0 = r3
            goto L39c
        L336:
            jh r6 = r4.v     // Catch: java.lang.Throwable -> L392
            r6.p = r1     // Catch: java.lang.Throwable -> L392
            bg1 r6 = r6.q     // Catch: java.lang.Throwable -> L392
            r6.k()     // Catch: java.lang.Throwable -> L392
            me.magnum.melonds.MelonEmulator r6 = me.magnum.melonds.MelonEmulator.a     // Catch: java.lang.Throwable -> L392
            r6.unloadRetroAchievementsData()     // Catch: java.lang.Throwable -> L392
            pn5 r6 = r4.g     // Catch: java.lang.Throwable -> L378
            pl r6 = (defpackage.pl) r6     // Catch: java.lang.Throwable -> L378
            bk1 r6 = r6.h     // Catch: java.lang.Throwable -> L378
            r6.getClass()     // Catch: java.lang.Throwable -> L378
            java.lang.Object r7 = r6.L     // Catch: java.lang.Throwable -> L378
            monitor-enter(r7)     // Catch: java.lang.Throwable -> L378
            boolean r8 = r6.A     // Catch: java.lang.Throwable -> L35d
            if (r8 != 0) goto L370
            java.lang.Object r8 = r6.B     // Catch: java.lang.Throwable -> L35d
            mb5 r8 = (defpackage.mb5) r8     // Catch: java.lang.Throwable -> L35d
            if (r8 == 0) goto L360
            java.lang.String r8 = r8.a     // Catch: java.lang.Throwable -> L35d
            goto L361
        L35d:
            r0 = move-exception
            r13 = r0
            goto L390
        L360:
            r8 = r3
        L361:
            boolean r8 = defpackage.nb3.k(r8, r0)     // Catch: java.lang.Throwable -> L35d
            if (r8 != 0) goto L368
            goto L370
        L368:
            r6.B = r3     // Catch: java.lang.Throwable -> L35d
            r6.A = r2     // Catch: java.lang.Throwable -> L35d
            r6.R = r0     // Catch: java.lang.Throwable -> L35d
            r6 = r2
            goto L371
        L370:
            r6 = r1
        L371:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L378
            if (r6 != 0) goto L37b
            java.lang.String r0 = "LeaseHandoffRejected"
        L376:
            r2 = r1
            goto L39c
        L378:
            r0 = move-exception
            r13 = r0
            goto L3e3
        L37b:
            r4.Q = r3     // Catch: java.lang.Throwable -> L378
            java.lang.String r6 = r4.R     // Catch: java.lang.Throwable -> L378
            boolean r0 = defpackage.nb3.k(r6, r0)     // Catch: java.lang.Throwable -> L378
            if (r0 == 0) goto L387
            r4.R = r3     // Catch: java.lang.Throwable -> L378
        L387:
            r4.N = r3     // Catch: java.lang.Throwable -> L378
            sz1$c r0 = defpackage.sz1.c.DISABLED     // Catch: java.lang.Throwable -> L378
            r4.O = r0     // Catch: java.lang.Throwable -> L378
            r4.K = r1     // Catch: java.lang.Throwable -> L378
            goto L333
        L390:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L378
            throw r13     // Catch: java.lang.Throwable -> L378
        L392:
            r0 = move-exception
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L378
            java.lang.String r0 = r0.getSimpleName()     // Catch: java.lang.Throwable -> L378
            goto L376
        L39c:
            monitor-exit(r5)
            if (r2 == 0) goto L3a2
            java.lang.String r5 = "ra_runtime_identity_lease_handed_off"
            goto L3a4
        L3a2:
            java.lang.String r5 = "ra_runtime_identity_lease_handoff_failed"
        L3a4:
            java.lang.String r6 = "reason"
            java.lang.String r7 = "logout"
            vr4 r8 = new vr4
            r8.<init>(r6, r7)
            java.lang.String r6 = "error"
            vr4 r7 = new vr4
            r7.<init>(r6, r0)
            java.lang.String r0 = "lease_retained"
            r6 = r2 ^ 1
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            vr4 r9 = new vr4
            r9.<init>(r0, r6)
            vr4[] r0 = new defpackage.vr4[]{r8, r7, r9}
            r4.G0(r5, r0)
            if (r2 == 0) goto L3dd
            java.lang.String r0 = "logout"
            r4.k0(r0)     // Catch: java.lang.Throwable -> L3d7
            r4.a1()
            r13.A = r1
            jg7 r3 = defpackage.jg7.a
            goto L3e2
        L3d7:
            r0 = move-exception
            r13 = r0
            r4.a1()
            throw r13
        L3dd:
            java.lang.String r13 = "Check failed."
            defpackage.i.m(r13)
        L3e2:
            return r3
        L3e3:
            monitor-exit(r5)
            throw r13
        L3e5:
            java.lang.Object r0 = r13.B
            zg5 r0 = (defpackage.zg5) r0
            java.lang.Object r4 = r13.R
            zg5 r4 = (defpackage.zg5) r4
            java.lang.Object r13 = r13.L
            sz1 r13 = (defpackage.sz1) r13
            r0.A = r2
            r4.A = r1
            java.util.concurrent.atomic.AtomicBoolean r0 = r13.l0
            r0.set(r1)
            s35 r0 = r13.V
            java.lang.Object r0 = r0.A
            java.util.concurrent.atomic.AtomicBoolean r0 = (java.util.concurrent.atomic.AtomicBoolean) r0
            r0.set(r2)
            eb r13 = r13.h0
            java.lang.Object r1 = r13.B
            monitor-enter(r1)
            java.lang.Object r13 = r13.R     // Catch: java.lang.Throwable -> L418
            tp6 r13 = (defpackage.tp6) r13     // Catch: java.lang.Throwable -> L418
            uc5 r0 = defpackage.uc5.a     // Catch: java.lang.Throwable -> L418
            r13.getClass()     // Catch: java.lang.Throwable -> L418
            r13.m(r3, r0)     // Catch: java.lang.Throwable -> L418
            monitor-exit(r1)
            jg7 r13 = defpackage.jg7.a
            return r13
        L418:
            r0 = move-exception
            r13 = r0
            monitor-exit(r1)
            throw r13
        L41c:
            java.lang.Object r0 = r13.B
            r4 = r0
            p31 r4 = (defpackage.p31) r4
            java.lang.Object r0 = r13.R
            nh7 r0 = (defpackage.nh7) r0
            java.lang.Object r13 = r13.L
            z70 r13 = (defpackage.z70) r13
            jg7 r11 = defpackage.jg7.a
            p70 r12 = r4.p0
        L42d:
            ua4 r5 = r12.a
            int r6 = r5.L
            if (r6 == 0) goto L46b
            if (r6 == 0) goto L465
            int r6 = r6 + (-1)
            java.lang.Object[] r5 = r5.A
            r5 = r5[r6]
            l31 r5 = (defpackage.l31) r5
            u70 r5 = r5.a
            java.lang.Object r5 = r5.c()
            of5 r5 = (defpackage.of5) r5
            if (r5 != 0) goto L449
            r5 = r2
            goto L452
        L449:
            r8 = 0
            r10 = 3
            r6 = 0
            boolean r5 = defpackage.p31.T0(r4, r5, r6, r8, r10)
        L452:
            if (r5 == 0) goto L46b
            ua4 r5 = r12.a
            int r6 = r5.L
            int r6 = r6 - r2
            java.lang.Object r5 = r5.l(r6)
            l31 r5 = (defpackage.l31) r5
            rj0 r5 = r5.b
            r5.i(r11)
            goto L42d
        L465:
            java.lang.String r13 = "MutableVector is empty."
            defpackage.fa6.e(r13)
            goto L490
        L46b:
            boolean r3 = r4.q0
            if (r3 == 0) goto L487
            a86 r3 = r4.o0
            java.lang.Object r3 = r3.c()
            r5 = r3
            of5 r5 = (defpackage.of5) r5
            if (r5 == 0) goto L487
            r8 = 0
            r10 = 3
            r6 = 0
            boolean r3 = defpackage.p31.T0(r4, r5, r6, r8, r10)
            if (r3 != r2) goto L487
            r4.q0 = r1
        L487:
            r1 = 0
            float r13 = defpackage.p31.R0(r4, r13, r1)
            r0.e = r13
            r3 = r11
        L490:
            return r3
        L491:
            java.lang.Object r0 = r13.B
            il0 r0 = (defpackage.il0) r0
            java.lang.Object r1 = r13.R
            pv2 r1 = (defpackage.pv2) r1
            java.lang.Object r13 = r13.L
            ea r13 = (defpackage.ea) r13
            q60 r0 = r0.b
            r0.getClass()
            java.util.List r1 = r1.a()
            i03 r13 = r13.h
            java.lang.String r13 = r13.d
            java.util.List r13 = r0.q(r13, r1)
            return r13
        L4af:
            java.lang.Object r0 = r13.B
            w70 r0 = (defpackage.w70) r0
            java.lang.Object r1 = r13.R
            eg4 r1 = (defpackage.eg4) r1
            java.lang.Object r13 = r13.L
            le r13 = (defpackage.le) r13
            of5 r5 = defpackage.w70.R0(r0, r1, r13)
            if (r5 == 0) goto L4e6
            p31 r4 = r0.k0
            long r0 = r4.r0
            r2 = -1
            boolean r13 = defpackage.q93.b(r0, r2)
            if (r13 == 0) goto L4d2
            java.lang.String r13 = "Expected BringIntoViewRequester to not be used before parents are placed."
            defpackage.s53.c(r13)
        L4d2:
            long r6 = r4.S0()
            r8 = 0
            long r0 = r4.V0(r5, r6, r8)
            r2 = -9223372034707292160(0x8000000080000000, double:-1.0609978955E-314)
            long r0 = r0 ^ r2
            of5 r3 = r5.i(r0)
        L4e6:
            return r3
        L4e7:
            java.lang.Object r0 = r13.B
            vz r0 = (defpackage.vz) r0
            java.lang.Object r1 = r13.R
            s9 r1 = (defpackage.s9) r1
            java.lang.Object r13 = r13.L
            bh5 r13 = (defpackage.bh5) r13
            r0.a()
            java.lang.Object r0 = r1.c
            vw r0 = (defpackage.vw) r0
            int r2 = r13.A
        L4fc:
            int r13 = r0.get()
            int r1 = r13 >>> 27
            r1 = r1 & 15
            if (r1 != r2) goto L509
            int r1 = r13 + (-1)
            goto L50a
        L509:
            r1 = r13
        L50a:
            boolean r13 = r0.compareAndSet(r13, r1)
            if (r13 == 0) goto L4fc
            jg7 r13 = defpackage.jg7.a
            return r13
        L513:
            java.lang.Object r0 = r13.B
            w6 r0 = (defpackage.w6) r0
            java.lang.Object r2 = r13.R
            o75 r2 = (defpackage.o75) r2
            java.lang.Object r13 = r13.L
            n3 r13 = (defpackage.n3) r13
            mm6 r0 = r0.a
            s6 r3 = new s6
            r3.<init>(r2, r13, r1)
            defpackage.mp2.V(r0, r3)
            jg7 r13 = defpackage.jg7.a
            return r13
        L52c:
            java.lang.Object r0 = r13.B
            w6 r0 = (defpackage.w6) r0
            java.lang.Object r1 = r13.R
            o3 r1 = (defpackage.o3) r1
            java.lang.Object r13 = r13.L
            n3 r13 = (defpackage.n3) r13
            mm6 r0 = r0.a
            p6 r3 = new p6
            r3.<init>(r1, r13, r2)
            defpackage.mp2.V(r0, r3)
            jg7 r13 = defpackage.jg7.a
            return r13
    }
}

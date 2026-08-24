package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mf  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class mf implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;
    public final /* synthetic */ java.lang.Object L;

    public /* synthetic */ mf(int r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.<init>()
            return
    }

    public /* synthetic */ mf(defpackage.dm2 r1, android.view.View r2, android.graphics.Rect r3) {
            r0 = this;
            r1 = 14
            r0.A = r1
            r0.<init>()
            r0.B = r2
            r0.L = r3
            return
    }

    private final void a() {
            r8 = this;
            java.lang.Object r0 = r8.B
            gj0 r0 = (defpackage.gj0) r0
            java.lang.Object r8 = r8.L
            qb0 r8 = (defpackage.qb0) r8
            if0 r1 = r0.g
            java.lang.Object r2 = r1.k
            java.util.concurrent.atomic.AtomicBoolean r2 = (java.util.concurrent.atomic.AtomicBoolean) r2
            r3 = 1
            boolean r2 = r2.getAndSet(r3)
            r4 = 0
            if (r2 == 0) goto L17
            goto L88
        L17:
            java.lang.Object r2 = r1.g
            ze0 r2 = (defpackage.ze0) r2
            r2.getClass()
            r5 = 0
            r2.f = r5
            java.lang.Object r6 = r2.b
            monitor-enter(r6)
            r2.c = r4     // Catch: java.lang.Throwable -> Lb4
            r2.e = r5     // Catch: java.lang.Throwable -> Lb4
            java.util.ArrayList r2 = r2.d     // Catch: java.lang.Throwable -> Lb4
            r2.clear()     // Catch: java.lang.Throwable -> Lb4
            monitor-exit(r6)
            java.lang.Object r2 = r1.h
            bx4 r2 = (defpackage.bx4) r2
            r2.getClass()
            java.lang.String r6 = "PipePresenceSrc"
            java.lang.String r7 = "Stopping camera ID flow collection."
            android.util.Log.i(r6, r7)
            java.util.concurrent.atomic.AtomicBoolean r6 = r2.h
            boolean r5 = r6.compareAndSet(r3, r5)
            if (r5 != 0) goto L45
            goto L4e
        L45:
            ap6 r5 = r2.i
            if (r5 == 0) goto L4c
            r5.h(r4)
        L4c:
            r2.i = r4
        L4e:
            java.lang.Object r2 = r1.b
            ex6 r2 = (defpackage.ex6) r2
            boolean r2 = r2.a()
            if (r2 == 0) goto L88
            java.lang.Object r1 = r1.b
            ex6 r1 = (defpackage.ex6) r1
            java.lang.Object r1 = r1.getValue()
            tg0 r1 = (defpackage.tg0) r1
            java.lang.Object r2 = r1.c
            monitor-enter(r2)
            boolean r5 = r1.d     // Catch: java.lang.Throwable -> L7c
            if (r5 != 0) goto L7e
            nb1 r5 = r1.a     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r5 = r5.e     // Catch: java.lang.Throwable -> L7c
            m55 r5 = (defpackage.m55) r5     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L7c
            zg0 r5 = (defpackage.zg0) r5     // Catch: java.lang.Throwable -> L7c
            r5.b()     // Catch: java.lang.Throwable -> L7c
            r1.d = r3     // Catch: java.lang.Throwable -> L7c
            monitor-exit(r2)
            goto L88
        L7c:
            r8 = move-exception
            goto L86
        L7e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L7c
            java.lang.String r0 = "Check failed."
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L7c
            throw r8     // Catch: java.lang.Throwable -> L7c
        L86:
            monitor-exit(r2)
            throw r8
        L88:
            android.os.HandlerThread r1 = r0.f
            if (r1 == 0) goto Lb0
            java.util.concurrent.Executor r1 = r0.d
            boolean r2 = r1 instanceof defpackage.gf0
            if (r2 == 0) goto Lab
            gf0 r1 = (defpackage.gf0) r1
            java.lang.Object r2 = r1.A
            monitor-enter(r2)
            java.util.concurrent.ScheduledThreadPoolExecutor r3 = r1.B     // Catch: java.lang.Throwable -> La5
            boolean r3 = r3.isShutdown()     // Catch: java.lang.Throwable -> La5
            if (r3 != 0) goto La7
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r1.B     // Catch: java.lang.Throwable -> La5
            r1.shutdown()     // Catch: java.lang.Throwable -> La5
            goto La7
        La5:
            r8 = move-exception
            goto La9
        La7:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La5
            goto Lab
        La9:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La5
            throw r8
        Lab:
            android.os.HandlerThread r0 = r0.f
            r0.quit()
        Lb0:
            r8.a(r4)
            return
        Lb4:
            r8 = move-exception
            monitor-exit(r6)
            throw r8
    }

    @Override // java.lang.Runnable
    public final void run() {
            r9 = this;
            int r0 = r9.A
            r1 = 0
            r2 = 0
            r3 = 1
            switch(r0) {
                case 0: goto L3e0;
                case 1: goto L3d4;
                case 2: goto L3c0;
                case 3: goto L3b1;
                case 4: goto L346;
                case 5: goto L332;
                case 6: goto L322;
                case 7: goto L2f5;
                case 8: goto L2e9;
                case 9: goto L2e5;
                case 10: goto L2d2;
                case 11: goto L2c6;
                case 12: goto L2b3;
                case 13: goto L27b;
                case 14: goto L26f;
                case 15: goto L243;
                case 16: goto L225;
                case 17: goto L1bf;
                case 18: goto L162;
                case 19: goto L10e;
                case 20: goto Lef;
                case 21: goto Ld7;
                case 22: goto Lc3;
                case 23: goto Lb5;
                case 24: goto La4;
                case 25: goto L6b;
                case 26: goto L3f;
                case 27: goto L23;
                case 28: goto L17;
                default: goto L8;
            }
        L8:
            java.lang.Object r0 = r9.B
            android.view.Surface r0 = (android.view.Surface) r0
            java.lang.Object r9 = r9.L
            android.graphics.SurfaceTexture r9 = (android.graphics.SurfaceTexture) r9
            r0.release()
            r9.release()
            return
        L17:
            java.lang.Object r0 = r9.B
            o54 r0 = (defpackage.o54) r0
            java.lang.Object r9 = r9.L
            u23 r9 = (defpackage.u23) r9
            r9.b(r0)
            return
        L23:
            java.lang.Object r0 = r9.B
            il5 r0 = (defpackage.il5) r0
            java.lang.Object r9 = r9.L
            qi1 r9 = (defpackage.qi1) r9
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            if (r0 == 0) goto L37
            java.util.LinkedHashSet r0 = r0.b
            r1.addAll(r0)
        L37:
            java.lang.Object r9 = r9.h
            hk0 r9 = (defpackage.hk0) r9
            r9.getClass()
            return
        L3f:
            java.lang.Object r0 = r9.B
            me.magnum.melonds.ui.layouteditor.b r0 = (me.magnum.melonds.ui.layouteditor.b) r0
            java.lang.Object r9 = r9.L
            nj3 r9 = (defpackage.nj3) r9
            nb1 r0 = r0.L
            java.lang.Object r0 = r0.A
            me.magnum.melonds.ui.layouteditor.LayoutEditorView r0 = (me.magnum.melonds.ui.layouteditor.LayoutEditorView) r0
            r9.getClass()
            java.util.Map r1 = r0.getViews()
            java.lang.Object r9 = r1.get(r9)
            zj3 r9 = (defpackage.zj3) r9
            if (r9 != 0) goto L5d
            goto L6a
        L5d:
            r0.v(r9)
            android.view.View r0 = r9.a
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r1)
            r9.c(r3)
        L6a:
            return
        L6b:
            java.lang.Object r0 = r9.B
            me.magnum.melonds.ui.layouteditor.LayoutEditorActivity r0 = (me.magnum.melonds.ui.layouteditor.LayoutEditorActivity) r0
            java.lang.Object r9 = r9.L
            w71 r9 = (defpackage.w71) r9
            me.magnum.melonds.ui.layouteditor.b r1 = r0.F0
            if (r1 == 0) goto L9e
            me.magnum.melonds.ui.layouteditor.LayoutEditorView r1 = r1.getLayoutEditorView()
            ff7 r2 = r9.a
            int r3 = defpackage.un3.L
            sn3 r3 = defpackage.sn3.MAIN_SCREEN
            r1.e(r2, r3)
            z82 r1 = r0.I0
            if (r1 == 0) goto L98
            ff7 r2 = r9.a
            r2.getClass()
            me.magnum.melonds.ui.layouteditor.b r1 = r1.A
            me.magnum.melonds.ui.layouteditor.LayoutEditorView r1 = r1.getLayoutEditorView()
            sn3 r3 = defpackage.sn3.SECONDARY_SCREEN
            r1.e(r2, r3)
        L98:
            ck3 r9 = r9.b
            defpackage.vy7.r0(r0, r9)
            return
        L9e:
            java.lang.String r9 = "layoutEditorManager"
            defpackage.nb3.a0(r9)
            throw r2
        La4:
            java.lang.Object r0 = r9.B
            re5 r0 = (defpackage.re5) r0
            java.lang.Object r9 = r9.L
            re5 r9 = (defpackage.re5) r9
            r0.i()
            if (r9 == 0) goto Lb4
            r9.i()
        Lb4:
            return
        Lb5:
            java.lang.Object r0 = r9.B
            rj0 r0 = (defpackage.rj0) r0
            java.lang.Object r9 = r9.L
            jv2 r9 = (defpackage.jv2) r9
            jg7 r1 = defpackage.jg7.a
            r0.I(r9, r1)
            return
        Lc3:
            java.lang.Object r0 = r9.B
            me.magnum.melonds.impl.emulator.EmulatorMessageQueue r0 = (me.magnum.melonds.impl.emulator.EmulatorMessageQueue) r0
            java.lang.Object r9 = r9.L
            java.util.concurrent.CountDownLatch r9 = (java.util.concurrent.CountDownLatch) r9
            r0.e()     // Catch: java.lang.Throwable -> Ld2
            r9.countDown()
            return
        Ld2:
            r0 = move-exception
            r9.countDown()
            throw r0
        Ld7:
            java.lang.Object r0 = r9.B
            me.magnum.melonds.ui.emulator.EmulatorActivity r0 = (me.magnum.melonds.ui.emulator.EmulatorActivity) r0
            java.lang.Object r9 = r9.L
            jq1 r9 = (defpackage.jq1) r9
            int r1 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r0.K(r9)
            r0.U0()
            c92 r9 = r0.K0
            if (r9 == 0) goto Lee
            r9.b()
        Lee:
            return
        Lef:
            java.lang.Object r0 = r9.B
            mq1 r0 = (defpackage.mq1) r0
            java.lang.Object r9 = r9.L
            wv6 r9 = (defpackage.wv6) r9
            ov2 r1 = r0.c
            ri0 r2 = new ri0
            r3 = 2
            r2.<init>(r3, r0, r9)
            android.view.Surface r1 = r9.h(r1, r2)
            iq1 r2 = r0.a
            r2.m(r1)
            java.util.LinkedHashMap r0 = r0.h
            r0.put(r9, r1)
            return
        L10e:
            java.lang.Object r0 = r9.B
            mq1 r0 = (defpackage.mq1) r0
            java.lang.Object r9 = r9.L
            bw6 r9 = (defpackage.bw6) r9
            int r1 = r0.e
            int r1 = r1 + r3
            r0.e = r1
            android.graphics.SurfaceTexture r1 = new android.graphics.SurfaceTexture
            iq1 r2 = r0.a
            boolean r4 = r9.d
            android.util.Size r5 = r9.b
            java.lang.Object r6 = r2.L
            java.util.concurrent.atomic.AtomicBoolean r6 = (java.util.concurrent.atomic.AtomicBoolean) r6
            defpackage.bp2.d(r6, r3)
            java.lang.Object r3 = r2.X
            java.lang.Thread r3 = (java.lang.Thread) r3
            defpackage.bp2.c(r3)
            if (r4 == 0) goto L136
            int r2 = r2.j0
            goto L138
        L136:
            int r2 = r2.k0
        L138:
            r1.<init>(r2)
            int r2 = r5.getWidth()
            int r3 = r5.getHeight()
            r1.setDefaultBufferSize(r2, r3)
            android.view.Surface r2 = new android.view.Surface
            r2.<init>(r1)
            ov2 r3 = r0.c
            lq1 r5 = new lq1
            r5.<init>(r0, r1, r2)
            r9.a(r2, r3, r5)
            if (r4 == 0) goto L15a
            r0.i = r1
            goto L161
        L15a:
            r0.j = r1
            android.os.Handler r9 = r0.d
            r1.setOnFrameAvailableListener(r0, r9)
        L161:
            return
        L162:
            java.lang.Object r0 = r9.B
            ig1 r0 = (defpackage.ig1) r0
            java.lang.Object r9 = r9.L
            java.lang.String r9 = (java.lang.String) r9
            tb0 r1 = r0.e     // Catch: java.lang.Exception -> L181
            r1.get()     // Catch: java.lang.Exception -> L181
            java.lang.String r1 = "Surface terminated"
            java.util.concurrent.atomic.AtomicInteger r2 = defpackage.ig1.m     // Catch: java.lang.Exception -> L181
            int r2 = r2.decrementAndGet()     // Catch: java.lang.Exception -> L181
            java.util.concurrent.atomic.AtomicInteger r3 = defpackage.ig1.l     // Catch: java.lang.Exception -> L181
            int r3 = r3.get()     // Catch: java.lang.Exception -> L181
            r0.e(r2, r3, r1)     // Catch: java.lang.Exception -> L181
            return
        L181:
            r1 = move-exception
            java.lang.String r2 = "DeferrableSurface"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Unexpected surface termination for "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r4 = "\nStack Trace:\n"
            r3.append(r4)
            r3.append(r9)
            java.lang.String r9 = r3.toString()
            defpackage.kj2.v(r2, r9)
            java.lang.Object r2 = r0.a
            monitor-enter(r2)
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L1bc
            java.lang.String r3 = "DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception."
            boolean r4 = r0.c     // Catch: java.lang.Throwable -> L1bc
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L1bc
            int r5 = r0.b     // Catch: java.lang.Throwable -> L1bc
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L1bc
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r4, r5}     // Catch: java.lang.Throwable -> L1bc
            java.lang.String r0 = java.lang.String.format(r3, r0)     // Catch: java.lang.Throwable -> L1bc
            r9.<init>(r0, r1)     // Catch: java.lang.Throwable -> L1bc
            throw r9     // Catch: java.lang.Throwable -> L1bc
        L1bc:
            r9 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1bc
            throw r9
        L1bf:
            java.lang.Object r0 = r9.B
            qf1 r0 = (defpackage.qf1) r0
            java.lang.Object r9 = r9.L
            bw6 r9 = (defpackage.bw6) r9
            int r1 = r0.i
            int r1 = r1 + r3
            r0.i = r1
            android.graphics.SurfaceTexture r1 = new android.graphics.SurfaceTexture
            qm4 r2 = r0.a
            java.lang.Object r4 = r2.L
            java.util.concurrent.atomic.AtomicBoolean r4 = (java.util.concurrent.atomic.AtomicBoolean) r4
            defpackage.bp2.d(r4, r3)
            java.lang.Object r4 = r2.X
            java.lang.Thread r4 = (java.lang.Thread) r4
            defpackage.bp2.c(r4)
            int r2 = r2.A
            r1.<init>(r2)
            android.util.Size r2 = r9.b
            int r2 = r2.getWidth()
            android.util.Size r4 = r9.b
            int r4 = r4.getHeight()
            r1.setDefaultBufferSize(r2, r4)
            android.view.Surface r2 = new android.view.Surface
            r2.<init>(r1)
            ov2 r4 = r0.c
            pk0 r5 = new pk0
            r5.<init>(r3, r0, r9)
            java.lang.Object r6 = r9.a
            monitor-enter(r6)
            r9.l = r5     // Catch: java.lang.Throwable -> L222
            r9.m = r4     // Catch: java.lang.Throwable -> L222
            cz r7 = r9.k     // Catch: java.lang.Throwable -> L222
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L222
            if (r7 == 0) goto L212
            yv6 r6 = new yv6
            r6.<init>(r5, r7, r3)
            r4.execute(r6)
        L212:
            ov2 r3 = r0.c
            pf1 r4 = new pf1
            r4.<init>(r0, r9, r1, r2)
            r9.a(r2, r3, r4)
            android.os.Handler r9 = r0.d
            r1.setOnFrameAvailableListener(r0, r9)
            return
        L222:
            r9 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L222
            throw r9
        L225:
            java.lang.Object r0 = r9.B
            qf1 r0 = (defpackage.qf1) r0
            java.lang.Object r9 = r9.L
            wv6 r9 = (defpackage.wv6) r9
            ov2 r1 = r0.c
            ri0 r2 = new ri0
            r2.<init>(r3, r0, r9)
            android.view.Surface r1 = r9.h(r1, r2)
            qm4 r2 = r0.a
            r2.m(r1)
            java.util.LinkedHashMap r0 = r0.h
            r0.put(r9, r1)
            return
        L243:
            java.lang.Object r0 = r9.B
            androidx.fragment.app.g r0 = (androidx.fragment.app.g) r0
            java.lang.Object r9 = r9.L
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            r9.getClass()
            java.util.ArrayList r0 = r0.c
            int r2 = r0.size()
        L254:
            if (r1 >= r2) goto L26e
            java.lang.Object r3 = r0.get(r1)
            int r1 = r1 + 1
            nf1 r3 = (defpackage.nf1) r3
            androidx.fragment.app.b0 r3 = r3.a
            androidx.fragment.app.o r4 = r3.c
            android.view.View r4 = r4.getView()
            if (r4 == 0) goto L254
            ao6 r3 = r3.a
            r3.applyState(r4, r9)
            goto L254
        L26e:
            return
        L26f:
            java.lang.Object r0 = r9.B
            android.view.View r0 = (android.view.View) r0
            java.lang.Object r9 = r9.L
            android.graphics.Rect r9 = (android.graphics.Rect) r9
            defpackage.dm2.j(r0, r9)
            return
        L27b:
            java.lang.Object r0 = r9.B
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r9 = r9.L
            a21 r9 = (defpackage.a21) r9
            java.util.Iterator r0 = r0.iterator()
        L287:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b2
            java.lang.Object r1 = r0.next()
            b20 r1 = (defpackage.b20) r1
            java.lang.Object r2 = r9.e
            c20 r3 = r1.a
            boolean r2 = r3.e(r2)
            if (r2 == 0) goto L2a7
            w21 r2 = new w21
            int r3 = r3.d()
            r2.<init>(r3)
            goto L2a9
        L2a7:
            v21 r2 = defpackage.v21.a
        L2a9:
            r35 r1 = r1.b
            r1.getClass()
            r1.c(r2)
            goto L287
        L2b2:
            return
        L2b3:
            java.lang.Object r0 = r9.B
            mv0 r0 = (defpackage.mv0) r0
            java.lang.Object r9 = r9.L
            il4 r9 = (defpackage.il4) r9
            ku3 r1 = r0.A
            ev0 r2 = new ev0
            r2.<init>(r9, r0)
            r1.a(r2)
            return
        L2c6:
            java.lang.Object r0 = r9.B
            jk5 r0 = (defpackage.jk5) r0
            java.lang.Object r9 = r9.L
            kk5 r9 = (defpackage.kk5) r9
            r0.N(r9)
            return
        L2d2:
            java.lang.Object r0 = r9.B
            lw7 r0 = (defpackage.lw7) r0
            java.lang.Object r9 = r9.L
            java.util.UUID r9 = (java.util.UUID) r9
            java.lang.String r9 = r9.toString()
            r9.getClass()
            defpackage.lb4.o(r0, r9)
            return
        L2e5:
            r9.a()
            return
        L2e9:
            java.lang.Object r0 = r9.B
            b31 r0 = (defpackage.b31) r0
            java.lang.Object r9 = r9.L
            sx r9 = (defpackage.sx) r9
            r0.accept(r9)
            return
        L2f5:
            java.lang.Object r0 = r9.B
            kh0 r0 = (defpackage.kh0) r0
            java.lang.Object r9 = r9.L
            eg0 r9 = (defpackage.eg0) r9
            java.lang.Object r1 = r0.a
            monitor-enter(r1)
            java.util.HashSet r3 = r0.c     // Catch: java.lang.Throwable -> L31c
            r3.remove(r9)     // Catch: java.lang.Throwable -> L31c
            java.util.HashSet r9 = r0.c     // Catch: java.lang.Throwable -> L31c
            boolean r9 = r9.isEmpty()     // Catch: java.lang.Throwable -> L31c
            if (r9 == 0) goto L31e
            qb0 r9 = r0.e     // Catch: java.lang.Throwable -> L31c
            r9.getClass()     // Catch: java.lang.Throwable -> L31c
            qb0 r9 = r0.e     // Catch: java.lang.Throwable -> L31c
            r9.a(r2)     // Catch: java.lang.Throwable -> L31c
            r0.e = r2     // Catch: java.lang.Throwable -> L31c
            r0.d = r2     // Catch: java.lang.Throwable -> L31c
            goto L31e
        L31c:
            r9 = move-exception
            goto L320
        L31e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L31c
            return
        L320:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L31c
            throw r9
        L322:
            java.lang.Object r0 = r9.B
            cg0 r0 = (defpackage.cg0) r0
            java.lang.Object r9 = r9.L
            eh0 r9 = (defpackage.eh0) r9
            qx3 r0 = r0.l()
            r0.d(r9)
            return
        L332:
            java.lang.Object r0 = r9.B
            eg0 r0 = (defpackage.eg0) r0
            java.lang.Object r9 = r9.L
            fi4 r9 = (defpackage.fi4) r9
            cg0 r0 = r0.q()
            qx3 r0 = r0.l()
            r0.e(r9)
            return
        L346:
            java.lang.Object r0 = r9.B
            fh0 r0 = (defpackage.fh0) r0
            java.lang.Object r9 = r9.L
            java.util.Set r9 = (java.util.Set) r9
            ci0 r0 = r0.a
            defpackage.nj2.h()
            java.lang.Object r2 = r0.a
            monitor-enter(r2)
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L394
        L35a:
            boolean r3 = r9.hasNext()     // Catch: java.lang.Throwable -> L394
            if (r3 == 0) goto L3ad
            java.lang.Object r3 = r9.next()     // Catch: java.lang.Throwable -> L394
            yf0 r3 = (defpackage.yf0) r3     // Catch: java.lang.Throwable -> L394
            java.lang.Object r4 = r0.g     // Catch: java.lang.Throwable -> L394
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch: java.lang.Throwable -> L394
            java.util.Set r4 = r4.keySet()     // Catch: java.lang.Throwable -> L394
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch: java.lang.Throwable -> L394
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L394
            r5.<init>()     // Catch: java.lang.Throwable -> L394
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L394
        L379:
            boolean r6 = r4.hasNext()     // Catch: java.lang.Throwable -> L394
            if (r6 == 0) goto L396
            java.lang.Object r6 = r4.next()     // Catch: java.lang.Throwable -> L394
            r7 = r6
            yf0 r7 = (defpackage.yf0) r7     // Catch: java.lang.Throwable -> L394
            java.util.ArrayList r7 = r7.a     // Catch: java.lang.Throwable -> L394
            java.util.ArrayList r8 = r3.a     // Catch: java.lang.Throwable -> L394
            boolean r7 = r7.equals(r8)     // Catch: java.lang.Throwable -> L394
            if (r7 == 0) goto L379
            r5.add(r6)     // Catch: java.lang.Throwable -> L394
            goto L379
        L394:
            r9 = move-exception
            goto L3af
        L396:
            int r3 = r5.size()     // Catch: java.lang.Throwable -> L394
            r4 = r1
        L39b:
            if (r4 >= r3) goto L35a
            java.lang.Object r6 = r5.get(r4)     // Catch: java.lang.Throwable -> L394
            int r4 = r4 + 1
            yf0 r6 = (defpackage.yf0) r6     // Catch: java.lang.Throwable -> L394
            java.lang.Object r7 = r0.g     // Catch: java.lang.Throwable -> L394
            java.util.HashMap r7 = (java.util.HashMap) r7     // Catch: java.lang.Throwable -> L394
            r7.remove(r6)     // Catch: java.lang.Throwable -> L394
            goto L39b
        L3ad:
            monitor-exit(r2)
            return
        L3af:
            monitor-exit(r2)
            throw r9
        L3b1:
            java.lang.Object r0 = r9.B
            ti0 r0 = (defpackage.ti0) r0
            java.lang.Object r9 = r9.L
            android.hardware.camera2.CameraCaptureSession r9 = (android.hardware.camera2.CameraCaptureSession) r9
            android.hardware.camera2.CameraCaptureSession$CaptureCallback r0 = r0.a
            r1 = -1
            r0.onCaptureSequenceAborted(r9, r1)
            return
        L3c0:
            java.lang.Object r0 = r9.B
            zb6 r0 = (defpackage.zb6) r0
            java.lang.Object r9 = r9.L
            java.lang.Runnable r9 = (java.lang.Runnable) r9
            r9.run()     // Catch: java.lang.Throwable -> L3cf
            r0.a()
            return
        L3cf:
            r9 = move-exception
            r0.a()
            throw r9
        L3d4:
            java.lang.Object r0 = r9.B
            ci r0 = (defpackage.ci) r0
            java.lang.Object r9 = r9.L
            u23 r9 = (defpackage.u23) r9
            r9.b(r0)
            return
        L3e0:
            java.lang.Object r0 = r9.B
            qf r0 = (defpackage.qf) r0
            java.lang.Object r9 = r9.L
            android.util.LongSparseArray r9 = (android.util.LongSparseArray) r9
            defpackage.ge7.x(r0, r9)
            return
    }
}

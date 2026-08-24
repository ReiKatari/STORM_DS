package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hf0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hf0 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;
    public final /* synthetic */ java.lang.Object L;
    public final /* synthetic */ java.lang.Object R;
    public final /* synthetic */ java.lang.Object X;

    public /* synthetic */ hf0(defpackage.fw7 r2, java.util.UUID r3, defpackage.wj2 r4, android.content.Context r5) {
            r1 = this;
            r0 = 6
            r1.A = r0
            r1.<init>()
            r1.L = r2
            r1.R = r3
            r1.X = r4
            r1.B = r5
            return
    }

    public /* synthetic */ hf0(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, int r5) {
            r0 = this;
            r0.A = r5
            r0.B = r1
            r0.L = r2
            r0.R = r3
            r0.X = r4
            r0.<init>()
            return
    }

    public /* synthetic */ hf0(defpackage.jf0 r2, android.content.Context r3, defpackage.ux r4, defpackage.sq1 r5) {
            r1 = this;
            r0 = 1
            r1.A = r0
            r1.<init>()
            r1.R = r2
            r1.B = r3
            r1.L = r4
            r1.X = r5
            return
    }

    public /* synthetic */ hf0(defpackage.mi6 r2, android.content.Context r3, defpackage.zt5 r4, defpackage.qn2 r5) {
            r1 = this;
            r0 = 4
            r1.A = r0
            r1.<init>()
            r1.L = r2
            r1.B = r3
            r1.R = r4
            r1.X = r5
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r15 = this;
            int r0 = r15.A
            r1 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            r3 = 0
            r4 = 1
            r5 = 0
            switch(r0) {
                case 0: goto L2b0;
                case 1: goto L236;
                case 2: goto L172;
                case 3: goto L131;
                case 4: goto Lf4;
                case 5: goto Ld1;
                default: goto Ld;
            }
        Ld:
            java.lang.Object r0 = r15.L
            fw7 r0 = (defpackage.fw7) r0
            java.lang.Object r1 = r15.R
            java.util.UUID r1 = (java.util.UUID) r1
            java.lang.Object r2 = r15.X
            wj2 r2 = (defpackage.wj2) r2
            java.lang.Object r15 = r15.B
            android.content.Context r15 = (android.content.Context) r15
            java.lang.String r1 = r1.toString()
            dx7 r3 = r0.c
            yw7 r3 = r3.d(r1)
            if (r3 == 0) goto Lcb
            iw7 r4 = r3.b
            boolean r4 = r4.isFinished()
            if (r4 != 0) goto Lcb
            o35 r0 = r0.b
            java.lang.String r4 = "Moving WorkSpec ("
            java.lang.Object r6 = r0.k
            monitor-enter(r6)
            ga0 r7 = defpackage.ga0.f()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r8 = defpackage.o35.l     // Catch: java.lang.Throwable -> L6c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
            r9.<init>(r4)     // Catch: java.lang.Throwable -> L6c
            r9.append(r1)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r4 = ") to the foreground"
            r9.append(r4)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r4 = r9.toString()     // Catch: java.lang.Throwable -> L6c
            r7.g(r8, r4)     // Catch: java.lang.Throwable -> L6c
            java.util.HashMap r4 = r0.g     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r4 = r4.remove(r1)     // Catch: java.lang.Throwable -> L6c
            rx7 r4 = (defpackage.rx7) r4     // Catch: java.lang.Throwable -> L6c
            if (r4 == 0) goto L8f
            android.os.PowerManager$WakeLock r7 = r0.a     // Catch: java.lang.Throwable -> L6c
            if (r7 != 0) goto L6f
            android.content.Context r7 = r0.b     // Catch: java.lang.Throwable -> L6c
            android.os.PowerManager$WakeLock r7 = defpackage.bs7.a(r7)     // Catch: java.lang.Throwable -> L6c
            r0.a = r7     // Catch: java.lang.Throwable -> L6c
            r7.acquire()     // Catch: java.lang.Throwable -> L6c
            goto L6f
        L6c:
            r0 = move-exception
            r15 = r0
            goto Lc9
        L6f:
            java.util.HashMap r7 = r0.f     // Catch: java.lang.Throwable -> L6c
            r7.put(r1, r4)     // Catch: java.lang.Throwable -> L6c
            android.content.Context r1 = r0.b     // Catch: java.lang.Throwable -> L6c
            yw7 r4 = r4.a     // Catch: java.lang.Throwable -> L6c
            gw7 r4 = defpackage.rr7.a(r4)     // Catch: java.lang.Throwable -> L6c
            android.content.Intent r1 = defpackage.mx6.c(r1, r4, r2)     // Catch: java.lang.Throwable -> L6c
            android.content.Context r0 = r0.b     // Catch: java.lang.Throwable -> L6c
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L6c
            r7 = 26
            if (r4 < r7) goto L8c
            defpackage.pt0.F(r0, r1)     // Catch: java.lang.Throwable -> L6c
            goto L8f
        L8c:
            r0.startService(r1)     // Catch: java.lang.Throwable -> L6c
        L8f:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6c
            gw7 r0 = defpackage.rr7.a(r3)
            java.lang.String r1 = defpackage.mx6.f0
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<androidx.work.impl.foreground.SystemForegroundService> r3 = androidx.work.impl.foreground.SystemForegroundService.class
            r1.<init>(r15, r3)
            java.lang.String r3 = "ACTION_NOTIFY"
            r1.setAction(r3)
            java.lang.String r3 = "KEY_NOTIFICATION_ID"
            int r4 = r2.a
            r1.putExtra(r3, r4)
            java.lang.String r3 = "KEY_FOREGROUND_SERVICE_TYPE"
            int r4 = r2.b
            r1.putExtra(r3, r4)
            java.lang.String r3 = "KEY_NOTIFICATION"
            android.app.Notification r2 = r2.c
            r1.putExtra(r3, r2)
            java.lang.String r2 = "KEY_WORKSPEC_ID"
            java.lang.String r3 = r0.a
            r1.putExtra(r2, r3)
            java.lang.String r2 = "KEY_GENERATION"
            int r0 = r0.b
            r1.putExtra(r2, r0)
            r15.startService(r1)
            goto Ld0
        Lc9:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6c
            throw r15
        Lcb:
            java.lang.String r15 = "Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result."
            defpackage.i.m(r15)
        Ld0:
            return r5
        Ld1:
            java.lang.Object r0 = r15.B
            j37 r0 = (defpackage.j37) r0
            java.lang.Object r1 = r15.L
            zt5 r1 = (defpackage.zt5) r1
            java.lang.Object r2 = r15.R
            pq5 r2 = (defpackage.pq5) r2
            java.lang.Object r15 = r15.X
            qn2 r15 = (defpackage.qn2) r15
            java.lang.String r1 = r1.i
            if (r1 != 0) goto Le7
            java.lang.String r1 = r2.a
        Le7:
            y00 r2 = new y00
            r3 = 19
            r2.<init>(r3, r15)
            defpackage.j37.c(r0, r1, r2)
            jg7 r15 = defpackage.jg7.a
            return r15
        Lf4:
            java.lang.Object r0 = r15.L
            r6 = r0
            mi6 r6 = (defpackage.mi6) r6
            java.lang.Object r0 = r15.B
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r1 = r15.R
            zt5 r1 = (defpackage.zt5) r1
            java.lang.Object r15 = r15.X
            qn2 r15 = (defpackage.qn2) r15
            r2 = 2131952111(0x7f1301ef, float:1.9540656E38)
            java.lang.String r7 = r0.getString(r2)
            r7.getClass()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            java.lang.Boolean[] r2 = new java.lang.Boolean[]{r5, r2, r3}
            java.util.List r8 = defpackage.hf.c0(r2)
            qk4 r9 = new qk4
            r2 = 12
            r9.<init>(r2, r0, r1)
            java.lang.Boolean r10 = r1.y
            y00 r11 = new y00
            r0 = 8
            r11.<init>(r0, r15)
            r6.a(r7, r8, r9, r10, r11)
            jg7 r15 = defpackage.jg7.a
            return r15
        L131:
            java.lang.Object r0 = r15.B
            r8 = r0
            java.lang.Number r8 = (java.lang.Number) r8
            java.lang.Object r0 = r15.L
            e53 r0 = (defpackage.e53) r0
            java.lang.Object r1 = r15.R
            r9 = r1
            java.lang.Number r9 = (java.lang.Number) r9
            java.lang.Object r15 = r15.X
            r6 = r15
            d53 r6 = (defpackage.d53) r6
            java.lang.Number r15 = r0.A
            boolean r15 = r8.equals(r15)
            if (r15 == 0) goto L154
            java.lang.Number r15 = r0.B
            boolean r15 = r9.equals(r15)
            if (r15 != 0) goto L16f
        L154:
            r0.A = r8
            r0.B = r9
            jz6 r5 = new jz6
            wc7 r7 = r0.L
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            r0.X = r5
            g53 r15 = r0.e0
            vs4 r15 = r15.b
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r15.setValue(r1)
            r0.Y = r3
            r0.Z = r4
        L16f:
            jg7 r15 = defpackage.jg7.a
            return r15
        L172:
            java.lang.Object r0 = r15.B
            me.magnum.melonds.ui.emulator.EmulatorActivity r0 = (me.magnum.melonds.ui.emulator.EmulatorActivity) r0
            java.lang.Object r1 = r15.L
            me.magnum.melonds.domain.model.VideoRenderer r1 = (me.magnum.melonds.domain.model.VideoRenderer) r1
            java.lang.Object r2 = r15.R
            pq5 r2 = (defpackage.pq5) r2
            java.lang.Object r15 = r15.X
            z33 r15 = (defpackage.z33) r15
            int r4 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            jt5 r2 = r2.f
            me.magnum.melonds.domain.model.VideoFiltering r2 = r2.l
            boolean r15 = r15.g
            android.content.res.Resources r4 = r0.getResources()
            r6 = 2130903115(0x7f03004b, float:1.7413039E38)
            java.lang.String[] r4 = r4.getStringArray(r6)
            r4.getClass()
            java.util.List r5 = defpackage.hf.b0(r5)
            t52 r6 = me.magnum.melonds.domain.model.VideoFiltering.getEntries()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L1a9:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L1c6
            java.lang.Object r8 = r6.next()
            r9 = r8
            me.magnum.melonds.domain.model.VideoFiltering r9 = (me.magnum.melonds.domain.model.VideoFiltering) r9
            boolean r10 = r9.isSupportedByRenderer(r1)
            if (r10 == 0) goto L1a9
            me.magnum.melonds.domain.model.VideoFiltering r10 = me.magnum.melonds.domain.model.VideoFiltering.RETROARCH
            if (r9 != r10) goto L1c2
            if (r15 == 0) goto L1a9
        L1c2:
            r7.add(r8)
            goto L1a9
        L1c6:
            java.util.ArrayList r15 = defpackage.gt0.V0(r5, r7)
            java.util.ArrayList r1 = new java.util.ArrayList
            r5 = 10
            int r5 = defpackage.ht0.v0(r15, r5)
            r1.<init>(r5)
            int r5 = r15.size()
            r6 = r3
        L1da:
            if (r6 >= r5) goto L206
            java.lang.Object r7 = r15.get(r6)
            int r6 = r6 + 1
            me.magnum.melonds.domain.model.VideoFiltering r7 = (me.magnum.melonds.domain.model.VideoFiltering) r7
            if (r7 == 0) goto L1f8
            int r8 = r7.ordinal()
            java.lang.Object r8 = defpackage.fv.J0(r8, r4)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L1f6
            java.lang.String r8 = r7.name()
        L1f6:
            if (r8 != 0) goto L202
        L1f8:
            r7 = 2131952787(0x7f130493, float:1.9542027E38)
            java.lang.String r8 = r0.getString(r7)
            r8.getClass()
        L202:
            r1.add(r8)
            goto L1da
        L206:
            java.lang.String[] r4 = new java.lang.String[r3]
            java.lang.Object[] r1 = r1.toArray(r4)
            java.lang.String[] r1 = (java.lang.String[]) r1
            int r2 = r15.indexOf(r2)
            if (r2 >= 0) goto L215
            goto L216
        L215:
            r3 = r2
        L216:
            mv1 r2 = new mv1
            r4 = 2131951988(0x7f130174, float:1.9540406E38)
            java.lang.String r4 = r0.getString(r4)
            r4.getClass()
            java.util.List r1 = defpackage.fv.T0(r1)
            y r5 = new y
            r6 = 27
            r5.<init>(r6, r0, r15)
            r2.<init>(r3, r5, r4, r1)
            r0.c0(r2)
            jg7 r15 = defpackage.jg7.a
            return r15
        L236:
            java.lang.Object r0 = r15.R
            jf0 r0 = (defpackage.jf0) r0
            java.lang.Object r3 = r15.B
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r6 = r15.L
            ux r6 = (defpackage.ux) r6
            java.lang.Object r15 = r15.X
            sq1 r15 = (defpackage.sq1) r15
            java.lang.String r7 = "CXCP"
            java.lang.String r8 = "Created CameraPipe in "
            java.lang.String r9 = "Create CameraPipe"
            android.os.Trace.beginSection(r9)     // Catch: java.lang.Throwable -> L2aa
            long r9 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Throwable -> L2aa
            pg0 r11 = new pg0     // Catch: java.lang.Throwable -> L2aa
            android.content.Context r3 = defpackage.q41.a(r3)     // Catch: java.lang.Throwable -> L2aa
            r3.getClass()     // Catch: java.lang.Throwable -> L2aa
            rg0 r12 = new rg0     // Catch: java.lang.Throwable -> L2aa
            java.util.concurrent.Executor r6 = r6.a     // Catch: java.lang.Throwable -> L2aa
            vb6 r13 = new vb6     // Catch: java.lang.Throwable -> L2aa
            r13.<init>(r6)     // Catch: java.lang.Throwable -> L2aa
            r6 = 119(0x77, float:1.67E-43)
            r12.<init>(r13, r6)     // Catch: java.lang.Throwable -> L2aa
            og0 r6 = new og0     // Catch: java.lang.Throwable -> L2aa
            u63 r0 = r0.a     // Catch: java.lang.Throwable -> L2aa
            java.lang.Object r13 = r0.B     // Catch: java.lang.Throwable -> L2aa
            jg0 r13 = (defpackage.jg0) r13     // Catch: java.lang.Throwable -> L2aa
            java.lang.Object r0 = r0.L     // Catch: java.lang.Throwable -> L2aa
            u63 r0 = (defpackage.u63) r0     // Catch: java.lang.Throwable -> L2aa
            r6.<init>(r13, r0, r15)     // Catch: java.lang.Throwable -> L2aa
            r11.<init>(r3, r12, r6)     // Catch: java.lang.Throwable -> L2aa
            tg0 r15 = defpackage.vg0.a(r11)     // Catch: java.lang.Throwable -> L2aa
            boolean r0 = defpackage.kj2.F(r7)     // Catch: java.lang.Throwable -> L2aa
            if (r0 == 0) goto L2a6
            long r11 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Throwable -> L2aa
            long r11 = r11 - r9
            java.lang.String r0 = "%.3f ms"
            double r9 = (double) r11     // Catch: java.lang.Throwable -> L2aa
            double r9 = r9 / r1
            java.lang.Double r1 = java.lang.Double.valueOf(r9)     // Catch: java.lang.Throwable -> L2aa
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L2aa
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r4)     // Catch: java.lang.Throwable -> L2aa
            java.lang.String r0 = java.lang.String.format(r5, r0, r1)     // Catch: java.lang.Throwable -> L2aa
            java.lang.String r0 = r8.concat(r0)     // Catch: java.lang.Throwable -> L2aa
            android.util.Log.d(r7, r0)     // Catch: java.lang.Throwable -> L2aa
        L2a6:
            android.os.Trace.endSection()
            return r15
        L2aa:
            r0 = move-exception
            r15 = r0
            android.os.Trace.endSection()
            throw r15
        L2b0:
            java.lang.Object r0 = r15.B
            r7 = r0
            android.content.Context r7 = (android.content.Context) r7
            java.lang.Object r0 = r15.L
            r8 = r0
            ux r8 = (defpackage.ux) r8
            java.lang.Object r0 = r15.R
            if0 r0 = (defpackage.if0) r0
            java.lang.Object r15 = r15.X
            r10 = r15
            u63 r10 = (defpackage.u63) r10
            java.lang.String r15 = "CameraFactoryAdapter#appComponent"
            android.os.Trace.beginSection(r15)
            long r13 = android.os.SystemClock.elapsedRealtimeNanos()
            pa r6 = new pa
            java.lang.Object r15 = r0.b
            ex6 r15 = (defpackage.ex6) r15
            java.lang.Object r15 = r15.getValue()
            r9 = r15
            tg0 r9 = (defpackage.tg0) r9
            java.lang.Object r15 = r0.g
            r11 = r15
            ze0 r11 = (defpackage.ze0) r11
            java.lang.Object r15 = r0.f
            r12 = r15
            ij0 r12 = (defpackage.ij0) r12
            r6.<init>(r7, r8, r9, r10, r11, r12)
            eb1 r15 = new eb1
            r15.<init>(r6)
            java.lang.String r0 = "CXCP"
            boolean r3 = defpackage.kj2.F(r0)
            if (r3 == 0) goto L315
            long r6 = android.os.SystemClock.elapsedRealtimeNanos()
            long r6 = r6 - r13
            java.lang.String r3 = "%.3f ms"
            double r6 = (double) r6
            double r6 = r6 / r1
            java.lang.Double r1 = java.lang.Double.valueOf(r6)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r4)
            java.lang.String r1 = java.lang.String.format(r5, r3, r1)
            java.lang.String r2 = "Created CameraFactoryAdapter in "
            java.lang.String r1 = r2.concat(r1)
            android.util.Log.d(r0, r1)
        L315:
            android.os.Trace.endSection()
            return r15
    }
}

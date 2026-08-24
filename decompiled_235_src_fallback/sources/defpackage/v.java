package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;
    public final /* synthetic */ java.lang.Object L;
    public final /* synthetic */ java.lang.Object R;

    public /* synthetic */ v(defpackage.be0 r1, defpackage.ae0 r2, defpackage.yk5 r3, java.lang.Object r4, int r5) {
            r0 = this;
            r0.A = r5
            r0.B = r1
            r0.L = r3
            r0.R = r4
            r0.<init>()
            return
    }

    public /* synthetic */ v(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.A = r4
            r0.B = r1
            r0.L = r2
            r0.R = r3
            r0.<init>()
            return
    }

    public /* synthetic */ v(defpackage.mq1 r2, defpackage.yq1 r3, defpackage.qb0 r4) {
            r1 = this;
            r0 = 14
            r1.A = r0
            java.util.Map r0 = java.util.Collections.EMPTY_MAP
            r1.<init>()
            r1.B = r2
            r1.L = r3
            r1.R = r4
            return
    }

    public /* synthetic */ v(defpackage.qf1 r2, defpackage.yq1 r3, defpackage.qb0 r4) {
            r1 = this;
            r0 = 13
            r1.A = r0
            java.util.Map r0 = java.util.Collections.EMPTY_MAP
            r1.<init>()
            r1.B = r2
            r1.L = r3
            r1.R = r4
            return
    }

    public /* synthetic */ v(defpackage.yc1 r2, defpackage.mb0 r3, java.lang.Throwable r4) {
            r1 = this;
            r0 = 9
            r1.A = r0
            r1.<init>()
            r1.L = r2
            r1.R = r3
            r1.B = r4
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r13 = this;
            int r0 = r13.A
            r1 = 0
            r2 = 0
            r3 = 1
            switch(r0) {
                case 0: goto L44e;
                case 1: goto L42c;
                case 2: goto L41c;
                case 3: goto L40c;
                case 4: goto L3f8;
                case 5: goto L3e4;
                case 6: goto L3b0;
                case 7: goto L376;
                case 8: goto L34f;
                case 9: goto L33b;
                case 10: goto L321;
                case 11: goto L2fd;
                case 12: goto L2e5;
                case 13: goto L2c9;
                case 14: goto L2ad;
                case 15: goto L295;
                case 16: goto L254;
                case 17: goto L1ea;
                case 18: goto L175;
                case 19: goto L165;
                default: goto L8;
            }
        L8:
            java.lang.Object r0 = r13.B
            rr6 r0 = (defpackage.rr6) r0
            java.lang.Object r13 = r13.L
            jp6 r13 = (defpackage.jp6) r13
            java.lang.Object r0 = r0.B
            o35 r0 = (defpackage.o35) r0
            r0.getClass()
            java.lang.String r4 = "Work "
            gw7 r5 = r13.a
            java.lang.String r6 = r5.a
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            androidx.work.impl.WorkDatabase r8 = r0.e
            n35 r9 = new n35
            r9.<init>(r0, r7, r6)
            er2 r10 = new er2
            r11 = 25
            r10.<init>(r9, r11)
            java.lang.Object r8 = r8.o(r10)
            yw7 r8 = (defpackage.yw7) r8
            r9 = 4
            if (r8 != 0) goto L5e
            ga0 r13 = defpackage.ga0.f()
            java.lang.String r1 = defpackage.o35.l
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Didn't find WorkSpec for id "
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r13.j(r1, r2)
            ow7 r13 = r0.d
            ec3 r13 = r13.d
            q64 r1 = new q64
            r1.<init>(r9, r0, r5)
            r13.execute(r1)
            goto L15f
        L5e:
            java.lang.Object r10 = r0.k
            monitor-enter(r10)
            java.lang.Object r11 = r0.k     // Catch: java.lang.Throwable -> La6
            monitor-enter(r11)     // Catch: java.lang.Throwable -> La6
            rx7 r12 = r0.c(r6)     // Catch: java.lang.Throwable -> L160
            if (r12 == 0) goto L6b
            r2 = r3
        L6b:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L160
            if (r2 == 0) goto Lb8
            java.util.HashMap r1 = r0.h     // Catch: java.lang.Throwable -> La6
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> La6
            java.util.Set r1 = (java.util.Set) r1     // Catch: java.lang.Throwable -> La6
            java.util.Iterator r2 = r1.iterator()     // Catch: java.lang.Throwable -> La6
            java.lang.Object r2 = r2.next()     // Catch: java.lang.Throwable -> La6
            jp6 r2 = (defpackage.jp6) r2     // Catch: java.lang.Throwable -> La6
            gw7 r2 = r2.a     // Catch: java.lang.Throwable -> La6
            int r2 = r2.b     // Catch: java.lang.Throwable -> La6
            int r3 = r5.b     // Catch: java.lang.Throwable -> La6
            if (r2 != r3) goto La9
            r1.add(r13)     // Catch: java.lang.Throwable -> La6
            ga0 r13 = defpackage.ga0.f()     // Catch: java.lang.Throwable -> La6
            java.lang.String r0 = defpackage.o35.l     // Catch: java.lang.Throwable -> La6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La6
            r1.<init>(r4)     // Catch: java.lang.Throwable -> La6
            r1.append(r5)     // Catch: java.lang.Throwable -> La6
            java.lang.String r2 = " is already enqueued for processing"
            r1.append(r2)     // Catch: java.lang.Throwable -> La6
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> La6
            r13.b(r0, r1)     // Catch: java.lang.Throwable -> La6
            goto Lb5
        La6:
            r13 = move-exception
            goto L163
        La9:
            ow7 r13 = r0.d     // Catch: java.lang.Throwable -> La6
            ec3 r13 = r13.d     // Catch: java.lang.Throwable -> La6
            q64 r1 = new q64     // Catch: java.lang.Throwable -> La6
            r1.<init>(r9, r0, r5)     // Catch: java.lang.Throwable -> La6
            r13.execute(r1)     // Catch: java.lang.Throwable -> La6
        Lb5:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> La6
            goto L15f
        Lb8:
            int r2 = r8.t     // Catch: java.lang.Throwable -> La6
            int r4 = r5.b     // Catch: java.lang.Throwable -> La6
            if (r2 == r4) goto Lcd
            ow7 r13 = r0.d     // Catch: java.lang.Throwable -> La6
            ec3 r13 = r13.d     // Catch: java.lang.Throwable -> La6
            q64 r1 = new q64     // Catch: java.lang.Throwable -> La6
            r1.<init>(r9, r0, r5)     // Catch: java.lang.Throwable -> La6
            r13.execute(r1)     // Catch: java.lang.Throwable -> La6
            monitor-exit(r10)     // Catch: java.lang.Throwable -> La6
            goto L15f
        Lcd:
            p87 r2 = new p87     // Catch: java.lang.Throwable -> La6
            android.content.Context r4 = r0.b     // Catch: java.lang.Throwable -> La6
            az0 r9 = r0.c     // Catch: java.lang.Throwable -> La6
            ow7 r11 = r0.d     // Catch: java.lang.Throwable -> La6
            androidx.work.impl.WorkDatabase r12 = r0.e     // Catch: java.lang.Throwable -> La6
            r4.getClass()     // Catch: java.lang.Throwable -> La6
            r0.getClass()     // Catch: java.lang.Throwable -> La6
            r2.<init>()     // Catch: java.lang.Throwable -> La6
            r2.b = r9     // Catch: java.lang.Throwable -> La6
            r2.c = r11     // Catch: java.lang.Throwable -> La6
            r2.d = r0     // Catch: java.lang.Throwable -> La6
            r2.e = r12     // Catch: java.lang.Throwable -> La6
            r2.f = r8     // Catch: java.lang.Throwable -> La6
            r2.g = r7     // Catch: java.lang.Throwable -> La6
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> La6
            r4.getClass()     // Catch: java.lang.Throwable -> La6
            r2.a = r4     // Catch: java.lang.Throwable -> La6
            rr6 r4 = new rr6     // Catch: java.lang.Throwable -> La6
            r7 = 17
            r4.<init>(r7)     // Catch: java.lang.Throwable -> La6
            rx7 r4 = new rx7     // Catch: java.lang.Throwable -> La6
            r4.<init>(r2)     // Catch: java.lang.Throwable -> La6
            ow7 r2 = r4.d     // Catch: java.lang.Throwable -> La6
            n61 r2 = r2.b     // Catch: java.lang.Throwable -> La6
            tc3 r7 = defpackage.yh2.c()     // Catch: java.lang.Throwable -> La6
            r2.getClass()     // Catch: java.lang.Throwable -> La6
            l61 r2 = defpackage.jw2.y(r2, r7)     // Catch: java.lang.Throwable -> La6
            px7 r7 = new px7     // Catch: java.lang.Throwable -> La6
            r7.<init>(r4, r1, r3)     // Catch: java.lang.Throwable -> La6
            tb0 r1 = defpackage.yh2.B(r2, r7)     // Catch: java.lang.Throwable -> La6
            v r2 = new v     // Catch: java.lang.Throwable -> La6
            r3 = 18
            r2.<init>(r0, r1, r4, r3)     // Catch: java.lang.Throwable -> La6
            ow7 r3 = r0.d     // Catch: java.lang.Throwable -> La6
            ec3 r3 = r3.d     // Catch: java.lang.Throwable -> La6
            sb0 r1 = r1.B     // Catch: java.lang.Throwable -> La6
            r1.a(r3, r2)     // Catch: java.lang.Throwable -> La6
            java.util.HashMap r1 = r0.g     // Catch: java.lang.Throwable -> La6
            r1.put(r6, r4)     // Catch: java.lang.Throwable -> La6
            java.util.HashSet r1 = new java.util.HashSet     // Catch: java.lang.Throwable -> La6
            r1.<init>()     // Catch: java.lang.Throwable -> La6
            r1.add(r13)     // Catch: java.lang.Throwable -> La6
            java.util.HashMap r13 = r0.h     // Catch: java.lang.Throwable -> La6
            r13.put(r6, r1)     // Catch: java.lang.Throwable -> La6
            monitor-exit(r10)     // Catch: java.lang.Throwable -> La6
            ga0 r13 = defpackage.ga0.f()
            java.lang.String r0 = defpackage.o35.l
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class<o35> r2 = defpackage.o35.class
            java.lang.String r2 = r2.getSimpleName()
            r1.append(r2)
            java.lang.String r2 = ": processing "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r13.b(r0, r1)
        L15f:
            return
        L160:
            r13 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L160
            throw r13     // Catch: java.lang.Throwable -> La6
        L163:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> La6
            throw r13
        L165:
            java.lang.Object r0 = r13.B
            m44 r0 = (defpackage.m44) r0
            java.lang.Object r1 = r13.L
            qv6 r1 = (defpackage.qv6) r1
            java.lang.Object r13 = r13.R
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            r0.d(r1, r13)
            return
        L175:
            java.lang.Object r0 = r13.B
            o35 r0 = (defpackage.o35) r0
            java.lang.Object r1 = r13.L
            tb0 r1 = (defpackage.tb0) r1
            java.lang.Object r13 = r13.R
            rx7 r13 = (defpackage.rx7) r13
            r0.getClass()
            sb0 r1 = r1.B     // Catch: java.lang.Throwable -> L190
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L190
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L190
            boolean r3 = r1.booleanValue()     // Catch: java.lang.Throwable -> L190
        L190:
            java.lang.Object r1 = r0.k
            monitor-enter(r1)
            yw7 r4 = r13.a     // Catch: java.lang.Throwable -> L1a5
            gw7 r4 = defpackage.rr7.a(r4)     // Catch: java.lang.Throwable -> L1a5
            java.lang.String r5 = r4.a     // Catch: java.lang.Throwable -> L1a5
            rx7 r6 = r0.c(r5)     // Catch: java.lang.Throwable -> L1a5
            if (r6 != r13) goto L1a7
            r0.b(r5)     // Catch: java.lang.Throwable -> L1a5
            goto L1a7
        L1a5:
            r13 = move-exception
            goto L1e8
        L1a7:
            ga0 r13 = defpackage.ga0.f()     // Catch: java.lang.Throwable -> L1a5
            java.lang.String r6 = defpackage.o35.l     // Catch: java.lang.Throwable -> L1a5
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a5
            r7.<init>()     // Catch: java.lang.Throwable -> L1a5
            java.lang.Class<o35> r8 = defpackage.o35.class
            java.lang.String r8 = r8.getSimpleName()     // Catch: java.lang.Throwable -> L1a5
            r7.append(r8)     // Catch: java.lang.Throwable -> L1a5
            java.lang.String r8 = " "
            r7.append(r8)     // Catch: java.lang.Throwable -> L1a5
            r7.append(r5)     // Catch: java.lang.Throwable -> L1a5
            java.lang.String r5 = " executed; reschedule = "
            r7.append(r5)     // Catch: java.lang.Throwable -> L1a5
            r7.append(r3)     // Catch: java.lang.Throwable -> L1a5
            java.lang.String r5 = r7.toString()     // Catch: java.lang.Throwable -> L1a5
            r13.b(r6, r5)     // Catch: java.lang.Throwable -> L1a5
            java.util.ArrayList r13 = r0.j     // Catch: java.lang.Throwable -> L1a5
            int r0 = r13.size()     // Catch: java.lang.Throwable -> L1a5
        L1d8:
            if (r2 >= r0) goto L1e6
            java.lang.Object r5 = r13.get(r2)     // Catch: java.lang.Throwable -> L1a5
            int r2 = r2 + 1
            b72 r5 = (defpackage.b72) r5     // Catch: java.lang.Throwable -> L1a5
            r5.b(r4, r3)     // Catch: java.lang.Throwable -> L1a5
            goto L1d8
        L1e6:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a5
            return
        L1e8:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a5
            throw r13
        L1ea:
            java.lang.Object r0 = r13.B
            me.magnum.melonds.impl.emulator.EmulatorMessageQueue r0 = (me.magnum.melonds.impl.emulator.EmulatorMessageQueue) r0
            java.lang.Object r1 = r13.L
            dh5 r1 = (defpackage.dh5) r1
            java.lang.Object r13 = r13.R
            java.util.concurrent.CountDownLatch r13 = (java.util.concurrent.CountDownLatch) r13
            boolean r2 = r0.f     // Catch: java.lang.Throwable -> L230 java.lang.Exception -> L232
            if (r2 == 0) goto L1fe
        L1fa:
            r13.countDown()
            goto L24f
        L1fe:
            android.os.Looper r2 = android.os.Looper.myLooper()     // Catch: java.lang.Throwable -> L230 java.lang.Exception -> L232
            if (r2 == 0) goto L244
            int r4 = me.magnum.melonds.impl.emulator.EmulatorMessageQueue.a()     // Catch: java.lang.Throwable -> L230 java.lang.Exception -> L232
            if (r4 < 0) goto L23c
            android.os.ParcelFileDescriptor r4 = android.os.ParcelFileDescriptor.fromFd(r4)     // Catch: java.lang.Throwable -> L230 java.lang.Exception -> L232
            if (r4 == 0) goto L234
            r0.d = r4     // Catch: java.lang.Throwable -> L230 java.lang.Exception -> L232
            r0.f = r3     // Catch: java.lang.Throwable -> L230 java.lang.Exception -> L232
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L230 java.lang.Exception -> L232
            java.io.FileDescriptor r6 = r4.getFileDescriptor()     // Catch: java.lang.Throwable -> L230 java.lang.Exception -> L232
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L230 java.lang.Exception -> L232
            r0.e = r5     // Catch: java.lang.Throwable -> L230 java.lang.Exception -> L232
            android.os.MessageQueue r2 = r2.getQueue()     // Catch: java.lang.Throwable -> L230 java.lang.Exception -> L232
            java.io.FileDescriptor r4 = r4.getFileDescriptor()     // Catch: java.lang.Throwable -> L230 java.lang.Exception -> L232
            dx1 r5 = new dx1     // Catch: java.lang.Throwable -> L230 java.lang.Exception -> L232
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L230 java.lang.Exception -> L232
            r2.addOnFileDescriptorEventListener(r4, r3, r5)     // Catch: java.lang.Throwable -> L230 java.lang.Exception -> L232
            goto L1fa
        L230:
            r0 = move-exception
            goto L250
        L232:
            r0 = move-exception
            goto L24c
        L234:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L230 java.lang.Exception -> L232
            java.lang.String r2 = "Failed to create ParcelFileDescriptor"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L230 java.lang.Exception -> L232
            throw r0     // Catch: java.lang.Throwable -> L230 java.lang.Exception -> L232
        L23c:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L230 java.lang.Exception -> L232
            java.lang.String r2 = "Failed to initialize native pipe"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L230 java.lang.Exception -> L232
            throw r0     // Catch: java.lang.Throwable -> L230 java.lang.Exception -> L232
        L244:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L230 java.lang.Exception -> L232
            java.lang.String r2 = "Current thread does not have a Looper"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L230 java.lang.Exception -> L232
            throw r0     // Catch: java.lang.Throwable -> L230 java.lang.Exception -> L232
        L24c:
            r1.A = r0     // Catch: java.lang.Throwable -> L230
            goto L1fa
        L24f:
            return
        L250:
            r13.countDown()
            throw r0
        L254:
            java.lang.Object r0 = r13.B
            rh r0 = (defpackage.rh) r0
            java.lang.Object r1 = r13.L
            hv r1 = (defpackage.hv) r1
            java.lang.Object r13 = r13.R
            java.util.concurrent.ThreadPoolExecutor r13 = (java.util.concurrent.ThreadPoolExecutor) r13
            android.content.Context r0 = r0.a     // Catch: java.lang.Throwable -> L281
            wi2 r0 = defpackage.vy7.W(r0)     // Catch: java.lang.Throwable -> L281
            if (r0 == 0) goto L286
            java.lang.Object r2 = r0.b     // Catch: java.lang.Throwable -> L281
            vs1 r2 = (defpackage.vs1) r2     // Catch: java.lang.Throwable -> L281
            vi2 r2 = (defpackage.vi2) r2     // Catch: java.lang.Throwable -> L281
            java.lang.Object r3 = r2.d     // Catch: java.lang.Throwable -> L281
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L281
            r2.f = r13     // Catch: java.lang.Throwable -> L283
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L283
            java.lang.Object r0 = r0.b     // Catch: java.lang.Throwable -> L281
            vs1 r0 = (defpackage.vs1) r0     // Catch: java.lang.Throwable -> L281
            ys1 r2 = new ys1     // Catch: java.lang.Throwable -> L281
            r2.<init>(r1, r13)     // Catch: java.lang.Throwable -> L281
            r0.a(r2)     // Catch: java.lang.Throwable -> L281
            goto L294
        L281:
            r0 = move-exception
            goto L28e
        L283:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L283
            throw r0     // Catch: java.lang.Throwable -> L281
        L286:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L281
            java.lang.String r2 = "EmojiCompat font provider not available on this device."
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L281
            throw r0     // Catch: java.lang.Throwable -> L281
        L28e:
            r1.O(r0)
            r13.shutdown()
        L294:
            return
        L295:
            java.lang.Object r0 = r13.B
            mq1 r0 = (defpackage.mq1) r0
            java.lang.Object r1 = r13.L
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            java.lang.Object r13 = r13.R
            java.lang.Runnable r13 = (java.lang.Runnable) r13
            boolean r0 = r0.f
            if (r0 == 0) goto L2a9
            r1.run()
            goto L2ac
        L2a9:
            r13.run()
        L2ac:
            return
        L2ad:
            java.lang.Object r0 = r13.B
            mq1 r0 = (defpackage.mq1) r0
            java.lang.Object r2 = r13.L
            yq1 r2 = (defpackage.yq1) r2
            java.util.Map r3 = java.util.Collections.EMPTY_MAP
            java.lang.Object r13 = r13.R
            qb0 r13 = (defpackage.qb0) r13
            iq1 r0 = r0.a     // Catch: java.lang.RuntimeException -> L2c4
            r0.j(r2)     // Catch: java.lang.RuntimeException -> L2c4
            r13.a(r1)     // Catch: java.lang.RuntimeException -> L2c4
            goto L2c8
        L2c4:
            r0 = move-exception
            r13.c(r0)
        L2c8:
            return
        L2c9:
            java.lang.Object r0 = r13.B
            qf1 r0 = (defpackage.qf1) r0
            java.lang.Object r2 = r13.L
            yq1 r2 = (defpackage.yq1) r2
            java.util.Map r3 = java.util.Collections.EMPTY_MAP
            java.lang.Object r13 = r13.R
            qb0 r13 = (defpackage.qb0) r13
            qm4 r0 = r0.a     // Catch: java.lang.RuntimeException -> L2e0
            r0.j(r2)     // Catch: java.lang.RuntimeException -> L2e0
            r13.a(r1)     // Catch: java.lang.RuntimeException -> L2e0
            goto L2e4
        L2e0:
            r0 = move-exception
            r13.c(r0)
        L2e4:
            return
        L2e5:
            java.lang.Object r0 = r13.B
            qf1 r0 = (defpackage.qf1) r0
            java.lang.Object r1 = r13.L
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            java.lang.Object r13 = r13.R
            java.lang.Runnable r13 = (java.lang.Runnable) r13
            boolean r0 = r0.j
            if (r0 == 0) goto L2f9
            r1.run()
            goto L2fc
        L2f9:
            r13.run()
        L2fc:
            return
        L2fd:
            java.lang.Object r0 = r13.B
            androidx.fragment.app.b0 r0 = (androidx.fragment.app.b0) r0
            java.lang.Object r1 = r13.L
            androidx.fragment.app.b0 r1 = (androidx.fragment.app.b0) r1
            java.lang.Object r13 = r13.R
            androidx.fragment.app.g r13 = (androidx.fragment.app.g) r13
            androidx.fragment.app.o r0 = r0.c
            androidx.fragment.app.o r1 = r1.c
            boolean r13 = r13.o
            bm2 r2 = defpackage.wl2.a
            r0.getClass()
            r1.getClass()
            if (r13 == 0) goto L31d
            r1.getEnterTransitionCallback()
            goto L320
        L31d:
            r0.getEnterTransitionCallback()
        L320:
            return
        L321:
            java.lang.Object r0 = r13.B
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            java.lang.Object r1 = r13.L
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r13 = r13.R
            androidx.fragment.app.c r13 = (androidx.fragment.app.c) r13
            r0.getClass()
            r0.endViewTransition(r1)
            androidx.fragment.app.d r0 = r13.c
            androidx.fragment.app.b0 r0 = r0.a
            r0.c(r13)
            return
        L33b:
            java.lang.Object r0 = r13.L
            yc1 r0 = (defpackage.yc1) r0
            java.lang.Object r1 = r13.R
            mb0 r1 = (defpackage.mb0) r1
            java.lang.Object r13 = r13.B
            java.lang.Throwable r13 = (java.lang.Throwable) r13
            java.lang.Object r0 = r0.B
            gd1 r0 = (defpackage.gd1) r0
            r1.f(r0, r13)
            return
        L34f:
            java.lang.Object r0 = r13.B
            yc1 r0 = (defpackage.yc1) r0
            java.lang.Object r1 = r13.L
            mb0 r1 = (defpackage.mb0) r1
            java.lang.Object r13 = r13.R
            vl5 r13 = (defpackage.vl5) r13
            java.lang.Object r0 = r0.B
            gd1 r0 = (defpackage.gd1) r0
            gb0 r2 = r0.B
            boolean r2 = r2.r()
            if (r2 == 0) goto L372
            java.io.IOException r13 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r13.<init>(r2)
            r1.f(r0, r13)
            goto L375
        L372:
            r1.c(r0, r13)
        L375:
            return
        L376:
            java.lang.Object r0 = r13.B
            androidx.work.impl.WorkDatabase r0 = (androidx.work.impl.WorkDatabase) r0
            java.lang.Object r1 = r13.L
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r13 = r13.R
            lw7 r13 = (defpackage.lw7) r13
            dx7 r0 = r0.w()
            r0.getClass()
            r1.getClass()
            m16 r0 = r0.a
            c70 r4 = new c70
            r5 = 23
            r4.<init>(r1, r5)
            java.lang.Object r0 = defpackage.hv.Q(r0, r3, r2, r4)
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r0 = r0.iterator()
        L39f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3af
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            defpackage.lb4.o(r13, r1)
            goto L39f
        L3af:
            return
        L3b0:
            java.lang.Object r0 = r13.B
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r3 = r13.L
            fi4 r3 = (defpackage.fi4) r3
            java.lang.Object r13 = r13.R
            java.lang.String r13 = (java.lang.String) r13
            int r4 = r0.size()     // Catch: java.lang.IllegalArgumentException -> L3e3
        L3c0:
            if (r2 >= r4) goto L3d6
            java.lang.Object r5 = r0.get(r2)     // Catch: java.lang.IllegalArgumentException -> L3e3
            int r2 = r2 + 1
            r6 = r5
            cg0 r6 = (defpackage.cg0) r6     // Catch: java.lang.IllegalArgumentException -> L3e3
            java.lang.String r6 = r6.d()     // Catch: java.lang.IllegalArgumentException -> L3e3
            boolean r6 = defpackage.nb3.k(r6, r13)     // Catch: java.lang.IllegalArgumentException -> L3e3
            if (r6 == 0) goto L3c0
            r1 = r5
        L3d6:
            cg0 r1 = (defpackage.cg0) r1     // Catch: java.lang.IllegalArgumentException -> L3e3
            if (r1 == 0) goto L3e3
            qx3 r13 = r1.l()     // Catch: java.lang.IllegalArgumentException -> L3e3
            if (r13 == 0) goto L3e3
            r13.e(r3)     // Catch: java.lang.IllegalArgumentException -> L3e3
        L3e3:
            return
        L3e4:
            java.lang.Object r0 = r13.B
            be0 r0 = (defpackage.be0) r0
            java.lang.Object r1 = r13.L
            yk5 r1 = (defpackage.yk5) r1
            java.lang.Object r13 = r13.R
            d90 r13 = (defpackage.d90) r13
            int r1 = defpackage.ae0.b(r1)
            r0.c(r1, r13)
            return
        L3f8:
            java.lang.Object r0 = r13.B
            be0 r0 = (defpackage.be0) r0
            java.lang.Object r1 = r13.L
            yk5 r1 = (defpackage.yk5) r1
            java.lang.Object r13 = r13.R
            th r13 = (defpackage.th) r13
            int r1 = defpackage.ae0.b(r1)
            r0.b(r1, r13)
            return
        L40c:
            java.lang.Object r0 = r13.B
            me.magnum.melonds.ui.settings.fragments.BasePreferenceFragment r0 = (me.magnum.melonds.ui.settings.fragments.BasePreferenceFragment) r0
            java.lang.Object r1 = r13.L
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            java.lang.Object r13 = r13.R
            java.lang.String r13 = (java.lang.String) r13
            r0.i(r1, r13, r2)
            return
        L41c:
            java.lang.Object r0 = r13.B
            com.github.junrar.Archive r0 = (com.github.junrar.Archive) r0
            java.lang.Object r1 = r13.L
            com.github.junrar.rarfile.FileHeader r1 = (com.github.junrar.rarfile.FileHeader) r1
            java.lang.Object r13 = r13.R
            java.io.PipedOutputStream r13 = (java.io.PipedOutputStream) r13
            com.github.junrar.Archive.h(r0, r1, r13)
            return
        L42c:
            java.lang.Object r0 = r13.B
            hm r0 = (defpackage.hm) r0
            java.lang.Object r1 = r13.L
            fm r1 = (defpackage.fm) r1
            java.lang.Object r13 = r13.R
            gm r13 = (defpackage.gm) r13
            android.view.View r2 = r0.a
            je2 r4 = new je2
            r4.<init>(r1)
            android.view.ActionMode r1 = r2.startActionMode(r4, r3)
            android.view.ActionMode r0 = r0.h
            defpackage.nb3.k(r0, r1)
            if (r1 != 0) goto L44d
            r13.close()
        L44d:
            return
        L44e:
            java.lang.Object r0 = r13.B
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.Object r1 = r13.L
            w r1 = (defpackage.w) r1
            java.lang.Object r13 = r13.R
            java.util.List r13 = (java.util.List) r13
            if (r0 == 0) goto L462
            bi4 r13 = r1.b
            r13.onError(r0)
            goto L467
        L462:
            bi4 r0 = r1.b
            r0.u(r13)
        L467:
            return
    }
}

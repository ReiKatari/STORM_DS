package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vd  reason: default package */
/* loaded from: classes.dex */
public final class vd extends android.hardware.camera2.CameraDevice.StateCallback {
    public final java.lang.String a;
    public final defpackage.lg0 b;
    public final int c;
    public final long d;
    public final defpackage.yx6 e;
    public final defpackage.id0 f;
    public final defpackage.gd0 g;
    public final defpackage.nd0 h;
    public final defpackage.t57 i;
    public final defpackage.bx j;
    public final android.hardware.camera2.CameraDevice.StateCallback k;
    public final defpackage.u63 l;
    public final int m;
    public final java.lang.Object n;
    public boolean o;
    public defpackage.ud p;
    public boolean q;
    public final java.util.concurrent.CountDownLatch r;
    public final long s;
    public defpackage.g67 t;
    public final defpackage.tp6 u;

    public vd(java.lang.String r1, defpackage.lg0 r2, int r3, long r4, defpackage.yx6 r6, defpackage.id0 r7, defpackage.gd0 r8, defpackage.nd0 r9, defpackage.t57 r10, defpackage.bx r11, android.hardware.camera2.CameraDevice.StateCallback r12, defpackage.u63 r13) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r6.getClass()
            r7.getClass()
            r8.getClass()
            r9.getClass()
            r10.getClass()
            r11.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r6
            r0.f = r7
            r0.g = r8
            r0.h = r9
            r0.i = r10
            r0.j = r11
            r0.k = r12
            r0.l = r13
            uw r2 = defpackage.oq7.b
            r2.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r6 = defpackage.uw.b
            int r2 = r6.incrementAndGet(r2)
            r0.m = r2
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r0.n = r2
            java.util.concurrent.CountDownLatch r2 = new java.util.concurrent.CountDownLatch
            r6 = 1
            r2.<init>(r6)
            r0.r = r2
            di0 r2 = defpackage.di0.a
            tp6 r2 = defpackage.up6.a(r2)
            r0.u = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r7 = "Opening "
            r2.<init>(r7)
            java.lang.String r1 = defpackage.xf0.b(r1)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "CXCP"
            android.util.Log.i(r2, r1)
            if (r3 != r6) goto L71
            goto L75
        L71:
            long r4 = android.os.SystemClock.elapsedRealtimeNanos()
        L75:
            r0.s = r4
            return
    }

    public static boolean e(defpackage.nd0 r2, java.lang.String r3, defpackage.df0 r4) {
            r2.getClass()
            r3.getClass()
            ks6 r0 = r2.b
            r0.getClass()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 >= r1) goto L26
            kg0 r0 = defpackage.lg0.g
            ld0 r2 = r2.a
            lg0 r2 = r2.d(r3)
            r0.getClass()
            boolean r2 = defpackage.kg0.c(r2)
            if (r2 == 0) goto L26
            if (r4 != 0) goto L26
            r2 = 1
            return r2
        L26:
            r2 = 0
            return r2
    }

    public final void a() {
            r5 = this;
            tp6 r0 = r5.u
            java.lang.Object r0 = r0.getValue()
            oh0 r0 = (defpackage.oh0) r0
            boolean r1 = r0 instanceof defpackage.vh0
            r2 = 0
            if (r1 == 0) goto L12
            vh0 r0 = (defpackage.vh0) r0
            bf0 r0 = r0.a
            goto L13
        L12:
            r0 = r2
        L13:
            if (r0 == 0) goto L22
            java.lang.Class<android.hardware.camera2.CameraDevice> r1 = android.hardware.camera2.CameraDevice.class
            ar0 r1 = defpackage.gh5.a(r1)
            java.lang.Object r0 = r0.e(r1)
            android.hardware.camera2.CameraDevice r0 = (android.hardware.camera2.CameraDevice) r0
            goto L23
        L22:
            r0 = r2
        L23:
            ud r1 = new ud
            ds0 r3 = defpackage.ds0.APP_CLOSED
            r4 = 14
            r1.<init>(r3, r2, r2, r4)
            r5.b(r0, r1)
            return
    }

    public final void b(android.hardware.camera2.CameraDevice r11, defpackage.ud r12) {
            r10 = this;
            tp6 r0 = r10.u
            java.lang.Object r0 = r0.getValue()
            oh0 r0 = (defpackage.oh0) r0
            boolean r1 = r0 instanceof defpackage.vh0
            r2 = 0
            if (r1 == 0) goto L13
            vh0 r0 = (defpackage.vh0) r0
            bf0 r0 = r0.a
            r4 = r0
            goto L14
        L13:
            r4 = r2
        L14:
            java.lang.Object r1 = r10.n
            monitor-enter(r1)
            ud r0 = r10.p     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto L26
            r10.p = r12     // Catch: java.lang.Throwable -> L22
            boolean r0 = r10.o     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto L26
            goto L27
        L22:
            r0 = move-exception
            r10 = r0
            goto L98
        L26:
            r12 = r2
        L27:
            monitor-exit(r1)
            if (r12 == 0) goto L97
            df0 r0 = r12.c
            r1 = 0
            if (r0 == 0) goto L3e
            ds0 r3 = r12.a
            ds0 r5 = defpackage.ds0.CAMERA2_EXCEPTION
            if (r3 == r5) goto L3e
            id0 r3 = r10.f
            java.lang.String r5 = r10.a
            int r0 = r0.a
            r3.a(r5, r0, r1)
        L3e:
            tp6 r0 = r10.u
            uh0 r3 = new uh0
            df0 r5 = r12.c
            r3.<init>(r5)
            r0.getClass()
            r0.m(r2, r3)
            ds0 r0 = r12.a
            ds0 r3 = defpackage.ds0.CAMERA2_CLOSED
            if (r0 == r3) goto L8a
            nd0 r0 = r10.h
            java.lang.String r3 = r10.a
            df0 r5 = r12.c
            boolean r5 = e(r0, r3, r5)
            r6 = 1
            if (r5 == 0) goto L68
            boolean r0 = r0.a(r3)
            if (r0 == 0) goto L68
            r8 = r6
            goto L69
        L68:
            r8 = r1
        L69:
            if (r8 == 0) goto L76
            java.lang.Object r1 = r10.n
            monitor-enter(r1)
            r10.q = r6     // Catch: java.lang.Throwable -> L72
            monitor-exit(r1)
            goto L76
        L72:
            r0 = move-exception
            r10 = r0
            monitor-exit(r1)
            throw r10
        L76:
            gd0 r3 = r10.g
            bx r7 = r10.j
            nd0 r0 = r10.h
            java.lang.String r1 = r10.a
            df0 r5 = r12.c
            boolean r9 = e(r0, r1, r5)
            r6 = r10
            r5 = r11
            r3.b(r4, r5, r6, r7, r8, r9)
            goto L8b
        L8a:
            r6 = r10
        L8b:
            tp6 r10 = r6.u
            th0 r11 = r6.c(r12)
            r10.getClass()
            r10.m(r2, r11)
        L97:
            return
        L98:
            monitor-exit(r1)
            throw r10
    }

    public final defpackage.th0 c(defpackage.ud r22) {
            r21 = this;
            r0 = r21
            r1 = r22
            yx6 r2 = r0.e
            r2.getClass()
            long r2 = android.os.SystemClock.elapsedRealtimeNanos()
            g67 r4 = r0.t
            long r5 = r1.b
            r7 = 0
            if (r4 == 0) goto L20
            long r8 = r4.a
            long r10 = r0.d
            long r8 = r8 - r10
            sq1 r10 = new sq1
            r10.<init>(r8)
            r15 = r10
            goto L21
        L20:
            r15 = r7
        L21:
            if (r4 == 0) goto L30
            long r8 = r4.a
            long r10 = r0.s
            long r8 = r8 - r10
            sq1 r10 = new sq1
            r10.<init>(r8)
            r17 = r10
            goto L32
        L30:
            r17 = r7
        L32:
            if (r4 != 0) goto L37
            r18 = r7
            goto L42
        L37:
            long r7 = r4.a
            long r7 = r5 - r7
            sq1 r4 = new sq1
            r4.<init>(r7)
            r18 = r4
        L42:
            long r2 = r2 - r5
            ds0 r13 = r1.a
            int r4 = r0.c
            int r4 = r4 + (-1)
            df0 r5 = r1.c
            java.lang.Throwable r1 = r1.d
            th0 r11 = new th0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r4)
            sq1 r4 = new sq1
            r4.<init>(r2)
            java.lang.String r12 = r0.a
            r16 = r1
            r19 = r4
            r20 = r5
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r11
    }

    public final void d(android.hardware.camera2.CameraDevice r5) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r4.a
            java.lang.String r1 = defpackage.xf0.b(r1)
            r0.append(r1)
            java.lang.String r1 = "#onFinalized"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.os.Trace.beginSection(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r1 = ": onFinalized"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "CXCP"
            android.util.Log.d(r1, r0)
            ud r0 = new ud
            ds0 r1 = defpackage.ds0.CAMERA2_CLOSED
            r2 = 0
            r3 = 14
            r0.<init>(r1, r2, r2, r3)
            r4.b(r5, r0)
            android.hardware.camera2.CameraDevice$StateCallback r4 = r4.k
            if (r4 == 0) goto L44
            r4.onClosed(r5)
        L44:
            android.os.Trace.endSection()
            return
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(android.hardware.camera2.CameraDevice r4) {
            r3 = this;
            r4.getClass()
            java.lang.String r0 = r4.getId()
            java.lang.String r1 = r3.a
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L58
            java.lang.String r0 = "CXCP"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.a
            java.lang.String r2 = defpackage.xf0.b(r2)
            r1.append(r2)
            java.lang.String r2 = ": onClosed"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r0, r1)
            java.util.concurrent.CountDownLatch r0 = r3.r
            r0.countDown()
            java.lang.Object r0 = r3.n
            monitor-enter(r0)
            boolean r1 = r3.q     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L51
            java.lang.String r4 = "CXCP"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            r1.<init>()     // Catch: java.lang.Throwable -> L4f
            r1.append(r3)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r3 = "#onClosed: Delaying finalizing."
            r1.append(r3)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L4f
            android.util.Log.i(r4, r3)     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r0)
            return
        L4f:
            r3 = move-exception
            goto L56
        L51:
            monitor-exit(r0)
            r3.d(r4)
            return
        L56:
            monitor-exit(r0)
            throw r3
        L58:
            java.lang.String r3 = "Check failed."
            defpackage.i.m(r3)
            return
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(android.hardware.camera2.CameraDevice r6) {
            r5 = this;
            r6.getClass()
            java.lang.String r0 = r6.getId()
            java.lang.String r1 = r5.a
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L64
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = defpackage.xf0.b(r1)
            r0.append(r2)
            java.lang.String r2 = "#onDisconnected"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.os.Trace.beginSection(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = defpackage.xf0.b(r1)
            r0.append(r1)
            java.lang.String r1 = ": onDisconnected"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "CXCP"
            android.util.Log.d(r1, r0)
            java.util.concurrent.CountDownLatch r0 = r5.r
            r0.countDown()
            ud r0 = new ud
            ds0 r1 = defpackage.ds0.CAMERA2_DISCONNECTED
            df0 r2 = new df0
            r3 = 6
            r2.<init>(r3)
            r3 = 0
            r4 = 10
            r0.<init>(r1, r2, r3, r4)
            r5.b(r6, r0)
            android.hardware.camera2.CameraDevice$StateCallback r5 = r5.k
            if (r5 == 0) goto L60
            r5.onDisconnected(r6)
        L60:
            android.os.Trace.endSection()
            return
        L64:
            java.lang.String r5 = "Check failed."
            defpackage.i.m(r5)
            return
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(android.hardware.camera2.CameraDevice r6, int r7) {
            r5 = this;
            r6.getClass()
            java.lang.String r0 = r6.getId()
            java.lang.String r1 = r5.a
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L83
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = defpackage.xf0.b(r1)
            r0.append(r2)
            java.lang.String r2 = "#onError-"
            r0.append(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.os.Trace.beginSection(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = defpackage.xf0.b(r1)
            r0.append(r1)
            java.lang.String r1 = ": onError "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "CXCP"
            android.util.Log.d(r1, r0)
            java.util.concurrent.CountDownLatch r0 = r5.r
            r0.countDown()
            ud r0 = new ud
            ds0 r1 = defpackage.ds0.CAMERA2_ERROR
            r2 = 1
            if (r7 == r2) goto L6a
            r2 = 2
            if (r7 == r2) goto L6a
            r2 = 3
            if (r7 == r2) goto L6a
            r2 = 4
            if (r7 == r2) goto L6a
            r2 = 5
            if (r7 != r2) goto L60
            goto L6a
        L60:
            java.lang.String r5 = "Unexpected StateCallback error code: "
            java.lang.String r5 = defpackage.lb1.g(r7, r5)
            defpackage.i.h(r5)
            return
        L6a:
            df0 r3 = new df0
            r3.<init>(r2)
            r2 = 0
            r4 = 10
            r0.<init>(r1, r3, r2, r4)
            r5.b(r6, r0)
            android.hardware.camera2.CameraDevice$StateCallback r5 = r5.k
            if (r5 == 0) goto L7f
            r5.onError(r6, r7)
        L7f:
            android.os.Trace.endSection()
            return
        L83:
            java.lang.String r5 = "Check failed."
            defpackage.i.m(r5)
            return
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(android.hardware.camera2.CameraDevice r14) {
            r13 = this;
            r14.getClass()
            java.lang.String r0 = r14.getId()
            java.lang.String r1 = r13.a
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L1be
            yx6 r0 = r13.e
            r0.getClass()
            long r0 = android.os.SystemClock.elapsedRealtimeNanos()
            g67 r2 = new g67
            r2.<init>(r0)
            r13.t = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = r13.a
            java.lang.String r4 = defpackage.xf0.b(r4)
            r2.append(r4)
            java.lang.String r4 = "#onOpened"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            android.os.Trace.beginSection(r2)
            java.lang.String r2 = "CXCP"
            long r4 = r13.s
            long r4 = r0 - r4
            long r6 = r13.d
            long r0 = r0 - r6
            int r6 = r13.c
            java.lang.String r7 = r13.a
            r8 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            r10 = 1
            r11 = 0
            if (r6 != r10) goto L73
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Opened "
            r0.<init>(r1)
            java.lang.String r1 = defpackage.xf0.b(r7)
            r0.append(r1)
            java.lang.String r1 = " in "
            r0.append(r1)
            java.lang.String r1 = "%.3f ms"
            double r4 = (double) r4
            double r4 = r4 / r8
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r0 = defpackage.i61.p(r4, r10, r11, r1, r0)
            goto Lc6
        L73:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r12 = "Opened "
            r6.<init>(r12)
            java.lang.String r7 = defpackage.xf0.b(r7)
            r6.append(r7)
            java.lang.String r7 = " in "
            r6.append(r7)
            java.lang.String r7 = "%.3f ms"
            double r4 = (double) r4
            double r4 = r4 / r8
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r10)
            java.lang.String r4 = java.lang.String.format(r11, r7, r4)
            r6.append(r4)
            java.lang.String r4 = " ("
            r6.append(r4)
            java.lang.String r4 = "%.3f ms"
            double r0 = (double) r0
            double r0 = r0 / r8
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r10)
            java.lang.String r0 = java.lang.String.format(r11, r4, r0)
            r6.append(r0)
            java.lang.String r0 = " total) after "
            r6.append(r0)
            int r0 = r13.c
            java.lang.String r1 = " attempts."
            java.lang.String r0 = defpackage.lb1.o(r6, r0, r1)
        Lc6:
            android.util.Log.i(r2, r0)
            java.lang.Object r1 = r13.n
            monitor-enter(r1)
            ud r0 = r13.p     // Catch: java.lang.Throwable -> Ld3
            if (r0 != 0) goto Ld6
            r13.o = r10     // Catch: java.lang.Throwable -> Ld3
            goto Ld6
        Ld3:
            r0 = move-exception
            goto L1bc
        Ld6:
            monitor-exit(r1)
            android.hardware.camera2.CameraDevice$StateCallback r1 = r13.k
            if (r1 == 0) goto Lde
            r1.onOpened(r14)
        Lde:
            r1 = 0
            if (r0 == 0) goto L10d
            gd0 r4 = r13.g
            r5 = r4
            bx r4 = r13.j
            nd0 r6 = r13.h
            java.lang.String r7 = r13.a
            df0 r8 = r0.c
            boolean r8 = e(r6, r7, r8)
            if (r8 == 0) goto Lf9
            boolean r6 = r6.a(r7)
            if (r6 == 0) goto Lf9
            goto Lfa
        Lf9:
            r10 = r1
        Lfa:
            nd0 r1 = r13.h
            java.lang.String r6 = r13.a
            df0 r0 = r0.c
            boolean r6 = e(r1, r6, r0)
            r1 = 0
            r3 = r13
            r2 = r14
            r0 = r5
            r5 = r10
            r0.b(r1, r2, r3, r4, r5, r6)
            return
        L10d:
            rd r2 = new rd
            lg0 r3 = r13.b
            java.lang.String r5 = r13.a
            id0 r6 = r13.f
            u63 r7 = r13.l
            t57 r8 = r13.i
            r4 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8)
            bx r3 = r13.j
            r3.getClass()
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 30
            if (r4 >= r5) goto L129
            goto L157
        L129:
            java.lang.Object r4 = r3.c
            monitor-enter(r4)
            java.util.concurrent.CopyOnWriteArrayList r5 = r3.e     // Catch: java.lang.Throwable -> L154
            r5.add(r2)     // Catch: java.lang.Throwable -> L154
            cx r5 = r3.a()     // Catch: java.lang.Throwable -> L154
            if (r5 == 0) goto L156
            d51 r6 = r3.b     // Catch: java.lang.Throwable -> L154
            o41 r3 = r3.a     // Catch: java.lang.Throwable -> L154
            m5 r7 = new m5     // Catch: java.lang.Throwable -> L154
            r8 = 2
            r7.<init>(r2, r5, r11, r8)     // Catch: java.lang.Throwable -> L154
            r6.getClass()     // Catch: java.lang.Throwable -> L154
            r3.getClass()     // Catch: java.lang.Throwable -> L154
            a71 r5 = defpackage.a71.UNDISPATCHED     // Catch: java.lang.Throwable -> L154
            l5 r8 = new l5     // Catch: java.lang.Throwable -> L154
            r9 = 21
            r8.<init>(r6, r7, r11, r9)     // Catch: java.lang.Throwable -> L154
            defpackage.hv.L(r3, r11, r5, r8, r10)     // Catch: java.lang.Throwable -> L154
            goto L156
        L154:
            r0 = move-exception
            goto L1ba
        L156:
            monitor-exit(r4)
        L157:
            tp6 r3 = r13.u
            vh0 r4 = new vh0
            r4.<init>(r2)
            r3.getClass()
            r3.m(r11, r4)
            java.lang.Object r3 = r13.n
            monitor-enter(r3)
            r13.o = r1     // Catch: java.lang.Throwable -> L1b7
            ud r7 = r13.p     // Catch: java.lang.Throwable -> L1b7
            monitor-exit(r3)
            if (r7 == 0) goto L1b3
            tp6 r3 = r13.u
            uh0 r4 = new uh0
            df0 r5 = r7.c
            r4.<init>(r5)
            r3.getClass()
            r3.m(r11, r4)
            gd0 r3 = r13.g
            bx r4 = r13.j
            nd0 r5 = r13.h
            java.lang.String r6 = r13.a
            df0 r8 = r7.c
            boolean r8 = e(r5, r6, r8)
            if (r8 == 0) goto L195
            boolean r5 = r5.a(r6)
            if (r5 == 0) goto L195
            r5 = r10
            goto L196
        L195:
            r5 = r1
        L196:
            nd0 r1 = r13.h
            java.lang.String r6 = r13.a
            df0 r8 = r7.c
            boolean r6 = e(r1, r6, r8)
            r1 = r2
            r0 = r3
            r3 = r13
            r2 = r14
            r0.b(r1, r2, r3, r4, r5, r6)
            tp6 r0 = r13.u
            th0 r1 = r13.c(r7)
            r0.getClass()
            r0.m(r11, r1)
        L1b3:
            android.os.Trace.endSection()
            return
        L1b7:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L1ba:
            monitor-exit(r4)
            throw r0
        L1bc:
            monitor-exit(r1)
            throw r0
        L1be:
            java.lang.String r0 = "Check failed."
            defpackage.i.m(r0)
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CameraState-"
            r0.<init>(r1)
            int r2 = r2.m
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}

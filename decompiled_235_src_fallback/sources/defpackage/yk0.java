package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yk0  reason: default package */
/* loaded from: classes.dex */
public final class yk0 implements defpackage.le0 {
    public final defpackage.gt2 a;
    public final defpackage.sk0 b;
    public final defpackage.s9 c;
    public final defpackage.oi0 d;
    public final defpackage.yx6 e;
    public final defpackage.mf0 f;
    public final defpackage.jr6 g;
    public final defpackage.t57 h;
    public final defpackage.w61 i;
    public final int j;
    public final java.lang.Object k;
    public final defpackage.xw l;
    public final java.util.Map m;
    public final java.util.Map n;
    public defpackage.g67 o;
    public final defpackage.s35 p;
    public defpackage.bf0 q;
    public defpackage.tk0 r;
    public java.util.Map s;
    public java.util.LinkedHashMap t;
    public defpackage.uk0 u;
    public final java.util.concurrent.CountDownLatch v;
    public boolean w;
    public final java.util.concurrent.CountDownLatch x;
    public java.util.Map y;
    public final java.util.LinkedHashMap z;

    public yk0(defpackage.gt2 r1, defpackage.sk0 r2, defpackage.s9 r3, defpackage.oi0 r4, defpackage.yx6 r5, defpackage.mf0 r6, defpackage.nc1 r7, defpackage.jr6 r8, defpackage.ks6 r9, defpackage.t57 r10, defpackage.w61 r11) {
            r0 = this;
            r2.getClass()
            r4.getClass()
            r5.getClass()
            r6.getClass()
            r9.getClass()
            r10.getClass()
            r11.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r8
            r0.h = r10
            r0.i = r11
            uw r1 = defpackage.zk0.a
            r1.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = defpackage.uw.b
            int r1 = r2.incrementAndGet(r1)
            r0.j = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.k = r1
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            xw r1 = defpackage.g04.u(r1)
            r0.l = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Map r1 = java.util.Collections.synchronizedMap(r1)
            r0.m = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Map r1 = java.util.Collections.synchronizedMap(r1)
            r0.n = r1
            if (r7 == 0) goto L6f
            s35 r1 = new s35
            r7.getClass()
            r1.<init>()
            xc6 r2 = defpackage.xc6.PENDING
            xw r2 = defpackage.g04.u(r2)
            r1.A = r2
            goto L70
        L6f:
            r1 = 0
        L70:
            r0.p = r1
            uk0 r1 = defpackage.uk0.PENDING
            r0.u = r1
            java.util.concurrent.CountDownLatch r1 = new java.util.concurrent.CountDownLatch
            r2 = 1
            r1.<init>(r2)
            r0.v = r1
            java.util.concurrent.CountDownLatch r1 = new java.util.concurrent.CountDownLatch
            r1.<init>(r2)
            r0.x = r1
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r0.z = r1
            return
    }

    public static final java.lang.Object i(defpackage.yk0 r12, defpackage.s41 r13) {
            r12.getClass()
            java.lang.String r0 = "Warning: "
            java.lang.String r1 = "Created "
            java.lang.String r2 = "Unexpected state: "
            boolean r3 = r13 instanceof defpackage.xk0
            if (r3 == 0) goto L1c
            r3 = r13
            xk0 r3 = (defpackage.xk0) r3
            int r4 = r3.d0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1c
            int r4 = r4 - r5
            r3.d0 = r4
            goto L21
        L1c:
            xk0 r3 = new xk0
            r3.<init>(r12, r13)
        L21:
            java.lang.Object r13 = r3.Y
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r3.d0
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L3b
            if (r5 != r6) goto L35
            dh5 r4 = r3.X
            dh5 r3 = r3.R
            defpackage.oi2.Y(r13)
            goto L99
        L35:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r12)
            return r7
        L3b:
            defpackage.oi2.Y(r13)
            dh5 r13 = new dh5
            r13.<init>()
            dh5 r5 = new dh5
            r5.<init>()
            java.lang.Object r8 = r12.k
            monitor-enter(r8)
            uk0 r9 = r12.u     // Catch: java.lang.Throwable -> L55
            uk0 r10 = defpackage.uk0.PENDING     // Catch: java.lang.Throwable -> L55
            if (r9 == r10) goto L58
            jg7 r12 = defpackage.jg7.a     // Catch: java.lang.Throwable -> L55
            monitor-exit(r8)
            return r12
        L55:
            r12 = move-exception
            goto L22b
        L58:
            java.util.Map r9 = r12.y     // Catch: java.lang.Throwable -> L55
            r13.A = r9     // Catch: java.lang.Throwable -> L55
            bf0 r9 = r12.q     // Catch: java.lang.Throwable -> L55
            r5.A = r9     // Catch: java.lang.Throwable -> L55
            java.lang.Object r10 = r13.A     // Catch: java.lang.Throwable -> L55
            if (r10 == 0) goto L227
            if (r9 != 0) goto L68
            goto L227
        L68:
            uk0 r9 = defpackage.uk0.CREATING     // Catch: java.lang.Throwable -> L55
            r12.u = r9     // Catch: java.lang.Throwable -> L55
            r12.w = r6     // Catch: java.lang.Throwable -> L55
            yx6 r9 = r12.e     // Catch: java.lang.Throwable -> L55
            r9.getClass()     // Catch: java.lang.Throwable -> L55
            long r9 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Throwable -> L55
            g67 r11 = new g67     // Catch: java.lang.Throwable -> L55
            r11.<init>(r9)     // Catch: java.lang.Throwable -> L55
            r12.o = r11     // Catch: java.lang.Throwable -> L55
            monitor-exit(r8)
            s35 r8 = r12.p
            if (r8 == 0) goto L9b
            java.lang.String r9 = "CXCP"
            java.lang.String r10 = "Awaiting session lock"
            android.util.Log.d(r9, r10)
            r3.R = r13
            r3.X = r5
            r3.d0 = r6
            java.lang.Object r3 = r8.o(r3)
            if (r3 != r4) goto L97
            return r4
        L97:
            r3 = r13
            r4 = r5
        L99:
            r13 = r3
            r5 = r4
        L9b:
            java.lang.String r3 = "CXCP"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "Creating CameraCaptureSession from "
            r4.<init>(r6)
            java.lang.Object r6 = r5.A
            bf0 r6 = (defpackage.bf0) r6
            if (r6 == 0) goto Laf
            java.lang.String r6 = r6.h()
            goto Lb0
        Laf:
            r6 = r7
        Lb0:
            if (r6 != 0) goto Lb5
            java.lang.String r6 = "null"
            goto Lb9
        Lb5:
            java.lang.String r6 = defpackage.xf0.b(r6)
        Lb9:
            r4.append(r6)
            java.lang.String r6 = " using "
            r4.append(r6)
            r4.append(r12)
            java.lang.String r6 = " with "
            r4.append(r6)
            java.lang.Object r6 = r13.A
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            android.util.Log.i(r3, r4)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "CameraDevice-"
            r3.<init>(r4)
            java.lang.Object r4 = r5.A
            bf0 r4 = (defpackage.bf0) r4
            if (r4 == 0) goto Le7
            java.lang.String r4 = r4.h()
            goto Le8
        Le7:
            r4 = r7
        Le8:
            java.lang.String r6 = "#createCaptureSession"
            java.lang.String r3 = defpackage.i61.n(r3, r4, r6)
            android.os.Trace.beginSection(r3)     // Catch: java.lang.Throwable -> L222
            sk0 r3 = r12.b     // Catch: java.lang.Throwable -> L222
            java.lang.Object r4 = r5.A     // Catch: java.lang.Throwable -> L222
            r4.getClass()     // Catch: java.lang.Throwable -> L222
            bf0 r4 = (defpackage.bf0) r4     // Catch: java.lang.Throwable -> L222
            java.lang.Object r5 = r13.A     // Catch: java.lang.Throwable -> L222
            r5.getClass()     // Catch: java.lang.Throwable -> L222
            java.util.Map r5 = (java.util.Map) r5     // Catch: java.lang.Throwable -> L222
            rk0 r3 = r3.a(r4, r5, r12)     // Catch: java.lang.Throwable -> L222
            android.os.Trace.endSection()
            boolean r4 = r3 instanceof defpackage.qk0
            if (r4 != 0) goto L127
            java.lang.String r13 = "CXCP"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to create capture session for "
            r0.<init>(r1)
            r0.append(r12)
            r12 = 33
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            android.util.Log.e(r13, r12)
            jg7 r12 = defpackage.jg7.a
            return r12
        L127:
            java.lang.Object r4 = r12.k
            monitor-enter(r4)
            uk0 r5 = r12.u     // Catch: java.lang.Throwable -> L1cc
            uk0 r6 = defpackage.uk0.CLOSING     // Catch: java.lang.Throwable -> L1cc
            if (r5 == r6) goto L1fc
            uk0 r6 = defpackage.uk0.CLOSED     // Catch: java.lang.Throwable -> L1cc
            if (r5 != r6) goto L136
            goto L1fc
        L136:
            uk0 r0 = defpackage.uk0.CREATING     // Catch: java.lang.Throwable -> L1cc
            if (r5 != r0) goto L1e4
            uk0 r0 = defpackage.uk0.CREATED     // Catch: java.lang.Throwable -> L1cc
            r12.u = r0     // Catch: java.lang.Throwable -> L1cc
            java.util.Map r0 = r12.m     // Catch: java.lang.Throwable -> L1cc
            java.lang.Object r2 = r13.A     // Catch: java.lang.Throwable -> L1cc
            r2.getClass()     // Catch: java.lang.Throwable -> L1cc
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Throwable -> L1cc
            r0.putAll(r2)     // Catch: java.lang.Throwable -> L1cc
            java.util.Map r0 = r12.n     // Catch: java.lang.Throwable -> L1cc
            r2 = r3
            qk0 r2 = (defpackage.qk0) r2     // Catch: java.lang.Throwable -> L1cc
            java.util.Map r2 = r2.B     // Catch: java.lang.Throwable -> L1cc
            r0.putAll(r2)     // Catch: java.lang.Throwable -> L1cc
            qk0 r3 = (defpackage.qk0) r3     // Catch: java.lang.Throwable -> L1cc
            java.util.Map r0 = r3.A     // Catch: java.lang.Throwable -> L1cc
            boolean r2 = r0.isEmpty()     // Catch: java.lang.Throwable -> L1cc
            if (r2 != 0) goto L1dd
            java.lang.String r2 = "CXCP"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1cc
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L1cc
            r3.append(r12)     // Catch: java.lang.Throwable -> L1cc
            java.lang.String r1 = " with "
            r3.append(r1)     // Catch: java.lang.Throwable -> L1cc
            java.lang.Object r13 = r13.A     // Catch: java.lang.Throwable -> L1cc
            java.util.Map r13 = (java.util.Map) r13     // Catch: java.lang.Throwable -> L1cc
            java.util.Set r13 = r13.keySet()     // Catch: java.lang.Throwable -> L1cc
            java.lang.Iterable r13 = (java.lang.Iterable) r13     // Catch: java.lang.Throwable -> L1cc
            java.util.List r13 = defpackage.gt0.k1(r13)     // Catch: java.lang.Throwable -> L1cc
            r3.append(r13)     // Catch: java.lang.Throwable -> L1cc
            java.lang.String r13 = ". Waiting to finalize "
            r3.append(r13)     // Catch: java.lang.Throwable -> L1cc
            java.util.Set r13 = r0.keySet()     // Catch: java.lang.Throwable -> L1cc
            java.lang.Iterable r13 = (java.lang.Iterable) r13     // Catch: java.lang.Throwable -> L1cc
            java.util.List r13 = defpackage.gt0.k1(r13)     // Catch: java.lang.Throwable -> L1cc
            r3.append(r13)     // Catch: java.lang.Throwable -> L1cc
            java.lang.String r13 = r3.toString()     // Catch: java.lang.Throwable -> L1cc
            android.util.Log.i(r2, r13)     // Catch: java.lang.Throwable -> L1cc
            r12.s = r0     // Catch: java.lang.Throwable -> L1cc
            java.util.Map r13 = r12.y     // Catch: java.lang.Throwable -> L1cc
            if (r13 == 0) goto L1ce
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L1cc
            r1.<init>()     // Catch: java.lang.Throwable -> L1cc
            java.util.Set r13 = r13.entrySet()     // Catch: java.lang.Throwable -> L1cc
            java.util.Iterator r13 = r13.iterator()     // Catch: java.lang.Throwable -> L1cc
        L1aa:
            boolean r2 = r13.hasNext()     // Catch: java.lang.Throwable -> L1cc
            if (r2 == 0) goto L1cf
            java.lang.Object r2 = r13.next()     // Catch: java.lang.Throwable -> L1cc
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L1cc
            java.lang.Object r3 = r2.getKey()     // Catch: java.lang.Throwable -> L1cc
            boolean r3 = r0.containsKey(r3)     // Catch: java.lang.Throwable -> L1cc
            if (r3 == 0) goto L1aa
            java.lang.Object r3 = r2.getKey()     // Catch: java.lang.Throwable -> L1cc
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L1cc
            r1.put(r3, r2)     // Catch: java.lang.Throwable -> L1cc
            goto L1aa
        L1cc:
            r12 = move-exception
            goto L220
        L1ce:
            r1 = r7
        L1cf:
            if (r1 == 0) goto L1dd
            int r13 = r1.size()     // Catch: java.lang.Throwable -> L1cc
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L1cc
            if (r13 != r0) goto L1dd
            r12.t = r1     // Catch: java.lang.Throwable -> L1cc
        L1dd:
            monitor-exit(r4)
            r12.j(r7)
            jg7 r12 = defpackage.jg7.a
            return r12
        L1e4:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1cc
            r13.<init>(r2)     // Catch: java.lang.Throwable -> L1cc
            uk0 r12 = r12.u     // Catch: java.lang.Throwable -> L1cc
            r13.append(r12)     // Catch: java.lang.Throwable -> L1cc
            java.lang.String r12 = r13.toString()     // Catch: java.lang.Throwable -> L1cc
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1cc
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L1cc
            r13.<init>(r12)     // Catch: java.lang.Throwable -> L1cc
            throw r13     // Catch: java.lang.Throwable -> L1cc
        L1fc:
            java.lang.String r13 = "CXCP"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1cc
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L1cc
            r1.append(r12)     // Catch: java.lang.Throwable -> L1cc
            java.lang.String r0 = " was "
            r1.append(r0)     // Catch: java.lang.Throwable -> L1cc
            uk0 r12 = r12.u     // Catch: java.lang.Throwable -> L1cc
            r1.append(r12)     // Catch: java.lang.Throwable -> L1cc
            java.lang.String r12 = " while configuration was in progress."
            r1.append(r12)     // Catch: java.lang.Throwable -> L1cc
            java.lang.String r12 = r1.toString()     // Catch: java.lang.Throwable -> L1cc
            android.util.Log.i(r13, r12)     // Catch: java.lang.Throwable -> L1cc
            jg7 r12 = defpackage.jg7.a     // Catch: java.lang.Throwable -> L1cc
            monitor-exit(r4)
            return r12
        L220:
            monitor-exit(r4)
            throw r12
        L222:
            r12 = move-exception
            android.os.Trace.endSection()
            throw r12
        L227:
            jg7 r12 = defpackage.jg7.a     // Catch: java.lang.Throwable -> L55
            monitor-exit(r8)
            return r12
        L22b:
            monitor-exit(r8)
            throw r12
    }

    @Override // defpackage.zc6
    public final void a() {
            r3 = this;
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            xw r2 = r3.l
            boolean r0 = r2.a(r0, r1)
            if (r0 == 0) goto L41
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r1 = " session finalizing"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "CXCP"
            android.util.Log.d(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r1 = "#onSessionFinalized"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.os.Trace.beginSection(r0)
            r3.o()
            r0 = 0
            r3.n(r0)
            android.os.Trace.endSection()
        L41:
            return
    }

    @Override // defpackage.zc6
    public final void b() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r1 = " session disconnecting"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "CXCP"
            android.util.Log.d(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r1 = "#onSessionDisconnected"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.os.Trace.beginSection(r0)
            r2.l()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r1 = "#onSessionDisconnected Await"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L4d
            java.util.concurrent.CountDownLatch r2 = r2.v     // Catch: java.lang.Throwable -> L4d
            r2.await()     // Catch: java.lang.Throwable -> L4d
            android.os.Trace.endSection()
            android.os.Trace.endSection()
            return
        L4d:
            r2 = move-exception
            android.os.Trace.endSection()
            throw r2
    }

    @Override // defpackage.le0
    public final void c(defpackage.me0 r1) {
            r0 = this;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " Active"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "CXCP"
            android.util.Log.d(r1, r0)
            return
    }

    @Override // defpackage.le0
    public final void d(defpackage.me0 r2) {
            r1 = this;
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r0 = " Closed"
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "CXCP"
            android.util.Log.d(r0, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r0 = "#onClosed"
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            android.os.Trace.beginSection(r2)
            r1.o()
            java.util.concurrent.CountDownLatch r2 = r1.x
            r2.countDown()
            s35 r1 = r1.p
            if (r1 == 0) goto L39
            r1.B()
        L39:
            android.os.Trace.endSection()
            return
    }

    @Override // defpackage.le0
    public final void e(defpackage.me0 r1) {
            r0 = this;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " Ready"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "CXCP"
            android.util.Log.d(r1, r0)
            return
    }

    @Override // defpackage.le0
    public final void f(defpackage.me0 r1) {
            r0 = this;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " CaptureQueueEmpty"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "CXCP"
            android.util.Log.d(r1, r0)
            return
    }

    @Override // defpackage.le0
    public final void g(defpackage.me0 r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r1 = " Configured"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "CXCP"
            android.util.Log.d(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r1 = "#configure"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.os.Trace.beginSection(r0)
            r2.j(r3)
            java.util.concurrent.CountDownLatch r3 = r2.x
            r3.countDown()
            s35 r2 = r2.p
            if (r2 == 0) goto L39
            r2.B()
        L39:
            android.os.Trace.endSection()
            return
    }

    @Override // defpackage.le0
    public final void h(defpackage.me0 r3) {
            r2 = this;
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r0 = " Configuration Failed"
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "CXCP"
            android.util.Log.w(r0, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r0 = "#onConfigureFailed"
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            android.os.Trace.beginSection(r3)
            kt2 r3 = new kt2
            r0 = 9
            r1 = 0
            r3.<init>(r0, r1)
            gt2 r0 = r2.a
            r0.a(r3)
            r2.o()
            java.util.concurrent.CountDownLatch r3 = r2.x
            r3.countDown()
            s35 r2 = r2.p
            if (r2 == 0) goto L46
            r2.B()
        L46:
            android.os.Trace.endSection()
            return
    }

    public final void j(defpackage.me0 r10) {
            r9 = this;
            java.lang.String r0 = "Configured "
            java.lang.Object r1 = r9.k
            monitor-enter(r1)
            tk0 r2 = r9.r     // Catch: java.lang.Throwable -> L29
            if (r2 != 0) goto L2c
            if (r10 == 0) goto L2c
            s9 r2 = r9.c     // Catch: java.lang.Throwable -> L29
            java.util.Map r3 = r9.m     // Catch: java.lang.Throwable -> L29
            r3.getClass()     // Catch: java.lang.Throwable -> L29
            java.util.Map r4 = r9.n     // Catch: java.lang.Throwable -> L29
            r4.getClass()     // Catch: java.lang.Throwable -> L29
            xc0 r2 = r2.q(r10, r3, r4)     // Catch: java.lang.Throwable -> L29
            tk0 r3 = new tk0     // Catch: java.lang.Throwable -> L29
            dk0 r4 = new dk0     // Catch: java.lang.Throwable -> L29
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L29
            r3.<init>(r10, r4, r2)     // Catch: java.lang.Throwable -> L29
            r9.r = r3     // Catch: java.lang.Throwable -> L29
            r2 = r3
            goto L2c
        L29:
            r9 = move-exception
            goto L9d
        L2c:
            uk0 r10 = r9.u     // Catch: java.lang.Throwable -> L29
            uk0 r3 = defpackage.uk0.CREATED     // Catch: java.lang.Throwable -> L29
            if (r10 != r3) goto L9b
            if (r2 != 0) goto L35
            goto L9b
        L35:
            java.util.Map r10 = r9.s     // Catch: java.lang.Throwable -> L29
            r3 = 1
            r4 = 0
            if (r10 == 0) goto L41
            java.util.LinkedHashMap r10 = r9.t     // Catch: java.lang.Throwable -> L29
            if (r10 == 0) goto L41
            r10 = r3
            goto L42
        L41:
            r10 = r4
        L42:
            monitor-exit(r1)
            if (r10 == 0) goto L48
            r9.m(r4)
        L48:
            java.lang.Object r10 = r9.k
            monitor-enter(r10)
            java.lang.String r1 = "CXCP"
            yx6 r4 = r9.e     // Catch: java.lang.Throwable -> L98
            r4.getClass()     // Catch: java.lang.Throwable -> L98
            long r4 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Throwable -> L98
            g67 r6 = r9.o     // Catch: java.lang.Throwable -> L98
            r6.getClass()     // Catch: java.lang.Throwable -> L98
            long r6 = r6.a     // Catch: java.lang.Throwable -> L98
            long r4 = r4 - r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L98
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L98
            r6.append(r9)     // Catch: java.lang.Throwable -> L98
            java.lang.String r0 = " in "
            r6.append(r0)     // Catch: java.lang.Throwable -> L98
            java.lang.String r0 = "%.3f ms"
            double r4 = (double) r4     // Catch: java.lang.Throwable -> L98
            r7 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r4 = r4 / r7
            java.lang.Double r4 = java.lang.Double.valueOf(r4)     // Catch: java.lang.Throwable -> L98
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L98
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r4, r3)     // Catch: java.lang.Throwable -> L98
            r4 = 0
            java.lang.String r0 = java.lang.String.format(r4, r0, r3)     // Catch: java.lang.Throwable -> L98
            r6.append(r0)     // Catch: java.lang.Throwable -> L98
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L98
            android.util.Log.i(r1, r0)     // Catch: java.lang.Throwable -> L98
            gt2 r9 = r9.a     // Catch: java.lang.Throwable -> L98
            dk0 r0 = r2.b     // Catch: java.lang.Throwable -> L98
            r9.b(r0)     // Catch: java.lang.Throwable -> L98
            monitor-exit(r10)
            return
        L98:
            r9 = move-exception
            monitor-exit(r10)
            throw r9
        L9b:
            monitor-exit(r1)
            return
        L9d:
            monitor-exit(r1)
            throw r9
    }

    public final void k(java.util.Map r8) {
            r7 = this;
            r8.getClass()
            java.lang.Object r0 = r7.k
            monitor-enter(r0)
            uk0 r1 = r7.u     // Catch: java.lang.Throwable -> L18
            uk0 r2 = defpackage.uk0.CLOSING     // Catch: java.lang.Throwable -> L18
            if (r1 == r2) goto L7a
            uk0 r2 = defpackage.uk0.CLOSED     // Catch: java.lang.Throwable -> L18
            if (r1 != r2) goto L11
            goto L7a
        L11:
            java.util.Map r1 = r7.y     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1a
            zt1 r1 = defpackage.zt1.A     // Catch: java.lang.Throwable -> L18
            goto L1a
        L18:
            r7 = move-exception
            goto L7c
        L1a:
            r7.p(r1, r8)     // Catch: java.lang.Throwable -> L18
            r7.y = r8     // Catch: java.lang.Throwable -> L18
            java.util.Map r1 = r7.s     // Catch: java.lang.Throwable -> L18
            r2 = 3
            r3 = 0
            if (r1 == 0) goto L6f
            java.util.LinkedHashMap r4 = r7.t     // Catch: java.lang.Throwable -> L18
            if (r4 != 0) goto L6f
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L18
            r4.<init>()     // Catch: java.lang.Throwable -> L18
            java.util.Set r8 = r8.entrySet()     // Catch: java.lang.Throwable -> L18
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L18
        L36:
            boolean r5 = r8.hasNext()     // Catch: java.lang.Throwable -> L18
            if (r5 == 0) goto L58
            java.lang.Object r5 = r8.next()     // Catch: java.lang.Throwable -> L18
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Throwable -> L18
            java.lang.Object r6 = r5.getKey()     // Catch: java.lang.Throwable -> L18
            boolean r6 = r1.containsKey(r6)     // Catch: java.lang.Throwable -> L18
            if (r6 == 0) goto L36
            java.lang.Object r6 = r5.getKey()     // Catch: java.lang.Throwable -> L18
            java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Throwable -> L18
            r4.put(r6, r5)     // Catch: java.lang.Throwable -> L18
            goto L36
        L58:
            int r8 = r4.size()     // Catch: java.lang.Throwable -> L18
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L18
            if (r8 != r1) goto L6f
            r7.t = r4     // Catch: java.lang.Throwable -> L18
            w61 r8 = r7.i     // Catch: java.lang.Throwable -> L18
            y3 r1 = new y3     // Catch: java.lang.Throwable -> L18
            r4 = 5
            r1.<init>(r7, r3, r4)     // Catch: java.lang.Throwable -> L18
            defpackage.hv.L(r8, r3, r3, r1, r2)     // Catch: java.lang.Throwable -> L18
        L6f:
            w61 r8 = r7.i     // Catch: java.lang.Throwable -> L18
            vk0 r1 = new vk0     // Catch: java.lang.Throwable -> L18
            r4 = 1
            r1.<init>(r7, r3, r4)     // Catch: java.lang.Throwable -> L18
            defpackage.hv.L(r8, r3, r3, r1, r2)     // Catch: java.lang.Throwable -> L18
        L7a:
            monitor-exit(r0)
            return
        L7c:
            monitor-exit(r0)
            throw r7
    }

    public final void l() {
            r9 = this;
            java.lang.Object r0 = r9.k
            monitor-enter(r0)
            uk0 r1 = r9.u     // Catch: java.lang.Throwable -> L1b
            uk0 r2 = defpackage.uk0.CLOSING     // Catch: java.lang.Throwable -> L1b
            if (r1 == r2) goto L186
            uk0 r3 = defpackage.uk0.CLOSED     // Catch: java.lang.Throwable -> L1b
            if (r1 != r3) goto Lf
            goto L186
        Lf:
            r9.u = r2     // Catch: java.lang.Throwable -> L1b
            tk0 r1 = r9.r     // Catch: java.lang.Throwable -> L1b
            r2 = 1
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L1e
            r9.r = r3     // Catch: java.lang.Throwable -> L1b
            goto L2a
        L1b:
            r9 = move-exception
            goto L188
        L1e:
            mf0 r1 = r9.f     // Catch: java.lang.Throwable -> L1b
            boolean r1 = r1.d     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L29
            boolean r1 = r9.w     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L29
            r4 = r2
        L29:
            r1 = r3
        L2a:
            monitor-exit(r0)
            s35 r0 = r9.p
            if (r0 == 0) goto L32
            r0.B()
        L32:
            r5 = 3000(0xbb8, double:1.482E-320)
            if (r4 == 0) goto L5f
            java.lang.String r0 = "CXCP"
            java.lang.String r1 = "Waiting for CameraCaptureSession configuration"
            android.util.Log.d(r0, r1)
            t57 r0 = r9.h
            zh0 r1 = new zh0
            r1.<init>(r9, r3, r2)
            java.lang.Object r0 = r0.b(r5, r1)
            jg7 r0 = (defpackage.jg7) r0
            if (r0 != 0) goto L53
            java.lang.String r0 = "CXCP"
            java.lang.String r1 = "Waiting for CameraCaptureSession configuration timed out"
            android.util.Log.e(r0, r1)
        L53:
            java.lang.Object r0 = r9.k
            monitor-enter(r0)
            tk0 r1 = r9.r     // Catch: java.lang.Throwable -> L5c
            r9.r = r3     // Catch: java.lang.Throwable -> L5c
            monitor-exit(r0)
            goto L5f
        L5c:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        L5f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            gt2 r2 = r9.a
            r0.append(r2)
            java.lang.String r2 = "#onGraphStopping"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.os.Trace.beginSection(r0)
            gt2 r0 = r9.a
            java.lang.String r2 = "CXCP"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r7 = " onGraphStopping"
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r2, r4)
            tp6 r2 = r0.d
            nt2 r4 = defpackage.nt2.b
            r2.l(r4)
            ft2 r2 = r0.b
            r2.F(r3)
            java.util.List r0 = r0.c
            java.util.Iterator r0 = r0.iterator()
        L9f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lb7
            java.lang.Object r2 = r0.next()
            qt2 r2 = (defpackage.qt2) r2
            sh0 r4 = r2.a
            sf0 r2 = r2.a()
            nt2 r7 = defpackage.nt2.b
            r4.b(r2, r7)
            goto L9f
        Lb7:
            android.os.Trace.endSection()
            if (r1 == 0) goto L162
            dk0 r0 = r1.b
            java.lang.String r2 = "CXCP"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r9)
            java.lang.String r7 = " Shutdown"
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r2, r4)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r9)
            java.lang.String r4 = "#shutdown"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            android.os.Trace.beginSection(r2)
            mf0 r2 = r9.f
            boolean r2 = r2.a
            if (r2 == 0) goto L107
            t57 r2 = r9.h
            en r4 = new en
            r7 = 3
            r4.<init>(r9, r0, r3, r7)
            r7 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r0 = r2.b(r7, r4)
            jg7 r0 = (defpackage.jg7) r0
            if (r0 != 0) goto L107
            java.lang.String r0 = "CXCP"
            java.lang.String r2 = "Failed to abort captures in 2000ms"
            android.util.Log.e(r0, r2)
        L107:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            java.lang.String r2 = "#disconnect"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.os.Trace.beginSection(r0)
            xc0 r0 = r1.c
            r0.c()
            android.os.Trace.endSection()
            mf0 r0 = r9.f
            boolean r0 = r0.d
            if (r0 == 0) goto L140
            t57 r0 = r9.h
            en r2 = new en
            r4 = 2
            r2.<init>(r9, r1, r3, r4)
            java.lang.Object r0 = r0.b(r5, r2)
            jg7 r0 = (defpackage.jg7) r0
            if (r0 != 0) goto L140
            java.lang.String r0 = "CXCP"
            java.lang.String r1 = "Failed to close the capture session in 3000ms"
            android.util.Log.e(r0, r1)
        L140:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            gt2 r1 = r9.a
            r0.append(r1)
            java.lang.String r1 = "#onGraphStopped"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.os.Trace.beginSection(r0)
            gt2 r0 = r9.a
            r0.c()
            android.os.Trace.endSection()
            android.os.Trace.endSection()
            goto L180
        L162:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            gt2 r1 = r9.a
            r0.append(r1)
            java.lang.String r1 = "#onGraphStopped"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.os.Trace.beginSection(r0)
            gt2 r0 = r9.a
            r0.c()
            android.os.Trace.endSection()
        L180:
            java.util.concurrent.CountDownLatch r9 = r9.v
            r9.countDown()
            return
        L186:
            monitor-exit(r0)
            return
        L188:
            monitor-exit(r0)
            throw r9
    }

    public final void m(boolean r11) {
            r10 = this;
            java.lang.Object r0 = r10.k
            monitor-enter(r0)
            tk0 r1 = r10.r     // Catch: java.lang.Throwable -> L1ba
            java.util.Map r2 = r10.s     // Catch: java.lang.Throwable -> L1ba
            java.util.LinkedHashMap r3 = r10.t     // Catch: java.lang.Throwable -> L1ba
            monitor-exit(r0)
            if (r1 == 0) goto L1b9
            if (r2 == 0) goto L1b9
            if (r3 == 0) goto L1b9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            java.lang.String r4 = "#finalizeOutputConfigurations"
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.os.Trace.beginSection(r0)
            yx6 r0 = r10.e
            r0.getClass()
            long r4 = android.os.SystemClock.elapsedRealtimeNanos()
            java.util.Set r0 = r2.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L35:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L66
            java.lang.Object r6 = r0.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            kr6 r7 = (defpackage.kr6) r7
            int r7 = r7.a
            java.lang.Object r6 = r6.getValue()
            xi r6 = (defpackage.xi) r6
            kr6 r8 = new kr6
            r8.<init>(r7)
            java.lang.Object r7 = r3.get(r8)
            if (r7 == 0) goto L60
            android.view.Surface r7 = (android.view.Surface) r7
            r6.a(r7)
            goto L35
        L60:
            java.lang.String r10 = "Required value was null."
            defpackage.i.m(r10)
            return
        L66:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Set r6 = r2.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L73:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L89
            java.lang.Object r7 = r6.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r7 = r7.getValue()
            xi r7 = (defpackage.xi) r7
            r0.add(r7)
            goto L73
        L89:
            java.util.List r0 = defpackage.gt0.k1(r0)
            me0 r1 = r1.a
            r1.V(r0)
            java.lang.Object r0 = r10.k
            monitor-enter(r0)
            uk0 r1 = r10.u     // Catch: java.lang.Throwable -> Leb
            uk0 r6 = defpackage.uk0.CREATED     // Catch: java.lang.Throwable -> Leb
            if (r1 != r6) goto L18c
            java.util.Map r1 = r10.m     // Catch: java.lang.Throwable -> Leb
            r1.putAll(r3)     // Catch: java.lang.Throwable -> Leb
            java.util.Set r1 = r3.entrySet()     // Catch: java.lang.Throwable -> Leb
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Leb
        La8:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> Leb
            r6 = 1
            if (r3 == 0) goto Lfe
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> Leb
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> Leb
            java.lang.Object r7 = r3.getKey()     // Catch: java.lang.Throwable -> Leb
            kr6 r7 = (defpackage.kr6) r7     // Catch: java.lang.Throwable -> Leb
            int r7 = r7.a     // Catch: java.lang.Throwable -> Leb
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> Leb
            android.view.Surface r3 = (android.view.Surface) r3     // Catch: java.lang.Throwable -> Leb
            jr6 r8 = r10.g     // Catch: java.lang.Throwable -> Leb
            ki0 r7 = r8.e(r7)     // Catch: java.lang.Throwable -> Leb
            if (r7 == 0) goto Lf6
            java.util.ArrayList r8 = r7.b     // Catch: java.lang.Throwable -> Leb
            int r8 = r8.size()     // Catch: java.lang.Throwable -> Leb
            if (r8 != r6) goto Lee
            java.util.Map r6 = r10.n     // Catch: java.lang.Throwable -> Leb
            r6.getClass()     // Catch: java.lang.Throwable -> Leb
            java.util.ArrayList r7 = r7.b     // Catch: java.lang.Throwable -> Leb
            java.lang.Object r7 = defpackage.gt0.b1(r7)     // Catch: java.lang.Throwable -> Leb
            ir6 r7 = (defpackage.ir6) r7     // Catch: java.lang.Throwable -> Leb
            int r7 = r7.a     // Catch: java.lang.Throwable -> Leb
            gp4 r8 = new gp4     // Catch: java.lang.Throwable -> Leb
            r8.<init>(r7)     // Catch: java.lang.Throwable -> Leb
            r6.put(r8, r3)     // Catch: java.lang.Throwable -> Leb
            goto La8
        Leb:
            r10 = move-exception
            goto L1b7
        Lee:
            java.lang.String r10 = "Cannot finalize a multi-output stream!"
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Leb
            r11.<init>(r10)     // Catch: java.lang.Throwable -> Leb
            throw r11     // Catch: java.lang.Throwable -> Leb
        Lf6:
            java.lang.String r10 = "Required value was null."
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Leb
            r11.<init>(r10)     // Catch: java.lang.Throwable -> Leb
            throw r11     // Catch: java.lang.Throwable -> Leb
        Lfe:
            java.lang.String r1 = "CXCP"
            yx6 r3 = r10.e     // Catch: java.lang.Throwable -> Leb
            r3.getClass()     // Catch: java.lang.Throwable -> Leb
            long r7 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Throwable -> Leb
            long r7 = r7 - r4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Leb
            r3.<init>()     // Catch: java.lang.Throwable -> Leb
            java.lang.String r4 = "Finalized "
            r3.append(r4)     // Catch: java.lang.Throwable -> Leb
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Leb
            int r5 = r2.size()     // Catch: java.lang.Throwable -> Leb
            r4.<init>(r5)     // Catch: java.lang.Throwable -> Leb
            java.util.Set r2 = r2.entrySet()     // Catch: java.lang.Throwable -> Leb
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Leb
        L125:
            boolean r5 = r2.hasNext()     // Catch: java.lang.Throwable -> Leb
            if (r5 == 0) goto L142
            java.lang.Object r5 = r2.next()     // Catch: java.lang.Throwable -> Leb
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Throwable -> Leb
            java.lang.Object r5 = r5.getKey()     // Catch: java.lang.Throwable -> Leb
            kr6 r5 = (defpackage.kr6) r5     // Catch: java.lang.Throwable -> Leb
            int r5 = r5.a     // Catch: java.lang.Throwable -> Leb
            kr6 r9 = new kr6     // Catch: java.lang.Throwable -> Leb
            r9.<init>(r5)     // Catch: java.lang.Throwable -> Leb
            r4.add(r9)     // Catch: java.lang.Throwable -> Leb
            goto L125
        L142:
            r3.append(r4)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r2 = " for "
            r3.append(r2)     // Catch: java.lang.Throwable -> Leb
            r3.append(r10)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r2 = " in "
            r3.append(r2)     // Catch: java.lang.Throwable -> Leb
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Leb
            r2.<init>()     // Catch: java.lang.Throwable -> Leb
            java.lang.String r4 = "%."
            r2.append(r4)     // Catch: java.lang.Throwable -> Leb
            r4 = 3
            r2.append(r4)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r4 = "f ms"
            r2.append(r4)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Leb
            double r4 = (double) r7     // Catch: java.lang.Throwable -> Leb
            r7 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r4 = r4 / r7
            java.lang.Double r4 = java.lang.Double.valueOf(r4)     // Catch: java.lang.Throwable -> Leb
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> Leb
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r6)     // Catch: java.lang.Throwable -> Leb
            r5 = 0
            java.lang.String r2 = java.lang.String.format(r5, r2, r4)     // Catch: java.lang.Throwable -> Leb
            r3.append(r2)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> Leb
            android.util.Log.i(r1, r2)     // Catch: java.lang.Throwable -> Leb
            goto L18d
        L18c:
            r6 = 0
        L18d:
            monitor-exit(r0)
            if (r6 == 0) goto L1b3
            if (r11 == 0) goto L1b3
            gt2 r10 = r10.a
            java.lang.String r11 = "CXCP"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            java.lang.String r1 = " onGraphModified"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r11, r0)
            ft2 r10 = r10.b
            s9 r10 = r10.Z
            ts2 r11 = defpackage.ts2.b
            r10.H(r11)
        L1b3:
            android.os.Trace.endSection()
            return
        L1b7:
            monitor-exit(r0)
            throw r10
        L1b9:
            return
        L1ba:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
    }

    public final void n(long r5) {
            r4 = this;
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 == 0) goto L13
            w61 r0 = r4.i
            wk0 r1 = new wk0
            r2 = 0
            r1.<init>(r5, r4, r2)
            r4 = 3
            defpackage.hv.L(r0, r2, r2, r1, r4)
            return
        L13:
            java.lang.String r5 = "CXCP"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Finalizing "
            r6.<init>(r0)
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r5, r6)
            java.lang.Object r5 = r4.k
            monitor-enter(r5)
            java.util.LinkedHashMap r6 = r4.z     // Catch: java.lang.Throwable -> La8
            java.util.Collection r6 = r6.values()     // Catch: java.lang.Throwable -> La8
            java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch: java.lang.Throwable -> La8
            java.util.List r6 = defpackage.gt0.k1(r6)     // Catch: java.lang.Throwable -> La8
            java.util.LinkedHashMap r4 = r4.z     // Catch: java.lang.Throwable -> La8
            r4.clear()     // Catch: java.lang.Throwable -> La8
            monitor-exit(r5)
            java.util.Iterator r4 = r6.iterator()
        L3f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto La7
            java.lang.Object r5 = r4.next()
            java.lang.AutoCloseable r5 = (java.lang.AutoCloseable) r5
            boolean r6 = r5 instanceof java.lang.AutoCloseable
            if (r6 == 0) goto L53
            r5.close()
            goto L3f
        L53:
            boolean r6 = r5 instanceof java.util.concurrent.ExecutorService
            if (r6 == 0) goto L86
            java.util.concurrent.ExecutorService r5 = (java.util.concurrent.ExecutorService) r5
            java.util.concurrent.ForkJoinPool r6 = java.util.concurrent.ForkJoinPool.commonPool()
            if (r5 != r6) goto L60
            goto L3f
        L60:
            boolean r6 = r5.isTerminated()
            if (r6 != 0) goto L3f
            r5.shutdown()
            r0 = 0
        L6a:
            if (r6 != 0) goto L7c
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.DAYS     // Catch: java.lang.InterruptedException -> L75
            r2 = 1
            boolean r6 = r5.awaitTermination(r2, r1)     // Catch: java.lang.InterruptedException -> L75
            goto L6a
        L75:
            if (r0 != 0) goto L6a
            r5.shutdownNow()
            r0 = 1
            goto L6a
        L7c:
            if (r0 == 0) goto L3f
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            r5.interrupt()
            goto L3f
        L86:
            boolean r6 = r5 instanceof android.content.res.TypedArray
            if (r6 == 0) goto L90
            android.content.res.TypedArray r5 = (android.content.res.TypedArray) r5
            r5.recycle()
            goto L3f
        L90:
            boolean r6 = r5 instanceof android.media.MediaMetadataRetriever
            if (r6 == 0) goto L9a
            android.media.MediaMetadataRetriever r5 = (android.media.MediaMetadataRetriever) r5
            r5.release()
            goto L3f
        L9a:
            boolean r6 = r5 instanceof android.media.MediaDrm
            if (r6 == 0) goto La4
            android.media.MediaDrm r5 = (android.media.MediaDrm) r5
            r5.release()
            goto L3f
        La4:
            defpackage.u34.t()
        La7:
            return
        La8:
            r4 = move-exception
            monitor-exit(r5)
            throw r4
    }

    public final void o() {
            r7 = this;
            r7.l()
            java.lang.Object r0 = r7.k
            monitor-enter(r0)
            uk0 r1 = r7.u     // Catch: java.lang.Throwable -> L25
            uk0 r2 = defpackage.uk0.CLOSED     // Catch: java.lang.Throwable -> L25
            r3 = 0
            if (r1 == r2) goto L27
            bf0 r1 = r7.q     // Catch: java.lang.Throwable -> L25
            r5 = 1
            if (r1 == 0) goto L28
            boolean r1 = r7.w     // Catch: java.lang.Throwable -> L25
            if (r1 != 0) goto L18
            goto L28
        L18:
            mf0 r1 = r7.f     // Catch: java.lang.Throwable -> L25
            int r1 = r1.c     // Catch: java.lang.Throwable -> L25
            if (r1 != r5) goto L1f
            goto L28
        L1f:
            r6 = 2
            if (r1 != r6) goto L27
            r3 = 2000(0x7d0, double:9.88E-321)
            goto L28
        L25:
            r7 = move-exception
            goto L34
        L27:
            r5 = 0
        L28:
            r1 = 0
            r7.q = r1     // Catch: java.lang.Throwable -> L25
            r7.u = r2     // Catch: java.lang.Throwable -> L25
            monitor-exit(r0)
            if (r5 == 0) goto L33
            r7.n(r3)
        L33:
            return
        L34:
            monitor-exit(r0)
            throw r7
    }

    public final void p(java.util.Map r10, java.util.Map r11) {
            r9 = this;
            java.util.Collection r10 = r10.values()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Set r10 = defpackage.gt0.p1(r10)
            java.util.Collection r11 = r11.values()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Set r11 = defpackage.gt0.p1(r11)
            r0 = r11
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Set r0 = defpackage.ii2.F(r10, r0)
            java.util.Iterator r0 = r0.iterator()
        L1f:
            boolean r1 = r0.hasNext()
            java.util.LinkedHashMap r2 = r9.z
            if (r1 == 0) goto La2
            java.lang.Object r1 = r0.next()
            android.view.Surface r1 = (android.view.Surface) r1
            java.lang.Object r2 = r2.remove(r1)
            java.lang.AutoCloseable r2 = (java.lang.AutoCloseable) r2
            if (r2 == 0) goto L96
            boolean r3 = r2 instanceof java.lang.AutoCloseable
            if (r3 == 0) goto L3d
            r2.close()
            goto L97
        L3d:
            boolean r3 = r2 instanceof java.util.concurrent.ExecutorService
            if (r3 == 0) goto L71
            r3 = r2
            java.util.concurrent.ExecutorService r3 = (java.util.concurrent.ExecutorService) r3
            java.util.concurrent.ForkJoinPool r4 = java.util.concurrent.ForkJoinPool.commonPool()
            if (r3 != r4) goto L4b
            goto L97
        L4b:
            boolean r4 = r3.isTerminated()
            if (r4 != 0) goto L97
            r3.shutdown()
            r5 = 0
        L55:
            if (r4 != 0) goto L67
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.DAYS     // Catch: java.lang.InterruptedException -> L60
            r7 = 1
            boolean r4 = r3.awaitTermination(r7, r6)     // Catch: java.lang.InterruptedException -> L60
            goto L55
        L60:
            if (r5 != 0) goto L55
            r3.shutdownNow()
            r5 = 1
            goto L55
        L67:
            if (r5 == 0) goto L97
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            r3.interrupt()
            goto L97
        L71:
            boolean r3 = r2 instanceof android.content.res.TypedArray
            if (r3 == 0) goto L7c
            r3 = r2
            android.content.res.TypedArray r3 = (android.content.res.TypedArray) r3
            r3.recycle()
            goto L97
        L7c:
            boolean r3 = r2 instanceof android.media.MediaMetadataRetriever
            if (r3 == 0) goto L87
            r3 = r2
            android.media.MediaMetadataRetriever r3 = (android.media.MediaMetadataRetriever) r3
            r3.release()
            goto L97
        L87:
            boolean r3 = r2 instanceof android.media.MediaDrm
            if (r3 == 0) goto L92
            r3 = r2
            android.media.MediaDrm r3 = (android.media.MediaDrm) r3
            r3.release()
            goto L97
        L92:
            defpackage.u34.t()
            return
        L96:
            r2 = 0
        L97:
            if (r2 == 0) goto L9a
            goto L1f
        L9a:
            java.lang.String r9 = "Surface "
            java.lang.String r10 = " doesn't have a matching surface token!"
            defpackage.e41.g(r1, r10, r9)
            return
        La2:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Set r10 = defpackage.ii2.F(r11, r10)
            java.util.Iterator r10 = r10.iterator()
        Lac:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto Lc2
            java.lang.Object r11 = r10.next()
            android.view.Surface r11 = (android.view.Surface) r11
            oi0 r0 = r9.d
            ni0 r0 = r0.a(r11)
            r2.put(r11, r0)
            goto Lac
        Lc2:
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CaptureSessionState-"
            r0.<init>(r1)
            int r2 = r2.j
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}

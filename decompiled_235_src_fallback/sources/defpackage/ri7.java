package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ri7  reason: default package */
/* loaded from: classes.dex */
public final class ri7 implements defpackage.li7 {
    public static final defpackage.tu0 l = null;
    public static final defpackage.tu0 m = null;
    public final defpackage.n55 a;
    public final defpackage.n55 b;
    public final defpackage.ej7 c;
    public final defpackage.n55 d;
    public final defpackage.kj7 e;
    public final defpackage.ij0 f;
    public volatile boolean g;
    public final defpackage.ex6 h;
    public final defpackage.ex6 i;
    public final defpackage.ex6 j;
    public final java.util.LinkedHashMap k;

    static {
            fm5 r0 = new fm5
            r1 = 4
            r2 = 0
            r0.<init>(r1, r2)
            tu0 r0 = defpackage.u24.b(r0)
            defpackage.ri7.l = r0
            tu0 r0 = new tu0
            r0.<init>()
            r0.h(r2)
            defpackage.ri7.m = r0
            return
    }

    public ri7(defpackage.n55 r1, defpackage.n55 r2, defpackage.ej7 r3, defpackage.n55 r4, defpackage.kj7 r5, defpackage.ij0 r6) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r5.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            java.lang.String r1 = "CXCP"
            boolean r2 = defpackage.kj2.F(r1)
            if (r2 == 0) goto L37
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Configured "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r1, r2)
        L37:
            mi7 r1 = new mi7
            r2 = 0
            r1.<init>(r0, r2)
            ex6 r2 = new ex6
            r2.<init>(r1)
            r0.h = r2
            mi7 r1 = new mi7
            r2 = 1
            r1.<init>(r0, r2)
            ex6 r2 = new ex6
            r2.<init>(r1)
            r0.i = r2
            mi7 r1 = new mi7
            r2 = 2
            r1.<init>(r0, r2)
            ex6 r2 = new ex6
            r2.<init>(r1)
            r0.j = r2
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r0.k = r1
            return
    }

    public static final java.lang.Object k(defpackage.ri7 r7, defpackage.ki7 r8, java.util.Map r9, defpackage.xy0 r10, defpackage.hw6 r11) {
            java.util.LinkedHashMap r0 = r7.k
            java.lang.String r1 = "CXCP"
            boolean r2 = defpackage.kj2.F(r1)
            if (r2 == 0) goto L2b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "UseCaseCameraRequestControlImpl#setParametersAsync: ["
            r2.<init>(r3)
            r2.append(r8)
            java.lang.String r3 = "] values = "
            r2.append(r3)
            r2.append(r9)
            java.lang.String r3 = ", optionPriority = "
            r2.append(r3)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r1, r2)
        L2b:
            java.lang.Object r1 = r0.get(r8)
            r2 = 0
            if (r1 != 0) goto L3c
            ni7 r1 = new ni7
            r3 = 15
            r1.<init>(r2, r2, r2, r3)
            r0.put(r8, r1)
        L3c:
            ni7 r1 = (defpackage.ni7) r1
            jd0 r3 = new jd0
            r4 = 0
            r3.<init>(r4)
            jd0 r4 = r1.a
            da4 r4 = r4.B
            r3.b(r4)
            r10.getClass()
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L56:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L76
            java.lang.Object r4 = r9.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            android.hardware.camera2.CaptureRequest$Key r5 = (android.hardware.camera2.CaptureRequest.Key) r5
            java.lang.Object r4 = r4.getValue()
            xx r5 = defpackage.nw7.T(r5)
            da4 r6 = r3.B
            r6.l(r5, r10, r4)
            goto L56
        L76:
            java.util.Map r9 = r1.b
            java.util.LinkedHashMap r9 = defpackage.c14.t0(r9)
            java.util.Set r10 = r1.c
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Set r10 = defpackage.gt0.o1(r10)
            bl5 r1 = r1.d
            ni7 r4 = new ni7
            r4.<init>(r3, r9, r10, r1)
            r0.put(r8, r4)
            ni7 r8 = l(r0)
            java.lang.Object r7 = r7.n(r8, r2, r11)
            return r7
    }

    public static defpackage.ni7 l(java.util.LinkedHashMap r5) {
            ni7 r0 = new ni7
            bl5 r1 = new bl5
            r2 = 1
            r1.<init>(r2)
            r2 = 7
            r3 = 0
            r0.<init>(r3, r3, r1, r2)
            t52 r1 = defpackage.ki7.getEntries()
            java.util.Iterator r1 = r1.iterator()
        L15:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L50
            java.lang.Object r2 = r1.next()
            ki7 r2 = (defpackage.ki7) r2
            java.lang.Object r2 = r5.get(r2)
            ni7 r2 = (defpackage.ni7) r2
            if (r2 == 0) goto L15
            jd0 r3 = r2.a
            da4 r3 = r3.B
            jd0 r4 = r0.a
            r4.b(r3)
            java.util.Map r3 = r0.b
            java.util.Map r4 = r2.b
            r3.putAll(r4)
            java.util.Set r3 = r2.c
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Set r4 = r0.c
            r4.addAll(r3)
            bl5 r2 = r2.d
            if (r2 == 0) goto L15
            int r2 = r2.a
            bl5 r3 = new bl5
            r3.<init>(r2)
            r0.d = r3
            goto L15
        L50:
            return r0
    }

    @Override // defpackage.li7
    public final defpackage.jg1 a() {
            r3 = this;
            boolean r0 = r3.g
            r1 = 0
            if (r0 != 0) goto Lf
            wc0 r0 = new wc0
            r2 = 5
            r0.<init>(r3, r1, r2)
            tu0 r1 = r3.m(r0)
        Lf:
            if (r1 != 0) goto L14
            tu0 r3 = defpackage.ri7.l
            return r3
        L14:
            return r1
    }

    @Override // defpackage.li7
    public final java.lang.Object c(defpackage.hw6 r1) {
            r0 = this;
            ex6 r0 = r0.i
            java.lang.Object r0 = r0.getValue()
            jj7 r0 = (defpackage.jj7) r0
            r0.getClass()
            java.lang.Object r0 = defpackage.jj7.c(r0, r1)
            return r0
    }

    @Override // defpackage.li7
    public final void close() {
            r4 = this;
            r0 = 1
            r4.g = r0
            java.lang.String r0 = "CXCP"
            boolean r0 = defpackage.kj2.F(r0)
            if (r0 == 0) goto L12
            java.lang.String r0 = "CXCP"
            java.lang.String r1 = "UseCaseCameraRequestControl: closed"
            android.util.Log.d(r0, r1)
        L12:
            ex6 r4 = r4.j
            java.lang.Object r4 = r4.getValue()
            wi7 r4 = (defpackage.wi7) r4
            java.lang.Object r0 = r4.c
            monitor-enter(r0)
            boolean r1 = r4.g     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L38
            r1 = 0
            r4.g = r1     // Catch: java.lang.Throwable -> L33
            tu0 r1 = r4.d     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L35
            java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> L33
            java.lang.String r3 = "UseCaseCameraState closed"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L33
            r1.v0(r2)     // Catch: java.lang.Throwable -> L33
            goto L35
        L33:
            r4 = move-exception
            goto L5c
        L35:
            r1 = 0
            r4.d = r1     // Catch: java.lang.Throwable -> L33
        L38:
            pu r1 = r4.f     // Catch: java.lang.Throwable -> L33
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto L5a
            pu r1 = r4.f     // Catch: java.lang.Throwable -> L33
            java.lang.Object r1 = r1.removeFirst()     // Catch: java.lang.Throwable -> L33
            ti7 r1 = (defpackage.ti7) r1     // Catch: java.lang.Throwable -> L33
            tu0 r1 = r1.b     // Catch: java.lang.Throwable -> L33
            java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> L33
            java.lang.String r3 = "UseCaseCameraState closed"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L33
            r1.v0(r2)     // Catch: java.lang.Throwable -> L33
            uw r1 = r4.q     // Catch: java.lang.Throwable -> L33
            r1.a()     // Catch: java.lang.Throwable -> L33
            goto L38
        L5a:
            monitor-exit(r0)
            return
        L5c:
            monitor-exit(r0)
            throw r4
    }

    @Override // defpackage.li7
    public final defpackage.jg1 d(defpackage.kd0 r8, java.util.Map r9) {
            r7 = this;
            boolean r0 = r7.g
            r5 = 0
            if (r0 != 0) goto L12
            ad r1 = new ad
            r6 = 5
            r2 = r7
            r3 = r8
            r4 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            tu0 r5 = r2.m(r1)
        L12:
            if (r5 != 0) goto L17
            tu0 r7 = defpackage.ri7.m
            return r7
        L17:
            return r5
    }

    @Override // defpackage.li7
    public final defpackage.jg1 e(int r3) {
            r2 = this;
            boolean r0 = r2.g
            r1 = 0
            if (r0 != 0) goto Le
            oi7 r0 = new oi7
            r0.<init>(r2, r3, r1)
            tu0 r1 = r2.m(r0)
        Le:
            if (r1 != 0) goto L13
            tu0 r2 = defpackage.ri7.l
            return r2
        L13:
            return r1
    }

    @Override // defpackage.li7
    public final defpackage.jg1 f(java.util.List r8, defpackage.ki7 r9) {
            r7 = this;
            r9.getClass()
            boolean r0 = r7.g
            r5 = 0
            if (r0 != 0) goto L15
            ad r1 = new ad
            r6 = 4
            r2 = r7
            r4 = r8
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            tu0 r5 = r2.m(r1)
        L15:
            if (r5 != 0) goto L1a
            tu0 r7 = defpackage.ri7.m
            return r7
        L1a:
            return r5
    }

    @Override // defpackage.li7
    public final defpackage.jg1 g(java.util.LinkedHashSet r3, boolean r4) {
            r2 = this;
            boolean r0 = r2.g
            r1 = 0
            if (r0 != 0) goto Le
            qi7 r0 = new qi7
            r0.<init>(r3, r4, r2, r1)
            tu0 r1 = r2.m(r0)
        Le:
            if (r1 != 0) goto L13
            tu0 r2 = defpackage.ri7.m
            return r2
        L13:
            return r1
    }

    @Override // defpackage.li7
    public final defpackage.jg1 h(java.util.Map r11, defpackage.ki7 r12, defpackage.xy0 r13) {
            r10 = this;
            r12.getClass()
            r13.getClass()
            boolean r0 = r10.g
            if (r0 == 0) goto Ld
            tu0 r10 = defpackage.ri7.m
            return r10
        Ld:
            kj7 r0 = r10.e
            java.lang.ThreadLocal r0 = r0.d
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = defpackage.nb3.k(r0, r1)
            r1 = 0
            if (r0 == 0) goto L36
            kj7 r0 = r10.e
            o41 r0 = r0.f
            a71 r2 = defpackage.a71.UNDISPATCHED
            kp5 r3 = new kp5
            r8 = 0
            r9 = 9
            r4 = r10
            r6 = r11
            r5 = r12
            r7 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r10 = 1
            kg1 r10 = defpackage.hv.i(r0, r1, r2, r3, r10)
            return r10
        L36:
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            java.lang.String r10 = r10.getName()
            java.lang.String r11 = "Thread check failed: This method must be called from the UseCaseThreads sequential scope. Current thread: "
            defpackage.u34.i(r10, r11)
            return r1
    }

    @Override // defpackage.li7
    public final defpackage.jg1 i(java.util.Map r9, defpackage.ki7 r10, defpackage.xy0 r11) {
            r8 = this;
            r10.getClass()
            r11.getClass()
            boolean r0 = r8.g
            if (r0 != 0) goto L1a
            n22 r1 = new n22
            r6 = 0
            r7 = 1
            r2 = r8
            r4 = r9
            r3 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            tu0 r8 = r2.m(r1)
            goto L1b
        L1a:
            r8 = 0
        L1b:
            if (r8 != 0) goto L1f
            tu0 r8 = defpackage.ri7.m
        L1f:
            return r8
    }

    @Override // defpackage.li7
    public final defpackage.jg1 j() {
            r2 = this;
            boolean r0 = r2.g
            r1 = 0
            if (r0 != 0) goto Le
            yc r0 = new yc
            r0.<init>(r2, r1)
            tu0 r1 = r2.m(r0)
        Le:
            if (r1 != 0) goto L13
            tu0 r2 = defpackage.ri7.l
            return r2
        L13:
            return r1
    }

    public final defpackage.tu0 m(defpackage.qn2 r6) {
            r5 = this;
            kj7 r5 = r5.e
            r5.getClass()
            java.lang.ThreadLocal r0 = r5.d
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L16
            a71 r0 = defpackage.a71.UNDISPATCHED
            goto L18
        L16:
            a71 r0 = defpackage.a71.DEFAULT
        L18:
            tu0 r1 = new tu0
            r1.<init>()
            o41 r5 = r5.f
            bf4 r2 = new bf4
            r3 = 25
            r4 = 0
            r2.<init>(r6, r1, r4, r3)
            r6 = 1
            defpackage.hv.L(r5, r4, r0, r2, r6)
            return r1
    }

    public final java.lang.Object n(defpackage.ni7 r10, java.util.LinkedHashSet r11, defpackage.s41 r12) {
            r9 = this;
            boolean r0 = r12 instanceof defpackage.pi7
            if (r0 == 0) goto L14
            r0 = r12
            pi7 r0 = (defpackage.pi7) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.Y = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            pi7 r0 = new pi7
            r0.<init>(r9, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r7.R
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r7.Y
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L31
            if (r1 != r3) goto L2b
            defpackage.oi2.Y(r12)
            goto Lb9
        L2b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r9)
            return r2
        L31:
            defpackage.oi2.Y(r12)
            boolean r12 = r9.g
            if (r12 != 0) goto Lc1
            ij0 r12 = r9.f
            xx r1 = defpackage.uc0.a
            go4 r12 = r12.A
            xx r1 = defpackage.uc0.a
            java.lang.Object r12 = r12.b(r1, r2)
            if (r12 != 0) goto Lbd
            ex6 r12 = r9.h
            java.lang.Object r12 = r12.getValue()
            kk0 r12 = (defpackage.kk0) r12
            bl5 r1 = r10.d
            r1.getClass()
            int r1 = r1.a
            r2 = -1
            if (r1 == r2) goto L60
            bl5 r1 = r10.d
            r1.getClass()
            int r1 = r1.a
            goto L61
        L60:
            r1 = r3
        L61:
            r12.a(r1)
            ex6 r9 = r9.j
            java.lang.Object r9 = r9.getValue()
            r1 = r9
            wi7 r1 = (defpackage.wi7) r1
            jd0 r9 = r10.a
            kd0 r9 = r9.a()
            java.util.LinkedHashMap r2 = defpackage.nw7.r0(r9)
            k54 r9 = defpackage.uy6.a
            sa4 r12 = defpackage.sa4.a()
            java.util.Map r4 = r10.b
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L87:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto La3
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r5.getValue()
            android.util.ArrayMap r8 = r12.a
            r8.put(r6, r5)
            goto L87
        La3:
            java.util.Map r9 = java.util.Collections.singletonMap(r9, r12)
            r9.getClass()
            bl5 r5 = r10.d
            java.util.Set r6 = r10.c
            r7.Y = r3
            r3 = r9
            r4 = r11
            java.lang.Object r12 = r1.c(r2, r3, r4, r5, r6, r7)
            if (r12 != r0) goto Lb9
            return r0
        Lb9:
            r2 = r12
            jg1 r2 = (defpackage.jg1) r2
            goto Lc1
        Lbd:
            defpackage.u34.a()
            return r2
        Lc1:
            if (r2 != 0) goto Lc6
            tu0 r9 = defpackage.ri7.m
            return r9
        Lc6:
            return r2
    }
}

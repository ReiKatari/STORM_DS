package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m44  reason: default package */
/* loaded from: classes.dex */
public final class m44 implements defpackage.ye4, defpackage.g36, defpackage.b51, defpackage.so2, defpackage.qb7 {
    public static defpackage.m44 X;
    public final /* synthetic */ int A;
    public final java.lang.Object B;
    public java.lang.Object L;
    public java.lang.Object R;

    public m44(int r2) {
            r1 = this;
            r0 = 20
            r1.A = r0
            r1.<init>()
            long[] r0 = new long[r2]
            r1.B = r0
            java.util.BitSet r0 = new java.util.BitSet
            r0.<init>(r2)
            r1.L = r0
            long[] r2 = new long[r2]
            r1.R = r2
            return
    }

    public m44(int r1, byte r2) {
            r0 = this;
            r0.A = r1
            switch(r1) {
                case 6: goto L54;
                case 19: goto L40;
                case 28: goto L27;
                default: goto L5;
            }
        L5:
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            r1.getClass()
            r0.<init>()
            da0 r2 = defpackage.da0.R
            da0 r1 = defpackage.xd5.o(r1)
            r0.B = r1
            n34 r1 = defpackage.l94.f
            r0.L = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.R = r1
            return
        L27:
            r0.<init>()
            java.util.WeakHashMap r1 = new java.util.WeakHashMap
            r1.<init>()
            r0.B = r1
            java.util.WeakHashMap r1 = new java.util.WeakHashMap
            r1.<init>()
            r0.L = r1
            java.util.WeakHashMap r1 = new java.util.WeakHashMap
            r1.<init>()
            r0.R = r1
            return
        L40:
            r0.<init>()
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            o57 r2 = defpackage.nw7.d0
            r1.<init>(r2)
            r0.B = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.L = r1
            return
        L54:
            r0.<init>()
            long[] r1 = defpackage.b66.a
            ja4 r1 = new ja4
            r1.<init>()
            r0.B = r1
            return
    }

    public m44(android.content.Context r2, android.content.SharedPreferences r3) {
            r1 = this;
            r0 = 1
            r1.A = r0
            r1.<init>()
            r1.B = r2
            r1.L = r3
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.R = r2
            return
    }

    public m44(android.content.Context r2, android.content.res.TypedArray r3) {
            r1 = this;
            r0 = 24
            r1.A = r0
            r1.<init>()
            r1.B = r2
            r1.L = r3
            return
    }

    public m44(android.content.Context r2, android.location.LocationManager r3) {
            r1 = this;
            r0 = 26
            r1.A = r0
            r1.<init>()
            ck r0 = new ck
            r0.<init>()
            r1.R = r0
            r1.B = r2
            r1.L = r3
            return
    }

    public m44(android.net.ConnectivityManager r2, defpackage.jx6 r3) {
            r1 = this;
            r0 = 8
            r1.A = r0
            r1.<init>()
            r1.B = r2
            r1.L = r3
            c53 r3 = new c53
            r0 = 3
            r3.<init>(r1, r0)
            r1.R = r3
            android.net.NetworkRequest$Builder r1 = new android.net.NetworkRequest$Builder
            r1.<init>()
            r0 = 12
            android.net.NetworkRequest$Builder r1 = r1.addCapability(r0)
            android.net.NetworkRequest r1 = r1.build()
            r2.registerNetworkCallback(r1, r3)
            return
    }

    public m44(android.net.Uri r2, defpackage.rw4 r3) {
            r1 = this;
            r0 = 10
            r1.A = r0
            r1.<init>()
            r1.B = r2
            r2 = 0
            r1.L = r2
            r1.R = r3
            return
    }

    public m44(androidx.work.impl.foreground.SystemForegroundService r3) {
            r2 = this;
            r0 = 16
            r2.A = r0
            r2.<init>()
            ku3 r0 = new ku3
            r1 = 1
            r0.<init>(r3, r1)
            r2.B = r0
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r3.<init>(r0)
            r2.L = r3
            return
    }

    public m44(defpackage.cg0 r3, android.util.Size r4) {
            r2 = this;
            r0 = 21
            r2.A = r0
            r2.<init>()
            r2.B = r3
            r3.b()
            r3.m()
            if (r4 == 0) goto L1f
            android.util.Rational r0 = new android.util.Rational
            int r1 = r4.getWidth()
            int r4 = r4.getHeight()
            r0.<init>(r1, r4)
            goto L47
        L1f:
            r4 = 256(0x100, float:3.59E-43)
            java.util.List r4 = r3.t(r4)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L2e
            r4 = 0
            r0 = r4
            goto L47
        L2e:
            ru0 r0 = new ru0
            r1 = 0
            r0.<init>(r1)
            java.lang.Object r4 = java.util.Collections.max(r4, r0)
            android.util.Size r4 = (android.util.Size) r4
            android.util.Rational r0 = new android.util.Rational
            int r1 = r4.getWidth()
            int r4 = r4.getHeight()
            r0.<init>(r1, r4)
        L47:
            r2.L = r0
            j50 r4 = new j50
            r4.<init>(r3, r0)
            r2.R = r4
            return
    }

    public m44(defpackage.df5 r3) {
            r2 = this;
            r0 = 4
            r2.A = r0
            r2.<init>()
            vw r0 = new vw
            r1 = 0
            r0.<init>(r1)
            r2.B = r0
            s9 r0 = new s9
            r1 = 2
            r0.<init>(r1)
            r2.L = r0
            ci2 r0 = new ci2
            r1 = 14
            r0.<init>(r1, r2, r3)
            r2.R = r0
            return
    }

    public m44(defpackage.ed3 r2, defpackage.fo2 r3) {
            r1 = this;
            r0 = 14
            r1.A = r0
            r1.<init>()
            r1.B = r2
            r1.L = r3
            gw0 r2 = defpackage.gw0.L
            r1.R = r2
            return
    }

    public m44(defpackage.eg0 r2, defpackage.qf1 r3) {
            r1 = this;
            r0 = 22
            r1.A = r0
            r1.<init>()
            r1.L = r2
            r1.B = r3
            return
    }

    public m44(defpackage.fa6 r3) {
            r2 = this;
            r0 = 29
            r2.A = r0
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.L = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r1 = 3
            r0.<init>(r1)
            r2.B = r0
            r2.R = r3
            return
    }

    public m44(defpackage.hp4 r2) {
            r1 = this;
            r0 = 17
            r1.A = r0
            r1.<init>()
            r1.B = r2
            r2 = 1
            uw r2 = defpackage.g04.t(r2)
            r1.L = r2
            gs0 r2 = defpackage.gs0.a
            xw r2 = defpackage.g04.u(r2)
            r1.R = r2
            return
    }

    public m44(java.lang.Class r2) {
            r1 = this;
            r0 = 7
            r1.A = r0
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.B = r0
            r1.R = r2
            return
    }

    public /* synthetic */ m44(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.A = r4
            r0.B = r1
            r0.L = r2
            r0.R = r3
            r0.<init>()
            return
    }

    public m44(java.lang.Runnable r2) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.L = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.R = r0
            r1.B = r2
            return
    }

    public m44(java.util.ArrayList r2) {
            r1 = this;
            r0 = 9
            r1.A = r0
            r1.<init>()
            r1.B = r2
            java.util.ArrayList r0 = new java.util.ArrayList
            int r2 = r2.size()
            r0.<init>(r2)
            r1.L = r0
            java.util.HashSet r2 = new java.util.HashSet
            r0 = 3
            r2.<init>(r0)
            r1.R = r2
            return
    }

    public m44(defpackage.jr4 r2) {
            r1 = this;
            r0 = 5
            r1.A = r0
            r1.<init>()
            r1.B = r2
            return
    }

    public m44(defpackage.s35 r2) {
            r1 = this;
            r0 = 18
            r1.A = r0
            r1.<init>()
            r1.B = r2
            java.util.concurrent.locks.ReentrantLock r2 = new java.util.concurrent.locks.ReentrantLock
            r2.<init>()
            r1.L = r2
            java.util.WeakHashMap r2 = new java.util.WeakHashMap
            r2.<init>()
            r1.R = r2
            return
    }

    public m44(defpackage.we7 r2, defpackage.m44 r3) {
            r1 = this;
            r0 = 27
            r1.A = r0
            r1.<init>()
            r1.B = r2
            r1.L = r3
            java.lang.Object r2 = r2.getValue()
            r1.R = r2
            return
    }

    public static defpackage.m44 A(android.content.Context r2, android.util.AttributeSet r3, int[] r4, int r5) {
            m44 r0 = new m44
            r1 = 0
            android.content.res.TypedArray r3 = r2.obtainStyledAttributes(r3, r4, r5, r1)
            r0.<init>(r2, r3)
            return r0
    }

    public static void G(java.util.List r5, android.util.Size r6, boolean r7) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r5.size()
            int r1 = r1 + (-1)
        Lb:
            if (r1 < 0) goto L2e
            java.lang.Object r2 = r5.get(r1)
            android.util.Size r2 = (android.util.Size) r2
            int r3 = r2.getWidth()
            int r4 = r6.getWidth()
            if (r3 < r4) goto L27
            int r3 = r2.getHeight()
            int r4 = r6.getHeight()
            if (r3 >= r4) goto L2e
        L27:
            r3 = 0
            r0.add(r3, r2)
            int r1 = r1 + (-1)
            goto Lb
        L2e:
            r5.removeAll(r0)
            java.util.Collections.reverse(r5)
            if (r7 == 0) goto L39
            r5.addAll(r0)
        L39:
            return
    }

    public static void H(java.util.List r6, android.util.Size r7, boolean r8) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = r1
        L7:
            int r3 = r6.size()
            if (r2 >= r3) goto L2d
            java.lang.Object r3 = r6.get(r2)
            android.util.Size r3 = (android.util.Size) r3
            int r4 = r3.getWidth()
            int r5 = r7.getWidth()
            if (r4 > r5) goto L27
            int r4 = r3.getHeight()
            int r5 = r7.getHeight()
            if (r4 <= r5) goto L2d
        L27:
            r0.add(r1, r3)
            int r2 = r2 + 1
            goto L7
        L2d:
            r6.removeAll(r0)
            if (r8 == 0) goto L35
            r6.addAll(r0)
        L35:
            return
    }

    public static final void b(defpackage.m44 r7, android.net.Network r8, boolean r9) {
            java.lang.Object r0 = r7.B
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            android.net.Network[] r0 = r0.getAllNetworks()
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lb:
            if (r3 >= r1) goto L34
            r4 = r0[r3]
            boolean r5 = defpackage.nb3.k(r4, r8)
            r6 = 1
            if (r5 == 0) goto L18
            r4 = r9
            goto L2d
        L18:
            java.lang.Object r5 = r7.B
            android.net.ConnectivityManager r5 = (android.net.ConnectivityManager) r5
            android.net.NetworkCapabilities r4 = r5.getNetworkCapabilities(r4)
            if (r4 == 0) goto L2c
            r5 = 12
            boolean r4 = r4.hasCapability(r5)
            if (r4 == 0) goto L2c
            r4 = r6
            goto L2d
        L2c:
            r4 = r2
        L2d:
            if (r4 == 0) goto L31
            r2 = r6
            goto L34
        L31:
            int r3 = r3 + 1
            goto Lb
        L34:
            java.lang.Object r7 = r7.L
            jx6 r7 = (defpackage.jx6) r7
            monitor-enter(r7)
            java.lang.ref.WeakReference r8 = r7.A     // Catch: java.lang.Throwable -> L46
            java.lang.Object r8 = r8.get()     // Catch: java.lang.Throwable -> L46
            pe5 r8 = (defpackage.pe5) r8     // Catch: java.lang.Throwable -> L46
            if (r8 == 0) goto L48
            r7.X = r2     // Catch: java.lang.Throwable -> L46
            goto L4b
        L46:
            r8 = move-exception
            goto L4d
        L48:
            r7.b()     // Catch: java.lang.Throwable -> L46
        L4b:
            monitor-exit(r7)
            return
        L4d:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L46
            throw r8
    }

    public static java.util.ArrayList t(java.util.ArrayList r9) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.util.Rational r1 = defpackage.mv.a
            r0.add(r1)
            android.util.Rational r1 = defpackage.mv.c
            r0.add(r1)
            int r1 = r9.size()
            r2 = 0
            r3 = r2
        L15:
            if (r3 >= r1) goto L4c
            java.lang.Object r4 = r9.get(r3)
            int r3 = r3 + 1
            android.util.Size r4 = (android.util.Size) r4
            android.util.Rational r5 = new android.util.Rational
            int r6 = r4.getWidth()
            int r7 = r4.getHeight()
            r5.<init>(r6, r7)
            boolean r6 = r0.contains(r5)
            if (r6 != 0) goto L15
            int r6 = r0.size()
            r7 = r2
        L37:
            if (r7 >= r6) goto L48
            java.lang.Object r8 = r0.get(r7)
            int r7 = r7 + 1
            android.util.Rational r8 = (android.util.Rational) r8
            boolean r8 = defpackage.mv.a(r8, r4)
            if (r8 == 0) goto L37
            goto L15
        L48:
            r0.add(r5)
            goto L15
        L4c:
            return r0
    }

    public static android.util.Rational v(int r1, boolean r2) {
            r0 = -1
            if (r1 == r0) goto L25
            if (r1 == 0) goto L25
            r0 = 1
            if (r1 == r0) goto L1d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "Undefined target aspect ratio: "
            r2.<init>(r0)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "SupportedOutputSizesCollector"
            defpackage.kj2.v(r2, r1)
            r1 = 0
            return r1
        L1d:
            if (r2 == 0) goto L22
            android.util.Rational r1 = defpackage.mv.c
            return r1
        L22:
            android.util.Rational r1 = defpackage.mv.d
            return r1
        L25:
            if (r2 == 0) goto L2a
            android.util.Rational r1 = defpackage.mv.a
            return r1
        L2a:
            android.util.Rational r1 = defpackage.mv.b
            return r1
    }

    public static java.util.HashMap y(java.util.ArrayList r7) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.ArrayList r1 = t(r7)
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        Lf:
            if (r4 >= r2) goto L22
            java.lang.Object r5 = r1.get(r4)
            int r4 = r4 + 1
            android.util.Rational r5 = (android.util.Rational) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r0.put(r5, r6)
            goto Lf
        L22:
            int r1 = r7.size()
        L26:
            if (r3 >= r1) goto L54
            java.lang.Object r2 = r7.get(r3)
            int r3 = r3 + 1
            android.util.Size r2 = (android.util.Size) r2
            java.util.Set r4 = r0.keySet()
            java.util.Iterator r4 = r4.iterator()
        L38:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L26
            java.lang.Object r5 = r4.next()
            android.util.Rational r5 = (android.util.Rational) r5
            boolean r6 = defpackage.mv.a(r5, r2)
            if (r6 == 0) goto L38
            java.lang.Object r5 = r0.get(r5)
            java.util.List r5 = (java.util.List) r5
            r5.add(r2)
            goto L38
        L54:
            return r0
    }

    public void B(android.app.Activity r5, defpackage.kv7 r6) {
            r4 = this;
            java.lang.Object r0 = r4.R
            java.util.WeakHashMap r0 = (java.util.WeakHashMap) r0
            r5.getClass()
            java.lang.Object r1 = r4.L
            java.util.concurrent.locks.ReentrantLock r1 = (java.util.concurrent.locks.ReentrantLock) r1
            r1.lock()
            java.lang.Object r2 = r0.get(r5)     // Catch: java.lang.Throwable -> L5c
            kv7 r2 = (defpackage.kv7) r2     // Catch: java.lang.Throwable -> L5c
            boolean r2 = r6.equals(r2)     // Catch: java.lang.Throwable -> L5c
            if (r2 == 0) goto L1e
            r1.unlock()
            return
        L1e:
            java.lang.Object r0 = r0.put(r5, r6)     // Catch: java.lang.Throwable -> L5c
            kv7 r0 = (defpackage.kv7) r0     // Catch: java.lang.Throwable -> L5c
            r1.unlock()
            java.lang.Object r4 = r4.B
            s35 r4 = (defpackage.s35) r4
            java.lang.Object r4 = r4.A
            zh6 r4 = (defpackage.zh6) r4
            java.util.concurrent.CopyOnWriteArrayList r4 = r4.b
            java.util.Iterator r4 = r4.iterator()
            r4.getClass()
        L38:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L5b
            java.lang.Object r0 = r4.next()
            yh6 r0 = (defpackage.yh6) r0
            android.app.Activity r1 = r0.a
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L4d
            goto L38
        L4d:
            r0.d = r6
            java.util.concurrent.Executor r1 = r0.b
            q64 r2 = new q64
            r3 = 6
            r2.<init>(r3, r0, r6)
            r1.execute(r2)
            goto L38
        L5b:
            return
        L5c:
            r4 = move-exception
            r1.unlock()
            throw r4
    }

    public void C(defpackage.st3 r3) {
            r2 = this;
            java.lang.Object r0 = r2.R
            jc6 r0 = (defpackage.jc6) r0
            if (r0 == 0) goto L9
            r0.run()
        L9:
            jc6 r0 = new jc6
            java.lang.Object r1 = r2.B
            ku3 r1 = (defpackage.ku3) r1
            r0.<init>(r1, r3)
            r2.R = r0
            java.lang.Object r2 = r2.L
            android.os.Handler r2 = (android.os.Handler) r2
            r2.postAtFrontOfQueue(r0)
            return
    }

    public void D() {
            r0 = this;
            java.lang.Object r0 = r0.L
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            r0.recycle()
            return
    }

    public void E(defpackage.y54 r6) {
            r5 = this;
            java.lang.Object r5 = r5.R
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r0 = r5.size()
            r1 = 0
        L9:
            if (r1 >= r0) goto L1f
            java.lang.Object r2 = r5.get(r1)
            int r1 = r1 + 1
            r3 = r2
            y54 r3 = (defpackage.y54) r3
            int r3 = r3.a()
            int r4 = r6.a()
            if (r3 != r4) goto L9
            goto L20
        L1f:
            r2 = 0
        L20:
            if (r2 != 0) goto L26
            r5.add(r6)
            return
        L26:
            java.lang.Exception r5 = new java.lang.Exception
            int r6 = r6.a()
            java.lang.String r0 = "Migration from version "
            java.lang.String r1 = " already exists"
            java.lang.String r6 = defpackage.lb1.k(r0, r6, r1)
            r5.<init>(r6)
            throw r5
    }

    public void F(java.lang.Object r6) {
            r5 = this;
            long r0 = defpackage.kj2.s()
            long r2 = defpackage.s57.a
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto Ld
            r5.R = r6
            return
        Ld:
            java.lang.Object r2 = r5.L
            monitor-enter(r2)
            java.lang.Object r3 = r5.B     // Catch: java.lang.Throwable -> L2d
            java.util.concurrent.atomic.AtomicReference r3 = (java.util.concurrent.atomic.AtomicReference) r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L2d
            o57 r3 = (defpackage.o57) r3     // Catch: java.lang.Throwable -> L2d
            int r4 = r3.a(r0)     // Catch: java.lang.Throwable -> L2d
            if (r4 >= 0) goto L2f
            java.lang.Object r5 = r5.B     // Catch: java.lang.Throwable -> L2d
            java.util.concurrent.atomic.AtomicReference r5 = (java.util.concurrent.atomic.AtomicReference) r5     // Catch: java.lang.Throwable -> L2d
            o57 r6 = r3.b(r0, r6)     // Catch: java.lang.Throwable -> L2d
            r5.set(r6)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r2)
            return
        L2d:
            r5 = move-exception
            goto L35
        L2f:
            java.lang.Object[] r5 = r3.c     // Catch: java.lang.Throwable -> L2d
            r5[r4] = r6     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r2)
            return
        L35:
            monitor-exit(r2)
            throw r5
    }

    public void I() {
            r3 = this;
            java.lang.Object r0 = r3.B
            ja4 r0 = (defpackage.ja4) r0
            java.lang.Object r1 = r3.L
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r0.k(r1)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L17
            java.lang.Object r3 = r3.R
            on2 r3 = (defpackage.on2) r3
            r2.remove(r3)
        L17:
            if (r2 == 0) goto L23
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L20
            goto L23
        L20:
            r0.m(r1, r2)
        L23:
            return
    }

    @Override // defpackage.ye4
    public boolean a() {
            r6 = this;
            java.lang.Object r6 = r6.B
            android.net.ConnectivityManager r6 = (android.net.ConnectivityManager) r6
            android.net.Network[] r0 = r6.getAllNetworks()
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lb:
            if (r3 >= r1) goto L22
            r4 = r0[r3]
            android.net.NetworkCapabilities r4 = r6.getNetworkCapabilities(r4)
            if (r4 == 0) goto L1f
            r5 = 12
            boolean r4 = r4.hasCapability(r5)
            if (r4 == 0) goto L1f
            r6 = 1
            return r6
        L1f:
            int r3 = r3 + 1
            goto Lb
        L22:
            return r2
    }

    @Override // defpackage.g36
    public java.lang.Object apply(java.lang.Object r22) {
            r21 = this;
            r0 = r21
            int r1 = r0.A
            java.lang.String r2 = "bytes"
            r3 = 1
            java.lang.Object r4 = r0.B
            r5 = 0
            r6 = 0
            i36 r4 = (defpackage.i36) r4
            switch(r1) {
                case 11: goto L177;
                default: goto L10;
            }
        L10:
            java.lang.Object r1 = r0.L
            fz r1 = (defpackage.fz) r1
            java.lang.Object r0 = r0.R
            hy r0 = (defpackage.hy) r0
            w32 r7 = r0.c
            r8 = r22
            android.database.sqlite.SQLiteDatabase r8 = (android.database.sqlite.SQLiteDatabase) r8
            c42 r9 = defpackage.i36.X
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            android.database.sqlite.SQLiteDatabase r10 = r4.e()
            java.lang.String r11 = "PRAGMA page_count"
            android.database.sqlite.SQLiteStatement r10 = r10.compileStatement(r11)
            long r10 = r10.simpleQueryForLong()
            android.database.sqlite.SQLiteDatabase r12 = r4.e()
            java.lang.String r13 = "PRAGMA page_size"
            android.database.sqlite.SQLiteStatement r12 = r12.compileStatement(r13)
            long r12 = r12.simpleQueryForLong()
            long r12 = r12 * r10
            iy r4 = r4.R
            long r10 = r4.a
            int r10 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r10 < 0) goto L51
            r0 = -1
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L176
        L51:
            java.lang.Long r10 = defpackage.i36.h(r8, r1)
            if (r10 == 0) goto L5c
            long r10 = r10.longValue()
            goto L8f
        L5c:
            android.content.ContentValues r10 = new android.content.ContentValues
            r10.<init>()
            java.lang.String r11 = "backend_name"
            java.lang.String r12 = r1.a
            r10.put(r11, r12)
            b35 r11 = r1.c
            int r11 = defpackage.d35.a(r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r12 = "priority"
            r10.put(r12, r11)
            java.lang.String r11 = "next_request_ms"
            r10.put(r11, r9)
            byte[] r1 = r1.b
            if (r1 == 0) goto L89
            java.lang.String r11 = "extras"
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r5)
            r10.put(r11, r1)
        L89:
            java.lang.String r1 = "transport_contexts"
            long r10 = r8.insert(r1, r6, r10)
        L8f:
            int r1 = r4.e
            byte[] r4 = r7.b
            int r12 = r4.length
            if (r12 > r1) goto L98
            r12 = r3
            goto L99
        L98:
            r12 = r5
        L99:
            android.content.ContentValues r13 = new android.content.ContentValues
            r13.<init>()
            java.lang.String r14 = "context_id"
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r13.put(r14, r10)
            java.lang.String r10 = "transport_name"
            java.lang.String r11 = r0.a
            r13.put(r10, r11)
            long r10 = r0.d
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            java.lang.String r11 = "timestamp_ms"
            r13.put(r11, r10)
            long r10 = r0.e
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            java.lang.String r11 = "uptime_ms"
            r13.put(r11, r10)
            c42 r7 = r7.a
            java.lang.String r7 = r7.a
            java.lang.String r10 = "payload_encoding"
            r13.put(r10, r7)
            java.lang.String r7 = "code"
            java.lang.Integer r10 = r0.b
            r13.put(r7, r10)
            java.lang.String r7 = "num_attempts"
            r13.put(r7, r9)
            java.lang.String r7 = "inline"
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r12)
            r13.put(r7, r9)
            if (r12 == 0) goto Le6
            r5 = r4
            goto Le8
        Le6:
            byte[] r5 = new byte[r5]
        Le8:
            java.lang.String r7 = "payload"
            r13.put(r7, r5)
            java.lang.String r5 = "events"
            long r9 = r8.insert(r5, r6, r13)
            java.lang.String r5 = "event_id"
            if (r12 != 0) goto L130
            int r7 = r4.length
            double r11 = (double) r7
            double r13 = (double) r1
            double r11 = r11 / r13
            double r11 = java.lang.Math.ceil(r11)
            int r7 = (int) r11
        L100:
            if (r3 > r7) goto L130
            int r11 = r3 + (-1)
            int r11 = r11 * r1
            int r12 = r3 * r1
            int r13 = r4.length
            int r12 = java.lang.Math.min(r12, r13)
            byte[] r11 = java.util.Arrays.copyOfRange(r4, r11, r12)
            android.content.ContentValues r12 = new android.content.ContentValues
            r12.<init>()
            java.lang.Long r13 = java.lang.Long.valueOf(r9)
            r12.put(r5, r13)
            java.lang.String r13 = "sequence_num"
            java.lang.Integer r14 = java.lang.Integer.valueOf(r3)
            r12.put(r13, r14)
            r12.put(r2, r11)
            java.lang.String r11 = "event_payloads"
            r8.insert(r11, r6, r12)
            int r3 = r3 + 1
            goto L100
        L130:
            java.util.Map r0 = r0.f
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L13e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L172
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            android.content.ContentValues r2 = new android.content.ContentValues
            r2.<init>()
            java.lang.Long r3 = java.lang.Long.valueOf(r9)
            r2.put(r5, r3)
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "name"
            r2.put(r4, r3)
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r3 = "value"
            r2.put(r3, r1)
            java.lang.String r1 = "event_metadata"
            r8.insert(r1, r6, r2)
            goto L13e
        L172:
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
        L176:
            return r0
        L177:
            java.lang.Object r1 = r0.L
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r0 = r0.R
            fz r0 = (defpackage.fz) r0
            r7 = r22
            android.database.Cursor r7 = (android.database.Cursor) r7
            c42 r8 = defpackage.i36.X
        L185:
            boolean r8 = r7.moveToNext()
            if (r8 == 0) goto L297
            long r8 = r7.getLong(r5)
            r10 = 7
            int r10 = r7.getInt(r10)
            if (r10 == 0) goto L198
            r10 = r3
            goto L199
        L198:
            r10 = r5
        L199:
            pa r11 = new pa
            r12 = 4
            r11.<init>(r12, r5)
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            r11.Z = r13
            java.lang.String r13 = r7.getString(r3)
            if (r13 == 0) goto L28f
            r11.B = r13
            r13 = 2
            long r13 = r7.getLong(r13)
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            r11.X = r13
            r13 = 3
            long r13 = r7.getLong(r13)
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            r11.Y = r13
            if (r10 == 0) goto L1ea
            w32 r10 = new w32
            java.lang.String r12 = r7.getString(r12)
            if (r12 != 0) goto L1d1
            c42 r12 = defpackage.i36.X
            goto L1d7
        L1d1:
            c42 r13 = new c42
            r13.<init>(r12)
            r12 = r13
        L1d7:
            r13 = 5
            byte[] r13 = r7.getBlob(r13)
            r10.<init>(r12, r13)
            r11.R = r10
            r19 = r2
            r20 = r4
            r4 = r5
            r17 = r6
            goto L263
        L1ea:
            w32 r10 = new w32
            java.lang.String r12 = r7.getString(r12)
            if (r12 != 0) goto L1f5
            c42 r12 = defpackage.i36.X
            goto L1fb
        L1f5:
            c42 r13 = new c42
            r13.<init>(r12)
            r12 = r13
        L1fb:
            android.database.sqlite.SQLiteDatabase r13 = r4.e()
            java.lang.String[] r15 = new java.lang.String[]{r2}
            java.lang.String r14 = java.lang.String.valueOf(r8)
            java.lang.String[] r17 = new java.lang.String[]{r14}
            r19 = 0
            java.lang.String r20 = "sequence_num"
            java.lang.String r14 = "event_payloads"
            java.lang.String r16 = "event_id = ?"
            r18 = 0
            android.database.Cursor r13 = r13.query(r14, r15, r16, r17, r18, r19, r20)
            c42 r14 = defpackage.i36.X     // Catch: java.lang.Throwable -> L28a
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L28a
            r14.<init>()     // Catch: java.lang.Throwable -> L28a
            r15 = r5
        L221:
            boolean r16 = r13.moveToNext()     // Catch: java.lang.Throwable -> L28a
            if (r16 == 0) goto L232
            byte[] r3 = r13.getBlob(r5)     // Catch: java.lang.Throwable -> L28a
            r14.add(r3)     // Catch: java.lang.Throwable -> L28a
            int r3 = r3.length     // Catch: java.lang.Throwable -> L28a
            int r15 = r15 + r3
            r3 = 1
            goto L221
        L232:
            byte[] r3 = new byte[r15]     // Catch: java.lang.Throwable -> L28a
            r15 = r5
            r17 = r6
            r6 = r15
        L238:
            int r5 = r14.size()     // Catch: java.lang.Throwable -> L28a
            if (r15 >= r5) goto L256
            java.lang.Object r5 = r14.get(r15)     // Catch: java.lang.Throwable -> L28a
            byte[] r5 = (byte[]) r5     // Catch: java.lang.Throwable -> L28a
            r19 = r2
            int r2 = r5.length     // Catch: java.lang.Throwable -> L28a
            r20 = r4
            r4 = 0
            java.lang.System.arraycopy(r5, r4, r3, r6, r2)     // Catch: java.lang.Throwable -> L28a
            int r2 = r5.length     // Catch: java.lang.Throwable -> L28a
            int r6 = r6 + r2
            int r15 = r15 + 1
            r2 = r19
            r4 = r20
            goto L238
        L256:
            r19 = r2
            r20 = r4
            r4 = 0
            r13.close()
            r10.<init>(r12, r3)
            r11.R = r10
        L263:
            r2 = 6
            boolean r3 = r7.isNull(r2)
            if (r3 != 0) goto L274
            int r2 = r7.getInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r11.L = r2
        L274:
            hy r2 = r11.f()
            ty r3 = new ty
            r3.<init>(r8, r0, r2)
            r1.add(r3)
            r5 = r4
            r6 = r17
            r2 = r19
            r4 = r20
            r3 = 1
            goto L185
        L28a:
            r0 = move-exception
            r13.close()
            throw r0
        L28f:
            r17 = r6
            java.lang.String r0 = "Null transportName"
            defpackage.u34.x(r0)
            goto L299
        L297:
            r17 = r6
        L299:
            return r17
    }

    public void c(defpackage.b1 r4) {
            r3 = this;
            java.lang.Object r0 = r3.R
            java.util.HashSet r0 = (java.util.HashSet) r0
            java.lang.Object r1 = r3.L
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            boolean r2 = r1.contains(r4)
            if (r2 != 0) goto L3d
            boolean r2 = r0.contains(r4)
            if (r2 != 0) goto L38
            r0.add(r4)
            r4.a(r3)
            r0.remove(r4)
            boolean r3 = r1.contains(r4)
            if (r3 != 0) goto L3d
            java.lang.Class<m51> r3 = defpackage.m51.class
            java.lang.Class r0 = r4.getClass()
            boolean r3 = r3.isAssignableFrom(r0)
            if (r3 == 0) goto L34
            r3 = 0
            r1.add(r3, r4)
            return
        L34:
            r1.add(r4)
            return
        L38:
            java.lang.String r3 = "Cyclic dependency chain found: "
            defpackage.e41.y(r0, r3)
        L3d:
            return
    }

    public void d(defpackage.qv6 r10, java.util.Map.Entry r11) {
            r9 = this;
            java.lang.Object r0 = r11.getValue()
            r2 = r0
            qv6 r2 = (defpackage.qv6) r2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "     -> outputEdge = "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "SurfaceProcessorNode"
            defpackage.kj2.t(r1, r0)
            yy r0 = r10.g
            android.util.Size r4 = r0.a
            java.lang.Object r0 = r11.getKey()
            ry r0 = (defpackage.ry) r0
            android.graphics.Rect r5 = r0.d
            boolean r10 = r10.c
            r0 = 0
            if (r10 == 0) goto L31
            java.lang.Object r10 = r9.L
            eg0 r10 = (defpackage.eg0) r10
            r6 = r10
            goto L32
        L31:
            r6 = r0
        L32:
            java.lang.Object r10 = r11.getKey()
            ry r10 = (defpackage.ry) r10
            int r7 = r10.f
            java.lang.Object r10 = r11.getKey()
            ry r10 = (defpackage.ry) r10
            boolean r8 = r10.g
            zy r3 = new zy
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object r10 = r11.getKey()
            ry r10 = (defpackage.ry) r10
            int r4 = r10.c
            r2.getClass()
            defpackage.nj2.h()
            r2.a()
            boolean r10 = r2.j
            r11 = 1
            r10 = r10 ^ r11
            java.lang.String r1 = "Consumer can only be linked once."
            defpackage.np2.A(r1, r10)
            r2.j = r11
            r5 = r3
            pv6 r3 = r2.l
            gx3 r10 = r3.c()
            ov6 r1 = new ov6
            r6 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            ov2 r11 = defpackage.u24.x()
            ll0 r10 = defpackage.l.T(r10, r1, r11)
            rr6 r11 = new rr6
            r11.<init>(r9, r2)
            ov2 r9 = defpackage.u24.x()
            uo2 r0 = new uo2
            r1 = 0
            r0.<init>(r1, r10, r11)
            r10.a(r9, r0)
            return
    }

    public java.lang.Object e() {
            r1 = this;
            java.lang.Object r0 = r1.L
            monitor-enter(r0)
            java.lang.Object r1 = r1.B     // Catch: java.lang.Throwable -> Ld
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch: java.lang.Throwable -> Ld
            java.lang.Object r1 = r1.removeLast()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return r1
        Ld:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    public java.lang.Object f() {
            r4 = this;
            long r0 = defpackage.kj2.s()
            long r2 = defpackage.s57.a
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto Ld
            java.lang.Object r4 = r4.R
            return r4
        Ld:
            java.lang.Object r4 = r4.B
            java.util.concurrent.atomic.AtomicReference r4 = (java.util.concurrent.atomic.AtomicReference) r4
            java.lang.Object r4 = r4.get()
            o57 r4 = (defpackage.o57) r4
            int r0 = r4.a(r0)
            if (r0 < 0) goto L22
            java.lang.Object[] r4 = r4.c
            r4 = r4[r0]
            return r4
        L22:
            r4 = 0
            return r4
    }

    public android.content.res.ColorStateList g(int r3) {
            r2 = this;
            java.lang.Object r0 = r2.L
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            boolean r1 = r0.hasValue(r3)
            if (r1 == 0) goto L1c
            r1 = 0
            int r1 = r0.getResourceId(r3, r1)
            if (r1 == 0) goto L1c
            java.lang.Object r2 = r2.B
            android.content.Context r2 = (android.content.Context) r2
            android.content.res.ColorStateList r2 = defpackage.ge7.A(r2, r1)
            if (r2 == 0) goto L1c
            return r2
        L1c:
            android.content.res.ColorStateList r2 = r0.getColorStateList(r3)
            return r2
    }

    @Override // defpackage.b51
    public java.lang.Object h(java.lang.Object r3) {
            r2 = this;
            java.lang.Object r0 = r2.R
            s35 r0 = (defpackage.s35) r0
            java.lang.Object r1 = r2.B
            n34 r1 = (defpackage.n34) r1
            java.lang.Object r2 = r2.L
            gg3 r2 = (defpackage.gg3) r2
            java.lang.Object r0 = r0.A
            id3 r0 = (defpackage.id3) r0
            java.lang.String r2 = r0.b(r2, r3)
            int r3 = defpackage.mk5.a
            lk5 r2 = defpackage.jx2.q(r2, r1)
            return r2
    }

    @Override // defpackage.so2
    public void i(java.lang.Throwable r5) {
            r4 = this;
            boolean r0 = r5 instanceof java.util.concurrent.CancellationException
            java.lang.Object r1 = r4.L
            qb0 r1 = (defpackage.qb0) r1
            r2 = 0
            if (r0 == 0) goto L20
            aw6 r0 = new aw6
            java.lang.Object r4 = r4.R
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r3 = " cancelled."
            java.lang.String r4 = r4.concat(r3)
            r0.<init>(r4, r5)
            boolean r4 = r1.c(r0)
            defpackage.np2.A(r2, r4)
            return
        L20:
            r1.a(r2)
            return
    }

    public long j() {
            r4 = this;
            java.lang.Object r4 = r4.B
            android.content.Context r4 = (android.content.Context) r4
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            r0.getClass()
            java.lang.String r4 = r4.getPackageName()
            r4.getClass()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L26
            r2 = 0
            android.content.pm.PackageManager$PackageInfoFlags r2 = defpackage.a81.b(r2)
            android.content.pm.PackageInfo r4 = defpackage.a81.s(r0, r4, r2)
            r4.getClass()
            goto L2e
        L26:
            r2 = 0
            android.content.pm.PackageInfo r4 = r0.getPackageInfo(r4, r2)
            r4.getClass()
        L2e:
            r0 = 28
            if (r1 < r0) goto L37
            long r0 = defpackage.pp.f(r4)
            return r0
        L37:
            int r4 = r4.versionCode
            long r0 = (long) r4
            return r0
    }

    public android.graphics.drawable.Drawable k(int r3) {
            r2 = this;
            java.lang.Object r0 = r2.L
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            boolean r1 = r0.hasValue(r3)
            if (r1 == 0) goto L1a
            r1 = 0
            int r1 = r0.getResourceId(r3, r1)
            if (r1 == 0) goto L1a
            java.lang.Object r2 = r2.B
            android.content.Context r2 = (android.content.Context) r2
            android.graphics.drawable.Drawable r2 = defpackage.hf.S(r2, r1)
            return r2
        L1a:
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r3)
            return r2
    }

    public android.graphics.drawable.Drawable l(int r4) {
            r3 = this;
            java.lang.Object r0 = r3.L
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            boolean r0 = r0.hasValue(r4)
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r3.L
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            r1 = 0
            int r4 = r0.getResourceId(r4, r1)
            if (r4 == 0) goto L2a
            ir r0 = defpackage.ir.a()
            java.lang.Object r3 = r3.B
            android.content.Context r3 = (android.content.Context) r3
            monitor-enter(r0)
            ol5 r1 = r0.a     // Catch: java.lang.Throwable -> L27
            r2 = 1
            android.graphics.drawable.Drawable r3 = r1.d(r3, r4, r2)     // Catch: java.lang.Throwable -> L27
            monitor-exit(r0)
            return r3
        L27:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            throw r3
        L2a:
            r3 = 0
            return r3
    }

    public int m() {
            r4 = this;
            cr4 r0 = r4.q()
            java.util.List r0 = r0.a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Le
            r4 = -1
            return r4
        Le:
            cr4 r0 = r4.q()
            java.util.List r0 = r0.a
            java.lang.Object r0 = defpackage.gt0.H0(r0)
            i34 r0 = (defpackage.i34) r0
            int r0 = r0.a
            long r0 = (long) r0
            cr4 r4 = r4.q()
            int r4 = r4.h
            long r2 = (long) r4
            long r0 = r0 - r2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L2c
            r0 = r2
        L2c:
            int r4 = (int) r0
            return r4
    }

    public android.graphics.Typeface n(int r10, int r11, defpackage.hs r12) {
            r9 = this;
            java.lang.Object r0 = r9.L
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            r1 = 0
            int r3 = r0.getResourceId(r10, r1)
            if (r3 != 0) goto Lc
            goto L2b
        Lc:
            java.lang.Object r10 = r9.R
            android.util.TypedValue r10 = (android.util.TypedValue) r10
            if (r10 != 0) goto L19
            android.util.TypedValue r10 = new android.util.TypedValue
            r10.<init>()
            r9.R = r10
        L19:
            java.lang.Object r10 = r9.B
            r2 = r10
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r9 = r9.R
            r4 = r9
            android.util.TypedValue r4 = (android.util.TypedValue) r4
            java.lang.ThreadLocal r9 = defpackage.sl5.a
            boolean r9 = r2.isRestricted()
            if (r9 == 0) goto L2d
        L2b:
            r9 = 0
            return r9
        L2d:
            r7 = 1
            r8 = 0
            r5 = r11
            r6 = r12
            android.graphics.Typeface r9 = defpackage.sl5.b(r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    public boolean o() {
            r0 = this;
            cr4 r0 = r0.q()
            java.util.List r0 = r0.a
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            return r0
    }

    @Override // defpackage.so2, com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(java.lang.Object r3) {
            r2 = this;
            android.view.Surface r3 = (android.view.Surface) r3
            java.lang.Object r3 = r2.B
            gx3 r3 = (defpackage.gx3) r3
            java.lang.Object r2 = r2.L
            qb0 r2 = (defpackage.qb0) r2
            uj1 r0 = defpackage.u24.j()
            r1 = 1
            defpackage.l.J(r1, r3, r2, r0)
            return
    }

    public int p() {
            r6 = this;
            cr4 r0 = r6.q()
            java.util.List r0 = r0.a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Le
            r6 = -1
            return r6
        Le:
            cr4 r0 = r6.q()
            java.util.List r0 = r0.a
            java.lang.Object r0 = defpackage.gt0.Q0(r0)
            i34 r0 = (defpackage.i34) r0
            int r0 = r0.a
            long r0 = (long) r0
            cr4 r2 = r6.q()
            int r2 = r2.h
            long r2 = (long) r2
            long r0 = r0 + r2
            int r6 = r6.w()
            long r2 = (long) r6
            r4 = 1
            long r2 = r2 - r4
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L32
            r0 = r2
        L32:
            int r6 = (int) r0
            return r6
    }

    public defpackage.cr4 q() {
            r0 = this;
            java.lang.Object r0 = r0.L
            cr4 r0 = (defpackage.cr4) r0
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.String r0 = "layoutInfo"
            defpackage.nb3.a0(r0)
            r0 = 0
            throw r0
    }

    public int r() {
            r2 = this;
            cr4 r0 = r2.q()
            java.util.List r0 = r0.a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Le
            r2 = 0
            return r2
        Le:
            cr4 r0 = r2.q()
            java.util.List r0 = r0.a
            java.lang.Object r0 = defpackage.gt0.Q0(r0)
            i34 r0 = (defpackage.i34) r0
            int r0 = r0.j
            cr4 r1 = r2.q()
            int r1 = r1.b
            int r0 = r0 + r1
            cr4 r1 = r2.q()
            int r1 = r1.c
            int r0 = r0 + r1
            cr4 r2 = r2.q()
            int r2 = r2.g
            int r0 = r0 - r2
            int r2 = java.lang.Math.abs(r0)
            return r2
    }

    public int s() {
            r2 = this;
            cr4 r0 = r2.q()
            java.util.List r0 = r0.a
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto Le
            return r1
        Le:
            cr4 r0 = r2.q()
            java.util.List r0 = r0.a
            java.lang.Object r0 = defpackage.gt0.H0(r0)
            i34 r0 = (defpackage.i34) r0
            int r0 = r0.j
            cr4 r2 = r2.q()
            int r2 = r2.f
            int r2 = -r2
            int r0 = r0 + r2
            if (r0 <= 0) goto L27
            goto L28
        L27:
            r1 = r0
        L28:
            int r2 = java.lang.Math.abs(r1)
            return r2
    }

    @Override // defpackage.ye4
    public void shutdown() {
            r1 = this;
            java.lang.Object r0 = r1.B
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            java.lang.Object r1 = r1.R
            c53 r1 = (defpackage.c53) r1
            r0.unregisterNetworkCallback(r1)
            return
    }

    public java.lang.String toString() {
            r4 = this;
            int r0 = r4.A
            java.lang.Object r1 = r4.B
            switch(r0) {
                case 3: goto L4a;
                case 10: goto Lc;
                default: goto L7;
            }
        L7:
            java.lang.String r4 = super.toString()
            return r4
        Lc:
            java.lang.Object r4 = r4.L
            java.util.List r4 = (java.util.List) r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Request{"
            r0.<init>(r2)
            android.net.Uri r1 = (android.net.Uri) r1
            r0.append(r1)
            if (r4 == 0) goto L40
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L40
            java.util.Iterator r4 = r4.iterator()
            boolean r1 = r4.hasNext()
            if (r1 != 0) goto L2f
            goto L40
        L2f:
            java.lang.Object r4 = r4.next()
            r1 = 0
            if (r4 == 0) goto L3a
            defpackage.u34.a()
            goto L49
        L3a:
            r4 = 32
            r0.append(r4)
            throw r1
        L40:
            r4 = 125(0x7d, float:1.75E-43)
            r0.append(r4)
            java.lang.String r1 = r0.toString()
        L49:
            return r1
        L4a:
            java.lang.Object r0 = r4.R
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r4 = r4.L
            java.lang.String r4 = (java.lang.String) r4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "NavDeepLinkRequest{"
            r2.<init>(r3)
            android.net.Uri r1 = (android.net.Uri) r1
            if (r1 == 0) goto L69
            java.lang.String r3 = " uri="
            r2.append(r3)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2.append(r1)
        L69:
            if (r4 == 0) goto L73
            java.lang.String r1 = " action="
            r2.append(r1)
            r2.append(r4)
        L73:
            if (r0 == 0) goto L7d
            java.lang.String r4 = " mimetype="
            r2.append(r4)
            r2.append(r0)
        L7d:
            java.lang.String r4 = " }"
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            return r4
    }

    public java.util.ArrayList u(defpackage.zi7 r15) {
            r14 = this;
            java.lang.Object r0 = r14.B
            cg0 r0 = (defpackage.cg0) r0
            r1 = r15
            n23 r1 = (defpackage.n23) r1
            xx r2 = defpackage.n23.x
            r3 = 0
            java.lang.Object r2 = r1.b(r2, r3)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L18
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r2)
            goto L19
        L18:
            r4 = r3
        L19:
            if (r4 == 0) goto L1c
            return r4
        L1c:
            xx r2 = defpackage.n23.w
            java.lang.Object r2 = r1.b(r2, r3)
            el5 r2 = (defpackage.el5) r2
            xx r4 = defpackage.n23.v
            java.lang.Object r4 = r1.b(r4, r3)
            java.util.List r4 = (java.util.List) r4
            int r5 = r15.q()
            if (r4 == 0) goto L51
            java.util.Iterator r4 = r4.iterator()
        L36:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L51
            java.lang.Object r6 = r4.next()
            android.util.Pair r6 = (android.util.Pair) r6
            java.lang.Object r7 = r6.first
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r7 != r5) goto L36
            java.lang.Object r4 = r6.second
            android.util.Size[] r4 = (android.util.Size[]) r4
            goto L52
        L51:
            r4 = r3
        L52:
            if (r4 != 0) goto L56
            r4 = r3
            goto L5a
        L56:
            java.util.List r4 = java.util.Arrays.asList(r4)
        L5a:
            if (r4 != 0) goto L60
            java.util.List r4 = r0.t(r5)
        L60:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r4)
            ru0 r4 = new ru0
            r6 = 1
            r4.<init>(r6)
            java.util.Collections.sort(r0, r4)
            boolean r4 = r0.isEmpty()
            java.lang.String r7 = "SupportedOutputSizesCollector"
            if (r4 == 0) goto L8c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r8 = "The retrieved supported resolutions from camera info internal is empty. Format is "
            r4.<init>(r8)
            r4.append(r5)
            java.lang.String r5 = "."
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            defpackage.kj2.f0(r7, r4)
        L8c:
            r4 = 0
            if (r2 != 0) goto L225
            java.lang.Object r14 = r14.R
            j50 r14 = (defpackage.j50) r14
            r14.getClass()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L9d
            return r0
        L9d:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            ru0 r0 = new ru0
            r0.<init>(r6)
            java.util.Collections.sort(r1, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            n23 r15 = (defpackage.n23) r15
            xx r2 = defpackage.n23.u
            java.lang.Object r2 = r15.b(r2, r3)
            android.util.Size r2 = (android.util.Size) r2
            java.lang.Object r5 = r1.get(r4)
            android.util.Size r5 = (android.util.Size) r5
            if (r2 == 0) goto Ld0
            int r7 = defpackage.mj6.a(r5)
            int r8 = r2.getWidth()
            int r9 = r2.getHeight()
            int r9 = r9 * r8
            if (r7 >= r9) goto Ld1
        Ld0:
            r2 = r5
        Ld1:
            android.util.Size r5 = r14.a(r15)
            android.util.Size r7 = defpackage.mj6.b
            int r8 = defpackage.mj6.a(r7)
            int r9 = defpackage.mj6.a(r2)
            if (r9 >= r8) goto Le4
            android.util.Size r7 = defpackage.mj6.a
            goto Lf2
        Le4:
            if (r5 == 0) goto Lf2
            int r9 = r5.getWidth()
            int r10 = r5.getHeight()
            int r10 = r10 * r9
            if (r10 >= r8) goto Lf2
            r7 = r5
        Lf2:
            int r8 = r1.size()
            r9 = r4
        Lf7:
            if (r9 >= r8) goto L129
            java.lang.Object r10 = r1.get(r9)
            int r9 = r9 + 1
            android.util.Size r10 = (android.util.Size) r10
            int r11 = defpackage.mj6.a(r10)
            int r12 = r2.getWidth()
            int r13 = r2.getHeight()
            int r13 = r13 * r12
            if (r11 > r13) goto Lf7
            int r11 = r10.getWidth()
            int r12 = r10.getHeight()
            int r12 = r12 * r11
            int r11 = defpackage.mj6.a(r7)
            if (r12 < r11) goto Lf7
            boolean r11 = r0.contains(r10)
            if (r11 != 0) goto Lf7
            r0.add(r10)
            goto Lf7
        L129:
            boolean r8 = r0.isEmpty()
            if (r8 != 0) goto L201
            xx r1 = defpackage.n23.o
            boolean r2 = r15.i(r1)
            if (r2 == 0) goto L148
            java.lang.Object r1 = r15.e(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            boolean r2 = r14.c
            android.util.Rational r1 = v(r1, r2)
            goto L179
        L148:
            android.util.Size r1 = r14.a(r15)
            if (r1 == 0) goto L178
            java.util.ArrayList r2 = t(r0)
            int r7 = r2.size()
            r8 = r4
        L157:
            if (r8 >= r7) goto L169
            java.lang.Object r9 = r2.get(r8)
            int r8 = r8 + 1
            android.util.Rational r9 = (android.util.Rational) r9
            boolean r10 = defpackage.mv.a(r9, r1)
            if (r10 == 0) goto L157
            r1 = r9
            goto L179
        L169:
            android.util.Rational r2 = new android.util.Rational
            int r7 = r1.getWidth()
            int r1 = r1.getHeight()
            r2.<init>(r7, r1)
            r1 = r2
            goto L179
        L178:
            r1 = r3
        L179:
            if (r5 != 0) goto L184
            xx r2 = defpackage.n23.t
            java.lang.Object r15 = r15.b(r2, r3)
            r5 = r15
            android.util.Size r5 = (android.util.Size) r5
        L184:
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            if (r1 != 0) goto L199
            r15.addAll(r0)
            if (r5 == 0) goto L200
            G(r15, r5, r6)
            return r15
        L199:
            java.util.HashMap r0 = y(r0)
            if (r5 == 0) goto L1bd
            java.util.Set r2 = r0.keySet()
            java.util.Iterator r2 = r2.iterator()
        L1a7:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L1bd
            java.lang.Object r3 = r2.next()
            android.util.Rational r3 = (android.util.Rational) r3
            java.lang.Object r3 = r0.get(r3)
            java.util.List r3 = (java.util.List) r3
            G(r3, r5, r6)
            goto L1a7
        L1bd:
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.Set r3 = r0.keySet()
            r2.<init>(r3)
            lv r3 = new lv
            java.io.Serializable r14 = r14.d
            android.util.Rational r14 = (android.util.Rational) r14
            r3.<init>(r1, r14)
            java.util.Collections.sort(r2, r3)
            int r14 = r2.size()
        L1d6:
            if (r4 >= r14) goto L200
            java.lang.Object r1 = r2.get(r4)
            int r4 = r4 + 1
            android.util.Rational r1 = (android.util.Rational) r1
            java.lang.Object r1 = r0.get(r1)
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r1 = r1.iterator()
        L1ea:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L1d6
            java.lang.Object r3 = r1.next()
            android.util.Size r3 = (android.util.Size) r3
            boolean r5 = r15.contains(r3)
            if (r5 != 0) goto L1ea
            r15.add(r3)
            goto L1ea
        L200:
            return r15
        L201:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r0 = "All supported output sizes are filtered out according to current resolution selection settings. \nminSize = "
            r15.<init>(r0)
            r15.append(r7)
            java.lang.String r0 = "\nmaxSize = "
            r15.append(r0)
            r15.append(r2)
            java.lang.String r0 = "\ninitial size list: "
            r15.append(r0)
            r15.append(r1)
            java.lang.String r15 = r15.toString()
            r14.<init>(r15)
            throw r14
        L225:
            r2 = r15
            n23 r2 = (defpackage.n23) r2
            xx r5 = defpackage.n23.u
            java.lang.Object r2 = r2.b(r5, r3)
            android.util.Size r2 = (android.util.Size) r2
            r1.K(r4)
            xx r3 = defpackage.zi7.S
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            java.lang.Object r3 = r15.b(r3, r5)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L246
            r15.q()
        L246:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "useCaseConfig = "
            r3.<init>(r5)
            r3.append(r15)
            java.lang.String r15 = ", candidateSizes = "
            r3.append(r15)
            r3.append(r0)
            java.lang.String r15 = r3.toString()
            defpackage.kj2.t(r7, r15)
            xx r15 = defpackage.n23.w
            java.lang.Object r15 = r1.e(r15)
            el5 r15 = (defpackage.el5) r15
            java.lang.Object r14 = r14.L
            android.util.Rational r14 = (android.util.Rational) r14
            cs1 r1 = r15.a
            java.util.HashMap r0 = y(r0)
            if (r14 == 0) goto L27d
            int r3 = r14.getNumerator()
            int r5 = r14.getDenominator()
            if (r3 < r5) goto L27f
        L27d:
            r3 = r6
            goto L280
        L27f:
            r3 = r4
        L280:
            r1.getClass()
            android.util.Rational r1 = v(r4, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            java.util.Set r5 = r0.keySet()
            r3.<init>(r5)
            lv r5 = new lv
            r5.<init>(r1, r14)
            java.util.Collections.sort(r3, r5)
            java.util.LinkedHashMap r14 = new java.util.LinkedHashMap
            r14.<init>()
            int r1 = r3.size()
            r5 = r4
        L2a2:
            if (r5 >= r1) goto L2b6
            java.lang.Object r7 = r3.get(r5)
            int r5 = r5 + 1
            android.util.Rational r7 = (android.util.Rational) r7
            java.lang.Object r8 = r0.get(r7)
            java.util.List r8 = (java.util.List) r8
            r14.put(r7, r8)
            goto L2a2
        L2b6:
            if (r2 == 0) goto L303
            android.util.Size r0 = defpackage.mj6.a
            int r0 = r2.getWidth()
            int r1 = r2.getHeight()
            int r1 = r1 * r0
            java.util.Set r0 = r14.keySet()
            java.util.Iterator r0 = r0.iterator()
        L2cb:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L303
            java.lang.Object r2 = r0.next()
            android.util.Rational r2 = (android.util.Rational) r2
            java.lang.Object r2 = r14.get(r2)
            java.util.List r2 = (java.util.List) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r5 = r2.iterator()
        L2e6:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L2fc
            java.lang.Object r7 = r5.next()
            android.util.Size r7 = (android.util.Size) r7
            int r8 = defpackage.mj6.a(r7)
            if (r8 > r1) goto L2e6
            r3.add(r7)
            goto L2e6
        L2fc:
            r2.clear()
            r2.addAll(r3)
            goto L2cb
        L303:
            fl5 r15 = r15.b
            if (r15 != 0) goto L308
            goto L35c
        L308:
            java.util.Set r0 = r14.keySet()
            java.util.Iterator r0 = r0.iterator()
        L310:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L35c
            java.lang.Object r1 = r0.next()
            android.util.Rational r1 = (android.util.Rational) r1
            java.lang.Object r1 = r14.get(r1)
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L329
            goto L310
        L329:
            int r2 = r15.b
            fl5 r3 = defpackage.fl5.c
            if (r15 == r3) goto L310
            android.util.Size r3 = r15.a
            if (r2 == 0) goto L34f
            if (r2 == r6) goto L34b
            r5 = 2
            if (r2 == r5) goto L347
            r5 = 3
            if (r2 == r5) goto L343
            r5 = 4
            if (r2 == r5) goto L33f
            goto L310
        L33f:
            H(r1, r3, r4)
            goto L310
        L343:
            H(r1, r3, r6)
            goto L310
        L347:
            G(r1, r3, r4)
            goto L310
        L34b:
            G(r1, r3, r6)
            goto L310
        L34f:
            boolean r2 = r1.contains(r3)
            r1.clear()
            if (r2 == 0) goto L310
            r1.add(r3)
            goto L310
        L35c:
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Collection r14 = r14.values()
            java.util.Iterator r14 = r14.iterator()
        L369:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L38f
            java.lang.Object r0 = r14.next()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r0 = r0.iterator()
        L379:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L369
            java.lang.Object r1 = r0.next()
            android.util.Size r1 = (android.util.Size) r1
            boolean r2 = r15.contains(r1)
            if (r2 != 0) goto L379
            r15.add(r1)
            goto L379
        L38f:
            return r15
    }

    public int w() {
            r0 = this;
            java.lang.Object r0 = r0.B
            jr4 r0 = (defpackage.jr4) r0
            java.lang.Object r0 = r0.c()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            return r0
    }

    public defpackage.rb7 x(defpackage.c42 r3, defpackage.q97 r4) {
            r2 = this;
            java.lang.Object r0 = r2.B
            java.util.Set r0 = (java.util.Set) r0
            boolean r1 = r0.contains(r3)
            if (r1 == 0) goto L18
            rb7 r0 = new rb7
            java.lang.Object r1 = r2.L
            fz r1 = (defpackage.fz) r1
            java.lang.Object r2 = r2.R
            sb7 r2 = (defpackage.sb7) r2
            r0.<init>(r1, r3, r4, r2)
            return r0
        L18:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "%s is not supported byt this factory. Supported encodings are: %s."
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r0}
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r2.<init>(r3)
            throw r2
    }

    public boolean z() {
            r2 = this;
            java.lang.Object r0 = r2.B
            pp6 r0 = (defpackage.pp6) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Object r1 = r2.R
            if (r0 != r1) goto L1b
            java.lang.Object r2 = r2.L
            m44 r2 = (defpackage.m44) r2
            if (r2 == 0) goto L19
            boolean r2 = r2.z()
            if (r2 == 0) goto L19
            goto L1b
        L19:
            r2 = 0
            return r2
        L1b:
            r2 = 1
            return r2
    }
}

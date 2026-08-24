package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jx6  reason: default package */
/* loaded from: classes.dex */
public final class jx6 implements android.content.ComponentCallbacks2 {
    public final java.lang.ref.WeakReference A;
    public android.content.Context B;
    public defpackage.ye4 L;
    public boolean R;
    public boolean X;

    public jx6(defpackage.pe5 r2) {
            r1 = this;
            r1.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.A = r0
            r2 = 1
            r1.X = r2
            return
    }

    public final synchronized void a() {
            r4 = this;
            monitor-enter(r4)
            java.lang.ref.WeakReference r0 = r4.A     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L3c
            pe5 r0 = (defpackage.pe5) r0     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L4c
            ye4 r1 = r4.L     // Catch: java.lang.Throwable -> L3c
            if (r1 != 0) goto L4f
            m23 r1 = r0.d     // Catch: java.lang.Throwable -> L3c
            boolean r1 = r1.b     // Catch: java.lang.Throwable -> L3c
            r2 = 3
            if (r1 == 0) goto L3e
            android.content.Context r0 = r0.a     // Catch: java.lang.Throwable -> L3c
            java.lang.Class<android.net.ConnectivityManager> r1 = android.net.ConnectivityManager.class
            java.lang.Object r1 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> L3c
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto L36
            java.lang.String r3 = "android.permission.ACCESS_NETWORK_STATE"
            int r0 = defpackage.ge7.s(r0, r3)     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto L36
            m44 r0 = new m44     // Catch: java.lang.Exception -> L30 java.lang.Throwable -> L3c
            r0.<init>(r1, r4)     // Catch: java.lang.Exception -> L30 java.lang.Throwable -> L3c
            goto L43
        L30:
            w31 r0 = new w31     // Catch: java.lang.Throwable -> L3c
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L3c
            goto L43
        L36:
            w31 r0 = new w31     // Catch: java.lang.Throwable -> L3c
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L3c
            goto L43
        L3c:
            r0 = move-exception
            goto L51
        L3e:
            w31 r0 = new w31     // Catch: java.lang.Throwable -> L3c
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L3c
        L43:
            r4.L = r0     // Catch: java.lang.Throwable -> L3c
            boolean r0 = r0.a()     // Catch: java.lang.Throwable -> L3c
            r4.X = r0     // Catch: java.lang.Throwable -> L3c
            goto L4f
        L4c:
            r4.b()     // Catch: java.lang.Throwable -> L3c
        L4f:
            monitor-exit(r4)
            return
        L51:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3c
            throw r0
    }

    public final synchronized void b() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.R     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L7
            monitor-exit(r1)
            return
        L7:
            r0 = 1
            r1.R = r0     // Catch: java.lang.Throwable -> L12
            android.content.Context r0 = r1.B     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            r0.unregisterComponentCallbacks(r1)     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r0 = move-exception
            goto L22
        L14:
            ye4 r0 = r1.L     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L1b
            r0.shutdown()     // Catch: java.lang.Throwable -> L12
        L1b:
            java.lang.ref.WeakReference r0 = r1.A     // Catch: java.lang.Throwable -> L12
            r0.clear()     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1)
            return
        L22:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            throw r0
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            monitor-enter(r0)
            java.lang.ref.WeakReference r1 = r0.A     // Catch: java.lang.Throwable -> L11
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L11
            pe5 r1 = (defpackage.pe5) r1     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto Lc
            goto Lf
        Lc:
            r0.b()     // Catch: java.lang.Throwable -> L11
        Lf:
            monitor-exit(r0)
            return
        L11:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onLowMemory() {
            r1 = this;
            monitor-enter(r1)
            r0 = 80
            r1.onTrimMemory(r0)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    @Override // android.content.ComponentCallbacks2
    public final synchronized void onTrimMemory(int r3) {
            r2 = this;
            monitor-enter(r2)
            java.lang.ref.WeakReference r0 = r2.A     // Catch: java.lang.Throwable -> L25
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L25
            pe5 r0 = (defpackage.pe5) r0     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L20
            ex6 r0 = r0.c     // Catch: java.lang.Throwable -> L25
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L25
            se5 r0 = (defpackage.se5) r0     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L23
            at6 r1 = r0.a     // Catch: java.lang.Throwable -> L25
            r1.b(r3)     // Catch: java.lang.Throwable -> L25
            rs7 r0 = r0.b     // Catch: java.lang.Throwable -> L25
            r0.b(r3)     // Catch: java.lang.Throwable -> L25
            goto L23
        L20:
            r2.b()     // Catch: java.lang.Throwable -> L25
        L23:
            monitor-exit(r2)
            return
        L25:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L25
            throw r3
    }
}

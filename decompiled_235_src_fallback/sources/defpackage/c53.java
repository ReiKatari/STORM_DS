package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c53  reason: default package */
/* loaded from: classes.dex */
public final class c53 extends android.net.ConnectivityManager.NetworkCallback {
    public static final /* synthetic */ int c = 0;
    public final /* synthetic */ int a;
    public final java.lang.Object b;

    public c53(defpackage.bi2 r2) {
            r1 = this;
            r0 = 0
            r1.a = r0
            r1.<init>()
            r1.b = r2
            return
    }

    public /* synthetic */ c53(java.lang.Object r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(android.net.Network r2) {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 3: goto L9;
                default: goto L5;
            }
        L5:
            super.onAvailable(r2)
            return
        L9:
            java.lang.Object r1 = r1.b
            m44 r1 = (defpackage.m44) r1
            r0 = 1
            defpackage.m44.b(r1, r2, r0)
            return
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onBlockedStatusChanged(android.net.Network r8, boolean r9) {
            r7 = this;
            int r0 = r7.a
            switch(r0) {
                case 2: goto L9;
                default: goto L5;
            }
        L5:
            super.onBlockedStatusChanged(r8, r9)
            return
        L9:
            r8.getClass()
            java.lang.Object r0 = r7.b
            if4 r0 = (defpackage.if4) r0
            android.net.ConnectivityManager r0 = r0.g
            android.net.Network r0 = r0.getActiveNetwork()
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L6b
            ga0 r8 = defpackage.ga0.f()
            java.lang.String r0 = defpackage.hf4.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Network blocked status changed: "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            r8.b(r0, r1)
            java.lang.Object r8 = r7.b
            if4 r8 = (defpackage.if4) r8
            java.lang.Object r0 = r8.e
            if (r0 != 0) goto L3f
            java.lang.Object r0 = r8.d()
        L3f:
            gf4 r0 = (defpackage.gf4) r0
            java.lang.Object r8 = r7.b
            if4 r8 = (defpackage.if4) r8
            java.lang.Object r1 = r8.h
            monitor-enter(r1)
            boolean r2 = r8.i     // Catch: java.lang.Throwable -> L67
            if (r2 != r9) goto L4e
            monitor-exit(r1)
            goto L6b
        L4e:
            r8.i = r9     // Catch: java.lang.Throwable -> L67
            monitor-exit(r1)
            java.lang.Object r7 = r7.b
            if4 r7 = (defpackage.if4) r7
            boolean r2 = r0.a
            boolean r3 = r0.b
            boolean r4 = r0.c
            boolean r5 = r0.d
            gf4 r1 = new gf4
            r6 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r7.f(r1)
            goto L6b
        L67:
            r0 = move-exception
            r7 = r0
            monitor-exit(r1)
            throw r7
        L6b:
            return
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(android.net.Network r4, android.net.NetworkCapabilities r5) {
            r3 = this;
            int r0 = r3.a
            switch(r0) {
                case 0: goto L54;
                case 1: goto L36;
                case 2: goto L9;
                default: goto L5;
            }
        L5:
            super.onCapabilitiesChanged(r4, r5)
            return
        L9:
            r4.getClass()
            r5.getClass()
            ga0 r4 = defpackage.ga0.f()
            java.lang.String r0 = defpackage.hf4.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Network capabilities changed: "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r4.b(r0, r5)
            java.lang.Object r3 = r3.b
            if4 r3 = (defpackage.if4) r3
            android.net.ConnectivityManager r4 = r3.g
            boolean r5 = r3.i
            gf4 r4 = defpackage.hf4.a(r4, r5)
            r3.f(r4)
            return
        L36:
            r4.getClass()
            r5.getClass()
            r4 = 16
            boolean r4 = r5.hasCapability(r4)
            java.lang.Object r3 = r3.b
            r35 r3 = (defpackage.r35) r3
            if (r4 == 0) goto L4e
            ue4 r4 = defpackage.ue4.CONNECTED
            r3.c(r4)
            goto L53
        L4e:
            ue4 r4 = defpackage.ue4.DISCONNECTED
            r3.c(r4)
        L53:
            return
        L54:
            r4.getClass()
            r5.getClass()
            ga0 r4 = defpackage.ga0.f()
            java.lang.String r5 = defpackage.zv7.a
            java.lang.String r0 = "NetworkRequestConstraintController onCapabilitiesChanged callback"
            r4.b(r5, r0)
            java.lang.Object r3 = r3.b
            bi2 r3 = (defpackage.bi2) r3
            v21 r4 = defpackage.v21.a
            r3.g(r4)
            return
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(android.net.Network r7) {
            r6 = this;
            int r0 = r6.a
            java.lang.Object r6 = r6.b
            switch(r0) {
                case 0: goto L37;
                case 1: goto L2c;
                case 2: goto Le;
                default: goto L7;
            }
        L7:
            m44 r6 = (defpackage.m44) r6
            r0 = 0
            defpackage.m44.b(r6, r7, r0)
            return
        Le:
            r7.getClass()
            ga0 r7 = defpackage.ga0.f()
            java.lang.String r0 = defpackage.hf4.a
            java.lang.String r1 = "Network connection lost"
            r7.b(r0, r1)
            if4 r6 = (defpackage.if4) r6
            gf4 r0 = new gf4
            r4 = 0
            r5 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f(r0)
            return
        L2c:
            r7.getClass()
            r35 r6 = (defpackage.r35) r6
            ue4 r7 = defpackage.ue4.DISCONNECTED
            r6.c(r7)
            return
        L37:
            r7.getClass()
            ga0 r7 = defpackage.ga0.f()
            java.lang.String r0 = defpackage.zv7.a
            java.lang.String r1 = "NetworkRequestConstraintController onLost callback"
            r7.b(r0, r1)
            bi2 r6 = (defpackage.bi2) r6
            w21 r7 = new w21
            r0 = 7
            r7.<init>(r0)
            r6.g(r7)
            return
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onUnavailable() {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 1: goto L9;
                default: goto L5;
            }
        L5:
            super.onUnavailable()
            return
        L9:
            java.lang.Object r1 = r1.b
            r35 r1 = (defpackage.r35) r1
            ue4 r0 = defpackage.ue4.DISCONNECTED
            r1.c(r0)
            return
    }
}

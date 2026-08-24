package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zak implements android.os.Handler.Callback {
    final java.util.ArrayList zaa;
    @org.checkerframework.checker.initialization.qual.NotOnlyInitialized
    private final com.google.android.gms.common.internal.zaj zab;
    private final java.util.ArrayList zac;
    private final java.util.ArrayList zad;
    private volatile boolean zae;
    private final java.util.concurrent.atomic.AtomicInteger zaf;
    private boolean zag;
    private final android.os.Handler zah;
    private final java.lang.Object zai;

    public zak(android.os.Looper r3, com.google.android.gms.common.internal.zaj r4) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.zac = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.zaa = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.zad = r0
            r0 = 0
            r2.zae = r0
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r1.<init>(r0)
            r2.zaf = r1
            r2.zag = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.zai = r0
            r2.zab = r4
            b08 r4 = new b08
            r4.<init>(r3, r2)
            r2.zah = r4
            return
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r4) {
            r3 = this;
            int r0 = r4.what
            r1 = 1
            if (r0 != r1) goto L2b
            java.lang.Object r4 = r4.obj
            com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks r4 = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) r4
            java.lang.Object r2 = r3.zai
            monitor-enter(r2)
            boolean r0 = r3.zae     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L27
            com.google.android.gms.common.internal.zaj r0 = r3.zab     // Catch: java.lang.Throwable -> L25
            boolean r0 = r0.isConnected()     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L27
            java.util.ArrayList r3 = r3.zac     // Catch: java.lang.Throwable -> L25
            boolean r3 = r3.contains(r4)     // Catch: java.lang.Throwable -> L25
            if (r3 == 0) goto L27
            r3 = 0
            r4.onConnected(r3)     // Catch: java.lang.Throwable -> L25
            goto L27
        L25:
            r3 = move-exception
            goto L29
        L27:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L25
            return r1
        L29:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L25
            throw r3
        L2b:
            java.lang.String r3 = "Don't know how to handle message: "
            java.lang.String r3 = defpackage.lb1.g(r0, r3)
            java.lang.Exception r4 = new java.lang.Exception
            r4.<init>()
            java.lang.String r0 = "GmsClientEvents"
            android.util.Log.wtf(r0, r3, r4)
            r3 = 0
            return r3
    }

    public final void zaa() {
            r1 = this;
            r0 = 0
            r1.zae = r0
            java.util.concurrent.atomic.AtomicInteger r1 = r1.zaf
            r1.incrementAndGet()
            return
    }

    public final void zab() {
            r1 = this;
            r0 = 1
            r1.zae = r0
            return
    }

    public final void zac(com.google.android.gms.common.ConnectionResult r8) {
            r7 = this;
            android.os.Handler r0 = r7.zah
            java.lang.String r1 = "onConnectionFailure must only be called on the Handler thread"
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(r0, r1)
            android.os.Handler r0 = r7.zah
            r1 = 1
            r0.removeMessages(r1)
            java.lang.Object r0 = r7.zai
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L45
            java.util.ArrayList r2 = r7.zad     // Catch: java.lang.Throwable -> L45
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L45
            java.util.concurrent.atomic.AtomicInteger r2 = r7.zaf     // Catch: java.lang.Throwable -> L45
            int r2 = r2.get()     // Catch: java.lang.Throwable -> L45
            int r3 = r1.size()     // Catch: java.lang.Throwable -> L45
            r4 = 0
        L22:
            if (r4 >= r3) goto L49
            java.lang.Object r5 = r1.get(r4)     // Catch: java.lang.Throwable -> L45
            int r4 = r4 + 1
            com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener r5 = (com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) r5     // Catch: java.lang.Throwable -> L45
            boolean r6 = r7.zae     // Catch: java.lang.Throwable -> L45
            if (r6 == 0) goto L47
            java.util.concurrent.atomic.AtomicInteger r6 = r7.zaf     // Catch: java.lang.Throwable -> L45
            int r6 = r6.get()     // Catch: java.lang.Throwable -> L45
            if (r6 == r2) goto L39
            goto L47
        L39:
            java.util.ArrayList r6 = r7.zad     // Catch: java.lang.Throwable -> L45
            boolean r6 = r6.contains(r5)     // Catch: java.lang.Throwable -> L45
            if (r6 == 0) goto L22
            r5.onConnectionFailed(r8)     // Catch: java.lang.Throwable -> L45
            goto L22
        L45:
            r7 = move-exception
            goto L4b
        L47:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            return
        L49:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            return
        L4b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            throw r7
    }

    public final void zad(android.os.Bundle r9) {
            r8 = this;
            android.os.Handler r0 = r8.zah
            java.lang.String r1 = "onConnectionSuccess must only be called on the Handler thread"
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(r0, r1)
            java.lang.Object r0 = r8.zai
            monitor-enter(r0)
            boolean r1 = r8.zag     // Catch: java.lang.Throwable -> L5f
            r2 = 1
            r1 = r1 ^ r2
            com.google.android.gms.common.internal.Preconditions.checkState(r1)     // Catch: java.lang.Throwable -> L5f
            android.os.Handler r1 = r8.zah     // Catch: java.lang.Throwable -> L5f
            r1.removeMessages(r2)     // Catch: java.lang.Throwable -> L5f
            r8.zag = r2     // Catch: java.lang.Throwable -> L5f
            java.util.ArrayList r1 = r8.zaa     // Catch: java.lang.Throwable -> L5f
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L5f
            com.google.android.gms.common.internal.Preconditions.checkState(r1)     // Catch: java.lang.Throwable -> L5f
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5f
            java.util.ArrayList r2 = r8.zac     // Catch: java.lang.Throwable -> L5f
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L5f
            java.util.concurrent.atomic.AtomicInteger r2 = r8.zaf     // Catch: java.lang.Throwable -> L5f
            int r2 = r2.get()     // Catch: java.lang.Throwable -> L5f
            int r3 = r1.size()     // Catch: java.lang.Throwable -> L5f
            r4 = 0
            r5 = r4
        L34:
            if (r5 >= r3) goto L61
            java.lang.Object r6 = r1.get(r5)     // Catch: java.lang.Throwable -> L5f
            int r5 = r5 + 1
            com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks r6 = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) r6     // Catch: java.lang.Throwable -> L5f
            boolean r7 = r8.zae     // Catch: java.lang.Throwable -> L5f
            if (r7 == 0) goto L61
            com.google.android.gms.common.internal.zaj r7 = r8.zab     // Catch: java.lang.Throwable -> L5f
            boolean r7 = r7.isConnected()     // Catch: java.lang.Throwable -> L5f
            if (r7 == 0) goto L61
            java.util.concurrent.atomic.AtomicInteger r7 = r8.zaf     // Catch: java.lang.Throwable -> L5f
            int r7 = r7.get()     // Catch: java.lang.Throwable -> L5f
            if (r7 == r2) goto L53
            goto L61
        L53:
            java.util.ArrayList r7 = r8.zaa     // Catch: java.lang.Throwable -> L5f
            boolean r7 = r7.contains(r6)     // Catch: java.lang.Throwable -> L5f
            if (r7 != 0) goto L34
            r6.onConnected(r9)     // Catch: java.lang.Throwable -> L5f
            goto L34
        L5f:
            r8 = move-exception
            goto L6a
        L61:
            java.util.ArrayList r9 = r8.zaa     // Catch: java.lang.Throwable -> L5f
            r9.clear()     // Catch: java.lang.Throwable -> L5f
            r8.zag = r4     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5f
            return
        L6a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5f
            throw r8
    }

    public final void zae(int r9) {
            r8 = this;
            android.os.Handler r0 = r8.zah
            java.lang.String r1 = "onUnintentionalDisconnection must only be called on the Handler thread"
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(r0, r1)
            android.os.Handler r0 = r8.zah
            r1 = 1
            r0.removeMessages(r1)
            java.lang.Object r0 = r8.zai
            monitor-enter(r0)
            r8.zag = r1     // Catch: java.lang.Throwable -> L48
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L48
            java.util.ArrayList r2 = r8.zac     // Catch: java.lang.Throwable -> L48
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L48
            java.util.concurrent.atomic.AtomicInteger r2 = r8.zaf     // Catch: java.lang.Throwable -> L48
            int r2 = r2.get()     // Catch: java.lang.Throwable -> L48
            int r3 = r1.size()     // Catch: java.lang.Throwable -> L48
            r4 = 0
            r5 = r4
        L25:
            if (r5 >= r3) goto L4a
            java.lang.Object r6 = r1.get(r5)     // Catch: java.lang.Throwable -> L48
            int r5 = r5 + 1
            com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks r6 = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) r6     // Catch: java.lang.Throwable -> L48
            boolean r7 = r8.zae     // Catch: java.lang.Throwable -> L48
            if (r7 == 0) goto L4a
            java.util.concurrent.atomic.AtomicInteger r7 = r8.zaf     // Catch: java.lang.Throwable -> L48
            int r7 = r7.get()     // Catch: java.lang.Throwable -> L48
            if (r7 == r2) goto L3c
            goto L4a
        L3c:
            java.util.ArrayList r7 = r8.zac     // Catch: java.lang.Throwable -> L48
            boolean r7 = r7.contains(r6)     // Catch: java.lang.Throwable -> L48
            if (r7 == 0) goto L25
            r6.onConnectionSuspended(r9)     // Catch: java.lang.Throwable -> L48
            goto L25
        L48:
            r8 = move-exception
            goto L53
        L4a:
            java.util.ArrayList r9 = r8.zaa     // Catch: java.lang.Throwable -> L48
            r9.clear()     // Catch: java.lang.Throwable -> L48
            r8.zag = r4     // Catch: java.lang.Throwable -> L48
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            return
        L53:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            throw r8
    }

    public final void zaf(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r6) {
            r5 = this;
            java.lang.String r0 = "registerConnectionCallbacks(): listener "
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            java.lang.Object r1 = r5.zai
            monitor-enter(r1)
            java.util.ArrayList r2 = r5.zac     // Catch: java.lang.Throwable -> L2b
            boolean r2 = r2.contains(r6)     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L2d
            java.lang.String r2 = "GmsClientEvents"
            java.lang.String r3 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L2b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L2b
            r4.append(r3)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r0 = " is already registered"
            r4.append(r0)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L2b
            android.util.Log.w(r2, r0)     // Catch: java.lang.Throwable -> L2b
            goto L32
        L2b:
            r5 = move-exception
            goto L46
        L2d:
            java.util.ArrayList r0 = r5.zac     // Catch: java.lang.Throwable -> L2b
            r0.add(r6)     // Catch: java.lang.Throwable -> L2b
        L32:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.common.internal.zaj r0 = r5.zab
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L45
            android.os.Handler r5 = r5.zah
            r0 = 1
            android.os.Message r6 = r5.obtainMessage(r0, r6)
            r5.sendMessage(r6)
        L45:
            return
        L46:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2b
            throw r5
    }

    public final void zag(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r4) {
            r3 = this;
            java.lang.String r0 = "registerConnectionFailedListener(): listener "
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            java.lang.Object r1 = r3.zai
            monitor-enter(r1)
            java.util.ArrayList r2 = r3.zad     // Catch: java.lang.Throwable -> L2b
            boolean r2 = r2.contains(r4)     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L2d
            java.lang.String r3 = "GmsClientEvents"
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L2b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L2b
            r2.append(r4)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r4 = " is already registered"
            r2.append(r4)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> L2b
            android.util.Log.w(r3, r4)     // Catch: java.lang.Throwable -> L2b
            goto L32
        L2b:
            r3 = move-exception
            goto L34
        L2d:
            java.util.ArrayList r3 = r3.zad     // Catch: java.lang.Throwable -> L2b
            r3.add(r4)     // Catch: java.lang.Throwable -> L2b
        L32:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2b
            return
        L34:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2b
            throw r3
    }

    public final void zah(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r4) {
            r3 = this;
            java.lang.String r0 = "unregisterConnectionCallbacks(): listener "
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            java.lang.Object r1 = r3.zai
            monitor-enter(r1)
            java.util.ArrayList r2 = r3.zac     // Catch: java.lang.Throwable -> L2b
            boolean r2 = r2.remove(r4)     // Catch: java.lang.Throwable -> L2b
            if (r2 != 0) goto L2d
            java.lang.String r3 = "GmsClientEvents"
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L2b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L2b
            r2.append(r4)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r4 = " not found"
            r2.append(r4)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> L2b
            android.util.Log.w(r3, r4)     // Catch: java.lang.Throwable -> L2b
            goto L36
        L2b:
            r3 = move-exception
            goto L38
        L2d:
            boolean r0 = r3.zag     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L36
            java.util.ArrayList r3 = r3.zaa     // Catch: java.lang.Throwable -> L2b
            r3.add(r4)     // Catch: java.lang.Throwable -> L2b
        L36:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2b
            return
        L38:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2b
            throw r3
    }

    public final void zai(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r4) {
            r3 = this;
            java.lang.String r0 = "unregisterConnectionFailedListener(): listener "
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            java.lang.Object r1 = r3.zai
            monitor-enter(r1)
            java.util.ArrayList r3 = r3.zad     // Catch: java.lang.Throwable -> L2b
            boolean r3 = r3.remove(r4)     // Catch: java.lang.Throwable -> L2b
            if (r3 != 0) goto L2d
            java.lang.String r3 = "GmsClientEvents"
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L2b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L2b
            r2.append(r4)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r4 = " not found"
            r2.append(r4)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> L2b
            android.util.Log.w(r3, r4)     // Catch: java.lang.Throwable -> L2b
            goto L2d
        L2b:
            r3 = move-exception
            goto L2f
        L2d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2b
            return
        L2f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2b
            throw r3
    }

    public final boolean zaj(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r2) {
            r1 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            java.lang.Object r0 = r1.zai
            monitor-enter(r0)
            java.util.ArrayList r1 = r1.zac     // Catch: java.lang.Throwable -> Le
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    public final boolean zak(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r2) {
            r1 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            java.lang.Object r0 = r1.zai
            monitor-enter(r0)
            java.util.ArrayList r1 = r1.zad     // Catch: java.lang.Throwable -> Le
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }
}

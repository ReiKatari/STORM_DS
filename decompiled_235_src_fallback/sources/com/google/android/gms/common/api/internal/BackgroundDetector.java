package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class BackgroundDetector implements android.app.Application.ActivityLifecycleCallbacks, android.content.ComponentCallbacks2 {
    private static final com.google.android.gms.common.api.internal.BackgroundDetector zza = null;
    private final java.util.concurrent.atomic.AtomicBoolean zzb;
    private final java.util.concurrent.atomic.AtomicBoolean zzc;
    private final java.util.ArrayList zzd;
    private boolean zze;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public interface BackgroundStateChangeListener {
        void onBackgroundStateChanged(boolean r1);
    }

    static {
            com.google.android.gms.common.api.internal.BackgroundDetector r0 = new com.google.android.gms.common.api.internal.BackgroundDetector
            r0.<init>()
            com.google.android.gms.common.api.internal.BackgroundDetector.zza = r0
            return
    }

    private BackgroundDetector() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r1.zzb = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r1.zzc = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.zzd = r0
            r0 = 0
            r1.zze = r0
            return
    }

    public static com.google.android.gms.common.api.internal.BackgroundDetector getInstance() {
            com.google.android.gms.common.api.internal.BackgroundDetector r0 = com.google.android.gms.common.api.internal.BackgroundDetector.zza
            return r0
    }

    public static void initialize(android.app.Application r2) {
            com.google.android.gms.common.api.internal.BackgroundDetector r0 = com.google.android.gms.common.api.internal.BackgroundDetector.zza
            monitor-enter(r0)
            boolean r1 = r0.zze     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto L13
            r2.registerActivityLifecycleCallbacks(r0)     // Catch: java.lang.Throwable -> L11
            r2.registerComponentCallbacks(r0)     // Catch: java.lang.Throwable -> L11
            r2 = 1
            r0.zze = r2     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r2 = move-exception
            goto L15
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r2
    }

    private final void zza(boolean r5) {
            r4 = this;
            com.google.android.gms.common.api.internal.BackgroundDetector r0 = com.google.android.gms.common.api.internal.BackgroundDetector.zza
            monitor-enter(r0)
            java.util.ArrayList r4 = r4.zzd     // Catch: java.lang.Throwable -> L18
            int r1 = r4.size()     // Catch: java.lang.Throwable -> L18
            r2 = 0
        La:
            if (r2 >= r1) goto L1a
            java.lang.Object r3 = r4.get(r2)     // Catch: java.lang.Throwable -> L18
            int r2 = r2 + 1
            com.google.android.gms.common.api.internal.BackgroundDetector$BackgroundStateChangeListener r3 = (com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener) r3     // Catch: java.lang.Throwable -> L18
            r3.onBackgroundStateChanged(r5)     // Catch: java.lang.Throwable -> L18
            goto La
        L18:
            r4 = move-exception
            goto L1c
        L1a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r4
    }

    public void addListener(com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener r2) {
            r1 = this;
            com.google.android.gms.common.api.internal.BackgroundDetector r0 = com.google.android.gms.common.api.internal.BackgroundDetector.zza
            monitor-enter(r0)
            java.util.ArrayList r1 = r1.zzd     // Catch: java.lang.Throwable -> La
            r1.add(r2)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    public boolean isInBackground() {
            r0 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.zzb
            boolean r0 = r0.get()
            return r0
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity r3, android.os.Bundle r4) {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r3 = r2.zzc
            java.util.concurrent.atomic.AtomicBoolean r4 = r2.zzb
            r0 = 1
            r1 = 0
            boolean r4 = r4.compareAndSet(r0, r1)
            r3.set(r0)
            if (r4 == 0) goto L12
            r2.zza(r1)
        L12:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity r1) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity r1) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r4 = r3.zzc
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.zzb
            r1 = 1
            r2 = 0
            boolean r0 = r0.compareAndSet(r1, r2)
            r4.set(r1)
            if (r0 == 0) goto L12
            r3.zza(r2)
        L12:
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity r1, android.os.Bundle r2) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity r1) {
            r0 = this;
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity r1) {
            r0 = this;
            return
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            return
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
            r0 = this;
            return
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int r3) {
            r2 = this;
            r0 = 20
            if (r3 != r0) goto L16
            java.util.concurrent.atomic.AtomicBoolean r3 = r2.zzb
            r0 = 0
            r1 = 1
            boolean r3 = r3.compareAndSet(r0, r1)
            if (r3 == 0) goto L16
            java.util.concurrent.atomic.AtomicBoolean r3 = r2.zzc
            r3.set(r1)
            r2.zza(r1)
        L16:
            return
    }

    public boolean readCurrentStateIfPossible(boolean r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.zzc
            boolean r0 = r0.get()
            if (r0 != 0) goto L2c
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastJellyBean()
            if (r0 == 0) goto L2b
            android.app.ActivityManager$RunningAppProcessInfo r3 = new android.app.ActivityManager$RunningAppProcessInfo
            r3.<init>()
            android.app.ActivityManager.getMyMemoryState(r3)
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.zzc
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 != 0) goto L2c
            int r3 = r3.importance
            r0 = 100
            if (r3 <= r0) goto L2c
            java.util.concurrent.atomic.AtomicBoolean r3 = r2.zzb
            r3.set(r1)
            goto L2c
        L2b:
            return r3
        L2c:
            boolean r2 = r2.isInBackground()
            return r2
    }
}

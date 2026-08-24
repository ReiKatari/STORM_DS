package com.google.android.gms.common.stats;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ConnectionTracker {
    private static final java.lang.Object zzb = null;
    private static volatile com.google.android.gms.common.stats.ConnectionTracker zzc;
    public final java.util.concurrent.ConcurrentHashMap zza;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.common.stats.ConnectionTracker.zzb = r0
            return
    }

    private ConnectionTracker() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.zza = r0
            return
    }

    public static com.google.android.gms.common.stats.ConnectionTracker getInstance() {
            com.google.android.gms.common.stats.ConnectionTracker r0 = com.google.android.gms.common.stats.ConnectionTracker.zzc
            if (r0 != 0) goto L19
            java.lang.Object r0 = com.google.android.gms.common.stats.ConnectionTracker.zzb
            monitor-enter(r0)
            com.google.android.gms.common.stats.ConnectionTracker r1 = com.google.android.gms.common.stats.ConnectionTracker.zzc     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.google.android.gms.common.stats.ConnectionTracker r1 = new com.google.android.gms.common.stats.ConnectionTracker     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.google.android.gms.common.stats.ConnectionTracker.zzc = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.google.android.gms.common.stats.ConnectionTracker r0 = com.google.android.gms.common.stats.ConnectionTracker.zzc
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            return r0
    }

    private static void zzb(android.content.Context r0, android.content.ServiceConnection r1) {
            r0.unbindService(r1)     // Catch: java.lang.Throwable -> L3
        L3:
            return
    }

    private final boolean zzc(android.content.Context r4, java.lang.String r5, android.content.Intent r6, android.content.ServiceConnection r7, int r8, boolean r9, java.util.concurrent.Executor r10) {
            r3 = this;
            android.content.ComponentName r9 = r6.getComponent()
            java.lang.String r0 = "ConnectionTracker"
            r1 = 0
            if (r9 != 0) goto La
            goto L28
        La:
            java.lang.String r9 = r9.getPackageName()
            java.lang.String r2 = "com.google.android.gms"
            r2.equals(r9)
            com.google.android.gms.common.wrappers.PackageManagerWrapper r2 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L28
            android.content.pm.ApplicationInfo r9 = r2.getApplicationInfo(r9, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L28
            int r9 = r9.flags     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L28
            r2 = 2097152(0x200000, float:2.938736E-39)
            r9 = r9 & r2
            if (r9 == 0) goto L28
            java.lang.String r3 = "Attempted to bind to a service in a STOPPED package."
            android.util.Log.w(r0, r3)
            return r1
        L28:
            boolean r9 = zzd(r7)
            if (r9 == 0) goto L5f
            java.util.concurrent.ConcurrentHashMap r9 = r3.zza
            java.lang.Object r9 = r9.putIfAbsent(r7, r7)
            android.content.ServiceConnection r9 = (android.content.ServiceConnection) r9
            if (r9 == 0) goto L4b
            if (r7 == r9) goto L4b
            java.lang.String r9 = r6.getAction()
            java.lang.Object[] r5 = new java.lang.Object[]{r7, r5, r9}
            java.lang.String r9 = "Duplicate binding with the same ServiceConnection: %s, %s, %s."
            java.lang.String r5 = java.lang.String.format(r9, r5)
            android.util.Log.w(r0, r5)
        L4b:
            boolean r4 = zze(r4, r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L58
            if (r4 == 0) goto L52
            goto L63
        L52:
            java.util.concurrent.ConcurrentHashMap r3 = r3.zza
            r3.remove(r7, r7)
            return r1
        L58:
            r4 = move-exception
            java.util.concurrent.ConcurrentHashMap r3 = r3.zza
            r3.remove(r7, r7)
            throw r4
        L5f:
            boolean r4 = zze(r4, r6, r7, r8, r10)
        L63:
            return r4
    }

    private static boolean zzd(android.content.ServiceConnection r0) {
            boolean r0 = r0 instanceof com.google.android.gms.common.internal.zzt
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    private static final boolean zze(android.content.Context r1, android.content.Intent r2, android.content.ServiceConnection r3, int r4, java.util.concurrent.Executor r5) {
            if (r5 != 0) goto L3
            r5 = 0
        L3:
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastQ()
            if (r0 == 0) goto L10
            if (r5 == 0) goto L10
            boolean r1 = defpackage.yz0.s(r1, r2, r3, r4, r5)
            return r1
        L10:
            boolean r1 = r1.bindService(r2, r3, r4)
            return r1
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public boolean bindService(android.content.Context r10, android.content.Intent r11, android.content.ServiceConnection r12, int r13) {
            r9 = this;
            java.lang.Class r0 = r10.getClass()
            java.lang.String r3 = r0.getName()
            r7 = 1
            r8 = 0
            r1 = r9
            r2 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            boolean r9 = r1.zzc(r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    public void unbindService(android.content.Context r2, android.content.ServiceConnection r3) {
            r1 = this;
            boolean r0 = zzd(r3)
            if (r0 == 0) goto L26
            java.util.concurrent.ConcurrentHashMap r0 = r1.zza
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L26
            java.util.concurrent.ConcurrentHashMap r0 = r1.zza     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L1f
            android.content.ServiceConnection r0 = (android.content.ServiceConnection) r0     // Catch: java.lang.Throwable -> L1f
            zzb(r2, r0)     // Catch: java.lang.Throwable -> L1f
            java.util.concurrent.ConcurrentHashMap r1 = r1.zza
            r1.remove(r3)
            return
        L1f:
            r2 = move-exception
            java.util.concurrent.ConcurrentHashMap r1 = r1.zza
            r1.remove(r3)
            throw r2
        L26:
            zzb(r2, r3)
            return
    }

    public void unbindServiceSafe(android.content.Context r1, android.content.ServiceConnection r2) {
            r0 = this;
            r0.unbindService(r1, r2)     // Catch: java.lang.IllegalArgumentException -> L3
        L3:
            return
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean zza(android.content.Context r9, java.lang.String r10, android.content.Intent r11, android.content.ServiceConnection r12, int r13, java.util.concurrent.Executor r14) {
            r8 = this;
            r5 = 4225(0x1081, float:5.92E-42)
            r6 = 1
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r7 = r14
            boolean r8 = r0.zzc(r1, r2, r3, r4, r5, r6, r7)
            return r8
    }
}

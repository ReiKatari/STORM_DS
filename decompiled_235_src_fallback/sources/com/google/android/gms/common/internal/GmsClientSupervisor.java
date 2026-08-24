package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class GmsClientSupervisor {
    static android.os.HandlerThread zza = null;
    private static final java.lang.Object zzb = null;
    private static com.google.android.gms.common.internal.zzs zzc = null;
    private static java.util.concurrent.Executor zzd = null;
    private static boolean zze = false;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.common.internal.GmsClientSupervisor.zzb = r0
            return
    }

    public GmsClientSupervisor() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getDefaultBindFlags() {
            r0 = 4225(0x1081, float:5.92E-42)
            return r0
    }

    public static com.google.android.gms.common.internal.GmsClientSupervisor getInstance(android.content.Context r4) {
            java.lang.Object r0 = com.google.android.gms.common.internal.GmsClientSupervisor.zzb
            monitor-enter(r0)
            com.google.android.gms.common.internal.zzs r1 = com.google.android.gms.common.internal.GmsClientSupervisor.zzc     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L27
            com.google.android.gms.common.internal.zzs r1 = new com.google.android.gms.common.internal.zzs     // Catch: java.lang.Throwable -> L1a
            android.content.Context r2 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L1a
            boolean r3 = com.google.android.gms.common.internal.GmsClientSupervisor.zze     // Catch: java.lang.Throwable -> L1a
            if (r3 == 0) goto L1c
            android.os.HandlerThread r4 = getOrStartHandlerThread()     // Catch: java.lang.Throwable -> L1a
            android.os.Looper r4 = r4.getLooper()     // Catch: java.lang.Throwable -> L1a
            goto L20
        L1a:
            r4 = move-exception
            goto L2b
        L1c:
            android.os.Looper r4 = r4.getMainLooper()     // Catch: java.lang.Throwable -> L1a
        L20:
            java.util.concurrent.Executor r3 = com.google.android.gms.common.internal.GmsClientSupervisor.zzd     // Catch: java.lang.Throwable -> L1a
            r1.<init>(r2, r4, r3)     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.common.internal.GmsClientSupervisor.zzc = r1     // Catch: java.lang.Throwable -> L1a
        L27:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.common.internal.zzs r4 = com.google.android.gms.common.internal.GmsClientSupervisor.zzc
            return r4
        L2b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r4
    }

    public static android.os.HandlerThread getOrStartHandlerThread() {
            java.lang.Object r0 = com.google.android.gms.common.internal.GmsClientSupervisor.zzb
            monitor-enter(r0)
            android.os.HandlerThread r1 = com.google.android.gms.common.internal.GmsClientSupervisor.zza     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return r1
        L9:
            r1 = move-exception
            goto L1d
        Lb:
            android.os.HandlerThread r1 = new android.os.HandlerThread     // Catch: java.lang.Throwable -> L9
            java.lang.String r2 = "GoogleApiHandler"
            r3 = 9
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L9
            com.google.android.gms.common.internal.GmsClientSupervisor.zza = r1     // Catch: java.lang.Throwable -> L9
            r1.start()     // Catch: java.lang.Throwable -> L9
            android.os.HandlerThread r1 = com.google.android.gms.common.internal.GmsClientSupervisor.zza     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return r1
        L1d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r1
    }

    public static android.os.HandlerThread getOrStartHandlerThread(int r3) {
            java.lang.Object r0 = com.google.android.gms.common.internal.GmsClientSupervisor.zzb
            monitor-enter(r0)
            android.os.HandlerThread r1 = com.google.android.gms.common.internal.GmsClientSupervisor.zza     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return r1
        L9:
            r3 = move-exception
            goto L1b
        Lb:
            android.os.HandlerThread r1 = new android.os.HandlerThread     // Catch: java.lang.Throwable -> L9
            java.lang.String r2 = "GoogleApiHandler"
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L9
            com.google.android.gms.common.internal.GmsClientSupervisor.zza = r1     // Catch: java.lang.Throwable -> L9
            r1.start()     // Catch: java.lang.Throwable -> L9
            android.os.HandlerThread r3 = com.google.android.gms.common.internal.GmsClientSupervisor.zza     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return r3
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r3
    }

    public static void setDefaultBindExecutor(java.util.concurrent.Executor r2) {
            java.lang.Object r0 = com.google.android.gms.common.internal.GmsClientSupervisor.zzb
            monitor-enter(r0)
            com.google.android.gms.common.internal.zzs r1 = com.google.android.gms.common.internal.GmsClientSupervisor.zzc     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto Ld
            r1.zzi(r2)     // Catch: java.lang.Throwable -> Lb
            goto Ld
        Lb:
            r2 = move-exception
            goto L11
        Ld:
            com.google.android.gms.common.internal.GmsClientSupervisor.zzd = r2     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        L11:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }

    public static void setUseHandlerThreadForCallbacks() {
            java.lang.Object r0 = com.google.android.gms.common.internal.GmsClientSupervisor.zzb
            monitor-enter(r0)
            com.google.android.gms.common.internal.zzs r1 = com.google.android.gms.common.internal.GmsClientSupervisor.zzc     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L19
            boolean r2 = com.google.android.gms.common.internal.GmsClientSupervisor.zze     // Catch: java.lang.Throwable -> L17
            if (r2 != 0) goto L19
            android.os.HandlerThread r2 = getOrStartHandlerThread()     // Catch: java.lang.Throwable -> L17
            android.os.Looper r2 = r2.getLooper()     // Catch: java.lang.Throwable -> L17
            r1.zzj(r2)     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r1 = move-exception
            goto L1e
        L19:
            r1 = 1
            com.google.android.gms.common.internal.GmsClientSupervisor.zze = r1     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r1
    }

    public boolean bindService(android.content.ComponentName r3, android.content.ServiceConnection r4, java.lang.String r5) {
            r2 = this;
            com.google.android.gms.common.internal.zzo r0 = new com.google.android.gms.common.internal.zzo
            r1 = 4225(0x1081, float:5.92E-42)
            r0.<init>(r3, r1)
            r3 = 0
            boolean r2 = r2.zzc(r0, r4, r5, r3)
            return r2
    }

    public boolean bindService(android.content.ComponentName r3, android.content.ServiceConnection r4, java.lang.String r5, java.util.concurrent.Executor r6) {
            r2 = this;
            com.google.android.gms.common.internal.zzo r0 = new com.google.android.gms.common.internal.zzo
            r1 = 4225(0x1081, float:5.92E-42)
            r0.<init>(r3, r1)
            boolean r2 = r2.zzc(r0, r4, r5, r6)
            return r2
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public boolean bindService(java.lang.String r4, android.content.ServiceConnection r5, java.lang.String r6) {
            r3 = this;
            com.google.android.gms.common.internal.zzo r0 = new com.google.android.gms.common.internal.zzo
            r1 = 4225(0x1081, float:5.92E-42)
            r2 = 0
            r0.<init>(r4, r1, r2)
            r4 = 0
            boolean r3 = r3.zzc(r0, r5, r6, r4)
            return r3
    }

    public void unbindService(android.content.ComponentName r3, android.content.ServiceConnection r4, java.lang.String r5) {
            r2 = this;
            com.google.android.gms.common.internal.zzo r0 = new com.google.android.gms.common.internal.zzo
            r1 = 4225(0x1081, float:5.92E-42)
            r0.<init>(r3, r1)
            r2.zza(r0, r4, r5)
            return
    }

    public void unbindService(java.lang.String r4, android.content.ServiceConnection r5, java.lang.String r6) {
            r3 = this;
            com.google.android.gms.common.internal.zzo r0 = new com.google.android.gms.common.internal.zzo
            r1 = 4225(0x1081, float:5.92E-42)
            r2 = 0
            r0.<init>(r4, r1, r2)
            r3.zza(r0, r5, r6)
            return
    }

    public abstract void zza(com.google.android.gms.common.internal.zzo r1, android.content.ServiceConnection r2, java.lang.String r3);

    public final void zzb(java.lang.String r2, java.lang.String r3, int r4, android.content.ServiceConnection r5, java.lang.String r6, boolean r7) {
            r1 = this;
            com.google.android.gms.common.internal.zzo r4 = new com.google.android.gms.common.internal.zzo
            r0 = 4225(0x1081, float:5.92E-42)
            r4.<init>(r2, r3, r0, r7)
            r1.zza(r4, r5, r6)
            return
    }

    public abstract boolean zzc(com.google.android.gms.common.internal.zzo r1, android.content.ServiceConnection r2, java.lang.String r3, java.util.concurrent.Executor r4);
}

package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzs extends com.google.android.gms.common.internal.GmsClientSupervisor {
    private final java.util.HashMap zzb;
    private final android.content.Context zzc;
    private volatile android.os.Handler zzd;
    private final com.google.android.gms.common.internal.zzr zze;
    private final com.google.android.gms.common.stats.ConnectionTracker zzf;
    private final long zzg;
    private final long zzh;
    private volatile java.util.concurrent.Executor zzi;

    public zzs(android.content.Context r3, android.os.Looper r4, java.util.concurrent.Executor r5) {
            r2 = this;
            r2.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.zzb = r0
            com.google.android.gms.common.internal.zzr r0 = new com.google.android.gms.common.internal.zzr
            r1 = 0
            r0.<init>(r2, r1)
            r2.zze = r0
            android.content.Context r3 = r3.getApplicationContext()
            r2.zzc = r3
            x28 r3 = new x28
            r3.<init>(r4, r0)
            r2.zzd = r3
            com.google.android.gms.common.stats.ConnectionTracker r3 = com.google.android.gms.common.stats.ConnectionTracker.getInstance()
            r2.zzf = r3
            r3 = 5000(0x1388, double:2.4703E-320)
            r2.zzg = r3
            r3 = 300000(0x493e0, double:1.482197E-318)
            r2.zzh = r3
            r2.zzi = r5
            return
    }

    public static /* bridge */ /* synthetic */ long zzd(com.google.android.gms.common.internal.zzs r2) {
            long r0 = r2.zzh
            return r0
    }

    public static /* bridge */ /* synthetic */ android.content.Context zze(com.google.android.gms.common.internal.zzs r0) {
            android.content.Context r0 = r0.zzc
            return r0
    }

    public static /* bridge */ /* synthetic */ android.os.Handler zzf(com.google.android.gms.common.internal.zzs r0) {
            android.os.Handler r0 = r0.zzd
            return r0
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.stats.ConnectionTracker zzg(com.google.android.gms.common.internal.zzs r0) {
            com.google.android.gms.common.stats.ConnectionTracker r0 = r0.zzf
            return r0
    }

    public static /* bridge */ /* synthetic */ java.util.HashMap zzh(com.google.android.gms.common.internal.zzs r0) {
            java.util.HashMap r0 = r0.zzb
            return r0
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    public final void zza(com.google.android.gms.common.internal.zzo r5, android.content.ServiceConnection r6, java.lang.String r7) {
            r4 = this;
            java.lang.String r0 = "Trying to unbind a GmsServiceConnection  that was not bound before.  config="
            java.lang.String r1 = "Nonexistent connection status for service config: "
            java.lang.String r2 = "ServiceConnection must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6, r2)
            java.util.HashMap r2 = r4.zzb
            monitor-enter(r2)
            java.util.HashMap r3 = r4.zzb     // Catch: java.lang.Throwable -> L34
            java.lang.Object r3 = r3.get(r5)     // Catch: java.lang.Throwable -> L34
            com.google.android.gms.common.internal.zzp r3 = (com.google.android.gms.common.internal.zzp) r3     // Catch: java.lang.Throwable -> L34
            if (r3 == 0) goto L4e
            boolean r1 = r3.zzh(r6)     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L38
            r3.zzf(r6, r7)     // Catch: java.lang.Throwable -> L34
            boolean r6 = r3.zzi()     // Catch: java.lang.Throwable -> L34
            if (r6 == 0) goto L36
            android.os.Handler r6 = r4.zzd     // Catch: java.lang.Throwable -> L34
            r7 = 0
            android.os.Message r5 = r6.obtainMessage(r7, r5)     // Catch: java.lang.Throwable -> L34
            android.os.Handler r6 = r4.zzd     // Catch: java.lang.Throwable -> L34
            long r0 = r4.zzg     // Catch: java.lang.Throwable -> L34
            r6.sendMessageDelayed(r5, r0)     // Catch: java.lang.Throwable -> L34
            goto L36
        L34:
            r4 = move-exception
            goto L64
        L36:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L34
            return
        L38:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L34
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L34
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L34
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L34
            r6.append(r5)     // Catch: java.lang.Throwable -> L34
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L34
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L34
            throw r4     // Catch: java.lang.Throwable -> L34
        L4e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L34
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L34
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L34
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L34
            r6.append(r5)     // Catch: java.lang.Throwable -> L34
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L34
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L34
            throw r4     // Catch: java.lang.Throwable -> L34
        L64:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L34
            throw r4
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    public final boolean zzc(com.google.android.gms.common.internal.zzo r5, android.content.ServiceConnection r6, java.lang.String r7, java.util.concurrent.Executor r8) {
            r4 = this;
            java.lang.String r0 = "Trying to bind a GmsServiceConnection that was already connected before.  config="
            java.lang.String r1 = "ServiceConnection must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6, r1)
            java.util.HashMap r1 = r4.zzb
            monitor-enter(r1)
            java.util.HashMap r2 = r4.zzb     // Catch: java.lang.Throwable -> L17
            java.lang.Object r2 = r2.get(r5)     // Catch: java.lang.Throwable -> L17
            com.google.android.gms.common.internal.zzp r2 = (com.google.android.gms.common.internal.zzp) r2     // Catch: java.lang.Throwable -> L17
            if (r8 != 0) goto L19
            java.util.concurrent.Executor r8 = r4.zzi     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r4 = move-exception
            goto L71
        L19:
            if (r2 != 0) goto L2c
            com.google.android.gms.common.internal.zzp r2 = new com.google.android.gms.common.internal.zzp     // Catch: java.lang.Throwable -> L17
            r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> L17
            r2.zzd(r6, r6, r7)     // Catch: java.lang.Throwable -> L17
            r2.zze(r7, r8)     // Catch: java.lang.Throwable -> L17
            java.util.HashMap r4 = r4.zzb     // Catch: java.lang.Throwable -> L17
            r4.put(r5, r2)     // Catch: java.lang.Throwable -> L17
            goto L55
        L2c:
            android.os.Handler r4 = r4.zzd     // Catch: java.lang.Throwable -> L17
            r3 = 0
            r4.removeMessages(r3, r5)     // Catch: java.lang.Throwable -> L17
            boolean r4 = r2.zzh(r6)     // Catch: java.lang.Throwable -> L17
            if (r4 != 0) goto L5b
            r2.zzd(r6, r6, r7)     // Catch: java.lang.Throwable -> L17
            int r4 = r2.zza()     // Catch: java.lang.Throwable -> L17
            r5 = 1
            if (r4 == r5) goto L4a
            r5 = 2
            if (r4 == r5) goto L46
            goto L55
        L46:
            r2.zze(r7, r8)     // Catch: java.lang.Throwable -> L17
            goto L55
        L4a:
            android.content.ComponentName r4 = r2.zzb()     // Catch: java.lang.Throwable -> L17
            android.os.IBinder r5 = r2.zzc()     // Catch: java.lang.Throwable -> L17
            r6.onServiceConnected(r4, r5)     // Catch: java.lang.Throwable -> L17
        L55:
            boolean r4 = r2.zzj()     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            return r4
        L5b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L17
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L17
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L17
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L17
            r6.append(r5)     // Catch: java.lang.Throwable -> L17
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L17
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L17
            throw r4     // Catch: java.lang.Throwable -> L17
        L71:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r4
    }

    public final void zzi(java.util.concurrent.Executor r2) {
            r1 = this;
            java.util.HashMap r0 = r1.zzb
            monitor-enter(r0)
            r1.zzi = r2     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public final void zzj(android.os.Looper r4) {
            r3 = this;
            java.util.HashMap r0 = r3.zzb
            monitor-enter(r0)
            x28 r1 = new x28     // Catch: java.lang.Throwable -> Le
            com.google.android.gms.common.internal.zzr r2 = r3.zze     // Catch: java.lang.Throwable -> Le
            r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> Le
            r3.zzd = r1     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r3
    }
}

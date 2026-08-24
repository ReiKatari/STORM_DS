package com.google.android.gms.tasks;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzi implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.tasks.Task zza;
    final /* synthetic */ com.google.android.gms.tasks.zzj zzb;

    public zzi(com.google.android.gms.tasks.zzj r1, com.google.android.gms.tasks.Task r2) {
            r0 = this;
            r0.zzb = r1
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            com.google.android.gms.tasks.zzj r0 = r3.zzb
            java.lang.Object r0 = com.google.android.gms.tasks.zzj.zzb(r0)
            monitor-enter(r0)
            com.google.android.gms.tasks.zzj r1 = r3.zzb     // Catch: java.lang.Throwable -> L19
            com.google.android.gms.tasks.OnCompleteListener r2 = com.google.android.gms.tasks.zzj.zza(r1)     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L1b
            com.google.android.gms.tasks.OnCompleteListener r1 = com.google.android.gms.tasks.zzj.zza(r1)     // Catch: java.lang.Throwable -> L19
            com.google.android.gms.tasks.Task r3 = r3.zza     // Catch: java.lang.Throwable -> L19
            r1.onComplete(r3)     // Catch: java.lang.Throwable -> L19
            goto L1b
        L19:
            r3 = move-exception
            goto L1d
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return
        L1d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r3
    }
}

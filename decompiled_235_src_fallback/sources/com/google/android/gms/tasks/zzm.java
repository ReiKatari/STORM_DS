package com.google.android.gms.tasks;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzm implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.tasks.Task zza;
    final /* synthetic */ com.google.android.gms.tasks.zzn zzb;

    public zzm(com.google.android.gms.tasks.zzn r1, com.google.android.gms.tasks.Task r2) {
            r0 = this;
            r0.zzb = r1
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            com.google.android.gms.tasks.zzn r0 = r3.zzb
            java.lang.Object r0 = com.google.android.gms.tasks.zzn.zzb(r0)
            monitor-enter(r0)
            com.google.android.gms.tasks.zzn r1 = r3.zzb     // Catch: java.lang.Throwable -> L1d
            com.google.android.gms.tasks.OnSuccessListener r2 = com.google.android.gms.tasks.zzn.zza(r1)     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L1f
            com.google.android.gms.tasks.OnSuccessListener r1 = com.google.android.gms.tasks.zzn.zza(r1)     // Catch: java.lang.Throwable -> L1d
            com.google.android.gms.tasks.Task r3 = r3.zza     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r3 = r3.getResult()     // Catch: java.lang.Throwable -> L1d
            r1.onSuccess(r3)     // Catch: java.lang.Throwable -> L1d
            goto L1f
        L1d:
            r3 = move-exception
            goto L21
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r3
    }
}

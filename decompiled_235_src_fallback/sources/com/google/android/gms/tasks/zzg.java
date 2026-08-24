package com.google.android.gms.tasks;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzg implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.tasks.zzh zza;

    public zzg(com.google.android.gms.tasks.zzh r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            com.google.android.gms.tasks.zzh r0 = r2.zza
            java.lang.Object r0 = com.google.android.gms.tasks.zzh.zzb(r0)
            monitor-enter(r0)
            com.google.android.gms.tasks.zzh r2 = r2.zza     // Catch: java.lang.Throwable -> L17
            com.google.android.gms.tasks.OnCanceledListener r1 = com.google.android.gms.tasks.zzh.zza(r2)     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L19
            com.google.android.gms.tasks.OnCanceledListener r2 = com.google.android.gms.tasks.zzh.zza(r2)     // Catch: java.lang.Throwable -> L17
            r2.onCanceled()     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r2 = move-exception
            goto L1b
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r2
    }
}

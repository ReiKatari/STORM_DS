package com.google.android.gms.tasks;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzc implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.tasks.Task zza;
    final /* synthetic */ com.google.android.gms.tasks.zzd zzb;

    public zzc(com.google.android.gms.tasks.zzd r1, com.google.android.gms.tasks.Task r2) {
            r0 = this;
            r0.zzb = r1
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            com.google.android.gms.tasks.Task r0 = r2.zza
            boolean r0 = r0.isCanceled()
            com.google.android.gms.tasks.zzd r1 = r2.zzb
            if (r0 == 0) goto L12
            com.google.android.gms.tasks.zzw r2 = com.google.android.gms.tasks.zzd.zzb(r1)
            r2.zzc()
            return
        L12:
            com.google.android.gms.tasks.Continuation r0 = com.google.android.gms.tasks.zzd.zza(r1)     // Catch: java.lang.Exception -> L26 com.google.android.gms.tasks.RuntimeExecutionException -> L28
            com.google.android.gms.tasks.Task r1 = r2.zza     // Catch: java.lang.Exception -> L26 com.google.android.gms.tasks.RuntimeExecutionException -> L28
            java.lang.Object r0 = r0.then(r1)     // Catch: java.lang.Exception -> L26 com.google.android.gms.tasks.RuntimeExecutionException -> L28
            com.google.android.gms.tasks.zzd r2 = r2.zzb
            com.google.android.gms.tasks.zzw r2 = com.google.android.gms.tasks.zzd.zzb(r2)
            r2.zzb(r0)
            return
        L26:
            r0 = move-exception
            goto L2a
        L28:
            r0 = move-exception
            goto L34
        L2a:
            com.google.android.gms.tasks.zzd r2 = r2.zzb
            com.google.android.gms.tasks.zzw r2 = com.google.android.gms.tasks.zzd.zzb(r2)
            r2.zza(r0)
            return
        L34:
            java.lang.Throwable r1 = r0.getCause()
            boolean r1 = r1 instanceof java.lang.Exception
            com.google.android.gms.tasks.zzd r2 = r2.zzb
            if (r1 == 0) goto L4c
            com.google.android.gms.tasks.zzw r2 = com.google.android.gms.tasks.zzd.zzb(r2)
            java.lang.Throwable r0 = r0.getCause()
            java.lang.Exception r0 = (java.lang.Exception) r0
            r2.zza(r0)
            return
        L4c:
            com.google.android.gms.tasks.zzw r2 = com.google.android.gms.tasks.zzd.zzb(r2)
            r2.zza(r0)
            return
    }
}

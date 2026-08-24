package com.google.android.gms.tasks;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zze implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.tasks.Task zza;
    final /* synthetic */ com.google.android.gms.tasks.zzf zzb;

    public zze(com.google.android.gms.tasks.zzf r1, com.google.android.gms.tasks.Task r2) {
            r0 = this;
            r0.zzb = r1
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            com.google.android.gms.tasks.zzf r0 = r3.zzb     // Catch: java.lang.Exception -> L2d com.google.android.gms.tasks.RuntimeExecutionException -> L2f
            com.google.android.gms.tasks.Continuation r0 = com.google.android.gms.tasks.zzf.zza(r0)     // Catch: java.lang.Exception -> L2d com.google.android.gms.tasks.RuntimeExecutionException -> L2f
            com.google.android.gms.tasks.Task r1 = r3.zza     // Catch: java.lang.Exception -> L2d com.google.android.gms.tasks.RuntimeExecutionException -> L2f
            java.lang.Object r0 = r0.then(r1)     // Catch: java.lang.Exception -> L2d com.google.android.gms.tasks.RuntimeExecutionException -> L2f
            com.google.android.gms.tasks.Task r0 = (com.google.android.gms.tasks.Task) r0     // Catch: java.lang.Exception -> L2d com.google.android.gms.tasks.RuntimeExecutionException -> L2f
            com.google.android.gms.tasks.zzf r1 = r3.zzb
            if (r0 != 0) goto L1d
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "Continuation returned null"
            r3.<init>(r0)
            r1.onFailure(r3)
            return
        L1d:
            java.util.concurrent.Executor r2 = com.google.android.gms.tasks.TaskExecutors.zza
            r0.addOnSuccessListener(r2, r1)
            com.google.android.gms.tasks.zzf r1 = r3.zzb
            r0.addOnFailureListener(r2, r1)
            com.google.android.gms.tasks.zzf r3 = r3.zzb
            r0.addOnCanceledListener(r2, r3)
            return
        L2d:
            r0 = move-exception
            goto L31
        L2f:
            r0 = move-exception
            goto L3b
        L31:
            com.google.android.gms.tasks.zzf r3 = r3.zzb
            com.google.android.gms.tasks.zzw r3 = com.google.android.gms.tasks.zzf.zzb(r3)
            r3.zza(r0)
            return
        L3b:
            java.lang.Throwable r1 = r0.getCause()
            boolean r1 = r1 instanceof java.lang.Exception
            com.google.android.gms.tasks.zzf r3 = r3.zzb
            if (r1 == 0) goto L53
            com.google.android.gms.tasks.zzw r3 = com.google.android.gms.tasks.zzf.zzb(r3)
            java.lang.Throwable r0 = r0.getCause()
            java.lang.Exception r0 = (java.lang.Exception) r0
            r3.zza(r0)
            return
        L53:
            com.google.android.gms.tasks.zzw r3 = com.google.android.gms.tasks.zzf.zzb(r3)
            r3.zza(r0)
            return
    }
}

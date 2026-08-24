package com.google.android.gms.tasks;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzo implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.tasks.Task zza;
    final /* synthetic */ com.google.android.gms.tasks.zzp zzb;

    public zzo(com.google.android.gms.tasks.zzp r1, com.google.android.gms.tasks.Task r2) {
            r0 = this;
            r0.zzb = r1
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            com.google.android.gms.tasks.zzp r0 = r3.zzb     // Catch: java.lang.Exception -> L2f com.google.android.gms.tasks.RuntimeExecutionException -> L31 java.util.concurrent.CancellationException -> L39
            com.google.android.gms.tasks.SuccessContinuation r0 = com.google.android.gms.tasks.zzp.zza(r0)     // Catch: java.lang.Exception -> L2f com.google.android.gms.tasks.RuntimeExecutionException -> L31 java.util.concurrent.CancellationException -> L39
            com.google.android.gms.tasks.Task r1 = r3.zza     // Catch: java.lang.Exception -> L2f com.google.android.gms.tasks.RuntimeExecutionException -> L31 java.util.concurrent.CancellationException -> L39
            java.lang.Object r1 = r1.getResult()     // Catch: java.lang.Exception -> L2f com.google.android.gms.tasks.RuntimeExecutionException -> L31 java.util.concurrent.CancellationException -> L39
            com.google.android.gms.tasks.Task r0 = r0.then(r1)     // Catch: java.lang.Exception -> L2f com.google.android.gms.tasks.RuntimeExecutionException -> L31 java.util.concurrent.CancellationException -> L39
            com.google.android.gms.tasks.zzp r1 = r3.zzb
            if (r0 != 0) goto L1f
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "Continuation returned null"
            r3.<init>(r0)
            r1.onFailure(r3)
            return
        L1f:
            java.util.concurrent.Executor r2 = com.google.android.gms.tasks.TaskExecutors.zza
            r0.addOnSuccessListener(r2, r1)
            com.google.android.gms.tasks.zzp r1 = r3.zzb
            r0.addOnFailureListener(r2, r1)
            com.google.android.gms.tasks.zzp r3 = r3.zzb
            r0.addOnCanceledListener(r2, r3)
            return
        L2f:
            r0 = move-exception
            goto L33
        L31:
            r0 = move-exception
            goto L3f
        L33:
            com.google.android.gms.tasks.zzp r3 = r3.zzb
            r3.onFailure(r0)
            return
        L39:
            com.google.android.gms.tasks.zzp r3 = r3.zzb
            r3.onCanceled()
            return
        L3f:
            java.lang.Throwable r1 = r0.getCause()
            boolean r1 = r1 instanceof java.lang.Exception
            com.google.android.gms.tasks.zzp r3 = r3.zzb
            if (r1 == 0) goto L53
            java.lang.Throwable r0 = r0.getCause()
            java.lang.Exception r0 = (java.lang.Exception) r0
            r3.onFailure(r0)
            return
        L53:
            r3.onFailure(r0)
            return
    }
}

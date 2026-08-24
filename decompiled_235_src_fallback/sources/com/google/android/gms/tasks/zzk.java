package com.google.android.gms.tasks;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzk implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.tasks.Task zza;
    final /* synthetic */ com.google.android.gms.tasks.zzl zzb;

    public zzk(com.google.android.gms.tasks.zzl r1, com.google.android.gms.tasks.Task r2) {
            r0 = this;
            r0.zzb = r1
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            com.google.android.gms.tasks.zzl r0 = r3.zzb
            java.lang.Object r0 = com.google.android.gms.tasks.zzl.zzb(r0)
            monitor-enter(r0)
            com.google.android.gms.tasks.zzl r1 = r3.zzb     // Catch: java.lang.Throwable -> L23
            com.google.android.gms.tasks.OnFailureListener r2 = com.google.android.gms.tasks.zzl.zza(r1)     // Catch: java.lang.Throwable -> L23
            if (r2 == 0) goto L25
            com.google.android.gms.tasks.OnFailureListener r1 = com.google.android.gms.tasks.zzl.zza(r1)     // Catch: java.lang.Throwable -> L23
            com.google.android.gms.tasks.Task r3 = r3.zza     // Catch: java.lang.Throwable -> L23
            java.lang.Exception r3 = r3.getException()     // Catch: java.lang.Throwable -> L23
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)     // Catch: java.lang.Throwable -> L23
            java.lang.Exception r3 = (java.lang.Exception) r3     // Catch: java.lang.Throwable -> L23
            r1.onFailure(r3)     // Catch: java.lang.Throwable -> L23
            goto L25
        L23:
            r3 = move-exception
            goto L27
        L25:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return
        L27:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r3
    }
}

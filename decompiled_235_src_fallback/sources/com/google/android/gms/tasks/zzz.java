package com.google.android.gms.tasks;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzz implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.tasks.zzw zza;
    final /* synthetic */ java.util.concurrent.Callable zzb;

    public zzz(com.google.android.gms.tasks.zzw r1, java.util.concurrent.Callable r2) {
            r0 = this;
            r0.zza = r1
            r0.zzb = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            com.google.android.gms.tasks.zzw r0 = r2.zza     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> Le
            java.util.concurrent.Callable r1 = r2.zzb     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> Le
            java.lang.Object r1 = r1.call()     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> Le
            r0.zzb(r1)     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> Le
            return
        Lc:
            r0 = move-exception
            goto L10
        Le:
            r0 = move-exception
            goto L1b
        L10:
            com.google.android.gms.tasks.zzw r2 = r2.zza
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            r2.zza(r1)
            return
        L1b:
            com.google.android.gms.tasks.zzw r2 = r2.zza
            r2.zza(r0)
            return
    }
}

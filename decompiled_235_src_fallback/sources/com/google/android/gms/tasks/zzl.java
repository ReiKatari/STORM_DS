package com.google.android.gms.tasks;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzl implements com.google.android.gms.tasks.zzq {
    private final java.util.concurrent.Executor zza;
    private final java.lang.Object zzb;
    private com.google.android.gms.tasks.OnFailureListener zzc;

    public zzl(java.util.concurrent.Executor r2, com.google.android.gms.tasks.OnFailureListener r3) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.zzb = r0
            r1.zza = r2
            r1.zzc = r3
            return
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.tasks.OnFailureListener zza(com.google.android.gms.tasks.zzl r0) {
            com.google.android.gms.tasks.OnFailureListener r0 = r0.zzc
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.Object zzb(com.google.android.gms.tasks.zzl r0) {
            java.lang.Object r0 = r0.zzb
            return r0
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzc() {
            r2 = this;
            java.lang.Object r0 = r2.zzb
            monitor-enter(r0)
            r1 = 0
            r2.zzc = r1     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            throw r2
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzd(com.google.android.gms.tasks.Task r3) {
            r2 = this;
            boolean r0 = r3.isSuccessful()
            if (r0 != 0) goto L25
            boolean r0 = r3.isCanceled()
            if (r0 != 0) goto L25
            java.lang.Object r0 = r2.zzb
            monitor-enter(r0)
            com.google.android.gms.tasks.OnFailureListener r1 = r2.zzc     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return
        L15:
            r2 = move-exception
            goto L23
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            java.util.concurrent.Executor r0 = r2.zza
            com.google.android.gms.tasks.zzk r1 = new com.google.android.gms.tasks.zzk
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r2
        L25:
            return
    }
}

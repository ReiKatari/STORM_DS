package com.google.android.gms.tasks;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzb extends com.google.android.gms.tasks.CancellationToken {
    private final com.google.android.gms.tasks.zzw zza;

    public zzb() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.tasks.zzw r0 = new com.google.android.gms.tasks.zzw
            r0.<init>()
            r1.zza = r0
            return
    }

    @Override // com.google.android.gms.tasks.CancellationToken
    public final boolean isCancellationRequested() {
            r0 = this;
            com.google.android.gms.tasks.zzw r0 = r0.zza
            boolean r0 = r0.isComplete()
            return r0
    }

    @Override // com.google.android.gms.tasks.CancellationToken
    public final com.google.android.gms.tasks.CancellationToken onCanceledRequested(com.google.android.gms.tasks.OnTokenCanceledListener r3) {
            r2 = this;
            com.google.android.gms.tasks.zza r0 = new com.google.android.gms.tasks.zza
            r0.<init>(r2, r3)
            com.google.android.gms.tasks.zzw r3 = r2.zza
            java.util.concurrent.Executor r1 = com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD
            r3.addOnSuccessListener(r1, r0)
            return r2
    }

    public final void zza() {
            r1 = this;
            com.google.android.gms.tasks.zzw r1 = r1.zza
            r0 = 0
            r1.zze(r0)
            return
    }
}

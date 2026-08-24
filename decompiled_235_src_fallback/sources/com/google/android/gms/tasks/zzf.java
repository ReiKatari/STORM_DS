package com.google.android.gms.tasks;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzf<TResult, TContinuationResult> implements com.google.android.gms.tasks.OnSuccessListener<TContinuationResult>, com.google.android.gms.tasks.OnFailureListener, com.google.android.gms.tasks.OnCanceledListener, com.google.android.gms.tasks.zzq {
    private final java.util.concurrent.Executor zza;
    private final com.google.android.gms.tasks.Continuation zzb;
    private final com.google.android.gms.tasks.zzw zzc;

    public zzf(java.util.concurrent.Executor r1, com.google.android.gms.tasks.Continuation r2, com.google.android.gms.tasks.zzw r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.tasks.Continuation zza(com.google.android.gms.tasks.zzf r0) {
            com.google.android.gms.tasks.Continuation r0 = r0.zzb
            return r0
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.tasks.zzw zzb(com.google.android.gms.tasks.zzf r0) {
            com.google.android.gms.tasks.zzw r0 = r0.zzc
            return r0
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
            r0 = this;
            com.google.android.gms.tasks.zzw r0 = r0.zzc
            r0.zzc()
            return
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(java.lang.Exception r1) {
            r0 = this;
            com.google.android.gms.tasks.zzw r0 = r0.zzc
            r0.zza(r1)
            return
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(TContinuationResult r1) {
            r0 = this;
            com.google.android.gms.tasks.zzw r0 = r0.zzc
            r0.zzb(r1)
            return
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzc() {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzd(com.google.android.gms.tasks.Task r2) {
            r1 = this;
            com.google.android.gms.tasks.zze r0 = new com.google.android.gms.tasks.zze
            r0.<init>(r1, r2)
            java.util.concurrent.Executor r1 = r1.zza
            r1.execute(r0)
            return
    }
}

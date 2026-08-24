package com.google.android.gms.tasks;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class TaskCompletionSource<TResult> {
    private final com.google.android.gms.tasks.zzw zza;

    public TaskCompletionSource() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.tasks.zzw r0 = new com.google.android.gms.tasks.zzw
            r0.<init>()
            r1.zza = r0
            return
    }

    public TaskCompletionSource(com.google.android.gms.tasks.CancellationToken r2) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.tasks.zzw r0 = new com.google.android.gms.tasks.zzw
            r0.<init>()
            r1.zza = r0
            com.google.android.gms.tasks.zzs r0 = new com.google.android.gms.tasks.zzs
            r0.<init>(r1)
            r2.onCanceledRequested(r0)
            return
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.tasks.zzw zza(com.google.android.gms.tasks.TaskCompletionSource r0) {
            com.google.android.gms.tasks.zzw r0 = r0.zza
            return r0
    }

    public com.google.android.gms.tasks.Task<TResult> getTask() {
            r0 = this;
            com.google.android.gms.tasks.zzw r0 = r0.zza
            return r0
    }

    public void setException(java.lang.Exception r1) {
            r0 = this;
            com.google.android.gms.tasks.zzw r0 = r0.zza
            r0.zza(r1)
            return
    }

    public void setResult(TResult r1) {
            r0 = this;
            com.google.android.gms.tasks.zzw r0 = r0.zza
            r0.zzb(r1)
            return
    }

    public boolean trySetException(java.lang.Exception r1) {
            r0 = this;
            com.google.android.gms.tasks.zzw r0 = r0.zza
            boolean r0 = r0.zzd(r1)
            return r0
    }

    public boolean trySetResult(TResult r1) {
            r0 = this;
            com.google.android.gms.tasks.zzw r0 = r0.zza
            boolean r0 = r0.zze(r1)
            return r0
    }
}

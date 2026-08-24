package com.google.android.gms.tasks;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzc implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzd zzb;

    public zzc(zzd zzdVar, Task task) {
        this.zzb = zzdVar;
        this.zza = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzw zzwVar;
        zzw zzwVar2;
        zzw zzwVar3;
        Continuation continuation;
        zzw zzwVar4;
        zzw zzwVar5;
        boolean isCanceled = this.zza.isCanceled();
        zzd zzdVar = this.zzb;
        if (isCanceled) {
            zzwVar5 = zzdVar.zzc;
            zzwVar5.zzc();
            return;
        }
        try {
            continuation = zzdVar.zzb;
            Object then = continuation.then(this.zza);
            zzwVar4 = this.zzb.zzc;
            zzwVar4.zzb(then);
        } catch (RuntimeExecutionException e) {
            boolean z = e.getCause() instanceof Exception;
            zzd zzdVar2 = this.zzb;
            if (z) {
                zzwVar3 = zzdVar2.zzc;
                zzwVar3.zza((Exception) e.getCause());
                return;
            }
            zzwVar2 = zzdVar2.zzc;
            zzwVar2.zza(e);
        } catch (Exception e2) {
            zzwVar = this.zzb.zzc;
            zzwVar.zza(e2);
        }
    }
}

package com.google.android.gms.tasks;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzs implements com.google.android.gms.tasks.OnTokenCanceledListener {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    public zzs(com.google.android.gms.tasks.TaskCompletionSource r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.tasks.OnTokenCanceledListener
    public final void onCanceled() {
            r0 = this;
            com.google.android.gms.tasks.TaskCompletionSource r0 = r0.zza
            com.google.android.gms.tasks.zzw r0 = com.google.android.gms.tasks.TaskCompletionSource.zza(r0)
            r0.zzc()
            return
    }
}

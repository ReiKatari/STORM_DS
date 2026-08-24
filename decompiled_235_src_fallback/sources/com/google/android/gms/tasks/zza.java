package com.google.android.gms.tasks;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zza implements com.google.android.gms.tasks.OnSuccessListener {
    final /* synthetic */ com.google.android.gms.tasks.OnTokenCanceledListener zza;

    public zza(com.google.android.gms.tasks.zzb r1, com.google.android.gms.tasks.OnTokenCanceledListener r2) {
            r0 = this;
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r1) {
            r0 = this;
            java.lang.Void r1 = (java.lang.Void) r1
            com.google.android.gms.tasks.OnTokenCanceledListener r0 = r0.zza
            r0.onCanceled()
            return
    }
}

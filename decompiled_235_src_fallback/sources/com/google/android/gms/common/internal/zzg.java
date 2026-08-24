package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzg extends com.google.android.gms.common.internal.zza {
    final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient zze;

    public zzg(com.google.android.gms.common.internal.BaseGmsClient r1, int r2, android.os.Bundle r3) {
            r0 = this;
            r0.zze = r1
            r3 = 0
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // com.google.android.gms.common.internal.zza
    public final void zzb(com.google.android.gms.common.ConnectionResult r2) {
            r1 = this;
            com.google.android.gms.common.internal.BaseGmsClient r0 = r1.zze
            boolean r0 = r0.enableLocalFallback()
            if (r0 == 0) goto L18
            com.google.android.gms.common.internal.BaseGmsClient r0 = r1.zze
            boolean r0 = com.google.android.gms.common.internal.BaseGmsClient.zzo(r0)
            if (r0 == 0) goto L18
            com.google.android.gms.common.internal.BaseGmsClient r1 = r1.zze
            r2 = 16
            com.google.android.gms.common.internal.BaseGmsClient.zzk(r1, r2)
            return
        L18:
            com.google.android.gms.common.internal.BaseGmsClient r0 = r1.zze
            com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks r0 = r0.zzc
            r0.onReportServiceBinding(r2)
            com.google.android.gms.common.internal.BaseGmsClient r1 = r1.zze
            r1.onConnectionFailed(r2)
            return
    }

    @Override // com.google.android.gms.common.internal.zza
    public final boolean zzd() {
            r1 = this;
            com.google.android.gms.common.internal.BaseGmsClient r1 = r1.zze
            com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks r1 = r1.zzc
            com.google.android.gms.common.ConnectionResult r0 = com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS
            r1.onReportServiceBinding(r0)
            r1 = 1
            return r1
    }
}

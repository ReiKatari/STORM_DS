package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzd extends com.google.android.gms.common.internal.zzac {
    private com.google.android.gms.common.internal.BaseGmsClient zza;
    private final int zzb;

    public zzd(com.google.android.gms.common.internal.BaseGmsClient r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void onPostInitComplete(int r3, android.os.IBinder r4, android.os.Bundle r5) {
            r2 = this;
            com.google.android.gms.common.internal.BaseGmsClient r0 = r2.zza
            java.lang.String r1 = "onPostInitComplete can be called only once per call to getRemoteService"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0, r1)
            com.google.android.gms.common.internal.BaseGmsClient r0 = r2.zza
            int r1 = r2.zzb
            r0.onPostInitHandler(r3, r4, r5, r1)
            r3 = 0
            r2.zza = r3
            return
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void zzb(int r1, android.os.Bundle r2) {
            r0 = this;
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            java.lang.String r1 = "GmsClient"
            java.lang.String r2 = "received deprecated onAccountValidationComplete callback, ignoring"
            android.util.Log.wtf(r1, r2, r0)
            return
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void zzc(int r3, android.os.IBinder r4, com.google.android.gms.common.internal.zzk r5) {
            r2 = this;
            com.google.android.gms.common.internal.BaseGmsClient r0 = r2.zza
            java.lang.String r1 = "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0, r1)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            com.google.android.gms.common.internal.BaseGmsClient.zzj(r0, r5)
            android.os.Bundle r5 = r5.zza
            r2.onPostInitComplete(r3, r4, r5)
            return
    }
}

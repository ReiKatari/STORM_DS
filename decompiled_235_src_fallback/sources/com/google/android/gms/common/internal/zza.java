package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
abstract class zza extends com.google.android.gms.common.internal.zzc {
    public final int zza;
    public final android.os.Bundle zzb;
    final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient zzc;

    public zza(com.google.android.gms.common.internal.BaseGmsClient r2, int r3, android.os.Bundle r4) {
            r1 = this;
            r1.zzc = r2
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.<init>(r2, r0)
            r1.zza = r3
            r1.zzb = r4
            return
    }

    @Override // com.google.android.gms.common.internal.zzc
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object r3) {
            r2 = this;
            int r3 = r2.zza
            r0 = 1
            r1 = 0
            if (r3 != 0) goto L1c
            boolean r3 = r2.zzd()
            if (r3 != 0) goto L1b
            com.google.android.gms.common.internal.BaseGmsClient r3 = r2.zzc
            com.google.android.gms.common.internal.BaseGmsClient.zzi(r3, r0, r1)
            com.google.android.gms.common.ConnectionResult r3 = new com.google.android.gms.common.ConnectionResult
            r0 = 8
            r3.<init>(r0, r1)
            r2.zzb(r3)
        L1b:
            return
        L1c:
            com.google.android.gms.common.internal.BaseGmsClient r3 = r2.zzc
            com.google.android.gms.common.internal.BaseGmsClient.zzi(r3, r0, r1)
            android.os.Bundle r3 = r2.zzb
            if (r3 == 0) goto L2e
            java.lang.String r0 = "pendingIntent"
            android.os.Parcelable r3 = r3.getParcelable(r0)
            r1 = r3
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
        L2e:
            int r3 = r2.zza
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
            r0.<init>(r3, r1)
            r2.zzb(r0)
            return
    }

    public abstract void zzb(com.google.android.gms.common.ConnectionResult r1);

    @Override // com.google.android.gms.common.internal.zzc
    public final void zzc() {
            r0 = this;
            return
    }

    public abstract boolean zzd();
}

package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzf extends com.google.android.gms.common.internal.zza {
    public final android.os.IBinder zze;
    final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient zzf;

    public zzf(com.google.android.gms.common.internal.BaseGmsClient r1, int r2, android.os.IBinder r3, android.os.Bundle r4) {
            r0 = this;
            r0.zzf = r1
            r0.<init>(r1, r2, r4)
            r0.zze = r3
            return
    }

    @Override // com.google.android.gms.common.internal.zza
    public final void zzb(com.google.android.gms.common.ConnectionResult r2) {
            r1 = this;
            com.google.android.gms.common.internal.BaseGmsClient r0 = r1.zzf
            com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener r0 = com.google.android.gms.common.internal.BaseGmsClient.zzc(r0)
            if (r0 == 0) goto L11
            com.google.android.gms.common.internal.BaseGmsClient r0 = r1.zzf
            com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener r0 = com.google.android.gms.common.internal.BaseGmsClient.zzc(r0)
            r0.onConnectionFailed(r2)
        L11:
            com.google.android.gms.common.internal.BaseGmsClient r1 = r1.zzf
            r1.onConnectionFailed(r2)
            return
    }

    @Override // com.google.android.gms.common.internal.zza
    public final boolean zzd() {
            r5 = this;
            java.lang.String r0 = "GmsClient"
            r1 = 0
            android.os.IBinder r2 = r5.zze     // Catch: android.os.RemoteException -> L5f
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)     // Catch: android.os.RemoteException -> L5f
            java.lang.String r2 = r2.getInterfaceDescriptor()     // Catch: android.os.RemoteException -> L5f
            com.google.android.gms.common.internal.BaseGmsClient r3 = r5.zzf
            java.lang.String r3 = r3.getServiceDescriptor()
            boolean r3 = r3.equals(r2)
            com.google.android.gms.common.internal.BaseGmsClient r4 = r5.zzf
            if (r3 != 0) goto L26
            java.lang.String r5 = r4.getServiceDescriptor()
            java.lang.String r3 = "service descriptor mismatch: "
            java.lang.String r4 = " vs. "
            defpackage.lb1.w(r3, r5, r4, r2, r0)
            return r1
        L26:
            android.os.IBinder r0 = r5.zze
            android.os.IInterface r0 = r4.createServiceInterface(r0)
            if (r0 == 0) goto L5e
            com.google.android.gms.common.internal.BaseGmsClient r2 = r5.zzf
            r3 = 2
            r4 = 4
            boolean r2 = com.google.android.gms.common.internal.BaseGmsClient.zzn(r2, r3, r4, r0)
            if (r2 != 0) goto L41
            com.google.android.gms.common.internal.BaseGmsClient r2 = r5.zzf
            r3 = 3
            boolean r0 = com.google.android.gms.common.internal.BaseGmsClient.zzn(r2, r3, r4, r0)
            if (r0 == 0) goto L5e
        L41:
            com.google.android.gms.common.internal.BaseGmsClient r0 = r5.zzf
            r1 = 0
            com.google.android.gms.common.internal.BaseGmsClient.zzg(r0, r1)
            com.google.android.gms.common.internal.BaseGmsClient r0 = r5.zzf
            android.os.Bundle r1 = r0.getConnectionHint()
            com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks r0 = com.google.android.gms.common.internal.BaseGmsClient.zzb(r0)
            if (r0 == 0) goto L5c
            com.google.android.gms.common.internal.BaseGmsClient r5 = r5.zzf
            com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks r5 = com.google.android.gms.common.internal.BaseGmsClient.zzb(r5)
            r5.onConnected(r1)
        L5c:
            r5 = 1
            return r5
        L5e:
            return r1
        L5f:
            java.lang.String r5 = "service probably died"
            android.util.Log.w(r0, r5)
            return r1
    }
}

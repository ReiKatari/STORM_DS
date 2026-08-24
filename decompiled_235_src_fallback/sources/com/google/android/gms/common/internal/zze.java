package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zze implements android.content.ServiceConnection {
    final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient zza;
    private final int zzb;

    public zze(com.google.android.gms.common.internal.BaseGmsClient r1, int r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            r0.zzb = r2
            return
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
            r3 = this;
            com.google.android.gms.common.internal.BaseGmsClient r4 = r3.zza
            if (r5 != 0) goto La
            r3 = 16
            com.google.android.gms.common.internal.BaseGmsClient.zzk(r4, r3)
            return
        La:
            java.lang.Object r4 = com.google.android.gms.common.internal.BaseGmsClient.zzd(r4)
            monitor-enter(r4)
            com.google.android.gms.common.internal.BaseGmsClient r0 = r3.zza     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = "com.google.android.gms.common.internal.IGmsServiceBroker"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L22
            boolean r2 = r1 instanceof com.google.android.gms.common.internal.IGmsServiceBroker     // Catch: java.lang.Throwable -> L20
            if (r2 == 0) goto L22
            com.google.android.gms.common.internal.IGmsServiceBroker r1 = (com.google.android.gms.common.internal.IGmsServiceBroker) r1     // Catch: java.lang.Throwable -> L20
            goto L27
        L20:
            r3 = move-exception
            goto L35
        L22:
            com.google.android.gms.common.internal.zzad r1 = new com.google.android.gms.common.internal.zzad     // Catch: java.lang.Throwable -> L20
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L20
        L27:
            com.google.android.gms.common.internal.BaseGmsClient.zzh(r0, r1)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.common.internal.BaseGmsClient r4 = r3.zza
            r5 = 0
            int r3 = r3.zzb
            r0 = 0
            r4.zzl(r0, r5, r3)
            return
        L35:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L20
            throw r3
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName r3) {
            r2 = this;
            com.google.android.gms.common.internal.BaseGmsClient r3 = r2.zza
            java.lang.Object r3 = com.google.android.gms.common.internal.BaseGmsClient.zzd(r3)
            monitor-enter(r3)
            com.google.android.gms.common.internal.BaseGmsClient r0 = r2.zza     // Catch: java.lang.Throwable -> L1e
            r1 = 0
            com.google.android.gms.common.internal.BaseGmsClient.zzh(r0, r1)     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1e
            com.google.android.gms.common.internal.BaseGmsClient r3 = r2.zza
            int r2 = r2.zzb
            android.os.Handler r3 = r3.zzb
            r0 = 6
            r1 = 1
            android.os.Message r2 = r3.obtainMessage(r0, r2, r1)
            r3.sendMessage(r2)
            return
        L1e:
            r2 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1e
            throw r2
    }
}

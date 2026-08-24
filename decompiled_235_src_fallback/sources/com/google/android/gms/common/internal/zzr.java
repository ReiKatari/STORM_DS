package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzr implements android.os.Handler.Callback {
    final /* synthetic */ com.google.android.gms.common.internal.zzs zza;

    public /* synthetic */ zzr(com.google.android.gms.common.internal.zzs r1, com.google.android.gms.common.internal.zzq r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r6) {
            r5 = this;
            java.lang.String r0 = "Timeout waiting for ServiceConnection callback "
            int r1 = r6.what
            r2 = 1
            if (r1 == 0) goto L61
            if (r1 == r2) goto Lb
            r5 = 0
            return r5
        Lb:
            com.google.android.gms.common.internal.zzs r1 = r5.zza
            java.util.HashMap r1 = com.google.android.gms.common.internal.zzs.zzh(r1)
            monitor-enter(r1)
            java.lang.Object r6 = r6.obj     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.common.internal.zzo r6 = (com.google.android.gms.common.internal.zzo) r6     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.common.internal.zzs r5 = r5.zza     // Catch: java.lang.Throwable -> L48
            java.util.HashMap r5 = com.google.android.gms.common.internal.zzs.zzh(r5)     // Catch: java.lang.Throwable -> L48
            java.lang.Object r5 = r5.get(r6)     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.common.internal.zzp r5 = (com.google.android.gms.common.internal.zzp) r5     // Catch: java.lang.Throwable -> L48
            if (r5 == 0) goto L5d
            int r3 = r5.zza()     // Catch: java.lang.Throwable -> L48
            r4 = 3
            if (r3 != r4) goto L5d
            java.lang.String r3 = "GmsClientSupervisor"
            java.lang.String r4 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L48
            java.lang.String r0 = r0.concat(r4)     // Catch: java.lang.Throwable -> L48
            java.lang.Exception r4 = new java.lang.Exception     // Catch: java.lang.Throwable -> L48
            r4.<init>()     // Catch: java.lang.Throwable -> L48
            android.util.Log.e(r3, r0, r4)     // Catch: java.lang.Throwable -> L48
            android.content.ComponentName r0 = r5.zzb()     // Catch: java.lang.Throwable -> L48
            if (r0 != 0) goto L4a
            android.content.ComponentName r0 = r6.zza()     // Catch: java.lang.Throwable -> L48
            goto L4a
        L48:
            r5 = move-exception
            goto L5f
        L4a:
            if (r0 != 0) goto L5a
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L48
            java.lang.String r6 = r6.zzc()     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)     // Catch: java.lang.Throwable -> L48
            java.lang.String r3 = "unknown"
            r0.<init>(r6, r3)     // Catch: java.lang.Throwable -> L48
        L5a:
            r5.onServiceDisconnected(r0)     // Catch: java.lang.Throwable -> L48
        L5d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L48
            return r2
        L5f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L48
            throw r5
        L61:
            com.google.android.gms.common.internal.zzs r0 = r5.zza
            java.util.HashMap r0 = com.google.android.gms.common.internal.zzs.zzh(r0)
            monitor-enter(r0)
            java.lang.Object r6 = r6.obj     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.common.internal.zzo r6 = (com.google.android.gms.common.internal.zzo) r6     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.common.internal.zzs r1 = r5.zza     // Catch: java.lang.Throwable -> L8c
            java.util.HashMap r1 = com.google.android.gms.common.internal.zzs.zzh(r1)     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.common.internal.zzp r1 = (com.google.android.gms.common.internal.zzp) r1     // Catch: java.lang.Throwable -> L8c
            if (r1 == 0) goto L97
            boolean r3 = r1.zzi()     // Catch: java.lang.Throwable -> L8c
            if (r3 == 0) goto L97
            boolean r3 = r1.zzj()     // Catch: java.lang.Throwable -> L8c
            if (r3 == 0) goto L8e
            java.lang.String r3 = "GmsClientSupervisor"
            r1.zzg(r3)     // Catch: java.lang.Throwable -> L8c
            goto L8e
        L8c:
            r5 = move-exception
            goto L99
        L8e:
            com.google.android.gms.common.internal.zzs r5 = r5.zza     // Catch: java.lang.Throwable -> L8c
            java.util.HashMap r5 = com.google.android.gms.common.internal.zzs.zzh(r5)     // Catch: java.lang.Throwable -> L8c
            r5.remove(r6)     // Catch: java.lang.Throwable -> L8c
        L97:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8c
            return r2
        L99:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8c
            throw r5
    }
}

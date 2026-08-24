package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class zzc {
    private java.lang.Object zza;
    private boolean zzb;
    final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient zzd;

    public zzc(com.google.android.gms.common.internal.BaseGmsClient r1, java.lang.Object r2) {
            r0 = this;
            r0.zzd = r1
            r0.<init>()
            r0.zza = r2
            r1 = 0
            r0.zzb = r1
            return
    }

    public abstract void zza(java.lang.Object r1);

    public abstract void zzc();

    public final void zze() {
            r5 = this;
            java.lang.String r0 = "Callback proxy "
            monitor-enter(r5)
            java.lang.Object r1 = r5.zza     // Catch: java.lang.Throwable -> L24
            boolean r2 = r5.zzb     // Catch: java.lang.Throwable -> L24
            if (r2 == 0) goto L26
            java.lang.String r2 = "GmsClient"
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L24
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L24
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L24
            r4.append(r3)     // Catch: java.lang.Throwable -> L24
            java.lang.String r0 = " being reused. This is not safe."
            r4.append(r0)     // Catch: java.lang.Throwable -> L24
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L24
            android.util.Log.w(r2, r0)     // Catch: java.lang.Throwable -> L24
            goto L26
        L24:
            r0 = move-exception
            goto L38
        L26:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L2c
            r5.zza(r1)
        L2c:
            monitor-enter(r5)
            r0 = 1
            r5.zzb = r0     // Catch: java.lang.Throwable -> L35
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L35
            r5.zzg()
            return
        L35:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L35
            throw r0
        L38:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L24
            throw r0
    }

    public final void zzf() {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            r1.zza = r0     // Catch: java.lang.Throwable -> L6
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6
            return
        L6:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6
            throw r0
    }

    public final void zzg() {
            r2 = this;
            r2.zzf()
            com.google.android.gms.common.internal.BaseGmsClient r0 = r2.zzd
            java.util.ArrayList r0 = com.google.android.gms.common.internal.BaseGmsClient.zzf(r0)
            monitor-enter(r0)
            com.google.android.gms.common.internal.BaseGmsClient r1 = r2.zzd     // Catch: java.lang.Throwable -> L15
            java.util.ArrayList r1 = com.google.android.gms.common.internal.BaseGmsClient.zzf(r1)     // Catch: java.lang.Throwable -> L15
            r1.remove(r2)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return
        L15:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r2
    }
}

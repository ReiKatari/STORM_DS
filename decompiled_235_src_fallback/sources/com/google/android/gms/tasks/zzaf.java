package com.google.android.gms.tasks;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzaf<T> implements com.google.android.gms.tasks.zzae<T> {
    private final java.lang.Object zza;
    private final int zzb;
    private final com.google.android.gms.tasks.zzw zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private java.lang.Exception zzg;
    private boolean zzh;

    public zzaf(int r2, com.google.android.gms.tasks.zzw r3) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.zza = r0
            r1.zzb = r2
            r1.zzc = r3
            return
    }

    private final void zza() {
            r5 = this;
            int r0 = r5.zzd
            int r1 = r5.zze
            int r0 = r0 + r1
            int r2 = r5.zzf
            int r0 = r0 + r2
            int r2 = r5.zzb
            if (r0 != r2) goto L44
            java.lang.Exception r0 = r5.zzg
            if (r0 == 0) goto L36
            com.google.android.gms.tasks.zzw r0 = r5.zzc
            java.util.concurrent.ExecutionException r3 = new java.util.concurrent.ExecutionException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r1 = " out of "
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = " underlying tasks failed"
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            java.lang.Exception r5 = r5.zzg
            r3.<init>(r1, r5)
            r0.zza(r3)
            return
        L36:
            boolean r0 = r5.zzh
            com.google.android.gms.tasks.zzw r5 = r5.zzc
            if (r0 == 0) goto L40
            r5.zzc()
            return
        L40:
            r0 = 0
            r5.zzb(r0)
        L44:
            return
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
            r3 = this;
            java.lang.Object r0 = r3.zza
            monitor-enter(r0)
            int r1 = r3.zzf     // Catch: java.lang.Throwable -> L10
            r2 = 1
            int r1 = r1 + r2
            r3.zzf = r1     // Catch: java.lang.Throwable -> L10
            r3.zzh = r2     // Catch: java.lang.Throwable -> L10
            r3.zza()     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r3
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(java.lang.Exception r3) {
            r2 = this;
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            int r1 = r2.zze     // Catch: java.lang.Throwable -> L10
            int r1 = r1 + 1
            r2.zze = r1     // Catch: java.lang.Throwable -> L10
            r2.zzg = r3     // Catch: java.lang.Throwable -> L10
            r2.zza()     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r2
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(T r2) {
            r1 = this;
            java.lang.Object r2 = r1.zza
            monitor-enter(r2)
            int r0 = r1.zzd     // Catch: java.lang.Throwable -> Le
            int r0 = r0 + 1
            r1.zzd = r0     // Catch: java.lang.Throwable -> Le
            r1.zza()     // Catch: java.lang.Throwable -> Le
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r1 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            throw r1
    }
}

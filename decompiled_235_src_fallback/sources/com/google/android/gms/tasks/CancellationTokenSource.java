package com.google.android.gms.tasks;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class CancellationTokenSource {
    private final com.google.android.gms.tasks.zzb zza;

    public CancellationTokenSource() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.tasks.zzb r0 = new com.google.android.gms.tasks.zzb
            r0.<init>()
            r1.zza = r0
            return
    }

    public void cancel() {
            r0 = this;
            com.google.android.gms.tasks.zzb r0 = r0.zza
            r0.zza()
            return
    }

    public com.google.android.gms.tasks.CancellationToken getToken() {
            r0 = this;
            com.google.android.gms.tasks.zzb r0 = r0.zza
            return r0
    }
}

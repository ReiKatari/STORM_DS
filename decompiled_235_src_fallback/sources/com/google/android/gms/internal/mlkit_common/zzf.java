package com.google.android.gms.internal.mlkit_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzf {
    private final com.google.android.gms.internal.mlkit_common.zzac zza;
    private java.lang.Boolean zzb;

    private zzf() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.mlkit_common.zzac r0 = new com.google.android.gms.internal.mlkit_common.zzac
            r0.<init>()
            r1.zza = r0
            return
    }

    public /* synthetic */ zzf(com.google.android.gms.internal.mlkit_common.zze r1) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.internal.mlkit_common.zzac r1 = new com.google.android.gms.internal.mlkit_common.zzac
            r1.<init>()
            r0.zza = r1
            return
    }

    public final com.google.android.gms.internal.mlkit_common.zzf zza(com.google.android.gms.internal.mlkit_common.zzk r3) {
            r2 = this;
            java.lang.Boolean r0 = r2.zzb
            java.lang.String r1 = "Must call internal() or external() before appending rules."
            com.google.android.gms.internal.mlkit_common.zzt.zzc(r0, r1)
            com.google.android.gms.internal.mlkit_common.zzac r0 = r2.zza
            r0.zzb(r3)
            return r2
    }

    public final com.google.android.gms.internal.mlkit_common.zzf zzb() {
            r2 = this;
            java.lang.Boolean r0 = r2.zzb
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            java.lang.String r1 = "A SourcePolicy can only set internal() or external() once."
            com.google.android.gms.internal.mlkit_common.zzt.zze(r0, r1)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.zzb = r0
            return r2
    }

    public final com.google.android.gms.internal.mlkit_common.zzf zzc() {
            r2 = this;
            java.lang.Boolean r0 = r2.zzb
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            java.lang.String r1 = "A SourcePolicy can only set internal() or external() once."
            com.google.android.gms.internal.mlkit_common.zzt.zze(r0, r1)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.zzb = r0
            return r2
    }

    public final com.google.android.gms.internal.mlkit_common.zzh zzd() {
            r4 = this;
            java.lang.Boolean r0 = r4.zzb
            java.lang.String r1 = "Must call internal() or external() when building a SourcePolicy."
            com.google.android.gms.internal.mlkit_common.zzt.zzc(r0, r1)
            com.google.android.gms.internal.mlkit_common.zzh r0 = new com.google.android.gms.internal.mlkit_common.zzh
            java.lang.Boolean r1 = r4.zzb
            boolean r1 = r1.booleanValue()
            com.google.android.gms.internal.mlkit_common.zzac r4 = r4.zza
            com.google.android.gms.internal.mlkit_common.zzaf r4 = r4.zzc()
            r2 = 0
            r3 = 0
            r0.<init>(r1, r3, r4, r2)
            return r0
    }
}

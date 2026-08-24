package com.google.android.gms.internal.mlkit_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzh {
    public static final com.google.android.gms.internal.mlkit_common.zzh zza = null;
    private final boolean zzb;
    private final boolean zzc;
    private final com.google.android.gms.internal.mlkit_common.zzaf zzd;

    static {
            com.google.android.gms.internal.mlkit_common.zzf r0 = new com.google.android.gms.internal.mlkit_common.zzf
            r1 = 0
            r0.<init>(r1)
            r0.zzb()
            com.google.android.gms.internal.mlkit_common.zzh r0 = r0.zzd()
            com.google.android.gms.internal.mlkit_common.zzh.zza = r0
            com.google.android.gms.internal.mlkit_common.zzf r0 = new com.google.android.gms.internal.mlkit_common.zzf
            r0.<init>(r1)
            r0.zzb()
            com.google.android.gms.internal.mlkit_common.zzd r2 = new com.google.android.gms.internal.mlkit_common.zzd
            r2.<init>()
            r0.zza(r2)
            r0.zzd()
            com.google.android.gms.internal.mlkit_common.zzf r0 = new com.google.android.gms.internal.mlkit_common.zzf
            r0.<init>(r1)
            r0.zzc()
            r0.zzd()
            return
    }

    public /* synthetic */ zzh(boolean r1, boolean r2, com.google.android.gms.internal.mlkit_common.zzaf r3, com.google.android.gms.internal.mlkit_common.zzg r4) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r1 = 0
            r0.zzc = r1
            r0.zzd = r3
            return
    }

    public static /* bridge */ /* synthetic */ boolean zza(com.google.android.gms.internal.mlkit_common.zzh r0) {
            boolean r0 = r0.zzc
            r0 = 0
            return r0
    }

    public static /* bridge */ /* synthetic */ boolean zzb(com.google.android.gms.internal.mlkit_common.zzh r0) {
            boolean r0 = r0.zzb
            return r0
    }

    public static /* bridge */ /* synthetic */ int zzc(com.google.android.gms.internal.mlkit_common.zzh r5, android.content.Context r6, com.google.android.gms.internal.mlkit_common.zzj r7) {
            com.google.android.gms.internal.mlkit_common.zzaf r0 = r5.zzd
            int r1 = r0.size()
            r2 = 0
        L7:
            if (r2 >= r1) goto L1f
            java.lang.Object r3 = r0.get(r2)
            com.google.android.gms.internal.mlkit_common.zzk r3 = (com.google.android.gms.internal.mlkit_common.zzk) r3
            boolean r4 = r5.zzb
            int r3 = r3.zza(r6, r7, r4)
            int r3 = r3 + (-1)
            int r2 = r2 + 1
            r4 = 1
            if (r3 == r4) goto L1d
            goto L7
        L1d:
            r5 = 2
            return r5
        L1f:
            r5 = 3
            return r5
    }
}

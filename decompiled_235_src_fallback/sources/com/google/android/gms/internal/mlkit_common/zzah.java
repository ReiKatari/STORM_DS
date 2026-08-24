package com.google.android.gms.internal.mlkit_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzah {
    java.lang.Object[] zza;
    int zzb;
    com.google.android.gms.internal.mlkit_common.zzag zzc;

    public zzah() {
            r1 = this;
            r1.<init>()
            r0 = 8
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1.zza = r0
            r0 = 0
            r1.zzb = r0
            return
    }

    public final com.google.android.gms.internal.mlkit_common.zzah zza(java.lang.Object r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r3.zzb
            int r0 = r0 + 1
            java.lang.Object[] r1 = r3.zza
            int r2 = r1.length
            int r0 = r0 + r0
            if (r0 <= r2) goto L14
            int r0 = com.google.android.gms.internal.mlkit_common.zzaa.zza(r2, r0)
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            r3.zza = r0
        L14:
            com.google.android.gms.internal.mlkit_common.zzw.zza(r4, r5)
            java.lang.Object[] r0 = r3.zza
            int r1 = r3.zzb
            int r2 = r1 + r1
            r0[r2] = r4
            int r2 = r2 + 1
            r0[r2] = r5
            int r1 = r1 + 1
            r3.zzb = r1
            return r3
    }

    public final com.google.android.gms.internal.mlkit_common.zzai zzb() {
            r2 = this;
            com.google.android.gms.internal.mlkit_common.zzag r0 = r2.zzc
            if (r0 != 0) goto L16
            int r0 = r2.zzb
            java.lang.Object[] r1 = r2.zza
            com.google.android.gms.internal.mlkit_common.zzaq r0 = com.google.android.gms.internal.mlkit_common.zzaq.zzg(r0, r1, r2)
            com.google.android.gms.internal.mlkit_common.zzag r2 = r2.zzc
            if (r2 != 0) goto L11
            return r0
        L11:
            java.lang.IllegalArgumentException r2 = r2.zza()
            throw r2
        L16:
            java.lang.IllegalArgumentException r2 = r0.zza()
            throw r2
    }
}

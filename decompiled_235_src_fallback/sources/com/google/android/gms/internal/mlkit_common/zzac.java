package com.google.android.gms.internal.mlkit_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzac extends com.google.android.gms.internal.mlkit_common.zzz {
    public zzac() {
            r1 = this;
            r0 = 4
            r1.<init>(r0)
            return
    }

    public final com.google.android.gms.internal.mlkit_common.zzac zzb(java.lang.Object r5) {
            r4 = this;
            r5.getClass()
            int r0 = r4.zzb
            int r0 = r0 + 1
            java.lang.Object[] r1 = r4.zza
            int r2 = r1.length
            r3 = 0
            if (r2 >= r0) goto L1a
            int r0 = com.google.android.gms.internal.mlkit_common.zzaa.zza(r2, r0)
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            r4.zza = r0
            r4.zzc = r3
            goto L28
        L1a:
            boolean r0 = r4.zzc
            if (r0 == 0) goto L28
            java.lang.Object r0 = r1.clone()
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r4.zza = r0
            r4.zzc = r3
        L28:
            java.lang.Object[] r0 = r4.zza
            int r1 = r4.zzb
            int r2 = r1 + 1
            r4.zzb = r2
            r0[r1] = r5
            return r4
    }

    public final com.google.android.gms.internal.mlkit_common.zzaf zzc() {
            r1 = this;
            r0 = 1
            r1.zzc = r0
            java.lang.Object[] r0 = r1.zza
            int r1 = r1.zzb
            com.google.android.gms.internal.mlkit_common.zzaf r1 = com.google.android.gms.internal.mlkit_common.zzaf.zzg(r0, r1)
            return r1
    }
}

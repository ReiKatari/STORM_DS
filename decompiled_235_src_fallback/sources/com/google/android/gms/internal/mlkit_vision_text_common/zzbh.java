package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzbh extends com.google.android.gms.internal.mlkit_vision_text_common.zzbd {
    public zzbh() {
            r1 = this;
            r0 = 4
            r1.<init>(r0)
            return
    }

    public final com.google.android.gms.internal.mlkit_vision_text_common.zzbh zza(java.lang.Object r7) {
            r6 = this;
            r7.getClass()
            int r0 = r6.zzb
            int r1 = r0 + 1
            java.lang.Object[] r2 = r6.zza
            int r3 = r2.length
            r4 = 0
            if (r3 >= r1) goto L28
            int r5 = r3 >> 1
            int r3 = r3 + r5
            int r3 = r3 + 1
            if (r3 >= r1) goto L1a
            int r0 = java.lang.Integer.highestOneBit(r0)
            int r3 = r0 + r0
        L1a:
            if (r3 >= 0) goto L1f
            r3 = 2147483647(0x7fffffff, float:NaN)
        L1f:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r3)
            r6.zza = r0
            r6.zzc = r4
            goto L36
        L28:
            boolean r0 = r6.zzc
            if (r0 == 0) goto L36
            java.lang.Object r0 = r2.clone()
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r6.zza = r0
            r6.zzc = r4
        L36:
            java.lang.Object[] r0 = r6.zza
            int r1 = r6.zzb
            int r2 = r1 + 1
            r6.zzb = r2
            r0[r1] = r7
            return r6
    }

    public final com.google.android.gms.internal.mlkit_vision_text_common.zzbk zzb() {
            r1 = this;
            r0 = 1
            r1.zzc = r0
            java.lang.Object[] r0 = r1.zza
            int r1 = r1.zzb
            com.google.android.gms.internal.mlkit_vision_text_common.zzbk r1 = com.google.android.gms.internal.mlkit_vision_text_common.zzbk.zzg(r0, r1)
            return r1
    }
}

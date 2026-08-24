package com.google.android.gms.internal.mlkit_vision_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzz extends com.google.android.gms.internal.mlkit_vision_common.zzr {
    static final com.google.android.gms.internal.mlkit_vision_common.zzr zza = null;
    final transient java.lang.Object[] zzb;
    private final transient int zzc;

    static {
            com.google.android.gms.internal.mlkit_vision_common.zzz r0 = new com.google.android.gms.internal.mlkit_vision_common.zzz
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r0.<init>(r3, r2, r1)
            com.google.android.gms.internal.mlkit_vision_common.zzz.zza = r0
            return
    }

    private zzz(java.lang.Object r1, java.lang.Object[] r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    public static com.google.android.gms.internal.mlkit_vision_common.zzz zzg(int r1, java.lang.Object[] r2, com.google.android.gms.internal.mlkit_vision_common.zzq r3) {
            r1 = 0
            r1 = r2[r1]
            r1.getClass()
            r3 = 1
            r0 = r2[r3]
            r0.getClass()
            com.google.android.gms.internal.mlkit_vision_common.zzi.zza(r1, r0)
            com.google.android.gms.internal.mlkit_vision_common.zzz r1 = new com.google.android.gms.internal.mlkit_vision_common.zzz
            r0 = 0
            r1.<init>(r0, r2, r3)
            return r1
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzr, java.util.Map
    public final java.lang.Object get(java.lang.Object r4) {
            r3 = this;
            java.lang.Object[] r0 = r3.zzb
            int r3 = r3.zzc
            r1 = 0
            if (r4 != 0) goto L9
        L7:
            r3 = r1
            goto L1d
        L9:
            r2 = 1
            if (r3 != r2) goto L7
            r3 = 0
            r3 = r0[r3]
            r3.getClass()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L7
            r3 = r0[r2]
            r3.getClass()
        L1d:
            if (r3 != 0) goto L20
            return r1
        L20:
            return r3
    }

    @Override // java.util.Map
    public final int size() {
            r0 = this;
            int r0 = r0.zzc
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzr
    public final com.google.android.gms.internal.mlkit_vision_common.zzl zza() {
            r3 = this;
            com.google.android.gms.internal.mlkit_vision_common.zzy r0 = new com.google.android.gms.internal.mlkit_vision_common.zzy
            java.lang.Object[] r1 = r3.zzb
            r2 = 1
            int r3 = r3.zzc
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzr
    public final com.google.android.gms.internal.mlkit_vision_common.zzs zzd() {
            r4 = this;
            com.google.android.gms.internal.mlkit_vision_common.zzw r0 = new com.google.android.gms.internal.mlkit_vision_common.zzw
            java.lang.Object[] r1 = r4.zzb
            r2 = 0
            int r3 = r4.zzc
            r0.<init>(r4, r1, r2, r3)
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzr
    public final com.google.android.gms.internal.mlkit_vision_common.zzs zze() {
            r4 = this;
            com.google.android.gms.internal.mlkit_vision_common.zzy r0 = new com.google.android.gms.internal.mlkit_vision_common.zzy
            java.lang.Object[] r1 = r4.zzb
            r2 = 0
            int r3 = r4.zzc
            r0.<init>(r1, r2, r3)
            com.google.android.gms.internal.mlkit_vision_common.zzx r1 = new com.google.android.gms.internal.mlkit_vision_common.zzx
            r1.<init>(r4, r0)
            return r1
    }
}

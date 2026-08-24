package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzcj extends com.google.android.gms.internal.mlkit_vision_text_common.zzbm {
    final transient java.lang.Object[] zza;

    private zzcj(java.lang.Object r1, java.lang.Object[] r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r2
            return
    }

    public static com.google.android.gms.internal.mlkit_vision_text_common.zzcj zzg(int r1, java.lang.Object[] r2, com.google.android.gms.internal.mlkit_vision_text_common.zzbl r3) {
            r1 = 0
            r1 = r2[r1]
            java.util.Objects.requireNonNull(r1)
            r3 = 1
            r0 = r2[r3]
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.internal.mlkit_vision_text_common.zzaq.zzb(r1, r0)
            com.google.android.gms.internal.mlkit_vision_text_common.zzcj r1 = new com.google.android.gms.internal.mlkit_vision_text_common.zzcj
            r0 = 0
            r1.<init>(r0, r2, r3)
            return r1
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbm, java.util.Map
    public final java.lang.Object get(java.lang.Object r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L5
        L3:
            r2 = r0
            goto L19
        L5:
            java.lang.Object[] r2 = r2.zza
            r1 = 0
            r1 = r2[r1]
            java.util.Objects.requireNonNull(r1)
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L3
            r3 = 1
            r2 = r2[r3]
            java.util.Objects.requireNonNull(r2)
        L19:
            if (r2 != 0) goto L1c
            return r0
        L1c:
            return r2
    }

    @Override // java.util.Map
    public final int size() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbm
    public final com.google.android.gms.internal.mlkit_vision_text_common.zzbf zza() {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzci r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zzci
            java.lang.Object[] r2 = r2.zza
            r1 = 1
            r0.<init>(r2, r1, r1)
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbm
    public final com.google.android.gms.internal.mlkit_vision_text_common.zzbn zzd() {
            r4 = this;
            java.lang.Object[] r0 = r4.zza
            com.google.android.gms.internal.mlkit_vision_text_common.zzcg r1 = new com.google.android.gms.internal.mlkit_vision_text_common.zzcg
            r2 = 0
            r3 = 1
            r1.<init>(r4, r0, r2, r3)
            return r1
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbm
    public final com.google.android.gms.internal.mlkit_vision_text_common.zzbn zze() {
            r4 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzci r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zzci
            java.lang.Object[] r1 = r4.zza
            r2 = 0
            r3 = 1
            r0.<init>(r1, r2, r3)
            com.google.android.gms.internal.mlkit_vision_text_common.zzch r1 = new com.google.android.gms.internal.mlkit_vision_text_common.zzch
            r1.<init>(r4, r0)
            return r1
    }
}

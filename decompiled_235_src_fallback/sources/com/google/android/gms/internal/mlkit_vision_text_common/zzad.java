package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzad extends com.google.android.gms.internal.mlkit_vision_text_common.zzca {
    final transient java.util.Map zza;
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_text_common.zzal zzb;

    public zzad(com.google.android.gms.internal.mlkit_vision_text_common.zzal r1, java.util.Map r2) {
            r0 = this;
            r0.zzb = r1
            r0.<init>()
            r0.zza = r2
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
            r3 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzal r0 = r3.zzb
            java.util.Map r1 = r3.zza
            java.util.Map r2 = com.google.android.gms.internal.mlkit_vision_text_common.zzal.zzg(r0)
            if (r1 != r2) goto Le
            r0.zzl()
            return
        Le:
            com.google.android.gms.internal.mlkit_vision_text_common.zzac r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zzac
            r0.<init>(r3)
            com.google.android.gms.internal.mlkit_vision_text_common.zzbo.zza(r0)
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object r1) {
            r0 = this;
            java.util.Map r0 = r0.zza
            boolean r0 = com.google.android.gms.internal.mlkit_vision_text_common.zzcb.zzb(r0, r1)
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            if (r0 == r1) goto Ld
            java.util.Map r0 = r0.zza
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            r0 = 1
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.zza
            java.lang.Object r0 = com.google.android.gms.internal.mlkit_vision_text_common.zzcb.zza(r0, r2)
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 != 0) goto Lc
            r1 = 0
            return r1
        Lc:
            com.google.android.gms.internal.mlkit_vision_text_common.zzal r1 = r1.zzb
            java.util.Collection r1 = r1.zzb(r2, r0)
            return r1
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
            r0 = this;
            java.util.Map r0 = r0.zza
            int r0 = r0.hashCode()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzca, java.util.AbstractMap, java.util.Map
    public final java.util.Set keySet() {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzal r0 = r0.zzb
            java.util.Set r0 = r0.zzo()
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object remove(java.lang.Object r4) {
            r3 = this;
            java.util.Map r0 = r3.zza
            java.lang.Object r4 = r0.remove(r4)
            java.util.Collection r4 = (java.util.Collection) r4
            if (r4 != 0) goto Lc
            r3 = 0
            return r3
        Lc:
            com.google.android.gms.internal.mlkit_vision_text_common.zzal r0 = r3.zzb
            java.util.Collection r0 = r0.zza()
            r0.addAll(r4)
            com.google.android.gms.internal.mlkit_vision_text_common.zzal r3 = r3.zzb
            int r1 = com.google.android.gms.internal.mlkit_vision_text_common.zzal.zzd(r3)
            int r2 = r4.size()
            int r1 = r1 - r2
            com.google.android.gms.internal.mlkit_vision_text_common.zzal.zzj(r3, r1)
            r4.clear()
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
            r0 = this;
            java.util.Map r0 = r0.zza
            int r0 = r0.size()
            return r0
    }

    @Override // java.util.AbstractMap
    public final java.lang.String toString() {
            r0 = this;
            java.util.Map r0 = r0.zza
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzca
    public final java.util.Set zza() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzab r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zzab
            r0.<init>(r1)
            return r0
    }
}

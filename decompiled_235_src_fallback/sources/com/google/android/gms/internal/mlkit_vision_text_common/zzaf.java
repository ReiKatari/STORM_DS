package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzaf extends com.google.android.gms.internal.mlkit_vision_text_common.zzby {
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_text_common.zzal zza;

    public zzaf(com.google.android.gms.internal.mlkit_vision_text_common.zzal r1, java.util.Map r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>(r2)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzby, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
            r0 = this;
            java.util.Iterator r0 = r0.iterator()
            com.google.android.gms.internal.mlkit_vision_text_common.zzbo.zza(r0)
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(java.util.Collection r1) {
            r0 = this;
            java.util.Map r0 = r0.zzb
            java.util.Set r0 = r0.keySet()
            boolean r0 = r0.containsAll(r1)
            return r0
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            if (r0 == r1) goto L11
            java.util.Map r0 = r0.zzb
            java.util.Set r0 = r0.keySet()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lf
            goto L11
        Lf:
            r0 = 0
            return r0
        L11:
            r0 = 1
            return r0
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
            r0 = this;
            java.util.Map r0 = r0.zzb
            java.util.Set r0 = r0.keySet()
            int r0 = r0.hashCode()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzby, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
            r2 = this;
            java.util.Map r0 = r2.zzb
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            com.google.android.gms.internal.mlkit_vision_text_common.zzae r1 = new com.google.android.gms.internal.mlkit_vision_text_common.zzae
            r1.<init>(r2, r0)
            return r1
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzby, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.zzb
            java.lang.Object r2 = r0.remove(r2)
            java.util.Collection r2 = (java.util.Collection) r2
            if (r2 == 0) goto L1f
            int r0 = r2.size()
            r2.clear()
            com.google.android.gms.internal.mlkit_vision_text_common.zzal r1 = r1.zza
            int r2 = com.google.android.gms.internal.mlkit_vision_text_common.zzal.zzd(r1)
            int r2 = r2 - r0
            com.google.android.gms.internal.mlkit_vision_text_common.zzal.zzj(r1, r2)
            if (r0 <= 0) goto L1f
            r1 = 1
            return r1
        L1f:
            r1 = 0
            return r1
    }
}

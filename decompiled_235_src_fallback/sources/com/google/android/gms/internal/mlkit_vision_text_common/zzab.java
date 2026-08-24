package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzab extends com.google.android.gms.internal.mlkit_vision_text_common.zzbx {
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_text_common.zzad zza;

    public zzab(com.google.android.gms.internal.mlkit_vision_text_common.zzad r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbx, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object r1) {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzad r0 = r0.zza
            java.util.Map r0 = r0.zza
            java.util.Set r0 = r0.entrySet()
            r0.getClass()
            boolean r0 = r0.contains(r1)     // Catch: java.lang.Throwable -> L10
            return r0
        L10:
            r0 = 0
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzac r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zzac
            com.google.android.gms.internal.mlkit_vision_text_common.zzad r1 = r1.zza
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbx, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.contains(r2)
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.util.Objects.requireNonNull(r2)
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            com.google.android.gms.internal.mlkit_vision_text_common.zzad r1 = r1.zza
            java.lang.Object r2 = r2.getKey()
            com.google.android.gms.internal.mlkit_vision_text_common.zzal r1 = r1.zzb
            com.google.android.gms.internal.mlkit_vision_text_common.zzal.zzk(r1, r2)
            r1 = 1
            return r1
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbx
    public final java.util.Map zza() {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzad r0 = r0.zza
            return r0
    }
}

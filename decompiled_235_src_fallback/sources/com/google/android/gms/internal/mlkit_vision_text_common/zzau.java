package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzau extends java.util.AbstractSet {
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_text_common.zzba zza;

    public zzau(com.google.android.gms.internal.mlkit_vision_text_common.zzba r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzba r0 = r0.zza
            r0.clear()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object r4) {
            r3 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzba r0 = r3.zza
            java.util.Map r0 = r0.zzl()
            if (r0 == 0) goto L11
            java.util.Set r3 = r0.entrySet()
            boolean r3 = r3.contains(r4)
            return r3
        L11:
            boolean r0 = r4 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L37
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            com.google.android.gms.internal.mlkit_vision_text_common.zzba r0 = r3.zza
            java.lang.Object r2 = r4.getKey()
            int r0 = com.google.android.gms.internal.mlkit_vision_text_common.zzba.zzd(r0, r2)
            r2 = -1
            if (r0 == r2) goto L37
            com.google.android.gms.internal.mlkit_vision_text_common.zzba r3 = r3.zza
            java.lang.Object r3 = com.google.android.gms.internal.mlkit_vision_text_common.zzba.zzj(r3, r0)
            java.lang.Object r4 = r4.getValue()
            boolean r3 = com.google.android.gms.internal.mlkit_vision_text_common.zzw.zza(r3, r4)
            if (r3 == 0) goto L37
            r3 = 1
            return r3
        L37:
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzba r1 = r1.zza
            java.util.Map r0 = r1.zzl()
            if (r0 == 0) goto L11
            java.util.Set r1 = r0.entrySet()
            java.util.Iterator r1 = r1.iterator()
            return r1
        L11:
            com.google.android.gms.internal.mlkit_vision_text_common.zzas r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zzas
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object r10) {
            r9 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzba r0 = r9.zza
            java.util.Map r0 = r0.zzl()
            if (r0 == 0) goto L11
            java.util.Set r9 = r0.entrySet()
            boolean r9 = r9.remove(r10)
            return r9
        L11:
            boolean r0 = r10 instanceof java.util.Map.Entry
            if (r0 == 0) goto L5b
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            com.google.android.gms.internal.mlkit_vision_text_common.zzba r0 = r9.zza
            boolean r1 = r0.zzr()
            if (r1 == 0) goto L20
            goto L5b
        L20:
            int r4 = com.google.android.gms.internal.mlkit_vision_text_common.zzba.zzc(r0)
            java.lang.Object r2 = r10.getKey()
            java.lang.Object r3 = r10.getValue()
            com.google.android.gms.internal.mlkit_vision_text_common.zzba r10 = r9.zza
            java.lang.Object r5 = com.google.android.gms.internal.mlkit_vision_text_common.zzba.zzi(r10)
            int[] r6 = com.google.android.gms.internal.mlkit_vision_text_common.zzba.zzs(r10)
            java.lang.Object[] r7 = com.google.android.gms.internal.mlkit_vision_text_common.zzba.zzt(r10)
            java.lang.Object[] r8 = com.google.android.gms.internal.mlkit_vision_text_common.zzba.zzu(r10)
            int r10 = com.google.android.gms.internal.mlkit_vision_text_common.zzbb.zzb(r2, r3, r4, r5, r6, r7, r8)
            r0 = -1
            if (r10 == r0) goto L5b
            com.google.android.gms.internal.mlkit_vision_text_common.zzba r1 = r9.zza
            r1.zzq(r10, r4)
            com.google.android.gms.internal.mlkit_vision_text_common.zzba r10 = r9.zza
            int r1 = com.google.android.gms.internal.mlkit_vision_text_common.zzba.zzb(r10)
            int r1 = r1 + r0
            com.google.android.gms.internal.mlkit_vision_text_common.zzba.zzm(r10, r1)
            com.google.android.gms.internal.mlkit_vision_text_common.zzba r9 = r9.zza
            r9.zzo()
            r9 = 1
            return r9
        L5b:
            r9 = 0
            return r9
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzba r0 = r0.zza
            int r0 = r0.size()
            return r0
    }
}

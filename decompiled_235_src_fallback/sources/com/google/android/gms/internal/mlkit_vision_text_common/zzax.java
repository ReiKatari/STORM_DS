package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzax extends java.util.AbstractSet {
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_text_common.zzba zza;

    public zzax(com.google.android.gms.internal.mlkit_vision_text_common.zzba r1) {
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
    public final boolean contains(java.lang.Object r1) {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzba r0 = r0.zza
            boolean r0 = r0.containsKey(r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzba r1 = r1.zza
            java.util.Map r0 = r1.zzl()
            if (r0 == 0) goto L11
            java.util.Set r1 = r0.keySet()
            java.util.Iterator r1 = r1.iterator()
            return r1
        L11:
            com.google.android.gms.internal.mlkit_vision_text_common.zzar r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zzar
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object r2) {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzba r0 = r1.zza
            java.util.Map r0 = r0.zzl()
            if (r0 == 0) goto L11
            java.util.Set r1 = r0.keySet()
            boolean r1 = r1.remove(r2)
            return r1
        L11:
            com.google.android.gms.internal.mlkit_vision_text_common.zzba r1 = r1.zza
            java.lang.Object r1 = com.google.android.gms.internal.mlkit_vision_text_common.zzba.zzh(r1, r2)
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_text_common.zzba.zzk()
            if (r1 != r2) goto L1f
            r1 = 0
            return r1
        L1f:
            r1 = 1
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzba r0 = r0.zza
            int r0 = r0.size()
            return r0
    }
}

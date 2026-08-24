package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzaz extends java.util.AbstractCollection {
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_text_common.zzba zza;

    public zzaz(com.google.android.gms.internal.mlkit_vision_text_common.zzba r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzba r0 = r0.zza
            r0.clear()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzba r1 = r1.zza
            java.util.Map r0 = r1.zzl()
            if (r0 == 0) goto L11
            java.util.Collection r1 = r0.values()
            java.util.Iterator r1 = r1.iterator()
            return r1
        L11:
            com.google.android.gms.internal.mlkit_vision_text_common.zzat r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zzat
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzba r0 = r0.zza
            int r0 = r0.size()
            return r0
    }
}

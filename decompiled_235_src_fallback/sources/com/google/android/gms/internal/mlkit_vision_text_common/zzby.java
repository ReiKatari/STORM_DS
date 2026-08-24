package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
class zzby extends com.google.android.gms.internal.mlkit_vision_text_common.zzck {
    final java.util.Map zzb;

    public zzby(java.util.Map r1) {
            r0 = this;
            r0.<init>()
            r1.getClass()
            r0.zzb = r1
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
            r0 = this;
            java.util.Map r0 = r0.zzb
            r0.clear()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object r1) {
            r0 = this;
            java.util.Map r0 = r0.zzb
            boolean r0 = r0.containsKey(r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
            r0 = this;
            java.util.Map r0 = r0.zzb
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator iterator() {
            r1 = this;
            java.util.Map r1 = r1.zzb
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
            com.google.android.gms.internal.mlkit_vision_text_common.zzbv r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zzbv
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.contains(r2)
            if (r0 == 0) goto Ld
            java.util.Map r1 = r1.zzb
            r1.remove(r2)
            r1 = 1
            return r1
        Ld:
            r1 = 0
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
            r0 = this;
            java.util.Map r0 = r0.zzb
            int r0 = r0.size()
            return r0
    }
}

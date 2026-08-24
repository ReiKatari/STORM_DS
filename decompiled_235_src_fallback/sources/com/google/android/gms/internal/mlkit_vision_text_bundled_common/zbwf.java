package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbwf extends java.util.AbstractSet {
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwh zba;

    public /* synthetic */ zbwf(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwh r1, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwe r2) {
            r0 = this;
            r0.zba = r1
            r0.<init>()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object r2) {
            r1 = this;
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            boolean r0 = r1.contains(r2)
            if (r0 != 0) goto L19
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwh r1 = r1.zba
            java.lang.Object r0 = r2.getKey()
            java.lang.Comparable r0 = (java.lang.Comparable) r0
            java.lang.Object r2 = r2.getValue()
            r1.zbf(r0, r2)
            r1 = 1
            return r1
        L19:
            r1 = 0
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwh r0 = r0.zba
            r0.clear()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object r3) {
            r2 = this;
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r0 = r3.getKey()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwh r2 = r2.zba
            java.lang.Object r2 = r2.get(r0)
            java.lang.Object r3 = r3.getValue()
            r0 = 1
            if (r2 == r3) goto L1e
            r1 = 0
            if (r2 == 0) goto L1d
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L1d
            return r0
        L1d:
            return r1
        L1e:
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwd r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwd
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwh r2 = r2.zba
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object r2) {
            r1 = this;
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            boolean r0 = r1.contains(r2)
            if (r0 == 0) goto L13
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwh r1 = r1.zba
            java.lang.Object r2 = r2.getKey()
            r1.remove(r2)
            r1 = 1
            return r1
        L13:
            r1 = 0
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwh r0 = r0.zba
            int r0 = r0.size()
            return r0
    }
}

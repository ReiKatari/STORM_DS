package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
abstract class zzck extends java.util.AbstractSet {
    public zzck() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(java.util.Collection r1) {
            r0 = this;
            boolean r0 = com.google.android.gms.internal.mlkit_vision_text_common.zzcl.zzb(r0, r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(java.util.Collection r1) {
            r0 = this;
            r1.getClass()
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r0 = super.retainAll(r1)
            return r0
    }
}

package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzbr extends java.util.AbstractList implements java.util.RandomAccess, java.io.Serializable {
    final java.util.List zza;
    final com.google.android.gms.internal.mlkit_vision_text_common.zzu zzb;

    public zzbr(java.util.List r1, com.google.android.gms.internal.mlkit_vision_text_common.zzu r2) {
            r0 = this;
            r0.<init>()
            r1.getClass()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int r2) {
            r1 = this;
            java.util.List r0 = r1.zza
            com.google.android.gms.internal.mlkit_vision_text_common.zzu r1 = r1.zzb
            java.lang.Object r2 = r0.get(r2)
            java.lang.Object r1 = r1.zza(r2)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
            r0 = this;
            java.util.List r0 = r0.zza
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
            r0 = this;
            java.util.ListIterator r0 = r0.listIterator()
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator(int r3) {
            r2 = this;
            java.util.List r0 = r2.zza
            com.google.android.gms.internal.mlkit_vision_text_common.zzbq r1 = new com.google.android.gms.internal.mlkit_vision_text_common.zzbq
            java.util.ListIterator r3 = r0.listIterator(r3)
            r1.<init>(r2, r3)
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object remove(int r2) {
            r1 = this;
            java.util.List r0 = r1.zza
            com.google.android.gms.internal.mlkit_vision_text_common.zzu r1 = r1.zzb
            java.lang.Object r2 = r0.remove(r2)
            java.lang.Object r1 = r1.zza(r2)
            return r1
    }

    @Override // java.util.AbstractList
    public final void removeRange(int r1, int r2) {
            r0 = this;
            java.util.List r0 = r0.zza
            java.util.List r0 = r0.subList(r1, r2)
            r0.clear()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r0 = this;
            java.util.List r0 = r0.zza
            int r0 = r0.size()
            return r0
    }
}

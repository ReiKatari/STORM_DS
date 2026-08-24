package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
abstract class zzcn extends com.google.android.gms.internal.mlkit_vision_text_common.zzcm implements java.util.ListIterator {
    public zzcn(java.util.ListIterator r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
            r0 = this;
            java.util.Iterator r0 = r0.zzb
            java.util.ListIterator r0 = (java.util.ListIterator) r0
            boolean r0 = r0.hasPrevious()
            return r0
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
            r0 = this;
            java.util.Iterator r0 = r0.zzb
            java.util.ListIterator r0 = (java.util.ListIterator) r0
            int r0 = r0.nextIndex()
            return r0
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
            r1 = this;
            java.util.Iterator r0 = r1.zzb
            java.util.ListIterator r0 = (java.util.ListIterator) r0
            java.lang.Object r0 = r0.previous()
            java.lang.Object r1 = r1.zza(r0)
            return r1
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
            r0 = this;
            java.util.Iterator r0 = r0.zzb
            java.util.ListIterator r0 = (java.util.ListIterator) r0
            int r0 = r0.previousIndex()
            return r0
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }
}

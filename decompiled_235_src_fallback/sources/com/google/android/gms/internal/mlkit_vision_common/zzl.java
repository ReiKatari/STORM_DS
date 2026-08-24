package com.google.android.gms.internal.mlkit_vision_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class zzl extends java.util.AbstractCollection implements java.io.Serializable {
    private static final java.lang.Object[] zza = null;

    static {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.google.android.gms.internal.mlkit_vision_common.zzl.zza = r0
            return
    }

    public zzl() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean add(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean addAll(java.util.Collection r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final void clear() {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(java.lang.Object r1);

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_common.zzab r0 = r0.zzd()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean remove(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean removeAll(java.util.Collection r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean retainAll(java.util.Collection r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray() {
            r1 = this;
            java.lang.Object[] r0 = com.google.android.gms.internal.mlkit_vision_common.zzl.zza
            java.lang.Object[] r1 = r1.toArray(r0)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] r3) {
            r2 = this;
            r3.getClass()
            int r0 = r2.size()
            int r1 = r3.length
            if (r1 >= r0) goto L30
            java.lang.Object[] r1 = r2.zze()
            if (r1 != 0) goto L1f
            java.lang.Class r3 = r3.getClass()
            java.lang.Class r3 = r3.getComponentType()
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r3, r0)
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            goto L35
        L1f:
            int r0 = r2.zzc()
            int r2 = r2.zzb()
            java.lang.Class r3 = r3.getClass()
            java.lang.Object[] r2 = java.util.Arrays.copyOfRange(r1, r0, r2, r3)
            return r2
        L30:
            if (r1 <= r0) goto L35
            r1 = 0
            r3[r0] = r1
        L35:
            r0 = 0
            r2.zza(r3, r0)
            return r3
    }

    public int zza(java.lang.Object[] r1, int r2) {
            r0 = this;
            r0 = 0
            throw r0
    }

    public int zzb() {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public int zzc() {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public abstract com.google.android.gms.internal.mlkit_vision_common.zzab zzd();

    public java.lang.Object[] zze() {
            r0 = this;
            r0 = 0
            return r0
    }
}

package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class zzbf extends java.util.AbstractCollection implements java.io.Serializable {
    private static final java.lang.Object[] zza = null;

    static {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.google.android.gms.internal.mlkit_vision_text_common.zzbf.zza = r0
            return
    }

    public zzbf() {
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
            com.google.android.gms.internal.mlkit_vision_text_common.zzco r0 = r0.zzd()
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

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Spliterator spliterator() {
            r1 = this;
            r0 = 1296(0x510, float:1.816E-42)
            java.util.Spliterator r1 = java.util.Spliterators.spliterator(r1, r0)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray() {
            r1 = this;
            java.lang.Object[] r0 = com.google.android.gms.internal.mlkit_vision_text_common.zzbf.zza
            java.lang.Object[] r1 = r1.toArray(r0)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] r5) {
            r4 = this;
            r5.getClass()
            int r0 = r4.size()
            int r1 = r5.length
            r2 = 0
            if (r1 >= r0) goto L2d
            java.lang.Object[] r3 = r4.zze()
            if (r3 != 0) goto L1c
            if (r1 == 0) goto L17
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r2)
        L17:
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r0)
            goto L32
        L1c:
            int r0 = r4.zzc()
            int r4 = r4.zzb()
            java.lang.Class r5 = r5.getClass()
            java.lang.Object[] r4 = java.util.Arrays.copyOfRange(r3, r0, r4, r5)
            return r4
        L2d:
            if (r1 <= r0) goto L32
            r1 = 0
            r5[r0] = r1
        L32:
            r4.zza(r5, r2)
            return r5
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

    public abstract com.google.android.gms.internal.mlkit_vision_text_common.zzco zzd();

    public java.lang.Object[] zze() {
            r0 = this;
            r0 = 0
            return r0
    }
}

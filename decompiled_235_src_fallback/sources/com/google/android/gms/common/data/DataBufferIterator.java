package com.google.android.gms.common.data;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class DataBufferIterator<T> implements java.util.Iterator<T> {
    protected final com.google.android.gms.common.data.DataBuffer zaa;
    protected int zab;

    public DataBufferIterator(com.google.android.gms.common.data.DataBuffer r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            com.google.android.gms.common.data.DataBuffer r1 = (com.google.android.gms.common.data.DataBuffer) r1
            r0.zaa = r1
            r1 = -1
            r0.zab = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            com.google.android.gms.common.data.DataBuffer r0 = r1.zaa
            int r1 = r1.zab
            int r0 = r0.getCount()
            int r0 = r0 + (-1)
            if (r1 >= r0) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
            r2 = this;
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L13
            com.google.android.gms.common.data.DataBuffer r0 = r2.zaa
            int r1 = r2.zab
            int r1 = r1 + 1
            r2.zab = r1
            java.lang.Object r2 = r0.get(r1)
            return r2
        L13:
            int r2 = r2.zab
            java.lang.String r0 = "Cannot advance the iterator beyond "
            java.lang.String r2 = defpackage.lb1.g(r2, r0)
            defpackage.fa6.e(r2)
            r2 = 0
            return r2
    }

    @Override // java.util.Iterator
    public final void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Cannot remove elements from a DataBufferIterator"
            r1.<init>(r0)
            throw r1
    }
}

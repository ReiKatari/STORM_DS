package com.google.android.gms.common.data;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class SingleRefDataBufferIterator<T> extends com.google.android.gms.common.data.DataBufferIterator<T> {
    private java.lang.Object zac;

    public SingleRefDataBufferIterator(com.google.android.gms.common.data.DataBuffer r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.gms.common.data.DataBufferIterator, java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            boolean r0 = r3.hasNext()
            int r1 = r3.zab
            r2 = 0
            if (r0 == 0) goto L45
            int r1 = r1 + 1
            r3.zab = r1
            if (r1 != 0) goto L35
            com.google.android.gms.common.data.DataBuffer r0 = r3.zaa
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            r3.zac = r0
            boolean r1 = r0 instanceof com.google.android.gms.common.data.DataBufferRef
            if (r1 == 0) goto L21
            goto L42
        L21:
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "DataBuffer reference of type "
            java.lang.String r1 = " is not movable"
            java.lang.String r3 = defpackage.lb1.A(r0, r3, r1)
            defpackage.i.m(r3)
            return r2
        L35:
            java.lang.Object r0 = r3.zac
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.common.data.DataBufferRef r0 = (com.google.android.gms.common.data.DataBufferRef) r0
            int r1 = r3.zab
            r0.zaa(r1)
        L42:
            java.lang.Object r3 = r3.zac
            return r3
        L45:
            java.lang.String r3 = "Cannot advance the iterator beyond "
            java.lang.String r3 = defpackage.lb1.g(r1, r3)
            defpackage.fa6.e(r3)
            return r2
    }
}

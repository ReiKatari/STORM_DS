package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
abstract class zbjz implements java.util.Iterator {
    private java.lang.Object zba;
    private int zbb;

    public zbjz() {
            r1 = this;
            r1.<init>()
            r0 = 2
            r1.zbb = r0
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r5 = this;
            int r0 = r5.zbb
            r1 = 4
            if (r0 == r1) goto L24
            int r2 = r0 + (-1)
            if (r0 == 0) goto L22
            r0 = 1
            if (r2 == 0) goto L21
            r3 = 2
            r4 = 0
            if (r2 == r3) goto L20
            r5.zbb = r1
            java.lang.Object r1 = r5.zba()
            r5.zba = r1
            int r1 = r5.zbb
            r2 = 3
            if (r1 == r2) goto L20
            r5.zbb = r0
            return r0
        L20:
            return r4
        L21:
            return r0
        L22:
            r5 = 0
            throw r5
        L24:
            defpackage.e41.m()
            r5 = 0
            return r5
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r2 = this;
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lf
            r0 = 2
            r2.zbb = r0
            java.lang.Object r0 = r2.zba
            r1 = 0
            r2.zba = r1
            return r0
        Lf:
            defpackage.fa6.c()
            r2 = 0
            return r2
    }

    @Override // java.util.Iterator
    public final void remove() {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public abstract java.lang.Object zba();

    public final java.lang.Object zbb() {
            r1 = this;
            r0 = 3
            r1.zbb = r0
            r1 = 0
            return r1
    }
}

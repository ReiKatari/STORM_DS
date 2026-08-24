package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbwd implements java.util.Iterator {
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwh zba;
    private int zbb;
    private boolean zbc;
    private java.util.Iterator zbd;

    public /* synthetic */ zbwd(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwh r1, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwc r2) {
            r0 = this;
            r0.zba = r1
            r0.<init>()
            r1 = -1
            r0.zbb = r1
            return
    }

    private final java.util.Iterator zba() {
            r1 = this;
            java.util.Iterator r0 = r1.zbd
            if (r0 != 0) goto L14
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwh r0 = r1.zba
            java.util.Map r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwh.zbh(r0)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r1.zbd = r0
        L14:
            java.util.Iterator r1 = r1.zbd
            return r1
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r4 = this;
            int r0 = r4.zbb
            r1 = 1
            int r0 = r0 + r1
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwh r2 = r4.zba
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwh.zbb(r2)
            if (r0 < r3) goto L23
            java.util.Map r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwh.zbh(r2)
            boolean r0 = r0.isEmpty()
            r2 = 0
            if (r0 != 0) goto L22
            java.util.Iterator r4 = r4.zba()
            boolean r4 = r4.hasNext()
            if (r4 == 0) goto L22
            return r1
        L22:
            return r2
        L23:
            return r1
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
            r3 = this;
            r0 = 1
            r3.zbc = r0
            int r1 = r3.zbb
            int r1 = r1 + r0
            r3.zbb = r1
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwh r0 = r3.zba
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwh.zbb(r0)
            if (r1 >= r2) goto L19
            java.lang.Object[] r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwh.zbk(r0)
            r3 = r3[r1]
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwb r3 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwb) r3
            return r3
        L19:
            java.util.Iterator r3 = r3.zba()
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            return r3
    }

    @Override // java.util.Iterator
    public final void remove() {
            r3 = this;
            boolean r0 = r3.zbc
            if (r0 == 0) goto L26
            r0 = 0
            r3.zbc = r0
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwh r0 = r3.zba
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwh.zbi(r0)
            int r0 = r3.zbb
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwh r1 = r3.zba
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwh.zbb(r1)
            if (r0 >= r2) goto L1e
            int r2 = r0 + (-1)
            r3.zbb = r2
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwh.zbe(r1, r0)
            return
        L1e:
            java.util.Iterator r3 = r3.zba()
            r3.remove()
            return
        L26:
            java.lang.String r3 = "remove() was called before next()"
            defpackage.i.m(r3)
            return
    }
}

package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbsu extends com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsv {
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc zba;
    private int zbb;
    private final int zbc;

    public zbsu(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r2) {
            r1 = this;
            r1.zba = r2
            r1.<init>()
            r0 = 0
            r1.zbb = r0
            int r2 = r2.zbd()
            r1.zbc = r2
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            int r0 = r1.zbb
            int r1 = r1.zbc
            if (r0 >= r1) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsx
    public final byte zba() {
            r2 = this;
            int r0 = r2.zbb
            int r1 = r2.zbc
            if (r0 >= r1) goto L11
            int r1 = r0 + 1
            r2.zbb = r1
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r2 = r2.zba
            byte r2 = r2.zbb(r0)
            return r2
        L11:
            defpackage.fa6.c()
            r2 = 0
            return r2
    }
}

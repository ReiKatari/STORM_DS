package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbsw extends com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtb {
    private final int zbc;

    public zbsw(byte[] r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1)
            r2 = 0
            int r1 = r1.length
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc.zbh(r2, r3, r1)
            r0.zbc = r3
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtb, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc
    public final byte zba(int r4) {
            r3 = this;
            int r0 = r3.zbc
            int r1 = r4 + 1
            int r1 = r0 - r1
            r1 = r1 | r4
            if (r1 >= 0) goto L23
            java.lang.ArrayIndexOutOfBoundsException r3 = new java.lang.ArrayIndexOutOfBoundsException
            if (r4 >= 0) goto L17
            java.lang.String r0 = "Index < 0: "
            java.lang.String r4 = defpackage.lb1.g(r4, r0)
            r3.<init>(r4)
            throw r3
        L17:
            java.lang.String r1 = "Index > length: "
            java.lang.String r2 = ", "
            java.lang.String r4 = defpackage.lb1.j(r1, r4, r0, r2)
            r3.<init>(r4)
            throw r3
        L23:
            byte[] r3 = r3.zba
            r3 = r3[r4]
            return r3
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtb, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc
    public final byte zbb(int r1) {
            r0 = this;
            byte[] r0 = r0.zba
            r0 = r0[r1]
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtb
    public final int zbc() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtb, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc
    public final int zbd() {
            r0 = this;
            int r0 = r0.zbc
            return r0
    }
}

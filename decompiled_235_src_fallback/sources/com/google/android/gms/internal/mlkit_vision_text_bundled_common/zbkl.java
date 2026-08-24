package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbkl extends com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkn {
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkm zba;

    public zbkl(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkm r1, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbko r2, java.lang.CharSequence r3) {
            r0 = this;
            r0.zba = r1
            r0.<init>(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkn
    public final int zbc(int r1) {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkm r0 = r0.zba
            java.lang.String r0 = r0.zba
            int r0 = r0.length()
            int r0 = r0 + r1
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkn
    public final int zbd(int r7) {
            r6 = this;
            java.lang.CharSequence r0 = r6.zbb
            int r0 = r0.length()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkm r1 = r6.zba
            java.lang.String r1 = r1.zba
            int r1 = r1.length()
            int r0 = r0 - r1
        Lf:
            if (r7 > r0) goto L2d
            r2 = 0
        L12:
            if (r2 >= r1) goto L2c
            java.lang.CharSequence r3 = r6.zbb
            int r4 = r2 + r7
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkm r5 = r6.zba
            java.lang.String r5 = r5.zba
            char r3 = r3.charAt(r4)
            char r4 = r5.charAt(r2)
            if (r3 == r4) goto L29
            int r7 = r7 + 1
            goto Lf
        L29:
            int r2 = r2 + 1
            goto L12
        L2c:
            return r7
        L2d:
            r6 = -1
            return r6
    }
}

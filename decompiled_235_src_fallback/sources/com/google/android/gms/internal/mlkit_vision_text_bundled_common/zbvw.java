package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbvw implements com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvj {
    private final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm zba;
    private final java.lang.String zbb;
    private final java.lang.Object[] zbc;
    private final int zbd;

    public zbvw(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r4, java.lang.String r5, java.lang.Object[] r6) {
            r3 = this;
            r3.<init>()
            r3.zba = r4
            r3.zbb = r5
            r3.zbc = r6
            r4 = 0
            char r4 = r5.charAt(r4)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r4 >= r6) goto L16
            r3.zbd = r4
            return
        L16:
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r0 = 1
            r1 = 13
        L1b:
            int r2 = r0 + 1
            char r0 = r5.charAt(r0)
            if (r0 < r6) goto L2b
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r1
            r4 = r4 | r0
            int r1 = r1 + 13
            r0 = r2
            goto L1b
        L2b:
            int r5 = r0 << r1
            r4 = r4 | r5
            r3.zbd = r4
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvj
    public final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm zba() {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r0 = r0.zba
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvj
    public final boolean zbb() {
            r1 = this;
            int r1 = r1.zbd
            r0 = 2
            r1 = r1 & r0
            if (r1 != r0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvj
    public final int zbc() {
            r1 = this;
            int r1 = r1.zbd
            r0 = r1 & 1
            if (r0 == 0) goto L8
            r1 = 1
            return r1
        L8:
            r0 = 4
            r1 = r1 & r0
            if (r1 != r0) goto Le
            r1 = 3
            return r1
        Le:
            r1 = 2
            return r1
    }

    public final java.lang.String zbd() {
            r0 = this;
            java.lang.String r0 = r0.zbb
            return r0
    }

    public final java.lang.Object[] zbe() {
            r0 = this;
            java.lang.Object[] r0 = r0.zbc
            return r0
    }
}

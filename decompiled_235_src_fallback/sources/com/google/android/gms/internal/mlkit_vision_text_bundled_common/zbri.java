package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbri extends com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf implements com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn {
    private static final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbri zbb = null;
    private com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun zbd;
    private byte zbe;

    static {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbri r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbri
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbri.zbb = r0
            java.lang.Class<com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbri> r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbri.class
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf.zbD(r1, r0)
            return
    }

    private zbri() {
            r1 = this;
            r1.<init>()
            r0 = 2
            r1.zbe = r0
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf.zby()
            r1.zbd = r0
            return
    }

    public static /* synthetic */ com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbri zba() {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbri r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbri.zbb
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final java.lang.Object zbb(int r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            int r2 = r2 + (-1)
            if (r2 == 0) goto L39
            r4 = 2
            if (r2 == r4) goto L28
            r4 = 3
            if (r2 == r4) goto L22
            r4 = 4
            r0 = 0
            if (r2 == r4) goto L1c
            r4 = 5
            if (r2 == r4) goto L19
            if (r3 != 0) goto L15
            r2 = 0
            goto L16
        L15:
            r2 = 1
        L16:
            r1.zbe = r2
            return r0
        L19:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbri r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbri.zbb
            return r1
        L1c:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbrh r1 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbrh
            r1.<init>(r0)
            return r1
        L22:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbri r1 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbri
            r1.<init>()
            return r1
        L28:
            java.lang.String r1 = "zbd"
            java.lang.Class<com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbrg> r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbrg.class
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbri r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbri.zbb
            java.lang.String r3 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л"
            java.lang.Object r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf.zbA(r2, r3, r1)
            return r1
        L39:
            byte r1 = r1.zbe
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            return r1
    }
}

package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbaz extends com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbub implements com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn {
    private static final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaz zbd = null;
    private byte zbe;

    static {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaz r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaz
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaz.zbd = r0
            java.lang.Class<com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaz> r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaz.class
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf.zbD(r1, r0)
            return
    }

    private zbaz() {
            r1 = this;
            r1.<init>()
            r0 = 2
            r1.zbe = r0
            return
    }

    public static /* synthetic */ com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaz zba() {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaz r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaz.zbd
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final java.lang.Object zbb(int r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            int r2 = r2 + (-1)
            if (r2 == 0) goto L31
            r4 = 2
            r0 = 0
            if (r2 == r4) goto L28
            r4 = 3
            if (r2 == r4) goto L22
            r4 = 4
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
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaz r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaz.zbd
            return r1
        L1c:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbay r1 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbay
            r1.<init>(r0)
            return r1
        L22:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaz r1 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaz
            r1.<init>()
            return r1
        L28:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaz r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaz.zbd
            java.lang.String r2 = "\u0001\u0000"
            java.lang.Object r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf.zbA(r1, r2, r0)
            return r1
        L31:
            byte r1 = r1.zbe
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            return r1
    }
}

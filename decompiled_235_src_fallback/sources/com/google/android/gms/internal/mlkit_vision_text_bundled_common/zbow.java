package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbow extends com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf implements com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn {
    private static final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbow zbb = null;
    private int zbd;
    private com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbou zbe;
    private double zbf;
    private boolean zbg;
    private com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbpb zbh;
    private byte zbi;

    static {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbow r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbow
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbow.zbb = r0
            java.lang.Class<com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbow> r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbow.class
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf.zbD(r1, r0)
            return
    }

    private zbow() {
            r1 = this;
            r1.<init>()
            r0 = 2
            r1.zbi = r0
            return
    }

    public static /* synthetic */ com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbow zba() {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbow r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbow.zbb
            return r0
    }

    public static com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbow zbc() {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbow r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbow.zbb
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    public final java.lang.Object zbb(int r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            int r2 = r2 + (-1)
            if (r2 == 0) goto L3f
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
            r1.zbi = r2
            return r0
        L19:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbow r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbow.zbb
            return r1
        L1c:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbov r1 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbov
            r1.<init>(r0)
            return r1
        L22:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbow r1 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbow
            r1.<init>()
            return r1
        L28:
            java.lang.String r1 = "zbg"
            java.lang.String r2 = "zbh"
            java.lang.String r3 = "zbd"
            java.lang.String r4 = "zbe"
            java.lang.String r0 = "zbf"
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r4, r0, r1, r2}
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbow r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbow.zbb
            java.lang.String r3 = "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002က\u0001\u0003ဇ\u0002\u0004ᐉ\u0003"
            java.lang.Object r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf.zbA(r2, r3, r1)
            return r1
        L3f:
            byte r1 = r1.zbi
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            return r1
    }

    public final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbpb zbd() {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbpb r0 = r0.zbh
            if (r0 != 0) goto L8
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbpb r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbpb.zbh()
        L8:
            return r0
    }
}

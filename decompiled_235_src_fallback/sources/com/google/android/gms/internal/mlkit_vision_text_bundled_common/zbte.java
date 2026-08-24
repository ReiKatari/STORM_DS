package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbte extends com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtg {
    private int zbb;
    private int zbc;
    private int zbd;

    public /* synthetic */ zbte(byte[] r1, int r2, int r3, boolean r4, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtd r5) {
            r0 = this;
            r1 = 0
            r0.<init>(r1)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0.zbd = r1
            r1 = 0
            r0.zbb = r1
            return
    }

    public final int zba(int r4) {
            r3 = this;
            int r4 = r3.zbd
            r0 = 0
            r3.zbd = r0
            int r1 = r3.zbb
            int r2 = r3.zbc
            int r1 = r1 + r2
            r3.zbb = r1
            if (r1 <= 0) goto L13
            r3.zbc = r1
            r3.zbb = r0
            return r4
        L13:
            r3.zbc = r0
            return r4
    }
}

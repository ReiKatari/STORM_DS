package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbku extends com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkr {
    public zbku() {
            r1 = this;
            r0 = 4
            r1.<init>(r0)
            return
    }

    public final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbku zba(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.zbb
            int r1 = r0 + 1
            java.lang.Object[] r2 = r6.zba
            int r3 = r2.length
            r4 = 0
            if (r3 >= r1) goto L25
            int r5 = r3 >> 1
            int r3 = r3 + r5
            int r3 = r3 + 1
            if (r3 >= r1) goto L17
            int r0 = java.lang.Integer.highestOneBit(r0)
            int r3 = r0 + r0
        L17:
            if (r3 >= 0) goto L1c
            r3 = 2147483647(0x7fffffff, float:NaN)
        L1c:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r3)
            r6.zba = r0
            r6.zbc = r4
            goto L33
        L25:
            boolean r0 = r6.zbc
            if (r0 == 0) goto L33
            java.lang.Object r0 = r2.clone()
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r6.zba = r0
            r6.zbc = r4
        L33:
            java.lang.Object[] r0 = r6.zba
            int r1 = r6.zbb
            int r2 = r1 + 1
            r6.zbb = r2
            r0[r1] = r7
            return r6
    }

    public final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx zbb() {
            r1 = this;
            r0 = 1
            r1.zbc = r0
            java.lang.Object[] r0 = r1.zba
            int r1 = r1.zbb
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx.zbg(r0, r1)
            return r1
    }
}

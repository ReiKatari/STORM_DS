package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
abstract class zbkn extends com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbjz {
    final java.lang.CharSequence zbb;
    int zbc;
    int zbd;

    public zbkn(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbko r1, java.lang.CharSequence r2) {
            r0 = this;
            r0.<init>()
            r1 = 0
            r0.zbc = r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0.zbd = r1
            r0.zbb = r2
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbjz
    public final /* bridge */ /* synthetic */ java.lang.Object zba() {
            r5 = this;
            int r0 = r5.zbc
        L2:
            int r1 = r5.zbc
            r2 = -1
            if (r1 == r2) goto L63
            int r1 = r5.zbd(r1)
            if (r1 != r2) goto L17
            java.lang.CharSequence r1 = r5.zbb
            int r1 = r1.length()
            r5.zbc = r2
            r3 = r2
            goto L1d
        L17:
            int r3 = r5.zbc(r1)
            r5.zbc = r3
        L1d:
            if (r3 != r0) goto L2e
            int r3 = r3 + 1
            r5.zbc = r3
            java.lang.CharSequence r1 = r5.zbb
            int r1 = r1.length()
            if (r3 <= r1) goto L2
            r5.zbc = r2
            goto L2
        L2e:
            if (r0 >= r1) goto L35
            java.lang.CharSequence r3 = r5.zbb
            r3.charAt(r0)
        L35:
            if (r0 >= r1) goto L3e
            java.lang.CharSequence r3 = r5.zbb
            int r4 = r1 + (-1)
            r3.charAt(r4)
        L3e:
            int r3 = r5.zbd
            r4 = 1
            if (r3 != r4) goto L55
            java.lang.CharSequence r1 = r5.zbb
            int r1 = r1.length()
            r5.zbc = r2
            if (r1 <= r0) goto L58
            java.lang.CharSequence r2 = r5.zbb
            int r3 = r1 + (-1)
            r2.charAt(r3)
            goto L58
        L55:
            int r3 = r3 + r2
            r5.zbd = r3
        L58:
            java.lang.CharSequence r5 = r5.zbb
            java.lang.CharSequence r5 = r5.subSequence(r0, r1)
            java.lang.String r5 = r5.toString()
            return r5
        L63:
            r5.zbb()
            r5 = 0
            return r5
    }

    public abstract int zbc(int r1);

    public abstract int zbd(int r1);
}

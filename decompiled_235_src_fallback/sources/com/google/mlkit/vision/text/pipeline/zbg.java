package com.google.mlkit.vision.text.pipeline;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbg {
    public static java.lang.String zba(java.util.List r4) {
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
            java.lang.String r1 = "und"
        L7:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L24
            java.lang.Object r2 = r4.next()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaaw r2 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaaw) r2
            float r3 = r2.zbc()
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 >= 0) goto L7
            float r0 = r2.zbc()
            java.lang.String r1 = r2.zbf()
            goto L7
        L24:
            return r1
    }
}

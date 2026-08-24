package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbko {
    private final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkm zba;

    private zbko(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkm r2) {
            r1 = this;
            int r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkc.zbb
            r1.<init>()
            r1.zba = r2
            return
    }

    public static com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbko zba(java.lang.String r2) {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbko r2 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbko
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkm r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkm
            java.lang.String r1 = "#vk "
            r0.<init>(r1)
            r2.<init>(r0)
            return r2
    }

    public final java.util.List zbb(java.lang.CharSequence r3) {
            r2 = this;
            r3.getClass()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkm r0 = r2.zba
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkl r1 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkl
            r1.<init>(r0, r2, r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        Lf:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L1f
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            r2.add(r3)
            goto Lf
        L1f:
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            return r2
    }
}

package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbwa extends com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwh {
    public zbwa() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwh
    public final void zba() {
            r2 = this;
            boolean r0 = r2.zbj()
            if (r0 != 0) goto L3d
            r0 = 0
        L7:
            int r1 = r2.zbc()
            if (r0 >= r1) goto L1f
            java.util.Map$Entry r1 = r2.zbg(r0)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwb r1 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwb) r1
            java.lang.Comparable r1 = r1.zba()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtt r1 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtt) r1
            r1.zbg()
            int r0 = r0 + 1
            goto L7
        L1f:
            java.lang.Iterable r0 = r2.zbd()
            java.util.Iterator r0 = r0.iterator()
        L27:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getKey()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtt r1 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtt) r1
            r1.zbg()
            goto L27
        L3d:
            super.zba()
            return
    }
}

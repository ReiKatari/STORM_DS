package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbvc implements com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvk {
    private final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvk[] zba;

    public zbvc(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvk... r1) {
            r0 = this;
            r0.<init>()
            r0.zba = r1
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvk
    public final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvj zbb(java.lang.Class r4) {
            r3 = this;
            r0 = 0
        L1:
            r1 = 2
            if (r0 >= r1) goto L16
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvk[] r1 = r3.zba
            r1 = r1[r0]
            boolean r2 = r1.zbc(r4)
            if (r2 == 0) goto L13
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvj r3 = r1.zbb(r4)
            return r3
        L13:
            int r0 = r0 + 1
            goto L1
        L16:
            java.lang.String r3 = r4.getName()
            java.lang.String r4 = "No factory is available for message type: "
            java.lang.String r3 = r4.concat(r3)
            defpackage.fa6.h(r3)
            r3 = 0
            return r3
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvk
    public final boolean zbc(java.lang.Class r4) {
            r3 = this;
            r0 = 0
            r1 = r0
        L2:
            r2 = 2
            if (r1 >= r2) goto L14
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvk[] r2 = r3.zba
            r2 = r2[r1]
            boolean r2 = r2.zbc(r4)
            if (r2 == 0) goto L11
            r3 = 1
            return r3
        L11:
            int r1 = r1 + 1
            goto L2
        L14:
            return r0
    }
}

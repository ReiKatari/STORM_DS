package com.google.mlkit.vision.text.pipeline;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zba extends com.google.mlkit.vision.text.pipeline.zbn {
    private final com.google.mlkit.vision.text.pipeline.zbo zba;
    private final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbok zbb;
    private final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx zbc;
    private final boolean zbd;

    public zba(com.google.mlkit.vision.text.pipeline.zbo r1, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbok r2, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.zba = r1
            r0.zbb = r2
            if (r3 == 0) goto Le
            r0.zbc = r3
            r0.zbd = r4
            return
        Le:
            java.lang.String r0 = "Null lineBoxParcels"
            defpackage.u34.x(r0)
            r0 = 0
            throw r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.mlkit.vision.text.pipeline.zbn
            r2 = 0
            if (r1 == 0) goto L38
            com.google.mlkit.vision.text.pipeline.zbn r5 = (com.google.mlkit.vision.text.pipeline.zbn) r5
            com.google.mlkit.vision.text.pipeline.zbo r1 = r4.zba
            com.google.mlkit.vision.text.pipeline.zbo r3 = r5.zbc()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L38
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbok r1 = r4.zbb
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbok r3 = r5.zbb()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L38
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx r1 = r4.zbc
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx r3 = r5.zba()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L38
            boolean r4 = r4.zbd
            boolean r5 = r5.zbd()
            if (r4 != r5) goto L38
            return r0
        L38:
            return r2
    }

    public final int hashCode() {
            r3 = this;
            com.google.mlkit.vision.text.pipeline.zbo r0 = r3.zba
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbok r2 = r3.zbb
            int r0 = r0 * r1
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx r2 = r3.zbc
            int r0 = r0 * r1
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            r2 = 1
            boolean r3 = r3.zbd
            if (r2 == r3) goto L22
            r3 = 1237(0x4d5, float:1.733E-42)
            goto L24
        L22:
            r3 = 1231(0x4cf, float:1.725E-42)
        L24:
            int r0 = r0 * r1
            r3 = r3 ^ r0
            return r3
    }

    public final java.lang.String toString() {
            r6 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx r0 = r6.zbc
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbok r1 = r6.zbb
            com.google.mlkit.vision.text.pipeline.zbo r2 = r6.zba
            java.lang.String r2 = r2.toString()
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = ", textParcel="
            java.lang.String r4 = ", lineBoxParcels="
            java.lang.String r5 = "VkpResults{status="
            java.lang.StringBuilder r1 = defpackage.i61.u(r5, r2, r3, r1, r4)
            r1.append(r0)
            java.lang.String r0 = ", fromColdCall="
            r1.append(r0)
            boolean r6 = r6.zbd
            java.lang.String r0 = "}"
            java.lang.String r6 = defpackage.i61.o(r1, r6, r0)
            return r6
    }

    @Override // com.google.mlkit.vision.text.pipeline.zbn
    public final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx zba() {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx r0 = r0.zbc
            return r0
    }

    @Override // com.google.mlkit.vision.text.pipeline.zbn
    public final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbok zbb() {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbok r0 = r0.zbb
            return r0
    }

    @Override // com.google.mlkit.vision.text.pipeline.zbn
    public final com.google.mlkit.vision.text.pipeline.zbo zbc() {
            r0 = this;
            com.google.mlkit.vision.text.pipeline.zbo r0 = r0.zba
            return r0
    }

    @Override // com.google.mlkit.vision.text.pipeline.zbn
    public final boolean zbd() {
            r0 = this;
            boolean r0 = r0.zbd
            return r0
    }
}

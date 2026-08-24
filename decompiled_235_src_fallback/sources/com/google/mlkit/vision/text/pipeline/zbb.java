package com.google.mlkit.vision.text.pipeline;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbb extends com.google.mlkit.vision.text.pipeline.zbo {
    private final int zba;
    private final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki zbb;

    public zbb(int r1, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki r2) {
            r0 = this;
            r0.<init>()
            r0.zba = r1
            r0.zbb = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.mlkit.vision.text.pipeline.zbo
            r2 = 0
            if (r1 == 0) goto L20
            com.google.mlkit.vision.text.pipeline.zbo r5 = (com.google.mlkit.vision.text.pipeline.zbo) r5
            int r1 = r4.zba
            int r3 = r5.zba()
            if (r1 != r3) goto L20
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki r4 = r4.zbb
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki r5 = r5.zbb()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L20
            return r0
        L20:
            return r2
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.zba
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki r2 = r2.zbb
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            int r2 = r2.hashCode()
            r2 = r2 ^ r0
            return r2
    }

    public final java.lang.String toString() {
            r3 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki r0 = r3.zbb
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "VkpStatus{exceptionType="
            r1.<init>(r2)
            int r3 = r3.zba
            r1.append(r3)
            java.lang.String r3 = ", remoteException="
            r1.append(r3)
            r1.append(r0)
            java.lang.String r3 = "}"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            return r3
    }

    @Override // com.google.mlkit.vision.text.pipeline.zbo
    public final int zba() {
            r0 = this;
            int r0 = r0.zba
            return r0
    }

    @Override // com.google.mlkit.vision.text.pipeline.zbo
    public final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki zbb() {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki r0 = r0.zbb
            return r0
    }
}

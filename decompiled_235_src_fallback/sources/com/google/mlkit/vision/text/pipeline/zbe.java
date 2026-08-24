package com.google.mlkit.vision.text.pipeline;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbe extends com.google.mlkit.vision.text.pipeline.VkpTextRecognizerOptions {
    private final java.lang.String zba;
    private final java.lang.String zbb;
    private final java.lang.String zbc;
    private final boolean zbd;

    public /* synthetic */ zbe(java.lang.String r1, java.lang.String r2, java.lang.String r3, boolean r4, com.google.mlkit.vision.text.pipeline.zbd r5) {
            r0 = this;
            r0.<init>()
            r0.zba = r1
            r0.zbb = r2
            r0.zbc = r3
            r0.zbd = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.mlkit.vision.text.pipeline.VkpTextRecognizerOptions
            r2 = 0
            if (r1 == 0) goto L38
            com.google.mlkit.vision.text.pipeline.VkpTextRecognizerOptions r5 = (com.google.mlkit.vision.text.pipeline.VkpTextRecognizerOptions) r5
            java.lang.String r1 = r4.zba
            java.lang.String r3 = r5.zba()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L38
            java.lang.String r1 = r4.zbb
            java.lang.String r3 = r5.zbc()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L38
            java.lang.String r1 = r4.zbc
            java.lang.String r3 = r5.zbb()
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
            java.lang.String r0 = r3.zba
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            java.lang.String r2 = r3.zbb
            int r0 = r0 * r1
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            java.lang.String r2 = r3.zbc
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
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "VkpTextRecognizerOptions{configLabel="
            r0.<init>(r1)
            java.lang.String r1 = r2.zba
            r0.append(r1)
            java.lang.String r1 = ", modelDir="
            r0.append(r1)
            java.lang.String r1 = r2.zbb
            r0.append(r1)
            java.lang.String r1 = ", languageHint="
            r0.append(r1)
            java.lang.String r1 = r2.zbc
            r0.append(r1)
            java.lang.String r1 = ", enableLowLatencyInBackground="
            r0.append(r1)
            boolean r2 = r2.zbd
            java.lang.String r1 = "}"
            java.lang.String r2 = defpackage.i61.o(r0, r2, r1)
            return r2
    }

    @Override // com.google.mlkit.vision.text.pipeline.VkpTextRecognizerOptions
    public final java.lang.String zba() {
            r0 = this;
            java.lang.String r0 = r0.zba
            return r0
    }

    @Override // com.google.mlkit.vision.text.pipeline.VkpTextRecognizerOptions
    public final java.lang.String zbb() {
            r0 = this;
            java.lang.String r0 = r0.zbc
            return r0
    }

    @Override // com.google.mlkit.vision.text.pipeline.VkpTextRecognizerOptions
    public final java.lang.String zbc() {
            r0 = this;
            java.lang.String r0 = r0.zbb
            return r0
    }

    @Override // com.google.mlkit.vision.text.pipeline.VkpTextRecognizerOptions
    public final boolean zbd() {
            r0 = this;
            boolean r0 = r0.zbd
            return r0
    }
}

package com.google.mlkit.vision.text.pipeline;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbc extends com.google.mlkit.vision.text.pipeline.VkpTextRecognizerOptions.Builder {
    private java.lang.String zba;
    private java.lang.String zbb;
    private java.lang.String zbc;
    private boolean zbd;
    private byte zbe;

    public zbc() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.mlkit.vision.text.pipeline.VkpTextRecognizerOptions.Builder
    public final com.google.mlkit.vision.text.pipeline.VkpTextRecognizerOptions build() {
            r8 = this;
            byte r0 = r8.zbe
            r1 = 1
            if (r0 != r1) goto L1b
            java.lang.String r3 = r8.zba
            if (r3 == 0) goto L1b
            java.lang.String r4 = r8.zbb
            if (r4 == 0) goto L1b
            java.lang.String r5 = r8.zbc
            if (r5 != 0) goto L12
            goto L1b
        L12:
            com.google.mlkit.vision.text.pipeline.zbe r2 = new com.google.mlkit.vision.text.pipeline.zbe
            boolean r6 = r8.zbd
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        L1b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r8.zba
            if (r1 != 0) goto L29
            java.lang.String r1 = " configLabel"
            r0.append(r1)
        L29:
            java.lang.String r1 = r8.zbb
            if (r1 != 0) goto L32
            java.lang.String r1 = " modelDir"
            r0.append(r1)
        L32:
            java.lang.String r1 = r8.zbc
            if (r1 != 0) goto L3b
            java.lang.String r1 = " languageHint"
            r0.append(r1)
        L3b:
            byte r8 = r8.zbe
            if (r8 != 0) goto L44
            java.lang.String r8 = " enableLowLatencyInBackground"
            r0.append(r8)
        L44:
            java.lang.String r8 = r0.toString()
            java.lang.String r0 = "Missing required properties:"
            java.lang.String r8 = r0.concat(r8)
            defpackage.i.m(r8)
            r8 = 0
            return r8
    }

    @Override // com.google.mlkit.vision.text.pipeline.VkpTextRecognizerOptions.Builder
    public final com.google.mlkit.vision.text.pipeline.VkpTextRecognizerOptions.Builder setConfigLabel(java.lang.String r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r0.zba = r1
            return r0
        L5:
            java.lang.String r0 = "Null configLabel"
            defpackage.u34.x(r0)
            r0 = 0
            return r0
    }

    @Override // com.google.mlkit.vision.text.pipeline.VkpTextRecognizerOptions.Builder
    public final com.google.mlkit.vision.text.pipeline.VkpTextRecognizerOptions.Builder setEnableLowLatencyInBackground(boolean r1) {
            r0 = this;
            r0.zbd = r1
            r1 = 1
            r0.zbe = r1
            return r0
    }

    @Override // com.google.mlkit.vision.text.pipeline.VkpTextRecognizerOptions.Builder
    public final com.google.mlkit.vision.text.pipeline.VkpTextRecognizerOptions.Builder setLanguageHint(java.lang.String r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r0.zbc = r1
            return r0
        L5:
            java.lang.String r0 = "Null languageHint"
            defpackage.u34.x(r0)
            r0 = 0
            return r0
    }

    @Override // com.google.mlkit.vision.text.pipeline.VkpTextRecognizerOptions.Builder
    public final com.google.mlkit.vision.text.pipeline.VkpTextRecognizerOptions.Builder setModelDir(java.lang.String r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r0.zbb = r1
            return r0
        L5:
            java.lang.String r0 = "Null modelDir"
            defpackage.u34.x(r0)
            r0 = 0
            return r0
    }
}

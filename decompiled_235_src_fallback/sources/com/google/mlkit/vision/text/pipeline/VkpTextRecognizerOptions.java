package com.google.mlkit.vision.text.pipeline;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class VkpTextRecognizerOptions {

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static abstract class Builder {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract com.google.mlkit.vision.text.pipeline.VkpTextRecognizerOptions build();

        public abstract com.google.mlkit.vision.text.pipeline.VkpTextRecognizerOptions.Builder setConfigLabel(java.lang.String r1);

        public abstract com.google.mlkit.vision.text.pipeline.VkpTextRecognizerOptions.Builder setEnableLowLatencyInBackground(boolean r1);

        public abstract com.google.mlkit.vision.text.pipeline.VkpTextRecognizerOptions.Builder setLanguageHint(java.lang.String r1);

        public abstract com.google.mlkit.vision.text.pipeline.VkpTextRecognizerOptions.Builder setModelDir(java.lang.String r1);
    }

    public VkpTextRecognizerOptions() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.mlkit.vision.text.pipeline.VkpTextRecognizerOptions.Builder builder(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            com.google.mlkit.vision.text.pipeline.zbc r0 = new com.google.mlkit.vision.text.pipeline.zbc
            r0.<init>()
            r0.setConfigLabel(r1)
            if (r2 != 0) goto Lc
            java.lang.String r2 = "mlkit-google-ocr-models"
        Lc:
            r0.setModelDir(r2)
            r0.setLanguageHint(r3)
            r1 = 0
            r0.setEnableLowLatencyInBackground(r1)
            return r0
    }

    public abstract java.lang.String zba();

    public abstract java.lang.String zbb();

    public abstract java.lang.String zbc();

    public abstract boolean zbd();
}

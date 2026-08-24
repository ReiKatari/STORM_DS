package com.google.mlkit.vision.text.chinese;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class ChineseTextRecognizerOptions implements com.google.mlkit.vision.text.TextRecognizerOptionsInterface {
    final java.util.concurrent.atomic.AtomicReference zza;
    private final java.util.concurrent.Executor zzb;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static class Builder {
        private java.util.concurrent.Executor zza;

        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public com.google.mlkit.vision.text.chinese.ChineseTextRecognizerOptions build() {
                r2 = this;
                com.google.mlkit.vision.text.chinese.ChineseTextRecognizerOptions r0 = new com.google.mlkit.vision.text.chinese.ChineseTextRecognizerOptions
                java.util.concurrent.Executor r2 = r2.zza
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public com.google.mlkit.vision.text.chinese.ChineseTextRecognizerOptions.Builder setExecutor(java.util.concurrent.Executor r1) {
                r0 = this;
                r0.zza = r1
                return r0
        }
    }

    public /* synthetic */ ChineseTextRecognizerOptions(java.util.concurrent.Executor r1, com.google.mlkit.vision.text.chinese.zza r2) {
            r0 = this;
            r0.<init>()
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r2.<init>()
            r0.zza = r2
            r0.zzb = r1
            return
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r1 = 1
            return r1
        L4:
            boolean r0 = r2 instanceof com.google.mlkit.vision.text.chinese.ChineseTextRecognizerOptions
            if (r0 != 0) goto La
            r1 = 0
            return r1
        La:
            com.google.mlkit.vision.text.chinese.ChineseTextRecognizerOptions r2 = (com.google.mlkit.vision.text.chinese.ChineseTextRecognizerOptions) r2
            java.util.concurrent.Executor r1 = r1.zzb
            java.util.concurrent.Executor r2 = r2.zzb
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r2)
            return r1
    }

    @Override // com.google.mlkit.vision.text.TextRecognizerOptionsInterface
    public final java.lang.String getConfigLabel() {
            r0 = this;
            java.lang.String r0 = "taser_tflite_gocrchinese_and_latin_mbv2_aksara_layout_gcn_mobile"
            return r0
    }

    @Override // com.google.mlkit.vision.text.TextRecognizerOptionsInterface
    public final java.util.concurrent.Executor getExecutor() {
            r0 = this;
            java.util.concurrent.Executor r0 = r0.zzb
            return r0
    }

    @Override // com.google.mlkit.vision.text.TextRecognizerOptionsInterface
    public final boolean getIsThickClient() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference r1 = r1.zza
            java.lang.String r0 = "com.google.mlkit.dynamite.text.chinese"
            boolean r1 = com.google.mlkit.vision.text.internal.TextRecognizerOptionsUtils.isThickClient(r1, r0)
            return r1
    }

    @Override // com.google.mlkit.vision.text.TextRecognizerOptionsInterface
    public final java.lang.String getLanguageHint() {
            r0 = this;
            java.lang.String r0 = "zh"
            return r0
    }

    @Override // com.google.mlkit.vision.text.TextRecognizerOptionsInterface
    public final int getLoggingEventId() {
            r0 = this;
            boolean r0 = r0.getIsThickClient()
            if (r0 == 0) goto L9
            r0 = 24316(0x5efc, float:3.4074E-41)
            return r0
        L9:
            r0 = 24330(0x5f0a, float:3.4094E-41)
            return r0
    }

    @Override // com.google.mlkit.vision.text.TextRecognizerOptionsInterface
    public final int getLoggingLanguageOption() {
            r0 = this;
            r0 = 2
            return r0
    }

    @Override // com.google.mlkit.vision.text.TextRecognizerOptionsInterface
    public final java.lang.String getLoggingLibraryName() {
            r1 = this;
            r0 = 1
            boolean r1 = r1.getIsThickClient()
            if (r0 == r1) goto La
            java.lang.String r1 = "play-services-mlkit-text-recognition-chinese"
            return r1
        La:
            java.lang.String r1 = "text-recognition-chinese"
            return r1
    }

    @Override // com.google.mlkit.vision.text.TextRecognizerOptionsInterface
    public final java.lang.String getLoggingLibraryNameForOptionalModule() {
            r0 = this;
            java.lang.String r0 = "optional-module-text-chinese"
            return r0
    }

    @Override // com.google.mlkit.vision.text.TextRecognizerOptionsInterface
    public final java.lang.String getModuleId() {
            r1 = this;
            r0 = 1
            boolean r1 = r1.getIsThickClient()
            if (r0 == r1) goto La
            java.lang.String r1 = "com.google.android.gms.mlkit_ocr_chinese"
            return r1
        La:
            java.lang.String r1 = "com.google.mlkit.dynamite.text.chinese"
            return r1
    }

    public int hashCode() {
            r0 = this;
            java.util.concurrent.Executor r0 = r0.zzb
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }
}

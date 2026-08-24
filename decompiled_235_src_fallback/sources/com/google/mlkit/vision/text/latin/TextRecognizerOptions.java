package com.google.mlkit.vision.text.latin;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class TextRecognizerOptions implements com.google.mlkit.vision.text.TextRecognizerOptionsInterface {
    public static final com.google.mlkit.vision.text.latin.TextRecognizerOptions DEFAULT_OPTIONS = null;
    final java.util.concurrent.atomic.AtomicReference zza;
    private final java.util.concurrent.Executor zzb;
    private final java.lang.String zzc;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static class Builder {
        private java.util.concurrent.Executor zza;

        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public com.google.mlkit.vision.text.latin.TextRecognizerOptions build() {
                r2 = this;
                com.google.mlkit.vision.text.latin.TextRecognizerOptions r0 = new com.google.mlkit.vision.text.latin.TextRecognizerOptions
                java.util.concurrent.Executor r2 = r2.zza
                java.lang.String r1 = "taser_tflite_gocrlatin_mbv2_scriptid_aksara_layout_gcn_mobile"
                r0.<init>(r2, r1)
                return r0
        }

        public com.google.mlkit.vision.text.latin.TextRecognizerOptions.Builder setExecutor(java.util.concurrent.Executor r1) {
                r0 = this;
                r0.zza = r1
                return r0
        }
    }

    static {
            com.google.mlkit.vision.text.latin.TextRecognizerOptions$Builder r0 = new com.google.mlkit.vision.text.latin.TextRecognizerOptions$Builder
            r0.<init>()
            com.google.mlkit.vision.text.latin.TextRecognizerOptions r0 = r0.build()
            com.google.mlkit.vision.text.latin.TextRecognizerOptions.DEFAULT_OPTIONS = r0
            return
    }

    public TextRecognizerOptions(java.util.concurrent.Executor r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r2.<init>()
            r0.zza = r2
            r0.zzb = r1
            java.lang.String r1 = "taser_tflite_gocrlatin_mbv2_scriptid_aksara_layout_gcn_mobile"
            r0.zzc = r1
            return
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r1 = 1
            return r1
        L4:
            boolean r0 = r2 instanceof com.google.mlkit.vision.text.latin.TextRecognizerOptions
            if (r0 != 0) goto La
            r1 = 0
            return r1
        La:
            com.google.mlkit.vision.text.latin.TextRecognizerOptions r2 = (com.google.mlkit.vision.text.latin.TextRecognizerOptions) r2
            java.util.concurrent.Executor r1 = r1.zzb
            java.util.concurrent.Executor r2 = r2.zzb
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r2)
            return r1
    }

    @Override // com.google.mlkit.vision.text.TextRecognizerOptionsInterface
    public final java.lang.String getConfigLabel() {
            r0 = this;
            java.lang.String r0 = r0.zzc
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
            java.lang.String r0 = "com.google.mlkit.dynamite.text.latin"
            boolean r1 = com.google.mlkit.vision.text.internal.TextRecognizerOptionsUtils.isThickClient(r1, r0)
            return r1
    }

    @Override // com.google.mlkit.vision.text.TextRecognizerOptionsInterface
    public final java.lang.String getLanguageHint() {
            r0 = this;
            java.lang.String r0 = "en"
            return r0
    }

    @Override // com.google.mlkit.vision.text.TextRecognizerOptionsInterface
    public final int getLoggingEventId() {
            r0 = this;
            boolean r0 = r0.getIsThickClient()
            if (r0 == 0) goto L9
            r0 = 24317(0x5efd, float:3.4075E-41)
            return r0
        L9:
            r0 = 24306(0x5ef2, float:3.406E-41)
            return r0
    }

    @Override // com.google.mlkit.vision.text.TextRecognizerOptionsInterface
    public final int getLoggingLanguageOption() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // com.google.mlkit.vision.text.TextRecognizerOptionsInterface
    public final java.lang.String getLoggingLibraryName() {
            r1 = this;
            r0 = 1
            boolean r1 = r1.getIsThickClient()
            if (r0 == r1) goto La
            java.lang.String r1 = "play-services-mlkit-text-recognition"
            return r1
        La:
            java.lang.String r1 = "text-recognition"
            return r1
    }

    @Override // com.google.mlkit.vision.text.TextRecognizerOptionsInterface
    public final java.lang.String getLoggingLibraryNameForOptionalModule() {
            r0 = this;
            java.lang.String r0 = "optional-module-text-latin"
            return r0
    }

    @Override // com.google.mlkit.vision.text.TextRecognizerOptionsInterface
    public final java.lang.String getModuleId() {
            r1 = this;
            r0 = 1
            boolean r1 = r1.getIsThickClient()
            if (r0 == r1) goto La
            java.lang.String r1 = "com.google.android.gms.vision.ocr"
            return r1
        La:
            java.lang.String r1 = "com.google.mlkit.dynamite.text.latin"
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

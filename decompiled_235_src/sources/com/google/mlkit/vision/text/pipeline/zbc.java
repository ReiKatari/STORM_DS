package com.google.mlkit.vision.text.pipeline;

import com.google.mlkit.vision.text.pipeline.VkpTextRecognizerOptions;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbc extends VkpTextRecognizerOptions.Builder {
    private String zba;
    private String zbb;
    private String zbc;
    private boolean zbd;
    private byte zbe;

    @Override // com.google.mlkit.vision.text.pipeline.VkpTextRecognizerOptions.Builder
    public final VkpTextRecognizerOptions build() {
        String str;
        String str2;
        String str3;
        if (this.zbe == 1 && (str = this.zba) != null && (str2 = this.zbb) != null && (str3 = this.zbc) != null) {
            return new zbe(str, str2, str3, this.zbd, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zba == null) {
            sb.append(" configLabel");
        }
        if (this.zbb == null) {
            sb.append(" modelDir");
        }
        if (this.zbc == null) {
            sb.append(" languageHint");
        }
        if (this.zbe == 0) {
            sb.append(" enableLowLatencyInBackground");
        }
        i.m("Missing required properties:".concat(sb.toString()));
        return null;
    }

    @Override // com.google.mlkit.vision.text.pipeline.VkpTextRecognizerOptions.Builder
    public final VkpTextRecognizerOptions.Builder setConfigLabel(String str) {
        if (str != null) {
            this.zba = str;
            return this;
        }
        u34.x("Null configLabel");
        return null;
    }

    @Override // com.google.mlkit.vision.text.pipeline.VkpTextRecognizerOptions.Builder
    public final VkpTextRecognizerOptions.Builder setEnableLowLatencyInBackground(boolean z) {
        this.zbd = z;
        this.zbe = (byte) 1;
        return this;
    }

    @Override // com.google.mlkit.vision.text.pipeline.VkpTextRecognizerOptions.Builder
    public final VkpTextRecognizerOptions.Builder setLanguageHint(String str) {
        if (str != null) {
            this.zbc = str;
            return this;
        }
        u34.x("Null languageHint");
        return null;
    }

    @Override // com.google.mlkit.vision.text.pipeline.VkpTextRecognizerOptions.Builder
    public final VkpTextRecognizerOptions.Builder setModelDir(String str) {
        if (str != null) {
            this.zbb = str;
            return this;
        }
        u34.x("Null modelDir");
        return null;
    }
}

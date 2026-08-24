package com.google.mlkit.vision.text;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class TextRecognition {
    private TextRecognition() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.mlkit.vision.text.TextRecognizer getClient(com.google.mlkit.vision.text.TextRecognizerOptionsInterface r2) {
            com.google.mlkit.common.sdkinternal.MlKitContext r0 = com.google.mlkit.common.sdkinternal.MlKitContext.getInstance()
            java.lang.Class<com.google.mlkit.vision.text.internal.zzo> r1 = com.google.mlkit.vision.text.internal.zzo.class
            java.lang.Object r0 = r0.get(r1)
            com.google.mlkit.vision.text.internal.zzo r0 = (com.google.mlkit.vision.text.internal.zzo) r0
            com.google.mlkit.vision.text.TextRecognizer r2 = r0.zza(r2)
            return r2
    }
}

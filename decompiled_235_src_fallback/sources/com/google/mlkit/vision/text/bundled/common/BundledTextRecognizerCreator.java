package com.google.mlkit.vision.text.bundled.common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class BundledTextRecognizerCreator extends com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboc {
    public BundledTextRecognizerCreator() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbod
    public /* bridge */ /* synthetic */ com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboa newTextRecognizer(defpackage.d13 r1) {
            r0 = this;
            com.google.mlkit.vision.text.bundled.common.zba r0 = r0.newTextRecognizer(r1)
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbod
    public com.google.mlkit.vision.text.bundled.common.zba newTextRecognizer(defpackage.d13 r1) {
            r0 = this;
            android.os.RemoteException r0 = new android.os.RemoteException
            java.lang.String r1 = "Please use newTextRecognizerWithOptions instead."
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbod
    public /* bridge */ /* synthetic */ com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboa newTextRecognizerWithOptions(defpackage.d13 r1, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbom r2) {
            r0 = this;
            com.google.mlkit.vision.text.bundled.common.zba r0 = r0.newTextRecognizerWithOptions(r1, r2)
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbod
    public com.google.mlkit.vision.text.bundled.common.zba newTextRecognizerWithOptions(defpackage.d13 r7, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbom r8) {
            r6 = this;
            java.lang.Object r6 = defpackage.zh4.d(r7)
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Object r6 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            r1 = r6
            android.content.Context r1 = (android.content.Context) r1
            com.google.mlkit.vision.text.bundled.common.zba r0 = new com.google.mlkit.vision.text.bundled.common.zba
            java.lang.String r2 = r8.zba()
            java.lang.String r3 = r8.zbc()
            java.lang.String r4 = r8.zbb()
            boolean r5 = r8.zbd()
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }
}

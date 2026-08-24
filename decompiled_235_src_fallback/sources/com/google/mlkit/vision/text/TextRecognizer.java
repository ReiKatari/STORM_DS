package com.google.mlkit.vision.text;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public interface TextRecognizer extends com.google.mlkit.vision.interfaces.Detector<com.google.mlkit.vision.text.Text>, com.google.android.gms.common.api.OptionalModuleApi {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    @defpackage.ql4(defpackage.st3.ON_DESTROY)
    void close();

    com.google.android.gms.tasks.Task<com.google.mlkit.vision.text.Text> process(com.google.mlkit.vision.common.InputImage r1);

    com.google.android.gms.tasks.Task<com.google.mlkit.vision.text.Text> process(defpackage.p64 r1);
}

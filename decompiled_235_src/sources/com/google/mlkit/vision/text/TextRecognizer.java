package com.google.mlkit.vision.text;

import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.interfaces.Detector;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public interface TextRecognizer extends Detector<Text>, OptionalModuleApi {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    @ql4(st3.ON_DESTROY)
    void close();

    Task<Text> process(InputImage inputImage);

    Task<Text> process(p64 p64Var);
}

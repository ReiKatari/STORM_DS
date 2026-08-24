package com.google.mlkit.vision.text.bundled.common;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboc;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbom;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class BundledTextRecognizerCreator extends zboc {
    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbod
    public zba newTextRecognizer(d13 d13Var) {
        throw new RemoteException("Please use newTextRecognizerWithOptions instead.");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbod
    public zba newTextRecognizerWithOptions(d13 d13Var, zbom zbomVar) {
        return new zba((Context) Preconditions.checkNotNull((Context) zh4.d(d13Var)), zbomVar.zba(), zbomVar.zbc(), zbomVar.zbb(), zbomVar.zbd());
    }
}

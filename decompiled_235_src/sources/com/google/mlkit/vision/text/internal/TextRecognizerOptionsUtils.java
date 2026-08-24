package com.google.mlkit.vision.text.internal;

import com.google.android.gms.dynamite.DynamiteModule;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class TextRecognizerOptionsUtils {
    private TextRecognizerOptionsUtils() {
    }

    public static boolean isThickClient(AtomicReference<Boolean> atomicReference, String str) {
        boolean z;
        if (atomicReference.get() != null) {
            return atomicReference.get().booleanValue();
        }
        if (DynamiteModule.getLocalVersion(MlKitContext.getInstance().getApplicationContext(), str) > 0) {
            z = true;
        } else {
            z = false;
        }
        atomicReference.set(Boolean.valueOf(z));
        return z;
    }
}

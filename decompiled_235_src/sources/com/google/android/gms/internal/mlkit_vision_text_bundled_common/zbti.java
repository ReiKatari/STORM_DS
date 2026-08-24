package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.io.IOException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbti extends IOException {
    public zbti(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    public zbti() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public zbti(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}

package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbti extends java.io.IOException {
    public zbti() {
            r1 = this;
            java.lang.String r0 = "CodedOutputStream was writing to a flat byte array and ran out of space."
            r1.<init>(r0)
            return
    }

    public zbti(java.lang.String r2, java.lang.Throwable r3) {
            r1 = this;
            java.lang.String r0 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = r0.concat(r2)
            r1.<init>(r2, r3)
            return
    }

    public zbti(java.lang.Throwable r2) {
            r1 = this;
            java.lang.String r0 = "CodedOutputStream was writing to a flat byte array and ran out of space."
            r1.<init>(r0, r2)
            return
    }
}

package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbto {
    private final java.lang.Object zba;
    private final int zbb;

    public zbto(java.lang.Object r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.zba = r1
            r0.zbb = r2
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbto
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbto r4 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbto) r4
            java.lang.Object r0 = r3.zba
            java.lang.Object r2 = r4.zba
            if (r0 != r2) goto L16
            int r3 = r3.zbb
            int r4 = r4.zbb
            if (r3 != r4) goto L16
            r3 = 1
            return r3
        L16:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            java.lang.Object r0 = r2.zba
            int r0 = java.lang.System.identityHashCode(r0)
            r1 = 65535(0xffff, float:9.1834E-41)
            int r0 = r0 * r1
            int r2 = r2.zbb
            int r0 = r0 + r2
            return r0
    }
}

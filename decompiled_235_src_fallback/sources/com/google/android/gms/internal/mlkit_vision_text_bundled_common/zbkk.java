package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbkk extends com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki {
    private final java.lang.Object zba;

    public zbkk(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.zba = r1
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki
    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkk
            if (r0 == 0) goto Lf
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkk r2 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkk) r2
            java.lang.Object r1 = r1.zba
            java.lang.Object r2 = r2.zba
            boolean r1 = r1.equals(r2)
            return r1
        Lf:
            r1 = 0
            return r1
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki
    public final int hashCode() {
            r1 = this;
            java.lang.Object r1 = r1.zba
            int r1 = r1.hashCode()
            r0 = 1502476572(0x598df91c, float:4.995234E15)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.Object r2 = r2.zba
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "Optional.of("
            java.lang.String r1 = ")"
            java.lang.String r2 = defpackage.lb1.A(r0, r2, r1)
            return r2
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki
    public final java.lang.Object zba() {
            r0 = this;
            java.lang.Object r0 = r0.zba
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki
    public final java.lang.Object zbb(java.lang.Object r1) {
            r0 = this;
            java.lang.Object r0 = r0.zba
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki
    public final boolean zbc() {
            r0 = this;
            r0 = 1
            return r0
    }
}

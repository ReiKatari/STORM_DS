package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbvf {
    private final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbve zba;

    private zbvf(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbww r2, java.lang.Object r3, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbww r4, java.lang.Object r5) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbve r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbve
            r0.<init>(r2, r3, r4, r5)
            r1.zba = r0
            return
    }

    public static int zbb(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbve r2, java.lang.Object r3, java.lang.Object r4) {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbww r0 = r2.zba
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbww r2 = r2.zbc
            r1 = 1
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtu.zba(r0, r1, r3)
            r0 = 2
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtu.zba(r2, r0, r4)
            int r3 = r3 + r2
            return r3
    }

    public static com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvf zbd(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbww r1, java.lang.Object r2, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbww r3, java.lang.Object r4) {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvf r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvf
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public static void zbe(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk r2, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbve r3, java.lang.Object r4, java.lang.Object r5) {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbww r0 = r3.zba
            r1 = 1
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtu.zbk(r2, r0, r1, r4)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbww r3 = r3.zbc
            r4 = 2
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtu.zbk(r2, r3, r4, r5)
            return
    }

    public final int zba(int r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbve r0 = r0.zba
            int r1 = r1 << 3
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r1)
            int r0 = zbb(r0, r2, r3)
            int r0 = defpackage.xg6.b(r0, r0, r1)
            return r0
    }

    public final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbve zbc() {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbve r0 = r0.zba
            return r0
    }
}

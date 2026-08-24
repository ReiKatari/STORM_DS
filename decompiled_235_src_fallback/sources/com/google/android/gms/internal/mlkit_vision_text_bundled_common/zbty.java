package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbty implements com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvk {
    private static final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbty zba = null;

    static {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbty r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbty
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbty.zba = r0
            return
    }

    private zbty() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbty zba() {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbty r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbty.zba
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvk
    public final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvj zbb(java.lang.Class r3) {
            r2 = this;
            java.lang.Class<com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf> r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf.class
            boolean r0 = r2.isAssignableFrom(r3)
            r1 = 0
            if (r0 == 0) goto L28
            java.lang.Class r2 = r3.asSubclass(r2)     // Catch: java.lang.Exception -> L19
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf.zbs(r2)     // Catch: java.lang.Exception -> L19
            r0 = 3
            java.lang.Object r2 = r2.zbb(r0, r1, r1)     // Catch: java.lang.Exception -> L19
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvj r2 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvj) r2     // Catch: java.lang.Exception -> L19
            return r2
        L19:
            r2 = move-exception
            java.lang.String r3 = r3.getName()
            java.lang.String r0 = "Unable to get message info for "
            java.lang.String r3 = r0.concat(r3)
            defpackage.u34.p(r3, r2)
            return r1
        L28:
            java.lang.String r2 = r3.getName()
            java.lang.String r3 = "Unsupported message type: "
            java.lang.String r2 = r3.concat(r2)
            defpackage.i.h(r2)
            return r1
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvk
    public final boolean zbc(java.lang.Class r1) {
            r0 = this;
            java.lang.Class<com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf> r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf.class
            boolean r0 = r0.isAssignableFrom(r1)
            return r0
    }
}

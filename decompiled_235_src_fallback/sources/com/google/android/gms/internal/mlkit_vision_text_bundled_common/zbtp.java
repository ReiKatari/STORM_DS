package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbtp {
    static final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp zba = null;
    public static final /* synthetic */ int zbb = 0;
    private static volatile boolean zbc = false;
    private static volatile com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp zbd;
    private final java.util.Map zbe;

    static {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp
            r1 = 1
            r0.<init>(r1)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp.zba = r0
            return
    }

    public zbtp() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zbe = r0
            return
    }

    public zbtp(boolean r1) {
            r0 = this;
            r0.<init>()
            java.util.Map r1 = java.util.Collections.EMPTY_MAP
            r0.zbe = r1
            return
    }

    public static com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp zba() {
            int r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvu.zba
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp.zba
            return r0
    }

    public static com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp zbb() {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp.zbd
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.Class<com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp> r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp.class
            monitor-enter(r0)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp.zbd     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r1 = move-exception
            goto L1c
        L10:
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvu.zba     // Catch: java.lang.Throwable -> Le
            java.lang.Class<com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp> r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp.class
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtx.zbb(r1)     // Catch: java.lang.Throwable -> Le
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp.zbd = r1     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    public final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbud zbc(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r2, int r3) {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbto r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbto
            r0.<init>(r2, r3)
            java.util.Map r1 = r1.zbe
            java.lang.Object r1 = r1.get(r0)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbud r1 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbud) r1
            return r1
    }
}

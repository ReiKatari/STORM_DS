package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbvu {
    public static final /* synthetic */ int zba = 0;
    private static final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvu zbb = null;
    private final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvy zbc;
    private final java.util.concurrent.ConcurrentMap zbd;

    static {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvu r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvu
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvu.zbb = r0
            return
    }

    private zbvu() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.zbd = r0
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvd r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvd
            r0.<init>()
            r1.zbc = r0
            return
    }

    public static com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvu zba() {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvu r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvu.zbb
            return r0
    }

    public final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx zbb(java.lang.Class r3) {
            r2 = this;
            java.lang.String r0 = "messageType"
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuo.zbc(r3, r0)
            java.util.concurrent.ConcurrentMap r1 = r2.zbd
            java.lang.Object r1 = r1.get(r3)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r1 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx) r1
            if (r1 != 0) goto L24
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvy r1 = r2.zbc
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r1 = r1.zba(r3)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuo.zbc(r3, r0)
            java.util.concurrent.ConcurrentMap r2 = r2.zbd
            java.lang.Object r2 = r2.putIfAbsent(r3, r1)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r2 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx) r2
            if (r2 != 0) goto L23
            return r1
        L23:
            return r2
        L24:
            return r1
    }
}

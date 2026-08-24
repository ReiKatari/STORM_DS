package com.google.android.libraries.vision.visionkit.pipeline;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class AndroidAssetUtil {
    public static synchronized boolean a(android.content.Context r2) {
            java.lang.Class<com.google.android.libraries.vision.visionkit.pipeline.AndroidAssetUtil> r0 = com.google.android.libraries.vision.visionkit.pipeline.AndroidAssetUtil.class
            monitor-enter(r0)
            java.io.File r1 = r2.getCacheDir()     // Catch: java.lang.Throwable -> L11
            java.lang.String r1 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> L11
            boolean r2 = nativeInitializeAssetManager(r2, r1)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)
            return r2
        L11:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r2
    }

    private static native boolean nativeInitializeAssetManager(android.content.Context r0, java.lang.String r1);
}

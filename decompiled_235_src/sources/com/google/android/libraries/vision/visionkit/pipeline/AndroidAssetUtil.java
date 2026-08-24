package com.google.android.libraries.vision.visionkit.pipeline;

import android.content.Context;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class AndroidAssetUtil {
    public static synchronized boolean a(Context context) {
        boolean nativeInitializeAssetManager;
        synchronized (AndroidAssetUtil.class) {
            nativeInitializeAssetManager = nativeInitializeAssetManager(context, context.getCacheDir().getAbsolutePath());
        }
        return nativeInitializeAssetManager;
    }

    private static native boolean nativeInitializeAssetManager(Context context, String str);
}

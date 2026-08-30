package androidx.camera.core.impl.utils;

import android.view.Surface;
import k0.g;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class SurfaceUtil {
    static {
        System.loadLibrary("surface_util_jni");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k0.g] */
    public static g a(Surface surface) {
        int[] nativeGetSurfaceInfo = nativeGetSurfaceInfo(surface);
        ?? obj = new Object();
        int i2 = nativeGetSurfaceInfo[0];
        int i10 = nativeGetSurfaceInfo[1];
        int i11 = nativeGetSurfaceInfo[2];
        return obj;
    }

    private static native int[] nativeGetSurfaceInfo(Surface surface);
}

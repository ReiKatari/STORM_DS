package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import j0.k1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class ExcludedSupportedSizesQuirk implements k1 {
    public static boolean b() {
        if ("Nokia".equalsIgnoreCase(Build.BRAND)) {
            String str = Build.DEVICE;
            if ("B2N".equalsIgnoreCase(str) || "B2N_sprout".equalsIgnoreCase(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean c() {
        if ("SAMSUNG".equalsIgnoreCase(Build.BRAND) && "a05s".equalsIgnoreCase(Build.DEVICE) && Build.MODEL.toUpperCase().contains("SM-A057")) {
            return true;
        }
        return false;
    }

    public static boolean d() {
        if ("SAMSUNG".equalsIgnoreCase(Build.BRAND) && "J7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27) {
            return true;
        }
        return false;
    }

    public static boolean e() {
        if ("SAMSUNG".equalsIgnoreCase(Build.BRAND) && "ON7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27) {
            return true;
        }
        return false;
    }
}

package i3;

import android.graphics.Bitmap;
import android.os.Build;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final Bitmap f6630a;

    public f(Bitmap bitmap) {
        this.f6630a = bitmap;
    }

    public final int a() {
        Bitmap.Config config;
        Bitmap.Config config2;
        Bitmap.Config config3 = this.f6630a.getConfig();
        config3.getClass();
        if (config3 == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config3 == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config3 != Bitmap.Config.ARGB_4444) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 26) {
                config2 = Bitmap.Config.RGBA_F16;
                if (config3 == config2) {
                    return 3;
                }
            }
            if (i2 >= 26) {
                config = Bitmap.Config.HARDWARE;
                if (config3 == config) {
                    return 4;
                }
                return 0;
            }
            return 0;
        }
        return 0;
    }
}

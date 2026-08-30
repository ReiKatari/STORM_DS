package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nh  reason: default package */
/* loaded from: classes.dex */
public final class nh {
    public final Bitmap a;

    public nh(Bitmap bitmap) {
        this.a = bitmap;
    }

    public final int a() {
        Bitmap.Config config;
        Bitmap.Config config2;
        Bitmap.Config config3 = this.a.getConfig();
        config3.getClass();
        if (config3 == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config3 == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config3 != Bitmap.Config.ARGB_4444) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                config2 = Bitmap.Config.RGBA_F16;
                if (config3 == config2) {
                    return 3;
                }
            }
            if (i >= 26) {
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

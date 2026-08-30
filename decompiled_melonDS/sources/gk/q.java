package gk;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class q {
    public static /* bridge */ /* synthetic */ Bitmap.Config c() {
        return Bitmap.Config.RGBA_F16;
    }

    public static /* bridge */ /* synthetic */ Bitmap d(int i2, int i10, Bitmap.Config config, ColorSpace colorSpace) {
        return Bitmap.createBitmap((DisplayMetrics) null, i2, i10, config, true, colorSpace);
    }

    public static /* bridge */ /* synthetic */ Bitmap.Config y() {
        return Bitmap.Config.HARDWARE;
    }
}

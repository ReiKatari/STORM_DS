package f1;

import android.content.Context;
import android.widget.EdgeEffect;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class l {
    public static EdgeEffect a(Context context) {
        try {
            return new EdgeEffect(context, null);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static float b(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static float c(EdgeEffect edgeEffect, float f8, float f10) {
        try {
            return edgeEffect.onPullDistance(f8, f10);
        } catch (Throwable unused) {
            edgeEffect.onPull(f8, f10);
            return 0.0f;
        }
    }
}

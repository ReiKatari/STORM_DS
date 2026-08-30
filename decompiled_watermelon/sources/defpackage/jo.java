package defpackage;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jo  reason: default package */
/* loaded from: classes.dex */
public abstract class jo {
    public static final LinearInterpolator a = new LinearInterpolator();
    public static final x42 b = new x42(1);
    public static final x42 c = new x42(0);
    public static final x42 d = new x42(x42.e);

    static {
        new DecelerateInterpolator();
    }

    public static float a(float f, float f2, float f3) {
        return b31.a(f2, f, f3, f);
    }

    public static float b(float f, float f2, float f3, float f4, float f5) {
        if (f5 <= f3) {
            return f;
        }
        if (f5 >= f4) {
            return f2;
        }
        return a(f, f2, (f5 - f3) / (f4 - f3));
    }

    public static int c(float f, int i, int i2) {
        return Math.round(f * (i2 - i)) + i;
    }
}

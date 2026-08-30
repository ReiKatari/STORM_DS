package u9;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import w.d;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final LinearInterpolator f13510a = new LinearInterpolator();

    /* renamed from: b  reason: collision with root package name */
    public static final t6.a f13511b = new t6.a(1);

    /* renamed from: c  reason: collision with root package name */
    public static final t6.a f13512c = new t6.a(0);

    /* renamed from: d  reason: collision with root package name */
    public static final t6.a f13513d = new t6.a(t6.a.f13132e);

    static {
        new DecelerateInterpolator();
    }

    public static float a(float f8, float f10, float f11) {
        return d.a(f10, f8, f11, f8);
    }

    public static float b(float f8, float f10, float f11, float f12, float f13) {
        if (f13 <= f11) {
            return f8;
        }
        if (f13 >= f12) {
            return f10;
        }
        return a(f8, f10, (f13 - f11) / (f12 - f11));
    }

    public static int c(float f8, int i2, int i10) {
        return Math.round(f8 * (i10 - i2)) + i2;
    }
}

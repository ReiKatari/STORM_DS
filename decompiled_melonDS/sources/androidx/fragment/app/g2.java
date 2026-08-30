package androidx.fragment.app;

import android.view.View;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g2 {
    public static i2 a(View view) {
        view.getClass();
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return i2.INVISIBLE;
        }
        return b(view.getVisibility());
    }

    public static i2 b(int i2) {
        if (i2 != 0) {
            if (i2 != 4) {
                if (i2 == 8) {
                    return i2.GONE;
                }
                a0.j.h(w.d.l(i2, "Unknown visibility "));
                return null;
            }
            return i2.INVISIBLE;
        }
        return i2.VISIBLE;
    }
}

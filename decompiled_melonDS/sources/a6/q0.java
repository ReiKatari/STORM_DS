package a6;

import android.view.View;
import android.view.WindowInsets;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class q0 {
    public static i2 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        i2 g10 = i2.g(null, rootWindowInsets);
        d2 d2Var = g10.f479a;
        d2Var.r(g10);
        d2Var.d(view.getRootView());
        return g10;
    }

    public static void b(View view, int i2, int i10) {
        view.setScrollIndicators(i2, i10);
    }
}

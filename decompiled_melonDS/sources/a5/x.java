package a5;

import android.graphics.Insets;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static final x f437a = new Object();

    public final int a(Window window) {
        WindowMetrics currentWindowMetrics = window.getWindowManager().getCurrentWindowMetrics();
        Insets insets = currentWindowMetrics.getWindowInsets().getInsets(WindowInsets.Type.systemBars());
        return currentWindowMetrics.getBounds().height() - (insets.top + insets.bottom);
    }

    public final void b(WindowManager.LayoutParams layoutParams, int i2) {
        layoutParams.setFitInsetsSides(i2);
    }

    public final void c(WindowManager.LayoutParams layoutParams, int i2) {
        layoutParams.setFitInsetsTypes(i2);
    }
}

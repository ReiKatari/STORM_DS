package a6;

import android.graphics.Insets;
import android.view.WindowInsets;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c2 extends b2 {

    /* renamed from: s  reason: collision with root package name */
    public static final i2 f446s;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f446s = i2.g(null, windowInsets);
    }

    public c2(i2 i2Var, WindowInsets windowInsets) {
        super(i2Var, windowInsets);
    }

    @Override // a6.a2, a6.w1, a6.d2
    public q5.b f(int i2) {
        Insets insets;
        insets = this.f527c.getInsets(h2.a(i2));
        return q5.b.d(insets);
    }

    @Override // a6.a2, a6.w1, a6.d2
    public q5.b g(int i2) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.f527c.getInsetsIgnoringVisibility(h2.a(i2));
        return q5.b.d(insetsIgnoringVisibility);
    }

    @Override // a6.a2, a6.w1, a6.d2
    public boolean p(int i2) {
        boolean isVisible;
        isVisible = this.f527c.isVisible(h2.a(i2));
        return isVisible;
    }
}
